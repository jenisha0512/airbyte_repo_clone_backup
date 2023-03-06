
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
    "name",
    "type",
    "namespace",
    "row_estimate",
    "byte_estimate"
})
public class AirbyteEstimateTraceMessage {

    /**
     * The name of the stream
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("The name of the stream")
    private String name;
    /**
     * estimate type
     * <p>
     * Estimates are either per-stream (STREAM) or for the entire sync (SYNC). STREAM is preferred, and requires the source to count how many records are about to be emitted per-stream (e.g. there will be 100 rows from this table emitted). For the rare source which cannot tell which stream a record belongs to before reading (e.g. CDC databases), SYNC estimates can be emitted. Sources should not emit both STREAM and SOURCE estimates within a sync.
     * 
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Estimates are either per-stream (STREAM) or for the entire sync (SYNC). STREAM is preferred, and requires the source to count how many records are about to be emitted per-stream (e.g. there will be 100 rows from this table emitted). For the rare source which cannot tell which stream a record belongs to before reading (e.g. CDC databases), SYNC estimates can be emitted. Sources should not emit both STREAM and SOURCE estimates within a sync.\n")
    private AirbyteEstimateTraceMessage.Type type;
    /**
     * The namespace of the stream
     * 
     */
    @JsonProperty("namespace")
    @JsonPropertyDescription("The namespace of the stream")
    private String namespace;
    /**
     * The estimated number of rows to be emitted by this sync for this stream
     * 
     */
    @JsonProperty("row_estimate")
    @JsonPropertyDescription("The estimated number of rows to be emitted by this sync for this stream")
    private Long rowEstimate;
    /**
     * The estimated number of bytes to be emitted by this sync for this stream
     * 
     */
    @JsonProperty("byte_estimate")
    @JsonPropertyDescription("The estimated number of bytes to be emitted by this sync for this stream")
    private Long byteEstimate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The name of the stream
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * The name of the stream
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public AirbyteEstimateTraceMessage withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * estimate type
     * <p>
     * Estimates are either per-stream (STREAM) or for the entire sync (SYNC). STREAM is preferred, and requires the source to count how many records are about to be emitted per-stream (e.g. there will be 100 rows from this table emitted). For the rare source which cannot tell which stream a record belongs to before reading (e.g. CDC databases), SYNC estimates can be emitted. Sources should not emit both STREAM and SOURCE estimates within a sync.
     * 
     * (Required)
     * 
     */
    @JsonProperty("type")
    public AirbyteEstimateTraceMessage.Type getType() {
        return type;
    }

    /**
     * estimate type
     * <p>
     * Estimates are either per-stream (STREAM) or for the entire sync (SYNC). STREAM is preferred, and requires the source to count how many records are about to be emitted per-stream (e.g. there will be 100 rows from this table emitted). For the rare source which cannot tell which stream a record belongs to before reading (e.g. CDC databases), SYNC estimates can be emitted. Sources should not emit both STREAM and SOURCE estimates within a sync.
     * 
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(AirbyteEstimateTraceMessage.Type type) {
        this.type = type;
    }

    public AirbyteEstimateTraceMessage withType(AirbyteEstimateTraceMessage.Type type) {
        this.type = type;
        return this;
    }

    /**
     * The namespace of the stream
     * 
     */
    @JsonProperty("namespace")
    public String getNamespace() {
        return namespace;
    }

    /**
     * The namespace of the stream
     * 
     */
    @JsonProperty("namespace")
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public AirbyteEstimateTraceMessage withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * The estimated number of rows to be emitted by this sync for this stream
     * 
     */
    @JsonProperty("row_estimate")
    public Long getRowEstimate() {
        return rowEstimate;
    }

    /**
     * The estimated number of rows to be emitted by this sync for this stream
     * 
     */
    @JsonProperty("row_estimate")
    public void setRowEstimate(Long rowEstimate) {
        this.rowEstimate = rowEstimate;
    }

    public AirbyteEstimateTraceMessage withRowEstimate(Long rowEstimate) {
        this.rowEstimate = rowEstimate;
        return this;
    }

    /**
     * The estimated number of bytes to be emitted by this sync for this stream
     * 
     */
    @JsonProperty("byte_estimate")
    public Long getByteEstimate() {
        return byteEstimate;
    }

    /**
     * The estimated number of bytes to be emitted by this sync for this stream
     * 
     */
    @JsonProperty("byte_estimate")
    public void setByteEstimate(Long byteEstimate) {
        this.byteEstimate = byteEstimate;
    }

    public AirbyteEstimateTraceMessage withByteEstimate(Long byteEstimate) {
        this.byteEstimate = byteEstimate;
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

    public AirbyteEstimateTraceMessage withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AirbyteEstimateTraceMessage.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("namespace");
        sb.append('=');
        sb.append(((this.namespace == null)?"<null>":this.namespace));
        sb.append(',');
        sb.append("rowEstimate");
        sb.append('=');
        sb.append(((this.rowEstimate == null)?"<null>":this.rowEstimate));
        sb.append(',');
        sb.append("byteEstimate");
        sb.append('=');
        sb.append(((this.byteEstimate == null)?"<null>":this.byteEstimate));
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
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.namespace == null)? 0 :this.namespace.hashCode()));
        result = ((result* 31)+((this.rowEstimate == null)? 0 :this.rowEstimate.hashCode()));
        result = ((result* 31)+((this.byteEstimate == null)? 0 :this.byteEstimate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AirbyteEstimateTraceMessage) == false) {
            return false;
        }
        AirbyteEstimateTraceMessage rhs = ((AirbyteEstimateTraceMessage) other);
        return (((((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.namespace == rhs.namespace)||((this.namespace!= null)&&this.namespace.equals(rhs.namespace))))&&((this.rowEstimate == rhs.rowEstimate)||((this.rowEstimate!= null)&&this.rowEstimate.equals(rhs.rowEstimate))))&&((this.byteEstimate == rhs.byteEstimate)||((this.byteEstimate!= null)&&this.byteEstimate.equals(rhs.byteEstimate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))));
    }


    /**
     * estimate type
     * <p>
     * Estimates are either per-stream (STREAM) or for the entire sync (SYNC). STREAM is preferred, and requires the source to count how many records are about to be emitted per-stream (e.g. there will be 100 rows from this table emitted). For the rare source which cannot tell which stream a record belongs to before reading (e.g. CDC databases), SYNC estimates can be emitted. Sources should not emit both STREAM and SOURCE estimates within a sync.
     * 
     * 
     */
    public enum Type {

        STREAM("STREAM"),
        SYNC("SYNC");
        private final String value;
        private final static Map<String, AirbyteEstimateTraceMessage.Type> CONSTANTS = new HashMap<String, AirbyteEstimateTraceMessage.Type>();

        static {
            for (AirbyteEstimateTraceMessage.Type c: values()) {
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
        public static AirbyteEstimateTraceMessage.Type fromValue(String value) {
            AirbyteEstimateTraceMessage.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
