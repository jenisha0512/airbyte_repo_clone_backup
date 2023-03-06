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


package io.airbyte.api.client.model.generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.airbyte.api.client.model.generated.ConnectionScheduleData;
import io.airbyte.api.client.model.generated.ConnectionScheduleType;
import io.airbyte.api.client.model.generated.ConnectionStatus;
import io.airbyte.api.client.model.generated.DestinationSnippetRead;
import io.airbyte.api.client.model.generated.JobStatus;
import io.airbyte.api.client.model.generated.SchemaChange;
import io.airbyte.api.client.model.generated.SourceSnippetRead;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for WebBackendConnectionListItem
 */
public class WebBackendConnectionListItemTest {
    private final WebBackendConnectionListItem model = new WebBackendConnectionListItem();

    /**
     * Model tests for WebBackendConnectionListItem
     */
    @Test
    public void testWebBackendConnectionListItem() {
        // TODO: test WebBackendConnectionListItem
    }

    /**
     * Test the property 'connectionId'
     */
    @Test
    public void connectionIdTest() {
        // TODO: test connectionId
    }

    /**
     * Test the property 'name'
     */
    @Test
    public void nameTest() {
        // TODO: test name
    }

    /**
     * Test the property 'scheduleType'
     */
    @Test
    public void scheduleTypeTest() {
        // TODO: test scheduleType
    }

    /**
     * Test the property 'scheduleData'
     */
    @Test
    public void scheduleDataTest() {
        // TODO: test scheduleData
    }

    /**
     * Test the property 'status'
     */
    @Test
    public void statusTest() {
        // TODO: test status
    }

    /**
     * Test the property 'source'
     */
    @Test
    public void sourceTest() {
        // TODO: test source
    }

    /**
     * Test the property 'destination'
     */
    @Test
    public void destinationTest() {
        // TODO: test destination
    }

    /**
     * Test the property 'latestSyncJobCreatedAt'
     */
    @Test
    public void latestSyncJobCreatedAtTest() {
        // TODO: test latestSyncJobCreatedAt
    }

    /**
     * Test the property 'latestSyncJobStatus'
     */
    @Test
    public void latestSyncJobStatusTest() {
        // TODO: test latestSyncJobStatus
    }

    /**
     * Test the property 'isSyncing'
     */
    @Test
    public void isSyncingTest() {
        // TODO: test isSyncing
    }

    /**
     * Test the property 'schemaChange'
     */
    @Test
    public void schemaChangeTest() {
        // TODO: test schemaChange
    }

}
