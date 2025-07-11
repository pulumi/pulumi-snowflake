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
// $ pulumi import snowflake:index/maskingPolicy:MaskingPolicy example '"<database_name>"."<schema_name>"."<masking_policy_name>"'
// ```
type MaskingPolicy struct {
	pulumi.CustomResourceState

	// List of the arguments for the masking policy. The first column and its data type always indicate the column data type values to mask or tokenize in the subsequent policy conditions. Note that you can not specify a virtual column as the first column argument in a conditional masking policy.
	Arguments MaskingPolicyArgumentArrayOutput `pulumi:"arguments"`
	// Specifies the SQL expression that transforms the data. To mitigate permadiff on this field, the provider replaces blank characters with a space. This can lead to false positives in cases where a change in case or run of whitespace is semantically significant.
	Body pulumi.StringOutput `pulumi:"body"`
	// Specifies a comment for the masking policy.
	Comment pulumi.StringPtrOutput `pulumi:"comment"`
	// The database in which to create the masking policy. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Database pulumi.StringOutput `pulumi:"database"`
	// Outputs the result of `DESCRIBE MASKING POLICY` for the given masking policy.
	DescribeOutputs MaskingPolicyDescribeOutputArrayOutput `pulumi:"describeOutputs"`
	// (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`default`)) Specifies whether the row access policy or conditional masking policy can reference a column that is already protected by a masking policy. Due to Snowflake limitations, when value is changed, the resource is recreated. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
	ExemptOtherPolicies pulumi.StringPtrOutput `pulumi:"exemptOtherPolicies"`
	// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
	FullyQualifiedName pulumi.StringOutput `pulumi:"fullyQualifiedName"`
	// Specifies the identifier for the masking policy; must be unique for the database and schema in which the masking policy is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Name pulumi.StringOutput `pulumi:"name"`
	// The return data type must match the input data type of the first column that is specified as an input column. For more information about data types, check [Snowflake docs](https://docs.snowflake.com/en/sql-reference/intro-summary-data-types).
	ReturnDataType pulumi.StringOutput `pulumi:"returnDataType"`
	// The schema in which to create the masking policy. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Schema pulumi.StringOutput `pulumi:"schema"`
	// Outputs the result of `SHOW MASKING POLICIES` for the given masking policy.
	ShowOutputs MaskingPolicyShowOutputArrayOutput `pulumi:"showOutputs"`
}

