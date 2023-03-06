
package io.airbyte.config;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import io.airbyte.protocol.models.ConfiguredAirbyteCatalog;


/**
 * StandardSync
 * <p>
 * configuration required for sync for ALL sources
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "namespaceDefinition",
    "namespaceFormat",
    "prefix",
    "sourceId",
    "destinationId",
    "operationIds",
    "connectionId",
    "name",
    "catalog",
    "fieldSelectionData",
    "status",
    "schedule",
    "manual",
    "scheduleType",
    "scheduleData",
    "source_catalog_id",
    "resourceRequirements",
    "geography",
    "breakingChange",
    "notifySchemaChanges",
    "nonBreakingChangesPreference"
})
public class StandardSync implements Serializable
{

    /**
     * Namespace Definition
     * <p>
     * Method used for computing final namespace in destination
     * (Required)
     * 
     */
    @JsonProperty("namespaceDefinition")
    @JsonPropertyDescription("Method used for computing final namespace in destination")
    private io.airbyte.config.JobSyncConfig.NamespaceDefinitionType namespaceDefinition = io.airbyte.config.JobSyncConfig.NamespaceDefinitionType.fromValue("source");
    @JsonProperty("namespaceFormat")
    private String namespaceFormat = null;
    /**
     * Prefix that will be prepended to the name of each stream when it is written to the destination.
     * 
     */
    @JsonProperty("prefix")
    @JsonPropertyDescription("Prefix that will be prepended to the name of each stream when it is written to the destination.")
    private String prefix;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("sourceId")
    private UUID sourceId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("destinationId")
    private UUID destinationId;
    @JsonProperty("operationIds")
    private List<UUID> operationIds = new ArrayList<UUID>();
    @JsonProperty("connectionId")
    private UUID connectionId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    private String name;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("catalog")
    private ConfiguredAirbyteCatalog catalog;
    /**
     * A map of StreamDescriptor to an indicator of whether field selection is enabled for that stream.
     * 
     */
    @JsonProperty("fieldSelectionData")
    @JsonPropertyDescription("A map of StreamDescriptor to an indicator of whether field selection is enabled for that stream.")
    private FieldSelectionData fieldSelectionData;
    @JsonProperty("status")
    private StandardSync.Status status;
    @JsonProperty("schedule")
    private Schedule schedule;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("manual")
    private Boolean manual;
    @JsonProperty("scheduleType")
    private StandardSync.ScheduleType scheduleType;
    @JsonProperty("scheduleData")
    private ScheduleData scheduleData;
    @JsonProperty("source_catalog_id")
    private UUID sourceCatalogId;
    /**
     * ResourceRequirements
     * <p>
     * generic configuration for pod source requirements
     * 
     */
    @JsonProperty("resourceRequirements")
    @JsonPropertyDescription("generic configuration for pod source requirements")
    private ResourceRequirements resourceRequirements;
    /**
     * Geography
     * <p>
     * Geography Setting
     * (Required)
     * 
     */
    @JsonProperty("geography")
    @JsonPropertyDescription("Geography Setting")
    private Geography geography;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("breakingChange")
    private Boolean breakingChange;
    @JsonProperty("notifySchemaChanges")
    private Boolean notifySchemaChanges;
    @JsonProperty("nonBreakingChangesPreference")
    private StandardSync.NonBreakingChangesPreference nonBreakingChangesPreference;
    private final static long serialVersionUID = -2077023533889992387L;

    /**
     * Namespace Definition
     * <p>
     * Method used for computing final namespace in destination
     * (Required)
     * 
     */
    @JsonProperty("namespaceDefinition")
    public io.airbyte.config.JobSyncConfig.NamespaceDefinitionType getNamespaceDefinition() {
        return namespaceDefinition;
    }

    /**
     * Namespace Definition
     * <p>
     * Method used for computing final namespace in destination
     * (Required)
     * 
     */
    @JsonProperty("namespaceDefinition")
    public void setNamespaceDefinition(io.airbyte.config.JobSyncConfig.NamespaceDefinitionType namespaceDefinition) {
        this.namespaceDefinition = namespaceDefinition;
    }

    public StandardSync withNamespaceDefinition(io.airbyte.config.JobSyncConfig.NamespaceDefinitionType namespaceDefinition) {
        this.namespaceDefinition = namespaceDefinition;
        return this;
    }

    @JsonProperty("namespaceFormat")
    public String getNamespaceFormat() {
        return namespaceFormat;
    }

    @JsonProperty("namespaceFormat")
    public void setNamespaceFormat(String namespaceFormat) {
        this.namespaceFormat = namespaceFormat;
    }

    public StandardSync withNamespaceFormat(String namespaceFormat) {
        this.namespaceFormat = namespaceFormat;
        return this;
    }

    /**
     * Prefix that will be prepended to the name of each stream when it is written to the destination.
     * 
     */
    @JsonProperty("prefix")
    public String getPrefix() {
        return prefix;
    }

    /**
     * Prefix that will be prepended to the name of each stream when it is written to the destination.
     * 
     */
    @JsonProperty("prefix")
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public StandardSync withPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("sourceId")
    public UUID getSourceId() {
        return sourceId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("sourceId")
    public void setSourceId(UUID sourceId) {
        this.sourceId = sourceId;
    }

    public StandardSync withSourceId(UUID sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("destinationId")
    public UUID getDestinationId() {
        return destinationId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("destinationId")
    public void setDestinationId(UUID destinationId) {
        this.destinationId = destinationId;
    }

    public StandardSync withDestinationId(UUID destinationId) {
        this.destinationId = destinationId;
        return this;
    }

    @JsonProperty("operationIds")
    public List<UUID> getOperationIds() {
        return operationIds;
    }

    @JsonProperty("operationIds")
    public void setOperationIds(List<UUID> operationIds) {
        this.operationIds = operationIds;
    }

    public StandardSync withOperationIds(List<UUID> operationIds) {
        this.operationIds = operationIds;
        return this;
    }

    @JsonProperty("connectionId")
    public UUID getConnectionId() {
        return connectionId;
    }

    @JsonProperty("connectionId")
    public void setConnectionId(UUID connectionId) {
        this.connectionId = connectionId;
    }

    public StandardSync withConnectionId(UUID connectionId) {
        this.connectionId = connectionId;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public StandardSync withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("catalog")
    public ConfiguredAirbyteCatalog getCatalog() {
        return catalog;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("catalog")
    public void setCatalog(ConfiguredAirbyteCatalog catalog) {
        this.catalog = catalog;
    }

    public StandardSync withCatalog(ConfiguredAirbyteCatalog catalog) {
        this.catalog = catalog;
        return this;
    }

    /**
     * A map of StreamDescriptor to an indicator of whether field selection is enabled for that stream.
     * 
     */
    @JsonProperty("fieldSelectionData")
    public FieldSelectionData getFieldSelectionData() {
        return fieldSelectionData;
    }

    /**
     * A map of StreamDescriptor to an indicator of whether field selection is enabled for that stream.
     * 
     */
    @JsonProperty("fieldSelectionData")
    public void setFieldSelectionData(FieldSelectionData fieldSelectionData) {
        this.fieldSelectionData = fieldSelectionData;
    }

    public StandardSync withFieldSelectionData(FieldSelectionData fieldSelectionData) {
        this.fieldSelectionData = fieldSelectionData;
        return this;
    }

    @JsonProperty("status")
    public StandardSync.Status getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(StandardSync.Status status) {
        this.status = status;
    }

    public StandardSync withStatus(StandardSync.Status status) {
        this.status = status;
        return this;
    }

    @JsonProperty("schedule")
    public Schedule getSchedule() {
        return schedule;
    }

    @JsonProperty("schedule")
    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public StandardSync withSchedule(Schedule schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("manual")
    public Boolean getManual() {
        return manual;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("manual")
    public void setManual(Boolean manual) {
        this.manual = manual;
    }

    public StandardSync withManual(Boolean manual) {
        this.manual = manual;
        return this;
    }

    @JsonProperty("scheduleType")
    public StandardSync.ScheduleType getScheduleType() {
        return scheduleType;
    }

    @JsonProperty("scheduleType")
    public void setScheduleType(StandardSync.ScheduleType scheduleType) {
        this.scheduleType = scheduleType;
    }

    public StandardSync withScheduleType(StandardSync.ScheduleType scheduleType) {
        this.scheduleType = scheduleType;
        return this;
    }

    @JsonProperty("scheduleData")
    public ScheduleData getScheduleData() {
        return scheduleData;
    }

    @JsonProperty("scheduleData")
    public void setScheduleData(ScheduleData scheduleData) {
        this.scheduleData = scheduleData;
    }

    public StandardSync withScheduleData(ScheduleData scheduleData) {
        this.scheduleData = scheduleData;
        return this;
    }

    @JsonProperty("source_catalog_id")
    public UUID getSourceCatalogId() {
        return sourceCatalogId;
    }

    @JsonProperty("source_catalog_id")
    public void setSourceCatalogId(UUID sourceCatalogId) {
        this.sourceCatalogId = sourceCatalogId;
    }

    public StandardSync withSourceCatalogId(UUID sourceCatalogId) {
        this.sourceCatalogId = sourceCatalogId;
        return this;
    }

    /**
     * ResourceRequirements
     * <p>
     * generic configuration for pod source requirements
     * 
     */
    @JsonProperty("resourceRequirements")
    public ResourceRequirements getResourceRequirements() {
        return resourceRequirements;
    }

    /**
     * ResourceRequirements
     * <p>
     * generic configuration for pod source requirements
     * 
     */
    @JsonProperty("resourceRequirements")
    public void setResourceRequirements(ResourceRequirements resourceRequirements) {
        this.resourceRequirements = resourceRequirements;
    }

    public StandardSync withResourceRequirements(ResourceRequirements resourceRequirements) {
        this.resourceRequirements = resourceRequirements;
        return this;
    }

    /**
     * Geography
     * <p>
     * Geography Setting
     * (Required)
     * 
     */
    @JsonProperty("geography")
    public Geography getGeography() {
        return geography;
    }

    /**
     * Geography
     * <p>
     * Geography Setting
     * (Required)
     * 
     */
    @JsonProperty("geography")
    public void setGeography(Geography geography) {
        this.geography = geography;
    }

    public StandardSync withGeography(Geography geography) {
        this.geography = geography;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("breakingChange")
    public Boolean getBreakingChange() {
        return breakingChange;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("breakingChange")
    public void setBreakingChange(Boolean breakingChange) {
        this.breakingChange = breakingChange;
    }

    public StandardSync withBreakingChange(Boolean breakingChange) {
        this.breakingChange = breakingChange;
        return this;
    }

    @JsonProperty("notifySchemaChanges")
    public Boolean getNotifySchemaChanges() {
        return notifySchemaChanges;
    }

    @JsonProperty("notifySchemaChanges")
    public void setNotifySchemaChanges(Boolean notifySchemaChanges) {
        this.notifySchemaChanges = notifySchemaChanges;
    }

    public StandardSync withNotifySchemaChanges(Boolean notifySchemaChanges) {
        this.notifySchemaChanges = notifySchemaChanges;
        return this;
    }

    @JsonProperty("nonBreakingChangesPreference")
    public StandardSync.NonBreakingChangesPreference getNonBreakingChangesPreference() {
        return nonBreakingChangesPreference;
    }

    @JsonProperty("nonBreakingChangesPreference")
    public void setNonBreakingChangesPreference(StandardSync.NonBreakingChangesPreference nonBreakingChangesPreference) {
        this.nonBreakingChangesPreference = nonBreakingChangesPreference;
    }

    public StandardSync withNonBreakingChangesPreference(StandardSync.NonBreakingChangesPreference nonBreakingChangesPreference) {
        this.nonBreakingChangesPreference = nonBreakingChangesPreference;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StandardSync.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("namespaceDefinition");
        sb.append('=');
        sb.append(((this.namespaceDefinition == null)?"<null>":this.namespaceDefinition));
        sb.append(',');
        sb.append("namespaceFormat");
        sb.append('=');
        sb.append(((this.namespaceFormat == null)?"<null>":this.namespaceFormat));
        sb.append(',');
        sb.append("prefix");
        sb.append('=');
        sb.append(((this.prefix == null)?"<null>":this.prefix));
        sb.append(',');
        sb.append("sourceId");
        sb.append('=');
        sb.append(((this.sourceId == null)?"<null>":this.sourceId));
        sb.append(',');
        sb.append("destinationId");
        sb.append('=');
        sb.append(((this.destinationId == null)?"<null>":this.destinationId));
        sb.append(',');
        sb.append("operationIds");
        sb.append('=');
        sb.append(((this.operationIds == null)?"<null>":this.operationIds));
        sb.append(',');
        sb.append("connectionId");
        sb.append('=');
        sb.append(((this.connectionId == null)?"<null>":this.connectionId));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("catalog");
        sb.append('=');
        sb.append(((this.catalog == null)?"<null>":this.catalog));
        sb.append(',');
        sb.append("fieldSelectionData");
        sb.append('=');
        sb.append(((this.fieldSelectionData == null)?"<null>":this.fieldSelectionData));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("schedule");
        sb.append('=');
        sb.append(((this.schedule == null)?"<null>":this.schedule));
        sb.append(',');
        sb.append("manual");
        sb.append('=');
        sb.append(((this.manual == null)?"<null>":this.manual));
        sb.append(',');
        sb.append("scheduleType");
        sb.append('=');
        sb.append(((this.scheduleType == null)?"<null>":this.scheduleType));
        sb.append(',');
        sb.append("scheduleData");
        sb.append('=');
        sb.append(((this.scheduleData == null)?"<null>":this.scheduleData));
        sb.append(',');
        sb.append("sourceCatalogId");
        sb.append('=');
        sb.append(((this.sourceCatalogId == null)?"<null>":this.sourceCatalogId));
        sb.append(',');
        sb.append("resourceRequirements");
        sb.append('=');
        sb.append(((this.resourceRequirements == null)?"<null>":this.resourceRequirements));
        sb.append(',');
        sb.append("geography");
        sb.append('=');
        sb.append(((this.geography == null)?"<null>":this.geography));
        sb.append(',');
        sb.append("breakingChange");
        sb.append('=');
        sb.append(((this.breakingChange == null)?"<null>":this.breakingChange));
        sb.append(',');
        sb.append("notifySchemaChanges");
        sb.append('=');
        sb.append(((this.notifySchemaChanges == null)?"<null>":this.notifySchemaChanges));
        sb.append(',');
        sb.append("nonBreakingChangesPreference");
        sb.append('=');
        sb.append(((this.nonBreakingChangesPreference == null)?"<null>":this.nonBreakingChangesPreference));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.sourceId == null)? 0 :this.sourceId.hashCode()));
        result = ((result* 31)+((this.fieldSelectionData == null)? 0 :this.fieldSelectionData.hashCode()));
        result = ((result* 31)+((this.sourceCatalogId == null)? 0 :this.sourceCatalogId.hashCode()));
        result = ((result* 31)+((this.prefix == null)? 0 :this.prefix.hashCode()));
        result = ((result* 31)+((this.catalog == null)? 0 :this.catalog.hashCode()));
        result = ((result* 31)+((this.destinationId == null)? 0 :this.destinationId.hashCode()));
        result = ((result* 31)+((this.manual == null)? 0 :this.manual.hashCode()));
        result = ((result* 31)+((this.namespaceDefinition == null)? 0 :this.namespaceDefinition.hashCode()));
        result = ((result* 31)+((this.resourceRequirements == null)? 0 :this.resourceRequirements.hashCode()));
        result = ((result* 31)+((this.schedule == null)? 0 :this.schedule.hashCode()));
        result = ((result* 31)+((this.breakingChange == null)? 0 :this.breakingChange.hashCode()));
        result = ((result* 31)+((this.scheduleType == null)? 0 :this.scheduleType.hashCode()));
        result = ((result* 31)+((this.notifySchemaChanges == null)? 0 :this.notifySchemaChanges.hashCode()));
        result = ((result* 31)+((this.geography == null)? 0 :this.geography.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.namespaceFormat == null)? 0 :this.namespaceFormat.hashCode()));
        result = ((result* 31)+((this.operationIds == null)? 0 :this.operationIds.hashCode()));
        result = ((result* 31)+((this.connectionId == null)? 0 :this.connectionId.hashCode()));
        result = ((result* 31)+((this.scheduleData == null)? 0 :this.scheduleData.hashCode()));
        result = ((result* 31)+((this.nonBreakingChangesPreference == null)? 0 :this.nonBreakingChangesPreference.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StandardSync) == false) {
            return false;
        }
        StandardSync rhs = ((StandardSync) other);
        return ((((((((((((((((((((((this.sourceId == rhs.sourceId)||((this.sourceId!= null)&&this.sourceId.equals(rhs.sourceId)))&&((this.fieldSelectionData == rhs.fieldSelectionData)||((this.fieldSelectionData!= null)&&this.fieldSelectionData.equals(rhs.fieldSelectionData))))&&((this.sourceCatalogId == rhs.sourceCatalogId)||((this.sourceCatalogId!= null)&&this.sourceCatalogId.equals(rhs.sourceCatalogId))))&&((this.prefix == rhs.prefix)||((this.prefix!= null)&&this.prefix.equals(rhs.prefix))))&&((this.catalog == rhs.catalog)||((this.catalog!= null)&&this.catalog.equals(rhs.catalog))))&&((this.destinationId == rhs.destinationId)||((this.destinationId!= null)&&this.destinationId.equals(rhs.destinationId))))&&((this.manual == rhs.manual)||((this.manual!= null)&&this.manual.equals(rhs.manual))))&&((this.namespaceDefinition == rhs.namespaceDefinition)||((this.namespaceDefinition!= null)&&this.namespaceDefinition.equals(rhs.namespaceDefinition))))&&((this.resourceRequirements == rhs.resourceRequirements)||((this.resourceRequirements!= null)&&this.resourceRequirements.equals(rhs.resourceRequirements))))&&((this.schedule == rhs.schedule)||((this.schedule!= null)&&this.schedule.equals(rhs.schedule))))&&((this.breakingChange == rhs.breakingChange)||((this.breakingChange!= null)&&this.breakingChange.equals(rhs.breakingChange))))&&((this.scheduleType == rhs.scheduleType)||((this.scheduleType!= null)&&this.scheduleType.equals(rhs.scheduleType))))&&((this.notifySchemaChanges == rhs.notifySchemaChanges)||((this.notifySchemaChanges!= null)&&this.notifySchemaChanges.equals(rhs.notifySchemaChanges))))&&((this.geography == rhs.geography)||((this.geography!= null)&&this.geography.equals(rhs.geography))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.namespaceFormat == rhs.namespaceFormat)||((this.namespaceFormat!= null)&&this.namespaceFormat.equals(rhs.namespaceFormat))))&&((this.operationIds == rhs.operationIds)||((this.operationIds!= null)&&this.operationIds.equals(rhs.operationIds))))&&((this.connectionId == rhs.connectionId)||((this.connectionId!= null)&&this.connectionId.equals(rhs.connectionId))))&&((this.scheduleData == rhs.scheduleData)||((this.scheduleData!= null)&&this.scheduleData.equals(rhs.scheduleData))))&&((this.nonBreakingChangesPreference == rhs.nonBreakingChangesPreference)||((this.nonBreakingChangesPreference!= null)&&this.nonBreakingChangesPreference.equals(rhs.nonBreakingChangesPreference))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

    public enum NonBreakingChangesPreference {

        IGNORE("ignore"),
        DISABLE("disable");
        private final String value;
        private final static Map<String, StandardSync.NonBreakingChangesPreference> CONSTANTS = new HashMap<String, StandardSync.NonBreakingChangesPreference>();

        static {
            for (StandardSync.NonBreakingChangesPreference c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private NonBreakingChangesPreference(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static StandardSync.NonBreakingChangesPreference fromValue(String value) {
            StandardSync.NonBreakingChangesPreference constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum ScheduleType {

        MANUAL("Manual"),
        BASIC_SCHEDULE("BasicSchedule"),
        CRON("Cron");
        private final String value;
        private final static Map<String, StandardSync.ScheduleType> CONSTANTS = new HashMap<String, StandardSync.ScheduleType>();

        static {
            for (StandardSync.ScheduleType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private ScheduleType(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static StandardSync.ScheduleType fromValue(String value) {
            StandardSync.ScheduleType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum Status {

        ACTIVE("active"),
        INACTIVE("inactive"),
        DEPRECATED("deprecated");
        private final String value;
        private final static Map<String, StandardSync.Status> CONSTANTS = new HashMap<String, StandardSync.Status>();

        static {
            for (StandardSync.Status c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Status(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static StandardSync.Status fromValue(String value) {
            StandardSync.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
