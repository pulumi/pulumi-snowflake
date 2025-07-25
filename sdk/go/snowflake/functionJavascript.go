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
// $ pulumi import snowflake:index/functionJavascript:FunctionJavascript example '"<database_name>"."<schema_name>"."<function_name>"(varchar, varchar, varchar)'
// ```
//
// Note: Snowflake is not returning all information needed to populate the state correctly after import (e.g. data types with attributes like NUMBER(32, 10) are returned as NUMBER, default values for arguments are not returned at all).
//
// Also, `ALTER` for functions is very limited so most of the attributes on this resource are marked as force new. Because of that, in multiple situations plan won't be empty after importing and manual state operations may be required.
type FunctionJavascript struct {
	pulumi.CustomResourceState

	// List of the arguments for the function. Consult the [docs](https://docs.snowflake.com/en/sql-reference/sql/create-function#all-languages) for more details.
	Arguments FunctionJavascriptArgumentArrayOutput `pulumi:"arguments"`
	// (Default: `user-defined function`) Specifies a comment for the function.
	Comment pulumi.StringPtrOutput `pulumi:"comment"`
	// The database in which to create the function. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Database pulumi.StringOutput `pulumi:"database"`
	// Enable stdout/stderr fast path logging for anonymous stored procs. This is a public parameter (similar to LOG*LEVEL). For more information, check *CONSOLE_OUTPUT docs[ENABLE](https://docs.snowflake.com/en/sql-reference/parameters#enable-console-output).
	EnableConsoleOutput pulumi.BoolOutput `pulumi:"enableConsoleOutput"`
	// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
	FullyQualifiedName pulumi.StringOutput `pulumi:"fullyQualifiedName"`
	// Defines the handler code executed when the UDF is called. Wrapping `$$` signs are added by the provider automatically; do not include them. The `functionDefinition` value must be JavaScript source code. For more information, see [Introduction to JavaScript UDFs](https://docs.snowflake.com/en/developer-guide/udf/javascript/udf-javascript-introduction). To mitigate permadiff on this field, the provider replaces blank characters with a space. This can lead to false positives in cases where a change in case or run of whitespace is semantically significant.
	FunctionDefinition pulumi.StringOutput `pulumi:"functionDefinition"`
	// Specifies language for the user. Used to detect external changes.
	FunctionLanguage pulumi.StringOutput    `pulumi:"functionLanguage"`
	IsSecure         pulumi.StringPtrOutput `pulumi:"isSecure"`
	// LOG*LEVEL to use when filtering events For more information, check [LOG*LEVEL docs](https://docs.snowflake.com/en/sql-reference/parameters#log-level).
	LogLevel pulumi.StringOutput `pulumi:"logLevel"`
	// METRIC*LEVEL value to control whether to emit metrics to Event Table For more information, check [METRIC*LEVEL docs](https://docs.snowflake.com/en/sql-reference/parameters#metric-level).
	MetricLevel pulumi.StringOutput `pulumi:"metricLevel"`
	// The name of the function; the identifier does not need to be unique for the schema in which the function is created because UDFs are identified and resolved by the combination of the name and argument types. Check the [docs](https://docs.snowflake.com/en/sql-reference/sql/create-function#all-languages). Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Name pulumi.StringOutput `pulumi:"name"`
	// Specifies the behavior of the function when called with null inputs. Valid values are (case-insensitive): `CALLED ON NULL INPUT` | `RETURNS NULL ON NULL INPUT`.
	NullInputBehavior pulumi.StringPtrOutput `pulumi:"nullInputBehavior"`
	// Outputs the result of `SHOW PARAMETERS IN FUNCTION` for the given function.
	Parameters FunctionJavascriptParameterArrayOutput `pulumi:"parameters"`
	// Specifies the behavior of the function when returning results. Valid values are (case-insensitive): `VOLATILE` | `IMMUTABLE`.
	ReturnResultsBehavior pulumi.StringPtrOutput `pulumi:"returnResultsBehavior"`
	// Specifies the results returned by the UDF, which determines the UDF type. Use `<result_data_type>` to create a scalar UDF that returns a single value with the specified data type. Use `TABLE (col_name col_data_type, ...)` to creates a table UDF that returns tabular results with the specified table column(s) and column type(s). For the details, consult the [docs](https://docs.snowflake.com/en/sql-reference/sql/create-function#all-languages).
	ReturnType pulumi.StringOutput `pulumi:"returnType"`
	// The schema in which to create the function. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Schema pulumi.StringOutput `pulumi:"schema"`
	// Outputs the result of `SHOW FUNCTION` for the given function.
	ShowOutputs FunctionJavascriptShowOutputArrayOutput `pulumi:"showOutputs"`
	// Trace level value to use when generating/filtering trace events For more information, check [TRACE_LEVEL docs](https://docs.snowflake.com/en/sql-reference/parameters#trace-level).
	TraceLevel pulumi.StringOutput `pulumi:"traceLevel"`
}

