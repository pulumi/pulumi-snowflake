// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package snowflake

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
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
//			_, err := snowflake.NewRowAccessPolicy(ctx, "exampleRowAccessPolicy", &snowflake.RowAccessPolicyArgs{
//				Database:            pulumi.String("EXAMPLE_DB"),
//				RowAccessExpression: pulumi.String("case when current_role() in ('ANALYST') then true else false end"),
//				Schema:              pulumi.String("EXAMPLE_SCHEMA"),
//				Signature: pulumi.StringMap{
//					"A": pulumi.String("VARCHAR"),
//					"B": pulumi.String("VARCHAR"),
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
//	$ pulumi import snowflake:index/rowAccessPolicy:RowAccessPolicy example 'dbName|schemaName|policyName'
//
// ```
type RowAccessPolicy struct {
	pulumi.CustomResourceState

	// Specifies a comment for the row access policy.
	Comment pulumi.StringPtrOutput `pulumi:"comment"`
	// The database in which to create the row access policy.
	Database pulumi.StringOutput `pulumi:"database"`
	// Specifies the identifier for the row access policy; must be unique for the database and schema in which the row access policy is created.
	Name pulumi.StringOutput `pulumi:"name"`
	// Specifies the SQL expression. The expression can be any boolean-valued SQL expression.
	RowAccessExpression pulumi.StringOutput `pulumi:"rowAccessExpression"`
	// The schema in which to create the row access policy.
	Schema pulumi.StringOutput `pulumi:"schema"`
	// Specifies signature (arguments) for the row access policy (uppercase and sorted to avoid recreation of resource). A signature specifies a set of attributes that must be considered to determine whether the row is accessible. The attribute values come from the database object (e.g. table or view) to be protected by the row access policy.
	Signature pulumi.StringMapOutput `pulumi:"signature"`
}

