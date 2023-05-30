// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetFailoverGroupsFailoverGroup {
    private String accountLocator;
    private String accountName;
    private List<Object> allowedAccounts;
    private List<Object> allowedIntegrationTypes;
    private String comment;
    private String createdOn;
    private Boolean isPrimary;
    private String nextScheduledRefresh;
    private List<Object> objectTypes;
    private String organizationName;
    private String owner;
    private String primary;
    private String regionGroup;
    private String replicationSchedule;
    private String secondaryState;
    private String snowflakeRegion;
    private String type;

    private GetFailoverGroupsFailoverGroup() {}
    public String accountLocator() {
        return this.accountLocator;
    }
    public String accountName() {
        return this.accountName;
    }
    public List<Object> allowedAccounts() {
        return this.allowedAccounts;
    }
    public List<Object> allowedIntegrationTypes() {
        return this.allowedIntegrationTypes;
    }
    public String comment() {
        return this.comment;
    }
    public String createdOn() {
        return this.createdOn;
    }
    public Boolean isPrimary() {
        return this.isPrimary;
    }
    public String nextScheduledRefresh() {
        return this.nextScheduledRefresh;
    }
    public List<Object> objectTypes() {
        return this.objectTypes;
    }
    public String organizationName() {
        return this.organizationName;
    }
    public String owner() {
        return this.owner;
    }
    public String primary() {
        return this.primary;
    }
    public String regionGroup() {
        return this.regionGroup;
    }
    public String replicationSchedule() {
        return this.replicationSchedule;
    }
    public String secondaryState() {
        return this.secondaryState;
    }
    public String snowflakeRegion() {
        return this.snowflakeRegion;
    }
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFailoverGroupsFailoverGroup defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accountLocator;
        private String accountName;
        private List<Object> allowedAccounts;
        private List<Object> allowedIntegrationTypes;
        private String comment;
        private String createdOn;
        private Boolean isPrimary;
        private String nextScheduledRefresh;
        private List<Object> objectTypes;
        private String organizationName;
        private String owner;
        private String primary;
        private String regionGroup;
        private String replicationSchedule;
        private String secondaryState;
        private String snowflakeRegion;
        private String type;
        public Builder() {}
        public Builder(GetFailoverGroupsFailoverGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountLocator = defaults.accountLocator;
    	      this.accountName = defaults.accountName;
    	      this.allowedAccounts = defaults.allowedAccounts;
    	      this.allowedIntegrationTypes = defaults.allowedIntegrationTypes;
    	      this.comment = defaults.comment;
    	      this.createdOn = defaults.createdOn;
    	      this.isPrimary = defaults.isPrimary;
    	      this.nextScheduledRefresh = defaults.nextScheduledRefresh;
    	      this.objectTypes = defaults.objectTypes;
    	      this.organizationName = defaults.organizationName;
    	      this.owner = defaults.owner;
    	      this.primary = defaults.primary;
    	      this.regionGroup = defaults.regionGroup;
    	      this.replicationSchedule = defaults.replicationSchedule;
    	      this.secondaryState = defaults.secondaryState;
    	      this.snowflakeRegion = defaults.snowflakeRegion;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder accountLocator(String accountLocator) {
            this.accountLocator = Objects.requireNonNull(accountLocator);
            return this;
        }
        @CustomType.Setter
        public Builder accountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }
        @CustomType.Setter
        public Builder allowedAccounts(List<Object> allowedAccounts) {
            this.allowedAccounts = Objects.requireNonNull(allowedAccounts);
            return this;
        }
        public Builder allowedAccounts(Object... allowedAccounts) {
            return allowedAccounts(List.of(allowedAccounts));
        }
        @CustomType.Setter
        public Builder allowedIntegrationTypes(List<Object> allowedIntegrationTypes) {
            this.allowedIntegrationTypes = Objects.requireNonNull(allowedIntegrationTypes);
            return this;
        }
        public Builder allowedIntegrationTypes(Object... allowedIntegrationTypes) {
            return allowedIntegrationTypes(List.of(allowedIntegrationTypes));
        }
        @CustomType.Setter
        public Builder comment(String comment) {
            this.comment = Objects.requireNonNull(comment);
            return this;
        }
        @CustomType.Setter
        public Builder createdOn(String createdOn) {
            this.createdOn = Objects.requireNonNull(createdOn);
            return this;
        }
        @CustomType.Setter
        public Builder isPrimary(Boolean isPrimary) {
            this.isPrimary = Objects.requireNonNull(isPrimary);
            return this;
        }
        @CustomType.Setter
        public Builder nextScheduledRefresh(String nextScheduledRefresh) {
            this.nextScheduledRefresh = Objects.requireNonNull(nextScheduledRefresh);
            return this;
        }
        @CustomType.Setter
        public Builder objectTypes(List<Object> objectTypes) {
            this.objectTypes = Objects.requireNonNull(objectTypes);
            return this;
        }
        public Builder objectTypes(Object... objectTypes) {
            return objectTypes(List.of(objectTypes));
        }
        @CustomType.Setter
        public Builder organizationName(String organizationName) {
            this.organizationName = Objects.requireNonNull(organizationName);
            return this;
        }
        @CustomType.Setter
        public Builder owner(String owner) {
            this.owner = Objects.requireNonNull(owner);
            return this;
        }
        @CustomType.Setter
        public Builder primary(String primary) {
            this.primary = Objects.requireNonNull(primary);
            return this;
        }
        @CustomType.Setter
        public Builder regionGroup(String regionGroup) {
            this.regionGroup = Objects.requireNonNull(regionGroup);
            return this;
        }
        @CustomType.Setter
        public Builder replicationSchedule(String replicationSchedule) {
            this.replicationSchedule = Objects.requireNonNull(replicationSchedule);
            return this;
        }
        @CustomType.Setter
        public Builder secondaryState(String secondaryState) {
            this.secondaryState = Objects.requireNonNull(secondaryState);
            return this;
        }
        @CustomType.Setter
        public Builder snowflakeRegion(String snowflakeRegion) {
            this.snowflakeRegion = Objects.requireNonNull(snowflakeRegion);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetFailoverGroupsFailoverGroup build() {
            final var o = new GetFailoverGroupsFailoverGroup();
            o.accountLocator = accountLocator;
            o.accountName = accountName;
            o.allowedAccounts = allowedAccounts;
            o.allowedIntegrationTypes = allowedIntegrationTypes;
            o.comment = comment;
            o.createdOn = createdOn;
            o.isPrimary = isPrimary;
            o.nextScheduledRefresh = nextScheduledRefresh;
            o.objectTypes = objectTypes;
            o.organizationName = organizationName;
            o.owner = owner;
            o.primary = primary;
            o.regionGroup = regionGroup;
            o.replicationSchedule = replicationSchedule;
            o.secondaryState = secondaryState;
            o.snowflakeRegion = snowflakeRegion;
            o.type = type;
            return o;
        }
    }
}
