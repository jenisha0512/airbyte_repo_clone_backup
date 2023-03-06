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
import io.airbyte.api.client.model.generated.AirbyteCatalog;
import io.airbyte.api.client.model.generated.ConnectionSchedule;
import io.airbyte.api.client.model.generated.ConnectionScheduleData;
import io.airbyte.api.client.model.generated.ConnectionScheduleType;
import io.airbyte.api.client.model.generated.ConnectionStatus;
import io.airbyte.api.client.model.generated.Geography;
import io.airbyte.api.client.model.generated.NamespaceDefinitionType;
import io.airbyte.api.client.model.generated.NonBreakingChangesPreference;
import io.airbyte.api.client.model.generated.ResourceRequirements;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ConnectionCreate
 */
@JsonPropertyOrder({
  ConnectionCreate.JSON_PROPERTY_NAME,
  ConnectionCreate.JSON_PROPERTY_NAMESPACE_DEFINITION,
  ConnectionCreate.JSON_PROPERTY_NAMESPACE_FORMAT,
  ConnectionCreate.JSON_PROPERTY_PREFIX,
  ConnectionCreate.JSON_PROPERTY_SOURCE_ID,
  ConnectionCreate.JSON_PROPERTY_DESTINATION_ID,
  ConnectionCreate.JSON_PROPERTY_OPERATION_IDS,
  ConnectionCreate.JSON_PROPERTY_SYNC_CATALOG,
  ConnectionCreate.JSON_PROPERTY_SCHEDULE,
  ConnectionCreate.JSON_PROPERTY_SCHEDULE_TYPE,
  ConnectionCreate.JSON_PROPERTY_SCHEDULE_DATA,
  ConnectionCreate.JSON_PROPERTY_STATUS,
  ConnectionCreate.JSON_PROPERTY_RESOURCE_REQUIREMENTS,
  ConnectionCreate.JSON_PROPERTY_SOURCE_CATALOG_ID,
  ConnectionCreate.JSON_PROPERTY_GEOGRAPHY,
  ConnectionCreate.JSON_PROPERTY_NOTIFY_SCHEMA_CHANGES,
  ConnectionCreate.JSON_PROPERTY_NON_BREAKING_CHANGES_PREFERENCE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-28T19:52:03.511752+05:30[Asia/Kolkata]")
public class ConnectionCreate {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_NAMESPACE_DEFINITION = "namespaceDefinition";
  private NamespaceDefinitionType namespaceDefinition;

  public static final String JSON_PROPERTY_NAMESPACE_FORMAT = "namespaceFormat";
  private String namespaceFormat;

  public static final String JSON_PROPERTY_PREFIX = "prefix";
  private String prefix;

  public static final String JSON_PROPERTY_SOURCE_ID = "sourceId";
  private UUID sourceId;

  public static final String JSON_PROPERTY_DESTINATION_ID = "destinationId";
  private UUID destinationId;

  public static final String JSON_PROPERTY_OPERATION_IDS = "operationIds";
  private List<UUID> operationIds = null;

  public static final String JSON_PROPERTY_SYNC_CATALOG = "syncCatalog";
  private AirbyteCatalog syncCatalog;

  public static final String JSON_PROPERTY_SCHEDULE = "schedule";
  private ConnectionSchedule schedule;

  public static final String JSON_PROPERTY_SCHEDULE_TYPE = "scheduleType";
  private ConnectionScheduleType scheduleType;

  public static final String JSON_PROPERTY_SCHEDULE_DATA = "scheduleData";
  private ConnectionScheduleData scheduleData;

  public static final String JSON_PROPERTY_STATUS = "status";
  private ConnectionStatus status;

  public static final String JSON_PROPERTY_RESOURCE_REQUIREMENTS = "resourceRequirements";
  private ResourceRequirements resourceRequirements;

  public static final String JSON_PROPERTY_SOURCE_CATALOG_ID = "sourceCatalogId";
  private UUID sourceCatalogId;

  public static final String JSON_PROPERTY_GEOGRAPHY = "geography";
  private Geography geography;

  public static final String JSON_PROPERTY_NOTIFY_SCHEMA_CHANGES = "notifySchemaChanges";
  private Boolean notifySchemaChanges;

  public static final String JSON_PROPERTY_NON_BREAKING_CHANGES_PREFERENCE = "nonBreakingChangesPreference";
  private NonBreakingChangesPreference nonBreakingChangesPreference;

  public ConnectionCreate() { 
  }

  public ConnectionCreate name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Optional name of the connection
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional name of the connection")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public ConnectionCreate namespaceDefinition(NamespaceDefinitionType namespaceDefinition) {
    this.namespaceDefinition = namespaceDefinition;
    return this;
  }

   /**
   * Get namespaceDefinition
   * @return namespaceDefinition
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NAMESPACE_DEFINITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public NamespaceDefinitionType getNamespaceDefinition() {
    return namespaceDefinition;
  }


  @JsonProperty(JSON_PROPERTY_NAMESPACE_DEFINITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNamespaceDefinition(NamespaceDefinitionType namespaceDefinition) {
    this.namespaceDefinition = namespaceDefinition;
  }


  public ConnectionCreate namespaceFormat(String namespaceFormat) {
    this.namespaceFormat = namespaceFormat;
    return this;
  }

   /**
   * Used when namespaceDefinition is &#39;customformat&#39;. If blank then behaves like namespaceDefinition &#x3D; &#39;destination&#39;. If \&quot;${SOURCE_NAMESPACE}\&quot; then behaves like namespaceDefinition &#x3D; &#39;source&#39;.
   * @return namespaceFormat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "${SOURCE_NAMESPACE}", value = "Used when namespaceDefinition is 'customformat'. If blank then behaves like namespaceDefinition = 'destination'. If \"${SOURCE_NAMESPACE}\" then behaves like namespaceDefinition = 'source'.")
  @JsonProperty(JSON_PROPERTY_NAMESPACE_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNamespaceFormat() {
    return namespaceFormat;
  }


  @JsonProperty(JSON_PROPERTY_NAMESPACE_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNamespaceFormat(String namespaceFormat) {
    this.namespaceFormat = namespaceFormat;
  }


  public ConnectionCreate prefix(String prefix) {
    this.prefix = prefix;
    return this;
  }

   /**
   * Prefix that will be prepended to the name of each stream when it is written to the destination.
   * @return prefix
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Prefix that will be prepended to the name of each stream when it is written to the destination.")
  @JsonProperty(JSON_PROPERTY_PREFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPrefix() {
    return prefix;
  }


  @JsonProperty(JSON_PROPERTY_PREFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }


  public ConnectionCreate sourceId(UUID sourceId) {
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


  public ConnectionCreate destinationId(UUID destinationId) {
    this.destinationId = destinationId;
    return this;
  }

   /**
   * Get destinationId
   * @return destinationId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DESTINATION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getDestinationId() {
    return destinationId;
  }


  @JsonProperty(JSON_PROPERTY_DESTINATION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDestinationId(UUID destinationId) {
    this.destinationId = destinationId;
  }


  public ConnectionCreate operationIds(List<UUID> operationIds) {
    this.operationIds = operationIds;
    return this;
  }

  public ConnectionCreate addOperationIdsItem(UUID operationIdsItem) {
    if (this.operationIds == null) {
      this.operationIds = new ArrayList<>();
    }
    this.operationIds.add(operationIdsItem);
    return this;
  }

   /**
   * Get operationIds
   * @return operationIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OPERATION_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UUID> getOperationIds() {
    return operationIds;
  }


  @JsonProperty(JSON_PROPERTY_OPERATION_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOperationIds(List<UUID> operationIds) {
    this.operationIds = operationIds;
  }


  public ConnectionCreate syncCatalog(AirbyteCatalog syncCatalog) {
    this.syncCatalog = syncCatalog;
    return this;
  }

   /**
   * Get syncCatalog
   * @return syncCatalog
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SYNC_CATALOG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AirbyteCatalog getSyncCatalog() {
    return syncCatalog;
  }


  @JsonProperty(JSON_PROPERTY_SYNC_CATALOG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSyncCatalog(AirbyteCatalog syncCatalog) {
    this.syncCatalog = syncCatalog;
  }


  public ConnectionCreate schedule(ConnectionSchedule schedule) {
    this.schedule = schedule;
    return this;
  }

   /**
   * Get schedule
   * @return schedule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SCHEDULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConnectionSchedule getSchedule() {
    return schedule;
  }


  @JsonProperty(JSON_PROPERTY_SCHEDULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSchedule(ConnectionSchedule schedule) {
    this.schedule = schedule;
  }


  public ConnectionCreate scheduleType(ConnectionScheduleType scheduleType) {
    this.scheduleType = scheduleType;
    return this;
  }

   /**
   * Get scheduleType
   * @return scheduleType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SCHEDULE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConnectionScheduleType getScheduleType() {
    return scheduleType;
  }


  @JsonProperty(JSON_PROPERTY_SCHEDULE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScheduleType(ConnectionScheduleType scheduleType) {
    this.scheduleType = scheduleType;
  }


  public ConnectionCreate scheduleData(ConnectionScheduleData scheduleData) {
    this.scheduleData = scheduleData;
    return this;
  }

   /**
   * Get scheduleData
   * @return scheduleData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SCHEDULE_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConnectionScheduleData getScheduleData() {
    return scheduleData;
  }


  @JsonProperty(JSON_PROPERTY_SCHEDULE_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScheduleData(ConnectionScheduleData scheduleData) {
    this.scheduleData = scheduleData;
  }


  public ConnectionCreate status(ConnectionStatus status) {
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

  public ConnectionStatus getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(ConnectionStatus status) {
    this.status = status;
  }


  public ConnectionCreate resourceRequirements(ResourceRequirements resourceRequirements) {
    this.resourceRequirements = resourceRequirements;
    return this;
  }

   /**
   * Get resourceRequirements
   * @return resourceRequirements
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RESOURCE_REQUIREMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ResourceRequirements getResourceRequirements() {
    return resourceRequirements;
  }


  @JsonProperty(JSON_PROPERTY_RESOURCE_REQUIREMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResourceRequirements(ResourceRequirements resourceRequirements) {
    this.resourceRequirements = resourceRequirements;
  }


  public ConnectionCreate sourceCatalogId(UUID sourceCatalogId) {
    this.sourceCatalogId = sourceCatalogId;
    return this;
  }

   /**
   * Get sourceCatalogId
   * @return sourceCatalogId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SOURCE_CATALOG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getSourceCatalogId() {
    return sourceCatalogId;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE_CATALOG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSourceCatalogId(UUID sourceCatalogId) {
    this.sourceCatalogId = sourceCatalogId;
  }


  public ConnectionCreate geography(Geography geography) {
    this.geography = geography;
    return this;
  }

   /**
   * Get geography
   * @return geography
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GEOGRAPHY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Geography getGeography() {
    return geography;
  }


  @JsonProperty(JSON_PROPERTY_GEOGRAPHY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGeography(Geography geography) {
    this.geography = geography;
  }


  public ConnectionCreate notifySchemaChanges(Boolean notifySchemaChanges) {
    this.notifySchemaChanges = notifySchemaChanges;
    return this;
  }

   /**
   * Get notifySchemaChanges
   * @return notifySchemaChanges
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NOTIFY_SCHEMA_CHANGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getNotifySchemaChanges() {
    return notifySchemaChanges;
  }


  @JsonProperty(JSON_PROPERTY_NOTIFY_SCHEMA_CHANGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNotifySchemaChanges(Boolean notifySchemaChanges) {
    this.notifySchemaChanges = notifySchemaChanges;
  }


  public ConnectionCreate nonBreakingChangesPreference(NonBreakingChangesPreference nonBreakingChangesPreference) {
    this.nonBreakingChangesPreference = nonBreakingChangesPreference;
    return this;
  }

   /**
   * Get nonBreakingChangesPreference
   * @return nonBreakingChangesPreference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NON_BREAKING_CHANGES_PREFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public NonBreakingChangesPreference getNonBreakingChangesPreference() {
    return nonBreakingChangesPreference;
  }


  @JsonProperty(JSON_PROPERTY_NON_BREAKING_CHANGES_PREFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNonBreakingChangesPreference(NonBreakingChangesPreference nonBreakingChangesPreference) {
    this.nonBreakingChangesPreference = nonBreakingChangesPreference;
  }


  /**
   * Return true if this ConnectionCreate object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectionCreate connectionCreate = (ConnectionCreate) o;
    return Objects.equals(this.name, connectionCreate.name) &&
        Objects.equals(this.namespaceDefinition, connectionCreate.namespaceDefinition) &&
        Objects.equals(this.namespaceFormat, connectionCreate.namespaceFormat) &&
        Objects.equals(this.prefix, connectionCreate.prefix) &&
        Objects.equals(this.sourceId, connectionCreate.sourceId) &&
        Objects.equals(this.destinationId, connectionCreate.destinationId) &&
        Objects.equals(this.operationIds, connectionCreate.operationIds) &&
        Objects.equals(this.syncCatalog, connectionCreate.syncCatalog) &&
        Objects.equals(this.schedule, connectionCreate.schedule) &&
        Objects.equals(this.scheduleType, connectionCreate.scheduleType) &&
        Objects.equals(this.scheduleData, connectionCreate.scheduleData) &&
        Objects.equals(this.status, connectionCreate.status) &&
        Objects.equals(this.resourceRequirements, connectionCreate.resourceRequirements) &&
        Objects.equals(this.sourceCatalogId, connectionCreate.sourceCatalogId) &&
        Objects.equals(this.geography, connectionCreate.geography) &&
        Objects.equals(this.notifySchemaChanges, connectionCreate.notifySchemaChanges) &&
        Objects.equals(this.nonBreakingChangesPreference, connectionCreate.nonBreakingChangesPreference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, namespaceDefinition, namespaceFormat, prefix, sourceId, destinationId, operationIds, syncCatalog, schedule, scheduleType, scheduleData, status, resourceRequirements, sourceCatalogId, geography, notifySchemaChanges, nonBreakingChangesPreference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectionCreate {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespaceDefinition: ").append(toIndentedString(namespaceDefinition)).append("\n");
    sb.append("    namespaceFormat: ").append(toIndentedString(namespaceFormat)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    destinationId: ").append(toIndentedString(destinationId)).append("\n");
    sb.append("    operationIds: ").append(toIndentedString(operationIds)).append("\n");
    sb.append("    syncCatalog: ").append(toIndentedString(syncCatalog)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    scheduleType: ").append(toIndentedString(scheduleType)).append("\n");
    sb.append("    scheduleData: ").append(toIndentedString(scheduleData)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    resourceRequirements: ").append(toIndentedString(resourceRequirements)).append("\n");
    sb.append("    sourceCatalogId: ").append(toIndentedString(sourceCatalogId)).append("\n");
    sb.append("    geography: ").append(toIndentedString(geography)).append("\n");
    sb.append("    notifySchemaChanges: ").append(toIndentedString(notifySchemaChanges)).append("\n");
    sb.append("    nonBreakingChangesPreference: ").append(toIndentedString(nonBreakingChangesPreference)).append("\n");
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
