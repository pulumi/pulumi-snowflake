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

// ## Import
//
// ```sh
// $ pulumi import snowflake:index/secretWithAuthorizationCodeGrant:SecretWithAuthorizationCodeGrant example '"<database_name>"."<schema_name>"."<secret_name>"'
// ```
type SecretWithAuthorizationCodeGrant struct {
	pulumi.CustomResourceState

	// Specifies the name value of the Snowflake security integration that connects Snowflake to an external service. For more information about this resource, see docs.
	ApiAuthentication pulumi.StringOutput `pulumi:"apiAuthentication"`
	// Specifies a comment for the secret.
	Comment pulumi.StringPtrOutput `pulumi:"comment"`
	// The database in which to create the secret Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Database pulumi.StringOutput `pulumi:"database"`
	// Outputs the result of `DESCRIBE SECRET` for the given secret.
	DescribeOutputs SecretWithAuthorizationCodeGrantDescribeOutputArrayOutput `pulumi:"describeOutputs"`
	// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
	FullyQualifiedName pulumi.StringOutput `pulumi:"fullyQualifiedName"`
	// String that specifies the identifier (i.e. name) for the secret, must be unique in your schema. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Name              pulumi.StringOutput `pulumi:"name"`
	OauthRefreshToken pulumi.StringOutput `pulumi:"oauthRefreshToken"`
	// Specifies the timestamp as a string when the OAuth refresh token expires. Accepted string formats: YYYY-MM-DD, YYYY-MM-DD HH:MI, YYYY-MM-DD HH:MI:SS, YYYY-MM-DD HH:MI \n\n
	OauthRefreshTokenExpiryTime pulumi.StringOutput `pulumi:"oauthRefreshTokenExpiryTime"`
	// The schema in which to create the secret. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Schema pulumi.StringOutput `pulumi:"schema"`
	// Specifies a type for the secret. This field is used for checking external changes and recreating the resources if needed.
	SecretType pulumi.StringOutput `pulumi:"secretType"`
	// Outputs the result of `SHOW SECRETS` for the given secret.
	ShowOutputs SecretWithAuthorizationCodeGrantShowOutputArrayOutput `pulumi:"showOutputs"`
}

