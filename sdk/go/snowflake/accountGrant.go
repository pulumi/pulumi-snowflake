// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package snowflake

import (
	"context"
	"reflect"

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
//			_, err := snowflake.NewAccountGrant(ctx, "grant", &snowflake.AccountGrantArgs{
//				Privilege: pulumi.String("CREATE ROLE"),
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
// <!--End PulumiCodeChooser -->
//
// ## Import
//
// format is privilege|with_grant_option|roles
//
// ```sh
// $ pulumi import snowflake:index/accountGrant:AccountGrant example "privilege|false|role1,role2"
// ```
type AccountGrant struct {
	pulumi.CustomResourceState

	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants pulumi.BoolPtrOutput `pulumi:"enableMultipleGrants"`
	// The account privilege to grant. Valid privileges are those in [globalPrivileges](https://docs.snowflake.com/en/sql-reference/sql/grant-privilege.html). To grant all privileges, use the value `ALL PRIVILEGES`.
	Privilege pulumi.StringPtrOutput `pulumi:"privilege"`
	// Grants privilege to these roles.
	Roles pulumi.StringArrayOutput `pulumi:"roles"`
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption pulumi.BoolPtrOutput `pulumi:"withGrantOption"`
}

// NewAccountGrant registers a new resource with the given unique name, arguments, and options.
func NewAccountGrant(ctx *pulumi.Context,
	name string, args *AccountGrantArgs, opts ...pulumi.ResourceOption) (*AccountGrant, error) {
	if args == nil {
		args = &AccountGrantArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource AccountGrant
	err := ctx.RegisterResource("snowflake:index/accountGrant:AccountGrant", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAccountGrant gets an existing AccountGrant resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAccountGrant(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AccountGrantState, opts ...pulumi.ResourceOption) (*AccountGrant, error) {
	var resource AccountGrant
	err := ctx.ReadResource("snowflake:index/accountGrant:AccountGrant", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AccountGrant resources.
type accountGrantState struct {
	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants *bool `pulumi:"enableMultipleGrants"`
	// The account privilege to grant. Valid privileges are those in [globalPrivileges](https://docs.snowflake.com/en/sql-reference/sql/grant-privilege.html). To grant all privileges, use the value `ALL PRIVILEGES`.
	Privilege *string `pulumi:"privilege"`
	// Grants privilege to these roles.
	Roles []string `pulumi:"roles"`
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption *bool `pulumi:"withGrantOption"`
}

type AccountGrantState struct {
	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants pulumi.BoolPtrInput
	// The account privilege to grant. Valid privileges are those in [globalPrivileges](https://docs.snowflake.com/en/sql-reference/sql/grant-privilege.html). To grant all privileges, use the value `ALL PRIVILEGES`.
	Privilege pulumi.StringPtrInput
	// Grants privilege to these roles.
	Roles pulumi.StringArrayInput
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption pulumi.BoolPtrInput
}

func (AccountGrantState) ElementType() reflect.Type {
	return reflect.TypeOf((*accountGrantState)(nil)).Elem()
}

type accountGrantArgs struct {
	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants *bool `pulumi:"enableMultipleGrants"`
	// The account privilege to grant. Valid privileges are those in [globalPrivileges](https://docs.snowflake.com/en/sql-reference/sql/grant-privilege.html). To grant all privileges, use the value `ALL PRIVILEGES`.
	Privilege *string `pulumi:"privilege"`
	// Grants privilege to these roles.
	Roles []string `pulumi:"roles"`
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption *bool `pulumi:"withGrantOption"`
}

// The set of arguments for constructing a AccountGrant resource.
type AccountGrantArgs struct {
	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants pulumi.BoolPtrInput
	// The account privilege to grant. Valid privileges are those in [globalPrivileges](https://docs.snowflake.com/en/sql-reference/sql/grant-privilege.html). To grant all privileges, use the value `ALL PRIVILEGES`.
	Privilege pulumi.StringPtrInput
	// Grants privilege to these roles.
	Roles pulumi.StringArrayInput
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption pulumi.BoolPtrInput
}

func (AccountGrantArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*accountGrantArgs)(nil)).Elem()
}

type AccountGrantInput interface {
	pulumi.Input

	ToAccountGrantOutput() AccountGrantOutput
	ToAccountGrantOutputWithContext(ctx context.Context) AccountGrantOutput
}

func (*AccountGrant) ElementType() reflect.Type {
	return reflect.TypeOf((**AccountGrant)(nil)).Elem()
}

func (i *AccountGrant) ToAccountGrantOutput() AccountGrantOutput {
	return i.ToAccountGrantOutputWithContext(context.Background())
}

func (i *AccountGrant) ToAccountGrantOutputWithContext(ctx context.Context) AccountGrantOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccountGrantOutput)
}

// AccountGrantArrayInput is an input type that accepts AccountGrantArray and AccountGrantArrayOutput values.
// You can construct a concrete instance of `AccountGrantArrayInput` via:
//
//	AccountGrantArray{ AccountGrantArgs{...} }
type AccountGrantArrayInput interface {
	pulumi.Input

	ToAccountGrantArrayOutput() AccountGrantArrayOutput
	ToAccountGrantArrayOutputWithContext(context.Context) AccountGrantArrayOutput
}

type AccountGrantArray []AccountGrantInput

func (AccountGrantArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AccountGrant)(nil)).Elem()
}

