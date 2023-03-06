

# DestinationDefinitionSpecificationRead


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**destinationDefinitionId** | **UUID** |  |  |
|**documentationUrl** | **String** |  |  [optional] |
|**connectionSpecification** | **com.fasterxml.jackson.databind.JsonNode** |  |  [optional] |
|**authSpecification** | [**AuthSpecification**](AuthSpecification.md) |  |  [optional] |
|**advancedAuth** | [**AdvancedAuth**](AdvancedAuth.md) |  |  [optional] |
|**jobInfo** | [**SynchronousJobRead**](SynchronousJobRead.md) |  |  |
|**supportedDestinationSyncModes** | **List&lt;DestinationSyncMode&gt;** |  |  [optional] |