// NewFunctionJavascript registers a new resource with the given unique name, arguments, and options.
func NewFunctionJavascript(ctx *pulumi.Context,
	name string, args *FunctionJavascriptArgs, opts ...pulumi.ResourceOption) (*FunctionJavascript, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Database == nil {
		return nil, errors.New("invalid value for required argument 'Database'")
	}
	if args.FunctionDefinition == nil {
		return nil, errors.New("invalid value for required argument 'FunctionDefinition'")
	}
	if args.ReturnType == nil {
		return nil, errors.New("invalid value for required argument 'ReturnType'")
	}
	if args.Schema == nil {
		return nil, errors.New("invalid value for required argument 'Schema'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource FunctionJavascript
	err := ctx.RegisterResource("snowflake:index/functionJavascript:FunctionJavascript", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetFunctionJavascript gets an existing FunctionJavascript resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetFunctionJavascript(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *FunctionJavascriptState, opts ...pulumi.ResourceOption) (*FunctionJavascript, error) {
	var resource FunctionJavascript
	err := ctx.ReadResource("snowflake:index/functionJavascript:FunctionJavascript", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering FunctionJavascript resources.
type functionJavascriptState struct {
	// List of the arguments for the function. Consult the [docs](https://docs.snowflake.com/en/sql-reference/sql/create-function#all-languages) for more details.
	Arguments []FunctionJavascriptArgument `pulumi:"arguments"`
	// (Default: `user-defined function`) Specifies a comment for the function.
	Comment *string `pulumi:"comment"`
	// The database in which to create the function. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Database *string `pulumi:"database"`
	// Enable stdout/stderr fast path logging for anonymous stored procs. This is a public parameter (similar to LOG*LEVEL). For more information, check *CONSOLE_OUTPUT docs[ENABLE](https://docs.snowflake.com/en/sql-reference/parameters#enable-console-output).
	EnableConsoleOutput *bool `pulumi:"enableConsoleOutput"`
	// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
	FullyQualifiedName *string `pulumi:"fullyQualifiedName"`
	// Defines the handler code executed when the UDF is called. Wrapping `$$` signs are added by the provider automatically; do not include them. The `functionDefinition` value must be JavaScript source code. For more information, see [Introduction to JavaScript UDFs](https://docs.snowflake.com/en/developer-guide/udf/javascript/udf-javascript-introduction). To mitigate permadiff on this field, the provider replaces blank characters with a space. This can lead to false positives in cases where a change in case or run of whitespace is semantically significant.
	FunctionDefinition *string `pulumi:"functionDefinition"`
	// Specifies language for the user. Used to detect external changes.
	FunctionLanguage *string `pulumi:"functionLanguage"`
	IsSecure         *string `pulumi:"isSecure"`
	// LOG*LEVEL to use when filtering events For more information, check [LOG*LEVEL docs](https://docs.snowflake.com/en/sql-reference/parameters#log-level).
	LogLevel *string `pulumi:"logLevel"`
	// METRIC*LEVEL value to control whether to emit metrics to Event Table For more information, check [METRIC*LEVEL docs](https://docs.snowflake.com/en/sql-reference/parameters#metric-level).
	MetricLevel *string `pulumi:"metricLevel"`
	// The name of the function; the identifier does not need to be unique for the schema in which the function is created because UDFs are identified and resolved by the combination of the name and argument types. Check the [docs](https://docs.snowflake.com/en/sql-reference/sql/create-function#all-languages). Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Name *string `pulumi:"name"`
	// Specifies the behavior of the function when called with null inputs. Valid values are (case-insensitive): `CALLED ON NULL INPUT` | `RETURNS NULL ON NULL INPUT`.
	NullInputBehavior *string `pulumi:"nullInputBehavior"`
	// Outputs the result of `SHOW PARAMETERS IN FUNCTION` for the given function.
	Parameters []FunctionJavascriptParameter `pulumi:"parameters"`
	// Specifies the behavior of the function when returning results. Valid values are (case-insensitive): `VOLATILE` | `IMMUTABLE`.
	ReturnResultsBehavior *string `pulumi:"returnResultsBehavior"`
	// Specifies the results returned by the UDF, which determines the UDF type. Use `<result_data_type>` to create a scalar UDF that returns a single value with the specified data type. Use `TABLE (col_name col_data_type, ...)` to creates a table UDF that returns tabular results with the specified table column(s) and column type(s). For the details, consult the [docs](https://docs.snowflake.com/en/sql-reference/sql/create-function#all-languages).
	ReturnType *string `pulumi:"returnType"`
	// The schema in which to create the function. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Schema *string `pulumi:"schema"`
	// Outputs the result of `SHOW FUNCTION` for the given function.
	ShowOutputs []FunctionJavascriptShowOutput `pulumi:"showOutputs"`
	// Trace level value to use when generating/filtering trace events For more information, check [TRACE_LEVEL docs](https://docs.snowflake.com/en/sql-reference/parameters#trace-level).
	TraceLevel *string `pulumi:"traceLevel"`
}

type FunctionJavascriptState struct {
	// List of the arguments for the function. Consult the [docs](https://docs.snowflake.com/en/sql-reference/sql/create-function#all-languages) for more details.
	Arguments FunctionJavascriptArgumentArrayInput
	// (Default: `user-defined function`) Specifies a comment for the function.
	Comment pulumi.StringPtrInput
	// The database in which to create the function. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Database pulumi.StringPtrInput
	// Enable stdout/stderr fast path logging for anonymous stored procs. This is a public parameter (similar to LOG*LEVEL). For more information, check *CONSOLE_OUTPUT docs[ENABLE](https://docs.snowflake.com/en/sql-reference/parameters#enable-console-output).
	EnableConsoleOutput pulumi.BoolPtrInput
	// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
	FullyQualifiedName pulumi.StringPtrInput
	// Defines the handler code executed when the UDF is called. Wrapping `$$` signs are added by the provider automatically; do not include them. The `functionDefinition` value must be JavaScript source code. For more information, see [Introduction to JavaScript UDFs](https://docs.snowflake.com/en/developer-guide/udf/javascript/udf-javascript-introduction). To mitigate permadiff on this field, the provider replaces blank characters with a space. This can lead to false positives in cases where a change in case or run of whitespace is semantically significant.
	FunctionDefinition pulumi.StringPtrInput
	// Specifies language for the user. Used to detect external changes.
	FunctionLanguage pulumi.StringPtrInput
	IsSecure         pulumi.StringPtrInput
	// LOG*LEVEL to use when filtering events For more information, check [LOG*LEVEL docs](https://docs.snowflake.com/en/sql-reference/parameters#log-level).
	LogLevel pulumi.StringPtrInput
	// METRIC*LEVEL value to control whether to emit metrics to Event Table For more information, check [METRIC*LEVEL docs](https://docs.snowflake.com/en/sql-reference/parameters#metric-level).
	MetricLevel pulumi.StringPtrInput
	// The name of the function; the identifier does not need to be unique for the schema in which the function is created because UDFs are identified and resolved by the combination of the name and argument types. Check the [docs](https://docs.snowflake.com/en/sql-reference/sql/create-function#all-languages). Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Name pulumi.StringPtrInput
	// Specifies the behavior of the function when called with null inputs. Valid values are (case-insensitive): `CALLED ON NULL INPUT` | `RETURNS NULL ON NULL INPUT`.
	NullInputBehavior pulumi.StringPtrInput
	// Outputs the result of `SHOW PARAMETERS IN FUNCTION` for the given function.
	Parameters FunctionJavascriptParameterArrayInput
	// Specifies the behavior of the function when returning results. Valid values are (case-insensitive): `VOLATILE` | `IMMUTABLE`.
	ReturnResultsBehavior pulumi.StringPtrInput
	// Specifies the results returned by the UDF, which determines the UDF type. Use `<result_data_type>` to create a scalar UDF that returns a single value with the specified data type. Use `TABLE (col_name col_data_type, ...)` to creates a table UDF that returns tabular results with the specified table column(s) and column type(s). For the details, consult the [docs](https://docs.snowflake.com/en/sql-reference/sql/create-function#all-languages).
	ReturnType pulumi.StringPtrInput
	// The schema in which to create the function. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Schema pulumi.StringPtrInput
	// Outputs the result of `SHOW FUNCTION` for the given function.
	ShowOutputs FunctionJavascriptShowOutputArrayInput
	// Trace level value to use when generating/filtering trace events For more information, check [TRACE_LEVEL docs](https://docs.snowflake.com/en/sql-reference/parameters#trace-level).
	TraceLevel pulumi.StringPtrInput
}

func (FunctionJavascriptState) ElementType() reflect.Type {
	return reflect.TypeOf((*functionJavascriptState)(nil)).Elem()
}

type functionJavascriptArgs struct {
	// List of the arguments for the function. Consult the [docs](https://docs.snowflake.com/en/sql-reference/sql/create-function#all-languages) for more details.
	Arguments []FunctionJavascriptArgument `pulumi:"arguments"`
	// (Default: `user-defined function`) Specifies a comment for the function.
	Comment *string `pulumi:"comment"`
	// The database in which to create the function. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Database string `pulumi:"database"`
	// Enable stdout/stderr fast path logging for anonymous stored procs. This is a public parameter (similar to LOG*LEVEL). For more information, check *CONSOLE_OUTPUT docs[ENABLE](https://docs.snowflake.com/en/sql-reference/parameters#enable-console-output).
	EnableConsoleOutput *bool `pulumi:"enableConsoleOutput"`
	// Defines the handler code executed when the UDF is called. Wrapping `$$` signs are added by the provider automatically; do not include them. The `functionDefinition` value must be JavaScript source code. For more information, see [Introduction to JavaScript UDFs](https://docs.snowflake.com/en/developer-guide/udf/javascript/udf-javascript-introduction). To mitigate permadiff on this field, the provider replaces blank characters with a space. This can lead to false positives in cases where a change in case or run of whitespace is semantically significant.
	FunctionDefinition string  `pulumi:"functionDefinition"`
	IsSecure           *string `pulumi:"isSecure"`
	// LOG*LEVEL to use when filtering events For more information, check [LOG*LEVEL docs](https://docs.snowflake.com/en/sql-reference/parameters#log-level).
	LogLevel *string `pulumi:"logLevel"`
	// METRIC*LEVEL value to control whether to emit metrics to Event Table For more information, check [METRIC*LEVEL docs](https://docs.snowflake.com/en/sql-reference/parameters#metric-level).
	MetricLevel *string `pulumi:"metricLevel"`
	// The name of the function; the identifier does not need to be unique for the schema in which the function is created because UDFs are identified and resolved by the combination of the name and argument types. Check the [docs](https://docs.snowflake.com/en/sql-reference/sql/create-function#all-languages). Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Name *string `pulumi:"name"`
	// Specifies the behavior of the function when called with null inputs. Valid values are (case-insensitive): `CALLED ON NULL INPUT` | `RETURNS NULL ON NULL INPUT`.
	NullInputBehavior *string `pulumi:"nullInputBehavior"`
	// Specifies the behavior of the function when returning results. Valid values are (case-insensitive): `VOLATILE` | `IMMUTABLE`.
	ReturnResultsBehavior *string `pulumi:"returnResultsBehavior"`
	// Specifies the results returned by the UDF, which determines the UDF type. Use `<result_data_type>` to create a scalar UDF that returns a single value with the specified data type. Use `TABLE (col_name col_data_type, ...)` to creates a table UDF that returns tabular results with the specified table column(s) and column type(s). For the details, consult the [docs](https://docs.snowflake.com/en/sql-reference/sql/create-function#all-languages).
	ReturnType string `pulumi:"returnType"`
	// The schema in which to create the function. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Schema string `pulumi:"schema"`
	// Trace level value to use when generating/filtering trace events For more information, check [TRACE_LEVEL docs](https://docs.snowflake.com/en/sql-reference/parameters#trace-level).
	TraceLevel *string `pulumi:"traceLevel"`
}

// The set of arguments for constructing a FunctionJavascript resource.
type FunctionJavascriptArgs struct {
	// List of the arguments for the function. Consult the [docs](https://docs.snowflake.com/en/sql-reference/sql/create-function#all-languages) for more details.
	Arguments FunctionJavascriptArgumentArrayInput
	// (Default: `user-defined function`) Specifies a comment for the function.
	Comment pulumi.StringPtrInput
	// The database in which to create the function. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Database pulumi.StringInput
	// Enable stdout/stderr fast path logging for anonymous stored procs. This is a public parameter (similar to LOG*LEVEL). For more information, check *CONSOLE_OUTPUT docs[ENABLE](https://docs.snowflake.com/en/sql-reference/parameters#enable-console-output).
	EnableConsoleOutput pulumi.BoolPtrInput
	// Defines the handler code executed when the UDF is called. Wrapping `$$` signs are added by the provider automatically; do not include them. The `functionDefinition` value must be JavaScript source code. For more information, see [Introduction to JavaScript UDFs](https://docs.snowflake.com/en/developer-guide/udf/javascript/udf-javascript-introduction). To mitigate permadiff on this field, the provider replaces blank characters with a space. This can lead to false positives in cases where a change in case or run of whitespace is semantically significant.
	FunctionDefinition pulumi.StringInput
	IsSecure           pulumi.StringPtrInput
	// LOG*LEVEL to use when filtering events For more information, check [LOG*LEVEL docs](https://docs.snowflake.com/en/sql-reference/parameters#log-level).
	LogLevel pulumi.StringPtrInput
	// METRIC*LEVEL value to control whether to emit metrics to Event Table For more information, check [METRIC*LEVEL docs](https://docs.snowflake.com/en/sql-reference/parameters#metric-level).
	MetricLevel pulumi.StringPtrInput
	// The name of the function; the identifier does not need to be unique for the schema in which the function is created because UDFs are identified and resolved by the combination of the name and argument types. Check the [docs](https://docs.snowflake.com/en/sql-reference/sql/create-function#all-languages). Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Name pulumi.StringPtrInput
	// Specifies the behavior of the function when called with null inputs. Valid values are (case-insensitive): `CALLED ON NULL INPUT` | `RETURNS NULL ON NULL INPUT`.
	NullInputBehavior pulumi.StringPtrInput
	// Specifies the behavior of the function when returning results. Valid values are (case-insensitive): `VOLATILE` | `IMMUTABLE`.
	ReturnResultsBehavior pulumi.StringPtrInput
	// Specifies the results returned by the UDF, which determines the UDF type. Use `<result_data_type>` to create a scalar UDF that returns a single value with the specified data type. Use `TABLE (col_name col_data_type, ...)` to creates a table UDF that returns tabular results with the specified table column(s) and column type(s). For the details, consult the [docs](https://docs.snowflake.com/en/sql-reference/sql/create-function#all-languages).
	ReturnType pulumi.StringInput
	// The schema in which to create the function. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
	Schema pulumi.StringInput
	// Trace level value to use when generating/filtering trace events For more information, check [TRACE_LEVEL docs](https://docs.snowflake.com/en/sql-reference/parameters#trace-level).
	TraceLevel pulumi.StringPtrInput
}

func (FunctionJavascriptArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*functionJavascriptArgs)(nil)).Elem()
}

type FunctionJavascriptInput interface {
	pulumi.Input

	ToFunctionJavascriptOutput() FunctionJavascriptOutput
	ToFunctionJavascriptOutputWithContext(ctx context.Context) FunctionJavascriptOutput
}

func (*FunctionJavascript) ElementType() reflect.Type {
	return reflect.TypeOf((**FunctionJavascript)(nil)).Elem()
}

func (i *FunctionJavascript) ToFunctionJavascriptOutput() FunctionJavascriptOutput {
	return i.ToFunctionJavascriptOutputWithContext(context.Background())
}

func (i *FunctionJavascript) ToFunctionJavascriptOutputWithContext(ctx context.Context) FunctionJavascriptOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FunctionJavascriptOutput)
}

// FunctionJavascriptArrayInput is an input type that accepts FunctionJavascriptArray and FunctionJavascriptArrayOutput values.
// You can construct a concrete instance of `FunctionJavascriptArrayInput` via:
//
//	FunctionJavascriptArray{ FunctionJavascriptArgs{...} }
type FunctionJavascriptArrayInput interface {
	pulumi.Input

	ToFunctionJavascriptArrayOutput() FunctionJavascriptArrayOutput
	ToFunctionJavascriptArrayOutputWithContext(context.Context) FunctionJavascriptArrayOutput
}

type FunctionJavascriptArray []FunctionJavascriptInput

func (FunctionJavascriptArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*FunctionJavascript)(nil)).Elem()
}