// NewSecretWithAuthorizationCodeGrant registers a new resource with the given unique name, arguments, and options.
func NewSecretWithAuthorizationCodeGrant(ctx *pulumi.Context,
	name string, args *SecretWithAuthorizationCodeGrantArgs, opts ...pulumi.ResourceOption) (*SecretWithAuthorizationCodeGrant, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ApiAuthentication == nil {
		return nil, errors.New("invalid value for required argument 'ApiAuthentication'")
	}
	if args.Database == nil {
		return nil, errors.New("invalid value for required argument 'Database'")
	}
	if args.OauthRefreshToken == nil {
		return nil, errors.New("invalid value for required argument 'OauthRefreshToken'")
	}
	if args.OauthRefreshTokenExpiryTime == nil {
		return nil, errors.New("invalid value for required argument 'OauthRefreshTokenExpiryTime'")
	}
	if args.Schema == nil {
		return nil, errors.New("invalid value for required argument 'Schema'")
	}
	if args.OauthRefreshToken != nil {
		args.OauthRefreshToken = pulumi.ToSecret(args.OauthRefreshToken).(pulumi.StringInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"oauthRefreshToken",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SecretWithAuthorizationCodeGrant
	err := ctx.RegisterResource("snowflake:index/secretWithAuthorizationCodeGrant:SecretWithAuthorizationCodeGrant", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSecretWithAuthorizationCodeGrant gets an existing SecretWithAuthorizationCodeGrant resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSecretWithAuthorizationCodeGrant(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SecretWithAuthorizationCodeGrantState, opts ...pulumi.ResourceOption) (*SecretWithAuthorizationCodeGrant, error) {
	var resource SecretWithAuthorizationCodeGrant
	err := ctx.ReadResource("snowflake:index/secretWithAuthorizationCodeGrant:SecretWithAuthorizationCodeGrant", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SecretWithAuthorizationCodeGrant resources.
type secretWithAuthorizationCodeGrantState struct {
	// Specifies the name value of the Snowflake security integration that connects Snowflake to an external service. For more information about this resource, see docs.
	ApiAuthentication *string `pulumi:"apiAuthentication"`
	// Specifies a comment for the secret.
	Comment *string `pulumi:"comment"`
	// The database in which to create the secret Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Database *string `pulumi:"database"`
	// Outputs the result of `DESCRIBE SECRET` for the given secret.
	DescribeOutputs []SecretWithAuthorizationCodeGrantDescribeOutput `pulumi:"describeOutputs"`
	// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
	FullyQualifiedName *string `pulumi:"fullyQualifiedName"`
	// String that specifies the identifier (i.e. name) for the secret, must be unique in your schema. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Name              *string `pulumi:"name"`
	OauthRefreshToken *string `pulumi:"oauthRefreshToken"`
	// Specifies the timestamp as a string when the OAuth refresh token expires. Accepted string formats: YYYY-MM-DD, YYYY-MM-DD HH:MI, YYYY-MM-DD HH:MI:SS, YYYY-MM-DD HH:MI \n\n
	OauthRefreshTokenExpiryTime *string `pulumi:"oauthRefreshTokenExpiryTime"`
	// The schema in which to create the secret. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Schema *string `pulumi:"schema"`
	// Specifies a type for the secret. This field is used for checking external changes and recreating the resources if needed.
	SecretType *string `pulumi:"secretType"`
	// Outputs the result of `SHOW SECRETS` for the given secret.
	ShowOutputs []SecretWithAuthorizationCodeGrantShowOutput `pulumi:"showOutputs"`
}

type SecretWithAuthorizationCodeGrantState struct {
	// Specifies the name value of the Snowflake security integration that connects Snowflake to an external service. For more information about this resource, see docs.
	ApiAuthentication pulumi.StringPtrInput
	// Specifies a comment for the secret.
	Comment pulumi.StringPtrInput
	// The database in which to create the secret Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Database pulumi.StringPtrInput
	// Outputs the result of `DESCRIBE SECRET` for the given secret.
	DescribeOutputs SecretWithAuthorizationCodeGrantDescribeOutputArrayInput
	// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
	FullyQualifiedName pulumi.StringPtrInput
	// String that specifies the identifier (i.e. name) for the secret, must be unique in your schema. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Name              pulumi.StringPtrInput
	OauthRefreshToken pulumi.StringPtrInput
	// Specifies the timestamp as a string when the OAuth refresh token expires. Accepted string formats: YYYY-MM-DD, YYYY-MM-DD HH:MI, YYYY-MM-DD HH:MI:SS, YYYY-MM-DD HH:MI \n\n
	OauthRefreshTokenExpiryTime pulumi.StringPtrInput
	// The schema in which to create the secret. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Schema pulumi.StringPtrInput
	// Specifies a type for the secret. This field is used for checking external changes and recreating the resources if needed.
	SecretType pulumi.StringPtrInput
	// Outputs the result of `SHOW SECRETS` for the given secret.
	ShowOutputs SecretWithAuthorizationCodeGrantShowOutputArrayInput
}

func (SecretWithAuthorizationCodeGrantState) ElementType() reflect.Type {
	return reflect.TypeOf((*secretWithAuthorizationCodeGrantState)(nil)).Elem()
}

type secretWithAuthorizationCodeGrantArgs struct {
	// Specifies the name value of the Snowflake security integration that connects Snowflake to an external service. For more information about this resource, see docs.
	ApiAuthentication string `pulumi:"apiAuthentication"`
	// Specifies a comment for the secret.
	Comment *string `pulumi:"comment"`
	// The database in which to create the secret Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Database string `pulumi:"database"`
	// String that specifies the identifier (i.e. name) for the secret, must be unique in your schema. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Name              *string `pulumi:"name"`
	OauthRefreshToken string  `pulumi:"oauthRefreshToken"`
	// Specifies the timestamp as a string when the OAuth refresh token expires. Accepted string formats: YYYY-MM-DD, YYYY-MM-DD HH:MI, YYYY-MM-DD HH:MI:SS, YYYY-MM-DD HH:MI \n\n
	OauthRefreshTokenExpiryTime string `pulumi:"oauthRefreshTokenExpiryTime"`
	// The schema in which to create the secret. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Schema string `pulumi:"schema"`
}

// The set of arguments for constructing a SecretWithAuthorizationCodeGrant resource.
type SecretWithAuthorizationCodeGrantArgs struct {
	// Specifies the name value of the Snowflake security integration that connects Snowflake to an external service. For more information about this resource, see docs.
	ApiAuthentication pulumi.StringInput
	// Specifies a comment for the secret.
	Comment pulumi.StringPtrInput
	// The database in which to create the secret Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Database pulumi.StringInput
	// String that specifies the identifier (i.e. name) for the secret, must be unique in your schema. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Name              pulumi.StringPtrInput
	OauthRefreshToken pulumi.StringInput
	// Specifies the timestamp as a string when the OAuth refresh token expires. Accepted string formats: YYYY-MM-DD, YYYY-MM-DD HH:MI, YYYY-MM-DD HH:MI:SS, YYYY-MM-DD HH:MI \n\n
	OauthRefreshTokenExpiryTime pulumi.StringInput
	// The schema in which to create the secret. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Schema pulumi.StringInput
}

func (SecretWithAuthorizationCodeGrantArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*secretWithAuthorizationCodeGrantArgs)(nil)).Elem()
}

type SecretWithAuthorizationCodeGrantInput interface {
	pulumi.Input

	ToSecretWithAuthorizationCodeGrantOutput() SecretWithAuthorizationCodeGrantOutput
	ToSecretWithAuthorizationCodeGrantOutputWithContext(ctx context.Context) SecretWithAuthorizationCodeGrantOutput
}

func (*SecretWithAuthorizationCodeGrant) ElementType() reflect.Type {
	return reflect.TypeOf((**SecretWithAuthorizationCodeGrant)(nil)).Elem()
}

func (i *SecretWithAuthorizationCodeGrant) ToSecretWithAuthorizationCodeGrantOutput() SecretWithAuthorizationCodeGrantOutput {
	return i.ToSecretWithAuthorizationCodeGrantOutputWithContext(context.Background())
}

func (i *SecretWithAuthorizationCodeGrant) ToSecretWithAuthorizationCodeGrantOutputWithContext(ctx context.Context) SecretWithAuthorizationCodeGrantOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SecretWithAuthorizationCodeGrantOutput)
}

// SecretWithAuthorizationCodeGrantArrayInput is an input type that accepts SecretWithAuthorizationCodeGrantArray and SecretWithAuthorizationCodeGrantArrayOutput values.
// You can construct a concrete instance of `SecretWithAuthorizationCodeGrantArrayInput` via:
//
//	SecretWithAuthorizationCodeGrantArray{ SecretWithAuthorizationCodeGrantArgs{...} }
type SecretWithAuthorizationCodeGrantArrayInput interface {
	pulumi.Input

	ToSecretWithAuthorizationCodeGrantArrayOutput() SecretWithAuthorizationCodeGrantArrayOutput
	ToSecretWithAuthorizationCodeGrantArrayOutputWithContext(context.Context) SecretWithAuthorizationCodeGrantArrayOutput
}

type SecretWithAuthorizationCodeGrantArray []SecretWithAuthorizationCodeGrantInput

func (SecretWithAuthorizationCodeGrantArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SecretWithAuthorizationCodeGrant)(nil)).Elem()
}

