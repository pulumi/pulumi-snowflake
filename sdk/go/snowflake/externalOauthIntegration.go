// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package snowflake

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-snowflake/sdk/go/snowflake/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// !> **V1 release candidate** This resource was reworked and is a release candidate for the V1. We do not expect significant changes in it before the V1. We will welcome any feedback and adjust the resource if needed. Any errors reported will be resolved with a higher priority. We encourage checking this resource out before the V1 release. Please follow the migration guide to use it.
//
// Resource used to manage external oauth security integrations. For more information, check [documentation](https://docs.snowflake.com/en/sql-reference/sql/create-security-integration-oauth-external).
//
// ## Import
//
// ```sh
// $ pulumi import snowflake:index/externalOauthIntegration:ExternalOauthIntegration example "name"
// ```
type ExternalOauthIntegration struct {
	pulumi.CustomResourceState

	// Specifies a comment for the OAuth integration.
	Comment pulumi.StringPtrOutput `pulumi:"comment"`
	// Outputs the result of `DESCRIBE SECURITY INTEGRATIONS` for the given security integration.
	DescribeOutputs ExternalOauthIntegrationDescribeOutputArrayOutput `pulumi:"describeOutputs"`
	// Specifies whether to initiate operation of the integration or suspend it.
	Enabled pulumi.BoolOutput `pulumi:"enabled"`
	// Specifies the list of roles that the client can set as the primary role.
	ExternalOauthAllowedRolesLists pulumi.StringArrayOutput `pulumi:"externalOauthAllowedRolesLists"`
	// Specifies whether the OAuth client or user can use a role that is not defined in the OAuth access token. Valid values are (case-insensitive): `DISABLE` | `ENABLE` | `ENABLE_FOR_PRIVILEGE`.
	ExternalOauthAnyRoleMode pulumi.StringPtrOutput `pulumi:"externalOauthAnyRoleMode"`
	// Specifies additional values that can be used for the access token's audience validation on top of using the Customer's Snowflake Account URL
	ExternalOauthAudienceLists pulumi.StringArrayOutput `pulumi:"externalOauthAudienceLists"`
	// Specifies the list of roles that a client cannot set as the primary role. By default, this list includes the ACCOUNTADMIN, ORGADMIN and SECURITYADMIN roles. To remove these privileged roles from the list, use the ALTER ACCOUNT command to set the EXTERNAL*OAUTH*ADD*PRIVILEGED*ROLES*TO*BLOCKED_LIST account parameter to FALSE.
	ExternalOauthBlockedRolesLists pulumi.StringArrayOutput `pulumi:"externalOauthBlockedRolesLists"`
	// Specifies the URL to define the OAuth 2.0 authorization server.
	ExternalOauthIssuer pulumi.StringOutput `pulumi:"externalOauthIssuer"`
	// Specifies the endpoint or a list of endpoints from which to download public keys or certificates to validate an External OAuth access token. The maximum number of URLs that can be specified in the list is 3. If removed from the config, the resource is recreated.
	ExternalOauthJwsKeysUrls pulumi.StringArrayOutput `pulumi:"externalOauthJwsKeysUrls"`
	// Specifies a Base64-encoded RSA public key, without the -----BEGIN PUBLIC KEY----- and -----END PUBLIC KEY----- headers. If removed from the config, the resource is recreated.
	ExternalOauthRsaPublicKey pulumi.StringPtrOutput `pulumi:"externalOauthRsaPublicKey"`
	// Specifies a second RSA public key, without the -----BEGIN PUBLIC KEY----- and -----END PUBLIC KEY----- headers. Used for key rotation. If removed from the config, the resource is recreated.
	ExternalOauthRsaPublicKey2 pulumi.StringPtrOutput `pulumi:"externalOauthRsaPublicKey2"`
	// Specifies the scope delimiter in the authorization token.
	ExternalOauthScopeDelimiter pulumi.StringPtrOutput `pulumi:"externalOauthScopeDelimiter"`
	// Specifies the access token claim to map the access token to an account role. If removed from the config, the resource is recreated.
	ExternalOauthScopeMappingAttribute pulumi.StringPtrOutput `pulumi:"externalOauthScopeMappingAttribute"`
	// Indicates which Snowflake user record attribute should be used to map the access token to a Snowflake user record. Valid values are (case-insensitive): `LOGIN_NAME` | `EMAIL_ADDRESS`.
	ExternalOauthSnowflakeUserMappingAttribute pulumi.StringOutput `pulumi:"externalOauthSnowflakeUserMappingAttribute"`
	// Specifies the access token claim or claims that can be used to map the access token to a Snowflake user record. If removed from the config, the resource is recreated.
	ExternalOauthTokenUserMappingClaims pulumi.StringArrayOutput `pulumi:"externalOauthTokenUserMappingClaims"`
	// Specifies the OAuth 2.0 authorization server to be Okta, Microsoft Azure AD, Ping Identity PingFederate, or a Custom OAuth 2.0 authorization server. Valid values are (case-insensitive): `OKTA` | `AZURE` | `PING_FEDERATE` | `CUSTOM`.
	ExternalOauthType pulumi.StringOutput `pulumi:"externalOauthType"`
	// Specifies the name of the External Oath integration. This name follows the rules for Object Identifiers. The name should be unique among security integrations in your account.
	Name pulumi.StringOutput `pulumi:"name"`
	// Paramteres related to this security integration.
	RelatedParameters ExternalOauthIntegrationRelatedParameterArrayOutput `pulumi:"relatedParameters"`
	// Outputs the result of `SHOW SECURITY INTEGRATIONS` for the given security integration.
	ShowOutputs ExternalOauthIntegrationShowOutputArrayOutput `pulumi:"showOutputs"`
}

