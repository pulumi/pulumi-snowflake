// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as snowflake from "@pulumi/snowflake";
 *
 * const this = snowflake.getDatabases({});
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getDatabases(args?: GetDatabasesArgs, opts?: pulumi.InvokeOptions): Promise<GetDatabasesResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("snowflake:index/getDatabases:getDatabases", {
        "history": args.history,
        "pattern": args.pattern,
        "startsWith": args.startsWith,
        "terse": args.terse,
    }, opts);
}

/**
 * A collection of arguments for invoking getDatabases.
 */
export interface GetDatabasesArgs {
    /**
     * Optionally includes dropped databases that have not yet been purged The output also includes an additional `droppedOn` column
     */
    history?: boolean;
    /**
     * Optionally filters the databases by a pattern
     */
    pattern?: string;
    /**
     * Optionally filters the databases by a pattern
     */
    startsWith?: string;
    /**
     * Optionally returns only the columns `createdOn` and `name` in the results
     */
    terse?: boolean;
}

/**
 * A collection of values returned by getDatabases.
 */
export interface GetDatabasesResult {
    /**
     * Snowflake databases
     */
    readonly databases: outputs.GetDatabasesDatabase[];
    /**
     * Optionally includes dropped databases that have not yet been purged The output also includes an additional `droppedOn` column
     */
    readonly history?: boolean;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Optionally filters the databases by a pattern
     */
    readonly pattern?: string;
    /**
     * Optionally filters the databases by a pattern
     */
    readonly startsWith?: string;
    /**
     * Optionally returns only the columns `createdOn` and `name` in the results
     */
    readonly terse?: boolean;
}
/**
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as snowflake from "@pulumi/snowflake";
 *
 * const this = snowflake.getDatabases({});
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getDatabasesOutput(args?: GetDatabasesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetDatabasesResult> {
    return pulumi.output(args).apply((a: any) => getDatabases(a, opts))
}

/**
 * A collection of arguments for invoking getDatabases.
 */
export interface GetDatabasesOutputArgs {
    /**
     * Optionally includes dropped databases that have not yet been purged The output also includes an additional `droppedOn` column
     */
    history?: pulumi.Input<boolean>;
    /**
     * Optionally filters the databases by a pattern
     */
    pattern?: pulumi.Input<string>;
    /**
     * Optionally filters the databases by a pattern
     */
    startsWith?: pulumi.Input<string>;
    /**
     * Optionally returns only the columns `createdOn` and `name` in the results
     */
    terse?: pulumi.Input<boolean>;
}
