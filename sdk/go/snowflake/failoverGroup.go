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
//			db, err := snowflake.NewDatabase(ctx, "db", nil)
//			if err != nil {
//				return err
//			}
//			_, err = snowflake.NewFailoverGroup(ctx, "sourceFailoverGroup", &snowflake.FailoverGroupArgs{
//				ObjectTypes: pulumi.StringArray{
//					pulumi.String("WAREHOUSES"),
//					pulumi.String("DATABASES"),
//					pulumi.String("INTEGRATIONS"),
//					pulumi.String("ROLES"),
//				},
//				AllowedAccounts: pulumi.StringArray{
//					pulumi.String("<org_name>.<target_account_name1>"),
//					pulumi.String("<org_name>.<target_account_name2>"),
//				},
//				AllowedDatabases: pulumi.StringArray{
//					db.Name,
//				},
//				AllowedIntegrationTypes: pulumi.StringArray{
//					pulumi.String("SECURITY INTEGRATIONS"),
//				},
//				ReplicationSchedule: &snowflake.FailoverGroupReplicationScheduleArgs{
//					Cron: &snowflake.FailoverGroupReplicationScheduleCronArgs{
//						Expression: pulumi.String("0 0 10-20 * TUE,THU"),
//						TimeZone:   pulumi.String("UTC"),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = snowflake.NewProvider(ctx, "account2", nil)
//			if err != nil {
//				return err
//			}
//			_, err = snowflake.NewFailoverGroup(ctx, "targetFailoverGroup", &snowflake.FailoverGroupArgs{
//				FromReplica: &snowflake.FailoverGroupFromReplicaArgs{
//					OrganizationName:  pulumi.String("..."),
//					SourceAccountName: pulumi.String("..."),
//					Name:              pulumi.Any(snowflake_failover_group.Fg.Name),
//				},
//			}, pulumi.Provider(snowflake.Account2))
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
// $ pulumi import snowflake:index/failoverGroup:FailoverGroup example 'fg1'
// ```
type FailoverGroup struct {
	pulumi.CustomResourceState

	// Specifies the target account or list of target accounts to which replication and failover of specified objects from the source account is enabled. Secondary failover groups in the target accounts in this list can be promoted to serve as the primary failover group in case of failover. Expected in the form \n\n.\n\n
	AllowedAccounts pulumi.StringArrayOutput `pulumi:"allowedAccounts"`
	// Specifies the database or list of databases for which you are enabling replication and failover from the source account to the target account. The OBJECT_TYPES list must include DATABASES to set this parameter.
	AllowedDatabases pulumi.StringArrayOutput `pulumi:"allowedDatabases"`
	// Type(s) of integrations for which you are enabling replication and failover from the source account to the target account. This property requires that the OBJECT_TYPES list include INTEGRATIONS to set this parameter. The following integration types are supported: "SECURITY INTEGRATIONS", "API INTEGRATIONS"
	AllowedIntegrationTypes pulumi.StringArrayOutput `pulumi:"allowedIntegrationTypes"`
	// Specifies the share or list of shares for which you are enabling replication and failover from the source account to the target account. The OBJECT_TYPES list must include SHARES to set this parameter.
	AllowedShares pulumi.StringArrayOutput `pulumi:"allowedShares"`
	// Specifies the name of the replica to use as the source for the failover group.
	FromReplica FailoverGroupFromReplicaPtrOutput `pulumi:"fromReplica"`
	// Allows replicating objects to accounts on lower editions.
	IgnoreEditionCheck pulumi.BoolPtrOutput `pulumi:"ignoreEditionCheck"`
	// Identifier for the primary failover group in the source account.
	Name pulumi.StringOutput `pulumi:"name"`
	// Type(s) of objects for which you are enabling replication and failover from the source account to the target account. The following object types are supported: "ACCOUNT PARAMETERS", "DATABASES", "INTEGRATIONS", "NETWORK POLICIES", "RESOURCE MONITORS", "ROLES", "SHARES", "USERS", "WAREHOUSES"
	ObjectTypes pulumi.StringArrayOutput `pulumi:"objectTypes"`
	// Specifies the schedule for refreshing secondary failover groups.
	ReplicationSchedule FailoverGroupReplicationSchedulePtrOutput `pulumi:"replicationSchedule"`
}

