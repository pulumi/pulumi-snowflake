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

// ## Import
//
// ```sh
//
//	$ pulumi import snowflake:index/storageIntegration:StorageIntegration example name
//
// ```
type StorageIntegration struct {
	pulumi.CustomResourceState

	// The consent URL that is used to create an Azure Snowflake service principle inside your tenant.
	AzureConsentUrl pulumi.StringOutput `pulumi:"azureConsentUrl"`
	// This is the name of the Snowflake client application created for your account.
	AzureMultiTenantAppName pulumi.StringOutput    `pulumi:"azureMultiTenantAppName"`
	AzureTenantId           pulumi.StringPtrOutput `pulumi:"azureTenantId"`
	Comment                 pulumi.StringPtrOutput `pulumi:"comment"`
	// Date and time when the storage integration was created.
	CreatedOn pulumi.StringOutput  `pulumi:"createdOn"`
	Enabled   pulumi.BoolPtrOutput `pulumi:"enabled"`
	Name      pulumi.StringOutput  `pulumi:"name"`
	// Explicitly limits external stages that use the integration to reference one or more storage locations.
	StorageAllowedLocations pulumi.StringArrayOutput `pulumi:"storageAllowedLocations"`
	// The external ID that Snowflake will use when assuming the AWS role.
	StorageAwsExternalId pulumi.StringOutput `pulumi:"storageAwsExternalId"`
	// The Snowflake user that will attempt to assume the AWS role.
	StorageAwsIamUserArn pulumi.StringOutput `pulumi:"storageAwsIamUserArn"`
	// "bucket-owner-full-control" Enables support for AWS access control lists (ACLs) to grant the bucket owner full control.
	StorageAwsObjectAcl pulumi.StringPtrOutput `pulumi:"storageAwsObjectAcl"`
	StorageAwsRoleArn   pulumi.StringPtrOutput `pulumi:"storageAwsRoleArn"`
	// Explicitly prohibits external stages that use the integration from referencing one or more storage locations.
	StorageBlockedLocations pulumi.StringArrayOutput `pulumi:"storageBlockedLocations"`
	// This is the name of the Snowflake Google Service Account created for your account.
	StorageGcpServiceAccount pulumi.StringOutput    `pulumi:"storageGcpServiceAccount"`
	StorageProvider          pulumi.StringOutput    `pulumi:"storageProvider"`
	Type                     pulumi.StringPtrOutput `pulumi:"type"`
}

