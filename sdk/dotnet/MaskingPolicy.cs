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
    /// $ pulumi import snowflake:index/maskingPolicy:MaskingPolicy example '"&lt;database_name&gt;"."&lt;schema_name&gt;"."&lt;masking_policy_name&gt;"'
    /// ```
    /// </summary>
    [SnowflakeResourceType("snowflake:index/maskingPolicy:MaskingPolicy")]
    public partial class MaskingPolicy : global::Pulumi.CustomResource
    {
        /// <summary>
        /// List of the arguments for the masking policy. The first column and its data type always indicate the column data type values to mask or tokenize in the subsequent policy conditions. Note that you can not specify a virtual column as the first column argument in a conditional masking policy.
        /// </summary>
        [Output("arguments")]
        public Output<ImmutableArray<Outputs.MaskingPolicyArgument>> Arguments { get; private set; } = null!;

        /// <summary>
        /// Specifies the SQL expression that transforms the data. To mitigate permadiff on this field, the provider replaces blank characters with a space. This can lead to false positives in cases where a change in case or run of whitespace is semantically significant.
        /// </summary>
        [Output("body")]
        public Output<string> Body { get; private set; } = null!;

        /// <summary>
        /// Specifies a comment for the masking policy.
        /// </summary>
        [Output("comment")]
        public Output<string?> Comment { get; private set; } = null!;

        /// <summary>
        /// The database in which to create the masking policy. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        /// </summary>
        [Output("database")]
        public Output<string> Database { get; private set; } = null!;

        /// <summary>
        /// Outputs the result of `DESCRIBE MASKING POLICY` for the given masking policy.
        /// </summary>
        [Output("describeOutputs")]
        public Output<ImmutableArray<Outputs.MaskingPolicyDescribeOutput>> DescribeOutputs { get; private set; } = null!;

        /// <summary>
        /// Specifies whether the row access policy or conditional masking policy can reference a column that is already protected by a masking policy. Due to Snowflake limitations, when value is chenged, the resource is recreated. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
        /// </summary>
        [Output("exemptOtherPolicies")]
        public Output<string?> ExemptOtherPolicies { get; private set; } = null!;

        /// <summary>
        /// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        /// </summary>
        [Output("fullyQualifiedName")]
        public Output<string> FullyQualifiedName { get; private set; } = null!;

        /// <summary>
        /// Specifies the identifier for the masking policy; must be unique for the database and schema in which the masking policy is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The return data type must match the input data type of the first column that is specified as an input column. For more information about data types, check [Snowflake docs](https://docs.snowflake.com/en/sql-reference/intro-summary-data-types).
        /// </summary>
        [Output("returnDataType")]
        public Output<string> ReturnDataType { get; private set; } = null!;

        /// <summary>
        /// The schema in which to create the masking policy. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        /// </summary>
        [Output("schema")]
        public Output<string> Schema { get; private set; } = null!;

        /// <summary>
        /// Outputs the result of `SHOW MASKING POLICIES` for the given masking policy.
        /// </summary>
        [Output("showOutputs")]
        public Output<ImmutableArray<Outputs.MaskingPolicyShowOutput>> ShowOutputs { get; private set; } = null!;


        /// <summary>
        /// Create a MaskingPolicy resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public MaskingPolicy(string name, MaskingPolicyArgs args, CustomResourceOptions? options = null)
            : base("snowflake:index/maskingPolicy:MaskingPolicy", name, args ?? new MaskingPolicyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private MaskingPolicy(string name, Input<string> id, MaskingPolicyState? state = null, CustomResourceOptions? options = null)
            : base("snowflake:index/maskingPolicy:MaskingPolicy", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing MaskingPolicy resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static MaskingPolicy Get(string name, Input<string> id, MaskingPolicyState? state = null, CustomResourceOptions? options = null)
        {
            return new MaskingPolicy(name, id, state, options);
        }
    }

    public sealed class MaskingPolicyArgs : global::Pulumi.ResourceArgs
    {
        [Input("arguments", required: true)]
        private InputList<Inputs.MaskingPolicyArgumentArgs>? _arguments;

        /// <summary>
        /// List of the arguments for the masking policy. The first column and its data type always indicate the column data type values to mask or tokenize in the subsequent policy conditions. Note that you can not specify a virtual column as the first column argument in a conditional masking policy.
        /// </summary>
        public InputList<Inputs.MaskingPolicyArgumentArgs> Arguments
        {
            get => _arguments ?? (_arguments = new InputList<Inputs.MaskingPolicyArgumentArgs>());
            set => _arguments = value;
        }

        /// <summary>
        /// Specifies the SQL expression that transforms the data. To mitigate permadiff on this field, the provider replaces blank characters with a space. This can lead to false positives in cases where a change in case or run of whitespace is semantically significant.
        /// </summary>
        [Input("body", required: true)]
        public Input<string> Body { get; set; } = null!;

        /// <summary>
        /// Specifies a comment for the masking policy.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// The database in which to create the masking policy. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        /// </summary>
        [Input("database", required: true)]
        public Input<string> Database { get; set; } = null!;

        /// <summary>
        /// Specifies whether the row access policy or conditional masking policy can reference a column that is already protected by a masking policy. Due to Snowflake limitations, when value is chenged, the resource is recreated. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
        /// </summary>
        [Input("exemptOtherPolicies")]
        public Input<string>? ExemptOtherPolicies { get; set; }

        /// <summary>
        /// Specifies the identifier for the masking policy; must be unique for the database and schema in which the masking policy is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The return data type must match the input data type of the first column that is specified as an input column. For more information about data types, check [Snowflake docs](https://docs.snowflake.com/en/sql-reference/intro-summary-data-types).
        /// </summary>
        [Input("returnDataType", required: true)]
        public Input<string> ReturnDataType { get; set; } = null!;

        /// <summary>
        /// The schema in which to create the masking policy. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        /// </summary>
        [Input("schema", required: true)]
        public Input<string> Schema { get; set; } = null!;

        public MaskingPolicyArgs()
        {
        }
        public static new MaskingPolicyArgs Empty => new MaskingPolicyArgs();
    }

    public sealed class MaskingPolicyState : global::Pulumi.ResourceArgs
    {
        [Input("arguments")]
        private InputList<Inputs.MaskingPolicyArgumentGetArgs>? _arguments;

        /// <summary>
        /// List of the arguments for the masking policy. The first column and its data type always indicate the column data type values to mask or tokenize in the subsequent policy conditions. Note that you can not specify a virtual column as the first column argument in a conditional masking policy.
        /// </summary>
        public InputList<Inputs.MaskingPolicyArgumentGetArgs> Arguments
        {
            get => _arguments ?? (_arguments = new InputList<Inputs.MaskingPolicyArgumentGetArgs>());
            set => _arguments = value;
        }

        /// <summary>
        /// Specifies the SQL expression that transforms the data. To mitigate permadiff on this field, the provider replaces blank characters with a space. This can lead to false positives in cases where a change in case or run of whitespace is semantically significant.
        /// </summary>
        [Input("body")]
        public Input<string>? Body { get; set; }

        /// <summary>
        /// Specifies a comment for the masking policy.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// The database in which to create the masking policy. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        /// </summary>
        [Input("database")]
        public Input<string>? Database { get; set; }

        [Input("describeOutputs")]
        private InputList<Inputs.MaskingPolicyDescribeOutputGetArgs>? _describeOutputs;

        /// <summary>
        /// Outputs the result of `DESCRIBE MASKING POLICY` for the given masking policy.
        /// </summary>
        public InputList<Inputs.MaskingPolicyDescribeOutputGetArgs> DescribeOutputs
        {
            get => _describeOutputs ?? (_describeOutputs = new InputList<Inputs.MaskingPolicyDescribeOutputGetArgs>());
            set => _describeOutputs = value;
        }

        /// <summary>
        /// Specifies whether the row access policy or conditional masking policy can reference a column that is already protected by a masking policy. Due to Snowflake limitations, when value is chenged, the resource is recreated. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
        /// </summary>
        [Input("exemptOtherPolicies")]
        public Input<string>? ExemptOtherPolicies { get; set; }

        /// <summary>
        /// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        /// </summary>
        [Input("fullyQualifiedName")]
        public Input<string>? FullyQualifiedName { get; set; }

        /// <summary>
        /// Specifies the identifier for the masking policy; must be unique for the database and schema in which the masking policy is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The return data type must match the input data type of the first column that is specified as an input column. For more information about data types, check [Snowflake docs](https://docs.snowflake.com/en/sql-reference/intro-summary-data-types).
        /// </summary>
        [Input("returnDataType")]
        public Input<string>? ReturnDataType { get; set; }

        /// <summary>
        /// The schema in which to create the masking policy. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        /// </summary>
        [Input("schema")]
        public Input<string>? Schema { get; set; }

        [Input("showOutputs")]
        private InputList<Inputs.MaskingPolicyShowOutputGetArgs>? _showOutputs;

        /// <summary>
        /// Outputs the result of `SHOW MASKING POLICIES` for the given masking policy.
        /// </summary>
        public InputList<Inputs.MaskingPolicyShowOutputGetArgs> ShowOutputs
        {
            get => _showOutputs ?? (_showOutputs = new InputList<Inputs.MaskingPolicyShowOutputGetArgs>());
            set => _showOutputs = value;
        }

        public MaskingPolicyState()
        {
        }
        public static new MaskingPolicyState Empty => new MaskingPolicyState();
    }
}
