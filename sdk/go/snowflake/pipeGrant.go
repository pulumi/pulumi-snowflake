// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package snowflake

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
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
//			_, err := snowflake.NewPipeGrant(ctx, "grant", &snowflake.PipeGrantArgs{
//				DatabaseName: pulumi.String("database"),
//				OnFuture:     pulumi.Bool(false),
//				PipeName:     pulumi.String("pipe"),
//				Privilege:    pulumi.String("OPERATE"),
//				Roles: pulumi.StringArray{
//					pulumi.String("role1"),
//					pulumi.String("role2"),
//				},
//				SchemaName:      pulumi.String("schema"),
//				WithGrantOption: pulumi.Bool(false),
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
// format is database_name ❄️ schema_name ❄️ object_name
//
// ❄️ privilege ❄️ with_grant_option ❄️ roles
//
// ```sh
//
//	$ pulumi import snowflake:index/pipeGrant:PipeGrant example 'MY_DATABASE❄️MY_SCHEMA❄️MY_OBJECT_NAME❄️OPERATE❄️false❄️role1,role2'
//
// ```
type PipeGrant struct {
	pulumi.CustomResourceState

	// The name of the database containing the current or future pipes on which to grant privileges.
	DatabaseName pulumi.StringOutput `pulumi:"databaseName"`
	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants pulumi.BoolPtrOutput `pulumi:"enableMultipleGrants"`
	// When this is set to true and a schema*name is provided, apply this grant on all future pipes in the given schema. When this is true and no schema*name is provided apply this grant on all future pipes in the given database. The pipe*name field must be unset in order to use on*future.
	OnFuture pulumi.BoolPtrOutput `pulumi:"onFuture"`
	// The name of the pipe on which to grant privileges immediately (only valid if onFuture is false).
	PipeName pulumi.StringPtrOutput `pulumi:"pipeName"`
	// The privilege to grant on the current or future pipe.
	Privilege pulumi.StringPtrOutput `pulumi:"privilege"`
	// Grants privilege to these roles.
	Roles pulumi.StringArrayOutput `pulumi:"roles"`
	// The name of the schema containing the current or future pipes on which to grant privileges.
	SchemaName pulumi.StringPtrOutput `pulumi:"schemaName"`
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption pulumi.BoolPtrOutput `pulumi:"withGrantOption"`
}

