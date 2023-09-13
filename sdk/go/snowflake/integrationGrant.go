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
//			_, err := snowflake.NewIntegrationGrant(ctx, "grant", &snowflake.IntegrationGrantArgs{
//				IntegrationName: pulumi.String("integration"),
//				Privilege:       pulumi.String("USAGE"),
//				Roles: pulumi.StringArray{
//					pulumi.String("role1"),
//					pulumi.String("role2"),
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
// format is integration_name|privilege|with_grant_option|roles
//
// ```sh
//
//	$ pulumi import snowflake:index/integrationGrant:IntegrationGrant example "MY_INTEGRATION|USAGE|false|role1,role2"
//
// ```
type IntegrationGrant struct {
	pulumi.CustomResourceState

	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants pulumi.BoolPtrOutput `pulumi:"enableMultipleGrants"`
	// Identifier for the integration; must be unique for your account.
	IntegrationName pulumi.StringOutput `pulumi:"integrationName"`
	// The privilege to grant on the integration. To grant all privileges, use the value `ALL PRIVILEGES`
	Privilege pulumi.StringPtrOutput `pulumi:"privilege"`
	// The name of the role to revert ownership to on destroy. Has no effect unless `privilege` is set to `OWNERSHIP`
	RevertOwnershipToRoleName pulumi.StringPtrOutput `pulumi:"revertOwnershipToRoleName"`
	// Grants privilege to these roles.
	Roles pulumi.StringArrayOutput `pulumi:"roles"`
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption pulumi.BoolPtrOutput `pulumi:"withGrantOption"`
}

// NewIntegrationGrant registers a new resource with the given unique name, arguments, and options.
func NewIntegrationGrant(ctx *pulumi.Context,
	name string, args *IntegrationGrantArgs, opts ...pulumi.ResourceOption) (*IntegrationGrant, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.IntegrationName == nil {
		return nil, errors.New("invalid value for required argument 'IntegrationName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource IntegrationGrant
	err := ctx.RegisterResource("snowflake:index/integrationGrant:IntegrationGrant", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetIntegrationGrant gets an existing IntegrationGrant resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetIntegrationGrant(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *IntegrationGrantState, opts ...pulumi.ResourceOption) (*IntegrationGrant, error) {
	var resource IntegrationGrant
	err := ctx.ReadResource("snowflake:index/integrationGrant:IntegrationGrant", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering IntegrationGrant resources.
type integrationGrantState struct {
	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants *bool `pulumi:"enableMultipleGrants"`
	// Identifier for the integration; must be unique for your account.
	IntegrationName *string `pulumi:"integrationName"`
	// The privilege to grant on the integration. To grant all privileges, use the value `ALL PRIVILEGES`
	Privilege *string `pulumi:"privilege"`
	// The name of the role to revert ownership to on destroy. Has no effect unless `privilege` is set to `OWNERSHIP`
	RevertOwnershipToRoleName *string `pulumi:"revertOwnershipToRoleName"`
	// Grants privilege to these roles.
	Roles []string `pulumi:"roles"`
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption *bool `pulumi:"withGrantOption"`
}

type IntegrationGrantState struct {
	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants pulumi.BoolPtrInput
	// Identifier for the integration; must be unique for your account.
	IntegrationName pulumi.StringPtrInput
	// The privilege to grant on the integration. To grant all privileges, use the value `ALL PRIVILEGES`
	Privilege pulumi.StringPtrInput
	// The name of the role to revert ownership to on destroy. Has no effect unless `privilege` is set to `OWNERSHIP`
	RevertOwnershipToRoleName pulumi.StringPtrInput
	// Grants privilege to these roles.
	Roles pulumi.StringArrayInput
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption pulumi.BoolPtrInput
}

func (IntegrationGrantState) ElementType() reflect.Type {
	return reflect.TypeOf((*integrationGrantState)(nil)).Elem()
}

type integrationGrantArgs struct {
	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants *bool `pulumi:"enableMultipleGrants"`
	// Identifier for the integration; must be unique for your account.
	IntegrationName string `pulumi:"integrationName"`
	// The privilege to grant on the integration. To grant all privileges, use the value `ALL PRIVILEGES`
	Privilege *string `pulumi:"privilege"`
	// The name of the role to revert ownership to on destroy. Has no effect unless `privilege` is set to `OWNERSHIP`
	RevertOwnershipToRoleName *string `pulumi:"revertOwnershipToRoleName"`
	// Grants privilege to these roles.
	Roles []string `pulumi:"roles"`
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption *bool `pulumi:"withGrantOption"`
}

// The set of arguments for constructing a IntegrationGrant resource.
type IntegrationGrantArgs struct {
	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants pulumi.BoolPtrInput
	// Identifier for the integration; must be unique for your account.
	IntegrationName pulumi.StringInput
	// The privilege to grant on the integration. To grant all privileges, use the value `ALL PRIVILEGES`
	Privilege pulumi.StringPtrInput
	// The name of the role to revert ownership to on destroy. Has no effect unless `privilege` is set to `OWNERSHIP`
	RevertOwnershipToRoleName pulumi.StringPtrInput
	// Grants privilege to these roles.
	Roles pulumi.StringArrayInput
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption pulumi.BoolPtrInput
}

func (IntegrationGrantArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*integrationGrantArgs)(nil)).Elem()
}

type IntegrationGrantInput interface {
	pulumi.Input

	ToIntegrationGrantOutput() IntegrationGrantOutput
	ToIntegrationGrantOutputWithContext(ctx context.Context) IntegrationGrantOutput
}

func (*IntegrationGrant) ElementType() reflect.Type {
	return reflect.TypeOf((**IntegrationGrant)(nil)).Elem()
}

func (i *IntegrationGrant) ToIntegrationGrantOutput() IntegrationGrantOutput {
	return i.ToIntegrationGrantOutputWithContext(context.Background())
}

func (i *IntegrationGrant) ToIntegrationGrantOutputWithContext(ctx context.Context) IntegrationGrantOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IntegrationGrantOutput)
}

func (i *IntegrationGrant) ToOutput(ctx context.Context) pulumix.Output[*IntegrationGrant] {
	return pulumix.Output[*IntegrationGrant]{
		OutputState: i.ToIntegrationGrantOutputWithContext(ctx).OutputState,
	}
}

// IntegrationGrantArrayInput is an input type that accepts IntegrationGrantArray and IntegrationGrantArrayOutput values.
// You can construct a concrete instance of `IntegrationGrantArrayInput` via:
//
//	IntegrationGrantArray{ IntegrationGrantArgs{...} }
type IntegrationGrantArrayInput interface {
	pulumi.Input

	ToIntegrationGrantArrayOutput() IntegrationGrantArrayOutput
	ToIntegrationGrantArrayOutputWithContext(context.Context) IntegrationGrantArrayOutput
}

type IntegrationGrantArray []IntegrationGrantInput

func (IntegrationGrantArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*IntegrationGrant)(nil)).Elem()
}

