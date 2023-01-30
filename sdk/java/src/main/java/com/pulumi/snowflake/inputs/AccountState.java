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


public final class AccountState extends com.pulumi.resources.ResourceArgs {

    public static final AccountState Empty = new AccountState();

    /**
     * Login name of the initial administrative user of the account. A new user is created in the new account with this name and password and granted the ACCOUNTADMIN role in the account. A login name can be any string consisting of letters, numbers, and underscores. Login names are always case-insensitive.
     * 
     */
    @Import(name="adminName")
    private @Nullable Output<String> adminName;

    /**
     * @return Login name of the initial administrative user of the account. A new user is created in the new account with this name and password and granted the ACCOUNTADMIN role in the account. A login name can be any string consisting of letters, numbers, and underscores. Login names are always case-insensitive.
     * 
     */
    public Optional<Output<String>> adminName() {
        return Optional.ofNullable(this.adminName);
    }

    /**
     * Password for the initial administrative user of the account. Optional if the `ADMIN_RSA_PUBLIC_KEY` parameter is specified. For more information about passwords in Snowflake, see [Snowflake-provided Password Policy](https://docs.snowflake.com/en/sql-reference/sql/create-account.html#:~:text=Snowflake%2Dprovided%20Password%20Policy).
     * 
     */
    @Import(name="adminPassword")
    private @Nullable Output<String> adminPassword;

    /**
     * @return Password for the initial administrative user of the account. Optional if the `ADMIN_RSA_PUBLIC_KEY` parameter is specified. For more information about passwords in Snowflake, see [Snowflake-provided Password Policy](https://docs.snowflake.com/en/sql-reference/sql/create-account.html#:~:text=Snowflake%2Dprovided%20Password%20Policy).
     * 
     */
    public Optional<Output<String>> adminPassword() {
        return Optional.ofNullable(this.adminPassword);
    }

    /**
     * Assigns a public key to the initial administrative user of the account in order to implement [key pair authentication](https://docs.snowflake.com/en/sql-reference/sql/create-account.html#:~:text=key%20pair%20authentication) for the user. Optional if the `ADMIN_PASSWORD` parameter is specified.
     * 
     */
    @Import(name="adminRsaPublicKey")
    private @Nullable Output<String> adminRsaPublicKey;

    /**
     * @return Assigns a public key to the initial administrative user of the account in order to implement [key pair authentication](https://docs.snowflake.com/en/sql-reference/sql/create-account.html#:~:text=key%20pair%20authentication) for the user. Optional if the `ADMIN_PASSWORD` parameter is specified.
     * 
     */
    public Optional<Output<String>> adminRsaPublicKey() {
        return Optional.ofNullable(this.adminRsaPublicKey);
    }

    /**
     * Specifies a comment for the account.
     * 
     */
    @Import(name="comment")
    private @Nullable Output<String> comment;

    /**
     * @return Specifies a comment for the account.
     * 
     */
    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    /**
     * [Snowflake Edition](https://docs.snowflake.com/en/user-guide/intro-editions.html) of the account. Valid values are: STANDARD | ENTERPRISE | BUSINESS_CRITICAL
     * 
     */
    @Import(name="edition")
    private @Nullable Output<String> edition;

    /**
     * @return [Snowflake Edition](https://docs.snowflake.com/en/user-guide/intro-editions.html) of the account. Valid values are: STANDARD | ENTERPRISE | BUSINESS_CRITICAL
     * 
     */
    public Optional<Output<String>> edition() {
        return Optional.ofNullable(this.edition);
    }

    /**
     * Email address of the initial administrative user of the account. This email address is used to send any notifications about the account.
     * 
     */
    @Import(name="email")
    private @Nullable Output<String> email;

    /**
     * @return Email address of the initial administrative user of the account. This email address is used to send any notifications about the account.
     * 
     */
    public Optional<Output<String>> email() {
        return Optional.ofNullable(this.email);
    }

    /**
     * First name of the initial administrative user of the account
     * 
     */
    @Import(name="firstName")
    private @Nullable Output<String> firstName;

    /**
     * @return First name of the initial administrative user of the account
     * 
     */
    public Optional<Output<String>> firstName() {
        return Optional.ofNullable(this.firstName);
    }

    /**
     * Last name of the initial administrative user of the account
     * 
     */
    @Import(name="lastName")
    private @Nullable Output<String> lastName;

    /**
     * @return Last name of the initial administrative user of the account
     * 
     */
    public Optional<Output<String>> lastName() {
        return Optional.ofNullable(this.lastName);
    }

    /**
     * Specifies whether the new user created to administer the account is forced to change their password upon first login into the account.
     * 
     */
    @Import(name="mustChangePassword")
    private @Nullable Output<Boolean> mustChangePassword;

    /**
     * @return Specifies whether the new user created to administer the account is forced to change their password upon first login into the account.
     * 
     */
    public Optional<Output<Boolean>> mustChangePassword() {
        return Optional.ofNullable(this.mustChangePassword);
    }

