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
 * ConnectionRead
 */
@JsonPropertyOrder({
  ConnectionRead.JSON_PROPERTY_CONNECTION_ID,
  ConnectionRead.JSON_PROPERTY_NAME,
  ConnectionRead.JSON_PROPERTY_NAMESPACE_DEFINITION,
  ConnectionRead.JSON_PROPERTY_NAMESPACE_FORMAT,
  ConnectionRead.JSON_PROPERTY_PREFIX,
  ConnectionRead.JSON_PROPERTY_SOURCE_ID,
  ConnectionRead.JSON_PROPERTY_DESTINATION_ID,
  ConnectionRead.JSON_PROPERTY_OPERATION_IDS,
  ConnectionRead.JSON_PROPERTY_SYNC_CATALOG,
  ConnectionRead.JSON_PROPERTY_SCHEDULE,
  ConnectionRead.JSON_PROPERTY_SCHEDULE_TYPE,
  ConnectionRead.JSON_PROPERTY_SCHEDULE_DATA,
  ConnectionRead.JSON_PROPERTY_STATUS,
  ConnectionRead.JSON_PROPERTY_RESOURCE_REQUIREMENTS,
  ConnectionRead.JSON_PROPERTY_SOURCE_CATALOG_ID,
  ConnectionRead.JSON_PROPERTY_GEOGRAPHY,
  ConnectionRead.JSON_PROPERTY_BREAKING_CHANGE,
  ConnectionRead.JSON_PROPERTY_NOTIFY_SCHEMA_CHANGES,
  ConnectionRead.JSON_PROPERTY_NON_BREAKING_CHANGES_PREFERENCE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-28T19:52:03.511752+05:30[Asia/Kolkata]")
public class ConnectionRead {
  public static final String JSON_PROPERTY_CONNECTION_ID = "connectionId";
  private UUID connectionId;

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

  public static final String JSON_PROPERTY_BREAKING_CHANGE = "breakingChange";
  private Boolean breakingChange;

  public static final String JSON_PROPERTY_NOTIFY_SCHEMA_CHANGES = "notifySchemaChanges";
  private Boolean notifySchemaChanges;

  public static final String JSON_PROPERTY_NON_BREAKING_CHANGES_PREFERENCE = "nonBreakingChangesPreference";
  private NonBreakingChangesPreference nonBreakingChangesPreference;

  public ConnectionRead() { 
  }

  public ConnectionRead connectionId(UUID connectionId) {
    this.connectionId = connectionId;
    return this;
  }

   /**
   * Get connectionId
   * @return connectionId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CONNECTION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getConnectionId() {
    return connectionId;
  }


  @JsonProperty(JSON_PROPERTY_CONNECTION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConnectionId(UUID connectionId) {
    this.connectionId = connectionId;
  }


  public ConnectionRead name(String name) {
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


  public ConnectionRead namespaceDefinition(NamespaceDefinitionType namespaceDefinition) {
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


  public ConnectionRead namespaceFormat(String namespaceFormat) {
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


  public ConnectionRead prefix(String prefix) {
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


  public ConnectionRead sourceId(UUID sourceId) {
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


  public ConnectionRead destinationId(UUID destinationId) {
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


  public ConnectionRead operationIds(List<UUID> operationIds) {
    this.operationIds = operationIds;
    return this;
  }

  public ConnectionRead addOperationIdsItem(UUID operationIdsItem) {
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


  public ConnectionRead syncCatalog(AirbyteCatalog syncCatalog) {
    this.syncCatalog = syncCatalog;
    return this;
  }

   /**
   * Get syncCatalog
   * @return syncCatalog
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SYNC_CATALOG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AirbyteCatalog getSyncCatalog() {
    return syncCatalog;
  }


  @JsonProperty(JSON_PROPERTY_SYNC_CATALOG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSyncCatalog(AirbyteCatalog syncCatalog) {
    this.syncCatalog = syncCatalog;
  }


  public ConnectionRead schedule(ConnectionSchedule schedule) {
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


  public ConnectionRead scheduleType(ConnectionScheduleType scheduleType) {
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


  public ConnectionRead scheduleData(ConnectionScheduleData scheduleData) {
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


  public ConnectionRead status(ConnectionStatus status) {
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


  public ConnectionRead resourceRequirements(ResourceRequirements resourceRequirements) {
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


  public ConnectionRead sourceCatalogId(UUID sourceCatalogId) {
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


  public ConnectionRead geography(Geography geography) {
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


  public ConnectionRead breakingChange(Boolean breakingChange) {
    this.breakingChange = breakingChange;
    return this;
  }

   /**
   * Get breakingChange
   * @return breakingChange
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_BREAKING_CHANGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getBreakingChange() {
    return breakingChange;
  }


  @JsonProperty(JSON_PROPERTY_BREAKING_CHANGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBreakingChange(Boolean breakingChange) {
    this.breakingChange = breakingChange;
  }


  public ConnectionRead notifySchemaChanges(Boolean notifySchemaChanges) {
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


  public ConnectionRead nonBreakingChangesPreference(NonBreakingChangesPreference nonBreakingChangesPreference) {
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
   * Return true if this ConnectionRead object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectionRead connectionRead = (ConnectionRead) o;
    return Objects.equals(this.connectionId, connectionRead.connectionId) &&
        Objects.equals(this.name, connectionRead.name) &&
        Objects.equals(this.namespaceDefinition, connectionRead.namespaceDefinition) &&
        Objects.equals(this.namespaceFormat, connectionRead.namespaceFormat) &&
        Objects.equals(this.prefix, connectionRead.prefix) &&
        Objects.equals(this.sourceId, connectionRead.sourceId) &&
        Objects.equals(this.destinationId, connectionRead.destinationId) &&
        Objects.equals(this.operationIds, connectionRead.operationIds) &&
        Objects.equals(this.syncCatalog, connectionRead.syncCatalog) &&
        Objects.equals(this.schedule, connectionRead.schedule) &&
        Objects.equals(this.scheduleType, connectionRead.scheduleType) &&
        Objects.equals(this.scheduleData, connectionRead.scheduleData) &&
        Objects.equals(this.status, connectionRead.status) &&
        Objects.equals(this.resourceRequirements, connectionRead.resourceRequirements) &&
        Objects.equals(this.sourceCatalogId, connectionRead.sourceCatalogId) &&
        Objects.equals(this.geography, connectionRead.geography) &&
        Objects.equals(this.breakingChange, connectionRead.breakingChange) &&
        Objects.equals(this.notifySchemaChanges, connectionRead.notifySchemaChanges) &&
        Objects.equals(this.nonBreakingChangesPreference, connectionRead.nonBreakingChangesPreference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectionId, name, namespaceDefinition, namespaceFormat, prefix, sourceId, destinationId, operationIds, syncCatalog, schedule, scheduleType, scheduleData, status, resourceRequirements, sourceCatalogId, geography, breakingChange, notifySchemaChanges, nonBreakingChangesPreference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectionRead {\n");
    sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
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
    sb.append("    breakingChange: ").append(toIndentedString(breakingChange)).append("\n");
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

