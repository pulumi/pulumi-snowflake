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
 * !&gt; **Warning** Be careful when using `always_apply` field. It will always produce a plan (even when no changes were made) and can be harmful in some setups. For more details why we decided to introduce it to go our document explaining those design decisions (coming soon).
 * 
 * ## Example Usage
 * ### on database privileges
 * ##################################
 * 
 * # list of privileges
 * resource &#34;snowflake_grant_privileges_to_database_role&#34; &#34;example&#34; {
 *   privileges         = [&#34;CREATE&#34;, &#34;MONITOR&#34;]
 *   database_role_name = &#34;\&#34;${snowflake_database_role.db_role.database}\&#34;.\&#34;${snowflake_database_role.db_role.name}\&#34;&#34;
 *   on_database        = snowflake_database_role.db_role.database
 * }
 * 
 * # all privileges + grant option
 * resource &#34;snowflake_grant_privileges_to_database_role&#34; &#34;example&#34; {
 *   database_role_name = &#34;\&#34;${snowflake_database_role.db_role.database}\&#34;.\&#34;${snowflake_database_role.db_role.name}\&#34;&#34;
 *   on_database        = snowflake_database_role.db_role.database
 *   all_privileges     = true
 *   with_grant_option  = true
 * }
 * 
 * # all privileges + grant option + always apply
 * resource &#34;snowflake_grant_privileges_to_database_role&#34; &#34;example&#34; {
 *   database_role_name = &#34;\&#34;${snowflake_database_role.db_role.database}\&#34;.\&#34;${snowflake_database_role.db_role.name}\&#34;&#34;
 *   on_database        = snowflake_database_role.db_role.database
 *   always_apply       = true
 *   all_privileges     = true
 *   with_grant_option  = true
 * }
 * 
 * ##################################
 * ### schema privileges
 * ##################################
 * 
 * # list of privileges
 * resource &#34;snowflake_grant_privileges_to_database_role&#34; &#34;example&#34; {
 *   privileges         = [&#34;MODIFY&#34;, &#34;CREATE TABLE&#34;]
 *   database_role_name = &#34;\&#34;${snowflake_database_role.db_role.database}\&#34;.\&#34;${snowflake_database_role.db_role.name}\&#34;&#34;
 *   on_schema {
 *     schema_name = &#34;\&#34;${snowflake_database_role.db_role.database}\&#34;.\&#34;my_schema\&#34;&#34; # note this is a fully qualified name!
 *   }
 * }
 * 
 * # all privileges + grant option
 * resource &#34;snowflake_grant_privileges_to_database_role&#34; &#34;example&#34; {
 *   database_role_name = &#34;\&#34;${snowflake_database_role.db_role.database}\&#34;.\&#34;${snowflake_database_role.db_role.name}\&#34;&#34;
 *   on_schema {
 *     schema_name = &#34;\&#34;${snowflake_database_role.db_role.database}\&#34;.\&#34;my_schema\&#34;&#34; # note this is a fully qualified name!
 *   }
 *   all_privileges    = true
 *   with_grant_option = true
 * }
 * 
 * # all schemas in database
 * resource &#34;snowflake_grant_privileges_to_database_role&#34; &#34;example&#34; {
 *   privileges         = [&#34;MODIFY&#34;, &#34;CREATE TABLE&#34;]
 *   database_role_name = &#34;\&#34;${snowflake_database_role.db_role.database}\&#34;.\&#34;${snowflake_database_role.db_role.name}\&#34;&#34;
 *   on_schema {
 *     all_schemas_in_database = snowflake_database_role.db_role.database
 *   }
 * }
 * 
 * # future schemas in database
 * resource &#34;snowflake_grant_privileges_to_database_role&#34; &#34;example&#34; {
 *   privileges         = [&#34;MODIFY&#34;, &#34;CREATE TABLE&#34;]
 *   database_role_name = &#34;\&#34;${snowflake_database_role.db_role.database}\&#34;.\&#34;${snowflake_database_role.db_role.name}\&#34;&#34;
 *   on_schema {
 *     future_schemas_in_database = snowflake_database_role.db_role.database
 *   }
 * }
 * 
 * ##################################
 * 
 * ## Import
 * 
 * ### Import examples #### Grant all privileges OnDatabase
 * 
 * ```sh
 *  $ pulumi import snowflake:index/grantPrivilegesToDatabaseRole:GrantPrivilegesToDatabaseRole \&#34;test_db_role\&#34;|false|false|ALL|OnDatabase|\&#34;test_db\&#34;&#34;`
 * ```
 * 
 * #### Grant list of privileges OnAllSchemasInDatabase
 * 
 * ```sh
 *  $ pulumi import snowflake:index/grantPrivilegesToDatabaseRole:GrantPrivilegesToDatabaseRole \&#34;test_db_role\&#34;|false|false|CREATE TAG,CREATE TABLE|OnSchema|OnAllSchemasInDatabase|\&#34;test_db\&#34;&#34;`
 * ```
 * 
 * #### Grant list of privileges on table
 * 
 * ```sh
 *  $ pulumi import snowflake:index/grantPrivilegesToDatabaseRole:GrantPrivilegesToDatabaseRole \&#34;test_table\&#34;&#34;`
 * ```
 * 
 * #### Grant list of privileges OnAll tables in schema
 * 
 * ```sh
 *  $ pulumi import snowflake:index/grantPrivilegesToDatabaseRole:GrantPrivilegesToDatabaseRole \&#34;test_schema\&#34;&#34;`
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
    /**
     * If true, the resource will always produce a “plan” and on “apply” it will re-grant defined privileges. It is
     * supposed to be used only in “grant privileges on all X’s in database / schema Y” or “grant all privileges to
     * X” scenarios to make sure that every new object in a given database / schema is granted by the account role and every
     * new privilege is granted to the database role. Important note: this flag is not compliant with the Terraform assumptions
     * of the config being eventually convergent (producing an empty plan).
     * 
     */
    @Export(name="alwaysApply", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> alwaysApply;

    /**
     * @return If true, the resource will always produce a “plan” and on “apply” it will re-grant defined privileges. It is
     * supposed to be used only in “grant privileges on all X’s in database / schema Y” or “grant all privileges to
     * X” scenarios to make sure that every new object in a given database / schema is granted by the account role and every
     * new privilege is granted to the database role. Important note: this flag is not compliant with the Terraform assumptions
     * of the config being eventually convergent (producing an empty plan).
     * 
     */
    public Output<Optional<Boolean>> alwaysApply() {
        return Codegen.optional(this.alwaysApply);
    }
    /**
     * This field should not be set and its main purpose is to achieve the functionality described by always_apply field. This is value will be flipped to the opposite value on every pulumi up, thus creating a new plan that will re-apply grants.
     * 
     */
    @Export(name="alwaysApplyTrigger", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> alwaysApplyTrigger;

    /**
     * @return This field should not be set and its main purpose is to achieve the functionality described by always_apply field. This is value will be flipped to the opposite value on every pulumi up, thus creating a new plan that will re-apply grants.
     * 
     */
    public Output<Optional<String>> alwaysApplyTrigger() {
        return Codegen.optional(this.alwaysApplyTrigger);
    }
    /**
     * The fully qualified name of the database role to which privileges will be granted.
     * 
     */
    @Export(name="databaseRoleName", refs={String.class}, tree="[0]")
    private Output<String> databaseRoleName;

    /**
     * @return The fully qualified name of the database role to which privileges will be granted.
     * 
     */
    public Output<String> databaseRoleName() {
        return this.databaseRoleName;
    }
    /**
     * The fully qualified name of the database on which privileges will be granted.
     * 
     */
    @Export(name="onDatabase", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> onDatabase;

    /**
     * @return The fully qualified name of the database on which privileges will be granted.
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
    public GrantPrivilegesToDatabaseRole(String name) {
        this(name, GrantPrivilegesToDatabaseRoleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GrantPrivilegesToDatabaseRole(String name, GrantPrivilegesToDatabaseRoleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GrantPrivilegesToDatabaseRole(String name, GrantPrivilegesToDatabaseRoleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/grantPrivilegesToDatabaseRole:GrantPrivilegesToDatabaseRole", name, args == null ? GrantPrivilegesToDatabaseRoleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private GrantPrivilegesToDatabaseRole(String name, Output<String> id, @Nullable GrantPrivilegesToDatabaseRoleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/grantPrivilegesToDatabaseRole:GrantPrivilegesToDatabaseRole", name, state, makeResourceOptions(options, id));
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
    public static GrantPrivilegesToDatabaseRole get(String name, Output<String> id, @Nullable GrantPrivilegesToDatabaseRoleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new GrantPrivilegesToDatabaseRole(name, id, state, options);
    }
}