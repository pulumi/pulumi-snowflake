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
//			_, err := snowflake.NewFileFormatGrant(ctx, "grant", &snowflake.FileFormatGrantArgs{
//				DatabaseName:   pulumi.String("database"),
//				FileFormatName: pulumi.String("file_format"),
//				OnFuture:       pulumi.Bool(false),
//				Privilege:      pulumi.String("SELECT"),
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
// format is database name | schema name | file format name | privilege | true/false for with_grant_option
//
// ```sh
//
//	$ pulumi import snowflake:index/fileFormatGrant:FileFormatGrant example 'dbName|schemaName|fileFormatName|USAGE|false'
//
// ```
type FileFormatGrant struct {
	pulumi.CustomResourceState

	// The name of the database containing the current or future file formats on which to grant privileges.
	DatabaseName pulumi.StringOutput `pulumi:"databaseName"`
	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants pulumi.BoolPtrOutput `pulumi:"enableMultipleGrants"`
	// The name of the file format on which to grant privileges immediately (only valid if onFuture is false).
	FileFormatName pulumi.StringPtrOutput `pulumi:"fileFormatName"`
	// When this is set to true and a schema*name is provided, apply this grant on all future file formats in the given schema. When this is true and no schema*name is provided apply this grant on all future file formats in the given database. The file*format*name field must be unset in order to use on_future.
	OnFuture pulumi.BoolPtrOutput `pulumi:"onFuture"`
	// The privilege to grant on the current or future file format.
	Privilege pulumi.StringPtrOutput `pulumi:"privilege"`
	// Grants privilege to these roles.
	Roles pulumi.StringArrayOutput `pulumi:"roles"`
	// The name of the schema containing the current or future file formats on which to grant privileges.
	SchemaName pulumi.StringPtrOutput `pulumi:"schemaName"`
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption pulumi.BoolPtrOutput `pulumi:"withGrantOption"`
}

// NewFileFormatGrant registers a new resource with the given unique name, arguments, and options.
func NewFileFormatGrant(ctx *pulumi.Context,
	name string, args *FileFormatGrantArgs, opts ...pulumi.ResourceOption) (*FileFormatGrant, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DatabaseName == nil {
		return nil, errors.New("invalid value for required argument 'DatabaseName'")
	}
	if args.Roles == nil {
		return nil, errors.New("invalid value for required argument 'Roles'")
	}
	var resource FileFormatGrant
	err := ctx.RegisterResource("snowflake:index/fileFormatGrant:FileFormatGrant", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetFileFormatGrant gets an existing FileFormatGrant resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetFileFormatGrant(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *FileFormatGrantState, opts ...pulumi.ResourceOption) (*FileFormatGrant, error) {
	var resource FileFormatGrant
	err := ctx.ReadResource("snowflake:index/fileFormatGrant:FileFormatGrant", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering FileFormatGrant resources.
type fileFormatGrantState struct {
	// The name of the database containing the current or future file formats on which to grant privileges.
	DatabaseName *string `pulumi:"databaseName"`
	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants *bool `pulumi:"enableMultipleGrants"`
	// The name of the file format on which to grant privileges immediately (only valid if onFuture is false).
	FileFormatName *string `pulumi:"fileFormatName"`
	// When this is set to true and a schema*name is provided, apply this grant on all future file formats in the given schema. When this is true and no schema*name is provided apply this grant on all future file formats in the given database. The file*format*name field must be unset in order to use on_future.
	OnFuture *bool `pulumi:"onFuture"`
	// The privilege to grant on the current or future file format.
	Privilege *string `pulumi:"privilege"`
	// Grants privilege to these roles.
	Roles []string `pulumi:"roles"`
	// The name of the schema containing the current or future file formats on which to grant privileges.
	SchemaName *string `pulumi:"schemaName"`
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption *bool `pulumi:"withGrantOption"`
}

type FileFormatGrantState struct {
	// The name of the database containing the current or future file formats on which to grant privileges.
	DatabaseName pulumi.StringPtrInput
	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants pulumi.BoolPtrInput
	// The name of the file format on which to grant privileges immediately (only valid if onFuture is false).
	FileFormatName pulumi.StringPtrInput
	// When this is set to true and a schema*name is provided, apply this grant on all future file formats in the given schema. When this is true and no schema*name is provided apply this grant on all future file formats in the given database. The file*format*name field must be unset in order to use on_future.
	OnFuture pulumi.BoolPtrInput
	// The privilege to grant on the current or future file format.
	Privilege pulumi.StringPtrInput
	// Grants privilege to these roles.
	Roles pulumi.StringArrayInput
	// The name of the schema containing the current or future file formats on which to grant privileges.
	SchemaName pulumi.StringPtrInput
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption pulumi.BoolPtrInput
}

func (FileFormatGrantState) ElementType() reflect.Type {
	return reflect.TypeOf((*fileFormatGrantState)(nil)).Elem()
}

type fileFormatGrantArgs struct {
	// The name of the database containing the current or future file formats on which to grant privileges.
	DatabaseName string `pulumi:"databaseName"`
	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants *bool `pulumi:"enableMultipleGrants"`
	// The name of the file format on which to grant privileges immediately (only valid if onFuture is false).
	FileFormatName *string `pulumi:"fileFormatName"`
	// When this is set to true and a schema*name is provided, apply this grant on all future file formats in the given schema. When this is true and no schema*name is provided apply this grant on all future file formats in the given database. The file*format*name field must be unset in order to use on_future.
	OnFuture *bool `pulumi:"onFuture"`
	// The privilege to grant on the current or future file format.
	Privilege *string `pulumi:"privilege"`
	// Grants privilege to these roles.
	Roles []string `pulumi:"roles"`
	// The name of the schema containing the current or future file formats on which to grant privileges.
	SchemaName *string `pulumi:"schemaName"`
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption *bool `pulumi:"withGrantOption"`
}

// The set of arguments for constructing a FileFormatGrant resource.
type FileFormatGrantArgs struct {
	// The name of the database containing the current or future file formats on which to grant privileges.
	DatabaseName pulumi.StringInput
	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants pulumi.BoolPtrInput
	// The name of the file format on which to grant privileges immediately (only valid if onFuture is false).
	FileFormatName pulumi.StringPtrInput
	// When this is set to true and a schema*name is provided, apply this grant on all future file formats in the given schema. When this is true and no schema*name is provided apply this grant on all future file formats in the given database. The file*format*name field must be unset in order to use on_future.
	OnFuture pulumi.BoolPtrInput
	// The privilege to grant on the current or future file format.
	Privilege pulumi.StringPtrInput
	// Grants privilege to these roles.
	Roles pulumi.StringArrayInput
	// The name of the schema containing the current or future file formats on which to grant privileges.
	SchemaName pulumi.StringPtrInput
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption pulumi.BoolPtrInput
}

func (FileFormatGrantArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*fileFormatGrantArgs)(nil)).Elem()
}

type FileFormatGrantInput interface {
	pulumi.Input

	ToFileFormatGrantOutput() FileFormatGrantOutput
	ToFileFormatGrantOutputWithContext(ctx context.Context) FileFormatGrantOutput
}

func (*FileFormatGrant) ElementType() reflect.Type {
	return reflect.TypeOf((**FileFormatGrant)(nil)).Elem()
}

func (i *FileFormatGrant) ToFileFormatGrantOutput() FileFormatGrantOutput {
	return i.ToFileFormatGrantOutputWithContext(context.Background())
}

func (i *FileFormatGrant) ToFileFormatGrantOutputWithContext(ctx context.Context) FileFormatGrantOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FileFormatGrantOutput)
}

