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
import io.airbyte.api.client.model.generated.ActorCatalogWithUpdatedAt;
import io.airbyte.api.client.model.generated.CheckConnectionRead;
import io.airbyte.api.client.model.generated.DiscoverCatalogResult;
import io.airbyte.api.client.model.generated.InvalidInputExceptionInfo;
import io.airbyte.api.client.model.generated.NotFoundKnownExceptionInfo;
import io.airbyte.api.client.model.generated.SourceCloneRequestBody;
import io.airbyte.api.client.model.generated.SourceCreate;
import io.airbyte.api.client.model.generated.SourceDiscoverSchemaRead;
import io.airbyte.api.client.model.generated.SourceDiscoverSchemaRequestBody;
import io.airbyte.api.client.model.generated.SourceDiscoverSchemaWriteRequestBody;
import io.airbyte.api.client.model.generated.SourceIdRequestBody;
import io.airbyte.api.client.model.generated.SourceRead;
import io.airbyte.api.client.model.generated.SourceReadList;
import io.airbyte.api.client.model.generated.SourceSearch;
import io.airbyte.api.client.model.generated.SourceUpdate;
import io.airbyte.api.client.model.generated.WorkspaceIdRequestBody;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * API tests for SourceApi
 */
@Ignore
public class SourceApiTest {

    private final SourceApi api = new SourceApi();

    
    /**
     * Check connection to the source
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void checkConnectionToSourceTest() throws ApiException {
        SourceIdRequestBody sourceIdRequestBody = null;
        CheckConnectionRead response = 
        api.checkConnectionToSource(sourceIdRequestBody);
        
        // TODO: test validations
    }
    
    /**
     * Check connection for a proposed update to a source
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void checkConnectionToSourceForUpdateTest() throws ApiException {
        SourceUpdate sourceUpdate = null;
        CheckConnectionRead response = 
        api.checkConnectionToSourceForUpdate(sourceUpdate);
        
        // TODO: test validations
    }
    
    /**
     * Clone source
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cloneSourceTest() throws ApiException {
        SourceCloneRequestBody sourceCloneRequestBody = null;
        SourceRead response = 
        api.cloneSource(sourceCloneRequestBody);
        
        // TODO: test validations
    }
    
    /**
     * Create a source
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createSourceTest() throws ApiException {
        SourceCreate sourceCreate = null;
        SourceRead response = 
        api.createSource(sourceCreate);
        
        // TODO: test validations
    }
    
    /**
     * Delete a source
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSourceTest() throws ApiException {
        SourceIdRequestBody sourceIdRequestBody = null;
        
        api.deleteSource(sourceIdRequestBody);
        
        // TODO: test validations
    }
    
    /**
     * Discover the schema catalog of the source
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void discoverSchemaForSourceTest() throws ApiException {
        SourceDiscoverSchemaRequestBody sourceDiscoverSchemaRequestBody = null;
        SourceDiscoverSchemaRead response = 
        api.discoverSchemaForSource(sourceDiscoverSchemaRequestBody);
        
        // TODO: test validations
    }
    
    /**
     * Get most recent ActorCatalog for source
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMostRecentSourceActorCatalogTest() throws ApiException {
        SourceIdRequestBody sourceIdRequestBody = null;
        ActorCatalogWithUpdatedAt response = 
        api.getMostRecentSourceActorCatalog(sourceIdRequestBody);
        
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
    public void getSourceTest() throws ApiException {
        SourceIdRequestBody sourceIdRequestBody = null;
        SourceRead response = 
        api.getSource(sourceIdRequestBody);
        
        // TODO: test validations
    }
    
    /**
     * List sources for workspace
     *
     * List sources for workspace. Does not return deleted sources.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listSourcesForWorkspaceTest() throws ApiException {
        WorkspaceIdRequestBody workspaceIdRequestBody = null;
        SourceReadList response = 
        api.listSourcesForWorkspace(workspaceIdRequestBody);
        
        // TODO: test validations
    }
    
    /**
     * Search sources
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchSourcesTest() throws ApiException {
        SourceSearch sourceSearch = null;
        SourceReadList response = 
        api.searchSources(sourceSearch);
        
        // TODO: test validations
    }
    
    /**
     * Update a source
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateSourceTest() throws ApiException {
        SourceUpdate sourceUpdate = null;
        SourceRead response = 
        api.updateSource(sourceUpdate);
        
        // TODO: test validations
    }
    
    /**
     * Should only called from worker, to write result from discover activity back to DB.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void writeDiscoverCatalogResultTest() throws ApiException {
        SourceDiscoverSchemaWriteRequestBody sourceDiscoverSchemaWriteRequestBody = null;
        DiscoverCatalogResult response = 
        api.writeDiscoverCatalogResult(sourceDiscoverSchemaWriteRequestBody);
        
        // TODO: test validations
    }
    
}
