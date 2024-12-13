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
// ### OnView
//
// ```sh
// $ pulumi import snowflake:index/grantPrivilegesToShare:GrantPrivilegesToShare example '<share_name>|<privileges>|OnView|<database_name>.<schema_name>.<view_name>'`
// ```
type GrantPrivilegesToShare struct {
	pulumi.CustomResourceState

	// The fully qualified identifier for the schema for which the specified privilege will be granted for all tables.
	OnAllTablesInSchema pulumi.StringPtrOutput `pulumi:"onAllTablesInSchema"`
	// The fully qualified name of the database on which privileges will be granted. For more information about this resource, see docs.
	OnDatabase pulumi.StringPtrOutput `pulumi:"onDatabase"`
	// The fully qualified name of the function on which privileges will be granted.
	OnFunction pulumi.StringPtrOutput `pulumi:"onFunction"`
	// The fully qualified name of the schema on which privileges will be granted. For more information about this resource, see docs.
	OnSchema pulumi.StringPtrOutput `pulumi:"onSchema"`
	// The fully qualified name of the table on which privileges will be granted. For more information about this resource, see docs.
	OnTable pulumi.StringPtrOutput `pulumi:"onTable"`
	// The fully qualified name of the tag on which privileges will be granted. For more information about this resource, see docs.
	OnTag pulumi.StringPtrOutput `pulumi:"onTag"`
	// The fully qualified name of the view on which privileges will be granted. For more information about this resource, see docs.
	OnView pulumi.StringPtrOutput `pulumi:"onView"`
	// The privileges to grant on the share. See available list of privileges: https://docs.snowflake.com/en/sql-reference/sql/grant-privilege-share#syntax
	Privileges pulumi.StringArrayOutput `pulumi:"privileges"`
	// The fully qualified name of the share on which privileges will be granted. For more information about this resource, see docs.
	ToShare pulumi.StringOutput `pulumi:"toShare"`
}

