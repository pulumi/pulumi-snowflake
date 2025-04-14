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
    'GetPipesResult',
    'AwaitableGetPipesResult',
    'get_pipes',
    'get_pipes_output',
]

@pulumi.output_type
class GetPipesResult:
    """
    A collection of values returned by getPipes.
    """
    def __init__(__self__, database=None, id=None, pipes=None, schema=None):
        if database and not isinstance(database, str):
            raise TypeError("Expected argument 'database' to be a str")
        pulumi.set(__self__, "database", database)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if pipes and not isinstance(pipes, list):
            raise TypeError("Expected argument 'pipes' to be a list")
        pulumi.set(__self__, "pipes", pipes)
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
    @pulumi.getter
    def id(self) -> builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def pipes(self) -> Sequence['outputs.GetPipesPipeResult']:
        """
        The pipes in the schema
        """
        return pulumi.get(self, "pipes")

    @property
    @pulumi.getter
    def schema(self) -> builtins.str:
        """
        The schema from which to return the pipes from.
        """
        return pulumi.get(self, "schema")


class AwaitableGetPipesResult(GetPipesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetPipesResult(
            database=self.database,
            id=self.id,
            pipes=self.pipes,
            schema=self.schema)


def get_pipes(database: Optional[builtins.str] = None,
              schema: Optional[builtins.str] = None,
              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetPipesResult:
    """
    !> **Caution: Preview Feature** This feature is considered a preview feature in the provider, regardless of the state of the resource in Snowflake. We do not guarantee its stability. It will be reworked and marked as a stable feature in future releases. Breaking changes are expected, even without bumping the major version. To use this feature, add the relevant feature name to `preview_features_enabled` field in the provider configuration. Please always refer to the Getting Help section in our Github repo to best determine how to get help for your questions.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_snowflake as snowflake

    current = snowflake.get_pipes(database="MYDB",
        schema="MYSCHEMA")
    ```

    > **Note** If a field has a default value, it is shown next to the type in the schema.


    :param builtins.str database: The database from which to return the schemas from.
    :param builtins.str schema: The schema from which to return the pipes from.
    """
    __args__ = dict()
    __args__['database'] = database
    __args__['schema'] = schema
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('snowflake:index/getPipes:getPipes', __args__, opts=opts, typ=GetPipesResult).value

    return AwaitableGetPipesResult(
        database=pulumi.get(__ret__, 'database'),
        id=pulumi.get(__ret__, 'id'),
        pipes=pulumi.get(__ret__, 'pipes'),
        schema=pulumi.get(__ret__, 'schema'))
def get_pipes_output(database: Optional[pulumi.Input[builtins.str]] = None,
                     schema: Optional[pulumi.Input[builtins.str]] = None,
                     opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetPipesResult]:
    """
    !> **Caution: Preview Feature** This feature is considered a preview feature in the provider, regardless of the state of the resource in Snowflake. We do not guarantee its stability. It will be reworked and marked as a stable feature in future releases. Breaking changes are expected, even without bumping the major version. To use this feature, add the relevant feature name to `preview_features_enabled` field in the provider configuration. Please always refer to the Getting Help section in our Github repo to best determine how to get help for your questions.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_snowflake as snowflake

    current = snowflake.get_pipes(database="MYDB",
        schema="MYSCHEMA")
    ```

    > **Note** If a field has a default value, it is shown next to the type in the schema.


    :param builtins.str database: The database from which to return the schemas from.
    :param builtins.str schema: The schema from which to return the pipes from.
    """
    __args__ = dict()
    __args__['database'] = database
    __args__['schema'] = schema
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('snowflake:index/getPipes:getPipes', __args__, opts=opts, typ=GetPipesResult)
    return __ret__.apply(lambda __response__: GetPipesResult(
        database=pulumi.get(__response__, 'database'),
        id=pulumi.get(__response__, 'id'),
        pipes=pulumi.get(__response__, 'pipes'),
        schema=pulumi.get(__response__, 'schema')))
