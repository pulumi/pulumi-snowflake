# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins as _builtins
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

__all__ = ['GitRepositoryArgs', 'GitRepository']

@pulumi.input_type
class GitRepositoryArgs:
    def __init__(__self__, *,
                 api_integration: pulumi.Input[_builtins.str],
                 database: pulumi.Input[_builtins.str],
                 origin: pulumi.Input[_builtins.str],
                 schema: pulumi.Input[_builtins.str],
                 comment: Optional[pulumi.Input[_builtins.str]] = None,
                 git_credentials: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a GitRepository resource.
        :param pulumi.Input[_builtins.str] api_integration: Identifier of API INTEGRATION containing information about the remote Git repository such as allowed credentials and prefixes for target URLs.
        :param pulumi.Input[_builtins.str] database: The database in which to create the git repository. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        :param pulumi.Input[_builtins.str] origin: Specifies the origin URL of the remote Git repository that this Git repository clone represents. The URL must use HTTPS.
        :param pulumi.Input[_builtins.str] schema: The schema in which to create the git repository. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        :param pulumi.Input[_builtins.str] comment: Specifies a comment for the git repository.
        :param pulumi.Input[_builtins.str] git_credentials: Specifies the Snowflake secret fully qualified name (e.g `"\\"<db_name>\\".\\"<schema_name>\\".\\"<secret_name>\\""`) containing the credentials to use for authenticating with the remote Git repository. Omit this parameter to use the default secret specified by the API integration or if this integration does not require authentication.
        :param pulumi.Input[_builtins.str] name: Specifies the identifier for the git repository; must be unique for the schema in which the git repository is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        """
        pulumi.set(__self__, "api_integration", api_integration)
        pulumi.set(__self__, "database", database)
        pulumi.set(__self__, "origin", origin)
        pulumi.set(__self__, "schema", schema)
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if git_credentials is not None:
            pulumi.set(__self__, "git_credentials", git_credentials)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @_builtins.property
    @pulumi.getter(name="apiIntegration")
    def api_integration(self) -> pulumi.Input[_builtins.str]:
        """
        Identifier of API INTEGRATION containing information about the remote Git repository such as allowed credentials and prefixes for target URLs.
        """
        return pulumi.get(self, "api_integration")

    @api_integration.setter
    def api_integration(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "api_integration", value)

    @_builtins.property
    @pulumi.getter
    def database(self) -> pulumi.Input[_builtins.str]:
        """
        The database in which to create the git repository. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        """
        return pulumi.get(self, "database")

    @database.setter
    def database(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "database", value)

    @_builtins.property
    @pulumi.getter
    def origin(self) -> pulumi.Input[_builtins.str]:
        """
        Specifies the origin URL of the remote Git repository that this Git repository clone represents. The URL must use HTTPS.
        """
        return pulumi.get(self, "origin")

    @origin.setter
    def origin(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "origin", value)

    @_builtins.property
    @pulumi.getter
    def schema(self) -> pulumi.Input[_builtins.str]:
        """
        The schema in which to create the git repository. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        """
        return pulumi.get(self, "schema")

    @schema.setter
    def schema(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "schema", value)

    @_builtins.property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies a comment for the git repository.
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "comment", value)

    @_builtins.property
    @pulumi.getter(name="gitCredentials")
    def git_credentials(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the Snowflake secret fully qualified name (e.g `"\\"<db_name>\\".\\"<schema_name>\\".\\"<secret_name>\\""`) containing the credentials to use for authenticating with the remote Git repository. Omit this parameter to use the default secret specified by the API integration or if this integration does not require authentication.
        """
        return pulumi.get(self, "git_credentials")

    @git_credentials.setter
    def git_credentials(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "git_credentials", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the identifier for the git repository; must be unique for the schema in which the git repository is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _GitRepositoryState:
    def __init__(__self__, *,
                 api_integration: Optional[pulumi.Input[_builtins.str]] = None,
                 comment: Optional[pulumi.Input[_builtins.str]] = None,
                 database: Optional[pulumi.Input[_builtins.str]] = None,
                 describe_outputs: Optional[pulumi.Input[Sequence[pulumi.Input['GitRepositoryDescribeOutputArgs']]]] = None,
                 fully_qualified_name: Optional[pulumi.Input[_builtins.str]] = None,
                 git_credentials: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 origin: Optional[pulumi.Input[_builtins.str]] = None,
                 schema: Optional[pulumi.Input[_builtins.str]] = None,
                 show_outputs: Optional[pulumi.Input[Sequence[pulumi.Input['GitRepositoryShowOutputArgs']]]] = None):
        """
        Input properties used for looking up and filtering GitRepository resources.
        :param pulumi.Input[_builtins.str] api_integration: Identifier of API INTEGRATION containing information about the remote Git repository such as allowed credentials and prefixes for target URLs.
        :param pulumi.Input[_builtins.str] comment: Specifies a comment for the git repository.
        :param pulumi.Input[_builtins.str] database: The database in which to create the git repository. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        :param pulumi.Input[Sequence[pulumi.Input['GitRepositoryDescribeOutputArgs']]] describe_outputs: Outputs the result of `DESCRIBE GIT REPOSITORY` for the given git repository.
        :param pulumi.Input[_builtins.str] fully_qualified_name: Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        :param pulumi.Input[_builtins.str] git_credentials: Specifies the Snowflake secret fully qualified name (e.g `"\\"<db_name>\\".\\"<schema_name>\\".\\"<secret_name>\\""`) containing the credentials to use for authenticating with the remote Git repository. Omit this parameter to use the default secret specified by the API integration or if this integration does not require authentication.
        :param pulumi.Input[_builtins.str] name: Specifies the identifier for the git repository; must be unique for the schema in which the git repository is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        :param pulumi.Input[_builtins.str] origin: Specifies the origin URL of the remote Git repository that this Git repository clone represents. The URL must use HTTPS.
        :param pulumi.Input[_builtins.str] schema: The schema in which to create the git repository. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        :param pulumi.Input[Sequence[pulumi.Input['GitRepositoryShowOutputArgs']]] show_outputs: Outputs the result of `SHOW GIT REPOSITORIES` for the given git repository.
        """
        if api_integration is not None:
            pulumi.set(__self__, "api_integration", api_integration)
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if database is not None:
            pulumi.set(__self__, "database", database)
        if describe_outputs is not None:
            pulumi.set(__self__, "describe_outputs", describe_outputs)
        if fully_qualified_name is not None:
            pulumi.set(__self__, "fully_qualified_name", fully_qualified_name)
        if git_credentials is not None:
            pulumi.set(__self__, "git_credentials", git_credentials)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if origin is not None:
            pulumi.set(__self__, "origin", origin)
        if schema is not None:
            pulumi.set(__self__, "schema", schema)
        if show_outputs is not None:
            pulumi.set(__self__, "show_outputs", show_outputs)

    @_builtins.property
    @pulumi.getter(name="apiIntegration")
    def api_integration(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Identifier of API INTEGRATION containing information about the remote Git repository such as allowed credentials and prefixes for target URLs.
        """
        return pulumi.get(self, "api_integration")

    @api_integration.setter
    def api_integration(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "api_integration", value)

    @_builtins.property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies a comment for the git repository.
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "comment", value)

    @_builtins.property
    @pulumi.getter
    def database(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The database in which to create the git repository. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        """
        return pulumi.get(self, "database")

    @database.setter
    def database(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "database", value)

    @_builtins.property
    @pulumi.getter(name="describeOutputs")
    def describe_outputs(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['GitRepositoryDescribeOutputArgs']]]]:
        """
        Outputs the result of `DESCRIBE GIT REPOSITORY` for the given git repository.
        """
        return pulumi.get(self, "describe_outputs")

    @describe_outputs.setter
    def describe_outputs(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['GitRepositoryDescribeOutputArgs']]]]):
        pulumi.set(self, "describe_outputs", value)

    @_builtins.property
    @pulumi.getter(name="fullyQualifiedName")
    def fully_qualified_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        """
        return pulumi.get(self, "fully_qualified_name")

    @fully_qualified_name.setter
    def fully_qualified_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "fully_qualified_name", value)

    @_builtins.property
    @pulumi.getter(name="gitCredentials")
    def git_credentials(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the Snowflake secret fully qualified name (e.g `"\\"<db_name>\\".\\"<schema_name>\\".\\"<secret_name>\\""`) containing the credentials to use for authenticating with the remote Git repository. Omit this parameter to use the default secret specified by the API integration or if this integration does not require authentication.
        """
        return pulumi.get(self, "git_credentials")

    @git_credentials.setter
    def git_credentials(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "git_credentials", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the identifier for the git repository; must be unique for the schema in which the git repository is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter
    def origin(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the origin URL of the remote Git repository that this Git repository clone represents. The URL must use HTTPS.
        """
        return pulumi.get(self, "origin")

    @origin.setter
    def origin(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "origin", value)

    @_builtins.property
    @pulumi.getter
    def schema(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The schema in which to create the git repository. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        """
        return pulumi.get(self, "schema")

    @schema.setter
    def schema(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "schema", value)

    @_builtins.property
    @pulumi.getter(name="showOutputs")
    def show_outputs(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['GitRepositoryShowOutputArgs']]]]:
        """
        Outputs the result of `SHOW GIT REPOSITORIES` for the given git repository.
        """
        return pulumi.get(self, "show_outputs")

    @show_outputs.setter
    def show_outputs(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['GitRepositoryShowOutputArgs']]]]):
        pulumi.set(self, "show_outputs", value)