func (i IntegrationGrantArray) ToIntegrationGrantArrayOutput() IntegrationGrantArrayOutput {
	return i.ToIntegrationGrantArrayOutputWithContext(context.Background())
}

func (i IntegrationGrantArray) ToIntegrationGrantArrayOutputWithContext(ctx context.Context) IntegrationGrantArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IntegrationGrantArrayOutput)
}

func (i IntegrationGrantArray) ToOutput(ctx context.Context) pulumix.Output[[]*IntegrationGrant] {
	return pulumix.Output[[]*IntegrationGrant]{
		OutputState: i.ToIntegrationGrantArrayOutputWithContext(ctx).OutputState,
	}
}

// IntegrationGrantMapInput is an input type that accepts IntegrationGrantMap and IntegrationGrantMapOutput values.
// You can construct a concrete instance of `IntegrationGrantMapInput` via:
//
//	IntegrationGrantMap{ "key": IntegrationGrantArgs{...} }
type IntegrationGrantMapInput interface {
	pulumi.Input

	ToIntegrationGrantMapOutput() IntegrationGrantMapOutput
	ToIntegrationGrantMapOutputWithContext(context.Context) IntegrationGrantMapOutput
}

type IntegrationGrantMap map[string]IntegrationGrantInput

func (IntegrationGrantMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*IntegrationGrant)(nil)).Elem()
}

func (i IntegrationGrantMap) ToIntegrationGrantMapOutput() IntegrationGrantMapOutput {
	return i.ToIntegrationGrantMapOutputWithContext(context.Background())
}

func (i IntegrationGrantMap) ToIntegrationGrantMapOutputWithContext(ctx context.Context) IntegrationGrantMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IntegrationGrantMapOutput)
}

func (i IntegrationGrantMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*IntegrationGrant] {
	return pulumix.Output[map[string]*IntegrationGrant]{
		OutputState: i.ToIntegrationGrantMapOutputWithContext(ctx).OutputState,
	}
}

type IntegrationGrantOutput struct{ *pulumi.OutputState }

