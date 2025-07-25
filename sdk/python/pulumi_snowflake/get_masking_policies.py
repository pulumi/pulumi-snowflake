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
    'GetMaskingPoliciesResult',
    'AwaitableGetMaskingPoliciesResult',
    'get_masking_policies',
    'get_masking_policies_output',
]

@pulumi.output_type
class GetMaskingPoliciesResult:
    """
    A collection of values returned by getMaskingPolicies.
    """
    def __init__(__self__, id=None, in_=None, like=None, limit=None, masking_policies=None, with_describe=None):
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
        if masking_policies and not isinstance(masking_policies, list):
            raise TypeError("Expected argument 'masking_policies' to be a list")
        pulumi.set(__self__, "masking_policies", masking_policies)
        if with_describe and not isinstance(with_describe, bool):
            raise TypeError("Expected argument 'with_describe' to be a bool")
        pulumi.set(__self__, "with_describe", with_describe)

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter(name="in")
    def in_(self) -> Optional['outputs.GetMaskingPoliciesInResult']:
        """
        IN clause to filter the list of masking policies
        """
        return pulumi.get(self, "in_")

    @_builtins.property
    @pulumi.getter
    def like(self) -> Optional[_builtins.str]:
        """
        Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
        """
        return pulumi.get(self, "like")

    @_builtins.property
    @pulumi.getter
    def limit(self) -> Optional['outputs.GetMaskingPoliciesLimitResult']:
        """
        Limits the number of rows returned. If the `limit.from` is set, then the limit will start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `starts_with` or `like`.
        """
        return pulumi.get(self, "limit")

    @_builtins.property
    @pulumi.getter(name="maskingPolicies")
    def masking_policies(self) -> Sequence['outputs.GetMaskingPoliciesMaskingPolicyResult']:
        """
        Holds the aggregated output of all views details queries.
        """
        return pulumi.get(self, "masking_policies")

    @_builtins.property
    @pulumi.getter(name="withDescribe")
    def with_describe(self) -> Optional[_builtins.bool]:
        """
        (Default: `true`) Runs DESC MASKING POLICY for each masking policy returned by SHOW MASKING POLICIES. The output of describe is saved to the description field. By default this value is set to true.
        """
        return pulumi.get(self, "with_describe")


class AwaitableGetMaskingPoliciesResult(GetMaskingPoliciesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetMaskingPoliciesResult(
            id=self.id,
            in_=self.in_,
            like=self.like,
            limit=self.limit,
            masking_policies=self.masking_policies,
            with_describe=self.with_describe)


def get_masking_policies(in_: Optional[Union['GetMaskingPoliciesInArgs', 'GetMaskingPoliciesInArgsDict']] = None,
                         like: Optional[_builtins.str] = None,
                         limit: Optional[Union['GetMaskingPoliciesLimitArgs', 'GetMaskingPoliciesLimitArgsDict']] = None,
                         with_describe: Optional[_builtins.bool] = None,
                         opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetMaskingPoliciesResult:
    """
    !> **Sensitive values** This data source's `describe_output.body` field is not marked as sensitive in the provider. Ensure that no personal data, sensitive data, export-controlled data, or other regulated data is entered as metadata when using the provider. If you use one of these fields, they may be present in logs, so ensure that the provider logs are properly restricted. For more information, see Sensitive values limitations and [Metadata fields in Snowflake](https://docs.snowflake.com/en/sql-reference/metadata).

    Data source used to get details of filtered masking policies. Filtering is aligned with the current possibilities for [SHOW MASKING POLICIES](https://docs.snowflake.com/en/sql-reference/sql/show-masking-policies) query. The results of SHOW and DESCRIBE are encapsulated in one output collection `masking_policies`.


    :param Union['GetMaskingPoliciesInArgs', 'GetMaskingPoliciesInArgsDict'] in_: IN clause to filter the list of masking policies
    :param _builtins.str like: Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
    :param Union['GetMaskingPoliciesLimitArgs', 'GetMaskingPoliciesLimitArgsDict'] limit: Limits the number of rows returned. If the `limit.from` is set, then the limit will start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `starts_with` or `like`.
    :param _builtins.bool with_describe: (Default: `true`) Runs DESC MASKING POLICY for each masking policy returned by SHOW MASKING POLICIES. The output of describe is saved to the description field. By default this value is set to true.
    """
    __args__ = dict()
    __args__['in'] = in_
    __args__['like'] = like
    __args__['limit'] = limit
    __args__['withDescribe'] = with_describe
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('snowflake:index/getMaskingPolicies:getMaskingPolicies', __args__, opts=opts, typ=GetMaskingPoliciesResult).value

    return AwaitableGetMaskingPoliciesResult(
        id=pulumi.get(__ret__, 'id'),
        in_=pulumi.get(__ret__, 'in_'),
        like=pulumi.get(__ret__, 'like'),
        limit=pulumi.get(__ret__, 'limit'),
        masking_policies=pulumi.get(__ret__, 'masking_policies'),
        with_describe=pulumi.get(__ret__, 'with_describe'))
def get_masking_policies_output(in_: Optional[pulumi.Input[Optional[Union['GetMaskingPoliciesInArgs', 'GetMaskingPoliciesInArgsDict']]]] = None,
                                like: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                                limit: Optional[pulumi.Input[Optional[Union['GetMaskingPoliciesLimitArgs', 'GetMaskingPoliciesLimitArgsDict']]]] = None,
                                with_describe: Optional[pulumi.Input[Optional[_builtins.bool]]] = None,
                                opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetMaskingPoliciesResult]:
    """
    !> **Sensitive values** This data source's `describe_output.body` field is not marked as sensitive in the provider. Ensure that no personal data, sensitive data, export-controlled data, or other regulated data is entered as metadata when using the provider. If you use one of these fields, they may be present in logs, so ensure that the provider logs are properly restricted. For more information, see Sensitive values limitations and [Metadata fields in Snowflake](https://docs.snowflake.com/en/sql-reference/metadata).

    Data source used to get details of filtered masking policies. Filtering is aligned with the current possibilities for [SHOW MASKING POLICIES](https://docs.snowflake.com/en/sql-reference/sql/show-masking-policies) query. The results of SHOW and DESCRIBE are encapsulated in one output collection `masking_policies`.


    :param Union['GetMaskingPoliciesInArgs', 'GetMaskingPoliciesInArgsDict'] in_: IN clause to filter the list of masking policies
    :param _builtins.str like: Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
    :param Union['GetMaskingPoliciesLimitArgs', 'GetMaskingPoliciesLimitArgsDict'] limit: Limits the number of rows returned. If the `limit.from` is set, then the limit will start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `starts_with` or `like`.
    :param _builtins.bool with_describe: (Default: `true`) Runs DESC MASKING POLICY for each masking policy returned by SHOW MASKING POLICIES. The output of describe is saved to the description field. By default this value is set to true.
    """
    __args__ = dict()
    __args__['in'] = in_
    __args__['like'] = like
    __args__['limit'] = limit
    __args__['withDescribe'] = with_describe
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('snowflake:index/getMaskingPolicies:getMaskingPolicies', __args__, opts=opts, typ=GetMaskingPoliciesResult)
    return __ret__.apply(lambda __response__: GetMaskingPoliciesResult(
        id=pulumi.get(__response__, 'id'),
        in_=pulumi.get(__response__, 'in_'),
        like=pulumi.get(__response__, 'like'),
        limit=pulumi.get(__response__, 'limit'),
        masking_policies=pulumi.get(__response__, 'masking_policies'),
        with_describe=pulumi.get(__response__, 'with_describe')))
