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
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * DestinationOauthConsentRequest
 */
@JsonPropertyOrder({
  DestinationOauthConsentRequest.JSON_PROPERTY_DESTINATION_DEFINITION_ID,
  DestinationOauthConsentRequest.JSON_PROPERTY_WORKSPACE_ID,
  DestinationOauthConsentRequest.JSON_PROPERTY_REDIRECT_URL,
  DestinationOauthConsentRequest.JSON_PROPERTY_O_AUTH_INPUT_CONFIGURATION,
  DestinationOauthConsentRequest.JSON_PROPERTY_DESTINATION_ID
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-28T19:52:03.511752+05:30[Asia/Kolkata]")
public class DestinationOauthConsentRequest {
  public static final String JSON_PROPERTY_DESTINATION_DEFINITION_ID = "destinationDefinitionId";
  private UUID destinationDefinitionId;

  public static final String JSON_PROPERTY_WORKSPACE_ID = "workspaceId";
  private UUID workspaceId;

  public static final String JSON_PROPERTY_REDIRECT_URL = "redirectUrl";
  private String redirectUrl;

  public static final String JSON_PROPERTY_O_AUTH_INPUT_CONFIGURATION = "oAuthInputConfiguration";
  private com.fasterxml.jackson.databind.JsonNode oAuthInputConfiguration = null;

  public static final String JSON_PROPERTY_DESTINATION_ID = "destinationId";
  private UUID destinationId;

  public DestinationOauthConsentRequest() { 
  }

  public DestinationOauthConsentRequest destinationDefinitionId(UUID destinationDefinitionId) {
    this.destinationDefinitionId = destinationDefinitionId;
    return this;
  }

   /**
   * Get destinationDefinitionId
   * @return destinationDefinitionId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DESTINATION_DEFINITION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getDestinationDefinitionId() {
    return destinationDefinitionId;
  }


  @JsonProperty(JSON_PROPERTY_DESTINATION_DEFINITION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDestinationDefinitionId(UUID destinationDefinitionId) {
    this.destinationDefinitionId = destinationDefinitionId;
  }


  public DestinationOauthConsentRequest workspaceId(UUID workspaceId) {
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


  public DestinationOauthConsentRequest redirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
    return this;
  }

   /**
   * The url to redirect to after getting the user consent
   * @return redirectUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The url to redirect to after getting the user consent")
  @JsonProperty(JSON_PROPERTY_REDIRECT_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRedirectUrl() {
    return redirectUrl;
  }


  @JsonProperty(JSON_PROPERTY_REDIRECT_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRedirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
  }


  public DestinationOauthConsentRequest oAuthInputConfiguration(com.fasterxml.jackson.databind.JsonNode oAuthInputConfiguration) {
    this.oAuthInputConfiguration = oAuthInputConfiguration;
    return this;
  }

   /**
   * Get oAuthInputConfiguration
   * @return oAuthInputConfiguration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_O_AUTH_INPUT_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public com.fasterxml.jackson.databind.JsonNode getoAuthInputConfiguration() {
    return oAuthInputConfiguration;
  }


  @JsonProperty(JSON_PROPERTY_O_AUTH_INPUT_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setoAuthInputConfiguration(com.fasterxml.jackson.databind.JsonNode oAuthInputConfiguration) {
    this.oAuthInputConfiguration = oAuthInputConfiguration;
  }


  public DestinationOauthConsentRequest destinationId(UUID destinationId) {
    this.destinationId = destinationId;
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

  public UUID getDestinationId() {
    return destinationId;
  }


  @JsonProperty(JSON_PROPERTY_DESTINATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDestinationId(UUID destinationId) {
    this.destinationId = destinationId;
  }


  /**
   * Return true if this DestinationOauthConsentRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DestinationOauthConsentRequest destinationOauthConsentRequest = (DestinationOauthConsentRequest) o;
    return Objects.equals(this.destinationDefinitionId, destinationOauthConsentRequest.destinationDefinitionId) &&
        Objects.equals(this.workspaceId, destinationOauthConsentRequest.workspaceId) &&
        Objects.equals(this.redirectUrl, destinationOauthConsentRequest.redirectUrl) &&
        Objects.equals(this.oAuthInputConfiguration, destinationOauthConsentRequest.oAuthInputConfiguration) &&
        Objects.equals(this.destinationId, destinationOauthConsentRequest.destinationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destinationDefinitionId, workspaceId, redirectUrl, oAuthInputConfiguration, destinationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DestinationOauthConsentRequest {\n");
    sb.append("    destinationDefinitionId: ").append(toIndentedString(destinationDefinitionId)).append("\n");
    sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
    sb.append("    redirectUrl: ").append(toIndentedString(redirectUrl)).append("\n");
    sb.append("    oAuthInputConfiguration: ").append(toIndentedString(oAuthInputConfiguration)).append("\n");
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

