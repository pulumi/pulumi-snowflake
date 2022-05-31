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
// 	"github.com/pulumi/pulumi-snowflake/sdk/go/snowflake"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := snowflake.NewRowAccessPolicyGrant(ctx, "grant", &snowflake.RowAccessPolicyGrantArgs{
// 			DatabaseName: pulumi.String("db"),
// 			Privilege:    pulumi.String("APPLY"),
// 			Roles: pulumi.StringArray{
// 				pulumi.String("role1"),
// 				pulumi.String("role2"),
// 			},
// 			RowAccessPolicyName: pulumi.String("row_access_policy"),
// 			SchemaName:          pulumi.String("schema"),
// 			WithGrantOption:     pulumi.Bool(false),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// # format is database name | schema name | row access policy name | privilege | true/false for with_grant_option
//
// ```sh
//  $ pulumi import snowflake:index/rowAccessPolicyGrant:RowAccessPolicyGrant example 'dbName|schemaName|rowAccessPolicyName|SELECT|false'
// ```
type RowAccessPolicyGrant struct {
	pulumi.CustomResourceState

	// The name of the database containing the row access policy on which to grant privileges.
	DatabaseName pulumi.StringOutput `pulumi:"databaseName"`
	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants pulumi.BoolPtrOutput `pulumi:"enableMultipleGrants"`
	// The privilege to grant on the row access policy.
	Privilege pulumi.StringPtrOutput `pulumi:"privilege"`
	// Grants privilege to these roles.
	Roles pulumi.StringArrayOutput `pulumi:"roles"`
	// The name of the row access policy on which to grant privileges immediately.
	RowAccessPolicyName pulumi.StringOutput `pulumi:"rowAccessPolicyName"`
	// The name of the schema containing the row access policy on which to grant privileges.
	SchemaName pulumi.StringOutput `pulumi:"schemaName"`
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption pulumi.BoolPtrOutput `pulumi:"withGrantOption"`
}

// NewRowAccessPolicyGrant registers a new resource with the given unique name, arguments, and options.
func NewRowAccessPolicyGrant(ctx *pulumi.Context,
	name string, args *RowAccessPolicyGrantArgs, opts ...pulumi.ResourceOption) (*RowAccessPolicyGrant, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DatabaseName == nil {
		return nil, errors.New("invalid value for required argument 'DatabaseName'")
	}
	if args.RowAccessPolicyName == nil {
		return nil, errors.New("invalid value for required argument 'RowAccessPolicyName'")
	}
	if args.SchemaName == nil {
		return nil, errors.New("invalid value for required argument 'SchemaName'")
	}
	var resource RowAccessPolicyGrant
	err := ctx.RegisterResource("snowflake:index/rowAccessPolicyGrant:RowAccessPolicyGrant", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRowAccessPolicyGrant gets an existing RowAccessPolicyGrant resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRowAccessPolicyGrant(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RowAccessPolicyGrantState, opts ...pulumi.ResourceOption) (*RowAccessPolicyGrant, error) {
	var resource RowAccessPolicyGrant
	err := ctx.ReadResource("snowflake:index/rowAccessPolicyGrant:RowAccessPolicyGrant", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering RowAccessPolicyGrant resources.
type rowAccessPolicyGrantState struct {
	// The name of the database containing the row access policy on which to grant privileges.
	DatabaseName *string `pulumi:"databaseName"`
	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants *bool `pulumi:"enableMultipleGrants"`
	// The privilege to grant on the row access policy.
	Privilege *string `pulumi:"privilege"`
	// Grants privilege to these roles.
	Roles []string `pulumi:"roles"`
	// The name of the row access policy on which to grant privileges immediately.
	RowAccessPolicyName *string `pulumi:"rowAccessPolicyName"`
	// The name of the schema containing the row access policy on which to grant privileges.
	SchemaName *string `pulumi:"schemaName"`
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption *bool `pulumi:"withGrantOption"`
}

type RowAccessPolicyGrantState struct {
	// The name of the database containing the row access policy on which to grant privileges.
	DatabaseName pulumi.StringPtrInput
	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants pulumi.BoolPtrInput
	// The privilege to grant on the row access policy.
	Privilege pulumi.StringPtrInput
	// Grants privilege to these roles.
	Roles pulumi.StringArrayInput
	// The name of the row access policy on which to grant privileges immediately.
	RowAccessPolicyName pulumi.StringPtrInput
	// The name of the schema containing the row access policy on which to grant privileges.
	SchemaName pulumi.StringPtrInput
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption pulumi.BoolPtrInput
}

func (RowAccessPolicyGrantState) ElementType() reflect.Type {
	return reflect.TypeOf((*rowAccessPolicyGrantState)(nil)).Elem()
}

type rowAccessPolicyGrantArgs struct {
	// The name of the database containing the row access policy on which to grant privileges.
	DatabaseName string `pulumi:"databaseName"`
	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants *bool `pulumi:"enableMultipleGrants"`
	// The privilege to grant on the row access policy.
	Privilege *string `pulumi:"privilege"`
	// Grants privilege to these roles.
	Roles []string `pulumi:"roles"`
	// The name of the row access policy on which to grant privileges immediately.
	RowAccessPolicyName string `pulumi:"rowAccessPolicyName"`
	// The name of the schema containing the row access policy on which to grant privileges.
	SchemaName string `pulumi:"schemaName"`
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption *bool `pulumi:"withGrantOption"`
}

// The set of arguments for constructing a RowAccessPolicyGrant resource.
type RowAccessPolicyGrantArgs struct {
	// The name of the database containing the row access policy on which to grant privileges.
	DatabaseName pulumi.StringInput
	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants pulumi.BoolPtrInput
	// The privilege to grant on the row access policy.
	Privilege pulumi.StringPtrInput
	// Grants privilege to these roles.
	Roles pulumi.StringArrayInput
	// The name of the row access policy on which to grant privileges immediately.
	RowAccessPolicyName pulumi.StringInput
	// The name of the schema containing the row access policy on which to grant privileges.
	SchemaName pulumi.StringInput
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption pulumi.BoolPtrInput
}

func (RowAccessPolicyGrantArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*rowAccessPolicyGrantArgs)(nil)).Elem()
}

type RowAccessPolicyGrantInput interface {
	pulumi.Input

	ToRowAccessPolicyGrantOutput() RowAccessPolicyGrantOutput
	ToRowAccessPolicyGrantOutputWithContext(ctx context.Context) RowAccessPolicyGrantOutput
}

func (*RowAccessPolicyGrant) ElementType() reflect.Type {
	return reflect.TypeOf((**RowAccessPolicyGrant)(nil)).Elem()
}

func (i *RowAccessPolicyGrant) ToRowAccessPolicyGrantOutput() RowAccessPolicyGrantOutput {
	return i.ToRowAccessPolicyGrantOutputWithContext(context.Background())
}

func (i *RowAccessPolicyGrant) ToRowAccessPolicyGrantOutputWithContext(ctx context.Context) RowAccessPolicyGrantOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RowAccessPolicyGrantOutput)
}