// NewStorageIntegration registers a new resource with the given unique name, arguments, and options.
func NewStorageIntegration(ctx *pulumi.Context,
	name string, args *StorageIntegrationArgs, opts ...pulumi.ResourceOption) (*StorageIntegration, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.StorageAllowedLocations == nil {
		return nil, errors.New("invalid value for required argument 'StorageAllowedLocations'")
	}
	if args.StorageProvider == nil {
		return nil, errors.New("invalid value for required argument 'StorageProvider'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource StorageIntegration
	err := ctx.RegisterResource("snowflake:index/storageIntegration:StorageIntegration", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetStorageIntegration gets an existing StorageIntegration resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetStorageIntegration(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *StorageIntegrationState, opts ...pulumi.ResourceOption) (*StorageIntegration, error) {
	var resource StorageIntegration
	err := ctx.ReadResource("snowflake:index/storageIntegration:StorageIntegration", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering StorageIntegration resources.
type storageIntegrationState struct {
	// The consent URL that is used to create an Azure Snowflake service principle inside your tenant.
	AzureConsentUrl *string `pulumi:"azureConsentUrl"`
	// This is the name of the Snowflake client application created for your account.
	AzureMultiTenantAppName *string `pulumi:"azureMultiTenantAppName"`
	AzureTenantId           *string `pulumi:"azureTenantId"`
	Comment                 *string `pulumi:"comment"`
	// Date and time when the storage integration was created.
	CreatedOn *string `pulumi:"createdOn"`
	Enabled   *bool   `pulumi:"enabled"`
	Name      *string `pulumi:"name"`
	// Explicitly limits external stages that use the integration to reference one or more storage locations.
	StorageAllowedLocations []string `pulumi:"storageAllowedLocations"`
	// The external ID that Snowflake will use when assuming the AWS role.
	StorageAwsExternalId *string `pulumi:"storageAwsExternalId"`
	// The Snowflake user that will attempt to assume the AWS role.
	StorageAwsIamUserArn *string `pulumi:"storageAwsIamUserArn"`
	// "bucket-owner-full-control" Enables support for AWS access control lists (ACLs) to grant the bucket owner full control.
	StorageAwsObjectAcl *string `pulumi:"storageAwsObjectAcl"`
	StorageAwsRoleArn   *string `pulumi:"storageAwsRoleArn"`
	// Explicitly prohibits external stages that use the integration from referencing one or more storage locations.
	StorageBlockedLocations []string `pulumi:"storageBlockedLocations"`
	// This is the name of the Snowflake Google Service Account created for your account.
	StorageGcpServiceAccount *string `pulumi:"storageGcpServiceAccount"`
	StorageProvider          *string `pulumi:"storageProvider"`
	Type                     *string `pulumi:"type"`
}

type StorageIntegrationState struct {
	// The consent URL that is used to create an Azure Snowflake service principle inside your tenant.
	AzureConsentUrl pulumi.StringPtrInput
	// This is the name of the Snowflake client application created for your account.
	AzureMultiTenantAppName pulumi.StringPtrInput
	AzureTenantId           pulumi.StringPtrInput
	Comment                 pulumi.StringPtrInput
	// Date and time when the storage integration was created.
	CreatedOn pulumi.StringPtrInput
	Enabled   pulumi.BoolPtrInput
	Name      pulumi.StringPtrInput
	// Explicitly limits external stages that use the integration to reference one or more storage locations.
	StorageAllowedLocations pulumi.StringArrayInput
	// The external ID that Snowflake will use when assuming the AWS role.
	StorageAwsExternalId pulumi.StringPtrInput
	// The Snowflake user that will attempt to assume the AWS role.
	StorageAwsIamUserArn pulumi.StringPtrInput
	// "bucket-owner-full-control" Enables support for AWS access control lists (ACLs) to grant the bucket owner full control.
	StorageAwsObjectAcl pulumi.StringPtrInput
	StorageAwsRoleArn   pulumi.StringPtrInput
	// Explicitly prohibits external stages that use the integration from referencing one or more storage locations.
	StorageBlockedLocations pulumi.StringArrayInput
	// This is the name of the Snowflake Google Service Account created for your account.
	StorageGcpServiceAccount pulumi.StringPtrInput
	StorageProvider          pulumi.StringPtrInput
	Type                     pulumi.StringPtrInput
}

func (StorageIntegrationState) ElementType() reflect.Type {
	return reflect.TypeOf((*storageIntegrationState)(nil)).Elem()
}

type storageIntegrationArgs struct {
	AzureTenantId *string `pulumi:"azureTenantId"`
	Comment       *string `pulumi:"comment"`
	Enabled       *bool   `pulumi:"enabled"`
	Name          *string `pulumi:"name"`
	// Explicitly limits external stages that use the integration to reference one or more storage locations.
	StorageAllowedLocations []string `pulumi:"storageAllowedLocations"`
	// "bucket-owner-full-control" Enables support for AWS access control lists (ACLs) to grant the bucket owner full control.
	StorageAwsObjectAcl *string `pulumi:"storageAwsObjectAcl"`
	StorageAwsRoleArn   *string `pulumi:"storageAwsRoleArn"`
	// Explicitly prohibits external stages that use the integration from referencing one or more storage locations.
	StorageBlockedLocations []string `pulumi:"storageBlockedLocations"`
	StorageProvider         string   `pulumi:"storageProvider"`
	Type                    *string  `pulumi:"type"`
}

// The set of arguments for constructing a StorageIntegration resource.
type StorageIntegrationArgs struct {
	AzureTenantId pulumi.StringPtrInput
	Comment       pulumi.StringPtrInput
	Enabled       pulumi.BoolPtrInput
	Name          pulumi.StringPtrInput
	// Explicitly limits external stages that use the integration to reference one or more storage locations.
	StorageAllowedLocations pulumi.StringArrayInput
	// "bucket-owner-full-control" Enables support for AWS access control lists (ACLs) to grant the bucket owner full control.
	StorageAwsObjectAcl pulumi.StringPtrInput
	StorageAwsRoleArn   pulumi.StringPtrInput
	// Explicitly prohibits external stages that use the integration from referencing one or more storage locations.
	StorageBlockedLocations pulumi.StringArrayInput
	StorageProvider         pulumi.StringInput
	Type                    pulumi.StringPtrInput
}

func (StorageIntegrationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*storageIntegrationArgs)(nil)).Elem()
}

type StorageIntegrationInput interface {
	pulumi.Input

	ToStorageIntegrationOutput() StorageIntegrationOutput
	ToStorageIntegrationOutputWithContext(ctx context.Context) StorageIntegrationOutput
}

func (*StorageIntegration) ElementType() reflect.Type {
	return reflect.TypeOf((**StorageIntegration)(nil)).Elem()
}

func (i *StorageIntegration) ToStorageIntegrationOutput() StorageIntegrationOutput {
	return i.ToStorageIntegrationOutputWithContext(context.Background())
}

func (i *StorageIntegration) ToStorageIntegrationOutputWithContext(ctx context.Context) StorageIntegrationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StorageIntegrationOutput)
}

func (i *StorageIntegration) ToOutput(ctx context.Context) pulumix.Output[*StorageIntegration] {
	return pulumix.Output[*StorageIntegration]{
		OutputState: i.ToStorageIntegrationOutputWithContext(ctx).OutputState,
	}
}

// StorageIntegrationArrayInput is an input type that accepts StorageIntegrationArray and StorageIntegrationArrayOutput values.
// You can construct a concrete instance of `StorageIntegrationArrayInput` via:
//
//	StorageIntegrationArray{ StorageIntegrationArgs{...} }
type StorageIntegrationArrayInput interface {
	pulumi.Input

	ToStorageIntegrationArrayOutput() StorageIntegrationArrayOutput
	ToStorageIntegrationArrayOutputWithContext(context.Context) StorageIntegrationArrayOutput
}

type StorageIntegrationArray []StorageIntegrationInput

func (StorageIntegrationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*StorageIntegration)(nil)).Elem()
}

