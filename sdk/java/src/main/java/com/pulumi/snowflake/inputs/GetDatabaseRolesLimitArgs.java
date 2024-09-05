// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDatabaseRolesLimitArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetDatabaseRolesLimitArgs Empty = new GetDatabaseRolesLimitArgs();

    /**
     * Specifies a **case-sensitive** pattern that is used to match object name. After the first match, the limit on the number of rows will be applied.
     * 
     */
    @Import(name="from")
    private @Nullable Output<String> from;

    /**
     * @return Specifies a **case-sensitive** pattern that is used to match object name. After the first match, the limit on the number of rows will be applied.
     * 
     */
    public Optional<Output<String>> from() {
        return Optional.ofNullable(this.from);
    }

    /**
     * The maximum number of rows to return.
     * 
     */
    @Import(name="rows", required=true)
    private Output<Integer> rows;

    /**
     * @return The maximum number of rows to return.
     * 
     */
    public Output<Integer> rows() {
        return this.rows;
    }

    private GetDatabaseRolesLimitArgs() {}

    private GetDatabaseRolesLimitArgs(GetDatabaseRolesLimitArgs $) {
        this.from = $.from;
        this.rows = $.rows;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDatabaseRolesLimitArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDatabaseRolesLimitArgs $;

        public Builder() {
            $ = new GetDatabaseRolesLimitArgs();
        }

        public Builder(GetDatabaseRolesLimitArgs defaults) {
            $ = new GetDatabaseRolesLimitArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param from Specifies a **case-sensitive** pattern that is used to match object name. After the first match, the limit on the number of rows will be applied.
         * 
         * @return builder
         * 
         */
        public Builder from(@Nullable Output<String> from) {
            $.from = from;
            return this;
        }

        /**
         * @param from Specifies a **case-sensitive** pattern that is used to match object name. After the first match, the limit on the number of rows will be applied.
         * 
         * @return builder
         * 
         */
        public Builder from(String from) {
            return from(Output.of(from));
        }

        /**
         * @param rows The maximum number of rows to return.
         * 
         * @return builder
         * 
         */
        public Builder rows(Output<Integer> rows) {
            $.rows = rows;
            return this;
        }

        /**
         * @param rows The maximum number of rows to return.
         * 
         * @return builder
         * 
         */
        public Builder rows(Integer rows) {
            return rows(Output.of(rows));
        }

        public GetDatabaseRolesLimitArgs build() {
            if ($.rows == null) {
                throw new MissingRequiredPropertyException("GetDatabaseRolesLimitArgs", "rows");
            }
            return $;
        }
    }

}
