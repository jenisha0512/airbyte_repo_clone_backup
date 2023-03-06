
package io.airbyte.persistence.job.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.airbyte.commons.version.Version;
import io.airbyte.config.AllowedHosts;


/**
 * IntegrationLauncherConfig
 * <p>
 * integration launcher config
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "jobId",
    "attemptId",
    "dockerImage",
    "normalizationDockerImage",
    "supportsDbt",
    "normalizationIntegrationType",
    "protocolVersion",
    "isCustomConnector",
    "allowedHosts"
})
public class IntegrationLauncherConfig {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("jobId")
    private String jobId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("attemptId")
    private Long attemptId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("dockerImage")
    private String dockerImage;
    @JsonProperty("normalizationDockerImage")
    private String normalizationDockerImage;
    @JsonProperty("supportsDbt")
    private Boolean supportsDbt = false;
    @JsonProperty("normalizationIntegrationType")
    private String normalizationIntegrationType;
    @JsonProperty("protocolVersion")
    private Version protocolVersion;
    @JsonProperty("isCustomConnector")
    private Boolean isCustomConnector;
    @JsonProperty("allowedHosts")
    private AllowedHosts allowedHosts;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("jobId")
    public String getJobId() {
        return jobId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("jobId")
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public IntegrationLauncherConfig withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("attemptId")
    public Long getAttemptId() {
        return attemptId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("attemptId")
    public void setAttemptId(Long attemptId) {
        this.attemptId = attemptId;
    }

    public IntegrationLauncherConfig withAttemptId(Long attemptId) {
        this.attemptId = attemptId;
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

    public IntegrationLauncherConfig withDockerImage(String dockerImage) {
        this.dockerImage = dockerImage;
        return this;
    }

    @JsonProperty("normalizationDockerImage")
    public String getNormalizationDockerImage() {
        return normalizationDockerImage;
    }

    @JsonProperty("normalizationDockerImage")
    public void setNormalizationDockerImage(String normalizationDockerImage) {
        this.normalizationDockerImage = normalizationDockerImage;
    }

    public IntegrationLauncherConfig withNormalizationDockerImage(String normalizationDockerImage) {
        this.normalizationDockerImage = normalizationDockerImage;
        return this;
    }

    @JsonProperty("supportsDbt")
    public Boolean getSupportsDbt() {
        return supportsDbt;
    }

    @JsonProperty("supportsDbt")
    public void setSupportsDbt(Boolean supportsDbt) {
        this.supportsDbt = supportsDbt;
    }

    public IntegrationLauncherConfig withSupportsDbt(Boolean supportsDbt) {
        this.supportsDbt = supportsDbt;
        return this;
    }

    @JsonProperty("normalizationIntegrationType")
    public String getNormalizationIntegrationType() {
        return normalizationIntegrationType;
    }

    @JsonProperty("normalizationIntegrationType")
    public void setNormalizationIntegrationType(String normalizationIntegrationType) {
        this.normalizationIntegrationType = normalizationIntegrationType;
    }

    public IntegrationLauncherConfig withNormalizationIntegrationType(String normalizationIntegrationType) {
        this.normalizationIntegrationType = normalizationIntegrationType;
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

    public IntegrationLauncherConfig withProtocolVersion(Version protocolVersion) {
        this.protocolVersion = protocolVersion;
        return this;
    }

    @JsonProperty("isCustomConnector")
    public Boolean getIsCustomConnector() {
        return isCustomConnector;
    }

    @JsonProperty("isCustomConnector")
    public void setIsCustomConnector(Boolean isCustomConnector) {
        this.isCustomConnector = isCustomConnector;
    }

    public IntegrationLauncherConfig withIsCustomConnector(Boolean isCustomConnector) {
        this.isCustomConnector = isCustomConnector;
        return this;
    }

    @JsonProperty("allowedHosts")
    public AllowedHosts getAllowedHosts() {
        return allowedHosts;
    }

    @JsonProperty("allowedHosts")
    public void setAllowedHosts(AllowedHosts allowedHosts) {
        this.allowedHosts = allowedHosts;
    }

    public IntegrationLauncherConfig withAllowedHosts(AllowedHosts allowedHosts) {
        this.allowedHosts = allowedHosts;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(IntegrationLauncherConfig.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("jobId");
        sb.append('=');
        sb.append(((this.jobId == null)?"<null>":this.jobId));
        sb.append(',');
        sb.append("attemptId");
        sb.append('=');
        sb.append(((this.attemptId == null)?"<null>":this.attemptId));
        sb.append(',');
        sb.append("dockerImage");
        sb.append('=');
        sb.append(((this.dockerImage == null)?"<null>":this.dockerImage));
        sb.append(',');
        sb.append("normalizationDockerImage");
        sb.append('=');
        sb.append(((this.normalizationDockerImage == null)?"<null>":this.normalizationDockerImage));
        sb.append(',');
        sb.append("supportsDbt");
        sb.append('=');
        sb.append(((this.supportsDbt == null)?"<null>":this.supportsDbt));
        sb.append(',');
        sb.append("normalizationIntegrationType");
        sb.append('=');
        sb.append(((this.normalizationIntegrationType == null)?"<null>":this.normalizationIntegrationType));
        sb.append(',');
        sb.append("protocolVersion");
        sb.append('=');
        sb.append(((this.protocolVersion == null)?"<null>":this.protocolVersion));
        sb.append(',');
        sb.append("isCustomConnector");
        sb.append('=');
        sb.append(((this.isCustomConnector == null)?"<null>":this.isCustomConnector));
        sb.append(',');
        sb.append("allowedHosts");
        sb.append('=');
        sb.append(((this.allowedHosts == null)?"<null>":this.allowedHosts));
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
        result = ((result* 31)+((this.allowedHosts == null)? 0 :this.allowedHosts.hashCode()));
        result = ((result* 31)+((this.jobId == null)? 0 :this.jobId.hashCode()));
        result = ((result* 31)+((this.dockerImage == null)? 0 :this.dockerImage.hashCode()));
        result = ((result* 31)+((this.normalizationIntegrationType == null)? 0 :this.normalizationIntegrationType.hashCode()));
        result = ((result* 31)+((this.supportsDbt == null)? 0 :this.supportsDbt.hashCode()));
        result = ((result* 31)+((this.normalizationDockerImage == null)? 0 :this.normalizationDockerImage.hashCode()));
        result = ((result* 31)+((this.protocolVersion == null)? 0 :this.protocolVersion.hashCode()));
        result = ((result* 31)+((this.attemptId == null)? 0 :this.attemptId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof IntegrationLauncherConfig) == false) {
            return false;
        }
        IntegrationLauncherConfig rhs = ((IntegrationLauncherConfig) other);
        return ((((((((((this.isCustomConnector == rhs.isCustomConnector)||((this.isCustomConnector!= null)&&this.isCustomConnector.equals(rhs.isCustomConnector)))&&((this.allowedHosts == rhs.allowedHosts)||((this.allowedHosts!= null)&&this.allowedHosts.equals(rhs.allowedHosts))))&&((this.jobId == rhs.jobId)||((this.jobId!= null)&&this.jobId.equals(rhs.jobId))))&&((this.dockerImage == rhs.dockerImage)||((this.dockerImage!= null)&&this.dockerImage.equals(rhs.dockerImage))))&&((this.normalizationIntegrationType == rhs.normalizationIntegrationType)||((this.normalizationIntegrationType!= null)&&this.normalizationIntegrationType.equals(rhs.normalizationIntegrationType))))&&((this.supportsDbt == rhs.supportsDbt)||((this.supportsDbt!= null)&&this.supportsDbt.equals(rhs.supportsDbt))))&&((this.normalizationDockerImage == rhs.normalizationDockerImage)||((this.normalizationDockerImage!= null)&&this.normalizationDockerImage.equals(rhs.normalizationDockerImage))))&&((this.protocolVersion == rhs.protocolVersion)||((this.protocolVersion!= null)&&this.protocolVersion.equals(rhs.protocolVersion))))&&((this.attemptId == rhs.attemptId)||((this.attemptId!= null)&&this.attemptId.equals(rhs.attemptId))));
    }

}
