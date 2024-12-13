// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * ## Import
 *
 * ### OnView
 *
 * ```sh
 * $ pulumi import snowflake:index/grantPrivilegesToShare:GrantPrivilegesToShare example '<share_name>|<privileges>|OnView|<database_name>.<schema_name>.<view_name>'`
 * ```
 */
export class GrantPrivilegesToShare extends pulumi.CustomResource {
    /**
     * Get an existing GrantPrivilegesToShare resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: GrantPrivilegesToShareState, opts?: pulumi.CustomResourceOptions): GrantPrivilegesToShare {
        return new GrantPrivilegesToShare(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'snowflake:index/grantPrivilegesToShare:GrantPrivilegesToShare';

    /**
     * Returns true if the given object is an instance of GrantPrivilegesToShare.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is GrantPrivilegesToShare {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === GrantPrivilegesToShare.__pulumiType;
    }

    /**
     * The fully qualified identifier for the schema for which the specified privilege will be granted for all tables.
     */
    public readonly onAllTablesInSchema!: pulumi.Output<string | undefined>;
    /**
     * The fully qualified name of the database on which privileges will be granted. For more information about this resource, see docs.
     */
    public readonly onDatabase!: pulumi.Output<string | undefined>;
    /**
     * The fully qualified name of the function on which privileges will be granted.
     */
    public readonly onFunction!: pulumi.Output<string | undefined>;
    /**
     * The fully qualified name of the schema on which privileges will be granted. For more information about this resource, see docs.
     */
    public readonly onSchema!: pulumi.Output<string | undefined>;
    /**
     * The fully qualified name of the table on which privileges will be granted. For more information about this resource, see docs.
     */
    public readonly onTable!: pulumi.Output<string | undefined>;
    /**
     * The fully qualified name of the tag on which privileges will be granted. For more information about this resource, see docs.
     */
    public readonly onTag!: pulumi.Output<string | undefined>;
    /**
     * The fully qualified name of the view on which privileges will be granted. For more information about this resource, see docs.
     */
    public readonly onView!: pulumi.Output<string | undefined>;
    /**
     * The privileges to grant on the share. See available list of privileges: https://docs.snowflake.com/en/sql-reference/sql/grant-privilege-share#syntax
     */
    public readonly privileges!: pulumi.Output<string[]>;
    /**
     * The fully qualified name of the share on which privileges will be granted. For more information about this resource, see docs.
     */
    public readonly toShare!: pulumi.Output<string>;

    /**
     * Create a GrantPrivilegesToShare resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: GrantPrivilegesToShareArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: GrantPrivilegesToShareArgs | GrantPrivilegesToShareState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as GrantPrivilegesToShareState | undefined;
            resourceInputs["onAllTablesInSchema"] = state ? state.onAllTablesInSchema : undefined;
            resourceInputs["onDatabase"] = state ? state.onDatabase : undefined;
            resourceInputs["onFunction"] = state ? state.onFunction : undefined;
            resourceInputs["onSchema"] = state ? state.onSchema : undefined;
            resourceInputs["onTable"] = state ? state.onTable : undefined;
            resourceInputs["onTag"] = state ? state.onTag : undefined;
            resourceInputs["onView"] = state ? state.onView : undefined;
            resourceInputs["privileges"] = state ? state.privileges : undefined;
            resourceInputs["toShare"] = state ? state.toShare : undefined;
        } else {
            const args = argsOrState as GrantPrivilegesToShareArgs | undefined;
            if ((!args || args.privileges === undefined) && !opts.urn) {
                throw new Error("Missing required property 'privileges'");
            }
            if ((!args || args.toShare === undefined) && !opts.urn) {
                throw new Error("Missing required property 'toShare'");
            }
            resourceInputs["onAllTablesInSchema"] = args ? args.onAllTablesInSchema : undefined;
            resourceInputs["onDatabase"] = args ? args.onDatabase : undefined;
            resourceInputs["onFunction"] = args ? args.onFunction : undefined;
            resourceInputs["onSchema"] = args ? args.onSchema : undefined;
            resourceInputs["onTable"] = args ? args.onTable : undefined;
            resourceInputs["onTag"] = args ? args.onTag : undefined;
            resourceInputs["onView"] = args ? args.onView : undefined;
            resourceInputs["privileges"] = args ? args.privileges : undefined;
            resourceInputs["toShare"] = args ? args.toShare : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(GrantPrivilegesToShare.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering GrantPrivilegesToShare resources.
 */
export interface GrantPrivilegesToShareState {
    /**
     * The fully qualified identifier for the schema for which the specified privilege will be granted for all tables.
     */
    onAllTablesInSchema?: pulumi.Input<string>;
    /**
     * The fully qualified name of the database on which privileges will be granted. For more information about this resource, see docs.
     */
    onDatabase?: pulumi.Input<string>;
    /**
     * The fully qualified name of the function on which privileges will be granted.
     */
    onFunction?: pulumi.Input<string>;
    /**
     * The fully qualified name of the schema on which privileges will be granted. For more information about this resource, see docs.
     */
    onSchema?: pulumi.Input<string>;
    /**
     * The fully qualified name of the table on which privileges will be granted. For more information about this resource, see docs.
     */
    onTable?: pulumi.Input<string>;
    /**
     * The fully qualified name of the tag on which privileges will be granted. For more information about this resource, see docs.
     */
    onTag?: pulumi.Input<string>;
    /**
     * The fully qualified name of the view on which privileges will be granted. For more information about this resource, see docs.
     */
    onView?: pulumi.Input<string>;
    /**
     * The privileges to grant on the share. See available list of privileges: https://docs.snowflake.com/en/sql-reference/sql/grant-privilege-share#syntax
     */
    privileges?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The fully qualified name of the share on which privileges will be granted. For more information about this resource, see docs.
     */
    toShare?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a GrantPrivilegesToShare resource.
 */
export interface GrantPrivilegesToShareArgs {
    /**
     * The fully qualified identifier for the schema for which the specified privilege will be granted for all tables.
     */
    onAllTablesInSchema?: pulumi.Input<string>;
    /**
     * The fully qualified name of the database on which privileges will be granted. For more information about this resource, see docs.
     */
    onDatabase?: pulumi.Input<string>;
    /**
     * The fully qualified name of the function on which privileges will be granted.
     */
    onFunction?: pulumi.Input<string>;
    /**
     * The fully qualified name of the schema on which privileges will be granted. For more information about this resource, see docs.
     */
    onSchema?: pulumi.Input<string>;
    /**
     * The fully qualified name of the table on which privileges will be granted. For more information about this resource, see docs.
     */
    onTable?: pulumi.Input<string>;
    /**
     * The fully qualified name of the tag on which privileges will be granted. For more information about this resource, see docs.
     */
    onTag?: pulumi.Input<string>;
    /**
     * The fully qualified name of the view on which privileges will be granted. For more information about this resource, see docs.
     */
    onView?: pulumi.Input<string>;
    /**
     * The privileges to grant on the share. See available list of privileges: https://docs.snowflake.com/en/sql-reference/sql/grant-privilege-share#syntax
     */
    privileges: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The fully qualified name of the share on which privileges will be granted. For more information about this resource, see docs.
     */
    toShare: pulumi.Input<string>;
}
