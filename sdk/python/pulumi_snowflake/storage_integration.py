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

__all__ = ['StorageIntegrationArgs', 'StorageIntegration']

@pulumi.input_type
class StorageIntegrationArgs:
    def __init__(__self__, *,
                 storage_allowed_locations: pulumi.Input[Sequence[pulumi.Input[_builtins.str]]],
                 storage_provider: pulumi.Input[_builtins.str],
                 azure_tenant_id: Optional[pulumi.Input[_builtins.str]] = None,
                 comment: Optional[pulumi.Input[_builtins.str]] = None,
                 enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 storage_aws_object_acl: Optional[pulumi.Input[_builtins.str]] = None,
                 storage_aws_role_arn: Optional[pulumi.Input[_builtins.str]] = None,
                 storage_blocked_locations: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 type: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a StorageIntegration resource.
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] storage_allowed_locations: Explicitly limits external stages that use the integration to reference one or more storage locations.
        :param pulumi.Input[_builtins.str] storage_provider: Specifies the storage provider for the integration. Valid options are: `S3` | `S3GOV` | `S3CHINA` | `GCS` | `AZURE`
        :param pulumi.Input[_builtins.str] azure_tenant_id: (Default: ``)
        :param pulumi.Input[_builtins.str] comment: (Default: ``)
        :param pulumi.Input[_builtins.bool] enabled: (Default: `true`)
        :param pulumi.Input[_builtins.str] storage_aws_object_acl: "bucket-owner-full-control" Enables support for AWS access control lists (ACLs) to grant the bucket owner full control.
        :param pulumi.Input[_builtins.str] storage_aws_role_arn: (Default: ``)
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] storage_blocked_locations: Explicitly prohibits external stages that use the integration from referencing one or more storage locations.
        :param pulumi.Input[_builtins.str] type: (Default: `EXTERNAL_STAGE`)
        """
        pulumi.set(__self__, "storage_allowed_locations", storage_allowed_locations)
        pulumi.set(__self__, "storage_provider", storage_provider)
        if azure_tenant_id is not None:
            pulumi.set(__self__, "azure_tenant_id", azure_tenant_id)
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if storage_aws_object_acl is not None:
            pulumi.set(__self__, "storage_aws_object_acl", storage_aws_object_acl)
        if storage_aws_role_arn is not None:
            pulumi.set(__self__, "storage_aws_role_arn", storage_aws_role_arn)
        if storage_blocked_locations is not None:
            pulumi.set(__self__, "storage_blocked_locations", storage_blocked_locations)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @_builtins.property
    @pulumi.getter(name="storageAllowedLocations")
    def storage_allowed_locations(self) -> pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]:
        """
        Explicitly limits external stages that use the integration to reference one or more storage locations.
        """
        return pulumi.get(self, "storage_allowed_locations")

    @storage_allowed_locations.setter
    def storage_allowed_locations(self, value: pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]):
        pulumi.set(self, "storage_allowed_locations", value)

    @_builtins.property
    @pulumi.getter(name="storageProvider")
    def storage_provider(self) -> pulumi.Input[_builtins.str]:
        """
        Specifies the storage provider for the integration. Valid options are: `S3` | `S3GOV` | `S3CHINA` | `GCS` | `AZURE`
        """
        return pulumi.get(self, "storage_provider")

    @storage_provider.setter
    def storage_provider(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "storage_provider", value)

    @_builtins.property
    @pulumi.getter(name="azureTenantId")
    def azure_tenant_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        (Default: ``)
        """
        return pulumi.get(self, "azure_tenant_id")

    @azure_tenant_id.setter
    def azure_tenant_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "azure_tenant_id", value)

    @_builtins.property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        (Default: ``)
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "comment", value)

    @_builtins.property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        (Default: `true`)
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "enabled", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="storageAwsObjectAcl")
    def storage_aws_object_acl(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        "bucket-owner-full-control" Enables support for AWS access control lists (ACLs) to grant the bucket owner full control.
        """
        return pulumi.get(self, "storage_aws_object_acl")

    @storage_aws_object_acl.setter
    def storage_aws_object_acl(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "storage_aws_object_acl", value)

    @_builtins.property
    @pulumi.getter(name="storageAwsRoleArn")
    def storage_aws_role_arn(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        (Default: ``)
        """
        return pulumi.get(self, "storage_aws_role_arn")

    @storage_aws_role_arn.setter
    def storage_aws_role_arn(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "storage_aws_role_arn", value)

    @_builtins.property
    @pulumi.getter(name="storageBlockedLocations")
    def storage_blocked_locations(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]:
        """
        Explicitly prohibits external stages that use the integration from referencing one or more storage locations.
        """
        return pulumi.get(self, "storage_blocked_locations")

    @storage_blocked_locations.setter
    def storage_blocked_locations(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "storage_blocked_locations", value)

    @_builtins.property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        (Default: `EXTERNAL_STAGE`)
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "type", value)


