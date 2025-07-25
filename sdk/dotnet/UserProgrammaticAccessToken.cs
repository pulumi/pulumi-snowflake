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
    /// $ pulumi import snowflake:index/userProgrammaticAccessToken:UserProgrammaticAccessToken example '"&lt;user_name&gt;"|"&lt;token_name&gt;"'
    /// ```
    /// </summary>
    [SnowflakeResourceType("snowflake:index/userProgrammaticAccessToken:UserProgrammaticAccessToken")]
    public partial class UserProgrammaticAccessToken : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Descriptive comment about the programmatic access token.
        /// </summary>
        [Output("comment")]
        public Output<string?> Comment { get; private set; } = null!;

        [Output("daysToExpiry")]
        public Output<int?> DaysToExpiry { get; private set; } = null!;

        /// <summary>
        /// (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`default`)) Disables or enables the programmatic access token. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
        /// </summary>
        [Output("disabled")]
        public Output<string?> Disabled { get; private set; } = null!;

        /// <summary>
        /// (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`-1`)) This field is only used when the token is rotated by changing the `keeper` field. Sets the expiration time of the existing token secret to expire after the specified number of hours. You can set this to a value of 0 to expire the current token secret immediately.
        /// </summary>
        [Output("expireRotatedTokenAfterHours")]
        public Output<int?> ExpireRotatedTokenAfterHours { get; private set; } = null!;

        /// <summary>
        /// Arbitrary string that, if and only if, changed from a non-empty to a different non-empty value (or known after apply), will trigger a key to be rotated. When you add this field to the configuration, or remove it from the configuration, the rotation is not triggered. When the token is rotated, the `token` and `rotated_token_name` fields are marked as computed.
        /// </summary>
        [Output("keeper")]
        public Output<string?> Keeper { get; private set; } = null!;

        [Output("minsToBypassNetworkPolicyRequirement")]
        public Output<int?> MinsToBypassNetworkPolicyRequirement { get; private set; } = null!;

        /// <summary>
        /// Specifies the name for the programmatic access token; must be unique for the user. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The name of the role used for privilege evaluation and object creation. This must be one of the roles that has already been granted to the user. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        /// </summary>
        [Output("roleRestriction")]
        public Output<string?> RoleRestriction { get; private set; } = null!;

        /// <summary>
        /// Name of the token that represents the prior secret. This field is updated only when the token is rotated. In this case, the field is marked as computed.
        /// </summary>
        [Output("rotatedTokenName")]
        public Output<string> RotatedTokenName { get; private set; } = null!;

        /// <summary>
        /// Outputs the result of `SHOW USER PROGRAMMATIC ACCESS TOKENS` for the given user programmatic access token.
        /// </summary>
        [Output("showOutputs")]
        public Output<ImmutableArray<Outputs.UserProgrammaticAccessTokenShowOutput>> ShowOutputs { get; private set; } = null!;

        /// <summary>
        /// The token itself. Use this to authenticate to an endpoint. The data in this field is updated only when the token is created or rotated. In this case, the field is marked as computed.
        /// </summary>
        [Output("token")]
        public Output<string> Token { get; private set; } = null!;

        /// <summary>
        /// The name of the user that the token is associated with. A user cannot use another user's programmatic access token to authenticate. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        /// </summary>
        [Output("user")]
        public Output<string> User { get; private set; } = null!;


        /// <summary>
        /// Create a UserProgrammaticAccessToken resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public UserProgrammaticAccessToken(string name, UserProgrammaticAccessTokenArgs args, CustomResourceOptions? options = null)
            : base("snowflake:index/userProgrammaticAccessToken:UserProgrammaticAccessToken", name, args ?? new UserProgrammaticAccessTokenArgs(), MakeResourceOptions(options, ""))
        {
        }

        private UserProgrammaticAccessToken(string name, Input<string> id, UserProgrammaticAccessTokenState? state = null, CustomResourceOptions? options = null)
            : base("snowflake:index/userProgrammaticAccessToken:UserProgrammaticAccessToken", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "token",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing UserProgrammaticAccessToken resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static UserProgrammaticAccessToken Get(string name, Input<string> id, UserProgrammaticAccessTokenState? state = null, CustomResourceOptions? options = null)
        {
            return new UserProgrammaticAccessToken(name, id, state, options);
        }
    }

    public sealed class UserProgrammaticAccessTokenArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Descriptive comment about the programmatic access token.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        [Input("daysToExpiry")]
        public Input<int>? DaysToExpiry { get; set; }

        /// <summary>
        /// (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`default`)) Disables or enables the programmatic access token. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
        /// </summary>
        [Input("disabled")]
        public Input<string>? Disabled { get; set; }

        /// <summary>
        /// (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`-1`)) This field is only used when the token is rotated by changing the `keeper` field. Sets the expiration time of the existing token secret to expire after the specified number of hours. You can set this to a value of 0 to expire the current token secret immediately.
        /// </summary>
        [Input("expireRotatedTokenAfterHours")]
        public Input<int>? ExpireRotatedTokenAfterHours { get; set; }

        /// <summary>
        /// Arbitrary string that, if and only if, changed from a non-empty to a different non-empty value (or known after apply), will trigger a key to be rotated. When you add this field to the configuration, or remove it from the configuration, the rotation is not triggered. When the token is rotated, the `token` and `rotated_token_name` fields are marked as computed.
        /// </summary>
        [Input("keeper")]
        public Input<string>? Keeper { get; set; }

        [Input("minsToBypassNetworkPolicyRequirement")]
        public Input<int>? MinsToBypassNetworkPolicyRequirement { get; set; }

        /// <summary>
        /// Specifies the name for the programmatic access token; must be unique for the user. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The name of the role used for privilege evaluation and object creation. This must be one of the roles that has already been granted to the user. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        /// </summary>
        [Input("roleRestriction")]
        public Input<string>? RoleRestriction { get; set; }

        /// <summary>
        /// The name of the user that the token is associated with. A user cannot use another user's programmatic access token to authenticate. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        /// </summary>
        [Input("user", required: true)]
        public Input<string> User { get; set; } = null!;

        public UserProgrammaticAccessTokenArgs()
        {
        }
        public static new UserProgrammaticAccessTokenArgs Empty => new UserProgrammaticAccessTokenArgs();
    }

    public sealed class UserProgrammaticAccessTokenState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Descriptive comment about the programmatic access token.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        [Input("daysToExpiry")]
        public Input<int>? DaysToExpiry { get; set; }

        /// <summary>
        /// (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`default`)) Disables or enables the programmatic access token. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
        /// </summary>
        [Input("disabled")]
        public Input<string>? Disabled { get; set; }

        /// <summary>
        /// (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`-1`)) This field is only used when the token is rotated by changing the `keeper` field. Sets the expiration time of the existing token secret to expire after the specified number of hours. You can set this to a value of 0 to expire the current token secret immediately.
        /// </summary>
        [Input("expireRotatedTokenAfterHours")]
        public Input<int>? ExpireRotatedTokenAfterHours { get; set; }

        /// <summary>
        /// Arbitrary string that, if and only if, changed from a non-empty to a different non-empty value (or known after apply), will trigger a key to be rotated. When you add this field to the configuration, or remove it from the configuration, the rotation is not triggered. When the token is rotated, the `token` and `rotated_token_name` fields are marked as computed.
        /// </summary>
        [Input("keeper")]
        public Input<string>? Keeper { get; set; }

        [Input("minsToBypassNetworkPolicyRequirement")]
        public Input<int>? MinsToBypassNetworkPolicyRequirement { get; set; }

        /// <summary>
        /// Specifies the name for the programmatic access token; must be unique for the user. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The name of the role used for privilege evaluation and object creation. This must be one of the roles that has already been granted to the user. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        /// </summary>
        [Input("roleRestriction")]
        public Input<string>? RoleRestriction { get; set; }

        /// <summary>
        /// Name of the token that represents the prior secret. This field is updated only when the token is rotated. In this case, the field is marked as computed.
        /// </summary>
        [Input("rotatedTokenName")]
        public Input<string>? RotatedTokenName { get; set; }

        [Input("showOutputs")]
        private InputList<Inputs.UserProgrammaticAccessTokenShowOutputGetArgs>? _showOutputs;

        /// <summary>
        /// Outputs the result of `SHOW USER PROGRAMMATIC ACCESS TOKENS` for the given user programmatic access token.
        /// </summary>
        public InputList<Inputs.UserProgrammaticAccessTokenShowOutputGetArgs> ShowOutputs
        {
            get => _showOutputs ?? (_showOutputs = new InputList<Inputs.UserProgrammaticAccessTokenShowOutputGetArgs>());
            set => _showOutputs = value;
        }

        [Input("token")]
        private Input<string>? _token;

        /// <summary>
        /// The token itself. Use this to authenticate to an endpoint. The data in this field is updated only when the token is created or rotated. In this case, the field is marked as computed.
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

        /// <summary>
        /// The name of the user that the token is associated with. A user cannot use another user's programmatic access token to authenticate. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        /// </summary>
        [Input("user")]
        public Input<string>? User { get; set; }

        public UserProgrammaticAccessTokenState()
        {
        }
        public static new UserProgrammaticAccessTokenState Empty => new UserProgrammaticAccessTokenState();
    }
}
