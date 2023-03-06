
package io.airbyte.config;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "timeUnit",
    "units"
})
public class Schedule implements Serializable
{

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("timeUnit")
    private Schedule.TimeUnit timeUnit;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("units")
    private Long units;
    private final static long serialVersionUID = 7042869411656125707L;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("timeUnit")
    public Schedule.TimeUnit getTimeUnit() {
        return timeUnit;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("timeUnit")
    public void setTimeUnit(Schedule.TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
    }

    public Schedule withTimeUnit(Schedule.TimeUnit timeUnit) {
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

    public Schedule withUnits(Long units) {
        this.units = units;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Schedule.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("timeUnit");
        sb.append('=');
        sb.append(((this.timeUnit == null)?"<null>":this.timeUnit));
        sb.append(',');
        sb.append("units");
        sb.append('=');
        sb.append(((this.units == null)?"<null>":this.units));
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
        result = ((result* 31)+((this.timeUnit == null)? 0 :this.timeUnit.hashCode()));
        result = ((result* 31)+((this.units == null)? 0 :this.units.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Schedule) == false) {
            return false;
        }
        Schedule rhs = ((Schedule) other);
        return (((this.timeUnit == rhs.timeUnit)||((this.timeUnit!= null)&&this.timeUnit.equals(rhs.timeUnit)))&&((this.units == rhs.units)||((this.units!= null)&&this.units.equals(rhs.units))));
    }

    public enum TimeUnit {

        MINUTES("minutes"),
        HOURS("hours"),
        DAYS("days"),
        WEEKS("weeks"),
        MONTHS("months");
        private final String value;
        private final static Map<String, Schedule.TimeUnit> CONSTANTS = new HashMap<String, Schedule.TimeUnit>();

        static {
            for (Schedule.TimeUnit c: values()) {
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
        public static Schedule.TimeUnit fromValue(String value) {
            Schedule.TimeUnit constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
