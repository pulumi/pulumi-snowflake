// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.snowflake.inputs.DatabaseReplicationEnableToAccountArgs;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatabaseReplicationArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatabaseReplicationArgs Empty = new DatabaseReplicationArgs();

    /**
     * Entry to enable replication and optionally failover for a given account identifier.
     * 
     */
    @Import(name="enableToAccounts", required=true)
    private Output<List<DatabaseReplicationEnableToAccountArgs>> enableToAccounts;

    /**
     * @return Entry to enable replication and optionally failover for a given account identifier.
     * 
     */
    public Output<List<DatabaseReplicationEnableToAccountArgs>> enableToAccounts() {
        return this.enableToAccounts;
    }

    /**
     * Allows replicating data to accounts on lower editions in either of the following scenarios: 1. The primary database is in a Business Critical (or higher) account but one or more of the accounts approved for replication are on lower editions. Business Critical Edition is intended for Snowflake accounts with extremely sensitive data. 2. The primary database is in a Business Critical (or higher) account and a signed business associate agreement is in place to store PHI data in the account per HIPAA and HITRUST regulations, but no such agreement is in place for one or more of the accounts approved for replication, regardless if they are Business Critical (or higher) accounts. Both scenarios are prohibited by default in an effort to help prevent account administrators for Business Critical (or higher) accounts from inadvertently replicating sensitive data to accounts on lower editions.
     * 
     */
    @Import(name="ignoreEditionCheck")
    private @Nullable Output<Boolean> ignoreEditionCheck;

    /**
     * @return Allows replicating data to accounts on lower editions in either of the following scenarios: 1. The primary database is in a Business Critical (or higher) account but one or more of the accounts approved for replication are on lower editions. Business Critical Edition is intended for Snowflake accounts with extremely sensitive data. 2. The primary database is in a Business Critical (or higher) account and a signed business associate agreement is in place to store PHI data in the account per HIPAA and HITRUST regulations, but no such agreement is in place for one or more of the accounts approved for replication, regardless if they are Business Critical (or higher) accounts. Both scenarios are prohibited by default in an effort to help prevent account administrators for Business Critical (or higher) accounts from inadvertently replicating sensitive data to accounts on lower editions.
     * 
     */
    public Optional<Output<Boolean>> ignoreEditionCheck() {
        return Optional.ofNullable(this.ignoreEditionCheck);
    }

    private DatabaseReplicationArgs() {}

    private DatabaseReplicationArgs(DatabaseReplicationArgs $) {
        this.enableToAccounts = $.enableToAccounts;
        this.ignoreEditionCheck = $.ignoreEditionCheck;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatabaseReplicationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatabaseReplicationArgs $;

        public Builder() {
            $ = new DatabaseReplicationArgs();
        }

        public Builder(DatabaseReplicationArgs defaults) {
            $ = new DatabaseReplicationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enableToAccounts Entry to enable replication and optionally failover for a given account identifier.
         * 
         * @return builder
         * 
         */
        public Builder enableToAccounts(Output<List<DatabaseReplicationEnableToAccountArgs>> enableToAccounts) {
            $.enableToAccounts = enableToAccounts;
            return this;
        }

        /**
         * @param enableToAccounts Entry to enable replication and optionally failover for a given account identifier.
         * 
         * @return builder
         * 
         */
        public Builder enableToAccounts(List<DatabaseReplicationEnableToAccountArgs> enableToAccounts) {
            return enableToAccounts(Output.of(enableToAccounts));
        }

        /**
         * @param enableToAccounts Entry to enable replication and optionally failover for a given account identifier.
         * 
         * @return builder
         * 
         */
        public Builder enableToAccounts(DatabaseReplicationEnableToAccountArgs... enableToAccounts) {
            return enableToAccounts(List.of(enableToAccounts));
        }

        /**
         * @param ignoreEditionCheck Allows replicating data to accounts on lower editions in either of the following scenarios: 1. The primary database is in a Business Critical (or higher) account but one or more of the accounts approved for replication are on lower editions. Business Critical Edition is intended for Snowflake accounts with extremely sensitive data. 2. The primary database is in a Business Critical (or higher) account and a signed business associate agreement is in place to store PHI data in the account per HIPAA and HITRUST regulations, but no such agreement is in place for one or more of the accounts approved for replication, regardless if they are Business Critical (or higher) accounts. Both scenarios are prohibited by default in an effort to help prevent account administrators for Business Critical (or higher) accounts from inadvertently replicating sensitive data to accounts on lower editions.
         * 
         * @return builder
         * 
         */
        public Builder ignoreEditionCheck(@Nullable Output<Boolean> ignoreEditionCheck) {
            $.ignoreEditionCheck = ignoreEditionCheck;
            return this;
        }

        /**
         * @param ignoreEditionCheck Allows replicating data to accounts on lower editions in either of the following scenarios: 1. The primary database is in a Business Critical (or higher) account but one or more of the accounts approved for replication are on lower editions. Business Critical Edition is intended for Snowflake accounts with extremely sensitive data. 2. The primary database is in a Business Critical (or higher) account and a signed business associate agreement is in place to store PHI data in the account per HIPAA and HITRUST regulations, but no such agreement is in place for one or more of the accounts approved for replication, regardless if they are Business Critical (or higher) accounts. Both scenarios are prohibited by default in an effort to help prevent account administrators for Business Critical (or higher) accounts from inadvertently replicating sensitive data to accounts on lower editions.
         * 
         * @return builder
         * 
         */
        public Builder ignoreEditionCheck(Boolean ignoreEditionCheck) {
            return ignoreEditionCheck(Output.of(ignoreEditionCheck));
        }

        public DatabaseReplicationArgs build() {
            if ($.enableToAccounts == null) {
                throw new MissingRequiredPropertyException("DatabaseReplicationArgs", "enableToAccounts");
            }
            return $;
        }
    }

}
