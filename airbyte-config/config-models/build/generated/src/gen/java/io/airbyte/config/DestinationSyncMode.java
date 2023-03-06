
package io.airbyte.config;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * DestinationSyncMode
 * <p>
 * destination sync modes.
 * 
 */
public enum DestinationSyncMode {

    APPEND("append"),
    OVERWRITE("overwrite"),
    APPEND_DEDUP("append_dedup");
    private final String value;
    private final static Map<String, DestinationSyncMode> CONSTANTS = new HashMap<String, DestinationSyncMode>();

    static {
        for (DestinationSyncMode c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private DestinationSyncMode(String value) {
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
    public static DestinationSyncMode fromValue(String value) {
        DestinationSyncMode constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
