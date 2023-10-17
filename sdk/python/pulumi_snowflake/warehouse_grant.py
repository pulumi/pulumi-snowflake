# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['WarehouseGrantArgs', 'WarehouseGrant']

@pulumi.input_type
class WarehouseGrantArgs:
    def __init__(__self__, *,
                 warehouse_name: pulumi.Input[str],
                 enable_multiple_grants: Optional[pulumi.Input[bool]] = None,
                 privilege: Optional[pulumi.Input[str]] = None,
                 revert_ownership_to_role_name: Optional[pulumi.Input[str]] = None,
                 roles: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 with_grant_option: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a WarehouseGrant resource.
        :param pulumi.Input[str] warehouse_name: The name of the warehouse on which to grant privileges.
        :param pulumi.Input[bool] enable_multiple_grants: When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
               grants applied to roles and objects outside Terraform.
        :param pulumi.Input[str] privilege: The privilege to grant on the warehouse. To grant all privileges, use the value `ALL PRIVILEGES`.
        :param pulumi.Input[str] revert_ownership_to_role_name: The name of the role to revert ownership to on destroy. Has no effect unless `privilege` is set to `OWNERSHIP`
        :param pulumi.Input[Sequence[pulumi.Input[str]]] roles: Grants privilege to these roles.
        :param pulumi.Input[bool] with_grant_option: When this is set to true, allows the recipient role to grant the privileges to other roles.
        """
        WarehouseGrantArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            warehouse_name=warehouse_name,
            enable_multiple_grants=enable_multiple_grants,
            privilege=privilege,
            revert_ownership_to_role_name=revert_ownership_to_role_name,
            roles=roles,
            with_grant_option=with_grant_option,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             warehouse_name: pulumi.Input[str],
             enable_multiple_grants: Optional[pulumi.Input[bool]] = None,
             privilege: Optional[pulumi.Input[str]] = None,
             revert_ownership_to_role_name: Optional[pulumi.Input[str]] = None,
             roles: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
             with_grant_option: Optional[pulumi.Input[bool]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if 'warehouseName' in kwargs:
            warehouse_name = kwargs['warehouseName']
        if 'enableMultipleGrants' in kwargs:
            enable_multiple_grants = kwargs['enableMultipleGrants']
        if 'revertOwnershipToRoleName' in kwargs:
            revert_ownership_to_role_name = kwargs['revertOwnershipToRoleName']
        if 'withGrantOption' in kwargs:
            with_grant_option = kwargs['withGrantOption']

        _setter("warehouse_name", warehouse_name)
        if enable_multiple_grants is not None:
            _setter("enable_multiple_grants", enable_multiple_grants)
        if privilege is not None:
            _setter("privilege", privilege)
        if revert_ownership_to_role_name is not None:
            _setter("revert_ownership_to_role_name", revert_ownership_to_role_name)
        if roles is not None:
            _setter("roles", roles)
        if with_grant_option is not None:
            _setter("with_grant_option", with_grant_option)

    @property
    @pulumi.getter(name="warehouseName")
    def warehouse_name(self) -> pulumi.Input[str]:
        """
        The name of the warehouse on which to grant privileges.
        """
        return pulumi.get(self, "warehouse_name")

    @warehouse_name.setter
    def warehouse_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "warehouse_name", value)

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
        The privilege to grant on the warehouse. To grant all privileges, use the value `ALL PRIVILEGES`.
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
class _WarehouseGrantState:
    def __init__(__self__, *,
                 enable_multiple_grants: Optional[pulumi.Input[bool]] = None,
                 privilege: Optional[pulumi.Input[str]] = None,
                 revert_ownership_to_role_name: Optional[pulumi.Input[str]] = None,
                 roles: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 warehouse_name: Optional[pulumi.Input[str]] = None,
                 with_grant_option: Optional[pulumi.Input[bool]] = None):
        """
        Input properties used for looking up and filtering WarehouseGrant resources.
        :param pulumi.Input[bool] enable_multiple_grants: When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
               grants applied to roles and objects outside Terraform.
        :param pulumi.Input[str] privilege: The privilege to grant on the warehouse. To grant all privileges, use the value `ALL PRIVILEGES`.
        :param pulumi.Input[str] revert_ownership_to_role_name: The name of the role to revert ownership to on destroy. Has no effect unless `privilege` is set to `OWNERSHIP`
        :param pulumi.Input[Sequence[pulumi.Input[str]]] roles: Grants privilege to these roles.
        :param pulumi.Input[str] warehouse_name: The name of the warehouse on which to grant privileges.
        :param pulumi.Input[bool] with_grant_option: When this is set to true, allows the recipient role to grant the privileges to other roles.
        """
        _WarehouseGrantState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            enable_multiple_grants=enable_multiple_grants,
            privilege=privilege,
            revert_ownership_to_role_name=revert_ownership_to_role_name,
            roles=roles,
            warehouse_name=warehouse_name,
            with_grant_option=with_grant_option,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             enable_multiple_grants: Optional[pulumi.Input[bool]] = None,
             privilege: Optional[pulumi.Input[str]] = None,
             revert_ownership_to_role_name: Optional[pulumi.Input[str]] = None,
             roles: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
             warehouse_name: Optional[pulumi.Input[str]] = None,
             with_grant_option: Optional[pulumi.Input[bool]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if 'enableMultipleGrants' in kwargs:
            enable_multiple_grants = kwargs['enableMultipleGrants']
        if 'revertOwnershipToRoleName' in kwargs:
            revert_ownership_to_role_name = kwargs['revertOwnershipToRoleName']
        if 'warehouseName' in kwargs:
            warehouse_name = kwargs['warehouseName']
        if 'withGrantOption' in kwargs:
            with_grant_option = kwargs['withGrantOption']

        if enable_multiple_grants is not None:
            _setter("enable_multiple_grants", enable_multiple_grants)
        if privilege is not None:
            _setter("privilege", privilege)
        if revert_ownership_to_role_name is not None:
            _setter("revert_ownership_to_role_name", revert_ownership_to_role_name)
        if roles is not None:
            _setter("roles", roles)
        if warehouse_name is not None:
            _setter("warehouse_name", warehouse_name)
        if with_grant_option is not None:
            _setter("with_grant_option", with_grant_option)

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
        The privilege to grant on the warehouse. To grant all privileges, use the value `ALL PRIVILEGES`.
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
    @pulumi.getter(name="warehouseName")
    def warehouse_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the warehouse on which to grant privileges.
        """
        return pulumi.get(self, "warehouse_name")

    @warehouse_name.setter
    def warehouse_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "warehouse_name", value)

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


