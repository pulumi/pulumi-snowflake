# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['FunctionArgs', 'Function']

@pulumi.input_type
class FunctionArgs:
    def __init__(__self__, *,
                 database: pulumi.Input[str],
                 return_type: pulumi.Input[str],
                 schema: pulumi.Input[str],
                 statement: pulumi.Input[str],
                 arguments: Optional[pulumi.Input[Sequence[pulumi.Input['FunctionArgumentArgs']]]] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 handler: Optional[pulumi.Input[str]] = None,
                 imports: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 language: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 null_input_behavior: Optional[pulumi.Input[str]] = None,
                 packages: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 return_behavior: Optional[pulumi.Input[str]] = None,
                 runtime_version: Optional[pulumi.Input[str]] = None,
                 target_path: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Function resource.
        :param pulumi.Input[str] database: The database in which to create the function. Don't use the | character.
        :param pulumi.Input[str] return_type: The return type of the function
        :param pulumi.Input[str] schema: The schema in which to create the function. Don't use the | character.
        :param pulumi.Input[str] statement: Specifies the javascript / java / sql / python code used to create the function.
        :param pulumi.Input[Sequence[pulumi.Input['FunctionArgumentArgs']]] arguments: List of the arguments for the function
        :param pulumi.Input[str] comment: Specifies a comment for the function.
        :param pulumi.Input[str] handler: The handler method for Java / Python function.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] imports: Imports for Java / Python functions. For Java this a list of jar files, for Python this is a list of Python files.
        :param pulumi.Input[str] language: The language of the statement
        :param pulumi.Input[str] name: Specifies the identifier for the function; does not have to be unique for the schema in which the function is created.
               Don't use the | character.
        :param pulumi.Input[str] null_input_behavior: Specifies the behavior of the function when called with null inputs.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] packages: List of package imports to use for Java / Python functions. For Java, package imports should be of the form:
               package_name:version_number, where package_name is snowflake_domain:package. For Python use it should be:
               ('numpy','pandas','xgboost==1.5.0').
        :param pulumi.Input[str] return_behavior: Specifies the behavior of the function when returning results
        :param pulumi.Input[str] runtime_version: Required for Python functions. Specifies Python runtime version.
        :param pulumi.Input[str] target_path: The target path for the Java / Python functions. For Java, it is the path of compiled jar files and for the Python it is
               the path of the Python files.
        """
        pulumi.set(__self__, "database", database)
        pulumi.set(__self__, "return_type", return_type)
        pulumi.set(__self__, "schema", schema)
        pulumi.set(__self__, "statement", statement)
        if arguments is not None:
            pulumi.set(__self__, "arguments", arguments)
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if handler is not None:
            pulumi.set(__self__, "handler", handler)
        if imports is not None:
            pulumi.set(__self__, "imports", imports)
        if language is not None:
            pulumi.set(__self__, "language", language)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if null_input_behavior is not None:
            pulumi.set(__self__, "null_input_behavior", null_input_behavior)
        if packages is not None:
            pulumi.set(__self__, "packages", packages)
        if return_behavior is not None:
            pulumi.set(__self__, "return_behavior", return_behavior)
        if runtime_version is not None:
            pulumi.set(__self__, "runtime_version", runtime_version)
        if target_path is not None:
            pulumi.set(__self__, "target_path", target_path)

    @property
    @pulumi.getter
    def database(self) -> pulumi.Input[str]:
        """
        The database in which to create the function. Don't use the | character.
        """
        return pulumi.get(self, "database")

    @database.setter
    def database(self, value: pulumi.Input[str]):
        pulumi.set(self, "database", value)

    @property
    @pulumi.getter(name="returnType")
    def return_type(self) -> pulumi.Input[str]:
        """
        The return type of the function
        """
        return pulumi.get(self, "return_type")

    @return_type.setter
    def return_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "return_type", value)

    @property
    @pulumi.getter
    def schema(self) -> pulumi.Input[str]:
        """
        The schema in which to create the function. Don't use the | character.
        """
        return pulumi.get(self, "schema")

    @schema.setter
    def schema(self, value: pulumi.Input[str]):
        pulumi.set(self, "schema", value)

    @property
    @pulumi.getter
    def statement(self) -> pulumi.Input[str]:
        """
        Specifies the javascript / java / sql / python code used to create the function.
        """
        return pulumi.get(self, "statement")

    @statement.setter
    def statement(self, value: pulumi.Input[str]):
        pulumi.set(self, "statement", value)

    @property
    @pulumi.getter
    def arguments(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['FunctionArgumentArgs']]]]:
        """
        List of the arguments for the function
        """
        return pulumi.get(self, "arguments")

    @arguments.setter
    def arguments(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['FunctionArgumentArgs']]]]):
        pulumi.set(self, "arguments", value)

    @property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies a comment for the function.
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "comment", value)

    @property
    @pulumi.getter
    def handler(self) -> Optional[pulumi.Input[str]]:
        """
        The handler method for Java / Python function.
        """
        return pulumi.get(self, "handler")

    @handler.setter
    def handler(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "handler", value)

    @property
    @pulumi.getter
    def imports(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Imports for Java / Python functions. For Java this a list of jar files, for Python this is a list of Python files.
        """
        return pulumi.get(self, "imports")

    @imports.setter
    def imports(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "imports", value)

    @property
    @pulumi.getter
    def language(self) -> Optional[pulumi.Input[str]]:
        """
        The language of the statement
        """
        return pulumi.get(self, "language")

    @language.setter
    def language(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "language", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the identifier for the function; does not have to be unique for the schema in which the function is created.
        Don't use the | character.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="nullInputBehavior")
    def null_input_behavior(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the behavior of the function when called with null inputs.
        """
        return pulumi.get(self, "null_input_behavior")

    @null_input_behavior.setter
    def null_input_behavior(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "null_input_behavior", value)

    @property
    @pulumi.getter
    def packages(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        List of package imports to use for Java / Python functions. For Java, package imports should be of the form:
        package_name:version_number, where package_name is snowflake_domain:package. For Python use it should be:
        ('numpy','pandas','xgboost==1.5.0').
        """
        return pulumi.get(self, "packages")

    @packages.setter
    def packages(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "packages", value)

    @property
    @pulumi.getter(name="returnBehavior")
    def return_behavior(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the behavior of the function when returning results
        """
        return pulumi.get(self, "return_behavior")

    @return_behavior.setter
    def return_behavior(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "return_behavior", value)

    @property
    @pulumi.getter(name="runtimeVersion")
    def runtime_version(self) -> Optional[pulumi.Input[str]]:
        """
        Required for Python functions. Specifies Python runtime version.
        """
        return pulumi.get(self, "runtime_version")

    @runtime_version.setter
    def runtime_version(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "runtime_version", value)

    @property
    @pulumi.getter(name="targetPath")
    def target_path(self) -> Optional[pulumi.Input[str]]:
        """
        The target path for the Java / Python functions. For Java, it is the path of compiled jar files and for the Python it is
        the path of the Python files.
        """
        return pulumi.get(self, "target_path")

    @target_path.setter
    def target_path(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "target_path", value)


@pulumi.input_type
class _FunctionState:
    def __init__(__self__, *,
                 arguments: Optional[pulumi.Input[Sequence[pulumi.Input['FunctionArgumentArgs']]]] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 database: Optional[pulumi.Input[str]] = None,
                 handler: Optional[pulumi.Input[str]] = None,
                 imports: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 language: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 null_input_behavior: Optional[pulumi.Input[str]] = None,
                 packages: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 return_behavior: Optional[pulumi.Input[str]] = None,
                 return_type: Optional[pulumi.Input[str]] = None,
                 runtime_version: Optional[pulumi.Input[str]] = None,
                 schema: Optional[pulumi.Input[str]] = None,
                 statement: Optional[pulumi.Input[str]] = None,
                 target_path: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Function resources.
        :param pulumi.Input[Sequence[pulumi.Input['FunctionArgumentArgs']]] arguments: List of the arguments for the function
        :param pulumi.Input[str] comment: Specifies a comment for the function.
        :param pulumi.Input[str] database: The database in which to create the function. Don't use the | character.
        :param pulumi.Input[str] handler: The handler method for Java / Python function.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] imports: Imports for Java / Python functions. For Java this a list of jar files, for Python this is a list of Python files.
        :param pulumi.Input[str] language: The language of the statement
        :param pulumi.Input[str] name: Specifies the identifier for the function; does not have to be unique for the schema in which the function is created.
               Don't use the | character.
        :param pulumi.Input[str] null_input_behavior: Specifies the behavior of the function when called with null inputs.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] packages: List of package imports to use for Java / Python functions. For Java, package imports should be of the form:
               package_name:version_number, where package_name is snowflake_domain:package. For Python use it should be:
               ('numpy','pandas','xgboost==1.5.0').
        :param pulumi.Input[str] return_behavior: Specifies the behavior of the function when returning results
        :param pulumi.Input[str] return_type: The return type of the function
        :param pulumi.Input[str] runtime_version: Required for Python functions. Specifies Python runtime version.
        :param pulumi.Input[str] schema: The schema in which to create the function. Don't use the | character.
        :param pulumi.Input[str] statement: Specifies the javascript / java / sql / python code used to create the function.
        :param pulumi.Input[str] target_path: The target path for the Java / Python functions. For Java, it is the path of compiled jar files and for the Python it is
               the path of the Python files.
        """
        if arguments is not None:
            pulumi.set(__self__, "arguments", arguments)
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if database is not None:
            pulumi.set(__self__, "database", database)
        if handler is not None:
            pulumi.set(__self__, "handler", handler)
        if imports is not None:
            pulumi.set(__self__, "imports", imports)
        if language is not None:
            pulumi.set(__self__, "language", language)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if null_input_behavior is not None:
            pulumi.set(__self__, "null_input_behavior", null_input_behavior)
        if packages is not None:
            pulumi.set(__self__, "packages", packages)
        if return_behavior is not None:
            pulumi.set(__self__, "return_behavior", return_behavior)
        if return_type is not None:
            pulumi.set(__self__, "return_type", return_type)
        if runtime_version is not None:
            pulumi.set(__self__, "runtime_version", runtime_version)
        if schema is not None:
            pulumi.set(__self__, "schema", schema)
        if statement is not None:
            pulumi.set(__self__, "statement", statement)
        if target_path is not None:
            pulumi.set(__self__, "target_path", target_path)

    @property
    @pulumi.getter
    def arguments(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['FunctionArgumentArgs']]]]:
        """
        List of the arguments for the function
        """
        return pulumi.get(self, "arguments")

    @arguments.setter
    def arguments(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['FunctionArgumentArgs']]]]):
        pulumi.set(self, "arguments", value)

    @property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies a comment for the function.
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "comment", value)

    @property
    @pulumi.getter
    def database(self) -> Optional[pulumi.Input[str]]:
        """
        The database in which to create the function. Don't use the | character.
        """
        return pulumi.get(self, "database")

    @database.setter
    def database(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "database", value)

    @property
    @pulumi.getter
    def handler(self) -> Optional[pulumi.Input[str]]:
        """
        The handler method for Java / Python function.
        """
        return pulumi.get(self, "handler")

    @handler.setter
    def handler(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "handler", value)

    @property
    @pulumi.getter
    def imports(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Imports for Java / Python functions. For Java this a list of jar files, for Python this is a list of Python files.
        """
        return pulumi.get(self, "imports")

    @imports.setter
    def imports(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "imports", value)

    @property
    @pulumi.getter
    def language(self) -> Optional[pulumi.Input[str]]:
        """
        The language of the statement
        """
        return pulumi.get(self, "language")

    @language.setter
    def language(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "language", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the identifier for the function; does not have to be unique for the schema in which the function is created.
        Don't use the | character.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="nullInputBehavior")
    def null_input_behavior(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the behavior of the function when called with null inputs.
        """
        return pulumi.get(self, "null_input_behavior")

    @null_input_behavior.setter
    def null_input_behavior(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "null_input_behavior", value)

    @property
    @pulumi.getter
    def packages(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        List of package imports to use for Java / Python functions. For Java, package imports should be of the form:
        package_name:version_number, where package_name is snowflake_domain:package. For Python use it should be:
        ('numpy','pandas','xgboost==1.5.0').
        """
        return pulumi.get(self, "packages")

    @packages.setter
    def packages(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "packages", value)

    @property
    @pulumi.getter(name="returnBehavior")
    def return_behavior(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the behavior of the function when returning results
        """
        return pulumi.get(self, "return_behavior")

    @return_behavior.setter
    def return_behavior(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "return_behavior", value)

    @property
    @pulumi.getter(name="returnType")
    def return_type(self) -> Optional[pulumi.Input[str]]:
        """
        The return type of the function
        """
        return pulumi.get(self, "return_type")

    @return_type.setter
    def return_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "return_type", value)

    @property
    @pulumi.getter(name="runtimeVersion")
    def runtime_version(self) -> Optional[pulumi.Input[str]]:
        """
        Required for Python functions. Specifies Python runtime version.
        """
        return pulumi.get(self, "runtime_version")

    @runtime_version.setter
    def runtime_version(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "runtime_version", value)

    @property
    @pulumi.getter
    def schema(self) -> Optional[pulumi.Input[str]]:
        """
        The schema in which to create the function. Don't use the | character.
        """
        return pulumi.get(self, "schema")

    @schema.setter
    def schema(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "schema", value)

    @property
    @pulumi.getter
    def statement(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the javascript / java / sql / python code used to create the function.
        """
        return pulumi.get(self, "statement")

    @statement.setter
    def statement(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "statement", value)

    @property
    @pulumi.getter(name="targetPath")
    def target_path(self) -> Optional[pulumi.Input[str]]:
        """
        The target path for the Java / Python functions. For Java, it is the path of compiled jar files and for the Python it is
        the path of the Python files.
        """
        return pulumi.get(self, "target_path")

    @target_path.setter
    def target_path(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "target_path", value)


class Function(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 arguments: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['FunctionArgumentArgs']]]]] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 database: Optional[pulumi.Input[str]] = None,
                 handler: Optional[pulumi.Input[str]] = None,
                 imports: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 language: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 null_input_behavior: Optional[pulumi.Input[str]] = None,
                 packages: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 return_behavior: Optional[pulumi.Input[str]] = None,
                 return_type: Optional[pulumi.Input[str]] = None,
                 runtime_version: Optional[pulumi.Input[str]] = None,
                 schema: Optional[pulumi.Input[str]] = None,
                 statement: Optional[pulumi.Input[str]] = None,
                 target_path: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ## Import

        # format is database name | schema name | function name | <list of arg types, separated with '-'>

        ```sh
         $ pulumi import snowflake:index/function:Function example 'dbName|schemaName|functionName|varchar-varchar-varchar'
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['FunctionArgumentArgs']]]] arguments: List of the arguments for the function
        :param pulumi.Input[str] comment: Specifies a comment for the function.
        :param pulumi.Input[str] database: The database in which to create the function. Don't use the | character.
        :param pulumi.Input[str] handler: The handler method for Java / Python function.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] imports: Imports for Java / Python functions. For Java this a list of jar files, for Python this is a list of Python files.
        :param pulumi.Input[str] language: The language of the statement
        :param pulumi.Input[str] name: Specifies the identifier for the function; does not have to be unique for the schema in which the function is created.
               Don't use the | character.
        :param pulumi.Input[str] null_input_behavior: Specifies the behavior of the function when called with null inputs.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] packages: List of package imports to use for Java / Python functions. For Java, package imports should be of the form:
               package_name:version_number, where package_name is snowflake_domain:package. For Python use it should be:
               ('numpy','pandas','xgboost==1.5.0').
        :param pulumi.Input[str] return_behavior: Specifies the behavior of the function when returning results
        :param pulumi.Input[str] return_type: The return type of the function
        :param pulumi.Input[str] runtime_version: Required for Python functions. Specifies Python runtime version.
        :param pulumi.Input[str] schema: The schema in which to create the function. Don't use the | character.
        :param pulumi.Input[str] statement: Specifies the javascript / java / sql / python code used to create the function.
        :param pulumi.Input[str] target_path: The target path for the Java / Python functions. For Java, it is the path of compiled jar files and for the Python it is
               the path of the Python files.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: FunctionArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Import

        # format is database name | schema name | function name | <list of arg types, separated with '-'>

        ```sh
         $ pulumi import snowflake:index/function:Function example 'dbName|schemaName|functionName|varchar-varchar-varchar'
        ```

        :param str resource_name: The name of the resource.
        :param FunctionArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(FunctionArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 arguments: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['FunctionArgumentArgs']]]]] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 database: Optional[pulumi.Input[str]] = None,
                 handler: Optional[pulumi.Input[str]] = None,
                 imports: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 language: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 null_input_behavior: Optional[pulumi.Input[str]] = None,
                 packages: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 return_behavior: Optional[pulumi.Input[str]] = None,
                 return_type: Optional[pulumi.Input[str]] = None,
                 runtime_version: Optional[pulumi.Input[str]] = None,
                 schema: Optional[pulumi.Input[str]] = None,
                 statement: Optional[pulumi.Input[str]] = None,
                 target_path: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = FunctionArgs.__new__(FunctionArgs)

            __props__.__dict__["arguments"] = arguments
            __props__.__dict__["comment"] = comment
            if database is None and not opts.urn:
                raise TypeError("Missing required property 'database'")
            __props__.__dict__["database"] = database
            __props__.__dict__["handler"] = handler
            __props__.__dict__["imports"] = imports
            __props__.__dict__["language"] = language
            __props__.__dict__["name"] = name
            __props__.__dict__["null_input_behavior"] = null_input_behavior
            __props__.__dict__["packages"] = packages
            __props__.__dict__["return_behavior"] = return_behavior
            if return_type is None and not opts.urn:
                raise TypeError("Missing required property 'return_type'")
            __props__.__dict__["return_type"] = return_type
            __props__.__dict__["runtime_version"] = runtime_version
            if schema is None and not opts.urn:
                raise TypeError("Missing required property 'schema'")
            __props__.__dict__["schema"] = schema
            if statement is None and not opts.urn:
                raise TypeError("Missing required property 'statement'")
            __props__.__dict__["statement"] = statement
            __props__.__dict__["target_path"] = target_path
        super(Function, __self__).__init__(
            'snowflake:index/function:Function',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arguments: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['FunctionArgumentArgs']]]]] = None,
            comment: Optional[pulumi.Input[str]] = None,
            database: Optional[pulumi.Input[str]] = None,
            handler: Optional[pulumi.Input[str]] = None,
            imports: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            language: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            null_input_behavior: Optional[pulumi.Input[str]] = None,
            packages: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            return_behavior: Optional[pulumi.Input[str]] = None,
            return_type: Optional[pulumi.Input[str]] = None,
            runtime_version: Optional[pulumi.Input[str]] = None,
            schema: Optional[pulumi.Input[str]] = None,
            statement: Optional[pulumi.Input[str]] = None,
            target_path: Optional[pulumi.Input[str]] = None) -> 'Function':
        """
        Get an existing Function resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['FunctionArgumentArgs']]]] arguments: List of the arguments for the function
        :param pulumi.Input[str] comment: Specifies a comment for the function.
        :param pulumi.Input[str] database: The database in which to create the function. Don't use the | character.
        :param pulumi.Input[str] handler: The handler method for Java / Python function.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] imports: Imports for Java / Python functions. For Java this a list of jar files, for Python this is a list of Python files.
        :param pulumi.Input[str] language: The language of the statement
        :param pulumi.Input[str] name: Specifies the identifier for the function; does not have to be unique for the schema in which the function is created.
               Don't use the | character.
        :param pulumi.Input[str] null_input_behavior: Specifies the behavior of the function when called with null inputs.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] packages: List of package imports to use for Java / Python functions. For Java, package imports should be of the form:
               package_name:version_number, where package_name is snowflake_domain:package. For Python use it should be:
               ('numpy','pandas','xgboost==1.5.0').
        :param pulumi.Input[str] return_behavior: Specifies the behavior of the function when returning results
        :param pulumi.Input[str] return_type: The return type of the function
        :param pulumi.Input[str] runtime_version: Required for Python functions. Specifies Python runtime version.
        :param pulumi.Input[str] schema: The schema in which to create the function. Don't use the | character.
        :param pulumi.Input[str] statement: Specifies the javascript / java / sql / python code used to create the function.
        :param pulumi.Input[str] target_path: The target path for the Java / Python functions. For Java, it is the path of compiled jar files and for the Python it is
               the path of the Python files.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _FunctionState.__new__(_FunctionState)

        __props__.__dict__["arguments"] = arguments
        __props__.__dict__["comment"] = comment
        __props__.__dict__["database"] = database
        __props__.__dict__["handler"] = handler
        __props__.__dict__["imports"] = imports
        __props__.__dict__["language"] = language
        __props__.__dict__["name"] = name
        __props__.__dict__["null_input_behavior"] = null_input_behavior
        __props__.__dict__["packages"] = packages
        __props__.__dict__["return_behavior"] = return_behavior
        __props__.__dict__["return_type"] = return_type
        __props__.__dict__["runtime_version"] = runtime_version
        __props__.__dict__["schema"] = schema
        __props__.__dict__["statement"] = statement
        __props__.__dict__["target_path"] = target_path
        return Function(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arguments(self) -> pulumi.Output[Optional[Sequence['outputs.FunctionArgument']]]:
        """
        List of the arguments for the function
        """
        return pulumi.get(self, "arguments")

    @property
    @pulumi.getter
    def comment(self) -> pulumi.Output[Optional[str]]:
        """
        Specifies a comment for the function.
        """
        return pulumi.get(self, "comment")

    @property
    @pulumi.getter
    def database(self) -> pulumi.Output[str]:
        """
        The database in which to create the function. Don't use the | character.
        """
        return pulumi.get(self, "database")

    @property
    @pulumi.getter
    def handler(self) -> pulumi.Output[Optional[str]]:
        """
        The handler method for Java / Python function.
        """
        return pulumi.get(self, "handler")

    @property
    @pulumi.getter
    def imports(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        Imports for Java / Python functions. For Java this a list of jar files, for Python this is a list of Python files.
        """
        return pulumi.get(self, "imports")

    @property
    @pulumi.getter
    def language(self) -> pulumi.Output[Optional[str]]:
        """
        The language of the statement
        """
        return pulumi.get(self, "language")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Specifies the identifier for the function; does not have to be unique for the schema in which the function is created.
        Don't use the | character.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="nullInputBehavior")
    def null_input_behavior(self) -> pulumi.Output[Optional[str]]:
        """
        Specifies the behavior of the function when called with null inputs.
        """
        return pulumi.get(self, "null_input_behavior")

    @property
    @pulumi.getter
    def packages(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        List of package imports to use for Java / Python functions. For Java, package imports should be of the form:
        package_name:version_number, where package_name is snowflake_domain:package. For Python use it should be:
        ('numpy','pandas','xgboost==1.5.0').
        """
        return pulumi.get(self, "packages")

    @property
    @pulumi.getter(name="returnBehavior")
    def return_behavior(self) -> pulumi.Output[Optional[str]]:
        """
        Specifies the behavior of the function when returning results
        """
        return pulumi.get(self, "return_behavior")

    @property
    @pulumi.getter(name="returnType")
    def return_type(self) -> pulumi.Output[str]:
        """
        The return type of the function
        """
        return pulumi.get(self, "return_type")

    @property
    @pulumi.getter(name="runtimeVersion")
    def runtime_version(self) -> pulumi.Output[Optional[str]]:
        """
        Required for Python functions. Specifies Python runtime version.
        """
        return pulumi.get(self, "runtime_version")

    @property
    @pulumi.getter
    def schema(self) -> pulumi.Output[str]:
        """
        The schema in which to create the function. Don't use the | character.
        """
        return pulumi.get(self, "schema")

    @property
    @pulumi.getter
    def statement(self) -> pulumi.Output[str]:
        """
        Specifies the javascript / java / sql / python code used to create the function.
        """
        return pulumi.get(self, "statement")

    @property
    @pulumi.getter(name="targetPath")
    def target_path(self) -> pulumi.Output[Optional[str]]:
        """
        The target path for the Java / Python functions. For Java, it is the path of compiled jar files and for the Python it is
        the path of the Python files.
        """
        return pulumi.get(self, "target_path")

