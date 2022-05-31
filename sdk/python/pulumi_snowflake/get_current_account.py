# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetCurrentAccountResult',
    'AwaitableGetCurrentAccountResult',
    'get_current_account',
]

@pulumi.output_type
class GetCurrentAccountResult:
    """
    A collection of values returned by getCurrentAccount.
    """
    def __init__(__self__, account=None, id=None, region=None, url=None):
        if account and not isinstance(account, str):
            raise TypeError("Expected argument 'account' to be a str")
        pulumi.set(__self__, "account", account)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if region and not isinstance(region, str):
            raise TypeError("Expected argument 'region' to be a str")
        pulumi.set(__self__, "region", region)
        if url and not isinstance(url, str):
            raise TypeError("Expected argument 'url' to be a str")
        pulumi.set(__self__, "url", url)

    @property
    @pulumi.getter
    def account(self) -> str:
        return pulumi.get(self, "account")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def region(self) -> str:
        return pulumi.get(self, "region")

    @property
    @pulumi.getter
    def url(self) -> str:
        return pulumi.get(self, "url")


class AwaitableGetCurrentAccountResult(GetCurrentAccountResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetCurrentAccountResult(
            account=self.account,
            id=self.id,
            region=self.region,
            url=self.url)


def get_current_account(opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetCurrentAccountResult:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_aws as aws
    import pulumi_snowflake as snowflake

    this = snowflake.get_current_account()
    snowflake_account_url = aws.ssm.Parameter("snowflakeAccountUrl",
        type="String",
        value=this.url)
    ```
    """
    __args__ = dict()
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('snowflake:index/getCurrentAccount:getCurrentAccount', __args__, opts=opts, typ=GetCurrentAccountResult).value

    return AwaitableGetCurrentAccountResult(
        account=__ret__.account,
        id=__ret__.id,
        region=__ret__.region,
        url=__ret__.url)
