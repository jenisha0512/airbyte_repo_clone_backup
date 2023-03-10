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
import io.airbyte.api.client.model.generated.CustomDestinationDefinitionCreate;
import io.airbyte.api.client.model.generated.DestinationDefinitionIdRequestBody;
import io.airbyte.api.client.model.generated.DestinationDefinitionIdWithWorkspaceId;
import io.airbyte.api.client.model.generated.DestinationDefinitionRead;
import io.airbyte.api.client.model.generated.DestinationDefinitionReadList;
import io.airbyte.api.client.model.generated.DestinationDefinitionUpdate;
import io.airbyte.api.client.model.generated.InvalidInputExceptionInfo;
import io.airbyte.api.client.model.generated.NotFoundKnownExceptionInfo;
import io.airbyte.api.client.model.generated.PrivateDestinationDefinitionRead;
import io.airbyte.api.client.model.generated.PrivateDestinationDefinitionReadList;
import io.airbyte.api.client.model.generated.WorkspaceIdRequestBody;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * API tests for DestinationDefinitionApi
 */
@Ignore
public class DestinationDefinitionApiTest {

    private final DestinationDefinitionApi api = new DestinationDefinitionApi();

    
    /**
     * Creates a custom destinationDefinition for the given workspace
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createCustomDestinationDefinitionTest() throws ApiException {
        CustomDestinationDefinitionCreate customDestinationDefinitionCreate = null;
        DestinationDefinitionRead response = 
        api.createCustomDestinationDefinition(customDestinationDefinitionCreate);
        
        // TODO: test validations
    }
    
    /**
     * Delete a destination definition
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteDestinationDefinitionTest() throws ApiException {
        DestinationDefinitionIdRequestBody destinationDefinitionIdRequestBody = null;
        
        api.deleteDestinationDefinition(destinationDefinitionIdRequestBody);
        
        // TODO: test validations
    }
    
    /**
     * Get destinationDefinition
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDestinationDefinitionTest() throws ApiException {
        DestinationDefinitionIdRequestBody destinationDefinitionIdRequestBody = null;
        DestinationDefinitionRead response = 
        api.getDestinationDefinition(destinationDefinitionIdRequestBody);
        
        // TODO: test validations
    }
    
    /**
     * Get a destinationDefinition that is configured for the given workspace
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDestinationDefinitionForWorkspaceTest() throws ApiException {
        DestinationDefinitionIdWithWorkspaceId destinationDefinitionIdWithWorkspaceId = null;
        DestinationDefinitionRead response = 
        api.getDestinationDefinitionForWorkspace(destinationDefinitionIdWithWorkspaceId);
        
        // TODO: test validations
    }
    
    /**
     * grant a private, non-custom destinationDefinition to a given workspace
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void grantDestinationDefinitionToWorkspaceTest() throws ApiException {
        DestinationDefinitionIdWithWorkspaceId destinationDefinitionIdWithWorkspaceId = null;
        PrivateDestinationDefinitionRead response = 
        api.grantDestinationDefinitionToWorkspace(destinationDefinitionIdWithWorkspaceId);
        
        // TODO: test validations
    }
    
    /**
     * List all the destinationDefinitions the current Airbyte deployment is configured to use
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listDestinationDefinitionsTest() throws ApiException {
        DestinationDefinitionReadList response = 
        api.listDestinationDefinitions();
        
        // TODO: test validations
    }
    
    /**
     * List all the destinationDefinitions the given workspace is configured to use
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listDestinationDefinitionsForWorkspaceTest() throws ApiException {
        WorkspaceIdRequestBody workspaceIdRequestBody = null;
        DestinationDefinitionReadList response = 
        api.listDestinationDefinitionsForWorkspace(workspaceIdRequestBody);
        
        // TODO: test validations
    }
    
    /**
     * List the latest destinationDefinitions Airbyte supports
     *
     * Guaranteed to retrieve the latest information on supported destinations.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listLatestDestinationDefinitionsTest() throws ApiException {
        DestinationDefinitionReadList response = 
        api.listLatestDestinationDefinitions();
        
        // TODO: test validations
    }
    
    /**
     * List all private, non-custom destinationDefinitions, and for each indicate whether the given workspace has a grant for using the definition. Used by admins to view and modify a given workspace&#39;s grants.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listPrivateDestinationDefinitionsTest() throws ApiException {
        WorkspaceIdRequestBody workspaceIdRequestBody = null;
        PrivateDestinationDefinitionReadList response = 
        api.listPrivateDestinationDefinitions(workspaceIdRequestBody);
        
        // TODO: test validations
    }
    
    /**
     * revoke a grant to a private, non-custom destinationDefinition from a given workspace
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void revokeDestinationDefinitionFromWorkspaceTest() throws ApiException {
        DestinationDefinitionIdWithWorkspaceId destinationDefinitionIdWithWorkspaceId = null;
        
        api.revokeDestinationDefinitionFromWorkspace(destinationDefinitionIdWithWorkspaceId);
        
        // TODO: test validations
    }
    
    /**
     * Update destinationDefinition
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateDestinationDefinitionTest() throws ApiException {
        DestinationDefinitionUpdate destinationDefinitionUpdate = null;
        DestinationDefinitionRead response = 
        api.updateDestinationDefinition(destinationDefinitionUpdate);
        
        // TODO: test validations
    }
    
}
