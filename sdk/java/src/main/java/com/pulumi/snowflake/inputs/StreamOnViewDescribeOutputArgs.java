// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StreamOnViewDescribeOutputArgs extends com.pulumi.resources.ResourceArgs {

    public static final StreamOnViewDescribeOutputArgs Empty = new StreamOnViewDescribeOutputArgs();

    @Import(name="baseTables")
    private @Nullable Output<List<String>> baseTables;

    public Optional<Output<List<String>>> baseTables() {
        return Optional.ofNullable(this.baseTables);
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

    @Import(name="invalidReason")
    private @Nullable Output<String> invalidReason;

    public Optional<Output<String>> invalidReason() {
        return Optional.ofNullable(this.invalidReason);
    }

    @Import(name="mode")
    private @Nullable Output<String> mode;

    public Optional<Output<String>> mode() {
        return Optional.ofNullable(this.mode);
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

    @Import(name="sourceType")
    private @Nullable Output<String> sourceType;

    public Optional<Output<String>> sourceType() {
        return Optional.ofNullable(this.sourceType);
    }

    @Import(name="stale")
    private @Nullable Output<Boolean> stale;

    public Optional<Output<Boolean>> stale() {
        return Optional.ofNullable(this.stale);
    }

    @Import(name="staleAfter")
    private @Nullable Output<String> staleAfter;

    public Optional<Output<String>> staleAfter() {
        return Optional.ofNullable(this.staleAfter);
    }

    @Import(name="tableName")
    private @Nullable Output<String> tableName;

    public Optional<Output<String>> tableName() {
        return Optional.ofNullable(this.tableName);
    }

    @Import(name="type")
    private @Nullable Output<String> type;

    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private StreamOnViewDescribeOutputArgs() {}

    private StreamOnViewDescribeOutputArgs(StreamOnViewDescribeOutputArgs $) {
        this.baseTables = $.baseTables;
        this.comment = $.comment;
        this.createdOn = $.createdOn;
        this.databaseName = $.databaseName;
        this.invalidReason = $.invalidReason;
        this.mode = $.mode;
        this.name = $.name;
        this.owner = $.owner;
        this.ownerRoleType = $.ownerRoleType;
        this.schemaName = $.schemaName;
        this.sourceType = $.sourceType;
        this.stale = $.stale;
        this.staleAfter = $.staleAfter;
        this.tableName = $.tableName;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StreamOnViewDescribeOutputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StreamOnViewDescribeOutputArgs $;

        public Builder() {
            $ = new StreamOnViewDescribeOutputArgs();
        }

        public Builder(StreamOnViewDescribeOutputArgs defaults) {
            $ = new StreamOnViewDescribeOutputArgs(Objects.requireNonNull(defaults));
        }

        public Builder baseTables(@Nullable Output<List<String>> baseTables) {
            $.baseTables = baseTables;
            return this;
        }

        public Builder baseTables(List<String> baseTables) {
            return baseTables(Output.of(baseTables));
        }

        public Builder baseTables(String... baseTables) {
            return baseTables(List.of(baseTables));
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

        public Builder invalidReason(@Nullable Output<String> invalidReason) {
            $.invalidReason = invalidReason;
            return this;
        }

        public Builder invalidReason(String invalidReason) {
            return invalidReason(Output.of(invalidReason));
        }

        public Builder mode(@Nullable Output<String> mode) {
            $.mode = mode;
            return this;
        }

        public Builder mode(String mode) {
            return mode(Output.of(mode));
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

        public Builder sourceType(@Nullable Output<String> sourceType) {
            $.sourceType = sourceType;
            return this;
        }

        public Builder sourceType(String sourceType) {
            return sourceType(Output.of(sourceType));
        }

        public Builder stale(@Nullable Output<Boolean> stale) {
            $.stale = stale;
            return this;
        }

        public Builder stale(Boolean stale) {
            return stale(Output.of(stale));
        }

        public Builder staleAfter(@Nullable Output<String> staleAfter) {
            $.staleAfter = staleAfter;
            return this;
        }

        public Builder staleAfter(String staleAfter) {
            return staleAfter(Output.of(staleAfter));
        }

        public Builder tableName(@Nullable Output<String> tableName) {
            $.tableName = tableName;
            return this;
        }

        public Builder tableName(String tableName) {
            return tableName(Output.of(tableName));
        }

        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public StreamOnViewDescribeOutputArgs build() {
            return $;
        }
    }

}