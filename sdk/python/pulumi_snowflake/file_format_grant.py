# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['FileFormatGrantArgs', 'FileFormatGrant']

@pulumi.input_type
class FileFormatGrantArgs:
    def __init__(__self__, *,
                 database_name: pulumi.Input[str],
                 roles: pulumi.Input[Sequence[pulumi.Input[str]]],
                 enable_multiple_grants: Optional[pulumi.Input[bool]] = None,
                 file_format_name: Optional[pulumi.Input[str]] = None,
                 on_all: Optional[pulumi.Input[bool]] = None,
                 on_future: Optional[pulumi.Input[bool]] = None,
                 privilege: Optional[pulumi.Input[str]] = None,
                 revert_ownership_to_role_name: Optional[pulumi.Input[str]] = None,
                 schema_name: Optional[pulumi.Input[str]] = None,
                 with_grant_option: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a FileFormatGrant resource.
        :param pulumi.Input[str] database_name: The name of the database containing the current or future file formats on which to grant privileges.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] roles: Grants privilege to these roles.
        :param pulumi.Input[bool] enable_multiple_grants: When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
               grants applied to roles and objects outside Terraform.
        :param pulumi.Input[str] file_format_name: The name of the file format on which to grant privileges immediately (only valid if on_future is false).
        :param pulumi.Input[bool] on_all: When this is set to true and a schema*name is provided, apply this grant on all file formats in the given schema. When this is true and no schema*name is provided apply this grant on all file formats in the given database. The file*format*name field must be unset in order to use on*all. Cannot be used together with on*future.
        :param pulumi.Input[bool] on_future: When this is set to true and a schema*name is provided, apply this grant on all future file formats in the given schema. When this is true and no schema*name is provided apply this grant on all future file formats in the given database. The file*format*name field must be unset in order to use on*future. Cannot be used together with on*all.
        :param pulumi.Input[str] privilege: The privilege to grant on the current or future file format. To grant all privileges, use the value `ALL PRIVILEGES`
        :param pulumi.Input[str] revert_ownership_to_role_name: The name of the role to revert ownership to on destroy. Has no effect unless `privilege` is set to `OWNERSHIP`
        :param pulumi.Input[str] schema_name: The name of the schema containing the current or future file formats on which to grant privileges.
        :param pulumi.Input[bool] with_grant_option: When this is set to true, allows the recipient role to grant the privileges to other roles.
        """
        pulumi.set(__self__, "database_name", database_name)
        pulumi.set(__self__, "roles", roles)
        if enable_multiple_grants is not None:
            pulumi.set(__self__, "enable_multiple_grants", enable_multiple_grants)
        if file_format_name is not None:
            pulumi.set(__self__, "file_format_name", file_format_name)
        if on_all is not None:
            pulumi.set(__self__, "on_all", on_all)
        if on_future is not None:
            pulumi.set(__self__, "on_future", on_future)
        if privilege is not None:
            pulumi.set(__self__, "privilege", privilege)
        if revert_ownership_to_role_name is not None:
            pulumi.set(__self__, "revert_ownership_to_role_name", revert_ownership_to_role_name)
        if schema_name is not None:
            pulumi.set(__self__, "schema_name", schema_name)
        if with_grant_option is not None:
            pulumi.set(__self__, "with_grant_option", with_grant_option)

    @property
    @pulumi.getter(name="databaseName")
    def database_name(self) -> pulumi.Input[str]:
        """
        The name of the database containing the current or future file formats on which to grant privileges.
        """
        return pulumi.get(self, "database_name")

    @database_name.setter
    def database_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "database_name", value)

    @property
    @pulumi.getter
    def roles(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        Grants privilege to these roles.
        """
        return pulumi.get(self, "roles")

    @roles.setter
    def roles(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "roles", value)

    @property
    @pulumi.getter(name="enableMultipleGrants")
    def enable_multiple_grants(self) -> Optional[pulumi.Input[bool]]:
        """
        When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
        grants applied to roles and objects outside Terraform.
        """
        return pulumi.get(self, "enable_multiple_grants")

    @enable_multiple_grants.setter
    def enable_multiple_grants(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enable_multiple_grants", value)

    @property
    @pulumi.getter(name="fileFormatName")
    def file_format_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the file format on which to grant privileges immediately (only valid if on_future is false).
        """
        return pulumi.get(self, "file_format_name")

    @file_format_name.setter
    def file_format_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "file_format_name", value)

    @property
    @pulumi.getter(name="onAll")
    def on_all(self) -> Optional[pulumi.Input[bool]]:
        """
        When this is set to true and a schema*name is provided, apply this grant on all file formats in the given schema. When this is true and no schema*name is provided apply this grant on all file formats in the given database. The file*format*name field must be unset in order to use on*all. Cannot be used together with on*future.
        """
        return pulumi.get(self, "on_all")

    @on_all.setter
    def on_all(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "on_all", value)

    @property
    @pulumi.getter(name="onFuture")
    def on_future(self) -> Optional[pulumi.Input[bool]]:
        """
        When this is set to true and a schema*name is provided, apply this grant on all future file formats in the given schema. When this is true and no schema*name is provided apply this grant on all future file formats in the given database. The file*format*name field must be unset in order to use on*future. Cannot be used together with on*all.
        """
        return pulumi.get(self, "on_future")

    @on_future.setter
    def on_future(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "on_future", value)

    @property
    @pulumi.getter
    def privilege(self) -> Optional[pulumi.Input[str]]:
        """
        The privilege to grant on the current or future file format. To grant all privileges, use the value `ALL PRIVILEGES`
        """
        return pulumi.get(self, "privilege")

    @privilege.setter
    def privilege(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "privilege", value)

    @property
    @pulumi.getter(name="revertOwnershipToRoleName")
    def revert_ownership_to_role_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the role to revert ownership to on destroy. Has no effect unless `privilege` is set to `OWNERSHIP`
        """
        return pulumi.get(self, "revert_ownership_to_role_name")

    @revert_ownership_to_role_name.setter
    def revert_ownership_to_role_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "revert_ownership_to_role_name", value)

    @property
    @pulumi.getter(name="schemaName")
    def schema_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the schema containing the current or future file formats on which to grant privileges.
        """
        return pulumi.get(self, "schema_name")

    @schema_name.setter
    def schema_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "schema_name", value)

    @property
    @pulumi.getter(name="withGrantOption")
    def with_grant_option(self) -> Optional[pulumi.Input[bool]]:
        """
        When this is set to true, allows the recipient role to grant the privileges to other roles.
        """
        return pulumi.get(self, "with_grant_option")

    @with_grant_option.setter
    def with_grant_option(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "with_grant_option", value)


@pulumi.input_type
class _FileFormatGrantState:
    def __init__(__self__, *,
                 database_name: Optional[pulumi.Input[str]] = None,
                 enable_multiple_grants: Optional[pulumi.Input[bool]] = None,
                 file_format_name: Optional[pulumi.Input[str]] = None,
                 on_all: Optional[pulumi.Input[bool]] = None,
                 on_future: Optional[pulumi.Input[bool]] = None,
                 privilege: Optional[pulumi.Input[str]] = None,
                 revert_ownership_to_role_name: Optional[pulumi.Input[str]] = None,
                 roles: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 schema_name: Optional[pulumi.Input[str]] = None,
                 with_grant_option: Optional[pulumi.Input[bool]] = None):
        """
        Input properties used for looking up and filtering FileFormatGrant resources.
        :param pulumi.Input[str] database_name: The name of the database containing the current or future file formats on which to grant privileges.
        :param pulumi.Input[bool] enable_multiple_grants: When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
               grants applied to roles and objects outside Terraform.
        :param pulumi.Input[str] file_format_name: The name of the file format on which to grant privileges immediately (only valid if on_future is false).
        :param pulumi.Input[bool] on_all: When this is set to true and a schema*name is provided, apply this grant on all file formats in the given schema. When this is true and no schema*name is provided apply this grant on all file formats in the given database. The file*format*name field must be unset in order to use on*all. Cannot be used together with on*future.
        :param pulumi.Input[bool] on_future: When this is set to true and a schema*name is provided, apply this grant on all future file formats in the given schema. When this is true and no schema*name is provided apply this grant on all future file formats in the given database. The file*format*name field must be unset in order to use on*future. Cannot be used together with on*all.
        :param pulumi.Input[str] privilege: The privilege to grant on the current or future file format. To grant all privileges, use the value `ALL PRIVILEGES`
        :param pulumi.Input[str] revert_ownership_to_role_name: The name of the role to revert ownership to on destroy. Has no effect unless `privilege` is set to `OWNERSHIP`
        :param pulumi.Input[Sequence[pulumi.Input[str]]] roles: Grants privilege to these roles.
        :param pulumi.Input[str] schema_name: The name of the schema containing the current or future file formats on which to grant privileges.
        :param pulumi.Input[bool] with_grant_option: When this is set to true, allows the recipient role to grant the privileges to other roles.
        """
        if database_name is not None:
            pulumi.set(__self__, "database_name", database_name)
        if enable_multiple_grants is not None:
            pulumi.set(__self__, "enable_multiple_grants", enable_multiple_grants)
        if file_format_name is not None:
            pulumi.set(__self__, "file_format_name", file_format_name)
        if on_all is not None:
            pulumi.set(__self__, "on_all", on_all)
        if on_future is not None:
            pulumi.set(__self__, "on_future", on_future)
        if privilege is not None:
            pulumi.set(__self__, "privilege", privilege)
        if revert_ownership_to_role_name is not None:
            pulumi.set(__self__, "revert_ownership_to_role_name", revert_ownership_to_role_name)
        if roles is not None:
            pulumi.set(__self__, "roles", roles)
        if schema_name is not None:
            pulumi.set(__self__, "schema_name", schema_name)
        if with_grant_option is not None:
            pulumi.set(__self__, "with_grant_option", with_grant_option)

    @property
    @pulumi.getter(name="databaseName")
    def database_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the database containing the current or future file formats on which to grant privileges.
        """
        return pulumi.get(self, "database_name")

    @database_name.setter
    def database_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "database_name", value)

    @property
    @pulumi.getter(name="enableMultipleGrants")
    def enable_multiple_grants(self) -> Optional[pulumi.Input[bool]]:
        """
        When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
        grants applied to roles and objects outside Terraform.
        """
        return pulumi.get(self, "enable_multiple_grants")

    @enable_multiple_grants.setter
    def enable_multiple_grants(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enable_multiple_grants", value)

    @property
    @pulumi.getter(name="fileFormatName")
    def file_format_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the file format on which to grant privileges immediately (only valid if on_future is false).
        """
        return pulumi.get(self, "file_format_name")

    @file_format_name.setter
    def file_format_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "file_format_name", value)

    @property
    @pulumi.getter(name="onAll")
    def on_all(self) -> Optional[pulumi.Input[bool]]:
        """
        When this is set to true and a schema*name is provided, apply this grant on all file formats in the given schema. When this is true and no schema*name is provided apply this grant on all file formats in the given database. The file*format*name field must be unset in order to use on*all. Cannot be used together with on*future.
        """
        return pulumi.get(self, "on_all")

    @on_all.setter
    def on_all(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "on_all", value)

    @property
    @pulumi.getter(name="onFuture")
    def on_future(self) -> Optional[pulumi.Input[bool]]:
        """
        When this is set to true and a schema*name is provided, apply this grant on all future file formats in the given schema. When this is true and no schema*name is provided apply this grant on all future file formats in the given database. The file*format*name field must be unset in order to use on*future. Cannot be used together with on*all.
        """
        return pulumi.get(self, "on_future")

    @on_future.setter
    def on_future(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "on_future", value)

    @property
    @pulumi.getter
    def privilege(self) -> Optional[pulumi.Input[str]]:
        """
        The privilege to grant on the current or future file format. To grant all privileges, use the value `ALL PRIVILEGES`
        """
        return pulumi.get(self, "privilege")

    @privilege.setter
    def privilege(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "privilege", value)

    @property
    @pulumi.getter(name="revertOwnershipToRoleName")
    def revert_ownership_to_role_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the role to revert ownership to on destroy. Has no effect unless `privilege` is set to `OWNERSHIP`
        """
        return pulumi.get(self, "revert_ownership_to_role_name")

    @revert_ownership_to_role_name.setter
    def revert_ownership_to_role_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "revert_ownership_to_role_name", value)

    @property
    @pulumi.getter
    def roles(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Grants privilege to these roles.
        """
        return pulumi.get(self, "roles")

    @roles.setter
    def roles(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "roles", value)

    @property
    @pulumi.getter(name="schemaName")
    def schema_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the schema containing the current or future file formats on which to grant privileges.
        """
        return pulumi.get(self, "schema_name")

    @schema_name.setter
    def schema_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "schema_name", value)

    @property
    @pulumi.getter(name="withGrantOption")
    def with_grant_option(self) -> Optional[pulumi.Input[bool]]:
        """
        When this is set to true, allows the recipient role to grant the privileges to other roles.
        """
        return pulumi.get(self, "with_grant_option")

    @with_grant_option.setter
    def with_grant_option(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "with_grant_option", value)


