
package io.airbyte.config;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * AttemptFailureSummary
 * <p>
 * Attempt-level summarization of failures that occurred during a sync workflow.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "failures",
    "partialSuccess"
})
public class AttemptFailureSummary implements Serializable
{

    /**
     * Ordered list of failures that occurred during the attempt.
     * (Required)
     * 
     */
    @JsonProperty("failures")
    @JsonPropertyDescription("Ordered list of failures that occurred during the attempt.")
    private List<FailureReason> failures = new ArrayList<FailureReason>();
    /**
     * True if the number of committed records for this attempt was greater than 0. False if 0 records were committed. Blank if number of committed records is unknown.
     * 
     */
    @JsonProperty("partialSuccess")
    @JsonPropertyDescription("True if the number of committed records for this attempt was greater than 0. False if 0 records were committed. Blank if number of committed records is unknown.")
    private Boolean partialSuccess;
    private final static long serialVersionUID = -9065693637249217586L;

    /**
     * Ordered list of failures that occurred during the attempt.
     * (Required)
     * 
     */
    @JsonProperty("failures")
    public List<FailureReason> getFailures() {
        return failures;
    }

    /**
     * Ordered list of failures that occurred during the attempt.
     * (Required)
     * 
     */
    @JsonProperty("failures")
    public void setFailures(List<FailureReason> failures) {
        this.failures = failures;
    }

    public AttemptFailureSummary withFailures(List<FailureReason> failures) {
        this.failures = failures;
        return this;
    }

    /**
     * True if the number of committed records for this attempt was greater than 0. False if 0 records were committed. Blank if number of committed records is unknown.
     * 
     */
    @JsonProperty("partialSuccess")
    public Boolean getPartialSuccess() {
        return partialSuccess;
    }

    /**
     * True if the number of committed records for this attempt was greater than 0. False if 0 records were committed. Blank if number of committed records is unknown.
     * 
     */
    @JsonProperty("partialSuccess")
    public void setPartialSuccess(Boolean partialSuccess) {
        this.partialSuccess = partialSuccess;
    }

    public AttemptFailureSummary withPartialSuccess(Boolean partialSuccess) {
        this.partialSuccess = partialSuccess;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AttemptFailureSummary.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("failures");
        sb.append('=');
        sb.append(((this.failures == null)?"<null>":this.failures));
        sb.append(',');
        sb.append("partialSuccess");
        sb.append('=');
        sb.append(((this.partialSuccess == null)?"<null>":this.partialSuccess));
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
        result = ((result* 31)+((this.partialSuccess == null)? 0 :this.partialSuccess.hashCode()));
        result = ((result* 31)+((this.failures == null)? 0 :this.failures.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AttemptFailureSummary) == false) {
            return false;
        }
        AttemptFailureSummary rhs = ((AttemptFailureSummary) other);
        return (((this.partialSuccess == rhs.partialSuccess)||((this.partialSuccess!= null)&&this.partialSuccess.equals(rhs.partialSuccess)))&&((this.failures == rhs.failures)||((this.failures!= null)&&this.failures.equals(rhs.failures))));
    }

}
