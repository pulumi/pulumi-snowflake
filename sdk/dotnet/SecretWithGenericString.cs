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
    /// $ pulumi import snowflake:index/secretWithGenericString:SecretWithGenericString example '"&lt;database_name&gt;"."&lt;schema_name&gt;"."&lt;secret_name&gt;"'
    /// ```
    /// </summary>
    [SnowflakeResourceType("snowflake:index/secretWithGenericString:SecretWithGenericString")]
    public partial class SecretWithGenericString : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Specifies a comment for the secret.
        /// </summary>
        [Output("comment")]
        public Output<string?> Comment { get; private set; } = null!;

        /// <summary>
        /// The database in which to create the secret Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
        /// </summary>
        [Output("database")]
        public Output<string> Database { get; private set; } = null!;

        /// <summary>
        /// Outputs the result of `DESCRIBE SECRET` for the given secret.
        /// </summary>
        [Output("describeOutputs")]
        public Output<ImmutableArray<Outputs.SecretWithGenericStringDescribeOutput>> DescribeOutputs { get; private set; } = null!;

        /// <summary>
        /// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        /// </summary>
        [Output("fullyQualifiedName")]
        public Output<string> FullyQualifiedName { get; private set; } = null!;

        /// <summary>
        /// String that specifies the identifier (i.e. name) for the secret, must be unique in your schema. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The schema in which to create the secret. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
        /// </summary>
        [Output("schema")]
        public Output<string> Schema { get; private set; } = null!;

        [Output("secretString")]
        public Output<string> SecretString { get; private set; } = null!;

        /// <summary>
        /// Specifies a type for the secret. This field is used for checking external changes and recreating the resources if needed.
        /// </summary>
        [Output("secretType")]
        public Output<string> SecretType { get; private set; } = null!;

        /// <summary>
        /// Outputs the result of `SHOW SECRETS` for the given secret.
        /// </summary>
        [Output("showOutputs")]
        public Output<ImmutableArray<Outputs.SecretWithGenericStringShowOutput>> ShowOutputs { get; private set; } = null!;


        /// <summary>
        /// Create a SecretWithGenericString resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SecretWithGenericString(string name, SecretWithGenericStringArgs args, CustomResourceOptions? options = null)
            : base("snowflake:index/secretWithGenericString:SecretWithGenericString", name, args ?? new SecretWithGenericStringArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SecretWithGenericString(string name, Input<string> id, SecretWithGenericStringState? state = null, CustomResourceOptions? options = null)
            : base("snowflake:index/secretWithGenericString:SecretWithGenericString", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "secretString",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing SecretWithGenericString resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SecretWithGenericString Get(string name, Input<string> id, SecretWithGenericStringState? state = null, CustomResourceOptions? options = null)
        {
            return new SecretWithGenericString(name, id, state, options);
        }
    }

    public sealed class SecretWithGenericStringArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies a comment for the secret.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// The database in which to create the secret Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
        /// </summary>
        [Input("database", required: true)]
        public Input<string> Database { get; set; } = null!;

        /// <summary>
        /// String that specifies the identifier (i.e. name) for the secret, must be unique in your schema. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The schema in which to create the secret. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
        /// </summary>
        [Input("schema", required: true)]
        public Input<string> Schema { get; set; } = null!;

        [Input("secretString", required: true)]
        private Input<string>? _secretString;
        public Input<string>? SecretString
        {
            get => _secretString;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _secretString = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        public SecretWithGenericStringArgs()
        {
        }
        public static new SecretWithGenericStringArgs Empty => new SecretWithGenericStringArgs();
    }

    public sealed class SecretWithGenericStringState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies a comment for the secret.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// The database in which to create the secret Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
        /// </summary>
        [Input("database")]
        public Input<string>? Database { get; set; }

        [Input("describeOutputs")]
        private InputList<Inputs.SecretWithGenericStringDescribeOutputGetArgs>? _describeOutputs;

        /// <summary>
        /// Outputs the result of `DESCRIBE SECRET` for the given secret.
        /// </summary>
        public InputList<Inputs.SecretWithGenericStringDescribeOutputGetArgs> DescribeOutputs
        {
            get => _describeOutputs ?? (_describeOutputs = new InputList<Inputs.SecretWithGenericStringDescribeOutputGetArgs>());
            set => _describeOutputs = value;
        }

        /// <summary>
        /// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        /// </summary>
        [Input("fullyQualifiedName")]
        public Input<string>? FullyQualifiedName { get; set; }

        /// <summary>
        /// String that specifies the identifier (i.e. name) for the secret, must be unique in your schema. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The schema in which to create the secret. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
        /// </summary>
        [Input("schema")]
        public Input<string>? Schema { get; set; }

        [Input("secretString")]
        private Input<string>? _secretString;
        public Input<string>? SecretString
        {
            get => _secretString;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _secretString = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Specifies a type for the secret. This field is used for checking external changes and recreating the resources if needed.
        /// </summary>
        [Input("secretType")]
        public Input<string>? SecretType { get; set; }

        [Input("showOutputs")]
        private InputList<Inputs.SecretWithGenericStringShowOutputGetArgs>? _showOutputs;

        /// <summary>
        /// Outputs the result of `SHOW SECRETS` for the given secret.
        /// </summary>
        public InputList<Inputs.SecretWithGenericStringShowOutputGetArgs> ShowOutputs
        {
            get => _showOutputs ?? (_showOutputs = new InputList<Inputs.SecretWithGenericStringShowOutputGetArgs>());
            set => _showOutputs = value;
        }

        public SecretWithGenericStringState()
        {
        }
        public static new SecretWithGenericStringState Empty => new SecretWithGenericStringState();
    }
}
