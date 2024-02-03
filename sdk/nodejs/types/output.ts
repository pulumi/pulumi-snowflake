// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";

export interface AlertAlertSchedule {
    /**
     * Specifies the cron expression for the alert. The cron expression must be in the following format: "minute hour day-of-month month day-of-week". The following values are supported: minute: 0-59 hour: 0-23 day-of-month: 1-31 month: 1-12 day-of-week: 0-6 (0 is Sunday)
     */
    cron?: outputs.AlertAlertScheduleCron;
    /**
     * Specifies the interval in minutes for the alert schedule. The interval must be greater than 0 and less than 1440 (24 hours).
     */
    interval?: number;
}

export interface AlertAlertScheduleCron {
    /**
     * Specifies the cron expression for the alert. The cron expression must be in the following format: "minute hour day-of-month month day-of-week". The following values are supported: minute: 0-59 hour: 0-23 day-of-month: 1-31 month: 1-12 day-of-week: 0-6 (0 is Sunday)
     */
    expression: string;
    /**
     * Specifies the time zone for alert refresh.
     */
    timeZone: string;
}

export interface DatabaseReplicationConfiguration {
    accounts: string[];
    ignoreEditionCheck?: boolean;
}

export interface DynamicTableTargetLag {
    /**
     * Specifies whether the target lag time is downstream.
     */
    downstream?: boolean;
    /**
     * Specifies the maximum target lag time for the dynamic table.
     */
    maximumDuration?: string;
}

export interface ExternalFunctionArg {
    /**
     * Argument name
     */
    name: string;
    /**
     * Argument type, e.g. VARCHAR
     */
    type: string;
}

export interface ExternalFunctionHeader {
    /**
     * Header name
     */
    name: string;
    /**
     * Header value
     */
    value: string;
}

export interface ExternalTableColumn {
    /**
     * String that specifies the expression for the column. When queried, the column returns results derived from this expression.
     */
    as: string;
    /**
     * Column name
     */
    name: string;
    /**
     * Column type, e.g. VARIANT
     */
    type: string;
}

export interface ExternalTableTag {
    /**
     * Name of the database that the tag was created in.
     */
    database?: string;
    /**
     * Tag name, e.g. department.
     */
    name: string;
    /**
     * Name of the schema that the tag was created in.
     */
    schema?: string;
    /**
     * Tag value, e.g. marketing_info.
     */
    value: string;
}

export interface FailoverGroupFromReplica {
    /**
     * Identifier for the primary failover group in the source account.
     */
    name: string;
    /**
     * Name of your Snowflake organization.
     */
    organizationName: string;
    /**
     * Source account from which you are enabling replication and failover of the specified objects.
     */
    sourceAccountName: string;
}

export interface FailoverGroupReplicationSchedule {
    /**
     * Specifies the cron expression for the replication schedule. The cron expression must be in the following format: "minute hour day-of-month month day-of-week". The following values are supported: minute: 0-59 hour: 0-23 day-of-month: 1-31 month: 1-12 day-of-week: 0-6 (0 is Sunday)
     */
    cron?: outputs.FailoverGroupReplicationScheduleCron;
    /**
     * Specifies the interval in minutes for the replication schedule. The interval must be greater than 0 and less than 1440 (24 hours).
     */
    interval?: number;
}

export interface FailoverGroupReplicationScheduleCron {
    /**
     * Specifies the cron expression for the replication schedule. The cron expression must be in the following format: "minute hour day-of-month month day-of-week". The following values are supported: minute: 0-59 hour: 0-23 day-of-month: 1-31 month: 1-12 day-of-week: 0-6 (0 is Sunday)
     */
    expression: string;
    /**
     * Specifies the time zone for secondary group refresh.
     */
    timeZone: string;
}

export interface FunctionArgument {
    /**
     * The argument name
     */
    name: string;
    /**
     * The argument type
     */
    type: string;
}

