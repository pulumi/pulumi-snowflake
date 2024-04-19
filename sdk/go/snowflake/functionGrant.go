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

// > **Deprecation** This resource is deprecated and will be removed in a future major version release. Please use GrantPrivilegesToAccountRole instead. <deprecation>
//
// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
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
//			_, err := snowflake.NewFunctionGrant(ctx, "grant", &snowflake.FunctionGrantArgs{
//				DatabaseName: pulumi.String("database"),
//				SchemaName:   pulumi.String("schema"),
//				FunctionName: pulumi.String("function"),
//				ArgumentDataTypes: pulumi.StringArray{
//					pulumi.String("array"),
//					pulumi.String("string"),
//				},
//				Privilege: pulumi.String("USAGE"),
//				Roles: pulumi.StringArray{
//					pulumi.String("role1"),
//					pulumi.String("role2"),
//				},
//				Shares: pulumi.StringArray{
//					pulumi.String("share1"),
//					pulumi.String("share2"),
//				},
//				OnFuture:        pulumi.Bool(false),
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
// <!--End PulumiCodeChooser -->
//
// ## Import
//
// format is database_name|schema_name|function_name|argument_data_types|privilege|with_grant_option|on_future|roles|shares
//
// ```sh
// $ pulumi import snowflake:index/functionGrant:FunctionGrant example "MY_DATABASE|MY_SCHEMA|MY_FUNCTION|ARG1TYPE,ARG2TYPE|USAGE|false|false|role1,role2|share1,share2"
// ```
type FunctionGrant struct {
	pulumi.CustomResourceState

	// List of the argument data types for the function (must be present if function has arguments and functionName is present)
	ArgumentDataTypes pulumi.StringArrayOutput `pulumi:"argumentDataTypes"`
	// The name of the database containing the current or future functions on which to grant privileges.
	DatabaseName pulumi.StringOutput `pulumi:"databaseName"`
	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants pulumi.BoolPtrOutput `pulumi:"enableMultipleGrants"`
	// The name of the function on which to grant privileges immediately (only valid if onFuture is false).
	FunctionName pulumi.StringPtrOutput `pulumi:"functionName"`
	// When this is set to true and a schema*name is provided, apply this grant on all functions in the given schema. When this is true and no schema*name is provided apply this grant on all functions in the given database. The function*name, arguments, return*type, and shares fields must be unset in order to use on*all. Cannot be used together with on*future.
	OnAll pulumi.BoolPtrOutput `pulumi:"onAll"`
	// When this is set to true and a schema*name is provided, apply this grant on all future functions in the given schema. When this is true and no schema*name is provided apply this grant on all future functions in the given database. The function*name, arguments, return*type, and shares fields must be unset in order to use on*future. Cannot be used together with on*all.
	OnFuture pulumi.BoolPtrOutput `pulumi:"onFuture"`
	// The privilege to grant on the current or future function. Must be one of `USAGE` or `OWNERSHIP`. To grant all privileges, use the value `ALL PRIVILEGES`
	Privilege pulumi.StringPtrOutput `pulumi:"privilege"`
	// The name of the role to revert ownership to on destroy. Has no effect unless `privilege` is set to `OWNERSHIP`
	RevertOwnershipToRoleName pulumi.StringPtrOutput `pulumi:"revertOwnershipToRoleName"`
	// Grants privilege to these roles.
	Roles pulumi.StringArrayOutput `pulumi:"roles"`
	// The name of the schema containing the current or future functions on which to grant privileges.
	SchemaName pulumi.StringPtrOutput `pulumi:"schemaName"`
	// Grants privilege to these shares (only valid if onFuture is false).
	Shares pulumi.StringArrayOutput `pulumi:"shares"`
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption pulumi.BoolPtrOutput `pulumi:"withGrantOption"`
}

