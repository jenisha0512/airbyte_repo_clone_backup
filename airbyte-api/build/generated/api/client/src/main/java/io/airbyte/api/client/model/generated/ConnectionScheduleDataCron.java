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
 * ConnectionScheduleDataCron
 */
@JsonPropertyOrder({
  ConnectionScheduleDataCron.JSON_PROPERTY_CRON_EXPRESSION,
  ConnectionScheduleDataCron.JSON_PROPERTY_CRON_TIME_ZONE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-28T19:52:03.511752+05:30[Asia/Kolkata]")
public class ConnectionScheduleDataCron {
  public static final String JSON_PROPERTY_CRON_EXPRESSION = "cronExpression";
  private String cronExpression;

  public static final String JSON_PROPERTY_CRON_TIME_ZONE = "cronTimeZone";
  private String cronTimeZone;

  public ConnectionScheduleDataCron() { 
  }

  public ConnectionScheduleDataCron cronExpression(String cronExpression) {
    this.cronExpression = cronExpression;
    return this;
  }

   /**
   * Get cronExpression
   * @return cronExpression
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CRON_EXPRESSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCronExpression() {
    return cronExpression;
  }


  @JsonProperty(JSON_PROPERTY_CRON_EXPRESSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCronExpression(String cronExpression) {
    this.cronExpression = cronExpression;
  }


  public ConnectionScheduleDataCron cronTimeZone(String cronTimeZone) {
    this.cronTimeZone = cronTimeZone;
    return this;
  }

   /**
   * Get cronTimeZone
   * @return cronTimeZone
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CRON_TIME_ZONE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCronTimeZone() {
    return cronTimeZone;
  }


  @JsonProperty(JSON_PROPERTY_CRON_TIME_ZONE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCronTimeZone(String cronTimeZone) {
    this.cronTimeZone = cronTimeZone;
  }


  /**
   * Return true if this ConnectionScheduleData_cron object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectionScheduleDataCron connectionScheduleDataCron = (ConnectionScheduleDataCron) o;
    return Objects.equals(this.cronExpression, connectionScheduleDataCron.cronExpression) &&
        Objects.equals(this.cronTimeZone, connectionScheduleDataCron.cronTimeZone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cronExpression, cronTimeZone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectionScheduleDataCron {\n");
    sb.append("    cronExpression: ").append(toIndentedString(cronExpression)).append("\n");
    sb.append("    cronTimeZone: ").append(toIndentedString(cronTimeZone)).append("\n");
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
