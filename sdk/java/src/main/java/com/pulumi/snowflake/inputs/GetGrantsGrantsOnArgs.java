// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGrantsGrantsOnArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetGrantsGrantsOnArgs Empty = new GetGrantsGrantsOnArgs();

    /**
     * Object hierarchy to list privileges on. The only valid value is: ACCOUNT. Setting this attribute lists all the account-level (i.e. global) privileges that have been granted to roles.
     * 
     */
    @Import(name="account")
    private @Nullable Output<Boolean> account;

    /**
     * @return Object hierarchy to list privileges on. The only valid value is: ACCOUNT. Setting this attribute lists all the account-level (i.e. global) privileges that have been granted to roles.
     * 
     */
    public Optional<Output<Boolean>> account() {
        return Optional.ofNullable(this.account);
    }

    /**
     * Name of object to list privileges on.
     * 
     */
    @Import(name="objectName")
    private @Nullable Output<String> objectName;

    /**
     * @return Name of object to list privileges on.
     * 
     */
    public Optional<Output<String>> objectName() {
        return Optional.ofNullable(this.objectName);
    }

    /**
     * Type of object to list privileges on.
     * 
     */
    @Import(name="objectType")
    private @Nullable Output<String> objectType;

    /**
     * @return Type of object to list privileges on.
     * 
     */
    public Optional<Output<String>> objectType() {
        return Optional.ofNullable(this.objectType);
    }

    private GetGrantsGrantsOnArgs() {}

    private GetGrantsGrantsOnArgs(GetGrantsGrantsOnArgs $) {
        this.account = $.account;
        this.objectName = $.objectName;
        this.objectType = $.objectType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGrantsGrantsOnArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGrantsGrantsOnArgs $;

        public Builder() {
            $ = new GetGrantsGrantsOnArgs();
        }

        public Builder(GetGrantsGrantsOnArgs defaults) {
            $ = new GetGrantsGrantsOnArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param account Object hierarchy to list privileges on. The only valid value is: ACCOUNT. Setting this attribute lists all the account-level (i.e. global) privileges that have been granted to roles.
         * 
         * @return builder
         * 
         */
        public Builder account(@Nullable Output<Boolean> account) {
            $.account = account;
            return this;
        }

        /**
         * @param account Object hierarchy to list privileges on. The only valid value is: ACCOUNT. Setting this attribute lists all the account-level (i.e. global) privileges that have been granted to roles.
         * 
         * @return builder
         * 
         */
        public Builder account(Boolean account) {
            return account(Output.of(account));
        }

        /**
         * @param objectName Name of object to list privileges on.
         * 
         * @return builder
         * 
         */
        public Builder objectName(@Nullable Output<String> objectName) {
            $.objectName = objectName;
            return this;
        }

        /**
         * @param objectName Name of object to list privileges on.
         * 
         * @return builder
         * 
         */
        public Builder objectName(String objectName) {
            return objectName(Output.of(objectName));
        }

        /**
         * @param objectType Type of object to list privileges on.
         * 
         * @return builder
         * 
         */
        public Builder objectType(@Nullable Output<String> objectType) {
            $.objectType = objectType;
            return this;
        }

        /**
         * @param objectType Type of object to list privileges on.
         * 
         * @return builder
         * 
         */
        public Builder objectType(String objectType) {
            return objectType(Output.of(objectType));
        }

        public GetGrantsGrantsOnArgs build() {
            return $;
        }
    }

}
