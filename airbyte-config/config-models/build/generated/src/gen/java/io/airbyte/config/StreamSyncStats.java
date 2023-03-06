
package io.airbyte.config;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * StreamSyncStats
 * <p>
 * Sync stats for a particular stream.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "streamName",
    "streamNamespace",
    "stats"
})
public class StreamSyncStats implements Serializable
{

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("streamName")
    private String streamName;
    @JsonProperty("streamNamespace")
    private String streamNamespace;
    /**
     * SyncStats
     * <p>
     * sync stats.
     * (Required)
     * 
     */
    @JsonProperty("stats")
    @JsonPropertyDescription("sync stats.")
    private SyncStats stats;
    private final static long serialVersionUID = -4541915893521837103L;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("streamName")
    public String getStreamName() {
        return streamName;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("streamName")
    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    public StreamSyncStats withStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    @JsonProperty("streamNamespace")
    public String getStreamNamespace() {
        return streamNamespace;
    }

    @JsonProperty("streamNamespace")
    public void setStreamNamespace(String streamNamespace) {
        this.streamNamespace = streamNamespace;
    }

    public StreamSyncStats withStreamNamespace(String streamNamespace) {
        this.streamNamespace = streamNamespace;
        return this;
    }

    /**
     * SyncStats
     * <p>
     * sync stats.
     * (Required)
     * 
     */
    @JsonProperty("stats")
    public SyncStats getStats() {
        return stats;
    }

    /**
     * SyncStats
     * <p>
     * sync stats.
     * (Required)
     * 
     */
    @JsonProperty("stats")
    public void setStats(SyncStats stats) {
        this.stats = stats;
    }

    public StreamSyncStats withStats(SyncStats stats) {
        this.stats = stats;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StreamSyncStats.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("streamName");
        sb.append('=');
        sb.append(((this.streamName == null)?"<null>":this.streamName));
        sb.append(',');
        sb.append("streamNamespace");
        sb.append('=');
        sb.append(((this.streamNamespace == null)?"<null>":this.streamNamespace));
        sb.append(',');
        sb.append("stats");
        sb.append('=');
        sb.append(((this.stats == null)?"<null>":this.stats));
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
        result = ((result* 31)+((this.streamNamespace == null)? 0 :this.streamNamespace.hashCode()));
        result = ((result* 31)+((this.streamName == null)? 0 :this.streamName.hashCode()));
        result = ((result* 31)+((this.stats == null)? 0 :this.stats.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StreamSyncStats) == false) {
            return false;
        }
        StreamSyncStats rhs = ((StreamSyncStats) other);
        return ((((this.streamNamespace == rhs.streamNamespace)||((this.streamNamespace!= null)&&this.streamNamespace.equals(rhs.streamNamespace)))&&((this.streamName == rhs.streamName)||((this.streamName!= null)&&this.streamName.equals(rhs.streamName))))&&((this.stats == rhs.stats)||((this.stats!= null)&&this.stats.equals(rhs.stats))));
    }

}
