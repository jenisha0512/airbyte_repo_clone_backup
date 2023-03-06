
package io.airbyte.config;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.JsonNode;
import io.airbyte.commons.version.Version;


/**
 * JobDiscoverCatalogConfig
 * <p>
 * job discover catalog config
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "connectionConfiguration",
    "dockerImage",
    "sourceId",
    "connectorVersion",
    "configHash",
    "protocolVersion",
    "isCustomConnector"
})
public class JobDiscoverCatalogConfig implements Serializable
{

    /**
     * Integration specific blob. Must be a valid JSON string.
     * (Required)
     * 
     */
    @JsonProperty("connectionConfiguration")
    @JsonPropertyDescription("Integration specific blob. Must be a valid JSON string.")
    private JsonNode connectionConfiguration;
    /**
     * The connector image
     * (Required)
     * 
     */
    @JsonProperty("dockerImage")
    @JsonPropertyDescription("The connector image")
    private String dockerImage;
    /**
     * The ID of the source being discovered, so we can persist this alongside the discovered catalog
     * (Required)
     * 
     */
    @JsonProperty("sourceId")
    @JsonPropertyDescription("The ID of the source being discovered, so we can persist this alongside the discovered catalog")
    private String sourceId;
    /**
     * Connector version, so we can persist this alongside the discovered catalog
     * (Required)
     * 
     */
    @JsonProperty("connectorVersion")
    @JsonPropertyDescription("Connector version, so we can persist this alongside the discovered catalog")
    private String connectorVersion;
    /**
     * Hash of the source configuration -- see `configuration` field in SourceConnection.yaml -- so we can persist this alongside the discovered catalog.
     * (Required)
     * 
     */
    @JsonProperty("configHash")
    @JsonPropertyDescription("Hash of the source configuration -- see `configuration` field in SourceConnection.yaml -- so we can persist this alongside the discovered catalog.")
    private String configHash;
    @JsonProperty("protocolVersion")
    private Version protocolVersion;
    /**
     * determine if the running image is a custom connector.
     * 
     */
    @JsonProperty("isCustomConnector")
    @JsonPropertyDescription("determine if the running image is a custom connector.")
    private Boolean isCustomConnector;
    private final static long serialVersionUID = -392508498561211963L;

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

    public JobDiscoverCatalogConfig withConnectionConfiguration(JsonNode connectionConfiguration) {
        this.connectionConfiguration = connectionConfiguration;
        return this;
    }

    /**
     * The connector image
     * (Required)
     * 
     */
    @JsonProperty("dockerImage")
    public String getDockerImage() {
        return dockerImage;
    }

    /**
     * The connector image
     * (Required)
     * 
     */
    @JsonProperty("dockerImage")
    public void setDockerImage(String dockerImage) {
        this.dockerImage = dockerImage;
    }

    public JobDiscoverCatalogConfig withDockerImage(String dockerImage) {
        this.dockerImage = dockerImage;
        return this;
    }

    /**
     * The ID of the source being discovered, so we can persist this alongside the discovered catalog
     * (Required)
     * 
     */
    @JsonProperty("sourceId")
    public String getSourceId() {
        return sourceId;
    }

    /**
     * The ID of the source being discovered, so we can persist this alongside the discovered catalog
     * (Required)
     * 
     */
    @JsonProperty("sourceId")
    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public JobDiscoverCatalogConfig withSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    /**
     * Connector version, so we can persist this alongside the discovered catalog
     * (Required)
     * 
     */
    @JsonProperty("connectorVersion")
    public String getConnectorVersion() {
        return connectorVersion;
    }

    /**
     * Connector version, so we can persist this alongside the discovered catalog
     * (Required)
     * 
     */
    @JsonProperty("connectorVersion")
    public void setConnectorVersion(String connectorVersion) {
        this.connectorVersion = connectorVersion;
    }

    public JobDiscoverCatalogConfig withConnectorVersion(String connectorVersion) {
        this.connectorVersion = connectorVersion;
        return this;
    }

    /**
     * Hash of the source configuration -- see `configuration` field in SourceConnection.yaml -- so we can persist this alongside the discovered catalog.
     * (Required)
     * 
     */
    @JsonProperty("configHash")
    public String getConfigHash() {
        return configHash;
    }

    /**
     * Hash of the source configuration -- see `configuration` field in SourceConnection.yaml -- so we can persist this alongside the discovered catalog.
     * (Required)
     * 
     */
    @JsonProperty("configHash")
    public void setConfigHash(String configHash) {
        this.configHash = configHash;
    }

    public JobDiscoverCatalogConfig withConfigHash(String configHash) {
        this.configHash = configHash;
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

    public JobDiscoverCatalogConfig withProtocolVersion(Version protocolVersion) {
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

    public JobDiscoverCatalogConfig withIsCustomConnector(Boolean isCustomConnector) {
        this.isCustomConnector = isCustomConnector;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(JobDiscoverCatalogConfig.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("connectionConfiguration");
        sb.append('=');
        sb.append(((this.connectionConfiguration == null)?"<null>":this.connectionConfiguration));
        sb.append(',');
        sb.append("dockerImage");
        sb.append('=');
        sb.append(((this.dockerImage == null)?"<null>":this.dockerImage));
        sb.append(',');
        sb.append("sourceId");
        sb.append('=');
        sb.append(((this.sourceId == null)?"<null>":this.sourceId));
        sb.append(',');
        sb.append("connectorVersion");
        sb.append('=');
        sb.append(((this.connectorVersion == null)?"<null>":this.connectorVersion));
        sb.append(',');
        sb.append("configHash");
        sb.append('=');
        sb.append(((this.configHash == null)?"<null>":this.configHash));
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
        result = ((result* 31)+((this.sourceId == null)? 0 :this.sourceId.hashCode()));
        result = ((result* 31)+((this.isCustomConnector == null)? 0 :this.isCustomConnector.hashCode()));
        result = ((result* 31)+((this.dockerImage == null)? 0 :this.dockerImage.hashCode()));
        result = ((result* 31)+((this.connectionConfiguration == null)? 0 :this.connectionConfiguration.hashCode()));
        result = ((result* 31)+((this.connectorVersion == null)? 0 :this.connectorVersion.hashCode()));
        result = ((result* 31)+((this.configHash == null)? 0 :this.configHash.hashCode()));
        result = ((result* 31)+((this.protocolVersion == null)? 0 :this.protocolVersion.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof JobDiscoverCatalogConfig) == false) {
            return false;
        }
        JobDiscoverCatalogConfig rhs = ((JobDiscoverCatalogConfig) other);
        return ((((((((this.sourceId == rhs.sourceId)||((this.sourceId!= null)&&this.sourceId.equals(rhs.sourceId)))&&((this.isCustomConnector == rhs.isCustomConnector)||((this.isCustomConnector!= null)&&this.isCustomConnector.equals(rhs.isCustomConnector))))&&((this.dockerImage == rhs.dockerImage)||((this.dockerImage!= null)&&this.dockerImage.equals(rhs.dockerImage))))&&((this.connectionConfiguration == rhs.connectionConfiguration)||((this.connectionConfiguration!= null)&&this.connectionConfiguration.equals(rhs.connectionConfiguration))))&&((this.connectorVersion == rhs.connectorVersion)||((this.connectorVersion!= null)&&this.connectorVersion.equals(rhs.connectorVersion))))&&((this.configHash == rhs.configHash)||((this.configHash!= null)&&this.configHash.equals(rhs.configHash))))&&((this.protocolVersion == rhs.protocolVersion)||((this.protocolVersion!= null)&&this.protocolVersion.equals(rhs.protocolVersion))));
    }

}
