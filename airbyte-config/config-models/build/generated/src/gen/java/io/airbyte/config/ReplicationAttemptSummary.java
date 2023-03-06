
package io.airbyte.config;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ReplicationAttemptSummary
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "status",
    "recordsSynced",
    "bytesSynced",
    "startTime",
    "endTime",
    "totalStats",
    "streamStats"
})
public class ReplicationAttemptSummary implements Serializable
{

    /**
     * ReplicationStatus
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("status")
    private io.airbyte.config.StandardSyncSummary.ReplicationStatus status;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("recordsSynced")
    private Long recordsSynced;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("bytesSynced")
    private Long bytesSynced;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("startTime")
    private Long startTime;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("endTime")
    private Long endTime;
    /**
     * SyncStats
     * <p>
     * sync stats.
     * (Required)
     * 
     */
    @JsonProperty("totalStats")
    @JsonPropertyDescription("sync stats.")
    private SyncStats totalStats;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("streamStats")
    private List<StreamSyncStats> streamStats = new ArrayList<StreamSyncStats>();
    private final static long serialVersionUID = -3466220874702132360L;

    /**
     * ReplicationStatus
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("status")
    public io.airbyte.config.StandardSyncSummary.ReplicationStatus getStatus() {
        return status;
    }

    /**
     * ReplicationStatus
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("status")
    public void setStatus(io.airbyte.config.StandardSyncSummary.ReplicationStatus status) {
        this.status = status;
    }

    public ReplicationAttemptSummary withStatus(io.airbyte.config.StandardSyncSummary.ReplicationStatus status) {
        this.status = status;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("recordsSynced")
    public Long getRecordsSynced() {
        return recordsSynced;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("recordsSynced")
    public void setRecordsSynced(Long recordsSynced) {
        this.recordsSynced = recordsSynced;
    }

    public ReplicationAttemptSummary withRecordsSynced(Long recordsSynced) {
        this.recordsSynced = recordsSynced;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("bytesSynced")
    public Long getBytesSynced() {
        return bytesSynced;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("bytesSynced")
    public void setBytesSynced(Long bytesSynced) {
        this.bytesSynced = bytesSynced;
    }

    public ReplicationAttemptSummary withBytesSynced(Long bytesSynced) {
        this.bytesSynced = bytesSynced;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("startTime")
    public Long getStartTime() {
        return startTime;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("startTime")
    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public ReplicationAttemptSummary withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("endTime")
    public Long getEndTime() {
        return endTime;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("endTime")
    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public ReplicationAttemptSummary withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * SyncStats
     * <p>
     * sync stats.
     * (Required)
     * 
     */
    @JsonProperty("totalStats")
    public SyncStats getTotalStats() {
        return totalStats;
    }

    /**
     * SyncStats
     * <p>
     * sync stats.
     * (Required)
     * 
     */
    @JsonProperty("totalStats")
    public void setTotalStats(SyncStats totalStats) {
        this.totalStats = totalStats;
    }

    public ReplicationAttemptSummary withTotalStats(SyncStats totalStats) {
        this.totalStats = totalStats;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("streamStats")
    public List<StreamSyncStats> getStreamStats() {
        return streamStats;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("streamStats")
    public void setStreamStats(List<StreamSyncStats> streamStats) {
        this.streamStats = streamStats;
    }

    public ReplicationAttemptSummary withStreamStats(List<StreamSyncStats> streamStats) {
        this.streamStats = streamStats;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ReplicationAttemptSummary.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("recordsSynced");
        sb.append('=');
        sb.append(((this.recordsSynced == null)?"<null>":this.recordsSynced));
        sb.append(',');
        sb.append("bytesSynced");
        sb.append('=');
        sb.append(((this.bytesSynced == null)?"<null>":this.bytesSynced));
        sb.append(',');
        sb.append("startTime");
        sb.append('=');
        sb.append(((this.startTime == null)?"<null>":this.startTime));
        sb.append(',');
        sb.append("endTime");
        sb.append('=');
        sb.append(((this.endTime == null)?"<null>":this.endTime));
        sb.append(',');
        sb.append("totalStats");
        sb.append('=');
        sb.append(((this.totalStats == null)?"<null>":this.totalStats));
        sb.append(',');
        sb.append("streamStats");
        sb.append('=');
        sb.append(((this.streamStats == null)?"<null>":this.streamStats));
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
        result = ((result* 31)+((this.totalStats == null)? 0 :this.totalStats.hashCode()));
        result = ((result* 31)+((this.bytesSynced == null)? 0 :this.bytesSynced.hashCode()));
        result = ((result* 31)+((this.streamStats == null)? 0 :this.streamStats.hashCode()));
        result = ((result* 31)+((this.startTime == null)? 0 :this.startTime.hashCode()));
        result = ((result* 31)+((this.endTime == null)? 0 :this.endTime.hashCode()));
        result = ((result* 31)+((this.recordsSynced == null)? 0 :this.recordsSynced.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ReplicationAttemptSummary) == false) {
            return false;
        }
        ReplicationAttemptSummary rhs = ((ReplicationAttemptSummary) other);
        return ((((((((this.totalStats == rhs.totalStats)||((this.totalStats!= null)&&this.totalStats.equals(rhs.totalStats)))&&((this.bytesSynced == rhs.bytesSynced)||((this.bytesSynced!= null)&&this.bytesSynced.equals(rhs.bytesSynced))))&&((this.streamStats == rhs.streamStats)||((this.streamStats!= null)&&this.streamStats.equals(rhs.streamStats))))&&((this.startTime == rhs.startTime)||((this.startTime!= null)&&this.startTime.equals(rhs.startTime))))&&((this.endTime == rhs.endTime)||((this.endTime!= null)&&this.endTime.equals(rhs.endTime))))&&((this.recordsSynced == rhs.recordsSynced)||((this.recordsSynced!= null)&&this.recordsSynced.equals(rhs.recordsSynced))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
