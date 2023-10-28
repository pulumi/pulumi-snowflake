# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['TableArgs', 'Table']

@pulumi.input_type
class TableArgs:
    def __init__(__self__, *,
                 columns: pulumi.Input[Sequence[pulumi.Input['TableColumnArgs']]],
                 database: pulumi.Input[str],
                 schema: pulumi.Input[str],
                 change_tracking: Optional[pulumi.Input[bool]] = None,
                 cluster_bies: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 data_retention_days: Optional[pulumi.Input[int]] = None,
                 data_retention_time_in_days: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 primary_key: Optional[pulumi.Input['TablePrimaryKeyArgs']] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input['TableTagArgs']]]] = None):
        """
        The set of arguments for constructing a Table resource.
        :param pulumi.Input[Sequence[pulumi.Input['TableColumnArgs']]] columns: Definitions of a column to create in the table. Minimum one required.
        :param pulumi.Input[str] database: Name of the database that the tag was created in.
        :param pulumi.Input[str] schema: Name of the schema that the tag was created in.
        :param pulumi.Input[bool] change_tracking: Specifies whether to enable change tracking on the table. Default false.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] cluster_bies: A list of one or more table columns/expressions to be used as clustering key(s) for the table
        :param pulumi.Input[str] comment: Column comment
        :param pulumi.Input[int] data_retention_days: Specifies the retention period for the table so that Time Travel actions (SELECT, CLONE, UNDROP) can be performed on historical data in the table. Default value is 1, if you wish to inherit the parent schema setting then pass in the schema attribute to this argument.
        :param pulumi.Input[int] data_retention_time_in_days: Specifies the retention period for the table so that Time Travel actions (SELECT, CLONE, UNDROP) can be performed on historical data in the table. Default value is 1, if you wish to inherit the parent schema setting then pass in the schema attribute to this argument.
        :param pulumi.Input[str] name: Column name
        :param pulumi.Input['TablePrimaryKeyArgs'] primary_key: Definitions of primary key constraint to create on table
        :param pulumi.Input[Sequence[pulumi.Input['TableTagArgs']]] tags: Definitions of a tag to associate with the resource.
        """
        pulumi.set(__self__, "columns", columns)
        pulumi.set(__self__, "database", database)
        pulumi.set(__self__, "schema", schema)
        if change_tracking is not None:
            pulumi.set(__self__, "change_tracking", change_tracking)
        if cluster_bies is not None:
            pulumi.set(__self__, "cluster_bies", cluster_bies)
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if data_retention_days is not None:
            warnings.warn("""Use data_retention_time_in_days attribute instead""", DeprecationWarning)
            pulumi.log.warn("""data_retention_days is deprecated: Use data_retention_time_in_days attribute instead""")
        if data_retention_days is not None:
            pulumi.set(__self__, "data_retention_days", data_retention_days)
        if data_retention_time_in_days is not None:
            warnings.warn("""Use snowflake_object_parameter instead""", DeprecationWarning)
            pulumi.log.warn("""data_retention_time_in_days is deprecated: Use snowflake_object_parameter instead""")
        if data_retention_time_in_days is not None:
            pulumi.set(__self__, "data_retention_time_in_days", data_retention_time_in_days)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if primary_key is not None:
            warnings.warn("""Use snowflake_table_constraint instead""", DeprecationWarning)
            pulumi.log.warn("""primary_key is deprecated: Use snowflake_table_constraint instead""")
        if primary_key is not None:
            pulumi.set(__self__, "primary_key", primary_key)
        if tags is not None:
            warnings.warn("""Use the 'snowflake_tag_association' resource instead.""", DeprecationWarning)
            pulumi.log.warn("""tags is deprecated: Use the 'snowflake_tag_association' resource instead.""")
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter
    def columns(self) -> pulumi.Input[Sequence[pulumi.Input['TableColumnArgs']]]:
        """
        Definitions of a column to create in the table. Minimum one required.
        """
        return pulumi.get(self, "columns")

    @columns.setter
    def columns(self, value: pulumi.Input[Sequence[pulumi.Input['TableColumnArgs']]]):
        pulumi.set(self, "columns", value)

    @property
    @pulumi.getter
    def database(self) -> pulumi.Input[str]:
        """
        Name of the database that the tag was created in.
        """
        return pulumi.get(self, "database")

    @database.setter
    def database(self, value: pulumi.Input[str]):
        pulumi.set(self, "database", value)

    @property
    @pulumi.getter
    def schema(self) -> pulumi.Input[str]:
        """
        Name of the schema that the tag was created in.
        """
        return pulumi.get(self, "schema")

    @schema.setter
    def schema(self, value: pulumi.Input[str]):
        pulumi.set(self, "schema", value)

    @property
    @pulumi.getter(name="changeTracking")
    def change_tracking(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether to enable change tracking on the table. Default false.
        """
        return pulumi.get(self, "change_tracking")

    @change_tracking.setter
    def change_tracking(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "change_tracking", value)

    @property
    @pulumi.getter(name="clusterBies")
    def cluster_bies(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        A list of one or more table columns/expressions to be used as clustering key(s) for the table
        """
        return pulumi.get(self, "cluster_bies")

    @cluster_bies.setter
    def cluster_bies(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "cluster_bies", value)

    @property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[str]]:
        """
        Column comment
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "comment", value)

    @property
    @pulumi.getter(name="dataRetentionDays")
    def data_retention_days(self) -> Optional[pulumi.Input[int]]:
        """
        Specifies the retention period for the table so that Time Travel actions (SELECT, CLONE, UNDROP) can be performed on historical data in the table. Default value is 1, if you wish to inherit the parent schema setting then pass in the schema attribute to this argument.
        """
        warnings.warn("""Use data_retention_time_in_days attribute instead""", DeprecationWarning)
        pulumi.log.warn("""data_retention_days is deprecated: Use data_retention_time_in_days attribute instead""")

        return pulumi.get(self, "data_retention_days")

    @data_retention_days.setter
    def data_retention_days(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "data_retention_days", value)

    @property
    @pulumi.getter(name="dataRetentionTimeInDays")
    def data_retention_time_in_days(self) -> Optional[pulumi.Input[int]]:
        """
        Specifies the retention period for the table so that Time Travel actions (SELECT, CLONE, UNDROP) can be performed on historical data in the table. Default value is 1, if you wish to inherit the parent schema setting then pass in the schema attribute to this argument.
        """
        warnings.warn("""Use snowflake_object_parameter instead""", DeprecationWarning)
        pulumi.log.warn("""data_retention_time_in_days is deprecated: Use snowflake_object_parameter instead""")

        return pulumi.get(self, "data_retention_time_in_days")

    @data_retention_time_in_days.setter
    def data_retention_time_in_days(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "data_retention_time_in_days", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Column name
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="primaryKey")
    def primary_key(self) -> Optional[pulumi.Input['TablePrimaryKeyArgs']]:
        """
        Definitions of primary key constraint to create on table
        """
        warnings.warn("""Use snowflake_table_constraint instead""", DeprecationWarning)
        pulumi.log.warn("""primary_key is deprecated: Use snowflake_table_constraint instead""")

        return pulumi.get(self, "primary_key")

    @primary_key.setter
    def primary_key(self, value: Optional[pulumi.Input['TablePrimaryKeyArgs']]):
        pulumi.set(self, "primary_key", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['TableTagArgs']]]]:
        """
        Definitions of a tag to associate with the resource.
        """
        warnings.warn("""Use the 'snowflake_tag_association' resource instead.""", DeprecationWarning)
        pulumi.log.warn("""tags is deprecated: Use the 'snowflake_tag_association' resource instead.""")

        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['TableTagArgs']]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _TableState:
    def __init__(__self__, *,
                 change_tracking: Optional[pulumi.Input[bool]] = None,
                 cluster_bies: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 columns: Optional[pulumi.Input[Sequence[pulumi.Input['TableColumnArgs']]]] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 data_retention_days: Optional[pulumi.Input[int]] = None,
                 data_retention_time_in_days: Optional[pulumi.Input[int]] = None,
                 database: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 owner: Optional[pulumi.Input[str]] = None,
                 primary_key: Optional[pulumi.Input['TablePrimaryKeyArgs']] = None,
                 qualified_name: Optional[pulumi.Input[str]] = None,
                 schema: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input['TableTagArgs']]]] = None):
        """
        Input properties used for looking up and filtering Table resources.
        :param pulumi.Input[bool] change_tracking: Specifies whether to enable change tracking on the table. Default false.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] cluster_bies: A list of one or more table columns/expressions to be used as clustering key(s) for the table
        :param pulumi.Input[Sequence[pulumi.Input['TableColumnArgs']]] columns: Definitions of a column to create in the table. Minimum one required.
        :param pulumi.Input[str] comment: Column comment
        :param pulumi.Input[int] data_retention_days: Specifies the retention period for the table so that Time Travel actions (SELECT, CLONE, UNDROP) can be performed on historical data in the table. Default value is 1, if you wish to inherit the parent schema setting then pass in the schema attribute to this argument.
        :param pulumi.Input[int] data_retention_time_in_days: Specifies the retention period for the table so that Time Travel actions (SELECT, CLONE, UNDROP) can be performed on historical data in the table. Default value is 1, if you wish to inherit the parent schema setting then pass in the schema attribute to this argument.
        :param pulumi.Input[str] database: Name of the database that the tag was created in.
        :param pulumi.Input[str] name: Column name
        :param pulumi.Input[str] owner: Name of the role that owns the table.
        :param pulumi.Input['TablePrimaryKeyArgs'] primary_key: Definitions of primary key constraint to create on table
        :param pulumi.Input[str] qualified_name: Qualified name of the table.
        :param pulumi.Input[str] schema: Name of the schema that the tag was created in.
        :param pulumi.Input[Sequence[pulumi.Input['TableTagArgs']]] tags: Definitions of a tag to associate with the resource.
        """
        if change_tracking is not None:
            pulumi.set(__self__, "change_tracking", change_tracking)
        if cluster_bies is not None:
            pulumi.set(__self__, "cluster_bies", cluster_bies)
        if columns is not None:
            pulumi.set(__self__, "columns", columns)
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if data_retention_days is not None:
            warnings.warn("""Use data_retention_time_in_days attribute instead""", DeprecationWarning)
            pulumi.log.warn("""data_retention_days is deprecated: Use data_retention_time_in_days attribute instead""")
        if data_retention_days is not None:
            pulumi.set(__self__, "data_retention_days", data_retention_days)
        if data_retention_time_in_days is not None:
            warnings.warn("""Use snowflake_object_parameter instead""", DeprecationWarning)
            pulumi.log.warn("""data_retention_time_in_days is deprecated: Use snowflake_object_parameter instead""")
        if data_retention_time_in_days is not None:
            pulumi.set(__self__, "data_retention_time_in_days", data_retention_time_in_days)
        if database is not None:
            pulumi.set(__self__, "database", database)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if owner is not None:
            pulumi.set(__self__, "owner", owner)
        if primary_key is not None:
            warnings.warn("""Use snowflake_table_constraint instead""", DeprecationWarning)
            pulumi.log.warn("""primary_key is deprecated: Use snowflake_table_constraint instead""")
        if primary_key is not None:
            pulumi.set(__self__, "primary_key", primary_key)
        if qualified_name is not None:
            pulumi.set(__self__, "qualified_name", qualified_name)
        if schema is not None:
            pulumi.set(__self__, "schema", schema)
        if tags is not None:
            warnings.warn("""Use the 'snowflake_tag_association' resource instead.""", DeprecationWarning)
            pulumi.log.warn("""tags is deprecated: Use the 'snowflake_tag_association' resource instead.""")
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="changeTracking")
    def change_tracking(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether to enable change tracking on the table. Default false.
        """
        return pulumi.get(self, "change_tracking")

    @change_tracking.setter
    def change_tracking(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "change_tracking", value)

    @property
    @pulumi.getter(name="clusterBies")
    def cluster_bies(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        A list of one or more table columns/expressions to be used as clustering key(s) for the table
        """
        return pulumi.get(self, "cluster_bies")

    @cluster_bies.setter
    def cluster_bies(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "cluster_bies", value)

    @property
    @pulumi.getter
    def columns(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['TableColumnArgs']]]]:
        """
        Definitions of a column to create in the table. Minimum one required.
        """
        return pulumi.get(self, "columns")

    @columns.setter
    def columns(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['TableColumnArgs']]]]):
        pulumi.set(self, "columns", value)

    @property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[str]]:
        """
        Column comment
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "comment", value)

    @property
    @pulumi.getter(name="dataRetentionDays")
    def data_retention_days(self) -> Optional[pulumi.Input[int]]:
        """
        Specifies the retention period for the table so that Time Travel actions (SELECT, CLONE, UNDROP) can be performed on historical data in the table. Default value is 1, if you wish to inherit the parent schema setting then pass in the schema attribute to this argument.
        """
        warnings.warn("""Use data_retention_time_in_days attribute instead""", DeprecationWarning)
        pulumi.log.warn("""data_retention_days is deprecated: Use data_retention_time_in_days attribute instead""")

        return pulumi.get(self, "data_retention_days")

    @data_retention_days.setter
    def data_retention_days(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "data_retention_days", value)

    @property
    @pulumi.getter(name="dataRetentionTimeInDays")
    def data_retention_time_in_days(self) -> Optional[pulumi.Input[int]]:
        """
        Specifies the retention period for the table so that Time Travel actions (SELECT, CLONE, UNDROP) can be performed on historical data in the table. Default value is 1, if you wish to inherit the parent schema setting then pass in the schema attribute to this argument.
        """
        warnings.warn("""Use snowflake_object_parameter instead""", DeprecationWarning)
        pulumi.log.warn("""data_retention_time_in_days is deprecated: Use snowflake_object_parameter instead""")

        return pulumi.get(self, "data_retention_time_in_days")

    @data_retention_time_in_days.setter
    def data_retention_time_in_days(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "data_retention_time_in_days", value)

    @property
    @pulumi.getter
    def database(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the database that the tag was created in.
        """
        return pulumi.get(self, "database")

    @database.setter
    def database(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "database", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Column name
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def owner(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the role that owns the table.
        """
        return pulumi.get(self, "owner")

    @owner.setter
    def owner(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "owner", value)

    @property
    @pulumi.getter(name="primaryKey")
    def primary_key(self) -> Optional[pulumi.Input['TablePrimaryKeyArgs']]:
        """
        Definitions of primary key constraint to create on table
        """
        warnings.warn("""Use snowflake_table_constraint instead""", DeprecationWarning)
        pulumi.log.warn("""primary_key is deprecated: Use snowflake_table_constraint instead""")

        return pulumi.get(self, "primary_key")

    @primary_key.setter
    def primary_key(self, value: Optional[pulumi.Input['TablePrimaryKeyArgs']]):
        pulumi.set(self, "primary_key", value)

    @property
    @pulumi.getter(name="qualifiedName")
    def qualified_name(self) -> Optional[pulumi.Input[str]]:
        """
        Qualified name of the table.
        """
        return pulumi.get(self, "qualified_name")

    @qualified_name.setter
    def qualified_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "qualified_name", value)

    @property
    @pulumi.getter
    def schema(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the schema that the tag was created in.
        """
        return pulumi.get(self, "schema")

    @schema.setter
    def schema(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "schema", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['TableTagArgs']]]]:
        """
        Definitions of a tag to associate with the resource.
        """
        warnings.warn("""Use the 'snowflake_tag_association' resource instead.""", DeprecationWarning)
        pulumi.log.warn("""tags is deprecated: Use the 'snowflake_tag_association' resource instead.""")

        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['TableTagArgs']]]]):
        pulumi.set(self, "tags", value)


class Table(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 change_tracking: Optional[pulumi.Input[bool]] = None,
                 cluster_bies: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 columns: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['TableColumnArgs']]]]] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 data_retention_days: Optional[pulumi.Input[int]] = None,
                 data_retention_time_in_days: Optional[pulumi.Input[int]] = None,
                 database: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 primary_key: Optional[pulumi.Input[pulumi.InputType['TablePrimaryKeyArgs']]] = None,
                 schema: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['TableTagArgs']]]]] = None,
                 __props__=None):
        """
        ## Import

        format is database name | schema name | table name

        ```sh
         $ pulumi import snowflake:index/table:Table example 'databaseName|schemaName|tableName'
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] change_tracking: Specifies whether to enable change tracking on the table. Default false.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] cluster_bies: A list of one or more table columns/expressions to be used as clustering key(s) for the table
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['TableColumnArgs']]]] columns: Definitions of a column to create in the table. Minimum one required.
        :param pulumi.Input[str] comment: Column comment
        :param pulumi.Input[int] data_retention_days: Specifies the retention period for the table so that Time Travel actions (SELECT, CLONE, UNDROP) can be performed on historical data in the table. Default value is 1, if you wish to inherit the parent schema setting then pass in the schema attribute to this argument.
        :param pulumi.Input[int] data_retention_time_in_days: Specifies the retention period for the table so that Time Travel actions (SELECT, CLONE, UNDROP) can be performed on historical data in the table. Default value is 1, if you wish to inherit the parent schema setting then pass in the schema attribute to this argument.
        :param pulumi.Input[str] database: Name of the database that the tag was created in.
        :param pulumi.Input[str] name: Column name
        :param pulumi.Input[pulumi.InputType['TablePrimaryKeyArgs']] primary_key: Definitions of primary key constraint to create on table
        :param pulumi.Input[str] schema: Name of the schema that the tag was created in.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['TableTagArgs']]]] tags: Definitions of a tag to associate with the resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: TableArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Import

        format is database name | schema name | table name

        ```sh
         $ pulumi import snowflake:index/table:Table example 'databaseName|schemaName|tableName'
        ```

        :param str resource_name: The name of the resource.
        :param TableArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(TableArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 change_tracking: Optional[pulumi.Input[bool]] = None,
                 cluster_bies: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 columns: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['TableColumnArgs']]]]] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 data_retention_days: Optional[pulumi.Input[int]] = None,
                 data_retention_time_in_days: Optional[pulumi.Input[int]] = None,
                 database: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 primary_key: Optional[pulumi.Input[pulumi.InputType['TablePrimaryKeyArgs']]] = None,
                 schema: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['TableTagArgs']]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = TableArgs.__new__(TableArgs)

            __props__.__dict__["change_tracking"] = change_tracking
            __props__.__dict__["cluster_bies"] = cluster_bies
            if columns is None and not opts.urn:
                raise TypeError("Missing required property 'columns'")
            __props__.__dict__["columns"] = columns
            __props__.__dict__["comment"] = comment
            __props__.__dict__["data_retention_days"] = data_retention_days
            __props__.__dict__["data_retention_time_in_days"] = data_retention_time_in_days
            if database is None and not opts.urn:
                raise TypeError("Missing required property 'database'")
            __props__.__dict__["database"] = database
            __props__.__dict__["name"] = name
            __props__.__dict__["primary_key"] = primary_key
            if schema is None and not opts.urn:
                raise TypeError("Missing required property 'schema'")
            __props__.__dict__["schema"] = schema
            __props__.__dict__["tags"] = tags
            __props__.__dict__["owner"] = None
            __props__.__dict__["qualified_name"] = None
        super(Table, __self__).__init__(
            'snowflake:index/table:Table',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            change_tracking: Optional[pulumi.Input[bool]] = None,
            cluster_bies: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            columns: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['TableColumnArgs']]]]] = None,
            comment: Optional[pulumi.Input[str]] = None,
            data_retention_days: Optional[pulumi.Input[int]] = None,
            data_retention_time_in_days: Optional[pulumi.Input[int]] = None,
            database: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            owner: Optional[pulumi.Input[str]] = None,
            primary_key: Optional[pulumi.Input[pulumi.InputType['TablePrimaryKeyArgs']]] = None,
            qualified_name: Optional[pulumi.Input[str]] = None,
            schema: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['TableTagArgs']]]]] = None) -> 'Table':
        """
        Get an existing Table resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] change_tracking: Specifies whether to enable change tracking on the table. Default false.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] cluster_bies: A list of one or more table columns/expressions to be used as clustering key(s) for the table
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['TableColumnArgs']]]] columns: Definitions of a column to create in the table. Minimum one required.
        :param pulumi.Input[str] comment: Column comment
        :param pulumi.Input[int] data_retention_days: Specifies the retention period for the table so that Time Travel actions (SELECT, CLONE, UNDROP) can be performed on historical data in the table. Default value is 1, if you wish to inherit the parent schema setting then pass in the schema attribute to this argument.
        :param pulumi.Input[int] data_retention_time_in_days: Specifies the retention period for the table so that Time Travel actions (SELECT, CLONE, UNDROP) can be performed on historical data in the table. Default value is 1, if you wish to inherit the parent schema setting then pass in the schema attribute to this argument.
        :param pulumi.Input[str] database: Name of the database that the tag was created in.
        :param pulumi.Input[str] name: Column name
        :param pulumi.Input[str] owner: Name of the role that owns the table.
        :param pulumi.Input[pulumi.InputType['TablePrimaryKeyArgs']] primary_key: Definitions of primary key constraint to create on table
        :param pulumi.Input[str] qualified_name: Qualified name of the table.
        :param pulumi.Input[str] schema: Name of the schema that the tag was created in.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['TableTagArgs']]]] tags: Definitions of a tag to associate with the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _TableState.__new__(_TableState)

        __props__.__dict__["change_tracking"] = change_tracking
        __props__.__dict__["cluster_bies"] = cluster_bies
        __props__.__dict__["columns"] = columns
        __props__.__dict__["comment"] = comment
        __props__.__dict__["data_retention_days"] = data_retention_days
        __props__.__dict__["data_retention_time_in_days"] = data_retention_time_in_days
        __props__.__dict__["database"] = database
        __props__.__dict__["name"] = name
        __props__.__dict__["owner"] = owner
        __props__.__dict__["primary_key"] = primary_key
        __props__.__dict__["qualified_name"] = qualified_name
        __props__.__dict__["schema"] = schema
        __props__.__dict__["tags"] = tags
        return Table(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="changeTracking")
    def change_tracking(self) -> pulumi.Output[Optional[bool]]:
        """
        Specifies whether to enable change tracking on the table. Default false.
        """
        return pulumi.get(self, "change_tracking")

    @property
    @pulumi.getter(name="clusterBies")
    def cluster_bies(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        A list of one or more table columns/expressions to be used as clustering key(s) for the table
        """
        return pulumi.get(self, "cluster_bies")

    @property
    @pulumi.getter
    def columns(self) -> pulumi.Output[Sequence['outputs.TableColumn']]:
        """
        Definitions of a column to create in the table. Minimum one required.
        """
        return pulumi.get(self, "columns")

    @property
    @pulumi.getter
    def comment(self) -> pulumi.Output[Optional[str]]:
        """
        Column comment
        """
        return pulumi.get(self, "comment")

    @property
    @pulumi.getter(name="dataRetentionDays")
    def data_retention_days(self) -> pulumi.Output[Optional[int]]:
        """
        Specifies the retention period for the table so that Time Travel actions (SELECT, CLONE, UNDROP) can be performed on historical data in the table. Default value is 1, if you wish to inherit the parent schema setting then pass in the schema attribute to this argument.
        """
        warnings.warn("""Use data_retention_time_in_days attribute instead""", DeprecationWarning)
        pulumi.log.warn("""data_retention_days is deprecated: Use data_retention_time_in_days attribute instead""")

        return pulumi.get(self, "data_retention_days")

    @property
    @pulumi.getter(name="dataRetentionTimeInDays")
    def data_retention_time_in_days(self) -> pulumi.Output[Optional[int]]:
        """
        Specifies the retention period for the table so that Time Travel actions (SELECT, CLONE, UNDROP) can be performed on historical data in the table. Default value is 1, if you wish to inherit the parent schema setting then pass in the schema attribute to this argument.
        """
        warnings.warn("""Use snowflake_object_parameter instead""", DeprecationWarning)
        pulumi.log.warn("""data_retention_time_in_days is deprecated: Use snowflake_object_parameter instead""")

        return pulumi.get(self, "data_retention_time_in_days")

    @property
    @pulumi.getter
    def database(self) -> pulumi.Output[str]:
        """
        Name of the database that the tag was created in.
        """
        return pulumi.get(self, "database")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Column name
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def owner(self) -> pulumi.Output[str]:
        """
        Name of the role that owns the table.
        """
        return pulumi.get(self, "owner")

    @property
    @pulumi.getter(name="primaryKey")
    def primary_key(self) -> pulumi.Output[Optional['outputs.TablePrimaryKey']]:
        """
        Definitions of primary key constraint to create on table
        """
        warnings.warn("""Use snowflake_table_constraint instead""", DeprecationWarning)
        pulumi.log.warn("""primary_key is deprecated: Use snowflake_table_constraint instead""")

        return pulumi.get(self, "primary_key")

    @property
    @pulumi.getter(name="qualifiedName")
    def qualified_name(self) -> pulumi.Output[str]:
        """
        Qualified name of the table.
        """
        return pulumi.get(self, "qualified_name")

    @property
    @pulumi.getter
    def schema(self) -> pulumi.Output[str]:
        """
        Name of the schema that the tag was created in.
        """
        return pulumi.get(self, "schema")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Sequence['outputs.TableTag']]]:
        """
        Definitions of a tag to associate with the resource.
        """
        warnings.warn("""Use the 'snowflake_tag_association' resource instead.""", DeprecationWarning)
        pulumi.log.warn("""tags is deprecated: Use the 'snowflake_tag_association' resource instead.""")

        return pulumi.get(self, "tags")

