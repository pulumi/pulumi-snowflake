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
    'GetCurrentRoleResult',
    'AwaitableGetCurrentRoleResult',
    'get_current_role',
]

@pulumi.output_type
class GetCurrentRoleResult:
    """
    A collection of values returned by getCurrentRole.
    """
    def __init__(__self__, id=None, name=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The name of the [primary role](https://docs.snowflake.com/en/user-guide/security-access-control-overview.html#label-access-control-role-enforcement) in use for the current session.
        """
        return pulumi.get(self, "name")


class AwaitableGetCurrentRoleResult(GetCurrentRoleResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetCurrentRoleResult(
            id=self.id,
            name=self.name)


def get_current_role(opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetCurrentRoleResult:
    """
    Use this data source to access information about an existing resource.
    """
    __args__ = dict()
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('snowflake:index/getCurrentRole:getCurrentRole', __args__, opts=opts, typ=GetCurrentRoleResult).value

    return AwaitableGetCurrentRoleResult(
        id=__ret__.id,
        name=__ret__.name)
