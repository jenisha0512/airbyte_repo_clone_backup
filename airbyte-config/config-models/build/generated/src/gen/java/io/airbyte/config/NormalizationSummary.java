
package io.airbyte.config;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * NormalizationSummary
 * <p>
 * information output by syncs for which a normalization step was performed
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "startTime",
    "endTime",
    "failures"
})
public class NormalizationSummary implements Serializable
{

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("startTime")
    private Long startTime;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("endTime")
    private Long endTime;
    @JsonProperty("failures")
    private List<FailureReason> failures = new ArrayList<FailureReason>();
    private final static long serialVersionUID = -428701705969330857L;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("startTime")
    public Long getStartTime() {
        return startTime;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("startTime")
    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public NormalizationSummary withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("endTime")
    public Long getEndTime() {
        return endTime;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("endTime")
    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public NormalizationSummary withEndTime(Long endTime) {
        this.endTime = endTime;
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

    public NormalizationSummary withFailures(List<FailureReason> failures) {
        this.failures = failures;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(NormalizationSummary.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("startTime");
        sb.append('=');
        sb.append(((this.startTime == null)?"<null>":this.startTime));
        sb.append(',');
        sb.append("endTime");
        sb.append('=');
        sb.append(((this.endTime == null)?"<null>":this.endTime));
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
        result = ((result* 31)+((this.startTime == null)? 0 :this.startTime.hashCode()));
        result = ((result* 31)+((this.endTime == null)? 0 :this.endTime.hashCode()));
        result = ((result* 31)+((this.failures == null)? 0 :this.failures.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NormalizationSummary) == false) {
            return false;
        }
        NormalizationSummary rhs = ((NormalizationSummary) other);
        return ((((this.startTime == rhs.startTime)||((this.startTime!= null)&&this.startTime.equals(rhs.startTime)))&&((this.endTime == rhs.endTime)||((this.endTime!= null)&&this.endTime.equals(rhs.endTime))))&&((this.failures == rhs.failures)||((this.failures!= null)&&this.failures.equals(rhs.failures))));
    }

}