class WarehouseGrant(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 enable_multiple_grants: Optional[pulumi.Input[bool]] = None,
                 privilege: Optional[pulumi.Input[str]] = None,
                 revert_ownership_to_role_name: Optional[pulumi.Input[str]] = None,
                 roles: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 warehouse_name: Optional[pulumi.Input[str]] = None,
                 with_grant_option: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_snowflake as snowflake

        grant = snowflake.WarehouseGrant("grant",
            privilege="MODIFY",
            roles=[
                "role1",
                "role2",
            ],
            warehouse_name="warehouse",
            with_grant_option=False)
        ```

        ## Import

        format is warehouse_name|privilege|with_grant_option|roles

        ```sh
         $ pulumi import snowflake:index/warehouseGrant:WarehouseGrant example "MY_WAREHOUSE|MODIFY|false|role1,role2"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] enable_multiple_grants: When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
               grants applied to roles and objects outside Terraform.
        :param pulumi.Input[str] privilege: The privilege to grant on the warehouse. To grant all privileges, use the value `ALL PRIVILEGES`.
        :param pulumi.Input[str] revert_ownership_to_role_name: The name of the role to revert ownership to on destroy. Has no effect unless `privilege` is set to `OWNERSHIP`
        :param pulumi.Input[Sequence[pulumi.Input[str]]] roles: Grants privilege to these roles.
        :param pulumi.Input[str] warehouse_name: The name of the warehouse on which to grant privileges.
        :param pulumi.Input[bool] with_grant_option: When this is set to true, allows the recipient role to grant the privileges to other roles.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: WarehouseGrantArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_snowflake as snowflake

        grant = snowflake.WarehouseGrant("grant",
            privilege="MODIFY",
            roles=[
                "role1",
                "role2",
            ],
            warehouse_name="warehouse",
            with_grant_option=False)
        ```

        ## Import

        format is warehouse_name|privilege|with_grant_option|roles

        ```sh
         $ pulumi import snowflake:index/warehouseGrant:WarehouseGrant example "MY_WAREHOUSE|MODIFY|false|role1,role2"
        ```

        :param str resource_name: The name of the resource.
        :param WarehouseGrantArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(WarehouseGrantArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            WarehouseGrantArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 enable_multiple_grants: Optional[pulumi.Input[bool]] = None,
                 privilege: Optional[pulumi.Input[str]] = None,
                 revert_ownership_to_role_name: Optional[pulumi.Input[str]] = None,
                 roles: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 warehouse_name: Optional[pulumi.Input[str]] = None,
                 with_grant_option: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = WarehouseGrantArgs.__new__(WarehouseGrantArgs)

            __props__.__dict__["enable_multiple_grants"] = enable_multiple_grants
            __props__.__dict__["privilege"] = privilege
            __props__.__dict__["revert_ownership_to_role_name"] = revert_ownership_to_role_name
            __props__.__dict__["roles"] = roles
            if warehouse_name is None and not opts.urn:
                raise TypeError("Missing required property 'warehouse_name'")
            __props__.__dict__["warehouse_name"] = warehouse_name
            __props__.__dict__["with_grant_option"] = with_grant_option
        super(WarehouseGrant, __self__).__init__(
            'snowflake:index/warehouseGrant:WarehouseGrant',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            enable_multiple_grants: Optional[pulumi.Input[bool]] = None,
            privilege: Optional[pulumi.Input[str]] = None,
            revert_ownership_to_role_name: Optional[pulumi.Input[str]] = None,
            roles: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            warehouse_name: Optional[pulumi.Input[str]] = None,
            with_grant_option: Optional[pulumi.Input[bool]] = None) -> 'WarehouseGrant':
        """
        Get an existing WarehouseGrant resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] enable_multiple_grants: When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
               grants applied to roles and objects outside Terraform.
        :param pulumi.Input[str] privilege: The privilege to grant on the warehouse. To grant all privileges, use the value `ALL PRIVILEGES`.
        :param pulumi.Input[str] revert_ownership_to_role_name: The name of the role to revert ownership to on destroy. Has no effect unless `privilege` is set to `OWNERSHIP`
        :param pulumi.Input[Sequence[pulumi.Input[str]]] roles: Grants privilege to these roles.
        :param pulumi.Input[str] warehouse_name: The name of the warehouse on which to grant privileges.
        :param pulumi.Input[bool] with_grant_option: When this is set to true, allows the recipient role to grant the privileges to other roles.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _WarehouseGrantState.__new__(_WarehouseGrantState)

        __props__.__dict__["enable_multiple_grants"] = enable_multiple_grants
        __props__.__dict__["privilege"] = privilege
        __props__.__dict__["revert_ownership_to_role_name"] = revert_ownership_to_role_name
        __props__.__dict__["roles"] = roles
        __props__.__dict__["warehouse_name"] = warehouse_name
        __props__.__dict__["with_grant_option"] = with_grant_option
        return WarehouseGrant(resource_name, opts=opts, __props__=__props__)

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
        The privilege to grant on the warehouse. To grant all privileges, use the value `ALL PRIVILEGES`.
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
    @pulumi.getter(name="warehouseName")
    def warehouse_name(self) -> pulumi.Output[str]:
        """
        The name of the warehouse on which to grant privileges.
        """
        return pulumi.get(self, "warehouse_name")

    @property
    @pulumi.getter(name="withGrantOption")
    def with_grant_option(self) -> pulumi.Output[Optional[bool]]:
        """
        When this is set to true, allows the recipient role to grant the privileges to other roles.
        """
        return pulumi.get(self, "with_grant_option")

