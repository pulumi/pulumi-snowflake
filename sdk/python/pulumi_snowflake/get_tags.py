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
    'GetTagsResult',
    'AwaitableGetTagsResult',
    'get_tags',
    'get_tags_output',
]

@pulumi.output_type
class GetTagsResult:
    """
    A collection of values returned by getTags.
    """
    def __init__(__self__, id=None, in_=None, like=None, tags=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if in_ and not isinstance(in_, dict):
            raise TypeError("Expected argument 'in_' to be a dict")
        pulumi.set(__self__, "in_", in_)
        if like and not isinstance(like, str):
            raise TypeError("Expected argument 'like' to be a str")
        pulumi.set(__self__, "like", like)
        if tags and not isinstance(tags, list):
            raise TypeError("Expected argument 'tags' to be a list")
        pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter
    def id(self) -> builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="in")
    def in_(self) -> Optional['outputs.GetTagsInResult']:
        """
        IN clause to filter the list of objects
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
    def tags(self) -> Sequence['outputs.GetTagsTagResult']:
        """
        Holds the aggregated output of all tags details queries.
        """
        return pulumi.get(self, "tags")


class AwaitableGetTagsResult(GetTagsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetTagsResult(
            id=self.id,
            in_=self.in_,
            like=self.like,
            tags=self.tags)


def get_tags(in_: Optional[Union['GetTagsInArgs', 'GetTagsInArgsDict']] = None,
             like: Optional[builtins.str] = None,
             opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetTagsResult:
    """
    Data source used to get details of filtered tags. Filtering is aligned with the current possibilities for [SHOW TAGS](https://docs.snowflake.com/en/sql-reference/sql/show-tags) query. The results of SHOW are encapsulated in one output collection `tags`.


    :param Union['GetTagsInArgs', 'GetTagsInArgsDict'] in_: IN clause to filter the list of objects
    :param builtins.str like: Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
    """
    __args__ = dict()
    __args__['in'] = in_
    __args__['like'] = like
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('snowflake:index/getTags:getTags', __args__, opts=opts, typ=GetTagsResult).value

    return AwaitableGetTagsResult(
        id=pulumi.get(__ret__, 'id'),
        in_=pulumi.get(__ret__, 'in_'),
        like=pulumi.get(__ret__, 'like'),
        tags=pulumi.get(__ret__, 'tags'))
def get_tags_output(in_: Optional[pulumi.Input[Optional[Union['GetTagsInArgs', 'GetTagsInArgsDict']]]] = None,
                    like: Optional[pulumi.Input[Optional[builtins.str]]] = None,
                    opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetTagsResult]:
    """
    Data source used to get details of filtered tags. Filtering is aligned with the current possibilities for [SHOW TAGS](https://docs.snowflake.com/en/sql-reference/sql/show-tags) query. The results of SHOW are encapsulated in one output collection `tags`.


    :param Union['GetTagsInArgs', 'GetTagsInArgsDict'] in_: IN clause to filter the list of objects
    :param builtins.str like: Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
    """
    __args__ = dict()
    __args__['in'] = in_
    __args__['like'] = like
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('snowflake:index/getTags:getTags', __args__, opts=opts, typ=GetTagsResult)
    return __ret__.apply(lambda __response__: GetTagsResult(
        id=pulumi.get(__response__, 'id'),
        in_=pulumi.get(__response__, 'in_'),
        like=pulumi.get(__response__, 'like'),
        tags=pulumi.get(__response__, 'tags')))
