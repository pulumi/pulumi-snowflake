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
 * const dbRole = new snowflake.DatabaseRole("db_role", {
 *     database: "database",
 *     name: "role_1",
 *     comment: "my db role",
 * });
 * ```
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import snowflake:index/databaseRole:DatabaseRole example 'dbName|roleName'
 * ```
 */
export class DatabaseRole extends pulumi.CustomResource {
    /**
     * Get an existing DatabaseRole resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DatabaseRoleState, opts?: pulumi.CustomResourceOptions): DatabaseRole {
        return new DatabaseRole(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'snowflake:index/databaseRole:DatabaseRole';

    /**
     * Returns true if the given object is an instance of DatabaseRole.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is DatabaseRole {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === DatabaseRole.__pulumiType;
    }

    /**
     * Specifies a comment for the database role.
     */
    public readonly comment!: pulumi.Output<string | undefined>;
    /**
     * The database in which to create the database role.
     */
    public readonly database!: pulumi.Output<string>;
    /**
     * Specifies the identifier for the database role.
     */
    public readonly name!: pulumi.Output<string>;

    /**
     * Create a DatabaseRole resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DatabaseRoleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DatabaseRoleArgs | DatabaseRoleState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DatabaseRoleState | undefined;
            resourceInputs["comment"] = state ? state.comment : undefined;
            resourceInputs["database"] = state ? state.database : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
        } else {
            const args = argsOrState as DatabaseRoleArgs | undefined;
            if ((!args || args.database === undefined) && !opts.urn) {
                throw new Error("Missing required property 'database'");
            }
            resourceInputs["comment"] = args ? args.comment : undefined;
            resourceInputs["database"] = args ? args.database : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(DatabaseRole.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering DatabaseRole resources.
 */
export interface DatabaseRoleState {
    /**
     * Specifies a comment for the database role.
     */
    comment?: pulumi.Input<string>;
    /**
     * The database in which to create the database role.
     */
    database?: pulumi.Input<string>;
    /**
     * Specifies the identifier for the database role.
     */
    name?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a DatabaseRole resource.
 */
export interface DatabaseRoleArgs {
    /**
     * Specifies a comment for the database role.
     */
    comment?: pulumi.Input<string>;
    /**
     * The database in which to create the database role.
     */
    database: pulumi.Input<string>;
    /**
     * Specifies the identifier for the database role.
     */
    name?: pulumi.Input<string>;
}
