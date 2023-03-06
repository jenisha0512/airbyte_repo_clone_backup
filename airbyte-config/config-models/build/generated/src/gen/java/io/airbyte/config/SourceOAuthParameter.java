
package io.airbyte.config;

import java.io.Serializable;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.JsonNode;


/**
 * SourceOAuthParameter
 * <p>
 * OAuth parameters used when connecting to source
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "oauthParameterId",
    "sourceDefinitionId",
    "workspaceId",
    "configuration"
})
public class SourceOAuthParameter implements Serializable
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
    @JsonProperty("sourceDefinitionId")
    private UUID sourceDefinitionId;
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
    private final static long serialVersionUID = 6925807865313615208L;

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

    public SourceOAuthParameter withOauthParameterId(UUID oauthParameterId) {
        this.oauthParameterId = oauthParameterId;
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

    public SourceOAuthParameter withSourceDefinitionId(UUID sourceDefinitionId) {
        this.sourceDefinitionId = sourceDefinitionId;
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

    public SourceOAuthParameter withWorkspaceId(UUID workspaceId) {
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

    public SourceOAuthParameter withConfiguration(JsonNode configuration) {
        this.configuration = configuration;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SourceOAuthParameter.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("oauthParameterId");
        sb.append('=');
        sb.append(((this.oauthParameterId == null)?"<null>":this.oauthParameterId));
        sb.append(',');
        sb.append("sourceDefinitionId");
        sb.append('=');
        sb.append(((this.sourceDefinitionId == null)?"<null>":this.sourceDefinitionId));
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
        result = ((result* 31)+((this.sourceDefinitionId == null)? 0 :this.sourceDefinitionId.hashCode()));
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
        if ((other instanceof SourceOAuthParameter) == false) {
            return false;
        }
        SourceOAuthParameter rhs = ((SourceOAuthParameter) other);
        return (((((this.sourceDefinitionId == rhs.sourceDefinitionId)||((this.sourceDefinitionId!= null)&&this.sourceDefinitionId.equals(rhs.sourceDefinitionId)))&&((this.configuration == rhs.configuration)||((this.configuration!= null)&&this.configuration.equals(rhs.configuration))))&&((this.oauthParameterId == rhs.oauthParameterId)||((this.oauthParameterId!= null)&&this.oauthParameterId.equals(rhs.oauthParameterId))))&&((this.workspaceId == rhs.workspaceId)||((this.workspaceId!= null)&&this.workspaceId.equals(rhs.workspaceId))));
    }

}
