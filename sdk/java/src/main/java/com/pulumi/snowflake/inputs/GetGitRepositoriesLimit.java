// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGitRepositoriesLimit extends com.pulumi.resources.InvokeArgs {

    public static final GetGitRepositoriesLimit Empty = new GetGitRepositoriesLimit();

    /**
     * Specifies a **case-sensitive** pattern that is used to match object name. After the first match, the limit on the number of rows will be applied.
     * 
     */
    @Import(name="from")
    private @Nullable String from;

    /**
     * @return Specifies a **case-sensitive** pattern that is used to match object name. After the first match, the limit on the number of rows will be applied.
     * 
     */
    public Optional<String> from() {
        return Optional.ofNullable(this.from);
    }

    /**
     * The maximum number of rows to return.
     * 
     */
    @Import(name="rows", required=true)
    private Integer rows;

    /**
     * @return The maximum number of rows to return.
     * 
     */
    public Integer rows() {
        return this.rows;
    }

    private GetGitRepositoriesLimit() {}

    private GetGitRepositoriesLimit(GetGitRepositoriesLimit $) {
        this.from = $.from;
        this.rows = $.rows;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGitRepositoriesLimit defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGitRepositoriesLimit $;

        public Builder() {
            $ = new GetGitRepositoriesLimit();
        }

        public Builder(GetGitRepositoriesLimit defaults) {
            $ = new GetGitRepositoriesLimit(Objects.requireNonNull(defaults));
        }

        /**
         * @param from Specifies a **case-sensitive** pattern that is used to match object name. After the first match, the limit on the number of rows will be applied.
         * 
         * @return builder
         * 
         */
        public Builder from(@Nullable String from) {
            $.from = from;
            return this;
        }

        /**
         * @param rows The maximum number of rows to return.
         * 
         * @return builder
         * 
         */
        public Builder rows(Integer rows) {
            $.rows = rows;
            return this;
        }

        public GetGitRepositoriesLimit build() {
            if ($.rows == null) {
                throw new MissingRequiredPropertyException("GetGitRepositoriesLimit", "rows");
            }
            return $;
        }
    }

}
