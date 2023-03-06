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
import io.airbyte.api.client.model.generated.NotificationType;
import io.airbyte.api.client.model.generated.SlackNotificationConfiguration;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Notification
 */
@JsonPropertyOrder({
  Notification.JSON_PROPERTY_NOTIFICATION_TYPE,
  Notification.JSON_PROPERTY_SEND_ON_SUCCESS,
  Notification.JSON_PROPERTY_SEND_ON_FAILURE,
  Notification.JSON_PROPERTY_SLACK_CONFIGURATION,
  Notification.JSON_PROPERTY_CUSTOMERIO_CONFIGURATION
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-28T19:52:03.511752+05:30[Asia/Kolkata]")
public class Notification {
  public static final String JSON_PROPERTY_NOTIFICATION_TYPE = "notificationType";
  private NotificationType notificationType;

  public static final String JSON_PROPERTY_SEND_ON_SUCCESS = "sendOnSuccess";
  private Boolean sendOnSuccess = false;

  public static final String JSON_PROPERTY_SEND_ON_FAILURE = "sendOnFailure";
  private Boolean sendOnFailure = true;

  public static final String JSON_PROPERTY_SLACK_CONFIGURATION = "slackConfiguration";
  private SlackNotificationConfiguration slackConfiguration;

  public static final String JSON_PROPERTY_CUSTOMERIO_CONFIGURATION = "customerioConfiguration";
  private Object customerioConfiguration;

  public Notification() { 
  }

  public Notification notificationType(NotificationType notificationType) {
    this.notificationType = notificationType;
    return this;
  }

   /**
   * Get notificationType
   * @return notificationType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_NOTIFICATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public NotificationType getNotificationType() {
    return notificationType;
  }


  @JsonProperty(JSON_PROPERTY_NOTIFICATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNotificationType(NotificationType notificationType) {
    this.notificationType = notificationType;
  }


  public Notification sendOnSuccess(Boolean sendOnSuccess) {
    this.sendOnSuccess = sendOnSuccess;
    return this;
  }

   /**
   * Get sendOnSuccess
   * @return sendOnSuccess
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SEND_ON_SUCCESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getSendOnSuccess() {
    return sendOnSuccess;
  }


  @JsonProperty(JSON_PROPERTY_SEND_ON_SUCCESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSendOnSuccess(Boolean sendOnSuccess) {
    this.sendOnSuccess = sendOnSuccess;
  }


  public Notification sendOnFailure(Boolean sendOnFailure) {
    this.sendOnFailure = sendOnFailure;
    return this;
  }

   /**
   * Get sendOnFailure
   * @return sendOnFailure
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SEND_ON_FAILURE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getSendOnFailure() {
    return sendOnFailure;
  }


  @JsonProperty(JSON_PROPERTY_SEND_ON_FAILURE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSendOnFailure(Boolean sendOnFailure) {
    this.sendOnFailure = sendOnFailure;
  }


  public Notification slackConfiguration(SlackNotificationConfiguration slackConfiguration) {
    this.slackConfiguration = slackConfiguration;
    return this;
  }

   /**
   * Get slackConfiguration
   * @return slackConfiguration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SLACK_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SlackNotificationConfiguration getSlackConfiguration() {
    return slackConfiguration;
  }


  @JsonProperty(JSON_PROPERTY_SLACK_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSlackConfiguration(SlackNotificationConfiguration slackConfiguration) {
    this.slackConfiguration = slackConfiguration;
  }


  public Notification customerioConfiguration(Object customerioConfiguration) {
    this.customerioConfiguration = customerioConfiguration;
    return this;
  }

   /**
   * Get customerioConfiguration
   * @return customerioConfiguration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CUSTOMERIO_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getCustomerioConfiguration() {
    return customerioConfiguration;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOMERIO_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomerioConfiguration(Object customerioConfiguration) {
    this.customerioConfiguration = customerioConfiguration;
  }


  /**
   * Return true if this Notification object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Notification notification = (Notification) o;
    return Objects.equals(this.notificationType, notification.notificationType) &&
        Objects.equals(this.sendOnSuccess, notification.sendOnSuccess) &&
        Objects.equals(this.sendOnFailure, notification.sendOnFailure) &&
        Objects.equals(this.slackConfiguration, notification.slackConfiguration) &&
        Objects.equals(this.customerioConfiguration, notification.customerioConfiguration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notificationType, sendOnSuccess, sendOnFailure, slackConfiguration, customerioConfiguration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Notification {\n");
    sb.append("    notificationType: ").append(toIndentedString(notificationType)).append("\n");
    sb.append("    sendOnSuccess: ").append(toIndentedString(sendOnSuccess)).append("\n");
    sb.append("    sendOnFailure: ").append(toIndentedString(sendOnFailure)).append("\n");
    sb.append("    slackConfiguration: ").append(toIndentedString(slackConfiguration)).append("\n");
    sb.append("    customerioConfiguration: ").append(toIndentedString(customerioConfiguration)).append("\n");
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

