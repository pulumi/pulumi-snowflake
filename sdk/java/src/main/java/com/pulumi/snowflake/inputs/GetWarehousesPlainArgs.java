// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetWarehousesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWarehousesPlainArgs Empty = new GetWarehousesPlainArgs();

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
     * Runs DESC WAREHOUSE for each warehouse returned by SHOW WAREHOUSES. The output of describe is saved to the description field. By default this value is set to true.
     * 
     */
    @Import(name="withDescribe")
    private @Nullable Boolean withDescribe;

    /**
     * @return Runs DESC WAREHOUSE for each warehouse returned by SHOW WAREHOUSES. The output of describe is saved to the description field. By default this value is set to true.
     * 
     */
    public Optional<Boolean> withDescribe() {
        return Optional.ofNullable(this.withDescribe);
    }

    /**
     * Runs SHOW PARAMETERS FOR WAREHOUSE for each warehouse returned by SHOW WAREHOUSES. The output of describe is saved to the parameters field as a map. By default this value is set to true.
     * 
     */
    @Import(name="withParameters")
    private @Nullable Boolean withParameters;

    /**
     * @return Runs SHOW PARAMETERS FOR WAREHOUSE for each warehouse returned by SHOW WAREHOUSES. The output of describe is saved to the parameters field as a map. By default this value is set to true.
     * 
     */
    public Optional<Boolean> withParameters() {
        return Optional.ofNullable(this.withParameters);
    }

    private GetWarehousesPlainArgs() {}

    private GetWarehousesPlainArgs(GetWarehousesPlainArgs $) {
        this.like = $.like;
        this.withDescribe = $.withDescribe;
        this.withParameters = $.withParameters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWarehousesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWarehousesPlainArgs $;

        public Builder() {
            $ = new GetWarehousesPlainArgs();
        }

        public Builder(GetWarehousesPlainArgs defaults) {
            $ = new GetWarehousesPlainArgs(Objects.requireNonNull(defaults));
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
         * @param withDescribe Runs DESC WAREHOUSE for each warehouse returned by SHOW WAREHOUSES. The output of describe is saved to the description field. By default this value is set to true.
         * 
         * @return builder
         * 
         */
        public Builder withDescribe(@Nullable Boolean withDescribe) {
            $.withDescribe = withDescribe;
            return this;
        }

        /**
         * @param withParameters Runs SHOW PARAMETERS FOR WAREHOUSE for each warehouse returned by SHOW WAREHOUSES. The output of describe is saved to the parameters field as a map. By default this value is set to true.
         * 
         * @return builder
         * 
         */
        public Builder withParameters(@Nullable Boolean withParameters) {
            $.withParameters = withParameters;
            return this;
        }

        public GetWarehousesPlainArgs build() {
            return $;
        }
    }

}