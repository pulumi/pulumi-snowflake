// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Immutable;

namespace Pulumi.Snowflake
{
    public static class Config
    {
        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Design", "IDE1006", Justification = 
        "Double underscore prefix used to avoid conflicts with variable names.")]
        private sealed class __Value<T>
        {
            private readonly Func<T> _getter;
            private T _value = default!;
            private bool _set;

            public __Value(Func<T> getter)
            {
                _getter = getter;
            }

            public T Get() => _set ? _value : _getter();

            public void Set(T value)
            {
                _value = value;
                _set = true;
            }
        }

        private static readonly Pulumi.Config __config = new Pulumi.Config("snowflake");

        private static readonly __Value<string?> _account = new __Value<string?>(() => __config.Get("account"));
        /// <summary>
        /// The name of the Snowflake account. Can also come from the `SNOWFLAKE_ACCOUNT` environment variable.
        /// </summary>
        public static string? Account
        {
            get => _account.Get();
            set => _account.Set(value);
        }

        private static readonly __Value<bool?> _browserAuth = new __Value<bool?>(() => __config.GetBoolean("browserAuth"));
        /// <summary>
        /// Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_USE_BROWSER_AUTH` environment variable.
        /// </summary>
        public static bool? BrowserAuth
        {
            get => _browserAuth.Get();
            set => _browserAuth.Set(value);
        }

        private static readonly __Value<string?> _host = new __Value<string?>(() => __config.Get("host"));
        /// <summary>
        /// Supports passing in a custom host value to the snowflake go driver for use with privatelink.
        /// </summary>
        public static string? Host
        {
            get => _host.Get();
            set => _host.Set(value);
        }

        private static readonly __Value<string?> _oauthAccessToken = new __Value<string?>(() => __config.Get("oauthAccessToken"));
        /// <summary>
        /// Token for use with OAuth. Generating the token is left to other tools. Cannot be used with `browser_auth`,
        /// `private_key_path`, `oauth_refresh_token` or `password`. Can be sourced from `SNOWFLAKE_OAUTH_ACCESS_TOKEN` environment
        /// variable.
        /// </summary>
        public static string? OauthAccessToken
        {
            get => _oauthAccessToken.Get();
            set => _oauthAccessToken.Set(value);
        }

        private static readonly __Value<string?> _oauthClientId = new __Value<string?>(() => __config.Get("oauthClientId"));
        /// <summary>
        /// Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_OAUTH_CLIENT_ID` environment variable.
        /// </summary>
        public static string? OauthClientId
        {
            get => _oauthClientId.Get();
            set => _oauthClientId.Set(value);
        }

        private static readonly __Value<string?> _oauthClientSecret = new __Value<string?>(() => __config.Get("oauthClientSecret"));
        /// <summary>
        /// Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_OAUTH_CLIENT_SECRET` environment variable.
        /// </summary>
        public static string? OauthClientSecret
        {
            get => _oauthClientSecret.Get();
            set => _oauthClientSecret.Set(value);
        }

        private static readonly __Value<string?> _oauthEndpoint = new __Value<string?>(() => __config.Get("oauthEndpoint"));
        /// <summary>
        /// Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_OAUTH_ENDPOINT` environment variable.
        /// </summary>
        public static string? OauthEndpoint
        {
            get => _oauthEndpoint.Get();
            set => _oauthEndpoint.Set(value);
        }

        private static readonly __Value<string?> _oauthRedirectUrl = new __Value<string?>(() => __config.Get("oauthRedirectUrl"));
        /// <summary>
        /// Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_OAUTH_REDIRECT_URL` environment variable.
        /// </summary>
        public static string? OauthRedirectUrl
        {
            get => _oauthRedirectUrl.Get();
            set => _oauthRedirectUrl.Set(value);
        }

        private static readonly __Value<string?> _oauthRefreshToken = new __Value<string?>(() => __config.Get("oauthRefreshToken"));
        /// <summary>
        /// Token for use with OAuth. Setup and generation of the token is left to other tools. Should be used in conjunction with
        /// `oauth_client_id`, `oauth_client_secret`, `oauth_endpoint`, `oauth_redirect_url`. Cannot be used with `browser_auth`,
        /// `private_key_path`, `oauth_access_token` or `password`. Can be sourced from `SNOWFLAKE_OAUTH_REFRESH_TOKEN` environment
        /// variable.
        /// </summary>
        public static string? OauthRefreshToken
        {
            get => _oauthRefreshToken.Get();
            set => _oauthRefreshToken.Set(value);
        }

        private static readonly __Value<string?> _password = new __Value<string?>(() => __config.Get("password"));
        /// <summary>
        /// Password for username+password auth. Cannot be used with `browser_auth` or `private_key_path`. Can be source from
        /// `SNOWFLAKE_PASSWORD` environment variable.
        /// </summary>
        public static string? Password
        {
            get => _password.Get();
            set => _password.Set(value);
        }

        private static readonly __Value<string?> _privateKey = new __Value<string?>(() => __config.Get("privateKey"));
        /// <summary>
        /// Private Key for username+private-key auth. Cannot be used with `browser_auth` or `password`. Can be source from
        /// `SNOWFLAKE_PRIVATE_KEY` environment variable.
        /// </summary>
        public static string? PrivateKey
        {
            get => _privateKey.Get();
            set => _privateKey.Set(value);
        }

        private static readonly __Value<string?> _privateKeyPassphrase = new __Value<string?>(() => __config.Get("privateKeyPassphrase"));
        /// <summary>
        /// Supports the encryption ciphers aes-128-cbc, aes-128-gcm, aes-192-cbc, aes-192-gcm, aes-256-cbc, aes-256-gcm, and
        /// des-ede3-cbc
        /// </summary>
        public static string? PrivateKeyPassphrase
        {
            get => _privateKeyPassphrase.Get();
            set => _privateKeyPassphrase.Set(value);
        }

        private static readonly __Value<string?> _privateKeyPath = new __Value<string?>(() => __config.Get("privateKeyPath"));
        /// <summary>
        /// Path to a private key for using keypair authentication. Cannot be used with `browser_auth`, `oauth_access_token` or
        /// `password`. Can be source from `SNOWFLAKE_PRIVATE_KEY_PATH` environment variable.
        /// </summary>
        public static string? PrivateKeyPath
        {
            get => _privateKeyPath.Get();
            set => _privateKeyPath.Set(value);
        }

        private static readonly __Value<string?> _region = new __Value<string?>(() => __config.Get("region"));
        /// <summary>
        /// [Snowflake region](https://docs.snowflake.com/en/user-guide/intro-regions.html) to use. Can be source from the
        /// `SNOWFLAKE_REGION` environment variable.
        /// </summary>
        public static string? Region
        {
            get => _region.Get();
            set => _region.Set(value);
        }

        private static readonly __Value<string?> _role = new __Value<string?>(() => __config.Get("role"));
        /// <summary>
        /// Snowflake role to use for operations. If left unset, default role for user will be used. Can come from the
        /// `SNOWFLAKE_ROLE` environment variable.
        /// </summary>
        public static string? Role
        {
            get => _role.Get();
            set => _role.Set(value);
        }

        private static readonly __Value<string?> _username = new __Value<string?>(() => __config.Get("username"));
        /// <summary>
        /// Username for username+password authentication. Can come from the `SNOWFLAKE_USER` environment variable.
        /// </summary>
        public static string? Username
        {
            get => _username.Get();
            set => _username.Set(value);
        }

        private static readonly __Value<string?> _warehouse = new __Value<string?>(() => __config.Get("warehouse"));
        /// <summary>
        /// Sets the default warehouse. Optional. Can be sourced from SNOWFLAKE_WAREHOUSE enviornment variable.
        /// </summary>
        public static string? Warehouse
        {
            get => _warehouse.Get();
            set => _warehouse.Set(value);
        }

    }
}
