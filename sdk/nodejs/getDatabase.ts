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
 * const thisDatabase = pulumi.output(snowflake.getDatabase({
 *     name: "DEMO_DB",
 * }));
 * ```
 */
export function getDatabase(args: GetDatabaseArgs, opts?: pulumi.InvokeOptions): Promise<GetDatabaseResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("snowflake:index/getDatabase:getDatabase", {
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getDatabase.
 */
export interface GetDatabaseArgs {
    name: string;
}

/**
 * A collection of values returned by getDatabase.
 */
export interface GetDatabaseResult {
    readonly comment: string;
    readonly createdOn: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly isCurrent: boolean;
    readonly isDefault: boolean;
    readonly name: string;
    readonly options: string;
    readonly origin: string;
    readonly owner: string;
    readonly retentionTime: number;
}

export function getDatabaseOutput(args: GetDatabaseOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetDatabaseResult> {
    return pulumi.output(args).apply(a => getDatabase(a, opts))
}

/**
 * A collection of arguments for invoking getDatabase.
 */
export interface GetDatabaseOutputArgs {
    name: pulumi.Input<string>;
}
