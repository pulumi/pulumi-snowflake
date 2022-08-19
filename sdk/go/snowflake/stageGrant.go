// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package snowflake

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Import
//
// # format is database name | schema name | stage name | privilege | true/false for with_grant_option
//
// ```sh
//
//	$ pulumi import snowflake:index/stageGrant:StageGrant example 'databaseName|schemaName|stageName|USAGE|true'
//
// ```
type StageGrant struct {
	pulumi.CustomResourceState

	// The name of the database containing the current stage on which to grant privileges.
	DatabaseName pulumi.StringOutput `pulumi:"databaseName"`
	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants pulumi.BoolPtrOutput `pulumi:"enableMultipleGrants"`
	// When this is set to true and a schema*name is provided, apply this grant on all future stages in the given schema. When this is true and no schema*name is provided apply this grant on all future stages in the given database. The stage*name field must be unset in order to use on*future.
	OnFuture pulumi.BoolPtrOutput `pulumi:"onFuture"`
	// The privilege to grant on the stage.
	Privilege pulumi.StringPtrOutput `pulumi:"privilege"`
	// Grants privilege to these roles.
	Roles pulumi.StringArrayOutput `pulumi:"roles"`
	// The name of the schema containing the current stage on which to grant privileges.
	SchemaName pulumi.StringOutput `pulumi:"schemaName"`
	// The name of the stage on which to grant privilege (only valid if onFuture is false).
	StageName pulumi.StringPtrOutput `pulumi:"stageName"`
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption pulumi.BoolPtrOutput `pulumi:"withGrantOption"`
}

// NewStageGrant registers a new resource with the given unique name, arguments, and options.
func NewStageGrant(ctx *pulumi.Context,
	name string, args *StageGrantArgs, opts ...pulumi.ResourceOption) (*StageGrant, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DatabaseName == nil {
		return nil, errors.New("invalid value for required argument 'DatabaseName'")
	}
	if args.SchemaName == nil {
		return nil, errors.New("invalid value for required argument 'SchemaName'")
	}
	var resource StageGrant
	err := ctx.RegisterResource("snowflake:index/stageGrant:StageGrant", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetStageGrant gets an existing StageGrant resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetStageGrant(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *StageGrantState, opts ...pulumi.ResourceOption) (*StageGrant, error) {
	var resource StageGrant
	err := ctx.ReadResource("snowflake:index/stageGrant:StageGrant", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering StageGrant resources.
type stageGrantState struct {
	// The name of the database containing the current stage on which to grant privileges.
	DatabaseName *string `pulumi:"databaseName"`
	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants *bool `pulumi:"enableMultipleGrants"`
	// When this is set to true and a schema*name is provided, apply this grant on all future stages in the given schema. When this is true and no schema*name is provided apply this grant on all future stages in the given database. The stage*name field must be unset in order to use on*future.
	OnFuture *bool `pulumi:"onFuture"`
	// The privilege to grant on the stage.
	Privilege *string `pulumi:"privilege"`
	// Grants privilege to these roles.
	Roles []string `pulumi:"roles"`
	// The name of the schema containing the current stage on which to grant privileges.
	SchemaName *string `pulumi:"schemaName"`
	// The name of the stage on which to grant privilege (only valid if onFuture is false).
	StageName *string `pulumi:"stageName"`
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption *bool `pulumi:"withGrantOption"`
}

type StageGrantState struct {
	// The name of the database containing the current stage on which to grant privileges.
	DatabaseName pulumi.StringPtrInput
	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants pulumi.BoolPtrInput
	// When this is set to true and a schema*name is provided, apply this grant on all future stages in the given schema. When this is true and no schema*name is provided apply this grant on all future stages in the given database. The stage*name field must be unset in order to use on*future.
	OnFuture pulumi.BoolPtrInput
	// The privilege to grant on the stage.
	Privilege pulumi.StringPtrInput
	// Grants privilege to these roles.
	Roles pulumi.StringArrayInput
	// The name of the schema containing the current stage on which to grant privileges.
	SchemaName pulumi.StringPtrInput
	// The name of the stage on which to grant privilege (only valid if onFuture is false).
	StageName pulumi.StringPtrInput
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption pulumi.BoolPtrInput
}

func (StageGrantState) ElementType() reflect.Type {
	return reflect.TypeOf((*stageGrantState)(nil)).Elem()
}

type stageGrantArgs struct {
	// The name of the database containing the current stage on which to grant privileges.
	DatabaseName string `pulumi:"databaseName"`
	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants *bool `pulumi:"enableMultipleGrants"`
	// When this is set to true and a schema*name is provided, apply this grant on all future stages in the given schema. When this is true and no schema*name is provided apply this grant on all future stages in the given database. The stage*name field must be unset in order to use on*future.
	OnFuture *bool `pulumi:"onFuture"`
	// The privilege to grant on the stage.
	Privilege *string `pulumi:"privilege"`
	// Grants privilege to these roles.
	Roles []string `pulumi:"roles"`
	// The name of the schema containing the current stage on which to grant privileges.
	SchemaName string `pulumi:"schemaName"`
	// The name of the stage on which to grant privilege (only valid if onFuture is false).
	StageName *string `pulumi:"stageName"`
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption *bool `pulumi:"withGrantOption"`
}

// The set of arguments for constructing a StageGrant resource.
type StageGrantArgs struct {
	// The name of the database containing the current stage on which to grant privileges.
	DatabaseName pulumi.StringInput
	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants pulumi.BoolPtrInput
	// When this is set to true and a schema*name is provided, apply this grant on all future stages in the given schema. When this is true and no schema*name is provided apply this grant on all future stages in the given database. The stage*name field must be unset in order to use on*future.
	OnFuture pulumi.BoolPtrInput
	// The privilege to grant on the stage.
	Privilege pulumi.StringPtrInput
	// Grants privilege to these roles.
	Roles pulumi.StringArrayInput
	// The name of the schema containing the current stage on which to grant privileges.
	SchemaName pulumi.StringInput
	// The name of the stage on which to grant privilege (only valid if onFuture is false).
	StageName pulumi.StringPtrInput
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption pulumi.BoolPtrInput
}

func (StageGrantArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*stageGrantArgs)(nil)).Elem()
}

type StageGrantInput interface {
	pulumi.Input

	ToStageGrantOutput() StageGrantOutput
	ToStageGrantOutputWithContext(ctx context.Context) StageGrantOutput
}

func (*StageGrant) ElementType() reflect.Type {
	return reflect.TypeOf((**StageGrant)(nil)).Elem()
}

func (i *StageGrant) ToStageGrantOutput() StageGrantOutput {
	return i.ToStageGrantOutputWithContext(context.Background())
}

func (i *StageGrant) ToStageGrantOutputWithContext(ctx context.Context) StageGrantOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StageGrantOutput)
}

