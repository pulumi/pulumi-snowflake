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
//			_, err := snowflake.NewDatabase(ctx, "simple", &snowflake.DatabaseArgs{
//				Comment:                 pulumi.String("test comment"),
//				DataRetentionTimeInDays: pulumi.Int(3),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = snowflake.NewDatabase(ctx, "withReplication", &snowflake.DatabaseArgs{
//				Comment: pulumi.String("test comment 2"),
//				ReplicationConfiguration: &snowflake.DatabaseReplicationConfigurationArgs{
//					Accounts: pulumi.StringArray{
//						pulumi.String("test_account1"),
//						pulumi.String("test_account_2"),
//					},
//					IgnoreEditionCheck: pulumi.Bool(true),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = snowflake.NewDatabase(ctx, "fromReplica", &snowflake.DatabaseArgs{
//				Comment:                 pulumi.String("test comment"),
//				DataRetentionTimeInDays: pulumi.Int(3),
//				FromReplica:             pulumi.String("\"org1\".\"account1\".\"primary_db_name\""),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = snowflake.NewDatabase(ctx, "fromShare", &snowflake.DatabaseArgs{
//				Comment: pulumi.String("test comment"),
//				FromShare: pulumi.StringMap{
//					"provider": pulumi.String("org1.account1"),
//					"share":    pulumi.String("share1"),
//				},
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
// ```sh
// $ pulumi import snowflake:index/database:Database example name
// ```
type Database struct {
	pulumi.CustomResourceState

	Comment pulumi.StringPtrOutput `pulumi:"comment"`
	// Number of days for which Snowflake retains historical data for performing Time Travel actions (SELECT, CLONE, UNDROP) on the object. A value of 0 effectively disables Time Travel for the specified database. Default value for this field is set to -1, which is a fallback to use Snowflake default. For more information, see Understanding & Using Time Travel.
	DataRetentionTimeInDays pulumi.IntPtrOutput `pulumi:"dataRetentionTimeInDays"`
	// Specify a database to create a clone from.
	FromDatabase pulumi.StringPtrOutput `pulumi:"fromDatabase"`
	// Specify a fully-qualified path to a database to create a replica from. A fully qualified path follows the format of "\n\n"."\n\n"."\n\n". An example would be: "myorg1"."account1"."db1"
	FromReplica pulumi.StringPtrOutput `pulumi:"fromReplica"`
	// Specify a provider and a share in this map to create a database from a share.
	FromShare pulumi.StringMapOutput `pulumi:"fromShare"`
	// Specifies a database as transient. Transient databases do not have a Fail-safe period so they do not incur additional storage costs once they leave Time Travel; however, this means they are also not protected by Fail-safe in the event of a data loss.
	IsTransient pulumi.BoolPtrOutput `pulumi:"isTransient"`
	Name        pulumi.StringOutput  `pulumi:"name"`
	// When set, specifies the configurations for database replication.
	ReplicationConfiguration DatabaseReplicationConfigurationPtrOutput `pulumi:"replicationConfiguration"`
}

