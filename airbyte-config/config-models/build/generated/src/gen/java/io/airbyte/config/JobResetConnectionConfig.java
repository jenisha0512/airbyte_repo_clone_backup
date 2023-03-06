
package io.airbyte.config;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.JsonNode;
import io.airbyte.commons.version.Version;
import io.airbyte.protocol.models.ConfiguredAirbyteCatalog;


/**
 * JobResetConnectionConfig
 * <p>
 * job reset connection config
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "namespaceDefinition",
    "namespaceFormat",
    "prefix",
    "destinationConfiguration",
    "configuredAirbyteCatalog",
    "destinationDockerImage",
    "destinationProtocolVersion",
    "operationSequence",
    "webhookOperationConfigs",
    "resourceRequirements",
    "resetSourceConfiguration",
    "state",
    "isSourceCustomConnector",
    "isDestinationCustomConnector",
    "workspaceId"
})
public class JobResetConnectionConfig implements Serializable
{

    /**
     * Namespace Definition
     * <p>
     * Method used for computing final namespace in destination
     * 
     */
    @JsonProperty("namespaceDefinition")
    @JsonPropertyDescription("Method used for computing final namespace in destination")
    private io.airbyte.config.JobSyncConfig.NamespaceDefinitionType namespaceDefinition = io.airbyte.config.JobSyncConfig.NamespaceDefinitionType.fromValue("source");
    @JsonProperty("namespaceFormat")
    private String namespaceFormat = null;
    /**
     * Prefix that will be prepended to the name of each stream when it is written to the destination.
     * 
     */
    @JsonProperty("prefix")
    @JsonPropertyDescription("Prefix that will be prepended to the name of each stream when it is written to the destination.")
    private String prefix;
    /**
     * Integration specific blob. Must be a valid JSON string.
     * (Required)
     * 
     */
    @JsonProperty("destinationConfiguration")
    @JsonPropertyDescription("Integration specific blob. Must be a valid JSON string.")
    private JsonNode destinationConfiguration;
    /**
     * the configured airbyte catalog
     * (Required)
     * 
     */
    @JsonProperty("configuredAirbyteCatalog")
    @JsonPropertyDescription("the configured airbyte catalog")
    private ConfiguredAirbyteCatalog configuredAirbyteCatalog;
    /**
     * Image name of the destination with tag.
     * (Required)
     * 
     */
    @JsonProperty("destinationDockerImage")
    @JsonPropertyDescription("Image name of the destination with tag.")
    private String destinationDockerImage;
    /**
     * Airbyte Protocol Version of the destination
     * 
     */
    @JsonProperty("destinationProtocolVersion")
    @JsonPropertyDescription("Airbyte Protocol Version of the destination")
    private Version destinationProtocolVersion;
    /**
     * Sequence of configurations of operations to apply as part of the sync
     * 
     */
    @JsonProperty("operationSequence")
    @JsonPropertyDescription("Sequence of configurations of operations to apply as part of the sync")
    private List<StandardSyncOperation> operationSequence = new ArrayList<StandardSyncOperation>();
    /**
     * The webhook operation configs belonging to this workspace. Must conform to WebhookOperationConfigs.yaml.
     * 
     */
    @JsonProperty("webhookOperationConfigs")
    @JsonPropertyDescription("The webhook operation configs belonging to this workspace. Must conform to WebhookOperationConfigs.yaml.")
    private JsonNode webhookOperationConfigs;
    /**
     * optional resource requirements to run sync workers
     * 
     */
    @JsonProperty("resourceRequirements")
    @JsonPropertyDescription("optional resource requirements to run sync workers")
    private ResourceRequirements resourceRequirements;
    /**
     * ResetSourceConfiguration
     * <p>
     * configuration of the reset source
     * 
     */
    @JsonProperty("resetSourceConfiguration")
    @JsonPropertyDescription("configuration of the reset source")
    private ResetSourceConfiguration resetSourceConfiguration;
    /**
     * State
     * <p>
     * information output by the connection.
     * 
     */
    @JsonProperty("state")
    @JsonPropertyDescription("information output by the connection.")
    private State state;
    /**
     * determine if the running image of the source is a custom connector.
     * 
     */
    @JsonProperty("isSourceCustomConnector")
    @JsonPropertyDescription("determine if the running image of the source is a custom connector.")
    private Boolean isSourceCustomConnector;
    /**
     * determine if the running image of the destination is a custom connector.
     * 
     */
    @JsonProperty("isDestinationCustomConnector")
    @JsonPropertyDescription("determine if the running image of the destination is a custom connector.")
    private Boolean isDestinationCustomConnector;
    /**
     * The id of the workspace associated with the sync
     * 
     */
    @JsonProperty("workspaceId")
    @JsonPropertyDescription("The id of the workspace associated with the sync")
    private UUID workspaceId;
    private final static long serialVersionUID = 8359993414892664415L;

    /**
     * Namespace Definition
     * <p>
     * Method used for computing final namespace in destination
     * 
     */
    @JsonProperty("namespaceDefinition")
    public io.airbyte.config.JobSyncConfig.NamespaceDefinitionType getNamespaceDefinition() {
        return namespaceDefinition;
    }

    /**
     * Namespace Definition
     * <p>
     * Method used for computing final namespace in destination
     * 
     */
    @JsonProperty("namespaceDefinition")
    public void setNamespaceDefinition(io.airbyte.config.JobSyncConfig.NamespaceDefinitionType namespaceDefinition) {
        this.namespaceDefinition = namespaceDefinition;
    }

    public JobResetConnectionConfig withNamespaceDefinition(io.airbyte.config.JobSyncConfig.NamespaceDefinitionType namespaceDefinition) {
        this.namespaceDefinition = namespaceDefinition;
        return this;
    }

    @JsonProperty("namespaceFormat")
    public String getNamespaceFormat() {
        return namespaceFormat;
    }

    @JsonProperty("namespaceFormat")
    public void setNamespaceFormat(String namespaceFormat) {
        this.namespaceFormat = namespaceFormat;
    }

    public JobResetConnectionConfig withNamespaceFormat(String namespaceFormat) {
        this.namespaceFormat = namespaceFormat;
        return this;
    }

    /**
     * Prefix that will be prepended to the name of each stream when it is written to the destination.
     * 
     */
    @JsonProperty("prefix")
    public String getPrefix() {
        return prefix;
    }

    /**
     * Prefix that will be prepended to the name of each stream when it is written to the destination.
     * 
     */
    @JsonProperty("prefix")
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public JobResetConnectionConfig withPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

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

    public JobResetConnectionConfig withDestinationConfiguration(JsonNode destinationConfiguration) {
        this.destinationConfiguration = destinationConfiguration;
        return this;
    }

    /**
     * the configured airbyte catalog
     * (Required)
     * 
     */
    @JsonProperty("configuredAirbyteCatalog")
    public ConfiguredAirbyteCatalog getConfiguredAirbyteCatalog() {
        return configuredAirbyteCatalog;
    }

    /**
     * the configured airbyte catalog
     * (Required)
     * 
     */
    @JsonProperty("configuredAirbyteCatalog")
    public void setConfiguredAirbyteCatalog(ConfiguredAirbyteCatalog configuredAirbyteCatalog) {
        this.configuredAirbyteCatalog = configuredAirbyteCatalog;
    }

    public JobResetConnectionConfig withConfiguredAirbyteCatalog(ConfiguredAirbyteCatalog configuredAirbyteCatalog) {
        this.configuredAirbyteCatalog = configuredAirbyteCatalog;
        return this;
    }

    /**
     * Image name of the destination with tag.
     * (Required)
     * 
     */
    @JsonProperty("destinationDockerImage")
    public String getDestinationDockerImage() {
        return destinationDockerImage;
    }

    /**
     * Image name of the destination with tag.
     * (Required)
     * 
     */
    @JsonProperty("destinationDockerImage")
    public void setDestinationDockerImage(String destinationDockerImage) {
        this.destinationDockerImage = destinationDockerImage;
    }

    public JobResetConnectionConfig withDestinationDockerImage(String destinationDockerImage) {
        this.destinationDockerImage = destinationDockerImage;
        return this;
    }

    /**
     * Airbyte Protocol Version of the destination
     * 
     */
    @JsonProperty("destinationProtocolVersion")
    public Version getDestinationProtocolVersion() {
        return destinationProtocolVersion;
    }

    /**
     * Airbyte Protocol Version of the destination
     * 
     */
    @JsonProperty("destinationProtocolVersion")
    public void setDestinationProtocolVersion(Version destinationProtocolVersion) {
        this.destinationProtocolVersion = destinationProtocolVersion;
    }

    public JobResetConnectionConfig withDestinationProtocolVersion(Version destinationProtocolVersion) {
        this.destinationProtocolVersion = destinationProtocolVersion;
        return this;
    }

    /**
     * Sequence of configurations of operations to apply as part of the sync
     * 
     */
    @JsonProperty("operationSequence")
    public List<StandardSyncOperation> getOperationSequence() {
        return operationSequence;
    }

    /**
     * Sequence of configurations of operations to apply as part of the sync
     * 
     */
    @JsonProperty("operationSequence")
    public void setOperationSequence(List<StandardSyncOperation> operationSequence) {
        this.operationSequence = operationSequence;
    }

    public JobResetConnectionConfig withOperationSequence(List<StandardSyncOperation> operationSequence) {
        this.operationSequence = operationSequence;
        return this;
    }

    /**
     * The webhook operation configs belonging to this workspace. Must conform to WebhookOperationConfigs.yaml.
     * 
     */
    @JsonProperty("webhookOperationConfigs")
    public JsonNode getWebhookOperationConfigs() {
        return webhookOperationConfigs;
    }

    /**
     * The webhook operation configs belonging to this workspace. Must conform to WebhookOperationConfigs.yaml.
     * 
     */
    @JsonProperty("webhookOperationConfigs")
    public void setWebhookOperationConfigs(JsonNode webhookOperationConfigs) {
        this.webhookOperationConfigs = webhookOperationConfigs;
    }

    public JobResetConnectionConfig withWebhookOperationConfigs(JsonNode webhookOperationConfigs) {
        this.webhookOperationConfigs = webhookOperationConfigs;
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

    public JobResetConnectionConfig withResourceRequirements(ResourceRequirements resourceRequirements) {
        this.resourceRequirements = resourceRequirements;
        return this;
    }

    /**
     * ResetSourceConfiguration
     * <p>
     * configuration of the reset source
     * 
     */
    @JsonProperty("resetSourceConfiguration")
    public ResetSourceConfiguration getResetSourceConfiguration() {
        return resetSourceConfiguration;
    }

    /**
     * ResetSourceConfiguration
     * <p>
     * configuration of the reset source
     * 
     */
    @JsonProperty("resetSourceConfiguration")
    public void setResetSourceConfiguration(ResetSourceConfiguration resetSourceConfiguration) {
        this.resetSourceConfiguration = resetSourceConfiguration;
    }

    public JobResetConnectionConfig withResetSourceConfiguration(ResetSourceConfiguration resetSourceConfiguration) {
        this.resetSourceConfiguration = resetSourceConfiguration;
        return this;
    }

    /**
     * State
     * <p>
     * information output by the connection.
     * 
     */
    @JsonProperty("state")
    public State getState() {
        return state;
    }

    /**
     * State
     * <p>
     * information output by the connection.
     * 
     */
    @JsonProperty("state")
    public void setState(State state) {
        this.state = state;
    }

    public JobResetConnectionConfig withState(State state) {
        this.state = state;
        return this;
    }

    /**
     * determine if the running image of the source is a custom connector.
     * 
     */
    @JsonProperty("isSourceCustomConnector")
    public Boolean getIsSourceCustomConnector() {
        return isSourceCustomConnector;
    }

    /**
     * determine if the running image of the source is a custom connector.
     * 
     */
    @JsonProperty("isSourceCustomConnector")
    public void setIsSourceCustomConnector(Boolean isSourceCustomConnector) {
        this.isSourceCustomConnector = isSourceCustomConnector;
    }

    public JobResetConnectionConfig withIsSourceCustomConnector(Boolean isSourceCustomConnector) {
        this.isSourceCustomConnector = isSourceCustomConnector;
        return this;
    }

    /**
     * determine if the running image of the destination is a custom connector.
     * 
     */
    @JsonProperty("isDestinationCustomConnector")
    public Boolean getIsDestinationCustomConnector() {
        return isDestinationCustomConnector;
    }

    /**
     * determine if the running image of the destination is a custom connector.
     * 
     */
    @JsonProperty("isDestinationCustomConnector")
    public void setIsDestinationCustomConnector(Boolean isDestinationCustomConnector) {
        this.isDestinationCustomConnector = isDestinationCustomConnector;
    }

    public JobResetConnectionConfig withIsDestinationCustomConnector(Boolean isDestinationCustomConnector) {
        this.isDestinationCustomConnector = isDestinationCustomConnector;
        return this;
    }

    /**
     * The id of the workspace associated with the sync
     * 
     */
    @JsonProperty("workspaceId")
    public UUID getWorkspaceId() {
        return workspaceId;
    }

    /**
     * The id of the workspace associated with the sync
     * 
     */
    @JsonProperty("workspaceId")
    public void setWorkspaceId(UUID workspaceId) {
        this.workspaceId = workspaceId;
    }

    public JobResetConnectionConfig withWorkspaceId(UUID workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(JobResetConnectionConfig.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("namespaceDefinition");
        sb.append('=');
        sb.append(((this.namespaceDefinition == null)?"<null>":this.namespaceDefinition));
        sb.append(',');
        sb.append("namespaceFormat");
        sb.append('=');
        sb.append(((this.namespaceFormat == null)?"<null>":this.namespaceFormat));
        sb.append(',');
        sb.append("prefix");
        sb.append('=');
        sb.append(((this.prefix == null)?"<null>":this.prefix));
        sb.append(',');
        sb.append("destinationConfiguration");
        sb.append('=');
        sb.append(((this.destinationConfiguration == null)?"<null>":this.destinationConfiguration));
        sb.append(',');
        sb.append("configuredAirbyteCatalog");
        sb.append('=');
        sb.append(((this.configuredAirbyteCatalog == null)?"<null>":this.configuredAirbyteCatalog));
        sb.append(',');
        sb.append("destinationDockerImage");
        sb.append('=');
        sb.append(((this.destinationDockerImage == null)?"<null>":this.destinationDockerImage));
        sb.append(',');
        sb.append("destinationProtocolVersion");
        sb.append('=');
        sb.append(((this.destinationProtocolVersion == null)?"<null>":this.destinationProtocolVersion));
        sb.append(',');
        sb.append("operationSequence");
        sb.append('=');
        sb.append(((this.operationSequence == null)?"<null>":this.operationSequence));
        sb.append(',');
        sb.append("webhookOperationConfigs");
        sb.append('=');
        sb.append(((this.webhookOperationConfigs == null)?"<null>":this.webhookOperationConfigs));
        sb.append(',');
        sb.append("resourceRequirements");
        sb.append('=');
        sb.append(((this.resourceRequirements == null)?"<null>":this.resourceRequirements));
        sb.append(',');
        sb.append("resetSourceConfiguration");
        sb.append('=');
        sb.append(((this.resetSourceConfiguration == null)?"<null>":this.resetSourceConfiguration));
        sb.append(',');
        sb.append("state");
        sb.append('=');
        sb.append(((this.state == null)?"<null>":this.state));
        sb.append(',');
        sb.append("isSourceCustomConnector");
        sb.append('=');
        sb.append(((this.isSourceCustomConnector == null)?"<null>":this.isSourceCustomConnector));
        sb.append(',');
        sb.append("isDestinationCustomConnector");
        sb.append('=');
        sb.append(((this.isDestinationCustomConnector == null)?"<null>":this.isDestinationCustomConnector));
        sb.append(',');
        sb.append("workspaceId");
        sb.append('=');
        sb.append(((this.workspaceId == null)?"<null>":this.workspaceId));
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
        result = ((result* 31)+((this.webhookOperationConfigs == null)? 0 :this.webhookOperationConfigs.hashCode()));
        result = ((result* 31)+((this.operationSequence == null)? 0 :this.operationSequence.hashCode()));
        result = ((result* 31)+((this.destinationProtocolVersion == null)? 0 :this.destinationProtocolVersion.hashCode()));
        result = ((result* 31)+((this.prefix == null)? 0 :this.prefix.hashCode()));
        result = ((result* 31)+((this.configuredAirbyteCatalog == null)? 0 :this.configuredAirbyteCatalog.hashCode()));
        result = ((result* 31)+((this.isDestinationCustomConnector == null)? 0 :this.isDestinationCustomConnector.hashCode()));
        result = ((result* 31)+((this.resetSourceConfiguration == null)? 0 :this.resetSourceConfiguration.hashCode()));
        result = ((result* 31)+((this.namespaceDefinition == null)? 0 :this.namespaceDefinition.hashCode()));
        result = ((result* 31)+((this.destinationDockerImage == null)? 0 :this.destinationDockerImage.hashCode()));
        result = ((result* 31)+((this.resourceRequirements == null)? 0 :this.resourceRequirements.hashCode()));
        result = ((result* 31)+((this.destinationConfiguration == null)? 0 :this.destinationConfiguration.hashCode()));
        result = ((result* 31)+((this.isSourceCustomConnector == null)? 0 :this.isSourceCustomConnector.hashCode()));
        result = ((result* 31)+((this.namespaceFormat == null)? 0 :this.namespaceFormat.hashCode()));
        result = ((result* 31)+((this.state == null)? 0 :this.state.hashCode()));
        result = ((result* 31)+((this.workspaceId == null)? 0 :this.workspaceId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof JobResetConnectionConfig) == false) {
            return false;
        }
        JobResetConnectionConfig rhs = ((JobResetConnectionConfig) other);
        return ((((((((((((((((this.webhookOperationConfigs == rhs.webhookOperationConfigs)||((this.webhookOperationConfigs!= null)&&this.webhookOperationConfigs.equals(rhs.webhookOperationConfigs)))&&((this.operationSequence == rhs.operationSequence)||((this.operationSequence!= null)&&this.operationSequence.equals(rhs.operationSequence))))&&((this.destinationProtocolVersion == rhs.destinationProtocolVersion)||((this.destinationProtocolVersion!= null)&&this.destinationProtocolVersion.equals(rhs.destinationProtocolVersion))))&&((this.prefix == rhs.prefix)||((this.prefix!= null)&&this.prefix.equals(rhs.prefix))))&&((this.configuredAirbyteCatalog == rhs.configuredAirbyteCatalog)||((this.configuredAirbyteCatalog!= null)&&this.configuredAirbyteCatalog.equals(rhs.configuredAirbyteCatalog))))&&((this.isDestinationCustomConnector == rhs.isDestinationCustomConnector)||((this.isDestinationCustomConnector!= null)&&this.isDestinationCustomConnector.equals(rhs.isDestinationCustomConnector))))&&((this.resetSourceConfiguration == rhs.resetSourceConfiguration)||((this.resetSourceConfiguration!= null)&&this.resetSourceConfiguration.equals(rhs.resetSourceConfiguration))))&&((this.namespaceDefinition == rhs.namespaceDefinition)||((this.namespaceDefinition!= null)&&this.namespaceDefinition.equals(rhs.namespaceDefinition))))&&((this.destinationDockerImage == rhs.destinationDockerImage)||((this.destinationDockerImage!= null)&&this.destinationDockerImage.equals(rhs.destinationDockerImage))))&&((this.resourceRequirements == rhs.resourceRequirements)||((this.resourceRequirements!= null)&&this.resourceRequirements.equals(rhs.resourceRequirements))))&&((this.destinationConfiguration == rhs.destinationConfiguration)||((this.destinationConfiguration!= null)&&this.destinationConfiguration.equals(rhs.destinationConfiguration))))&&((this.isSourceCustomConnector == rhs.isSourceCustomConnector)||((this.isSourceCustomConnector!= null)&&this.isSourceCustomConnector.equals(rhs.isSourceCustomConnector))))&&((this.namespaceFormat == rhs.namespaceFormat)||((this.namespaceFormat!= null)&&this.namespaceFormat.equals(rhs.namespaceFormat))))&&((this.state == rhs.state)||((this.state!= null)&&this.state.equals(rhs.state))))&&((this.workspaceId == rhs.workspaceId)||((this.workspaceId!= null)&&this.workspaceId.equals(rhs.workspaceId))));
    }

}
