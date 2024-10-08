// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ViewDataMetricFunction {
    /**
     * @return Identifier of the data metric function to add to the table or view or drop from the table or view. This function identifier must be provided without arguments in parenthesis.
     * 
     */
    private String functionName;
    /**
     * @return The table or view columns on which to associate the data metric function. The data types of the columns must match the data types of the columns specified in the data metric function definition.
     * 
     */
    private List<String> ons;
    /**
     * @return The status of the metrics association. Valid values are: `STARTED` | `SUSPENDED`. When status of a data metric function is changed, it is being reassigned with `DROP DATA METRIC FUNCTION` and `ADD DATA METRIC FUNCTION`, and then its status is changed by `MODIFY DATA METRIC FUNCTION`
     * 
     */
    private String scheduleStatus;

    private ViewDataMetricFunction() {}
    /**
     * @return Identifier of the data metric function to add to the table or view or drop from the table or view. This function identifier must be provided without arguments in parenthesis.
     * 
     */
    public String functionName() {
        return this.functionName;
    }
    /**
     * @return The table or view columns on which to associate the data metric function. The data types of the columns must match the data types of the columns specified in the data metric function definition.
     * 
     */
    public List<String> ons() {
        return this.ons;
    }
    /**
     * @return The status of the metrics association. Valid values are: `STARTED` | `SUSPENDED`. When status of a data metric function is changed, it is being reassigned with `DROP DATA METRIC FUNCTION` and `ADD DATA METRIC FUNCTION`, and then its status is changed by `MODIFY DATA METRIC FUNCTION`
     * 
     */
    public String scheduleStatus() {
        return this.scheduleStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ViewDataMetricFunction defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String functionName;
        private List<String> ons;
        private String scheduleStatus;
        public Builder() {}
        public Builder(ViewDataMetricFunction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.functionName = defaults.functionName;
    	      this.ons = defaults.ons;
    	      this.scheduleStatus = defaults.scheduleStatus;
        }

        @CustomType.Setter
        public Builder functionName(String functionName) {
            if (functionName == null) {
              throw new MissingRequiredPropertyException("ViewDataMetricFunction", "functionName");
            }
            this.functionName = functionName;
            return this;
        }
        @CustomType.Setter
        public Builder ons(List<String> ons) {
            if (ons == null) {
              throw new MissingRequiredPropertyException("ViewDataMetricFunction", "ons");
            }
            this.ons = ons;
            return this;
        }
        public Builder ons(String... ons) {
            return ons(List.of(ons));
        }
        @CustomType.Setter
        public Builder scheduleStatus(String scheduleStatus) {
            if (scheduleStatus == null) {
              throw new MissingRequiredPropertyException("ViewDataMetricFunction", "scheduleStatus");
            }
            this.scheduleStatus = scheduleStatus;
            return this;
        }
        public ViewDataMetricFunction build() {
            final var _resultValue = new ViewDataMetricFunction();
            _resultValue.functionName = functionName;
            _resultValue.ons = ons;
            _resultValue.scheduleStatus = scheduleStatus;
            return _resultValue;
        }
    }
}
