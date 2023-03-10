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
import io.airbyte.api.client.model.generated.CustomSourceDefinitionCreate;
import io.airbyte.api.client.model.generated.InvalidInputExceptionInfo;
import io.airbyte.api.client.model.generated.NotFoundKnownExceptionInfo;
import io.airbyte.api.client.model.generated.PrivateSourceDefinitionRead;
import io.airbyte.api.client.model.generated.PrivateSourceDefinitionReadList;
import io.airbyte.api.client.model.generated.SourceDefinitionIdRequestBody;
import io.airbyte.api.client.model.generated.SourceDefinitionIdWithWorkspaceId;
import io.airbyte.api.client.model.generated.SourceDefinitionRead;
import io.airbyte.api.client.model.generated.SourceDefinitionReadList;
import io.airbyte.api.client.model.generated.SourceDefinitionUpdate;
import io.airbyte.api.client.model.generated.WorkspaceIdRequestBody;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * API tests for SourceDefinitionApi
 */
@Ignore
public class SourceDefinitionApiTest {

    private final SourceDefinitionApi api = new SourceDefinitionApi();

    
    /**
     * Creates a custom sourceDefinition for the given workspace
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createCustomSourceDefinitionTest() throws ApiException {
        CustomSourceDefinitionCreate customSourceDefinitionCreate = null;
        SourceDefinitionRead response = 
        api.createCustomSourceDefinition(customSourceDefinitionCreate);
        
        // TODO: test validations
    }
    
    /**
     * Delete a source definition
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSourceDefinitionTest() throws ApiException {
        SourceDefinitionIdRequestBody sourceDefinitionIdRequestBody = null;
        
        api.deleteSourceDefinition(sourceDefinitionIdRequestBody);
        
        // TODO: test validations
    }
    
    /**
     * Get source
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSourceDefinitionTest() throws ApiException {
        SourceDefinitionIdRequestBody sourceDefinitionIdRequestBody = null;
        SourceDefinitionRead response = 
        api.getSourceDefinition(sourceDefinitionIdRequestBody);
        
        // TODO: test validations
    }
    
    /**
     * Get a sourceDefinition that is configured for the given workspace
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSourceDefinitionForWorkspaceTest() throws ApiException {
        SourceDefinitionIdWithWorkspaceId sourceDefinitionIdWithWorkspaceId = null;
        SourceDefinitionRead response = 
        api.getSourceDefinitionForWorkspace(sourceDefinitionIdWithWorkspaceId);
        
        // TODO: test validations
    }
    
    /**
     * grant a private, non-custom sourceDefinition to a given workspace
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void grantSourceDefinitionToWorkspaceTest() throws ApiException {
        SourceDefinitionIdWithWorkspaceId sourceDefinitionIdWithWorkspaceId = null;
        PrivateSourceDefinitionRead response = 
        api.grantSourceDefinitionToWorkspace(sourceDefinitionIdWithWorkspaceId);
        
        // TODO: test validations
    }
    
    /**
     * List the latest sourceDefinitions Airbyte supports
     *
     * Guaranteed to retrieve the latest information on supported sources.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listLatestSourceDefinitionsTest() throws ApiException {
        SourceDefinitionReadList response = 
        api.listLatestSourceDefinitions();
        
        // TODO: test validations
    }
    
    /**
     * List all private, non-custom sourceDefinitions, and for each indicate whether the given workspace has a grant for using the definition. Used by admins to view and modify a given workspace&#39;s grants.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listPrivateSourceDefinitionsTest() throws ApiException {
        WorkspaceIdRequestBody workspaceIdRequestBody = null;
        PrivateSourceDefinitionReadList response = 
        api.listPrivateSourceDefinitions(workspaceIdRequestBody);
        
        // TODO: test validations
    }
    
    /**
     * List all the sourceDefinitions the current Airbyte deployment is configured to use
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listSourceDefinitionsTest() throws ApiException {
        SourceDefinitionReadList response = 
        api.listSourceDefinitions();
        
        // TODO: test validations
    }
    
    /**
     * List all the sourceDefinitions the given workspace is configured to use
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listSourceDefinitionsForWorkspaceTest() throws ApiException {
        WorkspaceIdRequestBody workspaceIdRequestBody = null;
        SourceDefinitionReadList response = 
        api.listSourceDefinitionsForWorkspace(workspaceIdRequestBody);
        
        // TODO: test validations
    }
    
    /**
     * revoke a grant to a private, non-custom sourceDefinition from a given workspace
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void revokeSourceDefinitionFromWorkspaceTest() throws ApiException {
        SourceDefinitionIdWithWorkspaceId sourceDefinitionIdWithWorkspaceId = null;
        
        api.revokeSourceDefinitionFromWorkspace(sourceDefinitionIdWithWorkspaceId);
        
        // TODO: test validations
    }
    
    /**
     * Update a sourceDefinition
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateSourceDefinitionTest() throws ApiException {
        SourceDefinitionUpdate sourceDefinitionUpdate = null;
        SourceDefinitionRead response = 
        api.updateSourceDefinition(sourceDefinitionUpdate);
        
        // TODO: test validations
    }
    
}
