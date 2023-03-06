
package io.airbyte.config;

import java.io.Serializable;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.JsonNode;


/**
 * DestinationConnection
 * <p>
 * information required for connection to a destination.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "destinationDefinitionId",
    "workspaceId",
    "destinationId",
    "configuration",
    "tombstone"
})
public class DestinationConnection implements Serializable
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
    @JsonProperty("destinationDefinitionId")
    private UUID destinationDefinitionId;
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
    @JsonProperty("destinationId")
    private UUID destinationId;
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
    private final static long serialVersionUID = -2507540589733675136L;

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

    public DestinationConnection withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("destinationDefinitionId")
    public UUID getDestinationDefinitionId() {
        return destinationDefinitionId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("destinationDefinitionId")
    public void setDestinationDefinitionId(UUID destinationDefinitionId) {
        this.destinationDefinitionId = destinationDefinitionId;
    }

    public DestinationConnection withDestinationDefinitionId(UUID destinationDefinitionId) {
        this.destinationDefinitionId = destinationDefinitionId;
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

    public DestinationConnection withWorkspaceId(UUID workspaceId) {
        this.workspaceId = workspaceId;
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

    public DestinationConnection withDestinationId(UUID destinationId) {
        this.destinationId = destinationId;
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

    public DestinationConnection withConfiguration(JsonNode configuration) {
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

    public DestinationConnection withTombstone(Boolean tombstone) {
        this.tombstone = tombstone;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DestinationConnection.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("destinationDefinitionId");
        sb.append('=');
        sb.append(((this.destinationDefinitionId == null)?"<null>":this.destinationDefinitionId));
        sb.append(',');
        sb.append("workspaceId");
        sb.append('=');
        sb.append(((this.workspaceId == null)?"<null>":this.workspaceId));
        sb.append(',');
        sb.append("destinationId");
        sb.append('=');
        sb.append(((this.destinationId == null)?"<null>":this.destinationId));
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
        result = ((result* 31)+((this.tombstone == null)? 0 :this.tombstone.hashCode()));
        result = ((result* 31)+((this.configuration == null)? 0 :this.configuration.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.destinationDefinitionId == null)? 0 :this.destinationDefinitionId.hashCode()));
        result = ((result* 31)+((this.destinationId == null)? 0 :this.destinationId.hashCode()));
        result = ((result* 31)+((this.workspaceId == null)? 0 :this.workspaceId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DestinationConnection) == false) {
            return false;
        }
        DestinationConnection rhs = ((DestinationConnection) other);
        return (((((((this.tombstone == rhs.tombstone)||((this.tombstone!= null)&&this.tombstone.equals(rhs.tombstone)))&&((this.configuration == rhs.configuration)||((this.configuration!= null)&&this.configuration.equals(rhs.configuration))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.destinationDefinitionId == rhs.destinationDefinitionId)||((this.destinationDefinitionId!= null)&&this.destinationDefinitionId.equals(rhs.destinationDefinitionId))))&&((this.destinationId == rhs.destinationId)||((this.destinationId!= null)&&this.destinationId.equals(rhs.destinationId))))&&((this.workspaceId == rhs.workspaceId)||((this.workspaceId!= null)&&this.workspaceId.equals(rhs.workspaceId))));
    }

}
