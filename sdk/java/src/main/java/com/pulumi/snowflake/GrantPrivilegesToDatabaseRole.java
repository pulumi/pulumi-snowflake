// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.snowflake.GrantPrivilegesToDatabaseRoleArgs;
import com.pulumi.snowflake.Utilities;
import com.pulumi.snowflake.inputs.GrantPrivilegesToDatabaseRoleState;
import com.pulumi.snowflake.outputs.GrantPrivilegesToDatabaseRoleOnSchema;
import com.pulumi.snowflake.outputs.GrantPrivilegesToDatabaseRoleOnSchemaObject;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * ### Import examples
 * 
 * #### Grant all privileges OnDatabase
 * 
 * ```sh
 * $ pulumi import snowflake:index/grantPrivilegesToDatabaseRole:GrantPrivilegesToDatabaseRole example &#39;&#34;test_db&#34;.&#34;test_db_role&#34;|false|false|ALL|OnDatabase|&#34;test_db&#34;&#39;`
 * ```
 * 
 * #### Grant list of privileges OnAllSchemasInDatabase
 * 
 * ```sh
 * $ pulumi import snowflake:index/grantPrivilegesToDatabaseRole:GrantPrivilegesToDatabaseRole example &#39;&#34;test_db&#34;.&#34;test_db_role&#34;|false|false|CREATE TAG,CREATE TABLE|OnSchema|OnAllSchemasInDatabase|&#34;test_db&#34;&#39;`
 * ```
 * 
 * #### Grant list of privileges on table
 * 
 * ```sh
 * $ pulumi import snowflake:index/grantPrivilegesToDatabaseRole:GrantPrivilegesToDatabaseRole example &#39;&#34;test_db&#34;.&#34;test_db_role&#34;|false|false|SELECT,DELETE,INSERT|OnSchemaObject|OnObject|TABLE|&#34;test_db&#34;.&#34;test_schema&#34;.&#34;test_table&#34;&#39;`
 * ```
 * 
 * #### Grant list of privileges OnAll tables in schema
 * 
 * ```sh
 * $ pulumi import snowflake:index/grantPrivilegesToDatabaseRole:GrantPrivilegesToDatabaseRole example &#39;&#34;test_db&#34;.&#34;test_db_role&#34;|false|false|SELECT,DELETE,INSERT|OnSchemaObject|OnAll|TABLES|InSchema|&#34;test_db&#34;.&#34;test_schema&#34;&#39;`
 * ```
 * 
 */
@ResourceType(type="snowflake:index/grantPrivilegesToDatabaseRole:GrantPrivilegesToDatabaseRole")
public class GrantPrivilegesToDatabaseRole extends com.pulumi.resources.CustomResource {
    /**
     * Grant all privileges on the database role.
     * 
     */
    @Export(name="allPrivileges", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> allPrivileges;

    /**
     * @return Grant all privileges on the database role.
     * 
     */
    public Output<Optional<Boolean>> allPrivileges() {
        return Codegen.optional(this.allPrivileges);
    }
    @Export(name="alwaysApply", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> alwaysApply;

    public Output<Optional<Boolean>> alwaysApply() {
        return Codegen.optional(this.alwaysApply);
    }
    /**
     * This is a helper field and should not be set. Its main purpose is to help to achieve the functionality described by the always_apply field.
     * 
     */
    @Export(name="alwaysApplyTrigger", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> alwaysApplyTrigger;

    /**
     * @return This is a helper field and should not be set. Its main purpose is to help to achieve the functionality described by the always_apply field.
     * 
     */
    public Output<Optional<String>> alwaysApplyTrigger() {
        return Codegen.optional(this.alwaysApplyTrigger);
    }
    /**
     * The fully qualified name of the database role to which privileges will be granted. For more information about this resource, see docs.
     * 
     */
    @Export(name="databaseRoleName", refs={String.class}, tree="[0]")
    private Output<String> databaseRoleName;

    /**
     * @return The fully qualified name of the database role to which privileges will be granted. For more information about this resource, see docs.
     * 
     */
    public Output<String> databaseRoleName() {
        return this.databaseRoleName;
    }
    /**
     * The fully qualified name of the database on which privileges will be granted. For more information about this resource, see docs.
     * 
     */
    @Export(name="onDatabase", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> onDatabase;

    /**
     * @return The fully qualified name of the database on which privileges will be granted. For more information about this resource, see docs.
     * 
     */
    public Output<Optional<String>> onDatabase() {
        return Codegen.optional(this.onDatabase);
    }
    /**
     * Specifies the schema on which privileges will be granted.
     * 
     */
    @Export(name="onSchema", refs={GrantPrivilegesToDatabaseRoleOnSchema.class}, tree="[0]")
    private Output</* @Nullable */ GrantPrivilegesToDatabaseRoleOnSchema> onSchema;

    /**
     * @return Specifies the schema on which privileges will be granted.
     * 
     */
    public Output<Optional<GrantPrivilegesToDatabaseRoleOnSchema>> onSchema() {
        return Codegen.optional(this.onSchema);
    }
    /**
     * Specifies the schema object on which privileges will be granted.
     * 
     */
    @Export(name="onSchemaObject", refs={GrantPrivilegesToDatabaseRoleOnSchemaObject.class}, tree="[0]")
    private Output</* @Nullable */ GrantPrivilegesToDatabaseRoleOnSchemaObject> onSchemaObject;

    /**
     * @return Specifies the schema object on which privileges will be granted.
     * 
     */
    public Output<Optional<GrantPrivilegesToDatabaseRoleOnSchemaObject>> onSchemaObject() {
        return Codegen.optional(this.onSchemaObject);
    }
    /**
     * The privileges to grant on the database role.
     * 
     */
    @Export(name="privileges", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> privileges;

    /**
     * @return The privileges to grant on the database role.
     * 
     */
    public Output<Optional<List<String>>> privileges() {
        return Codegen.optional(this.privileges);
    }
    /**
     * If specified, allows the recipient role to grant the privileges to other roles.
     * 
     */
    @Export(name="withGrantOption", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> withGrantOption;

    /**
     * @return If specified, allows the recipient role to grant the privileges to other roles.
     * 
     */
    public Output<Optional<Boolean>> withGrantOption() {
        return Codegen.optional(this.withGrantOption);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GrantPrivilegesToDatabaseRole(java.lang.String name) {
        this(name, GrantPrivilegesToDatabaseRoleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GrantPrivilegesToDatabaseRole(java.lang.String name, GrantPrivilegesToDatabaseRoleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GrantPrivilegesToDatabaseRole(java.lang.String name, GrantPrivilegesToDatabaseRoleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/grantPrivilegesToDatabaseRole:GrantPrivilegesToDatabaseRole", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private GrantPrivilegesToDatabaseRole(java.lang.String name, Output<java.lang.String> id, @Nullable GrantPrivilegesToDatabaseRoleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/grantPrivilegesToDatabaseRole:GrantPrivilegesToDatabaseRole", name, state, makeResourceOptions(options, id), false);
    }

    private static GrantPrivilegesToDatabaseRoleArgs makeArgs(GrantPrivilegesToDatabaseRoleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? GrantPrivilegesToDatabaseRoleArgs.Empty : args;
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
    public static GrantPrivilegesToDatabaseRole get(java.lang.String name, Output<java.lang.String> id, @Nullable GrantPrivilegesToDatabaseRoleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new GrantPrivilegesToDatabaseRole(name, id, state, options);
    }
}
