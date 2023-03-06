
package io.airbyte.config;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.JsonNode;
import io.airbyte.protocol.models.ConfiguredAirbyteCatalog;


/**
 * NormalizationInput
 * <p>
 * job normalization config
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "destinationConfiguration",
    "catalog",
    "resourceRequirements"
})
public class NormalizationInput implements Serializable
{

    /**
     * Integration specific blob. Must be a valid JSON string.
     * (Required)
     * 
     */
    @JsonProperty("destinationConfiguration")
    @JsonPropertyDescription("Integration specific blob. Must be a valid JSON string.")
    private JsonNode destinationConfiguration;
    /**
     * the configured airbyte catalog. this version of the catalog represents the schema of the data in json blobs in the raw tables.
     * (Required)
     * 
     */
    @JsonProperty("catalog")
    @JsonPropertyDescription("the configured airbyte catalog. this version of the catalog represents the schema of the data in json blobs in the raw tables.")
    private ConfiguredAirbyteCatalog catalog;
    /**
     * optional resource requirements to run sync workers
     * 
     */
    @JsonProperty("resourceRequirements")
    @JsonPropertyDescription("optional resource requirements to run sync workers")
    private ResourceRequirements resourceRequirements;
    private final static long serialVersionUID = 9081691700577823052L;

    /**
     * Integration specific blob. Must be a valid JSON string.
     * (Required)
     * 
     */
    @JsonProperty("destinationConfiguration")
    public JsonNode getDestinationConfiguration() {
        return destinationConfiguration;
    }

    /**
     * Integration specific blob. Must be a valid JSON string.
     * (Required)
     * 
     */
    @JsonProperty("destinationConfiguration")
    public void setDestinationConfiguration(JsonNode destinationConfiguration) {
        this.destinationConfiguration = destinationConfiguration;
    }

    public NormalizationInput withDestinationConfiguration(JsonNode destinationConfiguration) {
        this.destinationConfiguration = destinationConfiguration;
        return this;
    }

    /**
     * the configured airbyte catalog. this version of the catalog represents the schema of the data in json blobs in the raw tables.
     * (Required)
     * 
     */
    @JsonProperty("catalog")
    public ConfiguredAirbyteCatalog getCatalog() {
        return catalog;
    }

    /**
     * the configured airbyte catalog. this version of the catalog represents the schema of the data in json blobs in the raw tables.
     * (Required)
     * 
     */
    @JsonProperty("catalog")
    public void setCatalog(ConfiguredAirbyteCatalog catalog) {
        this.catalog = catalog;
    }

    public NormalizationInput withCatalog(ConfiguredAirbyteCatalog catalog) {
        this.catalog = catalog;
        return this;
    }

    /**
     * optional resource requirements to run sync workers
     * 
     */
    @JsonProperty("resourceRequirements")
    public ResourceRequirements getResourceRequirements() {
        return resourceRequirements;
    }

    /**
     * optional resource requirements to run sync workers
     * 
     */
    @JsonProperty("resourceRequirements")
    public void setResourceRequirements(ResourceRequirements resourceRequirements) {
        this.resourceRequirements = resourceRequirements;
    }

    public NormalizationInput withResourceRequirements(ResourceRequirements resourceRequirements) {
        this.resourceRequirements = resourceRequirements;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(NormalizationInput.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("destinationConfiguration");
        sb.append('=');
        sb.append(((this.destinationConfiguration == null)?"<null>":this.destinationConfiguration));
        sb.append(',');
        sb.append("catalog");
        sb.append('=');
        sb.append(((this.catalog == null)?"<null>":this.catalog));
        sb.append(',');
        sb.append("resourceRequirements");
        sb.append('=');
        sb.append(((this.resourceRequirements == null)?"<null>":this.resourceRequirements));
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
        result = ((result* 31)+((this.resourceRequirements == null)? 0 :this.resourceRequirements.hashCode()));
        result = ((result* 31)+((this.destinationConfiguration == null)? 0 :this.destinationConfiguration.hashCode()));
        result = ((result* 31)+((this.catalog == null)? 0 :this.catalog.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NormalizationInput) == false) {
            return false;
        }
        NormalizationInput rhs = ((NormalizationInput) other);
        return ((((this.resourceRequirements == rhs.resourceRequirements)||((this.resourceRequirements!= null)&&this.resourceRequirements.equals(rhs.resourceRequirements)))&&((this.destinationConfiguration == rhs.destinationConfiguration)||((this.destinationConfiguration!= null)&&this.destinationConfiguration.equals(rhs.destinationConfiguration))))&&((this.catalog == rhs.catalog)||((this.catalog!= null)&&this.catalog.equals(rhs.catalog))));
    }

}
