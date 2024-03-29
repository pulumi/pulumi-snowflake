// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 */
export function getSystemGetPrivateLinkConfig(opts?: pulumi.InvokeOptions): Promise<GetSystemGetPrivateLinkConfigResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("snowflake:index/getSystemGetPrivateLinkConfig:getSystemGetPrivateLinkConfig", {
    }, opts);
}

/**
 * A collection of values returned by getSystemGetPrivateLinkConfig.
 */
export interface GetSystemGetPrivateLinkConfigResult {
    /**
     * The name of your Snowflake account.
     */
    readonly accountName: string;
    /**
     * The URL used to connect to Snowflake through AWS PrivateLink or Azure Private Link.
     */
    readonly accountUrl: string;
    /**
     * The AWS VPCE ID for your account.
     */
    readonly awsVpceId: string;
    /**
     * The Azure Private Link Service ID for your account.
     */
    readonly azurePlsId: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The endpoint to connect to your Snowflake internal stage using AWS PrivateLink or Azure Private Link.
     */
    readonly internalStage: string;
    /**
     * The OCSP URL corresponding to your Snowflake account that uses AWS PrivateLink or Azure Private Link.
     */
    readonly ocspUrl: string;
    /**
     * The regionless URL to connect to your Snowflake account using AWS PrivateLink, Azure Private Link, or Google Cloud Private Service Connect.
     */
    readonly regionlessAccountUrl: string;
    /**
     * The URL for your organization to access Snowsight using Private Connectivity to the Snowflake Service.
     */
    readonly regionlessSnowsightUrl: string;
    /**
     * The URL containing the cloud region to access Snowsight and the Snowflake Marketplace using Private Connectivity to the Snowflake Service.
     */
    readonly snowsightUrl: string;
}
/**
 * ## Example Usage
 */
export function getSystemGetPrivateLinkConfigOutput(opts?: pulumi.InvokeOptions): pulumi.Output<GetSystemGetPrivateLinkConfigResult> {
    return pulumi.output(getSystemGetPrivateLinkConfig(opts))
}
