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
 * const current = snowflake.getPipes({
 *     database: "MYDB",
 *     schema: "MYSCHEMA",
 * });
 * ```
 */
export function getPipes(args: GetPipesArgs, opts?: pulumi.InvokeOptions): Promise<GetPipesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("snowflake:index/getPipes:getPipes", {
        "database": args.database,
        "schema": args.schema,
    }, opts);
}

/**
 * A collection of arguments for invoking getPipes.
 */
export interface GetPipesArgs {
    /**
     * The database from which to return the schemas from.
     */
    database: string;
    /**
     * The schema from which to return the pipes from.
     */
    schema: string;
}

/**
 * A collection of values returned by getPipes.
 */
export interface GetPipesResult {
    /**
     * The database from which to return the schemas from.
     */
    readonly database: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The pipes in the schema
     */
    readonly pipes: outputs.GetPipesPipe[];
    /**
     * The schema from which to return the pipes from.
     */
    readonly schema: string;
}
/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as snowflake from "@pulumi/snowflake";
 *
 * const current = snowflake.getPipes({
 *     database: "MYDB",
 *     schema: "MYSCHEMA",
 * });
 * ```
 */
export function getPipesOutput(args: GetPipesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetPipesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("snowflake:index/getPipes:getPipes", {
        "database": args.database,
        "schema": args.schema,
    }, opts);
}

/**
 * A collection of arguments for invoking getPipes.
 */
export interface GetPipesOutputArgs {
    /**
     * The database from which to return the schemas from.
     */
    database: pulumi.Input<string>;
    /**
     * The schema from which to return the pipes from.
     */
    schema: pulumi.Input<string>;
}
