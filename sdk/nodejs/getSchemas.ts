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
 * const current = pulumi.output(snowflake.getSchemas({
 *     database: "MYDB",
 * }));
 * ```
 */
export function getSchemas(args: GetSchemasArgs, opts?: pulumi.InvokeOptions): Promise<GetSchemasResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("snowflake:index/getSchemas:getSchemas", {
        "database": args.database,
    }, opts);
}

/**
 * A collection of arguments for invoking getSchemas.
 */
export interface GetSchemasArgs {
    database: string;
}

/**
 * A collection of values returned by getSchemas.
 */
export interface GetSchemasResult {
    readonly database: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly schemas: outputs.GetSchemasSchema[];
}

export function getSchemasOutput(args: GetSchemasOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetSchemasResult> {
    return pulumi.output(args).apply(a => getSchemas(a, opts))
}

/**
 * A collection of arguments for invoking getSchemas.
 */
export interface GetSchemasOutputArgs {
    database: pulumi.Input<string>;
}
