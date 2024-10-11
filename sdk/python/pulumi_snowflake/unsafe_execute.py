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

__all__ = ['UnsafeExecuteArgs', 'UnsafeExecute']

@pulumi.input_type
class UnsafeExecuteArgs:
    def __init__(__self__, *,
                 execute: pulumi.Input[str],
                 revert: pulumi.Input[str],
                 query: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a UnsafeExecute resource.
        :param pulumi.Input[str] execute: SQL statement to execute. Forces recreation of resource on change.
        :param pulumi.Input[str] revert: SQL statement to revert the execute statement. Invoked when resource is being destroyed.
        :param pulumi.Input[str] query: Optional SQL statement to do a read. Invoked after creation and every time it is changed.
        """
        pulumi.set(__self__, "execute", execute)
        pulumi.set(__self__, "revert", revert)
        if query is not None:
            pulumi.set(__self__, "query", query)

    @property
    @pulumi.getter
    def execute(self) -> pulumi.Input[str]:
        """
        SQL statement to execute. Forces recreation of resource on change.
        """
        return pulumi.get(self, "execute")

    @execute.setter
    def execute(self, value: pulumi.Input[str]):
        pulumi.set(self, "execute", value)

    @property
    @pulumi.getter
    def revert(self) -> pulumi.Input[str]:
        """
        SQL statement to revert the execute statement. Invoked when resource is being destroyed.
        """
        return pulumi.get(self, "revert")

    @revert.setter
    def revert(self, value: pulumi.Input[str]):
        pulumi.set(self, "revert", value)

    @property
    @pulumi.getter
    def query(self) -> Optional[pulumi.Input[str]]:
        """
        Optional SQL statement to do a read. Invoked after creation and every time it is changed.
        """
        return pulumi.get(self, "query")

    @query.setter
    def query(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "query", value)


@pulumi.input_type
class _UnsafeExecuteState:
    def __init__(__self__, *,
                 execute: Optional[pulumi.Input[str]] = None,
                 query: Optional[pulumi.Input[str]] = None,
                 query_results: Optional[pulumi.Input[Sequence[pulumi.Input[Mapping[str, pulumi.Input[str]]]]]] = None,
                 revert: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering UnsafeExecute resources.
        :param pulumi.Input[str] execute: SQL statement to execute. Forces recreation of resource on change.
        :param pulumi.Input[str] query: Optional SQL statement to do a read. Invoked after creation and every time it is changed.
        :param pulumi.Input[Sequence[pulumi.Input[Mapping[str, pulumi.Input[str]]]]] query_results: List of key-value maps (text to text) retrieved after executing read query. Will be empty if the query results in an error.
        :param pulumi.Input[str] revert: SQL statement to revert the execute statement. Invoked when resource is being destroyed.
        """
        if execute is not None:
            pulumi.set(__self__, "execute", execute)
        if query is not None:
            pulumi.set(__self__, "query", query)
        if query_results is not None:
            pulumi.set(__self__, "query_results", query_results)
        if revert is not None:
            pulumi.set(__self__, "revert", revert)

    @property
    @pulumi.getter
    def execute(self) -> Optional[pulumi.Input[str]]:
        """
        SQL statement to execute. Forces recreation of resource on change.
        """
        return pulumi.get(self, "execute")

    @execute.setter
    def execute(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "execute", value)

    @property
    @pulumi.getter
    def query(self) -> Optional[pulumi.Input[str]]:
        """
        Optional SQL statement to do a read. Invoked after creation and every time it is changed.
        """
        return pulumi.get(self, "query")

    @query.setter
    def query(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "query", value)

    @property
    @pulumi.getter(name="queryResults")
    def query_results(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[Mapping[str, pulumi.Input[str]]]]]]:
        """
        List of key-value maps (text to text) retrieved after executing read query. Will be empty if the query results in an error.
        """
        return pulumi.get(self, "query_results")

    @query_results.setter
    def query_results(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[Mapping[str, pulumi.Input[str]]]]]]):
        pulumi.set(self, "query_results", value)

    @property
    @pulumi.getter
    def revert(self) -> Optional[pulumi.Input[str]]:
        """
        SQL statement to revert the execute statement. Invoked when resource is being destroyed.
        """
        return pulumi.get(self, "revert")

    @revert.setter
    def revert(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "revert", value)


class UnsafeExecute(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 execute: Optional[pulumi.Input[str]] = None,
                 query: Optional[pulumi.Input[str]] = None,
                 revert: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Create a UnsafeExecute resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] execute: SQL statement to execute. Forces recreation of resource on change.
        :param pulumi.Input[str] query: Optional SQL statement to do a read. Invoked after creation and every time it is changed.
        :param pulumi.Input[str] revert: SQL statement to revert the execute statement. Invoked when resource is being destroyed.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: UnsafeExecuteArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create a UnsafeExecute resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param UnsafeExecuteArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(UnsafeExecuteArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 execute: Optional[pulumi.Input[str]] = None,
                 query: Optional[pulumi.Input[str]] = None,
                 revert: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = UnsafeExecuteArgs.__new__(UnsafeExecuteArgs)

            if execute is None and not opts.urn:
                raise TypeError("Missing required property 'execute'")
            __props__.__dict__["execute"] = execute
            __props__.__dict__["query"] = query
            if revert is None and not opts.urn:
                raise TypeError("Missing required property 'revert'")
            __props__.__dict__["revert"] = revert
            __props__.__dict__["query_results"] = None
        super(UnsafeExecute, __self__).__init__(
            'snowflake:index/unsafeExecute:UnsafeExecute',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            execute: Optional[pulumi.Input[str]] = None,
            query: Optional[pulumi.Input[str]] = None,
            query_results: Optional[pulumi.Input[Sequence[pulumi.Input[Mapping[str, pulumi.Input[str]]]]]] = None,
            revert: Optional[pulumi.Input[str]] = None) -> 'UnsafeExecute':
        """
        Get an existing UnsafeExecute resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] execute: SQL statement to execute. Forces recreation of resource on change.
        :param pulumi.Input[str] query: Optional SQL statement to do a read. Invoked after creation and every time it is changed.
        :param pulumi.Input[Sequence[pulumi.Input[Mapping[str, pulumi.Input[str]]]]] query_results: List of key-value maps (text to text) retrieved after executing read query. Will be empty if the query results in an error.
        :param pulumi.Input[str] revert: SQL statement to revert the execute statement. Invoked when resource is being destroyed.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _UnsafeExecuteState.__new__(_UnsafeExecuteState)

        __props__.__dict__["execute"] = execute
        __props__.__dict__["query"] = query
        __props__.__dict__["query_results"] = query_results
        __props__.__dict__["revert"] = revert
        return UnsafeExecute(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def execute(self) -> pulumi.Output[str]:
        """
        SQL statement to execute. Forces recreation of resource on change.
        """
        return pulumi.get(self, "execute")

    @property
    @pulumi.getter
    def query(self) -> pulumi.Output[Optional[str]]:
        """
        Optional SQL statement to do a read. Invoked after creation and every time it is changed.
        """
        return pulumi.get(self, "query")

    @property
    @pulumi.getter(name="queryResults")
    def query_results(self) -> pulumi.Output[Sequence[Mapping[str, str]]]:
        """
        List of key-value maps (text to text) retrieved after executing read query. Will be empty if the query results in an error.
        """
        return pulumi.get(self, "query_results")

    @property
    @pulumi.getter
    def revert(self) -> pulumi.Output[str]:
        """
        SQL statement to revert the execute statement. Invoked when resource is being destroyed.
        """
        return pulumi.get(self, "revert")

