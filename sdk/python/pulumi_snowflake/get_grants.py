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
        Lists all privileges on new (i.e. future) objects.
        """
        return pulumi.get(self, "future_grants_in")

    @property
    @pulumi.getter(name="futureGrantsTo")
    def future_grants_to(self) -> Optional['outputs.GetGrantsFutureGrantsToResult']:
        """
        Lists all privileges granted to the object on new (i.e. future) objects.
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
        Lists all objects to which the given object has been granted.
        """
        return pulumi.get(self, "grants_of")

    @property
    @pulumi.getter(name="grantsOn")
    def grants_on(self) -> Optional['outputs.GetGrantsGrantsOnResult']:
        """
        Lists all privileges that have been granted on an object or on an account.
        """
        return pulumi.get(self, "grants_on")

    @property
    @pulumi.getter(name="grantsTo")
    def grants_to(self) -> Optional['outputs.GetGrantsGrantsToResult']:
        """
        Lists all privileges granted to the object.
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


def get_grants(future_grants_in: Optional[Union['GetGrantsFutureGrantsInArgs', 'GetGrantsFutureGrantsInArgsDict']] = None,
               future_grants_to: Optional[Union['GetGrantsFutureGrantsToArgs', 'GetGrantsFutureGrantsToArgsDict']] = None,
               grants_of: Optional[Union['GetGrantsGrantsOfArgs', 'GetGrantsGrantsOfArgsDict']] = None,
               grants_on: Optional[Union['GetGrantsGrantsOnArgs', 'GetGrantsGrantsOnArgsDict']] = None,
               grants_to: Optional[Union['GetGrantsGrantsToArgs', 'GetGrantsGrantsToArgsDict']] = None,
               opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetGrantsResult:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_snowflake as snowflake

    ##################################
    ### SHOW GRANTS ON ...
    ##################################
    # account
    example_on_account = snowflake.get_grants(grants_on={
        "account": True,
    })
    # account object (e.g. database)
    example_on_account_object = snowflake.get_grants(grants_on={
        "object_name": "some_database",
        "object_type": "DATABASE",
    })
    # database object (e.g. schema)
    example_on_database_object = snowflake.get_grants(grants_on={
        "object_name": "\\"some_database\\".\\"some_schema\\"",
        "object_type": "SCHEMA",
    })
    # schema object (e.g. table)
    example_on_schema_object = snowflake.get_grants(grants_on={
        "object_name": "\\"some_database\\".\\"some_schema\\".\\"some_table\\"",
        "object_type": "TABLE",
    })
    # application
    example_to_application = snowflake.get_grants(grants_to={
        "application": "some_application",
    })
    # application role
    example_to_application_role = snowflake.get_grants(grants_to={
        "application_role": "\\"some_application\\".\\"some_application_role\\"",
    })
    # account role
    example_to_role = snowflake.get_grants(grants_to={
        "account_role": "some_role",
    })
    # database role
    example_to_database_role = snowflake.get_grants(grants_to={
        "database_role": "\\"some_database\\".\\"some_database_role\\"",
    })
    # share
    example_to_share = snowflake.get_grants(grants_to={
        "share": {
            "share_name": "some_share",
        },
    })
    # user
    example_to_user = snowflake.get_grants(grants_to={
        "user": "some_user",
    })
    # application role
    example_of_application_role = snowflake.get_grants(grants_of={
        "application_role": "\\"some_application\\".\\"some_application_role\\"",
    })
    # database role
    example_of_database_role = snowflake.get_grants(grants_of={
        "database_role": "\\"some_database\\".\\"some_database_role\\"",
    })
    # account role
    example_of_role = snowflake.get_grants(grants_of={
        "account_role": "some_role",
    })
    # share
    example_of_share = snowflake.get_grants(grants_of={
        "share": "some_share",
    })
    # database
    example_future_in_database = snowflake.get_grants(future_grants_in={
        "database": "some_database",
    })
    # schema
    example_future_in_schema = snowflake.get_grants(future_grants_in={
        "schema": "\\"some_database\\".\\"some_schema\\"",
    })
    # account role
    example_future_to_role = snowflake.get_grants(future_grants_to={
        "account_role": "some_role",
    })
    # database role
    example_future_to_database_role = snowflake.get_grants(future_grants_to={
        "database_role": "\\"some_database\\".\\"some_database_role\\"",
    })
    ```


    :param Union['GetGrantsFutureGrantsInArgs', 'GetGrantsFutureGrantsInArgsDict'] future_grants_in: Lists all privileges on new (i.e. future) objects.
    :param Union['GetGrantsFutureGrantsToArgs', 'GetGrantsFutureGrantsToArgsDict'] future_grants_to: Lists all privileges granted to the object on new (i.e. future) objects.
    :param Union['GetGrantsGrantsOfArgs', 'GetGrantsGrantsOfArgsDict'] grants_of: Lists all objects to which the given object has been granted.
    :param Union['GetGrantsGrantsOnArgs', 'GetGrantsGrantsOnArgsDict'] grants_on: Lists all privileges that have been granted on an object or on an account.
    :param Union['GetGrantsGrantsToArgs', 'GetGrantsGrantsToArgsDict'] grants_to: Lists all privileges granted to the object.
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
def get_grants_output(future_grants_in: Optional[pulumi.Input[Optional[Union['GetGrantsFutureGrantsInArgs', 'GetGrantsFutureGrantsInArgsDict']]]] = None,
                      future_grants_to: Optional[pulumi.Input[Optional[Union['GetGrantsFutureGrantsToArgs', 'GetGrantsFutureGrantsToArgsDict']]]] = None,
                      grants_of: Optional[pulumi.Input[Optional[Union['GetGrantsGrantsOfArgs', 'GetGrantsGrantsOfArgsDict']]]] = None,
                      grants_on: Optional[pulumi.Input[Optional[Union['GetGrantsGrantsOnArgs', 'GetGrantsGrantsOnArgsDict']]]] = None,
                      grants_to: Optional[pulumi.Input[Optional[Union['GetGrantsGrantsToArgs', 'GetGrantsGrantsToArgsDict']]]] = None,
                      opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetGrantsResult]:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_snowflake as snowflake

    ##################################
    ### SHOW GRANTS ON ...
    ##################################
    # account
    example_on_account = snowflake.get_grants(grants_on={
        "account": True,
    })
    # account object (e.g. database)
    example_on_account_object = snowflake.get_grants(grants_on={
        "object_name": "some_database",
        "object_type": "DATABASE",
    })
    # database object (e.g. schema)
    example_on_database_object = snowflake.get_grants(grants_on={
        "object_name": "\\"some_database\\".\\"some_schema\\"",
        "object_type": "SCHEMA",
    })
    # schema object (e.g. table)
    example_on_schema_object = snowflake.get_grants(grants_on={
        "object_name": "\\"some_database\\".\\"some_schema\\".\\"some_table\\"",
        "object_type": "TABLE",
    })
    # application
    example_to_application = snowflake.get_grants(grants_to={
        "application": "some_application",
    })
    # application role
    example_to_application_role = snowflake.get_grants(grants_to={
        "application_role": "\\"some_application\\".\\"some_application_role\\"",
    })
    # account role
    example_to_role = snowflake.get_grants(grants_to={
        "account_role": "some_role",
    })
    # database role
    example_to_database_role = snowflake.get_grants(grants_to={
        "database_role": "\\"some_database\\".\\"some_database_role\\"",
    })
    # share
    example_to_share = snowflake.get_grants(grants_to={
        "share": {
            "share_name": "some_share",
        },
    })
    # user
    example_to_user = snowflake.get_grants(grants_to={
        "user": "some_user",
    })
    # application role
    example_of_application_role = snowflake.get_grants(grants_of={
        "application_role": "\\"some_application\\".\\"some_application_role\\"",
    })
    # database role
    example_of_database_role = snowflake.get_grants(grants_of={
        "database_role": "\\"some_database\\".\\"some_database_role\\"",
    })
    # account role
    example_of_role = snowflake.get_grants(grants_of={
        "account_role": "some_role",
    })
    # share
    example_of_share = snowflake.get_grants(grants_of={
        "share": "some_share",
    })
    # database
    example_future_in_database = snowflake.get_grants(future_grants_in={
        "database": "some_database",
    })
    # schema
    example_future_in_schema = snowflake.get_grants(future_grants_in={
        "schema": "\\"some_database\\".\\"some_schema\\"",
    })
    # account role
    example_future_to_role = snowflake.get_grants(future_grants_to={
        "account_role": "some_role",
    })
    # database role
    example_future_to_database_role = snowflake.get_grants(future_grants_to={
        "database_role": "\\"some_database\\".\\"some_database_role\\"",
    })
    ```


    :param Union['GetGrantsFutureGrantsInArgs', 'GetGrantsFutureGrantsInArgsDict'] future_grants_in: Lists all privileges on new (i.e. future) objects.
    :param Union['GetGrantsFutureGrantsToArgs', 'GetGrantsFutureGrantsToArgsDict'] future_grants_to: Lists all privileges granted to the object on new (i.e. future) objects.
    :param Union['GetGrantsGrantsOfArgs', 'GetGrantsGrantsOfArgsDict'] grants_of: Lists all objects to which the given object has been granted.
    :param Union['GetGrantsGrantsOnArgs', 'GetGrantsGrantsOnArgsDict'] grants_on: Lists all privileges that have been granted on an object or on an account.
    :param Union['GetGrantsGrantsToArgs', 'GetGrantsGrantsToArgsDict'] grants_to: Lists all privileges granted to the object.
    """
    ...
