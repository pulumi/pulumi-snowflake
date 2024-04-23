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

// The account resource allows you to create and manage Snowflake accounts.
//
//	**WARNING** This resource cannot be destroyed!!! The only way to delete accounts is to go through [Snowflake Support](https://docs.snowflake.com/en/user-guide/organizations-manage-accounts.html#deleting-an-account)
//
//	**NOTE** ORGADMIN priviliges are required for this resource
//
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
//			_, err := snowflake.NewAccount(ctx, "ac1", &snowflake.AccountArgs{
//				Name:               pulumi.String("SNOWFLAKE_TEST_ACCOUNT"),
//				AdminName:          pulumi.String("John Doe"),
//				AdminPassword:      pulumi.String("Abcd1234!"),
//				Email:              pulumi.String("john.doe@snowflake.com"),
//				FirstName:          pulumi.String("John"),
//				LastName:           pulumi.String("Doe"),
//				MustChangePassword: pulumi.Bool(true),
//				Edition:            pulumi.String("STANDARD"),
//				Comment:            pulumi.String("Snowflake Test Account"),
//				Region:             pulumi.String("AWS_US_WEST_2"),
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
// ```sh
// $ pulumi import snowflake:index/account:Account account <account_locator>
// ```
type Account struct {
	pulumi.CustomResourceState

	// Login name of the initial administrative user of the account. A new user is created in the new account with this name and password and granted the ACCOUNTADMIN role in the account. A login name can be any string consisting of letters, numbers, and underscores. Login names are always case-insensitive.
	AdminName pulumi.StringOutput `pulumi:"adminName"`
	// Password for the initial administrative user of the account. Optional if the `ADMIN_RSA_PUBLIC_KEY` parameter is specified. For more information about passwords in Snowflake, see [Snowflake-provided Password Policy](https://docs.snowflake.com/en/sql-reference/sql/create-account.html#:~:text=Snowflake%2Dprovided%20Password%20Policy).
	AdminPassword pulumi.StringPtrOutput `pulumi:"adminPassword"`
	// Assigns a public key to the initial administrative user of the account in order to implement [key pair authentication](https://docs.snowflake.com/en/sql-reference/sql/create-account.html#:~:text=key%20pair%20authentication) for the user. Optional if the `ADMIN_PASSWORD` parameter is specified.
	AdminRsaPublicKey pulumi.StringPtrOutput `pulumi:"adminRsaPublicKey"`
	// Specifies a comment for the account.
	Comment pulumi.StringPtrOutput `pulumi:"comment"`
	// [Snowflake Edition](https://docs.snowflake.com/en/user-guide/intro-editions.html) of the account. Valid values are: STANDARD | ENTERPRISE | BUSINESS_CRITICAL
	Edition pulumi.StringOutput `pulumi:"edition"`
	// Email address of the initial administrative user of the account. This email address is used to send any notifications about the account.
	Email pulumi.StringOutput `pulumi:"email"`
	// First name of the initial administrative user of the account
	FirstName pulumi.StringPtrOutput `pulumi:"firstName"`
	// Specifies the number of days to wait before dropping the account. The default is 3 days.
	GracePeriodInDays pulumi.IntPtrOutput `pulumi:"gracePeriodInDays"`
	// Indicates whether the ORGADMIN role is enabled in an account. If TRUE, the role is enabled.
	IsOrgAdmin pulumi.BoolOutput `pulumi:"isOrgAdmin"`
	// Last name of the initial administrative user of the account
	LastName pulumi.StringPtrOutput `pulumi:"lastName"`
	// Specifies whether the new user created to administer the account is forced to change their password upon first login into the account.
	MustChangePassword pulumi.BoolPtrOutput `pulumi:"mustChangePassword"`
	// Specifies the identifier (i.e. name) for the account; must be unique within an organization, regardless of which Snowflake Region the account is in. In addition, the identifier must start with an alphabetic character and cannot contain spaces or special characters except for underscores (_). Note that if the account name includes underscores, features that do not accept account names with underscores (e.g. Okta SSO or SCIM) can reference a version of the account name that substitutes hyphens (-) for the underscores.
	Name pulumi.StringOutput `pulumi:"name"`
	// ID of the Snowflake Region where the account is created. If no value is provided, Snowflake creates the account in the same Snowflake Region as the current account (i.e. the account in which the CREATE ACCOUNT statement is executed.)
	Region pulumi.StringPtrOutput `pulumi:"region"`
	// ID of the Snowflake Region where the account is created. If no value is provided, Snowflake creates the account in the same Snowflake Region as the current account (i.e. the account in which the CREATE ACCOUNT statement is executed.)
	RegionGroup pulumi.StringPtrOutput `pulumi:"regionGroup"`
}

