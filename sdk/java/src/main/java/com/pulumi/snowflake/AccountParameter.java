// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.snowflake.AccountParameterArgs;
import com.pulumi.snowflake.Utilities;
import com.pulumi.snowflake.inputs.AccountParameterState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * ```sh
 * $ pulumi import snowflake:index/accountParameter:AccountParameter p &lt;parameter_name&gt;
 * ```
 * 
 */
@ResourceType(type="snowflake:index/accountParameter:AccountParameter")
public class AccountParameter extends com.pulumi.resources.CustomResource {
    /**
     * Name of account parameter. Valid values are those in [account parameters](https://docs.snowflake.com/en/sql-reference/parameters.html#account-parameters).
     * 
     */
    @Export(name="key", refs={String.class}, tree="[0]")
    private Output<String> key;

    /**
     * @return Name of account parameter. Valid values are those in [account parameters](https://docs.snowflake.com/en/sql-reference/parameters.html#account-parameters).
     * 
     */
    public Output<String> key() {
        return this.key;
    }
    /**
     * Value of account parameter, as a string. Constraints are the same as those for the parameters in Snowflake documentation.
     * 
     */
    @Export(name="value", refs={String.class}, tree="[0]")
    private Output<String> value;

    /**
     * @return Value of account parameter, as a string. Constraints are the same as those for the parameters in Snowflake documentation.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AccountParameter(java.lang.String name) {
        this(name, AccountParameterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AccountParameter(java.lang.String name, AccountParameterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AccountParameter(java.lang.String name, AccountParameterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/accountParameter:AccountParameter", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private AccountParameter(java.lang.String name, Output<java.lang.String> id, @Nullable AccountParameterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/accountParameter:AccountParameter", name, state, makeResourceOptions(options, id), false);
    }

    private static AccountParameterArgs makeArgs(AccountParameterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? AccountParameterArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static AccountParameter get(java.lang.String name, Output<java.lang.String> id, @Nullable AccountParameterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AccountParameter(name, id, state, options);
    }
}
