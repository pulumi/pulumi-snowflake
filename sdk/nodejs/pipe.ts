// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as snowflake from "@pulumi/snowflake";
 *
 * const pipe = new snowflake.Pipe("pipe", {
 *     autoIngest: false,
 *     awsSnsTopicArn: "...",
 *     comment: "A pipe.",
 *     copyStatement: "copy into mytable from @mystage",
 *     database: "db",
 *     notificationChannel: "...",
 *     owner: "role1",
 *     schema: "schema",
 * });
 * ```
 *
 * ## Import
 *
 * # format is database name | schema name | pipe name
 *
 * ```sh
 *  $ pulumi import snowflake:index/pipe:Pipe example 'dbName|schemaName|pipeName'
 * ```
 */
export class Pipe extends pulumi.CustomResource {
    /**
     * Get an existing Pipe resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: PipeState, opts?: pulumi.CustomResourceOptions): Pipe {
        return new Pipe(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'snowflake:index/pipe:Pipe';

    /**
     * Returns true if the given object is an instance of Pipe.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Pipe {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Pipe.__pulumiType;
    }

    /**
     * Specifies a autoIngest param for the pipe.
     */
    public readonly autoIngest!: pulumi.Output<boolean | undefined>;
    /**
     * Specifies the Amazon Resource Name (ARN) for the SNS topic for your S3 bucket.
     */
    public readonly awsSnsTopicArn!: pulumi.Output<string | undefined>;
    /**
     * Specifies a comment for the pipe.
     */
    public readonly comment!: pulumi.Output<string | undefined>;
    /**
     * Specifies the copy statement for the pipe.
     */
    public readonly copyStatement!: pulumi.Output<string>;
    /**
     * The database in which to create the pipe.
     */
    public readonly database!: pulumi.Output<string>;
    /**
     * Specifies the name of the notification integration used for error notifications.
     */
    public readonly errorIntegration!: pulumi.Output<string | undefined>;
    /**
     * Specifies an integration for the pipe.
     */
    public readonly integration!: pulumi.Output<string | undefined>;
    /**
     * Specifies the identifier for the pipe; must be unique for the database and schema in which the pipe is created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Amazon Resource Name of the Amazon SQS queue for the stage named in the DEFINITION column.
     */
    public /*out*/ readonly notificationChannel!: pulumi.Output<string>;
    /**
     * Name of the role that owns the pipe.
     */
    public /*out*/ readonly owner!: pulumi.Output<string>;
    /**
     * The schema in which to create the pipe.
     */
    public readonly schema!: pulumi.Output<string>;

    /**
     * Create a Pipe resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: PipeArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: PipeArgs | PipeState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as PipeState | undefined;
            resourceInputs["autoIngest"] = state ? state.autoIngest : undefined;
            resourceInputs["awsSnsTopicArn"] = state ? state.awsSnsTopicArn : undefined;
            resourceInputs["comment"] = state ? state.comment : undefined;
            resourceInputs["copyStatement"] = state ? state.copyStatement : undefined;
            resourceInputs["database"] = state ? state.database : undefined;
            resourceInputs["errorIntegration"] = state ? state.errorIntegration : undefined;
            resourceInputs["integration"] = state ? state.integration : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["notificationChannel"] = state ? state.notificationChannel : undefined;
            resourceInputs["owner"] = state ? state.owner : undefined;
            resourceInputs["schema"] = state ? state.schema : undefined;
        } else {
            const args = argsOrState as PipeArgs | undefined;
            if ((!args || args.copyStatement === undefined) && !opts.urn) {
                throw new Error("Missing required property 'copyStatement'");
            }
            if ((!args || args.database === undefined) && !opts.urn) {
                throw new Error("Missing required property 'database'");
            }
            if ((!args || args.schema === undefined) && !opts.urn) {
                throw new Error("Missing required property 'schema'");
            }
            resourceInputs["autoIngest"] = args ? args.autoIngest : undefined;
            resourceInputs["awsSnsTopicArn"] = args ? args.awsSnsTopicArn : undefined;
            resourceInputs["comment"] = args ? args.comment : undefined;
            resourceInputs["copyStatement"] = args ? args.copyStatement : undefined;
            resourceInputs["database"] = args ? args.database : undefined;
            resourceInputs["errorIntegration"] = args ? args.errorIntegration : undefined;
            resourceInputs["integration"] = args ? args.integration : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["schema"] = args ? args.schema : undefined;
            resourceInputs["notificationChannel"] = undefined /*out*/;
            resourceInputs["owner"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Pipe.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Pipe resources.
 */
export interface PipeState {
    /**
     * Specifies a autoIngest param for the pipe.
     */
    autoIngest?: pulumi.Input<boolean>;
    /**
     * Specifies the Amazon Resource Name (ARN) for the SNS topic for your S3 bucket.
     */
    awsSnsTopicArn?: pulumi.Input<string>;
    /**
     * Specifies a comment for the pipe.
     */
    comment?: pulumi.Input<string>;
    /**
     * Specifies the copy statement for the pipe.
     */
    copyStatement?: pulumi.Input<string>;
    /**
     * The database in which to create the pipe.
     */
    database?: pulumi.Input<string>;
    /**
     * Specifies the name of the notification integration used for error notifications.
     */
    errorIntegration?: pulumi.Input<string>;
    /**
     * Specifies an integration for the pipe.
     */
    integration?: pulumi.Input<string>;
    /**
     * Specifies the identifier for the pipe; must be unique for the database and schema in which the pipe is created.
     */
    name?: pulumi.Input<string>;
    /**
     * Amazon Resource Name of the Amazon SQS queue for the stage named in the DEFINITION column.
     */
    notificationChannel?: pulumi.Input<string>;
    /**
     * Name of the role that owns the pipe.
     */
    owner?: pulumi.Input<string>;
    /**
     * The schema in which to create the pipe.
     */
    schema?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Pipe resource.
 */
export interface PipeArgs {
    /**
     * Specifies a autoIngest param for the pipe.
     */
    autoIngest?: pulumi.Input<boolean>;
    /**
     * Specifies the Amazon Resource Name (ARN) for the SNS topic for your S3 bucket.
     */
    awsSnsTopicArn?: pulumi.Input<string>;
    /**
     * Specifies a comment for the pipe.
     */
    comment?: pulumi.Input<string>;
    /**
     * Specifies the copy statement for the pipe.
     */
    copyStatement: pulumi.Input<string>;
    /**
     * The database in which to create the pipe.
     */
    database: pulumi.Input<string>;
    /**
     * Specifies the name of the notification integration used for error notifications.
     */
    errorIntegration?: pulumi.Input<string>;
    /**
     * Specifies an integration for the pipe.
     */
    integration?: pulumi.Input<string>;
    /**
     * Specifies the identifier for the pipe; must be unique for the database and schema in which the pipe is created.
     */
    name?: pulumi.Input<string>;
    /**
     * The schema in which to create the pipe.
     */
    schema: pulumi.Input<string>;
}
