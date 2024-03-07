// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.snowflake.RowAccessPolicyGrantArgs;
import com.pulumi.snowflake.Utilities;
import com.pulumi.snowflake.inputs.RowAccessPolicyGrantState;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * &gt; **Deprecation** This resource is deprecated and will be removed in a future major version release. Please use snowflake.GrantPrivilegesToAccountRole instead. &lt;deprecation&gt;
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.snowflake.RowAccessPolicyGrant;
 * import com.pulumi.snowflake.RowAccessPolicyGrantArgs;
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
 *         var grant = new RowAccessPolicyGrant(&#34;grant&#34;, RowAccessPolicyGrantArgs.builder()        
 *             .databaseName(&#34;database&#34;)
 *             .privilege(&#34;APPLY&#34;)
 *             .roles(            
 *                 &#34;role1&#34;,
 *                 &#34;role2&#34;)
 *             .rowAccessPolicyName(&#34;row_access_policy&#34;)
 *             .schemaName(&#34;schema&#34;)
 *             .withGrantOption(false)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * format is database_name|schema_name|row_access_policy_name|privilege|with_grant_option|roles
 * 
 * ```sh
 * $ pulumi import snowflake:index/rowAccessPolicyGrant:RowAccessPolicyGrant example &#34;MY_DATABASE|MY_SCHEMA|MY_ROW_ACCESS_POLICY_NAME|SELECT|false|role1,role2&#34;
 * ```
 * 
 */
@ResourceType(type="snowflake:index/rowAccessPolicyGrant:RowAccessPolicyGrant")
public class RowAccessPolicyGrant extends com.pulumi.resources.CustomResource {
    /**
     * The name of the database containing the row access policy on which to grant privileges.
     * 
     */
    @Export(name="databaseName", refs={String.class}, tree="[0]")
    private Output<String> databaseName;

    /**
     * @return The name of the database containing the row access policy on which to grant privileges.
     * 
     */
    public Output<String> databaseName() {
        return this.databaseName;
    }
    /**
     * When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
     * grants applied to roles and objects outside Terraform.
     * 
     */
    @Export(name="enableMultipleGrants", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enableMultipleGrants;

    /**
     * @return When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
     * grants applied to roles and objects outside Terraform.
     * 
     */
    public Output<Optional<Boolean>> enableMultipleGrants() {
        return Codegen.optional(this.enableMultipleGrants);
    }
    /**
     * The privilege to grant on the row access policy. To grant all privileges, use the value `ALL PRIVILEGES`
     * 
     */
    @Export(name="privilege", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> privilege;

    /**
     * @return The privilege to grant on the row access policy. To grant all privileges, use the value `ALL PRIVILEGES`
     * 
     */
    public Output<Optional<String>> privilege() {
        return Codegen.optional(this.privilege);
    }
    /**
     * The name of the role to revert ownership to on destroy. Has no effect unless `privilege` is set to `OWNERSHIP`
     * 
     */
    @Export(name="revertOwnershipToRoleName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> revertOwnershipToRoleName;

    /**
     * @return The name of the role to revert ownership to on destroy. Has no effect unless `privilege` is set to `OWNERSHIP`
     * 
     */
    public Output<Optional<String>> revertOwnershipToRoleName() {
        return Codegen.optional(this.revertOwnershipToRoleName);
    }
    /**
     * Grants privilege to these roles.
     * 
     */
    @Export(name="roles", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> roles;

    /**
     * @return Grants privilege to these roles.
     * 
     */
    public Output<Optional<List<String>>> roles() {
        return Codegen.optional(this.roles);
    }
    /**
     * The name of the row access policy on which to grant privileges immediately.
     * 
     */
    @Export(name="rowAccessPolicyName", refs={String.class}, tree="[0]")
    private Output<String> rowAccessPolicyName;

    /**
     * @return The name of the row access policy on which to grant privileges immediately.
     * 
     */
    public Output<String> rowAccessPolicyName() {
        return this.rowAccessPolicyName;
    }
    /**
     * The name of the schema containing the row access policy on which to grant privileges.
     * 
     */
    @Export(name="schemaName", refs={String.class}, tree="[0]")
    private Output<String> schemaName;

    /**
     * @return The name of the schema containing the row access policy on which to grant privileges.
     * 
     */
    public Output<String> schemaName() {
        return this.schemaName;
    }
    /**
     * When this is set to true, allows the recipient role to grant the privileges to other roles.
     * 
     */
    @Export(name="withGrantOption", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> withGrantOption;

    /**
     * @return When this is set to true, allows the recipient role to grant the privileges to other roles.
     * 
     */
    public Output<Optional<Boolean>> withGrantOption() {
        return Codegen.optional(this.withGrantOption);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RowAccessPolicyGrant(String name) {
        this(name, RowAccessPolicyGrantArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RowAccessPolicyGrant(String name, RowAccessPolicyGrantArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RowAccessPolicyGrant(String name, RowAccessPolicyGrantArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/rowAccessPolicyGrant:RowAccessPolicyGrant", name, args == null ? RowAccessPolicyGrantArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RowAccessPolicyGrant(String name, Output<String> id, @Nullable RowAccessPolicyGrantState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/rowAccessPolicyGrant:RowAccessPolicyGrant", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
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
    public static RowAccessPolicyGrant get(String name, Output<String> id, @Nullable RowAccessPolicyGrantState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RowAccessPolicyGrant(name, id, state, options);
    }
}
