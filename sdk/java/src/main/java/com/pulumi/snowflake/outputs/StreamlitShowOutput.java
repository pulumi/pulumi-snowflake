// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class StreamlitShowOutput {
    private @Nullable String comment;
    private @Nullable String createdOn;
    private @Nullable String databaseName;
    private @Nullable String name;
    private @Nullable String owner;
    private @Nullable String ownerRoleType;
    private @Nullable String queryWarehouse;
    private @Nullable String schemaName;
    private @Nullable String title;
    private @Nullable String urlId;

    private StreamlitShowOutput() {}
    public Optional<String> comment() {
        return Optional.ofNullable(this.comment);
    }
    public Optional<String> createdOn() {
        return Optional.ofNullable(this.createdOn);
    }
    public Optional<String> databaseName() {
        return Optional.ofNullable(this.databaseName);
    }
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    public Optional<String> owner() {
        return Optional.ofNullable(this.owner);
    }
    public Optional<String> ownerRoleType() {
        return Optional.ofNullable(this.ownerRoleType);
    }
    public Optional<String> queryWarehouse() {
        return Optional.ofNullable(this.queryWarehouse);
    }
    public Optional<String> schemaName() {
        return Optional.ofNullable(this.schemaName);
    }
    public Optional<String> title() {
        return Optional.ofNullable(this.title);
    }
    public Optional<String> urlId() {
        return Optional.ofNullable(this.urlId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreamlitShowOutput defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String comment;
        private @Nullable String createdOn;
        private @Nullable String databaseName;
        private @Nullable String name;
        private @Nullable String owner;
        private @Nullable String ownerRoleType;
        private @Nullable String queryWarehouse;
        private @Nullable String schemaName;
        private @Nullable String title;
        private @Nullable String urlId;
        public Builder() {}
        public Builder(StreamlitShowOutput defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comment = defaults.comment;
    	      this.createdOn = defaults.createdOn;
    	      this.databaseName = defaults.databaseName;
    	      this.name = defaults.name;
    	      this.owner = defaults.owner;
    	      this.ownerRoleType = defaults.ownerRoleType;
    	      this.queryWarehouse = defaults.queryWarehouse;
    	      this.schemaName = defaults.schemaName;
    	      this.title = defaults.title;
    	      this.urlId = defaults.urlId;
        }

        @CustomType.Setter
        public Builder comment(@Nullable String comment) {

            this.comment = comment;
            return this;
        }
        @CustomType.Setter
        public Builder createdOn(@Nullable String createdOn) {

            this.createdOn = createdOn;
            return this;
        }
        @CustomType.Setter
        public Builder databaseName(@Nullable String databaseName) {

            this.databaseName = databaseName;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder owner(@Nullable String owner) {

            this.owner = owner;
            return this;
        }
        @CustomType.Setter
        public Builder ownerRoleType(@Nullable String ownerRoleType) {

            this.ownerRoleType = ownerRoleType;
            return this;
        }
        @CustomType.Setter
        public Builder queryWarehouse(@Nullable String queryWarehouse) {

            this.queryWarehouse = queryWarehouse;
            return this;
        }
        @CustomType.Setter
        public Builder schemaName(@Nullable String schemaName) {

            this.schemaName = schemaName;
            return this;
        }
        @CustomType.Setter
        public Builder title(@Nullable String title) {

            this.title = title;
            return this;
        }
        @CustomType.Setter
        public Builder urlId(@Nullable String urlId) {

            this.urlId = urlId;
            return this;
        }
        public StreamlitShowOutput build() {
            final var _resultValue = new StreamlitShowOutput();
            _resultValue.comment = comment;
            _resultValue.createdOn = createdOn;
            _resultValue.databaseName = databaseName;
            _resultValue.name = name;
            _resultValue.owner = owner;
            _resultValue.ownerRoleType = ownerRoleType;
            _resultValue.queryWarehouse = queryWarehouse;
            _resultValue.schemaName = schemaName;
            _resultValue.title = title;
            _resultValue.urlId = urlId;
            return _resultValue;
        }
    }
}
