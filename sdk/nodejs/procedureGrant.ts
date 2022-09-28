// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as snowflake from "@pulumi/snowflake";
 *
 * const grant = new snowflake.ProcedureGrant("grant", {
 *     arguments: [
 *         {
 *             name: "a",
 *             type: "array",
 *         },
 *         {
 *             name: "b",
 *             type: "string",
 *         },
 *     ],
 *     databaseName: "db",
 *     onFuture: false,
 *     privilege: "select",
 *     procedureName: "procedure",
 *     returnType: "string",
 *     roles: [
 *         "role1",
 *         "role2",
 *     ],
 *     schemaName: "schema",
 *     shares: [
 *         "share1",
 *         "share2",
 *     ],
 *     withGrantOption: false,
 * });
 * ```
 *
 * ## Import
 *
 * format is database name | schema name | procedure signature | privilege | true/false for with_grant_option
 *
 * ```sh
 *  $ pulumi import snowflake:index/procedureGrant:ProcedureGrant example 'dbName|schemaName|procedureName(ARG1 ARG1TYPE, ARG2 ARG2TYPE):RETURNTYPE|USAGE|false'
 * ```
 */
export class ProcedureGrant extends pulumi.CustomResource {
    /**
     * Get an existing ProcedureGrant resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ProcedureGrantState, opts?: pulumi.CustomResourceOptions): ProcedureGrant {
        return new ProcedureGrant(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'snowflake:index/procedureGrant:ProcedureGrant';

    /**
     * Returns true if the given object is an instance of ProcedureGrant.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ProcedureGrant {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ProcedureGrant.__pulumiType;
    }

    /**
     * List of the arguments for the procedure (must be present if procedure has arguments and procedureName is present)
     */
    public readonly arguments!: pulumi.Output<outputs.ProcedureGrantArgument[] | undefined>;
    /**
     * The name of the database containing the current or future procedures on which to grant privileges.
     */
    public readonly databaseName!: pulumi.Output<string>;
    /**
     * When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
     * grants applied to roles and objects outside Terraform.
     */
    public readonly enableMultipleGrants!: pulumi.Output<boolean | undefined>;
    /**
     * When this is set to true and a schema*name is provided, apply this grant on all future procedures in the given schema. When this is true and no schema*name is provided apply this grant on all future procedures in the given database. The procedure*name and shares fields must be unset in order to use on*future.
     */
    public readonly onFuture!: pulumi.Output<boolean | undefined>;
    /**
     * The privilege to grant on the current or future procedure.
     */
    public readonly privilege!: pulumi.Output<string | undefined>;
    /**
     * The name of the procedure on which to grant privileges immediately (only valid if onFuture is false).
     */
    public readonly procedureName!: pulumi.Output<string | undefined>;
    /**
     * The return type of the procedure (must be present if procedureName is present)
     */
    public readonly returnType!: pulumi.Output<string | undefined>;
    /**
     * Grants privilege to these roles.
     */
    public readonly roles!: pulumi.Output<string[] | undefined>;
    /**
     * The name of the schema containing the current or future procedures on which to grant privileges.
     */
    public readonly schemaName!: pulumi.Output<string>;
    /**
     * Grants privilege to these shares (only valid if onFuture is false).
     */
    public readonly shares!: pulumi.Output<string[] | undefined>;
    /**
     * When this is set to true, allows the recipient role to grant the privileges to other roles.
     */
    public readonly withGrantOption!: pulumi.Output<boolean | undefined>;

    /**
     * Create a ProcedureGrant resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ProcedureGrantArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ProcedureGrantArgs | ProcedureGrantState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ProcedureGrantState | undefined;
            resourceInputs["arguments"] = state ? state.arguments : undefined;
            resourceInputs["databaseName"] = state ? state.databaseName : undefined;
            resourceInputs["enableMultipleGrants"] = state ? state.enableMultipleGrants : undefined;
            resourceInputs["onFuture"] = state ? state.onFuture : undefined;
            resourceInputs["privilege"] = state ? state.privilege : undefined;
            resourceInputs["procedureName"] = state ? state.procedureName : undefined;
            resourceInputs["returnType"] = state ? state.returnType : undefined;
            resourceInputs["roles"] = state ? state.roles : undefined;
            resourceInputs["schemaName"] = state ? state.schemaName : undefined;
            resourceInputs["shares"] = state ? state.shares : undefined;
            resourceInputs["withGrantOption"] = state ? state.withGrantOption : undefined;
        } else {
            const args = argsOrState as ProcedureGrantArgs | undefined;
            if ((!args || args.databaseName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'databaseName'");
            }
            if ((!args || args.schemaName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'schemaName'");
            }
            resourceInputs["arguments"] = args ? args.arguments : undefined;
            resourceInputs["databaseName"] = args ? args.databaseName : undefined;
            resourceInputs["enableMultipleGrants"] = args ? args.enableMultipleGrants : undefined;
            resourceInputs["onFuture"] = args ? args.onFuture : undefined;
            resourceInputs["privilege"] = args ? args.privilege : undefined;
            resourceInputs["procedureName"] = args ? args.procedureName : undefined;
            resourceInputs["returnType"] = args ? args.returnType : undefined;
            resourceInputs["roles"] = args ? args.roles : undefined;
            resourceInputs["schemaName"] = args ? args.schemaName : undefined;
            resourceInputs["shares"] = args ? args.shares : undefined;
            resourceInputs["withGrantOption"] = args ? args.withGrantOption : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ProcedureGrant.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ProcedureGrant resources.
 */
export interface ProcedureGrantState {
    /**
     * List of the arguments for the procedure (must be present if procedure has arguments and procedureName is present)
     */
    arguments?: pulumi.Input<pulumi.Input<inputs.ProcedureGrantArgument>[]>;
    /**
     * The name of the database containing the current or future procedures on which to grant privileges.
     */
    databaseName?: pulumi.Input<string>;
    /**
     * When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
     * grants applied to roles and objects outside Terraform.
     */
    enableMultipleGrants?: pulumi.Input<boolean>;
    /**
     * When this is set to true and a schema*name is provided, apply this grant on all future procedures in the given schema. When this is true and no schema*name is provided apply this grant on all future procedures in the given database. The procedure*name and shares fields must be unset in order to use on*future.
     */
    onFuture?: pulumi.Input<boolean>;
    /**
     * The privilege to grant on the current or future procedure.
     */
    privilege?: pulumi.Input<string>;
    /**
     * The name of the procedure on which to grant privileges immediately (only valid if onFuture is false).
     */
    procedureName?: pulumi.Input<string>;
    /**
     * The return type of the procedure (must be present if procedureName is present)
     */
    returnType?: pulumi.Input<string>;
    /**
     * Grants privilege to these roles.
     */
    roles?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name of the schema containing the current or future procedures on which to grant privileges.
     */
    schemaName?: pulumi.Input<string>;
    /**
     * Grants privilege to these shares (only valid if onFuture is false).
     */
    shares?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * When this is set to true, allows the recipient role to grant the privileges to other roles.
     */
    withGrantOption?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a ProcedureGrant resource.
 */
export interface ProcedureGrantArgs {
    /**
     * List of the arguments for the procedure (must be present if procedure has arguments and procedureName is present)
     */
    arguments?: pulumi.Input<pulumi.Input<inputs.ProcedureGrantArgument>[]>;
    /**
     * The name of the database containing the current or future procedures on which to grant privileges.
     */
    databaseName: pulumi.Input<string>;
    /**
     * When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
     * grants applied to roles and objects outside Terraform.
     */
    enableMultipleGrants?: pulumi.Input<boolean>;
    /**
     * When this is set to true and a schema*name is provided, apply this grant on all future procedures in the given schema. When this is true and no schema*name is provided apply this grant on all future procedures in the given database. The procedure*name and shares fields must be unset in order to use on*future.
     */
    onFuture?: pulumi.Input<boolean>;
    /**
     * The privilege to grant on the current or future procedure.
     */
    privilege?: pulumi.Input<string>;
    /**
     * The name of the procedure on which to grant privileges immediately (only valid if onFuture is false).
     */
    procedureName?: pulumi.Input<string>;
    /**
     * The return type of the procedure (must be present if procedureName is present)
     */
    returnType?: pulumi.Input<string>;
    /**
     * Grants privilege to these roles.
     */
    roles?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name of the schema containing the current or future procedures on which to grant privileges.
     */
    schemaName: pulumi.Input<string>;
    /**
     * Grants privilege to these shares (only valid if onFuture is false).
     */
    shares?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * When this is set to true, allows the recipient role to grant the privileges to other roles.
     */
    withGrantOption?: pulumi.Input<boolean>;
}
