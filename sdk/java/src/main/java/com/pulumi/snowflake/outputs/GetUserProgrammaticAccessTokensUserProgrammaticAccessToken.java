// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.snowflake.outputs.GetUserProgrammaticAccessTokensUserProgrammaticAccessTokenShowOutput;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetUserProgrammaticAccessTokensUserProgrammaticAccessToken {
    /**
     * @return Holds the output of SHOW USER PROGRAMMATIC ACCESS TOKENS.
     * 
     */
    private List<GetUserProgrammaticAccessTokensUserProgrammaticAccessTokenShowOutput> showOutputs;

    private GetUserProgrammaticAccessTokensUserProgrammaticAccessToken() {}
    /**
     * @return Holds the output of SHOW USER PROGRAMMATIC ACCESS TOKENS.
     * 
     */
    public List<GetUserProgrammaticAccessTokensUserProgrammaticAccessTokenShowOutput> showOutputs() {
        return this.showOutputs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUserProgrammaticAccessTokensUserProgrammaticAccessToken defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetUserProgrammaticAccessTokensUserProgrammaticAccessTokenShowOutput> showOutputs;
        public Builder() {}
        public Builder(GetUserProgrammaticAccessTokensUserProgrammaticAccessToken defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.showOutputs = defaults.showOutputs;
        }

        @CustomType.Setter
        public Builder showOutputs(List<GetUserProgrammaticAccessTokensUserProgrammaticAccessTokenShowOutput> showOutputs) {
            if (showOutputs == null) {
              throw new MissingRequiredPropertyException("GetUserProgrammaticAccessTokensUserProgrammaticAccessToken", "showOutputs");
            }
            this.showOutputs = showOutputs;
            return this;
        }
        public Builder showOutputs(GetUserProgrammaticAccessTokensUserProgrammaticAccessTokenShowOutput... showOutputs) {
            return showOutputs(List.of(showOutputs));
        }
        public GetUserProgrammaticAccessTokensUserProgrammaticAccessToken build() {
            final var _resultValue = new GetUserProgrammaticAccessTokensUserProgrammaticAccessToken();
            _resultValue.showOutputs = showOutputs;
            return _resultValue;
        }
    }
}