// NewDatabase registers a new resource with the given unique name, arguments, and options.
func NewDatabase(ctx *pulumi.Context,
	name string, args *DatabaseArgs, opts ...pulumi.ResourceOption) (*Database, error) {
	if args == nil {
		args = &DatabaseArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Database
	err := ctx.RegisterResource("snowflake:index/database:Database", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDatabase gets an existing Database resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDatabase(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DatabaseState, opts ...pulumi.ResourceOption) (*Database, error) {
	var resource Database
	err := ctx.ReadResource("snowflake:index/database:Database", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Database resources.
type databaseState struct {
	Comment *string `pulumi:"comment"`
	// Number of days for which Snowflake retains historical data for performing Time Travel actions (SELECT, CLONE, UNDROP) on the object. A value of 0 effectively disables Time Travel for the specified database. Default value for this field is set to -1, which is a fallback to use Snowflake default. For more information, see Understanding & Using Time Travel.
	DataRetentionTimeInDays *int `pulumi:"dataRetentionTimeInDays"`
	// Specify a database to create a clone from.
	FromDatabase *string `pulumi:"fromDatabase"`
	// Specify a fully-qualified path to a database to create a replica from. A fully qualified path follows the format of "\n\n"."\n\n"."\n\n". An example would be: "myorg1"."account1"."db1"
	FromReplica *string `pulumi:"fromReplica"`
	// Specify a provider and a share in this map to create a database from a share.
	FromShare map[string]string `pulumi:"fromShare"`
	// Specifies a database as transient. Transient databases do not have a Fail-safe period so they do not incur additional storage costs once they leave Time Travel; however, this means they are also not protected by Fail-safe in the event of a data loss.
	IsTransient *bool   `pulumi:"isTransient"`
	Name        *string `pulumi:"name"`
	// When set, specifies the configurations for database replication.
	ReplicationConfiguration *DatabaseReplicationConfiguration `pulumi:"replicationConfiguration"`
}

type DatabaseState struct {
	Comment pulumi.StringPtrInput
	// Number of days for which Snowflake retains historical data for performing Time Travel actions (SELECT, CLONE, UNDROP) on the object. A value of 0 effectively disables Time Travel for the specified database. Default value for this field is set to -1, which is a fallback to use Snowflake default. For more information, see Understanding & Using Time Travel.
	DataRetentionTimeInDays pulumi.IntPtrInput
	// Specify a database to create a clone from.
	FromDatabase pulumi.StringPtrInput
	// Specify a fully-qualified path to a database to create a replica from. A fully qualified path follows the format of "\n\n"."\n\n"."\n\n". An example would be: "myorg1"."account1"."db1"
	FromReplica pulumi.StringPtrInput
	// Specify a provider and a share in this map to create a database from a share.
	FromShare pulumi.StringMapInput
	// Specifies a database as transient. Transient databases do not have a Fail-safe period so they do not incur additional storage costs once they leave Time Travel; however, this means they are also not protected by Fail-safe in the event of a data loss.
	IsTransient pulumi.BoolPtrInput
	Name        pulumi.StringPtrInput
	// When set, specifies the configurations for database replication.
	ReplicationConfiguration DatabaseReplicationConfigurationPtrInput
}

func (DatabaseState) ElementType() reflect.Type {
	return reflect.TypeOf((*databaseState)(nil)).Elem()
}

type databaseArgs struct {
	Comment *string `pulumi:"comment"`
	// Number of days for which Snowflake retains historical data for performing Time Travel actions (SELECT, CLONE, UNDROP) on the object. A value of 0 effectively disables Time Travel for the specified database. Default value for this field is set to -1, which is a fallback to use Snowflake default. For more information, see Understanding & Using Time Travel.
	DataRetentionTimeInDays *int `pulumi:"dataRetentionTimeInDays"`
	// Specify a database to create a clone from.
	FromDatabase *string `pulumi:"fromDatabase"`
	// Specify a fully-qualified path to a database to create a replica from. A fully qualified path follows the format of "\n\n"."\n\n"."\n\n". An example would be: "myorg1"."account1"."db1"
	FromReplica *string `pulumi:"fromReplica"`
	// Specify a provider and a share in this map to create a database from a share.
	FromShare map[string]string `pulumi:"fromShare"`
	// Specifies a database as transient. Transient databases do not have a Fail-safe period so they do not incur additional storage costs once they leave Time Travel; however, this means they are also not protected by Fail-safe in the event of a data loss.
	IsTransient *bool   `pulumi:"isTransient"`
	Name        *string `pulumi:"name"`
	// When set, specifies the configurations for database replication.
	ReplicationConfiguration *DatabaseReplicationConfiguration `pulumi:"replicationConfiguration"`
}

// The set of arguments for constructing a Database resource.
type DatabaseArgs struct {
	Comment pulumi.StringPtrInput
	// Number of days for which Snowflake retains historical data for performing Time Travel actions (SELECT, CLONE, UNDROP) on the object. A value of 0 effectively disables Time Travel for the specified database. Default value for this field is set to -1, which is a fallback to use Snowflake default. For more information, see Understanding & Using Time Travel.
	DataRetentionTimeInDays pulumi.IntPtrInput
	// Specify a database to create a clone from.
	FromDatabase pulumi.StringPtrInput
	// Specify a fully-qualified path to a database to create a replica from. A fully qualified path follows the format of "\n\n"."\n\n"."\n\n". An example would be: "myorg1"."account1"."db1"
	FromReplica pulumi.StringPtrInput
	// Specify a provider and a share in this map to create a database from a share.
	FromShare pulumi.StringMapInput
	// Specifies a database as transient. Transient databases do not have a Fail-safe period so they do not incur additional storage costs once they leave Time Travel; however, this means they are also not protected by Fail-safe in the event of a data loss.
	IsTransient pulumi.BoolPtrInput
	Name        pulumi.StringPtrInput
	// When set, specifies the configurations for database replication.
	ReplicationConfiguration DatabaseReplicationConfigurationPtrInput
}

func (DatabaseArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*databaseArgs)(nil)).Elem()
}

type DatabaseInput interface {
	pulumi.Input

	ToDatabaseOutput() DatabaseOutput
	ToDatabaseOutputWithContext(ctx context.Context) DatabaseOutput
}

func (*Database) ElementType() reflect.Type {
	return reflect.TypeOf((**Database)(nil)).Elem()
}

func (i *Database) ToDatabaseOutput() DatabaseOutput {
	return i.ToDatabaseOutputWithContext(context.Background())
}

func (i *Database) ToDatabaseOutputWithContext(ctx context.Context) DatabaseOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DatabaseOutput)
}

// DatabaseArrayInput is an input type that accepts DatabaseArray and DatabaseArrayOutput values.
// You can construct a concrete instance of `DatabaseArrayInput` via:
//
//	DatabaseArray{ DatabaseArgs{...} }
type DatabaseArrayInput interface {
	pulumi.Input

	ToDatabaseArrayOutput() DatabaseArrayOutput
	ToDatabaseArrayOutputWithContext(context.Context) DatabaseArrayOutput
}

type DatabaseArray []DatabaseInput

func (DatabaseArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Database)(nil)).Elem()
}

