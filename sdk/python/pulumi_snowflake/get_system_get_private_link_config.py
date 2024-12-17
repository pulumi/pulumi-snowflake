# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from . import _utilities

__all__ = [
    'GetSystemGetPrivateLinkConfigResult',
    'AwaitableGetSystemGetPrivateLinkConfigResult',
    'get_system_get_private_link_config',
    'get_system_get_private_link_config_output',
]

@pulumi.output_type
class GetSystemGetPrivateLinkConfigResult:
    """
    A collection of values returned by getSystemGetPrivateLinkConfig.
    """
    def __init__(__self__, account_name=None, account_url=None, aws_vpce_id=None, azure_pls_id=None, id=None, internal_stage=None, ocsp_url=None, regionless_account_url=None, regionless_snowsight_url=None, snowsight_url=None):
        if account_name and not isinstance(account_name, str):
            raise TypeError("Expected argument 'account_name' to be a str")
        pulumi.set(__self__, "account_name", account_name)
        if account_url and not isinstance(account_url, str):
            raise TypeError("Expected argument 'account_url' to be a str")
        pulumi.set(__self__, "account_url", account_url)
        if aws_vpce_id and not isinstance(aws_vpce_id, str):
            raise TypeError("Expected argument 'aws_vpce_id' to be a str")
        pulumi.set(__self__, "aws_vpce_id", aws_vpce_id)
        if azure_pls_id and not isinstance(azure_pls_id, str):
            raise TypeError("Expected argument 'azure_pls_id' to be a str")
        pulumi.set(__self__, "azure_pls_id", azure_pls_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if internal_stage and not isinstance(internal_stage, str):
            raise TypeError("Expected argument 'internal_stage' to be a str")
        pulumi.set(__self__, "internal_stage", internal_stage)
        if ocsp_url and not isinstance(ocsp_url, str):
            raise TypeError("Expected argument 'ocsp_url' to be a str")
        pulumi.set(__self__, "ocsp_url", ocsp_url)
        if regionless_account_url and not isinstance(regionless_account_url, str):
            raise TypeError("Expected argument 'regionless_account_url' to be a str")
        pulumi.set(__self__, "regionless_account_url", regionless_account_url)
        if regionless_snowsight_url and not isinstance(regionless_snowsight_url, str):
            raise TypeError("Expected argument 'regionless_snowsight_url' to be a str")
        pulumi.set(__self__, "regionless_snowsight_url", regionless_snowsight_url)
        if snowsight_url and not isinstance(snowsight_url, str):
            raise TypeError("Expected argument 'snowsight_url' to be a str")
        pulumi.set(__self__, "snowsight_url", snowsight_url)

    @property
    @pulumi.getter(name="accountName")
    def account_name(self) -> str:
        """
        The name of your Snowflake account.
        """
        return pulumi.get(self, "account_name")

    @property
    @pulumi.getter(name="accountUrl")
    def account_url(self) -> str:
        """
        The URL used to connect to Snowflake through AWS PrivateLink or Azure Private Link.
        """
        return pulumi.get(self, "account_url")

    @property
    @pulumi.getter(name="awsVpceId")
    def aws_vpce_id(self) -> str:
        """
        The AWS VPCE ID for your account.
        """
        return pulumi.get(self, "aws_vpce_id")

    @property
    @pulumi.getter(name="azurePlsId")
    def azure_pls_id(self) -> str:
        """
        The Azure Private Link Service ID for your account.
        """
        return pulumi.get(self, "azure_pls_id")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="internalStage")
    def internal_stage(self) -> str:
        """
        The endpoint to connect to your Snowflake internal stage using AWS PrivateLink or Azure Private Link.
        """
        return pulumi.get(self, "internal_stage")

    @property
    @pulumi.getter(name="ocspUrl")
    def ocsp_url(self) -> str:
        """
        The OCSP URL corresponding to your Snowflake account that uses AWS PrivateLink or Azure Private Link.
        """
        return pulumi.get(self, "ocsp_url")

    @property
    @pulumi.getter(name="regionlessAccountUrl")
    def regionless_account_url(self) -> str:
        """
        The regionless URL to connect to your Snowflake account using AWS PrivateLink, Azure Private Link, or Google Cloud Private Service Connect.
        """
        return pulumi.get(self, "regionless_account_url")

    @property
    @pulumi.getter(name="regionlessSnowsightUrl")
    def regionless_snowsight_url(self) -> str:
        """
        The URL for your organization to access Snowsight using Private Connectivity to the Snowflake Service.
        """
        return pulumi.get(self, "regionless_snowsight_url")

    @property
    @pulumi.getter(name="snowsightUrl")
    def snowsight_url(self) -> str:
        """
        The URL containing the cloud region to access Snowsight and the Snowflake Marketplace using Private Connectivity to the Snowflake Service.
        """
        return pulumi.get(self, "snowsight_url")


