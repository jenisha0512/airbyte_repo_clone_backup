/*
 * Airbyte Configuration API
 * Airbyte Configuration API [https://airbyte.io](https://airbyte.io).  This API is a collection of HTTP RPC-style methods. While it is not a REST API, those familiar with REST should find the conventions of this API recognizable.  Here are some conventions that this API follows: * All endpoints are http POST methods. * All endpoints accept data via `application/json` request bodies. The API does not accept any data via query params. * The naming convention for endpoints is: localhost:8000/{VERSION}/{METHOD_FAMILY}/{METHOD_NAME} e.g. `localhost:8000/v1/connections/create`. * For all `update` methods, the whole object must be passed in, even the fields that did not change.  Authentication (OSS): * When authenticating to the Configuration API, you must use Basic Authentication by setting the Authentication Header to Basic and base64 encoding the username and password (which are `airbyte` and `password` by default - so base64 encoding `airbyte:password` results in `YWlyYnl0ZTpwYXNzd29yZA==`). So the full header reads `'Authorization': \"Basic YWlyYnl0ZTpwYXNzd29yZA==\"` 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: contact@airbyte.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.airbyte.api.client.generated;

import io.airbyte.api.client.invoker.generated.ApiException;
import io.airbyte.api.client.model.generated.CompleteDestinationOAuthRequest;
import io.airbyte.api.client.model.generated.DestinationOauthConsentRequest;
import io.airbyte.api.client.model.generated.InvalidInputExceptionInfo;
import io.airbyte.api.client.model.generated.KnownExceptionInfo;
import io.airbyte.api.client.model.generated.NotFoundKnownExceptionInfo;
import io.airbyte.api.client.model.generated.OAuthConsentRead;
import io.airbyte.api.client.model.generated.SetInstancewideDestinationOauthParamsRequestBody;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * API tests for DestinationOauthApi
 */
@Ignore
public class DestinationOauthApiTest {

    private final DestinationOauthApi api = new DestinationOauthApi();

    
    /**
     * Given a destination def ID generate an access/refresh token etc.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void completeDestinationOAuthTest() throws ApiException {
        CompleteDestinationOAuthRequest completeDestinationOAuthRequest = null;
        Map<String, Object> response = 
        api.completeDestinationOAuth(completeDestinationOAuthRequest);
        
        // TODO: test validations
    }
    
    /**
     * Given a destination connector definition ID, return the URL to the consent screen where to redirect the user to.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDestinationOAuthConsentTest() throws ApiException {
        DestinationOauthConsentRequest destinationOauthConsentRequest = null;
        OAuthConsentRead response = 
        api.getDestinationOAuthConsent(destinationOauthConsentRequest);
        
        // TODO: test validations
    }
    
    /**
     * Sets instancewide variables to be used for the oauth flow when creating this destination. When set, these variables will be injected into a connector&#39;s configuration before any interaction with the connector image itself. This enables running oauth flows with consistent variables e.g: the company&#39;s Google Ads developer_token, client_id, and client_secret without the user having to know about these variables. 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setInstancewideDestinationOauthParamsTest() throws ApiException {
        SetInstancewideDestinationOauthParamsRequestBody setInstancewideDestinationOauthParamsRequestBody = null;
        
        api.setInstancewideDestinationOauthParams(setInstancewideDestinationOauthParamsRequestBody);
        
        // TODO: test validations
    }
    
}
