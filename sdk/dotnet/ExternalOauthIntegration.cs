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
    /// $ pulumi import snowflake:index/externalOauthIntegration:ExternalOauthIntegration example '"&lt;integration_name&gt;"'
    /// ```
    /// </summary>
    [SnowflakeResourceType("snowflake:index/externalOauthIntegration:ExternalOauthIntegration")]
    public partial class ExternalOauthIntegration : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Specifies a comment for the OAuth integration.
        /// </summary>
        [Output("comment")]
        public Output<string?> Comment { get; private set; } = null!;

        /// <summary>
        /// Outputs the result of `DESCRIBE SECURITY INTEGRATIONS` for the given security integration.
        /// </summary>
        [Output("describeOutputs")]
        public Output<ImmutableArray<Outputs.ExternalOauthIntegrationDescribeOutput>> DescribeOutputs { get; private set; } = null!;

        /// <summary>
        /// Specifies whether to initiate operation of the integration or suspend it.
        /// </summary>
        [Output("enabled")]
        public Output<bool> Enabled { get; private set; } = null!;

        /// <summary>
        /// Specifies the list of roles that the client can set as the primary role. For more information about this resource, see docs.
        /// </summary>
        [Output("externalOauthAllowedRolesLists")]
        public Output<ImmutableArray<string>> ExternalOauthAllowedRolesLists { get; private set; } = null!;

        /// <summary>
        /// Specifies whether the OAuth client or user can use a role that is not defined in the OAuth access token. Valid values are (case-insensitive): `DISABLE` | `ENABLE` | `ENABLE_FOR_PRIVILEGE`.
        /// </summary>
        [Output("externalOauthAnyRoleMode")]
        public Output<string?> ExternalOauthAnyRoleMode { get; private set; } = null!;

        /// <summary>
        /// Specifies additional values that can be used for the access token's audience validation on top of using the Customer's Snowflake Account URL
        /// </summary>
        [Output("externalOauthAudienceLists")]
        public Output<ImmutableArray<string>> ExternalOauthAudienceLists { get; private set; } = null!;

        /// <summary>
        /// Specifies the list of roles that a client cannot set as the primary role. By default, this list includes the ACCOUNTADMIN, ORGADMIN and SECURITYADMIN roles. To remove these privileged roles from the list, use the ALTER ACCOUNT command to set the EXTERNAL*OAUTH*ADD*PRIVILEGED*ROLES*TO*BLOCKED*LIST account parameter to FALSE. For more information about this resource, see docs.
        /// </summary>
        [Output("externalOauthBlockedRolesLists")]
        public Output<ImmutableArray<string>> ExternalOauthBlockedRolesLists { get; private set; } = null!;

        /// <summary>
        /// Specifies the URL to define the OAuth 2.0 authorization server.
        /// </summary>
        [Output("externalOauthIssuer")]
        public Output<string> ExternalOauthIssuer { get; private set; } = null!;

        /// <summary>
        /// Specifies the endpoint or a list of endpoints from which to download public keys or certificates to validate an External OAuth access token. The maximum number of URLs that can be specified in the list is 3. If removed from the config, the resource is recreated.
        /// </summary>
        [Output("externalOauthJwsKeysUrls")]
        public Output<ImmutableArray<string>> ExternalOauthJwsKeysUrls { get; private set; } = null!;

        /// <summary>
        /// Specifies a Base64-encoded RSA public key, without the -----BEGIN PUBLIC KEY----- and -----END PUBLIC KEY----- headers. If removed from the config, the resource is recreated.
        /// </summary>
        [Output("externalOauthRsaPublicKey")]
        public Output<string?> ExternalOauthRsaPublicKey { get; private set; } = null!;

        /// <summary>
        /// Specifies a second RSA public key, without the -----BEGIN PUBLIC KEY----- and -----END PUBLIC KEY----- headers. Used for key rotation. If removed from the config, the resource is recreated.
        /// </summary>
        [Output("externalOauthRsaPublicKey2")]
        public Output<string?> ExternalOauthRsaPublicKey2 { get; private set; } = null!;

        /// <summary>
        /// Specifies the scope delimiter in the authorization token.
        /// </summary>
        [Output("externalOauthScopeDelimiter")]
        public Output<string?> ExternalOauthScopeDelimiter { get; private set; } = null!;

        /// <summary>
        /// Specifies the access token claim to map the access token to an account role. If removed from the config, the resource is recreated.
        /// </summary>
        [Output("externalOauthScopeMappingAttribute")]
        public Output<string?> ExternalOauthScopeMappingAttribute { get; private set; } = null!;

        /// <summary>
        /// Indicates which Snowflake user record attribute should be used to map the access token to a Snowflake user record. Valid values are (case-insensitive): `LOGIN_NAME` | `EMAIL_ADDRESS`.
        /// </summary>
        [Output("externalOauthSnowflakeUserMappingAttribute")]
        public Output<string> ExternalOauthSnowflakeUserMappingAttribute { get; private set; } = null!;

        /// <summary>
        /// Specifies the access token claim or claims that can be used to map the access token to a Snowflake user record. If removed from the config, the resource is recreated.
        /// </summary>
        [Output("externalOauthTokenUserMappingClaims")]
        public Output<ImmutableArray<string>> ExternalOauthTokenUserMappingClaims { get; private set; } = null!;

        /// <summary>
        /// Specifies the OAuth 2.0 authorization server to be Okta, Microsoft Azure AD, Ping Identity PingFederate, or a Custom OAuth 2.0 authorization server. Valid values are (case-insensitive): `OKTA` | `AZURE` | `PING_FEDERATE` | `CUSTOM`.
        /// </summary>
        [Output("externalOauthType")]
        public Output<string> ExternalOauthType { get; private set; } = null!;

        /// <summary>
        /// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        /// </summary>
        [Output("fullyQualifiedName")]
        public Output<string> FullyQualifiedName { get; private set; } = null!;

        /// <summary>
        /// Specifies the name of the External Oath integration. This name follows the rules for Object Identifiers. The name should be unique among security integrations in your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Parameters related to this security integration.
        /// </summary>
        [Output("relatedParameters")]
        public Output<ImmutableArray<Outputs.ExternalOauthIntegrationRelatedParameter>> RelatedParameters { get; private set; } = null!;

        /// <summary>
        /// Outputs the result of `SHOW SECURITY INTEGRATIONS` for the given security integration.
        /// </summary>
        [Output("showOutputs")]
        public Output<ImmutableArray<Outputs.ExternalOauthIntegrationShowOutput>> ShowOutputs { get; private set; } = null!;


        /// <summary>
        /// Create a ExternalOauthIntegration resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ExternalOauthIntegration(string name, ExternalOauthIntegrationArgs args, CustomResourceOptions? options = null)
            : base("snowflake:index/externalOauthIntegration:ExternalOauthIntegration", name, args ?? new ExternalOauthIntegrationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ExternalOauthIntegration(string name, Input<string> id, ExternalOauthIntegrationState? state = null, CustomResourceOptions? options = null)
            : base("snowflake:index/externalOauthIntegration:ExternalOauthIntegration", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ExternalOauthIntegration resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ExternalOauthIntegration Get(string name, Input<string> id, ExternalOauthIntegrationState? state = null, CustomResourceOptions? options = null)
        {
            return new ExternalOauthIntegration(name, id, state, options);
        }
    }

    public sealed class ExternalOauthIntegrationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies a comment for the OAuth integration.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// Specifies whether to initiate operation of the integration or suspend it.
        /// </summary>
        [Input("enabled", required: true)]
        public Input<bool> Enabled { get; set; } = null!;

        [Input("externalOauthAllowedRolesLists")]
        private InputList<string>? _externalOauthAllowedRolesLists;

        /// <summary>
        /// Specifies the list of roles that the client can set as the primary role. For more information about this resource, see docs.
        /// </summary>
        public InputList<string> ExternalOauthAllowedRolesLists
        {
            get => _externalOauthAllowedRolesLists ?? (_externalOauthAllowedRolesLists = new InputList<string>());
            set => _externalOauthAllowedRolesLists = value;
        }

        /// <summary>
        /// Specifies whether the OAuth client or user can use a role that is not defined in the OAuth access token. Valid values are (case-insensitive): `DISABLE` | `ENABLE` | `ENABLE_FOR_PRIVILEGE`.
        /// </summary>
        [Input("externalOauthAnyRoleMode")]
        public Input<string>? ExternalOauthAnyRoleMode { get; set; }

        [Input("externalOauthAudienceLists")]
        private InputList<string>? _externalOauthAudienceLists;

        /// <summary>
        /// Specifies additional values that can be used for the access token's audience validation on top of using the Customer's Snowflake Account URL
        /// </summary>
        public InputList<string> ExternalOauthAudienceLists
        {
            get => _externalOauthAudienceLists ?? (_externalOauthAudienceLists = new InputList<string>());
            set => _externalOauthAudienceLists = value;
        }

        [Input("externalOauthBlockedRolesLists")]
        private InputList<string>? _externalOauthBlockedRolesLists;

        /// <summary>
        /// Specifies the list of roles that a client cannot set as the primary role. By default, this list includes the ACCOUNTADMIN, ORGADMIN and SECURITYADMIN roles. To remove these privileged roles from the list, use the ALTER ACCOUNT command to set the EXTERNAL*OAUTH*ADD*PRIVILEGED*ROLES*TO*BLOCKED*LIST account parameter to FALSE. For more information about this resource, see docs.
        /// </summary>
        public InputList<string> ExternalOauthBlockedRolesLists
        {
            get => _externalOauthBlockedRolesLists ?? (_externalOauthBlockedRolesLists = new InputList<string>());
            set => _externalOauthBlockedRolesLists = value;
        }

        /// <summary>
        /// Specifies the URL to define the OAuth 2.0 authorization server.
        /// </summary>
        [Input("externalOauthIssuer", required: true)]
        public Input<string> ExternalOauthIssuer { get; set; } = null!;

        [Input("externalOauthJwsKeysUrls")]
        private InputList<string>? _externalOauthJwsKeysUrls;

        /// <summary>
        /// Specifies the endpoint or a list of endpoints from which to download public keys or certificates to validate an External OAuth access token. The maximum number of URLs that can be specified in the list is 3. If removed from the config, the resource is recreated.
        /// </summary>
        public InputList<string> ExternalOauthJwsKeysUrls
        {
            get => _externalOauthJwsKeysUrls ?? (_externalOauthJwsKeysUrls = new InputList<string>());
            set => _externalOauthJwsKeysUrls = value;
        }

        /// <summary>
        /// Specifies a Base64-encoded RSA public key, without the -----BEGIN PUBLIC KEY----- and -----END PUBLIC KEY----- headers. If removed from the config, the resource is recreated.
        /// </summary>
        [Input("externalOauthRsaPublicKey")]
        public Input<string>? ExternalOauthRsaPublicKey { get; set; }

        /// <summary>
        /// Specifies a second RSA public key, without the -----BEGIN PUBLIC KEY----- and -----END PUBLIC KEY----- headers. Used for key rotation. If removed from the config, the resource is recreated.
        /// </summary>
        [Input("externalOauthRsaPublicKey2")]
        public Input<string>? ExternalOauthRsaPublicKey2 { get; set; }

        /// <summary>
        /// Specifies the scope delimiter in the authorization token.
        /// </summary>
        [Input("externalOauthScopeDelimiter")]
        public Input<string>? ExternalOauthScopeDelimiter { get; set; }

        /// <summary>
        /// Specifies the access token claim to map the access token to an account role. If removed from the config, the resource is recreated.
        /// </summary>
        [Input("externalOauthScopeMappingAttribute")]
        public Input<string>? ExternalOauthScopeMappingAttribute { get; set; }

        /// <summary>
        /// Indicates which Snowflake user record attribute should be used to map the access token to a Snowflake user record. Valid values are (case-insensitive): `LOGIN_NAME` | `EMAIL_ADDRESS`.
        /// </summary>
        [Input("externalOauthSnowflakeUserMappingAttribute", required: true)]
        public Input<string> ExternalOauthSnowflakeUserMappingAttribute { get; set; } = null!;

        [Input("externalOauthTokenUserMappingClaims", required: true)]
        private InputList<string>? _externalOauthTokenUserMappingClaims;

        /// <summary>
        /// Specifies the access token claim or claims that can be used to map the access token to a Snowflake user record. If removed from the config, the resource is recreated.
        /// </summary>
        public InputList<string> ExternalOauthTokenUserMappingClaims
        {
            get => _externalOauthTokenUserMappingClaims ?? (_externalOauthTokenUserMappingClaims = new InputList<string>());
            set => _externalOauthTokenUserMappingClaims = value;
        }

        /// <summary>
        /// Specifies the OAuth 2.0 authorization server to be Okta, Microsoft Azure AD, Ping Identity PingFederate, or a Custom OAuth 2.0 authorization server. Valid values are (case-insensitive): `OKTA` | `AZURE` | `PING_FEDERATE` | `CUSTOM`.
        /// </summary>
        [Input("externalOauthType", required: true)]
        public Input<string> ExternalOauthType { get; set; } = null!;

        /// <summary>
        /// Specifies the name of the External Oath integration. This name follows the rules for Object Identifiers. The name should be unique among security integrations in your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public ExternalOauthIntegrationArgs()
        {
        }
        public static new ExternalOauthIntegrationArgs Empty => new ExternalOauthIntegrationArgs();
    }

    public sealed class ExternalOauthIntegrationState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies a comment for the OAuth integration.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        [Input("describeOutputs")]
        private InputList<Inputs.ExternalOauthIntegrationDescribeOutputGetArgs>? _describeOutputs;

        /// <summary>
        /// Outputs the result of `DESCRIBE SECURITY INTEGRATIONS` for the given security integration.
        /// </summary>
        public InputList<Inputs.ExternalOauthIntegrationDescribeOutputGetArgs> DescribeOutputs
        {
            get => _describeOutputs ?? (_describeOutputs = new InputList<Inputs.ExternalOauthIntegrationDescribeOutputGetArgs>());
            set => _describeOutputs = value;
        }

        /// <summary>
        /// Specifies whether to initiate operation of the integration or suspend it.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("externalOauthAllowedRolesLists")]
        private InputList<string>? _externalOauthAllowedRolesLists;

        /// <summary>
        /// Specifies the list of roles that the client can set as the primary role. For more information about this resource, see docs.
        /// </summary>
        public InputList<string> ExternalOauthAllowedRolesLists
        {
            get => _externalOauthAllowedRolesLists ?? (_externalOauthAllowedRolesLists = new InputList<string>());
            set => _externalOauthAllowedRolesLists = value;
        }

        /// <summary>
        /// Specifies whether the OAuth client or user can use a role that is not defined in the OAuth access token. Valid values are (case-insensitive): `DISABLE` | `ENABLE` | `ENABLE_FOR_PRIVILEGE`.
        /// </summary>
        [Input("externalOauthAnyRoleMode")]
        public Input<string>? ExternalOauthAnyRoleMode { get; set; }

        [Input("externalOauthAudienceLists")]
        private InputList<string>? _externalOauthAudienceLists;

        /// <summary>
        /// Specifies additional values that can be used for the access token's audience validation on top of using the Customer's Snowflake Account URL
        /// </summary>
        public InputList<string> ExternalOauthAudienceLists
        {
            get => _externalOauthAudienceLists ?? (_externalOauthAudienceLists = new InputList<string>());
            set => _externalOauthAudienceLists = value;
        }

        [Input("externalOauthBlockedRolesLists")]
        private InputList<string>? _externalOauthBlockedRolesLists;

        /// <summary>
        /// Specifies the list of roles that a client cannot set as the primary role. By default, this list includes the ACCOUNTADMIN, ORGADMIN and SECURITYADMIN roles. To remove these privileged roles from the list, use the ALTER ACCOUNT command to set the EXTERNAL*OAUTH*ADD*PRIVILEGED*ROLES*TO*BLOCKED*LIST account parameter to FALSE. For more information about this resource, see docs.
        /// </summary>
        public InputList<string> ExternalOauthBlockedRolesLists
        {
            get => _externalOauthBlockedRolesLists ?? (_externalOauthBlockedRolesLists = new InputList<string>());
            set => _externalOauthBlockedRolesLists = value;
        }

        /// <summary>
        /// Specifies the URL to define the OAuth 2.0 authorization server.
        /// </summary>
        [Input("externalOauthIssuer")]
        public Input<string>? ExternalOauthIssuer { get; set; }

        [Input("externalOauthJwsKeysUrls")]
        private InputList<string>? _externalOauthJwsKeysUrls;

        /// <summary>
        /// Specifies the endpoint or a list of endpoints from which to download public keys or certificates to validate an External OAuth access token. The maximum number of URLs that can be specified in the list is 3. If removed from the config, the resource is recreated.
        /// </summary>
        public InputList<string> ExternalOauthJwsKeysUrls
        {
            get => _externalOauthJwsKeysUrls ?? (_externalOauthJwsKeysUrls = new InputList<string>());
            set => _externalOauthJwsKeysUrls = value;
        }

        /// <summary>
        /// Specifies a Base64-encoded RSA public key, without the -----BEGIN PUBLIC KEY----- and -----END PUBLIC KEY----- headers. If removed from the config, the resource is recreated.
        /// </summary>
        [Input("externalOauthRsaPublicKey")]
        public Input<string>? ExternalOauthRsaPublicKey { get; set; }

        /// <summary>
        /// Specifies a second RSA public key, without the -----BEGIN PUBLIC KEY----- and -----END PUBLIC KEY----- headers. Used for key rotation. If removed from the config, the resource is recreated.
        /// </summary>
        [Input("externalOauthRsaPublicKey2")]
        public Input<string>? ExternalOauthRsaPublicKey2 { get; set; }

        /// <summary>
        /// Specifies the scope delimiter in the authorization token.
        /// </summary>
        [Input("externalOauthScopeDelimiter")]
        public Input<string>? ExternalOauthScopeDelimiter { get; set; }

        /// <summary>
        /// Specifies the access token claim to map the access token to an account role. If removed from the config, the resource is recreated.
        /// </summary>
        [Input("externalOauthScopeMappingAttribute")]
        public Input<string>? ExternalOauthScopeMappingAttribute { get; set; }

        /// <summary>
        /// Indicates which Snowflake user record attribute should be used to map the access token to a Snowflake user record. Valid values are (case-insensitive): `LOGIN_NAME` | `EMAIL_ADDRESS`.
        /// </summary>
        [Input("externalOauthSnowflakeUserMappingAttribute")]
        public Input<string>? ExternalOauthSnowflakeUserMappingAttribute { get; set; }

        [Input("externalOauthTokenUserMappingClaims")]
        private InputList<string>? _externalOauthTokenUserMappingClaims;

        /// <summary>
        /// Specifies the access token claim or claims that can be used to map the access token to a Snowflake user record. If removed from the config, the resource is recreated.
        /// </summary>
        public InputList<string> ExternalOauthTokenUserMappingClaims
        {
            get => _externalOauthTokenUserMappingClaims ?? (_externalOauthTokenUserMappingClaims = new InputList<string>());
            set => _externalOauthTokenUserMappingClaims = value;
        }

        /// <summary>
        /// Specifies the OAuth 2.0 authorization server to be Okta, Microsoft Azure AD, Ping Identity PingFederate, or a Custom OAuth 2.0 authorization server. Valid values are (case-insensitive): `OKTA` | `AZURE` | `PING_FEDERATE` | `CUSTOM`.
        /// </summary>
        [Input("externalOauthType")]
        public Input<string>? ExternalOauthType { get; set; }

        /// <summary>
        /// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        /// </summary>
        [Input("fullyQualifiedName")]
        public Input<string>? FullyQualifiedName { get; set; }

        /// <summary>
        /// Specifies the name of the External Oath integration. This name follows the rules for Object Identifiers. The name should be unique among security integrations in your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("relatedParameters")]
        private InputList<Inputs.ExternalOauthIntegrationRelatedParameterGetArgs>? _relatedParameters;

        /// <summary>
        /// Parameters related to this security integration.
        /// </summary>
        public InputList<Inputs.ExternalOauthIntegrationRelatedParameterGetArgs> RelatedParameters
        {
            get => _relatedParameters ?? (_relatedParameters = new InputList<Inputs.ExternalOauthIntegrationRelatedParameterGetArgs>());
            set => _relatedParameters = value;
        }

        [Input("showOutputs")]
        private InputList<Inputs.ExternalOauthIntegrationShowOutputGetArgs>? _showOutputs;

        /// <summary>
        /// Outputs the result of `SHOW SECURITY INTEGRATIONS` for the given security integration.
        /// </summary>
        public InputList<Inputs.ExternalOauthIntegrationShowOutputGetArgs> ShowOutputs
        {
            get => _showOutputs ?? (_showOutputs = new InputList<Inputs.ExternalOauthIntegrationShowOutputGetArgs>());
            set => _showOutputs = value;
        }

        public ExternalOauthIntegrationState()
        {
        }
        public static new ExternalOauthIntegrationState Empty => new ExternalOauthIntegrationState();
    }
}
