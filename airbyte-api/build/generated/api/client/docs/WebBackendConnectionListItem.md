

# WebBackendConnectionListItem

Information about a connection that shows up in the connection list view.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**connectionId** | **UUID** |  |  |
|**name** | **String** |  |  |
|**scheduleType** | **ConnectionScheduleType** |  |  [optional] |
|**scheduleData** | [**ConnectionScheduleData**](ConnectionScheduleData.md) |  |  [optional] |
|**status** | **ConnectionStatus** |  |  |
|**source** | [**SourceSnippetRead**](SourceSnippetRead.md) |  |  |
|**destination** | [**DestinationSnippetRead**](DestinationSnippetRead.md) |  |  |
|**latestSyncJobCreatedAt** | **Long** | epoch time of the latest sync job. null if no sync job has taken place. |  [optional] |
|**latestSyncJobStatus** | **JobStatus** |  |  [optional] |
|**isSyncing** | **Boolean** |  |  |
|**schemaChange** | **SchemaChange** |  |  |



