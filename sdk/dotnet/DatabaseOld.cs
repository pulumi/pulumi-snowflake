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
    /// $ pulumi import snowflake:index/databaseOld:DatabaseOld example 'database_name'
    /// ```
    /// </summary>
    [SnowflakeResourceType("snowflake:index/databaseOld:DatabaseOld")]
    public partial class DatabaseOld : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Specifies a comment for the database.
        /// </summary>
        [Output("comment")]
        public Output<string?> Comment { get; private set; } = null!;

        /// <summary>
        /// Number of days for which Snowflake retains historical data for performing Time Travel actions (SELECT, CLONE, UNDROP) on the object. A value of 0 effectively disables Time Travel for the specified database. Default value for this field is set to -1, which is a fallback to use Snowflake default. For more information, see [Understanding &amp; Using Time Travel](https://docs.snowflake.com/en/user-guide/data-time-travel).
        /// </summary>
        [Output("dataRetentionTimeInDays")]
        public Output<int?> DataRetentionTimeInDays { get; private set; } = null!;

        /// <summary>
        /// Specify a database to create a clone from.
        /// </summary>
        [Output("fromDatabase")]
        public Output<string?> FromDatabase { get; private set; } = null!;

        /// <summary>
        /// Specify a fully-qualified path to a database to create a replica from. A fully qualified path follows the format of `"&lt;organization_name&gt;"."&lt;account_name&gt;"."&lt;db_name&gt;"`. An example would be: `"myorg1"."account1"."db1"`
        /// </summary>
        [Output("fromReplica")]
        public Output<string?> FromReplica { get; private set; } = null!;

        /// <summary>
        /// Specify a provider and a share in this map to create a database from a share. As of version 0.87.0, the provider field is the account locator.
        /// </summary>
        [Output("fromShare")]
        public Output<ImmutableDictionary<string, string>?> FromShare { get; private set; } = null!;

        /// <summary>
        /// Specifies a database as transient. Transient databases do not have a Fail-safe period so they do not incur additional storage costs once they leave Time Travel; however, this means they are also not protected by Fail-safe in the event of a data loss.
        /// </summary>
        [Output("isTransient")]
        public Output<bool?> IsTransient { get; private set; } = null!;

        /// <summary>
        /// Specifies the identifier for the database; must be unique for your account.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// When set, specifies the configurations for database replication.
        /// </summary>
        [Output("replicationConfiguration")]
        public Output<Outputs.DatabaseOldReplicationConfiguration?> ReplicationConfiguration { get; private set; } = null!;


        /// <summary>
        /// Create a DatabaseOld resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DatabaseOld(string name, DatabaseOldArgs? args = null, CustomResourceOptions? options = null)
            : base("snowflake:index/databaseOld:DatabaseOld", name, args ?? new DatabaseOldArgs(), MakeResourceOptions(options, ""))
        {
        }

        private DatabaseOld(string name, Input<string> id, DatabaseOldState? state = null, CustomResourceOptions? options = null)
            : base("snowflake:index/databaseOld:DatabaseOld", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing DatabaseOld resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DatabaseOld Get(string name, Input<string> id, DatabaseOldState? state = null, CustomResourceOptions? options = null)
        {
            return new DatabaseOld(name, id, state, options);
        }
    }

    public sealed class DatabaseOldArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies a comment for the database.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// Number of days for which Snowflake retains historical data for performing Time Travel actions (SELECT, CLONE, UNDROP) on the object. A value of 0 effectively disables Time Travel for the specified database. Default value for this field is set to -1, which is a fallback to use Snowflake default. For more information, see [Understanding &amp; Using Time Travel](https://docs.snowflake.com/en/user-guide/data-time-travel).
        /// </summary>
        [Input("dataRetentionTimeInDays")]
        public Input<int>? DataRetentionTimeInDays { get; set; }

        /// <summary>
        /// Specify a database to create a clone from.
        /// </summary>
        [Input("fromDatabase")]
        public Input<string>? FromDatabase { get; set; }

        /// <summary>
        /// Specify a fully-qualified path to a database to create a replica from. A fully qualified path follows the format of `"&lt;organization_name&gt;"."&lt;account_name&gt;"."&lt;db_name&gt;"`. An example would be: `"myorg1"."account1"."db1"`
        /// </summary>
        [Input("fromReplica")]
        public Input<string>? FromReplica { get; set; }

        [Input("fromShare")]
        private InputMap<string>? _fromShare;

        /// <summary>
        /// Specify a provider and a share in this map to create a database from a share. As of version 0.87.0, the provider field is the account locator.
        /// </summary>
        public InputMap<string> FromShare
        {
            get => _fromShare ?? (_fromShare = new InputMap<string>());
            set => _fromShare = value;
        }

        /// <summary>
        /// Specifies a database as transient. Transient databases do not have a Fail-safe period so they do not incur additional storage costs once they leave Time Travel; however, this means they are also not protected by Fail-safe in the event of a data loss.
        /// </summary>
        [Input("isTransient")]
        public Input<bool>? IsTransient { get; set; }

        /// <summary>
        /// Specifies the identifier for the database; must be unique for your account.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// When set, specifies the configurations for database replication.
        /// </summary>
        [Input("replicationConfiguration")]
        public Input<Inputs.DatabaseOldReplicationConfigurationArgs>? ReplicationConfiguration { get; set; }

        public DatabaseOldArgs()
        {
        }
        public static new DatabaseOldArgs Empty => new DatabaseOldArgs();
    }

    public sealed class DatabaseOldState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies a comment for the database.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// Number of days for which Snowflake retains historical data for performing Time Travel actions (SELECT, CLONE, UNDROP) on the object. A value of 0 effectively disables Time Travel for the specified database. Default value for this field is set to -1, which is a fallback to use Snowflake default. For more information, see [Understanding &amp; Using Time Travel](https://docs.snowflake.com/en/user-guide/data-time-travel).
        /// </summary>
        [Input("dataRetentionTimeInDays")]
        public Input<int>? DataRetentionTimeInDays { get; set; }

        /// <summary>
        /// Specify a database to create a clone from.
        /// </summary>
        [Input("fromDatabase")]
        public Input<string>? FromDatabase { get; set; }

        /// <summary>
        /// Specify a fully-qualified path to a database to create a replica from. A fully qualified path follows the format of `"&lt;organization_name&gt;"."&lt;account_name&gt;"."&lt;db_name&gt;"`. An example would be: `"myorg1"."account1"."db1"`
        /// </summary>
        [Input("fromReplica")]
        public Input<string>? FromReplica { get; set; }

        [Input("fromShare")]
        private InputMap<string>? _fromShare;

        /// <summary>
        /// Specify a provider and a share in this map to create a database from a share. As of version 0.87.0, the provider field is the account locator.
        /// </summary>
        public InputMap<string> FromShare
        {
            get => _fromShare ?? (_fromShare = new InputMap<string>());
            set => _fromShare = value;
        }

        /// <summary>
        /// Specifies a database as transient. Transient databases do not have a Fail-safe period so they do not incur additional storage costs once they leave Time Travel; however, this means they are also not protected by Fail-safe in the event of a data loss.
        /// </summary>
        [Input("isTransient")]
        public Input<bool>? IsTransient { get; set; }

        /// <summary>
        /// Specifies the identifier for the database; must be unique for your account.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// When set, specifies the configurations for database replication.
        /// </summary>
        [Input("replicationConfiguration")]
        public Input<Inputs.DatabaseOldReplicationConfigurationGetArgs>? ReplicationConfiguration { get; set; }

        public DatabaseOldState()
        {
        }
        public static new DatabaseOldState Empty => new DatabaseOldState();
    }
}
