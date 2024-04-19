// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as snowflake from "@pulumi/snowflake";
 *
 * const emailInt = new snowflake.EmailNotificationIntegration("email_int", {
 *     name: "notification",
 *     comment: "A notification integration.",
 *     enabled: true,
 *     allowedRecipients: ["john.doe@gmail.com"],
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import snowflake:index/emailNotificationIntegration:EmailNotificationIntegration example name
 * ```
 */
export class EmailNotificationIntegration extends pulumi.CustomResource {
    /**
     * Get an existing EmailNotificationIntegration resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: EmailNotificationIntegrationState, opts?: pulumi.CustomResourceOptions): EmailNotificationIntegration {
        return new EmailNotificationIntegration(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'snowflake:index/emailNotificationIntegration:EmailNotificationIntegration';

    /**
     * Returns true if the given object is an instance of EmailNotificationIntegration.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is EmailNotificationIntegration {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === EmailNotificationIntegration.__pulumiType;
    }

    /**
     * List of email addresses that should receive notifications.
     */
    public readonly allowedRecipients!: pulumi.Output<string[] | undefined>;
    /**
     * A comment for the email integration.
     */
    public readonly comment!: pulumi.Output<string | undefined>;
    public readonly enabled!: pulumi.Output<boolean>;
    public readonly name!: pulumi.Output<string>;

    /**
     * Create a EmailNotificationIntegration resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: EmailNotificationIntegrationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: EmailNotificationIntegrationArgs | EmailNotificationIntegrationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as EmailNotificationIntegrationState | undefined;
            resourceInputs["allowedRecipients"] = state ? state.allowedRecipients : undefined;
            resourceInputs["comment"] = state ? state.comment : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
        } else {
            const args = argsOrState as EmailNotificationIntegrationArgs | undefined;
            if ((!args || args.enabled === undefined) && !opts.urn) {
                throw new Error("Missing required property 'enabled'");
            }
            resourceInputs["allowedRecipients"] = args ? args.allowedRecipients : undefined;
            resourceInputs["comment"] = args ? args.comment : undefined;
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(EmailNotificationIntegration.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering EmailNotificationIntegration resources.
 */
export interface EmailNotificationIntegrationState {
    /**
     * List of email addresses that should receive notifications.
     */
    allowedRecipients?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A comment for the email integration.
     */
    comment?: pulumi.Input<string>;
    enabled?: pulumi.Input<boolean>;
    name?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a EmailNotificationIntegration resource.
 */
export interface EmailNotificationIntegrationArgs {
    /**
     * List of email addresses that should receive notifications.
     */
    allowedRecipients?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A comment for the email integration.
     */
    comment?: pulumi.Input<string>;
    enabled: pulumi.Input<boolean>;
    name?: pulumi.Input<string>;
}
