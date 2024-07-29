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

__all__ = ['RoleArgs', 'Role']

@pulumi.input_type
class RoleArgs:
    def __init__(__self__, *,
                 comment: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Role resource.
        """
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "comment", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _RoleState:
    def __init__(__self__, *,
                 comment: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 show_outputs: Optional[pulumi.Input[Sequence[pulumi.Input['RoleShowOutputArgs']]]] = None):
        """
        Input properties used for looking up and filtering Role resources.
        :param pulumi.Input[Sequence[pulumi.Input['RoleShowOutputArgs']]] show_outputs: Outputs the result of `SHOW ROLES` for the given role.
        """
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if show_outputs is not None:
            pulumi.set(__self__, "show_outputs", show_outputs)

    @property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "comment", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="showOutputs")
    def show_outputs(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['RoleShowOutputArgs']]]]:
        """
        Outputs the result of `SHOW ROLES` for the given role.
        """
        return pulumi.get(self, "show_outputs")

    @show_outputs.setter
    def show_outputs(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['RoleShowOutputArgs']]]]):
        pulumi.set(self, "show_outputs", value)


class Role(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        > **Deprecation** This resource is deprecated and will be removed in a future major version release. Please use AccountRole instead. <deprecation>

        The resource is used for role management, where roles can be assigned privileges and, in turn, granted to users and other roles. When granted to roles they can create hierarchies of privilege structures. For more details, refer to the [official documentation](https://docs.snowflake.com/en/user-guide/security-access-control-overview).

        ## Minimal

        resource "Role" "minimal" {
          name = "role_name"
        }

        ## Complete (with every optional set)

        resource "Role" "complete" {
          name    = "role_name"
          comment = "my account role"
        }

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[RoleArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        > **Deprecation** This resource is deprecated and will be removed in a future major version release. Please use AccountRole instead. <deprecation>

        The resource is used for role management, where roles can be assigned privileges and, in turn, granted to users and other roles. When granted to roles they can create hierarchies of privilege structures. For more details, refer to the [official documentation](https://docs.snowflake.com/en/user-guide/security-access-control-overview).

        ## Minimal

        resource "Role" "minimal" {
          name = "role_name"
        }

        ## Complete (with every optional set)

        resource "Role" "complete" {
          name    = "role_name"
          comment = "my account role"
        }

        :param str resource_name: The name of the resource.
        :param RoleArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(RoleArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = RoleArgs.__new__(RoleArgs)

            __props__.__dict__["comment"] = comment
            __props__.__dict__["name"] = name
            __props__.__dict__["show_outputs"] = None
        super(Role, __self__).__init__(
            'snowflake:index/role:Role',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            comment: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            show_outputs: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['RoleShowOutputArgs']]]]] = None) -> 'Role':
        """
        Get an existing Role resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['RoleShowOutputArgs']]]] show_outputs: Outputs the result of `SHOW ROLES` for the given role.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _RoleState.__new__(_RoleState)

        __props__.__dict__["comment"] = comment
        __props__.__dict__["name"] = name
        __props__.__dict__["show_outputs"] = show_outputs
        return Role(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def comment(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "comment")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="showOutputs")
    def show_outputs(self) -> pulumi.Output[Sequence['outputs.RoleShowOutput']]:
        """
        Outputs the result of `SHOW ROLES` for the given role.
        """
        return pulumi.get(self, "show_outputs")

