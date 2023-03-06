
package io.airbyte.config;

import java.io.Serializable;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * StandardSyncState
 * <p>
 * The current state of a connection (i.e. StandardSync).
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "connectionId",
    "state"
})
public class StandardSyncState implements Serializable
{

    /**
     * This is a foreign key that references a connection (i.e. StandardSync).
     * (Required)
     * 
     */
    @JsonProperty("connectionId")
    @JsonPropertyDescription("This is a foreign key that references a connection (i.e. StandardSync).")
    private UUID connectionId;
    /**
     * State
     * <p>
     * information output by the connection.
     * 
     */
    @JsonProperty("state")
    @JsonPropertyDescription("information output by the connection.")
    private State state;
    private final static long serialVersionUID = -725491642275093307L;

    /**
     * This is a foreign key that references a connection (i.e. StandardSync).
     * (Required)
     * 
     */
    @JsonProperty("connectionId")
    public UUID getConnectionId() {
        return connectionId;
    }

    /**
     * This is a foreign key that references a connection (i.e. StandardSync).
     * (Required)
     * 
     */
    @JsonProperty("connectionId")
    public void setConnectionId(UUID connectionId) {
        this.connectionId = connectionId;
    }

    public StandardSyncState withConnectionId(UUID connectionId) {
        this.connectionId = connectionId;
        return this;
    }

    /**
     * State
     * <p>
     * information output by the connection.
     * 
     */
    @JsonProperty("state")
    public State getState() {
        return state;
    }

    /**
     * State
     * <p>
     * information output by the connection.
     * 
     */
    @JsonProperty("state")
    public void setState(State state) {
        this.state = state;
    }

    public StandardSyncState withState(State state) {
        this.state = state;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StandardSyncState.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("connectionId");
        sb.append('=');
        sb.append(((this.connectionId == null)?"<null>":this.connectionId));
        sb.append(',');
        sb.append("state");
        sb.append('=');
        sb.append(((this.state == null)?"<null>":this.state));
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
        result = ((result* 31)+((this.connectionId == null)? 0 :this.connectionId.hashCode()));
        result = ((result* 31)+((this.state == null)? 0 :this.state.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StandardSyncState) == false) {
            return false;
        }
        StandardSyncState rhs = ((StandardSyncState) other);
        return (((this.connectionId == rhs.connectionId)||((this.connectionId!= null)&&this.connectionId.equals(rhs.connectionId)))&&((this.state == rhs.state)||((this.state!= null)&&this.state.equals(rhs.state))));
    }

}