class AwaitableGetSystemGetPrivateLinkConfigResult(GetSystemGetPrivateLinkConfigResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetSystemGetPrivateLinkConfigResult(
            account_name=self.account_name,
            account_url=self.account_url,
            aws_vpce_id=self.aws_vpce_id,
            azure_pls_id=self.azure_pls_id,
            id=self.id,
            internal_stage=self.internal_stage,
            ocsp_url=self.ocsp_url,
            regionless_account_url=self.regionless_account_url,
            regionless_snowsight_url=self.regionless_snowsight_url,
            snowsight_url=self.snowsight_url)


def get_system_get_private_link_config(opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetSystemGetPrivateLinkConfigResult:
    """
    !> **Caution: Preview Feature** This feature is considered a preview feature in the provider, regardless of the state of the resource in Snowflake. We do not guarantee its stability. It will be reworked and marked as a stable feature in future releases. Breaking changes are expected, even without bumping the major version. To use this feature, add the relevant feature name to `preview_features_enabled field` in the provider configuration. Please always refer to the Getting Help section in our Github repo to best determine how to get help for your questions.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aws as aws
    import pulumi_snowflake as snowflake

    snowflake_private_link = snowflake.get_system_get_private_link_config()
    snowflake_private_link_security_group = aws.index.SecurityGroup("snowflake_private_link",
        vpc_id=vpc_id,
        ingress=[
            {
                fromPort: 80,
                toPort: 80,
                cidrBlocks: vpc_cidr,
                protocol: tcp,
            },
            {
                fromPort: 443,
                toPort: 443,
                cidrBlocks: vpc_cidr,
                protocol: tcp,
            },
        ])
    snowflake_private_link_vpc_endpoint = aws.index.VpcEndpoint("snowflake_private_link",
        vpc_id=vpc_id,
        service_name=snowflake_private_link.aws_vpce_id,
        vpc_endpoint_type=Interface,
        security_group_ids=[snowflake_private_link_security_group.id],
        subnet_ids=subnet_ids,
        private_dns_enabled=False)
    snowflake_private_link_route53_zone = aws.index.Route53Zone("snowflake_private_link",
        name=privatelink.snowflakecomputing.com,
        vpc=[{
            vpcId: vpc_id,
        }])
    snowflake_private_link_url = aws.index.Route53Record("snowflake_private_link_url",
        zone_id=snowflake_private_link_route53_zone.zone_id,
        name=snowflake_private_link.account_url,
        type=CNAME,
        ttl=300,
        records=[snowflake_private_link_vpc_endpoint.dns_entry[0].dns_name])
    snowflake_private_link_ocsp_url = aws.index.Route53Record("snowflake_private_link_ocsp_url",
        zone_id=snowflake_private_link_route53_zone.zone_id,
        name=snowflake_private_link.ocsp_url,
        type=CNAME,
        ttl=300,
        records=[snowflake_private_link_vpc_endpoint.dns_entry[0].dns_name])
    ```
    """
    __args__ = dict()
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('snowflake:index/getSystemGetPrivateLinkConfig:getSystemGetPrivateLinkConfig', __args__, opts=opts, typ=GetSystemGetPrivateLinkConfigResult).value

    return AwaitableGetSystemGetPrivateLinkConfigResult(
        account_name=pulumi.get(__ret__, 'account_name'),
        account_url=pulumi.get(__ret__, 'account_url'),
        aws_vpce_id=pulumi.get(__ret__, 'aws_vpce_id'),
        azure_pls_id=pulumi.get(__ret__, 'azure_pls_id'),
        id=pulumi.get(__ret__, 'id'),
        internal_stage=pulumi.get(__ret__, 'internal_stage'),
        ocsp_url=pulumi.get(__ret__, 'ocsp_url'),
        regionless_account_url=pulumi.get(__ret__, 'regionless_account_url'),
        regionless_snowsight_url=pulumi.get(__ret__, 'regionless_snowsight_url'),
        snowsight_url=pulumi.get(__ret__, 'snowsight_url'))
def get_system_get_private_link_config_output(opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetSystemGetPrivateLinkConfigResult]:
    """
    !> **Caution: Preview Feature** This feature is considered a preview feature in the provider, regardless of the state of the resource in Snowflake. We do not guarantee its stability. It will be reworked and marked as a stable feature in future releases. Breaking changes are expected, even without bumping the major version. To use this feature, add the relevant feature name to `preview_features_enabled field` in the provider configuration. Please always refer to the Getting Help section in our Github repo to best determine how to get help for your questions.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aws as aws
    import pulumi_snowflake as snowflake

    snowflake_private_link = snowflake.get_system_get_private_link_config()
    snowflake_private_link_security_group = aws.index.SecurityGroup("snowflake_private_link",
        vpc_id=vpc_id,
        ingress=[
            {
                fromPort: 80,
                toPort: 80,
                cidrBlocks: vpc_cidr,
                protocol: tcp,
            },
            {
                fromPort: 443,
                toPort: 443,
                cidrBlocks: vpc_cidr,
                protocol: tcp,
            },
        ])
    snowflake_private_link_vpc_endpoint = aws.index.VpcEndpoint("snowflake_private_link",
        vpc_id=vpc_id,
        service_name=snowflake_private_link.aws_vpce_id,
        vpc_endpoint_type=Interface,
        security_group_ids=[snowflake_private_link_security_group.id],
        subnet_ids=subnet_ids,
        private_dns_enabled=False)
    snowflake_private_link_route53_zone = aws.index.Route53Zone("snowflake_private_link",
        name=privatelink.snowflakecomputing.com,
        vpc=[{
            vpcId: vpc_id,
        }])
    snowflake_private_link_url = aws.index.Route53Record("snowflake_private_link_url",
        zone_id=snowflake_private_link_route53_zone.zone_id,
        name=snowflake_private_link.account_url,
        type=CNAME,
        ttl=300,
        records=[snowflake_private_link_vpc_endpoint.dns_entry[0].dns_name])
    snowflake_private_link_ocsp_url = aws.index.Route53Record("snowflake_private_link_ocsp_url",
        zone_id=snowflake_private_link_route53_zone.zone_id,
        name=snowflake_private_link.ocsp_url,
        type=CNAME,
        ttl=300,
        records=[snowflake_private_link_vpc_endpoint.dns_entry[0].dns_name])
    ```
    """
    __args__ = dict()
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('snowflake:index/getSystemGetPrivateLinkConfig:getSystemGetPrivateLinkConfig', __args__, opts=opts, typ=GetSystemGetPrivateLinkConfigResult)
    return __ret__.apply(lambda __response__: GetSystemGetPrivateLinkConfigResult(
        account_name=pulumi.get(__response__, 'account_name'),
        account_url=pulumi.get(__response__, 'account_url'),
        aws_vpce_id=pulumi.get(__response__, 'aws_vpce_id'),
        azure_pls_id=pulumi.get(__response__, 'azure_pls_id'),
        id=pulumi.get(__response__, 'id'),
        internal_stage=pulumi.get(__response__, 'internal_stage'),
        ocsp_url=pulumi.get(__response__, 'ocsp_url'),
        regionless_account_url=pulumi.get(__response__, 'regionless_account_url'),
        regionless_snowsight_url=pulumi.get(__response__, 'regionless_snowsight_url'),
        snowsight_url=pulumi.get(__response__, 'snowsight_url')))