// NewFailoverGroup registers a new resource with the given unique name, arguments, and options.
func NewFailoverGroup(ctx *pulumi.Context,
	name string, args *FailoverGroupArgs, opts ...pulumi.ResourceOption) (*FailoverGroup, error) {
	if args == nil {
		args = &FailoverGroupArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource FailoverGroup
	err := ctx.RegisterResource("snowflake:index/failoverGroup:FailoverGroup", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetFailoverGroup gets an existing FailoverGroup resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetFailoverGroup(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *FailoverGroupState, opts ...pulumi.ResourceOption) (*FailoverGroup, error) {
	var resource FailoverGroup
	err := ctx.ReadResource("snowflake:index/failoverGroup:FailoverGroup", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering FailoverGroup resources.
type failoverGroupState struct {
	// Specifies the target account or list of target accounts to which replication and failover of specified objects from the source account is enabled. Secondary failover groups in the target accounts in this list can be promoted to serve as the primary failover group in case of failover. Expected in the form \n\n.\n\n
	AllowedAccounts []string `pulumi:"allowedAccounts"`
	// Specifies the database or list of databases for which you are enabling replication and failover from the source account to the target account. The OBJECT_TYPES list must include DATABASES to set this parameter.
	AllowedDatabases []string `pulumi:"allowedDatabases"`
	// Type(s) of integrations for which you are enabling replication and failover from the source account to the target account. This property requires that the OBJECT_TYPES list include INTEGRATIONS to set this parameter. The following integration types are supported: "SECURITY INTEGRATIONS", "API INTEGRATIONS"
	AllowedIntegrationTypes []string `pulumi:"allowedIntegrationTypes"`
	// Specifies the share or list of shares for which you are enabling replication and failover from the source account to the target account. The OBJECT_TYPES list must include SHARES to set this parameter.
	AllowedShares []string `pulumi:"allowedShares"`
	// Specifies the name of the replica to use as the source for the failover group.
	FromReplica *FailoverGroupFromReplica `pulumi:"fromReplica"`
	// Allows replicating objects to accounts on lower editions.
	IgnoreEditionCheck *bool `pulumi:"ignoreEditionCheck"`
	// Identifier for the primary failover group in the source account.
	Name *string `pulumi:"name"`
	// Type(s) of objects for which you are enabling replication and failover from the source account to the target account. The following object types are supported: "ACCOUNT PARAMETERS", "DATABASES", "INTEGRATIONS", "NETWORK POLICIES", "RESOURCE MONITORS", "ROLES", "SHARES", "USERS", "WAREHOUSES"
	ObjectTypes []string `pulumi:"objectTypes"`
	// Specifies the schedule for refreshing secondary failover groups.
	ReplicationSchedule *FailoverGroupReplicationSchedule `pulumi:"replicationSchedule"`
}

type FailoverGroupState struct {
	// Specifies the target account or list of target accounts to which replication and failover of specified objects from the source account is enabled. Secondary failover groups in the target accounts in this list can be promoted to serve as the primary failover group in case of failover. Expected in the form \n\n.\n\n
	AllowedAccounts pulumi.StringArrayInput
	// Specifies the database or list of databases for which you are enabling replication and failover from the source account to the target account. The OBJECT_TYPES list must include DATABASES to set this parameter.
	AllowedDatabases pulumi.StringArrayInput
	// Type(s) of integrations for which you are enabling replication and failover from the source account to the target account. This property requires that the OBJECT_TYPES list include INTEGRATIONS to set this parameter. The following integration types are supported: "SECURITY INTEGRATIONS", "API INTEGRATIONS"
	AllowedIntegrationTypes pulumi.StringArrayInput
	// Specifies the share or list of shares for which you are enabling replication and failover from the source account to the target account. The OBJECT_TYPES list must include SHARES to set this parameter.
	AllowedShares pulumi.StringArrayInput
	// Specifies the name of the replica to use as the source for the failover group.
	FromReplica FailoverGroupFromReplicaPtrInput
	// Allows replicating objects to accounts on lower editions.
	IgnoreEditionCheck pulumi.BoolPtrInput
	// Identifier for the primary failover group in the source account.
	Name pulumi.StringPtrInput
	// Type(s) of objects for which you are enabling replication and failover from the source account to the target account. The following object types are supported: "ACCOUNT PARAMETERS", "DATABASES", "INTEGRATIONS", "NETWORK POLICIES", "RESOURCE MONITORS", "ROLES", "SHARES", "USERS", "WAREHOUSES"
	ObjectTypes pulumi.StringArrayInput
	// Specifies the schedule for refreshing secondary failover groups.
	ReplicationSchedule FailoverGroupReplicationSchedulePtrInput
}

func (FailoverGroupState) ElementType() reflect.Type {
	return reflect.TypeOf((*failoverGroupState)(nil)).Elem()
}

type failoverGroupArgs struct {
	// Specifies the target account or list of target accounts to which replication and failover of specified objects from the source account is enabled. Secondary failover groups in the target accounts in this list can be promoted to serve as the primary failover group in case of failover. Expected in the form \n\n.\n\n
	AllowedAccounts []string `pulumi:"allowedAccounts"`
	// Specifies the database or list of databases for which you are enabling replication and failover from the source account to the target account. The OBJECT_TYPES list must include DATABASES to set this parameter.
	AllowedDatabases []string `pulumi:"allowedDatabases"`
	// Type(s) of integrations for which you are enabling replication and failover from the source account to the target account. This property requires that the OBJECT_TYPES list include INTEGRATIONS to set this parameter. The following integration types are supported: "SECURITY INTEGRATIONS", "API INTEGRATIONS"
	AllowedIntegrationTypes []string `pulumi:"allowedIntegrationTypes"`
	// Specifies the share or list of shares for which you are enabling replication and failover from the source account to the target account. The OBJECT_TYPES list must include SHARES to set this parameter.
	AllowedShares []string `pulumi:"allowedShares"`
	// Specifies the name of the replica to use as the source for the failover group.
	FromReplica *FailoverGroupFromReplica `pulumi:"fromReplica"`
	// Allows replicating objects to accounts on lower editions.
	IgnoreEditionCheck *bool `pulumi:"ignoreEditionCheck"`
	// Identifier for the primary failover group in the source account.
	Name *string `pulumi:"name"`
	// Type(s) of objects for which you are enabling replication and failover from the source account to the target account. The following object types are supported: "ACCOUNT PARAMETERS", "DATABASES", "INTEGRATIONS", "NETWORK POLICIES", "RESOURCE MONITORS", "ROLES", "SHARES", "USERS", "WAREHOUSES"
	ObjectTypes []string `pulumi:"objectTypes"`
	// Specifies the schedule for refreshing secondary failover groups.
	ReplicationSchedule *FailoverGroupReplicationSchedule `pulumi:"replicationSchedule"`
}

// The set of arguments for constructing a FailoverGroup resource.
type FailoverGroupArgs struct {
	// Specifies the target account or list of target accounts to which replication and failover of specified objects from the source account is enabled. Secondary failover groups in the target accounts in this list can be promoted to serve as the primary failover group in case of failover. Expected in the form \n\n.\n\n
	AllowedAccounts pulumi.StringArrayInput
	// Specifies the database or list of databases for which you are enabling replication and failover from the source account to the target account. The OBJECT_TYPES list must include DATABASES to set this parameter.
	AllowedDatabases pulumi.StringArrayInput
	// Type(s) of integrations for which you are enabling replication and failover from the source account to the target account. This property requires that the OBJECT_TYPES list include INTEGRATIONS to set this parameter. The following integration types are supported: "SECURITY INTEGRATIONS", "API INTEGRATIONS"
	AllowedIntegrationTypes pulumi.StringArrayInput
	// Specifies the share or list of shares for which you are enabling replication and failover from the source account to the target account. The OBJECT_TYPES list must include SHARES to set this parameter.
	AllowedShares pulumi.StringArrayInput
	// Specifies the name of the replica to use as the source for the failover group.
	FromReplica FailoverGroupFromReplicaPtrInput
	// Allows replicating objects to accounts on lower editions.
	IgnoreEditionCheck pulumi.BoolPtrInput
	// Identifier for the primary failover group in the source account.
	Name pulumi.StringPtrInput
	// Type(s) of objects for which you are enabling replication and failover from the source account to the target account. The following object types are supported: "ACCOUNT PARAMETERS", "DATABASES", "INTEGRATIONS", "NETWORK POLICIES", "RESOURCE MONITORS", "ROLES", "SHARES", "USERS", "WAREHOUSES"
	ObjectTypes pulumi.StringArrayInput
	// Specifies the schedule for refreshing secondary failover groups.
	ReplicationSchedule FailoverGroupReplicationSchedulePtrInput
}

func (FailoverGroupArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*failoverGroupArgs)(nil)).Elem()
}

type FailoverGroupInput interface {
	pulumi.Input

	ToFailoverGroupOutput() FailoverGroupOutput
	ToFailoverGroupOutputWithContext(ctx context.Context) FailoverGroupOutput
}

func (*FailoverGroup) ElementType() reflect.Type {
	return reflect.TypeOf((**FailoverGroup)(nil)).Elem()
}

func (i *FailoverGroup) ToFailoverGroupOutput() FailoverGroupOutput {
	return i.ToFailoverGroupOutputWithContext(context.Background())
}

func (i *FailoverGroup) ToFailoverGroupOutputWithContext(ctx context.Context) FailoverGroupOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FailoverGroupOutput)
}

// FailoverGroupArrayInput is an input type that accepts FailoverGroupArray and FailoverGroupArrayOutput values.
// You can construct a concrete instance of `FailoverGroupArrayInput` via:
//
//	FailoverGroupArray{ FailoverGroupArgs{...} }
type FailoverGroupArrayInput interface {
	pulumi.Input

	ToFailoverGroupArrayOutput() FailoverGroupArrayOutput
	ToFailoverGroupArrayOutputWithContext(context.Context) FailoverGroupArrayOutput
}

type FailoverGroupArray []FailoverGroupInput

func (FailoverGroupArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*FailoverGroup)(nil)).Elem()
}