// NewExternalOauthIntegration registers a new resource with the given unique name, arguments, and options.
func NewExternalOauthIntegration(ctx *pulumi.Context,
	name string, args *ExternalOauthIntegrationArgs, opts ...pulumi.ResourceOption) (*ExternalOauthIntegration, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Enabled == nil {
		return nil, errors.New("invalid value for required argument 'Enabled'")
	}
	if args.ExternalOauthIssuer == nil {
		return nil, errors.New("invalid value for required argument 'ExternalOauthIssuer'")
	}
	if args.ExternalOauthSnowflakeUserMappingAttribute == nil {
		return nil, errors.New("invalid value for required argument 'ExternalOauthSnowflakeUserMappingAttribute'")
	}
	if args.ExternalOauthTokenUserMappingClaims == nil {
		return nil, errors.New("invalid value for required argument 'ExternalOauthTokenUserMappingClaims'")
	}
	if args.ExternalOauthType == nil {
		return nil, errors.New("invalid value for required argument 'ExternalOauthType'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ExternalOauthIntegration
	err := ctx.RegisterResource("snowflake:index/externalOauthIntegration:ExternalOauthIntegration", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetExternalOauthIntegration gets an existing ExternalOauthIntegration resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetExternalOauthIntegration(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ExternalOauthIntegrationState, opts ...pulumi.ResourceOption) (*ExternalOauthIntegration, error) {
	var resource ExternalOauthIntegration
	err := ctx.ReadResource("snowflake:index/externalOauthIntegration:ExternalOauthIntegration", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ExternalOauthIntegration resources.
type externalOauthIntegrationState struct {
	// Specifies a comment for the OAuth integration.
	Comment *string `pulumi:"comment"`
	// Outputs the result of `DESCRIBE SECURITY INTEGRATIONS` for the given security integration.
	DescribeOutputs []ExternalOauthIntegrationDescribeOutput `pulumi:"describeOutputs"`
	// Specifies whether to initiate operation of the integration or suspend it.
	Enabled *bool `pulumi:"enabled"`
	// Specifies the list of roles that the client can set as the primary role.
	ExternalOauthAllowedRolesLists []string `pulumi:"externalOauthAllowedRolesLists"`
	// Specifies whether the OAuth client or user can use a role that is not defined in the OAuth access token. Valid values are (case-insensitive): `DISABLE` | `ENABLE` | `ENABLE_FOR_PRIVILEGE`.
	ExternalOauthAnyRoleMode *string `pulumi:"externalOauthAnyRoleMode"`
	// Specifies additional values that can be used for the access token's audience validation on top of using the Customer's Snowflake Account URL
	ExternalOauthAudienceLists []string `pulumi:"externalOauthAudienceLists"`
	// Specifies the list of roles that a client cannot set as the primary role. By default, this list includes the ACCOUNTADMIN, ORGADMIN and SECURITYADMIN roles. To remove these privileged roles from the list, use the ALTER ACCOUNT command to set the EXTERNAL*OAUTH*ADD*PRIVILEGED*ROLES*TO*BLOCKED_LIST account parameter to FALSE.
	ExternalOauthBlockedRolesLists []string `pulumi:"externalOauthBlockedRolesLists"`
	// Specifies the URL to define the OAuth 2.0 authorization server.
	ExternalOauthIssuer *string `pulumi:"externalOauthIssuer"`
	// Specifies the endpoint or a list of endpoints from which to download public keys or certificates to validate an External OAuth access token. The maximum number of URLs that can be specified in the list is 3. If removed from the config, the resource is recreated.
	ExternalOauthJwsKeysUrls []string `pulumi:"externalOauthJwsKeysUrls"`
	// Specifies a Base64-encoded RSA public key, without the -----BEGIN PUBLIC KEY----- and -----END PUBLIC KEY----- headers. If removed from the config, the resource is recreated.
	ExternalOauthRsaPublicKey *string `pulumi:"externalOauthRsaPublicKey"`
	// Specifies a second RSA public key, without the -----BEGIN PUBLIC KEY----- and -----END PUBLIC KEY----- headers. Used for key rotation. If removed from the config, the resource is recreated.
	ExternalOauthRsaPublicKey2 *string `pulumi:"externalOauthRsaPublicKey2"`
	// Specifies the scope delimiter in the authorization token.
	ExternalOauthScopeDelimiter *string `pulumi:"externalOauthScopeDelimiter"`
	// Specifies the access token claim to map the access token to an account role. If removed from the config, the resource is recreated.
	ExternalOauthScopeMappingAttribute *string `pulumi:"externalOauthScopeMappingAttribute"`
	// Indicates which Snowflake user record attribute should be used to map the access token to a Snowflake user record. Valid values are (case-insensitive): `LOGIN_NAME` | `EMAIL_ADDRESS`.
	ExternalOauthSnowflakeUserMappingAttribute *string `pulumi:"externalOauthSnowflakeUserMappingAttribute"`
	// Specifies the access token claim or claims that can be used to map the access token to a Snowflake user record. If removed from the config, the resource is recreated.
	ExternalOauthTokenUserMappingClaims []string `pulumi:"externalOauthTokenUserMappingClaims"`
	// Specifies the OAuth 2.0 authorization server to be Okta, Microsoft Azure AD, Ping Identity PingFederate, or a Custom OAuth 2.0 authorization server. Valid values are (case-insensitive): `OKTA` | `AZURE` | `PING_FEDERATE` | `CUSTOM`.
	ExternalOauthType *string `pulumi:"externalOauthType"`
	// Specifies the name of the External Oath integration. This name follows the rules for Object Identifiers. The name should be unique among security integrations in your account.
	Name *string `pulumi:"name"`
	// Paramteres related to this security integration.
	RelatedParameters []ExternalOauthIntegrationRelatedParameter `pulumi:"relatedParameters"`
	// Outputs the result of `SHOW SECURITY INTEGRATIONS` for the given security integration.
	ShowOutputs []ExternalOauthIntegrationShowOutput `pulumi:"showOutputs"`
}

type ExternalOauthIntegrationState struct {
	// Specifies a comment for the OAuth integration.
	Comment pulumi.StringPtrInput
	// Outputs the result of `DESCRIBE SECURITY INTEGRATIONS` for the given security integration.
	DescribeOutputs ExternalOauthIntegrationDescribeOutputArrayInput
	// Specifies whether to initiate operation of the integration or suspend it.
	Enabled pulumi.BoolPtrInput
	// Specifies the list of roles that the client can set as the primary role.
	ExternalOauthAllowedRolesLists pulumi.StringArrayInput
	// Specifies whether the OAuth client or user can use a role that is not defined in the OAuth access token. Valid values are (case-insensitive): `DISABLE` | `ENABLE` | `ENABLE_FOR_PRIVILEGE`.
	ExternalOauthAnyRoleMode pulumi.StringPtrInput
	// Specifies additional values that can be used for the access token's audience validation on top of using the Customer's Snowflake Account URL
	ExternalOauthAudienceLists pulumi.StringArrayInput
	// Specifies the list of roles that a client cannot set as the primary role. By default, this list includes the ACCOUNTADMIN, ORGADMIN and SECURITYADMIN roles. To remove these privileged roles from the list, use the ALTER ACCOUNT command to set the EXTERNAL*OAUTH*ADD*PRIVILEGED*ROLES*TO*BLOCKED_LIST account parameter to FALSE.
	ExternalOauthBlockedRolesLists pulumi.StringArrayInput
	// Specifies the URL to define the OAuth 2.0 authorization server.
	ExternalOauthIssuer pulumi.StringPtrInput
	// Specifies the endpoint or a list of endpoints from which to download public keys or certificates to validate an External OAuth access token. The maximum number of URLs that can be specified in the list is 3. If removed from the config, the resource is recreated.
	ExternalOauthJwsKeysUrls pulumi.StringArrayInput
	// Specifies a Base64-encoded RSA public key, without the -----BEGIN PUBLIC KEY----- and -----END PUBLIC KEY----- headers. If removed from the config, the resource is recreated.
	ExternalOauthRsaPublicKey pulumi.StringPtrInput
	// Specifies a second RSA public key, without the -----BEGIN PUBLIC KEY----- and -----END PUBLIC KEY----- headers. Used for key rotation. If removed from the config, the resource is recreated.
	ExternalOauthRsaPublicKey2 pulumi.StringPtrInput
	// Specifies the scope delimiter in the authorization token.
	ExternalOauthScopeDelimiter pulumi.StringPtrInput
	// Specifies the access token claim to map the access token to an account role. If removed from the config, the resource is recreated.
	ExternalOauthScopeMappingAttribute pulumi.StringPtrInput
	// Indicates which Snowflake user record attribute should be used to map the access token to a Snowflake user record. Valid values are (case-insensitive): `LOGIN_NAME` | `EMAIL_ADDRESS`.
	ExternalOauthSnowflakeUserMappingAttribute pulumi.StringPtrInput
	// Specifies the access token claim or claims that can be used to map the access token to a Snowflake user record. If removed from the config, the resource is recreated.
	ExternalOauthTokenUserMappingClaims pulumi.StringArrayInput
	// Specifies the OAuth 2.0 authorization server to be Okta, Microsoft Azure AD, Ping Identity PingFederate, or a Custom OAuth 2.0 authorization server. Valid values are (case-insensitive): `OKTA` | `AZURE` | `PING_FEDERATE` | `CUSTOM`.
	ExternalOauthType pulumi.StringPtrInput
	// Specifies the name of the External Oath integration. This name follows the rules for Object Identifiers. The name should be unique among security integrations in your account.
	Name pulumi.StringPtrInput
	// Paramteres related to this security integration.
	RelatedParameters ExternalOauthIntegrationRelatedParameterArrayInput
	// Outputs the result of `SHOW SECURITY INTEGRATIONS` for the given security integration.
	ShowOutputs ExternalOauthIntegrationShowOutputArrayInput
}

func (ExternalOauthIntegrationState) ElementType() reflect.Type {
	return reflect.TypeOf((*externalOauthIntegrationState)(nil)).Elem()
}

type externalOauthIntegrationArgs struct {
	// Specifies a comment for the OAuth integration.
	Comment *string `pulumi:"comment"`
	// Specifies whether to initiate operation of the integration or suspend it.
	Enabled bool `pulumi:"enabled"`
	// Specifies the list of roles that the client can set as the primary role.
	ExternalOauthAllowedRolesLists []string `pulumi:"externalOauthAllowedRolesLists"`
	// Specifies whether the OAuth client or user can use a role that is not defined in the OAuth access token. Valid values are (case-insensitive): `DISABLE` | `ENABLE` | `ENABLE_FOR_PRIVILEGE`.
	ExternalOauthAnyRoleMode *string `pulumi:"externalOauthAnyRoleMode"`
	// Specifies additional values that can be used for the access token's audience validation on top of using the Customer's Snowflake Account URL
	ExternalOauthAudienceLists []string `pulumi:"externalOauthAudienceLists"`
	// Specifies the list of roles that a client cannot set as the primary role. By default, this list includes the ACCOUNTADMIN, ORGADMIN and SECURITYADMIN roles. To remove these privileged roles from the list, use the ALTER ACCOUNT command to set the EXTERNAL*OAUTH*ADD*PRIVILEGED*ROLES*TO*BLOCKED_LIST account parameter to FALSE.
	ExternalOauthBlockedRolesLists []string `pulumi:"externalOauthBlockedRolesLists"`
	// Specifies the URL to define the OAuth 2.0 authorization server.
	ExternalOauthIssuer string `pulumi:"externalOauthIssuer"`
	// Specifies the endpoint or a list of endpoints from which to download public keys or certificates to validate an External OAuth access token. The maximum number of URLs that can be specified in the list is 3. If removed from the config, the resource is recreated.
	ExternalOauthJwsKeysUrls []string `pulumi:"externalOauthJwsKeysUrls"`
	// Specifies a Base64-encoded RSA public key, without the -----BEGIN PUBLIC KEY----- and -----END PUBLIC KEY----- headers. If removed from the config, the resource is recreated.
	ExternalOauthRsaPublicKey *string `pulumi:"externalOauthRsaPublicKey"`
	// Specifies a second RSA public key, without the -----BEGIN PUBLIC KEY----- and -----END PUBLIC KEY----- headers. Used for key rotation. If removed from the config, the resource is recreated.
	ExternalOauthRsaPublicKey2 *string `pulumi:"externalOauthRsaPublicKey2"`
	// Specifies the scope delimiter in the authorization token.
	ExternalOauthScopeDelimiter *string `pulumi:"externalOauthScopeDelimiter"`
	// Specifies the access token claim to map the access token to an account role. If removed from the config, the resource is recreated.
	ExternalOauthScopeMappingAttribute *string `pulumi:"externalOauthScopeMappingAttribute"`
	// Indicates which Snowflake user record attribute should be used to map the access token to a Snowflake user record. Valid values are (case-insensitive): `LOGIN_NAME` | `EMAIL_ADDRESS`.
	ExternalOauthSnowflakeUserMappingAttribute string `pulumi:"externalOauthSnowflakeUserMappingAttribute"`
	// Specifies the access token claim or claims that can be used to map the access token to a Snowflake user record. If removed from the config, the resource is recreated.
	ExternalOauthTokenUserMappingClaims []string `pulumi:"externalOauthTokenUserMappingClaims"`
	// Specifies the OAuth 2.0 authorization server to be Okta, Microsoft Azure AD, Ping Identity PingFederate, or a Custom OAuth 2.0 authorization server. Valid values are (case-insensitive): `OKTA` | `AZURE` | `PING_FEDERATE` | `CUSTOM`.
	ExternalOauthType string `pulumi:"externalOauthType"`
	// Specifies the name of the External Oath integration. This name follows the rules for Object Identifiers. The name should be unique among security integrations in your account.
	Name *string `pulumi:"name"`
}

// The set of arguments for constructing a ExternalOauthIntegration resource.
type ExternalOauthIntegrationArgs struct {
	// Specifies a comment for the OAuth integration.
	Comment pulumi.StringPtrInput
	// Specifies whether to initiate operation of the integration or suspend it.
	Enabled pulumi.BoolInput
	// Specifies the list of roles that the client can set as the primary role.
	ExternalOauthAllowedRolesLists pulumi.StringArrayInput
	// Specifies whether the OAuth client or user can use a role that is not defined in the OAuth access token. Valid values are (case-insensitive): `DISABLE` | `ENABLE` | `ENABLE_FOR_PRIVILEGE`.
	ExternalOauthAnyRoleMode pulumi.StringPtrInput
	// Specifies additional values that can be used for the access token's audience validation on top of using the Customer's Snowflake Account URL
	ExternalOauthAudienceLists pulumi.StringArrayInput
	// Specifies the list of roles that a client cannot set as the primary role. By default, this list includes the ACCOUNTADMIN, ORGADMIN and SECURITYADMIN roles. To remove these privileged roles from the list, use the ALTER ACCOUNT command to set the EXTERNAL*OAUTH*ADD*PRIVILEGED*ROLES*TO*BLOCKED_LIST account parameter to FALSE.
	ExternalOauthBlockedRolesLists pulumi.StringArrayInput
	// Specifies the URL to define the OAuth 2.0 authorization server.
	ExternalOauthIssuer pulumi.StringInput
	// Specifies the endpoint or a list of endpoints from which to download public keys or certificates to validate an External OAuth access token. The maximum number of URLs that can be specified in the list is 3. If removed from the config, the resource is recreated.
	ExternalOauthJwsKeysUrls pulumi.StringArrayInput
	// Specifies a Base64-encoded RSA public key, without the -----BEGIN PUBLIC KEY----- and -----END PUBLIC KEY----- headers. If removed from the config, the resource is recreated.
	ExternalOauthRsaPublicKey pulumi.StringPtrInput
	// Specifies a second RSA public key, without the -----BEGIN PUBLIC KEY----- and -----END PUBLIC KEY----- headers. Used for key rotation. If removed from the config, the resource is recreated.
	ExternalOauthRsaPublicKey2 pulumi.StringPtrInput
	// Specifies the scope delimiter in the authorization token.
	ExternalOauthScopeDelimiter pulumi.StringPtrInput
	// Specifies the access token claim to map the access token to an account role. If removed from the config, the resource is recreated.
	ExternalOauthScopeMappingAttribute pulumi.StringPtrInput
	// Indicates which Snowflake user record attribute should be used to map the access token to a Snowflake user record. Valid values are (case-insensitive): `LOGIN_NAME` | `EMAIL_ADDRESS`.
	ExternalOauthSnowflakeUserMappingAttribute pulumi.StringInput
	// Specifies the access token claim or claims that can be used to map the access token to a Snowflake user record. If removed from the config, the resource is recreated.
	ExternalOauthTokenUserMappingClaims pulumi.StringArrayInput
	// Specifies the OAuth 2.0 authorization server to be Okta, Microsoft Azure AD, Ping Identity PingFederate, or a Custom OAuth 2.0 authorization server. Valid values are (case-insensitive): `OKTA` | `AZURE` | `PING_FEDERATE` | `CUSTOM`.
	ExternalOauthType pulumi.StringInput
	// Specifies the name of the External Oath integration. This name follows the rules for Object Identifiers. The name should be unique among security integrations in your account.
	Name pulumi.StringPtrInput
}

func (ExternalOauthIntegrationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*externalOauthIntegrationArgs)(nil)).Elem()
}

type ExternalOauthIntegrationInput interface {
	pulumi.Input

	ToExternalOauthIntegrationOutput() ExternalOauthIntegrationOutput
	ToExternalOauthIntegrationOutputWithContext(ctx context.Context) ExternalOauthIntegrationOutput
}

func (*ExternalOauthIntegration) ElementType() reflect.Type {
	return reflect.TypeOf((**ExternalOauthIntegration)(nil)).Elem()
}

func (i *ExternalOauthIntegration) ToExternalOauthIntegrationOutput() ExternalOauthIntegrationOutput {
	return i.ToExternalOauthIntegrationOutputWithContext(context.Background())
}

func (i *ExternalOauthIntegration) ToExternalOauthIntegrationOutputWithContext(ctx context.Context) ExternalOauthIntegrationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ExternalOauthIntegrationOutput)
}

// ExternalOauthIntegrationArrayInput is an input type that accepts ExternalOauthIntegrationArray and ExternalOauthIntegrationArrayOutput values.
// You can construct a concrete instance of `ExternalOauthIntegrationArrayInput` via:
//
//	ExternalOauthIntegrationArray{ ExternalOauthIntegrationArgs{...} }
type ExternalOauthIntegrationArrayInput interface {
	pulumi.Input

	ToExternalOauthIntegrationArrayOutput() ExternalOauthIntegrationArrayOutput
	ToExternalOauthIntegrationArrayOutputWithContext(context.Context) ExternalOauthIntegrationArrayOutput
}

type ExternalOauthIntegrationArray []ExternalOauthIntegrationInput

func (ExternalOauthIntegrationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ExternalOauthIntegration)(nil)).Elem()
}

