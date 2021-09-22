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
 * const test = new snowflake.Share("test", {
 *     comment: "cool comment",
 * });
 * ```
 *
 * ## Import
 *
 * ```sh
 *  $ pulumi import snowflake:index/share:Share example name
 * ```
 */
export class Share extends pulumi.CustomResource {
    /**
     * Get an existing Share resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ShareState, opts?: pulumi.CustomResourceOptions): Share {
        return new Share(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'snowflake:index/share:Share';

    /**
     * Returns true if the given object is an instance of Share.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Share {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Share.__pulumiType;
    }

    /**
     * A list of accounts to be added to the share.
     */
    public readonly accounts!: pulumi.Output<string[] | undefined>;
    /**
     * Specifies a comment for the managed account.
     */
    public readonly comment!: pulumi.Output<string | undefined>;
    /**
     * Specifies the identifier for the share; must be unique for the account in which the share is created.
     */
    public readonly name!: pulumi.Output<string>;

    /**
     * Create a Share resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: ShareArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ShareArgs | ShareState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ShareState | undefined;
            inputs["accounts"] = state ? state.accounts : undefined;
            inputs["comment"] = state ? state.comment : undefined;
            inputs["name"] = state ? state.name : undefined;
        } else {
            const args = argsOrState as ShareArgs | undefined;
            inputs["accounts"] = args ? args.accounts : undefined;
            inputs["comment"] = args ? args.comment : undefined;
            inputs["name"] = args ? args.name : undefined;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(Share.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Share resources.
 */
export interface ShareState {
    /**
     * A list of accounts to be added to the share.
     */
    accounts?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Specifies a comment for the managed account.
     */
    comment?: pulumi.Input<string>;
    /**
     * Specifies the identifier for the share; must be unique for the account in which the share is created.
     */
    name?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Share resource.
 */
export interface ShareArgs {
    /**
     * A list of accounts to be added to the share.
     */
    accounts?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Specifies a comment for the managed account.
     */
    comment?: pulumi.Input<string>;
    /**
     * Specifies the identifier for the share; must be unique for the account in which the share is created.
     */
    name?: pulumi.Input<string>;
}