// NewFunctionGrant registers a new resource with the given unique name, arguments, and options.
func NewFunctionGrant(ctx *pulumi.Context,
	name string, args *FunctionGrantArgs, opts ...pulumi.ResourceOption) (*FunctionGrant, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DatabaseName == nil {
		return nil, errors.New("invalid value for required argument 'DatabaseName'")
	}
	if args.Roles == nil {
		return nil, errors.New("invalid value for required argument 'Roles'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource FunctionGrant
	err := ctx.RegisterResource("snowflake:index/functionGrant:FunctionGrant", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetFunctionGrant gets an existing FunctionGrant resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetFunctionGrant(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *FunctionGrantState, opts ...pulumi.ResourceOption) (*FunctionGrant, error) {
	var resource FunctionGrant
	err := ctx.ReadResource("snowflake:index/functionGrant:FunctionGrant", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering FunctionGrant resources.
type functionGrantState struct {
	// List of the argument data types for the function (must be present if function has arguments and functionName is present)
	ArgumentDataTypes []string `pulumi:"argumentDataTypes"`
	// The name of the database containing the current or future functions on which to grant privileges.
	DatabaseName *string `pulumi:"databaseName"`
	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants *bool `pulumi:"enableMultipleGrants"`
	// The name of the function on which to grant privileges immediately (only valid if onFuture is false).
	FunctionName *string `pulumi:"functionName"`
	// When this is set to true and a schema*name is provided, apply this grant on all functions in the given schema. When this is true and no schema*name is provided apply this grant on all functions in the given database. The function*name, arguments, return*type, and shares fields must be unset in order to use on*all. Cannot be used together with on*future.
	OnAll *bool `pulumi:"onAll"`
	// When this is set to true and a schema*name is provided, apply this grant on all future functions in the given schema. When this is true and no schema*name is provided apply this grant on all future functions in the given database. The function*name, arguments, return*type, and shares fields must be unset in order to use on*future. Cannot be used together with on*all.
	OnFuture *bool `pulumi:"onFuture"`
	// The privilege to grant on the current or future function. Must be one of `USAGE` or `OWNERSHIP`. To grant all privileges, use the value `ALL PRIVILEGES`
	Privilege *string `pulumi:"privilege"`
	// The name of the role to revert ownership to on destroy. Has no effect unless `privilege` is set to `OWNERSHIP`
	RevertOwnershipToRoleName *string `pulumi:"revertOwnershipToRoleName"`
	// Grants privilege to these roles.
	Roles []string `pulumi:"roles"`
	// The name of the schema containing the current or future functions on which to grant privileges.
	SchemaName *string `pulumi:"schemaName"`
	// Grants privilege to these shares (only valid if onFuture is false).
	Shares []string `pulumi:"shares"`
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption *bool `pulumi:"withGrantOption"`
}

type FunctionGrantState struct {
	// List of the argument data types for the function (must be present if function has arguments and functionName is present)
	ArgumentDataTypes pulumi.StringArrayInput
	// The name of the database containing the current or future functions on which to grant privileges.
	DatabaseName pulumi.StringPtrInput
	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants pulumi.BoolPtrInput
	// The name of the function on which to grant privileges immediately (only valid if onFuture is false).
	FunctionName pulumi.StringPtrInput
	// When this is set to true and a schema*name is provided, apply this grant on all functions in the given schema. When this is true and no schema*name is provided apply this grant on all functions in the given database. The function*name, arguments, return*type, and shares fields must be unset in order to use on*all. Cannot be used together with on*future.
	OnAll pulumi.BoolPtrInput
	// When this is set to true and a schema*name is provided, apply this grant on all future functions in the given schema. When this is true and no schema*name is provided apply this grant on all future functions in the given database. The function*name, arguments, return*type, and shares fields must be unset in order to use on*future. Cannot be used together with on*all.
	OnFuture pulumi.BoolPtrInput
	// The privilege to grant on the current or future function. Must be one of `USAGE` or `OWNERSHIP`. To grant all privileges, use the value `ALL PRIVILEGES`
	Privilege pulumi.StringPtrInput
	// The name of the role to revert ownership to on destroy. Has no effect unless `privilege` is set to `OWNERSHIP`
	RevertOwnershipToRoleName pulumi.StringPtrInput
	// Grants privilege to these roles.
	Roles pulumi.StringArrayInput
	// The name of the schema containing the current or future functions on which to grant privileges.
	SchemaName pulumi.StringPtrInput
	// Grants privilege to these shares (only valid if onFuture is false).
	Shares pulumi.StringArrayInput
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption pulumi.BoolPtrInput
}

func (FunctionGrantState) ElementType() reflect.Type {
	return reflect.TypeOf((*functionGrantState)(nil)).Elem()
}

type functionGrantArgs struct {
	// List of the argument data types for the function (must be present if function has arguments and functionName is present)
	ArgumentDataTypes []string `pulumi:"argumentDataTypes"`
	// The name of the database containing the current or future functions on which to grant privileges.
	DatabaseName string `pulumi:"databaseName"`
	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants *bool `pulumi:"enableMultipleGrants"`
	// The name of the function on which to grant privileges immediately (only valid if onFuture is false).
	FunctionName *string `pulumi:"functionName"`
	// When this is set to true and a schema*name is provided, apply this grant on all functions in the given schema. When this is true and no schema*name is provided apply this grant on all functions in the given database. The function*name, arguments, return*type, and shares fields must be unset in order to use on*all. Cannot be used together with on*future.
	OnAll *bool `pulumi:"onAll"`
	// When this is set to true and a schema*name is provided, apply this grant on all future functions in the given schema. When this is true and no schema*name is provided apply this grant on all future functions in the given database. The function*name, arguments, return*type, and shares fields must be unset in order to use on*future. Cannot be used together with on*all.
	OnFuture *bool `pulumi:"onFuture"`
	// The privilege to grant on the current or future function. Must be one of `USAGE` or `OWNERSHIP`. To grant all privileges, use the value `ALL PRIVILEGES`
	Privilege *string `pulumi:"privilege"`
	// The name of the role to revert ownership to on destroy. Has no effect unless `privilege` is set to `OWNERSHIP`
	RevertOwnershipToRoleName *string `pulumi:"revertOwnershipToRoleName"`
	// Grants privilege to these roles.
	Roles []string `pulumi:"roles"`
	// The name of the schema containing the current or future functions on which to grant privileges.
	SchemaName *string `pulumi:"schemaName"`
	// Grants privilege to these shares (only valid if onFuture is false).
	Shares []string `pulumi:"shares"`
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption *bool `pulumi:"withGrantOption"`
}

// The set of arguments for constructing a FunctionGrant resource.
type FunctionGrantArgs struct {
	// List of the argument data types for the function (must be present if function has arguments and functionName is present)
	ArgumentDataTypes pulumi.StringArrayInput
	// The name of the database containing the current or future functions on which to grant privileges.
	DatabaseName pulumi.StringInput
	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants pulumi.BoolPtrInput
	// The name of the function on which to grant privileges immediately (only valid if onFuture is false).
	FunctionName pulumi.StringPtrInput
	// When this is set to true and a schema*name is provided, apply this grant on all functions in the given schema. When this is true and no schema*name is provided apply this grant on all functions in the given database. The function*name, arguments, return*type, and shares fields must be unset in order to use on*all. Cannot be used together with on*future.
	OnAll pulumi.BoolPtrInput
	// When this is set to true and a schema*name is provided, apply this grant on all future functions in the given schema. When this is true and no schema*name is provided apply this grant on all future functions in the given database. The function*name, arguments, return*type, and shares fields must be unset in order to use on*future. Cannot be used together with on*all.
	OnFuture pulumi.BoolPtrInput
	// The privilege to grant on the current or future function. Must be one of `USAGE` or `OWNERSHIP`. To grant all privileges, use the value `ALL PRIVILEGES`
	Privilege pulumi.StringPtrInput
	// The name of the role to revert ownership to on destroy. Has no effect unless `privilege` is set to `OWNERSHIP`
	RevertOwnershipToRoleName pulumi.StringPtrInput
	// Grants privilege to these roles.
	Roles pulumi.StringArrayInput
	// The name of the schema containing the current or future functions on which to grant privileges.
	SchemaName pulumi.StringPtrInput
	// Grants privilege to these shares (only valid if onFuture is false).
	Shares pulumi.StringArrayInput
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption pulumi.BoolPtrInput
}

func (FunctionGrantArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*functionGrantArgs)(nil)).Elem()
}

type FunctionGrantInput interface {
	pulumi.Input

	ToFunctionGrantOutput() FunctionGrantOutput
	ToFunctionGrantOutputWithContext(ctx context.Context) FunctionGrantOutput
}

func (*FunctionGrant) ElementType() reflect.Type {
	return reflect.TypeOf((**FunctionGrant)(nil)).Elem()
}

func (i *FunctionGrant) ToFunctionGrantOutput() FunctionGrantOutput {
	return i.ToFunctionGrantOutputWithContext(context.Background())
}

func (i *FunctionGrant) ToFunctionGrantOutputWithContext(ctx context.Context) FunctionGrantOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FunctionGrantOutput)
}

// FunctionGrantArrayInput is an input type that accepts FunctionGrantArray and FunctionGrantArrayOutput values.
// You can construct a concrete instance of `FunctionGrantArrayInput` via:
//
//	FunctionGrantArray{ FunctionGrantArgs{...} }
type FunctionGrantArrayInput interface {
	pulumi.Input

	ToFunctionGrantArrayOutput() FunctionGrantArrayOutput
	ToFunctionGrantArrayOutputWithContext(context.Context) FunctionGrantArrayOutput
}

type FunctionGrantArray []FunctionGrantInput

func (FunctionGrantArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*FunctionGrant)(nil)).Elem()
}

