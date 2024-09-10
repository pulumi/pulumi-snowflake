// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * ## Import
 *
 * ```sh
 * $ pulumi import snowflake:index/userPasswordPolicyAttachment:UserPasswordPolicyAttachment example "MY_DATABASE|MY_SCHEMA|PASSWORD_POLICY_NAME|USER_NAME"
 * ```
 */
export class UserPasswordPolicyAttachment extends pulumi.CustomResource {
    /**
     * Get an existing UserPasswordPolicyAttachment resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: UserPasswordPolicyAttachmentState, opts?: pulumi.CustomResourceOptions): UserPasswordPolicyAttachment {
        return new UserPasswordPolicyAttachment(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'snowflake:index/userPasswordPolicyAttachment:UserPasswordPolicyAttachment';

    /**
     * Returns true if the given object is an instance of UserPasswordPolicyAttachment.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is UserPasswordPolicyAttachment {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === UserPasswordPolicyAttachment.__pulumiType;
    }

    /**
     * Fully qualified name of the password policy
     */
    public readonly passwordPolicyName!: pulumi.Output<string>;
    /**
     * User name of the user you want to attach the password policy to
     */
    public readonly userName!: pulumi.Output<string>;

    /**
     * Create a UserPasswordPolicyAttachment resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: UserPasswordPolicyAttachmentArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: UserPasswordPolicyAttachmentArgs | UserPasswordPolicyAttachmentState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as UserPasswordPolicyAttachmentState | undefined;
            resourceInputs["passwordPolicyName"] = state ? state.passwordPolicyName : undefined;
            resourceInputs["userName"] = state ? state.userName : undefined;
        } else {
            const args = argsOrState as UserPasswordPolicyAttachmentArgs | undefined;
            if ((!args || args.passwordPolicyName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'passwordPolicyName'");
            }
            if ((!args || args.userName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'userName'");
            }
            resourceInputs["passwordPolicyName"] = args ? args.passwordPolicyName : undefined;
            resourceInputs["userName"] = args ? args.userName : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(UserPasswordPolicyAttachment.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering UserPasswordPolicyAttachment resources.
 */
export interface UserPasswordPolicyAttachmentState {
    /**
     * Fully qualified name of the password policy
     */
    passwordPolicyName?: pulumi.Input<string>;
    /**
     * User name of the user you want to attach the password policy to
     */
    userName?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a UserPasswordPolicyAttachment resource.
 */
export interface UserPasswordPolicyAttachmentArgs {
    /**
     * Fully qualified name of the password policy
     */
    passwordPolicyName: pulumi.Input<string>;
    /**
     * User name of the user you want to attach the password policy to
     */
    userName: pulumi.Input<string>;
}
