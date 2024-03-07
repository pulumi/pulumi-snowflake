// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.snowflake.GrantPrivilegesToRoleArgs;
import com.pulumi.snowflake.Utilities;
import com.pulumi.snowflake.inputs.GrantPrivilegesToRoleState;
import com.pulumi.snowflake.outputs.GrantPrivilegesToRoleOnAccountObject;
import com.pulumi.snowflake.outputs.GrantPrivilegesToRoleOnSchema;
import com.pulumi.snowflake.outputs.GrantPrivilegesToRoleOnSchemaObject;
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
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.snowflake.GrantPrivilegesToRole;
 * import com.pulumi.snowflake.GrantPrivilegesToRoleArgs;
 * import com.pulumi.snowflake.inputs.GrantPrivilegesToRoleOnAccountObjectArgs;
 * import com.pulumi.snowflake.inputs.GrantPrivilegesToRoleOnSchemaArgs;
 * import com.pulumi.snowflake.inputs.GrantPrivilegesToRoleOnSchemaObjectArgs;
 * import com.pulumi.snowflake.inputs.GrantPrivilegesToRoleOnSchemaObjectAllArgs;
 * import com.pulumi.snowflake.inputs.GrantPrivilegesToRoleOnSchemaObjectFutureArgs;
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
 *         var g1 = new GrantPrivilegesToRole(&#34;g1&#34;, GrantPrivilegesToRoleArgs.builder()        
 *             .privileges(            
 *                 &#34;MODIFY&#34;,
 *                 &#34;USAGE&#34;)
 *             .roleName(snowflake_role.r().name())
 *             .onAccount(true)
 *             .build());
 * 
 *         var g2 = new GrantPrivilegesToRole(&#34;g2&#34;, GrantPrivilegesToRoleArgs.builder()        
 *             .roleName(snowflake_role.r().name())
 *             .onAccount(true)
 *             .allPrivileges(true)
 *             .withGrantOption(true)
 *             .build());
 * 
 *         var g3 = new GrantPrivilegesToRole(&#34;g3&#34;, GrantPrivilegesToRoleArgs.builder()        
 *             .privileges(            
 *                 &#34;CREATE&#34;,
 *                 &#34;MONITOR&#34;)
 *             .roleName(snowflake_role.r().name())
 *             .onAccountObject(GrantPrivilegesToRoleOnAccountObjectArgs.builder()
 *                 .objectType(&#34;DATABASE&#34;)
 *                 .objectName(snowflake_database.d().name())
 *                 .build())
 *             .build());
 * 
 *         var g4 = new GrantPrivilegesToRole(&#34;g4&#34;, GrantPrivilegesToRoleArgs.builder()        
 *             .roleName(snowflake_role.r().name())
 *             .onAccountObject(GrantPrivilegesToRoleOnAccountObjectArgs.builder()
 *                 .objectType(&#34;DATABASE&#34;)
 *                 .objectName(snowflake_database.d().name())
 *                 .build())
 *             .allPrivileges(true)
 *             .withGrantOption(true)
 *             .build());
 * 
 *         var g5 = new GrantPrivilegesToRole(&#34;g5&#34;, GrantPrivilegesToRoleArgs.builder()        
 *             .privileges(            
 *                 &#34;MODIFY&#34;,
 *                 &#34;CREATE TABLE&#34;)
 *             .roleName(snowflake_role.r().name())
 *             .onSchema(GrantPrivilegesToRoleOnSchemaArgs.builder()
 *                 .schemaName(&#34;\&#34;my_db\&#34;.\&#34;my_schema\&#34;&#34;)
 *                 .build())
 *             .build());
 * 
 *         var g6 = new GrantPrivilegesToRole(&#34;g6&#34;, GrantPrivilegesToRoleArgs.builder()        
 *             .roleName(snowflake_role.r().name())
 *             .onSchema(GrantPrivilegesToRoleOnSchemaArgs.builder()
 *                 .schemaName(&#34;\&#34;my_db\&#34;.\&#34;my_schema\&#34;&#34;)
 *                 .build())
 *             .allPrivileges(true)
 *             .withGrantOption(true)
 *             .build());
 * 
 *         var g7 = new GrantPrivilegesToRole(&#34;g7&#34;, GrantPrivilegesToRoleArgs.builder()        
 *             .privileges(            
 *                 &#34;MODIFY&#34;,
 *                 &#34;CREATE TABLE&#34;)
 *             .roleName(snowflake_role.r().name())
 *             .onSchema(GrantPrivilegesToRoleOnSchemaArgs.builder()
 *                 .allSchemasInDatabase(snowflake_database.d().name())
 *                 .build())
 *             .build());
 * 
 *         var g8 = new GrantPrivilegesToRole(&#34;g8&#34;, GrantPrivilegesToRoleArgs.builder()        
 *             .privileges(            
 *                 &#34;MODIFY&#34;,
 *                 &#34;CREATE TABLE&#34;)
 *             .roleName(snowflake_role.r().name())
 *             .onSchema(GrantPrivilegesToRoleOnSchemaArgs.builder()
 *                 .futureSchemasInDatabase(snowflake_database.d().name())
 *                 .build())
 *             .build());
 * 
 *         var g9 = new GrantPrivilegesToRole(&#34;g9&#34;, GrantPrivilegesToRoleArgs.builder()        
 *             .privileges(            
 *                 &#34;SELECT&#34;,
 *                 &#34;REFERENCES&#34;)
 *             .roleName(snowflake_role.r().name())
 *             .onSchemaObject(GrantPrivilegesToRoleOnSchemaObjectArgs.builder()
 *                 .objectType(&#34;VIEW&#34;)
 *                 .objectName(&#34;\&#34;my_db\&#34;.\&#34;my_schema\&#34;.\&#34;my_view\&#34;&#34;)
 *                 .build())
 *             .build());
 * 
 *         var g10 = new GrantPrivilegesToRole(&#34;g10&#34;, GrantPrivilegesToRoleArgs.builder()        
 *             .roleName(snowflake_role.r().name())
 *             .onSchemaObject(GrantPrivilegesToRoleOnSchemaObjectArgs.builder()
 *                 .objectType(&#34;VIEW&#34;)
 *                 .objectName(&#34;\&#34;my_db\&#34;.\&#34;my_schema\&#34;.\&#34;my_view\&#34;&#34;)
 *                 .build())
 *             .allPrivileges(true)
 *             .withGrantOption(true)
 *             .build());
 * 
 *         var g11 = new GrantPrivilegesToRole(&#34;g11&#34;, GrantPrivilegesToRoleArgs.builder()        
 *             .privileges(            
 *                 &#34;SELECT&#34;,
 *                 &#34;INSERT&#34;)
 *             .roleName(snowflake_role.r().name())
 *             .onSchemaObject(GrantPrivilegesToRoleOnSchemaObjectArgs.builder()
 *                 .all(GrantPrivilegesToRoleOnSchemaObjectAllArgs.builder()
 *                     .objectTypePlural(&#34;TABLES&#34;)
 *                     .inDatabase(snowflake_database.d().name())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var g12 = new GrantPrivilegesToRole(&#34;g12&#34;, GrantPrivilegesToRoleArgs.builder()        
 *             .privileges(            
 *                 &#34;SELECT&#34;,
 *                 &#34;INSERT&#34;)
 *             .roleName(snowflake_role.r().name())
 *             .onSchemaObject(GrantPrivilegesToRoleOnSchemaObjectArgs.builder()
 *                 .all(GrantPrivilegesToRoleOnSchemaObjectAllArgs.builder()
 *                     .objectTypePlural(&#34;TABLES&#34;)
 *                     .inSchema(&#34;\&#34;my_db\&#34;.\&#34;my_schema\&#34;&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var g13 = new GrantPrivilegesToRole(&#34;g13&#34;, GrantPrivilegesToRoleArgs.builder()        
 *             .privileges(            
 *                 &#34;SELECT&#34;,
 *                 &#34;INSERT&#34;)
 *             .roleName(snowflake_role.r().name())
 *             .onSchemaObject(GrantPrivilegesToRoleOnSchemaObjectArgs.builder()
 *                 .future(GrantPrivilegesToRoleOnSchemaObjectFutureArgs.builder()
 *                     .objectTypePlural(&#34;TABLES&#34;)
 *                     .inDatabase(snowflake_database.d().name())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var g14 = new GrantPrivilegesToRole(&#34;g14&#34;, GrantPrivilegesToRoleArgs.builder()        
 *             .privileges(            
 *                 &#34;SELECT&#34;,
 *                 &#34;INSERT&#34;)
 *             .roleName(snowflake_role.r().name())
 *             .onSchemaObject(GrantPrivilegesToRoleOnSchemaObjectArgs.builder()
 *                 .future(GrantPrivilegesToRoleOnSchemaObjectFutureArgs.builder()
 *                     .objectTypePlural(&#34;TABLES&#34;)
 *                     .inSchema(&#34;\&#34;my_db\&#34;.\&#34;my_schema\&#34;&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * format is role_name (string) | privileges (comma-delimited string) | all_privileges (bool) |with_grant_option (bool) | on_account (bool) | on_account_object (bool) | on_schema (bool) | on_schema_object (bool) | all (bool) | future (bool) | object_type (string) | object_name (string) | object_type_plural (string) | in_schema (bool) | schema_name (string) | in_database (bool) | database_name (string)
 * 
 * ```sh
 * $ pulumi import snowflake:index/grantPrivilegesToRole:GrantPrivilegesToRole &#34;test_role|MANAGE GRANTS,MONITOR USAGE|false|false|true|false|false|false|false|false||||false||false|&#34;
 * ```
 * 
 */
@ResourceType(type="snowflake:index/grantPrivilegesToRole:GrantPrivilegesToRole")
public class GrantPrivilegesToRole extends com.pulumi.resources.CustomResource {
    /**
     * Grant all privileges on the account role.
     * 
     */
    @Export(name="allPrivileges", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> allPrivileges;

    /**
     * @return Grant all privileges on the account role.
     * 
     */
    public Output<Optional<Boolean>> allPrivileges() {
        return Codegen.optional(this.allPrivileges);
    }
    /**
     * If true, the privileges will be granted on the account.
     * 
     */
    @Export(name="onAccount", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> onAccount;

    /**
     * @return If true, the privileges will be granted on the account.
     * 
     */
    public Output<Optional<Boolean>> onAccount() {
        return Codegen.optional(this.onAccount);
    }
    /**
     * Specifies the account object on which privileges will be granted
     * 
     */
    @Export(name="onAccountObject", refs={GrantPrivilegesToRoleOnAccountObject.class}, tree="[0]")
    private Output</* @Nullable */ GrantPrivilegesToRoleOnAccountObject> onAccountObject;

    /**
     * @return Specifies the account object on which privileges will be granted
     * 
     */
    public Output<Optional<GrantPrivilegesToRoleOnAccountObject>> onAccountObject() {
        return Codegen.optional(this.onAccountObject);
    }
    /**
     * Specifies the schema on which privileges will be granted.
     * 
     */
    @Export(name="onSchema", refs={GrantPrivilegesToRoleOnSchema.class}, tree="[0]")
    private Output</* @Nullable */ GrantPrivilegesToRoleOnSchema> onSchema;

    /**
     * @return Specifies the schema on which privileges will be granted.
     * 
     */
    public Output<Optional<GrantPrivilegesToRoleOnSchema>> onSchema() {
        return Codegen.optional(this.onSchema);
    }
    /**
     * Specifies the schema object on which privileges will be granted.
     * 
     */
    @Export(name="onSchemaObject", refs={GrantPrivilegesToRoleOnSchemaObject.class}, tree="[0]")
    private Output</* @Nullable */ GrantPrivilegesToRoleOnSchemaObject> onSchemaObject;

    /**
     * @return Specifies the schema object on which privileges will be granted.
     * 
     */
    public Output<Optional<GrantPrivilegesToRoleOnSchemaObject>> onSchemaObject() {
        return Codegen.optional(this.onSchemaObject);
    }
    /**
     * The privileges to grant on the account role.
     * 
     */
    @Export(name="privileges", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> privileges;

    /**
     * @return The privileges to grant on the account role.
     * 
     */
    public Output<Optional<List<String>>> privileges() {
        return Codegen.optional(this.privileges);
    }
    /**
     * The fully qualified name of the role to which privileges will be granted.
     * 
     */
    @Export(name="roleName", refs={String.class}, tree="[0]")
    private Output<String> roleName;

    /**
     * @return The fully qualified name of the role to which privileges will be granted.
     * 
     */
    public Output<String> roleName() {
        return this.roleName;
    }
    /**
     * Specifies whether the grantee can grant the privileges to other users.
     * 
     */
    @Export(name="withGrantOption", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> withGrantOption;

    /**
     * @return Specifies whether the grantee can grant the privileges to other users.
     * 
     */
    public Output<Optional<Boolean>> withGrantOption() {
        return Codegen.optional(this.withGrantOption);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GrantPrivilegesToRole(String name) {
        this(name, GrantPrivilegesToRoleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GrantPrivilegesToRole(String name, GrantPrivilegesToRoleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GrantPrivilegesToRole(String name, GrantPrivilegesToRoleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/grantPrivilegesToRole:GrantPrivilegesToRole", name, args == null ? GrantPrivilegesToRoleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private GrantPrivilegesToRole(String name, Output<String> id, @Nullable GrantPrivilegesToRoleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/grantPrivilegesToRole:GrantPrivilegesToRole", name, state, makeResourceOptions(options, id));
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
    public static GrantPrivilegesToRole get(String name, Output<String> id, @Nullable GrantPrivilegesToRoleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new GrantPrivilegesToRole(name, id, state, options);
    }
}
