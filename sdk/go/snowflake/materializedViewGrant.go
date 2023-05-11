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
//			_, err := snowflake.NewMaterializedViewGrant(ctx, "grant", &snowflake.MaterializedViewGrantArgs{
//				DatabaseName:         pulumi.String("database"),
//				MaterializedViewName: pulumi.String("materialized_view"),
//				OnFuture:             pulumi.Bool(false),
//				Privilege:            pulumi.String("SELECT"),
//				Roles: pulumi.StringArray{
//					pulumi.String("role1"),
//					pulumi.String("role2"),
//				},
//				SchemaName: pulumi.String("schema"),
//				Shares: pulumi.StringArray{
//					pulumi.String("share1"),
//					pulumi.String("share2"),
//				},
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
// format is database_name|schema_name|materialized_view_name|privilege|with_grant_option|on_future|on_all|roles|shares
//
// ```sh
//
//	$ pulumi import snowflake:index/materializedViewGrant:MaterializedViewGrant example "MY_DATABASE|MY_SCHEMA|MY_MV_NAME|SELECT|false|false|role1,role2|share1,share2"
//
// ```
type MaterializedViewGrant struct {
	pulumi.CustomResourceState

	// The name of the database containing the current or future materialized views on which to grant privileges.
	DatabaseName pulumi.StringOutput `pulumi:"databaseName"`
	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants pulumi.BoolPtrOutput `pulumi:"enableMultipleGrants"`
	// The name of the materialized view on which to grant privileges immediately (only valid if on*future and on*all are false).
	MaterializedViewName pulumi.StringPtrOutput `pulumi:"materializedViewName"`
	// When this is set to true and a schema*name is provided, apply this grant on all materialized views in the given schema. When this is true and no schema*name is provided apply this grant on all materialized views in the given database. The materialized*view*name and shares fields must be unset in order to use on*all. Cannot be used together with on*future.
	OnAll pulumi.BoolPtrOutput `pulumi:"onAll"`
	// When this is set to true and a schema*name is provided, apply this grant on all future materialized views in the given schema. When this is true and no schema*name is provided apply this grant on all future materialized views in the given database. The materialized*view*name and shares fields must be unset in order to use on*future. Cannot be used together with on*all.
	OnFuture pulumi.BoolPtrOutput `pulumi:"onFuture"`
	// The privilege to grant on the current or future materialized view.
	Privilege pulumi.StringPtrOutput `pulumi:"privilege"`
	// Grants privilege to these roles.
	Roles pulumi.StringArrayOutput `pulumi:"roles"`
	// The name of the schema containing the current or future materialized views on which to grant privileges.
	SchemaName pulumi.StringPtrOutput `pulumi:"schemaName"`
	// Grants privilege to these shares (only valid if on*future and on*all are false).
	Shares pulumi.StringArrayOutput `pulumi:"shares"`
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption pulumi.BoolPtrOutput `pulumi:"withGrantOption"`
}

