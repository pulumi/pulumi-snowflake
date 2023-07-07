# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetSystemGetPrivateLinkConfigResult',
    'AwaitableGetSystemGetPrivateLinkConfigResult',
    'get_system_get_private_link_config',
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
    Use this data source to access information about an existing resource.
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
