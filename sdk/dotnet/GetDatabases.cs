// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake
{
    public static class GetDatabases
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
        ///     var @this = Snowflake.GetDatabases.Invoke();
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetDatabasesResult> InvokeAsync(GetDatabasesArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetDatabasesResult>("snowflake:index/getDatabases:getDatabases", args ?? new GetDatabasesArgs(), options.WithDefaults());

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
        ///     var @this = Snowflake.GetDatabases.Invoke();
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetDatabasesResult> Invoke(GetDatabasesInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetDatabasesResult>("snowflake:index/getDatabases:getDatabases", args ?? new GetDatabasesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetDatabasesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Optionally includes dropped databases that have not yet been purged The output also includes an additional `dropped_on` column
        /// </summary>
        [Input("history")]
        public bool? History { get; set; }

        /// <summary>
        /// Optionally filters the databases by a pattern
        /// </summary>
        [Input("pattern")]
        public string? Pattern { get; set; }

        /// <summary>
        /// Optionally filters the databases by a pattern
        /// </summary>
        [Input("startsWith")]
        public string? StartsWith { get; set; }

        /// <summary>
        /// Optionally returns only the columns `created_on` and `name` in the results
        /// </summary>
        [Input("terse")]
        public bool? Terse { get; set; }

        public GetDatabasesArgs()
        {
        }
        public static new GetDatabasesArgs Empty => new GetDatabasesArgs();
    }

    public sealed class GetDatabasesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Optionally includes dropped databases that have not yet been purged The output also includes an additional `dropped_on` column
        /// </summary>
        [Input("history")]
        public Input<bool>? History { get; set; }

        /// <summary>
        /// Optionally filters the databases by a pattern
        /// </summary>
        [Input("pattern")]
        public Input<string>? Pattern { get; set; }

        /// <summary>
        /// Optionally filters the databases by a pattern
        /// </summary>
        [Input("startsWith")]
        public Input<string>? StartsWith { get; set; }

        /// <summary>
        /// Optionally returns only the columns `created_on` and `name` in the results
        /// </summary>
        [Input("terse")]
        public Input<bool>? Terse { get; set; }

        public GetDatabasesInvokeArgs()
        {
        }
        public static new GetDatabasesInvokeArgs Empty => new GetDatabasesInvokeArgs();
    }


    [OutputType]
    public sealed class GetDatabasesResult
    {
        /// <summary>
        /// Snowflake databases
        /// </summary>
        public readonly ImmutableArray<Outputs.GetDatabasesDatabaseResult> Databases;
        /// <summary>
        /// Optionally includes dropped databases that have not yet been purged The output also includes an additional `dropped_on` column
        /// </summary>
        public readonly bool? History;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Optionally filters the databases by a pattern
        /// </summary>
        public readonly string? Pattern;
        /// <summary>
        /// Optionally filters the databases by a pattern
        /// </summary>
        public readonly string? StartsWith;
        /// <summary>
        /// Optionally returns only the columns `created_on` and `name` in the results
        /// </summary>
        public readonly bool? Terse;

        [OutputConstructor]
        private GetDatabasesResult(
            ImmutableArray<Outputs.GetDatabasesDatabaseResult> databases,

            bool? history,

            string id,

            string? pattern,

            string? startsWith,

            bool? terse)
        {
            Databases = databases;
            History = history;
            Id = id;
            Pattern = pattern;
            StartsWith = startsWith;
            Terse = terse;
        }
    }
}
