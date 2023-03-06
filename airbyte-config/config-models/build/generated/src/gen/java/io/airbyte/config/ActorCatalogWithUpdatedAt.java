
package io.airbyte.config;

import java.io.Serializable;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.JsonNode;


/**
 * ActorCatalogWithUpdatedAt
 * <p>
 * Catalog of an actor with its most recent ActorCatalogFetchEvent created_at timestamp.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "catalog",
    "catalogHash",
    "updatedAt"
})
public class ActorCatalogWithUpdatedAt implements Serializable
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
    @JsonProperty("catalog")
    private JsonNode catalog;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("catalogHash")
    private String catalogHash;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("updatedAt")
    private Long updatedAt;
    private final static long serialVersionUID = -377964021380365184L;

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

    public ActorCatalogWithUpdatedAt withId(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("catalog")
    public JsonNode getCatalog() {
        return catalog;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("catalog")
    public void setCatalog(JsonNode catalog) {
        this.catalog = catalog;
    }

    public ActorCatalogWithUpdatedAt withCatalog(JsonNode catalog) {
        this.catalog = catalog;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("catalogHash")
    public String getCatalogHash() {
        return catalogHash;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("catalogHash")
    public void setCatalogHash(String catalogHash) {
        this.catalogHash = catalogHash;
    }

    public ActorCatalogWithUpdatedAt withCatalogHash(String catalogHash) {
        this.catalogHash = catalogHash;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("updatedAt")
    public Long getUpdatedAt() {
        return updatedAt;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("updatedAt")
    public void setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
    }

    public ActorCatalogWithUpdatedAt withUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ActorCatalogWithUpdatedAt.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("catalog");
        sb.append('=');
        sb.append(((this.catalog == null)?"<null>":this.catalog));
        sb.append(',');
        sb.append("catalogHash");
        sb.append('=');
        sb.append(((this.catalogHash == null)?"<null>":this.catalogHash));
        sb.append(',');
        sb.append("updatedAt");
        sb.append('=');
        sb.append(((this.updatedAt == null)?"<null>":this.updatedAt));
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
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.catalog == null)? 0 :this.catalog.hashCode()));
        result = ((result* 31)+((this.catalogHash == null)? 0 :this.catalogHash.hashCode()));
        result = ((result* 31)+((this.updatedAt == null)? 0 :this.updatedAt.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ActorCatalogWithUpdatedAt) == false) {
            return false;
        }
        ActorCatalogWithUpdatedAt rhs = ((ActorCatalogWithUpdatedAt) other);
        return (((((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id)))&&((this.catalog == rhs.catalog)||((this.catalog!= null)&&this.catalog.equals(rhs.catalog))))&&((this.catalogHash == rhs.catalogHash)||((this.catalogHash!= null)&&this.catalogHash.equals(rhs.catalogHash))))&&((this.updatedAt == rhs.updatedAt)||((this.updatedAt!= null)&&this.updatedAt.equals(rhs.updatedAt))));
    }

}
