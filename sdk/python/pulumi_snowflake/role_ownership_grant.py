# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['RoleOwnershipGrantArgs', 'RoleOwnershipGrant']

@pulumi.input_type
class RoleOwnershipGrantArgs:
    def __init__(__self__, *,
                 on_role_name: pulumi.Input[str],
                 to_role_name: pulumi.Input[str],
                 current_grants: Optional[pulumi.Input[str]] = None,
                 revert_ownership_to_role_name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a RoleOwnershipGrant resource.
        :param pulumi.Input[str] on_role_name: The name of the role ownership is granted on.
        :param pulumi.Input[str] to_role_name: The name of the role to grant ownership. Please ensure that the role that terraform is using is granted access.
        :param pulumi.Input[str] current_grants: Specifies whether to remove or transfer all existing outbound privileges on the object when ownership is transferred to a new role.
        :param pulumi.Input[str] revert_ownership_to_role_name: The name of the role to revert ownership to on destroy.
        """
        RoleOwnershipGrantArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            on_role_name=on_role_name,
            to_role_name=to_role_name,
            current_grants=current_grants,
            revert_ownership_to_role_name=revert_ownership_to_role_name,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             on_role_name: Optional[pulumi.Input[str]] = None,
             to_role_name: Optional[pulumi.Input[str]] = None,
             current_grants: Optional[pulumi.Input[str]] = None,
             revert_ownership_to_role_name: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if on_role_name is None and 'onRoleName' in kwargs:
            on_role_name = kwargs['onRoleName']
        if on_role_name is None:
            raise TypeError("Missing 'on_role_name' argument")
        if to_role_name is None and 'toRoleName' in kwargs:
            to_role_name = kwargs['toRoleName']
        if to_role_name is None:
            raise TypeError("Missing 'to_role_name' argument")
        if current_grants is None and 'currentGrants' in kwargs:
            current_grants = kwargs['currentGrants']
        if revert_ownership_to_role_name is None and 'revertOwnershipToRoleName' in kwargs:
            revert_ownership_to_role_name = kwargs['revertOwnershipToRoleName']

        _setter("on_role_name", on_role_name)
        _setter("to_role_name", to_role_name)
        if current_grants is not None:
            _setter("current_grants", current_grants)
        if revert_ownership_to_role_name is not None:
            _setter("revert_ownership_to_role_name", revert_ownership_to_role_name)

    @property
    @pulumi.getter(name="onRoleName")
    def on_role_name(self) -> pulumi.Input[str]:
        """
        The name of the role ownership is granted on.
        """
        return pulumi.get(self, "on_role_name")

    @on_role_name.setter
    def on_role_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "on_role_name", value)

    @property
    @pulumi.getter(name="toRoleName")
    def to_role_name(self) -> pulumi.Input[str]:
        """
        The name of the role to grant ownership. Please ensure that the role that terraform is using is granted access.
        """
        return pulumi.get(self, "to_role_name")

    @to_role_name.setter
    def to_role_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "to_role_name", value)

    @property
    @pulumi.getter(name="currentGrants")
    def current_grants(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies whether to remove or transfer all existing outbound privileges on the object when ownership is transferred to a new role.
        """
        return pulumi.get(self, "current_grants")

    @current_grants.setter
    def current_grants(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "current_grants", value)

    @property
    @pulumi.getter(name="revertOwnershipToRoleName")
    def revert_ownership_to_role_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the role to revert ownership to on destroy.
        """
        return pulumi.get(self, "revert_ownership_to_role_name")

    @revert_ownership_to_role_name.setter
    def revert_ownership_to_role_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "revert_ownership_to_role_name", value)


@pulumi.input_type
class _RoleOwnershipGrantState:
    def __init__(__self__, *,
                 current_grants: Optional[pulumi.Input[str]] = None,
                 on_role_name: Optional[pulumi.Input[str]] = None,
                 revert_ownership_to_role_name: Optional[pulumi.Input[str]] = None,
                 to_role_name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering RoleOwnershipGrant resources.
        :param pulumi.Input[str] current_grants: Specifies whether to remove or transfer all existing outbound privileges on the object when ownership is transferred to a new role.
        :param pulumi.Input[str] on_role_name: The name of the role ownership is granted on.
        :param pulumi.Input[str] revert_ownership_to_role_name: The name of the role to revert ownership to on destroy.
        :param pulumi.Input[str] to_role_name: The name of the role to grant ownership. Please ensure that the role that terraform is using is granted access.
        """
        _RoleOwnershipGrantState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            current_grants=current_grants,
            on_role_name=on_role_name,
            revert_ownership_to_role_name=revert_ownership_to_role_name,
            to_role_name=to_role_name,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             current_grants: Optional[pulumi.Input[str]] = None,
             on_role_name: Optional[pulumi.Input[str]] = None,
             revert_ownership_to_role_name: Optional[pulumi.Input[str]] = None,
             to_role_name: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if current_grants is None and 'currentGrants' in kwargs:
            current_grants = kwargs['currentGrants']
        if on_role_name is None and 'onRoleName' in kwargs:
            on_role_name = kwargs['onRoleName']
        if revert_ownership_to_role_name is None and 'revertOwnershipToRoleName' in kwargs:
            revert_ownership_to_role_name = kwargs['revertOwnershipToRoleName']
        if to_role_name is None and 'toRoleName' in kwargs:
            to_role_name = kwargs['toRoleName']

        if current_grants is not None:
            _setter("current_grants", current_grants)
        if on_role_name is not None:
            _setter("on_role_name", on_role_name)
        if revert_ownership_to_role_name is not None:
            _setter("revert_ownership_to_role_name", revert_ownership_to_role_name)
        if to_role_name is not None:
            _setter("to_role_name", to_role_name)

    @property
    @pulumi.getter(name="currentGrants")
    def current_grants(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies whether to remove or transfer all existing outbound privileges on the object when ownership is transferred to a new role.
        """
        return pulumi.get(self, "current_grants")

    @current_grants.setter
    def current_grants(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "current_grants", value)

    @property
    @pulumi.getter(name="onRoleName")
    def on_role_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the role ownership is granted on.
        """
        return pulumi.get(self, "on_role_name")

    @on_role_name.setter
    def on_role_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "on_role_name", value)

    @property
    @pulumi.getter(name="revertOwnershipToRoleName")
    def revert_ownership_to_role_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the role to revert ownership to on destroy.
        """
        return pulumi.get(self, "revert_ownership_to_role_name")

    @revert_ownership_to_role_name.setter
    def revert_ownership_to_role_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "revert_ownership_to_role_name", value)

    @property
    @pulumi.getter(name="toRoleName")
    def to_role_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the role to grant ownership. Please ensure that the role that terraform is using is granted access.
        """
        return pulumi.get(self, "to_role_name")

    @to_role_name.setter
    def to_role_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "to_role_name", value)


