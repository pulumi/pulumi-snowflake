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
    /// format is database name | schema name | function name | &lt;list of arg types, separated with '-'&gt;
    /// 
    /// ```sh
    ///  $ pulumi import snowflake:index/function:Function example 'dbName|schemaName|functionName|varchar-varchar-varchar'
    /// ```
    /// </summary>
    [SnowflakeResourceType("snowflake:index/function:Function")]
    public partial class Function : global::Pulumi.CustomResource
    {
        /// <summary>
        /// List of the arguments for the function
        /// </summary>
        [Output("arguments")]
        public Output<ImmutableArray<Outputs.FunctionArgument>> Arguments { get; private set; } = null!;

        /// <summary>
        /// Specifies a comment for the function.
        /// </summary>
        [Output("comment")]
        public Output<string?> Comment { get; private set; } = null!;

        /// <summary>
        /// The database in which to create the function. Don't use the | character.
        /// </summary>
        [Output("database")]
        public Output<string> Database { get; private set; } = null!;

        /// <summary>
        /// The handler method for Java / Python function.
        /// </summary>
        [Output("handler")]
        public Output<string?> Handler { get; private set; } = null!;

        /// <summary>
        /// Imports for Java / Python functions. For Java this a list of jar files, for Python this is a list of Python files.
        /// </summary>
        [Output("imports")]
        public Output<ImmutableArray<string>> Imports { get; private set; } = null!;

        /// <summary>
        /// The language of the statement
        /// </summary>
        [Output("language")]
        public Output<string?> Language { get; private set; } = null!;

        /// <summary>
        /// Specifies the identifier for the function; does not have to be unique for the schema in which the function is created. Don't use the | character.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Specifies the behavior of the function when called with null inputs.
        /// </summary>
        [Output("nullInputBehavior")]
        public Output<string?> NullInputBehavior { get; private set; } = null!;

        /// <summary>
        /// List of package imports to use for Java / Python functions. For Java, package imports should be of the form: package*name:version*number, where package*name is snowflake*domain:package. For Python use it should be: ('numpy','pandas','xgboost==1.5.0').
        /// </summary>
        [Output("packages")]
        public Output<ImmutableArray<string>> Packages { get; private set; } = null!;

        /// <summary>
        /// Specifies the behavior of the function when returning results
        /// </summary>
        [Output("returnBehavior")]
        public Output<string?> ReturnBehavior { get; private set; } = null!;

        /// <summary>
        /// The return type of the function
        /// </summary>
        [Output("returnType")]
        public Output<string> ReturnType { get; private set; } = null!;

        /// <summary>
        /// Required for Python functions. Specifies Python runtime version.
        /// </summary>
        [Output("runtimeVersion")]
        public Output<string?> RuntimeVersion { get; private set; } = null!;

        /// <summary>
        /// The schema in which to create the function. Don't use the | character.
        /// </summary>
        [Output("schema")]
        public Output<string> Schema { get; private set; } = null!;

        /// <summary>
        /// Specifies the javascript / java / sql / python code used to create the function.
        /// </summary>
        [Output("statement")]
        public Output<string> Statement { get; private set; } = null!;

        /// <summary>
        /// The target path for the Java / Python functions. For Java, it is the path of compiled jar files and for the Python it is the path of the Python files.
        /// </summary>
        [Output("targetPath")]
        public Output<string?> TargetPath { get; private set; } = null!;


        /// <summary>
        /// Create a Function resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Function(string name, FunctionArgs args, CustomResourceOptions? options = null)
            : base("snowflake:index/function:Function", name, args ?? new FunctionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Function(string name, Input<string> id, FunctionState? state = null, CustomResourceOptions? options = null)
            : base("snowflake:index/function:Function", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Function resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Function Get(string name, Input<string> id, FunctionState? state = null, CustomResourceOptions? options = null)
        {
            return new Function(name, id, state, options);
        }
    }

    public sealed class FunctionArgs : global::Pulumi.ResourceArgs
    {
        [Input("arguments")]
        private InputList<Inputs.FunctionArgumentArgs>? _arguments;

        /// <summary>
        /// List of the arguments for the function
        /// </summary>
        public InputList<Inputs.FunctionArgumentArgs> Arguments
        {
            get => _arguments ?? (_arguments = new InputList<Inputs.FunctionArgumentArgs>());
            set => _arguments = value;
        }

        /// <summary>
        /// Specifies a comment for the function.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// The database in which to create the function. Don't use the | character.
        /// </summary>
        [Input("database", required: true)]
        public Input<string> Database { get; set; } = null!;

        /// <summary>
        /// The handler method for Java / Python function.
        /// </summary>
        [Input("handler")]
        public Input<string>? Handler { get; set; }

        [Input("imports")]
        private InputList<string>? _imports;

        /// <summary>
        /// Imports for Java / Python functions. For Java this a list of jar files, for Python this is a list of Python files.
        /// </summary>
        public InputList<string> Imports
        {
            get => _imports ?? (_imports = new InputList<string>());
            set => _imports = value;
        }

        /// <summary>
        /// The language of the statement
        /// </summary>
        [Input("language")]
        public Input<string>? Language { get; set; }

        /// <summary>
        /// Specifies the identifier for the function; does not have to be unique for the schema in which the function is created. Don't use the | character.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Specifies the behavior of the function when called with null inputs.
        /// </summary>
        [Input("nullInputBehavior")]
        public Input<string>? NullInputBehavior { get; set; }

        [Input("packages")]
        private InputList<string>? _packages;

        /// <summary>
        /// List of package imports to use for Java / Python functions. For Java, package imports should be of the form: package*name:version*number, where package*name is snowflake*domain:package. For Python use it should be: ('numpy','pandas','xgboost==1.5.0').
        /// </summary>
        public InputList<string> Packages
        {
            get => _packages ?? (_packages = new InputList<string>());
            set => _packages = value;
        }

        /// <summary>
        /// Specifies the behavior of the function when returning results
        /// </summary>
        [Input("returnBehavior")]
        public Input<string>? ReturnBehavior { get; set; }

        /// <summary>
        /// The return type of the function
        /// </summary>
        [Input("returnType", required: true)]
        public Input<string> ReturnType { get; set; } = null!;

        /// <summary>
        /// Required for Python functions. Specifies Python runtime version.
        /// </summary>
        [Input("runtimeVersion")]
        public Input<string>? RuntimeVersion { get; set; }

        /// <summary>
        /// The schema in which to create the function. Don't use the | character.
        /// </summary>
        [Input("schema", required: true)]
        public Input<string> Schema { get; set; } = null!;

        /// <summary>
        /// Specifies the javascript / java / sql / python code used to create the function.
        /// </summary>
        [Input("statement", required: true)]
        public Input<string> Statement { get; set; } = null!;

        /// <summary>
        /// The target path for the Java / Python functions. For Java, it is the path of compiled jar files and for the Python it is the path of the Python files.
        /// </summary>
        [Input("targetPath")]
        public Input<string>? TargetPath { get; set; }

        public FunctionArgs()
        {
        }
        public static new FunctionArgs Empty => new FunctionArgs();
    }

    public sealed class FunctionState : global::Pulumi.ResourceArgs
    {
        [Input("arguments")]
        private InputList<Inputs.FunctionArgumentGetArgs>? _arguments;

        /// <summary>
        /// List of the arguments for the function
        /// </summary>
        public InputList<Inputs.FunctionArgumentGetArgs> Arguments
        {
            get => _arguments ?? (_arguments = new InputList<Inputs.FunctionArgumentGetArgs>());
            set => _arguments = value;
        }

        /// <summary>
        /// Specifies a comment for the function.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// The database in which to create the function. Don't use the | character.
        /// </summary>
        [Input("database")]
        public Input<string>? Database { get; set; }

        /// <summary>
        /// The handler method for Java / Python function.
        /// </summary>
        [Input("handler")]
        public Input<string>? Handler { get; set; }

        [Input("imports")]
        private InputList<string>? _imports;

        /// <summary>
        /// Imports for Java / Python functions. For Java this a list of jar files, for Python this is a list of Python files.
        /// </summary>
        public InputList<string> Imports
        {
            get => _imports ?? (_imports = new InputList<string>());
            set => _imports = value;
        }

        /// <summary>
        /// The language of the statement
        /// </summary>
        [Input("language")]
        public Input<string>? Language { get; set; }

        /// <summary>
        /// Specifies the identifier for the function; does not have to be unique for the schema in which the function is created. Don't use the | character.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Specifies the behavior of the function when called with null inputs.
        /// </summary>
        [Input("nullInputBehavior")]
        public Input<string>? NullInputBehavior { get; set; }

        [Input("packages")]
        private InputList<string>? _packages;

        /// <summary>
        /// List of package imports to use for Java / Python functions. For Java, package imports should be of the form: package*name:version*number, where package*name is snowflake*domain:package. For Python use it should be: ('numpy','pandas','xgboost==1.5.0').
        /// </summary>
        public InputList<string> Packages
        {
            get => _packages ?? (_packages = new InputList<string>());
            set => _packages = value;
        }

        /// <summary>
        /// Specifies the behavior of the function when returning results
        /// </summary>
        [Input("returnBehavior")]
        public Input<string>? ReturnBehavior { get; set; }

        /// <summary>
        /// The return type of the function
        /// </summary>
        [Input("returnType")]
        public Input<string>? ReturnType { get; set; }

        /// <summary>
        /// Required for Python functions. Specifies Python runtime version.
        /// </summary>
        [Input("runtimeVersion")]
        public Input<string>? RuntimeVersion { get; set; }

        /// <summary>
        /// The schema in which to create the function. Don't use the | character.
        /// </summary>
        [Input("schema")]
        public Input<string>? Schema { get; set; }

        /// <summary>
        /// Specifies the javascript / java / sql / python code used to create the function.
        /// </summary>
        [Input("statement")]
        public Input<string>? Statement { get; set; }

        /// <summary>
        /// The target path for the Java / Python functions. For Java, it is the path of compiled jar files and for the Python it is the path of the Python files.
        /// </summary>
        [Input("targetPath")]
        public Input<string>? TargetPath { get; set; }

        public FunctionState()
        {
        }
        public static new FunctionState Empty => new FunctionState();
    }
}
