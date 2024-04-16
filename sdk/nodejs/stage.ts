// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as snowflake from "@pulumi/snowflake";
 *
 * const exampleStage = new snowflake.Stage("example_stage", {
 *     name: "EXAMPLE_STAGE",
 *     url: "s3://com.example.bucket/prefix",
 *     database: "EXAMPLE_DB",
 *     schema: "EXAMPLE_SCHEMA",
 *     credentials: `AWS_KEY_ID='${exampleAwsKeyId}' AWS_SECRET_KEY='${exampleAwsSecretKey}'`,
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * format is database name | schema name | stage name
 *
 * ```sh
 * $ pulumi import snowflake:index/stage:Stage example 'dbName|schemaName|stageName'
 * ```
 */
export class Stage extends pulumi.CustomResource {
    /**
     * Get an existing Stage resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: StageState, opts?: pulumi.CustomResourceOptions): Stage {
        return new Stage(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'snowflake:index/stage:Stage';

    /**
     * Returns true if the given object is an instance of Stage.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Stage {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Stage.__pulumiType;
    }

    public readonly awsExternalId!: pulumi.Output<string>;
    /**
     * Specifies a comment for the stage.
     */
    public readonly comment!: pulumi.Output<string | undefined>;
    /**
     * Specifies the copy options for the stage.
     */
    public readonly copyOptions!: pulumi.Output<string | undefined>;
    /**
     * Specifies the credentials for the stage.
     */
    public readonly credentials!: pulumi.Output<string | undefined>;
    /**
     * Name of the database that the tag was created in.
     */
    public readonly database!: pulumi.Output<string>;
    /**
     * Specifies the directory settings for the stage.
     */
    public readonly directory!: pulumi.Output<string | undefined>;
    /**
     * Specifies the encryption settings for the stage.
     */
    public readonly encryption!: pulumi.Output<string | undefined>;
    /**
     * Specifies the file format for the stage.
     */
    public readonly fileFormat!: pulumi.Output<string | undefined>;
    /**
     * Tag name, e.g. department.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Name of the schema that the tag was created in.
     */
    public readonly schema!: pulumi.Output<string>;
    public readonly snowflakeIamUser!: pulumi.Output<string>;
    /**
     * Specifies the name of the storage integration used to delegate authentication responsibility for external cloud storage to a Snowflake identity and access management (IAM) entity.
     */
    public readonly storageIntegration!: pulumi.Output<string | undefined>;
    /**
     * Definitions of a tag to associate with the resource.
     *
     * @deprecated Use the 'snowflake_tag_association' resource instead.
     */
    public readonly tags!: pulumi.Output<outputs.StageTag[] | undefined>;
    /**
     * Specifies the URL for the stage.
     */
    public readonly url!: pulumi.Output<string | undefined>;

    /**
     * Create a Stage resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: StageArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: StageArgs | StageState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as StageState | undefined;
            resourceInputs["awsExternalId"] = state ? state.awsExternalId : undefined;
            resourceInputs["comment"] = state ? state.comment : undefined;
            resourceInputs["copyOptions"] = state ? state.copyOptions : undefined;
            resourceInputs["credentials"] = state ? state.credentials : undefined;
            resourceInputs["database"] = state ? state.database : undefined;
            resourceInputs["directory"] = state ? state.directory : undefined;
            resourceInputs["encryption"] = state ? state.encryption : undefined;
            resourceInputs["fileFormat"] = state ? state.fileFormat : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["schema"] = state ? state.schema : undefined;
            resourceInputs["snowflakeIamUser"] = state ? state.snowflakeIamUser : undefined;
            resourceInputs["storageIntegration"] = state ? state.storageIntegration : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["url"] = state ? state.url : undefined;
        } else {
            const args = argsOrState as StageArgs | undefined;
            if ((!args || args.database === undefined) && !opts.urn) {
                throw new Error("Missing required property 'database'");
            }
            if ((!args || args.schema === undefined) && !opts.urn) {
                throw new Error("Missing required property 'schema'");
            }
            resourceInputs["awsExternalId"] = args ? args.awsExternalId : undefined;
            resourceInputs["comment"] = args ? args.comment : undefined;
            resourceInputs["copyOptions"] = args ? args.copyOptions : undefined;
            resourceInputs["credentials"] = args?.credentials ? pulumi.secret(args.credentials) : undefined;
            resourceInputs["database"] = args ? args.database : undefined;
            resourceInputs["directory"] = args ? args.directory : undefined;
            resourceInputs["encryption"] = args ? args.encryption : undefined;
            resourceInputs["fileFormat"] = args ? args.fileFormat : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["schema"] = args ? args.schema : undefined;
            resourceInputs["snowflakeIamUser"] = args ? args.snowflakeIamUser : undefined;
            resourceInputs["storageIntegration"] = args ? args.storageIntegration : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["url"] = args ? args.url : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["credentials"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(Stage.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Stage resources.
 */
export interface StageState {
    awsExternalId?: pulumi.Input<string>;
    /**
     * Specifies a comment for the stage.
     */
    comment?: pulumi.Input<string>;
    /**
     * Specifies the copy options for the stage.
     */
    copyOptions?: pulumi.Input<string>;
    /**
     * Specifies the credentials for the stage.
     */
    credentials?: pulumi.Input<string>;
    /**
     * Name of the database that the tag was created in.
     */
    database?: pulumi.Input<string>;
    /**
     * Specifies the directory settings for the stage.
     */
    directory?: pulumi.Input<string>;
    /**
     * Specifies the encryption settings for the stage.
     */
    encryption?: pulumi.Input<string>;
    /**
     * Specifies the file format for the stage.
     */
    fileFormat?: pulumi.Input<string>;
    /**
     * Tag name, e.g. department.
     */
    name?: pulumi.Input<string>;
    /**
     * Name of the schema that the tag was created in.
     */
    schema?: pulumi.Input<string>;
    snowflakeIamUser?: pulumi.Input<string>;
    /**
     * Specifies the name of the storage integration used to delegate authentication responsibility for external cloud storage to a Snowflake identity and access management (IAM) entity.
     */
    storageIntegration?: pulumi.Input<string>;
    /**
     * Definitions of a tag to associate with the resource.
     *
     * @deprecated Use the 'snowflake_tag_association' resource instead.
     */
    tags?: pulumi.Input<pulumi.Input<inputs.StageTag>[]>;
    /**
     * Specifies the URL for the stage.
     */
    url?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Stage resource.
 */
export interface StageArgs {
    awsExternalId?: pulumi.Input<string>;
    /**
     * Specifies a comment for the stage.
     */
    comment?: pulumi.Input<string>;
    /**
     * Specifies the copy options for the stage.
     */
    copyOptions?: pulumi.Input<string>;
    /**
     * Specifies the credentials for the stage.
     */
    credentials?: pulumi.Input<string>;
    /**
     * Name of the database that the tag was created in.
     */
    database: pulumi.Input<string>;
    /**
     * Specifies the directory settings for the stage.
     */
    directory?: pulumi.Input<string>;
    /**
     * Specifies the encryption settings for the stage.
     */
    encryption?: pulumi.Input<string>;
    /**
     * Specifies the file format for the stage.
     */
    fileFormat?: pulumi.Input<string>;
    /**
     * Tag name, e.g. department.
     */
    name?: pulumi.Input<string>;
    /**
     * Name of the schema that the tag was created in.
     */
    schema: pulumi.Input<string>;
    snowflakeIamUser?: pulumi.Input<string>;
    /**
     * Specifies the name of the storage integration used to delegate authentication responsibility for external cloud storage to a Snowflake identity and access management (IAM) entity.
     */
    storageIntegration?: pulumi.Input<string>;
    /**
     * Definitions of a tag to associate with the resource.
     *
     * @deprecated Use the 'snowflake_tag_association' resource instead.
     */
    tags?: pulumi.Input<pulumi.Input<inputs.StageTag>[]>;
    /**
     * Specifies the URL for the stage.
     */
    url?: pulumi.Input<string>;
}
