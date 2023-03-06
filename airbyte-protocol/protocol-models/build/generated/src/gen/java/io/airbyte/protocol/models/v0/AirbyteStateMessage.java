
package io.airbyte.protocol.models.v0;

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
import com.fasterxml.jackson.databind.JsonNode;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "stream",
    "global",
    "data"
})
public class AirbyteStateMessage {

    /**
     * The type of state the other fields represent. Is set to LEGACY, the state data should be read from the `data` field for backwards compatibility. If not set, assume the state object is type LEGACY. GLOBAL means that the state should be read from `global` and means that it represents the state for all the streams. It contains one shared state and individual stream states. PER_STREAM means that the state should be read from `stream`. The state present in this field correspond to the isolated state of the associated stream description.
     * 
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type of state the other fields represent. Is set to LEGACY, the state data should be read from the `data` field for backwards compatibility. If not set, assume the state object is type LEGACY. GLOBAL means that the state should be read from `global` and means that it represents the state for all the streams. It contains one shared state and individual stream states. PER_STREAM means that the state should be read from `stream`. The state present in this field correspond to the isolated state of the associated stream description.\n")
    private AirbyteStateMessage.AirbyteStateType type;
    @JsonProperty("stream")
    private AirbyteStreamState stream;
    @JsonProperty("global")
    private AirbyteGlobalState global;
    /**
     * (Deprecated) the state data
     * 
     */
    @JsonProperty("data")
    @JsonPropertyDescription("(Deprecated) the state data")
    private JsonNode data;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The type of state the other fields represent. Is set to LEGACY, the state data should be read from the `data` field for backwards compatibility. If not set, assume the state object is type LEGACY. GLOBAL means that the state should be read from `global` and means that it represents the state for all the streams. It contains one shared state and individual stream states. PER_STREAM means that the state should be read from `stream`. The state present in this field correspond to the isolated state of the associated stream description.
     * 
     * 
     */
    @JsonProperty("type")
    public AirbyteStateMessage.AirbyteStateType getType() {
        return type;
    }

    /**
     * The type of state the other fields represent. Is set to LEGACY, the state data should be read from the `data` field for backwards compatibility. If not set, assume the state object is type LEGACY. GLOBAL means that the state should be read from `global` and means that it represents the state for all the streams. It contains one shared state and individual stream states. PER_STREAM means that the state should be read from `stream`. The state present in this field correspond to the isolated state of the associated stream description.
     * 
     * 
     */
    @JsonProperty("type")
    public void setType(AirbyteStateMessage.AirbyteStateType type) {
        this.type = type;
    }

    public AirbyteStateMessage withType(AirbyteStateMessage.AirbyteStateType type) {
        this.type = type;
        return this;
    }

    @JsonProperty("stream")
    public AirbyteStreamState getStream() {
        return stream;
    }

    @JsonProperty("stream")
    public void setStream(AirbyteStreamState stream) {
        this.stream = stream;
    }

    public AirbyteStateMessage withStream(AirbyteStreamState stream) {
        this.stream = stream;
        return this;
    }

    @JsonProperty("global")
    public AirbyteGlobalState getGlobal() {
        return global;
    }

    @JsonProperty("global")
    public void setGlobal(AirbyteGlobalState global) {
        this.global = global;
    }

    public AirbyteStateMessage withGlobal(AirbyteGlobalState global) {
        this.global = global;
        return this;
    }

    /**
     * (Deprecated) the state data
     * 
     */
    @JsonProperty("data")
    public JsonNode getData() {
        return data;
    }

    /**
     * (Deprecated) the state data
     * 
     */
    @JsonProperty("data")
    public void setData(JsonNode data) {
        this.data = data;
    }

    public AirbyteStateMessage withData(JsonNode data) {
        this.data = data;
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

    public AirbyteStateMessage withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AirbyteStateMessage.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("stream");
        sb.append('=');
        sb.append(((this.stream == null)?"<null>":this.stream));
        sb.append(',');
        sb.append("global");
        sb.append('=');
        sb.append(((this.global == null)?"<null>":this.global));
        sb.append(',');
        sb.append("data");
        sb.append('=');
        sb.append(((this.data == null)?"<null>":this.data));
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
        result = ((result* 31)+((this.global == null)? 0 :this.global.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.data == null)? 0 :this.data.hashCode()));
        result = ((result* 31)+((this.stream == null)? 0 :this.stream.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AirbyteStateMessage) == false) {
            return false;
        }
        AirbyteStateMessage rhs = ((AirbyteStateMessage) other);
        return ((((((this.global == rhs.global)||((this.global!= null)&&this.global.equals(rhs.global)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.data == rhs.data)||((this.data!= null)&&this.data.equals(rhs.data))))&&((this.stream == rhs.stream)||((this.stream!= null)&&this.stream.equals(rhs.stream))));
    }


    /**
     * The type of state the other fields represent. Is set to LEGACY, the state data should be read from the `data` field for backwards compatibility. If not set, assume the state object is type LEGACY. GLOBAL means that the state should be read from `global` and means that it represents the state for all the streams. It contains one shared state and individual stream states. PER_STREAM means that the state should be read from `stream`. The state present in this field correspond to the isolated state of the associated stream description.
     * 
     * 
     */
    public enum AirbyteStateType {

        GLOBAL("GLOBAL"),
        STREAM("STREAM"),
        LEGACY("LEGACY");
        private final String value;
        private final static Map<String, AirbyteStateMessage.AirbyteStateType> CONSTANTS = new HashMap<String, AirbyteStateMessage.AirbyteStateType>();

        static {
            for (AirbyteStateMessage.AirbyteStateType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private AirbyteStateType(String value) {
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
        public static AirbyteStateMessage.AirbyteStateType fromValue(String value) {
            AirbyteStateMessage.AirbyteStateType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