func (i ExternalOauthIntegrationArray) ToExternalOauthIntegrationArrayOutput() ExternalOauthIntegrationArrayOutput {
	return i.ToExternalOauthIntegrationArrayOutputWithContext(context.Background())
}

func (i ExternalOauthIntegrationArray) ToExternalOauthIntegrationArrayOutputWithContext(ctx context.Context) ExternalOauthIntegrationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ExternalOauthIntegrationArrayOutput)
}

// ExternalOauthIntegrationMapInput is an input type that accepts ExternalOauthIntegrationMap and ExternalOauthIntegrationMapOutput values.
// You can construct a concrete instance of `ExternalOauthIntegrationMapInput` via:
//
//	ExternalOauthIntegrationMap{ "key": ExternalOauthIntegrationArgs{...} }
type ExternalOauthIntegrationMapInput interface {
	pulumi.Input

	ToExternalOauthIntegrationMapOutput() ExternalOauthIntegrationMapOutput
	ToExternalOauthIntegrationMapOutputWithContext(context.Context) ExternalOauthIntegrationMapOutput
}

type ExternalOauthIntegrationMap map[string]ExternalOauthIntegrationInput

func (ExternalOauthIntegrationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ExternalOauthIntegration)(nil)).Elem()
}

func (i ExternalOauthIntegrationMap) ToExternalOauthIntegrationMapOutput() ExternalOauthIntegrationMapOutput {
	return i.ToExternalOauthIntegrationMapOutputWithContext(context.Background())
}

