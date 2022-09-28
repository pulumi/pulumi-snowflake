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
    /**
     * The database from which to return the schemas from.
     */
    database: string;
    /**
     * The schema from which to return the row access policyfrom.
     */
    schema: string;
}

/**
 * A collection of values returned by getRowAccessPolicies.
 */
export interface GetRowAccessPoliciesResult {
    /**
     * The database from which to return the schemas from.
     */
    readonly database: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The row access policy in the schema
     */
    readonly rowAccessPolicies: outputs.GetRowAccessPoliciesRowAccessPolicy[];
    /**
     * The schema from which to return the row access policyfrom.
     */
    readonly schema: string;
}

export function getRowAccessPoliciesOutput(args: GetRowAccessPoliciesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetRowAccessPoliciesResult> {
    return pulumi.output(args).apply(a => getRowAccessPolicies(a, opts))
}

/**
 * A collection of arguments for invoking getRowAccessPolicies.
 */
export interface GetRowAccessPoliciesOutputArgs {
    /**
     * The database from which to return the schemas from.
     */
    database: pulumi.Input<string>;
    /**
     * The schema from which to return the row access policyfrom.
     */
    schema: pulumi.Input<string>;
}
