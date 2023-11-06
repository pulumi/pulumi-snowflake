# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs

__all__ = [
    'GetResourceMonitorsResult',
    'AwaitableGetResourceMonitorsResult',
    'get_resource_monitors',
    'get_resource_monitors_output',
]

@pulumi.output_type
class GetResourceMonitorsResult:
    """
    A collection of values returned by getResourceMonitors.
    """
    def __init__(__self__, id=None, resource_monitors=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if resource_monitors and not isinstance(resource_monitors, list):
            raise TypeError("Expected argument 'resource_monitors' to be a list")
        pulumi.set(__self__, "resource_monitors", resource_monitors)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="resourceMonitors")
    def resource_monitors(self) -> Sequence['outputs.GetResourceMonitorsResourceMonitorResult']:
        """
        The resource monitors in the database
        """
        return pulumi.get(self, "resource_monitors")


class AwaitableGetResourceMonitorsResult(GetResourceMonitorsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetResourceMonitorsResult(
            id=self.id,
            resource_monitors=self.resource_monitors)


def get_resource_monitors(opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetResourceMonitorsResult:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_snowflake as snowflake

    current = snowflake.get_resource_monitors()
    ```
    """
    __args__ = dict()
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('snowflake:index/getResourceMonitors:getResourceMonitors', __args__, opts=opts, typ=GetResourceMonitorsResult).value

    return AwaitableGetResourceMonitorsResult(
        id=pulumi.get(__ret__, 'id'),
        resource_monitors=pulumi.get(__ret__, 'resource_monitors'))


@_utilities.lift_output_func(get_resource_monitors)
def get_resource_monitors_output(opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetResourceMonitorsResult]:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_snowflake as snowflake

    current = snowflake.get_resource_monitors()
    ```
    """
    ...
