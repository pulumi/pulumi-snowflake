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
from .. import _utilities

__all__ = [
    'TokenAccessor',
]

@pulumi.output_type
class TokenAccessor(dict):
    def __init__(__self__, *,
                 client_id: _builtins.str,
                 client_secret: _builtins.str,
                 redirect_uri: _builtins.str,
                 refresh_token: _builtins.str,
                 token_endpoint: _builtins.str):
        """
        :param _builtins.str client_id: The client ID for the OAuth provider when using a refresh token to renew access token. Can also be sourced from the `SNOWFLAKE_TOKEN_ACCESSOR_CLIENT_ID` environment variable.
        :param _builtins.str client_secret: The client secret for the OAuth provider when using a refresh token to renew access token. Can also be sourced from the `SNOWFLAKE_TOKEN_ACCESSOR_CLIENT_SECRET` environment variable.
        :param _builtins.str redirect_uri: The redirect URI for the OAuth provider when using a refresh token to renew access token. Can also be sourced from the `SNOWFLAKE_TOKEN_ACCESSOR_REDIRECT_URI` environment variable.
        :param _builtins.str refresh_token: The refresh token for the OAuth provider when using a refresh token to renew access token. Can also be sourced from the `SNOWFLAKE_TOKEN_ACCESSOR_REFRESH_TOKEN` environment variable.
        :param _builtins.str token_endpoint: The token endpoint for the OAuth provider e.g. https://{yourDomain}/oauth/token when using a refresh token to renew access token. Can also be sourced from the `SNOWFLAKE_TOKEN_ACCESSOR_TOKEN_ENDPOINT` environment variable.
        """
        pulumi.set(__self__, "client_id", client_id)
        pulumi.set(__self__, "client_secret", client_secret)
        pulumi.set(__self__, "redirect_uri", redirect_uri)
        pulumi.set(__self__, "refresh_token", refresh_token)
        pulumi.set(__self__, "token_endpoint", token_endpoint)

    @_builtins.property
    @pulumi.getter(name="clientId")
    def client_id(self) -> _builtins.str:
        """
        The client ID for the OAuth provider when using a refresh token to renew access token. Can also be sourced from the `SNOWFLAKE_TOKEN_ACCESSOR_CLIENT_ID` environment variable.
        """
        return pulumi.get(self, "client_id")

    @_builtins.property
    @pulumi.getter(name="clientSecret")
    def client_secret(self) -> _builtins.str:
        """
        The client secret for the OAuth provider when using a refresh token to renew access token. Can also be sourced from the `SNOWFLAKE_TOKEN_ACCESSOR_CLIENT_SECRET` environment variable.
        """
        return pulumi.get(self, "client_secret")

    @_builtins.property
    @pulumi.getter(name="redirectUri")
    def redirect_uri(self) -> _builtins.str:
        """
        The redirect URI for the OAuth provider when using a refresh token to renew access token. Can also be sourced from the `SNOWFLAKE_TOKEN_ACCESSOR_REDIRECT_URI` environment variable.
        """
        return pulumi.get(self, "redirect_uri")

    @_builtins.property
    @pulumi.getter(name="refreshToken")
    def refresh_token(self) -> _builtins.str:
        """
        The refresh token for the OAuth provider when using a refresh token to renew access token. Can also be sourced from the `SNOWFLAKE_TOKEN_ACCESSOR_REFRESH_TOKEN` environment variable.
        """
        return pulumi.get(self, "refresh_token")

    @_builtins.property
    @pulumi.getter(name="tokenEndpoint")
    def token_endpoint(self) -> _builtins.str:
        """
        The token endpoint for the OAuth provider e.g. https://{yourDomain}/oauth/token when using a refresh token to renew access token. Can also be sourced from the `SNOWFLAKE_TOKEN_ACCESSOR_TOKEN_ENDPOINT` environment variable.
        """
        return pulumi.get(self, "token_endpoint")


