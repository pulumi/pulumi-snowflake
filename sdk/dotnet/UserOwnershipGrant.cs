// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake
{
    /// <summary>
    /// &gt; **Deprecation** This resource is deprecated and will be removed in a future major version release. Please use snowflake.GrantOwnership instead. &lt;deprecation&gt;
    /// </summary>
    [SnowflakeResourceType("snowflake:index/userOwnershipGrant:UserOwnershipGrant")]
    public partial class UserOwnershipGrant : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Specifies whether to remove or transfer all existing outbound privileges on the object when ownership is transferred to a new role.
        /// </summary>
        [Output("currentGrants")]
        public Output<string?> CurrentGrants { get; private set; } = null!;

        /// <summary>
        /// The name of the user ownership is granted on.
        /// </summary>
        [Output("onUserName")]
        public Output<string> OnUserName { get; private set; } = null!;

        /// <summary>
        /// The name of the role to revert ownership to on destroy.
        /// </summary>
        [Output("revertOwnershipToRoleName")]
        public Output<string?> RevertOwnershipToRoleName { get; private set; } = null!;

        [Output("toRoleName")]
        public Output<string> ToRoleName { get; private set; } = null!;


        /// <summary>
        /// Create a UserOwnershipGrant resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public UserOwnershipGrant(string name, UserOwnershipGrantArgs args, CustomResourceOptions? options = null)
            : base("snowflake:index/userOwnershipGrant:UserOwnershipGrant", name, args ?? new UserOwnershipGrantArgs(), MakeResourceOptions(options, ""))
        {
        }

        private UserOwnershipGrant(string name, Input<string> id, UserOwnershipGrantState? state = null, CustomResourceOptions? options = null)
            : base("snowflake:index/userOwnershipGrant:UserOwnershipGrant", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing UserOwnershipGrant resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static UserOwnershipGrant Get(string name, Input<string> id, UserOwnershipGrantState? state = null, CustomResourceOptions? options = null)
        {
            return new UserOwnershipGrant(name, id, state, options);
        }
    }

    public sealed class UserOwnershipGrantArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies whether to remove or transfer all existing outbound privileges on the object when ownership is transferred to a new role.
        /// </summary>
        [Input("currentGrants")]
        public Input<string>? CurrentGrants { get; set; }

        /// <summary>
        /// The name of the user ownership is granted on.
        /// </summary>
        [Input("onUserName", required: true)]
        public Input<string> OnUserName { get; set; } = null!;

        /// <summary>
        /// The name of the role to revert ownership to on destroy.
        /// </summary>
        [Input("revertOwnershipToRoleName")]
        public Input<string>? RevertOwnershipToRoleName { get; set; }

        [Input("toRoleName", required: true)]
        public Input<string> ToRoleName { get; set; } = null!;

        public UserOwnershipGrantArgs()
        {
        }
        public static new UserOwnershipGrantArgs Empty => new UserOwnershipGrantArgs();
    }

    public sealed class UserOwnershipGrantState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies whether to remove or transfer all existing outbound privileges on the object when ownership is transferred to a new role.
        /// </summary>
        [Input("currentGrants")]
        public Input<string>? CurrentGrants { get; set; }

        /// <summary>
        /// The name of the user ownership is granted on.
        /// </summary>
        [Input("onUserName")]
        public Input<string>? OnUserName { get; set; }

        /// <summary>
        /// The name of the role to revert ownership to on destroy.
        /// </summary>
        [Input("revertOwnershipToRoleName")]
        public Input<string>? RevertOwnershipToRoleName { get; set; }

        [Input("toRoleName")]
        public Input<string>? ToRoleName { get; set; }

        public UserOwnershipGrantState()
        {
        }
        public static new UserOwnershipGrantState Empty => new UserOwnershipGrantState();
    }
}