func (i StorageIntegrationArray) ToStorageIntegrationArrayOutput() StorageIntegrationArrayOutput {
	return i.ToStorageIntegrationArrayOutputWithContext(context.Background())
}

func (i StorageIntegrationArray) ToStorageIntegrationArrayOutputWithContext(ctx context.Context) StorageIntegrationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StorageIntegrationArrayOutput)
}

func (i StorageIntegrationArray) ToOutput(ctx context.Context) pulumix.Output[[]*StorageIntegration] {
	return pulumix.Output[[]*StorageIntegration]{
		OutputState: i.ToStorageIntegrationArrayOutputWithContext(ctx).OutputState,
	}
}

// StorageIntegrationMapInput is an input type that accepts StorageIntegrationMap and StorageIntegrationMapOutput values.
// You can construct a concrete instance of `StorageIntegrationMapInput` via:
//
//	StorageIntegrationMap{ "key": StorageIntegrationArgs{...} }
type StorageIntegrationMapInput interface {
	pulumi.Input

	ToStorageIntegrationMapOutput() StorageIntegrationMapOutput
	ToStorageIntegrationMapOutputWithContext(context.Context) StorageIntegrationMapOutput
}

type StorageIntegrationMap map[string]StorageIntegrationInput

func (StorageIntegrationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*StorageIntegration)(nil)).Elem()
}

