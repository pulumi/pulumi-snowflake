[![Actions Status](https://github.com/pulumi/pulumi-snowflake/workflows/master/badge.svg)](https://github.com/pulumi/pulumi-snowflake/actions)
[![Slack](http://www.pulumi.com/images/docs/badges/slack.svg)](https://slack.pulumi.com)
[![NPM version](https://badge.fury.io/js/%40pulumi%2Fsnowflake.svg)](https://www.npmjs.com/package/@pulumi/snowflake)
[![Python version](https://badge.fury.io/py/pulumi-snowflake.svg)](https://pypi.org/project/pulumi-snowflake)
[![NuGet version](https://badge.fury.io/nu/pulumi.snowflake.svg)](https://badge.fury.io/nu/pulumi.snowflake)
[![PkgGoDev](https://pkg.go.dev/badge/github.com/pulumi/pulumi-snowflake/sdk/go)](https://pkg.go.dev/github.com/pulumi/pulumi-snowflake/sdk/go)
[![License](https://img.shields.io/npm/l/%40pulumi%2Fpulumi.svg)](https://github.com/pulumi/pulumi-snowflake/blob/master/LICENSE)

# Snowflake Resource Provider

The Snowflake Resource Provider lets you manage Snowflake resources.

## Installing

This package is available in many languages in the standard packaging formats.

### Node.js (Java/TypeScript)

To use from JavaScript or TypeScript in Node.js, install using either `npm`:

    $ npm install @pulumi/snowflake

or `yarn`:

    $ yarn add @pulumi/snowflake

### Python

To use from Python, install using `pip`:

    $ pip install pulumi_snowflake

### Go

To use from Go, use `go get` to grab the latest version of the library

    $ go get github.com/pulumi/pulumi-snowflake/sdk

### .NET

To use from .NET, install using `dotnet add package`:

    $ dotnet add package Pulumi.Snowflake

## Configuration

> **Note:** For the complete and latest provider configuration options and descriptions, see the [Snowflake provider configuration reference](https://www.pulumi.com/registry/packages/snowflake/#configuration-reference).

The following commonly used configuration points are available:

* `snowflake:account` - (String) Specifies the Snowflake account identifier. Can be provided in the `org-name` format (e.g. `"myorg-myaccount"`) or as an account locator (e.g. `"xy12345"`). Use as a fallback when `accountName` and `organizationName` are not set. If both `accountName` and `organizationName` are set, they take precedence. Requires the `PROVIDER_CONFIGURATION_ACCOUNT_FALLBACK` experiment to be enabled. Can also be sourced from the `SNOWFLAKE_ACCOUNT` environment variable.
* `snowflake:accountName` - (String) Specifies your Snowflake account name assigned by Snowflake. For information about account identifiers, see the [Snowflake documentation](https://docs.snowflake.com/en/user-guide/admin-account-identifier#account-name). Required unless using `profile`. Can also be sourced from the `SNOWFLAKE_ACCOUNT_NAME` environment variable.
* `snowflake:authenticator` - (String) Specifies the [authentication type](https://pkg.go.dev/github.com/snowflakedb/gosnowflake#AuthType) to use when connecting to Snowflake. Valid options are: `SNOWFLAKE` | `OAUTH` | `EXTERNALBROWSER` | `OKTA` | `SNOWFLAKE_JWT` | `TOKENACCESSOR` | `USERNAMEPASSWORDMFA` | `PROGRAMMATIC_ACCESS_TOKEN` | `OAUTH_CLIENT_CREDENTIALS` | `OAUTH_AUTHORIZATION_CODE` | `WORKLOAD_IDENTITY`. Can also be sourced from the `SNOWFLAKE_AUTHENTICATOR` environment variable.
* `snowflake:oauthAuthorizationUrl` - (String, Sensitive) Authorization URL of OAuth2 external IdP. See [Snowflake OAuth documentation](https://docs.snowflake.com/en/user-guide/oauth). Can also be sourced from the `SNOWFLAKE_OAUTH_AUTHORIZATION_URL` environment variable.
* `snowflake:oauthClientId` - (String, Sensitive) Client id for OAuth2 external IdP. See [Snowflake OAuth documentation](https://docs.snowflake.com/en/user-guide/oauth). Can also be sourced from the `SNOWFLAKE_OAUTH_CLIENT_ID` environment variable.
* `snowflake:oauthClientSecret` - (String, Sensitive) Client secret for OAuth2 external IdP. See [Snowflake OAuth documentation](https://docs.snowflake.com/en/user-guide/oauth). Can also be sourced from the `SNOWFLAKE_OAUTH_CLIENT_SECRET` environment variable.
* `snowflake:oauthRedirectUri` - (String, Sensitive) Redirect URI registered in IdP. See [Snowflake OAuth documentation](https://docs.snowflake.com/en/user-guide/oauth). Can also be sourced from the `SNOWFLAKE_OAUTH_REDIRECT_URI` environment variable.
* `snowflake:oauthScope` - (String) Comma separated list of scopes. If empty it is derived from role. See [Snowflake OAuth documentation](https://docs.snowflake.com/en/user-guide/oauth). Can also be sourced from the `SNOWFLAKE_OAUTH_SCOPE` environment variable.
* `snowflake:oauthTokenRequestUrl` - (String, Sensitive) Token request URL of OAuth2 external IdP. See [Snowflake OAuth documentation](https://docs.snowflake.com/en/user-guide/oauth). Can also be sourced from the `SNOWFLAKE_OAUTH_TOKEN_REQUEST_URL` environment variable.
* `snowflake:organizationName` - (String) Specifies your Snowflake organization name assigned by Snowflake. For information about account identifiers, see the [Snowflake documentation](https://docs.snowflake.com/en/user-guide/admin-account-identifier#organization-name). Required unless using `profile`. Can also be sourced from the `SNOWFLAKE_ORGANIZATION_NAME` environment variable.
* `snowflake:password` - (String, Sensitive) Password for user + password or [token](https://docs.snowflake.com/en/user-guide/programmatic-access-tokens#generating-a-programmatic-access-token) for [PAT auth](https://docs.snowflake.com/en/user-guide/programmatic-access-tokens). Cannot be used with `privateKey` and `privateKeyPassphrase`. Can also be sourced from the `SNOWFLAKE_PASSWORD` environment variable.
* `snowflake:privateKey` - (String, Sensitive) Private Key for username+private-key auth. Cannot be used with `password`. Can also be sourced from the `SNOWFLAKE_PRIVATE_KEY` environment variable.
* `snowflake:privateKeyPassphrase` - (String, Sensitive) Supports the encryption ciphers aes-128-cbc, aes-128-gcm, aes-192-cbc, aes-192-gcm, aes-256-cbc, aes-256-gcm, and des-ede3-cbc. Can also be sourced from the `SNOWFLAKE_PRIVATE_KEY_PASSPHRASE` environment variable.
* `snowflake:profile` - (String) Sets the profile to read from ~/.snowflake/config file. Can also be sourced from the `SNOWFLAKE_PROFILE` environment variable.
* `snowflake:role` - (String) Specifies the role to use by default for accessing Snowflake objects in the client session. Can also be sourced from the `SNOWFLAKE_ROLE` environment variable.
* `snowflake:token` - (String, Sensitive) Token to use for OAuth and other forms of token based auth. When this field is set here, or in the TOML file, the provider sets the `authenticator` to `OAUTH`. Optionally, set the `authenticator` field to the authenticator you want to use. Can also be sourced from the `SNOWFLAKE_TOKEN` environment variable.
* `snowflake:user` - (String) Username. Required unless using `profile`. Can also be sourced from the `SNOWFLAKE_USER` environment variable.
* `snowflake:warehouse` - (String) Specifies the virtual warehouse to use by default for queries, loading, etc. in the client session. Can also be sourced from the `SNOWFLAKE_WAREHOUSE` environment variable.

## Reference

For further information, please visit [the Snowflake provider docs](https://www.pulumi.com/docs/intro/cloud-providers/snowflake)
or for detailed reference documentation, please visit [the API docs](https://www.pulumi.com/docs/reference/pkg/snowflake).
