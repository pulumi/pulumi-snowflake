# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['MaterializedViewGrantArgs', 'MaterializedViewGrant']

@pulumi.input_type
class MaterializedViewGrantArgs:
    def __init__(__self__, *,
                 database_name: pulumi.Input[str],
                 enable_multiple_grants: Optional[pulumi.Input[bool]] = None,
                 materialized_view_name: Optional[pulumi.Input[str]] = None,
                 on_all: Optional[pulumi.Input[bool]] = None,
                 on_future: Optional[pulumi.Input[bool]] = None,
                 privilege: Optional[pulumi.Input[str]] = None,
                 revert_ownership_to_role_name: Optional[pulumi.Input[str]] = None,
                 roles: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 schema_name: Optional[pulumi.Input[str]] = None,
                 shares: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 with_grant_option: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a MaterializedViewGrant resource.
        :param pulumi.Input[str] database_name: The name of the database containing the current or future materialized views on which to grant privileges.
        :param pulumi.Input[bool] enable_multiple_grants: When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
               grants applied to roles and objects outside Terraform.
        :param pulumi.Input[str] materialized_view_name: The name of the materialized view on which to grant privileges immediately (only valid if on*future and on*all are false).
        :param pulumi.Input[bool] on_all: When this is set to true and a schema*name is provided, apply this grant on all materialized views in the given schema. When this is true and no schema*name is provided apply this grant on all materialized views in the given database. The materialized*view*name and shares fields must be unset in order to use on*all. Cannot be used together with on*future.
        :param pulumi.Input[bool] on_future: When this is set to true and a schema*name is provided, apply this grant on all future materialized views in the given schema. When this is true and no schema*name is provided apply this grant on all future materialized views in the given database. The materialized*view*name and shares fields must be unset in order to use on*future. Cannot be used together with on*all.
        :param pulumi.Input[str] privilege: The privilege to grant on the current or future materialized view. To grant all privileges, use the value `ALL PRIVILEGES`
        :param pulumi.Input[str] revert_ownership_to_role_name: The name of the role to revert ownership to on destroy. Has no effect unless `privilege` is set to `OWNERSHIP`
        :param pulumi.Input[Sequence[pulumi.Input[str]]] roles: Grants privilege to these roles.
        :param pulumi.Input[str] schema_name: The name of the schema containing the current or future materialized views on which to grant privileges.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] shares: Grants privilege to these shares (only valid if on*future and on*all are false).
        :param pulumi.Input[bool] with_grant_option: When this is set to true, allows the recipient role to grant the privileges to other roles.
        """
        pulumi.set(__self__, "database_name", database_name)
        if enable_multiple_grants is not None:
            pulumi.set(__self__, "enable_multiple_grants", enable_multiple_grants)
        if materialized_view_name is not None:
            pulumi.set(__self__, "materialized_view_name", materialized_view_name)
        if on_all is not None:
            pulumi.set(__self__, "on_all", on_all)
        if on_future is not None:
            pulumi.set(__self__, "on_future", on_future)
        if privilege is not None:
            pulumi.set(__self__, "privilege", privilege)
        if revert_ownership_to_role_name is not None:
            pulumi.set(__self__, "revert_ownership_to_role_name", revert_ownership_to_role_name)
        if roles is not None:
            pulumi.set(__self__, "roles", roles)
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
        The name of the database containing the current or future materialized views on which to grant privileges.
        """
        return pulumi.get(self, "database_name")

    @database_name.setter
    def database_name(self, value: pulumi.Input[str]):
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
    @pulumi.getter(name="materializedViewName")
    def materialized_view_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the materialized view on which to grant privileges immediately (only valid if on*future and on*all are false).
        """
        return pulumi.get(self, "materialized_view_name")

    @materialized_view_name.setter
    def materialized_view_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "materialized_view_name", value)

    @property
    @pulumi.getter(name="onAll")
    def on_all(self) -> Optional[pulumi.Input[bool]]:
        """
        When this is set to true and a schema*name is provided, apply this grant on all materialized views in the given schema. When this is true and no schema*name is provided apply this grant on all materialized views in the given database. The materialized*view*name and shares fields must be unset in order to use on*all. Cannot be used together with on*future.
        """
        return pulumi.get(self, "on_all")

    @on_all.setter
    def on_all(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "on_all", value)

    @property
    @pulumi.getter(name="onFuture")
    def on_future(self) -> Optional[pulumi.Input[bool]]:
        """
        When this is set to true and a schema*name is provided, apply this grant on all future materialized views in the given schema. When this is true and no schema*name is provided apply this grant on all future materialized views in the given database. The materialized*view*name and shares fields must be unset in order to use on*future. Cannot be used together with on*all.
        """
        return pulumi.get(self, "on_future")

    @on_future.setter
    def on_future(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "on_future", value)

    @property
    @pulumi.getter
    def privilege(self) -> Optional[pulumi.Input[str]]:
        """
        The privilege to grant on the current or future materialized view. To grant all privileges, use the value `ALL PRIVILEGES`
        """
        return pulumi.get(self, "privilege")

    @privilege.setter
    def privilege(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "privilege", value)

    @property
    @pulumi.getter(name="revertOwnershipToRoleName")
    def revert_ownership_to_role_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the role to revert ownership to on destroy. Has no effect unless `privilege` is set to `OWNERSHIP`
        """
        return pulumi.get(self, "revert_ownership_to_role_name")

    @revert_ownership_to_role_name.setter
    def revert_ownership_to_role_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "revert_ownership_to_role_name", value)

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
        The name of the schema containing the current or future materialized views on which to grant privileges.
        """
        return pulumi.get(self, "schema_name")

    @schema_name.setter
    def schema_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "schema_name", value)

    @property
    @pulumi.getter
    def shares(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Grants privilege to these shares (only valid if on*future and on*all are false).
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
class _MaterializedViewGrantState:
    def __init__(__self__, *,
                 database_name: Optional[pulumi.Input[str]] = None,
                 enable_multiple_grants: Optional[pulumi.Input[bool]] = None,
                 materialized_view_name: Optional[pulumi.Input[str]] = None,
                 on_all: Optional[pulumi.Input[bool]] = None,
                 on_future: Optional[pulumi.Input[bool]] = None,
                 privilege: Optional[pulumi.Input[str]] = None,
                 revert_ownership_to_role_name: Optional[pulumi.Input[str]] = None,
                 roles: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 schema_name: Optional[pulumi.Input[str]] = None,
                 shares: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 with_grant_option: Optional[pulumi.Input[bool]] = None):
        """
        Input properties used for looking up and filtering MaterializedViewGrant resources.
        :param pulumi.Input[str] database_name: The name of the database containing the current or future materialized views on which to grant privileges.
        :param pulumi.Input[bool] enable_multiple_grants: When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
               grants applied to roles and objects outside Terraform.
        :param pulumi.Input[str] materialized_view_name: The name of the materialized view on which to grant privileges immediately (only valid if on*future and on*all are false).
        :param pulumi.Input[bool] on_all: When this is set to true and a schema*name is provided, apply this grant on all materialized views in the given schema. When this is true and no schema*name is provided apply this grant on all materialized views in the given database. The materialized*view*name and shares fields must be unset in order to use on*all. Cannot be used together with on*future.
        :param pulumi.Input[bool] on_future: When this is set to true and a schema*name is provided, apply this grant on all future materialized views in the given schema. When this is true and no schema*name is provided apply this grant on all future materialized views in the given database. The materialized*view*name and shares fields must be unset in order to use on*future. Cannot be used together with on*all.
        :param pulumi.Input[str] privilege: The privilege to grant on the current or future materialized view. To grant all privileges, use the value `ALL PRIVILEGES`
        :param pulumi.Input[str] revert_ownership_to_role_name: The name of the role to revert ownership to on destroy. Has no effect unless `privilege` is set to `OWNERSHIP`
        :param pulumi.Input[Sequence[pulumi.Input[str]]] roles: Grants privilege to these roles.
        :param pulumi.Input[str] schema_name: The name of the schema containing the current or future materialized views on which to grant privileges.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] shares: Grants privilege to these shares (only valid if on*future and on*all are false).
        :param pulumi.Input[bool] with_grant_option: When this is set to true, allows the recipient role to grant the privileges to other roles.
        """
        if database_name is not None:
            pulumi.set(__self__, "database_name", database_name)
        if enable_multiple_grants is not None:
            pulumi.set(__self__, "enable_multiple_grants", enable_multiple_grants)
        if materialized_view_name is not None:
            pulumi.set(__self__, "materialized_view_name", materialized_view_name)
        if on_all is not None:
            pulumi.set(__self__, "on_all", on_all)
        if on_future is not None:
            pulumi.set(__self__, "on_future", on_future)
        if privilege is not None:
            pulumi.set(__self__, "privilege", privilege)
        if revert_ownership_to_role_name is not None:
            pulumi.set(__self__, "revert_ownership_to_role_name", revert_ownership_to_role_name)
        if roles is not None:
            pulumi.set(__self__, "roles", roles)
        if schema_name is not None:
            pulumi.set(__self__, "schema_name", schema_name)
        if shares is not None:
            pulumi.set(__self__, "shares", shares)
        if with_grant_option is not None:
            pulumi.set(__self__, "with_grant_option", with_grant_option)

    @property
    @pulumi.getter(name="databaseName")
    def database_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the database containing the current or future materialized views on which to grant privileges.
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
    @pulumi.getter(name="materializedViewName")
    def materialized_view_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the materialized view on which to grant privileges immediately (only valid if on*future and on*all are false).
        """
        return pulumi.get(self, "materialized_view_name")

    @materialized_view_name.setter
    def materialized_view_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "materialized_view_name", value)

    @property
    @pulumi.getter(name="onAll")
    def on_all(self) -> Optional[pulumi.Input[bool]]:
        """
        When this is set to true and a schema*name is provided, apply this grant on all materialized views in the given schema. When this is true and no schema*name is provided apply this grant on all materialized views in the given database. The materialized*view*name and shares fields must be unset in order to use on*all. Cannot be used together with on*future.
        """
        return pulumi.get(self, "on_all")

    @on_all.setter
    def on_all(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "on_all", value)

    @property
    @pulumi.getter(name="onFuture")
    def on_future(self) -> Optional[pulumi.Input[bool]]:
        """
        When this is set to true and a schema*name is provided, apply this grant on all future materialized views in the given schema. When this is true and no schema*name is provided apply this grant on all future materialized views in the given database. The materialized*view*name and shares fields must be unset in order to use on*future. Cannot be used together with on*all.
        """
        return pulumi.get(self, "on_future")

    @on_future.setter
    def on_future(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "on_future", value)

    @property
    @pulumi.getter
    def privilege(self) -> Optional[pulumi.Input[str]]:
        """
        The privilege to grant on the current or future materialized view. To grant all privileges, use the value `ALL PRIVILEGES`
        """
        return pulumi.get(self, "privilege")

    @privilege.setter
    def privilege(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "privilege", value)

    @property
    @pulumi.getter(name="revertOwnershipToRoleName")
    def revert_ownership_to_role_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the role to revert ownership to on destroy. Has no effect unless `privilege` is set to `OWNERSHIP`
        """
        return pulumi.get(self, "revert_ownership_to_role_name")

    @revert_ownership_to_role_name.setter
    def revert_ownership_to_role_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "revert_ownership_to_role_name", value)

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
        The name of the schema containing the current or future materialized views on which to grant privileges.
        """
        return pulumi.get(self, "schema_name")

    @schema_name.setter
    def schema_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "schema_name", value)

    @property
    @pulumi.getter
    def shares(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Grants privilege to these shares (only valid if on*future and on*all are false).
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


class MaterializedViewGrant(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 database_name: Optional[pulumi.Input[str]] = None,
                 enable_multiple_grants: Optional[pulumi.Input[bool]] = None,
                 materialized_view_name: Optional[pulumi.Input[str]] = None,
                 on_all: Optional[pulumi.Input[bool]] = None,
                 on_future: Optional[pulumi.Input[bool]] = None,
                 privilege: Optional[pulumi.Input[str]] = None,
                 revert_ownership_to_role_name: Optional[pulumi.Input[str]] = None,
                 roles: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 schema_name: Optional[pulumi.Input[str]] = None,
                 shares: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 with_grant_option: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        """
        > **Deprecation** This resource is deprecated and will be removed in a future major version release. Please use GrantPrivilegesToAccountRole instead. <deprecation>

        ## Example Usage

        ```python
        import pulumi
        import pulumi_snowflake as snowflake

        grant = snowflake.MaterializedViewGrant("grant",
            database_name="database",
            materialized_view_name="materialized_view",
            on_future=False,
            privilege="SELECT",
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

        format is database_name|schema_name|materialized_view_name|privilege|with_grant_option|on_future|on_all|roles|shares

        ```sh
        $ pulumi import snowflake:index/materializedViewGrant:MaterializedViewGrant example "MY_DATABASE|MY_SCHEMA|MY_MV_NAME|SELECT|false|false|role1,role2|share1,share2"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] database_name: The name of the database containing the current or future materialized views on which to grant privileges.
        :param pulumi.Input[bool] enable_multiple_grants: When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
               grants applied to roles and objects outside Terraform.
        :param pulumi.Input[str] materialized_view_name: The name of the materialized view on which to grant privileges immediately (only valid if on*future and on*all are false).
        :param pulumi.Input[bool] on_all: When this is set to true and a schema*name is provided, apply this grant on all materialized views in the given schema. When this is true and no schema*name is provided apply this grant on all materialized views in the given database. The materialized*view*name and shares fields must be unset in order to use on*all. Cannot be used together with on*future.
        :param pulumi.Input[bool] on_future: When this is set to true and a schema*name is provided, apply this grant on all future materialized views in the given schema. When this is true and no schema*name is provided apply this grant on all future materialized views in the given database. The materialized*view*name and shares fields must be unset in order to use on*future. Cannot be used together with on*all.
        :param pulumi.Input[str] privilege: The privilege to grant on the current or future materialized view. To grant all privileges, use the value `ALL PRIVILEGES`
        :param pulumi.Input[str] revert_ownership_to_role_name: The name of the role to revert ownership to on destroy. Has no effect unless `privilege` is set to `OWNERSHIP`
        :param pulumi.Input[Sequence[pulumi.Input[str]]] roles: Grants privilege to these roles.
        :param pulumi.Input[str] schema_name: The name of the schema containing the current or future materialized views on which to grant privileges.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] shares: Grants privilege to these shares (only valid if on*future and on*all are false).
        :param pulumi.Input[bool] with_grant_option: When this is set to true, allows the recipient role to grant the privileges to other roles.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: MaterializedViewGrantArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        > **Deprecation** This resource is deprecated and will be removed in a future major version release. Please use GrantPrivilegesToAccountRole instead. <deprecation>

        ## Example Usage

        ```python
        import pulumi
        import pulumi_snowflake as snowflake

        grant = snowflake.MaterializedViewGrant("grant",
            database_name="database",
            materialized_view_name="materialized_view",
            on_future=False,
            privilege="SELECT",
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

        format is database_name|schema_name|materialized_view_name|privilege|with_grant_option|on_future|on_all|roles|shares

        ```sh
        $ pulumi import snowflake:index/materializedViewGrant:MaterializedViewGrant example "MY_DATABASE|MY_SCHEMA|MY_MV_NAME|SELECT|false|false|role1,role2|share1,share2"
        ```

        :param str resource_name: The name of the resource.
        :param MaterializedViewGrantArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(MaterializedViewGrantArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 database_name: Optional[pulumi.Input[str]] = None,
                 enable_multiple_grants: Optional[pulumi.Input[bool]] = None,
                 materialized_view_name: Optional[pulumi.Input[str]] = None,
                 on_all: Optional[pulumi.Input[bool]] = None,
                 on_future: Optional[pulumi.Input[bool]] = None,
                 privilege: Optional[pulumi.Input[str]] = None,
                 revert_ownership_to_role_name: Optional[pulumi.Input[str]] = None,
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
            __props__ = MaterializedViewGrantArgs.__new__(MaterializedViewGrantArgs)

            if database_name is None and not opts.urn:
                raise TypeError("Missing required property 'database_name'")
            __props__.__dict__["database_name"] = database_name
            __props__.__dict__["enable_multiple_grants"] = enable_multiple_grants
            __props__.__dict__["materialized_view_name"] = materialized_view_name
            __props__.__dict__["on_all"] = on_all
            __props__.__dict__["on_future"] = on_future
            __props__.__dict__["privilege"] = privilege
            __props__.__dict__["revert_ownership_to_role_name"] = revert_ownership_to_role_name
            __props__.__dict__["roles"] = roles
            __props__.__dict__["schema_name"] = schema_name
            __props__.__dict__["shares"] = shares
            __props__.__dict__["with_grant_option"] = with_grant_option
        super(MaterializedViewGrant, __self__).__init__(
            'snowflake:index/materializedViewGrant:MaterializedViewGrant',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            database_name: Optional[pulumi.Input[str]] = None,
            enable_multiple_grants: Optional[pulumi.Input[bool]] = None,
            materialized_view_name: Optional[pulumi.Input[str]] = None,
            on_all: Optional[pulumi.Input[bool]] = None,
            on_future: Optional[pulumi.Input[bool]] = None,
            privilege: Optional[pulumi.Input[str]] = None,
            revert_ownership_to_role_name: Optional[pulumi.Input[str]] = None,
            roles: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            schema_name: Optional[pulumi.Input[str]] = None,
            shares: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            with_grant_option: Optional[pulumi.Input[bool]] = None) -> 'MaterializedViewGrant':
        """
        Get an existing MaterializedViewGrant resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] database_name: The name of the database containing the current or future materialized views on which to grant privileges.
        :param pulumi.Input[bool] enable_multiple_grants: When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
               grants applied to roles and objects outside Terraform.
        :param pulumi.Input[str] materialized_view_name: The name of the materialized view on which to grant privileges immediately (only valid if on*future and on*all are false).
        :param pulumi.Input[bool] on_all: When this is set to true and a schema*name is provided, apply this grant on all materialized views in the given schema. When this is true and no schema*name is provided apply this grant on all materialized views in the given database. The materialized*view*name and shares fields must be unset in order to use on*all. Cannot be used together with on*future.
        :param pulumi.Input[bool] on_future: When this is set to true and a schema*name is provided, apply this grant on all future materialized views in the given schema. When this is true and no schema*name is provided apply this grant on all future materialized views in the given database. The materialized*view*name and shares fields must be unset in order to use on*future. Cannot be used together with on*all.
        :param pulumi.Input[str] privilege: The privilege to grant on the current or future materialized view. To grant all privileges, use the value `ALL PRIVILEGES`
        :param pulumi.Input[str] revert_ownership_to_role_name: The name of the role to revert ownership to on destroy. Has no effect unless `privilege` is set to `OWNERSHIP`
        :param pulumi.Input[Sequence[pulumi.Input[str]]] roles: Grants privilege to these roles.
        :param pulumi.Input[str] schema_name: The name of the schema containing the current or future materialized views on which to grant privileges.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] shares: Grants privilege to these shares (only valid if on*future and on*all are false).
        :param pulumi.Input[bool] with_grant_option: When this is set to true, allows the recipient role to grant the privileges to other roles.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _MaterializedViewGrantState.__new__(_MaterializedViewGrantState)

        __props__.__dict__["database_name"] = database_name
        __props__.__dict__["enable_multiple_grants"] = enable_multiple_grants
        __props__.__dict__["materialized_view_name"] = materialized_view_name
        __props__.__dict__["on_all"] = on_all
        __props__.__dict__["on_future"] = on_future
        __props__.__dict__["privilege"] = privilege
        __props__.__dict__["revert_ownership_to_role_name"] = revert_ownership_to_role_name
        __props__.__dict__["roles"] = roles
        __props__.__dict__["schema_name"] = schema_name
        __props__.__dict__["shares"] = shares
        __props__.__dict__["with_grant_option"] = with_grant_option
        return MaterializedViewGrant(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="databaseName")
    def database_name(self) -> pulumi.Output[str]:
        """
        The name of the database containing the current or future materialized views on which to grant privileges.
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
    @pulumi.getter(name="materializedViewName")
    def materialized_view_name(self) -> pulumi.Output[Optional[str]]:
        """
        The name of the materialized view on which to grant privileges immediately (only valid if on*future and on*all are false).
        """
        return pulumi.get(self, "materialized_view_name")

    @property
    @pulumi.getter(name="onAll")
    def on_all(self) -> pulumi.Output[Optional[bool]]:
        """
        When this is set to true and a schema*name is provided, apply this grant on all materialized views in the given schema. When this is true and no schema*name is provided apply this grant on all materialized views in the given database. The materialized*view*name and shares fields must be unset in order to use on*all. Cannot be used together with on*future.
        """
        return pulumi.get(self, "on_all")

    @property
    @pulumi.getter(name="onFuture")
    def on_future(self) -> pulumi.Output[Optional[bool]]:
        """
        When this is set to true and a schema*name is provided, apply this grant on all future materialized views in the given schema. When this is true and no schema*name is provided apply this grant on all future materialized views in the given database. The materialized*view*name and shares fields must be unset in order to use on*future. Cannot be used together with on*all.
        """
        return pulumi.get(self, "on_future")

    @property
    @pulumi.getter
    def privilege(self) -> pulumi.Output[Optional[str]]:
        """
        The privilege to grant on the current or future materialized view. To grant all privileges, use the value `ALL PRIVILEGES`
        """
        return pulumi.get(self, "privilege")

    @property
    @pulumi.getter(name="revertOwnershipToRoleName")
    def revert_ownership_to_role_name(self) -> pulumi.Output[Optional[str]]:
        """
        The name of the role to revert ownership to on destroy. Has no effect unless `privilege` is set to `OWNERSHIP`
        """
        return pulumi.get(self, "revert_ownership_to_role_name")

    @property
    @pulumi.getter
    def roles(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        Grants privilege to these roles.
        """
        return pulumi.get(self, "roles")

    @property
    @pulumi.getter(name="schemaName")
    def schema_name(self) -> pulumi.Output[Optional[str]]:
        """
        The name of the schema containing the current or future materialized views on which to grant privileges.
        """
        return pulumi.get(self, "schema_name")

    @property
    @pulumi.getter
    def shares(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        Grants privilege to these shares (only valid if on*future and on*all are false).
        """
        return pulumi.get(self, "shares")

    @property
    @pulumi.getter(name="withGrantOption")
    def with_grant_option(self) -> pulumi.Output[Optional[bool]]:
        """
        When this is set to true, allows the recipient role to grant the privileges to other roles.
        """
        return pulumi.get(self, "with_grant_option")

