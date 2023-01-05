// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.snowflake.MaterializedViewGrantArgs;
import com.pulumi.snowflake.Utilities;
import com.pulumi.snowflake.inputs.MaterializedViewGrantState;
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
 * import com.pulumi.snowflake.MaterializedViewGrant;
 * import com.pulumi.snowflake.MaterializedViewGrantArgs;
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
 *         var grant = new MaterializedViewGrant(&#34;grant&#34;, MaterializedViewGrantArgs.builder()        
 *             .databaseName(&#34;database&#34;)
 *             .materializedViewName(&#34;materialized_view&#34;)
 *             .onFuture(false)
 *             .privilege(&#34;SELECT&#34;)
 *             .roles(            
 *                 &#34;role1&#34;,
 *                 &#34;role2&#34;)
 *             .schemaName(&#34;schema&#34;)
 *             .shares(            
 *                 &#34;share1&#34;,
 *                 &#34;share2&#34;)
 *             .withGrantOption(false)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * format is database name | schema name | materialized view name | privilege | true/false for with_grant_option
 * 
 * ```sh
 *  $ pulumi import snowflake:index/materializedViewGrant:MaterializedViewGrant example &#39;dbName|schemaName|materializedViewName|SELECT|false&#39;
 * ```
 * 
 */
@ResourceType(type="snowflake:index/materializedViewGrant:MaterializedViewGrant")
public class MaterializedViewGrant extends com.pulumi.resources.CustomResource {
    /**
     * The name of the database containing the current or future materialized views on which to grant privileges.
     * 
     */
    @Export(name="databaseName", type=String.class, parameters={})
    private Output<String> databaseName;

    /**
     * @return The name of the database containing the current or future materialized views on which to grant privileges.
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
    @Export(name="enableMultipleGrants", type=Boolean.class, parameters={})
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
     * The name of the materialized view on which to grant privileges immediately (only valid if on_future is false).
     * 
     */
    @Export(name="materializedViewName", type=String.class, parameters={})
    private Output</* @Nullable */ String> materializedViewName;

    /**
     * @return The name of the materialized view on which to grant privileges immediately (only valid if on_future is false).
     * 
     */
    public Output<Optional<String>> materializedViewName() {
        return Codegen.optional(this.materializedViewName);
    }
    /**
     * When this is set to true and a schema*name is provided, apply this grant on all future materialized views in the given schema. When this is true and no schema*name is provided apply this grant on all future materialized views in the given database. The materialized*view*name and shares fields must be unset in order to use on_future.
     * 
     */
    @Export(name="onFuture", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> onFuture;

    /**
     * @return When this is set to true and a schema*name is provided, apply this grant on all future materialized views in the given schema. When this is true and no schema*name is provided apply this grant on all future materialized views in the given database. The materialized*view*name and shares fields must be unset in order to use on_future.
     * 
     */
    public Output<Optional<Boolean>> onFuture() {
        return Codegen.optional(this.onFuture);
    }
    /**
     * The privilege to grant on the current or future materialized view view.
     * 
     */
    @Export(name="privilege", type=String.class, parameters={})
    private Output</* @Nullable */ String> privilege;

    /**
     * @return The privilege to grant on the current or future materialized view view.
     * 
     */
    public Output<Optional<String>> privilege() {
        return Codegen.optional(this.privilege);
    }
    /**
     * Grants privilege to these roles.
     * 
     */
    @Export(name="roles", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> roles;

    /**
     * @return Grants privilege to these roles.
     * 
     */
    public Output<Optional<List<String>>> roles() {
        return Codegen.optional(this.roles);
    }
    /**
     * The name of the schema containing the current or future materialized views on which to grant privileges.
     * 
     */
    @Export(name="schemaName", type=String.class, parameters={})
    private Output</* @Nullable */ String> schemaName;

    /**
     * @return The name of the schema containing the current or future materialized views on which to grant privileges.
     * 
     */
    public Output<Optional<String>> schemaName() {
        return Codegen.optional(this.schemaName);
    }
    /**
     * Grants privilege to these shares (only valid if on_future is false).
     * 
     */
    @Export(name="shares", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> shares;

    /**
     * @return Grants privilege to these shares (only valid if on_future is false).
     * 
     */
    public Output<Optional<List<String>>> shares() {
        return Codegen.optional(this.shares);
    }
    /**
     * When this is set to true, allows the recipient role to grant the privileges to other roles.
     * 
     */
    @Export(name="withGrantOption", type=Boolean.class, parameters={})
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
    public MaterializedViewGrant(String name) {
        this(name, MaterializedViewGrantArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MaterializedViewGrant(String name, MaterializedViewGrantArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MaterializedViewGrant(String name, MaterializedViewGrantArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/materializedViewGrant:MaterializedViewGrant", name, args == null ? MaterializedViewGrantArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private MaterializedViewGrant(String name, Output<String> id, @Nullable MaterializedViewGrantState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/materializedViewGrant:MaterializedViewGrant", name, state, makeResourceOptions(options, id));
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
    public static MaterializedViewGrant get(String name, Output<String> id, @Nullable MaterializedViewGrantState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new MaterializedViewGrant(name, id, state, options);
    }
}
