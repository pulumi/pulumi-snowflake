# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = [
    'GetGrantsResult',
    'AwaitableGetGrantsResult',
    'get_grants',
    'get_grants_output',
]

@pulumi.output_type
class GetGrantsResult:
    """
    A collection of values returned by getGrants.
    """
    def __init__(__self__, future_grants_in=None, future_grants_to=None, grants=None, grants_of=None, grants_on=None, grants_to=None, id=None):
        if future_grants_in and not isinstance(future_grants_in, dict):
            raise TypeError("Expected argument 'future_grants_in' to be a dict")
        pulumi.set(__self__, "future_grants_in", future_grants_in)
        if future_grants_to and not isinstance(future_grants_to, dict):
            raise TypeError("Expected argument 'future_grants_to' to be a dict")
        pulumi.set(__self__, "future_grants_to", future_grants_to)
        if grants and not isinstance(grants, list):
            raise TypeError("Expected argument 'grants' to be a list")
        pulumi.set(__self__, "grants", grants)
        if grants_of and not isinstance(grants_of, dict):
            raise TypeError("Expected argument 'grants_of' to be a dict")
        pulumi.set(__self__, "grants_of", grants_of)
        if grants_on and not isinstance(grants_on, dict):
            raise TypeError("Expected argument 'grants_on' to be a dict")
        pulumi.set(__self__, "grants_on", grants_on)
        if grants_to and not isinstance(grants_to, dict):
            raise TypeError("Expected argument 'grants_to' to be a dict")
        pulumi.set(__self__, "grants_to", grants_to)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)

    @property
    @pulumi.getter(name="futureGrantsIn")
    def future_grants_in(self) -> Optional['outputs.GetGrantsFutureGrantsInResult']:
        """
        Lists all privileges on new (i.e. future) objects
        """
        return pulumi.get(self, "future_grants_in")

    @property
    @pulumi.getter(name="futureGrantsTo")
    def future_grants_to(self) -> Optional['outputs.GetGrantsFutureGrantsToResult']:
        """
        Lists all privileges granted to the object on new (i.e. future) objects
        """
        return pulumi.get(self, "future_grants_to")

    @property
    @pulumi.getter
    def grants(self) -> Sequence['outputs.GetGrantsGrantResult']:
        """
        The list of grants
        """
        return pulumi.get(self, "grants")

    @property
    @pulumi.getter(name="grantsOf")
    def grants_of(self) -> Optional['outputs.GetGrantsGrantsOfResult']:
        """
        Lists all objects to which the given object has been granted
        """
        return pulumi.get(self, "grants_of")

    @property
    @pulumi.getter(name="grantsOn")
    def grants_on(self) -> Optional['outputs.GetGrantsGrantsOnResult']:
        """
        Lists all privileges that have been granted on an object or account
        """
        return pulumi.get(self, "grants_on")

    @property
    @pulumi.getter(name="grantsTo")
    def grants_to(self) -> Optional['outputs.GetGrantsGrantsToResult']:
        """
        Lists all privileges granted to the object
        """
        return pulumi.get(self, "grants_to")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")


