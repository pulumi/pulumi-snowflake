# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

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
from ._inputs import *

__all__ = ['SecretWithAuthorizationCodeGrantArgs', 'SecretWithAuthorizationCodeGrant']

@pulumi.input_type
class SecretWithAuthorizationCodeGrantArgs:
    def __init__(__self__, *,
                 api_authentication: pulumi.Input[str],
                 database: pulumi.Input[str],
                 oauth_refresh_token: pulumi.Input[str],
                 oauth_refresh_token_expiry_time: pulumi.Input[str],
                 schema: pulumi.Input[str],
                 comment: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a SecretWithAuthorizationCodeGrant resource.
        :param pulumi.Input[str] api_authentication: Specifies the name value of the Snowflake security integration that connects Snowflake to an external service. For more information about this resource, see docs.
        :param pulumi.Input[str] database: The database in which to create the secret Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        :param pulumi.Input[str] oauth_refresh_token_expiry_time: Specifies the timestamp as a string when the OAuth refresh token expires. Accepted string formats: YYYY-MM-DD, YYYY-MM-DD HH:MI, YYYY-MM-DD HH:MI:SS, YYYY-MM-DD HH:MI \\n\\n
        :param pulumi.Input[str] schema: The schema in which to create the secret. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        :param pulumi.Input[str] comment: Specifies a comment for the secret.
        :param pulumi.Input[str] name: String that specifies the identifier (i.e. name) for the secret, must be unique in your schema. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        """
        pulumi.set(__self__, "api_authentication", api_authentication)
        pulumi.set(__self__, "database", database)
        pulumi.set(__self__, "oauth_refresh_token", oauth_refresh_token)
        pulumi.set(__self__, "oauth_refresh_token_expiry_time", oauth_refresh_token_expiry_time)
        pulumi.set(__self__, "schema", schema)
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="apiAuthentication")
    def api_authentication(self) -> pulumi.Input[str]:
        """
        Specifies the name value of the Snowflake security integration that connects Snowflake to an external service. For more information about this resource, see docs.
        """
        return pulumi.get(self, "api_authentication")

    @api_authentication.setter
    def api_authentication(self, value: pulumi.Input[str]):
        pulumi.set(self, "api_authentication", value)

    @property
    @pulumi.getter
    def database(self) -> pulumi.Input[str]:
        """
        The database in which to create the secret Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        """
        return pulumi.get(self, "database")

    @database.setter
    def database(self, value: pulumi.Input[str]):
        pulumi.set(self, "database", value)

    @property
    @pulumi.getter(name="oauthRefreshToken")
    def oauth_refresh_token(self) -> pulumi.Input[str]:
        return pulumi.get(self, "oauth_refresh_token")

    @oauth_refresh_token.setter
    def oauth_refresh_token(self, value: pulumi.Input[str]):
        pulumi.set(self, "oauth_refresh_token", value)

    @property
    @pulumi.getter(name="oauthRefreshTokenExpiryTime")
    def oauth_refresh_token_expiry_time(self) -> pulumi.Input[str]:
        """
        Specifies the timestamp as a string when the OAuth refresh token expires. Accepted string formats: YYYY-MM-DD, YYYY-MM-DD HH:MI, YYYY-MM-DD HH:MI:SS, YYYY-MM-DD HH:MI \\n\\n
        """
        return pulumi.get(self, "oauth_refresh_token_expiry_time")

    @oauth_refresh_token_expiry_time.setter
    def oauth_refresh_token_expiry_time(self, value: pulumi.Input[str]):
        pulumi.set(self, "oauth_refresh_token_expiry_time", value)

    @property
    @pulumi.getter
    def schema(self) -> pulumi.Input[str]:
        """
        The schema in which to create the secret. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        """
        return pulumi.get(self, "schema")

    @schema.setter
    def schema(self, value: pulumi.Input[str]):
        pulumi.set(self, "schema", value)

    @property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies a comment for the secret.
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "comment", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        String that specifies the identifier (i.e. name) for the secret, must be unique in your schema. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _SecretWithAuthorizationCodeGrantState:
    def __init__(__self__, *,
                 api_authentication: Optional[pulumi.Input[str]] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 database: Optional[pulumi.Input[str]] = None,
                 describe_outputs: Optional[pulumi.Input[Sequence[pulumi.Input['SecretWithAuthorizationCodeGrantDescribeOutputArgs']]]] = None,
                 fully_qualified_name: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 oauth_refresh_token: Optional[pulumi.Input[str]] = None,
                 oauth_refresh_token_expiry_time: Optional[pulumi.Input[str]] = None,
                 schema: Optional[pulumi.Input[str]] = None,
                 secret_type: Optional[pulumi.Input[str]] = None,
                 show_outputs: Optional[pulumi.Input[Sequence[pulumi.Input['SecretWithAuthorizationCodeGrantShowOutputArgs']]]] = None):
        """
        Input properties used for looking up and filtering SecretWithAuthorizationCodeGrant resources.
        :param pulumi.Input[str] api_authentication: Specifies the name value of the Snowflake security integration that connects Snowflake to an external service. For more information about this resource, see docs.
        :param pulumi.Input[str] comment: Specifies a comment for the secret.
        :param pulumi.Input[str] database: The database in which to create the secret Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        :param pulumi.Input[Sequence[pulumi.Input['SecretWithAuthorizationCodeGrantDescribeOutputArgs']]] describe_outputs: Outputs the result of `DESCRIBE SECRET` for the given secret.
        :param pulumi.Input[str] fully_qualified_name: Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        :param pulumi.Input[str] name: String that specifies the identifier (i.e. name) for the secret, must be unique in your schema. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        :param pulumi.Input[str] oauth_refresh_token_expiry_time: Specifies the timestamp as a string when the OAuth refresh token expires. Accepted string formats: YYYY-MM-DD, YYYY-MM-DD HH:MI, YYYY-MM-DD HH:MI:SS, YYYY-MM-DD HH:MI \\n\\n
        :param pulumi.Input[str] schema: The schema in which to create the secret. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        :param pulumi.Input[str] secret_type: Specifies a type for the secret. This field is used for checking external changes and recreating the resources if needed.
        :param pulumi.Input[Sequence[pulumi.Input['SecretWithAuthorizationCodeGrantShowOutputArgs']]] show_outputs: Outputs the result of `SHOW SECRETS` for the given secret.
        """
        if api_authentication is not None:
            pulumi.set(__self__, "api_authentication", api_authentication)
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if database is not None:
            pulumi.set(__self__, "database", database)
        if describe_outputs is not None:
            pulumi.set(__self__, "describe_outputs", describe_outputs)
        if fully_qualified_name is not None:
            pulumi.set(__self__, "fully_qualified_name", fully_qualified_name)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if oauth_refresh_token is not None:
            pulumi.set(__self__, "oauth_refresh_token", oauth_refresh_token)
        if oauth_refresh_token_expiry_time is not None:
            pulumi.set(__self__, "oauth_refresh_token_expiry_time", oauth_refresh_token_expiry_time)
        if schema is not None:
            pulumi.set(__self__, "schema", schema)
        if secret_type is not None:
            pulumi.set(__self__, "secret_type", secret_type)
        if show_outputs is not None:
            pulumi.set(__self__, "show_outputs", show_outputs)

    @property
    @pulumi.getter(name="apiAuthentication")
    def api_authentication(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the name value of the Snowflake security integration that connects Snowflake to an external service. For more information about this resource, see docs.
        """
        return pulumi.get(self, "api_authentication")

    @api_authentication.setter
    def api_authentication(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "api_authentication", value)

    @property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies a comment for the secret.
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "comment", value)

    @property
    @pulumi.getter
    def database(self) -> Optional[pulumi.Input[str]]:
        """
        The database in which to create the secret Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        """
        return pulumi.get(self, "database")

    @database.setter
    def database(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "database", value)

    @property
    @pulumi.getter(name="describeOutputs")
    def describe_outputs(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['SecretWithAuthorizationCodeGrantDescribeOutputArgs']]]]:
        """
        Outputs the result of `DESCRIBE SECRET` for the given secret.
        """
        return pulumi.get(self, "describe_outputs")

    @describe_outputs.setter
    def describe_outputs(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['SecretWithAuthorizationCodeGrantDescribeOutputArgs']]]]):
        pulumi.set(self, "describe_outputs", value)

    @property
    @pulumi.getter(name="fullyQualifiedName")
    def fully_qualified_name(self) -> Optional[pulumi.Input[str]]:
        """
        Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        """
        return pulumi.get(self, "fully_qualified_name")

    @fully_qualified_name.setter
    def fully_qualified_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "fully_qualified_name", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        String that specifies the identifier (i.e. name) for the secret, must be unique in your schema. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="oauthRefreshToken")
    def oauth_refresh_token(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "oauth_refresh_token")

    @oauth_refresh_token.setter
    def oauth_refresh_token(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "oauth_refresh_token", value)

    @property
    @pulumi.getter(name="oauthRefreshTokenExpiryTime")
    def oauth_refresh_token_expiry_time(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the timestamp as a string when the OAuth refresh token expires. Accepted string formats: YYYY-MM-DD, YYYY-MM-DD HH:MI, YYYY-MM-DD HH:MI:SS, YYYY-MM-DD HH:MI \\n\\n
        """
        return pulumi.get(self, "oauth_refresh_token_expiry_time")

    @oauth_refresh_token_expiry_time.setter
    def oauth_refresh_token_expiry_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "oauth_refresh_token_expiry_time", value)

    @property
    @pulumi.getter
    def schema(self) -> Optional[pulumi.Input[str]]:
        """
        The schema in which to create the secret. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        """
        return pulumi.get(self, "schema")

    @schema.setter
    def schema(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "schema", value)

    @property
    @pulumi.getter(name="secretType")
    def secret_type(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies a type for the secret. This field is used for checking external changes and recreating the resources if needed.
        """
        return pulumi.get(self, "secret_type")

    @secret_type.setter
    def secret_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "secret_type", value)

    @property
    @pulumi.getter(name="showOutputs")
    def show_outputs(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['SecretWithAuthorizationCodeGrantShowOutputArgs']]]]:
        """
        Outputs the result of `SHOW SECRETS` for the given secret.
        """
        return pulumi.get(self, "show_outputs")

    @show_outputs.setter
    def show_outputs(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['SecretWithAuthorizationCodeGrantShowOutputArgs']]]]):
        pulumi.set(self, "show_outputs", value)


