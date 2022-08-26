// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TagAssociationArgs extends com.pulumi.resources.ResourceArgs {

    public static final TagAssociationArgs Empty = new TagAssociationArgs();

    /**
     * Specifies the object identifier for the tag association.
     * 
     */
    @Import(name="objectName", required=true)
    private Output<String> objectName;

    /**
     * @return Specifies the object identifier for the tag association.
     * 
     */
    public Output<String> objectName() {
        return this.objectName;
    }

    /**
     * Specifies the type of object to add a tag to. ex: &#39;ACCOUNT&#39;, &#39;COLUMN&#39;, &#39;DATABASE&#39;, etc. For more information: https://docs.snowflake.com/en/user-guide/object-tagging.html#supported-objects
     * 
     */
    @Import(name="objectType", required=true)
    private Output<String> objectType;

    /**
     * @return Specifies the type of object to add a tag to. ex: &#39;ACCOUNT&#39;, &#39;COLUMN&#39;, &#39;DATABASE&#39;, etc. For more information: https://docs.snowflake.com/en/user-guide/object-tagging.html#supported-objects
     * 
     */
    public Output<String> objectType() {
        return this.objectType;
    }

    /**
     * If true, skips validation of the tag association. It can take up to an hour for the SNOWFLAKE.TAG*REFERENCES table to update, and also requires ACCOUNT*ADMIN role to read from. https://docs.snowflake.com/en/sql-reference/account-usage/tag_references.html
     * 
     */
    @Import(name="skipValidation")
    private @Nullable Output<Boolean> skipValidation;

    /**
     * @return If true, skips validation of the tag association. It can take up to an hour for the SNOWFLAKE.TAG*REFERENCES table to update, and also requires ACCOUNT*ADMIN role to read from. https://docs.snowflake.com/en/sql-reference/account-usage/tag_references.html
     * 
     */
    public Optional<Output<Boolean>> skipValidation() {
        return Optional.ofNullable(this.skipValidation);
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

    /**
     * Specifies the value of the tag, (e.g. &#39;finance&#39; or &#39;engineering&#39;)
     * 
     */
    @Import(name="tagValue", required=true)
    private Output<String> tagValue;

    /**
     * @return Specifies the value of the tag, (e.g. &#39;finance&#39; or &#39;engineering&#39;)
     * 
     */
    public Output<String> tagValue() {
        return this.tagValue;
    }

    private TagAssociationArgs() {}

    private TagAssociationArgs(TagAssociationArgs $) {
        this.objectName = $.objectName;
        this.objectType = $.objectType;
        this.skipValidation = $.skipValidation;
        this.tagId = $.tagId;
        this.tagValue = $.tagValue;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TagAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TagAssociationArgs $;

        public Builder() {
            $ = new TagAssociationArgs();
        }

        public Builder(TagAssociationArgs defaults) {
            $ = new TagAssociationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param objectName Specifies the object identifier for the tag association.
         * 
         * @return builder
         * 
         */
        public Builder objectName(Output<String> objectName) {
            $.objectName = objectName;
            return this;
        }

        /**
         * @param objectName Specifies the object identifier for the tag association.
         * 
         * @return builder
         * 
         */
        public Builder objectName(String objectName) {
            return objectName(Output.of(objectName));
        }

        /**
         * @param objectType Specifies the type of object to add a tag to. ex: &#39;ACCOUNT&#39;, &#39;COLUMN&#39;, &#39;DATABASE&#39;, etc. For more information: https://docs.snowflake.com/en/user-guide/object-tagging.html#supported-objects
         * 
         * @return builder
         * 
         */
        public Builder objectType(Output<String> objectType) {
            $.objectType = objectType;
            return this;
        }

        /**
         * @param objectType Specifies the type of object to add a tag to. ex: &#39;ACCOUNT&#39;, &#39;COLUMN&#39;, &#39;DATABASE&#39;, etc. For more information: https://docs.snowflake.com/en/user-guide/object-tagging.html#supported-objects
         * 
         * @return builder
         * 
         */
        public Builder objectType(String objectType) {
            return objectType(Output.of(objectType));
        }

        /**
         * @param skipValidation If true, skips validation of the tag association. It can take up to an hour for the SNOWFLAKE.TAG*REFERENCES table to update, and also requires ACCOUNT*ADMIN role to read from. https://docs.snowflake.com/en/sql-reference/account-usage/tag_references.html
         * 
         * @return builder
         * 
         */
        public Builder skipValidation(@Nullable Output<Boolean> skipValidation) {
            $.skipValidation = skipValidation;
            return this;
        }

        /**
         * @param skipValidation If true, skips validation of the tag association. It can take up to an hour for the SNOWFLAKE.TAG*REFERENCES table to update, and also requires ACCOUNT*ADMIN role to read from. https://docs.snowflake.com/en/sql-reference/account-usage/tag_references.html
         * 
         * @return builder
         * 
         */
        public Builder skipValidation(Boolean skipValidation) {
            return skipValidation(Output.of(skipValidation));
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

        /**
         * @param tagValue Specifies the value of the tag, (e.g. &#39;finance&#39; or &#39;engineering&#39;)
         * 
         * @return builder
         * 
         */
        public Builder tagValue(Output<String> tagValue) {
            $.tagValue = tagValue;
            return this;
        }

        /**
         * @param tagValue Specifies the value of the tag, (e.g. &#39;finance&#39; or &#39;engineering&#39;)
         * 
         * @return builder
         * 
         */
        public Builder tagValue(String tagValue) {
            return tagValue(Output.of(tagValue));
        }

        public TagAssociationArgs build() {
            $.objectName = Objects.requireNonNull($.objectName, "expected parameter 'objectName' to be non-null");
            $.objectType = Objects.requireNonNull($.objectType, "expected parameter 'objectType' to be non-null");
            $.tagId = Objects.requireNonNull($.tagId, "expected parameter 'tagId' to be non-null");
            $.tagValue = Objects.requireNonNull($.tagValue, "expected parameter 'tagValue' to be non-null");
            return $;
        }
    }

}