// StageGrantArrayInput is an input type that accepts StageGrantArray and StageGrantArrayOutput values.
// You can construct a concrete instance of `StageGrantArrayInput` via:
//
//	StageGrantArray{ StageGrantArgs{...} }
type StageGrantArrayInput interface {
	pulumi.Input

	ToStageGrantArrayOutput() StageGrantArrayOutput
	ToStageGrantArrayOutputWithContext(context.Context) StageGrantArrayOutput
}

type StageGrantArray []StageGrantInput

func (StageGrantArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*StageGrant)(nil)).Elem()
}

func (i StageGrantArray) ToStageGrantArrayOutput() StageGrantArrayOutput {
	return i.ToStageGrantArrayOutputWithContext(context.Background())
}

func (i StageGrantArray) ToStageGrantArrayOutputWithContext(ctx context.Context) StageGrantArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StageGrantArrayOutput)
}

// StageGrantMapInput is an input type that accepts StageGrantMap and StageGrantMapOutput values.
// You can construct a concrete instance of `StageGrantMapInput` via:
//
//	StageGrantMap{ "key": StageGrantArgs{...} }
type StageGrantMapInput interface {
	pulumi.Input

	ToStageGrantMapOutput() StageGrantMapOutput
	ToStageGrantMapOutputWithContext(context.Context) StageGrantMapOutput
}

type StageGrantMap map[string]StageGrantInput

func (StageGrantMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*StageGrant)(nil)).Elem()
}

func (i StageGrantMap) ToStageGrantMapOutput() StageGrantMapOutput {
	return i.ToStageGrantMapOutputWithContext(context.Background())
}

