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

__all__ = ['SecondaryConnectionArgs', 'SecondaryConnection']

@pulumi.input_type
class SecondaryConnectionArgs:
    def __init__(__self__, *,
                 as_replica_of: pulumi.Input[str],
                 comment: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a SecondaryConnection resource.
        :param pulumi.Input[str] as_replica_of: Specifies the identifier for a primary connection from which to create a replica (i.e. a secondary connection).
        :param pulumi.Input[str] comment: Specifies a comment for the secondary connection.
        :param pulumi.Input[str] name: String that specifies the identifier (i.e. name) for the connection. Must start with an alphabetic character and may only contain letters, decimal digits (0-9), and underscores (_). For a secondary connection, the name must match the name of its primary connection. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
        """
        pulumi.set(__self__, "as_replica_of", as_replica_of)
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="asReplicaOf")
    def as_replica_of(self) -> pulumi.Input[str]:
        """
        Specifies the identifier for a primary connection from which to create a replica (i.e. a secondary connection).
        """
        return pulumi.get(self, "as_replica_of")

    @as_replica_of.setter
    def as_replica_of(self, value: pulumi.Input[str]):
        pulumi.set(self, "as_replica_of", value)

    @property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies a comment for the secondary connection.
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "comment", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        String that specifies the identifier (i.e. name) for the connection. Must start with an alphabetic character and may only contain letters, decimal digits (0-9), and underscores (_). For a secondary connection, the name must match the name of its primary connection. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _SecondaryConnectionState:
    def __init__(__self__, *,
                 as_replica_of: Optional[pulumi.Input[str]] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 fully_qualified_name: Optional[pulumi.Input[str]] = None,
                 is_primary: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 show_outputs: Optional[pulumi.Input[Sequence[pulumi.Input['SecondaryConnectionShowOutputArgs']]]] = None):
        """
        Input properties used for looking up and filtering SecondaryConnection resources.
        :param pulumi.Input[str] as_replica_of: Specifies the identifier for a primary connection from which to create a replica (i.e. a secondary connection).
        :param pulumi.Input[str] comment: Specifies a comment for the secondary connection.
        :param pulumi.Input[str] fully_qualified_name: Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        :param pulumi.Input[bool] is_primary: Indicates if the connection primary status has been changed. If change is detected, resource will be recreated.
        :param pulumi.Input[str] name: String that specifies the identifier (i.e. name) for the connection. Must start with an alphabetic character and may only contain letters, decimal digits (0-9), and underscores (_). For a secondary connection, the name must match the name of its primary connection. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
        :param pulumi.Input[Sequence[pulumi.Input['SecondaryConnectionShowOutputArgs']]] show_outputs: Outputs the result of `SHOW CONNECTIONS` for the given connection.
        """
        if as_replica_of is not None:
            pulumi.set(__self__, "as_replica_of", as_replica_of)
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if fully_qualified_name is not None:
            pulumi.set(__self__, "fully_qualified_name", fully_qualified_name)
        if is_primary is not None:
            pulumi.set(__self__, "is_primary", is_primary)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if show_outputs is not None:
            pulumi.set(__self__, "show_outputs", show_outputs)

    @property
    @pulumi.getter(name="asReplicaOf")
    def as_replica_of(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the identifier for a primary connection from which to create a replica (i.e. a secondary connection).
        """
        return pulumi.get(self, "as_replica_of")

    @as_replica_of.setter
    def as_replica_of(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "as_replica_of", value)

    @property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies a comment for the secondary connection.
        """
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
    @pulumi.getter(name="isPrimary")
    def is_primary(self) -> Optional[pulumi.Input[bool]]:
        """
        Indicates if the connection primary status has been changed. If change is detected, resource will be recreated.
        """
        return pulumi.get(self, "is_primary")

    @is_primary.setter
    def is_primary(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "is_primary", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        String that specifies the identifier (i.e. name) for the connection. Must start with an alphabetic character and may only contain letters, decimal digits (0-9), and underscores (_). For a secondary connection, the name must match the name of its primary connection. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="showOutputs")
    def show_outputs(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['SecondaryConnectionShowOutputArgs']]]]:
        """
        Outputs the result of `SHOW CONNECTIONS` for the given connection.
        """
        return pulumi.get(self, "show_outputs")

    @show_outputs.setter
    def show_outputs(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['SecondaryConnectionShowOutputArgs']]]]):
        pulumi.set(self, "show_outputs", value)


class SecondaryConnection(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 as_replica_of: Optional[pulumi.Input[str]] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ## Import

        ```sh
        $ pulumi import snowflake:index/secondaryConnection:SecondaryConnection example 'secondary_connection_name'
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] as_replica_of: Specifies the identifier for a primary connection from which to create a replica (i.e. a secondary connection).
        :param pulumi.Input[str] comment: Specifies a comment for the secondary connection.
        :param pulumi.Input[str] name: String that specifies the identifier (i.e. name) for the connection. Must start with an alphabetic character and may only contain letters, decimal digits (0-9), and underscores (_). For a secondary connection, the name must match the name of its primary connection. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SecondaryConnectionArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Import

        ```sh
        $ pulumi import snowflake:index/secondaryConnection:SecondaryConnection example 'secondary_connection_name'
        ```

        :param str resource_name: The name of the resource.
        :param SecondaryConnectionArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SecondaryConnectionArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 as_replica_of: Optional[pulumi.Input[str]] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SecondaryConnectionArgs.__new__(SecondaryConnectionArgs)

            if as_replica_of is None and not opts.urn:
                raise TypeError("Missing required property 'as_replica_of'")
            __props__.__dict__["as_replica_of"] = as_replica_of
            __props__.__dict__["comment"] = comment
            __props__.__dict__["name"] = name
            __props__.__dict__["fully_qualified_name"] = None
            __props__.__dict__["is_primary"] = None
            __props__.__dict__["show_outputs"] = None
        super(SecondaryConnection, __self__).__init__(
            'snowflake:index/secondaryConnection:SecondaryConnection',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            as_replica_of: Optional[pulumi.Input[str]] = None,
            comment: Optional[pulumi.Input[str]] = None,
            fully_qualified_name: Optional[pulumi.Input[str]] = None,
            is_primary: Optional[pulumi.Input[bool]] = None,
            name: Optional[pulumi.Input[str]] = None,
            show_outputs: Optional[pulumi.Input[Sequence[pulumi.Input[Union['SecondaryConnectionShowOutputArgs', 'SecondaryConnectionShowOutputArgsDict']]]]] = None) -> 'SecondaryConnection':
        """
        Get an existing SecondaryConnection resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] as_replica_of: Specifies the identifier for a primary connection from which to create a replica (i.e. a secondary connection).
        :param pulumi.Input[str] comment: Specifies a comment for the secondary connection.
        :param pulumi.Input[str] fully_qualified_name: Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        :param pulumi.Input[bool] is_primary: Indicates if the connection primary status has been changed. If change is detected, resource will be recreated.
        :param pulumi.Input[str] name: String that specifies the identifier (i.e. name) for the connection. Must start with an alphabetic character and may only contain letters, decimal digits (0-9), and underscores (_). For a secondary connection, the name must match the name of its primary connection. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
        :param pulumi.Input[Sequence[pulumi.Input[Union['SecondaryConnectionShowOutputArgs', 'SecondaryConnectionShowOutputArgsDict']]]] show_outputs: Outputs the result of `SHOW CONNECTIONS` for the given connection.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SecondaryConnectionState.__new__(_SecondaryConnectionState)

        __props__.__dict__["as_replica_of"] = as_replica_of
        __props__.__dict__["comment"] = comment
        __props__.__dict__["fully_qualified_name"] = fully_qualified_name
        __props__.__dict__["is_primary"] = is_primary
        __props__.__dict__["name"] = name
        __props__.__dict__["show_outputs"] = show_outputs
        return SecondaryConnection(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="asReplicaOf")
    def as_replica_of(self) -> pulumi.Output[str]:
        """
        Specifies the identifier for a primary connection from which to create a replica (i.e. a secondary connection).
        """
        return pulumi.get(self, "as_replica_of")

    @property
    @pulumi.getter
    def comment(self) -> pulumi.Output[Optional[str]]:
        """
        Specifies a comment for the secondary connection.
        """
        return pulumi.get(self, "comment")

    @property
    @pulumi.getter(name="fullyQualifiedName")
    def fully_qualified_name(self) -> pulumi.Output[str]:
        """
        Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        """
        return pulumi.get(self, "fully_qualified_name")

    @property
    @pulumi.getter(name="isPrimary")
    def is_primary(self) -> pulumi.Output[bool]:
        """
        Indicates if the connection primary status has been changed. If change is detected, resource will be recreated.
        """
        return pulumi.get(self, "is_primary")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        String that specifies the identifier (i.e. name) for the connection. Must start with an alphabetic character and may only contain letters, decimal digits (0-9), and underscores (_). For a secondary connection, the name must match the name of its primary connection. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="showOutputs")
    def show_outputs(self) -> pulumi.Output[Sequence['outputs.SecondaryConnectionShowOutput']]:
        """
        Outputs the result of `SHOW CONNECTIONS` for the given connection.
        """
        return pulumi.get(self, "show_outputs")
