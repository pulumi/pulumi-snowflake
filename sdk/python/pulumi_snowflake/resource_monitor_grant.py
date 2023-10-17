# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['ResourceMonitorGrantArgs', 'ResourceMonitorGrant']

@pulumi.input_type
class ResourceMonitorGrantArgs:
    def __init__(__self__, *,
                 monitor_name: pulumi.Input[str],
                 enable_multiple_grants: Optional[pulumi.Input[bool]] = None,
                 privilege: Optional[pulumi.Input[str]] = None,
                 roles: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 with_grant_option: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a ResourceMonitorGrant resource.
        :param pulumi.Input[str] monitor_name: Identifier for the resource monitor; must be unique for your account.
        :param pulumi.Input[bool] enable_multiple_grants: When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
               grants applied to roles and objects outside Terraform.
        :param pulumi.Input[str] privilege: The privilege to grant on the resource monitor. To grant all privileges, use the value `ALL PRIVILEGES`
        :param pulumi.Input[Sequence[pulumi.Input[str]]] roles: Grants privilege to these roles.
        :param pulumi.Input[bool] with_grant_option: When this is set to true, allows the recipient role to grant the privileges to other roles.
        """
        ResourceMonitorGrantArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            monitor_name=monitor_name,
            enable_multiple_grants=enable_multiple_grants,
            privilege=privilege,
            roles=roles,
            with_grant_option=with_grant_option,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             monitor_name: pulumi.Input[str],
             enable_multiple_grants: Optional[pulumi.Input[bool]] = None,
             privilege: Optional[pulumi.Input[str]] = None,
             roles: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
             with_grant_option: Optional[pulumi.Input[bool]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if 'monitorName' in kwargs:
            monitor_name = kwargs['monitorName']
        if 'enableMultipleGrants' in kwargs:
            enable_multiple_grants = kwargs['enableMultipleGrants']
        if 'withGrantOption' in kwargs:
            with_grant_option = kwargs['withGrantOption']

        _setter("monitor_name", monitor_name)
        if enable_multiple_grants is not None:
            _setter("enable_multiple_grants", enable_multiple_grants)
        if privilege is not None:
            _setter("privilege", privilege)
        if roles is not None:
            _setter("roles", roles)
        if with_grant_option is not None:
            _setter("with_grant_option", with_grant_option)

    @property
    @pulumi.getter(name="monitorName")
    def monitor_name(self) -> pulumi.Input[str]:
        """
        Identifier for the resource monitor; must be unique for your account.
        """
        return pulumi.get(self, "monitor_name")

    @monitor_name.setter
    def monitor_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "monitor_name", value)

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
        The privilege to grant on the resource monitor. To grant all privileges, use the value `ALL PRIVILEGES`
        """
        return pulumi.get(self, "privilege")

    @privilege.setter
    def privilege(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "privilege", value)

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
class _ResourceMonitorGrantState:
    def __init__(__self__, *,
                 enable_multiple_grants: Optional[pulumi.Input[bool]] = None,
                 monitor_name: Optional[pulumi.Input[str]] = None,
                 privilege: Optional[pulumi.Input[str]] = None,
                 roles: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 with_grant_option: Optional[pulumi.Input[bool]] = None):
        """
        Input properties used for looking up and filtering ResourceMonitorGrant resources.
        :param pulumi.Input[bool] enable_multiple_grants: When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
               grants applied to roles and objects outside Terraform.
        :param pulumi.Input[str] monitor_name: Identifier for the resource monitor; must be unique for your account.
        :param pulumi.Input[str] privilege: The privilege to grant on the resource monitor. To grant all privileges, use the value `ALL PRIVILEGES`
        :param pulumi.Input[Sequence[pulumi.Input[str]]] roles: Grants privilege to these roles.
        :param pulumi.Input[bool] with_grant_option: When this is set to true, allows the recipient role to grant the privileges to other roles.
        """
        _ResourceMonitorGrantState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            enable_multiple_grants=enable_multiple_grants,
            monitor_name=monitor_name,
            privilege=privilege,
            roles=roles,
            with_grant_option=with_grant_option,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             enable_multiple_grants: Optional[pulumi.Input[bool]] = None,
             monitor_name: Optional[pulumi.Input[str]] = None,
             privilege: Optional[pulumi.Input[str]] = None,
             roles: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
             with_grant_option: Optional[pulumi.Input[bool]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if 'enableMultipleGrants' in kwargs:
            enable_multiple_grants = kwargs['enableMultipleGrants']
        if 'monitorName' in kwargs:
            monitor_name = kwargs['monitorName']
        if 'withGrantOption' in kwargs:
            with_grant_option = kwargs['withGrantOption']

        if enable_multiple_grants is not None:
            _setter("enable_multiple_grants", enable_multiple_grants)
        if monitor_name is not None:
            _setter("monitor_name", monitor_name)
        if privilege is not None:
            _setter("privilege", privilege)
        if roles is not None:
            _setter("roles", roles)
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
    @pulumi.getter(name="monitorName")
    def monitor_name(self) -> Optional[pulumi.Input[str]]:
        """
        Identifier for the resource monitor; must be unique for your account.
        """
        return pulumi.get(self, "monitor_name")

    @monitor_name.setter
    def monitor_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "monitor_name", value)

    @property
    @pulumi.getter
    def privilege(self) -> Optional[pulumi.Input[str]]:
        """
        The privilege to grant on the resource monitor. To grant all privileges, use the value `ALL PRIVILEGES`
        """
        return pulumi.get(self, "privilege")

    @privilege.setter
    def privilege(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "privilege", value)

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


class ResourceMonitorGrant(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 enable_multiple_grants: Optional[pulumi.Input[bool]] = None,
                 monitor_name: Optional[pulumi.Input[str]] = None,
                 privilege: Optional[pulumi.Input[str]] = None,
                 roles: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 with_grant_option: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_snowflake as snowflake

        grant = snowflake.ResourceMonitorGrant("grant",
            monitor_name="monitor",
            privilege="MODIFY",
            roles=["role1"],
            with_grant_option=False)
        ```

        ## Import

        format is monitor_name|privilege|with_grant_option|roles

        ```sh
         $ pulumi import snowflake:index/resourceMonitorGrant:ResourceMonitorGrant example "MY_RESOURCE_MONITOR|MONITOR|false|role1,role2"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] enable_multiple_grants: When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
               grants applied to roles and objects outside Terraform.
        :param pulumi.Input[str] monitor_name: Identifier for the resource monitor; must be unique for your account.
        :param pulumi.Input[str] privilege: The privilege to grant on the resource monitor. To grant all privileges, use the value `ALL PRIVILEGES`
        :param pulumi.Input[Sequence[pulumi.Input[str]]] roles: Grants privilege to these roles.
        :param pulumi.Input[bool] with_grant_option: When this is set to true, allows the recipient role to grant the privileges to other roles.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ResourceMonitorGrantArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_snowflake as snowflake

        grant = snowflake.ResourceMonitorGrant("grant",
            monitor_name="monitor",
            privilege="MODIFY",
            roles=["role1"],
            with_grant_option=False)
        ```

        ## Import

        format is monitor_name|privilege|with_grant_option|roles

        ```sh
         $ pulumi import snowflake:index/resourceMonitorGrant:ResourceMonitorGrant example "MY_RESOURCE_MONITOR|MONITOR|false|role1,role2"
        ```

        :param str resource_name: The name of the resource.
        :param ResourceMonitorGrantArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ResourceMonitorGrantArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            ResourceMonitorGrantArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 enable_multiple_grants: Optional[pulumi.Input[bool]] = None,
                 monitor_name: Optional[pulumi.Input[str]] = None,
                 privilege: Optional[pulumi.Input[str]] = None,
                 roles: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 with_grant_option: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ResourceMonitorGrantArgs.__new__(ResourceMonitorGrantArgs)

            __props__.__dict__["enable_multiple_grants"] = enable_multiple_grants
            if monitor_name is None and not opts.urn:
                raise TypeError("Missing required property 'monitor_name'")
            __props__.__dict__["monitor_name"] = monitor_name
            __props__.__dict__["privilege"] = privilege
            __props__.__dict__["roles"] = roles
            __props__.__dict__["with_grant_option"] = with_grant_option
        super(ResourceMonitorGrant, __self__).__init__(
            'snowflake:index/resourceMonitorGrant:ResourceMonitorGrant',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            enable_multiple_grants: Optional[pulumi.Input[bool]] = None,
            monitor_name: Optional[pulumi.Input[str]] = None,
            privilege: Optional[pulumi.Input[str]] = None,
            roles: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            with_grant_option: Optional[pulumi.Input[bool]] = None) -> 'ResourceMonitorGrant':
        """
        Get an existing ResourceMonitorGrant resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] enable_multiple_grants: When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
               grants applied to roles and objects outside Terraform.
        :param pulumi.Input[str] monitor_name: Identifier for the resource monitor; must be unique for your account.
        :param pulumi.Input[str] privilege: The privilege to grant on the resource monitor. To grant all privileges, use the value `ALL PRIVILEGES`
        :param pulumi.Input[Sequence[pulumi.Input[str]]] roles: Grants privilege to these roles.
        :param pulumi.Input[bool] with_grant_option: When this is set to true, allows the recipient role to grant the privileges to other roles.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ResourceMonitorGrantState.__new__(_ResourceMonitorGrantState)

        __props__.__dict__["enable_multiple_grants"] = enable_multiple_grants
        __props__.__dict__["monitor_name"] = monitor_name
        __props__.__dict__["privilege"] = privilege
        __props__.__dict__["roles"] = roles
        __props__.__dict__["with_grant_option"] = with_grant_option
        return ResourceMonitorGrant(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="enableMultipleGrants")
    def enable_multiple_grants(self) -> pulumi.Output[Optional[bool]]:
        """
        When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
        grants applied to roles and objects outside Terraform.
        """
        return pulumi.get(self, "enable_multiple_grants")

    @property
    @pulumi.getter(name="monitorName")
    def monitor_name(self) -> pulumi.Output[str]:
        """
        Identifier for the resource monitor; must be unique for your account.
        """
        return pulumi.get(self, "monitor_name")

    @property
    @pulumi.getter
    def privilege(self) -> pulumi.Output[Optional[str]]:
        """
        The privilege to grant on the resource monitor. To grant all privileges, use the value `ALL PRIVILEGES`
        """
        return pulumi.get(self, "privilege")

    @property
    @pulumi.getter
    def roles(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        Grants privilege to these roles.
        """
        return pulumi.get(self, "roles")

    @property
    @pulumi.getter(name="withGrantOption")
    def with_grant_option(self) -> pulumi.Output[Optional[bool]]:
        """
        When this is set to true, allows the recipient role to grant the privileges to other roles.
        """
        return pulumi.get(self, "with_grant_option")

