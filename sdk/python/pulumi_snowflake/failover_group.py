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

__all__ = ['FailoverGroupArgs', 'FailoverGroup']

@pulumi.input_type
class FailoverGroupArgs:
    def __init__(__self__, *,
                 allowed_accounts: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 allowed_databases: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 allowed_integration_types: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 allowed_shares: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 from_replica: Optional[pulumi.Input['FailoverGroupFromReplicaArgs']] = None,
                 ignore_edition_check: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 object_types: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 replication_schedule: Optional[pulumi.Input['FailoverGroupReplicationScheduleArgs']] = None):
        """
        The set of arguments for constructing a FailoverGroup resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] allowed_accounts: Specifies the target account or list of target accounts to which replication and failover of specified objects from the source account is enabled. Secondary failover groups in the target accounts in this list can be promoted to serve as the primary failover group in case of failover. Expected in the form \\n\\n.\\n\\n
        :param pulumi.Input[Sequence[pulumi.Input[str]]] allowed_databases: Specifies the database or list of databases for which you are enabling replication and failover from the source account to the target account. The OBJECT_TYPES list must include DATABASES to set this parameter.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] allowed_integration_types: Type(s) of integrations for which you are enabling replication and failover from the source account to the target account. This property requires that the OBJECT_TYPES list include INTEGRATIONS to set this parameter. The following integration types are supported: "SECURITY INTEGRATIONS", "API INTEGRATIONS"
        :param pulumi.Input[Sequence[pulumi.Input[str]]] allowed_shares: Specifies the share or list of shares for which you are enabling replication and failover from the source account to the target account. The OBJECT_TYPES list must include SHARES to set this parameter.
        :param pulumi.Input['FailoverGroupFromReplicaArgs'] from_replica: Specifies the name of the replica to use as the source for the failover group.
        :param pulumi.Input[bool] ignore_edition_check: Allows replicating objects to accounts on lower editions.
        :param pulumi.Input[str] name: Specifies the identifier for the failover group. The identifier must start with an alphabetic character and cannot contain spaces or special characters unless the identifier string is enclosed in double quotes (e.g. "My object"). Identifiers enclosed in double quotes are also case-sensitive.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] object_types: Type(s) of objects for which you are enabling replication and failover from the source account to the target account. The following object types are supported: "ACCOUNT PARAMETERS", "DATABASES", "INTEGRATIONS", "NETWORK POLICIES", "RESOURCE MONITORS", "ROLES", "SHARES", "USERS", "WAREHOUSES"
        :param pulumi.Input['FailoverGroupReplicationScheduleArgs'] replication_schedule: Specifies the schedule for refreshing secondary failover groups.
        """
        if allowed_accounts is not None:
            pulumi.set(__self__, "allowed_accounts", allowed_accounts)
        if allowed_databases is not None:
            pulumi.set(__self__, "allowed_databases", allowed_databases)
        if allowed_integration_types is not None:
            pulumi.set(__self__, "allowed_integration_types", allowed_integration_types)
        if allowed_shares is not None:
            pulumi.set(__self__, "allowed_shares", allowed_shares)
        if from_replica is not None:
            pulumi.set(__self__, "from_replica", from_replica)
        if ignore_edition_check is not None:
            pulumi.set(__self__, "ignore_edition_check", ignore_edition_check)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if object_types is not None:
            pulumi.set(__self__, "object_types", object_types)
        if replication_schedule is not None:
            pulumi.set(__self__, "replication_schedule", replication_schedule)

    @property
    @pulumi.getter(name="allowedAccounts")
    def allowed_accounts(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Specifies the target account or list of target accounts to which replication and failover of specified objects from the source account is enabled. Secondary failover groups in the target accounts in this list can be promoted to serve as the primary failover group in case of failover. Expected in the form \\n\\n.\\n\\n
        """
        return pulumi.get(self, "allowed_accounts")

    @allowed_accounts.setter
    def allowed_accounts(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "allowed_accounts", value)

    @property
    @pulumi.getter(name="allowedDatabases")
    def allowed_databases(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Specifies the database or list of databases for which you are enabling replication and failover from the source account to the target account. The OBJECT_TYPES list must include DATABASES to set this parameter.
        """
        return pulumi.get(self, "allowed_databases")

    @allowed_databases.setter
    def allowed_databases(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "allowed_databases", value)

    @property
    @pulumi.getter(name="allowedIntegrationTypes")
    def allowed_integration_types(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Type(s) of integrations for which you are enabling replication and failover from the source account to the target account. This property requires that the OBJECT_TYPES list include INTEGRATIONS to set this parameter. The following integration types are supported: "SECURITY INTEGRATIONS", "API INTEGRATIONS"
        """
        return pulumi.get(self, "allowed_integration_types")

    @allowed_integration_types.setter
    def allowed_integration_types(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "allowed_integration_types", value)

    @property
    @pulumi.getter(name="allowedShares")
    def allowed_shares(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Specifies the share or list of shares for which you are enabling replication and failover from the source account to the target account. The OBJECT_TYPES list must include SHARES to set this parameter.
        """
        return pulumi.get(self, "allowed_shares")

    @allowed_shares.setter
    def allowed_shares(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "allowed_shares", value)

    @property
    @pulumi.getter(name="fromReplica")
    def from_replica(self) -> Optional[pulumi.Input['FailoverGroupFromReplicaArgs']]:
        """
        Specifies the name of the replica to use as the source for the failover group.
        """
        return pulumi.get(self, "from_replica")

    @from_replica.setter
    def from_replica(self, value: Optional[pulumi.Input['FailoverGroupFromReplicaArgs']]):
        pulumi.set(self, "from_replica", value)

    @property
    @pulumi.getter(name="ignoreEditionCheck")
    def ignore_edition_check(self) -> Optional[pulumi.Input[bool]]:
        """
        Allows replicating objects to accounts on lower editions.
        """
        return pulumi.get(self, "ignore_edition_check")

    @ignore_edition_check.setter
    def ignore_edition_check(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "ignore_edition_check", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the identifier for the failover group. The identifier must start with an alphabetic character and cannot contain spaces or special characters unless the identifier string is enclosed in double quotes (e.g. "My object"). Identifiers enclosed in double quotes are also case-sensitive.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="objectTypes")
    def object_types(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Type(s) of objects for which you are enabling replication and failover from the source account to the target account. The following object types are supported: "ACCOUNT PARAMETERS", "DATABASES", "INTEGRATIONS", "NETWORK POLICIES", "RESOURCE MONITORS", "ROLES", "SHARES", "USERS", "WAREHOUSES"
        """
        return pulumi.get(self, "object_types")

    @object_types.setter
    def object_types(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "object_types", value)

    @property
    @pulumi.getter(name="replicationSchedule")
    def replication_schedule(self) -> Optional[pulumi.Input['FailoverGroupReplicationScheduleArgs']]:
        """
        Specifies the schedule for refreshing secondary failover groups.
        """
        return pulumi.get(self, "replication_schedule")

    @replication_schedule.setter
    def replication_schedule(self, value: Optional[pulumi.Input['FailoverGroupReplicationScheduleArgs']]):
        pulumi.set(self, "replication_schedule", value)


@pulumi.input_type
class _FailoverGroupState:
    def __init__(__self__, *,
                 allowed_accounts: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 allowed_databases: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 allowed_integration_types: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 allowed_shares: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 from_replica: Optional[pulumi.Input['FailoverGroupFromReplicaArgs']] = None,
                 ignore_edition_check: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 object_types: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 replication_schedule: Optional[pulumi.Input['FailoverGroupReplicationScheduleArgs']] = None):
        """
        Input properties used for looking up and filtering FailoverGroup resources.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] allowed_accounts: Specifies the target account or list of target accounts to which replication and failover of specified objects from the source account is enabled. Secondary failover groups in the target accounts in this list can be promoted to serve as the primary failover group in case of failover. Expected in the form \\n\\n.\\n\\n
        :param pulumi.Input[Sequence[pulumi.Input[str]]] allowed_databases: Specifies the database or list of databases for which you are enabling replication and failover from the source account to the target account. The OBJECT_TYPES list must include DATABASES to set this parameter.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] allowed_integration_types: Type(s) of integrations for which you are enabling replication and failover from the source account to the target account. This property requires that the OBJECT_TYPES list include INTEGRATIONS to set this parameter. The following integration types are supported: "SECURITY INTEGRATIONS", "API INTEGRATIONS"
        :param pulumi.Input[Sequence[pulumi.Input[str]]] allowed_shares: Specifies the share or list of shares for which you are enabling replication and failover from the source account to the target account. The OBJECT_TYPES list must include SHARES to set this parameter.
        :param pulumi.Input['FailoverGroupFromReplicaArgs'] from_replica: Specifies the name of the replica to use as the source for the failover group.
        :param pulumi.Input[bool] ignore_edition_check: Allows replicating objects to accounts on lower editions.
        :param pulumi.Input[str] name: Specifies the identifier for the failover group. The identifier must start with an alphabetic character and cannot contain spaces or special characters unless the identifier string is enclosed in double quotes (e.g. "My object"). Identifiers enclosed in double quotes are also case-sensitive.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] object_types: Type(s) of objects for which you are enabling replication and failover from the source account to the target account. The following object types are supported: "ACCOUNT PARAMETERS", "DATABASES", "INTEGRATIONS", "NETWORK POLICIES", "RESOURCE MONITORS", "ROLES", "SHARES", "USERS", "WAREHOUSES"
        :param pulumi.Input['FailoverGroupReplicationScheduleArgs'] replication_schedule: Specifies the schedule for refreshing secondary failover groups.
        """
        if allowed_accounts is not None:
            pulumi.set(__self__, "allowed_accounts", allowed_accounts)
        if allowed_databases is not None:
            pulumi.set(__self__, "allowed_databases", allowed_databases)
        if allowed_integration_types is not None:
            pulumi.set(__self__, "allowed_integration_types", allowed_integration_types)
        if allowed_shares is not None:
            pulumi.set(__self__, "allowed_shares", allowed_shares)
        if from_replica is not None:
            pulumi.set(__self__, "from_replica", from_replica)
        if ignore_edition_check is not None:
            pulumi.set(__self__, "ignore_edition_check", ignore_edition_check)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if object_types is not None:
            pulumi.set(__self__, "object_types", object_types)
        if replication_schedule is not None:
            pulumi.set(__self__, "replication_schedule", replication_schedule)

    @property
    @pulumi.getter(name="allowedAccounts")
    def allowed_accounts(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Specifies the target account or list of target accounts to which replication and failover of specified objects from the source account is enabled. Secondary failover groups in the target accounts in this list can be promoted to serve as the primary failover group in case of failover. Expected in the form \\n\\n.\\n\\n
        """
        return pulumi.get(self, "allowed_accounts")

    @allowed_accounts.setter
    def allowed_accounts(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "allowed_accounts", value)

    @property
    @pulumi.getter(name="allowedDatabases")
    def allowed_databases(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Specifies the database or list of databases for which you are enabling replication and failover from the source account to the target account. The OBJECT_TYPES list must include DATABASES to set this parameter.
        """
        return pulumi.get(self, "allowed_databases")

    @allowed_databases.setter
    def allowed_databases(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "allowed_databases", value)

    @property
    @pulumi.getter(name="allowedIntegrationTypes")
    def allowed_integration_types(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Type(s) of integrations for which you are enabling replication and failover from the source account to the target account. This property requires that the OBJECT_TYPES list include INTEGRATIONS to set this parameter. The following integration types are supported: "SECURITY INTEGRATIONS", "API INTEGRATIONS"
        """
        return pulumi.get(self, "allowed_integration_types")

    @allowed_integration_types.setter
    def allowed_integration_types(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "allowed_integration_types", value)

    @property
    @pulumi.getter(name="allowedShares")
    def allowed_shares(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Specifies the share or list of shares for which you are enabling replication and failover from the source account to the target account. The OBJECT_TYPES list must include SHARES to set this parameter.
        """
        return pulumi.get(self, "allowed_shares")

    @allowed_shares.setter
    def allowed_shares(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "allowed_shares", value)

    @property
    @pulumi.getter(name="fromReplica")
    def from_replica(self) -> Optional[pulumi.Input['FailoverGroupFromReplicaArgs']]:
        """
        Specifies the name of the replica to use as the source for the failover group.
        """
        return pulumi.get(self, "from_replica")

    @from_replica.setter
    def from_replica(self, value: Optional[pulumi.Input['FailoverGroupFromReplicaArgs']]):
        pulumi.set(self, "from_replica", value)

    @property
    @pulumi.getter(name="ignoreEditionCheck")
    def ignore_edition_check(self) -> Optional[pulumi.Input[bool]]:
        """
        Allows replicating objects to accounts on lower editions.
        """
        return pulumi.get(self, "ignore_edition_check")

    @ignore_edition_check.setter
    def ignore_edition_check(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "ignore_edition_check", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the identifier for the failover group. The identifier must start with an alphabetic character and cannot contain spaces or special characters unless the identifier string is enclosed in double quotes (e.g. "My object"). Identifiers enclosed in double quotes are also case-sensitive.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="objectTypes")
    def object_types(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Type(s) of objects for which you are enabling replication and failover from the source account to the target account. The following object types are supported: "ACCOUNT PARAMETERS", "DATABASES", "INTEGRATIONS", "NETWORK POLICIES", "RESOURCE MONITORS", "ROLES", "SHARES", "USERS", "WAREHOUSES"
        """
        return pulumi.get(self, "object_types")

    @object_types.setter
    def object_types(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "object_types", value)

    @property
    @pulumi.getter(name="replicationSchedule")
    def replication_schedule(self) -> Optional[pulumi.Input['FailoverGroupReplicationScheduleArgs']]:
        """
        Specifies the schedule for refreshing secondary failover groups.
        """
        return pulumi.get(self, "replication_schedule")

    @replication_schedule.setter
    def replication_schedule(self, value: Optional[pulumi.Input['FailoverGroupReplicationScheduleArgs']]):
        pulumi.set(self, "replication_schedule", value)


class FailoverGroup(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 allowed_accounts: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 allowed_databases: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 allowed_integration_types: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 allowed_shares: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 from_replica: Optional[pulumi.Input[pulumi.InputType['FailoverGroupFromReplicaArgs']]] = None,
                 ignore_edition_check: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 object_types: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 replication_schedule: Optional[pulumi.Input[pulumi.InputType['FailoverGroupReplicationScheduleArgs']]] = None,
                 __props__=None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_snowflake as snowflake

        db = snowflake.Database("db")
        source_failover_group = snowflake.FailoverGroup("sourceFailoverGroup",
            object_types=[
                "WAREHOUSES",
                "DATABASES",
                "INTEGRATIONS",
                "ROLES",
            ],
            allowed_accounts=[
                "<account1>",
                "<account2>",
            ],
            allowed_databases=[db.name],
            allowed_integration_types=["SECURITY INTEGRATIONS"],
            replication_schedule=snowflake.FailoverGroupReplicationScheduleArgs(
                cron=snowflake.FailoverGroupReplicationScheduleCronArgs(
                    expression="0 0 10-20 * TUE,THU",
                    time_zone="UTC",
                ),
            ))
        account2 = snowflake.Provider("account2")
        target_failover_group = snowflake.FailoverGroup("targetFailoverGroup", from_replica=snowflake.FailoverGroupFromReplicaArgs(
            organization_name="...",
            source_account_name="...",
            name=snowflake_failover_group["fg"]["name"],
        ),
        opts=pulumi.ResourceOptions(provider=snowflake["account2"]))
        ```

        ## Import

        ```sh
         $ pulumi import snowflake:index/failoverGroup:FailoverGroup example 'fg1'
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] allowed_accounts: Specifies the target account or list of target accounts to which replication and failover of specified objects from the source account is enabled. Secondary failover groups in the target accounts in this list can be promoted to serve as the primary failover group in case of failover. Expected in the form \\n\\n.\\n\\n
        :param pulumi.Input[Sequence[pulumi.Input[str]]] allowed_databases: Specifies the database or list of databases for which you are enabling replication and failover from the source account to the target account. The OBJECT_TYPES list must include DATABASES to set this parameter.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] allowed_integration_types: Type(s) of integrations for which you are enabling replication and failover from the source account to the target account. This property requires that the OBJECT_TYPES list include INTEGRATIONS to set this parameter. The following integration types are supported: "SECURITY INTEGRATIONS", "API INTEGRATIONS"
        :param pulumi.Input[Sequence[pulumi.Input[str]]] allowed_shares: Specifies the share or list of shares for which you are enabling replication and failover from the source account to the target account. The OBJECT_TYPES list must include SHARES to set this parameter.
        :param pulumi.Input[pulumi.InputType['FailoverGroupFromReplicaArgs']] from_replica: Specifies the name of the replica to use as the source for the failover group.
        :param pulumi.Input[bool] ignore_edition_check: Allows replicating objects to accounts on lower editions.
        :param pulumi.Input[str] name: Specifies the identifier for the failover group. The identifier must start with an alphabetic character and cannot contain spaces or special characters unless the identifier string is enclosed in double quotes (e.g. "My object"). Identifiers enclosed in double quotes are also case-sensitive.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] object_types: Type(s) of objects for which you are enabling replication and failover from the source account to the target account. The following object types are supported: "ACCOUNT PARAMETERS", "DATABASES", "INTEGRATIONS", "NETWORK POLICIES", "RESOURCE MONITORS", "ROLES", "SHARES", "USERS", "WAREHOUSES"
        :param pulumi.Input[pulumi.InputType['FailoverGroupReplicationScheduleArgs']] replication_schedule: Specifies the schedule for refreshing secondary failover groups.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[FailoverGroupArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_snowflake as snowflake

        db = snowflake.Database("db")
        source_failover_group = snowflake.FailoverGroup("sourceFailoverGroup",
            object_types=[
                "WAREHOUSES",
                "DATABASES",
                "INTEGRATIONS",
                "ROLES",
            ],
            allowed_accounts=[
                "<account1>",
                "<account2>",
            ],
            allowed_databases=[db.name],
            allowed_integration_types=["SECURITY INTEGRATIONS"],
            replication_schedule=snowflake.FailoverGroupReplicationScheduleArgs(
                cron=snowflake.FailoverGroupReplicationScheduleCronArgs(
                    expression="0 0 10-20 * TUE,THU",
                    time_zone="UTC",
                ),
            ))
        account2 = snowflake.Provider("account2")
        target_failover_group = snowflake.FailoverGroup("targetFailoverGroup", from_replica=snowflake.FailoverGroupFromReplicaArgs(
            organization_name="...",
            source_account_name="...",
            name=snowflake_failover_group["fg"]["name"],
        ),
        opts=pulumi.ResourceOptions(provider=snowflake["account2"]))
        ```

        ## Import

        ```sh
         $ pulumi import snowflake:index/failoverGroup:FailoverGroup example 'fg1'
        ```

        :param str resource_name: The name of the resource.
        :param FailoverGroupArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(FailoverGroupArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 allowed_accounts: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 allowed_databases: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 allowed_integration_types: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 allowed_shares: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 from_replica: Optional[pulumi.Input[pulumi.InputType['FailoverGroupFromReplicaArgs']]] = None,
                 ignore_edition_check: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 object_types: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 replication_schedule: Optional[pulumi.Input[pulumi.InputType['FailoverGroupReplicationScheduleArgs']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = FailoverGroupArgs.__new__(FailoverGroupArgs)

            __props__.__dict__["allowed_accounts"] = allowed_accounts
            __props__.__dict__["allowed_databases"] = allowed_databases
            __props__.__dict__["allowed_integration_types"] = allowed_integration_types
            __props__.__dict__["allowed_shares"] = allowed_shares
            __props__.__dict__["from_replica"] = from_replica
            __props__.__dict__["ignore_edition_check"] = ignore_edition_check
            __props__.__dict__["name"] = name
            __props__.__dict__["object_types"] = object_types
            __props__.__dict__["replication_schedule"] = replication_schedule
        super(FailoverGroup, __self__).__init__(
            'snowflake:index/failoverGroup:FailoverGroup',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            allowed_accounts: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            allowed_databases: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            allowed_integration_types: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            allowed_shares: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            from_replica: Optional[pulumi.Input[pulumi.InputType['FailoverGroupFromReplicaArgs']]] = None,
            ignore_edition_check: Optional[pulumi.Input[bool]] = None,
            name: Optional[pulumi.Input[str]] = None,
            object_types: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            replication_schedule: Optional[pulumi.Input[pulumi.InputType['FailoverGroupReplicationScheduleArgs']]] = None) -> 'FailoverGroup':
        """
        Get an existing FailoverGroup resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] allowed_accounts: Specifies the target account or list of target accounts to which replication and failover of specified objects from the source account is enabled. Secondary failover groups in the target accounts in this list can be promoted to serve as the primary failover group in case of failover. Expected in the form \\n\\n.\\n\\n
        :param pulumi.Input[Sequence[pulumi.Input[str]]] allowed_databases: Specifies the database or list of databases for which you are enabling replication and failover from the source account to the target account. The OBJECT_TYPES list must include DATABASES to set this parameter.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] allowed_integration_types: Type(s) of integrations for which you are enabling replication and failover from the source account to the target account. This property requires that the OBJECT_TYPES list include INTEGRATIONS to set this parameter. The following integration types are supported: "SECURITY INTEGRATIONS", "API INTEGRATIONS"
        :param pulumi.Input[Sequence[pulumi.Input[str]]] allowed_shares: Specifies the share or list of shares for which you are enabling replication and failover from the source account to the target account. The OBJECT_TYPES list must include SHARES to set this parameter.
        :param pulumi.Input[pulumi.InputType['FailoverGroupFromReplicaArgs']] from_replica: Specifies the name of the replica to use as the source for the failover group.
        :param pulumi.Input[bool] ignore_edition_check: Allows replicating objects to accounts on lower editions.
        :param pulumi.Input[str] name: Specifies the identifier for the failover group. The identifier must start with an alphabetic character and cannot contain spaces or special characters unless the identifier string is enclosed in double quotes (e.g. "My object"). Identifiers enclosed in double quotes are also case-sensitive.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] object_types: Type(s) of objects for which you are enabling replication and failover from the source account to the target account. The following object types are supported: "ACCOUNT PARAMETERS", "DATABASES", "INTEGRATIONS", "NETWORK POLICIES", "RESOURCE MONITORS", "ROLES", "SHARES", "USERS", "WAREHOUSES"
        :param pulumi.Input[pulumi.InputType['FailoverGroupReplicationScheduleArgs']] replication_schedule: Specifies the schedule for refreshing secondary failover groups.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _FailoverGroupState.__new__(_FailoverGroupState)

        __props__.__dict__["allowed_accounts"] = allowed_accounts
        __props__.__dict__["allowed_databases"] = allowed_databases
        __props__.__dict__["allowed_integration_types"] = allowed_integration_types
        __props__.__dict__["allowed_shares"] = allowed_shares
        __props__.__dict__["from_replica"] = from_replica
        __props__.__dict__["ignore_edition_check"] = ignore_edition_check
        __props__.__dict__["name"] = name
        __props__.__dict__["object_types"] = object_types
        __props__.__dict__["replication_schedule"] = replication_schedule
        return FailoverGroup(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="allowedAccounts")
    def allowed_accounts(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        Specifies the target account or list of target accounts to which replication and failover of specified objects from the source account is enabled. Secondary failover groups in the target accounts in this list can be promoted to serve as the primary failover group in case of failover. Expected in the form \\n\\n.\\n\\n
        """
        return pulumi.get(self, "allowed_accounts")

    @property
    @pulumi.getter(name="allowedDatabases")
    def allowed_databases(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        Specifies the database or list of databases for which you are enabling replication and failover from the source account to the target account. The OBJECT_TYPES list must include DATABASES to set this parameter.
        """
        return pulumi.get(self, "allowed_databases")

    @property
    @pulumi.getter(name="allowedIntegrationTypes")
    def allowed_integration_types(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        Type(s) of integrations for which you are enabling replication and failover from the source account to the target account. This property requires that the OBJECT_TYPES list include INTEGRATIONS to set this parameter. The following integration types are supported: "SECURITY INTEGRATIONS", "API INTEGRATIONS"
        """
        return pulumi.get(self, "allowed_integration_types")

    @property
    @pulumi.getter(name="allowedShares")
    def allowed_shares(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        Specifies the share or list of shares for which you are enabling replication and failover from the source account to the target account. The OBJECT_TYPES list must include SHARES to set this parameter.
        """
        return pulumi.get(self, "allowed_shares")

    @property
    @pulumi.getter(name="fromReplica")
    def from_replica(self) -> pulumi.Output[Optional['outputs.FailoverGroupFromReplica']]:
        """
        Specifies the name of the replica to use as the source for the failover group.
        """
        return pulumi.get(self, "from_replica")

    @property
    @pulumi.getter(name="ignoreEditionCheck")
    def ignore_edition_check(self) -> pulumi.Output[Optional[bool]]:
        """
        Allows replicating objects to accounts on lower editions.
        """
        return pulumi.get(self, "ignore_edition_check")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Specifies the identifier for the failover group. The identifier must start with an alphabetic character and cannot contain spaces or special characters unless the identifier string is enclosed in double quotes (e.g. "My object"). Identifiers enclosed in double quotes are also case-sensitive.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="objectTypes")
    def object_types(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        Type(s) of objects for which you are enabling replication and failover from the source account to the target account. The following object types are supported: "ACCOUNT PARAMETERS", "DATABASES", "INTEGRATIONS", "NETWORK POLICIES", "RESOURCE MONITORS", "ROLES", "SHARES", "USERS", "WAREHOUSES"
        """
        return pulumi.get(self, "object_types")

    @property
    @pulumi.getter(name="replicationSchedule")
    def replication_schedule(self) -> pulumi.Output[Optional['outputs.FailoverGroupReplicationSchedule']]:
        """
        Specifies the schedule for refreshing secondary failover groups.
        """
        return pulumi.get(self, "replication_schedule")
