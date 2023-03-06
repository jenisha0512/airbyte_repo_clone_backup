
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
 * JobConfig
 * <p>
 * job config
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "configType",
    "checkConnection",
    "discoverCatalog",
    "getSpec",
    "sync",
    "resetConnection"
})
public class JobConfig implements Serializable
{

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("configType")
    private JobConfig.ConfigType configType;
    /**
     * JobCheckConnectionConfig
     * <p>
     * job check connection config
     * 
     */
    @JsonProperty("checkConnection")
    @JsonPropertyDescription("job check connection config")
    private JobCheckConnectionConfig checkConnection;
    /**
     * JobDiscoverCatalogConfig
     * <p>
     * job discover catalog config
     * 
     */
    @JsonProperty("discoverCatalog")
    @JsonPropertyDescription("job discover catalog config")
    private JobDiscoverCatalogConfig discoverCatalog;
    /**
     * JobGetSpecConfig
     * <p>
     * job check get spec
     * 
     */
    @JsonProperty("getSpec")
    @JsonPropertyDescription("job check get spec")
    private JobGetSpecConfig getSpec;
    /**
     * JobSyncConfig
     * <p>
     * job sync config
     * 
     */
    @JsonProperty("sync")
    @JsonPropertyDescription("job sync config")
    private JobSyncConfig sync;
    /**
     * JobResetConnectionConfig
     * <p>
     * job reset connection config
     * 
     */
    @JsonProperty("resetConnection")
    @JsonPropertyDescription("job reset connection config")
    private JobResetConnectionConfig resetConnection;
    private final static long serialVersionUID = -8544237847416861036L;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("configType")
    public JobConfig.ConfigType getConfigType() {
        return configType;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("configType")
    public void setConfigType(JobConfig.ConfigType configType) {
        this.configType = configType;
    }

    public JobConfig withConfigType(JobConfig.ConfigType configType) {
        this.configType = configType;
        return this;
    }

    /**
     * JobCheckConnectionConfig
     * <p>
     * job check connection config
     * 
     */
    @JsonProperty("checkConnection")
    public JobCheckConnectionConfig getCheckConnection() {
        return checkConnection;
    }

    /**
     * JobCheckConnectionConfig
     * <p>
     * job check connection config
     * 
     */
    @JsonProperty("checkConnection")
    public void setCheckConnection(JobCheckConnectionConfig checkConnection) {
        this.checkConnection = checkConnection;
    }

    public JobConfig withCheckConnection(JobCheckConnectionConfig checkConnection) {
        this.checkConnection = checkConnection;
        return this;
    }

    /**
     * JobDiscoverCatalogConfig
     * <p>
     * job discover catalog config
     * 
     */
    @JsonProperty("discoverCatalog")
    public JobDiscoverCatalogConfig getDiscoverCatalog() {
        return discoverCatalog;
    }

    /**
     * JobDiscoverCatalogConfig
     * <p>
     * job discover catalog config
     * 
     */
    @JsonProperty("discoverCatalog")
    public void setDiscoverCatalog(JobDiscoverCatalogConfig discoverCatalog) {
        this.discoverCatalog = discoverCatalog;
    }

    public JobConfig withDiscoverCatalog(JobDiscoverCatalogConfig discoverCatalog) {
        this.discoverCatalog = discoverCatalog;
        return this;
    }

    /**
     * JobGetSpecConfig
     * <p>
     * job check get spec
     * 
     */
    @JsonProperty("getSpec")
    public JobGetSpecConfig getGetSpec() {
        return getSpec;
    }

    /**
     * JobGetSpecConfig
     * <p>
     * job check get spec
     * 
     */
    @JsonProperty("getSpec")
    public void setGetSpec(JobGetSpecConfig getSpec) {
        this.getSpec = getSpec;
    }

    public JobConfig withGetSpec(JobGetSpecConfig getSpec) {
        this.getSpec = getSpec;
        return this;
    }

    /**
     * JobSyncConfig
     * <p>
     * job sync config
     * 
     */
    @JsonProperty("sync")
    public JobSyncConfig getSync() {
        return sync;
    }

    /**
     * JobSyncConfig
     * <p>
     * job sync config
     * 
     */
    @JsonProperty("sync")
    public void setSync(JobSyncConfig sync) {
        this.sync = sync;
    }

    public JobConfig withSync(JobSyncConfig sync) {
        this.sync = sync;
        return this;
    }

    /**
     * JobResetConnectionConfig
     * <p>
     * job reset connection config
     * 
     */
    @JsonProperty("resetConnection")
    public JobResetConnectionConfig getResetConnection() {
        return resetConnection;
    }

    /**
     * JobResetConnectionConfig
     * <p>
     * job reset connection config
     * 
     */
    @JsonProperty("resetConnection")
    public void setResetConnection(JobResetConnectionConfig resetConnection) {
        this.resetConnection = resetConnection;
    }

    public JobConfig withResetConnection(JobResetConnectionConfig resetConnection) {
        this.resetConnection = resetConnection;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(JobConfig.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("configType");
        sb.append('=');
        sb.append(((this.configType == null)?"<null>":this.configType));
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
        sb.append("resetConnection");
        sb.append('=');
        sb.append(((this.resetConnection == null)?"<null>":this.resetConnection));
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
        result = ((result* 31)+((this.resetConnection == null)? 0 :this.resetConnection.hashCode()));
        result = ((result* 31)+((this.checkConnection == null)? 0 :this.checkConnection.hashCode()));
        result = ((result* 31)+((this.getSpec == null)? 0 :this.getSpec.hashCode()));
        result = ((result* 31)+((this.configType == null)? 0 :this.configType.hashCode()));
        result = ((result* 31)+((this.discoverCatalog == null)? 0 :this.discoverCatalog.hashCode()));
        result = ((result* 31)+((this.sync == null)? 0 :this.sync.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof JobConfig) == false) {
            return false;
        }
        JobConfig rhs = ((JobConfig) other);
        return (((((((this.resetConnection == rhs.resetConnection)||((this.resetConnection!= null)&&this.resetConnection.equals(rhs.resetConnection)))&&((this.checkConnection == rhs.checkConnection)||((this.checkConnection!= null)&&this.checkConnection.equals(rhs.checkConnection))))&&((this.getSpec == rhs.getSpec)||((this.getSpec!= null)&&this.getSpec.equals(rhs.getSpec))))&&((this.configType == rhs.configType)||((this.configType!= null)&&this.configType.equals(rhs.configType))))&&((this.discoverCatalog == rhs.discoverCatalog)||((this.discoverCatalog!= null)&&this.discoverCatalog.equals(rhs.discoverCatalog))))&&((this.sync == rhs.sync)||((this.sync!= null)&&this.sync.equals(rhs.sync))));
    }

    public enum ConfigType {

        CHECK_CONNECTION_SOURCE("checkConnectionSource"),
        CHECK_CONNECTION_DESTINATION("checkConnectionDestination"),
        DISCOVER_SCHEMA("discoverSchema"),
        GET_SPEC("getSpec"),
        SYNC("sync"),
        RESET_CONNECTION("resetConnection");
        private final String value;
        private final static Map<String, JobConfig.ConfigType> CONSTANTS = new HashMap<String, JobConfig.ConfigType>();

        static {
            for (JobConfig.ConfigType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private ConfigType(String value) {
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
        public static JobConfig.ConfigType fromValue(String value) {
            JobConfig.ConfigType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
