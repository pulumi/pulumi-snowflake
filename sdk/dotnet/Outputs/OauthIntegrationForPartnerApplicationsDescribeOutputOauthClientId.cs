// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake.Outputs
{

    [OutputType]
    public sealed class OauthIntegrationForPartnerApplicationsDescribeOutputOauthClientId
    {
        public readonly string? Default;
        public readonly string? Name;
        public readonly string? Type;
        public readonly string? Value;

        [OutputConstructor]
        private OauthIntegrationForPartnerApplicationsDescribeOutputOauthClientId(
            string? @default,

            string? name,

            string? type,

            string? value)
        {
            Default = @default;
            Name = name;
            Type = type;
            Value = value;
        }
    }
}
