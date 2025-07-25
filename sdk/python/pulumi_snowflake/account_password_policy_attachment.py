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

__all__ = ['AccountPasswordPolicyAttachmentArgs', 'AccountPasswordPolicyAttachment']

@pulumi.input_type
class AccountPasswordPolicyAttachmentArgs:
    def __init__(__self__, *,
                 password_policy: pulumi.Input[_builtins.str]):
        """
        The set of arguments for constructing a AccountPasswordPolicyAttachment resource.
        :param pulumi.Input[_builtins.str] password_policy: Qualified name (`"db"."schema"."policy_name"`) of the password policy to apply to the current account.
        """
        pulumi.set(__self__, "password_policy", password_policy)

    @_builtins.property
    @pulumi.getter(name="passwordPolicy")
    def password_policy(self) -> pulumi.Input[_builtins.str]:
        """
        Qualified name (`"db"."schema"."policy_name"`) of the password policy to apply to the current account.
        """
        return pulumi.get(self, "password_policy")

    @password_policy.setter
    def password_policy(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "password_policy", value)


@pulumi.input_type
class _AccountPasswordPolicyAttachmentState:
    def __init__(__self__, *,
                 password_policy: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering AccountPasswordPolicyAttachment resources.
        :param pulumi.Input[_builtins.str] password_policy: Qualified name (`"db"."schema"."policy_name"`) of the password policy to apply to the current account.
        """
        if password_policy is not None:
            pulumi.set(__self__, "password_policy", password_policy)

    @_builtins.property
    @pulumi.getter(name="passwordPolicy")
    def password_policy(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Qualified name (`"db"."schema"."policy_name"`) of the password policy to apply to the current account.
        """
        return pulumi.get(self, "password_policy")

    @password_policy.setter
    def password_policy(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "password_policy", value)


@pulumi.type_token("snowflake:index/accountPasswordPolicyAttachment:AccountPasswordPolicyAttachment")
class AccountPasswordPolicyAttachment(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 password_policy: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Create a AccountPasswordPolicyAttachment resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] password_policy: Qualified name (`"db"."schema"."policy_name"`) of the password policy to apply to the current account.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AccountPasswordPolicyAttachmentArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create a AccountPasswordPolicyAttachment resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param AccountPasswordPolicyAttachmentArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AccountPasswordPolicyAttachmentArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 password_policy: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AccountPasswordPolicyAttachmentArgs.__new__(AccountPasswordPolicyAttachmentArgs)

            if password_policy is None and not opts.urn:
                raise TypeError("Missing required property 'password_policy'")
            __props__.__dict__["password_policy"] = password_policy
        super(AccountPasswordPolicyAttachment, __self__).__init__(
            'snowflake:index/accountPasswordPolicyAttachment:AccountPasswordPolicyAttachment',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            password_policy: Optional[pulumi.Input[_builtins.str]] = None) -> 'AccountPasswordPolicyAttachment':
        """
        Get an existing AccountPasswordPolicyAttachment resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] password_policy: Qualified name (`"db"."schema"."policy_name"`) of the password policy to apply to the current account.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AccountPasswordPolicyAttachmentState.__new__(_AccountPasswordPolicyAttachmentState)

        __props__.__dict__["password_policy"] = password_policy
        return AccountPasswordPolicyAttachment(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="passwordPolicy")
    def password_policy(self) -> pulumi.Output[_builtins.str]:
        """
        Qualified name (`"db"."schema"."policy_name"`) of the password policy to apply to the current account.
        """
        return pulumi.get(self, "password_policy")

