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

__all__ = ['OauthIntegrationForPartnerApplicationsArgs', 'OauthIntegrationForPartnerApplications']

@pulumi.input_type
class OauthIntegrationForPartnerApplicationsArgs:
    def __init__(__self__, *,
                 blocked_roles_lists: pulumi.Input[Sequence[pulumi.Input[str]]],
                 oauth_client: pulumi.Input[str],
                 comment: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 oauth_issue_refresh_tokens: Optional[pulumi.Input[str]] = None,
                 oauth_redirect_uri: Optional[pulumi.Input[str]] = None,
                 oauth_refresh_token_validity: Optional[pulumi.Input[int]] = None,
                 oauth_use_secondary_roles: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a OauthIntegrationForPartnerApplications resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] blocked_roles_lists: A set of Snowflake roles that a user cannot explicitly consent to using after authenticating.
        :param pulumi.Input[str] oauth_client: Creates an OAuth interface between Snowflake and a partner application. Valid options are: [LOOKER TABLEAU*DESKTOP TABLEAU*SERVER]
        :param pulumi.Input[str] comment: Specifies a comment for the OAuth integration.
        :param pulumi.Input[str] enabled: Specifies whether this OAuth integration is enabled or disabled. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
        :param pulumi.Input[str] name: Specifies the name of the OAuth integration. This name follows the rules for Object Identifiers. The name should be unique among security integrations in your account.
        :param pulumi.Input[str] oauth_issue_refresh_tokens: Specifies whether to allow the client to exchange a refresh token for an access token when the current access token has expired. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
        :param pulumi.Input[int] oauth_refresh_token_validity: Specifies how long refresh tokens should be valid (in seconds). OAUTH*ISSUE*REFRESH_TOKENS must be set to TRUE.
        :param pulumi.Input[str] oauth_use_secondary_roles: Specifies whether default secondary roles set in the user properties are activated by default in the session being opened. Valid options are: [IMPLICIT NONE]
        """
        pulumi.set(__self__, "blocked_roles_lists", blocked_roles_lists)
        pulumi.set(__self__, "oauth_client", oauth_client)
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if oauth_issue_refresh_tokens is not None:
            pulumi.set(__self__, "oauth_issue_refresh_tokens", oauth_issue_refresh_tokens)
        if oauth_redirect_uri is not None:
            pulumi.set(__self__, "oauth_redirect_uri", oauth_redirect_uri)
        if oauth_refresh_token_validity is not None:
            pulumi.set(__self__, "oauth_refresh_token_validity", oauth_refresh_token_validity)
        if oauth_use_secondary_roles is not None:
            pulumi.set(__self__, "oauth_use_secondary_roles", oauth_use_secondary_roles)

    @property
    @pulumi.getter(name="blockedRolesLists")
    def blocked_roles_lists(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        A set of Snowflake roles that a user cannot explicitly consent to using after authenticating.
        """
        return pulumi.get(self, "blocked_roles_lists")

    @blocked_roles_lists.setter
    def blocked_roles_lists(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "blocked_roles_lists", value)

    @property
    @pulumi.getter(name="oauthClient")
    def oauth_client(self) -> pulumi.Input[str]:
        """
        Creates an OAuth interface between Snowflake and a partner application. Valid options are: [LOOKER TABLEAU*DESKTOP TABLEAU*SERVER]
        """
        return pulumi.get(self, "oauth_client")

    @oauth_client.setter
    def oauth_client(self, value: pulumi.Input[str]):
        pulumi.set(self, "oauth_client", value)

    @property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies a comment for the OAuth integration.
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "comment", value)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies whether this OAuth integration is enabled or disabled. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the name of the OAuth integration. This name follows the rules for Object Identifiers. The name should be unique among security integrations in your account.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="oauthIssueRefreshTokens")
    def oauth_issue_refresh_tokens(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies whether to allow the client to exchange a refresh token for an access token when the current access token has expired. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
        """
        return pulumi.get(self, "oauth_issue_refresh_tokens")

    @oauth_issue_refresh_tokens.setter
    def oauth_issue_refresh_tokens(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "oauth_issue_refresh_tokens", value)

    @property
    @pulumi.getter(name="oauthRedirectUri")
    def oauth_redirect_uri(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "oauth_redirect_uri")

    @oauth_redirect_uri.setter
    def oauth_redirect_uri(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "oauth_redirect_uri", value)

    @property
    @pulumi.getter(name="oauthRefreshTokenValidity")
    def oauth_refresh_token_validity(self) -> Optional[pulumi.Input[int]]:
        """
        Specifies how long refresh tokens should be valid (in seconds). OAUTH*ISSUE*REFRESH_TOKENS must be set to TRUE.
        """
        return pulumi.get(self, "oauth_refresh_token_validity")

    @oauth_refresh_token_validity.setter
    def oauth_refresh_token_validity(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "oauth_refresh_token_validity", value)

    @property
    @pulumi.getter(name="oauthUseSecondaryRoles")
    def oauth_use_secondary_roles(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies whether default secondary roles set in the user properties are activated by default in the session being opened. Valid options are: [IMPLICIT NONE]
        """
        return pulumi.get(self, "oauth_use_secondary_roles")

    @oauth_use_secondary_roles.setter
    def oauth_use_secondary_roles(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "oauth_use_secondary_roles", value)


@pulumi.input_type
class _OauthIntegrationForPartnerApplicationsState:
    def __init__(__self__, *,
                 blocked_roles_lists: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 describe_outputs: Optional[pulumi.Input[Sequence[pulumi.Input['OauthIntegrationForPartnerApplicationsDescribeOutputArgs']]]] = None,
                 enabled: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 oauth_client: Optional[pulumi.Input[str]] = None,
                 oauth_issue_refresh_tokens: Optional[pulumi.Input[str]] = None,
                 oauth_redirect_uri: Optional[pulumi.Input[str]] = None,
                 oauth_refresh_token_validity: Optional[pulumi.Input[int]] = None,
                 oauth_use_secondary_roles: Optional[pulumi.Input[str]] = None,
                 show_outputs: Optional[pulumi.Input[Sequence[pulumi.Input['OauthIntegrationForPartnerApplicationsShowOutputArgs']]]] = None):
        """
        Input properties used for looking up and filtering OauthIntegrationForPartnerApplications resources.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] blocked_roles_lists: A set of Snowflake roles that a user cannot explicitly consent to using after authenticating.
        :param pulumi.Input[str] comment: Specifies a comment for the OAuth integration.
        :param pulumi.Input[Sequence[pulumi.Input['OauthIntegrationForPartnerApplicationsDescribeOutputArgs']]] describe_outputs: Outputs the result of `DESCRIBE SECURITY INTEGRATION` for the given integration.
        :param pulumi.Input[str] enabled: Specifies whether this OAuth integration is enabled or disabled. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
        :param pulumi.Input[str] name: Specifies the name of the OAuth integration. This name follows the rules for Object Identifiers. The name should be unique among security integrations in your account.
        :param pulumi.Input[str] oauth_client: Creates an OAuth interface between Snowflake and a partner application. Valid options are: [LOOKER TABLEAU*DESKTOP TABLEAU*SERVER]
        :param pulumi.Input[str] oauth_issue_refresh_tokens: Specifies whether to allow the client to exchange a refresh token for an access token when the current access token has expired. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
        :param pulumi.Input[int] oauth_refresh_token_validity: Specifies how long refresh tokens should be valid (in seconds). OAUTH*ISSUE*REFRESH_TOKENS must be set to TRUE.
        :param pulumi.Input[str] oauth_use_secondary_roles: Specifies whether default secondary roles set in the user properties are activated by default in the session being opened. Valid options are: [IMPLICIT NONE]
        :param pulumi.Input[Sequence[pulumi.Input['OauthIntegrationForPartnerApplicationsShowOutputArgs']]] show_outputs: Outputs the result of `SHOW SECURITY INTEGRATION` for the given integration.
        """
        if blocked_roles_lists is not None:
            pulumi.set(__self__, "blocked_roles_lists", blocked_roles_lists)
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if describe_outputs is not None:
            pulumi.set(__self__, "describe_outputs", describe_outputs)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if oauth_client is not None:
            pulumi.set(__self__, "oauth_client", oauth_client)
        if oauth_issue_refresh_tokens is not None:
            pulumi.set(__self__, "oauth_issue_refresh_tokens", oauth_issue_refresh_tokens)
        if oauth_redirect_uri is not None:
            pulumi.set(__self__, "oauth_redirect_uri", oauth_redirect_uri)
        if oauth_refresh_token_validity is not None:
            pulumi.set(__self__, "oauth_refresh_token_validity", oauth_refresh_token_validity)
        if oauth_use_secondary_roles is not None:
            pulumi.set(__self__, "oauth_use_secondary_roles", oauth_use_secondary_roles)
        if show_outputs is not None:
            pulumi.set(__self__, "show_outputs", show_outputs)

    @property
    @pulumi.getter(name="blockedRolesLists")
    def blocked_roles_lists(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        A set of Snowflake roles that a user cannot explicitly consent to using after authenticating.
        """
        return pulumi.get(self, "blocked_roles_lists")

    @blocked_roles_lists.setter
    def blocked_roles_lists(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "blocked_roles_lists", value)

    @property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies a comment for the OAuth integration.
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "comment", value)

    @property
    @pulumi.getter(name="describeOutputs")
    def describe_outputs(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['OauthIntegrationForPartnerApplicationsDescribeOutputArgs']]]]:
        """
        Outputs the result of `DESCRIBE SECURITY INTEGRATION` for the given integration.
        """
        return pulumi.get(self, "describe_outputs")

    @describe_outputs.setter
    def describe_outputs(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['OauthIntegrationForPartnerApplicationsDescribeOutputArgs']]]]):
        pulumi.set(self, "describe_outputs", value)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies whether this OAuth integration is enabled or disabled. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the name of the OAuth integration. This name follows the rules for Object Identifiers. The name should be unique among security integrations in your account.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="oauthClient")
    def oauth_client(self) -> Optional[pulumi.Input[str]]:
        """
        Creates an OAuth interface between Snowflake and a partner application. Valid options are: [LOOKER TABLEAU*DESKTOP TABLEAU*SERVER]
        """
        return pulumi.get(self, "oauth_client")

    @oauth_client.setter
    def oauth_client(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "oauth_client", value)

    @property
    @pulumi.getter(name="oauthIssueRefreshTokens")
    def oauth_issue_refresh_tokens(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies whether to allow the client to exchange a refresh token for an access token when the current access token has expired. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
        """
        return pulumi.get(self, "oauth_issue_refresh_tokens")

    @oauth_issue_refresh_tokens.setter
    def oauth_issue_refresh_tokens(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "oauth_issue_refresh_tokens", value)

    @property
    @pulumi.getter(name="oauthRedirectUri")
    def oauth_redirect_uri(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "oauth_redirect_uri")

    @oauth_redirect_uri.setter
    def oauth_redirect_uri(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "oauth_redirect_uri", value)

    @property
    @pulumi.getter(name="oauthRefreshTokenValidity")
    def oauth_refresh_token_validity(self) -> Optional[pulumi.Input[int]]:
        """
        Specifies how long refresh tokens should be valid (in seconds). OAUTH*ISSUE*REFRESH_TOKENS must be set to TRUE.
        """
        return pulumi.get(self, "oauth_refresh_token_validity")

    @oauth_refresh_token_validity.setter
    def oauth_refresh_token_validity(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "oauth_refresh_token_validity", value)

    @property
    @pulumi.getter(name="oauthUseSecondaryRoles")
    def oauth_use_secondary_roles(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies whether default secondary roles set in the user properties are activated by default in the session being opened. Valid options are: [IMPLICIT NONE]
        """
        return pulumi.get(self, "oauth_use_secondary_roles")

    @oauth_use_secondary_roles.setter
    def oauth_use_secondary_roles(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "oauth_use_secondary_roles", value)

    @property
    @pulumi.getter(name="showOutputs")
    def show_outputs(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['OauthIntegrationForPartnerApplicationsShowOutputArgs']]]]:
        """
        Outputs the result of `SHOW SECURITY INTEGRATION` for the given integration.
        """
        return pulumi.get(self, "show_outputs")

    @show_outputs.setter
    def show_outputs(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['OauthIntegrationForPartnerApplicationsShowOutputArgs']]]]):
        pulumi.set(self, "show_outputs", value)


class OauthIntegrationForPartnerApplications(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 blocked_roles_lists: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 oauth_client: Optional[pulumi.Input[str]] = None,
                 oauth_issue_refresh_tokens: Optional[pulumi.Input[str]] = None,
                 oauth_redirect_uri: Optional[pulumi.Input[str]] = None,
                 oauth_refresh_token_validity: Optional[pulumi.Input[int]] = None,
                 oauth_use_secondary_roles: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        !> **V1 release candidate** This resource was reworked and is a release candidate for the V1. We do not expect significant changes in it before the V1. We will welcome any feedback and adjust the resource if needed. Any errors reported will be resolved with a higher priority. We encourage checking this resource out before the V1 release. Please follow the migration guide to use it.

        ## Import

        ```sh
        $ pulumi import snowflake:index/oauthIntegrationForPartnerApplications:OauthIntegrationForPartnerApplications example "name"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] blocked_roles_lists: A set of Snowflake roles that a user cannot explicitly consent to using after authenticating.
        :param pulumi.Input[str] comment: Specifies a comment for the OAuth integration.
        :param pulumi.Input[str] enabled: Specifies whether this OAuth integration is enabled or disabled. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
        :param pulumi.Input[str] name: Specifies the name of the OAuth integration. This name follows the rules for Object Identifiers. The name should be unique among security integrations in your account.
        :param pulumi.Input[str] oauth_client: Creates an OAuth interface between Snowflake and a partner application. Valid options are: [LOOKER TABLEAU*DESKTOP TABLEAU*SERVER]
        :param pulumi.Input[str] oauth_issue_refresh_tokens: Specifies whether to allow the client to exchange a refresh token for an access token when the current access token has expired. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
        :param pulumi.Input[int] oauth_refresh_token_validity: Specifies how long refresh tokens should be valid (in seconds). OAUTH*ISSUE*REFRESH_TOKENS must be set to TRUE.
        :param pulumi.Input[str] oauth_use_secondary_roles: Specifies whether default secondary roles set in the user properties are activated by default in the session being opened. Valid options are: [IMPLICIT NONE]
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: OauthIntegrationForPartnerApplicationsArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        !> **V1 release candidate** This resource was reworked and is a release candidate for the V1. We do not expect significant changes in it before the V1. We will welcome any feedback and adjust the resource if needed. Any errors reported will be resolved with a higher priority. We encourage checking this resource out before the V1 release. Please follow the migration guide to use it.

        ## Import

        ```sh
        $ pulumi import snowflake:index/oauthIntegrationForPartnerApplications:OauthIntegrationForPartnerApplications example "name"
        ```

        :param str resource_name: The name of the resource.
        :param OauthIntegrationForPartnerApplicationsArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(OauthIntegrationForPartnerApplicationsArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 blocked_roles_lists: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 oauth_client: Optional[pulumi.Input[str]] = None,
                 oauth_issue_refresh_tokens: Optional[pulumi.Input[str]] = None,
                 oauth_redirect_uri: Optional[pulumi.Input[str]] = None,
                 oauth_refresh_token_validity: Optional[pulumi.Input[int]] = None,
                 oauth_use_secondary_roles: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = OauthIntegrationForPartnerApplicationsArgs.__new__(OauthIntegrationForPartnerApplicationsArgs)

            if blocked_roles_lists is None and not opts.urn:
                raise TypeError("Missing required property 'blocked_roles_lists'")
            __props__.__dict__["blocked_roles_lists"] = blocked_roles_lists
            __props__.__dict__["comment"] = comment
            __props__.__dict__["enabled"] = enabled
            __props__.__dict__["name"] = name
            if oauth_client is None and not opts.urn:
                raise TypeError("Missing required property 'oauth_client'")
            __props__.__dict__["oauth_client"] = oauth_client
            __props__.__dict__["oauth_issue_refresh_tokens"] = oauth_issue_refresh_tokens
            __props__.__dict__["oauth_redirect_uri"] = oauth_redirect_uri
            __props__.__dict__["oauth_refresh_token_validity"] = oauth_refresh_token_validity
            __props__.__dict__["oauth_use_secondary_roles"] = oauth_use_secondary_roles
            __props__.__dict__["describe_outputs"] = None
            __props__.__dict__["show_outputs"] = None
        super(OauthIntegrationForPartnerApplications, __self__).__init__(
            'snowflake:index/oauthIntegrationForPartnerApplications:OauthIntegrationForPartnerApplications',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            blocked_roles_lists: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            comment: Optional[pulumi.Input[str]] = None,
            describe_outputs: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OauthIntegrationForPartnerApplicationsDescribeOutputArgs']]]]] = None,
            enabled: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            oauth_client: Optional[pulumi.Input[str]] = None,
            oauth_issue_refresh_tokens: Optional[pulumi.Input[str]] = None,
            oauth_redirect_uri: Optional[pulumi.Input[str]] = None,
            oauth_refresh_token_validity: Optional[pulumi.Input[int]] = None,
            oauth_use_secondary_roles: Optional[pulumi.Input[str]] = None,
            show_outputs: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OauthIntegrationForPartnerApplicationsShowOutputArgs']]]]] = None) -> 'OauthIntegrationForPartnerApplications':
        """
        Get an existing OauthIntegrationForPartnerApplications resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] blocked_roles_lists: A set of Snowflake roles that a user cannot explicitly consent to using after authenticating.
        :param pulumi.Input[str] comment: Specifies a comment for the OAuth integration.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OauthIntegrationForPartnerApplicationsDescribeOutputArgs']]]] describe_outputs: Outputs the result of `DESCRIBE SECURITY INTEGRATION` for the given integration.
        :param pulumi.Input[str] enabled: Specifies whether this OAuth integration is enabled or disabled. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
        :param pulumi.Input[str] name: Specifies the name of the OAuth integration. This name follows the rules for Object Identifiers. The name should be unique among security integrations in your account.
        :param pulumi.Input[str] oauth_client: Creates an OAuth interface between Snowflake and a partner application. Valid options are: [LOOKER TABLEAU*DESKTOP TABLEAU*SERVER]
        :param pulumi.Input[str] oauth_issue_refresh_tokens: Specifies whether to allow the client to exchange a refresh token for an access token when the current access token has expired. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
        :param pulumi.Input[int] oauth_refresh_token_validity: Specifies how long refresh tokens should be valid (in seconds). OAUTH*ISSUE*REFRESH_TOKENS must be set to TRUE.
        :param pulumi.Input[str] oauth_use_secondary_roles: Specifies whether default secondary roles set in the user properties are activated by default in the session being opened. Valid options are: [IMPLICIT NONE]
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['OauthIntegrationForPartnerApplicationsShowOutputArgs']]]] show_outputs: Outputs the result of `SHOW SECURITY INTEGRATION` for the given integration.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _OauthIntegrationForPartnerApplicationsState.__new__(_OauthIntegrationForPartnerApplicationsState)

        __props__.__dict__["blocked_roles_lists"] = blocked_roles_lists
        __props__.__dict__["comment"] = comment
        __props__.__dict__["describe_outputs"] = describe_outputs
        __props__.__dict__["enabled"] = enabled
        __props__.__dict__["name"] = name
        __props__.__dict__["oauth_client"] = oauth_client
        __props__.__dict__["oauth_issue_refresh_tokens"] = oauth_issue_refresh_tokens
        __props__.__dict__["oauth_redirect_uri"] = oauth_redirect_uri
        __props__.__dict__["oauth_refresh_token_validity"] = oauth_refresh_token_validity
        __props__.__dict__["oauth_use_secondary_roles"] = oauth_use_secondary_roles
        __props__.__dict__["show_outputs"] = show_outputs
        return OauthIntegrationForPartnerApplications(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="blockedRolesLists")
    def blocked_roles_lists(self) -> pulumi.Output[Sequence[str]]:
        """
        A set of Snowflake roles that a user cannot explicitly consent to using after authenticating.
        """
        return pulumi.get(self, "blocked_roles_lists")

    @property
    @pulumi.getter
    def comment(self) -> pulumi.Output[Optional[str]]:
        """
        Specifies a comment for the OAuth integration.
        """
        return pulumi.get(self, "comment")

    @property
    @pulumi.getter(name="describeOutputs")
    def describe_outputs(self) -> pulumi.Output[Sequence['outputs.OauthIntegrationForPartnerApplicationsDescribeOutput']]:
        """
        Outputs the result of `DESCRIBE SECURITY INTEGRATION` for the given integration.
        """
        return pulumi.get(self, "describe_outputs")

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Output[Optional[str]]:
        """
        Specifies whether this OAuth integration is enabled or disabled. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Specifies the name of the OAuth integration. This name follows the rules for Object Identifiers. The name should be unique among security integrations in your account.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="oauthClient")
    def oauth_client(self) -> pulumi.Output[str]:
        """
        Creates an OAuth interface between Snowflake and a partner application. Valid options are: [LOOKER TABLEAU*DESKTOP TABLEAU*SERVER]
        """
        return pulumi.get(self, "oauth_client")

    @property
    @pulumi.getter(name="oauthIssueRefreshTokens")
    def oauth_issue_refresh_tokens(self) -> pulumi.Output[Optional[str]]:
        """
        Specifies whether to allow the client to exchange a refresh token for an access token when the current access token has expired. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
        """
        return pulumi.get(self, "oauth_issue_refresh_tokens")

    @property
    @pulumi.getter(name="oauthRedirectUri")
    def oauth_redirect_uri(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "oauth_redirect_uri")

    @property
    @pulumi.getter(name="oauthRefreshTokenValidity")
    def oauth_refresh_token_validity(self) -> pulumi.Output[Optional[int]]:
        """
        Specifies how long refresh tokens should be valid (in seconds). OAUTH*ISSUE*REFRESH_TOKENS must be set to TRUE.
        """
        return pulumi.get(self, "oauth_refresh_token_validity")

    @property
    @pulumi.getter(name="oauthUseSecondaryRoles")
    def oauth_use_secondary_roles(self) -> pulumi.Output[Optional[str]]:
        """
        Specifies whether default secondary roles set in the user properties are activated by default in the session being opened. Valid options are: [IMPLICIT NONE]
        """
        return pulumi.get(self, "oauth_use_secondary_roles")

    @property
    @pulumi.getter(name="showOutputs")
    def show_outputs(self) -> pulumi.Output[Sequence['outputs.OauthIntegrationForPartnerApplicationsShowOutput']]:
        """
        Outputs the result of `SHOW SECURITY INTEGRATION` for the given integration.
        """
        return pulumi.get(self, "show_outputs")
