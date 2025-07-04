// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package snowflake

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-snowflake/sdk/v2/go/snowflake/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Import
//
// ```sh
// $ pulumi import snowflake:index/secretWithGenericString:SecretWithGenericString example '"<database_name>"."<schema_name>"."<secret_name>"'
// ```
type SecretWithGenericString struct {
	pulumi.CustomResourceState

	// Specifies a comment for the secret.
	Comment pulumi.StringPtrOutput `pulumi:"comment"`
	// The database in which to create the secret Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Database pulumi.StringOutput `pulumi:"database"`
	// Outputs the result of `DESCRIBE SECRET` for the given secret.
	DescribeOutputs SecretWithGenericStringDescribeOutputArrayOutput `pulumi:"describeOutputs"`
	// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
	FullyQualifiedName pulumi.StringOutput `pulumi:"fullyQualifiedName"`
	// String that specifies the identifier (i.e. name) for the secret, must be unique in your schema. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Name pulumi.StringOutput `pulumi:"name"`
	// The schema in which to create the secret. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Schema       pulumi.StringOutput `pulumi:"schema"`
	SecretString pulumi.StringOutput `pulumi:"secretString"`
	// Specifies a type for the secret. This field is used for checking external changes and recreating the resources if needed.
	SecretType pulumi.StringOutput `pulumi:"secretType"`
	// Outputs the result of `SHOW SECRETS` for the given secret.
	ShowOutputs SecretWithGenericStringShowOutputArrayOutput `pulumi:"showOutputs"`
}

// NewSecretWithGenericString registers a new resource with the given unique name, arguments, and options.
func NewSecretWithGenericString(ctx *pulumi.Context,
	name string, args *SecretWithGenericStringArgs, opts ...pulumi.ResourceOption) (*SecretWithGenericString, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Database == nil {
		return nil, errors.New("invalid value for required argument 'Database'")
	}
	if args.Schema == nil {
		return nil, errors.New("invalid value for required argument 'Schema'")
	}
	if args.SecretString == nil {
		return nil, errors.New("invalid value for required argument 'SecretString'")
	}
	if args.SecretString != nil {
		args.SecretString = pulumi.ToSecret(args.SecretString).(pulumi.StringInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"secretString",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SecretWithGenericString
	err := ctx.RegisterResource("snowflake:index/secretWithGenericString:SecretWithGenericString", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSecretWithGenericString gets an existing SecretWithGenericString resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSecretWithGenericString(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SecretWithGenericStringState, opts ...pulumi.ResourceOption) (*SecretWithGenericString, error) {
	var resource SecretWithGenericString
	err := ctx.ReadResource("snowflake:index/secretWithGenericString:SecretWithGenericString", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SecretWithGenericString resources.
type secretWithGenericStringState struct {
	// Specifies a comment for the secret.
	Comment *string `pulumi:"comment"`
	// The database in which to create the secret Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Database *string `pulumi:"database"`
	// Outputs the result of `DESCRIBE SECRET` for the given secret.
	DescribeOutputs []SecretWithGenericStringDescribeOutput `pulumi:"describeOutputs"`
	// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
	FullyQualifiedName *string `pulumi:"fullyQualifiedName"`
	// String that specifies the identifier (i.e. name) for the secret, must be unique in your schema. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Name *string `pulumi:"name"`
	// The schema in which to create the secret. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Schema       *string `pulumi:"schema"`
	SecretString *string `pulumi:"secretString"`
	// Specifies a type for the secret. This field is used for checking external changes and recreating the resources if needed.
	SecretType *string `pulumi:"secretType"`
	// Outputs the result of `SHOW SECRETS` for the given secret.
	ShowOutputs []SecretWithGenericStringShowOutput `pulumi:"showOutputs"`
}

type SecretWithGenericStringState struct {
	// Specifies a comment for the secret.
	Comment pulumi.StringPtrInput
	// The database in which to create the secret Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Database pulumi.StringPtrInput
	// Outputs the result of `DESCRIBE SECRET` for the given secret.
	DescribeOutputs SecretWithGenericStringDescribeOutputArrayInput
	// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
	FullyQualifiedName pulumi.StringPtrInput
	// String that specifies the identifier (i.e. name) for the secret, must be unique in your schema. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Name pulumi.StringPtrInput
	// The schema in which to create the secret. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Schema       pulumi.StringPtrInput
	SecretString pulumi.StringPtrInput
	// Specifies a type for the secret. This field is used for checking external changes and recreating the resources if needed.
	SecretType pulumi.StringPtrInput
	// Outputs the result of `SHOW SECRETS` for the given secret.
	ShowOutputs SecretWithGenericStringShowOutputArrayInput
}

func (SecretWithGenericStringState) ElementType() reflect.Type {
	return reflect.TypeOf((*secretWithGenericStringState)(nil)).Elem()
}

type secretWithGenericStringArgs struct {
	// Specifies a comment for the secret.
	Comment *string `pulumi:"comment"`
	// The database in which to create the secret Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Database string `pulumi:"database"`
	// String that specifies the identifier (i.e. name) for the secret, must be unique in your schema. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Name *string `pulumi:"name"`
	// The schema in which to create the secret. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Schema       string `pulumi:"schema"`
	SecretString string `pulumi:"secretString"`
}

// The set of arguments for constructing a SecretWithGenericString resource.
type SecretWithGenericStringArgs struct {
	// Specifies a comment for the secret.
	Comment pulumi.StringPtrInput
	// The database in which to create the secret Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Database pulumi.StringInput
	// String that specifies the identifier (i.e. name) for the secret, must be unique in your schema. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Name pulumi.StringPtrInput
	// The schema in which to create the secret. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Schema       pulumi.StringInput
	SecretString pulumi.StringInput
}

func (SecretWithGenericStringArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*secretWithGenericStringArgs)(nil)).Elem()
}

type SecretWithGenericStringInput interface {
	pulumi.Input

	ToSecretWithGenericStringOutput() SecretWithGenericStringOutput
	ToSecretWithGenericStringOutputWithContext(ctx context.Context) SecretWithGenericStringOutput
}

func (*SecretWithGenericString) ElementType() reflect.Type {
	return reflect.TypeOf((**SecretWithGenericString)(nil)).Elem()
}

func (i *SecretWithGenericString) ToSecretWithGenericStringOutput() SecretWithGenericStringOutput {
	return i.ToSecretWithGenericStringOutputWithContext(context.Background())
}

func (i *SecretWithGenericString) ToSecretWithGenericStringOutputWithContext(ctx context.Context) SecretWithGenericStringOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SecretWithGenericStringOutput)
}

// SecretWithGenericStringArrayInput is an input type that accepts SecretWithGenericStringArray and SecretWithGenericStringArrayOutput values.
// You can construct a concrete instance of `SecretWithGenericStringArrayInput` via:
//
//	SecretWithGenericStringArray{ SecretWithGenericStringArgs{...} }
type SecretWithGenericStringArrayInput interface {
	pulumi.Input

	ToSecretWithGenericStringArrayOutput() SecretWithGenericStringArrayOutput
	ToSecretWithGenericStringArrayOutputWithContext(context.Context) SecretWithGenericStringArrayOutput
}

type SecretWithGenericStringArray []SecretWithGenericStringInput

func (SecretWithGenericStringArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SecretWithGenericString)(nil)).Elem()
}

