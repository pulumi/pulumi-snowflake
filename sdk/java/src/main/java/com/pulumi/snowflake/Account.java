// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.snowflake.AccountArgs;
import com.pulumi.snowflake.Utilities;
import com.pulumi.snowflake.inputs.AccountState;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The account resource allows you to create and manage Snowflake accounts.
 * 
 * !&gt; **Warning** This resource cannot be destroyed!!! The only way to delete accounts is to go through [Snowflake Support](https://docs.snowflake.com/en/user-guide/organizations-manage-accounts.html#deleting-an-account)
 * 
 * &gt; **Note** ORGADMIN priviliges are required for this resource
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.snowflake.Account;
 * import com.pulumi.snowflake.AccountArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var ac1 = new Account("ac1", AccountArgs.builder()
 *             .name("SNOWFLAKE_TEST_ACCOUNT")
 *             .adminName("John Doe")
 *             .adminPassword("Abcd1234!")
 *             .email("john.doe{@literal @}snowflake.com")
 *             .firstName("John")
 *             .lastName("Doe")
 *             .mustChangePassword(true)
 *             .edition("STANDARD")
 *             .comment("Snowflake Test Account")
 *             .region("AWS_US_WEST_2")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import snowflake:index/account:Account account &lt;account_locator&gt;
 * ```
 * 
 */
@ResourceType(type="snowflake:index/account:Account")
public class Account extends com.pulumi.resources.CustomResource {
    /**
     * Login name of the initial administrative user of the account. A new user is created in the new account with this name and password and granted the ACCOUNTADMIN role in the account. A login name can be any string consisting of letters, numbers, and underscores. Login names are always case-insensitive.
     * 
     */
    @Export(name="adminName", refs={String.class}, tree="[0]")
    private Output<String> adminName;

    /**
     * @return Login name of the initial administrative user of the account. A new user is created in the new account with this name and password and granted the ACCOUNTADMIN role in the account. A login name can be any string consisting of letters, numbers, and underscores. Login names are always case-insensitive.
     * 
     */
    public Output<String> adminName() {
        return this.adminName;
    }
    /**
     * Password for the initial administrative user of the account. Optional if the `ADMIN_RSA_PUBLIC_KEY` parameter is specified. For more information about passwords in Snowflake, see [Snowflake-provided Password Policy](https://docs.snowflake.com/en/sql-reference/sql/create-account.html#:~:text=Snowflake%2Dprovided%20Password%20Policy).
     * 
     */
    @Export(name="adminPassword", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> adminPassword;

    /**
     * @return Password for the initial administrative user of the account. Optional if the `ADMIN_RSA_PUBLIC_KEY` parameter is specified. For more information about passwords in Snowflake, see [Snowflake-provided Password Policy](https://docs.snowflake.com/en/sql-reference/sql/create-account.html#:~:text=Snowflake%2Dprovided%20Password%20Policy).
     * 
     */
    public Output<Optional<String>> adminPassword() {
        return Codegen.optional(this.adminPassword);
    }
    /**
     * Assigns a public key to the initial administrative user of the account in order to implement [key pair authentication](https://docs.snowflake.com/en/sql-reference/sql/create-account.html#:~:text=key%20pair%20authentication) for the user. Optional if the `ADMIN_PASSWORD` parameter is specified.
     * 
     */
    @Export(name="adminRsaPublicKey", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> adminRsaPublicKey;

    /**
     * @return Assigns a public key to the initial administrative user of the account in order to implement [key pair authentication](https://docs.snowflake.com/en/sql-reference/sql/create-account.html#:~:text=key%20pair%20authentication) for the user. Optional if the `ADMIN_PASSWORD` parameter is specified.
     * 
     */
    public Output<Optional<String>> adminRsaPublicKey() {
        return Codegen.optional(this.adminRsaPublicKey);
    }
    /**
     * Specifies a comment for the account.
     * 
     */
    @Export(name="comment", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> comment;

    /**
     * @return Specifies a comment for the account.
     * 
     */
    public Output<Optional<String>> comment() {
        return Codegen.optional(this.comment);
    }
    /**
     * [Snowflake Edition](https://docs.snowflake.com/en/user-guide/intro-editions.html) of the account. Valid values are: STANDARD | ENTERPRISE | BUSINESS_CRITICAL
     * 
     */
    @Export(name="edition", refs={String.class}, tree="[0]")
    private Output<String> edition;

    /**
     * @return [Snowflake Edition](https://docs.snowflake.com/en/user-guide/intro-editions.html) of the account. Valid values are: STANDARD | ENTERPRISE | BUSINESS_CRITICAL
     * 
     */
    public Output<String> edition() {
        return this.edition;
    }
    /**
     * Email address of the initial administrative user of the account. This email address is used to send any notifications about the account.
     * 
     */
    @Export(name="email", refs={String.class}, tree="[0]")
    private Output<String> email;

    /**
     * @return Email address of the initial administrative user of the account. This email address is used to send any notifications about the account.
     * 
     */
    public Output<String> email() {
        return this.email;
    }
    /**
     * First name of the initial administrative user of the account
     * 
     */
    @Export(name="firstName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> firstName;

    /**
     * @return First name of the initial administrative user of the account
     * 
     */
    public Output<Optional<String>> firstName() {
        return Codegen.optional(this.firstName);
    }
    /**
     * Specifies the number of days to wait before dropping the account. The default is 3 days.
     * 
     */
    @Export(name="gracePeriodInDays", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> gracePeriodInDays;

    /**
     * @return Specifies the number of days to wait before dropping the account. The default is 3 days.
     * 
     */
    public Output<Optional<Integer>> gracePeriodInDays() {
        return Codegen.optional(this.gracePeriodInDays);
    }
    /**
     * Indicates whether the ORGADMIN role is enabled in an account. If TRUE, the role is enabled.
     * 
     */
    @Export(name="isOrgAdmin", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> isOrgAdmin;

    /**
     * @return Indicates whether the ORGADMIN role is enabled in an account. If TRUE, the role is enabled.
     * 
     */
    public Output<Boolean> isOrgAdmin() {
        return this.isOrgAdmin;
    }
    /**
     * Last name of the initial administrative user of the account
     * 
     */
    @Export(name="lastName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> lastName;

    /**
     * @return Last name of the initial administrative user of the account
     * 
     */
    public Output<Optional<String>> lastName() {
        return Codegen.optional(this.lastName);
    }
    /**
     * Specifies whether the new user created to administer the account is forced to change their password upon first login into the account.
     * 
     */
    @Export(name="mustChangePassword", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> mustChangePassword;

    /**
     * @return Specifies whether the new user created to administer the account is forced to change their password upon first login into the account.
     * 
     */
    public Output<Optional<Boolean>> mustChangePassword() {
        return Codegen.optional(this.mustChangePassword);
    }
    /**
     * Specifies the identifier (i.e. name) for the account; must be unique within an organization, regardless of which Snowflake Region the account is in. In addition, the identifier must start with an alphabetic character and cannot contain spaces or special characters except for underscores (_). Note that if the account name includes underscores, features that do not accept account names with underscores (e.g. Okta SSO or SCIM) can reference a version of the account name that substitutes hyphens (-) for the underscores.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Specifies the identifier (i.e. name) for the account; must be unique within an organization, regardless of which Snowflake Region the account is in. In addition, the identifier must start with an alphabetic character and cannot contain spaces or special characters except for underscores (_). Note that if the account name includes underscores, features that do not accept account names with underscores (e.g. Okta SSO or SCIM) can reference a version of the account name that substitutes hyphens (-) for the underscores.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * ID of the Snowflake Region where the account is created. If no value is provided, Snowflake creates the account in the same Snowflake Region as the current account (i.e. the account in which the CREATE ACCOUNT statement is executed.)
     * 
     */
    @Export(name="region", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> region;

    /**
     * @return ID of the Snowflake Region where the account is created. If no value is provided, Snowflake creates the account in the same Snowflake Region as the current account (i.e. the account in which the CREATE ACCOUNT statement is executed.)
     * 
     */
    public Output<Optional<String>> region() {
        return Codegen.optional(this.region);
    }
    /**
     * ID of the Snowflake Region where the account is created. If no value is provided, Snowflake creates the account in the same Snowflake Region as the current account (i.e. the account in which the CREATE ACCOUNT statement is executed.)
     * 
     */
    @Export(name="regionGroup", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> regionGroup;

    /**
     * @return ID of the Snowflake Region where the account is created. If no value is provided, Snowflake creates the account in the same Snowflake Region as the current account (i.e. the account in which the CREATE ACCOUNT statement is executed.)
     * 
     */
    public Output<Optional<String>> regionGroup() {
        return Codegen.optional(this.regionGroup);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Account(String name) {
        this(name, AccountArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Account(String name, AccountArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Account(String name, AccountArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/account:Account", name, args == null ? AccountArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Account(String name, Output<String> id, @Nullable AccountState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/account:Account", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "adminPassword",
                "adminRsaPublicKey",
                "email",
                "firstName",
                "lastName"
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Account get(String name, Output<String> id, @Nullable AccountState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Account(name, id, state, options);
    }
}
