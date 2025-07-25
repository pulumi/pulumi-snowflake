# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins as _builtins
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

__all__ = ['UserAuthenticationPolicyAttachmentArgs', 'UserAuthenticationPolicyAttachment']

@pulumi.input_type
class UserAuthenticationPolicyAttachmentArgs:
    def __init__(__self__, *,
                 authentication_policy_name: pulumi.Input[_builtins.str],
                 user_name: pulumi.Input[_builtins.str]):
        """
        The set of arguments for constructing a UserAuthenticationPolicyAttachment resource.
        :param pulumi.Input[_builtins.str] authentication_policy_name: Fully qualified name of the authentication policy
        :param pulumi.Input[_builtins.str] user_name: User name of the user you want to attach the authentication policy to
        """
        pulumi.set(__self__, "authentication_policy_name", authentication_policy_name)
        pulumi.set(__self__, "user_name", user_name)

    @_builtins.property
    @pulumi.getter(name="authenticationPolicyName")
    def authentication_policy_name(self) -> pulumi.Input[_builtins.str]:
        """
        Fully qualified name of the authentication policy
        """
        return pulumi.get(self, "authentication_policy_name")

    @authentication_policy_name.setter
    def authentication_policy_name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "authentication_policy_name", value)

    @_builtins.property
    @pulumi.getter(name="userName")
    def user_name(self) -> pulumi.Input[_builtins.str]:
        """
        User name of the user you want to attach the authentication policy to
        """
        return pulumi.get(self, "user_name")

    @user_name.setter
    def user_name(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "user_name", value)


@pulumi.input_type
class _UserAuthenticationPolicyAttachmentState:
    def __init__(__self__, *,
                 authentication_policy_name: Optional[pulumi.Input[_builtins.str]] = None,
                 user_name: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering UserAuthenticationPolicyAttachment resources.
        :param pulumi.Input[_builtins.str] authentication_policy_name: Fully qualified name of the authentication policy
        :param pulumi.Input[_builtins.str] user_name: User name of the user you want to attach the authentication policy to
        """
        if authentication_policy_name is not None:
            pulumi.set(__self__, "authentication_policy_name", authentication_policy_name)
        if user_name is not None:
            pulumi.set(__self__, "user_name", user_name)

    @_builtins.property
    @pulumi.getter(name="authenticationPolicyName")
    def authentication_policy_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Fully qualified name of the authentication policy
        """
        return pulumi.get(self, "authentication_policy_name")

    @authentication_policy_name.setter
    def authentication_policy_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "authentication_policy_name", value)

    @_builtins.property
    @pulumi.getter(name="userName")
    def user_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        User name of the user you want to attach the authentication policy to
        """
        return pulumi.get(self, "user_name")

    @user_name.setter
    def user_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "user_name", value)


@pulumi.type_token("snowflake:index/userAuthenticationPolicyAttachment:UserAuthenticationPolicyAttachment")
class UserAuthenticationPolicyAttachment(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 authentication_policy_name: Optional[pulumi.Input[_builtins.str]] = None,
                 user_name: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Create a UserAuthenticationPolicyAttachment resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] authentication_policy_name: Fully qualified name of the authentication policy
        :param pulumi.Input[_builtins.str] user_name: User name of the user you want to attach the authentication policy to
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: UserAuthenticationPolicyAttachmentArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create a UserAuthenticationPolicyAttachment resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param UserAuthenticationPolicyAttachmentArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(UserAuthenticationPolicyAttachmentArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 authentication_policy_name: Optional[pulumi.Input[_builtins.str]] = None,
                 user_name: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = UserAuthenticationPolicyAttachmentArgs.__new__(UserAuthenticationPolicyAttachmentArgs)

            if authentication_policy_name is None and not opts.urn:
                raise TypeError("Missing required property 'authentication_policy_name'")
            __props__.__dict__["authentication_policy_name"] = authentication_policy_name
            if user_name is None and not opts.urn:
                raise TypeError("Missing required property 'user_name'")
            __props__.__dict__["user_name"] = user_name
        super(UserAuthenticationPolicyAttachment, __self__).__init__(
            'snowflake:index/userAuthenticationPolicyAttachment:UserAuthenticationPolicyAttachment',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            authentication_policy_name: Optional[pulumi.Input[_builtins.str]] = None,
            user_name: Optional[pulumi.Input[_builtins.str]] = None) -> 'UserAuthenticationPolicyAttachment':
        """
        Get an existing UserAuthenticationPolicyAttachment resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] authentication_policy_name: Fully qualified name of the authentication policy
        :param pulumi.Input[_builtins.str] user_name: User name of the user you want to attach the authentication policy to
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _UserAuthenticationPolicyAttachmentState.__new__(_UserAuthenticationPolicyAttachmentState)

        __props__.__dict__["authentication_policy_name"] = authentication_policy_name
        __props__.__dict__["user_name"] = user_name
        return UserAuthenticationPolicyAttachment(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="authenticationPolicyName")
    def authentication_policy_name(self) -> pulumi.Output[_builtins.str]:
        """
        Fully qualified name of the authentication policy
        """
        return pulumi.get(self, "authentication_policy_name")

    @_builtins.property
    @pulumi.getter(name="userName")
    def user_name(self) -> pulumi.Output[_builtins.str]:
        """
        User name of the user you want to attach the authentication policy to
        """
        return pulumi.get(self, "user_name")

