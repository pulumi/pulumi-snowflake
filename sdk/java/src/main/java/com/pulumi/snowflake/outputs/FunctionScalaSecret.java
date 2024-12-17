// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class FunctionScalaSecret {
    /**
     * @return Fully qualified name of the allowed [secret](https://docs.snowflake.com/en/sql-reference/sql/create-secret). You will receive an error if you specify a SECRETS value whose secret isn’t also included in an integration specified by the EXTERNAL*ACCESS*INTEGRATIONS parameter.
     * 
     */
    private String secretId;
    /**
     * @return The variable that will be used in handler code when retrieving information from the secret.
     * 
     */
    private String secretVariableName;

    private FunctionScalaSecret() {}
    /**
     * @return Fully qualified name of the allowed [secret](https://docs.snowflake.com/en/sql-reference/sql/create-secret). You will receive an error if you specify a SECRETS value whose secret isn’t also included in an integration specified by the EXTERNAL*ACCESS*INTEGRATIONS parameter.
     * 
     */
    public String secretId() {
        return this.secretId;
    }
    /**
     * @return The variable that will be used in handler code when retrieving information from the secret.
     * 
     */
    public String secretVariableName() {
        return this.secretVariableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FunctionScalaSecret defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String secretId;
        private String secretVariableName;
        public Builder() {}
        public Builder(FunctionScalaSecret defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.secretId = defaults.secretId;
    	      this.secretVariableName = defaults.secretVariableName;
        }

        @CustomType.Setter
        public Builder secretId(String secretId) {
            if (secretId == null) {
              throw new MissingRequiredPropertyException("FunctionScalaSecret", "secretId");
            }
            this.secretId = secretId;
            return this;
        }
        @CustomType.Setter
        public Builder secretVariableName(String secretVariableName) {
            if (secretVariableName == null) {
              throw new MissingRequiredPropertyException("FunctionScalaSecret", "secretVariableName");
            }
            this.secretVariableName = secretVariableName;
            return this;
        }
        public FunctionScalaSecret build() {
            final var _resultValue = new FunctionScalaSecret();
            _resultValue.secretId = secretId;
            _resultValue.secretVariableName = secretVariableName;
            return _resultValue;
        }
    }
}
