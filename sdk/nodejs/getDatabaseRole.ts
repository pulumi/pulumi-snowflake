// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as snowflake from "@pulumi/snowflake";
 *
 * const dbRole = snowflake.getDatabaseRole({
 *     database: "MYDB",
 *     name: "DBROLE",
 * });
 * ```
 */
export function getDatabaseRole(args: GetDatabaseRoleArgs, opts?: pulumi.InvokeOptions): Promise<GetDatabaseRoleResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("snowflake:index/getDatabaseRole:getDatabaseRole", {
        "database": args.database,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getDatabaseRole.
 */
export interface GetDatabaseRoleArgs {
    /**
     * The database from which to return the database role from.
     */
    database: string;
    /**
     * Database role name.
     */
    name: string;
}

/**
 * A collection of values returned by getDatabaseRole.
 */
export interface GetDatabaseRoleResult {
    /**
     * The comment on the role
     */
    readonly comment: string;
    /**
     * The database from which to return the database role from.
     */
    readonly database: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Database role name.
     */
    readonly name: string;
    /**
     * The owner of the role
     */
    readonly owner: string;
}
/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as snowflake from "@pulumi/snowflake";
 *
 * const dbRole = snowflake.getDatabaseRole({
 *     database: "MYDB",
 *     name: "DBROLE",
 * });
 * ```
 */
export function getDatabaseRoleOutput(args: GetDatabaseRoleOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetDatabaseRoleResult> {
    return pulumi.output(args).apply((a: any) => getDatabaseRole(a, opts))
}

/**
 * A collection of arguments for invoking getDatabaseRole.
 */
export interface GetDatabaseRoleOutputArgs {
    /**
     * The database from which to return the database role from.
     */
    database: pulumi.Input<string>;
    /**
     * Database role name.
     */
    name: pulumi.Input<string>;
}
