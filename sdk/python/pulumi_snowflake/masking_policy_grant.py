# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['MaskingPolicyGrantArgs', 'MaskingPolicyGrant']

@pulumi.input_type
class MaskingPolicyGrantArgs:
    def __init__(__self__, *,
                 database_name: pulumi.Input[str],
                 masking_policy_name: pulumi.Input[str],
                 schema_name: pulumi.Input[str],
                 enable_multiple_grants: Optional[pulumi.Input[bool]] = None,
                 privilege: Optional[pulumi.Input[str]] = None,
                 roles: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 with_grant_option: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a MaskingPolicyGrant resource.
        :param pulumi.Input[str] database_name: The name of the database containing the masking policy on which to grant privileges.
        :param pulumi.Input[str] masking_policy_name: The name of the masking policy on which to grant privileges immediately.
        :param pulumi.Input[str] schema_name: The name of the schema containing the masking policy on which to grant privileges.
        :param pulumi.Input[bool] enable_multiple_grants: When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
               grants applied to roles and objects outside Terraform.
        :param pulumi.Input[str] privilege: The privilege to grant on the masking policy.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] roles: Grants privilege to these roles.
        :param pulumi.Input[bool] with_grant_option: When this is set to true, allows the recipient role to grant the privileges to other roles.
        """
        pulumi.set(__self__, "database_name", database_name)
        pulumi.set(__self__, "masking_policy_name", masking_policy_name)
        pulumi.set(__self__, "schema_name", schema_name)
        if enable_multiple_grants is not None:
            pulumi.set(__self__, "enable_multiple_grants", enable_multiple_grants)
        if privilege is not None:
            pulumi.set(__self__, "privilege", privilege)
        if roles is not None:
            pulumi.set(__self__, "roles", roles)
        if with_grant_option is not None:
            pulumi.set(__self__, "with_grant_option", with_grant_option)

    @property
    @pulumi.getter(name="databaseName")
    def database_name(self) -> pulumi.Input[str]:
        """
        The name of the database containing the masking policy on which to grant privileges.
        """
        return pulumi.get(self, "database_name")

    @database_name.setter
    def database_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "database_name", value)

    @property
    @pulumi.getter(name="maskingPolicyName")
    def masking_policy_name(self) -> pulumi.Input[str]:
        """
        The name of the masking policy on which to grant privileges immediately.
        """
        return pulumi.get(self, "masking_policy_name")

    @masking_policy_name.setter
    def masking_policy_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "masking_policy_name", value)

    @property
    @pulumi.getter(name="schemaName")
    def schema_name(self) -> pulumi.Input[str]:
        """
        The name of the schema containing the masking policy on which to grant privileges.
        """
        return pulumi.get(self, "schema_name")

    @schema_name.setter
    def schema_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "schema_name", value)

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
    @pulumi.getter
    def privilege(self) -> Optional[pulumi.Input[str]]:
        """
        The privilege to grant on the masking policy.
        """
        return pulumi.get(self, "privilege")

    @privilege.setter
    def privilege(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "privilege", value)

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
class _MaskingPolicyGrantState:
    def __init__(__self__, *,
                 database_name: Optional[pulumi.Input[str]] = None,
                 enable_multiple_grants: Optional[pulumi.Input[bool]] = None,
                 masking_policy_name: Optional[pulumi.Input[str]] = None,
                 privilege: Optional[pulumi.Input[str]] = None,
                 roles: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 schema_name: Optional[pulumi.Input[str]] = None,
                 with_grant_option: Optional[pulumi.Input[bool]] = None):
        """
        Input properties used for looking up and filtering MaskingPolicyGrant resources.
        :param pulumi.Input[str] database_name: The name of the database containing the masking policy on which to grant privileges.
        :param pulumi.Input[bool] enable_multiple_grants: When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
               grants applied to roles and objects outside Terraform.
        :param pulumi.Input[str] masking_policy_name: The name of the masking policy on which to grant privileges immediately.
        :param pulumi.Input[str] privilege: The privilege to grant on the masking policy.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] roles: Grants privilege to these roles.
        :param pulumi.Input[str] schema_name: The name of the schema containing the masking policy on which to grant privileges.
        :param pulumi.Input[bool] with_grant_option: When this is set to true, allows the recipient role to grant the privileges to other roles.
        """
        if database_name is not None:
            pulumi.set(__self__, "database_name", database_name)
        if enable_multiple_grants is not None:
            pulumi.set(__self__, "enable_multiple_grants", enable_multiple_grants)
        if masking_policy_name is not None:
            pulumi.set(__self__, "masking_policy_name", masking_policy_name)
        if privilege is not None:
            pulumi.set(__self__, "privilege", privilege)
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
        The name of the database containing the masking policy on which to grant privileges.
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
    @pulumi.getter(name="maskingPolicyName")
    def masking_policy_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the masking policy on which to grant privileges immediately.
        """
        return pulumi.get(self, "masking_policy_name")

    @masking_policy_name.setter
    def masking_policy_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "masking_policy_name", value)

    @property
    @pulumi.getter
    def privilege(self) -> Optional[pulumi.Input[str]]:
        """
        The privilege to grant on the masking policy.
        """
        return pulumi.get(self, "privilege")

    @privilege.setter
    def privilege(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "privilege", value)

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
        The name of the schema containing the masking policy on which to grant privileges.
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