func (i FunctionJavascriptArray) ToFunctionJavascriptArrayOutput() FunctionJavascriptArrayOutput {
	return i.ToFunctionJavascriptArrayOutputWithContext(context.Background())
}

func (i FunctionJavascriptArray) ToFunctionJavascriptArrayOutputWithContext(ctx context.Context) FunctionJavascriptArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FunctionJavascriptArrayOutput)
}

// FunctionJavascriptMapInput is an input type that accepts FunctionJavascriptMap and FunctionJavascriptMapOutput values.
// You can construct a concrete instance of `FunctionJavascriptMapInput` via:
//
//	FunctionJavascriptMap{ "key": FunctionJavascriptArgs{...} }
type FunctionJavascriptMapInput interface {
	pulumi.Input

	ToFunctionJavascriptMapOutput() FunctionJavascriptMapOutput
	ToFunctionJavascriptMapOutputWithContext(context.Context) FunctionJavascriptMapOutput
}

type FunctionJavascriptMap map[string]FunctionJavascriptInput

func (FunctionJavascriptMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*FunctionJavascript)(nil)).Elem()
}

func (i FunctionJavascriptMap) ToFunctionJavascriptMapOutput() FunctionJavascriptMapOutput {
	return i.ToFunctionJavascriptMapOutputWithContext(context.Background())
}

