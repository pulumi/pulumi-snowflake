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
// ```sh
// $ pulumi import snowflake:index/jobService:JobService example '"<database_name>"."<schema_name>"."<job_service_name>"'
// ```
type JobService struct {
	pulumi.CustomResourceState

	// Specifies a comment for the service.
	Comment pulumi.StringPtrOutput `pulumi:"comment"`
	// Specifies the name of the compute pool in your account on which to run the service. Identifiers with special or lower-case characters are not supported. This limitation in the provider follows the limitation in Snowflake (see [docs](https://docs.snowflake.com/en/sql-reference/sql/create-compute-pool)). Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	ComputePool pulumi.StringOutput `pulumi:"computePool"`
	// The database in which to create the service. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Database pulumi.StringOutput `pulumi:"database"`
	// Outputs the result of `DESCRIBE SERVICE` for the given service.
	DescribeOutputs JobServiceDescribeOutputArrayOutput `pulumi:"describeOutputs"`
	// Specifies the names of the external access integrations that allow your service to access external sites.
	ExternalAccessIntegrations pulumi.StringArrayOutput `pulumi:"externalAccessIntegrations"`
	// Specifies the service specification to use for the service. Note that external changes on this field and nested fields are not detected. Use correctly formatted YAML files. Watch out for the space/tabs indentation. See [service specification](https://docs.snowflake.com/en/developer-guide/snowpark-container-services/specification-reference#general-guidelines) for more information.
	FromSpecification JobServiceFromSpecificationPtrOutput `pulumi:"fromSpecification"`
	// Specifies the service specification template to use for the service. Note that external changes on this field and nested fields are not detected. Use correctly formatted YAML files. Watch out for the space/tabs indentation. See [service specification](https://docs.snowflake.com/en/developer-guide/snowpark-container-services/specification-reference#general-guidelines) for more information.
	FromSpecificationTemplate JobServiceFromSpecificationTemplatePtrOutput `pulumi:"fromSpecificationTemplate"`
	// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
	FullyQualifiedName pulumi.StringOutput `pulumi:"fullyQualifiedName"`
	// Specifies the identifier for the service; must be unique for the schema in which the service is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Name pulumi.StringOutput `pulumi:"name"`
	// Warehouse to use if a service container connects to Snowflake to execute a query but does not explicitly specify a warehouse to use. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	QueryWarehouse pulumi.StringPtrOutput `pulumi:"queryWarehouse"`
	// The schema in which to create the service. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Schema pulumi.StringOutput `pulumi:"schema"`
	// Specifies a type for the service. This field is used for checking external changes and recreating the resources if needed.
	ServiceType pulumi.StringOutput `pulumi:"serviceType"`
	// Outputs the result of `SHOW SERVICES` for the given service.
	ShowOutputs JobServiceShowOutputArrayOutput `pulumi:"showOutputs"`
}

