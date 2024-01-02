// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.snowflake.outputs.GetMaterializedViewsMaterializedView;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetMaterializedViewsResult {
    /**
     * @return The database from which to return the schemas from.
     * 
     */
    private String database;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The views in the schema
     * 
     */
    private List<GetMaterializedViewsMaterializedView> materializedViews;
    /**
     * @return The schema from which to return the views from.
     * 
     */
    private String schema;

    private GetMaterializedViewsResult() {}
    /**
     * @return The database from which to return the schemas from.
     * 
     */
    public String database() {
        return this.database;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The views in the schema
     * 
     */
    public List<GetMaterializedViewsMaterializedView> materializedViews() {
        return this.materializedViews;
    }
    /**
     * @return The schema from which to return the views from.
     * 
     */
    public String schema() {
        return this.schema;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMaterializedViewsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String database;
        private String id;
        private List<GetMaterializedViewsMaterializedView> materializedViews;
        private String schema;
        public Builder() {}
        public Builder(GetMaterializedViewsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.database = defaults.database;
    	      this.id = defaults.id;
    	      this.materializedViews = defaults.materializedViews;
    	      this.schema = defaults.schema;
        }

        @CustomType.Setter
        public Builder database(String database) {
            if (database == null) {
              throw new MissingRequiredPropertyException("GetMaterializedViewsResult", "database");
            }
            this.database = database;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetMaterializedViewsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder materializedViews(List<GetMaterializedViewsMaterializedView> materializedViews) {
            if (materializedViews == null) {
              throw new MissingRequiredPropertyException("GetMaterializedViewsResult", "materializedViews");
            }
            this.materializedViews = materializedViews;
            return this;
        }
        public Builder materializedViews(GetMaterializedViewsMaterializedView... materializedViews) {
            return materializedViews(List.of(materializedViews));
        }
        @CustomType.Setter
        public Builder schema(String schema) {
            if (schema == null) {
              throw new MissingRequiredPropertyException("GetMaterializedViewsResult", "schema");
            }
            this.schema = schema;
            return this;
        }
        public GetMaterializedViewsResult build() {
            final var _resultValue = new GetMaterializedViewsResult();
            _resultValue.database = database;
            _resultValue.id = id;
            _resultValue.materializedViews = materializedViews;
            _resultValue.schema = schema;
            return _resultValue;
        }
    }
}
