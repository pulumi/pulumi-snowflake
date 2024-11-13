// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * !> **V1 release candidate** This datasource was reworked and is a release candidate for the V1. We do not expect significant changes in it before the V1. We will welcome any feedback and adjust the resource if needed. Any errors reported will be resolved with a higher priority. We encourage checking this resource out before the V1 release. To migrate from older grant resources please follow the migration guide.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as snowflake from "@pulumi/snowflake";
 *
 * //#################################
 * //## SHOW GRANTS ON ...
 * //#################################
 * // account
 * const exampleOnAccount = snowflake.getGrants({
 *     grantsOn: {
 *         account: true,
 *     },
 * });
 * // account object (e.g. database)
 * const exampleOnAccountObject = snowflake.getGrants({
 *     grantsOn: {
 *         objectName: "some_database",
 *         objectType: "DATABASE",
 *     },
 * });
 * // database object (e.g. schema)
 * const exampleOnDatabaseObject = snowflake.getGrants({
 *     grantsOn: {
 *         objectName: "\"some_database\".\"some_schema\"",
 *         objectType: "SCHEMA",
 *     },
 * });
 * // schema object (e.g. table)
 * const exampleOnSchemaObject = snowflake.getGrants({
 *     grantsOn: {
 *         objectName: "\"some_database\".\"some_schema\".\"some_table\"",
 *         objectType: "TABLE",
 *     },
 * });
 * // application
 * const exampleToApplication = snowflake.getGrants({
 *     grantsTo: {
 *         application: "some_application",
 *     },
 * });
 * // application role
 * const exampleToApplicationRole = snowflake.getGrants({
 *     grantsTo: {
 *         applicationRole: "\"some_application\".\"some_application_role\"",
 *     },
 * });
 * // account role
 * const exampleToRole = snowflake.getGrants({
 *     grantsTo: {
 *         accountRole: "some_role",
 *     },
 * });
 * // database role
 * const exampleToDatabaseRole = snowflake.getGrants({
 *     grantsTo: {
 *         databaseRole: "\"some_database\".\"some_database_role\"",
 *     },
 * });
 * // share
 * const exampleToShare = snowflake.getGrants({
 *     grantsTo: {
 *         share: {
 *             shareName: "some_share",
 *         },
 *     },
 * });
 * // user
 * const exampleToUser = snowflake.getGrants({
 *     grantsTo: {
 *         user: "some_user",
 *     },
 * });
 * // application role
 * const exampleOfApplicationRole = snowflake.getGrants({
 *     grantsOf: {
 *         applicationRole: "\"some_application\".\"some_application_role\"",
 *     },
 * });
 * // database role
 * const exampleOfDatabaseRole = snowflake.getGrants({
 *     grantsOf: {
 *         databaseRole: "\"some_database\".\"some_database_role\"",
 *     },
 * });
 * // account role
 * const exampleOfRole = snowflake.getGrants({
 *     grantsOf: {
 *         accountRole: "some_role",
 *     },
 * });
 * // share
 * const exampleOfShare = snowflake.getGrants({
 *     grantsOf: {
 *         share: "some_share",
 *     },
 * });
 * // database
 * const exampleFutureInDatabase = snowflake.getGrants({
 *     futureGrantsIn: {
 *         database: "some_database",
 *     },
 * });
 * // schema
 * const exampleFutureInSchema = snowflake.getGrants({
 *     futureGrantsIn: {
 *         schema: "\"some_database\".\"some_schema\"",
 *     },
 * });
 * // account role
 * const exampleFutureToRole = snowflake.getGrants({
 *     futureGrantsTo: {
 *         accountRole: "some_role",
 *     },
 * });
 * // database role
 * const exampleFutureToDatabaseRole = snowflake.getGrants({
 *     futureGrantsTo: {
 *         databaseRole: "\"some_database\".\"some_database_role\"",
 *     },
 * });
 * ```
 */
export function getGrants(args?: GetGrantsArgs, opts?: pulumi.InvokeOptions): Promise<GetGrantsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("snowflake:index/getGrants:getGrants", {
        "futureGrantsIn": args.futureGrantsIn,
        "futureGrantsTo": args.futureGrantsTo,
        "grantsOf": args.grantsOf,
        "grantsOn": args.grantsOn,
        "grantsTo": args.grantsTo,
    }, opts);
}

/**
 * A collection of arguments for invoking getGrants.
 */
export interface GetGrantsArgs {
    /**
     * Lists all privileges on new (i.e. future) objects.
     */
    futureGrantsIn?: inputs.GetGrantsFutureGrantsIn;
    /**
     * Lists all privileges granted to the object on new (i.e. future) objects.
     */
    futureGrantsTo?: inputs.GetGrantsFutureGrantsTo;
    /**
     * Lists all objects to which the given object has been granted.
     */
    grantsOf?: inputs.GetGrantsGrantsOf;
    /**
     * Lists all privileges that have been granted on an object or on an account.
     */
    grantsOn?: inputs.GetGrantsGrantsOn;
    /**
     * Lists all privileges granted to the object.
     */
    grantsTo?: inputs.GetGrantsGrantsTo;
}

/**
 * A collection of values returned by getGrants.
 */
export interface GetGrantsResult {
    /**
     * Lists all privileges on new (i.e. future) objects.
     */
    readonly futureGrantsIn?: outputs.GetGrantsFutureGrantsIn;
    /**
     * Lists all privileges granted to the object on new (i.e. future) objects.
     */
    readonly futureGrantsTo?: outputs.GetGrantsFutureGrantsTo;
    /**
     * The list of grants
     */
    readonly grants: outputs.GetGrantsGrant[];
    /**
     * Lists all objects to which the given object has been granted.
     */
    readonly grantsOf?: outputs.GetGrantsGrantsOf;
    /**
     * Lists all privileges that have been granted on an object or on an account.
     */
    readonly grantsOn?: outputs.GetGrantsGrantsOn;
    /**
     * Lists all privileges granted to the object.
     */
    readonly grantsTo?: outputs.GetGrantsGrantsTo;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
/**
 * !> **V1 release candidate** This datasource was reworked and is a release candidate for the V1. We do not expect significant changes in it before the V1. We will welcome any feedback and adjust the resource if needed. Any errors reported will be resolved with a higher priority. We encourage checking this resource out before the V1 release. To migrate from older grant resources please follow the migration guide.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as snowflake from "@pulumi/snowflake";
 *
 * //#################################
 * //## SHOW GRANTS ON ...
 * //#################################
 * // account
 * const exampleOnAccount = snowflake.getGrants({
 *     grantsOn: {
 *         account: true,
 *     },
 * });
 * // account object (e.g. database)
 * const exampleOnAccountObject = snowflake.getGrants({
 *     grantsOn: {
 *         objectName: "some_database",
 *         objectType: "DATABASE",
 *     },
 * });
 * // database object (e.g. schema)
 * const exampleOnDatabaseObject = snowflake.getGrants({
 *     grantsOn: {
 *         objectName: "\"some_database\".\"some_schema\"",
 *         objectType: "SCHEMA",
 *     },
 * });
 * // schema object (e.g. table)
 * const exampleOnSchemaObject = snowflake.getGrants({
 *     grantsOn: {
 *         objectName: "\"some_database\".\"some_schema\".\"some_table\"",
 *         objectType: "TABLE",
 *     },
 * });
 * // application
 * const exampleToApplication = snowflake.getGrants({
 *     grantsTo: {
 *         application: "some_application",
 *     },
 * });
 * // application role
 * const exampleToApplicationRole = snowflake.getGrants({
 *     grantsTo: {
 *         applicationRole: "\"some_application\".\"some_application_role\"",
 *     },
 * });
 * // account role
 * const exampleToRole = snowflake.getGrants({
 *     grantsTo: {
 *         accountRole: "some_role",
 *     },
 * });
 * // database role
 * const exampleToDatabaseRole = snowflake.getGrants({
 *     grantsTo: {
 *         databaseRole: "\"some_database\".\"some_database_role\"",
 *     },
 * });
 * // share
 * const exampleToShare = snowflake.getGrants({
 *     grantsTo: {
 *         share: {
 *             shareName: "some_share",
 *         },
 *     },
 * });
 * // user
 * const exampleToUser = snowflake.getGrants({
 *     grantsTo: {
 *         user: "some_user",
 *     },
 * });
 * // application role
 * const exampleOfApplicationRole = snowflake.getGrants({
 *     grantsOf: {
 *         applicationRole: "\"some_application\".\"some_application_role\"",
 *     },
 * });
 * // database role
 * const exampleOfDatabaseRole = snowflake.getGrants({
 *     grantsOf: {
 *         databaseRole: "\"some_database\".\"some_database_role\"",
 *     },
 * });
 * // account role
 * const exampleOfRole = snowflake.getGrants({
 *     grantsOf: {
 *         accountRole: "some_role",
 *     },
 * });
 * // share
 * const exampleOfShare = snowflake.getGrants({
 *     grantsOf: {
 *         share: "some_share",
 *     },
 * });
 * // database
 * const exampleFutureInDatabase = snowflake.getGrants({
 *     futureGrantsIn: {
 *         database: "some_database",
 *     },
 * });
 * // schema
 * const exampleFutureInSchema = snowflake.getGrants({
 *     futureGrantsIn: {
 *         schema: "\"some_database\".\"some_schema\"",
 *     },
 * });
 * // account role
 * const exampleFutureToRole = snowflake.getGrants({
 *     futureGrantsTo: {
 *         accountRole: "some_role",
 *     },
 * });
 * // database role
 * const exampleFutureToDatabaseRole = snowflake.getGrants({
 *     futureGrantsTo: {
 *         databaseRole: "\"some_database\".\"some_database_role\"",
 *     },
 * });
 * ```
 */
