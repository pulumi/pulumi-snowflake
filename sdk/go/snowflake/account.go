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
// ```sh
// $ pulumi import snowflake:index/account:Account example '"<organization_name>"."<account_name>"'
// ```
type Account struct {
	pulumi.CustomResourceState

	AdminName         pulumi.StringOutput    `pulumi:"adminName"`
	AdminPassword     pulumi.StringPtrOutput `pulumi:"adminPassword"`
	AdminRsaPublicKey pulumi.StringPtrOutput `pulumi:"adminRsaPublicKey"`
	AdminUserType     pulumi.StringPtrOutput `pulumi:"adminUserType"`
	// Specifies a comment for the account.
	Comment pulumi.StringPtrOutput `pulumi:"comment"`
	// Snowflake Edition of the account. See more about Snowflake Editions in the [official documentation](https://docs.snowflake.com/en/user-guide/intro-editions). Valid options are: `STANDARD` | `ENTERPRISE` | `BUSINESS_CRITICAL`
	Edition   pulumi.StringOutput    `pulumi:"edition"`
	Email     pulumi.StringOutput    `pulumi:"email"`
	FirstName pulumi.StringPtrOutput `pulumi:"firstName"`
	// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
	FullyQualifiedName pulumi.StringOutput `pulumi:"fullyQualifiedName"`
	// Specifies the number of days during which the account can be restored (“undropped”). The minimum is 3 days and the maximum is 90 days.
	GracePeriodInDays pulumi.IntOutput `pulumi:"gracePeriodInDays"`
	// Sets an account property that determines whether the ORGADMIN role is enabled in the account. Only an organization administrator (i.e. user with the ORGADMIN role) can set the property.
	IsOrgAdmin         pulumi.StringPtrOutput `pulumi:"isOrgAdmin"`
	LastName           pulumi.StringPtrOutput `pulumi:"lastName"`
	MustChangePassword pulumi.StringPtrOutput `pulumi:"mustChangePassword"`
	// Specifies the identifier (i.e. name) for the account. It must be unique within an organization, regardless of which Snowflake Region the account is in and must start with an alphabetic character and cannot contain spaces or special characters except for underscores (_). Note that if the account name includes underscores, features that do not accept account names with underscores (e.g. Okta SSO or SCIM) can reference a version of the account name that substitutes hyphens (-) for the underscores.
	Name pulumi.StringOutput `pulumi:"name"`
	// [Snowflake Region ID](https://docs.snowflake.com/en/user-guide/admin-account-identifier.html#label-snowflake-region-ids) of the region where the account is created. If no value is provided, Snowflake creates the account in the same Snowflake Region as the current account (i.e. the account in which the CREATE ACCOUNT statement is executed.)
	Region pulumi.StringPtrOutput `pulumi:"region"`
	// ID of the region group where the account is created. To retrieve the region group ID for existing accounts in your organization, execute the [SHOW REGIONS](https://docs.snowflake.com/en/sql-reference/sql/show-regions) command. For information about when you might need to specify region group, see [Region groups](https://docs.snowflake.com/en/user-guide/admin-account-identifier.html#label-region-groups).
	RegionGroup pulumi.StringPtrOutput `pulumi:"regionGroup"`
	// Outputs the result of `SHOW ACCOUNTS` for the given account.
	ShowOutputs AccountShowOutputArrayOutput `pulumi:"showOutputs"`
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
	if args.GracePeriodInDays == nil {
		return nil, errors.New("invalid value for required argument 'GracePeriodInDays'")
	}
	if args.AdminName != nil {
		args.AdminName = pulumi.ToSecret(args.AdminName).(pulumi.StringInput)
	}
	if args.AdminPassword != nil {
		args.AdminPassword = pulumi.ToSecret(args.AdminPassword).(pulumi.StringPtrInput)
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
		"adminName",
		"adminPassword",
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
	AdminName         *string `pulumi:"adminName"`
	AdminPassword     *string `pulumi:"adminPassword"`
	AdminRsaPublicKey *string `pulumi:"adminRsaPublicKey"`
	AdminUserType     *string `pulumi:"adminUserType"`
	// Specifies a comment for the account.
	Comment *string `pulumi:"comment"`
	// Snowflake Edition of the account. See more about Snowflake Editions in the [official documentation](https://docs.snowflake.com/en/user-guide/intro-editions). Valid options are: `STANDARD` | `ENTERPRISE` | `BUSINESS_CRITICAL`
	Edition   *string `pulumi:"edition"`
	Email     *string `pulumi:"email"`
	FirstName *string `pulumi:"firstName"`
	// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
	FullyQualifiedName *string `pulumi:"fullyQualifiedName"`
	// Specifies the number of days during which the account can be restored (“undropped”). The minimum is 3 days and the maximum is 90 days.
	GracePeriodInDays *int `pulumi:"gracePeriodInDays"`
	// Sets an account property that determines whether the ORGADMIN role is enabled in the account. Only an organization administrator (i.e. user with the ORGADMIN role) can set the property.
	IsOrgAdmin         *string `pulumi:"isOrgAdmin"`
	LastName           *string `pulumi:"lastName"`
	MustChangePassword *string `pulumi:"mustChangePassword"`
	// Specifies the identifier (i.e. name) for the account. It must be unique within an organization, regardless of which Snowflake Region the account is in and must start with an alphabetic character and cannot contain spaces or special characters except for underscores (_). Note that if the account name includes underscores, features that do not accept account names with underscores (e.g. Okta SSO or SCIM) can reference a version of the account name that substitutes hyphens (-) for the underscores.
	Name *string `pulumi:"name"`
	// [Snowflake Region ID](https://docs.snowflake.com/en/user-guide/admin-account-identifier.html#label-snowflake-region-ids) of the region where the account is created. If no value is provided, Snowflake creates the account in the same Snowflake Region as the current account (i.e. the account in which the CREATE ACCOUNT statement is executed.)
	Region *string `pulumi:"region"`
	// ID of the region group where the account is created. To retrieve the region group ID for existing accounts in your organization, execute the [SHOW REGIONS](https://docs.snowflake.com/en/sql-reference/sql/show-regions) command. For information about when you might need to specify region group, see [Region groups](https://docs.snowflake.com/en/user-guide/admin-account-identifier.html#label-region-groups).
	RegionGroup *string `pulumi:"regionGroup"`
	// Outputs the result of `SHOW ACCOUNTS` for the given account.
	ShowOutputs []AccountShowOutput `pulumi:"showOutputs"`
}

type AccountState struct {
	AdminName         pulumi.StringPtrInput
	AdminPassword     pulumi.StringPtrInput
	AdminRsaPublicKey pulumi.StringPtrInput
	AdminUserType     pulumi.StringPtrInput
	// Specifies a comment for the account.
	Comment pulumi.StringPtrInput
	// Snowflake Edition of the account. See more about Snowflake Editions in the [official documentation](https://docs.snowflake.com/en/user-guide/intro-editions). Valid options are: `STANDARD` | `ENTERPRISE` | `BUSINESS_CRITICAL`
	Edition   pulumi.StringPtrInput
	Email     pulumi.StringPtrInput
	FirstName pulumi.StringPtrInput
	// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
	FullyQualifiedName pulumi.StringPtrInput
	// Specifies the number of days during which the account can be restored (“undropped”). The minimum is 3 days and the maximum is 90 days.
	GracePeriodInDays pulumi.IntPtrInput
	// Sets an account property that determines whether the ORGADMIN role is enabled in the account. Only an organization administrator (i.e. user with the ORGADMIN role) can set the property.
	IsOrgAdmin         pulumi.StringPtrInput
	LastName           pulumi.StringPtrInput
	MustChangePassword pulumi.StringPtrInput
	// Specifies the identifier (i.e. name) for the account. It must be unique within an organization, regardless of which Snowflake Region the account is in and must start with an alphabetic character and cannot contain spaces or special characters except for underscores (_). Note that if the account name includes underscores, features that do not accept account names with underscores (e.g. Okta SSO or SCIM) can reference a version of the account name that substitutes hyphens (-) for the underscores.
	Name pulumi.StringPtrInput
	// [Snowflake Region ID](https://docs.snowflake.com/en/user-guide/admin-account-identifier.html#label-snowflake-region-ids) of the region where the account is created. If no value is provided, Snowflake creates the account in the same Snowflake Region as the current account (i.e. the account in which the CREATE ACCOUNT statement is executed.)
	Region pulumi.StringPtrInput
	// ID of the region group where the account is created. To retrieve the region group ID for existing accounts in your organization, execute the [SHOW REGIONS](https://docs.snowflake.com/en/sql-reference/sql/show-regions) command. For information about when you might need to specify region group, see [Region groups](https://docs.snowflake.com/en/user-guide/admin-account-identifier.html#label-region-groups).
	RegionGroup pulumi.StringPtrInput
	// Outputs the result of `SHOW ACCOUNTS` for the given account.
	ShowOutputs AccountShowOutputArrayInput
}

func (AccountState) ElementType() reflect.Type {
	return reflect.TypeOf((*accountState)(nil)).Elem()
}

type accountArgs struct {
	AdminName         string  `pulumi:"adminName"`
	AdminPassword     *string `pulumi:"adminPassword"`
	AdminRsaPublicKey *string `pulumi:"adminRsaPublicKey"`
	AdminUserType     *string `pulumi:"adminUserType"`
	// Specifies a comment for the account.
	Comment *string `pulumi:"comment"`
	// Snowflake Edition of the account. See more about Snowflake Editions in the [official documentation](https://docs.snowflake.com/en/user-guide/intro-editions). Valid options are: `STANDARD` | `ENTERPRISE` | `BUSINESS_CRITICAL`
	Edition   string  `pulumi:"edition"`
	Email     string  `pulumi:"email"`
	FirstName *string `pulumi:"firstName"`
	// Specifies the number of days during which the account can be restored (“undropped”). The minimum is 3 days and the maximum is 90 days.
	GracePeriodInDays int `pulumi:"gracePeriodInDays"`
	// Sets an account property that determines whether the ORGADMIN role is enabled in the account. Only an organization administrator (i.e. user with the ORGADMIN role) can set the property.
	IsOrgAdmin         *string `pulumi:"isOrgAdmin"`
	LastName           *string `pulumi:"lastName"`
	MustChangePassword *string `pulumi:"mustChangePassword"`
	// Specifies the identifier (i.e. name) for the account. It must be unique within an organization, regardless of which Snowflake Region the account is in and must start with an alphabetic character and cannot contain spaces or special characters except for underscores (_). Note that if the account name includes underscores, features that do not accept account names with underscores (e.g. Okta SSO or SCIM) can reference a version of the account name that substitutes hyphens (-) for the underscores.
	Name *string `pulumi:"name"`
	// [Snowflake Region ID](https://docs.snowflake.com/en/user-guide/admin-account-identifier.html#label-snowflake-region-ids) of the region where the account is created. If no value is provided, Snowflake creates the account in the same Snowflake Region as the current account (i.e. the account in which the CREATE ACCOUNT statement is executed.)
	Region *string `pulumi:"region"`
	// ID of the region group where the account is created. To retrieve the region group ID for existing accounts in your organization, execute the [SHOW REGIONS](https://docs.snowflake.com/en/sql-reference/sql/show-regions) command. For information about when you might need to specify region group, see [Region groups](https://docs.snowflake.com/en/user-guide/admin-account-identifier.html#label-region-groups).
	RegionGroup *string `pulumi:"regionGroup"`
}

// The set of arguments for constructing a Account resource.
type AccountArgs struct {
	AdminName         pulumi.StringInput
	AdminPassword     pulumi.StringPtrInput
	AdminRsaPublicKey pulumi.StringPtrInput
	AdminUserType     pulumi.StringPtrInput
	// Specifies a comment for the account.
	Comment pulumi.StringPtrInput
	// Snowflake Edition of the account. See more about Snowflake Editions in the [official documentation](https://docs.snowflake.com/en/user-guide/intro-editions). Valid options are: `STANDARD` | `ENTERPRISE` | `BUSINESS_CRITICAL`
	Edition   pulumi.StringInput
	Email     pulumi.StringInput
	FirstName pulumi.StringPtrInput
	// Specifies the number of days during which the account can be restored (“undropped”). The minimum is 3 days and the maximum is 90 days.
	GracePeriodInDays pulumi.IntInput
	// Sets an account property that determines whether the ORGADMIN role is enabled in the account. Only an organization administrator (i.e. user with the ORGADMIN role) can set the property.
	IsOrgAdmin         pulumi.StringPtrInput
	LastName           pulumi.StringPtrInput
	MustChangePassword pulumi.StringPtrInput
	// Specifies the identifier (i.e. name) for the account. It must be unique within an organization, regardless of which Snowflake Region the account is in and must start with an alphabetic character and cannot contain spaces or special characters except for underscores (_). Note that if the account name includes underscores, features that do not accept account names with underscores (e.g. Okta SSO or SCIM) can reference a version of the account name that substitutes hyphens (-) for the underscores.
	Name pulumi.StringPtrInput
	// [Snowflake Region ID](https://docs.snowflake.com/en/user-guide/admin-account-identifier.html#label-snowflake-region-ids) of the region where the account is created. If no value is provided, Snowflake creates the account in the same Snowflake Region as the current account (i.e. the account in which the CREATE ACCOUNT statement is executed.)
	Region pulumi.StringPtrInput
	// ID of the region group where the account is created. To retrieve the region group ID for existing accounts in your organization, execute the [SHOW REGIONS](https://docs.snowflake.com/en/sql-reference/sql/show-regions) command. For information about when you might need to specify region group, see [Region groups](https://docs.snowflake.com/en/user-guide/admin-account-identifier.html#label-region-groups).
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

func (o AccountOutput) AdminName() pulumi.StringOutput {
	return o.ApplyT(func(v *Account) pulumi.StringOutput { return v.AdminName }).(pulumi.StringOutput)
}

func (o AccountOutput) AdminPassword() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Account) pulumi.StringPtrOutput { return v.AdminPassword }).(pulumi.StringPtrOutput)
}

