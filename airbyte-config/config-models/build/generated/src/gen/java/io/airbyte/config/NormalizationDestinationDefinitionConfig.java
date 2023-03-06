
package io.airbyte.config;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * NormalizationDestinationDefinitionConfig
 * <p>
 * describes a normalization config for destination definition
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "normalizationRepository",
    "normalizationTag",
    "normalizationIntegrationType"
})
public class NormalizationDestinationDefinitionConfig implements Serializable
{

    /**
     * a field indicating the name of the repository to be used for normalization. If the value of the flag is NULL - normalization is not used.
     * (Required)
     * 
     */
    @JsonProperty("normalizationRepository")
    @JsonPropertyDescription("a field indicating the name of the repository to be used for normalization. If the value of the flag is NULL - normalization is not used.")
    private String normalizationRepository;
    /**
     * a field indicating the tag of the docker repository to be used for normalization.
     * (Required)
     * 
     */
    @JsonProperty("normalizationTag")
    @JsonPropertyDescription("a field indicating the tag of the docker repository to be used for normalization.")
    private String normalizationTag;
    /**
     * a field indicating the type of integration dialect to use for normalization.
     * (Required)
     * 
     */
    @JsonProperty("normalizationIntegrationType")
    @JsonPropertyDescription("a field indicating the type of integration dialect to use for normalization.")
    private String normalizationIntegrationType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -9399522990908781L;

    /**
     * a field indicating the name of the repository to be used for normalization. If the value of the flag is NULL - normalization is not used.
     * (Required)
     * 
     */
    @JsonProperty("normalizationRepository")
    public String getNormalizationRepository() {
        return normalizationRepository;
    }

    /**
     * a field indicating the name of the repository to be used for normalization. If the value of the flag is NULL - normalization is not used.
     * (Required)
     * 
     */
    @JsonProperty("normalizationRepository")
    public void setNormalizationRepository(String normalizationRepository) {
        this.normalizationRepository = normalizationRepository;
    }

    public NormalizationDestinationDefinitionConfig withNormalizationRepository(String normalizationRepository) {
        this.normalizationRepository = normalizationRepository;
        return this;
    }

    /**
     * a field indicating the tag of the docker repository to be used for normalization.
     * (Required)
     * 
     */
    @JsonProperty("normalizationTag")
    public String getNormalizationTag() {
        return normalizationTag;
    }

    /**
     * a field indicating the tag of the docker repository to be used for normalization.
     * (Required)
     * 
     */
    @JsonProperty("normalizationTag")
    public void setNormalizationTag(String normalizationTag) {
        this.normalizationTag = normalizationTag;
    }

    public NormalizationDestinationDefinitionConfig withNormalizationTag(String normalizationTag) {
        this.normalizationTag = normalizationTag;
        return this;
    }

    /**
     * a field indicating the type of integration dialect to use for normalization.
     * (Required)
     * 
     */
    @JsonProperty("normalizationIntegrationType")
    public String getNormalizationIntegrationType() {
        return normalizationIntegrationType;
    }

    /**
     * a field indicating the type of integration dialect to use for normalization.
     * (Required)
     * 
     */
    @JsonProperty("normalizationIntegrationType")
    public void setNormalizationIntegrationType(String normalizationIntegrationType) {
        this.normalizationIntegrationType = normalizationIntegrationType;
    }

    public NormalizationDestinationDefinitionConfig withNormalizationIntegrationType(String normalizationIntegrationType) {
        this.normalizationIntegrationType = normalizationIntegrationType;
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

    public NormalizationDestinationDefinitionConfig withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(NormalizationDestinationDefinitionConfig.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("normalizationRepository");
        sb.append('=');
        sb.append(((this.normalizationRepository == null)?"<null>":this.normalizationRepository));
        sb.append(',');
        sb.append("normalizationTag");
        sb.append('=');
        sb.append(((this.normalizationTag == null)?"<null>":this.normalizationTag));
        sb.append(',');
        sb.append("normalizationIntegrationType");
        sb.append('=');
        sb.append(((this.normalizationIntegrationType == null)?"<null>":this.normalizationIntegrationType));
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
        result = ((result* 31)+((this.normalizationTag == null)? 0 :this.normalizationTag.hashCode()));
        result = ((result* 31)+((this.normalizationIntegrationType == null)? 0 :this.normalizationIntegrationType.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.normalizationRepository == null)? 0 :this.normalizationRepository.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NormalizationDestinationDefinitionConfig) == false) {
            return false;
        }
        NormalizationDestinationDefinitionConfig rhs = ((NormalizationDestinationDefinitionConfig) other);
        return (((((this.normalizationTag == rhs.normalizationTag)||((this.normalizationTag!= null)&&this.normalizationTag.equals(rhs.normalizationTag)))&&((this.normalizationIntegrationType == rhs.normalizationIntegrationType)||((this.normalizationIntegrationType!= null)&&this.normalizationIntegrationType.equals(rhs.normalizationIntegrationType))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.normalizationRepository == rhs.normalizationRepository)||((this.normalizationRepository!= null)&&this.normalizationRepository.equals(rhs.normalizationRepository))));
    }

}