func (i ExternalOauthIntegrationMap) ToExternalOauthIntegrationMapOutputWithContext(ctx context.Context) ExternalOauthIntegrationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ExternalOauthIntegrationMapOutput)
}

type ExternalOauthIntegrationOutput struct{ *pulumi.OutputState }

func (ExternalOauthIntegrationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ExternalOauthIntegration)(nil)).Elem()
}

func (o ExternalOauthIntegrationOutput) ToExternalOauthIntegrationOutput() ExternalOauthIntegrationOutput {
	return o
}

func (o ExternalOauthIntegrationOutput) ToExternalOauthIntegrationOutputWithContext(ctx context.Context) ExternalOauthIntegrationOutput {
	return o
}

// Specifies a comment for the OAuth integration.
func (o ExternalOauthIntegrationOutput) Comment() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ExternalOauthIntegration) pulumi.StringPtrOutput { return v.Comment }).(pulumi.StringPtrOutput)
}

// Outputs the result of `DESCRIBE SECURITY INTEGRATIONS` for the given security integration.
func (o ExternalOauthIntegrationOutput) DescribeOutputs() ExternalOauthIntegrationDescribeOutputArrayOutput {
	return o.ApplyT(func(v *ExternalOauthIntegration) ExternalOauthIntegrationDescribeOutputArrayOutput {
		return v.DescribeOutputs
	}).(ExternalOauthIntegrationDescribeOutputArrayOutput)
}

