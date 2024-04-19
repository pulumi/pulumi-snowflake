// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * > **Deprecation** This resource is deprecated and will be removed in a future major version release. Please use snowflake.GrantPrivilegesToAccountRole instead. <deprecation>
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as snowflake from "@pulumi/snowflake";
 *
 * const grant = new snowflake.TableGrant("grant", {
 *     databaseName: "database",
 *     onFuture: false,
 *     privilege: "SELECT",
 *     roles: ["role1"],
 *     schemaName: "schema",
 *     shares: ["share1"],
 *     tableName: "table",
 *     withGrantOption: false,
 * });
 * ```
 *
 * ## Import
 *
 * format is database_name|schema_name|table_name|privilege|with_grant_option|on_future|on_all|roles|shares
 *
 * ```sh
 * $ pulumi import snowflake:index/tableGrant:TableGrant example "MY_DATABASE|MY_SCHEMA|MY_TABLE|USAGE|false|false|false|role1,role2|share1,share2"
 * ```
 */
export class TableGrant extends pulumi.CustomResource {
    /**
     * Get an existing TableGrant resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TableGrantState, opts?: pulumi.CustomResourceOptions): TableGrant {
        return new TableGrant(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'snowflake:index/tableGrant:TableGrant';

    /**
     * Returns true if the given object is an instance of TableGrant.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is TableGrant {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === TableGrant.__pulumiType;
    }

    /**
     * The name of the database containing the current or future tables on which to grant privileges.
     */
    public readonly databaseName!: pulumi.Output<string>;
    /**
     * When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
     * grants applied to roles and objects outside Terraform.
     */
    public readonly enableMultipleGrants!: pulumi.Output<boolean | undefined>;
    /**
     * When this is set to true and a schema*name is provided, apply this grant on all tables in the given schema. When this is true and no schema*name is provided apply this grant on all tables in the given database. The table*name and shares fields must be unset in order to use on*all. Cannot be used together with on_future.
     */
    public readonly onAll!: pulumi.Output<boolean | undefined>;
    /**
     * When this is set to true and a schema*name is provided, apply this grant on all future tables in the given schema. When this is true and no schema*name is provided apply this grant on all future tables in the given database. The table*name and shares fields must be unset in order to use on*future. Cannot be used together with on_all.
     */
    public readonly onFuture!: pulumi.Output<boolean | undefined>;
    /**
     * The privilege to grant on the current or future table. To grant all privileges, use the value `ALL PRIVILEGES`.
     */
    public readonly privilege!: pulumi.Output<string | undefined>;
    /**
     * The name of the role to revert ownership to on destroy. Has no effect unless `privilege` is set to `OWNERSHIP`
     */
    public readonly revertOwnershipToRoleName!: pulumi.Output<string | undefined>;
    /**
     * Grants privilege to these roles.
     */
    public readonly roles!: pulumi.Output<string[] | undefined>;
    /**
     * The name of the schema containing the current or future tables on which to grant privileges.
     */
    public readonly schemaName!: pulumi.Output<string | undefined>;
    /**
     * Grants privilege to these shares (only valid if on*future or on*all are unset).
     */
    public readonly shares!: pulumi.Output<string[] | undefined>;
    /**
     * The name of the table on which to grant privileges immediately (only valid if on*future or on*all are unset).
     */
    public readonly tableName!: pulumi.Output<string | undefined>;
    /**
     * When this is set to true, allows the recipient role to grant the privileges to other roles.
     */
    public readonly withGrantOption!: pulumi.Output<boolean | undefined>;

    /**
     * Create a TableGrant resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: TableGrantArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: TableGrantArgs | TableGrantState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as TableGrantState | undefined;
            resourceInputs["databaseName"] = state ? state.databaseName : undefined;
            resourceInputs["enableMultipleGrants"] = state ? state.enableMultipleGrants : undefined;
            resourceInputs["onAll"] = state ? state.onAll : undefined;
            resourceInputs["onFuture"] = state ? state.onFuture : undefined;
            resourceInputs["privilege"] = state ? state.privilege : undefined;
            resourceInputs["revertOwnershipToRoleName"] = state ? state.revertOwnershipToRoleName : undefined;
            resourceInputs["roles"] = state ? state.roles : undefined;
            resourceInputs["schemaName"] = state ? state.schemaName : undefined;
            resourceInputs["shares"] = state ? state.shares : undefined;
            resourceInputs["tableName"] = state ? state.tableName : undefined;
            resourceInputs["withGrantOption"] = state ? state.withGrantOption : undefined;
        } else {
            const args = argsOrState as TableGrantArgs | undefined;
            if ((!args || args.databaseName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'databaseName'");
            }
            resourceInputs["databaseName"] = args ? args.databaseName : undefined;
            resourceInputs["enableMultipleGrants"] = args ? args.enableMultipleGrants : undefined;
            resourceInputs["onAll"] = args ? args.onAll : undefined;
            resourceInputs["onFuture"] = args ? args.onFuture : undefined;
            resourceInputs["privilege"] = args ? args.privilege : undefined;
            resourceInputs["revertOwnershipToRoleName"] = args ? args.revertOwnershipToRoleName : undefined;
            resourceInputs["roles"] = args ? args.roles : undefined;
            resourceInputs["schemaName"] = args ? args.schemaName : undefined;
            resourceInputs["shares"] = args ? args.shares : undefined;
            resourceInputs["tableName"] = args ? args.tableName : undefined;
            resourceInputs["withGrantOption"] = args ? args.withGrantOption : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(TableGrant.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering TableGrant resources.
 */
export interface TableGrantState {
    /**
     * The name of the database containing the current or future tables on which to grant privileges.
     */
    databaseName?: pulumi.Input<string>;
    /**
     * When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
     * grants applied to roles and objects outside Terraform.
     */
    enableMultipleGrants?: pulumi.Input<boolean>;
    /**
     * When this is set to true and a schema*name is provided, apply this grant on all tables in the given schema. When this is true and no schema*name is provided apply this grant on all tables in the given database. The table*name and shares fields must be unset in order to use on*all. Cannot be used together with on_future.
     */
    onAll?: pulumi.Input<boolean>;
    /**
     * When this is set to true and a schema*name is provided, apply this grant on all future tables in the given schema. When this is true and no schema*name is provided apply this grant on all future tables in the given database. The table*name and shares fields must be unset in order to use on*future. Cannot be used together with on_all.
     */
    onFuture?: pulumi.Input<boolean>;
    /**
     * The privilege to grant on the current or future table. To grant all privileges, use the value `ALL PRIVILEGES`.
     */
    privilege?: pulumi.Input<string>;
    /**
     * The name of the role to revert ownership to on destroy. Has no effect unless `privilege` is set to `OWNERSHIP`
     */
    revertOwnershipToRoleName?: pulumi.Input<string>;
    /**
     * Grants privilege to these roles.
     */
    roles?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name of the schema containing the current or future tables on which to grant privileges.
     */
    schemaName?: pulumi.Input<string>;
    /**
     * Grants privilege to these shares (only valid if on*future or on*all are unset).
     */
    shares?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name of the table on which to grant privileges immediately (only valid if on*future or on*all are unset).
     */
    tableName?: pulumi.Input<string>;
    /**
     * When this is set to true, allows the recipient role to grant the privileges to other roles.
     */
    withGrantOption?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a TableGrant resource.
 */
export interface TableGrantArgs {
    /**
     * The name of the database containing the current or future tables on which to grant privileges.
     */
    databaseName: pulumi.Input<string>;
    /**
     * When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
     * grants applied to roles and objects outside Terraform.
     */
    enableMultipleGrants?: pulumi.Input<boolean>;
    /**
     * When this is set to true and a schema*name is provided, apply this grant on all tables in the given schema. When this is true and no schema*name is provided apply this grant on all tables in the given database. The table*name and shares fields must be unset in order to use on*all. Cannot be used together with on_future.
     */
    onAll?: pulumi.Input<boolean>;
    /**
     * When this is set to true and a schema*name is provided, apply this grant on all future tables in the given schema. When this is true and no schema*name is provided apply this grant on all future tables in the given database. The table*name and shares fields must be unset in order to use on*future. Cannot be used together with on_all.
     */
    onFuture?: pulumi.Input<boolean>;
    /**
     * The privilege to grant on the current or future table. To grant all privileges, use the value `ALL PRIVILEGES`.
     */
    privilege?: pulumi.Input<string>;
    /**
     * The name of the role to revert ownership to on destroy. Has no effect unless `privilege` is set to `OWNERSHIP`
     */
    revertOwnershipToRoleName?: pulumi.Input<string>;
    /**
     * Grants privilege to these roles.
     */
    roles?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name of the schema containing the current or future tables on which to grant privileges.
     */
    schemaName?: pulumi.Input<string>;
    /**
     * Grants privilege to these shares (only valid if on*future or on*all are unset).
     */
    shares?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name of the table on which to grant privileges immediately (only valid if on*future or on*all are unset).
     */
    tableName?: pulumi.Input<string>;
    /**
     * When this is set to true, allows the recipient role to grant the privileges to other roles.
     */
    withGrantOption?: pulumi.Input<boolean>;
}
