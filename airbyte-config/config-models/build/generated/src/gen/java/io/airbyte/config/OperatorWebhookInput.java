
package io.airbyte.config;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.JsonNode;


/**
 * OperatorWebhookInput
 * <p>
 * Execution input for a webhook operation
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "executionUrl",
    "executionBody",
    "webhookConfigId",
    "workspaceWebhookConfigs"
})
public class OperatorWebhookInput implements Serializable
{

    /**
     * URL to invoke the webhook via POST.
     * (Required)
     * 
     */
    @JsonProperty("executionUrl")
    @JsonPropertyDescription("URL to invoke the webhook via POST.")
    private String executionUrl;
    /**
     * Message body to be POSTed.
     * 
     */
    @JsonProperty("executionBody")
    @JsonPropertyDescription("Message body to be POSTed.")
    private String executionBody;
    /**
     * An id used to index into the workspaceWebhookConfigs, which has a list of webhook configs.
     * (Required)
     * 
     */
    @JsonProperty("webhookConfigId")
    @JsonPropertyDescription("An id used to index into the workspaceWebhookConfigs, which has a list of webhook configs.")
    private UUID webhookConfigId;
    /**
     * Webhook configs for this workspace. Must conform to WebhookOperationConfigs.yaml; any secrets must be hydrated before use.
     * 
     */
    @JsonProperty("workspaceWebhookConfigs")
    @JsonPropertyDescription("Webhook configs for this workspace. Must conform to WebhookOperationConfigs.yaml; any secrets must be hydrated before use.")
    private JsonNode workspaceWebhookConfigs;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 3749462238819623061L;

    /**
     * URL to invoke the webhook via POST.
     * (Required)
     * 
     */
    @JsonProperty("executionUrl")
    public String getExecutionUrl() {
        return executionUrl;
    }

    /**
     * URL to invoke the webhook via POST.
     * (Required)
     * 
     */
    @JsonProperty("executionUrl")
    public void setExecutionUrl(String executionUrl) {
        this.executionUrl = executionUrl;
    }

    public OperatorWebhookInput withExecutionUrl(String executionUrl) {
        this.executionUrl = executionUrl;
        return this;
    }

    /**
     * Message body to be POSTed.
     * 
     */
    @JsonProperty("executionBody")
    public String getExecutionBody() {
        return executionBody;
    }

    /**
     * Message body to be POSTed.
     * 
     */
    @JsonProperty("executionBody")
    public void setExecutionBody(String executionBody) {
        this.executionBody = executionBody;
    }

    public OperatorWebhookInput withExecutionBody(String executionBody) {
        this.executionBody = executionBody;
        return this;
    }

    /**
     * An id used to index into the workspaceWebhookConfigs, which has a list of webhook configs.
     * (Required)
     * 
     */
    @JsonProperty("webhookConfigId")
    public UUID getWebhookConfigId() {
        return webhookConfigId;
    }

    /**
     * An id used to index into the workspaceWebhookConfigs, which has a list of webhook configs.
     * (Required)
     * 
     */
    @JsonProperty("webhookConfigId")
    public void setWebhookConfigId(UUID webhookConfigId) {
        this.webhookConfigId = webhookConfigId;
    }

    public OperatorWebhookInput withWebhookConfigId(UUID webhookConfigId) {
        this.webhookConfigId = webhookConfigId;
        return this;
    }

    /**
     * Webhook configs for this workspace. Must conform to WebhookOperationConfigs.yaml; any secrets must be hydrated before use.
     * 
     */
    @JsonProperty("workspaceWebhookConfigs")
    public JsonNode getWorkspaceWebhookConfigs() {
        return workspaceWebhookConfigs;
    }

    /**
     * Webhook configs for this workspace. Must conform to WebhookOperationConfigs.yaml; any secrets must be hydrated before use.
     * 
     */
    @JsonProperty("workspaceWebhookConfigs")
    public void setWorkspaceWebhookConfigs(JsonNode workspaceWebhookConfigs) {
        this.workspaceWebhookConfigs = workspaceWebhookConfigs;
    }

    public OperatorWebhookInput withWorkspaceWebhookConfigs(JsonNode workspaceWebhookConfigs) {
        this.workspaceWebhookConfigs = workspaceWebhookConfigs;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public OperatorWebhookInput withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(OperatorWebhookInput.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("executionUrl");
        sb.append('=');
        sb.append(((this.executionUrl == null)?"<null>":this.executionUrl));
        sb.append(',');
        sb.append("executionBody");
        sb.append('=');
        sb.append(((this.executionBody == null)?"<null>":this.executionBody));
        sb.append(',');
        sb.append("webhookConfigId");
        sb.append('=');
        sb.append(((this.webhookConfigId == null)?"<null>":this.webhookConfigId));
        sb.append(',');
        sb.append("workspaceWebhookConfigs");
        sb.append('=');
        sb.append(((this.workspaceWebhookConfigs == null)?"<null>":this.workspaceWebhookConfigs));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
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
        result = ((result* 31)+((this.webhookConfigId == null)? 0 :this.webhookConfigId.hashCode()));
        result = ((result* 31)+((this.workspaceWebhookConfigs == null)? 0 :this.workspaceWebhookConfigs.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.executionUrl == null)? 0 :this.executionUrl.hashCode()));
        result = ((result* 31)+((this.executionBody == null)? 0 :this.executionBody.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OperatorWebhookInput) == false) {
            return false;
        }
        OperatorWebhookInput rhs = ((OperatorWebhookInput) other);
        return ((((((this.webhookConfigId == rhs.webhookConfigId)||((this.webhookConfigId!= null)&&this.webhookConfigId.equals(rhs.webhookConfigId)))&&((this.workspaceWebhookConfigs == rhs.workspaceWebhookConfigs)||((this.workspaceWebhookConfigs!= null)&&this.workspaceWebhookConfigs.equals(rhs.workspaceWebhookConfigs))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.executionUrl == rhs.executionUrl)||((this.executionUrl!= null)&&this.executionUrl.equals(rhs.executionUrl))))&&((this.executionBody == rhs.executionBody)||((this.executionBody!= null)&&this.executionBody.equals(rhs.executionBody))));
    }

}
