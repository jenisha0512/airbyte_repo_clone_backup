
package io.airbyte.config;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import io.airbyte.protocol.models.ConnectorSpecification;


/**
 * StandardDestinationDefinition
 * <p>
 * describes a destination
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "destinationDefinitionId",
    "name",
    "dockerRepository",
    "dockerImageTag",
    "documentationUrl",
    "icon",
    "spec",
    "tombstone",
    "public",
    "custom",
    "releaseStage",
    "releaseDate",
    "resourceRequirements",
    "protocolVersion",
    "normalizationConfig",
    "supportsDbt",
    "allowedHosts"
})
public class StandardDestinationDefinition implements Serializable
{

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("destinationDefinitionId")
    private UUID destinationDefinitionId;
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
    @JsonProperty("dockerRepository")
    private String dockerRepository;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("dockerImageTag")
    private String dockerImageTag;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("documentationUrl")
    private String documentationUrl;
    @JsonProperty("icon")
    private String icon;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("spec")
    private ConnectorSpecification spec;
    /**
     * if false, the configuration is active. if true, then this configuration is permanently off.
     * 
     */
    @JsonProperty("tombstone")
    @JsonPropertyDescription("if false, the configuration is active. if true, then this configuration is permanently off.")
    private Boolean tombstone = false;
    /**
     * true if this connector definition is available to all workspaces
     * 
     */
    @JsonProperty("public")
    @JsonPropertyDescription("true if this connector definition is available to all workspaces")
    private Boolean _public = false;
    /**
     * whether this is a custom connector definition
     * 
     */
    @JsonProperty("custom")
    @JsonPropertyDescription("whether this is a custom connector definition")
    private Boolean custom = false;
    @JsonProperty("releaseStage")
    private StandardDestinationDefinition.ReleaseStage releaseStage;
    /**
     * The date when this connector was first released, in yyyy-mm-dd format.
     * 
     */
    @JsonProperty("releaseDate")
    @JsonPropertyDescription("The date when this connector was first released, in yyyy-mm-dd format.")
    private String releaseDate;
    /**
     * ActorDefinitionResourceRequirements
     * <p>
     * actor definition specific resource requirements
     * 
     */
    @JsonProperty("resourceRequirements")
    @JsonPropertyDescription("actor definition specific resource requirements")
    private ActorDefinitionResourceRequirements resourceRequirements;
    /**
     * the Airbyte Protocol version supported by the connector
     * 
     */
    @JsonProperty("protocolVersion")
    @JsonPropertyDescription("the Airbyte Protocol version supported by the connector")
    private String protocolVersion;
    /**
     * NormalizationDestinationDefinitionConfig
     * <p>
     * describes a normalization config for destination definition
     * 
     */
    @JsonProperty("normalizationConfig")
    @JsonPropertyDescription("describes a normalization config for destination definition")
    private NormalizationDestinationDefinitionConfig normalizationConfig;
    /**
     * an optional flag indicating whether DBT is used in the normalization. If the flag value is NULL - DBT is not used.
     * 
     */
    @JsonProperty("supportsDbt")
    @JsonPropertyDescription("an optional flag indicating whether DBT is used in the normalization. If the flag value is NULL - DBT is not used.")
    private Boolean supportsDbt;
    /**
     * AllowedHosts
     * <p>
     * A connector's allowed hosts.  If present, the platform will limit communication to only hosts which are listed in `AllowedHosts.hosts`.
     * 
     */
    @JsonProperty("allowedHosts")
    @JsonPropertyDescription("A connector's allowed hosts.  If present, the platform will limit communication to only hosts which are listed in `AllowedHosts.hosts`.")
    private AllowedHosts allowedHosts;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 6224182968387694888L;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("destinationDefinitionId")
    public UUID getDestinationDefinitionId() {
        return destinationDefinitionId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("destinationDefinitionId")
    public void setDestinationDefinitionId(UUID destinationDefinitionId) {
        this.destinationDefinitionId = destinationDefinitionId;
    }

    public StandardDestinationDefinition withDestinationDefinitionId(UUID destinationDefinitionId) {
        this.destinationDefinitionId = destinationDefinitionId;
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

    public StandardDestinationDefinition withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("dockerRepository")
    public String getDockerRepository() {
        return dockerRepository;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("dockerRepository")
    public void setDockerRepository(String dockerRepository) {
        this.dockerRepository = dockerRepository;
    }

    public StandardDestinationDefinition withDockerRepository(String dockerRepository) {
        this.dockerRepository = dockerRepository;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("dockerImageTag")
    public String getDockerImageTag() {
        return dockerImageTag;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("dockerImageTag")
    public void setDockerImageTag(String dockerImageTag) {
        this.dockerImageTag = dockerImageTag;
    }

    public StandardDestinationDefinition withDockerImageTag(String dockerImageTag) {
        this.dockerImageTag = dockerImageTag;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("documentationUrl")
    public String getDocumentationUrl() {
        return documentationUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("documentationUrl")
    public void setDocumentationUrl(String documentationUrl) {
        this.documentationUrl = documentationUrl;
    }

    public StandardDestinationDefinition withDocumentationUrl(String documentationUrl) {
        this.documentationUrl = documentationUrl;
        return this;
    }

    @JsonProperty("icon")
    public String getIcon() {
        return icon;
    }

    @JsonProperty("icon")
    public void setIcon(String icon) {
        this.icon = icon;
    }

    public StandardDestinationDefinition withIcon(String icon) {
        this.icon = icon;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("spec")
    public ConnectorSpecification getSpec() {
        return spec;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("spec")
    public void setSpec(ConnectorSpecification spec) {
        this.spec = spec;
    }

    public StandardDestinationDefinition withSpec(ConnectorSpecification spec) {
        this.spec = spec;
        return this;
    }

    /**
     * if false, the configuration is active. if true, then this configuration is permanently off.
     * 
     */
    @JsonProperty("tombstone")
    public Boolean getTombstone() {
        return tombstone;
    }

    /**
     * if false, the configuration is active. if true, then this configuration is permanently off.
     * 
     */
    @JsonProperty("tombstone")
    public void setTombstone(Boolean tombstone) {
        this.tombstone = tombstone;
    }

    public StandardDestinationDefinition withTombstone(Boolean tombstone) {
        this.tombstone = tombstone;
        return this;
    }

    /**
     * true if this connector definition is available to all workspaces
     * 
     */
    @JsonProperty("public")
    public Boolean getPublic() {
        return _public;
    }

    /**
     * true if this connector definition is available to all workspaces
     * 
     */
    @JsonProperty("public")
    public void setPublic(Boolean _public) {
        this._public = _public;
    }

    public StandardDestinationDefinition withPublic(Boolean _public) {
        this._public = _public;
        return this;
    }

    /**
     * whether this is a custom connector definition
     * 
     */
    @JsonProperty("custom")
    public Boolean getCustom() {
        return custom;
    }

    /**
     * whether this is a custom connector definition
     * 
     */
    @JsonProperty("custom")
    public void setCustom(Boolean custom) {
        this.custom = custom;
    }

    public StandardDestinationDefinition withCustom(Boolean custom) {
        this.custom = custom;
        return this;
    }

    @JsonProperty("releaseStage")
    public StandardDestinationDefinition.ReleaseStage getReleaseStage() {
        return releaseStage;
    }

    @JsonProperty("releaseStage")
    public void setReleaseStage(StandardDestinationDefinition.ReleaseStage releaseStage) {
        this.releaseStage = releaseStage;
    }

    public StandardDestinationDefinition withReleaseStage(StandardDestinationDefinition.ReleaseStage releaseStage) {
        this.releaseStage = releaseStage;
        return this;
    }

    /**
     * The date when this connector was first released, in yyyy-mm-dd format.
     * 
     */
    @JsonProperty("releaseDate")
    public String getReleaseDate() {
        return releaseDate;
    }

    /**
     * The date when this connector was first released, in yyyy-mm-dd format.
     * 
     */
    @JsonProperty("releaseDate")
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public StandardDestinationDefinition withReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
        return this;
    }

    /**
     * ActorDefinitionResourceRequirements
     * <p>
     * actor definition specific resource requirements
     * 
     */
    @JsonProperty("resourceRequirements")
    public ActorDefinitionResourceRequirements getResourceRequirements() {
        return resourceRequirements;
    }

    /**
     * ActorDefinitionResourceRequirements
     * <p>
     * actor definition specific resource requirements
     * 
     */
    @JsonProperty("resourceRequirements")
    public void setResourceRequirements(ActorDefinitionResourceRequirements resourceRequirements) {
        this.resourceRequirements = resourceRequirements;
    }

    public StandardDestinationDefinition withResourceRequirements(ActorDefinitionResourceRequirements resourceRequirements) {
        this.resourceRequirements = resourceRequirements;
        return this;
    }

    /**
     * the Airbyte Protocol version supported by the connector
     * 
     */
    @JsonProperty("protocolVersion")
    public String getProtocolVersion() {
        return protocolVersion;
    }

    /**
     * the Airbyte Protocol version supported by the connector
     * 
     */
    @JsonProperty("protocolVersion")
    public void setProtocolVersion(String protocolVersion) {
        this.protocolVersion = protocolVersion;
    }

    public StandardDestinationDefinition withProtocolVersion(String protocolVersion) {
        this.protocolVersion = protocolVersion;
        return this;
    }

    /**
     * NormalizationDestinationDefinitionConfig
     * <p>
     * describes a normalization config for destination definition
     * 
     */
    @JsonProperty("normalizationConfig")
    public NormalizationDestinationDefinitionConfig getNormalizationConfig() {
        return normalizationConfig;
    }

    /**
     * NormalizationDestinationDefinitionConfig
     * <p>
     * describes a normalization config for destination definition
     * 
     */
    @JsonProperty("normalizationConfig")
    public void setNormalizationConfig(NormalizationDestinationDefinitionConfig normalizationConfig) {
        this.normalizationConfig = normalizationConfig;
    }

    public StandardDestinationDefinition withNormalizationConfig(NormalizationDestinationDefinitionConfig normalizationConfig) {
        this.normalizationConfig = normalizationConfig;
        return this;
    }

    /**
     * an optional flag indicating whether DBT is used in the normalization. If the flag value is NULL - DBT is not used.
     * 
     */
    @JsonProperty("supportsDbt")
    public Boolean getSupportsDbt() {
        return supportsDbt;
    }

    /**
     * an optional flag indicating whether DBT is used in the normalization. If the flag value is NULL - DBT is not used.
     * 
     */
    @JsonProperty("supportsDbt")
    public void setSupportsDbt(Boolean supportsDbt) {
        this.supportsDbt = supportsDbt;
    }

    public StandardDestinationDefinition withSupportsDbt(Boolean supportsDbt) {
        this.supportsDbt = supportsDbt;
        return this;
    }

    /**
     * AllowedHosts
     * <p>
     * A connector's allowed hosts.  If present, the platform will limit communication to only hosts which are listed in `AllowedHosts.hosts`.
     * 
     */
    @JsonProperty("allowedHosts")
    public AllowedHosts getAllowedHosts() {
        return allowedHosts;
    }

    /**
     * AllowedHosts
     * <p>
     * A connector's allowed hosts.  If present, the platform will limit communication to only hosts which are listed in `AllowedHosts.hosts`.
     * 
     */
    @JsonProperty("allowedHosts")
    public void setAllowedHosts(AllowedHosts allowedHosts) {
        this.allowedHosts = allowedHosts;
    }

    public StandardDestinationDefinition withAllowedHosts(AllowedHosts allowedHosts) {
        this.allowedHosts = allowedHosts;
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

    public StandardDestinationDefinition withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StandardDestinationDefinition.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("destinationDefinitionId");
        sb.append('=');
        sb.append(((this.destinationDefinitionId == null)?"<null>":this.destinationDefinitionId));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("dockerRepository");
        sb.append('=');
        sb.append(((this.dockerRepository == null)?"<null>":this.dockerRepository));
        sb.append(',');
        sb.append("dockerImageTag");
        sb.append('=');
        sb.append(((this.dockerImageTag == null)?"<null>":this.dockerImageTag));
        sb.append(',');
        sb.append("documentationUrl");
        sb.append('=');
        sb.append(((this.documentationUrl == null)?"<null>":this.documentationUrl));
        sb.append(',');
        sb.append("icon");
        sb.append('=');
        sb.append(((this.icon == null)?"<null>":this.icon));
        sb.append(',');
        sb.append("spec");
        sb.append('=');
        sb.append(((this.spec == null)?"<null>":this.spec));
        sb.append(',');
        sb.append("tombstone");
        sb.append('=');
        sb.append(((this.tombstone == null)?"<null>":this.tombstone));
        sb.append(',');
        sb.append("_public");
        sb.append('=');
        sb.append(((this._public == null)?"<null>":this._public));
        sb.append(',');
        sb.append("custom");
        sb.append('=');
        sb.append(((this.custom == null)?"<null>":this.custom));
        sb.append(',');
        sb.append("releaseStage");
        sb.append('=');
        sb.append(((this.releaseStage == null)?"<null>":this.releaseStage));
        sb.append(',');
        sb.append("releaseDate");
        sb.append('=');
        sb.append(((this.releaseDate == null)?"<null>":this.releaseDate));
        sb.append(',');
        sb.append("resourceRequirements");
        sb.append('=');
        sb.append(((this.resourceRequirements == null)?"<null>":this.resourceRequirements));
        sb.append(',');
        sb.append("protocolVersion");
        sb.append('=');
        sb.append(((this.protocolVersion == null)?"<null>":this.protocolVersion));
        sb.append(',');
        sb.append("normalizationConfig");
        sb.append('=');
        sb.append(((this.normalizationConfig == null)?"<null>":this.normalizationConfig));
        sb.append(',');
        sb.append("supportsDbt");
        sb.append('=');
        sb.append(((this.supportsDbt == null)?"<null>":this.supportsDbt));
        sb.append(',');
        sb.append("allowedHosts");
        sb.append('=');
        sb.append(((this.allowedHosts == null)?"<null>":this.allowedHosts));
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
        result = ((result* 31)+((this.allowedHosts == null)? 0 :this.allowedHosts.hashCode()));
        result = ((result* 31)+((this.documentationUrl == null)? 0 :this.documentationUrl.hashCode()));
        result = ((result* 31)+((this.tombstone == null)? 0 :this.tombstone.hashCode()));
        result = ((result* 31)+((this._public == null)? 0 :this._public.hashCode()));
        result = ((result* 31)+((this.releaseDate == null)? 0 :this.releaseDate.hashCode()));
        result = ((result* 31)+((this.dockerRepository == null)? 0 :this.dockerRepository.hashCode()));
        result = ((result* 31)+((this.releaseStage == null)? 0 :this.releaseStage.hashCode()));
        result = ((result* 31)+((this.custom == null)? 0 :this.custom.hashCode()));
        result = ((result* 31)+((this.supportsDbt == null)? 0 :this.supportsDbt.hashCode()));
        result = ((result* 31)+((this.icon == null)? 0 :this.icon.hashCode()));
        result = ((result* 31)+((this.spec == null)? 0 :this.spec.hashCode()));
        result = ((result* 31)+((this.resourceRequirements == null)? 0 :this.resourceRequirements.hashCode()));
        result = ((result* 31)+((this.dockerImageTag == null)? 0 :this.dockerImageTag.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.normalizationConfig == null)? 0 :this.normalizationConfig.hashCode()));
        result = ((result* 31)+((this.protocolVersion == null)? 0 :this.protocolVersion.hashCode()));
        result = ((result* 31)+((this.destinationDefinitionId == null)? 0 :this.destinationDefinitionId.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StandardDestinationDefinition) == false) {
            return false;
        }
        StandardDestinationDefinition rhs = ((StandardDestinationDefinition) other);
        return (((((((((((((((((((this.allowedHosts == rhs.allowedHosts)||((this.allowedHosts!= null)&&this.allowedHosts.equals(rhs.allowedHosts)))&&((this.documentationUrl == rhs.documentationUrl)||((this.documentationUrl!= null)&&this.documentationUrl.equals(rhs.documentationUrl))))&&((this.tombstone == rhs.tombstone)||((this.tombstone!= null)&&this.tombstone.equals(rhs.tombstone))))&&((this._public == rhs._public)||((this._public!= null)&&this._public.equals(rhs._public))))&&((this.releaseDate == rhs.releaseDate)||((this.releaseDate!= null)&&this.releaseDate.equals(rhs.releaseDate))))&&((this.dockerRepository == rhs.dockerRepository)||((this.dockerRepository!= null)&&this.dockerRepository.equals(rhs.dockerRepository))))&&((this.releaseStage == rhs.releaseStage)||((this.releaseStage!= null)&&this.releaseStage.equals(rhs.releaseStage))))&&((this.custom == rhs.custom)||((this.custom!= null)&&this.custom.equals(rhs.custom))))&&((this.supportsDbt == rhs.supportsDbt)||((this.supportsDbt!= null)&&this.supportsDbt.equals(rhs.supportsDbt))))&&((this.icon == rhs.icon)||((this.icon!= null)&&this.icon.equals(rhs.icon))))&&((this.spec == rhs.spec)||((this.spec!= null)&&this.spec.equals(rhs.spec))))&&((this.resourceRequirements == rhs.resourceRequirements)||((this.resourceRequirements!= null)&&this.resourceRequirements.equals(rhs.resourceRequirements))))&&((this.dockerImageTag == rhs.dockerImageTag)||((this.dockerImageTag!= null)&&this.dockerImageTag.equals(rhs.dockerImageTag))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.normalizationConfig == rhs.normalizationConfig)||((this.normalizationConfig!= null)&&this.normalizationConfig.equals(rhs.normalizationConfig))))&&((this.protocolVersion == rhs.protocolVersion)||((this.protocolVersion!= null)&&this.protocolVersion.equals(rhs.protocolVersion))))&&((this.destinationDefinitionId == rhs.destinationDefinitionId)||((this.destinationDefinitionId!= null)&&this.destinationDefinitionId.equals(rhs.destinationDefinitionId))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

    public enum ReleaseStage {

        ALPHA("alpha"),
        BETA("beta"),
        GENERALLY_AVAILABLE("generally_available"),
        CUSTOM("custom");
        private final String value;
        private final static Map<String, StandardDestinationDefinition.ReleaseStage> CONSTANTS = new HashMap<String, StandardDestinationDefinition.ReleaseStage>();

        static {
            for (StandardDestinationDefinition.ReleaseStage c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private ReleaseStage(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static StandardDestinationDefinition.ReleaseStage fromValue(String value) {
            StandardDestinationDefinition.ReleaseStage constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
