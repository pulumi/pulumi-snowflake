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
 * &gt; **Deprecation** This resource is deprecated and will be removed in a future major version release. Please use snowflake.GrantPrivilegesToAccountRole instead. &lt;deprecation&gt;
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
 *         var grant = new StageGrant("grant", StageGrantArgs.builder()
 *             .databaseName("database")
 *             .schemaName("schema")
 *             .stageName("stage")
 *             .privilege("USAGE")
 *             .roles(            
 *                 "role1",
 *                 "role2")
 *             .onFuture(false)
 *             .withGrantOption(false)
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
 * format is database_name|schema_name|stage_name|privilege|with_grant_option|on_future|on_all|roles
 * 
 * ```sh
 * $ pulumi import snowflake:index/stageGrant:StageGrant example &#34;MY_DATABASE|MY_SCHEMA|MY_STAGE|USAGE|false|false|false|role1,role2&#34;
 * ```
 * 
 */
@ResourceType(type="snowflake:index/stageGrant:StageGrant")
public class StageGrant extends com.pulumi.resources.CustomResource {
    /**
     * The name of the database containing the current stage on which to grant privileges.
     * 
     */
    @Export(name="databaseName", refs={String.class}, tree="[0]")
    private Output<String> databaseName;

    /**
     * @return The name of the database containing the current stage on which to grant privileges.
     * 
     */
    public Output<String> databaseName() {
        return this.databaseName;
    }
    @Export(name="enableMultipleGrants", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enableMultipleGrants;

    public Output<Optional<Boolean>> enableMultipleGrants() {
        return Codegen.optional(this.enableMultipleGrants);
    }
    /**
     * When this is set to true and a schema*name is provided, apply this grant on all stages in the given schema. When this is true and no schema*name is provided apply this grant on all stages in the given database. The stage*name field must be unset in order to use on*all. Cannot be used together with on_future.
     * 
     */
    @Export(name="onAll", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> onAll;

    /**
     * @return When this is set to true and a schema*name is provided, apply this grant on all stages in the given schema. When this is true and no schema*name is provided apply this grant on all stages in the given database. The stage*name field must be unset in order to use on*all. Cannot be used together with on_future.
     * 
     */
    public Output<Optional<Boolean>> onAll() {
        return Codegen.optional(this.onAll);
    }
    /**
     * When this is set to true and a schema*name is provided, apply this grant on all future stages in the given schema. When this is true and no schema*name is provided apply this grant on all future stages in the given database. The stage*name field must be unset in order to use on*future. Cannot be used together with on_all.
     * 
     */
    @Export(name="onFuture", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> onFuture;

    /**
     * @return When this is set to true and a schema*name is provided, apply this grant on all future stages in the given schema. When this is true and no schema*name is provided apply this grant on all future stages in the given database. The stage*name field must be unset in order to use on*future. Cannot be used together with on_all.
     * 
     */
    public Output<Optional<Boolean>> onFuture() {
        return Codegen.optional(this.onFuture);
    }
    /**
     * The privilege to grant on the stage. To grant all privileges, use the value `ALL PRIVILEGES`.
     * 
     */
    @Export(name="privilege", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> privilege;

    /**
     * @return The privilege to grant on the stage. To grant all privileges, use the value `ALL PRIVILEGES`.
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
    private Output<List<String>> roles;

    /**
     * @return Grants privilege to these roles.
     * 
     */
    public Output<List<String>> roles() {
        return this.roles;
    }
    /**
     * The name of the schema containing the current stage on which to grant privileges.
     * 
     */
    @Export(name="schemaName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> schemaName;

    /**
     * @return The name of the schema containing the current stage on which to grant privileges.
     * 
     */
    public Output<Optional<String>> schemaName() {
        return Codegen.optional(this.schemaName);
    }
    /**
     * The name of the stage on which to grant privilege (only valid if on*future and on*all are false).
     * 
     */
    @Export(name="stageName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> stageName;

    /**
     * @return The name of the stage on which to grant privilege (only valid if on*future and on*all are false).
     * 
     */
    public Output<Optional<String>> stageName() {
        return Codegen.optional(this.stageName);
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
