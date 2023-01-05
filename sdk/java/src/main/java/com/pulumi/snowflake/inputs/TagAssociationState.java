// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.snowflake.inputs.TagAssociationObjectIdentifierArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TagAssociationState extends com.pulumi.resources.ResourceArgs {

    public static final TagAssociationState Empty = new TagAssociationState();

    /**
     * Specifies the object identifier for the tag association.
     * 
     */
    @Import(name="objectIdentifiers")
    private @Nullable Output<List<TagAssociationObjectIdentifierArgs>> objectIdentifiers;

    /**
     * @return Specifies the object identifier for the tag association.
     * 
     */
    public Optional<Output<List<TagAssociationObjectIdentifierArgs>>> objectIdentifiers() {
        return Optional.ofNullable(this.objectIdentifiers);
    }

    /**
     * Specifies the object identifier for the tag association.
     * 
     * @deprecated
     * Use `object_identifier` instead
     * 
     */
    @Deprecated /* Use `object_identifier` instead */
    @Import(name="objectName")
    private @Nullable Output<String> objectName;

    /**
     * @return Specifies the object identifier for the tag association.
     * 
     * @deprecated
     * Use `object_identifier` instead
     * 
     */
    @Deprecated /* Use `object_identifier` instead */
    public Optional<Output<String>> objectName() {
        return Optional.ofNullable(this.objectName);
    }

    /**
     * Specifies the type of object to add a tag to. ex: &#39;ACCOUNT&#39;, &#39;COLUMN&#39;, &#39;DATABASE&#39;, etc. For more information: https://docs.snowflake.com/en/user-guide/object-tagging.html#supported-objects
     * 
     */
    @Import(name="objectType")
    private @Nullable Output<String> objectType;

    /**
     * @return Specifies the type of object to add a tag to. ex: &#39;ACCOUNT&#39;, &#39;COLUMN&#39;, &#39;DATABASE&#39;, etc. For more information: https://docs.snowflake.com/en/user-guide/object-tagging.html#supported-objects
     * 
     */
    public Optional<Output<String>> objectType() {
        return Optional.ofNullable(this.objectType);
    }

    /**
     * If true, skips validation of the tag association.
     * 
     */
    @Import(name="skipValidation")
    private @Nullable Output<Boolean> skipValidation;

    /**
     * @return If true, skips validation of the tag association.
     * 
     */
    public Optional<Output<Boolean>> skipValidation() {
        return Optional.ofNullable(this.skipValidation);
    }

    /**
     * Specifies the identifier for the tag. Note: format must follow: &#34;databaseName&#34;.&#34;schemaName&#34;.&#34;tagName&#34; or &#34;databaseName.schemaName.tagName&#34; or &#34;databaseName|schemaName.tagName&#34; (snowflake_tag.tag.id)
     * 
     */
    @Import(name="tagId")
    private @Nullable Output<String> tagId;

    /**
     * @return Specifies the identifier for the tag. Note: format must follow: &#34;databaseName&#34;.&#34;schemaName&#34;.&#34;tagName&#34; or &#34;databaseName.schemaName.tagName&#34; or &#34;databaseName|schemaName.tagName&#34; (snowflake_tag.tag.id)
     * 
     */
    public Optional<Output<String>> tagId() {
        return Optional.ofNullable(this.tagId);
    }

    /**
     * Specifies the value of the tag, (e.g. &#39;finance&#39; or &#39;engineering&#39;)
     * 
     */
    @Import(name="tagValue")
    private @Nullable Output<String> tagValue;

    /**
     * @return Specifies the value of the tag, (e.g. &#39;finance&#39; or &#39;engineering&#39;)
     * 
     */
    public Optional<Output<String>> tagValue() {
        return Optional.ofNullable(this.tagValue);
    }

    private TagAssociationState() {}

    private TagAssociationState(TagAssociationState $) {
        this.objectIdentifiers = $.objectIdentifiers;
        this.objectName = $.objectName;
        this.objectType = $.objectType;
        this.skipValidation = $.skipValidation;
        this.tagId = $.tagId;
        this.tagValue = $.tagValue;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TagAssociationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TagAssociationState $;

        public Builder() {
            $ = new TagAssociationState();
        }

        public Builder(TagAssociationState defaults) {
            $ = new TagAssociationState(Objects.requireNonNull(defaults));
        }

        /**
         * @param objectIdentifiers Specifies the object identifier for the tag association.
         * 
         * @return builder
         * 
         */
        public Builder objectIdentifiers(@Nullable Output<List<TagAssociationObjectIdentifierArgs>> objectIdentifiers) {
            $.objectIdentifiers = objectIdentifiers;
            return this;
        }

        /**
         * @param objectIdentifiers Specifies the object identifier for the tag association.
         * 
         * @return builder
         * 
         */
        public Builder objectIdentifiers(List<TagAssociationObjectIdentifierArgs> objectIdentifiers) {
            return objectIdentifiers(Output.of(objectIdentifiers));
        }

        /**
         * @param objectIdentifiers Specifies the object identifier for the tag association.
         * 
         * @return builder
         * 
         */
        public Builder objectIdentifiers(TagAssociationObjectIdentifierArgs... objectIdentifiers) {
            return objectIdentifiers(List.of(objectIdentifiers));
        }

        /**
         * @param objectName Specifies the object identifier for the tag association.
         * 
         * @return builder
         * 
         * @deprecated
         * Use `object_identifier` instead
         * 
         */
        @Deprecated /* Use `object_identifier` instead */
        public Builder objectName(@Nullable Output<String> objectName) {
            $.objectName = objectName;
            return this;
        }

        /**
         * @param objectName Specifies the object identifier for the tag association.
         * 
         * @return builder
         * 
         * @deprecated
         * Use `object_identifier` instead
         * 
         */
        @Deprecated /* Use `object_identifier` instead */
        public Builder objectName(String objectName) {
            return objectName(Output.of(objectName));
        }

        /**
         * @param objectType Specifies the type of object to add a tag to. ex: &#39;ACCOUNT&#39;, &#39;COLUMN&#39;, &#39;DATABASE&#39;, etc. For more information: https://docs.snowflake.com/en/user-guide/object-tagging.html#supported-objects
         * 
         * @return builder
         * 
         */
        public Builder objectType(@Nullable Output<String> objectType) {
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
         * @param skipValidation If true, skips validation of the tag association.
         * 
         * @return builder
         * 
         */
        public Builder skipValidation(@Nullable Output<Boolean> skipValidation) {
            $.skipValidation = skipValidation;
            return this;
        }

        /**
         * @param skipValidation If true, skips validation of the tag association.
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
        public Builder tagId(@Nullable Output<String> tagId) {
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
        public Builder tagValue(@Nullable Output<String> tagValue) {
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

        public TagAssociationState build() {
            return $;
        }
    }

}