func (IntegrationGrantOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**IntegrationGrant)(nil)).Elem()
}

func (o IntegrationGrantOutput) ToIntegrationGrantOutput() IntegrationGrantOutput {
	return o
}

func (o IntegrationGrantOutput) ToIntegrationGrantOutputWithContext(ctx context.Context) IntegrationGrantOutput {
	return o
}

func (o IntegrationGrantOutput) ToOutput(ctx context.Context) pulumix.Output[*IntegrationGrant] {
	return pulumix.Output[*IntegrationGrant]{
		OutputState: o.OutputState,
	}
}

// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
// grants applied to roles and objects outside Terraform.
func (o IntegrationGrantOutput) EnableMultipleGrants() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *IntegrationGrant) pulumi.BoolPtrOutput { return v.EnableMultipleGrants }).(pulumi.BoolPtrOutput)
}

// Identifier for the integration; must be unique for your account.
func (o IntegrationGrantOutput) IntegrationName() pulumi.StringOutput {
	return o.ApplyT(func(v *IntegrationGrant) pulumi.StringOutput { return v.IntegrationName }).(pulumi.StringOutput)
}

// The privilege to grant on the integration. To grant all privileges, use the value `ALL PRIVILEGES`
func (o IntegrationGrantOutput) Privilege() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *IntegrationGrant) pulumi.StringPtrOutput { return v.Privilege }).(pulumi.StringPtrOutput)
}

// The name of the role to revert ownership to on destroy. Has no effect unless `privilege` is set to `OWNERSHIP`
func (o IntegrationGrantOutput) RevertOwnershipToRoleName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *IntegrationGrant) pulumi.StringPtrOutput { return v.RevertOwnershipToRoleName }).(pulumi.StringPtrOutput)
}

// Grants privilege to these roles.
func (o IntegrationGrantOutput) Roles() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *IntegrationGrant) pulumi.StringArrayOutput { return v.Roles }).(pulumi.StringArrayOutput)
}

// When this is set to true, allows the recipient role to grant the privileges to other roles.
func (o IntegrationGrantOutput) WithGrantOption() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *IntegrationGrant) pulumi.BoolPtrOutput { return v.WithGrantOption }).(pulumi.BoolPtrOutput)
}

type IntegrationGrantArrayOutput struct{ *pulumi.OutputState }

func (IntegrationGrantArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*IntegrationGrant)(nil)).Elem()
}

func (o IntegrationGrantArrayOutput) ToIntegrationGrantArrayOutput() IntegrationGrantArrayOutput {
	return o
}

func (o IntegrationGrantArrayOutput) ToIntegrationGrantArrayOutputWithContext(ctx context.Context) IntegrationGrantArrayOutput {
	return o
}

func (o IntegrationGrantArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*IntegrationGrant] {
	return pulumix.Output[[]*IntegrationGrant]{
		OutputState: o.OutputState,
	}
}

func (o IntegrationGrantArrayOutput) Index(i pulumi.IntInput) IntegrationGrantOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *IntegrationGrant {
		return vs[0].([]*IntegrationGrant)[vs[1].(int)]
	}).(IntegrationGrantOutput)
}

type IntegrationGrantMapOutput struct{ *pulumi.OutputState }

func (IntegrationGrantMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*IntegrationGrant)(nil)).Elem()
}

func (o IntegrationGrantMapOutput) ToIntegrationGrantMapOutput() IntegrationGrantMapOutput {
	return o
}

func (o IntegrationGrantMapOutput) ToIntegrationGrantMapOutputWithContext(ctx context.Context) IntegrationGrantMapOutput {
	return o
}

func (o IntegrationGrantMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*IntegrationGrant] {
	return pulumix.Output[map[string]*IntegrationGrant]{
		OutputState: o.OutputState,
	}
}

func (o IntegrationGrantMapOutput) MapIndex(k pulumi.StringInput) IntegrationGrantOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *IntegrationGrant {
		return vs[0].(map[string]*IntegrationGrant)[vs[1].(string)]
	}).(IntegrationGrantOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*IntegrationGrantInput)(nil)).Elem(), &IntegrationGrant{})
	pulumi.RegisterInputType(reflect.TypeOf((*IntegrationGrantArrayInput)(nil)).Elem(), IntegrationGrantArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*IntegrationGrantMapInput)(nil)).Elem(), IntegrationGrantMap{})
	pulumi.RegisterOutputType(IntegrationGrantOutput{})
	pulumi.RegisterOutputType(IntegrationGrantArrayOutput{})
	pulumi.RegisterOutputType(IntegrationGrantMapOutput{})
}
