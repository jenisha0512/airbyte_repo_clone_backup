
package io.airbyte.config;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "timeUnit",
    "units"
})
public class BasicSchedule implements Serializable
{

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("timeUnit")
    private BasicSchedule.TimeUnit timeUnit;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("units")
    private Long units;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 8454083747357631479L;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("timeUnit")
    public BasicSchedule.TimeUnit getTimeUnit() {
        return timeUnit;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("timeUnit")
    public void setTimeUnit(BasicSchedule.TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
    }

    public BasicSchedule withTimeUnit(BasicSchedule.TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("units")
    public Long getUnits() {
        return units;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("units")
    public void setUnits(Long units) {
        this.units = units;
    }

    public BasicSchedule withUnits(Long units) {
        this.units = units;
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

    public BasicSchedule withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BasicSchedule.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("timeUnit");
        sb.append('=');
        sb.append(((this.timeUnit == null)?"<null>":this.timeUnit));
        sb.append(',');
        sb.append("units");
        sb.append('=');
        sb.append(((this.units == null)?"<null>":this.units));
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
        result = ((result* 31)+((this.units == null)? 0 :this.units.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.timeUnit == null)? 0 :this.timeUnit.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BasicSchedule) == false) {
            return false;
        }
        BasicSchedule rhs = ((BasicSchedule) other);
        return ((((this.units == rhs.units)||((this.units!= null)&&this.units.equals(rhs.units)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.timeUnit == rhs.timeUnit)||((this.timeUnit!= null)&&this.timeUnit.equals(rhs.timeUnit))));
    }

    public enum TimeUnit {

        MINUTES("minutes"),
        HOURS("hours"),
        DAYS("days"),
        WEEKS("weeks"),
        MONTHS("months");
        private final String value;
        private final static Map<String, BasicSchedule.TimeUnit> CONSTANTS = new HashMap<String, BasicSchedule.TimeUnit>();

        static {
            for (BasicSchedule.TimeUnit c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private TimeUnit(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static BasicSchedule.TimeUnit fromValue(String value) {
            BasicSchedule.TimeUnit constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
