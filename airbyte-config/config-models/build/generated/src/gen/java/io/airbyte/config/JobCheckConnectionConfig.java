
package io.airbyte.config;

import java.io.Serializable;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.JsonNode;
import io.airbyte.commons.version.Version;


/**
 * JobCheckConnectionConfig
 * <p>
 * job check connection config
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "actorType",
    "actorId",
    "connectionConfiguration",
    "dockerImage",
    "protocolVersion",
    "isCustomConnector"
})
public class JobCheckConnectionConfig implements Serializable
{

    /**
     * ActorType
     * <p>
     * enum that describes different types of actors
     * 
     */
    @JsonProperty("actorType")
    @JsonPropertyDescription("enum that describes different types of actors")
    private ActorType actorType;
    /**
     * The ID of the actor being checked, so we can persist config updates
     * 
     */
    @JsonProperty("actorId")
    @JsonPropertyDescription("The ID of the actor being checked, so we can persist config updates")
    private UUID actorId;
    /**
     * Integration specific blob. Must be a valid JSON string.
     * (Required)
     * 
     */
    @JsonProperty("connectionConfiguration")
    @JsonPropertyDescription("Integration specific blob. Must be a valid JSON string.")
    private JsonNode connectionConfiguration;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("dockerImage")
    private String dockerImage;
    @JsonProperty("protocolVersion")
    private Version protocolVersion;
    /**
     * determine if the running image is a custom connector.
     * 
     */
    @JsonProperty("isCustomConnector")
    @JsonPropertyDescription("determine if the running image is a custom connector.")
    private Boolean isCustomConnector;
    private final static long serialVersionUID = -4952442151948633059L;

    /**
     * ActorType
     * <p>
     * enum that describes different types of actors
     * 
     */
    @JsonProperty("actorType")
    public ActorType getActorType() {
        return actorType;
    }

    /**
     * ActorType
     * <p>
     * enum that describes different types of actors
     * 
     */
    @JsonProperty("actorType")
    public void setActorType(ActorType actorType) {
        this.actorType = actorType;
    }

    public JobCheckConnectionConfig withActorType(ActorType actorType) {
        this.actorType = actorType;
        return this;
    }

    /**
     * The ID of the actor being checked, so we can persist config updates
     * 
     */
    @JsonProperty("actorId")
    public UUID getActorId() {
        return actorId;
    }

    /**
     * The ID of the actor being checked, so we can persist config updates
     * 
     */
    @JsonProperty("actorId")
    public void setActorId(UUID actorId) {
        this.actorId = actorId;
    }

    public JobCheckConnectionConfig withActorId(UUID actorId) {
        this.actorId = actorId;
        return this;
    }

    /**
     * Integration specific blob. Must be a valid JSON string.
     * (Required)
     * 
     */
    @JsonProperty("connectionConfiguration")
    public JsonNode getConnectionConfiguration() {
        return connectionConfiguration;
    }

    /**
     * Integration specific blob. Must be a valid JSON string.
     * (Required)
     * 
     */
    @JsonProperty("connectionConfiguration")
    public void setConnectionConfiguration(JsonNode connectionConfiguration) {
        this.connectionConfiguration = connectionConfiguration;
    }

    public JobCheckConnectionConfig withConnectionConfiguration(JsonNode connectionConfiguration) {
        this.connectionConfiguration = connectionConfiguration;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("dockerImage")
    public String getDockerImage() {
        return dockerImage;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("dockerImage")
    public void setDockerImage(String dockerImage) {
        this.dockerImage = dockerImage;
    }

    public JobCheckConnectionConfig withDockerImage(String dockerImage) {
        this.dockerImage = dockerImage;
        return this;
    }

    @JsonProperty("protocolVersion")
    public Version getProtocolVersion() {
        return protocolVersion;
    }

    @JsonProperty("protocolVersion")
    public void setProtocolVersion(Version protocolVersion) {
        this.protocolVersion = protocolVersion;
    }

    public JobCheckConnectionConfig withProtocolVersion(Version protocolVersion) {
        this.protocolVersion = protocolVersion;
        return this;
    }

    /**
     * determine if the running image is a custom connector.
     * 
     */
    @JsonProperty("isCustomConnector")
    public Boolean getIsCustomConnector() {
        return isCustomConnector;
    }

    /**
     * determine if the running image is a custom connector.
     * 
     */
    @JsonProperty("isCustomConnector")
    public void setIsCustomConnector(Boolean isCustomConnector) {
        this.isCustomConnector = isCustomConnector;
    }

    public JobCheckConnectionConfig withIsCustomConnector(Boolean isCustomConnector) {
        this.isCustomConnector = isCustomConnector;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(JobCheckConnectionConfig.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("actorType");
        sb.append('=');
        sb.append(((this.actorType == null)?"<null>":this.actorType));
        sb.append(',');
        sb.append("actorId");
        sb.append('=');
        sb.append(((this.actorId == null)?"<null>":this.actorId));
        sb.append(',');
        sb.append("connectionConfiguration");
        sb.append('=');
        sb.append(((this.connectionConfiguration == null)?"<null>":this.connectionConfiguration));
        sb.append(',');
        sb.append("dockerImage");
        sb.append('=');
        sb.append(((this.dockerImage == null)?"<null>":this.dockerImage));
        sb.append(',');
        sb.append("protocolVersion");
        sb.append('=');
        sb.append(((this.protocolVersion == null)?"<null>":this.protocolVersion));
        sb.append(',');
        sb.append("isCustomConnector");
        sb.append('=');
        sb.append(((this.isCustomConnector == null)?"<null>":this.isCustomConnector));
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
        result = ((result* 31)+((this.isCustomConnector == null)? 0 :this.isCustomConnector.hashCode()));
        result = ((result* 31)+((this.actorType == null)? 0 :this.actorType.hashCode()));
        result = ((result* 31)+((this.actorId == null)? 0 :this.actorId.hashCode()));
        result = ((result* 31)+((this.dockerImage == null)? 0 :this.dockerImage.hashCode()));
        result = ((result* 31)+((this.connectionConfiguration == null)? 0 :this.connectionConfiguration.hashCode()));
        result = ((result* 31)+((this.protocolVersion == null)? 0 :this.protocolVersion.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof JobCheckConnectionConfig) == false) {
            return false;
        }
        JobCheckConnectionConfig rhs = ((JobCheckConnectionConfig) other);
        return (((((((this.isCustomConnector == rhs.isCustomConnector)||((this.isCustomConnector!= null)&&this.isCustomConnector.equals(rhs.isCustomConnector)))&&((this.actorType == rhs.actorType)||((this.actorType!= null)&&this.actorType.equals(rhs.actorType))))&&((this.actorId == rhs.actorId)||((this.actorId!= null)&&this.actorId.equals(rhs.actorId))))&&((this.dockerImage == rhs.dockerImage)||((this.dockerImage!= null)&&this.dockerImage.equals(rhs.dockerImage))))&&((this.connectionConfiguration == rhs.connectionConfiguration)||((this.connectionConfiguration!= null)&&this.connectionConfiguration.equals(rhs.connectionConfiguration))))&&((this.protocolVersion == rhs.protocolVersion)||((this.protocolVersion!= null)&&this.protocolVersion.equals(rhs.protocolVersion))));
    }

}