func (i FunctionGrantArray) ToFunctionGrantArrayOutput() FunctionGrantArrayOutput {
	return i.ToFunctionGrantArrayOutputWithContext(context.Background())
}

func (i FunctionGrantArray) ToFunctionGrantArrayOutputWithContext(ctx context.Context) FunctionGrantArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FunctionGrantArrayOutput)
}

// FunctionGrantMapInput is an input type that accepts FunctionGrantMap and FunctionGrantMapOutput values.
// You can construct a concrete instance of `FunctionGrantMapInput` via:
//
//	FunctionGrantMap{ "key": FunctionGrantArgs{...} }
type FunctionGrantMapInput interface {
	pulumi.Input

	ToFunctionGrantMapOutput() FunctionGrantMapOutput
	ToFunctionGrantMapOutputWithContext(context.Context) FunctionGrantMapOutput
}

type FunctionGrantMap map[string]FunctionGrantInput

func (FunctionGrantMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*FunctionGrant)(nil)).Elem()
}

func (i FunctionGrantMap) ToFunctionGrantMapOutput() FunctionGrantMapOutput {
	return i.ToFunctionGrantMapOutputWithContext(context.Background())
}

func (i FunctionGrantMap) ToFunctionGrantMapOutputWithContext(ctx context.Context) FunctionGrantMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FunctionGrantMapOutput)
}

