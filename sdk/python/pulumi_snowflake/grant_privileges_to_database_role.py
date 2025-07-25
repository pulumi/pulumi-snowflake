# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins as _builtins
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

__all__ = ['GrantPrivilegesToDatabaseRoleArgs', 'GrantPrivilegesToDatabaseRole']

@pulumi.input_type
class GrantPrivilegesToDatabaseRoleArgs:
    def __init__(__self__, *,
                 database_role_name: pulumi.Input[_builtins.str],
                 all_privileges: Optional[pulumi.Input[_builtins.bool]] = None,
                 always_apply: Optional[pulumi.Input[_builtins.bool]] = None,
                 always_apply_trigger: Optional[pulumi.Input[_builtins.str]] = None,
                 on_database: Optional[pulumi.Input[_builtins.str]] = None,
                 on_schema: Optional[pulumi.Input['GrantPrivilegesToDatabaseRoleOnSchemaArgs']] = None,
                 on_schema_object: Optional[pulumi.Input['GrantPrivilegesToDatabaseRoleOnSchemaObjectArgs']] = None,
                 privileges: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 with_grant_option: Optional[pulumi.Input[_builtins.bool]] = None):
        """
        The set of arguments for constructing a GrantPrivilegesToDatabaseRole resource.
        :param pulumi.Input[_builtins.str] database_role_name: The fully qualified name of the database role to which privileges will be granted. For more information about this resource, see docs.
        :param pulumi.Input[_builtins.bool] all_privileges: (Default: `false`) Grant all privileges on the database role.
        :param pulumi.Input[_builtins.str] always_apply_trigger: (Default: ``) This is a helper field and should not be set. Its main purpose is to help to achieve the functionality described by the always_apply field.
        :param pulumi.Input[_builtins.str] on_database: The fully qualified name of the database on which privileges will be granted. For more information about this resource, see docs.
        :param pulumi.Input['GrantPrivilegesToDatabaseRoleOnSchemaArgs'] on_schema: Specifies the schema on which privileges will be granted.
        :param pulumi.Input['GrantPrivilegesToDatabaseRoleOnSchemaObjectArgs'] on_schema_object: Specifies the schema object on which privileges will be granted.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] privileges: The privileges to grant on the database role.
        :param pulumi.Input[_builtins.bool] with_grant_option: (Default: `false`) If specified, allows the recipient role to grant the privileges to other roles.
        """
        pulumi.set(__self__, "database_role_name", database_role_name)
        if all_privileges is not None:
            pulumi.set(__self__, "all_privileges", all_privileges)
        if always_apply is not None:
            pulumi.set(__self__, "always_apply", always_apply)
        if always_apply_trigger is not None:
            pulumi.set(__self__, "always_apply_trigger", always_apply_trigger)
        if on_database is not None:
            pulumi.set(__self__, "on_database", on_database)
        if on_schema is not None:
            pulumi.set(__self__, "on_schema", on_schema)
        if on_schema_object is not None:
            pulumi.set(__self__, "on_schema_object", on_schema_object)
        if privileges is not None:
            pulumi.set(__self__, "privileges", privileges)
        if with_grant_option is not None:
            pulumi.set(__self__, "with_grant_option", with_grant_option)

    @_builtins.property
    @pulumi.getter(name="databaseRoleName")
    def database_role_name(self) -> pulumi.Input[_builtins.str]:
        """
        The fully qualified name of the database role to which privileges will be granted. For more information about this resource, see docs.
        """
        return pulumi.get(self, "database_role_name")

    @database_role_name.setter
    def database_role_name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "database_role_name", value)

    @_builtins.property
    @pulumi.getter(name="allPrivileges")
    def all_privileges(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        (Default: `false`) Grant all privileges on the database role.
        """
        return pulumi.get(self, "all_privileges")

    @all_privileges.setter
    def all_privileges(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "all_privileges", value)

    @_builtins.property
    @pulumi.getter(name="alwaysApply")
    def always_apply(self) -> Optional[pulumi.Input[_builtins.bool]]:
        return pulumi.get(self, "always_apply")

    @always_apply.setter
    def always_apply(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "always_apply", value)

    @_builtins.property
    @pulumi.getter(name="alwaysApplyTrigger")
    def always_apply_trigger(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        (Default: ``) This is a helper field and should not be set. Its main purpose is to help to achieve the functionality described by the always_apply field.
        """
        return pulumi.get(self, "always_apply_trigger")

    @always_apply_trigger.setter
    def always_apply_trigger(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "always_apply_trigger", value)

    @_builtins.property
    @pulumi.getter(name="onDatabase")
    def on_database(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The fully qualified name of the database on which privileges will be granted. For more information about this resource, see docs.
        """
        return pulumi.get(self, "on_database")

    @on_database.setter
    def on_database(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "on_database", value)

    @_builtins.property
    @pulumi.getter(name="onSchema")
    def on_schema(self) -> Optional[pulumi.Input['GrantPrivilegesToDatabaseRoleOnSchemaArgs']]:
        """
        Specifies the schema on which privileges will be granted.
        """
        return pulumi.get(self, "on_schema")

    @on_schema.setter
    def on_schema(self, value: Optional[pulumi.Input['GrantPrivilegesToDatabaseRoleOnSchemaArgs']]):
        pulumi.set(self, "on_schema", value)

    @_builtins.property
    @pulumi.getter(name="onSchemaObject")
    def on_schema_object(self) -> Optional[pulumi.Input['GrantPrivilegesToDatabaseRoleOnSchemaObjectArgs']]:
        """
        Specifies the schema object on which privileges will be granted.
        """
        return pulumi.get(self, "on_schema_object")

    @on_schema_object.setter
    def on_schema_object(self, value: Optional[pulumi.Input['GrantPrivilegesToDatabaseRoleOnSchemaObjectArgs']]):
        pulumi.set(self, "on_schema_object", value)

    @_builtins.property
    @pulumi.getter
    def privileges(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]:
        """
        The privileges to grant on the database role.
        """
        return pulumi.get(self, "privileges")

    @privileges.setter
    def privileges(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "privileges", value)

    @_builtins.property
    @pulumi.getter(name="withGrantOption")
    def with_grant_option(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        (Default: `false`) If specified, allows the recipient role to grant the privileges to other roles.
        """
        return pulumi.get(self, "with_grant_option")

    @with_grant_option.setter
    def with_grant_option(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "with_grant_option", value)


@pulumi.input_type
class _GrantPrivilegesToDatabaseRoleState:
    def __init__(__self__, *,
                 all_privileges: Optional[pulumi.Input[_builtins.bool]] = None,
                 always_apply: Optional[pulumi.Input[_builtins.bool]] = None,
                 always_apply_trigger: Optional[pulumi.Input[_builtins.str]] = None,
                 database_role_name: Optional[pulumi.Input[_builtins.str]] = None,
                 on_database: Optional[pulumi.Input[_builtins.str]] = None,
                 on_schema: Optional[pulumi.Input['GrantPrivilegesToDatabaseRoleOnSchemaArgs']] = None,
                 on_schema_object: Optional[pulumi.Input['GrantPrivilegesToDatabaseRoleOnSchemaObjectArgs']] = None,
                 privileges: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 with_grant_option: Optional[pulumi.Input[_builtins.bool]] = None):
        """
        Input properties used for looking up and filtering GrantPrivilegesToDatabaseRole resources.
        :param pulumi.Input[_builtins.bool] all_privileges: (Default: `false`) Grant all privileges on the database role.
        :param pulumi.Input[_builtins.str] always_apply_trigger: (Default: ``) This is a helper field and should not be set. Its main purpose is to help to achieve the functionality described by the always_apply field.
        :param pulumi.Input[_builtins.str] database_role_name: The fully qualified name of the database role to which privileges will be granted. For more information about this resource, see docs.
        :param pulumi.Input[_builtins.str] on_database: The fully qualified name of the database on which privileges will be granted. For more information about this resource, see docs.
        :param pulumi.Input['GrantPrivilegesToDatabaseRoleOnSchemaArgs'] on_schema: Specifies the schema on which privileges will be granted.
        :param pulumi.Input['GrantPrivilegesToDatabaseRoleOnSchemaObjectArgs'] on_schema_object: Specifies the schema object on which privileges will be granted.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] privileges: The privileges to grant on the database role.
        :param pulumi.Input[_builtins.bool] with_grant_option: (Default: `false`) If specified, allows the recipient role to grant the privileges to other roles.
        """
        if all_privileges is not None:
            pulumi.set(__self__, "all_privileges", all_privileges)
        if always_apply is not None:
            pulumi.set(__self__, "always_apply", always_apply)
        if always_apply_trigger is not None:
            pulumi.set(__self__, "always_apply_trigger", always_apply_trigger)
        if database_role_name is not None:
            pulumi.set(__self__, "database_role_name", database_role_name)
        if on_database is not None:
            pulumi.set(__self__, "on_database", on_database)
        if on_schema is not None:
            pulumi.set(__self__, "on_schema", on_schema)
        if on_schema_object is not None:
            pulumi.set(__self__, "on_schema_object", on_schema_object)
        if privileges is not None:
            pulumi.set(__self__, "privileges", privileges)
        if with_grant_option is not None:
            pulumi.set(__self__, "with_grant_option", with_grant_option)

    @_builtins.property
    @pulumi.getter(name="allPrivileges")
    def all_privileges(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        (Default: `false`) Grant all privileges on the database role.
        """
        return pulumi.get(self, "all_privileges")

    @all_privileges.setter
    def all_privileges(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "all_privileges", value)

    @_builtins.property
    @pulumi.getter(name="alwaysApply")
    def always_apply(self) -> Optional[pulumi.Input[_builtins.bool]]:
        return pulumi.get(self, "always_apply")

    @always_apply.setter
    def always_apply(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "always_apply", value)

    @_builtins.property
    @pulumi.getter(name="alwaysApplyTrigger")
    def always_apply_trigger(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        (Default: ``) This is a helper field and should not be set. Its main purpose is to help to achieve the functionality described by the always_apply field.
        """
        return pulumi.get(self, "always_apply_trigger")

    @always_apply_trigger.setter
    def always_apply_trigger(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "always_apply_trigger", value)

    @_builtins.property
    @pulumi.getter(name="databaseRoleName")
    def database_role_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The fully qualified name of the database role to which privileges will be granted. For more information about this resource, see docs.
        """
        return pulumi.get(self, "database_role_name")

    @database_role_name.setter
    def database_role_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "database_role_name", value)

    @_builtins.property
    @pulumi.getter(name="onDatabase")
    def on_database(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The fully qualified name of the database on which privileges will be granted. For more information about this resource, see docs.
        """
        return pulumi.get(self, "on_database")

    @on_database.setter
    def on_database(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "on_database", value)

    @_builtins.property
    @pulumi.getter(name="onSchema")
    def on_schema(self) -> Optional[pulumi.Input['GrantPrivilegesToDatabaseRoleOnSchemaArgs']]:
        """
        Specifies the schema on which privileges will be granted.
        """
        return pulumi.get(self, "on_schema")

    @on_schema.setter
    def on_schema(self, value: Optional[pulumi.Input['GrantPrivilegesToDatabaseRoleOnSchemaArgs']]):
        pulumi.set(self, "on_schema", value)

    @_builtins.property
    @pulumi.getter(name="onSchemaObject")
    def on_schema_object(self) -> Optional[pulumi.Input['GrantPrivilegesToDatabaseRoleOnSchemaObjectArgs']]:
        """
        Specifies the schema object on which privileges will be granted.
        """
        return pulumi.get(self, "on_schema_object")

    @on_schema_object.setter
    def on_schema_object(self, value: Optional[pulumi.Input['GrantPrivilegesToDatabaseRoleOnSchemaObjectArgs']]):
        pulumi.set(self, "on_schema_object", value)

    @_builtins.property
    @pulumi.getter
    def privileges(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]:
        """
        The privileges to grant on the database role.
        """
        return pulumi.get(self, "privileges")

    @privileges.setter
    def privileges(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "privileges", value)

    @_builtins.property
    @pulumi.getter(name="withGrantOption")
    def with_grant_option(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        (Default: `false`) If specified, allows the recipient role to grant the privileges to other roles.
        """
        return pulumi.get(self, "with_grant_option")

    @with_grant_option.setter
    def with_grant_option(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "with_grant_option", value)


@pulumi.type_token("snowflake:index/grantPrivilegesToDatabaseRole:GrantPrivilegesToDatabaseRole")
class GrantPrivilegesToDatabaseRole(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 all_privileges: Optional[pulumi.Input[_builtins.bool]] = None,
                 always_apply: Optional[pulumi.Input[_builtins.bool]] = None,
                 always_apply_trigger: Optional[pulumi.Input[_builtins.str]] = None,
                 database_role_name: Optional[pulumi.Input[_builtins.str]] = None,
                 on_database: Optional[pulumi.Input[_builtins.str]] = None,
                 on_schema: Optional[pulumi.Input[Union['GrantPrivilegesToDatabaseRoleOnSchemaArgs', 'GrantPrivilegesToDatabaseRoleOnSchemaArgsDict']]] = None,
                 on_schema_object: Optional[pulumi.Input[Union['GrantPrivilegesToDatabaseRoleOnSchemaObjectArgs', 'GrantPrivilegesToDatabaseRoleOnSchemaObjectArgsDict']]] = None,
                 privileges: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 with_grant_option: Optional[pulumi.Input[_builtins.bool]] = None,
                 __props__=None):
        """
        ## Import

        ### Import examples

        #### Grant all privileges OnDatabase

        ```sh
        $ pulumi import snowflake:index/grantPrivilegesToDatabaseRole:GrantPrivilegesToDatabaseRole example '"test_db"."test_db_role"|false|false|ALL|OnDatabase|"test_db"'`
        ```

        #### Grant list of privileges OnAllSchemasInDatabase

        ```sh
        $ pulumi import snowflake:index/grantPrivilegesToDatabaseRole:GrantPrivilegesToDatabaseRole example '"test_db"."test_db_role"|false|false|CREATE TAG,CREATE TABLE|OnSchema|OnAllSchemasInDatabase|"test_db"'`
        ```

        #### Grant list of privileges on table

        ```sh
        $ pulumi import snowflake:index/grantPrivilegesToDatabaseRole:GrantPrivilegesToDatabaseRole example '"test_db"."test_db_role"|false|false|SELECT,DELETE,INSERT|OnSchemaObject|OnObject|TABLE|"test_db"."test_schema"."test_table"'`
        ```

        #### Grant list of privileges OnAll tables in schema

        ```sh
        $ pulumi import snowflake:index/grantPrivilegesToDatabaseRole:GrantPrivilegesToDatabaseRole example '"test_db"."test_db_role"|false|false|SELECT,DELETE,INSERT|OnSchemaObject|OnAll|TABLES|InSchema|"test_db"."test_schema"'`
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.bool] all_privileges: (Default: `false`) Grant all privileges on the database role.
        :param pulumi.Input[_builtins.str] always_apply_trigger: (Default: ``) This is a helper field and should not be set. Its main purpose is to help to achieve the functionality described by the always_apply field.
        :param pulumi.Input[_builtins.str] database_role_name: The fully qualified name of the database role to which privileges will be granted. For more information about this resource, see docs.
        :param pulumi.Input[_builtins.str] on_database: The fully qualified name of the database on which privileges will be granted. For more information about this resource, see docs.
        :param pulumi.Input[Union['GrantPrivilegesToDatabaseRoleOnSchemaArgs', 'GrantPrivilegesToDatabaseRoleOnSchemaArgsDict']] on_schema: Specifies the schema on which privileges will be granted.
        :param pulumi.Input[Union['GrantPrivilegesToDatabaseRoleOnSchemaObjectArgs', 'GrantPrivilegesToDatabaseRoleOnSchemaObjectArgsDict']] on_schema_object: Specifies the schema object on which privileges will be granted.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] privileges: The privileges to grant on the database role.
        :param pulumi.Input[_builtins.bool] with_grant_option: (Default: `false`) If specified, allows the recipient role to grant the privileges to other roles.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: GrantPrivilegesToDatabaseRoleArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Import

        ### Import examples

        #### Grant all privileges OnDatabase

        ```sh
        $ pulumi import snowflake:index/grantPrivilegesToDatabaseRole:GrantPrivilegesToDatabaseRole example '"test_db"."test_db_role"|false|false|ALL|OnDatabase|"test_db"'`
        ```

        #### Grant list of privileges OnAllSchemasInDatabase

        ```sh
        $ pulumi import snowflake:index/grantPrivilegesToDatabaseRole:GrantPrivilegesToDatabaseRole example '"test_db"."test_db_role"|false|false|CREATE TAG,CREATE TABLE|OnSchema|OnAllSchemasInDatabase|"test_db"'`
        ```

        #### Grant list of privileges on table

        ```sh
        $ pulumi import snowflake:index/grantPrivilegesToDatabaseRole:GrantPrivilegesToDatabaseRole example '"test_db"."test_db_role"|false|false|SELECT,DELETE,INSERT|OnSchemaObject|OnObject|TABLE|"test_db"."test_schema"."test_table"'`
        ```

        #### Grant list of privileges OnAll tables in schema

        ```sh
        $ pulumi import snowflake:index/grantPrivilegesToDatabaseRole:GrantPrivilegesToDatabaseRole example '"test_db"."test_db_role"|false|false|SELECT,DELETE,INSERT|OnSchemaObject|OnAll|TABLES|InSchema|"test_db"."test_schema"'`
        ```

        :param str resource_name: The name of the resource.
        :param GrantPrivilegesToDatabaseRoleArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(GrantPrivilegesToDatabaseRoleArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 all_privileges: Optional[pulumi.Input[_builtins.bool]] = None,
                 always_apply: Optional[pulumi.Input[_builtins.bool]] = None,
                 always_apply_trigger: Optional[pulumi.Input[_builtins.str]] = None,
                 database_role_name: Optional[pulumi.Input[_builtins.str]] = None,
                 on_database: Optional[pulumi.Input[_builtins.str]] = None,
                 on_schema: Optional[pulumi.Input[Union['GrantPrivilegesToDatabaseRoleOnSchemaArgs', 'GrantPrivilegesToDatabaseRoleOnSchemaArgsDict']]] = None,
                 on_schema_object: Optional[pulumi.Input[Union['GrantPrivilegesToDatabaseRoleOnSchemaObjectArgs', 'GrantPrivilegesToDatabaseRoleOnSchemaObjectArgsDict']]] = None,
                 privileges: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 with_grant_option: Optional[pulumi.Input[_builtins.bool]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = GrantPrivilegesToDatabaseRoleArgs.__new__(GrantPrivilegesToDatabaseRoleArgs)

            __props__.__dict__["all_privileges"] = all_privileges
            __props__.__dict__["always_apply"] = always_apply
            __props__.__dict__["always_apply_trigger"] = always_apply_trigger
            if database_role_name is None and not opts.urn:
                raise TypeError("Missing required property 'database_role_name'")
            __props__.__dict__["database_role_name"] = database_role_name
            __props__.__dict__["on_database"] = on_database
            __props__.__dict__["on_schema"] = on_schema
            __props__.__dict__["on_schema_object"] = on_schema_object
            __props__.__dict__["privileges"] = privileges
            __props__.__dict__["with_grant_option"] = with_grant_option
        super(GrantPrivilegesToDatabaseRole, __self__).__init__(
            'snowflake:index/grantPrivilegesToDatabaseRole:GrantPrivilegesToDatabaseRole',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            all_privileges: Optional[pulumi.Input[_builtins.bool]] = None,
            always_apply: Optional[pulumi.Input[_builtins.bool]] = None,
            always_apply_trigger: Optional[pulumi.Input[_builtins.str]] = None,
            database_role_name: Optional[pulumi.Input[_builtins.str]] = None,
            on_database: Optional[pulumi.Input[_builtins.str]] = None,
            on_schema: Optional[pulumi.Input[Union['GrantPrivilegesToDatabaseRoleOnSchemaArgs', 'GrantPrivilegesToDatabaseRoleOnSchemaArgsDict']]] = None,
            on_schema_object: Optional[pulumi.Input[Union['GrantPrivilegesToDatabaseRoleOnSchemaObjectArgs', 'GrantPrivilegesToDatabaseRoleOnSchemaObjectArgsDict']]] = None,
            privileges: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
            with_grant_option: Optional[pulumi.Input[_builtins.bool]] = None) -> 'GrantPrivilegesToDatabaseRole':
        """
        Get an existing GrantPrivilegesToDatabaseRole resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.bool] all_privileges: (Default: `false`) Grant all privileges on the database role.
        :param pulumi.Input[_builtins.str] always_apply_trigger: (Default: ``) This is a helper field and should not be set. Its main purpose is to help to achieve the functionality described by the always_apply field.
        :param pulumi.Input[_builtins.str] database_role_name: The fully qualified name of the database role to which privileges will be granted. For more information about this resource, see docs.
        :param pulumi.Input[_builtins.str] on_database: The fully qualified name of the database on which privileges will be granted. For more information about this resource, see docs.
        :param pulumi.Input[Union['GrantPrivilegesToDatabaseRoleOnSchemaArgs', 'GrantPrivilegesToDatabaseRoleOnSchemaArgsDict']] on_schema: Specifies the schema on which privileges will be granted.
        :param pulumi.Input[Union['GrantPrivilegesToDatabaseRoleOnSchemaObjectArgs', 'GrantPrivilegesToDatabaseRoleOnSchemaObjectArgsDict']] on_schema_object: Specifies the schema object on which privileges will be granted.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] privileges: The privileges to grant on the database role.
        :param pulumi.Input[_builtins.bool] with_grant_option: (Default: `false`) If specified, allows the recipient role to grant the privileges to other roles.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _GrantPrivilegesToDatabaseRoleState.__new__(_GrantPrivilegesToDatabaseRoleState)

        __props__.__dict__["all_privileges"] = all_privileges
        __props__.__dict__["always_apply"] = always_apply
        __props__.__dict__["always_apply_trigger"] = always_apply_trigger
        __props__.__dict__["database_role_name"] = database_role_name
        __props__.__dict__["on_database"] = on_database
        __props__.__dict__["on_schema"] = on_schema
        __props__.__dict__["on_schema_object"] = on_schema_object
        __props__.__dict__["privileges"] = privileges
        __props__.__dict__["with_grant_option"] = with_grant_option
        return GrantPrivilegesToDatabaseRole(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="allPrivileges")
    def all_privileges(self) -> pulumi.Output[Optional[_builtins.bool]]:
        """
        (Default: `false`) Grant all privileges on the database role.
        """
        return pulumi.get(self, "all_privileges")

    @_builtins.property
    @pulumi.getter(name="alwaysApply")
    def always_apply(self) -> pulumi.Output[Optional[_builtins.bool]]:
        return pulumi.get(self, "always_apply")

    @_builtins.property
    @pulumi.getter(name="alwaysApplyTrigger")
    def always_apply_trigger(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        (Default: ``) This is a helper field and should not be set. Its main purpose is to help to achieve the functionality described by the always_apply field.
        """
        return pulumi.get(self, "always_apply_trigger")

    @_builtins.property
    @pulumi.getter(name="databaseRoleName")
    def database_role_name(self) -> pulumi.Output[_builtins.str]:
        """
        The fully qualified name of the database role to which privileges will be granted. For more information about this resource, see docs.
        """
        return pulumi.get(self, "database_role_name")

    @_builtins.property
    @pulumi.getter(name="onDatabase")
    def on_database(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        The fully qualified name of the database on which privileges will be granted. For more information about this resource, see docs.
        """
        return pulumi.get(self, "on_database")

    @_builtins.property
    @pulumi.getter(name="onSchema")
    def on_schema(self) -> pulumi.Output[Optional['outputs.GrantPrivilegesToDatabaseRoleOnSchema']]:
        """
        Specifies the schema on which privileges will be granted.
        """
        return pulumi.get(self, "on_schema")

    @_builtins.property
    @pulumi.getter(name="onSchemaObject")
    def on_schema_object(self) -> pulumi.Output[Optional['outputs.GrantPrivilegesToDatabaseRoleOnSchemaObject']]:
        """
        Specifies the schema object on which privileges will be granted.
        """
        return pulumi.get(self, "on_schema_object")

    @_builtins.property
    @pulumi.getter
    def privileges(self) -> pulumi.Output[Optional[Sequence[_builtins.str]]]:
        """
        The privileges to grant on the database role.
        """
        return pulumi.get(self, "privileges")

    @_builtins.property
    @pulumi.getter(name="withGrantOption")
    def with_grant_option(self) -> pulumi.Output[Optional[_builtins.bool]]:
        """
        (Default: `false`) If specified, allows the recipient role to grant the privileges to other roles.
        """
        return pulumi.get(self, "with_grant_option")