// NewJobService registers a new resource with the given unique name, arguments, and options.
func NewJobService(ctx *pulumi.Context,
	name string, args *JobServiceArgs, opts ...pulumi.ResourceOption) (*JobService, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ComputePool == nil {
		return nil, errors.New("invalid value for required argument 'ComputePool'")
	}
	if args.Database == nil {
		return nil, errors.New("invalid value for required argument 'Database'")
	}
	if args.Schema == nil {
		return nil, errors.New("invalid value for required argument 'Schema'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource JobService
	err := ctx.RegisterResource("snowflake:index/jobService:JobService", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetJobService gets an existing JobService resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetJobService(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *JobServiceState, opts ...pulumi.ResourceOption) (*JobService, error) {
	var resource JobService
	err := ctx.ReadResource("snowflake:index/jobService:JobService", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering JobService resources.
type jobServiceState struct {
	// Specifies a comment for the service.
	Comment *string `pulumi:"comment"`
	// Specifies the name of the compute pool in your account on which to run the service. Identifiers with special or lower-case characters are not supported. This limitation in the provider follows the limitation in Snowflake (see [docs](https://docs.snowflake.com/en/sql-reference/sql/create-compute-pool)). Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	ComputePool *string `pulumi:"computePool"`
	// The database in which to create the service. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Database *string `pulumi:"database"`
	// Outputs the result of `DESCRIBE SERVICE` for the given service.
	DescribeOutputs []JobServiceDescribeOutput `pulumi:"describeOutputs"`
	// Specifies the names of the external access integrations that allow your service to access external sites.
	ExternalAccessIntegrations []string `pulumi:"externalAccessIntegrations"`
	// Specifies the service specification to use for the service. Note that external changes on this field and nested fields are not detected. Use correctly formatted YAML files. Watch out for the space/tabs indentation. See [service specification](https://docs.snowflake.com/en/developer-guide/snowpark-container-services/specification-reference#general-guidelines) for more information.
	FromSpecification *JobServiceFromSpecification `pulumi:"fromSpecification"`
	// Specifies the service specification template to use for the service. Note that external changes on this field and nested fields are not detected. Use correctly formatted YAML files. Watch out for the space/tabs indentation. See [service specification](https://docs.snowflake.com/en/developer-guide/snowpark-container-services/specification-reference#general-guidelines) for more information.
	FromSpecificationTemplate *JobServiceFromSpecificationTemplate `pulumi:"fromSpecificationTemplate"`
	// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
	FullyQualifiedName *string `pulumi:"fullyQualifiedName"`
	// Specifies the identifier for the service; must be unique for the schema in which the service is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Name *string `pulumi:"name"`
	// Warehouse to use if a service container connects to Snowflake to execute a query but does not explicitly specify a warehouse to use. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	QueryWarehouse *string `pulumi:"queryWarehouse"`
	// The schema in which to create the service. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Schema *string `pulumi:"schema"`
	// Specifies a type for the service. This field is used for checking external changes and recreating the resources if needed.
	ServiceType *string `pulumi:"serviceType"`
	// Outputs the result of `SHOW SERVICES` for the given service.
	ShowOutputs []JobServiceShowOutput `pulumi:"showOutputs"`
}

type JobServiceState struct {
	// Specifies a comment for the service.
	Comment pulumi.StringPtrInput
	// Specifies the name of the compute pool in your account on which to run the service. Identifiers with special or lower-case characters are not supported. This limitation in the provider follows the limitation in Snowflake (see [docs](https://docs.snowflake.com/en/sql-reference/sql/create-compute-pool)). Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	ComputePool pulumi.StringPtrInput
	// The database in which to create the service. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Database pulumi.StringPtrInput
	// Outputs the result of `DESCRIBE SERVICE` for the given service.
	DescribeOutputs JobServiceDescribeOutputArrayInput
	// Specifies the names of the external access integrations that allow your service to access external sites.
	ExternalAccessIntegrations pulumi.StringArrayInput
	// Specifies the service specification to use for the service. Note that external changes on this field and nested fields are not detected. Use correctly formatted YAML files. Watch out for the space/tabs indentation. See [service specification](https://docs.snowflake.com/en/developer-guide/snowpark-container-services/specification-reference#general-guidelines) for more information.
	FromSpecification JobServiceFromSpecificationPtrInput
	// Specifies the service specification template to use for the service. Note that external changes on this field and nested fields are not detected. Use correctly formatted YAML files. Watch out for the space/tabs indentation. See [service specification](https://docs.snowflake.com/en/developer-guide/snowpark-container-services/specification-reference#general-guidelines) for more information.
	FromSpecificationTemplate JobServiceFromSpecificationTemplatePtrInput
	// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
	FullyQualifiedName pulumi.StringPtrInput
	// Specifies the identifier for the service; must be unique for the schema in which the service is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Name pulumi.StringPtrInput
	// Warehouse to use if a service container connects to Snowflake to execute a query but does not explicitly specify a warehouse to use. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	QueryWarehouse pulumi.StringPtrInput
	// The schema in which to create the service. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Schema pulumi.StringPtrInput
	// Specifies a type for the service. This field is used for checking external changes and recreating the resources if needed.
	ServiceType pulumi.StringPtrInput
	// Outputs the result of `SHOW SERVICES` for the given service.
	ShowOutputs JobServiceShowOutputArrayInput
}

func (JobServiceState) ElementType() reflect.Type {
	return reflect.TypeOf((*jobServiceState)(nil)).Elem()
}

type jobServiceArgs struct {
	// Specifies a comment for the service.
	Comment *string `pulumi:"comment"`
	// Specifies the name of the compute pool in your account on which to run the service. Identifiers with special or lower-case characters are not supported. This limitation in the provider follows the limitation in Snowflake (see [docs](https://docs.snowflake.com/en/sql-reference/sql/create-compute-pool)). Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	ComputePool string `pulumi:"computePool"`
	// The database in which to create the service. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Database string `pulumi:"database"`
	// Specifies the names of the external access integrations that allow your service to access external sites.
	ExternalAccessIntegrations []string `pulumi:"externalAccessIntegrations"`
	// Specifies the service specification to use for the service. Note that external changes on this field and nested fields are not detected. Use correctly formatted YAML files. Watch out for the space/tabs indentation. See [service specification](https://docs.snowflake.com/en/developer-guide/snowpark-container-services/specification-reference#general-guidelines) for more information.
	FromSpecification *JobServiceFromSpecification `pulumi:"fromSpecification"`
	// Specifies the service specification template to use for the service. Note that external changes on this field and nested fields are not detected. Use correctly formatted YAML files. Watch out for the space/tabs indentation. See [service specification](https://docs.snowflake.com/en/developer-guide/snowpark-container-services/specification-reference#general-guidelines) for more information.
	FromSpecificationTemplate *JobServiceFromSpecificationTemplate `pulumi:"fromSpecificationTemplate"`
	// Specifies the identifier for the service; must be unique for the schema in which the service is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Name *string `pulumi:"name"`
	// Warehouse to use if a service container connects to Snowflake to execute a query but does not explicitly specify a warehouse to use. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	QueryWarehouse *string `pulumi:"queryWarehouse"`
	// The schema in which to create the service. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Schema string `pulumi:"schema"`
}

// The set of arguments for constructing a JobService resource.
type JobServiceArgs struct {
	// Specifies a comment for the service.
	Comment pulumi.StringPtrInput
	// Specifies the name of the compute pool in your account on which to run the service. Identifiers with special or lower-case characters are not supported. This limitation in the provider follows the limitation in Snowflake (see [docs](https://docs.snowflake.com/en/sql-reference/sql/create-compute-pool)). Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	ComputePool pulumi.StringInput
	// The database in which to create the service. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Database pulumi.StringInput
	// Specifies the names of the external access integrations that allow your service to access external sites.
	ExternalAccessIntegrations pulumi.StringArrayInput
	// Specifies the service specification to use for the service. Note that external changes on this field and nested fields are not detected. Use correctly formatted YAML files. Watch out for the space/tabs indentation. See [service specification](https://docs.snowflake.com/en/developer-guide/snowpark-container-services/specification-reference#general-guidelines) for more information.
	FromSpecification JobServiceFromSpecificationPtrInput
	// Specifies the service specification template to use for the service. Note that external changes on this field and nested fields are not detected. Use correctly formatted YAML files. Watch out for the space/tabs indentation. See [service specification](https://docs.snowflake.com/en/developer-guide/snowpark-container-services/specification-reference#general-guidelines) for more information.
	FromSpecificationTemplate JobServiceFromSpecificationTemplatePtrInput
	// Specifies the identifier for the service; must be unique for the schema in which the service is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Name pulumi.StringPtrInput
	// Warehouse to use if a service container connects to Snowflake to execute a query but does not explicitly specify a warehouse to use. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	QueryWarehouse pulumi.StringPtrInput
	// The schema in which to create the service. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Schema pulumi.StringInput
}

func (JobServiceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*jobServiceArgs)(nil)).Elem()
}

type JobServiceInput interface {
	pulumi.Input

	ToJobServiceOutput() JobServiceOutput
	ToJobServiceOutputWithContext(ctx context.Context) JobServiceOutput
}

func (*JobService) ElementType() reflect.Type {
	return reflect.TypeOf((**JobService)(nil)).Elem()
}

func (i *JobService) ToJobServiceOutput() JobServiceOutput {
	return i.ToJobServiceOutputWithContext(context.Background())
}

func (i *JobService) ToJobServiceOutputWithContext(ctx context.Context) JobServiceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(JobServiceOutput)
}

// JobServiceArrayInput is an input type that accepts JobServiceArray and JobServiceArrayOutput values.
// You can construct a concrete instance of `JobServiceArrayInput` via:
//
//	JobServiceArray{ JobServiceArgs{...} }
type JobServiceArrayInput interface {
	pulumi.Input

	ToJobServiceArrayOutput() JobServiceArrayOutput
	ToJobServiceArrayOutputWithContext(context.Context) JobServiceArrayOutput
}

type JobServiceArray []JobServiceInput

func (JobServiceArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*JobService)(nil)).Elem()
}

func (i JobServiceArray) ToJobServiceArrayOutput() JobServiceArrayOutput {
	return i.ToJobServiceArrayOutputWithContext(context.Background())
}

func (i JobServiceArray) ToJobServiceArrayOutputWithContext(ctx context.Context) JobServiceArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(JobServiceArrayOutput)
}

