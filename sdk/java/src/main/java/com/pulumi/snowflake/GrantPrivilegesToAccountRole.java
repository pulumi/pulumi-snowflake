// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.snowflake.GrantPrivilegesToAccountRoleArgs;
import com.pulumi.snowflake.Utilities;
import com.pulumi.snowflake.inputs.GrantPrivilegesToAccountRoleState;
import com.pulumi.snowflake.outputs.GrantPrivilegesToAccountRoleOnAccountObject;
import com.pulumi.snowflake.outputs.GrantPrivilegesToAccountRoleOnSchema;
import com.pulumi.snowflake.outputs.GrantPrivilegesToAccountRoleOnSchemaObject;
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
 * #### Grant all privileges OnAccountObject (Database)
 * 
 * ```sh
 * $ pulumi import snowflake:index/grantPrivilegesToAccountRole:GrantPrivilegesToAccountRole `&#34;\&#34;test_db_role\&#34;|false|false|ALL|OnAccountObject|DATABASE|\&#34;test_db\&#34;&#34;`
 * ```
 * 
 * #### Grant list of privileges OnAllSchemasInDatabase
 * 
 * ```sh
 * $ pulumi import snowflake:index/grantPrivilegesToAccountRole:GrantPrivilegesToAccountRole `&#34;\&#34;test_db_role\&#34;|false|false|CREATE TAG,CREATE TABLE|OnSchema|OnAllSchemasInDatabase|\&#34;test_db\&#34;&#34;`
 * ```
 * 
 * #### Grant list of privileges on table
 * 
 * ```sh
 * $ pulumi import snowflake:index/grantPrivilegesToAccountRole:GrantPrivilegesToAccountRole \&#34;test_table\&#34;&#34;`
 * ```
 * 
 * #### Grant list of privileges OnAll tables in schema
 * 
 * ```sh
 * $ pulumi import snowflake:index/grantPrivilegesToAccountRole:GrantPrivilegesToAccountRole \&#34;test_schema\&#34;&#34;`
 * ```
 * 
 */
@ResourceType(type="snowflake:index/grantPrivilegesToAccountRole:GrantPrivilegesToAccountRole")
public class GrantPrivilegesToAccountRole extends com.pulumi.resources.CustomResource {
    /**
     * The fully qualified name of the account role to which privileges will be granted.
     * 
     */
    @Export(name="accountRoleName", refs={String.class}, tree="[0]")
    private Output<String> accountRoleName;

    /**
     * @return The fully qualified name of the account role to which privileges will be granted.
     * 
     */
    public Output<String> accountRoleName() {
        return this.accountRoleName;
    }
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
    @Export(name="onAccountObject", refs={GrantPrivilegesToAccountRoleOnAccountObject.class}, tree="[0]")
    private Output</* @Nullable */ GrantPrivilegesToAccountRoleOnAccountObject> onAccountObject;

    /**
     * @return Specifies the account object on which privileges will be granted
     * 
     */
    public Output<Optional<GrantPrivilegesToAccountRoleOnAccountObject>> onAccountObject() {
        return Codegen.optional(this.onAccountObject);
    }
    /**
     * Specifies the schema on which privileges will be granted.
     * 
     */
    @Export(name="onSchema", refs={GrantPrivilegesToAccountRoleOnSchema.class}, tree="[0]")
    private Output</* @Nullable */ GrantPrivilegesToAccountRoleOnSchema> onSchema;

    /**
     * @return Specifies the schema on which privileges will be granted.
     * 
     */
    public Output<Optional<GrantPrivilegesToAccountRoleOnSchema>> onSchema() {
        return Codegen.optional(this.onSchema);
    }
    /**
     * Specifies the schema object on which privileges will be granted.
     * 
     */
    @Export(name="onSchemaObject", refs={GrantPrivilegesToAccountRoleOnSchemaObject.class}, tree="[0]")
    private Output</* @Nullable */ GrantPrivilegesToAccountRoleOnSchemaObject> onSchemaObject;

    /**
     * @return Specifies the schema object on which privileges will be granted.
     * 
     */
    public Output<Optional<GrantPrivilegesToAccountRoleOnSchemaObject>> onSchemaObject() {
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
    public GrantPrivilegesToAccountRole(String name) {
        this(name, GrantPrivilegesToAccountRoleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GrantPrivilegesToAccountRole(String name, GrantPrivilegesToAccountRoleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GrantPrivilegesToAccountRole(String name, GrantPrivilegesToAccountRoleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/grantPrivilegesToAccountRole:GrantPrivilegesToAccountRole", name, args == null ? GrantPrivilegesToAccountRoleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private GrantPrivilegesToAccountRole(String name, Output<String> id, @Nullable GrantPrivilegesToAccountRoleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/grantPrivilegesToAccountRole:GrantPrivilegesToAccountRole", name, state, makeResourceOptions(options, id));
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
    public static GrantPrivilegesToAccountRole get(String name, Output<String> id, @Nullable GrantPrivilegesToAccountRoleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new GrantPrivilegesToAccountRole(name, id, state, options);
    }
}
