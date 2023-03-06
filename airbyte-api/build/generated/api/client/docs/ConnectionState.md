

# ConnectionState

Contains the state for a connection. The stateType field identifies what type of state it is. Only the field corresponding to that type will be set, the rest will be null. If stateType=not_set, then none of the fields will be set.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**stateType** | **ConnectionStateType** |  |  |
|**connectionId** | **UUID** |  |  |
|**state** | [**com.fasterxml.jackson.databind.JsonNode**](com.fasterxml.jackson.databind.JsonNode.md) |  |  [optional] |
|**streamState** | [**List&lt;StreamState&gt;**](StreamState.md) |  |  [optional] |
|**globalState** | [**GlobalState**](GlobalState.md) |  |  [optional] |