class MaskingPolicyGrant(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 database_name: Optional[pulumi.Input[str]] = None,
                 enable_multiple_grants: Optional[pulumi.Input[bool]] = None,
                 masking_policy_name: Optional[pulumi.Input[str]] = None,
                 privilege: Optional[pulumi.Input[str]] = None,
                 roles: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 schema_name: Optional[pulumi.Input[str]] = None,
                 with_grant_option: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_snowflake as snowflake

        example = snowflake.MaskingPolicyGrant("example",
            database_name="EXAMPLE_DB_NAME",
            enable_multiple_grants=True,
            masking_policy_name="EXAMPLE_MASKING_POLICY_NAME",
            privilege="APPLY",
            roles=[
                "ROLE1_NAME",
                "ROLE2_NAME",
            ],
            schema_name="EXAMPLE_SCHEMA_NAME",
            with_grant_option=True)
        ```

        ## Import

        format is database name | schema name | masking policy name | privilege | true/false for with_grant_option

        ```sh
         $ pulumi import snowflake:index/maskingPolicyGrant:MaskingPolicyGrant example 'dbName|schemaName|maskingPolicyName|USAGE|false'
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] database_name: The name of the database containing the masking policy on which to grant privileges.
        :param pulumi.Input[bool] enable_multiple_grants: When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
               grants applied to roles and objects outside Terraform.
        :param pulumi.Input[str] masking_policy_name: The name of the masking policy on which to grant privileges immediately.
        :param pulumi.Input[str] privilege: The privilege to grant on the masking policy.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] roles: Grants privilege to these roles.
        :param pulumi.Input[str] schema_name: The name of the schema containing the masking policy on which to grant privileges.
        :param pulumi.Input[bool] with_grant_option: When this is set to true, allows the recipient role to grant the privileges to other roles.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: MaskingPolicyGrantArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_snowflake as snowflake

        example = snowflake.MaskingPolicyGrant("example",
            database_name="EXAMPLE_DB_NAME",
            enable_multiple_grants=True,
            masking_policy_name="EXAMPLE_MASKING_POLICY_NAME",
            privilege="APPLY",
            roles=[
                "ROLE1_NAME",
                "ROLE2_NAME",
            ],
            schema_name="EXAMPLE_SCHEMA_NAME",
            with_grant_option=True)
        ```

        ## Import

        format is database name | schema name | masking policy name | privilege | true/false for with_grant_option

        ```sh
         $ pulumi import snowflake:index/maskingPolicyGrant:MaskingPolicyGrant example 'dbName|schemaName|maskingPolicyName|USAGE|false'
        ```

        :param str resource_name: The name of the resource.
        :param MaskingPolicyGrantArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(MaskingPolicyGrantArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 database_name: Optional[pulumi.Input[str]] = None,
                 enable_multiple_grants: Optional[pulumi.Input[bool]] = None,
                 masking_policy_name: Optional[pulumi.Input[str]] = None,
                 privilege: Optional[pulumi.Input[str]] = None,
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
            __props__ = MaskingPolicyGrantArgs.__new__(MaskingPolicyGrantArgs)

            if database_name is None and not opts.urn:
                raise TypeError("Missing required property 'database_name'")
            __props__.__dict__["database_name"] = database_name
            __props__.__dict__["enable_multiple_grants"] = enable_multiple_grants
            if masking_policy_name is None and not opts.urn:
                raise TypeError("Missing required property 'masking_policy_name'")
            __props__.__dict__["masking_policy_name"] = masking_policy_name
            __props__.__dict__["privilege"] = privilege
            __props__.__dict__["roles"] = roles
            if schema_name is None and not opts.urn:
                raise TypeError("Missing required property 'schema_name'")
            __props__.__dict__["schema_name"] = schema_name
            __props__.__dict__["with_grant_option"] = with_grant_option
        super(MaskingPolicyGrant, __self__).__init__(
            'snowflake:index/maskingPolicyGrant:MaskingPolicyGrant',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            database_name: Optional[pulumi.Input[str]] = None,
            enable_multiple_grants: Optional[pulumi.Input[bool]] = None,
            masking_policy_name: Optional[pulumi.Input[str]] = None,
            privilege: Optional[pulumi.Input[str]] = None,
            roles: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            schema_name: Optional[pulumi.Input[str]] = None,
            with_grant_option: Optional[pulumi.Input[bool]] = None) -> 'MaskingPolicyGrant':
        """
        Get an existing MaskingPolicyGrant resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] database_name: The name of the database containing the masking policy on which to grant privileges.
        :param pulumi.Input[bool] enable_multiple_grants: When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
               grants applied to roles and objects outside Terraform.
        :param pulumi.Input[str] masking_policy_name: The name of the masking policy on which to grant privileges immediately.
        :param pulumi.Input[str] privilege: The privilege to grant on the masking policy.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] roles: Grants privilege to these roles.
        :param pulumi.Input[str] schema_name: The name of the schema containing the masking policy on which to grant privileges.
        :param pulumi.Input[bool] with_grant_option: When this is set to true, allows the recipient role to grant the privileges to other roles.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _MaskingPolicyGrantState.__new__(_MaskingPolicyGrantState)

        __props__.__dict__["database_name"] = database_name
        __props__.__dict__["enable_multiple_grants"] = enable_multiple_grants
        __props__.__dict__["masking_policy_name"] = masking_policy_name
        __props__.__dict__["privilege"] = privilege
        __props__.__dict__["roles"] = roles
        __props__.__dict__["schema_name"] = schema_name
        __props__.__dict__["with_grant_option"] = with_grant_option
        return MaskingPolicyGrant(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="databaseName")
    def database_name(self) -> pulumi.Output[str]:
        """
        The name of the database containing the masking policy on which to grant privileges.
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
    @pulumi.getter(name="maskingPolicyName")
    def masking_policy_name(self) -> pulumi.Output[str]:
        """
        The name of the masking policy on which to grant privileges immediately.
        """
        return pulumi.get(self, "masking_policy_name")

    @property
    @pulumi.getter
    def privilege(self) -> pulumi.Output[Optional[str]]:
        """
        The privilege to grant on the masking policy.
        """
        return pulumi.get(self, "privilege")

    @property
    @pulumi.getter
    def roles(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        Grants privilege to these roles.
        """
        return pulumi.get(self, "roles")

    @property
    @pulumi.getter(name="schemaName")
    def schema_name(self) -> pulumi.Output[str]:
        """
        The name of the schema containing the masking policy on which to grant privileges.
        """
        return pulumi.get(self, "schema_name")

    @property
    @pulumi.getter(name="withGrantOption")
    def with_grant_option(self) -> pulumi.Output[Optional[bool]]:
        """
        When this is set to true, allows the recipient role to grant the privileges to other roles.
        """
        return pulumi.get(self, "with_grant_option")

