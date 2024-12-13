// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FunctionScalaShowOutputArgs extends com.pulumi.resources.ResourceArgs {

    public static final FunctionScalaShowOutputArgs Empty = new FunctionScalaShowOutputArgs();

    @Import(name="argumentsRaw")
    private @Nullable Output<String> argumentsRaw;

    public Optional<Output<String>> argumentsRaw() {
        return Optional.ofNullable(this.argumentsRaw);
    }

    @Import(name="catalogName")
    private @Nullable Output<String> catalogName;

    public Optional<Output<String>> catalogName() {
        return Optional.ofNullable(this.catalogName);
    }

    @Import(name="createdOn")
    private @Nullable Output<String> createdOn;

    public Optional<Output<String>> createdOn() {
        return Optional.ofNullable(this.createdOn);
    }

    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="externalAccessIntegrations")
    private @Nullable Output<String> externalAccessIntegrations;

    public Optional<Output<String>> externalAccessIntegrations() {
        return Optional.ofNullable(this.externalAccessIntegrations);
    }

    @Import(name="isAggregate")
    private @Nullable Output<Boolean> isAggregate;

    public Optional<Output<Boolean>> isAggregate() {
        return Optional.ofNullable(this.isAggregate);
    }

    @Import(name="isAnsi")
    private @Nullable Output<Boolean> isAnsi;

    public Optional<Output<Boolean>> isAnsi() {
        return Optional.ofNullable(this.isAnsi);
    }

    @Import(name="isBuiltin")
    private @Nullable Output<Boolean> isBuiltin;

    public Optional<Output<Boolean>> isBuiltin() {
        return Optional.ofNullable(this.isBuiltin);
    }

    @Import(name="isDataMetric")
    private @Nullable Output<Boolean> isDataMetric;

    public Optional<Output<Boolean>> isDataMetric() {
        return Optional.ofNullable(this.isDataMetric);
    }

    @Import(name="isExternalFunction")
    private @Nullable Output<Boolean> isExternalFunction;

    public Optional<Output<Boolean>> isExternalFunction() {
        return Optional.ofNullable(this.isExternalFunction);
    }

    @Import(name="isMemoizable")
    private @Nullable Output<Boolean> isMemoizable;

    public Optional<Output<Boolean>> isMemoizable() {
        return Optional.ofNullable(this.isMemoizable);
    }

    @Import(name="isSecure")
    private @Nullable Output<Boolean> isSecure;

    public Optional<Output<Boolean>> isSecure() {
        return Optional.ofNullable(this.isSecure);
    }

    @Import(name="isTableFunction")
    private @Nullable Output<Boolean> isTableFunction;

    public Optional<Output<Boolean>> isTableFunction() {
        return Optional.ofNullable(this.isTableFunction);
    }

    @Import(name="language")
    private @Nullable Output<String> language;

    public Optional<Output<String>> language() {
        return Optional.ofNullable(this.language);
    }

    @Import(name="maxNumArguments")
    private @Nullable Output<Integer> maxNumArguments;

    public Optional<Output<Integer>> maxNumArguments() {
        return Optional.ofNullable(this.maxNumArguments);
    }

    @Import(name="minNumArguments")
    private @Nullable Output<Integer> minNumArguments;

    public Optional<Output<Integer>> minNumArguments() {
        return Optional.ofNullable(this.minNumArguments);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="schemaName")
    private @Nullable Output<String> schemaName;

    public Optional<Output<String>> schemaName() {
        return Optional.ofNullable(this.schemaName);
    }

    @Import(name="secrets")
    private @Nullable Output<String> secrets;

    public Optional<Output<String>> secrets() {
        return Optional.ofNullable(this.secrets);
    }

    @Import(name="validForClustering")
    private @Nullable Output<Boolean> validForClustering;

    public Optional<Output<Boolean>> validForClustering() {
        return Optional.ofNullable(this.validForClustering);
    }

    private FunctionScalaShowOutputArgs() {}

    private FunctionScalaShowOutputArgs(FunctionScalaShowOutputArgs $) {
        this.argumentsRaw = $.argumentsRaw;
        this.catalogName = $.catalogName;
        this.createdOn = $.createdOn;
        this.description = $.description;
        this.externalAccessIntegrations = $.externalAccessIntegrations;
        this.isAggregate = $.isAggregate;
        this.isAnsi = $.isAnsi;
        this.isBuiltin = $.isBuiltin;
        this.isDataMetric = $.isDataMetric;
        this.isExternalFunction = $.isExternalFunction;
        this.isMemoizable = $.isMemoizable;
        this.isSecure = $.isSecure;
        this.isTableFunction = $.isTableFunction;
        this.language = $.language;
        this.maxNumArguments = $.maxNumArguments;
        this.minNumArguments = $.minNumArguments;
        this.name = $.name;
        this.schemaName = $.schemaName;
        this.secrets = $.secrets;
        this.validForClustering = $.validForClustering;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FunctionScalaShowOutputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FunctionScalaShowOutputArgs $;

        public Builder() {
            $ = new FunctionScalaShowOutputArgs();
        }

        public Builder(FunctionScalaShowOutputArgs defaults) {
            $ = new FunctionScalaShowOutputArgs(Objects.requireNonNull(defaults));
        }

        public Builder argumentsRaw(@Nullable Output<String> argumentsRaw) {
            $.argumentsRaw = argumentsRaw;
            return this;
        }

        public Builder argumentsRaw(String argumentsRaw) {
            return argumentsRaw(Output.of(argumentsRaw));
        }

        public Builder catalogName(@Nullable Output<String> catalogName) {
            $.catalogName = catalogName;
            return this;
        }

        public Builder catalogName(String catalogName) {
            return catalogName(Output.of(catalogName));
        }

        public Builder createdOn(@Nullable Output<String> createdOn) {
            $.createdOn = createdOn;
            return this;
        }

        public Builder createdOn(String createdOn) {
            return createdOn(Output.of(createdOn));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder externalAccessIntegrations(@Nullable Output<String> externalAccessIntegrations) {
            $.externalAccessIntegrations = externalAccessIntegrations;
            return this;
        }

        public Builder externalAccessIntegrations(String externalAccessIntegrations) {
            return externalAccessIntegrations(Output.of(externalAccessIntegrations));
        }

        public Builder isAggregate(@Nullable Output<Boolean> isAggregate) {
            $.isAggregate = isAggregate;
            return this;
        }

        public Builder isAggregate(Boolean isAggregate) {
            return isAggregate(Output.of(isAggregate));
        }

        public Builder isAnsi(@Nullable Output<Boolean> isAnsi) {
            $.isAnsi = isAnsi;
            return this;
        }

        public Builder isAnsi(Boolean isAnsi) {
            return isAnsi(Output.of(isAnsi));
        }

        public Builder isBuiltin(@Nullable Output<Boolean> isBuiltin) {
            $.isBuiltin = isBuiltin;
            return this;
        }

        public Builder isBuiltin(Boolean isBuiltin) {
            return isBuiltin(Output.of(isBuiltin));
        }

        public Builder isDataMetric(@Nullable Output<Boolean> isDataMetric) {
            $.isDataMetric = isDataMetric;
            return this;
        }

        public Builder isDataMetric(Boolean isDataMetric) {
            return isDataMetric(Output.of(isDataMetric));
        }

        public Builder isExternalFunction(@Nullable Output<Boolean> isExternalFunction) {
            $.isExternalFunction = isExternalFunction;
            return this;
        }

        public Builder isExternalFunction(Boolean isExternalFunction) {
            return isExternalFunction(Output.of(isExternalFunction));
        }

        public Builder isMemoizable(@Nullable Output<Boolean> isMemoizable) {
            $.isMemoizable = isMemoizable;
            return this;
        }

        public Builder isMemoizable(Boolean isMemoizable) {
            return isMemoizable(Output.of(isMemoizable));
        }

        public Builder isSecure(@Nullable Output<Boolean> isSecure) {
            $.isSecure = isSecure;
            return this;
        }

        public Builder isSecure(Boolean isSecure) {
            return isSecure(Output.of(isSecure));
        }

        public Builder isTableFunction(@Nullable Output<Boolean> isTableFunction) {
            $.isTableFunction = isTableFunction;
            return this;
        }

        public Builder isTableFunction(Boolean isTableFunction) {
            return isTableFunction(Output.of(isTableFunction));
        }

        public Builder language(@Nullable Output<String> language) {
            $.language = language;
            return this;
        }

        public Builder language(String language) {
            return language(Output.of(language));
        }

        public Builder maxNumArguments(@Nullable Output<Integer> maxNumArguments) {
            $.maxNumArguments = maxNumArguments;
            return this;
        }

        public Builder maxNumArguments(Integer maxNumArguments) {
            return maxNumArguments(Output.of(maxNumArguments));
        }

        public Builder minNumArguments(@Nullable Output<Integer> minNumArguments) {
            $.minNumArguments = minNumArguments;
            return this;
        }

        public Builder minNumArguments(Integer minNumArguments) {
            return minNumArguments(Output.of(minNumArguments));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder schemaName(@Nullable Output<String> schemaName) {
            $.schemaName = schemaName;
            return this;
        }

        public Builder schemaName(String schemaName) {
            return schemaName(Output.of(schemaName));
        }

        public Builder secrets(@Nullable Output<String> secrets) {
            $.secrets = secrets;
            return this;
        }

        public Builder secrets(String secrets) {
            return secrets(Output.of(secrets));
        }

        public Builder validForClustering(@Nullable Output<Boolean> validForClustering) {
            $.validForClustering = validForClustering;
            return this;
        }

        public Builder validForClustering(Boolean validForClustering) {
            return validForClustering(Output.of(validForClustering));
        }

        public FunctionScalaShowOutputArgs build() {
            return $;
        }
    }

}