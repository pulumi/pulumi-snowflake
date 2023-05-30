// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetFailoverGroupsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFailoverGroupsPlainArgs Empty = new GetFailoverGroupsPlainArgs();

    /**
     * Specifies the identifier for the account
     * 
     */
    @Import(name="inAccount")
    private @Nullable String inAccount;

    /**
     * @return Specifies the identifier for the account
     * 
     */
    public Optional<String> inAccount() {
        return Optional.ofNullable(this.inAccount);
    }

    private GetFailoverGroupsPlainArgs() {}

    private GetFailoverGroupsPlainArgs(GetFailoverGroupsPlainArgs $) {
        this.inAccount = $.inAccount;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFailoverGroupsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFailoverGroupsPlainArgs $;

        public Builder() {
            $ = new GetFailoverGroupsPlainArgs();
        }

        public Builder(GetFailoverGroupsPlainArgs defaults) {
            $ = new GetFailoverGroupsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param inAccount Specifies the identifier for the account
         * 
         * @return builder
         * 
         */
        public Builder inAccount(@Nullable String inAccount) {
            $.inAccount = inAccount;
            return this;
        }

        public GetFailoverGroupsPlainArgs build() {
            return $;
        }
    }

}
