// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package snowflake

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-snowflake/sdk/v2/go/snowflake/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// !> **Caution: Preview Feature** This feature is considered a preview feature in the provider, regardless of the state of the resource in Snowflake. We do not guarantee its stability. It will be reworked and marked as a stable feature in future releases. Breaking changes are expected, even without bumping the major version. To use this feature, add the relevant feature name to `previewFeaturesEnabled` field in the provider configuration. Please always refer to the Getting Help section in our Github repo to best determine how to get help for your questions.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-snowflake/sdk/v2/go/snowflake"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			d, err := snowflake.NewDatabase(ctx, "d", &snowflake.DatabaseArgs{
//				Name: pulumi.String("TEST_DB"),
//			})
//			if err != nil {
//				return err
//			}
//			// read all object parameters in database TEST_DB
//			_ = snowflake.GetParametersOutput(ctx, snowflake.GetParametersOutputArgs{
//				ParameterType: pulumi.String("OBJECT"),
//				ObjectType:    pulumi.String("DATABASE"),
//				ObjectName:    d.Name,
//			}, nil)
//			// read all account parameters with the pattern '%TIMESTAMP%'
//			_, err = snowflake.GetParameters(ctx, &snowflake.GetParametersArgs{
//				ParameterType: pulumi.StringRef("ACCOUNT"),
//				Pattern:       pulumi.StringRef("%TIMESTAMP%"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			// read the exact session parameter ROWS_PER_RESULTSET
//			_, err = snowflake.GetParameters(ctx, &snowflake.GetParametersArgs{
//				ParameterType: pulumi.StringRef("SESSION"),
//				Pattern:       pulumi.StringRef("ROWS_PER_RESULTSET"),
//				User:          pulumi.StringRef("TEST_USER"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// > **Note** If a field has a default value, it is shown next to the type in the schema.
func GetParameters(ctx *pulumi.Context, args *GetParametersArgs, opts ...pulumi.InvokeOption) (*GetParametersResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetParametersResult
	err := ctx.Invoke("snowflake:index/getParameters:getParameters", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getParameters.
type GetParametersArgs struct {
	// If parameter*type is set to "OBJECT" then object*name is the name of the object to display object parameters for.
	ObjectName *string `pulumi:"objectName"`
	// If parameter*type is set to "OBJECT" then object*type is the type of object to display object parameters for. Valid values are any object supported by the IN clause of the [SHOW PARAMETERS](https://docs.snowflake.com/en/sql-reference/sql/show-parameters.html#parameters) statement, including: WAREHOUSE | DATABASE | SCHEMA | TASK | TABLE
	ObjectType *string `pulumi:"objectType"`
	// (Default: `ACCOUNT`) The type of parameter to filter by. Valid values are: "ACCOUNT", "SESSION", "OBJECT".
	ParameterType *string `pulumi:"parameterType"`
	// Allows limiting the list of parameters by name using LIKE clause. Refer to [Limiting the List of Parameters by Name](https://docs.snowflake.com/en/sql-reference/parameters.html#limiting-the-list-of-parameters-by-name)
	Pattern *string `pulumi:"pattern"`
	// If parameterType is set to "SESSION" then user is the name of the user to display session parameters for.
	User *string `pulumi:"user"`
}

// A collection of values returned by getParameters.
type GetParametersResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// If parameter*type is set to "OBJECT" then object*name is the name of the object to display object parameters for.
	ObjectName *string `pulumi:"objectName"`
	// If parameter*type is set to "OBJECT" then object*type is the type of object to display object parameters for. Valid values are any object supported by the IN clause of the [SHOW PARAMETERS](https://docs.snowflake.com/en/sql-reference/sql/show-parameters.html#parameters) statement, including: WAREHOUSE | DATABASE | SCHEMA | TASK | TABLE
	ObjectType *string `pulumi:"objectType"`
	// (Default: `ACCOUNT`) The type of parameter to filter by. Valid values are: "ACCOUNT", "SESSION", "OBJECT".
	ParameterType *string `pulumi:"parameterType"`
	// The pipes in the schema
	Parameters []GetParametersParameter `pulumi:"parameters"`
	// Allows limiting the list of parameters by name using LIKE clause. Refer to [Limiting the List of Parameters by Name](https://docs.snowflake.com/en/sql-reference/parameters.html#limiting-the-list-of-parameters-by-name)
	Pattern *string `pulumi:"pattern"`
	// If parameterType is set to "SESSION" then user is the name of the user to display session parameters for.
	User *string `pulumi:"user"`
}

func GetParametersOutput(ctx *pulumi.Context, args GetParametersOutputArgs, opts ...pulumi.InvokeOption) GetParametersResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetParametersResultOutput, error) {
			args := v.(GetParametersArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("snowflake:index/getParameters:getParameters", args, GetParametersResultOutput{}, options).(GetParametersResultOutput), nil
		}).(GetParametersResultOutput)
}

