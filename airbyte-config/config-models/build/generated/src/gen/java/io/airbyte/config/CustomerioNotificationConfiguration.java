
package io.airbyte.config;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CustomerioNotificationConfiguration
 * <p>
 * Customer.io Notification Settings
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({

})
public class CustomerioNotificationConfiguration implements Serializable
{

    private final static long serialVersionUID = -5254480531921870541L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CustomerioNotificationConfiguration.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CustomerioNotificationConfiguration) == false) {
            return false;
        }
        CustomerioNotificationConfiguration rhs = ((CustomerioNotificationConfiguration) other);
        return true;
    }

}
