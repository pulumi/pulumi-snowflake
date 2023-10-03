# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['DatabaseGrantArgs', 'DatabaseGrant']

@pulumi.input_type
class DatabaseGrantArgs:
    def __init__(__self__, *,
                 database_name: pulumi.Input[str],
                 enable_multiple_grants: Optional[pulumi.Input[bool]] = None,
                 privilege: Optional[pulumi.Input[str]] = None,
                 revert_ownership_to_role_name: Optional[pulumi.Input[str]] = None,
                 roles: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 shares: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 with_grant_option: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a DatabaseGrant resource.
        :param pulumi.Input[str] database_name: The name of the database on which to grant privileges.
        :param pulumi.Input[bool] enable_multiple_grants: When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
               grants applied to roles and objects outside Terraform.
        :param pulumi.Input[str] privilege: The privilege to grant on the database. To grant all privileges, use the value `ALL PRIVILEGES`.
        :param pulumi.Input[str] revert_ownership_to_role_name: The name of the role to revert ownership to on destroy. Has no effect unless `privilege` is set to `OWNERSHIP`
        :param pulumi.Input[Sequence[pulumi.Input[str]]] roles: Grants privilege to these roles.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] shares: Grants privilege to these shares.
        :param pulumi.Input[bool] with_grant_option: When this is set to true, allows the recipient role to grant the privileges to other roles.
        """
        DatabaseGrantArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            database_name=database_name,
            enable_multiple_grants=enable_multiple_grants,
            privilege=privilege,
            revert_ownership_to_role_name=revert_ownership_to_role_name,
            roles=roles,
            shares=shares,
            with_grant_option=with_grant_option,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             database_name: pulumi.Input[str],
             enable_multiple_grants: Optional[pulumi.Input[bool]] = None,
             privilege: Optional[pulumi.Input[str]] = None,
             revert_ownership_to_role_name: Optional[pulumi.Input[str]] = None,
             roles: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
             shares: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
             with_grant_option: Optional[pulumi.Input[bool]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        _setter("database_name", database_name)
        if enable_multiple_grants is not None:
            _setter("enable_multiple_grants", enable_multiple_grants)
        if privilege is not None:
            _setter("privilege", privilege)
        if revert_ownership_to_role_name is not None:
            _setter("revert_ownership_to_role_name", revert_ownership_to_role_name)
        if roles is not None:
            _setter("roles", roles)
        if shares is not None:
            _setter("shares", shares)
        if with_grant_option is not None:
            _setter("with_grant_option", with_grant_option)

    @property
    @pulumi.getter(name="databaseName")
    def database_name(self) -> pulumi.Input[str]:
        """
        The name of the database on which to grant privileges.
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
    @pulumi.getter
    def privilege(self) -> Optional[pulumi.Input[str]]:
        """
        The privilege to grant on the database. To grant all privileges, use the value `ALL PRIVILEGES`.
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
    @pulumi.getter
    def shares(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Grants privilege to these shares.
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
class _DatabaseGrantState:
    def __init__(__self__, *,
                 database_name: Optional[pulumi.Input[str]] = None,
                 enable_multiple_grants: Optional[pulumi.Input[bool]] = None,
                 privilege: Optional[pulumi.Input[str]] = None,
                 revert_ownership_to_role_name: Optional[pulumi.Input[str]] = None,
                 roles: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 shares: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 with_grant_option: Optional[pulumi.Input[bool]] = None):
        """
        Input properties used for looking up and filtering DatabaseGrant resources.
        :param pulumi.Input[str] database_name: The name of the database on which to grant privileges.
        :param pulumi.Input[bool] enable_multiple_grants: When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
               grants applied to roles and objects outside Terraform.
        :param pulumi.Input[str] privilege: The privilege to grant on the database. To grant all privileges, use the value `ALL PRIVILEGES`.
        :param pulumi.Input[str] revert_ownership_to_role_name: The name of the role to revert ownership to on destroy. Has no effect unless `privilege` is set to `OWNERSHIP`
        :param pulumi.Input[Sequence[pulumi.Input[str]]] roles: Grants privilege to these roles.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] shares: Grants privilege to these shares.
        :param pulumi.Input[bool] with_grant_option: When this is set to true, allows the recipient role to grant the privileges to other roles.
        """
        _DatabaseGrantState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            database_name=database_name,
            enable_multiple_grants=enable_multiple_grants,
            privilege=privilege,
            revert_ownership_to_role_name=revert_ownership_to_role_name,
            roles=roles,
            shares=shares,
            with_grant_option=with_grant_option,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             database_name: Optional[pulumi.Input[str]] = None,
             enable_multiple_grants: Optional[pulumi.Input[bool]] = None,
             privilege: Optional[pulumi.Input[str]] = None,
             revert_ownership_to_role_name: Optional[pulumi.Input[str]] = None,
             roles: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
             shares: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
             with_grant_option: Optional[pulumi.Input[bool]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        if database_name is not None:
            _setter("database_name", database_name)
        if enable_multiple_grants is not None:
            _setter("enable_multiple_grants", enable_multiple_grants)
        if privilege is not None:
            _setter("privilege", privilege)
        if revert_ownership_to_role_name is not None:
            _setter("revert_ownership_to_role_name", revert_ownership_to_role_name)
        if roles is not None:
            _setter("roles", roles)
        if shares is not None:
            _setter("shares", shares)
        if with_grant_option is not None:
            _setter("with_grant_option", with_grant_option)

    @property
    @pulumi.getter(name="databaseName")
    def database_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the database on which to grant privileges.
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
    @pulumi.getter
    def privilege(self) -> Optional[pulumi.Input[str]]:
        """
        The privilege to grant on the database. To grant all privileges, use the value `ALL PRIVILEGES`.
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
    @pulumi.getter
    def shares(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Grants privilege to these shares.
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


class DatabaseGrant(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 database_name: Optional[pulumi.Input[str]] = None,
                 enable_multiple_grants: Optional[pulumi.Input[bool]] = None,
                 privilege: Optional[pulumi.Input[str]] = None,
                 revert_ownership_to_role_name: Optional[pulumi.Input[str]] = None,
                 roles: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 shares: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 with_grant_option: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_snowflake as snowflake

        grant = snowflake.DatabaseGrant("grant",
            database_name="database",
            privilege="USAGE",
            roles=[
                "role1",
                "role2",
            ],
            shares=[
                "share1",
                "share2",
            ],
            with_grant_option=False)
        ```

        ## Import

        format is database_name|privilege|with_grant_option|roles|shares

        ```sh
         $ pulumi import snowflake:index/databaseGrant:DatabaseGrant example "MY_DATABASE|USAGE|false|role1,role2|share1,share2"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] database_name: The name of the database on which to grant privileges.
        :param pulumi.Input[bool] enable_multiple_grants: When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
               grants applied to roles and objects outside Terraform.
        :param pulumi.Input[str] privilege: The privilege to grant on the database. To grant all privileges, use the value `ALL PRIVILEGES`.
        :param pulumi.Input[str] revert_ownership_to_role_name: The name of the role to revert ownership to on destroy. Has no effect unless `privilege` is set to `OWNERSHIP`
        :param pulumi.Input[Sequence[pulumi.Input[str]]] roles: Grants privilege to these roles.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] shares: Grants privilege to these shares.
        :param pulumi.Input[bool] with_grant_option: When this is set to true, allows the recipient role to grant the privileges to other roles.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: DatabaseGrantArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_snowflake as snowflake

        grant = snowflake.DatabaseGrant("grant",
            database_name="database",
            privilege="USAGE",
            roles=[
                "role1",
                "role2",
            ],
            shares=[
                "share1",
                "share2",
            ],
            with_grant_option=False)
        ```

        ## Import

        format is database_name|privilege|with_grant_option|roles|shares

        ```sh
         $ pulumi import snowflake:index/databaseGrant:DatabaseGrant example "MY_DATABASE|USAGE|false|role1,role2|share1,share2"
        ```

        :param str resource_name: The name of the resource.
        :param DatabaseGrantArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DatabaseGrantArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            DatabaseGrantArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 database_name: Optional[pulumi.Input[str]] = None,
                 enable_multiple_grants: Optional[pulumi.Input[bool]] = None,
                 privilege: Optional[pulumi.Input[str]] = None,
                 revert_ownership_to_role_name: Optional[pulumi.Input[str]] = None,
                 roles: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 shares: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 with_grant_option: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DatabaseGrantArgs.__new__(DatabaseGrantArgs)

            if database_name is None and not opts.urn:
                raise TypeError("Missing required property 'database_name'")
            __props__.__dict__["database_name"] = database_name
            __props__.__dict__["enable_multiple_grants"] = enable_multiple_grants
            __props__.__dict__["privilege"] = privilege
            __props__.__dict__["revert_ownership_to_role_name"] = revert_ownership_to_role_name
            __props__.__dict__["roles"] = roles
            __props__.__dict__["shares"] = shares
            __props__.__dict__["with_grant_option"] = with_grant_option
        super(DatabaseGrant, __self__).__init__(
            'snowflake:index/databaseGrant:DatabaseGrant',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            database_name: Optional[pulumi.Input[str]] = None,
            enable_multiple_grants: Optional[pulumi.Input[bool]] = None,
            privilege: Optional[pulumi.Input[str]] = None,
            revert_ownership_to_role_name: Optional[pulumi.Input[str]] = None,
            roles: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            shares: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            with_grant_option: Optional[pulumi.Input[bool]] = None) -> 'DatabaseGrant':
        """
        Get an existing DatabaseGrant resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] database_name: The name of the database on which to grant privileges.
        :param pulumi.Input[bool] enable_multiple_grants: When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
               grants applied to roles and objects outside Terraform.
        :param pulumi.Input[str] privilege: The privilege to grant on the database. To grant all privileges, use the value `ALL PRIVILEGES`.
        :param pulumi.Input[str] revert_ownership_to_role_name: The name of the role to revert ownership to on destroy. Has no effect unless `privilege` is set to `OWNERSHIP`
        :param pulumi.Input[Sequence[pulumi.Input[str]]] roles: Grants privilege to these roles.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] shares: Grants privilege to these shares.
        :param pulumi.Input[bool] with_grant_option: When this is set to true, allows the recipient role to grant the privileges to other roles.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DatabaseGrantState.__new__(_DatabaseGrantState)

        __props__.__dict__["database_name"] = database_name
        __props__.__dict__["enable_multiple_grants"] = enable_multiple_grants
        __props__.__dict__["privilege"] = privilege
        __props__.__dict__["revert_ownership_to_role_name"] = revert_ownership_to_role_name
        __props__.__dict__["roles"] = roles
        __props__.__dict__["shares"] = shares
        __props__.__dict__["with_grant_option"] = with_grant_option
        return DatabaseGrant(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="databaseName")
    def database_name(self) -> pulumi.Output[str]:
        """
        The name of the database on which to grant privileges.
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
    @pulumi.getter
    def privilege(self) -> pulumi.Output[Optional[str]]:
        """
        The privilege to grant on the database. To grant all privileges, use the value `ALL PRIVILEGES`.
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
    @pulumi.getter
    def shares(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        Grants privilege to these shares.
        """
        return pulumi.get(self, "shares")

    @property
    @pulumi.getter(name="withGrantOption")
    def with_grant_option(self) -> pulumi.Output[Optional[bool]]:
        """
        When this is set to true, allows the recipient role to grant the privileges to other roles.
        """
        return pulumi.get(self, "with_grant_option")

