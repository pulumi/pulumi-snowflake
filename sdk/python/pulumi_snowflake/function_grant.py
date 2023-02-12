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

__all__ = ['FunctionGrantArgs', 'FunctionGrant']

@pulumi.input_type
class FunctionGrantArgs:
    def __init__(__self__, *,
                 database_name: pulumi.Input[str],
                 roles: pulumi.Input[Sequence[pulumi.Input[str]]],
                 argument_data_types: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 arguments: Optional[pulumi.Input[Sequence[pulumi.Input['FunctionGrantArgumentArgs']]]] = None,
                 enable_multiple_grants: Optional[pulumi.Input[bool]] = None,
                 function_name: Optional[pulumi.Input[str]] = None,
                 on_future: Optional[pulumi.Input[bool]] = None,
                 privilege: Optional[pulumi.Input[str]] = None,
                 return_type: Optional[pulumi.Input[str]] = None,
                 schema_name: Optional[pulumi.Input[str]] = None,
                 shares: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 with_grant_option: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a FunctionGrant resource.
        :param pulumi.Input[str] database_name: The name of the database containing the current or future functions on which to grant privileges.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] roles: Grants privilege to these roles.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] argument_data_types: List of the argument data types for the function (must be present if function has arguments and function_name is present)
        :param pulumi.Input[Sequence[pulumi.Input['FunctionGrantArgumentArgs']]] arguments: List of the arguments for the function (must be present if function has arguments and function_name is present)
        :param pulumi.Input[bool] enable_multiple_grants: When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
               grants applied to roles and objects outside Terraform.
        :param pulumi.Input[str] function_name: The name of the function on which to grant privileges immediately (only valid if on_future is false).
        :param pulumi.Input[bool] on_future: When this is set to true and a schema*name is provided, apply this grant on all future functions in the given schema. When this is true and no schema*name is provided apply this grant on all future functions in the given database. The function*name, arguments, return*type, and shares fields must be unset in order to use on_future.
        :param pulumi.Input[str] privilege: The privilege to grant on the current or future function. Must be one of `USAGE` or `OWNERSHIP`.
        :param pulumi.Input[str] return_type: The return type of the function (must be present if function_name is present)
        :param pulumi.Input[str] schema_name: The name of the schema containing the current or future functions on which to grant privileges.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] shares: Grants privilege to these shares (only valid if on_future is false).
        :param pulumi.Input[bool] with_grant_option: When this is set to true, allows the recipient role to grant the privileges to other roles.
        """
        pulumi.set(__self__, "database_name", database_name)
        pulumi.set(__self__, "roles", roles)
        if argument_data_types is not None:
            pulumi.set(__self__, "argument_data_types", argument_data_types)
        if arguments is not None:
            warnings.warn("""Use argument_data_types instead""", DeprecationWarning)
            pulumi.log.warn("""arguments is deprecated: Use argument_data_types instead""")
        if arguments is not None:
            pulumi.set(__self__, "arguments", arguments)
        if enable_multiple_grants is not None:
            pulumi.set(__self__, "enable_multiple_grants", enable_multiple_grants)
        if function_name is not None:
            pulumi.set(__self__, "function_name", function_name)
        if on_future is not None:
            pulumi.set(__self__, "on_future", on_future)
        if privilege is not None:
            pulumi.set(__self__, "privilege", privilege)
        if return_type is not None:
            warnings.warn("""Not used anymore""", DeprecationWarning)
            pulumi.log.warn("""return_type is deprecated: Not used anymore""")
        if return_type is not None:
            pulumi.set(__self__, "return_type", return_type)
        if schema_name is not None:
            pulumi.set(__self__, "schema_name", schema_name)
        if shares is not None:
            pulumi.set(__self__, "shares", shares)
        if with_grant_option is not None:
            pulumi.set(__self__, "with_grant_option", with_grant_option)

    @property
    @pulumi.getter(name="databaseName")
    def database_name(self) -> pulumi.Input[str]:
        """
        The name of the database containing the current or future functions on which to grant privileges.
        """
        return pulumi.get(self, "database_name")

    @database_name.setter
    def database_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "database_name", value)

    @property
    @pulumi.getter
    def roles(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        Grants privilege to these roles.
        """
        return pulumi.get(self, "roles")

    @roles.setter
    def roles(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "roles", value)

    @property
    @pulumi.getter(name="argumentDataTypes")
    def argument_data_types(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        List of the argument data types for the function (must be present if function has arguments and function_name is present)
        """
        return pulumi.get(self, "argument_data_types")

    @argument_data_types.setter
    def argument_data_types(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "argument_data_types", value)

    @property
    @pulumi.getter
    def arguments(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['FunctionGrantArgumentArgs']]]]:
        """
        List of the arguments for the function (must be present if function has arguments and function_name is present)
        """
        return pulumi.get(self, "arguments")

    @arguments.setter
    def arguments(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['FunctionGrantArgumentArgs']]]]):
        pulumi.set(self, "arguments", value)

    @property
    @pulumi.getter(name="enableMultipleGrants")
    def enable_multiple_grants(self) -> Optional[pulumi.Input[bool]]:
        """
        When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
        grants applied to roles and objects outside Terraform.
        """
        return pulumi.get(self, "enable_multiple_grants")

    @enable_multiple_grants.setter
    def enable_multiple_grants(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enable_multiple_grants", value)

    @property
    @pulumi.getter(name="functionName")
    def function_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the function on which to grant privileges immediately (only valid if on_future is false).
        """
        return pulumi.get(self, "function_name")

    @function_name.setter
    def function_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "function_name", value)

    @property
    @pulumi.getter(name="onFuture")
    def on_future(self) -> Optional[pulumi.Input[bool]]:
        """
        When this is set to true and a schema*name is provided, apply this grant on all future functions in the given schema. When this is true and no schema*name is provided apply this grant on all future functions in the given database. The function*name, arguments, return*type, and shares fields must be unset in order to use on_future.
        """
        return pulumi.get(self, "on_future")

    @on_future.setter
    def on_future(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "on_future", value)

    @property
    @pulumi.getter
    def privilege(self) -> Optional[pulumi.Input[str]]:
        """
        The privilege to grant on the current or future function. Must be one of `USAGE` or `OWNERSHIP`.
        """
        return pulumi.get(self, "privilege")

    @privilege.setter
    def privilege(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "privilege", value)

    @property
    @pulumi.getter(name="returnType")
    def return_type(self) -> Optional[pulumi.Input[str]]:
        """
        The return type of the function (must be present if function_name is present)
        """
        return pulumi.get(self, "return_type")

    @return_type.setter
    def return_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "return_type", value)

    @property
    @pulumi.getter(name="schemaName")
    def schema_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the schema containing the current or future functions on which to grant privileges.
        """
        return pulumi.get(self, "schema_name")

    @schema_name.setter
    def schema_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "schema_name", value)

    @property
    @pulumi.getter
    def shares(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Grants privilege to these shares (only valid if on_future is false).
        """
        return pulumi.get(self, "shares")

    @shares.setter
    def shares(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "shares", value)

    @property
    @pulumi.getter(name="withGrantOption")
    def with_grant_option(self) -> Optional[pulumi.Input[bool]]:
        """
        When this is set to true, allows the recipient role to grant the privileges to other roles.
        """
        return pulumi.get(self, "with_grant_option")

    @with_grant_option.setter
    def with_grant_option(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "with_grant_option", value)


