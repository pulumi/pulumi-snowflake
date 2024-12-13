// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Import
 *
 * ```sh
 * $ pulumi import snowflake:index/functionScala:FunctionScala example '"<database_name>"."<schema_name>"."<function_name>"(varchar, varchar, varchar)'
 * ```
 *
 * Note: Snowflake is not returning all information needed to populate the state correctly after import (e.g. data types with attributes like NUMBER(32, 10) are returned as NUMBER, default values for arguments are not returned at all).
 *
 * Also, `ALTER` for functions is very limited so most of the attributes on this resource are marked as force new. Because of that, in multiple situations plan won't be empty after importing and manual state operations may be required.
 */
export class FunctionScala extends pulumi.CustomResource {
    /**
     * Get an existing FunctionScala resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: FunctionScalaState, opts?: pulumi.CustomResourceOptions): FunctionScala {
        return new FunctionScala(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'snowflake:index/functionScala:FunctionScala';

    /**
     * Returns true if the given object is an instance of FunctionScala.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is FunctionScala {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === FunctionScala.__pulumiType;
    }

    /**
     * List of the arguments for the function. Consult the [docs](https://docs.snowflake.com/en/sql-reference/sql/create-function#all-languages) for more details.
     */
    public readonly arguments!: pulumi.Output<outputs.FunctionScalaArgument[] | undefined>;
    /**
     * Specifies a comment for the function.
     */
    public readonly comment!: pulumi.Output<string | undefined>;
    /**
     * The database in which to create the function. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
     */
    public readonly database!: pulumi.Output<string>;
    /**
     * Enable stdout/stderr fast path logging for anonyous stored procs. This is a public parameter (similar to LOG*LEVEL). For more information, check [ENABLE*CONSOLE_OUTPUT docs](https://docs.snowflake.com/en/sql-reference/parameters#enable-console-output).
     */
    public readonly enableConsoleOutput!: pulumi.Output<boolean>;
    /**
     * The names of [external access integrations](https://docs.snowflake.com/en/sql-reference/sql/create-external-access-integration) needed in order for this function’s handler code to access external networks. An external access integration specifies [network rules](https://docs.snowflake.com/en/sql-reference/sql/create-network-rule) and [secrets](https://docs.snowflake.com/en/sql-reference/sql/create-secret) that specify external locations and credentials (if any) allowed for use by handler code when making requests of an external network, such as an external REST API.
     */
    public readonly externalAccessIntegrations!: pulumi.Output<string[] | undefined>;
    /**
     * Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
     */
    public /*out*/ readonly fullyQualifiedName!: pulumi.Output<string>;
    /**
     * Defines the handler code executed when the UDF is called. Wrapping `$$` signs are added by the provider automatically; do not include them. The `functionDefinition` value must be Scala source code. For more information, see [Introduction to Scala UDFs](https://docs.snowflake.com/en/developer-guide/udf/scala/udf-scala-introduction). To mitigate permadiff on this field, the provider replaces blank characters with a space. This can lead to false positives in cases where a change in case or run of whitespace is semantically significant.
     */
    public readonly functionDefinition!: pulumi.Output<string | undefined>;
    /**
     * Specifies language for the user. Used to detect external changes.
     */
    public /*out*/ readonly functionLanguage!: pulumi.Output<string>;
    /**
     * The name of the handler method or class. If the handler is for a scalar UDF, returning a non-tabular value, the HANDLER value should be a method name, as in the following form: `MyClass.myMethod`.
     */
    public readonly handler!: pulumi.Output<string>;
    /**
     * The location (stage), path, and name of the file(s) to import, such as a JAR or other kind of file. The JAR file might contain handler dependency libraries. It can contain one or more .class files and zero or more resource files. JNI (Java Native Interface) is not supported. Snowflake prohibits loading libraries that contain native code (as opposed to Java bytecode). A non-JAR file might a file read by handler code. For an example, see [Reading a file specified statically in IMPORTS](https://docs.snowflake.com/en/developer-guide/udf/java/udf-java-cookbook.html#label-reading-file-from-java-udf-imports). Consult the [docs](https://docs.snowflake.com/en/sql-reference/sql/create-function#scala).
     */
    public readonly imports!: pulumi.Output<outputs.FunctionScalaImport[] | undefined>;
    public readonly isSecure!: pulumi.Output<string | undefined>;
    /**
     * LOG*LEVEL to use when filtering events For more information, check [LOG*LEVEL docs](https://docs.snowflake.com/en/sql-reference/parameters#log-level).
     */
    public readonly logLevel!: pulumi.Output<string>;
    /**
     * METRIC*LEVEL value to control whether to emit metrics to Event Table For more information, check [METRIC*LEVEL docs](https://docs.snowflake.com/en/sql-reference/parameters#metric-level).
     */
    public readonly metricLevel!: pulumi.Output<string>;
    /**
     * The name of the function; the identifier does not need to be unique for the schema in which the function is created because UDFs are identified and resolved by the combination of the name and argument types. Check the [docs](https://docs.snowflake.com/en/sql-reference/sql/create-function#all-languages). Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Specifies the behavior of the function when called with null inputs. Valid values are (case-insensitive): `CALLED ON NULL INPUT` | `RETURNS NULL ON NULL INPUT`.
     */
    public readonly nullInputBehavior!: pulumi.Output<string | undefined>;
    /**
     * The name and version number of Snowflake system packages required as dependencies. The value should be of the form `package_name:version_number`, where `packageName` is `snowflake_domain:package`.
     */
    public readonly packages!: pulumi.Output<string[] | undefined>;
    /**
     * Outputs the result of `SHOW PARAMETERS IN FUNCTION` for the given function.
     */
    public /*out*/ readonly parameters!: pulumi.Output<outputs.FunctionScalaParameter[]>;
    /**
     * Specifies the behavior of the function when returning results. Valid values are (case-insensitive): `VOLATILE` | `IMMUTABLE`.
     */
    public readonly returnResultsBehavior!: pulumi.Output<string | undefined>;
    /**
     * Specifies the results returned by the UDF, which determines the UDF type. Use `<result_data_type>` to create a scalar UDF that returns a single value with the specified data type. Use `TABLE (col_name col_data_type, ...)` to creates a table UDF that returns tabular results with the specified table column(s) and column type(s). For the details, consult the [docs](https://docs.snowflake.com/en/sql-reference/sql/create-function#all-languages).
     */
    public readonly returnType!: pulumi.Output<string>;
    /**
     * Specifies the Scala runtime version to use. The supported versions of Scala are: 2.12.
     */
    public readonly runtimeVersion!: pulumi.Output<string>;
    /**
     * The schema in which to create the function. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
     */
    public readonly schema!: pulumi.Output<string>;
    /**
     * Assigns the names of [secrets](https://docs.snowflake.com/en/sql-reference/sql/create-secret) to variables so that you can use the variables to reference the secrets when retrieving information from secrets in handler code. Secrets you specify here must be allowed by the [external access integration](https://docs.snowflake.com/en/sql-reference/sql/create-external-access-integration) specified as a value of this CREATE FUNCTION command’s EXTERNAL*ACCESS*INTEGRATIONS parameter.
     */
    public readonly secrets!: pulumi.Output<outputs.FunctionScalaSecret[] | undefined>;
    /**
     * Outputs the result of `SHOW FUNCTION` for the given function.
     */
    public /*out*/ readonly showOutputs!: pulumi.Output<outputs.FunctionScalaShowOutput[]>;
    /**
     * The name of the handler method or class. If the handler is for a scalar UDF, returning a non-tabular value, the HANDLER value should be a method name, as in the following form: `MyClass.myMethod`.
     */
    public readonly targetPath!: pulumi.Output<outputs.FunctionScalaTargetPath | undefined>;
    /**
     * Trace level value to use when generating/filtering trace events For more information, check [TRACE_LEVEL docs](https://docs.snowflake.com/en/sql-reference/parameters#trace-level).
     */
    public readonly traceLevel!: pulumi.Output<string>;

