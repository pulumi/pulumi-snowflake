// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package snowflake

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-snowflake/sdk/go/snowflake/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-snowflake/sdk/go/snowflake"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := snowflake.NewMaskingPolicy(ctx, "test", &snowflake.MaskingPolicyArgs{
//				Database: pulumi.String("EXAMPLE_DB"),
//				MaskingExpression: pulumi.String(`  case
//	    when current_role() in ('ROLE_A') then
//	      val
//	    when is_role_in_session( 'ROLE_B' ) then
//	      'ABC123'
//	    else
//	      '******'
//	  end
//
// `),
//
//				ReturnDataType: pulumi.String("VARCHAR"),
//				Schema:         pulumi.String("EXAMPLE_SCHEMA"),
//				Signature: &snowflake.MaskingPolicySignatureArgs{
//					Columns: snowflake.MaskingPolicySignatureColumnArray{
//						&snowflake.MaskingPolicySignatureColumnArgs{
//							Name: pulumi.String("val"),
//							Type: pulumi.String("VARCHAR"),
//						},
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// format is database name | schema name | policy name
//
// ```sh
//
//	$ pulumi import snowflake:index/maskingPolicy:MaskingPolicy example 'dbName|schemaName|policyName'
//
// ```
type MaskingPolicy struct {
	pulumi.CustomResourceState

	// Specifies a comment for the masking policy.
	Comment pulumi.StringPtrOutput `pulumi:"comment"`
	// The database in which to create the masking policy.
	Database pulumi.StringOutput `pulumi:"database"`
	// Specifies whether the row access policy or conditional masking policy can reference a column that is already protected by a masking policy.
	ExemptOtherPolicies pulumi.BoolPtrOutput `pulumi:"exemptOtherPolicies"`
	// Prevent overwriting a previous masking policy with the same name.
	IfNotExists pulumi.BoolPtrOutput `pulumi:"ifNotExists"`
	// Specifies the SQL expression that transforms the data.
	MaskingExpression pulumi.StringOutput `pulumi:"maskingExpression"`
	// Specifies the column name to mask.
	Name pulumi.StringOutput `pulumi:"name"`
	// Whether to override a previous masking policy with the same name.
	OrReplace pulumi.BoolPtrOutput `pulumi:"orReplace"`
	// Specifies the qualified identifier for the masking policy.
	QualifiedName pulumi.StringOutput `pulumi:"qualifiedName"`
	// Specifies the data type to return.
	ReturnDataType pulumi.StringOutput `pulumi:"returnDataType"`
	// The schema in which to create the masking policy.
	Schema pulumi.StringOutput `pulumi:"schema"`
	// The signature for the masking policy; specifies the input columns and data types to evaluate at query runtime.
	Signature MaskingPolicySignatureOutput `pulumi:"signature"`
}

