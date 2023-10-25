# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['TableColumnMaskingPolicyApplicationArgs', 'TableColumnMaskingPolicyApplication']

@pulumi.input_type
class TableColumnMaskingPolicyApplicationArgs:
    def __init__(__self__, *,
                 column: pulumi.Input[str],
                 masking_policy: pulumi.Input[str],
                 table: pulumi.Input[str]):
        """
        The set of arguments for constructing a TableColumnMaskingPolicyApplication resource.
        :param pulumi.Input[str] column: The column to apply the masking policy to.
        :param pulumi.Input[str] masking_policy: Fully qualified name (`database.schema.policyname`) of the policy to apply.
        :param pulumi.Input[str] table: The fully qualified name (`database.schema.table`) of the table to apply the masking policy to.
        """
        TableColumnMaskingPolicyApplicationArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            column=column,
            masking_policy=masking_policy,
            table=table,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             column: Optional[pulumi.Input[str]] = None,
             masking_policy: Optional[pulumi.Input[str]] = None,
             table: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if column is None:
            raise TypeError("Missing 'column' argument")
        if masking_policy is None and 'maskingPolicy' in kwargs:
            masking_policy = kwargs['maskingPolicy']
        if masking_policy is None:
            raise TypeError("Missing 'masking_policy' argument")
        if table is None:
            raise TypeError("Missing 'table' argument")

        _setter("column", column)
        _setter("masking_policy", masking_policy)
        _setter("table", table)

    @property
    @pulumi.getter
    def column(self) -> pulumi.Input[str]:
        """
        The column to apply the masking policy to.
        """
        return pulumi.get(self, "column")

    @column.setter
    def column(self, value: pulumi.Input[str]):
        pulumi.set(self, "column", value)

    @property
    @pulumi.getter(name="maskingPolicy")
    def masking_policy(self) -> pulumi.Input[str]:
        """
        Fully qualified name (`database.schema.policyname`) of the policy to apply.
        """
        return pulumi.get(self, "masking_policy")

    @masking_policy.setter
    def masking_policy(self, value: pulumi.Input[str]):
        pulumi.set(self, "masking_policy", value)

    @property
    @pulumi.getter
    def table(self) -> pulumi.Input[str]:
        """
        The fully qualified name (`database.schema.table`) of the table to apply the masking policy to.
        """
        return pulumi.get(self, "table")

    @table.setter
    def table(self, value: pulumi.Input[str]):
        pulumi.set(self, "table", value)