export interface GetAccountsAccount {
    /**
     * System-assigned identifier of the acccount.
     */
    accountLocator: string;
    /**
     * Legacy Snowflake access URL syntax that includes the regionName and account_locator.
     */
    accountLocatorUrl: string;
    /**
     * User-defined name that identifies an account within the organization.
     */
    accountName: string;
    /**
     * Preferred Snowflake access URL that includes the values of organizationName and account_name.
     */
    accountUrl: string;
    /**
     * Comment for the account.
     */
    comment: string;
    /**
     * Name of the consumption billing entity.
     */
    consumptionBillingEntityName: string;
    /**
     * Date and time when the account was created.
     */
    createdOn: string;
    /**
     * Snowflake Edition of the account.
     */
    edition: string;
    /**
     * Indicates whether the ORGADMIN role is enabled in an account. If TRUE, the role is enabled.
     */
    isOrgAdmin: boolean;
    /**
     * Indicates how many managed accounts have been created by the account.
     */
    managedAccounts: number;
    /**
     * Name of the marketplace consumer billing entity.
     */
    marketplaceConsumerBillingEntityName: string;
    /**
     * Name of the marketplace provider billing entity.
     */
    marketplaceProviderBillingEntityName: string;
    /**
     * The previous account URL for a given account.
     */
    oldAccountUrl: string;
    /**
     * Name of the organization.
     */
    organizationName: string;
    /**
     * Region group where the account is located. Note: this column is only visible to organizations that span multiple Region Groups.
     */
    regionGroup: string;
    /**
     * Snowflake Region where the account is located. A Snowflake Region is a distinct location within a cloud platform region that is isolated from other Snowflake Regions. A Snowflake Region can be either multi-tenant or single-tenant (for a Virtual Private Snowflake account).
     */
    snowflakeRegion: string;
}

export interface GetAlertsAlert {
    /**
     * The text of the SQL statement that should be executed when the alert is triggered.
     */
    action: string;
    /**
     * Comment for the alert.
     */
    comment: string;
    /**
     * The text of the SQL statement that serves as the condition when the alert should be triggered.
     */
    condition: string;
    /**
     * Database in which the alert is stored.
     */
    databaseName: string;
    /**
     * Name of the alert.
     */
    name: string;
    /**
     * Role that owns the alert (i.e. has the OWNERSHIP privilege on the alert)
     */
    owner: string;
    /**
     * Schema in which the alert is stored.
     */
    schemaName: string;
}

export interface GetDatabaseRolesDatabaseRole {
    /**
     * The comment on the role
     */
    comment: string;
    /**
     * Identifier for the role.
     */
    name: string;
    /**
     * The owner of the role
     */
    owner: string;
}

export interface GetDatabasesDatabase {
    comment: string;
    createdOn: string;
    isCurrent: boolean;
    isDefault: boolean;
    name: string;
    options: string;
    origin: string;
    owner: string;
    replicationConfigurations: outputs.GetDatabasesDatabaseReplicationConfiguration[];
    retentionTime: number;
}

export interface GetDatabasesDatabaseReplicationConfiguration {
    accounts: string[];
    ignoreEditionCheck: boolean;
}

export interface GetDynamicTablesIn {
    /**
     * Returns records for the entire account.
     */
    account?: boolean;
    /**
     * Returns records for the current database in use or for a specified database (db_name).
     */
    database?: string;
    /**
     * Returns records for the current schema in use or a specified schema (schema_name).
     */
    schema?: string;
}

export interface GetDynamicTablesLike {
    /**
     * Filters the command output by object name. The filter uses case-insensitive pattern matching with support for SQL wildcard characters (% and _).
     */
    pattern: string;
}

export interface GetDynamicTablesLimit {
    /**
     * The optional FROM 'name_string' subclause effectively serves as a “cursor” for the results. This enables fetching the specified number of rows following the first row whose object name matches the specified string
     */
    from?: string;
    /**
     * Specifies the maximum number of rows to return.
     */
    rows?: number;
}