    /**
     * Specifies the identifier (i.e. name) for the account; must be unique within an organization, regardless of which Snowflake Region the account is in. In addition, the identifier must start with an alphabetic character and cannot contain spaces or special characters except for underscores (_). Note that if the account name includes underscores, features that do not accept account names with underscores (e.g. Okta SSO or SCIM) can reference a version of the account name that substitutes hyphens (-) for the underscores.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the identifier (i.e. name) for the account; must be unique within an organization, regardless of which Snowflake Region the account is in. In addition, the identifier must start with an alphabetic character and cannot contain spaces or special characters except for underscores (_). Note that if the account name includes underscores, features that do not accept account names with underscores (e.g. Okta SSO or SCIM) can reference a version of the account name that substitutes hyphens (-) for the underscores.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * ID of the Snowflake Region where the account is created. If no value is provided, Snowflake creates the account in the same Snowflake Region as the current account (i.e. the account in which the CREATE ACCOUNT statement is executed.)
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return ID of the Snowflake Region where the account is created. If no value is provided, Snowflake creates the account in the same Snowflake Region as the current account (i.e. the account in which the CREATE ACCOUNT statement is executed.)
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * ID of the Snowflake Region where the account is created. If no value is provided, Snowflake creates the account in the same Snowflake Region as the current account (i.e. the account in which the CREATE ACCOUNT statement is executed.)
     * 
     */
    @Import(name="regionGroup")
    private @Nullable Output<String> regionGroup;

    /**
     * @return ID of the Snowflake Region where the account is created. If no value is provided, Snowflake creates the account in the same Snowflake Region as the current account (i.e. the account in which the CREATE ACCOUNT statement is executed.)
     * 
     */
    public Optional<Output<String>> regionGroup() {
        return Optional.ofNullable(this.regionGroup);
    }

    private AccountState() {}

