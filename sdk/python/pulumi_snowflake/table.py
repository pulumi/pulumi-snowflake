# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins
import copy
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['TableArgs', 'Table']

@pulumi.input_type
class TableArgs:
    def __init__(__self__, *,
                 columns: pulumi.Input[Sequence[pulumi.Input['TableColumnArgs']]],
                 database: pulumi.Input[builtins.str],
                 schema: pulumi.Input[builtins.str],
                 change_tracking: Optional[pulumi.Input[builtins.bool]] = None,
                 cluster_bies: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]] = None,
                 comment: Optional[pulumi.Input[builtins.str]] = None,
                 data_retention_time_in_days: Optional[pulumi.Input[builtins.int]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 primary_key: Optional[pulumi.Input['TablePrimaryKeyArgs']] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input['TableTagArgs']]]] = None):
        """
        The set of arguments for constructing a Table resource.
        :param pulumi.Input[Sequence[pulumi.Input['TableColumnArgs']]] columns: Definitions of a column to create in the table. Minimum one required.
        :param pulumi.Input[builtins.str] database: The database in which to create the table.
        :param pulumi.Input[builtins.str] schema: The schema in which to create the table.
        :param pulumi.Input[builtins.bool] change_tracking: (Default: `false`) Specifies whether to enable change tracking on the table. Default false.
        :param pulumi.Input[Sequence[pulumi.Input[builtins.str]]] cluster_bies: A list of one or more table columns/expressions to be used as clustering key(s) for the table
        :param pulumi.Input[builtins.str] comment: Specifies a comment for the table.
        :param pulumi.Input[builtins.int] data_retention_time_in_days: (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`-1`)) Specifies the retention period for the table so that Time Travel actions (SELECT, CLONE, UNDROP) can be performed on historical data in the table. If you wish to inherit the parent schema setting then pass in the schema attribute to this argument or do not fill this parameter at all; the default value for this field is -1, which is a fallback to use Snowflake default - in this case the schema value
        :param pulumi.Input[builtins.str] name: Specifies the identifier for the table; must be unique for the database and schema in which the table is created.
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
        if data_retention_time_in_days is not None:
            pulumi.set(__self__, "data_retention_time_in_days", data_retention_time_in_days)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if primary_key is not None:
            warnings.warn("""Use TableConstraint instead""", DeprecationWarning)
            pulumi.log.warn("""primary_key is deprecated: Use TableConstraint instead""")
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
    def database(self) -> pulumi.Input[builtins.str]:
        """
        The database in which to create the table.
        """
        return pulumi.get(self, "database")

    @database.setter
    def database(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "database", value)

    @property
    @pulumi.getter
    def schema(self) -> pulumi.Input[builtins.str]:
        """
        The schema in which to create the table.
        """
        return pulumi.get(self, "schema")

    @schema.setter
    def schema(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "schema", value)

    @property
    @pulumi.getter(name="changeTracking")
    def change_tracking(self) -> Optional[pulumi.Input[builtins.bool]]:
        """
        (Default: `false`) Specifies whether to enable change tracking on the table. Default false.
        """
        return pulumi.get(self, "change_tracking")

    @change_tracking.setter
    def change_tracking(self, value: Optional[pulumi.Input[builtins.bool]]):
        pulumi.set(self, "change_tracking", value)

    @property
    @pulumi.getter(name="clusterBies")
    def cluster_bies(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]]:
        """
        A list of one or more table columns/expressions to be used as clustering key(s) for the table
        """
        return pulumi.get(self, "cluster_bies")

    @cluster_bies.setter
    def cluster_bies(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]]):
        pulumi.set(self, "cluster_bies", value)

    @property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Specifies a comment for the table.
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "comment", value)

    @property
    @pulumi.getter(name="dataRetentionTimeInDays")
    def data_retention_time_in_days(self) -> Optional[pulumi.Input[builtins.int]]:
        """
        (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`-1`)) Specifies the retention period for the table so that Time Travel actions (SELECT, CLONE, UNDROP) can be performed on historical data in the table. If you wish to inherit the parent schema setting then pass in the schema attribute to this argument or do not fill this parameter at all; the default value for this field is -1, which is a fallback to use Snowflake default - in this case the schema value
        """
        return pulumi.get(self, "data_retention_time_in_days")

    @data_retention_time_in_days.setter
    def data_retention_time_in_days(self, value: Optional[pulumi.Input[builtins.int]]):
        pulumi.set(self, "data_retention_time_in_days", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Specifies the identifier for the table; must be unique for the database and schema in which the table is created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="primaryKey")
    @_utilities.deprecated("""Use TableConstraint instead""")
    def primary_key(self) -> Optional[pulumi.Input['TablePrimaryKeyArgs']]:
        """
        Definitions of primary key constraint to create on table
        """
        return pulumi.get(self, "primary_key")

    @primary_key.setter
    def primary_key(self, value: Optional[pulumi.Input['TablePrimaryKeyArgs']]):
        pulumi.set(self, "primary_key", value)

    @property
    @pulumi.getter
    @_utilities.deprecated("""Use the 'snowflake_tag_association' resource instead.""")
    def tags(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['TableTagArgs']]]]:
        """
        Definitions of a tag to associate with the resource.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['TableTagArgs']]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _TableState:
    def __init__(__self__, *,
                 change_tracking: Optional[pulumi.Input[builtins.bool]] = None,
                 cluster_bies: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]] = None,
                 columns: Optional[pulumi.Input[Sequence[pulumi.Input['TableColumnArgs']]]] = None,
                 comment: Optional[pulumi.Input[builtins.str]] = None,
                 data_retention_time_in_days: Optional[pulumi.Input[builtins.int]] = None,
                 database: Optional[pulumi.Input[builtins.str]] = None,
                 fully_qualified_name: Optional[pulumi.Input[builtins.str]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 owner: Optional[pulumi.Input[builtins.str]] = None,
                 primary_key: Optional[pulumi.Input['TablePrimaryKeyArgs']] = None,
                 schema: Optional[pulumi.Input[builtins.str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input['TableTagArgs']]]] = None):
        """
        Input properties used for looking up and filtering Table resources.
        :param pulumi.Input[builtins.bool] change_tracking: (Default: `false`) Specifies whether to enable change tracking on the table. Default false.
        :param pulumi.Input[Sequence[pulumi.Input[builtins.str]]] cluster_bies: A list of one or more table columns/expressions to be used as clustering key(s) for the table
        :param pulumi.Input[Sequence[pulumi.Input['TableColumnArgs']]] columns: Definitions of a column to create in the table. Minimum one required.
        :param pulumi.Input[builtins.str] comment: Specifies a comment for the table.
        :param pulumi.Input[builtins.int] data_retention_time_in_days: (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`-1`)) Specifies the retention period for the table so that Time Travel actions (SELECT, CLONE, UNDROP) can be performed on historical data in the table. If you wish to inherit the parent schema setting then pass in the schema attribute to this argument or do not fill this parameter at all; the default value for this field is -1, which is a fallback to use Snowflake default - in this case the schema value
        :param pulumi.Input[builtins.str] database: The database in which to create the table.
        :param pulumi.Input[builtins.str] fully_qualified_name: Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        :param pulumi.Input[builtins.str] name: Specifies the identifier for the table; must be unique for the database and schema in which the table is created.
        :param pulumi.Input[builtins.str] owner: Name of the role that owns the table.
        :param pulumi.Input['TablePrimaryKeyArgs'] primary_key: Definitions of primary key constraint to create on table
        :param pulumi.Input[builtins.str] schema: The schema in which to create the table.
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
        if data_retention_time_in_days is not None:
            pulumi.set(__self__, "data_retention_time_in_days", data_retention_time_in_days)
        if database is not None:
            pulumi.set(__self__, "database", database)
        if fully_qualified_name is not None:
            pulumi.set(__self__, "fully_qualified_name", fully_qualified_name)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if owner is not None:
            pulumi.set(__self__, "owner", owner)
        if primary_key is not None:
            warnings.warn("""Use TableConstraint instead""", DeprecationWarning)
            pulumi.log.warn("""primary_key is deprecated: Use TableConstraint instead""")
        if primary_key is not None:
            pulumi.set(__self__, "primary_key", primary_key)
        if schema is not None:
            pulumi.set(__self__, "schema", schema)
        if tags is not None:
            warnings.warn("""Use the 'snowflake_tag_association' resource instead.""", DeprecationWarning)
            pulumi.log.warn("""tags is deprecated: Use the 'snowflake_tag_association' resource instead.""")
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="changeTracking")
    def change_tracking(self) -> Optional[pulumi.Input[builtins.bool]]:
        """
        (Default: `false`) Specifies whether to enable change tracking on the table. Default false.
        """
        return pulumi.get(self, "change_tracking")

    @change_tracking.setter
    def change_tracking(self, value: Optional[pulumi.Input[builtins.bool]]):
        pulumi.set(self, "change_tracking", value)

    @property
    @pulumi.getter(name="clusterBies")
    def cluster_bies(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]]:
        """
        A list of one or more table columns/expressions to be used as clustering key(s) for the table
        """
        return pulumi.get(self, "cluster_bies")

    @cluster_bies.setter
    def cluster_bies(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]]):
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
    def comment(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Specifies a comment for the table.
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "comment", value)

    @property
    @pulumi.getter(name="dataRetentionTimeInDays")
    def data_retention_time_in_days(self) -> Optional[pulumi.Input[builtins.int]]:
        """
        (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`-1`)) Specifies the retention period for the table so that Time Travel actions (SELECT, CLONE, UNDROP) can be performed on historical data in the table. If you wish to inherit the parent schema setting then pass in the schema attribute to this argument or do not fill this parameter at all; the default value for this field is -1, which is a fallback to use Snowflake default - in this case the schema value
        """
        return pulumi.get(self, "data_retention_time_in_days")

    @data_retention_time_in_days.setter
    def data_retention_time_in_days(self, value: Optional[pulumi.Input[builtins.int]]):
        pulumi.set(self, "data_retention_time_in_days", value)

    @property
    @pulumi.getter
    def database(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The database in which to create the table.
        """
        return pulumi.get(self, "database")

    @database.setter
    def database(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "database", value)

    @property
    @pulumi.getter(name="fullyQualifiedName")
    def fully_qualified_name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        """
        return pulumi.get(self, "fully_qualified_name")

    @fully_qualified_name.setter
    def fully_qualified_name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "fully_qualified_name", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Specifies the identifier for the table; must be unique for the database and schema in which the table is created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def owner(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Name of the role that owns the table.
        """
        return pulumi.get(self, "owner")

    @owner.setter
    def owner(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "owner", value)

    @property
    @pulumi.getter(name="primaryKey")
    @_utilities.deprecated("""Use TableConstraint instead""")
    def primary_key(self) -> Optional[pulumi.Input['TablePrimaryKeyArgs']]:
        """
        Definitions of primary key constraint to create on table
        """
        return pulumi.get(self, "primary_key")

    @primary_key.setter
    def primary_key(self, value: Optional[pulumi.Input['TablePrimaryKeyArgs']]):
        pulumi.set(self, "primary_key", value)

    @property
    @pulumi.getter
    def schema(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The schema in which to create the table.
        """
        return pulumi.get(self, "schema")

    @schema.setter
    def schema(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "schema", value)

    @property
    @pulumi.getter
    @_utilities.deprecated("""Use the 'snowflake_tag_association' resource instead.""")
    def tags(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['TableTagArgs']]]]:
        """
        Definitions of a tag to associate with the resource.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['TableTagArgs']]]]):
        pulumi.set(self, "tags", value)