export interface GetDynamicTablesRecord {
    /**
     * Whether auto-clustering is enabled on the dynamic table. Not currently supported for dynamic tables.
     */
    automaticClustering: boolean;
    /**
     * Number of bytes that will be scanned if the entire dynamic table is scanned in a query.
     */
    bytes: number;
    /**
     * The clustering key for the dynamic table.
     */
    clusterBy: string;
    /**
     * Comment for the dynamic table.
     */
    comment: string;
    /**
     * Date and time when the dynamic table was created.
     */
    createdOn: string;
    /**
     * Timestamp of the data in the base object(s) that is included in the dynamic table.
     */
    dataTimestamp: string;
    /**
     * Database in which the dynamic table is stored.
     */
    databaseName: string;
    /**
     * TRUE if the dynamic table has been cloned, else FALSE.
     */
    isClone: boolean;
    /**
     * TRUE if the dynamic table is a replica. else FALSE.
     */
    isReplica: boolean;
    /**
     * Timestamp of last suspension.
     */
    lastSuspendedOn: string;
    /**
     * Name of the dynamic table.
     */
    name: string;
    /**
     * Role that owns the dynamic table.
     */
    owner: string;
    /**
     * INCREMENTAL if the dynamic table will use incremental refreshes, or FULL if it will recompute the whole table on every refresh.
     */
    refreshMode: string;
    /**
     * Explanation for why FULL refresh mode was chosen. NULL if refresh mode is not FULL.
     */
    refreshModeReason: string;
    /**
     * Number of rows in the table.
     */
    rows: number;
    /**
     * Displays RUNNING for dynamic tables that are actively scheduling refreshes and SUSPENDED for suspended dynamic tables.
     */
    schedulingState: string;
    /**
     * Schema in which the dynamic table is stored.
     */
    schemaName: string;
    /**
     * The maximum duration that the dynamic table’s content should lag behind real time.
     */
    targetLag: string;
    /**
     * The text of the command that created this dynamic table (e.g. CREATE DYNAMIC TABLE ...).
     */
    text: string;
    /**
     * Warehouse that provides the required resources to perform the incremental refreshes.
     */
    warehouse: string;
}

export interface GetExternalFunctionsExternalFunction {
    comment: string;
    database: string;
    language: string;
    name: string;
    schema: string;
}

export interface GetExternalTablesExternalTable {
    comment: string;
    database: string;
    name: string;
    schema: string;
}

export interface GetFailoverGroupsFailoverGroup {
    /**
     * Account locator in a region.
     */
    accountLocator: string;
    /**
     * Name of the account.
     */
    accountName: string;
    /**
     * List of accounts enabled for replication and failover.
     */
    allowedAccounts: any[];
    /**
     * A list of integration types that are enabled for replication.
     */
    allowedIntegrationTypes: any[];
    /**
     * Comment string.
     */
    comment: string;
    /**
     * Date and time failover group was created.
     */
    createdOn: string;
    /**
     * Indicates whether the failover group is the primary group.
     */
    isPrimary: boolean;
    /**
     * Date and time of the next scheduled refresh.
     */
    nextScheduledRefresh: string;
    /**
     * List of specified object types enabled for replication and failover.
     */
    objectTypes: any[];
    /**
     * Name of your Snowflake organization.
     */
    organizationName: string;
    /**
     * Name of the role with the OWNERSHIP privilege on the failover group. NULL if the failover group is in a different region.
     */
    owner: string;
    /**
     * Name of the primary group.
     */
    primary: string;
    /**
     * Region group where the account is located. Note: this column is only visible to organizations that span multiple Region Groups.
     */
    regionGroup: string;
    /**
     * Scheduled interval for refresh; NULL if no replication schedule is set.
     */
    replicationSchedule: string;
    /**
     * Current state of scheduled refresh. Valid values are started or suspended. NULL if no replication schedule is set.
     */
    secondaryState: string;
    /**
     * Snowflake Region where the account is located. A Snowflake Region is a distinct location within a cloud platform region that is isolated from other Snowflake Regions. A Snowflake Region can be either multi-tenant or single-tenant (for a Virtual Private Snowflake account).
     */
    snowflakeRegion: string;
    /**
     * Type of group. Valid value is FAILOVER.
     */
    type: string;
}

export interface GetFileFormatsFileFormat {
    comment: string;
    database: string;
    formatType: string;
    name: string;
    schema: string;
}

export interface GetFunctionsFunction {
    argumentTypes: string[];
    comment: string;
    database: string;
    name: string;
    returnType: string;
    schema: string;
}

export interface GetGrantsFutureGrantsIn {
    /**
     * Lists all privileges on new (i.e. future) objects of a specified type in the database granted to a role.
     */
    database?: string;
    /**
     * Lists all privileges on new (i.e. future) objects of a specified type in the schema granted to a role.
     */
    schema?: outputs.GetGrantsFutureGrantsInSchema;
}

export interface GetGrantsFutureGrantsInSchema {
    /**
     * The database in which the scehma resides. Optional when querying a schema in the current database.
     */
    databaseName?: string;
    /**
     * The name of the schema to list all privileges of new (ie. future) objects granted to
     */
    schemaName: string;
}