func (i FunctionJavascriptMap) ToFunctionJavascriptMapOutputWithContext(ctx context.Context) FunctionJavascriptMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FunctionJavascriptMapOutput)
}

type FunctionJavascriptOutput struct{ *pulumi.OutputState }

func (FunctionJavascriptOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**FunctionJavascript)(nil)).Elem()
}

func (o FunctionJavascriptOutput) ToFunctionJavascriptOutput() FunctionJavascriptOutput {
	return o
}

func (o FunctionJavascriptOutput) ToFunctionJavascriptOutputWithContext(ctx context.Context) FunctionJavascriptOutput {
	return o
}

// List of the arguments for the function. Consult the [docs](https://docs.snowflake.com/en/sql-reference/sql/create-function#all-languages) for more details.
func (o FunctionJavascriptOutput) Arguments() FunctionJavascriptArgumentArrayOutput {
	return o.ApplyT(func(v *FunctionJavascript) FunctionJavascriptArgumentArrayOutput { return v.Arguments }).(FunctionJavascriptArgumentArrayOutput)
}

// (Default: `user-defined function`) Specifies a comment for the function.
func (o FunctionJavascriptOutput) Comment() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *FunctionJavascript) pulumi.StringPtrOutput { return v.Comment }).(pulumi.StringPtrOutput)
}

