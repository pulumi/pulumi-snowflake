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
 * const alert = new snowflake.Alert("alert", {
 *     action: "select 1 as c",
 *     alertSchedule: "10 MINUTE",
 *     comment: "my alert",
 *     condition: "select 1 as c",
 *     database: "database",
 *     enabled: true,
 *     schema: "schema",
 *     warehouse: "warehouse",
 * });
 * ```
 *
 * ## Import
 *
 * format is database name | schema name | alert name
 *
 * ```sh
 *  $ pulumi import snowflake:index/alert:Alert example 'dbName|schemaName|alertName'
 * ```
 */
export class Alert extends pulumi.CustomResource {
    /**
     * Get an existing Alert resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AlertState, opts?: pulumi.CustomResourceOptions): Alert {
        return new Alert(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'snowflake:index/alert:Alert';

    /**
     * Returns true if the given object is an instance of Alert.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Alert {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Alert.__pulumiType;
    }

    /**
     * The SQL statement that should be executed if the condition returns one or more rows.
     */
    public readonly action!: pulumi.Output<string>;
    /**
     * The schedule for periodically running an alert.
     */
    public readonly alertSchedule!: pulumi.Output<outputs.AlertAlertSchedule | undefined>;
    /**
     * Specifies a comment for the alert.
     */
    public readonly comment!: pulumi.Output<string | undefined>;
    /**
     * The SQL statement that represents the condition for the alert. (SELECT, SHOW, CALL)
     */
    public readonly condition!: pulumi.Output<string>;
    /**
     * The database in which to create the alert.
     */
    public readonly database!: pulumi.Output<string>;
    /**
     * Specifies if an alert should be 'started' (enabled) after creation or should remain 'suspended' (default).
     */
    public readonly enabled!: pulumi.Output<boolean | undefined>;
    /**
     * Specifies the identifier for the alert; must be unique for the database and schema in which the alert is created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The schema in which to create the alert.
     */
    public readonly schema!: pulumi.Output<string>;
    /**
     * The warehouse the alert will use.
     */
    public readonly warehouse!: pulumi.Output<string>;

    /**
     * Create a Alert resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AlertArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AlertArgs | AlertState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AlertState | undefined;
            resourceInputs["action"] = state ? state.action : undefined;
            resourceInputs["alertSchedule"] = state ? state.alertSchedule : undefined;
            resourceInputs["comment"] = state ? state.comment : undefined;
            resourceInputs["condition"] = state ? state.condition : undefined;
            resourceInputs["database"] = state ? state.database : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["schema"] = state ? state.schema : undefined;
            resourceInputs["warehouse"] = state ? state.warehouse : undefined;
        } else {
            const args = argsOrState as AlertArgs | undefined;
            if ((!args || args.action === undefined) && !opts.urn) {
                throw new Error("Missing required property 'action'");
            }
            if ((!args || args.condition === undefined) && !opts.urn) {
                throw new Error("Missing required property 'condition'");
            }
            if ((!args || args.database === undefined) && !opts.urn) {
                throw new Error("Missing required property 'database'");
            }
            if ((!args || args.schema === undefined) && !opts.urn) {
                throw new Error("Missing required property 'schema'");
            }
            if ((!args || args.warehouse === undefined) && !opts.urn) {
                throw new Error("Missing required property 'warehouse'");
            }
            resourceInputs["action"] = args ? args.action : undefined;
            resourceInputs["alertSchedule"] = args ? args.alertSchedule : undefined;
            resourceInputs["comment"] = args ? args.comment : undefined;
            resourceInputs["condition"] = args ? args.condition : undefined;
            resourceInputs["database"] = args ? args.database : undefined;
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["schema"] = args ? args.schema : undefined;
            resourceInputs["warehouse"] = args ? args.warehouse : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Alert.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Alert resources.
 */
export interface AlertState {
    /**
     * The SQL statement that should be executed if the condition returns one or more rows.
     */
    action?: pulumi.Input<string>;
    /**
     * The schedule for periodically running an alert.
     */
    alertSchedule?: pulumi.Input<inputs.AlertAlertSchedule>;
    /**
     * Specifies a comment for the alert.
     */
    comment?: pulumi.Input<string>;
    /**
     * The SQL statement that represents the condition for the alert. (SELECT, SHOW, CALL)
     */
    condition?: pulumi.Input<string>;
    /**
     * The database in which to create the alert.
     */
    database?: pulumi.Input<string>;
    /**
     * Specifies if an alert should be 'started' (enabled) after creation or should remain 'suspended' (default).
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Specifies the identifier for the alert; must be unique for the database and schema in which the alert is created.
     */
    name?: pulumi.Input<string>;
    /**
     * The schema in which to create the alert.
     */
    schema?: pulumi.Input<string>;
    /**
     * The warehouse the alert will use.
     */
    warehouse?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Alert resource.
 */
export interface AlertArgs {
    /**
     * The SQL statement that should be executed if the condition returns one or more rows.
     */
    action: pulumi.Input<string>;
    /**
     * The schedule for periodically running an alert.
     */
    alertSchedule?: pulumi.Input<inputs.AlertAlertSchedule>;
    /**
     * Specifies a comment for the alert.
     */
    comment?: pulumi.Input<string>;
    /**
     * The SQL statement that represents the condition for the alert. (SELECT, SHOW, CALL)
     */
    condition: pulumi.Input<string>;
    /**
     * The database in which to create the alert.
     */
    database: pulumi.Input<string>;
    /**
     * Specifies if an alert should be 'started' (enabled) after creation or should remain 'suspended' (default).
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Specifies the identifier for the alert; must be unique for the database and schema in which the alert is created.
     */
    name?: pulumi.Input<string>;
    /**
     * The schema in which to create the alert.
     */
    schema: pulumi.Input<string>;
    /**
     * The warehouse the alert will use.
     */
    warehouse: pulumi.Input<string>;
}
