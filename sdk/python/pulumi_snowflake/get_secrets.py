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

__all__ = [
    'GetSecretsResult',
    'AwaitableGetSecretsResult',
    'get_secrets',
    'get_secrets_output',
]

@pulumi.output_type
class GetSecretsResult:
    """
    A collection of values returned by getSecrets.
    """
    def __init__(__self__, id=None, in_=None, like=None, secrets=None, with_describe=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if in_ and not isinstance(in_, dict):
            raise TypeError("Expected argument 'in_' to be a dict")
        pulumi.set(__self__, "in_", in_)
        if like and not isinstance(like, str):
            raise TypeError("Expected argument 'like' to be a str")
        pulumi.set(__self__, "like", like)
        if secrets and not isinstance(secrets, list):
            raise TypeError("Expected argument 'secrets' to be a list")
        pulumi.set(__self__, "secrets", secrets)
        if with_describe and not isinstance(with_describe, bool):
            raise TypeError("Expected argument 'with_describe' to be a bool")
        pulumi.set(__self__, "with_describe", with_describe)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="in")
    def in_(self) -> Optional['outputs.GetSecretsInResult']:
        """
        IN clause to filter the list of secrets
        """
        return pulumi.get(self, "in_")

    @property
    @pulumi.getter
    def like(self) -> Optional[str]:
        """
        Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
        """
        return pulumi.get(self, "like")

    @property
    @pulumi.getter
    def secrets(self) -> Sequence['outputs.GetSecretsSecretResult']:
        """
        Holds the aggregated output of all secrets details queries.
        """
        return pulumi.get(self, "secrets")

    @property
    @pulumi.getter(name="withDescribe")
    def with_describe(self) -> Optional[bool]:
        """
        Runs DESC SECRET for each secret returned by SHOW SECRETS. The output of describe is saved to the description field. By default this value is set to true.
        """
        return pulumi.get(self, "with_describe")


class AwaitableGetSecretsResult(GetSecretsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetSecretsResult(
            id=self.id,
            in_=self.in_,
            like=self.like,
            secrets=self.secrets,
            with_describe=self.with_describe)


def get_secrets(in_: Optional[Union['GetSecretsInArgs', 'GetSecretsInArgsDict']] = None,
                like: Optional[str] = None,
                with_describe: Optional[bool] = None,
                opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetSecretsResult:
    """
    !> **V1 release candidate** This data source is a release candidate for the V1. We do not expect significant changes in it before the V1. We will welcome any feedback and adjust the data source if needed. Any errors reported will be resolved with a higher priority. We encourage checking this data source out before the V1 release. Please follow the migration guide to use it.

    Datasource used to get details of filtered secrets. Filtering is aligned with the current possibilities for [SHOW SECRETS](https://docs.snowflake.com/en/sql-reference/sql/show-secrets) query. The results of SHOW and DESCRIBE are encapsulated in one output collection `secrets`.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_snowflake as snowflake

    # Simple usage
    simple = snowflake.get_secrets()
    pulumi.export("simpleOutput", simple.secrets)
    # Filtering (like)
    like = snowflake.get_secrets(like="secret-name")
    pulumi.export("likeOutput", like.secrets)
    # Filtering by prefix (like)
    like_prefix = snowflake.get_secrets(like="prefix%")
    pulumi.export("likePrefixOutput", like_prefix.secrets)
    # Filtering (in)
    in_ = snowflake.get_secrets(in_={
        "schema": test["fullyQualifiedName"],
    })
    pulumi.export("inOutput", in_.secrets)
    # Without additional data (to limit the number of calls make for every found secret)
    only_show = snowflake.get_secrets(with_describe=False)
    pulumi.export("onlyShowOutput", only_show.secrets)
    ```


    :param Union['GetSecretsInArgs', 'GetSecretsInArgsDict'] in_: IN clause to filter the list of secrets
    :param str like: Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
    :param bool with_describe: Runs DESC SECRET for each secret returned by SHOW SECRETS. The output of describe is saved to the description field. By default this value is set to true.
    """
    __args__ = dict()
    __args__['in'] = in_
    __args__['like'] = like
    __args__['withDescribe'] = with_describe
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('snowflake:index/getSecrets:getSecrets', __args__, opts=opts, typ=GetSecretsResult).value

    return AwaitableGetSecretsResult(
        id=pulumi.get(__ret__, 'id'),
        in_=pulumi.get(__ret__, 'in_'),
        like=pulumi.get(__ret__, 'like'),
        secrets=pulumi.get(__ret__, 'secrets'),
        with_describe=pulumi.get(__ret__, 'with_describe'))
def get_secrets_output(in_: Optional[pulumi.Input[Optional[Union['GetSecretsInArgs', 'GetSecretsInArgsDict']]]] = None,
                       like: Optional[pulumi.Input[Optional[str]]] = None,
                       with_describe: Optional[pulumi.Input[Optional[bool]]] = None,
                       opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetSecretsResult]:
    """
    !> **V1 release candidate** This data source is a release candidate for the V1. We do not expect significant changes in it before the V1. We will welcome any feedback and adjust the data source if needed. Any errors reported will be resolved with a higher priority. We encourage checking this data source out before the V1 release. Please follow the migration guide to use it.

    Datasource used to get details of filtered secrets. Filtering is aligned with the current possibilities for [SHOW SECRETS](https://docs.snowflake.com/en/sql-reference/sql/show-secrets) query. The results of SHOW and DESCRIBE are encapsulated in one output collection `secrets`.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_snowflake as snowflake

    # Simple usage
    simple = snowflake.get_secrets()
    pulumi.export("simpleOutput", simple.secrets)
    # Filtering (like)
    like = snowflake.get_secrets(like="secret-name")
    pulumi.export("likeOutput", like.secrets)
    # Filtering by prefix (like)
    like_prefix = snowflake.get_secrets(like="prefix%")
    pulumi.export("likePrefixOutput", like_prefix.secrets)
    # Filtering (in)
    in_ = snowflake.get_secrets(in_={
        "schema": test["fullyQualifiedName"],
    })
    pulumi.export("inOutput", in_.secrets)
    # Without additional data (to limit the number of calls make for every found secret)
    only_show = snowflake.get_secrets(with_describe=False)
    pulumi.export("onlyShowOutput", only_show.secrets)
    ```


    :param Union['GetSecretsInArgs', 'GetSecretsInArgsDict'] in_: IN clause to filter the list of secrets
    :param str like: Filters the output with **case-insensitive** pattern, with support for SQL wildcard characters (`%` and `_`).
    :param bool with_describe: Runs DESC SECRET for each secret returned by SHOW SECRETS. The output of describe is saved to the description field. By default this value is set to true.
    """
    __args__ = dict()
    __args__['in'] = in_
    __args__['like'] = like
    __args__['withDescribe'] = with_describe
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('snowflake:index/getSecrets:getSecrets', __args__, opts=opts, typ=GetSecretsResult)
    return __ret__.apply(lambda __response__: GetSecretsResult(
        id=pulumi.get(__response__, 'id'),
        in_=pulumi.get(__response__, 'in_'),
        like=pulumi.get(__response__, 'like'),
        secrets=pulumi.get(__response__, 'secrets'),
        with_describe=pulumi.get(__response__, 'with_describe')))