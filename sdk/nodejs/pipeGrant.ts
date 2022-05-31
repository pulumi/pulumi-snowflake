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
 * const grant = new snowflake.PipeGrant("grant", {
 *     databaseName: "db",
 *     onFuture: false,
 *     privilege: "operate",
 *     roles: [
 *         "role1",
 *         "role2",
 *     ],
 *     schemaName: "schema",
 *     sequenceName: "sequence",
 *     withGrantOption: false,
 * });
 * ```
 *
 * ## Import
 *
 * # format is database name | schema name | pipe name | privilege | true/false for with_grant_option
 *
 * ```sh
 *  $ pulumi import snowflake:index/pipeGrant:PipeGrant example 'dbName|schemaName|pipeName|OPERATE|false'
 * ```
 */
export class PipeGrant extends pulumi.CustomResource {
    /**
     * Get an existing PipeGrant resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: PipeGrantState, opts?: pulumi.CustomResourceOptions): PipeGrant {
        return new PipeGrant(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'snowflake:index/pipeGrant:PipeGrant';

    /**
     * Returns true if the given object is an instance of PipeGrant.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is PipeGrant {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === PipeGrant.__pulumiType;
    }

    /**
     * The name of the database containing the current or future pipes on which to grant privileges.
     */
    public readonly databaseName!: pulumi.Output<string>;
    /**
     * When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
     * grants applied to roles and objects outside Terraform.
     */
    public readonly enableMultipleGrants!: pulumi.Output<boolean | undefined>;
    /**
     * When this is set to true and a schema_name is provided, apply this grant on all future pipes in the given schema. When
     * this is true and no schema_name is provided apply this grant on all future pipes in the given database. The pipe_name
     * field must be unset in order to use on_future.
     */
    public readonly onFuture!: pulumi.Output<boolean | undefined>;
    /**
     * The name of the pipe on which to grant privileges immediately (only valid if on_future is false).
     */
    public readonly pipeName!: pulumi.Output<string | undefined>;
    /**
     * The privilege to grant on the current or future pipe.
     */
    public readonly privilege!: pulumi.Output<string | undefined>;
    /**
     * Grants privilege to these roles.
     */
    public readonly roles!: pulumi.Output<string[] | undefined>;
    /**
     * The name of the schema containing the current or future pipes on which to grant privileges.
     */
    public readonly schemaName!: pulumi.Output<string>;
    /**
     * When this is set to true, allows the recipient role to grant the privileges to other roles.
     */
    public readonly withGrantOption!: pulumi.Output<boolean | undefined>;

    /**
     * Create a PipeGrant resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: PipeGrantArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: PipeGrantArgs | PipeGrantState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as PipeGrantState | undefined;
            resourceInputs["databaseName"] = state ? state.databaseName : undefined;
            resourceInputs["enableMultipleGrants"] = state ? state.enableMultipleGrants : undefined;
            resourceInputs["onFuture"] = state ? state.onFuture : undefined;
            resourceInputs["pipeName"] = state ? state.pipeName : undefined;
            resourceInputs["privilege"] = state ? state.privilege : undefined;
            resourceInputs["roles"] = state ? state.roles : undefined;
            resourceInputs["schemaName"] = state ? state.schemaName : undefined;
            resourceInputs["withGrantOption"] = state ? state.withGrantOption : undefined;
        } else {
            const args = argsOrState as PipeGrantArgs | undefined;
            if ((!args || args.databaseName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'databaseName'");
            }
            if ((!args || args.schemaName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'schemaName'");
            }
            resourceInputs["databaseName"] = args ? args.databaseName : undefined;
            resourceInputs["enableMultipleGrants"] = args ? args.enableMultipleGrants : undefined;
            resourceInputs["onFuture"] = args ? args.onFuture : undefined;
            resourceInputs["pipeName"] = args ? args.pipeName : undefined;
            resourceInputs["privilege"] = args ? args.privilege : undefined;
            resourceInputs["roles"] = args ? args.roles : undefined;
            resourceInputs["schemaName"] = args ? args.schemaName : undefined;
            resourceInputs["withGrantOption"] = args ? args.withGrantOption : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(PipeGrant.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering PipeGrant resources.
 */
export interface PipeGrantState {
    /**
     * The name of the database containing the current or future pipes on which to grant privileges.
     */
    databaseName?: pulumi.Input<string>;
    /**
     * When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
     * grants applied to roles and objects outside Terraform.
     */
    enableMultipleGrants?: pulumi.Input<boolean>;
    /**
     * When this is set to true and a schema_name is provided, apply this grant on all future pipes in the given schema. When
     * this is true and no schema_name is provided apply this grant on all future pipes in the given database. The pipe_name
     * field must be unset in order to use on_future.
     */
    onFuture?: pulumi.Input<boolean>;
    /**
     * The name of the pipe on which to grant privileges immediately (only valid if on_future is false).
     */
    pipeName?: pulumi.Input<string>;
    /**
     * The privilege to grant on the current or future pipe.
     */
    privilege?: pulumi.Input<string>;
    /**
     * Grants privilege to these roles.
     */
    roles?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name of the schema containing the current or future pipes on which to grant privileges.
     */
    schemaName?: pulumi.Input<string>;
    /**
     * When this is set to true, allows the recipient role to grant the privileges to other roles.
     */
    withGrantOption?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a PipeGrant resource.
 */
export interface PipeGrantArgs {
    /**
     * The name of the database containing the current or future pipes on which to grant privileges.
     */
    databaseName: pulumi.Input<string>;
    /**
     * When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
     * grants applied to roles and objects outside Terraform.
     */
    enableMultipleGrants?: pulumi.Input<boolean>;
    /**
     * When this is set to true and a schema_name is provided, apply this grant on all future pipes in the given schema. When
     * this is true and no schema_name is provided apply this grant on all future pipes in the given database. The pipe_name
     * field must be unset in order to use on_future.
     */
    onFuture?: pulumi.Input<boolean>;
    /**
     * The name of the pipe on which to grant privileges immediately (only valid if on_future is false).
     */
    pipeName?: pulumi.Input<string>;
    /**
     * The privilege to grant on the current or future pipe.
     */
    privilege?: pulumi.Input<string>;
    /**
     * Grants privilege to these roles.
     */
    roles?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name of the schema containing the current or future pipes on which to grant privileges.
     */
    schemaName: pulumi.Input<string>;
    /**
     * When this is set to true, allows the recipient role to grant the privileges to other roles.
     */
    withGrantOption?: pulumi.Input<boolean>;
}
