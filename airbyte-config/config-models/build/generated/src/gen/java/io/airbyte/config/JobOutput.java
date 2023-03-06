
package io.airbyte.config;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * JobOutput
 * <p>
 * job output
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "outputType",
    "checkConnection",
    "discoverCatalog",
    "getSpec",
    "sync"
})
public class JobOutput implements Serializable
{

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("outputType")
    private JobOutput.OutputType outputType;
    /**
     * StandardCheckConnectionOutput
     * <p>
     * describes the result of a 'check connection' action.
     * 
     */
    @JsonProperty("checkConnection")
    @JsonPropertyDescription("describes the result of a 'check connection' action.")
    private StandardCheckConnectionOutput checkConnection;
    /**
     * StandardDiscoverCatalogOutput
     * <p>
     * describes the standard output for any discovery run.
     * 
     */
    @JsonProperty("discoverCatalog")
    @JsonPropertyDescription("describes the standard output for any discovery run.")
    private StandardDiscoverCatalogOutput discoverCatalog;
    /**
     * StandardGetSpecOutput
     * <p>
     * job get spec output
     * 
     */
    @JsonProperty("getSpec")
    @JsonPropertyDescription("job get spec output")
    private StandardGetSpecOutput getSpec;
    /**
     * StandardSyncOutput
     * <p>
     * job sync config
     * 
     */
    @JsonProperty("sync")
    @JsonPropertyDescription("job sync config")
    private StandardSyncOutput sync;
    private final static long serialVersionUID = -2458535873436682080L;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("outputType")
    public JobOutput.OutputType getOutputType() {
        return outputType;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("outputType")
    public void setOutputType(JobOutput.OutputType outputType) {
        this.outputType = outputType;
    }

    public JobOutput withOutputType(JobOutput.OutputType outputType) {
        this.outputType = outputType;
        return this;
    }

    /**
     * StandardCheckConnectionOutput
     * <p>
     * describes the result of a 'check connection' action.
     * 
     */
    @JsonProperty("checkConnection")
    public StandardCheckConnectionOutput getCheckConnection() {
        return checkConnection;
    }

    /**
     * StandardCheckConnectionOutput
     * <p>
     * describes the result of a 'check connection' action.
     * 
     */
    @JsonProperty("checkConnection")
    public void setCheckConnection(StandardCheckConnectionOutput checkConnection) {
        this.checkConnection = checkConnection;
    }

    public JobOutput withCheckConnection(StandardCheckConnectionOutput checkConnection) {
        this.checkConnection = checkConnection;
        return this;
    }

    /**
     * StandardDiscoverCatalogOutput
     * <p>
     * describes the standard output for any discovery run.
     * 
     */
    @JsonProperty("discoverCatalog")
    public StandardDiscoverCatalogOutput getDiscoverCatalog() {
        return discoverCatalog;
    }

    /**
     * StandardDiscoverCatalogOutput
     * <p>
     * describes the standard output for any discovery run.
     * 
     */
    @JsonProperty("discoverCatalog")
    public void setDiscoverCatalog(StandardDiscoverCatalogOutput discoverCatalog) {
        this.discoverCatalog = discoverCatalog;
    }

    public JobOutput withDiscoverCatalog(StandardDiscoverCatalogOutput discoverCatalog) {
        this.discoverCatalog = discoverCatalog;
        return this;
    }

    /**
     * StandardGetSpecOutput
     * <p>
     * job get spec output
     * 
     */
    @JsonProperty("getSpec")
    public StandardGetSpecOutput getGetSpec() {
        return getSpec;
    }

    /**
     * StandardGetSpecOutput
     * <p>
     * job get spec output
     * 
     */
    @JsonProperty("getSpec")
    public void setGetSpec(StandardGetSpecOutput getSpec) {
        this.getSpec = getSpec;
    }

    public JobOutput withGetSpec(StandardGetSpecOutput getSpec) {
        this.getSpec = getSpec;
        return this;
    }

    /**
     * StandardSyncOutput
     * <p>
     * job sync config
     * 
     */
    @JsonProperty("sync")
    public StandardSyncOutput getSync() {
        return sync;
    }

    /**
     * StandardSyncOutput
     * <p>
     * job sync config
     * 
     */
    @JsonProperty("sync")
    public void setSync(StandardSyncOutput sync) {
        this.sync = sync;
    }

    public JobOutput withSync(StandardSyncOutput sync) {
        this.sync = sync;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(JobOutput.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("outputType");
        sb.append('=');
        sb.append(((this.outputType == null)?"<null>":this.outputType));
        sb.append(',');
        sb.append("checkConnection");
        sb.append('=');
        sb.append(((this.checkConnection == null)?"<null>":this.checkConnection));
        sb.append(',');
        sb.append("discoverCatalog");
        sb.append('=');
        sb.append(((this.discoverCatalog == null)?"<null>":this.discoverCatalog));
        sb.append(',');
        sb.append("getSpec");
        sb.append('=');
        sb.append(((this.getSpec == null)?"<null>":this.getSpec));
        sb.append(',');
        sb.append("sync");
        sb.append('=');
        sb.append(((this.sync == null)?"<null>":this.sync));
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
        result = ((result* 31)+((this.outputType == null)? 0 :this.outputType.hashCode()));
        result = ((result* 31)+((this.checkConnection == null)? 0 :this.checkConnection.hashCode()));
        result = ((result* 31)+((this.getSpec == null)? 0 :this.getSpec.hashCode()));
        result = ((result* 31)+((this.discoverCatalog == null)? 0 :this.discoverCatalog.hashCode()));
        result = ((result* 31)+((this.sync == null)? 0 :this.sync.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof JobOutput) == false) {
            return false;
        }
        JobOutput rhs = ((JobOutput) other);
        return ((((((this.outputType == rhs.outputType)||((this.outputType!= null)&&this.outputType.equals(rhs.outputType)))&&((this.checkConnection == rhs.checkConnection)||((this.checkConnection!= null)&&this.checkConnection.equals(rhs.checkConnection))))&&((this.getSpec == rhs.getSpec)||((this.getSpec!= null)&&this.getSpec.equals(rhs.getSpec))))&&((this.discoverCatalog == rhs.discoverCatalog)||((this.discoverCatalog!= null)&&this.discoverCatalog.equals(rhs.discoverCatalog))))&&((this.sync == rhs.sync)||((this.sync!= null)&&this.sync.equals(rhs.sync))));
    }

    public enum OutputType {

        CHECK_CONNECTION("checkConnection"),
        DISCOVER_CATALOG("discoverCatalog"),
        GET_SPEC("getSpec"),
        SYNC("sync");
        private final String value;
        private final static Map<String, JobOutput.OutputType> CONSTANTS = new HashMap<String, JobOutput.OutputType>();

        static {
            for (JobOutput.OutputType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private OutputType(String value) {
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
        public static JobOutput.OutputType fromValue(String value) {
            JobOutput.OutputType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
