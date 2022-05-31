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
 * const current = pulumi.output(snowflake.getRowAccessPolicies({
 *     database: "MYDB",
 *     schema: "MYSCHEMA",
 * }));
 * ```
 */
export function getRowAccessPolicies(args: GetRowAccessPoliciesArgs, opts?: pulumi.InvokeOptions): Promise<GetRowAccessPoliciesResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("snowflake:index/getRowAccessPolicies:getRowAccessPolicies", {
        "database": args.database,
        "schema": args.schema,
    }, opts);
}

/**
 * A collection of arguments for invoking getRowAccessPolicies.
 */
export interface GetRowAccessPoliciesArgs {
    database: string;
    schema: string;
}

/**
 * A collection of values returned by getRowAccessPolicies.
 */
export interface GetRowAccessPoliciesResult {
    readonly database: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly rowAccessPolicies: outputs.GetRowAccessPoliciesRowAccessPolicy[];
    readonly schema: string;
}

export function getRowAccessPoliciesOutput(args: GetRowAccessPoliciesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetRowAccessPoliciesResult> {
    return pulumi.output(args).apply(a => getRowAccessPolicies(a, opts))
}

/**
 * A collection of arguments for invoking getRowAccessPolicies.
 */
export interface GetRowAccessPoliciesOutputArgs {
    database: pulumi.Input<string>;
    schema: pulumi.Input<string>;
}
