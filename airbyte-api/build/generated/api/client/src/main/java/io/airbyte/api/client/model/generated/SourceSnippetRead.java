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
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * SourceSnippetRead
 */
@JsonPropertyOrder({
  SourceSnippetRead.JSON_PROPERTY_SOURCE_ID,
  SourceSnippetRead.JSON_PROPERTY_NAME,
  SourceSnippetRead.JSON_PROPERTY_SOURCE_DEFINITION_ID,
  SourceSnippetRead.JSON_PROPERTY_SOURCE_NAME,
  SourceSnippetRead.JSON_PROPERTY_ICON
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-28T19:52:03.511752+05:30[Asia/Kolkata]")
public class SourceSnippetRead {
  public static final String JSON_PROPERTY_SOURCE_ID = "sourceId";
  private UUID sourceId;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SOURCE_DEFINITION_ID = "sourceDefinitionId";
  private UUID sourceDefinitionId;

  public static final String JSON_PROPERTY_SOURCE_NAME = "sourceName";
  private String sourceName;

  public static final String JSON_PROPERTY_ICON = "icon";
  private String icon;

  public SourceSnippetRead() { 
  }

  public SourceSnippetRead sourceId(UUID sourceId) {
    this.sourceId = sourceId;
    return this;
  }

   /**
   * Get sourceId
   * @return sourceId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getSourceId() {
    return sourceId;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSourceId(UUID sourceId) {
    this.sourceId = sourceId;
  }


  public SourceSnippetRead name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public SourceSnippetRead sourceDefinitionId(UUID sourceDefinitionId) {
    this.sourceDefinitionId = sourceDefinitionId;
    return this;
  }

   /**
   * Get sourceDefinitionId
   * @return sourceDefinitionId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SOURCE_DEFINITION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getSourceDefinitionId() {
    return sourceDefinitionId;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE_DEFINITION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSourceDefinitionId(UUID sourceDefinitionId) {
    this.sourceDefinitionId = sourceDefinitionId;
  }


  public SourceSnippetRead sourceName(String sourceName) {
    this.sourceName = sourceName;
    return this;
  }

   /**
   * Get sourceName
   * @return sourceName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SOURCE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSourceName() {
    return sourceName;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSourceName(String sourceName) {
    this.sourceName = sourceName;
  }


  public SourceSnippetRead icon(String icon) {
    this.icon = icon;
    return this;
  }

   /**
   * Get icon
   * @return icon
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ICON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIcon() {
    return icon;
  }


  @JsonProperty(JSON_PROPERTY_ICON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIcon(String icon) {
    this.icon = icon;
  }


  /**
   * Return true if this SourceSnippetRead object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SourceSnippetRead sourceSnippetRead = (SourceSnippetRead) o;
    return Objects.equals(this.sourceId, sourceSnippetRead.sourceId) &&
        Objects.equals(this.name, sourceSnippetRead.name) &&
        Objects.equals(this.sourceDefinitionId, sourceSnippetRead.sourceDefinitionId) &&
        Objects.equals(this.sourceName, sourceSnippetRead.sourceName) &&
        Objects.equals(this.icon, sourceSnippetRead.icon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceId, name, sourceDefinitionId, sourceName, icon);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SourceSnippetRead {\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sourceDefinitionId: ").append(toIndentedString(sourceDefinitionId)).append("\n");
    sb.append("    sourceName: ").append(toIndentedString(sourceName)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
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
