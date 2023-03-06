

# SourceDiscoverSchemaRead

Returns the results of a discover catalog job. If the job was not successful, the catalog field will not be present. jobInfo will aways be present and its status be used to determine if the job was successful or not.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**catalog** | [**AirbyteCatalog**](AirbyteCatalog.md) |  |  [optional] |
|**jobInfo** | [**SynchronousJobRead**](SynchronousJobRead.md) |  |  |
|**catalogId** | **UUID** |  |  [optional] |
|**catalogDiff** | [**CatalogDiff**](CatalogDiff.md) |  |  [optional] |
|**breakingChange** | **Boolean** |  |  [optional] |
|**connectionStatus** | **ConnectionStatus** |  |  [optional] |



