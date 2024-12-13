// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake
{
    public static class GetSystemGetPrivateLinkConfig
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
        /// using Aws = Pulumi.Aws;
        /// using Snowflake = Pulumi.Snowflake;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var snowflakePrivateLink = Snowflake.GetSystemGetPrivateLinkConfig.Invoke();
        /// 
        ///     var snowflakePrivateLinkSecurityGroup = new Aws.Index.SecurityGroup("snowflake_private_link", new()
        ///     {
        ///         VpcId = vpcId,
        ///         Ingress = new[]
        ///         {
        ///             
        ///             {
        ///                 { "fromPort", 80 },
        ///                 { "toPort", 80 },
        ///                 { "cidrBlocks", vpcCidr },
        ///                 { "protocol", "tcp" },
        ///             },
        ///             
        ///             {
        ///                 { "fromPort", 443 },
        ///                 { "toPort", 443 },
        ///                 { "cidrBlocks", vpcCidr },
        ///                 { "protocol", "tcp" },
        ///             },
        ///         },
        ///     });
        /// 
        ///     var snowflakePrivateLinkVpcEndpoint = new Aws.Index.VpcEndpoint("snowflake_private_link", new()
        ///     {
        ///         VpcId = vpcId,
        ///         ServiceName = snowflakePrivateLink.Apply(getSystemGetPrivateLinkConfigResult =&gt; getSystemGetPrivateLinkConfigResult.AwsVpceId),
        ///         VpcEndpointType = "Interface",
        ///         SecurityGroupIds = new[]
        ///         {
        ///             snowflakePrivateLinkSecurityGroup.Id,
        ///         },
        ///         SubnetIds = subnetIds,
        ///         PrivateDnsEnabled = false,
        ///     });
        /// 
        ///     var snowflakePrivateLinkRoute53Zone = new Aws.Index.Route53Zone("snowflake_private_link", new()
        ///     {
        ///         Name = "privatelink.snowflakecomputing.com",
        ///         Vpc = new[]
        ///         {
        ///             
        ///             {
        ///                 { "vpcId", vpcId },
        ///             },
        ///         },
        ///     });
        /// 
        ///     var snowflakePrivateLinkUrl = new Aws.Index.Route53Record("snowflake_private_link_url", new()
        ///     {
        ///         ZoneId = snowflakePrivateLinkRoute53Zone.ZoneId,
        ///         Name = snowflakePrivateLink.Apply(getSystemGetPrivateLinkConfigResult =&gt; getSystemGetPrivateLinkConfigResult.AccountUrl),
        ///         Type = "CNAME",
        ///         Ttl = "300",
        ///         Records = new[]
        ///         {
        ///             snowflakePrivateLinkVpcEndpoint.DnsEntry[0].Dns_name,
        ///         },
        ///     });
        /// 
        ///     var snowflakePrivateLinkOcspUrl = new Aws.Index.Route53Record("snowflake_private_link_ocsp_url", new()
        ///     {
        ///         ZoneId = snowflakePrivateLinkRoute53Zone.ZoneId,
        ///         Name = snowflakePrivateLink.Apply(getSystemGetPrivateLinkConfigResult =&gt; getSystemGetPrivateLinkConfigResult.OcspUrl),
        ///         Type = "CNAME",
        ///         Ttl = "300",
        ///         Records = new[]
        ///         {
        ///             snowflakePrivateLinkVpcEndpoint.DnsEntry[0].Dns_name,
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetSystemGetPrivateLinkConfigResult> InvokeAsync(InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSystemGetPrivateLinkConfigResult>("snowflake:index/getSystemGetPrivateLinkConfig:getSystemGetPrivateLinkConfig", InvokeArgs.Empty, options.WithDefaults());

        /// <summary>
        /// !&gt; **Caution: Preview Feature** This feature is considered a preview feature in the provider, regardless of the state of the resource in Snowflake. We do not guarantee its stability. It will be reworked and marked as a stable feature in future releases. Breaking changes are expected, even without bumping the major version. To use this feature, add the relevant feature name to `preview_features_enabled field` in the provider configuration. Please always refer to the Getting Help section in our Github repo to best determine how to get help for your questions.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// using Snowflake = Pulumi.Snowflake;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var snowflakePrivateLink = Snowflake.GetSystemGetPrivateLinkConfig.Invoke();
        /// 
        ///     var snowflakePrivateLinkSecurityGroup = new Aws.Index.SecurityGroup("snowflake_private_link", new()
        ///     {
        ///         VpcId = vpcId,
        ///         Ingress = new[]
        ///         {
        ///             
        ///             {
        ///                 { "fromPort", 80 },
        ///                 { "toPort", 80 },
        ///                 { "cidrBlocks", vpcCidr },
        ///                 { "protocol", "tcp" },
        ///             },
        ///             
        ///             {
        ///                 { "fromPort", 443 },
        ///                 { "toPort", 443 },
        ///                 { "cidrBlocks", vpcCidr },
        ///                 { "protocol", "tcp" },
        ///             },
        ///         },
        ///     });
        /// 
        ///     var snowflakePrivateLinkVpcEndpoint = new Aws.Index.VpcEndpoint("snowflake_private_link", new()
        ///     {
        ///         VpcId = vpcId,
        ///         ServiceName = snowflakePrivateLink.Apply(getSystemGetPrivateLinkConfigResult =&gt; getSystemGetPrivateLinkConfigResult.AwsVpceId),
        ///         VpcEndpointType = "Interface",
        ///         SecurityGroupIds = new[]
        ///         {
        ///             snowflakePrivateLinkSecurityGroup.Id,
        ///         },
        ///         SubnetIds = subnetIds,
        ///         PrivateDnsEnabled = false,
        ///     });
        /// 
        ///     var snowflakePrivateLinkRoute53Zone = new Aws.Index.Route53Zone("snowflake_private_link", new()
        ///     {
        ///         Name = "privatelink.snowflakecomputing.com",
        ///         Vpc = new[]
        ///         {
        ///             
        ///             {
        ///                 { "vpcId", vpcId },
        ///             },
        ///         },
        ///     });
        /// 
        ///     var snowflakePrivateLinkUrl = new Aws.Index.Route53Record("snowflake_private_link_url", new()
        ///     {
        ///         ZoneId = snowflakePrivateLinkRoute53Zone.ZoneId,
        ///         Name = snowflakePrivateLink.Apply(getSystemGetPrivateLinkConfigResult =&gt; getSystemGetPrivateLinkConfigResult.AccountUrl),
        ///         Type = "CNAME",
        ///         Ttl = "300",
        ///         Records = new[]
        ///         {
        ///             snowflakePrivateLinkVpcEndpoint.DnsEntry[0].Dns_name,
        ///         },
        ///     });
        /// 
        ///     var snowflakePrivateLinkOcspUrl = new Aws.Index.Route53Record("snowflake_private_link_ocsp_url", new()
        ///     {
        ///         ZoneId = snowflakePrivateLinkRoute53Zone.ZoneId,
        ///         Name = snowflakePrivateLink.Apply(getSystemGetPrivateLinkConfigResult =&gt; getSystemGetPrivateLinkConfigResult.OcspUrl),
        ///         Type = "CNAME",
        ///         Ttl = "300",
        ///         Records = new[]
        ///         {
        ///             snowflakePrivateLinkVpcEndpoint.DnsEntry[0].Dns_name,
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetSystemGetPrivateLinkConfigResult> Invoke(InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSystemGetPrivateLinkConfigResult>("snowflake:index/getSystemGetPrivateLinkConfig:getSystemGetPrivateLinkConfig", InvokeArgs.Empty, options.WithDefaults());

        /// <summary>
        /// !&gt; **Caution: Preview Feature** This feature is considered a preview feature in the provider, regardless of the state of the resource in Snowflake. We do not guarantee its stability. It will be reworked and marked as a stable feature in future releases. Breaking changes are expected, even without bumping the major version. To use this feature, add the relevant feature name to `preview_features_enabled field` in the provider configuration. Please always refer to the Getting Help section in our Github repo to best determine how to get help for your questions.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// using Snowflake = Pulumi.Snowflake;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var snowflakePrivateLink = Snowflake.GetSystemGetPrivateLinkConfig.Invoke();
        /// 
        ///     var snowflakePrivateLinkSecurityGroup = new Aws.Index.SecurityGroup("snowflake_private_link", new()
        ///     {
        ///         VpcId = vpcId,
        ///         Ingress = new[]
        ///         {
        ///             
        ///             {
        ///                 { "fromPort", 80 },
        ///                 { "toPort", 80 },
        ///                 { "cidrBlocks", vpcCidr },
        ///                 { "protocol", "tcp" },
        ///             },
        ///             
        ///             {
        ///                 { "fromPort", 443 },
        ///                 { "toPort", 443 },
        ///                 { "cidrBlocks", vpcCidr },
        ///                 { "protocol", "tcp" },
        ///             },
        ///         },
        ///     });
        /// 
        ///     var snowflakePrivateLinkVpcEndpoint = new Aws.Index.VpcEndpoint("snowflake_private_link", new()
        ///     {
        ///         VpcId = vpcId,
        ///         ServiceName = snowflakePrivateLink.Apply(getSystemGetPrivateLinkConfigResult =&gt; getSystemGetPrivateLinkConfigResult.AwsVpceId),
        ///         VpcEndpointType = "Interface",
        ///         SecurityGroupIds = new[]
        ///         {
        ///             snowflakePrivateLinkSecurityGroup.Id,
        ///         },
        ///         SubnetIds = subnetIds,
        ///         PrivateDnsEnabled = false,
        ///     });
        /// 
        ///     var snowflakePrivateLinkRoute53Zone = new Aws.Index.Route53Zone("snowflake_private_link", new()
        ///     {
        ///         Name = "privatelink.snowflakecomputing.com",
        ///         Vpc = new[]
        ///         {
        ///             
        ///             {
        ///                 { "vpcId", vpcId },
        ///             },
        ///         },
        ///     });
        /// 
        ///     var snowflakePrivateLinkUrl = new Aws.Index.Route53Record("snowflake_private_link_url", new()
        ///     {
        ///         ZoneId = snowflakePrivateLinkRoute53Zone.ZoneId,
        ///         Name = snowflakePrivateLink.Apply(getSystemGetPrivateLinkConfigResult =&gt; getSystemGetPrivateLinkConfigResult.AccountUrl),
        ///         Type = "CNAME",
        ///         Ttl = "300",
        ///         Records = new[]
        ///         {
        ///             snowflakePrivateLinkVpcEndpoint.DnsEntry[0].Dns_name,
        ///         },
        ///     });
        /// 
        ///     var snowflakePrivateLinkOcspUrl = new Aws.Index.Route53Record("snowflake_private_link_ocsp_url", new()
        ///     {
        ///         ZoneId = snowflakePrivateLinkRoute53Zone.ZoneId,
        ///         Name = snowflakePrivateLink.Apply(getSystemGetPrivateLinkConfigResult =&gt; getSystemGetPrivateLinkConfigResult.OcspUrl),
        ///         Type = "CNAME",
        ///         Ttl = "300",
        ///         Records = new[]
        ///         {
        ///             snowflakePrivateLinkVpcEndpoint.DnsEntry[0].Dns_name,
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetSystemGetPrivateLinkConfigResult> Invoke(InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetSystemGetPrivateLinkConfigResult>("snowflake:index/getSystemGetPrivateLinkConfig:getSystemGetPrivateLinkConfig", InvokeArgs.Empty, options.WithDefaults());
    }


    [OutputType]
    public sealed class GetSystemGetPrivateLinkConfigResult
    {
        /// <summary>
        /// The name of your Snowflake account.
        /// </summary>
        public readonly string AccountName;
        /// <summary>
        /// The URL used to connect to Snowflake through AWS PrivateLink or Azure Private Link.
        /// </summary>
        public readonly string AccountUrl;
        /// <summary>
        /// The AWS VPCE ID for your account.
        /// </summary>
        public readonly string AwsVpceId;
        /// <summary>
        /// The Azure Private Link Service ID for your account.
        /// </summary>
        public readonly string AzurePlsId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The endpoint to connect to your Snowflake internal stage using AWS PrivateLink or Azure Private Link.
        /// </summary>
        public readonly string InternalStage;
        /// <summary>
        /// The OCSP URL corresponding to your Snowflake account that uses AWS PrivateLink or Azure Private Link.
        /// </summary>
        public readonly string OcspUrl;
        /// <summary>
        /// The regionless URL to connect to your Snowflake account using AWS PrivateLink, Azure Private Link, or Google Cloud Private Service Connect.
        /// </summary>
        public readonly string RegionlessAccountUrl;
        /// <summary>
        /// The URL for your organization to access Snowsight using Private Connectivity to the Snowflake Service.
        /// </summary>
        public readonly string RegionlessSnowsightUrl;
        /// <summary>
        /// The URL containing the cloud region to access Snowsight and the Snowflake Marketplace using Private Connectivity to the Snowflake Service.
        /// </summary>
        public readonly string SnowsightUrl;

        [OutputConstructor]
        private GetSystemGetPrivateLinkConfigResult(
            string accountName,

            string accountUrl,

            string awsVpceId,

            string azurePlsId,

            string id,

            string internalStage,

            string ocspUrl,

            string regionlessAccountUrl,

            string regionlessSnowsightUrl,

            string snowsightUrl)
        {
            AccountName = accountName;
            AccountUrl = accountUrl;
            AwsVpceId = awsVpceId;
            AzurePlsId = azurePlsId;
            Id = id;
            InternalStage = internalStage;
            OcspUrl = ocspUrl;
            RegionlessAccountUrl = regionlessAccountUrl;
            RegionlessSnowsightUrl = regionlessSnowsightUrl;
            SnowsightUrl = snowsightUrl;
        }
    }
}
