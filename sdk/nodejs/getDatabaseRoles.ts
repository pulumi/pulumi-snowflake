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
 * const dbRoles = snowflake.getDatabaseRoles({
 *     database: "MYDB",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getDatabaseRoles(args: GetDatabaseRolesArgs, opts?: pulumi.InvokeOptions): Promise<GetDatabaseRolesResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("snowflake:index/getDatabaseRoles:getDatabaseRoles", {
        "database": args.database,
    }, opts);
}

/**
 * A collection of arguments for invoking getDatabaseRoles.
 */
export interface GetDatabaseRolesArgs {
    /**
     * The database from which to return the database roles from.
     */
    database: string;
}

/**
 * A collection of values returned by getDatabaseRoles.
 */
export interface GetDatabaseRolesResult {
    /**
     * The database from which to return the database roles from.
     */
    readonly database: string;
    /**
     * Lists all the database roles in a specified database.
     */
    readonly databaseRoles: outputs.GetDatabaseRolesDatabaseRole[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
/**
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as snowflake from "@pulumi/snowflake";
 *
 * const dbRoles = snowflake.getDatabaseRoles({
 *     database: "MYDB",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getDatabaseRolesOutput(args: GetDatabaseRolesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetDatabaseRolesResult> {
    return pulumi.output(args).apply((a: any) => getDatabaseRoles(a, opts))
}

/**
 * A collection of arguments for invoking getDatabaseRoles.
 */
export interface GetDatabaseRolesOutputArgs {
    /**
     * The database from which to return the database roles from.
     */
    database: pulumi.Input<string>;
}
