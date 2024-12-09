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
 * const current = snowflake.getTables({
 *     database: "MYDB",
 *     schema: "MYSCHEMA",
 * });
 * ```
 */
export function getTables(args: GetTablesArgs, opts?: pulumi.InvokeOptions): Promise<GetTablesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("snowflake:index/getTables:getTables", {
        "database": args.database,
        "schema": args.schema,
    }, opts);
}

/**
 * A collection of arguments for invoking getTables.
 */
export interface GetTablesArgs {
    /**
     * The database from which to return the schemas from.
     */
    database: string;
    /**
     * The schema from which to return the tables from.
     */
    schema: string;
}

/**
 * A collection of values returned by getTables.
 */
export interface GetTablesResult {
    /**
     * The database from which to return the schemas from.
     */
    readonly database: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The schema from which to return the tables from.
     */
    readonly schema: string;
    /**
     * The tables in the schema
     */
    readonly tables: outputs.GetTablesTable[];
}
/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as snowflake from "@pulumi/snowflake";
 *
 * const current = snowflake.getTables({
 *     database: "MYDB",
 *     schema: "MYSCHEMA",
 * });
 * ```
 */
export function getTablesOutput(args: GetTablesOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetTablesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("snowflake:index/getTables:getTables", {
        "database": args.database,
        "schema": args.schema,
    }, opts);
}

/**
 * A collection of arguments for invoking getTables.
 */
export interface GetTablesOutputArgs {
    /**
     * The database from which to return the schemas from.
     */
    database: pulumi.Input<string>;
    /**
     * The schema from which to return the tables from.
     */
    schema: pulumi.Input<string>;
}
