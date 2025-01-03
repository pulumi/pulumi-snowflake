// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.snowflake.outputs.GetConnectionsConnectionShowOutput;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetConnectionsConnection {
    /**
     * @return Holds the output of SHOW CONNECTIONS.
     * 
     */
    private List<GetConnectionsConnectionShowOutput> showOutputs;

    private GetConnectionsConnection() {}
    /**
     * @return Holds the output of SHOW CONNECTIONS.
     * 
     */
    public List<GetConnectionsConnectionShowOutput> showOutputs() {
        return this.showOutputs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectionsConnection defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetConnectionsConnectionShowOutput> showOutputs;
        public Builder() {}
        public Builder(GetConnectionsConnection defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.showOutputs = defaults.showOutputs;
        }

        @CustomType.Setter
        public Builder showOutputs(List<GetConnectionsConnectionShowOutput> showOutputs) {
            if (showOutputs == null) {
              throw new MissingRequiredPropertyException("GetConnectionsConnection", "showOutputs");
            }
            this.showOutputs = showOutputs;
            return this;
        }
        public Builder showOutputs(GetConnectionsConnectionShowOutput... showOutputs) {
            return showOutputs(List.of(showOutputs));
        }
        public GetConnectionsConnection build() {
            final var _resultValue = new GetConnectionsConnection();
            _resultValue.showOutputs = showOutputs;
            return _resultValue;
        }
    }
}
