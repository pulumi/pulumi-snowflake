// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package snowflake

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-snowflake/sdk/go/snowflake/internal"
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
//			_, err := snowflake.NewUser(ctx, "user", &snowflake.UserArgs{
//				Name:             pulumi.String("Snowflake User"),
//				LoginName:        pulumi.String("snowflake_user"),
//				Comment:          pulumi.String("A user of snowflake."),
//				Password:         pulumi.String("secret"),
//				Disabled:         pulumi.Bool(false),
//				DisplayName:      pulumi.String("Snowflake User"),
//				Email:            pulumi.String("user@snowflake.example"),
//				FirstName:        pulumi.String("Snowflake"),
//				LastName:         pulumi.String("User"),
//				DefaultWarehouse: pulumi.String("warehouse"),
//				DefaultSecondaryRoles: pulumi.StringArray{
//					pulumi.String("ALL"),
//				},
//				DefaultRole:        pulumi.String("role1"),
//				RsaPublicKey:       pulumi.String("..."),
//				RsaPublicKey2:      pulumi.String("..."),
//				MustChangePassword: pulumi.Bool(false),
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
// $ pulumi import snowflake:index/user:User example userName
// ```
type User struct {
	pulumi.CustomResourceState

	Comment pulumi.StringPtrOutput `pulumi:"comment"`
	// Specifies the namespace (database only or database and schema) that is active by default for the user’s session upon login.
	DefaultNamespace pulumi.StringPtrOutput `pulumi:"defaultNamespace"`
	// Specifies the role that is active by default for the user’s session upon login.
	DefaultRole pulumi.StringOutput `pulumi:"defaultRole"`
	// Specifies the set of secondary roles that are active for the user’s session upon login. Currently only ["ALL"] value is supported - more information can be found in [doc](https://docs.snowflake.com/en/sql-reference/sql/create-user#optional-object-properties-objectproperties)
	DefaultSecondaryRoles pulumi.StringArrayOutput `pulumi:"defaultSecondaryRoles"`
	// Specifies the virtual warehouse that is active by default for the user’s session upon login.
	DefaultWarehouse pulumi.StringPtrOutput `pulumi:"defaultWarehouse"`
	Disabled         pulumi.BoolOutput      `pulumi:"disabled"`
	// Name displayed for the user in the Snowflake web interface.
	DisplayName pulumi.StringOutput `pulumi:"displayName"`
	// Email address for the user.
	Email pulumi.StringPtrOutput `pulumi:"email"`
	// First name of the user.
	FirstName pulumi.StringPtrOutput `pulumi:"firstName"`
	// Will be true if user as an RSA key set.
	HasRsaPublicKey pulumi.BoolOutput `pulumi:"hasRsaPublicKey"`
	// Last name of the user.
	LastName pulumi.StringPtrOutput `pulumi:"lastName"`
	// The name users use to log in. If not supplied, snowflake will use name instead.
	LoginName pulumi.StringOutput `pulumi:"loginName"`
	// Specifies whether the user is forced to change their password on next login (including their first/initial login) into the system.
	MustChangePassword pulumi.BoolPtrOutput `pulumi:"mustChangePassword"`
	// Name of the user. Note that if you do not supply login*name this will be used as login*name. [doc](https://docs.snowflake.net/manuals/sql-reference/sql/create-user.html#required-parameters)
	Name     pulumi.StringOutput    `pulumi:"name"`
	Password pulumi.StringPtrOutput `pulumi:"password"`
	// Specifies the user’s RSA public key; used for key-pair authentication. Must be on 1 line without header and trailer.
	RsaPublicKey pulumi.StringPtrOutput `pulumi:"rsaPublicKey"`
	// Specifies the user’s second RSA public key; used to rotate the public and private keys for key-pair authentication based on an expiration schedule set by your organization. Must be on 1 line without header and trailer.
	RsaPublicKey2 pulumi.StringPtrOutput `pulumi:"rsaPublicKey2"`
}

