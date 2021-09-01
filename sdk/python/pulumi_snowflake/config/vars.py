# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

import types

__config__ = pulumi.Config('snowflake')


class _ExportableConfig(types.ModuleType):
    @property
    def account(self) -> Optional[str]:
        return __config__.get('account')

    @property
    def browser_auth(self) -> Optional[bool]:
        return __config__.get_bool('browserAuth')

    @property
    def oauth_access_token(self) -> Optional[str]:
        return __config__.get('oauthAccessToken')

    @property
    def oauth_client_id(self) -> Optional[str]:
        return __config__.get('oauthClientId')

    @property
    def oauth_client_secret(self) -> Optional[str]:
        return __config__.get('oauthClientSecret')

    @property
    def oauth_endpoint(self) -> Optional[str]:
        return __config__.get('oauthEndpoint')

    @property
    def oauth_redirect_url(self) -> Optional[str]:
        return __config__.get('oauthRedirectUrl')

    @property
    def oauth_refresh_token(self) -> Optional[str]:
        return __config__.get('oauthRefreshToken')

    @property
    def password(self) -> Optional[str]:
        return __config__.get('password')

    @property
    def private_key(self) -> Optional[str]:
        return __config__.get('privateKey')

    @property
    def private_key_passphrase(self) -> Optional[str]:
        """
        Supports the encryption ciphers aes-128-cbc, aes-128-gcm, aes-192-cbc, aes-192-gcm, aes-256-cbc, aes-256-gcm, and
        des-ede3-cbc
        """
        return __config__.get('privateKeyPassphrase')

    @property
    def private_key_path(self) -> Optional[str]:
        return __config__.get('privateKeyPath')

    @property
    def region(self) -> Optional[str]:
        return __config__.get('region')

    @property
    def role(self) -> Optional[str]:
        return __config__.get('role')

    @property
    def username(self) -> Optional[str]:
        return __config__.get('username')

