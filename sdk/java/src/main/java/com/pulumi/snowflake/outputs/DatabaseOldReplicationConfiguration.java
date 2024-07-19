// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DatabaseOldReplicationConfiguration {
    private List<String> accounts;
    private @Nullable Boolean ignoreEditionCheck;

    private DatabaseOldReplicationConfiguration() {}
    public List<String> accounts() {
        return this.accounts;
    }
    public Optional<Boolean> ignoreEditionCheck() {
        return Optional.ofNullable(this.ignoreEditionCheck);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseOldReplicationConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> accounts;
        private @Nullable Boolean ignoreEditionCheck;
        public Builder() {}
        public Builder(DatabaseOldReplicationConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accounts = defaults.accounts;
    	      this.ignoreEditionCheck = defaults.ignoreEditionCheck;
        }

        @CustomType.Setter
        public Builder accounts(List<String> accounts) {
            if (accounts == null) {
              throw new MissingRequiredPropertyException("DatabaseOldReplicationConfiguration", "accounts");
            }
            this.accounts = accounts;
            return this;
        }
        public Builder accounts(String... accounts) {
            return accounts(List.of(accounts));
        }
        @CustomType.Setter
        public Builder ignoreEditionCheck(@Nullable Boolean ignoreEditionCheck) {

            this.ignoreEditionCheck = ignoreEditionCheck;
            return this;
        }
        public DatabaseOldReplicationConfiguration build() {
            final var _resultValue = new DatabaseOldReplicationConfiguration();
            _resultValue.accounts = accounts;
            _resultValue.ignoreEditionCheck = ignoreEditionCheck;
            return _resultValue;
        }
    }
}