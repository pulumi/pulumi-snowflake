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
 * const current = snowflake.getFileFormats({
 *     database: "MYDB",
 *     schema: "MYSCHEMA",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getFileFormats(args: GetFileFormatsArgs, opts?: pulumi.InvokeOptions): Promise<GetFileFormatsResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("snowflake:index/getFileFormats:getFileFormats", {
        "database": args.database,
        "schema": args.schema,
    }, opts);
}

/**
 * A collection of arguments for invoking getFileFormats.
 */
export interface GetFileFormatsArgs {
    database: string;
    schema: string;
}

/**
 * A collection of values returned by getFileFormats.
 */
export interface GetFileFormatsResult {
    /**
     * The database from which to return the schemas from.
     */
    readonly database: string;
    /**
     * The file formats in the schema
     */
    readonly fileFormats: outputs.GetFileFormatsFileFormat[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The schema from which to return the file formats from.
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
 * const current = snowflake.getFileFormats({
 *     database: "MYDB",
 *     schema: "MYSCHEMA",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getFileFormatsOutput(args: GetFileFormatsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetFileFormatsResult> {
    return pulumi.output(args).apply((a: any) => getFileFormats(a, opts))
}

/**
 * A collection of arguments for invoking getFileFormats.
 */
export interface GetFileFormatsOutputArgs {
    database: pulumi.Input<string>;
    schema: pulumi.Input<string>;
}
