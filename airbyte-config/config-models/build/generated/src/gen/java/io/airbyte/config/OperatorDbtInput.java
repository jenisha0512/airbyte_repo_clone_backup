
package io.airbyte.config;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.JsonNode;


/**
 * Operator Dbt Input
 * <p>
 * Input configuration for DBT Transformation operator
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "destinationConfiguration",
    "operatorDbt"
})
public class OperatorDbtInput implements Serializable
{

    /**
     * Integration specific blob. Must be a valid JSON string.
     * (Required)
     * 
     */
    @JsonProperty("destinationConfiguration")
    @JsonPropertyDescription("Integration specific blob. Must be a valid JSON string.")
    private JsonNode destinationConfiguration;
    /**
     * OperatorDbt
     * <p>
     * Settings for a DBT operator
     * (Required)
     * 
     */
    @JsonProperty("operatorDbt")
    @JsonPropertyDescription("Settings for a DBT operator")
    private OperatorDbt operatorDbt;
    private final static long serialVersionUID = -2176010652106345881L;

    /**
     * Integration specific blob. Must be a valid JSON string.
     * (Required)
     * 
     */
    @JsonProperty("destinationConfiguration")
    public JsonNode getDestinationConfiguration() {
        return destinationConfiguration;
    }

    /**
     * Integration specific blob. Must be a valid JSON string.
     * (Required)
     * 
     */
    @JsonProperty("destinationConfiguration")
    public void setDestinationConfiguration(JsonNode destinationConfiguration) {
        this.destinationConfiguration = destinationConfiguration;
    }

    public OperatorDbtInput withDestinationConfiguration(JsonNode destinationConfiguration) {
        this.destinationConfiguration = destinationConfiguration;
        return this;
    }

    /**
     * OperatorDbt
     * <p>
     * Settings for a DBT operator
     * (Required)
     * 
     */
    @JsonProperty("operatorDbt")
    public OperatorDbt getOperatorDbt() {
        return operatorDbt;
    }

    /**
     * OperatorDbt
     * <p>
     * Settings for a DBT operator
     * (Required)
     * 
     */
    @JsonProperty("operatorDbt")
    public void setOperatorDbt(OperatorDbt operatorDbt) {
        this.operatorDbt = operatorDbt;
    }

    public OperatorDbtInput withOperatorDbt(OperatorDbt operatorDbt) {
        this.operatorDbt = operatorDbt;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(OperatorDbtInput.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("destinationConfiguration");
        sb.append('=');
        sb.append(((this.destinationConfiguration == null)?"<null>":this.destinationConfiguration));
        sb.append(',');
        sb.append("operatorDbt");
        sb.append('=');
        sb.append(((this.operatorDbt == null)?"<null>":this.operatorDbt));
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
        result = ((result* 31)+((this.operatorDbt == null)? 0 :this.operatorDbt.hashCode()));
        result = ((result* 31)+((this.destinationConfiguration == null)? 0 :this.destinationConfiguration.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OperatorDbtInput) == false) {
            return false;
        }
        OperatorDbtInput rhs = ((OperatorDbtInput) other);
        return (((this.operatorDbt == rhs.operatorDbt)||((this.operatorDbt!= null)&&this.operatorDbt.equals(rhs.operatorDbt)))&&((this.destinationConfiguration == rhs.destinationConfiguration)||((this.destinationConfiguration!= null)&&this.destinationConfiguration.equals(rhs.destinationConfiguration))));
    }

}
