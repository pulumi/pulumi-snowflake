// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatabaseReplicationEnableToAccountArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatabaseReplicationEnableToAccountArgs Empty = new DatabaseReplicationEnableToAccountArgs();

    /**
     * Specifies account identifier for which replication should be enabled. The account identifiers should be in the form of `&#34;&lt;organization_name&gt;&#34;.&#34;&lt;account_name&gt;&#34;`.
     * 
     */
    @Import(name="accountIdentifier", required=true)
    private Output<String> accountIdentifier;

    /**
     * @return Specifies account identifier for which replication should be enabled. The account identifiers should be in the form of `&#34;&lt;organization_name&gt;&#34;.&#34;&lt;account_name&gt;&#34;`.
     * 
     */
    public Output<String> accountIdentifier() {
        return this.accountIdentifier;
    }

    /**
     * Specifies if failover should be enabled for the specified account identifier
     * 
     */
    @Import(name="withFailover")
    private @Nullable Output<Boolean> withFailover;

    /**
     * @return Specifies if failover should be enabled for the specified account identifier
     * 
     */
    public Optional<Output<Boolean>> withFailover() {
        return Optional.ofNullable(this.withFailover);
    }

    private DatabaseReplicationEnableToAccountArgs() {}

    private DatabaseReplicationEnableToAccountArgs(DatabaseReplicationEnableToAccountArgs $) {
        this.accountIdentifier = $.accountIdentifier;
        this.withFailover = $.withFailover;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatabaseReplicationEnableToAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatabaseReplicationEnableToAccountArgs $;

        public Builder() {
            $ = new DatabaseReplicationEnableToAccountArgs();
        }

        public Builder(DatabaseReplicationEnableToAccountArgs defaults) {
            $ = new DatabaseReplicationEnableToAccountArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountIdentifier Specifies account identifier for which replication should be enabled. The account identifiers should be in the form of `&#34;&lt;organization_name&gt;&#34;.&#34;&lt;account_name&gt;&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder accountIdentifier(Output<String> accountIdentifier) {
            $.accountIdentifier = accountIdentifier;
            return this;
        }

        /**
         * @param accountIdentifier Specifies account identifier for which replication should be enabled. The account identifiers should be in the form of `&#34;&lt;organization_name&gt;&#34;.&#34;&lt;account_name&gt;&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder accountIdentifier(String accountIdentifier) {
            return accountIdentifier(Output.of(accountIdentifier));
        }

        /**
         * @param withFailover Specifies if failover should be enabled for the specified account identifier
         * 
         * @return builder
         * 
         */
        public Builder withFailover(@Nullable Output<Boolean> withFailover) {
            $.withFailover = withFailover;
            return this;
        }

        /**
         * @param withFailover Specifies if failover should be enabled for the specified account identifier
         * 
         * @return builder
         * 
         */
        public Builder withFailover(Boolean withFailover) {
            return withFailover(Output.of(withFailover));
        }

        public DatabaseReplicationEnableToAccountArgs build() {
            if ($.accountIdentifier == null) {
                throw new MissingRequiredPropertyException("DatabaseReplicationEnableToAccountArgs", "accountIdentifier");
            }
            return $;
        }
    }

}
