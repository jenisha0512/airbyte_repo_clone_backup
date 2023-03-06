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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * WebhookConfigWrite
 */
@JsonPropertyOrder({
  WebhookConfigWrite.JSON_PROPERTY_NAME,
  WebhookConfigWrite.JSON_PROPERTY_AUTH_TOKEN,
  WebhookConfigWrite.JSON_PROPERTY_VALIDATION_URL
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-28T19:52:03.511752+05:30[Asia/Kolkata]")
public class WebhookConfigWrite {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_AUTH_TOKEN = "authToken";
  private String authToken;

  public static final String JSON_PROPERTY_VALIDATION_URL = "validationUrl";
  private String validationUrl;

  public WebhookConfigWrite() { 
  }

  public WebhookConfigWrite name(String name) {
    this.name = name;
    return this;
  }

   /**
   * human readable name for this webhook e.g. for UI display.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "human readable name for this webhook e.g. for UI display.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public WebhookConfigWrite authToken(String authToken) {
    this.authToken = authToken;
    return this;
  }

   /**
   * an auth token, to be passed as the value for an HTTP Authorization header.
   * @return authToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "an auth token, to be passed as the value for an HTTP Authorization header.")
  @JsonProperty(JSON_PROPERTY_AUTH_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAuthToken() {
    return authToken;
  }


  @JsonProperty(JSON_PROPERTY_AUTH_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthToken(String authToken) {
    this.authToken = authToken;
  }


  public WebhookConfigWrite validationUrl(String validationUrl) {
    this.validationUrl = validationUrl;
    return this;
  }

   /**
   * if supplied, the webhook config will be validated by checking that this URL returns a 2xx response.
   * @return validationUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "if supplied, the webhook config will be validated by checking that this URL returns a 2xx response.")
  @JsonProperty(JSON_PROPERTY_VALIDATION_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getValidationUrl() {
    return validationUrl;
  }


  @JsonProperty(JSON_PROPERTY_VALIDATION_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValidationUrl(String validationUrl) {
    this.validationUrl = validationUrl;
  }


  /**
   * Return true if this WebhookConfigWrite object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookConfigWrite webhookConfigWrite = (WebhookConfigWrite) o;
    return Objects.equals(this.name, webhookConfigWrite.name) &&
        Objects.equals(this.authToken, webhookConfigWrite.authToken) &&
        Objects.equals(this.validationUrl, webhookConfigWrite.validationUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, authToken, validationUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookConfigWrite {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    authToken: ").append(toIndentedString(authToken)).append("\n");
    sb.append("    validationUrl: ").append(toIndentedString(validationUrl)).append("\n");
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
