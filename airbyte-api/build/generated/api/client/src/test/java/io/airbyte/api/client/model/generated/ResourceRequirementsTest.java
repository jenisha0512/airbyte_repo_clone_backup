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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for ResourceRequirements
 */
public class ResourceRequirementsTest {
    private final ResourceRequirements model = new ResourceRequirements();

    /**
     * Model tests for ResourceRequirements
     */
    @Test
    public void testResourceRequirements() {
        // TODO: test ResourceRequirements
    }

    /**
     * Test the property 'cpuRequest'
     */
    @Test
    public void cpuRequestTest() {
        // TODO: test cpuRequest
    }

    /**
     * Test the property 'cpuLimit'
     */
    @Test
    public void cpuLimitTest() {
        // TODO: test cpuLimit
    }

    /**
     * Test the property 'memoryRequest'
     */
    @Test
    public void memoryRequestTest() {
        // TODO: test memoryRequest
    }

    /**
     * Test the property 'memoryLimit'
     */
    @Test
    public void memoryLimitTest() {
        // TODO: test memoryLimit
    }

}
