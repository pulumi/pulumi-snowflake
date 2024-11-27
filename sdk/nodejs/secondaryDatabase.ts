// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * ## Import
 *
 * ```sh
 * $ pulumi import snowflake:index/secondaryDatabase:SecondaryDatabase example 'secondary_database_name'
 * ```
 */
export class SecondaryDatabase extends pulumi.CustomResource {
    /**
     * Get an existing SecondaryDatabase resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SecondaryDatabaseState, opts?: pulumi.CustomResourceOptions): SecondaryDatabase {
        return new SecondaryDatabase(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'snowflake:index/secondaryDatabase:SecondaryDatabase';

    /**
     * Returns true if the given object is an instance of SecondaryDatabase.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SecondaryDatabase {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SecondaryDatabase.__pulumiType;
    }

    /**
     * A fully qualified path to a database to create a replica from. A fully qualified path follows the format of `"<organization_name>"."<account_name>"."<database_name>"`.
     */
    public readonly asReplicaOf!: pulumi.Output<string>;
    /**
     * The database parameter that specifies the default catalog to use for Iceberg tables. For more information, see [CATALOG](https://docs.snowflake.com/en/sql-reference/parameters#catalog).
     */
    public readonly catalog!: pulumi.Output<string>;
    /**
     * Specifies a comment for the database.
     */
    public readonly comment!: pulumi.Output<string | undefined>;
    /**
     * Specifies the number of days for which Time Travel actions (CLONE and UNDROP) can be performed on the database, as well as specifying the default Time Travel retention time for all schemas created in the database. For more details, see [Understanding & Using Time Travel](https://docs.snowflake.com/en/user-guide/data-time-travel).
     */
    public readonly dataRetentionTimeInDays!: pulumi.Output<number>;
    /**
     * Specifies a default collation specification for all schemas and tables added to the database. It can be overridden on schema or table level. For more information, see [collation specification](https://docs.snowflake.com/en/sql-reference/collation#label-collation-specification).
     */
    public readonly defaultDdlCollation!: pulumi.Output<string>;
    /**
     * If true, enables stdout/stderr fast path logging for anonymous stored procedures.
     */
    public readonly enableConsoleOutput!: pulumi.Output<boolean>;
    /**
     * The database parameter that specifies the default external volume to use for Iceberg tables. For more information, see [EXTERNAL_VOLUME](https://docs.snowflake.com/en/sql-reference/parameters#external-volume).
     */
    public readonly externalVolume!: pulumi.Output<string>;
    /**
     * Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
     */
    public /*out*/ readonly fullyQualifiedName!: pulumi.Output<string>;
    /**
     * Specifies the database as transient. Transient databases do not have a Fail-safe period so they do not incur additional storage costs once they leave Time Travel; however, this means they are also not protected by Fail-safe in the event of a data loss.
     */
    public readonly isTransient!: pulumi.Output<boolean | undefined>;
    /**
     * Specifies the severity level of messages that should be ingested and made available in the active event table. Valid options are: [TRACE DEBUG INFO WARN ERROR FATAL OFF]. Messages at the specified level (and at more severe levels) are ingested. For more information, see [LOG_LEVEL](https://docs.snowflake.com/en/sql-reference/parameters.html#label-log-level).
     */
    public readonly logLevel!: pulumi.Output<string>;
    /**
     * Object parameter that specifies the maximum number of days for which Snowflake can extend the data retention period for tables in the database to prevent streams on the tables from becoming stale. For a detailed description of this parameter, see [MAX*DATA*EXTENSION*TIME*IN_DAYS](https://docs.snowflake.com/en/sql-reference/parameters.html#label-max-data-extension-time-in-days).
     */
    public readonly maxDataExtensionTimeInDays!: pulumi.Output<number>;
    /**
     * Specifies the identifier for the database; must be unique for your account. As a best practice for [Database Replication and Failover](https://docs.snowflake.com/en/user-guide/db-replication-intro), it is recommended to give each secondary database the same name as its primary database. This practice supports referencing fully-qualified objects (i.e. '\n\n.\n\n.\n\n') by other objects in the same database, such as querying a fully-qualified table name in a view. If a secondary database has a different name from the primary database, then these object references would break in the secondary database. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * If true, the case of quoted identifiers is ignored. For more information, see [QUOTED*IDENTIFIERS*IGNORE_CASE](https://docs.snowflake.com/en/sql-reference/parameters#quoted-identifiers-ignore-case).
     */
    public readonly quotedIdentifiersIgnoreCase!: pulumi.Output<boolean>;
    /**
     * Specifies whether to replace invalid UTF-8 characters with the Unicode replacement character (�) in query results for an Iceberg table. You can only set this parameter for tables that use an external Iceberg catalog. For more information, see [REPLACE*INVALID*CHARACTERS](https://docs.snowflake.com/en/sql-reference/parameters#replace-invalid-characters).
     */
    public readonly replaceInvalidCharacters!: pulumi.Output<boolean>;
    /**
     * The storage serialization policy for Iceberg tables that use Snowflake as the catalog. Valid options are: [COMPATIBLE OPTIMIZED]. COMPATIBLE: Snowflake performs encoding and compression of data files that ensures interoperability with third-party compute engines. OPTIMIZED: Snowflake performs encoding and compression of data files that ensures the best table performance within Snowflake. For more information, see [STORAGE*SERIALIZATION*POLICY](https://docs.snowflake.com/en/sql-reference/parameters#storage-serialization-policy).
     */
    public readonly storageSerializationPolicy!: pulumi.Output<string>;
    /**
     * How many times a task must fail in a row before it is automatically suspended. 0 disables auto-suspending. For more information, see [SUSPEND*TASK*AFTER*NUM*FAILURES](https://docs.snowflake.com/en/sql-reference/parameters#suspend-task-after-num-failures).
     */
    public readonly suspendTaskAfterNumFailures!: pulumi.Output<number>;
    /**
     * Maximum automatic retries allowed for a user task. For more information, see [TASK*AUTO*RETRY_ATTEMPTS](https://docs.snowflake.com/en/sql-reference/parameters#task-auto-retry-attempts).
     */
    public readonly taskAutoRetryAttempts!: pulumi.Output<number>;
    /**
     * Controls how trace events are ingested into the event table. Valid options are: [ALWAYS ON*EVENT OFF]. For information about levels, see [TRACE*LEVEL](https://docs.snowflake.com/en/sql-reference/parameters.html#label-trace-level).
     */
    public readonly traceLevel!: pulumi.Output<string>;
    /**
     * The initial size of warehouse to use for managed warehouses in the absence of history. For more information, see [USER*TASK*MANAGED*INITIAL*WAREHOUSE_SIZE](https://docs.snowflake.com/en/sql-reference/parameters#user-task-managed-initial-warehouse-size).
     */
    public readonly userTaskManagedInitialWarehouseSize!: pulumi.Output<string>;
    /**
     * Minimum amount of time between Triggered Task executions in seconds.
     */
    public readonly userTaskMinimumTriggerIntervalInSeconds!: pulumi.Output<number>;
    /**
     * User task execution timeout in milliseconds. For more information, see [USER*TASK*TIMEOUT_MS](https://docs.snowflake.com/en/sql-reference/parameters#user-task-timeout-ms).
     */
    public readonly userTaskTimeoutMs!: pulumi.Output<number>;

