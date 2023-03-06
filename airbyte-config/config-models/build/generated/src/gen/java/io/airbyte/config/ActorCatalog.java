
package io.airbyte.config;

import java.io.Serializable;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.JsonNode;


/**
 * ActorCatalog
 * <p>
 * Catalog of an actor.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "catalog",
    "catalogHash"
})
public class ActorCatalog implements Serializable
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
    private final static long serialVersionUID = 433235783456519176L;

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

    public ActorCatalog withId(UUID id) {
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

    public ActorCatalog withCatalog(JsonNode catalog) {
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

    public ActorCatalog withCatalogHash(String catalogHash) {
        this.catalogHash = catalogHash;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ActorCatalog.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ActorCatalog) == false) {
            return false;
        }
        ActorCatalog rhs = ((ActorCatalog) other);
        return ((((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id)))&&((this.catalog == rhs.catalog)||((this.catalog!= null)&&this.catalog.equals(rhs.catalog))))&&((this.catalogHash == rhs.catalogHash)||((this.catalogHash!= null)&&this.catalogHash.equals(rhs.catalogHash))));
    }

}