// Specifies whether to initiate operation of the integration or suspend it.
func (o ExternalOauthIntegrationOutput) Enabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *ExternalOauthIntegration) pulumi.BoolOutput { return v.Enabled }).(pulumi.BoolOutput)
}

// Specifies the list of roles that the client can set as the primary role.
func (o ExternalOauthIntegrationOutput) ExternalOauthAllowedRolesLists() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ExternalOauthIntegration) pulumi.StringArrayOutput { return v.ExternalOauthAllowedRolesLists }).(pulumi.StringArrayOutput)
}

// Specifies whether the OAuth client or user can use a role that is not defined in the OAuth access token. Valid values are (case-insensitive): `DISABLE` | `ENABLE` | `ENABLE_FOR_PRIVILEGE`.
func (o ExternalOauthIntegrationOutput) ExternalOauthAnyRoleMode() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ExternalOauthIntegration) pulumi.StringPtrOutput { return v.ExternalOauthAnyRoleMode }).(pulumi.StringPtrOutput)
}

// Specifies additional values that can be used for the access token's audience validation on top of using the Customer's Snowflake Account URL
func (o ExternalOauthIntegrationOutput) ExternalOauthAudienceLists() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ExternalOauthIntegration) pulumi.StringArrayOutput { return v.ExternalOauthAudienceLists }).(pulumi.StringArrayOutput)
}

