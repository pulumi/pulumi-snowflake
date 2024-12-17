// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake
{
    public static class GetAlerts
    {
        /// <summary>
        /// !&gt; **Caution: Preview Feature** This feature is considered a preview feature in the provider, regardless of the state of the resource in Snowflake. We do not guarantee its stability. It will be reworked and marked as a stable feature in future releases. Breaking changes are expected, even without bumping the major version. To use this feature, add the relevant feature name to `preview_features_enabled field` in the provider configuration. Please always refer to the Getting Help section in our Github repo to best determine how to get help for your questions.
        /// 
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
        ///     var current = Snowflake.GetAlerts.Invoke(new()
        ///     {
        ///         Database = "MYDB",
        ///         Schema = "MYSCHEMA",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetAlertsResult> InvokeAsync(GetAlertsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetAlertsResult>("snowflake:index/getAlerts:getAlerts", args ?? new GetAlertsArgs(), options.WithDefaults());

        /// <summary>
        /// !&gt; **Caution: Preview Feature** This feature is considered a preview feature in the provider, regardless of the state of the resource in Snowflake. We do not guarantee its stability. It will be reworked and marked as a stable feature in future releases. Breaking changes are expected, even without bumping the major version. To use this feature, add the relevant feature name to `preview_features_enabled field` in the provider configuration. Please always refer to the Getting Help section in our Github repo to best determine how to get help for your questions.
        /// 
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
        ///     var current = Snowflake.GetAlerts.Invoke(new()
        ///     {
        ///         Database = "MYDB",
        ///         Schema = "MYSCHEMA",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetAlertsResult> Invoke(GetAlertsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetAlertsResult>("snowflake:index/getAlerts:getAlerts", args ?? new GetAlertsInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// !&gt; **Caution: Preview Feature** This feature is considered a preview feature in the provider, regardless of the state of the resource in Snowflake. We do not guarantee its stability. It will be reworked and marked as a stable feature in future releases. Breaking changes are expected, even without bumping the major version. To use this feature, add the relevant feature name to `preview_features_enabled field` in the provider configuration. Please always refer to the Getting Help section in our Github repo to best determine how to get help for your questions.
        /// 
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
        ///     var current = Snowflake.GetAlerts.Invoke(new()
        ///     {
        ///         Database = "MYDB",
        ///         Schema = "MYSCHEMA",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetAlertsResult> Invoke(GetAlertsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetAlertsResult>("snowflake:index/getAlerts:getAlerts", args ?? new GetAlertsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetAlertsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The database from which to return the alerts from.
        /// </summary>
        [Input("database")]
        public string? Database { get; set; }

        /// <summary>
        /// Filters the command output by object name.
        /// </summary>
        [Input("pattern")]
        public string? Pattern { get; set; }

        /// <summary>
        /// The schema from which to return the alerts from.
        /// </summary>
        [Input("schema")]
        public string? Schema { get; set; }

        public GetAlertsArgs()
        {
        }
        public static new GetAlertsArgs Empty => new GetAlertsArgs();
    }

    public sealed class GetAlertsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The database from which to return the alerts from.
        /// </summary>
        [Input("database")]
        public Input<string>? Database { get; set; }

        /// <summary>
        /// Filters the command output by object name.
        /// </summary>
        [Input("pattern")]
        public Input<string>? Pattern { get; set; }

        /// <summary>
        /// The schema from which to return the alerts from.
        /// </summary>
        [Input("schema")]
        public Input<string>? Schema { get; set; }

        public GetAlertsInvokeArgs()
        {
        }
        public static new GetAlertsInvokeArgs Empty => new GetAlertsInvokeArgs();
    }


    [OutputType]
    public sealed class GetAlertsResult
    {
        /// <summary>
        /// Lists alerts for the current/specified database or schema, or across the entire account.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetAlertsAlertResult> Alerts;
        /// <summary>
        /// The database from which to return the alerts from.
        /// </summary>
        public readonly string? Database;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Filters the command output by object name.
        /// </summary>
        public readonly string? Pattern;
        /// <summary>
        /// The schema from which to return the alerts from.
        /// </summary>
        public readonly string? Schema;

        [OutputConstructor]
        private GetAlertsResult(
            ImmutableArray<Outputs.GetAlertsAlertResult> alerts,

            string? database,

            string id,

            string? pattern,

            string? schema)
        {
            Alerts = alerts;
            Database = database;
            Id = id;
            Pattern = pattern;
            Schema = schema;
        }
    }
}
