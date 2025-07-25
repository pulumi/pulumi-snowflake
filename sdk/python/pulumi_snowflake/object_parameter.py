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

__all__ = ['ObjectParameterArgs', 'ObjectParameter']

@pulumi.input_type
class ObjectParameterArgs:
    def __init__(__self__, *,
                 key: pulumi.Input[_builtins.str],
                 value: pulumi.Input[_builtins.str],
                 object_identifiers: Optional[pulumi.Input[Sequence[pulumi.Input['ObjectParameterObjectIdentifierArgs']]]] = None,
                 object_type: Optional[pulumi.Input[_builtins.str]] = None,
                 on_account: Optional[pulumi.Input[_builtins.bool]] = None):
        """
        The set of arguments for constructing a ObjectParameter resource.
        :param pulumi.Input[_builtins.str] key: Name of object parameter. Valid values are those in [object parameters](https://docs.snowflake.com/en/sql-reference/parameters.html#object-parameters).
        :param pulumi.Input[_builtins.str] value: Value of object parameter, as a string. Constraints are the same as those for the parameters in Snowflake documentation.
        :param pulumi.Input[Sequence[pulumi.Input['ObjectParameterObjectIdentifierArgs']]] object_identifiers: Specifies the object identifier for the object parameter. If no value is provided, then the resource will default to setting the object parameter at account level.
        :param pulumi.Input[_builtins.str] object_type: Type of object to which the parameter applies. Valid values are those in [object types](https://docs.snowflake.com/en/sql-reference/parameters.html#object-types). If no value is provided, then the resource will default to setting the object parameter at account level.
        :param pulumi.Input[_builtins.bool] on_account: (Default: `false`) If true, the object parameter will be set on the account level.
        """
        pulumi.set(__self__, "key", key)
        pulumi.set(__self__, "value", value)
        if object_identifiers is not None:
            pulumi.set(__self__, "object_identifiers", object_identifiers)
        if object_type is not None:
            pulumi.set(__self__, "object_type", object_type)
        if on_account is not None:
            pulumi.set(__self__, "on_account", on_account)

    @_builtins.property
    @pulumi.getter
    def key(self) -> pulumi.Input[_builtins.str]:
        """
        Name of object parameter. Valid values are those in [object parameters](https://docs.snowflake.com/en/sql-reference/parameters.html#object-parameters).
        """
        return pulumi.get(self, "key")

    @key.setter
    def key(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "key", value)

    @_builtins.property
    @pulumi.getter
    def value(self) -> pulumi.Input[_builtins.str]:
        """
        Value of object parameter, as a string. Constraints are the same as those for the parameters in Snowflake documentation.
        """
        return pulumi.get(self, "value")

    @value.setter
    def value(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "value", value)

    @_builtins.property
    @pulumi.getter(name="objectIdentifiers")
    def object_identifiers(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ObjectParameterObjectIdentifierArgs']]]]:
        """
        Specifies the object identifier for the object parameter. If no value is provided, then the resource will default to setting the object parameter at account level.
        """
        return pulumi.get(self, "object_identifiers")

    @object_identifiers.setter
    def object_identifiers(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ObjectParameterObjectIdentifierArgs']]]]):
        pulumi.set(self, "object_identifiers", value)

    @_builtins.property
    @pulumi.getter(name="objectType")
    def object_type(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Type of object to which the parameter applies. Valid values are those in [object types](https://docs.snowflake.com/en/sql-reference/parameters.html#object-types). If no value is provided, then the resource will default to setting the object parameter at account level.
        """
        return pulumi.get(self, "object_type")

    @object_type.setter
    def object_type(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "object_type", value)

    @_builtins.property
    @pulumi.getter(name="onAccount")
    def on_account(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        (Default: `false`) If true, the object parameter will be set on the account level.
        """
        return pulumi.get(self, "on_account")

    @on_account.setter
    def on_account(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "on_account", value)


@pulumi.input_type
class _ObjectParameterState:
    def __init__(__self__, *,
                 key: Optional[pulumi.Input[_builtins.str]] = None,
                 object_identifiers: Optional[pulumi.Input[Sequence[pulumi.Input['ObjectParameterObjectIdentifierArgs']]]] = None,
                 object_type: Optional[pulumi.Input[_builtins.str]] = None,
                 on_account: Optional[pulumi.Input[_builtins.bool]] = None,
                 value: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering ObjectParameter resources.
        :param pulumi.Input[_builtins.str] key: Name of object parameter. Valid values are those in [object parameters](https://docs.snowflake.com/en/sql-reference/parameters.html#object-parameters).
        :param pulumi.Input[Sequence[pulumi.Input['ObjectParameterObjectIdentifierArgs']]] object_identifiers: Specifies the object identifier for the object parameter. If no value is provided, then the resource will default to setting the object parameter at account level.
        :param pulumi.Input[_builtins.str] object_type: Type of object to which the parameter applies. Valid values are those in [object types](https://docs.snowflake.com/en/sql-reference/parameters.html#object-types). If no value is provided, then the resource will default to setting the object parameter at account level.
        :param pulumi.Input[_builtins.bool] on_account: (Default: `false`) If true, the object parameter will be set on the account level.
        :param pulumi.Input[_builtins.str] value: Value of object parameter, as a string. Constraints are the same as those for the parameters in Snowflake documentation.
        """
        if key is not None:
            pulumi.set(__self__, "key", key)
        if object_identifiers is not None:
            pulumi.set(__self__, "object_identifiers", object_identifiers)
        if object_type is not None:
            pulumi.set(__self__, "object_type", object_type)
        if on_account is not None:
            pulumi.set(__self__, "on_account", on_account)
        if value is not None:
            pulumi.set(__self__, "value", value)

    @_builtins.property
    @pulumi.getter
    def key(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Name of object parameter. Valid values are those in [object parameters](https://docs.snowflake.com/en/sql-reference/parameters.html#object-parameters).
        """
        return pulumi.get(self, "key")

    @key.setter
    def key(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "key", value)

    @_builtins.property
    @pulumi.getter(name="objectIdentifiers")
    def object_identifiers(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ObjectParameterObjectIdentifierArgs']]]]:
        """
        Specifies the object identifier for the object parameter. If no value is provided, then the resource will default to setting the object parameter at account level.
        """
        return pulumi.get(self, "object_identifiers")

    @object_identifiers.setter
    def object_identifiers(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ObjectParameterObjectIdentifierArgs']]]]):
        pulumi.set(self, "object_identifiers", value)

    @_builtins.property
    @pulumi.getter(name="objectType")
    def object_type(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Type of object to which the parameter applies. Valid values are those in [object types](https://docs.snowflake.com/en/sql-reference/parameters.html#object-types). If no value is provided, then the resource will default to setting the object parameter at account level.
        """
        return pulumi.get(self, "object_type")

    @object_type.setter
    def object_type(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "object_type", value)

    @_builtins.property
    @pulumi.getter(name="onAccount")
    def on_account(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        (Default: `false`) If true, the object parameter will be set on the account level.
        """
        return pulumi.get(self, "on_account")

    @on_account.setter
    def on_account(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "on_account", value)

    @_builtins.property
    @pulumi.getter
    def value(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Value of object parameter, as a string. Constraints are the same as those for the parameters in Snowflake documentation.
        """
        return pulumi.get(self, "value")

    @value.setter
    def value(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "value", value)


@pulumi.type_token("snowflake:index/objectParameter:ObjectParameter")
class ObjectParameter(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 key: Optional[pulumi.Input[_builtins.str]] = None,
                 object_identifiers: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ObjectParameterObjectIdentifierArgs', 'ObjectParameterObjectIdentifierArgsDict']]]]] = None,
                 object_type: Optional[pulumi.Input[_builtins.str]] = None,
                 on_account: Optional[pulumi.Input[_builtins.bool]] = None,
                 value: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        ## Import

        ```sh
        $ pulumi import snowflake:index/objectParameter:ObjectParameter s <key>|<object_type>|<object_identifier>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] key: Name of object parameter. Valid values are those in [object parameters](https://docs.snowflake.com/en/sql-reference/parameters.html#object-parameters).
        :param pulumi.Input[Sequence[pulumi.Input[Union['ObjectParameterObjectIdentifierArgs', 'ObjectParameterObjectIdentifierArgsDict']]]] object_identifiers: Specifies the object identifier for the object parameter. If no value is provided, then the resource will default to setting the object parameter at account level.
        :param pulumi.Input[_builtins.str] object_type: Type of object to which the parameter applies. Valid values are those in [object types](https://docs.snowflake.com/en/sql-reference/parameters.html#object-types). If no value is provided, then the resource will default to setting the object parameter at account level.
        :param pulumi.Input[_builtins.bool] on_account: (Default: `false`) If true, the object parameter will be set on the account level.
        :param pulumi.Input[_builtins.str] value: Value of object parameter, as a string. Constraints are the same as those for the parameters in Snowflake documentation.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ObjectParameterArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Import

        ```sh
        $ pulumi import snowflake:index/objectParameter:ObjectParameter s <key>|<object_type>|<object_identifier>
        ```

        :param str resource_name: The name of the resource.
        :param ObjectParameterArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ObjectParameterArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 key: Optional[pulumi.Input[_builtins.str]] = None,
                 object_identifiers: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ObjectParameterObjectIdentifierArgs', 'ObjectParameterObjectIdentifierArgsDict']]]]] = None,
                 object_type: Optional[pulumi.Input[_builtins.str]] = None,
                 on_account: Optional[pulumi.Input[_builtins.bool]] = None,
                 value: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ObjectParameterArgs.__new__(ObjectParameterArgs)

            if key is None and not opts.urn:
                raise TypeError("Missing required property 'key'")
            __props__.__dict__["key"] = key
            __props__.__dict__["object_identifiers"] = object_identifiers
            __props__.__dict__["object_type"] = object_type
            __props__.__dict__["on_account"] = on_account
            if value is None and not opts.urn:
                raise TypeError("Missing required property 'value'")
            __props__.__dict__["value"] = value
        super(ObjectParameter, __self__).__init__(
            'snowflake:index/objectParameter:ObjectParameter',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            key: Optional[pulumi.Input[_builtins.str]] = None,
            object_identifiers: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ObjectParameterObjectIdentifierArgs', 'ObjectParameterObjectIdentifierArgsDict']]]]] = None,
            object_type: Optional[pulumi.Input[_builtins.str]] = None,
            on_account: Optional[pulumi.Input[_builtins.bool]] = None,
            value: Optional[pulumi.Input[_builtins.str]] = None) -> 'ObjectParameter':
        """
        Get an existing ObjectParameter resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] key: Name of object parameter. Valid values are those in [object parameters](https://docs.snowflake.com/en/sql-reference/parameters.html#object-parameters).
        :param pulumi.Input[Sequence[pulumi.Input[Union['ObjectParameterObjectIdentifierArgs', 'ObjectParameterObjectIdentifierArgsDict']]]] object_identifiers: Specifies the object identifier for the object parameter. If no value is provided, then the resource will default to setting the object parameter at account level.
        :param pulumi.Input[_builtins.str] object_type: Type of object to which the parameter applies. Valid values are those in [object types](https://docs.snowflake.com/en/sql-reference/parameters.html#object-types). If no value is provided, then the resource will default to setting the object parameter at account level.
        :param pulumi.Input[_builtins.bool] on_account: (Default: `false`) If true, the object parameter will be set on the account level.
        :param pulumi.Input[_builtins.str] value: Value of object parameter, as a string. Constraints are the same as those for the parameters in Snowflake documentation.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ObjectParameterState.__new__(_ObjectParameterState)

        __props__.__dict__["key"] = key
        __props__.__dict__["object_identifiers"] = object_identifiers
        __props__.__dict__["object_type"] = object_type
        __props__.__dict__["on_account"] = on_account
        __props__.__dict__["value"] = value
        return ObjectParameter(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def key(self) -> pulumi.Output[_builtins.str]:
        """
        Name of object parameter. Valid values are those in [object parameters](https://docs.snowflake.com/en/sql-reference/parameters.html#object-parameters).
        """
        return pulumi.get(self, "key")

    @_builtins.property
    @pulumi.getter(name="objectIdentifiers")
    def object_identifiers(self) -> pulumi.Output[Optional[Sequence['outputs.ObjectParameterObjectIdentifier']]]:
        """
        Specifies the object identifier for the object parameter. If no value is provided, then the resource will default to setting the object parameter at account level.
        """
        return pulumi.get(self, "object_identifiers")

    @_builtins.property
    @pulumi.getter(name="objectType")
    def object_type(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Type of object to which the parameter applies. Valid values are those in [object types](https://docs.snowflake.com/en/sql-reference/parameters.html#object-types). If no value is provided, then the resource will default to setting the object parameter at account level.
        """
        return pulumi.get(self, "object_type")

    @_builtins.property
    @pulumi.getter(name="onAccount")
    def on_account(self) -> pulumi.Output[Optional[_builtins.bool]]:
        """
        (Default: `false`) If true, the object parameter will be set on the account level.
        """
        return pulumi.get(self, "on_account")

    @_builtins.property
    @pulumi.getter
    def value(self) -> pulumi.Output[_builtins.str]:
        """
        Value of object parameter, as a string. Constraints are the same as those for the parameters in Snowflake documentation.
        """
        return pulumi.get(self, "value")

