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

__all__ = ['AlertArgs', 'Alert']

@pulumi.input_type
class AlertArgs:
    def __init__(__self__, *,
                 action: pulumi.Input[str],
                 condition: pulumi.Input[str],
                 database: pulumi.Input[str],
                 schema: pulumi.Input[str],
                 warehouse: pulumi.Input[str],
                 alert_schedule: Optional[pulumi.Input['AlertAlertScheduleArgs']] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Alert resource.
        :param pulumi.Input[str] action: The SQL statement that should be executed if the condition returns one or more rows.
        :param pulumi.Input[str] condition: The SQL statement that represents the condition for the alert. (SELECT, SHOW, CALL)
        :param pulumi.Input[str] database: The database in which to create the alert.
        :param pulumi.Input[str] schema: The schema in which to create the alert.
        :param pulumi.Input[str] warehouse: The warehouse the alert will use.
        :param pulumi.Input['AlertAlertScheduleArgs'] alert_schedule: The schedule for periodically running an alert.
        :param pulumi.Input[str] comment: Specifies a comment for the alert.
        :param pulumi.Input[bool] enabled: Specifies if an alert should be 'started' (enabled) after creation or should remain 'suspended' (default).
        :param pulumi.Input[str] name: Specifies the identifier for the alert; must be unique for the database and schema in which the alert is created.
        """
        pulumi.set(__self__, "action", action)
        pulumi.set(__self__, "condition", condition)
        pulumi.set(__self__, "database", database)
        pulumi.set(__self__, "schema", schema)
        pulumi.set(__self__, "warehouse", warehouse)
        if alert_schedule is not None:
            pulumi.set(__self__, "alert_schedule", alert_schedule)
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def action(self) -> pulumi.Input[str]:
        """
        The SQL statement that should be executed if the condition returns one or more rows.
        """
        return pulumi.get(self, "action")

    @action.setter
    def action(self, value: pulumi.Input[str]):
        pulumi.set(self, "action", value)

    @property
    @pulumi.getter
    def condition(self) -> pulumi.Input[str]:
        """
        The SQL statement that represents the condition for the alert. (SELECT, SHOW, CALL)
        """
        return pulumi.get(self, "condition")

    @condition.setter
    def condition(self, value: pulumi.Input[str]):
        pulumi.set(self, "condition", value)

    @property
    @pulumi.getter
    def database(self) -> pulumi.Input[str]:
        """
        The database in which to create the alert.
        """
        return pulumi.get(self, "database")

    @database.setter
    def database(self, value: pulumi.Input[str]):
        pulumi.set(self, "database", value)

    @property
    @pulumi.getter
    def schema(self) -> pulumi.Input[str]:
        """
        The schema in which to create the alert.
        """
        return pulumi.get(self, "schema")

    @schema.setter
    def schema(self, value: pulumi.Input[str]):
        pulumi.set(self, "schema", value)

    @property
    @pulumi.getter
    def warehouse(self) -> pulumi.Input[str]:
        """
        The warehouse the alert will use.
        """
        return pulumi.get(self, "warehouse")

    @warehouse.setter
    def warehouse(self, value: pulumi.Input[str]):
        pulumi.set(self, "warehouse", value)

    @property
    @pulumi.getter(name="alertSchedule")
    def alert_schedule(self) -> Optional[pulumi.Input['AlertAlertScheduleArgs']]:
        """
        The schedule for periodically running an alert.
        """
        return pulumi.get(self, "alert_schedule")

    @alert_schedule.setter
    def alert_schedule(self, value: Optional[pulumi.Input['AlertAlertScheduleArgs']]):
        pulumi.set(self, "alert_schedule", value)

    @property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies a comment for the alert.
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "comment", value)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies if an alert should be 'started' (enabled) after creation or should remain 'suspended' (default).
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the identifier for the alert; must be unique for the database and schema in which the alert is created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _AlertState:
    def __init__(__self__, *,
                 action: Optional[pulumi.Input[str]] = None,
                 alert_schedule: Optional[pulumi.Input['AlertAlertScheduleArgs']] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 condition: Optional[pulumi.Input[str]] = None,
                 database: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 schema: Optional[pulumi.Input[str]] = None,
                 warehouse: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Alert resources.
        :param pulumi.Input[str] action: The SQL statement that should be executed if the condition returns one or more rows.
        :param pulumi.Input['AlertAlertScheduleArgs'] alert_schedule: The schedule for periodically running an alert.
        :param pulumi.Input[str] comment: Specifies a comment for the alert.
        :param pulumi.Input[str] condition: The SQL statement that represents the condition for the alert. (SELECT, SHOW, CALL)
        :param pulumi.Input[str] database: The database in which to create the alert.
        :param pulumi.Input[bool] enabled: Specifies if an alert should be 'started' (enabled) after creation or should remain 'suspended' (default).
        :param pulumi.Input[str] name: Specifies the identifier for the alert; must be unique for the database and schema in which the alert is created.
        :param pulumi.Input[str] schema: The schema in which to create the alert.
        :param pulumi.Input[str] warehouse: The warehouse the alert will use.
        """
        if action is not None:
            pulumi.set(__self__, "action", action)
        if alert_schedule is not None:
            pulumi.set(__self__, "alert_schedule", alert_schedule)
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if condition is not None:
            pulumi.set(__self__, "condition", condition)
        if database is not None:
            pulumi.set(__self__, "database", database)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if schema is not None:
            pulumi.set(__self__, "schema", schema)
        if warehouse is not None:
            pulumi.set(__self__, "warehouse", warehouse)

    @property
    @pulumi.getter
    def action(self) -> Optional[pulumi.Input[str]]:
        """
        The SQL statement that should be executed if the condition returns one or more rows.
        """
        return pulumi.get(self, "action")

    @action.setter
    def action(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "action", value)

    @property
    @pulumi.getter(name="alertSchedule")
    def alert_schedule(self) -> Optional[pulumi.Input['AlertAlertScheduleArgs']]:
        """
        The schedule for periodically running an alert.
        """
        return pulumi.get(self, "alert_schedule")

    @alert_schedule.setter
    def alert_schedule(self, value: Optional[pulumi.Input['AlertAlertScheduleArgs']]):
        pulumi.set(self, "alert_schedule", value)

    @property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies a comment for the alert.
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "comment", value)

    @property
    @pulumi.getter
    def condition(self) -> Optional[pulumi.Input[str]]:
        """
        The SQL statement that represents the condition for the alert. (SELECT, SHOW, CALL)
        """
        return pulumi.get(self, "condition")

    @condition.setter
    def condition(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "condition", value)

    @property
    @pulumi.getter
    def database(self) -> Optional[pulumi.Input[str]]:
        """
        The database in which to create the alert.
        """
        return pulumi.get(self, "database")

    @database.setter
    def database(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "database", value)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies if an alert should be 'started' (enabled) after creation or should remain 'suspended' (default).
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the identifier for the alert; must be unique for the database and schema in which the alert is created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def schema(self) -> Optional[pulumi.Input[str]]:
        """
        The schema in which to create the alert.
        """
        return pulumi.get(self, "schema")

    @schema.setter
    def schema(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "schema", value)

    @property
    @pulumi.getter
    def warehouse(self) -> Optional[pulumi.Input[str]]:
        """
        The warehouse the alert will use.
        """
        return pulumi.get(self, "warehouse")

    @warehouse.setter
    def warehouse(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "warehouse", value)


