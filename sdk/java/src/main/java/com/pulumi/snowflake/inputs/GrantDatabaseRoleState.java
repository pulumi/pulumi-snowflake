// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GrantDatabaseRoleState extends com.pulumi.resources.ResourceArgs {

    public static final GrantDatabaseRoleState Empty = new GrantDatabaseRoleState();

    /**
     * The fully qualified name of the database role which will be granted to share or parent role. For more information about this resource, see docs.
     * 
     */
    @Import(name="databaseRoleName")
    private @Nullable Output<String> databaseRoleName;

    /**
     * @return The fully qualified name of the database role which will be granted to share or parent role. For more information about this resource, see docs.
     * 
     */
    public Optional<Output<String>> databaseRoleName() {
        return Optional.ofNullable(this.databaseRoleName);
    }

    /**
     * The fully qualified name of the parent database role which will create a parent-child relationship between the roles. For more information about this resource, see docs.
     * 
     */
    @Import(name="parentDatabaseRoleName")
    private @Nullable Output<String> parentDatabaseRoleName;

    /**
     * @return The fully qualified name of the parent database role which will create a parent-child relationship between the roles. For more information about this resource, see docs.
     * 
     */
    public Optional<Output<String>> parentDatabaseRoleName() {
        return Optional.ofNullable(this.parentDatabaseRoleName);
    }

    /**
     * The fully qualified name of the parent account role which will create a parent-child relationship between the roles. For more information about this resource, see docs.
     * 
     */
    @Import(name="parentRoleName")
    private @Nullable Output<String> parentRoleName;

    /**
     * @return The fully qualified name of the parent account role which will create a parent-child relationship between the roles. For more information about this resource, see docs.
     * 
     */
    public Optional<Output<String>> parentRoleName() {
        return Optional.ofNullable(this.parentRoleName);
    }

    /**
     * The fully qualified name of the share on which privileges will be granted. For more information about this resource, see docs.
     * 
     */
    @Import(name="shareName")
    private @Nullable Output<String> shareName;

    /**
     * @return The fully qualified name of the share on which privileges will be granted. For more information about this resource, see docs.
     * 
     */
    public Optional<Output<String>> shareName() {
        return Optional.ofNullable(this.shareName);
    }

    private GrantDatabaseRoleState() {}

    private GrantDatabaseRoleState(GrantDatabaseRoleState $) {
        this.databaseRoleName = $.databaseRoleName;
        this.parentDatabaseRoleName = $.parentDatabaseRoleName;
        this.parentRoleName = $.parentRoleName;
        this.shareName = $.shareName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GrantDatabaseRoleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GrantDatabaseRoleState $;

        public Builder() {
            $ = new GrantDatabaseRoleState();
        }

        public Builder(GrantDatabaseRoleState defaults) {
            $ = new GrantDatabaseRoleState(Objects.requireNonNull(defaults));
        }

        /**
         * @param databaseRoleName The fully qualified name of the database role which will be granted to share or parent role. For more information about this resource, see docs.
         * 
         * @return builder
         * 
         */
        public Builder databaseRoleName(@Nullable Output<String> databaseRoleName) {
            $.databaseRoleName = databaseRoleName;
            return this;
        }

        /**
         * @param databaseRoleName The fully qualified name of the database role which will be granted to share or parent role. For more information about this resource, see docs.
         * 
         * @return builder
         * 
         */
        public Builder databaseRoleName(String databaseRoleName) {
            return databaseRoleName(Output.of(databaseRoleName));
        }

        /**
         * @param parentDatabaseRoleName The fully qualified name of the parent database role which will create a parent-child relationship between the roles. For more information about this resource, see docs.
         * 
         * @return builder
         * 
         */
        public Builder parentDatabaseRoleName(@Nullable Output<String> parentDatabaseRoleName) {
            $.parentDatabaseRoleName = parentDatabaseRoleName;
            return this;
        }

        /**
         * @param parentDatabaseRoleName The fully qualified name of the parent database role which will create a parent-child relationship between the roles. For more information about this resource, see docs.
         * 
         * @return builder
         * 
         */
        public Builder parentDatabaseRoleName(String parentDatabaseRoleName) {
            return parentDatabaseRoleName(Output.of(parentDatabaseRoleName));
        }

        /**
         * @param parentRoleName The fully qualified name of the parent account role which will create a parent-child relationship between the roles. For more information about this resource, see docs.
         * 
         * @return builder
         * 
         */
        public Builder parentRoleName(@Nullable Output<String> parentRoleName) {
            $.parentRoleName = parentRoleName;
            return this;
        }

        /**
         * @param parentRoleName The fully qualified name of the parent account role which will create a parent-child relationship between the roles. For more information about this resource, see docs.
         * 
         * @return builder
         * 
         */
        public Builder parentRoleName(String parentRoleName) {
            return parentRoleName(Output.of(parentRoleName));
        }

        /**
         * @param shareName The fully qualified name of the share on which privileges will be granted. For more information about this resource, see docs.
         * 
         * @return builder
         * 
         */
        public Builder shareName(@Nullable Output<String> shareName) {
            $.shareName = shareName;
            return this;
        }

        /**
         * @param shareName The fully qualified name of the share on which privileges will be granted. For more information about this resource, see docs.
         * 
         * @return builder
         * 
         */
        public Builder shareName(String shareName) {
            return shareName(Output.of(shareName));
        }

        public GrantDatabaseRoleState build() {
            return $;
        }
    }

}