@pulumi.type_token("snowflake:index/gitRepository:GitRepository")
class GitRepository(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 api_integration: Optional[pulumi.Input[_builtins.str]] = None,
                 comment: Optional[pulumi.Input[_builtins.str]] = None,
                 database: Optional[pulumi.Input[_builtins.str]] = None,
                 git_credentials: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 origin: Optional[pulumi.Input[_builtins.str]] = None,
                 schema: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        ## Import

        ```sh
        $ pulumi import snowflake:index/gitRepository:GitRepository example '"<db_name>"."<schema_name>"."<git_repository_name>"'
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] api_integration: Identifier of API INTEGRATION containing information about the remote Git repository such as allowed credentials and prefixes for target URLs.
        :param pulumi.Input[_builtins.str] comment: Specifies a comment for the git repository.
        :param pulumi.Input[_builtins.str] database: The database in which to create the git repository. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        :param pulumi.Input[_builtins.str] git_credentials: Specifies the Snowflake secret fully qualified name (e.g `"\\"<db_name>\\".\\"<schema_name>\\".\\"<secret_name>\\""`) containing the credentials to use for authenticating with the remote Git repository. Omit this parameter to use the default secret specified by the API integration or if this integration does not require authentication.
        :param pulumi.Input[_builtins.str] name: Specifies the identifier for the git repository; must be unique for the schema in which the git repository is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        :param pulumi.Input[_builtins.str] origin: Specifies the origin URL of the remote Git repository that this Git repository clone represents. The URL must use HTTPS.
        :param pulumi.Input[_builtins.str] schema: The schema in which to create the git repository. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: GitRepositoryArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Import

        ```sh
        $ pulumi import snowflake:index/gitRepository:GitRepository example '"<db_name>"."<schema_name>"."<git_repository_name>"'
        ```

        :param str resource_name: The name of the resource.
        :param GitRepositoryArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(GitRepositoryArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 api_integration: Optional[pulumi.Input[_builtins.str]] = None,
                 comment: Optional[pulumi.Input[_builtins.str]] = None,
                 database: Optional[pulumi.Input[_builtins.str]] = None,
                 git_credentials: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 origin: Optional[pulumi.Input[_builtins.str]] = None,
                 schema: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = GitRepositoryArgs.__new__(GitRepositoryArgs)

            if api_integration is None and not opts.urn:
                raise TypeError("Missing required property 'api_integration'")
            __props__.__dict__["api_integration"] = api_integration
            __props__.__dict__["comment"] = comment
            if database is None and not opts.urn:
                raise TypeError("Missing required property 'database'")
            __props__.__dict__["database"] = database
            __props__.__dict__["git_credentials"] = git_credentials
            __props__.__dict__["name"] = name
            if origin is None and not opts.urn:
                raise TypeError("Missing required property 'origin'")
            __props__.__dict__["origin"] = origin
            if schema is None and not opts.urn:
                raise TypeError("Missing required property 'schema'")
            __props__.__dict__["schema"] = schema
            __props__.__dict__["describe_outputs"] = None
            __props__.__dict__["fully_qualified_name"] = None
            __props__.__dict__["show_outputs"] = None
        super(GitRepository, __self__).__init__(
            'snowflake:index/gitRepository:GitRepository',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            api_integration: Optional[pulumi.Input[_builtins.str]] = None,
            comment: Optional[pulumi.Input[_builtins.str]] = None,
            database: Optional[pulumi.Input[_builtins.str]] = None,
            describe_outputs: Optional[pulumi.Input[Sequence[pulumi.Input[Union['GitRepositoryDescribeOutputArgs', 'GitRepositoryDescribeOutputArgsDict']]]]] = None,
            fully_qualified_name: Optional[pulumi.Input[_builtins.str]] = None,
            git_credentials: Optional[pulumi.Input[_builtins.str]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            origin: Optional[pulumi.Input[_builtins.str]] = None,
            schema: Optional[pulumi.Input[_builtins.str]] = None,
            show_outputs: Optional[pulumi.Input[Sequence[pulumi.Input[Union['GitRepositoryShowOutputArgs', 'GitRepositoryShowOutputArgsDict']]]]] = None) -> 'GitRepository':
        """
        Get an existing GitRepository resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] api_integration: Identifier of API INTEGRATION containing information about the remote Git repository such as allowed credentials and prefixes for target URLs.
        :param pulumi.Input[_builtins.str] comment: Specifies a comment for the git repository.
        :param pulumi.Input[_builtins.str] database: The database in which to create the git repository. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        :param pulumi.Input[Sequence[pulumi.Input[Union['GitRepositoryDescribeOutputArgs', 'GitRepositoryDescribeOutputArgsDict']]]] describe_outputs: Outputs the result of `DESCRIBE GIT REPOSITORY` for the given git repository.
        :param pulumi.Input[_builtins.str] fully_qualified_name: Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        :param pulumi.Input[_builtins.str] git_credentials: Specifies the Snowflake secret fully qualified name (e.g `"\\"<db_name>\\".\\"<schema_name>\\".\\"<secret_name>\\""`) containing the credentials to use for authenticating with the remote Git repository. Omit this parameter to use the default secret specified by the API integration or if this integration does not require authentication.
        :param pulumi.Input[_builtins.str] name: Specifies the identifier for the git repository; must be unique for the schema in which the git repository is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        :param pulumi.Input[_builtins.str] origin: Specifies the origin URL of the remote Git repository that this Git repository clone represents. The URL must use HTTPS.
        :param pulumi.Input[_builtins.str] schema: The schema in which to create the git repository. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        :param pulumi.Input[Sequence[pulumi.Input[Union['GitRepositoryShowOutputArgs', 'GitRepositoryShowOutputArgsDict']]]] show_outputs: Outputs the result of `SHOW GIT REPOSITORIES` for the given git repository.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _GitRepositoryState.__new__(_GitRepositoryState)

        __props__.__dict__["api_integration"] = api_integration
        __props__.__dict__["comment"] = comment
        __props__.__dict__["database"] = database
        __props__.__dict__["describe_outputs"] = describe_outputs
        __props__.__dict__["fully_qualified_name"] = fully_qualified_name
        __props__.__dict__["git_credentials"] = git_credentials
        __props__.__dict__["name"] = name
        __props__.__dict__["origin"] = origin
        __props__.__dict__["schema"] = schema
        __props__.__dict__["show_outputs"] = show_outputs
        return GitRepository(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="apiIntegration")
    def api_integration(self) -> pulumi.Output[_builtins.str]:
        """
        Identifier of API INTEGRATION containing information about the remote Git repository such as allowed credentials and prefixes for target URLs.
        """
        return pulumi.get(self, "api_integration")

    @_builtins.property
    @pulumi.getter
    def comment(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Specifies a comment for the git repository.
        """
        return pulumi.get(self, "comment")

    @_builtins.property
    @pulumi.getter
    def database(self) -> pulumi.Output[_builtins.str]:
        """
        The database in which to create the git repository. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        """
        return pulumi.get(self, "database")

    @_builtins.property
    @pulumi.getter(name="describeOutputs")
    def describe_outputs(self) -> pulumi.Output[Sequence['outputs.GitRepositoryDescribeOutput']]:
        """
        Outputs the result of `DESCRIBE GIT REPOSITORY` for the given git repository.
        """
        return pulumi.get(self, "describe_outputs")

    @_builtins.property
    @pulumi.getter(name="fullyQualifiedName")
    def fully_qualified_name(self) -> pulumi.Output[_builtins.str]:
        """
        Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        """
        return pulumi.get(self, "fully_qualified_name")

    @_builtins.property
    @pulumi.getter(name="gitCredentials")
    def git_credentials(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Specifies the Snowflake secret fully qualified name (e.g `"\\"<db_name>\\".\\"<schema_name>\\".\\"<secret_name>\\""`) containing the credentials to use for authenticating with the remote Git repository. Omit this parameter to use the default secret specified by the API integration or if this integration does not require authentication.
        """
        return pulumi.get(self, "git_credentials")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        Specifies the identifier for the git repository; must be unique for the schema in which the git repository is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter
    def origin(self) -> pulumi.Output[_builtins.str]:
        """
        Specifies the origin URL of the remote Git repository that this Git repository clone represents. The URL must use HTTPS.
        """
        return pulumi.get(self, "origin")

    @_builtins.property
    @pulumi.getter
    def schema(self) -> pulumi.Output[_builtins.str]:
        """
        The schema in which to create the git repository. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        """
        return pulumi.get(self, "schema")

    @_builtins.property
    @pulumi.getter(name="showOutputs")
    def show_outputs(self) -> pulumi.Output[Sequence['outputs.GitRepositoryShowOutput']]:
        """
        Outputs the result of `SHOW GIT REPOSITORIES` for the given git repository.
        """
        return pulumi.get(self, "show_outputs")

