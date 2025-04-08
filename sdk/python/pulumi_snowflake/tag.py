# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins
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

__all__ = ['TagArgs', 'Tag']

@pulumi.input_type
class TagArgs:
    def __init__(__self__, *,
                 database: pulumi.Input[builtins.str],
                 schema: pulumi.Input[builtins.str],
                 allowed_values: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]] = None,
                 comment: Optional[pulumi.Input[builtins.str]] = None,
                 masking_policies: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None):
        """
        The set of arguments for constructing a Tag resource.
        :param pulumi.Input[builtins.str] database: The database in which to create the tag. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        :param pulumi.Input[builtins.str] schema: The schema in which to create the tag. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        :param pulumi.Input[Sequence[pulumi.Input[builtins.str]]] allowed_values: Set of allowed values for the tag.
        :param pulumi.Input[builtins.str] comment: Specifies a comment for the tag.
        :param pulumi.Input[Sequence[pulumi.Input[builtins.str]]] masking_policies: Set of masking policies for the tag. A tag can support one masking policy for each data type. If masking policies are assigned to the tag, before dropping the tag, the provider automatically unassigns them. For more information about this resource, see docs.
        :param pulumi.Input[builtins.str] name: Specifies the identifier for the tag; must be unique for the database in which the tag is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        """
        pulumi.set(__self__, "database", database)
        pulumi.set(__self__, "schema", schema)
        if allowed_values is not None:
            pulumi.set(__self__, "allowed_values", allowed_values)
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if masking_policies is not None:
            pulumi.set(__self__, "masking_policies", masking_policies)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def database(self) -> pulumi.Input[builtins.str]:
        """
        The database in which to create the tag. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        """
        return pulumi.get(self, "database")

    @database.setter
    def database(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "database", value)

    @property
    @pulumi.getter
    def schema(self) -> pulumi.Input[builtins.str]:
        """
        The schema in which to create the tag. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        """
        return pulumi.get(self, "schema")

    @schema.setter
    def schema(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "schema", value)

    @property
    @pulumi.getter(name="allowedValues")
    def allowed_values(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]]:
        """
        Set of allowed values for the tag.
        """
        return pulumi.get(self, "allowed_values")

    @allowed_values.setter
    def allowed_values(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]]):
        pulumi.set(self, "allowed_values", value)

    @property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Specifies a comment for the tag.
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "comment", value)

    @property
    @pulumi.getter(name="maskingPolicies")
    def masking_policies(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]]:
        """
        Set of masking policies for the tag. A tag can support one masking policy for each data type. If masking policies are assigned to the tag, before dropping the tag, the provider automatically unassigns them. For more information about this resource, see docs.
        """
        return pulumi.get(self, "masking_policies")

    @masking_policies.setter
    def masking_policies(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]]):
        pulumi.set(self, "masking_policies", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Specifies the identifier for the tag; must be unique for the database in which the tag is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _TagState:
    def __init__(__self__, *,
                 allowed_values: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]] = None,
                 comment: Optional[pulumi.Input[builtins.str]] = None,
                 database: Optional[pulumi.Input[builtins.str]] = None,
                 fully_qualified_name: Optional[pulumi.Input[builtins.str]] = None,
                 masking_policies: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 schema: Optional[pulumi.Input[builtins.str]] = None,
                 show_outputs: Optional[pulumi.Input[Sequence[pulumi.Input['TagShowOutputArgs']]]] = None):
        """
        Input properties used for looking up and filtering Tag resources.
        :param pulumi.Input[Sequence[pulumi.Input[builtins.str]]] allowed_values: Set of allowed values for the tag.
        :param pulumi.Input[builtins.str] comment: Specifies a comment for the tag.
        :param pulumi.Input[builtins.str] database: The database in which to create the tag. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        :param pulumi.Input[builtins.str] fully_qualified_name: Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        :param pulumi.Input[Sequence[pulumi.Input[builtins.str]]] masking_policies: Set of masking policies for the tag. A tag can support one masking policy for each data type. If masking policies are assigned to the tag, before dropping the tag, the provider automatically unassigns them. For more information about this resource, see docs.
        :param pulumi.Input[builtins.str] name: Specifies the identifier for the tag; must be unique for the database in which the tag is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        :param pulumi.Input[builtins.str] schema: The schema in which to create the tag. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        :param pulumi.Input[Sequence[pulumi.Input['TagShowOutputArgs']]] show_outputs: Outputs the result of `SHOW TAGS` for the given tag.
        """
        if allowed_values is not None:
            pulumi.set(__self__, "allowed_values", allowed_values)
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if database is not None:
            pulumi.set(__self__, "database", database)
        if fully_qualified_name is not None:
            pulumi.set(__self__, "fully_qualified_name", fully_qualified_name)
        if masking_policies is not None:
            pulumi.set(__self__, "masking_policies", masking_policies)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if schema is not None:
            pulumi.set(__self__, "schema", schema)
        if show_outputs is not None:
            pulumi.set(__self__, "show_outputs", show_outputs)

    @property
    @pulumi.getter(name="allowedValues")
    def allowed_values(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]]:
        """
        Set of allowed values for the tag.
        """
        return pulumi.get(self, "allowed_values")

    @allowed_values.setter
    def allowed_values(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]]):
        pulumi.set(self, "allowed_values", value)

    @property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Specifies a comment for the tag.
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "comment", value)

    @property
    @pulumi.getter
    def database(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The database in which to create the tag. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        """
        return pulumi.get(self, "database")

    @database.setter
    def database(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "database", value)

    @property
    @pulumi.getter(name="fullyQualifiedName")
    def fully_qualified_name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        """
        return pulumi.get(self, "fully_qualified_name")

    @fully_qualified_name.setter
    def fully_qualified_name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "fully_qualified_name", value)

    @property
    @pulumi.getter(name="maskingPolicies")
    def masking_policies(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]]:
        """
        Set of masking policies for the tag. A tag can support one masking policy for each data type. If masking policies are assigned to the tag, before dropping the tag, the provider automatically unassigns them. For more information about this resource, see docs.
        """
        return pulumi.get(self, "masking_policies")

    @masking_policies.setter
    def masking_policies(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]]):
        pulumi.set(self, "masking_policies", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Specifies the identifier for the tag; must be unique for the database in which the tag is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def schema(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The schema in which to create the tag. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        """
        return pulumi.get(self, "schema")

    @schema.setter
    def schema(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "schema", value)

    @property
    @pulumi.getter(name="showOutputs")
    def show_outputs(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['TagShowOutputArgs']]]]:
        """
        Outputs the result of `SHOW TAGS` for the given tag.
        """
        return pulumi.get(self, "show_outputs")

    @show_outputs.setter
    def show_outputs(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['TagShowOutputArgs']]]]):
        pulumi.set(self, "show_outputs", value)


class Tag(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 allowed_values: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]] = None,
                 comment: Optional[pulumi.Input[builtins.str]] = None,
                 database: Optional[pulumi.Input[builtins.str]] = None,
                 masking_policies: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 schema: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        """
        ## Import

        ```sh
        $ pulumi import snowflake:index/tag:Tag example '"<database_name>"."<schema_name>"."<tag_name>"'
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[builtins.str]]] allowed_values: Set of allowed values for the tag.
        :param pulumi.Input[builtins.str] comment: Specifies a comment for the tag.
        :param pulumi.Input[builtins.str] database: The database in which to create the tag. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        :param pulumi.Input[Sequence[pulumi.Input[builtins.str]]] masking_policies: Set of masking policies for the tag. A tag can support one masking policy for each data type. If masking policies are assigned to the tag, before dropping the tag, the provider automatically unassigns them. For more information about this resource, see docs.
        :param pulumi.Input[builtins.str] name: Specifies the identifier for the tag; must be unique for the database in which the tag is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        :param pulumi.Input[builtins.str] schema: The schema in which to create the tag. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: TagArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Import

        ```sh
        $ pulumi import snowflake:index/tag:Tag example '"<database_name>"."<schema_name>"."<tag_name>"'
        ```

        :param str resource_name: The name of the resource.
        :param TagArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(TagArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 allowed_values: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]] = None,
                 comment: Optional[pulumi.Input[builtins.str]] = None,
                 database: Optional[pulumi.Input[builtins.str]] = None,
                 masking_policies: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 schema: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = TagArgs.__new__(TagArgs)

            __props__.__dict__["allowed_values"] = allowed_values
            __props__.__dict__["comment"] = comment
            if database is None and not opts.urn:
                raise TypeError("Missing required property 'database'")
            __props__.__dict__["database"] = database
            __props__.__dict__["masking_policies"] = masking_policies
            __props__.__dict__["name"] = name
            if schema is None and not opts.urn:
                raise TypeError("Missing required property 'schema'")
            __props__.__dict__["schema"] = schema
            __props__.__dict__["fully_qualified_name"] = None
            __props__.__dict__["show_outputs"] = None
        super(Tag, __self__).__init__(
            'snowflake:index/tag:Tag',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            allowed_values: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]] = None,
            comment: Optional[pulumi.Input[builtins.str]] = None,
            database: Optional[pulumi.Input[builtins.str]] = None,
            fully_qualified_name: Optional[pulumi.Input[builtins.str]] = None,
            masking_policies: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]] = None,
            name: Optional[pulumi.Input[builtins.str]] = None,
            schema: Optional[pulumi.Input[builtins.str]] = None,
            show_outputs: Optional[pulumi.Input[Sequence[pulumi.Input[Union['TagShowOutputArgs', 'TagShowOutputArgsDict']]]]] = None) -> 'Tag':
        """
        Get an existing Tag resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[builtins.str]]] allowed_values: Set of allowed values for the tag.
        :param pulumi.Input[builtins.str] comment: Specifies a comment for the tag.
        :param pulumi.Input[builtins.str] database: The database in which to create the tag. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        :param pulumi.Input[builtins.str] fully_qualified_name: Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        :param pulumi.Input[Sequence[pulumi.Input[builtins.str]]] masking_policies: Set of masking policies for the tag. A tag can support one masking policy for each data type. If masking policies are assigned to the tag, before dropping the tag, the provider automatically unassigns them. For more information about this resource, see docs.
        :param pulumi.Input[builtins.str] name: Specifies the identifier for the tag; must be unique for the database in which the tag is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        :param pulumi.Input[builtins.str] schema: The schema in which to create the tag. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        :param pulumi.Input[Sequence[pulumi.Input[Union['TagShowOutputArgs', 'TagShowOutputArgsDict']]]] show_outputs: Outputs the result of `SHOW TAGS` for the given tag.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _TagState.__new__(_TagState)

        __props__.__dict__["allowed_values"] = allowed_values
        __props__.__dict__["comment"] = comment
        __props__.__dict__["database"] = database
        __props__.__dict__["fully_qualified_name"] = fully_qualified_name
        __props__.__dict__["masking_policies"] = masking_policies
        __props__.__dict__["name"] = name
        __props__.__dict__["schema"] = schema
        __props__.__dict__["show_outputs"] = show_outputs
        return Tag(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="allowedValues")
    def allowed_values(self) -> pulumi.Output[Optional[Sequence[builtins.str]]]:
        """
        Set of allowed values for the tag.
        """
        return pulumi.get(self, "allowed_values")

    @property
    @pulumi.getter
    def comment(self) -> pulumi.Output[Optional[builtins.str]]:
        """
        Specifies a comment for the tag.
        """
        return pulumi.get(self, "comment")

    @property
    @pulumi.getter
    def database(self) -> pulumi.Output[builtins.str]:
        """
        The database in which to create the tag. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        """
        return pulumi.get(self, "database")

    @property
    @pulumi.getter(name="fullyQualifiedName")
    def fully_qualified_name(self) -> pulumi.Output[builtins.str]:
        """
        Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        """
        return pulumi.get(self, "fully_qualified_name")

    @property
    @pulumi.getter(name="maskingPolicies")
    def masking_policies(self) -> pulumi.Output[Optional[Sequence[builtins.str]]]:
        """
        Set of masking policies for the tag. A tag can support one masking policy for each data type. If masking policies are assigned to the tag, before dropping the tag, the provider automatically unassigns them. For more information about this resource, see docs.
        """
        return pulumi.get(self, "masking_policies")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[builtins.str]:
        """
        Specifies the identifier for the tag; must be unique for the database in which the tag is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def schema(self) -> pulumi.Output[builtins.str]:
        """
        The schema in which to create the tag. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        """
        return pulumi.get(self, "schema")

    @property
    @pulumi.getter(name="showOutputs")
    def show_outputs(self) -> pulumi.Output[Sequence['outputs.TagShowOutput']]:
        """
        Outputs the result of `SHOW TAGS` for the given tag.
        """
        return pulumi.get(self, "show_outputs")

