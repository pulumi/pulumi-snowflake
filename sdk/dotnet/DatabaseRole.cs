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
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Snowflake = Pulumi.Snowflake;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var dbRole = new Snowflake.DatabaseRole("dbRole", new()
    ///     {
    ///         Comment = "my db role",
    ///         Database = "database",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ```sh
    ///  $ pulumi import snowflake:index/databaseRole:DatabaseRole example 'dbName|roleName'
    /// ```
    /// </summary>
    [SnowflakeResourceType("snowflake:index/databaseRole:DatabaseRole")]
    public partial class DatabaseRole : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Specifies a comment for the database role.
        /// </summary>
        [Output("comment")]
        public Output<string?> Comment { get; private set; } = null!;

        /// <summary>
        /// The database in which to create the database role.
        /// </summary>
        [Output("database")]
        public Output<string> Database { get; private set; } = null!;

        /// <summary>
        /// Specifies the identifier for the database role.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;


        /// <summary>
        /// Create a DatabaseRole resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DatabaseRole(string name, DatabaseRoleArgs args, CustomResourceOptions? options = null)
            : base("snowflake:index/databaseRole:DatabaseRole", name, args ?? new DatabaseRoleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private DatabaseRole(string name, Input<string> id, DatabaseRoleState? state = null, CustomResourceOptions? options = null)
            : base("snowflake:index/databaseRole:DatabaseRole", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing DatabaseRole resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DatabaseRole Get(string name, Input<string> id, DatabaseRoleState? state = null, CustomResourceOptions? options = null)
        {
            return new DatabaseRole(name, id, state, options);
        }
    }

    public sealed class DatabaseRoleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies a comment for the database role.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// The database in which to create the database role.
        /// </summary>
        [Input("database", required: true)]
        public Input<string> Database { get; set; } = null!;

        /// <summary>
        /// Specifies the identifier for the database role.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public DatabaseRoleArgs()
        {
        }
        public static new DatabaseRoleArgs Empty => new DatabaseRoleArgs();
    }

    public sealed class DatabaseRoleState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies a comment for the database role.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// The database in which to create the database role.
        /// </summary>
        [Input("database")]
        public Input<string>? Database { get; set; }

        /// <summary>
        /// Specifies the identifier for the database role.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public DatabaseRoleState()
        {
        }
        public static new DatabaseRoleState Empty => new DatabaseRoleState();
    }
}