// NewMaterializedViewGrant registers a new resource with the given unique name, arguments, and options.
func NewMaterializedViewGrant(ctx *pulumi.Context,
	name string, args *MaterializedViewGrantArgs, opts ...pulumi.ResourceOption) (*MaterializedViewGrant, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DatabaseName == nil {
		return nil, errors.New("invalid value for required argument 'DatabaseName'")
	}
	var resource MaterializedViewGrant
	err := ctx.RegisterResource("snowflake:index/materializedViewGrant:MaterializedViewGrant", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetMaterializedViewGrant gets an existing MaterializedViewGrant resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetMaterializedViewGrant(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *MaterializedViewGrantState, opts ...pulumi.ResourceOption) (*MaterializedViewGrant, error) {
	var resource MaterializedViewGrant
	err := ctx.ReadResource("snowflake:index/materializedViewGrant:MaterializedViewGrant", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering MaterializedViewGrant resources.
type materializedViewGrantState struct {
	// The name of the database containing the current or future materialized views on which to grant privileges.
	DatabaseName *string `pulumi:"databaseName"`
	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants *bool `pulumi:"enableMultipleGrants"`
	// The name of the materialized view on which to grant privileges immediately (only valid if on*future and on*all are false).
	MaterializedViewName *string `pulumi:"materializedViewName"`
	// When this is set to true and a schema*name is provided, apply this grant on all materialized views in the given schema. When this is true and no schema*name is provided apply this grant on all materialized views in the given database. The materialized*view*name and shares fields must be unset in order to use on*all. Cannot be used together with on*future.
	OnAll *bool `pulumi:"onAll"`
	// When this is set to true and a schema*name is provided, apply this grant on all future materialized views in the given schema. When this is true and no schema*name is provided apply this grant on all future materialized views in the given database. The materialized*view*name and shares fields must be unset in order to use on*future. Cannot be used together with on*all.
	OnFuture *bool `pulumi:"onFuture"`
	// The privilege to grant on the current or future materialized view.
	Privilege *string `pulumi:"privilege"`
	// Grants privilege to these roles.
	Roles []string `pulumi:"roles"`
	// The name of the schema containing the current or future materialized views on which to grant privileges.
	SchemaName *string `pulumi:"schemaName"`
	// Grants privilege to these shares (only valid if on*future and on*all are false).
	Shares []string `pulumi:"shares"`
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption *bool `pulumi:"withGrantOption"`
}

type MaterializedViewGrantState struct {
	// The name of the database containing the current or future materialized views on which to grant privileges.
	DatabaseName pulumi.StringPtrInput
	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants pulumi.BoolPtrInput
	// The name of the materialized view on which to grant privileges immediately (only valid if on*future and on*all are false).
	MaterializedViewName pulumi.StringPtrInput
	// When this is set to true and a schema*name is provided, apply this grant on all materialized views in the given schema. When this is true and no schema*name is provided apply this grant on all materialized views in the given database. The materialized*view*name and shares fields must be unset in order to use on*all. Cannot be used together with on*future.
	OnAll pulumi.BoolPtrInput
	// When this is set to true and a schema*name is provided, apply this grant on all future materialized views in the given schema. When this is true and no schema*name is provided apply this grant on all future materialized views in the given database. The materialized*view*name and shares fields must be unset in order to use on*future. Cannot be used together with on*all.
	OnFuture pulumi.BoolPtrInput
	// The privilege to grant on the current or future materialized view.
	Privilege pulumi.StringPtrInput
	// Grants privilege to these roles.
	Roles pulumi.StringArrayInput
	// The name of the schema containing the current or future materialized views on which to grant privileges.
	SchemaName pulumi.StringPtrInput
	// Grants privilege to these shares (only valid if on*future and on*all are false).
	Shares pulumi.StringArrayInput
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption pulumi.BoolPtrInput
}

func (MaterializedViewGrantState) ElementType() reflect.Type {
	return reflect.TypeOf((*materializedViewGrantState)(nil)).Elem()
}

type materializedViewGrantArgs struct {
	// The name of the database containing the current or future materialized views on which to grant privileges.
	DatabaseName string `pulumi:"databaseName"`
	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants *bool `pulumi:"enableMultipleGrants"`
	// The name of the materialized view on which to grant privileges immediately (only valid if on*future and on*all are false).
	MaterializedViewName *string `pulumi:"materializedViewName"`
	// When this is set to true and a schema*name is provided, apply this grant on all materialized views in the given schema. When this is true and no schema*name is provided apply this grant on all materialized views in the given database. The materialized*view*name and shares fields must be unset in order to use on*all. Cannot be used together with on*future.
	OnAll *bool `pulumi:"onAll"`
	// When this is set to true and a schema*name is provided, apply this grant on all future materialized views in the given schema. When this is true and no schema*name is provided apply this grant on all future materialized views in the given database. The materialized*view*name and shares fields must be unset in order to use on*future. Cannot be used together with on*all.
	OnFuture *bool `pulumi:"onFuture"`
	// The privilege to grant on the current or future materialized view.
	Privilege *string `pulumi:"privilege"`
	// Grants privilege to these roles.
	Roles []string `pulumi:"roles"`
	// The name of the schema containing the current or future materialized views on which to grant privileges.
	SchemaName *string `pulumi:"schemaName"`
	// Grants privilege to these shares (only valid if on*future and on*all are false).
	Shares []string `pulumi:"shares"`
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption *bool `pulumi:"withGrantOption"`
}

// The set of arguments for constructing a MaterializedViewGrant resource.
type MaterializedViewGrantArgs struct {
	// The name of the database containing the current or future materialized views on which to grant privileges.
	DatabaseName pulumi.StringInput
	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants pulumi.BoolPtrInput
	// The name of the materialized view on which to grant privileges immediately (only valid if on*future and on*all are false).
	MaterializedViewName pulumi.StringPtrInput
	// When this is set to true and a schema*name is provided, apply this grant on all materialized views in the given schema. When this is true and no schema*name is provided apply this grant on all materialized views in the given database. The materialized*view*name and shares fields must be unset in order to use on*all. Cannot be used together with on*future.
	OnAll pulumi.BoolPtrInput
	// When this is set to true and a schema*name is provided, apply this grant on all future materialized views in the given schema. When this is true and no schema*name is provided apply this grant on all future materialized views in the given database. The materialized*view*name and shares fields must be unset in order to use on*future. Cannot be used together with on*all.
	OnFuture pulumi.BoolPtrInput
	// The privilege to grant on the current or future materialized view.
	Privilege pulumi.StringPtrInput
	// Grants privilege to these roles.
	Roles pulumi.StringArrayInput
	// The name of the schema containing the current or future materialized views on which to grant privileges.
	SchemaName pulumi.StringPtrInput
	// Grants privilege to these shares (only valid if on*future and on*all are false).
	Shares pulumi.StringArrayInput
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption pulumi.BoolPtrInput
}

func (MaterializedViewGrantArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*materializedViewGrantArgs)(nil)).Elem()
}

type MaterializedViewGrantInput interface {
	pulumi.Input

	ToMaterializedViewGrantOutput() MaterializedViewGrantOutput
	ToMaterializedViewGrantOutputWithContext(ctx context.Context) MaterializedViewGrantOutput
}

func (*MaterializedViewGrant) ElementType() reflect.Type {
	return reflect.TypeOf((**MaterializedViewGrant)(nil)).Elem()
}

func (i *MaterializedViewGrant) ToMaterializedViewGrantOutput() MaterializedViewGrantOutput {
	return i.ToMaterializedViewGrantOutputWithContext(context.Background())
}

func (i *MaterializedViewGrant) ToMaterializedViewGrantOutputWithContext(ctx context.Context) MaterializedViewGrantOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MaterializedViewGrantOutput)
}