// JobServiceMapInput is an input type that accepts JobServiceMap and JobServiceMapOutput values.
// You can construct a concrete instance of `JobServiceMapInput` via:
//
//	JobServiceMap{ "key": JobServiceArgs{...} }
type JobServiceMapInput interface {
	pulumi.Input

	ToJobServiceMapOutput() JobServiceMapOutput
	ToJobServiceMapOutputWithContext(context.Context) JobServiceMapOutput
}

type JobServiceMap map[string]JobServiceInput

func (JobServiceMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*JobService)(nil)).Elem()
}

func (i JobServiceMap) ToJobServiceMapOutput() JobServiceMapOutput {
	return i.ToJobServiceMapOutputWithContext(context.Background())
}

func (i JobServiceMap) ToJobServiceMapOutputWithContext(ctx context.Context) JobServiceMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(JobServiceMapOutput)
}

type JobServiceOutput struct{ *pulumi.OutputState }

func (JobServiceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**JobService)(nil)).Elem()
}

func (o JobServiceOutput) ToJobServiceOutput() JobServiceOutput {
	return o
}

func (o JobServiceOutput) ToJobServiceOutputWithContext(ctx context.Context) JobServiceOutput {
	return o
}

// Specifies a comment for the service.
func (o JobServiceOutput) Comment() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *JobService) pulumi.StringPtrOutput { return v.Comment }).(pulumi.StringPtrOutput)
}