// NewAccount registers a new resource with the given unique name, arguments, and options.
func NewAccount(ctx *pulumi.Context,
	name string, args *AccountArgs, opts ...pulumi.ResourceOption) (*Account, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AdminName == nil {
		return nil, errors.New("invalid value for required argument 'AdminName'")
	}
	if args.Edition == nil {
		return nil, errors.New("invalid value for required argument 'Edition'")
	}
	if args.Email == nil {
		return nil, errors.New("invalid value for required argument 'Email'")
	}
	if args.AdminPassword != nil {
		args.AdminPassword = pulumi.ToSecret(args.AdminPassword).(pulumi.StringPtrInput)
	}
	if args.AdminRsaPublicKey != nil {
		args.AdminRsaPublicKey = pulumi.ToSecret(args.AdminRsaPublicKey).(pulumi.StringPtrInput)
	}
	if args.Email != nil {
		args.Email = pulumi.ToSecret(args.Email).(pulumi.StringInput)
	}
	if args.FirstName != nil {
		args.FirstName = pulumi.ToSecret(args.FirstName).(pulumi.StringPtrInput)
	}
	if args.LastName != nil {
		args.LastName = pulumi.ToSecret(args.LastName).(pulumi.StringPtrInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"adminPassword",
		"adminRsaPublicKey",
		"email",
		"firstName",
		"lastName",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Account
	err := ctx.RegisterResource("snowflake:index/account:Account", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAccount gets an existing Account resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAccount(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AccountState, opts ...pulumi.ResourceOption) (*Account, error) {
	var resource Account
	err := ctx.ReadResource("snowflake:index/account:Account", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Account resources.
type accountState struct {
	// Login name of the initial administrative user of the account. A new user is created in the new account with this name and password and granted the ACCOUNTADMIN role in the account. A login name can be any string consisting of letters, numbers, and underscores. Login names are always case-insensitive.
	AdminName *string `pulumi:"adminName"`
	// Password for the initial administrative user of the account. Optional if the `ADMIN_RSA_PUBLIC_KEY` parameter is specified. For more information about passwords in Snowflake, see [Snowflake-provided Password Policy](https://docs.snowflake.com/en/sql-reference/sql/create-account.html#:~:text=Snowflake%2Dprovided%20Password%20Policy).
	AdminPassword *string `pulumi:"adminPassword"`
	// Assigns a public key to the initial administrative user of the account in order to implement [key pair authentication](https://docs.snowflake.com/en/sql-reference/sql/create-account.html#:~:text=key%20pair%20authentication) for the user. Optional if the `ADMIN_PASSWORD` parameter is specified.
	AdminRsaPublicKey *string `pulumi:"adminRsaPublicKey"`
	// Specifies a comment for the account.
	Comment *string `pulumi:"comment"`
	// [Snowflake Edition](https://docs.snowflake.com/en/user-guide/intro-editions.html) of the account. Valid values are: STANDARD | ENTERPRISE | BUSINESS_CRITICAL
	Edition *string `pulumi:"edition"`
	// Email address of the initial administrative user of the account. This email address is used to send any notifications about the account.
	Email *string `pulumi:"email"`
	// First name of the initial administrative user of the account
	FirstName *string `pulumi:"firstName"`
	// Specifies the number of days to wait before dropping the account. The default is 3 days.
	GracePeriodInDays *int `pulumi:"gracePeriodInDays"`
	// Indicates whether the ORGADMIN role is enabled in an account. If TRUE, the role is enabled.
	IsOrgAdmin *bool `pulumi:"isOrgAdmin"`
	// Last name of the initial administrative user of the account
	LastName *string `pulumi:"lastName"`
	// Specifies whether the new user created to administer the account is forced to change their password upon first login into the account.
	MustChangePassword *bool `pulumi:"mustChangePassword"`
	// Specifies the identifier (i.e. name) for the account; must be unique within an organization, regardless of which Snowflake Region the account is in. In addition, the identifier must start with an alphabetic character and cannot contain spaces or special characters except for underscores (_). Note that if the account name includes underscores, features that do not accept account names with underscores (e.g. Okta SSO or SCIM) can reference a version of the account name that substitutes hyphens (-) for the underscores.
	Name *string `pulumi:"name"`
	// ID of the Snowflake Region where the account is created. If no value is provided, Snowflake creates the account in the same Snowflake Region as the current account (i.e. the account in which the CREATE ACCOUNT statement is executed.)
	Region *string `pulumi:"region"`
	// ID of the Snowflake Region where the account is created. If no value is provided, Snowflake creates the account in the same Snowflake Region as the current account (i.e. the account in which the CREATE ACCOUNT statement is executed.)
	RegionGroup *string `pulumi:"regionGroup"`
}

type AccountState struct {
	// Login name of the initial administrative user of the account. A new user is created in the new account with this name and password and granted the ACCOUNTADMIN role in the account. A login name can be any string consisting of letters, numbers, and underscores. Login names are always case-insensitive.
	AdminName pulumi.StringPtrInput
	// Password for the initial administrative user of the account. Optional if the `ADMIN_RSA_PUBLIC_KEY` parameter is specified. For more information about passwords in Snowflake, see [Snowflake-provided Password Policy](https://docs.snowflake.com/en/sql-reference/sql/create-account.html#:~:text=Snowflake%2Dprovided%20Password%20Policy).
	AdminPassword pulumi.StringPtrInput
	// Assigns a public key to the initial administrative user of the account in order to implement [key pair authentication](https://docs.snowflake.com/en/sql-reference/sql/create-account.html#:~:text=key%20pair%20authentication) for the user. Optional if the `ADMIN_PASSWORD` parameter is specified.
	AdminRsaPublicKey pulumi.StringPtrInput
	// Specifies a comment for the account.
	Comment pulumi.StringPtrInput
	// [Snowflake Edition](https://docs.snowflake.com/en/user-guide/intro-editions.html) of the account. Valid values are: STANDARD | ENTERPRISE | BUSINESS_CRITICAL
	Edition pulumi.StringPtrInput
	// Email address of the initial administrative user of the account. This email address is used to send any notifications about the account.
	Email pulumi.StringPtrInput
	// First name of the initial administrative user of the account
	FirstName pulumi.StringPtrInput
	// Specifies the number of days to wait before dropping the account. The default is 3 days.
	GracePeriodInDays pulumi.IntPtrInput
	// Indicates whether the ORGADMIN role is enabled in an account. If TRUE, the role is enabled.
	IsOrgAdmin pulumi.BoolPtrInput
	// Last name of the initial administrative user of the account
	LastName pulumi.StringPtrInput
	// Specifies whether the new user created to administer the account is forced to change their password upon first login into the account.
	MustChangePassword pulumi.BoolPtrInput
	// Specifies the identifier (i.e. name) for the account; must be unique within an organization, regardless of which Snowflake Region the account is in. In addition, the identifier must start with an alphabetic character and cannot contain spaces or special characters except for underscores (_). Note that if the account name includes underscores, features that do not accept account names with underscores (e.g. Okta SSO or SCIM) can reference a version of the account name that substitutes hyphens (-) for the underscores.
	Name pulumi.StringPtrInput
	// ID of the Snowflake Region where the account is created. If no value is provided, Snowflake creates the account in the same Snowflake Region as the current account (i.e. the account in which the CREATE ACCOUNT statement is executed.)
	Region pulumi.StringPtrInput
	// ID of the Snowflake Region where the account is created. If no value is provided, Snowflake creates the account in the same Snowflake Region as the current account (i.e. the account in which the CREATE ACCOUNT statement is executed.)
	RegionGroup pulumi.StringPtrInput
}

func (AccountState) ElementType() reflect.Type {
	return reflect.TypeOf((*accountState)(nil)).Elem()
}

type accountArgs struct {
	// Login name of the initial administrative user of the account. A new user is created in the new account with this name and password and granted the ACCOUNTADMIN role in the account. A login name can be any string consisting of letters, numbers, and underscores. Login names are always case-insensitive.
	AdminName string `pulumi:"adminName"`
	// Password for the initial administrative user of the account. Optional if the `ADMIN_RSA_PUBLIC_KEY` parameter is specified. For more information about passwords in Snowflake, see [Snowflake-provided Password Policy](https://docs.snowflake.com/en/sql-reference/sql/create-account.html#:~:text=Snowflake%2Dprovided%20Password%20Policy).
	AdminPassword *string `pulumi:"adminPassword"`
	// Assigns a public key to the initial administrative user of the account in order to implement [key pair authentication](https://docs.snowflake.com/en/sql-reference/sql/create-account.html#:~:text=key%20pair%20authentication) for the user. Optional if the `ADMIN_PASSWORD` parameter is specified.
	AdminRsaPublicKey *string `pulumi:"adminRsaPublicKey"`
	// Specifies a comment for the account.
	Comment *string `pulumi:"comment"`
	// [Snowflake Edition](https://docs.snowflake.com/en/user-guide/intro-editions.html) of the account. Valid values are: STANDARD | ENTERPRISE | BUSINESS_CRITICAL
	Edition string `pulumi:"edition"`
	// Email address of the initial administrative user of the account. This email address is used to send any notifications about the account.
	Email string `pulumi:"email"`
	// First name of the initial administrative user of the account
	FirstName *string `pulumi:"firstName"`
	// Specifies the number of days to wait before dropping the account. The default is 3 days.
	GracePeriodInDays *int `pulumi:"gracePeriodInDays"`
	// Last name of the initial administrative user of the account
	LastName *string `pulumi:"lastName"`
	// Specifies whether the new user created to administer the account is forced to change their password upon first login into the account.
	MustChangePassword *bool `pulumi:"mustChangePassword"`
	// Specifies the identifier (i.e. name) for the account; must be unique within an organization, regardless of which Snowflake Region the account is in. In addition, the identifier must start with an alphabetic character and cannot contain spaces or special characters except for underscores (_). Note that if the account name includes underscores, features that do not accept account names with underscores (e.g. Okta SSO or SCIM) can reference a version of the account name that substitutes hyphens (-) for the underscores.
	Name *string `pulumi:"name"`
	// ID of the Snowflake Region where the account is created. If no value is provided, Snowflake creates the account in the same Snowflake Region as the current account (i.e. the account in which the CREATE ACCOUNT statement is executed.)
	Region *string `pulumi:"region"`
	// ID of the Snowflake Region where the account is created. If no value is provided, Snowflake creates the account in the same Snowflake Region as the current account (i.e. the account in which the CREATE ACCOUNT statement is executed.)
	RegionGroup *string `pulumi:"regionGroup"`
}

// The set of arguments for constructing a Account resource.
type AccountArgs struct {
	// Login name of the initial administrative user of the account. A new user is created in the new account with this name and password and granted the ACCOUNTADMIN role in the account. A login name can be any string consisting of letters, numbers, and underscores. Login names are always case-insensitive.
	AdminName pulumi.StringInput
	// Password for the initial administrative user of the account. Optional if the `ADMIN_RSA_PUBLIC_KEY` parameter is specified. For more information about passwords in Snowflake, see [Snowflake-provided Password Policy](https://docs.snowflake.com/en/sql-reference/sql/create-account.html#:~:text=Snowflake%2Dprovided%20Password%20Policy).
	AdminPassword pulumi.StringPtrInput
	// Assigns a public key to the initial administrative user of the account in order to implement [key pair authentication](https://docs.snowflake.com/en/sql-reference/sql/create-account.html#:~:text=key%20pair%20authentication) for the user. Optional if the `ADMIN_PASSWORD` parameter is specified.
	AdminRsaPublicKey pulumi.StringPtrInput
	// Specifies a comment for the account.
	Comment pulumi.StringPtrInput
	// [Snowflake Edition](https://docs.snowflake.com/en/user-guide/intro-editions.html) of the account. Valid values are: STANDARD | ENTERPRISE | BUSINESS_CRITICAL
	Edition pulumi.StringInput
	// Email address of the initial administrative user of the account. This email address is used to send any notifications about the account.
	Email pulumi.StringInput
	// First name of the initial administrative user of the account
	FirstName pulumi.StringPtrInput
	// Specifies the number of days to wait before dropping the account. The default is 3 days.
	GracePeriodInDays pulumi.IntPtrInput
	// Last name of the initial administrative user of the account
	LastName pulumi.StringPtrInput
	// Specifies whether the new user created to administer the account is forced to change their password upon first login into the account.
	MustChangePassword pulumi.BoolPtrInput
	// Specifies the identifier (i.e. name) for the account; must be unique within an organization, regardless of which Snowflake Region the account is in. In addition, the identifier must start with an alphabetic character and cannot contain spaces or special characters except for underscores (_). Note that if the account name includes underscores, features that do not accept account names with underscores (e.g. Okta SSO or SCIM) can reference a version of the account name that substitutes hyphens (-) for the underscores.
	Name pulumi.StringPtrInput
	// ID of the Snowflake Region where the account is created. If no value is provided, Snowflake creates the account in the same Snowflake Region as the current account (i.e. the account in which the CREATE ACCOUNT statement is executed.)
	Region pulumi.StringPtrInput
	// ID of the Snowflake Region where the account is created. If no value is provided, Snowflake creates the account in the same Snowflake Region as the current account (i.e. the account in which the CREATE ACCOUNT statement is executed.)
	RegionGroup pulumi.StringPtrInput
}

func (AccountArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*accountArgs)(nil)).Elem()
}

type AccountInput interface {
	pulumi.Input

	ToAccountOutput() AccountOutput
	ToAccountOutputWithContext(ctx context.Context) AccountOutput
}

func (*Account) ElementType() reflect.Type {
	return reflect.TypeOf((**Account)(nil)).Elem()
}

func (i *Account) ToAccountOutput() AccountOutput {
	return i.ToAccountOutputWithContext(context.Background())
}

func (i *Account) ToAccountOutputWithContext(ctx context.Context) AccountOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccountOutput)
}

// AccountArrayInput is an input type that accepts AccountArray and AccountArrayOutput values.
// You can construct a concrete instance of `AccountArrayInput` via:
//
//	AccountArray{ AccountArgs{...} }
type AccountArrayInput interface {
	pulumi.Input

	ToAccountArrayOutput() AccountArrayOutput
	ToAccountArrayOutputWithContext(context.Context) AccountArrayOutput
}

type AccountArray []AccountInput

func (AccountArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Account)(nil)).Elem()
}