func (i SecretWithGenericStringArray) ToSecretWithGenericStringArrayOutput() SecretWithGenericStringArrayOutput {
	return i.ToSecretWithGenericStringArrayOutputWithContext(context.Background())
}

func (i SecretWithGenericStringArray) ToSecretWithGenericStringArrayOutputWithContext(ctx context.Context) SecretWithGenericStringArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SecretWithGenericStringArrayOutput)
}

// SecretWithGenericStringMapInput is an input type that accepts SecretWithGenericStringMap and SecretWithGenericStringMapOutput values.
// You can construct a concrete instance of `SecretWithGenericStringMapInput` via:
//
//	SecretWithGenericStringMap{ "key": SecretWithGenericStringArgs{...} }
type SecretWithGenericStringMapInput interface {
	pulumi.Input

	ToSecretWithGenericStringMapOutput() SecretWithGenericStringMapOutput
	ToSecretWithGenericStringMapOutputWithContext(context.Context) SecretWithGenericStringMapOutput
}

type SecretWithGenericStringMap map[string]SecretWithGenericStringInput

func (SecretWithGenericStringMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SecretWithGenericString)(nil)).Elem()
}

func (i SecretWithGenericStringMap) ToSecretWithGenericStringMapOutput() SecretWithGenericStringMapOutput {
	return i.ToSecretWithGenericStringMapOutputWithContext(context.Background())
}

func (i SecretWithGenericStringMap) ToSecretWithGenericStringMapOutputWithContext(ctx context.Context) SecretWithGenericStringMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SecretWithGenericStringMapOutput)
}

type SecretWithGenericStringOutput struct{ *pulumi.OutputState }

func (SecretWithGenericStringOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SecretWithGenericString)(nil)).Elem()
}

func (o SecretWithGenericStringOutput) ToSecretWithGenericStringOutput() SecretWithGenericStringOutput {
	return o
}

func (o SecretWithGenericStringOutput) ToSecretWithGenericStringOutputWithContext(ctx context.Context) SecretWithGenericStringOutput {
	return o
}

