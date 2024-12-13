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
from . import outputs

__all__ = [
    'GetSecurityIntegrationsResult',
    'AwaitableGetSecurityIntegrationsResult',
    'get_security_integrations',
    'get_security_integrations_output',
]

@pulumi.output_type
class GetSecurityIntegrationsResult:
    """
    A collection of values returned by getSecurityIntegrations.
    """
    def __init__(__self__, id=None, like=None, security_integrations=None, with_describe=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if like and not isinstance(like, str):
            raise TypeError("Expected argument 'like' to be a str")
        pulumi.set(__self__, "like", like)
        if security_integrations and not isinstance(security_integrations, list):
            raise TypeError("Expected argument 'security_integrations' to be a list")
        pulumi.set(__self__, "security_integrations", security_integrations)
        if with_describe and not isinstance(with_describe, bool):
            raise TypeError("Expected argument 'with_describe' to be a bool")
        pulumi.set(__self__, "with_describe", with_describe)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def like(self) -> Optional[str]:
        """
        Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
        """
        return pulumi.get(self, "like")

    @property
    @pulumi.getter(name="securityIntegrations")
    def security_integrations(self) -> Sequence['outputs.GetSecurityIntegrationsSecurityIntegrationResult']:
        """
        Holds the aggregated output of all security integrations details queries.
        """
        return pulumi.get(self, "security_integrations")

    @property
    @pulumi.getter(name="withDescribe")
    def with_describe(self) -> Optional[bool]:
        """
        Runs DESC SECURITY INTEGRATION for each security integration returned by SHOW SECURITY INTEGRATIONS. The output of describe is saved to the description field. By default this value is set to true.
        """
        return pulumi.get(self, "with_describe")


class AwaitableGetSecurityIntegrationsResult(GetSecurityIntegrationsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetSecurityIntegrationsResult(
            id=self.id,
            like=self.like,
            security_integrations=self.security_integrations,
            with_describe=self.with_describe)


def get_security_integrations(like: Optional[str] = None,
                              with_describe: Optional[bool] = None,
                              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetSecurityIntegrationsResult:
    """
    Data source used to get details of filtered security integrations. Filtering is aligned with the current possibilities for [SHOW SECURITY INTEGRATIONS](https://docs.snowflake.com/en/sql-reference/sql/show-integrations) query (only `like` is supported). The results of SHOW and DESCRIBE are encapsulated in one output collection `security_integrations`.


    :param str like: Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
    :param bool with_describe: Runs DESC SECURITY INTEGRATION for each security integration returned by SHOW SECURITY INTEGRATIONS. The output of describe is saved to the description field. By default this value is set to true.
    """
    __args__ = dict()
    __args__['like'] = like
    __args__['withDescribe'] = with_describe
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('snowflake:index/getSecurityIntegrations:getSecurityIntegrations', __args__, opts=opts, typ=GetSecurityIntegrationsResult).value

    return AwaitableGetSecurityIntegrationsResult(
        id=pulumi.get(__ret__, 'id'),
        like=pulumi.get(__ret__, 'like'),
        security_integrations=pulumi.get(__ret__, 'security_integrations'),
        with_describe=pulumi.get(__ret__, 'with_describe'))
def get_security_integrations_output(like: Optional[pulumi.Input[Optional[str]]] = None,
                                     with_describe: Optional[pulumi.Input[Optional[bool]]] = None,
                                     opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetSecurityIntegrationsResult]:
    """
    Data source used to get details of filtered security integrations. Filtering is aligned with the current possibilities for [SHOW SECURITY INTEGRATIONS](https://docs.snowflake.com/en/sql-reference/sql/show-integrations) query (only `like` is supported). The results of SHOW and DESCRIBE are encapsulated in one output collection `security_integrations`.


    :param str like: Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
    :param bool with_describe: Runs DESC SECURITY INTEGRATION for each security integration returned by SHOW SECURITY INTEGRATIONS. The output of describe is saved to the description field. By default this value is set to true.
    """
    __args__ = dict()
    __args__['like'] = like
    __args__['withDescribe'] = with_describe
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('snowflake:index/getSecurityIntegrations:getSecurityIntegrations', __args__, opts=opts, typ=GetSecurityIntegrationsResult)
    return __ret__.apply(lambda __response__: GetSecurityIntegrationsResult(
        id=pulumi.get(__response__, 'id'),
        like=pulumi.get(__response__, 'like'),
        security_integrations=pulumi.get(__response__, 'security_integrations'),
        with_describe=pulumi.get(__response__, 'with_describe')))
