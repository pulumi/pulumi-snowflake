# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

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
from . import outputs
from ._inputs import *

__all__ = ['ApiAuthenticationIntegrationWithClientCredentialsArgs', 'ApiAuthenticationIntegrationWithClientCredentials']

@pulumi.input_type
class ApiAuthenticationIntegrationWithClientCredentialsArgs:
    def __init__(__self__, *,
                 enabled: pulumi.Input[bool],
                 oauth_client_id: pulumi.Input[str],
                 oauth_client_secret: pulumi.Input[str],
                 comment: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 oauth_access_token_validity: Optional[pulumi.Input[int]] = None,
                 oauth_allowed_scopes: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 oauth_client_auth_method: Optional[pulumi.Input[str]] = None,
                 oauth_refresh_token_validity: Optional[pulumi.Input[int]] = None,
                 oauth_token_endpoint: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a ApiAuthenticationIntegrationWithClientCredentials resource.
        :param pulumi.Input[bool] enabled: Specifies whether this security integration is enabled or disabled.
        :param pulumi.Input[str] oauth_client_id: Specifies the client ID for the OAuth application in the external service.
        :param pulumi.Input[str] oauth_client_secret: Specifies the client secret for the OAuth application in the ServiceNow instance from the previous step. The connector uses this to request an access token from the ServiceNow instance.
        :param pulumi.Input[str] comment: Specifies a comment for the integration.
        :param pulumi.Input[str] name: Specifies the identifier (i.e. name) for the integration. This value must be unique in your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
        :param pulumi.Input[int] oauth_access_token_validity: Specifies the default lifetime of the OAuth access token (in seconds) issued by an OAuth server.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] oauth_allowed_scopes: Specifies a list of scopes to use when making a request from the OAuth by a role with USAGE on the integration during the OAuth client credentials flow.
        :param pulumi.Input[str] oauth_client_auth_method: Specifies that POST is used as the authentication method to the external service. If removed from the config, the resource is recreated. Valid values are (case-insensitive): `CLIENT_SECRET_POST`.
        :param pulumi.Input[int] oauth_refresh_token_validity: Specifies the value to determine the validity of the refresh token obtained from the OAuth server.
        :param pulumi.Input[str] oauth_token_endpoint: Specifies the token endpoint used by the client to obtain an access token by presenting its authorization grant or refresh token. The token endpoint is used with every authorization grant except for the implicit grant type (since an access token is issued directly). If removed from the config, the resource is recreated.
        """
        pulumi.set(__self__, "enabled", enabled)
        pulumi.set(__self__, "oauth_client_id", oauth_client_id)
        pulumi.set(__self__, "oauth_client_secret", oauth_client_secret)
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if oauth_access_token_validity is not None:
            pulumi.set(__self__, "oauth_access_token_validity", oauth_access_token_validity)
        if oauth_allowed_scopes is not None:
            pulumi.set(__self__, "oauth_allowed_scopes", oauth_allowed_scopes)
        if oauth_client_auth_method is not None:
            pulumi.set(__self__, "oauth_client_auth_method", oauth_client_auth_method)
        if oauth_refresh_token_validity is not None:
            pulumi.set(__self__, "oauth_refresh_token_validity", oauth_refresh_token_validity)
        if oauth_token_endpoint is not None:
            pulumi.set(__self__, "oauth_token_endpoint", oauth_token_endpoint)

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Input[bool]:
        """
        Specifies whether this security integration is enabled or disabled.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: pulumi.Input[bool]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter(name="oauthClientId")
    def oauth_client_id(self) -> pulumi.Input[str]:
        """
        Specifies the client ID for the OAuth application in the external service.
        """
        return pulumi.get(self, "oauth_client_id")

    @oauth_client_id.setter
    def oauth_client_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "oauth_client_id", value)

    @property
    @pulumi.getter(name="oauthClientSecret")
    def oauth_client_secret(self) -> pulumi.Input[str]:
        """
        Specifies the client secret for the OAuth application in the ServiceNow instance from the previous step. The connector uses this to request an access token from the ServiceNow instance.
        """
        return pulumi.get(self, "oauth_client_secret")

    @oauth_client_secret.setter
    def oauth_client_secret(self, value: pulumi.Input[str]):
        pulumi.set(self, "oauth_client_secret", value)

    @property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies a comment for the integration.
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "comment", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the identifier (i.e. name) for the integration. This value must be unique in your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="oauthAccessTokenValidity")
    def oauth_access_token_validity(self) -> Optional[pulumi.Input[int]]:
        """
        Specifies the default lifetime of the OAuth access token (in seconds) issued by an OAuth server.
        """
        return pulumi.get(self, "oauth_access_token_validity")

    @oauth_access_token_validity.setter
    def oauth_access_token_validity(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "oauth_access_token_validity", value)

    @property
    @pulumi.getter(name="oauthAllowedScopes")
    def oauth_allowed_scopes(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Specifies a list of scopes to use when making a request from the OAuth by a role with USAGE on the integration during the OAuth client credentials flow.
        """
        return pulumi.get(self, "oauth_allowed_scopes")

    @oauth_allowed_scopes.setter
    def oauth_allowed_scopes(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "oauth_allowed_scopes", value)

    @property
    @pulumi.getter(name="oauthClientAuthMethod")
    def oauth_client_auth_method(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies that POST is used as the authentication method to the external service. If removed from the config, the resource is recreated. Valid values are (case-insensitive): `CLIENT_SECRET_POST`.
        """
        return pulumi.get(self, "oauth_client_auth_method")

    @oauth_client_auth_method.setter
    def oauth_client_auth_method(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "oauth_client_auth_method", value)

    @property
    @pulumi.getter(name="oauthRefreshTokenValidity")
    def oauth_refresh_token_validity(self) -> Optional[pulumi.Input[int]]:
        """
        Specifies the value to determine the validity of the refresh token obtained from the OAuth server.
        """
        return pulumi.get(self, "oauth_refresh_token_validity")

    @oauth_refresh_token_validity.setter
    def oauth_refresh_token_validity(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "oauth_refresh_token_validity", value)

    @property
    @pulumi.getter(name="oauthTokenEndpoint")
    def oauth_token_endpoint(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the token endpoint used by the client to obtain an access token by presenting its authorization grant or refresh token. The token endpoint is used with every authorization grant except for the implicit grant type (since an access token is issued directly). If removed from the config, the resource is recreated.
        """
        return pulumi.get(self, "oauth_token_endpoint")

    @oauth_token_endpoint.setter
    def oauth_token_endpoint(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "oauth_token_endpoint", value)


@pulumi.input_type
class _ApiAuthenticationIntegrationWithClientCredentialsState:
    def __init__(__self__, *,
                 comment: Optional[pulumi.Input[str]] = None,
                 describe_outputs: Optional[pulumi.Input[Sequence[pulumi.Input['ApiAuthenticationIntegrationWithClientCredentialsDescribeOutputArgs']]]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 fully_qualified_name: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 oauth_access_token_validity: Optional[pulumi.Input[int]] = None,
                 oauth_allowed_scopes: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 oauth_client_auth_method: Optional[pulumi.Input[str]] = None,
                 oauth_client_id: Optional[pulumi.Input[str]] = None,
                 oauth_client_secret: Optional[pulumi.Input[str]] = None,
                 oauth_refresh_token_validity: Optional[pulumi.Input[int]] = None,
                 oauth_token_endpoint: Optional[pulumi.Input[str]] = None,
                 show_outputs: Optional[pulumi.Input[Sequence[pulumi.Input['ApiAuthenticationIntegrationWithClientCredentialsShowOutputArgs']]]] = None):
        """
        Input properties used for looking up and filtering ApiAuthenticationIntegrationWithClientCredentials resources.
        :param pulumi.Input[str] comment: Specifies a comment for the integration.
        :param pulumi.Input[Sequence[pulumi.Input['ApiAuthenticationIntegrationWithClientCredentialsDescribeOutputArgs']]] describe_outputs: Outputs the result of `DESCRIBE SECURITY INTEGRATIONS` for the given security integration.
        :param pulumi.Input[bool] enabled: Specifies whether this security integration is enabled or disabled.
        :param pulumi.Input[str] fully_qualified_name: Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        :param pulumi.Input[str] name: Specifies the identifier (i.e. name) for the integration. This value must be unique in your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
        :param pulumi.Input[int] oauth_access_token_validity: Specifies the default lifetime of the OAuth access token (in seconds) issued by an OAuth server.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] oauth_allowed_scopes: Specifies a list of scopes to use when making a request from the OAuth by a role with USAGE on the integration during the OAuth client credentials flow.
        :param pulumi.Input[str] oauth_client_auth_method: Specifies that POST is used as the authentication method to the external service. If removed from the config, the resource is recreated. Valid values are (case-insensitive): `CLIENT_SECRET_POST`.
        :param pulumi.Input[str] oauth_client_id: Specifies the client ID for the OAuth application in the external service.
        :param pulumi.Input[str] oauth_client_secret: Specifies the client secret for the OAuth application in the ServiceNow instance from the previous step. The connector uses this to request an access token from the ServiceNow instance.
        :param pulumi.Input[int] oauth_refresh_token_validity: Specifies the value to determine the validity of the refresh token obtained from the OAuth server.
        :param pulumi.Input[str] oauth_token_endpoint: Specifies the token endpoint used by the client to obtain an access token by presenting its authorization grant or refresh token. The token endpoint is used with every authorization grant except for the implicit grant type (since an access token is issued directly). If removed from the config, the resource is recreated.
        :param pulumi.Input[Sequence[pulumi.Input['ApiAuthenticationIntegrationWithClientCredentialsShowOutputArgs']]] show_outputs: Outputs the result of `SHOW SECURITY INTEGRATIONS` for the given security integration.
        """
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if describe_outputs is not None:
            pulumi.set(__self__, "describe_outputs", describe_outputs)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if fully_qualified_name is not None:
            pulumi.set(__self__, "fully_qualified_name", fully_qualified_name)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if oauth_access_token_validity is not None:
            pulumi.set(__self__, "oauth_access_token_validity", oauth_access_token_validity)
        if oauth_allowed_scopes is not None:
            pulumi.set(__self__, "oauth_allowed_scopes", oauth_allowed_scopes)
        if oauth_client_auth_method is not None:
            pulumi.set(__self__, "oauth_client_auth_method", oauth_client_auth_method)
        if oauth_client_id is not None:
            pulumi.set(__self__, "oauth_client_id", oauth_client_id)
        if oauth_client_secret is not None:
            pulumi.set(__self__, "oauth_client_secret", oauth_client_secret)
        if oauth_refresh_token_validity is not None:
            pulumi.set(__self__, "oauth_refresh_token_validity", oauth_refresh_token_validity)
        if oauth_token_endpoint is not None:
            pulumi.set(__self__, "oauth_token_endpoint", oauth_token_endpoint)
        if show_outputs is not None:
            pulumi.set(__self__, "show_outputs", show_outputs)

    @property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies a comment for the integration.
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "comment", value)

    @property
    @pulumi.getter(name="describeOutputs")
    def describe_outputs(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ApiAuthenticationIntegrationWithClientCredentialsDescribeOutputArgs']]]]:
        """
        Outputs the result of `DESCRIBE SECURITY INTEGRATIONS` for the given security integration.
        """
        return pulumi.get(self, "describe_outputs")

    @describe_outputs.setter
    def describe_outputs(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ApiAuthenticationIntegrationWithClientCredentialsDescribeOutputArgs']]]]):
        pulumi.set(self, "describe_outputs", value)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether this security integration is enabled or disabled.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter(name="fullyQualifiedName")
    def fully_qualified_name(self) -> Optional[pulumi.Input[str]]:
        """
        Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        """
        return pulumi.get(self, "fully_qualified_name")

    @fully_qualified_name.setter
    def fully_qualified_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "fully_qualified_name", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the identifier (i.e. name) for the integration. This value must be unique in your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="oauthAccessTokenValidity")
    def oauth_access_token_validity(self) -> Optional[pulumi.Input[int]]:
        """
        Specifies the default lifetime of the OAuth access token (in seconds) issued by an OAuth server.
        """
        return pulumi.get(self, "oauth_access_token_validity")

    @oauth_access_token_validity.setter
    def oauth_access_token_validity(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "oauth_access_token_validity", value)

    @property
    @pulumi.getter(name="oauthAllowedScopes")
    def oauth_allowed_scopes(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Specifies a list of scopes to use when making a request from the OAuth by a role with USAGE on the integration during the OAuth client credentials flow.
        """
        return pulumi.get(self, "oauth_allowed_scopes")

    @oauth_allowed_scopes.setter
    def oauth_allowed_scopes(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "oauth_allowed_scopes", value)

    @property
    @pulumi.getter(name="oauthClientAuthMethod")
    def oauth_client_auth_method(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies that POST is used as the authentication method to the external service. If removed from the config, the resource is recreated. Valid values are (case-insensitive): `CLIENT_SECRET_POST`.
        """
        return pulumi.get(self, "oauth_client_auth_method")

    @oauth_client_auth_method.setter
    def oauth_client_auth_method(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "oauth_client_auth_method", value)

    @property
    @pulumi.getter(name="oauthClientId")
    def oauth_client_id(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the client ID for the OAuth application in the external service.
        """
        return pulumi.get(self, "oauth_client_id")

    @oauth_client_id.setter
    def oauth_client_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "oauth_client_id", value)

    @property
    @pulumi.getter(name="oauthClientSecret")
    def oauth_client_secret(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the client secret for the OAuth application in the ServiceNow instance from the previous step. The connector uses this to request an access token from the ServiceNow instance.
        """
        return pulumi.get(self, "oauth_client_secret")

    @oauth_client_secret.setter
    def oauth_client_secret(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "oauth_client_secret", value)

    @property
    @pulumi.getter(name="oauthRefreshTokenValidity")
    def oauth_refresh_token_validity(self) -> Optional[pulumi.Input[int]]:
        """
        Specifies the value to determine the validity of the refresh token obtained from the OAuth server.
        """
        return pulumi.get(self, "oauth_refresh_token_validity")

    @oauth_refresh_token_validity.setter
    def oauth_refresh_token_validity(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "oauth_refresh_token_validity", value)

    @property
    @pulumi.getter(name="oauthTokenEndpoint")
    def oauth_token_endpoint(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the token endpoint used by the client to obtain an access token by presenting its authorization grant or refresh token. The token endpoint is used with every authorization grant except for the implicit grant type (since an access token is issued directly). If removed from the config, the resource is recreated.
        """
        return pulumi.get(self, "oauth_token_endpoint")

    @oauth_token_endpoint.setter
    def oauth_token_endpoint(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "oauth_token_endpoint", value)

    @property
    @pulumi.getter(name="showOutputs")
    def show_outputs(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ApiAuthenticationIntegrationWithClientCredentialsShowOutputArgs']]]]:
        """
        Outputs the result of `SHOW SECURITY INTEGRATIONS` for the given security integration.
        """
        return pulumi.get(self, "show_outputs")

    @show_outputs.setter
    def show_outputs(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ApiAuthenticationIntegrationWithClientCredentialsShowOutputArgs']]]]):
        pulumi.set(self, "show_outputs", value)


class ApiAuthenticationIntegrationWithClientCredentials(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 oauth_access_token_validity: Optional[pulumi.Input[int]] = None,
                 oauth_allowed_scopes: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 oauth_client_auth_method: Optional[pulumi.Input[str]] = None,
                 oauth_client_id: Optional[pulumi.Input[str]] = None,
                 oauth_client_secret: Optional[pulumi.Input[str]] = None,
                 oauth_refresh_token_validity: Optional[pulumi.Input[int]] = None,
                 oauth_token_endpoint: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ## Import

        ```sh
        $ pulumi import snowflake:index/apiAuthenticationIntegrationWithClientCredentials:ApiAuthenticationIntegrationWithClientCredentials example "name"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] comment: Specifies a comment for the integration.
        :param pulumi.Input[bool] enabled: Specifies whether this security integration is enabled or disabled.
        :param pulumi.Input[str] name: Specifies the identifier (i.e. name) for the integration. This value must be unique in your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
        :param pulumi.Input[int] oauth_access_token_validity: Specifies the default lifetime of the OAuth access token (in seconds) issued by an OAuth server.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] oauth_allowed_scopes: Specifies a list of scopes to use when making a request from the OAuth by a role with USAGE on the integration during the OAuth client credentials flow.
        :param pulumi.Input[str] oauth_client_auth_method: Specifies that POST is used as the authentication method to the external service. If removed from the config, the resource is recreated. Valid values are (case-insensitive): `CLIENT_SECRET_POST`.
        :param pulumi.Input[str] oauth_client_id: Specifies the client ID for the OAuth application in the external service.
        :param pulumi.Input[str] oauth_client_secret: Specifies the client secret for the OAuth application in the ServiceNow instance from the previous step. The connector uses this to request an access token from the ServiceNow instance.
        :param pulumi.Input[int] oauth_refresh_token_validity: Specifies the value to determine the validity of the refresh token obtained from the OAuth server.
        :param pulumi.Input[str] oauth_token_endpoint: Specifies the token endpoint used by the client to obtain an access token by presenting its authorization grant or refresh token. The token endpoint is used with every authorization grant except for the implicit grant type (since an access token is issued directly). If removed from the config, the resource is recreated.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ApiAuthenticationIntegrationWithClientCredentialsArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Import

        ```sh
        $ pulumi import snowflake:index/apiAuthenticationIntegrationWithClientCredentials:ApiAuthenticationIntegrationWithClientCredentials example "name"
        ```

        :param str resource_name: The name of the resource.
        :param ApiAuthenticationIntegrationWithClientCredentialsArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ApiAuthenticationIntegrationWithClientCredentialsArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 oauth_access_token_validity: Optional[pulumi.Input[int]] = None,
                 oauth_allowed_scopes: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 oauth_client_auth_method: Optional[pulumi.Input[str]] = None,
                 oauth_client_id: Optional[pulumi.Input[str]] = None,
                 oauth_client_secret: Optional[pulumi.Input[str]] = None,
                 oauth_refresh_token_validity: Optional[pulumi.Input[int]] = None,
                 oauth_token_endpoint: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ApiAuthenticationIntegrationWithClientCredentialsArgs.__new__(ApiAuthenticationIntegrationWithClientCredentialsArgs)

            __props__.__dict__["comment"] = comment
            if enabled is None and not opts.urn:
                raise TypeError("Missing required property 'enabled'")
            __props__.__dict__["enabled"] = enabled
            __props__.__dict__["name"] = name
            __props__.__dict__["oauth_access_token_validity"] = oauth_access_token_validity
            __props__.__dict__["oauth_allowed_scopes"] = oauth_allowed_scopes
            __props__.__dict__["oauth_client_auth_method"] = oauth_client_auth_method
            if oauth_client_id is None and not opts.urn:
                raise TypeError("Missing required property 'oauth_client_id'")
            __props__.__dict__["oauth_client_id"] = oauth_client_id
            if oauth_client_secret is None and not opts.urn:
                raise TypeError("Missing required property 'oauth_client_secret'")
            __props__.__dict__["oauth_client_secret"] = oauth_client_secret
            __props__.__dict__["oauth_refresh_token_validity"] = oauth_refresh_token_validity
            __props__.__dict__["oauth_token_endpoint"] = oauth_token_endpoint
            __props__.__dict__["describe_outputs"] = None
            __props__.__dict__["fully_qualified_name"] = None
            __props__.__dict__["show_outputs"] = None
        super(ApiAuthenticationIntegrationWithClientCredentials, __self__).__init__(
            'snowflake:index/apiAuthenticationIntegrationWithClientCredentials:ApiAuthenticationIntegrationWithClientCredentials',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            comment: Optional[pulumi.Input[str]] = None,
            describe_outputs: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ApiAuthenticationIntegrationWithClientCredentialsDescribeOutputArgs', 'ApiAuthenticationIntegrationWithClientCredentialsDescribeOutputArgsDict']]]]] = None,
            enabled: Optional[pulumi.Input[bool]] = None,
            fully_qualified_name: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            oauth_access_token_validity: Optional[pulumi.Input[int]] = None,
            oauth_allowed_scopes: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            oauth_client_auth_method: Optional[pulumi.Input[str]] = None,
            oauth_client_id: Optional[pulumi.Input[str]] = None,
            oauth_client_secret: Optional[pulumi.Input[str]] = None,
            oauth_refresh_token_validity: Optional[pulumi.Input[int]] = None,
            oauth_token_endpoint: Optional[pulumi.Input[str]] = None,
            show_outputs: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ApiAuthenticationIntegrationWithClientCredentialsShowOutputArgs', 'ApiAuthenticationIntegrationWithClientCredentialsShowOutputArgsDict']]]]] = None) -> 'ApiAuthenticationIntegrationWithClientCredentials':
        """
        Get an existing ApiAuthenticationIntegrationWithClientCredentials resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] comment: Specifies a comment for the integration.
        :param pulumi.Input[Sequence[pulumi.Input[Union['ApiAuthenticationIntegrationWithClientCredentialsDescribeOutputArgs', 'ApiAuthenticationIntegrationWithClientCredentialsDescribeOutputArgsDict']]]] describe_outputs: Outputs the result of `DESCRIBE SECURITY INTEGRATIONS` for the given security integration.
        :param pulumi.Input[bool] enabled: Specifies whether this security integration is enabled or disabled.
        :param pulumi.Input[str] fully_qualified_name: Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        :param pulumi.Input[str] name: Specifies the identifier (i.e. name) for the integration. This value must be unique in your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
        :param pulumi.Input[int] oauth_access_token_validity: Specifies the default lifetime of the OAuth access token (in seconds) issued by an OAuth server.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] oauth_allowed_scopes: Specifies a list of scopes to use when making a request from the OAuth by a role with USAGE on the integration during the OAuth client credentials flow.
        :param pulumi.Input[str] oauth_client_auth_method: Specifies that POST is used as the authentication method to the external service. If removed from the config, the resource is recreated. Valid values are (case-insensitive): `CLIENT_SECRET_POST`.
        :param pulumi.Input[str] oauth_client_id: Specifies the client ID for the OAuth application in the external service.
        :param pulumi.Input[str] oauth_client_secret: Specifies the client secret for the OAuth application in the ServiceNow instance from the previous step. The connector uses this to request an access token from the ServiceNow instance.
        :param pulumi.Input[int] oauth_refresh_token_validity: Specifies the value to determine the validity of the refresh token obtained from the OAuth server.
        :param pulumi.Input[str] oauth_token_endpoint: Specifies the token endpoint used by the client to obtain an access token by presenting its authorization grant or refresh token. The token endpoint is used with every authorization grant except for the implicit grant type (since an access token is issued directly). If removed from the config, the resource is recreated.
        :param pulumi.Input[Sequence[pulumi.Input[Union['ApiAuthenticationIntegrationWithClientCredentialsShowOutputArgs', 'ApiAuthenticationIntegrationWithClientCredentialsShowOutputArgsDict']]]] show_outputs: Outputs the result of `SHOW SECURITY INTEGRATIONS` for the given security integration.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ApiAuthenticationIntegrationWithClientCredentialsState.__new__(_ApiAuthenticationIntegrationWithClientCredentialsState)

        __props__.__dict__["comment"] = comment
        __props__.__dict__["describe_outputs"] = describe_outputs
        __props__.__dict__["enabled"] = enabled
        __props__.__dict__["fully_qualified_name"] = fully_qualified_name
        __props__.__dict__["name"] = name
        __props__.__dict__["oauth_access_token_validity"] = oauth_access_token_validity
        __props__.__dict__["oauth_allowed_scopes"] = oauth_allowed_scopes
        __props__.__dict__["oauth_client_auth_method"] = oauth_client_auth_method
        __props__.__dict__["oauth_client_id"] = oauth_client_id
        __props__.__dict__["oauth_client_secret"] = oauth_client_secret
        __props__.__dict__["oauth_refresh_token_validity"] = oauth_refresh_token_validity
        __props__.__dict__["oauth_token_endpoint"] = oauth_token_endpoint
        __props__.__dict__["show_outputs"] = show_outputs
        return ApiAuthenticationIntegrationWithClientCredentials(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def comment(self) -> pulumi.Output[Optional[str]]:
        """
        Specifies a comment for the integration.
        """
        return pulumi.get(self, "comment")

    @property
    @pulumi.getter(name="describeOutputs")
    def describe_outputs(self) -> pulumi.Output[Sequence['outputs.ApiAuthenticationIntegrationWithClientCredentialsDescribeOutput']]:
        """
        Outputs the result of `DESCRIBE SECURITY INTEGRATIONS` for the given security integration.
        """
        return pulumi.get(self, "describe_outputs")

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Output[bool]:
        """
        Specifies whether this security integration is enabled or disabled.
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter(name="fullyQualifiedName")
    def fully_qualified_name(self) -> pulumi.Output[str]:
        """
        Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        """
        return pulumi.get(self, "fully_qualified_name")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Specifies the identifier (i.e. name) for the integration. This value must be unique in your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="oauthAccessTokenValidity")
    def oauth_access_token_validity(self) -> pulumi.Output[Optional[int]]:
        """
        Specifies the default lifetime of the OAuth access token (in seconds) issued by an OAuth server.
        """
        return pulumi.get(self, "oauth_access_token_validity")

    @property
    @pulumi.getter(name="oauthAllowedScopes")
    def oauth_allowed_scopes(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        Specifies a list of scopes to use when making a request from the OAuth by a role with USAGE on the integration during the OAuth client credentials flow.
        """
        return pulumi.get(self, "oauth_allowed_scopes")

    @property
    @pulumi.getter(name="oauthClientAuthMethod")
    def oauth_client_auth_method(self) -> pulumi.Output[Optional[str]]:
        """
        Specifies that POST is used as the authentication method to the external service. If removed from the config, the resource is recreated. Valid values are (case-insensitive): `CLIENT_SECRET_POST`.
        """
        return pulumi.get(self, "oauth_client_auth_method")

    @property
    @pulumi.getter(name="oauthClientId")
    def oauth_client_id(self) -> pulumi.Output[str]:
        """
        Specifies the client ID for the OAuth application in the external service.
        """
        return pulumi.get(self, "oauth_client_id")

    @property
    @pulumi.getter(name="oauthClientSecret")
    def oauth_client_secret(self) -> pulumi.Output[str]:
        """
        Specifies the client secret for the OAuth application in the ServiceNow instance from the previous step. The connector uses this to request an access token from the ServiceNow instance.
        """
        return pulumi.get(self, "oauth_client_secret")

    @property
    @pulumi.getter(name="oauthRefreshTokenValidity")
    def oauth_refresh_token_validity(self) -> pulumi.Output[Optional[int]]:
        """
        Specifies the value to determine the validity of the refresh token obtained from the OAuth server.
        """
        return pulumi.get(self, "oauth_refresh_token_validity")

    @property
    @pulumi.getter(name="oauthTokenEndpoint")
    def oauth_token_endpoint(self) -> pulumi.Output[Optional[str]]:
        """
        Specifies the token endpoint used by the client to obtain an access token by presenting its authorization grant or refresh token. The token endpoint is used with every authorization grant except for the implicit grant type (since an access token is issued directly). If removed from the config, the resource is recreated.
        """
        return pulumi.get(self, "oauth_token_endpoint")

    @property
    @pulumi.getter(name="showOutputs")
    def show_outputs(self) -> pulumi.Output[Sequence['outputs.ApiAuthenticationIntegrationWithClientCredentialsShowOutput']]:
        """
        Outputs the result of `SHOW SECURITY INTEGRATIONS` for the given security integration.
        """
        return pulumi.get(self, "show_outputs")