// Specifies the list of roles that a client cannot set as the primary role. By default, this list includes the ACCOUNTADMIN, ORGADMIN and SECURITYADMIN roles. To remove these privileged roles from the list, use the ALTER ACCOUNT command to set the EXTERNAL*OAUTH*ADD*PRIVILEGED*ROLES*TO*BLOCKED_LIST account parameter to FALSE.
func (o ExternalOauthIntegrationOutput) ExternalOauthBlockedRolesLists() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ExternalOauthIntegration) pulumi.StringArrayOutput { return v.ExternalOauthBlockedRolesLists }).(pulumi.StringArrayOutput)
}

// Specifies the URL to define the OAuth 2.0 authorization server.
func (o ExternalOauthIntegrationOutput) ExternalOauthIssuer() pulumi.StringOutput {
	return o.ApplyT(func(v *ExternalOauthIntegration) pulumi.StringOutput { return v.ExternalOauthIssuer }).(pulumi.StringOutput)
}

// Specifies the endpoint or a list of endpoints from which to download public keys or certificates to validate an External OAuth access token. The maximum number of URLs that can be specified in the list is 3. If removed from the config, the resource is recreated.
func (o ExternalOauthIntegrationOutput) ExternalOauthJwsKeysUrls() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ExternalOauthIntegration) pulumi.StringArrayOutput { return v.ExternalOauthJwsKeysUrls }).(pulumi.StringArrayOutput)
}

