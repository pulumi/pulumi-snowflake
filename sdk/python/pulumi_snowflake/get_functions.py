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
    'GetFunctionsResult',
    'AwaitableGetFunctionsResult',
    'get_functions',
    'get_functions_output',
]

@pulumi.output_type
class GetFunctionsResult:
    """
    A collection of values returned by getFunctions.
    """
    def __init__(__self__, database=None, functions=None, id=None, schema=None):
        if database and not isinstance(database, str):
            raise TypeError("Expected argument 'database' to be a str")
        pulumi.set(__self__, "database", database)
        if functions and not isinstance(functions, list):
            raise TypeError("Expected argument 'functions' to be a list")
        pulumi.set(__self__, "functions", functions)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
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
    def functions(self) -> Sequence['outputs.GetFunctionsFunctionResult']:
        """
        The functions in the schema
        """
        return pulumi.get(self, "functions")

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
        The schema from which to return the functions from.
        """
        return pulumi.get(self, "schema")


class AwaitableGetFunctionsResult(GetFunctionsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetFunctionsResult(
            database=self.database,
            functions=self.functions,
            id=self.id,
            schema=self.schema)


def get_functions(database: Optional[str] = None,
                  schema: Optional[str] = None,
                  opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetFunctionsResult:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_snowflake as snowflake

    current = snowflake.get_functions(database="MYDB",
        schema="MYSCHEMA")
    ```


    :param str database: The database from which to return the schemas from.
    :param str schema: The schema from which to return the functions from.
    """
    __args__ = dict()
    __args__['database'] = database
    __args__['schema'] = schema
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('snowflake:index/getFunctions:getFunctions', __args__, opts=opts, typ=GetFunctionsResult).value

    return AwaitableGetFunctionsResult(
        database=__ret__.database,
        functions=__ret__.functions,
        id=__ret__.id,
        schema=__ret__.schema)


@_utilities.lift_output_func(get_functions)
def get_functions_output(database: Optional[pulumi.Input[str]] = None,
                         schema: Optional[pulumi.Input[str]] = None,
                         opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetFunctionsResult]:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_snowflake as snowflake

    current = snowflake.get_functions(database="MYDB",
        schema="MYSCHEMA")
    ```


    :param str database: The database from which to return the schemas from.
    :param str schema: The schema from which to return the functions from.
    """
    ...
