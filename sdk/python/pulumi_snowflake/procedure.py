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

__all__ = ['ProcedureArgs', 'Procedure']

@pulumi.input_type
class ProcedureArgs:
    def __init__(__self__, *,
                 database: pulumi.Input[str],
                 return_type: pulumi.Input[str],
                 schema: pulumi.Input[str],
                 statement: pulumi.Input[str],
                 arguments: Optional[pulumi.Input[Sequence[pulumi.Input['ProcedureArgumentArgs']]]] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 execute_as: Optional[pulumi.Input[str]] = None,
                 language: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 null_input_behavior: Optional[pulumi.Input[str]] = None,
                 return_behavior: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Procedure resource.
        :param pulumi.Input[str] database: The database in which to create the procedure. Don't use the | character.
        :param pulumi.Input[str] return_type: The return type of the procedure
        :param pulumi.Input[str] schema: The schema in which to create the procedure. Don't use the | character.
        :param pulumi.Input[str] statement: Specifies the javascript code used to create the procedure.
        :param pulumi.Input[Sequence[pulumi.Input['ProcedureArgumentArgs']]] arguments: List of the arguments for the procedure
        :param pulumi.Input[str] comment: Specifies a comment for the procedure.
        :param pulumi.Input[str] execute_as: Sets execute context - see caller's rights and owner's rights
        :param pulumi.Input[str] language: Specifies the language of the stored procedure code.
        :param pulumi.Input[str] name: Specifies the identifier for the procedure; does not have to be unique for the schema in which the procedure is created. Don't use the | character.
        :param pulumi.Input[str] null_input_behavior: Specifies the behavior of the procedure when called with null inputs.
        :param pulumi.Input[str] return_behavior: Specifies the behavior of the function when returning results
        """
        pulumi.set(__self__, "database", database)
        pulumi.set(__self__, "return_type", return_type)
        pulumi.set(__self__, "schema", schema)
        pulumi.set(__self__, "statement", statement)
        if arguments is not None:
            pulumi.set(__self__, "arguments", arguments)
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if execute_as is not None:
            pulumi.set(__self__, "execute_as", execute_as)
        if language is not None:
            pulumi.set(__self__, "language", language)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if null_input_behavior is not None:
            pulumi.set(__self__, "null_input_behavior", null_input_behavior)
        if return_behavior is not None:
            pulumi.set(__self__, "return_behavior", return_behavior)

    @property
    @pulumi.getter
    def database(self) -> pulumi.Input[str]:
        """
        The database in which to create the procedure. Don't use the | character.
        """
        return pulumi.get(self, "database")

    @database.setter
    def database(self, value: pulumi.Input[str]):
        pulumi.set(self, "database", value)

    @property
    @pulumi.getter(name="returnType")
    def return_type(self) -> pulumi.Input[str]:
        """
        The return type of the procedure
        """
        return pulumi.get(self, "return_type")

    @return_type.setter
    def return_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "return_type", value)

    @property
    @pulumi.getter
    def schema(self) -> pulumi.Input[str]:
        """
        The schema in which to create the procedure. Don't use the | character.
        """
        return pulumi.get(self, "schema")

    @schema.setter
    def schema(self, value: pulumi.Input[str]):
        pulumi.set(self, "schema", value)

    @property
    @pulumi.getter
    def statement(self) -> pulumi.Input[str]:
        """
        Specifies the javascript code used to create the procedure.
        """
        return pulumi.get(self, "statement")

    @statement.setter
    def statement(self, value: pulumi.Input[str]):
        pulumi.set(self, "statement", value)

    @property
    @pulumi.getter
    def arguments(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ProcedureArgumentArgs']]]]:
        """
        List of the arguments for the procedure
        """
        return pulumi.get(self, "arguments")

    @arguments.setter
    def arguments(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ProcedureArgumentArgs']]]]):
        pulumi.set(self, "arguments", value)

    @property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies a comment for the procedure.
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "comment", value)

    @property
    @pulumi.getter(name="executeAs")
    def execute_as(self) -> Optional[pulumi.Input[str]]:
        """
        Sets execute context - see caller's rights and owner's rights
        """
        return pulumi.get(self, "execute_as")

    @execute_as.setter
    def execute_as(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "execute_as", value)

    @property
    @pulumi.getter
    def language(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the language of the stored procedure code.
        """
        return pulumi.get(self, "language")

    @language.setter
    def language(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "language", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the identifier for the procedure; does not have to be unique for the schema in which the procedure is created. Don't use the | character.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="nullInputBehavior")
    def null_input_behavior(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the behavior of the procedure when called with null inputs.
        """
        return pulumi.get(self, "null_input_behavior")

    @null_input_behavior.setter
    def null_input_behavior(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "null_input_behavior", value)

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


@pulumi.input_type
class _ProcedureState:
    def __init__(__self__, *,
                 arguments: Optional[pulumi.Input[Sequence[pulumi.Input['ProcedureArgumentArgs']]]] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 database: Optional[pulumi.Input[str]] = None,
                 execute_as: Optional[pulumi.Input[str]] = None,
                 language: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 null_input_behavior: Optional[pulumi.Input[str]] = None,
                 return_behavior: Optional[pulumi.Input[str]] = None,
                 return_type: Optional[pulumi.Input[str]] = None,
                 schema: Optional[pulumi.Input[str]] = None,
                 statement: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Procedure resources.
        :param pulumi.Input[Sequence[pulumi.Input['ProcedureArgumentArgs']]] arguments: List of the arguments for the procedure
        :param pulumi.Input[str] comment: Specifies a comment for the procedure.
        :param pulumi.Input[str] database: The database in which to create the procedure. Don't use the | character.
        :param pulumi.Input[str] execute_as: Sets execute context - see caller's rights and owner's rights
        :param pulumi.Input[str] language: Specifies the language of the stored procedure code.
        :param pulumi.Input[str] name: Specifies the identifier for the procedure; does not have to be unique for the schema in which the procedure is created. Don't use the | character.
        :param pulumi.Input[str] null_input_behavior: Specifies the behavior of the procedure when called with null inputs.
        :param pulumi.Input[str] return_behavior: Specifies the behavior of the function when returning results
        :param pulumi.Input[str] return_type: The return type of the procedure
        :param pulumi.Input[str] schema: The schema in which to create the procedure. Don't use the | character.
        :param pulumi.Input[str] statement: Specifies the javascript code used to create the procedure.
        """
        if arguments is not None:
            pulumi.set(__self__, "arguments", arguments)
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if database is not None:
            pulumi.set(__self__, "database", database)
        if execute_as is not None:
            pulumi.set(__self__, "execute_as", execute_as)
        if language is not None:
            pulumi.set(__self__, "language", language)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if null_input_behavior is not None:
            pulumi.set(__self__, "null_input_behavior", null_input_behavior)
        if return_behavior is not None:
            pulumi.set(__self__, "return_behavior", return_behavior)
        if return_type is not None:
            pulumi.set(__self__, "return_type", return_type)
        if schema is not None:
            pulumi.set(__self__, "schema", schema)
        if statement is not None:
            pulumi.set(__self__, "statement", statement)

    @property
    @pulumi.getter
    def arguments(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ProcedureArgumentArgs']]]]:
        """
        List of the arguments for the procedure
        """
        return pulumi.get(self, "arguments")

    @arguments.setter
    def arguments(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ProcedureArgumentArgs']]]]):
        pulumi.set(self, "arguments", value)

    @property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies a comment for the procedure.
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "comment", value)

    @property
    @pulumi.getter
    def database(self) -> Optional[pulumi.Input[str]]:
        """
        The database in which to create the procedure. Don't use the | character.
        """
        return pulumi.get(self, "database")

    @database.setter
    def database(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "database", value)

    @property
    @pulumi.getter(name="executeAs")
    def execute_as(self) -> Optional[pulumi.Input[str]]:
        """
        Sets execute context - see caller's rights and owner's rights
        """
        return pulumi.get(self, "execute_as")

    @execute_as.setter
    def execute_as(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "execute_as", value)

    @property
    @pulumi.getter
    def language(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the language of the stored procedure code.
        """
        return pulumi.get(self, "language")

    @language.setter
    def language(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "language", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the identifier for the procedure; does not have to be unique for the schema in which the procedure is created. Don't use the | character.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="nullInputBehavior")
    def null_input_behavior(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the behavior of the procedure when called with null inputs.
        """
        return pulumi.get(self, "null_input_behavior")

    @null_input_behavior.setter
    def null_input_behavior(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "null_input_behavior", value)

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
        The return type of the procedure
        """
        return pulumi.get(self, "return_type")

    @return_type.setter
    def return_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "return_type", value)

    @property
    @pulumi.getter
    def schema(self) -> Optional[pulumi.Input[str]]:
        """
        The schema in which to create the procedure. Don't use the | character.
        """
        return pulumi.get(self, "schema")

    @schema.setter
    def schema(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "schema", value)

    @property
    @pulumi.getter
    def statement(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the javascript code used to create the procedure.
        """
        return pulumi.get(self, "statement")

    @statement.setter
    def statement(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "statement", value)


class Procedure(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 arguments: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ProcedureArgumentArgs']]]]] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 database: Optional[pulumi.Input[str]] = None,
                 execute_as: Optional[pulumi.Input[str]] = None,
                 language: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 null_input_behavior: Optional[pulumi.Input[str]] = None,
                 return_behavior: Optional[pulumi.Input[str]] = None,
                 return_type: Optional[pulumi.Input[str]] = None,
                 schema: Optional[pulumi.Input[str]] = None,
                 statement: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ## Import

        format is database name | schema name | stored procedure name | <list of arg types, separated with '-'>

        ```sh
         $ pulumi import snowflake:index/procedure:Procedure example 'dbName|schemaName|procedureName|varchar-varchar-varchar'
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ProcedureArgumentArgs']]]] arguments: List of the arguments for the procedure
        :param pulumi.Input[str] comment: Specifies a comment for the procedure.
        :param pulumi.Input[str] database: The database in which to create the procedure. Don't use the | character.
        :param pulumi.Input[str] execute_as: Sets execute context - see caller's rights and owner's rights
        :param pulumi.Input[str] language: Specifies the language of the stored procedure code.
        :param pulumi.Input[str] name: Specifies the identifier for the procedure; does not have to be unique for the schema in which the procedure is created. Don't use the | character.
        :param pulumi.Input[str] null_input_behavior: Specifies the behavior of the procedure when called with null inputs.
        :param pulumi.Input[str] return_behavior: Specifies the behavior of the function when returning results
        :param pulumi.Input[str] return_type: The return type of the procedure
        :param pulumi.Input[str] schema: The schema in which to create the procedure. Don't use the | character.
        :param pulumi.Input[str] statement: Specifies the javascript code used to create the procedure.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ProcedureArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Import

        format is database name | schema name | stored procedure name | <list of arg types, separated with '-'>

        ```sh
         $ pulumi import snowflake:index/procedure:Procedure example 'dbName|schemaName|procedureName|varchar-varchar-varchar'
        ```

        :param str resource_name: The name of the resource.
        :param ProcedureArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ProcedureArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 arguments: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ProcedureArgumentArgs']]]]] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 database: Optional[pulumi.Input[str]] = None,
                 execute_as: Optional[pulumi.Input[str]] = None,
                 language: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 null_input_behavior: Optional[pulumi.Input[str]] = None,
                 return_behavior: Optional[pulumi.Input[str]] = None,
                 return_type: Optional[pulumi.Input[str]] = None,
                 schema: Optional[pulumi.Input[str]] = None,
                 statement: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ProcedureArgs.__new__(ProcedureArgs)

            __props__.__dict__["arguments"] = arguments
            __props__.__dict__["comment"] = comment
            if database is None and not opts.urn:
                raise TypeError("Missing required property 'database'")
            __props__.__dict__["database"] = database
            __props__.__dict__["execute_as"] = execute_as
            __props__.__dict__["language"] = language
            __props__.__dict__["name"] = name
            __props__.__dict__["null_input_behavior"] = null_input_behavior
            __props__.__dict__["return_behavior"] = return_behavior
            if return_type is None and not opts.urn:
                raise TypeError("Missing required property 'return_type'")
            __props__.__dict__["return_type"] = return_type
            if schema is None and not opts.urn:
                raise TypeError("Missing required property 'schema'")
            __props__.__dict__["schema"] = schema
            if statement is None and not opts.urn:
                raise TypeError("Missing required property 'statement'")
            __props__.__dict__["statement"] = statement
        super(Procedure, __self__).__init__(
            'snowflake:index/procedure:Procedure',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arguments: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ProcedureArgumentArgs']]]]] = None,
            comment: Optional[pulumi.Input[str]] = None,
            database: Optional[pulumi.Input[str]] = None,
            execute_as: Optional[pulumi.Input[str]] = None,
            language: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            null_input_behavior: Optional[pulumi.Input[str]] = None,
            return_behavior: Optional[pulumi.Input[str]] = None,
            return_type: Optional[pulumi.Input[str]] = None,
            schema: Optional[pulumi.Input[str]] = None,
            statement: Optional[pulumi.Input[str]] = None) -> 'Procedure':
        """
        Get an existing Procedure resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ProcedureArgumentArgs']]]] arguments: List of the arguments for the procedure
        :param pulumi.Input[str] comment: Specifies a comment for the procedure.
        :param pulumi.Input[str] database: The database in which to create the procedure. Don't use the | character.
        :param pulumi.Input[str] execute_as: Sets execute context - see caller's rights and owner's rights
        :param pulumi.Input[str] language: Specifies the language of the stored procedure code.
        :param pulumi.Input[str] name: Specifies the identifier for the procedure; does not have to be unique for the schema in which the procedure is created. Don't use the | character.
        :param pulumi.Input[str] null_input_behavior: Specifies the behavior of the procedure when called with null inputs.
        :param pulumi.Input[str] return_behavior: Specifies the behavior of the function when returning results
        :param pulumi.Input[str] return_type: The return type of the procedure
        :param pulumi.Input[str] schema: The schema in which to create the procedure. Don't use the | character.
        :param pulumi.Input[str] statement: Specifies the javascript code used to create the procedure.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ProcedureState.__new__(_ProcedureState)

        __props__.__dict__["arguments"] = arguments
        __props__.__dict__["comment"] = comment
        __props__.__dict__["database"] = database
        __props__.__dict__["execute_as"] = execute_as
        __props__.__dict__["language"] = language
        __props__.__dict__["name"] = name
        __props__.__dict__["null_input_behavior"] = null_input_behavior
        __props__.__dict__["return_behavior"] = return_behavior
        __props__.__dict__["return_type"] = return_type
        __props__.__dict__["schema"] = schema
        __props__.__dict__["statement"] = statement
        return Procedure(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arguments(self) -> pulumi.Output[Optional[Sequence['outputs.ProcedureArgument']]]:
        """
        List of the arguments for the procedure
        """
        return pulumi.get(self, "arguments")

    @property
    @pulumi.getter
    def comment(self) -> pulumi.Output[Optional[str]]:
        """
        Specifies a comment for the procedure.
        """
        return pulumi.get(self, "comment")

    @property
    @pulumi.getter
    def database(self) -> pulumi.Output[str]:
        """
        The database in which to create the procedure. Don't use the | character.
        """
        return pulumi.get(self, "database")

    @property
    @pulumi.getter(name="executeAs")
    def execute_as(self) -> pulumi.Output[Optional[str]]:
        """
        Sets execute context - see caller's rights and owner's rights
        """
        return pulumi.get(self, "execute_as")

    @property
    @pulumi.getter
    def language(self) -> pulumi.Output[Optional[str]]:
        """
        Specifies the language of the stored procedure code.
        """
        return pulumi.get(self, "language")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Specifies the identifier for the procedure; does not have to be unique for the schema in which the procedure is created. Don't use the | character.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="nullInputBehavior")
    def null_input_behavior(self) -> pulumi.Output[Optional[str]]:
        """
        Specifies the behavior of the procedure when called with null inputs.
        """
        return pulumi.get(self, "null_input_behavior")

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
        The return type of the procedure
        """
        return pulumi.get(self, "return_type")

    @property
    @pulumi.getter
    def schema(self) -> pulumi.Output[str]:
        """
        The schema in which to create the procedure. Don't use the | character.
        """
        return pulumi.get(self, "schema")

    @property
    @pulumi.getter
    def statement(self) -> pulumi.Output[str]:
        """
        Specifies the javascript code used to create the procedure.
        """
        return pulumi.get(self, "statement")

