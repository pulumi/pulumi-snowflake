# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['DatabaseArgs', 'Database']

@pulumi.input_type
class DatabaseArgs:
    def __init__(__self__, *,
                 comment: Optional[pulumi.Input[str]] = None,
                 data_retention_time_in_days: Optional[pulumi.Input[int]] = None,
                 from_database: Optional[pulumi.Input[str]] = None,
                 from_replica: Optional[pulumi.Input[str]] = None,
                 from_share: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input['DatabaseTagArgs']]]] = None):
        """
        The set of arguments for constructing a Database resource.
        :param pulumi.Input[str] from_database: Specify a database to create a clone from.
        :param pulumi.Input[str] from_replica: Specify a fully-qualified path to a database to create a replica from.
        :param pulumi.Input[Mapping[str, Any]] from_share: Specify a provider and a share in this map to create a database from a share.
        :param pulumi.Input[Sequence[pulumi.Input['DatabaseTagArgs']]] tags: Definitions of a tag to associate with the resource.
        """
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if data_retention_time_in_days is not None:
            pulumi.set(__self__, "data_retention_time_in_days", data_retention_time_in_days)
        if from_database is not None:
            pulumi.set(__self__, "from_database", from_database)
        if from_replica is not None:
            pulumi.set(__self__, "from_replica", from_replica)
        if from_share is not None:
            pulumi.set(__self__, "from_share", from_share)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "comment", value)

    @property
    @pulumi.getter(name="dataRetentionTimeInDays")
    def data_retention_time_in_days(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "data_retention_time_in_days")

    @data_retention_time_in_days.setter
    def data_retention_time_in_days(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "data_retention_time_in_days", value)

    @property
    @pulumi.getter(name="fromDatabase")
    def from_database(self) -> Optional[pulumi.Input[str]]:
        """
        Specify a database to create a clone from.
        """
        return pulumi.get(self, "from_database")

    @from_database.setter
    def from_database(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "from_database", value)

    @property
    @pulumi.getter(name="fromReplica")
    def from_replica(self) -> Optional[pulumi.Input[str]]:
        """
        Specify a fully-qualified path to a database to create a replica from.
        """
        return pulumi.get(self, "from_replica")

    @from_replica.setter
    def from_replica(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "from_replica", value)

    @property
    @pulumi.getter(name="fromShare")
    def from_share(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        Specify a provider and a share in this map to create a database from a share.
        """
        return pulumi.get(self, "from_share")

    @from_share.setter
    def from_share(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "from_share", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['DatabaseTagArgs']]]]:
        """
        Definitions of a tag to associate with the resource.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['DatabaseTagArgs']]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _DatabaseState:
    def __init__(__self__, *,
                 comment: Optional[pulumi.Input[str]] = None,
                 data_retention_time_in_days: Optional[pulumi.Input[int]] = None,
                 from_database: Optional[pulumi.Input[str]] = None,
                 from_replica: Optional[pulumi.Input[str]] = None,
                 from_share: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input['DatabaseTagArgs']]]] = None):
        """
        Input properties used for looking up and filtering Database resources.
        :param pulumi.Input[str] from_database: Specify a database to create a clone from.
        :param pulumi.Input[str] from_replica: Specify a fully-qualified path to a database to create a replica from.
        :param pulumi.Input[Mapping[str, Any]] from_share: Specify a provider and a share in this map to create a database from a share.
        :param pulumi.Input[Sequence[pulumi.Input['DatabaseTagArgs']]] tags: Definitions of a tag to associate with the resource.
        """
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if data_retention_time_in_days is not None:
            pulumi.set(__self__, "data_retention_time_in_days", data_retention_time_in_days)
        if from_database is not None:
            pulumi.set(__self__, "from_database", from_database)
        if from_replica is not None:
            pulumi.set(__self__, "from_replica", from_replica)
        if from_share is not None:
            pulumi.set(__self__, "from_share", from_share)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "comment", value)

    @property
    @pulumi.getter(name="dataRetentionTimeInDays")
    def data_retention_time_in_days(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "data_retention_time_in_days")

    @data_retention_time_in_days.setter
    def data_retention_time_in_days(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "data_retention_time_in_days", value)

    @property
    @pulumi.getter(name="fromDatabase")
    def from_database(self) -> Optional[pulumi.Input[str]]:
        """
        Specify a database to create a clone from.
        """
        return pulumi.get(self, "from_database")

    @from_database.setter
    def from_database(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "from_database", value)

    @property
    @pulumi.getter(name="fromReplica")
    def from_replica(self) -> Optional[pulumi.Input[str]]:
        """
        Specify a fully-qualified path to a database to create a replica from.
        """
        return pulumi.get(self, "from_replica")

    @from_replica.setter
    def from_replica(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "from_replica", value)

    @property
    @pulumi.getter(name="fromShare")
    def from_share(self) -> Optional[pulumi.Input[Mapping[str, Any]]]:
        """
        Specify a provider and a share in this map to create a database from a share.
        """
        return pulumi.get(self, "from_share")

    @from_share.setter
    def from_share(self, value: Optional[pulumi.Input[Mapping[str, Any]]]):
        pulumi.set(self, "from_share", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['DatabaseTagArgs']]]]:
        """
        Definitions of a tag to associate with the resource.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['DatabaseTagArgs']]]]):
        pulumi.set(self, "tags", value)


class Database(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 data_retention_time_in_days: Optional[pulumi.Input[int]] = None,
                 from_database: Optional[pulumi.Input[str]] = None,
                 from_replica: Optional[pulumi.Input[str]] = None,
                 from_share: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DatabaseTagArgs']]]]] = None,
                 __props__=None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_snowflake as snowflake

        test = snowflake.Database("test",
            comment="test comment",
            data_retention_time_in_days=3)
        test2 = snowflake.Database("test2", comment="test comment 2")
        ```

        ## Import

        ```sh
         $ pulumi import snowflake:index/database:Database example name
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] from_database: Specify a database to create a clone from.
        :param pulumi.Input[str] from_replica: Specify a fully-qualified path to a database to create a replica from.
        :param pulumi.Input[Mapping[str, Any]] from_share: Specify a provider and a share in this map to create a database from a share.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DatabaseTagArgs']]]] tags: Definitions of a tag to associate with the resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[DatabaseArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_snowflake as snowflake

        test = snowflake.Database("test",
            comment="test comment",
            data_retention_time_in_days=3)
        test2 = snowflake.Database("test2", comment="test comment 2")
        ```

        ## Import

        ```sh
         $ pulumi import snowflake:index/database:Database example name
        ```

        :param str resource_name: The name of the resource.
        :param DatabaseArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DatabaseArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 data_retention_time_in_days: Optional[pulumi.Input[int]] = None,
                 from_database: Optional[pulumi.Input[str]] = None,
                 from_replica: Optional[pulumi.Input[str]] = None,
                 from_share: Optional[pulumi.Input[Mapping[str, Any]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DatabaseTagArgs']]]]] = None,
                 __props__=None):
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DatabaseArgs.__new__(DatabaseArgs)

            __props__.__dict__["comment"] = comment
            __props__.__dict__["data_retention_time_in_days"] = data_retention_time_in_days
            __props__.__dict__["from_database"] = from_database
            __props__.__dict__["from_replica"] = from_replica
            __props__.__dict__["from_share"] = from_share
            __props__.__dict__["name"] = name
            __props__.__dict__["tags"] = tags
        super(Database, __self__).__init__(
            'snowflake:index/database:Database',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            comment: Optional[pulumi.Input[str]] = None,
            data_retention_time_in_days: Optional[pulumi.Input[int]] = None,
            from_database: Optional[pulumi.Input[str]] = None,
            from_replica: Optional[pulumi.Input[str]] = None,
            from_share: Optional[pulumi.Input[Mapping[str, Any]]] = None,
            name: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DatabaseTagArgs']]]]] = None) -> 'Database':
        """
        Get an existing Database resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] from_database: Specify a database to create a clone from.
        :param pulumi.Input[str] from_replica: Specify a fully-qualified path to a database to create a replica from.
        :param pulumi.Input[Mapping[str, Any]] from_share: Specify a provider and a share in this map to create a database from a share.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DatabaseTagArgs']]]] tags: Definitions of a tag to associate with the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DatabaseState.__new__(_DatabaseState)

        __props__.__dict__["comment"] = comment
        __props__.__dict__["data_retention_time_in_days"] = data_retention_time_in_days
        __props__.__dict__["from_database"] = from_database
        __props__.__dict__["from_replica"] = from_replica
        __props__.__dict__["from_share"] = from_share
        __props__.__dict__["name"] = name
        __props__.__dict__["tags"] = tags
        return Database(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def comment(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "comment")

    @property
    @pulumi.getter(name="dataRetentionTimeInDays")
    def data_retention_time_in_days(self) -> pulumi.Output[int]:
        return pulumi.get(self, "data_retention_time_in_days")

    @property
    @pulumi.getter(name="fromDatabase")
    def from_database(self) -> pulumi.Output[Optional[str]]:
        """
        Specify a database to create a clone from.
        """
        return pulumi.get(self, "from_database")

    @property
    @pulumi.getter(name="fromReplica")
    def from_replica(self) -> pulumi.Output[Optional[str]]:
        """
        Specify a fully-qualified path to a database to create a replica from.
        """
        return pulumi.get(self, "from_replica")

    @property
    @pulumi.getter(name="fromShare")
    def from_share(self) -> pulumi.Output[Optional[Mapping[str, Any]]]:
        """
        Specify a provider and a share in this map to create a database from a share.
        """
        return pulumi.get(self, "from_share")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Sequence['outputs.DatabaseTag']]]:
        """
        Definitions of a tag to associate with the resource.
        """
        return pulumi.get(self, "tags")

