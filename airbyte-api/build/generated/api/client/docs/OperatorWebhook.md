

# OperatorWebhook


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**webhookConfigId** | **UUID** | The id of the webhook configs to use from the workspace. |  [optional] |
|**webhookType** | [**WebhookTypeEnum**](#WebhookTypeEnum) |  |  [optional] |
|**dbtCloud** | [**OperatorWebhookDbtCloud**](OperatorWebhookDbtCloud.md) |  |  [optional] |
|**executionUrl** | **String** | DEPRECATED. Populate dbtCloud instead. |  [optional] |
|**executionBody** | **String** | DEPRECATED. Populate dbtCloud instead. |  [optional] |



## Enum: WebhookTypeEnum

| Name | Value |
|---- | -----|
| DBTCLOUD | &quot;dbtCloud&quot; |



