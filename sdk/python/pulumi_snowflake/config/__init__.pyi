# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs

account: Optional[str]
"""
Specifies your Snowflake account identifier assigned, by Snowflake. For information about account identifiers, see the
[Snowflake documentation](https://docs.snowflake.com/en/user-guide/admin-account-identifier.html). Can also be sourced
from the `SNOWFLAKE_ACCOUNT` environment variable. Required unless using `profile`.
"""

authenticator: Optional[str]
"""
Specifies the [authentication type](https://pkg.go.dev/github.com/snowflakedb/gosnowflake#AuthType) to use when
connecting to Snowflake. Valid values include: Snowflake, OAuth, ExternalBrowser, Okta, JWT, TokenAccessor,
UsernamePasswordMFA. Can also be sourced from the `SNOWFLAKE_AUTHENTICATOR` environment variable.
"""

browserAuth: Optional[bool]
"""
Required when `oauth_refresh_token` is used. Can also be sourced from `SNOWFLAKE_USE_BROWSER_AUTH` environment variable.
"""

clientIp: Optional[str]
"""
IP address for network checks. Can also be sourced from the `SNOWFLAKE_CLIENT_IP` environment variable.
"""

clientRequestMfaToken: Optional[bool]
"""
When true the MFA token is cached in the credential manager. True by default in Windows/OSX. False for Linux. Can also
be sourced from the `SNOWFLAKE_CLIENT_REQUEST_MFA_TOKEN` environment variable.
"""

clientStoreTemporaryCredential: Optional[bool]
"""
When true the ID token is cached in the credential manager. True by default in Windows/OSX. False for Linux. Can also be
sourced from the `SNOWFLAKE_CLIENT_STORE_TEMPORARY_CREDENTIAL` environment variable.
"""

clientTimeout: Optional[int]
"""
The timeout in seconds for the client to complete the authentication. Default is 900 seconds. Can also be sourced from
the `SNOWFLAKE_CLIENT_TIMEOUT` environment variable.
"""

disableQueryContextCache: Optional[bool]
"""
Should HTAP query context cache be disabled. Can also be sourced from the `SNOWFLAKE_DISABLE_QUERY_CONTEXT_CACHE`
environment variable.
"""

disableTelemetry: Optional[bool]
"""
Indicates whether to disable telemetry. Can also be sourced from the `SNOWFLAKE_DISABLE_TELEMETRY` environment variable.
"""

externalBrowserTimeout: Optional[int]
"""
The timeout in seconds for the external browser to complete the authentication. Default is 120 seconds. Can also be
sourced from the `SNOWFLAKE_EXTERNAL_BROWSER_TIMEOUT` environment variable.
"""

host: Optional[str]
"""
Supports passing in a custom host value to the snowflake go driver for use with privatelink. Can also be sourced from
the `SNOWFLAKE_HOST` environment variable.
"""

insecureMode: Optional[bool]
"""
If true, bypass the Online Certificate Status Protocol (OCSP) certificate revocation check. IMPORTANT: Change the
default value for testing or emergency situations only. Can also be sourced from the `SNOWFLAKE_INSECURE_MODE`
environment variable.
"""

jwtClientTimeout: Optional[int]
"""
The timeout in seconds for the JWT client to complete the authentication. Default is 10 seconds. Can also be sourced
from the `SNOWFLAKE_JWT_CLIENT_TIMEOUT` environment variable.
"""

jwtExpireTimeout: Optional[int]
"""
JWT expire after timeout in seconds. Can also be sourced from the `SNOWFLAKE_JWT_EXPIRE_TIMEOUT` environment variable.
"""

keepSessionAlive: Optional[bool]
"""
Enables the session to persist even after the connection is closed. Can also be sourced from the
`SNOWFLAKE_KEEP_SESSION_ALIVE` environment variable.
"""

loginTimeout: Optional[int]
"""
Login retry timeout EXCLUDING network roundtrip and read out http response. Can also be sourced from the
`SNOWFLAKE_LOGIN_TIMEOUT` environment variable.
"""

oauthAccessToken: Optional[str]
"""
Token for use with OAuth. Generating the token is left to other tools. Cannot be used with `browser_auth`,
`private_key_path`, `oauth_refresh_token` or `password`. Can also be sourced from `SNOWFLAKE_OAUTH_ACCESS_TOKEN`
environment variable.
"""

oauthClientId: Optional[str]
"""
Required when `oauth_refresh_token` is used. Can also be sourced from `SNOWFLAKE_OAUTH_CLIENT_ID` environment variable.
"""

oauthClientSecret: Optional[str]
"""
Required when `oauth_refresh_token` is used. Can also be sourced from `SNOWFLAKE_OAUTH_CLIENT_SECRET` environment
variable.
"""

oauthEndpoint: Optional[str]
"""
Required when `oauth_refresh_token` is used. Can also be sourced from `SNOWFLAKE_OAUTH_ENDPOINT` environment variable.
"""

oauthRedirectUrl: Optional[str]
"""
Required when `oauth_refresh_token` is used. Can also be sourced from `SNOWFLAKE_OAUTH_REDIRECT_URL` environment
variable.
"""