// NewRowAccessPolicy registers a new resource with the given unique name, arguments, and options.
func NewRowAccessPolicy(ctx *pulumi.Context,
	name string, args *RowAccessPolicyArgs, opts ...pulumi.ResourceOption) (*RowAccessPolicy, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Database == nil {
		return nil, errors.New("invalid value for required argument 'Database'")
	}
	if args.RowAccessExpression == nil {
		return nil, errors.New("invalid value for required argument 'RowAccessExpression'")
	}
	if args.Schema == nil {
		return nil, errors.New("invalid value for required argument 'Schema'")
	}
	if args.Signature == nil {
		return nil, errors.New("invalid value for required argument 'Signature'")
	}
	var resource RowAccessPolicy
	err := ctx.RegisterResource("snowflake:index/rowAccessPolicy:RowAccessPolicy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRowAccessPolicy gets an existing RowAccessPolicy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRowAccessPolicy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RowAccessPolicyState, opts ...pulumi.ResourceOption) (*RowAccessPolicy, error) {
	var resource RowAccessPolicy
	err := ctx.ReadResource("snowflake:index/rowAccessPolicy:RowAccessPolicy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering RowAccessPolicy resources.
type rowAccessPolicyState struct {
	// Specifies a comment for the row access policy.
	Comment *string `pulumi:"comment"`
	// The database in which to create the row access policy.
	Database *string `pulumi:"database"`
	// Specifies the identifier for the row access policy; must be unique for the database and schema in which the row access policy is created.
	Name *string `pulumi:"name"`
	// Specifies the SQL expression. The expression can be any boolean-valued SQL expression.
	RowAccessExpression *string `pulumi:"rowAccessExpression"`
	// The schema in which to create the row access policy.
	Schema *string `pulumi:"schema"`
	// Specifies signature (arguments) for the row access policy (uppercase and sorted to avoid recreation of resource). A signature specifies a set of attributes that must be considered to determine whether the row is accessible. The attribute values come from the database object (e.g. table or view) to be protected by the row access policy.
	Signature map[string]string `pulumi:"signature"`
}

type RowAccessPolicyState struct {
	// Specifies a comment for the row access policy.
	Comment pulumi.StringPtrInput
	// The database in which to create the row access policy.
	Database pulumi.StringPtrInput
	// Specifies the identifier for the row access policy; must be unique for the database and schema in which the row access policy is created.
	Name pulumi.StringPtrInput
	// Specifies the SQL expression. The expression can be any boolean-valued SQL expression.
	RowAccessExpression pulumi.StringPtrInput
	// The schema in which to create the row access policy.
	Schema pulumi.StringPtrInput
	// Specifies signature (arguments) for the row access policy (uppercase and sorted to avoid recreation of resource). A signature specifies a set of attributes that must be considered to determine whether the row is accessible. The attribute values come from the database object (e.g. table or view) to be protected by the row access policy.
	Signature pulumi.StringMapInput
}

func (RowAccessPolicyState) ElementType() reflect.Type {
	return reflect.TypeOf((*rowAccessPolicyState)(nil)).Elem()
}

type rowAccessPolicyArgs struct {
	// Specifies a comment for the row access policy.
	Comment *string `pulumi:"comment"`
	// The database in which to create the row access policy.
	Database string `pulumi:"database"`
	// Specifies the identifier for the row access policy; must be unique for the database and schema in which the row access policy is created.
	Name *string `pulumi:"name"`
	// Specifies the SQL expression. The expression can be any boolean-valued SQL expression.
	RowAccessExpression string `pulumi:"rowAccessExpression"`
	// The schema in which to create the row access policy.
	Schema string `pulumi:"schema"`
	// Specifies signature (arguments) for the row access policy (uppercase and sorted to avoid recreation of resource). A signature specifies a set of attributes that must be considered to determine whether the row is accessible. The attribute values come from the database object (e.g. table or view) to be protected by the row access policy.
	Signature map[string]string `pulumi:"signature"`
}

// The set of arguments for constructing a RowAccessPolicy resource.
type RowAccessPolicyArgs struct {
	// Specifies a comment for the row access policy.
	Comment pulumi.StringPtrInput
	// The database in which to create the row access policy.
	Database pulumi.StringInput
	// Specifies the identifier for the row access policy; must be unique for the database and schema in which the row access policy is created.
	Name pulumi.StringPtrInput
	// Specifies the SQL expression. The expression can be any boolean-valued SQL expression.
	RowAccessExpression pulumi.StringInput
	// The schema in which to create the row access policy.
	Schema pulumi.StringInput
	// Specifies signature (arguments) for the row access policy (uppercase and sorted to avoid recreation of resource). A signature specifies a set of attributes that must be considered to determine whether the row is accessible. The attribute values come from the database object (e.g. table or view) to be protected by the row access policy.
	Signature pulumi.StringMapInput
}

func (RowAccessPolicyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*rowAccessPolicyArgs)(nil)).Elem()
}

type RowAccessPolicyInput interface {
	pulumi.Input

	ToRowAccessPolicyOutput() RowAccessPolicyOutput
	ToRowAccessPolicyOutputWithContext(ctx context.Context) RowAccessPolicyOutput
}

func (*RowAccessPolicy) ElementType() reflect.Type {
	return reflect.TypeOf((**RowAccessPolicy)(nil)).Elem()
}

func (i *RowAccessPolicy) ToRowAccessPolicyOutput() RowAccessPolicyOutput {
	return i.ToRowAccessPolicyOutputWithContext(context.Background())
}

func (i *RowAccessPolicy) ToRowAccessPolicyOutputWithContext(ctx context.Context) RowAccessPolicyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RowAccessPolicyOutput)
}

// RowAccessPolicyArrayInput is an input type that accepts RowAccessPolicyArray and RowAccessPolicyArrayOutput values.
// You can construct a concrete instance of `RowAccessPolicyArrayInput` via:
//
//	RowAccessPolicyArray{ RowAccessPolicyArgs{...} }
type RowAccessPolicyArrayInput interface {
	pulumi.Input

	ToRowAccessPolicyArrayOutput() RowAccessPolicyArrayOutput
	ToRowAccessPolicyArrayOutputWithContext(context.Context) RowAccessPolicyArrayOutput
}

type RowAccessPolicyArray []RowAccessPolicyInput

func (RowAccessPolicyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RowAccessPolicy)(nil)).Elem()
}

func (i RowAccessPolicyArray) ToRowAccessPolicyArrayOutput() RowAccessPolicyArrayOutput {
	return i.ToRowAccessPolicyArrayOutputWithContext(context.Background())
}

func (i RowAccessPolicyArray) ToRowAccessPolicyArrayOutputWithContext(ctx context.Context) RowAccessPolicyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RowAccessPolicyArrayOutput)
}

// RowAccessPolicyMapInput is an input type that accepts RowAccessPolicyMap and RowAccessPolicyMapOutput values.
// You can construct a concrete instance of `RowAccessPolicyMapInput` via:
//
//	RowAccessPolicyMap{ "key": RowAccessPolicyArgs{...} }
type RowAccessPolicyMapInput interface {
	pulumi.Input

	ToRowAccessPolicyMapOutput() RowAccessPolicyMapOutput
	ToRowAccessPolicyMapOutputWithContext(context.Context) RowAccessPolicyMapOutput
}

type RowAccessPolicyMap map[string]RowAccessPolicyInput

func (RowAccessPolicyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RowAccessPolicy)(nil)).Elem()
}

