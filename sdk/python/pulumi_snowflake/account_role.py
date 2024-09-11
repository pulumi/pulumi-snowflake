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

__all__ = ['AccountRoleArgs', 'AccountRole']

@pulumi.input_type
class AccountRoleArgs:
    def __init__(__self__, *,
                 comment: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a AccountRole resource.
        :param pulumi.Input[str] name: Identifier for the role; must be unique for your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `(`, `)`, `"`
        """
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "comment", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Identifier for the role; must be unique for your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `(`, `)`, `"`
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _AccountRoleState:
    def __init__(__self__, *,
                 comment: Optional[pulumi.Input[str]] = None,
                 fully_qualified_name: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 show_outputs: Optional[pulumi.Input[Sequence[pulumi.Input['AccountRoleShowOutputArgs']]]] = None):
        """
        Input properties used for looking up and filtering AccountRole resources.
        :param pulumi.Input[str] fully_qualified_name: Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        :param pulumi.Input[str] name: Identifier for the role; must be unique for your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `(`, `)`, `"`
        :param pulumi.Input[Sequence[pulumi.Input['AccountRoleShowOutputArgs']]] show_outputs: Outputs the result of `SHOW ROLES` for the given role.
        """
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if fully_qualified_name is not None:
            pulumi.set(__self__, "fully_qualified_name", fully_qualified_name)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if show_outputs is not None:
            pulumi.set(__self__, "show_outputs", show_outputs)

    @property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "comment", value)

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
        Identifier for the role; must be unique for your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `(`, `)`, `"`
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="showOutputs")
    def show_outputs(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['AccountRoleShowOutputArgs']]]]:
        """
        Outputs the result of `SHOW ROLES` for the given role.
        """
        return pulumi.get(self, "show_outputs")

    @show_outputs.setter
    def show_outputs(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['AccountRoleShowOutputArgs']]]]):
        pulumi.set(self, "show_outputs", value)


class AccountRole(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ## Import

        ```sh
        $ pulumi import snowflake:index/accountRole:AccountRole example "name"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] name: Identifier for the role; must be unique for your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `(`, `)`, `"`
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[AccountRoleArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Import

        ```sh
        $ pulumi import snowflake:index/accountRole:AccountRole example "name"
        ```

        :param str resource_name: The name of the resource.
        :param AccountRoleArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AccountRoleArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AccountRoleArgs.__new__(AccountRoleArgs)

            __props__.__dict__["comment"] = comment
            __props__.__dict__["name"] = name
            __props__.__dict__["fully_qualified_name"] = None
            __props__.__dict__["show_outputs"] = None
        super(AccountRole, __self__).__init__(
            'snowflake:index/accountRole:AccountRole',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            comment: Optional[pulumi.Input[str]] = None,
            fully_qualified_name: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            show_outputs: Optional[pulumi.Input[Sequence[pulumi.Input[Union['AccountRoleShowOutputArgs', 'AccountRoleShowOutputArgsDict']]]]] = None) -> 'AccountRole':
        """
        Get an existing AccountRole resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] fully_qualified_name: Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        :param pulumi.Input[str] name: Identifier for the role; must be unique for your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `(`, `)`, `"`
        :param pulumi.Input[Sequence[pulumi.Input[Union['AccountRoleShowOutputArgs', 'AccountRoleShowOutputArgsDict']]]] show_outputs: Outputs the result of `SHOW ROLES` for the given role.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AccountRoleState.__new__(_AccountRoleState)

        __props__.__dict__["comment"] = comment
        __props__.__dict__["fully_qualified_name"] = fully_qualified_name
        __props__.__dict__["name"] = name
        __props__.__dict__["show_outputs"] = show_outputs
        return AccountRole(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def comment(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "comment")

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
        Identifier for the role; must be unique for your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `(`, `)`, `"`
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="showOutputs")
    def show_outputs(self) -> pulumi.Output[Sequence['outputs.AccountRoleShowOutput']]:
        """
        Outputs the result of `SHOW ROLES` for the given role.
        """
        return pulumi.get(self, "show_outputs")

