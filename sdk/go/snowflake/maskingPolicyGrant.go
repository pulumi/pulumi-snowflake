// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package snowflake

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type MaskingPolicyGrant struct {
	pulumi.CustomResourceState

	// The name of the database containing the masking policy on which to grant privileges.
	DatabaseName pulumi.StringOutput `pulumi:"databaseName"`
	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants pulumi.BoolPtrOutput `pulumi:"enableMultipleGrants"`
	// The name of the masking policy on which to grant privileges immediately.
	MaskingPolicyName pulumi.StringOutput `pulumi:"maskingPolicyName"`
	// The privilege to grant on the masking policy.
	Privilege pulumi.StringPtrOutput `pulumi:"privilege"`
	// Grants privilege to these roles.
	Roles pulumi.StringArrayOutput `pulumi:"roles"`
	// The name of the schema containing the masking policy on which to grant privileges.
	SchemaName pulumi.StringOutput `pulumi:"schemaName"`
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption pulumi.BoolPtrOutput `pulumi:"withGrantOption"`
}

// NewMaskingPolicyGrant registers a new resource with the given unique name, arguments, and options.
func NewMaskingPolicyGrant(ctx *pulumi.Context,
	name string, args *MaskingPolicyGrantArgs, opts ...pulumi.ResourceOption) (*MaskingPolicyGrant, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DatabaseName == nil {
		return nil, errors.New("invalid value for required argument 'DatabaseName'")
	}
	if args.MaskingPolicyName == nil {
		return nil, errors.New("invalid value for required argument 'MaskingPolicyName'")
	}
	if args.SchemaName == nil {
		return nil, errors.New("invalid value for required argument 'SchemaName'")
	}
	var resource MaskingPolicyGrant
	err := ctx.RegisterResource("snowflake:index/maskingPolicyGrant:MaskingPolicyGrant", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetMaskingPolicyGrant gets an existing MaskingPolicyGrant resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetMaskingPolicyGrant(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *MaskingPolicyGrantState, opts ...pulumi.ResourceOption) (*MaskingPolicyGrant, error) {
	var resource MaskingPolicyGrant
	err := ctx.ReadResource("snowflake:index/maskingPolicyGrant:MaskingPolicyGrant", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering MaskingPolicyGrant resources.
type maskingPolicyGrantState struct {
	// The name of the database containing the masking policy on which to grant privileges.
	DatabaseName *string `pulumi:"databaseName"`
	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants *bool `pulumi:"enableMultipleGrants"`
	// The name of the masking policy on which to grant privileges immediately.
	MaskingPolicyName *string `pulumi:"maskingPolicyName"`
	// The privilege to grant on the masking policy.
	Privilege *string `pulumi:"privilege"`
	// Grants privilege to these roles.
	Roles []string `pulumi:"roles"`
	// The name of the schema containing the masking policy on which to grant privileges.
	SchemaName *string `pulumi:"schemaName"`
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption *bool `pulumi:"withGrantOption"`
}

type MaskingPolicyGrantState struct {
	// The name of the database containing the masking policy on which to grant privileges.
	DatabaseName pulumi.StringPtrInput
	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants pulumi.BoolPtrInput
	// The name of the masking policy on which to grant privileges immediately.
	MaskingPolicyName pulumi.StringPtrInput
	// The privilege to grant on the masking policy.
	Privilege pulumi.StringPtrInput
	// Grants privilege to these roles.
	Roles pulumi.StringArrayInput
	// The name of the schema containing the masking policy on which to grant privileges.
	SchemaName pulumi.StringPtrInput
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption pulumi.BoolPtrInput
}

func (MaskingPolicyGrantState) ElementType() reflect.Type {
	return reflect.TypeOf((*maskingPolicyGrantState)(nil)).Elem()
}

type maskingPolicyGrantArgs struct {
	// The name of the database containing the masking policy on which to grant privileges.
	DatabaseName string `pulumi:"databaseName"`
	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants *bool `pulumi:"enableMultipleGrants"`
	// The name of the masking policy on which to grant privileges immediately.
	MaskingPolicyName string `pulumi:"maskingPolicyName"`
	// The privilege to grant on the masking policy.
	Privilege *string `pulumi:"privilege"`
	// Grants privilege to these roles.
	Roles []string `pulumi:"roles"`
	// The name of the schema containing the masking policy on which to grant privileges.
	SchemaName string `pulumi:"schemaName"`
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption *bool `pulumi:"withGrantOption"`
}

// The set of arguments for constructing a MaskingPolicyGrant resource.
type MaskingPolicyGrantArgs struct {
	// The name of the database containing the masking policy on which to grant privileges.
	DatabaseName pulumi.StringInput
	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants pulumi.BoolPtrInput
	// The name of the masking policy on which to grant privileges immediately.
	MaskingPolicyName pulumi.StringInput
	// The privilege to grant on the masking policy.
	Privilege pulumi.StringPtrInput
	// Grants privilege to these roles.
	Roles pulumi.StringArrayInput
	// The name of the schema containing the masking policy on which to grant privileges.
	SchemaName pulumi.StringInput
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption pulumi.BoolPtrInput
}

func (MaskingPolicyGrantArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*maskingPolicyGrantArgs)(nil)).Elem()
}

type MaskingPolicyGrantInput interface {
	pulumi.Input

	ToMaskingPolicyGrantOutput() MaskingPolicyGrantOutput
	ToMaskingPolicyGrantOutputWithContext(ctx context.Context) MaskingPolicyGrantOutput
}

func (*MaskingPolicyGrant) ElementType() reflect.Type {
	return reflect.TypeOf((**MaskingPolicyGrant)(nil)).Elem()
}

func (i *MaskingPolicyGrant) ToMaskingPolicyGrantOutput() MaskingPolicyGrantOutput {
	return i.ToMaskingPolicyGrantOutputWithContext(context.Background())
}

func (i *MaskingPolicyGrant) ToMaskingPolicyGrantOutputWithContext(ctx context.Context) MaskingPolicyGrantOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MaskingPolicyGrantOutput)
}