// NewGrantPrivilegesToShare registers a new resource with the given unique name, arguments, and options.
func NewGrantPrivilegesToShare(ctx *pulumi.Context,
	name string, args *GrantPrivilegesToShareArgs, opts ...pulumi.ResourceOption) (*GrantPrivilegesToShare, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Privileges == nil {
		return nil, errors.New("invalid value for required argument 'Privileges'")
	}
	if args.ToShare == nil {
		return nil, errors.New("invalid value for required argument 'ToShare'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource GrantPrivilegesToShare
	err := ctx.RegisterResource("snowflake:index/grantPrivilegesToShare:GrantPrivilegesToShare", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetGrantPrivilegesToShare gets an existing GrantPrivilegesToShare resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetGrantPrivilegesToShare(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *GrantPrivilegesToShareState, opts ...pulumi.ResourceOption) (*GrantPrivilegesToShare, error) {
	var resource GrantPrivilegesToShare
	err := ctx.ReadResource("snowflake:index/grantPrivilegesToShare:GrantPrivilegesToShare", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering GrantPrivilegesToShare resources.
type grantPrivilegesToShareState struct {
	// The fully qualified identifier for the schema for which the specified privilege will be granted for all tables.
	OnAllTablesInSchema *string `pulumi:"onAllTablesInSchema"`
	// The fully qualified name of the database on which privileges will be granted. For more information about this resource, see docs.
	OnDatabase *string `pulumi:"onDatabase"`
	// The fully qualified name of the function on which privileges will be granted.
	OnFunction *string `pulumi:"onFunction"`
	// The fully qualified name of the schema on which privileges will be granted. For more information about this resource, see docs.
	OnSchema *string `pulumi:"onSchema"`
	// The fully qualified name of the table on which privileges will be granted. For more information about this resource, see docs.
	OnTable *string `pulumi:"onTable"`
	// The fully qualified name of the tag on which privileges will be granted. For more information about this resource, see docs.
	OnTag *string `pulumi:"onTag"`
	// The fully qualified name of the view on which privileges will be granted. For more information about this resource, see docs.
	OnView *string `pulumi:"onView"`
	// The privileges to grant on the share. See available list of privileges: https://docs.snowflake.com/en/sql-reference/sql/grant-privilege-share#syntax
	Privileges []string `pulumi:"privileges"`
	// The fully qualified name of the share on which privileges will be granted. For more information about this resource, see docs.
	ToShare *string `pulumi:"toShare"`
}

type GrantPrivilegesToShareState struct {
	// The fully qualified identifier for the schema for which the specified privilege will be granted for all tables.
	OnAllTablesInSchema pulumi.StringPtrInput
	// The fully qualified name of the database on which privileges will be granted. For more information about this resource, see docs.
	OnDatabase pulumi.StringPtrInput
	// The fully qualified name of the function on which privileges will be granted.
	OnFunction pulumi.StringPtrInput
	// The fully qualified name of the schema on which privileges will be granted. For more information about this resource, see docs.
	OnSchema pulumi.StringPtrInput
	// The fully qualified name of the table on which privileges will be granted. For more information about this resource, see docs.
	OnTable pulumi.StringPtrInput
	// The fully qualified name of the tag on which privileges will be granted. For more information about this resource, see docs.
	OnTag pulumi.StringPtrInput
	// The fully qualified name of the view on which privileges will be granted. For more information about this resource, see docs.
	OnView pulumi.StringPtrInput
	// The privileges to grant on the share. See available list of privileges: https://docs.snowflake.com/en/sql-reference/sql/grant-privilege-share#syntax
	Privileges pulumi.StringArrayInput
	// The fully qualified name of the share on which privileges will be granted. For more information about this resource, see docs.
	ToShare pulumi.StringPtrInput
}

func (GrantPrivilegesToShareState) ElementType() reflect.Type {
	return reflect.TypeOf((*grantPrivilegesToShareState)(nil)).Elem()
}

type grantPrivilegesToShareArgs struct {
	// The fully qualified identifier for the schema for which the specified privilege will be granted for all tables.
	OnAllTablesInSchema *string `pulumi:"onAllTablesInSchema"`
	// The fully qualified name of the database on which privileges will be granted. For more information about this resource, see docs.
	OnDatabase *string `pulumi:"onDatabase"`
	// The fully qualified name of the function on which privileges will be granted.
	OnFunction *string `pulumi:"onFunction"`
	// The fully qualified name of the schema on which privileges will be granted. For more information about this resource, see docs.
	OnSchema *string `pulumi:"onSchema"`
	// The fully qualified name of the table on which privileges will be granted. For more information about this resource, see docs.
	OnTable *string `pulumi:"onTable"`
	// The fully qualified name of the tag on which privileges will be granted. For more information about this resource, see docs.
	OnTag *string `pulumi:"onTag"`
	// The fully qualified name of the view on which privileges will be granted. For more information about this resource, see docs.
	OnView *string `pulumi:"onView"`
	// The privileges to grant on the share. See available list of privileges: https://docs.snowflake.com/en/sql-reference/sql/grant-privilege-share#syntax
	Privileges []string `pulumi:"privileges"`
	// The fully qualified name of the share on which privileges will be granted. For more information about this resource, see docs.
	ToShare string `pulumi:"toShare"`
}

// The set of arguments for constructing a GrantPrivilegesToShare resource.
type GrantPrivilegesToShareArgs struct {
	// The fully qualified identifier for the schema for which the specified privilege will be granted for all tables.
	OnAllTablesInSchema pulumi.StringPtrInput
	// The fully qualified name of the database on which privileges will be granted. For more information about this resource, see docs.
	OnDatabase pulumi.StringPtrInput
	// The fully qualified name of the function on which privileges will be granted.
	OnFunction pulumi.StringPtrInput
	// The fully qualified name of the schema on which privileges will be granted. For more information about this resource, see docs.
	OnSchema pulumi.StringPtrInput
	// The fully qualified name of the table on which privileges will be granted. For more information about this resource, see docs.
	OnTable pulumi.StringPtrInput
	// The fully qualified name of the tag on which privileges will be granted. For more information about this resource, see docs.
	OnTag pulumi.StringPtrInput
	// The fully qualified name of the view on which privileges will be granted. For more information about this resource, see docs.
	OnView pulumi.StringPtrInput
	// The privileges to grant on the share. See available list of privileges: https://docs.snowflake.com/en/sql-reference/sql/grant-privilege-share#syntax
	Privileges pulumi.StringArrayInput
	// The fully qualified name of the share on which privileges will be granted. For more information about this resource, see docs.
	ToShare pulumi.StringInput
}

func (GrantPrivilegesToShareArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*grantPrivilegesToShareArgs)(nil)).Elem()
}

type GrantPrivilegesToShareInput interface {
	pulumi.Input

	ToGrantPrivilegesToShareOutput() GrantPrivilegesToShareOutput
	ToGrantPrivilegesToShareOutputWithContext(ctx context.Context) GrantPrivilegesToShareOutput
}

func (*GrantPrivilegesToShare) ElementType() reflect.Type {
	return reflect.TypeOf((**GrantPrivilegesToShare)(nil)).Elem()
}

func (i *GrantPrivilegesToShare) ToGrantPrivilegesToShareOutput() GrantPrivilegesToShareOutput {
	return i.ToGrantPrivilegesToShareOutputWithContext(context.Background())
}

func (i *GrantPrivilegesToShare) ToGrantPrivilegesToShareOutputWithContext(ctx context.Context) GrantPrivilegesToShareOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GrantPrivilegesToShareOutput)
}

// GrantPrivilegesToShareArrayInput is an input type that accepts GrantPrivilegesToShareArray and GrantPrivilegesToShareArrayOutput values.
// You can construct a concrete instance of `GrantPrivilegesToShareArrayInput` via:
//
//	GrantPrivilegesToShareArray{ GrantPrivilegesToShareArgs{...} }
type GrantPrivilegesToShareArrayInput interface {
	pulumi.Input

	ToGrantPrivilegesToShareArrayOutput() GrantPrivilegesToShareArrayOutput
	ToGrantPrivilegesToShareArrayOutputWithContext(context.Context) GrantPrivilegesToShareArrayOutput
}

type GrantPrivilegesToShareArray []GrantPrivilegesToShareInput

func (GrantPrivilegesToShareArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GrantPrivilegesToShare)(nil)).Elem()
}

