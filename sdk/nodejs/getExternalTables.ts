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
 * const current = snowflake.getExternalTables({
 *     database: "MYDB",
 *     schema: "MYSCHEMA",
 * });
 * ```
 */
export function getExternalTables(args: GetExternalTablesArgs, opts?: pulumi.InvokeOptions): Promise<GetExternalTablesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("snowflake:index/getExternalTables:getExternalTables", {
        "database": args.database,
        "schema": args.schema,
    }, opts);
}

/**
 * A collection of arguments for invoking getExternalTables.
 */
export interface GetExternalTablesArgs {
    /**
     * The database from which to return the schemas from.
     */
    database: string;
    /**
     * The schema from which to return the external tables from.
     */
    schema: string;
}

/**
 * A collection of values returned by getExternalTables.
 */
export interface GetExternalTablesResult {
    /**
     * The database from which to return the schemas from.
     */
    readonly database: string;
    /**
     * The external tables in the schema
     */
    readonly externalTables: outputs.GetExternalTablesExternalTable[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The schema from which to return the external tables from.
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
 * const current = snowflake.getExternalTables({
 *     database: "MYDB",
 *     schema: "MYSCHEMA",
 * });
 * ```
 */
export function getExternalTablesOutput(args: GetExternalTablesOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetExternalTablesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("snowflake:index/getExternalTables:getExternalTables", {
        "database": args.database,
        "schema": args.schema,
    }, opts);
}

/**
 * A collection of arguments for invoking getExternalTables.
 */
export interface GetExternalTablesOutputArgs {
    /**
     * The database from which to return the schemas from.
     */
    database: pulumi.Input<string>;
    /**
     * The schema from which to return the external tables from.
     */
    schema: pulumi.Input<string>;
}
