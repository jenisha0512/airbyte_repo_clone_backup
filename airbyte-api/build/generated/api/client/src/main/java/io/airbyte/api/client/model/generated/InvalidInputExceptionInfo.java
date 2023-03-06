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
import io.airbyte.api.client.model.generated.InvalidInputProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * InvalidInputExceptionInfo
 */
@JsonPropertyOrder({
  InvalidInputExceptionInfo.JSON_PROPERTY_MESSAGE,
  InvalidInputExceptionInfo.JSON_PROPERTY_EXCEPTION_CLASS_NAME,
  InvalidInputExceptionInfo.JSON_PROPERTY_EXCEPTION_STACK,
  InvalidInputExceptionInfo.JSON_PROPERTY_VALIDATION_ERRORS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-28T19:52:03.511752+05:30[Asia/Kolkata]")
public class InvalidInputExceptionInfo {
  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_EXCEPTION_CLASS_NAME = "exceptionClassName";
  private String exceptionClassName;

  public static final String JSON_PROPERTY_EXCEPTION_STACK = "exceptionStack";
  private List<String> exceptionStack = null;

  public static final String JSON_PROPERTY_VALIDATION_ERRORS = "validationErrors";
  private List<InvalidInputProperty> validationErrors = new ArrayList<>();

  public InvalidInputExceptionInfo() { 
  }

  public InvalidInputExceptionInfo message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMessage() {
    return message;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMessage(String message) {
    this.message = message;
  }


  public InvalidInputExceptionInfo exceptionClassName(String exceptionClassName) {
    this.exceptionClassName = exceptionClassName;
    return this;
  }

   /**
   * Get exceptionClassName
   * @return exceptionClassName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXCEPTION_CLASS_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExceptionClassName() {
    return exceptionClassName;
  }


  @JsonProperty(JSON_PROPERTY_EXCEPTION_CLASS_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExceptionClassName(String exceptionClassName) {
    this.exceptionClassName = exceptionClassName;
  }


  public InvalidInputExceptionInfo exceptionStack(List<String> exceptionStack) {
    this.exceptionStack = exceptionStack;
    return this;
  }

  public InvalidInputExceptionInfo addExceptionStackItem(String exceptionStackItem) {
    if (this.exceptionStack == null) {
      this.exceptionStack = new ArrayList<>();
    }
    this.exceptionStack.add(exceptionStackItem);
    return this;
  }

   /**
   * Get exceptionStack
   * @return exceptionStack
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXCEPTION_STACK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getExceptionStack() {
    return exceptionStack;
  }


  @JsonProperty(JSON_PROPERTY_EXCEPTION_STACK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExceptionStack(List<String> exceptionStack) {
    this.exceptionStack = exceptionStack;
  }


  public InvalidInputExceptionInfo validationErrors(List<InvalidInputProperty> validationErrors) {
    this.validationErrors = validationErrors;
    return this;
  }

  public InvalidInputExceptionInfo addValidationErrorsItem(InvalidInputProperty validationErrorsItem) {
    this.validationErrors.add(validationErrorsItem);
    return this;
  }

   /**
   * Get validationErrors
   * @return validationErrors
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_VALIDATION_ERRORS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<InvalidInputProperty> getValidationErrors() {
    return validationErrors;
  }


  @JsonProperty(JSON_PROPERTY_VALIDATION_ERRORS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setValidationErrors(List<InvalidInputProperty> validationErrors) {
    this.validationErrors = validationErrors;
  }


  /**
   * Return true if this InvalidInputExceptionInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvalidInputExceptionInfo invalidInputExceptionInfo = (InvalidInputExceptionInfo) o;
    return Objects.equals(this.message, invalidInputExceptionInfo.message) &&
        Objects.equals(this.exceptionClassName, invalidInputExceptionInfo.exceptionClassName) &&
        Objects.equals(this.exceptionStack, invalidInputExceptionInfo.exceptionStack) &&
        Objects.equals(this.validationErrors, invalidInputExceptionInfo.validationErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, exceptionClassName, exceptionStack, validationErrors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvalidInputExceptionInfo {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    exceptionClassName: ").append(toIndentedString(exceptionClassName)).append("\n");
    sb.append("    exceptionStack: ").append(toIndentedString(exceptionStack)).append("\n");
    sb.append("    validationErrors: ").append(toIndentedString(validationErrors)).append("\n");
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