func (i FailoverGroupArray) ToFailoverGroupArrayOutput() FailoverGroupArrayOutput {
	return i.ToFailoverGroupArrayOutputWithContext(context.Background())
}

func (i FailoverGroupArray) ToFailoverGroupArrayOutputWithContext(ctx context.Context) FailoverGroupArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FailoverGroupArrayOutput)
}

// FailoverGroupMapInput is an input type that accepts FailoverGroupMap and FailoverGroupMapOutput values.
// You can construct a concrete instance of `FailoverGroupMapInput` via:
//
//	FailoverGroupMap{ "key": FailoverGroupArgs{...} }
type FailoverGroupMapInput interface {
	pulumi.Input

	ToFailoverGroupMapOutput() FailoverGroupMapOutput
	ToFailoverGroupMapOutputWithContext(context.Context) FailoverGroupMapOutput
}

type FailoverGroupMap map[string]FailoverGroupInput

func (FailoverGroupMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*FailoverGroup)(nil)).Elem()
}

func (i FailoverGroupMap) ToFailoverGroupMapOutput() FailoverGroupMapOutput {
	return i.ToFailoverGroupMapOutputWithContext(context.Background())
}

func (i FailoverGroupMap) ToFailoverGroupMapOutputWithContext(ctx context.Context) FailoverGroupMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FailoverGroupMapOutput)
}

