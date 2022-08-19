// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSystemGetAwsSnsIamPolicyResult {
    /**
     * @return Amazon Resource Name (ARN) of the SNS topic for your S3 bucket
     * 
     */
    private final String awsSnsTopicArn;
    /**
     * @return IAM policy for Snowflake’s SQS queue to subscribe to this topic
     * 
     */
    private final String awsSnsTopicPolicyJson;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;

    @CustomType.Constructor
    private GetSystemGetAwsSnsIamPolicyResult(
        @CustomType.Parameter("awsSnsTopicArn") String awsSnsTopicArn,
        @CustomType.Parameter("awsSnsTopicPolicyJson") String awsSnsTopicPolicyJson,
        @CustomType.Parameter("id") String id) {
        this.awsSnsTopicArn = awsSnsTopicArn;
        this.awsSnsTopicPolicyJson = awsSnsTopicPolicyJson;
        this.id = id;
    }

    /**
     * @return Amazon Resource Name (ARN) of the SNS topic for your S3 bucket
     * 
     */
    public String awsSnsTopicArn() {
        return this.awsSnsTopicArn;
    }
    /**
     * @return IAM policy for Snowflake’s SQS queue to subscribe to this topic
     * 
     */
    public String awsSnsTopicPolicyJson() {
        return this.awsSnsTopicPolicyJson;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSystemGetAwsSnsIamPolicyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String awsSnsTopicArn;
        private String awsSnsTopicPolicyJson;
        private String id;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSystemGetAwsSnsIamPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsSnsTopicArn = defaults.awsSnsTopicArn;
    	      this.awsSnsTopicPolicyJson = defaults.awsSnsTopicPolicyJson;
    	      this.id = defaults.id;
        }

        public Builder awsSnsTopicArn(String awsSnsTopicArn) {
            this.awsSnsTopicArn = Objects.requireNonNull(awsSnsTopicArn);
            return this;
        }
        public Builder awsSnsTopicPolicyJson(String awsSnsTopicPolicyJson) {
            this.awsSnsTopicPolicyJson = Objects.requireNonNull(awsSnsTopicPolicyJson);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }        public GetSystemGetAwsSnsIamPolicyResult build() {
            return new GetSystemGetAwsSnsIamPolicyResult(awsSnsTopicArn, awsSnsTopicPolicyJson, id);
        }
    }
}