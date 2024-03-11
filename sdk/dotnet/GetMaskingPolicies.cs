// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake
{
    public static class GetMaskingPolicies
    {
        /// <summary>
        /// ## Example Usage
        /// 
        /// &lt;!--Start PulumiCodeChooser --&gt;
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Snowflake = Pulumi.Snowflake;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var current = Snowflake.GetMaskingPolicies.Invoke(new()
        ///     {
        ///         Database = "MYDB",
        ///         Schema = "MYSCHEMA",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Task<GetMaskingPoliciesResult> InvokeAsync(GetMaskingPoliciesArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetMaskingPoliciesResult>("snowflake:index/getMaskingPolicies:getMaskingPolicies", args ?? new GetMaskingPoliciesArgs(), options.WithDefaults());

        /// <summary>
        /// ## Example Usage
        /// 
        /// &lt;!--Start PulumiCodeChooser --&gt;
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Snowflake = Pulumi.Snowflake;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var current = Snowflake.GetMaskingPolicies.Invoke(new()
        ///     {
        ///         Database = "MYDB",
        ///         Schema = "MYSCHEMA",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Output<GetMaskingPoliciesResult> Invoke(GetMaskingPoliciesInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetMaskingPoliciesResult>("snowflake:index/getMaskingPolicies:getMaskingPolicies", args ?? new GetMaskingPoliciesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetMaskingPoliciesArgs : global::Pulumi.InvokeArgs
    {
        [Input("database", required: true)]
        public string Database { get; set; } = null!;

        [Input("schema", required: true)]
        public string Schema { get; set; } = null!;

        public GetMaskingPoliciesArgs()
        {
        }
        public static new GetMaskingPoliciesArgs Empty => new GetMaskingPoliciesArgs();
    }

    public sealed class GetMaskingPoliciesInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("database", required: true)]
        public Input<string> Database { get; set; } = null!;

        [Input("schema", required: true)]
        public Input<string> Schema { get; set; } = null!;

        public GetMaskingPoliciesInvokeArgs()
        {
        }
        public static new GetMaskingPoliciesInvokeArgs Empty => new GetMaskingPoliciesInvokeArgs();
    }


    [OutputType]
    public sealed class GetMaskingPoliciesResult
    {
        /// <summary>
        /// The database from which to return the schemas from.
        /// </summary>
        public readonly string Database;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The maskingPolicies in the schema
        /// </summary>
        public readonly ImmutableArray<Outputs.GetMaskingPoliciesMaskingPolicyResult> MaskingPolicies;
        /// <summary>
        /// The schema from which to return the maskingPolicies from.
        /// </summary>
        public readonly string Schema;

        [OutputConstructor]
        private GetMaskingPoliciesResult(
            string database,

            string id,

            ImmutableArray<Outputs.GetMaskingPoliciesMaskingPolicyResult> maskingPolicies,

            string schema)
        {
            Database = database;
            Id = id;
            MaskingPolicies = maskingPolicies;
            Schema = schema;
        }
    }
}
