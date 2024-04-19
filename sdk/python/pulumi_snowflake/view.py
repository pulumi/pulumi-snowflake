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

__all__ = ['ViewArgs', 'View']

@pulumi.input_type
class ViewArgs:
    def __init__(__self__, *,
                 database: pulumi.Input[str],
                 schema: pulumi.Input[str],
                 statement: pulumi.Input[str],
                 comment: Optional[pulumi.Input[str]] = None,
                 copy_grants: Optional[pulumi.Input[bool]] = None,
                 is_secure: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 or_replace: Optional[pulumi.Input[bool]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input['ViewTagArgs']]]] = None):
        """
        The set of arguments for constructing a View resource.
        :param pulumi.Input[str] database: Name of the database that the tag was created in.
        :param pulumi.Input[str] schema: Name of the schema that the tag was created in.
        :param pulumi.Input[str] statement: Specifies the query used to create the view.
        :param pulumi.Input[str] comment: Specifies a comment for the view.
        :param pulumi.Input[bool] copy_grants: Retains the access permissions from the original view when a new view is created using the OR REPLACE clause. OR REPLACE must be set when COPY GRANTS is set.
        :param pulumi.Input[bool] is_secure: Specifies that the view is secure. By design, the Snowflake's `SHOW VIEWS` command does not provide information about
               secure views (consult [view usage notes](https://docs.snowflake.com/en/sql-reference/sql/create-view#usage-notes)) which
               is essential to manage/import view with Terraform. Use the role owning the view while managing secure views.
        :param pulumi.Input[str] name: Tag name, e.g. department.
        :param pulumi.Input[bool] or_replace: Overwrites the View if it exists.
        :param pulumi.Input[Sequence[pulumi.Input['ViewTagArgs']]] tags: Definitions of a tag to associate with the resource.
        """
        pulumi.set(__self__, "database", database)
        pulumi.set(__self__, "schema", schema)
        pulumi.set(__self__, "statement", statement)
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if copy_grants is not None:
            pulumi.set(__self__, "copy_grants", copy_grants)
        if is_secure is not None:
            pulumi.set(__self__, "is_secure", is_secure)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if or_replace is not None:
            pulumi.set(__self__, "or_replace", or_replace)
        if tags is not None:
            warnings.warn("""Use the 'snowflake_tag_association' resource instead.""", DeprecationWarning)
            pulumi.log.warn("""tags is deprecated: Use the 'snowflake_tag_association' resource instead.""")
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter
    def database(self) -> pulumi.Input[str]:
        """
        Name of the database that the tag was created in.
        """
        return pulumi.get(self, "database")

    @database.setter
    def database(self, value: pulumi.Input[str]):
        pulumi.set(self, "database", value)

    @property
    @pulumi.getter
    def schema(self) -> pulumi.Input[str]:
        """
        Name of the schema that the tag was created in.
        """
        return pulumi.get(self, "schema")

    @schema.setter
    def schema(self, value: pulumi.Input[str]):
        pulumi.set(self, "schema", value)

    @property
    @pulumi.getter
    def statement(self) -> pulumi.Input[str]:
        """
        Specifies the query used to create the view.
        """
        return pulumi.get(self, "statement")

    @statement.setter
    def statement(self, value: pulumi.Input[str]):
        pulumi.set(self, "statement", value)

    @property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies a comment for the view.
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "comment", value)

    @property
    @pulumi.getter(name="copyGrants")
    def copy_grants(self) -> Optional[pulumi.Input[bool]]:
        """
        Retains the access permissions from the original view when a new view is created using the OR REPLACE clause. OR REPLACE must be set when COPY GRANTS is set.
        """
        return pulumi.get(self, "copy_grants")

    @copy_grants.setter
    def copy_grants(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "copy_grants", value)

    @property
    @pulumi.getter(name="isSecure")
    def is_secure(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies that the view is secure. By design, the Snowflake's `SHOW VIEWS` command does not provide information about
        secure views (consult [view usage notes](https://docs.snowflake.com/en/sql-reference/sql/create-view#usage-notes)) which
        is essential to manage/import view with Terraform. Use the role owning the view while managing secure views.
        """
        return pulumi.get(self, "is_secure")

    @is_secure.setter
    def is_secure(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "is_secure", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Tag name, e.g. department.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="orReplace")
    def or_replace(self) -> Optional[pulumi.Input[bool]]:
        """
        Overwrites the View if it exists.
        """
        return pulumi.get(self, "or_replace")

    @or_replace.setter
    def or_replace(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "or_replace", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ViewTagArgs']]]]:
        """
        Definitions of a tag to associate with the resource.
        """
        warnings.warn("""Use the 'snowflake_tag_association' resource instead.""", DeprecationWarning)
        pulumi.log.warn("""tags is deprecated: Use the 'snowflake_tag_association' resource instead.""")

        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ViewTagArgs']]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _ViewState:
    def __init__(__self__, *,
                 comment: Optional[pulumi.Input[str]] = None,
                 copy_grants: Optional[pulumi.Input[bool]] = None,
                 created_on: Optional[pulumi.Input[str]] = None,
                 database: Optional[pulumi.Input[str]] = None,
                 is_secure: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 or_replace: Optional[pulumi.Input[bool]] = None,
                 schema: Optional[pulumi.Input[str]] = None,
                 statement: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input['ViewTagArgs']]]] = None):
        """
        Input properties used for looking up and filtering View resources.
        :param pulumi.Input[str] comment: Specifies a comment for the view.
        :param pulumi.Input[bool] copy_grants: Retains the access permissions from the original view when a new view is created using the OR REPLACE clause. OR REPLACE must be set when COPY GRANTS is set.
        :param pulumi.Input[str] created_on: The timestamp at which the view was created.
        :param pulumi.Input[str] database: Name of the database that the tag was created in.
        :param pulumi.Input[bool] is_secure: Specifies that the view is secure. By design, the Snowflake's `SHOW VIEWS` command does not provide information about
               secure views (consult [view usage notes](https://docs.snowflake.com/en/sql-reference/sql/create-view#usage-notes)) which
               is essential to manage/import view with Terraform. Use the role owning the view while managing secure views.
        :param pulumi.Input[str] name: Tag name, e.g. department.
        :param pulumi.Input[bool] or_replace: Overwrites the View if it exists.
        :param pulumi.Input[str] schema: Name of the schema that the tag was created in.
        :param pulumi.Input[str] statement: Specifies the query used to create the view.
        :param pulumi.Input[Sequence[pulumi.Input['ViewTagArgs']]] tags: Definitions of a tag to associate with the resource.
        """
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if copy_grants is not None:
            pulumi.set(__self__, "copy_grants", copy_grants)
        if created_on is not None:
            pulumi.set(__self__, "created_on", created_on)
        if database is not None:
            pulumi.set(__self__, "database", database)
        if is_secure is not None:
            pulumi.set(__self__, "is_secure", is_secure)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if or_replace is not None:
            pulumi.set(__self__, "or_replace", or_replace)
        if schema is not None:
            pulumi.set(__self__, "schema", schema)
        if statement is not None:
            pulumi.set(__self__, "statement", statement)
        if tags is not None:
            warnings.warn("""Use the 'snowflake_tag_association' resource instead.""", DeprecationWarning)
            pulumi.log.warn("""tags is deprecated: Use the 'snowflake_tag_association' resource instead.""")
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies a comment for the view.
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "comment", value)

    @property
    @pulumi.getter(name="copyGrants")
    def copy_grants(self) -> Optional[pulumi.Input[bool]]:
        """
        Retains the access permissions from the original view when a new view is created using the OR REPLACE clause. OR REPLACE must be set when COPY GRANTS is set.
        """
        return pulumi.get(self, "copy_grants")

    @copy_grants.setter
    def copy_grants(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "copy_grants", value)

    @property
    @pulumi.getter(name="createdOn")
    def created_on(self) -> Optional[pulumi.Input[str]]:
        """
        The timestamp at which the view was created.
        """
        return pulumi.get(self, "created_on")

    @created_on.setter
    def created_on(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "created_on", value)

    @property
    @pulumi.getter
    def database(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the database that the tag was created in.
        """
        return pulumi.get(self, "database")

    @database.setter
    def database(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "database", value)

    @property
    @pulumi.getter(name="isSecure")
    def is_secure(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies that the view is secure. By design, the Snowflake's `SHOW VIEWS` command does not provide information about
        secure views (consult [view usage notes](https://docs.snowflake.com/en/sql-reference/sql/create-view#usage-notes)) which
        is essential to manage/import view with Terraform. Use the role owning the view while managing secure views.
        """
        return pulumi.get(self, "is_secure")

    @is_secure.setter
    def is_secure(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "is_secure", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Tag name, e.g. department.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="orReplace")
    def or_replace(self) -> Optional[pulumi.Input[bool]]:
        """
        Overwrites the View if it exists.
        """
        return pulumi.get(self, "or_replace")

    @or_replace.setter
    def or_replace(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "or_replace", value)

    @property
    @pulumi.getter
    def schema(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the schema that the tag was created in.
        """
        return pulumi.get(self, "schema")

    @schema.setter
    def schema(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "schema", value)

    @property
    @pulumi.getter
    def statement(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the query used to create the view.
        """
        return pulumi.get(self, "statement")

    @statement.setter
    def statement(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "statement", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ViewTagArgs']]]]:
        """
        Definitions of a tag to associate with the resource.
        """
        warnings.warn("""Use the 'snowflake_tag_association' resource instead.""", DeprecationWarning)
        pulumi.log.warn("""tags is deprecated: Use the 'snowflake_tag_association' resource instead.""")

        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ViewTagArgs']]]]):
        pulumi.set(self, "tags", value)


class View(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 copy_grants: Optional[pulumi.Input[bool]] = None,
                 database: Optional[pulumi.Input[str]] = None,
                 is_secure: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 or_replace: Optional[pulumi.Input[bool]] = None,
                 schema: Optional[pulumi.Input[str]] = None,
                 statement: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ViewTagArgs']]]]] = None,
                 __props__=None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_snowflake as snowflake

        view = snowflake.View("view",
            database="database",
            schema="schema",
            comment="comment",
            statement="select * from foo;\\n",
            or_replace=False,
            is_secure=False)
        ```

        ## Import

        format is database name | schema name | view name

        ```sh
        $ pulumi import snowflake:index/view:View example 'dbName|schemaName|viewName'
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] comment: Specifies a comment for the view.
        :param pulumi.Input[bool] copy_grants: Retains the access permissions from the original view when a new view is created using the OR REPLACE clause. OR REPLACE must be set when COPY GRANTS is set.
        :param pulumi.Input[str] database: Name of the database that the tag was created in.
        :param pulumi.Input[bool] is_secure: Specifies that the view is secure. By design, the Snowflake's `SHOW VIEWS` command does not provide information about
               secure views (consult [view usage notes](https://docs.snowflake.com/en/sql-reference/sql/create-view#usage-notes)) which
               is essential to manage/import view with Terraform. Use the role owning the view while managing secure views.
        :param pulumi.Input[str] name: Tag name, e.g. department.
        :param pulumi.Input[bool] or_replace: Overwrites the View if it exists.
        :param pulumi.Input[str] schema: Name of the schema that the tag was created in.
        :param pulumi.Input[str] statement: Specifies the query used to create the view.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ViewTagArgs']]]] tags: Definitions of a tag to associate with the resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ViewArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_snowflake as snowflake

        view = snowflake.View("view",
            database="database",
            schema="schema",
            comment="comment",
            statement="select * from foo;\\n",
            or_replace=False,
            is_secure=False)
        ```

        ## Import

        format is database name | schema name | view name

        ```sh
        $ pulumi import snowflake:index/view:View example 'dbName|schemaName|viewName'
        ```

        :param str resource_name: The name of the resource.
        :param ViewArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ViewArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 copy_grants: Optional[pulumi.Input[bool]] = None,
                 database: Optional[pulumi.Input[str]] = None,
                 is_secure: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 or_replace: Optional[pulumi.Input[bool]] = None,
                 schema: Optional[pulumi.Input[str]] = None,
                 statement: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ViewTagArgs']]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ViewArgs.__new__(ViewArgs)

            __props__.__dict__["comment"] = comment
            __props__.__dict__["copy_grants"] = copy_grants
            if database is None and not opts.urn:
                raise TypeError("Missing required property 'database'")
            __props__.__dict__["database"] = database
            __props__.__dict__["is_secure"] = is_secure
            __props__.__dict__["name"] = name
            __props__.__dict__["or_replace"] = or_replace
            if schema is None and not opts.urn:
                raise TypeError("Missing required property 'schema'")
            __props__.__dict__["schema"] = schema
            if statement is None and not opts.urn:
                raise TypeError("Missing required property 'statement'")
            __props__.__dict__["statement"] = statement
            __props__.__dict__["tags"] = tags
            __props__.__dict__["created_on"] = None
        super(View, __self__).__init__(
            'snowflake:index/view:View',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            comment: Optional[pulumi.Input[str]] = None,
            copy_grants: Optional[pulumi.Input[bool]] = None,
            created_on: Optional[pulumi.Input[str]] = None,
            database: Optional[pulumi.Input[str]] = None,
            is_secure: Optional[pulumi.Input[bool]] = None,
            name: Optional[pulumi.Input[str]] = None,
            or_replace: Optional[pulumi.Input[bool]] = None,
            schema: Optional[pulumi.Input[str]] = None,
            statement: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ViewTagArgs']]]]] = None) -> 'View':
        """
        Get an existing View resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] comment: Specifies a comment for the view.
        :param pulumi.Input[bool] copy_grants: Retains the access permissions from the original view when a new view is created using the OR REPLACE clause. OR REPLACE must be set when COPY GRANTS is set.
        :param pulumi.Input[str] created_on: The timestamp at which the view was created.
        :param pulumi.Input[str] database: Name of the database that the tag was created in.
        :param pulumi.Input[bool] is_secure: Specifies that the view is secure. By design, the Snowflake's `SHOW VIEWS` command does not provide information about
               secure views (consult [view usage notes](https://docs.snowflake.com/en/sql-reference/sql/create-view#usage-notes)) which
               is essential to manage/import view with Terraform. Use the role owning the view while managing secure views.
        :param pulumi.Input[str] name: Tag name, e.g. department.
        :param pulumi.Input[bool] or_replace: Overwrites the View if it exists.
        :param pulumi.Input[str] schema: Name of the schema that the tag was created in.
        :param pulumi.Input[str] statement: Specifies the query used to create the view.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ViewTagArgs']]]] tags: Definitions of a tag to associate with the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ViewState.__new__(_ViewState)

        __props__.__dict__["comment"] = comment
        __props__.__dict__["copy_grants"] = copy_grants
        __props__.__dict__["created_on"] = created_on
        __props__.__dict__["database"] = database
        __props__.__dict__["is_secure"] = is_secure
        __props__.__dict__["name"] = name
        __props__.__dict__["or_replace"] = or_replace
        __props__.__dict__["schema"] = schema
        __props__.__dict__["statement"] = statement
        __props__.__dict__["tags"] = tags
        return View(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def comment(self) -> pulumi.Output[Optional[str]]:
        """
        Specifies a comment for the view.
        """
        return pulumi.get(self, "comment")

    @property
    @pulumi.getter(name="copyGrants")
    def copy_grants(self) -> pulumi.Output[Optional[bool]]:
        """
        Retains the access permissions from the original view when a new view is created using the OR REPLACE clause. OR REPLACE must be set when COPY GRANTS is set.
        """
        return pulumi.get(self, "copy_grants")

    @property
    @pulumi.getter(name="createdOn")
    def created_on(self) -> pulumi.Output[str]:
        """
        The timestamp at which the view was created.
        """
        return pulumi.get(self, "created_on")

    @property
    @pulumi.getter
    def database(self) -> pulumi.Output[str]:
        """
        Name of the database that the tag was created in.
        """
        return pulumi.get(self, "database")

    @property
    @pulumi.getter(name="isSecure")
    def is_secure(self) -> pulumi.Output[Optional[bool]]:
        """
        Specifies that the view is secure. By design, the Snowflake's `SHOW VIEWS` command does not provide information about
        secure views (consult [view usage notes](https://docs.snowflake.com/en/sql-reference/sql/create-view#usage-notes)) which
        is essential to manage/import view with Terraform. Use the role owning the view while managing secure views.
        """
        return pulumi.get(self, "is_secure")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Tag name, e.g. department.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="orReplace")
    def or_replace(self) -> pulumi.Output[Optional[bool]]:
        """
        Overwrites the View if it exists.
        """
        return pulumi.get(self, "or_replace")

    @property
    @pulumi.getter
    def schema(self) -> pulumi.Output[str]:
        """
        Name of the schema that the tag was created in.
        """
        return pulumi.get(self, "schema")

    @property
    @pulumi.getter
    def statement(self) -> pulumi.Output[str]:
        """
        Specifies the query used to create the view.
        """
        return pulumi.get(self, "statement")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Sequence['outputs.ViewTag']]]:
        """
        Definitions of a tag to associate with the resource.
        """
        warnings.warn("""Use the 'snowflake_tag_association' resource instead.""", DeprecationWarning)
        pulumi.log.warn("""tags is deprecated: Use the 'snowflake_tag_association' resource instead.""")

        return pulumi.get(self, "tags")

