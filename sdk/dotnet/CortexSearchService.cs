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
    /// $ pulumi import snowflake:index/cortexSearchService:CortexSearchService example 'dbName|schemaName|fileFormatName'
    /// ```
    /// </summary>
    [SnowflakeResourceType("snowflake:index/cortexSearchService:CortexSearchService")]
    public partial class CortexSearchService : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Specifies the list of columns in the base table to enable filtering on when issuing queries to the service.
        /// </summary>
        [Output("attributes")]
        public Output<ImmutableArray<string>> Attributes { get; private set; } = null!;

        /// <summary>
        /// Specifies a comment for the Cortex search service.
        /// </summary>
        [Output("comment")]
        public Output<string?> Comment { get; private set; } = null!;

        /// <summary>
        /// Creation date for the given Cortex search service.
        /// </summary>
        [Output("createdOn")]
        public Output<string> CreatedOn { get; private set; } = null!;

        /// <summary>
        /// The database in which to create the Cortex search service.
        /// </summary>
        [Output("database")]
        public Output<string> Database { get; private set; } = null!;

        /// <summary>
        /// Specifies the name of the Cortex search service. The name must be unique for the schema in which the service is created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Specifies the column to use as the search column for the Cortex search service; must be a text value.
        /// </summary>
        [Output("on")]
        public Output<string> On { get; private set; } = null!;

        /// <summary>
        /// Specifies the query to use to populate the Cortex search service.
        /// </summary>
        [Output("query")]
        public Output<string> Query { get; private set; } = null!;

        /// <summary>
        /// The schema in which to create the Cortex search service.
        /// </summary>
        [Output("schema")]
        public Output<string> Schema { get; private set; } = null!;

        /// <summary>
        /// Specifies the maximum target lag time for the Cortex search service.
        /// </summary>
        [Output("targetLag")]
        public Output<string> TargetLag { get; private set; } = null!;

        /// <summary>
        /// The warehouse in which to create the Cortex search service.
        /// </summary>
        [Output("warehouse")]
        public Output<string> Warehouse { get; private set; } = null!;


        /// <summary>
        /// Create a CortexSearchService resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public CortexSearchService(string name, CortexSearchServiceArgs args, CustomResourceOptions? options = null)
            : base("snowflake:index/cortexSearchService:CortexSearchService", name, args ?? new CortexSearchServiceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private CortexSearchService(string name, Input<string> id, CortexSearchServiceState? state = null, CustomResourceOptions? options = null)
            : base("snowflake:index/cortexSearchService:CortexSearchService", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing CortexSearchService resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static CortexSearchService Get(string name, Input<string> id, CortexSearchServiceState? state = null, CustomResourceOptions? options = null)
        {
            return new CortexSearchService(name, id, state, options);
        }
    }

    public sealed class CortexSearchServiceArgs : global::Pulumi.ResourceArgs
    {
        [Input("attributes")]
        private InputList<string>? _attributes;

        /// <summary>
        /// Specifies the list of columns in the base table to enable filtering on when issuing queries to the service.
        /// </summary>
        public InputList<string> Attributes
        {
            get => _attributes ?? (_attributes = new InputList<string>());
            set => _attributes = value;
        }

        /// <summary>
        /// Specifies a comment for the Cortex search service.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// The database in which to create the Cortex search service.
        /// </summary>
        [Input("database", required: true)]
        public Input<string> Database { get; set; } = null!;

        /// <summary>
        /// Specifies the name of the Cortex search service. The name must be unique for the schema in which the service is created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Specifies the column to use as the search column for the Cortex search service; must be a text value.
        /// </summary>
        [Input("on", required: true)]
        public Input<string> On { get; set; } = null!;

        /// <summary>
        /// Specifies the query to use to populate the Cortex search service.
        /// </summary>
        [Input("query", required: true)]
        public Input<string> Query { get; set; } = null!;

        /// <summary>
        /// The schema in which to create the Cortex search service.
        /// </summary>
        [Input("schema", required: true)]
        public Input<string> Schema { get; set; } = null!;

        /// <summary>
        /// Specifies the maximum target lag time for the Cortex search service.
        /// </summary>
        [Input("targetLag", required: true)]
        public Input<string> TargetLag { get; set; } = null!;

        /// <summary>
        /// The warehouse in which to create the Cortex search service.
        /// </summary>
        [Input("warehouse", required: true)]
        public Input<string> Warehouse { get; set; } = null!;

        public CortexSearchServiceArgs()
        {
        }
        public static new CortexSearchServiceArgs Empty => new CortexSearchServiceArgs();
    }

    public sealed class CortexSearchServiceState : global::Pulumi.ResourceArgs
    {
        [Input("attributes")]
        private InputList<string>? _attributes;

        /// <summary>
        /// Specifies the list of columns in the base table to enable filtering on when issuing queries to the service.
        /// </summary>
        public InputList<string> Attributes
        {
            get => _attributes ?? (_attributes = new InputList<string>());
            set => _attributes = value;
        }

        /// <summary>
        /// Specifies a comment for the Cortex search service.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// Creation date for the given Cortex search service.
        /// </summary>
        [Input("createdOn")]
        public Input<string>? CreatedOn { get; set; }

        /// <summary>
        /// The database in which to create the Cortex search service.
        /// </summary>
        [Input("database")]
        public Input<string>? Database { get; set; }

        /// <summary>
        /// Specifies the name of the Cortex search service. The name must be unique for the schema in which the service is created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Specifies the column to use as the search column for the Cortex search service; must be a text value.
        /// </summary>
        [Input("on")]
        public Input<string>? On { get; set; }

        /// <summary>
        /// Specifies the query to use to populate the Cortex search service.
        /// </summary>
        [Input("query")]
        public Input<string>? Query { get; set; }

        /// <summary>
        /// The schema in which to create the Cortex search service.
        /// </summary>
        [Input("schema")]
        public Input<string>? Schema { get; set; }

        /// <summary>
        /// Specifies the maximum target lag time for the Cortex search service.
        /// </summary>
        [Input("targetLag")]
        public Input<string>? TargetLag { get; set; }

        /// <summary>
        /// The warehouse in which to create the Cortex search service.
        /// </summary>
        [Input("warehouse")]
        public Input<string>? Warehouse { get; set; }

        public CortexSearchServiceState()
        {
        }
        public static new CortexSearchServiceState Empty => new CortexSearchServiceState();
    }
}