// FileFormatGrantArrayInput is an input type that accepts FileFormatGrantArray and FileFormatGrantArrayOutput values.
// You can construct a concrete instance of `FileFormatGrantArrayInput` via:
//
//	FileFormatGrantArray{ FileFormatGrantArgs{...} }
type FileFormatGrantArrayInput interface {
	pulumi.Input

	ToFileFormatGrantArrayOutput() FileFormatGrantArrayOutput
	ToFileFormatGrantArrayOutputWithContext(context.Context) FileFormatGrantArrayOutput
}

type FileFormatGrantArray []FileFormatGrantInput

func (FileFormatGrantArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*FileFormatGrant)(nil)).Elem()
}

func (i FileFormatGrantArray) ToFileFormatGrantArrayOutput() FileFormatGrantArrayOutput {
	return i.ToFileFormatGrantArrayOutputWithContext(context.Background())
}

func (i FileFormatGrantArray) ToFileFormatGrantArrayOutputWithContext(ctx context.Context) FileFormatGrantArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FileFormatGrantArrayOutput)
}

// FileFormatGrantMapInput is an input type that accepts FileFormatGrantMap and FileFormatGrantMapOutput values.
// You can construct a concrete instance of `FileFormatGrantMapInput` via:
//
//	FileFormatGrantMap{ "key": FileFormatGrantArgs{...} }
type FileFormatGrantMapInput interface {
	pulumi.Input

	ToFileFormatGrantMapOutput() FileFormatGrantMapOutput
	ToFileFormatGrantMapOutputWithContext(context.Context) FileFormatGrantMapOutput
}

type FileFormatGrantMap map[string]FileFormatGrantInput

func (FileFormatGrantMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*FileFormatGrant)(nil)).Elem()
}

func (i FileFormatGrantMap) ToFileFormatGrantMapOutput() FileFormatGrantMapOutput {
	return i.ToFileFormatGrantMapOutputWithContext(context.Background())
}

