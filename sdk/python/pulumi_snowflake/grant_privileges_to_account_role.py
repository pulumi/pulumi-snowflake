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

__all__ = ['GrantPrivilegesToAccountRoleArgs', 'GrantPrivilegesToAccountRole']

@pulumi.input_type
class GrantPrivilegesToAccountRoleArgs:
    def __init__(__self__, *,
                 account_role_name: pulumi.Input[str],
                 all_privileges: Optional[pulumi.Input[bool]] = None,
                 always_apply: Optional[pulumi.Input[bool]] = None,
                 always_apply_trigger: Optional[pulumi.Input[str]] = None,
                 on_account: Optional[pulumi.Input[bool]] = None,
                 on_account_object: Optional[pulumi.Input['GrantPrivilegesToAccountRoleOnAccountObjectArgs']] = None,
                 on_schema: Optional[pulumi.Input['GrantPrivilegesToAccountRoleOnSchemaArgs']] = None,
                 on_schema_object: Optional[pulumi.Input['GrantPrivilegesToAccountRoleOnSchemaObjectArgs']] = None,
                 privileges: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 with_grant_option: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a GrantPrivilegesToAccountRole resource.
        :param pulumi.Input[str] account_role_name: The fully qualified name of the account role to which privileges will be granted.
        :param pulumi.Input[bool] all_privileges: Grant all privileges on the account role.
        :param pulumi.Input[bool] always_apply: If true, the resource will always produce a “plan” and on “apply” it will re-grant defined privileges. It is
               supposed to be used only in “grant privileges on all X’s in database / schema Y” or “grant all privileges to
               X” scenarios to make sure that every new object in a given database / schema is granted by the account role and every
               new privilege is granted to the database role. Important note: this flag is not compliant with the Terraform assumptions
               of the config being eventually convergent (producing an empty plan).
        :param pulumi.Input[str] always_apply_trigger: This is a helper field and should not be set. Its main purpose is to help to achieve the functionality described by the always_apply field.
        :param pulumi.Input[bool] on_account: If true, the privileges will be granted on the account.
        :param pulumi.Input['GrantPrivilegesToAccountRoleOnAccountObjectArgs'] on_account_object: Specifies the account object on which privileges will be granted
        :param pulumi.Input['GrantPrivilegesToAccountRoleOnSchemaArgs'] on_schema: Specifies the schema on which privileges will be granted.
        :param pulumi.Input['GrantPrivilegesToAccountRoleOnSchemaObjectArgs'] on_schema_object: Specifies the schema object on which privileges will be granted.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] privileges: The privileges to grant on the account role.
        :param pulumi.Input[bool] with_grant_option: Specifies whether the grantee can grant the privileges to other users.
        """
        pulumi.set(__self__, "account_role_name", account_role_name)
        if all_privileges is not None:
            pulumi.set(__self__, "all_privileges", all_privileges)
        if always_apply is not None:
            pulumi.set(__self__, "always_apply", always_apply)
        if always_apply_trigger is not None:
            pulumi.set(__self__, "always_apply_trigger", always_apply_trigger)
        if on_account is not None:
            pulumi.set(__self__, "on_account", on_account)
        if on_account_object is not None:
            pulumi.set(__self__, "on_account_object", on_account_object)
        if on_schema is not None:
            pulumi.set(__self__, "on_schema", on_schema)
        if on_schema_object is not None:
            pulumi.set(__self__, "on_schema_object", on_schema_object)
        if privileges is not None:
            pulumi.set(__self__, "privileges", privileges)
        if with_grant_option is not None:
            pulumi.set(__self__, "with_grant_option", with_grant_option)

    @property
    @pulumi.getter(name="accountRoleName")
    def account_role_name(self) -> pulumi.Input[str]:
        """
        The fully qualified name of the account role to which privileges will be granted.
        """
        return pulumi.get(self, "account_role_name")

    @account_role_name.setter
    def account_role_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "account_role_name", value)

    @property
    @pulumi.getter(name="allPrivileges")
    def all_privileges(self) -> Optional[pulumi.Input[bool]]:
        """
        Grant all privileges on the account role.
        """
        return pulumi.get(self, "all_privileges")

    @all_privileges.setter
    def all_privileges(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "all_privileges", value)

    @property
    @pulumi.getter(name="alwaysApply")
    def always_apply(self) -> Optional[pulumi.Input[bool]]:
        """
        If true, the resource will always produce a “plan” and on “apply” it will re-grant defined privileges. It is
        supposed to be used only in “grant privileges on all X’s in database / schema Y” or “grant all privileges to
        X” scenarios to make sure that every new object in a given database / schema is granted by the account role and every
        new privilege is granted to the database role. Important note: this flag is not compliant with the Terraform assumptions
        of the config being eventually convergent (producing an empty plan).
        """
        return pulumi.get(self, "always_apply")

    @always_apply.setter
    def always_apply(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "always_apply", value)

    @property
    @pulumi.getter(name="alwaysApplyTrigger")
    def always_apply_trigger(self) -> Optional[pulumi.Input[str]]:
        """
        This is a helper field and should not be set. Its main purpose is to help to achieve the functionality described by the always_apply field.
        """
        return pulumi.get(self, "always_apply_trigger")

    @always_apply_trigger.setter
    def always_apply_trigger(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "always_apply_trigger", value)

    @property
    @pulumi.getter(name="onAccount")
    def on_account(self) -> Optional[pulumi.Input[bool]]:
        """
        If true, the privileges will be granted on the account.
        """
        return pulumi.get(self, "on_account")

    @on_account.setter
    def on_account(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "on_account", value)

    @property
    @pulumi.getter(name="onAccountObject")
    def on_account_object(self) -> Optional[pulumi.Input['GrantPrivilegesToAccountRoleOnAccountObjectArgs']]:
        """
        Specifies the account object on which privileges will be granted
        """
        return pulumi.get(self, "on_account_object")

    @on_account_object.setter
    def on_account_object(self, value: Optional[pulumi.Input['GrantPrivilegesToAccountRoleOnAccountObjectArgs']]):
        pulumi.set(self, "on_account_object", value)

    @property
    @pulumi.getter(name="onSchema")
    def on_schema(self) -> Optional[pulumi.Input['GrantPrivilegesToAccountRoleOnSchemaArgs']]:
        """
        Specifies the schema on which privileges will be granted.
        """
        return pulumi.get(self, "on_schema")

    @on_schema.setter
    def on_schema(self, value: Optional[pulumi.Input['GrantPrivilegesToAccountRoleOnSchemaArgs']]):
        pulumi.set(self, "on_schema", value)

    @property
    @pulumi.getter(name="onSchemaObject")
    def on_schema_object(self) -> Optional[pulumi.Input['GrantPrivilegesToAccountRoleOnSchemaObjectArgs']]:
        """
        Specifies the schema object on which privileges will be granted.
        """
        return pulumi.get(self, "on_schema_object")

    @on_schema_object.setter
    def on_schema_object(self, value: Optional[pulumi.Input['GrantPrivilegesToAccountRoleOnSchemaObjectArgs']]):
        pulumi.set(self, "on_schema_object", value)

    @property
    @pulumi.getter
    def privileges(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The privileges to grant on the account role.
        """
        return pulumi.get(self, "privileges")

    @privileges.setter
    def privileges(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "privileges", value)

    @property
    @pulumi.getter(name="withGrantOption")
    def with_grant_option(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether the grantee can grant the privileges to other users.
        """
        return pulumi.get(self, "with_grant_option")

    @with_grant_option.setter
    def with_grant_option(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "with_grant_option", value)


@pulumi.input_type
class _GrantPrivilegesToAccountRoleState:
    def __init__(__self__, *,
                 account_role_name: Optional[pulumi.Input[str]] = None,
                 all_privileges: Optional[pulumi.Input[bool]] = None,
                 always_apply: Optional[pulumi.Input[bool]] = None,
                 always_apply_trigger: Optional[pulumi.Input[str]] = None,
                 on_account: Optional[pulumi.Input[bool]] = None,
                 on_account_object: Optional[pulumi.Input['GrantPrivilegesToAccountRoleOnAccountObjectArgs']] = None,
                 on_schema: Optional[pulumi.Input['GrantPrivilegesToAccountRoleOnSchemaArgs']] = None,
                 on_schema_object: Optional[pulumi.Input['GrantPrivilegesToAccountRoleOnSchemaObjectArgs']] = None,
                 privileges: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 with_grant_option: Optional[pulumi.Input[bool]] = None):
        """
        Input properties used for looking up and filtering GrantPrivilegesToAccountRole resources.
        :param pulumi.Input[str] account_role_name: The fully qualified name of the account role to which privileges will be granted.
        :param pulumi.Input[bool] all_privileges: Grant all privileges on the account role.
        :param pulumi.Input[bool] always_apply: If true, the resource will always produce a “plan” and on “apply” it will re-grant defined privileges. It is
               supposed to be used only in “grant privileges on all X’s in database / schema Y” or “grant all privileges to
               X” scenarios to make sure that every new object in a given database / schema is granted by the account role and every
               new privilege is granted to the database role. Important note: this flag is not compliant with the Terraform assumptions
               of the config being eventually convergent (producing an empty plan).
        :param pulumi.Input[str] always_apply_trigger: This is a helper field and should not be set. Its main purpose is to help to achieve the functionality described by the always_apply field.
        :param pulumi.Input[bool] on_account: If true, the privileges will be granted on the account.
        :param pulumi.Input['GrantPrivilegesToAccountRoleOnAccountObjectArgs'] on_account_object: Specifies the account object on which privileges will be granted
        :param pulumi.Input['GrantPrivilegesToAccountRoleOnSchemaArgs'] on_schema: Specifies the schema on which privileges will be granted.
        :param pulumi.Input['GrantPrivilegesToAccountRoleOnSchemaObjectArgs'] on_schema_object: Specifies the schema object on which privileges will be granted.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] privileges: The privileges to grant on the account role.
        :param pulumi.Input[bool] with_grant_option: Specifies whether the grantee can grant the privileges to other users.
        """
        if account_role_name is not None:
            pulumi.set(__self__, "account_role_name", account_role_name)
        if all_privileges is not None:
            pulumi.set(__self__, "all_privileges", all_privileges)
        if always_apply is not None:
            pulumi.set(__self__, "always_apply", always_apply)
        if always_apply_trigger is not None:
            pulumi.set(__self__, "always_apply_trigger", always_apply_trigger)
        if on_account is not None:
            pulumi.set(__self__, "on_account", on_account)
        if on_account_object is not None:
            pulumi.set(__self__, "on_account_object", on_account_object)
        if on_schema is not None:
            pulumi.set(__self__, "on_schema", on_schema)
        if on_schema_object is not None:
            pulumi.set(__self__, "on_schema_object", on_schema_object)
        if privileges is not None:
            pulumi.set(__self__, "privileges", privileges)
        if with_grant_option is not None:
            pulumi.set(__self__, "with_grant_option", with_grant_option)

    @property
    @pulumi.getter(name="accountRoleName")
    def account_role_name(self) -> Optional[pulumi.Input[str]]:
        """
        The fully qualified name of the account role to which privileges will be granted.
        """
        return pulumi.get(self, "account_role_name")

    @account_role_name.setter
    def account_role_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "account_role_name", value)

    @property
    @pulumi.getter(name="allPrivileges")
    def all_privileges(self) -> Optional[pulumi.Input[bool]]:
        """
        Grant all privileges on the account role.
        """
        return pulumi.get(self, "all_privileges")

    @all_privileges.setter
    def all_privileges(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "all_privileges", value)

    @property
    @pulumi.getter(name="alwaysApply")
    def always_apply(self) -> Optional[pulumi.Input[bool]]:
        """
        If true, the resource will always produce a “plan” and on “apply” it will re-grant defined privileges. It is
        supposed to be used only in “grant privileges on all X’s in database / schema Y” or “grant all privileges to
        X” scenarios to make sure that every new object in a given database / schema is granted by the account role and every
        new privilege is granted to the database role. Important note: this flag is not compliant with the Terraform assumptions
        of the config being eventually convergent (producing an empty plan).
        """
        return pulumi.get(self, "always_apply")

    @always_apply.setter
    def always_apply(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "always_apply", value)

    @property
    @pulumi.getter(name="alwaysApplyTrigger")
    def always_apply_trigger(self) -> Optional[pulumi.Input[str]]:
        """
        This is a helper field and should not be set. Its main purpose is to help to achieve the functionality described by the always_apply field.
        """
        return pulumi.get(self, "always_apply_trigger")

    @always_apply_trigger.setter
    def always_apply_trigger(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "always_apply_trigger", value)

    @property
    @pulumi.getter(name="onAccount")
    def on_account(self) -> Optional[pulumi.Input[bool]]:
        """
        If true, the privileges will be granted on the account.
        """
        return pulumi.get(self, "on_account")

    @on_account.setter
    def on_account(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "on_account", value)

    @property
    @pulumi.getter(name="onAccountObject")
    def on_account_object(self) -> Optional[pulumi.Input['GrantPrivilegesToAccountRoleOnAccountObjectArgs']]:
        """
        Specifies the account object on which privileges will be granted
        """
        return pulumi.get(self, "on_account_object")

    @on_account_object.setter
    def on_account_object(self, value: Optional[pulumi.Input['GrantPrivilegesToAccountRoleOnAccountObjectArgs']]):
        pulumi.set(self, "on_account_object", value)

    @property
    @pulumi.getter(name="onSchema")
    def on_schema(self) -> Optional[pulumi.Input['GrantPrivilegesToAccountRoleOnSchemaArgs']]:
        """
        Specifies the schema on which privileges will be granted.
        """
        return pulumi.get(self, "on_schema")

    @on_schema.setter
    def on_schema(self, value: Optional[pulumi.Input['GrantPrivilegesToAccountRoleOnSchemaArgs']]):
        pulumi.set(self, "on_schema", value)

    @property
    @pulumi.getter(name="onSchemaObject")
    def on_schema_object(self) -> Optional[pulumi.Input['GrantPrivilegesToAccountRoleOnSchemaObjectArgs']]:
        """
        Specifies the schema object on which privileges will be granted.
        """
        return pulumi.get(self, "on_schema_object")

    @on_schema_object.setter
    def on_schema_object(self, value: Optional[pulumi.Input['GrantPrivilegesToAccountRoleOnSchemaObjectArgs']]):
        pulumi.set(self, "on_schema_object", value)

    @property
    @pulumi.getter
    def privileges(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The privileges to grant on the account role.
        """
        return pulumi.get(self, "privileges")

    @privileges.setter
    def privileges(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "privileges", value)

    @property
    @pulumi.getter(name="withGrantOption")
    def with_grant_option(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether the grantee can grant the privileges to other users.
        """
        return pulumi.get(self, "with_grant_option")

    @with_grant_option.setter
    def with_grant_option(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "with_grant_option", value)


class GrantPrivilegesToAccountRole(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_role_name: Optional[pulumi.Input[str]] = None,
                 all_privileges: Optional[pulumi.Input[bool]] = None,
                 always_apply: Optional[pulumi.Input[bool]] = None,
                 always_apply_trigger: Optional[pulumi.Input[str]] = None,
                 on_account: Optional[pulumi.Input[bool]] = None,
                 on_account_object: Optional[pulumi.Input[pulumi.InputType['GrantPrivilegesToAccountRoleOnAccountObjectArgs']]] = None,
                 on_schema: Optional[pulumi.Input[pulumi.InputType['GrantPrivilegesToAccountRoleOnSchemaArgs']]] = None,
                 on_schema_object: Optional[pulumi.Input[pulumi.InputType['GrantPrivilegesToAccountRoleOnSchemaObjectArgs']]] = None,
                 privileges: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 with_grant_option: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        """
        ## Import

        ### Import examples

        #### Grant all privileges OnAccountObject (Database)

        ```sh
        $ pulumi import snowflake:index/grantPrivilegesToAccountRole:GrantPrivilegesToAccountRole `"\\"test_db_role\\"|false|false|ALL|OnAccountObject|DATABASE|\\"test_db\\""`
        ```

        #### Grant list of privileges OnAllSchemasInDatabase

        ```sh
        $ pulumi import snowflake:index/grantPrivilegesToAccountRole:GrantPrivilegesToAccountRole `"\\"test_db_role\\"|false|false|CREATE TAG,CREATE TABLE|OnSchema|OnAllSchemasInDatabase|\\"test_db\\""`
        ```

        #### Grant list of privileges on table

        ```sh
        $ pulumi import snowflake:index/grantPrivilegesToAccountRole:GrantPrivilegesToAccountRole \\"test_table\\""`
        ```

        #### Grant list of privileges OnAll tables in schema

        ```sh
        $ pulumi import snowflake:index/grantPrivilegesToAccountRole:GrantPrivilegesToAccountRole \\"test_schema\\""`
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_role_name: The fully qualified name of the account role to which privileges will be granted.
        :param pulumi.Input[bool] all_privileges: Grant all privileges on the account role.
        :param pulumi.Input[bool] always_apply: If true, the resource will always produce a “plan” and on “apply” it will re-grant defined privileges. It is
               supposed to be used only in “grant privileges on all X’s in database / schema Y” or “grant all privileges to
               X” scenarios to make sure that every new object in a given database / schema is granted by the account role and every
               new privilege is granted to the database role. Important note: this flag is not compliant with the Terraform assumptions
               of the config being eventually convergent (producing an empty plan).
        :param pulumi.Input[str] always_apply_trigger: This is a helper field and should not be set. Its main purpose is to help to achieve the functionality described by the always_apply field.
        :param pulumi.Input[bool] on_account: If true, the privileges will be granted on the account.
        :param pulumi.Input[pulumi.InputType['GrantPrivilegesToAccountRoleOnAccountObjectArgs']] on_account_object: Specifies the account object on which privileges will be granted
        :param pulumi.Input[pulumi.InputType['GrantPrivilegesToAccountRoleOnSchemaArgs']] on_schema: Specifies the schema on which privileges will be granted.
        :param pulumi.Input[pulumi.InputType['GrantPrivilegesToAccountRoleOnSchemaObjectArgs']] on_schema_object: Specifies the schema object on which privileges will be granted.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] privileges: The privileges to grant on the account role.
        :param pulumi.Input[bool] with_grant_option: Specifies whether the grantee can grant the privileges to other users.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: GrantPrivilegesToAccountRoleArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Import

        ### Import examples

        #### Grant all privileges OnAccountObject (Database)

        ```sh
        $ pulumi import snowflake:index/grantPrivilegesToAccountRole:GrantPrivilegesToAccountRole `"\\"test_db_role\\"|false|false|ALL|OnAccountObject|DATABASE|\\"test_db\\""`
        ```

        #### Grant list of privileges OnAllSchemasInDatabase

        ```sh
        $ pulumi import snowflake:index/grantPrivilegesToAccountRole:GrantPrivilegesToAccountRole `"\\"test_db_role\\"|false|false|CREATE TAG,CREATE TABLE|OnSchema|OnAllSchemasInDatabase|\\"test_db\\""`
        ```

        #### Grant list of privileges on table

        ```sh
        $ pulumi import snowflake:index/grantPrivilegesToAccountRole:GrantPrivilegesToAccountRole \\"test_table\\""`
        ```

        #### Grant list of privileges OnAll tables in schema

        ```sh
        $ pulumi import snowflake:index/grantPrivilegesToAccountRole:GrantPrivilegesToAccountRole \\"test_schema\\""`
        ```

        :param str resource_name: The name of the resource.
        :param GrantPrivilegesToAccountRoleArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(GrantPrivilegesToAccountRoleArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_role_name: Optional[pulumi.Input[str]] = None,
                 all_privileges: Optional[pulumi.Input[bool]] = None,
                 always_apply: Optional[pulumi.Input[bool]] = None,
                 always_apply_trigger: Optional[pulumi.Input[str]] = None,
                 on_account: Optional[pulumi.Input[bool]] = None,
                 on_account_object: Optional[pulumi.Input[pulumi.InputType['GrantPrivilegesToAccountRoleOnAccountObjectArgs']]] = None,
                 on_schema: Optional[pulumi.Input[pulumi.InputType['GrantPrivilegesToAccountRoleOnSchemaArgs']]] = None,
                 on_schema_object: Optional[pulumi.Input[pulumi.InputType['GrantPrivilegesToAccountRoleOnSchemaObjectArgs']]] = None,
                 privileges: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 with_grant_option: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = GrantPrivilegesToAccountRoleArgs.__new__(GrantPrivilegesToAccountRoleArgs)

            if account_role_name is None and not opts.urn:
                raise TypeError("Missing required property 'account_role_name'")
            __props__.__dict__["account_role_name"] = account_role_name
            __props__.__dict__["all_privileges"] = all_privileges
            __props__.__dict__["always_apply"] = always_apply
            __props__.__dict__["always_apply_trigger"] = always_apply_trigger
            __props__.__dict__["on_account"] = on_account
            __props__.__dict__["on_account_object"] = on_account_object
            __props__.__dict__["on_schema"] = on_schema
            __props__.__dict__["on_schema_object"] = on_schema_object
            __props__.__dict__["privileges"] = privileges
            __props__.__dict__["with_grant_option"] = with_grant_option
        super(GrantPrivilegesToAccountRole, __self__).__init__(
            'snowflake:index/grantPrivilegesToAccountRole:GrantPrivilegesToAccountRole',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_role_name: Optional[pulumi.Input[str]] = None,
            all_privileges: Optional[pulumi.Input[bool]] = None,
            always_apply: Optional[pulumi.Input[bool]] = None,
            always_apply_trigger: Optional[pulumi.Input[str]] = None,
            on_account: Optional[pulumi.Input[bool]] = None,
            on_account_object: Optional[pulumi.Input[pulumi.InputType['GrantPrivilegesToAccountRoleOnAccountObjectArgs']]] = None,
            on_schema: Optional[pulumi.Input[pulumi.InputType['GrantPrivilegesToAccountRoleOnSchemaArgs']]] = None,
            on_schema_object: Optional[pulumi.Input[pulumi.InputType['GrantPrivilegesToAccountRoleOnSchemaObjectArgs']]] = None,
            privileges: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            with_grant_option: Optional[pulumi.Input[bool]] = None) -> 'GrantPrivilegesToAccountRole':
        """
        Get an existing GrantPrivilegesToAccountRole resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_role_name: The fully qualified name of the account role to which privileges will be granted.
        :param pulumi.Input[bool] all_privileges: Grant all privileges on the account role.
        :param pulumi.Input[bool] always_apply: If true, the resource will always produce a “plan” and on “apply” it will re-grant defined privileges. It is
               supposed to be used only in “grant privileges on all X’s in database / schema Y” or “grant all privileges to
               X” scenarios to make sure that every new object in a given database / schema is granted by the account role and every
               new privilege is granted to the database role. Important note: this flag is not compliant with the Terraform assumptions
               of the config being eventually convergent (producing an empty plan).
        :param pulumi.Input[str] always_apply_trigger: This is a helper field and should not be set. Its main purpose is to help to achieve the functionality described by the always_apply field.
        :param pulumi.Input[bool] on_account: If true, the privileges will be granted on the account.
        :param pulumi.Input[pulumi.InputType['GrantPrivilegesToAccountRoleOnAccountObjectArgs']] on_account_object: Specifies the account object on which privileges will be granted
        :param pulumi.Input[pulumi.InputType['GrantPrivilegesToAccountRoleOnSchemaArgs']] on_schema: Specifies the schema on which privileges will be granted.
        :param pulumi.Input[pulumi.InputType['GrantPrivilegesToAccountRoleOnSchemaObjectArgs']] on_schema_object: Specifies the schema object on which privileges will be granted.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] privileges: The privileges to grant on the account role.
        :param pulumi.Input[bool] with_grant_option: Specifies whether the grantee can grant the privileges to other users.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _GrantPrivilegesToAccountRoleState.__new__(_GrantPrivilegesToAccountRoleState)

        __props__.__dict__["account_role_name"] = account_role_name
        __props__.__dict__["all_privileges"] = all_privileges
        __props__.__dict__["always_apply"] = always_apply
        __props__.__dict__["always_apply_trigger"] = always_apply_trigger
        __props__.__dict__["on_account"] = on_account
        __props__.__dict__["on_account_object"] = on_account_object
        __props__.__dict__["on_schema"] = on_schema
        __props__.__dict__["on_schema_object"] = on_schema_object
        __props__.__dict__["privileges"] = privileges
        __props__.__dict__["with_grant_option"] = with_grant_option
        return GrantPrivilegesToAccountRole(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountRoleName")
    def account_role_name(self) -> pulumi.Output[str]:
        """
        The fully qualified name of the account role to which privileges will be granted.
        """
        return pulumi.get(self, "account_role_name")

    @property
    @pulumi.getter(name="allPrivileges")
    def all_privileges(self) -> pulumi.Output[Optional[bool]]:
        """
        Grant all privileges on the account role.
        """
        return pulumi.get(self, "all_privileges")

    @property
    @pulumi.getter(name="alwaysApply")
    def always_apply(self) -> pulumi.Output[Optional[bool]]:
        """
        If true, the resource will always produce a “plan” and on “apply” it will re-grant defined privileges. It is
        supposed to be used only in “grant privileges on all X’s in database / schema Y” or “grant all privileges to
        X” scenarios to make sure that every new object in a given database / schema is granted by the account role and every
        new privilege is granted to the database role. Important note: this flag is not compliant with the Terraform assumptions
        of the config being eventually convergent (producing an empty plan).
        """
        return pulumi.get(self, "always_apply")

    @property
    @pulumi.getter(name="alwaysApplyTrigger")
    def always_apply_trigger(self) -> pulumi.Output[Optional[str]]:
        """
        This is a helper field and should not be set. Its main purpose is to help to achieve the functionality described by the always_apply field.
        """
        return pulumi.get(self, "always_apply_trigger")

    @property
    @pulumi.getter(name="onAccount")
    def on_account(self) -> pulumi.Output[Optional[bool]]:
        """
        If true, the privileges will be granted on the account.
        """
        return pulumi.get(self, "on_account")

    @property
    @pulumi.getter(name="onAccountObject")
    def on_account_object(self) -> pulumi.Output[Optional['outputs.GrantPrivilegesToAccountRoleOnAccountObject']]:
        """
        Specifies the account object on which privileges will be granted
        """
        return pulumi.get(self, "on_account_object")

    @property
    @pulumi.getter(name="onSchema")
    def on_schema(self) -> pulumi.Output[Optional['outputs.GrantPrivilegesToAccountRoleOnSchema']]:
        """
        Specifies the schema on which privileges will be granted.
        """
        return pulumi.get(self, "on_schema")

    @property
    @pulumi.getter(name="onSchemaObject")
    def on_schema_object(self) -> pulumi.Output[Optional['outputs.GrantPrivilegesToAccountRoleOnSchemaObject']]:
        """
        Specifies the schema object on which privileges will be granted.
        """
        return pulumi.get(self, "on_schema_object")

    @property
    @pulumi.getter
    def privileges(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        The privileges to grant on the account role.
        """
        return pulumi.get(self, "privileges")

    @property
    @pulumi.getter(name="withGrantOption")
    def with_grant_option(self) -> pulumi.Output[Optional[bool]]:
        """
        Specifies whether the grantee can grant the privileges to other users.
        """
        return pulumi.get(self, "with_grant_option")

