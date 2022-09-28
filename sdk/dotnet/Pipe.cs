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
    /// format is database name | schema name | pipe name
    /// 
    /// ```sh
    ///  $ pulumi import snowflake:index/pipe:Pipe example 'dbName|schemaName|pipeName'
    /// ```
    /// </summary>
    [SnowflakeResourceType("snowflake:index/pipe:Pipe")]
    public partial class Pipe : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Specifies a auto_ingest param for the pipe.
        /// </summary>
        [Output("autoIngest")]
        public Output<bool?> AutoIngest { get; private set; } = null!;

        /// <summary>
        /// Specifies the Amazon Resource Name (ARN) for the SNS topic for your S3 bucket.
        /// </summary>
        [Output("awsSnsTopicArn")]
        public Output<string?> AwsSnsTopicArn { get; private set; } = null!;

        /// <summary>
        /// Specifies a comment for the pipe.
        /// </summary>
        [Output("comment")]
        public Output<string?> Comment { get; private set; } = null!;

        /// <summary>
        /// Specifies the copy statement for the pipe.
        /// </summary>
        [Output("copyStatement")]
        public Output<string> CopyStatement { get; private set; } = null!;

        /// <summary>
        /// The database in which to create the pipe.
        /// </summary>
        [Output("database")]
        public Output<string> Database { get; private set; } = null!;

        /// <summary>
        /// Specifies the name of the notification integration used for error notifications.
        /// </summary>
        [Output("errorIntegration")]
        public Output<string?> ErrorIntegration { get; private set; } = null!;

        /// <summary>
        /// Specifies an integration for the pipe.
        /// </summary>
        [Output("integration")]
        public Output<string?> Integration { get; private set; } = null!;

        /// <summary>
        /// Specifies the identifier for the pipe; must be unique for the database and schema in which the pipe is created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Amazon Resource Name of the Amazon SQS queue for the stage named in the DEFINITION column.
        /// </summary>
        [Output("notificationChannel")]
        public Output<string> NotificationChannel { get; private set; } = null!;

        /// <summary>
        /// Name of the role that owns the pipe.
        /// </summary>
        [Output("owner")]
        public Output<string> Owner { get; private set; } = null!;

        /// <summary>
        /// The schema in which to create the pipe.
        /// </summary>
        [Output("schema")]
        public Output<string> Schema { get; private set; } = null!;


        /// <summary>
        /// Create a Pipe resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Pipe(string name, PipeArgs args, CustomResourceOptions? options = null)
            : base("snowflake:index/pipe:Pipe", name, args ?? new PipeArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Pipe(string name, Input<string> id, PipeState? state = null, CustomResourceOptions? options = null)
            : base("snowflake:index/pipe:Pipe", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Pipe resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Pipe Get(string name, Input<string> id, PipeState? state = null, CustomResourceOptions? options = null)
        {
            return new Pipe(name, id, state, options);
        }
    }

    public sealed class PipeArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies a auto_ingest param for the pipe.
        /// </summary>
        [Input("autoIngest")]
        public Input<bool>? AutoIngest { get; set; }

        /// <summary>
        /// Specifies the Amazon Resource Name (ARN) for the SNS topic for your S3 bucket.
        /// </summary>
        [Input("awsSnsTopicArn")]
        public Input<string>? AwsSnsTopicArn { get; set; }

        /// <summary>
        /// Specifies a comment for the pipe.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// Specifies the copy statement for the pipe.
        /// </summary>
        [Input("copyStatement", required: true)]
        public Input<string> CopyStatement { get; set; } = null!;

        /// <summary>
        /// The database in which to create the pipe.
        /// </summary>
        [Input("database", required: true)]
        public Input<string> Database { get; set; } = null!;

        /// <summary>
        /// Specifies the name of the notification integration used for error notifications.
        /// </summary>
        [Input("errorIntegration")]
        public Input<string>? ErrorIntegration { get; set; }

        /// <summary>
        /// Specifies an integration for the pipe.
        /// </summary>
        [Input("integration")]
        public Input<string>? Integration { get; set; }

        /// <summary>
        /// Specifies the identifier for the pipe; must be unique for the database and schema in which the pipe is created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The schema in which to create the pipe.
        /// </summary>
        [Input("schema", required: true)]
        public Input<string> Schema { get; set; } = null!;

        public PipeArgs()
        {
        }
        public static new PipeArgs Empty => new PipeArgs();
    }

    public sealed class PipeState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies a auto_ingest param for the pipe.
        /// </summary>
        [Input("autoIngest")]
        public Input<bool>? AutoIngest { get; set; }

        /// <summary>
        /// Specifies the Amazon Resource Name (ARN) for the SNS topic for your S3 bucket.
        /// </summary>
        [Input("awsSnsTopicArn")]
        public Input<string>? AwsSnsTopicArn { get; set; }

        /// <summary>
        /// Specifies a comment for the pipe.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// Specifies the copy statement for the pipe.
        /// </summary>
        [Input("copyStatement")]
        public Input<string>? CopyStatement { get; set; }

        /// <summary>
        /// The database in which to create the pipe.
        /// </summary>
        [Input("database")]
        public Input<string>? Database { get; set; }

        /// <summary>
        /// Specifies the name of the notification integration used for error notifications.
        /// </summary>
        [Input("errorIntegration")]
        public Input<string>? ErrorIntegration { get; set; }

        /// <summary>
        /// Specifies an integration for the pipe.
        /// </summary>
        [Input("integration")]
        public Input<string>? Integration { get; set; }

        /// <summary>
        /// Specifies the identifier for the pipe; must be unique for the database and schema in which the pipe is created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Amazon Resource Name of the Amazon SQS queue for the stage named in the DEFINITION column.
        /// </summary>
        [Input("notificationChannel")]
        public Input<string>? NotificationChannel { get; set; }

        /// <summary>
        /// Name of the role that owns the pipe.
        /// </summary>
        [Input("owner")]
        public Input<string>? Owner { get; set; }

        /// <summary>
        /// The schema in which to create the pipe.
        /// </summary>
        [Input("schema")]
        public Input<string>? Schema { get; set; }

        public PipeState()
        {
        }
        public static new PipeState Empty => new PipeState();
    }
}