// Specifies the name of the compute pool in your account on which to run the service. Identifiers with special or lower-case characters are not supported. This limitation in the provider follows the limitation in Snowflake (see [docs](https://docs.snowflake.com/en/sql-reference/sql/create-compute-pool)). Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
func (o JobServiceOutput) ComputePool() pulumi.StringOutput {
	return o.ApplyT(func(v *JobService) pulumi.StringOutput { return v.ComputePool }).(pulumi.StringOutput)
}

// The database in which to create the service. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
func (o JobServiceOutput) Database() pulumi.StringOutput {
	return o.ApplyT(func(v *JobService) pulumi.StringOutput { return v.Database }).(pulumi.StringOutput)
}

// Outputs the result of `DESCRIBE SERVICE` for the given service.
func (o JobServiceOutput) DescribeOutputs() JobServiceDescribeOutputArrayOutput {
	return o.ApplyT(func(v *JobService) JobServiceDescribeOutputArrayOutput { return v.DescribeOutputs }).(JobServiceDescribeOutputArrayOutput)
}

// Specifies the names of the external access integrations that allow your service to access external sites.
func (o JobServiceOutput) ExternalAccessIntegrations() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *JobService) pulumi.StringArrayOutput { return v.ExternalAccessIntegrations }).(pulumi.StringArrayOutput)
}

