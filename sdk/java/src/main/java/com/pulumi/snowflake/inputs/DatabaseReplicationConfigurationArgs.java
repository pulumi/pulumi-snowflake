// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatabaseReplicationConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatabaseReplicationConfigurationArgs Empty = new DatabaseReplicationConfigurationArgs();

    @Import(name="accounts", required=true)
    private Output<List<String>> accounts;

    public Output<List<String>> accounts() {
        return this.accounts;
    }

    @Import(name="ignoreEditionCheck")
    private @Nullable Output<Boolean> ignoreEditionCheck;

    public Optional<Output<Boolean>> ignoreEditionCheck() {
        return Optional.ofNullable(this.ignoreEditionCheck);
    }

    private DatabaseReplicationConfigurationArgs() {}

    private DatabaseReplicationConfigurationArgs(DatabaseReplicationConfigurationArgs $) {
        this.accounts = $.accounts;
        this.ignoreEditionCheck = $.ignoreEditionCheck;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatabaseReplicationConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatabaseReplicationConfigurationArgs $;

        public Builder() {
            $ = new DatabaseReplicationConfigurationArgs();
        }

        public Builder(DatabaseReplicationConfigurationArgs defaults) {
            $ = new DatabaseReplicationConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder accounts(Output<List<String>> accounts) {
            $.accounts = accounts;
            return this;
        }

        public Builder accounts(List<String> accounts) {
            return accounts(Output.of(accounts));
        }

        public Builder accounts(String... accounts) {
            return accounts(List.of(accounts));
        }

        public Builder ignoreEditionCheck(@Nullable Output<Boolean> ignoreEditionCheck) {
            $.ignoreEditionCheck = ignoreEditionCheck;
            return this;
        }

        public Builder ignoreEditionCheck(Boolean ignoreEditionCheck) {
            return ignoreEditionCheck(Output.of(ignoreEditionCheck));
        }

        public DatabaseReplicationConfigurationArgs build() {
            if ($.accounts == null) {
                throw new MissingRequiredPropertyException("DatabaseReplicationConfigurationArgs", "accounts");
            }
            return $;
        }
    }

}
