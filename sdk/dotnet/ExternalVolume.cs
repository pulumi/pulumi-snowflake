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
    /// Resource used to manage external volume objects. For more information, check [external volume documentation](https://docs.snowflake.com/en/sql-reference/commands-data-loading#external-volume).
    /// </summary>
    [SnowflakeResourceType("snowflake:index/externalVolume:ExternalVolume")]
    public partial class ExternalVolume : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Specifies whether write operations are allowed for the external volume; must be set to TRUE for Iceberg tables that use Snowflake as the catalog. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
        /// </summary>
        [Output("allowWrites")]
        public Output<string?> AllowWrites { get; private set; } = null!;

        /// <summary>
        /// Specifies a comment for the external volume.
        /// </summary>
        [Output("comment")]
        public Output<string?> Comment { get; private set; } = null!;

        /// <summary>
        /// Outputs the result of `DESCRIBE EXTERNAL VOLUME` for the given external volume.
        /// </summary>
        [Output("describeOutputs")]
        public Output<ImmutableArray<Outputs.ExternalVolumeDescribeOutput>> DescribeOutputs { get; private set; } = null!;

        /// <summary>
        /// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        /// </summary>
        [Output("fullyQualifiedName")]
        public Output<string> FullyQualifiedName { get; private set; } = null!;

        /// <summary>
        /// Identifier for the external volume; must be unique for your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Outputs the result of `SHOW EXTERNAL VOLUMES` for the given external volume.
        /// </summary>
        [Output("showOutputs")]
        public Output<ImmutableArray<Outputs.ExternalVolumeShowOutput>> ShowOutputs { get; private set; } = null!;

        /// <summary>
        /// List of named cloud storage locations in different regions and, optionally, cloud platforms. Minimum 1 required. The order of the list is important as it impacts the active storage location, and updates will be triggered if it changes. Note that not all parameter combinations are valid as they depend on the given storage*provider. Consult [the docs](https://docs.snowflake.com/en/sql-reference/sql/create-external-volume#cloud-provider-parameters-cloudproviderparams) for more details on this.
        /// </summary>
        [Output("storageLocations")]
        public Output<ImmutableArray<Outputs.ExternalVolumeStorageLocation>> StorageLocations { get; private set; } = null!;


        /// <summary>
        /// Create a ExternalVolume resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ExternalVolume(string name, ExternalVolumeArgs args, CustomResourceOptions? options = null)
            : base("snowflake:index/externalVolume:ExternalVolume", name, args ?? new ExternalVolumeArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ExternalVolume(string name, Input<string> id, ExternalVolumeState? state = null, CustomResourceOptions? options = null)
            : base("snowflake:index/externalVolume:ExternalVolume", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ExternalVolume resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ExternalVolume Get(string name, Input<string> id, ExternalVolumeState? state = null, CustomResourceOptions? options = null)
        {
            return new ExternalVolume(name, id, state, options);
        }
    }

    public sealed class ExternalVolumeArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies whether write operations are allowed for the external volume; must be set to TRUE for Iceberg tables that use Snowflake as the catalog. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
        /// </summary>
        [Input("allowWrites")]
        public Input<string>? AllowWrites { get; set; }

        /// <summary>
        /// Specifies a comment for the external volume.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// Identifier for the external volume; must be unique for your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("storageLocations", required: true)]
        private InputList<Inputs.ExternalVolumeStorageLocationArgs>? _storageLocations;

        /// <summary>
        /// List of named cloud storage locations in different regions and, optionally, cloud platforms. Minimum 1 required. The order of the list is important as it impacts the active storage location, and updates will be triggered if it changes. Note that not all parameter combinations are valid as they depend on the given storage*provider. Consult [the docs](https://docs.snowflake.com/en/sql-reference/sql/create-external-volume#cloud-provider-parameters-cloudproviderparams) for more details on this.
        /// </summary>
        public InputList<Inputs.ExternalVolumeStorageLocationArgs> StorageLocations
        {
            get => _storageLocations ?? (_storageLocations = new InputList<Inputs.ExternalVolumeStorageLocationArgs>());
            set => _storageLocations = value;
        }

        public ExternalVolumeArgs()
        {
        }
        public static new ExternalVolumeArgs Empty => new ExternalVolumeArgs();
    }

    public sealed class ExternalVolumeState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies whether write operations are allowed for the external volume; must be set to TRUE for Iceberg tables that use Snowflake as the catalog. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
        /// </summary>
        [Input("allowWrites")]
        public Input<string>? AllowWrites { get; set; }

        /// <summary>
        /// Specifies a comment for the external volume.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        [Input("describeOutputs")]
        private InputList<Inputs.ExternalVolumeDescribeOutputGetArgs>? _describeOutputs;

        /// <summary>
        /// Outputs the result of `DESCRIBE EXTERNAL VOLUME` for the given external volume.
        /// </summary>
        public InputList<Inputs.ExternalVolumeDescribeOutputGetArgs> DescribeOutputs
        {
            get => _describeOutputs ?? (_describeOutputs = new InputList<Inputs.ExternalVolumeDescribeOutputGetArgs>());
            set => _describeOutputs = value;
        }

        /// <summary>
        /// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        /// </summary>
        [Input("fullyQualifiedName")]
        public Input<string>? FullyQualifiedName { get; set; }

        /// <summary>
        /// Identifier for the external volume; must be unique for your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("showOutputs")]
        private InputList<Inputs.ExternalVolumeShowOutputGetArgs>? _showOutputs;

        /// <summary>
        /// Outputs the result of `SHOW EXTERNAL VOLUMES` for the given external volume.
        /// </summary>
        public InputList<Inputs.ExternalVolumeShowOutputGetArgs> ShowOutputs
        {
            get => _showOutputs ?? (_showOutputs = new InputList<Inputs.ExternalVolumeShowOutputGetArgs>());
            set => _showOutputs = value;
        }

        [Input("storageLocations")]
        private InputList<Inputs.ExternalVolumeStorageLocationGetArgs>? _storageLocations;

        /// <summary>
        /// List of named cloud storage locations in different regions and, optionally, cloud platforms. Minimum 1 required. The order of the list is important as it impacts the active storage location, and updates will be triggered if it changes. Note that not all parameter combinations are valid as they depend on the given storage*provider. Consult [the docs](https://docs.snowflake.com/en/sql-reference/sql/create-external-volume#cloud-provider-parameters-cloudproviderparams) for more details on this.
        /// </summary>
        public InputList<Inputs.ExternalVolumeStorageLocationGetArgs> StorageLocations
        {
            get => _storageLocations ?? (_storageLocations = new InputList<Inputs.ExternalVolumeStorageLocationGetArgs>());
            set => _storageLocations = value;
        }

        public ExternalVolumeState()
        {
        }
        public static new ExternalVolumeState Empty => new ExternalVolumeState();
    }
}