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
from ._inputs import *

__all__ = [
    'GetStreamlitsResult',
    'AwaitableGetStreamlitsResult',
    'get_streamlits',
    'get_streamlits_output',
]

@pulumi.output_type
class GetStreamlitsResult:
    """
    A collection of values returned by getStreamlits.
    """
    def __init__(__self__, id=None, in_=None, like=None, limit=None, streamlits=None, with_describe=None):
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
        if streamlits and not isinstance(streamlits, list):
            raise TypeError("Expected argument 'streamlits' to be a list")
        pulumi.set(__self__, "streamlits", streamlits)
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
    @pulumi.getter(name="in")
    def in_(self) -> Optional['outputs.GetStreamlitsInResult']:
        """
        IN clause to filter the list of streamlits
        """
        return pulumi.get(self, "in_")

    @property
    @pulumi.getter
    def like(self) -> Optional[str]:
        """
        Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
        """
        return pulumi.get(self, "like")

    @property
    @pulumi.getter
    def limit(self) -> Optional['outputs.GetStreamlitsLimitResult']:
        """
        Limits the number of rows returned. If the `limit.from` is set, then the limit wll start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `starts_with` or `like`.
        """
        return pulumi.get(self, "limit")

    @property
    @pulumi.getter
    def streamlits(self) -> Sequence['outputs.GetStreamlitsStreamlitResult']:
        """
        Holds the aggregated output of all streamlits details queries.
        """
        return pulumi.get(self, "streamlits")

    @property
    @pulumi.getter(name="withDescribe")
    def with_describe(self) -> Optional[bool]:
        """
        Runs DESC STREAMLIT for each streamlit returned by SHOW STREAMLITS. The output of describe is saved to the description field. By default this value is set to true.
        """
        return pulumi.get(self, "with_describe")


class AwaitableGetStreamlitsResult(GetStreamlitsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetStreamlitsResult(
            id=self.id,
            in_=self.in_,
            like=self.like,
            limit=self.limit,
            streamlits=self.streamlits,
            with_describe=self.with_describe)


def get_streamlits(in_: Optional[Union['GetStreamlitsInArgs', 'GetStreamlitsInArgsDict']] = None,
                   like: Optional[str] = None,
                   limit: Optional[Union['GetStreamlitsLimitArgs', 'GetStreamlitsLimitArgsDict']] = None,
                   with_describe: Optional[bool] = None,
                   opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetStreamlitsResult:
    """
    !> **V1 release candidate** This data source was reworked and is a release candidate for the V1. We do not expect significant changes in it before the V1. We will welcome any feedback and adjust the data source if needed. Any errors reported will be resolved with a higher priority. We encourage checking this data source out before the V1 release. Please follow the migration guide to use it.

    Datasource used to get details of filtered streamlits. Filtering is aligned with the current possibilities for [SHOW STREAMLITS](https://docs.snowflake.com/en/sql-reference/sql/show-streamlits) query (only `like` is supported). The results of SHOW and DESCRIBE are encapsulated in one output collection `streamlits`.


    :param Union['GetStreamlitsInArgs', 'GetStreamlitsInArgsDict'] in_: IN clause to filter the list of streamlits
    :param str like: Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
    :param Union['GetStreamlitsLimitArgs', 'GetStreamlitsLimitArgsDict'] limit: Limits the number of rows returned. If the `limit.from` is set, then the limit wll start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `starts_with` or `like`.
    :param bool with_describe: Runs DESC STREAMLIT for each streamlit returned by SHOW STREAMLITS. The output of describe is saved to the description field. By default this value is set to true.
    """
    __args__ = dict()
    __args__['in'] = in_
    __args__['like'] = like
    __args__['limit'] = limit
    __args__['withDescribe'] = with_describe
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('snowflake:index/getStreamlits:getStreamlits', __args__, opts=opts, typ=GetStreamlitsResult).value

    return AwaitableGetStreamlitsResult(
        id=pulumi.get(__ret__, 'id'),
        in_=pulumi.get(__ret__, 'in_'),
        like=pulumi.get(__ret__, 'like'),
        limit=pulumi.get(__ret__, 'limit'),
        streamlits=pulumi.get(__ret__, 'streamlits'),
        with_describe=pulumi.get(__ret__, 'with_describe'))
def get_streamlits_output(in_: Optional[pulumi.Input[Optional[Union['GetStreamlitsInArgs', 'GetStreamlitsInArgsDict']]]] = None,
                          like: Optional[pulumi.Input[Optional[str]]] = None,
                          limit: Optional[pulumi.Input[Optional[Union['GetStreamlitsLimitArgs', 'GetStreamlitsLimitArgsDict']]]] = None,
                          with_describe: Optional[pulumi.Input[Optional[bool]]] = None,
                          opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetStreamlitsResult]:
    """
    !> **V1 release candidate** This data source was reworked and is a release candidate for the V1. We do not expect significant changes in it before the V1. We will welcome any feedback and adjust the data source if needed. Any errors reported will be resolved with a higher priority. We encourage checking this data source out before the V1 release. Please follow the migration guide to use it.

    Datasource used to get details of filtered streamlits. Filtering is aligned with the current possibilities for [SHOW STREAMLITS](https://docs.snowflake.com/en/sql-reference/sql/show-streamlits) query (only `like` is supported). The results of SHOW and DESCRIBE are encapsulated in one output collection `streamlits`.


    :param Union['GetStreamlitsInArgs', 'GetStreamlitsInArgsDict'] in_: IN clause to filter the list of streamlits
    :param str like: Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
    :param Union['GetStreamlitsLimitArgs', 'GetStreamlitsLimitArgsDict'] limit: Limits the number of rows returned. If the `limit.from` is set, then the limit wll start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `starts_with` or `like`.
    :param bool with_describe: Runs DESC STREAMLIT for each streamlit returned by SHOW STREAMLITS. The output of describe is saved to the description field. By default this value is set to true.
    """
    __args__ = dict()
    __args__['in'] = in_
    __args__['like'] = like
    __args__['limit'] = limit
    __args__['withDescribe'] = with_describe
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('snowflake:index/getStreamlits:getStreamlits', __args__, opts=opts, typ=GetStreamlitsResult)
    return __ret__.apply(lambda __response__: GetStreamlitsResult(
        id=pulumi.get(__response__, 'id'),
        in_=pulumi.get(__response__, 'in_'),
        like=pulumi.get(__response__, 'like'),
        limit=pulumi.get(__response__, 'limit'),
        streamlits=pulumi.get(__response__, 'streamlits'),
        with_describe=pulumi.get(__response__, 'with_describe')))