// NewUser registers a new resource with the given unique name, arguments, and options.
func NewUser(ctx *pulumi.Context,
	name string, args *UserArgs, opts ...pulumi.ResourceOption) (*User, error) {
	if args == nil {
		args = &UserArgs{}
	}

	if args.DisplayName != nil {
		args.DisplayName = pulumi.ToSecret(args.DisplayName).(pulumi.StringPtrInput)
	}
	if args.Email != nil {
		args.Email = pulumi.ToSecret(args.Email).(pulumi.StringPtrInput)
	}
	if args.FirstName != nil {
		args.FirstName = pulumi.ToSecret(args.FirstName).(pulumi.StringPtrInput)
	}
	if args.LastName != nil {
		args.LastName = pulumi.ToSecret(args.LastName).(pulumi.StringPtrInput)
	}
	if args.Name != nil {
		args.Name = pulumi.ToSecret(args.Name).(pulumi.StringPtrInput)
	}
	if args.Password != nil {
		args.Password = pulumi.ToSecret(args.Password).(pulumi.StringPtrInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"displayName",
		"email",
		"firstName",
		"lastName",
		"name",
		"password",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource User
	err := ctx.RegisterResource("snowflake:index/user:User", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetUser gets an existing User resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetUser(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *UserState, opts ...pulumi.ResourceOption) (*User, error) {
	var resource User
	err := ctx.ReadResource("snowflake:index/user:User", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering User resources.
type userState struct {
	Comment *string `pulumi:"comment"`
	// Specifies the namespace (database only or database and schema) that is active by default for the user’s session upon login.
	DefaultNamespace *string `pulumi:"defaultNamespace"`
	// Specifies the role that is active by default for the user’s session upon login.
	DefaultRole *string `pulumi:"defaultRole"`
	// Specifies the set of secondary roles that are active for the user’s session upon login. Currently only ["ALL"] value is supported - more information can be found in [doc](https://docs.snowflake.com/en/sql-reference/sql/create-user#optional-object-properties-objectproperties)
	DefaultSecondaryRoles []string `pulumi:"defaultSecondaryRoles"`
	// Specifies the virtual warehouse that is active by default for the user’s session upon login.
	DefaultWarehouse *string `pulumi:"defaultWarehouse"`
	Disabled         *bool   `pulumi:"disabled"`
	// Name displayed for the user in the Snowflake web interface.
	DisplayName *string `pulumi:"displayName"`
	// Email address for the user.
	Email *string `pulumi:"email"`
	// First name of the user.
	FirstName *string `pulumi:"firstName"`
	// Will be true if user as an RSA key set.
	HasRsaPublicKey *bool `pulumi:"hasRsaPublicKey"`
	// Last name of the user.
	LastName *string `pulumi:"lastName"`
	// The name users use to log in. If not supplied, snowflake will use name instead.
	LoginName *string `pulumi:"loginName"`
	// Specifies whether the user is forced to change their password on next login (including their first/initial login) into the system.
	MustChangePassword *bool `pulumi:"mustChangePassword"`
	// Name of the user. Note that if you do not supply login*name this will be used as login*name. [doc](https://docs.snowflake.net/manuals/sql-reference/sql/create-user.html#required-parameters)
	Name     *string `pulumi:"name"`
	Password *string `pulumi:"password"`
	// Specifies the user’s RSA public key; used for key-pair authentication. Must be on 1 line without header and trailer.
	RsaPublicKey *string `pulumi:"rsaPublicKey"`
	// Specifies the user’s second RSA public key; used to rotate the public and private keys for key-pair authentication based on an expiration schedule set by your organization. Must be on 1 line without header and trailer.
	RsaPublicKey2 *string `pulumi:"rsaPublicKey2"`
}

type UserState struct {
	Comment pulumi.StringPtrInput
	// Specifies the namespace (database only or database and schema) that is active by default for the user’s session upon login.
	DefaultNamespace pulumi.StringPtrInput
	// Specifies the role that is active by default for the user’s session upon login.
	DefaultRole pulumi.StringPtrInput
	// Specifies the set of secondary roles that are active for the user’s session upon login. Currently only ["ALL"] value is supported - more information can be found in [doc](https://docs.snowflake.com/en/sql-reference/sql/create-user#optional-object-properties-objectproperties)
	DefaultSecondaryRoles pulumi.StringArrayInput
	// Specifies the virtual warehouse that is active by default for the user’s session upon login.
	DefaultWarehouse pulumi.StringPtrInput
	Disabled         pulumi.BoolPtrInput
	// Name displayed for the user in the Snowflake web interface.
	DisplayName pulumi.StringPtrInput
	// Email address for the user.
	Email pulumi.StringPtrInput
	// First name of the user.
	FirstName pulumi.StringPtrInput
	// Will be true if user as an RSA key set.
	HasRsaPublicKey pulumi.BoolPtrInput
	// Last name of the user.
	LastName pulumi.StringPtrInput
	// The name users use to log in. If not supplied, snowflake will use name instead.
	LoginName pulumi.StringPtrInput
	// Specifies whether the user is forced to change their password on next login (including their first/initial login) into the system.
	MustChangePassword pulumi.BoolPtrInput
	// Name of the user. Note that if you do not supply login*name this will be used as login*name. [doc](https://docs.snowflake.net/manuals/sql-reference/sql/create-user.html#required-parameters)
	Name     pulumi.StringPtrInput
	Password pulumi.StringPtrInput
	// Specifies the user’s RSA public key; used for key-pair authentication. Must be on 1 line without header and trailer.
	RsaPublicKey pulumi.StringPtrInput
	// Specifies the user’s second RSA public key; used to rotate the public and private keys for key-pair authentication based on an expiration schedule set by your organization. Must be on 1 line without header and trailer.
	RsaPublicKey2 pulumi.StringPtrInput
}

func (UserState) ElementType() reflect.Type {
	return reflect.TypeOf((*userState)(nil)).Elem()
}

type userArgs struct {
	Comment *string `pulumi:"comment"`
	// Specifies the namespace (database only or database and schema) that is active by default for the user’s session upon login.
	DefaultNamespace *string `pulumi:"defaultNamespace"`
	// Specifies the role that is active by default for the user’s session upon login.
	DefaultRole *string `pulumi:"defaultRole"`
	// Specifies the set of secondary roles that are active for the user’s session upon login. Currently only ["ALL"] value is supported - more information can be found in [doc](https://docs.snowflake.com/en/sql-reference/sql/create-user#optional-object-properties-objectproperties)
	DefaultSecondaryRoles []string `pulumi:"defaultSecondaryRoles"`
	// Specifies the virtual warehouse that is active by default for the user’s session upon login.
	DefaultWarehouse *string `pulumi:"defaultWarehouse"`
	Disabled         *bool   `pulumi:"disabled"`
	// Name displayed for the user in the Snowflake web interface.
	DisplayName *string `pulumi:"displayName"`
	// Email address for the user.
	Email *string `pulumi:"email"`
	// First name of the user.
	FirstName *string `pulumi:"firstName"`
	// Last name of the user.
	LastName *string `pulumi:"lastName"`
	// The name users use to log in. If not supplied, snowflake will use name instead.
	LoginName *string `pulumi:"loginName"`
	// Specifies whether the user is forced to change their password on next login (including their first/initial login) into the system.
	MustChangePassword *bool `pulumi:"mustChangePassword"`
	// Name of the user. Note that if you do not supply login*name this will be used as login*name. [doc](https://docs.snowflake.net/manuals/sql-reference/sql/create-user.html#required-parameters)
	Name     *string `pulumi:"name"`
	Password *string `pulumi:"password"`
	// Specifies the user’s RSA public key; used for key-pair authentication. Must be on 1 line without header and trailer.
	RsaPublicKey *string `pulumi:"rsaPublicKey"`
	// Specifies the user’s second RSA public key; used to rotate the public and private keys for key-pair authentication based on an expiration schedule set by your organization. Must be on 1 line without header and trailer.
	RsaPublicKey2 *string `pulumi:"rsaPublicKey2"`
}

// The set of arguments for constructing a User resource.
type UserArgs struct {
	Comment pulumi.StringPtrInput
	// Specifies the namespace (database only or database and schema) that is active by default for the user’s session upon login.
	DefaultNamespace pulumi.StringPtrInput
	// Specifies the role that is active by default for the user’s session upon login.
	DefaultRole pulumi.StringPtrInput
	// Specifies the set of secondary roles that are active for the user’s session upon login. Currently only ["ALL"] value is supported - more information can be found in [doc](https://docs.snowflake.com/en/sql-reference/sql/create-user#optional-object-properties-objectproperties)
	DefaultSecondaryRoles pulumi.StringArrayInput
	// Specifies the virtual warehouse that is active by default for the user’s session upon login.
	DefaultWarehouse pulumi.StringPtrInput
	Disabled         pulumi.BoolPtrInput
	// Name displayed for the user in the Snowflake web interface.
	DisplayName pulumi.StringPtrInput
	// Email address for the user.
	Email pulumi.StringPtrInput
	// First name of the user.
	FirstName pulumi.StringPtrInput
	// Last name of the user.
	LastName pulumi.StringPtrInput
	// The name users use to log in. If not supplied, snowflake will use name instead.
	LoginName pulumi.StringPtrInput
	// Specifies whether the user is forced to change their password on next login (including their first/initial login) into the system.
	MustChangePassword pulumi.BoolPtrInput
	// Name of the user. Note that if you do not supply login*name this will be used as login*name. [doc](https://docs.snowflake.net/manuals/sql-reference/sql/create-user.html#required-parameters)
	Name     pulumi.StringPtrInput
	Password pulumi.StringPtrInput
	// Specifies the user’s RSA public key; used for key-pair authentication. Must be on 1 line without header and trailer.
	RsaPublicKey pulumi.StringPtrInput
	// Specifies the user’s second RSA public key; used to rotate the public and private keys for key-pair authentication based on an expiration schedule set by your organization. Must be on 1 line without header and trailer.
	RsaPublicKey2 pulumi.StringPtrInput
}

func (UserArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*userArgs)(nil)).Elem()
}

type UserInput interface {
	pulumi.Input

	ToUserOutput() UserOutput
	ToUserOutputWithContext(ctx context.Context) UserOutput
}

func (*User) ElementType() reflect.Type {
	return reflect.TypeOf((**User)(nil)).Elem()
}

func (i *User) ToUserOutput() UserOutput {
	return i.ToUserOutputWithContext(context.Background())
}

func (i *User) ToUserOutputWithContext(ctx context.Context) UserOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserOutput)
}

// UserArrayInput is an input type that accepts UserArray and UserArrayOutput values.
// You can construct a concrete instance of `UserArrayInput` via:
//
//	UserArray{ UserArgs{...} }
type UserArrayInput interface {
	pulumi.Input

	ToUserArrayOutput() UserArrayOutput
	ToUserArrayOutputWithContext(context.Context) UserArrayOutput
}

type UserArray []UserInput

func (UserArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*User)(nil)).Elem()
}

