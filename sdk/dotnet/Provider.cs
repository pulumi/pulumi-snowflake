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
        /// Specifies your Snowflake account name assigned by Snowflake. For information about account identifiers, see the
        /// [Snowflake documentation](https://docs.snowflake.com/en/user-guide/admin-account-identifier#account-name). Required
        /// unless using `profile`. Can also be sourced from the `SNOWFLAKE_ACCOUNT_NAME` environment variable.
        /// </summary>
        [Output("accountName")]
        public Output<string?> AccountName { get; private set; } = null!;

        /// <summary>
        /// Specifies the [authentication type](https://pkg.go.dev/github.com/snowflakedb/gosnowflake#AuthType) to use when
        /// connecting to Snowflake. Valid options are: `SNOWFLAKE` | `OAUTH` | `EXTERNALBROWSER` | `OKTA` | `SNOWFLAKE_JWT` |
        /// `TOKENACCESSOR` | `USERNAMEPASSWORDMFA`. Can also be sourced from the `SNOWFLAKE_AUTHENTICATOR` environment variable.
        /// </summary>
        [Output("authenticator")]
        public Output<string?> Authenticator { get; private set; } = null!;

        /// <summary>
        /// IP address for network checks. Can also be sourced from the `SNOWFLAKE_CLIENT_IP` environment variable.
        /// </summary>
        [Output("clientIp")]
        public Output<string?> ClientIp { get; private set; } = null!;

        /// <summary>
        /// When true the MFA token is cached in the credential manager. True by default in Windows/OSX. False for Linux. Can also
        /// be sourced from the `SNOWFLAKE_CLIENT_REQUEST_MFA_TOKEN` environment variable.
        /// </summary>
        [Output("clientRequestMfaToken")]
        public Output<string?> ClientRequestMfaToken { get; private set; } = null!;

        /// <summary>
        /// When true the ID token is cached in the credential manager. True by default in Windows/OSX. False for Linux. Can also be
        /// sourced from the `SNOWFLAKE_CLIENT_STORE_TEMPORARY_CREDENTIAL` environment variable.
        /// </summary>
        [Output("clientStoreTemporaryCredential")]
        public Output<string?> ClientStoreTemporaryCredential { get; private set; } = null!;

        /// <summary>
        /// Indicates whether console login should be disabled in the driver. Can also be sourced from the
        /// `SNOWFLAKE_DISABLE_CONSOLE_LOGIN` environment variable.
        /// </summary>
        [Output("disableConsoleLogin")]
        public Output<string?> DisableConsoleLogin { get; private set; } = null!;

        /// <summary>
        /// Specifies the logging level to be used by the driver. Valid options are: `trace` | `debug` | `info` | `print` |
        /// `warning` | `error` | `fatal` | `panic`. Can also be sourced from the `SNOWFLAKE_DRIVER_TRACING` environment variable.
        /// </summary>
        [Output("driverTracing")]
        public Output<string?> DriverTracing { get; private set; } = null!;

        /// <summary>
        /// Specifies a custom host value used by the driver for privatelink connections. Can also be sourced from the
        /// `SNOWFLAKE_HOST` environment variable.
        /// </summary>
        [Output("host")]
        public Output<string?> Host { get; private set; } = null!;

        /// <summary>
        /// Should retried request contain retry reason. Can also be sourced from the `SNOWFLAKE_INCLUDE_RETRY_REASON` environment
        /// variable.
        /// </summary>
        [Output("includeRetryReason")]
        public Output<string?> IncludeRetryReason { get; private set; } = null!;

        /// <summary>
        /// True represents OCSP fail open mode. False represents OCSP fail closed mode. Fail open true by default. Can also be
        /// sourced from the `SNOWFLAKE_OCSP_FAIL_OPEN` environment variable.
        /// </summary>
        [Output("ocspFailOpen")]
        public Output<string?> OcspFailOpen { get; private set; } = null!;

        /// <summary>
        /// The URL of the Okta server. e.g. https://example.okta.com. Okta URL host needs to to have a suffix `okta.com`. Read more
        /// in Snowflake [docs](https://docs.snowflake.com/en/user-guide/oauth-okta). Can also be sourced from the
        /// `SNOWFLAKE_OKTA_URL` environment variable.
        /// </summary>
        [Output("oktaUrl")]
        public Output<string?> OktaUrl { get; private set; } = null!;

        /// <summary>
        /// Specifies your Snowflake organization name assigned by Snowflake. For information about account identifiers, see the
        /// [Snowflake documentation](https://docs.snowflake.com/en/user-guide/admin-account-identifier#organization-name). Required
        /// unless using `profile`. Can also be sourced from the `SNOWFLAKE_ORGANIZATION_NAME` environment variable.
        /// </summary>
        [Output("organizationName")]
        public Output<string?> OrganizationName { get; private set; } = null!;

        /// <summary>
        /// Specifies the passcode provided by Duo when using multi-factor authentication (MFA) for login. Can also be sourced from
        /// the `SNOWFLAKE_PASSCODE` environment variable.
        /// </summary>
        [Output("passcode")]
        public Output<string?> Passcode { get; private set; } = null!;

        /// <summary>
        /// Password for user + password auth. Cannot be used with `private_key` and `private_key_passphrase`. Can also be sourced
        /// from the `SNOWFLAKE_PASSWORD` environment variable.
        /// </summary>
        [Output("password")]
        public Output<string?> Password { get; private set; } = null!;

        /// <summary>
        /// Private Key for username+private-key auth. Cannot be used with `password`. Can also be sourced from the
        /// `SNOWFLAKE_PRIVATE_KEY` environment variable.
        /// </summary>
        [Output("privateKey")]
        public Output<string?> PrivateKey { get; private set; } = null!;

        /// <summary>
        /// Supports the encryption ciphers aes-128-cbc, aes-128-gcm, aes-192-cbc, aes-192-gcm, aes-256-cbc, aes-256-gcm, and
        /// des-ede3-cbc. Can also be sourced from the `SNOWFLAKE_PRIVATE_KEY_PASSPHRASE` environment variable.
        /// </summary>
        [Output("privateKeyPassphrase")]
        public Output<string?> PrivateKeyPassphrase { get; private set; } = null!;

        /// <summary>
        /// Sets the profile to read from ~/.snowflake/config file. Can also be sourced from the `SNOWFLAKE_PROFILE` environment
        /// variable.
        /// </summary>
        [Output("profile")]
        public Output<string?> Profile { get; private set; } = null!;

        /// <summary>
        /// A protocol used in the connection. Valid options are: `http` | `https`. Can also be sourced from the
        /// `SNOWFLAKE_PROTOCOL` environment variable.
        /// </summary>
        [Output("protocol")]
        public Output<string?> Protocol { get; private set; } = null!;

        /// <summary>
        /// Specifies the role to use by default for accessing Snowflake objects in the client session. Can also be sourced from the
        /// `SNOWFLAKE_ROLE` environment variable.
        /// </summary>
        [Output("role")]
        public Output<string?> Role { get; private set; } = null!;

        /// <summary>
        /// Sets temporary directory used by the driver for operations like encrypting, compressing etc. Can also be sourced from
        /// the `SNOWFLAKE_TMP_DIRECTORY_PATH` environment variable.
        /// </summary>
        [Output("tmpDirectoryPath")]
        public Output<string?> TmpDirectoryPath { get; private set; } = null!;

        /// <summary>
        /// Token to use for OAuth and other forms of token based auth. Can also be sourced from the `SNOWFLAKE_TOKEN` environment
        /// variable.
        /// </summary>
        [Output("token")]
        public Output<string?> Token { get; private set; } = null!;

        /// <summary>
        /// Username. Required unless using `profile`. Can also be sourced from the `SNOWFLAKE_USER` environment variable.
        /// </summary>
        [Output("user")]
        public Output<string?> User { get; private set; } = null!;

        /// <summary>
        /// True by default. If false, disables the validation checks for Database, Schema, Warehouse and Role at the time a
        /// connection is established. Can also be sourced from the `SNOWFLAKE_VALIDATE_DEFAULT_PARAMETERS` environment variable.
        /// </summary>
        [Output("validateDefaultParameters")]
        public Output<string?> ValidateDefaultParameters { get; private set; } = null!;

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
                    "password",
                    "privateKey",
                    "privateKeyPassphrase",
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
        /// Specifies your Snowflake account name assigned by Snowflake. For information about account identifiers, see the
        /// [Snowflake documentation](https://docs.snowflake.com/en/user-guide/admin-account-identifier#account-name). Required
        /// unless using `profile`. Can also be sourced from the `SNOWFLAKE_ACCOUNT_NAME` environment variable.
        /// </summary>
        [Input("accountName")]
        public Input<string>? AccountName { get; set; }

        /// <summary>
        /// Specifies the [authentication type](https://pkg.go.dev/github.com/snowflakedb/gosnowflake#AuthType) to use when
        /// connecting to Snowflake. Valid options are: `SNOWFLAKE` | `OAUTH` | `EXTERNALBROWSER` | `OKTA` | `SNOWFLAKE_JWT` |
        /// `TOKENACCESSOR` | `USERNAMEPASSWORDMFA`. Can also be sourced from the `SNOWFLAKE_AUTHENTICATOR` environment variable.
        /// </summary>
        [Input("authenticator")]
        public Input<string>? Authenticator { get; set; }

        /// <summary>
        /// IP address for network checks. Can also be sourced from the `SNOWFLAKE_CLIENT_IP` environment variable.
        /// </summary>
        [Input("clientIp")]
        public Input<string>? ClientIp { get; set; }

        /// <summary>
        /// When true the MFA token is cached in the credential manager. True by default in Windows/OSX. False for Linux. Can also
        /// be sourced from the `SNOWFLAKE_CLIENT_REQUEST_MFA_TOKEN` environment variable.
        /// </summary>
        [Input("clientRequestMfaToken")]
        public Input<string>? ClientRequestMfaToken { get; set; }

        /// <summary>
        /// When true the ID token is cached in the credential manager. True by default in Windows/OSX. False for Linux. Can also be
        /// sourced from the `SNOWFLAKE_CLIENT_STORE_TEMPORARY_CREDENTIAL` environment variable.
        /// </summary>
        [Input("clientStoreTemporaryCredential")]
        public Input<string>? ClientStoreTemporaryCredential { get; set; }

        /// <summary>
        /// The timeout in seconds for the client to complete the authentication. Can also be sourced from the
        /// `SNOWFLAKE_CLIENT_TIMEOUT` environment variable.
        /// </summary>
        [Input("clientTimeout", json: true)]
        public Input<int>? ClientTimeout { get; set; }

        /// <summary>
        /// Indicates whether console login should be disabled in the driver. Can also be sourced from the
        /// `SNOWFLAKE_DISABLE_CONSOLE_LOGIN` environment variable.
        /// </summary>
        [Input("disableConsoleLogin")]
        public Input<string>? DisableConsoleLogin { get; set; }

        /// <summary>
        /// Disables HTAP query context cache in the driver. Can also be sourced from the `SNOWFLAKE_DISABLE_QUERY_CONTEXT_CACHE`
        /// environment variable.
        /// </summary>
        [Input("disableQueryContextCache", json: true)]
        public Input<bool>? DisableQueryContextCache { get; set; }

        /// <summary>
        /// Disables telemetry in the driver. Can also be sourced from the `DISABLE_TELEMETRY` environment variable.
        /// </summary>
        [Input("disableTelemetry", json: true)]
        public Input<bool>? DisableTelemetry { get; set; }

        /// <summary>
        /// Specifies the logging level to be used by the driver. Valid options are: `trace` | `debug` | `info` | `print` |
        /// `warning` | `error` | `fatal` | `panic`. Can also be sourced from the `SNOWFLAKE_DRIVER_TRACING` environment variable.
        /// </summary>
        [Input("driverTracing")]
        public Input<string>? DriverTracing { get; set; }

        /// <summary>
        /// The timeout in seconds for the external browser to complete the authentication. Can also be sourced from the
        /// `SNOWFLAKE_EXTERNAL_BROWSER_TIMEOUT` environment variable.
        /// </summary>
        [Input("externalBrowserTimeout", json: true)]
        public Input<int>? ExternalBrowserTimeout { get; set; }

        /// <summary>
        /// Specifies a custom host value used by the driver for privatelink connections. Can also be sourced from the
        /// `SNOWFLAKE_HOST` environment variable.
        /// </summary>
        [Input("host")]
        public Input<string>? Host { get; set; }

        /// <summary>
        /// Should retried request contain retry reason. Can also be sourced from the `SNOWFLAKE_INCLUDE_RETRY_REASON` environment
        /// variable.
        /// </summary>
        [Input("includeRetryReason")]
        public Input<string>? IncludeRetryReason { get; set; }

        /// <summary>
        /// If true, bypass the Online Certificate Status Protocol (OCSP) certificate revocation check. IMPORTANT: Change the
        /// default value for testing or emergency situations only. Can also be sourced from the `SNOWFLAKE_INSECURE_MODE`
        /// environment variable.
        /// </summary>
        [Input("insecureMode", json: true)]
        public Input<bool>? InsecureMode { get; set; }

        /// <summary>
        /// The timeout in seconds for the JWT client to complete the authentication. Can also be sourced from the
        /// `SNOWFLAKE_JWT_CLIENT_TIMEOUT` environment variable.
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
        /// Login retry timeout in seconds EXCLUDING network roundtrip and read out http response. Can also be sourced from the
        /// `SNOWFLAKE_LOGIN_TIMEOUT` environment variable.
        /// </summary>
        [Input("loginTimeout", json: true)]
        public Input<int>? LoginTimeout { get; set; }

        /// <summary>
        /// Specifies how many times non-periodic HTTP request can be retried by the driver. Can also be sourced from the
        /// `SNOWFLAKE_MAX_RETRY_COUNT` environment variable.
        /// </summary>
        [Input("maxRetryCount", json: true)]
        public Input<int>? MaxRetryCount { get; set; }

        /// <summary>
        /// True represents OCSP fail open mode. False represents OCSP fail closed mode. Fail open true by default. Can also be
        /// sourced from the `SNOWFLAKE_OCSP_FAIL_OPEN` environment variable.
        /// </summary>
        [Input("ocspFailOpen")]
        public Input<string>? OcspFailOpen { get; set; }

        /// <summary>
        /// The URL of the Okta server. e.g. https://example.okta.com. Okta URL host needs to to have a suffix `okta.com`. Read more
        /// in Snowflake [docs](https://docs.snowflake.com/en/user-guide/oauth-okta). Can also be sourced from the
        /// `SNOWFLAKE_OKTA_URL` environment variable.
        /// </summary>
        [Input("oktaUrl")]
        public Input<string>? OktaUrl { get; set; }

        /// <summary>
        /// Specifies your Snowflake organization name assigned by Snowflake. For information about account identifiers, see the
        /// [Snowflake documentation](https://docs.snowflake.com/en/user-guide/admin-account-identifier#organization-name). Required
        /// unless using `profile`. Can also be sourced from the `SNOWFLAKE_ORGANIZATION_NAME` environment variable.
        /// </summary>
        [Input("organizationName")]
        public Input<string>? OrganizationName { get; set; }

        [Input("params", json: true)]
        private InputMap<string>? _params;

        /// <summary>
        /// Sets other connection (i.e. session) parameters. [Parameters](https://docs.snowflake.com/en/sql-reference/parameters).
        /// This field can not be set with environmental variables.
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
        /// False by default. Set to true if the MFA passcode is embedded to the configured password. Can also be sourced from the
        /// `SNOWFLAKE_PASSCODE_IN_PASSWORD` environment variable.
        /// </summary>
        [Input("passcodeInPassword", json: true)]
        public Input<bool>? PasscodeInPassword { get; set; }

        [Input("password")]
        private Input<string>? _password;

        /// <summary>
        /// Password for user + password auth. Cannot be used with `private_key` and `private_key_passphrase`. Can also be sourced
        /// from the `SNOWFLAKE_PASSWORD` environment variable.
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
        /// Specifies a custom port value used by the driver for privatelink connections. Can also be sourced from the
        /// `SNOWFLAKE_PORT` environment variable.
        /// </summary>
        [Input("port", json: true)]
        public Input<int>? Port { get; set; }

        [Input("previewFeaturesEnableds", json: true)]
        private InputList<string>? _previewFeaturesEnableds;
        public InputList<string> PreviewFeaturesEnableds
        {
            get => _previewFeaturesEnableds ?? (_previewFeaturesEnableds = new InputList<string>());
            set => _previewFeaturesEnableds = value;
        }

        [Input("privateKey")]
        private Input<string>? _privateKey;

        /// <summary>
        /// Private Key for username+private-key auth. Cannot be used with `password`. Can also be sourced from the
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
        /// des-ede3-cbc. Can also be sourced from the `SNOWFLAKE_PRIVATE_KEY_PASSPHRASE` environment variable.
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

        /// <summary>
        /// Sets the profile to read from ~/.snowflake/config file. Can also be sourced from the `SNOWFLAKE_PROFILE` environment
        /// variable.
        /// </summary>
        [Input("profile")]
        public Input<string>? Profile { get; set; }

        /// <summary>
        /// A protocol used in the connection. Valid options are: `http` | `https`. Can also be sourced from the
        /// `SNOWFLAKE_PROTOCOL` environment variable.
        /// </summary>
        [Input("protocol")]
        public Input<string>? Protocol { get; set; }

        /// <summary>
        /// request retry timeout in seconds EXCLUDING network roundtrip and read out http response. Can also be sourced from the
        /// `SNOWFLAKE_REQUEST_TIMEOUT` environment variable.
        /// </summary>
        [Input("requestTimeout", json: true)]
        public Input<int>? RequestTimeout { get; set; }

        /// <summary>
        /// Specifies the role to use by default for accessing Snowflake objects in the client session. Can also be sourced from the
        /// `SNOWFLAKE_ROLE` environment variable.
        /// </summary>
        [Input("role")]
        public Input<string>? Role { get; set; }

        /// <summary>
        /// Sets temporary directory used by the driver for operations like encrypting, compressing etc. Can also be sourced from
        /// the `SNOWFLAKE_TMP_DIRECTORY_PATH` environment variable.
        /// </summary>
        [Input("tmpDirectoryPath")]
        public Input<string>? TmpDirectoryPath { get; set; }

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
        /// Username. Required unless using `profile`. Can also be sourced from the `SNOWFLAKE_USER` environment variable.
        /// </summary>
        [Input("user")]
        public Input<string>? User { get; set; }

        /// <summary>
        /// True by default. If false, disables the validation checks for Database, Schema, Warehouse and Role at the time a
        /// connection is established. Can also be sourced from the `SNOWFLAKE_VALIDATE_DEFAULT_PARAMETERS` environment variable.
        /// </summary>
        [Input("validateDefaultParameters")]
        public Input<string>? ValidateDefaultParameters { get; set; }

        /// <summary>
        /// Specifies the virtual warehouse to use by default for queries, loading, etc. in the client session. Can also be sourced
        /// from the `SNOWFLAKE_WAREHOUSE` environment variable.
        /// </summary>
        [Input("warehouse")]
        public Input<string>? Warehouse { get; set; }

        public ProviderArgs()
        {
            Host = Utilities.GetEnv("SNOWFLAKE_HOST");
            Password = Utilities.GetEnv("SNOWFLAKE_PASSWORD");
            Port = Utilities.GetEnvInt32("SNOWFLAKE_PORT");
            PrivateKeyPassphrase = Utilities.GetEnv("SNOWFLAKE_PRIVATE_KEY_PASSPHRASE");
            Protocol = Utilities.GetEnv("SNOWFLAKE_PROTOCOL");
            Role = Utilities.GetEnv("SNOWFLAKE_ROLE");
            Warehouse = Utilities.GetEnv("SNOWFLAKE_WAREHOUSE");
        }
        public static new ProviderArgs Empty => new ProviderArgs();
    }
}
