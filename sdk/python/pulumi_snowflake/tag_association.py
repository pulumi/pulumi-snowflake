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

__all__ = ['TagAssociationArgs', 'TagAssociation']

@pulumi.input_type
class TagAssociationArgs:
    def __init__(__self__, *,
                 object_identifiers: pulumi.Input[Sequence[pulumi.Input['TagAssociationObjectIdentifierArgs']]],
                 object_type: pulumi.Input[str],
                 tag_id: pulumi.Input[str],
                 tag_value: pulumi.Input[str],
                 object_name: Optional[pulumi.Input[str]] = None,
                 skip_validation: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a TagAssociation resource.
        :param pulumi.Input[Sequence[pulumi.Input['TagAssociationObjectIdentifierArgs']]] object_identifiers: Specifies the object identifier for the tag association.
        :param pulumi.Input[str] object_type: Specifies the type of object to add a tag. Allowed object types: [ACCOUNT APPLICATION APPLICATION PACKAGE DATABASE FAILOVER GROUP INTEGRATION NETWORK POLICY REPLICATION GROUP ROLE SHARE USER WAREHOUSE DATABASE ROLE SCHEMA ALERT SNOWFLAKE.CORE.BUDGET SNOWFLAKE.ML.CLASSIFICATION EXTERNAL FUNCTION EXTERNAL TABLE FUNCTION GIT REPOSITORY ICEBERG TABLE MATERIALIZED VIEW PIPE MASKING POLICY PASSWORD POLICY ROW ACCESS POLICY SESSION POLICY PRIVACY POLICY PROCEDURE STAGE STREAM TABLE TASK VIEW COLUMN EVENT TABLE].
        :param pulumi.Input[str] tag_id: Specifies the identifier for the tag. Note: format must follow: "databaseName"."schemaName"."tagName" or "databaseName.schemaName.tagName" or "databaseName|schemaName.tagName" (snowflake_tag.tag.id)
        :param pulumi.Input[str] tag_value: Specifies the value of the tag, (e.g. 'finance' or 'engineering')
        :param pulumi.Input[str] object_name: Specifies the object identifier for the tag association.
        :param pulumi.Input[bool] skip_validation: If true, skips validation of the tag association.
        """
        pulumi.set(__self__, "object_identifiers", object_identifiers)
        pulumi.set(__self__, "object_type", object_type)
        pulumi.set(__self__, "tag_id", tag_id)
        pulumi.set(__self__, "tag_value", tag_value)
        if object_name is not None:
            warnings.warn("""Use `object_identifier` instead""", DeprecationWarning)
            pulumi.log.warn("""object_name is deprecated: Use `object_identifier` instead""")
        if object_name is not None:
            pulumi.set(__self__, "object_name", object_name)
        if skip_validation is not None:
            pulumi.set(__self__, "skip_validation", skip_validation)

    @property
    @pulumi.getter(name="objectIdentifiers")
    def object_identifiers(self) -> pulumi.Input[Sequence[pulumi.Input['TagAssociationObjectIdentifierArgs']]]:
        """
        Specifies the object identifier for the tag association.
        """
        return pulumi.get(self, "object_identifiers")

    @object_identifiers.setter
    def object_identifiers(self, value: pulumi.Input[Sequence[pulumi.Input['TagAssociationObjectIdentifierArgs']]]):
        pulumi.set(self, "object_identifiers", value)

    @property
    @pulumi.getter(name="objectType")
    def object_type(self) -> pulumi.Input[str]:
        """
        Specifies the type of object to add a tag. Allowed object types: [ACCOUNT APPLICATION APPLICATION PACKAGE DATABASE FAILOVER GROUP INTEGRATION NETWORK POLICY REPLICATION GROUP ROLE SHARE USER WAREHOUSE DATABASE ROLE SCHEMA ALERT SNOWFLAKE.CORE.BUDGET SNOWFLAKE.ML.CLASSIFICATION EXTERNAL FUNCTION EXTERNAL TABLE FUNCTION GIT REPOSITORY ICEBERG TABLE MATERIALIZED VIEW PIPE MASKING POLICY PASSWORD POLICY ROW ACCESS POLICY SESSION POLICY PRIVACY POLICY PROCEDURE STAGE STREAM TABLE TASK VIEW COLUMN EVENT TABLE].
        """
        return pulumi.get(self, "object_type")

    @object_type.setter
    def object_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "object_type", value)

    @property
    @pulumi.getter(name="tagId")
    def tag_id(self) -> pulumi.Input[str]:
        """
        Specifies the identifier for the tag. Note: format must follow: "databaseName"."schemaName"."tagName" or "databaseName.schemaName.tagName" or "databaseName|schemaName.tagName" (snowflake_tag.tag.id)
        """
        return pulumi.get(self, "tag_id")

    @tag_id.setter
    def tag_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "tag_id", value)

    @property
    @pulumi.getter(name="tagValue")
    def tag_value(self) -> pulumi.Input[str]:
        """
        Specifies the value of the tag, (e.g. 'finance' or 'engineering')
        """
        return pulumi.get(self, "tag_value")

    @tag_value.setter
    def tag_value(self, value: pulumi.Input[str]):
        pulumi.set(self, "tag_value", value)

    @property
    @pulumi.getter(name="objectName")
    @_utilities.deprecated("""Use `object_identifier` instead""")
    def object_name(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the object identifier for the tag association.
        """
        return pulumi.get(self, "object_name")

    @object_name.setter
    def object_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "object_name", value)

    @property
    @pulumi.getter(name="skipValidation")
    def skip_validation(self) -> Optional[pulumi.Input[bool]]:
        """
        If true, skips validation of the tag association.
        """
        return pulumi.get(self, "skip_validation")

    @skip_validation.setter
    def skip_validation(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "skip_validation", value)