@pulumi.input_type
class _FunctionGrantState:
    def __init__(__self__, *,
                 argument_data_types: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 arguments: Optional[pulumi.Input[Sequence[pulumi.Input['FunctionGrantArgumentArgs']]]] = None,
                 database_name: Optional[pulumi.Input[str]] = None,
                 enable_multiple_grants: Optional[pulumi.Input[bool]] = None,
                 function_name: Optional[pulumi.Input[str]] = None,
                 on_future: Optional[pulumi.Input[bool]] = None,
                 privilege: Optional[pulumi.Input[str]] = None,
                 return_type: Optional[pulumi.Input[str]] = None,
                 roles: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 schema_name: Optional[pulumi.Input[str]] = None,
                 shares: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 with_grant_option: Optional[pulumi.Input[bool]] = None):
        """
        Input properties used for looking up and filtering FunctionGrant resources.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] argument_data_types: List of the argument data types for the function (must be present if function has arguments and function_name is present)
        :param pulumi.Input[Sequence[pulumi.Input['FunctionGrantArgumentArgs']]] arguments: List of the arguments for the function (must be present if function has arguments and function_name is present)
        :param pulumi.Input[str] database_name: The name of the database containing the current or future functions on which to grant privileges.
        :param pulumi.Input[bool] enable_multiple_grants: When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
               grants applied to roles and objects outside Terraform.
        :param pulumi.Input[str] function_name: The name of the function on which to grant privileges immediately (only valid if on_future is false).
        :param pulumi.Input[bool] on_future: When this is set to true and a schema*name is provided, apply this grant on all future functions in the given schema. When this is true and no schema*name is provided apply this grant on all future functions in the given database. The function*name, arguments, return*type, and shares fields must be unset in order to use on_future.
        :param pulumi.Input[str] privilege: The privilege to grant on the current or future function. Must be one of `USAGE` or `OWNERSHIP`.
        :param pulumi.Input[str] return_type: The return type of the function (must be present if function_name is present)
        :param pulumi.Input[Sequence[pulumi.Input[str]]] roles: Grants privilege to these roles.
        :param pulumi.Input[str] schema_name: The name of the schema containing the current or future functions on which to grant privileges.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] shares: Grants privilege to these shares (only valid if on_future is false).
        :param pulumi.Input[bool] with_grant_option: When this is set to true, allows the recipient role to grant the privileges to other roles.
        """
        if argument_data_types is not None:
            pulumi.set(__self__, "argument_data_types", argument_data_types)
        if arguments is not None:
            warnings.warn("""Use argument_data_types instead""", DeprecationWarning)
            pulumi.log.warn("""arguments is deprecated: Use argument_data_types instead""")
        if arguments is not None:
            pulumi.set(__self__, "arguments", arguments)
        if database_name is not None:
            pulumi.set(__self__, "database_name", database_name)
        if enable_multiple_grants is not None:
            pulumi.set(__self__, "enable_multiple_grants", enable_multiple_grants)
        if function_name is not None:
            pulumi.set(__self__, "function_name", function_name)
        if on_future is not None:
            pulumi.set(__self__, "on_future", on_future)
        if privilege is not None:
            pulumi.set(__self__, "privilege", privilege)
        if return_type is not None:
            warnings.warn("""Not used anymore""", DeprecationWarning)
            pulumi.log.warn("""return_type is deprecated: Not used anymore""")
        if return_type is not None:
            pulumi.set(__self__, "return_type", return_type)
        if roles is not None:
            pulumi.set(__self__, "roles", roles)
        if schema_name is not None:
            pulumi.set(__self__, "schema_name", schema_name)
        if shares is not None:
            pulumi.set(__self__, "shares", shares)
        if with_grant_option is not None:
            pulumi.set(__self__, "with_grant_option", with_grant_option)

    @property
    @pulumi.getter(name="argumentDataTypes")
    def argument_data_types(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        List of the argument data types for the function (must be present if function has arguments and function_name is present)
        """
        return pulumi.get(self, "argument_data_types")

    @argument_data_types.setter
    def argument_data_types(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "argument_data_types", value)

    @property
    @pulumi.getter
    def arguments(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['FunctionGrantArgumentArgs']]]]:
        """
        List of the arguments for the function (must be present if function has arguments and function_name is present)
        """
        return pulumi.get(self, "arguments")

    @arguments.setter
    def arguments(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['FunctionGrantArgumentArgs']]]]):
        pulumi.set(self, "arguments", value)

    @property
    @pulumi.getter(name="databaseName")
    def database_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the database containing the current or future functions on which to grant privileges.
        """
        return pulumi.get(self, "database_name")

    @database_name.setter
    def database_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "database_name", value)

    @property
    @pulumi.getter(name="enableMultipleGrants")
    def enable_multiple_grants(self) -> Optional[pulumi.Input[bool]]:
        """
        When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
        grants applied to roles and objects outside Terraform.
        """
        return pulumi.get(self, "enable_multiple_grants")

    @enable_multiple_grants.setter
    def enable_multiple_grants(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enable_multiple_grants", value)

    @property
    @pulumi.getter(name="functionName")
    def function_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the function on which to grant privileges immediately (only valid if on_future is false).
        """
        return pulumi.get(self, "function_name")

    @function_name.setter
    def function_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "function_name", value)

    @property
    @pulumi.getter(name="onFuture")
    def on_future(self) -> Optional[pulumi.Input[bool]]:
        """
        When this is set to true and a schema*name is provided, apply this grant on all future functions in the given schema. When this is true and no schema*name is provided apply this grant on all future functions in the given database. The function*name, arguments, return*type, and shares fields must be unset in order to use on_future.
        """
        return pulumi.get(self, "on_future")

    @on_future.setter
    def on_future(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "on_future", value)

    @property
    @pulumi.getter
    def privilege(self) -> Optional[pulumi.Input[str]]:
        """
        The privilege to grant on the current or future function. Must be one of `USAGE` or `OWNERSHIP`.
        """
        return pulumi.get(self, "privilege")

    @privilege.setter
    def privilege(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "privilege", value)

    @property
    @pulumi.getter(name="returnType")
    def return_type(self) -> Optional[pulumi.Input[str]]:
        """
        The return type of the function (must be present if function_name is present)
        """
        return pulumi.get(self, "return_type")

    @return_type.setter
    def return_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "return_type", value)

    @property
    @pulumi.getter
    def roles(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Grants privilege to these roles.
        """
        return pulumi.get(self, "roles")

    @roles.setter
    def roles(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "roles", value)

    @property
    @pulumi.getter(name="schemaName")
    def schema_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the schema containing the current or future functions on which to grant privileges.
        """
        return pulumi.get(self, "schema_name")

    @schema_name.setter
    def schema_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "schema_name", value)

    @property
    @pulumi.getter
    def shares(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Grants privilege to these shares (only valid if on_future is false).
        """
        return pulumi.get(self, "shares")

    @shares.setter
    def shares(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "shares", value)

    @property
    @pulumi.getter(name="withGrantOption")
    def with_grant_option(self) -> Optional[pulumi.Input[bool]]:
        """
        When this is set to true, allows the recipient role to grant the privileges to other roles.
        """
        return pulumi.get(self, "with_grant_option")

    @with_grant_option.setter
    def with_grant_option(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "with_grant_option", value)


class FunctionGrant(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 argument_data_types: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 arguments: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['FunctionGrantArgumentArgs']]]]] = None,
                 database_name: Optional[pulumi.Input[str]] = None,
                 enable_multiple_grants: Optional[pulumi.Input[bool]] = None,
                 function_name: Optional[pulumi.Input[str]] = None,
                 on_future: Optional[pulumi.Input[bool]] = None,
                 privilege: Optional[pulumi.Input[str]] = None,
                 return_type: Optional[pulumi.Input[str]] = None,
                 roles: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 schema_name: Optional[pulumi.Input[str]] = None,
                 shares: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 with_grant_option: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_snowflake as snowflake

        grant = snowflake.FunctionGrant("grant",
            argument_data_types=[
                "array",
                "string",
            ],
            database_name="database",
            function_name="function",
            on_future=False,
            privilege="USAGE",
            roles=[
                "role1",
                "role2",
            ],
            schema_name="schema",
            shares=[
                "share1",
                "share2",
            ],
            with_grant_option=False)
        ```

        ## Import

        format is database name | schema name | function signature | privilege | true/false for with_grant_option

        ```sh
         $ pulumi import snowflake:index/functionGrant:FunctionGrant example 'dbName|schemaName|functionName(ARG1TYPE,ARG2TYPE)|USAGE|false'
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] argument_data_types: List of the argument data types for the function (must be present if function has arguments and function_name is present)
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['FunctionGrantArgumentArgs']]]] arguments: List of the arguments for the function (must be present if function has arguments and function_name is present)
        :param pulumi.Input[str] database_name: The name of the database containing the current or future functions on which to grant privileges.
        :param pulumi.Input[bool] enable_multiple_grants: When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
               grants applied to roles and objects outside Terraform.
        :param pulumi.Input[str] function_name: The name of the function on which to grant privileges immediately (only valid if on_future is false).
        :param pulumi.Input[bool] on_future: When this is set to true and a schema*name is provided, apply this grant on all future functions in the given schema. When this is true and no schema*name is provided apply this grant on all future functions in the given database. The function*name, arguments, return*type, and shares fields must be unset in order to use on_future.
        :param pulumi.Input[str] privilege: The privilege to grant on the current or future function. Must be one of `USAGE` or `OWNERSHIP`.
        :param pulumi.Input[str] return_type: The return type of the function (must be present if function_name is present)
        :param pulumi.Input[Sequence[pulumi.Input[str]]] roles: Grants privilege to these roles.
        :param pulumi.Input[str] schema_name: The name of the schema containing the current or future functions on which to grant privileges.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] shares: Grants privilege to these shares (only valid if on_future is false).
        :param pulumi.Input[bool] with_grant_option: When this is set to true, allows the recipient role to grant the privileges to other roles.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: FunctionGrantArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_snowflake as snowflake

        grant = snowflake.FunctionGrant("grant",
            argument_data_types=[
                "array",
                "string",
            ],
            database_name="database",
            function_name="function",
            on_future=False,
            privilege="USAGE",
            roles=[
                "role1",
                "role2",
            ],
            schema_name="schema",
            shares=[
                "share1",
                "share2",
            ],
            with_grant_option=False)
        ```

        ## Import

        format is database name | schema name | function signature | privilege | true/false for with_grant_option

        ```sh
         $ pulumi import snowflake:index/functionGrant:FunctionGrant example 'dbName|schemaName|functionName(ARG1TYPE,ARG2TYPE)|USAGE|false'
        ```

        :param str resource_name: The name of the resource.
        :param FunctionGrantArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(FunctionGrantArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 argument_data_types: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 arguments: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['FunctionGrantArgumentArgs']]]]] = None,
                 database_name: Optional[pulumi.Input[str]] = None,
                 enable_multiple_grants: Optional[pulumi.Input[bool]] = None,
                 function_name: Optional[pulumi.Input[str]] = None,
                 on_future: Optional[pulumi.Input[bool]] = None,
                 privilege: Optional[pulumi.Input[str]] = None,
                 return_type: Optional[pulumi.Input[str]] = None,
                 roles: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 schema_name: Optional[pulumi.Input[str]] = None,
                 shares: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 with_grant_option: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = FunctionGrantArgs.__new__(FunctionGrantArgs)

            __props__.__dict__["argument_data_types"] = argument_data_types
            if arguments is not None and not opts.urn:
                warnings.warn("""Use argument_data_types instead""", DeprecationWarning)
                pulumi.log.warn("""arguments is deprecated: Use argument_data_types instead""")
            __props__.__dict__["arguments"] = arguments
            if database_name is None and not opts.urn:
                raise TypeError("Missing required property 'database_name'")
            __props__.__dict__["database_name"] = database_name
            __props__.__dict__["enable_multiple_grants"] = enable_multiple_grants
            __props__.__dict__["function_name"] = function_name
            __props__.__dict__["on_future"] = on_future
            __props__.__dict__["privilege"] = privilege
            if return_type is not None and not opts.urn:
                warnings.warn("""Not used anymore""", DeprecationWarning)
                pulumi.log.warn("""return_type is deprecated: Not used anymore""")
            __props__.__dict__["return_type"] = return_type
            if roles is None and not opts.urn:
                raise TypeError("Missing required property 'roles'")
            __props__.__dict__["roles"] = roles
            __props__.__dict__["schema_name"] = schema_name
            __props__.__dict__["shares"] = shares
            __props__.__dict__["with_grant_option"] = with_grant_option
        super(FunctionGrant, __self__).__init__(
            'snowflake:index/functionGrant:FunctionGrant',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            argument_data_types: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            arguments: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['FunctionGrantArgumentArgs']]]]] = None,
            database_name: Optional[pulumi.Input[str]] = None,
            enable_multiple_grants: Optional[pulumi.Input[bool]] = None,
            function_name: Optional[pulumi.Input[str]] = None,
            on_future: Optional[pulumi.Input[bool]] = None,
            privilege: Optional[pulumi.Input[str]] = None,
            return_type: Optional[pulumi.Input[str]] = None,
            roles: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            schema_name: Optional[pulumi.Input[str]] = None,
            shares: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            with_grant_option: Optional[pulumi.Input[bool]] = None) -> 'FunctionGrant':
        """
        Get an existing FunctionGrant resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] argument_data_types: List of the argument data types for the function (must be present if function has arguments and function_name is present)
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['FunctionGrantArgumentArgs']]]] arguments: List of the arguments for the function (must be present if function has arguments and function_name is present)
        :param pulumi.Input[str] database_name: The name of the database containing the current or future functions on which to grant privileges.
        :param pulumi.Input[bool] enable_multiple_grants: When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
               grants applied to roles and objects outside Terraform.
        :param pulumi.Input[str] function_name: The name of the function on which to grant privileges immediately (only valid if on_future is false).
        :param pulumi.Input[bool] on_future: When this is set to true and a schema*name is provided, apply this grant on all future functions in the given schema. When this is true and no schema*name is provided apply this grant on all future functions in the given database. The function*name, arguments, return*type, and shares fields must be unset in order to use on_future.
        :param pulumi.Input[str] privilege: The privilege to grant on the current or future function. Must be one of `USAGE` or `OWNERSHIP`.
        :param pulumi.Input[str] return_type: The return type of the function (must be present if function_name is present)
        :param pulumi.Input[Sequence[pulumi.Input[str]]] roles: Grants privilege to these roles.
        :param pulumi.Input[str] schema_name: The name of the schema containing the current or future functions on which to grant privileges.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] shares: Grants privilege to these shares (only valid if on_future is false).
        :param pulumi.Input[bool] with_grant_option: When this is set to true, allows the recipient role to grant the privileges to other roles.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _FunctionGrantState.__new__(_FunctionGrantState)

        __props__.__dict__["argument_data_types"] = argument_data_types
        __props__.__dict__["arguments"] = arguments
        __props__.__dict__["database_name"] = database_name
        __props__.__dict__["enable_multiple_grants"] = enable_multiple_grants
        __props__.__dict__["function_name"] = function_name
        __props__.__dict__["on_future"] = on_future
        __props__.__dict__["privilege"] = privilege
        __props__.__dict__["return_type"] = return_type
        __props__.__dict__["roles"] = roles
        __props__.__dict__["schema_name"] = schema_name
        __props__.__dict__["shares"] = shares
        __props__.__dict__["with_grant_option"] = with_grant_option
        return FunctionGrant(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="argumentDataTypes")
    def argument_data_types(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        List of the argument data types for the function (must be present if function has arguments and function_name is present)
        """
        return pulumi.get(self, "argument_data_types")

    @property
    @pulumi.getter
    def arguments(self) -> pulumi.Output[Optional[Sequence['outputs.FunctionGrantArgument']]]:
        """
        List of the arguments for the function (must be present if function has arguments and function_name is present)
        """
        return pulumi.get(self, "arguments")

    @property
    @pulumi.getter(name="databaseName")
    def database_name(self) -> pulumi.Output[str]:
        """
        The name of the database containing the current or future functions on which to grant privileges.
        """
        return pulumi.get(self, "database_name")

    @property
    @pulumi.getter(name="enableMultipleGrants")
    def enable_multiple_grants(self) -> pulumi.Output[Optional[bool]]:
        """
        When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
        grants applied to roles and objects outside Terraform.
        """
        return pulumi.get(self, "enable_multiple_grants")

    @property
    @pulumi.getter(name="functionName")
    def function_name(self) -> pulumi.Output[Optional[str]]:
        """
        The name of the function on which to grant privileges immediately (only valid if on_future is false).
        """
        return pulumi.get(self, "function_name")

    @property
    @pulumi.getter(name="onFuture")
    def on_future(self) -> pulumi.Output[Optional[bool]]:
        """
        When this is set to true and a schema*name is provided, apply this grant on all future functions in the given schema. When this is true and no schema*name is provided apply this grant on all future functions in the given database. The function*name, arguments, return*type, and shares fields must be unset in order to use on_future.
        """
        return pulumi.get(self, "on_future")

    @property
    @pulumi.getter
    def privilege(self) -> pulumi.Output[Optional[str]]:
        """
        The privilege to grant on the current or future function. Must be one of `USAGE` or `OWNERSHIP`.
        """
        return pulumi.get(self, "privilege")

    @property
    @pulumi.getter(name="returnType")
    def return_type(self) -> pulumi.Output[Optional[str]]:
        """
        The return type of the function (must be present if function_name is present)
        """
        return pulumi.get(self, "return_type")

    @property
    @pulumi.getter
    def roles(self) -> pulumi.Output[Sequence[str]]:
        """
        Grants privilege to these roles.
        """
        return pulumi.get(self, "roles")

    @property
    @pulumi.getter(name="schemaName")
    def schema_name(self) -> pulumi.Output[Optional[str]]:
        """
        The name of the schema containing the current or future functions on which to grant privileges.
        """
        return pulumi.get(self, "schema_name")

    @property
    @pulumi.getter
    def shares(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        Grants privilege to these shares (only valid if on_future is false).
        """
        return pulumi.get(self, "shares")

    @property
    @pulumi.getter(name="withGrantOption")
    def with_grant_option(self) -> pulumi.Output[Optional[bool]]:
        """
        When this is set to true, allows the recipient role to grant the privileges to other roles.
        """
        return pulumi.get(self, "with_grant_option")

