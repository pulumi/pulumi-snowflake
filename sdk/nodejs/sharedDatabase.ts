// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * ## Import
 *
 * ```sh
 * $ pulumi import snowflake:index/sharedDatabase:SharedDatabase example 'shared_database_name'
 * ```
 */
export class SharedDatabase extends pulumi.CustomResource {
    /**
     * Get an existing SharedDatabase resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SharedDatabaseState, opts?: pulumi.CustomResourceOptions): SharedDatabase {
        return new SharedDatabase(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'snowflake:index/sharedDatabase:SharedDatabase';

    /**
     * Returns true if the given object is an instance of SharedDatabase.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SharedDatabase {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SharedDatabase.__pulumiType;
    }

    /**
     * The database parameter that specifies the default catalog to use for Iceberg tables. For more information, see [CATALOG](https://docs.snowflake.com/en/sql-reference/parameters#catalog).
     */
    public readonly catalog!: pulumi.Output<string>;
    /**
     * Specifies a comment for the database.
     */
    public readonly comment!: pulumi.Output<string | undefined>;
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
     * A fully qualified path to a share from which the database will be created. A fully qualified path follows the format of `"<organization_name>"."<account_name>"."<share_name>"`.
     */
    public readonly fromShare!: pulumi.Output<string>;
    /**
     * Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
     */
    public /*out*/ readonly fullyQualifiedName!: pulumi.Output<string>;
    /**
     * Specifies the severity level of messages that should be ingested and made available in the active event table. Valid options are: [TRACE DEBUG INFO WARN ERROR FATAL OFF]. Messages at the specified level (and at more severe levels) are ingested. For more information, see [LOG_LEVEL](https://docs.snowflake.com/en/sql-reference/parameters.html#label-log-level).
     */
    public readonly logLevel!: pulumi.Output<string>;
    /**
     * Specifies the identifier for the database; must be unique for your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `(`, `)`, `"`
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
     * Create a SharedDatabase resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SharedDatabaseArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SharedDatabaseArgs | SharedDatabaseState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SharedDatabaseState | undefined;
            resourceInputs["catalog"] = state ? state.catalog : undefined;
            resourceInputs["comment"] = state ? state.comment : undefined;
            resourceInputs["defaultDdlCollation"] = state ? state.defaultDdlCollation : undefined;
            resourceInputs["enableConsoleOutput"] = state ? state.enableConsoleOutput : undefined;
            resourceInputs["externalVolume"] = state ? state.externalVolume : undefined;
            resourceInputs["fromShare"] = state ? state.fromShare : undefined;
            resourceInputs["fullyQualifiedName"] = state ? state.fullyQualifiedName : undefined;
            resourceInputs["logLevel"] = state ? state.logLevel : undefined;
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
            const args = argsOrState as SharedDatabaseArgs | undefined;
            if ((!args || args.fromShare === undefined) && !opts.urn) {
                throw new Error("Missing required property 'fromShare'");
            }
            resourceInputs["catalog"] = args ? args.catalog : undefined;
            resourceInputs["comment"] = args ? args.comment : undefined;
            resourceInputs["defaultDdlCollation"] = args ? args.defaultDdlCollation : undefined;
            resourceInputs["enableConsoleOutput"] = args ? args.enableConsoleOutput : undefined;
            resourceInputs["externalVolume"] = args ? args.externalVolume : undefined;
            resourceInputs["fromShare"] = args ? args.fromShare : undefined;
            resourceInputs["logLevel"] = args ? args.logLevel : undefined;
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
        super(SharedDatabase.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SharedDatabase resources.
 */
export interface SharedDatabaseState {
    /**
     * The database parameter that specifies the default catalog to use for Iceberg tables. For more information, see [CATALOG](https://docs.snowflake.com/en/sql-reference/parameters#catalog).
     */
    catalog?: pulumi.Input<string>;
    /**
     * Specifies a comment for the database.
     */
    comment?: pulumi.Input<string>;
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
     * A fully qualified path to a share from which the database will be created. A fully qualified path follows the format of `"<organization_name>"."<account_name>"."<share_name>"`.
     */
    fromShare?: pulumi.Input<string>;
    /**
     * Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
     */
    fullyQualifiedName?: pulumi.Input<string>;
    /**
     * Specifies the severity level of messages that should be ingested and made available in the active event table. Valid options are: [TRACE DEBUG INFO WARN ERROR FATAL OFF]. Messages at the specified level (and at more severe levels) are ingested. For more information, see [LOG_LEVEL](https://docs.snowflake.com/en/sql-reference/parameters.html#label-log-level).
     */
    logLevel?: pulumi.Input<string>;
    /**
     * Specifies the identifier for the database; must be unique for your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `(`, `)`, `"`
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
 * The set of arguments for constructing a SharedDatabase resource.
 */
export interface SharedDatabaseArgs {
    /**
     * The database parameter that specifies the default catalog to use for Iceberg tables. For more information, see [CATALOG](https://docs.snowflake.com/en/sql-reference/parameters#catalog).
     */
    catalog?: pulumi.Input<string>;
    /**
     * Specifies a comment for the database.
     */
    comment?: pulumi.Input<string>;
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
     * A fully qualified path to a share from which the database will be created. A fully qualified path follows the format of `"<organization_name>"."<account_name>"."<share_name>"`.
     */
    fromShare: pulumi.Input<string>;
    /**
     * Specifies the severity level of messages that should be ingested and made available in the active event table. Valid options are: [TRACE DEBUG INFO WARN ERROR FATAL OFF]. Messages at the specified level (and at more severe levels) are ingested. For more information, see [LOG_LEVEL](https://docs.snowflake.com/en/sql-reference/parameters.html#label-log-level).
     */
    logLevel?: pulumi.Input<string>;
    /**
     * Specifies the identifier for the database; must be unique for your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `(`, `)`, `"`
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
