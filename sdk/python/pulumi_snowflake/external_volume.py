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

__all__ = ['ExternalVolumeArgs', 'ExternalVolume']

@pulumi.input_type
class ExternalVolumeArgs:
    def __init__(__self__, *,
                 storage_locations: pulumi.Input[Sequence[pulumi.Input['ExternalVolumeStorageLocationArgs']]],
                 allow_writes: Optional[pulumi.Input[_builtins.str]] = None,
                 comment: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a ExternalVolume resource.
        :param pulumi.Input[Sequence[pulumi.Input['ExternalVolumeStorageLocationArgs']]] storage_locations: List of named cloud storage locations in different regions and, optionally, cloud platforms. Minimum 1 required. The order of the list is important as it impacts the active storage location, and updates will be triggered if it changes. Note that not all parameter combinations are valid as they depend on the given storage*provider. Consult [the docs](https://docs.snowflake.com/en/sql-reference/sql/create-external-volume#cloud-provider-parameters-cloudproviderparams) for more details on this.
        :param pulumi.Input[_builtins.str] allow_writes: (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`default`)) Specifies whether write operations are allowed for the external volume; must be set to TRUE for Iceberg tables that use Snowflake as the catalog. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
        :param pulumi.Input[_builtins.str] comment: Specifies a comment for the external volume.
        :param pulumi.Input[_builtins.str] name: Identifier for the external volume; must be unique for your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        """
        pulumi.set(__self__, "storage_locations", storage_locations)
        if allow_writes is not None:
            pulumi.set(__self__, "allow_writes", allow_writes)
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @_builtins.property
    @pulumi.getter(name="storageLocations")
    def storage_locations(self) -> pulumi.Input[Sequence[pulumi.Input['ExternalVolumeStorageLocationArgs']]]:
        """
        List of named cloud storage locations in different regions and, optionally, cloud platforms. Minimum 1 required. The order of the list is important as it impacts the active storage location, and updates will be triggered if it changes. Note that not all parameter combinations are valid as they depend on the given storage*provider. Consult [the docs](https://docs.snowflake.com/en/sql-reference/sql/create-external-volume#cloud-provider-parameters-cloudproviderparams) for more details on this.
        """
        return pulumi.get(self, "storage_locations")

    @storage_locations.setter
    def storage_locations(self, value: pulumi.Input[Sequence[pulumi.Input['ExternalVolumeStorageLocationArgs']]]):
        pulumi.set(self, "storage_locations", value)

    @_builtins.property
    @pulumi.getter(name="allowWrites")
    def allow_writes(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`default`)) Specifies whether write operations are allowed for the external volume; must be set to TRUE for Iceberg tables that use Snowflake as the catalog. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
        """
        return pulumi.get(self, "allow_writes")

    @allow_writes.setter
    def allow_writes(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "allow_writes", value)

    @_builtins.property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies a comment for the external volume.
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "comment", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Identifier for the external volume; must be unique for your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _ExternalVolumeState:
    def __init__(__self__, *,
                 allow_writes: Optional[pulumi.Input[_builtins.str]] = None,
                 comment: Optional[pulumi.Input[_builtins.str]] = None,
                 describe_outputs: Optional[pulumi.Input[Sequence[pulumi.Input['ExternalVolumeDescribeOutputArgs']]]] = None,
                 fully_qualified_name: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 show_outputs: Optional[pulumi.Input[Sequence[pulumi.Input['ExternalVolumeShowOutputArgs']]]] = None,
                 storage_locations: Optional[pulumi.Input[Sequence[pulumi.Input['ExternalVolumeStorageLocationArgs']]]] = None):
        """
        Input properties used for looking up and filtering ExternalVolume resources.
        :param pulumi.Input[_builtins.str] allow_writes: (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`default`)) Specifies whether write operations are allowed for the external volume; must be set to TRUE for Iceberg tables that use Snowflake as the catalog. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
        :param pulumi.Input[_builtins.str] comment: Specifies a comment for the external volume.
        :param pulumi.Input[Sequence[pulumi.Input['ExternalVolumeDescribeOutputArgs']]] describe_outputs: Outputs the result of `DESCRIBE EXTERNAL VOLUME` for the given external volume.
        :param pulumi.Input[_builtins.str] fully_qualified_name: Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        :param pulumi.Input[_builtins.str] name: Identifier for the external volume; must be unique for your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        :param pulumi.Input[Sequence[pulumi.Input['ExternalVolumeShowOutputArgs']]] show_outputs: Outputs the result of `SHOW EXTERNAL VOLUMES` for the given external volume.
        :param pulumi.Input[Sequence[pulumi.Input['ExternalVolumeStorageLocationArgs']]] storage_locations: List of named cloud storage locations in different regions and, optionally, cloud platforms. Minimum 1 required. The order of the list is important as it impacts the active storage location, and updates will be triggered if it changes. Note that not all parameter combinations are valid as they depend on the given storage*provider. Consult [the docs](https://docs.snowflake.com/en/sql-reference/sql/create-external-volume#cloud-provider-parameters-cloudproviderparams) for more details on this.
        """
        if allow_writes is not None:
            pulumi.set(__self__, "allow_writes", allow_writes)
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if describe_outputs is not None:
            pulumi.set(__self__, "describe_outputs", describe_outputs)
        if fully_qualified_name is not None:
            pulumi.set(__self__, "fully_qualified_name", fully_qualified_name)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if show_outputs is not None:
            pulumi.set(__self__, "show_outputs", show_outputs)
        if storage_locations is not None:
            pulumi.set(__self__, "storage_locations", storage_locations)

    @_builtins.property
    @pulumi.getter(name="allowWrites")
    def allow_writes(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`default`)) Specifies whether write operations are allowed for the external volume; must be set to TRUE for Iceberg tables that use Snowflake as the catalog. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
        """
        return pulumi.get(self, "allow_writes")

    @allow_writes.setter
    def allow_writes(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "allow_writes", value)

    @_builtins.property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies a comment for the external volume.
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "comment", value)

    @_builtins.property
    @pulumi.getter(name="describeOutputs")
    def describe_outputs(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ExternalVolumeDescribeOutputArgs']]]]:
        """
        Outputs the result of `DESCRIBE EXTERNAL VOLUME` for the given external volume.
        """
        return pulumi.get(self, "describe_outputs")

    @describe_outputs.setter
    def describe_outputs(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ExternalVolumeDescribeOutputArgs']]]]):
        pulumi.set(self, "describe_outputs", value)

    @_builtins.property
    @pulumi.getter(name="fullyQualifiedName")
    def fully_qualified_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        """
        return pulumi.get(self, "fully_qualified_name")

    @fully_qualified_name.setter
    def fully_qualified_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "fully_qualified_name", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Identifier for the external volume; must be unique for your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="showOutputs")
    def show_outputs(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ExternalVolumeShowOutputArgs']]]]:
        """
        Outputs the result of `SHOW EXTERNAL VOLUMES` for the given external volume.
        """
        return pulumi.get(self, "show_outputs")

    @show_outputs.setter
    def show_outputs(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ExternalVolumeShowOutputArgs']]]]):
        pulumi.set(self, "show_outputs", value)

    @_builtins.property
    @pulumi.getter(name="storageLocations")
    def storage_locations(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ExternalVolumeStorageLocationArgs']]]]:
        """
        List of named cloud storage locations in different regions and, optionally, cloud platforms. Minimum 1 required. The order of the list is important as it impacts the active storage location, and updates will be triggered if it changes. Note that not all parameter combinations are valid as they depend on the given storage*provider. Consult [the docs](https://docs.snowflake.com/en/sql-reference/sql/create-external-volume#cloud-provider-parameters-cloudproviderparams) for more details on this.
        """
        return pulumi.get(self, "storage_locations")

    @storage_locations.setter
    def storage_locations(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ExternalVolumeStorageLocationArgs']]]]):
        pulumi.set(self, "storage_locations", value)


@pulumi.type_token("snowflake:index/externalVolume:ExternalVolume")
class ExternalVolume(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 allow_writes: Optional[pulumi.Input[_builtins.str]] = None,
                 comment: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 storage_locations: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ExternalVolumeStorageLocationArgs', 'ExternalVolumeStorageLocationArgsDict']]]]] = None,
                 __props__=None):
        """
        !> **Caution: Preview Feature** This feature is considered a preview feature in the provider, regardless of the state of the resource in Snowflake. We do not guarantee its stability. It will be reworked and marked as a stable feature in future releases. Breaking changes are expected, even without bumping the major version. To use this feature, add the relevant feature name to `preview_features_enabled` field in the provider configuration. Please always refer to the Getting Help section in our Github repo to best determine how to get help for your questions.

        Resource used to manage external volume objects. For more information, check [external volume documentation](https://docs.snowflake.com/en/sql-reference/commands-data-loading#external-volume).

        > **Note** If a field has a default value, it is shown next to the type in the schema.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] allow_writes: (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`default`)) Specifies whether write operations are allowed for the external volume; must be set to TRUE for Iceberg tables that use Snowflake as the catalog. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
        :param pulumi.Input[_builtins.str] comment: Specifies a comment for the external volume.
        :param pulumi.Input[_builtins.str] name: Identifier for the external volume; must be unique for your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        :param pulumi.Input[Sequence[pulumi.Input[Union['ExternalVolumeStorageLocationArgs', 'ExternalVolumeStorageLocationArgsDict']]]] storage_locations: List of named cloud storage locations in different regions and, optionally, cloud platforms. Minimum 1 required. The order of the list is important as it impacts the active storage location, and updates will be triggered if it changes. Note that not all parameter combinations are valid as they depend on the given storage*provider. Consult [the docs](https://docs.snowflake.com/en/sql-reference/sql/create-external-volume#cloud-provider-parameters-cloudproviderparams) for more details on this.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ExternalVolumeArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        !> **Caution: Preview Feature** This feature is considered a preview feature in the provider, regardless of the state of the resource in Snowflake. We do not guarantee its stability. It will be reworked and marked as a stable feature in future releases. Breaking changes are expected, even without bumping the major version. To use this feature, add the relevant feature name to `preview_features_enabled` field in the provider configuration. Please always refer to the Getting Help section in our Github repo to best determine how to get help for your questions.

        Resource used to manage external volume objects. For more information, check [external volume documentation](https://docs.snowflake.com/en/sql-reference/commands-data-loading#external-volume).

        > **Note** If a field has a default value, it is shown next to the type in the schema.

        :param str resource_name: The name of the resource.
        :param ExternalVolumeArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ExternalVolumeArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 allow_writes: Optional[pulumi.Input[_builtins.str]] = None,
                 comment: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 storage_locations: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ExternalVolumeStorageLocationArgs', 'ExternalVolumeStorageLocationArgsDict']]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ExternalVolumeArgs.__new__(ExternalVolumeArgs)

            __props__.__dict__["allow_writes"] = allow_writes
            __props__.__dict__["comment"] = comment
            __props__.__dict__["name"] = name
            if storage_locations is None and not opts.urn:
                raise TypeError("Missing required property 'storage_locations'")
            __props__.__dict__["storage_locations"] = storage_locations
            __props__.__dict__["describe_outputs"] = None
            __props__.__dict__["fully_qualified_name"] = None
            __props__.__dict__["show_outputs"] = None
        super(ExternalVolume, __self__).__init__(
            'snowflake:index/externalVolume:ExternalVolume',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            allow_writes: Optional[pulumi.Input[_builtins.str]] = None,
            comment: Optional[pulumi.Input[_builtins.str]] = None,
            describe_outputs: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ExternalVolumeDescribeOutputArgs', 'ExternalVolumeDescribeOutputArgsDict']]]]] = None,
            fully_qualified_name: Optional[pulumi.Input[_builtins.str]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            show_outputs: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ExternalVolumeShowOutputArgs', 'ExternalVolumeShowOutputArgsDict']]]]] = None,
            storage_locations: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ExternalVolumeStorageLocationArgs', 'ExternalVolumeStorageLocationArgsDict']]]]] = None) -> 'ExternalVolume':
        """
        Get an existing ExternalVolume resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] allow_writes: (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`default`)) Specifies whether write operations are allowed for the external volume; must be set to TRUE for Iceberg tables that use Snowflake as the catalog. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
        :param pulumi.Input[_builtins.str] comment: Specifies a comment for the external volume.
        :param pulumi.Input[Sequence[pulumi.Input[Union['ExternalVolumeDescribeOutputArgs', 'ExternalVolumeDescribeOutputArgsDict']]]] describe_outputs: Outputs the result of `DESCRIBE EXTERNAL VOLUME` for the given external volume.
        :param pulumi.Input[_builtins.str] fully_qualified_name: Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        :param pulumi.Input[_builtins.str] name: Identifier for the external volume; must be unique for your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        :param pulumi.Input[Sequence[pulumi.Input[Union['ExternalVolumeShowOutputArgs', 'ExternalVolumeShowOutputArgsDict']]]] show_outputs: Outputs the result of `SHOW EXTERNAL VOLUMES` for the given external volume.
        :param pulumi.Input[Sequence[pulumi.Input[Union['ExternalVolumeStorageLocationArgs', 'ExternalVolumeStorageLocationArgsDict']]]] storage_locations: List of named cloud storage locations in different regions and, optionally, cloud platforms. Minimum 1 required. The order of the list is important as it impacts the active storage location, and updates will be triggered if it changes. Note that not all parameter combinations are valid as they depend on the given storage*provider. Consult [the docs](https://docs.snowflake.com/en/sql-reference/sql/create-external-volume#cloud-provider-parameters-cloudproviderparams) for more details on this.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ExternalVolumeState.__new__(_ExternalVolumeState)

        __props__.__dict__["allow_writes"] = allow_writes
        __props__.__dict__["comment"] = comment
        __props__.__dict__["describe_outputs"] = describe_outputs
        __props__.__dict__["fully_qualified_name"] = fully_qualified_name
        __props__.__dict__["name"] = name
        __props__.__dict__["show_outputs"] = show_outputs
        __props__.__dict__["storage_locations"] = storage_locations
        return ExternalVolume(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="allowWrites")
    def allow_writes(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`default`)) Specifies whether write operations are allowed for the external volume; must be set to TRUE for Iceberg tables that use Snowflake as the catalog. Available options are: "true" or "false". When the value is not set in the configuration the provider will put "default" there which means to use the Snowflake default for this value.
        """
        return pulumi.get(self, "allow_writes")

    @_builtins.property
    @pulumi.getter
    def comment(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Specifies a comment for the external volume.
        """
        return pulumi.get(self, "comment")

    @_builtins.property
    @pulumi.getter(name="describeOutputs")
    def describe_outputs(self) -> pulumi.Output[Sequence['outputs.ExternalVolumeDescribeOutput']]:
        """
        Outputs the result of `DESCRIBE EXTERNAL VOLUME` for the given external volume.
        """
        return pulumi.get(self, "describe_outputs")

    @_builtins.property
    @pulumi.getter(name="fullyQualifiedName")
    def fully_qualified_name(self) -> pulumi.Output[_builtins.str]:
        """
        Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        """
        return pulumi.get(self, "fully_qualified_name")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        Identifier for the external volume; must be unique for your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `"`.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="showOutputs")
    def show_outputs(self) -> pulumi.Output[Sequence['outputs.ExternalVolumeShowOutput']]:
        """
        Outputs the result of `SHOW EXTERNAL VOLUMES` for the given external volume.
        """
        return pulumi.get(self, "show_outputs")

    @_builtins.property
    @pulumi.getter(name="storageLocations")
    def storage_locations(self) -> pulumi.Output[Sequence['outputs.ExternalVolumeStorageLocation']]:
        """
        List of named cloud storage locations in different regions and, optionally, cloud platforms. Minimum 1 required. The order of the list is important as it impacts the active storage location, and updates will be triggered if it changes. Note that not all parameter combinations are valid as they depend on the given storage*provider. Consult [the docs](https://docs.snowflake.com/en/sql-reference/sql/create-external-volume#cloud-provider-parameters-cloudproviderparams) for more details on this.
        """
        return pulumi.get(self, "storage_locations")

