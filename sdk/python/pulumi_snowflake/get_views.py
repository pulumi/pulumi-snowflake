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

__all__ = [
    'GetViewsResult',
    'AwaitableGetViewsResult',
    'get_views',
    'get_views_output',
]

@pulumi.output_type
class GetViewsResult:
    """
    A collection of values returned by getViews.
    """
    def __init__(__self__, database=None, id=None, schema=None, views=None):
        if database and not isinstance(database, str):
            raise TypeError("Expected argument 'database' to be a str")
        pulumi.set(__self__, "database", database)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if schema and not isinstance(schema, str):
            raise TypeError("Expected argument 'schema' to be a str")
        pulumi.set(__self__, "schema", schema)
        if views and not isinstance(views, list):
            raise TypeError("Expected argument 'views' to be a list")
        pulumi.set(__self__, "views", views)

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
        The schema from which to return the views from.
        """
        return pulumi.get(self, "schema")

    @property
    @pulumi.getter
    def views(self) -> Sequence['outputs.GetViewsViewResult']:
        """
        The views in the schema
        """
        return pulumi.get(self, "views")


class AwaitableGetViewsResult(GetViewsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetViewsResult(
            database=self.database,
            id=self.id,
            schema=self.schema,
            views=self.views)


def get_views(database: Optional[str] = None,
              schema: Optional[str] = None,
              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetViewsResult:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_snowflake as snowflake

    current = snowflake.get_views(database="MYDB",
        schema="MYSCHEMA")
    ```
    """
    __args__ = dict()
    __args__['database'] = database
    __args__['schema'] = schema
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('snowflake:index/getViews:getViews', __args__, opts=opts, typ=GetViewsResult).value

    return AwaitableGetViewsResult(
        database=pulumi.get(__ret__, 'database'),
        id=pulumi.get(__ret__, 'id'),
        schema=pulumi.get(__ret__, 'schema'),
        views=pulumi.get(__ret__, 'views'))


@_utilities.lift_output_func(get_views)
def get_views_output(database: Optional[pulumi.Input[str]] = None,
                     schema: Optional[pulumi.Input[str]] = None,
                     opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetViewsResult]:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_snowflake as snowflake

    current = snowflake.get_views(database="MYDB",
        schema="MYSCHEMA")
    ```
    """
    ...
