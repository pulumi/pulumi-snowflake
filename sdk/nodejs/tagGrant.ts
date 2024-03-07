// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * > **Deprecation** This resource is deprecated and will be removed in a future major version release. Please use snowflake.GrantPrivilegesToAccountRole instead. <deprecation>
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as snowflake from "@pulumi/snowflake";
 *
 * const example = new snowflake.TagGrant("example", {
 *     databaseName: "database",
 *     privilege: "OWNERSHIP",
 *     roles: ["TEST_ROLE"],
 *     schemaName: "schema",
 *     tagName: "tag",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * format is database|schema|tag|privilege|with_grant_option|roles
 *
 * ```sh
 * $ pulumi import snowflake:index/tagGrant:TagGrant example "MY_DATABASE|MY_SCHEMA|MY_TAG|USAGE|false|role1,role2"
 * ```
 */
export class TagGrant extends pulumi.CustomResource {
    /**
     * Get an existing TagGrant resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TagGrantState, opts?: pulumi.CustomResourceOptions): TagGrant {
        return new TagGrant(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'snowflake:index/tagGrant:TagGrant';

    /**
     * Returns true if the given object is an instance of TagGrant.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is TagGrant {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === TagGrant.__pulumiType;
    }

    /**
     * The name of the database containing the tag on which to grant privileges.
     */
    public readonly databaseName!: pulumi.Output<string>;
    /**
     * When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
     * grants applied to roles and objects outside Terraform.
     */
    public readonly enableMultipleGrants!: pulumi.Output<boolean | undefined>;
    /**
     * The privilege to grant on the tag. To grant all privileges, use the value `ALL PRIVILEGES`.
     */
    public readonly privilege!: pulumi.Output<string | undefined>;
    /**
     * The name of the role to revert ownership to on destroy. Has no effect unless `privilege` is set to `OWNERSHIP`
     */
    public readonly revertOwnershipToRoleName!: pulumi.Output<string | undefined>;
    /**
     * Grants privilege to these roles.
     */
    public readonly roles!: pulumi.Output<string[] | undefined>;
    /**
     * The name of the schema containing the tag on which to grant privileges.
     */
    public readonly schemaName!: pulumi.Output<string>;
    /**
     * The name of the tag on which to grant privileges.
     */
    public readonly tagName!: pulumi.Output<string>;
    /**
     * When this is set to true, allows the recipient role to grant the privileges to other roles.
     */
    public readonly withGrantOption!: pulumi.Output<boolean | undefined>;

    /**
     * Create a TagGrant resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: TagGrantArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: TagGrantArgs | TagGrantState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as TagGrantState | undefined;
            resourceInputs["databaseName"] = state ? state.databaseName : undefined;
            resourceInputs["enableMultipleGrants"] = state ? state.enableMultipleGrants : undefined;
            resourceInputs["privilege"] = state ? state.privilege : undefined;
            resourceInputs["revertOwnershipToRoleName"] = state ? state.revertOwnershipToRoleName : undefined;
            resourceInputs["roles"] = state ? state.roles : undefined;
            resourceInputs["schemaName"] = state ? state.schemaName : undefined;
            resourceInputs["tagName"] = state ? state.tagName : undefined;
            resourceInputs["withGrantOption"] = state ? state.withGrantOption : undefined;
        } else {
            const args = argsOrState as TagGrantArgs | undefined;
            if ((!args || args.databaseName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'databaseName'");
            }
            if ((!args || args.schemaName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'schemaName'");
            }
            if ((!args || args.tagName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'tagName'");
            }
            resourceInputs["databaseName"] = args ? args.databaseName : undefined;
            resourceInputs["enableMultipleGrants"] = args ? args.enableMultipleGrants : undefined;
            resourceInputs["privilege"] = args ? args.privilege : undefined;
            resourceInputs["revertOwnershipToRoleName"] = args ? args.revertOwnershipToRoleName : undefined;
            resourceInputs["roles"] = args ? args.roles : undefined;
            resourceInputs["schemaName"] = args ? args.schemaName : undefined;
            resourceInputs["tagName"] = args ? args.tagName : undefined;
            resourceInputs["withGrantOption"] = args ? args.withGrantOption : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(TagGrant.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering TagGrant resources.
 */
export interface TagGrantState {
    /**
     * The name of the database containing the tag on which to grant privileges.
     */
    databaseName?: pulumi.Input<string>;
    /**
     * When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
     * grants applied to roles and objects outside Terraform.
     */
    enableMultipleGrants?: pulumi.Input<boolean>;
    /**
     * The privilege to grant on the tag. To grant all privileges, use the value `ALL PRIVILEGES`.
     */
    privilege?: pulumi.Input<string>;
    /**
     * The name of the role to revert ownership to on destroy. Has no effect unless `privilege` is set to `OWNERSHIP`
     */
    revertOwnershipToRoleName?: pulumi.Input<string>;
    /**
     * Grants privilege to these roles.
     */
    roles?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name of the schema containing the tag on which to grant privileges.
     */
    schemaName?: pulumi.Input<string>;
    /**
     * The name of the tag on which to grant privileges.
     */
    tagName?: pulumi.Input<string>;
    /**
     * When this is set to true, allows the recipient role to grant the privileges to other roles.
     */
    withGrantOption?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a TagGrant resource.
 */
export interface TagGrantArgs {
    /**
     * The name of the database containing the tag on which to grant privileges.
     */
    databaseName: pulumi.Input<string>;
    /**
     * When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
     * grants applied to roles and objects outside Terraform.
     */
    enableMultipleGrants?: pulumi.Input<boolean>;
    /**
     * The privilege to grant on the tag. To grant all privileges, use the value `ALL PRIVILEGES`.
     */
    privilege?: pulumi.Input<string>;
    /**
     * The name of the role to revert ownership to on destroy. Has no effect unless `privilege` is set to `OWNERSHIP`
     */
    revertOwnershipToRoleName?: pulumi.Input<string>;
    /**
     * Grants privilege to these roles.
     */
    roles?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name of the schema containing the tag on which to grant privileges.
     */
    schemaName: pulumi.Input<string>;
    /**
     * The name of the tag on which to grant privileges.
     */
    tagName: pulumi.Input<string>;
    /**
     * When this is set to true, allows the recipient role to grant the privileges to other roles.
     */
    withGrantOption?: pulumi.Input<boolean>;
}
