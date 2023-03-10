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
import io.airbyte.api.client.model.generated.JobConfigType;
import io.airbyte.api.client.model.generated.JobStatus;
import io.airbyte.api.client.model.generated.ResetConfig;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * JobRead
 */
@JsonPropertyOrder({
  JobRead.JSON_PROPERTY_ID,
  JobRead.JSON_PROPERTY_CONFIG_TYPE,
  JobRead.JSON_PROPERTY_CONFIG_ID,
  JobRead.JSON_PROPERTY_CREATED_AT,
  JobRead.JSON_PROPERTY_UPDATED_AT,
  JobRead.JSON_PROPERTY_STARTED_AT,
  JobRead.JSON_PROPERTY_STATUS,
  JobRead.JSON_PROPERTY_RESET_CONFIG
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-28T19:52:03.511752+05:30[Asia/Kolkata]")
public class JobRead {
  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_CONFIG_TYPE = "configType";
  private JobConfigType configType;

  public static final String JSON_PROPERTY_CONFIG_ID = "configId";
  private String configId;

  public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
  private Long createdAt;

  public static final String JSON_PROPERTY_UPDATED_AT = "updatedAt";
  private Long updatedAt;

  public static final String JSON_PROPERTY_STARTED_AT = "startedAt";
  private Long startedAt;

  public static final String JSON_PROPERTY_STATUS = "status";
  private JobStatus status;

  public static final String JSON_PROPERTY_RESET_CONFIG = "resetConfig";
  private ResetConfig resetConfig;

  public JobRead() { 
  }

  public JobRead id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(Long id) {
    this.id = id;
  }


  public JobRead configType(JobConfigType configType) {
    this.configType = configType;
    return this;
  }

   /**
   * Get configType
   * @return configType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CONFIG_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public JobConfigType getConfigType() {
    return configType;
  }


  @JsonProperty(JSON_PROPERTY_CONFIG_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConfigType(JobConfigType configType) {
    this.configType = configType;
  }


  public JobRead configId(String configId) {
    this.configId = configId;
    return this;
  }

   /**
   * Get configId
   * @return configId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CONFIG_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getConfigId() {
    return configId;
  }


  @JsonProperty(JSON_PROPERTY_CONFIG_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConfigId(String configId) {
    this.configId = configId;
  }


  public JobRead createdAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }


  public JobRead updatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getUpdatedAt() {
    return updatedAt;
  }


  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
  }


  public JobRead startedAt(Long startedAt) {
    this.startedAt = startedAt;
    return this;
  }

   /**
   * Get startedAt
   * @return startedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STARTED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getStartedAt() {
    return startedAt;
  }


  @JsonProperty(JSON_PROPERTY_STARTED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartedAt(Long startedAt) {
    this.startedAt = startedAt;
  }


  public JobRead status(JobStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public JobStatus getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(JobStatus status) {
    this.status = status;
  }


  public JobRead resetConfig(ResetConfig resetConfig) {
    this.resetConfig = resetConfig;
    return this;
  }

   /**
   * Get resetConfig
   * @return resetConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RESET_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ResetConfig getResetConfig() {
    return resetConfig;
  }


  @JsonProperty(JSON_PROPERTY_RESET_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResetConfig(ResetConfig resetConfig) {
    this.resetConfig = resetConfig;
  }


  /**
   * Return true if this JobRead object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobRead jobRead = (JobRead) o;
    return Objects.equals(this.id, jobRead.id) &&
        Objects.equals(this.configType, jobRead.configType) &&
        Objects.equals(this.configId, jobRead.configId) &&
        Objects.equals(this.createdAt, jobRead.createdAt) &&
        Objects.equals(this.updatedAt, jobRead.updatedAt) &&
        Objects.equals(this.startedAt, jobRead.startedAt) &&
        Objects.equals(this.status, jobRead.status) &&
        Objects.equals(this.resetConfig, jobRead.resetConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, configType, configId, createdAt, updatedAt, startedAt, status, resetConfig);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobRead {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    configType: ").append(toIndentedString(configType)).append("\n");
    sb.append("    configId: ").append(toIndentedString(configId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    resetConfig: ").append(toIndentedString(resetConfig)).append("\n");
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

