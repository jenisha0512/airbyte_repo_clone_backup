
package io.airbyte.protocol.models;

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
 * AirbyteProtocol
 * <p>
 * AirbyteProtocol structs
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "airbyte_message",
    "configured_airbyte_catalog"
})
public class AirbyteProtocol {

    @JsonProperty("airbyte_message")
    private AirbyteMessage airbyteMessage;
    /**
     * Airbyte stream schema catalog
     * 
     */
    @JsonProperty("configured_airbyte_catalog")
    @JsonPropertyDescription("Airbyte stream schema catalog")
    private ConfiguredAirbyteCatalog configuredAirbyteCatalog;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("airbyte_message")
    public AirbyteMessage getAirbyteMessage() {
        return airbyteMessage;
    }

    @JsonProperty("airbyte_message")
    public void setAirbyteMessage(AirbyteMessage airbyteMessage) {
        this.airbyteMessage = airbyteMessage;
    }

    public AirbyteProtocol withAirbyteMessage(AirbyteMessage airbyteMessage) {
        this.airbyteMessage = airbyteMessage;
        return this;
    }

    /**
     * Airbyte stream schema catalog
     * 
     */
    @JsonProperty("configured_airbyte_catalog")
    public ConfiguredAirbyteCatalog getConfiguredAirbyteCatalog() {
        return configuredAirbyteCatalog;
    }

    /**
     * Airbyte stream schema catalog
     * 
     */
    @JsonProperty("configured_airbyte_catalog")
    public void setConfiguredAirbyteCatalog(ConfiguredAirbyteCatalog configuredAirbyteCatalog) {
        this.configuredAirbyteCatalog = configuredAirbyteCatalog;
    }

    public AirbyteProtocol withConfiguredAirbyteCatalog(ConfiguredAirbyteCatalog configuredAirbyteCatalog) {
        this.configuredAirbyteCatalog = configuredAirbyteCatalog;
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

    public AirbyteProtocol withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AirbyteProtocol.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("airbyteMessage");
        sb.append('=');
        sb.append(((this.airbyteMessage == null)?"<null>":this.airbyteMessage));
        sb.append(',');
        sb.append("configuredAirbyteCatalog");
        sb.append('=');
        sb.append(((this.configuredAirbyteCatalog == null)?"<null>":this.configuredAirbyteCatalog));
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.airbyteMessage == null)? 0 :this.airbyteMessage.hashCode()));
        result = ((result* 31)+((this.configuredAirbyteCatalog == null)? 0 :this.configuredAirbyteCatalog.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AirbyteProtocol) == false) {
            return false;
        }
        AirbyteProtocol rhs = ((AirbyteProtocol) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.airbyteMessage == rhs.airbyteMessage)||((this.airbyteMessage!= null)&&this.airbyteMessage.equals(rhs.airbyteMessage))))&&((this.configuredAirbyteCatalog == rhs.configuredAirbyteCatalog)||((this.configuredAirbyteCatalog!= null)&&this.configuredAirbyteCatalog.equals(rhs.configuredAirbyteCatalog))));
    }

}