// MaskingPolicyGrantArrayInput is an input type that accepts MaskingPolicyGrantArray and MaskingPolicyGrantArrayOutput values.
// You can construct a concrete instance of `MaskingPolicyGrantArrayInput` via:
//
//	MaskingPolicyGrantArray{ MaskingPolicyGrantArgs{...} }
type MaskingPolicyGrantArrayInput interface {
	pulumi.Input

	ToMaskingPolicyGrantArrayOutput() MaskingPolicyGrantArrayOutput
	ToMaskingPolicyGrantArrayOutputWithContext(context.Context) MaskingPolicyGrantArrayOutput
}

type MaskingPolicyGrantArray []MaskingPolicyGrantInput

func (MaskingPolicyGrantArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MaskingPolicyGrant)(nil)).Elem()
}

func (i MaskingPolicyGrantArray) ToMaskingPolicyGrantArrayOutput() MaskingPolicyGrantArrayOutput {
	return i.ToMaskingPolicyGrantArrayOutputWithContext(context.Background())
}

func (i MaskingPolicyGrantArray) ToMaskingPolicyGrantArrayOutputWithContext(ctx context.Context) MaskingPolicyGrantArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MaskingPolicyGrantArrayOutput)
}

// MaskingPolicyGrantMapInput is an input type that accepts MaskingPolicyGrantMap and MaskingPolicyGrantMapOutput values.
// You can construct a concrete instance of `MaskingPolicyGrantMapInput` via:
//
//	MaskingPolicyGrantMap{ "key": MaskingPolicyGrantArgs{...} }
type MaskingPolicyGrantMapInput interface {
	pulumi.Input

	ToMaskingPolicyGrantMapOutput() MaskingPolicyGrantMapOutput
	ToMaskingPolicyGrantMapOutputWithContext(context.Context) MaskingPolicyGrantMapOutput
}

type MaskingPolicyGrantMap map[string]MaskingPolicyGrantInput

func (MaskingPolicyGrantMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MaskingPolicyGrant)(nil)).Elem()
}

func (i MaskingPolicyGrantMap) ToMaskingPolicyGrantMapOutput() MaskingPolicyGrantMapOutput {
	return i.ToMaskingPolicyGrantMapOutputWithContext(context.Background())
}

func (i MaskingPolicyGrantMap) ToMaskingPolicyGrantMapOutputWithContext(ctx context.Context) MaskingPolicyGrantMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MaskingPolicyGrantMapOutput)
}

type MaskingPolicyGrantOutput struct{ *pulumi.OutputState }

func (MaskingPolicyGrantOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**MaskingPolicyGrant)(nil)).Elem()
}

func (o MaskingPolicyGrantOutput) ToMaskingPolicyGrantOutput() MaskingPolicyGrantOutput {
	return o
}