class AwaitableGetGrantsResult(GetGrantsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetGrantsResult(
            future_grants_in=self.future_grants_in,
            future_grants_to=self.future_grants_to,
            grants=self.grants,
            grants_of=self.grants_of,
            grants_on=self.grants_on,
            grants_to=self.grants_to,
            id=self.id)


def get_grants(future_grants_in: Optional[pulumi.InputType['GetGrantsFutureGrantsInArgs']] = None,
               future_grants_to: Optional[pulumi.InputType['GetGrantsFutureGrantsToArgs']] = None,
               grants_of: Optional[pulumi.InputType['GetGrantsGrantsOfArgs']] = None,
               grants_on: Optional[pulumi.InputType['GetGrantsGrantsOnArgs']] = None,
               grants_to: Optional[pulumi.InputType['GetGrantsGrantsToArgs']] = None,
               opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetGrantsResult:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_snowflake as snowflake

    grants = snowflake.get_grants(grants_on=snowflake.GetGrantsGrantsOnArgs(
        account=True,
    ))
    grants2 = snowflake.get_grants(grants_on=snowflake.GetGrantsGrantsOnArgs(
        object_name="\\"tst\\"",
        object_type="DATABASE",
    ))
    grants3 = snowflake.get_grants(grants_to=snowflake.GetGrantsGrantsToArgs(
        role="ACCOUNTADMIN",
    ))
    grants4 = snowflake.get_grants(grants_of=snowflake.GetGrantsGrantsOfArgs(
        role="ACCOUNTADMIN",
    ))
    grants5 = snowflake.get_grants(future_grants_in=snowflake.GetGrantsFutureGrantsInArgs(
        database="\\"tst\\"",
    ))
    grants6 = snowflake.get_grants(future_grants_in=snowflake.GetGrantsFutureGrantsInArgs(
        schema=snowflake.GetGrantsFutureGrantsInSchemaArgs(
            database_name="\\"mydatabase\\"",
            schema_name="\\"myschema\\"",
        ),
    ))
    grants7 = snowflake.get_grants(future_grants_to=snowflake.GetGrantsFutureGrantsToArgs(
        role="ACCOUNTADMIN",
    ))
    ```


    :param pulumi.InputType['GetGrantsFutureGrantsInArgs'] future_grants_in: Lists all privileges on new (i.e. future) objects
    :param pulumi.InputType['GetGrantsFutureGrantsToArgs'] future_grants_to: Lists all privileges granted to the object on new (i.e. future) objects
    :param pulumi.InputType['GetGrantsGrantsOfArgs'] grants_of: Lists all objects to which the given object has been granted
    :param pulumi.InputType['GetGrantsGrantsOnArgs'] grants_on: Lists all privileges that have been granted on an object or account
    :param pulumi.InputType['GetGrantsGrantsToArgs'] grants_to: Lists all privileges granted to the object
    """
    __args__ = dict()
    __args__['futureGrantsIn'] = future_grants_in
    __args__['futureGrantsTo'] = future_grants_to
    __args__['grantsOf'] = grants_of
    __args__['grantsOn'] = grants_on
    __args__['grantsTo'] = grants_to
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('snowflake:index/getGrants:getGrants', __args__, opts=opts, typ=GetGrantsResult).value

    return AwaitableGetGrantsResult(
        future_grants_in=pulumi.get(__ret__, 'future_grants_in'),
        future_grants_to=pulumi.get(__ret__, 'future_grants_to'),
        grants=pulumi.get(__ret__, 'grants'),
        grants_of=pulumi.get(__ret__, 'grants_of'),
        grants_on=pulumi.get(__ret__, 'grants_on'),
        grants_to=pulumi.get(__ret__, 'grants_to'),
        id=pulumi.get(__ret__, 'id'))


@_utilities.lift_output_func(get_grants)
def get_grants_output(future_grants_in: Optional[pulumi.Input[Optional[pulumi.InputType['GetGrantsFutureGrantsInArgs']]]] = None,
                      future_grants_to: Optional[pulumi.Input[Optional[pulumi.InputType['GetGrantsFutureGrantsToArgs']]]] = None,
                      grants_of: Optional[pulumi.Input[Optional[pulumi.InputType['GetGrantsGrantsOfArgs']]]] = None,
                      grants_on: Optional[pulumi.Input[Optional[pulumi.InputType['GetGrantsGrantsOnArgs']]]] = None,
                      grants_to: Optional[pulumi.Input[Optional[pulumi.InputType['GetGrantsGrantsToArgs']]]] = None,
                      opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetGrantsResult]:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_snowflake as snowflake

    grants = snowflake.get_grants(grants_on=snowflake.GetGrantsGrantsOnArgs(
        account=True,
    ))
    grants2 = snowflake.get_grants(grants_on=snowflake.GetGrantsGrantsOnArgs(
        object_name="\\"tst\\"",
        object_type="DATABASE",
    ))
    grants3 = snowflake.get_grants(grants_to=snowflake.GetGrantsGrantsToArgs(
        role="ACCOUNTADMIN",
    ))
    grants4 = snowflake.get_grants(grants_of=snowflake.GetGrantsGrantsOfArgs(
        role="ACCOUNTADMIN",
    ))
    grants5 = snowflake.get_grants(future_grants_in=snowflake.GetGrantsFutureGrantsInArgs(
        database="\\"tst\\"",
    ))
    grants6 = snowflake.get_grants(future_grants_in=snowflake.GetGrantsFutureGrantsInArgs(
        schema=snowflake.GetGrantsFutureGrantsInSchemaArgs(
            database_name="\\"mydatabase\\"",
            schema_name="\\"myschema\\"",
        ),
    ))
    grants7 = snowflake.get_grants(future_grants_to=snowflake.GetGrantsFutureGrantsToArgs(
        role="ACCOUNTADMIN",
    ))
    ```


    :param pulumi.InputType['GetGrantsFutureGrantsInArgs'] future_grants_in: Lists all privileges on new (i.e. future) objects
    :param pulumi.InputType['GetGrantsFutureGrantsToArgs'] future_grants_to: Lists all privileges granted to the object on new (i.e. future) objects
    :param pulumi.InputType['GetGrantsGrantsOfArgs'] grants_of: Lists all objects to which the given object has been granted
    :param pulumi.InputType['GetGrantsGrantsOnArgs'] grants_on: Lists all privileges that have been granted on an object or account
    :param pulumi.InputType['GetGrantsGrantsToArgs'] grants_to: Lists all privileges granted to the object
    """
    ...
