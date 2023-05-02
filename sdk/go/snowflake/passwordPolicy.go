// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package snowflake

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// A password policy specifies the requirements that must be met to create and reset a password to authenticate to Snowflake.
type PasswordPolicy struct {
	pulumi.CustomResourceState

	// Adds a comment or overwrites an existing comment for the password policy.
	Comment pulumi.StringPtrOutput `pulumi:"comment"`
	// The database this password policy belongs to.
	Database pulumi.StringOutput `pulumi:"database"`
	// Prevent overwriting a previous password policy with the same name.
	IfNotExists pulumi.BoolPtrOutput `pulumi:"ifNotExists"`
	// Specifies the number of minutes the user account will be locked after exhausting the designated number of password retries (i.e. PASSWORD*MAX*RETRIES). Supported range: 1 to 999, inclusive. Default: 15
	LockoutTimeMins pulumi.IntPtrOutput `pulumi:"lockoutTimeMins"`
	// Specifies the maximum number of days before the password must be changed. Supported range: 0 to 999, inclusive. A value of zero (i.e. 0) indicates that the password does not need to be changed. Snowflake does not recommend choosing this value for a default account-level password policy or for any user-level policy. Instead, choose a value that meets your internal security guidelines. Default: 90, which means the password must be changed every 90 days.
	MaxAgeDays pulumi.IntPtrOutput `pulumi:"maxAgeDays"`
	// Specifies the maximum number of characters the password must contain. This number must be greater than or equal to the sum of PASSWORD*MIN*LENGTH, PASSWORD*MIN*UPPER*CASE*CHARS, and PASSWORD*MIN*LOWER*CASE*CHARS. Supported range: 8 to 256, inclusive. Default: 256
	MaxLength pulumi.IntPtrOutput `pulumi:"maxLength"`
	// Specifies the maximum number of attempts to enter a password before being locked out. Supported range: 1 to 10, inclusive. Default: 5
	MaxRetries pulumi.IntPtrOutput `pulumi:"maxRetries"`
	// Specifies the minimum number of characters the password must contain. Supported range: 8 to 256, inclusive. Default: 8
	MinLength pulumi.IntPtrOutput `pulumi:"minLength"`
	// Specifies the minimum number of lowercase characters the password must contain. Supported range: 0 to 256, inclusive. Default: 1
	MinLowerCaseChars pulumi.IntPtrOutput `pulumi:"minLowerCaseChars"`
	// Specifies the minimum number of numeric characters the password must contain. Supported range: 0 to 256, inclusive. Default: 1
	MinNumericChars pulumi.IntPtrOutput `pulumi:"minNumericChars"`
	// Specifies the minimum number of special characters the password must contain. Supported range: 0 to 256, inclusive. Default: 1
	MinSpecialChars pulumi.IntPtrOutput `pulumi:"minSpecialChars"`
	// Specifies the minimum number of uppercase characters the password must contain. Supported range: 0 to 256, inclusive. Default: 1
	MinUpperCaseChars pulumi.IntPtrOutput `pulumi:"minUpperCaseChars"`
	// Identifier for the password policy; must be unique for your account.
	Name pulumi.StringOutput `pulumi:"name"`
	// Whether to override a previous password policy with the same name.
	OrReplace pulumi.BoolPtrOutput `pulumi:"orReplace"`
	// The schema this password policy belongs to.
	Schema pulumi.StringOutput `pulumi:"schema"`
}

