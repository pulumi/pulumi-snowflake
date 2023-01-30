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
//	"fmt"
//
//	"github.com/pulumi/pulumi-snowflake/sdk/go/snowflake"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			exampleStage, err := snowflake.NewStage(ctx, "exampleStage", &snowflake.StageArgs{
//				Url:         pulumi.String("s3://com.example.bucket/prefix"),
//				Database:    pulumi.String("EXAMPLE_DB"),
//				Schema:      pulumi.String("EXAMPLE_SCHEMA"),
//				Credentials: pulumi.String(fmt.Sprintf("AWS_KEY_ID='%v' AWS_SECRET_KEY='%v'", _var.Example_aws_key_id, _var.Example_aws_secret_key)),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = snowflake.NewStageGrant(ctx, "grantExampleStage", &snowflake.StageGrantArgs{
//				DatabaseName: exampleStage.Database,
//				SchemaName:   exampleStage.Schema,
//				Roles: pulumi.StringArray{
//					pulumi.String("LOADER"),
//				},
//				Privilege: pulumi.String("OWNERSHIP"),
//				StageName: exampleStage.Name,
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
// format is database name | schema name | stage name
//
// ```sh
//
//	$ pulumi import snowflake:index/stage:Stage example 'dbName|schemaName|stageName'
//
// ```
type Stage struct {
	pulumi.CustomResourceState

	AwsExternalId pulumi.StringOutput `pulumi:"awsExternalId"`
	// Specifies a comment for the stage.
	Comment pulumi.StringPtrOutput `pulumi:"comment"`
	// Specifies the copy options for the stage.
	CopyOptions pulumi.StringPtrOutput `pulumi:"copyOptions"`
	// Specifies the credentials for the stage.
	Credentials pulumi.StringPtrOutput `pulumi:"credentials"`
	// The database in which to create the stage.
	Database pulumi.StringOutput `pulumi:"database"`
	// Specifies the directory settings for the stage.
	Directory pulumi.StringPtrOutput `pulumi:"directory"`
	// Specifies the encryption settings for the stage.
	Encryption pulumi.StringPtrOutput `pulumi:"encryption"`
	// Specifies the file format for the stage.
	FileFormat pulumi.StringPtrOutput `pulumi:"fileFormat"`
	// Specifies the identifier for the stage; must be unique for the database and schema in which the stage is created.
	Name pulumi.StringOutput `pulumi:"name"`
	// The schema in which to create the stage.
	Schema           pulumi.StringOutput `pulumi:"schema"`
	SnowflakeIamUser pulumi.StringOutput `pulumi:"snowflakeIamUser"`
	// Specifies the name of the storage integration used to delegate authentication responsibility for external cloud storage to a Snowflake identity and access management (IAM) entity.
	StorageIntegration pulumi.StringPtrOutput `pulumi:"storageIntegration"`
	// Definitions of a tag to associate with the resource.
	//
	// Deprecated: Use the 'snowflake_tag_association' resource instead.
	Tags StageTagArrayOutput `pulumi:"tags"`
	// Specifies the URL for the stage.
	Url pulumi.StringPtrOutput `pulumi:"url"`
}

