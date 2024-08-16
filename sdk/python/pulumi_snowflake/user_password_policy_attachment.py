# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['UserPasswordPolicyAttachmentArgs', 'UserPasswordPolicyAttachment']

@pulumi.input_type
class UserPasswordPolicyAttachmentArgs:
    def __init__(__self__, *,
                 password_policy_name: pulumi.Input[str],
                 user_name: pulumi.Input[str]):
        """
        The set of arguments for constructing a UserPasswordPolicyAttachment resource.
        :param pulumi.Input[str] password_policy_name: Fully qualified name of the password policy
        :param pulumi.Input[str] user_name: User name of the user you want to attach the password policy to
        """
        pulumi.set(__self__, "password_policy_name", password_policy_name)
        pulumi.set(__self__, "user_name", user_name)

    @property
    @pulumi.getter(name="passwordPolicyName")
    def password_policy_name(self) -> pulumi.Input[str]:
        """
        Fully qualified name of the password policy
        """
        return pulumi.get(self, "password_policy_name")

    @password_policy_name.setter
    def password_policy_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "password_policy_name", value)

    @property
    @pulumi.getter(name="userName")
    def user_name(self) -> pulumi.Input[str]:
        """
        User name of the user you want to attach the password policy to
        """
        return pulumi.get(self, "user_name")

    @user_name.setter
    def user_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "user_name", value)


@pulumi.input_type
class _UserPasswordPolicyAttachmentState:
    def __init__(__self__, *,
                 password_policy_name: Optional[pulumi.Input[str]] = None,
                 user_name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering UserPasswordPolicyAttachment resources.
        :param pulumi.Input[str] password_policy_name: Fully qualified name of the password policy
        :param pulumi.Input[str] user_name: User name of the user you want to attach the password policy to
        """
        if password_policy_name is not None:
            pulumi.set(__self__, "password_policy_name", password_policy_name)
        if user_name is not None:
            pulumi.set(__self__, "user_name", user_name)

    @property
    @pulumi.getter(name="passwordPolicyName")
    def password_policy_name(self) -> Optional[pulumi.Input[str]]:
        """
        Fully qualified name of the password policy
        """
        return pulumi.get(self, "password_policy_name")

    @password_policy_name.setter
    def password_policy_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "password_policy_name", value)

    @property
    @pulumi.getter(name="userName")
    def user_name(self) -> Optional[pulumi.Input[str]]:
        """
        User name of the user you want to attach the password policy to
        """
        return pulumi.get(self, "user_name")

    @user_name.setter
    def user_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "user_name", value)


class UserPasswordPolicyAttachment(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 password_policy_name: Optional[pulumi.Input[str]] = None,
                 user_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Specifies the password policy to use for a certain user.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_snowflake as snowflake

        user = snowflake.User("user", name="USER_NAME")
        pp = snowflake.PasswordPolicy("pp",
            database="prod",
            schema="security",
            name="default_policy")
        ppa = snowflake.UserPasswordPolicyAttachment("ppa",
            password_policy_name=pulumi.Output.all(
                database=pp.database,
                schema=pp.schema,
                name=pp.name
        ).apply(lambda resolved_outputs: f"\\"{resolved_outputs['database']}\\".\\"{resolved_outputs['schema']}\\".\\"{resolved_outputs['name']}\\"")
        ,
            user_name=user.name)
        ```

        ## Import

        ```sh
        $ pulumi import snowflake:index/userPasswordPolicyAttachment:UserPasswordPolicyAttachment example "MY_DATABASE|MY_SCHEMA|PASSWORD_POLICY_NAME|USER_NAME"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] password_policy_name: Fully qualified name of the password policy
        :param pulumi.Input[str] user_name: User name of the user you want to attach the password policy to
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: UserPasswordPolicyAttachmentArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Specifies the password policy to use for a certain user.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_snowflake as snowflake

        user = snowflake.User("user", name="USER_NAME")
        pp = snowflake.PasswordPolicy("pp",
            database="prod",
            schema="security",
            name="default_policy")
        ppa = snowflake.UserPasswordPolicyAttachment("ppa",
            password_policy_name=pulumi.Output.all(
                database=pp.database,
                schema=pp.schema,
                name=pp.name
        ).apply(lambda resolved_outputs: f"\\"{resolved_outputs['database']}\\".\\"{resolved_outputs['schema']}\\".\\"{resolved_outputs['name']}\\"")
        ,
            user_name=user.name)
        ```

        ## Import

        ```sh
        $ pulumi import snowflake:index/userPasswordPolicyAttachment:UserPasswordPolicyAttachment example "MY_DATABASE|MY_SCHEMA|PASSWORD_POLICY_NAME|USER_NAME"
        ```

        :param str resource_name: The name of the resource.
        :param UserPasswordPolicyAttachmentArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(UserPasswordPolicyAttachmentArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 password_policy_name: Optional[pulumi.Input[str]] = None,
                 user_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = UserPasswordPolicyAttachmentArgs.__new__(UserPasswordPolicyAttachmentArgs)

            if password_policy_name is None and not opts.urn:
                raise TypeError("Missing required property 'password_policy_name'")
            __props__.__dict__["password_policy_name"] = password_policy_name
            if user_name is None and not opts.urn:
                raise TypeError("Missing required property 'user_name'")
            __props__.__dict__["user_name"] = user_name
        super(UserPasswordPolicyAttachment, __self__).__init__(
            'snowflake:index/userPasswordPolicyAttachment:UserPasswordPolicyAttachment',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            password_policy_name: Optional[pulumi.Input[str]] = None,
            user_name: Optional[pulumi.Input[str]] = None) -> 'UserPasswordPolicyAttachment':
        """
        Get an existing UserPasswordPolicyAttachment resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] password_policy_name: Fully qualified name of the password policy
        :param pulumi.Input[str] user_name: User name of the user you want to attach the password policy to
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _UserPasswordPolicyAttachmentState.__new__(_UserPasswordPolicyAttachmentState)

        __props__.__dict__["password_policy_name"] = password_policy_name
        __props__.__dict__["user_name"] = user_name
        return UserPasswordPolicyAttachment(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="passwordPolicyName")
    def password_policy_name(self) -> pulumi.Output[str]:
        """
        Fully qualified name of the password policy
        """
        return pulumi.get(self, "password_policy_name")

    @property
    @pulumi.getter(name="userName")
    def user_name(self) -> pulumi.Output[str]:
        """
        User name of the user you want to attach the password policy to
        """
        return pulumi.get(self, "user_name")