    /**
     * Create a SecondaryDatabase resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SecondaryDatabaseArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SecondaryDatabaseArgs | SecondaryDatabaseState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SecondaryDatabaseState | undefined;
            resourceInputs["asReplicaOf"] = state ? state.asReplicaOf : undefined;
            resourceInputs["catalog"] = state ? state.catalog : undefined;
            resourceInputs["comment"] = state ? state.comment : undefined;
            resourceInputs["dataRetentionTimeInDays"] = state ? state.dataRetentionTimeInDays : undefined;
            resourceInputs["defaultDdlCollation"] = state ? state.defaultDdlCollation : undefined;
            resourceInputs["enableConsoleOutput"] = state ? state.enableConsoleOutput : undefined;
            resourceInputs["externalVolume"] = state ? state.externalVolume : undefined;
            resourceInputs["fullyQualifiedName"] = state ? state.fullyQualifiedName : undefined;
            resourceInputs["isTransient"] = state ? state.isTransient : undefined;
            resourceInputs["logLevel"] = state ? state.logLevel : undefined;
            resourceInputs["maxDataExtensionTimeInDays"] = state ? state.maxDataExtensionTimeInDays : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["quotedIdentifiersIgnoreCase"] = state ? state.quotedIdentifiersIgnoreCase : undefined;
            resourceInputs["replaceInvalidCharacters"] = state ? state.replaceInvalidCharacters : undefined;
            resourceInputs["storageSerializationPolicy"] = state ? state.storageSerializationPolicy : undefined;
            resourceInputs["suspendTaskAfterNumFailures"] = state ? state.suspendTaskAfterNumFailures : undefined;
            resourceInputs["taskAutoRetryAttempts"] = state ? state.taskAutoRetryAttempts : undefined;
            resourceInputs["traceLevel"] = state ? state.traceLevel : undefined;
            resourceInputs["userTaskManagedInitialWarehouseSize"] = state ? state.userTaskManagedInitialWarehouseSize : undefined;
            resourceInputs["userTaskMinimumTriggerIntervalInSeconds"] = state ? state.userTaskMinimumTriggerIntervalInSeconds : undefined;
            resourceInputs["userTaskTimeoutMs"] = state ? state.userTaskTimeoutMs : undefined;
        } else {
            const args = argsOrState as SecondaryDatabaseArgs | undefined;
            if ((!args || args.asReplicaOf === undefined) && !opts.urn) {
                throw new Error("Missing required property 'asReplicaOf'");
            }
            resourceInputs["asReplicaOf"] = args ? args.asReplicaOf : undefined;
            resourceInputs["catalog"] = args ? args.catalog : undefined;
            resourceInputs["comment"] = args ? args.comment : undefined;
            resourceInputs["dataRetentionTimeInDays"] = args ? args.dataRetentionTimeInDays : undefined;
            resourceInputs["defaultDdlCollation"] = args ? args.defaultDdlCollation : undefined;
            resourceInputs["enableConsoleOutput"] = args ? args.enableConsoleOutput : undefined;
            resourceInputs["externalVolume"] = args ? args.externalVolume : undefined;
            resourceInputs["isTransient"] = args ? args.isTransient : undefined;
            resourceInputs["logLevel"] = args ? args.logLevel : undefined;
            resourceInputs["maxDataExtensionTimeInDays"] = args ? args.maxDataExtensionTimeInDays : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["quotedIdentifiersIgnoreCase"] = args ? args.quotedIdentifiersIgnoreCase : undefined;
            resourceInputs["replaceInvalidCharacters"] = args ? args.replaceInvalidCharacters : undefined;
            resourceInputs["storageSerializationPolicy"] = args ? args.storageSerializationPolicy : undefined;
            resourceInputs["suspendTaskAfterNumFailures"] = args ? args.suspendTaskAfterNumFailures : undefined;
            resourceInputs["taskAutoRetryAttempts"] = args ? args.taskAutoRetryAttempts : undefined;
            resourceInputs["traceLevel"] = args ? args.traceLevel : undefined;
            resourceInputs["userTaskManagedInitialWarehouseSize"] = args ? args.userTaskManagedInitialWarehouseSize : undefined;
            resourceInputs["userTaskMinimumTriggerIntervalInSeconds"] = args ? args.userTaskMinimumTriggerIntervalInSeconds : undefined;
            resourceInputs["userTaskTimeoutMs"] = args ? args.userTaskTimeoutMs : undefined;
            resourceInputs["fullyQualifiedName"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(SecondaryDatabase.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SecondaryDatabase resources.
 */
export interface SecondaryDatabaseState {
    /**
     * A fully qualified path to a database to create a replica from. A fully qualified path follows the format of `"<organization_name>"."<account_name>"."<database_name>"`.
     */
    asReplicaOf?: pulumi.Input<string>;
    /**
     * The database parameter that specifies the default catalog to use for Iceberg tables. For more information, see [CATALOG](https://docs.snowflake.com/en/sql-reference/parameters#catalog).
     */
    catalog?: pulumi.Input<string>;
    /**
     * Specifies a comment for the database.
     */
    comment?: pulumi.Input<string>;
    /**
     * Specifies the number of days for which Time Travel actions (CLONE and UNDROP) can be performed on the database, as well as specifying the default Time Travel retention time for all schemas created in the database. For more details, see [Understanding & Using Time Travel](https://docs.snowflake.com/en/user-guide/data-time-travel).
     */
    dataRetentionTimeInDays?: pulumi.Input<number>;
    /**
     * Specifies a default collation specification for all schemas and tables added to the database. It can be overridden on schema or table level. For more information, see [collation specification](https://docs.snowflake.com/en/sql-reference/collation#label-collation-specification).
     */
    defaultDdlCollation?: pulumi.Input<string>;
    /**
     * If true, enables stdout/stderr fast path logging for anonymous stored procedures.
     */
    enableConsoleOutput?: pulumi.Input<boolean>;
    /**
     * The database parameter that specifies the default external volume to use for Iceberg tables. For more information, see [EXTERNAL_VOLUME](https://docs.snowflake.com/en/sql-reference/parameters#external-volume).
     */
    externalVolume?: pulumi.Input<string>;
    /**
     * Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
     */
    fullyQualifiedName?: pulumi.Input<string>;
    /**
     * Specifies the database as transient. Transient databases do not have a Fail-safe period so they do not incur additional storage costs once they leave Time Travel; however, this means they are also not protected by Fail-safe in the event of a data loss.
     */
    isTransient?: pulumi.Input<boolean>;
    /**
     * Specifies the severity level of messages that should be ingested and made available in the active event table. Valid options are: [TRACE DEBUG INFO WARN ERROR FATAL OFF]. Messages at the specified level (and at more severe levels) are ingested. For more information, see [LOG_LEVEL](https://docs.snowflake.com/en/sql-reference/parameters.html#label-log-level).
     */
    logLevel?: pulumi.Input<string>;
    /**
     * Object parameter that specifies the maximum number of days for which Snowflake can extend the data retention period for tables in the database to prevent streams on the tables from becoming stale. For a detailed description of this parameter, see [MAX*DATA*EXTENSION*TIME*IN_DAYS](https://docs.snowflake.com/en/sql-reference/parameters.html#label-max-data-extension-time-in-days).
     */
    maxDataExtensionTimeInDays?: pulumi.Input<number>;
    /**
     * Specifies the identifier for the database; must be unique for your account. As a best practice for [Database Replication and Failover](https://docs.snowflake.com/en/user-guide/db-replication-intro), it is recommended to give each secondary database the same name as its primary database. This practice supports referencing fully-qualified objects (i.e. '\n\n.\n\n.\n\n') by other objects in the same database, such as querying a fully-qualified table name in a view. If a secondary database has a different name from the primary database, then these object references would break in the secondary database. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
     */
    name?: pulumi.Input<string>;
    /**
     * If true, the case of quoted identifiers is ignored. For more information, see [QUOTED*IDENTIFIERS*IGNORE_CASE](https://docs.snowflake.com/en/sql-reference/parameters#quoted-identifiers-ignore-case).
     */
    quotedIdentifiersIgnoreCase?: pulumi.Input<boolean>;
    /**
     * Specifies whether to replace invalid UTF-8 characters with the Unicode replacement character (�) in query results for an Iceberg table. You can only set this parameter for tables that use an external Iceberg catalog. For more information, see [REPLACE*INVALID*CHARACTERS](https://docs.snowflake.com/en/sql-reference/parameters#replace-invalid-characters).
     */
    replaceInvalidCharacters?: pulumi.Input<boolean>;
    /**
     * The storage serialization policy for Iceberg tables that use Snowflake as the catalog. Valid options are: [COMPATIBLE OPTIMIZED]. COMPATIBLE: Snowflake performs encoding and compression of data files that ensures interoperability with third-party compute engines. OPTIMIZED: Snowflake performs encoding and compression of data files that ensures the best table performance within Snowflake. For more information, see [STORAGE*SERIALIZATION*POLICY](https://docs.snowflake.com/en/sql-reference/parameters#storage-serialization-policy).
     */
    storageSerializationPolicy?: pulumi.Input<string>;
    /**
     * How many times a task must fail in a row before it is automatically suspended. 0 disables auto-suspending. For more information, see [SUSPEND*TASK*AFTER*NUM*FAILURES](https://docs.snowflake.com/en/sql-reference/parameters#suspend-task-after-num-failures).
     */
    suspendTaskAfterNumFailures?: pulumi.Input<number>;
    /**
     * Maximum automatic retries allowed for a user task. For more information, see [TASK*AUTO*RETRY_ATTEMPTS](https://docs.snowflake.com/en/sql-reference/parameters#task-auto-retry-attempts).
     */
    taskAutoRetryAttempts?: pulumi.Input<number>;
    /**
     * Controls how trace events are ingested into the event table. Valid options are: [ALWAYS ON*EVENT OFF]. For information about levels, see [TRACE*LEVEL](https://docs.snowflake.com/en/sql-reference/parameters.html#label-trace-level).
     */
    traceLevel?: pulumi.Input<string>;
    /**
     * The initial size of warehouse to use for managed warehouses in the absence of history. For more information, see [USER*TASK*MANAGED*INITIAL*WAREHOUSE_SIZE](https://docs.snowflake.com/en/sql-reference/parameters#user-task-managed-initial-warehouse-size).
     */
    userTaskManagedInitialWarehouseSize?: pulumi.Input<string>;
    /**
     * Minimum amount of time between Triggered Task executions in seconds.
     */
    userTaskMinimumTriggerIntervalInSeconds?: pulumi.Input<number>;
    /**
     * User task execution timeout in milliseconds. For more information, see [USER*TASK*TIMEOUT_MS](https://docs.snowflake.com/en/sql-reference/parameters#user-task-timeout-ms).
     */
    userTaskTimeoutMs?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a SecondaryDatabase resource.
 */
export interface SecondaryDatabaseArgs {
    /**
     * A fully qualified path to a database to create a replica from. A fully qualified path follows the format of `"<organization_name>"."<account_name>"."<database_name>"`.
     */
    asReplicaOf: pulumi.Input<string>;
    /**
     * The database parameter that specifies the default catalog to use for Iceberg tables. For more information, see [CATALOG](https://docs.snowflake.com/en/sql-reference/parameters#catalog).
     */
    catalog?: pulumi.Input<string>;
    /**
     * Specifies a comment for the database.
     */
    comment?: pulumi.Input<string>;
    /**
     * Specifies the number of days for which Time Travel actions (CLONE and UNDROP) can be performed on the database, as well as specifying the default Time Travel retention time for all schemas created in the database. For more details, see [Understanding & Using Time Travel](https://docs.snowflake.com/en/user-guide/data-time-travel).
     */
    dataRetentionTimeInDays?: pulumi.Input<number>;
    /**
     * Specifies a default collation specification for all schemas and tables added to the database. It can be overridden on schema or table level. For more information, see [collation specification](https://docs.snowflake.com/en/sql-reference/collation#label-collation-specification).
     */
    defaultDdlCollation?: pulumi.Input<string>;
    /**
     * If true, enables stdout/stderr fast path logging for anonymous stored procedures.
     */
    enableConsoleOutput?: pulumi.Input<boolean>;
    /**
     * The database parameter that specifies the default external volume to use for Iceberg tables. For more information, see [EXTERNAL_VOLUME](https://docs.snowflake.com/en/sql-reference/parameters#external-volume).
     */
    externalVolume?: pulumi.Input<string>;
    /**
     * Specifies the database as transient. Transient databases do not have a Fail-safe period so they do not incur additional storage costs once they leave Time Travel; however, this means they are also not protected by Fail-safe in the event of a data loss.
     */
    isTransient?: pulumi.Input<boolean>;
    /**
     * Specifies the severity level of messages that should be ingested and made available in the active event table. Valid options are: [TRACE DEBUG INFO WARN ERROR FATAL OFF]. Messages at the specified level (and at more severe levels) are ingested. For more information, see [LOG_LEVEL](https://docs.snowflake.com/en/sql-reference/parameters.html#label-log-level).
     */
    logLevel?: pulumi.Input<string>;
    /**
     * Object parameter that specifies the maximum number of days for which Snowflake can extend the data retention period for tables in the database to prevent streams on the tables from becoming stale. For a detailed description of this parameter, see [MAX*DATA*EXTENSION*TIME*IN_DAYS](https://docs.snowflake.com/en/sql-reference/parameters.html#label-max-data-extension-time-in-days).
     */
    maxDataExtensionTimeInDays?: pulumi.Input<number>;
    /**
     * Specifies the identifier for the database; must be unique for your account. As a best practice for [Database Replication and Failover](https://docs.snowflake.com/en/user-guide/db-replication-intro), it is recommended to give each secondary database the same name as its primary database. This practice supports referencing fully-qualified objects (i.e. '\n\n.\n\n.\n\n') by other objects in the same database, such as querying a fully-qualified table name in a view. If a secondary database has a different name from the primary database, then these object references would break in the secondary database. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
     */
    name?: pulumi.Input<string>;
    /**
     * If true, the case of quoted identifiers is ignored. For more information, see [QUOTED*IDENTIFIERS*IGNORE_CASE](https://docs.snowflake.com/en/sql-reference/parameters#quoted-identifiers-ignore-case).
     */
    quotedIdentifiersIgnoreCase?: pulumi.Input<boolean>;
    /**
     * Specifies whether to replace invalid UTF-8 characters with the Unicode replacement character (�) in query results for an Iceberg table. You can only set this parameter for tables that use an external Iceberg catalog. For more information, see [REPLACE*INVALID*CHARACTERS](https://docs.snowflake.com/en/sql-reference/parameters#replace-invalid-characters).
     */
    replaceInvalidCharacters?: pulumi.Input<boolean>;
    /**
     * The storage serialization policy for Iceberg tables that use Snowflake as the catalog. Valid options are: [COMPATIBLE OPTIMIZED]. COMPATIBLE: Snowflake performs encoding and compression of data files that ensures interoperability with third-party compute engines. OPTIMIZED: Snowflake performs encoding and compression of data files that ensures the best table performance within Snowflake. For more information, see [STORAGE*SERIALIZATION*POLICY](https://docs.snowflake.com/en/sql-reference/parameters#storage-serialization-policy).
     */
    storageSerializationPolicy?: pulumi.Input<string>;
    /**
     * How many times a task must fail in a row before it is automatically suspended. 0 disables auto-suspending. For more information, see [SUSPEND*TASK*AFTER*NUM*FAILURES](https://docs.snowflake.com/en/sql-reference/parameters#suspend-task-after-num-failures).
     */
    suspendTaskAfterNumFailures?: pulumi.Input<number>;
    /**
     * Maximum automatic retries allowed for a user task. For more information, see [TASK*AUTO*RETRY_ATTEMPTS](https://docs.snowflake.com/en/sql-reference/parameters#task-auto-retry-attempts).
     */
    taskAutoRetryAttempts?: pulumi.Input<number>;
    /**
     * Controls how trace events are ingested into the event table. Valid options are: [ALWAYS ON*EVENT OFF]. For information about levels, see [TRACE*LEVEL](https://docs.snowflake.com/en/sql-reference/parameters.html#label-trace-level).
     */
    traceLevel?: pulumi.Input<string>;
    /**
     * The initial size of warehouse to use for managed warehouses in the absence of history. For more information, see [USER*TASK*MANAGED*INITIAL*WAREHOUSE_SIZE](https://docs.snowflake.com/en/sql-reference/parameters#user-task-managed-initial-warehouse-size).
     */
    userTaskManagedInitialWarehouseSize?: pulumi.Input<string>;
    /**
     * Minimum amount of time between Triggered Task executions in seconds.
     */
    userTaskMinimumTriggerIntervalInSeconds?: pulumi.Input<number>;
    /**
     * User task execution timeout in milliseconds. For more information, see [USER*TASK*TIMEOUT_MS](https://docs.snowflake.com/en/sql-reference/parameters#user-task-timeout-ms).
     */
    userTaskTimeoutMs?: pulumi.Input<number>;
}
