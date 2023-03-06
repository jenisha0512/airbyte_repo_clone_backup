
package io.airbyte.config;

import java.io.Serializable;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.JsonNode;


/**
 * DestinationOAuthParameter
 * <p>
 * OAuth parameters used when connecting to destination
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "oauthParameterId",
    "destinationDefinitionId",
    "workspaceId",
    "configuration"
})
public class DestinationOAuthParameter implements Serializable
{

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("oauthParameterId")
    private UUID oauthParameterId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("destinationDefinitionId")
    private UUID destinationDefinitionId;
    @JsonProperty("workspaceId")
    private UUID workspaceId;
    /**
     * Integration specific blob. Must be a valid JSON string.
     * (Required)
     * 
     */
    @JsonProperty("configuration")
    @JsonPropertyDescription("Integration specific blob. Must be a valid JSON string.")
    private JsonNode configuration;
    private final static long serialVersionUID = 6137360800674911831L;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("oauthParameterId")
    public UUID getOauthParameterId() {
        return oauthParameterId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("oauthParameterId")
    public void setOauthParameterId(UUID oauthParameterId) {
        this.oauthParameterId = oauthParameterId;
    }

    public DestinationOAuthParameter withOauthParameterId(UUID oauthParameterId) {
        this.oauthParameterId = oauthParameterId;
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

    public DestinationOAuthParameter withDestinationDefinitionId(UUID destinationDefinitionId) {
        this.destinationDefinitionId = destinationDefinitionId;
        return this;
    }

    @JsonProperty("workspaceId")
    public UUID getWorkspaceId() {
        return workspaceId;
    }

    @JsonProperty("workspaceId")
    public void setWorkspaceId(UUID workspaceId) {
        this.workspaceId = workspaceId;
    }

    public DestinationOAuthParameter withWorkspaceId(UUID workspaceId) {
        this.workspaceId = workspaceId;
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

    public DestinationOAuthParameter withConfiguration(JsonNode configuration) {
        this.configuration = configuration;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DestinationOAuthParameter.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("oauthParameterId");
        sb.append('=');
        sb.append(((this.oauthParameterId == null)?"<null>":this.oauthParameterId));
        sb.append(',');
        sb.append("destinationDefinitionId");
        sb.append('=');
        sb.append(((this.destinationDefinitionId == null)?"<null>":this.destinationDefinitionId));
        sb.append(',');
        sb.append("workspaceId");
        sb.append('=');
        sb.append(((this.workspaceId == null)?"<null>":this.workspaceId));
        sb.append(',');
        sb.append("configuration");
        sb.append('=');
        sb.append(((this.configuration == null)?"<null>":this.configuration));
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
        result = ((result* 31)+((this.destinationDefinitionId == null)? 0 :this.destinationDefinitionId.hashCode()));
        result = ((result* 31)+((this.configuration == null)? 0 :this.configuration.hashCode()));
        result = ((result* 31)+((this.oauthParameterId == null)? 0 :this.oauthParameterId.hashCode()));
        result = ((result* 31)+((this.workspaceId == null)? 0 :this.workspaceId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DestinationOAuthParameter) == false) {
            return false;
        }
        DestinationOAuthParameter rhs = ((DestinationOAuthParameter) other);
        return (((((this.destinationDefinitionId == rhs.destinationDefinitionId)||((this.destinationDefinitionId!= null)&&this.destinationDefinitionId.equals(rhs.destinationDefinitionId)))&&((this.configuration == rhs.configuration)||((this.configuration!= null)&&this.configuration.equals(rhs.configuration))))&&((this.oauthParameterId == rhs.oauthParameterId)||((this.oauthParameterId!= null)&&this.oauthParameterId.equals(rhs.oauthParameterId))))&&((this.workspaceId == rhs.workspaceId)||((this.workspaceId!= null)&&this.workspaceId.equals(rhs.workspaceId))));
    }

}
