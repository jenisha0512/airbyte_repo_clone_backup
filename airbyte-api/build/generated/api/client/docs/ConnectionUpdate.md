

# ConnectionUpdate

Used to apply a patch-style update to a connection, which means that null properties remain unchanged

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**connectionId** | **UUID** |  |  |
|**namespaceDefinition** | **NamespaceDefinitionType** |  |  [optional] |
|**namespaceFormat** | **String** | Used when namespaceDefinition is &#39;customformat&#39;. If blank then behaves like namespaceDefinition &#x3D; &#39;destination&#39;. If \&quot;${SOURCE_NAMESPACE}\&quot; then behaves like namespaceDefinition &#x3D; &#39;source&#39;. |  [optional] |
|**name** | **String** | Name that will be set to this connection |  [optional] |
|**prefix** | **String** | Prefix that will be prepended to the name of each stream when it is written to the destination. |  [optional] |
|**operationIds** | **List&lt;UUID&gt;** |  |  [optional] |
|**syncCatalog** | [**AirbyteCatalog**](AirbyteCatalog.md) |  |  [optional] |
|**schedule** | [**ConnectionSchedule**](ConnectionSchedule.md) |  |  [optional] |
|**scheduleType** | **ConnectionScheduleType** |  |  [optional] |
|**scheduleData** | [**ConnectionScheduleData**](ConnectionScheduleData.md) |  |  [optional] |
|**status** | **ConnectionStatus** |  |  [optional] |
|**resourceRequirements** | [**ResourceRequirements**](ResourceRequirements.md) |  |  [optional] |
|**sourceCatalogId** | **UUID** |  |  [optional] |
|**geography** | **Geography** |  |  [optional] |
|**notifySchemaChanges** | **Boolean** |  |  [optional] |
|**nonBreakingChangesPreference** | **NonBreakingChangesPreference** |  |  [optional] |
|**breakingChange** | **Boolean** |  |  [optional] |



