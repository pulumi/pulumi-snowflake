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
from . import outputs
from ._inputs import *

__all__ = [
    'GetRowAccessPoliciesResult',
    'AwaitableGetRowAccessPoliciesResult',
    'get_row_access_policies',
    'get_row_access_policies_output',
]

@pulumi.output_type
class GetRowAccessPoliciesResult:
    """
    A collection of values returned by getRowAccessPolicies.
    """
    def __init__(__self__, id=None, in_=None, like=None, limit=None, row_access_policies=None, with_describe=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if in_ and not isinstance(in_, dict):
            raise TypeError("Expected argument 'in_' to be a dict")
        pulumi.set(__self__, "in_", in_)
        if like and not isinstance(like, str):
            raise TypeError("Expected argument 'like' to be a str")
        pulumi.set(__self__, "like", like)
        if limit and not isinstance(limit, dict):
            raise TypeError("Expected argument 'limit' to be a dict")
        pulumi.set(__self__, "limit", limit)
        if row_access_policies and not isinstance(row_access_policies, list):
            raise TypeError("Expected argument 'row_access_policies' to be a list")
        pulumi.set(__self__, "row_access_policies", row_access_policies)
        if with_describe and not isinstance(with_describe, bool):
            raise TypeError("Expected argument 'with_describe' to be a bool")
        pulumi.set(__self__, "with_describe", with_describe)

    @property
    @pulumi.getter
    def id(self) -> builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="in")
    def in_(self) -> Optional['outputs.GetRowAccessPoliciesInResult']:
        """
        IN clause to filter the list of row access policies
        """
        return pulumi.get(self, "in_")

    @property
    @pulumi.getter
    def like(self) -> Optional[builtins.str]:
        """
        Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
        """
        return pulumi.get(self, "like")

    @property
    @pulumi.getter
    def limit(self) -> Optional['outputs.GetRowAccessPoliciesLimitResult']:
        """
        Limits the number of rows returned. If the `limit.from` is set, then the limit wll start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `starts_with` or `like`.
        """
        return pulumi.get(self, "limit")

    @property
    @pulumi.getter(name="rowAccessPolicies")
    def row_access_policies(self) -> Sequence['outputs.GetRowAccessPoliciesRowAccessPolicyResult']:
        """
        Holds the aggregated output of all views details queries.
        """
        return pulumi.get(self, "row_access_policies")

    @property
    @pulumi.getter(name="withDescribe")
    def with_describe(self) -> Optional[builtins.bool]:
        """
        (Default: `true`) Runs DESC ROW ACCESS POLICY for each row access policy returned by SHOW ROW ACCESS POLICIES. The output of describe is saved to the description field. By default this value is set to true.
        """
        return pulumi.get(self, "with_describe")


class AwaitableGetRowAccessPoliciesResult(GetRowAccessPoliciesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetRowAccessPoliciesResult(
            id=self.id,
            in_=self.in_,
            like=self.like,
            limit=self.limit,
            row_access_policies=self.row_access_policies,
            with_describe=self.with_describe)


def get_row_access_policies(in_: Optional[Union['GetRowAccessPoliciesInArgs', 'GetRowAccessPoliciesInArgsDict']] = None,
                            like: Optional[builtins.str] = None,
                            limit: Optional[Union['GetRowAccessPoliciesLimitArgs', 'GetRowAccessPoliciesLimitArgsDict']] = None,
                            with_describe: Optional[builtins.bool] = None,
                            opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetRowAccessPoliciesResult:
    """
    Data source used to get details of filtered row access policies. Filtering is aligned with the current possibilities for [SHOW ROW ACCESS POLICIES](https://docs.snowflake.com/en/sql-reference/sql/show-row-access-policies) query. The results of SHOW and DESCRIBE are encapsulated in one output collection `row_access_policies`.


    :param Union['GetRowAccessPoliciesInArgs', 'GetRowAccessPoliciesInArgsDict'] in_: IN clause to filter the list of row access policies
    :param builtins.str like: Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
    :param Union['GetRowAccessPoliciesLimitArgs', 'GetRowAccessPoliciesLimitArgsDict'] limit: Limits the number of rows returned. If the `limit.from` is set, then the limit wll start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `starts_with` or `like`.
    :param builtins.bool with_describe: (Default: `true`) Runs DESC ROW ACCESS POLICY for each row access policy returned by SHOW ROW ACCESS POLICIES. The output of describe is saved to the description field. By default this value is set to true.
    """
    __args__ = dict()
    __args__['in'] = in_
    __args__['like'] = like
    __args__['limit'] = limit
    __args__['withDescribe'] = with_describe
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('snowflake:index/getRowAccessPolicies:getRowAccessPolicies', __args__, opts=opts, typ=GetRowAccessPoliciesResult).value

    return AwaitableGetRowAccessPoliciesResult(
        id=pulumi.get(__ret__, 'id'),
        in_=pulumi.get(__ret__, 'in_'),
        like=pulumi.get(__ret__, 'like'),
        limit=pulumi.get(__ret__, 'limit'),
        row_access_policies=pulumi.get(__ret__, 'row_access_policies'),
        with_describe=pulumi.get(__ret__, 'with_describe'))
def get_row_access_policies_output(in_: Optional[pulumi.Input[Optional[Union['GetRowAccessPoliciesInArgs', 'GetRowAccessPoliciesInArgsDict']]]] = None,
                                   like: Optional[pulumi.Input[Optional[builtins.str]]] = None,
                                   limit: Optional[pulumi.Input[Optional[Union['GetRowAccessPoliciesLimitArgs', 'GetRowAccessPoliciesLimitArgsDict']]]] = None,
                                   with_describe: Optional[pulumi.Input[Optional[builtins.bool]]] = None,
                                   opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetRowAccessPoliciesResult]:
    """
    Data source used to get details of filtered row access policies. Filtering is aligned with the current possibilities for [SHOW ROW ACCESS POLICIES](https://docs.snowflake.com/en/sql-reference/sql/show-row-access-policies) query. The results of SHOW and DESCRIBE are encapsulated in one output collection `row_access_policies`.


    :param Union['GetRowAccessPoliciesInArgs', 'GetRowAccessPoliciesInArgsDict'] in_: IN clause to filter the list of row access policies
    :param builtins.str like: Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
    :param Union['GetRowAccessPoliciesLimitArgs', 'GetRowAccessPoliciesLimitArgsDict'] limit: Limits the number of rows returned. If the `limit.from` is set, then the limit wll start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `starts_with` or `like`.
    :param builtins.bool with_describe: (Default: `true`) Runs DESC ROW ACCESS POLICY for each row access policy returned by SHOW ROW ACCESS POLICIES. The output of describe is saved to the description field. By default this value is set to true.
    """
    __args__ = dict()
    __args__['in'] = in_
    __args__['like'] = like
    __args__['limit'] = limit
    __args__['withDescribe'] = with_describe
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('snowflake:index/getRowAccessPolicies:getRowAccessPolicies', __args__, opts=opts, typ=GetRowAccessPoliciesResult)
    return __ret__.apply(lambda __response__: GetRowAccessPoliciesResult(
        id=pulumi.get(__response__, 'id'),
        in_=pulumi.get(__response__, 'in_'),
        like=pulumi.get(__response__, 'like'),
        limit=pulumi.get(__response__, 'limit'),
        row_access_policies=pulumi.get(__response__, 'row_access_policies'),
        with_describe=pulumi.get(__response__, 'with_describe')))