func (i AccountArray) ToAccountArrayOutput() AccountArrayOutput {
	return i.ToAccountArrayOutputWithContext(context.Background())
}

func (i AccountArray) ToAccountArrayOutputWithContext(ctx context.Context) AccountArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccountArrayOutput)
}

// AccountMapInput is an input type that accepts AccountMap and AccountMapOutput values.
// You can construct a concrete instance of `AccountMapInput` via:
//
//	AccountMap{ "key": AccountArgs{...} }
type AccountMapInput interface {
	pulumi.Input

	ToAccountMapOutput() AccountMapOutput
	ToAccountMapOutputWithContext(context.Context) AccountMapOutput
}

type AccountMap map[string]AccountInput

func (AccountMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Account)(nil)).Elem()
}

func (i AccountMap) ToAccountMapOutput() AccountMapOutput {
	return i.ToAccountMapOutputWithContext(context.Background())
}

func (i AccountMap) ToAccountMapOutputWithContext(ctx context.Context) AccountMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccountMapOutput)
}

type AccountOutput struct{ *pulumi.OutputState }

func (AccountOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Account)(nil)).Elem()
}

func (o AccountOutput) ToAccountOutput() AccountOutput {
	return o
}

func (o AccountOutput) ToAccountOutputWithContext(ctx context.Context) AccountOutput {
	return o
}

