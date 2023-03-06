

# OAuth2Specification

An object containing any metadata needed to describe this connector's Oauth flow

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**rootObject** | **List&lt;Object&gt;** | A list of strings representing a pointer to the root object which contains any oauth parameters in the ConnectorSpecification. Examples: if oauth parameters were contained inside the top level, rootObject&#x3D;[] If they were nested inside another object {&#39;credentials&#39;: {&#39;app_id&#39; etc...}, rootObject&#x3D;[&#39;credentials&#39;] If they were inside a oneOf {&#39;switch&#39;: {oneOf: [{client_id...}, {non_oauth_param]}},  rootObject&#x3D;[&#39;switch&#39;, 0]  |  |
|**oauthFlowInitParameters** | **List&lt;List&lt;String&gt;&gt;** | Pointers to the fields in the rootObject needed to obtain the initial refresh/access tokens for the OAuth flow. Each inner array represents the path in the rootObject of the referenced field. For example. Assume the rootObject contains params &#39;app_secret&#39;, &#39;app_id&#39; which are needed to get the initial refresh token. If they are not nested in the rootObject, then the array would look like this [[&#39;app_secret&#39;], [&#39;app_id&#39;]] If they are nested inside an object called &#39;auth_params&#39; then this array would be [[&#39;auth_params&#39;, &#39;app_secret&#39;], [&#39;auth_params&#39;, &#39;app_id&#39;]] |  |
|**oauthFlowOutputParameters** | **List&lt;List&lt;String&gt;&gt;** | Pointers to the fields in the rootObject which can be populated from successfully completing the oauth flow using the init parameters. This is typically a refresh/access token. Each inner array represents the path in the rootObject of the referenced field. |  |



