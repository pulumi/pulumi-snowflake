// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake
{
    /// <summary>
    /// The provider type for the snowflake package. By default, resources use package-wide configuration
    /// settings, however an explicit `Provider` instance may be created and passed during resource
    /// construction to achieve fine-grained programmatic control over provider settings. See the
    /// [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
    /// </summary>
    [SnowflakeResourceType("pulumi:providers:snowflake")]
    public partial class Provider : global::Pulumi.ProviderResource
    {
        /// <summary>
        /// Specifies your Snowflake account identifier assigned, by Snowflake. For information about account identifiers, see the
        /// [Snowflake documentation](https://docs.snowflake.com/en/user-guide/admin-account-identifier.html). Can also be sourced
        /// from the `SNOWFLAKE_ACCOUNT` environment variable. Required unless using `profile`.
        /// </summary>
        [Output("account")]
        public Output<string?> Account { get; private set; } = null!;

        /// <summary>
        /// Specifies the [authentication type](https://pkg.go.dev/github.com/snowflakedb/gosnowflake#AuthType) to use when
        /// connecting to Snowflake. Valid values include: Snowflake, OAuth, ExternalBrowser, Okta, JWT, TokenAccessor,
        /// UsernamePasswordMFA. Can also be sourced from the `SNOWFLAKE_AUTHENTICATOR` environment variable. It has to be set
        /// explicitly to JWT for private key authentication.
        /// </summary>
        [Output("authenticator")]
        public Output<string?> Authenticator { get; private set; } = null!;

        /// <summary>
        /// IP address for network checks. Can also be sourced from the `SNOWFLAKE_CLIENT_IP` environment variable.
        /// </summary>
        [Output("clientIp")]
        public Output<string?> ClientIp { get; private set; } = null!;

        /// <summary>
        /// Supports passing in a custom host value to the snowflake go driver for use with privatelink. Can also be sourced from
        /// the `SNOWFLAKE_HOST` environment variable.
        /// </summary>
        [Output("host")]
        public Output<string?> Host { get; private set; } = null!;

        /// <summary>
        /// Token for use with OAuth. Generating the token is left to other tools. Cannot be used with `browser_auth`,
        /// `private_key_path`, `oauth_refresh_token` or `password`. Can also be sourced from `SNOWFLAKE_OAUTH_ACCESS_TOKEN`
        /// environment variable.
        /// </summary>
        [Output("oauthAccessToken")]
        public Output<string?> OauthAccessToken { get; private set; } = null!;

        /// <summary>
        /// Required when `oauth_refresh_token` is used. Can also be sourced from `SNOWFLAKE_OAUTH_CLIENT_ID` environment variable.
        /// </summary>
        [Output("oauthClientId")]
        public Output<string?> OauthClientId { get; private set; } = null!;

        /// <summary>
        /// Required when `oauth_refresh_token` is used. Can also be sourced from `SNOWFLAKE_OAUTH_CLIENT_SECRET` environment
        /// variable.
        /// </summary>
        [Output("oauthClientSecret")]
        public Output<string?> OauthClientSecret { get; private set; } = null!;

        /// <summary>
        /// Required when `oauth_refresh_token` is used. Can also be sourced from `SNOWFLAKE_OAUTH_ENDPOINT` environment variable.
        /// </summary>
        [Output("oauthEndpoint")]
        public Output<string?> OauthEndpoint { get; private set; } = null!;

        /// <summary>
        /// Required when `oauth_refresh_token` is used. Can also be sourced from `SNOWFLAKE_OAUTH_REDIRECT_URL` environment
        /// variable.
        /// </summary>
        [Output("oauthRedirectUrl")]
        public Output<string?> OauthRedirectUrl { get; private set; } = null!;

        /// <summary>
        /// Token for use with OAuth. Setup and generation of the token is left to other tools. Should be used in conjunction with
        /// `oauth_client_id`, `oauth_client_secret`, `oauth_endpoint`, `oauth_redirect_url`. Cannot be used with `browser_auth`,
        /// `private_key_path`, `oauth_access_token` or `password`. Can also be sourced from `SNOWFLAKE_OAUTH_REFRESH_TOKEN`
        /// environment variable.
        /// </summary>
        [Output("oauthRefreshToken")]
        public Output<string?> OauthRefreshToken { get; private set; } = null!;

        /// <summary>
        /// The URL of the Okta server. e.g. https://example.okta.com. Can also be sourced from the `SNOWFLAKE_OKTA_URL` environment
        /// variable.
        /// </summary>
        [Output("oktaUrl")]
        public Output<string?> OktaUrl { get; private set; } = null!;

        /// <summary>
        /// Specifies the passcode provided by Duo when using multi-factor authentication (MFA) for login. Can also be sourced from
        /// the `SNOWFLAKE_PASSCODE` environment variable.
        /// </summary>
        [Output("passcode")]
        public Output<string?> Passcode { get; private set; } = null!;

        /// <summary>
        /// Password for username+password auth. Cannot be used with `browser_auth` or `private_key_path`. Can also be sourced from
        /// the `SNOWFLAKE_PASSWORD` environment variable.
        /// </summary>
        [Output("password")]
        public Output<string?> Password { get; private set; } = null!;

        /// <summary>
        /// Private Key for username+private-key auth. Cannot be used with `browser_auth` or `password`. Can also be sourced from
        /// `SNOWFLAKE_PRIVATE_KEY` environment variable.
        /// </summary>
        [Output("privateKey")]
        public Output<string?> PrivateKey { get; private set; } = null!;

        /// <summary>
        /// Supports the encryption ciphers aes-128-cbc, aes-128-gcm, aes-192-cbc, aes-192-gcm, aes-256-cbc, aes-256-gcm, and
        /// des-ede3-cbc. Can also be sourced from `SNOWFLAKE_PRIVATE_KEY_PASSPHRASE` environment variable.
        /// </summary>
        [Output("privateKeyPassphrase")]
        public Output<string?> PrivateKeyPassphrase { get; private set; } = null!;

        /// <summary>
        /// Path to a private key for using keypair authentication. Cannot be used with `browser_auth`, `oauth_access_token` or
        /// `password`. Can also be sourced from `SNOWFLAKE_PRIVATE_KEY_PATH` environment variable.
        /// </summary>
        [Output("privateKeyPath")]
        public Output<string?> PrivateKeyPath { get; private set; } = null!;

        /// <summary>
        /// Sets the profile to read from ~/.snowflake/config file. Can also be sourced from the `SNOWFLAKE_PROFILE` environment
        /// variable.
        /// </summary>
        [Output("profile")]
        public Output<string?> Profile { get; private set; } = null!;

        /// <summary>
        /// Either http or https, defaults to https. Can also be sourced from the `SNOWFLAKE_PROTOCOL` environment variable.
        /// </summary>
        [Output("protocol")]
        public Output<string?> Protocol { get; private set; } = null!;

        /// <summary>
        /// Snowflake region, such as "eu-central-1", with this parameter. However, since this parameter is deprecated, it is best
        /// to specify the region as part of the account parameter. For details, see the description of the account parameter.
        /// [Snowflake region](https://docs.snowflake.com/en/user-guide/intro-regions.html) to use. Required if using the [legacy
        /// format for the `account`
        /// identifier](https://docs.snowflake.com/en/user-guide/admin-account-identifier.html#format-2-legacy-account-locator-in-a-region)
        /// in the form of `&lt;cloud_region_id&gt;.&lt;cloud&gt;`. Can also be sourced from the `SNOWFLAKE_REGION` environment variable.
        /// </summary>
        [Output("region")]
        public Output<string?> Region { get; private set; } = null!;

        /// <summary>
        /// Specifies the role to use by default for accessing Snowflake objects in the client session. Can also be sourced from the
        /// `SNOWFLAKE_ROLE` environment variable. .
        /// </summary>
        [Output("role")]
        public Output<string?> Role { get; private set; } = null!;

        /// <summary>
        /// Token to use for OAuth and other forms of token based auth. Can also be sourced from the `SNOWFLAKE_TOKEN` environment
        /// variable.
        /// </summary>
        [Output("token")]
        public Output<string?> Token { get; private set; } = null!;

        /// <summary>
        /// Username. Can also be sourced from the `SNOWFLAKE_USER` environment variable. Required unless using `profile`.
        /// </summary>
        [Output("user")]
        public Output<string?> User { get; private set; } = null!;

        /// <summary>
        /// Username for username+password authentication. Can also be sourced from the `SNOWFLAKE_USERNAME` environment variable.
        /// Required unless using `profile`.
        /// </summary>
        [Output("username")]
        public Output<string?> Username { get; private set; } = null!;

        /// <summary>
        /// Specifies the virtual warehouse to use by default for queries, loading, etc. in the client session. Can also be sourced
        /// from the `SNOWFLAKE_WAREHOUSE` environment variable.
        /// </summary>
        [Output("warehouse")]
        public Output<string?> Warehouse { get; private set; } = null!;


        /// <summary>
        /// Create a Provider resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Provider(string name, ProviderArgs? args = null, CustomResourceOptions? options = null)
            : base("snowflake", name, args ?? new ProviderArgs(), MakeResourceOptions(options, ""))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "oauthAccessToken",
                    "oauthClientId",
                    "oauthClientSecret",
                    "oauthEndpoint",
                    "oauthRedirectUrl",
                    "oauthRefreshToken",
                    "password",
                    "privateKey",
                    "privateKeyPassphrase",
                    "privateKeyPath",
                    "token",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
    }

    public sealed class ProviderArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies your Snowflake account identifier assigned, by Snowflake. For information about account identifiers, see the
        /// [Snowflake documentation](https://docs.snowflake.com/en/user-guide/admin-account-identifier.html). Can also be sourced
        /// from the `SNOWFLAKE_ACCOUNT` environment variable. Required unless using `profile`.
        /// </summary>
        [Input("account")]
        public Input<string>? Account { get; set; }

        /// <summary>
        /// Specifies the [authentication type](https://pkg.go.dev/github.com/snowflakedb/gosnowflake#AuthType) to use when
        /// connecting to Snowflake. Valid values include: Snowflake, OAuth, ExternalBrowser, Okta, JWT, TokenAccessor,
        /// UsernamePasswordMFA. Can also be sourced from the `SNOWFLAKE_AUTHENTICATOR` environment variable. It has to be set
        /// explicitly to JWT for private key authentication.
        /// </summary>
        [Input("authenticator")]
        public Input<string>? Authenticator { get; set; }

        /// <summary>
        /// Required when `oauth_refresh_token` is used. Can also be sourced from `SNOWFLAKE_USE_BROWSER_AUTH` environment variable.
        /// </summary>
        [Input("browserAuth", json: true)]
        public Input<bool>? BrowserAuth { get; set; }

        /// <summary>
        /// IP address for network checks. Can also be sourced from the `SNOWFLAKE_CLIENT_IP` environment variable.
        /// </summary>
        [Input("clientIp")]
        public Input<string>? ClientIp { get; set; }

        /// <summary>
        /// When true the MFA token is cached in the credential manager. True by default in Windows/OSX. False for Linux. Can also
        /// be sourced from the `SNOWFLAKE_CLIENT_REQUEST_MFA_TOKEN` environment variable.
        /// </summary>
        [Input("clientRequestMfaToken", json: true)]
        public Input<bool>? ClientRequestMfaToken { get; set; }

        /// <summary>
        /// When true the ID token is cached in the credential manager. True by default in Windows/OSX. False for Linux. Can also be
        /// sourced from the `SNOWFLAKE_CLIENT_STORE_TEMPORARY_CREDENTIAL` environment variable.
        /// </summary>
        [Input("clientStoreTemporaryCredential", json: true)]
        public Input<bool>? ClientStoreTemporaryCredential { get; set; }

        /// <summary>
        /// The timeout in seconds for the client to complete the authentication. Default is 900 seconds. Can also be sourced from
        /// the `SNOWFLAKE_CLIENT_TIMEOUT` environment variable.
        /// </summary>
        [Input("clientTimeout", json: true)]
        public Input<int>? ClientTimeout { get; set; }

        /// <summary>
        /// Should HTAP query context cache be disabled. Can also be sourced from the `SNOWFLAKE_DISABLE_QUERY_CONTEXT_CACHE`
        /// environment variable.
        /// </summary>
        [Input("disableQueryContextCache", json: true)]
        public Input<bool>? DisableQueryContextCache { get; set; }

        /// <summary>
        /// Indicates whether to disable telemetry. Can also be sourced from the `SNOWFLAKE_DISABLE_TELEMETRY` environment variable.
        /// </summary>
        [Input("disableTelemetry", json: true)]
        public Input<bool>? DisableTelemetry { get; set; }

        /// <summary>
        /// The timeout in seconds for the external browser to complete the authentication. Default is 120 seconds. Can also be
        /// sourced from the `SNOWFLAKE_EXTERNAL_BROWSER_TIMEOUT` environment variable.
        /// </summary>
        [Input("externalBrowserTimeout", json: true)]
        public Input<int>? ExternalBrowserTimeout { get; set; }

        /// <summary>
        /// Supports passing in a custom host value to the snowflake go driver for use with privatelink. Can also be sourced from
        /// the `SNOWFLAKE_HOST` environment variable.
        /// </summary>
        [Input("host")]
        public Input<string>? Host { get; set; }

        /// <summary>
        /// If true, bypass the Online Certificate Status Protocol (OCSP) certificate revocation check. IMPORTANT: Change the
        /// default value for testing or emergency situations only. Can also be sourced from the `SNOWFLAKE_INSECURE_MODE`
        /// environment variable.
        /// </summary>
        [Input("insecureMode", json: true)]
        public Input<bool>? InsecureMode { get; set; }

        /// <summary>
        /// The timeout in seconds for the JWT client to complete the authentication. Default is 10 seconds. Can also be sourced
        /// from the `SNOWFLAKE_JWT_CLIENT_TIMEOUT` environment variable.
        /// </summary>
        [Input("jwtClientTimeout", json: true)]
        public Input<int>? JwtClientTimeout { get; set; }

        /// <summary>
        /// JWT expire after timeout in seconds. Can also be sourced from the `SNOWFLAKE_JWT_EXPIRE_TIMEOUT` environment variable.
        /// </summary>
        [Input("jwtExpireTimeout", json: true)]
        public Input<int>? JwtExpireTimeout { get; set; }

        /// <summary>
        /// Enables the session to persist even after the connection is closed. Can also be sourced from the
        /// `SNOWFLAKE_KEEP_SESSION_ALIVE` environment variable.
        /// </summary>
        [Input("keepSessionAlive", json: true)]
        public Input<bool>? KeepSessionAlive { get; set; }

        /// <summary>
        /// Login retry timeout EXCLUDING network roundtrip and read out http response. Can also be sourced from the
        /// `SNOWFLAKE_LOGIN_TIMEOUT` environment variable.
        /// </summary>
        [Input("loginTimeout", json: true)]
        public Input<int>? LoginTimeout { get; set; }

        [Input("oauthAccessToken")]
        private Input<string>? _oauthAccessToken;

        /// <summary>
        /// Token for use with OAuth. Generating the token is left to other tools. Cannot be used with `browser_auth`,
        /// `private_key_path`, `oauth_refresh_token` or `password`. Can also be sourced from `SNOWFLAKE_OAUTH_ACCESS_TOKEN`
        /// environment variable.
        /// </summary>
        [Obsolete(@"Use `token` instead")]
        public Input<string>? OauthAccessToken
        {
            get => _oauthAccessToken;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _oauthAccessToken = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("oauthClientId")]
        private Input<string>? _oauthClientId;

        /// <summary>
        /// Required when `oauth_refresh_token` is used. Can also be sourced from `SNOWFLAKE_OAUTH_CLIENT_ID` environment variable.
        /// </summary>
        [Obsolete(@"Use `token_accessor.0.client_id` instead")]
        public Input<string>? OauthClientId
        {
            get => _oauthClientId;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _oauthClientId = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("oauthClientSecret")]
        private Input<string>? _oauthClientSecret;

        /// <summary>
        /// Required when `oauth_refresh_token` is used. Can also be sourced from `SNOWFLAKE_OAUTH_CLIENT_SECRET` environment
        /// variable.
        /// </summary>
        [Obsolete(@"Use `token_accessor.0.client_secret` instead")]
        public Input<string>? OauthClientSecret
        {
            get => _oauthClientSecret;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _oauthClientSecret = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("oauthEndpoint")]
        private Input<string>? _oauthEndpoint;

        /// <summary>
        /// Required when `oauth_refresh_token` is used. Can also be sourced from `SNOWFLAKE_OAUTH_ENDPOINT` environment variable.
        /// </summary>
        [Obsolete(@"Use `token_accessor.0.token_endpoint` instead")]
        public Input<string>? OauthEndpoint
        {
            get => _oauthEndpoint;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _oauthEndpoint = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("oauthRedirectUrl")]
        private Input<string>? _oauthRedirectUrl;

        /// <summary>
        /// Required when `oauth_refresh_token` is used. Can also be sourced from `SNOWFLAKE_OAUTH_REDIRECT_URL` environment
        /// variable.
        /// </summary>
        [Obsolete(@"Use `token_accessor.0.redirect_uri` instead")]
        public Input<string>? OauthRedirectUrl
        {
            get => _oauthRedirectUrl;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _oauthRedirectUrl = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("oauthRefreshToken")]
        private Input<string>? _oauthRefreshToken;

        /// <summary>
        /// Token for use with OAuth. Setup and generation of the token is left to other tools. Should be used in conjunction with
        /// `oauth_client_id`, `oauth_client_secret`, `oauth_endpoint`, `oauth_redirect_url`. Cannot be used with `browser_auth`,
        /// `private_key_path`, `oauth_access_token` or `password`. Can also be sourced from `SNOWFLAKE_OAUTH_REFRESH_TOKEN`
        /// environment variable.
        /// </summary>
        [Obsolete(@"Use `token_accessor.0.refresh_token` instead")]
        public Input<string>? OauthRefreshToken
        {
            get => _oauthRefreshToken;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _oauthRefreshToken = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// True represents OCSP fail open mode. False represents OCSP fail closed mode. Fail open true by default. Can also be
        /// sourced from the `SNOWFLAKE_OCSP_FAIL_OPEN` environment variable.
        /// </summary>
        [Input("ocspFailOpen", json: true)]
        public Input<bool>? OcspFailOpen { get; set; }

        /// <summary>
        /// The URL of the Okta server. e.g. https://example.okta.com. Can also be sourced from the `SNOWFLAKE_OKTA_URL` environment
        /// variable.
        /// </summary>
        [Input("oktaUrl")]
        public Input<string>? OktaUrl { get; set; }

        [Input("params", json: true)]
        private InputMap<string>? _params;

        /// <summary>
        /// Sets other connection (i.e. session) parameters. [Parameters](https://docs.snowflake.com/en/sql-reference/parameters)
        /// </summary>
        public InputMap<string> Params
        {
            get => _params ?? (_params = new InputMap<string>());
            set => _params = value;
        }

        /// <summary>
        /// Specifies the passcode provided by Duo when using multi-factor authentication (MFA) for login. Can also be sourced from
        /// the `SNOWFLAKE_PASSCODE` environment variable.
        /// </summary>
        [Input("passcode")]
        public Input<string>? Passcode { get; set; }

        /// <summary>
        /// False by default. Set to true if the MFA passcode is embedded in the login password. Appends the MFA passcode to the end
        /// of the password. Can also be sourced from the `SNOWFLAKE_PASSCODE_IN_PASSWORD` environment variable.
        /// </summary>
        [Input("passcodeInPassword", json: true)]
        public Input<bool>? PasscodeInPassword { get; set; }

        [Input("password")]
        private Input<string>? _password;

        /// <summary>
        /// Password for username+password auth. Cannot be used with `browser_auth` or `private_key_path`. Can also be sourced from
        /// the `SNOWFLAKE_PASSWORD` environment variable.
        /// </summary>
        public Input<string>? Password
        {
            get => _password;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _password = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Support custom port values to snowflake go driver for use with privatelink. Can also be sourced from the
        /// `SNOWFLAKE_PORT` environment variable.
        /// </summary>
        [Input("port", json: true)]
        public Input<int>? Port { get; set; }

        [Input("privateKey")]
        private Input<string>? _privateKey;

        /// <summary>
        /// Private Key for username+private-key auth. Cannot be used with `browser_auth` or `password`. Can also be sourced from
        /// `SNOWFLAKE_PRIVATE_KEY` environment variable.
        /// </summary>
        public Input<string>? PrivateKey
        {
            get => _privateKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _privateKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("privateKeyPassphrase")]
        private Input<string>? _privateKeyPassphrase;

        /// <summary>
        /// Supports the encryption ciphers aes-128-cbc, aes-128-gcm, aes-192-cbc, aes-192-gcm, aes-256-cbc, aes-256-gcm, and
        /// des-ede3-cbc. Can also be sourced from `SNOWFLAKE_PRIVATE_KEY_PASSPHRASE` environment variable.
        /// </summary>
        public Input<string>? PrivateKeyPassphrase
        {
            get => _privateKeyPassphrase;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _privateKeyPassphrase = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("privateKeyPath")]
        private Input<string>? _privateKeyPath;

        /// <summary>
        /// Path to a private key for using keypair authentication. Cannot be used with `browser_auth`, `oauth_access_token` or
        /// `password`. Can also be sourced from `SNOWFLAKE_PRIVATE_KEY_PATH` environment variable.
        /// </summary>
        [Obsolete(@"use the [file Function](https://developer.hashicorp.com/terraform/language/functions/file) instead")]
        public Input<string>? PrivateKeyPath
        {
            get => _privateKeyPath;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _privateKeyPath = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Sets the profile to read from ~/.snowflake/config file. Can also be sourced from the `SNOWFLAKE_PROFILE` environment
        /// variable.
        /// </summary>
        [Input("profile")]
        public Input<string>? Profile { get; set; }

        /// <summary>
        /// Either http or https, defaults to https. Can also be sourced from the `SNOWFLAKE_PROTOCOL` environment variable.
        /// </summary>
        [Input("protocol")]
        public Input<string>? Protocol { get; set; }

        /// <summary>
        /// Snowflake region, such as "eu-central-1", with this parameter. However, since this parameter is deprecated, it is best
        /// to specify the region as part of the account parameter. For details, see the description of the account parameter.
        /// [Snowflake region](https://docs.snowflake.com/en/user-guide/intro-regions.html) to use. Required if using the [legacy
        /// format for the `account`
        /// identifier](https://docs.snowflake.com/en/user-guide/admin-account-identifier.html#format-2-legacy-account-locator-in-a-region)
        /// in the form of `&lt;cloud_region_id&gt;.&lt;cloud&gt;`. Can also be sourced from the `SNOWFLAKE_REGION` environment variable.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// request retry timeout EXCLUDING network roundtrip and read out http response. Can also be sourced from the
        /// `SNOWFLAKE_REQUEST_TIMEOUT` environment variable.
        /// </summary>
        [Input("requestTimeout", json: true)]
        public Input<int>? RequestTimeout { get; set; }

        /// <summary>
        /// Specifies the role to use by default for accessing Snowflake objects in the client session. Can also be sourced from the
        /// `SNOWFLAKE_ROLE` environment variable. .
        /// </summary>
        [Input("role")]
        public Input<string>? Role { get; set; }

        [Input("sessionParams", json: true)]
        private InputMap<string>? _sessionParams;

        /// <summary>
        /// Sets session parameters. [Parameters](https://docs.snowflake.com/en/sql-reference/parameters)
        /// </summary>
        [Obsolete(@"Use `params` instead")]
        public InputMap<string> SessionParams
        {
            get => _sessionParams ?? (_sessionParams = new InputMap<string>());
            set => _sessionParams = value;
        }

        [Input("token")]
        private Input<string>? _token;

        /// <summary>
        /// Token to use for OAuth and other forms of token based auth. Can also be sourced from the `SNOWFLAKE_TOKEN` environment
        /// variable.
        /// </summary>
        public Input<string>? Token
        {
            get => _token;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _token = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("tokenAccessor", json: true)]
        public Input<Inputs.ProviderTokenAccessorArgs>? TokenAccessor { get; set; }

        /// <summary>
        /// Username. Can also be sourced from the `SNOWFLAKE_USER` environment variable. Required unless using `profile`.
        /// </summary>
        [Input("user")]
        public Input<string>? User { get; set; }

        /// <summary>
        /// Username for username+password authentication. Can also be sourced from the `SNOWFLAKE_USERNAME` environment variable.
        /// Required unless using `profile`.
        /// </summary>
        [Input("username")]
        public Input<string>? Username { get; set; }

        /// <summary>
        /// True by default. If false, disables the validation checks for Database, Schema, Warehouse and Role at the time a
        /// connection is established. Can also be sourced from the `SNOWFLAKE_VALIDATE_DEFAULT_PARAMETERS` environment variable.
        /// </summary>
        [Input("validateDefaultParameters", json: true)]
        public Input<bool>? ValidateDefaultParameters { get; set; }

        /// <summary>
        /// Specifies the virtual warehouse to use by default for queries, loading, etc. in the client session. Can also be sourced
        /// from the `SNOWFLAKE_WAREHOUSE` environment variable.
        /// </summary>
        [Input("warehouse")]
        public Input<string>? Warehouse { get; set; }

        public ProviderArgs()
        {
            Account = Utilities.GetEnv("SNOWFLAKE_ACCOUNT");
            BrowserAuth = Utilities.GetEnvBoolean("SNOWFLAKE_USE_BROWSER_AUTH");
            Host = Utilities.GetEnv("SNOWFLAKE_HOST");
            OauthAccessToken = Utilities.GetEnv("SNOWFLAKE_OAUTH_ACCESS_TOKEN");
            OauthClientId = Utilities.GetEnv("SNOWFLAKE_OAUTH_CLIENT_ID");
            OauthClientSecret = Utilities.GetEnv("SNOWFLAKE_OAUTH_CLIENT_SECRET");
            OauthEndpoint = Utilities.GetEnv("SNOWFLAKE_OAUTH_ENDPOINT");
            OauthRedirectUrl = Utilities.GetEnv("SNOWFLAKE_OAUTH_REDIRECT_URL");
            OauthRefreshToken = Utilities.GetEnv("SNOWFLAKE_OAUTH_REFRESH_TOKEN");
            Password = Utilities.GetEnv("SNOWFLAKE_PASSWORD");
            Port = Utilities.GetEnvInt32("SNOWFLAKE_PORT");
            PrivateKeyPassphrase = Utilities.GetEnv("SNOWFLAKE_PRIVATE_KEY_PASSPHRASE");
            PrivateKeyPath = Utilities.GetEnv("SNOWFLAKE_PRIVATE_KEY_PATH");
            Protocol = Utilities.GetEnv("SNOWFLAKE_PROTOCOL");
            Region = Utilities.GetEnv("SNOWFLAKE_REGION");
            Role = Utilities.GetEnv("SNOWFLAKE_ROLE");
            Username = Utilities.GetEnv("SNOWFLAKE_USER");
            Warehouse = Utilities.GetEnv("SNOWFLAKE_WAREHOUSE");
        }
        public static new ProviderArgs Empty => new ProviderArgs();
    }
}
