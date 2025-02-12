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

__all__ = ['TableConstraintArgs', 'TableConstraint']

@pulumi.input_type
class TableConstraintArgs:
    def __init__(__self__, *,
                 columns: pulumi.Input[Sequence[pulumi.Input[str]]],
                 table_id: pulumi.Input[str],
                 type: pulumi.Input[str],
                 comment: Optional[pulumi.Input[str]] = None,
                 deferrable: Optional[pulumi.Input[bool]] = None,
                 enable: Optional[pulumi.Input[bool]] = None,
                 enforced: Optional[pulumi.Input[bool]] = None,
                 foreign_key_properties: Optional[pulumi.Input['TableConstraintForeignKeyPropertiesArgs']] = None,
                 initially: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 rely: Optional[pulumi.Input[bool]] = None,
                 validate: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a TableConstraint resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] columns: Columns to use in constraint key
        :param pulumi.Input[str] table_id: Identifier for table to create constraint on. Format must follow: "\\"&lt;db*name&gt;\\".\\"&lt;schema*name&gt;\\".\\"&lt;table*name&gt;\\"" or "&lt;db*name&gt;.&lt;schema*name&gt;.&lt;table*name&gt;" (snowflake*table.my*table.id)
        :param pulumi.Input[str] type: Type of constraint, one of 'UNIQUE', 'PRIMARY KEY', or 'FOREIGN KEY'
        :param pulumi.Input[str] comment: Comment for the table constraint
        :param pulumi.Input[bool] deferrable: Whether the constraint is deferrable
        :param pulumi.Input[bool] enable: Specifies whether the constraint is enabled or disabled. These properties are provided for compatibility with Oracle.
        :param pulumi.Input[bool] enforced: Whether the constraint is enforced
        :param pulumi.Input['TableConstraintForeignKeyPropertiesArgs'] foreign_key_properties: Additional properties when type is set to foreign key. Not applicable for primary/unique keys
        :param pulumi.Input[str] initially: Whether the constraint is initially deferred or immediate
        :param pulumi.Input[str] name: Name of constraint
        :param pulumi.Input[bool] rely: Specifies whether a constraint in NOVALIDATE mode is taken into account during query rewrite.
        :param pulumi.Input[bool] validate: Specifies whether to validate existing data on the table when a constraint is created. Only used in conjunction with the ENABLE property.
        """
        pulumi.set(__self__, "columns", columns)
        pulumi.set(__self__, "table_id", table_id)
        pulumi.set(__self__, "type", type)
        if comment is not None:
            warnings.warn("""Not used. Will be removed.""", DeprecationWarning)
            pulumi.log.warn("""comment is deprecated: Not used. Will be removed.""")
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if deferrable is not None:
            pulumi.set(__self__, "deferrable", deferrable)
        if enable is not None:
            pulumi.set(__self__, "enable", enable)
        if enforced is not None:
            pulumi.set(__self__, "enforced", enforced)
        if foreign_key_properties is not None:
            pulumi.set(__self__, "foreign_key_properties", foreign_key_properties)
        if initially is not None:
            pulumi.set(__self__, "initially", initially)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if rely is not None:
            pulumi.set(__self__, "rely", rely)
        if validate is not None:
            pulumi.set(__self__, "validate", validate)

    @property
    @pulumi.getter
    def columns(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        Columns to use in constraint key
        """
        return pulumi.get(self, "columns")

    @columns.setter
    def columns(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "columns", value)

    @property
    @pulumi.getter(name="tableId")
    def table_id(self) -> pulumi.Input[str]:
        """
        Identifier for table to create constraint on. Format must follow: "\\"&lt;db*name&gt;\\".\\"&lt;schema*name&gt;\\".\\"&lt;table*name&gt;\\"" or "&lt;db*name&gt;.&lt;schema*name&gt;.&lt;table*name&gt;" (snowflake*table.my*table.id)
        """
        return pulumi.get(self, "table_id")

    @table_id.setter
    def table_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "table_id", value)

    @property
    @pulumi.getter
    def type(self) -> pulumi.Input[str]:
        """
        Type of constraint, one of 'UNIQUE', 'PRIMARY KEY', or 'FOREIGN KEY'
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: pulumi.Input[str]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter
    @_utilities.deprecated("""Not used. Will be removed.""")
    def comment(self) -> Optional[pulumi.Input[str]]:
        """
        Comment for the table constraint
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "comment", value)

    @property
    @pulumi.getter
    def deferrable(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether the constraint is deferrable
        """
        return pulumi.get(self, "deferrable")

    @deferrable.setter
    def deferrable(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "deferrable", value)

    @property
    @pulumi.getter
    def enable(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether the constraint is enabled or disabled. These properties are provided for compatibility with Oracle.
        """
        return pulumi.get(self, "enable")

    @enable.setter
    def enable(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enable", value)

    @property
    @pulumi.getter
    def enforced(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether the constraint is enforced
        """
        return pulumi.get(self, "enforced")

    @enforced.setter
    def enforced(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enforced", value)

    @property
    @pulumi.getter(name="foreignKeyProperties")
    def foreign_key_properties(self) -> Optional[pulumi.Input['TableConstraintForeignKeyPropertiesArgs']]:
        """
        Additional properties when type is set to foreign key. Not applicable for primary/unique keys
        """
        return pulumi.get(self, "foreign_key_properties")

    @foreign_key_properties.setter
    def foreign_key_properties(self, value: Optional[pulumi.Input['TableConstraintForeignKeyPropertiesArgs']]):
        pulumi.set(self, "foreign_key_properties", value)

    @property
    @pulumi.getter
    def initially(self) -> Optional[pulumi.Input[str]]:
        """
        Whether the constraint is initially deferred or immediate
        """
        return pulumi.get(self, "initially")

    @initially.setter
    def initially(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "initially", value)

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

    @property
    @pulumi.getter
    def rely(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether a constraint in NOVALIDATE mode is taken into account during query rewrite.
        """
        return pulumi.get(self, "rely")

    @rely.setter
    def rely(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "rely", value)

    @property
    @pulumi.getter
    def validate(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether to validate existing data on the table when a constraint is created. Only used in conjunction with the ENABLE property.
        """
        return pulumi.get(self, "validate")

    @validate.setter
    def validate(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "validate", value)


@pulumi.input_type
class _TableConstraintState:
    def __init__(__self__, *,
                 columns: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 deferrable: Optional[pulumi.Input[bool]] = None,
                 enable: Optional[pulumi.Input[bool]] = None,
                 enforced: Optional[pulumi.Input[bool]] = None,
                 foreign_key_properties: Optional[pulumi.Input['TableConstraintForeignKeyPropertiesArgs']] = None,
                 initially: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 rely: Optional[pulumi.Input[bool]] = None,
                 table_id: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 validate: Optional[pulumi.Input[bool]] = None):
        """
        Input properties used for looking up and filtering TableConstraint resources.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] columns: Columns to use in constraint key
        :param pulumi.Input[str] comment: Comment for the table constraint
        :param pulumi.Input[bool] deferrable: Whether the constraint is deferrable
        :param pulumi.Input[bool] enable: Specifies whether the constraint is enabled or disabled. These properties are provided for compatibility with Oracle.
        :param pulumi.Input[bool] enforced: Whether the constraint is enforced
        :param pulumi.Input['TableConstraintForeignKeyPropertiesArgs'] foreign_key_properties: Additional properties when type is set to foreign key. Not applicable for primary/unique keys
        :param pulumi.Input[str] initially: Whether the constraint is initially deferred or immediate
        :param pulumi.Input[str] name: Name of constraint
        :param pulumi.Input[bool] rely: Specifies whether a constraint in NOVALIDATE mode is taken into account during query rewrite.
        :param pulumi.Input[str] table_id: Identifier for table to create constraint on. Format must follow: "\\"&lt;db*name&gt;\\".\\"&lt;schema*name&gt;\\".\\"&lt;table*name&gt;\\"" or "&lt;db*name&gt;.&lt;schema*name&gt;.&lt;table*name&gt;" (snowflake*table.my*table.id)
        :param pulumi.Input[str] type: Type of constraint, one of 'UNIQUE', 'PRIMARY KEY', or 'FOREIGN KEY'
        :param pulumi.Input[bool] validate: Specifies whether to validate existing data on the table when a constraint is created. Only used in conjunction with the ENABLE property.
        """
        if columns is not None:
            pulumi.set(__self__, "columns", columns)
        if comment is not None:
            warnings.warn("""Not used. Will be removed.""", DeprecationWarning)
            pulumi.log.warn("""comment is deprecated: Not used. Will be removed.""")
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if deferrable is not None:
            pulumi.set(__self__, "deferrable", deferrable)
        if enable is not None:
            pulumi.set(__self__, "enable", enable)
        if enforced is not None:
            pulumi.set(__self__, "enforced", enforced)
        if foreign_key_properties is not None:
            pulumi.set(__self__, "foreign_key_properties", foreign_key_properties)
        if initially is not None:
            pulumi.set(__self__, "initially", initially)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if rely is not None:
            pulumi.set(__self__, "rely", rely)
        if table_id is not None:
            pulumi.set(__self__, "table_id", table_id)
        if type is not None:
            pulumi.set(__self__, "type", type)
        if validate is not None:
            pulumi.set(__self__, "validate", validate)

    @property
    @pulumi.getter
    def columns(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Columns to use in constraint key
        """
        return pulumi.get(self, "columns")

    @columns.setter
    def columns(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "columns", value)

    @property
    @pulumi.getter
    @_utilities.deprecated("""Not used. Will be removed.""")
    def comment(self) -> Optional[pulumi.Input[str]]:
        """
        Comment for the table constraint
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "comment", value)

    @property
    @pulumi.getter
    def deferrable(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether the constraint is deferrable
        """
        return pulumi.get(self, "deferrable")

    @deferrable.setter
    def deferrable(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "deferrable", value)

    @property
    @pulumi.getter
    def enable(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether the constraint is enabled or disabled. These properties are provided for compatibility with Oracle.
        """
        return pulumi.get(self, "enable")

    @enable.setter
    def enable(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enable", value)

    @property
    @pulumi.getter
    def enforced(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether the constraint is enforced
        """
        return pulumi.get(self, "enforced")

    @enforced.setter
    def enforced(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enforced", value)

    @property
    @pulumi.getter(name="foreignKeyProperties")
    def foreign_key_properties(self) -> Optional[pulumi.Input['TableConstraintForeignKeyPropertiesArgs']]:
        """
        Additional properties when type is set to foreign key. Not applicable for primary/unique keys
        """
        return pulumi.get(self, "foreign_key_properties")

    @foreign_key_properties.setter
    def foreign_key_properties(self, value: Optional[pulumi.Input['TableConstraintForeignKeyPropertiesArgs']]):
        pulumi.set(self, "foreign_key_properties", value)

    @property
    @pulumi.getter
    def initially(self) -> Optional[pulumi.Input[str]]:
        """
        Whether the constraint is initially deferred or immediate
        """
        return pulumi.get(self, "initially")

    @initially.setter
    def initially(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "initially", value)

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

    @property
    @pulumi.getter
    def rely(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether a constraint in NOVALIDATE mode is taken into account during query rewrite.
        """
        return pulumi.get(self, "rely")

    @rely.setter
    def rely(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "rely", value)

    @property
    @pulumi.getter(name="tableId")
    def table_id(self) -> Optional[pulumi.Input[str]]:
        """
        Identifier for table to create constraint on. Format must follow: "\\"&lt;db*name&gt;\\".\\"&lt;schema*name&gt;\\".\\"&lt;table*name&gt;\\"" or "&lt;db*name&gt;.&lt;schema*name&gt;.&lt;table*name&gt;" (snowflake*table.my*table.id)
        """
        return pulumi.get(self, "table_id")

    @table_id.setter
    def table_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "table_id", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        Type of constraint, one of 'UNIQUE', 'PRIMARY KEY', or 'FOREIGN KEY'
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter
    def validate(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether to validate existing data on the table when a constraint is created. Only used in conjunction with the ENABLE property.
        """
        return pulumi.get(self, "validate")

    @validate.setter
    def validate(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "validate", value)


class TableConstraint(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 columns: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 deferrable: Optional[pulumi.Input[bool]] = None,
                 enable: Optional[pulumi.Input[bool]] = None,
                 enforced: Optional[pulumi.Input[bool]] = None,
                 foreign_key_properties: Optional[pulumi.Input[Union['TableConstraintForeignKeyPropertiesArgs', 'TableConstraintForeignKeyPropertiesArgsDict']]] = None,
                 initially: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 rely: Optional[pulumi.Input[bool]] = None,
                 table_id: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 validate: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        """
        ## Import

        ```sh
        $ pulumi import snowflake:index/tableConstraint:TableConstraint example 'myconstraintfk❄️FOREIGN KEY❄️databaseName|schemaName|tableName'
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] columns: Columns to use in constraint key
        :param pulumi.Input[str] comment: Comment for the table constraint
        :param pulumi.Input[bool] deferrable: Whether the constraint is deferrable
        :param pulumi.Input[bool] enable: Specifies whether the constraint is enabled or disabled. These properties are provided for compatibility with Oracle.
        :param pulumi.Input[bool] enforced: Whether the constraint is enforced
        :param pulumi.Input[Union['TableConstraintForeignKeyPropertiesArgs', 'TableConstraintForeignKeyPropertiesArgsDict']] foreign_key_properties: Additional properties when type is set to foreign key. Not applicable for primary/unique keys
        :param pulumi.Input[str] initially: Whether the constraint is initially deferred or immediate
        :param pulumi.Input[str] name: Name of constraint
        :param pulumi.Input[bool] rely: Specifies whether a constraint in NOVALIDATE mode is taken into account during query rewrite.
        :param pulumi.Input[str] table_id: Identifier for table to create constraint on. Format must follow: "\\"&lt;db*name&gt;\\".\\"&lt;schema*name&gt;\\".\\"&lt;table*name&gt;\\"" or "&lt;db*name&gt;.&lt;schema*name&gt;.&lt;table*name&gt;" (snowflake*table.my*table.id)
        :param pulumi.Input[str] type: Type of constraint, one of 'UNIQUE', 'PRIMARY KEY', or 'FOREIGN KEY'
        :param pulumi.Input[bool] validate: Specifies whether to validate existing data on the table when a constraint is created. Only used in conjunction with the ENABLE property.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: TableConstraintArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Import

        ```sh
        $ pulumi import snowflake:index/tableConstraint:TableConstraint example 'myconstraintfk❄️FOREIGN KEY❄️databaseName|schemaName|tableName'
        ```

        :param str resource_name: The name of the resource.
        :param TableConstraintArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(TableConstraintArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 columns: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 deferrable: Optional[pulumi.Input[bool]] = None,
                 enable: Optional[pulumi.Input[bool]] = None,
                 enforced: Optional[pulumi.Input[bool]] = None,
                 foreign_key_properties: Optional[pulumi.Input[Union['TableConstraintForeignKeyPropertiesArgs', 'TableConstraintForeignKeyPropertiesArgsDict']]] = None,
                 initially: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 rely: Optional[pulumi.Input[bool]] = None,
                 table_id: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 validate: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = TableConstraintArgs.__new__(TableConstraintArgs)

            if columns is None and not opts.urn:
                raise TypeError("Missing required property 'columns'")
            __props__.__dict__["columns"] = columns
            __props__.__dict__["comment"] = comment
            __props__.__dict__["deferrable"] = deferrable
            __props__.__dict__["enable"] = enable
            __props__.__dict__["enforced"] = enforced
            __props__.__dict__["foreign_key_properties"] = foreign_key_properties
            __props__.__dict__["initially"] = initially
            __props__.__dict__["name"] = name
            __props__.__dict__["rely"] = rely
            if table_id is None and not opts.urn:
                raise TypeError("Missing required property 'table_id'")
            __props__.__dict__["table_id"] = table_id
            if type is None and not opts.urn:
                raise TypeError("Missing required property 'type'")
            __props__.__dict__["type"] = type
            __props__.__dict__["validate"] = validate
        super(TableConstraint, __self__).__init__(
            'snowflake:index/tableConstraint:TableConstraint',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            columns: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            comment: Optional[pulumi.Input[str]] = None,
            deferrable: Optional[pulumi.Input[bool]] = None,
            enable: Optional[pulumi.Input[bool]] = None,
            enforced: Optional[pulumi.Input[bool]] = None,
            foreign_key_properties: Optional[pulumi.Input[Union['TableConstraintForeignKeyPropertiesArgs', 'TableConstraintForeignKeyPropertiesArgsDict']]] = None,
            initially: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            rely: Optional[pulumi.Input[bool]] = None,
            table_id: Optional[pulumi.Input[str]] = None,
            type: Optional[pulumi.Input[str]] = None,
            validate: Optional[pulumi.Input[bool]] = None) -> 'TableConstraint':
        """
        Get an existing TableConstraint resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] columns: Columns to use in constraint key
        :param pulumi.Input[str] comment: Comment for the table constraint
        :param pulumi.Input[bool] deferrable: Whether the constraint is deferrable
        :param pulumi.Input[bool] enable: Specifies whether the constraint is enabled or disabled. These properties are provided for compatibility with Oracle.
        :param pulumi.Input[bool] enforced: Whether the constraint is enforced
        :param pulumi.Input[Union['TableConstraintForeignKeyPropertiesArgs', 'TableConstraintForeignKeyPropertiesArgsDict']] foreign_key_properties: Additional properties when type is set to foreign key. Not applicable for primary/unique keys
        :param pulumi.Input[str] initially: Whether the constraint is initially deferred or immediate
        :param pulumi.Input[str] name: Name of constraint
        :param pulumi.Input[bool] rely: Specifies whether a constraint in NOVALIDATE mode is taken into account during query rewrite.
        :param pulumi.Input[str] table_id: Identifier for table to create constraint on. Format must follow: "\\"&lt;db*name&gt;\\".\\"&lt;schema*name&gt;\\".\\"&lt;table*name&gt;\\"" or "&lt;db*name&gt;.&lt;schema*name&gt;.&lt;table*name&gt;" (snowflake*table.my*table.id)
        :param pulumi.Input[str] type: Type of constraint, one of 'UNIQUE', 'PRIMARY KEY', or 'FOREIGN KEY'
        :param pulumi.Input[bool] validate: Specifies whether to validate existing data on the table when a constraint is created. Only used in conjunction with the ENABLE property.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _TableConstraintState.__new__(_TableConstraintState)

        __props__.__dict__["columns"] = columns
        __props__.__dict__["comment"] = comment
        __props__.__dict__["deferrable"] = deferrable
        __props__.__dict__["enable"] = enable
        __props__.__dict__["enforced"] = enforced
        __props__.__dict__["foreign_key_properties"] = foreign_key_properties
        __props__.__dict__["initially"] = initially
        __props__.__dict__["name"] = name
        __props__.__dict__["rely"] = rely
        __props__.__dict__["table_id"] = table_id
        __props__.__dict__["type"] = type
        __props__.__dict__["validate"] = validate
        return TableConstraint(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def columns(self) -> pulumi.Output[Sequence[str]]:
        """
        Columns to use in constraint key
        """
        return pulumi.get(self, "columns")

    @property
    @pulumi.getter
    @_utilities.deprecated("""Not used. Will be removed.""")
    def comment(self) -> pulumi.Output[Optional[str]]:
        """
        Comment for the table constraint
        """
        return pulumi.get(self, "comment")

    @property
    @pulumi.getter
    def deferrable(self) -> pulumi.Output[Optional[bool]]:
        """
        Whether the constraint is deferrable
        """
        return pulumi.get(self, "deferrable")

    @property
    @pulumi.getter
    def enable(self) -> pulumi.Output[Optional[bool]]:
        """
        Specifies whether the constraint is enabled or disabled. These properties are provided for compatibility with Oracle.
        """
        return pulumi.get(self, "enable")

    @property
    @pulumi.getter
    def enforced(self) -> pulumi.Output[Optional[bool]]:
        """
        Whether the constraint is enforced
        """
        return pulumi.get(self, "enforced")

    @property
    @pulumi.getter(name="foreignKeyProperties")
    def foreign_key_properties(self) -> pulumi.Output[Optional['outputs.TableConstraintForeignKeyProperties']]:
        """
        Additional properties when type is set to foreign key. Not applicable for primary/unique keys
        """
        return pulumi.get(self, "foreign_key_properties")

    @property
    @pulumi.getter
    def initially(self) -> pulumi.Output[Optional[str]]:
        """
        Whether the constraint is initially deferred or immediate
        """
        return pulumi.get(self, "initially")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of constraint
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def rely(self) -> pulumi.Output[Optional[bool]]:
        """
        Specifies whether a constraint in NOVALIDATE mode is taken into account during query rewrite.
        """
        return pulumi.get(self, "rely")

    @property
    @pulumi.getter(name="tableId")
    def table_id(self) -> pulumi.Output[str]:
        """
        Identifier for table to create constraint on. Format must follow: "\\"&lt;db*name&gt;\\".\\"&lt;schema*name&gt;\\".\\"&lt;table*name&gt;\\"" or "&lt;db*name&gt;.&lt;schema*name&gt;.&lt;table*name&gt;" (snowflake*table.my*table.id)
        """
        return pulumi.get(self, "table_id")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        """
        Type of constraint, one of 'UNIQUE', 'PRIMARY KEY', or 'FOREIGN KEY'
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter
    def validate(self) -> pulumi.Output[Optional[bool]]:
        """
        Specifies whether to validate existing data on the table when a constraint is created. Only used in conjunction with the ENABLE property.
        """
        return pulumi.get(self, "validate")