oauthRefreshToken: Optional[str]
"""
Token for use with OAuth. Setup and generation of the token is left to other tools. Should be used in conjunction with
`oauth_client_id`, `oauth_client_secret`, `oauth_endpoint`, `oauth_redirect_url`. Cannot be used with `browser_auth`,
`private_key_path`, `oauth_access_token` or `password`. Can also be sourced from `SNOWFLAKE_OAUTH_REFRESH_TOKEN`
environment variable.
"""

oktaUrl: Optional[str]
"""
The URL of the Okta server. e.g. https://example.okta.com. Can also be sourced from the `SNOWFLAKE_OKTA_URL` environment
variable.
"""

oscpFailOpen: Optional[bool]
"""
True represents OCSP fail open mode. False represents OCSP fail closed mode. Fail open true by default. Can also be
sourced from the `SNOWFLAKE_OCSP_FAIL_OPEN` environment variable.
"""

params: Optional[str]
"""
Sets other connection (i.e. session) parameters. [Parameters](https://docs.snowflake.com/en/sql-reference/parameters)
"""

passcode: Optional[str]
"""
Specifies the passcode provided by Duo when using multi-factor authentication (MFA) for login. Can also be sourced from
the `SNOWFLAKE_PASSCODE` environment variable.
"""

passcodeInPassword: Optional[bool]
"""
False by default. Set to true if the MFA passcode is embedded in the login password. Appends the MFA passcode to the end
of the password. Can also be sourced from the `SNOWFLAKE_PASSCODE_IN_PASSWORD` environment variable.
"""

password: Optional[str]
"""
Password for username+password auth. Cannot be used with `browser_auth` or `private_key_path`. Can also be sourced from
the `SNOWFLAKE_PASSWORD` environment variable.
"""

port: Optional[int]
"""
Support custom port values to snowflake go driver for use with privatelink. Can also be sourced from the
`SNOWFLAKE_PORT` environment variable.
"""

privateKey: Optional[str]
"""
Private Key for username+private-key auth. Cannot be used with `browser_auth` or `password`. Can also be sourced from
`SNOWFLAKE_PRIVATE_KEY` environment variable.
"""

privateKeyPassphrase: Optional[str]
"""
Supports the encryption ciphers aes-128-cbc, aes-128-gcm, aes-192-cbc, aes-192-gcm, aes-256-cbc, aes-256-gcm, and
des-ede3-cbc. Can also be sourced from `SNOWFLAKE_PRIVATE_KEY_PASSPHRASE` environment variable.
"""

privateKeyPath: Optional[str]
"""
Path to a private key for using keypair authentication. Cannot be used with `browser_auth`, `oauth_access_token` or
`password`. Can also be sourced from `SNOWFLAKE_PRIVATE_KEY_PATH` environment variable.
"""

profile: Optional[str]
"""
Sets the profile to read from ~/.snowflake/config file. Can also be sourced from the `SNOWFLAKE_PROFILE` environment
variable.
"""

protocol: Optional[str]
"""
Either http or https, defaults to https. Can also be sourced from the `SNOWFLAKE_PROTOCOL` environment variable.
"""

region: Optional[str]
"""
Snowflake region, such as "eu-central-1", with this parameter. However, since this parameter is deprecated, it is best
to specify the region as part of the account parameter. For details, see the description of the account parameter.
[Snowflake region](https://docs.snowflake.com/en/user-guide/intro-regions.html) to use. Required if using the [legacy
format for the `account`
identifier](https://docs.snowflake.com/en/user-guide/admin-account-identifier.html#format-2-legacy-account-locator-in-a-region)
in the form of `<cloud_region_id>.<cloud>`. Can also be sourced from the `SNOWFLAKE_REGION` environment variable.
"""

requestTimeout: Optional[int]
"""
request retry timeout EXCLUDING network roundtrip and read out http response. Can also be sourced from the
`SNOWFLAKE_REQUEST_TIMEOUT` environment variable.
"""

role: Optional[str]
"""
Specifies the role to use by default for accessing Snowflake objects in the client session. Can also be sourced from the
`SNOWFLAKE_ROLE` environment variable. .
"""

sessionParams: Optional[str]
"""
Sets session parameters. [Parameters](https://docs.snowflake.com/en/sql-reference/parameters)
"""

token: Optional[str]
"""
Token to use for OAuth and other forms of token based auth. Can also be sourced from the `SNOWFLAKE_TOKEN` environment
variable.
"""

tokenAccessor: Optional[str]

user: Optional[str]
"""
Username. Can also be sourced from the `SNOWFLAKE_USER` environment variable. Required unless using `profile`.
"""

username: Optional[str]
"""
Username for username+password authentication. Can also be sourced from the `SNOWFLAKE_USER` environment variable.
Required unless using `profile`.
"""

validateDefaultParameters: Optional[bool]
"""
If true, disables the validation checks for Database, Schema, Warehouse and Role at the time a connection is
established. Can also be sourced from the `SNOWFLAKE_VALIDATE_DEFAULT_PARAMETERS` environment variable.
"""

warehouse: Optional[str]
"""
Specifies the virtual warehouse to use by default for queries, loading, etc. in the client session. Can also be sourced
from the `SNOWFLAKE_WAREHOUSE` environment variable.
"""

