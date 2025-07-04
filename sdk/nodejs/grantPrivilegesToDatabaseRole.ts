// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Import
 *
 * ### Import examples
 *
 * #### Grant all privileges OnDatabase
 *
 * ```sh
 * $ pulumi import snowflake:index/grantPrivilegesToDatabaseRole:GrantPrivilegesToDatabaseRole example '"test_db"."test_db_role"|false|false|ALL|OnDatabase|"test_db"'`
 * ```
 *
 * #### Grant list of privileges OnAllSchemasInDatabase
 *
 * ```sh
 * $ pulumi import snowflake:index/grantPrivilegesToDatabaseRole:GrantPrivilegesToDatabaseRole example '"test_db"."test_db_role"|false|false|CREATE TAG,CREATE TABLE|OnSchema|OnAllSchemasInDatabase|"test_db"'`
 * ```
 *
 * #### Grant list of privileges on table
 *
 * ```sh
 * $ pulumi import snowflake:index/grantPrivilegesToDatabaseRole:GrantPrivilegesToDatabaseRole example '"test_db"."test_db_role"|false|false|SELECT,DELETE,INSERT|OnSchemaObject|OnObject|TABLE|"test_db"."test_schema"."test_table"'`
 * ```
 *
 * #### Grant list of privileges OnAll tables in schema
 *
 * ```sh
 * $ pulumi import snowflake:index/grantPrivilegesToDatabaseRole:GrantPrivilegesToDatabaseRole example '"test_db"."test_db_role"|false|false|SELECT,DELETE,INSERT|OnSchemaObject|OnAll|TABLES|InSchema|"test_db"."test_schema"'`
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
     * (Default: `false`) Grant all privileges on the database role.
     */
    public readonly allPrivileges!: pulumi.Output<boolean | undefined>;
    public readonly alwaysApply!: pulumi.Output<boolean | undefined>;
    /**
     * (Default: ``) This is a helper field and should not be set. Its main purpose is to help to achieve the functionality described by the alwaysApply field.
     */
    public readonly alwaysApplyTrigger!: pulumi.Output<string | undefined>;
    /**
     * The fully qualified name of the database role to which privileges will be granted. For more information about this resource, see docs.
     */
    public readonly databaseRoleName!: pulumi.Output<string>;
    /**
     * The fully qualified name of the database on which privileges will be granted. For more information about this resource, see docs.
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
     * (Default: `false`) If specified, allows the recipient role to grant the privileges to other roles.
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
     * (Default: `false`) Grant all privileges on the database role.
     */
    allPrivileges?: pulumi.Input<boolean>;
    alwaysApply?: pulumi.Input<boolean>;
    /**
     * (Default: ``) This is a helper field and should not be set. Its main purpose is to help to achieve the functionality described by the alwaysApply field.
     */
    alwaysApplyTrigger?: pulumi.Input<string>;
    /**
     * The fully qualified name of the database role to which privileges will be granted. For more information about this resource, see docs.
     */
    databaseRoleName?: pulumi.Input<string>;
    /**
     * The fully qualified name of the database on which privileges will be granted. For more information about this resource, see docs.
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
     * (Default: `false`) If specified, allows the recipient role to grant the privileges to other roles.
     */
    withGrantOption?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a GrantPrivilegesToDatabaseRole resource.
 */
export interface GrantPrivilegesToDatabaseRoleArgs {
    /**
     * (Default: `false`) Grant all privileges on the database role.
     */
    allPrivileges?: pulumi.Input<boolean>;
    alwaysApply?: pulumi.Input<boolean>;
    /**
     * (Default: ``) This is a helper field and should not be set. Its main purpose is to help to achieve the functionality described by the alwaysApply field.
     */
    alwaysApplyTrigger?: pulumi.Input<string>;
    /**
     * The fully qualified name of the database role to which privileges will be granted. For more information about this resource, see docs.
     */
    databaseRoleName: pulumi.Input<string>;
    /**
     * The fully qualified name of the database on which privileges will be granted. For more information about this resource, see docs.
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
     * (Default: `false`) If specified, allows the recipient role to grant the privileges to other roles.
     */
    withGrantOption?: pulumi.Input<boolean>;
}