@pulumi.input_type
class _StorageIntegrationState:
    def __init__(__self__, *,
                 azure_consent_url: Optional[pulumi.Input[_builtins.str]] = None,
                 azure_multi_tenant_app_name: Optional[pulumi.Input[_builtins.str]] = None,
                 azure_tenant_id: Optional[pulumi.Input[_builtins.str]] = None,
                 comment: Optional[pulumi.Input[_builtins.str]] = None,
                 created_on: Optional[pulumi.Input[_builtins.str]] = None,
                 enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 fully_qualified_name: Optional[pulumi.Input[_builtins.str]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 storage_allowed_locations: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 storage_aws_external_id: Optional[pulumi.Input[_builtins.str]] = None,
                 storage_aws_iam_user_arn: Optional[pulumi.Input[_builtins.str]] = None,
                 storage_aws_object_acl: Optional[pulumi.Input[_builtins.str]] = None,
                 storage_aws_role_arn: Optional[pulumi.Input[_builtins.str]] = None,
                 storage_blocked_locations: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 storage_gcp_service_account: Optional[pulumi.Input[_builtins.str]] = None,
                 storage_provider: Optional[pulumi.Input[_builtins.str]] = None,
                 type: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering StorageIntegration resources.
        :param pulumi.Input[_builtins.str] azure_consent_url: The consent URL that is used to create an Azure Snowflake service principle inside your tenant.
        :param pulumi.Input[_builtins.str] azure_multi_tenant_app_name: This is the name of the Snowflake client application created for your account.
        :param pulumi.Input[_builtins.str] azure_tenant_id: (Default: ``)
        :param pulumi.Input[_builtins.str] comment: (Default: ``)
        :param pulumi.Input[_builtins.str] created_on: Date and time when the storage integration was created.
        :param pulumi.Input[_builtins.bool] enabled: (Default: `true`)
        :param pulumi.Input[_builtins.str] fully_qualified_name: Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] storage_allowed_locations: Explicitly limits external stages that use the integration to reference one or more storage locations.
        :param pulumi.Input[_builtins.str] storage_aws_external_id: The external ID that Snowflake will use when assuming the AWS role.
        :param pulumi.Input[_builtins.str] storage_aws_iam_user_arn: The Snowflake user that will attempt to assume the AWS role.
        :param pulumi.Input[_builtins.str] storage_aws_object_acl: "bucket-owner-full-control" Enables support for AWS access control lists (ACLs) to grant the bucket owner full control.
        :param pulumi.Input[_builtins.str] storage_aws_role_arn: (Default: ``)
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] storage_blocked_locations: Explicitly prohibits external stages that use the integration from referencing one or more storage locations.
        :param pulumi.Input[_builtins.str] storage_gcp_service_account: This is the name of the Snowflake Google Service Account created for your account.
        :param pulumi.Input[_builtins.str] storage_provider: Specifies the storage provider for the integration. Valid options are: `S3` | `S3GOV` | `S3CHINA` | `GCS` | `AZURE`
        :param pulumi.Input[_builtins.str] type: (Default: `EXTERNAL_STAGE`)
        """
        if azure_consent_url is not None:
            pulumi.set(__self__, "azure_consent_url", azure_consent_url)
        if azure_multi_tenant_app_name is not None:
            pulumi.set(__self__, "azure_multi_tenant_app_name", azure_multi_tenant_app_name)
        if azure_tenant_id is not None:
            pulumi.set(__self__, "azure_tenant_id", azure_tenant_id)
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if created_on is not None:
            pulumi.set(__self__, "created_on", created_on)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if fully_qualified_name is not None:
            pulumi.set(__self__, "fully_qualified_name", fully_qualified_name)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if storage_allowed_locations is not None:
            pulumi.set(__self__, "storage_allowed_locations", storage_allowed_locations)
        if storage_aws_external_id is not None:
            pulumi.set(__self__, "storage_aws_external_id", storage_aws_external_id)
        if storage_aws_iam_user_arn is not None:
            pulumi.set(__self__, "storage_aws_iam_user_arn", storage_aws_iam_user_arn)
        if storage_aws_object_acl is not None:
            pulumi.set(__self__, "storage_aws_object_acl", storage_aws_object_acl)
        if storage_aws_role_arn is not None:
            pulumi.set(__self__, "storage_aws_role_arn", storage_aws_role_arn)
        if storage_blocked_locations is not None:
            pulumi.set(__self__, "storage_blocked_locations", storage_blocked_locations)
        if storage_gcp_service_account is not None:
            pulumi.set(__self__, "storage_gcp_service_account", storage_gcp_service_account)
        if storage_provider is not None:
            pulumi.set(__self__, "storage_provider", storage_provider)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @_builtins.property
    @pulumi.getter(name="azureConsentUrl")
    def azure_consent_url(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The consent URL that is used to create an Azure Snowflake service principle inside your tenant.
        """
        return pulumi.get(self, "azure_consent_url")

    @azure_consent_url.setter
    def azure_consent_url(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "azure_consent_url", value)

    @_builtins.property
    @pulumi.getter(name="azureMultiTenantAppName")
    def azure_multi_tenant_app_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        This is the name of the Snowflake client application created for your account.
        """
        return pulumi.get(self, "azure_multi_tenant_app_name")

    @azure_multi_tenant_app_name.setter
    def azure_multi_tenant_app_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "azure_multi_tenant_app_name", value)

    @_builtins.property
    @pulumi.getter(name="azureTenantId")
    def azure_tenant_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        (Default: ``)
        """
        return pulumi.get(self, "azure_tenant_id")

    @azure_tenant_id.setter
    def azure_tenant_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "azure_tenant_id", value)

    @_builtins.property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        (Default: ``)
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "comment", value)

    @_builtins.property
    @pulumi.getter(name="createdOn")
    def created_on(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Date and time when the storage integration was created.
        """
        return pulumi.get(self, "created_on")

    @created_on.setter
    def created_on(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "created_on", value)

    @_builtins.property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        (Default: `true`)
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "enabled", value)

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
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter(name="storageAllowedLocations")
    def storage_allowed_locations(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]:
        """
        Explicitly limits external stages that use the integration to reference one or more storage locations.
        """
        return pulumi.get(self, "storage_allowed_locations")

    @storage_allowed_locations.setter
    def storage_allowed_locations(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "storage_allowed_locations", value)

    @_builtins.property
    @pulumi.getter(name="storageAwsExternalId")
    def storage_aws_external_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The external ID that Snowflake will use when assuming the AWS role.
        """
        return pulumi.get(self, "storage_aws_external_id")

    @storage_aws_external_id.setter
    def storage_aws_external_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "storage_aws_external_id", value)

    @_builtins.property
    @pulumi.getter(name="storageAwsIamUserArn")
    def storage_aws_iam_user_arn(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The Snowflake user that will attempt to assume the AWS role.
        """
        return pulumi.get(self, "storage_aws_iam_user_arn")

    @storage_aws_iam_user_arn.setter
    def storage_aws_iam_user_arn(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "storage_aws_iam_user_arn", value)

    @_builtins.property
    @pulumi.getter(name="storageAwsObjectAcl")
    def storage_aws_object_acl(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        "bucket-owner-full-control" Enables support for AWS access control lists (ACLs) to grant the bucket owner full control.
        """
        return pulumi.get(self, "storage_aws_object_acl")

    @storage_aws_object_acl.setter
    def storage_aws_object_acl(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "storage_aws_object_acl", value)

    @_builtins.property
    @pulumi.getter(name="storageAwsRoleArn")
    def storage_aws_role_arn(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        (Default: ``)
        """
        return pulumi.get(self, "storage_aws_role_arn")

    @storage_aws_role_arn.setter
    def storage_aws_role_arn(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "storage_aws_role_arn", value)

    @_builtins.property
    @pulumi.getter(name="storageBlockedLocations")
    def storage_blocked_locations(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]:
        """
        Explicitly prohibits external stages that use the integration from referencing one or more storage locations.
        """
        return pulumi.get(self, "storage_blocked_locations")

    @storage_blocked_locations.setter
    def storage_blocked_locations(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "storage_blocked_locations", value)

    @_builtins.property
    @pulumi.getter(name="storageGcpServiceAccount")
    def storage_gcp_service_account(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        This is the name of the Snowflake Google Service Account created for your account.
        """
        return pulumi.get(self, "storage_gcp_service_account")

    @storage_gcp_service_account.setter
    def storage_gcp_service_account(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "storage_gcp_service_account", value)

    @_builtins.property
    @pulumi.getter(name="storageProvider")
    def storage_provider(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Specifies the storage provider for the integration. Valid options are: `S3` | `S3GOV` | `S3CHINA` | `GCS` | `AZURE`
        """
        return pulumi.get(self, "storage_provider")

    @storage_provider.setter
    def storage_provider(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "storage_provider", value)

    @_builtins.property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        (Default: `EXTERNAL_STAGE`)
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "type", value)


@pulumi.type_token("snowflake:index/storageIntegration:StorageIntegration")
class StorageIntegration(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 azure_tenant_id: Optional[pulumi.Input[_builtins.str]] = None,
                 comment: Optional[pulumi.Input[_builtins.str]] = None,
                 enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 storage_allowed_locations: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 storage_aws_object_acl: Optional[pulumi.Input[_builtins.str]] = None,
                 storage_aws_role_arn: Optional[pulumi.Input[_builtins.str]] = None,
                 storage_blocked_locations: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 storage_provider: Optional[pulumi.Input[_builtins.str]] = None,
                 type: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        ## Import

        ```sh
        $ pulumi import snowflake:index/storageIntegration:StorageIntegration example name
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] azure_tenant_id: (Default: ``)
        :param pulumi.Input[_builtins.str] comment: (Default: ``)
        :param pulumi.Input[_builtins.bool] enabled: (Default: `true`)
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] storage_allowed_locations: Explicitly limits external stages that use the integration to reference one or more storage locations.
        :param pulumi.Input[_builtins.str] storage_aws_object_acl: "bucket-owner-full-control" Enables support for AWS access control lists (ACLs) to grant the bucket owner full control.
        :param pulumi.Input[_builtins.str] storage_aws_role_arn: (Default: ``)
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] storage_blocked_locations: Explicitly prohibits external stages that use the integration from referencing one or more storage locations.
        :param pulumi.Input[_builtins.str] storage_provider: Specifies the storage provider for the integration. Valid options are: `S3` | `S3GOV` | `S3CHINA` | `GCS` | `AZURE`
        :param pulumi.Input[_builtins.str] type: (Default: `EXTERNAL_STAGE`)
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: StorageIntegrationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Import

        ```sh
        $ pulumi import snowflake:index/storageIntegration:StorageIntegration example name
        ```

        :param str resource_name: The name of the resource.
        :param StorageIntegrationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(StorageIntegrationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 azure_tenant_id: Optional[pulumi.Input[_builtins.str]] = None,
                 comment: Optional[pulumi.Input[_builtins.str]] = None,
                 enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 storage_allowed_locations: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 storage_aws_object_acl: Optional[pulumi.Input[_builtins.str]] = None,
                 storage_aws_role_arn: Optional[pulumi.Input[_builtins.str]] = None,
                 storage_blocked_locations: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 storage_provider: Optional[pulumi.Input[_builtins.str]] = None,
                 type: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = StorageIntegrationArgs.__new__(StorageIntegrationArgs)

            __props__.__dict__["azure_tenant_id"] = azure_tenant_id
            __props__.__dict__["comment"] = comment
            __props__.__dict__["enabled"] = enabled
            __props__.__dict__["name"] = name
            if storage_allowed_locations is None and not opts.urn:
                raise TypeError("Missing required property 'storage_allowed_locations'")
            __props__.__dict__["storage_allowed_locations"] = storage_allowed_locations
            __props__.__dict__["storage_aws_object_acl"] = storage_aws_object_acl
            __props__.__dict__["storage_aws_role_arn"] = storage_aws_role_arn
            __props__.__dict__["storage_blocked_locations"] = storage_blocked_locations
            if storage_provider is None and not opts.urn:
                raise TypeError("Missing required property 'storage_provider'")
            __props__.__dict__["storage_provider"] = storage_provider
            __props__.__dict__["type"] = type
            __props__.__dict__["azure_consent_url"] = None
            __props__.__dict__["azure_multi_tenant_app_name"] = None
            __props__.__dict__["created_on"] = None
            __props__.__dict__["fully_qualified_name"] = None
            __props__.__dict__["storage_aws_external_id"] = None
            __props__.__dict__["storage_aws_iam_user_arn"] = None
            __props__.__dict__["storage_gcp_service_account"] = None
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["azureConsentUrl"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(StorageIntegration, __self__).__init__(
            'snowflake:index/storageIntegration:StorageIntegration',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            azure_consent_url: Optional[pulumi.Input[_builtins.str]] = None,
            azure_multi_tenant_app_name: Optional[pulumi.Input[_builtins.str]] = None,
            azure_tenant_id: Optional[pulumi.Input[_builtins.str]] = None,
            comment: Optional[pulumi.Input[_builtins.str]] = None,
            created_on: Optional[pulumi.Input[_builtins.str]] = None,
            enabled: Optional[pulumi.Input[_builtins.bool]] = None,
            fully_qualified_name: Optional[pulumi.Input[_builtins.str]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            storage_allowed_locations: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
            storage_aws_external_id: Optional[pulumi.Input[_builtins.str]] = None,
            storage_aws_iam_user_arn: Optional[pulumi.Input[_builtins.str]] = None,
            storage_aws_object_acl: Optional[pulumi.Input[_builtins.str]] = None,
            storage_aws_role_arn: Optional[pulumi.Input[_builtins.str]] = None,
            storage_blocked_locations: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
            storage_gcp_service_account: Optional[pulumi.Input[_builtins.str]] = None,
            storage_provider: Optional[pulumi.Input[_builtins.str]] = None,
            type: Optional[pulumi.Input[_builtins.str]] = None) -> 'StorageIntegration':
        """
        Get an existing StorageIntegration resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] azure_consent_url: The consent URL that is used to create an Azure Snowflake service principle inside your tenant.
        :param pulumi.Input[_builtins.str] azure_multi_tenant_app_name: This is the name of the Snowflake client application created for your account.
        :param pulumi.Input[_builtins.str] azure_tenant_id: (Default: ``)
        :param pulumi.Input[_builtins.str] comment: (Default: ``)
        :param pulumi.Input[_builtins.str] created_on: Date and time when the storage integration was created.
        :param pulumi.Input[_builtins.bool] enabled: (Default: `true`)
        :param pulumi.Input[_builtins.str] fully_qualified_name: Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] storage_allowed_locations: Explicitly limits external stages that use the integration to reference one or more storage locations.
        :param pulumi.Input[_builtins.str] storage_aws_external_id: The external ID that Snowflake will use when assuming the AWS role.
        :param pulumi.Input[_builtins.str] storage_aws_iam_user_arn: The Snowflake user that will attempt to assume the AWS role.
        :param pulumi.Input[_builtins.str] storage_aws_object_acl: "bucket-owner-full-control" Enables support for AWS access control lists (ACLs) to grant the bucket owner full control.
        :param pulumi.Input[_builtins.str] storage_aws_role_arn: (Default: ``)
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] storage_blocked_locations: Explicitly prohibits external stages that use the integration from referencing one or more storage locations.
        :param pulumi.Input[_builtins.str] storage_gcp_service_account: This is the name of the Snowflake Google Service Account created for your account.
        :param pulumi.Input[_builtins.str] storage_provider: Specifies the storage provider for the integration. Valid options are: `S3` | `S3GOV` | `S3CHINA` | `GCS` | `AZURE`
        :param pulumi.Input[_builtins.str] type: (Default: `EXTERNAL_STAGE`)
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _StorageIntegrationState.__new__(_StorageIntegrationState)

        __props__.__dict__["azure_consent_url"] = azure_consent_url
        __props__.__dict__["azure_multi_tenant_app_name"] = azure_multi_tenant_app_name
        __props__.__dict__["azure_tenant_id"] = azure_tenant_id
        __props__.__dict__["comment"] = comment
        __props__.__dict__["created_on"] = created_on
        __props__.__dict__["enabled"] = enabled
        __props__.__dict__["fully_qualified_name"] = fully_qualified_name
        __props__.__dict__["name"] = name
        __props__.__dict__["storage_allowed_locations"] = storage_allowed_locations
        __props__.__dict__["storage_aws_external_id"] = storage_aws_external_id
        __props__.__dict__["storage_aws_iam_user_arn"] = storage_aws_iam_user_arn
        __props__.__dict__["storage_aws_object_acl"] = storage_aws_object_acl
        __props__.__dict__["storage_aws_role_arn"] = storage_aws_role_arn
        __props__.__dict__["storage_blocked_locations"] = storage_blocked_locations
        __props__.__dict__["storage_gcp_service_account"] = storage_gcp_service_account
        __props__.__dict__["storage_provider"] = storage_provider
        __props__.__dict__["type"] = type
        return StorageIntegration(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="azureConsentUrl")
    def azure_consent_url(self) -> pulumi.Output[_builtins.str]:
        """
        The consent URL that is used to create an Azure Snowflake service principle inside your tenant.
        """
        return pulumi.get(self, "azure_consent_url")

    @_builtins.property
    @pulumi.getter(name="azureMultiTenantAppName")
    def azure_multi_tenant_app_name(self) -> pulumi.Output[_builtins.str]:
        """
        This is the name of the Snowflake client application created for your account.
        """
        return pulumi.get(self, "azure_multi_tenant_app_name")

    @_builtins.property
    @pulumi.getter(name="azureTenantId")
    def azure_tenant_id(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        (Default: ``)
        """
        return pulumi.get(self, "azure_tenant_id")

    @_builtins.property
    @pulumi.getter
    def comment(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        (Default: ``)
        """
        return pulumi.get(self, "comment")

    @_builtins.property
    @pulumi.getter(name="createdOn")
    def created_on(self) -> pulumi.Output[_builtins.str]:
        """
        Date and time when the storage integration was created.
        """
        return pulumi.get(self, "created_on")

    @_builtins.property
    @pulumi.getter
    def enabled(self) -> pulumi.Output[Optional[_builtins.bool]]:
        """
        (Default: `true`)
        """
        return pulumi.get(self, "enabled")

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
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter(name="storageAllowedLocations")
    def storage_allowed_locations(self) -> pulumi.Output[Sequence[_builtins.str]]:
        """
        Explicitly limits external stages that use the integration to reference one or more storage locations.
        """
        return pulumi.get(self, "storage_allowed_locations")

    @_builtins.property
    @pulumi.getter(name="storageAwsExternalId")
    def storage_aws_external_id(self) -> pulumi.Output[_builtins.str]:
        """
        The external ID that Snowflake will use when assuming the AWS role.
        """
        return pulumi.get(self, "storage_aws_external_id")

    @_builtins.property
    @pulumi.getter(name="storageAwsIamUserArn")
    def storage_aws_iam_user_arn(self) -> pulumi.Output[_builtins.str]:
        """
        The Snowflake user that will attempt to assume the AWS role.
        """
        return pulumi.get(self, "storage_aws_iam_user_arn")

    @_builtins.property
    @pulumi.getter(name="storageAwsObjectAcl")
    def storage_aws_object_acl(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        "bucket-owner-full-control" Enables support for AWS access control lists (ACLs) to grant the bucket owner full control.
        """
        return pulumi.get(self, "storage_aws_object_acl")

    @_builtins.property
    @pulumi.getter(name="storageAwsRoleArn")
    def storage_aws_role_arn(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        (Default: ``)
        """
        return pulumi.get(self, "storage_aws_role_arn")

    @_builtins.property
    @pulumi.getter(name="storageBlockedLocations")
    def storage_blocked_locations(self) -> pulumi.Output[Optional[Sequence[_builtins.str]]]:
        """
        Explicitly prohibits external stages that use the integration from referencing one or more storage locations.
        """
        return pulumi.get(self, "storage_blocked_locations")

    @_builtins.property
    @pulumi.getter(name="storageGcpServiceAccount")
    def storage_gcp_service_account(self) -> pulumi.Output[_builtins.str]:
        """
        This is the name of the Snowflake Google Service Account created for your account.
        """
        return pulumi.get(self, "storage_gcp_service_account")

    @_builtins.property
    @pulumi.getter(name="storageProvider")
    def storage_provider(self) -> pulumi.Output[_builtins.str]:
        """
        Specifies the storage provider for the integration. Valid options are: `S3` | `S3GOV` | `S3CHINA` | `GCS` | `AZURE`
        """
        return pulumi.get(self, "storage_provider")

    @_builtins.property
    @pulumi.getter
    def type(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        (Default: `EXTERNAL_STAGE`)
        """
        return pulumi.get(self, "type")

