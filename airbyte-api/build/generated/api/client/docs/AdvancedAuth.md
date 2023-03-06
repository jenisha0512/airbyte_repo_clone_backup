

# AdvancedAuth


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**authFlowType** | [**AuthFlowTypeEnum**](#AuthFlowTypeEnum) |  |  [optional] |
|**predicateKey** | **List&lt;String&gt;** | Json Path to a field in the connectorSpecification that should exist for the advanced auth to be applicable. |  [optional] |
|**predicateValue** | **String** | Value of the predicate_key fields for the advanced auth to be applicable. |  [optional] |
|**oauthConfigSpecification** | [**OAuthConfigSpecification**](OAuthConfigSpecification.md) |  |  [optional] |



## Enum: AuthFlowTypeEnum

| Name | Value |
|---- | -----|
| OAUTH2_0 | &quot;oauth2.0&quot; |
| OAUTH1_0 | &quot;oauth1.0&quot; |