type FunctionGrantOutput struct{ *pulumi.OutputState }

func (FunctionGrantOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**FunctionGrant)(nil)).Elem()
}

func (o FunctionGrantOutput) ToFunctionGrantOutput() FunctionGrantOutput {
	return o
}

func (o FunctionGrantOutput) ToFunctionGrantOutputWithContext(ctx context.Context) FunctionGrantOutput {
	return o
}

// List of the argument data types for the function (must be present if function has arguments and functionName is present)
func (o FunctionGrantOutput) ArgumentDataTypes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *FunctionGrant) pulumi.StringArrayOutput { return v.ArgumentDataTypes }).(pulumi.StringArrayOutput)
}

// The name of the database containing the current or future functions on which to grant privileges.
func (o FunctionGrantOutput) DatabaseName() pulumi.StringOutput {
	return o.ApplyT(func(v *FunctionGrant) pulumi.StringOutput { return v.DatabaseName }).(pulumi.StringOutput)
}

// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
// grants applied to roles and objects outside Terraform.
func (o FunctionGrantOutput) EnableMultipleGrants() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *FunctionGrant) pulumi.BoolPtrOutput { return v.EnableMultipleGrants }).(pulumi.BoolPtrOutput)
}

// The name of the function on which to grant privileges immediately (only valid if onFuture is false).
func (o FunctionGrantOutput) FunctionName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *FunctionGrant) pulumi.StringPtrOutput { return v.FunctionName }).(pulumi.StringPtrOutput)
}

