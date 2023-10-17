// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.snowflake.MaskingPolicyGrantArgs;
import com.pulumi.snowflake.Utilities;
import com.pulumi.snowflake.inputs.MaskingPolicyGrantState;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.snowflake.MaskingPolicyGrant;
 * import com.pulumi.snowflake.MaskingPolicyGrantArgs;
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
 *         var example = new MaskingPolicyGrant(&#34;example&#34;, MaskingPolicyGrantArgs.builder()        
 *             .databaseName(&#34;EXAMPLE_DB_NAME&#34;)
 *             .enableMultipleGrants(true)
 *             .maskingPolicyName(&#34;EXAMPLE_MASKING_POLICY_NAME&#34;)
 *             .privilege(&#34;APPLY&#34;)
 *             .roles(            
 *                 &#34;ROLE1_NAME&#34;,
 *                 &#34;ROLE2_NAME&#34;)
 *             .schemaName(&#34;EXAMPLE_SCHEMA_NAME&#34;)
 *             .withGrantOption(true)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * format is database_name|schema_name|masking_policy_name|privilege|with_grant_option|roles
 * 
 * ```sh
 *  $ pulumi import snowflake:index/maskingPolicyGrant:MaskingPolicyGrant example &#34;dbName|schemaName|maskingPolicyName|USAGE|false|role1,role2&#34;
 * ```
 * 
 */
@ResourceType(type="snowflake:index/maskingPolicyGrant:MaskingPolicyGrant")
public class MaskingPolicyGrant extends com.pulumi.resources.CustomResource {
    /**
     * The name of the database containing the masking policy on which to grant privileges.
     * 
     */
    @Export(name="databaseName", refs={String.class}, tree="[0]")
    private Output<String> databaseName;

    /**
     * @return The name of the database containing the masking policy on which to grant privileges.
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
     * The name of the masking policy on which to grant privileges immediately.
     * 
     */
    @Export(name="maskingPolicyName", refs={String.class}, tree="[0]")
    private Output<String> maskingPolicyName;

    /**
     * @return The name of the masking policy on which to grant privileges immediately.
     * 
     */
    public Output<String> maskingPolicyName() {
        return this.maskingPolicyName;
    }
    /**
     * The privilege to grant on the masking policy. To grant all privileges, use the value `ALL PRIVILEGES`
     * 
     */
    @Export(name="privilege", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> privilege;

    /**
     * @return The privilege to grant on the masking policy. To grant all privileges, use the value `ALL PRIVILEGES`
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
     * The name of the schema containing the masking policy on which to grant privileges.
     * 
     */
    @Export(name="schemaName", refs={String.class}, tree="[0]")
    private Output<String> schemaName;

    /**
     * @return The name of the schema containing the masking policy on which to grant privileges.
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
    public MaskingPolicyGrant(String name) {
        this(name, MaskingPolicyGrantArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MaskingPolicyGrant(String name, MaskingPolicyGrantArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MaskingPolicyGrant(String name, MaskingPolicyGrantArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/maskingPolicyGrant:MaskingPolicyGrant", name, args == null ? MaskingPolicyGrantArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private MaskingPolicyGrant(String name, Output<String> id, @Nullable MaskingPolicyGrantState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/maskingPolicyGrant:MaskingPolicyGrant", name, state, makeResourceOptions(options, id));
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
    public static MaskingPolicyGrant get(String name, Output<String> id, @Nullable MaskingPolicyGrantState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new MaskingPolicyGrant(name, id, state, options);
    }
}
