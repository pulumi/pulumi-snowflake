// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.snowflake.outputs.GetResourceMonitorsResourceMonitor;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetResourceMonitorsResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The resource monitors in the database
     * 
     */
    private List<GetResourceMonitorsResourceMonitor> resourceMonitors;

    private GetResourceMonitorsResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The resource monitors in the database
     * 
     */
    public List<GetResourceMonitorsResourceMonitor> resourceMonitors() {
        return this.resourceMonitors;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResourceMonitorsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private List<GetResourceMonitorsResourceMonitor> resourceMonitors;
        public Builder() {}
        public Builder(GetResourceMonitorsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.resourceMonitors = defaults.resourceMonitors;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetResourceMonitorsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder resourceMonitors(List<GetResourceMonitorsResourceMonitor> resourceMonitors) {
            if (resourceMonitors == null) {
              throw new MissingRequiredPropertyException("GetResourceMonitorsResult", "resourceMonitors");
            }
            this.resourceMonitors = resourceMonitors;
            return this;
        }
        public Builder resourceMonitors(GetResourceMonitorsResourceMonitor... resourceMonitors) {
            return resourceMonitors(List.of(resourceMonitors));
        }
        public GetResourceMonitorsResult build() {
            final var _resultValue = new GetResourceMonitorsResult();
            _resultValue.id = id;
            _resultValue.resourceMonitors = resourceMonitors;
            return _resultValue;
        }
    }
}