type FailoverGroupOutput struct{ *pulumi.OutputState }

func (FailoverGroupOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**FailoverGroup)(nil)).Elem()
}

func (o FailoverGroupOutput) ToFailoverGroupOutput() FailoverGroupOutput {
	return o
}

func (o FailoverGroupOutput) ToFailoverGroupOutputWithContext(ctx context.Context) FailoverGroupOutput {
	return o
}

// Specifies the target account or list of target accounts to which replication and failover of specified objects from the source account is enabled. Secondary failover groups in the target accounts in this list can be promoted to serve as the primary failover group in case of failover. Expected in the form \n\n.\n\n
func (o FailoverGroupOutput) AllowedAccounts() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *FailoverGroup) pulumi.StringArrayOutput { return v.AllowedAccounts }).(pulumi.StringArrayOutput)
}

// Specifies the database or list of databases for which you are enabling replication and failover from the source account to the target account. The OBJECT_TYPES list must include DATABASES to set this parameter.
func (o FailoverGroupOutput) AllowedDatabases() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *FailoverGroup) pulumi.StringArrayOutput { return v.AllowedDatabases }).(pulumi.StringArrayOutput)
}

// Type(s) of integrations for which you are enabling replication and failover from the source account to the target account. This property requires that the OBJECT_TYPES list include INTEGRATIONS to set this parameter. The following integration types are supported: "SECURITY INTEGRATIONS", "API INTEGRATIONS"
func (o FailoverGroupOutput) AllowedIntegrationTypes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *FailoverGroup) pulumi.StringArrayOutput { return v.AllowedIntegrationTypes }).(pulumi.StringArrayOutput)
}

