// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * ## Import
 *
 * # format is database name | schema name | function name | <list of arg types, separated with '-'>
 *
 * ```sh
 *  $ pulumi import snowflake:index/function:Function example 'dbName|schemaName|functionName|varchar-varchar-varchar'
 * ```
 */
export class Function extends pulumi.CustomResource {
    /**
     * Get an existing Function resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: FunctionState, opts?: pulumi.CustomResourceOptions): Function {
        return new Function(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'snowflake:index/function:Function';

    /**
     * Returns true if the given object is an instance of Function.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Function {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Function.__pulumiType;
    }

    /**
     * List of the arguments for the function
     */
    public readonly arguments!: pulumi.Output<outputs.FunctionArgument[] | undefined>;
    /**
     * Specifies a comment for the function.
     */
    public readonly comment!: pulumi.Output<string | undefined>;
    /**
     * The database in which to create the function. Don't use the | character.
     */
    public readonly database!: pulumi.Output<string>;
    /**
     * The handler method for Java / Python function.
     */
    public readonly handler!: pulumi.Output<string | undefined>;
    /**
     * Imports for Java / Python functions. For Java this a list of jar files, for Python this is a list of Python files.
     */
    public readonly imports!: pulumi.Output<string[] | undefined>;
    /**
     * The language of the statement
     */
    public readonly language!: pulumi.Output<string | undefined>;
    /**
     * Specifies the identifier for the function; does not have to be unique for the schema in which the function is created.
     * Don't use the | character.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Specifies the behavior of the function when called with null inputs.
     */
    public readonly nullInputBehavior!: pulumi.Output<string | undefined>;
    /**
     * List of package imports to use for Java / Python functions. For Java, package imports should be of the form:
     * package_name:version_number, where package_name is snowflake_domain:package. For Python use it should be:
     * ('numpy','pandas','xgboost==1.5.0').
     */
    public readonly packages!: pulumi.Output<string[] | undefined>;
    /**
     * Specifies the behavior of the function when returning results
     */
    public readonly returnBehavior!: pulumi.Output<string | undefined>;
    /**
     * The return type of the function
     */
    public readonly returnType!: pulumi.Output<string>;
    /**
     * Required for Python functions. Specifies Python runtime version.
     */
    public readonly runtimeVersion!: pulumi.Output<string | undefined>;
    /**
     * The schema in which to create the function. Don't use the | character.
     */
    public readonly schema!: pulumi.Output<string>;
    /**
     * Specifies the javascript / java / sql / python code used to create the function.
     */
    public readonly statement!: pulumi.Output<string>;
    /**
     * The target path for the Java / Python functions. For Java, it is the path of compiled jar files and for the Python it is
     * the path of the Python files.
     */
    public readonly targetPath!: pulumi.Output<string | undefined>;

