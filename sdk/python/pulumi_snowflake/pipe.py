# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['PipeArgs', 'Pipe']

@pulumi.input_type
class PipeArgs:
    def __init__(__self__, *,
                 copy_statement: pulumi.Input[str],
                 database: pulumi.Input[str],
                 schema: pulumi.Input[str],
                 auto_ingest: Optional[pulumi.Input[bool]] = None,
                 aws_sns_topic_arn: Optional[pulumi.Input[str]] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 error_integration: Optional[pulumi.Input[str]] = None,
                 integration: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Pipe resource.
        :param pulumi.Input[str] copy_statement: Specifies the copy statement for the pipe.
        :param pulumi.Input[str] database: The database in which to create the pipe.
        :param pulumi.Input[str] schema: The schema in which to create the pipe.
        :param pulumi.Input[bool] auto_ingest: Specifies a auto_ingest param for the pipe.
        :param pulumi.Input[str] aws_sns_topic_arn: Specifies the Amazon Resource Name (ARN) for the SNS topic for your S3 bucket.
        :param pulumi.Input[str] comment: Specifies a comment for the pipe.
        :param pulumi.Input[str] error_integration: Specifies the name of the notification integration used for error notifications.
        :param pulumi.Input[str] integration: Specifies an integration for the pipe.
        :param pulumi.Input[str] name: Specifies the identifier for the pipe; must be unique for the database and schema in which the pipe is created.
        """
        pulumi.set(__self__, "copy_statement", copy_statement)
        pulumi.set(__self__, "database", database)
        pulumi.set(__self__, "schema", schema)
        if auto_ingest is not None:
            pulumi.set(__self__, "auto_ingest", auto_ingest)
        if aws_sns_topic_arn is not None:
            pulumi.set(__self__, "aws_sns_topic_arn", aws_sns_topic_arn)
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if error_integration is not None:
            pulumi.set(__self__, "error_integration", error_integration)
        if integration is not None:
            pulumi.set(__self__, "integration", integration)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="copyStatement")
    def copy_statement(self) -> pulumi.Input[str]:
        """
        Specifies the copy statement for the pipe.
        """
        return pulumi.get(self, "copy_statement")

    @copy_statement.setter
    def copy_statement(self, value: pulumi.Input[str]):
        pulumi.set(self, "copy_statement", value)

    @property
    @pulumi.getter
    def database(self) -> pulumi.Input[str]:
        """
        The database in which to create the pipe.
        """
        return pulumi.get(self, "database")

    @database.setter
    def database(self, value: pulumi.Input[str]):
        pulumi.set(self, "database", value)

    @property
    @pulumi.getter
    def schema(self) -> pulumi.Input[str]:
        """
        The schema in which to create the pipe.
        """
        return pulumi.get(self, "schema")

    @schema.setter
    def schema(self, value: pulumi.Input[str]):
        pulumi.set(self, "schema", value)

    @property
    @pulumi.getter(name="autoIngest")
    def auto_ingest(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies a auto_ingest param for the pipe.
        """
        return pulumi.get(self, "auto_ingest")

    @auto_ingest.setter
    def auto_ingest(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "auto_ingest", value)

    @property
    @pulumi.getter(name="awsSnsTopicArn")
    def aws_sns_topic_arn(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the Amazon Resource Name (ARN) for the SNS topic for your S3 bucket.
        """
        return pulumi.get(self, "aws_sns_topic_arn")

    @aws_sns_topic_arn.setter
    def aws_sns_topic_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "aws_sns_topic_arn", value)

    @property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies a comment for the pipe.
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "comment", value)

    @property
    @pulumi.getter(name="errorIntegration")
    def error_integration(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the name of the notification integration used for error notifications.
        """
        return pulumi.get(self, "error_integration")

    @error_integration.setter
    def error_integration(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "error_integration", value)

    @property
    @pulumi.getter
    def integration(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies an integration for the pipe.
        """
        return pulumi.get(self, "integration")

    @integration.setter
    def integration(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "integration", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the identifier for the pipe; must be unique for the database and schema in which the pipe is created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _PipeState:
    def __init__(__self__, *,
                 auto_ingest: Optional[pulumi.Input[bool]] = None,
                 aws_sns_topic_arn: Optional[pulumi.Input[str]] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 copy_statement: Optional[pulumi.Input[str]] = None,
                 database: Optional[pulumi.Input[str]] = None,
                 error_integration: Optional[pulumi.Input[str]] = None,
                 integration: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 notification_channel: Optional[pulumi.Input[str]] = None,
                 owner: Optional[pulumi.Input[str]] = None,
                 schema: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Pipe resources.
        :param pulumi.Input[bool] auto_ingest: Specifies a auto_ingest param for the pipe.
        :param pulumi.Input[str] aws_sns_topic_arn: Specifies the Amazon Resource Name (ARN) for the SNS topic for your S3 bucket.
        :param pulumi.Input[str] comment: Specifies a comment for the pipe.
        :param pulumi.Input[str] copy_statement: Specifies the copy statement for the pipe.
        :param pulumi.Input[str] database: The database in which to create the pipe.
        :param pulumi.Input[str] error_integration: Specifies the name of the notification integration used for error notifications.
        :param pulumi.Input[str] integration: Specifies an integration for the pipe.
        :param pulumi.Input[str] name: Specifies the identifier for the pipe; must be unique for the database and schema in which the pipe is created.
        :param pulumi.Input[str] notification_channel: Amazon Resource Name of the Amazon SQS queue for the stage named in the DEFINITION column.
        :param pulumi.Input[str] owner: Name of the role that owns the pipe.
        :param pulumi.Input[str] schema: The schema in which to create the pipe.
        """
        if auto_ingest is not None:
            pulumi.set(__self__, "auto_ingest", auto_ingest)
        if aws_sns_topic_arn is not None:
            pulumi.set(__self__, "aws_sns_topic_arn", aws_sns_topic_arn)
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if copy_statement is not None:
            pulumi.set(__self__, "copy_statement", copy_statement)
        if database is not None:
            pulumi.set(__self__, "database", database)
        if error_integration is not None:
            pulumi.set(__self__, "error_integration", error_integration)
        if integration is not None:
            pulumi.set(__self__, "integration", integration)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if notification_channel is not None:
            pulumi.set(__self__, "notification_channel", notification_channel)
        if owner is not None:
            pulumi.set(__self__, "owner", owner)
        if schema is not None:
            pulumi.set(__self__, "schema", schema)

    @property
    @pulumi.getter(name="autoIngest")
    def auto_ingest(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies a auto_ingest param for the pipe.
        """
        return pulumi.get(self, "auto_ingest")

    @auto_ingest.setter
    def auto_ingest(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "auto_ingest", value)

    @property
    @pulumi.getter(name="awsSnsTopicArn")
    def aws_sns_topic_arn(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the Amazon Resource Name (ARN) for the SNS topic for your S3 bucket.
        """
        return pulumi.get(self, "aws_sns_topic_arn")

    @aws_sns_topic_arn.setter
    def aws_sns_topic_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "aws_sns_topic_arn", value)

    @property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies a comment for the pipe.
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "comment", value)

    @property
    @pulumi.getter(name="copyStatement")
    def copy_statement(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the copy statement for the pipe.
        """
        return pulumi.get(self, "copy_statement")

    @copy_statement.setter
    def copy_statement(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "copy_statement", value)

    @property
    @pulumi.getter
    def database(self) -> Optional[pulumi.Input[str]]:
        """
        The database in which to create the pipe.
        """
        return pulumi.get(self, "database")

    @database.setter
    def database(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "database", value)

    @property
    @pulumi.getter(name="errorIntegration")
    def error_integration(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the name of the notification integration used for error notifications.
        """
        return pulumi.get(self, "error_integration")

    @error_integration.setter
    def error_integration(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "error_integration", value)

    @property
    @pulumi.getter
    def integration(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies an integration for the pipe.
        """
        return pulumi.get(self, "integration")

    @integration.setter
    def integration(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "integration", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the identifier for the pipe; must be unique for the database and schema in which the pipe is created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="notificationChannel")
    def notification_channel(self) -> Optional[pulumi.Input[str]]:
        """
        Amazon Resource Name of the Amazon SQS queue for the stage named in the DEFINITION column.
        """
        return pulumi.get(self, "notification_channel")

    @notification_channel.setter
    def notification_channel(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "notification_channel", value)

    @property
    @pulumi.getter
    def owner(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the role that owns the pipe.
        """
        return pulumi.get(self, "owner")

    @owner.setter
    def owner(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "owner", value)

    @property
    @pulumi.getter
    def schema(self) -> Optional[pulumi.Input[str]]:
        """
        The schema in which to create the pipe.
        """
        return pulumi.get(self, "schema")

    @schema.setter
    def schema(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "schema", value)


class Pipe(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 auto_ingest: Optional[pulumi.Input[bool]] = None,
                 aws_sns_topic_arn: Optional[pulumi.Input[str]] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 copy_statement: Optional[pulumi.Input[str]] = None,
                 database: Optional[pulumi.Input[str]] = None,
                 error_integration: Optional[pulumi.Input[str]] = None,
                 integration: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 schema: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        > **Note** Right now, changes for the `integration` field are not detected. This will be resolved in the upcoming refactoring HCL meta-argument.

        ## Import

        format is database name | schema name | pipe name

        ```sh
        $ pulumi import snowflake:index/pipe:Pipe example 'dbName|schemaName|pipeName'
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] auto_ingest: Specifies a auto_ingest param for the pipe.
        :param pulumi.Input[str] aws_sns_topic_arn: Specifies the Amazon Resource Name (ARN) for the SNS topic for your S3 bucket.
        :param pulumi.Input[str] comment: Specifies a comment for the pipe.
        :param pulumi.Input[str] copy_statement: Specifies the copy statement for the pipe.
        :param pulumi.Input[str] database: The database in which to create the pipe.
        :param pulumi.Input[str] error_integration: Specifies the name of the notification integration used for error notifications.
        :param pulumi.Input[str] integration: Specifies an integration for the pipe.
        :param pulumi.Input[str] name: Specifies the identifier for the pipe; must be unique for the database and schema in which the pipe is created.
        :param pulumi.Input[str] schema: The schema in which to create the pipe.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: PipeArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        > **Note** Right now, changes for the `integration` field are not detected. This will be resolved in the upcoming refactoring HCL meta-argument.

        ## Import

        format is database name | schema name | pipe name

        ```sh
        $ pulumi import snowflake:index/pipe:Pipe example 'dbName|schemaName|pipeName'
        ```

        :param str resource_name: The name of the resource.
        :param PipeArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(PipeArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 auto_ingest: Optional[pulumi.Input[bool]] = None,
                 aws_sns_topic_arn: Optional[pulumi.Input[str]] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 copy_statement: Optional[pulumi.Input[str]] = None,
                 database: Optional[pulumi.Input[str]] = None,
                 error_integration: Optional[pulumi.Input[str]] = None,
                 integration: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 schema: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = PipeArgs.__new__(PipeArgs)

            __props__.__dict__["auto_ingest"] = auto_ingest
            __props__.__dict__["aws_sns_topic_arn"] = aws_sns_topic_arn
            __props__.__dict__["comment"] = comment
            if copy_statement is None and not opts.urn:
                raise TypeError("Missing required property 'copy_statement'")
            __props__.__dict__["copy_statement"] = copy_statement
            if database is None and not opts.urn:
                raise TypeError("Missing required property 'database'")
            __props__.__dict__["database"] = database
            __props__.__dict__["error_integration"] = error_integration
            __props__.__dict__["integration"] = integration
            __props__.__dict__["name"] = name
            if schema is None and not opts.urn:
                raise TypeError("Missing required property 'schema'")
            __props__.__dict__["schema"] = schema
            __props__.__dict__["notification_channel"] = None
            __props__.__dict__["owner"] = None
        super(Pipe, __self__).__init__(
            'snowflake:index/pipe:Pipe',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            auto_ingest: Optional[pulumi.Input[bool]] = None,
            aws_sns_topic_arn: Optional[pulumi.Input[str]] = None,
            comment: Optional[pulumi.Input[str]] = None,
            copy_statement: Optional[pulumi.Input[str]] = None,
            database: Optional[pulumi.Input[str]] = None,
            error_integration: Optional[pulumi.Input[str]] = None,
            integration: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            notification_channel: Optional[pulumi.Input[str]] = None,
            owner: Optional[pulumi.Input[str]] = None,
            schema: Optional[pulumi.Input[str]] = None) -> 'Pipe':
        """
        Get an existing Pipe resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] auto_ingest: Specifies a auto_ingest param for the pipe.
        :param pulumi.Input[str] aws_sns_topic_arn: Specifies the Amazon Resource Name (ARN) for the SNS topic for your S3 bucket.
        :param pulumi.Input[str] comment: Specifies a comment for the pipe.
        :param pulumi.Input[str] copy_statement: Specifies the copy statement for the pipe.
        :param pulumi.Input[str] database: The database in which to create the pipe.
        :param pulumi.Input[str] error_integration: Specifies the name of the notification integration used for error notifications.
        :param pulumi.Input[str] integration: Specifies an integration for the pipe.
        :param pulumi.Input[str] name: Specifies the identifier for the pipe; must be unique for the database and schema in which the pipe is created.
        :param pulumi.Input[str] notification_channel: Amazon Resource Name of the Amazon SQS queue for the stage named in the DEFINITION column.
        :param pulumi.Input[str] owner: Name of the role that owns the pipe.
        :param pulumi.Input[str] schema: The schema in which to create the pipe.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _PipeState.__new__(_PipeState)

        __props__.__dict__["auto_ingest"] = auto_ingest
        __props__.__dict__["aws_sns_topic_arn"] = aws_sns_topic_arn
        __props__.__dict__["comment"] = comment
        __props__.__dict__["copy_statement"] = copy_statement
        __props__.__dict__["database"] = database
        __props__.__dict__["error_integration"] = error_integration
        __props__.__dict__["integration"] = integration
        __props__.__dict__["name"] = name
        __props__.__dict__["notification_channel"] = notification_channel
        __props__.__dict__["owner"] = owner
        __props__.__dict__["schema"] = schema
        return Pipe(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="autoIngest")
    def auto_ingest(self) -> pulumi.Output[Optional[bool]]:
        """
        Specifies a auto_ingest param for the pipe.
        """
        return pulumi.get(self, "auto_ingest")

    @property
    @pulumi.getter(name="awsSnsTopicArn")
    def aws_sns_topic_arn(self) -> pulumi.Output[Optional[str]]:
        """
        Specifies the Amazon Resource Name (ARN) for the SNS topic for your S3 bucket.
        """
        return pulumi.get(self, "aws_sns_topic_arn")

    @property
    @pulumi.getter
    def comment(self) -> pulumi.Output[Optional[str]]:
        """
        Specifies a comment for the pipe.
        """
        return pulumi.get(self, "comment")

    @property
    @pulumi.getter(name="copyStatement")
    def copy_statement(self) -> pulumi.Output[str]:
        """
        Specifies the copy statement for the pipe.
        """
        return pulumi.get(self, "copy_statement")

    @property
    @pulumi.getter
    def database(self) -> pulumi.Output[str]:
        """
        The database in which to create the pipe.
        """
        return pulumi.get(self, "database")

    @property
    @pulumi.getter(name="errorIntegration")
    def error_integration(self) -> pulumi.Output[Optional[str]]:
        """
        Specifies the name of the notification integration used for error notifications.
        """
        return pulumi.get(self, "error_integration")

    @property
    @pulumi.getter
    def integration(self) -> pulumi.Output[Optional[str]]:
        """
        Specifies an integration for the pipe.
        """
        return pulumi.get(self, "integration")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Specifies the identifier for the pipe; must be unique for the database and schema in which the pipe is created.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="notificationChannel")
    def notification_channel(self) -> pulumi.Output[str]:
        """
        Amazon Resource Name of the Amazon SQS queue for the stage named in the DEFINITION column.
        """
        return pulumi.get(self, "notification_channel")

    @property
    @pulumi.getter
    def owner(self) -> pulumi.Output[str]:
        """
        Name of the role that owns the pipe.
        """
        return pulumi.get(self, "owner")

    @property
    @pulumi.getter
    def schema(self) -> pulumi.Output[str]:
        """
        The schema in which to create the pipe.
        """
        return pulumi.get(self, "schema")

