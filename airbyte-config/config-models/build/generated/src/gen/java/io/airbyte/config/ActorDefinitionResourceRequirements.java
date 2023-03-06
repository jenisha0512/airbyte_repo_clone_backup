
package io.airbyte.config;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ActorDefinitionResourceRequirements
 * <p>
 * actor definition specific resource requirements
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "default",
    "jobSpecific"
})
public class ActorDefinitionResourceRequirements implements Serializable
{

    /**
     * ResourceRequirements
     * <p>
     * generic configuration for pod source requirements
     * 
     */
    @JsonProperty("default")
    @JsonPropertyDescription("generic configuration for pod source requirements")
    private ResourceRequirements _default;
    @JsonProperty("jobSpecific")
    private List<JobTypeResourceLimit> jobSpecific = new ArrayList<JobTypeResourceLimit>();
    private final static long serialVersionUID = -6773248732062060787L;

    /**
     * ResourceRequirements
     * <p>
     * generic configuration for pod source requirements
     * 
     */
    @JsonProperty("default")
    public ResourceRequirements getDefault() {
        return _default;
    }

    /**
     * ResourceRequirements
     * <p>
     * generic configuration for pod source requirements
     * 
     */
    @JsonProperty("default")
    public void setDefault(ResourceRequirements _default) {
        this._default = _default;
    }

    public ActorDefinitionResourceRequirements withDefault(ResourceRequirements _default) {
        this._default = _default;
        return this;
    }

    @JsonProperty("jobSpecific")
    public List<JobTypeResourceLimit> getJobSpecific() {
        return jobSpecific;
    }

    @JsonProperty("jobSpecific")
    public void setJobSpecific(List<JobTypeResourceLimit> jobSpecific) {
        this.jobSpecific = jobSpecific;
    }

    public ActorDefinitionResourceRequirements withJobSpecific(List<JobTypeResourceLimit> jobSpecific) {
        this.jobSpecific = jobSpecific;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ActorDefinitionResourceRequirements.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("_default");
        sb.append('=');
        sb.append(((this._default == null)?"<null>":this._default));
        sb.append(',');
        sb.append("jobSpecific");
        sb.append('=');
        sb.append(((this.jobSpecific == null)?"<null>":this.jobSpecific));
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
        result = ((result* 31)+((this._default == null)? 0 :this._default.hashCode()));
        result = ((result* 31)+((this.jobSpecific == null)? 0 :this.jobSpecific.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ActorDefinitionResourceRequirements) == false) {
            return false;
        }
        ActorDefinitionResourceRequirements rhs = ((ActorDefinitionResourceRequirements) other);
        return (((this._default == rhs._default)||((this._default!= null)&&this._default.equals(rhs._default)))&&((this.jobSpecific == rhs.jobSpecific)||((this.jobSpecific!= null)&&this.jobSpecific.equals(rhs.jobSpecific))));
    }

}