// NewPipeGrant registers a new resource with the given unique name, arguments, and options.
func NewPipeGrant(ctx *pulumi.Context,
	name string, args *PipeGrantArgs, opts ...pulumi.ResourceOption) (*PipeGrant, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DatabaseName == nil {
		return nil, errors.New("invalid value for required argument 'DatabaseName'")
	}
	var resource PipeGrant
	err := ctx.RegisterResource("snowflake:index/pipeGrant:PipeGrant", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPipeGrant gets an existing PipeGrant resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPipeGrant(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *PipeGrantState, opts ...pulumi.ResourceOption) (*PipeGrant, error) {
	var resource PipeGrant
	err := ctx.ReadResource("snowflake:index/pipeGrant:PipeGrant", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering PipeGrant resources.
type pipeGrantState struct {
	// The name of the database containing the current or future pipes on which to grant privileges.
	DatabaseName *string `pulumi:"databaseName"`
	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants *bool `pulumi:"enableMultipleGrants"`
	// When this is set to true and a schema*name is provided, apply this grant on all future pipes in the given schema. When this is true and no schema*name is provided apply this grant on all future pipes in the given database. The pipe*name field must be unset in order to use on*future.
	OnFuture *bool `pulumi:"onFuture"`
	// The name of the pipe on which to grant privileges immediately (only valid if onFuture is false).
	PipeName *string `pulumi:"pipeName"`
	// The privilege to grant on the current or future pipe.
	Privilege *string `pulumi:"privilege"`
	// Grants privilege to these roles.
	Roles []string `pulumi:"roles"`
	// The name of the schema containing the current or future pipes on which to grant privileges.
	SchemaName *string `pulumi:"schemaName"`
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption *bool `pulumi:"withGrantOption"`
}

type PipeGrantState struct {
	// The name of the database containing the current or future pipes on which to grant privileges.
	DatabaseName pulumi.StringPtrInput
	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants pulumi.BoolPtrInput
	// When this is set to true and a schema*name is provided, apply this grant on all future pipes in the given schema. When this is true and no schema*name is provided apply this grant on all future pipes in the given database. The pipe*name field must be unset in order to use on*future.
	OnFuture pulumi.BoolPtrInput
	// The name of the pipe on which to grant privileges immediately (only valid if onFuture is false).
	PipeName pulumi.StringPtrInput
	// The privilege to grant on the current or future pipe.
	Privilege pulumi.StringPtrInput
	// Grants privilege to these roles.
	Roles pulumi.StringArrayInput
	// The name of the schema containing the current or future pipes on which to grant privileges.
	SchemaName pulumi.StringPtrInput
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption pulumi.BoolPtrInput
}

func (PipeGrantState) ElementType() reflect.Type {
	return reflect.TypeOf((*pipeGrantState)(nil)).Elem()
}

type pipeGrantArgs struct {
	// The name of the database containing the current or future pipes on which to grant privileges.
	DatabaseName string `pulumi:"databaseName"`
	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants *bool `pulumi:"enableMultipleGrants"`
	// When this is set to true and a schema*name is provided, apply this grant on all future pipes in the given schema. When this is true and no schema*name is provided apply this grant on all future pipes in the given database. The pipe*name field must be unset in order to use on*future.
	OnFuture *bool `pulumi:"onFuture"`
	// The name of the pipe on which to grant privileges immediately (only valid if onFuture is false).
	PipeName *string `pulumi:"pipeName"`
	// The privilege to grant on the current or future pipe.
	Privilege *string `pulumi:"privilege"`
	// Grants privilege to these roles.
	Roles []string `pulumi:"roles"`
	// The name of the schema containing the current or future pipes on which to grant privileges.
	SchemaName *string `pulumi:"schemaName"`
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption *bool `pulumi:"withGrantOption"`
}

// The set of arguments for constructing a PipeGrant resource.
type PipeGrantArgs struct {
	// The name of the database containing the current or future pipes on which to grant privileges.
	DatabaseName pulumi.StringInput
	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants pulumi.BoolPtrInput
	// When this is set to true and a schema*name is provided, apply this grant on all future pipes in the given schema. When this is true and no schema*name is provided apply this grant on all future pipes in the given database. The pipe*name field must be unset in order to use on*future.
	OnFuture pulumi.BoolPtrInput
	// The name of the pipe on which to grant privileges immediately (only valid if onFuture is false).
	PipeName pulumi.StringPtrInput
	// The privilege to grant on the current or future pipe.
	Privilege pulumi.StringPtrInput
	// Grants privilege to these roles.
	Roles pulumi.StringArrayInput
	// The name of the schema containing the current or future pipes on which to grant privileges.
	SchemaName pulumi.StringPtrInput
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption pulumi.BoolPtrInput
}

func (PipeGrantArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*pipeGrantArgs)(nil)).Elem()
}

type PipeGrantInput interface {
	pulumi.Input

	ToPipeGrantOutput() PipeGrantOutput
	ToPipeGrantOutputWithContext(ctx context.Context) PipeGrantOutput
}

func (*PipeGrant) ElementType() reflect.Type {
	return reflect.TypeOf((**PipeGrant)(nil)).Elem()
}

func (i *PipeGrant) ToPipeGrantOutput() PipeGrantOutput {
	return i.ToPipeGrantOutputWithContext(context.Background())
}

func (i *PipeGrant) ToPipeGrantOutputWithContext(ctx context.Context) PipeGrantOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PipeGrantOutput)
}

// PipeGrantArrayInput is an input type that accepts PipeGrantArray and PipeGrantArrayOutput values.
// You can construct a concrete instance of `PipeGrantArrayInput` via:
//
//	PipeGrantArray{ PipeGrantArgs{...} }
type PipeGrantArrayInput interface {
	pulumi.Input

	ToPipeGrantArrayOutput() PipeGrantArrayOutput
	ToPipeGrantArrayOutputWithContext(context.Context) PipeGrantArrayOutput
}

type PipeGrantArray []PipeGrantInput

func (PipeGrantArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PipeGrant)(nil)).Elem()
}

func (i PipeGrantArray) ToPipeGrantArrayOutput() PipeGrantArrayOutput {
	return i.ToPipeGrantArrayOutputWithContext(context.Background())
}

func (i PipeGrantArray) ToPipeGrantArrayOutputWithContext(ctx context.Context) PipeGrantArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PipeGrantArrayOutput)
}

// PipeGrantMapInput is an input type that accepts PipeGrantMap and PipeGrantMapOutput values.
// You can construct a concrete instance of `PipeGrantMapInput` via:
//
//	PipeGrantMap{ "key": PipeGrantArgs{...} }
type PipeGrantMapInput interface {
	pulumi.Input

	ToPipeGrantMapOutput() PipeGrantMapOutput
	ToPipeGrantMapOutputWithContext(context.Context) PipeGrantMapOutput
}

type PipeGrantMap map[string]PipeGrantInput

func (PipeGrantMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PipeGrant)(nil)).Elem()
}

