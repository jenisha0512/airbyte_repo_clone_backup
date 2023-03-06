
package io.airbyte.config;

import java.io.Serializable;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.JsonNode;


/**
 * WorkspaceServiceAccount
 * <p>
 * service account attached to a workspace
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "workspaceId",
    "serviceAccountId",
    "serviceAccountEmail",
    "jsonCredential",
    "hmacKey"
})
public class WorkspaceServiceAccount implements Serializable
{

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
    @JsonProperty("serviceAccountId")
    private String serviceAccountId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("serviceAccountEmail")
    private String serviceAccountEmail;
    /**
     * Represents the JSON key generated for the service account
     * (Required)
     * 
     */
    @JsonProperty("jsonCredential")
    @JsonPropertyDescription("Represents the JSON key generated for the service account")
    private JsonNode jsonCredential;
    /**
     * Represents the secret and access id of generated HMAC key for the service account
     * (Required)
     * 
     */
    @JsonProperty("hmacKey")
    @JsonPropertyDescription("Represents the secret and access id of generated HMAC key for the service account")
    private JsonNode hmacKey;
    private final static long serialVersionUID = -5796095387462369356L;

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

    public WorkspaceServiceAccount withWorkspaceId(UUID workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("serviceAccountId")
    public String getServiceAccountId() {
        return serviceAccountId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("serviceAccountId")
    public void setServiceAccountId(String serviceAccountId) {
        this.serviceAccountId = serviceAccountId;
    }

    public WorkspaceServiceAccount withServiceAccountId(String serviceAccountId) {
        this.serviceAccountId = serviceAccountId;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("serviceAccountEmail")
    public String getServiceAccountEmail() {
        return serviceAccountEmail;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("serviceAccountEmail")
    public void setServiceAccountEmail(String serviceAccountEmail) {
        this.serviceAccountEmail = serviceAccountEmail;
    }

    public WorkspaceServiceAccount withServiceAccountEmail(String serviceAccountEmail) {
        this.serviceAccountEmail = serviceAccountEmail;
        return this;
    }

    /**
     * Represents the JSON key generated for the service account
     * (Required)
     * 
     */
    @JsonProperty("jsonCredential")
    public JsonNode getJsonCredential() {
        return jsonCredential;
    }

    /**
     * Represents the JSON key generated for the service account
     * (Required)
     * 
     */
    @JsonProperty("jsonCredential")
    public void setJsonCredential(JsonNode jsonCredential) {
        this.jsonCredential = jsonCredential;
    }

    public WorkspaceServiceAccount withJsonCredential(JsonNode jsonCredential) {
        this.jsonCredential = jsonCredential;
        return this;
    }

    /**
     * Represents the secret and access id of generated HMAC key for the service account
     * (Required)
     * 
     */
    @JsonProperty("hmacKey")
    public JsonNode getHmacKey() {
        return hmacKey;
    }

    /**
     * Represents the secret and access id of generated HMAC key for the service account
     * (Required)
     * 
     */
    @JsonProperty("hmacKey")
    public void setHmacKey(JsonNode hmacKey) {
        this.hmacKey = hmacKey;
    }

    public WorkspaceServiceAccount withHmacKey(JsonNode hmacKey) {
        this.hmacKey = hmacKey;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(WorkspaceServiceAccount.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("workspaceId");
        sb.append('=');
        sb.append(((this.workspaceId == null)?"<null>":this.workspaceId));
        sb.append(',');
        sb.append("serviceAccountId");
        sb.append('=');
        sb.append(((this.serviceAccountId == null)?"<null>":this.serviceAccountId));
        sb.append(',');
        sb.append("serviceAccountEmail");
        sb.append('=');
        sb.append(((this.serviceAccountEmail == null)?"<null>":this.serviceAccountEmail));
        sb.append(',');
        sb.append("jsonCredential");
        sb.append('=');
        sb.append(((this.jsonCredential == null)?"<null>":this.jsonCredential));
        sb.append(',');
        sb.append("hmacKey");
        sb.append('=');
        sb.append(((this.hmacKey == null)?"<null>":this.hmacKey));
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
        result = ((result* 31)+((this.serviceAccountId == null)? 0 :this.serviceAccountId.hashCode()));
        result = ((result* 31)+((this.serviceAccountEmail == null)? 0 :this.serviceAccountEmail.hashCode()));
        result = ((result* 31)+((this.jsonCredential == null)? 0 :this.jsonCredential.hashCode()));
        result = ((result* 31)+((this.hmacKey == null)? 0 :this.hmacKey.hashCode()));
        result = ((result* 31)+((this.workspaceId == null)? 0 :this.workspaceId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof WorkspaceServiceAccount) == false) {
            return false;
        }
        WorkspaceServiceAccount rhs = ((WorkspaceServiceAccount) other);
        return ((((((this.serviceAccountId == rhs.serviceAccountId)||((this.serviceAccountId!= null)&&this.serviceAccountId.equals(rhs.serviceAccountId)))&&((this.serviceAccountEmail == rhs.serviceAccountEmail)||((this.serviceAccountEmail!= null)&&this.serviceAccountEmail.equals(rhs.serviceAccountEmail))))&&((this.jsonCredential == rhs.jsonCredential)||((this.jsonCredential!= null)&&this.jsonCredential.equals(rhs.jsonCredential))))&&((this.hmacKey == rhs.hmacKey)||((this.hmacKey!= null)&&this.hmacKey.equals(rhs.hmacKey))))&&((this.workspaceId == rhs.workspaceId)||((this.workspaceId!= null)&&this.workspaceId.equals(rhs.workspaceId))));
    }

}