func (i DatabaseArray) ToDatabaseArrayOutput() DatabaseArrayOutput {
	return i.ToDatabaseArrayOutputWithContext(context.Background())
}

func (i DatabaseArray) ToDatabaseArrayOutputWithContext(ctx context.Context) DatabaseArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DatabaseArrayOutput)
}

// DatabaseMapInput is an input type that accepts DatabaseMap and DatabaseMapOutput values.
// You can construct a concrete instance of `DatabaseMapInput` via:
//
//	DatabaseMap{ "key": DatabaseArgs{...} }
type DatabaseMapInput interface {
	pulumi.Input

	ToDatabaseMapOutput() DatabaseMapOutput
	ToDatabaseMapOutputWithContext(context.Context) DatabaseMapOutput
}

type DatabaseMap map[string]DatabaseInput

func (DatabaseMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Database)(nil)).Elem()
}

func (i DatabaseMap) ToDatabaseMapOutput() DatabaseMapOutput {
	return i.ToDatabaseMapOutputWithContext(context.Background())
}

func (i DatabaseMap) ToDatabaseMapOutputWithContext(ctx context.Context) DatabaseMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DatabaseMapOutput)
}

type DatabaseOutput struct{ *pulumi.OutputState }

func (DatabaseOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Database)(nil)).Elem()
}

func (o DatabaseOutput) ToDatabaseOutput() DatabaseOutput {
	return o
}