// MaterializedViewGrantArrayInput is an input type that accepts MaterializedViewGrantArray and MaterializedViewGrantArrayOutput values.
// You can construct a concrete instance of `MaterializedViewGrantArrayInput` via:
//
//	MaterializedViewGrantArray{ MaterializedViewGrantArgs{...} }
type MaterializedViewGrantArrayInput interface {
	pulumi.Input

	ToMaterializedViewGrantArrayOutput() MaterializedViewGrantArrayOutput
	ToMaterializedViewGrantArrayOutputWithContext(context.Context) MaterializedViewGrantArrayOutput
}

type MaterializedViewGrantArray []MaterializedViewGrantInput

func (MaterializedViewGrantArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MaterializedViewGrant)(nil)).Elem()
}

func (i MaterializedViewGrantArray) ToMaterializedViewGrantArrayOutput() MaterializedViewGrantArrayOutput {
	return i.ToMaterializedViewGrantArrayOutputWithContext(context.Background())
}

func (i MaterializedViewGrantArray) ToMaterializedViewGrantArrayOutputWithContext(ctx context.Context) MaterializedViewGrantArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MaterializedViewGrantArrayOutput)
}

// MaterializedViewGrantMapInput is an input type that accepts MaterializedViewGrantMap and MaterializedViewGrantMapOutput values.
// You can construct a concrete instance of `MaterializedViewGrantMapInput` via:
//
//	MaterializedViewGrantMap{ "key": MaterializedViewGrantArgs{...} }
type MaterializedViewGrantMapInput interface {
	pulumi.Input

	ToMaterializedViewGrantMapOutput() MaterializedViewGrantMapOutput
	ToMaterializedViewGrantMapOutputWithContext(context.Context) MaterializedViewGrantMapOutput
}

type MaterializedViewGrantMap map[string]MaterializedViewGrantInput

func (MaterializedViewGrantMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MaterializedViewGrant)(nil)).Elem()
}

func (i MaterializedViewGrantMap) ToMaterializedViewGrantMapOutput() MaterializedViewGrantMapOutput {
	return i.ToMaterializedViewGrantMapOutputWithContext(context.Background())
}

func (i MaterializedViewGrantMap) ToMaterializedViewGrantMapOutputWithContext(ctx context.Context) MaterializedViewGrantMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MaterializedViewGrantMapOutput)
}

type MaterializedViewGrantOutput struct{ *pulumi.OutputState }

func (MaterializedViewGrantOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**MaterializedViewGrant)(nil)).Elem()
}

func (o MaterializedViewGrantOutput) ToMaterializedViewGrantOutput() MaterializedViewGrantOutput {
	return o
}

func (o MaterializedViewGrantOutput) ToMaterializedViewGrantOutputWithContext(ctx context.Context) MaterializedViewGrantOutput {
	return o
}

// The name of the database containing the current or future materialized views on which to grant privileges.
func (o MaterializedViewGrantOutput) DatabaseName() pulumi.StringOutput {
	return o.ApplyT(func(v *MaterializedViewGrant) pulumi.StringOutput { return v.DatabaseName }).(pulumi.StringOutput)
}

// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
// grants applied to roles and objects outside Terraform.
func (o MaterializedViewGrantOutput) EnableMultipleGrants() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *MaterializedViewGrant) pulumi.BoolPtrOutput { return v.EnableMultipleGrants }).(pulumi.BoolPtrOutput)
}