// The database in which to create the function. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
func (o FunctionJavascriptOutput) Database() pulumi.StringOutput {
	return o.ApplyT(func(v *FunctionJavascript) pulumi.StringOutput { return v.Database }).(pulumi.StringOutput)
}

// Enable stdout/stderr fast path logging for anonymous stored procs. This is a public parameter (similar to LOG*LEVEL). For more information, check *CONSOLE_OUTPUT docs[ENABLE](https://docs.snowflake.com/en/sql-reference/parameters#enable-console-output).
func (o FunctionJavascriptOutput) EnableConsoleOutput() pulumi.BoolOutput {
	return o.ApplyT(func(v *FunctionJavascript) pulumi.BoolOutput { return v.EnableConsoleOutput }).(pulumi.BoolOutput)
}

// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
func (o FunctionJavascriptOutput) FullyQualifiedName() pulumi.StringOutput {
	return o.ApplyT(func(v *FunctionJavascript) pulumi.StringOutput { return v.FullyQualifiedName }).(pulumi.StringOutput)
}

// Defines the handler code executed when the UDF is called. Wrapping `$$` signs are added by the provider automatically; do not include them. The `functionDefinition` value must be JavaScript source code. For more information, see [Introduction to JavaScript UDFs](https://docs.snowflake.com/en/developer-guide/udf/javascript/udf-javascript-introduction). To mitigate permadiff on this field, the provider replaces blank characters with a space. This can lead to false positives in cases where a change in case or run of whitespace is semantically significant.
func (o FunctionJavascriptOutput) FunctionDefinition() pulumi.StringOutput {
	return o.ApplyT(func(v *FunctionJavascript) pulumi.StringOutput { return v.FunctionDefinition }).(pulumi.StringOutput)
}

