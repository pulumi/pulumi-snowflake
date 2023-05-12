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
    expression: pulumi.Input<string>;
    timeZone: pulumi.Input<string>;
}

export interface DatabaseReplicationConfiguration {
    accounts: pulumi.Input<pulumi.Input<string>[]>;
    ignoreEditionCheck?: pulumi.Input<boolean>;
}

export interface DatabaseTag {
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
    expression: pulumi.Input<string>;
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

export interface GetGrantsFutureGrantsIn {
    /**
     * Lists all privileges on new (i.e. future) objects of a specified type in the database granted to a role.
     */
    database?: string;
    /**
     * Lists all privileges on new (i.e. future) objects of a specified type in the schema granted to a role.
     */
    schema?: inputs.GetGrantsFutureGrantsInSchema;
}

export interface GetGrantsFutureGrantsInArgs {
    /**
     * Lists all privileges on new (i.e. future) objects of a specified type in the database granted to a role.
     */
    database?: pulumi.Input<string>;
    /**
     * Lists all privileges on new (i.e. future) objects of a specified type in the schema granted to a role.
     */
    schema?: pulumi.Input<inputs.GetGrantsFutureGrantsInSchemaArgs>;
}

export interface GetGrantsFutureGrantsInSchema {
    databaseName?: string;
    schemaName: string;
}

export interface GetGrantsFutureGrantsInSchemaArgs {
    databaseName?: pulumi.Input<string>;
    schemaName: pulumi.Input<string>;
}

export interface GetGrantsFutureGrantsTo {
    /**
     * Lists all privileges on new (i.e. future) objects of a specified type in a database or schema granted to the role.
     */
    role: string;
}

export interface GetGrantsFutureGrantsToArgs {
    /**
     * Lists all privileges on new (i.e. future) objects of a specified type in a database or schema granted to the role.
     */
    role: pulumi.Input<string>;
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

export interface GetGrantsGrantsOfArgs {
    /**
     * Lists all users and roles to which the role has been granted
     */
    role?: pulumi.Input<string>;
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
     * Name of object to list privileges on
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
     * Name of object to list privileges on
     */
    objectName?: pulumi.Input<string>;
    /**
     * Type of object to list privileges on.
     */
    objectType?: pulumi.Input<string>;
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

export interface GetGrantsGrantsToArgs {
    /**
     * Lists all privileges and roles granted to the role
     */
    role?: pulumi.Input<string>;
    /**
     * Lists all the privileges granted to the share
     */
    share?: pulumi.Input<string>;
    /**
     * Lists all the roles granted to the user. Note that the PUBLIC role, which is automatically available to every user, is not listed
     */
    user?: pulumi.Input<string>;
}

export interface MaskingPolicySignature {
    columns: pulumi.Input<pulumi.Input<inputs.MaskingPolicySignatureColumn>[]>;
}

export interface MaskingPolicySignatureColumn {
    /**
     * Specifies the identifier for the masking policy; must be unique for the database and schema in which the masking policy is created.
     */
    name: pulumi.Input<string>;
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
     * Masking policy to apply on column
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
     * Column type, e.g. VARIANT
     */
    type: pulumi.Input<string>;
}

export interface TableColumnDefault {
    constant?: pulumi.Input<string>;
    expression?: pulumi.Input<string>;
    sequence?: pulumi.Input<string>;
}

export interface TableColumnIdentity {
    startNum?: pulumi.Input<number>;
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
     * The table and columns that the foreign key references. Not applicable for primary/unique keys
     */
    references?: pulumi.Input<inputs.TableConstraintForeignKeyPropertiesReferences>;
}

export interface TableConstraintForeignKeyPropertiesReferences {
    /**
     * Columns to use in constraint key
     */
    columns: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Idenfifier for table to create constraint on. Must be of the form Note: format must follow: "\n\n"."\n\n"."\n\n" or "\n\n.\n\n.\n\n" or "\n\n|\n\n.\n\n" (snowflake*table.my*table.id)
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

export interface UserTag {
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

export interface WarehouseTag {
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