export interface GetGrantsFutureGrantsTo {
    /**
     * Lists all privileges on new (i.e. future) objects of a specified type in a database or schema granted to the role.
     */
    role: string;
}

export interface GetGrantsGrant {
    /**
     * The date and time the grant was created
     */
    createdOn: string;
    /**
     * Whether the grantee can grant the privilege to others
     */
    grantOption: boolean;
    /**
     * The role that granted the privilege
     */
    grantedBy: string;
    /**
     * The object on which the privilege was granted
     */
    grantedOn: string;
    /**
     * The role to which the privilege was granted
     */
    grantedTo: string;
    /**
     * The name of the role to which the privilege was granted
     */
    granteeName: string;
    /**
     * The name of the object on which the privilege was granted
     */
    name: string;
    /**
     * The privilege granted
     */
    privilege: string;
}

export interface GetGrantsGrantsOf {
    /**
     * Lists all users and roles to which the role has been granted
     */
    role?: string;
    /**
     * Lists all the accounts for the share and indicates the accounts that are using the share.
     */
    share?: string;
}

export interface GetGrantsGrantsOn {
    /**
     * Object hierarchy to list privileges on. The only valid value is: ACCOUNT. Setting this attribute lists all the account-level (i.e. global) privileges that have been granted to roles.
     */
    account?: boolean;
    /**
     * Name of object to list privileges on
     */
    objectName?: string;
    /**
     * Type of object to list privileges on.
     */
    objectType?: string;
}

export interface GetGrantsGrantsTo {
    /**
     * Lists all privileges and roles granted to the role
     */
    role?: string;
    /**
     * Lists all the privileges granted to the share
     */
    share?: string;
    /**
     * Lists all the roles granted to the user. Note that the PUBLIC role, which is automatically available to every user, is not listed
     */
    user?: string;
}

export interface GetMaskingPoliciesMaskingPolicy {
    comment: string;
    database: string;
    kind: string;
    name: string;
    schema: string;
}

export interface GetMaterializedViewsMaterializedView {
    comment: string;
    database: string;
    name: string;
    schema: string;
}

export interface GetParametersParameter {
    /**
     * The default value of the parameter
     */
    default: string;
    /**
     * The description of the parameter
     */
    description: string;
    /**
     * The name of the parameter
     */
    key: string;
    /**
     * The level of the parameter
     */
    level: string;
    /**
     * The value of the parameter
     */
    value: string;
}

export interface GetPipesPipe {
    comment: string;
    database: string;
    integration: string;
    name: string;
    schema: string;
}

export interface GetProceduresProcedure {
    argumentTypes: string[];
    comment: string;
    database: string;
    name: string;
    returnType: string;
    schema: string;
}

export interface GetResourceMonitorsResourceMonitor {
    comment: string;
    creditQuota: string;
    frequency: string;
    name: string;
}

export interface GetRolesRole {
    /**
     * The comment on the role
     */
    comment: string;
    /**
     * Identifier for the role.
     */
    name: string;
    /**
     * The owner of the role
     */
    owner: string;
}

export interface GetRowAccessPoliciesRowAccessPolicy {
    comment: string;
    database: string;
    name: string;
    schema: string;
}

export interface GetSchemasSchema {
    comment: string;
    database: string;
    name: string;
}

export interface GetSequencesSequence {
    comment: string;
    database: string;
    name: string;
    schema: string;
}

export interface GetSharesShare {
    /**
     * The comment on the share.
     */
    comment: string;
    /**
     * The kind of the share.
     */
    kind: string;
    /**
     * Identifier for the share.
     */
    name: string;
    /**
     * The owner of the share.
     */
    owner: string;
    /**
     * For the OUTBOUND share, list of consumers.
     */
    tos: any[];
}

export interface GetStagesStage {
    comment: string;
    database: string;
    name: string;
    schema: string;
    storageIntegration: string;
}

export interface GetStorageIntegrationsStorageIntegration {
    comment: string;
    enabled: boolean;
    name: string;
    type: string;
}

export interface GetStreamsStream {
    comment: string;
    database: string;
    name: string;
    schema: string;
    table: string;
}

export interface GetTablesTable {
    comment: string;
    database: string;
    name: string;
    schema: string;
}