class RoleOwnershipGrant(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 current_grants: Optional[pulumi.Input[str]] = None,
                 on_role_name: Optional[pulumi.Input[str]] = None,
                 revert_ownership_to_role_name: Optional[pulumi.Input[str]] = None,
                 to_role_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Create a RoleOwnershipGrant resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] current_grants: Specifies whether to remove or transfer all existing outbound privileges on the object when ownership is transferred to a new role.
        :param pulumi.Input[str] on_role_name: The name of the role ownership is granted on.
        :param pulumi.Input[str] revert_ownership_to_role_name: The name of the role to revert ownership to on destroy.
        :param pulumi.Input[str] to_role_name: The name of the role to grant ownership. Please ensure that the role that terraform is using is granted access.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: RoleOwnershipGrantArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create a RoleOwnershipGrant resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param RoleOwnershipGrantArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(RoleOwnershipGrantArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            RoleOwnershipGrantArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 current_grants: Optional[pulumi.Input[str]] = None,
                 on_role_name: Optional[pulumi.Input[str]] = None,
                 revert_ownership_to_role_name: Optional[pulumi.Input[str]] = None,
                 to_role_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = RoleOwnershipGrantArgs.__new__(RoleOwnershipGrantArgs)

            __props__.__dict__["current_grants"] = current_grants
            if on_role_name is None and not opts.urn:
                raise TypeError("Missing required property 'on_role_name'")
            __props__.__dict__["on_role_name"] = on_role_name
            __props__.__dict__["revert_ownership_to_role_name"] = revert_ownership_to_role_name
            if to_role_name is None and not opts.urn:
                raise TypeError("Missing required property 'to_role_name'")
            __props__.__dict__["to_role_name"] = to_role_name
        super(RoleOwnershipGrant, __self__).__init__(
            'snowflake:index/roleOwnershipGrant:RoleOwnershipGrant',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            current_grants: Optional[pulumi.Input[str]] = None,
            on_role_name: Optional[pulumi.Input[str]] = None,
            revert_ownership_to_role_name: Optional[pulumi.Input[str]] = None,
            to_role_name: Optional[pulumi.Input[str]] = None) -> 'RoleOwnershipGrant':
        """
        Get an existing RoleOwnershipGrant resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] current_grants: Specifies whether to remove or transfer all existing outbound privileges on the object when ownership is transferred to a new role.
        :param pulumi.Input[str] on_role_name: The name of the role ownership is granted on.
        :param pulumi.Input[str] revert_ownership_to_role_name: The name of the role to revert ownership to on destroy.
        :param pulumi.Input[str] to_role_name: The name of the role to grant ownership. Please ensure that the role that terraform is using is granted access.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _RoleOwnershipGrantState.__new__(_RoleOwnershipGrantState)

        __props__.__dict__["current_grants"] = current_grants
        __props__.__dict__["on_role_name"] = on_role_name
        __props__.__dict__["revert_ownership_to_role_name"] = revert_ownership_to_role_name
        __props__.__dict__["to_role_name"] = to_role_name
        return RoleOwnershipGrant(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="currentGrants")
    def current_grants(self) -> pulumi.Output[Optional[str]]:
        """
        Specifies whether to remove or transfer all existing outbound privileges on the object when ownership is transferred to a new role.
        """
        return pulumi.get(self, "current_grants")

    @property
    @pulumi.getter(name="onRoleName")
    def on_role_name(self) -> pulumi.Output[str]:
        """
        The name of the role ownership is granted on.
        """
        return pulumi.get(self, "on_role_name")

    @property
    @pulumi.getter(name="revertOwnershipToRoleName")
    def revert_ownership_to_role_name(self) -> pulumi.Output[Optional[str]]:
        """
        The name of the role to revert ownership to on destroy.
        """
        return pulumi.get(self, "revert_ownership_to_role_name")

    @property
    @pulumi.getter(name="toRoleName")
    def to_role_name(self) -> pulumi.Output[str]:
        """
        The name of the role to grant ownership. Please ensure that the role that terraform is using is granted access.
        """
        return pulumi.get(self, "to_role_name")