func (o MaskingPolicyGrantOutput) ToMaskingPolicyGrantOutputWithContext(ctx context.Context) MaskingPolicyGrantOutput {
	return o
}

// The name of the database containing the masking policy on which to grant privileges.
func (o MaskingPolicyGrantOutput) DatabaseName() pulumi.StringOutput {
	return o.ApplyT(func(v *MaskingPolicyGrant) pulumi.StringOutput { return v.DatabaseName }).(pulumi.StringOutput)
}

// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
// grants applied to roles and objects outside Terraform.
func (o MaskingPolicyGrantOutput) EnableMultipleGrants() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *MaskingPolicyGrant) pulumi.BoolPtrOutput { return v.EnableMultipleGrants }).(pulumi.BoolPtrOutput)
}

// The name of the masking policy on which to grant privileges immediately.
func (o MaskingPolicyGrantOutput) MaskingPolicyName() pulumi.StringOutput {
	return o.ApplyT(func(v *MaskingPolicyGrant) pulumi.StringOutput { return v.MaskingPolicyName }).(pulumi.StringOutput)
}

// The privilege to grant on the masking policy.
func (o MaskingPolicyGrantOutput) Privilege() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *MaskingPolicyGrant) pulumi.StringPtrOutput { return v.Privilege }).(pulumi.StringPtrOutput)
}

// Grants privilege to these roles.
func (o MaskingPolicyGrantOutput) Roles() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *MaskingPolicyGrant) pulumi.StringArrayOutput { return v.Roles }).(pulumi.StringArrayOutput)
}

// The name of the schema containing the masking policy on which to grant privileges.
func (o MaskingPolicyGrantOutput) SchemaName() pulumi.StringOutput {
	return o.ApplyT(func(v *MaskingPolicyGrant) pulumi.StringOutput { return v.SchemaName }).(pulumi.StringOutput)
}

// When this is set to true, allows the recipient role to grant the privileges to other roles.
func (o MaskingPolicyGrantOutput) WithGrantOption() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *MaskingPolicyGrant) pulumi.BoolPtrOutput { return v.WithGrantOption }).(pulumi.BoolPtrOutput)
}

type MaskingPolicyGrantArrayOutput struct{ *pulumi.OutputState }

func (MaskingPolicyGrantArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MaskingPolicyGrant)(nil)).Elem()
}

func (o MaskingPolicyGrantArrayOutput) ToMaskingPolicyGrantArrayOutput() MaskingPolicyGrantArrayOutput {
	return o
}

func (o MaskingPolicyGrantArrayOutput) ToMaskingPolicyGrantArrayOutputWithContext(ctx context.Context) MaskingPolicyGrantArrayOutput {
	return o
}

func (o MaskingPolicyGrantArrayOutput) Index(i pulumi.IntInput) MaskingPolicyGrantOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *MaskingPolicyGrant {
		return vs[0].([]*MaskingPolicyGrant)[vs[1].(int)]
	}).(MaskingPolicyGrantOutput)
}

type MaskingPolicyGrantMapOutput struct{ *pulumi.OutputState }

func (MaskingPolicyGrantMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MaskingPolicyGrant)(nil)).Elem()
}

func (o MaskingPolicyGrantMapOutput) ToMaskingPolicyGrantMapOutput() MaskingPolicyGrantMapOutput {
	return o
}

func (o MaskingPolicyGrantMapOutput) ToMaskingPolicyGrantMapOutputWithContext(ctx context.Context) MaskingPolicyGrantMapOutput {
	return o
}

func (o MaskingPolicyGrantMapOutput) MapIndex(k pulumi.StringInput) MaskingPolicyGrantOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *MaskingPolicyGrant {
		return vs[0].(map[string]*MaskingPolicyGrant)[vs[1].(string)]
	}).(MaskingPolicyGrantOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*MaskingPolicyGrantInput)(nil)).Elem(), &MaskingPolicyGrant{})
	pulumi.RegisterInputType(reflect.TypeOf((*MaskingPolicyGrantArrayInput)(nil)).Elem(), MaskingPolicyGrantArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*MaskingPolicyGrantMapInput)(nil)).Elem(), MaskingPolicyGrantMap{})
	pulumi.RegisterOutputType(MaskingPolicyGrantOutput{})
	pulumi.RegisterOutputType(MaskingPolicyGrantArrayOutput{})
	pulumi.RegisterOutputType(MaskingPolicyGrantMapOutput{})
}
