// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Import
 *
 * format is database name | schema name | view name
 *
 * ```sh
 * $ pulumi import snowflake:index/materializedView:MaterializedView example 'dbName|schemaName|viewName'
 * ```
 */
export class MaterializedView extends pulumi.CustomResource {
    /**
     * Get an existing MaterializedView resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: MaterializedViewState, opts?: pulumi.CustomResourceOptions): MaterializedView {
        return new MaterializedView(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'snowflake:index/materializedView:MaterializedView';

    /**
     * Returns true if the given object is an instance of MaterializedView.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is MaterializedView {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === MaterializedView.__pulumiType;
    }

    /**
     * Specifies a comment for the view.
     */
    public readonly comment!: pulumi.Output<string | undefined>;
    /**
     * The database in which to create the view. Don't use the | character.
     */
    public readonly database!: pulumi.Output<string>;
    /**
     * Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
     */
    public /*out*/ readonly fullyQualifiedName!: pulumi.Output<string>;
    /**
     * (Default: `false`) Specifies that the view is secure.
     */
    public readonly isSecure!: pulumi.Output<boolean | undefined>;
    /**
     * Specifies the identifier for the view; must be unique for the schema in which the view is created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * (Default: `false`) Overwrites the View if it exists.
     */
    public readonly orReplace!: pulumi.Output<boolean | undefined>;
    /**
     * The schema in which to create the view. Don't use the | character.
     */
    public readonly schema!: pulumi.Output<string>;
    /**
     * Specifies the query used to create the view.
     */
    public readonly statement!: pulumi.Output<string>;
    /**
     * Definitions of a tag to associate with the resource.
     *
     * @deprecated Use the 'snowflake_tag_association' resource instead.
     */
    public readonly tags!: pulumi.Output<outputs.MaterializedViewTag[] | undefined>;
    /**
     * The warehouse name.
     */
    public readonly warehouse!: pulumi.Output<string>;

    /**
     * Create a MaterializedView resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: MaterializedViewArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: MaterializedViewArgs | MaterializedViewState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as MaterializedViewState | undefined;
            resourceInputs["comment"] = state ? state.comment : undefined;
            resourceInputs["database"] = state ? state.database : undefined;
            resourceInputs["fullyQualifiedName"] = state ? state.fullyQualifiedName : undefined;
            resourceInputs["isSecure"] = state ? state.isSecure : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["orReplace"] = state ? state.orReplace : undefined;
            resourceInputs["schema"] = state ? state.schema : undefined;
            resourceInputs["statement"] = state ? state.statement : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["warehouse"] = state ? state.warehouse : undefined;
        } else {
            const args = argsOrState as MaterializedViewArgs | undefined;
            if ((!args || args.database === undefined) && !opts.urn) {
                throw new Error("Missing required property 'database'");
            }
            if ((!args || args.schema === undefined) && !opts.urn) {
                throw new Error("Missing required property 'schema'");
            }
            if ((!args || args.statement === undefined) && !opts.urn) {
                throw new Error("Missing required property 'statement'");
            }
            if ((!args || args.warehouse === undefined) && !opts.urn) {
                throw new Error("Missing required property 'warehouse'");
            }
            resourceInputs["comment"] = args ? args.comment : undefined;
            resourceInputs["database"] = args ? args.database : undefined;
            resourceInputs["isSecure"] = args ? args.isSecure : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["orReplace"] = args ? args.orReplace : undefined;
            resourceInputs["schema"] = args ? args.schema : undefined;
            resourceInputs["statement"] = args ? args.statement : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["warehouse"] = args ? args.warehouse : undefined;
            resourceInputs["fullyQualifiedName"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(MaterializedView.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering MaterializedView resources.
 */
export interface MaterializedViewState {
    /**
     * Specifies a comment for the view.
     */
    comment?: pulumi.Input<string>;
    /**
     * The database in which to create the view. Don't use the | character.
     */
    database?: pulumi.Input<string>;
    /**
     * Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
     */
    fullyQualifiedName?: pulumi.Input<string>;
    /**
     * (Default: `false`) Specifies that the view is secure.
     */
    isSecure?: pulumi.Input<boolean>;
    /**
     * Specifies the identifier for the view; must be unique for the schema in which the view is created.
     */
    name?: pulumi.Input<string>;
    /**
     * (Default: `false`) Overwrites the View if it exists.
     */
    orReplace?: pulumi.Input<boolean>;
    /**
     * The schema in which to create the view. Don't use the | character.
     */
    schema?: pulumi.Input<string>;
    /**
     * Specifies the query used to create the view.
     */
    statement?: pulumi.Input<string>;
    /**
     * Definitions of a tag to associate with the resource.
     *
     * @deprecated Use the 'snowflake_tag_association' resource instead.
     */
    tags?: pulumi.Input<pulumi.Input<inputs.MaterializedViewTag>[]>;
    /**
     * The warehouse name.
     */
    warehouse?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a MaterializedView resource.
 */
export interface MaterializedViewArgs {
    /**
     * Specifies a comment for the view.
     */
    comment?: pulumi.Input<string>;
    /**
     * The database in which to create the view. Don't use the | character.
     */
    database: pulumi.Input<string>;
    /**
     * (Default: `false`) Specifies that the view is secure.
     */
    isSecure?: pulumi.Input<boolean>;
    /**
     * Specifies the identifier for the view; must be unique for the schema in which the view is created.
     */
    name?: pulumi.Input<string>;
    /**
     * (Default: `false`) Overwrites the View if it exists.
     */
    orReplace?: pulumi.Input<boolean>;
    /**
     * The schema in which to create the view. Don't use the | character.
     */
    schema: pulumi.Input<string>;
    /**
     * Specifies the query used to create the view.
     */
    statement: pulumi.Input<string>;
    /**
     * Definitions of a tag to associate with the resource.
     *
     * @deprecated Use the 'snowflake_tag_association' resource instead.
     */
    tags?: pulumi.Input<pulumi.Input<inputs.MaterializedViewTag>[]>;
    /**
     * The warehouse name.
     */
    warehouse: pulumi.Input<string>;
}