class Table(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 change_tracking: Optional[pulumi.Input[builtins.bool]] = None,
                 cluster_bies: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]] = None,
                 columns: Optional[pulumi.Input[Sequence[pulumi.Input[Union['TableColumnArgs', 'TableColumnArgsDict']]]]] = None,
                 comment: Optional[pulumi.Input[builtins.str]] = None,
                 data_retention_time_in_days: Optional[pulumi.Input[builtins.int]] = None,
                 database: Optional[pulumi.Input[builtins.str]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 primary_key: Optional[pulumi.Input[Union['TablePrimaryKeyArgs', 'TablePrimaryKeyArgsDict']]] = None,
                 schema: Optional[pulumi.Input[builtins.str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[Union['TableTagArgs', 'TableTagArgsDict']]]]] = None,
                 __props__=None):
        """
        ## Import

        format is database name | schema name | table name

        ```sh
        $ pulumi import snowflake:index/table:Table example 'databaseName|schemaName|tableName'
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.bool] change_tracking: (Default: `false`) Specifies whether to enable change tracking on the table. Default false.
        :param pulumi.Input[Sequence[pulumi.Input[builtins.str]]] cluster_bies: A list of one or more table columns/expressions to be used as clustering key(s) for the table
        :param pulumi.Input[Sequence[pulumi.Input[Union['TableColumnArgs', 'TableColumnArgsDict']]]] columns: Definitions of a column to create in the table. Minimum one required.
        :param pulumi.Input[builtins.str] comment: Specifies a comment for the table.
        :param pulumi.Input[builtins.int] data_retention_time_in_days: (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`-1`)) Specifies the retention period for the table so that Time Travel actions (SELECT, CLONE, UNDROP) can be performed on historical data in the table. If you wish to inherit the parent schema setting then pass in the schema attribute to this argument or do not fill this parameter at all; the default value for this field is -1, which is a fallback to use Snowflake default - in this case the schema value
        :param pulumi.Input[builtins.str] database: The database in which to create the table.
        :param pulumi.Input[builtins.str] name: Specifies the identifier for the table; must be unique for the database and schema in which the table is created.
        :param pulumi.Input[Union['TablePrimaryKeyArgs', 'TablePrimaryKeyArgsDict']] primary_key: Definitions of primary key constraint to create on table
        :param pulumi.Input[builtins.str] schema: The schema in which to create the table.
        :param pulumi.Input[Sequence[pulumi.Input[Union['TableTagArgs', 'TableTagArgsDict']]]] tags: Definitions of a tag to associate with the resource.
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
                 change_tracking: Optional[pulumi.Input[builtins.bool]] = None,
                 cluster_bies: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]] = None,
                 columns: Optional[pulumi.Input[Sequence[pulumi.Input[Union['TableColumnArgs', 'TableColumnArgsDict']]]]] = None,
                 comment: Optional[pulumi.Input[builtins.str]] = None,
                 data_retention_time_in_days: Optional[pulumi.Input[builtins.int]] = None,
                 database: Optional[pulumi.Input[builtins.str]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 primary_key: Optional[pulumi.Input[Union['TablePrimaryKeyArgs', 'TablePrimaryKeyArgsDict']]] = None,
                 schema: Optional[pulumi.Input[builtins.str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[Union['TableTagArgs', 'TableTagArgsDict']]]]] = None,
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
            __props__.__dict__["fully_qualified_name"] = None
            __props__.__dict__["owner"] = None
        super(Table, __self__).__init__(
            'snowflake:index/table:Table',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            change_tracking: Optional[pulumi.Input[builtins.bool]] = None,
            cluster_bies: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]] = None,
            columns: Optional[pulumi.Input[Sequence[pulumi.Input[Union['TableColumnArgs', 'TableColumnArgsDict']]]]] = None,
            comment: Optional[pulumi.Input[builtins.str]] = None,
            data_retention_time_in_days: Optional[pulumi.Input[builtins.int]] = None,
            database: Optional[pulumi.Input[builtins.str]] = None,
            fully_qualified_name: Optional[pulumi.Input[builtins.str]] = None,
            name: Optional[pulumi.Input[builtins.str]] = None,
            owner: Optional[pulumi.Input[builtins.str]] = None,
            primary_key: Optional[pulumi.Input[Union['TablePrimaryKeyArgs', 'TablePrimaryKeyArgsDict']]] = None,
            schema: Optional[pulumi.Input[builtins.str]] = None,
            tags: Optional[pulumi.Input[Sequence[pulumi.Input[Union['TableTagArgs', 'TableTagArgsDict']]]]] = None) -> 'Table':
        """
        Get an existing Table resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.bool] change_tracking: (Default: `false`) Specifies whether to enable change tracking on the table. Default false.
        :param pulumi.Input[Sequence[pulumi.Input[builtins.str]]] cluster_bies: A list of one or more table columns/expressions to be used as clustering key(s) for the table
        :param pulumi.Input[Sequence[pulumi.Input[Union['TableColumnArgs', 'TableColumnArgsDict']]]] columns: Definitions of a column to create in the table. Minimum one required.
        :param pulumi.Input[builtins.str] comment: Specifies a comment for the table.
        :param pulumi.Input[builtins.int] data_retention_time_in_days: (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`-1`)) Specifies the retention period for the table so that Time Travel actions (SELECT, CLONE, UNDROP) can be performed on historical data in the table. If you wish to inherit the parent schema setting then pass in the schema attribute to this argument or do not fill this parameter at all; the default value for this field is -1, which is a fallback to use Snowflake default - in this case the schema value
        :param pulumi.Input[builtins.str] database: The database in which to create the table.
        :param pulumi.Input[builtins.str] fully_qualified_name: Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        :param pulumi.Input[builtins.str] name: Specifies the identifier for the table; must be unique for the database and schema in which the table is created.
        :param pulumi.Input[builtins.str] owner: Name of the role that owns the table.
        :param pulumi.Input[Union['TablePrimaryKeyArgs', 'TablePrimaryKeyArgsDict']] primary_key: Definitions of primary key constraint to create on table
        :param pulumi.Input[builtins.str] schema: The schema in which to create the table.
        :param pulumi.Input[Sequence[pulumi.Input[Union['TableTagArgs', 'TableTagArgsDict']]]] tags: Definitions of a tag to associate with the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _TableState.__new__(_TableState)

        __props__.__dict__["change_tracking"] = change_tracking
        __props__.__dict__["cluster_bies"] = cluster_bies
        __props__.__dict__["columns"] = columns
        __props__.__dict__["comment"] = comment
        __props__.__dict__["data_retention_time_in_days"] = data_retention_time_in_days
        __props__.__dict__["database"] = database
        __props__.__dict__["fully_qualified_name"] = fully_qualified_name
        __props__.__dict__["name"] = name
        __props__.__dict__["owner"] = owner
        __props__.__dict__["primary_key"] = primary_key
        __props__.__dict__["schema"] = schema
        __props__.__dict__["tags"] = tags
        return Table(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="changeTracking")
    def change_tracking(self) -> pulumi.Output[Optional[builtins.bool]]:
        """
        (Default: `false`) Specifies whether to enable change tracking on the table. Default false.
        """
        return pulumi.get(self, "change_tracking")

    @property
    @pulumi.getter(name="clusterBies")
    def cluster_bies(self) -> pulumi.Output[Optional[Sequence[builtins.str]]]:
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
    def comment(self) -> pulumi.Output[Optional[builtins.str]]:
        """
        Specifies a comment for the table.
        """
        return pulumi.get(self, "comment")

    @property
    @pulumi.getter(name="dataRetentionTimeInDays")
    def data_retention_time_in_days(self) -> pulumi.Output[Optional[builtins.int]]:
        """
        (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`-1`)) Specifies the retention period for the table so that Time Travel actions (SELECT, CLONE, UNDROP) can be performed on historical data in the table. If you wish to inherit the parent schema setting then pass in the schema attribute to this argument or do not fill this parameter at all; the default value for this field is -1, which is a fallback to use Snowflake default - in this case the schema value
        """
        return pulumi.get(self, "data_retention_time_in_days")

    @property
    @pulumi.getter
    def database(self) -> pulumi.Output[builtins.str]:
        """
        The database in which to create the table.
        """
        return pulumi.get(self, "database")

    @property
    @pulumi.getter(name="fullyQualifiedName")
    def fully_qualified_name(self) -> pulumi.Output[builtins.str]:
        """
        Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        """
        return pulumi.get(self, "fully_qualified_name")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[builtins.str]:
        """
        Specifies the identifier for the table; must be unique for the database and schema in which the table is created.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def owner(self) -> pulumi.Output[builtins.str]:
        """
        Name of the role that owns the table.
        """
        return pulumi.get(self, "owner")

    @property
    @pulumi.getter(name="primaryKey")
    @_utilities.deprecated("""Use TableConstraint instead""")
    def primary_key(self) -> pulumi.Output[Optional['outputs.TablePrimaryKey']]:
        """
        Definitions of primary key constraint to create on table
        """
        return pulumi.get(self, "primary_key")

    @property
    @pulumi.getter
    def schema(self) -> pulumi.Output[builtins.str]:
        """
        The schema in which to create the table.
        """
        return pulumi.get(self, "schema")

    @property
    @pulumi.getter
    @_utilities.deprecated("""Use the 'snowflake_tag_association' resource instead.""")
    def tags(self) -> pulumi.Output[Optional[Sequence['outputs.TableTag']]]:
        """
        Definitions of a tag to associate with the resource.
        """
        return pulumi.get(self, "tags")

