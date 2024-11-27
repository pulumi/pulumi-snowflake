// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TagShowOutputArgs extends com.pulumi.resources.ResourceArgs {

    public static final TagShowOutputArgs Empty = new TagShowOutputArgs();

    @Import(name="allowedValues")
    private @Nullable Output<List<String>> allowedValues;

    public Optional<Output<List<String>>> allowedValues() {
        return Optional.ofNullable(this.allowedValues);
    }

    @Import(name="comment")
    private @Nullable Output<String> comment;

    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    @Import(name="createdOn")
    private @Nullable Output<String> createdOn;

    public Optional<Output<String>> createdOn() {
        return Optional.ofNullable(this.createdOn);
    }

    @Import(name="databaseName")
    private @Nullable Output<String> databaseName;

    public Optional<Output<String>> databaseName() {
        return Optional.ofNullable(this.databaseName);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="owner")
    private @Nullable Output<String> owner;

    public Optional<Output<String>> owner() {
        return Optional.ofNullable(this.owner);
    }

    @Import(name="ownerRoleType")
    private @Nullable Output<String> ownerRoleType;

    public Optional<Output<String>> ownerRoleType() {
        return Optional.ofNullable(this.ownerRoleType);
    }

    @Import(name="schemaName")
    private @Nullable Output<String> schemaName;

    public Optional<Output<String>> schemaName() {
        return Optional.ofNullable(this.schemaName);
    }

    private TagShowOutputArgs() {}

    private TagShowOutputArgs(TagShowOutputArgs $) {
        this.allowedValues = $.allowedValues;
        this.comment = $.comment;
        this.createdOn = $.createdOn;
        this.databaseName = $.databaseName;
        this.name = $.name;
        this.owner = $.owner;
        this.ownerRoleType = $.ownerRoleType;
        this.schemaName = $.schemaName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TagShowOutputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TagShowOutputArgs $;

        public Builder() {
            $ = new TagShowOutputArgs();
        }

        public Builder(TagShowOutputArgs defaults) {
            $ = new TagShowOutputArgs(Objects.requireNonNull(defaults));
        }

        public Builder allowedValues(@Nullable Output<List<String>> allowedValues) {
            $.allowedValues = allowedValues;
            return this;
        }

        public Builder allowedValues(List<String> allowedValues) {
            return allowedValues(Output.of(allowedValues));
        }

        public Builder allowedValues(String... allowedValues) {
            return allowedValues(List.of(allowedValues));
        }

        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        public Builder createdOn(@Nullable Output<String> createdOn) {
            $.createdOn = createdOn;
            return this;
        }

        public Builder createdOn(String createdOn) {
            return createdOn(Output.of(createdOn));
        }

        public Builder databaseName(@Nullable Output<String> databaseName) {
            $.databaseName = databaseName;
            return this;
        }

        public Builder databaseName(String databaseName) {
            return databaseName(Output.of(databaseName));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder owner(@Nullable Output<String> owner) {
            $.owner = owner;
            return this;
        }

        public Builder owner(String owner) {
            return owner(Output.of(owner));
        }

        public Builder ownerRoleType(@Nullable Output<String> ownerRoleType) {
            $.ownerRoleType = ownerRoleType;
            return this;
        }

        public Builder ownerRoleType(String ownerRoleType) {
            return ownerRoleType(Output.of(ownerRoleType));
        }

        public Builder schemaName(@Nullable Output<String> schemaName) {
            $.schemaName = schemaName;
            return this;
        }

        public Builder schemaName(String schemaName) {
            return schemaName(Output.of(schemaName));
        }

        public TagShowOutputArgs build() {
            return $;
        }
    }

}
