
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
 * StandardSourceDefinition
 * <p>
 * describes a source
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "sourceDefinitionId",
    "name",
    "dockerRepository",
    "dockerImageTag",
    "documentationUrl",
    "icon",
    "sourceType",
    "spec",
    "tombstone",
    "public",
    "custom",
    "releaseStage",
    "releaseDate",
    "resourceRequirements",
    "protocolVersion",
    "allowedHosts",
    "suggestedStreams"
})
public class StandardSourceDefinition implements Serializable
{

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("sourceDefinitionId")
    private UUID sourceDefinitionId;
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
    @JsonProperty("sourceType")
    private StandardSourceDefinition.SourceType sourceType;
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
    private StandardSourceDefinition.ReleaseStage releaseStage;
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
     * AllowedHosts
     * <p>
     * A connector's allowed hosts.  If present, the platform will limit communication to only hosts which are listed in `AllowedHosts.hosts`.
     * 
     */
    @JsonProperty("allowedHosts")
    @JsonPropertyDescription("A connector's allowed hosts.  If present, the platform will limit communication to only hosts which are listed in `AllowedHosts.hosts`.")
    private AllowedHosts allowedHosts;
    /**
     * SuggestedStreams
     * <p>
     * A source's suggested streams.  These will be suggested by default for new connections using this source.  Otherwise, all streams will be selected.  This is useful for when your source has a lot of streams, but the average user will only want a subset of them synced.
     * 
     */
    @JsonProperty("suggestedStreams")
    @JsonPropertyDescription("A source's suggested streams.  These will be suggested by default for new connections using this source.  Otherwise, all streams will be selected.  This is useful for when your source has a lot of streams, but the average user will only want a subset of them synced.")
    private SuggestedStreams suggestedStreams;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 5378355948961480902L;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("sourceDefinitionId")
    public UUID getSourceDefinitionId() {
        return sourceDefinitionId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("sourceDefinitionId")
    public void setSourceDefinitionId(UUID sourceDefinitionId) {
        this.sourceDefinitionId = sourceDefinitionId;
    }

    public StandardSourceDefinition withSourceDefinitionId(UUID sourceDefinitionId) {
        this.sourceDefinitionId = sourceDefinitionId;
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

    public StandardSourceDefinition withName(String name) {
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

    public StandardSourceDefinition withDockerRepository(String dockerRepository) {
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

    public StandardSourceDefinition withDockerImageTag(String dockerImageTag) {
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

    public StandardSourceDefinition withDocumentationUrl(String documentationUrl) {
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

    public StandardSourceDefinition withIcon(String icon) {
        this.icon = icon;
        return this;
    }

    @JsonProperty("sourceType")
    public StandardSourceDefinition.SourceType getSourceType() {
        return sourceType;
    }

    @JsonProperty("sourceType")
    public void setSourceType(StandardSourceDefinition.SourceType sourceType) {
        this.sourceType = sourceType;
    }

    public StandardSourceDefinition withSourceType(StandardSourceDefinition.SourceType sourceType) {
        this.sourceType = sourceType;
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

    public StandardSourceDefinition withSpec(ConnectorSpecification spec) {
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

    public StandardSourceDefinition withTombstone(Boolean tombstone) {
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

    public StandardSourceDefinition withPublic(Boolean _public) {
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

    public StandardSourceDefinition withCustom(Boolean custom) {
        this.custom = custom;
        return this;
    }

    @JsonProperty("releaseStage")
    public StandardSourceDefinition.ReleaseStage getReleaseStage() {
        return releaseStage;
    }

    @JsonProperty("releaseStage")
    public void setReleaseStage(StandardSourceDefinition.ReleaseStage releaseStage) {
        this.releaseStage = releaseStage;
    }

    public StandardSourceDefinition withReleaseStage(StandardSourceDefinition.ReleaseStage releaseStage) {
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

    public StandardSourceDefinition withReleaseDate(String releaseDate) {
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

    public StandardSourceDefinition withResourceRequirements(ActorDefinitionResourceRequirements resourceRequirements) {
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

    public StandardSourceDefinition withProtocolVersion(String protocolVersion) {
        this.protocolVersion = protocolVersion;
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

    public StandardSourceDefinition withAllowedHosts(AllowedHosts allowedHosts) {
        this.allowedHosts = allowedHosts;
        return this;
    }

    /**
     * SuggestedStreams
     * <p>
     * A source's suggested streams.  These will be suggested by default for new connections using this source.  Otherwise, all streams will be selected.  This is useful for when your source has a lot of streams, but the average user will only want a subset of them synced.
     * 
     */
    @JsonProperty("suggestedStreams")
    public SuggestedStreams getSuggestedStreams() {
        return suggestedStreams;
    }

    /**
     * SuggestedStreams
     * <p>
     * A source's suggested streams.  These will be suggested by default for new connections using this source.  Otherwise, all streams will be selected.  This is useful for when your source has a lot of streams, but the average user will only want a subset of them synced.
     * 
     */
    @JsonProperty("suggestedStreams")
    public void setSuggestedStreams(SuggestedStreams suggestedStreams) {
        this.suggestedStreams = suggestedStreams;
    }

    public StandardSourceDefinition withSuggestedStreams(SuggestedStreams suggestedStreams) {
        this.suggestedStreams = suggestedStreams;
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

    public StandardSourceDefinition withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StandardSourceDefinition.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sourceDefinitionId");
        sb.append('=');
        sb.append(((this.sourceDefinitionId == null)?"<null>":this.sourceDefinitionId));
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
        sb.append("sourceType");
        sb.append('=');
        sb.append(((this.sourceType == null)?"<null>":this.sourceType));
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
        sb.append("allowedHosts");
        sb.append('=');
        sb.append(((this.allowedHosts == null)?"<null>":this.allowedHosts));
        sb.append(',');
        sb.append("suggestedStreams");
        sb.append('=');
        sb.append(((this.suggestedStreams == null)?"<null>":this.suggestedStreams));
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
        result = ((result* 31)+((this.icon == null)? 0 :this.icon.hashCode()));
        result = ((result* 31)+((this.sourceDefinitionId == null)? 0 :this.sourceDefinitionId.hashCode()));
        result = ((result* 31)+((this.spec == null)? 0 :this.spec.hashCode()));
        result = ((result* 31)+((this.suggestedStreams == null)? 0 :this.suggestedStreams.hashCode()));
        result = ((result* 31)+((this.resourceRequirements == null)? 0 :this.resourceRequirements.hashCode()));
        result = ((result* 31)+((this.dockerImageTag == null)? 0 :this.dockerImageTag.hashCode()));
        result = ((result* 31)+((this.sourceType == null)? 0 :this.sourceType.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.protocolVersion == null)? 0 :this.protocolVersion.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StandardSourceDefinition) == false) {
            return false;
        }
        StandardSourceDefinition rhs = ((StandardSourceDefinition) other);
        return (((((((((((((((((((this.allowedHosts == rhs.allowedHosts)||((this.allowedHosts!= null)&&this.allowedHosts.equals(rhs.allowedHosts)))&&((this.documentationUrl == rhs.documentationUrl)||((this.documentationUrl!= null)&&this.documentationUrl.equals(rhs.documentationUrl))))&&((this.tombstone == rhs.tombstone)||((this.tombstone!= null)&&this.tombstone.equals(rhs.tombstone))))&&((this._public == rhs._public)||((this._public!= null)&&this._public.equals(rhs._public))))&&((this.releaseDate == rhs.releaseDate)||((this.releaseDate!= null)&&this.releaseDate.equals(rhs.releaseDate))))&&((this.dockerRepository == rhs.dockerRepository)||((this.dockerRepository!= null)&&this.dockerRepository.equals(rhs.dockerRepository))))&&((this.releaseStage == rhs.releaseStage)||((this.releaseStage!= null)&&this.releaseStage.equals(rhs.releaseStage))))&&((this.custom == rhs.custom)||((this.custom!= null)&&this.custom.equals(rhs.custom))))&&((this.icon == rhs.icon)||((this.icon!= null)&&this.icon.equals(rhs.icon))))&&((this.sourceDefinitionId == rhs.sourceDefinitionId)||((this.sourceDefinitionId!= null)&&this.sourceDefinitionId.equals(rhs.sourceDefinitionId))))&&((this.spec == rhs.spec)||((this.spec!= null)&&this.spec.equals(rhs.spec))))&&((this.suggestedStreams == rhs.suggestedStreams)||((this.suggestedStreams!= null)&&this.suggestedStreams.equals(rhs.suggestedStreams))))&&((this.resourceRequirements == rhs.resourceRequirements)||((this.resourceRequirements!= null)&&this.resourceRequirements.equals(rhs.resourceRequirements))))&&((this.dockerImageTag == rhs.dockerImageTag)||((this.dockerImageTag!= null)&&this.dockerImageTag.equals(rhs.dockerImageTag))))&&((this.sourceType == rhs.sourceType)||((this.sourceType!= null)&&this.sourceType.equals(rhs.sourceType))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.protocolVersion == rhs.protocolVersion)||((this.protocolVersion!= null)&&this.protocolVersion.equals(rhs.protocolVersion))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

    public enum ReleaseStage {

        ALPHA("alpha"),
        BETA("beta"),
        GENERALLY_AVAILABLE("generally_available"),
        CUSTOM("custom");
        private final String value;
        private final static Map<String, StandardSourceDefinition.ReleaseStage> CONSTANTS = new HashMap<String, StandardSourceDefinition.ReleaseStage>();

        static {
            for (StandardSourceDefinition.ReleaseStage c: values()) {
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
        public static StandardSourceDefinition.ReleaseStage fromValue(String value) {
            StandardSourceDefinition.ReleaseStage constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum SourceType {

        API("api"),
        FILE("file"),
        DATABASE("database"),
        CUSTOM("custom");
        private final String value;
        private final static Map<String, StandardSourceDefinition.SourceType> CONSTANTS = new HashMap<String, StandardSourceDefinition.SourceType>();

        static {
            for (StandardSourceDefinition.SourceType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private SourceType(String value) {
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
        public static StandardSourceDefinition.SourceType fromValue(String value) {
            StandardSourceDefinition.SourceType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
