# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['DatabaseRoleArgs', 'DatabaseRole']

@pulumi.input_type
class DatabaseRoleArgs:
    def __init__(__self__, *,
                 database: pulumi.Input[str],
                 comment: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a DatabaseRole resource.
        :param pulumi.Input[str] database: The database in which to create the database role.
        :param pulumi.Input[str] comment: Specifies a comment for the database role.
        :param pulumi.Input[str] name: Specifies the identifier for the database role.
        """
        pulumi.set(__self__, "database", database)
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def database(self) -> pulumi.Input[str]:
        """
        The database in which to create the database role.
        """
        return pulumi.get(self, "database")

    @database.setter
    def database(self, value: pulumi.Input[str]):
        pulumi.set(self, "database", value)

    @property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies a comment for the database role.
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "comment", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the identifier for the database role.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _DatabaseRoleState:
    def __init__(__self__, *,
                 comment: Optional[pulumi.Input[str]] = None,
                 database: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering DatabaseRole resources.
        :param pulumi.Input[str] comment: Specifies a comment for the database role.
        :param pulumi.Input[str] database: The database in which to create the database role.
        :param pulumi.Input[str] name: Specifies the identifier for the database role.
        """
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if database is not None:
            pulumi.set(__self__, "database", database)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies a comment for the database role.
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "comment", value)

    @property
    @pulumi.getter
    def database(self) -> Optional[pulumi.Input[str]]:
        """
        The database in which to create the database role.
        """
        return pulumi.get(self, "database")

    @database.setter
    def database(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "database", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the identifier for the database role.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


class DatabaseRole(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 database: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_snowflake as snowflake

        db_role = snowflake.DatabaseRole("db_role",
            database="database",
            name="role_1",
            comment="my db role")
        ```

        ## Import

        ```sh
        $ pulumi import snowflake:index/databaseRole:DatabaseRole example 'dbName|roleName'
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] comment: Specifies a comment for the database role.
        :param pulumi.Input[str] database: The database in which to create the database role.
        :param pulumi.Input[str] name: Specifies the identifier for the database role.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: DatabaseRoleArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_snowflake as snowflake

        db_role = snowflake.DatabaseRole("db_role",
            database="database",
            name="role_1",
            comment="my db role")
        ```

        ## Import

        ```sh
        $ pulumi import snowflake:index/databaseRole:DatabaseRole example 'dbName|roleName'
        ```

        :param str resource_name: The name of the resource.
        :param DatabaseRoleArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DatabaseRoleArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 database: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DatabaseRoleArgs.__new__(DatabaseRoleArgs)

            __props__.__dict__["comment"] = comment
            if database is None and not opts.urn:
                raise TypeError("Missing required property 'database'")
            __props__.__dict__["database"] = database
            __props__.__dict__["name"] = name
        super(DatabaseRole, __self__).__init__(
            'snowflake:index/databaseRole:DatabaseRole',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            comment: Optional[pulumi.Input[str]] = None,
            database: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None) -> 'DatabaseRole':
        """
        Get an existing DatabaseRole resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] comment: Specifies a comment for the database role.
        :param pulumi.Input[str] database: The database in which to create the database role.
        :param pulumi.Input[str] name: Specifies the identifier for the database role.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DatabaseRoleState.__new__(_DatabaseRoleState)

        __props__.__dict__["comment"] = comment
        __props__.__dict__["database"] = database
        __props__.__dict__["name"] = name
        return DatabaseRole(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def comment(self) -> pulumi.Output[Optional[str]]:
        """
        Specifies a comment for the database role.
        """
        return pulumi.get(self, "comment")

    @property
    @pulumi.getter
    def database(self) -> pulumi.Output[str]:
        """
        The database in which to create the database role.
        """
        return pulumi.get(self, "database")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Specifies the identifier for the database role.
        """
        return pulumi.get(self, "name")