    /**
     * Create a Function resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: FunctionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: FunctionArgs | FunctionState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as FunctionState | undefined;
            resourceInputs["arguments"] = state ? state.arguments : undefined;
            resourceInputs["comment"] = state ? state.comment : undefined;
            resourceInputs["database"] = state ? state.database : undefined;
            resourceInputs["handler"] = state ? state.handler : undefined;
            resourceInputs["imports"] = state ? state.imports : undefined;
            resourceInputs["language"] = state ? state.language : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["nullInputBehavior"] = state ? state.nullInputBehavior : undefined;
            resourceInputs["packages"] = state ? state.packages : undefined;
            resourceInputs["returnBehavior"] = state ? state.returnBehavior : undefined;
            resourceInputs["returnType"] = state ? state.returnType : undefined;
            resourceInputs["runtimeVersion"] = state ? state.runtimeVersion : undefined;
            resourceInputs["schema"] = state ? state.schema : undefined;
            resourceInputs["statement"] = state ? state.statement : undefined;
            resourceInputs["targetPath"] = state ? state.targetPath : undefined;
        } else {
            const args = argsOrState as FunctionArgs | undefined;
            if ((!args || args.database === undefined) && !opts.urn) {
                throw new Error("Missing required property 'database'");
            }
            if ((!args || args.returnType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'returnType'");
            }
            if ((!args || args.schema === undefined) && !opts.urn) {
                throw new Error("Missing required property 'schema'");
            }
            if ((!args || args.statement === undefined) && !opts.urn) {
                throw new Error("Missing required property 'statement'");
            }
            resourceInputs["arguments"] = args ? args.arguments : undefined;
            resourceInputs["comment"] = args ? args.comment : undefined;
            resourceInputs["database"] = args ? args.database : undefined;
            resourceInputs["handler"] = args ? args.handler : undefined;
            resourceInputs["imports"] = args ? args.imports : undefined;
            resourceInputs["language"] = args ? args.language : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["nullInputBehavior"] = args ? args.nullInputBehavior : undefined;
            resourceInputs["packages"] = args ? args.packages : undefined;
            resourceInputs["returnBehavior"] = args ? args.returnBehavior : undefined;
            resourceInputs["returnType"] = args ? args.returnType : undefined;
            resourceInputs["runtimeVersion"] = args ? args.runtimeVersion : undefined;
            resourceInputs["schema"] = args ? args.schema : undefined;
            resourceInputs["statement"] = args ? args.statement : undefined;
            resourceInputs["targetPath"] = args ? args.targetPath : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Function.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Function resources.
 */
export interface FunctionState {
    /**
     * List of the arguments for the function
     */
    arguments?: pulumi.Input<pulumi.Input<inputs.FunctionArgument>[]>;
    /**
     * Specifies a comment for the function.
     */
    comment?: pulumi.Input<string>;
    /**
     * The database in which to create the function. Don't use the | character.
     */
    database?: pulumi.Input<string>;
    /**
     * The handler method for Java / Python function.
     */
    handler?: pulumi.Input<string>;
    /**
     * Imports for Java / Python functions. For Java this a list of jar files, for Python this is a list of Python files.
     */
    imports?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The language of the statement
     */
    language?: pulumi.Input<string>;
    /**
     * Specifies the identifier for the function; does not have to be unique for the schema in which the function is created.
     * Don't use the | character.
     */
    name?: pulumi.Input<string>;
    /**
     * Specifies the behavior of the function when called with null inputs.
     */
    nullInputBehavior?: pulumi.Input<string>;
    /**
     * List of package imports to use for Java / Python functions. For Java, package imports should be of the form:
     * package_name:version_number, where package_name is snowflake_domain:package. For Python use it should be:
     * ('numpy','pandas','xgboost==1.5.0').
     */
    packages?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Specifies the behavior of the function when returning results
     */
    returnBehavior?: pulumi.Input<string>;
    /**
     * The return type of the function
     */
    returnType?: pulumi.Input<string>;
    /**
     * Required for Python functions. Specifies Python runtime version.
     */
    runtimeVersion?: pulumi.Input<string>;
    /**
     * The schema in which to create the function. Don't use the | character.
     */
    schema?: pulumi.Input<string>;
    /**
     * Specifies the javascript / java / sql / python code used to create the function.
     */
    statement?: pulumi.Input<string>;
    /**
     * The target path for the Java / Python functions. For Java, it is the path of compiled jar files and for the Python it is
     * the path of the Python files.
     */
    targetPath?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Function resource.
 */
export interface FunctionArgs {
    /**
     * List of the arguments for the function
     */
    arguments?: pulumi.Input<pulumi.Input<inputs.FunctionArgument>[]>;
    /**
     * Specifies a comment for the function.
     */
    comment?: pulumi.Input<string>;
    /**
     * The database in which to create the function. Don't use the | character.
     */
    database: pulumi.Input<string>;
    /**
     * The handler method for Java / Python function.
     */
    handler?: pulumi.Input<string>;
    /**
     * Imports for Java / Python functions. For Java this a list of jar files, for Python this is a list of Python files.
     */
    imports?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The language of the statement
     */
    language?: pulumi.Input<string>;
    /**
     * Specifies the identifier for the function; does not have to be unique for the schema in which the function is created.
     * Don't use the | character.
     */
    name?: pulumi.Input<string>;
    /**
     * Specifies the behavior of the function when called with null inputs.
     */
    nullInputBehavior?: pulumi.Input<string>;
    /**
     * List of package imports to use for Java / Python functions. For Java, package imports should be of the form:
     * package_name:version_number, where package_name is snowflake_domain:package. For Python use it should be:
     * ('numpy','pandas','xgboost==1.5.0').
     */
    packages?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Specifies the behavior of the function when returning results
     */
    returnBehavior?: pulumi.Input<string>;
    /**
     * The return type of the function
     */
    returnType: pulumi.Input<string>;
    /**
     * Required for Python functions. Specifies Python runtime version.
     */
    runtimeVersion?: pulumi.Input<string>;
    /**
     * The schema in which to create the function. Don't use the | character.
     */
    schema: pulumi.Input<string>;
    /**
     * Specifies the javascript / java / sql / python code used to create the function.
     */
    statement: pulumi.Input<string>;
    /**
     * The target path for the Java / Python functions. For Java, it is the path of compiled jar files and for the Python it is
     * the path of the Python files.
     */
    targetPath?: pulumi.Input<string>;
}