// Specifies a comment for the secret.
func (o SecretWithGenericStringOutput) Comment() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SecretWithGenericString) pulumi.StringPtrOutput { return v.Comment }).(pulumi.StringPtrOutput)
}

// The database in which to create the secret Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
func (o SecretWithGenericStringOutput) Database() pulumi.StringOutput {
	return o.ApplyT(func(v *SecretWithGenericString) pulumi.StringOutput { return v.Database }).(pulumi.StringOutput)
}

// Outputs the result of `DESCRIBE SECRET` for the given secret.
func (o SecretWithGenericStringOutput) DescribeOutputs() SecretWithGenericStringDescribeOutputArrayOutput {
	return o.ApplyT(func(v *SecretWithGenericString) SecretWithGenericStringDescribeOutputArrayOutput {
		return v.DescribeOutputs
	}).(SecretWithGenericStringDescribeOutputArrayOutput)
}

// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
func (o SecretWithGenericStringOutput) FullyQualifiedName() pulumi.StringOutput {
	return o.ApplyT(func(v *SecretWithGenericString) pulumi.StringOutput { return v.FullyQualifiedName }).(pulumi.StringOutput)
}

// String that specifies the identifier (i.e. name) for the secret, must be unique in your schema. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
func (o SecretWithGenericStringOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *SecretWithGenericString) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The schema in which to create the secret. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
func (o SecretWithGenericStringOutput) Schema() pulumi.StringOutput {
	return o.ApplyT(func(v *SecretWithGenericString) pulumi.StringOutput { return v.Schema }).(pulumi.StringOutput)
}

func (o SecretWithGenericStringOutput) SecretString() pulumi.StringOutput {
	return o.ApplyT(func(v *SecretWithGenericString) pulumi.StringOutput { return v.SecretString }).(pulumi.StringOutput)
}

// Specifies a type for the secret. This field is used for checking external changes and recreating the resources if needed.
func (o SecretWithGenericStringOutput) SecretType() pulumi.StringOutput {
	return o.ApplyT(func(v *SecretWithGenericString) pulumi.StringOutput { return v.SecretType }).(pulumi.StringOutput)
}

// Outputs the result of `SHOW SECRETS` for the given secret.
func (o SecretWithGenericStringOutput) ShowOutputs() SecretWithGenericStringShowOutputArrayOutput {
	return o.ApplyT(func(v *SecretWithGenericString) SecretWithGenericStringShowOutputArrayOutput { return v.ShowOutputs }).(SecretWithGenericStringShowOutputArrayOutput)
}

type SecretWithGenericStringArrayOutput struct{ *pulumi.OutputState }

func (SecretWithGenericStringArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SecretWithGenericString)(nil)).Elem()
}

func (o SecretWithGenericStringArrayOutput) ToSecretWithGenericStringArrayOutput() SecretWithGenericStringArrayOutput {
	return o
}

func (o SecretWithGenericStringArrayOutput) ToSecretWithGenericStringArrayOutputWithContext(ctx context.Context) SecretWithGenericStringArrayOutput {
	return o
}

func (o SecretWithGenericStringArrayOutput) Index(i pulumi.IntInput) SecretWithGenericStringOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SecretWithGenericString {
		return vs[0].([]*SecretWithGenericString)[vs[1].(int)]
	}).(SecretWithGenericStringOutput)
}

type SecretWithGenericStringMapOutput struct{ *pulumi.OutputState }

func (SecretWithGenericStringMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SecretWithGenericString)(nil)).Elem()
}

func (o SecretWithGenericStringMapOutput) ToSecretWithGenericStringMapOutput() SecretWithGenericStringMapOutput {
	return o
}

func (o SecretWithGenericStringMapOutput) ToSecretWithGenericStringMapOutputWithContext(ctx context.Context) SecretWithGenericStringMapOutput {
	return o
}

func (o SecretWithGenericStringMapOutput) MapIndex(k pulumi.StringInput) SecretWithGenericStringOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SecretWithGenericString {
		return vs[0].(map[string]*SecretWithGenericString)[vs[1].(string)]
	}).(SecretWithGenericStringOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SecretWithGenericStringInput)(nil)).Elem(), &SecretWithGenericString{})
	pulumi.RegisterInputType(reflect.TypeOf((*SecretWithGenericStringArrayInput)(nil)).Elem(), SecretWithGenericStringArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SecretWithGenericStringMapInput)(nil)).Elem(), SecretWithGenericStringMap{})
	pulumi.RegisterOutputType(SecretWithGenericStringOutput{})
	pulumi.RegisterOutputType(SecretWithGenericStringArrayOutput{})
	pulumi.RegisterOutputType(SecretWithGenericStringMapOutput{})
}