// Login name of the initial administrative user of the account. A new user is created in the new account with this name and password and granted the ACCOUNTADMIN role in the account. A login name can be any string consisting of letters, numbers, and underscores. Login names are always case-insensitive.
func (o AccountOutput) AdminName() pulumi.StringOutput {
	return o.ApplyT(func(v *Account) pulumi.StringOutput { return v.AdminName }).(pulumi.StringOutput)
}

// Password for the initial administrative user of the account. Optional if the `ADMIN_RSA_PUBLIC_KEY` parameter is specified. For more information about passwords in Snowflake, see [Snowflake-provided Password Policy](https://docs.snowflake.com/en/sql-reference/sql/create-account.html#:~:text=Snowflake%2Dprovided%20Password%20Policy).
func (o AccountOutput) AdminPassword() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Account) pulumi.StringPtrOutput { return v.AdminPassword }).(pulumi.StringPtrOutput)
}

// Assigns a public key to the initial administrative user of the account in order to implement [key pair authentication](https://docs.snowflake.com/en/sql-reference/sql/create-account.html#:~:text=key%20pair%20authentication) for the user. Optional if the `ADMIN_PASSWORD` parameter is specified.
func (o AccountOutput) AdminRsaPublicKey() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Account) pulumi.StringPtrOutput { return v.AdminRsaPublicKey }).(pulumi.StringPtrOutput)
}

