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
import io.airbyte.api.client.model.generated.JobType;
import io.airbyte.api.client.model.generated.ResourceRequirements;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * sets resource requirements for a specific job type for an actor definition. these values override the default, if both are set.
 */
@ApiModel(description = "sets resource requirements for a specific job type for an actor definition. these values override the default, if both are set.")
@JsonPropertyOrder({
  JobTypeResourceLimit.JSON_PROPERTY_JOB_TYPE,
  JobTypeResourceLimit.JSON_PROPERTY_RESOURCE_REQUIREMENTS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-28T19:52:03.511752+05:30[Asia/Kolkata]")
public class JobTypeResourceLimit {
  public static final String JSON_PROPERTY_JOB_TYPE = "jobType";
  private JobType jobType;

  public static final String JSON_PROPERTY_RESOURCE_REQUIREMENTS = "resourceRequirements";
  private ResourceRequirements resourceRequirements;

  public JobTypeResourceLimit() { 
  }

  public JobTypeResourceLimit jobType(JobType jobType) {
    this.jobType = jobType;
    return this;
  }

   /**
   * Get jobType
   * @return jobType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_JOB_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public JobType getJobType() {
    return jobType;
  }


  @JsonProperty(JSON_PROPERTY_JOB_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setJobType(JobType jobType) {
    this.jobType = jobType;
  }


  public JobTypeResourceLimit resourceRequirements(ResourceRequirements resourceRequirements) {
    this.resourceRequirements = resourceRequirements;
    return this;
  }

   /**
   * Get resourceRequirements
   * @return resourceRequirements
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_RESOURCE_REQUIREMENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ResourceRequirements getResourceRequirements() {
    return resourceRequirements;
  }


  @JsonProperty(JSON_PROPERTY_RESOURCE_REQUIREMENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setResourceRequirements(ResourceRequirements resourceRequirements) {
    this.resourceRequirements = resourceRequirements;
  }


  /**
   * Return true if this JobTypeResourceLimit object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobTypeResourceLimit jobTypeResourceLimit = (JobTypeResourceLimit) o;
    return Objects.equals(this.jobType, jobTypeResourceLimit.jobType) &&
        Objects.equals(this.resourceRequirements, jobTypeResourceLimit.resourceRequirements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobType, resourceRequirements);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobTypeResourceLimit {\n");
    sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
    sb.append("    resourceRequirements: ").append(toIndentedString(resourceRequirements)).append("\n");
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