class FileFormatGrant(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 database_name: Optional[pulumi.Input[str]] = None,
                 enable_multiple_grants: Optional[pulumi.Input[bool]] = None,
                 file_format_name: Optional[pulumi.Input[str]] = None,
                 on_all: Optional[pulumi.Input[bool]] = None,
                 on_future: Optional[pulumi.Input[bool]] = None,
                 privilege: Optional[pulumi.Input[str]] = None,
                 revert_ownership_to_role_name: Optional[pulumi.Input[str]] = None,
                 roles: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 schema_name: Optional[pulumi.Input[str]] = None,
                 with_grant_option: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        """
        > **Deprecation** This resource is deprecated and will be removed in a future major version release. Please use GrantPrivilegesToAccountRole instead. <deprecation>

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_snowflake as snowflake

        grant = snowflake.FileFormatGrant("grant",
            database_name="database",
            file_format_name="file_format",
            on_future=False,
            privilege="SELECT",
            roles=[
                "role1",
                "role2",
            ],
            schema_name="schema",
            with_grant_option=False)
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        format is database_name|schema_name|file_format_name|privilege|with_grant_option|on_future|roles

        ```sh
        $ pulumi import snowflake:index/fileFormatGrant:FileFormatGrant example "MY_DATABASE|MY_SCHEMA|MY_FILE_FORMAT|USAGE|false|false|role1,role2'
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] database_name: The name of the database containing the current or future file formats on which to grant privileges.
        :param pulumi.Input[bool] enable_multiple_grants: When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
               grants applied to roles and objects outside Terraform.
        :param pulumi.Input[str] file_format_name: The name of the file format on which to grant privileges immediately (only valid if on_future is false).
        :param pulumi.Input[bool] on_all: When this is set to true and a schema*name is provided, apply this grant on all file formats in the given schema. When this is true and no schema*name is provided apply this grant on all file formats in the given database. The file*format*name field must be unset in order to use on*all. Cannot be used together with on*future.
        :param pulumi.Input[bool] on_future: When this is set to true and a schema*name is provided, apply this grant on all future file formats in the given schema. When this is true and no schema*name is provided apply this grant on all future file formats in the given database. The file*format*name field must be unset in order to use on*future. Cannot be used together with on*all.
        :param pulumi.Input[str] privilege: The privilege to grant on the current or future file format. To grant all privileges, use the value `ALL PRIVILEGES`
        :param pulumi.Input[str] revert_ownership_to_role_name: The name of the role to revert ownership to on destroy. Has no effect unless `privilege` is set to `OWNERSHIP`
        :param pulumi.Input[Sequence[pulumi.Input[str]]] roles: Grants privilege to these roles.
        :param pulumi.Input[str] schema_name: The name of the schema containing the current or future file formats on which to grant privileges.
        :param pulumi.Input[bool] with_grant_option: When this is set to true, allows the recipient role to grant the privileges to other roles.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: FileFormatGrantArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        > **Deprecation** This resource is deprecated and will be removed in a future major version release. Please use GrantPrivilegesToAccountRole instead. <deprecation>

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_snowflake as snowflake

        grant = snowflake.FileFormatGrant("grant",
            database_name="database",
            file_format_name="file_format",
            on_future=False,
            privilege="SELECT",
            roles=[
                "role1",
                "role2",
            ],
            schema_name="schema",
            with_grant_option=False)
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        format is database_name|schema_name|file_format_name|privilege|with_grant_option|on_future|roles

        ```sh
        $ pulumi import snowflake:index/fileFormatGrant:FileFormatGrant example "MY_DATABASE|MY_SCHEMA|MY_FILE_FORMAT|USAGE|false|false|role1,role2'
        ```

        :param str resource_name: The name of the resource.
        :param FileFormatGrantArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(FileFormatGrantArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 database_name: Optional[pulumi.Input[str]] = None,
                 enable_multiple_grants: Optional[pulumi.Input[bool]] = None,
                 file_format_name: Optional[pulumi.Input[str]] = None,
                 on_all: Optional[pulumi.Input[bool]] = None,
                 on_future: Optional[pulumi.Input[bool]] = None,
                 privilege: Optional[pulumi.Input[str]] = None,
                 revert_ownership_to_role_name: Optional[pulumi.Input[str]] = None,
                 roles: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 schema_name: Optional[pulumi.Input[str]] = None,
                 with_grant_option: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = FileFormatGrantArgs.__new__(FileFormatGrantArgs)

            if database_name is None and not opts.urn:
                raise TypeError("Missing required property 'database_name'")
            __props__.__dict__["database_name"] = database_name
            __props__.__dict__["enable_multiple_grants"] = enable_multiple_grants
            __props__.__dict__["file_format_name"] = file_format_name
            __props__.__dict__["on_all"] = on_all
            __props__.__dict__["on_future"] = on_future
            __props__.__dict__["privilege"] = privilege
            __props__.__dict__["revert_ownership_to_role_name"] = revert_ownership_to_role_name
            if roles is None and not opts.urn:
                raise TypeError("Missing required property 'roles'")
            __props__.__dict__["roles"] = roles
            __props__.__dict__["schema_name"] = schema_name
            __props__.__dict__["with_grant_option"] = with_grant_option
        super(FileFormatGrant, __self__).__init__(
            'snowflake:index/fileFormatGrant:FileFormatGrant',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            database_name: Optional[pulumi.Input[str]] = None,
            enable_multiple_grants: Optional[pulumi.Input[bool]] = None,
            file_format_name: Optional[pulumi.Input[str]] = None,
            on_all: Optional[pulumi.Input[bool]] = None,
            on_future: Optional[pulumi.Input[bool]] = None,
            privilege: Optional[pulumi.Input[str]] = None,
            revert_ownership_to_role_name: Optional[pulumi.Input[str]] = None,
            roles: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            schema_name: Optional[pulumi.Input[str]] = None,
            with_grant_option: Optional[pulumi.Input[bool]] = None) -> 'FileFormatGrant':
        """
        Get an existing FileFormatGrant resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] database_name: The name of the database containing the current or future file formats on which to grant privileges.
        :param pulumi.Input[bool] enable_multiple_grants: When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
               grants applied to roles and objects outside Terraform.
        :param pulumi.Input[str] file_format_name: The name of the file format on which to grant privileges immediately (only valid if on_future is false).
        :param pulumi.Input[bool] on_all: When this is set to true and a schema*name is provided, apply this grant on all file formats in the given schema. When this is true and no schema*name is provided apply this grant on all file formats in the given database. The file*format*name field must be unset in order to use on*all. Cannot be used together with on*future.
        :param pulumi.Input[bool] on_future: When this is set to true and a schema*name is provided, apply this grant on all future file formats in the given schema. When this is true and no schema*name is provided apply this grant on all future file formats in the given database. The file*format*name field must be unset in order to use on*future. Cannot be used together with on*all.
        :param pulumi.Input[str] privilege: The privilege to grant on the current or future file format. To grant all privileges, use the value `ALL PRIVILEGES`
        :param pulumi.Input[str] revert_ownership_to_role_name: The name of the role to revert ownership to on destroy. Has no effect unless `privilege` is set to `OWNERSHIP`
        :param pulumi.Input[Sequence[pulumi.Input[str]]] roles: Grants privilege to these roles.
        :param pulumi.Input[str] schema_name: The name of the schema containing the current or future file formats on which to grant privileges.
        :param pulumi.Input[bool] with_grant_option: When this is set to true, allows the recipient role to grant the privileges to other roles.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _FileFormatGrantState.__new__(_FileFormatGrantState)

        __props__.__dict__["database_name"] = database_name
        __props__.__dict__["enable_multiple_grants"] = enable_multiple_grants
        __props__.__dict__["file_format_name"] = file_format_name
        __props__.__dict__["on_all"] = on_all
        __props__.__dict__["on_future"] = on_future
        __props__.__dict__["privilege"] = privilege
        __props__.__dict__["revert_ownership_to_role_name"] = revert_ownership_to_role_name
        __props__.__dict__["roles"] = roles
        __props__.__dict__["schema_name"] = schema_name
        __props__.__dict__["with_grant_option"] = with_grant_option
        return FileFormatGrant(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="databaseName")
    def database_name(self) -> pulumi.Output[str]:
        """
        The name of the database containing the current or future file formats on which to grant privileges.
        """
        return pulumi.get(self, "database_name")

    @property
    @pulumi.getter(name="enableMultipleGrants")
    def enable_multiple_grants(self) -> pulumi.Output[Optional[bool]]:
        """
        When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
        grants applied to roles and objects outside Terraform.
        """
        return pulumi.get(self, "enable_multiple_grants")

    @property
    @pulumi.getter(name="fileFormatName")
    def file_format_name(self) -> pulumi.Output[Optional[str]]:
        """
        The name of the file format on which to grant privileges immediately (only valid if on_future is false).
        """
        return pulumi.get(self, "file_format_name")

    @property
    @pulumi.getter(name="onAll")
    def on_all(self) -> pulumi.Output[Optional[bool]]:
        """
        When this is set to true and a schema*name is provided, apply this grant on all file formats in the given schema. When this is true and no schema*name is provided apply this grant on all file formats in the given database. The file*format*name field must be unset in order to use on*all. Cannot be used together with on*future.
        """
        return pulumi.get(self, "on_all")

    @property
    @pulumi.getter(name="onFuture")
    def on_future(self) -> pulumi.Output[Optional[bool]]:
        """
        When this is set to true and a schema*name is provided, apply this grant on all future file formats in the given schema. When this is true and no schema*name is provided apply this grant on all future file formats in the given database. The file*format*name field must be unset in order to use on*future. Cannot be used together with on*all.
        """
        return pulumi.get(self, "on_future")

    @property
    @pulumi.getter
    def privilege(self) -> pulumi.Output[Optional[str]]:
        """
        The privilege to grant on the current or future file format. To grant all privileges, use the value `ALL PRIVILEGES`
        """
        return pulumi.get(self, "privilege")

    @property
    @pulumi.getter(name="revertOwnershipToRoleName")
    def revert_ownership_to_role_name(self) -> pulumi.Output[Optional[str]]:
        """
        The name of the role to revert ownership to on destroy. Has no effect unless `privilege` is set to `OWNERSHIP`
        """
        return pulumi.get(self, "revert_ownership_to_role_name")

    @property
    @pulumi.getter
    def roles(self) -> pulumi.Output[Sequence[str]]:
        """
        Grants privilege to these roles.
        """
        return pulumi.get(self, "roles")

    @property
    @pulumi.getter(name="schemaName")
    def schema_name(self) -> pulumi.Output[Optional[str]]:
        """
        The name of the schema containing the current or future file formats on which to grant privileges.
        """
        return pulumi.get(self, "schema_name")

    @property
    @pulumi.getter(name="withGrantOption")
    def with_grant_option(self) -> pulumi.Output[Optional[bool]]:
        """
        When this is set to true, allows the recipient role to grant the privileges to other roles.
        """
        return pulumi.get(self, "with_grant_option")

