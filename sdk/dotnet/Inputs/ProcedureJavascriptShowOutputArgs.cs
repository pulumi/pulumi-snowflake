// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake.Inputs
{

    public sealed class ProcedureJavascriptShowOutputArgs : global::Pulumi.ResourceArgs
    {
        [Input("argumentsRaw")]
        public Input<string>? ArgumentsRaw { get; set; }

        [Input("catalogName")]
        public Input<string>? CatalogName { get; set; }

        [Input("createdOn")]
        public Input<string>? CreatedOn { get; set; }

        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("externalAccessIntegrations")]
        public Input<string>? ExternalAccessIntegrations { get; set; }

        [Input("isAggregate")]
        public Input<bool>? IsAggregate { get; set; }

        [Input("isAnsi")]
        public Input<bool>? IsAnsi { get; set; }

        [Input("isBuiltin")]
        public Input<bool>? IsBuiltin { get; set; }

        [Input("isSecure")]
        public Input<bool>? IsSecure { get; set; }

        [Input("isTableFunction")]
        public Input<bool>? IsTableFunction { get; set; }

        [Input("maxNumArguments")]
        public Input<int>? MaxNumArguments { get; set; }

        [Input("minNumArguments")]
        public Input<int>? MinNumArguments { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("schemaName")]
        public Input<string>? SchemaName { get; set; }

        [Input("secrets")]
        public Input<string>? Secrets { get; set; }

        [Input("validForClustering")]
        public Input<bool>? ValidForClustering { get; set; }

        public ProcedureJavascriptShowOutputArgs()
        {
        }
        public static new ProcedureJavascriptShowOutputArgs Empty => new ProcedureJavascriptShowOutputArgs();
    }
}