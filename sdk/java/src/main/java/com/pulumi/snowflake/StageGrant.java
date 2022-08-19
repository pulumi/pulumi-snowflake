// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.snowflake.StageGrantArgs;
import com.pulumi.snowflake.Utilities;
import com.pulumi.snowflake.inputs.StageGrantState;
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
 * import com.pulumi.snowflake.StageGrant;
 * import com.pulumi.snowflake.StageGrantArgs;
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
 *         var grant = new StageGrant(&#34;grant&#34;, StageGrantArgs.builder()        
 *             .databaseName(&#34;db&#34;)
 *             .onFuture(false)
 *             .privilege(&#34;USAGE&#34;)
 *             .roles(            
 *                 &#34;role1&#34;,
 *                 &#34;role2&#34;)
 *             .schemaName(&#34;schema&#34;)
 *             .shares(            
 *                 &#34;share1&#34;,
 *                 &#34;share2&#34;)
 *             .stageName(&#34;stage&#34;)
 *             .withGrantOption(false)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * # format is database name | schema name | stage name | privilege | true/false for with_grant_option
 * 
 * ```sh
 *  $ pulumi import snowflake:index/stageGrant:StageGrant example &#39;databaseName|schemaName|stageName|USAGE|true&#39;
 * ```
 * 
 */
@ResourceType(type="snowflake:index/stageGrant:StageGrant")
public class StageGrant extends com.pulumi.resources.CustomResource {
    /**
     * The name of the database containing the current stage on which to grant privileges.
     * 
     */
    @Export(name="databaseName", type=String.class, parameters={})
    private Output<String> databaseName;

    /**
     * @return The name of the database containing the current stage on which to grant privileges.
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
     * When this is set to true and a schema*name is provided, apply this grant on all future stages in the given schema. When this is true and no schema*name is provided apply this grant on all future stages in the given database. The stage*name field must be unset in order to use on*future.
     * 
     */
    @Export(name="onFuture", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> onFuture;

    /**
     * @return When this is set to true and a schema*name is provided, apply this grant on all future stages in the given schema. When this is true and no schema*name is provided apply this grant on all future stages in the given database. The stage*name field must be unset in order to use on*future.
     * 
     */
    public Output<Optional<Boolean>> onFuture() {
        return Codegen.optional(this.onFuture);
    }
    /**
     * The privilege to grant on the stage.
     * 
     */
    @Export(name="privilege", type=String.class, parameters={})
    private Output</* @Nullable */ String> privilege;

    /**
     * @return The privilege to grant on the stage.
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
     * The name of the schema containing the current stage on which to grant privileges.
     * 
     */
    @Export(name="schemaName", type=String.class, parameters={})
    private Output<String> schemaName;

    /**
     * @return The name of the schema containing the current stage on which to grant privileges.
     * 
     */
    public Output<String> schemaName() {
        return this.schemaName;
    }
    /**
     * The name of the stage on which to grant privilege (only valid if on_future is false).
     * 
     */
    @Export(name="stageName", type=String.class, parameters={})
    private Output</* @Nullable */ String> stageName;

    /**
     * @return The name of the stage on which to grant privilege (only valid if on_future is false).
     * 
     */
    public Output<Optional<String>> stageName() {
        return Codegen.optional(this.stageName);
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
    public StageGrant(String name) {
        this(name, StageGrantArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public StageGrant(String name, StageGrantArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public StageGrant(String name, StageGrantArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/stageGrant:StageGrant", name, args == null ? StageGrantArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private StageGrant(String name, Output<String> id, @Nullable StageGrantState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/stageGrant:StageGrant", name, state, makeResourceOptions(options, id));
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
    public static StageGrant get(String name, Output<String> id, @Nullable StageGrantState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new StageGrant(name, id, state, options);
    }
}
