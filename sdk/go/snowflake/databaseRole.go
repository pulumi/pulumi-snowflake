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
// $ pulumi import snowflake:index/databaseRole:DatabaseRole example '"<database_name>"."<database_role_name>"'
// ```
type DatabaseRole struct {
	pulumi.CustomResourceState

	// Specifies a comment for the database role.
	Comment pulumi.StringPtrOutput `pulumi:"comment"`
	// The database in which to create the database role. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
	Database pulumi.StringOutput `pulumi:"database"`
	// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
	FullyQualifiedName pulumi.StringOutput `pulumi:"fullyQualifiedName"`
	// Specifies the identifier for the database role. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
	Name pulumi.StringOutput `pulumi:"name"`
	// Outputs the result of `SHOW DATABASE ROLES` for the given database role. Note that this value will be only recomputed whenever comment field changes.
	ShowOutputs DatabaseRoleShowOutputArrayOutput `pulumi:"showOutputs"`
}

// NewDatabaseRole registers a new resource with the given unique name, arguments, and options.
func NewDatabaseRole(ctx *pulumi.Context,
	name string, args *DatabaseRoleArgs, opts ...pulumi.ResourceOption) (*DatabaseRole, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Database == nil {
		return nil, errors.New("invalid value for required argument 'Database'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource DatabaseRole
	err := ctx.RegisterResource("snowflake:index/databaseRole:DatabaseRole", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDatabaseRole gets an existing DatabaseRole resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDatabaseRole(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DatabaseRoleState, opts ...pulumi.ResourceOption) (*DatabaseRole, error) {
	var resource DatabaseRole
	err := ctx.ReadResource("snowflake:index/databaseRole:DatabaseRole", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DatabaseRole resources.
type databaseRoleState struct {
	// Specifies a comment for the database role.
	Comment *string `pulumi:"comment"`
	// The database in which to create the database role. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
	Database *string `pulumi:"database"`
	// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
	FullyQualifiedName *string `pulumi:"fullyQualifiedName"`
	// Specifies the identifier for the database role. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
	Name *string `pulumi:"name"`
	// Outputs the result of `SHOW DATABASE ROLES` for the given database role. Note that this value will be only recomputed whenever comment field changes.
	ShowOutputs []DatabaseRoleShowOutput `pulumi:"showOutputs"`
}

type DatabaseRoleState struct {
	// Specifies a comment for the database role.
	Comment pulumi.StringPtrInput
	// The database in which to create the database role. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
	Database pulumi.StringPtrInput
	// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
	FullyQualifiedName pulumi.StringPtrInput
	// Specifies the identifier for the database role. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
	Name pulumi.StringPtrInput
	// Outputs the result of `SHOW DATABASE ROLES` for the given database role. Note that this value will be only recomputed whenever comment field changes.
	ShowOutputs DatabaseRoleShowOutputArrayInput
}

func (DatabaseRoleState) ElementType() reflect.Type {
	return reflect.TypeOf((*databaseRoleState)(nil)).Elem()
}

type databaseRoleArgs struct {
	// Specifies a comment for the database role.
	Comment *string `pulumi:"comment"`
	// The database in which to create the database role. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
	Database string `pulumi:"database"`
	// Specifies the identifier for the database role. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
	Name *string `pulumi:"name"`
}

// The set of arguments for constructing a DatabaseRole resource.
type DatabaseRoleArgs struct {
	// Specifies a comment for the database role.
	Comment pulumi.StringPtrInput
	// The database in which to create the database role. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
	Database pulumi.StringInput
	// Specifies the identifier for the database role. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
	Name pulumi.StringPtrInput
}

func (DatabaseRoleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*databaseRoleArgs)(nil)).Elem()
}

type DatabaseRoleInput interface {
	pulumi.Input

	ToDatabaseRoleOutput() DatabaseRoleOutput
	ToDatabaseRoleOutputWithContext(ctx context.Context) DatabaseRoleOutput
}

func (*DatabaseRole) ElementType() reflect.Type {
	return reflect.TypeOf((**DatabaseRole)(nil)).Elem()
}

func (i *DatabaseRole) ToDatabaseRoleOutput() DatabaseRoleOutput {
	return i.ToDatabaseRoleOutputWithContext(context.Background())
}

func (i *DatabaseRole) ToDatabaseRoleOutputWithContext(ctx context.Context) DatabaseRoleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DatabaseRoleOutput)
}

// DatabaseRoleArrayInput is an input type that accepts DatabaseRoleArray and DatabaseRoleArrayOutput values.
// You can construct a concrete instance of `DatabaseRoleArrayInput` via:
//
//	DatabaseRoleArray{ DatabaseRoleArgs{...} }
type DatabaseRoleArrayInput interface {
	pulumi.Input

	ToDatabaseRoleArrayOutput() DatabaseRoleArrayOutput
	ToDatabaseRoleArrayOutputWithContext(context.Context) DatabaseRoleArrayOutput
}

type DatabaseRoleArray []DatabaseRoleInput

func (DatabaseRoleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DatabaseRole)(nil)).Elem()
}

