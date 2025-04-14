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
    /// format is database name | schema name | alert name
    /// 
    /// ```sh
    /// $ pulumi import snowflake:index/alert:Alert example 'dbName|schemaName|alertName'
    /// ```
    /// </summary>
    [SnowflakeResourceType("snowflake:index/alert:Alert")]
    public partial class Alert : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The SQL statement that should be executed if the condition returns one or more rows.
        /// </summary>
        [Output("action")]
        public Output<string> Action { get; private set; } = null!;

        /// <summary>
        /// The schedule for periodically running an alert.
        /// </summary>
        [Output("alertSchedule")]
        public Output<Outputs.AlertAlertSchedule?> AlertSchedule { get; private set; } = null!;

        /// <summary>
        /// Specifies a comment for the alert.
        /// </summary>
        [Output("comment")]
        public Output<string?> Comment { get; private set; } = null!;

        /// <summary>
        /// The SQL statement that represents the condition for the alert. (SELECT, SHOW, CALL)
        /// </summary>
        [Output("condition")]
        public Output<string> Condition { get; private set; } = null!;

        /// <summary>
        /// The database in which to create the alert.
        /// </summary>
        [Output("database")]
        public Output<string> Database { get; private set; } = null!;

        /// <summary>
        /// (Default: `false`) Specifies if an alert should be 'started' (enabled) after creation or should remain 'suspended' (default).
        /// </summary>
        [Output("enabled")]
        public Output<bool?> Enabled { get; private set; } = null!;

        /// <summary>
        /// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        /// </summary>
        [Output("fullyQualifiedName")]
        public Output<string> FullyQualifiedName { get; private set; } = null!;

        /// <summary>
        /// Specifies the identifier for the alert; must be unique for the database and schema in which the alert is created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The schema in which to create the alert.
        /// </summary>
        [Output("schema")]
        public Output<string> Schema { get; private set; } = null!;

        /// <summary>
        /// The warehouse the alert will use.
        /// </summary>
        [Output("warehouse")]
        public Output<string> Warehouse { get; private set; } = null!;


        /// <summary>
        /// Create a Alert resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Alert(string name, AlertArgs args, CustomResourceOptions? options = null)
            : base("snowflake:index/alert:Alert", name, args ?? new AlertArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Alert(string name, Input<string> id, AlertState? state = null, CustomResourceOptions? options = null)
            : base("snowflake:index/alert:Alert", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Alert resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Alert Get(string name, Input<string> id, AlertState? state = null, CustomResourceOptions? options = null)
        {
            return new Alert(name, id, state, options);
        }
    }

    public sealed class AlertArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The SQL statement that should be executed if the condition returns one or more rows.
        /// </summary>
        [Input("action", required: true)]
        public Input<string> Action { get; set; } = null!;

        /// <summary>
        /// The schedule for periodically running an alert.
        /// </summary>
        [Input("alertSchedule")]
        public Input<Inputs.AlertAlertScheduleArgs>? AlertSchedule { get; set; }

        /// <summary>
        /// Specifies a comment for the alert.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// The SQL statement that represents the condition for the alert. (SELECT, SHOW, CALL)
        /// </summary>
        [Input("condition", required: true)]
        public Input<string> Condition { get; set; } = null!;

        /// <summary>
        /// The database in which to create the alert.
        /// </summary>
        [Input("database", required: true)]
        public Input<string> Database { get; set; } = null!;

        /// <summary>
        /// (Default: `false`) Specifies if an alert should be 'started' (enabled) after creation or should remain 'suspended' (default).
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Specifies the identifier for the alert; must be unique for the database and schema in which the alert is created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The schema in which to create the alert.
        /// </summary>
        [Input("schema", required: true)]
        public Input<string> Schema { get; set; } = null!;

        /// <summary>
        /// The warehouse the alert will use.
        /// </summary>
        [Input("warehouse", required: true)]
        public Input<string> Warehouse { get; set; } = null!;

        public AlertArgs()
        {
        }
        public static new AlertArgs Empty => new AlertArgs();
    }

    public sealed class AlertState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The SQL statement that should be executed if the condition returns one or more rows.
        /// </summary>
        [Input("action")]
        public Input<string>? Action { get; set; }

        /// <summary>
        /// The schedule for periodically running an alert.
        /// </summary>
        [Input("alertSchedule")]
        public Input<Inputs.AlertAlertScheduleGetArgs>? AlertSchedule { get; set; }

        /// <summary>
        /// Specifies a comment for the alert.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// The SQL statement that represents the condition for the alert. (SELECT, SHOW, CALL)
        /// </summary>
        [Input("condition")]
        public Input<string>? Condition { get; set; }

        /// <summary>
        /// The database in which to create the alert.
        /// </summary>
        [Input("database")]
        public Input<string>? Database { get; set; }

        /// <summary>
        /// (Default: `false`) Specifies if an alert should be 'started' (enabled) after creation or should remain 'suspended' (default).
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        /// </summary>
        [Input("fullyQualifiedName")]
        public Input<string>? FullyQualifiedName { get; set; }

        /// <summary>
        /// Specifies the identifier for the alert; must be unique for the database and schema in which the alert is created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The schema in which to create the alert.
        /// </summary>
        [Input("schema")]
        public Input<string>? Schema { get; set; }

        /// <summary>
        /// The warehouse the alert will use.
        /// </summary>
        [Input("warehouse")]
        public Input<string>? Warehouse { get; set; }

        public AlertState()
        {
        }
        public static new AlertState Empty => new AlertState();
    }
}
