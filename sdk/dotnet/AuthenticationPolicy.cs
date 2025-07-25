// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake
{
    /// <summary>
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import snowflake:index/authenticationPolicy:AuthenticationPolicy example '"&lt;database_name&gt;"."&lt;schema_name&gt;"."&lt;authentication_policy_name&gt;"'
    /// ```
    /// </summary>
    [SnowflakeResourceType("snowflake:index/authenticationPolicy:AuthenticationPolicy")]
    public partial class AuthenticationPolicy : global::Pulumi.CustomResource
    {
        /// <summary>
        /// A list of authentication methods that are allowed during login. This parameter accepts one or more of the following values: `ALL` | `SAML` | `PASSWORD` | `OAUTH` | `KEYPAIR`
        /// </summary>
        [Output("authenticationMethods")]
        public Output<ImmutableArray<string>> AuthenticationMethods { get; private set; } = null!;

        /// <summary>
        /// A list of clients that can authenticate with Snowflake. If a client tries to connect, and the client is not one of the valid CLIENT*TYPES, then the login attempt fails. Allowed values are `ALL` | `SNOWFLAKE_UI` | `DRIVERS` | `SNOWSQL`. The CLIENT*TYPES property of an authentication policy is a best effort method to block user logins based on specific clients. It should not be used as the sole control to establish a security boundary.
        /// </summary>
        [Output("clientTypes")]
        public Output<ImmutableArray<string>> ClientTypes { get; private set; } = null!;

        /// <summary>
        /// Specifies a comment for the authentication policy.
        /// </summary>
        [Output("comment")]
        public Output<string?> Comment { get; private set; } = null!;

        /// <summary>
        /// The database in which to create the authentication policy. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        /// </summary>
        [Output("database")]
        public Output<string> Database { get; private set; } = null!;

        /// <summary>
        /// Outputs the result of `DESCRIBE AUTHENTICATION POLICY` for the given policy.
        /// </summary>
        [Output("describeOutputs")]
        public Output<ImmutableArray<Outputs.AuthenticationPolicyDescribeOutput>> DescribeOutputs { get; private set; } = null!;

        /// <summary>
        /// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        /// </summary>
        [Output("fullyQualifiedName")]
        public Output<string> FullyQualifiedName { get; private set; } = null!;

        /// <summary>
        /// A list of authentication methods that enforce multi-factor authentication (MFA) during login. Authentication methods not listed in this parameter do not prompt for multi-factor authentication. Allowed values are `ALL` | `SAML` | `PASSWORD`.
        /// </summary>
        [Output("mfaAuthenticationMethods")]
        public Output<ImmutableArray<string>> MfaAuthenticationMethods { get; private set; } = null!;

        /// <summary>
        /// (Default: `OPTIONAL`) Determines whether a user must enroll in multi-factor authentication. Allowed values are REQUIRED and OPTIONAL. When REQUIRED is specified, Enforces users to enroll in MFA. If this value is used, then the CLIENT*TYPES parameter must include SNOWFLAKE*UI, because Snowsight is the only place users can enroll in multi-factor authentication (MFA).
        /// </summary>
        [Output("mfaEnrollment")]
        public Output<string?> MfaEnrollment { get; private set; } = null!;

        /// <summary>
        /// Specifies the identifier for the authentication policy. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The schema in which to create the authentication policy. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        /// </summary>
        [Output("schema")]
        public Output<string> Schema { get; private set; } = null!;

        /// <summary>
        /// A list of security integrations the authentication policy is associated with. This parameter has no effect when SAML or OAUTH are not in the AUTHENTICATION*METHODS list. All values in the SECURITY*INTEGRATIONS list must be compatible with the values in the AUTHENTICATION*METHODS list. For example, if SECURITY*INTEGRATIONS contains a SAML security integration, and AUTHENTICATION_METHODS contains OAUTH, then you cannot create the authentication policy. To allow all security integrations use ALL as parameter.
        /// </summary>
        [Output("securityIntegrations")]
        public Output<ImmutableArray<string>> SecurityIntegrations { get; private set; } = null!;

        /// <summary>
        /// Outputs the result of `SHOW AUTHENTICATION POLICIES` for the given policy.
        /// </summary>
        [Output("showOutputs")]
        public Output<ImmutableArray<Outputs.AuthenticationPolicyShowOutput>> ShowOutputs { get; private set; } = null!;


        /// <summary>
        /// Create a AuthenticationPolicy resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AuthenticationPolicy(string name, AuthenticationPolicyArgs args, CustomResourceOptions? options = null)
            : base("snowflake:index/authenticationPolicy:AuthenticationPolicy", name, args ?? new AuthenticationPolicyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AuthenticationPolicy(string name, Input<string> id, AuthenticationPolicyState? state = null, CustomResourceOptions? options = null)
            : base("snowflake:index/authenticationPolicy:AuthenticationPolicy", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing AuthenticationPolicy resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AuthenticationPolicy Get(string name, Input<string> id, AuthenticationPolicyState? state = null, CustomResourceOptions? options = null)
        {
            return new AuthenticationPolicy(name, id, state, options);
        }
    }

    public sealed class AuthenticationPolicyArgs : global::Pulumi.ResourceArgs
    {
        [Input("authenticationMethods")]
        private InputList<string>? _authenticationMethods;

        /// <summary>
        /// A list of authentication methods that are allowed during login. This parameter accepts one or more of the following values: `ALL` | `SAML` | `PASSWORD` | `OAUTH` | `KEYPAIR`
        /// </summary>
        public InputList<string> AuthenticationMethods
        {
            get => _authenticationMethods ?? (_authenticationMethods = new InputList<string>());
            set => _authenticationMethods = value;
        }

        [Input("clientTypes")]
        private InputList<string>? _clientTypes;

        /// <summary>
        /// A list of clients that can authenticate with Snowflake. If a client tries to connect, and the client is not one of the valid CLIENT*TYPES, then the login attempt fails. Allowed values are `ALL` | `SNOWFLAKE_UI` | `DRIVERS` | `SNOWSQL`. The CLIENT*TYPES property of an authentication policy is a best effort method to block user logins based on specific clients. It should not be used as the sole control to establish a security boundary.
        /// </summary>
        public InputList<string> ClientTypes
        {
            get => _clientTypes ?? (_clientTypes = new InputList<string>());
            set => _clientTypes = value;
        }

        /// <summary>
        /// Specifies a comment for the authentication policy.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// The database in which to create the authentication policy. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        /// </summary>
        [Input("database", required: true)]
        public Input<string> Database { get; set; } = null!;

        [Input("mfaAuthenticationMethods")]
        private InputList<string>? _mfaAuthenticationMethods;

        /// <summary>
        /// A list of authentication methods that enforce multi-factor authentication (MFA) during login. Authentication methods not listed in this parameter do not prompt for multi-factor authentication. Allowed values are `ALL` | `SAML` | `PASSWORD`.
        /// </summary>
        public InputList<string> MfaAuthenticationMethods
        {
            get => _mfaAuthenticationMethods ?? (_mfaAuthenticationMethods = new InputList<string>());
            set => _mfaAuthenticationMethods = value;
        }

        /// <summary>
        /// (Default: `OPTIONAL`) Determines whether a user must enroll in multi-factor authentication. Allowed values are REQUIRED and OPTIONAL. When REQUIRED is specified, Enforces users to enroll in MFA. If this value is used, then the CLIENT*TYPES parameter must include SNOWFLAKE*UI, because Snowsight is the only place users can enroll in multi-factor authentication (MFA).
        /// </summary>
        [Input("mfaEnrollment")]
        public Input<string>? MfaEnrollment { get; set; }

        /// <summary>
        /// Specifies the identifier for the authentication policy. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The schema in which to create the authentication policy. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        /// </summary>
        [Input("schema", required: true)]
        public Input<string> Schema { get; set; } = null!;

        [Input("securityIntegrations")]
        private InputList<string>? _securityIntegrations;

        /// <summary>
        /// A list of security integrations the authentication policy is associated with. This parameter has no effect when SAML or OAUTH are not in the AUTHENTICATION*METHODS list. All values in the SECURITY*INTEGRATIONS list must be compatible with the values in the AUTHENTICATION*METHODS list. For example, if SECURITY*INTEGRATIONS contains a SAML security integration, and AUTHENTICATION_METHODS contains OAUTH, then you cannot create the authentication policy. To allow all security integrations use ALL as parameter.
        /// </summary>
        public InputList<string> SecurityIntegrations
        {
            get => _securityIntegrations ?? (_securityIntegrations = new InputList<string>());
            set => _securityIntegrations = value;
        }

        public AuthenticationPolicyArgs()
        {
        }
        public static new AuthenticationPolicyArgs Empty => new AuthenticationPolicyArgs();
    }

    public sealed class AuthenticationPolicyState : global::Pulumi.ResourceArgs
    {
        [Input("authenticationMethods")]
        private InputList<string>? _authenticationMethods;

        /// <summary>
        /// A list of authentication methods that are allowed during login. This parameter accepts one or more of the following values: `ALL` | `SAML` | `PASSWORD` | `OAUTH` | `KEYPAIR`
        /// </summary>
        public InputList<string> AuthenticationMethods
        {
            get => _authenticationMethods ?? (_authenticationMethods = new InputList<string>());
            set => _authenticationMethods = value;
        }

        [Input("clientTypes")]
        private InputList<string>? _clientTypes;

        /// <summary>
        /// A list of clients that can authenticate with Snowflake. If a client tries to connect, and the client is not one of the valid CLIENT*TYPES, then the login attempt fails. Allowed values are `ALL` | `SNOWFLAKE_UI` | `DRIVERS` | `SNOWSQL`. The CLIENT*TYPES property of an authentication policy is a best effort method to block user logins based on specific clients. It should not be used as the sole control to establish a security boundary.
        /// </summary>
        public InputList<string> ClientTypes
        {
            get => _clientTypes ?? (_clientTypes = new InputList<string>());
            set => _clientTypes = value;
        }

        /// <summary>
        /// Specifies a comment for the authentication policy.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// The database in which to create the authentication policy. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        /// </summary>
        [Input("database")]
        public Input<string>? Database { get; set; }

        [Input("describeOutputs")]
        private InputList<Inputs.AuthenticationPolicyDescribeOutputGetArgs>? _describeOutputs;

        /// <summary>
        /// Outputs the result of `DESCRIBE AUTHENTICATION POLICY` for the given policy.
        /// </summary>
        public InputList<Inputs.AuthenticationPolicyDescribeOutputGetArgs> DescribeOutputs
        {
            get => _describeOutputs ?? (_describeOutputs = new InputList<Inputs.AuthenticationPolicyDescribeOutputGetArgs>());
            set => _describeOutputs = value;
        }

        /// <summary>
        /// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        /// </summary>
        [Input("fullyQualifiedName")]
        public Input<string>? FullyQualifiedName { get; set; }

        [Input("mfaAuthenticationMethods")]
        private InputList<string>? _mfaAuthenticationMethods;

        /// <summary>
        /// A list of authentication methods that enforce multi-factor authentication (MFA) during login. Authentication methods not listed in this parameter do not prompt for multi-factor authentication. Allowed values are `ALL` | `SAML` | `PASSWORD`.
        /// </summary>
        public InputList<string> MfaAuthenticationMethods
        {
            get => _mfaAuthenticationMethods ?? (_mfaAuthenticationMethods = new InputList<string>());
            set => _mfaAuthenticationMethods = value;
        }

        /// <summary>
        /// (Default: `OPTIONAL`) Determines whether a user must enroll in multi-factor authentication. Allowed values are REQUIRED and OPTIONAL. When REQUIRED is specified, Enforces users to enroll in MFA. If this value is used, then the CLIENT*TYPES parameter must include SNOWFLAKE*UI, because Snowsight is the only place users can enroll in multi-factor authentication (MFA).
        /// </summary>
        [Input("mfaEnrollment")]
        public Input<string>? MfaEnrollment { get; set; }

        /// <summary>
        /// Specifies the identifier for the authentication policy. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The schema in which to create the authentication policy. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        /// </summary>
        [Input("schema")]
        public Input<string>? Schema { get; set; }

        [Input("securityIntegrations")]
        private InputList<string>? _securityIntegrations;

        /// <summary>
        /// A list of security integrations the authentication policy is associated with. This parameter has no effect when SAML or OAUTH are not in the AUTHENTICATION*METHODS list. All values in the SECURITY*INTEGRATIONS list must be compatible with the values in the AUTHENTICATION*METHODS list. For example, if SECURITY*INTEGRATIONS contains a SAML security integration, and AUTHENTICATION_METHODS contains OAUTH, then you cannot create the authentication policy. To allow all security integrations use ALL as parameter.
        /// </summary>
        public InputList<string> SecurityIntegrations
        {
            get => _securityIntegrations ?? (_securityIntegrations = new InputList<string>());
            set => _securityIntegrations = value;
        }

        [Input("showOutputs")]
        private InputList<Inputs.AuthenticationPolicyShowOutputGetArgs>? _showOutputs;

        /// <summary>
        /// Outputs the result of `SHOW AUTHENTICATION POLICIES` for the given policy.
        /// </summary>
        public InputList<Inputs.AuthenticationPolicyShowOutputGetArgs> ShowOutputs
        {
            get => _showOutputs ?? (_showOutputs = new InputList<Inputs.AuthenticationPolicyShowOutputGetArgs>());
            set => _showOutputs = value;
        }

        public AuthenticationPolicyState()
        {
        }
        public static new AuthenticationPolicyState Empty => new AuthenticationPolicyState();
    }
}