func (i StorageIntegrationMap) ToStorageIntegrationMapOutput() StorageIntegrationMapOutput {
	return i.ToStorageIntegrationMapOutputWithContext(context.Background())
}

func (i StorageIntegrationMap) ToStorageIntegrationMapOutputWithContext(ctx context.Context) StorageIntegrationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StorageIntegrationMapOutput)
}

func (i StorageIntegrationMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*StorageIntegration] {
	return pulumix.Output[map[string]*StorageIntegration]{
		OutputState: i.ToStorageIntegrationMapOutputWithContext(ctx).OutputState,
	}
}

type StorageIntegrationOutput struct{ *pulumi.OutputState }

func (StorageIntegrationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**StorageIntegration)(nil)).Elem()
}

func (o StorageIntegrationOutput) ToStorageIntegrationOutput() StorageIntegrationOutput {
	return o
}

func (o StorageIntegrationOutput) ToStorageIntegrationOutputWithContext(ctx context.Context) StorageIntegrationOutput {
	return o
}

func (o StorageIntegrationOutput) ToOutput(ctx context.Context) pulumix.Output[*StorageIntegration] {
	return pulumix.Output[*StorageIntegration]{
		OutputState: o.OutputState,
	}
}

// The consent URL that is used to create an Azure Snowflake service principle inside your tenant.
func (o StorageIntegrationOutput) AzureConsentUrl() pulumi.StringOutput {
	return o.ApplyT(func(v *StorageIntegration) pulumi.StringOutput { return v.AzureConsentUrl }).(pulumi.StringOutput)
}

// This is the name of the Snowflake client application created for your account.
func (o StorageIntegrationOutput) AzureMultiTenantAppName() pulumi.StringOutput {
	return o.ApplyT(func(v *StorageIntegration) pulumi.StringOutput { return v.AzureMultiTenantAppName }).(pulumi.StringOutput)
}

func (o StorageIntegrationOutput) AzureTenantId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *StorageIntegration) pulumi.StringPtrOutput { return v.AzureTenantId }).(pulumi.StringPtrOutput)
}

func (o StorageIntegrationOutput) Comment() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *StorageIntegration) pulumi.StringPtrOutput { return v.Comment }).(pulumi.StringPtrOutput)
}

// Date and time when the storage integration was created.
func (o StorageIntegrationOutput) CreatedOn() pulumi.StringOutput {
	return o.ApplyT(func(v *StorageIntegration) pulumi.StringOutput { return v.CreatedOn }).(pulumi.StringOutput)
}

func (o StorageIntegrationOutput) Enabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *StorageIntegration) pulumi.BoolPtrOutput { return v.Enabled }).(pulumi.BoolPtrOutput)
}

func (o StorageIntegrationOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *StorageIntegration) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Explicitly limits external stages that use the integration to reference one or more storage locations.
func (o StorageIntegrationOutput) StorageAllowedLocations() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *StorageIntegration) pulumi.StringArrayOutput { return v.StorageAllowedLocations }).(pulumi.StringArrayOutput)
}

// The external ID that Snowflake will use when assuming the AWS role.
func (o StorageIntegrationOutput) StorageAwsExternalId() pulumi.StringOutput {
	return o.ApplyT(func(v *StorageIntegration) pulumi.StringOutput { return v.StorageAwsExternalId }).(pulumi.StringOutput)
}

// The Snowflake user that will attempt to assume the AWS role.
func (o StorageIntegrationOutput) StorageAwsIamUserArn() pulumi.StringOutput {
	return o.ApplyT(func(v *StorageIntegration) pulumi.StringOutput { return v.StorageAwsIamUserArn }).(pulumi.StringOutput)
}