    private AccountState(AccountState $) {
        this.adminName = $.adminName;
        this.adminPassword = $.adminPassword;
        this.adminRsaPublicKey = $.adminRsaPublicKey;
        this.comment = $.comment;
        this.edition = $.edition;
        this.email = $.email;
        this.firstName = $.firstName;
        this.lastName = $.lastName;
        this.mustChangePassword = $.mustChangePassword;
        this.name = $.name;
        this.region = $.region;
        this.regionGroup = $.regionGroup;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccountState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccountState $;

        public Builder() {
            $ = new AccountState();
        }

        public Builder(AccountState defaults) {
            $ = new AccountState(Objects.requireNonNull(defaults));
        }

        /**
         * @param adminName Login name of the initial administrative user of the account. A new user is created in the new account with this name and password and granted the ACCOUNTADMIN role in the account. A login name can be any string consisting of letters, numbers, and underscores. Login names are always case-insensitive.
         * 
         * @return builder
         * 
         */
        public Builder adminName(@Nullable Output<String> adminName) {
            $.adminName = adminName;
            return this;
        }

        /**
         * @param adminName Login name of the initial administrative user of the account. A new user is created in the new account with this name and password and granted the ACCOUNTADMIN role in the account. A login name can be any string consisting of letters, numbers, and underscores. Login names are always case-insensitive.
         * 
         * @return builder
         * 
         */
        public Builder adminName(String adminName) {
            return adminName(Output.of(adminName));
        }

        /**
         * @param adminPassword Password for the initial administrative user of the account. Optional if the `ADMIN_RSA_PUBLIC_KEY` parameter is specified. For more information about passwords in Snowflake, see [Snowflake-provided Password Policy](https://docs.snowflake.com/en/sql-reference/sql/create-account.html#:~:text=Snowflake%2Dprovided%20Password%20Policy).
         * 
         * @return builder
         * 
         */
        public Builder adminPassword(@Nullable Output<String> adminPassword) {
            $.adminPassword = adminPassword;
            return this;
        }

        /**
         * @param adminPassword Password for the initial administrative user of the account. Optional if the `ADMIN_RSA_PUBLIC_KEY` parameter is specified. For more information about passwords in Snowflake, see [Snowflake-provided Password Policy](https://docs.snowflake.com/en/sql-reference/sql/create-account.html#:~:text=Snowflake%2Dprovided%20Password%20Policy).
         * 
         * @return builder
         * 
         */
        public Builder adminPassword(String adminPassword) {
            return adminPassword(Output.of(adminPassword));
        }

        /**
         * @param adminRsaPublicKey Assigns a public key to the initial administrative user of the account in order to implement [key pair authentication](https://docs.snowflake.com/en/sql-reference/sql/create-account.html#:~:text=key%20pair%20authentication) for the user. Optional if the `ADMIN_PASSWORD` parameter is specified.
         * 
         * @return builder
         * 
         */
        public Builder adminRsaPublicKey(@Nullable Output<String> adminRsaPublicKey) {
            $.adminRsaPublicKey = adminRsaPublicKey;
            return this;
        }

        /**
         * @param adminRsaPublicKey Assigns a public key to the initial administrative user of the account in order to implement [key pair authentication](https://docs.snowflake.com/en/sql-reference/sql/create-account.html#:~:text=key%20pair%20authentication) for the user. Optional if the `ADMIN_PASSWORD` parameter is specified.
         * 
         * @return builder
         * 
         */
        public Builder adminRsaPublicKey(String adminRsaPublicKey) {
            return adminRsaPublicKey(Output.of(adminRsaPublicKey));
        }

        /**
         * @param comment Specifies a comment for the account.
         * 
         * @return builder
         * 
         */
        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        /**
         * @param comment Specifies a comment for the account.
         * 
         * @return builder
         * 
         */
        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        /**
         * @param edition [Snowflake Edition](https://docs.snowflake.com/en/user-guide/intro-editions.html) of the account. Valid values are: STANDARD | ENTERPRISE | BUSINESS_CRITICAL
         * 
         * @return builder
         * 
         */
        public Builder edition(@Nullable Output<String> edition) {
            $.edition = edition;
            return this;
        }

        /**
         * @param edition [Snowflake Edition](https://docs.snowflake.com/en/user-guide/intro-editions.html) of the account. Valid values are: STANDARD | ENTERPRISE | BUSINESS_CRITICAL
         * 
         * @return builder
         * 
         */
        public Builder edition(String edition) {
            return edition(Output.of(edition));
        }

        /**
         * @param email Email address of the initial administrative user of the account. This email address is used to send any notifications about the account.
         * 
         * @return builder
         * 
         */
        public Builder email(@Nullable Output<String> email) {
            $.email = email;
            return this;
        }

        /**
         * @param email Email address of the initial administrative user of the account. This email address is used to send any notifications about the account.
         * 
         * @return builder
         * 
         */
        public Builder email(String email) {
            return email(Output.of(email));
        }

        /**
         * @param firstName First name of the initial administrative user of the account
         * 
         * @return builder
         * 
         */
        public Builder firstName(@Nullable Output<String> firstName) {
            $.firstName = firstName;
            return this;
        }

        /**
         * @param firstName First name of the initial administrative user of the account
         * 
         * @return builder
         * 
         */
        public Builder firstName(String firstName) {
            return firstName(Output.of(firstName));
        }

        /**
         * @param lastName Last name of the initial administrative user of the account
         * 
         * @return builder
         * 
         */
        public Builder lastName(@Nullable Output<String> lastName) {
            $.lastName = lastName;
            return this;
        }

        /**
         * @param lastName Last name of the initial administrative user of the account
         * 
         * @return builder
         * 
         */
        public Builder lastName(String lastName) {
            return lastName(Output.of(lastName));
        }

        /**
         * @param mustChangePassword Specifies whether the new user created to administer the account is forced to change their password upon first login into the account.
         * 
         * @return builder
         * 
         */
        public Builder mustChangePassword(@Nullable Output<Boolean> mustChangePassword) {
            $.mustChangePassword = mustChangePassword;
            return this;
        }

        /**
         * @param mustChangePassword Specifies whether the new user created to administer the account is forced to change their password upon first login into the account.
         * 
         * @return builder
         * 
         */
        public Builder mustChangePassword(Boolean mustChangePassword) {
            return mustChangePassword(Output.of(mustChangePassword));
        }

        /**
         * @param name Specifies the identifier (i.e. name) for the account; must be unique within an organization, regardless of which Snowflake Region the account is in. In addition, the identifier must start with an alphabetic character and cannot contain spaces or special characters except for underscores (_). Note that if the account name includes underscores, features that do not accept account names with underscores (e.g. Okta SSO or SCIM) can reference a version of the account name that substitutes hyphens (-) for the underscores.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the identifier (i.e. name) for the account; must be unique within an organization, regardless of which Snowflake Region the account is in. In addition, the identifier must start with an alphabetic character and cannot contain spaces or special characters except for underscores (_). Note that if the account name includes underscores, features that do not accept account names with underscores (e.g. Okta SSO or SCIM) can reference a version of the account name that substitutes hyphens (-) for the underscores.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param region ID of the Snowflake Region where the account is created. If no value is provided, Snowflake creates the account in the same Snowflake Region as the current account (i.e. the account in which the CREATE ACCOUNT statement is executed.)
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region ID of the Snowflake Region where the account is created. If no value is provided, Snowflake creates the account in the same Snowflake Region as the current account (i.e. the account in which the CREATE ACCOUNT statement is executed.)
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param regionGroup ID of the Snowflake Region where the account is created. If no value is provided, Snowflake creates the account in the same Snowflake Region as the current account (i.e. the account in which the CREATE ACCOUNT statement is executed.)
         * 
         * @return builder
         * 
         */
        public Builder regionGroup(@Nullable Output<String> regionGroup) {
            $.regionGroup = regionGroup;
            return this;
        }

        /**
         * @param regionGroup ID of the Snowflake Region where the account is created. If no value is provided, Snowflake creates the account in the same Snowflake Region as the current account (i.e. the account in which the CREATE ACCOUNT statement is executed.)
         * 
         * @return builder
         * 
         */
        public Builder regionGroup(String regionGroup) {
            return regionGroup(Output.of(regionGroup));
        }

        public AccountState build() {
            return $;
        }
    }

}