func (i PipeGrantMap) ToPipeGrantMapOutput() PipeGrantMapOutput {
	return i.ToPipeGrantMapOutputWithContext(context.Background())
}

func (i PipeGrantMap) ToPipeGrantMapOutputWithContext(ctx context.Context) PipeGrantMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PipeGrantMapOutput)
}

type PipeGrantOutput struct{ *pulumi.OutputState }

func (PipeGrantOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**PipeGrant)(nil)).Elem()
}

func (o PipeGrantOutput) ToPipeGrantOutput() PipeGrantOutput {
	return o
}

func (o PipeGrantOutput) ToPipeGrantOutputWithContext(ctx context.Context) PipeGrantOutput {
	return o
}

// The name of the database containing the current or future pipes on which to grant privileges.
func (o PipeGrantOutput) DatabaseName() pulumi.StringOutput {
	return o.ApplyT(func(v *PipeGrant) pulumi.StringOutput { return v.DatabaseName }).(pulumi.StringOutput)
}

// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
// grants applied to roles and objects outside Terraform.
func (o PipeGrantOutput) EnableMultipleGrants() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *PipeGrant) pulumi.BoolPtrOutput { return v.EnableMultipleGrants }).(pulumi.BoolPtrOutput)
}

// When this is set to true and a schema*name is provided, apply this grant on all future pipes in the given schema. When this is true and no schema*name is provided apply this grant on all future pipes in the given database. The pipe*name field must be unset in order to use on*future.
func (o PipeGrantOutput) OnFuture() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *PipeGrant) pulumi.BoolPtrOutput { return v.OnFuture }).(pulumi.BoolPtrOutput)
}

// The name of the pipe on which to grant privileges immediately (only valid if onFuture is false).
func (o PipeGrantOutput) PipeName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *PipeGrant) pulumi.StringPtrOutput { return v.PipeName }).(pulumi.StringPtrOutput)
}

// The privilege to grant on the current or future pipe.
func (o PipeGrantOutput) Privilege() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *PipeGrant) pulumi.StringPtrOutput { return v.Privilege }).(pulumi.StringPtrOutput)
}

// Grants privilege to these roles.
func (o PipeGrantOutput) Roles() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *PipeGrant) pulumi.StringArrayOutput { return v.Roles }).(pulumi.StringArrayOutput)
}

// The name of the schema containing the current or future pipes on which to grant privileges.
func (o PipeGrantOutput) SchemaName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *PipeGrant) pulumi.StringPtrOutput { return v.SchemaName }).(pulumi.StringPtrOutput)
}

// When this is set to true, allows the recipient role to grant the privileges to other roles.
func (o PipeGrantOutput) WithGrantOption() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *PipeGrant) pulumi.BoolPtrOutput { return v.WithGrantOption }).(pulumi.BoolPtrOutput)
}

type PipeGrantArrayOutput struct{ *pulumi.OutputState }

func (PipeGrantArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PipeGrant)(nil)).Elem()
}

func (o PipeGrantArrayOutput) ToPipeGrantArrayOutput() PipeGrantArrayOutput {
	return o
}

func (o PipeGrantArrayOutput) ToPipeGrantArrayOutputWithContext(ctx context.Context) PipeGrantArrayOutput {
	return o
}

func (o PipeGrantArrayOutput) Index(i pulumi.IntInput) PipeGrantOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *PipeGrant {
		return vs[0].([]*PipeGrant)[vs[1].(int)]
	}).(PipeGrantOutput)
}

type PipeGrantMapOutput struct{ *pulumi.OutputState }

func (PipeGrantMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PipeGrant)(nil)).Elem()
}

func (o PipeGrantMapOutput) ToPipeGrantMapOutput() PipeGrantMapOutput {
	return o
}

func (o PipeGrantMapOutput) ToPipeGrantMapOutputWithContext(ctx context.Context) PipeGrantMapOutput {
	return o
}

func (o PipeGrantMapOutput) MapIndex(k pulumi.StringInput) PipeGrantOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *PipeGrant {
		return vs[0].(map[string]*PipeGrant)[vs[1].(string)]
	}).(PipeGrantOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*PipeGrantInput)(nil)).Elem(), &PipeGrant{})
	pulumi.RegisterInputType(reflect.TypeOf((*PipeGrantArrayInput)(nil)).Elem(), PipeGrantArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*PipeGrantMapInput)(nil)).Elem(), PipeGrantMap{})
	pulumi.RegisterOutputType(PipeGrantOutput{})
	pulumi.RegisterOutputType(PipeGrantArrayOutput{})
	pulumi.RegisterOutputType(PipeGrantMapOutput{})
}
