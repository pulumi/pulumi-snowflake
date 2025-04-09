# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins
import copy
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

__all__ = ['GrantApplicationRoleArgs', 'GrantApplicationRole']

@pulumi.input_type
class GrantApplicationRoleArgs:
    def __init__(__self__, *,
                 application_role_name: pulumi.Input[builtins.str],
                 application_name: Optional[pulumi.Input[builtins.str]] = None,
                 parent_account_role_name: Optional[pulumi.Input[builtins.str]] = None):
        """
        The set of arguments for constructing a GrantApplicationRole resource.
        :param pulumi.Input[builtins.str] application_role_name: Specifies the identifier for the application role to grant.
        :param pulumi.Input[builtins.str] application_name: The fully qualified name of the application on which application role will be granted.
        :param pulumi.Input[builtins.str] parent_account_role_name: The fully qualified name of the account role on which application role will be granted. For more information about this resource, see docs.
        """
        pulumi.set(__self__, "application_role_name", application_role_name)
        if application_name is not None:
            pulumi.set(__self__, "application_name", application_name)
        if parent_account_role_name is not None:
            pulumi.set(__self__, "parent_account_role_name", parent_account_role_name)

    @property
    @pulumi.getter(name="applicationRoleName")
    def application_role_name(self) -> pulumi.Input[builtins.str]:
        """
        Specifies the identifier for the application role to grant.
        """
        return pulumi.get(self, "application_role_name")

    @application_role_name.setter
    def application_role_name(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "application_role_name", value)

    @property
    @pulumi.getter(name="applicationName")
    def application_name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The fully qualified name of the application on which application role will be granted.
        """
        return pulumi.get(self, "application_name")

    @application_name.setter
    def application_name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "application_name", value)

    @property
    @pulumi.getter(name="parentAccountRoleName")
    def parent_account_role_name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The fully qualified name of the account role on which application role will be granted. For more information about this resource, see docs.
        """
        return pulumi.get(self, "parent_account_role_name")

    @parent_account_role_name.setter
    def parent_account_role_name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "parent_account_role_name", value)


@pulumi.input_type
class _GrantApplicationRoleState:
    def __init__(__self__, *,
                 application_name: Optional[pulumi.Input[builtins.str]] = None,
                 application_role_name: Optional[pulumi.Input[builtins.str]] = None,
                 parent_account_role_name: Optional[pulumi.Input[builtins.str]] = None):
        """
        Input properties used for looking up and filtering GrantApplicationRole resources.
        :param pulumi.Input[builtins.str] application_name: The fully qualified name of the application on which application role will be granted.
        :param pulumi.Input[builtins.str] application_role_name: Specifies the identifier for the application role to grant.
        :param pulumi.Input[builtins.str] parent_account_role_name: The fully qualified name of the account role on which application role will be granted. For more information about this resource, see docs.
        """
        if application_name is not None:
            pulumi.set(__self__, "application_name", application_name)
        if application_role_name is not None:
            pulumi.set(__self__, "application_role_name", application_role_name)
        if parent_account_role_name is not None:
            pulumi.set(__self__, "parent_account_role_name", parent_account_role_name)

    @property
    @pulumi.getter(name="applicationName")
    def application_name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The fully qualified name of the application on which application role will be granted.
        """
        return pulumi.get(self, "application_name")

    @application_name.setter
    def application_name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "application_name", value)

    @property
    @pulumi.getter(name="applicationRoleName")
    def application_role_name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Specifies the identifier for the application role to grant.
        """
        return pulumi.get(self, "application_role_name")

    @application_role_name.setter
    def application_role_name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "application_role_name", value)

    @property
    @pulumi.getter(name="parentAccountRoleName")
    def parent_account_role_name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The fully qualified name of the account role on which application role will be granted. For more information about this resource, see docs.
        """
        return pulumi.get(self, "parent_account_role_name")

    @parent_account_role_name.setter
    def parent_account_role_name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "parent_account_role_name", value)


class GrantApplicationRole(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 application_name: Optional[pulumi.Input[builtins.str]] = None,
                 application_role_name: Optional[pulumi.Input[builtins.str]] = None,
                 parent_account_role_name: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        """
        ## Import

        format is application_role_name (string) | object_type (ACCOUNT_ROLE|APPLICATION) | grantee_name (string)

        ```sh
        $ pulumi import snowflake:index/grantApplicationRole:GrantApplicationRole example '"my_application"."app_role_1"|ACCOUNT_ROLE|"my_role"'
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] application_name: The fully qualified name of the application on which application role will be granted.
        :param pulumi.Input[builtins.str] application_role_name: Specifies the identifier for the application role to grant.
        :param pulumi.Input[builtins.str] parent_account_role_name: The fully qualified name of the account role on which application role will be granted. For more information about this resource, see docs.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: GrantApplicationRoleArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Import

        format is application_role_name (string) | object_type (ACCOUNT_ROLE|APPLICATION) | grantee_name (string)

        ```sh
        $ pulumi import snowflake:index/grantApplicationRole:GrantApplicationRole example '"my_application"."app_role_1"|ACCOUNT_ROLE|"my_role"'
        ```

        :param str resource_name: The name of the resource.
        :param GrantApplicationRoleArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(GrantApplicationRoleArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 application_name: Optional[pulumi.Input[builtins.str]] = None,
                 application_role_name: Optional[pulumi.Input[builtins.str]] = None,
                 parent_account_role_name: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = GrantApplicationRoleArgs.__new__(GrantApplicationRoleArgs)

            __props__.__dict__["application_name"] = application_name
            if application_role_name is None and not opts.urn:
                raise TypeError("Missing required property 'application_role_name'")
            __props__.__dict__["application_role_name"] = application_role_name
            __props__.__dict__["parent_account_role_name"] = parent_account_role_name
        super(GrantApplicationRole, __self__).__init__(
            'snowflake:index/grantApplicationRole:GrantApplicationRole',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            application_name: Optional[pulumi.Input[builtins.str]] = None,
            application_role_name: Optional[pulumi.Input[builtins.str]] = None,
            parent_account_role_name: Optional[pulumi.Input[builtins.str]] = None) -> 'GrantApplicationRole':
        """
        Get an existing GrantApplicationRole resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] application_name: The fully qualified name of the application on which application role will be granted.
        :param pulumi.Input[builtins.str] application_role_name: Specifies the identifier for the application role to grant.
        :param pulumi.Input[builtins.str] parent_account_role_name: The fully qualified name of the account role on which application role will be granted. For more information about this resource, see docs.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _GrantApplicationRoleState.__new__(_GrantApplicationRoleState)

        __props__.__dict__["application_name"] = application_name
        __props__.__dict__["application_role_name"] = application_role_name
        __props__.__dict__["parent_account_role_name"] = parent_account_role_name
        return GrantApplicationRole(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="applicationName")
    def application_name(self) -> pulumi.Output[Optional[builtins.str]]:
        """
        The fully qualified name of the application on which application role will be granted.
        """
        return pulumi.get(self, "application_name")

    @property
    @pulumi.getter(name="applicationRoleName")
    def application_role_name(self) -> pulumi.Output[builtins.str]:
        """
        Specifies the identifier for the application role to grant.
        """
        return pulumi.get(self, "application_role_name")

    @property
    @pulumi.getter(name="parentAccountRoleName")
    def parent_account_role_name(self) -> pulumi.Output[Optional[builtins.str]]:
        """
        The fully qualified name of the account role on which application role will be granted. For more information about this resource, see docs.
        """
        return pulumi.get(self, "parent_account_role_name")

