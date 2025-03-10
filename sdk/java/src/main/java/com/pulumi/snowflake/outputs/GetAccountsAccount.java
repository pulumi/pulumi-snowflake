// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.snowflake.outputs.GetAccountsAccountShowOutput;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetAccountsAccount {
    /**
     * @return Holds the output of SHOW ACCOUNTS.
     * 
     */
    private List<GetAccountsAccountShowOutput> showOutputs;

    private GetAccountsAccount() {}
    /**
     * @return Holds the output of SHOW ACCOUNTS.
     * 
     */
    public List<GetAccountsAccountShowOutput> showOutputs() {
        return this.showOutputs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccountsAccount defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetAccountsAccountShowOutput> showOutputs;
        public Builder() {}
        public Builder(GetAccountsAccount defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.showOutputs = defaults.showOutputs;
        }

        @CustomType.Setter
        public Builder showOutputs(List<GetAccountsAccountShowOutput> showOutputs) {
            if (showOutputs == null) {
              throw new MissingRequiredPropertyException("GetAccountsAccount", "showOutputs");
            }
            this.showOutputs = showOutputs;
            return this;
        }
        public Builder showOutputs(GetAccountsAccountShowOutput... showOutputs) {
            return showOutputs(List.of(showOutputs));
        }
        public GetAccountsAccount build() {
            final var _resultValue = new GetAccountsAccount();
            _resultValue.showOutputs = showOutputs;
            return _resultValue;
        }
    }
}