// A collection of arguments for invoking getParameters.
type GetParametersOutputArgs struct {
	// If parameter*type is set to "OBJECT" then object*name is the name of the object to display object parameters for.
	ObjectName pulumi.StringPtrInput `pulumi:"objectName"`
	// If parameter*type is set to "OBJECT" then object*type is the type of object to display object parameters for. Valid values are any object supported by the IN clause of the [SHOW PARAMETERS](https://docs.snowflake.com/en/sql-reference/sql/show-parameters.html#parameters) statement, including: WAREHOUSE | DATABASE | SCHEMA | TASK | TABLE
	ObjectType pulumi.StringPtrInput `pulumi:"objectType"`
	// (Default: `ACCOUNT`) The type of parameter to filter by. Valid values are: "ACCOUNT", "SESSION", "OBJECT".
	ParameterType pulumi.StringPtrInput `pulumi:"parameterType"`
	// Allows limiting the list of parameters by name using LIKE clause. Refer to [Limiting the List of Parameters by Name](https://docs.snowflake.com/en/sql-reference/parameters.html#limiting-the-list-of-parameters-by-name)
	Pattern pulumi.StringPtrInput `pulumi:"pattern"`
	// If parameterType is set to "SESSION" then user is the name of the user to display session parameters for.
	User pulumi.StringPtrInput `pulumi:"user"`
}

func (GetParametersOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetParametersArgs)(nil)).Elem()
}

// A collection of values returned by getParameters.
type GetParametersResultOutput struct{ *pulumi.OutputState }

func (GetParametersResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetParametersResult)(nil)).Elem()
}

func (o GetParametersResultOutput) ToGetParametersResultOutput() GetParametersResultOutput {
	return o
}

func (o GetParametersResultOutput) ToGetParametersResultOutputWithContext(ctx context.Context) GetParametersResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetParametersResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetParametersResult) string { return v.Id }).(pulumi.StringOutput)
}

// If parameter*type is set to "OBJECT" then object*name is the name of the object to display object parameters for.
func (o GetParametersResultOutput) ObjectName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetParametersResult) *string { return v.ObjectName }).(pulumi.StringPtrOutput)
}

// If parameter*type is set to "OBJECT" then object*type is the type of object to display object parameters for. Valid values are any object supported by the IN clause of the [SHOW PARAMETERS](https://docs.snowflake.com/en/sql-reference/sql/show-parameters.html#parameters) statement, including: WAREHOUSE | DATABASE | SCHEMA | TASK | TABLE
func (o GetParametersResultOutput) ObjectType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetParametersResult) *string { return v.ObjectType }).(pulumi.StringPtrOutput)
}

// (Default: `ACCOUNT`) The type of parameter to filter by. Valid values are: "ACCOUNT", "SESSION", "OBJECT".
func (o GetParametersResultOutput) ParameterType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetParametersResult) *string { return v.ParameterType }).(pulumi.StringPtrOutput)
}

// The pipes in the schema
func (o GetParametersResultOutput) Parameters() GetParametersParameterArrayOutput {
	return o.ApplyT(func(v GetParametersResult) []GetParametersParameter { return v.Parameters }).(GetParametersParameterArrayOutput)
}

// Allows limiting the list of parameters by name using LIKE clause. Refer to [Limiting the List of Parameters by Name](https://docs.snowflake.com/en/sql-reference/parameters.html#limiting-the-list-of-parameters-by-name)
func (o GetParametersResultOutput) Pattern() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetParametersResult) *string { return v.Pattern }).(pulumi.StringPtrOutput)
}

// If parameterType is set to "SESSION" then user is the name of the user to display session parameters for.
func (o GetParametersResultOutput) User() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetParametersResult) *string { return v.User }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetParametersResultOutput{})
}
