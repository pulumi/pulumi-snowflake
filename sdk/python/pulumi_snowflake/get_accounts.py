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
    'GetAccountsResult',
    'AwaitableGetAccountsResult',
    'get_accounts',
    'get_accounts_output',
]

@pulumi.output_type
class GetAccountsResult:
    """
    A collection of values returned by getAccounts.
    """
    def __init__(__self__, accounts=None, id=None, pattern=None):
        if accounts and not isinstance(accounts, list):
            raise TypeError("Expected argument 'accounts' to be a list")
        pulumi.set(__self__, "accounts", accounts)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if pattern and not isinstance(pattern, str):
            raise TypeError("Expected argument 'pattern' to be a str")
        pulumi.set(__self__, "pattern", pattern)

    @property
    @pulumi.getter
    def accounts(self) -> Sequence['outputs.GetAccountsAccountResult']:
        """
        List of all the accounts available in the organization.
        """
        return pulumi.get(self, "accounts")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def pattern(self) -> Optional[str]:
        """
        Specifies an account name pattern. If a pattern is specified, only accounts matching the pattern are returned.
        """
        return pulumi.get(self, "pattern")


class AwaitableGetAccountsResult(GetAccountsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAccountsResult(
            accounts=self.accounts,
            id=self.id,
            pattern=self.pattern)


def get_accounts(pattern: Optional[str] = None,
                 opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAccountsResult:
    """
    Use this data source to access information about an existing resource.

    :param str pattern: Specifies an account name pattern. If a pattern is specified, only accounts matching the pattern are returned.
    """
    __args__ = dict()
    __args__['pattern'] = pattern
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('snowflake:index/getAccounts:getAccounts', __args__, opts=opts, typ=GetAccountsResult).value

    return AwaitableGetAccountsResult(
        accounts=pulumi.get(__ret__, 'accounts'),
        id=pulumi.get(__ret__, 'id'),
        pattern=pulumi.get(__ret__, 'pattern'))
def get_accounts_output(pattern: Optional[pulumi.Input[Optional[str]]] = None,
                        opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetAccountsResult]:
    """
    Use this data source to access information about an existing resource.

    :param str pattern: Specifies an account name pattern. If a pattern is specified, only accounts matching the pattern are returned.
    """
    __args__ = dict()
    __args__['pattern'] = pattern
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('snowflake:index/getAccounts:getAccounts', __args__, opts=opts, typ=GetAccountsResult)
    return __ret__.apply(lambda __response__: GetAccountsResult(
        accounts=pulumi.get(__response__, 'accounts'),
        id=pulumi.get(__response__, 'id'),
        pattern=pulumi.get(__response__, 'pattern')))
