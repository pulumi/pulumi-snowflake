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

__all__ = [
    'GetDatabaseRoleResult',
    'AwaitableGetDatabaseRoleResult',
    'get_database_role',
    'get_database_role_output',
]

@pulumi.output_type
class GetDatabaseRoleResult:
    """
    A collection of values returned by getDatabaseRole.
    """
    def __init__(__self__, comment=None, database=None, id=None, name=None, owner=None):
        if comment and not isinstance(comment, str):
            raise TypeError("Expected argument 'comment' to be a str")
        pulumi.set(__self__, "comment", comment)
        if database and not isinstance(database, str):
            raise TypeError("Expected argument 'database' to be a str")
        pulumi.set(__self__, "database", database)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if owner and not isinstance(owner, str):
            raise TypeError("Expected argument 'owner' to be a str")
        pulumi.set(__self__, "owner", owner)

    @_builtins.property
    @pulumi.getter
    def comment(self) -> _builtins.str:
        """
        The comment on the role
        """
        return pulumi.get(self, "comment")

    @_builtins.property
    @pulumi.getter
    def database(self) -> _builtins.str:
        """
        The database from which to return the database role from.
        """
        return pulumi.get(self, "database")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter
    def name(self) -> _builtins.str:
        """
        Database role name.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter
    def owner(self) -> _builtins.str:
        """
        The owner of the role
        """
        return pulumi.get(self, "owner")


class AwaitableGetDatabaseRoleResult(GetDatabaseRoleResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetDatabaseRoleResult(
            comment=self.comment,
            database=self.database,
            id=self.id,
            name=self.name,
            owner=self.owner)


def get_database_role(database: Optional[_builtins.str] = None,
                      name: Optional[_builtins.str] = None,
                      opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetDatabaseRoleResult:
    """
    !> **Caution: Preview Feature** This feature is considered a preview feature in the provider, regardless of the state of the resource in Snowflake. We do not guarantee its stability. It will be reworked and marked as a stable feature in future releases. Breaking changes are expected, even without bumping the major version. To use this feature, add the relevant feature name to `preview_features_enabled` field in the provider configuration. Please always refer to the Getting Help section in our Github repo to best determine how to get help for your questions.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_snowflake as snowflake

    db_role = snowflake.get_database_role(database="MYDB",
        name="DBROLE")
    ```

    > **Note** If a field has a default value, it is shown next to the type in the schema.


    :param _builtins.str database: The database from which to return the database role from.
    :param _builtins.str name: Database role name.
    """
    __args__ = dict()
    __args__['database'] = database
    __args__['name'] = name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('snowflake:index/getDatabaseRole:getDatabaseRole', __args__, opts=opts, typ=GetDatabaseRoleResult).value

    return AwaitableGetDatabaseRoleResult(
        comment=pulumi.get(__ret__, 'comment'),
        database=pulumi.get(__ret__, 'database'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        owner=pulumi.get(__ret__, 'owner'))
def get_database_role_output(database: Optional[pulumi.Input[_builtins.str]] = None,
                             name: Optional[pulumi.Input[_builtins.str]] = None,
                             opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetDatabaseRoleResult]:
    """
    !> **Caution: Preview Feature** This feature is considered a preview feature in the provider, regardless of the state of the resource in Snowflake. We do not guarantee its stability. It will be reworked and marked as a stable feature in future releases. Breaking changes are expected, even without bumping the major version. To use this feature, add the relevant feature name to `preview_features_enabled` field in the provider configuration. Please always refer to the Getting Help section in our Github repo to best determine how to get help for your questions.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_snowflake as snowflake

    db_role = snowflake.get_database_role(database="MYDB",
        name="DBROLE")
    ```

    > **Note** If a field has a default value, it is shown next to the type in the schema.


    :param _builtins.str database: The database from which to return the database role from.
    :param _builtins.str name: Database role name.
    """
    __args__ = dict()
    __args__['database'] = database
    __args__['name'] = name
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('snowflake:index/getDatabaseRole:getDatabaseRole', __args__, opts=opts, typ=GetDatabaseRoleResult)
    return __ret__.apply(lambda __response__: GetDatabaseRoleResult(
        comment=pulumi.get(__response__, 'comment'),
        database=pulumi.get(__response__, 'database'),
        id=pulumi.get(__response__, 'id'),
        name=pulumi.get(__response__, 'name'),
        owner=pulumi.get(__response__, 'owner')))
