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
from .. import _utilities
from . import outputs

accountName: Optional[str]
"""
Specifies your Snowflake account name assigned by Snowflake. For information about account identifiers, see the
[Snowflake documentation](https://docs.snowflake.com/en/user-guide/admin-account-identifier#account-name). Required
unless using `profile`. Can also be sourced from the `SNOWFLAKE_ACCOUNT_NAME` environment variable.
"""

authenticator: Optional[str]
"""
Specifies the [authentication type](https://pkg.go.dev/github.com/snowflakedb/gosnowflake#AuthType) to use when
connecting to Snowflake. Valid options are: `SNOWFLAKE` | `OAUTH` | `EXTERNALBROWSER` | `OKTA` | `SNOWFLAKE_JWT` |
`TOKENACCESSOR` | `USERNAMEPASSWORDMFA`. Can also be sourced from the `SNOWFLAKE_AUTHENTICATOR` environment variable.
"""

clientIp: Optional[str]
"""
IP address for network checks. Can also be sourced from the `SNOWFLAKE_CLIENT_IP` environment variable.
"""

clientRequestMfaToken: Optional[str]
"""
When true the MFA token is cached in the credential manager. True by default in Windows/OSX. False for Linux. Can also
be sourced from the `SNOWFLAKE_CLIENT_REQUEST_MFA_TOKEN` environment variable.
"""

clientStoreTemporaryCredential: Optional[str]
"""
When true the ID token is cached in the credential manager. True by default in Windows/OSX. False for Linux. Can also be
sourced from the `SNOWFLAKE_CLIENT_STORE_TEMPORARY_CREDENTIAL` environment variable.
"""

clientTimeout: Optional[int]
"""
The timeout in seconds for the client to complete the authentication. Can also be sourced from the
`SNOWFLAKE_CLIENT_TIMEOUT` environment variable.
"""

disableConsoleLogin: Optional[str]
"""
Indicates whether console login should be disabled in the driver. Can also be sourced from the
`SNOWFLAKE_DISABLE_CONSOLE_LOGIN` environment variable.
"""

disableQueryContextCache: Optional[bool]
"""
Disables HTAP query context cache in the driver. Can also be sourced from the `SNOWFLAKE_DISABLE_QUERY_CONTEXT_CACHE`
environment variable.
"""

disableTelemetry: Optional[bool]
"""
Disables telemetry in the driver. Can also be sourced from the `DISABLE_TELEMETRY` environment variable.
"""

driverTracing: Optional[str]
"""
Specifies the logging level to be used by the driver. Valid options are: `trace` | `debug` | `info` | `print` |
`warning` | `error` | `fatal` | `panic`. Can also be sourced from the `SNOWFLAKE_DRIVER_TRACING` environment variable.
"""

externalBrowserTimeout: Optional[int]
"""
The timeout in seconds for the external browser to complete the authentication. Can also be sourced from the
`SNOWFLAKE_EXTERNAL_BROWSER_TIMEOUT` environment variable.
"""

host: Optional[str]
"""
Specifies a custom host value used by the driver for privatelink connections. Can also be sourced from the
`SNOWFLAKE_HOST` environment variable.
"""

includeRetryReason: Optional[str]
"""
Should retried request contain retry reason. Can also be sourced from the `SNOWFLAKE_INCLUDE_RETRY_REASON` environment
variable.
"""

insecureMode: Optional[bool]
"""
If true, bypass the Online Certificate Status Protocol (OCSP) certificate revocation check. IMPORTANT: Change the
default value for testing or emergency situations only. Can also be sourced from the `SNOWFLAKE_INSECURE_MODE`
environment variable.
"""

jwtClientTimeout: Optional[int]
"""
The timeout in seconds for the JWT client to complete the authentication. Can also be sourced from the
`SNOWFLAKE_JWT_CLIENT_TIMEOUT` environment variable.
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
Login retry timeout in seconds EXCLUDING network roundtrip and read out http response. Can also be sourced from the
`SNOWFLAKE_LOGIN_TIMEOUT` environment variable.
"""

maxRetryCount: Optional[int]
"""
Specifies how many times non-periodic HTTP request can be retried by the driver. Can also be sourced from the
`SNOWFLAKE_MAX_RETRY_COUNT` environment variable.
"""

ocspFailOpen: Optional[str]
"""
True represents OCSP fail open mode. False represents OCSP fail closed mode. Fail open true by default. Can also be
sourced from the `SNOWFLAKE_OCSP_FAIL_OPEN` environment variable.
"""

