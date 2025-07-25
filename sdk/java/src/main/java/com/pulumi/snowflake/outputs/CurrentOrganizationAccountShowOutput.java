// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CurrentOrganizationAccountShowOutput {
    private @Nullable String accountLocator;
    private @Nullable String accountLocatorUrl;
    private @Nullable String accountName;
    private @Nullable String accountOldUrlLastUsed;
    private @Nullable String accountOldUrlSavedOn;
    private @Nullable String accountUrl;
    private @Nullable String comment;
    private @Nullable String consumptionBillingEntityName;
    private @Nullable String createdOn;
    private @Nullable String edition;
    private @Nullable Boolean isEventsAccount;
    private @Nullable Boolean isOrgAdmin;
    private @Nullable Boolean isOrganizationAccount;
    private @Nullable Integer managedAccounts;
    private @Nullable String marketplaceConsumerBillingEntityName;
    private @Nullable String marketplaceProviderBillingEntityName;
    private @Nullable String oldAccountUrl;
    private @Nullable String organizationName;
    private @Nullable String organizationOldUrl;
    private @Nullable String organizationOldUrlLastUsed;
    private @Nullable String organizationOldUrlSavedOn;
    private @Nullable String snowflakeRegion;

    private CurrentOrganizationAccountShowOutput() {}
    public Optional<String> accountLocator() {
        return Optional.ofNullable(this.accountLocator);
    }
    public Optional<String> accountLocatorUrl() {
        return Optional.ofNullable(this.accountLocatorUrl);
    }
    public Optional<String> accountName() {
        return Optional.ofNullable(this.accountName);
    }
    public Optional<String> accountOldUrlLastUsed() {
        return Optional.ofNullable(this.accountOldUrlLastUsed);
    }
    public Optional<String> accountOldUrlSavedOn() {
        return Optional.ofNullable(this.accountOldUrlSavedOn);
    }
    public Optional<String> accountUrl() {
        return Optional.ofNullable(this.accountUrl);
    }
    public Optional<String> comment() {
        return Optional.ofNullable(this.comment);
    }
    public Optional<String> consumptionBillingEntityName() {
        return Optional.ofNullable(this.consumptionBillingEntityName);
    }
    public Optional<String> createdOn() {
        return Optional.ofNullable(this.createdOn);
    }
    public Optional<String> edition() {
        return Optional.ofNullable(this.edition);
    }
    public Optional<Boolean> isEventsAccount() {
        return Optional.ofNullable(this.isEventsAccount);
    }
    public Optional<Boolean> isOrgAdmin() {
        return Optional.ofNullable(this.isOrgAdmin);
    }
    public Optional<Boolean> isOrganizationAccount() {
        return Optional.ofNullable(this.isOrganizationAccount);
    }
    public Optional<Integer> managedAccounts() {
        return Optional.ofNullable(this.managedAccounts);
    }
    public Optional<String> marketplaceConsumerBillingEntityName() {
        return Optional.ofNullable(this.marketplaceConsumerBillingEntityName);
    }
    public Optional<String> marketplaceProviderBillingEntityName() {
        return Optional.ofNullable(this.marketplaceProviderBillingEntityName);
    }
    public Optional<String> oldAccountUrl() {
        return Optional.ofNullable(this.oldAccountUrl);
    }
    public Optional<String> organizationName() {
        return Optional.ofNullable(this.organizationName);
    }
    public Optional<String> organizationOldUrl() {
        return Optional.ofNullable(this.organizationOldUrl);
    }
    public Optional<String> organizationOldUrlLastUsed() {
        return Optional.ofNullable(this.organizationOldUrlLastUsed);
    }
    public Optional<String> organizationOldUrlSavedOn() {
        return Optional.ofNullable(this.organizationOldUrlSavedOn);
    }
    public Optional<String> snowflakeRegion() {
        return Optional.ofNullable(this.snowflakeRegion);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CurrentOrganizationAccountShowOutput defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String accountLocator;
        private @Nullable String accountLocatorUrl;
        private @Nullable String accountName;
        private @Nullable String accountOldUrlLastUsed;
        private @Nullable String accountOldUrlSavedOn;
        private @Nullable String accountUrl;
        private @Nullable String comment;
        private @Nullable String consumptionBillingEntityName;
        private @Nullable String createdOn;
        private @Nullable String edition;
        private @Nullable Boolean isEventsAccount;
        private @Nullable Boolean isOrgAdmin;
        private @Nullable Boolean isOrganizationAccount;
        private @Nullable Integer managedAccounts;
        private @Nullable String marketplaceConsumerBillingEntityName;
        private @Nullable String marketplaceProviderBillingEntityName;
        private @Nullable String oldAccountUrl;
        private @Nullable String organizationName;
        private @Nullable String organizationOldUrl;
        private @Nullable String organizationOldUrlLastUsed;
        private @Nullable String organizationOldUrlSavedOn;
        private @Nullable String snowflakeRegion;
        public Builder() {}
        public Builder(CurrentOrganizationAccountShowOutput defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountLocator = defaults.accountLocator;
    	      this.accountLocatorUrl = defaults.accountLocatorUrl;
    	      this.accountName = defaults.accountName;
    	      this.accountOldUrlLastUsed = defaults.accountOldUrlLastUsed;
    	      this.accountOldUrlSavedOn = defaults.accountOldUrlSavedOn;
    	      this.accountUrl = defaults.accountUrl;
    	      this.comment = defaults.comment;
    	      this.consumptionBillingEntityName = defaults.consumptionBillingEntityName;
    	      this.createdOn = defaults.createdOn;
    	      this.edition = defaults.edition;
    	      this.isEventsAccount = defaults.isEventsAccount;
    	      this.isOrgAdmin = defaults.isOrgAdmin;
    	      this.isOrganizationAccount = defaults.isOrganizationAccount;
    	      this.managedAccounts = defaults.managedAccounts;
    	      this.marketplaceConsumerBillingEntityName = defaults.marketplaceConsumerBillingEntityName;
    	      this.marketplaceProviderBillingEntityName = defaults.marketplaceProviderBillingEntityName;
    	      this.oldAccountUrl = defaults.oldAccountUrl;
    	      this.organizationName = defaults.organizationName;
    	      this.organizationOldUrl = defaults.organizationOldUrl;
    	      this.organizationOldUrlLastUsed = defaults.organizationOldUrlLastUsed;
    	      this.organizationOldUrlSavedOn = defaults.organizationOldUrlSavedOn;
    	      this.snowflakeRegion = defaults.snowflakeRegion;
        }

        @CustomType.Setter
        public Builder accountLocator(@Nullable String accountLocator) {

            this.accountLocator = accountLocator;
            return this;
        }
        @CustomType.Setter
        public Builder accountLocatorUrl(@Nullable String accountLocatorUrl) {

            this.accountLocatorUrl = accountLocatorUrl;
            return this;
        }
        @CustomType.Setter
        public Builder accountName(@Nullable String accountName) {

            this.accountName = accountName;
            return this;
        }
        @CustomType.Setter
        public Builder accountOldUrlLastUsed(@Nullable String accountOldUrlLastUsed) {

            this.accountOldUrlLastUsed = accountOldUrlLastUsed;
            return this;
        }
        @CustomType.Setter
        public Builder accountOldUrlSavedOn(@Nullable String accountOldUrlSavedOn) {

            this.accountOldUrlSavedOn = accountOldUrlSavedOn;
            return this;
        }
        @CustomType.Setter
        public Builder accountUrl(@Nullable String accountUrl) {

            this.accountUrl = accountUrl;
            return this;
        }
        @CustomType.Setter
        public Builder comment(@Nullable String comment) {

            this.comment = comment;
            return this;
        }
        @CustomType.Setter
        public Builder consumptionBillingEntityName(@Nullable String consumptionBillingEntityName) {

            this.consumptionBillingEntityName = consumptionBillingEntityName;
            return this;
        }
        @CustomType.Setter
        public Builder createdOn(@Nullable String createdOn) {

            this.createdOn = createdOn;
            return this;
        }
        @CustomType.Setter
        public Builder edition(@Nullable String edition) {

            this.edition = edition;
            return this;
        }
        @CustomType.Setter
        public Builder isEventsAccount(@Nullable Boolean isEventsAccount) {

            this.isEventsAccount = isEventsAccount;
            return this;
        }
        @CustomType.Setter
        public Builder isOrgAdmin(@Nullable Boolean isOrgAdmin) {

            this.isOrgAdmin = isOrgAdmin;
            return this;
        }
        @CustomType.Setter
        public Builder isOrganizationAccount(@Nullable Boolean isOrganizationAccount) {

            this.isOrganizationAccount = isOrganizationAccount;
            return this;
        }
        @CustomType.Setter
        public Builder managedAccounts(@Nullable Integer managedAccounts) {

            this.managedAccounts = managedAccounts;
            return this;
        }
        @CustomType.Setter
        public Builder marketplaceConsumerBillingEntityName(@Nullable String marketplaceConsumerBillingEntityName) {

            this.marketplaceConsumerBillingEntityName = marketplaceConsumerBillingEntityName;
            return this;
        }
        @CustomType.Setter
        public Builder marketplaceProviderBillingEntityName(@Nullable String marketplaceProviderBillingEntityName) {

            this.marketplaceProviderBillingEntityName = marketplaceProviderBillingEntityName;
            return this;
        }
        @CustomType.Setter
        public Builder oldAccountUrl(@Nullable String oldAccountUrl) {

            this.oldAccountUrl = oldAccountUrl;
            return this;
        }
        @CustomType.Setter
        public Builder organizationName(@Nullable String organizationName) {

            this.organizationName = organizationName;
            return this;
        }
        @CustomType.Setter
        public Builder organizationOldUrl(@Nullable String organizationOldUrl) {

            this.organizationOldUrl = organizationOldUrl;
            return this;
        }
        @CustomType.Setter
        public Builder organizationOldUrlLastUsed(@Nullable String organizationOldUrlLastUsed) {

            this.organizationOldUrlLastUsed = organizationOldUrlLastUsed;
            return this;
        }
        @CustomType.Setter
        public Builder organizationOldUrlSavedOn(@Nullable String organizationOldUrlSavedOn) {

            this.organizationOldUrlSavedOn = organizationOldUrlSavedOn;
            return this;
        }
        @CustomType.Setter
        public Builder snowflakeRegion(@Nullable String snowflakeRegion) {

            this.snowflakeRegion = snowflakeRegion;
            return this;
        }
        public CurrentOrganizationAccountShowOutput build() {
            final var _resultValue = new CurrentOrganizationAccountShowOutput();
            _resultValue.accountLocator = accountLocator;
            _resultValue.accountLocatorUrl = accountLocatorUrl;
            _resultValue.accountName = accountName;
            _resultValue.accountOldUrlLastUsed = accountOldUrlLastUsed;
            _resultValue.accountOldUrlSavedOn = accountOldUrlSavedOn;
            _resultValue.accountUrl = accountUrl;
            _resultValue.comment = comment;
            _resultValue.consumptionBillingEntityName = consumptionBillingEntityName;
            _resultValue.createdOn = createdOn;
            _resultValue.edition = edition;
            _resultValue.isEventsAccount = isEventsAccount;
            _resultValue.isOrgAdmin = isOrgAdmin;
            _resultValue.isOrganizationAccount = isOrganizationAccount;
            _resultValue.managedAccounts = managedAccounts;
            _resultValue.marketplaceConsumerBillingEntityName = marketplaceConsumerBillingEntityName;
            _resultValue.marketplaceProviderBillingEntityName = marketplaceProviderBillingEntityName;
            _resultValue.oldAccountUrl = oldAccountUrl;
            _resultValue.organizationName = organizationName;
            _resultValue.organizationOldUrl = organizationOldUrl;
            _resultValue.organizationOldUrlLastUsed = organizationOldUrlLastUsed;
            _resultValue.organizationOldUrlSavedOn = organizationOldUrlSavedOn;
            _resultValue.snowflakeRegion = snowflakeRegion;
            return _resultValue;
        }
    }
}
