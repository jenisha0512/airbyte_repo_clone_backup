/*
 * Airbyte Configuration API
 * Airbyte Configuration API [https://airbyte.io](https://airbyte.io).  This API is a collection of HTTP RPC-style methods. While it is not a REST API, those familiar with REST should find the conventions of this API recognizable.  Here are some conventions that this API follows: * All endpoints are http POST methods. * All endpoints accept data via `application/json` request bodies. The API does not accept any data via query params. * The naming convention for endpoints is: localhost:8000/{VERSION}/{METHOD_FAMILY}/{METHOD_NAME} e.g. `localhost:8000/v1/connections/create`. * For all `update` methods, the whole object must be passed in, even the fields that did not change.  Authentication (OSS): * When authenticating to the Configuration API, you must use Basic Authentication by setting the Authentication Header to Basic and base64 encoding the username and password (which are `airbyte` and `password` by default - so base64 encoding `airbyte:password` results in `YWlyYnl0ZTpwYXNzd29yZA==`). So the full header reads `'Authorization': \"Basic YWlyYnl0ZTpwYXNzd29yZA==\"` 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: contact@airbyte.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.airbyte.api.client.model.generated;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.airbyte.api.client.model.generated.Geography;
import io.airbyte.api.client.model.generated.Notification;
import io.airbyte.api.client.model.generated.WebhookConfigWrite;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Used to apply a patch-style update to a workspace, which means that null properties remain unchanged
 */
