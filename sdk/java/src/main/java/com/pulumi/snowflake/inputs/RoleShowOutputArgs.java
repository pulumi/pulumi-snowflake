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


public final class RoleShowOutputArgs extends com.pulumi.resources.ResourceArgs {

    public static final RoleShowOutputArgs Empty = new RoleShowOutputArgs();

    @Import(name="assignedToUsers")
    private @Nullable Output<Integer> assignedToUsers;

    public Optional<Output<Integer>> assignedToUsers() {
        return Optional.ofNullable(this.assignedToUsers);
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

    @Import(name="grantedRoles")
    private @Nullable Output<Integer> grantedRoles;

    public Optional<Output<Integer>> grantedRoles() {
        return Optional.ofNullable(this.grantedRoles);
    }

    @Import(name="grantedToRoles")
    private @Nullable Output<Integer> grantedToRoles;

    public Optional<Output<Integer>> grantedToRoles() {
        return Optional.ofNullable(this.grantedToRoles);
    }

    @Import(name="isCurrent")
    private @Nullable Output<Boolean> isCurrent;

    public Optional<Output<Boolean>> isCurrent() {
        return Optional.ofNullable(this.isCurrent);
    }

    @Import(name="isDefault")
    private @Nullable Output<Boolean> isDefault;

    public Optional<Output<Boolean>> isDefault() {
        return Optional.ofNullable(this.isDefault);
    }

    @Import(name="isInherited")
    private @Nullable Output<Boolean> isInherited;

    public Optional<Output<Boolean>> isInherited() {
        return Optional.ofNullable(this.isInherited);
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

    private RoleShowOutputArgs() {}

    private RoleShowOutputArgs(RoleShowOutputArgs $) {
        this.assignedToUsers = $.assignedToUsers;
        this.comment = $.comment;
        this.createdOn = $.createdOn;
        this.grantedRoles = $.grantedRoles;
        this.grantedToRoles = $.grantedToRoles;
        this.isCurrent = $.isCurrent;
        this.isDefault = $.isDefault;
        this.isInherited = $.isInherited;
        this.name = $.name;
        this.owner = $.owner;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RoleShowOutputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RoleShowOutputArgs $;

        public Builder() {
            $ = new RoleShowOutputArgs();
        }

        public Builder(RoleShowOutputArgs defaults) {
            $ = new RoleShowOutputArgs(Objects.requireNonNull(defaults));
        }

        public Builder assignedToUsers(@Nullable Output<Integer> assignedToUsers) {
            $.assignedToUsers = assignedToUsers;
            return this;
        }

        public Builder assignedToUsers(Integer assignedToUsers) {
            return assignedToUsers(Output.of(assignedToUsers));
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

        public Builder grantedRoles(@Nullable Output<Integer> grantedRoles) {
            $.grantedRoles = grantedRoles;
            return this;
        }

        public Builder grantedRoles(Integer grantedRoles) {
            return grantedRoles(Output.of(grantedRoles));
        }

        public Builder grantedToRoles(@Nullable Output<Integer> grantedToRoles) {
            $.grantedToRoles = grantedToRoles;
            return this;
        }

        public Builder grantedToRoles(Integer grantedToRoles) {
            return grantedToRoles(Output.of(grantedToRoles));
        }

        public Builder isCurrent(@Nullable Output<Boolean> isCurrent) {
            $.isCurrent = isCurrent;
            return this;
        }

        public Builder isCurrent(Boolean isCurrent) {
            return isCurrent(Output.of(isCurrent));
        }

        public Builder isDefault(@Nullable Output<Boolean> isDefault) {
            $.isDefault = isDefault;
            return this;
        }

        public Builder isDefault(Boolean isDefault) {
            return isDefault(Output.of(isDefault));
        }

        public Builder isInherited(@Nullable Output<Boolean> isInherited) {
            $.isInherited = isInherited;
            return this;
        }

        public Builder isInherited(Boolean isInherited) {
            return isInherited(Output.of(isInherited));
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

        public RoleShowOutputArgs build() {
            return $;
        }
    }

}