export interface GetTasksTask {
    comment: string;
    database: string;
    name: string;
    schema: string;
    warehouse: string;
}

export interface GetUsersUser {
    comment: string;
    defaultNamespace: string;
    defaultRole: string;
    defaultSecondaryRoles: string[];
    defaultWarehouse: string;
    disabled: boolean;
    displayName: string;
    email: string;
    firstName: string;
    hasRsaPublicKey: boolean;
    lastName: string;
    loginName: string;
    name: string;
}

export interface GetViewsView {
    comment: string;
    database: string;
    name: string;
    schema: string;
}

export interface GetWarehousesWarehouse {
    comment: string;
    name: string;
    scalingPolicy: string;
    size: string;
    state: string;
    type: string;
}

export interface GrantPrivilegesToAccountRoleOnAccountObject {
    /**
     * The fully qualified name of the object on which privileges will be granted.
     */
    objectName: string;
    /**
     * The object type of the account object on which privileges will be granted. Valid values are: USER | RESOURCE MONITOR | WAREHOUSE | COMPUTE POOL | DATABASE | INTEGRATION | FAILOVER GROUP | REPLICATION GROUP | EXTERNAL VOLUME
     */
    objectType: string;
}

export interface GrantPrivilegesToAccountRoleOnSchema {
    /**
     * The fully qualified name of the database.
     */
    allSchemasInDatabase?: string;
    /**
     * The fully qualified name of the database.
     */
    futureSchemasInDatabase?: string;
    /**
     * The fully qualified name of the schema.
     */
    schemaName?: string;
}

export interface GrantPrivilegesToAccountRoleOnSchemaObject {
    /**
     * Configures the privilege to be granted on all objects in either a database or schema.
     */
    all?: outputs.GrantPrivilegesToAccountRoleOnSchemaObjectAll;
    /**
     * Configures the privilege to be granted on all objects in either a database or schema.
     */
    future?: outputs.GrantPrivilegesToAccountRoleOnSchemaObjectFuture;
    /**
     * The fully qualified name of the object on which privileges will be granted.
     */
    objectName?: string;
    /**
     * The object type of the schema object on which privileges will be granted. Valid values are: ALERT | DYNAMIC TABLE | EVENT TABLE | FILE FORMAT | FUNCTION | PROCEDURE | SECRET | SEQUENCE | PIPE | MASKING POLICY | PASSWORD POLICY | ROW ACCESS POLICY | SESSION POLICY | TAG | STAGE | STREAM | TABLE | EXTERNAL TABLE | TASK | VIEW | MATERIALIZED VIEW | NETWORK RULE | PACKAGES POLICY | ICEBERG TABLE
     */
    objectType?: string;
}

export interface GrantPrivilegesToAccountRoleOnSchemaObjectAll {
    inDatabase?: string;
    inSchema?: string;
    /**
     * The plural object type of the schema object on which privileges will be granted. Valid values are: ALERTS | DYNAMIC TABLES | EVENT TABLES | FILE FORMATS | FUNCTIONS | PROCEDURES | SECRETS | SEQUENCES | PIPES | MASKING POLICIES | PASSWORD POLICIES | ROW ACCESS POLICIES | SESSION POLICIES | TAGS | STAGES | STREAMS | TABLES | EXTERNAL TABLES | TASKS | VIEWS | MATERIALIZED VIEWS | NETWORK RULES | PACKAGES POLICIES | ICEBERG TABLES
     */
    objectTypePlural: string;
}

export interface GrantPrivilegesToAccountRoleOnSchemaObjectFuture {
    inDatabase?: string;
    inSchema?: string;
    /**
     * The plural object type of the schema object on which privileges will be granted. Valid values are: ALERTS | DYNAMIC TABLES | EVENT TABLES | FILE FORMATS | FUNCTIONS | PROCEDURES | SECRETS | SEQUENCES | PIPES | MASKING POLICIES | PASSWORD POLICIES | ROW ACCESS POLICIES | SESSION POLICIES | TAGS | STAGES | STREAMS | TABLES | EXTERNAL TABLES | TASKS | VIEWS | MATERIALIZED VIEWS | NETWORK RULES | PACKAGES POLICIES | ICEBERG TABLES
     */
    objectTypePlural: string;
}