func (i SecretWithAuthorizationCodeGrantArray) ToSecretWithAuthorizationCodeGrantArrayOutput() SecretWithAuthorizationCodeGrantArrayOutput {
	return i.ToSecretWithAuthorizationCodeGrantArrayOutputWithContext(context.Background())
}

func (i SecretWithAuthorizationCodeGrantArray) ToSecretWithAuthorizationCodeGrantArrayOutputWithContext(ctx context.Context) SecretWithAuthorizationCodeGrantArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SecretWithAuthorizationCodeGrantArrayOutput)
}

// SecretWithAuthorizationCodeGrantMapInput is an input type that accepts SecretWithAuthorizationCodeGrantMap and SecretWithAuthorizationCodeGrantMapOutput values.
// You can construct a concrete instance of `SecretWithAuthorizationCodeGrantMapInput` via:
//
//	SecretWithAuthorizationCodeGrantMap{ "key": SecretWithAuthorizationCodeGrantArgs{...} }
type SecretWithAuthorizationCodeGrantMapInput interface {
	pulumi.Input

	ToSecretWithAuthorizationCodeGrantMapOutput() SecretWithAuthorizationCodeGrantMapOutput
	ToSecretWithAuthorizationCodeGrantMapOutputWithContext(context.Context) SecretWithAuthorizationCodeGrantMapOutput
}