// Specifies the service specification to use for the service. Note that external changes on this field and nested fields are not detected. Use correctly formatted YAML files. Watch out for the space/tabs indentation. See [service specification](https://docs.snowflake.com/en/developer-guide/snowpark-container-services/specification-reference#general-guidelines) for more information.
func (o JobServiceOutput) FromSpecification() JobServiceFromSpecificationPtrOutput {
	return o.ApplyT(func(v *JobService) JobServiceFromSpecificationPtrOutput { return v.FromSpecification }).(JobServiceFromSpecificationPtrOutput)
}

// Specifies the service specification template to use for the service. Note that external changes on this field and nested fields are not detected. Use correctly formatted YAML files. Watch out for the space/tabs indentation. See [service specification](https://docs.snowflake.com/en/developer-guide/snowpark-container-services/specification-reference#general-guidelines) for more information.
func (o JobServiceOutput) FromSpecificationTemplate() JobServiceFromSpecificationTemplatePtrOutput {
	return o.ApplyT(func(v *JobService) JobServiceFromSpecificationTemplatePtrOutput { return v.FromSpecificationTemplate }).(JobServiceFromSpecificationTemplatePtrOutput)
}

// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
func (o JobServiceOutput) FullyQualifiedName() pulumi.StringOutput {
	return o.ApplyT(func(v *JobService) pulumi.StringOutput { return v.FullyQualifiedName }).(pulumi.StringOutput)
}

// Specifies the identifier for the service; must be unique for the schema in which the service is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
func (o JobServiceOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *JobService) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Warehouse to use if a service container connects to Snowflake to execute a query but does not explicitly specify a warehouse to use. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
func (o JobServiceOutput) QueryWarehouse() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *JobService) pulumi.StringPtrOutput { return v.QueryWarehouse }).(pulumi.StringPtrOutput)
}

// The schema in which to create the service. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
func (o JobServiceOutput) Schema() pulumi.StringOutput {
	return o.ApplyT(func(v *JobService) pulumi.StringOutput { return v.Schema }).(pulumi.StringOutput)
}

// Specifies a type for the service. This field is used for checking external changes and recreating the resources if needed.
func (o JobServiceOutput) ServiceType() pulumi.StringOutput {
	return o.ApplyT(func(v *JobService) pulumi.StringOutput { return v.ServiceType }).(pulumi.StringOutput)
}

// Outputs the result of `SHOW SERVICES` for the given service.
func (o JobServiceOutput) ShowOutputs() JobServiceShowOutputArrayOutput {
	return o.ApplyT(func(v *JobService) JobServiceShowOutputArrayOutput { return v.ShowOutputs }).(JobServiceShowOutputArrayOutput)
}

type JobServiceArrayOutput struct{ *pulumi.OutputState }

func (JobServiceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*JobService)(nil)).Elem()
}

func (o JobServiceArrayOutput) ToJobServiceArrayOutput() JobServiceArrayOutput {
	return o
}

func (o JobServiceArrayOutput) ToJobServiceArrayOutputWithContext(ctx context.Context) JobServiceArrayOutput {
	return o
}

func (o JobServiceArrayOutput) Index(i pulumi.IntInput) JobServiceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *JobService {
		return vs[0].([]*JobService)[vs[1].(int)]
	}).(JobServiceOutput)
}

type JobServiceMapOutput struct{ *pulumi.OutputState }

func (JobServiceMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*JobService)(nil)).Elem()
}

func (o JobServiceMapOutput) ToJobServiceMapOutput() JobServiceMapOutput {
	return o
}

func (o JobServiceMapOutput) ToJobServiceMapOutputWithContext(ctx context.Context) JobServiceMapOutput {
	return o
}

func (o JobServiceMapOutput) MapIndex(k pulumi.StringInput) JobServiceOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *JobService {
		return vs[0].(map[string]*JobService)[vs[1].(string)]
	}).(JobServiceOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*JobServiceInput)(nil)).Elem(), &JobService{})
	pulumi.RegisterInputType(reflect.TypeOf((*JobServiceArrayInput)(nil)).Elem(), JobServiceArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*JobServiceMapInput)(nil)).Elem(), JobServiceMap{})
	pulumi.RegisterOutputType(JobServiceOutput{})
	pulumi.RegisterOutputType(JobServiceArrayOutput{})
	pulumi.RegisterOutputType(JobServiceMapOutput{})
}
