// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as snowflake from "@pulumi/snowflake";
 *
 * const current = pulumi.output(snowflake.getFunctions({
 *     database: "MYDB",
 *     schema: "MYSCHEMA",
 * }));
 * ```
 */
export function getFunctions(args: GetFunctionsArgs, opts?: pulumi.InvokeOptions): Promise<GetFunctionsResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("snowflake:index/getFunctions:getFunctions", {
        "database": args.database,
        "schema": args.schema,
    }, opts);
}

/**
 * A collection of arguments for invoking getFunctions.
 */
export interface GetFunctionsArgs {
    /**
     * The database from which to return the schemas from.
     */
    database: string;
    /**
     * The schema from which to return the functions from.
     */
    schema: string;
}

/**
 * A collection of values returned by getFunctions.
 */
export interface GetFunctionsResult {
    /**
     * The database from which to return the schemas from.
     */
    readonly database: string;
    /**
     * The functions in the schema
     */
    readonly functions: outputs.GetFunctionsFunction[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The schema from which to return the functions from.
     */
    readonly schema: string;
}

export function getFunctionsOutput(args: GetFunctionsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetFunctionsResult> {
    return pulumi.output(args).apply(a => getFunctions(a, opts))
}

/**
 * A collection of arguments for invoking getFunctions.
 */
export interface GetFunctionsOutputArgs {
    /**
     * The database from which to return the schemas from.
     */
    database: pulumi.Input<string>;
    /**
     * The schema from which to return the functions from.
     */
    schema: pulumi.Input<string>;
}
