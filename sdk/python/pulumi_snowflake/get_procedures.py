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

__all__ = [
    'GetProceduresResult',
    'AwaitableGetProceduresResult',
    'get_procedures',
    'get_procedures_output',
]

@pulumi.output_type
class GetProceduresResult:
    """
    A collection of values returned by getProcedures.
    """
    def __init__(__self__, database=None, id=None, procedures=None, schema=None):
        if database and not isinstance(database, str):
            raise TypeError("Expected argument 'database' to be a str")
        pulumi.set(__self__, "database", database)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if procedures and not isinstance(procedures, list):
            raise TypeError("Expected argument 'procedures' to be a list")
        pulumi.set(__self__, "procedures", procedures)
        if schema and not isinstance(schema, str):
            raise TypeError("Expected argument 'schema' to be a str")
        pulumi.set(__self__, "schema", schema)

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
    def procedures(self) -> Sequence['outputs.GetProceduresProcedureResult']:
        """
        The procedures in the schema
        """
        return pulumi.get(self, "procedures")

    @property
    @pulumi.getter
    def schema(self) -> str:
        """
        The schema from which to return the procedures from.
        """
        return pulumi.get(self, "schema")


class AwaitableGetProceduresResult(GetProceduresResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetProceduresResult(
            database=self.database,
            id=self.id,
            procedures=self.procedures,
            schema=self.schema)


def get_procedures(database: Optional[str] = None,
                   schema: Optional[str] = None,
                   opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetProceduresResult:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_snowflake as snowflake

    current = snowflake.get_procedures(database="MYDB",
        schema="MYSCHEMA")
    ```


    :param str database: The database from which to return the schemas from.
    :param str schema: The schema from which to return the procedures from.
    """
    __args__ = dict()
    __args__['database'] = database
    __args__['schema'] = schema
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('snowflake:index/getProcedures:getProcedures', __args__, opts=opts, typ=GetProceduresResult).value

    return AwaitableGetProceduresResult(
        database=pulumi.get(__ret__, 'database'),
        id=pulumi.get(__ret__, 'id'),
        procedures=pulumi.get(__ret__, 'procedures'),
        schema=pulumi.get(__ret__, 'schema'))
def get_procedures_output(database: Optional[pulumi.Input[str]] = None,
                          schema: Optional[pulumi.Input[str]] = None,
                          opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetProceduresResult]:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_snowflake as snowflake

    current = snowflake.get_procedures(database="MYDB",
        schema="MYSCHEMA")
    ```


    :param str database: The database from which to return the schemas from.
    :param str schema: The schema from which to return the procedures from.
    """
    __args__ = dict()
    __args__['database'] = database
    __args__['schema'] = schema
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('snowflake:index/getProcedures:getProcedures', __args__, opts=opts, typ=GetProceduresResult)
    return __ret__.apply(lambda __response__: GetProceduresResult(
        database=pulumi.get(__response__, 'database'),
        id=pulumi.get(__response__, 'id'),
        procedures=pulumi.get(__response__, 'procedures'),
        schema=pulumi.get(__response__, 'schema')))
