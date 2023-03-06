

# FieldTransform

Describes the difference between two Streams.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**transformType** | [**TransformTypeEnum**](#TransformTypeEnum) |  |  |
|**fieldName** | **List&lt;String&gt;** | A field name is a list of strings that form the path to the field. |  |
|**breaking** | **Boolean** |  |  |
|**addField** | [**FieldAdd**](FieldAdd.md) |  |  [optional] |
|**removeField** | [**FieldRemove**](FieldRemove.md) |  |  [optional] |
|**updateFieldSchema** | [**FieldSchemaUpdate**](FieldSchemaUpdate.md) |  |  [optional] |



## Enum: TransformTypeEnum

| Name | Value |
|---- | -----|
| ADD_FIELD | &quot;add_field&quot; |
| REMOVE_FIELD | &quot;remove_field&quot; |
| UPDATE_FIELD_SCHEMA | &quot;update_field_schema&quot; |



