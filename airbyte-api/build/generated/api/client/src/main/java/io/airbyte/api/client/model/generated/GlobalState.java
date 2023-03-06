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
import io.airbyte.api.client.model.generated.StreamState;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * GlobalState
 */
@JsonPropertyOrder({
  GlobalState.JSON_PROPERTY_SHARED_STATE,
  GlobalState.JSON_PROPERTY_STREAM_STATES
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-28T19:52:03.511752+05:30[Asia/Kolkata]")
public class GlobalState {
  public static final String JSON_PROPERTY_SHARED_STATE = "shared_state";
  private com.fasterxml.jackson.databind.JsonNode sharedState;

  public static final String JSON_PROPERTY_STREAM_STATES = "streamStates";
  private List<StreamState> streamStates = new ArrayList<>();

  public GlobalState() { 
  }

  public GlobalState sharedState(com.fasterxml.jackson.databind.JsonNode sharedState) {
    this.sharedState = sharedState;
    return this;
  }

   /**
   * Get sharedState
   * @return sharedState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SHARED_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public com.fasterxml.jackson.databind.JsonNode getSharedState() {
    return sharedState;
  }


  @JsonProperty(JSON_PROPERTY_SHARED_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSharedState(com.fasterxml.jackson.databind.JsonNode sharedState) {
    this.sharedState = sharedState;
  }


  public GlobalState streamStates(List<StreamState> streamStates) {
    this.streamStates = streamStates;
    return this;
  }

  public GlobalState addStreamStatesItem(StreamState streamStatesItem) {
    this.streamStates.add(streamStatesItem);
    return this;
  }

   /**
   * Get streamStates
   * @return streamStates
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_STREAM_STATES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<StreamState> getStreamStates() {
    return streamStates;
  }


  @JsonProperty(JSON_PROPERTY_STREAM_STATES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStreamStates(List<StreamState> streamStates) {
    this.streamStates = streamStates;
  }


  /**
   * Return true if this GlobalState object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GlobalState globalState = (GlobalState) o;
    return Objects.equals(this.sharedState, globalState.sharedState) &&
        Objects.equals(this.streamStates, globalState.streamStates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sharedState, streamStates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GlobalState {\n");
    sb.append("    sharedState: ").append(toIndentedString(sharedState)).append("\n");
    sb.append("    streamStates: ").append(toIndentedString(streamStates)).append("\n");
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