func (i UserArray) ToUserArrayOutput() UserArrayOutput {
	return i.ToUserArrayOutputWithContext(context.Background())
}

func (i UserArray) ToUserArrayOutputWithContext(ctx context.Context) UserArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserArrayOutput)
}

// UserMapInput is an input type that accepts UserMap and UserMapOutput values.
// You can construct a concrete instance of `UserMapInput` via:
//
//	UserMap{ "key": UserArgs{...} }
type UserMapInput interface {
	pulumi.Input

	ToUserMapOutput() UserMapOutput
	ToUserMapOutputWithContext(context.Context) UserMapOutput
}

type UserMap map[string]UserInput

func (UserMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*User)(nil)).Elem()
}

func (i UserMap) ToUserMapOutput() UserMapOutput {
	return i.ToUserMapOutputWithContext(context.Background())
}

func (i UserMap) ToUserMapOutputWithContext(ctx context.Context) UserMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserMapOutput)
}

type UserOutput struct{ *pulumi.OutputState }

func (UserOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**User)(nil)).Elem()
}

func (o UserOutput) ToUserOutput() UserOutput {
	return o
}

func (o UserOutput) ToUserOutputWithContext(ctx context.Context) UserOutput {
	return o
}

func (o UserOutput) Comment() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *User) pulumi.StringPtrOutput { return v.Comment }).(pulumi.StringPtrOutput)
}

