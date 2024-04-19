# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['RoleGrantsArgs', 'RoleGrants']

@pulumi.input_type
class RoleGrantsArgs:
    def __init__(__self__, *,
                 role_name: pulumi.Input[str],
                 enable_multiple_grants: Optional[pulumi.Input[bool]] = None,
                 roles: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 users: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a RoleGrants resource.
        :param pulumi.Input[str] role_name: The name of the role we are granting.
        :param pulumi.Input[bool] enable_multiple_grants: When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
               grants applied to roles and objects outside Terraform.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] roles: Grants role to this specified role.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] users: Grants role to this specified user.
        """
        pulumi.set(__self__, "role_name", role_name)
        if enable_multiple_grants is not None:
            pulumi.set(__self__, "enable_multiple_grants", enable_multiple_grants)
        if roles is not None:
            pulumi.set(__self__, "roles", roles)
        if users is not None:
            pulumi.set(__self__, "users", users)

    @property
    @pulumi.getter(name="roleName")
    def role_name(self) -> pulumi.Input[str]:
        """
        The name of the role we are granting.
        """
        return pulumi.get(self, "role_name")

    @role_name.setter
    def role_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "role_name", value)

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
    def roles(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Grants role to this specified role.
        """
        return pulumi.get(self, "roles")

    @roles.setter
    def roles(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "roles", value)

    @property
    @pulumi.getter
    def users(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Grants role to this specified user.
        """
        return pulumi.get(self, "users")

    @users.setter
    def users(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "users", value)


@pulumi.input_type
class _RoleGrantsState:
    def __init__(__self__, *,
                 enable_multiple_grants: Optional[pulumi.Input[bool]] = None,
                 role_name: Optional[pulumi.Input[str]] = None,
                 roles: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 users: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering RoleGrants resources.
        :param pulumi.Input[bool] enable_multiple_grants: When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
               grants applied to roles and objects outside Terraform.
        :param pulumi.Input[str] role_name: The name of the role we are granting.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] roles: Grants role to this specified role.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] users: Grants role to this specified user.
        """
        if enable_multiple_grants is not None:
            pulumi.set(__self__, "enable_multiple_grants", enable_multiple_grants)
        if role_name is not None:
            pulumi.set(__self__, "role_name", role_name)
        if roles is not None:
            pulumi.set(__self__, "roles", roles)
        if users is not None:
            pulumi.set(__self__, "users", users)

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
    @pulumi.getter(name="roleName")
    def role_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the role we are granting.
        """
        return pulumi.get(self, "role_name")

    @role_name.setter
    def role_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "role_name", value)

    @property
    @pulumi.getter
    def roles(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Grants role to this specified role.
        """
        return pulumi.get(self, "roles")

    @roles.setter
    def roles(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "roles", value)

    @property
    @pulumi.getter
    def users(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Grants role to this specified user.
        """
        return pulumi.get(self, "users")

    @users.setter
    def users(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "users", value)


class RoleGrants(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 enable_multiple_grants: Optional[pulumi.Input[bool]] = None,
                 role_name: Optional[pulumi.Input[str]] = None,
                 roles: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 users: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        > **Deprecation** This resource is deprecated and will be removed in a future major version release. Please use GrantAccountRole instead. <deprecation>

        ## Example Usage

        ```python
        import pulumi
        import pulumi_snowflake as snowflake

        role = snowflake.Role("role", comment="for testing")
        user = snowflake.User("user", comment="for testing")
        user2 = snowflake.User("user2", comment="for testing")
        other_role = snowflake.Role("otherRole")
        grants = snowflake.RoleGrants("grants",
            role_name=role.name,
            roles=[other_role.name],
            users=[
                user.name,
                user2.name,
            ])
        ```

        ## Import

        format is role_name|roles|users

        ```sh
        $ pulumi import snowflake:index/roleGrants:RoleGrants example "role_name|role1,role2|user1,user2"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] enable_multiple_grants: When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
               grants applied to roles and objects outside Terraform.
        :param pulumi.Input[str] role_name: The name of the role we are granting.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] roles: Grants role to this specified role.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] users: Grants role to this specified user.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: RoleGrantsArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        > **Deprecation** This resource is deprecated and will be removed in a future major version release. Please use GrantAccountRole instead. <deprecation>

        ## Example Usage

        ```python
        import pulumi
        import pulumi_snowflake as snowflake

        role = snowflake.Role("role", comment="for testing")
        user = snowflake.User("user", comment="for testing")
        user2 = snowflake.User("user2", comment="for testing")
        other_role = snowflake.Role("otherRole")
        grants = snowflake.RoleGrants("grants",
            role_name=role.name,
            roles=[other_role.name],
            users=[
                user.name,
                user2.name,
            ])
        ```

        ## Import

        format is role_name|roles|users

        ```sh
        $ pulumi import snowflake:index/roleGrants:RoleGrants example "role_name|role1,role2|user1,user2"
        ```

        :param str resource_name: The name of the resource.
        :param RoleGrantsArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(RoleGrantsArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 enable_multiple_grants: Optional[pulumi.Input[bool]] = None,
                 role_name: Optional[pulumi.Input[str]] = None,
                 roles: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 users: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = RoleGrantsArgs.__new__(RoleGrantsArgs)

            __props__.__dict__["enable_multiple_grants"] = enable_multiple_grants
            if role_name is None and not opts.urn:
                raise TypeError("Missing required property 'role_name'")
            __props__.__dict__["role_name"] = role_name
            __props__.__dict__["roles"] = roles
            __props__.__dict__["users"] = users
        super(RoleGrants, __self__).__init__(
            'snowflake:index/roleGrants:RoleGrants',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            enable_multiple_grants: Optional[pulumi.Input[bool]] = None,
            role_name: Optional[pulumi.Input[str]] = None,
            roles: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            users: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None) -> 'RoleGrants':
        """
        Get an existing RoleGrants resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] enable_multiple_grants: When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
               grants applied to roles and objects outside Terraform.
        :param pulumi.Input[str] role_name: The name of the role we are granting.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] roles: Grants role to this specified role.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] users: Grants role to this specified user.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _RoleGrantsState.__new__(_RoleGrantsState)

        __props__.__dict__["enable_multiple_grants"] = enable_multiple_grants
        __props__.__dict__["role_name"] = role_name
        __props__.__dict__["roles"] = roles
        __props__.__dict__["users"] = users
        return RoleGrants(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="enableMultipleGrants")
    def enable_multiple_grants(self) -> pulumi.Output[Optional[bool]]:
        """
        When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
        grants applied to roles and objects outside Terraform.
        """
        return pulumi.get(self, "enable_multiple_grants")

    @property
    @pulumi.getter(name="roleName")
    def role_name(self) -> pulumi.Output[str]:
        """
        The name of the role we are granting.
        """
        return pulumi.get(self, "role_name")

    @property
    @pulumi.getter
    def roles(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        Grants role to this specified role.
        """
        return pulumi.get(self, "roles")

    @property
    @pulumi.getter
    def users(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        Grants role to this specified user.
        """
        return pulumi.get(self, "users")