// Specifies the share or list of shares for which you are enabling replication and failover from the source account to the target account. The OBJECT_TYPES list must include SHARES to set this parameter.
func (o FailoverGroupOutput) AllowedShares() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *FailoverGroup) pulumi.StringArrayOutput { return v.AllowedShares }).(pulumi.StringArrayOutput)
}

// Specifies the name of the replica to use as the source for the failover group.
func (o FailoverGroupOutput) FromReplica() FailoverGroupFromReplicaPtrOutput {
	return o.ApplyT(func(v *FailoverGroup) FailoverGroupFromReplicaPtrOutput { return v.FromReplica }).(FailoverGroupFromReplicaPtrOutput)
}

// Allows replicating objects to accounts on lower editions.
func (o FailoverGroupOutput) IgnoreEditionCheck() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *FailoverGroup) pulumi.BoolPtrOutput { return v.IgnoreEditionCheck }).(pulumi.BoolPtrOutput)
}

// Identifier for the primary failover group in the source account.
func (o FailoverGroupOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *FailoverGroup) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Type(s) of objects for which you are enabling replication and failover from the source account to the target account. The following object types are supported: "ACCOUNT PARAMETERS", "DATABASES", "INTEGRATIONS", "NETWORK POLICIES", "RESOURCE MONITORS", "ROLES", "SHARES", "USERS", "WAREHOUSES"
func (o FailoverGroupOutput) ObjectTypes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *FailoverGroup) pulumi.StringArrayOutput { return v.ObjectTypes }).(pulumi.StringArrayOutput)
}

// Specifies the schedule for refreshing secondary failover groups.
func (o FailoverGroupOutput) ReplicationSchedule() FailoverGroupReplicationSchedulePtrOutput {
	return o.ApplyT(func(v *FailoverGroup) FailoverGroupReplicationSchedulePtrOutput { return v.ReplicationSchedule }).(FailoverGroupReplicationSchedulePtrOutput)
}

type FailoverGroupArrayOutput struct{ *pulumi.OutputState }

func (FailoverGroupArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*FailoverGroup)(nil)).Elem()
}

func (o FailoverGroupArrayOutput) ToFailoverGroupArrayOutput() FailoverGroupArrayOutput {
	return o
}

func (o FailoverGroupArrayOutput) ToFailoverGroupArrayOutputWithContext(ctx context.Context) FailoverGroupArrayOutput {
	return o
}

func (o FailoverGroupArrayOutput) Index(i pulumi.IntInput) FailoverGroupOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *FailoverGroup {
		return vs[0].([]*FailoverGroup)[vs[1].(int)]
	}).(FailoverGroupOutput)
}

type FailoverGroupMapOutput struct{ *pulumi.OutputState }

func (FailoverGroupMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*FailoverGroup)(nil)).Elem()
}

func (o FailoverGroupMapOutput) ToFailoverGroupMapOutput() FailoverGroupMapOutput {
	return o
}

func (o FailoverGroupMapOutput) ToFailoverGroupMapOutputWithContext(ctx context.Context) FailoverGroupMapOutput {
	return o
}

func (o FailoverGroupMapOutput) MapIndex(k pulumi.StringInput) FailoverGroupOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *FailoverGroup {
		return vs[0].(map[string]*FailoverGroup)[vs[1].(string)]
	}).(FailoverGroupOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*FailoverGroupInput)(nil)).Elem(), &FailoverGroup{})
	pulumi.RegisterInputType(reflect.TypeOf((*FailoverGroupArrayInput)(nil)).Elem(), FailoverGroupArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*FailoverGroupMapInput)(nil)).Elem(), FailoverGroupMap{})
	pulumi.RegisterOutputType(FailoverGroupOutput{})
	pulumi.RegisterOutputType(FailoverGroupArrayOutput{})
	pulumi.RegisterOutputType(FailoverGroupMapOutput{})
}