// Specifies the namespace (database only or database and schema) that is active by default for the user’s session upon login.
func (o UserOutput) DefaultNamespace() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *User) pulumi.StringPtrOutput { return v.DefaultNamespace }).(pulumi.StringPtrOutput)
}

// Specifies the role that is active by default for the user’s session upon login.
func (o UserOutput) DefaultRole() pulumi.StringOutput {
	return o.ApplyT(func(v *User) pulumi.StringOutput { return v.DefaultRole }).(pulumi.StringOutput)
}

// Specifies the set of secondary roles that are active for the user’s session upon login. Currently only ["ALL"] value is supported - more information can be found in [doc](https://docs.snowflake.com/en/sql-reference/sql/create-user#optional-object-properties-objectproperties)
func (o UserOutput) DefaultSecondaryRoles() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *User) pulumi.StringArrayOutput { return v.DefaultSecondaryRoles }).(pulumi.StringArrayOutput)
}

// Specifies the virtual warehouse that is active by default for the user’s session upon login.
func (o UserOutput) DefaultWarehouse() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *User) pulumi.StringPtrOutput { return v.DefaultWarehouse }).(pulumi.StringPtrOutput)
}

func (o UserOutput) Disabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *User) pulumi.BoolOutput { return v.Disabled }).(pulumi.BoolOutput)
}