// Specifies a Base64-encoded RSA public key, without the -----BEGIN PUBLIC KEY----- and -----END PUBLIC KEY----- headers. If removed from the config, the resource is recreated.
func (o ExternalOauthIntegrationOutput) ExternalOauthRsaPublicKey() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ExternalOauthIntegration) pulumi.StringPtrOutput { return v.ExternalOauthRsaPublicKey }).(pulumi.StringPtrOutput)
}

// Specifies a second RSA public key, without the -----BEGIN PUBLIC KEY----- and -----END PUBLIC KEY----- headers. Used for key rotation. If removed from the config, the resource is recreated.
func (o ExternalOauthIntegrationOutput) ExternalOauthRsaPublicKey2() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ExternalOauthIntegration) pulumi.StringPtrOutput { return v.ExternalOauthRsaPublicKey2 }).(pulumi.StringPtrOutput)
}

// Specifies the scope delimiter in the authorization token.
func (o ExternalOauthIntegrationOutput) ExternalOauthScopeDelimiter() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ExternalOauthIntegration) pulumi.StringPtrOutput { return v.ExternalOauthScopeDelimiter }).(pulumi.StringPtrOutput)
}

// Specifies the access token claim to map the access token to an account role. If removed from the config, the resource is recreated.
func (o ExternalOauthIntegrationOutput) ExternalOauthScopeMappingAttribute() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ExternalOauthIntegration) pulumi.StringPtrOutput { return v.ExternalOauthScopeMappingAttribute }).(pulumi.StringPtrOutput)
}

