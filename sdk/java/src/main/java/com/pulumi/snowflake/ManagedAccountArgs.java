// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ManagedAccountArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagedAccountArgs Empty = new ManagedAccountArgs();

    /**
     * Identifier, as well as login name, for the initial user in the managed account. This user serves as the account administrator for the account.
     * 
     */
    @Import(name="adminName", required=true)
    private Output<String> adminName;

    /**
     * @return Identifier, as well as login name, for the initial user in the managed account. This user serves as the account administrator for the account.
     * 
     */
    public Output<String> adminName() {
        return this.adminName;
    }

    /**
     * Password for the initial user in the managed account.
     * 
     */
    @Import(name="adminPassword", required=true)
    private Output<String> adminPassword;

    /**
     * @return Password for the initial user in the managed account.
     * 
     */
    public Output<String> adminPassword() {
        return this.adminPassword;
    }

    /**
     * Specifies a comment for the managed account.
     * 
     */
    @Import(name="comment")
    private @Nullable Output<String> comment;

    /**
     * @return Specifies a comment for the managed account.
     * 
     */
    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    /**
     * Identifier for the managed account; must be unique for your account.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Identifier for the managed account; must be unique for your account.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specifies the type of managed account.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Specifies the type of managed account.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private ManagedAccountArgs() {}

    private ManagedAccountArgs(ManagedAccountArgs $) {
        this.adminName = $.adminName;
        this.adminPassword = $.adminPassword;
        this.comment = $.comment;
        this.name = $.name;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedAccountArgs $;

        public Builder() {
            $ = new ManagedAccountArgs();
        }

        public Builder(ManagedAccountArgs defaults) {
            $ = new ManagedAccountArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param adminName Identifier, as well as login name, for the initial user in the managed account. This user serves as the account administrator for the account.
         * 
         * @return builder
         * 
         */
        public Builder adminName(Output<String> adminName) {
            $.adminName = adminName;
            return this;
        }

        /**
         * @param adminName Identifier, as well as login name, for the initial user in the managed account. This user serves as the account administrator for the account.
         * 
         * @return builder
         * 
         */
        public Builder adminName(String adminName) {
            return adminName(Output.of(adminName));
        }

        /**
         * @param adminPassword Password for the initial user in the managed account.
         * 
         * @return builder
         * 
         */
        public Builder adminPassword(Output<String> adminPassword) {
            $.adminPassword = adminPassword;
            return this;
        }

        /**
         * @param adminPassword Password for the initial user in the managed account.
         * 
         * @return builder
         * 
         */
        public Builder adminPassword(String adminPassword) {
            return adminPassword(Output.of(adminPassword));
        }

        /**
         * @param comment Specifies a comment for the managed account.
         * 
         * @return builder
         * 
         */
        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        /**
         * @param comment Specifies a comment for the managed account.
         * 
         * @return builder
         * 
         */
        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        /**
         * @param name Identifier for the managed account; must be unique for your account.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Identifier for the managed account; must be unique for your account.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param type Specifies the type of managed account.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Specifies the type of managed account.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ManagedAccountArgs build() {
            $.adminName = Objects.requireNonNull($.adminName, "expected parameter 'adminName' to be non-null");
            $.adminPassword = Objects.requireNonNull($.adminPassword, "expected parameter 'adminPassword' to be non-null");
            return $;
        }
    }

}
