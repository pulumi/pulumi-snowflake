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


public final class ViewColumnMaskingPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ViewColumnMaskingPolicyArgs Empty = new ViewColumnMaskingPolicyArgs();

    /**
     * Specifies the masking policy to set on a column. For more information about this resource, see docs.
     * 
     */
    @Import(name="policyName", required=true)
    private Output<String> policyName;

    /**
     * @return Specifies the masking policy to set on a column. For more information about this resource, see docs.
     * 
     */
    public Output<String> policyName() {
        return this.policyName;
    }

    /**
     * Specifies the arguments to pass into the conditional masking policy SQL expression. The first column in the list specifies the column for the policy conditions to mask or tokenize the data and must match the column to which the masking policy is set. The additional columns specify the columns to evaluate to determine whether to mask or tokenize the data in each row of the query result when a query is made on the first column. If the USING clause is omitted, Snowflake treats the conditional masking policy as a normal masking policy.
     * 
     */
    @Import(name="usings")
    private @Nullable Output<List<String>> usings;

    /**
     * @return Specifies the arguments to pass into the conditional masking policy SQL expression. The first column in the list specifies the column for the policy conditions to mask or tokenize the data and must match the column to which the masking policy is set. The additional columns specify the columns to evaluate to determine whether to mask or tokenize the data in each row of the query result when a query is made on the first column. If the USING clause is omitted, Snowflake treats the conditional masking policy as a normal masking policy.
     * 
     */
    public Optional<Output<List<String>>> usings() {
        return Optional.ofNullable(this.usings);
    }

    private ViewColumnMaskingPolicyArgs() {}

    private ViewColumnMaskingPolicyArgs(ViewColumnMaskingPolicyArgs $) {
        this.policyName = $.policyName;
        this.usings = $.usings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ViewColumnMaskingPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ViewColumnMaskingPolicyArgs $;

        public Builder() {
            $ = new ViewColumnMaskingPolicyArgs();
        }

        public Builder(ViewColumnMaskingPolicyArgs defaults) {
            $ = new ViewColumnMaskingPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param policyName Specifies the masking policy to set on a column. For more information about this resource, see docs.
         * 
         * @return builder
         * 
         */
        public Builder policyName(Output<String> policyName) {
            $.policyName = policyName;
            return this;
        }

        /**
         * @param policyName Specifies the masking policy to set on a column. For more information about this resource, see docs.
         * 
         * @return builder
         * 
         */
        public Builder policyName(String policyName) {
            return policyName(Output.of(policyName));
        }

        /**
         * @param usings Specifies the arguments to pass into the conditional masking policy SQL expression. The first column in the list specifies the column for the policy conditions to mask or tokenize the data and must match the column to which the masking policy is set. The additional columns specify the columns to evaluate to determine whether to mask or tokenize the data in each row of the query result when a query is made on the first column. If the USING clause is omitted, Snowflake treats the conditional masking policy as a normal masking policy.
         * 
         * @return builder
         * 
         */
        public Builder usings(@Nullable Output<List<String>> usings) {
            $.usings = usings;
            return this;
        }

        /**
         * @param usings Specifies the arguments to pass into the conditional masking policy SQL expression. The first column in the list specifies the column for the policy conditions to mask or tokenize the data and must match the column to which the masking policy is set. The additional columns specify the columns to evaluate to determine whether to mask or tokenize the data in each row of the query result when a query is made on the first column. If the USING clause is omitted, Snowflake treats the conditional masking policy as a normal masking policy.
         * 
         * @return builder
         * 
         */
        public Builder usings(List<String> usings) {
            return usings(Output.of(usings));
        }

        /**
         * @param usings Specifies the arguments to pass into the conditional masking policy SQL expression. The first column in the list specifies the column for the policy conditions to mask or tokenize the data and must match the column to which the masking policy is set. The additional columns specify the columns to evaluate to determine whether to mask or tokenize the data in each row of the query result when a query is made on the first column. If the USING clause is omitted, Snowflake treats the conditional masking policy as a normal masking policy.
         * 
         * @return builder
         * 
         */
        public Builder usings(String... usings) {
            return usings(List.of(usings));
        }

        public ViewColumnMaskingPolicyArgs build() {
            if ($.policyName == null) {
                throw new MissingRequiredPropertyException("ViewColumnMaskingPolicyArgs", "policyName");
            }
            return $;
        }
    }

}