// Specifies a comment for the account.
func (o AccountOutput) Comment() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Account) pulumi.StringPtrOutput { return v.Comment }).(pulumi.StringPtrOutput)
}

// [Snowflake Edition](https://docs.snowflake.com/en/user-guide/intro-editions.html) of the account. Valid values are: STANDARD | ENTERPRISE | BUSINESS_CRITICAL
func (o AccountOutput) Edition() pulumi.StringOutput {
	return o.ApplyT(func(v *Account) pulumi.StringOutput { return v.Edition }).(pulumi.StringOutput)
}

// Email address of the initial administrative user of the account. This email address is used to send any notifications about the account.
func (o AccountOutput) Email() pulumi.StringOutput {
	return o.ApplyT(func(v *Account) pulumi.StringOutput { return v.Email }).(pulumi.StringOutput)
}

// First name of the initial administrative user of the account
func (o AccountOutput) FirstName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Account) pulumi.StringPtrOutput { return v.FirstName }).(pulumi.StringPtrOutput)
}

// Specifies the number of days to wait before dropping the account. The default is 3 days.
func (o AccountOutput) GracePeriodInDays() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Account) pulumi.IntPtrOutput { return v.GracePeriodInDays }).(pulumi.IntPtrOutput)
}

// Indicates whether the ORGADMIN role is enabled in an account. If TRUE, the role is enabled.
func (o AccountOutput) IsOrgAdmin() pulumi.BoolOutput {
	return o.ApplyT(func(v *Account) pulumi.BoolOutput { return v.IsOrgAdmin }).(pulumi.BoolOutput)
}

