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
    ///     var monitor = new Snowflake.ResourceMonitor("monitor", new()
    ///     {
    ///         Name = "monitor",
    ///         CreditQuota = 100,
    ///         Frequency = "DAILY",
    ///         StartTimestamp = "2020-12-07 00:00",
    ///         EndTimestamp = "2021-12-07 00:00",
    ///         NotifyTriggers = new[]
    ///         {
    ///             40,
    ///             50,
    ///         },
    ///         SuspendTriggers = 50,
    ///         SuspendImmediateTriggers = 90,
    ///         NotifyUsers = new[]
    ///         {
    ///             "USERONE",
    ///             "USERTWO",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// format is the resource monitor name
    /// 
    /// ```sh
    /// $ pulumi import snowflake:index/resourceMonitor:ResourceMonitor example 'resourceMonitorName'
    /// ```
    /// </summary>
    [SnowflakeResourceType("snowflake:index/resourceMonitor:ResourceMonitor")]
    public partial class ResourceMonitor : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The number of credits allocated monthly to the resource monitor.
        /// </summary>
        [Output("creditQuota")]
        public Output<int> CreditQuota { get; private set; } = null!;

        /// <summary>
        /// The date and time when the resource monitor suspends the assigned warehouses.
        /// </summary>
        [Output("endTimestamp")]
        public Output<string?> EndTimestamp { get; private set; } = null!;

        /// <summary>
        /// The frequency interval at which the credit usage resets to 0. If you set a frequency for a resource monitor, you must also set START_TIMESTAMP.
        /// </summary>
        [Output("frequency")]
        public Output<string> Frequency { get; private set; } = null!;

        /// <summary>
        /// Identifier for the resource monitor; must be unique for your account.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// A list of percentage thresholds at which to send an alert to subscribed users.
        /// </summary>
        [Output("notifyTriggers")]
        public Output<ImmutableArray<int>> NotifyTriggers { get; private set; } = null!;

        /// <summary>
        /// Specifies the list of users to receive email notifications on resource monitors.
        /// </summary>
        [Output("notifyUsers")]
        public Output<ImmutableArray<string>> NotifyUsers { get; private set; } = null!;

        /// <summary>
        /// Specifies whether the resource monitor should be applied globally to your Snowflake account (defaults to false).
        /// </summary>
        [Output("setForAccount")]
        public Output<bool?> SetForAccount { get; private set; } = null!;

        /// <summary>
        /// The date and time when the resource monitor starts monitoring credit usage for the assigned warehouses.
        /// </summary>
        [Output("startTimestamp")]
        public Output<string> StartTimestamp { get; private set; } = null!;

        /// <summary>
        /// The number that represents the percentage threshold at which to immediately suspend all warehouses.
        /// </summary>
        [Output("suspendImmediateTrigger")]
        public Output<int?> SuspendImmediateTrigger { get; private set; } = null!;

        /// <summary>
        /// A list of percentage thresholds at which to suspend all warehouses.
        /// </summary>
        [Output("suspendImmediateTriggers")]
        public Output<ImmutableArray<int>> SuspendImmediateTriggers { get; private set; } = null!;

        /// <summary>
        /// The number that represents the percentage threshold at which to suspend all warehouses.
        /// </summary>
        [Output("suspendTrigger")]
        public Output<int?> SuspendTrigger { get; private set; } = null!;

        /// <summary>
        /// A list of percentage thresholds at which to suspend all warehouses.
        /// </summary>
        [Output("suspendTriggers")]
        public Output<ImmutableArray<int>> SuspendTriggers { get; private set; } = null!;

        /// <summary>
        /// A list of warehouses to apply the resource monitor to.
        /// </summary>
        [Output("warehouses")]
        public Output<ImmutableArray<string>> Warehouses { get; private set; } = null!;


        /// <summary>
        /// Create a ResourceMonitor resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ResourceMonitor(string name, ResourceMonitorArgs? args = null, CustomResourceOptions? options = null)
            : base("snowflake:index/resourceMonitor:ResourceMonitor", name, args ?? new ResourceMonitorArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ResourceMonitor(string name, Input<string> id, ResourceMonitorState? state = null, CustomResourceOptions? options = null)
            : base("snowflake:index/resourceMonitor:ResourceMonitor", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ResourceMonitor resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ResourceMonitor Get(string name, Input<string> id, ResourceMonitorState? state = null, CustomResourceOptions? options = null)
        {
            return new ResourceMonitor(name, id, state, options);
        }
    }

    public sealed class ResourceMonitorArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The number of credits allocated monthly to the resource monitor.
        /// </summary>
        [Input("creditQuota")]
        public Input<int>? CreditQuota { get; set; }

        /// <summary>
        /// The date and time when the resource monitor suspends the assigned warehouses.
        /// </summary>
        [Input("endTimestamp")]
        public Input<string>? EndTimestamp { get; set; }

        /// <summary>
        /// The frequency interval at which the credit usage resets to 0. If you set a frequency for a resource monitor, you must also set START_TIMESTAMP.
        /// </summary>
        [Input("frequency")]
        public Input<string>? Frequency { get; set; }

        /// <summary>
        /// Identifier for the resource monitor; must be unique for your account.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("notifyTriggers")]
        private InputList<int>? _notifyTriggers;

        /// <summary>
        /// A list of percentage thresholds at which to send an alert to subscribed users.
        /// </summary>
        public InputList<int> NotifyTriggers
        {
            get => _notifyTriggers ?? (_notifyTriggers = new InputList<int>());
            set => _notifyTriggers = value;
        }

        [Input("notifyUsers")]
        private InputList<string>? _notifyUsers;

        /// <summary>
        /// Specifies the list of users to receive email notifications on resource monitors.
        /// </summary>
        public InputList<string> NotifyUsers
        {
            get => _notifyUsers ?? (_notifyUsers = new InputList<string>());
            set => _notifyUsers = value;
        }

        /// <summary>
        /// Specifies whether the resource monitor should be applied globally to your Snowflake account (defaults to false).
        /// </summary>
        [Input("setForAccount")]
        public Input<bool>? SetForAccount { get; set; }

        /// <summary>
        /// The date and time when the resource monitor starts monitoring credit usage for the assigned warehouses.
        /// </summary>
        [Input("startTimestamp")]
        public Input<string>? StartTimestamp { get; set; }

        /// <summary>
        /// The number that represents the percentage threshold at which to immediately suspend all warehouses.
        /// </summary>
        [Input("suspendImmediateTrigger")]
        public Input<int>? SuspendImmediateTrigger { get; set; }

        [Input("suspendImmediateTriggers")]
        private InputList<int>? _suspendImmediateTriggers;

        /// <summary>
        /// A list of percentage thresholds at which to suspend all warehouses.
        /// </summary>
        [Obsolete(@"Use suspend_immediate_trigger instead")]
        public InputList<int> SuspendImmediateTriggers
        {
            get => _suspendImmediateTriggers ?? (_suspendImmediateTriggers = new InputList<int>());
            set => _suspendImmediateTriggers = value;
        }

        /// <summary>
        /// The number that represents the percentage threshold at which to suspend all warehouses.
        /// </summary>
        [Input("suspendTrigger")]
        public Input<int>? SuspendTrigger { get; set; }

        [Input("suspendTriggers")]
        private InputList<int>? _suspendTriggers;

        /// <summary>
        /// A list of percentage thresholds at which to suspend all warehouses.
        /// </summary>
        [Obsolete(@"Use suspend_trigger instead")]
        public InputList<int> SuspendTriggers
        {
            get => _suspendTriggers ?? (_suspendTriggers = new InputList<int>());
            set => _suspendTriggers = value;
        }

        [Input("warehouses")]
        private InputList<string>? _warehouses;

        /// <summary>
        /// A list of warehouses to apply the resource monitor to.
        /// </summary>
        public InputList<string> Warehouses
        {
            get => _warehouses ?? (_warehouses = new InputList<string>());
            set => _warehouses = value;
        }

        public ResourceMonitorArgs()
        {
        }
        public static new ResourceMonitorArgs Empty => new ResourceMonitorArgs();
    }

    public sealed class ResourceMonitorState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The number of credits allocated monthly to the resource monitor.
        /// </summary>
        [Input("creditQuota")]
        public Input<int>? CreditQuota { get; set; }

        /// <summary>
        /// The date and time when the resource monitor suspends the assigned warehouses.
        /// </summary>
        [Input("endTimestamp")]
        public Input<string>? EndTimestamp { get; set; }

        /// <summary>
        /// The frequency interval at which the credit usage resets to 0. If you set a frequency for a resource monitor, you must also set START_TIMESTAMP.
        /// </summary>
        [Input("frequency")]
        public Input<string>? Frequency { get; set; }

        /// <summary>
        /// Identifier for the resource monitor; must be unique for your account.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("notifyTriggers")]
        private InputList<int>? _notifyTriggers;

        /// <summary>
        /// A list of percentage thresholds at which to send an alert to subscribed users.
        /// </summary>
        public InputList<int> NotifyTriggers
        {
            get => _notifyTriggers ?? (_notifyTriggers = new InputList<int>());
            set => _notifyTriggers = value;
        }

        [Input("notifyUsers")]
        private InputList<string>? _notifyUsers;

        /// <summary>
        /// Specifies the list of users to receive email notifications on resource monitors.
        /// </summary>
        public InputList<string> NotifyUsers
        {
            get => _notifyUsers ?? (_notifyUsers = new InputList<string>());
            set => _notifyUsers = value;
        }

        /// <summary>
        /// Specifies whether the resource monitor should be applied globally to your Snowflake account (defaults to false).
        /// </summary>
        [Input("setForAccount")]
        public Input<bool>? SetForAccount { get; set; }

        /// <summary>
        /// The date and time when the resource monitor starts monitoring credit usage for the assigned warehouses.
        /// </summary>
        [Input("startTimestamp")]
        public Input<string>? StartTimestamp { get; set; }

        /// <summary>
        /// The number that represents the percentage threshold at which to immediately suspend all warehouses.
        /// </summary>
        [Input("suspendImmediateTrigger")]
        public Input<int>? SuspendImmediateTrigger { get; set; }

        [Input("suspendImmediateTriggers")]
        private InputList<int>? _suspendImmediateTriggers;

        /// <summary>
        /// A list of percentage thresholds at which to suspend all warehouses.
        /// </summary>
        [Obsolete(@"Use suspend_immediate_trigger instead")]
        public InputList<int> SuspendImmediateTriggers
        {
            get => _suspendImmediateTriggers ?? (_suspendImmediateTriggers = new InputList<int>());
            set => _suspendImmediateTriggers = value;
        }

        /// <summary>
        /// The number that represents the percentage threshold at which to suspend all warehouses.
        /// </summary>
        [Input("suspendTrigger")]
        public Input<int>? SuspendTrigger { get; set; }

        [Input("suspendTriggers")]
        private InputList<int>? _suspendTriggers;

        /// <summary>
        /// A list of percentage thresholds at which to suspend all warehouses.
        /// </summary>
        [Obsolete(@"Use suspend_trigger instead")]
        public InputList<int> SuspendTriggers
        {
            get => _suspendTriggers ?? (_suspendTriggers = new InputList<int>());
            set => _suspendTriggers = value;
        }

        [Input("warehouses")]
        private InputList<string>? _warehouses;

        /// <summary>
        /// A list of warehouses to apply the resource monitor to.
        /// </summary>
        public InputList<string> Warehouses
        {
            get => _warehouses ?? (_warehouses = new InputList<string>());
            set => _warehouses = value;
        }

        public ResourceMonitorState()
        {
        }
        public static new ResourceMonitorState Empty => new ResourceMonitorState();
    }
}
