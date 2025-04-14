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
    /// format is &lt;database_name&gt;.&lt;schema_name&gt;.&lt;external_function_name&gt;(&lt;arg types, separated with ','&gt;)
    /// 
    /// ```sh
    /// $ pulumi import snowflake:index/externalFunction:ExternalFunction example 'dbName.schemaName.externalFunctionName(varchar, varchar, varchar)'
    /// ```
    /// </summary>
    [SnowflakeResourceType("snowflake:index/externalFunction:ExternalFunction")]
    public partial class ExternalFunction : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The name of the API integration object that should be used to authenticate the call to the proxy service.
        /// </summary>
        [Output("apiIntegration")]
        public Output<string> ApiIntegration { get; private set; } = null!;

        /// <summary>
        /// Specifies the arguments/inputs for the external function. These should correspond to the arguments that the remote service expects.
        /// </summary>
        [Output("args")]
        public Output<ImmutableArray<Outputs.ExternalFunctionArg>> Args { get; private set; } = null!;

        /// <summary>
        /// (Default: `user-defined function`) A description of the external function.
        /// </summary>
        [Output("comment")]
        public Output<string?> Comment { get; private set; } = null!;

        /// <summary>
        /// (Default: `AUTO`) If specified, the JSON payload is compressed when sent from Snowflake to the proxy service, and when sent back from the proxy service to Snowflake.
        /// </summary>
        [Output("compression")]
        public Output<string?> Compression { get; private set; } = null!;

        /// <summary>
        /// Binds Snowflake context function results to HTTP headers.
        /// </summary>
        [Output("contextHeaders")]
        public Output<ImmutableArray<string>> ContextHeaders { get; private set; } = null!;

        /// <summary>
        /// Date and time when the external function was created.
        /// </summary>
        [Output("createdOn")]
        public Output<string> CreatedOn { get; private set; } = null!;

        /// <summary>
        /// The database in which to create the external function.
        /// </summary>
        [Output("database")]
        public Output<string> Database { get; private set; } = null!;

        /// <summary>
        /// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        /// </summary>
        [Output("fullyQualifiedName")]
        public Output<string> FullyQualifiedName { get; private set; } = null!;

        /// <summary>
        /// Allows users to specify key-value metadata that is sent with every request as HTTP headers.
        /// </summary>
        [Output("headers")]
        public Output<ImmutableArray<Outputs.ExternalFunctionHeader>> Headers { get; private set; } = null!;

        /// <summary>
        /// This specifies the maximum number of rows in each batch sent to the proxy service.
        /// </summary>
        [Output("maxBatchRows")]
        public Output<int?> MaxBatchRows { get; private set; } = null!;

        /// <summary>
        /// Specifies the identifier for the external function. The identifier can contain the schema name and database name, as well as the function name. The function's signature (name and argument data types) must be unique within the schema.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// (Default: `CALLED ON NULL INPUT`) Specifies the behavior of the external function when called with null inputs.
        /// </summary>
        [Output("nullInputBehavior")]
        public Output<string?> NullInputBehavior { get; private set; } = null!;

        /// <summary>
        /// This specifies the name of the request translator function
        /// </summary>
        [Output("requestTranslator")]
        public Output<string?> RequestTranslator { get; private set; } = null!;

        /// <summary>
        /// This specifies the name of the response translator function.
        /// </summary>
        [Output("responseTranslator")]
        public Output<string?> ResponseTranslator { get; private set; } = null!;

        /// <summary>
        /// Specifies the behavior of the function when returning results
        /// </summary>
        [Output("returnBehavior")]
        public Output<string> ReturnBehavior { get; private set; } = null!;

        /// <summary>
        /// (Default: `true`) Indicates whether the function can return NULL values (true) or must return only NON-NULL values (false).
        /// </summary>
        [Output("returnNullAllowed")]
        public Output<bool?> ReturnNullAllowed { get; private set; } = null!;

        /// <summary>
        /// Specifies the data type returned by the external function.
        /// </summary>
        [Output("returnType")]
        public Output<string> ReturnType { get; private set; } = null!;

        /// <summary>
        /// The schema in which to create the external function.
        /// </summary>
        [Output("schema")]
        public Output<string> Schema { get; private set; } = null!;

        /// <summary>
        /// This is the invocation URL of the proxy service and resource through which Snowflake calls the remote service.
        /// </summary>
        [Output("urlOfProxyAndResource")]
        public Output<string> UrlOfProxyAndResource { get; private set; } = null!;


        /// <summary>
        /// Create a ExternalFunction resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ExternalFunction(string name, ExternalFunctionArgs args, CustomResourceOptions? options = null)
            : base("snowflake:index/externalFunction:ExternalFunction", name, args ?? new ExternalFunctionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ExternalFunction(string name, Input<string> id, ExternalFunctionState? state = null, CustomResourceOptions? options = null)
            : base("snowflake:index/externalFunction:ExternalFunction", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ExternalFunction resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ExternalFunction Get(string name, Input<string> id, ExternalFunctionState? state = null, CustomResourceOptions? options = null)
        {
            return new ExternalFunction(name, id, state, options);
        }
    }

    public sealed class ExternalFunctionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the API integration object that should be used to authenticate the call to the proxy service.
        /// </summary>
        [Input("apiIntegration", required: true)]
        public Input<string> ApiIntegration { get; set; } = null!;

        [Input("args")]
        private InputList<Inputs.ExternalFunctionArgArgs>? _args;

        /// <summary>
        /// Specifies the arguments/inputs for the external function. These should correspond to the arguments that the remote service expects.
        /// </summary>
        public InputList<Inputs.ExternalFunctionArgArgs> Args
        {
            get => _args ?? (_args = new InputList<Inputs.ExternalFunctionArgArgs>());
            set => _args = value;
        }

        /// <summary>
        /// (Default: `user-defined function`) A description of the external function.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// (Default: `AUTO`) If specified, the JSON payload is compressed when sent from Snowflake to the proxy service, and when sent back from the proxy service to Snowflake.
        /// </summary>
        [Input("compression")]
        public Input<string>? Compression { get; set; }

        [Input("contextHeaders")]
        private InputList<string>? _contextHeaders;

        /// <summary>
        /// Binds Snowflake context function results to HTTP headers.
        /// </summary>
        public InputList<string> ContextHeaders
        {
            get => _contextHeaders ?? (_contextHeaders = new InputList<string>());
            set => _contextHeaders = value;
        }

        /// <summary>
        /// The database in which to create the external function.
        /// </summary>
        [Input("database", required: true)]
        public Input<string> Database { get; set; } = null!;

        [Input("headers")]
        private InputList<Inputs.ExternalFunctionHeaderArgs>? _headers;

        /// <summary>
        /// Allows users to specify key-value metadata that is sent with every request as HTTP headers.
        /// </summary>
        public InputList<Inputs.ExternalFunctionHeaderArgs> Headers
        {
            get => _headers ?? (_headers = new InputList<Inputs.ExternalFunctionHeaderArgs>());
            set => _headers = value;
        }

        /// <summary>
        /// This specifies the maximum number of rows in each batch sent to the proxy service.
        /// </summary>
        [Input("maxBatchRows")]
        public Input<int>? MaxBatchRows { get; set; }

        /// <summary>
        /// Specifies the identifier for the external function. The identifier can contain the schema name and database name, as well as the function name. The function's signature (name and argument data types) must be unique within the schema.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// (Default: `CALLED ON NULL INPUT`) Specifies the behavior of the external function when called with null inputs.
        /// </summary>
        [Input("nullInputBehavior")]
        public Input<string>? NullInputBehavior { get; set; }

        /// <summary>
        /// This specifies the name of the request translator function
        /// </summary>
        [Input("requestTranslator")]
        public Input<string>? RequestTranslator { get; set; }

        /// <summary>
        /// This specifies the name of the response translator function.
        /// </summary>
        [Input("responseTranslator")]
        public Input<string>? ResponseTranslator { get; set; }

        /// <summary>
        /// Specifies the behavior of the function when returning results
        /// </summary>
        [Input("returnBehavior", required: true)]
        public Input<string> ReturnBehavior { get; set; } = null!;

        /// <summary>
        /// (Default: `true`) Indicates whether the function can return NULL values (true) or must return only NON-NULL values (false).
        /// </summary>
        [Input("returnNullAllowed")]
        public Input<bool>? ReturnNullAllowed { get; set; }

        /// <summary>
        /// Specifies the data type returned by the external function.
        /// </summary>
        [Input("returnType", required: true)]
        public Input<string> ReturnType { get; set; } = null!;

        /// <summary>
        /// The schema in which to create the external function.
        /// </summary>
        [Input("schema", required: true)]
        public Input<string> Schema { get; set; } = null!;

        /// <summary>
        /// This is the invocation URL of the proxy service and resource through which Snowflake calls the remote service.
        /// </summary>
        [Input("urlOfProxyAndResource", required: true)]
        public Input<string> UrlOfProxyAndResource { get; set; } = null!;

        public ExternalFunctionArgs()
        {
        }
        public static new ExternalFunctionArgs Empty => new ExternalFunctionArgs();
    }

    public sealed class ExternalFunctionState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the API integration object that should be used to authenticate the call to the proxy service.
        /// </summary>
        [Input("apiIntegration")]
        public Input<string>? ApiIntegration { get; set; }

        [Input("args")]
        private InputList<Inputs.ExternalFunctionArgGetArgs>? _args;

        /// <summary>
        /// Specifies the arguments/inputs for the external function. These should correspond to the arguments that the remote service expects.
        /// </summary>
        public InputList<Inputs.ExternalFunctionArgGetArgs> Args
        {
            get => _args ?? (_args = new InputList<Inputs.ExternalFunctionArgGetArgs>());
            set => _args = value;
        }

        /// <summary>
        /// (Default: `user-defined function`) A description of the external function.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// (Default: `AUTO`) If specified, the JSON payload is compressed when sent from Snowflake to the proxy service, and when sent back from the proxy service to Snowflake.
        /// </summary>
        [Input("compression")]
        public Input<string>? Compression { get; set; }

        [Input("contextHeaders")]
        private InputList<string>? _contextHeaders;

        /// <summary>
        /// Binds Snowflake context function results to HTTP headers.
        /// </summary>
        public InputList<string> ContextHeaders
        {
            get => _contextHeaders ?? (_contextHeaders = new InputList<string>());
            set => _contextHeaders = value;
        }

        /// <summary>
        /// Date and time when the external function was created.
        /// </summary>
        [Input("createdOn")]
        public Input<string>? CreatedOn { get; set; }

        /// <summary>
        /// The database in which to create the external function.
        /// </summary>
        [Input("database")]
        public Input<string>? Database { get; set; }

        /// <summary>
        /// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        /// </summary>
        [Input("fullyQualifiedName")]
        public Input<string>? FullyQualifiedName { get; set; }

        [Input("headers")]
        private InputList<Inputs.ExternalFunctionHeaderGetArgs>? _headers;

        /// <summary>
        /// Allows users to specify key-value metadata that is sent with every request as HTTP headers.
        /// </summary>
        public InputList<Inputs.ExternalFunctionHeaderGetArgs> Headers
        {
            get => _headers ?? (_headers = new InputList<Inputs.ExternalFunctionHeaderGetArgs>());
            set => _headers = value;
        }

        /// <summary>
        /// This specifies the maximum number of rows in each batch sent to the proxy service.
        /// </summary>
        [Input("maxBatchRows")]
        public Input<int>? MaxBatchRows { get; set; }

        /// <summary>
        /// Specifies the identifier for the external function. The identifier can contain the schema name and database name, as well as the function name. The function's signature (name and argument data types) must be unique within the schema.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// (Default: `CALLED ON NULL INPUT`) Specifies the behavior of the external function when called with null inputs.
        /// </summary>
        [Input("nullInputBehavior")]
        public Input<string>? NullInputBehavior { get; set; }

        /// <summary>
        /// This specifies the name of the request translator function
        /// </summary>
        [Input("requestTranslator")]
        public Input<string>? RequestTranslator { get; set; }

        /// <summary>
        /// This specifies the name of the response translator function.
        /// </summary>
        [Input("responseTranslator")]
        public Input<string>? ResponseTranslator { get; set; }

        /// <summary>
        /// Specifies the behavior of the function when returning results
        /// </summary>
        [Input("returnBehavior")]
        public Input<string>? ReturnBehavior { get; set; }

        /// <summary>
        /// (Default: `true`) Indicates whether the function can return NULL values (true) or must return only NON-NULL values (false).
        /// </summary>
        [Input("returnNullAllowed")]
        public Input<bool>? ReturnNullAllowed { get; set; }

        /// <summary>
        /// Specifies the data type returned by the external function.
        /// </summary>
        [Input("returnType")]
        public Input<string>? ReturnType { get; set; }

        /// <summary>
        /// The schema in which to create the external function.
        /// </summary>
        [Input("schema")]
        public Input<string>? Schema { get; set; }

        /// <summary>
        /// This is the invocation URL of the proxy service and resource through which Snowflake calls the remote service.
        /// </summary>
        [Input("urlOfProxyAndResource")]
        public Input<string>? UrlOfProxyAndResource { get; set; }

        public ExternalFunctionState()
        {
        }
        public static new ExternalFunctionState Empty => new ExternalFunctionState();
    }
}
