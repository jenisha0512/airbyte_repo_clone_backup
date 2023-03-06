
package io.airbyte.config;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * WebhookOperationConfigs
 * <p>
 * List of configurations for webhook operations
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "webhookConfigs"
})
public class WebhookOperationConfigs implements Serializable
{

    @JsonProperty("webhookConfigs")
    private List<WebhookConfig> webhookConfigs = new ArrayList<WebhookConfig>();
    private final static long serialVersionUID = 2388270726726143130L;

    @JsonProperty("webhookConfigs")
    public List<WebhookConfig> getWebhookConfigs() {
        return webhookConfigs;
    }

    @JsonProperty("webhookConfigs")
    public void setWebhookConfigs(List<WebhookConfig> webhookConfigs) {
        this.webhookConfigs = webhookConfigs;
    }

    public WebhookOperationConfigs withWebhookConfigs(List<WebhookConfig> webhookConfigs) {
        this.webhookConfigs = webhookConfigs;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(WebhookOperationConfigs.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("webhookConfigs");
        sb.append('=');
        sb.append(((this.webhookConfigs == null)?"<null>":this.webhookConfigs));
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
        result = ((result* 31)+((this.webhookConfigs == null)? 0 :this.webhookConfigs.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof WebhookOperationConfigs) == false) {
            return false;
        }
        WebhookOperationConfigs rhs = ((WebhookOperationConfigs) other);
        return ((this.webhookConfigs == rhs.webhookConfigs)||((this.webhookConfigs!= null)&&this.webhookConfigs.equals(rhs.webhookConfigs)));
    }

}
