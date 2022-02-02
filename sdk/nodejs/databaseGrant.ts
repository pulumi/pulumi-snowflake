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
 * const grant = new snowflake.DatabaseGrant("grant", {
 *     databaseName: "db",
 *     privilege: "USAGE",
 *     roles: [
 *         "role1",
 *         "role2",
 *     ],
 *     shares: [
 *         "share1",
 *         "share2",
 *     ],
 *     withGrantOption: false,
 * });
 * ```
 *
 * ## Import
 *
 * # format is database name | | | privilege | true/false for with_grant_option
 *
 * ```sh
 *  $ pulumi import snowflake:index/databaseGrant:DatabaseGrant example 'databaseName|||USAGE|false'
 * ```
 */
export class DatabaseGrant extends pulumi.CustomResource {
    /**
     * Get an existing DatabaseGrant resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DatabaseGrantState, opts?: pulumi.CustomResourceOptions): DatabaseGrant {
        return new DatabaseGrant(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'snowflake:index/databaseGrant:DatabaseGrant';

    /**
     * Returns true if the given object is an instance of DatabaseGrant.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is DatabaseGrant {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === DatabaseGrant.__pulumiType;
    }

    /**
     * The name of the database on which to grant privileges.
     */
    public readonly databaseName!: pulumi.Output<string>;
    /**
     * The privilege to grant on the database.
     */
    public readonly privilege!: pulumi.Output<string | undefined>;
    /**
     * Grants privilege to these roles.
     */
    public readonly roles!: pulumi.Output<string[] | undefined>;
    /**
     * Grants privilege to these shares.
     */
    public readonly shares!: pulumi.Output<string[] | undefined>;
    /**
     * When this is set to true, allows the recipient role to grant the privileges to other roles.
     */
    public readonly withGrantOption!: pulumi.Output<boolean | undefined>;

    /**
     * Create a DatabaseGrant resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DatabaseGrantArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DatabaseGrantArgs | DatabaseGrantState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DatabaseGrantState | undefined;
            resourceInputs["databaseName"] = state ? state.databaseName : undefined;
            resourceInputs["privilege"] = state ? state.privilege : undefined;
            resourceInputs["roles"] = state ? state.roles : undefined;
            resourceInputs["shares"] = state ? state.shares : undefined;
            resourceInputs["withGrantOption"] = state ? state.withGrantOption : undefined;
        } else {
            const args = argsOrState as DatabaseGrantArgs | undefined;
            if ((!args || args.databaseName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'databaseName'");
            }
            resourceInputs["databaseName"] = args ? args.databaseName : undefined;
            resourceInputs["privilege"] = args ? args.privilege : undefined;
            resourceInputs["roles"] = args ? args.roles : undefined;
            resourceInputs["shares"] = args ? args.shares : undefined;
            resourceInputs["withGrantOption"] = args ? args.withGrantOption : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(DatabaseGrant.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering DatabaseGrant resources.
 */
export interface DatabaseGrantState {
    /**
     * The name of the database on which to grant privileges.
     */
    databaseName?: pulumi.Input<string>;
    /**
     * The privilege to grant on the database.
     */
    privilege?: pulumi.Input<string>;
    /**
     * Grants privilege to these roles.
     */
    roles?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Grants privilege to these shares.
     */
    shares?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * When this is set to true, allows the recipient role to grant the privileges to other roles.
     */
    withGrantOption?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a DatabaseGrant resource.
 */
export interface DatabaseGrantArgs {
    /**
     * The name of the database on which to grant privileges.
     */
    databaseName: pulumi.Input<string>;
    /**
     * The privilege to grant on the database.
     */
    privilege?: pulumi.Input<string>;
    /**
     * Grants privilege to these roles.
     */
    roles?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Grants privilege to these shares.
     */
    shares?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * When this is set to true, allows the recipient role to grant the privileges to other roles.
     */
    withGrantOption?: pulumi.Input<boolean>;
}
