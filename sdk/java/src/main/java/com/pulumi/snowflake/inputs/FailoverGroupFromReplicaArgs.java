// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class FailoverGroupFromReplicaArgs extends com.pulumi.resources.ResourceArgs {

    public static final FailoverGroupFromReplicaArgs Empty = new FailoverGroupFromReplicaArgs();

    /**
     * Identifier for the primary failover group in the source account.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Identifier for the primary failover group in the source account.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Name of your Snowflake organization.
     * 
     */
    @Import(name="organizationName", required=true)
    private Output<String> organizationName;

    /**
     * @return Name of your Snowflake organization.
     * 
     */
    public Output<String> organizationName() {
        return this.organizationName;
    }

    /**
     * Source account from which you are enabling replication and failover of the specified objects.
     * 
     */
    @Import(name="sourceAccountName", required=true)
    private Output<String> sourceAccountName;

    /**
     * @return Source account from which you are enabling replication and failover of the specified objects.
     * 
     */
    public Output<String> sourceAccountName() {
        return this.sourceAccountName;
    }

    private FailoverGroupFromReplicaArgs() {}

    private FailoverGroupFromReplicaArgs(FailoverGroupFromReplicaArgs $) {
        this.name = $.name;
        this.organizationName = $.organizationName;
        this.sourceAccountName = $.sourceAccountName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FailoverGroupFromReplicaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FailoverGroupFromReplicaArgs $;

        public Builder() {
            $ = new FailoverGroupFromReplicaArgs();
        }

        public Builder(FailoverGroupFromReplicaArgs defaults) {
            $ = new FailoverGroupFromReplicaArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Identifier for the primary failover group in the source account.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Identifier for the primary failover group in the source account.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param organizationName Name of your Snowflake organization.
         * 
         * @return builder
         * 
         */
        public Builder organizationName(Output<String> organizationName) {
            $.organizationName = organizationName;
            return this;
        }

        /**
         * @param organizationName Name of your Snowflake organization.
         * 
         * @return builder
         * 
         */
        public Builder organizationName(String organizationName) {
            return organizationName(Output.of(organizationName));
        }

        /**
         * @param sourceAccountName Source account from which you are enabling replication and failover of the specified objects.
         * 
         * @return builder
         * 
         */
        public Builder sourceAccountName(Output<String> sourceAccountName) {
            $.sourceAccountName = sourceAccountName;
            return this;
        }

        /**
         * @param sourceAccountName Source account from which you are enabling replication and failover of the specified objects.
         * 
         * @return builder
         * 
         */
        public Builder sourceAccountName(String sourceAccountName) {
            return sourceAccountName(Output.of(sourceAccountName));
        }

        public FailoverGroupFromReplicaArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("FailoverGroupFromReplicaArgs", "name");
            }
            if ($.organizationName == null) {
                throw new MissingRequiredPropertyException("FailoverGroupFromReplicaArgs", "organizationName");
            }
            if ($.sourceAccountName == null) {
                throw new MissingRequiredPropertyException("FailoverGroupFromReplicaArgs", "sourceAccountName");
            }
            return $;
        }
    }

}
