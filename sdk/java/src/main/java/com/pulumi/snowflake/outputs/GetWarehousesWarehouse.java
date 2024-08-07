// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.snowflake.outputs.GetWarehousesWarehouseDescribeOutput;
import com.pulumi.snowflake.outputs.GetWarehousesWarehouseParameter;
import com.pulumi.snowflake.outputs.GetWarehousesWarehouseShowOutput;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetWarehousesWarehouse {
    /**
     * @return Holds the output of DESCRIBE WAREHOUSE.
     * 
     */
    private List<GetWarehousesWarehouseDescribeOutput> describeOutputs;
    /**
     * @return Holds the output of SHOW PARAMETERS FOR WAREHOUSE.
     * 
     */
    private List<GetWarehousesWarehouseParameter> parameters;
    /**
     * @return Holds the output of SHOW WAREHOUSES.
     * 
     */
    private List<GetWarehousesWarehouseShowOutput> showOutputs;

    private GetWarehousesWarehouse() {}
    /**
     * @return Holds the output of DESCRIBE WAREHOUSE.
     * 
     */
    public List<GetWarehousesWarehouseDescribeOutput> describeOutputs() {
        return this.describeOutputs;
    }
    /**
     * @return Holds the output of SHOW PARAMETERS FOR WAREHOUSE.
     * 
     */
    public List<GetWarehousesWarehouseParameter> parameters() {
        return this.parameters;
    }
    /**
     * @return Holds the output of SHOW WAREHOUSES.
     * 
     */
    public List<GetWarehousesWarehouseShowOutput> showOutputs() {
        return this.showOutputs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWarehousesWarehouse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetWarehousesWarehouseDescribeOutput> describeOutputs;
        private List<GetWarehousesWarehouseParameter> parameters;
        private List<GetWarehousesWarehouseShowOutput> showOutputs;
        public Builder() {}
        public Builder(GetWarehousesWarehouse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.describeOutputs = defaults.describeOutputs;
    	      this.parameters = defaults.parameters;
    	      this.showOutputs = defaults.showOutputs;
        }

        @CustomType.Setter
        public Builder describeOutputs(List<GetWarehousesWarehouseDescribeOutput> describeOutputs) {
            if (describeOutputs == null) {
              throw new MissingRequiredPropertyException("GetWarehousesWarehouse", "describeOutputs");
            }
            this.describeOutputs = describeOutputs;
            return this;
        }
        public Builder describeOutputs(GetWarehousesWarehouseDescribeOutput... describeOutputs) {
            return describeOutputs(List.of(describeOutputs));
        }
        @CustomType.Setter
        public Builder parameters(List<GetWarehousesWarehouseParameter> parameters) {
            if (parameters == null) {
              throw new MissingRequiredPropertyException("GetWarehousesWarehouse", "parameters");
            }
            this.parameters = parameters;
            return this;
        }
        public Builder parameters(GetWarehousesWarehouseParameter... parameters) {
            return parameters(List.of(parameters));
        }
        @CustomType.Setter
        public Builder showOutputs(List<GetWarehousesWarehouseShowOutput> showOutputs) {
            if (showOutputs == null) {
              throw new MissingRequiredPropertyException("GetWarehousesWarehouse", "showOutputs");
            }
            this.showOutputs = showOutputs;
            return this;
        }
        public Builder showOutputs(GetWarehousesWarehouseShowOutput... showOutputs) {
            return showOutputs(List.of(showOutputs));
        }
        public GetWarehousesWarehouse build() {
            final var _resultValue = new GetWarehousesWarehouse();
            _resultValue.describeOutputs = describeOutputs;
            _resultValue.parameters = parameters;
            _resultValue.showOutputs = showOutputs;
            return _resultValue;
        }
    }
}
