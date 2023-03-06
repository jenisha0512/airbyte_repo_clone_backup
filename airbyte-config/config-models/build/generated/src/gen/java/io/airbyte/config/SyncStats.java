
package io.airbyte.config;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * SyncStats
 * <p>
 * sync stats.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "bytesEmitted",
    "destinationStateMessagesEmitted",
    "destinationWriteEndTime",
    "destinationWriteStartTime",
    "estimatedBytes",
    "estimatedRecords",
    "meanSecondsBeforeSourceStateMessageEmitted",
    "maxSecondsBeforeSourceStateMessageEmitted",
    "maxSecondsBetweenStateMessageEmittedandCommitted",
    "meanSecondsBetweenStateMessageEmittedandCommitted",
    "recordsEmitted",
    "recordsCommitted",
    "replicationEndTime",
    "replicationStartTime",
    "sourceReadEndTime",
    "sourceReadStartTime",
    "sourceStateMessagesEmitted"
})
public class SyncStats implements Serializable
{

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("bytesEmitted")
    private Long bytesEmitted;
    /**
     * Number of State messages emitted by the Destination Connector
     * 
     */
    @JsonProperty("destinationStateMessagesEmitted")
    @JsonPropertyDescription("Number of State messages emitted by the Destination Connector")
    private Long destinationStateMessagesEmitted;
    /**
     * The exit time of the destination container/pod
     * 
     */
    @JsonProperty("destinationWriteEndTime")
    @JsonPropertyDescription("The exit time of the destination container/pod")
    private Long destinationWriteEndTime;
    /**
     * The boot time of the destination container/pod
     * 
     */
    @JsonProperty("destinationWriteStartTime")
    @JsonPropertyDescription("The boot time of the destination container/pod")
    private Long destinationWriteStartTime;
    /**
     * The total estimated number of bytes for the sync
     * 
     */
    @JsonProperty("estimatedBytes")
    @JsonPropertyDescription("The total estimated number of bytes for the sync")
    private Long estimatedBytes;
    /**
     * The total estimated number of records for the sync
     * 
     */
    @JsonProperty("estimatedRecords")
    @JsonPropertyDescription("The total estimated number of records for the sync")
    private Long estimatedRecords;
    @JsonProperty("meanSecondsBeforeSourceStateMessageEmitted")
    private Long meanSecondsBeforeSourceStateMessageEmitted;
    @JsonProperty("maxSecondsBeforeSourceStateMessageEmitted")
    private Long maxSecondsBeforeSourceStateMessageEmitted;
    @JsonProperty("maxSecondsBetweenStateMessageEmittedandCommitted")
    private Long maxSecondsBetweenStateMessageEmittedandCommitted;
    @JsonProperty("meanSecondsBetweenStateMessageEmittedandCommitted")
    private Long meanSecondsBetweenStateMessageEmittedandCommitted;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("recordsEmitted")
    private Long recordsEmitted;
    @JsonProperty("recordsCommitted")
    private Long recordsCommitted;
    /**
     * The end of the replication activity
     * 
     */
    @JsonProperty("replicationEndTime")
    @JsonPropertyDescription("The end of the replication activity")
    private Long replicationEndTime;
    /**
     * The start of the replication activity
     * 
     */
    @JsonProperty("replicationStartTime")
    @JsonPropertyDescription("The start of the replication activity")
    private Long replicationStartTime;
    /**
     * The exit time of the source container/pod
     * 
     */
    @JsonProperty("sourceReadEndTime")
    @JsonPropertyDescription("The exit time of the source container/pod")
    private Long sourceReadEndTime;
    /**
     * The boot time of the source container/pod
     * 
     */
    @JsonProperty("sourceReadStartTime")
    @JsonPropertyDescription("The boot time of the source container/pod")
    private Long sourceReadStartTime;
    /**
     * Number of State messages emitted by the Source Connector
     * 
     */
    @JsonProperty("sourceStateMessagesEmitted")
    @JsonPropertyDescription("Number of State messages emitted by the Source Connector")
    private Long sourceStateMessagesEmitted;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -3655668042437997706L;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("bytesEmitted")
    public Long getBytesEmitted() {
        return bytesEmitted;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("bytesEmitted")
    public void setBytesEmitted(Long bytesEmitted) {
        this.bytesEmitted = bytesEmitted;
    }

    public SyncStats withBytesEmitted(Long bytesEmitted) {
        this.bytesEmitted = bytesEmitted;
        return this;
    }

    /**
     * Number of State messages emitted by the Destination Connector
     * 
     */
    @JsonProperty("destinationStateMessagesEmitted")
    public Long getDestinationStateMessagesEmitted() {
        return destinationStateMessagesEmitted;
    }

    /**
     * Number of State messages emitted by the Destination Connector
     * 
     */
    @JsonProperty("destinationStateMessagesEmitted")
    public void setDestinationStateMessagesEmitted(Long destinationStateMessagesEmitted) {
        this.destinationStateMessagesEmitted = destinationStateMessagesEmitted;
    }

    public SyncStats withDestinationStateMessagesEmitted(Long destinationStateMessagesEmitted) {
        this.destinationStateMessagesEmitted = destinationStateMessagesEmitted;
        return this;
    }

    /**
     * The exit time of the destination container/pod
     * 
     */
    @JsonProperty("destinationWriteEndTime")
    public Long getDestinationWriteEndTime() {
        return destinationWriteEndTime;
    }

    /**
     * The exit time of the destination container/pod
     * 
     */
    @JsonProperty("destinationWriteEndTime")
    public void setDestinationWriteEndTime(Long destinationWriteEndTime) {
        this.destinationWriteEndTime = destinationWriteEndTime;
    }

    public SyncStats withDestinationWriteEndTime(Long destinationWriteEndTime) {
        this.destinationWriteEndTime = destinationWriteEndTime;
        return this;
    }

    /**
     * The boot time of the destination container/pod
     * 
     */
    @JsonProperty("destinationWriteStartTime")
    public Long getDestinationWriteStartTime() {
        return destinationWriteStartTime;
    }

    /**
     * The boot time of the destination container/pod
     * 
     */
    @JsonProperty("destinationWriteStartTime")
    public void setDestinationWriteStartTime(Long destinationWriteStartTime) {
        this.destinationWriteStartTime = destinationWriteStartTime;
    }

    public SyncStats withDestinationWriteStartTime(Long destinationWriteStartTime) {
        this.destinationWriteStartTime = destinationWriteStartTime;
        return this;
    }

    /**
     * The total estimated number of bytes for the sync
     * 
     */
    @JsonProperty("estimatedBytes")
    public Long getEstimatedBytes() {
        return estimatedBytes;
    }

    /**
     * The total estimated number of bytes for the sync
     * 
     */
    @JsonProperty("estimatedBytes")
    public void setEstimatedBytes(Long estimatedBytes) {
        this.estimatedBytes = estimatedBytes;
    }

    public SyncStats withEstimatedBytes(Long estimatedBytes) {
        this.estimatedBytes = estimatedBytes;
        return this;
    }

    /**
     * The total estimated number of records for the sync
     * 
     */
    @JsonProperty("estimatedRecords")
    public Long getEstimatedRecords() {
        return estimatedRecords;
    }

    /**
     * The total estimated number of records for the sync
     * 
     */
    @JsonProperty("estimatedRecords")
    public void setEstimatedRecords(Long estimatedRecords) {
        this.estimatedRecords = estimatedRecords;
    }

    public SyncStats withEstimatedRecords(Long estimatedRecords) {
        this.estimatedRecords = estimatedRecords;
        return this;
    }

    @JsonProperty("meanSecondsBeforeSourceStateMessageEmitted")
    public Long getMeanSecondsBeforeSourceStateMessageEmitted() {
        return meanSecondsBeforeSourceStateMessageEmitted;
    }

    @JsonProperty("meanSecondsBeforeSourceStateMessageEmitted")
    public void setMeanSecondsBeforeSourceStateMessageEmitted(Long meanSecondsBeforeSourceStateMessageEmitted) {
        this.meanSecondsBeforeSourceStateMessageEmitted = meanSecondsBeforeSourceStateMessageEmitted;
    }

    public SyncStats withMeanSecondsBeforeSourceStateMessageEmitted(Long meanSecondsBeforeSourceStateMessageEmitted) {
        this.meanSecondsBeforeSourceStateMessageEmitted = meanSecondsBeforeSourceStateMessageEmitted;
        return this;
    }

    @JsonProperty("maxSecondsBeforeSourceStateMessageEmitted")
    public Long getMaxSecondsBeforeSourceStateMessageEmitted() {
        return maxSecondsBeforeSourceStateMessageEmitted;
    }

    @JsonProperty("maxSecondsBeforeSourceStateMessageEmitted")
    public void setMaxSecondsBeforeSourceStateMessageEmitted(Long maxSecondsBeforeSourceStateMessageEmitted) {
        this.maxSecondsBeforeSourceStateMessageEmitted = maxSecondsBeforeSourceStateMessageEmitted;
    }

    public SyncStats withMaxSecondsBeforeSourceStateMessageEmitted(Long maxSecondsBeforeSourceStateMessageEmitted) {
        this.maxSecondsBeforeSourceStateMessageEmitted = maxSecondsBeforeSourceStateMessageEmitted;
        return this;
    }

    @JsonProperty("maxSecondsBetweenStateMessageEmittedandCommitted")
    public Long getMaxSecondsBetweenStateMessageEmittedandCommitted() {
        return maxSecondsBetweenStateMessageEmittedandCommitted;
    }

    @JsonProperty("maxSecondsBetweenStateMessageEmittedandCommitted")
    public void setMaxSecondsBetweenStateMessageEmittedandCommitted(Long maxSecondsBetweenStateMessageEmittedandCommitted) {
        this.maxSecondsBetweenStateMessageEmittedandCommitted = maxSecondsBetweenStateMessageEmittedandCommitted;
    }

    public SyncStats withMaxSecondsBetweenStateMessageEmittedandCommitted(Long maxSecondsBetweenStateMessageEmittedandCommitted) {
        this.maxSecondsBetweenStateMessageEmittedandCommitted = maxSecondsBetweenStateMessageEmittedandCommitted;
        return this;
    }

    @JsonProperty("meanSecondsBetweenStateMessageEmittedandCommitted")
    public Long getMeanSecondsBetweenStateMessageEmittedandCommitted() {
        return meanSecondsBetweenStateMessageEmittedandCommitted;
    }

    @JsonProperty("meanSecondsBetweenStateMessageEmittedandCommitted")
    public void setMeanSecondsBetweenStateMessageEmittedandCommitted(Long meanSecondsBetweenStateMessageEmittedandCommitted) {
        this.meanSecondsBetweenStateMessageEmittedandCommitted = meanSecondsBetweenStateMessageEmittedandCommitted;
    }

    public SyncStats withMeanSecondsBetweenStateMessageEmittedandCommitted(Long meanSecondsBetweenStateMessageEmittedandCommitted) {
        this.meanSecondsBetweenStateMessageEmittedandCommitted = meanSecondsBetweenStateMessageEmittedandCommitted;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("recordsEmitted")
    public Long getRecordsEmitted() {
        return recordsEmitted;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("recordsEmitted")
    public void setRecordsEmitted(Long recordsEmitted) {
        this.recordsEmitted = recordsEmitted;
    }

    public SyncStats withRecordsEmitted(Long recordsEmitted) {
        this.recordsEmitted = recordsEmitted;
        return this;
    }

    @JsonProperty("recordsCommitted")
    public Long getRecordsCommitted() {
        return recordsCommitted;
    }

    @JsonProperty("recordsCommitted")
    public void setRecordsCommitted(Long recordsCommitted) {
        this.recordsCommitted = recordsCommitted;
    }

    public SyncStats withRecordsCommitted(Long recordsCommitted) {
        this.recordsCommitted = recordsCommitted;
        return this;
    }

    /**
     * The end of the replication activity
     * 
     */
    @JsonProperty("replicationEndTime")
    public Long getReplicationEndTime() {
        return replicationEndTime;
    }

    /**
     * The end of the replication activity
     * 
     */
    @JsonProperty("replicationEndTime")
    public void setReplicationEndTime(Long replicationEndTime) {
        this.replicationEndTime = replicationEndTime;
    }

    public SyncStats withReplicationEndTime(Long replicationEndTime) {
        this.replicationEndTime = replicationEndTime;
        return this;
    }

    /**
     * The start of the replication activity
     * 
     */
    @JsonProperty("replicationStartTime")
    public Long getReplicationStartTime() {
        return replicationStartTime;
    }

    /**
     * The start of the replication activity
     * 
     */
    @JsonProperty("replicationStartTime")
    public void setReplicationStartTime(Long replicationStartTime) {
        this.replicationStartTime = replicationStartTime;
    }

    public SyncStats withReplicationStartTime(Long replicationStartTime) {
        this.replicationStartTime = replicationStartTime;
        return this;
    }

    /**
     * The exit time of the source container/pod
     * 
     */
    @JsonProperty("sourceReadEndTime")
    public Long getSourceReadEndTime() {
        return sourceReadEndTime;
    }

    /**
     * The exit time of the source container/pod
     * 
     */
    @JsonProperty("sourceReadEndTime")
    public void setSourceReadEndTime(Long sourceReadEndTime) {
        this.sourceReadEndTime = sourceReadEndTime;
    }

    public SyncStats withSourceReadEndTime(Long sourceReadEndTime) {
        this.sourceReadEndTime = sourceReadEndTime;
        return this;
    }

    /**
     * The boot time of the source container/pod
     * 
     */
    @JsonProperty("sourceReadStartTime")
    public Long getSourceReadStartTime() {
        return sourceReadStartTime;
    }

    /**
     * The boot time of the source container/pod
     * 
     */
    @JsonProperty("sourceReadStartTime")
    public void setSourceReadStartTime(Long sourceReadStartTime) {
        this.sourceReadStartTime = sourceReadStartTime;
    }

    public SyncStats withSourceReadStartTime(Long sourceReadStartTime) {
        this.sourceReadStartTime = sourceReadStartTime;
        return this;
    }

    /**
     * Number of State messages emitted by the Source Connector
     * 
     */
    @JsonProperty("sourceStateMessagesEmitted")
    public Long getSourceStateMessagesEmitted() {
        return sourceStateMessagesEmitted;
    }

    /**
     * Number of State messages emitted by the Source Connector
     * 
     */
    @JsonProperty("sourceStateMessagesEmitted")
    public void setSourceStateMessagesEmitted(Long sourceStateMessagesEmitted) {
        this.sourceStateMessagesEmitted = sourceStateMessagesEmitted;
    }

    public SyncStats withSourceStateMessagesEmitted(Long sourceStateMessagesEmitted) {
        this.sourceStateMessagesEmitted = sourceStateMessagesEmitted;
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

    public SyncStats withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SyncStats.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("bytesEmitted");
        sb.append('=');
        sb.append(((this.bytesEmitted == null)?"<null>":this.bytesEmitted));
        sb.append(',');
        sb.append("destinationStateMessagesEmitted");
        sb.append('=');
        sb.append(((this.destinationStateMessagesEmitted == null)?"<null>":this.destinationStateMessagesEmitted));
        sb.append(',');
        sb.append("destinationWriteEndTime");
        sb.append('=');
        sb.append(((this.destinationWriteEndTime == null)?"<null>":this.destinationWriteEndTime));
        sb.append(',');
        sb.append("destinationWriteStartTime");
        sb.append('=');
        sb.append(((this.destinationWriteStartTime == null)?"<null>":this.destinationWriteStartTime));
        sb.append(',');
        sb.append("estimatedBytes");
        sb.append('=');
        sb.append(((this.estimatedBytes == null)?"<null>":this.estimatedBytes));
        sb.append(',');
        sb.append("estimatedRecords");
        sb.append('=');
        sb.append(((this.estimatedRecords == null)?"<null>":this.estimatedRecords));
        sb.append(',');
        sb.append("meanSecondsBeforeSourceStateMessageEmitted");
        sb.append('=');
        sb.append(((this.meanSecondsBeforeSourceStateMessageEmitted == null)?"<null>":this.meanSecondsBeforeSourceStateMessageEmitted));
        sb.append(',');
        sb.append("maxSecondsBeforeSourceStateMessageEmitted");
        sb.append('=');
        sb.append(((this.maxSecondsBeforeSourceStateMessageEmitted == null)?"<null>":this.maxSecondsBeforeSourceStateMessageEmitted));
        sb.append(',');
        sb.append("maxSecondsBetweenStateMessageEmittedandCommitted");
        sb.append('=');
        sb.append(((this.maxSecondsBetweenStateMessageEmittedandCommitted == null)?"<null>":this.maxSecondsBetweenStateMessageEmittedandCommitted));
        sb.append(',');
        sb.append("meanSecondsBetweenStateMessageEmittedandCommitted");
        sb.append('=');
        sb.append(((this.meanSecondsBetweenStateMessageEmittedandCommitted == null)?"<null>":this.meanSecondsBetweenStateMessageEmittedandCommitted));
        sb.append(',');
        sb.append("recordsEmitted");
        sb.append('=');
        sb.append(((this.recordsEmitted == null)?"<null>":this.recordsEmitted));
        sb.append(',');
        sb.append("recordsCommitted");
        sb.append('=');
        sb.append(((this.recordsCommitted == null)?"<null>":this.recordsCommitted));
        sb.append(',');
        sb.append("replicationEndTime");
        sb.append('=');
        sb.append(((this.replicationEndTime == null)?"<null>":this.replicationEndTime));
        sb.append(',');
        sb.append("replicationStartTime");
        sb.append('=');
        sb.append(((this.replicationStartTime == null)?"<null>":this.replicationStartTime));
        sb.append(',');
        sb.append("sourceReadEndTime");
        sb.append('=');
        sb.append(((this.sourceReadEndTime == null)?"<null>":this.sourceReadEndTime));
        sb.append(',');
        sb.append("sourceReadStartTime");
        sb.append('=');
        sb.append(((this.sourceReadStartTime == null)?"<null>":this.sourceReadStartTime));
        sb.append(',');
        sb.append("sourceStateMessagesEmitted");
        sb.append('=');
        sb.append(((this.sourceStateMessagesEmitted == null)?"<null>":this.sourceStateMessagesEmitted));
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
        result = ((result* 31)+((this.recordsCommitted == null)? 0 :this.recordsCommitted.hashCode()));
        result = ((result* 31)+((this.bytesEmitted == null)? 0 :this.bytesEmitted.hashCode()));
        result = ((result* 31)+((this.maxSecondsBeforeSourceStateMessageEmitted == null)? 0 :this.maxSecondsBeforeSourceStateMessageEmitted.hashCode()));
        result = ((result* 31)+((this.estimatedRecords == null)? 0 :this.estimatedRecords.hashCode()));
        result = ((result* 31)+((this.destinationWriteStartTime == null)? 0 :this.destinationWriteStartTime.hashCode()));
        result = ((result* 31)+((this.meanSecondsBetweenStateMessageEmittedandCommitted == null)? 0 :this.meanSecondsBetweenStateMessageEmittedandCommitted.hashCode()));
        result = ((result* 31)+((this.sourceStateMessagesEmitted == null)? 0 :this.sourceStateMessagesEmitted.hashCode()));
        result = ((result* 31)+((this.recordsEmitted == null)? 0 :this.recordsEmitted.hashCode()));
        result = ((result* 31)+((this.maxSecondsBetweenStateMessageEmittedandCommitted == null)? 0 :this.maxSecondsBetweenStateMessageEmittedandCommitted.hashCode()));
        result = ((result* 31)+((this.destinationWriteEndTime == null)? 0 :this.destinationWriteEndTime.hashCode()));
        result = ((result* 31)+((this.sourceReadEndTime == null)? 0 :this.sourceReadEndTime.hashCode()));
        result = ((result* 31)+((this.destinationStateMessagesEmitted == null)? 0 :this.destinationStateMessagesEmitted.hashCode()));
        result = ((result* 31)+((this.sourceReadStartTime == null)? 0 :this.sourceReadStartTime.hashCode()));
        result = ((result* 31)+((this.replicationEndTime == null)? 0 :this.replicationEndTime.hashCode()));
        result = ((result* 31)+((this.estimatedBytes == null)? 0 :this.estimatedBytes.hashCode()));
        result = ((result* 31)+((this.meanSecondsBeforeSourceStateMessageEmitted == null)? 0 :this.meanSecondsBeforeSourceStateMessageEmitted.hashCode()));
        result = ((result* 31)+((this.replicationStartTime == null)? 0 :this.replicationStartTime.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SyncStats) == false) {
            return false;
        }
        SyncStats rhs = ((SyncStats) other);
        return (((((((((((((((((((this.recordsCommitted == rhs.recordsCommitted)||((this.recordsCommitted!= null)&&this.recordsCommitted.equals(rhs.recordsCommitted)))&&((this.bytesEmitted == rhs.bytesEmitted)||((this.bytesEmitted!= null)&&this.bytesEmitted.equals(rhs.bytesEmitted))))&&((this.maxSecondsBeforeSourceStateMessageEmitted == rhs.maxSecondsBeforeSourceStateMessageEmitted)||((this.maxSecondsBeforeSourceStateMessageEmitted!= null)&&this.maxSecondsBeforeSourceStateMessageEmitted.equals(rhs.maxSecondsBeforeSourceStateMessageEmitted))))&&((this.estimatedRecords == rhs.estimatedRecords)||((this.estimatedRecords!= null)&&this.estimatedRecords.equals(rhs.estimatedRecords))))&&((this.destinationWriteStartTime == rhs.destinationWriteStartTime)||((this.destinationWriteStartTime!= null)&&this.destinationWriteStartTime.equals(rhs.destinationWriteStartTime))))&&((this.meanSecondsBetweenStateMessageEmittedandCommitted == rhs.meanSecondsBetweenStateMessageEmittedandCommitted)||((this.meanSecondsBetweenStateMessageEmittedandCommitted!= null)&&this.meanSecondsBetweenStateMessageEmittedandCommitted.equals(rhs.meanSecondsBetweenStateMessageEmittedandCommitted))))&&((this.sourceStateMessagesEmitted == rhs.sourceStateMessagesEmitted)||((this.sourceStateMessagesEmitted!= null)&&this.sourceStateMessagesEmitted.equals(rhs.sourceStateMessagesEmitted))))&&((this.recordsEmitted == rhs.recordsEmitted)||((this.recordsEmitted!= null)&&this.recordsEmitted.equals(rhs.recordsEmitted))))&&((this.maxSecondsBetweenStateMessageEmittedandCommitted == rhs.maxSecondsBetweenStateMessageEmittedandCommitted)||((this.maxSecondsBetweenStateMessageEmittedandCommitted!= null)&&this.maxSecondsBetweenStateMessageEmittedandCommitted.equals(rhs.maxSecondsBetweenStateMessageEmittedandCommitted))))&&((this.destinationWriteEndTime == rhs.destinationWriteEndTime)||((this.destinationWriteEndTime!= null)&&this.destinationWriteEndTime.equals(rhs.destinationWriteEndTime))))&&((this.sourceReadEndTime == rhs.sourceReadEndTime)||((this.sourceReadEndTime!= null)&&this.sourceReadEndTime.equals(rhs.sourceReadEndTime))))&&((this.destinationStateMessagesEmitted == rhs.destinationStateMessagesEmitted)||((this.destinationStateMessagesEmitted!= null)&&this.destinationStateMessagesEmitted.equals(rhs.destinationStateMessagesEmitted))))&&((this.sourceReadStartTime == rhs.sourceReadStartTime)||((this.sourceReadStartTime!= null)&&this.sourceReadStartTime.equals(rhs.sourceReadStartTime))))&&((this.replicationEndTime == rhs.replicationEndTime)||((this.replicationEndTime!= null)&&this.replicationEndTime.equals(rhs.replicationEndTime))))&&((this.estimatedBytes == rhs.estimatedBytes)||((this.estimatedBytes!= null)&&this.estimatedBytes.equals(rhs.estimatedBytes))))&&((this.meanSecondsBeforeSourceStateMessageEmitted == rhs.meanSecondsBeforeSourceStateMessageEmitted)||((this.meanSecondsBeforeSourceStateMessageEmitted!= null)&&this.meanSecondsBeforeSourceStateMessageEmitted.equals(rhs.meanSecondsBeforeSourceStateMessageEmitted))))&&((this.replicationStartTime == rhs.replicationStartTime)||((this.replicationStartTime!= null)&&this.replicationStartTime.equals(rhs.replicationStartTime))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
