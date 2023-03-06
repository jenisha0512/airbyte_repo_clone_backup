
package io.airbyte.config;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.airbyte.protocol.models.ConnectorSpecification;


/**
 * StandardGetSpecOutput
 * <p>
 * job get spec output
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "specification"
})
public class StandardGetSpecOutput implements Serializable
{

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("specification")
    private ConnectorSpecification specification;
    private final static long serialVersionUID = 2057105535413285973L;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("specification")
    public ConnectorSpecification getSpecification() {
        return specification;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("specification")
    public void setSpecification(ConnectorSpecification specification) {
        this.specification = specification;
    }

    public StandardGetSpecOutput withSpecification(ConnectorSpecification specification) {
        this.specification = specification;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StandardGetSpecOutput.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("specification");
        sb.append('=');
        sb.append(((this.specification == null)?"<null>":this.specification));
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
        result = ((result* 31)+((this.specification == null)? 0 :this.specification.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StandardGetSpecOutput) == false) {
            return false;
        }
        StandardGetSpecOutput rhs = ((StandardGetSpecOutput) other);
        return ((this.specification == rhs.specification)||((this.specification!= null)&&this.specification.equals(rhs.specification)));
    }

}