// NewPasswordPolicy registers a new resource with the given unique name, arguments, and options.
func NewPasswordPolicy(ctx *pulumi.Context,
	name string, args *PasswordPolicyArgs, opts ...pulumi.ResourceOption) (*PasswordPolicy, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Database == nil {
		return nil, errors.New("invalid value for required argument 'Database'")
	}
	if args.Schema == nil {
		return nil, errors.New("invalid value for required argument 'Schema'")
	}
	var resource PasswordPolicy
	err := ctx.RegisterResource("snowflake:index/passwordPolicy:PasswordPolicy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPasswordPolicy gets an existing PasswordPolicy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPasswordPolicy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *PasswordPolicyState, opts ...pulumi.ResourceOption) (*PasswordPolicy, error) {
	var resource PasswordPolicy
	err := ctx.ReadResource("snowflake:index/passwordPolicy:PasswordPolicy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering PasswordPolicy resources.
type passwordPolicyState struct {
	// Adds a comment or overwrites an existing comment for the password policy.
	Comment *string `pulumi:"comment"`
	// The database this password policy belongs to.
	Database *string `pulumi:"database"`
	// Prevent overwriting a previous password policy with the same name.
	IfNotExists *bool `pulumi:"ifNotExists"`
	// Specifies the number of minutes the user account will be locked after exhausting the designated number of password retries (i.e. PASSWORD*MAX*RETRIES). Supported range: 1 to 999, inclusive. Default: 15
	LockoutTimeMins *int `pulumi:"lockoutTimeMins"`
	// Specifies the maximum number of days before the password must be changed. Supported range: 0 to 999, inclusive. A value of zero (i.e. 0) indicates that the password does not need to be changed. Snowflake does not recommend choosing this value for a default account-level password policy or for any user-level policy. Instead, choose a value that meets your internal security guidelines. Default: 90, which means the password must be changed every 90 days.
	MaxAgeDays *int `pulumi:"maxAgeDays"`
	// Specifies the maximum number of characters the password must contain. This number must be greater than or equal to the sum of PASSWORD*MIN*LENGTH, PASSWORD*MIN*UPPER*CASE*CHARS, and PASSWORD*MIN*LOWER*CASE*CHARS. Supported range: 8 to 256, inclusive. Default: 256
	MaxLength *int `pulumi:"maxLength"`
	// Specifies the maximum number of attempts to enter a password before being locked out. Supported range: 1 to 10, inclusive. Default: 5
	MaxRetries *int `pulumi:"maxRetries"`
	// Specifies the minimum number of characters the password must contain. Supported range: 8 to 256, inclusive. Default: 8
	MinLength *int `pulumi:"minLength"`
	// Specifies the minimum number of lowercase characters the password must contain. Supported range: 0 to 256, inclusive. Default: 1
	MinLowerCaseChars *int `pulumi:"minLowerCaseChars"`
	// Specifies the minimum number of numeric characters the password must contain. Supported range: 0 to 256, inclusive. Default: 1
	MinNumericChars *int `pulumi:"minNumericChars"`
	// Specifies the minimum number of special characters the password must contain. Supported range: 0 to 256, inclusive. Default: 1
	MinSpecialChars *int `pulumi:"minSpecialChars"`
	// Specifies the minimum number of uppercase characters the password must contain. Supported range: 0 to 256, inclusive. Default: 1
	MinUpperCaseChars *int `pulumi:"minUpperCaseChars"`
	// Identifier for the password policy; must be unique for your account.
	Name *string `pulumi:"name"`
	// Whether to override a previous password policy with the same name.
	OrReplace *bool `pulumi:"orReplace"`
	// The schema this password policy belongs to.
	Schema *string `pulumi:"schema"`
}

type PasswordPolicyState struct {
	// Adds a comment or overwrites an existing comment for the password policy.
	Comment pulumi.StringPtrInput
	// The database this password policy belongs to.
	Database pulumi.StringPtrInput
	// Prevent overwriting a previous password policy with the same name.
	IfNotExists pulumi.BoolPtrInput
	// Specifies the number of minutes the user account will be locked after exhausting the designated number of password retries (i.e. PASSWORD*MAX*RETRIES). Supported range: 1 to 999, inclusive. Default: 15
	LockoutTimeMins pulumi.IntPtrInput
	// Specifies the maximum number of days before the password must be changed. Supported range: 0 to 999, inclusive. A value of zero (i.e. 0) indicates that the password does not need to be changed. Snowflake does not recommend choosing this value for a default account-level password policy or for any user-level policy. Instead, choose a value that meets your internal security guidelines. Default: 90, which means the password must be changed every 90 days.
	MaxAgeDays pulumi.IntPtrInput
	// Specifies the maximum number of characters the password must contain. This number must be greater than or equal to the sum of PASSWORD*MIN*LENGTH, PASSWORD*MIN*UPPER*CASE*CHARS, and PASSWORD*MIN*LOWER*CASE*CHARS. Supported range: 8 to 256, inclusive. Default: 256
	MaxLength pulumi.IntPtrInput
	// Specifies the maximum number of attempts to enter a password before being locked out. Supported range: 1 to 10, inclusive. Default: 5
	MaxRetries pulumi.IntPtrInput
	// Specifies the minimum number of characters the password must contain. Supported range: 8 to 256, inclusive. Default: 8
	MinLength pulumi.IntPtrInput
	// Specifies the minimum number of lowercase characters the password must contain. Supported range: 0 to 256, inclusive. Default: 1
	MinLowerCaseChars pulumi.IntPtrInput
	// Specifies the minimum number of numeric characters the password must contain. Supported range: 0 to 256, inclusive. Default: 1
	MinNumericChars pulumi.IntPtrInput
	// Specifies the minimum number of special characters the password must contain. Supported range: 0 to 256, inclusive. Default: 1
	MinSpecialChars pulumi.IntPtrInput
	// Specifies the minimum number of uppercase characters the password must contain. Supported range: 0 to 256, inclusive. Default: 1
	MinUpperCaseChars pulumi.IntPtrInput
	// Identifier for the password policy; must be unique for your account.
	Name pulumi.StringPtrInput
	// Whether to override a previous password policy with the same name.
	OrReplace pulumi.BoolPtrInput
	// The schema this password policy belongs to.
	Schema pulumi.StringPtrInput
}

func (PasswordPolicyState) ElementType() reflect.Type {
	return reflect.TypeOf((*passwordPolicyState)(nil)).Elem()
}

type passwordPolicyArgs struct {
	// Adds a comment or overwrites an existing comment for the password policy.
	Comment *string `pulumi:"comment"`
	// The database this password policy belongs to.
	Database string `pulumi:"database"`
	// Prevent overwriting a previous password policy with the same name.
	IfNotExists *bool `pulumi:"ifNotExists"`
	// Specifies the number of minutes the user account will be locked after exhausting the designated number of password retries (i.e. PASSWORD*MAX*RETRIES). Supported range: 1 to 999, inclusive. Default: 15
	LockoutTimeMins *int `pulumi:"lockoutTimeMins"`
	// Specifies the maximum number of days before the password must be changed. Supported range: 0 to 999, inclusive. A value of zero (i.e. 0) indicates that the password does not need to be changed. Snowflake does not recommend choosing this value for a default account-level password policy or for any user-level policy. Instead, choose a value that meets your internal security guidelines. Default: 90, which means the password must be changed every 90 days.
	MaxAgeDays *int `pulumi:"maxAgeDays"`
	// Specifies the maximum number of characters the password must contain. This number must be greater than or equal to the sum of PASSWORD*MIN*LENGTH, PASSWORD*MIN*UPPER*CASE*CHARS, and PASSWORD*MIN*LOWER*CASE*CHARS. Supported range: 8 to 256, inclusive. Default: 256
	MaxLength *int `pulumi:"maxLength"`
	// Specifies the maximum number of attempts to enter a password before being locked out. Supported range: 1 to 10, inclusive. Default: 5
	MaxRetries *int `pulumi:"maxRetries"`
	// Specifies the minimum number of characters the password must contain. Supported range: 8 to 256, inclusive. Default: 8
	MinLength *int `pulumi:"minLength"`
	// Specifies the minimum number of lowercase characters the password must contain. Supported range: 0 to 256, inclusive. Default: 1
	MinLowerCaseChars *int `pulumi:"minLowerCaseChars"`
	// Specifies the minimum number of numeric characters the password must contain. Supported range: 0 to 256, inclusive. Default: 1
	MinNumericChars *int `pulumi:"minNumericChars"`
	// Specifies the minimum number of special characters the password must contain. Supported range: 0 to 256, inclusive. Default: 1
	MinSpecialChars *int `pulumi:"minSpecialChars"`
	// Specifies the minimum number of uppercase characters the password must contain. Supported range: 0 to 256, inclusive. Default: 1
	MinUpperCaseChars *int `pulumi:"minUpperCaseChars"`
	// Identifier for the password policy; must be unique for your account.
	Name *string `pulumi:"name"`
	// Whether to override a previous password policy with the same name.
	OrReplace *bool `pulumi:"orReplace"`
	// The schema this password policy belongs to.
	Schema string `pulumi:"schema"`
}

// The set of arguments for constructing a PasswordPolicy resource.
type PasswordPolicyArgs struct {
	// Adds a comment or overwrites an existing comment for the password policy.
	Comment pulumi.StringPtrInput
	// The database this password policy belongs to.
	Database pulumi.StringInput
	// Prevent overwriting a previous password policy with the same name.
	IfNotExists pulumi.BoolPtrInput
	// Specifies the number of minutes the user account will be locked after exhausting the designated number of password retries (i.e. PASSWORD*MAX*RETRIES). Supported range: 1 to 999, inclusive. Default: 15
	LockoutTimeMins pulumi.IntPtrInput
	// Specifies the maximum number of days before the password must be changed. Supported range: 0 to 999, inclusive. A value of zero (i.e. 0) indicates that the password does not need to be changed. Snowflake does not recommend choosing this value for a default account-level password policy or for any user-level policy. Instead, choose a value that meets your internal security guidelines. Default: 90, which means the password must be changed every 90 days.
	MaxAgeDays pulumi.IntPtrInput
	// Specifies the maximum number of characters the password must contain. This number must be greater than or equal to the sum of PASSWORD*MIN*LENGTH, PASSWORD*MIN*UPPER*CASE*CHARS, and PASSWORD*MIN*LOWER*CASE*CHARS. Supported range: 8 to 256, inclusive. Default: 256
	MaxLength pulumi.IntPtrInput
	// Specifies the maximum number of attempts to enter a password before being locked out. Supported range: 1 to 10, inclusive. Default: 5
	MaxRetries pulumi.IntPtrInput
	// Specifies the minimum number of characters the password must contain. Supported range: 8 to 256, inclusive. Default: 8
	MinLength pulumi.IntPtrInput
	// Specifies the minimum number of lowercase characters the password must contain. Supported range: 0 to 256, inclusive. Default: 1
	MinLowerCaseChars pulumi.IntPtrInput
	// Specifies the minimum number of numeric characters the password must contain. Supported range: 0 to 256, inclusive. Default: 1
	MinNumericChars pulumi.IntPtrInput
	// Specifies the minimum number of special characters the password must contain. Supported range: 0 to 256, inclusive. Default: 1
	MinSpecialChars pulumi.IntPtrInput
	// Specifies the minimum number of uppercase characters the password must contain. Supported range: 0 to 256, inclusive. Default: 1
	MinUpperCaseChars pulumi.IntPtrInput
	// Identifier for the password policy; must be unique for your account.
	Name pulumi.StringPtrInput
	// Whether to override a previous password policy with the same name.
	OrReplace pulumi.BoolPtrInput
	// The schema this password policy belongs to.
	Schema pulumi.StringInput
}

func (PasswordPolicyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*passwordPolicyArgs)(nil)).Elem()
}

type PasswordPolicyInput interface {
	pulumi.Input

	ToPasswordPolicyOutput() PasswordPolicyOutput
	ToPasswordPolicyOutputWithContext(ctx context.Context) PasswordPolicyOutput
}

func (*PasswordPolicy) ElementType() reflect.Type {
	return reflect.TypeOf((**PasswordPolicy)(nil)).Elem()
}

func (i *PasswordPolicy) ToPasswordPolicyOutput() PasswordPolicyOutput {
	return i.ToPasswordPolicyOutputWithContext(context.Background())
}

func (i *PasswordPolicy) ToPasswordPolicyOutputWithContext(ctx context.Context) PasswordPolicyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PasswordPolicyOutput)
}

