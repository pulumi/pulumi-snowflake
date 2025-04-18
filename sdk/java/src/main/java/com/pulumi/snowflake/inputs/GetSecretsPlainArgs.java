// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.snowflake.inputs.GetSecretsIn;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSecretsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSecretsPlainArgs Empty = new GetSecretsPlainArgs();

    /**
     * IN clause to filter the list of secrets
     * 
     */
    @Import(name="in")
    private @Nullable GetSecretsIn in;

    /**
     * @return IN clause to filter the list of secrets
     * 
     */
    public Optional<GetSecretsIn> in() {
        return Optional.ofNullable(this.in);
    }

    /**
     * Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
     * 
     */
    @Import(name="like")
    private @Nullable String like;

    /**
     * @return Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
     * 
     */
    public Optional<String> like() {
        return Optional.ofNullable(this.like);
    }

    /**
     * (Default: `true`) Runs DESC SECRET for each secret returned by SHOW SECRETS. The output of describe is saved to the description field. By default this value is set to true.
     * 
     */
    @Import(name="withDescribe")
    private @Nullable Boolean withDescribe;

    /**
     * @return (Default: `true`) Runs DESC SECRET for each secret returned by SHOW SECRETS. The output of describe is saved to the description field. By default this value is set to true.
     * 
     */
    public Optional<Boolean> withDescribe() {
        return Optional.ofNullable(this.withDescribe);
    }

    private GetSecretsPlainArgs() {}

    private GetSecretsPlainArgs(GetSecretsPlainArgs $) {
        this.in = $.in;
        this.like = $.like;
        this.withDescribe = $.withDescribe;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSecretsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSecretsPlainArgs $;

        public Builder() {
            $ = new GetSecretsPlainArgs();
        }

        public Builder(GetSecretsPlainArgs defaults) {
            $ = new GetSecretsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param in IN clause to filter the list of secrets
         * 
         * @return builder
         * 
         */
        public Builder in(@Nullable GetSecretsIn in) {
            $.in = in;
            return this;
        }

        /**
         * @param like Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
         * 
         * @return builder
         * 
         */
        public Builder like(@Nullable String like) {
            $.like = like;
            return this;
        }

        /**
         * @param withDescribe (Default: `true`) Runs DESC SECRET for each secret returned by SHOW SECRETS. The output of describe is saved to the description field. By default this value is set to true.
         * 
         * @return builder
         * 
         */
        public Builder withDescribe(@Nullable Boolean withDescribe) {
            $.withDescribe = withDescribe;
            return this;
        }

        public GetSecretsPlainArgs build() {
            return $;
        }
    }

}
