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
import io.airbyte.api.client.model.generated.Pagination;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * JobListRequestBody
 */
@JsonPropertyOrder({
  JobListRequestBody.JSON_PROPERTY_CONFIG_TYPES,
  JobListRequestBody.JSON_PROPERTY_CONFIG_ID,
  JobListRequestBody.JSON_PROPERTY_INCLUDING_JOB_ID,
  JobListRequestBody.JSON_PROPERTY_PAGINATION
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-28T19:52:03.511752+05:30[Asia/Kolkata]")
public class JobListRequestBody {
  public static final String JSON_PROPERTY_CONFIG_TYPES = "configTypes";
  private List<JobConfigType> configTypes = new ArrayList<>();

  public static final String JSON_PROPERTY_CONFIG_ID = "configId";
  private String configId;

  public static final String JSON_PROPERTY_INCLUDING_JOB_ID = "includingJobId";
  private Long includingJobId;

  public static final String JSON_PROPERTY_PAGINATION = "pagination";
  private Pagination pagination;

  public JobListRequestBody() { 
  }

  public JobListRequestBody configTypes(List<JobConfigType> configTypes) {
    this.configTypes = configTypes;
    return this;
  }

  public JobListRequestBody addConfigTypesItem(JobConfigType configTypesItem) {
    this.configTypes.add(configTypesItem);
    return this;
  }

   /**
   * Get configTypes
   * @return configTypes
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CONFIG_TYPES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<JobConfigType> getConfigTypes() {
    return configTypes;
  }


  @JsonProperty(JSON_PROPERTY_CONFIG_TYPES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConfigTypes(List<JobConfigType> configTypes) {
    this.configTypes = configTypes;
  }


  public JobListRequestBody configId(String configId) {
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


  public JobListRequestBody includingJobId(Long includingJobId) {
    this.includingJobId = includingJobId;
    return this;
  }

   /**
   * Get includingJobId
   * @return includingJobId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INCLUDING_JOB_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getIncludingJobId() {
    return includingJobId;
  }


  @JsonProperty(JSON_PROPERTY_INCLUDING_JOB_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIncludingJobId(Long includingJobId) {
    this.includingJobId = includingJobId;
  }


  public JobListRequestBody pagination(Pagination pagination) {
    this.pagination = pagination;
    return this;
  }

   /**
   * Get pagination
   * @return pagination
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAGINATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Pagination getPagination() {
    return pagination;
  }


  @JsonProperty(JSON_PROPERTY_PAGINATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPagination(Pagination pagination) {
    this.pagination = pagination;
  }


  /**
   * Return true if this JobListRequestBody object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobListRequestBody jobListRequestBody = (JobListRequestBody) o;
    return Objects.equals(this.configTypes, jobListRequestBody.configTypes) &&
        Objects.equals(this.configId, jobListRequestBody.configId) &&
        Objects.equals(this.includingJobId, jobListRequestBody.includingJobId) &&
        Objects.equals(this.pagination, jobListRequestBody.pagination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configTypes, configId, includingJobId, pagination);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobListRequestBody {\n");
    sb.append("    configTypes: ").append(toIndentedString(configTypes)).append("\n");
    sb.append("    configId: ").append(toIndentedString(configId)).append("\n");
    sb.append("    includingJobId: ").append(toIndentedString(includingJobId)).append("\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
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