// PasswordPolicyArrayInput is an input type that accepts PasswordPolicyArray and PasswordPolicyArrayOutput values.
// You can construct a concrete instance of `PasswordPolicyArrayInput` via:
//
//	PasswordPolicyArray{ PasswordPolicyArgs{...} }
type PasswordPolicyArrayInput interface {
	pulumi.Input

	ToPasswordPolicyArrayOutput() PasswordPolicyArrayOutput
	ToPasswordPolicyArrayOutputWithContext(context.Context) PasswordPolicyArrayOutput
}

type PasswordPolicyArray []PasswordPolicyInput

func (PasswordPolicyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PasswordPolicy)(nil)).Elem()
}

func (i PasswordPolicyArray) ToPasswordPolicyArrayOutput() PasswordPolicyArrayOutput {
	return i.ToPasswordPolicyArrayOutputWithContext(context.Background())
}

func (i PasswordPolicyArray) ToPasswordPolicyArrayOutputWithContext(ctx context.Context) PasswordPolicyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PasswordPolicyArrayOutput)
}

// PasswordPolicyMapInput is an input type that accepts PasswordPolicyMap and PasswordPolicyMapOutput values.
// You can construct a concrete instance of `PasswordPolicyMapInput` via:
//
//	PasswordPolicyMap{ "key": PasswordPolicyArgs{...} }
type PasswordPolicyMapInput interface {
	pulumi.Input

	ToPasswordPolicyMapOutput() PasswordPolicyMapOutput
	ToPasswordPolicyMapOutputWithContext(context.Context) PasswordPolicyMapOutput
}