@pulumi.input_type
class _TagAssociationState:
    def __init__(__self__, *,
                 object_identifiers: Optional[pulumi.Input[Sequence[pulumi.Input['TagAssociationObjectIdentifierArgs']]]] = None,
                 object_name: Optional[pulumi.Input[str]] = None,
                 object_type: Optional[pulumi.Input[str]] = None,
                 skip_validation: Optional[pulumi.Input[bool]] = None,
                 tag_id: Optional[pulumi.Input[str]] = None,
                 tag_value: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering TagAssociation resources.
        :param pulumi.Input[Sequence[pulumi.Input['TagAssociationObjectIdentifierArgs']]] object_identifiers: Specifies the object identifier for the tag association.
        :param pulumi.Input[str] object_name: Specifies the object identifier for the tag association.
        :param pulumi.Input[str] object_type: Specifies the type of object to add a tag. Allowed object types: [ACCOUNT APPLICATION APPLICATION PACKAGE DATABASE FAILOVER GROUP INTEGRATION NETWORK POLICY REPLICATION GROUP ROLE SHARE USER WAREHOUSE DATABASE ROLE SCHEMA ALERT SNOWFLAKE.CORE.BUDGET SNOWFLAKE.ML.CLASSIFICATION EXTERNAL FUNCTION EXTERNAL TABLE FUNCTION GIT REPOSITORY ICEBERG TABLE MATERIALIZED VIEW PIPE MASKING POLICY PASSWORD POLICY ROW ACCESS POLICY SESSION POLICY PRIVACY POLICY PROCEDURE STAGE STREAM TABLE TASK VIEW COLUMN EVENT TABLE].
        :param pulumi.Input[bool] skip_validation: If true, skips validation of the tag association.
        :param pulumi.Input[str] tag_id: Specifies the identifier for the tag. Note: format must follow: "databaseName"."schemaName"."tagName" or "databaseName.schemaName.tagName" or "databaseName|schemaName.tagName" (snowflake_tag.tag.id)
        :param pulumi.Input[str] tag_value: Specifies the value of the tag, (e.g. 'finance' or 'engineering')
        """
        if object_identifiers is not None:
            pulumi.set(__self__, "object_identifiers", object_identifiers)
        if object_name is not None:
            warnings.warn("""Use `object_identifier` instead""", DeprecationWarning)
            pulumi.log.warn("""object_name is deprecated: Use `object_identifier` instead""")
        if object_name is not None:
            pulumi.set(__self__, "object_name", object_name)
        if object_type is not None:
            pulumi.set(__self__, "object_type", object_type)
        if skip_validation is not None:
            pulumi.set(__self__, "skip_validation", skip_validation)
        if tag_id is not None:
            pulumi.set(__self__, "tag_id", tag_id)
        if tag_value is not None:
            pulumi.set(__self__, "tag_value", tag_value)

    @property
    @pulumi.getter(name="objectIdentifiers")
    def object_identifiers(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['TagAssociationObjectIdentifierArgs']]]]:
        """
        Specifies the object identifier for the tag association.
        """
        return pulumi.get(self, "object_identifiers")

    @object_identifiers.setter
    def object_identifiers(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['TagAssociationObjectIdentifierArgs']]]]):
        pulumi.set(self, "object_identifiers", value)

    @property
    @pulumi.getter(name="objectName")
    @_utilities.deprecated("""Use `object_identifier` instead""")
    def object_name(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the object identifier for the tag association.
        """
        return pulumi.get(self, "object_name")

    @object_name.setter
    def object_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "object_name", value)

    @property
    @pulumi.getter(name="objectType")
    def object_type(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the type of object to add a tag. Allowed object types: [ACCOUNT APPLICATION APPLICATION PACKAGE DATABASE FAILOVER GROUP INTEGRATION NETWORK POLICY REPLICATION GROUP ROLE SHARE USER WAREHOUSE DATABASE ROLE SCHEMA ALERT SNOWFLAKE.CORE.BUDGET SNOWFLAKE.ML.CLASSIFICATION EXTERNAL FUNCTION EXTERNAL TABLE FUNCTION GIT REPOSITORY ICEBERG TABLE MATERIALIZED VIEW PIPE MASKING POLICY PASSWORD POLICY ROW ACCESS POLICY SESSION POLICY PRIVACY POLICY PROCEDURE STAGE STREAM TABLE TASK VIEW COLUMN EVENT TABLE].
        """
        return pulumi.get(self, "object_type")

    @object_type.setter
    def object_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "object_type", value)

    @property
    @pulumi.getter(name="skipValidation")
    def skip_validation(self) -> Optional[pulumi.Input[bool]]:
        """
        If true, skips validation of the tag association.
        """
        return pulumi.get(self, "skip_validation")

    @skip_validation.setter
    def skip_validation(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "skip_validation", value)

    @property
    @pulumi.getter(name="tagId")
    def tag_id(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the identifier for the tag. Note: format must follow: "databaseName"."schemaName"."tagName" or "databaseName.schemaName.tagName" or "databaseName|schemaName.tagName" (snowflake_tag.tag.id)
        """
        return pulumi.get(self, "tag_id")

    @tag_id.setter
    def tag_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "tag_id", value)

    @property
    @pulumi.getter(name="tagValue")
    def tag_value(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the value of the tag, (e.g. 'finance' or 'engineering')
        """
        return pulumi.get(self, "tag_value")

    @tag_value.setter
    def tag_value(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "tag_value", value)


class TagAssociation(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 object_identifiers: Optional[pulumi.Input[Sequence[pulumi.Input[Union['TagAssociationObjectIdentifierArgs', 'TagAssociationObjectIdentifierArgsDict']]]]] = None,
                 object_name: Optional[pulumi.Input[str]] = None,
                 object_type: Optional[pulumi.Input[str]] = None,
                 skip_validation: Optional[pulumi.Input[bool]] = None,
                 tag_id: Optional[pulumi.Input[str]] = None,
                 tag_value: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ## Import

        format is dbName.schemaName.tagName or dbName.schemaName.tagName

        ```sh
        $ pulumi import snowflake:index/tagAssociation:TagAssociation example 'dbName.schemaName.tagName'
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[Union['TagAssociationObjectIdentifierArgs', 'TagAssociationObjectIdentifierArgsDict']]]] object_identifiers: Specifies the object identifier for the tag association.
        :param pulumi.Input[str] object_name: Specifies the object identifier for the tag association.
        :param pulumi.Input[str] object_type: Specifies the type of object to add a tag. Allowed object types: [ACCOUNT APPLICATION APPLICATION PACKAGE DATABASE FAILOVER GROUP INTEGRATION NETWORK POLICY REPLICATION GROUP ROLE SHARE USER WAREHOUSE DATABASE ROLE SCHEMA ALERT SNOWFLAKE.CORE.BUDGET SNOWFLAKE.ML.CLASSIFICATION EXTERNAL FUNCTION EXTERNAL TABLE FUNCTION GIT REPOSITORY ICEBERG TABLE MATERIALIZED VIEW PIPE MASKING POLICY PASSWORD POLICY ROW ACCESS POLICY SESSION POLICY PRIVACY POLICY PROCEDURE STAGE STREAM TABLE TASK VIEW COLUMN EVENT TABLE].
        :param pulumi.Input[bool] skip_validation: If true, skips validation of the tag association.
        :param pulumi.Input[str] tag_id: Specifies the identifier for the tag. Note: format must follow: "databaseName"."schemaName"."tagName" or "databaseName.schemaName.tagName" or "databaseName|schemaName.tagName" (snowflake_tag.tag.id)
        :param pulumi.Input[str] tag_value: Specifies the value of the tag, (e.g. 'finance' or 'engineering')
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: TagAssociationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Import

        format is dbName.schemaName.tagName or dbName.schemaName.tagName

        ```sh
        $ pulumi import snowflake:index/tagAssociation:TagAssociation example 'dbName.schemaName.tagName'
        ```

        :param str resource_name: The name of the resource.
        :param TagAssociationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(TagAssociationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 object_identifiers: Optional[pulumi.Input[Sequence[pulumi.Input[Union['TagAssociationObjectIdentifierArgs', 'TagAssociationObjectIdentifierArgsDict']]]]] = None,
                 object_name: Optional[pulumi.Input[str]] = None,
                 object_type: Optional[pulumi.Input[str]] = None,
                 skip_validation: Optional[pulumi.Input[bool]] = None,
                 tag_id: Optional[pulumi.Input[str]] = None,
                 tag_value: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = TagAssociationArgs.__new__(TagAssociationArgs)

            if object_identifiers is None and not opts.urn:
                raise TypeError("Missing required property 'object_identifiers'")
            __props__.__dict__["object_identifiers"] = object_identifiers
            __props__.__dict__["object_name"] = object_name
            if object_type is None and not opts.urn:
                raise TypeError("Missing required property 'object_type'")
            __props__.__dict__["object_type"] = object_type
            __props__.__dict__["skip_validation"] = skip_validation
            if tag_id is None and not opts.urn:
                raise TypeError("Missing required property 'tag_id'")
            __props__.__dict__["tag_id"] = tag_id
            if tag_value is None and not opts.urn:
                raise TypeError("Missing required property 'tag_value'")
            __props__.__dict__["tag_value"] = tag_value
        super(TagAssociation, __self__).__init__(
            'snowflake:index/tagAssociation:TagAssociation',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            object_identifiers: Optional[pulumi.Input[Sequence[pulumi.Input[Union['TagAssociationObjectIdentifierArgs', 'TagAssociationObjectIdentifierArgsDict']]]]] = None,
            object_name: Optional[pulumi.Input[str]] = None,
            object_type: Optional[pulumi.Input[str]] = None,
            skip_validation: Optional[pulumi.Input[bool]] = None,
            tag_id: Optional[pulumi.Input[str]] = None,
            tag_value: Optional[pulumi.Input[str]] = None) -> 'TagAssociation':
        """
        Get an existing TagAssociation resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[Union['TagAssociationObjectIdentifierArgs', 'TagAssociationObjectIdentifierArgsDict']]]] object_identifiers: Specifies the object identifier for the tag association.
        :param pulumi.Input[str] object_name: Specifies the object identifier for the tag association.
        :param pulumi.Input[str] object_type: Specifies the type of object to add a tag. Allowed object types: [ACCOUNT APPLICATION APPLICATION PACKAGE DATABASE FAILOVER GROUP INTEGRATION NETWORK POLICY REPLICATION GROUP ROLE SHARE USER WAREHOUSE DATABASE ROLE SCHEMA ALERT SNOWFLAKE.CORE.BUDGET SNOWFLAKE.ML.CLASSIFICATION EXTERNAL FUNCTION EXTERNAL TABLE FUNCTION GIT REPOSITORY ICEBERG TABLE MATERIALIZED VIEW PIPE MASKING POLICY PASSWORD POLICY ROW ACCESS POLICY SESSION POLICY PRIVACY POLICY PROCEDURE STAGE STREAM TABLE TASK VIEW COLUMN EVENT TABLE].
        :param pulumi.Input[bool] skip_validation: If true, skips validation of the tag association.
        :param pulumi.Input[str] tag_id: Specifies the identifier for the tag. Note: format must follow: "databaseName"."schemaName"."tagName" or "databaseName.schemaName.tagName" or "databaseName|schemaName.tagName" (snowflake_tag.tag.id)
        :param pulumi.Input[str] tag_value: Specifies the value of the tag, (e.g. 'finance' or 'engineering')
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _TagAssociationState.__new__(_TagAssociationState)

        __props__.__dict__["object_identifiers"] = object_identifiers
        __props__.__dict__["object_name"] = object_name
        __props__.__dict__["object_type"] = object_type
        __props__.__dict__["skip_validation"] = skip_validation
        __props__.__dict__["tag_id"] = tag_id
        __props__.__dict__["tag_value"] = tag_value
        return TagAssociation(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="objectIdentifiers")
    def object_identifiers(self) -> pulumi.Output[Sequence['outputs.TagAssociationObjectIdentifier']]:
        """
        Specifies the object identifier for the tag association.
        """
        return pulumi.get(self, "object_identifiers")

    @property
    @pulumi.getter(name="objectName")
    @_utilities.deprecated("""Use `object_identifier` instead""")
    def object_name(self) -> pulumi.Output[Optional[str]]:
        """
        Specifies the object identifier for the tag association.
        """
        return pulumi.get(self, "object_name")

    @property
    @pulumi.getter(name="objectType")
    def object_type(self) -> pulumi.Output[str]:
        """
        Specifies the type of object to add a tag. Allowed object types: [ACCOUNT APPLICATION APPLICATION PACKAGE DATABASE FAILOVER GROUP INTEGRATION NETWORK POLICY REPLICATION GROUP ROLE SHARE USER WAREHOUSE DATABASE ROLE SCHEMA ALERT SNOWFLAKE.CORE.BUDGET SNOWFLAKE.ML.CLASSIFICATION EXTERNAL FUNCTION EXTERNAL TABLE FUNCTION GIT REPOSITORY ICEBERG TABLE MATERIALIZED VIEW PIPE MASKING POLICY PASSWORD POLICY ROW ACCESS POLICY SESSION POLICY PRIVACY POLICY PROCEDURE STAGE STREAM TABLE TASK VIEW COLUMN EVENT TABLE].
        """
        return pulumi.get(self, "object_type")

    @property
    @pulumi.getter(name="skipValidation")
    def skip_validation(self) -> pulumi.Output[Optional[bool]]:
        """
        If true, skips validation of the tag association.
        """
        return pulumi.get(self, "skip_validation")

    @property
    @pulumi.getter(name="tagId")
    def tag_id(self) -> pulumi.Output[str]:
        """
        Specifies the identifier for the tag. Note: format must follow: "databaseName"."schemaName"."tagName" or "databaseName.schemaName.tagName" or "databaseName|schemaName.tagName" (snowflake_tag.tag.id)
        """
        return pulumi.get(self, "tag_id")

    @property
    @pulumi.getter(name="tagValue")
    def tag_value(self) -> pulumi.Output[str]:
        """
        Specifies the value of the tag, (e.g. 'finance' or 'engineering')
        """
        return pulumi.get(self, "tag_value")

