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

__all__ = ['EmailNotificationIntegrationArgs', 'EmailNotificationIntegration']

@pulumi.input_type
class EmailNotificationIntegrationArgs:
    def __init__(__self__, *,
                 enabled: pulumi.Input[builtins.bool],
                 allowed_recipients: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]] = None,
                 comment: Optional[pulumi.Input[builtins.str]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None):
        """
        The set of arguments for constructing a EmailNotificationIntegration resource.
        :param pulumi.Input[Sequence[pulumi.Input[builtins.str]]] allowed_recipients: List of email addresses that should receive notifications.
        :param pulumi.Input[builtins.str] comment: A comment for the email integration.
        """
        pulumi.set(__self__, "enabled", enabled)
        if allowed_recipients is not None:
            pulumi.set(__self__, "allowed_recipients", allowed_recipients)
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Input[builtins.bool]:
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: pulumi.Input[builtins.bool]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter(name="allowedRecipients")
    def allowed_recipients(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]]:
        """
        List of email addresses that should receive notifications.
        """
        return pulumi.get(self, "allowed_recipients")

    @allowed_recipients.setter
    def allowed_recipients(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]]):
        pulumi.set(self, "allowed_recipients", value)

    @property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        A comment for the email integration.
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "comment", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[builtins.str]]:
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _EmailNotificationIntegrationState:
    def __init__(__self__, *,
                 allowed_recipients: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]] = None,
                 comment: Optional[pulumi.Input[builtins.str]] = None,
                 enabled: Optional[pulumi.Input[builtins.bool]] = None,
                 fully_qualified_name: Optional[pulumi.Input[builtins.str]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None):
        """
        Input properties used for looking up and filtering EmailNotificationIntegration resources.
        :param pulumi.Input[Sequence[pulumi.Input[builtins.str]]] allowed_recipients: List of email addresses that should receive notifications.
        :param pulumi.Input[builtins.str] comment: A comment for the email integration.
        :param pulumi.Input[builtins.str] fully_qualified_name: Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        """
        if allowed_recipients is not None:
            pulumi.set(__self__, "allowed_recipients", allowed_recipients)
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if fully_qualified_name is not None:
            pulumi.set(__self__, "fully_qualified_name", fully_qualified_name)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="allowedRecipients")
    def allowed_recipients(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]]:
        """
        List of email addresses that should receive notifications.
        """
        return pulumi.get(self, "allowed_recipients")

    @allowed_recipients.setter
    def allowed_recipients(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]]):
        pulumi.set(self, "allowed_recipients", value)

    @property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        A comment for the email integration.
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "comment", value)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[builtins.bool]]:
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[builtins.bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter(name="fullyQualifiedName")
    def fully_qualified_name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        """
        return pulumi.get(self, "fully_qualified_name")

    @fully_qualified_name.setter
    def fully_qualified_name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "fully_qualified_name", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[builtins.str]]:
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "name", value)


class EmailNotificationIntegration(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 allowed_recipients: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]] = None,
                 comment: Optional[pulumi.Input[builtins.str]] = None,
                 enabled: Optional[pulumi.Input[builtins.bool]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        """
        ## Import

        ```sh
        $ pulumi import snowflake:index/emailNotificationIntegration:EmailNotificationIntegration example name
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[builtins.str]]] allowed_recipients: List of email addresses that should receive notifications.
        :param pulumi.Input[builtins.str] comment: A comment for the email integration.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: EmailNotificationIntegrationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Import

        ```sh
        $ pulumi import snowflake:index/emailNotificationIntegration:EmailNotificationIntegration example name
        ```

        :param str resource_name: The name of the resource.
        :param EmailNotificationIntegrationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(EmailNotificationIntegrationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 allowed_recipients: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]] = None,
                 comment: Optional[pulumi.Input[builtins.str]] = None,
                 enabled: Optional[pulumi.Input[builtins.bool]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = EmailNotificationIntegrationArgs.__new__(EmailNotificationIntegrationArgs)

            __props__.__dict__["allowed_recipients"] = allowed_recipients
            __props__.__dict__["comment"] = comment
            if enabled is None and not opts.urn:
                raise TypeError("Missing required property 'enabled'")
            __props__.__dict__["enabled"] = enabled
            __props__.__dict__["name"] = name
            __props__.__dict__["fully_qualified_name"] = None
        super(EmailNotificationIntegration, __self__).__init__(
            'snowflake:index/emailNotificationIntegration:EmailNotificationIntegration',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            allowed_recipients: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]] = None,
            comment: Optional[pulumi.Input[builtins.str]] = None,
            enabled: Optional[pulumi.Input[builtins.bool]] = None,
            fully_qualified_name: Optional[pulumi.Input[builtins.str]] = None,
            name: Optional[pulumi.Input[builtins.str]] = None) -> 'EmailNotificationIntegration':
        """
        Get an existing EmailNotificationIntegration resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[builtins.str]]] allowed_recipients: List of email addresses that should receive notifications.
        :param pulumi.Input[builtins.str] comment: A comment for the email integration.
        :param pulumi.Input[builtins.str] fully_qualified_name: Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _EmailNotificationIntegrationState.__new__(_EmailNotificationIntegrationState)

        __props__.__dict__["allowed_recipients"] = allowed_recipients
        __props__.__dict__["comment"] = comment
        __props__.__dict__["enabled"] = enabled
        __props__.__dict__["fully_qualified_name"] = fully_qualified_name
        __props__.__dict__["name"] = name
        return EmailNotificationIntegration(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="allowedRecipients")
    def allowed_recipients(self) -> pulumi.Output[Optional[Sequence[builtins.str]]]:
        """
        List of email addresses that should receive notifications.
        """
        return pulumi.get(self, "allowed_recipients")

    @property
    @pulumi.getter
    def comment(self) -> pulumi.Output[Optional[builtins.str]]:
        """
        A comment for the email integration.
        """
        return pulumi.get(self, "comment")

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Output[builtins.bool]:
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter(name="fullyQualifiedName")
    def fully_qualified_name(self) -> pulumi.Output[builtins.str]:
        """
        Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        """
        return pulumi.get(self, "fully_qualified_name")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[builtins.str]:
        return pulumi.get(self, "name")

