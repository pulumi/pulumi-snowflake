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

__all__ = ['StreamlitArgs', 'Streamlit']

@pulumi.input_type
class StreamlitArgs:
    def __init__(__self__, *,
                 database: pulumi.Input[_builtins.str],
                 main_file: pulumi.Input[_builtins.str],
                 schema: pulumi.Input[_builtins.str],
                 stage: pulumi.Input[_builtins.str],
                 comment: Optional[pulumi.Input[_builtins.str]] = None,
                 directory_location: Optional[pulumi.Input[_builtins.str]] = None,
                 external_access_integrations: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 query_warehouse: Optional[pulumi.Input[_builtins.str]] = None,
                 title: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a Streamlit resource.
        :param pulumi.Input[_builtins.str] database: The database in which to create the streamlit Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        :param pulumi.Input[_builtins.str] main_file: Specifies the filename of the Streamlit Python application. This filename is relative to the value of `directory_location`
        :param pulumi.Input[_builtins.str] schema: The schema in which to create the streamlit. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        :param pulumi.Input[_builtins.str] stage: The stage in which streamlit files are located. For more information about this resource, see docs.
        :param pulumi.Input[_builtins.str] comment: Specifies a comment for the streamlit.
        :param pulumi.Input[_builtins.str] directory_location: Specifies the full path to the named stage containing the Streamlit Python files, media files, and the environment.yml file.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] external_access_integrations: External access integrations connected to the Streamlit.
        :param pulumi.Input[_builtins.str] name: String that specifies the identifier (i.e. name) for the streamlit; must be unique in your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        :param pulumi.Input[_builtins.str] query_warehouse: Specifies the warehouse where SQL queries issued by the Streamlit application are run. Due to Snowflake limitations warehouse identifier can consist of only upper-cased letters. For more information about this resource, see docs.
        :param pulumi.Input[_builtins.str] title: Specifies a title for the Streamlit app to display in Snowsight.
        """
        pulumi.set(__self__, "database", database)
        pulumi.set(__self__, "main_file", main_file)
        pulumi.set(__self__, "schema", schema)
        pulumi.set(__self__, "stage", stage)
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if directory_location is not None:
            pulumi.set(__self__, "directory_location", directory_location)
        if external_access_integrations is not None:
            pulumi.set(__self__, "external_access_integrations", external_access_integrations)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if query_warehouse is not None:
            pulumi.set(__self__, "query_warehouse", query_warehouse)
        if title is not None:
            pulumi.set(__self__, "title", title)

    @_builtins.property
    @pulumi.getter
    def database(self) -> pulumi.Input[_builtins.str]:
        """
        The database in which to create the streamlit Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        """
        return pulumi.get(self, "database")

    @database.setter
    def database(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "database", value)

    @_builtins.property
    @pulumi.getter(name="mainFile")
    def main_file(self) -> pulumi.Input[_builtins.str]:
        """
        Specifies the filename of the Streamlit Python application. This filename is relative to the value of `directory_location`
        """
        return pulumi.get(self, "main_file")

    @main_file.setter
    def main_file(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "main_file", value)

    @_builtins.property
    @pulumi.getter
    def schema(self) -> pulumi.Input[_builtins.str]:
        """
        The schema in which to create the streamlit. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        """
        return pulumi.get(self, "schema")

    @schema.setter
    def schema(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "schema", value)

    @_builtins.property
    @pulumi.getter
    def stage(self) -> pulumi.Input[_builtins.str]:
        """
        The stage in which streamlit files are located. For more information about this resource, see docs.
        """
        return pulumi.get(self, "stage")

    @stage.setter
    def stage(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "stage", value)

    @_builtins.property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies a comment for the streamlit.
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "comment", value)

    @_builtins.property
    @pulumi.getter(name="directoryLocation")
    def directory_location(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the full path to the named stage containing the Streamlit Python files, media files, and the environment.yml file.
        """
        return pulumi.get(self, "directory_location")

    @directory_location.setter
    def directory_location(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "directory_location", value)

    @_builtins.property
    @pulumi.getter(name="externalAccessIntegrations")
    def external_access_integrations(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]:
        """
        External access integrations connected to the Streamlit.
        """
        return pulumi.get(self, "external_access_integrations")

    @external_access_integrations.setter
    def external_access_integrations(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "external_access_integrations", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        String that specifies the identifier (i.e. name) for the streamlit; must be unique in your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="queryWarehouse")
    def query_warehouse(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the warehouse where SQL queries issued by the Streamlit application are run. Due to Snowflake limitations warehouse identifier can consist of only upper-cased letters. For more information about this resource, see docs.
        """
        return pulumi.get(self, "query_warehouse")

    @query_warehouse.setter
    def query_warehouse(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "query_warehouse", value)

    @_builtins.property
    @pulumi.getter
    def title(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies a title for the Streamlit app to display in Snowsight.
        """
        return pulumi.get(self, "title")

    @title.setter
    def title(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "title", value)


@pulumi.input_type
class _StreamlitState:
    def __init__(__self__, *,
                 comment: Optional[pulumi.Input[_builtins.str]] = None,
                 database: Optional[pulumi.Input[_builtins.str]] = None,
                 describe_outputs: Optional[pulumi.Input[Sequence[pulumi.Input['StreamlitDescribeOutputArgs']]]] = None,
                 directory_location: Optional[pulumi.Input[_builtins.str]] = None,
                 external_access_integrations: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 fully_qualified_name: Optional[pulumi.Input[_builtins.str]] = None,
                 main_file: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 query_warehouse: Optional[pulumi.Input[_builtins.str]] = None,
                 schema: Optional[pulumi.Input[_builtins.str]] = None,
                 show_outputs: Optional[pulumi.Input[Sequence[pulumi.Input['StreamlitShowOutputArgs']]]] = None,
                 stage: Optional[pulumi.Input[_builtins.str]] = None,
                 title: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering Streamlit resources.
        :param pulumi.Input[_builtins.str] comment: Specifies a comment for the streamlit.
        :param pulumi.Input[_builtins.str] database: The database in which to create the streamlit Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        :param pulumi.Input[Sequence[pulumi.Input['StreamlitDescribeOutputArgs']]] describe_outputs: Outputs the result of `DESCRIBE STREAMLIT` for the given streamlit.
        :param pulumi.Input[_builtins.str] directory_location: Specifies the full path to the named stage containing the Streamlit Python files, media files, and the environment.yml file.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] external_access_integrations: External access integrations connected to the Streamlit.
        :param pulumi.Input[_builtins.str] fully_qualified_name: Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        :param pulumi.Input[_builtins.str] main_file: Specifies the filename of the Streamlit Python application. This filename is relative to the value of `directory_location`
        :param pulumi.Input[_builtins.str] name: String that specifies the identifier (i.e. name) for the streamlit; must be unique in your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        :param pulumi.Input[_builtins.str] query_warehouse: Specifies the warehouse where SQL queries issued by the Streamlit application are run. Due to Snowflake limitations warehouse identifier can consist of only upper-cased letters. For more information about this resource, see docs.
        :param pulumi.Input[_builtins.str] schema: The schema in which to create the streamlit. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        :param pulumi.Input[Sequence[pulumi.Input['StreamlitShowOutputArgs']]] show_outputs: Outputs the result of `SHOW STREAMLIT` for the given streamlit.
        :param pulumi.Input[_builtins.str] stage: The stage in which streamlit files are located. For more information about this resource, see docs.
        :param pulumi.Input[_builtins.str] title: Specifies a title for the Streamlit app to display in Snowsight.
        """
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if database is not None:
            pulumi.set(__self__, "database", database)
        if describe_outputs is not None:
            pulumi.set(__self__, "describe_outputs", describe_outputs)
        if directory_location is not None:
            pulumi.set(__self__, "directory_location", directory_location)
        if external_access_integrations is not None:
            pulumi.set(__self__, "external_access_integrations", external_access_integrations)
        if fully_qualified_name is not None:
            pulumi.set(__self__, "fully_qualified_name", fully_qualified_name)
        if main_file is not None:
            pulumi.set(__self__, "main_file", main_file)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if query_warehouse is not None:
            pulumi.set(__self__, "query_warehouse", query_warehouse)
        if schema is not None:
            pulumi.set(__self__, "schema", schema)
        if show_outputs is not None:
            pulumi.set(__self__, "show_outputs", show_outputs)
        if stage is not None:
            pulumi.set(__self__, "stage", stage)
        if title is not None:
            pulumi.set(__self__, "title", title)

    @_builtins.property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies a comment for the streamlit.
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "comment", value)

    @_builtins.property
    @pulumi.getter
    def database(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The database in which to create the streamlit Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        """
        return pulumi.get(self, "database")

    @database.setter
    def database(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "database", value)

    @_builtins.property
    @pulumi.getter(name="describeOutputs")
    def describe_outputs(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['StreamlitDescribeOutputArgs']]]]:
        """
        Outputs the result of `DESCRIBE STREAMLIT` for the given streamlit.
        """
        return pulumi.get(self, "describe_outputs")

    @describe_outputs.setter
    def describe_outputs(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['StreamlitDescribeOutputArgs']]]]):
        pulumi.set(self, "describe_outputs", value)

    @_builtins.property
    @pulumi.getter(name="directoryLocation")
    def directory_location(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the full path to the named stage containing the Streamlit Python files, media files, and the environment.yml file.
        """
        return pulumi.get(self, "directory_location")

    @directory_location.setter
    def directory_location(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "directory_location", value)

    @_builtins.property
    @pulumi.getter(name="externalAccessIntegrations")
    def external_access_integrations(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]:
        """
        External access integrations connected to the Streamlit.
        """
        return pulumi.get(self, "external_access_integrations")

    @external_access_integrations.setter
    def external_access_integrations(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "external_access_integrations", value)

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
    @pulumi.getter(name="mainFile")
    def main_file(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the filename of the Streamlit Python application. This filename is relative to the value of `directory_location`
        """
        return pulumi.get(self, "main_file")

    @main_file.setter
    def main_file(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "main_file", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        String that specifies the identifier (i.e. name) for the streamlit; must be unique in your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="queryWarehouse")
    def query_warehouse(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the warehouse where SQL queries issued by the Streamlit application are run. Due to Snowflake limitations warehouse identifier can consist of only upper-cased letters. For more information about this resource, see docs.
        """
        return pulumi.get(self, "query_warehouse")

    @query_warehouse.setter
    def query_warehouse(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "query_warehouse", value)

    @_builtins.property
    @pulumi.getter
    def schema(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The schema in which to create the streamlit. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        """
        return pulumi.get(self, "schema")

    @schema.setter
    def schema(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "schema", value)

    @_builtins.property
    @pulumi.getter(name="showOutputs")
    def show_outputs(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['StreamlitShowOutputArgs']]]]:
        """
        Outputs the result of `SHOW STREAMLIT` for the given streamlit.
        """
        return pulumi.get(self, "show_outputs")

    @show_outputs.setter
    def show_outputs(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['StreamlitShowOutputArgs']]]]):
        pulumi.set(self, "show_outputs", value)

    @_builtins.property
    @pulumi.getter
    def stage(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The stage in which streamlit files are located. For more information about this resource, see docs.
        """
        return pulumi.get(self, "stage")

    @stage.setter
    def stage(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "stage", value)

    @_builtins.property
    @pulumi.getter
    def title(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies a title for the Streamlit app to display in Snowsight.
        """
        return pulumi.get(self, "title")

    @title.setter
    def title(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "title", value)


@pulumi.type_token("snowflake:index/streamlit:Streamlit")
class Streamlit(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 comment: Optional[pulumi.Input[_builtins.str]] = None,
                 database: Optional[pulumi.Input[_builtins.str]] = None,
                 directory_location: Optional[pulumi.Input[_builtins.str]] = None,
                 external_access_integrations: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 main_file: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 query_warehouse: Optional[pulumi.Input[_builtins.str]] = None,
                 schema: Optional[pulumi.Input[_builtins.str]] = None,
                 stage: Optional[pulumi.Input[_builtins.str]] = None,
                 title: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        ## Import

        ```sh
        $ pulumi import snowflake:index/streamlit:Streamlit example '"<database_name>"."<schema_name>"."<streamlit_name>"'
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] comment: Specifies a comment for the streamlit.
        :param pulumi.Input[_builtins.str] database: The database in which to create the streamlit Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        :param pulumi.Input[_builtins.str] directory_location: Specifies the full path to the named stage containing the Streamlit Python files, media files, and the environment.yml file.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] external_access_integrations: External access integrations connected to the Streamlit.
        :param pulumi.Input[_builtins.str] main_file: Specifies the filename of the Streamlit Python application. This filename is relative to the value of `directory_location`
        :param pulumi.Input[_builtins.str] name: String that specifies the identifier (i.e. name) for the streamlit; must be unique in your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        :param pulumi.Input[_builtins.str] query_warehouse: Specifies the warehouse where SQL queries issued by the Streamlit application are run. Due to Snowflake limitations warehouse identifier can consist of only upper-cased letters. For more information about this resource, see docs.
        :param pulumi.Input[_builtins.str] schema: The schema in which to create the streamlit. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        :param pulumi.Input[_builtins.str] stage: The stage in which streamlit files are located. For more information about this resource, see docs.
        :param pulumi.Input[_builtins.str] title: Specifies a title for the Streamlit app to display in Snowsight.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: StreamlitArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Import

        ```sh
        $ pulumi import snowflake:index/streamlit:Streamlit example '"<database_name>"."<schema_name>"."<streamlit_name>"'
        ```

        :param str resource_name: The name of the resource.
        :param StreamlitArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(StreamlitArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 comment: Optional[pulumi.Input[_builtins.str]] = None,
                 database: Optional[pulumi.Input[_builtins.str]] = None,
                 directory_location: Optional[pulumi.Input[_builtins.str]] = None,
                 external_access_integrations: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 main_file: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 query_warehouse: Optional[pulumi.Input[_builtins.str]] = None,
                 schema: Optional[pulumi.Input[_builtins.str]] = None,
                 stage: Optional[pulumi.Input[_builtins.str]] = None,
                 title: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = StreamlitArgs.__new__(StreamlitArgs)

            __props__.__dict__["comment"] = comment
            if database is None and not opts.urn:
                raise TypeError("Missing required property 'database'")
            __props__.__dict__["database"] = database
            __props__.__dict__["directory_location"] = directory_location
            __props__.__dict__["external_access_integrations"] = external_access_integrations
            if main_file is None and not opts.urn:
                raise TypeError("Missing required property 'main_file'")
            __props__.__dict__["main_file"] = main_file
            __props__.__dict__["name"] = name
            __props__.__dict__["query_warehouse"] = query_warehouse
            if schema is None and not opts.urn:
                raise TypeError("Missing required property 'schema'")
            __props__.__dict__["schema"] = schema
            if stage is None and not opts.urn:
                raise TypeError("Missing required property 'stage'")
            __props__.__dict__["stage"] = stage
            __props__.__dict__["title"] = title
            __props__.__dict__["describe_outputs"] = None
            __props__.__dict__["fully_qualified_name"] = None
            __props__.__dict__["show_outputs"] = None
        super(Streamlit, __self__).__init__(
            'snowflake:index/streamlit:Streamlit',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            comment: Optional[pulumi.Input[_builtins.str]] = None,
            database: Optional[pulumi.Input[_builtins.str]] = None,
            describe_outputs: Optional[pulumi.Input[Sequence[pulumi.Input[Union['StreamlitDescribeOutputArgs', 'StreamlitDescribeOutputArgsDict']]]]] = None,
            directory_location: Optional[pulumi.Input[_builtins.str]] = None,
            external_access_integrations: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
            fully_qualified_name: Optional[pulumi.Input[_builtins.str]] = None,
            main_file: Optional[pulumi.Input[_builtins.str]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            query_warehouse: Optional[pulumi.Input[_builtins.str]] = None,
            schema: Optional[pulumi.Input[_builtins.str]] = None,
            show_outputs: Optional[pulumi.Input[Sequence[pulumi.Input[Union['StreamlitShowOutputArgs', 'StreamlitShowOutputArgsDict']]]]] = None,
            stage: Optional[pulumi.Input[_builtins.str]] = None,
            title: Optional[pulumi.Input[_builtins.str]] = None) -> 'Streamlit':
        """
        Get an existing Streamlit resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] comment: Specifies a comment for the streamlit.
        :param pulumi.Input[_builtins.str] database: The database in which to create the streamlit Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        :param pulumi.Input[Sequence[pulumi.Input[Union['StreamlitDescribeOutputArgs', 'StreamlitDescribeOutputArgsDict']]]] describe_outputs: Outputs the result of `DESCRIBE STREAMLIT` for the given streamlit.
        :param pulumi.Input[_builtins.str] directory_location: Specifies the full path to the named stage containing the Streamlit Python files, media files, and the environment.yml file.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] external_access_integrations: External access integrations connected to the Streamlit.
        :param pulumi.Input[_builtins.str] fully_qualified_name: Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        :param pulumi.Input[_builtins.str] main_file: Specifies the filename of the Streamlit Python application. This filename is relative to the value of `directory_location`
        :param pulumi.Input[_builtins.str] name: String that specifies the identifier (i.e. name) for the streamlit; must be unique in your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        :param pulumi.Input[_builtins.str] query_warehouse: Specifies the warehouse where SQL queries issued by the Streamlit application are run. Due to Snowflake limitations warehouse identifier can consist of only upper-cased letters. For more information about this resource, see docs.
        :param pulumi.Input[_builtins.str] schema: The schema in which to create the streamlit. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        :param pulumi.Input[Sequence[pulumi.Input[Union['StreamlitShowOutputArgs', 'StreamlitShowOutputArgsDict']]]] show_outputs: Outputs the result of `SHOW STREAMLIT` for the given streamlit.
        :param pulumi.Input[_builtins.str] stage: The stage in which streamlit files are located. For more information about this resource, see docs.
        :param pulumi.Input[_builtins.str] title: Specifies a title for the Streamlit app to display in Snowsight.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _StreamlitState.__new__(_StreamlitState)

        __props__.__dict__["comment"] = comment
        __props__.__dict__["database"] = database
        __props__.__dict__["describe_outputs"] = describe_outputs
        __props__.__dict__["directory_location"] = directory_location
        __props__.__dict__["external_access_integrations"] = external_access_integrations
        __props__.__dict__["fully_qualified_name"] = fully_qualified_name
        __props__.__dict__["main_file"] = main_file
        __props__.__dict__["name"] = name
        __props__.__dict__["query_warehouse"] = query_warehouse
        __props__.__dict__["schema"] = schema
        __props__.__dict__["show_outputs"] = show_outputs
        __props__.__dict__["stage"] = stage
        __props__.__dict__["title"] = title
        return Streamlit(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def comment(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Specifies a comment for the streamlit.
        """
        return pulumi.get(self, "comment")

    @_builtins.property
    @pulumi.getter
    def database(self) -> pulumi.Output[_builtins.str]:
        """
        The database in which to create the streamlit Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        """
        return pulumi.get(self, "database")

    @_builtins.property
    @pulumi.getter(name="describeOutputs")
    def describe_outputs(self) -> pulumi.Output[Sequence['outputs.StreamlitDescribeOutput']]:
        """
        Outputs the result of `DESCRIBE STREAMLIT` for the given streamlit.
        """
        return pulumi.get(self, "describe_outputs")

    @_builtins.property
    @pulumi.getter(name="directoryLocation")
    def directory_location(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Specifies the full path to the named stage containing the Streamlit Python files, media files, and the environment.yml file.
        """
        return pulumi.get(self, "directory_location")

    @_builtins.property
    @pulumi.getter(name="externalAccessIntegrations")
    def external_access_integrations(self) -> pulumi.Output[Optional[Sequence[_builtins.str]]]:
        """
        External access integrations connected to the Streamlit.
        """
        return pulumi.get(self, "external_access_integrations")

    @_builtins.property
    @pulumi.getter(name="fullyQualifiedName")
    def fully_qualified_name(self) -> pulumi.Output[_builtins.str]:
        """
        Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        """
        return pulumi.get(self, "fully_qualified_name")

    @_builtins.property
    @pulumi.getter(name="mainFile")
    def main_file(self) -> pulumi.Output[_builtins.str]:
        """
        Specifies the filename of the Streamlit Python application. This filename is relative to the value of `directory_location`
        """
        return pulumi.get(self, "main_file")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        String that specifies the identifier (i.e. name) for the streamlit; must be unique in your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="queryWarehouse")
    def query_warehouse(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Specifies the warehouse where SQL queries issued by the Streamlit application are run. Due to Snowflake limitations warehouse identifier can consist of only upper-cased letters. For more information about this resource, see docs.
        """
        return pulumi.get(self, "query_warehouse")

    @_builtins.property
    @pulumi.getter
    def schema(self) -> pulumi.Output[_builtins.str]:
        """
        The schema in which to create the streamlit. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        """
        return pulumi.get(self, "schema")

    @_builtins.property
    @pulumi.getter(name="showOutputs")
    def show_outputs(self) -> pulumi.Output[Sequence['outputs.StreamlitShowOutput']]:
        """
        Outputs the result of `SHOW STREAMLIT` for the given streamlit.
        """
        return pulumi.get(self, "show_outputs")

    @_builtins.property
    @pulumi.getter
    def stage(self) -> pulumi.Output[_builtins.str]:
        """
        The stage in which streamlit files are located. For more information about this resource, see docs.
        """
        return pulumi.get(self, "stage")

    @_builtins.property
    @pulumi.getter
    def title(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Specifies a title for the Streamlit app to display in Snowsight.
        """
        return pulumi.get(self, "title")