func (i StageGrantMap) ToStageGrantMapOutputWithContext(ctx context.Context) StageGrantMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StageGrantMapOutput)
}

type StageGrantOutput struct{ *pulumi.OutputState }

func (StageGrantOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**StageGrant)(nil)).Elem()
}

func (o StageGrantOutput) ToStageGrantOutput() StageGrantOutput {
	return o
}

func (o StageGrantOutput) ToStageGrantOutputWithContext(ctx context.Context) StageGrantOutput {
	return o
}

// The name of the database containing the current stage on which to grant privileges.
func (o StageGrantOutput) DatabaseName() pulumi.StringOutput {
	return o.ApplyT(func(v *StageGrant) pulumi.StringOutput { return v.DatabaseName }).(pulumi.StringOutput)
}

// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
// grants applied to roles and objects outside Terraform.
func (o StageGrantOutput) EnableMultipleGrants() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *StageGrant) pulumi.BoolPtrOutput { return v.EnableMultipleGrants }).(pulumi.BoolPtrOutput)
}

// When this is set to true and a schema*name is provided, apply this grant on all future stages in the given schema. When this is true and no schema*name is provided apply this grant on all future stages in the given database. The stage*name field must be unset in order to use on*future.
func (o StageGrantOutput) OnFuture() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *StageGrant) pulumi.BoolPtrOutput { return v.OnFuture }).(pulumi.BoolPtrOutput)
}

// The privilege to grant on the stage.
func (o StageGrantOutput) Privilege() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *StageGrant) pulumi.StringPtrOutput { return v.Privilege }).(pulumi.StringPtrOutput)
}

// Grants privilege to these roles.
func (o StageGrantOutput) Roles() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *StageGrant) pulumi.StringArrayOutput { return v.Roles }).(pulumi.StringArrayOutput)
}

// The name of the schema containing the current stage on which to grant privileges.
func (o StageGrantOutput) SchemaName() pulumi.StringOutput {
	return o.ApplyT(func(v *StageGrant) pulumi.StringOutput { return v.SchemaName }).(pulumi.StringOutput)
}

// The name of the stage on which to grant privilege (only valid if onFuture is false).
func (o StageGrantOutput) StageName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *StageGrant) pulumi.StringPtrOutput { return v.StageName }).(pulumi.StringPtrOutput)
}

// When this is set to true, allows the recipient role to grant the privileges to other roles.
func (o StageGrantOutput) WithGrantOption() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *StageGrant) pulumi.BoolPtrOutput { return v.WithGrantOption }).(pulumi.BoolPtrOutput)
}

type StageGrantArrayOutput struct{ *pulumi.OutputState }

func (StageGrantArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*StageGrant)(nil)).Elem()
}

func (o StageGrantArrayOutput) ToStageGrantArrayOutput() StageGrantArrayOutput {
	return o
}

func (o StageGrantArrayOutput) ToStageGrantArrayOutputWithContext(ctx context.Context) StageGrantArrayOutput {
	return o
}

func (o StageGrantArrayOutput) Index(i pulumi.IntInput) StageGrantOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *StageGrant {
		return vs[0].([]*StageGrant)[vs[1].(int)]
	}).(StageGrantOutput)
}

type StageGrantMapOutput struct{ *pulumi.OutputState }

func (StageGrantMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*StageGrant)(nil)).Elem()
}

func (o StageGrantMapOutput) ToStageGrantMapOutput() StageGrantMapOutput {
	return o
}

func (o StageGrantMapOutput) ToStageGrantMapOutputWithContext(ctx context.Context) StageGrantMapOutput {
	return o
}

func (o StageGrantMapOutput) MapIndex(k pulumi.StringInput) StageGrantOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *StageGrant {
		return vs[0].(map[string]*StageGrant)[vs[1].(string)]
	}).(StageGrantOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*StageGrantInput)(nil)).Elem(), &StageGrant{})
	pulumi.RegisterInputType(reflect.TypeOf((*StageGrantArrayInput)(nil)).Elem(), StageGrantArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*StageGrantMapInput)(nil)).Elem(), StageGrantMap{})
	pulumi.RegisterOutputType(StageGrantOutput{})
	pulumi.RegisterOutputType(StageGrantArrayOutput{})
	pulumi.RegisterOutputType(StageGrantMapOutput{})
}
