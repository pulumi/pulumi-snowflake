// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as snowflake from "@pulumi/snowflake";
 *
 * const current = snowflake.getViews({
 *     database: "MYDB",
 *     schema: "MYSCHEMA",
 * });
 * ```
 */
export function getViews(args: GetViewsArgs, opts?: pulumi.InvokeOptions): Promise<GetViewsResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("snowflake:index/getViews:getViews", {
        "database": args.database,
        "schema": args.schema,
    }, opts);
}

/**
 * A collection of arguments for invoking getViews.
 */
export interface GetViewsArgs {
    database: string;
    schema: string;
}

/**
 * A collection of values returned by getViews.
 */
export interface GetViewsResult {
    /**
     * The database from which to return the schemas from.
     */
    readonly database: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The schema from which to return the views from.
     */
    readonly schema: string;
    /**
     * The views in the schema
     */
    readonly views: outputs.GetViewsView[];
}
/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as snowflake from "@pulumi/snowflake";
 *
 * const current = snowflake.getViews({
 *     database: "MYDB",
 *     schema: "MYSCHEMA",
 * });
 * ```
 */
export function getViewsOutput(args: GetViewsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetViewsResult> {
    return pulumi.output(args).apply((a: any) => getViews(a, opts))
}

/**
 * A collection of arguments for invoking getViews.
 */
export interface GetViewsOutputArgs {
    database: pulumi.Input<string>;
    schema: pulumi.Input<string>;
}