// Specifies language for the user. Used to detect external changes.
func (o FunctionJavascriptOutput) FunctionLanguage() pulumi.StringOutput {
	return o.ApplyT(func(v *FunctionJavascript) pulumi.StringOutput { return v.FunctionLanguage }).(pulumi.StringOutput)
}

func (o FunctionJavascriptOutput) IsSecure() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *FunctionJavascript) pulumi.StringPtrOutput { return v.IsSecure }).(pulumi.StringPtrOutput)
}

// LOG*LEVEL to use when filtering events For more information, check [LOG*LEVEL docs](https://docs.snowflake.com/en/sql-reference/parameters#log-level).
func (o FunctionJavascriptOutput) LogLevel() pulumi.StringOutput {
	return o.ApplyT(func(v *FunctionJavascript) pulumi.StringOutput { return v.LogLevel }).(pulumi.StringOutput)
}

// METRIC*LEVEL value to control whether to emit metrics to Event Table For more information, check [METRIC*LEVEL docs](https://docs.snowflake.com/en/sql-reference/parameters#metric-level).
func (o FunctionJavascriptOutput) MetricLevel() pulumi.StringOutput {
	return o.ApplyT(func(v *FunctionJavascript) pulumi.StringOutput { return v.MetricLevel }).(pulumi.StringOutput)
}

