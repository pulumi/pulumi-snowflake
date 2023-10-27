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

__all__ = ['StageArgs', 'Stage']

@pulumi.input_type
class StageArgs:
    def __init__(__self__, *,
                 database: pulumi.Input[str],
                 schema: pulumi.Input[str],
                 aws_external_id: Optional[pulumi.Input[str]] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 copy_options: Optional[pulumi.Input[str]] = None,
                 credentials: Optional[pulumi.Input[str]] = None,
                 directory: Optional[pulumi.Input[str]] = None,
                 encryption: Optional[pulumi.Input[str]] = None,
                 file_format: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 snowflake_iam_user: Optional[pulumi.Input[str]] = None,
                 storage_integration: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input['StageTagArgs']]]] = None,
                 url: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Stage resource.
        :param pulumi.Input[str] database: Name of the database that the tag was created in.
        :param pulumi.Input[str] schema: Name of the schema that the tag was created in.
        :param pulumi.Input[str] comment: Specifies a comment for the stage.
        :param pulumi.Input[str] copy_options: Specifies the copy options for the stage.
        :param pulumi.Input[str] credentials: Specifies the credentials for the stage.
        :param pulumi.Input[str] directory: Specifies the directory settings for the stage.
        :param pulumi.Input[str] encryption: Specifies the encryption settings for the stage.
        :param pulumi.Input[str] file_format: Specifies the file format for the stage.
        :param pulumi.Input[str] name: Tag name, e.g. department.
        :param pulumi.Input[str] storage_integration: Specifies the name of the storage integration used to delegate authentication responsibility for external cloud storage to a Snowflake identity and access management (IAM) entity.
        :param pulumi.Input[Sequence[pulumi.Input['StageTagArgs']]] tags: Definitions of a tag to associate with the resource.
        :param pulumi.Input[str] url: Specifies the URL for the stage.
        """
        pulumi.set(__self__, "database", database)
        pulumi.set(__self__, "schema", schema)
        if aws_external_id is not None:
            pulumi.set(__self__, "aws_external_id", aws_external_id)
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if copy_options is not None:
            pulumi.set(__self__, "copy_options", copy_options)
        if credentials is not None:
            pulumi.set(__self__, "credentials", credentials)
        if directory is not None:
            pulumi.set(__self__, "directory", directory)
        if encryption is not None:
            pulumi.set(__self__, "encryption", encryption)
        if file_format is not None:
            pulumi.set(__self__, "file_format", file_format)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if snowflake_iam_user is not None:
            pulumi.set(__self__, "snowflake_iam_user", snowflake_iam_user)
        if storage_integration is not None:
            pulumi.set(__self__, "storage_integration", storage_integration)
        if tags is not None:
            warnings.warn("""Use the 'snowflake_tag_association' resource instead.""", DeprecationWarning)
            pulumi.log.warn("""tags is deprecated: Use the 'snowflake_tag_association' resource instead.""")
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if url is not None:
            pulumi.set(__self__, "url", url)

    @property
    @pulumi.getter
    def database(self) -> pulumi.Input[str]:
        """
        Name of the database that the tag was created in.
        """
        return pulumi.get(self, "database")

    @database.setter
    def database(self, value: pulumi.Input[str]):
        pulumi.set(self, "database", value)

    @property
    @pulumi.getter
    def schema(self) -> pulumi.Input[str]:
        """
        Name of the schema that the tag was created in.
        """
        return pulumi.get(self, "schema")

    @schema.setter
    def schema(self, value: pulumi.Input[str]):
        pulumi.set(self, "schema", value)

    @property
    @pulumi.getter(name="awsExternalId")
    def aws_external_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "aws_external_id")

    @aws_external_id.setter
    def aws_external_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "aws_external_id", value)

    @property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies a comment for the stage.
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "comment", value)

    @property
    @pulumi.getter(name="copyOptions")
    def copy_options(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the copy options for the stage.
        """
        return pulumi.get(self, "copy_options")

    @copy_options.setter
    def copy_options(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "copy_options", value)

    @property
    @pulumi.getter
    def credentials(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the credentials for the stage.
        """
        return pulumi.get(self, "credentials")

    @credentials.setter
    def credentials(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "credentials", value)

    @property
    @pulumi.getter
    def directory(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the directory settings for the stage.
        """
        return pulumi.get(self, "directory")

    @directory.setter
    def directory(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "directory", value)

    @property
    @pulumi.getter
    def encryption(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the encryption settings for the stage.
        """
        return pulumi.get(self, "encryption")

    @encryption.setter
    def encryption(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "encryption", value)

    @property
    @pulumi.getter(name="fileFormat")
    def file_format(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the file format for the stage.
        """
        return pulumi.get(self, "file_format")

    @file_format.setter
    def file_format(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "file_format", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Tag name, e.g. department.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="snowflakeIamUser")
    def snowflake_iam_user(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "snowflake_iam_user")

    @snowflake_iam_user.setter
    def snowflake_iam_user(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "snowflake_iam_user", value)

    @property
    @pulumi.getter(name="storageIntegration")
    def storage_integration(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the name of the storage integration used to delegate authentication responsibility for external cloud storage to a Snowflake identity and access management (IAM) entity.
        """
        return pulumi.get(self, "storage_integration")

    @storage_integration.setter
    def storage_integration(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "storage_integration", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['StageTagArgs']]]]:
        """
        Definitions of a tag to associate with the resource.
        """
        warnings.warn("""Use the 'snowflake_tag_association' resource instead.""", DeprecationWarning)
        pulumi.log.warn("""tags is deprecated: Use the 'snowflake_tag_association' resource instead.""")

        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['StageTagArgs']]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter
    def url(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the URL for the stage.
        """
        return pulumi.get(self, "url")

    @url.setter
    def url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "url", value)


@pulumi.input_type
class _StageState:
    def __init__(__self__, *,
                 aws_external_id: Optional[pulumi.Input[str]] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 copy_options: Optional[pulumi.Input[str]] = None,
                 credentials: Optional[pulumi.Input[str]] = None,
                 database: Optional[pulumi.Input[str]] = None,
                 directory: Optional[pulumi.Input[str]] = None,
                 encryption: Optional[pulumi.Input[str]] = None,
                 file_format: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 schema: Optional[pulumi.Input[str]] = None,
                 snowflake_iam_user: Optional[pulumi.Input[str]] = None,
                 storage_integration: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input['StageTagArgs']]]] = None,
                 url: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Stage resources.
        :param pulumi.Input[str] comment: Specifies a comment for the stage.
        :param pulumi.Input[str] copy_options: Specifies the copy options for the stage.
        :param pulumi.Input[str] credentials: Specifies the credentials for the stage.
        :param pulumi.Input[str] database: Name of the database that the tag was created in.
        :param pulumi.Input[str] directory: Specifies the directory settings for the stage.
        :param pulumi.Input[str] encryption: Specifies the encryption settings for the stage.
        :param pulumi.Input[str] file_format: Specifies the file format for the stage.
        :param pulumi.Input[str] name: Tag name, e.g. department.
        :param pulumi.Input[str] schema: Name of the schema that the tag was created in.
        :param pulumi.Input[str] storage_integration: Specifies the name of the storage integration used to delegate authentication responsibility for external cloud storage to a Snowflake identity and access management (IAM) entity.
        :param pulumi.Input[Sequence[pulumi.Input['StageTagArgs']]] tags: Definitions of a tag to associate with the resource.
        :param pulumi.Input[str] url: Specifies the URL for the stage.
        """
        if aws_external_id is not None:
            pulumi.set(__self__, "aws_external_id", aws_external_id)
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if copy_options is not None:
            pulumi.set(__self__, "copy_options", copy_options)
        if credentials is not None:
            pulumi.set(__self__, "credentials", credentials)
        if database is not None:
            pulumi.set(__self__, "database", database)
        if directory is not None:
            pulumi.set(__self__, "directory", directory)
        if encryption is not None:
            pulumi.set(__self__, "encryption", encryption)
        if file_format is not None:
            pulumi.set(__self__, "file_format", file_format)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if schema is not None:
            pulumi.set(__self__, "schema", schema)
        if snowflake_iam_user is not None:
            pulumi.set(__self__, "snowflake_iam_user", snowflake_iam_user)
        if storage_integration is not None:
            pulumi.set(__self__, "storage_integration", storage_integration)
        if tags is not None:
            warnings.warn("""Use the 'snowflake_tag_association' resource instead.""", DeprecationWarning)
            pulumi.log.warn("""tags is deprecated: Use the 'snowflake_tag_association' resource instead.""")
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if url is not None:
            pulumi.set(__self__, "url", url)

    @property
    @pulumi.getter(name="awsExternalId")
    def aws_external_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "aws_external_id")

    @aws_external_id.setter
    def aws_external_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "aws_external_id", value)

    @property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies a comment for the stage.
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "comment", value)

    @property
    @pulumi.getter(name="copyOptions")
    def copy_options(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the copy options for the stage.
        """
        return pulumi.get(self, "copy_options")

    @copy_options.setter
    def copy_options(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "copy_options", value)

    @property
    @pulumi.getter
    def credentials(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the credentials for the stage.
        """
        return pulumi.get(self, "credentials")

    @credentials.setter
    def credentials(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "credentials", value)

    @property
    @pulumi.getter
    def database(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the database that the tag was created in.
        """
        return pulumi.get(self, "database")

    @database.setter
    def database(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "database", value)

    @property
    @pulumi.getter
    def directory(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the directory settings for the stage.
        """
        return pulumi.get(self, "directory")

    @directory.setter
    def directory(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "directory", value)

    @property
    @pulumi.getter
    def encryption(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the encryption settings for the stage.
        """
        return pulumi.get(self, "encryption")

    @encryption.setter
    def encryption(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "encryption", value)

    @property
    @pulumi.getter(name="fileFormat")
    def file_format(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the file format for the stage.
        """
        return pulumi.get(self, "file_format")

    @file_format.setter
    def file_format(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "file_format", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Tag name, e.g. department.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def schema(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the schema that the tag was created in.
        """
        return pulumi.get(self, "schema")

    @schema.setter
    def schema(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "schema", value)

    @property
    @pulumi.getter(name="snowflakeIamUser")
    def snowflake_iam_user(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "snowflake_iam_user")

    @snowflake_iam_user.setter
    def snowflake_iam_user(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "snowflake_iam_user", value)

    @property
    @pulumi.getter(name="storageIntegration")
    def storage_integration(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the name of the storage integration used to delegate authentication responsibility for external cloud storage to a Snowflake identity and access management (IAM) entity.
        """
        return pulumi.get(self, "storage_integration")

    @storage_integration.setter
    def storage_integration(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "storage_integration", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['StageTagArgs']]]]:
        """
        Definitions of a tag to associate with the resource.
        """
        warnings.warn("""Use the 'snowflake_tag_association' resource instead.""", DeprecationWarning)
        pulumi.log.warn("""tags is deprecated: Use the 'snowflake_tag_association' resource instead.""")

        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['StageTagArgs']]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter
    def url(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the URL for the stage.
        """
        return pulumi.get(self, "url")

    @url.setter
    def url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "url", value)


class Stage(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 aws_external_id: Optional[pulumi.Input[str]] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 copy_options: Optional[pulumi.Input[str]] = None,
                 credentials: Optional[pulumi.Input[str]] = None,
                 database: Optional[pulumi.Input[str]] = None,
                 directory: Optional[pulumi.Input[str]] = None,
                 encryption: Optional[pulumi.Input[str]] = None,
                 file_format: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 schema: Optional[pulumi.Input[str]] = None,
                 snowflake_iam_user: Optional[pulumi.Input[str]] = None,
                 storage_integration: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['StageTagArgs']]]]] = None,
                 url: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_snowflake as snowflake

        example_stage = snowflake.Stage("exampleStage",
            url="s3://com.example.bucket/prefix",
            database="EXAMPLE_DB",
            schema="EXAMPLE_SCHEMA",
            credentials=f"AWS_KEY_ID='{var['example_aws_key_id']}' AWS_SECRET_KEY='{var['example_aws_secret_key']}'")
        grant_example_stage = snowflake.StageGrant("grantExampleStage",
            database_name=example_stage.database,
            schema_name=example_stage.schema,
            roles=["LOADER"],
            privilege="OWNERSHIP",
            stage_name=example_stage.name)
        ```

        ## Import

        format is database name | schema name | stage name

        ```sh
         $ pulumi import snowflake:index/stage:Stage example 'dbName|schemaName|stageName'
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] comment: Specifies a comment for the stage.
        :param pulumi.Input[str] copy_options: Specifies the copy options for the stage.
        :param pulumi.Input[str] credentials: Specifies the credentials for the stage.
        :param pulumi.Input[str] database: Name of the database that the tag was created in.
        :param pulumi.Input[str] directory: Specifies the directory settings for the stage.
        :param pulumi.Input[str] encryption: Specifies the encryption settings for the stage.
        :param pulumi.Input[str] file_format: Specifies the file format for the stage.
        :param pulumi.Input[str] name: Tag name, e.g. department.
        :param pulumi.Input[str] schema: Name of the schema that the tag was created in.
        :param pulumi.Input[str] storage_integration: Specifies the name of the storage integration used to delegate authentication responsibility for external cloud storage to a Snowflake identity and access management (IAM) entity.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['StageTagArgs']]]] tags: Definitions of a tag to associate with the resource.
        :param pulumi.Input[str] url: Specifies the URL for the stage.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: StageArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_snowflake as snowflake

        example_stage = snowflake.Stage("exampleStage",
            url="s3://com.example.bucket/prefix",
            database="EXAMPLE_DB",
            schema="EXAMPLE_SCHEMA",
            credentials=f"AWS_KEY_ID='{var['example_aws_key_id']}' AWS_SECRET_KEY='{var['example_aws_secret_key']}'")
        grant_example_stage = snowflake.StageGrant("grantExampleStage",
            database_name=example_stage.database,
            schema_name=example_stage.schema,
            roles=["LOADER"],
            privilege="OWNERSHIP",
            stage_name=example_stage.name)
        ```

        ## Import

        format is database name | schema name | stage name

        ```sh
         $ pulumi import snowflake:index/stage:Stage example 'dbName|schemaName|stageName'
        ```

        :param str resource_name: The name of the resource.
        :param StageArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(StageArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 aws_external_id: Optional[pulumi.Input[str]] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 copy_options: Optional[pulumi.Input[str]] = None,
                 credentials: Optional[pulumi.Input[str]] = None,
                 database: Optional[pulumi.Input[str]] = None,
                 directory: Optional[pulumi.Input[str]] = None,
                 encryption: Optional[pulumi.Input[str]] = None,
                 file_format: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 schema: Optional[pulumi.Input[str]] = None,
                 snowflake_iam_user: Optional[pulumi.Input[str]] = None,
                 storage_integration: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['StageTagArgs']]]]] = None,
                 url: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = StageArgs.__new__(StageArgs)

            __props__.__dict__["aws_external_id"] = aws_external_id
            __props__.__dict__["comment"] = comment
            __props__.__dict__["copy_options"] = copy_options
            __props__.__dict__["credentials"] = None if credentials is None else pulumi.Output.secret(credentials)
            if database is None and not opts.urn:
                raise TypeError("Missing required property 'database'")
            __props__.__dict__["database"] = database
            __props__.__dict__["directory"] = directory
            __props__.__dict__["encryption"] = encryption
            __props__.__dict__["file_format"] = file_format
            __props__.__dict__["name"] = name
            if schema is None and not opts.urn:
                raise TypeError("Missing required property 'schema'")
            __props__.__dict__["schema"] = schema
            __props__.__dict__["snowflake_iam_user"] = snowflake_iam_user
            __props__.__dict__["storage_integration"] = storage_integration
            __props__.__dict__["tags"] = tags
            __props__.__dict__["url"] = url
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["credentials"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(Stage, __self__).__init__(
            'snowflake:index/stage:Stage',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            aws_external_id: Optional[pulumi.Input[str]] = None,
            comment: Optional[pulumi.Input[str]] = None,
            copy_options: Optional[pulumi.Input[str]] = None,
            credentials: Optional[pulumi.Input[str]] = None,
            database: Optional[pulumi.Input[str]] = None,
            directory: Optional[pulumi.Input[str]] = None,
            encryption: Optional[pulumi.Input[str]] = None,
            file_format: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            schema: Optional[pulumi.Input[str]] = None,
            snowflake_iam_user: Optional[pulumi.Input[str]] = None,
            storage_integration: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['StageTagArgs']]]]] = None,
            url: Optional[pulumi.Input[str]] = None) -> 'Stage':
        """
        Get an existing Stage resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] comment: Specifies a comment for the stage.
        :param pulumi.Input[str] copy_options: Specifies the copy options for the stage.
        :param pulumi.Input[str] credentials: Specifies the credentials for the stage.
        :param pulumi.Input[str] database: Name of the database that the tag was created in.
        :param pulumi.Input[str] directory: Specifies the directory settings for the stage.
        :param pulumi.Input[str] encryption: Specifies the encryption settings for the stage.
        :param pulumi.Input[str] file_format: Specifies the file format for the stage.
        :param pulumi.Input[str] name: Tag name, e.g. department.
        :param pulumi.Input[str] schema: Name of the schema that the tag was created in.
        :param pulumi.Input[str] storage_integration: Specifies the name of the storage integration used to delegate authentication responsibility for external cloud storage to a Snowflake identity and access management (IAM) entity.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['StageTagArgs']]]] tags: Definitions of a tag to associate with the resource.
        :param pulumi.Input[str] url: Specifies the URL for the stage.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _StageState.__new__(_StageState)

        __props__.__dict__["aws_external_id"] = aws_external_id
        __props__.__dict__["comment"] = comment
        __props__.__dict__["copy_options"] = copy_options
        __props__.__dict__["credentials"] = credentials
        __props__.__dict__["database"] = database
        __props__.__dict__["directory"] = directory
        __props__.__dict__["encryption"] = encryption
        __props__.__dict__["file_format"] = file_format
        __props__.__dict__["name"] = name
        __props__.__dict__["schema"] = schema
        __props__.__dict__["snowflake_iam_user"] = snowflake_iam_user
        __props__.__dict__["storage_integration"] = storage_integration
        __props__.__dict__["tags"] = tags
        __props__.__dict__["url"] = url
        return Stage(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="awsExternalId")
    def aws_external_id(self) -> pulumi.Output[str]:
        return pulumi.get(self, "aws_external_id")

    @property
    @pulumi.getter
    def comment(self) -> pulumi.Output[Optional[str]]:
        """
        Specifies a comment for the stage.
        """
        return pulumi.get(self, "comment")

    @property
    @pulumi.getter(name="copyOptions")
    def copy_options(self) -> pulumi.Output[Optional[str]]:
        """
        Specifies the copy options for the stage.
        """
        return pulumi.get(self, "copy_options")

    @property
    @pulumi.getter
    def credentials(self) -> pulumi.Output[Optional[str]]:
        """
        Specifies the credentials for the stage.
        """
        return pulumi.get(self, "credentials")

    @property
    @pulumi.getter
    def database(self) -> pulumi.Output[str]:
        """
        Name of the database that the tag was created in.
        """
        return pulumi.get(self, "database")

    @property
    @pulumi.getter
    def directory(self) -> pulumi.Output[Optional[str]]:
        """
        Specifies the directory settings for the stage.
        """
        return pulumi.get(self, "directory")

    @property
    @pulumi.getter
    def encryption(self) -> pulumi.Output[Optional[str]]:
        """
        Specifies the encryption settings for the stage.
        """
        return pulumi.get(self, "encryption")

    @property
    @pulumi.getter(name="fileFormat")
    def file_format(self) -> pulumi.Output[Optional[str]]:
        """
        Specifies the file format for the stage.
        """
        return pulumi.get(self, "file_format")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Tag name, e.g. department.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def schema(self) -> pulumi.Output[str]:
        """
        Name of the schema that the tag was created in.
        """
        return pulumi.get(self, "schema")

    @property
    @pulumi.getter(name="snowflakeIamUser")
    def snowflake_iam_user(self) -> pulumi.Output[str]:
        return pulumi.get(self, "snowflake_iam_user")

    @property
    @pulumi.getter(name="storageIntegration")
    def storage_integration(self) -> pulumi.Output[Optional[str]]:
        """
        Specifies the name of the storage integration used to delegate authentication responsibility for external cloud storage to a Snowflake identity and access management (IAM) entity.
        """
        return pulumi.get(self, "storage_integration")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Sequence['outputs.StageTag']]]:
        """
        Definitions of a tag to associate with the resource.
        """
        warnings.warn("""Use the 'snowflake_tag_association' resource instead.""", DeprecationWarning)
        pulumi.log.warn("""tags is deprecated: Use the 'snowflake_tag_association' resource instead.""")

        return pulumi.get(self, "tags")

    @property
    @pulumi.getter
    def url(self) -> pulumi.Output[Optional[str]]:
        """
        Specifies the URL for the stage.
        """
        return pulumi.get(self, "url")