func (o DatabaseOutput) ToDatabaseOutputWithContext(ctx context.Context) DatabaseOutput {
	return o
}

func (o DatabaseOutput) Comment() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Database) pulumi.StringPtrOutput { return v.Comment }).(pulumi.StringPtrOutput)
}

// Number of days for which Snowflake retains historical data for performing Time Travel actions (SELECT, CLONE, UNDROP) on the object. A value of 0 effectively disables Time Travel for the specified database. Default value for this field is set to -1, which is a fallback to use Snowflake default. For more information, see Understanding & Using Time Travel.
func (o DatabaseOutput) DataRetentionTimeInDays() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Database) pulumi.IntPtrOutput { return v.DataRetentionTimeInDays }).(pulumi.IntPtrOutput)
}

// Specify a database to create a clone from.
func (o DatabaseOutput) FromDatabase() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Database) pulumi.StringPtrOutput { return v.FromDatabase }).(pulumi.StringPtrOutput)
}

// Specify a fully-qualified path to a database to create a replica from. A fully qualified path follows the format of "\n\n"."\n\n"."\n\n". An example would be: "myorg1"."account1"."db1"
func (o DatabaseOutput) FromReplica() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Database) pulumi.StringPtrOutput { return v.FromReplica }).(pulumi.StringPtrOutput)
}

// Specify a provider and a share in this map to create a database from a share.
func (o DatabaseOutput) FromShare() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Database) pulumi.StringMapOutput { return v.FromShare }).(pulumi.StringMapOutput)
}

// Specifies a database as transient. Transient databases do not have a Fail-safe period so they do not incur additional storage costs once they leave Time Travel; however, this means they are also not protected by Fail-safe in the event of a data loss.
func (o DatabaseOutput) IsTransient() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Database) pulumi.BoolPtrOutput { return v.IsTransient }).(pulumi.BoolPtrOutput)
}

func (o DatabaseOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Database) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// When set, specifies the configurations for database replication.
func (o DatabaseOutput) ReplicationConfiguration() DatabaseReplicationConfigurationPtrOutput {
	return o.ApplyT(func(v *Database) DatabaseReplicationConfigurationPtrOutput { return v.ReplicationConfiguration }).(DatabaseReplicationConfigurationPtrOutput)
}

type DatabaseArrayOutput struct{ *pulumi.OutputState }

func (DatabaseArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Database)(nil)).Elem()
}

func (o DatabaseArrayOutput) ToDatabaseArrayOutput() DatabaseArrayOutput {
	return o
}

func (o DatabaseArrayOutput) ToDatabaseArrayOutputWithContext(ctx context.Context) DatabaseArrayOutput {
	return o
}

func (o DatabaseArrayOutput) Index(i pulumi.IntInput) DatabaseOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Database {
		return vs[0].([]*Database)[vs[1].(int)]
	}).(DatabaseOutput)
}

type DatabaseMapOutput struct{ *pulumi.OutputState }

func (DatabaseMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Database)(nil)).Elem()
}

func (o DatabaseMapOutput) ToDatabaseMapOutput() DatabaseMapOutput {
	return o
}

func (o DatabaseMapOutput) ToDatabaseMapOutputWithContext(ctx context.Context) DatabaseMapOutput {
	return o
}

func (o DatabaseMapOutput) MapIndex(k pulumi.StringInput) DatabaseOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Database {
		return vs[0].(map[string]*Database)[vs[1].(string)]
	}).(DatabaseOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DatabaseInput)(nil)).Elem(), &Database{})
	pulumi.RegisterInputType(reflect.TypeOf((*DatabaseArrayInput)(nil)).Elem(), DatabaseArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DatabaseMapInput)(nil)).Elem(), DatabaseMap{})
	pulumi.RegisterOutputType(DatabaseOutput{})
	pulumi.RegisterOutputType(DatabaseArrayOutput{})
	pulumi.RegisterOutputType(DatabaseMapOutput{})
}
