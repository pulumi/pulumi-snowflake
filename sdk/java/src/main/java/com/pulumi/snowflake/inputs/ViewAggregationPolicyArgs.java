// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ViewAggregationPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ViewAggregationPolicyArgs Empty = new ViewAggregationPolicyArgs();

    /**
     * Defines which columns uniquely identify an entity within the view.
     * 
     */
    @Import(name="entityKeys")
    private @Nullable Output<List<String>> entityKeys;

    /**
     * @return Defines which columns uniquely identify an entity within the view.
     * 
     */
    public Optional<Output<List<String>>> entityKeys() {
        return Optional.ofNullable(this.entityKeys);
    }

    /**
     * Aggregation policy name.
     * 
     */
    @Import(name="policyName", required=true)
    private Output<String> policyName;

    /**
     * @return Aggregation policy name.
     * 
     */
    public Output<String> policyName() {
        return this.policyName;
    }

    private ViewAggregationPolicyArgs() {}

    private ViewAggregationPolicyArgs(ViewAggregationPolicyArgs $) {
        this.entityKeys = $.entityKeys;
        this.policyName = $.policyName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ViewAggregationPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ViewAggregationPolicyArgs $;

        public Builder() {
            $ = new ViewAggregationPolicyArgs();
        }

        public Builder(ViewAggregationPolicyArgs defaults) {
            $ = new ViewAggregationPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param entityKeys Defines which columns uniquely identify an entity within the view.
         * 
         * @return builder
         * 
         */
        public Builder entityKeys(@Nullable Output<List<String>> entityKeys) {
            $.entityKeys = entityKeys;
            return this;
        }

        /**
         * @param entityKeys Defines which columns uniquely identify an entity within the view.
         * 
         * @return builder
         * 
         */
        public Builder entityKeys(List<String> entityKeys) {
            return entityKeys(Output.of(entityKeys));
        }

        /**
         * @param entityKeys Defines which columns uniquely identify an entity within the view.
         * 
         * @return builder
         * 
         */
        public Builder entityKeys(String... entityKeys) {
            return entityKeys(List.of(entityKeys));
        }

        /**
         * @param policyName Aggregation policy name.
         * 
         * @return builder
         * 
         */
        public Builder policyName(Output<String> policyName) {
            $.policyName = policyName;
            return this;
        }

        /**
         * @param policyName Aggregation policy name.
         * 
         * @return builder
         * 
         */
        public Builder policyName(String policyName) {
            return policyName(Output.of(policyName));
        }

        public ViewAggregationPolicyArgs build() {
            if ($.policyName == null) {
                throw new MissingRequiredPropertyException("ViewAggregationPolicyArgs", "policyName");
            }
            return $;
        }
    }

}
