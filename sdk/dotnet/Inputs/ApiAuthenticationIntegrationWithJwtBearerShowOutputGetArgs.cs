// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake.Inputs
{

    public sealed class ApiAuthenticationIntegrationWithJwtBearerShowOutputGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("category")]
        public Input<string>? Category { get; set; }

        [Input("comment")]
        public Input<string>? Comment { get; set; }

        [Input("createdOn")]
        public Input<string>? CreatedOn { get; set; }

        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("integrationType")]
        public Input<string>? IntegrationType { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        public ApiAuthenticationIntegrationWithJwtBearerShowOutputGetArgs()
        {
        }
        public static new ApiAuthenticationIntegrationWithJwtBearerShowOutputGetArgs Empty => new ApiAuthenticationIntegrationWithJwtBearerShowOutputGetArgs();
    }
}
