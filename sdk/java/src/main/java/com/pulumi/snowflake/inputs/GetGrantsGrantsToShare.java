// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetGrantsGrantsToShare extends com.pulumi.resources.InvokeArgs {

    public static final GetGrantsGrantsToShare Empty = new GetGrantsGrantsToShare();

    /**
     * Lists all of the privileges and roles granted to the specified share.
     * 
     */
    @Import(name="shareName", required=true)
    private String shareName;

    /**
     * @return Lists all of the privileges and roles granted to the specified share.
     * 
     */
    public String shareName() {
        return this.shareName;
    }

    private GetGrantsGrantsToShare() {}

    private GetGrantsGrantsToShare(GetGrantsGrantsToShare $) {
        this.shareName = $.shareName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGrantsGrantsToShare defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGrantsGrantsToShare $;

        public Builder() {
            $ = new GetGrantsGrantsToShare();
        }

        public Builder(GetGrantsGrantsToShare defaults) {
            $ = new GetGrantsGrantsToShare(Objects.requireNonNull(defaults));
        }

        /**
         * @param shareName Lists all of the privileges and roles granted to the specified share.
         * 
         * @return builder
         * 
         */
        public Builder shareName(String shareName) {
            $.shareName = shareName;
            return this;
        }

        public GetGrantsGrantsToShare build() {
            if ($.shareName == null) {
                throw new MissingRequiredPropertyException("GetGrantsGrantsToShare", "shareName");
            }
            return $;
        }
    }

}
