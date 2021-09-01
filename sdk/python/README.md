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

The following configuration points are available:

* `snowflake:account` - (required) The name of the Snowflake account. Can also come from the
  `SNOWFLAKE_ACCOUNT` environment variable.
* `snowflake:username` - (required) Username for username+password authentication. Can come from the
  `SNOWFLAKE_USER` environment variable.
* `snowflake:region` - (required) [Snowflake region](https://docs.snowflake.com/en/user-guide/intro-regions.html) 
  to use. Can be sourced from the `SNOWFLAKE_REGION` environment variable.
* `snowflake:password` - (optional) Password for username+password auth. Cannot be used with `browser_auth` or
  `snowflake:privateKeyPath`. Can be sourced from `SNOWFLAKE_PASSWORD` environment variable.
* `snowflake:oauthAccessToken` - (optional) Token for use with OAuth. Generating the token is left to other
  tools. Cannot be used with `snowflake:browserAuth`, `snowflake:privateKeyPath`, `snowflake:oauthRefreshToken`
  or `snowflake:password`.
  Can be sourced from `SNOWFLAKE_OAUTH_ACCESS_TOKEN` environment variable.
* `snowflake:oauthRefreshToken` - (optional) Token for use with OAuth. Setup and generation of the token is
  left to other tools. Should be used in conjunction with `snowflake:oauthClientId`, `snowflake:oauthClientSecret`,
  `snowflake:oauthEndpoint`, `snowflake:oauthRedirectUrl`. Cannot be used with `snowflake:browserAuth`, 
  `snowflake:privateKeyPath`, `snowflake:oauthAccessToken` or `snowflake:password`. Can be sourced from 
  `SNOWFLAKE_OAUTH_REFRESH_TOKEN` environment variable.
* `snowflake:oauthClientId` - (optional) Required when `snowflake:oauthRefreshToken` is used. Can be sourced from
  `SNOWFLAKE_OAUTH_CLIENT_ID` environment variable.
* `snowflake:oauthClientSecret` - (optional) Required when `snowflake:oauthRefreshToken` is used. Can be sourced from
  `SNOWFLAKE_OAUTH_CLIENT_SECRET` environment variable.
* `snowflake:oauthEndpoint` - (optional) Required when `snowflake:oauthRefreshToken` is used. Can be sourced from
  `SNOWFLAKE_OAUTH_ENDPOINT` environment variable.
* `snowflake:oauthRedirectUrl` - (optional) Required when `snowflake:oauthRefreshToken` is used. Can be sourced from
  `SNOWFLAKE_OAUTH_REDIRECT_URL` environment variable.
* `snowflake:privateKeyPath` - (optional) Path to a private key for using keypair authentication.. Cannot be
  used with `snowflake:browserAuth`, `snowflake:oauthAccessToken` or `snowflake:password`. Can be source from
  `SNOWFLAKE_PRIVATE_KEY_PATH` environment variable.
* `snowflake:role` - (optional) Snowflake role to use for operations. If left unset, default role for user
  will be used. Can come from the `SNOWFLAKE_ROLE` environment variable.

## Reference

For further information, please visit [the Snowflake provider docs](https://www.pulumi.com/docs/intro/cloud-providers/snowflake)
or for detailed reference documentation, please visit [the API docs](https://www.pulumi.com/docs/reference/pkg/snowflake).
