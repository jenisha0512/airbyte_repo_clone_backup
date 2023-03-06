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
import io.airbyte.api.client.model.generated.AttemptNormalizationStatusReadList;
import io.airbyte.api.client.model.generated.ConnectionState;
import io.airbyte.api.client.model.generated.ConnectionStateCreateOrUpdate;
import io.airbyte.api.client.model.generated.DiscoverCatalogResult;
import io.airbyte.api.client.model.generated.InternalOperationResult;
import io.airbyte.api.client.model.generated.InvalidInputExceptionInfo;
import io.airbyte.api.client.model.generated.JobIdRequestBody;
import io.airbyte.api.client.model.generated.NotFoundKnownExceptionInfo;
import io.airbyte.api.client.model.generated.SaveStatsRequestBody;
import io.airbyte.api.client.model.generated.SetWorkflowInAttemptRequestBody;
import io.airbyte.api.client.model.generated.SourceDiscoverSchemaWriteRequestBody;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * API tests for InternalApi
 */
@Ignore
public class InternalApiTest {

    private final InternalApi api = new InternalApi();

    
    /**
     * Create or update the state for a connection.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createOrUpdateStateTest() throws ApiException {
        ConnectionStateCreateOrUpdate connectionStateCreateOrUpdate = null;
        ConnectionState response = 
        api.createOrUpdateState(connectionStateCreateOrUpdate);
        
        // TODO: test validations
    }
    
    /**
     * Get normalization status to determine if we can bypass normalization phase
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAttemptNormalizationStatusesForJobTest() throws ApiException {
        JobIdRequestBody jobIdRequestBody = null;
        AttemptNormalizationStatusReadList response = 
        api.getAttemptNormalizationStatusesForJob(jobIdRequestBody);
        
        // TODO: test validations
    }
    
    /**
     * For worker to set sync stats of a running attempt.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void saveStatsTest() throws ApiException {
        SaveStatsRequestBody saveStatsRequestBody = null;
        InternalOperationResult response = 
        api.saveStats(saveStatsRequestBody);
        
        // TODO: test validations
    }
    
    /**
     * For worker to register the workflow id in attempt.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setWorkflowInAttemptTest() throws ApiException {
        SetWorkflowInAttemptRequestBody setWorkflowInAttemptRequestBody = null;
        InternalOperationResult response = 
        api.setWorkflowInAttempt(setWorkflowInAttemptRequestBody);
        
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