// RowAccessPolicyGrantArrayInput is an input type that accepts RowAccessPolicyGrantArray and RowAccessPolicyGrantArrayOutput values.
// You can construct a concrete instance of `RowAccessPolicyGrantArrayInput` via:
//
//          RowAccessPolicyGrantArray{ RowAccessPolicyGrantArgs{...} }
type RowAccessPolicyGrantArrayInput interface {
	pulumi.Input

	ToRowAccessPolicyGrantArrayOutput() RowAccessPolicyGrantArrayOutput
	ToRowAccessPolicyGrantArrayOutputWithContext(context.Context) RowAccessPolicyGrantArrayOutput
}

type RowAccessPolicyGrantArray []RowAccessPolicyGrantInput

func (RowAccessPolicyGrantArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RowAccessPolicyGrant)(nil)).Elem()
}

func (i RowAccessPolicyGrantArray) ToRowAccessPolicyGrantArrayOutput() RowAccessPolicyGrantArrayOutput {
	return i.ToRowAccessPolicyGrantArrayOutputWithContext(context.Background())
}

func (i RowAccessPolicyGrantArray) ToRowAccessPolicyGrantArrayOutputWithContext(ctx context.Context) RowAccessPolicyGrantArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RowAccessPolicyGrantArrayOutput)
}

// RowAccessPolicyGrantMapInput is an input type that accepts RowAccessPolicyGrantMap and RowAccessPolicyGrantMapOutput values.
// You can construct a concrete instance of `RowAccessPolicyGrantMapInput` via:
//
//          RowAccessPolicyGrantMap{ "key": RowAccessPolicyGrantArgs{...} }
type RowAccessPolicyGrantMapInput interface {
	pulumi.Input

	ToRowAccessPolicyGrantMapOutput() RowAccessPolicyGrantMapOutput
	ToRowAccessPolicyGrantMapOutputWithContext(context.Context) RowAccessPolicyGrantMapOutput
}

type RowAccessPolicyGrantMap map[string]RowAccessPolicyGrantInput

func (RowAccessPolicyGrantMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RowAccessPolicyGrant)(nil)).Elem()
}

func (i RowAccessPolicyGrantMap) ToRowAccessPolicyGrantMapOutput() RowAccessPolicyGrantMapOutput {
	return i.ToRowAccessPolicyGrantMapOutputWithContext(context.Background())
}

func (i RowAccessPolicyGrantMap) ToRowAccessPolicyGrantMapOutputWithContext(ctx context.Context) RowAccessPolicyGrantMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RowAccessPolicyGrantMapOutput)
}

