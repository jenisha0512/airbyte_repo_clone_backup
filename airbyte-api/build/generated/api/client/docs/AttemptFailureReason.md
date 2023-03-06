

# AttemptFailureReason


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**failureOrigin** | **AttemptFailureOrigin** |  |  [optional] |
|**failureType** | **AttemptFailureType** |  |  [optional] |
|**externalMessage** | **String** |  |  [optional] |
|**internalMessage** | **String** |  |  [optional] |
|**stacktrace** | **String** |  |  [optional] |
|**retryable** | **Boolean** | True if it is known that retrying may succeed, e.g. for a transient failure. False if it is known that a retry will not succeed, e.g. for a configuration issue. If not set, retryable status is not well known. |  [optional] |
|**timestamp** | **Long** |  |  |



