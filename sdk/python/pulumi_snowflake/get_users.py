# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins as _builtins
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
from ._inputs import *

__all__ = [
    'GetUsersResult',
    'AwaitableGetUsersResult',
    'get_users',
    'get_users_output',
]

@pulumi.output_type
class GetUsersResult:
    """
    A collection of values returned by getUsers.
    """
    def __init__(__self__, id=None, like=None, limit=None, starts_with=None, users=None, with_describe=None, with_parameters=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if like and not isinstance(like, str):
            raise TypeError("Expected argument 'like' to be a str")
        pulumi.set(__self__, "like", like)
        if limit and not isinstance(limit, dict):
            raise TypeError("Expected argument 'limit' to be a dict")
        pulumi.set(__self__, "limit", limit)
        if starts_with and not isinstance(starts_with, str):
            raise TypeError("Expected argument 'starts_with' to be a str")
        pulumi.set(__self__, "starts_with", starts_with)
        if users and not isinstance(users, list):
            raise TypeError("Expected argument 'users' to be a list")
        pulumi.set(__self__, "users", users)
        if with_describe and not isinstance(with_describe, bool):
            raise TypeError("Expected argument 'with_describe' to be a bool")
        pulumi.set(__self__, "with_describe", with_describe)
        if with_parameters and not isinstance(with_parameters, bool):
            raise TypeError("Expected argument 'with_parameters' to be a bool")
        pulumi.set(__self__, "with_parameters", with_parameters)

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter
    def like(self) -> Optional[_builtins.str]:
        """
        Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
        """
        return pulumi.get(self, "like")

    @_builtins.property
    @pulumi.getter
    def limit(self) -> Optional['outputs.GetUsersLimitResult']:
        """
        Limits the number of rows returned. If the `limit.from` is set, then the limit will start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `starts_with` or `like`.
        """
        return pulumi.get(self, "limit")

    @_builtins.property
    @pulumi.getter(name="startsWith")
    def starts_with(self) -> Optional[_builtins.str]:
        """
        Filters the output with **case-sensitive** characters indicating the beginning of the object name.
        """
        return pulumi.get(self, "starts_with")

    @_builtins.property
    @pulumi.getter
    def users(self) -> Sequence['outputs.GetUsersUserResult']:
        """
        Holds the aggregated output of all user details queries.
        """
        return pulumi.get(self, "users")

    @_builtins.property
    @pulumi.getter(name="withDescribe")
    def with_describe(self) -> Optional[_builtins.bool]:
        """
        (Default: `true`) Runs DESC USER for each user returned by SHOW USERS. The output of describe is saved to the description field. By default this value is set to true.
        """
        return pulumi.get(self, "with_describe")

    @_builtins.property
    @pulumi.getter(name="withParameters")
    def with_parameters(self) -> Optional[_builtins.bool]:
        """
        (Default: `true`) Runs SHOW PARAMETERS FOR USER for each user returned by SHOW USERS. The output of describe is saved to the parameters field as a map. By default this value is set to true.
        """
        return pulumi.get(self, "with_parameters")


class AwaitableGetUsersResult(GetUsersResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetUsersResult(
            id=self.id,
            like=self.like,
            limit=self.limit,
            starts_with=self.starts_with,
            users=self.users,
            with_describe=self.with_describe,
            with_parameters=self.with_parameters)


def get_users(like: Optional[_builtins.str] = None,
              limit: Optional[Union['GetUsersLimitArgs', 'GetUsersLimitArgsDict']] = None,
              starts_with: Optional[_builtins.str] = None,
              with_describe: Optional[_builtins.bool] = None,
              with_parameters: Optional[_builtins.bool] = None,
              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetUsersResult:
    """
    ## Example Usage


    :param _builtins.str like: Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
    :param Union['GetUsersLimitArgs', 'GetUsersLimitArgsDict'] limit: Limits the number of rows returned. If the `limit.from` is set, then the limit will start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `starts_with` or `like`.
    :param _builtins.str starts_with: Filters the output with **case-sensitive** characters indicating the beginning of the object name.
    :param _builtins.bool with_describe: (Default: `true`) Runs DESC USER for each user returned by SHOW USERS. The output of describe is saved to the description field. By default this value is set to true.
    :param _builtins.bool with_parameters: (Default: `true`) Runs SHOW PARAMETERS FOR USER for each user returned by SHOW USERS. The output of describe is saved to the parameters field as a map. By default this value is set to true.
    """
    __args__ = dict()
    __args__['like'] = like
    __args__['limit'] = limit
    __args__['startsWith'] = starts_with
    __args__['withDescribe'] = with_describe
    __args__['withParameters'] = with_parameters
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('snowflake:index/getUsers:getUsers', __args__, opts=opts, typ=GetUsersResult).value

    return AwaitableGetUsersResult(
        id=pulumi.get(__ret__, 'id'),
        like=pulumi.get(__ret__, 'like'),
        limit=pulumi.get(__ret__, 'limit'),
        starts_with=pulumi.get(__ret__, 'starts_with'),
        users=pulumi.get(__ret__, 'users'),
        with_describe=pulumi.get(__ret__, 'with_describe'),
        with_parameters=pulumi.get(__ret__, 'with_parameters'))
def get_users_output(like: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                     limit: Optional[pulumi.Input[Optional[Union['GetUsersLimitArgs', 'GetUsersLimitArgsDict']]]] = None,
                     starts_with: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                     with_describe: Optional[pulumi.Input[Optional[_builtins.bool]]] = None,
                     with_parameters: Optional[pulumi.Input[Optional[_builtins.bool]]] = None,
                     opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetUsersResult]:
    """
    ## Example Usage


    :param _builtins.str like: Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
    :param Union['GetUsersLimitArgs', 'GetUsersLimitArgsDict'] limit: Limits the number of rows returned. If the `limit.from` is set, then the limit will start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `starts_with` or `like`.
    :param _builtins.str starts_with: Filters the output with **case-sensitive** characters indicating the beginning of the object name.
    :param _builtins.bool with_describe: (Default: `true`) Runs DESC USER for each user returned by SHOW USERS. The output of describe is saved to the description field. By default this value is set to true.
    :param _builtins.bool with_parameters: (Default: `true`) Runs SHOW PARAMETERS FOR USER for each user returned by SHOW USERS. The output of describe is saved to the parameters field as a map. By default this value is set to true.
    """
    __args__ = dict()
    __args__['like'] = like
    __args__['limit'] = limit
    __args__['startsWith'] = starts_with
    __args__['withDescribe'] = with_describe
    __args__['withParameters'] = with_parameters
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('snowflake:index/getUsers:getUsers', __args__, opts=opts, typ=GetUsersResult)
    return __ret__.apply(lambda __response__: GetUsersResult(
        id=pulumi.get(__response__, 'id'),
        like=pulumi.get(__response__, 'like'),
        limit=pulumi.get(__response__, 'limit'),
        starts_with=pulumi.get(__response__, 'starts_with'),
        users=pulumi.get(__response__, 'users'),
        with_describe=pulumi.get(__response__, 'with_describe'),
        with_parameters=pulumi.get(__response__, 'with_parameters')))
