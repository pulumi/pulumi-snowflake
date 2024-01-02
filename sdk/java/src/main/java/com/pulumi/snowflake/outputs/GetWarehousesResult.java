// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.snowflake.outputs.GetWarehousesWarehouse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetWarehousesResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The warehouses in the database
     * 
     */
    private List<GetWarehousesWarehouse> warehouses;

    private GetWarehousesResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The warehouses in the database
     * 
     */
    public List<GetWarehousesWarehouse> warehouses() {
        return this.warehouses;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWarehousesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private List<GetWarehousesWarehouse> warehouses;
        public Builder() {}
        public Builder(GetWarehousesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.warehouses = defaults.warehouses;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetWarehousesResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder warehouses(List<GetWarehousesWarehouse> warehouses) {
            if (warehouses == null) {
              throw new MissingRequiredPropertyException("GetWarehousesResult", "warehouses");
            }
            this.warehouses = warehouses;
            return this;
        }
        public Builder warehouses(GetWarehousesWarehouse... warehouses) {
            return warehouses(List.of(warehouses));
        }
        public GetWarehousesResult build() {
            final var _resultValue = new GetWarehousesResult();
            _resultValue.id = id;
            _resultValue.warehouses = warehouses;
            return _resultValue;
        }
    }
}
