# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['RowAccessPolicyArgs', 'RowAccessPolicy']

@pulumi.input_type
class RowAccessPolicyArgs:
    def __init__(__self__, *,
                 database: pulumi.Input[str],
                 row_access_expression: pulumi.Input[str],
                 schema: pulumi.Input[str],
                 signature: pulumi.Input[Mapping[str, pulumi.Input[str]]],
                 comment: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a RowAccessPolicy resource.
        :param pulumi.Input[str] database: The database in which to create the row access policy.
        :param pulumi.Input[str] row_access_expression: Specifies the SQL expression. The expression can be any boolean-valued SQL expression.
        :param pulumi.Input[str] schema: The schema in which to create the row access policy.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] signature: Specifies signature (arguments) for the row access policy (uppercase and sorted to avoid recreation of resource). A signature specifies a set of attributes that must be considered to determine whether the row is accessible. The attribute values come from the database object (e.g. table or view) to be protected by the row access policy.
        :param pulumi.Input[str] comment: Specifies a comment for the row access policy.
        :param pulumi.Input[str] name: Specifies the identifier for the row access policy; must be unique for the database and schema in which the row access policy is created.
        """
        pulumi.set(__self__, "database", database)
        pulumi.set(__self__, "row_access_expression", row_access_expression)
        pulumi.set(__self__, "schema", schema)
        pulumi.set(__self__, "signature", signature)
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def database(self) -> pulumi.Input[str]:
        """
        The database in which to create the row access policy.
        """
        return pulumi.get(self, "database")

    @database.setter
    def database(self, value: pulumi.Input[str]):
        pulumi.set(self, "database", value)

    @property
    @pulumi.getter(name="rowAccessExpression")
    def row_access_expression(self) -> pulumi.Input[str]:
        """
        Specifies the SQL expression. The expression can be any boolean-valued SQL expression.
        """
        return pulumi.get(self, "row_access_expression")

    @row_access_expression.setter
    def row_access_expression(self, value: pulumi.Input[str]):
        pulumi.set(self, "row_access_expression", value)

    @property
    @pulumi.getter
    def schema(self) -> pulumi.Input[str]:
        """
        The schema in which to create the row access policy.
        """
        return pulumi.get(self, "schema")

    @schema.setter
    def schema(self, value: pulumi.Input[str]):
        pulumi.set(self, "schema", value)

    @property
    @pulumi.getter
    def signature(self) -> pulumi.Input[Mapping[str, pulumi.Input[str]]]:
        """
        Specifies signature (arguments) for the row access policy (uppercase and sorted to avoid recreation of resource). A signature specifies a set of attributes that must be considered to determine whether the row is accessible. The attribute values come from the database object (e.g. table or view) to be protected by the row access policy.
        """
        return pulumi.get(self, "signature")

    @signature.setter
    def signature(self, value: pulumi.Input[Mapping[str, pulumi.Input[str]]]):
        pulumi.set(self, "signature", value)

    @property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies a comment for the row access policy.
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "comment", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the identifier for the row access policy; must be unique for the database and schema in which the row access policy is created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _RowAccessPolicyState:
    def __init__(__self__, *,
                 comment: Optional[pulumi.Input[str]] = None,
                 database: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 row_access_expression: Optional[pulumi.Input[str]] = None,
                 schema: Optional[pulumi.Input[str]] = None,
                 signature: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering RowAccessPolicy resources.
        :param pulumi.Input[str] comment: Specifies a comment for the row access policy.
        :param pulumi.Input[str] database: The database in which to create the row access policy.
        :param pulumi.Input[str] name: Specifies the identifier for the row access policy; must be unique for the database and schema in which the row access policy is created.
        :param pulumi.Input[str] row_access_expression: Specifies the SQL expression. The expression can be any boolean-valued SQL expression.
        :param pulumi.Input[str] schema: The schema in which to create the row access policy.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] signature: Specifies signature (arguments) for the row access policy (uppercase and sorted to avoid recreation of resource). A signature specifies a set of attributes that must be considered to determine whether the row is accessible. The attribute values come from the database object (e.g. table or view) to be protected by the row access policy.
        """
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if database is not None:
            pulumi.set(__self__, "database", database)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if row_access_expression is not None:
            pulumi.set(__self__, "row_access_expression", row_access_expression)
        if schema is not None:
            pulumi.set(__self__, "schema", schema)
        if signature is not None:
            pulumi.set(__self__, "signature", signature)

    @property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies a comment for the row access policy.
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "comment", value)

    @property
    @pulumi.getter
    def database(self) -> Optional[pulumi.Input[str]]:
        """
        The database in which to create the row access policy.
        """
        return pulumi.get(self, "database")

    @database.setter
    def database(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "database", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the identifier for the row access policy; must be unique for the database and schema in which the row access policy is created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="rowAccessExpression")
    def row_access_expression(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the SQL expression. The expression can be any boolean-valued SQL expression.
        """
        return pulumi.get(self, "row_access_expression")

    @row_access_expression.setter
    def row_access_expression(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "row_access_expression", value)

    @property
    @pulumi.getter
    def schema(self) -> Optional[pulumi.Input[str]]:
        """
        The schema in which to create the row access policy.
        """
        return pulumi.get(self, "schema")

    @schema.setter
    def schema(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "schema", value)

    @property
    @pulumi.getter
    def signature(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Specifies signature (arguments) for the row access policy (uppercase and sorted to avoid recreation of resource). A signature specifies a set of attributes that must be considered to determine whether the row is accessible. The attribute values come from the database object (e.g. table or view) to be protected by the row access policy.
        """
        return pulumi.get(self, "signature")

    @signature.setter
    def signature(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "signature", value)


class RowAccessPolicy(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 database: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 row_access_expression: Optional[pulumi.Input[str]] = None,
                 schema: Optional[pulumi.Input[str]] = None,
                 signature: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_snowflake as snowflake

        example_row_access_policy = snowflake.RowAccessPolicy("exampleRowAccessPolicy",
            database="EXAMPLE_DB",
            row_access_expression="case when current_role() in ('ANALYST') then true else false end",
            schema="EXAMPLE_SCHEMA",
            signature={
                "A": "VARCHAR",
                "B": "VARCHAR",
            })
        ```

        ## Import

        format is database name | schema name | policy name

        ```sh
         $ pulumi import snowflake:index/rowAccessPolicy:RowAccessPolicy example 'dbName|schemaName|policyName'
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] comment: Specifies a comment for the row access policy.
        :param pulumi.Input[str] database: The database in which to create the row access policy.
        :param pulumi.Input[str] name: Specifies the identifier for the row access policy; must be unique for the database and schema in which the row access policy is created.
        :param pulumi.Input[str] row_access_expression: Specifies the SQL expression. The expression can be any boolean-valued SQL expression.
        :param pulumi.Input[str] schema: The schema in which to create the row access policy.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] signature: Specifies signature (arguments) for the row access policy (uppercase and sorted to avoid recreation of resource). A signature specifies a set of attributes that must be considered to determine whether the row is accessible. The attribute values come from the database object (e.g. table or view) to be protected by the row access policy.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: RowAccessPolicyArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_snowflake as snowflake

        example_row_access_policy = snowflake.RowAccessPolicy("exampleRowAccessPolicy",
            database="EXAMPLE_DB",
            row_access_expression="case when current_role() in ('ANALYST') then true else false end",
            schema="EXAMPLE_SCHEMA",
            signature={
                "A": "VARCHAR",
                "B": "VARCHAR",
            })
        ```

        ## Import

        format is database name | schema name | policy name

        ```sh
         $ pulumi import snowflake:index/rowAccessPolicy:RowAccessPolicy example 'dbName|schemaName|policyName'
        ```

        :param str resource_name: The name of the resource.
        :param RowAccessPolicyArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(RowAccessPolicyArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 database: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 row_access_expression: Optional[pulumi.Input[str]] = None,
                 schema: Optional[pulumi.Input[str]] = None,
                 signature: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = RowAccessPolicyArgs.__new__(RowAccessPolicyArgs)

            __props__.__dict__["comment"] = comment
            if database is None and not opts.urn:
                raise TypeError("Missing required property 'database'")
            __props__.__dict__["database"] = database
            __props__.__dict__["name"] = name
            if row_access_expression is None and not opts.urn:
                raise TypeError("Missing required property 'row_access_expression'")
            __props__.__dict__["row_access_expression"] = row_access_expression
            if schema is None and not opts.urn:
                raise TypeError("Missing required property 'schema'")
            __props__.__dict__["schema"] = schema
            if signature is None and not opts.urn:
                raise TypeError("Missing required property 'signature'")
            __props__.__dict__["signature"] = signature
        super(RowAccessPolicy, __self__).__init__(
            'snowflake:index/rowAccessPolicy:RowAccessPolicy',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            comment: Optional[pulumi.Input[str]] = None,
            database: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            row_access_expression: Optional[pulumi.Input[str]] = None,
            schema: Optional[pulumi.Input[str]] = None,
            signature: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None) -> 'RowAccessPolicy':
        """
        Get an existing RowAccessPolicy resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] comment: Specifies a comment for the row access policy.
        :param pulumi.Input[str] database: The database in which to create the row access policy.
        :param pulumi.Input[str] name: Specifies the identifier for the row access policy; must be unique for the database and schema in which the row access policy is created.
        :param pulumi.Input[str] row_access_expression: Specifies the SQL expression. The expression can be any boolean-valued SQL expression.
        :param pulumi.Input[str] schema: The schema in which to create the row access policy.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] signature: Specifies signature (arguments) for the row access policy (uppercase and sorted to avoid recreation of resource). A signature specifies a set of attributes that must be considered to determine whether the row is accessible. The attribute values come from the database object (e.g. table or view) to be protected by the row access policy.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _RowAccessPolicyState.__new__(_RowAccessPolicyState)

        __props__.__dict__["comment"] = comment
        __props__.__dict__["database"] = database
        __props__.__dict__["name"] = name
        __props__.__dict__["row_access_expression"] = row_access_expression
        __props__.__dict__["schema"] = schema
        __props__.__dict__["signature"] = signature
        return RowAccessPolicy(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def comment(self) -> pulumi.Output[Optional[str]]:
        """
        Specifies a comment for the row access policy.
        """
        return pulumi.get(self, "comment")

    @property
    @pulumi.getter
    def database(self) -> pulumi.Output[str]:
        """
        The database in which to create the row access policy.
        """
        return pulumi.get(self, "database")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Specifies the identifier for the row access policy; must be unique for the database and schema in which the row access policy is created.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="rowAccessExpression")
    def row_access_expression(self) -> pulumi.Output[str]:
        """
        Specifies the SQL expression. The expression can be any boolean-valued SQL expression.
        """
        return pulumi.get(self, "row_access_expression")

    @property
    @pulumi.getter
    def schema(self) -> pulumi.Output[str]:
        """
        The schema in which to create the row access policy.
        """
        return pulumi.get(self, "schema")

    @property
    @pulumi.getter
    def signature(self) -> pulumi.Output[Mapping[str, str]]:
        """
        Specifies signature (arguments) for the row access policy (uppercase and sorted to avoid recreation of resource). A signature specifies a set of attributes that must be considered to determine whether the row is accessible. The attribute values come from the database object (e.g. table or view) to be protected by the row access policy.
        """
        return pulumi.get(self, "signature")