// NewStage registers a new resource with the given unique name, arguments, and options.
func NewStage(ctx *pulumi.Context,
	name string, args *StageArgs, opts ...pulumi.ResourceOption) (*Stage, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Database == nil {
		return nil, errors.New("invalid value for required argument 'Database'")
	}
	if args.Schema == nil {
		return nil, errors.New("invalid value for required argument 'Schema'")
	}
	if args.Credentials != nil {
		args.Credentials = pulumi.ToSecret(args.Credentials).(pulumi.StringPtrInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"credentials",
	})
	opts = append(opts, secrets)
	var resource Stage
	err := ctx.RegisterResource("snowflake:index/stage:Stage", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetStage gets an existing Stage resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetStage(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *StageState, opts ...pulumi.ResourceOption) (*Stage, error) {
	var resource Stage
	err := ctx.ReadResource("snowflake:index/stage:Stage", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Stage resources.
type stageState struct {
	AwsExternalId *string `pulumi:"awsExternalId"`
	// Specifies a comment for the stage.
	Comment *string `pulumi:"comment"`
	// Specifies the copy options for the stage.
	CopyOptions *string `pulumi:"copyOptions"`
	// Specifies the credentials for the stage.
	Credentials *string `pulumi:"credentials"`
	// The database in which to create the stage.
	Database *string `pulumi:"database"`
	// Specifies the directory settings for the stage.
	Directory *string `pulumi:"directory"`
	// Specifies the encryption settings for the stage.
	Encryption *string `pulumi:"encryption"`
	// Specifies the file format for the stage.
	FileFormat *string `pulumi:"fileFormat"`
	// Specifies the identifier for the stage; must be unique for the database and schema in which the stage is created.
	Name *string `pulumi:"name"`
	// The schema in which to create the stage.
	Schema           *string `pulumi:"schema"`
	SnowflakeIamUser *string `pulumi:"snowflakeIamUser"`
	// Specifies the name of the storage integration used to delegate authentication responsibility for external cloud storage to a Snowflake identity and access management (IAM) entity.
	StorageIntegration *string `pulumi:"storageIntegration"`
	// Definitions of a tag to associate with the resource.
	//
	// Deprecated: Use the 'snowflake_tag_association' resource instead.
	Tags []StageTag `pulumi:"tags"`
	// Specifies the URL for the stage.
	Url *string `pulumi:"url"`
}

type StageState struct {
	AwsExternalId pulumi.StringPtrInput
	// Specifies a comment for the stage.
	Comment pulumi.StringPtrInput
	// Specifies the copy options for the stage.
	CopyOptions pulumi.StringPtrInput
	// Specifies the credentials for the stage.
	Credentials pulumi.StringPtrInput
	// The database in which to create the stage.
	Database pulumi.StringPtrInput
	// Specifies the directory settings for the stage.
	Directory pulumi.StringPtrInput
	// Specifies the encryption settings for the stage.
	Encryption pulumi.StringPtrInput
	// Specifies the file format for the stage.
	FileFormat pulumi.StringPtrInput
	// Specifies the identifier for the stage; must be unique for the database and schema in which the stage is created.
	Name pulumi.StringPtrInput
	// The schema in which to create the stage.
	Schema           pulumi.StringPtrInput
	SnowflakeIamUser pulumi.StringPtrInput
	// Specifies the name of the storage integration used to delegate authentication responsibility for external cloud storage to a Snowflake identity and access management (IAM) entity.
	StorageIntegration pulumi.StringPtrInput
	// Definitions of a tag to associate with the resource.
	//
	// Deprecated: Use the 'snowflake_tag_association' resource instead.
	Tags StageTagArrayInput
	// Specifies the URL for the stage.
	Url pulumi.StringPtrInput
}

func (StageState) ElementType() reflect.Type {
	return reflect.TypeOf((*stageState)(nil)).Elem()
}

type stageArgs struct {
	AwsExternalId *string `pulumi:"awsExternalId"`
	// Specifies a comment for the stage.
	Comment *string `pulumi:"comment"`
	// Specifies the copy options for the stage.
	CopyOptions *string `pulumi:"copyOptions"`
	// Specifies the credentials for the stage.
	Credentials *string `pulumi:"credentials"`
	// The database in which to create the stage.
	Database string `pulumi:"database"`
	// Specifies the directory settings for the stage.
	Directory *string `pulumi:"directory"`
	// Specifies the encryption settings for the stage.
	Encryption *string `pulumi:"encryption"`
	// Specifies the file format for the stage.
	FileFormat *string `pulumi:"fileFormat"`
	// Specifies the identifier for the stage; must be unique for the database and schema in which the stage is created.
	Name *string `pulumi:"name"`
	// The schema in which to create the stage.
	Schema           string  `pulumi:"schema"`
	SnowflakeIamUser *string `pulumi:"snowflakeIamUser"`
	// Specifies the name of the storage integration used to delegate authentication responsibility for external cloud storage to a Snowflake identity and access management (IAM) entity.
	StorageIntegration *string `pulumi:"storageIntegration"`
	// Definitions of a tag to associate with the resource.
	//
	// Deprecated: Use the 'snowflake_tag_association' resource instead.
	Tags []StageTag `pulumi:"tags"`
	// Specifies the URL for the stage.
	Url *string `pulumi:"url"`
}

// The set of arguments for constructing a Stage resource.
type StageArgs struct {
	AwsExternalId pulumi.StringPtrInput
	// Specifies a comment for the stage.
	Comment pulumi.StringPtrInput
	// Specifies the copy options for the stage.
	CopyOptions pulumi.StringPtrInput
	// Specifies the credentials for the stage.
	Credentials pulumi.StringPtrInput
	// The database in which to create the stage.
	Database pulumi.StringInput
	// Specifies the directory settings for the stage.
	Directory pulumi.StringPtrInput
	// Specifies the encryption settings for the stage.
	Encryption pulumi.StringPtrInput
	// Specifies the file format for the stage.
	FileFormat pulumi.StringPtrInput
	// Specifies the identifier for the stage; must be unique for the database and schema in which the stage is created.
	Name pulumi.StringPtrInput
	// The schema in which to create the stage.
	Schema           pulumi.StringInput
	SnowflakeIamUser pulumi.StringPtrInput
	// Specifies the name of the storage integration used to delegate authentication responsibility for external cloud storage to a Snowflake identity and access management (IAM) entity.
	StorageIntegration pulumi.StringPtrInput
	// Definitions of a tag to associate with the resource.
	//
	// Deprecated: Use the 'snowflake_tag_association' resource instead.
	Tags StageTagArrayInput
	// Specifies the URL for the stage.
	Url pulumi.StringPtrInput
}

func (StageArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*stageArgs)(nil)).Elem()
}

type StageInput interface {
	pulumi.Input

	ToStageOutput() StageOutput
	ToStageOutputWithContext(ctx context.Context) StageOutput
}

func (*Stage) ElementType() reflect.Type {
	return reflect.TypeOf((**Stage)(nil)).Elem()
}

func (i *Stage) ToStageOutput() StageOutput {
	return i.ToStageOutputWithContext(context.Background())
}

func (i *Stage) ToStageOutputWithContext(ctx context.Context) StageOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StageOutput)
}

