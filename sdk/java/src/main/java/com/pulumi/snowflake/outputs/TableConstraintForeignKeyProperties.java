// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.snowflake.outputs.TableConstraintForeignKeyPropertiesReferences;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TableConstraintForeignKeyProperties {
    /**
     * @return The match type for the foreign key. Not applicable for primary/unique keys
     * 
     */
    private @Nullable String match;
    /**
     * @return Specifies the action performed when the primary/unique key for the foreign key is deleted. Not applicable for primary/unique keys
     * 
     */
    private @Nullable String onDelete;
    /**
     * @return Specifies the action performed when the primary/unique key for the foreign key is updated. Not applicable for primary/unique keys
     * 
     */
    private @Nullable String onUpdate;
    /**
     * @return The table and columns that the foreign key references. Not applicable for primary/unique keys
     * 
     */
    private @Nullable TableConstraintForeignKeyPropertiesReferences references;

    private TableConstraintForeignKeyProperties() {}
    /**
     * @return The match type for the foreign key. Not applicable for primary/unique keys
     * 
     */
    public Optional<String> match() {
        return Optional.ofNullable(this.match);
    }
    /**
     * @return Specifies the action performed when the primary/unique key for the foreign key is deleted. Not applicable for primary/unique keys
     * 
     */
    public Optional<String> onDelete() {
        return Optional.ofNullable(this.onDelete);
    }
    /**
     * @return Specifies the action performed when the primary/unique key for the foreign key is updated. Not applicable for primary/unique keys
     * 
     */
    public Optional<String> onUpdate() {
        return Optional.ofNullable(this.onUpdate);
    }
    /**
     * @return The table and columns that the foreign key references. Not applicable for primary/unique keys
     * 
     */
    public Optional<TableConstraintForeignKeyPropertiesReferences> references() {
        return Optional.ofNullable(this.references);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableConstraintForeignKeyProperties defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String match;
        private @Nullable String onDelete;
        private @Nullable String onUpdate;
        private @Nullable TableConstraintForeignKeyPropertiesReferences references;
        public Builder() {}
        public Builder(TableConstraintForeignKeyProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.match = defaults.match;
    	      this.onDelete = defaults.onDelete;
    	      this.onUpdate = defaults.onUpdate;
    	      this.references = defaults.references;
        }

        @CustomType.Setter
        public Builder match(@Nullable String match) {

            this.match = match;
            return this;
        }
        @CustomType.Setter
        public Builder onDelete(@Nullable String onDelete) {

            this.onDelete = onDelete;
            return this;
        }
        @CustomType.Setter
        public Builder onUpdate(@Nullable String onUpdate) {

            this.onUpdate = onUpdate;
            return this;
        }
        @CustomType.Setter
        public Builder references(@Nullable TableConstraintForeignKeyPropertiesReferences references) {

            this.references = references;
            return this;
        }
        public TableConstraintForeignKeyProperties build() {
            final var _resultValue = new TableConstraintForeignKeyProperties();
            _resultValue.match = match;
            _resultValue.onDelete = onDelete;
            _resultValue.onUpdate = onUpdate;
            _resultValue.references = references;
            return _resultValue;
        }
    }
}
