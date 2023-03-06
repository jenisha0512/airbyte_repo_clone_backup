
package io.airbyte.config;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.airbyte.protocol.models.ConnectorSpecification;


/**
 * DockerImageSpec
 * <p>
 * docker image name and the connector specification associated with it
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "dockerImage",
    "spec"
})
public class DockerImageSpec implements Serializable
{

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("dockerImage")
    private String dockerImage;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("spec")
    private ConnectorSpecification spec;
    private final static long serialVersionUID = 2725054433696682227L;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("dockerImage")
    public String getDockerImage() {
        return dockerImage;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("dockerImage")
    public void setDockerImage(String dockerImage) {
        this.dockerImage = dockerImage;
    }

    public DockerImageSpec withDockerImage(String dockerImage) {
        this.dockerImage = dockerImage;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("spec")
    public ConnectorSpecification getSpec() {
        return spec;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("spec")
    public void setSpec(ConnectorSpecification spec) {
        this.spec = spec;
    }

    public DockerImageSpec withSpec(ConnectorSpecification spec) {
        this.spec = spec;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DockerImageSpec.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("dockerImage");
        sb.append('=');
        sb.append(((this.dockerImage == null)?"<null>":this.dockerImage));
        sb.append(',');
        sb.append("spec");
        sb.append('=');
        sb.append(((this.spec == null)?"<null>":this.spec));
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
        result = ((result* 31)+((this.spec == null)? 0 :this.spec.hashCode()));
        result = ((result* 31)+((this.dockerImage == null)? 0 :this.dockerImage.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DockerImageSpec) == false) {
            return false;
        }
        DockerImageSpec rhs = ((DockerImageSpec) other);
        return (((this.spec == rhs.spec)||((this.spec!= null)&&this.spec.equals(rhs.spec)))&&((this.dockerImage == rhs.dockerImage)||((this.dockerImage!= null)&&this.dockerImage.equals(rhs.dockerImage))));
    }

}