// When this is set to true and a schema*name is provided, apply this grant on all functions in the given schema. When this is true and no schema*name is provided apply this grant on all functions in the given database. The function*name, arguments, return*type, and shares fields must be unset in order to use on*all. Cannot be used together with on*future.
func (o FunctionGrantOutput) OnAll() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *FunctionGrant) pulumi.BoolPtrOutput { return v.OnAll }).(pulumi.BoolPtrOutput)
}

// When this is set to true and a schema*name is provided, apply this grant on all future functions in the given schema. When this is true and no schema*name is provided apply this grant on all future functions in the given database. The function*name, arguments, return*type, and shares fields must be unset in order to use on*future. Cannot be used together with on*all.
func (o FunctionGrantOutput) OnFuture() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *FunctionGrant) pulumi.BoolPtrOutput { return v.OnFuture }).(pulumi.BoolPtrOutput)
}

// The privilege to grant on the current or future function. Must be one of `USAGE` or `OWNERSHIP`. To grant all privileges, use the value `ALL PRIVILEGES`
func (o FunctionGrantOutput) Privilege() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *FunctionGrant) pulumi.StringPtrOutput { return v.Privilege }).(pulumi.StringPtrOutput)
}

// The name of the role to revert ownership to on destroy. Has no effect unless `privilege` is set to `OWNERSHIP`
func (o FunctionGrantOutput) RevertOwnershipToRoleName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *FunctionGrant) pulumi.StringPtrOutput { return v.RevertOwnershipToRoleName }).(pulumi.StringPtrOutput)
}

// Grants privilege to these roles.
func (o FunctionGrantOutput) Roles() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *FunctionGrant) pulumi.StringArrayOutput { return v.Roles }).(pulumi.StringArrayOutput)
}

// The name of the schema containing the current or future functions on which to grant privileges.
func (o FunctionGrantOutput) SchemaName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *FunctionGrant) pulumi.StringPtrOutput { return v.SchemaName }).(pulumi.StringPtrOutput)
}

// Grants privilege to these shares (only valid if onFuture is false).
func (o FunctionGrantOutput) Shares() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *FunctionGrant) pulumi.StringArrayOutput { return v.Shares }).(pulumi.StringArrayOutput)
}

// When this is set to true, allows the recipient role to grant the privileges to other roles.
func (o FunctionGrantOutput) WithGrantOption() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *FunctionGrant) pulumi.BoolPtrOutput { return v.WithGrantOption }).(pulumi.BoolPtrOutput)
}

type FunctionGrantArrayOutput struct{ *pulumi.OutputState }

func (FunctionGrantArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*FunctionGrant)(nil)).Elem()
}

func (o FunctionGrantArrayOutput) ToFunctionGrantArrayOutput() FunctionGrantArrayOutput {
	return o
}

func (o FunctionGrantArrayOutput) ToFunctionGrantArrayOutputWithContext(ctx context.Context) FunctionGrantArrayOutput {
	return o
}

func (o FunctionGrantArrayOutput) Index(i pulumi.IntInput) FunctionGrantOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *FunctionGrant {
		return vs[0].([]*FunctionGrant)[vs[1].(int)]
	}).(FunctionGrantOutput)
}

type FunctionGrantMapOutput struct{ *pulumi.OutputState }

func (FunctionGrantMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*FunctionGrant)(nil)).Elem()
}

func (o FunctionGrantMapOutput) ToFunctionGrantMapOutput() FunctionGrantMapOutput {
	return o
}

func (o FunctionGrantMapOutput) ToFunctionGrantMapOutputWithContext(ctx context.Context) FunctionGrantMapOutput {
	return o
}

func (o FunctionGrantMapOutput) MapIndex(k pulumi.StringInput) FunctionGrantOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *FunctionGrant {
		return vs[0].(map[string]*FunctionGrant)[vs[1].(string)]
	}).(FunctionGrantOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*FunctionGrantInput)(nil)).Elem(), &FunctionGrant{})
	pulumi.RegisterInputType(reflect.TypeOf((*FunctionGrantArrayInput)(nil)).Elem(), FunctionGrantArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*FunctionGrantMapInput)(nil)).Elem(), FunctionGrantMap{})
	pulumi.RegisterOutputType(FunctionGrantOutput{})
	pulumi.RegisterOutputType(FunctionGrantArrayOutput{})
	pulumi.RegisterOutputType(FunctionGrantMapOutput{})
}