// The name of the function; the identifier does not need to be unique for the schema in which the function is created because UDFs are identified and resolved by the combination of the name and argument types. Check the [docs](https://docs.snowflake.com/en/sql-reference/sql/create-function#all-languages). Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
func (o FunctionJavascriptOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *FunctionJavascript) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Specifies the behavior of the function when called with null inputs. Valid values are (case-insensitive): `CALLED ON NULL INPUT` | `RETURNS NULL ON NULL INPUT`.
func (o FunctionJavascriptOutput) NullInputBehavior() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *FunctionJavascript) pulumi.StringPtrOutput { return v.NullInputBehavior }).(pulumi.StringPtrOutput)
}

// Outputs the result of `SHOW PARAMETERS IN FUNCTION` for the given function.
func (o FunctionJavascriptOutput) Parameters() FunctionJavascriptParameterArrayOutput {
	return o.ApplyT(func(v *FunctionJavascript) FunctionJavascriptParameterArrayOutput { return v.Parameters }).(FunctionJavascriptParameterArrayOutput)
}

// Specifies the behavior of the function when returning results. Valid values are (case-insensitive): `VOLATILE` | `IMMUTABLE`.
func (o FunctionJavascriptOutput) ReturnResultsBehavior() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *FunctionJavascript) pulumi.StringPtrOutput { return v.ReturnResultsBehavior }).(pulumi.StringPtrOutput)
}

