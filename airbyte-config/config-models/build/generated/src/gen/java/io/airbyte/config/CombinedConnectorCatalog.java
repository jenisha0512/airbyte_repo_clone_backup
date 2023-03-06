
package io.airbyte.config;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CombinedConnectorCatalog
 * <p>
 * Used to provide the connector catalog from a remote source
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "destinations",
    "sources"
})
public class CombinedConnectorCatalog implements Serializable
{

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("destinations")
    private List<StandardDestinationDefinition> destinations = new ArrayList<StandardDestinationDefinition>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("sources")
    private List<StandardSourceDefinition> sources = new ArrayList<StandardSourceDefinition>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 396658135251683690L;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("destinations")
    public List<StandardDestinationDefinition> getDestinations() {
        return destinations;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("destinations")
    public void setDestinations(List<StandardDestinationDefinition> destinations) {
        this.destinations = destinations;
    }

    public CombinedConnectorCatalog withDestinations(List<StandardDestinationDefinition> destinations) {
        this.destinations = destinations;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("sources")
    public List<StandardSourceDefinition> getSources() {
        return sources;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("sources")
    public void setSources(List<StandardSourceDefinition> sources) {
        this.sources = sources;
    }

    public CombinedConnectorCatalog withSources(List<StandardSourceDefinition> sources) {
        this.sources = sources;
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

    public CombinedConnectorCatalog withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CombinedConnectorCatalog.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("destinations");
        sb.append('=');
        sb.append(((this.destinations == null)?"<null>":this.destinations));
        sb.append(',');
        sb.append("sources");
        sb.append('=');
        sb.append(((this.sources == null)?"<null>":this.sources));
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.sources == null)? 0 :this.sources.hashCode()));
        result = ((result* 31)+((this.destinations == null)? 0 :this.destinations.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CombinedConnectorCatalog) == false) {
            return false;
        }
        CombinedConnectorCatalog rhs = ((CombinedConnectorCatalog) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.sources == rhs.sources)||((this.sources!= null)&&this.sources.equals(rhs.sources))))&&((this.destinations == rhs.destinations)||((this.destinations!= null)&&this.destinations.equals(rhs.destinations))));
    }

}
