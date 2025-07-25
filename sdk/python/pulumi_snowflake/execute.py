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

__all__ = ['ExecuteArgs', 'Execute']

@pulumi.input_type
class ExecuteArgs:
    def __init__(__self__, *,
                 execute: pulumi.Input[_builtins.str],
                 revert: pulumi.Input[_builtins.str],
                 query: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a Execute resource.
        :param pulumi.Input[_builtins.str] execute: SQL statement to execute. Forces recreation of resource on change.
        :param pulumi.Input[_builtins.str] revert: SQL statement to revert the execute statement. Invoked when resource is being destroyed.
        :param pulumi.Input[_builtins.str] query: Optional SQL statement to do a read. Invoked on every resource refresh and every time it is changed.
        """
        pulumi.set(__self__, "execute", execute)
        pulumi.set(__self__, "revert", revert)
        if query is not None:
            pulumi.set(__self__, "query", query)

    @_builtins.property
    @pulumi.getter
    def execute(self) -> pulumi.Input[_builtins.str]:
        """
        SQL statement to execute. Forces recreation of resource on change.
        """
        return pulumi.get(self, "execute")

    @execute.setter
    def execute(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "execute", value)

    @_builtins.property
    @pulumi.getter
    def revert(self) -> pulumi.Input[_builtins.str]:
        """
        SQL statement to revert the execute statement. Invoked when resource is being destroyed.
        """
        return pulumi.get(self, "revert")

    @revert.setter
    def revert(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "revert", value)

    @_builtins.property
    @pulumi.getter
    def query(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Optional SQL statement to do a read. Invoked on every resource refresh and every time it is changed.
        """
        return pulumi.get(self, "query")

    @query.setter
    def query(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "query", value)


@pulumi.input_type
class _ExecuteState:
    def __init__(__self__, *,
                 execute: Optional[pulumi.Input[_builtins.str]] = None,
                 query: Optional[pulumi.Input[_builtins.str]] = None,
                 query_results: Optional[pulumi.Input[Sequence[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]]] = None,
                 revert: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering Execute resources.
        :param pulumi.Input[_builtins.str] execute: SQL statement to execute. Forces recreation of resource on change.
        :param pulumi.Input[_builtins.str] query: Optional SQL statement to do a read. Invoked on every resource refresh and every time it is changed.
        :param pulumi.Input[Sequence[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]] query_results: List of key-value maps (text to text) retrieved after executing read query. Will be empty if the query results in an error.
        :param pulumi.Input[_builtins.str] revert: SQL statement to revert the execute statement. Invoked when resource is being destroyed.
        """
        if execute is not None:
            pulumi.set(__self__, "execute", execute)
        if query is not None:
            pulumi.set(__self__, "query", query)
        if query_results is not None:
            pulumi.set(__self__, "query_results", query_results)
        if revert is not None:
            pulumi.set(__self__, "revert", revert)

    @_builtins.property
    @pulumi.getter
    def execute(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        SQL statement to execute. Forces recreation of resource on change.
        """
        return pulumi.get(self, "execute")

    @execute.setter
    def execute(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "execute", value)

    @_builtins.property
    @pulumi.getter
    def query(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Optional SQL statement to do a read. Invoked on every resource refresh and every time it is changed.
        """
        return pulumi.get(self, "query")

    @query.setter
    def query(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "query", value)

    @_builtins.property
    @pulumi.getter(name="queryResults")
    def query_results(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]]]:
        """
        List of key-value maps (text to text) retrieved after executing read query. Will be empty if the query results in an error.
        """
        return pulumi.get(self, "query_results")

    @query_results.setter
    def query_results(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]]]):
        pulumi.set(self, "query_results", value)

    @_builtins.property
    @pulumi.getter
    def revert(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        SQL statement to revert the execute statement. Invoked when resource is being destroyed.
        """
        return pulumi.get(self, "revert")

    @revert.setter
    def revert(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "revert", value)


@pulumi.type_token("snowflake:index/execute:Execute")
class Execute(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 execute: Optional[pulumi.Input[_builtins.str]] = None,
                 query: Optional[pulumi.Input[_builtins.str]] = None,
                 revert: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        ## Import

        ```sh
        $ pulumi import snowflake:index/execute:Execute example '<random_uuid>'
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] execute: SQL statement to execute. Forces recreation of resource on change.
        :param pulumi.Input[_builtins.str] query: Optional SQL statement to do a read. Invoked on every resource refresh and every time it is changed.
        :param pulumi.Input[_builtins.str] revert: SQL statement to revert the execute statement. Invoked when resource is being destroyed.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ExecuteArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Import

        ```sh
        $ pulumi import snowflake:index/execute:Execute example '<random_uuid>'
        ```

        :param str resource_name: The name of the resource.
        :param ExecuteArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ExecuteArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 execute: Optional[pulumi.Input[_builtins.str]] = None,
                 query: Optional[pulumi.Input[_builtins.str]] = None,
                 revert: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ExecuteArgs.__new__(ExecuteArgs)

            if execute is None and not opts.urn:
                raise TypeError("Missing required property 'execute'")
            __props__.__dict__["execute"] = execute
            __props__.__dict__["query"] = query
            if revert is None and not opts.urn:
                raise TypeError("Missing required property 'revert'")
            __props__.__dict__["revert"] = revert
            __props__.__dict__["query_results"] = None
        super(Execute, __self__).__init__(
            'snowflake:index/execute:Execute',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            execute: Optional[pulumi.Input[_builtins.str]] = None,
            query: Optional[pulumi.Input[_builtins.str]] = None,
            query_results: Optional[pulumi.Input[Sequence[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]]] = None,
            revert: Optional[pulumi.Input[_builtins.str]] = None) -> 'Execute':
        """
        Get an existing Execute resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] execute: SQL statement to execute. Forces recreation of resource on change.
        :param pulumi.Input[_builtins.str] query: Optional SQL statement to do a read. Invoked on every resource refresh and every time it is changed.
        :param pulumi.Input[Sequence[pulumi.Input[Mapping[str, pulumi.Input[_builtins.str]]]]] query_results: List of key-value maps (text to text) retrieved after executing read query. Will be empty if the query results in an error.
        :param pulumi.Input[_builtins.str] revert: SQL statement to revert the execute statement. Invoked when resource is being destroyed.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ExecuteState.__new__(_ExecuteState)

        __props__.__dict__["execute"] = execute
        __props__.__dict__["query"] = query
        __props__.__dict__["query_results"] = query_results
        __props__.__dict__["revert"] = revert
        return Execute(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def execute(self) -> pulumi.Output[_builtins.str]:
        """
        SQL statement to execute. Forces recreation of resource on change.
        """
        return pulumi.get(self, "execute")

    @_builtins.property
    @pulumi.getter
    def query(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Optional SQL statement to do a read. Invoked on every resource refresh and every time it is changed.
        """
        return pulumi.get(self, "query")

    @_builtins.property
    @pulumi.getter(name="queryResults")
    def query_results(self) -> pulumi.Output[Sequence[Mapping[str, _builtins.str]]]:
        """
        List of key-value maps (text to text) retrieved after executing read query. Will be empty if the query results in an error.
        """
        return pulumi.get(self, "query_results")

    @_builtins.property
    @pulumi.getter
    def revert(self) -> pulumi.Output[_builtins.str]:
        """
        SQL statement to revert the execute statement. Invoked when resource is being destroyed.
        """
        return pulumi.get(self, "revert")

