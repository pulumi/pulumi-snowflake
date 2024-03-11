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
 * const current = snowflake.getAlerts({
 *     database: "MYDB",
 *     schema: "MYSCHEMA",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getAlerts(args?: GetAlertsArgs, opts?: pulumi.InvokeOptions): Promise<GetAlertsResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("snowflake:index/getAlerts:getAlerts", {
        "database": args.database,
        "pattern": args.pattern,
        "schema": args.schema,
    }, opts);
}

/**
 * A collection of arguments for invoking getAlerts.
 */
export interface GetAlertsArgs {
    /**
     * The database from which to return the alerts from.
     */
    database?: string;
    /**
     * Filters the command output by object name.
     */
    pattern?: string;
    /**
     * The schema from which to return the alerts from.
     */
    schema?: string;
}

/**
 * A collection of values returned by getAlerts.
 */
export interface GetAlertsResult {
    /**
     * Lists alerts for the current/specified database or schema, or across the entire account.
     */
    readonly alerts: outputs.GetAlertsAlert[];
    /**
     * The database from which to return the alerts from.
     */
    readonly database?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Filters the command output by object name.
     */
    readonly pattern?: string;
    /**
     * The schema from which to return the alerts from.
     */
    readonly schema?: string;
}
/**
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as snowflake from "@pulumi/snowflake";
 *
 * const current = snowflake.getAlerts({
 *     database: "MYDB",
 *     schema: "MYSCHEMA",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getAlertsOutput(args?: GetAlertsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetAlertsResult> {
    return pulumi.output(args).apply((a: any) => getAlerts(a, opts))
}

/**
 * A collection of arguments for invoking getAlerts.
 */
export interface GetAlertsOutputArgs {
    /**
     * The database from which to return the alerts from.
     */
    database?: pulumi.Input<string>;
    /**
     * Filters the command output by object name.
     */
    pattern?: pulumi.Input<string>;
    /**
     * The schema from which to return the alerts from.
     */
    schema?: pulumi.Input<string>;
}
