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
 * AttemptNormalizationStatusRead
 */
@JsonPropertyOrder({
  AttemptNormalizationStatusRead.JSON_PROPERTY_ATTEMPT_NUMBER,
  AttemptNormalizationStatusRead.JSON_PROPERTY_HAS_RECORDS_COMMITTED,
  AttemptNormalizationStatusRead.JSON_PROPERTY_RECORDS_COMMITTED,
  AttemptNormalizationStatusRead.JSON_PROPERTY_HAS_NORMALIZATION_FAILED
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-28T19:52:03.511752+05:30[Asia/Kolkata]")
public class AttemptNormalizationStatusRead {
  public static final String JSON_PROPERTY_ATTEMPT_NUMBER = "attemptNumber";
  private Integer attemptNumber;

  public static final String JSON_PROPERTY_HAS_RECORDS_COMMITTED = "hasRecordsCommitted";
  private Boolean hasRecordsCommitted;

  public static final String JSON_PROPERTY_RECORDS_COMMITTED = "recordsCommitted";
  private Long recordsCommitted;

  public static final String JSON_PROPERTY_HAS_NORMALIZATION_FAILED = "hasNormalizationFailed";
  private Boolean hasNormalizationFailed;

  public AttemptNormalizationStatusRead() { 
  }

  public AttemptNormalizationStatusRead attemptNumber(Integer attemptNumber) {
    this.attemptNumber = attemptNumber;
    return this;
  }

   /**
   * Get attemptNumber
   * @return attemptNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ATTEMPT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAttemptNumber() {
    return attemptNumber;
  }


  @JsonProperty(JSON_PROPERTY_ATTEMPT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAttemptNumber(Integer attemptNumber) {
    this.attemptNumber = attemptNumber;
  }


  public AttemptNormalizationStatusRead hasRecordsCommitted(Boolean hasRecordsCommitted) {
    this.hasRecordsCommitted = hasRecordsCommitted;
    return this;
  }

   /**
   * Get hasRecordsCommitted
   * @return hasRecordsCommitted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HAS_RECORDS_COMMITTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasRecordsCommitted() {
    return hasRecordsCommitted;
  }


  @JsonProperty(JSON_PROPERTY_HAS_RECORDS_COMMITTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasRecordsCommitted(Boolean hasRecordsCommitted) {
    this.hasRecordsCommitted = hasRecordsCommitted;
  }


  public AttemptNormalizationStatusRead recordsCommitted(Long recordsCommitted) {
    this.recordsCommitted = recordsCommitted;
    return this;
  }

   /**
   * Get recordsCommitted
   * @return recordsCommitted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RECORDS_COMMITTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getRecordsCommitted() {
    return recordsCommitted;
  }


  @JsonProperty(JSON_PROPERTY_RECORDS_COMMITTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecordsCommitted(Long recordsCommitted) {
    this.recordsCommitted = recordsCommitted;
  }


  public AttemptNormalizationStatusRead hasNormalizationFailed(Boolean hasNormalizationFailed) {
    this.hasNormalizationFailed = hasNormalizationFailed;
    return this;
  }

   /**
   * Get hasNormalizationFailed
   * @return hasNormalizationFailed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HAS_NORMALIZATION_FAILED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasNormalizationFailed() {
    return hasNormalizationFailed;
  }


  @JsonProperty(JSON_PROPERTY_HAS_NORMALIZATION_FAILED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasNormalizationFailed(Boolean hasNormalizationFailed) {
    this.hasNormalizationFailed = hasNormalizationFailed;
  }


  /**
   * Return true if this AttemptNormalizationStatusRead object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttemptNormalizationStatusRead attemptNormalizationStatusRead = (AttemptNormalizationStatusRead) o;
    return Objects.equals(this.attemptNumber, attemptNormalizationStatusRead.attemptNumber) &&
        Objects.equals(this.hasRecordsCommitted, attemptNormalizationStatusRead.hasRecordsCommitted) &&
        Objects.equals(this.recordsCommitted, attemptNormalizationStatusRead.recordsCommitted) &&
        Objects.equals(this.hasNormalizationFailed, attemptNormalizationStatusRead.hasNormalizationFailed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attemptNumber, hasRecordsCommitted, recordsCommitted, hasNormalizationFailed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttemptNormalizationStatusRead {\n");
    sb.append("    attemptNumber: ").append(toIndentedString(attemptNumber)).append("\n");
    sb.append("    hasRecordsCommitted: ").append(toIndentedString(hasRecordsCommitted)).append("\n");
    sb.append("    recordsCommitted: ").append(toIndentedString(recordsCommitted)).append("\n");
    sb.append("    hasNormalizationFailed: ").append(toIndentedString(hasNormalizationFailed)).append("\n");
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