// Indicates which Snowflake user record attribute should be used to map the access token to a Snowflake user record. Valid values are (case-insensitive): `LOGIN_NAME` | `EMAIL_ADDRESS`.
func (o ExternalOauthIntegrationOutput) ExternalOauthSnowflakeUserMappingAttribute() pulumi.StringOutput {
	return o.ApplyT(func(v *ExternalOauthIntegration) pulumi.StringOutput {
		return v.ExternalOauthSnowflakeUserMappingAttribute
	}).(pulumi.StringOutput)
}

// Specifies the access token claim or claims that can be used to map the access token to a Snowflake user record. If removed from the config, the resource is recreated.
func (o ExternalOauthIntegrationOutput) ExternalOauthTokenUserMappingClaims() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ExternalOauthIntegration) pulumi.StringArrayOutput {
		return v.ExternalOauthTokenUserMappingClaims
	}).(pulumi.StringArrayOutput)
}

// Specifies the OAuth 2.0 authorization server to be Okta, Microsoft Azure AD, Ping Identity PingFederate, or a Custom OAuth 2.0 authorization server. Valid values are (case-insensitive): `OKTA` | `AZURE` | `PING_FEDERATE` | `CUSTOM`.
func (o ExternalOauthIntegrationOutput) ExternalOauthType() pulumi.StringOutput {
	return o.ApplyT(func(v *ExternalOauthIntegration) pulumi.StringOutput { return v.ExternalOauthType }).(pulumi.StringOutput)
}

// Specifies the name of the External Oath integration. This name follows the rules for Object Identifiers. The name should be unique among security integrations in your account.
func (o ExternalOauthIntegrationOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ExternalOauthIntegration) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Paramteres related to this security integration.
func (o ExternalOauthIntegrationOutput) RelatedParameters() ExternalOauthIntegrationRelatedParameterArrayOutput {
	return o.ApplyT(func(v *ExternalOauthIntegration) ExternalOauthIntegrationRelatedParameterArrayOutput {
		return v.RelatedParameters
	}).(ExternalOauthIntegrationRelatedParameterArrayOutput)
}

// Outputs the result of `SHOW SECURITY INTEGRATIONS` for the given security integration.
func (o ExternalOauthIntegrationOutput) ShowOutputs() ExternalOauthIntegrationShowOutputArrayOutput {
	return o.ApplyT(func(v *ExternalOauthIntegration) ExternalOauthIntegrationShowOutputArrayOutput { return v.ShowOutputs }).(ExternalOauthIntegrationShowOutputArrayOutput)
}

type ExternalOauthIntegrationArrayOutput struct{ *pulumi.OutputState }

func (ExternalOauthIntegrationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ExternalOauthIntegration)(nil)).Elem()
}

func (o ExternalOauthIntegrationArrayOutput) ToExternalOauthIntegrationArrayOutput() ExternalOauthIntegrationArrayOutput {
	return o
}

func (o ExternalOauthIntegrationArrayOutput) ToExternalOauthIntegrationArrayOutputWithContext(ctx context.Context) ExternalOauthIntegrationArrayOutput {
	return o
}

func (o ExternalOauthIntegrationArrayOutput) Index(i pulumi.IntInput) ExternalOauthIntegrationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ExternalOauthIntegration {
		return vs[0].([]*ExternalOauthIntegration)[vs[1].(int)]
	}).(ExternalOauthIntegrationOutput)
}

type ExternalOauthIntegrationMapOutput struct{ *pulumi.OutputState }

func (ExternalOauthIntegrationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ExternalOauthIntegration)(nil)).Elem()
}

func (o ExternalOauthIntegrationMapOutput) ToExternalOauthIntegrationMapOutput() ExternalOauthIntegrationMapOutput {
	return o
}

func (o ExternalOauthIntegrationMapOutput) ToExternalOauthIntegrationMapOutputWithContext(ctx context.Context) ExternalOauthIntegrationMapOutput {
	return o
}

func (o ExternalOauthIntegrationMapOutput) MapIndex(k pulumi.StringInput) ExternalOauthIntegrationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ExternalOauthIntegration {
		return vs[0].(map[string]*ExternalOauthIntegration)[vs[1].(string)]
	}).(ExternalOauthIntegrationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ExternalOauthIntegrationInput)(nil)).Elem(), &ExternalOauthIntegration{})
	pulumi.RegisterInputType(reflect.TypeOf((*ExternalOauthIntegrationArrayInput)(nil)).Elem(), ExternalOauthIntegrationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ExternalOauthIntegrationMapInput)(nil)).Elem(), ExternalOauthIntegrationMap{})
	pulumi.RegisterOutputType(ExternalOauthIntegrationOutput{})
	pulumi.RegisterOutputType(ExternalOauthIntegrationArrayOutput{})
	pulumi.RegisterOutputType(ExternalOauthIntegrationMapOutput{})
}
