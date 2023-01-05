// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRolesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRolesArgs Empty = new GetRolesArgs();

    /**
     * Filters the command output by object name.
     * 
     */
    @Import(name="pattern")
    private @Nullable Output<String> pattern;

    /**
     * @return Filters the command output by object name.
     * 
     */
    public Optional<Output<String>> pattern() {
        return Optional.ofNullable(this.pattern);
    }

    private GetRolesArgs() {}

    private GetRolesArgs(GetRolesArgs $) {
        this.pattern = $.pattern;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRolesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRolesArgs $;

        public Builder() {
            $ = new GetRolesArgs();
        }

        public Builder(GetRolesArgs defaults) {
            $ = new GetRolesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param pattern Filters the command output by object name.
         * 
         * @return builder
         * 
         */
        public Builder pattern(@Nullable Output<String> pattern) {
            $.pattern = pattern;
            return this;
        }

        /**
         * @param pattern Filters the command output by object name.
         * 
         * @return builder
         * 
         */
        public Builder pattern(String pattern) {
            return pattern(Output.of(pattern));
        }

        public GetRolesArgs build() {
            return $;
        }
    }

}
