// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as snowflake from "@pulumi/snowflake";
 *
 * const grant = new snowflake.ViewGrant("grant", {
 *     databaseName: "database",
 *     onFuture: false,
 *     privilege: "SELECT",
 *     roles: [
 *         "role1",
 *         "role2",
 *     ],
 *     schemaName: "schema",
 *     shares: [
 *         "share1",
 *         "share2",
 *     ],
 *     viewName: "view",
 *     withGrantOption: false,
 * });
 * ```
 *
 * ## Import
 *
 * format is database name | schema name | view name | privilege | true/false for with_grant_option
 *
 * ```sh
 *  $ pulumi import snowflake:index/viewGrant:ViewGrant example 'dbName|schemaName|viewName|USAGE|false'
 * ```
 */
export class ViewGrant extends pulumi.CustomResource {
    /**
     * Get an existing ViewGrant resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ViewGrantState, opts?: pulumi.CustomResourceOptions): ViewGrant {
        return new ViewGrant(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'snowflake:index/viewGrant:ViewGrant';

    /**
     * Returns true if the given object is an instance of ViewGrant.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ViewGrant {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ViewGrant.__pulumiType;
    }

    /**
     * The name of the database containing the current or future views on which to grant privileges.
     */
    public readonly databaseName!: pulumi.Output<string>;
    /**
     * When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
     * grants applied to roles and objects outside Terraform.
     */
    public readonly enableMultipleGrants!: pulumi.Output<boolean | undefined>;
    /**
     * When this is set to true and a schema*name is provided, apply this grant on all future views in the given schema. When this is true and no schema*name is provided apply this grant on all future views in the given database. The view*name and shares fields must be unset in order to use on*future.
     */
    public readonly onFuture!: pulumi.Output<boolean | undefined>;
    /**
     * The privilege to grant on the current or future view.
     */
    public readonly privilege!: pulumi.Output<string | undefined>;
    /**
     * Grants privilege to these roles.
     */
    public readonly roles!: pulumi.Output<string[] | undefined>;
    /**
     * The name of the schema containing the current or future views on which to grant privileges.
     */
    public readonly schemaName!: pulumi.Output<string | undefined>;
    /**
     * Grants privilege to these shares (only valid if onFuture is unset).
     */
    public readonly shares!: pulumi.Output<string[] | undefined>;
    /**
     * The name of the view on which to grant privileges immediately (only valid if onFuture is unset).
     */
    public readonly viewName!: pulumi.Output<string | undefined>;
    /**
     * When this is set to true, allows the recipient role to grant the privileges to other roles.
     */
    public readonly withGrantOption!: pulumi.Output<boolean | undefined>;

    /**
     * Create a ViewGrant resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ViewGrantArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ViewGrantArgs | ViewGrantState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ViewGrantState | undefined;
            resourceInputs["databaseName"] = state ? state.databaseName : undefined;
            resourceInputs["enableMultipleGrants"] = state ? state.enableMultipleGrants : undefined;
            resourceInputs["onFuture"] = state ? state.onFuture : undefined;
            resourceInputs["privilege"] = state ? state.privilege : undefined;
            resourceInputs["roles"] = state ? state.roles : undefined;
            resourceInputs["schemaName"] = state ? state.schemaName : undefined;
            resourceInputs["shares"] = state ? state.shares : undefined;
            resourceInputs["viewName"] = state ? state.viewName : undefined;
            resourceInputs["withGrantOption"] = state ? state.withGrantOption : undefined;
        } else {
            const args = argsOrState as ViewGrantArgs | undefined;
            if ((!args || args.databaseName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'databaseName'");
            }
            resourceInputs["databaseName"] = args ? args.databaseName : undefined;
            resourceInputs["enableMultipleGrants"] = args ? args.enableMultipleGrants : undefined;
            resourceInputs["onFuture"] = args ? args.onFuture : undefined;
            resourceInputs["privilege"] = args ? args.privilege : undefined;
            resourceInputs["roles"] = args ? args.roles : undefined;
            resourceInputs["schemaName"] = args ? args.schemaName : undefined;
            resourceInputs["shares"] = args ? args.shares : undefined;
            resourceInputs["viewName"] = args ? args.viewName : undefined;
            resourceInputs["withGrantOption"] = args ? args.withGrantOption : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ViewGrant.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ViewGrant resources.
 */
export interface ViewGrantState {
    /**
     * The name of the database containing the current or future views on which to grant privileges.
     */
    databaseName?: pulumi.Input<string>;
    /**
     * When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
     * grants applied to roles and objects outside Terraform.
     */
    enableMultipleGrants?: pulumi.Input<boolean>;
    /**
     * When this is set to true and a schema*name is provided, apply this grant on all future views in the given schema. When this is true and no schema*name is provided apply this grant on all future views in the given database. The view*name and shares fields must be unset in order to use on*future.
     */
    onFuture?: pulumi.Input<boolean>;
    /**
     * The privilege to grant on the current or future view.
     */
    privilege?: pulumi.Input<string>;
    /**
     * Grants privilege to these roles.
     */
    roles?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name of the schema containing the current or future views on which to grant privileges.
     */
    schemaName?: pulumi.Input<string>;
    /**
     * Grants privilege to these shares (only valid if onFuture is unset).
     */
    shares?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name of the view on which to grant privileges immediately (only valid if onFuture is unset).
     */
    viewName?: pulumi.Input<string>;
    /**
     * When this is set to true, allows the recipient role to grant the privileges to other roles.
     */
    withGrantOption?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a ViewGrant resource.
 */
export interface ViewGrantArgs {
    /**
     * The name of the database containing the current or future views on which to grant privileges.
     */
    databaseName: pulumi.Input<string>;
    /**
     * When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
     * grants applied to roles and objects outside Terraform.
     */
    enableMultipleGrants?: pulumi.Input<boolean>;
    /**
     * When this is set to true and a schema*name is provided, apply this grant on all future views in the given schema. When this is true and no schema*name is provided apply this grant on all future views in the given database. The view*name and shares fields must be unset in order to use on*future.
     */
    onFuture?: pulumi.Input<boolean>;
    /**
     * The privilege to grant on the current or future view.
     */
    privilege?: pulumi.Input<string>;
    /**
     * Grants privilege to these roles.
     */
    roles?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name of the schema containing the current or future views on which to grant privileges.
     */
    schemaName?: pulumi.Input<string>;
    /**
     * Grants privilege to these shares (only valid if onFuture is unset).
     */
    shares?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name of the view on which to grant privileges immediately (only valid if onFuture is unset).
     */
    viewName?: pulumi.Input<string>;
    /**
     * When this is set to true, allows the recipient role to grant the privileges to other roles.
     */
    withGrantOption?: pulumi.Input<boolean>;
}
