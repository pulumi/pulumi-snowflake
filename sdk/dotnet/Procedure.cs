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
    /// ## Example Usage
    /// 
    /// ## Import
    /// 
    /// format is database name | schema name | stored procedure name | &lt;list of arg types, separated with '-'&gt;
    /// 
    /// ```sh
    /// $ pulumi import snowflake:index/procedure:Procedure example 'dbName|schemaName|procedureName|varchar-varchar-varchar'
    /// ```
    /// </summary>
    [SnowflakeResourceType("snowflake:index/procedure:Procedure")]
    public partial class Procedure : global::Pulumi.CustomResource
    {
        /// <summary>
        /// List of the arguments for the procedure
        /// </summary>
        [Output("arguments")]
        public Output<ImmutableArray<Outputs.ProcedureArgument>> Arguments { get; private set; } = null!;

        /// <summary>
        /// Specifies a comment for the procedure.
        /// </summary>
        [Output("comment")]
        public Output<string?> Comment { get; private set; } = null!;

        /// <summary>
        /// The database in which to create the procedure. Don't use the | character.
        /// </summary>
        [Output("database")]
        public Output<string> Database { get; private set; } = null!;

        /// <summary>
        /// Sets execute context - see caller's rights and owner's rights
        /// </summary>
        [Output("executeAs")]
        public Output<string?> ExecuteAs { get; private set; } = null!;

        /// <summary>
        /// The handler method for Java / Python procedures.
        /// </summary>
        [Output("handler")]
        public Output<string?> Handler { get; private set; } = null!;

        /// <summary>
        /// Imports for Java / Python procedures. For Java this a list of jar files, for Python this is a list of Python files.
        /// </summary>
        [Output("imports")]
        public Output<ImmutableArray<string>> Imports { get; private set; } = null!;

        /// <summary>
        /// Specifies the language of the stored procedure code.
        /// </summary>
        [Output("language")]
        public Output<string?> Language { get; private set; } = null!;

        /// <summary>
        /// The argument name
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Specifies the behavior of the procedure when called with null inputs.
        /// </summary>
        [Output("nullInputBehavior")]
        public Output<string?> NullInputBehavior { get; private set; } = null!;

        /// <summary>
        /// List of package imports to use for Java / Python procedures. For Java, package imports should be of the form: package*name:version*number, where package*name is snowflake*domain:package. For Python use it should be: ('numpy','pandas','xgboost==1.5.0').
        /// </summary>
        [Output("packages")]
        public Output<ImmutableArray<string>> Packages { get; private set; } = null!;

        /// <summary>
        /// Specifies the behavior of the function when returning results
        /// </summary>
        [Output("returnBehavior")]
        public Output<string?> ReturnBehavior { get; private set; } = null!;

        /// <summary>
        /// The return type of the procedure
        /// </summary>
        [Output("returnType")]
        public Output<string> ReturnType { get; private set; } = null!;

        /// <summary>
        /// Required for Python procedures. Specifies Python runtime version.
        /// </summary>
        [Output("runtimeVersion")]
        public Output<string?> RuntimeVersion { get; private set; } = null!;

        /// <summary>
        /// The schema in which to create the procedure. Don't use the | character.
        /// </summary>
        [Output("schema")]
        public Output<string> Schema { get; private set; } = null!;

        /// <summary>
        /// Specifies that the procedure is secure. For more information about secure procedures, see Protecting Sensitive Information with Secure UDFs and Stored Procedures.
        /// </summary>
        [Output("secure")]
        public Output<bool?> Secure { get; private set; } = null!;

        /// <summary>
        /// Specifies the code used to create the procedure.
        /// </summary>
        [Output("statement")]
        public Output<string> Statement { get; private set; } = null!;


        /// <summary>
        /// Create a Procedure resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Procedure(string name, ProcedureArgs args, CustomResourceOptions? options = null)
            : base("snowflake:index/procedure:Procedure", name, args ?? new ProcedureArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Procedure(string name, Input<string> id, ProcedureState? state = null, CustomResourceOptions? options = null)
            : base("snowflake:index/procedure:Procedure", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Procedure resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Procedure Get(string name, Input<string> id, ProcedureState? state = null, CustomResourceOptions? options = null)
        {
            return new Procedure(name, id, state, options);
        }
    }

    public sealed class ProcedureArgs : global::Pulumi.ResourceArgs
    {
        [Input("arguments")]
        private InputList<Inputs.ProcedureArgumentArgs>? _arguments;

        /// <summary>
        /// List of the arguments for the procedure
        /// </summary>
        public InputList<Inputs.ProcedureArgumentArgs> Arguments
        {
            get => _arguments ?? (_arguments = new InputList<Inputs.ProcedureArgumentArgs>());
            set => _arguments = value;
        }

        /// <summary>
        /// Specifies a comment for the procedure.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// The database in which to create the procedure. Don't use the | character.
        /// </summary>
        [Input("database", required: true)]
        public Input<string> Database { get; set; } = null!;

        /// <summary>
        /// Sets execute context - see caller's rights and owner's rights
        /// </summary>
        [Input("executeAs")]
        public Input<string>? ExecuteAs { get; set; }

        /// <summary>
        /// The handler method for Java / Python procedures.
        /// </summary>
        [Input("handler")]
        public Input<string>? Handler { get; set; }

        [Input("imports")]
        private InputList<string>? _imports;

        /// <summary>
        /// Imports for Java / Python procedures. For Java this a list of jar files, for Python this is a list of Python files.
        /// </summary>
        public InputList<string> Imports
        {
            get => _imports ?? (_imports = new InputList<string>());
            set => _imports = value;
        }

        /// <summary>
        /// Specifies the language of the stored procedure code.
        /// </summary>
        [Input("language")]
        public Input<string>? Language { get; set; }

        /// <summary>
        /// The argument name
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Specifies the behavior of the procedure when called with null inputs.
        /// </summary>
        [Input("nullInputBehavior")]
        public Input<string>? NullInputBehavior { get; set; }

        [Input("packages")]
        private InputList<string>? _packages;

        /// <summary>
        /// List of package imports to use for Java / Python procedures. For Java, package imports should be of the form: package*name:version*number, where package*name is snowflake*domain:package. For Python use it should be: ('numpy','pandas','xgboost==1.5.0').
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
        /// The return type of the procedure
        /// </summary>
        [Input("returnType", required: true)]
        public Input<string> ReturnType { get; set; } = null!;

        /// <summary>
        /// Required for Python procedures. Specifies Python runtime version.
        /// </summary>
        [Input("runtimeVersion")]
        public Input<string>? RuntimeVersion { get; set; }

        /// <summary>
        /// The schema in which to create the procedure. Don't use the | character.
        /// </summary>
        [Input("schema", required: true)]
        public Input<string> Schema { get; set; } = null!;

        /// <summary>
        /// Specifies that the procedure is secure. For more information about secure procedures, see Protecting Sensitive Information with Secure UDFs and Stored Procedures.
        /// </summary>
        [Input("secure")]
        public Input<bool>? Secure { get; set; }

        /// <summary>
        /// Specifies the code used to create the procedure.
        /// </summary>
        [Input("statement", required: true)]
        public Input<string> Statement { get; set; } = null!;

        public ProcedureArgs()
        {
        }
        public static new ProcedureArgs Empty => new ProcedureArgs();
    }

    public sealed class ProcedureState : global::Pulumi.ResourceArgs
    {
        [Input("arguments")]
        private InputList<Inputs.ProcedureArgumentGetArgs>? _arguments;

        /// <summary>
        /// List of the arguments for the procedure
        /// </summary>
        public InputList<Inputs.ProcedureArgumentGetArgs> Arguments
        {
            get => _arguments ?? (_arguments = new InputList<Inputs.ProcedureArgumentGetArgs>());
            set => _arguments = value;
        }

        /// <summary>
        /// Specifies a comment for the procedure.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// The database in which to create the procedure. Don't use the | character.
        /// </summary>
        [Input("database")]
        public Input<string>? Database { get; set; }

        /// <summary>
        /// Sets execute context - see caller's rights and owner's rights
        /// </summary>
        [Input("executeAs")]
        public Input<string>? ExecuteAs { get; set; }

        /// <summary>
        /// The handler method for Java / Python procedures.
        /// </summary>
        [Input("handler")]
        public Input<string>? Handler { get; set; }

        [Input("imports")]
        private InputList<string>? _imports;

        /// <summary>
        /// Imports for Java / Python procedures. For Java this a list of jar files, for Python this is a list of Python files.
        /// </summary>
        public InputList<string> Imports
        {
            get => _imports ?? (_imports = new InputList<string>());
            set => _imports = value;
        }

        /// <summary>
        /// Specifies the language of the stored procedure code.
        /// </summary>
        [Input("language")]
        public Input<string>? Language { get; set; }

        /// <summary>
        /// The argument name
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Specifies the behavior of the procedure when called with null inputs.
        /// </summary>
        [Input("nullInputBehavior")]
        public Input<string>? NullInputBehavior { get; set; }

        [Input("packages")]
        private InputList<string>? _packages;

        /// <summary>
        /// List of package imports to use for Java / Python procedures. For Java, package imports should be of the form: package*name:version*number, where package*name is snowflake*domain:package. For Python use it should be: ('numpy','pandas','xgboost==1.5.0').
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
        /// The return type of the procedure
        /// </summary>
        [Input("returnType")]
        public Input<string>? ReturnType { get; set; }

        /// <summary>
        /// Required for Python procedures. Specifies Python runtime version.
        /// </summary>
        [Input("runtimeVersion")]
        public Input<string>? RuntimeVersion { get; set; }

        /// <summary>
        /// The schema in which to create the procedure. Don't use the | character.
        /// </summary>
        [Input("schema")]
        public Input<string>? Schema { get; set; }

        /// <summary>
        /// Specifies that the procedure is secure. For more information about secure procedures, see Protecting Sensitive Information with Secure UDFs and Stored Procedures.
        /// </summary>
        [Input("secure")]
        public Input<bool>? Secure { get; set; }

        /// <summary>
        /// Specifies the code used to create the procedure.
        /// </summary>
        [Input("statement")]
        public Input<string>? Statement { get; set; }

        public ProcedureState()
        {
        }
        public static new ProcedureState Empty => new ProcedureState();
    }
}
