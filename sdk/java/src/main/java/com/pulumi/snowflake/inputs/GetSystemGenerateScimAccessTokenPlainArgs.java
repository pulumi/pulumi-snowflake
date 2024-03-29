// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetSystemGenerateScimAccessTokenPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSystemGenerateScimAccessTokenPlainArgs Empty = new GetSystemGenerateScimAccessTokenPlainArgs();

    /**
     * SCIM Integration Name
     * 
     */
    @Import(name="integrationName", required=true)
    private String integrationName;

    /**
     * @return SCIM Integration Name
     * 
     */
    public String integrationName() {
        return this.integrationName;
    }

    private GetSystemGenerateScimAccessTokenPlainArgs() {}

    private GetSystemGenerateScimAccessTokenPlainArgs(GetSystemGenerateScimAccessTokenPlainArgs $) {
        this.integrationName = $.integrationName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSystemGenerateScimAccessTokenPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSystemGenerateScimAccessTokenPlainArgs $;

        public Builder() {
            $ = new GetSystemGenerateScimAccessTokenPlainArgs();
        }

        public Builder(GetSystemGenerateScimAccessTokenPlainArgs defaults) {
            $ = new GetSystemGenerateScimAccessTokenPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param integrationName SCIM Integration Name
         * 
         * @return builder
         * 
         */
        public Builder integrationName(String integrationName) {
            $.integrationName = integrationName;
            return this;
        }

        public GetSystemGenerateScimAccessTokenPlainArgs build() {
            if ($.integrationName == null) {
                throw new MissingRequiredPropertyException("GetSystemGenerateScimAccessTokenPlainArgs", "integrationName");
            }
            return $;
        }
    }

}