// StageArrayInput is an input type that accepts StageArray and StageArrayOutput values.
// You can construct a concrete instance of `StageArrayInput` via:
//
//	StageArray{ StageArgs{...} }
type StageArrayInput interface {
	pulumi.Input

	ToStageArrayOutput() StageArrayOutput
	ToStageArrayOutputWithContext(context.Context) StageArrayOutput
}

type StageArray []StageInput

func (StageArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Stage)(nil)).Elem()
}

func (i StageArray) ToStageArrayOutput() StageArrayOutput {
	return i.ToStageArrayOutputWithContext(context.Background())
}

func (i StageArray) ToStageArrayOutputWithContext(ctx context.Context) StageArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StageArrayOutput)
}

// StageMapInput is an input type that accepts StageMap and StageMapOutput values.
// You can construct a concrete instance of `StageMapInput` via:
//
//	StageMap{ "key": StageArgs{...} }
type StageMapInput interface {
	pulumi.Input

	ToStageMapOutput() StageMapOutput
	ToStageMapOutputWithContext(context.Context) StageMapOutput
}

type StageMap map[string]StageInput

func (StageMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Stage)(nil)).Elem()
}

func (i StageMap) ToStageMapOutput() StageMapOutput {
	return i.ToStageMapOutputWithContext(context.Background())
}

func (i StageMap) ToStageMapOutputWithContext(ctx context.Context) StageMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StageMapOutput)
}

type StageOutput struct{ *pulumi.OutputState }

func (StageOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Stage)(nil)).Elem()
}

func (o StageOutput) ToStageOutput() StageOutput {
	return o
}

func (o StageOutput) ToStageOutputWithContext(ctx context.Context) StageOutput {
	return o
}

func (o StageOutput) AwsExternalId() pulumi.StringOutput {
	return o.ApplyT(func(v *Stage) pulumi.StringOutput { return v.AwsExternalId }).(pulumi.StringOutput)
}

