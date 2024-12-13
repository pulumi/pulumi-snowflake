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
    'GetAccountRolesResult',
    'AwaitableGetAccountRolesResult',
    'get_account_roles',
    'get_account_roles_output',
]

@pulumi.output_type
class GetAccountRolesResult:
    """
    A collection of values returned by getAccountRoles.
    """
    def __init__(__self__, account_roles=None, id=None, in_class=None, like=None):
        if account_roles and not isinstance(account_roles, list):
            raise TypeError("Expected argument 'account_roles' to be a list")
        pulumi.set(__self__, "account_roles", account_roles)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if in_class and not isinstance(in_class, str):
            raise TypeError("Expected argument 'in_class' to be a str")
        pulumi.set(__self__, "in_class", in_class)
        if like and not isinstance(like, str):
            raise TypeError("Expected argument 'like' to be a str")
        pulumi.set(__self__, "like", like)

    @property
    @pulumi.getter(name="accountRoles")
    def account_roles(self) -> Sequence['outputs.GetAccountRolesAccountRoleResult']:
        """
        Holds the aggregated output of all account role details queries.
        """
        return pulumi.get(self, "account_roles")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="inClass")
    def in_class(self) -> Optional[str]:
        """
        Filters the SHOW GRANTS output by class name.
        """
        return pulumi.get(self, "in_class")

    @property
    @pulumi.getter
    def like(self) -> Optional[str]:
        """
        Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
        """
        return pulumi.get(self, "like")


class AwaitableGetAccountRolesResult(GetAccountRolesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAccountRolesResult(
            account_roles=self.account_roles,
            id=self.id,
            in_class=self.in_class,
            like=self.like)


def get_account_roles(in_class: Optional[str] = None,
                      like: Optional[str] = None,
                      opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAccountRolesResult:
    """
    Data source used to get details of filtered account roles. Filtering is aligned with the current possibilities for [SHOW ROLES](https://docs.snowflake.com/en/sql-reference/sql/show-roles) query (`like` and `in_class` are all supported). The results of SHOW are encapsulated in one output collection.


    :param str in_class: Filters the SHOW GRANTS output by class name.
    :param str like: Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
    """
    __args__ = dict()
    __args__['inClass'] = in_class
    __args__['like'] = like
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('snowflake:index/getAccountRoles:getAccountRoles', __args__, opts=opts, typ=GetAccountRolesResult).value

    return AwaitableGetAccountRolesResult(
        account_roles=pulumi.get(__ret__, 'account_roles'),
        id=pulumi.get(__ret__, 'id'),
        in_class=pulumi.get(__ret__, 'in_class'),
        like=pulumi.get(__ret__, 'like'))
def get_account_roles_output(in_class: Optional[pulumi.Input[Optional[str]]] = None,
                             like: Optional[pulumi.Input[Optional[str]]] = None,
                             opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetAccountRolesResult]:
    """
    Data source used to get details of filtered account roles. Filtering is aligned with the current possibilities for [SHOW ROLES](https://docs.snowflake.com/en/sql-reference/sql/show-roles) query (`like` and `in_class` are all supported). The results of SHOW are encapsulated in one output collection.


    :param str in_class: Filters the SHOW GRANTS output by class name.
    :param str like: Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
    """
    __args__ = dict()
    __args__['inClass'] = in_class
    __args__['like'] = like
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('snowflake:index/getAccountRoles:getAccountRoles', __args__, opts=opts, typ=GetAccountRolesResult)
    return __ret__.apply(lambda __response__: GetAccountRolesResult(
        account_roles=pulumi.get(__response__, 'account_roles'),
        id=pulumi.get(__response__, 'id'),
        in_class=pulumi.get(__response__, 'in_class'),
        like=pulumi.get(__response__, 'like')))