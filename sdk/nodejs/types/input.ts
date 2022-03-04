// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";

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

export interface FunctionGrantArgument {
    /**
     * The argument name
     */
    name: pulumi.Input<string>;
    /**
     * The argument type
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

export interface ProcedureGrantArgument {
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

