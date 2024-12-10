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
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import snowflake:index/secondaryConnection:SecondaryConnection example 'secondary_connection_name'
    /// ```
    /// </summary>
    [SnowflakeResourceType("snowflake:index/secondaryConnection:SecondaryConnection")]
    public partial class SecondaryConnection : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Specifies the identifier for a primary connection from which to create a replica (i.e. a secondary connection).
        /// </summary>
        [Output("asReplicaOf")]
        public Output<string> AsReplicaOf { get; private set; } = null!;

        /// <summary>
        /// Specifies a comment for the secondary connection.
        /// </summary>
        [Output("comment")]
        public Output<string?> Comment { get; private set; } = null!;

        /// <summary>
        /// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        /// </summary>
        [Output("fullyQualifiedName")]
        public Output<string> FullyQualifiedName { get; private set; } = null!;

        /// <summary>
        /// Indicates if the connection primary status has been changed. If change is detected, resource will be recreated.
        /// </summary>
        [Output("isPrimary")]
        public Output<bool> IsPrimary { get; private set; } = null!;

        /// <summary>
        /// String that specifies the identifier (i.e. name) for the connection. Must start with an alphabetic character and may only contain letters, decimal digits (0-9), and underscores (_). For a secondary connection, the name must match the name of its primary connection. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Outputs the result of `SHOW CONNECTIONS` for the given connection.
        /// </summary>
        [Output("showOutputs")]
        public Output<ImmutableArray<Outputs.SecondaryConnectionShowOutput>> ShowOutputs { get; private set; } = null!;


        /// <summary>
        /// Create a SecondaryConnection resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SecondaryConnection(string name, SecondaryConnectionArgs args, CustomResourceOptions? options = null)
            : base("snowflake:index/secondaryConnection:SecondaryConnection", name, args ?? new SecondaryConnectionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SecondaryConnection(string name, Input<string> id, SecondaryConnectionState? state = null, CustomResourceOptions? options = null)
            : base("snowflake:index/secondaryConnection:SecondaryConnection", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing SecondaryConnection resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SecondaryConnection Get(string name, Input<string> id, SecondaryConnectionState? state = null, CustomResourceOptions? options = null)
        {
            return new SecondaryConnection(name, id, state, options);
        }
    }

    public sealed class SecondaryConnectionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the identifier for a primary connection from which to create a replica (i.e. a secondary connection).
        /// </summary>
        [Input("asReplicaOf", required: true)]
        public Input<string> AsReplicaOf { get; set; } = null!;

        /// <summary>
        /// Specifies a comment for the secondary connection.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// String that specifies the identifier (i.e. name) for the connection. Must start with an alphabetic character and may only contain letters, decimal digits (0-9), and underscores (_). For a secondary connection, the name must match the name of its primary connection. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public SecondaryConnectionArgs()
        {
        }
        public static new SecondaryConnectionArgs Empty => new SecondaryConnectionArgs();
    }

    public sealed class SecondaryConnectionState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the identifier for a primary connection from which to create a replica (i.e. a secondary connection).
        /// </summary>
        [Input("asReplicaOf")]
        public Input<string>? AsReplicaOf { get; set; }

        /// <summary>
        /// Specifies a comment for the secondary connection.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        /// </summary>
        [Input("fullyQualifiedName")]
        public Input<string>? FullyQualifiedName { get; set; }

        /// <summary>
        /// Indicates if the connection primary status has been changed. If change is detected, resource will be recreated.
        /// </summary>
        [Input("isPrimary")]
        public Input<bool>? IsPrimary { get; set; }

        /// <summary>
        /// String that specifies the identifier (i.e. name) for the connection. Must start with an alphabetic character and may only contain letters, decimal digits (0-9), and underscores (_). For a secondary connection, the name must match the name of its primary connection. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("showOutputs")]
        private InputList<Inputs.SecondaryConnectionShowOutputGetArgs>? _showOutputs;

        /// <summary>
        /// Outputs the result of `SHOW CONNECTIONS` for the given connection.
        /// </summary>
        public InputList<Inputs.SecondaryConnectionShowOutputGetArgs> ShowOutputs
        {
            get => _showOutputs ?? (_showOutputs = new InputList<Inputs.SecondaryConnectionShowOutputGetArgs>());
            set => _showOutputs = value;
        }

        public SecondaryConnectionState()
        {
        }
        public static new SecondaryConnectionState Empty => new SecondaryConnectionState();
    }
}