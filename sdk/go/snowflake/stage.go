// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package snowflake

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-snowflake/sdk/v2/go/snowflake/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Import
//
// format is database name | schema name | stage name
//
// ```sh
// $ pulumi import snowflake:index/stage:Stage example 'dbName|schemaName|stageName'
// ```
type Stage struct {
	pulumi.CustomResourceState

	// A unique ID assigned to the specific stage. The ID has the following format: &lt;snowflakeAccount&gt;*SFCRole=&lt;snowflakeRoleId&gt;*&lt;randomId&gt;
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
	// Specifies the file format for the stage. Specifying the default Snowflake value (e.g. TYPE = CSV) will currently result in a permadiff (check #2679). For now, omit the default values; it will be fixed in the upcoming provider versions. Examples of usage: \n\n1. with hardcoding value:\n\n `file_format="FORMAT_NAME = DB.SCHEMA.FORMATNAME"` \n\n2. from dynamic value:\n\n `fileFormat = "FORMAT_NAME = ${snowflake_file_format.myfileformat.fully_qualified_name}"` \n\n3. from expression:\n\n `fileFormat = format("FORMAT_NAME =%s.%s.MYFILEFORMAT", var.db_name, each.value.schema_name)`. Reference: #265
	FileFormat pulumi.StringPtrOutput `pulumi:"fileFormat"`
	// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
	FullyQualifiedName pulumi.StringOutput `pulumi:"fullyQualifiedName"`
	// Specifies the identifier for the stage; must be unique for the database and schema in which the stage is created.
	Name pulumi.StringOutput `pulumi:"name"`
	// The schema in which to create the stage.
	Schema pulumi.StringOutput `pulumi:"schema"`
	// An AWS IAM user created for your Snowflake account. This user is the same for every external S3 stage created in your account.
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
	opts = internal.PkgResourceDefaultOpts(opts)
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
	// A unique ID assigned to the specific stage. The ID has the following format: &lt;snowflakeAccount&gt;*SFCRole=&lt;snowflakeRoleId&gt;*&lt;randomId&gt;
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
	// Specifies the file format for the stage. Specifying the default Snowflake value (e.g. TYPE = CSV) will currently result in a permadiff (check #2679). For now, omit the default values; it will be fixed in the upcoming provider versions. Examples of usage: \n\n1. with hardcoding value:\n\n `file_format="FORMAT_NAME = DB.SCHEMA.FORMATNAME"` \n\n2. from dynamic value:\n\n `fileFormat = "FORMAT_NAME = ${snowflake_file_format.myfileformat.fully_qualified_name}"` \n\n3. from expression:\n\n `fileFormat = format("FORMAT_NAME =%s.%s.MYFILEFORMAT", var.db_name, each.value.schema_name)`. Reference: #265
	FileFormat *string `pulumi:"fileFormat"`
	// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
	FullyQualifiedName *string `pulumi:"fullyQualifiedName"`
	// Specifies the identifier for the stage; must be unique for the database and schema in which the stage is created.
	Name *string `pulumi:"name"`
	// The schema in which to create the stage.
	Schema *string `pulumi:"schema"`
	// An AWS IAM user created for your Snowflake account. This user is the same for every external S3 stage created in your account.
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
	// A unique ID assigned to the specific stage. The ID has the following format: &lt;snowflakeAccount&gt;*SFCRole=&lt;snowflakeRoleId&gt;*&lt;randomId&gt;
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
	// Specifies the file format for the stage. Specifying the default Snowflake value (e.g. TYPE = CSV) will currently result in a permadiff (check #2679). For now, omit the default values; it will be fixed in the upcoming provider versions. Examples of usage: \n\n1. with hardcoding value:\n\n `file_format="FORMAT_NAME = DB.SCHEMA.FORMATNAME"` \n\n2. from dynamic value:\n\n `fileFormat = "FORMAT_NAME = ${snowflake_file_format.myfileformat.fully_qualified_name}"` \n\n3. from expression:\n\n `fileFormat = format("FORMAT_NAME =%s.%s.MYFILEFORMAT", var.db_name, each.value.schema_name)`. Reference: #265
	FileFormat pulumi.StringPtrInput
	// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
	FullyQualifiedName pulumi.StringPtrInput
	// Specifies the identifier for the stage; must be unique for the database and schema in which the stage is created.
	Name pulumi.StringPtrInput
	// The schema in which to create the stage.
	Schema pulumi.StringPtrInput
	// An AWS IAM user created for your Snowflake account. This user is the same for every external S3 stage created in your account.
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
	// A unique ID assigned to the specific stage. The ID has the following format: &lt;snowflakeAccount&gt;*SFCRole=&lt;snowflakeRoleId&gt;*&lt;randomId&gt;
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
	// Specifies the file format for the stage. Specifying the default Snowflake value (e.g. TYPE = CSV) will currently result in a permadiff (check #2679). For now, omit the default values; it will be fixed in the upcoming provider versions. Examples of usage: \n\n1. with hardcoding value:\n\n `file_format="FORMAT_NAME = DB.SCHEMA.FORMATNAME"` \n\n2. from dynamic value:\n\n `fileFormat = "FORMAT_NAME = ${snowflake_file_format.myfileformat.fully_qualified_name}"` \n\n3. from expression:\n\n `fileFormat = format("FORMAT_NAME =%s.%s.MYFILEFORMAT", var.db_name, each.value.schema_name)`. Reference: #265
	FileFormat *string `pulumi:"fileFormat"`
	// Specifies the identifier for the stage; must be unique for the database and schema in which the stage is created.
	Name *string `pulumi:"name"`
	// The schema in which to create the stage.
	Schema string `pulumi:"schema"`
	// An AWS IAM user created for your Snowflake account. This user is the same for every external S3 stage created in your account.
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
	// A unique ID assigned to the specific stage. The ID has the following format: &lt;snowflakeAccount&gt;*SFCRole=&lt;snowflakeRoleId&gt;*&lt;randomId&gt;
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
	// Specifies the file format for the stage. Specifying the default Snowflake value (e.g. TYPE = CSV) will currently result in a permadiff (check #2679). For now, omit the default values; it will be fixed in the upcoming provider versions. Examples of usage: \n\n1. with hardcoding value:\n\n `file_format="FORMAT_NAME = DB.SCHEMA.FORMATNAME"` \n\n2. from dynamic value:\n\n `fileFormat = "FORMAT_NAME = ${snowflake_file_format.myfileformat.fully_qualified_name}"` \n\n3. from expression:\n\n `fileFormat = format("FORMAT_NAME =%s.%s.MYFILEFORMAT", var.db_name, each.value.schema_name)`. Reference: #265
	FileFormat pulumi.StringPtrInput
	// Specifies the identifier for the stage; must be unique for the database and schema in which the stage is created.
	Name pulumi.StringPtrInput
	// The schema in which to create the stage.
	Schema pulumi.StringInput
	// An AWS IAM user created for your Snowflake account. This user is the same for every external S3 stage created in your account.
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

// A unique ID assigned to the specific stage. The ID has the following format: &lt;snowflakeAccount&gt;*SFCRole=&lt;snowflakeRoleId&gt;*&lt;randomId&gt;
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

// Specifies the file format for the stage. Specifying the default Snowflake value (e.g. TYPE = CSV) will currently result in a permadiff (check #2679). For now, omit the default values; it will be fixed in the upcoming provider versions. Examples of usage: \n\n1. with hardcoding value:\n\n `file_format="FORMAT_NAME = DB.SCHEMA.FORMATNAME"` \n\n2. from dynamic value:\n\n `fileFormat = "FORMAT_NAME = ${snowflake_file_format.myfileformat.fully_qualified_name}"` \n\n3. from expression:\n\n `fileFormat = format("FORMAT_NAME =%s.%s.MYFILEFORMAT", var.db_name, each.value.schema_name)`. Reference: #265
func (o StageOutput) FileFormat() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Stage) pulumi.StringPtrOutput { return v.FileFormat }).(pulumi.StringPtrOutput)
}

// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
func (o StageOutput) FullyQualifiedName() pulumi.StringOutput {
	return o.ApplyT(func(v *Stage) pulumi.StringOutput { return v.FullyQualifiedName }).(pulumi.StringOutput)
}

// Specifies the identifier for the stage; must be unique for the database and schema in which the stage is created.
func (o StageOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Stage) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The schema in which to create the stage.
func (o StageOutput) Schema() pulumi.StringOutput {
	return o.ApplyT(func(v *Stage) pulumi.StringOutput { return v.Schema }).(pulumi.StringOutput)
}

// An AWS IAM user created for your Snowflake account. This user is the same for every external S3 stage created in your account.
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