    /**
     * Create a FunctionScala resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: FunctionScalaArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: FunctionScalaArgs | FunctionScalaState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as FunctionScalaState | undefined;
            resourceInputs["arguments"] = state ? state.arguments : undefined;
            resourceInputs["comment"] = state ? state.comment : undefined;
            resourceInputs["database"] = state ? state.database : undefined;
            resourceInputs["enableConsoleOutput"] = state ? state.enableConsoleOutput : undefined;
            resourceInputs["externalAccessIntegrations"] = state ? state.externalAccessIntegrations : undefined;
            resourceInputs["fullyQualifiedName"] = state ? state.fullyQualifiedName : undefined;
            resourceInputs["functionDefinition"] = state ? state.functionDefinition : undefined;
            resourceInputs["functionLanguage"] = state ? state.functionLanguage : undefined;
            resourceInputs["handler"] = state ? state.handler : undefined;
            resourceInputs["imports"] = state ? state.imports : undefined;
            resourceInputs["isSecure"] = state ? state.isSecure : undefined;
            resourceInputs["logLevel"] = state ? state.logLevel : undefined;
            resourceInputs["metricLevel"] = state ? state.metricLevel : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["nullInputBehavior"] = state ? state.nullInputBehavior : undefined;
            resourceInputs["packages"] = state ? state.packages : undefined;
            resourceInputs["parameters"] = state ? state.parameters : undefined;
            resourceInputs["returnResultsBehavior"] = state ? state.returnResultsBehavior : undefined;
            resourceInputs["returnType"] = state ? state.returnType : undefined;
            resourceInputs["runtimeVersion"] = state ? state.runtimeVersion : undefined;
            resourceInputs["schema"] = state ? state.schema : undefined;
            resourceInputs["secrets"] = state ? state.secrets : undefined;
            resourceInputs["showOutputs"] = state ? state.showOutputs : undefined;
            resourceInputs["targetPath"] = state ? state.targetPath : undefined;
            resourceInputs["traceLevel"] = state ? state.traceLevel : undefined;
        } else {
            const args = argsOrState as FunctionScalaArgs | undefined;
            if ((!args || args.database === undefined) && !opts.urn) {
                throw new Error("Missing required property 'database'");
            }
            if ((!args || args.handler === undefined) && !opts.urn) {
                throw new Error("Missing required property 'handler'");
            }
            if ((!args || args.returnType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'returnType'");
            }
            if ((!args || args.runtimeVersion === undefined) && !opts.urn) {
                throw new Error("Missing required property 'runtimeVersion'");
            }
            if ((!args || args.schema === undefined) && !opts.urn) {
                throw new Error("Missing required property 'schema'");
            }
            resourceInputs["arguments"] = args ? args.arguments : undefined;
            resourceInputs["comment"] = args ? args.comment : undefined;
            resourceInputs["database"] = args ? args.database : undefined;
            resourceInputs["enableConsoleOutput"] = args ? args.enableConsoleOutput : undefined;
            resourceInputs["externalAccessIntegrations"] = args ? args.externalAccessIntegrations : undefined;
            resourceInputs["functionDefinition"] = args ? args.functionDefinition : undefined;
            resourceInputs["handler"] = args ? args.handler : undefined;
            resourceInputs["imports"] = args ? args.imports : undefined;
            resourceInputs["isSecure"] = args ? args.isSecure : undefined;
            resourceInputs["logLevel"] = args ? args.logLevel : undefined;
            resourceInputs["metricLevel"] = args ? args.metricLevel : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["nullInputBehavior"] = args ? args.nullInputBehavior : undefined;
            resourceInputs["packages"] = args ? args.packages : undefined;
            resourceInputs["returnResultsBehavior"] = args ? args.returnResultsBehavior : undefined;
            resourceInputs["returnType"] = args ? args.returnType : undefined;
            resourceInputs["runtimeVersion"] = args ? args.runtimeVersion : undefined;
            resourceInputs["schema"] = args ? args.schema : undefined;
            resourceInputs["secrets"] = args ? args.secrets : undefined;
            resourceInputs["targetPath"] = args ? args.targetPath : undefined;
            resourceInputs["traceLevel"] = args ? args.traceLevel : undefined;
            resourceInputs["fullyQualifiedName"] = undefined /*out*/;
            resourceInputs["functionLanguage"] = undefined /*out*/;
            resourceInputs["parameters"] = undefined /*out*/;
            resourceInputs["showOutputs"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(FunctionScala.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering FunctionScala resources.
 */
export interface FunctionScalaState {
    /**
     * List of the arguments for the function. Consult the [docs](https://docs.snowflake.com/en/sql-reference/sql/create-function#all-languages) for more details.
     */
    arguments?: pulumi.Input<pulumi.Input<inputs.FunctionScalaArgument>[]>;
    /**
     * Specifies a comment for the function.
     */
    comment?: pulumi.Input<string>;
    /**
     * The database in which to create the function. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
     */
    database?: pulumi.Input<string>;
    /**
     * Enable stdout/stderr fast path logging for anonyous stored procs. This is a public parameter (similar to LOG*LEVEL). For more information, check [ENABLE*CONSOLE_OUTPUT docs](https://docs.snowflake.com/en/sql-reference/parameters#enable-console-output).
     */
    enableConsoleOutput?: pulumi.Input<boolean>;
    /**
     * The names of [external access integrations](https://docs.snowflake.com/en/sql-reference/sql/create-external-access-integration) needed in order for this function’s handler code to access external networks. An external access integration specifies [network rules](https://docs.snowflake.com/en/sql-reference/sql/create-network-rule) and [secrets](https://docs.snowflake.com/en/sql-reference/sql/create-secret) that specify external locations and credentials (if any) allowed for use by handler code when making requests of an external network, such as an external REST API.
     */
    externalAccessIntegrations?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
     */
    fullyQualifiedName?: pulumi.Input<string>;
    /**
     * Defines the handler code executed when the UDF is called. Wrapping `$$` signs are added by the provider automatically; do not include them. The `functionDefinition` value must be Scala source code. For more information, see [Introduction to Scala UDFs](https://docs.snowflake.com/en/developer-guide/udf/scala/udf-scala-introduction). To mitigate permadiff on this field, the provider replaces blank characters with a space. This can lead to false positives in cases where a change in case or run of whitespace is semantically significant.
     */
    functionDefinition?: pulumi.Input<string>;
    /**
     * Specifies language for the user. Used to detect external changes.
     */
    functionLanguage?: pulumi.Input<string>;
    /**
     * The name of the handler method or class. If the handler is for a scalar UDF, returning a non-tabular value, the HANDLER value should be a method name, as in the following form: `MyClass.myMethod`.
     */
    handler?: pulumi.Input<string>;
    /**
     * The location (stage), path, and name of the file(s) to import, such as a JAR or other kind of file. The JAR file might contain handler dependency libraries. It can contain one or more .class files and zero or more resource files. JNI (Java Native Interface) is not supported. Snowflake prohibits loading libraries that contain native code (as opposed to Java bytecode). A non-JAR file might a file read by handler code. For an example, see [Reading a file specified statically in IMPORTS](https://docs.snowflake.com/en/developer-guide/udf/java/udf-java-cookbook.html#label-reading-file-from-java-udf-imports). Consult the [docs](https://docs.snowflake.com/en/sql-reference/sql/create-function#scala).
     */
    imports?: pulumi.Input<pulumi.Input<inputs.FunctionScalaImport>[]>;
    isSecure?: pulumi.Input<string>;
    /**
     * LOG*LEVEL to use when filtering events For more information, check [LOG*LEVEL docs](https://docs.snowflake.com/en/sql-reference/parameters#log-level).
     */
    logLevel?: pulumi.Input<string>;
    /**
     * METRIC*LEVEL value to control whether to emit metrics to Event Table For more information, check [METRIC*LEVEL docs](https://docs.snowflake.com/en/sql-reference/parameters#metric-level).
     */
    metricLevel?: pulumi.Input<string>;
    /**
     * The name of the function; the identifier does not need to be unique for the schema in which the function is created because UDFs are identified and resolved by the combination of the name and argument types. Check the [docs](https://docs.snowflake.com/en/sql-reference/sql/create-function#all-languages). Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
     */
    name?: pulumi.Input<string>;
    /**
     * Specifies the behavior of the function when called with null inputs. Valid values are (case-insensitive): `CALLED ON NULL INPUT` | `RETURNS NULL ON NULL INPUT`.
     */
    nullInputBehavior?: pulumi.Input<string>;
    /**
     * The name and version number of Snowflake system packages required as dependencies. The value should be of the form `package_name:version_number`, where `packageName` is `snowflake_domain:package`.
     */
    packages?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Outputs the result of `SHOW PARAMETERS IN FUNCTION` for the given function.
     */
    parameters?: pulumi.Input<pulumi.Input<inputs.FunctionScalaParameter>[]>;
    /**
     * Specifies the behavior of the function when returning results. Valid values are (case-insensitive): `VOLATILE` | `IMMUTABLE`.
     */
    returnResultsBehavior?: pulumi.Input<string>;
    /**
     * Specifies the results returned by the UDF, which determines the UDF type. Use `<result_data_type>` to create a scalar UDF that returns a single value with the specified data type. Use `TABLE (col_name col_data_type, ...)` to creates a table UDF that returns tabular results with the specified table column(s) and column type(s). For the details, consult the [docs](https://docs.snowflake.com/en/sql-reference/sql/create-function#all-languages).
     */
    returnType?: pulumi.Input<string>;
    /**
     * Specifies the Scala runtime version to use. The supported versions of Scala are: 2.12.
     */
    runtimeVersion?: pulumi.Input<string>;
    /**
     * The schema in which to create the function. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
     */
    schema?: pulumi.Input<string>;
    /**
     * Assigns the names of [secrets](https://docs.snowflake.com/en/sql-reference/sql/create-secret) to variables so that you can use the variables to reference the secrets when retrieving information from secrets in handler code. Secrets you specify here must be allowed by the [external access integration](https://docs.snowflake.com/en/sql-reference/sql/create-external-access-integration) specified as a value of this CREATE FUNCTION command’s EXTERNAL*ACCESS*INTEGRATIONS parameter.
     */
    secrets?: pulumi.Input<pulumi.Input<inputs.FunctionScalaSecret>[]>;
    /**
     * Outputs the result of `SHOW FUNCTION` for the given function.
     */
    showOutputs?: pulumi.Input<pulumi.Input<inputs.FunctionScalaShowOutput>[]>;
    /**
     * The name of the handler method or class. If the handler is for a scalar UDF, returning a non-tabular value, the HANDLER value should be a method name, as in the following form: `MyClass.myMethod`.
     */
    targetPath?: pulumi.Input<inputs.FunctionScalaTargetPath>;
    /**
     * Trace level value to use when generating/filtering trace events For more information, check [TRACE_LEVEL docs](https://docs.snowflake.com/en/sql-reference/parameters#trace-level).
     */
    traceLevel?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a FunctionScala resource.
 */
export interface FunctionScalaArgs {
    /**
     * List of the arguments for the function. Consult the [docs](https://docs.snowflake.com/en/sql-reference/sql/create-function#all-languages) for more details.
     */
    arguments?: pulumi.Input<pulumi.Input<inputs.FunctionScalaArgument>[]>;
    /**
     * Specifies a comment for the function.
     */
    comment?: pulumi.Input<string>;
    /**
     * The database in which to create the function. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
     */
    database: pulumi.Input<string>;
    /**
     * Enable stdout/stderr fast path logging for anonyous stored procs. This is a public parameter (similar to LOG*LEVEL). For more information, check [ENABLE*CONSOLE_OUTPUT docs](https://docs.snowflake.com/en/sql-reference/parameters#enable-console-output).
     */
    enableConsoleOutput?: pulumi.Input<boolean>;
    /**
     * The names of [external access integrations](https://docs.snowflake.com/en/sql-reference/sql/create-external-access-integration) needed in order for this function’s handler code to access external networks. An external access integration specifies [network rules](https://docs.snowflake.com/en/sql-reference/sql/create-network-rule) and [secrets](https://docs.snowflake.com/en/sql-reference/sql/create-secret) that specify external locations and credentials (if any) allowed for use by handler code when making requests of an external network, such as an external REST API.
     */
    externalAccessIntegrations?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Defines the handler code executed when the UDF is called. Wrapping `$$` signs are added by the provider automatically; do not include them. The `functionDefinition` value must be Scala source code. For more information, see [Introduction to Scala UDFs](https://docs.snowflake.com/en/developer-guide/udf/scala/udf-scala-introduction). To mitigate permadiff on this field, the provider replaces blank characters with a space. This can lead to false positives in cases where a change in case or run of whitespace is semantically significant.
     */
    functionDefinition?: pulumi.Input<string>;
    /**
     * The name of the handler method or class. If the handler is for a scalar UDF, returning a non-tabular value, the HANDLER value should be a method name, as in the following form: `MyClass.myMethod`.
     */
    handler: pulumi.Input<string>;
    /**
     * The location (stage), path, and name of the file(s) to import, such as a JAR or other kind of file. The JAR file might contain handler dependency libraries. It can contain one or more .class files and zero or more resource files. JNI (Java Native Interface) is not supported. Snowflake prohibits loading libraries that contain native code (as opposed to Java bytecode). A non-JAR file might a file read by handler code. For an example, see [Reading a file specified statically in IMPORTS](https://docs.snowflake.com/en/developer-guide/udf/java/udf-java-cookbook.html#label-reading-file-from-java-udf-imports). Consult the [docs](https://docs.snowflake.com/en/sql-reference/sql/create-function#scala).
     */
    imports?: pulumi.Input<pulumi.Input<inputs.FunctionScalaImport>[]>;
    isSecure?: pulumi.Input<string>;
    /**
     * LOG*LEVEL to use when filtering events For more information, check [LOG*LEVEL docs](https://docs.snowflake.com/en/sql-reference/parameters#log-level).
     */
    logLevel?: pulumi.Input<string>;
    /**
     * METRIC*LEVEL value to control whether to emit metrics to Event Table For more information, check [METRIC*LEVEL docs](https://docs.snowflake.com/en/sql-reference/parameters#metric-level).
     */
    metricLevel?: pulumi.Input<string>;
    /**
     * The name of the function; the identifier does not need to be unique for the schema in which the function is created because UDFs are identified and resolved by the combination of the name and argument types. Check the [docs](https://docs.snowflake.com/en/sql-reference/sql/create-function#all-languages). Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
     */
    name?: pulumi.Input<string>;
    /**
     * Specifies the behavior of the function when called with null inputs. Valid values are (case-insensitive): `CALLED ON NULL INPUT` | `RETURNS NULL ON NULL INPUT`.
     */
    nullInputBehavior?: pulumi.Input<string>;
    /**
     * The name and version number of Snowflake system packages required as dependencies. The value should be of the form `package_name:version_number`, where `packageName` is `snowflake_domain:package`.
     */
    packages?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Specifies the behavior of the function when returning results. Valid values are (case-insensitive): `VOLATILE` | `IMMUTABLE`.
     */
    returnResultsBehavior?: pulumi.Input<string>;
    /**
     * Specifies the results returned by the UDF, which determines the UDF type. Use `<result_data_type>` to create a scalar UDF that returns a single value with the specified data type. Use `TABLE (col_name col_data_type, ...)` to creates a table UDF that returns tabular results with the specified table column(s) and column type(s). For the details, consult the [docs](https://docs.snowflake.com/en/sql-reference/sql/create-function#all-languages).
     */
    returnType: pulumi.Input<string>;
    /**
     * Specifies the Scala runtime version to use. The supported versions of Scala are: 2.12.
     */
    runtimeVersion: pulumi.Input<string>;
    /**
     * The schema in which to create the function. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
     */
    schema: pulumi.Input<string>;
    /**
     * Assigns the names of [secrets](https://docs.snowflake.com/en/sql-reference/sql/create-secret) to variables so that you can use the variables to reference the secrets when retrieving information from secrets in handler code. Secrets you specify here must be allowed by the [external access integration](https://docs.snowflake.com/en/sql-reference/sql/create-external-access-integration) specified as a value of this CREATE FUNCTION command’s EXTERNAL*ACCESS*INTEGRATIONS parameter.
     */
    secrets?: pulumi.Input<pulumi.Input<inputs.FunctionScalaSecret>[]>;
    /**
     * The name of the handler method or class. If the handler is for a scalar UDF, returning a non-tabular value, the HANDLER value should be a method name, as in the following form: `MyClass.myMethod`.
     */
    targetPath?: pulumi.Input<inputs.FunctionScalaTargetPath>;
    /**
     * Trace level value to use when generating/filtering trace events For more information, check [TRACE_LEVEL docs](https://docs.snowflake.com/en/sql-reference/parameters#trace-level).
     */
    traceLevel?: pulumi.Input<string>;
}
