// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * !> **Warning** Be careful when using `alwaysApply` field. It will always produce a plan (even when no changes were made) and can be harmful in some setups. For more details why we decided to introduce it to go our document explaining those design decisions (coming soon).
 *
 * ## Example Usage
 * ### on database privileges
 * ##################################
 *
 * # list of privileges
 * resource "snowflake_grant_privileges_to_database_role" "example" {
 *   privileges         = ["CREATE", "MONITOR"]
 *   database_role_name = "\"${snowflake_database_role.db_role.database}\".\"${snowflake_database_role.db_role.name}\""
 *   on_database        = snowflake_database_role.db_role.database
 * }
 *
 * # all privileges + grant option
 * resource "snowflake_grant_privileges_to_database_role" "example" {
 *   database_role_name = "\"${snowflake_database_role.db_role.database}\".\"${snowflake_database_role.db_role.name}\""
 *   on_database        = snowflake_database_role.db_role.database
 *   all_privileges     = true
 *   with_grant_option  = true
 * }
 *
 * # all privileges + grant option + always apply
 * resource "snowflake_grant_privileges_to_database_role" "example" {
 *   database_role_name = "\"${snowflake_database_role.db_role.database}\".\"${snowflake_database_role.db_role.name}\""
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
 * resource "snowflake_grant_privileges_to_database_role" "example" {
 *   privileges         = ["MODIFY", "CREATE TABLE"]
 *   database_role_name = "\"${snowflake_database_role.db_role.database}\".\"${snowflake_database_role.db_role.name}\""
 *   on_schema {
 *     schema_name = "\"${snowflake_database_role.db_role.database}\".\"my_schema\"" # note this is a fully qualified name!
 *   }
 * }
 *
 * # all privileges + grant option
 * resource "snowflake_grant_privileges_to_database_role" "example" {
 *   database_role_name = "\"${snowflake_database_role.db_role.database}\".\"${snowflake_database_role.db_role.name}\""
 *   on_schema {
 *     schema_name = "\"${snowflake_database_role.db_role.database}\".\"my_schema\"" # note this is a fully qualified name!
 *   }
 *   all_privileges    = true
 *   with_grant_option = true
 * }
 *
 * # all schemas in database
 * resource "snowflake_grant_privileges_to_database_role" "example" {
 *   privileges         = ["MODIFY", "CREATE TABLE"]
 *   database_role_name = "\"${snowflake_database_role.db_role.database}\".\"${snowflake_database_role.db_role.name}\""
 *   on_schema {
 *     all_schemas_in_database = snowflake_database_role.db_role.database
 *   }
 * }
 *
 * # future schemas in database
 * resource "snowflake_grant_privileges_to_database_role" "example" {
 *   privileges         = ["MODIFY", "CREATE TABLE"]
 *   database_role_name = "\"${snowflake_database_role.db_role.database}\".\"${snowflake_database_role.db_role.name}\""
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
 *  $ pulumi import snowflake:index/grantPrivilegesToDatabaseRole:GrantPrivilegesToDatabaseRole \"test_db_role\"|false|false|ALL|OnDatabase|\"test_db\""`
 * ```
 *
 * #### Grant list of privileges OnAllSchemasInDatabase
 *
 * ```sh
 *  $ pulumi import snowflake:index/grantPrivilegesToDatabaseRole:GrantPrivilegesToDatabaseRole \"test_db_role\"|false|false|CREATE TAG,CREATE TABLE|OnSchema|OnAllSchemasInDatabase|\"test_db\""`
 * ```
 *
 * #### Grant list of privileges on table
 *
 * ```sh
 *  $ pulumi import snowflake:index/grantPrivilegesToDatabaseRole:GrantPrivilegesToDatabaseRole \"test_table\""`
 * ```
 *
 * #### Grant list of privileges OnAll tables in schema
 *
 * ```sh
 *  $ pulumi import snowflake:index/grantPrivilegesToDatabaseRole:GrantPrivilegesToDatabaseRole \"test_schema\""`
 * ```
 */
export class GrantPrivilegesToDatabaseRole extends pulumi.CustomResource {
    /**
     * Get an existing GrantPrivilegesToDatabaseRole resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: GrantPrivilegesToDatabaseRoleState, opts?: pulumi.CustomResourceOptions): GrantPrivilegesToDatabaseRole {
        return new GrantPrivilegesToDatabaseRole(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'snowflake:index/grantPrivilegesToDatabaseRole:GrantPrivilegesToDatabaseRole';

    /**
     * Returns true if the given object is an instance of GrantPrivilegesToDatabaseRole.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is GrantPrivilegesToDatabaseRole {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === GrantPrivilegesToDatabaseRole.__pulumiType;
    }

    /**
     * Grant all privileges on the database role.
     */
    public readonly allPrivileges!: pulumi.Output<boolean | undefined>;
    /**
     * If true, the resource will always produce a “plan” and on “apply” it will re-grant defined privileges. It is
     * supposed to be used only in “grant privileges on all X’s in database / schema Y” or “grant all privileges to
     * X” scenarios to make sure that every new object in a given database / schema is granted by the account role and every
     * new privilege is granted to the database role. Important note: this flag is not compliant with the Terraform assumptions
     * of the config being eventually convergent (producing an empty plan).
     */
    public readonly alwaysApply!: pulumi.Output<boolean | undefined>;
    /**
     * This field should not be set and its main purpose is to achieve the functionality described by alwaysApply field. This is value will be flipped to the opposite value on every pulumi up, thus creating a new plan that will re-apply grants.
     */
    public readonly alwaysApplyTrigger!: pulumi.Output<string | undefined>;
    /**
     * The fully qualified name of the database role to which privileges will be granted.
     */
    public readonly databaseRoleName!: pulumi.Output<string>;
    /**
     * The fully qualified name of the database on which privileges will be granted.
     */
    public readonly onDatabase!: pulumi.Output<string | undefined>;
    /**
     * Specifies the schema on which privileges will be granted.
     */
    public readonly onSchema!: pulumi.Output<outputs.GrantPrivilegesToDatabaseRoleOnSchema | undefined>;
    /**
     * Specifies the schema object on which privileges will be granted.
     */
    public readonly onSchemaObject!: pulumi.Output<outputs.GrantPrivilegesToDatabaseRoleOnSchemaObject | undefined>;
    /**
     * The privileges to grant on the database role.
     */
    public readonly privileges!: pulumi.Output<string[] | undefined>;
    /**
     * If specified, allows the recipient role to grant the privileges to other roles.
     */
    public readonly withGrantOption!: pulumi.Output<boolean | undefined>;

    /**
     * Create a GrantPrivilegesToDatabaseRole resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: GrantPrivilegesToDatabaseRoleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: GrantPrivilegesToDatabaseRoleArgs | GrantPrivilegesToDatabaseRoleState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as GrantPrivilegesToDatabaseRoleState | undefined;
            resourceInputs["allPrivileges"] = state ? state.allPrivileges : undefined;
            resourceInputs["alwaysApply"] = state ? state.alwaysApply : undefined;
            resourceInputs["alwaysApplyTrigger"] = state ? state.alwaysApplyTrigger : undefined;
            resourceInputs["databaseRoleName"] = state ? state.databaseRoleName : undefined;
            resourceInputs["onDatabase"] = state ? state.onDatabase : undefined;
            resourceInputs["onSchema"] = state ? state.onSchema : undefined;
            resourceInputs["onSchemaObject"] = state ? state.onSchemaObject : undefined;
            resourceInputs["privileges"] = state ? state.privileges : undefined;
            resourceInputs["withGrantOption"] = state ? state.withGrantOption : undefined;
        } else {
            const args = argsOrState as GrantPrivilegesToDatabaseRoleArgs | undefined;
            if ((!args || args.databaseRoleName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'databaseRoleName'");
            }
            resourceInputs["allPrivileges"] = args ? args.allPrivileges : undefined;
            resourceInputs["alwaysApply"] = args ? args.alwaysApply : undefined;
            resourceInputs["alwaysApplyTrigger"] = args ? args.alwaysApplyTrigger : undefined;
            resourceInputs["databaseRoleName"] = args ? args.databaseRoleName : undefined;
            resourceInputs["onDatabase"] = args ? args.onDatabase : undefined;
            resourceInputs["onSchema"] = args ? args.onSchema : undefined;
            resourceInputs["onSchemaObject"] = args ? args.onSchemaObject : undefined;
            resourceInputs["privileges"] = args ? args.privileges : undefined;
            resourceInputs["withGrantOption"] = args ? args.withGrantOption : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(GrantPrivilegesToDatabaseRole.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering GrantPrivilegesToDatabaseRole resources.
 */
export interface GrantPrivilegesToDatabaseRoleState {
    /**
     * Grant all privileges on the database role.
     */
    allPrivileges?: pulumi.Input<boolean>;
    /**
     * If true, the resource will always produce a “plan” and on “apply” it will re-grant defined privileges. It is
     * supposed to be used only in “grant privileges on all X’s in database / schema Y” or “grant all privileges to
     * X” scenarios to make sure that every new object in a given database / schema is granted by the account role and every
     * new privilege is granted to the database role. Important note: this flag is not compliant with the Terraform assumptions
     * of the config being eventually convergent (producing an empty plan).
     */
    alwaysApply?: pulumi.Input<boolean>;
    /**
     * This field should not be set and its main purpose is to achieve the functionality described by alwaysApply field. This is value will be flipped to the opposite value on every pulumi up, thus creating a new plan that will re-apply grants.
     */
    alwaysApplyTrigger?: pulumi.Input<string>;
    /**
     * The fully qualified name of the database role to which privileges will be granted.
     */
    databaseRoleName?: pulumi.Input<string>;
    /**
     * The fully qualified name of the database on which privileges will be granted.
     */
    onDatabase?: pulumi.Input<string>;
    /**
     * Specifies the schema on which privileges will be granted.
     */
    onSchema?: pulumi.Input<inputs.GrantPrivilegesToDatabaseRoleOnSchema>;
    /**
     * Specifies the schema object on which privileges will be granted.
     */
    onSchemaObject?: pulumi.Input<inputs.GrantPrivilegesToDatabaseRoleOnSchemaObject>;
    /**
     * The privileges to grant on the database role.
     */
    privileges?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * If specified, allows the recipient role to grant the privileges to other roles.
     */
    withGrantOption?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a GrantPrivilegesToDatabaseRole resource.
 */
export interface GrantPrivilegesToDatabaseRoleArgs {
    /**
     * Grant all privileges on the database role.
     */
    allPrivileges?: pulumi.Input<boolean>;
    /**
     * If true, the resource will always produce a “plan” and on “apply” it will re-grant defined privileges. It is
     * supposed to be used only in “grant privileges on all X’s in database / schema Y” or “grant all privileges to
     * X” scenarios to make sure that every new object in a given database / schema is granted by the account role and every
     * new privilege is granted to the database role. Important note: this flag is not compliant with the Terraform assumptions
     * of the config being eventually convergent (producing an empty plan).
     */
    alwaysApply?: pulumi.Input<boolean>;
    /**
     * This field should not be set and its main purpose is to achieve the functionality described by alwaysApply field. This is value will be flipped to the opposite value on every pulumi up, thus creating a new plan that will re-apply grants.
     */
    alwaysApplyTrigger?: pulumi.Input<string>;
    /**
     * The fully qualified name of the database role to which privileges will be granted.
     */
    databaseRoleName: pulumi.Input<string>;
    /**
     * The fully qualified name of the database on which privileges will be granted.
     */
    onDatabase?: pulumi.Input<string>;
    /**
     * Specifies the schema on which privileges will be granted.
     */
    onSchema?: pulumi.Input<inputs.GrantPrivilegesToDatabaseRoleOnSchema>;
    /**
     * Specifies the schema object on which privileges will be granted.
     */
    onSchemaObject?: pulumi.Input<inputs.GrantPrivilegesToDatabaseRoleOnSchemaObject>;
    /**
     * The privileges to grant on the database role.
     */
    privileges?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * If specified, allows the recipient role to grant the privileges to other roles.
     */
    withGrantOption?: pulumi.Input<boolean>;
}