export function getGrantsOutput(args?: GetGrantsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetGrantsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("snowflake:index/getGrants:getGrants", {
        "futureGrantsIn": args.futureGrantsIn,
        "futureGrantsTo": args.futureGrantsTo,
        "grantsOf": args.grantsOf,
        "grantsOn": args.grantsOn,
        "grantsTo": args.grantsTo,
    }, opts);
}

/**
 * A collection of arguments for invoking getGrants.
 */
export interface GetGrantsOutputArgs {
    /**
     * Lists all privileges on new (i.e. future) objects.
     */
    futureGrantsIn?: pulumi.Input<inputs.GetGrantsFutureGrantsInArgs>;
    /**
     * Lists all privileges granted to the object on new (i.e. future) objects.
     */
    futureGrantsTo?: pulumi.Input<inputs.GetGrantsFutureGrantsToArgs>;
    /**
     * Lists all objects to which the given object has been granted.
     */
    grantsOf?: pulumi.Input<inputs.GetGrantsGrantsOfArgs>;
    /**
     * Lists all privileges that have been granted on an object or on an account.
     */
    grantsOn?: pulumi.Input<inputs.GetGrantsGrantsOnArgs>;
    /**
     * Lists all privileges granted to the object.
     */
    grantsTo?: pulumi.Input<inputs.GetGrantsGrantsToArgs>;
}
