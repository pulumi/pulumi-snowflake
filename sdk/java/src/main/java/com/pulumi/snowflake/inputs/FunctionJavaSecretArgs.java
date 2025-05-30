// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class FunctionJavaSecretArgs extends com.pulumi.resources.ResourceArgs {

    public static final FunctionJavaSecretArgs Empty = new FunctionJavaSecretArgs();

    /**
     * Fully qualified name of the allowed [secret](https://docs.snowflake.com/en/sql-reference/sql/create-secret). You will receive an error if you specify a SECRETS value whose secret isn’t also included in an integration specified by the EXTERNAL*ACCESS*INTEGRATIONS parameter.
     * 
     */
    @Import(name="secretId", required=true)
    private Output<String> secretId;

    /**
     * @return Fully qualified name of the allowed [secret](https://docs.snowflake.com/en/sql-reference/sql/create-secret). You will receive an error if you specify a SECRETS value whose secret isn’t also included in an integration specified by the EXTERNAL*ACCESS*INTEGRATIONS parameter.
     * 
     */
    public Output<String> secretId() {
        return this.secretId;
    }

    /**
     * The variable that will be used in handler code when retrieving information from the secret.
     * 
     */
    @Import(name="secretVariableName", required=true)
    private Output<String> secretVariableName;

    /**
     * @return The variable that will be used in handler code when retrieving information from the secret.
     * 
     */
    public Output<String> secretVariableName() {
        return this.secretVariableName;
    }

    private FunctionJavaSecretArgs() {}

    private FunctionJavaSecretArgs(FunctionJavaSecretArgs $) {
        this.secretId = $.secretId;
        this.secretVariableName = $.secretVariableName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FunctionJavaSecretArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FunctionJavaSecretArgs $;

        public Builder() {
            $ = new FunctionJavaSecretArgs();
        }

        public Builder(FunctionJavaSecretArgs defaults) {
            $ = new FunctionJavaSecretArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param secretId Fully qualified name of the allowed [secret](https://docs.snowflake.com/en/sql-reference/sql/create-secret). You will receive an error if you specify a SECRETS value whose secret isn’t also included in an integration specified by the EXTERNAL*ACCESS*INTEGRATIONS parameter.
         * 
         * @return builder
         * 
         */
        public Builder secretId(Output<String> secretId) {
            $.secretId = secretId;
            return this;
        }

        /**
         * @param secretId Fully qualified name of the allowed [secret](https://docs.snowflake.com/en/sql-reference/sql/create-secret). You will receive an error if you specify a SECRETS value whose secret isn’t also included in an integration specified by the EXTERNAL*ACCESS*INTEGRATIONS parameter.
         * 
         * @return builder
         * 
         */
        public Builder secretId(String secretId) {
            return secretId(Output.of(secretId));
        }

        /**
         * @param secretVariableName The variable that will be used in handler code when retrieving information from the secret.
         * 
         * @return builder
         * 
         */
        public Builder secretVariableName(Output<String> secretVariableName) {
            $.secretVariableName = secretVariableName;
            return this;
        }

        /**
         * @param secretVariableName The variable that will be used in handler code when retrieving information from the secret.
         * 
         * @return builder
         * 
         */
        public Builder secretVariableName(String secretVariableName) {
            return secretVariableName(Output.of(secretVariableName));
        }

        public FunctionJavaSecretArgs build() {
            if ($.secretId == null) {
                throw new MissingRequiredPropertyException("FunctionJavaSecretArgs", "secretId");
            }
            if ($.secretVariableName == null) {
                throw new MissingRequiredPropertyException("FunctionJavaSecretArgs", "secretVariableName");
            }
            return $;
        }
    }

}
