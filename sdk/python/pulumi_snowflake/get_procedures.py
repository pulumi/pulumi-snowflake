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
    'GetProceduresResult',
    'AwaitableGetProceduresResult',
    'get_procedures',
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
        return pulumi.get(self, "procedures")

    @property
    @pulumi.getter
    def schema(self) -> str:
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
    Use this data source to access information about an existing resource.
    """
    __args__ = dict()
    __args__['database'] = database
    __args__['schema'] = schema
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('snowflake:index/getProcedures:getProcedures', __args__, opts=opts, typ=GetProceduresResult).value

    return AwaitableGetProceduresResult(
        database=__ret__.database,
        id=__ret__.id,
        procedures=__ret__.procedures,
        schema=__ret__.schema)
