

# DestinationDefinitionRead


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**destinationDefinitionId** | **UUID** |  |  |
|**name** | **String** |  |  |
|**dockerRepository** | **String** |  |  |
|**dockerImageTag** | **String** |  |  |
|**documentationUrl** | **URI** |  |  |
|**icon** | **String** |  |  [optional] |
|**protocolVersion** | **String** | The Airbyte Protocol version supported by the connector |  [optional] |
|**releaseStage** | **ReleaseStage** |  |  [optional] |
|**releaseDate** | **LocalDate** | The date when this connector was first released, in yyyy-mm-dd format. |  [optional] |
|**resourceRequirements** | [**ActorDefinitionResourceRequirements**](ActorDefinitionResourceRequirements.md) |  |  [optional] |
|**supportsDbt** | **Boolean** | an optional flag indicating whether DBT is used in the normalization. If the flag value is NULL - DBT is not used. |  |
|**normalizationConfig** | [**NormalizationDestinationDefinitionConfig**](NormalizationDestinationDefinitionConfig.md) |  |  |



