// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake
{
    /// <summary>
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import snowflake:index/emailNotificationIntegration:EmailNotificationIntegration example name
    /// ```
    /// </summary>
    [SnowflakeResourceType("snowflake:index/emailNotificationIntegration:EmailNotificationIntegration")]
    public partial class EmailNotificationIntegration : global::Pulumi.CustomResource
    {
        /// <summary>
        /// List of email addresses that should receive notifications.
        /// </summary>
        [Output("allowedRecipients")]
        public Output<ImmutableArray<string>> AllowedRecipients { get; private set; } = null!;

        /// <summary>
        /// A comment for the email integration.
        /// </summary>
        [Output("comment")]
        public Output<string?> Comment { get; private set; } = null!;

        [Output("enabled")]
        public Output<bool> Enabled { get; private set; } = null!;

        /// <summary>
        /// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        /// </summary>
        [Output("fullyQualifiedName")]
        public Output<string> FullyQualifiedName { get; private set; } = null!;

        [Output("name")]
        public Output<string> Name { get; private set; } = null!;


        /// <summary>
        /// Create a EmailNotificationIntegration resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public EmailNotificationIntegration(string name, EmailNotificationIntegrationArgs args, CustomResourceOptions? options = null)
            : base("snowflake:index/emailNotificationIntegration:EmailNotificationIntegration", name, args ?? new EmailNotificationIntegrationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private EmailNotificationIntegration(string name, Input<string> id, EmailNotificationIntegrationState? state = null, CustomResourceOptions? options = null)
            : base("snowflake:index/emailNotificationIntegration:EmailNotificationIntegration", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing EmailNotificationIntegration resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static EmailNotificationIntegration Get(string name, Input<string> id, EmailNotificationIntegrationState? state = null, CustomResourceOptions? options = null)
        {
            return new EmailNotificationIntegration(name, id, state, options);
        }
    }

    public sealed class EmailNotificationIntegrationArgs : global::Pulumi.ResourceArgs
    {
        [Input("allowedRecipients")]
        private InputList<string>? _allowedRecipients;

        /// <summary>
        /// List of email addresses that should receive notifications.
        /// </summary>
        public InputList<string> AllowedRecipients
        {
            get => _allowedRecipients ?? (_allowedRecipients = new InputList<string>());
            set => _allowedRecipients = value;
        }

        /// <summary>
        /// A comment for the email integration.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        [Input("enabled", required: true)]
        public Input<bool> Enabled { get; set; } = null!;

        [Input("name")]
        public Input<string>? Name { get; set; }

        public EmailNotificationIntegrationArgs()
        {
        }
        public static new EmailNotificationIntegrationArgs Empty => new EmailNotificationIntegrationArgs();
    }

    public sealed class EmailNotificationIntegrationState : global::Pulumi.ResourceArgs
    {
        [Input("allowedRecipients")]
        private InputList<string>? _allowedRecipients;

        /// <summary>
        /// List of email addresses that should receive notifications.
        /// </summary>
        public InputList<string> AllowedRecipients
        {
            get => _allowedRecipients ?? (_allowedRecipients = new InputList<string>());
            set => _allowedRecipients = value;
        }

        /// <summary>
        /// A comment for the email integration.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        /// </summary>
        [Input("fullyQualifiedName")]
        public Input<string>? FullyQualifiedName { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        public EmailNotificationIntegrationState()
        {
        }
        public static new EmailNotificationIntegrationState Empty => new EmailNotificationIntegrationState();
    }
}