type SecretWithAuthorizationCodeGrantMap map[string]SecretWithAuthorizationCodeGrantInput

func (SecretWithAuthorizationCodeGrantMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SecretWithAuthorizationCodeGrant)(nil)).Elem()
}

func (i SecretWithAuthorizationCodeGrantMap) ToSecretWithAuthorizationCodeGrantMapOutput() SecretWithAuthorizationCodeGrantMapOutput {
	return i.ToSecretWithAuthorizationCodeGrantMapOutputWithContext(context.Background())
}

func (i SecretWithAuthorizationCodeGrantMap) ToSecretWithAuthorizationCodeGrantMapOutputWithContext(ctx context.Context) SecretWithAuthorizationCodeGrantMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SecretWithAuthorizationCodeGrantMapOutput)
}

type SecretWithAuthorizationCodeGrantOutput struct{ *pulumi.OutputState }

func (SecretWithAuthorizationCodeGrantOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SecretWithAuthorizationCodeGrant)(nil)).Elem()
}

func (o SecretWithAuthorizationCodeGrantOutput) ToSecretWithAuthorizationCodeGrantOutput() SecretWithAuthorizationCodeGrantOutput {
	return o
}

func (o SecretWithAuthorizationCodeGrantOutput) ToSecretWithAuthorizationCodeGrantOutputWithContext(ctx context.Context) SecretWithAuthorizationCodeGrantOutput {
	return o
}

// Specifies the name value of the Snowflake security integration that connects Snowflake to an external service. For more information about this resource, see docs.
func (o SecretWithAuthorizationCodeGrantOutput) ApiAuthentication() pulumi.StringOutput {
	return o.ApplyT(func(v *SecretWithAuthorizationCodeGrant) pulumi.StringOutput { return v.ApiAuthentication }).(pulumi.StringOutput)
}

// Specifies a comment for the secret.
func (o SecretWithAuthorizationCodeGrantOutput) Comment() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SecretWithAuthorizationCodeGrant) pulumi.StringPtrOutput { return v.Comment }).(pulumi.StringPtrOutput)
}

// The database in which to create the secret Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
func (o SecretWithAuthorizationCodeGrantOutput) Database() pulumi.StringOutput {
	return o.ApplyT(func(v *SecretWithAuthorizationCodeGrant) pulumi.StringOutput { return v.Database }).(pulumi.StringOutput)
}

// Outputs the result of `DESCRIBE SECRET` for the given secret.
func (o SecretWithAuthorizationCodeGrantOutput) DescribeOutputs() SecretWithAuthorizationCodeGrantDescribeOutputArrayOutput {
	return o.ApplyT(func(v *SecretWithAuthorizationCodeGrant) SecretWithAuthorizationCodeGrantDescribeOutputArrayOutput {
		return v.DescribeOutputs
	}).(SecretWithAuthorizationCodeGrantDescribeOutputArrayOutput)
}

// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
func (o SecretWithAuthorizationCodeGrantOutput) FullyQualifiedName() pulumi.StringOutput {
	return o.ApplyT(func(v *SecretWithAuthorizationCodeGrant) pulumi.StringOutput { return v.FullyQualifiedName }).(pulumi.StringOutput)
}

// String that specifies the identifier (i.e. name) for the secret, must be unique in your schema. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
func (o SecretWithAuthorizationCodeGrantOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *SecretWithAuthorizationCodeGrant) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

func (o SecretWithAuthorizationCodeGrantOutput) OauthRefreshToken() pulumi.StringOutput {
	return o.ApplyT(func(v *SecretWithAuthorizationCodeGrant) pulumi.StringOutput { return v.OauthRefreshToken }).(pulumi.StringOutput)
}

// Specifies the timestamp as a string when the OAuth refresh token expires. Accepted string formats: YYYY-MM-DD, YYYY-MM-DD HH:MI, YYYY-MM-DD HH:MI:SS, YYYY-MM-DD HH:MI \n\n
func (o SecretWithAuthorizationCodeGrantOutput) OauthRefreshTokenExpiryTime() pulumi.StringOutput {
	return o.ApplyT(func(v *SecretWithAuthorizationCodeGrant) pulumi.StringOutput { return v.OauthRefreshTokenExpiryTime }).(pulumi.StringOutput)
}