// NewMaskingPolicy registers a new resource with the given unique name, arguments, and options.
func NewMaskingPolicy(ctx *pulumi.Context,
	name string, args *MaskingPolicyArgs, opts ...pulumi.ResourceOption) (*MaskingPolicy, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Arguments == nil {
		return nil, errors.New("invalid value for required argument 'Arguments'")
	}
	if args.Body == nil {
		return nil, errors.New("invalid value for required argument 'Body'")
	}
	if args.Database == nil {
		return nil, errors.New("invalid value for required argument 'Database'")
	}
	if args.ReturnDataType == nil {
		return nil, errors.New("invalid value for required argument 'ReturnDataType'")
	}
	if args.Schema == nil {
		return nil, errors.New("invalid value for required argument 'Schema'")
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
	// List of the arguments for the masking policy. The first column and its data type always indicate the column data type values to mask or tokenize in the subsequent policy conditions. Note that you can not specify a virtual column as the first column argument in a conditional masking policy.
	Arguments []MaskingPolicyArgument `pulumi:"arguments"`
	// Specifies the SQL expression that transforms the data. To mitigate permadiff on this field, the provider replaces blank characters with a space. This can lead to false positives in cases where a change in case or run of whitespace is semantically significant.
	Body *string `pulumi:"body"`
	// Specifies a comment for the masking policy.
	Comment *string `pulumi:"comment"`
	// The database in which to create the masking policy. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Database *string `pulumi:"database"`
	// Outputs the result of `DESCRIBE MASKING POLICY` for the given masking policy.
	DescribeOutputs []MaskingPolicyDescribeOutput `pulumi:"describeOutputs"`
	// (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`default`)) Specifies whether the row access policy or conditional masking policy can reference a column that is already protected by a masking policy. Due to Snowflake limitations, when value is changed, the resource is recreated. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
	ExemptOtherPolicies *string `pulumi:"exemptOtherPolicies"`
	// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
	FullyQualifiedName *string `pulumi:"fullyQualifiedName"`
	// Specifies the identifier for the masking policy; must be unique for the database and schema in which the masking policy is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Name *string `pulumi:"name"`
	// The return data type must match the input data type of the first column that is specified as an input column. For more information about data types, check [Snowflake docs](https://docs.snowflake.com/en/sql-reference/intro-summary-data-types).
	ReturnDataType *string `pulumi:"returnDataType"`
	// The schema in which to create the masking policy. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Schema *string `pulumi:"schema"`
	// Outputs the result of `SHOW MASKING POLICIES` for the given masking policy.
	ShowOutputs []MaskingPolicyShowOutput `pulumi:"showOutputs"`
}

type MaskingPolicyState struct {
	// List of the arguments for the masking policy. The first column and its data type always indicate the column data type values to mask or tokenize in the subsequent policy conditions. Note that you can not specify a virtual column as the first column argument in a conditional masking policy.
	Arguments MaskingPolicyArgumentArrayInput
	// Specifies the SQL expression that transforms the data. To mitigate permadiff on this field, the provider replaces blank characters with a space. This can lead to false positives in cases where a change in case or run of whitespace is semantically significant.
	Body pulumi.StringPtrInput
	// Specifies a comment for the masking policy.
	Comment pulumi.StringPtrInput
	// The database in which to create the masking policy. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Database pulumi.StringPtrInput
	// Outputs the result of `DESCRIBE MASKING POLICY` for the given masking policy.
	DescribeOutputs MaskingPolicyDescribeOutputArrayInput
	// (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`default`)) Specifies whether the row access policy or conditional masking policy can reference a column that is already protected by a masking policy. Due to Snowflake limitations, when value is changed, the resource is recreated. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
	ExemptOtherPolicies pulumi.StringPtrInput
	// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
	FullyQualifiedName pulumi.StringPtrInput
	// Specifies the identifier for the masking policy; must be unique for the database and schema in which the masking policy is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Name pulumi.StringPtrInput
	// The return data type must match the input data type of the first column that is specified as an input column. For more information about data types, check [Snowflake docs](https://docs.snowflake.com/en/sql-reference/intro-summary-data-types).
	ReturnDataType pulumi.StringPtrInput
	// The schema in which to create the masking policy. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Schema pulumi.StringPtrInput
	// Outputs the result of `SHOW MASKING POLICIES` for the given masking policy.
	ShowOutputs MaskingPolicyShowOutputArrayInput
}

func (MaskingPolicyState) ElementType() reflect.Type {
	return reflect.TypeOf((*maskingPolicyState)(nil)).Elem()
}

type maskingPolicyArgs struct {
	// List of the arguments for the masking policy. The first column and its data type always indicate the column data type values to mask or tokenize in the subsequent policy conditions. Note that you can not specify a virtual column as the first column argument in a conditional masking policy.
	Arguments []MaskingPolicyArgument `pulumi:"arguments"`
	// Specifies the SQL expression that transforms the data. To mitigate permadiff on this field, the provider replaces blank characters with a space. This can lead to false positives in cases where a change in case or run of whitespace is semantically significant.
	Body string `pulumi:"body"`
	// Specifies a comment for the masking policy.
	Comment *string `pulumi:"comment"`
	// The database in which to create the masking policy. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Database string `pulumi:"database"`
	// (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`default`)) Specifies whether the row access policy or conditional masking policy can reference a column that is already protected by a masking policy. Due to Snowflake limitations, when value is changed, the resource is recreated. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
	ExemptOtherPolicies *string `pulumi:"exemptOtherPolicies"`
	// Specifies the identifier for the masking policy; must be unique for the database and schema in which the masking policy is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Name *string `pulumi:"name"`
	// The return data type must match the input data type of the first column that is specified as an input column. For more information about data types, check [Snowflake docs](https://docs.snowflake.com/en/sql-reference/intro-summary-data-types).
	ReturnDataType string `pulumi:"returnDataType"`
	// The schema in which to create the masking policy. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Schema string `pulumi:"schema"`
}

// The set of arguments for constructing a MaskingPolicy resource.
type MaskingPolicyArgs struct {
	// List of the arguments for the masking policy. The first column and its data type always indicate the column data type values to mask or tokenize in the subsequent policy conditions. Note that you can not specify a virtual column as the first column argument in a conditional masking policy.
	Arguments MaskingPolicyArgumentArrayInput
	// Specifies the SQL expression that transforms the data. To mitigate permadiff on this field, the provider replaces blank characters with a space. This can lead to false positives in cases where a change in case or run of whitespace is semantically significant.
	Body pulumi.StringInput
	// Specifies a comment for the masking policy.
	Comment pulumi.StringPtrInput
	// The database in which to create the masking policy. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Database pulumi.StringInput
	// (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`default`)) Specifies whether the row access policy or conditional masking policy can reference a column that is already protected by a masking policy. Due to Snowflake limitations, when value is changed, the resource is recreated. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
	ExemptOtherPolicies pulumi.StringPtrInput
	// Specifies the identifier for the masking policy; must be unique for the database and schema in which the masking policy is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Name pulumi.StringPtrInput
	// The return data type must match the input data type of the first column that is specified as an input column. For more information about data types, check [Snowflake docs](https://docs.snowflake.com/en/sql-reference/intro-summary-data-types).
	ReturnDataType pulumi.StringInput
	// The schema in which to create the masking policy. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Schema pulumi.StringInput
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

// List of the arguments for the masking policy. The first column and its data type always indicate the column data type values to mask or tokenize in the subsequent policy conditions. Note that you can not specify a virtual column as the first column argument in a conditional masking policy.
func (o MaskingPolicyOutput) Arguments() MaskingPolicyArgumentArrayOutput {
	return o.ApplyT(func(v *MaskingPolicy) MaskingPolicyArgumentArrayOutput { return v.Arguments }).(MaskingPolicyArgumentArrayOutput)
}

// Specifies the SQL expression that transforms the data. To mitigate permadiff on this field, the provider replaces blank characters with a space. This can lead to false positives in cases where a change in case or run of whitespace is semantically significant.
func (o MaskingPolicyOutput) Body() pulumi.StringOutput {
	return o.ApplyT(func(v *MaskingPolicy) pulumi.StringOutput { return v.Body }).(pulumi.StringOutput)
}

// Specifies a comment for the masking policy.
func (o MaskingPolicyOutput) Comment() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *MaskingPolicy) pulumi.StringPtrOutput { return v.Comment }).(pulumi.StringPtrOutput)
}

