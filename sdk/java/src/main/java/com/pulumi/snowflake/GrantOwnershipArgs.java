// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.snowflake.inputs.GrantOwnershipOnArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GrantOwnershipArgs extends com.pulumi.resources.ResourceArgs {

    public static final GrantOwnershipArgs Empty = new GrantOwnershipArgs();

    /**
     * The fully qualified name of the account role to which privileges will be granted. For more information about this resource, see docs.
     * 
     */
    @Import(name="accountRoleName")
    private @Nullable Output<String> accountRoleName;

    /**
     * @return The fully qualified name of the account role to which privileges will be granted. For more information about this resource, see docs.
     * 
     */
    public Optional<Output<String>> accountRoleName() {
        return Optional.ofNullable(this.accountRoleName);
    }

    /**
     * The fully qualified name of the database role to which privileges will be granted. For more information about this resource, see docs.
     * 
     */
    @Import(name="databaseRoleName")
    private @Nullable Output<String> databaseRoleName;

    /**
     * @return The fully qualified name of the database role to which privileges will be granted. For more information about this resource, see docs.
     * 
     */
    public Optional<Output<String>> databaseRoleName() {
        return Optional.ofNullable(this.databaseRoleName);
    }

    /**
     * Configures which object(s) should transfer their ownership to the specified role.
     * 
     */
    @Import(name="on", required=true)
    private Output<GrantOwnershipOnArgs> on;

    /**
     * @return Configures which object(s) should transfer their ownership to the specified role.
     * 
     */
    public Output<GrantOwnershipOnArgs> on() {
        return this.on;
    }

    /**
     * Specifies whether to remove or transfer all existing outbound privileges on the object when ownership is transferred to a new role. Available options are: REVOKE for removing existing privileges and COPY to transfer them with ownership. For more information head over to [Snowflake documentation](https://docs.snowflake.com/en/sql-reference/sql/grant-ownership#optional-parameters).
     * 
     */
    @Import(name="outboundPrivileges")
    private @Nullable Output<String> outboundPrivileges;

    /**
     * @return Specifies whether to remove or transfer all existing outbound privileges on the object when ownership is transferred to a new role. Available options are: REVOKE for removing existing privileges and COPY to transfer them with ownership. For more information head over to [Snowflake documentation](https://docs.snowflake.com/en/sql-reference/sql/grant-ownership#optional-parameters).
     * 
     */
    public Optional<Output<String>> outboundPrivileges() {
        return Optional.ofNullable(this.outboundPrivileges);
    }

    private GrantOwnershipArgs() {}

    private GrantOwnershipArgs(GrantOwnershipArgs $) {
        this.accountRoleName = $.accountRoleName;
        this.databaseRoleName = $.databaseRoleName;
        this.on = $.on;
        this.outboundPrivileges = $.outboundPrivileges;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GrantOwnershipArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GrantOwnershipArgs $;

        public Builder() {
            $ = new GrantOwnershipArgs();
        }

        public Builder(GrantOwnershipArgs defaults) {
            $ = new GrantOwnershipArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountRoleName The fully qualified name of the account role to which privileges will be granted. For more information about this resource, see docs.
         * 
         * @return builder
         * 
         */
        public Builder accountRoleName(@Nullable Output<String> accountRoleName) {
            $.accountRoleName = accountRoleName;
            return this;
        }

        /**
         * @param accountRoleName The fully qualified name of the account role to which privileges will be granted. For more information about this resource, see docs.
         * 
         * @return builder
         * 
         */
        public Builder accountRoleName(String accountRoleName) {
            return accountRoleName(Output.of(accountRoleName));
        }

        /**
         * @param databaseRoleName The fully qualified name of the database role to which privileges will be granted. For more information about this resource, see docs.
         * 
         * @return builder
         * 
         */
        public Builder databaseRoleName(@Nullable Output<String> databaseRoleName) {
            $.databaseRoleName = databaseRoleName;
            return this;
        }

        /**
         * @param databaseRoleName The fully qualified name of the database role to which privileges will be granted. For more information about this resource, see docs.
         * 
         * @return builder
         * 
         */
        public Builder databaseRoleName(String databaseRoleName) {
            return databaseRoleName(Output.of(databaseRoleName));
        }

        /**
         * @param on Configures which object(s) should transfer their ownership to the specified role.
         * 
         * @return builder
         * 
         */
        public Builder on(Output<GrantOwnershipOnArgs> on) {
            $.on = on;
            return this;
        }

        /**
         * @param on Configures which object(s) should transfer their ownership to the specified role.
         * 
         * @return builder
         * 
         */
        public Builder on(GrantOwnershipOnArgs on) {
            return on(Output.of(on));
        }

        /**
         * @param outboundPrivileges Specifies whether to remove or transfer all existing outbound privileges on the object when ownership is transferred to a new role. Available options are: REVOKE for removing existing privileges and COPY to transfer them with ownership. For more information head over to [Snowflake documentation](https://docs.snowflake.com/en/sql-reference/sql/grant-ownership#optional-parameters).
         * 
         * @return builder
         * 
         */
        public Builder outboundPrivileges(@Nullable Output<String> outboundPrivileges) {
            $.outboundPrivileges = outboundPrivileges;
            return this;
        }

        /**
         * @param outboundPrivileges Specifies whether to remove or transfer all existing outbound privileges on the object when ownership is transferred to a new role. Available options are: REVOKE for removing existing privileges and COPY to transfer them with ownership. For more information head over to [Snowflake documentation](https://docs.snowflake.com/en/sql-reference/sql/grant-ownership#optional-parameters).
         * 
         * @return builder
         * 
         */
        public Builder outboundPrivileges(String outboundPrivileges) {
            return outboundPrivileges(Output.of(outboundPrivileges));
        }

        public GrantOwnershipArgs build() {
            if ($.on == null) {
                throw new MissingRequiredPropertyException("GrantOwnershipArgs", "on");
            }
            return $;
        }
    }

}
