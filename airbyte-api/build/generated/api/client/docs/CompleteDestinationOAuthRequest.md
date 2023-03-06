

# CompleteDestinationOAuthRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**destinationDefinitionId** | **UUID** |  |  |
|**workspaceId** | **UUID** |  |  |
|**redirectUrl** | **String** | When completing OAuth flow to gain an access token, some API sometimes requires to verify that the app re-send the redirectUrl that was used when consent was given. |  [optional] |
|**queryParams** | **Map&lt;String, Object&gt;** | The query parameters present in the redirect URL after a user granted consent e.g auth code |  [optional] |
|**oAuthInputConfiguration** | **com.fasterxml.jackson.databind.JsonNode** |  |  [optional] |
|**destinationId** | **UUID** |  |  [optional] |



