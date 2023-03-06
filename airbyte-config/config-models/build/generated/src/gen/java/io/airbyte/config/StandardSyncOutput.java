
package io.airbyte.config;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.airbyte.protocol.models.ConfiguredAirbyteCatalog;


/**
 * StandardSyncOutput
 * <p>
 * job sync config
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "standardSyncSummary",
    "normalizationSummary",
    "webhookOperationSummary",
    "state",
    "output_catalog",
    "failures"
})
public class StandardSyncOutput implements Serializable
{

    /**
     * StandardSyncSummary
     * <p>
     * standard information output by ALL sources for a sync step (our version of state.json)
     * (Required)
     * 
     */
    @JsonProperty("standardSyncSummary")
    @JsonPropertyDescription("standard information output by ALL sources for a sync step (our version of state.json)")
    private StandardSyncSummary standardSyncSummary;
    /**
     * NormalizationSummary
     * <p>
     * information output by syncs for which a normalization step was performed
     * 
     */
    @JsonProperty("normalizationSummary")
    @JsonPropertyDescription("information output by syncs for which a normalization step was performed")
    private NormalizationSummary normalizationSummary;
    /**
     * WebhookOperationSummary
     * <p>
     * information output by syncs for which at least one webhook invocation step was performed
     * 
     */
    @JsonProperty("webhookOperationSummary")
    @JsonPropertyDescription("information output by syncs for which at least one webhook invocation step was performed")
    private WebhookOperationSummary webhookOperationSummary;
    /**
     * State
     * <p>
     * information output by the connection.
     * (Required)
     * 
     */
    @JsonProperty("state")
    @JsonPropertyDescription("information output by the connection.")
    private State state;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("output_catalog")
    private ConfiguredAirbyteCatalog outputCatalog;
    @JsonProperty("failures")
    private List<FailureReason> failures = new ArrayList<FailureReason>();
    private final static long serialVersionUID = 1280741308695126384L;

    /**
     * StandardSyncSummary
     * <p>
     * standard information output by ALL sources for a sync step (our version of state.json)
     * (Required)
     * 
     */
    @JsonProperty("standardSyncSummary")
    public StandardSyncSummary getStandardSyncSummary() {
        return standardSyncSummary;
    }

    /**
     * StandardSyncSummary
     * <p>
     * standard information output by ALL sources for a sync step (our version of state.json)
     * (Required)
     * 
     */
    @JsonProperty("standardSyncSummary")
    public void setStandardSyncSummary(StandardSyncSummary standardSyncSummary) {
        this.standardSyncSummary = standardSyncSummary;
    }

    public StandardSyncOutput withStandardSyncSummary(StandardSyncSummary standardSyncSummary) {
        this.standardSyncSummary = standardSyncSummary;
        return this;
    }

    /**
     * NormalizationSummary
     * <p>
     * information output by syncs for which a normalization step was performed
     * 
     */
    @JsonProperty("normalizationSummary")
    public NormalizationSummary getNormalizationSummary() {
        return normalizationSummary;
    }

    /**
     * NormalizationSummary
     * <p>
     * information output by syncs for which a normalization step was performed
     * 
     */
    @JsonProperty("normalizationSummary")
    public void setNormalizationSummary(NormalizationSummary normalizationSummary) {
        this.normalizationSummary = normalizationSummary;
    }

    public StandardSyncOutput withNormalizationSummary(NormalizationSummary normalizationSummary) {
        this.normalizationSummary = normalizationSummary;
        return this;
    }

    /**
     * WebhookOperationSummary
     * <p>
     * information output by syncs for which at least one webhook invocation step was performed
     * 
     */
    @JsonProperty("webhookOperationSummary")
    public WebhookOperationSummary getWebhookOperationSummary() {
        return webhookOperationSummary;
    }

    /**
     * WebhookOperationSummary
     * <p>
     * information output by syncs for which at least one webhook invocation step was performed
     * 
     */
    @JsonProperty("webhookOperationSummary")
    public void setWebhookOperationSummary(WebhookOperationSummary webhookOperationSummary) {
        this.webhookOperationSummary = webhookOperationSummary;
    }

    public StandardSyncOutput withWebhookOperationSummary(WebhookOperationSummary webhookOperationSummary) {
        this.webhookOperationSummary = webhookOperationSummary;
        return this;
    }

    /**
     * State
     * <p>
     * information output by the connection.
     * (Required)
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
     * (Required)
     * 
     */
    @JsonProperty("state")
    public void setState(State state) {
        this.state = state;
    }

    public StandardSyncOutput withState(State state) {
        this.state = state;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("output_catalog")
    public ConfiguredAirbyteCatalog getOutputCatalog() {
        return outputCatalog;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("output_catalog")
    public void setOutputCatalog(ConfiguredAirbyteCatalog outputCatalog) {
        this.outputCatalog = outputCatalog;
    }

    public StandardSyncOutput withOutputCatalog(ConfiguredAirbyteCatalog outputCatalog) {
        this.outputCatalog = outputCatalog;
        return this;
    }

    @JsonProperty("failures")
    public List<FailureReason> getFailures() {
        return failures;
    }

    @JsonProperty("failures")
    public void setFailures(List<FailureReason> failures) {
        this.failures = failures;
    }

    public StandardSyncOutput withFailures(List<FailureReason> failures) {
        this.failures = failures;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StandardSyncOutput.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("standardSyncSummary");
        sb.append('=');
        sb.append(((this.standardSyncSummary == null)?"<null>":this.standardSyncSummary));
        sb.append(',');
        sb.append("normalizationSummary");
        sb.append('=');
        sb.append(((this.normalizationSummary == null)?"<null>":this.normalizationSummary));
        sb.append(',');
        sb.append("webhookOperationSummary");
        sb.append('=');
        sb.append(((this.webhookOperationSummary == null)?"<null>":this.webhookOperationSummary));
        sb.append(',');
        sb.append("state");
        sb.append('=');
        sb.append(((this.state == null)?"<null>":this.state));
        sb.append(',');
        sb.append("outputCatalog");
        sb.append('=');
        sb.append(((this.outputCatalog == null)?"<null>":this.outputCatalog));
        sb.append(',');
        sb.append("failures");
        sb.append('=');
        sb.append(((this.failures == null)?"<null>":this.failures));
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
        result = ((result* 31)+((this.webhookOperationSummary == null)? 0 :this.webhookOperationSummary.hashCode()));
        result = ((result* 31)+((this.outputCatalog == null)? 0 :this.outputCatalog.hashCode()));
        result = ((result* 31)+((this.failures == null)? 0 :this.failures.hashCode()));
        result = ((result* 31)+((this.normalizationSummary == null)? 0 :this.normalizationSummary.hashCode()));
        result = ((result* 31)+((this.state == null)? 0 :this.state.hashCode()));
        result = ((result* 31)+((this.standardSyncSummary == null)? 0 :this.standardSyncSummary.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StandardSyncOutput) == false) {
            return false;
        }
        StandardSyncOutput rhs = ((StandardSyncOutput) other);
        return (((((((this.webhookOperationSummary == rhs.webhookOperationSummary)||((this.webhookOperationSummary!= null)&&this.webhookOperationSummary.equals(rhs.webhookOperationSummary)))&&((this.outputCatalog == rhs.outputCatalog)||((this.outputCatalog!= null)&&this.outputCatalog.equals(rhs.outputCatalog))))&&((this.failures == rhs.failures)||((this.failures!= null)&&this.failures.equals(rhs.failures))))&&((this.normalizationSummary == rhs.normalizationSummary)||((this.normalizationSummary!= null)&&this.normalizationSummary.equals(rhs.normalizationSummary))))&&((this.state == rhs.state)||((this.state!= null)&&this.state.equals(rhs.state))))&&((this.standardSyncSummary == rhs.standardSyncSummary)||((this.standardSyncSummary!= null)&&this.standardSyncSummary.equals(rhs.standardSyncSummary))));
    }

}