@pulumi.input_type
class _TableColumnMaskingPolicyApplicationState:
    def __init__(__self__, *,
                 column: Optional[pulumi.Input[str]] = None,
                 masking_policy: Optional[pulumi.Input[str]] = None,
                 table: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering TableColumnMaskingPolicyApplication resources.
        :param pulumi.Input[str] column: The column to apply the masking policy to.
        :param pulumi.Input[str] masking_policy: Fully qualified name (`database.schema.policyname`) of the policy to apply.
        :param pulumi.Input[str] table: The fully qualified name (`database.schema.table`) of the table to apply the masking policy to.
        """
        _TableColumnMaskingPolicyApplicationState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            column=column,
            masking_policy=masking_policy,
            table=table,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             column: Optional[pulumi.Input[str]] = None,
             masking_policy: Optional[pulumi.Input[str]] = None,
             table: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if masking_policy is None and 'maskingPolicy' in kwargs:
            masking_policy = kwargs['maskingPolicy']

        if column is not None:
            _setter("column", column)
        if masking_policy is not None:
            _setter("masking_policy", masking_policy)
        if table is not None:
            _setter("table", table)

    @property
    @pulumi.getter
    def column(self) -> Optional[pulumi.Input[str]]:
        """
        The column to apply the masking policy to.
        """
        return pulumi.get(self, "column")

    @column.setter
    def column(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "column", value)

    @property
    @pulumi.getter(name="maskingPolicy")
    def masking_policy(self) -> Optional[pulumi.Input[str]]:
        """
        Fully qualified name (`database.schema.policyname`) of the policy to apply.
        """
        return pulumi.get(self, "masking_policy")

    @masking_policy.setter
    def masking_policy(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "masking_policy", value)

    @property
    @pulumi.getter
    def table(self) -> Optional[pulumi.Input[str]]:
        """
        The fully qualified name (`database.schema.table`) of the table to apply the masking policy to.
        """
        return pulumi.get(self, "table")

    @table.setter
    def table(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "table", value)


class TableColumnMaskingPolicyApplication(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 column: Optional[pulumi.Input[str]] = None,
                 masking_policy: Optional[pulumi.Input[str]] = None,
                 table: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Applies a masking policy to a table column.

        Only one masking policy may be applied per table column, hence only one `TableColumnMaskingPolicyApplication` resources may be present per table column.
        Using two or more `TableColumnMaskingPolicyApplication` resources for the same table column will result in the last one overriding any previously applied masking policies and unresolvable diffs in pulumi preview.

        When using this resource to manage a table column's masking policy make sure to ignore changes to the column's masking policy in the table definition, otherwise the two resources would conflict. See example below.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] column: The column to apply the masking policy to.
        :param pulumi.Input[str] masking_policy: Fully qualified name (`database.schema.policyname`) of the policy to apply.
        :param pulumi.Input[str] table: The fully qualified name (`database.schema.table`) of the table to apply the masking policy to.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: TableColumnMaskingPolicyApplicationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Applies a masking policy to a table column.

        Only one masking policy may be applied per table column, hence only one `TableColumnMaskingPolicyApplication` resources may be present per table column.
        Using two or more `TableColumnMaskingPolicyApplication` resources for the same table column will result in the last one overriding any previously applied masking policies and unresolvable diffs in pulumi preview.

        When using this resource to manage a table column's masking policy make sure to ignore changes to the column's masking policy in the table definition, otherwise the two resources would conflict. See example below.

        :param str resource_name: The name of the resource.
        :param TableColumnMaskingPolicyApplicationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(TableColumnMaskingPolicyApplicationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            TableColumnMaskingPolicyApplicationArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 column: Optional[pulumi.Input[str]] = None,
                 masking_policy: Optional[pulumi.Input[str]] = None,
                 table: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = TableColumnMaskingPolicyApplicationArgs.__new__(TableColumnMaskingPolicyApplicationArgs)

            if column is None and not opts.urn:
                raise TypeError("Missing required property 'column'")
            __props__.__dict__["column"] = column
            if masking_policy is None and not opts.urn:
                raise TypeError("Missing required property 'masking_policy'")
            __props__.__dict__["masking_policy"] = masking_policy
            if table is None and not opts.urn:
                raise TypeError("Missing required property 'table'")
            __props__.__dict__["table"] = table
        super(TableColumnMaskingPolicyApplication, __self__).__init__(
            'snowflake:index/tableColumnMaskingPolicyApplication:TableColumnMaskingPolicyApplication',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            column: Optional[pulumi.Input[str]] = None,
            masking_policy: Optional[pulumi.Input[str]] = None,
            table: Optional[pulumi.Input[str]] = None) -> 'TableColumnMaskingPolicyApplication':
        """
        Get an existing TableColumnMaskingPolicyApplication resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] column: The column to apply the masking policy to.
        :param pulumi.Input[str] masking_policy: Fully qualified name (`database.schema.policyname`) of the policy to apply.
        :param pulumi.Input[str] table: The fully qualified name (`database.schema.table`) of the table to apply the masking policy to.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _TableColumnMaskingPolicyApplicationState.__new__(_TableColumnMaskingPolicyApplicationState)

        __props__.__dict__["column"] = column
        __props__.__dict__["masking_policy"] = masking_policy
        __props__.__dict__["table"] = table
        return TableColumnMaskingPolicyApplication(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def column(self) -> pulumi.Output[str]:
        """
        The column to apply the masking policy to.
        """
        return pulumi.get(self, "column")

    @property
    @pulumi.getter(name="maskingPolicy")
    def masking_policy(self) -> pulumi.Output[str]:
        """
        Fully qualified name (`database.schema.policyname`) of the policy to apply.
        """
        return pulumi.get(self, "masking_policy")

    @property
    @pulumi.getter
    def table(self) -> pulumi.Output[str]:
        """
        The fully qualified name (`database.schema.table`) of the table to apply the masking policy to.
        """
        return pulumi.get(self, "table")

