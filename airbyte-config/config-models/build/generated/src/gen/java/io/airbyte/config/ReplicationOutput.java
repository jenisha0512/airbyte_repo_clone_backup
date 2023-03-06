
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
 * ReplicationOutput
 * <p>
 * metadata summary of a replication attempt
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "replicationAttemptSummary",
    "state",
    "output_catalog",
    "failures"
})
public class ReplicationOutput implements Serializable
{

    /**
     * ReplicationAttemptSummary
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("replicationAttemptSummary")
    private ReplicationAttemptSummary replicationAttemptSummary;
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
    private final static long serialVersionUID = -2484890999813827902L;

    /**
     * ReplicationAttemptSummary
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("replicationAttemptSummary")
    public ReplicationAttemptSummary getReplicationAttemptSummary() {
        return replicationAttemptSummary;
    }

    /**
     * ReplicationAttemptSummary
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("replicationAttemptSummary")
    public void setReplicationAttemptSummary(ReplicationAttemptSummary replicationAttemptSummary) {
        this.replicationAttemptSummary = replicationAttemptSummary;
    }

    public ReplicationOutput withReplicationAttemptSummary(ReplicationAttemptSummary replicationAttemptSummary) {
        this.replicationAttemptSummary = replicationAttemptSummary;
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

    public ReplicationOutput withState(State state) {
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

    public ReplicationOutput withOutputCatalog(ConfiguredAirbyteCatalog outputCatalog) {
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

    public ReplicationOutput withFailures(List<FailureReason> failures) {
        this.failures = failures;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ReplicationOutput.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("replicationAttemptSummary");
        sb.append('=');
        sb.append(((this.replicationAttemptSummary == null)?"<null>":this.replicationAttemptSummary));
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
        result = ((result* 31)+((this.outputCatalog == null)? 0 :this.outputCatalog.hashCode()));
        result = ((result* 31)+((this.state == null)? 0 :this.state.hashCode()));
        result = ((result* 31)+((this.failures == null)? 0 :this.failures.hashCode()));
        result = ((result* 31)+((this.replicationAttemptSummary == null)? 0 :this.replicationAttemptSummary.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ReplicationOutput) == false) {
            return false;
        }
        ReplicationOutput rhs = ((ReplicationOutput) other);
        return (((((this.outputCatalog == rhs.outputCatalog)||((this.outputCatalog!= null)&&this.outputCatalog.equals(rhs.outputCatalog)))&&((this.state == rhs.state)||((this.state!= null)&&this.state.equals(rhs.state))))&&((this.failures == rhs.failures)||((this.failures!= null)&&this.failures.equals(rhs.failures))))&&((this.replicationAttemptSummary == rhs.replicationAttemptSummary)||((this.replicationAttemptSummary!= null)&&this.replicationAttemptSummary.equals(rhs.replicationAttemptSummary))));
    }

}
