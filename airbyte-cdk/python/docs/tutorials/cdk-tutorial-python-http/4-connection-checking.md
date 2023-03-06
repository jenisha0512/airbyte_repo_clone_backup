# Step 4: Connection Checking

The second operation in the Airbyte Protocol that we'll implement is the `check` operation.

This operation verifies that the input configuration supplied by the user can be used to connect to the underlying data source. Note that this user-supplied configuration has the values described in the `spec.json` filled in. In other words if the `spec.json` said that the source requires a `username` and `password` the config object might be `{ "username": "airbyte", "password": "password123" }`. You should then implement something that returns a json object reporting, given the credentials in the config, whether we were able to connect to the source.

In order to make requests to the API, we need to specify the access.
In our case, this is a fairly trivial check since the API requires no credentials. Instead, let's verify that the user-input `base` currency is a legitimate currency. In `source.py` we'll find the following autogenerated source:

```python
class SourcePythonHttpTutorial(AbstractSource):

    def check_connection(self, logger, config) -> Tuple[bool, any]:
        """
        TODO: Implement a connection check to validate that the user-provided config can be used to connect to the underlying API

        See https://github.com/airbytehq/airbyte/blob/master/airbyte-integrations/connectors/source-stripe/source_stripe/source.py#L232
        for an example.

        :param config:  the user-input config object conforming the connector's spec.json
        :param logger:  logger object
        :return Tuple[bool, any]: (True, None) if the input config can be used to connect to the API successfully, (False, error) otherwise.
        """
        return True, None

...
```

Following the docstring instructions, we'll change the implementation to verify that the input currency is a real currency:

```python
    def check_connection(self, logger, config) -> Tuple[bool, any]:
        accepted_currencies = {"USD", "JPY", "BGN", "CZK", "DKK"}  # assume these are the only allowed currencies
        input_currency = config['base']
        if input_currency not in accepted_currencies:
            return False, f"Input currency {input_currency} is invalid. Please input one of the following currencies: {accepted_currencies}"
        else:
            return True, None
```

Let's test out this implementation by creating two objects: a valid and an invalid config and attempt to give them as input to the connector. For this section, you will need to take the API access key generated earlier and add it to both configs. Because these configs contain secrets, we recommend storing configs which contain secrets in `secrets/config.json` because the `secrets` directory is gitignored by default. For the purpose of this example, a dummy apikey has been setup in `sample_files/config.json`.

```text
echo '{"start_date": "2021-04-01", "base": "USD", "apikey": <your_apikey>}'  > sample_files/config.json
echo '{"start_date": "2021-04-01", "base": "BTC", "apikey": <your_apikey>}'  > sample_files/invalid_config.json
python main.py check --config sample_files/config.json
python main.py check --config sample_files/invalid_config.json
```

You should see output like the following:

```text
> python main.py check --config sample_files/config.json
{"type": "CONNECTION_STATUS", "connectionStatus": {"status": "SUCCEEDED"}}

> python main.py check --config sample_files/invalid_config.json
{"type": "CONNECTION_STATUS", "connectionStatus": {"status": "FAILED", "message": "Input currency BTC is invalid. Please input one of the following currencies: {'DKK', 'USD', 'CZK', 'BGN', 'JPY'}"}}
```

While developing, we recommend storing configs which contain secrets in `secrets/config.json` because the `secrets` directory is gitignored by default.
