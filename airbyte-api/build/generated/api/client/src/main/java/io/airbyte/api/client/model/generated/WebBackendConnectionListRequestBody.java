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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * WebBackendConnectionListRequestBody
 */
@JsonPropertyOrder({
  WebBackendConnectionListRequestBody.JSON_PROPERTY_WORKSPACE_ID,
  WebBackendConnectionListRequestBody.JSON_PROPERTY_SOURCE_ID,
  WebBackendConnectionListRequestBody.JSON_PROPERTY_DESTINATION_ID
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-28T19:52:03.511752+05:30[Asia/Kolkata]")
public class WebBackendConnectionListRequestBody {
  public static final String JSON_PROPERTY_WORKSPACE_ID = "workspaceId";
  private UUID workspaceId;

  public static final String JSON_PROPERTY_SOURCE_ID = "sourceId";
  private List<UUID> sourceId = null;

  public static final String JSON_PROPERTY_DESTINATION_ID = "destinationId";
  private List<UUID> destinationId = null;

  public WebBackendConnectionListRequestBody() { 
  }

  public WebBackendConnectionListRequestBody workspaceId(UUID workspaceId) {
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


  public WebBackendConnectionListRequestBody sourceId(List<UUID> sourceId) {
    this.sourceId = sourceId;
    return this;
  }

  public WebBackendConnectionListRequestBody addSourceIdItem(UUID sourceIdItem) {
    if (this.sourceId == null) {
      this.sourceId = new ArrayList<>();
    }
    this.sourceId.add(sourceIdItem);
    return this;
  }

   /**
   * Get sourceId
   * @return sourceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UUID> getSourceId() {
    return sourceId;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSourceId(List<UUID> sourceId) {
    this.sourceId = sourceId;
  }


  public WebBackendConnectionListRequestBody destinationId(List<UUID> destinationId) {
    this.destinationId = destinationId;
    return this;
  }

  public WebBackendConnectionListRequestBody addDestinationIdItem(UUID destinationIdItem) {
    if (this.destinationId == null) {
      this.destinationId = new ArrayList<>();
    }
    this.destinationId.add(destinationIdItem);
    return this;
  }

   /**
   * Get destinationId
   * @return destinationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DESTINATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UUID> getDestinationId() {
    return destinationId;
  }


  @JsonProperty(JSON_PROPERTY_DESTINATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDestinationId(List<UUID> destinationId) {
    this.destinationId = destinationId;
  }


  /**
   * Return true if this WebBackendConnectionListRequestBody object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebBackendConnectionListRequestBody webBackendConnectionListRequestBody = (WebBackendConnectionListRequestBody) o;
    return Objects.equals(this.workspaceId, webBackendConnectionListRequestBody.workspaceId) &&
        Objects.equals(this.sourceId, webBackendConnectionListRequestBody.sourceId) &&
        Objects.equals(this.destinationId, webBackendConnectionListRequestBody.destinationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workspaceId, sourceId, destinationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebBackendConnectionListRequestBody {\n");
    sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    destinationId: ").append(toIndentedString(destinationId)).append("\n");
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

