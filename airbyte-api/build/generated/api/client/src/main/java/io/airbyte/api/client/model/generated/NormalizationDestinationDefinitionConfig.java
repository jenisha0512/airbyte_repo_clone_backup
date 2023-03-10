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
 * describes a normalization config for destination definition
 */
@ApiModel(description = "describes a normalization config for destination definition")
@JsonPropertyOrder({
  NormalizationDestinationDefinitionConfig.JSON_PROPERTY_SUPPORTED,
  NormalizationDestinationDefinitionConfig.JSON_PROPERTY_NORMALIZATION_REPOSITORY,
  NormalizationDestinationDefinitionConfig.JSON_PROPERTY_NORMALIZATION_TAG,
  NormalizationDestinationDefinitionConfig.JSON_PROPERTY_NORMALIZATION_INTEGRATION_TYPE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-28T19:52:03.511752+05:30[Asia/Kolkata]")
public class NormalizationDestinationDefinitionConfig {
  public static final String JSON_PROPERTY_SUPPORTED = "supported";
  private Boolean supported = false;

  public static final String JSON_PROPERTY_NORMALIZATION_REPOSITORY = "normalizationRepository";
  private String normalizationRepository;

  public static final String JSON_PROPERTY_NORMALIZATION_TAG = "normalizationTag";
  private String normalizationTag;

  public static final String JSON_PROPERTY_NORMALIZATION_INTEGRATION_TYPE = "normalizationIntegrationType";
  private String normalizationIntegrationType;

  public NormalizationDestinationDefinitionConfig() { 
  }

  public NormalizationDestinationDefinitionConfig supported(Boolean supported) {
    this.supported = supported;
    return this;
  }

   /**
   * whether the destination definition supports normalization.
   * @return supported
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "whether the destination definition supports normalization.")
  @JsonProperty(JSON_PROPERTY_SUPPORTED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getSupported() {
    return supported;
  }


  @JsonProperty(JSON_PROPERTY_SUPPORTED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSupported(Boolean supported) {
    this.supported = supported;
  }


  public NormalizationDestinationDefinitionConfig normalizationRepository(String normalizationRepository) {
    this.normalizationRepository = normalizationRepository;
    return this;
  }

   /**
   * a field indicating the name of the repository to be used for normalization. If the value of the flag is NULL - normalization is not used.
   * @return normalizationRepository
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "a field indicating the name of the repository to be used for normalization. If the value of the flag is NULL - normalization is not used.")
  @JsonProperty(JSON_PROPERTY_NORMALIZATION_REPOSITORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNormalizationRepository() {
    return normalizationRepository;
  }


  @JsonProperty(JSON_PROPERTY_NORMALIZATION_REPOSITORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNormalizationRepository(String normalizationRepository) {
    this.normalizationRepository = normalizationRepository;
  }


  public NormalizationDestinationDefinitionConfig normalizationTag(String normalizationTag) {
    this.normalizationTag = normalizationTag;
    return this;
  }

   /**
   * a field indicating the tag of the docker repository to be used for normalization.
   * @return normalizationTag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "a field indicating the tag of the docker repository to be used for normalization.")
  @JsonProperty(JSON_PROPERTY_NORMALIZATION_TAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNormalizationTag() {
    return normalizationTag;
  }


  @JsonProperty(JSON_PROPERTY_NORMALIZATION_TAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNormalizationTag(String normalizationTag) {
    this.normalizationTag = normalizationTag;
  }


  public NormalizationDestinationDefinitionConfig normalizationIntegrationType(String normalizationIntegrationType) {
    this.normalizationIntegrationType = normalizationIntegrationType;
    return this;
  }

   /**
   * a field indicating the type of integration dialect to use for normalization.
   * @return normalizationIntegrationType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "a field indicating the type of integration dialect to use for normalization.")
  @JsonProperty(JSON_PROPERTY_NORMALIZATION_INTEGRATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNormalizationIntegrationType() {
    return normalizationIntegrationType;
  }


  @JsonProperty(JSON_PROPERTY_NORMALIZATION_INTEGRATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNormalizationIntegrationType(String normalizationIntegrationType) {
    this.normalizationIntegrationType = normalizationIntegrationType;
  }


  /**
   * Return true if this NormalizationDestinationDefinitionConfig object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NormalizationDestinationDefinitionConfig normalizationDestinationDefinitionConfig = (NormalizationDestinationDefinitionConfig) o;
    return Objects.equals(this.supported, normalizationDestinationDefinitionConfig.supported) &&
        Objects.equals(this.normalizationRepository, normalizationDestinationDefinitionConfig.normalizationRepository) &&
        Objects.equals(this.normalizationTag, normalizationDestinationDefinitionConfig.normalizationTag) &&
        Objects.equals(this.normalizationIntegrationType, normalizationDestinationDefinitionConfig.normalizationIntegrationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(supported, normalizationRepository, normalizationTag, normalizationIntegrationType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NormalizationDestinationDefinitionConfig {\n");
    sb.append("    supported: ").append(toIndentedString(supported)).append("\n");
    sb.append("    normalizationRepository: ").append(toIndentedString(normalizationRepository)).append("\n");
    sb.append("    normalizationTag: ").append(toIndentedString(normalizationTag)).append("\n");
    sb.append("    normalizationIntegrationType: ").append(toIndentedString(normalizationIntegrationType)).append("\n");
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