// The database in which to create the masking policy. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
func (o MaskingPolicyOutput) Database() pulumi.StringOutput {
	return o.ApplyT(func(v *MaskingPolicy) pulumi.StringOutput { return v.Database }).(pulumi.StringOutput)
}

// Outputs the result of `DESCRIBE MASKING POLICY` for the given masking policy.
func (o MaskingPolicyOutput) DescribeOutputs() MaskingPolicyDescribeOutputArrayOutput {
	return o.ApplyT(func(v *MaskingPolicy) MaskingPolicyDescribeOutputArrayOutput { return v.DescribeOutputs }).(MaskingPolicyDescribeOutputArrayOutput)
}

// (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`default`)) Specifies whether the row access policy or conditional masking policy can reference a column that is already protected by a masking policy. Due to Snowflake limitations, when value is changed, the resource is recreated. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
func (o MaskingPolicyOutput) ExemptOtherPolicies() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *MaskingPolicy) pulumi.StringPtrOutput { return v.ExemptOtherPolicies }).(pulumi.StringPtrOutput)
}

// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
func (o MaskingPolicyOutput) FullyQualifiedName() pulumi.StringOutput {
	return o.ApplyT(func(v *MaskingPolicy) pulumi.StringOutput { return v.FullyQualifiedName }).(pulumi.StringOutput)
}

// Specifies the identifier for the masking policy; must be unique for the database and schema in which the masking policy is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
func (o MaskingPolicyOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *MaskingPolicy) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The return data type must match the input data type of the first column that is specified as an input column. For more information about data types, check [Snowflake docs](https://docs.snowflake.com/en/sql-reference/intro-summary-data-types).
func (o MaskingPolicyOutput) ReturnDataType() pulumi.StringOutput {
	return o.ApplyT(func(v *MaskingPolicy) pulumi.StringOutput { return v.ReturnDataType }).(pulumi.StringOutput)
}

// The schema in which to create the masking policy. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
func (o MaskingPolicyOutput) Schema() pulumi.StringOutput {
	return o.ApplyT(func(v *MaskingPolicy) pulumi.StringOutput { return v.Schema }).(pulumi.StringOutput)
}

// Outputs the result of `SHOW MASKING POLICIES` for the given masking policy.
func (o MaskingPolicyOutput) ShowOutputs() MaskingPolicyShowOutputArrayOutput {
	return o.ApplyT(func(v *MaskingPolicy) MaskingPolicyShowOutputArrayOutput { return v.ShowOutputs }).(MaskingPolicyShowOutputArrayOutput)
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