type PasswordPolicyMap map[string]PasswordPolicyInput

func (PasswordPolicyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PasswordPolicy)(nil)).Elem()
}

func (i PasswordPolicyMap) ToPasswordPolicyMapOutput() PasswordPolicyMapOutput {
	return i.ToPasswordPolicyMapOutputWithContext(context.Background())
}

func (i PasswordPolicyMap) ToPasswordPolicyMapOutputWithContext(ctx context.Context) PasswordPolicyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PasswordPolicyMapOutput)
}

type PasswordPolicyOutput struct{ *pulumi.OutputState }

func (PasswordPolicyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**PasswordPolicy)(nil)).Elem()
}

func (o PasswordPolicyOutput) ToPasswordPolicyOutput() PasswordPolicyOutput {
	return o
}

func (o PasswordPolicyOutput) ToPasswordPolicyOutputWithContext(ctx context.Context) PasswordPolicyOutput {
	return o
}

// Adds a comment or overwrites an existing comment for the password policy.
func (o PasswordPolicyOutput) Comment() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *PasswordPolicy) pulumi.StringPtrOutput { return v.Comment }).(pulumi.StringPtrOutput)
}

// The database this password policy belongs to.
func (o PasswordPolicyOutput) Database() pulumi.StringOutput {
	return o.ApplyT(func(v *PasswordPolicy) pulumi.StringOutput { return v.Database }).(pulumi.StringOutput)
}

