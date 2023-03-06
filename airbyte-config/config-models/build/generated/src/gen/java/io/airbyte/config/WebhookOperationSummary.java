
package io.airbyte.config;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * WebhookOperationSummary
 * <p>
 * information output by syncs for which at least one webhook invocation step was performed
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "successes",
    "failures"
})
public class WebhookOperationSummary implements Serializable
{

    /**
     * List of webhook config ids that were successfully executed.
     * 
     */
    @JsonProperty("successes")
    @JsonPropertyDescription("List of webhook config ids that were successfully executed.")
    private List<UUID> successes = new ArrayList<UUID>();
    /**
     * List of webhook config ids that failed.
     * 
     */
    @JsonProperty("failures")
    @JsonPropertyDescription("List of webhook config ids that failed.")
    private List<UUID> failures = new ArrayList<UUID>();
    private final static long serialVersionUID = 1714333350800453004L;

    /**
     * List of webhook config ids that were successfully executed.
     * 
     */
    @JsonProperty("successes")
    public List<UUID> getSuccesses() {
        return successes;
    }

    /**
     * List of webhook config ids that were successfully executed.
     * 
     */
    @JsonProperty("successes")
    public void setSuccesses(List<UUID> successes) {
        this.successes = successes;
    }

    public WebhookOperationSummary withSuccesses(List<UUID> successes) {
        this.successes = successes;
        return this;
    }

    /**
     * List of webhook config ids that failed.
     * 
     */
    @JsonProperty("failures")
    public List<UUID> getFailures() {
        return failures;
    }

    /**
     * List of webhook config ids that failed.
     * 
     */
    @JsonProperty("failures")
    public void setFailures(List<UUID> failures) {
        this.failures = failures;
    }

    public WebhookOperationSummary withFailures(List<UUID> failures) {
        this.failures = failures;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(WebhookOperationSummary.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("successes");
        sb.append('=');
        sb.append(((this.successes == null)?"<null>":this.successes));
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
        result = ((result* 31)+((this.successes == null)? 0 :this.successes.hashCode()));
        result = ((result* 31)+((this.failures == null)? 0 :this.failures.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof WebhookOperationSummary) == false) {
            return false;
        }
        WebhookOperationSummary rhs = ((WebhookOperationSummary) other);
        return (((this.successes == rhs.successes)||((this.successes!= null)&&this.successes.equals(rhs.successes)))&&((this.failures == rhs.failures)||((this.failures!= null)&&this.failures.equals(rhs.failures))));
    }

}
