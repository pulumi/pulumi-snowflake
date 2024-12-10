// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetConnectionsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetConnectionsArgs Empty = new GetConnectionsArgs();

    /**
     * Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
     * 
     */
    @Import(name="like")
    private @Nullable Output<String> like;

    /**
     * @return Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
     * 
     */
    public Optional<Output<String>> like() {
        return Optional.ofNullable(this.like);
    }

    private GetConnectionsArgs() {}

    private GetConnectionsArgs(GetConnectionsArgs $) {
        this.like = $.like;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetConnectionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetConnectionsArgs $;

        public Builder() {
            $ = new GetConnectionsArgs();
        }

        public Builder(GetConnectionsArgs defaults) {
            $ = new GetConnectionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param like Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
         * 
         * @return builder
         * 
         */
        public Builder like(@Nullable Output<String> like) {
            $.like = like;
            return this;
        }

        /**
         * @param like Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
         * 
         * @return builder
         * 
         */
        public Builder like(String like) {
            return like(Output.of(like));
        }

        public GetConnectionsArgs build() {
            return $;
        }
    }

}