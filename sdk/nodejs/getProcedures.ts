// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * !> **Caution: Preview Feature** This feature is considered a preview feature in the provider, regardless of the state of the resource in Snowflake. We do not guarantee its stability. It will be reworked and marked as a stable feature in future releases. Breaking changes are expected, even without bumping the major version. To use this feature, add the relevant feature name to `previewFeaturesEnabled` field in the provider configuration. Please always refer to the Getting Help section in our Github repo to best determine how to get help for your questions.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as snowflake from "@pulumi/snowflake";
 *
 * const current = snowflake.getProcedures({
 *     database: "MYDB",
 *     schema: "MYSCHEMA",
 * });
 * ```
 *
 * > **Note** If a field has a default value, it is shown next to the type in the schema.
 */
export function getProcedures(args: GetProceduresArgs, opts?: pulumi.InvokeOptions): Promise<GetProceduresResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("snowflake:index/getProcedures:getProcedures", {
        "database": args.database,
        "schema": args.schema,
    }, opts);
}

/**
 * A collection of arguments for invoking getProcedures.
 */
export interface GetProceduresArgs {
    /**
     * The database from which to return the schemas from.
     */
    database: string;
    /**
     * The schema from which to return the procedures from.
     */
    schema: string;
}

/**
 * A collection of values returned by getProcedures.
 */
export interface GetProceduresResult {
    /**
     * The database from which to return the schemas from.
     */
    readonly database: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The procedures in the schema
     */
    readonly procedures: outputs.GetProceduresProcedure[];
    /**
     * The schema from which to return the procedures from.
     */
    readonly schema: string;
}
/**
 * !> **Caution: Preview Feature** This feature is considered a preview feature in the provider, regardless of the state of the resource in Snowflake. We do not guarantee its stability. It will be reworked and marked as a stable feature in future releases. Breaking changes are expected, even without bumping the major version. To use this feature, add the relevant feature name to `previewFeaturesEnabled` field in the provider configuration. Please always refer to the Getting Help section in our Github repo to best determine how to get help for your questions.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as snowflake from "@pulumi/snowflake";
 *
 * const current = snowflake.getProcedures({
 *     database: "MYDB",
 *     schema: "MYSCHEMA",
 * });
 * ```
 *
 * > **Note** If a field has a default value, it is shown next to the type in the schema.
 */
export function getProceduresOutput(args: GetProceduresOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetProceduresResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("snowflake:index/getProcedures:getProcedures", {
        "database": args.database,
        "schema": args.schema,
    }, opts);
}

/**
 * A collection of arguments for invoking getProcedures.
 */
export interface GetProceduresOutputArgs {
    /**
     * The database from which to return the schemas from.
     */
    database: pulumi.Input<string>;
    /**
     * The schema from which to return the procedures from.
     */
    schema: pulumi.Input<string>;
}
