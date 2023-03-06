
package io.airbyte.config;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.JsonNode;


/**
 * StandardWorkspace
 * <p>
 * workspace configuration
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "workspaceId",
    "customerId",
    "name",
    "slug",
    "email",
    "initialSetupComplete",
    "anonymousDataCollection",
    "news",
    "securityUpdates",
    "displaySetupWizard",
    "tombstone",
    "notifications",
    "firstCompletedSync",
    "feedbackDone",
    "defaultGeography",
    "webhookOperationConfigs"
})
public class StandardWorkspace implements Serializable
{

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("workspaceId")
    private UUID workspaceId;
    @JsonProperty("customerId")
    private UUID customerId;
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
    @JsonProperty("slug")
    private String slug;
    @JsonProperty("email")
    private String email;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("initialSetupComplete")
    private Boolean initialSetupComplete;
    @JsonProperty("anonymousDataCollection")
    private Boolean anonymousDataCollection;
    @JsonProperty("news")
    private Boolean news;
    @JsonProperty("securityUpdates")
    private Boolean securityUpdates;
    @JsonProperty("displaySetupWizard")
    private Boolean displaySetupWizard;
    /**
     * if not set or false, the configuration is active. if true, then this configuration is permanently off.
     * 
     */
    @JsonProperty("tombstone")
    @JsonPropertyDescription("if not set or false, the configuration is active. if true, then this configuration is permanently off.")
    private Boolean tombstone;
    @JsonProperty("notifications")
    private List<Notification> notifications = new ArrayList<Notification>();
    @JsonProperty("firstCompletedSync")
    private Boolean firstCompletedSync;
    @JsonProperty("feedbackDone")
    private Boolean feedbackDone;
    /**
     * Geography
     * <p>
     * Geography Setting
     * (Required)
     * 
     */
    @JsonProperty("defaultGeography")
    @JsonPropertyDescription("Geography Setting")
    private Geography defaultGeography;
    /**
     * Configurations for webhooks operations, stored as a JSON object so we can replace sensitive info with coordinates in the secrets manager. Must conform to WebhookOperationConfigs.yaml.
     * 
     */
    @JsonProperty("webhookOperationConfigs")
    @JsonPropertyDescription("Configurations for webhooks operations, stored as a JSON object so we can replace sensitive info with coordinates in the secrets manager. Must conform to WebhookOperationConfigs.yaml.")
    private JsonNode webhookOperationConfigs;
    private final static long serialVersionUID = 5539061331155219869L;

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

    public StandardWorkspace withWorkspaceId(UUID workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    @JsonProperty("customerId")
    public UUID getCustomerId() {
        return customerId;
    }

    @JsonProperty("customerId")
    public void setCustomerId(UUID customerId) {
        this.customerId = customerId;
    }

    public StandardWorkspace withCustomerId(UUID customerId) {
        this.customerId = customerId;
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

    public StandardWorkspace withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("slug")
    public String getSlug() {
        return slug;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("slug")
    public void setSlug(String slug) {
        this.slug = slug;
    }

    public StandardWorkspace withSlug(String slug) {
        this.slug = slug;
        return this;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    public StandardWorkspace withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("initialSetupComplete")
    public Boolean getInitialSetupComplete() {
        return initialSetupComplete;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("initialSetupComplete")
    public void setInitialSetupComplete(Boolean initialSetupComplete) {
        this.initialSetupComplete = initialSetupComplete;
    }

    public StandardWorkspace withInitialSetupComplete(Boolean initialSetupComplete) {
        this.initialSetupComplete = initialSetupComplete;
        return this;
    }

    @JsonProperty("anonymousDataCollection")
    public Boolean getAnonymousDataCollection() {
        return anonymousDataCollection;
    }

    @JsonProperty("anonymousDataCollection")
    public void setAnonymousDataCollection(Boolean anonymousDataCollection) {
        this.anonymousDataCollection = anonymousDataCollection;
    }

    public StandardWorkspace withAnonymousDataCollection(Boolean anonymousDataCollection) {
        this.anonymousDataCollection = anonymousDataCollection;
        return this;
    }

    @JsonProperty("news")
    public Boolean getNews() {
        return news;
    }

    @JsonProperty("news")
    public void setNews(Boolean news) {
        this.news = news;
    }

    public StandardWorkspace withNews(Boolean news) {
        this.news = news;
        return this;
    }

    @JsonProperty("securityUpdates")
    public Boolean getSecurityUpdates() {
        return securityUpdates;
    }

    @JsonProperty("securityUpdates")
    public void setSecurityUpdates(Boolean securityUpdates) {
        this.securityUpdates = securityUpdates;
    }

    public StandardWorkspace withSecurityUpdates(Boolean securityUpdates) {
        this.securityUpdates = securityUpdates;
        return this;
    }

    @JsonProperty("displaySetupWizard")
    public Boolean getDisplaySetupWizard() {
        return displaySetupWizard;
    }

    @JsonProperty("displaySetupWizard")
    public void setDisplaySetupWizard(Boolean displaySetupWizard) {
        this.displaySetupWizard = displaySetupWizard;
    }

    public StandardWorkspace withDisplaySetupWizard(Boolean displaySetupWizard) {
        this.displaySetupWizard = displaySetupWizard;
        return this;
    }

    /**
     * if not set or false, the configuration is active. if true, then this configuration is permanently off.
     * 
     */
    @JsonProperty("tombstone")
    public Boolean getTombstone() {
        return tombstone;
    }

    /**
     * if not set or false, the configuration is active. if true, then this configuration is permanently off.
     * 
     */
    @JsonProperty("tombstone")
    public void setTombstone(Boolean tombstone) {
        this.tombstone = tombstone;
    }

    public StandardWorkspace withTombstone(Boolean tombstone) {
        this.tombstone = tombstone;
        return this;
    }

    @JsonProperty("notifications")
    public List<Notification> getNotifications() {
        return notifications;
    }

    @JsonProperty("notifications")
    public void setNotifications(List<Notification> notifications) {
        this.notifications = notifications;
    }

    public StandardWorkspace withNotifications(List<Notification> notifications) {
        this.notifications = notifications;
        return this;
    }

    @JsonProperty("firstCompletedSync")
    public Boolean getFirstCompletedSync() {
        return firstCompletedSync;
    }

    @JsonProperty("firstCompletedSync")
    public void setFirstCompletedSync(Boolean firstCompletedSync) {
        this.firstCompletedSync = firstCompletedSync;
    }

    public StandardWorkspace withFirstCompletedSync(Boolean firstCompletedSync) {
        this.firstCompletedSync = firstCompletedSync;
        return this;
    }

    @JsonProperty("feedbackDone")
    public Boolean getFeedbackDone() {
        return feedbackDone;
    }

    @JsonProperty("feedbackDone")
    public void setFeedbackDone(Boolean feedbackDone) {
        this.feedbackDone = feedbackDone;
    }

    public StandardWorkspace withFeedbackDone(Boolean feedbackDone) {
        this.feedbackDone = feedbackDone;
        return this;
    }

    /**
     * Geography
     * <p>
     * Geography Setting
     * (Required)
     * 
     */
    @JsonProperty("defaultGeography")
    public Geography getDefaultGeography() {
        return defaultGeography;
    }

    /**
     * Geography
     * <p>
     * Geography Setting
     * (Required)
     * 
     */
    @JsonProperty("defaultGeography")
    public void setDefaultGeography(Geography defaultGeography) {
        this.defaultGeography = defaultGeography;
    }

    public StandardWorkspace withDefaultGeography(Geography defaultGeography) {
        this.defaultGeography = defaultGeography;
        return this;
    }

    /**
     * Configurations for webhooks operations, stored as a JSON object so we can replace sensitive info with coordinates in the secrets manager. Must conform to WebhookOperationConfigs.yaml.
     * 
     */
    @JsonProperty("webhookOperationConfigs")
    public JsonNode getWebhookOperationConfigs() {
        return webhookOperationConfigs;
    }

    /**
     * Configurations for webhooks operations, stored as a JSON object so we can replace sensitive info with coordinates in the secrets manager. Must conform to WebhookOperationConfigs.yaml.
     * 
     */
    @JsonProperty("webhookOperationConfigs")
    public void setWebhookOperationConfigs(JsonNode webhookOperationConfigs) {
        this.webhookOperationConfigs = webhookOperationConfigs;
    }

    public StandardWorkspace withWebhookOperationConfigs(JsonNode webhookOperationConfigs) {
        this.webhookOperationConfigs = webhookOperationConfigs;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StandardWorkspace.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("workspaceId");
        sb.append('=');
        sb.append(((this.workspaceId == null)?"<null>":this.workspaceId));
        sb.append(',');
        sb.append("customerId");
        sb.append('=');
        sb.append(((this.customerId == null)?"<null>":this.customerId));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("slug");
        sb.append('=');
        sb.append(((this.slug == null)?"<null>":this.slug));
        sb.append(',');
        sb.append("email");
        sb.append('=');
        sb.append(((this.email == null)?"<null>":this.email));
        sb.append(',');
        sb.append("initialSetupComplete");
        sb.append('=');
        sb.append(((this.initialSetupComplete == null)?"<null>":this.initialSetupComplete));
        sb.append(',');
        sb.append("anonymousDataCollection");
        sb.append('=');
        sb.append(((this.anonymousDataCollection == null)?"<null>":this.anonymousDataCollection));
        sb.append(',');
        sb.append("news");
        sb.append('=');
        sb.append(((this.news == null)?"<null>":this.news));
        sb.append(',');
        sb.append("securityUpdates");
        sb.append('=');
        sb.append(((this.securityUpdates == null)?"<null>":this.securityUpdates));
        sb.append(',');
        sb.append("displaySetupWizard");
        sb.append('=');
        sb.append(((this.displaySetupWizard == null)?"<null>":this.displaySetupWizard));
        sb.append(',');
        sb.append("tombstone");
        sb.append('=');
        sb.append(((this.tombstone == null)?"<null>":this.tombstone));
        sb.append(',');
        sb.append("notifications");
        sb.append('=');
        sb.append(((this.notifications == null)?"<null>":this.notifications));
        sb.append(',');
        sb.append("firstCompletedSync");
        sb.append('=');
        sb.append(((this.firstCompletedSync == null)?"<null>":this.firstCompletedSync));
        sb.append(',');
        sb.append("feedbackDone");
        sb.append('=');
        sb.append(((this.feedbackDone == null)?"<null>":this.feedbackDone));
        sb.append(',');
        sb.append("defaultGeography");
        sb.append('=');
        sb.append(((this.defaultGeography == null)?"<null>":this.defaultGeography));
        sb.append(',');
        sb.append("webhookOperationConfigs");
        sb.append('=');
        sb.append(((this.webhookOperationConfigs == null)?"<null>":this.webhookOperationConfigs));
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
        result = ((result* 31)+((this.news == null)? 0 :this.news.hashCode()));
        result = ((result* 31)+((this.webhookOperationConfigs == null)? 0 :this.webhookOperationConfigs.hashCode()));
        result = ((result* 31)+((this.tombstone == null)? 0 :this.tombstone.hashCode()));
        result = ((result* 31)+((this.defaultGeography == null)? 0 :this.defaultGeography.hashCode()));
        result = ((result* 31)+((this.displaySetupWizard == null)? 0 :this.displaySetupWizard.hashCode()));
        result = ((result* 31)+((this.initialSetupComplete == null)? 0 :this.initialSetupComplete.hashCode()));
        result = ((result* 31)+((this.anonymousDataCollection == null)? 0 :this.anonymousDataCollection.hashCode()));
        result = ((result* 31)+((this.customerId == null)? 0 :this.customerId.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.firstCompletedSync == null)? 0 :this.firstCompletedSync.hashCode()));
        result = ((result* 31)+((this.feedbackDone == null)? 0 :this.feedbackDone.hashCode()));
        result = ((result* 31)+((this.slug == null)? 0 :this.slug.hashCode()));
        result = ((result* 31)+((this.email == null)? 0 :this.email.hashCode()));
        result = ((result* 31)+((this.securityUpdates == null)? 0 :this.securityUpdates.hashCode()));
        result = ((result* 31)+((this.notifications == null)? 0 :this.notifications.hashCode()));
        result = ((result* 31)+((this.workspaceId == null)? 0 :this.workspaceId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StandardWorkspace) == false) {
            return false;
        }
        StandardWorkspace rhs = ((StandardWorkspace) other);
        return (((((((((((((((((this.news == rhs.news)||((this.news!= null)&&this.news.equals(rhs.news)))&&((this.webhookOperationConfigs == rhs.webhookOperationConfigs)||((this.webhookOperationConfigs!= null)&&this.webhookOperationConfigs.equals(rhs.webhookOperationConfigs))))&&((this.tombstone == rhs.tombstone)||((this.tombstone!= null)&&this.tombstone.equals(rhs.tombstone))))&&((this.defaultGeography == rhs.defaultGeography)||((this.defaultGeography!= null)&&this.defaultGeography.equals(rhs.defaultGeography))))&&((this.displaySetupWizard == rhs.displaySetupWizard)||((this.displaySetupWizard!= null)&&this.displaySetupWizard.equals(rhs.displaySetupWizard))))&&((this.initialSetupComplete == rhs.initialSetupComplete)||((this.initialSetupComplete!= null)&&this.initialSetupComplete.equals(rhs.initialSetupComplete))))&&((this.anonymousDataCollection == rhs.anonymousDataCollection)||((this.anonymousDataCollection!= null)&&this.anonymousDataCollection.equals(rhs.anonymousDataCollection))))&&((this.customerId == rhs.customerId)||((this.customerId!= null)&&this.customerId.equals(rhs.customerId))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.firstCompletedSync == rhs.firstCompletedSync)||((this.firstCompletedSync!= null)&&this.firstCompletedSync.equals(rhs.firstCompletedSync))))&&((this.feedbackDone == rhs.feedbackDone)||((this.feedbackDone!= null)&&this.feedbackDone.equals(rhs.feedbackDone))))&&((this.slug == rhs.slug)||((this.slug!= null)&&this.slug.equals(rhs.slug))))&&((this.email == rhs.email)||((this.email!= null)&&this.email.equals(rhs.email))))&&((this.securityUpdates == rhs.securityUpdates)||((this.securityUpdates!= null)&&this.securityUpdates.equals(rhs.securityUpdates))))&&((this.notifications == rhs.notifications)||((this.notifications!= null)&&this.notifications.equals(rhs.notifications))))&&((this.workspaceId == rhs.workspaceId)||((this.workspaceId!= null)&&this.workspaceId.equals(rhs.workspaceId))));
    }

}
