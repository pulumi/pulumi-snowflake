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
 * const current = snowflake.getRowAccessPolicies({
 *     database: "MYDB",
 *     schema: "MYSCHEMA",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getRowAccessPolicies(args: GetRowAccessPoliciesArgs, opts?: pulumi.InvokeOptions): Promise<GetRowAccessPoliciesResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
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
     * The schema from which to return the row access policy from.
     */
    readonly schema: string;
}
/**
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as snowflake from "@pulumi/snowflake";
 *
 * const current = snowflake.getRowAccessPolicies({
 *     database: "MYDB",
 *     schema: "MYSCHEMA",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getRowAccessPoliciesOutput(args: GetRowAccessPoliciesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetRowAccessPoliciesResult> {
    return pulumi.output(args).apply((a: any) => getRowAccessPolicies(a, opts))
}

/**
 * A collection of arguments for invoking getRowAccessPolicies.
 */
export interface GetRowAccessPoliciesOutputArgs {
    database: pulumi.Input<string>;
    schema: pulumi.Input<string>;
}
