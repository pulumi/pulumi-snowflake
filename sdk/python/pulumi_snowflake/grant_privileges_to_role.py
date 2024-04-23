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

__all__ = ['GrantPrivilegesToRoleArgs', 'GrantPrivilegesToRole']

@pulumi.input_type
class GrantPrivilegesToRoleArgs:
    def __init__(__self__, *,
                 role_name: pulumi.Input[str],
                 all_privileges: Optional[pulumi.Input[bool]] = None,
                 on_account: Optional[pulumi.Input[bool]] = None,
                 on_account_object: Optional[pulumi.Input['GrantPrivilegesToRoleOnAccountObjectArgs']] = None,
                 on_schema: Optional[pulumi.Input['GrantPrivilegesToRoleOnSchemaArgs']] = None,
                 on_schema_object: Optional[pulumi.Input['GrantPrivilegesToRoleOnSchemaObjectArgs']] = None,
                 privileges: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 with_grant_option: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a GrantPrivilegesToRole resource.
        :param pulumi.Input[str] role_name: The fully qualified name of the role to which privileges will be granted.
        :param pulumi.Input[bool] all_privileges: Grant all privileges on the account role.
        :param pulumi.Input[bool] on_account: If true, the privileges will be granted on the account.
        :param pulumi.Input['GrantPrivilegesToRoleOnAccountObjectArgs'] on_account_object: Specifies the account object on which privileges will be granted
        :param pulumi.Input['GrantPrivilegesToRoleOnSchemaArgs'] on_schema: Specifies the schema on which privileges will be granted.
        :param pulumi.Input['GrantPrivilegesToRoleOnSchemaObjectArgs'] on_schema_object: Specifies the schema object on which privileges will be granted.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] privileges: The privileges to grant on the account role.
        :param pulumi.Input[bool] with_grant_option: Specifies whether the grantee can grant the privileges to other users.
        """
        pulumi.set(__self__, "role_name", role_name)
        if all_privileges is not None:
            pulumi.set(__self__, "all_privileges", all_privileges)
        if on_account is not None:
            pulumi.set(__self__, "on_account", on_account)
        if on_account_object is not None:
            pulumi.set(__self__, "on_account_object", on_account_object)
        if on_schema is not None:
            pulumi.set(__self__, "on_schema", on_schema)
        if on_schema_object is not None:
            pulumi.set(__self__, "on_schema_object", on_schema_object)
        if privileges is not None:
            pulumi.set(__self__, "privileges", privileges)
        if with_grant_option is not None:
            pulumi.set(__self__, "with_grant_option", with_grant_option)

    @property
    @pulumi.getter(name="roleName")
    def role_name(self) -> pulumi.Input[str]:
        """
        The fully qualified name of the role to which privileges will be granted.
        """
        return pulumi.get(self, "role_name")

    @role_name.setter
    def role_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "role_name", value)

    @property
    @pulumi.getter(name="allPrivileges")
    def all_privileges(self) -> Optional[pulumi.Input[bool]]:
        """
        Grant all privileges on the account role.
        """
        return pulumi.get(self, "all_privileges")

    @all_privileges.setter
    def all_privileges(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "all_privileges", value)

    @property
    @pulumi.getter(name="onAccount")
    def on_account(self) -> Optional[pulumi.Input[bool]]:
        """
        If true, the privileges will be granted on the account.
        """
        return pulumi.get(self, "on_account")

    @on_account.setter
    def on_account(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "on_account", value)

    @property
    @pulumi.getter(name="onAccountObject")
    def on_account_object(self) -> Optional[pulumi.Input['GrantPrivilegesToRoleOnAccountObjectArgs']]:
        """
        Specifies the account object on which privileges will be granted
        """
        return pulumi.get(self, "on_account_object")

    @on_account_object.setter
    def on_account_object(self, value: Optional[pulumi.Input['GrantPrivilegesToRoleOnAccountObjectArgs']]):
        pulumi.set(self, "on_account_object", value)

    @property
    @pulumi.getter(name="onSchema")
    def on_schema(self) -> Optional[pulumi.Input['GrantPrivilegesToRoleOnSchemaArgs']]:
        """
        Specifies the schema on which privileges will be granted.
        """
        return pulumi.get(self, "on_schema")

    @on_schema.setter
    def on_schema(self, value: Optional[pulumi.Input['GrantPrivilegesToRoleOnSchemaArgs']]):
        pulumi.set(self, "on_schema", value)

    @property
    @pulumi.getter(name="onSchemaObject")
    def on_schema_object(self) -> Optional[pulumi.Input['GrantPrivilegesToRoleOnSchemaObjectArgs']]:
        """
        Specifies the schema object on which privileges will be granted.
        """
        return pulumi.get(self, "on_schema_object")

    @on_schema_object.setter
    def on_schema_object(self, value: Optional[pulumi.Input['GrantPrivilegesToRoleOnSchemaObjectArgs']]):
        pulumi.set(self, "on_schema_object", value)

    @property
    @pulumi.getter
    def privileges(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The privileges to grant on the account role.
        """
        return pulumi.get(self, "privileges")

    @privileges.setter
    def privileges(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "privileges", value)

    @property
    @pulumi.getter(name="withGrantOption")
    def with_grant_option(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether the grantee can grant the privileges to other users.
        """
        return pulumi.get(self, "with_grant_option")

    @with_grant_option.setter
    def with_grant_option(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "with_grant_option", value)


@pulumi.input_type
class _GrantPrivilegesToRoleState:
    def __init__(__self__, *,
                 all_privileges: Optional[pulumi.Input[bool]] = None,
                 on_account: Optional[pulumi.Input[bool]] = None,
                 on_account_object: Optional[pulumi.Input['GrantPrivilegesToRoleOnAccountObjectArgs']] = None,
                 on_schema: Optional[pulumi.Input['GrantPrivilegesToRoleOnSchemaArgs']] = None,
                 on_schema_object: Optional[pulumi.Input['GrantPrivilegesToRoleOnSchemaObjectArgs']] = None,
                 privileges: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 role_name: Optional[pulumi.Input[str]] = None,
                 with_grant_option: Optional[pulumi.Input[bool]] = None):
        """
        Input properties used for looking up and filtering GrantPrivilegesToRole resources.
        :param pulumi.Input[bool] all_privileges: Grant all privileges on the account role.
        :param pulumi.Input[bool] on_account: If true, the privileges will be granted on the account.
        :param pulumi.Input['GrantPrivilegesToRoleOnAccountObjectArgs'] on_account_object: Specifies the account object on which privileges will be granted
        :param pulumi.Input['GrantPrivilegesToRoleOnSchemaArgs'] on_schema: Specifies the schema on which privileges will be granted.
        :param pulumi.Input['GrantPrivilegesToRoleOnSchemaObjectArgs'] on_schema_object: Specifies the schema object on which privileges will be granted.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] privileges: The privileges to grant on the account role.
        :param pulumi.Input[str] role_name: The fully qualified name of the role to which privileges will be granted.
        :param pulumi.Input[bool] with_grant_option: Specifies whether the grantee can grant the privileges to other users.
        """
        if all_privileges is not None:
            pulumi.set(__self__, "all_privileges", all_privileges)
        if on_account is not None:
            pulumi.set(__self__, "on_account", on_account)
        if on_account_object is not None:
            pulumi.set(__self__, "on_account_object", on_account_object)
        if on_schema is not None:
            pulumi.set(__self__, "on_schema", on_schema)
        if on_schema_object is not None:
            pulumi.set(__self__, "on_schema_object", on_schema_object)
        if privileges is not None:
            pulumi.set(__self__, "privileges", privileges)
        if role_name is not None:
            pulumi.set(__self__, "role_name", role_name)
        if with_grant_option is not None:
            pulumi.set(__self__, "with_grant_option", with_grant_option)

    @property
    @pulumi.getter(name="allPrivileges")
    def all_privileges(self) -> Optional[pulumi.Input[bool]]:
        """
        Grant all privileges on the account role.
        """
        return pulumi.get(self, "all_privileges")

    @all_privileges.setter
    def all_privileges(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "all_privileges", value)

    @property
    @pulumi.getter(name="onAccount")
    def on_account(self) -> Optional[pulumi.Input[bool]]:
        """
        If true, the privileges will be granted on the account.
        """
        return pulumi.get(self, "on_account")

    @on_account.setter
    def on_account(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "on_account", value)

    @property
    @pulumi.getter(name="onAccountObject")
    def on_account_object(self) -> Optional[pulumi.Input['GrantPrivilegesToRoleOnAccountObjectArgs']]:
        """
        Specifies the account object on which privileges will be granted
        """
        return pulumi.get(self, "on_account_object")

    @on_account_object.setter
    def on_account_object(self, value: Optional[pulumi.Input['GrantPrivilegesToRoleOnAccountObjectArgs']]):
        pulumi.set(self, "on_account_object", value)

    @property
    @pulumi.getter(name="onSchema")
    def on_schema(self) -> Optional[pulumi.Input['GrantPrivilegesToRoleOnSchemaArgs']]:
        """
        Specifies the schema on which privileges will be granted.
        """
        return pulumi.get(self, "on_schema")

    @on_schema.setter
    def on_schema(self, value: Optional[pulumi.Input['GrantPrivilegesToRoleOnSchemaArgs']]):
        pulumi.set(self, "on_schema", value)

    @property
    @pulumi.getter(name="onSchemaObject")
    def on_schema_object(self) -> Optional[pulumi.Input['GrantPrivilegesToRoleOnSchemaObjectArgs']]:
        """
        Specifies the schema object on which privileges will be granted.
        """
        return pulumi.get(self, "on_schema_object")

    @on_schema_object.setter
    def on_schema_object(self, value: Optional[pulumi.Input['GrantPrivilegesToRoleOnSchemaObjectArgs']]):
        pulumi.set(self, "on_schema_object", value)

    @property
    @pulumi.getter
    def privileges(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The privileges to grant on the account role.
        """
        return pulumi.get(self, "privileges")

    @privileges.setter
    def privileges(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "privileges", value)

    @property
    @pulumi.getter(name="roleName")
    def role_name(self) -> Optional[pulumi.Input[str]]:
        """
        The fully qualified name of the role to which privileges will be granted.
        """
        return pulumi.get(self, "role_name")

    @role_name.setter
    def role_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "role_name", value)

    @property
    @pulumi.getter(name="withGrantOption")
    def with_grant_option(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether the grantee can grant the privileges to other users.
        """
        return pulumi.get(self, "with_grant_option")

    @with_grant_option.setter
    def with_grant_option(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "with_grant_option", value)


class GrantPrivilegesToRole(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 all_privileges: Optional[pulumi.Input[bool]] = None,
                 on_account: Optional[pulumi.Input[bool]] = None,
                 on_account_object: Optional[pulumi.Input[pulumi.InputType['GrantPrivilegesToRoleOnAccountObjectArgs']]] = None,
                 on_schema: Optional[pulumi.Input[pulumi.InputType['GrantPrivilegesToRoleOnSchemaArgs']]] = None,
                 on_schema_object: Optional[pulumi.Input[pulumi.InputType['GrantPrivilegesToRoleOnSchemaObjectArgs']]] = None,
                 privileges: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 role_name: Optional[pulumi.Input[str]] = None,
                 with_grant_option: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        """
        > **Deprecation** This resource is deprecated and will be removed in a future major version release. Please use GrantPrivilegesToAccountRole instead. <deprecation>

        ## Example Usage

        ```python
        import pulumi
        import pulumi_snowflake as snowflake

        ##################################
        ### global privileges
        ##################################
        # list of privileges
        g1 = snowflake.GrantPrivilegesToRole("g1",
            privileges=[
                "MODIFY",
                "USAGE",
            ],
            role_name=r["name"],
            on_account=True)
        # all privileges + grant option
        g2 = snowflake.GrantPrivilegesToRole("g2",
            role_name=r["name"],
            on_account=True,
            all_privileges=True,
            with_grant_option=True)
        ##################################
        ### account object privileges
        ##################################
        # list of privileges
        g3 = snowflake.GrantPrivilegesToRole("g3",
            privileges=[
                "CREATE",
                "MONITOR",
            ],
            role_name=r["name"],
            on_account_object=snowflake.GrantPrivilegesToRoleOnAccountObjectArgs(
                object_type="DATABASE",
                object_name=d["name"],
            ))
        # all privileges + grant option
        g4 = snowflake.GrantPrivilegesToRole("g4",
            role_name=r["name"],
            on_account_object=snowflake.GrantPrivilegesToRoleOnAccountObjectArgs(
                object_type="DATABASE",
                object_name=d["name"],
            ),
            all_privileges=True,
            with_grant_option=True)
        ##################################
        ### schema privileges
        ##################################
        # list of privileges
        g5 = snowflake.GrantPrivilegesToRole("g5",
            privileges=[
                "MODIFY",
                "CREATE TABLE",
            ],
            role_name=r["name"],
            on_schema=snowflake.GrantPrivilegesToRoleOnSchemaArgs(
                schema_name="\\"my_db\\".\\"my_schema\\"",
            ))
        # all privileges + grant option
        g6 = snowflake.GrantPrivilegesToRole("g6",
            role_name=r["name"],
            on_schema=snowflake.GrantPrivilegesToRoleOnSchemaArgs(
                schema_name="\\"my_db\\".\\"my_schema\\"",
            ),
            all_privileges=True,
            with_grant_option=True)
        # all schemas in database
        g7 = snowflake.GrantPrivilegesToRole("g7",
            privileges=[
                "MODIFY",
                "CREATE TABLE",
            ],
            role_name=r["name"],
            on_schema=snowflake.GrantPrivilegesToRoleOnSchemaArgs(
                all_schemas_in_database=d["name"],
            ))
        # future schemas in database
        g8 = snowflake.GrantPrivilegesToRole("g8",
            privileges=[
                "MODIFY",
                "CREATE TABLE",
            ],
            role_name=r["name"],
            on_schema=snowflake.GrantPrivilegesToRoleOnSchemaArgs(
                future_schemas_in_database=d["name"],
            ))
        ##################################
        ### schema object privileges
        ##################################
        # list of privileges
        g9 = snowflake.GrantPrivilegesToRole("g9",
            privileges=[
                "SELECT",
                "REFERENCES",
            ],
            role_name=r["name"],
            on_schema_object=snowflake.GrantPrivilegesToRoleOnSchemaObjectArgs(
                object_type="VIEW",
                object_name="\\"my_db\\".\\"my_schema\\".\\"my_view\\"",
            ))
        # all privileges + grant option
        g10 = snowflake.GrantPrivilegesToRole("g10",
            role_name=r["name"],
            on_schema_object=snowflake.GrantPrivilegesToRoleOnSchemaObjectArgs(
                object_type="VIEW",
                object_name="\\"my_db\\".\\"my_schema\\".\\"my_view\\"",
            ),
            all_privileges=True,
            with_grant_option=True)
        # all in database
        g11 = snowflake.GrantPrivilegesToRole("g11",
            privileges=[
                "SELECT",
                "INSERT",
            ],
            role_name=r["name"],
            on_schema_object=snowflake.GrantPrivilegesToRoleOnSchemaObjectArgs(
                all=snowflake.GrantPrivilegesToRoleOnSchemaObjectAllArgs(
                    object_type_plural="TABLES",
                    in_database=d["name"],
                ),
            ))
        # all in schema
        g12 = snowflake.GrantPrivilegesToRole("g12",
            privileges=[
                "SELECT",
                "INSERT",
            ],
            role_name=r["name"],
            on_schema_object=snowflake.GrantPrivilegesToRoleOnSchemaObjectArgs(
                all=snowflake.GrantPrivilegesToRoleOnSchemaObjectAllArgs(
                    object_type_plural="TABLES",
                    in_schema="\\"my_db\\".\\"my_schema\\"",
                ),
            ))
        # future in database
        g13 = snowflake.GrantPrivilegesToRole("g13",
            privileges=[
                "SELECT",
                "INSERT",
            ],
            role_name=r["name"],
            on_schema_object=snowflake.GrantPrivilegesToRoleOnSchemaObjectArgs(
                future=snowflake.GrantPrivilegesToRoleOnSchemaObjectFutureArgs(
                    object_type_plural="TABLES",
                    in_database=d["name"],
                ),
            ))
        # future in schema
        g14 = snowflake.GrantPrivilegesToRole("g14",
            privileges=[
                "SELECT",
                "INSERT",
            ],
            role_name=r["name"],
            on_schema_object=snowflake.GrantPrivilegesToRoleOnSchemaObjectArgs(
                future=snowflake.GrantPrivilegesToRoleOnSchemaObjectFutureArgs(
                    object_type_plural="TABLES",
                    in_schema="\\"my_db\\".\\"my_schema\\"",
                ),
            ))
        ```

        ## Import

        format is role_name (string) | privileges (comma-delimited string) | all_privileges (bool) |with_grant_option (bool) | on_account (bool) | on_account_object (bool) | on_schema (bool) | on_schema_object (bool) | all (bool) | future (bool) | object_type (string) | object_name (string) | object_type_plural (string) | in_schema (bool) | schema_name (string) | in_database (bool) | database_name (string)

        ```sh
        $ pulumi import snowflake:index/grantPrivilegesToRole:GrantPrivilegesToRole "test_role|MANAGE GRANTS,MONITOR USAGE|false|false|true|false|false|false|false|false||||false||false|"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] all_privileges: Grant all privileges on the account role.
        :param pulumi.Input[bool] on_account: If true, the privileges will be granted on the account.
        :param pulumi.Input[pulumi.InputType['GrantPrivilegesToRoleOnAccountObjectArgs']] on_account_object: Specifies the account object on which privileges will be granted
        :param pulumi.Input[pulumi.InputType['GrantPrivilegesToRoleOnSchemaArgs']] on_schema: Specifies the schema on which privileges will be granted.
        :param pulumi.Input[pulumi.InputType['GrantPrivilegesToRoleOnSchemaObjectArgs']] on_schema_object: Specifies the schema object on which privileges will be granted.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] privileges: The privileges to grant on the account role.
        :param pulumi.Input[str] role_name: The fully qualified name of the role to which privileges will be granted.
        :param pulumi.Input[bool] with_grant_option: Specifies whether the grantee can grant the privileges to other users.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: GrantPrivilegesToRoleArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        > **Deprecation** This resource is deprecated and will be removed in a future major version release. Please use GrantPrivilegesToAccountRole instead. <deprecation>

        ## Example Usage

        ```python
        import pulumi
        import pulumi_snowflake as snowflake

        ##################################
        ### global privileges
        ##################################
        # list of privileges
        g1 = snowflake.GrantPrivilegesToRole("g1",
            privileges=[
                "MODIFY",
                "USAGE",
            ],
            role_name=r["name"],
            on_account=True)
        # all privileges + grant option
        g2 = snowflake.GrantPrivilegesToRole("g2",
            role_name=r["name"],
            on_account=True,
            all_privileges=True,
            with_grant_option=True)
        ##################################
        ### account object privileges
        ##################################
        # list of privileges
        g3 = snowflake.GrantPrivilegesToRole("g3",
            privileges=[
                "CREATE",
                "MONITOR",
            ],
            role_name=r["name"],
            on_account_object=snowflake.GrantPrivilegesToRoleOnAccountObjectArgs(
                object_type="DATABASE",
                object_name=d["name"],
            ))
        # all privileges + grant option
        g4 = snowflake.GrantPrivilegesToRole("g4",
            role_name=r["name"],
            on_account_object=snowflake.GrantPrivilegesToRoleOnAccountObjectArgs(
                object_type="DATABASE",
                object_name=d["name"],
            ),
            all_privileges=True,
            with_grant_option=True)
        ##################################
        ### schema privileges
        ##################################
        # list of privileges
        g5 = snowflake.GrantPrivilegesToRole("g5",
            privileges=[
                "MODIFY",
                "CREATE TABLE",
            ],
            role_name=r["name"],
            on_schema=snowflake.GrantPrivilegesToRoleOnSchemaArgs(
                schema_name="\\"my_db\\".\\"my_schema\\"",
            ))
        # all privileges + grant option
        g6 = snowflake.GrantPrivilegesToRole("g6",
            role_name=r["name"],
            on_schema=snowflake.GrantPrivilegesToRoleOnSchemaArgs(
                schema_name="\\"my_db\\".\\"my_schema\\"",
            ),
            all_privileges=True,
            with_grant_option=True)
        # all schemas in database
        g7 = snowflake.GrantPrivilegesToRole("g7",
            privileges=[
                "MODIFY",
                "CREATE TABLE",
            ],
            role_name=r["name"],
            on_schema=snowflake.GrantPrivilegesToRoleOnSchemaArgs(
                all_schemas_in_database=d["name"],
            ))
        # future schemas in database
        g8 = snowflake.GrantPrivilegesToRole("g8",
            privileges=[
                "MODIFY",
                "CREATE TABLE",
            ],
            role_name=r["name"],
            on_schema=snowflake.GrantPrivilegesToRoleOnSchemaArgs(
                future_schemas_in_database=d["name"],
            ))
        ##################################
        ### schema object privileges
        ##################################
        # list of privileges
        g9 = snowflake.GrantPrivilegesToRole("g9",
            privileges=[
                "SELECT",
                "REFERENCES",
            ],
            role_name=r["name"],
            on_schema_object=snowflake.GrantPrivilegesToRoleOnSchemaObjectArgs(
                object_type="VIEW",
                object_name="\\"my_db\\".\\"my_schema\\".\\"my_view\\"",
            ))
        # all privileges + grant option
        g10 = snowflake.GrantPrivilegesToRole("g10",
            role_name=r["name"],
            on_schema_object=snowflake.GrantPrivilegesToRoleOnSchemaObjectArgs(
                object_type="VIEW",
                object_name="\\"my_db\\".\\"my_schema\\".\\"my_view\\"",
            ),
            all_privileges=True,
            with_grant_option=True)
        # all in database
        g11 = snowflake.GrantPrivilegesToRole("g11",
            privileges=[
                "SELECT",
                "INSERT",
            ],
            role_name=r["name"],
            on_schema_object=snowflake.GrantPrivilegesToRoleOnSchemaObjectArgs(
                all=snowflake.GrantPrivilegesToRoleOnSchemaObjectAllArgs(
                    object_type_plural="TABLES",
                    in_database=d["name"],
                ),
            ))
        # all in schema
        g12 = snowflake.GrantPrivilegesToRole("g12",
            privileges=[
                "SELECT",
                "INSERT",
            ],
            role_name=r["name"],
            on_schema_object=snowflake.GrantPrivilegesToRoleOnSchemaObjectArgs(
                all=snowflake.GrantPrivilegesToRoleOnSchemaObjectAllArgs(
                    object_type_plural="TABLES",
                    in_schema="\\"my_db\\".\\"my_schema\\"",
                ),
            ))
        # future in database
        g13 = snowflake.GrantPrivilegesToRole("g13",
            privileges=[
                "SELECT",
                "INSERT",
            ],
            role_name=r["name"],
            on_schema_object=snowflake.GrantPrivilegesToRoleOnSchemaObjectArgs(
                future=snowflake.GrantPrivilegesToRoleOnSchemaObjectFutureArgs(
                    object_type_plural="TABLES",
                    in_database=d["name"],
                ),
            ))
        # future in schema
        g14 = snowflake.GrantPrivilegesToRole("g14",
            privileges=[
                "SELECT",
                "INSERT",
            ],
            role_name=r["name"],
            on_schema_object=snowflake.GrantPrivilegesToRoleOnSchemaObjectArgs(
                future=snowflake.GrantPrivilegesToRoleOnSchemaObjectFutureArgs(
                    object_type_plural="TABLES",
                    in_schema="\\"my_db\\".\\"my_schema\\"",
                ),
            ))
        ```

        ## Import

        format is role_name (string) | privileges (comma-delimited string) | all_privileges (bool) |with_grant_option (bool) | on_account (bool) | on_account_object (bool) | on_schema (bool) | on_schema_object (bool) | all (bool) | future (bool) | object_type (string) | object_name (string) | object_type_plural (string) | in_schema (bool) | schema_name (string) | in_database (bool) | database_name (string)

        ```sh
        $ pulumi import snowflake:index/grantPrivilegesToRole:GrantPrivilegesToRole "test_role|MANAGE GRANTS,MONITOR USAGE|false|false|true|false|false|false|false|false||||false||false|"
        ```

        :param str resource_name: The name of the resource.
        :param GrantPrivilegesToRoleArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(GrantPrivilegesToRoleArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 all_privileges: Optional[pulumi.Input[bool]] = None,
                 on_account: Optional[pulumi.Input[bool]] = None,
                 on_account_object: Optional[pulumi.Input[pulumi.InputType['GrantPrivilegesToRoleOnAccountObjectArgs']]] = None,
                 on_schema: Optional[pulumi.Input[pulumi.InputType['GrantPrivilegesToRoleOnSchemaArgs']]] = None,
                 on_schema_object: Optional[pulumi.Input[pulumi.InputType['GrantPrivilegesToRoleOnSchemaObjectArgs']]] = None,
                 privileges: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 role_name: Optional[pulumi.Input[str]] = None,
                 with_grant_option: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = GrantPrivilegesToRoleArgs.__new__(GrantPrivilegesToRoleArgs)

            __props__.__dict__["all_privileges"] = all_privileges
            __props__.__dict__["on_account"] = on_account
            __props__.__dict__["on_account_object"] = on_account_object
            __props__.__dict__["on_schema"] = on_schema
            __props__.__dict__["on_schema_object"] = on_schema_object
            __props__.__dict__["privileges"] = privileges
            if role_name is None and not opts.urn:
                raise TypeError("Missing required property 'role_name'")
            __props__.__dict__["role_name"] = role_name
            __props__.__dict__["with_grant_option"] = with_grant_option
        super(GrantPrivilegesToRole, __self__).__init__(
            'snowflake:index/grantPrivilegesToRole:GrantPrivilegesToRole',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            all_privileges: Optional[pulumi.Input[bool]] = None,
            on_account: Optional[pulumi.Input[bool]] = None,
            on_account_object: Optional[pulumi.Input[pulumi.InputType['GrantPrivilegesToRoleOnAccountObjectArgs']]] = None,
            on_schema: Optional[pulumi.Input[pulumi.InputType['GrantPrivilegesToRoleOnSchemaArgs']]] = None,
            on_schema_object: Optional[pulumi.Input[pulumi.InputType['GrantPrivilegesToRoleOnSchemaObjectArgs']]] = None,
            privileges: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            role_name: Optional[pulumi.Input[str]] = None,
            with_grant_option: Optional[pulumi.Input[bool]] = None) -> 'GrantPrivilegesToRole':
        """
        Get an existing GrantPrivilegesToRole resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] all_privileges: Grant all privileges on the account role.
        :param pulumi.Input[bool] on_account: If true, the privileges will be granted on the account.
        :param pulumi.Input[pulumi.InputType['GrantPrivilegesToRoleOnAccountObjectArgs']] on_account_object: Specifies the account object on which privileges will be granted
        :param pulumi.Input[pulumi.InputType['GrantPrivilegesToRoleOnSchemaArgs']] on_schema: Specifies the schema on which privileges will be granted.
        :param pulumi.Input[pulumi.InputType['GrantPrivilegesToRoleOnSchemaObjectArgs']] on_schema_object: Specifies the schema object on which privileges will be granted.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] privileges: The privileges to grant on the account role.
        :param pulumi.Input[str] role_name: The fully qualified name of the role to which privileges will be granted.
        :param pulumi.Input[bool] with_grant_option: Specifies whether the grantee can grant the privileges to other users.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _GrantPrivilegesToRoleState.__new__(_GrantPrivilegesToRoleState)

        __props__.__dict__["all_privileges"] = all_privileges
        __props__.__dict__["on_account"] = on_account
        __props__.__dict__["on_account_object"] = on_account_object
        __props__.__dict__["on_schema"] = on_schema
        __props__.__dict__["on_schema_object"] = on_schema_object
        __props__.__dict__["privileges"] = privileges
        __props__.__dict__["role_name"] = role_name
        __props__.__dict__["with_grant_option"] = with_grant_option
        return GrantPrivilegesToRole(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="allPrivileges")
    def all_privileges(self) -> pulumi.Output[Optional[bool]]:
        """
        Grant all privileges on the account role.
        """
        return pulumi.get(self, "all_privileges")

    @property
    @pulumi.getter(name="onAccount")
    def on_account(self) -> pulumi.Output[Optional[bool]]:
        """
        If true, the privileges will be granted on the account.
        """
        return pulumi.get(self, "on_account")

    @property
    @pulumi.getter(name="onAccountObject")
    def on_account_object(self) -> pulumi.Output[Optional['outputs.GrantPrivilegesToRoleOnAccountObject']]:
        """
        Specifies the account object on which privileges will be granted
        """
        return pulumi.get(self, "on_account_object")

    @property
    @pulumi.getter(name="onSchema")
    def on_schema(self) -> pulumi.Output[Optional['outputs.GrantPrivilegesToRoleOnSchema']]:
        """
        Specifies the schema on which privileges will be granted.
        """
        return pulumi.get(self, "on_schema")

    @property
    @pulumi.getter(name="onSchemaObject")
    def on_schema_object(self) -> pulumi.Output[Optional['outputs.GrantPrivilegesToRoleOnSchemaObject']]:
        """
        Specifies the schema object on which privileges will be granted.
        """
        return pulumi.get(self, "on_schema_object")

    @property
    @pulumi.getter
    def privileges(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        The privileges to grant on the account role.
        """
        return pulumi.get(self, "privileges")

    @property
    @pulumi.getter(name="roleName")
    def role_name(self) -> pulumi.Output[str]:
        """
        The fully qualified name of the role to which privileges will be granted.
        """
        return pulumi.get(self, "role_name")

    @property
    @pulumi.getter(name="withGrantOption")
    def with_grant_option(self) -> pulumi.Output[Optional[bool]]:
        """
        Specifies whether the grantee can grant the privileges to other users.
        """
        return pulumi.get(self, "with_grant_option")

