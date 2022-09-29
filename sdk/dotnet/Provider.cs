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
        /// The name of the Snowflake account. Can also come from the `SNOWFLAKE_ACCOUNT` environment variable.
        /// </summary>
        [Output("account")]
        public Output<string> Account { get; private set; } = null!;

        /// <summary>
        /// Supports passing in a custom host value to the snowflake go driver for use with privatelink.
        /// </summary>
        [Output("host")]
        public Output<string?> Host { get; private set; } = null!;

        /// <summary>
        /// Token for use with OAuth. Generating the token is left to other tools. Cannot be used with `browser_auth`,
        /// `private_key_path`, `oauth_refresh_token` or `password`. Can be sourced from `SNOWFLAKE_OAUTH_ACCESS_TOKEN` environment
        /// variable.
        /// </summary>
        [Output("oauthAccessToken")]
        public Output<string?> OauthAccessToken { get; private set; } = null!;

        /// <summary>
        /// Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_OAUTH_CLIENT_ID` environment variable.
        /// </summary>
        [Output("oauthClientId")]
        public Output<string?> OauthClientId { get; private set; } = null!;

        /// <summary>
        /// Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_OAUTH_CLIENT_SECRET` environment variable.
        /// </summary>
        [Output("oauthClientSecret")]
        public Output<string?> OauthClientSecret { get; private set; } = null!;

        /// <summary>
        /// Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_OAUTH_ENDPOINT` environment variable.
        /// </summary>
        [Output("oauthEndpoint")]
        public Output<string?> OauthEndpoint { get; private set; } = null!;

        /// <summary>
        /// Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_OAUTH_REDIRECT_URL` environment variable.
        /// </summary>
        [Output("oauthRedirectUrl")]
        public Output<string?> OauthRedirectUrl { get; private set; } = null!;

        /// <summary>
        /// Token for use with OAuth. Setup and generation of the token is left to other tools. Should be used in conjunction with
        /// `oauth_client_id`, `oauth_client_secret`, `oauth_endpoint`, `oauth_redirect_url`. Cannot be used with `browser_auth`,
        /// `private_key_path`, `oauth_access_token` or `password`. Can be sourced from `SNOWFLAKE_OAUTH_REFRESH_TOKEN` environment
        /// variable.
        /// </summary>
        [Output("oauthRefreshToken")]
        public Output<string?> OauthRefreshToken { get; private set; } = null!;

        /// <summary>
        /// Password for username+password auth. Cannot be used with `browser_auth` or `private_key_path`. Can be source from
        /// `SNOWFLAKE_PASSWORD` environment variable.
        /// </summary>
        [Output("password")]
        public Output<string?> Password { get; private set; } = null!;

        /// <summary>
        /// Private Key for username+private-key auth. Cannot be used with `browser_auth` or `password`. Can be source from
        /// `SNOWFLAKE_PRIVATE_KEY` environment variable.
        /// </summary>
        [Output("privateKey")]
        public Output<string?> PrivateKey { get; private set; } = null!;

        /// <summary>
        /// Supports the encryption ciphers aes-128-cbc, aes-128-gcm, aes-192-cbc, aes-192-gcm, aes-256-cbc, aes-256-gcm, and
        /// des-ede3-cbc
        /// </summary>
        [Output("privateKeyPassphrase")]
        public Output<string?> PrivateKeyPassphrase { get; private set; } = null!;

        /// <summary>
        /// Path to a private key for using keypair authentication. Cannot be used with `browser_auth`, `oauth_access_token` or
        /// `password`. Can be source from `SNOWFLAKE_PRIVATE_KEY_PATH` environment variable.
        /// </summary>
        [Output("privateKeyPath")]
        public Output<string?> PrivateKeyPath { get; private set; } = null!;

        /// <summary>
        /// Support custom protocols to snowflake go driver. Can be sourced from `SNOWFLAKE_PROTOCOL` environment variable.
        /// </summary>
        [Output("protocol")]
        public Output<string?> Protocol { get; private set; } = null!;

        /// <summary>
        /// [Snowflake region](https://docs.snowflake.com/en/user-guide/intro-regions.html) to use. Can be source from the
        /// `SNOWFLAKE_REGION` environment variable.
        /// </summary>
        [Output("region")]
        public Output<string> Region { get; private set; } = null!;

        /// <summary>
        /// Snowflake role to use for operations. If left unset, default role for user will be used. Can come from the
        /// `SNOWFLAKE_ROLE` environment variable.
        /// </summary>
        [Output("role")]
        public Output<string?> Role { get; private set; } = null!;

        /// <summary>
        /// Username for username+password authentication. Can come from the `SNOWFLAKE_USER` environment variable.
        /// </summary>
        [Output("username")]
        public Output<string> Username { get; private set; } = null!;

        /// <summary>
        /// Sets the default warehouse. Optional. Can be sourced from SNOWFLAKE_WAREHOUSE environment variable.
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
        public Provider(string name, ProviderArgs args, CustomResourceOptions? options = null)
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
        /// The name of the Snowflake account. Can also come from the `SNOWFLAKE_ACCOUNT` environment variable.
        /// </summary>
        [Input("account", required: true)]
        public Input<string> Account { get; set; } = null!;

        /// <summary>
        /// Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_USE_BROWSER_AUTH` environment variable.
        /// </summary>
        [Input("browserAuth", json: true)]
        public Input<bool>? BrowserAuth { get; set; }

        /// <summary>
        /// Supports passing in a custom host value to the snowflake go driver for use with privatelink.
        /// </summary>
        [Input("host")]
        public Input<string>? Host { get; set; }

        [Input("oauthAccessToken")]
        private Input<string>? _oauthAccessToken;

        /// <summary>
        /// Token for use with OAuth. Generating the token is left to other tools. Cannot be used with `browser_auth`,
        /// `private_key_path`, `oauth_refresh_token` or `password`. Can be sourced from `SNOWFLAKE_OAUTH_ACCESS_TOKEN` environment
        /// variable.
        /// </summary>
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
        /// Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_OAUTH_CLIENT_ID` environment variable.
        /// </summary>
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
        /// Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_OAUTH_CLIENT_SECRET` environment variable.
        /// </summary>
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
        /// Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_OAUTH_ENDPOINT` environment variable.
        /// </summary>
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
        /// Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_OAUTH_REDIRECT_URL` environment variable.
        /// </summary>
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
        /// `private_key_path`, `oauth_access_token` or `password`. Can be sourced from `SNOWFLAKE_OAUTH_REFRESH_TOKEN` environment
        /// variable.
        /// </summary>
        public Input<string>? OauthRefreshToken
        {
            get => _oauthRefreshToken;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _oauthRefreshToken = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("password")]
        private Input<string>? _password;

        /// <summary>
        /// Password for username+password auth. Cannot be used with `browser_auth` or `private_key_path`. Can be source from
        /// `SNOWFLAKE_PASSWORD` environment variable.
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
        /// Support custom port values to snowflake go driver for use with privatelink. Can be sourced from `SNOWFLAKE_PORT`
        /// environment variable.
        /// </summary>
        [Input("port", json: true)]
        public Input<int>? Port { get; set; }

        [Input("privateKey")]
        private Input<string>? _privateKey;

        /// <summary>
        /// Private Key for username+private-key auth. Cannot be used with `browser_auth` or `password`. Can be source from
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
        /// des-ede3-cbc
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
        /// `password`. Can be source from `SNOWFLAKE_PRIVATE_KEY_PATH` environment variable.
        /// </summary>
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
        /// Support custom protocols to snowflake go driver. Can be sourced from `SNOWFLAKE_PROTOCOL` environment variable.
        /// </summary>
        [Input("protocol")]
        public Input<string>? Protocol { get; set; }

        /// <summary>
        /// [Snowflake region](https://docs.snowflake.com/en/user-guide/intro-regions.html) to use. Can be source from the
        /// `SNOWFLAKE_REGION` environment variable.
        /// </summary>
        [Input("region", required: true)]
        public Input<string> Region { get; set; } = null!;

        /// <summary>
        /// Snowflake role to use for operations. If left unset, default role for user will be used. Can come from the
        /// `SNOWFLAKE_ROLE` environment variable.
        /// </summary>
        [Input("role")]
        public Input<string>? Role { get; set; }

        /// <summary>
        /// Username for username+password authentication. Can come from the `SNOWFLAKE_USER` environment variable.
        /// </summary>
        [Input("username", required: true)]
        public Input<string> Username { get; set; } = null!;

        /// <summary>
        /// Sets the default warehouse. Optional. Can be sourced from SNOWFLAKE_WAREHOUSE environment variable.
        /// </summary>
        [Input("warehouse")]
        public Input<string>? Warehouse { get; set; }

        public ProviderArgs()
        {
        }
        public static new ProviderArgs Empty => new ProviderArgs();
    }
}
