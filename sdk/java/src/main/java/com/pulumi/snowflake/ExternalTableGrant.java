// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.snowflake.ExternalTableGrantArgs;
import com.pulumi.snowflake.Utilities;
import com.pulumi.snowflake.inputs.ExternalTableGrantState;
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
 * import com.pulumi.snowflake.ExternalTableGrant;
 * import com.pulumi.snowflake.ExternalTableGrantArgs;
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
 *         var grant = new ExternalTableGrant(&#34;grant&#34;, ExternalTableGrantArgs.builder()        
 *             .databaseName(&#34;database&#34;)
 *             .externalTableName(&#34;external_table&#34;)
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
 * format is database|schema|external_table|privilege|with_grant_option|on_future|roles|shares
 * 
 * ```sh
 *  $ pulumi import snowflake:index/externalTableGrant:ExternalTableGrant example &#34;MY_DATABASE|MY_SCHEMA|MY_TABLE_NAME|SELECT|false|false|role1,role2|share1,share2&#34;
 * ```
 * 
 */
@ResourceType(type="snowflake:index/externalTableGrant:ExternalTableGrant")
public class ExternalTableGrant extends com.pulumi.resources.CustomResource {
    /**
     * The name of the database containing the current or future external tables on which to grant privileges.
     * 
     */
    @Export(name="databaseName", type=String.class, parameters={})
    private Output<String> databaseName;

    /**
     * @return The name of the database containing the current or future external tables on which to grant privileges.
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
     * The name of the external table on which to grant privileges immediately (only valid if on_future is false).
     * 
     */
    @Export(name="externalTableName", type=String.class, parameters={})
    private Output</* @Nullable */ String> externalTableName;

    /**
     * @return The name of the external table on which to grant privileges immediately (only valid if on_future is false).
     * 
     */
    public Output<Optional<String>> externalTableName() {
        return Codegen.optional(this.externalTableName);
    }
    /**
     * When this is set to true and a schema*name is provided, apply this grant on all external tables in the given schema. When this is true and no schema*name is provided apply this grant on all external tables in the given database. The external*table*name and shares fields must be unset in order to use on*all. Cannot be used together with on*future.
     * 
     */
    @Export(name="onAll", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> onAll;

    /**
     * @return When this is set to true and a schema*name is provided, apply this grant on all external tables in the given schema. When this is true and no schema*name is provided apply this grant on all external tables in the given database. The external*table*name and shares fields must be unset in order to use on*all. Cannot be used together with on*future.
     * 
     */
    public Output<Optional<Boolean>> onAll() {
        return Codegen.optional(this.onAll);
    }
    /**
     * When this is set to true and a schema*name is provided, apply this grant on all future external tables in the given schema. When this is true and no schema*name is provided apply this grant on all future external tables in the given database. The external*table*name and shares fields must be unset in order to use on*future. Cannot be used together with on*all.
     * 
     */
    @Export(name="onFuture", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> onFuture;

    /**
     * @return When this is set to true and a schema*name is provided, apply this grant on all future external tables in the given schema. When this is true and no schema*name is provided apply this grant on all future external tables in the given database. The external*table*name and shares fields must be unset in order to use on*future. Cannot be used together with on*all.
     * 
     */
    public Output<Optional<Boolean>> onFuture() {
        return Codegen.optional(this.onFuture);
    }
    /**
     * The privilege to grant on the current or future external table.
     * 
     */
    @Export(name="privilege", type=String.class, parameters={})
    private Output</* @Nullable */ String> privilege;

    /**
     * @return The privilege to grant on the current or future external table.
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
    private Output<List<String>> roles;

    /**
     * @return Grants privilege to these roles.
     * 
     */
    public Output<List<String>> roles() {
        return this.roles;
    }
    /**
     * The name of the schema containing the current or future external tables on which to grant privileges.
     * 
     */
    @Export(name="schemaName", type=String.class, parameters={})
    private Output</* @Nullable */ String> schemaName;

    /**
     * @return The name of the schema containing the current or future external tables on which to grant privileges.
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
    public ExternalTableGrant(String name) {
        this(name, ExternalTableGrantArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ExternalTableGrant(String name, ExternalTableGrantArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ExternalTableGrant(String name, ExternalTableGrantArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/externalTableGrant:ExternalTableGrant", name, args == null ? ExternalTableGrantArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ExternalTableGrant(String name, Output<String> id, @Nullable ExternalTableGrantState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/externalTableGrant:ExternalTableGrant", name, state, makeResourceOptions(options, id));
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
    public static ExternalTableGrant get(String name, Output<String> id, @Nullable ExternalTableGrantState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ExternalTableGrant(name, id, state, options);
    }
}