func (i GrantPrivilegesToShareArray) ToGrantPrivilegesToShareArrayOutput() GrantPrivilegesToShareArrayOutput {
	return i.ToGrantPrivilegesToShareArrayOutputWithContext(context.Background())
}

func (i GrantPrivilegesToShareArray) ToGrantPrivilegesToShareArrayOutputWithContext(ctx context.Context) GrantPrivilegesToShareArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GrantPrivilegesToShareArrayOutput)
}

// GrantPrivilegesToShareMapInput is an input type that accepts GrantPrivilegesToShareMap and GrantPrivilegesToShareMapOutput values.
// You can construct a concrete instance of `GrantPrivilegesToShareMapInput` via:
//
//	GrantPrivilegesToShareMap{ "key": GrantPrivilegesToShareArgs{...} }
type GrantPrivilegesToShareMapInput interface {
	pulumi.Input

	ToGrantPrivilegesToShareMapOutput() GrantPrivilegesToShareMapOutput
	ToGrantPrivilegesToShareMapOutputWithContext(context.Context) GrantPrivilegesToShareMapOutput
}

type GrantPrivilegesToShareMap map[string]GrantPrivilegesToShareInput

func (GrantPrivilegesToShareMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GrantPrivilegesToShare)(nil)).Elem()
}

func (i GrantPrivilegesToShareMap) ToGrantPrivilegesToShareMapOutput() GrantPrivilegesToShareMapOutput {
	return i.ToGrantPrivilegesToShareMapOutputWithContext(context.Background())
}

func (i GrantPrivilegesToShareMap) ToGrantPrivilegesToShareMapOutputWithContext(ctx context.Context) GrantPrivilegesToShareMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GrantPrivilegesToShareMapOutput)
}

type GrantPrivilegesToShareOutput struct{ *pulumi.OutputState }

func (GrantPrivilegesToShareOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**GrantPrivilegesToShare)(nil)).Elem()
}

func (o GrantPrivilegesToShareOutput) ToGrantPrivilegesToShareOutput() GrantPrivilegesToShareOutput {
	return o
}

func (o GrantPrivilegesToShareOutput) ToGrantPrivilegesToShareOutputWithContext(ctx context.Context) GrantPrivilegesToShareOutput {
	return o
}

// The fully qualified identifier for the schema for which the specified privilege will be granted for all tables.
func (o GrantPrivilegesToShareOutput) OnAllTablesInSchema() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GrantPrivilegesToShare) pulumi.StringPtrOutput { return v.OnAllTablesInSchema }).(pulumi.StringPtrOutput)
}

// The fully qualified name of the database on which privileges will be granted. For more information about this resource, see docs.
func (o GrantPrivilegesToShareOutput) OnDatabase() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GrantPrivilegesToShare) pulumi.StringPtrOutput { return v.OnDatabase }).(pulumi.StringPtrOutput)
}

