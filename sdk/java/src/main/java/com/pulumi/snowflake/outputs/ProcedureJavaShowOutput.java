// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ProcedureJavaShowOutput {
    private @Nullable String argumentsRaw;
    private @Nullable String catalogName;
    private @Nullable String createdOn;
    private @Nullable String description;
    private @Nullable String externalAccessIntegrations;
    private @Nullable Boolean isAggregate;
    private @Nullable Boolean isAnsi;
    private @Nullable Boolean isBuiltin;
    private @Nullable Boolean isSecure;
    private @Nullable Boolean isTableFunction;
    private @Nullable Integer maxNumArguments;
    private @Nullable Integer minNumArguments;
    private @Nullable String name;
    private @Nullable String schemaName;
    private @Nullable String secrets;
    private @Nullable Boolean validForClustering;

    private ProcedureJavaShowOutput() {}
    public Optional<String> argumentsRaw() {
        return Optional.ofNullable(this.argumentsRaw);
    }
    public Optional<String> catalogName() {
        return Optional.ofNullable(this.catalogName);
    }
    public Optional<String> createdOn() {
        return Optional.ofNullable(this.createdOn);
    }
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    public Optional<String> externalAccessIntegrations() {
        return Optional.ofNullable(this.externalAccessIntegrations);
    }
    public Optional<Boolean> isAggregate() {
        return Optional.ofNullable(this.isAggregate);
    }
    public Optional<Boolean> isAnsi() {
        return Optional.ofNullable(this.isAnsi);
    }
    public Optional<Boolean> isBuiltin() {
        return Optional.ofNullable(this.isBuiltin);
    }
    public Optional<Boolean> isSecure() {
        return Optional.ofNullable(this.isSecure);
    }
    public Optional<Boolean> isTableFunction() {
        return Optional.ofNullable(this.isTableFunction);
    }
    public Optional<Integer> maxNumArguments() {
        return Optional.ofNullable(this.maxNumArguments);
    }
    public Optional<Integer> minNumArguments() {
        return Optional.ofNullable(this.minNumArguments);
    }
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    public Optional<String> schemaName() {
        return Optional.ofNullable(this.schemaName);
    }
    public Optional<String> secrets() {
        return Optional.ofNullable(this.secrets);
    }
    public Optional<Boolean> validForClustering() {
        return Optional.ofNullable(this.validForClustering);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProcedureJavaShowOutput defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String argumentsRaw;
        private @Nullable String catalogName;
        private @Nullable String createdOn;
        private @Nullable String description;
        private @Nullable String externalAccessIntegrations;
        private @Nullable Boolean isAggregate;
        private @Nullable Boolean isAnsi;
        private @Nullable Boolean isBuiltin;
        private @Nullable Boolean isSecure;
        private @Nullable Boolean isTableFunction;
        private @Nullable Integer maxNumArguments;
        private @Nullable Integer minNumArguments;
        private @Nullable String name;
        private @Nullable String schemaName;
        private @Nullable String secrets;
        private @Nullable Boolean validForClustering;
        public Builder() {}
        public Builder(ProcedureJavaShowOutput defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.argumentsRaw = defaults.argumentsRaw;
    	      this.catalogName = defaults.catalogName;
    	      this.createdOn = defaults.createdOn;
    	      this.description = defaults.description;
    	      this.externalAccessIntegrations = defaults.externalAccessIntegrations;
    	      this.isAggregate = defaults.isAggregate;
    	      this.isAnsi = defaults.isAnsi;
    	      this.isBuiltin = defaults.isBuiltin;
    	      this.isSecure = defaults.isSecure;
    	      this.isTableFunction = defaults.isTableFunction;
    	      this.maxNumArguments = defaults.maxNumArguments;
    	      this.minNumArguments = defaults.minNumArguments;
    	      this.name = defaults.name;
    	      this.schemaName = defaults.schemaName;
    	      this.secrets = defaults.secrets;
    	      this.validForClustering = defaults.validForClustering;
        }

        @CustomType.Setter
        public Builder argumentsRaw(@Nullable String argumentsRaw) {

            this.argumentsRaw = argumentsRaw;
            return this;
        }
        @CustomType.Setter
        public Builder catalogName(@Nullable String catalogName) {

            this.catalogName = catalogName;
            return this;
        }
        @CustomType.Setter
        public Builder createdOn(@Nullable String createdOn) {

            this.createdOn = createdOn;
            return this;
        }
        @CustomType.Setter
        public Builder description(@Nullable String description) {

            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder externalAccessIntegrations(@Nullable String externalAccessIntegrations) {

            this.externalAccessIntegrations = externalAccessIntegrations;
            return this;
        }
        @CustomType.Setter
        public Builder isAggregate(@Nullable Boolean isAggregate) {

            this.isAggregate = isAggregate;
            return this;
        }
        @CustomType.Setter
        public Builder isAnsi(@Nullable Boolean isAnsi) {

            this.isAnsi = isAnsi;
            return this;
        }
        @CustomType.Setter
        public Builder isBuiltin(@Nullable Boolean isBuiltin) {

            this.isBuiltin = isBuiltin;
            return this;
        }
        @CustomType.Setter
        public Builder isSecure(@Nullable Boolean isSecure) {

            this.isSecure = isSecure;
            return this;
        }
        @CustomType.Setter
        public Builder isTableFunction(@Nullable Boolean isTableFunction) {

            this.isTableFunction = isTableFunction;
            return this;
        }
        @CustomType.Setter
        public Builder maxNumArguments(@Nullable Integer maxNumArguments) {

            this.maxNumArguments = maxNumArguments;
            return this;
        }
        @CustomType.Setter
        public Builder minNumArguments(@Nullable Integer minNumArguments) {

            this.minNumArguments = minNumArguments;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder schemaName(@Nullable String schemaName) {

            this.schemaName = schemaName;
            return this;
        }
        @CustomType.Setter
        public Builder secrets(@Nullable String secrets) {

            this.secrets = secrets;
            return this;
        }
        @CustomType.Setter
        public Builder validForClustering(@Nullable Boolean validForClustering) {

            this.validForClustering = validForClustering;
            return this;
        }
        public ProcedureJavaShowOutput build() {
            final var _resultValue = new ProcedureJavaShowOutput();
            _resultValue.argumentsRaw = argumentsRaw;
            _resultValue.catalogName = catalogName;
            _resultValue.createdOn = createdOn;
            _resultValue.description = description;
            _resultValue.externalAccessIntegrations = externalAccessIntegrations;
            _resultValue.isAggregate = isAggregate;
            _resultValue.isAnsi = isAnsi;
            _resultValue.isBuiltin = isBuiltin;
            _resultValue.isSecure = isSecure;
            _resultValue.isTableFunction = isTableFunction;
            _resultValue.maxNumArguments = maxNumArguments;
            _resultValue.minNumArguments = minNumArguments;
            _resultValue.name = name;
            _resultValue.schemaName = schemaName;
            _resultValue.secrets = secrets;
            _resultValue.validForClustering = validForClustering;
            return _resultValue;
        }
    }
}