// The schema in which to create the secret. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
func (o SecretWithAuthorizationCodeGrantOutput) Schema() pulumi.StringOutput {
	return o.ApplyT(func(v *SecretWithAuthorizationCodeGrant) pulumi.StringOutput { return v.Schema }).(pulumi.StringOutput)
}

// Specifies a type for the secret. This field is used for checking external changes and recreating the resources if needed.
func (o SecretWithAuthorizationCodeGrantOutput) SecretType() pulumi.StringOutput {
	return o.ApplyT(func(v *SecretWithAuthorizationCodeGrant) pulumi.StringOutput { return v.SecretType }).(pulumi.StringOutput)
}

// Outputs the result of `SHOW SECRETS` for the given secret.
func (o SecretWithAuthorizationCodeGrantOutput) ShowOutputs() SecretWithAuthorizationCodeGrantShowOutputArrayOutput {
	return o.ApplyT(func(v *SecretWithAuthorizationCodeGrant) SecretWithAuthorizationCodeGrantShowOutputArrayOutput {
		return v.ShowOutputs
	}).(SecretWithAuthorizationCodeGrantShowOutputArrayOutput)
}

type SecretWithAuthorizationCodeGrantArrayOutput struct{ *pulumi.OutputState }

func (SecretWithAuthorizationCodeGrantArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SecretWithAuthorizationCodeGrant)(nil)).Elem()
}

func (o SecretWithAuthorizationCodeGrantArrayOutput) ToSecretWithAuthorizationCodeGrantArrayOutput() SecretWithAuthorizationCodeGrantArrayOutput {
	return o
}

func (o SecretWithAuthorizationCodeGrantArrayOutput) ToSecretWithAuthorizationCodeGrantArrayOutputWithContext(ctx context.Context) SecretWithAuthorizationCodeGrantArrayOutput {
	return o
}

func (o SecretWithAuthorizationCodeGrantArrayOutput) Index(i pulumi.IntInput) SecretWithAuthorizationCodeGrantOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SecretWithAuthorizationCodeGrant {
		return vs[0].([]*SecretWithAuthorizationCodeGrant)[vs[1].(int)]
	}).(SecretWithAuthorizationCodeGrantOutput)
}

type SecretWithAuthorizationCodeGrantMapOutput struct{ *pulumi.OutputState }

func (SecretWithAuthorizationCodeGrantMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SecretWithAuthorizationCodeGrant)(nil)).Elem()
}

func (o SecretWithAuthorizationCodeGrantMapOutput) ToSecretWithAuthorizationCodeGrantMapOutput() SecretWithAuthorizationCodeGrantMapOutput {
	return o
}

func (o SecretWithAuthorizationCodeGrantMapOutput) ToSecretWithAuthorizationCodeGrantMapOutputWithContext(ctx context.Context) SecretWithAuthorizationCodeGrantMapOutput {
	return o
}

func (o SecretWithAuthorizationCodeGrantMapOutput) MapIndex(k pulumi.StringInput) SecretWithAuthorizationCodeGrantOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SecretWithAuthorizationCodeGrant {
		return vs[0].(map[string]*SecretWithAuthorizationCodeGrant)[vs[1].(string)]
	}).(SecretWithAuthorizationCodeGrantOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SecretWithAuthorizationCodeGrantInput)(nil)).Elem(), &SecretWithAuthorizationCodeGrant{})
	pulumi.RegisterInputType(reflect.TypeOf((*SecretWithAuthorizationCodeGrantArrayInput)(nil)).Elem(), SecretWithAuthorizationCodeGrantArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SecretWithAuthorizationCodeGrantMapInput)(nil)).Elem(), SecretWithAuthorizationCodeGrantMap{})
	pulumi.RegisterOutputType(SecretWithAuthorizationCodeGrantOutput{})
	pulumi.RegisterOutputType(SecretWithAuthorizationCodeGrantArrayOutput{})
	pulumi.RegisterOutputType(SecretWithAuthorizationCodeGrantMapOutput{})
}