// "bucket-owner-full-control" Enables support for AWS access control lists (ACLs) to grant the bucket owner full control.
func (o StorageIntegrationOutput) StorageAwsObjectAcl() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *StorageIntegration) pulumi.StringPtrOutput { return v.StorageAwsObjectAcl }).(pulumi.StringPtrOutput)
}

func (o StorageIntegrationOutput) StorageAwsRoleArn() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *StorageIntegration) pulumi.StringPtrOutput { return v.StorageAwsRoleArn }).(pulumi.StringPtrOutput)
}

// Explicitly prohibits external stages that use the integration from referencing one or more storage locations.
func (o StorageIntegrationOutput) StorageBlockedLocations() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *StorageIntegration) pulumi.StringArrayOutput { return v.StorageBlockedLocations }).(pulumi.StringArrayOutput)
}

// This is the name of the Snowflake Google Service Account created for your account.
func (o StorageIntegrationOutput) StorageGcpServiceAccount() pulumi.StringOutput {
	return o.ApplyT(func(v *StorageIntegration) pulumi.StringOutput { return v.StorageGcpServiceAccount }).(pulumi.StringOutput)
}

func (o StorageIntegrationOutput) StorageProvider() pulumi.StringOutput {
	return o.ApplyT(func(v *StorageIntegration) pulumi.StringOutput { return v.StorageProvider }).(pulumi.StringOutput)
}

func (o StorageIntegrationOutput) Type() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *StorageIntegration) pulumi.StringPtrOutput { return v.Type }).(pulumi.StringPtrOutput)
}

type StorageIntegrationArrayOutput struct{ *pulumi.OutputState }

func (StorageIntegrationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*StorageIntegration)(nil)).Elem()
}

func (o StorageIntegrationArrayOutput) ToStorageIntegrationArrayOutput() StorageIntegrationArrayOutput {
	return o
}

func (o StorageIntegrationArrayOutput) ToStorageIntegrationArrayOutputWithContext(ctx context.Context) StorageIntegrationArrayOutput {
	return o
}

func (o StorageIntegrationArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*StorageIntegration] {
	return pulumix.Output[[]*StorageIntegration]{
		OutputState: o.OutputState,
	}
}

func (o StorageIntegrationArrayOutput) Index(i pulumi.IntInput) StorageIntegrationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *StorageIntegration {
		return vs[0].([]*StorageIntegration)[vs[1].(int)]
	}).(StorageIntegrationOutput)
}

type StorageIntegrationMapOutput struct{ *pulumi.OutputState }

func (StorageIntegrationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*StorageIntegration)(nil)).Elem()
}

func (o StorageIntegrationMapOutput) ToStorageIntegrationMapOutput() StorageIntegrationMapOutput {
	return o
}

func (o StorageIntegrationMapOutput) ToStorageIntegrationMapOutputWithContext(ctx context.Context) StorageIntegrationMapOutput {
	return o
}

func (o StorageIntegrationMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*StorageIntegration] {
	return pulumix.Output[map[string]*StorageIntegration]{
		OutputState: o.OutputState,
	}
}

func (o StorageIntegrationMapOutput) MapIndex(k pulumi.StringInput) StorageIntegrationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *StorageIntegration {
		return vs[0].(map[string]*StorageIntegration)[vs[1].(string)]
	}).(StorageIntegrationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*StorageIntegrationInput)(nil)).Elem(), &StorageIntegration{})
	pulumi.RegisterInputType(reflect.TypeOf((*StorageIntegrationArrayInput)(nil)).Elem(), StorageIntegrationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*StorageIntegrationMapInput)(nil)).Elem(), StorageIntegrationMap{})
	pulumi.RegisterOutputType(StorageIntegrationOutput{})
	pulumi.RegisterOutputType(StorageIntegrationArrayOutput{})
	pulumi.RegisterOutputType(StorageIntegrationMapOutput{})
}
