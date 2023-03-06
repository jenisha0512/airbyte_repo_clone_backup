
package io.airbyte.config;

import java.io.Serializable;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ActorCatalogFetchEvent
 * <p>
 * Link actor to their actual catalog
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "actorId",
    "actorCatalogId",
    "configHash",
    "connectorVersion",
    "createdAt"
})
public class ActorCatalogFetchEvent implements Serializable
{

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    private UUID id;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("actorId")
    private UUID actorId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("actorCatalogId")
    private UUID actorCatalogId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("configHash")
    private String configHash;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("connectorVersion")
    private String connectorVersion;
    @JsonProperty("createdAt")
    private Long createdAt;
    private final static long serialVersionUID = -4018923165618498117L;

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

    public ActorCatalogFetchEvent withId(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("actorId")
    public UUID getActorId() {
        return actorId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("actorId")
    public void setActorId(UUID actorId) {
        this.actorId = actorId;
    }

    public ActorCatalogFetchEvent withActorId(UUID actorId) {
        this.actorId = actorId;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("actorCatalogId")
    public UUID getActorCatalogId() {
        return actorCatalogId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("actorCatalogId")
    public void setActorCatalogId(UUID actorCatalogId) {
        this.actorCatalogId = actorCatalogId;
    }

    public ActorCatalogFetchEvent withActorCatalogId(UUID actorCatalogId) {
        this.actorCatalogId = actorCatalogId;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("configHash")
    public String getConfigHash() {
        return configHash;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("configHash")
    public void setConfigHash(String configHash) {
        this.configHash = configHash;
    }

    public ActorCatalogFetchEvent withConfigHash(String configHash) {
        this.configHash = configHash;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("connectorVersion")
    public String getConnectorVersion() {
        return connectorVersion;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("connectorVersion")
    public void setConnectorVersion(String connectorVersion) {
        this.connectorVersion = connectorVersion;
    }

    public ActorCatalogFetchEvent withConnectorVersion(String connectorVersion) {
        this.connectorVersion = connectorVersion;
        return this;
    }

    @JsonProperty("createdAt")
    public Long getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("createdAt")
    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public ActorCatalogFetchEvent withCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ActorCatalogFetchEvent.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("actorId");
        sb.append('=');
        sb.append(((this.actorId == null)?"<null>":this.actorId));
        sb.append(',');
        sb.append("actorCatalogId");
        sb.append('=');
        sb.append(((this.actorCatalogId == null)?"<null>":this.actorCatalogId));
        sb.append(',');
        sb.append("configHash");
        sb.append('=');
        sb.append(((this.configHash == null)?"<null>":this.configHash));
        sb.append(',');
        sb.append("connectorVersion");
        sb.append('=');
        sb.append(((this.connectorVersion == null)?"<null>":this.connectorVersion));
        sb.append(',');
        sb.append("createdAt");
        sb.append('=');
        sb.append(((this.createdAt == null)?"<null>":this.createdAt));
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
        result = ((result* 31)+((this.createdAt == null)? 0 :this.createdAt.hashCode()));
        result = ((result* 31)+((this.actorId == null)? 0 :this.actorId.hashCode()));
        result = ((result* 31)+((this.actorCatalogId == null)? 0 :this.actorCatalogId.hashCode()));
        result = ((result* 31)+((this.connectorVersion == null)? 0 :this.connectorVersion.hashCode()));
        result = ((result* 31)+((this.configHash == null)? 0 :this.configHash.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ActorCatalogFetchEvent) == false) {
            return false;
        }
        ActorCatalogFetchEvent rhs = ((ActorCatalogFetchEvent) other);
        return (((((((this.createdAt == rhs.createdAt)||((this.createdAt!= null)&&this.createdAt.equals(rhs.createdAt)))&&((this.actorId == rhs.actorId)||((this.actorId!= null)&&this.actorId.equals(rhs.actorId))))&&((this.actorCatalogId == rhs.actorCatalogId)||((this.actorCatalogId!= null)&&this.actorCatalogId.equals(rhs.actorCatalogId))))&&((this.connectorVersion == rhs.connectorVersion)||((this.connectorVersion!= null)&&this.connectorVersion.equals(rhs.connectorVersion))))&&((this.configHash == rhs.configHash)||((this.configHash!= null)&&this.configHash.equals(rhs.configHash))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))));
    }

}
