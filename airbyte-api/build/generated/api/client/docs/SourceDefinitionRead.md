

# SourceDefinitionRead


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**sourceDefinitionId** | **UUID** |  |  |
|**name** | **String** |  |  |
|**dockerRepository** | **String** |  |  |
|**dockerImageTag** | **String** |  |  |
|**documentationUrl** | **URI** |  |  [optional] |
|**icon** | **String** |  |  [optional] |
|**protocolVersion** | **String** | The Airbyte Protocol version supported by the connector |  [optional] |
|**releaseStage** | **ReleaseStage** |  |  [optional] |
|**releaseDate** | **LocalDate** | The date when this connector was first released, in yyyy-mm-dd format. |  [optional] |
|**sourceType** | [**SourceTypeEnum**](#SourceTypeEnum) |  |  [optional] |
|**resourceRequirements** | [**ActorDefinitionResourceRequirements**](ActorDefinitionResourceRequirements.md) |  |  [optional] |



## Enum: SourceTypeEnum

| Name | Value |
|---- | -----|
| API | &quot;api&quot; |
| FILE | &quot;file&quot; |
| DATABASE | &quot;database&quot; |
| CUSTOM | &quot;custom&quot; |



