// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake.Inputs
{

    public sealed class Saml2IntegrationDescribeOutputSaml2DigestMethodsUsedGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("default")]
        public Input<string>? Default { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("type")]
        public Input<string>? Type { get; set; }

        [Input("value")]
        public Input<string>? Value { get; set; }

        public Saml2IntegrationDescribeOutputSaml2DigestMethodsUsedGetArgs()
        {
        }
        public static new Saml2IntegrationDescribeOutputSaml2DigestMethodsUsedGetArgs Empty => new Saml2IntegrationDescribeOutputSaml2DigestMethodsUsedGetArgs();
    }
}
