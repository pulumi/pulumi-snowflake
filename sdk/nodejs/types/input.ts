// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";

export interface AlertAlertSchedule {
    /**
     * Specifies the cron expression for the alert. The cron expression must be in the following format: "minute hour day-of-month month day-of-week". The following values are supported: minute: 0-59 hour: 0-23 day-of-month: 1-31 month: 1-12 day-of-week: 0-6 (0 is Sunday)
     */
    cron?: pulumi.Input<inputs.AlertAlertScheduleCron>;
    /**
     * Specifies the interval in minutes for the alert schedule. The interval must be greater than 0 and less than 1440 (24 hours).
     */
    interval?: pulumi.Input<number>;
}

export interface AlertAlertScheduleCron {
    /**
     * Specifies the cron expression for the alert. The cron expression must be in the following format: "minute hour day-of-month month day-of-week". The following values are supported: minute: 0-59 hour: 0-23 day-of-month: 1-31 month: 1-12 day-of-week: 0-6 (0 is Sunday)
     */
    expression: pulumi.Input<string>;
    /**
     * Specifies the time zone for alert refresh.
     */
    timeZone: pulumi.Input<string>;
}

export interface DatabaseReplicationConfiguration {
    accounts: pulumi.Input<pulumi.Input<string>[]>;
    ignoreEditionCheck?: pulumi.Input<boolean>;
}

export interface DynamicTableTargetLag {
    /**
     * Specifies whether the target lag time is downstream.
     */
    downstream?: pulumi.Input<boolean>;
    /**
     * Specifies the maximum target lag time for the dynamic table.
     */
    maximumDuration?: pulumi.Input<string>;
}

export interface ExternalFunctionArg {
    /**
     * Argument name
     */
    name: pulumi.Input<string>;
    /**
     * Argument type, e.g. VARCHAR
     */
    type: pulumi.Input<string>;
}

export interface ExternalFunctionHeader {
    /**
     * Header name
     */
    name: pulumi.Input<string>;
    /**
     * Header value
     */
    value: pulumi.Input<string>;
}

export interface ExternalTableColumn {
    /**
     * String that specifies the expression for the column. When queried, the column returns results derived from this expression.
     */
    as: pulumi.Input<string>;
    /**
     * Column name
     */
    name: pulumi.Input<string>;
    /**
     * Column type, e.g. VARIANT
     */
    type: pulumi.Input<string>;
}

export interface ExternalTableTag {
    /**
     * Name of the database that the tag was created in.
     */
    database?: pulumi.Input<string>;
    /**
     * Tag name, e.g. department.
     */
    name: pulumi.Input<string>;
    /**
     * Name of the schema that the tag was created in.
     */
    schema?: pulumi.Input<string>;
    /**
     * Tag value, e.g. marketing_info.
     */
    value: pulumi.Input<string>;
}

export interface FailoverGroupFromReplica {
    /**
     * Identifier for the primary failover group in the source account.
     */
    name: pulumi.Input<string>;
    /**
     * Name of your Snowflake organization.
     */
    organizationName: pulumi.Input<string>;
    /**
     * Source account from which you are enabling replication and failover of the specified objects.
     */
    sourceAccountName: pulumi.Input<string>;
}

export interface FailoverGroupReplicationSchedule {
    /**
     * Specifies the cron expression for the replication schedule. The cron expression must be in the following format: "minute hour day-of-month month day-of-week". The following values are supported: minute: 0-59 hour: 0-23 day-of-month: 1-31 month: 1-12 day-of-week: 0-6 (0 is Sunday)
     */
    cron?: pulumi.Input<inputs.FailoverGroupReplicationScheduleCron>;
    /**
     * Specifies the interval in minutes for the replication schedule. The interval must be greater than 0 and less than 1440 (24 hours).
     */
    interval?: pulumi.Input<number>;
}

export interface FailoverGroupReplicationScheduleCron {
    /**
     * Specifies the cron expression for the replication schedule. The cron expression must be in the following format: "minute hour day-of-month month day-of-week". The following values are supported: minute: 0-59 hour: 0-23 day-of-month: 1-31 month: 1-12 day-of-week: 0-6 (0 is Sunday)
     */
    expression: pulumi.Input<string>;
    /**
     * Specifies the time zone for secondary group refresh.
     */
    timeZone: pulumi.Input<string>;
}

