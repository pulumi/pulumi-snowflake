// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAccountsAccount {
    private String accountLocator;
    private String accountLocatorUrl;
    private String accountName;
    private String accountUrl;
    private String comment;
    private String consumptionBillingEntityName;
    private String createdOn;
    private String edition;
    private Boolean isOrgAdmin;
    private Integer managedAccounts;
    private String marketplaceConsumerBillingEntityName;
    private String marketplaceProviderBillingEntityName;
    private String oldAccountUrl;
    private String organizationName;
    private String regionGroup;
    private String snowflakeRegion;

    private GetAccountsAccount() {}
    public String accountLocator() {
        return this.accountLocator;
    }
    public String accountLocatorUrl() {
        return this.accountLocatorUrl;
    }
    public String accountName() {
        return this.accountName;
    }
    public String accountUrl() {
        return this.accountUrl;
    }
    public String comment() {
        return this.comment;
    }
    public String consumptionBillingEntityName() {
        return this.consumptionBillingEntityName;
    }
    public String createdOn() {
        return this.createdOn;
    }
    public String edition() {
        return this.edition;
    }
    public Boolean isOrgAdmin() {
        return this.isOrgAdmin;
    }
    public Integer managedAccounts() {
        return this.managedAccounts;
    }
    public String marketplaceConsumerBillingEntityName() {
        return this.marketplaceConsumerBillingEntityName;
    }
    public String marketplaceProviderBillingEntityName() {
        return this.marketplaceProviderBillingEntityName;
    }
    public String oldAccountUrl() {
        return this.oldAccountUrl;
    }
    public String organizationName() {
        return this.organizationName;
    }
    public String regionGroup() {
        return this.regionGroup;
    }
    public String snowflakeRegion() {
        return this.snowflakeRegion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccountsAccount defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accountLocator;
        private String accountLocatorUrl;
        private String accountName;
        private String accountUrl;
        private String comment;
        private String consumptionBillingEntityName;
        private String createdOn;
        private String edition;
        private Boolean isOrgAdmin;
        private Integer managedAccounts;
        private String marketplaceConsumerBillingEntityName;
        private String marketplaceProviderBillingEntityName;
        private String oldAccountUrl;
        private String organizationName;
        private String regionGroup;
        private String snowflakeRegion;
        public Builder() {}
        public Builder(GetAccountsAccount defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountLocator = defaults.accountLocator;
    	      this.accountLocatorUrl = defaults.accountLocatorUrl;
    	      this.accountName = defaults.accountName;
    	      this.accountUrl = defaults.accountUrl;
    	      this.comment = defaults.comment;
    	      this.consumptionBillingEntityName = defaults.consumptionBillingEntityName;
    	      this.createdOn = defaults.createdOn;
    	      this.edition = defaults.edition;
    	      this.isOrgAdmin = defaults.isOrgAdmin;
    	      this.managedAccounts = defaults.managedAccounts;
    	      this.marketplaceConsumerBillingEntityName = defaults.marketplaceConsumerBillingEntityName;
    	      this.marketplaceProviderBillingEntityName = defaults.marketplaceProviderBillingEntityName;
    	      this.oldAccountUrl = defaults.oldAccountUrl;
    	      this.organizationName = defaults.organizationName;
    	      this.regionGroup = defaults.regionGroup;
    	      this.snowflakeRegion = defaults.snowflakeRegion;
        }

        @CustomType.Setter
        public Builder accountLocator(String accountLocator) {
            this.accountLocator = Objects.requireNonNull(accountLocator);
            return this;
        }
        @CustomType.Setter
        public Builder accountLocatorUrl(String accountLocatorUrl) {
            this.accountLocatorUrl = Objects.requireNonNull(accountLocatorUrl);
            return this;
        }
        @CustomType.Setter
        public Builder accountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }
        @CustomType.Setter
        public Builder accountUrl(String accountUrl) {
            this.accountUrl = Objects.requireNonNull(accountUrl);
            return this;
        }
        @CustomType.Setter
        public Builder comment(String comment) {
            this.comment = Objects.requireNonNull(comment);
            return this;
        }
        @CustomType.Setter
        public Builder consumptionBillingEntityName(String consumptionBillingEntityName) {
            this.consumptionBillingEntityName = Objects.requireNonNull(consumptionBillingEntityName);
            return this;
        }
        @CustomType.Setter
        public Builder createdOn(String createdOn) {
            this.createdOn = Objects.requireNonNull(createdOn);
            return this;
        }
        @CustomType.Setter
        public Builder edition(String edition) {
            this.edition = Objects.requireNonNull(edition);
            return this;
        }
        @CustomType.Setter
        public Builder isOrgAdmin(Boolean isOrgAdmin) {
            this.isOrgAdmin = Objects.requireNonNull(isOrgAdmin);
            return this;
        }
        @CustomType.Setter
        public Builder managedAccounts(Integer managedAccounts) {
            this.managedAccounts = Objects.requireNonNull(managedAccounts);
            return this;
        }
        @CustomType.Setter
        public Builder marketplaceConsumerBillingEntityName(String marketplaceConsumerBillingEntityName) {
            this.marketplaceConsumerBillingEntityName = Objects.requireNonNull(marketplaceConsumerBillingEntityName);
            return this;
        }
        @CustomType.Setter
        public Builder marketplaceProviderBillingEntityName(String marketplaceProviderBillingEntityName) {
            this.marketplaceProviderBillingEntityName = Objects.requireNonNull(marketplaceProviderBillingEntityName);
            return this;
        }
        @CustomType.Setter
        public Builder oldAccountUrl(String oldAccountUrl) {
            this.oldAccountUrl = Objects.requireNonNull(oldAccountUrl);
            return this;
        }
        @CustomType.Setter
        public Builder organizationName(String organizationName) {
            this.organizationName = Objects.requireNonNull(organizationName);
            return this;
        }
        @CustomType.Setter
        public Builder regionGroup(String regionGroup) {
            this.regionGroup = Objects.requireNonNull(regionGroup);
            return this;
        }
        @CustomType.Setter
        public Builder snowflakeRegion(String snowflakeRegion) {
            this.snowflakeRegion = Objects.requireNonNull(snowflakeRegion);
            return this;
        }
        public GetAccountsAccount build() {
            final var o = new GetAccountsAccount();
            o.accountLocator = accountLocator;
            o.accountLocatorUrl = accountLocatorUrl;
            o.accountName = accountName;
            o.accountUrl = accountUrl;
            o.comment = comment;
            o.consumptionBillingEntityName = consumptionBillingEntityName;
            o.createdOn = createdOn;
            o.edition = edition;
            o.isOrgAdmin = isOrgAdmin;
            o.managedAccounts = managedAccounts;
            o.marketplaceConsumerBillingEntityName = marketplaceConsumerBillingEntityName;
            o.marketplaceProviderBillingEntityName = marketplaceProviderBillingEntityName;
            o.oldAccountUrl = oldAccountUrl;
            o.organizationName = organizationName;
            o.regionGroup = regionGroup;
            o.snowflakeRegion = snowflakeRegion;
            return o;
        }
    }
}