export interface GrantPrivilegesToDatabaseRoleOnSchema {
    /**
     * The fully qualified name of the database.
     */
    allSchemasInDatabase?: string;
    /**
     * The fully qualified name of the database.
     */
    futureSchemasInDatabase?: string;
    /**
     * The fully qualified name of the schema.
     */
    schemaName?: string;
}

export interface GrantPrivilegesToDatabaseRoleOnSchemaObject {
    /**
     * Configures the privilege to be granted on all objects in either a database or schema.
     */
    all?: outputs.GrantPrivilegesToDatabaseRoleOnSchemaObjectAll;
    /**
     * Configures the privilege to be granted on future objects in either a database or schema.
     */
    future?: outputs.GrantPrivilegesToDatabaseRoleOnSchemaObjectFuture;
    /**
     * The fully qualified name of the object on which privileges will be granted.
     */
    objectName?: string;
    /**
     * The object type of the schema object on which privileges will be granted. Valid values are: ALERT | DYNAMIC TABLE | EVENT TABLE | FILE FORMAT | FUNCTION | PROCEDURE | SECRET | SEQUENCE | PIPE | MASKING POLICY | PASSWORD POLICY | ROW ACCESS POLICY | SESSION POLICY | TAG | STAGE | STREAM | TABLE | EXTERNAL TABLE | TASK | VIEW | MATERIALIZED VIEW | NETWORK RULE | PACKAGES POLICY | ICEBERG TABLE
     */
    objectType?: string;
}

export interface GrantPrivilegesToDatabaseRoleOnSchemaObjectAll {
    inDatabase?: string;
    inSchema?: string;
    /**
     * The plural object type of the schema object on which privileges will be granted. Valid values are: ALERTS | DYNAMIC TABLES | EVENT TABLES | FILE FORMATS | FUNCTIONS | PROCEDURES | SECRETS | SEQUENCES | PIPES | MASKING POLICIES | PASSWORD POLICIES | ROW ACCESS POLICIES | SESSION POLICIES | TAGS | STAGES | STREAMS | TABLES | EXTERNAL TABLES | TASKS | VIEWS | MATERIALIZED VIEWS | NETWORK RULES | PACKAGES POLICIES | ICEBERG TABLES
     */
    objectTypePlural: string;
}

export interface GrantPrivilegesToDatabaseRoleOnSchemaObjectFuture {
    inDatabase?: string;
    inSchema?: string;
    /**
     * The plural object type of the schema object on which privileges will be granted. Valid values are: ALERTS | DYNAMIC TABLES | EVENT TABLES | FILE FORMATS | FUNCTIONS | PROCEDURES | SECRETS | SEQUENCES | PIPES | MASKING POLICIES | PASSWORD POLICIES | ROW ACCESS POLICIES | SESSION POLICIES | TAGS | STAGES | STREAMS | TABLES | EXTERNAL TABLES | TASKS | VIEWS | MATERIALIZED VIEWS | NETWORK RULES | PACKAGES POLICIES | ICEBERG TABLES
     */
    objectTypePlural: string;
}

export interface GrantPrivilegesToRoleOnAccountObject {
    /**
     * The fully qualified name of the object on which privileges will be granted.
     */
    objectName: string;
    /**
     * The object type of the account object on which privileges will be granted. Valid values are: USER | RESOURCE MONITOR | WAREHOUSE | DATABASE | INTEGRATION | FAILOVER GROUP | REPLICATION GROUP | EXTERNAL VOLUME
     */
    objectType: string;
}

export interface GrantPrivilegesToRoleOnSchema {
    /**
     * The fully qualified name of the database.
     */
    allSchemasInDatabase?: string;
    /**
     * The fully qualified name of the database.
     */
    futureSchemasInDatabase?: string;
    /**
     * The fully qualified name of the schema.
     */
    schemaName?: string;
}

export interface GrantPrivilegesToRoleOnSchemaObject {
    /**
     * Configures the privilege to be granted on all objects in eihter a database or schema.
     */
    all?: outputs.GrantPrivilegesToRoleOnSchemaObjectAll;
    /**
     * Configures the privilege to be granted on future objects in eihter a database or schema.
     */
    future?: outputs.GrantPrivilegesToRoleOnSchemaObjectFuture;
    /**
     * The fully qualified name of the object on which privileges will be granted.
     */
    objectName?: string;
    /**
     * The object type of the schema object on which privileges will be granted. Valid values are: ALERT | DYNAMIC TABLE | EVENT TABLE | FILE FORMAT | FUNCTION | ICEBERG TABLE | PROCEDURE | SECRET | SEQUENCE | PIPE | MASKING POLICY | PASSWORD POLICY | ROW ACCESS POLICY | SESSION POLICY | TAG | STAGE | STREAM | TABLE | EXTERNAL TABLE | TASK | VIEW | MATERIALIZED VIEW
     */
    objectType?: string;
}