func (i RowAccessPolicyMap) ToRowAccessPolicyMapOutput() RowAccessPolicyMapOutput {
	return i.ToRowAccessPolicyMapOutputWithContext(context.Background())
}

func (i RowAccessPolicyMap) ToRowAccessPolicyMapOutputWithContext(ctx context.Context) RowAccessPolicyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RowAccessPolicyMapOutput)
}

type RowAccessPolicyOutput struct{ *pulumi.OutputState }

func (RowAccessPolicyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**RowAccessPolicy)(nil)).Elem()
}

func (o RowAccessPolicyOutput) ToRowAccessPolicyOutput() RowAccessPolicyOutput {
	return o
}

func (o RowAccessPolicyOutput) ToRowAccessPolicyOutputWithContext(ctx context.Context) RowAccessPolicyOutput {
	return o
}

// Specifies a comment for the row access policy.
func (o RowAccessPolicyOutput) Comment() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *RowAccessPolicy) pulumi.StringPtrOutput { return v.Comment }).(pulumi.StringPtrOutput)
}

// The database in which to create the row access policy.
func (o RowAccessPolicyOutput) Database() pulumi.StringOutput {
	return o.ApplyT(func(v *RowAccessPolicy) pulumi.StringOutput { return v.Database }).(pulumi.StringOutput)
}

// Specifies the identifier for the row access policy; must be unique for the database and schema in which the row access policy is created.
func (o RowAccessPolicyOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *RowAccessPolicy) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Specifies the SQL expression. The expression can be any boolean-valued SQL expression.
func (o RowAccessPolicyOutput) RowAccessExpression() pulumi.StringOutput {
	return o.ApplyT(func(v *RowAccessPolicy) pulumi.StringOutput { return v.RowAccessExpression }).(pulumi.StringOutput)
}

// The schema in which to create the row access policy.
func (o RowAccessPolicyOutput) Schema() pulumi.StringOutput {
	return o.ApplyT(func(v *RowAccessPolicy) pulumi.StringOutput { return v.Schema }).(pulumi.StringOutput)
}

// Specifies signature (arguments) for the row access policy (uppercase and sorted to avoid recreation of resource). A signature specifies a set of attributes that must be considered to determine whether the row is accessible. The attribute values come from the database object (e.g. table or view) to be protected by the row access policy.
func (o RowAccessPolicyOutput) Signature() pulumi.StringMapOutput {
	return o.ApplyT(func(v *RowAccessPolicy) pulumi.StringMapOutput { return v.Signature }).(pulumi.StringMapOutput)
}

type RowAccessPolicyArrayOutput struct{ *pulumi.OutputState }

func (RowAccessPolicyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RowAccessPolicy)(nil)).Elem()
}

func (o RowAccessPolicyArrayOutput) ToRowAccessPolicyArrayOutput() RowAccessPolicyArrayOutput {
	return o
}

func (o RowAccessPolicyArrayOutput) ToRowAccessPolicyArrayOutputWithContext(ctx context.Context) RowAccessPolicyArrayOutput {
	return o
}

func (o RowAccessPolicyArrayOutput) Index(i pulumi.IntInput) RowAccessPolicyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *RowAccessPolicy {
		return vs[0].([]*RowAccessPolicy)[vs[1].(int)]
	}).(RowAccessPolicyOutput)
}

type RowAccessPolicyMapOutput struct{ *pulumi.OutputState }

func (RowAccessPolicyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RowAccessPolicy)(nil)).Elem()
}

func (o RowAccessPolicyMapOutput) ToRowAccessPolicyMapOutput() RowAccessPolicyMapOutput {
	return o
}

func (o RowAccessPolicyMapOutput) ToRowAccessPolicyMapOutputWithContext(ctx context.Context) RowAccessPolicyMapOutput {
	return o
}

func (o RowAccessPolicyMapOutput) MapIndex(k pulumi.StringInput) RowAccessPolicyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *RowAccessPolicy {
		return vs[0].(map[string]*RowAccessPolicy)[vs[1].(string)]
	}).(RowAccessPolicyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RowAccessPolicyInput)(nil)).Elem(), &RowAccessPolicy{})
	pulumi.RegisterInputType(reflect.TypeOf((*RowAccessPolicyArrayInput)(nil)).Elem(), RowAccessPolicyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RowAccessPolicyMapInput)(nil)).Elem(), RowAccessPolicyMap{})
	pulumi.RegisterOutputType(RowAccessPolicyOutput{})
	pulumi.RegisterOutputType(RowAccessPolicyArrayOutput{})
	pulumi.RegisterOutputType(RowAccessPolicyMapOutput{})
}
