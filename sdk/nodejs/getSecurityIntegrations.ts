// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Data source used to get details of filtered security integrations. Filtering is aligned with the current possibilities for [SHOW SECURITY INTEGRATIONS](https://docs.snowflake.com/en/sql-reference/sql/show-integrations) query (only `like` is supported). The results of SHOW and DESCRIBE are encapsulated in one output collection `securityIntegrations`.
 */
export function getSecurityIntegrations(args?: GetSecurityIntegrationsArgs, opts?: pulumi.InvokeOptions): Promise<GetSecurityIntegrationsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("snowflake:index/getSecurityIntegrations:getSecurityIntegrations", {
        "like": args.like,
        "withDescribe": args.withDescribe,
    }, opts);
}

/**
 * A collection of arguments for invoking getSecurityIntegrations.
 */
export interface GetSecurityIntegrationsArgs {
    /**
     * Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
     */
    like?: string;
    /**
     * (Default: `true`) Runs DESC SECURITY INTEGRATION for each security integration returned by SHOW SECURITY INTEGRATIONS. The output of describe is saved to the description field. By default this value is set to true.
     */
    withDescribe?: boolean;
}

/**
 * A collection of values returned by getSecurityIntegrations.
 */
export interface GetSecurityIntegrationsResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
     */
    readonly like?: string;
    /**
     * Holds the aggregated output of all security integrations details queries.
     */
    readonly securityIntegrations: outputs.GetSecurityIntegrationsSecurityIntegration[];
    /**
     * (Default: `true`) Runs DESC SECURITY INTEGRATION for each security integration returned by SHOW SECURITY INTEGRATIONS. The output of describe is saved to the description field. By default this value is set to true.
     */
    readonly withDescribe?: boolean;
}
/**
 * Data source used to get details of filtered security integrations. Filtering is aligned with the current possibilities for [SHOW SECURITY INTEGRATIONS](https://docs.snowflake.com/en/sql-reference/sql/show-integrations) query (only `like` is supported). The results of SHOW and DESCRIBE are encapsulated in one output collection `securityIntegrations`.
 */
export function getSecurityIntegrationsOutput(args?: GetSecurityIntegrationsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetSecurityIntegrationsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("snowflake:index/getSecurityIntegrations:getSecurityIntegrations", {
        "like": args.like,
        "withDescribe": args.withDescribe,
    }, opts);
}

/**
 * A collection of arguments for invoking getSecurityIntegrations.
 */
export interface GetSecurityIntegrationsOutputArgs {
    /**
     * Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
     */
    like?: pulumi.Input<string>;
    /**
     * (Default: `true`) Runs DESC SECURITY INTEGRATION for each security integration returned by SHOW SECURITY INTEGRATIONS. The output of describe is saved to the description field. By default this value is set to true.
     */
    withDescribe?: pulumi.Input<boolean>;
}
