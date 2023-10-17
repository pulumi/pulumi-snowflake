// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.snowflake.ProcedureGrantArgs;
import com.pulumi.snowflake.Utilities;
import com.pulumi.snowflake.inputs.ProcedureGrantState;
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
 * import com.pulumi.snowflake.ProcedureGrant;
 * import com.pulumi.snowflake.ProcedureGrantArgs;
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
 *         var grant = new ProcedureGrant(&#34;grant&#34;, ProcedureGrantArgs.builder()        
 *             .argumentDataTypes(            
 *                 &#34;array&#34;,
 *                 &#34;string&#34;)
 *             .databaseName(&#34;database&#34;)
 *             .onFuture(false)
 *             .privilege(&#34;USAGE&#34;)
 *             .procedureName(&#34;procedure&#34;)
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
 * format is database_name|schema_name|procedure_name|argument_data_types|privilege|with_grant_option|on_future|roles|shares
 * 
 * ```sh
 *  $ pulumi import snowflake:index/procedureGrant:ProcedureGrant example &#34;MY_DATABASE|MY_SCHEMA|MY_PROCEDURE|ARG1TYPE,ARG2TYPE|USAGE|false|false|role1,role2|share1,share2&#34;
 * ```
 * 
 */
@ResourceType(type="snowflake:index/procedureGrant:ProcedureGrant")
public class ProcedureGrant extends com.pulumi.resources.CustomResource {
    /**
     * List of the argument data types for the procedure (must be present if procedure has arguments and procedure_name is present)
     * 
     */
    @Export(name="argumentDataTypes", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> argumentDataTypes;

    /**
     * @return List of the argument data types for the procedure (must be present if procedure has arguments and procedure_name is present)
     * 
     */
    public Output<Optional<List<String>>> argumentDataTypes() {
        return Codegen.optional(this.argumentDataTypes);
    }
    /**
     * The name of the database containing the current or future procedures on which to grant privileges.
     * 
     */
    @Export(name="databaseName", refs={String.class}, tree="[0]")
    private Output<String> databaseName;

    /**
     * @return The name of the database containing the current or future procedures on which to grant privileges.
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
     * When this is set to true and a schema*name is provided, apply this grant on all procedures in the given schema. When this is true and no schema*name is provided apply this grant on all procedures in the given database. The procedure*name and shares fields must be unset in order to use on*all. Cannot be used together with on_future.
     * 
     */
    @Export(name="onAll", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> onAll;

    /**
     * @return When this is set to true and a schema*name is provided, apply this grant on all procedures in the given schema. When this is true and no schema*name is provided apply this grant on all procedures in the given database. The procedure*name and shares fields must be unset in order to use on*all. Cannot be used together with on_future.
     * 
     */
    public Output<Optional<Boolean>> onAll() {
        return Codegen.optional(this.onAll);
    }
    /**
     * When this is set to true and a schema*name is provided, apply this grant on all future procedures in the given schema. When this is true and no schema*name is provided apply this grant on all future procedures in the given database. The procedure*name and shares fields must be unset in order to use on*future. Cannot be used together with on_all.
     * 
     */
    @Export(name="onFuture", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> onFuture;

    /**
     * @return When this is set to true and a schema*name is provided, apply this grant on all future procedures in the given schema. When this is true and no schema*name is provided apply this grant on all future procedures in the given database. The procedure*name and shares fields must be unset in order to use on*future. Cannot be used together with on_all.
     * 
     */
    public Output<Optional<Boolean>> onFuture() {
        return Codegen.optional(this.onFuture);
    }
    /**
     * The privilege to grant on the current or future procedure. To grant all privileges, use the value `ALL PRIVILEGES`
     * 
     */
    @Export(name="privilege", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> privilege;

    /**
     * @return The privilege to grant on the current or future procedure. To grant all privileges, use the value `ALL PRIVILEGES`
     * 
     */
    public Output<Optional<String>> privilege() {
        return Codegen.optional(this.privilege);
    }
    /**
     * The name of the procedure on which to grant privileges immediately (only valid if on_future is false).
     * 
     */
    @Export(name="procedureName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> procedureName;

    /**
     * @return The name of the procedure on which to grant privileges immediately (only valid if on_future is false).
     * 
     */
    public Output<Optional<String>> procedureName() {
        return Codegen.optional(this.procedureName);
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
     * The name of the schema containing the current or future procedures on which to grant privileges.
     * 
     */
    @Export(name="schemaName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> schemaName;

    /**
     * @return The name of the schema containing the current or future procedures on which to grant privileges.
     * 
     */
    public Output<Optional<String>> schemaName() {
        return Codegen.optional(this.schemaName);
    }
    /**
     * Grants privilege to these shares (only valid if on_future is false).
     * 
     */
    @Export(name="shares", refs={List.class,String.class}, tree="[0,1]")
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
    public ProcedureGrant(String name) {
        this(name, ProcedureGrantArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ProcedureGrant(String name, ProcedureGrantArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ProcedureGrant(String name, ProcedureGrantArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/procedureGrant:ProcedureGrant", name, args == null ? ProcedureGrantArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ProcedureGrant(String name, Output<String> id, @Nullable ProcedureGrantState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/procedureGrant:ProcedureGrant", name, state, makeResourceOptions(options, id));
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
    public static ProcedureGrant get(String name, Output<String> id, @Nullable ProcedureGrantState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ProcedureGrant(name, id, state, options);
    }
}
