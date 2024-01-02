// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSystemGetAwsSnsIamPolicyResult {
    /**
     * @return Amazon Resource Name (ARN) of the SNS topic for your S3 bucket
     * 
     */
    private String awsSnsTopicArn;
    /**
     * @return IAM policy for Snowflake’s SQS queue to subscribe to this topic
     * 
     */
    private String awsSnsTopicPolicyJson;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;

    private GetSystemGetAwsSnsIamPolicyResult() {}
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
    @CustomType.Builder
    public static final class Builder {
        private String awsSnsTopicArn;
        private String awsSnsTopicPolicyJson;
        private String id;
        public Builder() {}
        public Builder(GetSystemGetAwsSnsIamPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsSnsTopicArn = defaults.awsSnsTopicArn;
    	      this.awsSnsTopicPolicyJson = defaults.awsSnsTopicPolicyJson;
    	      this.id = defaults.id;
        }

        @CustomType.Setter
        public Builder awsSnsTopicArn(String awsSnsTopicArn) {
            if (awsSnsTopicArn == null) {
              throw new MissingRequiredPropertyException("GetSystemGetAwsSnsIamPolicyResult", "awsSnsTopicArn");
            }
            this.awsSnsTopicArn = awsSnsTopicArn;
            return this;
        }
        @CustomType.Setter
        public Builder awsSnsTopicPolicyJson(String awsSnsTopicPolicyJson) {
            if (awsSnsTopicPolicyJson == null) {
              throw new MissingRequiredPropertyException("GetSystemGetAwsSnsIamPolicyResult", "awsSnsTopicPolicyJson");
            }
            this.awsSnsTopicPolicyJson = awsSnsTopicPolicyJson;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetSystemGetAwsSnsIamPolicyResult", "id");
            }
            this.id = id;
            return this;
        }
        public GetSystemGetAwsSnsIamPolicyResult build() {
            final var _resultValue = new GetSystemGetAwsSnsIamPolicyResult();
            _resultValue.awsSnsTopicArn = awsSnsTopicArn;
            _resultValue.awsSnsTopicPolicyJson = awsSnsTopicPolicyJson;
            _resultValue.id = id;
            return _resultValue;
        }
    }
}