// The name of the materialized view on which to grant privileges immediately (only valid if on*future and on*all are false).
func (o MaterializedViewGrantOutput) MaterializedViewName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *MaterializedViewGrant) pulumi.StringPtrOutput { return v.MaterializedViewName }).(pulumi.StringPtrOutput)
}

// When this is set to true and a schema*name is provided, apply this grant on all materialized views in the given schema. When this is true and no schema*name is provided apply this grant on all materialized views in the given database. The materialized*view*name and shares fields must be unset in order to use on*all. Cannot be used together with on*future.
func (o MaterializedViewGrantOutput) OnAll() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *MaterializedViewGrant) pulumi.BoolPtrOutput { return v.OnAll }).(pulumi.BoolPtrOutput)
}

// When this is set to true and a schema*name is provided, apply this grant on all future materialized views in the given schema. When this is true and no schema*name is provided apply this grant on all future materialized views in the given database. The materialized*view*name and shares fields must be unset in order to use on*future. Cannot be used together with on*all.
func (o MaterializedViewGrantOutput) OnFuture() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *MaterializedViewGrant) pulumi.BoolPtrOutput { return v.OnFuture }).(pulumi.BoolPtrOutput)
}

// The privilege to grant on the current or future materialized view.
func (o MaterializedViewGrantOutput) Privilege() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *MaterializedViewGrant) pulumi.StringPtrOutput { return v.Privilege }).(pulumi.StringPtrOutput)
}

// Grants privilege to these roles.
func (o MaterializedViewGrantOutput) Roles() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *MaterializedViewGrant) pulumi.StringArrayOutput { return v.Roles }).(pulumi.StringArrayOutput)
}

// The name of the schema containing the current or future materialized views on which to grant privileges.
func (o MaterializedViewGrantOutput) SchemaName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *MaterializedViewGrant) pulumi.StringPtrOutput { return v.SchemaName }).(pulumi.StringPtrOutput)
}

// Grants privilege to these shares (only valid if on*future and on*all are false).
func (o MaterializedViewGrantOutput) Shares() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *MaterializedViewGrant) pulumi.StringArrayOutput { return v.Shares }).(pulumi.StringArrayOutput)
}

// When this is set to true, allows the recipient role to grant the privileges to other roles.
func (o MaterializedViewGrantOutput) WithGrantOption() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *MaterializedViewGrant) pulumi.BoolPtrOutput { return v.WithGrantOption }).(pulumi.BoolPtrOutput)
}

type MaterializedViewGrantArrayOutput struct{ *pulumi.OutputState }

func (MaterializedViewGrantArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MaterializedViewGrant)(nil)).Elem()
}

func (o MaterializedViewGrantArrayOutput) ToMaterializedViewGrantArrayOutput() MaterializedViewGrantArrayOutput {
	return o
}

func (o MaterializedViewGrantArrayOutput) ToMaterializedViewGrantArrayOutputWithContext(ctx context.Context) MaterializedViewGrantArrayOutput {
	return o
}

func (o MaterializedViewGrantArrayOutput) Index(i pulumi.IntInput) MaterializedViewGrantOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *MaterializedViewGrant {
		return vs[0].([]*MaterializedViewGrant)[vs[1].(int)]
	}).(MaterializedViewGrantOutput)
}

type MaterializedViewGrantMapOutput struct{ *pulumi.OutputState }

func (MaterializedViewGrantMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MaterializedViewGrant)(nil)).Elem()
}

func (o MaterializedViewGrantMapOutput) ToMaterializedViewGrantMapOutput() MaterializedViewGrantMapOutput {
	return o
}

func (o MaterializedViewGrantMapOutput) ToMaterializedViewGrantMapOutputWithContext(ctx context.Context) MaterializedViewGrantMapOutput {
	return o
}

func (o MaterializedViewGrantMapOutput) MapIndex(k pulumi.StringInput) MaterializedViewGrantOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *MaterializedViewGrant {
		return vs[0].(map[string]*MaterializedViewGrant)[vs[1].(string)]
	}).(MaterializedViewGrantOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*MaterializedViewGrantInput)(nil)).Elem(), &MaterializedViewGrant{})
	pulumi.RegisterInputType(reflect.TypeOf((*MaterializedViewGrantArrayInput)(nil)).Elem(), MaterializedViewGrantArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*MaterializedViewGrantMapInput)(nil)).Elem(), MaterializedViewGrantMap{})
	pulumi.RegisterOutputType(MaterializedViewGrantOutput{})
	pulumi.RegisterOutputType(MaterializedViewGrantArrayOutput{})
	pulumi.RegisterOutputType(MaterializedViewGrantMapOutput{})
}
