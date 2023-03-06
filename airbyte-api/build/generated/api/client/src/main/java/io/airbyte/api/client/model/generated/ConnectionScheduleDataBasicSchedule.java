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
 * ConnectionScheduleDataBasicSchedule
 */
@JsonPropertyOrder({
  ConnectionScheduleDataBasicSchedule.JSON_PROPERTY_TIME_UNIT,
  ConnectionScheduleDataBasicSchedule.JSON_PROPERTY_UNITS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-28T19:52:03.511752+05:30[Asia/Kolkata]")
public class ConnectionScheduleDataBasicSchedule {
  /**
   * Gets or Sets timeUnit
   */
  public enum TimeUnitEnum {
    MINUTES("minutes"),
    
    HOURS("hours"),
    
    DAYS("days"),
    
    WEEKS("weeks"),
    
    MONTHS("months");

    private String value;

    TimeUnitEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TimeUnitEnum fromValue(String value) {
      for (TimeUnitEnum b : TimeUnitEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TIME_UNIT = "timeUnit";
  private TimeUnitEnum timeUnit;

  public static final String JSON_PROPERTY_UNITS = "units";
  private Long units;

  public ConnectionScheduleDataBasicSchedule() { 
  }

  public ConnectionScheduleDataBasicSchedule timeUnit(TimeUnitEnum timeUnit) {
    this.timeUnit = timeUnit;
    return this;
  }

   /**
   * Get timeUnit
   * @return timeUnit
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TIME_UNIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TimeUnitEnum getTimeUnit() {
    return timeUnit;
  }


  @JsonProperty(JSON_PROPERTY_TIME_UNIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTimeUnit(TimeUnitEnum timeUnit) {
    this.timeUnit = timeUnit;
  }


  public ConnectionScheduleDataBasicSchedule units(Long units) {
    this.units = units;
    return this;
  }

   /**
   * Get units
   * @return units
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_UNITS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getUnits() {
    return units;
  }


  @JsonProperty(JSON_PROPERTY_UNITS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUnits(Long units) {
    this.units = units;
  }


  /**
   * Return true if this ConnectionScheduleData_basicSchedule object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectionScheduleDataBasicSchedule connectionScheduleDataBasicSchedule = (ConnectionScheduleDataBasicSchedule) o;
    return Objects.equals(this.timeUnit, connectionScheduleDataBasicSchedule.timeUnit) &&
        Objects.equals(this.units, connectionScheduleDataBasicSchedule.units);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeUnit, units);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectionScheduleDataBasicSchedule {\n");
    sb.append("    timeUnit: ").append(toIndentedString(timeUnit)).append("\n");
    sb.append("    units: ").append(toIndentedString(units)).append("\n");
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

