
package io.airbyte.protocol.models.v1;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "emitted_at",
    "error",
    "estimate"
})
public class AirbyteTraceMessage {

    /**
     * trace type
     * <p>
     * the type of trace message
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("the type of trace message")
    private AirbyteTraceMessage.Type type;
    /**
     * the time in ms that the message was emitted
     * (Required)
     * 
     */
    @JsonProperty("emitted_at")
    @JsonPropertyDescription("the time in ms that the message was emitted")
    private Double emittedAt;
    @JsonProperty("error")
    private AirbyteErrorTraceMessage error;
    @JsonProperty("estimate")
    private AirbyteEstimateTraceMessage estimate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * trace type
     * <p>
     * the type of trace message
     * (Required)
     * 
     */
    @JsonProperty("type")
    public AirbyteTraceMessage.Type getType() {
        return type;
    }

    /**
     * trace type
     * <p>
     * the type of trace message
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(AirbyteTraceMessage.Type type) {
        this.type = type;
    }

    public AirbyteTraceMessage withType(AirbyteTraceMessage.Type type) {
        this.type = type;
        return this;
    }

    /**
     * the time in ms that the message was emitted
     * (Required)
     * 
     */
    @JsonProperty("emitted_at")
    public Double getEmittedAt() {
        return emittedAt;
    }

    /**
     * the time in ms that the message was emitted
     * (Required)
     * 
     */
    @JsonProperty("emitted_at")
    public void setEmittedAt(Double emittedAt) {
        this.emittedAt = emittedAt;
    }

    public AirbyteTraceMessage withEmittedAt(Double emittedAt) {
        this.emittedAt = emittedAt;
        return this;
    }

    @JsonProperty("error")
    public AirbyteErrorTraceMessage getError() {
        return error;
    }

    @JsonProperty("error")
    public void setError(AirbyteErrorTraceMessage error) {
        this.error = error;
    }

    public AirbyteTraceMessage withError(AirbyteErrorTraceMessage error) {
        this.error = error;
        return this;
    }

    @JsonProperty("estimate")
    public AirbyteEstimateTraceMessage getEstimate() {
        return estimate;
    }

    @JsonProperty("estimate")
    public void setEstimate(AirbyteEstimateTraceMessage estimate) {
        this.estimate = estimate;
    }

    public AirbyteTraceMessage withEstimate(AirbyteEstimateTraceMessage estimate) {
        this.estimate = estimate;
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

    public AirbyteTraceMessage withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AirbyteTraceMessage.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("emittedAt");
        sb.append('=');
        sb.append(((this.emittedAt == null)?"<null>":this.emittedAt));
        sb.append(',');
        sb.append("error");
        sb.append('=');
        sb.append(((this.error == null)?"<null>":this.error));
        sb.append(',');
        sb.append("estimate");
        sb.append('=');
        sb.append(((this.estimate == null)?"<null>":this.estimate));
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
        result = ((result* 31)+((this.estimate == null)? 0 :this.estimate.hashCode()));
        result = ((result* 31)+((this.emittedAt == null)? 0 :this.emittedAt.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.error == null)? 0 :this.error.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AirbyteTraceMessage) == false) {
            return false;
        }
        AirbyteTraceMessage rhs = ((AirbyteTraceMessage) other);
        return ((((((this.estimate == rhs.estimate)||((this.estimate!= null)&&this.estimate.equals(rhs.estimate)))&&((this.emittedAt == rhs.emittedAt)||((this.emittedAt!= null)&&this.emittedAt.equals(rhs.emittedAt))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.error == rhs.error)||((this.error!= null)&&this.error.equals(rhs.error))));
    }


    /**
     * trace type
     * <p>
     * the type of trace message
     * 
     */
    public enum Type {

        ERROR("ERROR"),
        ESTIMATE("ESTIMATE");
        private final String value;
        private final static Map<String, AirbyteTraceMessage.Type> CONSTANTS = new HashMap<String, AirbyteTraceMessage.Type>();

        static {
            for (AirbyteTraceMessage.Type c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Type(String value) {
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
        public static AirbyteTraceMessage.Type fromValue(String value) {
            AirbyteTraceMessage.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
