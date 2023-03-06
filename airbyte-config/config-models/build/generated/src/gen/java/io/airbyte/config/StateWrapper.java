
package io.airbyte.config;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.JsonNode;


/**
 * StateWrapper
 * <p>
 * Wrapper around the different type of States
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "stateType",
    "legacyState",
    "global",
    "stateMessages"
})
public class StateWrapper implements Serializable
{

    /**
     * StateType
     * <p>
     * State Types
     * (Required)
     * 
     */
    @JsonProperty("stateType")
    @JsonPropertyDescription("State Types")
    private StateType stateType;
    /**
     * Legacy State for states that haven't been migrated yet
     * 
     */
    @JsonProperty("legacyState")
    @JsonPropertyDescription("Legacy State for states that haven't been migrated yet")
    private JsonNode legacyState;
    /**
     * Representation of the shared
     * 
     */
    @JsonProperty("global")
    @JsonPropertyDescription("Representation of the shared")
    private io.airbyte.protocol.models.AirbyteStateMessage global;
    @JsonProperty("stateMessages")
    private List<io.airbyte.protocol.models.AirbyteStateMessage> stateMessages = new ArrayList<io.airbyte.protocol.models.AirbyteStateMessage>();
    private final static long serialVersionUID = 5010395409022481574L;

    /**
     * StateType
     * <p>
     * State Types
     * (Required)
     * 
     */
    @JsonProperty("stateType")
    public StateType getStateType() {
        return stateType;
    }

    /**
     * StateType
     * <p>
     * State Types
     * (Required)
     * 
     */
    @JsonProperty("stateType")
    public void setStateType(StateType stateType) {
        this.stateType = stateType;
    }

    public StateWrapper withStateType(StateType stateType) {
        this.stateType = stateType;
        return this;
    }

    /**
     * Legacy State for states that haven't been migrated yet
     * 
     */
    @JsonProperty("legacyState")
    public JsonNode getLegacyState() {
        return legacyState;
    }

    /**
     * Legacy State for states that haven't been migrated yet
     * 
     */
    @JsonProperty("legacyState")
    public void setLegacyState(JsonNode legacyState) {
        this.legacyState = legacyState;
    }

    public StateWrapper withLegacyState(JsonNode legacyState) {
        this.legacyState = legacyState;
        return this;
    }

    /**
     * Representation of the shared
     * 
     */
    @JsonProperty("global")
    public io.airbyte.protocol.models.AirbyteStateMessage getGlobal() {
        return global;
    }

    /**
     * Representation of the shared
     * 
     */
    @JsonProperty("global")
    public void setGlobal(io.airbyte.protocol.models.AirbyteStateMessage global) {
        this.global = global;
    }

    public StateWrapper withGlobal(io.airbyte.protocol.models.AirbyteStateMessage global) {
        this.global = global;
        return this;
    }

    @JsonProperty("stateMessages")
    public List<io.airbyte.protocol.models.AirbyteStateMessage> getStateMessages() {
        return stateMessages;
    }

    @JsonProperty("stateMessages")
    public void setStateMessages(List<io.airbyte.protocol.models.AirbyteStateMessage> stateMessages) {
        this.stateMessages = stateMessages;
    }

    public StateWrapper withStateMessages(List<io.airbyte.protocol.models.AirbyteStateMessage> stateMessages) {
        this.stateMessages = stateMessages;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StateWrapper.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("stateType");
        sb.append('=');
        sb.append(((this.stateType == null)?"<null>":this.stateType));
        sb.append(',');
        sb.append("legacyState");
        sb.append('=');
        sb.append(((this.legacyState == null)?"<null>":this.legacyState));
        sb.append(',');
        sb.append("global");
        sb.append('=');
        sb.append(((this.global == null)?"<null>":this.global));
        sb.append(',');
        sb.append("stateMessages");
        sb.append('=');
        sb.append(((this.stateMessages == null)?"<null>":this.stateMessages));
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
        result = ((result* 31)+((this.legacyState == null)? 0 :this.legacyState.hashCode()));
        result = ((result* 31)+((this.global == null)? 0 :this.global.hashCode()));
        result = ((result* 31)+((this.stateMessages == null)? 0 :this.stateMessages.hashCode()));
        result = ((result* 31)+((this.stateType == null)? 0 :this.stateType.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StateWrapper) == false) {
            return false;
        }
        StateWrapper rhs = ((StateWrapper) other);
        return (((((this.legacyState == rhs.legacyState)||((this.legacyState!= null)&&this.legacyState.equals(rhs.legacyState)))&&((this.global == rhs.global)||((this.global!= null)&&this.global.equals(rhs.global))))&&((this.stateMessages == rhs.stateMessages)||((this.stateMessages!= null)&&this.stateMessages.equals(rhs.stateMessages))))&&((this.stateType == rhs.stateType)||((this.stateType!= null)&&this.stateType.equals(rhs.stateType))));
    }

}
