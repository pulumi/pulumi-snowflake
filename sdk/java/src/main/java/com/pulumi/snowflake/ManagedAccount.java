// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.snowflake.ManagedAccountArgs;
import com.pulumi.snowflake.Utilities;
import com.pulumi.snowflake.inputs.ManagedAccountState;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import snowflake:index/managedAccount:ManagedAccount example name
 * ```
 * 
 */
@ResourceType(type="snowflake:index/managedAccount:ManagedAccount")
public class ManagedAccount extends com.pulumi.resources.CustomResource {
    /**
     * Identifier, as well as login name, for the initial user in the managed account. This user serves as the account administrator for the account.
     * 
     */
    @Export(name="adminName", refs={String.class}, tree="[0]")
    private Output<String> adminName;

    /**
     * @return Identifier, as well as login name, for the initial user in the managed account. This user serves as the account administrator for the account.
     * 
     */
    public Output<String> adminName() {
        return this.adminName;
    }
    /**
     * Password for the initial user in the managed account. Check [Snowflake-provided password policy](https://docs.snowflake.com/en/user-guide/admin-user-management#snowflake-provided-password-policy).
     * 
     */
    @Export(name="adminPassword", refs={String.class}, tree="[0]")
    private Output<String> adminPassword;

    /**
     * @return Password for the initial user in the managed account. Check [Snowflake-provided password policy](https://docs.snowflake.com/en/user-guide/admin-user-management#snowflake-provided-password-policy).
     * 
     */
    public Output<String> adminPassword() {
        return this.adminPassword;
    }
    /**
     * Cloud in which the managed account is located.
     * 
     */
    @Export(name="cloud", refs={String.class}, tree="[0]")
    private Output<String> cloud;

    /**
     * @return Cloud in which the managed account is located.
     * 
     */
    public Output<String> cloud() {
        return this.cloud;
    }
    /**
     * Specifies a comment for the managed account.
     * 
     */
    @Export(name="comment", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> comment;

    /**
     * @return Specifies a comment for the managed account.
     * 
     */
    public Output<Optional<String>> comment() {
        return Codegen.optional(this.comment);
    }
    /**
     * Date and time when the managed account was created.
     * 
     */
    @Export(name="createdOn", refs={String.class}, tree="[0]")
    private Output<String> createdOn;

    /**
     * @return Date and time when the managed account was created.
     * 
     */
    public Output<String> createdOn() {
        return this.createdOn;
    }
    /**
     * Display name of the managed account.
     * 
     */
    @Export(name="locator", refs={String.class}, tree="[0]")
    private Output<String> locator;

    /**
     * @return Display name of the managed account.
     * 
     */
    public Output<String> locator() {
        return this.locator;
    }
    /**
     * Identifier for the managed account; must be unique for your account.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Identifier for the managed account; must be unique for your account.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Snowflake Region in which the managed account is located.
     * 
     */
    @Export(name="region", refs={String.class}, tree="[0]")
    private Output<String> region;

    /**
     * @return Snowflake Region in which the managed account is located.
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    /**
     * Specifies the type of managed account.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> type;

    /**
     * @return Specifies the type of managed account.
     * 
     */
    public Output<Optional<String>> type() {
        return Codegen.optional(this.type);
    }
    /**
     * URL for accessing the managed account, particularly through the web interface.
     * 
     */
    @Export(name="url", refs={String.class}, tree="[0]")
    private Output<String> url;

    /**
     * @return URL for accessing the managed account, particularly through the web interface.
     * 
     */
    public Output<String> url() {
        return this.url;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ManagedAccount(String name) {
        this(name, ManagedAccountArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ManagedAccount(String name, ManagedAccountArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ManagedAccount(String name, ManagedAccountArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/managedAccount:ManagedAccount", name, args == null ? ManagedAccountArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ManagedAccount(String name, Output<String> id, @Nullable ManagedAccountState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/managedAccount:ManagedAccount", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "adminPassword"
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
    public static ManagedAccount get(String name, Output<String> id, @Nullable ManagedAccountState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ManagedAccount(name, id, state, options);
    }
}
