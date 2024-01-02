// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StorageIntegrationArgs extends com.pulumi.resources.ResourceArgs {

    public static final StorageIntegrationArgs Empty = new StorageIntegrationArgs();

    @Import(name="azureTenantId")
    private @Nullable Output<String> azureTenantId;

    public Optional<Output<String>> azureTenantId() {
        return Optional.ofNullable(this.azureTenantId);
    }

    @Import(name="comment")
    private @Nullable Output<String> comment;

    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Explicitly limits external stages that use the integration to reference one or more storage locations.
     * 
     */
    @Import(name="storageAllowedLocations", required=true)
    private Output<List<String>> storageAllowedLocations;

    /**
     * @return Explicitly limits external stages that use the integration to reference one or more storage locations.
     * 
     */
    public Output<List<String>> storageAllowedLocations() {
        return this.storageAllowedLocations;
    }

    /**
     * &#34;bucket-owner-full-control&#34; Enables support for AWS access control lists (ACLs) to grant the bucket owner full control.
     * 
     */
    @Import(name="storageAwsObjectAcl")
    private @Nullable Output<String> storageAwsObjectAcl;

    /**
     * @return &#34;bucket-owner-full-control&#34; Enables support for AWS access control lists (ACLs) to grant the bucket owner full control.
     * 
     */
    public Optional<Output<String>> storageAwsObjectAcl() {
        return Optional.ofNullable(this.storageAwsObjectAcl);
    }

    @Import(name="storageAwsRoleArn")
    private @Nullable Output<String> storageAwsRoleArn;

    public Optional<Output<String>> storageAwsRoleArn() {
        return Optional.ofNullable(this.storageAwsRoleArn);
    }

    /**
     * Explicitly prohibits external stages that use the integration from referencing one or more storage locations.
     * 
     */
    @Import(name="storageBlockedLocations")
    private @Nullable Output<List<String>> storageBlockedLocations;

    /**
     * @return Explicitly prohibits external stages that use the integration from referencing one or more storage locations.
     * 
     */
    public Optional<Output<List<String>>> storageBlockedLocations() {
        return Optional.ofNullable(this.storageBlockedLocations);
    }

    @Import(name="storageProvider", required=true)
    private Output<String> storageProvider;

    public Output<String> storageProvider() {
        return this.storageProvider;
    }

    @Import(name="type")
    private @Nullable Output<String> type;

    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private StorageIntegrationArgs() {}

    private StorageIntegrationArgs(StorageIntegrationArgs $) {
        this.azureTenantId = $.azureTenantId;
        this.comment = $.comment;
        this.enabled = $.enabled;
        this.name = $.name;
        this.storageAllowedLocations = $.storageAllowedLocations;
        this.storageAwsObjectAcl = $.storageAwsObjectAcl;
        this.storageAwsRoleArn = $.storageAwsRoleArn;
        this.storageBlockedLocations = $.storageBlockedLocations;
        this.storageProvider = $.storageProvider;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StorageIntegrationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StorageIntegrationArgs $;

        public Builder() {
            $ = new StorageIntegrationArgs();
        }

        public Builder(StorageIntegrationArgs defaults) {
            $ = new StorageIntegrationArgs(Objects.requireNonNull(defaults));
        }

        public Builder azureTenantId(@Nullable Output<String> azureTenantId) {
            $.azureTenantId = azureTenantId;
            return this;
        }

        public Builder azureTenantId(String azureTenantId) {
            return azureTenantId(Output.of(azureTenantId));
        }

        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param storageAllowedLocations Explicitly limits external stages that use the integration to reference one or more storage locations.
         * 
         * @return builder
         * 
         */
        public Builder storageAllowedLocations(Output<List<String>> storageAllowedLocations) {
            $.storageAllowedLocations = storageAllowedLocations;
            return this;
        }

        /**
         * @param storageAllowedLocations Explicitly limits external stages that use the integration to reference one or more storage locations.
         * 
         * @return builder
         * 
         */
        public Builder storageAllowedLocations(List<String> storageAllowedLocations) {
            return storageAllowedLocations(Output.of(storageAllowedLocations));
        }

        /**
         * @param storageAllowedLocations Explicitly limits external stages that use the integration to reference one or more storage locations.
         * 
         * @return builder
         * 
         */
        public Builder storageAllowedLocations(String... storageAllowedLocations) {
            return storageAllowedLocations(List.of(storageAllowedLocations));
        }

        /**
         * @param storageAwsObjectAcl &#34;bucket-owner-full-control&#34; Enables support for AWS access control lists (ACLs) to grant the bucket owner full control.
         * 
         * @return builder
         * 
         */
        public Builder storageAwsObjectAcl(@Nullable Output<String> storageAwsObjectAcl) {
            $.storageAwsObjectAcl = storageAwsObjectAcl;
            return this;
        }

        /**
         * @param storageAwsObjectAcl &#34;bucket-owner-full-control&#34; Enables support for AWS access control lists (ACLs) to grant the bucket owner full control.
         * 
         * @return builder
         * 
         */
        public Builder storageAwsObjectAcl(String storageAwsObjectAcl) {
            return storageAwsObjectAcl(Output.of(storageAwsObjectAcl));
        }

        public Builder storageAwsRoleArn(@Nullable Output<String> storageAwsRoleArn) {
            $.storageAwsRoleArn = storageAwsRoleArn;
            return this;
        }

        public Builder storageAwsRoleArn(String storageAwsRoleArn) {
            return storageAwsRoleArn(Output.of(storageAwsRoleArn));
        }

        /**
         * @param storageBlockedLocations Explicitly prohibits external stages that use the integration from referencing one or more storage locations.
         * 
         * @return builder
         * 
         */
        public Builder storageBlockedLocations(@Nullable Output<List<String>> storageBlockedLocations) {
            $.storageBlockedLocations = storageBlockedLocations;
            return this;
        }

        /**
         * @param storageBlockedLocations Explicitly prohibits external stages that use the integration from referencing one or more storage locations.
         * 
         * @return builder
         * 
         */
        public Builder storageBlockedLocations(List<String> storageBlockedLocations) {
            return storageBlockedLocations(Output.of(storageBlockedLocations));
        }

        /**
         * @param storageBlockedLocations Explicitly prohibits external stages that use the integration from referencing one or more storage locations.
         * 
         * @return builder
         * 
         */
        public Builder storageBlockedLocations(String... storageBlockedLocations) {
            return storageBlockedLocations(List.of(storageBlockedLocations));
        }

        public Builder storageProvider(Output<String> storageProvider) {
            $.storageProvider = storageProvider;
            return this;
        }

        public Builder storageProvider(String storageProvider) {
            return storageProvider(Output.of(storageProvider));
        }

        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public StorageIntegrationArgs build() {
            if ($.storageAllowedLocations == null) {
                throw new MissingRequiredPropertyException("StorageIntegrationArgs", "storageAllowedLocations");
            }
            if ($.storageProvider == null) {
                throw new MissingRequiredPropertyException("StorageIntegrationArgs", "storageProvider");
            }
            return $;
        }
    }

}
