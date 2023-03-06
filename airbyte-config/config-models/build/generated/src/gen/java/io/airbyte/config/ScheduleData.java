
package io.airbyte.config;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "basicSchedule",
    "cron"
})
public class ScheduleData implements Serializable
{

    @JsonProperty("basicSchedule")
    private BasicSchedule basicSchedule;
    @JsonProperty("cron")
    private Cron cron;
    private final static long serialVersionUID = 4613721379802178288L;

    @JsonProperty("basicSchedule")
    public BasicSchedule getBasicSchedule() {
        return basicSchedule;
    }

    @JsonProperty("basicSchedule")
    public void setBasicSchedule(BasicSchedule basicSchedule) {
        this.basicSchedule = basicSchedule;
    }

    public ScheduleData withBasicSchedule(BasicSchedule basicSchedule) {
        this.basicSchedule = basicSchedule;
        return this;
    }

    @JsonProperty("cron")
    public Cron getCron() {
        return cron;
    }

    @JsonProperty("cron")
    public void setCron(Cron cron) {
        this.cron = cron;
    }

    public ScheduleData withCron(Cron cron) {
        this.cron = cron;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ScheduleData.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("basicSchedule");
        sb.append('=');
        sb.append(((this.basicSchedule == null)?"<null>":this.basicSchedule));
        sb.append(',');
        sb.append("cron");
        sb.append('=');
        sb.append(((this.cron == null)?"<null>":this.cron));
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
        result = ((result* 31)+((this.cron == null)? 0 :this.cron.hashCode()));
        result = ((result* 31)+((this.basicSchedule == null)? 0 :this.basicSchedule.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ScheduleData) == false) {
            return false;
        }
        ScheduleData rhs = ((ScheduleData) other);
        return (((this.cron == rhs.cron)||((this.cron!= null)&&this.cron.equals(rhs.cron)))&&((this.basicSchedule == rhs.basicSchedule)||((this.basicSchedule!= null)&&this.basicSchedule.equals(rhs.basicSchedule))));
    }

}