// NewMaskingPolicy registers a new resource with the given unique name, arguments, and options.
func NewMaskingPolicy(ctx *pulumi.Context,
	name string, args *MaskingPolicyArgs, opts ...pulumi.ResourceOption) (*MaskingPolicy, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Database == nil {
		return nil, errors.New("invalid value for required argument 'Database'")
	}
	if args.MaskingExpression == nil {
		return nil, errors.New("invalid value for required argument 'MaskingExpression'")
	}
	if args.ReturnDataType == nil {
		return nil, errors.New("invalid value for required argument 'ReturnDataType'")
	}
	if args.Schema == nil {
		return nil, errors.New("invalid value for required argument 'Schema'")
	}
	if args.Signature == nil {
		return nil, errors.New("invalid value for required argument 'Signature'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource MaskingPolicy
	err := ctx.RegisterResource("snowflake:index/maskingPolicy:MaskingPolicy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetMaskingPolicy gets an existing MaskingPolicy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetMaskingPolicy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *MaskingPolicyState, opts ...pulumi.ResourceOption) (*MaskingPolicy, error) {
	var resource MaskingPolicy
	err := ctx.ReadResource("snowflake:index/maskingPolicy:MaskingPolicy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering MaskingPolicy resources.
type maskingPolicyState struct {
	// Specifies a comment for the masking policy.
	Comment *string `pulumi:"comment"`
	// The database in which to create the masking policy.
	Database *string `pulumi:"database"`
	// Specifies whether the row access policy or conditional masking policy can reference a column that is already protected by a masking policy.
	ExemptOtherPolicies *bool `pulumi:"exemptOtherPolicies"`
	// Prevent overwriting a previous masking policy with the same name.
	IfNotExists *bool `pulumi:"ifNotExists"`
	// Specifies the SQL expression that transforms the data.
	MaskingExpression *string `pulumi:"maskingExpression"`
	// Specifies the column name to mask.
	Name *string `pulumi:"name"`
	// Whether to override a previous masking policy with the same name.
	OrReplace *bool `pulumi:"orReplace"`
	// Specifies the qualified identifier for the masking policy.
	QualifiedName *string `pulumi:"qualifiedName"`
	// Specifies the data type to return.
	ReturnDataType *string `pulumi:"returnDataType"`
	// The schema in which to create the masking policy.
	Schema *string `pulumi:"schema"`
	// The signature for the masking policy; specifies the input columns and data types to evaluate at query runtime.
	Signature *MaskingPolicySignature `pulumi:"signature"`
}

type MaskingPolicyState struct {
	// Specifies a comment for the masking policy.
	Comment pulumi.StringPtrInput
	// The database in which to create the masking policy.
	Database pulumi.StringPtrInput
	// Specifies whether the row access policy or conditional masking policy can reference a column that is already protected by a masking policy.
	ExemptOtherPolicies pulumi.BoolPtrInput
	// Prevent overwriting a previous masking policy with the same name.
	IfNotExists pulumi.BoolPtrInput
	// Specifies the SQL expression that transforms the data.
	MaskingExpression pulumi.StringPtrInput
	// Specifies the column name to mask.
	Name pulumi.StringPtrInput
	// Whether to override a previous masking policy with the same name.
	OrReplace pulumi.BoolPtrInput
	// Specifies the qualified identifier for the masking policy.
	QualifiedName pulumi.StringPtrInput
	// Specifies the data type to return.
	ReturnDataType pulumi.StringPtrInput
	// The schema in which to create the masking policy.
	Schema pulumi.StringPtrInput
	// The signature for the masking policy; specifies the input columns and data types to evaluate at query runtime.
	Signature MaskingPolicySignaturePtrInput
}

func (MaskingPolicyState) ElementType() reflect.Type {
	return reflect.TypeOf((*maskingPolicyState)(nil)).Elem()
}

type maskingPolicyArgs struct {
	// Specifies a comment for the masking policy.
	Comment *string `pulumi:"comment"`
	// The database in which to create the masking policy.
	Database string `pulumi:"database"`
	// Specifies whether the row access policy or conditional masking policy can reference a column that is already protected by a masking policy.
	ExemptOtherPolicies *bool `pulumi:"exemptOtherPolicies"`
	// Prevent overwriting a previous masking policy with the same name.
	IfNotExists *bool `pulumi:"ifNotExists"`
	// Specifies the SQL expression that transforms the data.
	MaskingExpression string `pulumi:"maskingExpression"`
	// Specifies the column name to mask.
	Name *string `pulumi:"name"`
	// Whether to override a previous masking policy with the same name.
	OrReplace *bool `pulumi:"orReplace"`
	// Specifies the data type to return.
	ReturnDataType string `pulumi:"returnDataType"`
	// The schema in which to create the masking policy.
	Schema string `pulumi:"schema"`
	// The signature for the masking policy; specifies the input columns and data types to evaluate at query runtime.
	Signature MaskingPolicySignature `pulumi:"signature"`
}

// The set of arguments for constructing a MaskingPolicy resource.
type MaskingPolicyArgs struct {
	// Specifies a comment for the masking policy.
	Comment pulumi.StringPtrInput
	// The database in which to create the masking policy.
	Database pulumi.StringInput
	// Specifies whether the row access policy or conditional masking policy can reference a column that is already protected by a masking policy.
	ExemptOtherPolicies pulumi.BoolPtrInput
	// Prevent overwriting a previous masking policy with the same name.
	IfNotExists pulumi.BoolPtrInput
	// Specifies the SQL expression that transforms the data.
	MaskingExpression pulumi.StringInput
	// Specifies the column name to mask.
	Name pulumi.StringPtrInput
	// Whether to override a previous masking policy with the same name.
	OrReplace pulumi.BoolPtrInput
	// Specifies the data type to return.
	ReturnDataType pulumi.StringInput
	// The schema in which to create the masking policy.
	Schema pulumi.StringInput
	// The signature for the masking policy; specifies the input columns and data types to evaluate at query runtime.
	Signature MaskingPolicySignatureInput
}

func (MaskingPolicyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*maskingPolicyArgs)(nil)).Elem()
}

type MaskingPolicyInput interface {
	pulumi.Input

	ToMaskingPolicyOutput() MaskingPolicyOutput
	ToMaskingPolicyOutputWithContext(ctx context.Context) MaskingPolicyOutput
}

func (*MaskingPolicy) ElementType() reflect.Type {
	return reflect.TypeOf((**MaskingPolicy)(nil)).Elem()
}

func (i *MaskingPolicy) ToMaskingPolicyOutput() MaskingPolicyOutput {
	return i.ToMaskingPolicyOutputWithContext(context.Background())
}

func (i *MaskingPolicy) ToMaskingPolicyOutputWithContext(ctx context.Context) MaskingPolicyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MaskingPolicyOutput)
}

func (i *MaskingPolicy) ToOutput(ctx context.Context) pulumix.Output[*MaskingPolicy] {
	return pulumix.Output[*MaskingPolicy]{
		OutputState: i.ToMaskingPolicyOutputWithContext(ctx).OutputState,
	}
}

// MaskingPolicyArrayInput is an input type that accepts MaskingPolicyArray and MaskingPolicyArrayOutput values.
// You can construct a concrete instance of `MaskingPolicyArrayInput` via:
//
//	MaskingPolicyArray{ MaskingPolicyArgs{...} }
type MaskingPolicyArrayInput interface {
	pulumi.Input

	ToMaskingPolicyArrayOutput() MaskingPolicyArrayOutput
	ToMaskingPolicyArrayOutputWithContext(context.Context) MaskingPolicyArrayOutput
}

type MaskingPolicyArray []MaskingPolicyInput

func (MaskingPolicyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MaskingPolicy)(nil)).Elem()
}

