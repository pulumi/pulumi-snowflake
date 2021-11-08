# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs

__all__ = [
    'GetTablesResult',
    'AwaitableGetTablesResult',
    'get_tables',
    'get_tables_output',
]

@pulumi.output_type
class GetTablesResult:
    """
    A collection of values returned by getTables.
    """
    def __init__(__self__, database=None, id=None, schema=None, tables=None):
        if database and not isinstance(database, str):
            raise TypeError("Expected argument 'database' to be a str")
        pulumi.set(__self__, "database", database)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if schema and not isinstance(schema, str):
            raise TypeError("Expected argument 'schema' to be a str")
        pulumi.set(__self__, "schema", schema)
        if tables and not isinstance(tables, list):
            raise TypeError("Expected argument 'tables' to be a list")
        pulumi.set(__self__, "tables", tables)

    @property
    @pulumi.getter
    def database(self) -> str:
        """
        The database from which to return the schemas from.
        """
        return pulumi.get(self, "database")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def schema(self) -> str:
        """
        The schema from which to return the tables from.
        """
        return pulumi.get(self, "schema")

    @property
    @pulumi.getter
    def tables(self) -> Sequence['outputs.GetTablesTableResult']:
        """
        The tables in the schema
        """
        return pulumi.get(self, "tables")


class AwaitableGetTablesResult(GetTablesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetTablesResult(
            database=self.database,
            id=self.id,
            schema=self.schema,
            tables=self.tables)


def get_tables(database: Optional[str] = None,
               schema: Optional[str] = None,
               opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetTablesResult:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_snowflake as snowflake

    current = snowflake.get_tables(database="MYDB",
        schema="MYSCHEMA")
    ```


    :param str database: The database from which to return the schemas from.
    :param str schema: The schema from which to return the tables from.
    """
    __args__ = dict()
    __args__['database'] = database
    __args__['schema'] = schema
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('snowflake:index/getTables:getTables', __args__, opts=opts, typ=GetTablesResult).value

    return AwaitableGetTablesResult(
        database=__ret__.database,
        id=__ret__.id,
        schema=__ret__.schema,
        tables=__ret__.tables)


@_utilities.lift_output_func(get_tables)
def get_tables_output(database: Optional[pulumi.Input[str]] = None,
                      schema: Optional[pulumi.Input[str]] = None,
                      opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetTablesResult]:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_snowflake as snowflake

    current = snowflake.get_tables(database="MYDB",
        schema="MYSCHEMA")
    ```


    :param str database: The database from which to return the schemas from.
    :param str schema: The schema from which to return the tables from.
    """
    ...