export interface GrantPrivilegesToRoleOnSchemaObjectAll {
    /**
     * The fully qualified name of the database.
     */
    inDatabase?: string;
    /**
     * The fully qualified name of the schema.
     */
    inSchema?: string;
    /**
     * The plural object type of the schema object on which privileges will be granted. Valid values are: ALERTS | DYNAMIC TABLES | EVENT TABLES | FILE FORMATS | FUNCTIONS | ICEBERG TABLES | PROCEDURES | SECRETS | SEQUENCES | PIPES | MASKING POLICIES | PASSWORD POLICIES | ROW ACCESS POLICIES | SESSION POLICIES | TAGS | STAGES | STREAMS | TABLES | EXTERNAL TABLES | TASKS | VIEWS | MATERIALIZED VIEWS
     */
    objectTypePlural: string;
}

export interface GrantPrivilegesToRoleOnSchemaObjectFuture {
    /**
     * The fully qualified name of the database.
     */
    inDatabase?: string;
    /**
     * The fully qualified name of the schema.
     */
    inSchema?: string;
    /**
     * The plural object type of the schema object on which privileges will be granted. Valid values are: ALERTS | DYNAMIC TABLES | EVENT TABLES | FILE FORMATS | FUNCTIONS | ICEBERG TABLES | PROCEDURES | SECRETS | SEQUENCES | PIPES | MASKING POLICIES | PASSWORD POLICIES | ROW ACCESS POLICIES | SESSION POLICIES | TAGS | STAGES | STREAMS | TABLES | EXTERNAL TABLES | TASKS | VIEWS | MATERIALIZED VIEWS
     */
    objectTypePlural: string;
}

export interface MaskingPolicySignature {
    columns: outputs.MaskingPolicySignatureColumn[];
}

export interface MaskingPolicySignatureColumn {
    /**
     * Specifies the column name to mask.
     */
    name: string;
    /**
     * Specifies the column type to mask.
     */
    type: string;
}

export interface MaterializedViewTag {
    /**
     * Name of the database that the tag was created in.
     */
    database?: string;
    /**
     * Tag name, e.g. department.
     */
    name: string;
    /**
     * Name of the schema that the tag was created in.
     */
    schema?: string;
    /**
     * Tag value, e.g. marketing_info.
     */
    value: string;
}

export interface ObjectParameterObjectIdentifier {
    /**
     * Name of the database that the object was created in.
     */
    database?: string;
    /**
     * Name of the object to set the parameter for.
     */
    name: string;
    /**
     * Name of the schema that the object was created in.
     */
    schema?: string;
}

export interface ProcedureArgument {
    /**
     * The argument name
     */
    name: string;
    /**
     * The argument type
     */
    type: string;
}

export interface RoleTag {
    /**
     * Name of the database that the tag was created in.
     */
    database?: string;
    /**
     * Tag name, e.g. department.
     */
    name: string;
    /**
     * Name of the schema that the tag was created in.
     */
    schema?: string;
    /**
     * Tag value, e.g. marketing_info.
     */
    value: string;
}

export interface SchemaTag {
    /**
     * Name of the database that the tag was created in.
     */
    database?: string;
    /**
     * Tag name, e.g. department.
     */
    name: string;
    /**
     * Name of the schema that the tag was created in.
     */
    schema?: string;
    /**
     * Tag value, e.g. marketing_info.
     */
    value: string;
}

export interface StageTag {
    /**
     * Name of the database that the tag was created in.
     */
    database?: string;
    /**
     * Tag name, e.g. department.
     */
    name: string;
    /**
     * Name of the schema that the tag was created in.
     */
    schema?: string;
    /**
     * Tag value, e.g. marketing_info.
     */
    value: string;
}