func (i MaskingPolicyArray) ToMaskingPolicyArrayOutput() MaskingPolicyArrayOutput {
	return i.ToMaskingPolicyArrayOutputWithContext(context.Background())
}

func (i MaskingPolicyArray) ToMaskingPolicyArrayOutputWithContext(ctx context.Context) MaskingPolicyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MaskingPolicyArrayOutput)
}

func (i MaskingPolicyArray) ToOutput(ctx context.Context) pulumix.Output[[]*MaskingPolicy] {
	return pulumix.Output[[]*MaskingPolicy]{
		OutputState: i.ToMaskingPolicyArrayOutputWithContext(ctx).OutputState,
	}
}

// MaskingPolicyMapInput is an input type that accepts MaskingPolicyMap and MaskingPolicyMapOutput values.
// You can construct a concrete instance of `MaskingPolicyMapInput` via:
//
//	MaskingPolicyMap{ "key": MaskingPolicyArgs{...} }
type MaskingPolicyMapInput interface {
	pulumi.Input

	ToMaskingPolicyMapOutput() MaskingPolicyMapOutput
	ToMaskingPolicyMapOutputWithContext(context.Context) MaskingPolicyMapOutput
}

type MaskingPolicyMap map[string]MaskingPolicyInput

func (MaskingPolicyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MaskingPolicy)(nil)).Elem()
}

func (i MaskingPolicyMap) ToMaskingPolicyMapOutput() MaskingPolicyMapOutput {
	return i.ToMaskingPolicyMapOutputWithContext(context.Background())
}

func (i MaskingPolicyMap) ToMaskingPolicyMapOutputWithContext(ctx context.Context) MaskingPolicyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MaskingPolicyMapOutput)
}

func (i MaskingPolicyMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*MaskingPolicy] {
	return pulumix.Output[map[string]*MaskingPolicy]{
		OutputState: i.ToMaskingPolicyMapOutputWithContext(ctx).OutputState,
	}
}

type MaskingPolicyOutput struct{ *pulumi.OutputState }

func (MaskingPolicyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**MaskingPolicy)(nil)).Elem()
}

func (o MaskingPolicyOutput) ToMaskingPolicyOutput() MaskingPolicyOutput {
	return o
}

func (o MaskingPolicyOutput) ToMaskingPolicyOutputWithContext(ctx context.Context) MaskingPolicyOutput {
	return o
}

func (o MaskingPolicyOutput) ToOutput(ctx context.Context) pulumix.Output[*MaskingPolicy] {
	return pulumix.Output[*MaskingPolicy]{
		OutputState: o.OutputState,
	}
}

// Specifies a comment for the masking policy.
func (o MaskingPolicyOutput) Comment() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *MaskingPolicy) pulumi.StringPtrOutput { return v.Comment }).(pulumi.StringPtrOutput)
}

// The database in which to create the masking policy.
func (o MaskingPolicyOutput) Database() pulumi.StringOutput {
	return o.ApplyT(func(v *MaskingPolicy) pulumi.StringOutput { return v.Database }).(pulumi.StringOutput)
}