// Last name of the initial administrative user of the account
func (o AccountOutput) LastName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Account) pulumi.StringPtrOutput { return v.LastName }).(pulumi.StringPtrOutput)
}

// Specifies whether the new user created to administer the account is forced to change their password upon first login into the account.
func (o AccountOutput) MustChangePassword() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Account) pulumi.BoolPtrOutput { return v.MustChangePassword }).(pulumi.BoolPtrOutput)
}

// Specifies the identifier (i.e. name) for the account; must be unique within an organization, regardless of which Snowflake Region the account is in. In addition, the identifier must start with an alphabetic character and cannot contain spaces or special characters except for underscores (_). Note that if the account name includes underscores, features that do not accept account names with underscores (e.g. Okta SSO or SCIM) can reference a version of the account name that substitutes hyphens (-) for the underscores.
func (o AccountOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Account) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// ID of the Snowflake Region where the account is created. If no value is provided, Snowflake creates the account in the same Snowflake Region as the current account (i.e. the account in which the CREATE ACCOUNT statement is executed.)
func (o AccountOutput) Region() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Account) pulumi.StringPtrOutput { return v.Region }).(pulumi.StringPtrOutput)
}

// ID of the Snowflake Region where the account is created. If no value is provided, Snowflake creates the account in the same Snowflake Region as the current account (i.e. the account in which the CREATE ACCOUNT statement is executed.)
func (o AccountOutput) RegionGroup() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Account) pulumi.StringPtrOutput { return v.RegionGroup }).(pulumi.StringPtrOutput)
}

type AccountArrayOutput struct{ *pulumi.OutputState }

func (AccountArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Account)(nil)).Elem()
}

func (o AccountArrayOutput) ToAccountArrayOutput() AccountArrayOutput {
	return o
}

func (o AccountArrayOutput) ToAccountArrayOutputWithContext(ctx context.Context) AccountArrayOutput {
	return o
}

func (o AccountArrayOutput) Index(i pulumi.IntInput) AccountOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Account {
		return vs[0].([]*Account)[vs[1].(int)]
	}).(AccountOutput)
}

type AccountMapOutput struct{ *pulumi.OutputState }

func (AccountMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Account)(nil)).Elem()
}

func (o AccountMapOutput) ToAccountMapOutput() AccountMapOutput {
	return o
}

func (o AccountMapOutput) ToAccountMapOutputWithContext(ctx context.Context) AccountMapOutput {
	return o
}

func (o AccountMapOutput) MapIndex(k pulumi.StringInput) AccountOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Account {
		return vs[0].(map[string]*Account)[vs[1].(string)]
	}).(AccountOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AccountInput)(nil)).Elem(), &Account{})
	pulumi.RegisterInputType(reflect.TypeOf((*AccountArrayInput)(nil)).Elem(), AccountArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AccountMapInput)(nil)).Elem(), AccountMap{})
	pulumi.RegisterOutputType(AccountOutput{})
	pulumi.RegisterOutputType(AccountArrayOutput{})
	pulumi.RegisterOutputType(AccountMapOutput{})
}
