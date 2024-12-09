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
from .. import _utilities
from . import outputs

import types

__config__ = pulumi.Config('snowflake')


class _ExportableConfig(types.ModuleType):
    @property
    def account(self) -> Optional[str]:
        """
        Use `account_name` and `organization_name` instead. Specifies your Snowflake account identifier assigned, by Snowflake.
        The [account
        locator](https://docs.snowflake.com/en/user-guide/admin-account-identifier#format-2-account-locator-in-a-region) format
        is not supported. For information about account identifiers, see the [Snowflake
        documentation](https://docs.snowflake.com/en/user-guide/admin-account-identifier.html). Required unless using `profile`.
        Can also be sourced from the `SNOWFLAKE_ACCOUNT` environment variable.
        """
        return __config__.get('account') or _utilities.get_env('SNOWFLAKE_ACCOUNT')

    @property
    def account_name(self) -> Optional[str]:
        """
        Specifies your Snowflake account name assigned by Snowflake. For information about account identifiers, see the
        [Snowflake documentation](https://docs.snowflake.com/en/user-guide/admin-account-identifier#account-name). Required
        unless using `profile`. Can also be sourced from the `SNOWFLAKE_ACCOUNT_NAME` environment variable.
        """
        return __config__.get('accountName')

    @property
    def authenticator(self) -> Optional[str]:
        """
        Specifies the [authentication type](https://pkg.go.dev/github.com/snowflakedb/gosnowflake#AuthType) to use when
        connecting to Snowflake. Valid options are: `SNOWFLAKE` | `OAUTH` | `EXTERNALBROWSER` | `OKTA` | `JWT` | `SNOWFLAKE_JWT`
        | `TOKENACCESSOR` | `USERNAMEPASSWORDMFA`. Value `JWT` is deprecated and will be removed in future releases. Can also be
        sourced from the `SNOWFLAKE_AUTHENTICATOR` environment variable.
        """
        return __config__.get('authenticator')

    @property
    def browser_auth(self) -> Optional[bool]:
        """
        Required when `oauth_refresh_token` is used. Can also be sourced from `SNOWFLAKE_USE_BROWSER_AUTH` environment variable.
        """
        return __config__.get_bool('browserAuth') or _utilities.get_env_bool('SNOWFLAKE_USE_BROWSER_AUTH')

    @property
    def client_ip(self) -> Optional[str]:
        """
        IP address for network checks. Can also be sourced from the `SNOWFLAKE_CLIENT_IP` environment variable.
        """
        return __config__.get('clientIp')

    @property
    def client_request_mfa_token(self) -> Optional[str]:
        """
        When true the MFA token is cached in the credential manager. True by default in Windows/OSX. False for Linux. Can also
        be sourced from the `SNOWFLAKE_CLIENT_REQUEST_MFA_TOKEN` environment variable.
        """
        return __config__.get('clientRequestMfaToken')

    @property
    def client_store_temporary_credential(self) -> Optional[str]:
        """
        When true the ID token is cached in the credential manager. True by default in Windows/OSX. False for Linux. Can also be
        sourced from the `SNOWFLAKE_CLIENT_STORE_TEMPORARY_CREDENTIAL` environment variable.
        """
        return __config__.get('clientStoreTemporaryCredential')

    @property
    def client_timeout(self) -> Optional[int]:
        """
        The timeout in seconds for the client to complete the authentication. Can also be sourced from the
        `SNOWFLAKE_CLIENT_TIMEOUT` environment variable.
        """
        return __config__.get_int('clientTimeout')

    @property
    def disable_console_login(self) -> Optional[str]:
        """
        Indicates whether console login should be disabled in the driver. Can also be sourced from the
        `SNOWFLAKE_DISABLE_CONSOLE_LOGIN` environment variable.
        """
        return __config__.get('disableConsoleLogin')

    @property
    def disable_query_context_cache(self) -> Optional[bool]:
        """
        Disables HTAP query context cache in the driver. Can also be sourced from the `SNOWFLAKE_DISABLE_QUERY_CONTEXT_CACHE`
        environment variable.
        """
        return __config__.get_bool('disableQueryContextCache')

    @property
    def disable_telemetry(self) -> Optional[bool]:
        """
        Disables telemetry in the driver. Can also be sourced from the `DISABLE_TELEMETRY` environment variable.
        """
        return __config__.get_bool('disableTelemetry')

    @property
    def driver_tracing(self) -> Optional[str]:
        """
        Specifies the logging level to be used by the driver. Valid options are: `trace` | `debug` | `info` | `print` |
        `warning` | `error` | `fatal` | `panic`. Can also be sourced from the `SNOWFLAKE_DRIVER_TRACING` environment variable.
        """
        return __config__.get('driverTracing')

    @property
    def external_browser_timeout(self) -> Optional[int]:
        """
        The timeout in seconds for the external browser to complete the authentication. Can also be sourced from the
        `SNOWFLAKE_EXTERNAL_BROWSER_TIMEOUT` environment variable.
        """
        return __config__.get_int('externalBrowserTimeout')

    @property
    def host(self) -> Optional[str]:
        """
        Specifies a custom host value used by the driver for privatelink connections. Can also be sourced from the
        `SNOWFLAKE_HOST` environment variable.
        """
        return __config__.get('host') or _utilities.get_env('SNOWFLAKE_HOST')

    @property
    def include_retry_reason(self) -> Optional[str]:
        """
        Should retried request contain retry reason. Can also be sourced from the `SNOWFLAKE_INCLUDE_RETRY_REASON` environment
        variable.
        """
        return __config__.get('includeRetryReason')

    @property
    def insecure_mode(self) -> Optional[bool]:
        """
        If true, bypass the Online Certificate Status Protocol (OCSP) certificate revocation check. IMPORTANT: Change the
        default value for testing or emergency situations only. Can also be sourced from the `SNOWFLAKE_INSECURE_MODE`
        environment variable.
        """
        return __config__.get_bool('insecureMode')

    @property
    def jwt_client_timeout(self) -> Optional[int]:
        """
        The timeout in seconds for the JWT client to complete the authentication. Can also be sourced from the
        `SNOWFLAKE_JWT_CLIENT_TIMEOUT` environment variable.
        """
        return __config__.get_int('jwtClientTimeout')

    @property
    def jwt_expire_timeout(self) -> Optional[int]:
        """
        JWT expire after timeout in seconds. Can also be sourced from the `SNOWFLAKE_JWT_EXPIRE_TIMEOUT` environment variable.
        """
        return __config__.get_int('jwtExpireTimeout')

    @property
    def keep_session_alive(self) -> Optional[bool]:
        """
        Enables the session to persist even after the connection is closed. Can also be sourced from the
        `SNOWFLAKE_KEEP_SESSION_ALIVE` environment variable.
        """
        return __config__.get_bool('keepSessionAlive')

    @property
    def login_timeout(self) -> Optional[int]:
        """
        Login retry timeout in seconds EXCLUDING network roundtrip and read out http response. Can also be sourced from the
        `SNOWFLAKE_LOGIN_TIMEOUT` environment variable.
        """
        return __config__.get_int('loginTimeout')

    @property
    def max_retry_count(self) -> Optional[int]:
        """
        Specifies how many times non-periodic HTTP request can be retried by the driver. Can also be sourced from the
        `SNOWFLAKE_MAX_RETRY_COUNT` environment variable.
        """
        return __config__.get_int('maxRetryCount')

    @property
    def oauth_access_token(self) -> Optional[str]:
        """
        Token for use with OAuth. Generating the token is left to other tools. Cannot be used with `browser_auth`,
        `private_key_path`, `oauth_refresh_token` or `password`. Can also be sourced from `SNOWFLAKE_OAUTH_ACCESS_TOKEN`
        environment variable.
        """
        return __config__.get('oauthAccessToken') or _utilities.get_env('SNOWFLAKE_OAUTH_ACCESS_TOKEN')

    @property
    def oauth_client_id(self) -> Optional[str]:
        """
        Required when `oauth_refresh_token` is used. Can also be sourced from `SNOWFLAKE_OAUTH_CLIENT_ID` environment variable.
        """
        return __config__.get('oauthClientId') or _utilities.get_env('SNOWFLAKE_OAUTH_CLIENT_ID')

    @property
    def oauth_client_secret(self) -> Optional[str]:
        """
        Required when `oauth_refresh_token` is used. Can also be sourced from `SNOWFLAKE_OAUTH_CLIENT_SECRET` environment
        variable.
        """
        return __config__.get('oauthClientSecret') or _utilities.get_env('SNOWFLAKE_OAUTH_CLIENT_SECRET')

    @property
    def oauth_endpoint(self) -> Optional[str]:
        """
        Required when `oauth_refresh_token` is used. Can also be sourced from `SNOWFLAKE_OAUTH_ENDPOINT` environment variable.
        """
        return __config__.get('oauthEndpoint') or _utilities.get_env('SNOWFLAKE_OAUTH_ENDPOINT')

    @property
    def oauth_redirect_url(self) -> Optional[str]:
        """
        Required when `oauth_refresh_token` is used. Can also be sourced from `SNOWFLAKE_OAUTH_REDIRECT_URL` environment
        variable.
        """
        return __config__.get('oauthRedirectUrl') or _utilities.get_env('SNOWFLAKE_OAUTH_REDIRECT_URL')

    @property
    def oauth_refresh_token(self) -> Optional[str]:
        """
        Token for use with OAuth. Setup and generation of the token is left to other tools. Should be used in conjunction with
        `oauth_client_id`, `oauth_client_secret`, `oauth_endpoint`, `oauth_redirect_url`. Cannot be used with `browser_auth`,
        `private_key_path`, `oauth_access_token` or `password`. Can also be sourced from `SNOWFLAKE_OAUTH_REFRESH_TOKEN`
        environment variable.
        """
        return __config__.get('oauthRefreshToken') or _utilities.get_env('SNOWFLAKE_OAUTH_REFRESH_TOKEN')

    @property
    def ocsp_fail_open(self) -> Optional[str]:
        """
        True represents OCSP fail open mode. False represents OCSP fail closed mode. Fail open true by default. Can also be
        sourced from the `SNOWFLAKE_OCSP_FAIL_OPEN` environment variable.
        """
        return __config__.get('ocspFailOpen')

    @property
    def okta_url(self) -> Optional[str]:
        """
        The URL of the Okta server. e.g. https://example.okta.com. Okta URL host needs to to have a suffix `okta.com`. Read more
        in Snowflake [docs](https://docs.snowflake.com/en/user-guide/oauth-okta). Can also be sourced from the
        `SNOWFLAKE_OKTA_URL` environment variable.
        """
        return __config__.get('oktaUrl')

    @property
    def organization_name(self) -> Optional[str]:
        """
        Specifies your Snowflake organization name assigned by Snowflake. For information about account identifiers, see the
        [Snowflake documentation](https://docs.snowflake.com/en/user-guide/admin-account-identifier#organization-name). Required
        unless using `profile`. Can also be sourced from the `SNOWFLAKE_ORGANIZATION_NAME` environment variable.
        """
        return __config__.get('organizationName')

    @property
    def params(self) -> Optional[str]:
        """
        Sets other connection (i.e. session) parameters. [Parameters](https://docs.snowflake.com/en/sql-reference/parameters).
        This field can not be set with environmental variables.
        """
        return __config__.get('params')

    @property
    def passcode(self) -> Optional[str]:
        """
        Specifies the passcode provided by Duo when using multi-factor authentication (MFA) for login. Can also be sourced from
        the `SNOWFLAKE_PASSCODE` environment variable.
        """
        return __config__.get('passcode')

    @property
    def passcode_in_password(self) -> Optional[bool]:
        """
        False by default. Set to true if the MFA passcode is embedded to the configured password. Can also be sourced from the
        `SNOWFLAKE_PASSCODE_IN_PASSWORD` environment variable.
        """
        return __config__.get_bool('passcodeInPassword')

    @property
    def password(self) -> Optional[str]:
        """
        Password for user + password auth. Cannot be used with `browser_auth` or `private_key_path`. Can also be sourced from
        the `SNOWFLAKE_PASSWORD` environment variable.
        """
        return __config__.get('password') or _utilities.get_env('SNOWFLAKE_PASSWORD')

    @property
    def port(self) -> Optional[int]:
        """
        Specifies a custom port value used by the driver for privatelink connections. Can also be sourced from the
        `SNOWFLAKE_PORT` environment variable.
        """
        return __config__.get_int('port') or _utilities.get_env_int('SNOWFLAKE_PORT')

    @property
    def private_key(self) -> Optional[str]:
        """
        Private Key for username+private-key auth. Cannot be used with `browser_auth` or `password`. Can also be sourced from
        the `SNOWFLAKE_PRIVATE_KEY` environment variable.
        """
        return __config__.get('privateKey')

    @property
    def private_key_passphrase(self) -> Optional[str]:
        """
        Supports the encryption ciphers aes-128-cbc, aes-128-gcm, aes-192-cbc, aes-192-gcm, aes-256-cbc, aes-256-gcm, and
        des-ede3-cbc. Can also be sourced from the `SNOWFLAKE_PRIVATE_KEY_PASSPHRASE` environment variable.
        """
        return __config__.get('privateKeyPassphrase') or _utilities.get_env('SNOWFLAKE_PRIVATE_KEY_PASSPHRASE')

    @property
    def private_key_path(self) -> Optional[str]:
        """
        Path to a private key for using keypair authentication. Cannot be used with `browser_auth`, `oauth_access_token` or
        `password`. Can also be sourced from `SNOWFLAKE_PRIVATE_KEY_PATH` environment variable.
        """
        return __config__.get('privateKeyPath') or _utilities.get_env('SNOWFLAKE_PRIVATE_KEY_PATH')

    @property
    def profile(self) -> Optional[str]:
        """
        Sets the profile to read from ~/.snowflake/config file. Can also be sourced from the `SNOWFLAKE_PROFILE` environment
        variable.
        """
        return __config__.get('profile')

    @property
    def protocol(self) -> Optional[str]:
        """
        A protocol used in the connection. Valid options are: `http` | `https`. Can also be sourced from the
        `SNOWFLAKE_PROTOCOL` environment variable.
        """
        return __config__.get('protocol') or _utilities.get_env('SNOWFLAKE_PROTOCOL')

    @property
    def region(self) -> Optional[str]:
        """
        Snowflake region, such as "eu-central-1", with this parameter. However, since this parameter is deprecated, it is best
        to specify the region as part of the account parameter. For details, see the description of the account parameter.
        [Snowflake region](https://docs.snowflake.com/en/user-guide/intro-regions.html) to use. Required if using the [legacy
        format for the `account`
        identifier](https://docs.snowflake.com/en/user-guide/admin-account-identifier.html#format-2-legacy-account-locator-in-a-region)
        in the form of `<cloud_region_id>.<cloud>`. Can also be sourced from the `SNOWFLAKE_REGION` environment variable.
        """
        return __config__.get('region') or _utilities.get_env('SNOWFLAKE_REGION')

    @property
    def request_timeout(self) -> Optional[int]:
        """
        request retry timeout in seconds EXCLUDING network roundtrip and read out http response. Can also be sourced from the
        `SNOWFLAKE_REQUEST_TIMEOUT` environment variable.
        """
        return __config__.get_int('requestTimeout')

    @property
    def role(self) -> Optional[str]:
        """
        Specifies the role to use by default for accessing Snowflake objects in the client session. Can also be sourced from the
        `SNOWFLAKE_ROLE` environment variable.
        """
        return __config__.get('role') or _utilities.get_env('SNOWFLAKE_ROLE')

    @property
    def session_params(self) -> Optional[str]:
        """
        Sets session parameters. [Parameters](https://docs.snowflake.com/en/sql-reference/parameters)
        """
        return __config__.get('sessionParams')

    @property
    def tmp_directory_path(self) -> Optional[str]:
        """
        Sets temporary directory used by the driver for operations like encrypting, compressing etc. Can also be sourced from
        the `SNOWFLAKE_TMP_DIRECTORY_PATH` environment variable.
        """
        return __config__.get('tmpDirectoryPath')

    @property
    def token(self) -> Optional[str]:
        """
        Token to use for OAuth and other forms of token based auth. Can also be sourced from the `SNOWFLAKE_TOKEN` environment
        variable.
        """
        return __config__.get('token')

    @property
    def token_accessor(self) -> Optional[str]:
        return __config__.get('tokenAccessor')

    @property
    def user(self) -> Optional[str]:
        """
        Username. Required unless using `profile`. Can also be sourced from the `SNOWFLAKE_USER` environment variable.
        """
        return __config__.get('user')

    @property
    def username(self) -> Optional[str]:
        """
        Username for user + password authentication. Required unless using `profile`. Can also be sourced from the
        `SNOWFLAKE_USERNAME` environment variable.
        """
        return __config__.get('username') or _utilities.get_env('SNOWFLAKE_USER')

    @property
    def validate_default_parameters(self) -> Optional[str]:
        """
        True by default. If false, disables the validation checks for Database, Schema, Warehouse and Role at the time a
        connection is established. Can also be sourced from the `SNOWFLAKE_VALIDATE_DEFAULT_PARAMETERS` environment variable.
        """
        return __config__.get('validateDefaultParameters')

    @property
    def warehouse(self) -> Optional[str]:
        """
        Specifies the virtual warehouse to use by default for queries, loading, etc. in the client session. Can also be sourced
        from the `SNOWFLAKE_WAREHOUSE` environment variable.
        """
        return __config__.get('warehouse') or _utilities.get_env('SNOWFLAKE_WAREHOUSE')