// Prevent overwriting a previous password policy with the same name.
func (o PasswordPolicyOutput) IfNotExists() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *PasswordPolicy) pulumi.BoolPtrOutput { return v.IfNotExists }).(pulumi.BoolPtrOutput)
}

// Specifies the number of minutes the user account will be locked after exhausting the designated number of password retries (i.e. PASSWORD*MAX*RETRIES). Supported range: 1 to 999, inclusive. Default: 15
func (o PasswordPolicyOutput) LockoutTimeMins() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *PasswordPolicy) pulumi.IntPtrOutput { return v.LockoutTimeMins }).(pulumi.IntPtrOutput)
}

// Specifies the maximum number of days before the password must be changed. Supported range: 0 to 999, inclusive. A value of zero (i.e. 0) indicates that the password does not need to be changed. Snowflake does not recommend choosing this value for a default account-level password policy or for any user-level policy. Instead, choose a value that meets your internal security guidelines. Default: 90, which means the password must be changed every 90 days.
func (o PasswordPolicyOutput) MaxAgeDays() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *PasswordPolicy) pulumi.IntPtrOutput { return v.MaxAgeDays }).(pulumi.IntPtrOutput)
}

// Specifies the maximum number of characters the password must contain. This number must be greater than or equal to the sum of PASSWORD*MIN*LENGTH, PASSWORD*MIN*UPPER*CASE*CHARS, and PASSWORD*MIN*LOWER*CASE*CHARS. Supported range: 8 to 256, inclusive. Default: 256
func (o PasswordPolicyOutput) MaxLength() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *PasswordPolicy) pulumi.IntPtrOutput { return v.MaxLength }).(pulumi.IntPtrOutput)
}

// Specifies the maximum number of attempts to enter a password before being locked out. Supported range: 1 to 10, inclusive. Default: 5
func (o PasswordPolicyOutput) MaxRetries() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *PasswordPolicy) pulumi.IntPtrOutput { return v.MaxRetries }).(pulumi.IntPtrOutput)
}