// Specifies whether the row access policy or conditional masking policy can reference a column that is already protected by a masking policy.
func (o MaskingPolicyOutput) ExemptOtherPolicies() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *MaskingPolicy) pulumi.BoolPtrOutput { return v.ExemptOtherPolicies }).(pulumi.BoolPtrOutput)
}

// Prevent overwriting a previous masking policy with the same name.
func (o MaskingPolicyOutput) IfNotExists() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *MaskingPolicy) pulumi.BoolPtrOutput { return v.IfNotExists }).(pulumi.BoolPtrOutput)
}

// Specifies the SQL expression that transforms the data.
func (o MaskingPolicyOutput) MaskingExpression() pulumi.StringOutput {
	return o.ApplyT(func(v *MaskingPolicy) pulumi.StringOutput { return v.MaskingExpression }).(pulumi.StringOutput)
}

// Specifies the column name to mask.
func (o MaskingPolicyOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *MaskingPolicy) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Whether to override a previous masking policy with the same name.
func (o MaskingPolicyOutput) OrReplace() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *MaskingPolicy) pulumi.BoolPtrOutput { return v.OrReplace }).(pulumi.BoolPtrOutput)
}

// Specifies the qualified identifier for the masking policy.
func (o MaskingPolicyOutput) QualifiedName() pulumi.StringOutput {
	return o.ApplyT(func(v *MaskingPolicy) pulumi.StringOutput { return v.QualifiedName }).(pulumi.StringOutput)
}

// Specifies the data type to return.
func (o MaskingPolicyOutput) ReturnDataType() pulumi.StringOutput {
	return o.ApplyT(func(v *MaskingPolicy) pulumi.StringOutput { return v.ReturnDataType }).(pulumi.StringOutput)
}

// The schema in which to create the masking policy.
func (o MaskingPolicyOutput) Schema() pulumi.StringOutput {
	return o.ApplyT(func(v *MaskingPolicy) pulumi.StringOutput { return v.Schema }).(pulumi.StringOutput)
}

// The signature for the masking policy; specifies the input columns and data types to evaluate at query runtime.
func (o MaskingPolicyOutput) Signature() MaskingPolicySignatureOutput {
	return o.ApplyT(func(v *MaskingPolicy) MaskingPolicySignatureOutput { return v.Signature }).(MaskingPolicySignatureOutput)
}

type MaskingPolicyArrayOutput struct{ *pulumi.OutputState }

func (MaskingPolicyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MaskingPolicy)(nil)).Elem()
}

func (o MaskingPolicyArrayOutput) ToMaskingPolicyArrayOutput() MaskingPolicyArrayOutput {
	return o
}

func (o MaskingPolicyArrayOutput) ToMaskingPolicyArrayOutputWithContext(ctx context.Context) MaskingPolicyArrayOutput {
	return o
}

func (o MaskingPolicyArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*MaskingPolicy] {
	return pulumix.Output[[]*MaskingPolicy]{
		OutputState: o.OutputState,
	}
}

func (o MaskingPolicyArrayOutput) Index(i pulumi.IntInput) MaskingPolicyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *MaskingPolicy {
		return vs[0].([]*MaskingPolicy)[vs[1].(int)]
	}).(MaskingPolicyOutput)
}

type MaskingPolicyMapOutput struct{ *pulumi.OutputState }

func (MaskingPolicyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MaskingPolicy)(nil)).Elem()
}

func (o MaskingPolicyMapOutput) ToMaskingPolicyMapOutput() MaskingPolicyMapOutput {
	return o
}

func (o MaskingPolicyMapOutput) ToMaskingPolicyMapOutputWithContext(ctx context.Context) MaskingPolicyMapOutput {
	return o
}

func (o MaskingPolicyMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*MaskingPolicy] {
	return pulumix.Output[map[string]*MaskingPolicy]{
		OutputState: o.OutputState,
	}
}

func (o MaskingPolicyMapOutput) MapIndex(k pulumi.StringInput) MaskingPolicyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *MaskingPolicy {
		return vs[0].(map[string]*MaskingPolicy)[vs[1].(string)]
	}).(MaskingPolicyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*MaskingPolicyInput)(nil)).Elem(), &MaskingPolicy{})
	pulumi.RegisterInputType(reflect.TypeOf((*MaskingPolicyArrayInput)(nil)).Elem(), MaskingPolicyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*MaskingPolicyMapInput)(nil)).Elem(), MaskingPolicyMap{})
	pulumi.RegisterOutputType(MaskingPolicyOutput{})
	pulumi.RegisterOutputType(MaskingPolicyArrayOutput{})
	pulumi.RegisterOutputType(MaskingPolicyMapOutput{})
}
