# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

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

__all__ = ['SequenceArgs', 'Sequence']

@pulumi.input_type
class SequenceArgs:
    def __init__(__self__, *,
                 database: pulumi.Input[str],
                 schema: pulumi.Input[str],
                 comment: Optional[pulumi.Input[str]] = None,
                 increment: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 ordering: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Sequence resource.
        :param pulumi.Input[str] database: The database in which to create the sequence. Don't use the | character.
        :param pulumi.Input[str] schema: The schema in which to create the sequence. Don't use the | character.
        :param pulumi.Input[str] comment: Specifies a comment for the sequence.
        :param pulumi.Input[int] increment: The amount the sequence will increase by each time it is used
        :param pulumi.Input[str] name: Specifies the name for the sequence.
        :param pulumi.Input[str] ordering: The ordering of the sequence. Either ORDER or NOORDER. Default is ORDER.
        """
        pulumi.set(__self__, "database", database)
        pulumi.set(__self__, "schema", schema)
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if increment is not None:
            pulumi.set(__self__, "increment", increment)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if ordering is not None:
            pulumi.set(__self__, "ordering", ordering)

    @property
    @pulumi.getter
    def database(self) -> pulumi.Input[str]:
        """
        The database in which to create the sequence. Don't use the | character.
        """
        return pulumi.get(self, "database")

    @database.setter
    def database(self, value: pulumi.Input[str]):
        pulumi.set(self, "database", value)

    @property
    @pulumi.getter
    def schema(self) -> pulumi.Input[str]:
        """
        The schema in which to create the sequence. Don't use the | character.
        """
        return pulumi.get(self, "schema")

    @schema.setter
    def schema(self, value: pulumi.Input[str]):
        pulumi.set(self, "schema", value)

    @property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies a comment for the sequence.
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "comment", value)

    @property
    @pulumi.getter
    def increment(self) -> Optional[pulumi.Input[int]]:
        """
        The amount the sequence will increase by each time it is used
        """
        return pulumi.get(self, "increment")

    @increment.setter
    def increment(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "increment", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the name for the sequence.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def ordering(self) -> Optional[pulumi.Input[str]]:
        """
        The ordering of the sequence. Either ORDER or NOORDER. Default is ORDER.
        """
        return pulumi.get(self, "ordering")

    @ordering.setter
    def ordering(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ordering", value)


@pulumi.input_type
class _SequenceState:
    def __init__(__self__, *,
                 comment: Optional[pulumi.Input[str]] = None,
                 database: Optional[pulumi.Input[str]] = None,
                 fully_qualified_name: Optional[pulumi.Input[str]] = None,
                 increment: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 next_value: Optional[pulumi.Input[int]] = None,
                 ordering: Optional[pulumi.Input[str]] = None,
                 schema: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Sequence resources.
        :param pulumi.Input[str] comment: Specifies a comment for the sequence.
        :param pulumi.Input[str] database: The database in which to create the sequence. Don't use the | character.
        :param pulumi.Input[str] fully_qualified_name: Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        :param pulumi.Input[int] increment: The amount the sequence will increase by each time it is used
        :param pulumi.Input[str] name: Specifies the name for the sequence.
        :param pulumi.Input[int] next_value: The increment sequence interval.
        :param pulumi.Input[str] ordering: The ordering of the sequence. Either ORDER or NOORDER. Default is ORDER.
        :param pulumi.Input[str] schema: The schema in which to create the sequence. Don't use the | character.
        """
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if database is not None:
            pulumi.set(__self__, "database", database)
        if fully_qualified_name is not None:
            pulumi.set(__self__, "fully_qualified_name", fully_qualified_name)
        if increment is not None:
            pulumi.set(__self__, "increment", increment)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if next_value is not None:
            pulumi.set(__self__, "next_value", next_value)
        if ordering is not None:
            pulumi.set(__self__, "ordering", ordering)
        if schema is not None:
            pulumi.set(__self__, "schema", schema)

    @property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies a comment for the sequence.
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "comment", value)

    @property
    @pulumi.getter
    def database(self) -> Optional[pulumi.Input[str]]:
        """
        The database in which to create the sequence. Don't use the | character.
        """
        return pulumi.get(self, "database")

    @database.setter
    def database(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "database", value)

    @property
    @pulumi.getter(name="fullyQualifiedName")
    def fully_qualified_name(self) -> Optional[pulumi.Input[str]]:
        """
        Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        """
        return pulumi.get(self, "fully_qualified_name")

    @fully_qualified_name.setter
    def fully_qualified_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "fully_qualified_name", value)

    @property
    @pulumi.getter
    def increment(self) -> Optional[pulumi.Input[int]]:
        """
        The amount the sequence will increase by each time it is used
        """
        return pulumi.get(self, "increment")

    @increment.setter
    def increment(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "increment", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the name for the sequence.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="nextValue")
    def next_value(self) -> Optional[pulumi.Input[int]]:
        """
        The increment sequence interval.
        """
        return pulumi.get(self, "next_value")

    @next_value.setter
    def next_value(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "next_value", value)

    @property
    @pulumi.getter
    def ordering(self) -> Optional[pulumi.Input[str]]:
        """
        The ordering of the sequence. Either ORDER or NOORDER. Default is ORDER.
        """
        return pulumi.get(self, "ordering")

    @ordering.setter
    def ordering(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ordering", value)

    @property
    @pulumi.getter
    def schema(self) -> Optional[pulumi.Input[str]]:
        """
        The schema in which to create the sequence. Don't use the | character.
        """
        return pulumi.get(self, "schema")

    @schema.setter
    def schema(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "schema", value)


class Sequence(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 database: Optional[pulumi.Input[str]] = None,
                 increment: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 ordering: Optional[pulumi.Input[str]] = None,
                 schema: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ## Import

        format is database name | schema name | sequence name

        ```sh
        $ pulumi import snowflake:index/sequence:Sequence example 'dbName|schemaName|sequenceName'
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] comment: Specifies a comment for the sequence.
        :param pulumi.Input[str] database: The database in which to create the sequence. Don't use the | character.
        :param pulumi.Input[int] increment: The amount the sequence will increase by each time it is used
        :param pulumi.Input[str] name: Specifies the name for the sequence.
        :param pulumi.Input[str] ordering: The ordering of the sequence. Either ORDER or NOORDER. Default is ORDER.
        :param pulumi.Input[str] schema: The schema in which to create the sequence. Don't use the | character.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SequenceArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Import

        format is database name | schema name | sequence name

        ```sh
        $ pulumi import snowflake:index/sequence:Sequence example 'dbName|schemaName|sequenceName'
        ```

        :param str resource_name: The name of the resource.
        :param SequenceArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SequenceArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 database: Optional[pulumi.Input[str]] = None,
                 increment: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 ordering: Optional[pulumi.Input[str]] = None,
                 schema: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SequenceArgs.__new__(SequenceArgs)

            __props__.__dict__["comment"] = comment
            if database is None and not opts.urn:
                raise TypeError("Missing required property 'database'")
            __props__.__dict__["database"] = database
            __props__.__dict__["increment"] = increment
            __props__.__dict__["name"] = name
            __props__.__dict__["ordering"] = ordering
            if schema is None and not opts.urn:
                raise TypeError("Missing required property 'schema'")
            __props__.__dict__["schema"] = schema
            __props__.__dict__["fully_qualified_name"] = None
            __props__.__dict__["next_value"] = None
        super(Sequence, __self__).__init__(
            'snowflake:index/sequence:Sequence',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            comment: Optional[pulumi.Input[str]] = None,
            database: Optional[pulumi.Input[str]] = None,
            fully_qualified_name: Optional[pulumi.Input[str]] = None,
            increment: Optional[pulumi.Input[int]] = None,
            name: Optional[pulumi.Input[str]] = None,
            next_value: Optional[pulumi.Input[int]] = None,
            ordering: Optional[pulumi.Input[str]] = None,
            schema: Optional[pulumi.Input[str]] = None) -> 'Sequence':
        """
        Get an existing Sequence resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] comment: Specifies a comment for the sequence.
        :param pulumi.Input[str] database: The database in which to create the sequence. Don't use the | character.
        :param pulumi.Input[str] fully_qualified_name: Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        :param pulumi.Input[int] increment: The amount the sequence will increase by each time it is used
        :param pulumi.Input[str] name: Specifies the name for the sequence.
        :param pulumi.Input[int] next_value: The increment sequence interval.
        :param pulumi.Input[str] ordering: The ordering of the sequence. Either ORDER or NOORDER. Default is ORDER.
        :param pulumi.Input[str] schema: The schema in which to create the sequence. Don't use the | character.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SequenceState.__new__(_SequenceState)

        __props__.__dict__["comment"] = comment
        __props__.__dict__["database"] = database
        __props__.__dict__["fully_qualified_name"] = fully_qualified_name
        __props__.__dict__["increment"] = increment
        __props__.__dict__["name"] = name
        __props__.__dict__["next_value"] = next_value
        __props__.__dict__["ordering"] = ordering
        __props__.__dict__["schema"] = schema
        return Sequence(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def comment(self) -> pulumi.Output[Optional[str]]:
        """
        Specifies a comment for the sequence.
        """
        return pulumi.get(self, "comment")

    @property
    @pulumi.getter
    def database(self) -> pulumi.Output[str]:
        """
        The database in which to create the sequence. Don't use the | character.
        """
        return pulumi.get(self, "database")

    @property
    @pulumi.getter(name="fullyQualifiedName")
    def fully_qualified_name(self) -> pulumi.Output[str]:
        """
        Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        """
        return pulumi.get(self, "fully_qualified_name")

    @property
    @pulumi.getter
    def increment(self) -> pulumi.Output[Optional[int]]:
        """
        The amount the sequence will increase by each time it is used
        """
        return pulumi.get(self, "increment")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Specifies the name for the sequence.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="nextValue")
    def next_value(self) -> pulumi.Output[int]:
        """
        The increment sequence interval.
        """
        return pulumi.get(self, "next_value")

    @property
    @pulumi.getter
    def ordering(self) -> pulumi.Output[Optional[str]]:
        """
        The ordering of the sequence. Either ORDER or NOORDER. Default is ORDER.
        """
        return pulumi.get(self, "ordering")

    @property
    @pulumi.getter
    def schema(self) -> pulumi.Output[str]:
        """
        The schema in which to create the sequence. Don't use the | character.
        """
        return pulumi.get(self, "schema")

