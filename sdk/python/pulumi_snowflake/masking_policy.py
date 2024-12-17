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

__all__ = ['MaskingPolicyArgs', 'MaskingPolicy']

@pulumi.input_type
class MaskingPolicyArgs:
    def __init__(__self__, *,
                 arguments: pulumi.Input[Sequence[pulumi.Input['MaskingPolicyArgumentArgs']]],
                 body: pulumi.Input[str],
                 database: pulumi.Input[str],
                 return_data_type: pulumi.Input[str],
                 schema: pulumi.Input[str],
                 comment: Optional[pulumi.Input[str]] = None,
                 exempt_other_policies: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a MaskingPolicy resource.
        :param pulumi.Input[Sequence[pulumi.Input['MaskingPolicyArgumentArgs']]] arguments: List of the arguments for the masking policy. The first column and its data type always indicate the column data type values to mask or tokenize in the subsequent policy conditions. Note that you can not specify a virtual column as the first column argument in a conditional masking policy.
        :param pulumi.Input[str] body: Specifies the SQL expression that transforms the data. To mitigate permadiff on this field, the provider replaces blank characters with a space. This can lead to false positives in cases where a change in case or run of whitespace is semantically significant.
        :param pulumi.Input[str] database: The database in which to create the masking policy. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        :param pulumi.Input[str] return_data_type: The return data type must match the input data type of the first column that is specified as an input column. For more information about data types, check [Snowflake docs](https://docs.snowflake.com/en/sql-reference/intro-summary-data-types).
        :param pulumi.Input[str] schema: The schema in which to create the masking policy. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        :param pulumi.Input[str] comment: Specifies a comment for the masking policy.
        :param pulumi.Input[str] exempt_other_policies: Specifies whether the row access policy or conditional masking policy can reference a column that is already protected by a masking policy. Due to Snowflake limitations, when value is chenged, the resource is recreated. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
        :param pulumi.Input[str] name: Specifies the identifier for the masking policy; must be unique for the database and schema in which the masking policy is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        """
        pulumi.set(__self__, "arguments", arguments)
        pulumi.set(__self__, "body", body)
        pulumi.set(__self__, "database", database)
        pulumi.set(__self__, "return_data_type", return_data_type)
        pulumi.set(__self__, "schema", schema)
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if exempt_other_policies is not None:
            pulumi.set(__self__, "exempt_other_policies", exempt_other_policies)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def arguments(self) -> pulumi.Input[Sequence[pulumi.Input['MaskingPolicyArgumentArgs']]]:
        """
        List of the arguments for the masking policy. The first column and its data type always indicate the column data type values to mask or tokenize in the subsequent policy conditions. Note that you can not specify a virtual column as the first column argument in a conditional masking policy.
        """
        return pulumi.get(self, "arguments")

    @arguments.setter
    def arguments(self, value: pulumi.Input[Sequence[pulumi.Input['MaskingPolicyArgumentArgs']]]):
        pulumi.set(self, "arguments", value)

    @property
    @pulumi.getter
    def body(self) -> pulumi.Input[str]:
        """
        Specifies the SQL expression that transforms the data. To mitigate permadiff on this field, the provider replaces blank characters with a space. This can lead to false positives in cases where a change in case or run of whitespace is semantically significant.
        """
        return pulumi.get(self, "body")

    @body.setter
    def body(self, value: pulumi.Input[str]):
        pulumi.set(self, "body", value)

    @property
    @pulumi.getter
    def database(self) -> pulumi.Input[str]:
        """
        The database in which to create the masking policy. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        """
        return pulumi.get(self, "database")

    @database.setter
    def database(self, value: pulumi.Input[str]):
        pulumi.set(self, "database", value)

    @property
    @pulumi.getter(name="returnDataType")
    def return_data_type(self) -> pulumi.Input[str]:
        """
        The return data type must match the input data type of the first column that is specified as an input column. For more information about data types, check [Snowflake docs](https://docs.snowflake.com/en/sql-reference/intro-summary-data-types).
        """
        return pulumi.get(self, "return_data_type")

    @return_data_type.setter
    def return_data_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "return_data_type", value)

    @property
    @pulumi.getter
    def schema(self) -> pulumi.Input[str]:
        """
        The schema in which to create the masking policy. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        """
        return pulumi.get(self, "schema")

    @schema.setter
    def schema(self, value: pulumi.Input[str]):
        pulumi.set(self, "schema", value)

    @property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies a comment for the masking policy.
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "comment", value)

    @property
    @pulumi.getter(name="exemptOtherPolicies")
    def exempt_other_policies(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies whether the row access policy or conditional masking policy can reference a column that is already protected by a masking policy. Due to Snowflake limitations, when value is chenged, the resource is recreated. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
        """
        return pulumi.get(self, "exempt_other_policies")

    @exempt_other_policies.setter
    def exempt_other_policies(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "exempt_other_policies", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the identifier for the masking policy; must be unique for the database and schema in which the masking policy is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _MaskingPolicyState:
    def __init__(__self__, *,
                 arguments: Optional[pulumi.Input[Sequence[pulumi.Input['MaskingPolicyArgumentArgs']]]] = None,
                 body: Optional[pulumi.Input[str]] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 database: Optional[pulumi.Input[str]] = None,
                 describe_outputs: Optional[pulumi.Input[Sequence[pulumi.Input['MaskingPolicyDescribeOutputArgs']]]] = None,
                 exempt_other_policies: Optional[pulumi.Input[str]] = None,
                 fully_qualified_name: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 return_data_type: Optional[pulumi.Input[str]] = None,
                 schema: Optional[pulumi.Input[str]] = None,
                 show_outputs: Optional[pulumi.Input[Sequence[pulumi.Input['MaskingPolicyShowOutputArgs']]]] = None):
        """
        Input properties used for looking up and filtering MaskingPolicy resources.
        :param pulumi.Input[Sequence[pulumi.Input['MaskingPolicyArgumentArgs']]] arguments: List of the arguments for the masking policy. The first column and its data type always indicate the column data type values to mask or tokenize in the subsequent policy conditions. Note that you can not specify a virtual column as the first column argument in a conditional masking policy.
        :param pulumi.Input[str] body: Specifies the SQL expression that transforms the data. To mitigate permadiff on this field, the provider replaces blank characters with a space. This can lead to false positives in cases where a change in case or run of whitespace is semantically significant.
        :param pulumi.Input[str] comment: Specifies a comment for the masking policy.
        :param pulumi.Input[str] database: The database in which to create the masking policy. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        :param pulumi.Input[Sequence[pulumi.Input['MaskingPolicyDescribeOutputArgs']]] describe_outputs: Outputs the result of `DESCRIBE MASKING POLICY` for the given masking policy.
        :param pulumi.Input[str] exempt_other_policies: Specifies whether the row access policy or conditional masking policy can reference a column that is already protected by a masking policy. Due to Snowflake limitations, when value is chenged, the resource is recreated. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
        :param pulumi.Input[str] fully_qualified_name: Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        :param pulumi.Input[str] name: Specifies the identifier for the masking policy; must be unique for the database and schema in which the masking policy is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        :param pulumi.Input[str] return_data_type: The return data type must match the input data type of the first column that is specified as an input column. For more information about data types, check [Snowflake docs](https://docs.snowflake.com/en/sql-reference/intro-summary-data-types).
        :param pulumi.Input[str] schema: The schema in which to create the masking policy. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        :param pulumi.Input[Sequence[pulumi.Input['MaskingPolicyShowOutputArgs']]] show_outputs: Outputs the result of `SHOW MASKING POLICIES` for the given masking policy.
        """
        if arguments is not None:
            pulumi.set(__self__, "arguments", arguments)
        if body is not None:
            pulumi.set(__self__, "body", body)
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if database is not None:
            pulumi.set(__self__, "database", database)
        if describe_outputs is not None:
            pulumi.set(__self__, "describe_outputs", describe_outputs)
        if exempt_other_policies is not None:
            pulumi.set(__self__, "exempt_other_policies", exempt_other_policies)
        if fully_qualified_name is not None:
            pulumi.set(__self__, "fully_qualified_name", fully_qualified_name)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if return_data_type is not None:
            pulumi.set(__self__, "return_data_type", return_data_type)
        if schema is not None:
            pulumi.set(__self__, "schema", schema)
        if show_outputs is not None:
            pulumi.set(__self__, "show_outputs", show_outputs)

    @property
    @pulumi.getter
    def arguments(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['MaskingPolicyArgumentArgs']]]]:
        """
        List of the arguments for the masking policy. The first column and its data type always indicate the column data type values to mask or tokenize in the subsequent policy conditions. Note that you can not specify a virtual column as the first column argument in a conditional masking policy.
        """
        return pulumi.get(self, "arguments")

    @arguments.setter
    def arguments(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['MaskingPolicyArgumentArgs']]]]):
        pulumi.set(self, "arguments", value)

    @property
    @pulumi.getter
    def body(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the SQL expression that transforms the data. To mitigate permadiff on this field, the provider replaces blank characters with a space. This can lead to false positives in cases where a change in case or run of whitespace is semantically significant.
        """
        return pulumi.get(self, "body")

    @body.setter
    def body(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "body", value)

    @property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies a comment for the masking policy.
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "comment", value)

    @property
    @pulumi.getter
    def database(self) -> Optional[pulumi.Input[str]]:
        """
        The database in which to create the masking policy. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        """
        return pulumi.get(self, "database")

    @database.setter
    def database(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "database", value)

    @property
    @pulumi.getter(name="describeOutputs")
    def describe_outputs(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['MaskingPolicyDescribeOutputArgs']]]]:
        """
        Outputs the result of `DESCRIBE MASKING POLICY` for the given masking policy.
        """
        return pulumi.get(self, "describe_outputs")

    @describe_outputs.setter
    def describe_outputs(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['MaskingPolicyDescribeOutputArgs']]]]):
        pulumi.set(self, "describe_outputs", value)

    @property
    @pulumi.getter(name="exemptOtherPolicies")
    def exempt_other_policies(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies whether the row access policy or conditional masking policy can reference a column that is already protected by a masking policy. Due to Snowflake limitations, when value is chenged, the resource is recreated. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
        """
        return pulumi.get(self, "exempt_other_policies")

    @exempt_other_policies.setter
    def exempt_other_policies(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "exempt_other_policies", value)

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
        Specifies the identifier for the masking policy; must be unique for the database and schema in which the masking policy is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="returnDataType")
    def return_data_type(self) -> Optional[pulumi.Input[str]]:
        """
        The return data type must match the input data type of the first column that is specified as an input column. For more information about data types, check [Snowflake docs](https://docs.snowflake.com/en/sql-reference/intro-summary-data-types).
        """
        return pulumi.get(self, "return_data_type")

    @return_data_type.setter
    def return_data_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "return_data_type", value)

    @property
    @pulumi.getter
    def schema(self) -> Optional[pulumi.Input[str]]:
        """
        The schema in which to create the masking policy. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        """
        return pulumi.get(self, "schema")

    @schema.setter
    def schema(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "schema", value)

    @property
    @pulumi.getter(name="showOutputs")
    def show_outputs(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['MaskingPolicyShowOutputArgs']]]]:
        """
        Outputs the result of `SHOW MASKING POLICIES` for the given masking policy.
        """
        return pulumi.get(self, "show_outputs")

    @show_outputs.setter
    def show_outputs(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['MaskingPolicyShowOutputArgs']]]]):
        pulumi.set(self, "show_outputs", value)