// Specifies a comment for the stage.
func (o StageOutput) Comment() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Stage) pulumi.StringPtrOutput { return v.Comment }).(pulumi.StringPtrOutput)
}

// Specifies the copy options for the stage.
func (o StageOutput) CopyOptions() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Stage) pulumi.StringPtrOutput { return v.CopyOptions }).(pulumi.StringPtrOutput)
}

// Specifies the credentials for the stage.
func (o StageOutput) Credentials() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Stage) pulumi.StringPtrOutput { return v.Credentials }).(pulumi.StringPtrOutput)
}

// The database in which to create the stage.
func (o StageOutput) Database() pulumi.StringOutput {
	return o.ApplyT(func(v *Stage) pulumi.StringOutput { return v.Database }).(pulumi.StringOutput)
}

// Specifies the directory settings for the stage.
func (o StageOutput) Directory() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Stage) pulumi.StringPtrOutput { return v.Directory }).(pulumi.StringPtrOutput)
}

// Specifies the encryption settings for the stage.
func (o StageOutput) Encryption() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Stage) pulumi.StringPtrOutput { return v.Encryption }).(pulumi.StringPtrOutput)
}

// Specifies the file format for the stage.
func (o StageOutput) FileFormat() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Stage) pulumi.StringPtrOutput { return v.FileFormat }).(pulumi.StringPtrOutput)
}

// Specifies the identifier for the stage; must be unique for the database and schema in which the stage is created.
func (o StageOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Stage) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The schema in which to create the stage.
func (o StageOutput) Schema() pulumi.StringOutput {
	return o.ApplyT(func(v *Stage) pulumi.StringOutput { return v.Schema }).(pulumi.StringOutput)
}

func (o StageOutput) SnowflakeIamUser() pulumi.StringOutput {
	return o.ApplyT(func(v *Stage) pulumi.StringOutput { return v.SnowflakeIamUser }).(pulumi.StringOutput)
}

// Specifies the name of the storage integration used to delegate authentication responsibility for external cloud storage to a Snowflake identity and access management (IAM) entity.
func (o StageOutput) StorageIntegration() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Stage) pulumi.StringPtrOutput { return v.StorageIntegration }).(pulumi.StringPtrOutput)
}

// Definitions of a tag to associate with the resource.
//
// Deprecated: Use the 'snowflake_tag_association' resource instead.
func (o StageOutput) Tags() StageTagArrayOutput {
	return o.ApplyT(func(v *Stage) StageTagArrayOutput { return v.Tags }).(StageTagArrayOutput)
}

// Specifies the URL for the stage.
func (o StageOutput) Url() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Stage) pulumi.StringPtrOutput { return v.Url }).(pulumi.StringPtrOutput)
}

type StageArrayOutput struct{ *pulumi.OutputState }

func (StageArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Stage)(nil)).Elem()
}

func (o StageArrayOutput) ToStageArrayOutput() StageArrayOutput {
	return o
}

func (o StageArrayOutput) ToStageArrayOutputWithContext(ctx context.Context) StageArrayOutput {
	return o
}

func (o StageArrayOutput) Index(i pulumi.IntInput) StageOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Stage {
		return vs[0].([]*Stage)[vs[1].(int)]
	}).(StageOutput)
}

type StageMapOutput struct{ *pulumi.OutputState }

func (StageMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Stage)(nil)).Elem()
}

func (o StageMapOutput) ToStageMapOutput() StageMapOutput {
	return o
}

func (o StageMapOutput) ToStageMapOutputWithContext(ctx context.Context) StageMapOutput {
	return o
}

func (o StageMapOutput) MapIndex(k pulumi.StringInput) StageOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Stage {
		return vs[0].(map[string]*Stage)[vs[1].(string)]
	}).(StageOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*StageInput)(nil)).Elem(), &Stage{})
	pulumi.RegisterInputType(reflect.TypeOf((*StageArrayInput)(nil)).Elem(), StageArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*StageMapInput)(nil)).Elem(), StageMap{})
	pulumi.RegisterOutputType(StageOutput{})
	pulumi.RegisterOutputType(StageArrayOutput{})
	pulumi.RegisterOutputType(StageMapOutput{})
}
