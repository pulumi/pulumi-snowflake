# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'ExternalFunctionArgArgs',
    'ExternalFunctionHeaderArgs',
    'ExternalTableColumnArgs',
    'FunctionArgumentArgs',
    'FunctionGrantArgumentArgs',
    'ProcedureArgumentArgs',
    'ProcedureGrantArgumentArgs',
    'TableColumnArgs',
    'TableColumnDefaultArgs',
    'TablePrimaryKeyArgs',
]

@pulumi.input_type
class ExternalFunctionArgArgs:
    def __init__(__self__, *,
                 name: pulumi.Input[str],
                 type: pulumi.Input[str]):
        """
        :param pulumi.Input[str] name: Argument name
        :param pulumi.Input[str] type: Argument type, e.g. VARCHAR
        """
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def name(self) -> pulumi.Input[str]:
        """
        Argument name
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: pulumi.Input[str]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def type(self) -> pulumi.Input[str]:
        """
        Argument type, e.g. VARCHAR
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: pulumi.Input[str]):
        pulumi.set(self, "type", value)


@pulumi.input_type
class ExternalFunctionHeaderArgs:
    def __init__(__self__, *,
                 name: pulumi.Input[str],
                 value: pulumi.Input[str]):
        """
        :param pulumi.Input[str] name: Header name
        :param pulumi.Input[str] value: Header value
        """
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "value", value)

    @property
    @pulumi.getter
    def name(self) -> pulumi.Input[str]:
        """
        Header name
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: pulumi.Input[str]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def value(self) -> pulumi.Input[str]:
        """
        Header value
        """
        return pulumi.get(self, "value")

    @value.setter
    def value(self, value: pulumi.Input[str]):
        pulumi.set(self, "value", value)


@pulumi.input_type
class ExternalTableColumnArgs:
    def __init__(__self__, *,
                 as_: pulumi.Input[str],
                 name: pulumi.Input[str],
                 type: pulumi.Input[str]):
        """
        :param pulumi.Input[str] as_: String that specifies the expression for the column. When queried, the column returns results derived from this expression.
        :param pulumi.Input[str] name: Column name
        :param pulumi.Input[str] type: Column type, e.g. VARIANT
        """
        pulumi.set(__self__, "as_", as_)
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter(name="as")
    def as_(self) -> pulumi.Input[str]:
        """
        String that specifies the expression for the column. When queried, the column returns results derived from this expression.
        """
        return pulumi.get(self, "as_")

    @as_.setter
    def as_(self, value: pulumi.Input[str]):
        pulumi.set(self, "as_", value)

    @property
    @pulumi.getter
    def name(self) -> pulumi.Input[str]:
        """
        Column name
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: pulumi.Input[str]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def type(self) -> pulumi.Input[str]:
        """
        Column type, e.g. VARIANT
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: pulumi.Input[str]):
        pulumi.set(self, "type", value)


@pulumi.input_type
class FunctionArgumentArgs:
    def __init__(__self__, *,
                 name: pulumi.Input[str],
                 type: pulumi.Input[str]):
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def name(self) -> pulumi.Input[str]:
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: pulumi.Input[str]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def type(self) -> pulumi.Input[str]:
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: pulumi.Input[str]):
        pulumi.set(self, "type", value)


@pulumi.input_type
class FunctionGrantArgumentArgs:
    def __init__(__self__, *,
                 name: pulumi.Input[str],
                 type: pulumi.Input[str]):
        """
        :param pulumi.Input[str] name: The argument name
        :param pulumi.Input[str] type: The argument type
        """
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def name(self) -> pulumi.Input[str]:
        """
        The argument name
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: pulumi.Input[str]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def type(self) -> pulumi.Input[str]:
        """
        The argument type
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: pulumi.Input[str]):
        pulumi.set(self, "type", value)


@pulumi.input_type
class ProcedureArgumentArgs:
    def __init__(__self__, *,
                 name: pulumi.Input[str],
                 type: pulumi.Input[str]):
        """
        :param pulumi.Input[str] name: The argument name
        :param pulumi.Input[str] type: The argument type
        """
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def name(self) -> pulumi.Input[str]:
        """
        The argument name
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: pulumi.Input[str]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def type(self) -> pulumi.Input[str]:
        """
        The argument type
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: pulumi.Input[str]):
        pulumi.set(self, "type", value)


@pulumi.input_type
class ProcedureGrantArgumentArgs:
    def __init__(__self__, *,
                 name: pulumi.Input[str],
                 type: pulumi.Input[str]):
        """
        :param pulumi.Input[str] name: The argument name
        :param pulumi.Input[str] type: The argument type
        """
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def name(self) -> pulumi.Input[str]:
        """
        The argument name
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: pulumi.Input[str]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def type(self) -> pulumi.Input[str]:
        """
        The argument type
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: pulumi.Input[str]):
        pulumi.set(self, "type", value)


@pulumi.input_type
class TableColumnArgs:
    def __init__(__self__, *,
                 name: pulumi.Input[str],
                 type: pulumi.Input[str],
                 comment: Optional[pulumi.Input[str]] = None,
                 default: Optional[pulumi.Input['TableColumnDefaultArgs']] = None,
                 nullable: Optional[pulumi.Input[bool]] = None):
        """
        :param pulumi.Input[str] name: Column name
        :param pulumi.Input[str] type: Column type, e.g. VARIANT
        :param pulumi.Input[str] comment: Column comment
        :param pulumi.Input['TableColumnDefaultArgs'] default: Defines the column default value; note due to limitations of Snowflake's ALTER TABLE ADD/MODIFY COLUMN updates to default will not be applied
        :param pulumi.Input[bool] nullable: Whether this column can contain null values. **Note**: Depending on your Snowflake version, the default value will not suffice if this column is used in a primary key constraint.
        """
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "type", type)
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if default is not None:
            pulumi.set(__self__, "default", default)
        if nullable is not None:
            pulumi.set(__self__, "nullable", nullable)

    @property
    @pulumi.getter
    def name(self) -> pulumi.Input[str]:
        """
        Column name
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: pulumi.Input[str]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def type(self) -> pulumi.Input[str]:
        """
        Column type, e.g. VARIANT
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: pulumi.Input[str]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[str]]:
        """
        Column comment
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "comment", value)

    @property
    @pulumi.getter
    def default(self) -> Optional[pulumi.Input['TableColumnDefaultArgs']]:
        """
        Defines the column default value; note due to limitations of Snowflake's ALTER TABLE ADD/MODIFY COLUMN updates to default will not be applied
        """
        return pulumi.get(self, "default")

    @default.setter
    def default(self, value: Optional[pulumi.Input['TableColumnDefaultArgs']]):
        pulumi.set(self, "default", value)

    @property
    @pulumi.getter
    def nullable(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether this column can contain null values. **Note**: Depending on your Snowflake version, the default value will not suffice if this column is used in a primary key constraint.
        """
        return pulumi.get(self, "nullable")

    @nullable.setter
    def nullable(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "nullable", value)


@pulumi.input_type
class TableColumnDefaultArgs:
    def __init__(__self__, *,
                 constant: Optional[pulumi.Input[str]] = None,
                 expression: Optional[pulumi.Input[str]] = None,
                 sequence: Optional[pulumi.Input[str]] = None):
        if constant is not None:
            pulumi.set(__self__, "constant", constant)
        if expression is not None:
            pulumi.set(__self__, "expression", expression)
        if sequence is not None:
            pulumi.set(__self__, "sequence", sequence)

    @property
    @pulumi.getter
    def constant(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "constant")

    @constant.setter
    def constant(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "constant", value)

    @property
    @pulumi.getter
    def expression(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "expression")

    @expression.setter
    def expression(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "expression", value)

    @property
    @pulumi.getter
    def sequence(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "sequence")

    @sequence.setter
    def sequence(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "sequence", value)


@pulumi.input_type
class TablePrimaryKeyArgs:
    def __init__(__self__, *,
                 keys: pulumi.Input[Sequence[pulumi.Input[str]]],
                 name: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[Sequence[pulumi.Input[str]]] keys: Columns to use in primary key
        :param pulumi.Input[str] name: Name of constraint
        """
        pulumi.set(__self__, "keys", keys)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def keys(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        Columns to use in primary key
        """
        return pulumi.get(self, "keys")

    @keys.setter
    def keys(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "keys", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of constraint
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


