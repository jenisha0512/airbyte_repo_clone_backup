
package io.airbyte.config;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Geography
 * <p>
 * Geography Setting
 * 
 */
public enum Geography {

    AUTO("auto"),
    US("us"),
    EU("eu");
    private final String value;
    private final static Map<String, Geography> CONSTANTS = new HashMap<String, Geography>();

    static {
        for (Geography c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private Geography(String value) {
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
    public static Geography fromValue(String value) {
        Geography constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