@ApiModel(description = "Used to apply a patch-style update to a workspace, which means that null properties remain unchanged")
@JsonPropertyOrder({
  WorkspaceUpdate.JSON_PROPERTY_WORKSPACE_ID,
  WorkspaceUpdate.JSON_PROPERTY_EMAIL,
  WorkspaceUpdate.JSON_PROPERTY_INITIAL_SETUP_COMPLETE,
  WorkspaceUpdate.JSON_PROPERTY_DISPLAY_SETUP_WIZARD,
  WorkspaceUpdate.JSON_PROPERTY_ANONYMOUS_DATA_COLLECTION,
  WorkspaceUpdate.JSON_PROPERTY_NEWS,
  WorkspaceUpdate.JSON_PROPERTY_SECURITY_UPDATES,
  WorkspaceUpdate.JSON_PROPERTY_NOTIFICATIONS,
  WorkspaceUpdate.JSON_PROPERTY_DEFAULT_GEOGRAPHY,
  WorkspaceUpdate.JSON_PROPERTY_WEBHOOK_CONFIGS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-28T19:52:03.511752+05:30[Asia/Kolkata]")
public class WorkspaceUpdate {
  public static final String JSON_PROPERTY_WORKSPACE_ID = "workspaceId";
  private UUID workspaceId;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_INITIAL_SETUP_COMPLETE = "initialSetupComplete";
  private Boolean initialSetupComplete;

  public static final String JSON_PROPERTY_DISPLAY_SETUP_WIZARD = "displaySetupWizard";
  private Boolean displaySetupWizard;

  public static final String JSON_PROPERTY_ANONYMOUS_DATA_COLLECTION = "anonymousDataCollection";
  private Boolean anonymousDataCollection;

  public static final String JSON_PROPERTY_NEWS = "news";
  private Boolean news;

  public static final String JSON_PROPERTY_SECURITY_UPDATES = "securityUpdates";
  private Boolean securityUpdates;

  public static final String JSON_PROPERTY_NOTIFICATIONS = "notifications";
  private List<Notification> notifications = null;

  public static final String JSON_PROPERTY_DEFAULT_GEOGRAPHY = "defaultGeography";
  private Geography defaultGeography;

  public static final String JSON_PROPERTY_WEBHOOK_CONFIGS = "webhookConfigs";
  private List<WebhookConfigWrite> webhookConfigs = null;

  public WorkspaceUpdate() { 
  }

  public WorkspaceUpdate workspaceId(UUID workspaceId) {
    this.workspaceId = workspaceId;
    return this;
  }

   /**
   * Get workspaceId
   * @return workspaceId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_WORKSPACE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getWorkspaceId() {
    return workspaceId;
  }


  @JsonProperty(JSON_PROPERTY_WORKSPACE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setWorkspaceId(UUID workspaceId) {
    this.workspaceId = workspaceId;
  }


  public WorkspaceUpdate email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmail() {
    return email;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmail(String email) {
    this.email = email;
  }


  public WorkspaceUpdate initialSetupComplete(Boolean initialSetupComplete) {
    this.initialSetupComplete = initialSetupComplete;
    return this;
  }

   /**
   * Get initialSetupComplete
   * @return initialSetupComplete
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INITIAL_SETUP_COMPLETE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getInitialSetupComplete() {
    return initialSetupComplete;
  }


  @JsonProperty(JSON_PROPERTY_INITIAL_SETUP_COMPLETE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInitialSetupComplete(Boolean initialSetupComplete) {
    this.initialSetupComplete = initialSetupComplete;
  }


  public WorkspaceUpdate displaySetupWizard(Boolean displaySetupWizard) {
    this.displaySetupWizard = displaySetupWizard;
    return this;
  }

   /**
   * Get displaySetupWizard
   * @return displaySetupWizard
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DISPLAY_SETUP_WIZARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDisplaySetupWizard() {
    return displaySetupWizard;
  }


  @JsonProperty(JSON_PROPERTY_DISPLAY_SETUP_WIZARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisplaySetupWizard(Boolean displaySetupWizard) {
    this.displaySetupWizard = displaySetupWizard;
  }


  public WorkspaceUpdate anonymousDataCollection(Boolean anonymousDataCollection) {
    this.anonymousDataCollection = anonymousDataCollection;
    return this;
  }

   /**
   * Get anonymousDataCollection
   * @return anonymousDataCollection
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ANONYMOUS_DATA_COLLECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAnonymousDataCollection() {
    return anonymousDataCollection;
  }


  @JsonProperty(JSON_PROPERTY_ANONYMOUS_DATA_COLLECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAnonymousDataCollection(Boolean anonymousDataCollection) {
    this.anonymousDataCollection = anonymousDataCollection;
  }


  public WorkspaceUpdate news(Boolean news) {
    this.news = news;
    return this;
  }

   /**
   * Get news
   * @return news
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NEWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getNews() {
    return news;
  }


  @JsonProperty(JSON_PROPERTY_NEWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNews(Boolean news) {
    this.news = news;
  }


  public WorkspaceUpdate securityUpdates(Boolean securityUpdates) {
    this.securityUpdates = securityUpdates;
    return this;
  }

   /**
   * Get securityUpdates
   * @return securityUpdates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SECURITY_UPDATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSecurityUpdates() {
    return securityUpdates;
  }


  @JsonProperty(JSON_PROPERTY_SECURITY_UPDATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSecurityUpdates(Boolean securityUpdates) {
    this.securityUpdates = securityUpdates;
  }


  public WorkspaceUpdate notifications(List<Notification> notifications) {
    this.notifications = notifications;
    return this;
  }

  public WorkspaceUpdate addNotificationsItem(Notification notificationsItem) {
    if (this.notifications == null) {
      this.notifications = new ArrayList<>();
    }
    this.notifications.add(notificationsItem);
    return this;
  }

   /**
   * Get notifications
   * @return notifications
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NOTIFICATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Notification> getNotifications() {
    return notifications;
  }


  @JsonProperty(JSON_PROPERTY_NOTIFICATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNotifications(List<Notification> notifications) {
    this.notifications = notifications;
  }


  public WorkspaceUpdate defaultGeography(Geography defaultGeography) {
    this.defaultGeography = defaultGeography;
    return this;
  }

   /**
   * Get defaultGeography
   * @return defaultGeography
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DEFAULT_GEOGRAPHY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Geography getDefaultGeography() {
    return defaultGeography;
  }


  @JsonProperty(JSON_PROPERTY_DEFAULT_GEOGRAPHY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefaultGeography(Geography defaultGeography) {
    this.defaultGeography = defaultGeography;
  }


  public WorkspaceUpdate webhookConfigs(List<WebhookConfigWrite> webhookConfigs) {
    this.webhookConfigs = webhookConfigs;
    return this;
  }

  public WorkspaceUpdate addWebhookConfigsItem(WebhookConfigWrite webhookConfigsItem) {
    if (this.webhookConfigs == null) {
      this.webhookConfigs = new ArrayList<>();
    }
    this.webhookConfigs.add(webhookConfigsItem);
    return this;
  }

   /**
   * Get webhookConfigs
   * @return webhookConfigs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_WEBHOOK_CONFIGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<WebhookConfigWrite> getWebhookConfigs() {
    return webhookConfigs;
  }


  @JsonProperty(JSON_PROPERTY_WEBHOOK_CONFIGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWebhookConfigs(List<WebhookConfigWrite> webhookConfigs) {
    this.webhookConfigs = webhookConfigs;
  }


  /**
   * Return true if this WorkspaceUpdate object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkspaceUpdate workspaceUpdate = (WorkspaceUpdate) o;
    return Objects.equals(this.workspaceId, workspaceUpdate.workspaceId) &&
        Objects.equals(this.email, workspaceUpdate.email) &&
        Objects.equals(this.initialSetupComplete, workspaceUpdate.initialSetupComplete) &&
        Objects.equals(this.displaySetupWizard, workspaceUpdate.displaySetupWizard) &&
        Objects.equals(this.anonymousDataCollection, workspaceUpdate.anonymousDataCollection) &&
        Objects.equals(this.news, workspaceUpdate.news) &&
        Objects.equals(this.securityUpdates, workspaceUpdate.securityUpdates) &&
        Objects.equals(this.notifications, workspaceUpdate.notifications) &&
        Objects.equals(this.defaultGeography, workspaceUpdate.defaultGeography) &&
        Objects.equals(this.webhookConfigs, workspaceUpdate.webhookConfigs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workspaceId, email, initialSetupComplete, displaySetupWizard, anonymousDataCollection, news, securityUpdates, notifications, defaultGeography, webhookConfigs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkspaceUpdate {\n");
    sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    initialSetupComplete: ").append(toIndentedString(initialSetupComplete)).append("\n");
    sb.append("    displaySetupWizard: ").append(toIndentedString(displaySetupWizard)).append("\n");
    sb.append("    anonymousDataCollection: ").append(toIndentedString(anonymousDataCollection)).append("\n");
    sb.append("    news: ").append(toIndentedString(news)).append("\n");
    sb.append("    securityUpdates: ").append(toIndentedString(securityUpdates)).append("\n");
    sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
    sb.append("    defaultGeography: ").append(toIndentedString(defaultGeography)).append("\n");
    sb.append("    webhookConfigs: ").append(toIndentedString(webhookConfigs)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
