# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['NetworkPolicyAttachmentArgs', 'NetworkPolicyAttachment']

@pulumi.input_type
class NetworkPolicyAttachmentArgs:
    def __init__(__self__, *,
                 network_policy_name: pulumi.Input[str],
                 set_for_account: Optional[pulumi.Input[bool]] = None,
                 users: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a NetworkPolicyAttachment resource.
        :param pulumi.Input[str] network_policy_name: Specifies the identifier for the network policy; must be unique for the account in which the network policy is created.
        :param pulumi.Input[bool] set_for_account: Specifies whether the network policy should be applied globally to your Snowflake account\\n\\n\\n\\n**Note:** The Snowflake user running `pulumi up` must be on an IP address allowed by the network policy to set that policy globally on the Snowflake account.\\n\\n\\n\\nAdditionally, a Snowflake account can only have one network policy set globally at any given time. This resource does not enforce one-policy-per-account, it is the user's responsibility to enforce this. If multiple network policy resources have `set_for_account: true`, the final policy set on the account will be non-deterministic.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] users: Specifies which users the network policy should be attached to
        """
        pulumi.set(__self__, "network_policy_name", network_policy_name)
        if set_for_account is not None:
            pulumi.set(__self__, "set_for_account", set_for_account)
        if users is not None:
            pulumi.set(__self__, "users", users)

    @property
    @pulumi.getter(name="networkPolicyName")
    def network_policy_name(self) -> pulumi.Input[str]:
        """
        Specifies the identifier for the network policy; must be unique for the account in which the network policy is created.
        """
        return pulumi.get(self, "network_policy_name")

    @network_policy_name.setter
    def network_policy_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "network_policy_name", value)

    @property
    @pulumi.getter(name="setForAccount")
    def set_for_account(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether the network policy should be applied globally to your Snowflake account\\n\\n\\n\\n**Note:** The Snowflake user running `pulumi up` must be on an IP address allowed by the network policy to set that policy globally on the Snowflake account.\\n\\n\\n\\nAdditionally, a Snowflake account can only have one network policy set globally at any given time. This resource does not enforce one-policy-per-account, it is the user's responsibility to enforce this. If multiple network policy resources have `set_for_account: true`, the final policy set on the account will be non-deterministic.
        """
        return pulumi.get(self, "set_for_account")

    @set_for_account.setter
    def set_for_account(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "set_for_account", value)

    @property
    @pulumi.getter
    def users(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Specifies which users the network policy should be attached to
        """
        return pulumi.get(self, "users")

    @users.setter
    def users(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "users", value)


@pulumi.input_type
class _NetworkPolicyAttachmentState:
    def __init__(__self__, *,
                 network_policy_name: Optional[pulumi.Input[str]] = None,
                 set_for_account: Optional[pulumi.Input[bool]] = None,
                 users: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering NetworkPolicyAttachment resources.
        :param pulumi.Input[str] network_policy_name: Specifies the identifier for the network policy; must be unique for the account in which the network policy is created.
        :param pulumi.Input[bool] set_for_account: Specifies whether the network policy should be applied globally to your Snowflake account\\n\\n\\n\\n**Note:** The Snowflake user running `pulumi up` must be on an IP address allowed by the network policy to set that policy globally on the Snowflake account.\\n\\n\\n\\nAdditionally, a Snowflake account can only have one network policy set globally at any given time. This resource does not enforce one-policy-per-account, it is the user's responsibility to enforce this. If multiple network policy resources have `set_for_account: true`, the final policy set on the account will be non-deterministic.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] users: Specifies which users the network policy should be attached to
        """
        if network_policy_name is not None:
            pulumi.set(__self__, "network_policy_name", network_policy_name)
        if set_for_account is not None:
            pulumi.set(__self__, "set_for_account", set_for_account)
        if users is not None:
            pulumi.set(__self__, "users", users)

    @property
    @pulumi.getter(name="networkPolicyName")
    def network_policy_name(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the identifier for the network policy; must be unique for the account in which the network policy is created.
        """
        return pulumi.get(self, "network_policy_name")

    @network_policy_name.setter
    def network_policy_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "network_policy_name", value)

    @property
    @pulumi.getter(name="setForAccount")
    def set_for_account(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether the network policy should be applied globally to your Snowflake account\\n\\n\\n\\n**Note:** The Snowflake user running `pulumi up` must be on an IP address allowed by the network policy to set that policy globally on the Snowflake account.\\n\\n\\n\\nAdditionally, a Snowflake account can only have one network policy set globally at any given time. This resource does not enforce one-policy-per-account, it is the user's responsibility to enforce this. If multiple network policy resources have `set_for_account: true`, the final policy set on the account will be non-deterministic.
        """
        return pulumi.get(self, "set_for_account")

    @set_for_account.setter
    def set_for_account(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "set_for_account", value)

    @property
    @pulumi.getter
    def users(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Specifies which users the network policy should be attached to
        """
        return pulumi.get(self, "users")

    @users.setter
    def users(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "users", value)


class NetworkPolicyAttachment(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 network_policy_name: Optional[pulumi.Input[str]] = None,
                 set_for_account: Optional[pulumi.Input[bool]] = None,
                 users: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_snowflake as snowflake

        attach = snowflake.NetworkPolicyAttachment("attach",
            network_policy_name="policy",
            set_for_account=False,
            users=[
                "user1",
                "user2",
            ])
        ```

        ## Import

        ```sh
        $ pulumi import snowflake:index/networkPolicyAttachment:NetworkPolicyAttachment example attachment_policyname
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] network_policy_name: Specifies the identifier for the network policy; must be unique for the account in which the network policy is created.
        :param pulumi.Input[bool] set_for_account: Specifies whether the network policy should be applied globally to your Snowflake account\\n\\n\\n\\n**Note:** The Snowflake user running `pulumi up` must be on an IP address allowed by the network policy to set that policy globally on the Snowflake account.\\n\\n\\n\\nAdditionally, a Snowflake account can only have one network policy set globally at any given time. This resource does not enforce one-policy-per-account, it is the user's responsibility to enforce this. If multiple network policy resources have `set_for_account: true`, the final policy set on the account will be non-deterministic.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] users: Specifies which users the network policy should be attached to
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: NetworkPolicyAttachmentArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_snowflake as snowflake

        attach = snowflake.NetworkPolicyAttachment("attach",
            network_policy_name="policy",
            set_for_account=False,
            users=[
                "user1",
                "user2",
            ])
        ```

        ## Import

        ```sh
        $ pulumi import snowflake:index/networkPolicyAttachment:NetworkPolicyAttachment example attachment_policyname
        ```

        :param str resource_name: The name of the resource.
        :param NetworkPolicyAttachmentArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(NetworkPolicyAttachmentArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 network_policy_name: Optional[pulumi.Input[str]] = None,
                 set_for_account: Optional[pulumi.Input[bool]] = None,
                 users: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = NetworkPolicyAttachmentArgs.__new__(NetworkPolicyAttachmentArgs)

            if network_policy_name is None and not opts.urn:
                raise TypeError("Missing required property 'network_policy_name'")
            __props__.__dict__["network_policy_name"] = network_policy_name
            __props__.__dict__["set_for_account"] = set_for_account
            __props__.__dict__["users"] = users
        super(NetworkPolicyAttachment, __self__).__init__(
            'snowflake:index/networkPolicyAttachment:NetworkPolicyAttachment',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            network_policy_name: Optional[pulumi.Input[str]] = None,
            set_for_account: Optional[pulumi.Input[bool]] = None,
            users: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None) -> 'NetworkPolicyAttachment':
        """
        Get an existing NetworkPolicyAttachment resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] network_policy_name: Specifies the identifier for the network policy; must be unique for the account in which the network policy is created.
        :param pulumi.Input[bool] set_for_account: Specifies whether the network policy should be applied globally to your Snowflake account\\n\\n\\n\\n**Note:** The Snowflake user running `pulumi up` must be on an IP address allowed by the network policy to set that policy globally on the Snowflake account.\\n\\n\\n\\nAdditionally, a Snowflake account can only have one network policy set globally at any given time. This resource does not enforce one-policy-per-account, it is the user's responsibility to enforce this. If multiple network policy resources have `set_for_account: true`, the final policy set on the account will be non-deterministic.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] users: Specifies which users the network policy should be attached to
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _NetworkPolicyAttachmentState.__new__(_NetworkPolicyAttachmentState)

        __props__.__dict__["network_policy_name"] = network_policy_name
        __props__.__dict__["set_for_account"] = set_for_account
        __props__.__dict__["users"] = users
        return NetworkPolicyAttachment(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="networkPolicyName")
    def network_policy_name(self) -> pulumi.Output[str]:
        """
        Specifies the identifier for the network policy; must be unique for the account in which the network policy is created.
        """
        return pulumi.get(self, "network_policy_name")

    @property
    @pulumi.getter(name="setForAccount")
    def set_for_account(self) -> pulumi.Output[Optional[bool]]:
        """
        Specifies whether the network policy should be applied globally to your Snowflake account\\n\\n\\n\\n**Note:** The Snowflake user running `pulumi up` must be on an IP address allowed by the network policy to set that policy globally on the Snowflake account.\\n\\n\\n\\nAdditionally, a Snowflake account can only have one network policy set globally at any given time. This resource does not enforce one-policy-per-account, it is the user's responsibility to enforce this. If multiple network policy resources have `set_for_account: true`, the final policy set on the account will be non-deterministic.
        """
        return pulumi.get(self, "set_for_account")

    @property
    @pulumi.getter
    def users(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        Specifies which users the network policy should be attached to
        """
        return pulumi.get(self, "users")

