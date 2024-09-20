// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ViewShowOutputArgs extends com.pulumi.resources.ResourceArgs {

    public static final ViewShowOutputArgs Empty = new ViewShowOutputArgs();

    @Import(name="changeTracking")
    private @Nullable Output<String> changeTracking;

    public Optional<Output<String>> changeTracking() {
        return Optional.ofNullable(this.changeTracking);
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

    @Import(name="isMaterialized")
    private @Nullable Output<Boolean> isMaterialized;

    public Optional<Output<Boolean>> isMaterialized() {
        return Optional.ofNullable(this.isMaterialized);
    }

    @Import(name="isSecure")
    private @Nullable Output<Boolean> isSecure;

    public Optional<Output<Boolean>> isSecure() {
        return Optional.ofNullable(this.isSecure);
    }

    @Import(name="kind")
    private @Nullable Output<String> kind;

    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
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

    @Import(name="reserved")
    private @Nullable Output<String> reserved;

    public Optional<Output<String>> reserved() {
        return Optional.ofNullable(this.reserved);
    }

    @Import(name="schemaName")
    private @Nullable Output<String> schemaName;

    public Optional<Output<String>> schemaName() {
        return Optional.ofNullable(this.schemaName);
    }

    @Import(name="text")
    private @Nullable Output<String> text;

    public Optional<Output<String>> text() {
        return Optional.ofNullable(this.text);
    }

    private ViewShowOutputArgs() {}

    private ViewShowOutputArgs(ViewShowOutputArgs $) {
        this.changeTracking = $.changeTracking;
        this.comment = $.comment;
        this.createdOn = $.createdOn;
        this.databaseName = $.databaseName;
        this.isMaterialized = $.isMaterialized;
        this.isSecure = $.isSecure;
        this.kind = $.kind;
        this.name = $.name;
        this.owner = $.owner;
        this.ownerRoleType = $.ownerRoleType;
        this.reserved = $.reserved;
        this.schemaName = $.schemaName;
        this.text = $.text;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ViewShowOutputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ViewShowOutputArgs $;

        public Builder() {
            $ = new ViewShowOutputArgs();
        }

        public Builder(ViewShowOutputArgs defaults) {
            $ = new ViewShowOutputArgs(Objects.requireNonNull(defaults));
        }

        public Builder changeTracking(@Nullable Output<String> changeTracking) {
            $.changeTracking = changeTracking;
            return this;
        }

        public Builder changeTracking(String changeTracking) {
            return changeTracking(Output.of(changeTracking));
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

        public Builder isMaterialized(@Nullable Output<Boolean> isMaterialized) {
            $.isMaterialized = isMaterialized;
            return this;
        }

        public Builder isMaterialized(Boolean isMaterialized) {
            return isMaterialized(Output.of(isMaterialized));
        }

        public Builder isSecure(@Nullable Output<Boolean> isSecure) {
            $.isSecure = isSecure;
            return this;
        }

        public Builder isSecure(Boolean isSecure) {
            return isSecure(Output.of(isSecure));
        }

        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        public Builder kind(String kind) {
            return kind(Output.of(kind));
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

        public Builder reserved(@Nullable Output<String> reserved) {
            $.reserved = reserved;
            return this;
        }

        public Builder reserved(String reserved) {
            return reserved(Output.of(reserved));
        }

        public Builder schemaName(@Nullable Output<String> schemaName) {
            $.schemaName = schemaName;
            return this;
        }

        public Builder schemaName(String schemaName) {
            return schemaName(Output.of(schemaName));
        }

        public Builder text(@Nullable Output<String> text) {
            $.text = text;
            return this;
        }

        public Builder text(String text) {
            return text(Output.of(text));
        }

        public ViewShowOutputArgs build() {
            return $;
        }
    }

}