oktaUrl: Optional[str]
"""
The URL of the Okta server. e.g. https://example.okta.com. Okta URL host needs to to have a suffix `okta.com`. Read more
in Snowflake [docs](https://docs.snowflake.com/en/user-guide/oauth-okta). Can also be sourced from the
`SNOWFLAKE_OKTA_URL` environment variable.
"""

organizationName: Optional[str]
"""
Specifies your Snowflake organization name assigned by Snowflake. For information about account identifiers, see the
[Snowflake documentation](https://docs.snowflake.com/en/user-guide/admin-account-identifier#organization-name). Required
unless using `profile`. Can also be sourced from the `SNOWFLAKE_ORGANIZATION_NAME` environment variable.
"""

params: Optional[str]
"""
Sets other connection (i.e. session) parameters. [Parameters](https://docs.snowflake.com/en/sql-reference/parameters).
This field can not be set with environmental variables.
"""

passcode: Optional[str]
"""
Specifies the passcode provided by Duo when using multi-factor authentication (MFA) for login. Can also be sourced from
the `SNOWFLAKE_PASSCODE` environment variable.
"""

passcodeInPassword: Optional[bool]
"""
False by default. Set to true if the MFA passcode is embedded to the configured password. Can also be sourced from the
`SNOWFLAKE_PASSCODE_IN_PASSWORD` environment variable.
"""

password: Optional[str]
"""
Password for user + password auth. Cannot be used with `private_key` and `private_key_passphrase`. Can also be sourced
from the `SNOWFLAKE_PASSWORD` environment variable.
"""

port: Optional[int]
"""
Specifies a custom port value used by the driver for privatelink connections. Can also be sourced from the
`SNOWFLAKE_PORT` environment variable.
"""

previewFeaturesEnabled: Optional[str]

privateKey: Optional[str]
"""
Private Key for username+private-key auth. Cannot be used with `password`. Can also be sourced from the
`SNOWFLAKE_PRIVATE_KEY` environment variable.
"""

privateKeyPassphrase: Optional[str]
"""
Supports the encryption ciphers aes-128-cbc, aes-128-gcm, aes-192-cbc, aes-192-gcm, aes-256-cbc, aes-256-gcm, and
des-ede3-cbc. Can also be sourced from the `SNOWFLAKE_PRIVATE_KEY_PASSPHRASE` environment variable.
"""

profile: Optional[str]
"""
Sets the profile to read from ~/.snowflake/config file. Can also be sourced from the `SNOWFLAKE_PROFILE` environment
variable.
"""

protocol: Optional[str]
"""
A protocol used in the connection. Valid options are: `http` | `https`. Can also be sourced from the
`SNOWFLAKE_PROTOCOL` environment variable.
"""

requestTimeout: Optional[int]
"""
request retry timeout in seconds EXCLUDING network roundtrip and read out http response. Can also be sourced from the
`SNOWFLAKE_REQUEST_TIMEOUT` environment variable.
"""

role: Optional[str]
"""
Specifies the role to use by default for accessing Snowflake objects in the client session. Can also be sourced from the
`SNOWFLAKE_ROLE` environment variable.
"""

skipTomlFilePermissionVerification: Optional[bool]
"""
True by default. Skips TOML configuration file permission verification. This flag has no effect on Windows systems, as
the permissions are not checked on this platform. We recommend setting this to `false` and setting the proper privileges
- see the section below. Can also be sourced from the `SNOWFLAKE_SKIP_TOML_FILE_PERMISSION_VERIFICATION` environment
variable.
"""

tmpDirectoryPath: Optional[str]
"""
Sets temporary directory used by the driver for operations like encrypting, compressing etc. Can also be sourced from
the `SNOWFLAKE_TMP_DIRECTORY_PATH` environment variable.
"""

token: Optional[str]
"""
Token to use for OAuth and other forms of token based auth. Can also be sourced from the `SNOWFLAKE_TOKEN` environment
variable.
"""

tokenAccessor: Optional[str]

user: Optional[str]
"""
Username. Required unless using `profile`. Can also be sourced from the `SNOWFLAKE_USER` environment variable.
"""

validateDefaultParameters: Optional[str]
"""
True by default. If false, disables the validation checks for Database, Schema, Warehouse and Role at the time a
connection is established. Can also be sourced from the `SNOWFLAKE_VALIDATE_DEFAULT_PARAMETERS` environment variable.
"""

warehouse: Optional[str]
"""
Specifies the virtual warehouse to use by default for queries, loading, etc. in the client session. Can also be sourced
from the `SNOWFLAKE_WAREHOUSE` environment variable.
"""