// The fully qualified name of the function on which privileges will be granted.
func (o GrantPrivilegesToShareOutput) OnFunction() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GrantPrivilegesToShare) pulumi.StringPtrOutput { return v.OnFunction }).(pulumi.StringPtrOutput)
}

// The fully qualified name of the schema on which privileges will be granted. For more information about this resource, see docs.
func (o GrantPrivilegesToShareOutput) OnSchema() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GrantPrivilegesToShare) pulumi.StringPtrOutput { return v.OnSchema }).(pulumi.StringPtrOutput)
}

// The fully qualified name of the table on which privileges will be granted. For more information about this resource, see docs.
func (o GrantPrivilegesToShareOutput) OnTable() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GrantPrivilegesToShare) pulumi.StringPtrOutput { return v.OnTable }).(pulumi.StringPtrOutput)
}

// The fully qualified name of the tag on which privileges will be granted. For more information about this resource, see docs.
func (o GrantPrivilegesToShareOutput) OnTag() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GrantPrivilegesToShare) pulumi.StringPtrOutput { return v.OnTag }).(pulumi.StringPtrOutput)
}

// The fully qualified name of the view on which privileges will be granted. For more information about this resource, see docs.
func (o GrantPrivilegesToShareOutput) OnView() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GrantPrivilegesToShare) pulumi.StringPtrOutput { return v.OnView }).(pulumi.StringPtrOutput)
}

// The privileges to grant on the share. See available list of privileges: https://docs.snowflake.com/en/sql-reference/sql/grant-privilege-share#syntax
func (o GrantPrivilegesToShareOutput) Privileges() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *GrantPrivilegesToShare) pulumi.StringArrayOutput { return v.Privileges }).(pulumi.StringArrayOutput)
}

// The fully qualified name of the share on which privileges will be granted. For more information about this resource, see docs.
func (o GrantPrivilegesToShareOutput) ToShare() pulumi.StringOutput {
	return o.ApplyT(func(v *GrantPrivilegesToShare) pulumi.StringOutput { return v.ToShare }).(pulumi.StringOutput)
}

type GrantPrivilegesToShareArrayOutput struct{ *pulumi.OutputState }

func (GrantPrivilegesToShareArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GrantPrivilegesToShare)(nil)).Elem()
}

func (o GrantPrivilegesToShareArrayOutput) ToGrantPrivilegesToShareArrayOutput() GrantPrivilegesToShareArrayOutput {
	return o
}

func (o GrantPrivilegesToShareArrayOutput) ToGrantPrivilegesToShareArrayOutputWithContext(ctx context.Context) GrantPrivilegesToShareArrayOutput {
	return o
}

func (o GrantPrivilegesToShareArrayOutput) Index(i pulumi.IntInput) GrantPrivilegesToShareOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *GrantPrivilegesToShare {
		return vs[0].([]*GrantPrivilegesToShare)[vs[1].(int)]
	}).(GrantPrivilegesToShareOutput)
}

type GrantPrivilegesToShareMapOutput struct{ *pulumi.OutputState }

func (GrantPrivilegesToShareMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GrantPrivilegesToShare)(nil)).Elem()
}

func (o GrantPrivilegesToShareMapOutput) ToGrantPrivilegesToShareMapOutput() GrantPrivilegesToShareMapOutput {
	return o
}

func (o GrantPrivilegesToShareMapOutput) ToGrantPrivilegesToShareMapOutputWithContext(ctx context.Context) GrantPrivilegesToShareMapOutput {
	return o
}

func (o GrantPrivilegesToShareMapOutput) MapIndex(k pulumi.StringInput) GrantPrivilegesToShareOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *GrantPrivilegesToShare {
		return vs[0].(map[string]*GrantPrivilegesToShare)[vs[1].(string)]
	}).(GrantPrivilegesToShareOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*GrantPrivilegesToShareInput)(nil)).Elem(), &GrantPrivilegesToShare{})
	pulumi.RegisterInputType(reflect.TypeOf((*GrantPrivilegesToShareArrayInput)(nil)).Elem(), GrantPrivilegesToShareArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GrantPrivilegesToShareMapInput)(nil)).Elem(), GrantPrivilegesToShareMap{})
	pulumi.RegisterOutputType(GrantPrivilegesToShareOutput{})
	pulumi.RegisterOutputType(GrantPrivilegesToShareArrayOutput{})
	pulumi.RegisterOutputType(GrantPrivilegesToShareMapOutput{})
}
