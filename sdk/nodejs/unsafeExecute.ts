// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

export class UnsafeExecute extends pulumi.CustomResource {
    /**
     * Get an existing UnsafeExecute resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: UnsafeExecuteState, opts?: pulumi.CustomResourceOptions): UnsafeExecute {
        return new UnsafeExecute(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'snowflake:index/unsafeExecute:UnsafeExecute';

    /**
     * Returns true if the given object is an instance of UnsafeExecute.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is UnsafeExecute {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === UnsafeExecute.__pulumiType;
    }

    /**
     * SQL statement to execute. Forces recreation of resource on change.
     */
    public readonly execute!: pulumi.Output<string>;
    /**
     * Optional SQL statement to do a read. Invoked after creation and every time it is changed.
     */
    public readonly query!: pulumi.Output<string | undefined>;
    /**
     * List of key-value maps (text to text) retrieved after executing read query. Will be empty if the query results in an error.
     */
    public /*out*/ readonly queryResults!: pulumi.Output<{[key: string]: string}[]>;
    /**
     * SQL statement to revert the execute statement. Invoked when resource is being destroyed.
     */
    public readonly revert!: pulumi.Output<string>;

    /**
     * Create a UnsafeExecute resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: UnsafeExecuteArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: UnsafeExecuteArgs | UnsafeExecuteState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as UnsafeExecuteState | undefined;
            resourceInputs["execute"] = state ? state.execute : undefined;
            resourceInputs["query"] = state ? state.query : undefined;
            resourceInputs["queryResults"] = state ? state.queryResults : undefined;
            resourceInputs["revert"] = state ? state.revert : undefined;
        } else {
            const args = argsOrState as UnsafeExecuteArgs | undefined;
            if ((!args || args.execute === undefined) && !opts.urn) {
                throw new Error("Missing required property 'execute'");
            }
            if ((!args || args.revert === undefined) && !opts.urn) {
                throw new Error("Missing required property 'revert'");
            }
            resourceInputs["execute"] = args ? args.execute : undefined;
            resourceInputs["query"] = args ? args.query : undefined;
            resourceInputs["revert"] = args ? args.revert : undefined;
            resourceInputs["queryResults"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(UnsafeExecute.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering UnsafeExecute resources.
 */
export interface UnsafeExecuteState {
    /**
     * SQL statement to execute. Forces recreation of resource on change.
     */
    execute?: pulumi.Input<string>;
    /**
     * Optional SQL statement to do a read. Invoked after creation and every time it is changed.
     */
    query?: pulumi.Input<string>;
    /**
     * List of key-value maps (text to text) retrieved after executing read query. Will be empty if the query results in an error.
     */
    queryResults?: pulumi.Input<pulumi.Input<{[key: string]: pulumi.Input<string>}>[]>;
    /**
     * SQL statement to revert the execute statement. Invoked when resource is being destroyed.
     */
    revert?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a UnsafeExecute resource.
 */
export interface UnsafeExecuteArgs {
    /**
     * SQL statement to execute. Forces recreation of resource on change.
     */
    execute: pulumi.Input<string>;
    /**
     * Optional SQL statement to do a read. Invoked after creation and every time it is changed.
     */
    query?: pulumi.Input<string>;
    /**
     * SQL statement to revert the execute statement. Invoked when resource is being destroyed.
     */
    revert: pulumi.Input<string>;
}