// Name displayed for the user in the Snowflake web interface.
func (o UserOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v *User) pulumi.StringOutput { return v.DisplayName }).(pulumi.StringOutput)
}

// Email address for the user.
func (o UserOutput) Email() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *User) pulumi.StringPtrOutput { return v.Email }).(pulumi.StringPtrOutput)
}

// First name of the user.
func (o UserOutput) FirstName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *User) pulumi.StringPtrOutput { return v.FirstName }).(pulumi.StringPtrOutput)
}

// Will be true if user as an RSA key set.
func (o UserOutput) HasRsaPublicKey() pulumi.BoolOutput {
	return o.ApplyT(func(v *User) pulumi.BoolOutput { return v.HasRsaPublicKey }).(pulumi.BoolOutput)
}

// Last name of the user.
func (o UserOutput) LastName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *User) pulumi.StringPtrOutput { return v.LastName }).(pulumi.StringPtrOutput)
}

// The name users use to log in. If not supplied, snowflake will use name instead.
func (o UserOutput) LoginName() pulumi.StringOutput {
	return o.ApplyT(func(v *User) pulumi.StringOutput { return v.LoginName }).(pulumi.StringOutput)
}

// Specifies whether the user is forced to change their password on next login (including their first/initial login) into the system.
func (o UserOutput) MustChangePassword() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *User) pulumi.BoolPtrOutput { return v.MustChangePassword }).(pulumi.BoolPtrOutput)
}

// Name of the user. Note that if you do not supply login*name this will be used as login*name. [doc](https://docs.snowflake.net/manuals/sql-reference/sql/create-user.html#required-parameters)
func (o UserOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *User) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

func (o UserOutput) Password() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *User) pulumi.StringPtrOutput { return v.Password }).(pulumi.StringPtrOutput)
}

// Specifies the user’s RSA public key; used for key-pair authentication. Must be on 1 line without header and trailer.
func (o UserOutput) RsaPublicKey() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *User) pulumi.StringPtrOutput { return v.RsaPublicKey }).(pulumi.StringPtrOutput)
}

// Specifies the user’s second RSA public key; used to rotate the public and private keys for key-pair authentication based on an expiration schedule set by your organization. Must be on 1 line without header and trailer.
func (o UserOutput) RsaPublicKey2() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *User) pulumi.StringPtrOutput { return v.RsaPublicKey2 }).(pulumi.StringPtrOutput)
}

type UserArrayOutput struct{ *pulumi.OutputState }

func (UserArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*User)(nil)).Elem()
}

func (o UserArrayOutput) ToUserArrayOutput() UserArrayOutput {
	return o
}

func (o UserArrayOutput) ToUserArrayOutputWithContext(ctx context.Context) UserArrayOutput {
	return o
}

func (o UserArrayOutput) Index(i pulumi.IntInput) UserOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *User {
		return vs[0].([]*User)[vs[1].(int)]
	}).(UserOutput)
}

type UserMapOutput struct{ *pulumi.OutputState }

func (UserMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*User)(nil)).Elem()
}

func (o UserMapOutput) ToUserMapOutput() UserMapOutput {
	return o
}

func (o UserMapOutput) ToUserMapOutputWithContext(ctx context.Context) UserMapOutput {
	return o
}

func (o UserMapOutput) MapIndex(k pulumi.StringInput) UserOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *User {
		return vs[0].(map[string]*User)[vs[1].(string)]
	}).(UserOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*UserInput)(nil)).Elem(), &User{})
	pulumi.RegisterInputType(reflect.TypeOf((*UserArrayInput)(nil)).Elem(), UserArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*UserMapInput)(nil)).Elem(), UserMap{})
	pulumi.RegisterOutputType(UserOutput{})
	pulumi.RegisterOutputType(UserArrayOutput{})
	pulumi.RegisterOutputType(UserMapOutput{})
}
