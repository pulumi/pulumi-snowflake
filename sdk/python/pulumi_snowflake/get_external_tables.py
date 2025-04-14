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

__all__ = [
    'GetExternalTablesResult',
    'AwaitableGetExternalTablesResult',
    'get_external_tables',
    'get_external_tables_output',
]

@pulumi.output_type
class GetExternalTablesResult:
    """
    A collection of values returned by getExternalTables.
    """
    def __init__(__self__, database=None, external_tables=None, id=None, schema=None):
        if database and not isinstance(database, str):
            raise TypeError("Expected argument 'database' to be a str")
        pulumi.set(__self__, "database", database)
        if external_tables and not isinstance(external_tables, list):
            raise TypeError("Expected argument 'external_tables' to be a list")
        pulumi.set(__self__, "external_tables", external_tables)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if schema and not isinstance(schema, str):
            raise TypeError("Expected argument 'schema' to be a str")
        pulumi.set(__self__, "schema", schema)

    @property
    @pulumi.getter
    def database(self) -> builtins.str:
        """
        The database from which to return the schemas from.
        """
        return pulumi.get(self, "database")

    @property
    @pulumi.getter(name="externalTables")
    def external_tables(self) -> Sequence['outputs.GetExternalTablesExternalTableResult']:
        """
        The external tables in the schema
        """
        return pulumi.get(self, "external_tables")

    @property
    @pulumi.getter
    def id(self) -> builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def schema(self) -> builtins.str:
        """
        The schema from which to return the external tables from.
        """
        return pulumi.get(self, "schema")


class AwaitableGetExternalTablesResult(GetExternalTablesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetExternalTablesResult(
            database=self.database,
            external_tables=self.external_tables,
            id=self.id,
            schema=self.schema)


def get_external_tables(database: Optional[builtins.str] = None,
                        schema: Optional[builtins.str] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetExternalTablesResult:
    """
    !> **Caution: Preview Feature** This feature is considered a preview feature in the provider, regardless of the state of the resource in Snowflake. We do not guarantee its stability. It will be reworked and marked as a stable feature in future releases. Breaking changes are expected, even without bumping the major version. To use this feature, add the relevant feature name to `preview_features_enabled` field in the provider configuration. Please always refer to the Getting Help section in our Github repo to best determine how to get help for your questions.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_snowflake as snowflake

    current = snowflake.get_external_tables(database="MYDB",
        schema="MYSCHEMA")
    ```

    > **Note** If a field has a default value, it is shown next to the type in the schema.


    :param builtins.str database: The database from which to return the schemas from.
    :param builtins.str schema: The schema from which to return the external tables from.
    """
    __args__ = dict()
    __args__['database'] = database
    __args__['schema'] = schema
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('snowflake:index/getExternalTables:getExternalTables', __args__, opts=opts, typ=GetExternalTablesResult).value

    return AwaitableGetExternalTablesResult(
        database=pulumi.get(__ret__, 'database'),
        external_tables=pulumi.get(__ret__, 'external_tables'),
        id=pulumi.get(__ret__, 'id'),
        schema=pulumi.get(__ret__, 'schema'))
def get_external_tables_output(database: Optional[pulumi.Input[builtins.str]] = None,
                               schema: Optional[pulumi.Input[builtins.str]] = None,
                               opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetExternalTablesResult]:
    """
    !> **Caution: Preview Feature** This feature is considered a preview feature in the provider, regardless of the state of the resource in Snowflake. We do not guarantee its stability. It will be reworked and marked as a stable feature in future releases. Breaking changes are expected, even without bumping the major version. To use this feature, add the relevant feature name to `preview_features_enabled` field in the provider configuration. Please always refer to the Getting Help section in our Github repo to best determine how to get help for your questions.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_snowflake as snowflake

    current = snowflake.get_external_tables(database="MYDB",
        schema="MYSCHEMA")
    ```

    > **Note** If a field has a default value, it is shown next to the type in the schema.


    :param builtins.str database: The database from which to return the schemas from.
    :param builtins.str schema: The schema from which to return the external tables from.
    """
    __args__ = dict()
    __args__['database'] = database
    __args__['schema'] = schema
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('snowflake:index/getExternalTables:getExternalTables', __args__, opts=opts, typ=GetExternalTablesResult)
    return __ret__.apply(lambda __response__: GetExternalTablesResult(
        database=pulumi.get(__response__, 'database'),
        external_tables=pulumi.get(__response__, 'external_tables'),
        id=pulumi.get(__response__, 'id'),
        schema=pulumi.get(__response__, 'schema')))
