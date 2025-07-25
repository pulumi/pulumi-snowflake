// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceDescribeOutput {
    private @Nullable Boolean autoResume;
    private @Nullable Integer autoSuspendSecs;
    private @Nullable String comment;
    private @Nullable String computePool;
    private @Nullable String createdOn;
    private @Nullable Integer currentInstances;
    private @Nullable String databaseName;
    private @Nullable String dnsName;
    private @Nullable List<String> externalAccessIntegrations;
    private @Nullable Boolean isAsyncJob;
    private @Nullable Boolean isJob;
    private @Nullable Boolean isUpgrading;
    private @Nullable String managingObjectDomain;
    private @Nullable String managingObjectName;
    private @Nullable Integer maxInstances;
    private @Nullable Integer minInstances;
    private @Nullable Integer minReadyInstances;
    private @Nullable String name;
    private @Nullable String owner;
    private @Nullable String ownerRoleType;
    private @Nullable String queryWarehouse;
    private @Nullable String resumedOn;
    private @Nullable String schemaName;
    private @Nullable String spec;
    private @Nullable String specDigest;
    private @Nullable String status;
    private @Nullable String suspendedOn;
    private @Nullable Integer targetInstances;
    private @Nullable String updatedOn;

    private ServiceDescribeOutput() {}
    public Optional<Boolean> autoResume() {
        return Optional.ofNullable(this.autoResume);
    }
    public Optional<Integer> autoSuspendSecs() {
        return Optional.ofNullable(this.autoSuspendSecs);
    }
    public Optional<String> comment() {
        return Optional.ofNullable(this.comment);
    }
    public Optional<String> computePool() {
        return Optional.ofNullable(this.computePool);
    }
    public Optional<String> createdOn() {
        return Optional.ofNullable(this.createdOn);
    }
    public Optional<Integer> currentInstances() {
        return Optional.ofNullable(this.currentInstances);
    }
    public Optional<String> databaseName() {
        return Optional.ofNullable(this.databaseName);
    }
    public Optional<String> dnsName() {
        return Optional.ofNullable(this.dnsName);
    }
    public List<String> externalAccessIntegrations() {
        return this.externalAccessIntegrations == null ? List.of() : this.externalAccessIntegrations;
    }
    public Optional<Boolean> isAsyncJob() {
        return Optional.ofNullable(this.isAsyncJob);
    }
    public Optional<Boolean> isJob() {
        return Optional.ofNullable(this.isJob);
    }
    public Optional<Boolean> isUpgrading() {
        return Optional.ofNullable(this.isUpgrading);
    }
    public Optional<String> managingObjectDomain() {
        return Optional.ofNullable(this.managingObjectDomain);
    }
    public Optional<String> managingObjectName() {
        return Optional.ofNullable(this.managingObjectName);
    }
    public Optional<Integer> maxInstances() {
        return Optional.ofNullable(this.maxInstances);
    }
    public Optional<Integer> minInstances() {
        return Optional.ofNullable(this.minInstances);
    }
    public Optional<Integer> minReadyInstances() {
        return Optional.ofNullable(this.minReadyInstances);
    }
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    public Optional<String> owner() {
        return Optional.ofNullable(this.owner);
    }
    public Optional<String> ownerRoleType() {
        return Optional.ofNullable(this.ownerRoleType);
    }
    public Optional<String> queryWarehouse() {
        return Optional.ofNullable(this.queryWarehouse);
    }
    public Optional<String> resumedOn() {
        return Optional.ofNullable(this.resumedOn);
    }
    public Optional<String> schemaName() {
        return Optional.ofNullable(this.schemaName);
    }
    public Optional<String> spec() {
        return Optional.ofNullable(this.spec);
    }
    public Optional<String> specDigest() {
        return Optional.ofNullable(this.specDigest);
    }
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }
    public Optional<String> suspendedOn() {
        return Optional.ofNullable(this.suspendedOn);
    }
    public Optional<Integer> targetInstances() {
        return Optional.ofNullable(this.targetInstances);
    }
    public Optional<String> updatedOn() {
        return Optional.ofNullable(this.updatedOn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceDescribeOutput defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean autoResume;
        private @Nullable Integer autoSuspendSecs;
        private @Nullable String comment;
        private @Nullable String computePool;
        private @Nullable String createdOn;
        private @Nullable Integer currentInstances;
        private @Nullable String databaseName;
        private @Nullable String dnsName;
        private @Nullable List<String> externalAccessIntegrations;
        private @Nullable Boolean isAsyncJob;
        private @Nullable Boolean isJob;
        private @Nullable Boolean isUpgrading;
        private @Nullable String managingObjectDomain;
        private @Nullable String managingObjectName;
        private @Nullable Integer maxInstances;
        private @Nullable Integer minInstances;
        private @Nullable Integer minReadyInstances;
        private @Nullable String name;
        private @Nullable String owner;
        private @Nullable String ownerRoleType;
        private @Nullable String queryWarehouse;
        private @Nullable String resumedOn;
        private @Nullable String schemaName;
        private @Nullable String spec;
        private @Nullable String specDigest;
        private @Nullable String status;
        private @Nullable String suspendedOn;
        private @Nullable Integer targetInstances;
        private @Nullable String updatedOn;
        public Builder() {}
        public Builder(ServiceDescribeOutput defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoResume = defaults.autoResume;
    	      this.autoSuspendSecs = defaults.autoSuspendSecs;
    	      this.comment = defaults.comment;
    	      this.computePool = defaults.computePool;
    	      this.createdOn = defaults.createdOn;
    	      this.currentInstances = defaults.currentInstances;
    	      this.databaseName = defaults.databaseName;
    	      this.dnsName = defaults.dnsName;
    	      this.externalAccessIntegrations = defaults.externalAccessIntegrations;
    	      this.isAsyncJob = defaults.isAsyncJob;
    	      this.isJob = defaults.isJob;
    	      this.isUpgrading = defaults.isUpgrading;
    	      this.managingObjectDomain = defaults.managingObjectDomain;
    	      this.managingObjectName = defaults.managingObjectName;
    	      this.maxInstances = defaults.maxInstances;
    	      this.minInstances = defaults.minInstances;
    	      this.minReadyInstances = defaults.minReadyInstances;
    	      this.name = defaults.name;
    	      this.owner = defaults.owner;
    	      this.ownerRoleType = defaults.ownerRoleType;
    	      this.queryWarehouse = defaults.queryWarehouse;
    	      this.resumedOn = defaults.resumedOn;
    	      this.schemaName = defaults.schemaName;
    	      this.spec = defaults.spec;
    	      this.specDigest = defaults.specDigest;
    	      this.status = defaults.status;
    	      this.suspendedOn = defaults.suspendedOn;
    	      this.targetInstances = defaults.targetInstances;
    	      this.updatedOn = defaults.updatedOn;
        }

        @CustomType.Setter
        public Builder autoResume(@Nullable Boolean autoResume) {

            this.autoResume = autoResume;
            return this;
        }
        @CustomType.Setter
        public Builder autoSuspendSecs(@Nullable Integer autoSuspendSecs) {

            this.autoSuspendSecs = autoSuspendSecs;
            return this;
        }
        @CustomType.Setter
        public Builder comment(@Nullable String comment) {

            this.comment = comment;
            return this;
        }
        @CustomType.Setter
        public Builder computePool(@Nullable String computePool) {

            this.computePool = computePool;
            return this;
        }
        @CustomType.Setter
        public Builder createdOn(@Nullable String createdOn) {

            this.createdOn = createdOn;
            return this;
        }
        @CustomType.Setter
        public Builder currentInstances(@Nullable Integer currentInstances) {

            this.currentInstances = currentInstances;
            return this;
        }
        @CustomType.Setter
        public Builder databaseName(@Nullable String databaseName) {

            this.databaseName = databaseName;
            return this;
        }
        @CustomType.Setter
        public Builder dnsName(@Nullable String dnsName) {

            this.dnsName = dnsName;
            return this;
        }
        @CustomType.Setter
        public Builder externalAccessIntegrations(@Nullable List<String> externalAccessIntegrations) {

            this.externalAccessIntegrations = externalAccessIntegrations;
            return this;
        }
        public Builder externalAccessIntegrations(String... externalAccessIntegrations) {
            return externalAccessIntegrations(List.of(externalAccessIntegrations));
        }
        @CustomType.Setter
        public Builder isAsyncJob(@Nullable Boolean isAsyncJob) {

            this.isAsyncJob = isAsyncJob;
            return this;
        }
        @CustomType.Setter
        public Builder isJob(@Nullable Boolean isJob) {

            this.isJob = isJob;
            return this;
        }
        @CustomType.Setter
        public Builder isUpgrading(@Nullable Boolean isUpgrading) {

            this.isUpgrading = isUpgrading;
            return this;
        }
        @CustomType.Setter
        public Builder managingObjectDomain(@Nullable String managingObjectDomain) {

            this.managingObjectDomain = managingObjectDomain;
            return this;
        }
        @CustomType.Setter
        public Builder managingObjectName(@Nullable String managingObjectName) {

            this.managingObjectName = managingObjectName;
            return this;
        }
        @CustomType.Setter
        public Builder maxInstances(@Nullable Integer maxInstances) {

            this.maxInstances = maxInstances;
            return this;
        }
        @CustomType.Setter
        public Builder minInstances(@Nullable Integer minInstances) {

            this.minInstances = minInstances;
            return this;
        }
        @CustomType.Setter
        public Builder minReadyInstances(@Nullable Integer minReadyInstances) {

            this.minReadyInstances = minReadyInstances;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder owner(@Nullable String owner) {

            this.owner = owner;
            return this;
        }
        @CustomType.Setter
        public Builder ownerRoleType(@Nullable String ownerRoleType) {

            this.ownerRoleType = ownerRoleType;
            return this;
        }
        @CustomType.Setter
        public Builder queryWarehouse(@Nullable String queryWarehouse) {

            this.queryWarehouse = queryWarehouse;
            return this;
        }
        @CustomType.Setter
        public Builder resumedOn(@Nullable String resumedOn) {

            this.resumedOn = resumedOn;
            return this;
        }
        @CustomType.Setter
        public Builder schemaName(@Nullable String schemaName) {

            this.schemaName = schemaName;
            return this;
        }
        @CustomType.Setter
        public Builder spec(@Nullable String spec) {

            this.spec = spec;
            return this;
        }
        @CustomType.Setter
        public Builder specDigest(@Nullable String specDigest) {

            this.specDigest = specDigest;
            return this;
        }
        @CustomType.Setter
        public Builder status(@Nullable String status) {

            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder suspendedOn(@Nullable String suspendedOn) {

            this.suspendedOn = suspendedOn;
            return this;
        }
        @CustomType.Setter
        public Builder targetInstances(@Nullable Integer targetInstances) {

            this.targetInstances = targetInstances;
            return this;
        }
        @CustomType.Setter
        public Builder updatedOn(@Nullable String updatedOn) {

            this.updatedOn = updatedOn;
            return this;
        }
        public ServiceDescribeOutput build() {
            final var _resultValue = new ServiceDescribeOutput();
            _resultValue.autoResume = autoResume;
            _resultValue.autoSuspendSecs = autoSuspendSecs;
            _resultValue.comment = comment;
            _resultValue.computePool = computePool;
            _resultValue.createdOn = createdOn;
            _resultValue.currentInstances = currentInstances;
            _resultValue.databaseName = databaseName;
            _resultValue.dnsName = dnsName;
            _resultValue.externalAccessIntegrations = externalAccessIntegrations;
            _resultValue.isAsyncJob = isAsyncJob;
            _resultValue.isJob = isJob;
            _resultValue.isUpgrading = isUpgrading;
            _resultValue.managingObjectDomain = managingObjectDomain;
            _resultValue.managingObjectName = managingObjectName;
            _resultValue.maxInstances = maxInstances;
            _resultValue.minInstances = minInstances;
            _resultValue.minReadyInstances = minReadyInstances;
            _resultValue.name = name;
            _resultValue.owner = owner;
            _resultValue.ownerRoleType = ownerRoleType;
            _resultValue.queryWarehouse = queryWarehouse;
            _resultValue.resumedOn = resumedOn;
            _resultValue.schemaName = schemaName;
            _resultValue.spec = spec;
            _resultValue.specDigest = specDigest;
            _resultValue.status = status;
            _resultValue.suspendedOn = suspendedOn;
            _resultValue.targetInstances = targetInstances;
            _resultValue.updatedOn = updatedOn;
            return _resultValue;
        }
    }
}
