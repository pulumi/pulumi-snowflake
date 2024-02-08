// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Import
 *
 * format is database name | schema name | stored procedure name | <list of arg types, separated with '-'>
 *
 * ```sh
 * $ pulumi import snowflake:index/procedure:Procedure example 'dbName|schemaName|procedureName|varchar-varchar-varchar'
 * ```
 */
export class Procedure extends pulumi.CustomResource {
    /**
     * Get an existing Procedure resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ProcedureState, opts?: pulumi.CustomResourceOptions): Procedure {
        return new Procedure(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'snowflake:index/procedure:Procedure';

    /**
     * Returns true if the given object is an instance of Procedure.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Procedure {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Procedure.__pulumiType;
    }

    /**
     * List of the arguments for the procedure
     */
    public readonly arguments!: pulumi.Output<outputs.ProcedureArgument[] | undefined>;
    /**
     * Specifies a comment for the procedure.
     */
    public readonly comment!: pulumi.Output<string | undefined>;
    /**
     * The database in which to create the procedure. Don't use the | character.
     */
    public readonly database!: pulumi.Output<string>;
    /**
     * Sets execute context - see caller's rights and owner's rights
     */
    public readonly executeAs!: pulumi.Output<string | undefined>;
    /**
     * The handler method for Java / Python procedures.
     */
    public readonly handler!: pulumi.Output<string | undefined>;
    /**
     * Imports for Java / Python procedures. For Java this a list of jar files, for Python this is a list of Python files.
     */
    public readonly imports!: pulumi.Output<string[] | undefined>;
    /**
     * Specifies the language of the stored procedure code.
     */
    public readonly language!: pulumi.Output<string | undefined>;
    /**
     * The argument name
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Specifies the behavior of the procedure when called with null inputs.
     */
    public readonly nullInputBehavior!: pulumi.Output<string | undefined>;
    /**
     * List of package imports to use for Java / Python procedures. For Java, package imports should be of the form: package*name:version*number, where package*name is snowflake*domain:package. For Python use it should be: ('numpy','pandas','xgboost==1.5.0').
     */
    public readonly packages!: pulumi.Output<string[] | undefined>;
    /**
     * Specifies the behavior of the function when returning results
     */
    public readonly returnBehavior!: pulumi.Output<string | undefined>;
    /**
     * The return type of the procedure
     */
    public readonly returnType!: pulumi.Output<string>;
    /**
     * Required for Python procedures. Specifies Python runtime version.
     */
    public readonly runtimeVersion!: pulumi.Output<string | undefined>;
    /**
     * The schema in which to create the procedure. Don't use the | character.
     */
    public readonly schema!: pulumi.Output<string>;
    /**
     * Specifies the code used to create the procedure.
     */
    public readonly statement!: pulumi.Output<string>;

    /**
     * Create a Procedure resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ProcedureArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ProcedureArgs | ProcedureState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ProcedureState | undefined;
            resourceInputs["arguments"] = state ? state.arguments : undefined;
            resourceInputs["comment"] = state ? state.comment : undefined;
            resourceInputs["database"] = state ? state.database : undefined;
            resourceInputs["executeAs"] = state ? state.executeAs : undefined;
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
        } else {
            const args = argsOrState as ProcedureArgs | undefined;
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
            resourceInputs["executeAs"] = args ? args.executeAs : undefined;
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
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Procedure.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Procedure resources.
 */
export interface ProcedureState {
    /**
     * List of the arguments for the procedure
     */
    arguments?: pulumi.Input<pulumi.Input<inputs.ProcedureArgument>[]>;
    /**
     * Specifies a comment for the procedure.
     */
    comment?: pulumi.Input<string>;
    /**
     * The database in which to create the procedure. Don't use the | character.
     */
    database?: pulumi.Input<string>;
    /**
     * Sets execute context - see caller's rights and owner's rights
     */
    executeAs?: pulumi.Input<string>;
    /**
     * The handler method for Java / Python procedures.
     */
    handler?: pulumi.Input<string>;
    /**
     * Imports for Java / Python procedures. For Java this a list of jar files, for Python this is a list of Python files.
     */
    imports?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Specifies the language of the stored procedure code.
     */
    language?: pulumi.Input<string>;
    /**
     * The argument name
     */
    name?: pulumi.Input<string>;
    /**
     * Specifies the behavior of the procedure when called with null inputs.
     */
    nullInputBehavior?: pulumi.Input<string>;
    /**
     * List of package imports to use for Java / Python procedures. For Java, package imports should be of the form: package*name:version*number, where package*name is snowflake*domain:package. For Python use it should be: ('numpy','pandas','xgboost==1.5.0').
     */
    packages?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Specifies the behavior of the function when returning results
     */
    returnBehavior?: pulumi.Input<string>;
    /**
     * The return type of the procedure
     */
    returnType?: pulumi.Input<string>;
    /**
     * Required for Python procedures. Specifies Python runtime version.
     */
    runtimeVersion?: pulumi.Input<string>;
    /**
     * The schema in which to create the procedure. Don't use the | character.
     */
    schema?: pulumi.Input<string>;
    /**
     * Specifies the code used to create the procedure.
     */
    statement?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Procedure resource.
 */
export interface ProcedureArgs {
    /**
     * List of the arguments for the procedure
     */
    arguments?: pulumi.Input<pulumi.Input<inputs.ProcedureArgument>[]>;
    /**
     * Specifies a comment for the procedure.
     */
    comment?: pulumi.Input<string>;
    /**
     * The database in which to create the procedure. Don't use the | character.
     */
    database: pulumi.Input<string>;
    /**
     * Sets execute context - see caller's rights and owner's rights
     */
    executeAs?: pulumi.Input<string>;
    /**
     * The handler method for Java / Python procedures.
     */
    handler?: pulumi.Input<string>;
    /**
     * Imports for Java / Python procedures. For Java this a list of jar files, for Python this is a list of Python files.
     */
    imports?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Specifies the language of the stored procedure code.
     */
    language?: pulumi.Input<string>;
    /**
     * The argument name
     */
    name?: pulumi.Input<string>;
    /**
     * Specifies the behavior of the procedure when called with null inputs.
     */
    nullInputBehavior?: pulumi.Input<string>;
    /**
     * List of package imports to use for Java / Python procedures. For Java, package imports should be of the form: package*name:version*number, where package*name is snowflake*domain:package. For Python use it should be: ('numpy','pandas','xgboost==1.5.0').
     */
    packages?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Specifies the behavior of the function when returning results
     */
    returnBehavior?: pulumi.Input<string>;
    /**
     * The return type of the procedure
     */
    returnType: pulumi.Input<string>;
    /**
     * Required for Python procedures. Specifies Python runtime version.
     */
    runtimeVersion?: pulumi.Input<string>;
    /**
     * The schema in which to create the procedure. Don't use the | character.
     */
    schema: pulumi.Input<string>;
    /**
     * Specifies the code used to create the procedure.
     */
    statement: pulumi.Input<string>;
}
