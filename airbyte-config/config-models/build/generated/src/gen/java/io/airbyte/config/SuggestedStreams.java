
package io.airbyte.config;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * SuggestedStreams
 * <p>
 * A source's suggested streams.  These will be suggested by default for new connections using this source.  Otherwise, all streams will be selected.  This is useful for when your source has a lot of streams, but the average user will only want a subset of them synced.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "streams"
})
public class SuggestedStreams implements Serializable
{

    /**
     * An array of streams that this connector suggests the average user will want.  SuggestedStreams not being present for the source means that all streams are suggested.  An empty list here means that no streams are suggested.
     * 
     */
    @JsonProperty("streams")
    @JsonPropertyDescription("An array of streams that this connector suggests the average user will want.  SuggestedStreams not being present for the source means that all streams are suggested.  An empty list here means that no streams are suggested.")
    private List<String> streams = new ArrayList<String>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -6822951286282778085L;

    /**
     * An array of streams that this connector suggests the average user will want.  SuggestedStreams not being present for the source means that all streams are suggested.  An empty list here means that no streams are suggested.
     * 
     */
    @JsonProperty("streams")
    public List<String> getStreams() {
        return streams;
    }

    /**
     * An array of streams that this connector suggests the average user will want.  SuggestedStreams not being present for the source means that all streams are suggested.  An empty list here means that no streams are suggested.
     * 
     */
    @JsonProperty("streams")
    public void setStreams(List<String> streams) {
        this.streams = streams;
    }

    public SuggestedStreams withStreams(List<String> streams) {
        this.streams = streams;
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

    public SuggestedStreams withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SuggestedStreams.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("streams");
        sb.append('=');
        sb.append(((this.streams == null)?"<null>":this.streams));
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
        result = ((result* 31)+((this.streams == null)? 0 :this.streams.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SuggestedStreams) == false) {
            return false;
        }
        SuggestedStreams rhs = ((SuggestedStreams) other);
        return (((this.streams == rhs.streams)||((this.streams!= null)&&this.streams.equals(rhs.streams)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
