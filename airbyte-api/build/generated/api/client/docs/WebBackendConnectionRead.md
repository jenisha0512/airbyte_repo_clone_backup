

# WebBackendConnectionRead


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**connectionId** | **UUID** |  |  |
|**name** | **String** |  |  |
|**namespaceDefinition** | **NamespaceDefinitionType** |  |  [optional] |
|**namespaceFormat** | **String** | Used when namespaceDefinition is &#39;customformat&#39;. If blank then behaves like namespaceDefinition &#x3D; &#39;destination&#39;. If \&quot;${SOURCE_NAMESPACE}\&quot; then behaves like namespaceDefinition &#x3D; &#39;source&#39;. |  [optional] |
|**prefix** | **String** | Prefix that will be prepended to the name of each stream when it is written to the destination. |  [optional] |
|**sourceId** | **UUID** |  |  |
|**destinationId** | **UUID** |  |  |
|**syncCatalog** | [**AirbyteCatalog**](AirbyteCatalog.md) |  |  |
|**schedule** | [**ConnectionSchedule**](ConnectionSchedule.md) |  |  [optional] |
|**scheduleType** | **ConnectionScheduleType** |  |  [optional] |
|**scheduleData** | [**ConnectionScheduleData**](ConnectionScheduleData.md) |  |  [optional] |
|**status** | **ConnectionStatus** |  |  |
|**operationIds** | **List&lt;UUID&gt;** |  |  [optional] |
|**source** | [**SourceRead**](SourceRead.md) |  |  |
|**destination** | [**DestinationRead**](DestinationRead.md) |  |  |
|**operations** | [**List&lt;OperationRead&gt;**](OperationRead.md) |  |  [optional] |
|**latestSyncJobCreatedAt** | **Long** | epoch time of the latest sync job. null if no sync job has taken place. |  [optional] |
|**latestSyncJobStatus** | **JobStatus** |  |  [optional] |
|**isSyncing** | **Boolean** |  |  |
|**resourceRequirements** | [**ResourceRequirements**](ResourceRequirements.md) |  |  [optional] |
|**catalogId** | **UUID** |  |  [optional] |
|**catalogDiff** | [**CatalogDiff**](CatalogDiff.md) |  |  [optional] |
|**geography** | **Geography** |  |  [optional] |
|**schemaChange** | **SchemaChange** |  |  |
|**notifySchemaChanges** | **Boolean** |  |  |
|**nonBreakingChangesPreference** | **NonBreakingChangesPreference** |  |  |



