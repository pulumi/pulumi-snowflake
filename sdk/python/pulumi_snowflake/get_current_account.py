# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins
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
    'GetCurrentAccountResult',
    'AwaitableGetCurrentAccountResult',
    'get_current_account',
    'get_current_account_output',
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
    def account(self) -> builtins.str:
        """
        The Snowflake Account ID; as returned by CURRENT_ACCOUNT().
        """
        return pulumi.get(self, "account")

    @property
    @pulumi.getter
    def id(self) -> builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def region(self) -> builtins.str:
        """
        The Snowflake Region; as returned by CURRENT_REGION()
        """
        return pulumi.get(self, "region")

    @property
    @pulumi.getter
    def url(self) -> builtins.str:
        """
        The Snowflake URL.
        """
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
    !> **Caution: Preview Feature** This feature is considered a preview feature in the provider, regardless of the state of the resource in Snowflake. We do not guarantee its stability. It will be reworked and marked as a stable feature in future releases. Breaking changes are expected, even without bumping the major version. To use this feature, add the relevant feature name to `preview_features_enabled` field in the provider configuration. Please always refer to the Getting Help section in our Github repo to best determine how to get help for your questions.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aws as aws
    import pulumi_snowflake as snowflake

    this = snowflake.get_current_account()
    snowflake_account_url = aws.index.SsmParameter("snowflake_account_url",
        name=/snowflake/account_url,
        type=String,
        value=this.url)
    ```

    > **Note** If a field has a default value, it is shown next to the type in the schema.
    """
    __args__ = dict()
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('snowflake:index/getCurrentAccount:getCurrentAccount', __args__, opts=opts, typ=GetCurrentAccountResult).value

    return AwaitableGetCurrentAccountResult(
        account=pulumi.get(__ret__, 'account'),
        id=pulumi.get(__ret__, 'id'),
        region=pulumi.get(__ret__, 'region'),
        url=pulumi.get(__ret__, 'url'))
def get_current_account_output(opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetCurrentAccountResult]:
    """
    !> **Caution: Preview Feature** This feature is considered a preview feature in the provider, regardless of the state of the resource in Snowflake. We do not guarantee its stability. It will be reworked and marked as a stable feature in future releases. Breaking changes are expected, even without bumping the major version. To use this feature, add the relevant feature name to `preview_features_enabled` field in the provider configuration. Please always refer to the Getting Help section in our Github repo to best determine how to get help for your questions.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aws as aws
    import pulumi_snowflake as snowflake

    this = snowflake.get_current_account()
    snowflake_account_url = aws.index.SsmParameter("snowflake_account_url",
        name=/snowflake/account_url,
        type=String,
        value=this.url)
    ```

    > **Note** If a field has a default value, it is shown next to the type in the schema.
    """
    __args__ = dict()
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('snowflake:index/getCurrentAccount:getCurrentAccount', __args__, opts=opts, typ=GetCurrentAccountResult)
    return __ret__.apply(lambda __response__: GetCurrentAccountResult(
        account=pulumi.get(__response__, 'account'),
        id=pulumi.get(__response__, 'id'),
        region=pulumi.get(__response__, 'region'),
        url=pulumi.get(__response__, 'url')))