class SecretWithAuthorizationCodeGrant(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 api_authentication: Optional[pulumi.Input[str]] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 database: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 oauth_refresh_token: Optional[pulumi.Input[str]] = None,
                 oauth_refresh_token_expiry_time: Optional[pulumi.Input[str]] = None,
                 schema: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ## Import

        ```sh
        $ pulumi import snowflake:index/secretWithAuthorizationCodeGrant:SecretWithAuthorizationCodeGrant example '"<database_name>"."<schema_name>"."<secret_name>"'
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] api_authentication: Specifies the name value of the Snowflake security integration that connects Snowflake to an external service. For more information about this resource, see docs.
        :param pulumi.Input[str] comment: Specifies a comment for the secret.
        :param pulumi.Input[str] database: The database in which to create the secret Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        :param pulumi.Input[str] name: String that specifies the identifier (i.e. name) for the secret, must be unique in your schema. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        :param pulumi.Input[str] oauth_refresh_token_expiry_time: Specifies the timestamp as a string when the OAuth refresh token expires. Accepted string formats: YYYY-MM-DD, YYYY-MM-DD HH:MI, YYYY-MM-DD HH:MI:SS, YYYY-MM-DD HH:MI \\n\\n
        :param pulumi.Input[str] schema: The schema in which to create the secret. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SecretWithAuthorizationCodeGrantArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Import

        ```sh
        $ pulumi import snowflake:index/secretWithAuthorizationCodeGrant:SecretWithAuthorizationCodeGrant example '"<database_name>"."<schema_name>"."<secret_name>"'
        ```

        :param str resource_name: The name of the resource.
        :param SecretWithAuthorizationCodeGrantArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SecretWithAuthorizationCodeGrantArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 api_authentication: Optional[pulumi.Input[str]] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 database: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 oauth_refresh_token: Optional[pulumi.Input[str]] = None,
                 oauth_refresh_token_expiry_time: Optional[pulumi.Input[str]] = None,
                 schema: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SecretWithAuthorizationCodeGrantArgs.__new__(SecretWithAuthorizationCodeGrantArgs)

            if api_authentication is None and not opts.urn:
                raise TypeError("Missing required property 'api_authentication'")
            __props__.__dict__["api_authentication"] = api_authentication
            __props__.__dict__["comment"] = comment
            if database is None and not opts.urn:
                raise TypeError("Missing required property 'database'")
            __props__.__dict__["database"] = database
            __props__.__dict__["name"] = name
            if oauth_refresh_token is None and not opts.urn:
                raise TypeError("Missing required property 'oauth_refresh_token'")
            __props__.__dict__["oauth_refresh_token"] = None if oauth_refresh_token is None else pulumi.Output.secret(oauth_refresh_token)
            if oauth_refresh_token_expiry_time is None and not opts.urn:
                raise TypeError("Missing required property 'oauth_refresh_token_expiry_time'")
            __props__.__dict__["oauth_refresh_token_expiry_time"] = oauth_refresh_token_expiry_time
            if schema is None and not opts.urn:
                raise TypeError("Missing required property 'schema'")
            __props__.__dict__["schema"] = schema
            __props__.__dict__["describe_outputs"] = None
            __props__.__dict__["fully_qualified_name"] = None
            __props__.__dict__["secret_type"] = None
            __props__.__dict__["show_outputs"] = None
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["oauthRefreshToken"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(SecretWithAuthorizationCodeGrant, __self__).__init__(
            'snowflake:index/secretWithAuthorizationCodeGrant:SecretWithAuthorizationCodeGrant',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            api_authentication: Optional[pulumi.Input[str]] = None,
            comment: Optional[pulumi.Input[str]] = None,
            database: Optional[pulumi.Input[str]] = None,
            describe_outputs: Optional[pulumi.Input[Sequence[pulumi.Input[Union['SecretWithAuthorizationCodeGrantDescribeOutputArgs', 'SecretWithAuthorizationCodeGrantDescribeOutputArgsDict']]]]] = None,
            fully_qualified_name: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            oauth_refresh_token: Optional[pulumi.Input[str]] = None,
            oauth_refresh_token_expiry_time: Optional[pulumi.Input[str]] = None,
            schema: Optional[pulumi.Input[str]] = None,
            secret_type: Optional[pulumi.Input[str]] = None,
            show_outputs: Optional[pulumi.Input[Sequence[pulumi.Input[Union['SecretWithAuthorizationCodeGrantShowOutputArgs', 'SecretWithAuthorizationCodeGrantShowOutputArgsDict']]]]] = None) -> 'SecretWithAuthorizationCodeGrant':
        """
        Get an existing SecretWithAuthorizationCodeGrant resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] api_authentication: Specifies the name value of the Snowflake security integration that connects Snowflake to an external service. For more information about this resource, see docs.
        :param pulumi.Input[str] comment: Specifies a comment for the secret.
        :param pulumi.Input[str] database: The database in which to create the secret Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        :param pulumi.Input[Sequence[pulumi.Input[Union['SecretWithAuthorizationCodeGrantDescribeOutputArgs', 'SecretWithAuthorizationCodeGrantDescribeOutputArgsDict']]]] describe_outputs: Outputs the result of `DESCRIBE SECRET` for the given secret.
        :param pulumi.Input[str] fully_qualified_name: Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        :param pulumi.Input[str] name: String that specifies the identifier (i.e. name) for the secret, must be unique in your schema. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        :param pulumi.Input[str] oauth_refresh_token_expiry_time: Specifies the timestamp as a string when the OAuth refresh token expires. Accepted string formats: YYYY-MM-DD, YYYY-MM-DD HH:MI, YYYY-MM-DD HH:MI:SS, YYYY-MM-DD HH:MI \\n\\n
        :param pulumi.Input[str] schema: The schema in which to create the secret. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        :param pulumi.Input[str] secret_type: Specifies a type for the secret. This field is used for checking external changes and recreating the resources if needed.
        :param pulumi.Input[Sequence[pulumi.Input[Union['SecretWithAuthorizationCodeGrantShowOutputArgs', 'SecretWithAuthorizationCodeGrantShowOutputArgsDict']]]] show_outputs: Outputs the result of `SHOW SECRETS` for the given secret.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SecretWithAuthorizationCodeGrantState.__new__(_SecretWithAuthorizationCodeGrantState)

        __props__.__dict__["api_authentication"] = api_authentication
        __props__.__dict__["comment"] = comment
        __props__.__dict__["database"] = database
        __props__.__dict__["describe_outputs"] = describe_outputs
        __props__.__dict__["fully_qualified_name"] = fully_qualified_name
        __props__.__dict__["name"] = name
        __props__.__dict__["oauth_refresh_token"] = oauth_refresh_token
        __props__.__dict__["oauth_refresh_token_expiry_time"] = oauth_refresh_token_expiry_time
        __props__.__dict__["schema"] = schema
        __props__.__dict__["secret_type"] = secret_type
        __props__.__dict__["show_outputs"] = show_outputs
        return SecretWithAuthorizationCodeGrant(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="apiAuthentication")
    def api_authentication(self) -> pulumi.Output[str]:
        """
        Specifies the name value of the Snowflake security integration that connects Snowflake to an external service. For more information about this resource, see docs.
        """
        return pulumi.get(self, "api_authentication")

    @property
    @pulumi.getter
    def comment(self) -> pulumi.Output[Optional[str]]:
        """
        Specifies a comment for the secret.
        """
        return pulumi.get(self, "comment")

    @property
    @pulumi.getter
    def database(self) -> pulumi.Output[str]:
        """
        The database in which to create the secret Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        """
        return pulumi.get(self, "database")

    @property
    @pulumi.getter(name="describeOutputs")
    def describe_outputs(self) -> pulumi.Output[Sequence['outputs.SecretWithAuthorizationCodeGrantDescribeOutput']]:
        """
        Outputs the result of `DESCRIBE SECRET` for the given secret.
        """
        return pulumi.get(self, "describe_outputs")

    @property
    @pulumi.getter(name="fullyQualifiedName")
    def fully_qualified_name(self) -> pulumi.Output[str]:
        """
        Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        """
        return pulumi.get(self, "fully_qualified_name")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        String that specifies the identifier (i.e. name) for the secret, must be unique in your schema. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="oauthRefreshToken")
    def oauth_refresh_token(self) -> pulumi.Output[str]:
        return pulumi.get(self, "oauth_refresh_token")

    @property
    @pulumi.getter(name="oauthRefreshTokenExpiryTime")
    def oauth_refresh_token_expiry_time(self) -> pulumi.Output[str]:
        """
        Specifies the timestamp as a string when the OAuth refresh token expires. Accepted string formats: YYYY-MM-DD, YYYY-MM-DD HH:MI, YYYY-MM-DD HH:MI:SS, YYYY-MM-DD HH:MI \\n\\n
        """
        return pulumi.get(self, "oauth_refresh_token_expiry_time")

    @property
    @pulumi.getter
    def schema(self) -> pulumi.Output[str]:
        """
        The schema in which to create the secret. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        """
        return pulumi.get(self, "schema")

    @property
    @pulumi.getter(name="secretType")
    def secret_type(self) -> pulumi.Output[str]:
        """
        Specifies a type for the secret. This field is used for checking external changes and recreating the resources if needed.
        """
        return pulumi.get(self, "secret_type")

    @property
    @pulumi.getter(name="showOutputs")
    def show_outputs(self) -> pulumi.Output[Sequence['outputs.SecretWithAuthorizationCodeGrantShowOutput']]:
        """
        Outputs the result of `SHOW SECRETS` for the given secret.
        """
        return pulumi.get(self, "show_outputs")