class MaskingPolicy(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 arguments: Optional[pulumi.Input[Sequence[pulumi.Input[Union['MaskingPolicyArgumentArgs', 'MaskingPolicyArgumentArgsDict']]]]] = None,
                 body: Optional[pulumi.Input[str]] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 database: Optional[pulumi.Input[str]] = None,
                 exempt_other_policies: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 return_data_type: Optional[pulumi.Input[str]] = None,
                 schema: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ## Import

        ```sh
        $ pulumi import snowflake:index/maskingPolicy:MaskingPolicy example '"<database_name>"."<schema_name>"."<masking_policy_name>"'
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[Union['MaskingPolicyArgumentArgs', 'MaskingPolicyArgumentArgsDict']]]] arguments: List of the arguments for the masking policy. The first column and its data type always indicate the column data type values to mask or tokenize in the subsequent policy conditions. Note that you can not specify a virtual column as the first column argument in a conditional masking policy.
        :param pulumi.Input[str] body: Specifies the SQL expression that transforms the data. To mitigate permadiff on this field, the provider replaces blank characters with a space. This can lead to false positives in cases where a change in case or run of whitespace is semantically significant.
        :param pulumi.Input[str] comment: Specifies a comment for the masking policy.
        :param pulumi.Input[str] database: The database in which to create the masking policy. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        :param pulumi.Input[str] exempt_other_policies: Specifies whether the row access policy or conditional masking policy can reference a column that is already protected by a masking policy. Due to Snowflake limitations, when value is chenged, the resource is recreated. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
        :param pulumi.Input[str] name: Specifies the identifier for the masking policy; must be unique for the database and schema in which the masking policy is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        :param pulumi.Input[str] return_data_type: The return data type must match the input data type of the first column that is specified as an input column. For more information about data types, check [Snowflake docs](https://docs.snowflake.com/en/sql-reference/intro-summary-data-types).
        :param pulumi.Input[str] schema: The schema in which to create the masking policy. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: MaskingPolicyArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Import

        ```sh
        $ pulumi import snowflake:index/maskingPolicy:MaskingPolicy example '"<database_name>"."<schema_name>"."<masking_policy_name>"'
        ```

        :param str resource_name: The name of the resource.
        :param MaskingPolicyArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(MaskingPolicyArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 arguments: Optional[pulumi.Input[Sequence[pulumi.Input[Union['MaskingPolicyArgumentArgs', 'MaskingPolicyArgumentArgsDict']]]]] = None,
                 body: Optional[pulumi.Input[str]] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 database: Optional[pulumi.Input[str]] = None,
                 exempt_other_policies: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 return_data_type: Optional[pulumi.Input[str]] = None,
                 schema: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = MaskingPolicyArgs.__new__(MaskingPolicyArgs)

            if arguments is None and not opts.urn:
                raise TypeError("Missing required property 'arguments'")
            __props__.__dict__["arguments"] = arguments
            if body is None and not opts.urn:
                raise TypeError("Missing required property 'body'")
            __props__.__dict__["body"] = body
            __props__.__dict__["comment"] = comment
            if database is None and not opts.urn:
                raise TypeError("Missing required property 'database'")
            __props__.__dict__["database"] = database
            __props__.__dict__["exempt_other_policies"] = exempt_other_policies
            __props__.__dict__["name"] = name
            if return_data_type is None and not opts.urn:
                raise TypeError("Missing required property 'return_data_type'")
            __props__.__dict__["return_data_type"] = return_data_type
            if schema is None and not opts.urn:
                raise TypeError("Missing required property 'schema'")
            __props__.__dict__["schema"] = schema
            __props__.__dict__["describe_outputs"] = None
            __props__.__dict__["fully_qualified_name"] = None
            __props__.__dict__["show_outputs"] = None
        super(MaskingPolicy, __self__).__init__(
            'snowflake:index/maskingPolicy:MaskingPolicy',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arguments: Optional[pulumi.Input[Sequence[pulumi.Input[Union['MaskingPolicyArgumentArgs', 'MaskingPolicyArgumentArgsDict']]]]] = None,
            body: Optional[pulumi.Input[str]] = None,
            comment: Optional[pulumi.Input[str]] = None,
            database: Optional[pulumi.Input[str]] = None,
            describe_outputs: Optional[pulumi.Input[Sequence[pulumi.Input[Union['MaskingPolicyDescribeOutputArgs', 'MaskingPolicyDescribeOutputArgsDict']]]]] = None,
            exempt_other_policies: Optional[pulumi.Input[str]] = None,
            fully_qualified_name: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            return_data_type: Optional[pulumi.Input[str]] = None,
            schema: Optional[pulumi.Input[str]] = None,
            show_outputs: Optional[pulumi.Input[Sequence[pulumi.Input[Union['MaskingPolicyShowOutputArgs', 'MaskingPolicyShowOutputArgsDict']]]]] = None) -> 'MaskingPolicy':
        """
        Get an existing MaskingPolicy resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[Union['MaskingPolicyArgumentArgs', 'MaskingPolicyArgumentArgsDict']]]] arguments: List of the arguments for the masking policy. The first column and its data type always indicate the column data type values to mask or tokenize in the subsequent policy conditions. Note that you can not specify a virtual column as the first column argument in a conditional masking policy.
        :param pulumi.Input[str] body: Specifies the SQL expression that transforms the data. To mitigate permadiff on this field, the provider replaces blank characters with a space. This can lead to false positives in cases where a change in case or run of whitespace is semantically significant.
        :param pulumi.Input[str] comment: Specifies a comment for the masking policy.
        :param pulumi.Input[str] database: The database in which to create the masking policy. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        :param pulumi.Input[Sequence[pulumi.Input[Union['MaskingPolicyDescribeOutputArgs', 'MaskingPolicyDescribeOutputArgsDict']]]] describe_outputs: Outputs the result of `DESCRIBE MASKING POLICY` for the given masking policy.
        :param pulumi.Input[str] exempt_other_policies: Specifies whether the row access policy or conditional masking policy can reference a column that is already protected by a masking policy. Due to Snowflake limitations, when value is chenged, the resource is recreated. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
        :param pulumi.Input[str] fully_qualified_name: Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        :param pulumi.Input[str] name: Specifies the identifier for the masking policy; must be unique for the database and schema in which the masking policy is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        :param pulumi.Input[str] return_data_type: The return data type must match the input data type of the first column that is specified as an input column. For more information about data types, check [Snowflake docs](https://docs.snowflake.com/en/sql-reference/intro-summary-data-types).
        :param pulumi.Input[str] schema: The schema in which to create the masking policy. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        :param pulumi.Input[Sequence[pulumi.Input[Union['MaskingPolicyShowOutputArgs', 'MaskingPolicyShowOutputArgsDict']]]] show_outputs: Outputs the result of `SHOW MASKING POLICIES` for the given masking policy.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _MaskingPolicyState.__new__(_MaskingPolicyState)

        __props__.__dict__["arguments"] = arguments
        __props__.__dict__["body"] = body
        __props__.__dict__["comment"] = comment
        __props__.__dict__["database"] = database
        __props__.__dict__["describe_outputs"] = describe_outputs
        __props__.__dict__["exempt_other_policies"] = exempt_other_policies
        __props__.__dict__["fully_qualified_name"] = fully_qualified_name
        __props__.__dict__["name"] = name
        __props__.__dict__["return_data_type"] = return_data_type
        __props__.__dict__["schema"] = schema
        __props__.__dict__["show_outputs"] = show_outputs
        return MaskingPolicy(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arguments(self) -> pulumi.Output[Sequence['outputs.MaskingPolicyArgument']]:
        """
        List of the arguments for the masking policy. The first column and its data type always indicate the column data type values to mask or tokenize in the subsequent policy conditions. Note that you can not specify a virtual column as the first column argument in a conditional masking policy.
        """
        return pulumi.get(self, "arguments")

    @property
    @pulumi.getter
    def body(self) -> pulumi.Output[str]:
        """
        Specifies the SQL expression that transforms the data. To mitigate permadiff on this field, the provider replaces blank characters with a space. This can lead to false positives in cases where a change in case or run of whitespace is semantically significant.
        """
        return pulumi.get(self, "body")

    @property
    @pulumi.getter
    def comment(self) -> pulumi.Output[Optional[str]]:
        """
        Specifies a comment for the masking policy.
        """
        return pulumi.get(self, "comment")

    @property
    @pulumi.getter
    def database(self) -> pulumi.Output[str]:
        """
        The database in which to create the masking policy. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        """
        return pulumi.get(self, "database")

    @property
    @pulumi.getter(name="describeOutputs")
    def describe_outputs(self) -> pulumi.Output[Sequence['outputs.MaskingPolicyDescribeOutput']]:
        """
        Outputs the result of `DESCRIBE MASKING POLICY` for the given masking policy.
        """
        return pulumi.get(self, "describe_outputs")

    @property
    @pulumi.getter(name="exemptOtherPolicies")
    def exempt_other_policies(self) -> pulumi.Output[Optional[str]]:
        """
        Specifies whether the row access policy or conditional masking policy can reference a column that is already protected by a masking policy. Due to Snowflake limitations, when value is chenged, the resource is recreated. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
        """
        return pulumi.get(self, "exempt_other_policies")

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
        Specifies the identifier for the masking policy; must be unique for the database and schema in which the masking policy is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="returnDataType")
    def return_data_type(self) -> pulumi.Output[str]:
        """
        The return data type must match the input data type of the first column that is specified as an input column. For more information about data types, check [Snowflake docs](https://docs.snowflake.com/en/sql-reference/intro-summary-data-types).
        """
        return pulumi.get(self, "return_data_type")

    @property
    @pulumi.getter
    def schema(self) -> pulumi.Output[str]:
        """
        The schema in which to create the masking policy. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        """
        return pulumi.get(self, "schema")

    @property
    @pulumi.getter(name="showOutputs")
    def show_outputs(self) -> pulumi.Output[Sequence['outputs.MaskingPolicyShowOutput']]:
        """
        Outputs the result of `SHOW MASKING POLICIES` for the given masking policy.
        """
        return pulumi.get(self, "show_outputs")

