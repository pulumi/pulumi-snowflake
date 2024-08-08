# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = [
    'GetDatabasesResult',
    'AwaitableGetDatabasesResult',
    'get_databases',
    'get_databases_output',
]

@pulumi.output_type
class GetDatabasesResult:
    """
    A collection of values returned by getDatabases.
    """
    def __init__(__self__, databases=None, id=None, like=None, limit=None, starts_with=None, with_describe=None, with_parameters=None):
        if databases and not isinstance(databases, list):
            raise TypeError("Expected argument 'databases' to be a list")
        pulumi.set(__self__, "databases", databases)
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
        if with_describe and not isinstance(with_describe, bool):
            raise TypeError("Expected argument 'with_describe' to be a bool")
        pulumi.set(__self__, "with_describe", with_describe)
        if with_parameters and not isinstance(with_parameters, bool):
            raise TypeError("Expected argument 'with_parameters' to be a bool")
        pulumi.set(__self__, "with_parameters", with_parameters)

    @property
    @pulumi.getter
    def databases(self) -> Sequence['outputs.GetDatabasesDatabaseResult']:
        """
        Holds the aggregated output of all database details queries.
        """
        return pulumi.get(self, "databases")

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
    @pulumi.getter
    def limit(self) -> Optional['outputs.GetDatabasesLimitResult']:
        """
        Limits the number of rows returned. If the `limit.from` is set, then the limit wll start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `starts_with` or `like`.
        """
        return pulumi.get(self, "limit")

    @property
    @pulumi.getter(name="startsWith")
    def starts_with(self) -> Optional[str]:
        """
        Filters the output with **case-sensitive** characters indicating the beginning of the object name.
        """
        return pulumi.get(self, "starts_with")

    @property
    @pulumi.getter(name="withDescribe")
    def with_describe(self) -> Optional[bool]:
        """
        Runs DESC DATABASE for each database returned by SHOW DATABASES. The output of describe is saved to the description field. By default this value is set to true.
        """
        return pulumi.get(self, "with_describe")

    @property
    @pulumi.getter(name="withParameters")
    def with_parameters(self) -> Optional[bool]:
        """
        Runs SHOW PARAMETERS FOR DATABASE for each database returned by SHOW DATABASES. The output of describe is saved to the parameters field as a map. By default this value is set to true.
        """
        return pulumi.get(self, "with_parameters")


class AwaitableGetDatabasesResult(GetDatabasesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetDatabasesResult(
            databases=self.databases,
            id=self.id,
            like=self.like,
            limit=self.limit,
            starts_with=self.starts_with,
            with_describe=self.with_describe,
            with_parameters=self.with_parameters)


def get_databases(like: Optional[str] = None,
                  limit: Optional[Union['GetDatabasesLimitArgs', 'GetDatabasesLimitArgsDict']] = None,
                  starts_with: Optional[str] = None,
                  with_describe: Optional[bool] = None,
                  with_parameters: Optional[bool] = None,
                  opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetDatabasesResult:
    """
    !> **V1 release candidate** This data source was reworked and is a release candidate for the V1. We do not expect significant changes in it before the V1. We will welcome any feedback and adjust the data source if needed. Any errors reported will be resolved with a higher priority. We encourage checking this data source out before the V1 release. Please follow the migration guide to use it.

    Datasource used to get details of filtered databases. Filtering is aligned with the current possibilities for [SHOW DATABASES](https://docs.snowflake.com/en/sql-reference/sql/show-databases) query (`like`, `starts_with`, and `limit` are all supported). The results of SHOW, DESCRIBE, and SHOW PARAMETERS IN are encapsulated in one output collection.


    :param str like: Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
    :param Union['GetDatabasesLimitArgs', 'GetDatabasesLimitArgsDict'] limit: Limits the number of rows returned. If the `limit.from` is set, then the limit wll start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `starts_with` or `like`.
    :param str starts_with: Filters the output with **case-sensitive** characters indicating the beginning of the object name.
    :param bool with_describe: Runs DESC DATABASE for each database returned by SHOW DATABASES. The output of describe is saved to the description field. By default this value is set to true.
    :param bool with_parameters: Runs SHOW PARAMETERS FOR DATABASE for each database returned by SHOW DATABASES. The output of describe is saved to the parameters field as a map. By default this value is set to true.
    """
    __args__ = dict()
    __args__['like'] = like
    __args__['limit'] = limit
    __args__['startsWith'] = starts_with
    __args__['withDescribe'] = with_describe
    __args__['withParameters'] = with_parameters
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('snowflake:index/getDatabases:getDatabases', __args__, opts=opts, typ=GetDatabasesResult).value

    return AwaitableGetDatabasesResult(
        databases=pulumi.get(__ret__, 'databases'),
        id=pulumi.get(__ret__, 'id'),
        like=pulumi.get(__ret__, 'like'),
        limit=pulumi.get(__ret__, 'limit'),
        starts_with=pulumi.get(__ret__, 'starts_with'),
        with_describe=pulumi.get(__ret__, 'with_describe'),
        with_parameters=pulumi.get(__ret__, 'with_parameters'))


@_utilities.lift_output_func(get_databases)
def get_databases_output(like: Optional[pulumi.Input[Optional[str]]] = None,
                         limit: Optional[pulumi.Input[Optional[Union['GetDatabasesLimitArgs', 'GetDatabasesLimitArgsDict']]]] = None,
                         starts_with: Optional[pulumi.Input[Optional[str]]] = None,
                         with_describe: Optional[pulumi.Input[Optional[bool]]] = None,
                         with_parameters: Optional[pulumi.Input[Optional[bool]]] = None,
                         opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetDatabasesResult]:
    """
    !> **V1 release candidate** This data source was reworked and is a release candidate for the V1. We do not expect significant changes in it before the V1. We will welcome any feedback and adjust the data source if needed. Any errors reported will be resolved with a higher priority. We encourage checking this data source out before the V1 release. Please follow the migration guide to use it.

    Datasource used to get details of filtered databases. Filtering is aligned with the current possibilities for [SHOW DATABASES](https://docs.snowflake.com/en/sql-reference/sql/show-databases) query (`like`, `starts_with`, and `limit` are all supported). The results of SHOW, DESCRIBE, and SHOW PARAMETERS IN are encapsulated in one output collection.


    :param str like: Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
    :param Union['GetDatabasesLimitArgs', 'GetDatabasesLimitArgsDict'] limit: Limits the number of rows returned. If the `limit.from` is set, then the limit wll start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `starts_with` or `like`.
    :param str starts_with: Filters the output with **case-sensitive** characters indicating the beginning of the object name.
    :param bool with_describe: Runs DESC DATABASE for each database returned by SHOW DATABASES. The output of describe is saved to the description field. By default this value is set to true.
    :param bool with_parameters: Runs SHOW PARAMETERS FOR DATABASE for each database returned by SHOW DATABASES. The output of describe is saved to the parameters field as a map. By default this value is set to true.
    """
    ...