func (i AccountGrantArray) ToAccountGrantArrayOutput() AccountGrantArrayOutput {
	return i.ToAccountGrantArrayOutputWithContext(context.Background())
}

func (i AccountGrantArray) ToAccountGrantArrayOutputWithContext(ctx context.Context) AccountGrantArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccountGrantArrayOutput)
}

// AccountGrantMapInput is an input type that accepts AccountGrantMap and AccountGrantMapOutput values.
// You can construct a concrete instance of `AccountGrantMapInput` via:
//
//	AccountGrantMap{ "key": AccountGrantArgs{...} }
type AccountGrantMapInput interface {
	pulumi.Input

	ToAccountGrantMapOutput() AccountGrantMapOutput
	ToAccountGrantMapOutputWithContext(context.Context) AccountGrantMapOutput
}

type AccountGrantMap map[string]AccountGrantInput

func (AccountGrantMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AccountGrant)(nil)).Elem()
}

func (i AccountGrantMap) ToAccountGrantMapOutput() AccountGrantMapOutput {
	return i.ToAccountGrantMapOutputWithContext(context.Background())
}

func (i AccountGrantMap) ToAccountGrantMapOutputWithContext(ctx context.Context) AccountGrantMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccountGrantMapOutput)
}

type AccountGrantOutput struct{ *pulumi.OutputState }

func (AccountGrantOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AccountGrant)(nil)).Elem()
}

func (o AccountGrantOutput) ToAccountGrantOutput() AccountGrantOutput {
	return o
}

func (o AccountGrantOutput) ToAccountGrantOutputWithContext(ctx context.Context) AccountGrantOutput {
	return o
}

// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
// grants applied to roles and objects outside Terraform.
func (o AccountGrantOutput) EnableMultipleGrants() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *AccountGrant) pulumi.BoolPtrOutput { return v.EnableMultipleGrants }).(pulumi.BoolPtrOutput)
}

// The account privilege to grant. Valid privileges are those in [globalPrivileges](https://docs.snowflake.com/en/sql-reference/sql/grant-privilege.html). To grant all privileges, use the value `ALL PRIVILEGES`.
func (o AccountGrantOutput) Privilege() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AccountGrant) pulumi.StringPtrOutput { return v.Privilege }).(pulumi.StringPtrOutput)
}

// Grants privilege to these roles.
func (o AccountGrantOutput) Roles() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *AccountGrant) pulumi.StringArrayOutput { return v.Roles }).(pulumi.StringArrayOutput)
}

// When this is set to true, allows the recipient role to grant the privileges to other roles.
func (o AccountGrantOutput) WithGrantOption() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *AccountGrant) pulumi.BoolPtrOutput { return v.WithGrantOption }).(pulumi.BoolPtrOutput)
}

type AccountGrantArrayOutput struct{ *pulumi.OutputState }

func (AccountGrantArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AccountGrant)(nil)).Elem()
}

func (o AccountGrantArrayOutput) ToAccountGrantArrayOutput() AccountGrantArrayOutput {
	return o
}

func (o AccountGrantArrayOutput) ToAccountGrantArrayOutputWithContext(ctx context.Context) AccountGrantArrayOutput {
	return o
}

func (o AccountGrantArrayOutput) Index(i pulumi.IntInput) AccountGrantOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AccountGrant {
		return vs[0].([]*AccountGrant)[vs[1].(int)]
	}).(AccountGrantOutput)
}

type AccountGrantMapOutput struct{ *pulumi.OutputState }

func (AccountGrantMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AccountGrant)(nil)).Elem()
}

func (o AccountGrantMapOutput) ToAccountGrantMapOutput() AccountGrantMapOutput {
	return o
}

func (o AccountGrantMapOutput) ToAccountGrantMapOutputWithContext(ctx context.Context) AccountGrantMapOutput {
	return o
}

func (o AccountGrantMapOutput) MapIndex(k pulumi.StringInput) AccountGrantOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AccountGrant {
		return vs[0].(map[string]*AccountGrant)[vs[1].(string)]
	}).(AccountGrantOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AccountGrantInput)(nil)).Elem(), &AccountGrant{})
	pulumi.RegisterInputType(reflect.TypeOf((*AccountGrantArrayInput)(nil)).Elem(), AccountGrantArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AccountGrantMapInput)(nil)).Elem(), AccountGrantMap{})
	pulumi.RegisterOutputType(AccountGrantOutput{})
	pulumi.RegisterOutputType(AccountGrantArrayOutput{})
	pulumi.RegisterOutputType(AccountGrantMapOutput{})
}
