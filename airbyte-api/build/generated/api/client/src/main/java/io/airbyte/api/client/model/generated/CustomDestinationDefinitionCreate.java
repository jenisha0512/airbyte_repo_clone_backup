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

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.airbyte.api.client.model.generated.DestinationDefinitionCreate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CustomDestinationDefinitionCreate
 */
@JsonPropertyOrder({
  CustomDestinationDefinitionCreate.JSON_PROPERTY_WORKSPACE_ID,
  CustomDestinationDefinitionCreate.JSON_PROPERTY_DESTINATION_DEFINITION
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-28T19:52:03.511752+05:30[Asia/Kolkata]")
public class CustomDestinationDefinitionCreate {
  public static final String JSON_PROPERTY_WORKSPACE_ID = "workspaceId";
  private UUID workspaceId;

  public static final String JSON_PROPERTY_DESTINATION_DEFINITION = "destinationDefinition";
  private DestinationDefinitionCreate destinationDefinition;

  public CustomDestinationDefinitionCreate() { 
  }

  public CustomDestinationDefinitionCreate workspaceId(UUID workspaceId) {
    this.workspaceId = workspaceId;
    return this;
  }

   /**
   * Get workspaceId
   * @return workspaceId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_WORKSPACE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getWorkspaceId() {
    return workspaceId;
  }


  @JsonProperty(JSON_PROPERTY_WORKSPACE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setWorkspaceId(UUID workspaceId) {
    this.workspaceId = workspaceId;
  }


  public CustomDestinationDefinitionCreate destinationDefinition(DestinationDefinitionCreate destinationDefinition) {
    this.destinationDefinition = destinationDefinition;
    return this;
  }

   /**
   * Get destinationDefinition
   * @return destinationDefinition
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DESTINATION_DEFINITION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public DestinationDefinitionCreate getDestinationDefinition() {
    return destinationDefinition;
  }


  @JsonProperty(JSON_PROPERTY_DESTINATION_DEFINITION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDestinationDefinition(DestinationDefinitionCreate destinationDefinition) {
    this.destinationDefinition = destinationDefinition;
  }


  /**
   * Return true if this CustomDestinationDefinitionCreate object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomDestinationDefinitionCreate customDestinationDefinitionCreate = (CustomDestinationDefinitionCreate) o;
    return Objects.equals(this.workspaceId, customDestinationDefinitionCreate.workspaceId) &&
        Objects.equals(this.destinationDefinition, customDestinationDefinitionCreate.destinationDefinition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workspaceId, destinationDefinition);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomDestinationDefinitionCreate {\n");
    sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
    sb.append("    destinationDefinition: ").append(toIndentedString(destinationDefinition)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

