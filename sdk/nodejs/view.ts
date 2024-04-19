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
 * const view = new snowflake.View("view", {
 *     database: "database",
 *     schema: "schema",
 *     name: "view",
 *     comment: "comment",
 *     statement: "select * from foo;\n",
 *     orReplace: false,
 *     isSecure: false,
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * format is database name | schema name | view name
 *
 * ```sh
 * $ pulumi import snowflake:index/view:View example 'dbName|schemaName|viewName'
 * ```
 */
export class View extends pulumi.CustomResource {
    /**
     * Get an existing View resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ViewState, opts?: pulumi.CustomResourceOptions): View {
        return new View(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'snowflake:index/view:View';

    /**
     * Returns true if the given object is an instance of View.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is View {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === View.__pulumiType;
    }

    /**
     * Specifies a comment for the view.
     */
    public readonly comment!: pulumi.Output<string | undefined>;
    /**
     * Retains the access permissions from the original view when a new view is created using the OR REPLACE clause. OR REPLACE must be set when COPY GRANTS is set.
     */
    public readonly copyGrants!: pulumi.Output<boolean | undefined>;
    /**
     * The timestamp at which the view was created.
     */
    public /*out*/ readonly createdOn!: pulumi.Output<string>;
    /**
     * Name of the database that the tag was created in.
     */
    public readonly database!: pulumi.Output<string>;
    /**
     * Specifies that the view is secure. By design, the Snowflake's `SHOW VIEWS` command does not provide information about
     * secure views (consult [view usage notes](https://docs.snowflake.com/en/sql-reference/sql/create-view#usage-notes)) which
     * is essential to manage/import view with Terraform. Use the role owning the view while managing secure views.
     */
    public readonly isSecure!: pulumi.Output<boolean | undefined>;
    /**
     * Tag name, e.g. department.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Overwrites the View if it exists.
     */
    public readonly orReplace!: pulumi.Output<boolean | undefined>;
    /**
     * Name of the schema that the tag was created in.
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
    public readonly tags!: pulumi.Output<outputs.ViewTag[] | undefined>;

    /**
     * Create a View resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ViewArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ViewArgs | ViewState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ViewState | undefined;
            resourceInputs["comment"] = state ? state.comment : undefined;
            resourceInputs["copyGrants"] = state ? state.copyGrants : undefined;
            resourceInputs["createdOn"] = state ? state.createdOn : undefined;
            resourceInputs["database"] = state ? state.database : undefined;
            resourceInputs["isSecure"] = state ? state.isSecure : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["orReplace"] = state ? state.orReplace : undefined;
            resourceInputs["schema"] = state ? state.schema : undefined;
            resourceInputs["statement"] = state ? state.statement : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
        } else {
            const args = argsOrState as ViewArgs | undefined;
            if ((!args || args.database === undefined) && !opts.urn) {
                throw new Error("Missing required property 'database'");
            }
            if ((!args || args.schema === undefined) && !opts.urn) {
                throw new Error("Missing required property 'schema'");
            }
            if ((!args || args.statement === undefined) && !opts.urn) {
                throw new Error("Missing required property 'statement'");
            }
            resourceInputs["comment"] = args ? args.comment : undefined;
            resourceInputs["copyGrants"] = args ? args.copyGrants : undefined;
            resourceInputs["database"] = args ? args.database : undefined;
            resourceInputs["isSecure"] = args ? args.isSecure : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["orReplace"] = args ? args.orReplace : undefined;
            resourceInputs["schema"] = args ? args.schema : undefined;
            resourceInputs["statement"] = args ? args.statement : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["createdOn"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(View.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering View resources.
 */
export interface ViewState {
    /**
     * Specifies a comment for the view.
     */
    comment?: pulumi.Input<string>;
    /**
     * Retains the access permissions from the original view when a new view is created using the OR REPLACE clause. OR REPLACE must be set when COPY GRANTS is set.
     */
    copyGrants?: pulumi.Input<boolean>;
    /**
     * The timestamp at which the view was created.
     */
    createdOn?: pulumi.Input<string>;
    /**
     * Name of the database that the tag was created in.
     */
    database?: pulumi.Input<string>;
    /**
     * Specifies that the view is secure. By design, the Snowflake's `SHOW VIEWS` command does not provide information about
     * secure views (consult [view usage notes](https://docs.snowflake.com/en/sql-reference/sql/create-view#usage-notes)) which
     * is essential to manage/import view with Terraform. Use the role owning the view while managing secure views.
     */
    isSecure?: pulumi.Input<boolean>;
    /**
     * Tag name, e.g. department.
     */
    name?: pulumi.Input<string>;
    /**
     * Overwrites the View if it exists.
     */
    orReplace?: pulumi.Input<boolean>;
    /**
     * Name of the schema that the tag was created in.
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
    tags?: pulumi.Input<pulumi.Input<inputs.ViewTag>[]>;
}

/**
 * The set of arguments for constructing a View resource.
 */
export interface ViewArgs {
    /**
     * Specifies a comment for the view.
     */
    comment?: pulumi.Input<string>;
    /**
     * Retains the access permissions from the original view when a new view is created using the OR REPLACE clause. OR REPLACE must be set when COPY GRANTS is set.
     */
    copyGrants?: pulumi.Input<boolean>;
    /**
     * Name of the database that the tag was created in.
     */
    database: pulumi.Input<string>;
    /**
     * Specifies that the view is secure. By design, the Snowflake's `SHOW VIEWS` command does not provide information about
     * secure views (consult [view usage notes](https://docs.snowflake.com/en/sql-reference/sql/create-view#usage-notes)) which
     * is essential to manage/import view with Terraform. Use the role owning the view while managing secure views.
     */
    isSecure?: pulumi.Input<boolean>;
    /**
     * Tag name, e.g. department.
     */
    name?: pulumi.Input<string>;
    /**
     * Overwrites the View if it exists.
     */
    orReplace?: pulumi.Input<boolean>;
    /**
     * Name of the schema that the tag was created in.
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
    tags?: pulumi.Input<pulumi.Input<inputs.ViewTag>[]>;
}