func (o AccountOutput) AdminRsaPublicKey() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Account) pulumi.StringPtrOutput { return v.AdminRsaPublicKey }).(pulumi.StringPtrOutput)
}

func (o AccountOutput) AdminUserType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Account) pulumi.StringPtrOutput { return v.AdminUserType }).(pulumi.StringPtrOutput)
}

// Specifies a comment for the account.
func (o AccountOutput) Comment() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Account) pulumi.StringPtrOutput { return v.Comment }).(pulumi.StringPtrOutput)
}

// Snowflake Edition of the account. See more about Snowflake Editions in the [official documentation](https://docs.snowflake.com/en/user-guide/intro-editions). Valid options are: `STANDARD` | `ENTERPRISE` | `BUSINESS_CRITICAL`
func (o AccountOutput) Edition() pulumi.StringOutput {
	return o.ApplyT(func(v *Account) pulumi.StringOutput { return v.Edition }).(pulumi.StringOutput)
}

func (o AccountOutput) Email() pulumi.StringOutput {
	return o.ApplyT(func(v *Account) pulumi.StringOutput { return v.Email }).(pulumi.StringOutput)
}

func (o AccountOutput) FirstName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Account) pulumi.StringPtrOutput { return v.FirstName }).(pulumi.StringPtrOutput)
}

// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
func (o AccountOutput) FullyQualifiedName() pulumi.StringOutput {
	return o.ApplyT(func(v *Account) pulumi.StringOutput { return v.FullyQualifiedName }).(pulumi.StringOutput)
}

// Specifies the number of days during which the account can be restored (“undropped”). The minimum is 3 days and the maximum is 90 days.
func (o AccountOutput) GracePeriodInDays() pulumi.IntOutput {
	return o.ApplyT(func(v *Account) pulumi.IntOutput { return v.GracePeriodInDays }).(pulumi.IntOutput)
}

// Sets an account property that determines whether the ORGADMIN role is enabled in the account. Only an organization administrator (i.e. user with the ORGADMIN role) can set the property.
func (o AccountOutput) IsOrgAdmin() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Account) pulumi.StringPtrOutput { return v.IsOrgAdmin }).(pulumi.StringPtrOutput)
}

func (o AccountOutput) LastName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Account) pulumi.StringPtrOutput { return v.LastName }).(pulumi.StringPtrOutput)
}

func (o AccountOutput) MustChangePassword() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Account) pulumi.StringPtrOutput { return v.MustChangePassword }).(pulumi.StringPtrOutput)
}

// Specifies the identifier (i.e. name) for the account. It must be unique within an organization, regardless of which Snowflake Region the account is in and must start with an alphabetic character and cannot contain spaces or special characters except for underscores (_). Note that if the account name includes underscores, features that do not accept account names with underscores (e.g. Okta SSO or SCIM) can reference a version of the account name that substitutes hyphens (-) for the underscores.
func (o AccountOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Account) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// [Snowflake Region ID](https://docs.snowflake.com/en/user-guide/admin-account-identifier.html#label-snowflake-region-ids) of the region where the account is created. If no value is provided, Snowflake creates the account in the same Snowflake Region as the current account (i.e. the account in which the CREATE ACCOUNT statement is executed.)
func (o AccountOutput) Region() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Account) pulumi.StringPtrOutput { return v.Region }).(pulumi.StringPtrOutput)
}

// ID of the region group where the account is created. To retrieve the region group ID for existing accounts in your organization, execute the [SHOW REGIONS](https://docs.snowflake.com/en/sql-reference/sql/show-regions) command. For information about when you might need to specify region group, see [Region groups](https://docs.snowflake.com/en/user-guide/admin-account-identifier.html#label-region-groups).
func (o AccountOutput) RegionGroup() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Account) pulumi.StringPtrOutput { return v.RegionGroup }).(pulumi.StringPtrOutput)
}

// Outputs the result of `SHOW ACCOUNTS` for the given account.
func (o AccountOutput) ShowOutputs() AccountShowOutputArrayOutput {
	return o.ApplyT(func(v *Account) AccountShowOutputArrayOutput { return v.ShowOutputs }).(AccountShowOutputArrayOutput)
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