class Alert(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 action: Optional[pulumi.Input[str]] = None,
                 alert_schedule: Optional[pulumi.Input[pulumi.InputType['AlertAlertScheduleArgs']]] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 condition: Optional[pulumi.Input[str]] = None,
                 database: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 schema: Optional[pulumi.Input[str]] = None,
                 warehouse: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_snowflake as snowflake

        alert = snowflake.Alert("alert",
            action="select 1 as c",
            alert_schedule=snowflake.AlertAlertScheduleArgs(
                interval=10,
            ),
            comment="my alert",
            condition="select 1 as c",
            database="database",
            enabled=True,
            schema="schema",
            warehouse="warehouse")
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        format is database name | schema name | alert name

        ```sh
        $ pulumi import snowflake:index/alert:Alert example 'dbName|schemaName|alertName'
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] action: The SQL statement that should be executed if the condition returns one or more rows.
        :param pulumi.Input[pulumi.InputType['AlertAlertScheduleArgs']] alert_schedule: The schedule for periodically running an alert.
        :param pulumi.Input[str] comment: Specifies a comment for the alert.
        :param pulumi.Input[str] condition: The SQL statement that represents the condition for the alert. (SELECT, SHOW, CALL)
        :param pulumi.Input[str] database: The database in which to create the alert.
        :param pulumi.Input[bool] enabled: Specifies if an alert should be 'started' (enabled) after creation or should remain 'suspended' (default).
        :param pulumi.Input[str] name: Specifies the identifier for the alert; must be unique for the database and schema in which the alert is created.
        :param pulumi.Input[str] schema: The schema in which to create the alert.
        :param pulumi.Input[str] warehouse: The warehouse the alert will use.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AlertArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_snowflake as snowflake

        alert = snowflake.Alert("alert",
            action="select 1 as c",
            alert_schedule=snowflake.AlertAlertScheduleArgs(
                interval=10,
            ),
            comment="my alert",
            condition="select 1 as c",
            database="database",
            enabled=True,
            schema="schema",
            warehouse="warehouse")
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        format is database name | schema name | alert name

        ```sh
        $ pulumi import snowflake:index/alert:Alert example 'dbName|schemaName|alertName'
        ```

        :param str resource_name: The name of the resource.
        :param AlertArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AlertArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 action: Optional[pulumi.Input[str]] = None,
                 alert_schedule: Optional[pulumi.Input[pulumi.InputType['AlertAlertScheduleArgs']]] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 condition: Optional[pulumi.Input[str]] = None,
                 database: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 schema: Optional[pulumi.Input[str]] = None,
                 warehouse: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AlertArgs.__new__(AlertArgs)

            if action is None and not opts.urn:
                raise TypeError("Missing required property 'action'")
            __props__.__dict__["action"] = action
            __props__.__dict__["alert_schedule"] = alert_schedule
            __props__.__dict__["comment"] = comment
            if condition is None and not opts.urn:
                raise TypeError("Missing required property 'condition'")
            __props__.__dict__["condition"] = condition
            if database is None and not opts.urn:
                raise TypeError("Missing required property 'database'")
            __props__.__dict__["database"] = database
            __props__.__dict__["enabled"] = enabled
            __props__.__dict__["name"] = name
            if schema is None and not opts.urn:
                raise TypeError("Missing required property 'schema'")
            __props__.__dict__["schema"] = schema
            if warehouse is None and not opts.urn:
                raise TypeError("Missing required property 'warehouse'")
            __props__.__dict__["warehouse"] = warehouse
        super(Alert, __self__).__init__(
            'snowflake:index/alert:Alert',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            action: Optional[pulumi.Input[str]] = None,
            alert_schedule: Optional[pulumi.Input[pulumi.InputType['AlertAlertScheduleArgs']]] = None,
            comment: Optional[pulumi.Input[str]] = None,
            condition: Optional[pulumi.Input[str]] = None,
            database: Optional[pulumi.Input[str]] = None,
            enabled: Optional[pulumi.Input[bool]] = None,
            name: Optional[pulumi.Input[str]] = None,
            schema: Optional[pulumi.Input[str]] = None,
            warehouse: Optional[pulumi.Input[str]] = None) -> 'Alert':
        """
        Get an existing Alert resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] action: The SQL statement that should be executed if the condition returns one or more rows.
        :param pulumi.Input[pulumi.InputType['AlertAlertScheduleArgs']] alert_schedule: The schedule for periodically running an alert.
        :param pulumi.Input[str] comment: Specifies a comment for the alert.
        :param pulumi.Input[str] condition: The SQL statement that represents the condition for the alert. (SELECT, SHOW, CALL)
        :param pulumi.Input[str] database: The database in which to create the alert.
        :param pulumi.Input[bool] enabled: Specifies if an alert should be 'started' (enabled) after creation or should remain 'suspended' (default).
        :param pulumi.Input[str] name: Specifies the identifier for the alert; must be unique for the database and schema in which the alert is created.
        :param pulumi.Input[str] schema: The schema in which to create the alert.
        :param pulumi.Input[str] warehouse: The warehouse the alert will use.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AlertState.__new__(_AlertState)

        __props__.__dict__["action"] = action
        __props__.__dict__["alert_schedule"] = alert_schedule
        __props__.__dict__["comment"] = comment
        __props__.__dict__["condition"] = condition
        __props__.__dict__["database"] = database
        __props__.__dict__["enabled"] = enabled
        __props__.__dict__["name"] = name
        __props__.__dict__["schema"] = schema
        __props__.__dict__["warehouse"] = warehouse
        return Alert(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def action(self) -> pulumi.Output[str]:
        """
        The SQL statement that should be executed if the condition returns one or more rows.
        """
        return pulumi.get(self, "action")

    @property
    @pulumi.getter(name="alertSchedule")
    def alert_schedule(self) -> pulumi.Output[Optional['outputs.AlertAlertSchedule']]:
        """
        The schedule for periodically running an alert.
        """
        return pulumi.get(self, "alert_schedule")

    @property
    @pulumi.getter
    def comment(self) -> pulumi.Output[Optional[str]]:
        """
        Specifies a comment for the alert.
        """
        return pulumi.get(self, "comment")

    @property
    @pulumi.getter
    def condition(self) -> pulumi.Output[str]:
        """
        The SQL statement that represents the condition for the alert. (SELECT, SHOW, CALL)
        """
        return pulumi.get(self, "condition")

    @property
    @pulumi.getter
    def database(self) -> pulumi.Output[str]:
        """
        The database in which to create the alert.
        """
        return pulumi.get(self, "database")

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Output[Optional[bool]]:
        """
        Specifies if an alert should be 'started' (enabled) after creation or should remain 'suspended' (default).
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Specifies the identifier for the alert; must be unique for the database and schema in which the alert is created.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def schema(self) -> pulumi.Output[str]:
        """
        The schema in which to create the alert.
        """
        return pulumi.get(self, "schema")

    @property
    @pulumi.getter
    def warehouse(self) -> pulumi.Output[str]:
        """
        The warehouse the alert will use.
        """
        return pulumi.get(self, "warehouse")

