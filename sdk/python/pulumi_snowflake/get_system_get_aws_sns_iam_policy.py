# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins
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

__all__ = [
    'GetSystemGetAwsSnsIamPolicyResult',
    'AwaitableGetSystemGetAwsSnsIamPolicyResult',
    'get_system_get_aws_sns_iam_policy',
    'get_system_get_aws_sns_iam_policy_output',
]

@pulumi.output_type
class GetSystemGetAwsSnsIamPolicyResult:
    """
    A collection of values returned by getSystemGetAwsSnsIamPolicy.
    """
    def __init__(__self__, aws_sns_topic_arn=None, aws_sns_topic_policy_json=None, id=None):
        if aws_sns_topic_arn and not isinstance(aws_sns_topic_arn, str):
            raise TypeError("Expected argument 'aws_sns_topic_arn' to be a str")
        pulumi.set(__self__, "aws_sns_topic_arn", aws_sns_topic_arn)
        if aws_sns_topic_policy_json and not isinstance(aws_sns_topic_policy_json, str):
            raise TypeError("Expected argument 'aws_sns_topic_policy_json' to be a str")
        pulumi.set(__self__, "aws_sns_topic_policy_json", aws_sns_topic_policy_json)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)

    @property
    @pulumi.getter(name="awsSnsTopicArn")
    def aws_sns_topic_arn(self) -> builtins.str:
        """
        Amazon Resource Name (ARN) of the SNS topic for your S3 bucket
        """
        return pulumi.get(self, "aws_sns_topic_arn")

    @property
    @pulumi.getter(name="awsSnsTopicPolicyJson")
    def aws_sns_topic_policy_json(self) -> builtins.str:
        """
        IAM policy for Snowflake’s SQS queue to subscribe to this topic
        """
        return pulumi.get(self, "aws_sns_topic_policy_json")

    @property
    @pulumi.getter
    def id(self) -> builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")


class AwaitableGetSystemGetAwsSnsIamPolicyResult(GetSystemGetAwsSnsIamPolicyResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetSystemGetAwsSnsIamPolicyResult(
            aws_sns_topic_arn=self.aws_sns_topic_arn,
            aws_sns_topic_policy_json=self.aws_sns_topic_policy_json,
            id=self.id)


def get_system_get_aws_sns_iam_policy(aws_sns_topic_arn: Optional[builtins.str] = None,
                                      opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetSystemGetAwsSnsIamPolicyResult:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_snowflake as snowflake

    snowflake_policy = snowflake.get_system_get_aws_sns_iam_policy(aws_sns_topic_arn="<aws_sns_topic_arn>")
    ```

    > **Note** If a field has a default value, it is shown next to the type in the schema.


    :param builtins.str aws_sns_topic_arn: Amazon Resource Name (ARN) of the SNS topic for your S3 bucket
    """
    __args__ = dict()
    __args__['awsSnsTopicArn'] = aws_sns_topic_arn
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('snowflake:index/getSystemGetAwsSnsIamPolicy:getSystemGetAwsSnsIamPolicy', __args__, opts=opts, typ=GetSystemGetAwsSnsIamPolicyResult).value

    return AwaitableGetSystemGetAwsSnsIamPolicyResult(
        aws_sns_topic_arn=pulumi.get(__ret__, 'aws_sns_topic_arn'),
        aws_sns_topic_policy_json=pulumi.get(__ret__, 'aws_sns_topic_policy_json'),
        id=pulumi.get(__ret__, 'id'))
def get_system_get_aws_sns_iam_policy_output(aws_sns_topic_arn: Optional[pulumi.Input[builtins.str]] = None,
                                             opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetSystemGetAwsSnsIamPolicyResult]:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_snowflake as snowflake

    snowflake_policy = snowflake.get_system_get_aws_sns_iam_policy(aws_sns_topic_arn="<aws_sns_topic_arn>")
    ```

    > **Note** If a field has a default value, it is shown next to the type in the schema.


    :param builtins.str aws_sns_topic_arn: Amazon Resource Name (ARN) of the SNS topic for your S3 bucket
    """
    __args__ = dict()
    __args__['awsSnsTopicArn'] = aws_sns_topic_arn
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('snowflake:index/getSystemGetAwsSnsIamPolicy:getSystemGetAwsSnsIamPolicy', __args__, opts=opts, typ=GetSystemGetAwsSnsIamPolicyResult)
    return __ret__.apply(lambda __response__: GetSystemGetAwsSnsIamPolicyResult(
        aws_sns_topic_arn=pulumi.get(__response__, 'aws_sns_topic_arn'),
        aws_sns_topic_policy_json=pulumi.get(__response__, 'aws_sns_topic_policy_json'),
        id=pulumi.get(__response__, 'id')))
