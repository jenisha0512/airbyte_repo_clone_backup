
package io.airbyte.config;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "cronExpression",
    "cronTimeZone"
})
public class Cron implements Serializable
{

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("cronExpression")
    private String cronExpression;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("cronTimeZone")
    private String cronTimeZone;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 8620561375915278737L;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("cronExpression")
    public String getCronExpression() {
        return cronExpression;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("cronExpression")
    public void setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
    }

    public Cron withCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("cronTimeZone")
    public String getCronTimeZone() {
        return cronTimeZone;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("cronTimeZone")
    public void setCronTimeZone(String cronTimeZone) {
        this.cronTimeZone = cronTimeZone;
    }

    public Cron withCronTimeZone(String cronTimeZone) {
        this.cronTimeZone = cronTimeZone;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Cron withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Cron.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cronExpression");
        sb.append('=');
        sb.append(((this.cronExpression == null)?"<null>":this.cronExpression));
        sb.append(',');
        sb.append("cronTimeZone");
        sb.append('=');
        sb.append(((this.cronTimeZone == null)?"<null>":this.cronTimeZone));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
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
        result = ((result* 31)+((this.cronExpression == null)? 0 :this.cronExpression.hashCode()));
        result = ((result* 31)+((this.cronTimeZone == null)? 0 :this.cronTimeZone.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Cron) == false) {
            return false;
        }
        Cron rhs = ((Cron) other);
        return ((((this.cronExpression == rhs.cronExpression)||((this.cronExpression!= null)&&this.cronExpression.equals(rhs.cronExpression)))&&((this.cronTimeZone == rhs.cronTimeZone)||((this.cronTimeZone!= null)&&this.cronTimeZone.equals(rhs.cronTimeZone))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
