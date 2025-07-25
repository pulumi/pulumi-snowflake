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
    /// $ pulumi import snowflake:index/secretWithAuthorizationCodeGrant:SecretWithAuthorizationCodeGrant example '"&lt;database_name&gt;"."&lt;schema_name&gt;"."&lt;secret_name&gt;"'
    /// ```
    /// </summary>
    [SnowflakeResourceType("snowflake:index/secretWithAuthorizationCodeGrant:SecretWithAuthorizationCodeGrant")]
    public partial class SecretWithAuthorizationCodeGrant : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Specifies the name value of the Snowflake security integration that connects Snowflake to an external service. For more information about this resource, see docs.
        /// </summary>
        [Output("apiAuthentication")]
        public Output<string> ApiAuthentication { get; private set; } = null!;

        /// <summary>
        /// Specifies a comment for the secret.
        /// </summary>
        [Output("comment")]
        public Output<string?> Comment { get; private set; } = null!;

        /// <summary>
        /// The database in which to create the secret Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        /// </summary>
        [Output("database")]
        public Output<string> Database { get; private set; } = null!;

        /// <summary>
        /// Outputs the result of `DESCRIBE SECRET` for the given secret.
        /// </summary>
        [Output("describeOutputs")]
        public Output<ImmutableArray<Outputs.SecretWithAuthorizationCodeGrantDescribeOutput>> DescribeOutputs { get; private set; } = null!;

        /// <summary>
        /// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        /// </summary>
        [Output("fullyQualifiedName")]
        public Output<string> FullyQualifiedName { get; private set; } = null!;

        /// <summary>
        /// String that specifies the identifier (i.e. name) for the secret, must be unique in your schema. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        [Output("oauthRefreshToken")]
        public Output<string> OauthRefreshToken { get; private set; } = null!;

        /// <summary>
        /// Specifies the timestamp as a string when the OAuth refresh token expires. Accepted string formats: YYYY-MM-DD, YYYY-MM-DD HH:MI, YYYY-MM-DD HH:MI:SS, YYYY-MM-DD HH:MI \n\n
        /// </summary>
        [Output("oauthRefreshTokenExpiryTime")]
        public Output<string> OauthRefreshTokenExpiryTime { get; private set; } = null!;

        /// <summary>
        /// The schema in which to create the secret. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        /// </summary>
        [Output("schema")]
        public Output<string> Schema { get; private set; } = null!;

        /// <summary>
        /// Specifies a type for the secret. This field is used for checking external changes and recreating the resources if needed.
        /// </summary>
        [Output("secretType")]
        public Output<string> SecretType { get; private set; } = null!;

        /// <summary>
        /// Outputs the result of `SHOW SECRETS` for the given secret.
        /// </summary>
        [Output("showOutputs")]
        public Output<ImmutableArray<Outputs.SecretWithAuthorizationCodeGrantShowOutput>> ShowOutputs { get; private set; } = null!;


        /// <summary>
        /// Create a SecretWithAuthorizationCodeGrant resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SecretWithAuthorizationCodeGrant(string name, SecretWithAuthorizationCodeGrantArgs args, CustomResourceOptions? options = null)
            : base("snowflake:index/secretWithAuthorizationCodeGrant:SecretWithAuthorizationCodeGrant", name, args ?? new SecretWithAuthorizationCodeGrantArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SecretWithAuthorizationCodeGrant(string name, Input<string> id, SecretWithAuthorizationCodeGrantState? state = null, CustomResourceOptions? options = null)
            : base("snowflake:index/secretWithAuthorizationCodeGrant:SecretWithAuthorizationCodeGrant", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "oauthRefreshToken",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing SecretWithAuthorizationCodeGrant resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SecretWithAuthorizationCodeGrant Get(string name, Input<string> id, SecretWithAuthorizationCodeGrantState? state = null, CustomResourceOptions? options = null)
        {
            return new SecretWithAuthorizationCodeGrant(name, id, state, options);
        }
    }

    public sealed class SecretWithAuthorizationCodeGrantArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the name value of the Snowflake security integration that connects Snowflake to an external service. For more information about this resource, see docs.
        /// </summary>
        [Input("apiAuthentication", required: true)]
        public Input<string> ApiAuthentication { get; set; } = null!;

        /// <summary>
        /// Specifies a comment for the secret.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// The database in which to create the secret Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        /// </summary>
        [Input("database", required: true)]
        public Input<string> Database { get; set; } = null!;

        /// <summary>
        /// String that specifies the identifier (i.e. name) for the secret, must be unique in your schema. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("oauthRefreshToken", required: true)]
        private Input<string>? _oauthRefreshToken;
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
        /// Specifies the timestamp as a string when the OAuth refresh token expires. Accepted string formats: YYYY-MM-DD, YYYY-MM-DD HH:MI, YYYY-MM-DD HH:MI:SS, YYYY-MM-DD HH:MI \n\n
        /// </summary>
        [Input("oauthRefreshTokenExpiryTime", required: true)]
        public Input<string> OauthRefreshTokenExpiryTime { get; set; } = null!;

        /// <summary>
        /// The schema in which to create the secret. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        /// </summary>
        [Input("schema", required: true)]
        public Input<string> Schema { get; set; } = null!;

        public SecretWithAuthorizationCodeGrantArgs()
        {
        }
        public static new SecretWithAuthorizationCodeGrantArgs Empty => new SecretWithAuthorizationCodeGrantArgs();
    }

    public sealed class SecretWithAuthorizationCodeGrantState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the name value of the Snowflake security integration that connects Snowflake to an external service. For more information about this resource, see docs.
        /// </summary>
        [Input("apiAuthentication")]
        public Input<string>? ApiAuthentication { get; set; }

        /// <summary>
        /// Specifies a comment for the secret.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// The database in which to create the secret Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        /// </summary>
        [Input("database")]
        public Input<string>? Database { get; set; }

        [Input("describeOutputs")]
        private InputList<Inputs.SecretWithAuthorizationCodeGrantDescribeOutputGetArgs>? _describeOutputs;

        /// <summary>
        /// Outputs the result of `DESCRIBE SECRET` for the given secret.
        /// </summary>
        public InputList<Inputs.SecretWithAuthorizationCodeGrantDescribeOutputGetArgs> DescribeOutputs
        {
            get => _describeOutputs ?? (_describeOutputs = new InputList<Inputs.SecretWithAuthorizationCodeGrantDescribeOutputGetArgs>());
            set => _describeOutputs = value;
        }

        /// <summary>
        /// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        /// </summary>
        [Input("fullyQualifiedName")]
        public Input<string>? FullyQualifiedName { get; set; }

        /// <summary>
        /// String that specifies the identifier (i.e. name) for the secret, must be unique in your schema. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("oauthRefreshToken")]
        private Input<string>? _oauthRefreshToken;
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
        /// Specifies the timestamp as a string when the OAuth refresh token expires. Accepted string formats: YYYY-MM-DD, YYYY-MM-DD HH:MI, YYYY-MM-DD HH:MI:SS, YYYY-MM-DD HH:MI \n\n
        /// </summary>
        [Input("oauthRefreshTokenExpiryTime")]
        public Input<string>? OauthRefreshTokenExpiryTime { get; set; }

        /// <summary>
        /// The schema in which to create the secret. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        /// </summary>
        [Input("schema")]
        public Input<string>? Schema { get; set; }

        /// <summary>
        /// Specifies a type for the secret. This field is used for checking external changes and recreating the resources if needed.
        /// </summary>
        [Input("secretType")]
        public Input<string>? SecretType { get; set; }

        [Input("showOutputs")]
        private InputList<Inputs.SecretWithAuthorizationCodeGrantShowOutputGetArgs>? _showOutputs;

        /// <summary>
        /// Outputs the result of `SHOW SECRETS` for the given secret.
        /// </summary>
        public InputList<Inputs.SecretWithAuthorizationCodeGrantShowOutputGetArgs> ShowOutputs
        {
            get => _showOutputs ?? (_showOutputs = new InputList<Inputs.SecretWithAuthorizationCodeGrantShowOutputGetArgs>());
            set => _showOutputs = value;
        }

        public SecretWithAuthorizationCodeGrantState()
        {
        }
        public static new SecretWithAuthorizationCodeGrantState Empty => new SecretWithAuthorizationCodeGrantState();
    }
}
