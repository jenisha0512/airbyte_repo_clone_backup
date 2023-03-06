
package io.airbyte.config;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * SlackNotificationConfiguration
 * <p>
 * Slack Notification Settings
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "webhook"
})
public class SlackNotificationConfiguration implements Serializable
{

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("webhook")
    private String webhook;
    private final static long serialVersionUID = -7601942603836635575L;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("webhook")
    public String getWebhook() {
        return webhook;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("webhook")
    public void setWebhook(String webhook) {
        this.webhook = webhook;
    }

    public SlackNotificationConfiguration withWebhook(String webhook) {
        this.webhook = webhook;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SlackNotificationConfiguration.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("webhook");
        sb.append('=');
        sb.append(((this.webhook == null)?"<null>":this.webhook));
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
        result = ((result* 31)+((this.webhook == null)? 0 :this.webhook.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SlackNotificationConfiguration) == false) {
            return false;
        }
        SlackNotificationConfiguration rhs = ((SlackNotificationConfiguration) other);
        return ((this.webhook == rhs.webhook)||((this.webhook!= null)&&this.webhook.equals(rhs.webhook)));
    }

}