export interface FunctionArgument {
    /**
     * The argument name
     */
    name: pulumi.Input<string>;
    /**
     * The argument type
     */
    type: pulumi.Input<string>;
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

export interface GetDynamicTablesInArgs {
    /**
     * Returns records for the entire account.
     */
    account?: pulumi.Input<boolean>;
    /**
     * Returns records for the current database in use or for a specified database (db_name).
     */
    database?: pulumi.Input<string>;
    /**
     * Returns records for the current schema in use or a specified schema (schema_name).
     */
    schema?: pulumi.Input<string>;
}

export interface GetDynamicTablesLike {
    /**
     * Filters the command output by object name. The filter uses case-insensitive pattern matching with support for SQL wildcard characters (% and _).
     */
    pattern: string;
}

export interface GetDynamicTablesLikeArgs {
    /**
     * Filters the command output by object name. The filter uses case-insensitive pattern matching with support for SQL wildcard characters (% and _).
     */
    pattern: pulumi.Input<string>;
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

export interface GetDynamicTablesLimitArgs {
    /**
     * The optional FROM 'name_string' subclause effectively serves as a “cursor” for the results. This enables fetching the specified number of rows following the first row whose object name matches the specified string
     */
    from?: pulumi.Input<string>;
    /**
     * Specifies the maximum number of rows to return.
     */
    rows?: pulumi.Input<number>;
}

export interface GetGrantsFutureGrantsIn {
    /**
     * Lists all privileges on new (i.e. future) objects of a specified type in the database granted to a role.
     */
    database?: string;
    /**
     * Lists all privileges on new (i.e. future) objects of a specified type in the schema granted to a role. Schema must be a fully qualified name ("&lt;db*name&gt;"."&lt;schema*name&gt;").
     */
    schema?: string;
}

export interface GetGrantsFutureGrantsInArgs {
    /**
     * Lists all privileges on new (i.e. future) objects of a specified type in the database granted to a role.
     */
    database?: pulumi.Input<string>;
    /**
     * Lists all privileges on new (i.e. future) objects of a specified type in the schema granted to a role. Schema must be a fully qualified name ("&lt;db*name&gt;"."&lt;schema*name&gt;").
     */
    schema?: pulumi.Input<string>;
}

export interface GetGrantsFutureGrantsTo {
    /**
     * Lists all privileges on new (i.e. future) objects of a specified type in a database or schema granted to the account role.
     */
    accountRole?: string;
    /**
     * Lists all privileges on new (i.e. future) objects granted to the database role. Must be a fully qualified name ("&lt;db*name&gt;"."&lt;database*role_name&gt;").
     */
    databaseRole?: string;
}

export interface GetGrantsFutureGrantsToArgs {
    /**
     * Lists all privileges on new (i.e. future) objects of a specified type in a database or schema granted to the account role.
     */
    accountRole?: pulumi.Input<string>;
    /**
     * Lists all privileges on new (i.e. future) objects granted to the database role. Must be a fully qualified name ("&lt;db*name&gt;"."&lt;database*role_name&gt;").
     */
    databaseRole?: pulumi.Input<string>;
}

export interface GetGrantsGrantsOf {
    /**
     * Lists all users and roles to which the account role has been granted.
     */
    accountRole?: string;
    /**
     * Lists all the users and roles to which the application role has been granted. Must be a fully qualified name ("&lt;db*name&gt;"."&lt;database*role_name&gt;").
     */
    applicationRole?: string;
    /**
     * Lists all users and roles to which the database role has been granted. Must be a fully qualified name ("&lt;db*name&gt;"."&lt;database*role_name&gt;").
     */
    databaseRole?: string;
    /**
     * Lists all the accounts for the share and indicates the accounts that are using the share.
     */
    share?: string;
}

export interface GetGrantsGrantsOfArgs {
    /**
     * Lists all users and roles to which the account role has been granted.
     */
    accountRole?: pulumi.Input<string>;
    /**
     * Lists all the users and roles to which the application role has been granted. Must be a fully qualified name ("&lt;db*name&gt;"."&lt;database*role_name&gt;").
     */
    applicationRole?: pulumi.Input<string>;
    /**
     * Lists all users and roles to which the database role has been granted. Must be a fully qualified name ("&lt;db*name&gt;"."&lt;database*role_name&gt;").
     */
    databaseRole?: pulumi.Input<string>;
    /**
     * Lists all the accounts for the share and indicates the accounts that are using the share.
     */
    share?: pulumi.Input<string>;
}

export interface GetGrantsGrantsOn {
    /**
     * Object hierarchy to list privileges on. The only valid value is: ACCOUNT. Setting this attribute lists all the account-level (i.e. global) privileges that have been granted to roles.
     */
    account?: boolean;
    /**
     * Name of object to list privileges on.
     */
    objectName?: string;
    /**
     * Type of object to list privileges on.
     */
    objectType?: string;
}

export interface GetGrantsGrantsOnArgs {
    /**
     * Object hierarchy to list privileges on. The only valid value is: ACCOUNT. Setting this attribute lists all the account-level (i.e. global) privileges that have been granted to roles.
     */
    account?: pulumi.Input<boolean>;
    /**
     * Name of object to list privileges on.
     */
    objectName?: pulumi.Input<string>;
    /**
     * Type of object to list privileges on.
     */
    objectType?: pulumi.Input<string>;
}

export interface GetGrantsGrantsTo {
    /**
     * Lists all privileges and roles granted to the role.
     */
    accountRole?: string;
    /**
     * Lists all the privileges and roles granted to the application.
     */
    application?: string;
    /**
     * Lists all the privileges and roles granted to the application role. Must be a fully qualified name ("&lt;app*name&gt;"."&lt;app*role_name&gt;").
     */
    applicationRole?: string;
    /**
     * Lists all privileges and roles granted to the database role. Must be a fully qualified name ("&lt;db*name&gt;"."&lt;database*role_name&gt;").
     */
    databaseRole?: string;
    /**
     * Lists all the privileges granted to the share.
     */
    share?: inputs.GetGrantsGrantsToShare;
    /**
     * Lists all the roles granted to the user. Note that the PUBLIC role, which is automatically available to every user, is not listed.
     */
    user?: string;
}

export interface GetGrantsGrantsToArgs {
    /**
     * Lists all privileges and roles granted to the role.
     */
    accountRole?: pulumi.Input<string>;
    /**
     * Lists all the privileges and roles granted to the application.
     */
    application?: pulumi.Input<string>;
    /**
     * Lists all the privileges and roles granted to the application role. Must be a fully qualified name ("&lt;app*name&gt;"."&lt;app*role_name&gt;").
     */
    applicationRole?: pulumi.Input<string>;
    /**
     * Lists all privileges and roles granted to the database role. Must be a fully qualified name ("&lt;db*name&gt;"."&lt;database*role_name&gt;").
     */
    databaseRole?: pulumi.Input<string>;
    /**
     * Lists all the privileges granted to the share.
     */
    share?: pulumi.Input<inputs.GetGrantsGrantsToShareArgs>;
    /**
     * Lists all the roles granted to the user. Note that the PUBLIC role, which is automatically available to every user, is not listed.
     */
    user?: pulumi.Input<string>;
}

export interface GetGrantsGrantsToShare {
    /**
     * Lists all of the privileges and roles granted to the specified share.
     */
    shareName: string;
}

export interface GetGrantsGrantsToShareArgs {
    /**
     * Lists all of the privileges and roles granted to the specified share.
     */
    shareName: pulumi.Input<string>;
}

export interface GrantOwnershipOn {
    /**
     * Configures the privilege to be granted on all objects in either a database or schema.
     */
    all?: pulumi.Input<inputs.GrantOwnershipOnAll>;
    /**
     * Configures the privilege to be granted on all objects in either a database or schema.
     */
    future?: pulumi.Input<inputs.GrantOwnershipOnFuture>;
    /**
     * Specifies the identifier for the object on which you are transferring ownership.
     */
    objectName?: pulumi.Input<string>;
    /**
     * Specifies the type of object on which you are transferring ownership. Available values are: AGGREGATION POLICY | ALERT | AUTHENTICATION POLICY | COMPUTE POOL | DATA METRIC FUNCTION | DATABASE | DATABASE ROLE | DYNAMIC TABLE | EVENT TABLE | EXTERNAL TABLE | EXTERNAL VOLUME | FAILOVER GROUP | FILE FORMAT | FUNCTION | GIT REPOSITORY | HYBRID TABLE | ICEBERG TABLE | IMAGE REPOSITORY | INTEGRATION | MATERIALIZED VIEW | NETWORK POLICY | NETWORK RULE | PACKAGES POLICY | PIPE | PROCEDURE | MASKING POLICY | PASSWORD POLICY | PROJECTION POLICY | REPLICATION GROUP | ROLE | ROW ACCESS POLICY | SCHEMA | SESSION POLICY | SECRET | SEQUENCE | STAGE | STREAM | TABLE | TAG | TASK | USER | VIEW | WAREHOUSE
     */
    objectType?: pulumi.Input<string>;
}

export interface GrantOwnershipOnAll {
    /**
     * The fully qualified name of the database.
     */
    inDatabase?: pulumi.Input<string>;
    /**
     * The fully qualified name of the schema.
     */
    inSchema?: pulumi.Input<string>;
    /**
     * Specifies the type of object in plural form on which you are transferring ownership. Available values are: AGGREGATION POLICIES | ALERTS | AUTHENTICATION POLICIES | COMPUTE POOLS | DATA METRIC FUNCTIONS | DATABASES | DATABASE ROLES | DYNAMIC TABLES | EVENT TABLES | EXTERNAL TABLES | EXTERNAL VOLUMES | FAILOVER GROUPS | FILE FORMATS | FUNCTIONS | GIT REPOSITORIES | HYBRID TABLES | ICEBERG TABLES | IMAGE REPOSITORIES | INTEGRATIONS | MATERIALIZED VIEWS | NETWORK POLICIES | NETWORK RULES | PACKAGES POLICIES | PIPES | PROCEDURES | MASKING POLICIES | PASSWORD POLICIES | PROJECTION POLICIES | REPLICATION GROUPS | ROLES | ROW ACCESS POLICIES | SCHEMAS | SESSION POLICIES | SECRETS | SEQUENCES | STAGES | STREAMS | TABLES | TAGS | TASKS | USERS | VIEWS | WAREHOUSES. For more information head over to [Snowflake documentation](https://docs.snowflake.com/en/sql-reference/sql/grant-ownership#required-parameters).
     */
    objectTypePlural: pulumi.Input<string>;
}

export interface GrantOwnershipOnFuture {
    /**
     * The fully qualified name of the database.
     */
    inDatabase?: pulumi.Input<string>;
    /**
     * The fully qualified name of the schema.
     */
    inSchema?: pulumi.Input<string>;
    /**
     * Specifies the type of object in plural form on which you are transferring ownership. Available values are: AGGREGATION POLICIES | ALERTS | AUTHENTICATION POLICIES | COMPUTE POOLS | DATA METRIC FUNCTIONS | DATABASES | DATABASE ROLES | DYNAMIC TABLES | EVENT TABLES | EXTERNAL TABLES | EXTERNAL VOLUMES | FAILOVER GROUPS | FILE FORMATS | FUNCTIONS | GIT REPOSITORIES | HYBRID TABLES | ICEBERG TABLES | IMAGE REPOSITORIES | INTEGRATIONS | MATERIALIZED VIEWS | NETWORK POLICIES | NETWORK RULES | PACKAGES POLICIES | PIPES | PROCEDURES | MASKING POLICIES | PASSWORD POLICIES | PROJECTION POLICIES | REPLICATION GROUPS | ROLES | ROW ACCESS POLICIES | SCHEMAS | SESSION POLICIES | SECRETS | SEQUENCES | STAGES | STREAMS | TABLES | TAGS | TASKS | USERS | VIEWS | WAREHOUSES. For more information head over to [Snowflake documentation](https://docs.snowflake.com/en/sql-reference/sql/grant-ownership#required-parameters).
     */
    objectTypePlural: pulumi.Input<string>;
}

export interface GrantPrivilegesToAccountRoleOnAccountObject {
    /**
     * The fully qualified name of the object on which privileges will be granted.
     */
    objectName: pulumi.Input<string>;
    /**
     * The object type of the account object on which privileges will be granted. Valid values are: USER | RESOURCE MONITOR | WAREHOUSE | COMPUTE POOL | DATABASE | INTEGRATION | FAILOVER GROUP | REPLICATION GROUP | EXTERNAL VOLUME
     */
    objectType: pulumi.Input<string>;
}

export interface GrantPrivilegesToAccountRoleOnSchema {
    /**
     * The fully qualified name of the database.
     */
    allSchemasInDatabase?: pulumi.Input<string>;
    /**
     * The fully qualified name of the database.
     */
    futureSchemasInDatabase?: pulumi.Input<string>;
    /**
     * The fully qualified name of the schema.
     */
    schemaName?: pulumi.Input<string>;
}

export interface GrantPrivilegesToAccountRoleOnSchemaObject {
    /**
     * Configures the privilege to be granted on all objects in either a database or schema.
     */
    all?: pulumi.Input<inputs.GrantPrivilegesToAccountRoleOnSchemaObjectAll>;
    /**
     * Configures the privilege to be granted on future objects in either a database or schema.
     */
    future?: pulumi.Input<inputs.GrantPrivilegesToAccountRoleOnSchemaObjectFuture>;
    /**
     * The fully qualified name of the object on which privileges will be granted.
     */
    objectName?: pulumi.Input<string>;
    /**
     * The object type of the schema object on which privileges will be granted. Valid values are: AGGREGATION POLICY | ALERT | AUTHENTICATION POLICY | DATA METRIC FUNCTION | DYNAMIC TABLE | EVENT TABLE | EXTERNAL TABLE | FILE FORMAT | FUNCTION | GIT REPOSITORY | HYBRID TABLE | IMAGE REPOSITORY | ICEBERG TABLE | MASKING POLICY | MATERIALIZED VIEW | MODEL | NETWORK RULE | PACKAGES POLICY | PASSWORD POLICY | PIPE | PROCEDURE | PROJECTION POLICY | ROW ACCESS POLICY | SECRET | SERVICE | SESSION POLICY | SEQUENCE | STAGE | STREAM | TABLE | TAG | TASK | VIEW | STREAMLIT
     */
    objectType?: pulumi.Input<string>;
}

export interface GrantPrivilegesToAccountRoleOnSchemaObjectAll {
    inDatabase?: pulumi.Input<string>;
    inSchema?: pulumi.Input<string>;
    /**
     * The plural object type of the schema object on which privileges will be granted. Valid values are: AGGREGATION POLICIES | ALERTS | AUTHENTICATION POLICIES | DATA METRIC FUNCTIONS | DYNAMIC TABLES | EVENT TABLES | EXTERNAL TABLES | FILE FORMATS | FUNCTIONS | GIT REPOSITORIES | HYBRID TABLES | IMAGE REPOSITORIES | ICEBERG TABLES | MASKING POLICIES | MATERIALIZED VIEWS | MODELS | NETWORK RULES | PACKAGES POLICIES | PASSWORD POLICIES | PIPES | PROCEDURES | PROJECTION POLICIES | ROW ACCESS POLICIES | SECRETS | SERVICES | SESSION POLICIES | SEQUENCES | STAGES | STREAMS | TABLES | TAGS | TASKS | VIEWS | STREAMLITS.
     */
    objectTypePlural: pulumi.Input<string>;
}

export interface GrantPrivilegesToAccountRoleOnSchemaObjectFuture {
    inDatabase?: pulumi.Input<string>;
    inSchema?: pulumi.Input<string>;
    /**
     * The plural object type of the schema object on which privileges will be granted. Valid values are: ALERTS | AUTHENTICATION POLICIES | DATA METRIC FUNCTIONS | DYNAMIC TABLES | EVENT TABLES | EXTERNAL TABLES | FILE FORMATS | FUNCTIONS | GIT REPOSITORIES | HYBRID TABLES | ICEBERG TABLES | MATERIALIZED VIEWS | MODELS | NETWORK RULES | PASSWORD POLICIES | PIPES | PROCEDURES | SECRETS | SERVICES | SEQUENCES | STAGES | STREAMS | TABLES | TASKS | VIEWS.
     */
    objectTypePlural: pulumi.Input<string>;
}

export interface GrantPrivilegesToDatabaseRoleOnSchema {
    /**
     * The fully qualified name of the database.
     */
    allSchemasInDatabase?: pulumi.Input<string>;
    /**
     * The fully qualified name of the database.
     */
    futureSchemasInDatabase?: pulumi.Input<string>;
    /**
     * The fully qualified name of the schema.
     */
    schemaName?: pulumi.Input<string>;
}

export interface GrantPrivilegesToDatabaseRoleOnSchemaObject {
    /**
     * Configures the privilege to be granted on all objects in either a database or schema.
     */
    all?: pulumi.Input<inputs.GrantPrivilegesToDatabaseRoleOnSchemaObjectAll>;
    /**
     * Configures the privilege to be granted on future objects in either a database or schema.
     */
    future?: pulumi.Input<inputs.GrantPrivilegesToDatabaseRoleOnSchemaObjectFuture>;
    /**
     * The fully qualified name of the object on which privileges will be granted.
     */
    objectName?: pulumi.Input<string>;
    /**
     * The object type of the schema object on which privileges will be granted. Valid values are: AGGREGATION POLICY | ALERT | AUTHENTICATION POLICY | DATA METRIC FUNCTION | DYNAMIC TABLE | EVENT TABLE | EXTERNAL TABLE | FILE FORMAT | FUNCTION | GIT REPOSITORY | HYBRID TABLE | IMAGE REPOSITORY | ICEBERG TABLE | MASKING POLICY | MATERIALIZED VIEW | MODEL | NETWORK RULE | PACKAGES POLICY | PASSWORD POLICY | PIPE | PROCEDURE | PROJECTION POLICY | ROW ACCESS POLICY | SECRET | SERVICE | SESSION POLICY | SEQUENCE | STAGE | STREAM | TABLE | TAG | TASK | VIEW | STREAMLIT
     */
    objectType?: pulumi.Input<string>;
}

export interface GrantPrivilegesToDatabaseRoleOnSchemaObjectAll {
    /**
     * The fully qualified name of the database.
     */
    inDatabase?: pulumi.Input<string>;
    /**
     * The fully qualified name of the schema.
     */
    inSchema?: pulumi.Input<string>;
    /**
     * The plural object type of the schema object on which privileges will be granted. Valid values are: AGGREGATION POLICIES | ALERTS | AUTHENTICATION POLICIES | DATA METRIC FUNCTIONS | DYNAMIC TABLES | EVENT TABLES | EXTERNAL TABLES | FILE FORMATS | FUNCTIONS | GIT REPOSITORIES | HYBRID TABLES | IMAGE REPOSITORIES | ICEBERG TABLES | MASKING POLICIES | MATERIALIZED VIEWS | MODELS | NETWORK RULES | PACKAGES POLICIES | PASSWORD POLICIES | PIPES | PROCEDURES | PROJECTION POLICIES | ROW ACCESS POLICIES | SECRETS | SERVICES | SESSION POLICIES | SEQUENCES | STAGES | STREAMS | TABLES | TAGS | TASKS | VIEWS | STREAMLITS.
     */
    objectTypePlural: pulumi.Input<string>;
}

export interface GrantPrivilegesToDatabaseRoleOnSchemaObjectFuture {
    /**
     * The fully qualified name of the database.
     */
    inDatabase?: pulumi.Input<string>;
    /**
     * The fully qualified name of the schema.
     */
    inSchema?: pulumi.Input<string>;
    /**
     * The plural object type of the schema object on which privileges will be granted. Valid values are: ALERTS | AUTHENTICATION POLICIES | DATA METRIC FUNCTIONS | DYNAMIC TABLES | EVENT TABLES | EXTERNAL TABLES | FILE FORMATS | FUNCTIONS | GIT REPOSITORIES | HYBRID TABLES | ICEBERG TABLES | MATERIALIZED VIEWS | MODELS | NETWORK RULES | PASSWORD POLICIES | PIPES | PROCEDURES | SECRETS | SERVICES | SEQUENCES | STAGES | STREAMS | TABLES | TASKS | VIEWS.
     */
    objectTypePlural: pulumi.Input<string>;
}

export interface GrantPrivilegesToRoleOnAccountObject {
    /**
     * The fully qualified name of the object on which privileges will be granted.
     */
    objectName: pulumi.Input<string>;
    /**
     * The object type of the account object on which privileges will be granted. Valid values are: USER | RESOURCE MONITOR | WAREHOUSE | DATABASE | INTEGRATION | FAILOVER GROUP | REPLICATION GROUP | EXTERNAL VOLUME
     */
    objectType: pulumi.Input<string>;
}

export interface GrantPrivilegesToRoleOnSchema {
    /**
     * The fully qualified name of the database.
     */
    allSchemasInDatabase?: pulumi.Input<string>;
    /**
     * The fully qualified name of the database.
     */
    futureSchemasInDatabase?: pulumi.Input<string>;
    /**
     * The fully qualified name of the schema.
     */
    schemaName?: pulumi.Input<string>;
}

export interface GrantPrivilegesToRoleOnSchemaObject {
    /**
     * Configures the privilege to be granted on all objects in eihter a database or schema.
     */
    all?: pulumi.Input<inputs.GrantPrivilegesToRoleOnSchemaObjectAll>;
    /**
     * Configures the privilege to be granted on future objects in eihter a database or schema.
     */
    future?: pulumi.Input<inputs.GrantPrivilegesToRoleOnSchemaObjectFuture>;
    /**
     * The fully qualified name of the object on which privileges will be granted.
     */
    objectName?: pulumi.Input<string>;
    /**
     * The object type of the schema object on which privileges will be granted. Valid values are: AGGREGATION POLICY | ALERT | AUTHENTICATION POLICY | DATA METRIC FUNCTION | DYNAMIC TABLE | EVENT TABLE | EXTERNAL TABLE | FILE FORMAT | FUNCTION | GIT REPOSITORY | HYBRID TABLE | IMAGE REPOSITORY | ICEBERG TABLE | MASKING POLICY | MATERIALIZED VIEW | MODEL | NETWORK RULE | PACKAGES POLICY | PASSWORD POLICY | PIPE | PROCEDURE | PROJECTION POLICY | ROW ACCESS POLICY | SECRET | SERVICE | SESSION POLICY | SEQUENCE | STAGE | STREAM | TABLE | TAG | TASK | VIEW | STREAMLIT
     */
    objectType?: pulumi.Input<string>;
}

export interface GrantPrivilegesToRoleOnSchemaObjectAll {
    /**
     * The fully qualified name of the database.
     */
    inDatabase?: pulumi.Input<string>;
    /**
     * The fully qualified name of the schema.
     */
    inSchema?: pulumi.Input<string>;
    /**
     * The plural object type of the schema object on which privileges will be granted. Valid values are: AGGREGATION POLICIES | ALERTS | AUTHENTICATION POLICIES | DATA METRIC FUNCTIONS | DYNAMIC TABLES | EVENT TABLES | EXTERNAL TABLES | FILE FORMATS | FUNCTIONS | GIT REPOSITORIES | HYBRID TABLES | IMAGE REPOSITORIES | ICEBERG TABLES | MASKING POLICIES | MATERIALIZED VIEWS | MODELS | NETWORK RULES | PACKAGES POLICIES | PASSWORD POLICIES | PIPES | PROCEDURES | PROJECTION POLICIES | ROW ACCESS POLICIES | SECRETS | SERVICES | SESSION POLICIES | SEQUENCES | STAGES | STREAMS | TABLES | TAGS | TASKS | VIEWS | STREAMLITS
     */
    objectTypePlural: pulumi.Input<string>;
}

export interface GrantPrivilegesToRoleOnSchemaObjectFuture {
    /**
     * The fully qualified name of the database.
     */
    inDatabase?: pulumi.Input<string>;
    /**
     * The fully qualified name of the schema.
     */
    inSchema?: pulumi.Input<string>;
    /**
     * The plural object type of the schema object on which privileges will be granted. Valid values are: ALERTS | AUTHENTICATION POLICIES | DATA METRIC FUNCTIONS | DYNAMIC TABLES | EVENT TABLES | EXTERNAL TABLES | FILE FORMATS | FUNCTIONS | GIT REPOSITORIES | HYBRID TABLES | ICEBERG TABLES | MATERIALIZED VIEWS | MODELS | NETWORK RULES | PASSWORD POLICIES | PIPES | PROCEDURES | SECRETS | SERVICES | SEQUENCES | STAGES | STREAMS | TABLES | TASKS | VIEWS
     */
    objectTypePlural: pulumi.Input<string>;
}

export interface MaskingPolicySignature {
    columns: pulumi.Input<pulumi.Input<inputs.MaskingPolicySignatureColumn>[]>;
}

export interface MaskingPolicySignatureColumn {
    /**
     * Specifies the column name to mask.
     */
    name: pulumi.Input<string>;
    /**
     * Specifies the column type to mask.
     */
    type: pulumi.Input<string>;
}

export interface MaterializedViewTag {
    /**
     * Name of the database that the tag was created in.
     */
    database?: pulumi.Input<string>;
    /**
     * Tag name, e.g. department.
     */
    name: pulumi.Input<string>;
    /**
     * Name of the schema that the tag was created in.
     */
    schema?: pulumi.Input<string>;
    /**
     * Tag value, e.g. marketing_info.
     */
    value: pulumi.Input<string>;
}

export interface ObjectParameterObjectIdentifier {
    /**
     * Name of the database that the object was created in.
     */
    database?: pulumi.Input<string>;
    /**
     * Name of the object to set the parameter for.
     */
    name: pulumi.Input<string>;
    /**
     * Name of the schema that the object was created in.
     */
    schema?: pulumi.Input<string>;
}

export interface ProcedureArgument {
    /**
     * The argument name
     */
    name: pulumi.Input<string>;
    /**
     * The argument type
     */
    type: pulumi.Input<string>;
}

export interface ProviderTokenAccessor {
    /**
     * The client ID for the OAuth provider when using a refresh token to renew access token. Can also be sourced from the `SNOWFLAKE_TOKEN_ACCESSOR_CLIENT_ID` environment variable.
     */
    clientId: pulumi.Input<string>;
    /**
     * The client secret for the OAuth provider when using a refresh token to renew access token. Can also be sourced from the `SNOWFLAKE_TOKEN_ACCESSOR_CLIENT_SECRET` environment variable.
     */
    clientSecret: pulumi.Input<string>;
    /**
     * The redirect URI for the OAuth provider when using a refresh token to renew access token. Can also be sourced from the `SNOWFLAKE_TOKEN_ACCESSOR_REDIRECT_URI` environment variable.
     */
    redirectUri: pulumi.Input<string>;
    /**
     * The refresh token for the OAuth provider when using a refresh token to renew access token. Can also be sourced from the `SNOWFLAKE_TOKEN_ACCESSOR_REFRESH_TOKEN` environment variable.
     */
    refreshToken: pulumi.Input<string>;
    /**
     * The token endpoint for the OAuth provider e.g. https://{yourDomain}/oauth/token when using a refresh token to renew access token. Can also be sourced from the `SNOWFLAKE_TOKEN_ACCESSOR_TOKEN_ENDPOINT` environment variable.
     */
    tokenEndpoint: pulumi.Input<string>;
}

export interface RoleTag {
    /**
     * Name of the database that the tag was created in.
     */
    database?: pulumi.Input<string>;
    /**
     * Tag name, e.g. department.
     */
    name: pulumi.Input<string>;
    /**
     * Name of the schema that the tag was created in.
     */
    schema?: pulumi.Input<string>;
    /**
     * Tag value, e.g. marketing_info.
     */
    value: pulumi.Input<string>;
}

export interface SchemaTag {
    /**
     * Name of the database that the tag was created in.
     */
    database?: pulumi.Input<string>;
    /**
     * Tag name, e.g. department.
     */
    name: pulumi.Input<string>;
    /**
     * Name of the schema that the tag was created in.
     */
    schema?: pulumi.Input<string>;
    /**
     * Tag value, e.g. marketing_info.
     */
    value: pulumi.Input<string>;
}

export interface StageTag {
    /**
     * Name of the database that the tag was created in.
     */
    database?: pulumi.Input<string>;
    /**
     * Tag name, e.g. department.
     */
    name: pulumi.Input<string>;
    /**
     * Name of the schema that the tag was created in.
     */
    schema?: pulumi.Input<string>;
    /**
     * Tag value, e.g. marketing_info.
     */
    value: pulumi.Input<string>;
}

export interface TableColumn {
    /**
     * Column collation, e.g. utf8
     */
    collate?: pulumi.Input<string>;
    /**
     * Column comment
     */
    comment?: pulumi.Input<string>;
    /**
     * Defines the column default value; note due to limitations of Snowflake's ALTER TABLE ADD/MODIFY COLUMN updates to default will not be applied
     */
    default?: pulumi.Input<inputs.TableColumnDefault>;
    /**
     * Defines the identity start/step values for a column. **Note** Identity/default are mutually exclusive.
     */
    identity?: pulumi.Input<inputs.TableColumnIdentity>;
    /**
     * Masking policy to apply on column. It has to be a fully qualified name.
     */
    maskingPolicy?: pulumi.Input<string>;
    /**
     * Column name
     */
    name: pulumi.Input<string>;
    /**
     * Whether this column can contain null values. **Note**: Depending on your Snowflake version, the default value will not suffice if this column is used in a primary key constraint.
     */
    nullable?: pulumi.Input<boolean>;
    /**
     * Record of schema evolution.
     */
    schemaEvolutionRecord?: pulumi.Input<string>;
    /**
     * Column type, e.g. VARIANT
     */
    type: pulumi.Input<string>;
}

export interface TableColumnDefault {
    /**
     * The default constant value for the column
     */
    constant?: pulumi.Input<string>;
    /**
     * The default expression value for the column
     */
    expression?: pulumi.Input<string>;
    /**
     * The default sequence to use for the column
     */
    sequence?: pulumi.Input<string>;
}

export interface TableColumnIdentity {
    /**
     * The number to start incrementing at.
     */
    startNum?: pulumi.Input<number>;
    /**
     * Step size to increment by.
     */
    stepNum?: pulumi.Input<number>;
}

export interface TableConstraintForeignKeyProperties {
    /**
     * The match type for the foreign key. Not applicable for primary/unique keys
     */
    match?: pulumi.Input<string>;
    /**
     * Specifies the action performed when the primary/unique key for the foreign key is deleted. Not applicable for primary/unique keys
     */
    onDelete?: pulumi.Input<string>;
    /**
     * Specifies the action performed when the primary/unique key for the foreign key is updated. Not applicable for primary/unique keys
     */
    onUpdate?: pulumi.Input<string>;
    /**
     * The table and columns that the foreign key references.
     */
    references: pulumi.Input<inputs.TableConstraintForeignKeyPropertiesReferences>;
}

export interface TableConstraintForeignKeyPropertiesReferences {
    /**
     * Columns to use in foreign key reference
     */
    columns: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Name of constraint
     */
    tableId: pulumi.Input<string>;
}

export interface TablePrimaryKey {
    /**
     * Columns to use in primary key
     */
    keys: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Name of constraint
     */
    name?: pulumi.Input<string>;
}

export interface TableTag {
    /**
     * Name of the database that the tag was created in.
     */
    database?: pulumi.Input<string>;
    /**
     * Tag name, e.g. department.
     */
    name: pulumi.Input<string>;
    /**
     * Name of the schema that the tag was created in.
     */
    schema?: pulumi.Input<string>;
    /**
     * Tag value, e.g. marketing_info.
     */
    value: pulumi.Input<string>;
}

export interface TagAssociationObjectIdentifier {
    /**
     * Name of the database that the object was created in.
     */
    database?: pulumi.Input<string>;
    /**
     * Name of the object to associate the tag with.
     */
    name: pulumi.Input<string>;
    /**
     * Name of the schema that the object was created in.
     */
    schema?: pulumi.Input<string>;
}

export interface ViewTag {
    /**
     * Name of the database that the tag was created in.
     */
    database?: pulumi.Input<string>;
    /**
     * Tag name, e.g. department.
     */
    name: pulumi.Input<string>;
    /**
     * Name of the schema that the tag was created in.
     */
    schema?: pulumi.Input<string>;
    /**
     * Tag value, e.g. marketing_info.
     */
    value: pulumi.Input<string>;
}
export namespace config {
}
