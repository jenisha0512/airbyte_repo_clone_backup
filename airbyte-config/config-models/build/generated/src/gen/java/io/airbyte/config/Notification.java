
package io.airbyte.config;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Notification
 * <p>
 * Notification Settings
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "notificationType",
    "sendOnSuccess",
    "sendOnFailure",
    "slackConfiguration",
    "customerioConfiguration"
})
public class Notification implements Serializable
{

    /**
     * NotificationType
     * <p>
     * Type of notification
     * (Required)
     * 
     */
    @JsonProperty("notificationType")
    @JsonPropertyDescription("Type of notification")
    private Notification.NotificationType notificationType;
    @JsonProperty("sendOnSuccess")
    private Boolean sendOnSuccess = false;
    @JsonProperty("sendOnFailure")
    private Boolean sendOnFailure = true;
    /**
     * SlackNotificationConfiguration
     * <p>
     * Slack Notification Settings
     * 
     */
    @JsonProperty("slackConfiguration")
    @JsonPropertyDescription("Slack Notification Settings")
    private SlackNotificationConfiguration slackConfiguration;
    /**
     * CustomerioNotificationConfiguration
     * <p>
     * Customer.io Notification Settings
     * 
     */
    @JsonProperty("customerioConfiguration")
    @JsonPropertyDescription("Customer.io Notification Settings")
    private CustomerioNotificationConfiguration customerioConfiguration;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -8122431059498216404L;

    /**
     * NotificationType
     * <p>
     * Type of notification
     * (Required)
     * 
     */
    @JsonProperty("notificationType")
    public Notification.NotificationType getNotificationType() {
        return notificationType;
    }

    /**
     * NotificationType
     * <p>
     * Type of notification
     * (Required)
     * 
     */
    @JsonProperty("notificationType")
    public void setNotificationType(Notification.NotificationType notificationType) {
        this.notificationType = notificationType;
    }

    public Notification withNotificationType(Notification.NotificationType notificationType) {
        this.notificationType = notificationType;
        return this;
    }

    @JsonProperty("sendOnSuccess")
    public Boolean getSendOnSuccess() {
        return sendOnSuccess;
    }

    @JsonProperty("sendOnSuccess")
    public void setSendOnSuccess(Boolean sendOnSuccess) {
        this.sendOnSuccess = sendOnSuccess;
    }

    public Notification withSendOnSuccess(Boolean sendOnSuccess) {
        this.sendOnSuccess = sendOnSuccess;
        return this;
    }

    @JsonProperty("sendOnFailure")
    public Boolean getSendOnFailure() {
        return sendOnFailure;
    }

    @JsonProperty("sendOnFailure")
    public void setSendOnFailure(Boolean sendOnFailure) {
        this.sendOnFailure = sendOnFailure;
    }

    public Notification withSendOnFailure(Boolean sendOnFailure) {
        this.sendOnFailure = sendOnFailure;
        return this;
    }

    /**
     * SlackNotificationConfiguration
     * <p>
     * Slack Notification Settings
     * 
     */
    @JsonProperty("slackConfiguration")
    public SlackNotificationConfiguration getSlackConfiguration() {
        return slackConfiguration;
    }

    /**
     * SlackNotificationConfiguration
     * <p>
     * Slack Notification Settings
     * 
     */
    @JsonProperty("slackConfiguration")
    public void setSlackConfiguration(SlackNotificationConfiguration slackConfiguration) {
        this.slackConfiguration = slackConfiguration;
    }

    public Notification withSlackConfiguration(SlackNotificationConfiguration slackConfiguration) {
        this.slackConfiguration = slackConfiguration;
        return this;
    }

    /**
     * CustomerioNotificationConfiguration
     * <p>
     * Customer.io Notification Settings
     * 
     */
    @JsonProperty("customerioConfiguration")
    public CustomerioNotificationConfiguration getCustomerioConfiguration() {
        return customerioConfiguration;
    }

    /**
     * CustomerioNotificationConfiguration
     * <p>
     * Customer.io Notification Settings
     * 
     */
    @JsonProperty("customerioConfiguration")
    public void setCustomerioConfiguration(CustomerioNotificationConfiguration customerioConfiguration) {
        this.customerioConfiguration = customerioConfiguration;
    }

    public Notification withCustomerioConfiguration(CustomerioNotificationConfiguration customerioConfiguration) {
        this.customerioConfiguration = customerioConfiguration;
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

    public Notification withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Notification.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("notificationType");
        sb.append('=');
        sb.append(((this.notificationType == null)?"<null>":this.notificationType));
        sb.append(',');
        sb.append("sendOnSuccess");
        sb.append('=');
        sb.append(((this.sendOnSuccess == null)?"<null>":this.sendOnSuccess));
        sb.append(',');
        sb.append("sendOnFailure");
        sb.append('=');
        sb.append(((this.sendOnFailure == null)?"<null>":this.sendOnFailure));
        sb.append(',');
        sb.append("slackConfiguration");
        sb.append('=');
        sb.append(((this.slackConfiguration == null)?"<null>":this.slackConfiguration));
        sb.append(',');
        sb.append("customerioConfiguration");
        sb.append('=');
        sb.append(((this.customerioConfiguration == null)?"<null>":this.customerioConfiguration));
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
        result = ((result* 31)+((this.slackConfiguration == null)? 0 :this.slackConfiguration.hashCode()));
        result = ((result* 31)+((this.sendOnSuccess == null)? 0 :this.sendOnSuccess.hashCode()));
        result = ((result* 31)+((this.sendOnFailure == null)? 0 :this.sendOnFailure.hashCode()));
        result = ((result* 31)+((this.customerioConfiguration == null)? 0 :this.customerioConfiguration.hashCode()));
        result = ((result* 31)+((this.notificationType == null)? 0 :this.notificationType.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Notification) == false) {
            return false;
        }
        Notification rhs = ((Notification) other);
        return (((((((this.slackConfiguration == rhs.slackConfiguration)||((this.slackConfiguration!= null)&&this.slackConfiguration.equals(rhs.slackConfiguration)))&&((this.sendOnSuccess == rhs.sendOnSuccess)||((this.sendOnSuccess!= null)&&this.sendOnSuccess.equals(rhs.sendOnSuccess))))&&((this.sendOnFailure == rhs.sendOnFailure)||((this.sendOnFailure!= null)&&this.sendOnFailure.equals(rhs.sendOnFailure))))&&((this.customerioConfiguration == rhs.customerioConfiguration)||((this.customerioConfiguration!= null)&&this.customerioConfiguration.equals(rhs.customerioConfiguration))))&&((this.notificationType == rhs.notificationType)||((this.notificationType!= null)&&this.notificationType.equals(rhs.notificationType))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }


    /**
     * NotificationType
     * <p>
     * Type of notification
     * 
     */
    public enum NotificationType {

        SLACK("slack"),
        CUSTOMERIO("customerio");
        private final String value;
        private final static Map<String, Notification.NotificationType> CONSTANTS = new HashMap<String, Notification.NotificationType>();

        static {
            for (Notification.NotificationType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private NotificationType(String value) {
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
        public static Notification.NotificationType fromValue(String value) {
            Notification.NotificationType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