export interface TableColumn {
    /**
     * Column comment
     */
    comment?: string;
    /**
     * Defines the column default value; note due to limitations of Snowflake's ALTER TABLE ADD/MODIFY COLUMN updates to default will not be applied
     */
    default?: outputs.TableColumnDefault;
    /**
     * Defines the identity start/step values for a column. **Note** Identity/default are mutually exclusive.
     */
    identity?: outputs.TableColumnIdentity;
    /**
     * Masking policy to apply on column
     */
    maskingPolicy?: string;
    /**
     * Column name
     */
    name: string;
    /**
     * Whether this column can contain null values. **Note**: Depending on your Snowflake version, the default value will not suffice if this column is used in a primary key constraint.
     */
    nullable?: boolean;
    /**
     * Column type, e.g. VARIANT
     */
    type: string;
}

export interface TableColumnDefault {
    /**
     * The default constant value for the column
     */
    constant?: string;
    /**
     * The default expression value for the column
     */
    expression?: string;
    /**
     * The default sequence to use for the column
     */
    sequence?: string;
}

export interface TableColumnIdentity {
    /**
     * The number to start incrementing at.
     */
    startNum?: number;
    /**
     * Step size to increment by.
     */
    stepNum?: number;
}

export interface TableConstraintForeignKeyProperties {
    /**
     * The match type for the foreign key. Not applicable for primary/unique keys
     */
    match?: string;
    /**
     * Specifies the action performed when the primary/unique key for the foreign key is deleted. Not applicable for primary/unique keys
     */
    onDelete?: string;
    /**
     * Specifies the action performed when the primary/unique key for the foreign key is updated. Not applicable for primary/unique keys
     */
    onUpdate?: string;
    /**
     * The table and columns that the foreign key references. Not applicable for primary/unique keys
     */
    references?: outputs.TableConstraintForeignKeyPropertiesReferences;
}

export interface TableConstraintForeignKeyPropertiesReferences {
    /**
     * Columns to use in foreign key reference
     */
    columns: string[];
    /**
     * Name of constraint
     */
    tableId: string;
}

export interface TablePrimaryKey {
    /**
     * Columns to use in primary key
     */
    keys: string[];
    /**
     * Name of constraint
     */
    name?: string;
}

export interface TableTag {
    /**
     * Name of the database that the tag was created in.
     */
    database?: string;
    /**
     * Tag name, e.g. department.
     */
    name: string;
    /**
     * Name of the schema that the tag was created in.
     */
    schema?: string;
    /**
     * Tag value, e.g. marketing_info.
     */
    value: string;
}

export interface TagAssociationObjectIdentifier {
    /**
     * Name of the database that the object was created in.
     */
    database?: string;
    /**
     * Name of the object to associate the tag with.
     */
    name: string;
    /**
     * Name of the schema that the object was created in.
     */
    schema?: string;
}

export interface ViewTag {
    /**
     * Name of the database that the tag was created in.
     */
    database?: string;
    /**
     * Tag name, e.g. department.
     */
    name: string;
    /**
     * Name of the schema that the tag was created in.
     */
    schema?: string;
    /**
     * Tag value, e.g. marketing_info.
     */
    value: string;
}

export namespace config {
    export interface TokenAccessor {
        /**
         * The client ID for the OAuth provider when using a refresh token to renew access token. Can also be sourced from the `SNOWFLAKE_TOKEN_ACCESSOR_CLIENT_ID` environment variable.
         */
        clientId: string;
        /**
         * The client secret for the OAuth provider when using a refresh token to renew access token. Can also be sourced from the `SNOWFLAKE_TOKEN_ACCESSOR_CLIENT_SECRET` environment variable.
         */
        clientSecret: string;
        /**
         * The redirect URI for the OAuth provider when using a refresh token to renew access token. Can also be sourced from the `SNOWFLAKE_TOKEN_ACCESSOR_REDIRECT_URI` environment variable.
         */
        redirectUri: string;
        /**
         * The refresh token for the OAuth provider when using a refresh token to renew access token. Can also be sourced from the `SNOWFLAKE_TOKEN_ACCESSOR_REFRESH_TOKEN` environment variable.
         */
        refreshToken: string;
        /**
         * The token endpoint for the OAuth provider e.g. https://{yourDomain}/oauth/token when using a refresh token to renew access token. Can also be sourced from the `SNOWFLAKE_TOKEN_ACCESSOR_TOKEN_ENDPOINT` environment variable.
         */
        tokenEndpoint: string;
    }

}
