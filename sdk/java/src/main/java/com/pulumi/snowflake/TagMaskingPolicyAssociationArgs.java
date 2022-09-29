// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class TagMaskingPolicyAssociationArgs extends com.pulumi.resources.ResourceArgs {

    public static final TagMaskingPolicyAssociationArgs Empty = new TagMaskingPolicyAssociationArgs();

    /**
     * The the resource id of the masking policy
     * 
     */
    @Import(name="maskingPolicyId", required=true)
    private Output<String> maskingPolicyId;

    /**
     * @return The the resource id of the masking policy
     * 
     */
    public Output<String> maskingPolicyId() {
        return this.maskingPolicyId;
    }

    /**
     * Specifies the identifier for the tag. Note: format must follow: &#34;databaseName&#34;.&#34;schemaName&#34;.&#34;tagName&#34; or &#34;databaseName.schemaName.tagName&#34; or &#34;databaseName|schemaName.tagName&#34; (snowflake_tag.tag.id)
     * 
     */
    @Import(name="tagId", required=true)
    private Output<String> tagId;

    /**
     * @return Specifies the identifier for the tag. Note: format must follow: &#34;databaseName&#34;.&#34;schemaName&#34;.&#34;tagName&#34; or &#34;databaseName.schemaName.tagName&#34; or &#34;databaseName|schemaName.tagName&#34; (snowflake_tag.tag.id)
     * 
     */
    public Output<String> tagId() {
        return this.tagId;
    }

    private TagMaskingPolicyAssociationArgs() {}

    private TagMaskingPolicyAssociationArgs(TagMaskingPolicyAssociationArgs $) {
        this.maskingPolicyId = $.maskingPolicyId;
        this.tagId = $.tagId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TagMaskingPolicyAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TagMaskingPolicyAssociationArgs $;

        public Builder() {
            $ = new TagMaskingPolicyAssociationArgs();
        }

        public Builder(TagMaskingPolicyAssociationArgs defaults) {
            $ = new TagMaskingPolicyAssociationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param maskingPolicyId The the resource id of the masking policy
         * 
         * @return builder
         * 
         */
        public Builder maskingPolicyId(Output<String> maskingPolicyId) {
            $.maskingPolicyId = maskingPolicyId;
            return this;
        }

        /**
         * @param maskingPolicyId The the resource id of the masking policy
         * 
         * @return builder
         * 
         */
        public Builder maskingPolicyId(String maskingPolicyId) {
            return maskingPolicyId(Output.of(maskingPolicyId));
        }

        /**
         * @param tagId Specifies the identifier for the tag. Note: format must follow: &#34;databaseName&#34;.&#34;schemaName&#34;.&#34;tagName&#34; or &#34;databaseName.schemaName.tagName&#34; or &#34;databaseName|schemaName.tagName&#34; (snowflake_tag.tag.id)
         * 
         * @return builder
         * 
         */
        public Builder tagId(Output<String> tagId) {
            $.tagId = tagId;
            return this;
        }

        /**
         * @param tagId Specifies the identifier for the tag. Note: format must follow: &#34;databaseName&#34;.&#34;schemaName&#34;.&#34;tagName&#34; or &#34;databaseName.schemaName.tagName&#34; or &#34;databaseName|schemaName.tagName&#34; (snowflake_tag.tag.id)
         * 
         * @return builder
         * 
         */
        public Builder tagId(String tagId) {
            return tagId(Output.of(tagId));
        }

        public TagMaskingPolicyAssociationArgs build() {
            $.maskingPolicyId = Objects.requireNonNull($.maskingPolicyId, "expected parameter 'maskingPolicyId' to be non-null");
            $.tagId = Objects.requireNonNull($.tagId, "expected parameter 'tagId' to be non-null");
            return $;
        }
    }

}
