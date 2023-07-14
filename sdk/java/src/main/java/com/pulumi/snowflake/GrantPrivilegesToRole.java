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
 * ## Example Usage
 * ### global privileges
 * ##################################
 * 
 * # list of privileges
 * resource &#34;snowflake_grant_privileges_to_role&#34; &#34;g1&#34; {
 *   privileges = [&#34;MODIFY&#34;, &#34;USAGE&#34;]
 *   role_name  = snowflake_role.r.name
 *   on_account = true
 * }
 * 
 * # all privileges + grant option
 * resource &#34;snowflake_grant_privileges_to_role&#34; &#34;g2&#34; {
 *   role_name         = snowflake_role.r.name
 *   on_account        = true
 *   all_privileges    = true
 *   with_grant_option = true
 * }
 * 
 * ##################################
 * ### account object privileges
 * ##################################
 * 
 * # list of privileges
 * resource &#34;snowflake_grant_privileges_to_role&#34; &#34;g3&#34; {
 *   privileges = [&#34;CREATE&#34;, &#34;MONITOR&#34;]
 *   role_name  = snowflake_role.r.name
 *   on_account_object {
 *     object_type = &#34;DATABASE&#34;
 *     object_name = snowflake_database.d.name
 *   }
 * }
 * 
 * # all privileges + grant option
 * resource &#34;snowflake_grant_privileges_to_role&#34; &#34;g4&#34; {
 *   role_name = snowflake_role.r.name
 *   on_account_object {
 *     object_type = &#34;DATABASE&#34;
 *     object_name = snowflake_database.d.name
 *   }
 *   all_privileges    = true
 *   with_grant_option = true
 * }
 * 
 * ##################################
 * ### schema privileges
 * ##################################
 * 
 * # list of privileges
 * resource &#34;snowflake_grant_privileges_to_role&#34; &#34;g5&#34; {
 *   privileges = [&#34;MODIFY&#34;, &#34;CREATE TABLE&#34;]
 *   role_name  = snowflake_role.r.name
 *   on_schema {
 *     schema_name = &#34;\&#34;my_db\&#34;.\&#34;my_schema\&#34;&#34; # note this is a fully qualified name!
 *   }
 * }
 * 
 * # all privileges + grant option
 * resource &#34;snowflake_grant_privileges_to_role&#34; &#34;g6&#34; {
 *   role_name = snowflake_role.r.name
 *   on_schema {
 *     schema_name = &#34;\&#34;my_db\&#34;.\&#34;my_schema\&#34;&#34; # note this is a fully qualified name!
 *   }
 *   all_privileges    = true
 *   with_grant_option = true
 * }
 * 
 * # all schemas in database
 * resource &#34;snowflake_grant_privileges_to_role&#34; &#34;g7&#34; {
 *   privileges = [&#34;MODIFY&#34;, &#34;CREATE TABLE&#34;]
 *   role_name  = snowflake_role.r.name
 *   on_schema {
 *     all_schemas_in_database = snowflake_database.d.name
 *   }
 * }
 * 
 * # future schemas in database
 * resource &#34;snowflake_grant_privileges_to_role&#34; &#34;g8&#34; {
 *   privileges = [&#34;MODIFY&#34;, &#34;CREATE TABLE&#34;]
 *   role_name  = snowflake_role.r.name
 *   on_schema {
 *     future_schemas_in_database = snowflake_database.d.name
 *   }
 * }
 * 
 * ##################################
 * 
 * ## Import
 * 
 * format is role_name (string) | privileges (comma-delimited string) | all_privileges (bool) |with_grant_option (bool) | on_account (bool) | on_account_object (bool) | on_schema (bool) | on_schema_object (bool) | all (bool) | future (bool) | object_type (string) | object_name (string) | object_type_plural (string) | in_schema (bool) | schema_name (string) | in_database (bool) | database_name (string)
 * 
 * ```sh
 *  $ pulumi import snowflake:index/grantPrivilegesToRole:GrantPrivilegesToRole &#34;test_role|MANAGE GRANTS,MONITOR USAGE|false|false|true|false|false|false|false|false||||false||false|&#34;
 * ```
 * 
 */
@ResourceType(type="snowflake:index/grantPrivilegesToRole:GrantPrivilegesToRole")
public class GrantPrivilegesToRole extends com.pulumi.resources.CustomResource {
    /**
     * Grant all privileges on the account role.
     * 
     */
    @Export(name="allPrivileges", type=Boolean.class, parameters={})
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
    @Export(name="onAccount", type=Boolean.class, parameters={})
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
    @Export(name="onAccountObject", type=GrantPrivilegesToRoleOnAccountObject.class, parameters={})
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
    @Export(name="onSchema", type=GrantPrivilegesToRoleOnSchema.class, parameters={})
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
    @Export(name="onSchemaObject", type=GrantPrivilegesToRoleOnSchemaObject.class, parameters={})
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
    @Export(name="privileges", type=List.class, parameters={String.class})
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
    @Export(name="roleName", type=String.class, parameters={})
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
    @Export(name="withGrantOption", type=Boolean.class, parameters={})
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