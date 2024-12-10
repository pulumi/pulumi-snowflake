// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake
{
    [SnowflakeResourceType("snowflake:index/accountAuthenticationPolicyAttachment:AccountAuthenticationPolicyAttachment")]
    public partial class AccountAuthenticationPolicyAttachment : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Qualified name (`"db"."schema"."policy_name"`) of the authentication policy to apply to the current account.
        /// </summary>
        [Output("authenticationPolicy")]
        public Output<string> AuthenticationPolicy { get; private set; } = null!;


        /// <summary>
        /// Create a AccountAuthenticationPolicyAttachment resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AccountAuthenticationPolicyAttachment(string name, AccountAuthenticationPolicyAttachmentArgs args, CustomResourceOptions? options = null)
            : base("snowflake:index/accountAuthenticationPolicyAttachment:AccountAuthenticationPolicyAttachment", name, args ?? new AccountAuthenticationPolicyAttachmentArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AccountAuthenticationPolicyAttachment(string name, Input<string> id, AccountAuthenticationPolicyAttachmentState? state = null, CustomResourceOptions? options = null)
            : base("snowflake:index/accountAuthenticationPolicyAttachment:AccountAuthenticationPolicyAttachment", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing AccountAuthenticationPolicyAttachment resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AccountAuthenticationPolicyAttachment Get(string name, Input<string> id, AccountAuthenticationPolicyAttachmentState? state = null, CustomResourceOptions? options = null)
        {
            return new AccountAuthenticationPolicyAttachment(name, id, state, options);
        }
    }

    public sealed class AccountAuthenticationPolicyAttachmentArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Qualified name (`"db"."schema"."policy_name"`) of the authentication policy to apply to the current account.
        /// </summary>
        [Input("authenticationPolicy", required: true)]
        public Input<string> AuthenticationPolicy { get; set; } = null!;

        public AccountAuthenticationPolicyAttachmentArgs()
        {
        }
        public static new AccountAuthenticationPolicyAttachmentArgs Empty => new AccountAuthenticationPolicyAttachmentArgs();
    }

    public sealed class AccountAuthenticationPolicyAttachmentState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Qualified name (`"db"."schema"."policy_name"`) of the authentication policy to apply to the current account.
        /// </summary>
        [Input("authenticationPolicy")]
        public Input<string>? AuthenticationPolicy { get; set; }

        public AccountAuthenticationPolicyAttachmentState()
        {
        }
        public static new AccountAuthenticationPolicyAttachmentState Empty => new AccountAuthenticationPolicyAttachmentState();
    }
}