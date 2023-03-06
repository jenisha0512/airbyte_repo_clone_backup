
package io.airbyte.config;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * StandardCheckConnectionOutput
 * <p>
 * describes the result of a 'check connection' action.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "status",
    "message"
})
public class StandardCheckConnectionOutput implements Serializable
{

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("status")
    private StandardCheckConnectionOutput.Status status;
    @JsonProperty("message")
    private String message;
    private final static long serialVersionUID = -558785278963077872L;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("status")
    public StandardCheckConnectionOutput.Status getStatus() {
        return status;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("status")
    public void setStatus(StandardCheckConnectionOutput.Status status) {
        this.status = status;
    }

    public StandardCheckConnectionOutput withStatus(StandardCheckConnectionOutput.Status status) {
        this.status = status;
        return this;
    }

    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    public StandardCheckConnectionOutput withMessage(String message) {
        this.message = message;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StandardCheckConnectionOutput.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("message");
        sb.append('=');
        sb.append(((this.message == null)?"<null>":this.message));
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
        result = ((result* 31)+((this.message == null)? 0 :this.message.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StandardCheckConnectionOutput) == false) {
            return false;
        }
        StandardCheckConnectionOutput rhs = ((StandardCheckConnectionOutput) other);
        return (((this.message == rhs.message)||((this.message!= null)&&this.message.equals(rhs.message)))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

    public enum Status {

        SUCCEEDED("succeeded"),
        FAILED("failed");
        private final String value;
        private final static Map<String, StandardCheckConnectionOutput.Status> CONSTANTS = new HashMap<String, StandardCheckConnectionOutput.Status>();

        static {
            for (StandardCheckConnectionOutput.Status c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Status(String value) {
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
        public static StandardCheckConnectionOutput.Status fromValue(String value) {
            StandardCheckConnectionOutput.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