type RowAccessPolicyGrantOutput struct{ *pulumi.OutputState }

func (RowAccessPolicyGrantOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**RowAccessPolicyGrant)(nil)).Elem()
}

func (o RowAccessPolicyGrantOutput) ToRowAccessPolicyGrantOutput() RowAccessPolicyGrantOutput {
	return o
}

func (o RowAccessPolicyGrantOutput) ToRowAccessPolicyGrantOutputWithContext(ctx context.Context) RowAccessPolicyGrantOutput {
	return o
}

// The name of the database containing the row access policy on which to grant privileges.
func (o RowAccessPolicyGrantOutput) DatabaseName() pulumi.StringOutput {
	return o.ApplyT(func(v *RowAccessPolicyGrant) pulumi.StringOutput { return v.DatabaseName }).(pulumi.StringOutput)
}

// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
// grants applied to roles and objects outside Terraform.
func (o RowAccessPolicyGrantOutput) EnableMultipleGrants() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *RowAccessPolicyGrant) pulumi.BoolPtrOutput { return v.EnableMultipleGrants }).(pulumi.BoolPtrOutput)
}

// The privilege to grant on the row access policy.
func (o RowAccessPolicyGrantOutput) Privilege() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *RowAccessPolicyGrant) pulumi.StringPtrOutput { return v.Privilege }).(pulumi.StringPtrOutput)
}

// Grants privilege to these roles.
func (o RowAccessPolicyGrantOutput) Roles() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *RowAccessPolicyGrant) pulumi.StringArrayOutput { return v.Roles }).(pulumi.StringArrayOutput)
}

// The name of the row access policy on which to grant privileges immediately.
func (o RowAccessPolicyGrantOutput) RowAccessPolicyName() pulumi.StringOutput {
	return o.ApplyT(func(v *RowAccessPolicyGrant) pulumi.StringOutput { return v.RowAccessPolicyName }).(pulumi.StringOutput)
}

// The name of the schema containing the row access policy on which to grant privileges.
func (o RowAccessPolicyGrantOutput) SchemaName() pulumi.StringOutput {
	return o.ApplyT(func(v *RowAccessPolicyGrant) pulumi.StringOutput { return v.SchemaName }).(pulumi.StringOutput)
}

// When this is set to true, allows the recipient role to grant the privileges to other roles.
func (o RowAccessPolicyGrantOutput) WithGrantOption() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *RowAccessPolicyGrant) pulumi.BoolPtrOutput { return v.WithGrantOption }).(pulumi.BoolPtrOutput)
}

type RowAccessPolicyGrantArrayOutput struct{ *pulumi.OutputState }

func (RowAccessPolicyGrantArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RowAccessPolicyGrant)(nil)).Elem()
}

func (o RowAccessPolicyGrantArrayOutput) ToRowAccessPolicyGrantArrayOutput() RowAccessPolicyGrantArrayOutput {
	return o
}

func (o RowAccessPolicyGrantArrayOutput) ToRowAccessPolicyGrantArrayOutputWithContext(ctx context.Context) RowAccessPolicyGrantArrayOutput {
	return o
}

func (o RowAccessPolicyGrantArrayOutput) Index(i pulumi.IntInput) RowAccessPolicyGrantOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *RowAccessPolicyGrant {
		return vs[0].([]*RowAccessPolicyGrant)[vs[1].(int)]
	}).(RowAccessPolicyGrantOutput)
}

type RowAccessPolicyGrantMapOutput struct{ *pulumi.OutputState }

func (RowAccessPolicyGrantMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RowAccessPolicyGrant)(nil)).Elem()
}

func (o RowAccessPolicyGrantMapOutput) ToRowAccessPolicyGrantMapOutput() RowAccessPolicyGrantMapOutput {
	return o
}

func (o RowAccessPolicyGrantMapOutput) ToRowAccessPolicyGrantMapOutputWithContext(ctx context.Context) RowAccessPolicyGrantMapOutput {
	return o
}

func (o RowAccessPolicyGrantMapOutput) MapIndex(k pulumi.StringInput) RowAccessPolicyGrantOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *RowAccessPolicyGrant {
		return vs[0].(map[string]*RowAccessPolicyGrant)[vs[1].(string)]
	}).(RowAccessPolicyGrantOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RowAccessPolicyGrantInput)(nil)).Elem(), &RowAccessPolicyGrant{})
	pulumi.RegisterInputType(reflect.TypeOf((*RowAccessPolicyGrantArrayInput)(nil)).Elem(), RowAccessPolicyGrantArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RowAccessPolicyGrantMapInput)(nil)).Elem(), RowAccessPolicyGrantMap{})
	pulumi.RegisterOutputType(RowAccessPolicyGrantOutput{})
	pulumi.RegisterOutputType(RowAccessPolicyGrantArrayOutput{})
	pulumi.RegisterOutputType(RowAccessPolicyGrantMapOutput{})
}