// Specifies the minimum number of characters the password must contain. Supported range: 8 to 256, inclusive. Default: 8
func (o PasswordPolicyOutput) MinLength() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *PasswordPolicy) pulumi.IntPtrOutput { return v.MinLength }).(pulumi.IntPtrOutput)
}

// Specifies the minimum number of lowercase characters the password must contain. Supported range: 0 to 256, inclusive. Default: 1
func (o PasswordPolicyOutput) MinLowerCaseChars() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *PasswordPolicy) pulumi.IntPtrOutput { return v.MinLowerCaseChars }).(pulumi.IntPtrOutput)
}

// Specifies the minimum number of numeric characters the password must contain. Supported range: 0 to 256, inclusive. Default: 1
func (o PasswordPolicyOutput) MinNumericChars() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *PasswordPolicy) pulumi.IntPtrOutput { return v.MinNumericChars }).(pulumi.IntPtrOutput)
}

// Specifies the minimum number of special characters the password must contain. Supported range: 0 to 256, inclusive. Default: 1
func (o PasswordPolicyOutput) MinSpecialChars() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *PasswordPolicy) pulumi.IntPtrOutput { return v.MinSpecialChars }).(pulumi.IntPtrOutput)
}

// Specifies the minimum number of uppercase characters the password must contain. Supported range: 0 to 256, inclusive. Default: 1
func (o PasswordPolicyOutput) MinUpperCaseChars() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *PasswordPolicy) pulumi.IntPtrOutput { return v.MinUpperCaseChars }).(pulumi.IntPtrOutput)
}

// Identifier for the password policy; must be unique for your account.
func (o PasswordPolicyOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *PasswordPolicy) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Whether to override a previous password policy with the same name.
func (o PasswordPolicyOutput) OrReplace() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *PasswordPolicy) pulumi.BoolPtrOutput { return v.OrReplace }).(pulumi.BoolPtrOutput)
}

// The schema this password policy belongs to.
func (o PasswordPolicyOutput) Schema() pulumi.StringOutput {
	return o.ApplyT(func(v *PasswordPolicy) pulumi.StringOutput { return v.Schema }).(pulumi.StringOutput)
}

type PasswordPolicyArrayOutput struct{ *pulumi.OutputState }

func (PasswordPolicyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PasswordPolicy)(nil)).Elem()
}

func (o PasswordPolicyArrayOutput) ToPasswordPolicyArrayOutput() PasswordPolicyArrayOutput {
	return o
}

func (o PasswordPolicyArrayOutput) ToPasswordPolicyArrayOutputWithContext(ctx context.Context) PasswordPolicyArrayOutput {
	return o
}

func (o PasswordPolicyArrayOutput) Index(i pulumi.IntInput) PasswordPolicyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *PasswordPolicy {
		return vs[0].([]*PasswordPolicy)[vs[1].(int)]
	}).(PasswordPolicyOutput)
}

type PasswordPolicyMapOutput struct{ *pulumi.OutputState }

func (PasswordPolicyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PasswordPolicy)(nil)).Elem()
}

func (o PasswordPolicyMapOutput) ToPasswordPolicyMapOutput() PasswordPolicyMapOutput {
	return o
}

func (o PasswordPolicyMapOutput) ToPasswordPolicyMapOutputWithContext(ctx context.Context) PasswordPolicyMapOutput {
	return o
}

func (o PasswordPolicyMapOutput) MapIndex(k pulumi.StringInput) PasswordPolicyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *PasswordPolicy {
		return vs[0].(map[string]*PasswordPolicy)[vs[1].(string)]
	}).(PasswordPolicyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*PasswordPolicyInput)(nil)).Elem(), &PasswordPolicy{})
	pulumi.RegisterInputType(reflect.TypeOf((*PasswordPolicyArrayInput)(nil)).Elem(), PasswordPolicyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*PasswordPolicyMapInput)(nil)).Elem(), PasswordPolicyMap{})
	pulumi.RegisterOutputType(PasswordPolicyOutput{})
	pulumi.RegisterOutputType(PasswordPolicyArrayOutput{})
	pulumi.RegisterOutputType(PasswordPolicyMapOutput{})
}