func (i DatabaseRoleArray) ToDatabaseRoleArrayOutput() DatabaseRoleArrayOutput {
	return i.ToDatabaseRoleArrayOutputWithContext(context.Background())
}

func (i DatabaseRoleArray) ToDatabaseRoleArrayOutputWithContext(ctx context.Context) DatabaseRoleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DatabaseRoleArrayOutput)
}

// DatabaseRoleMapInput is an input type that accepts DatabaseRoleMap and DatabaseRoleMapOutput values.
// You can construct a concrete instance of `DatabaseRoleMapInput` via:
//
//	DatabaseRoleMap{ "key": DatabaseRoleArgs{...} }
type DatabaseRoleMapInput interface {
	pulumi.Input

	ToDatabaseRoleMapOutput() DatabaseRoleMapOutput
	ToDatabaseRoleMapOutputWithContext(context.Context) DatabaseRoleMapOutput
}

type DatabaseRoleMap map[string]DatabaseRoleInput

func (DatabaseRoleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DatabaseRole)(nil)).Elem()
}

func (i DatabaseRoleMap) ToDatabaseRoleMapOutput() DatabaseRoleMapOutput {
	return i.ToDatabaseRoleMapOutputWithContext(context.Background())
}

func (i DatabaseRoleMap) ToDatabaseRoleMapOutputWithContext(ctx context.Context) DatabaseRoleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DatabaseRoleMapOutput)
}

type DatabaseRoleOutput struct{ *pulumi.OutputState }

func (DatabaseRoleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DatabaseRole)(nil)).Elem()
}

func (o DatabaseRoleOutput) ToDatabaseRoleOutput() DatabaseRoleOutput {
	return o
}

func (o DatabaseRoleOutput) ToDatabaseRoleOutputWithContext(ctx context.Context) DatabaseRoleOutput {
	return o
}

// Specifies a comment for the database role.
func (o DatabaseRoleOutput) Comment() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *DatabaseRole) pulumi.StringPtrOutput { return v.Comment }).(pulumi.StringPtrOutput)
}

// The database in which to create the database role. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
func (o DatabaseRoleOutput) Database() pulumi.StringOutput {
	return o.ApplyT(func(v *DatabaseRole) pulumi.StringOutput { return v.Database }).(pulumi.StringOutput)
}

// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
func (o DatabaseRoleOutput) FullyQualifiedName() pulumi.StringOutput {
	return o.ApplyT(func(v *DatabaseRole) pulumi.StringOutput { return v.FullyQualifiedName }).(pulumi.StringOutput)
}

// Specifies the identifier for the database role. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
func (o DatabaseRoleOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *DatabaseRole) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Outputs the result of `SHOW DATABASE ROLES` for the given database role. Note that this value will be only recomputed whenever comment field changes.
func (o DatabaseRoleOutput) ShowOutputs() DatabaseRoleShowOutputArrayOutput {
	return o.ApplyT(func(v *DatabaseRole) DatabaseRoleShowOutputArrayOutput { return v.ShowOutputs }).(DatabaseRoleShowOutputArrayOutput)
}

type DatabaseRoleArrayOutput struct{ *pulumi.OutputState }

func (DatabaseRoleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DatabaseRole)(nil)).Elem()
}

func (o DatabaseRoleArrayOutput) ToDatabaseRoleArrayOutput() DatabaseRoleArrayOutput {
	return o
}

func (o DatabaseRoleArrayOutput) ToDatabaseRoleArrayOutputWithContext(ctx context.Context) DatabaseRoleArrayOutput {
	return o
}

func (o DatabaseRoleArrayOutput) Index(i pulumi.IntInput) DatabaseRoleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *DatabaseRole {
		return vs[0].([]*DatabaseRole)[vs[1].(int)]
	}).(DatabaseRoleOutput)
}

type DatabaseRoleMapOutput struct{ *pulumi.OutputState }

func (DatabaseRoleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DatabaseRole)(nil)).Elem()
}

func (o DatabaseRoleMapOutput) ToDatabaseRoleMapOutput() DatabaseRoleMapOutput {
	return o
}

func (o DatabaseRoleMapOutput) ToDatabaseRoleMapOutputWithContext(ctx context.Context) DatabaseRoleMapOutput {
	return o
}

func (o DatabaseRoleMapOutput) MapIndex(k pulumi.StringInput) DatabaseRoleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *DatabaseRole {
		return vs[0].(map[string]*DatabaseRole)[vs[1].(string)]
	}).(DatabaseRoleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DatabaseRoleInput)(nil)).Elem(), &DatabaseRole{})
	pulumi.RegisterInputType(reflect.TypeOf((*DatabaseRoleArrayInput)(nil)).Elem(), DatabaseRoleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DatabaseRoleMapInput)(nil)).Elem(), DatabaseRoleMap{})
	pulumi.RegisterOutputType(DatabaseRoleOutput{})
	pulumi.RegisterOutputType(DatabaseRoleArrayOutput{})
	pulumi.RegisterOutputType(DatabaseRoleMapOutput{})
}
