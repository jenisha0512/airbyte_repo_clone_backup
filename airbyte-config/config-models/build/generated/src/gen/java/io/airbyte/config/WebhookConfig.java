
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

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "authToken"
})
public class WebhookConfig implements Serializable
{

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    private UUID id;
    /**
     * human readable name for this webhook e.g., for UI display
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("human readable name for this webhook e.g., for UI display")
    private String name;
    /**
     * An auth token, to be passed as the value for an HTTP Authorization header. Note - must include prefix such as "Bearer <credential>".
     * 
     */
    @JsonProperty("authToken")
    @JsonPropertyDescription("An auth token, to be passed as the value for an HTTP Authorization header. Note - must include prefix such as \"Bearer <credential>\".")
    private String authToken;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 5305288490283420863L;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    public UUID getId() {
        return id;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(UUID id) {
        this.id = id;
    }

    public WebhookConfig withId(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * human readable name for this webhook e.g., for UI display
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * human readable name for this webhook e.g., for UI display
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public WebhookConfig withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * An auth token, to be passed as the value for an HTTP Authorization header. Note - must include prefix such as "Bearer <credential>".
     * 
     */
    @JsonProperty("authToken")
    public String getAuthToken() {
        return authToken;
    }

    /**
     * An auth token, to be passed as the value for an HTTP Authorization header. Note - must include prefix such as "Bearer <credential>".
     * 
     */
    @JsonProperty("authToken")
    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    public WebhookConfig withAuthToken(String authToken) {
        this.authToken = authToken;
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

    public WebhookConfig withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(WebhookConfig.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("authToken");
        sb.append('=');
        sb.append(((this.authToken == null)?"<null>":this.authToken));
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
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.authToken == null)? 0 :this.authToken.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof WebhookConfig) == false) {
            return false;
        }
        WebhookConfig rhs = ((WebhookConfig) other);
        return (((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.authToken == rhs.authToken)||((this.authToken!= null)&&this.authToken.equals(rhs.authToken))));
    }

}
