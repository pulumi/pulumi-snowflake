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
    'GetDatabaseRolesResult',
    'AwaitableGetDatabaseRolesResult',
    'get_database_roles',
    'get_database_roles_output',
]

@pulumi.output_type
class GetDatabaseRolesResult:
    """
    A collection of values returned by getDatabaseRoles.
    """
    def __init__(__self__, database_roles=None, id=None, in_database=None, like=None, limit=None):
        if database_roles and not isinstance(database_roles, list):
            raise TypeError("Expected argument 'database_roles' to be a list")
        pulumi.set(__self__, "database_roles", database_roles)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if in_database and not isinstance(in_database, str):
            raise TypeError("Expected argument 'in_database' to be a str")
        pulumi.set(__self__, "in_database", in_database)
        if like and not isinstance(like, str):
            raise TypeError("Expected argument 'like' to be a str")
        pulumi.set(__self__, "like", like)
        if limit and not isinstance(limit, dict):
            raise TypeError("Expected argument 'limit' to be a dict")
        pulumi.set(__self__, "limit", limit)

    @property
    @pulumi.getter(name="databaseRoles")
    def database_roles(self) -> Sequence['outputs.GetDatabaseRolesDatabaseRoleResult']:
        """
        Holds the aggregated output of all database role details queries.
        """
        return pulumi.get(self, "database_roles")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="inDatabase")
    def in_database(self) -> str:
        """
        The database from which to return the database roles from.
        """
        return pulumi.get(self, "in_database")

    @property
    @pulumi.getter
    def like(self) -> Optional[str]:
        """
        Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
        """
        return pulumi.get(self, "like")

    @property
    @pulumi.getter
    def limit(self) -> Optional['outputs.GetDatabaseRolesLimitResult']:
        """
        Limits the number of rows returned. If the `limit.from` is set, then the limit wll start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `starts_with` or `like`.
        """
        return pulumi.get(self, "limit")


class AwaitableGetDatabaseRolesResult(GetDatabaseRolesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetDatabaseRolesResult(
            database_roles=self.database_roles,
            id=self.id,
            in_database=self.in_database,
            like=self.like,
            limit=self.limit)


def get_database_roles(in_database: Optional[str] = None,
                       like: Optional[str] = None,
                       limit: Optional[Union['GetDatabaseRolesLimitArgs', 'GetDatabaseRolesLimitArgsDict']] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetDatabaseRolesResult:
    """
    !> **V1 release candidate** This data source was reworked and is a release candidate for the V1. We do not expect significant changes in it before the V1. We will welcome any feedback and adjust the data source if needed. Any errors reported will be resolved with a higher priority. We encourage checking this data source out before the V1 release. Please follow the migration guide to use it.

    Datasource used to get details of filtered database roles. Filtering is aligned with the current possibilities for [SHOW DATABASE ROLES](https://docs.snowflake.com/en/sql-reference/sql/show-database-roles) query (`like` and `limit` are supported). The results of SHOW is encapsulated in show_output collection.


    :param str in_database: The database from which to return the database roles from.
    :param str like: Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
    :param Union['GetDatabaseRolesLimitArgs', 'GetDatabaseRolesLimitArgsDict'] limit: Limits the number of rows returned. If the `limit.from` is set, then the limit wll start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `starts_with` or `like`.
    """
    __args__ = dict()
    __args__['inDatabase'] = in_database
    __args__['like'] = like
    __args__['limit'] = limit
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('snowflake:index/getDatabaseRoles:getDatabaseRoles', __args__, opts=opts, typ=GetDatabaseRolesResult).value

    return AwaitableGetDatabaseRolesResult(
        database_roles=pulumi.get(__ret__, 'database_roles'),
        id=pulumi.get(__ret__, 'id'),
        in_database=pulumi.get(__ret__, 'in_database'),
        like=pulumi.get(__ret__, 'like'),
        limit=pulumi.get(__ret__, 'limit'))
def get_database_roles_output(in_database: Optional[pulumi.Input[str]] = None,
                              like: Optional[pulumi.Input[Optional[str]]] = None,
                              limit: Optional[pulumi.Input[Optional[Union['GetDatabaseRolesLimitArgs', 'GetDatabaseRolesLimitArgsDict']]]] = None,
                              opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetDatabaseRolesResult]:
    """
    !> **V1 release candidate** This data source was reworked and is a release candidate for the V1. We do not expect significant changes in it before the V1. We will welcome any feedback and adjust the data source if needed. Any errors reported will be resolved with a higher priority. We encourage checking this data source out before the V1 release. Please follow the migration guide to use it.

    Datasource used to get details of filtered database roles. Filtering is aligned with the current possibilities for [SHOW DATABASE ROLES](https://docs.snowflake.com/en/sql-reference/sql/show-database-roles) query (`like` and `limit` are supported). The results of SHOW is encapsulated in show_output collection.


    :param str in_database: The database from which to return the database roles from.
    :param str like: Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
    :param Union['GetDatabaseRolesLimitArgs', 'GetDatabaseRolesLimitArgsDict'] limit: Limits the number of rows returned. If the `limit.from` is set, then the limit wll start from the first element matched by the expression. The expression is only used to match with the first element, later on the elements are not matched by the prefix, but you can enforce a certain pattern with `starts_with` or `like`.
    """
    __args__ = dict()
    __args__['inDatabase'] = in_database
    __args__['like'] = like
    __args__['limit'] = limit
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('snowflake:index/getDatabaseRoles:getDatabaseRoles', __args__, opts=opts, typ=GetDatabaseRolesResult)
    return __ret__.apply(lambda __response__: GetDatabaseRolesResult(
        database_roles=pulumi.get(__response__, 'database_roles'),
        id=pulumi.get(__response__, 'id'),
        in_database=pulumi.get(__response__, 'in_database'),
        like=pulumi.get(__response__, 'like'),
        limit=pulumi.get(__response__, 'limit')))