func (i FileFormatGrantMap) ToFileFormatGrantMapOutputWithContext(ctx context.Context) FileFormatGrantMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FileFormatGrantMapOutput)
}

type FileFormatGrantOutput struct{ *pulumi.OutputState }

func (FileFormatGrantOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**FileFormatGrant)(nil)).Elem()
}

func (o FileFormatGrantOutput) ToFileFormatGrantOutput() FileFormatGrantOutput {
	return o
}

func (o FileFormatGrantOutput) ToFileFormatGrantOutputWithContext(ctx context.Context) FileFormatGrantOutput {
	return o
}

// The name of the database containing the current or future file formats on which to grant privileges.
func (o FileFormatGrantOutput) DatabaseName() pulumi.StringOutput {
	return o.ApplyT(func(v *FileFormatGrant) pulumi.StringOutput { return v.DatabaseName }).(pulumi.StringOutput)
}

// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
// grants applied to roles and objects outside Terraform.
func (o FileFormatGrantOutput) EnableMultipleGrants() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *FileFormatGrant) pulumi.BoolPtrOutput { return v.EnableMultipleGrants }).(pulumi.BoolPtrOutput)
}

// The name of the file format on which to grant privileges immediately (only valid if onFuture is false).
func (o FileFormatGrantOutput) FileFormatName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *FileFormatGrant) pulumi.StringPtrOutput { return v.FileFormatName }).(pulumi.StringPtrOutput)
}

// When this is set to true and a schema*name is provided, apply this grant on all future file formats in the given schema. When this is true and no schema*name is provided apply this grant on all future file formats in the given database. The file*format*name field must be unset in order to use on_future.
func (o FileFormatGrantOutput) OnFuture() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *FileFormatGrant) pulumi.BoolPtrOutput { return v.OnFuture }).(pulumi.BoolPtrOutput)
}

// The privilege to grant on the current or future file format.
func (o FileFormatGrantOutput) Privilege() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *FileFormatGrant) pulumi.StringPtrOutput { return v.Privilege }).(pulumi.StringPtrOutput)
}

// Grants privilege to these roles.
func (o FileFormatGrantOutput) Roles() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *FileFormatGrant) pulumi.StringArrayOutput { return v.Roles }).(pulumi.StringArrayOutput)
}

// The name of the schema containing the current or future file formats on which to grant privileges.
func (o FileFormatGrantOutput) SchemaName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *FileFormatGrant) pulumi.StringPtrOutput { return v.SchemaName }).(pulumi.StringPtrOutput)
}

// When this is set to true, allows the recipient role to grant the privileges to other roles.
func (o FileFormatGrantOutput) WithGrantOption() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *FileFormatGrant) pulumi.BoolPtrOutput { return v.WithGrantOption }).(pulumi.BoolPtrOutput)
}

type FileFormatGrantArrayOutput struct{ *pulumi.OutputState }

func (FileFormatGrantArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*FileFormatGrant)(nil)).Elem()
}

func (o FileFormatGrantArrayOutput) ToFileFormatGrantArrayOutput() FileFormatGrantArrayOutput {
	return o
}

func (o FileFormatGrantArrayOutput) ToFileFormatGrantArrayOutputWithContext(ctx context.Context) FileFormatGrantArrayOutput {
	return o
}

func (o FileFormatGrantArrayOutput) Index(i pulumi.IntInput) FileFormatGrantOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *FileFormatGrant {
		return vs[0].([]*FileFormatGrant)[vs[1].(int)]
	}).(FileFormatGrantOutput)
}

type FileFormatGrantMapOutput struct{ *pulumi.OutputState }

func (FileFormatGrantMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*FileFormatGrant)(nil)).Elem()
}

func (o FileFormatGrantMapOutput) ToFileFormatGrantMapOutput() FileFormatGrantMapOutput {
	return o
}

func (o FileFormatGrantMapOutput) ToFileFormatGrantMapOutputWithContext(ctx context.Context) FileFormatGrantMapOutput {
	return o
}

func (o FileFormatGrantMapOutput) MapIndex(k pulumi.StringInput) FileFormatGrantOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *FileFormatGrant {
		return vs[0].(map[string]*FileFormatGrant)[vs[1].(string)]
	}).(FileFormatGrantOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*FileFormatGrantInput)(nil)).Elem(), &FileFormatGrant{})
	pulumi.RegisterInputType(reflect.TypeOf((*FileFormatGrantArrayInput)(nil)).Elem(), FileFormatGrantArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*FileFormatGrantMapInput)(nil)).Elem(), FileFormatGrantMap{})
	pulumi.RegisterOutputType(FileFormatGrantOutput{})
	pulumi.RegisterOutputType(FileFormatGrantArrayOutput{})
	pulumi.RegisterOutputType(FileFormatGrantMapOutput{})
}
