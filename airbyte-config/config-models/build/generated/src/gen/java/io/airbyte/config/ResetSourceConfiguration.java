
package io.airbyte.config;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.airbyte.protocol.models.StreamDescriptor;


/**
 * ResetSourceConfiguration
 * <p>
 * configuration of the reset source
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "streamsToReset"
})
public class ResetSourceConfiguration implements Serializable
{

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("streamsToReset")
    private List<StreamDescriptor> streamsToReset = new ArrayList<StreamDescriptor>();
    private final static long serialVersionUID = 1794934300123687463L;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("streamsToReset")
    public List<StreamDescriptor> getStreamsToReset() {
        return streamsToReset;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("streamsToReset")
    public void setStreamsToReset(List<StreamDescriptor> streamsToReset) {
        this.streamsToReset = streamsToReset;
    }

    public ResetSourceConfiguration withStreamsToReset(List<StreamDescriptor> streamsToReset) {
        this.streamsToReset = streamsToReset;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ResetSourceConfiguration.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("streamsToReset");
        sb.append('=');
        sb.append(((this.streamsToReset == null)?"<null>":this.streamsToReset));
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
        result = ((result* 31)+((this.streamsToReset == null)? 0 :this.streamsToReset.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ResetSourceConfiguration) == false) {
            return false;
        }
        ResetSourceConfiguration rhs = ((ResetSourceConfiguration) other);
        return ((this.streamsToReset == rhs.streamsToReset)||((this.streamsToReset!= null)&&this.streamsToReset.equals(rhs.streamsToReset)));
    }

}
