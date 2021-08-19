// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

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
     * Specifies the behavior of the function when returning results
     */
    public readonly returnBehavior!: pulumi.Output<string | undefined>;
    /**
     * The return type of the function
     */
    public readonly returnType!: pulumi.Output<string>;
    /**
     * The schema in which to create the function. Don't use the | character.
     */
    public readonly schema!: pulumi.Output<string>;
    /**
     * Specifies the javascript / java / sql code used to create the function.
     */
    public readonly statement!: pulumi.Output<string>;

    /**
     * Create a Function resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: FunctionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: FunctionArgs | FunctionState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as FunctionState | undefined;
            inputs["arguments"] = state ? state.arguments : undefined;
            inputs["comment"] = state ? state.comment : undefined;
            inputs["database"] = state ? state.database : undefined;
            inputs["language"] = state ? state.language : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["nullInputBehavior"] = state ? state.nullInputBehavior : undefined;
            inputs["returnBehavior"] = state ? state.returnBehavior : undefined;
            inputs["returnType"] = state ? state.returnType : undefined;
            inputs["schema"] = state ? state.schema : undefined;
            inputs["statement"] = state ? state.statement : undefined;
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
            inputs["arguments"] = args ? args.arguments : undefined;
            inputs["comment"] = args ? args.comment : undefined;
            inputs["database"] = args ? args.database : undefined;
            inputs["language"] = args ? args.language : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["nullInputBehavior"] = args ? args.nullInputBehavior : undefined;
            inputs["returnBehavior"] = args ? args.returnBehavior : undefined;
            inputs["returnType"] = args ? args.returnType : undefined;
            inputs["schema"] = args ? args.schema : undefined;
            inputs["statement"] = args ? args.statement : undefined;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(Function.__pulumiType, name, inputs, opts);
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
     * Specifies the behavior of the function when returning results
     */
    returnBehavior?: pulumi.Input<string>;
    /**
     * The return type of the function
     */
    returnType?: pulumi.Input<string>;
    /**
     * The schema in which to create the function. Don't use the | character.
     */
    schema?: pulumi.Input<string>;
    /**
     * Specifies the javascript / java / sql code used to create the function.
     */
    statement?: pulumi.Input<string>;
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
     * Specifies the behavior of the function when returning results
     */
    returnBehavior?: pulumi.Input<string>;
    /**
     * The return type of the function
     */
    returnType: pulumi.Input<string>;
    /**
     * The schema in which to create the function. Don't use the | character.
     */
    schema: pulumi.Input<string>;
    /**
     * Specifies the javascript / java / sql code used to create the function.
     */
    statement: pulumi.Input<string>;
}
