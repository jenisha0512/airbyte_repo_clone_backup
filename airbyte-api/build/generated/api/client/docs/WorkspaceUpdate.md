

# WorkspaceUpdate

Used to apply a patch-style update to a workspace, which means that null properties remain unchanged

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**workspaceId** | **UUID** |  |  |
|**email** | **String** |  |  [optional] |
|**initialSetupComplete** | **Boolean** |  |  [optional] |
|**displaySetupWizard** | **Boolean** |  |  [optional] |
|**anonymousDataCollection** | **Boolean** |  |  [optional] |
|**news** | **Boolean** |  |  [optional] |
|**securityUpdates** | **Boolean** |  |  [optional] |
|**notifications** | [**List&lt;Notification&gt;**](Notification.md) |  |  [optional] |
|**defaultGeography** | **Geography** |  |  [optional] |
|**webhookConfigs** | [**List&lt;WebhookConfigWrite&gt;**](WebhookConfigWrite.md) |  |  [optional] |