// Specifies the results returned by the UDF, which determines the UDF type. Use `<result_data_type>` to create a scalar UDF that returns a single value with the specified data type. Use `TABLE (col_name col_data_type, ...)` to creates a table UDF that returns tabular results with the specified table column(s) and column type(s). For the details, consult the [docs](https://docs.snowflake.com/en/sql-reference/sql/create-function#all-languages).
func (o FunctionJavascriptOutput) ReturnType() pulumi.StringOutput {
	return o.ApplyT(func(v *FunctionJavascript) pulumi.StringOutput { return v.ReturnType }).(pulumi.StringOutput)
}

// The schema in which to create the function. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
func (o FunctionJavascriptOutput) Schema() pulumi.StringOutput {
	return o.ApplyT(func(v *FunctionJavascript) pulumi.StringOutput { return v.Schema }).(pulumi.StringOutput)
}

// Outputs the result of `SHOW FUNCTION` for the given function.
func (o FunctionJavascriptOutput) ShowOutputs() FunctionJavascriptShowOutputArrayOutput {
	return o.ApplyT(func(v *FunctionJavascript) FunctionJavascriptShowOutputArrayOutput { return v.ShowOutputs }).(FunctionJavascriptShowOutputArrayOutput)
}

// Trace level value to use when generating/filtering trace events For more information, check [TRACE_LEVEL docs](https://docs.snowflake.com/en/sql-reference/parameters#trace-level).
func (o FunctionJavascriptOutput) TraceLevel() pulumi.StringOutput {
	return o.ApplyT(func(v *FunctionJavascript) pulumi.StringOutput { return v.TraceLevel }).(pulumi.StringOutput)
}

type FunctionJavascriptArrayOutput struct{ *pulumi.OutputState }

func (FunctionJavascriptArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*FunctionJavascript)(nil)).Elem()
}

func (o FunctionJavascriptArrayOutput) ToFunctionJavascriptArrayOutput() FunctionJavascriptArrayOutput {
	return o
}

func (o FunctionJavascriptArrayOutput) ToFunctionJavascriptArrayOutputWithContext(ctx context.Context) FunctionJavascriptArrayOutput {
	return o
}

func (o FunctionJavascriptArrayOutput) Index(i pulumi.IntInput) FunctionJavascriptOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *FunctionJavascript {
		return vs[0].([]*FunctionJavascript)[vs[1].(int)]
	}).(FunctionJavascriptOutput)
}

type FunctionJavascriptMapOutput struct{ *pulumi.OutputState }

func (FunctionJavascriptMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*FunctionJavascript)(nil)).Elem()
}

func (o FunctionJavascriptMapOutput) ToFunctionJavascriptMapOutput() FunctionJavascriptMapOutput {
	return o
}

func (o FunctionJavascriptMapOutput) ToFunctionJavascriptMapOutputWithContext(ctx context.Context) FunctionJavascriptMapOutput {
	return o
}

func (o FunctionJavascriptMapOutput) MapIndex(k pulumi.StringInput) FunctionJavascriptOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *FunctionJavascript {
		return vs[0].(map[string]*FunctionJavascript)[vs[1].(string)]
	}).(FunctionJavascriptOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*FunctionJavascriptInput)(nil)).Elem(), &FunctionJavascript{})
	pulumi.RegisterInputType(reflect.TypeOf((*FunctionJavascriptArrayInput)(nil)).Elem(), FunctionJavascriptArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*FunctionJavascriptMapInput)(nil)).Elem(), FunctionJavascriptMap{})
	pulumi.RegisterOutputType(FunctionJavascriptOutput{})
	pulumi.RegisterOutputType(FunctionJavascriptArrayOutput{})
	pulumi.RegisterOutputType(FunctionJavascriptMapOutput{})
}
