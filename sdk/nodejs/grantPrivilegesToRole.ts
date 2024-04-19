// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * > **Deprecation** This resource is deprecated and will be removed in a future major version release. Please use snowflake.GrantPrivilegesToAccountRole instead. <deprecation>
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as snowflake from "@pulumi/snowflake";
 *
 * //#################################
 * //## global privileges
 * //#################################
 * // list of privileges
 * const g1 = new snowflake.GrantPrivilegesToRole("g1", {
 *     privileges: [
 *         "MODIFY",
 *         "USAGE",
 *     ],
 *     roleName: r.name,
 *     onAccount: true,
 * });
 * // all privileges + grant option
 * const g2 = new snowflake.GrantPrivilegesToRole("g2", {
 *     roleName: r.name,
 *     onAccount: true,
 *     allPrivileges: true,
 *     withGrantOption: true,
 * });
 * //#################################
 * //## account object privileges
 * //#################################
 * // list of privileges
 * const g3 = new snowflake.GrantPrivilegesToRole("g3", {
 *     privileges: [
 *         "CREATE",
 *         "MONITOR",
 *     ],
 *     roleName: r.name,
 *     onAccountObject: {
 *         objectType: "DATABASE",
 *         objectName: d.name,
 *     },
 * });
 * // all privileges + grant option
 * const g4 = new snowflake.GrantPrivilegesToRole("g4", {
 *     roleName: r.name,
 *     onAccountObject: {
 *         objectType: "DATABASE",
 *         objectName: d.name,
 *     },
 *     allPrivileges: true,
 *     withGrantOption: true,
 * });
 * //#################################
 * //## schema privileges
 * //#################################
 * // list of privileges
 * const g5 = new snowflake.GrantPrivilegesToRole("g5", {
 *     privileges: [
 *         "MODIFY",
 *         "CREATE TABLE",
 *     ],
 *     roleName: r.name,
 *     onSchema: {
 *         schemaName: "\"my_db\".\"my_schema\"",
 *     },
 * });
 * // all privileges + grant option
 * const g6 = new snowflake.GrantPrivilegesToRole("g6", {
 *     roleName: r.name,
 *     onSchema: {
 *         schemaName: "\"my_db\".\"my_schema\"",
 *     },
 *     allPrivileges: true,
 *     withGrantOption: true,
 * });
 * // all schemas in database
 * const g7 = new snowflake.GrantPrivilegesToRole("g7", {
 *     privileges: [
 *         "MODIFY",
 *         "CREATE TABLE",
 *     ],
 *     roleName: r.name,
 *     onSchema: {
 *         allSchemasInDatabase: d.name,
 *     },
 * });
 * // future schemas in database
 * const g8 = new snowflake.GrantPrivilegesToRole("g8", {
 *     privileges: [
 *         "MODIFY",
 *         "CREATE TABLE",
 *     ],
 *     roleName: r.name,
 *     onSchema: {
 *         futureSchemasInDatabase: d.name,
 *     },
 * });
 * //#################################
 * //## schema object privileges
 * //#################################
 * // list of privileges
 * const g9 = new snowflake.GrantPrivilegesToRole("g9", {
 *     privileges: [
 *         "SELECT",
 *         "REFERENCES",
 *     ],
 *     roleName: r.name,
 *     onSchemaObject: {
 *         objectType: "VIEW",
 *         objectName: "\"my_db\".\"my_schema\".\"my_view\"",
 *     },
 * });
 * // all privileges + grant option
 * const g10 = new snowflake.GrantPrivilegesToRole("g10", {
 *     roleName: r.name,
 *     onSchemaObject: {
 *         objectType: "VIEW",
 *         objectName: "\"my_db\".\"my_schema\".\"my_view\"",
 *     },
 *     allPrivileges: true,
 *     withGrantOption: true,
 * });
 * // all in database
 * const g11 = new snowflake.GrantPrivilegesToRole("g11", {
 *     privileges: [
 *         "SELECT",
 *         "INSERT",
 *     ],
 *     roleName: r.name,
 *     onSchemaObject: {
 *         all: {
 *             objectTypePlural: "TABLES",
 *             inDatabase: d.name,
 *         },
 *     },
 * });
 * // all in schema
 * const g12 = new snowflake.GrantPrivilegesToRole("g12", {
 *     privileges: [
 *         "SELECT",
 *         "INSERT",
 *     ],
 *     roleName: r.name,
 *     onSchemaObject: {
 *         all: {
 *             objectTypePlural: "TABLES",
 *             inSchema: "\"my_db\".\"my_schema\"",
 *         },
 *     },
 * });
 * // future in database
 * const g13 = new snowflake.GrantPrivilegesToRole("g13", {
 *     privileges: [
 *         "SELECT",
 *         "INSERT",
 *     ],
 *     roleName: r.name,
 *     onSchemaObject: {
 *         future: {
 *             objectTypePlural: "TABLES",
 *             inDatabase: d.name,
 *         },
 *     },
 * });
 * // future in schema
 * const g14 = new snowflake.GrantPrivilegesToRole("g14", {
 *     privileges: [
 *         "SELECT",
 *         "INSERT",
 *     ],
 *     roleName: r.name,
 *     onSchemaObject: {
 *         future: {
 *             objectTypePlural: "TABLES",
 *             inSchema: "\"my_db\".\"my_schema\"",
 *         },
 *     },
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * format is role_name (string) | privileges (comma-delimited string) | all_privileges (bool) |with_grant_option (bool) | on_account (bool) | on_account_object (bool) | on_schema (bool) | on_schema_object (bool) | all (bool) | future (bool) | object_type (string) | object_name (string) | object_type_plural (string) | in_schema (bool) | schema_name (string) | in_database (bool) | database_name (string)
 *
 * ```sh
 * $ pulumi import snowflake:index/grantPrivilegesToRole:GrantPrivilegesToRole "test_role|MANAGE GRANTS,MONITOR USAGE|false|false|true|false|false|false|false|false||||false||false|"
 * ```
 */
export class GrantPrivilegesToRole extends pulumi.CustomResource {
    /**
     * Get an existing GrantPrivilegesToRole resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: GrantPrivilegesToRoleState, opts?: pulumi.CustomResourceOptions): GrantPrivilegesToRole {
        return new GrantPrivilegesToRole(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'snowflake:index/grantPrivilegesToRole:GrantPrivilegesToRole';

    /**
     * Returns true if the given object is an instance of GrantPrivilegesToRole.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is GrantPrivilegesToRole {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === GrantPrivilegesToRole.__pulumiType;
    }

    /**
     * Grant all privileges on the account role.
     */
    public readonly allPrivileges!: pulumi.Output<boolean | undefined>;
    /**
     * If true, the privileges will be granted on the account.
     */
    public readonly onAccount!: pulumi.Output<boolean | undefined>;
    /**
     * Specifies the account object on which privileges will be granted
     */
    public readonly onAccountObject!: pulumi.Output<outputs.GrantPrivilegesToRoleOnAccountObject | undefined>;
    /**
     * Specifies the schema on which privileges will be granted.
     */
    public readonly onSchema!: pulumi.Output<outputs.GrantPrivilegesToRoleOnSchema | undefined>;
    /**
     * Specifies the schema object on which privileges will be granted.
     */
    public readonly onSchemaObject!: pulumi.Output<outputs.GrantPrivilegesToRoleOnSchemaObject | undefined>;
    /**
     * The privileges to grant on the account role.
     */
    public readonly privileges!: pulumi.Output<string[] | undefined>;
    /**
     * The fully qualified name of the role to which privileges will be granted.
     */
    public readonly roleName!: pulumi.Output<string>;
    /**
     * Specifies whether the grantee can grant the privileges to other users.
     */
    public readonly withGrantOption!: pulumi.Output<boolean | undefined>;

    /**
     * Create a GrantPrivilegesToRole resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: GrantPrivilegesToRoleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: GrantPrivilegesToRoleArgs | GrantPrivilegesToRoleState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as GrantPrivilegesToRoleState | undefined;
            resourceInputs["allPrivileges"] = state ? state.allPrivileges : undefined;
            resourceInputs["onAccount"] = state ? state.onAccount : undefined;
            resourceInputs["onAccountObject"] = state ? state.onAccountObject : undefined;
            resourceInputs["onSchema"] = state ? state.onSchema : undefined;
            resourceInputs["onSchemaObject"] = state ? state.onSchemaObject : undefined;
            resourceInputs["privileges"] = state ? state.privileges : undefined;
            resourceInputs["roleName"] = state ? state.roleName : undefined;
            resourceInputs["withGrantOption"] = state ? state.withGrantOption : undefined;
        } else {
            const args = argsOrState as GrantPrivilegesToRoleArgs | undefined;
            if ((!args || args.roleName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'roleName'");
            }
            resourceInputs["allPrivileges"] = args ? args.allPrivileges : undefined;
            resourceInputs["onAccount"] = args ? args.onAccount : undefined;
            resourceInputs["onAccountObject"] = args ? args.onAccountObject : undefined;
            resourceInputs["onSchema"] = args ? args.onSchema : undefined;
            resourceInputs["onSchemaObject"] = args ? args.onSchemaObject : undefined;
            resourceInputs["privileges"] = args ? args.privileges : undefined;
            resourceInputs["roleName"] = args ? args.roleName : undefined;
            resourceInputs["withGrantOption"] = args ? args.withGrantOption : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(GrantPrivilegesToRole.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering GrantPrivilegesToRole resources.
 */
export interface GrantPrivilegesToRoleState {
    /**
     * Grant all privileges on the account role.
     */
    allPrivileges?: pulumi.Input<boolean>;
    /**
     * If true, the privileges will be granted on the account.
     */
    onAccount?: pulumi.Input<boolean>;
    /**
     * Specifies the account object on which privileges will be granted
     */
    onAccountObject?: pulumi.Input<inputs.GrantPrivilegesToRoleOnAccountObject>;
    /**
     * Specifies the schema on which privileges will be granted.
     */
    onSchema?: pulumi.Input<inputs.GrantPrivilegesToRoleOnSchema>;
    /**
     * Specifies the schema object on which privileges will be granted.
     */
    onSchemaObject?: pulumi.Input<inputs.GrantPrivilegesToRoleOnSchemaObject>;
    /**
     * The privileges to grant on the account role.
     */
    privileges?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The fully qualified name of the role to which privileges will be granted.
     */
    roleName?: pulumi.Input<string>;
    /**
     * Specifies whether the grantee can grant the privileges to other users.
     */
    withGrantOption?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a GrantPrivilegesToRole resource.
 */
export interface GrantPrivilegesToRoleArgs {
    /**
     * Grant all privileges on the account role.
     */
    allPrivileges?: pulumi.Input<boolean>;
    /**
     * If true, the privileges will be granted on the account.
     */
    onAccount?: pulumi.Input<boolean>;
    /**
     * Specifies the account object on which privileges will be granted
     */
    onAccountObject?: pulumi.Input<inputs.GrantPrivilegesToRoleOnAccountObject>;
    /**
     * Specifies the schema on which privileges will be granted.
     */
    onSchema?: pulumi.Input<inputs.GrantPrivilegesToRoleOnSchema>;
    /**
     * Specifies the schema object on which privileges will be granted.
     */
    onSchemaObject?: pulumi.Input<inputs.GrantPrivilegesToRoleOnSchemaObject>;
    /**
     * The privileges to grant on the account role.
     */
    privileges?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The fully qualified name of the role to which privileges will be granted.
     */
    roleName: pulumi.Input<string>;
    /**
     * Specifies whether the grantee can grant the privileges to other users.
     */
    withGrantOption?: pulumi.Input<boolean>;
}
