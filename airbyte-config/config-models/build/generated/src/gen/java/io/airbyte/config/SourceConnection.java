
package io.airbyte.config;

import java.io.Serializable;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.JsonNode;


/**
 * SourceConnection
 * <p>
 * information required for connection to a destination.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "sourceDefinitionId",
    "workspaceId",
    "sourceId",
    "configuration",
    "tombstone"
})
public class SourceConnection implements Serializable
{

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
    @JsonProperty("sourceDefinitionId")
    private UUID sourceDefinitionId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("workspaceId")
    private UUID workspaceId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("sourceId")
    private UUID sourceId;
    /**
     * Integration specific blob. Must be a valid JSON string.
     * (Required)
     * 
     */
    @JsonProperty("configuration")
    @JsonPropertyDescription("Integration specific blob. Must be a valid JSON string.")
    private JsonNode configuration;
    /**
     * if not set or false, the configuration is active. if true, then this configuration is permanently off.
     * (Required)
     * 
     */
    @JsonProperty("tombstone")
    @JsonPropertyDescription("if not set or false, the configuration is active. if true, then this configuration is permanently off.")
    private Boolean tombstone;
    private final static long serialVersionUID = 164204064790210771L;

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

    public SourceConnection withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("sourceDefinitionId")
    public UUID getSourceDefinitionId() {
        return sourceDefinitionId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("sourceDefinitionId")
    public void setSourceDefinitionId(UUID sourceDefinitionId) {
        this.sourceDefinitionId = sourceDefinitionId;
    }

    public SourceConnection withSourceDefinitionId(UUID sourceDefinitionId) {
        this.sourceDefinitionId = sourceDefinitionId;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("workspaceId")
    public UUID getWorkspaceId() {
        return workspaceId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("workspaceId")
    public void setWorkspaceId(UUID workspaceId) {
        this.workspaceId = workspaceId;
    }

    public SourceConnection withWorkspaceId(UUID workspaceId) {
        this.workspaceId = workspaceId;
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

    public SourceConnection withSourceId(UUID sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    /**
     * Integration specific blob. Must be a valid JSON string.
     * (Required)
     * 
     */
    @JsonProperty("configuration")
    public JsonNode getConfiguration() {
        return configuration;
    }

    /**
     * Integration specific blob. Must be a valid JSON string.
     * (Required)
     * 
     */
    @JsonProperty("configuration")
    public void setConfiguration(JsonNode configuration) {
        this.configuration = configuration;
    }

    public SourceConnection withConfiguration(JsonNode configuration) {
        this.configuration = configuration;
        return this;
    }

    /**
     * if not set or false, the configuration is active. if true, then this configuration is permanently off.
     * (Required)
     * 
     */
    @JsonProperty("tombstone")
    public Boolean getTombstone() {
        return tombstone;
    }

    /**
     * if not set or false, the configuration is active. if true, then this configuration is permanently off.
     * (Required)
     * 
     */
    @JsonProperty("tombstone")
    public void setTombstone(Boolean tombstone) {
        this.tombstone = tombstone;
    }

    public SourceConnection withTombstone(Boolean tombstone) {
        this.tombstone = tombstone;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SourceConnection.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("sourceDefinitionId");
        sb.append('=');
        sb.append(((this.sourceDefinitionId == null)?"<null>":this.sourceDefinitionId));
        sb.append(',');
        sb.append("workspaceId");
        sb.append('=');
        sb.append(((this.workspaceId == null)?"<null>":this.workspaceId));
        sb.append(',');
        sb.append("sourceId");
        sb.append('=');
        sb.append(((this.sourceId == null)?"<null>":this.sourceId));
        sb.append(',');
        sb.append("configuration");
        sb.append('=');
        sb.append(((this.configuration == null)?"<null>":this.configuration));
        sb.append(',');
        sb.append("tombstone");
        sb.append('=');
        sb.append(((this.tombstone == null)?"<null>":this.tombstone));
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
        result = ((result* 31)+((this.tombstone == null)? 0 :this.tombstone.hashCode()));
        result = ((result* 31)+((this.configuration == null)? 0 :this.configuration.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.sourceDefinitionId == null)? 0 :this.sourceDefinitionId.hashCode()));
        result = ((result* 31)+((this.workspaceId == null)? 0 :this.workspaceId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SourceConnection) == false) {
            return false;
        }
        SourceConnection rhs = ((SourceConnection) other);
        return (((((((this.sourceId == rhs.sourceId)||((this.sourceId!= null)&&this.sourceId.equals(rhs.sourceId)))&&((this.tombstone == rhs.tombstone)||((this.tombstone!= null)&&this.tombstone.equals(rhs.tombstone))))&&((this.configuration == rhs.configuration)||((this.configuration!= null)&&this.configuration.equals(rhs.configuration))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.sourceDefinitionId == rhs.sourceDefinitionId)||((this.sourceDefinitionId!= null)&&this.sourceDefinitionId.equals(rhs.sourceDefinitionId))))&&((this.workspaceId == rhs.workspaceId)||((this.workspaceId!= null)&&this.workspaceId.equals(rhs.workspaceId))));
    }

}
