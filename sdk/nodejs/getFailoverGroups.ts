// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * !> **Caution: Preview Feature** This feature is considered a preview feature in the provider, regardless of the state of the resource in Snowflake. We do not guarantee its stability. It will be reworked and marked as a stable feature in future releases. Breaking changes are expected, even without bumping the major version. To use this feature, add the relevant feature name to `previewFeaturesEnabled field` in the provider configuration. Please always refer to the Getting Help section in our Github repo to best determine how to get help for your questions.
 */
export function getFailoverGroups(args?: GetFailoverGroupsArgs, opts?: pulumi.InvokeOptions): Promise<GetFailoverGroupsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("snowflake:index/getFailoverGroups:getFailoverGroups", {
        "inAccount": args.inAccount,
    }, opts);
}

/**
 * A collection of arguments for invoking getFailoverGroups.
 */
export interface GetFailoverGroupsArgs {
    /**
     * Specifies the identifier for the account
     */
    inAccount?: string;
}

/**
 * A collection of values returned by getFailoverGroups.
 */
export interface GetFailoverGroupsResult {
    /**
     * List of all the failover groups available in the system.
     */
    readonly failoverGroups: outputs.GetFailoverGroupsFailoverGroup[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Specifies the identifier for the account
     */
    readonly inAccount?: string;
}
/**
 * !> **Caution: Preview Feature** This feature is considered a preview feature in the provider, regardless of the state of the resource in Snowflake. We do not guarantee its stability. It will be reworked and marked as a stable feature in future releases. Breaking changes are expected, even without bumping the major version. To use this feature, add the relevant feature name to `previewFeaturesEnabled field` in the provider configuration. Please always refer to the Getting Help section in our Github repo to best determine how to get help for your questions.
 */
export function getFailoverGroupsOutput(args?: GetFailoverGroupsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetFailoverGroupsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("snowflake:index/getFailoverGroups:getFailoverGroups", {
        "inAccount": args.inAccount,
    }, opts);
}

/**
 * A collection of arguments for invoking getFailoverGroups.
 */
export interface GetFailoverGroupsOutputArgs {
    /**
     * Specifies the identifier for the account
     */
    inAccount?: pulumi.Input<string>;
}
