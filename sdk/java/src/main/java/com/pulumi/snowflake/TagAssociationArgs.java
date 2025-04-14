// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TagAssociationArgs extends com.pulumi.resources.ResourceArgs {

    public static final TagAssociationArgs Empty = new TagAssociationArgs();

    /**
     * Specifies the object identifiers for the tag association.
     * 
     */
    @Import(name="objectIdentifiers", required=true)
    private Output<List<String>> objectIdentifiers;

    /**
     * @return Specifies the object identifiers for the tag association.
     * 
     */
    public Output<List<String>> objectIdentifiers() {
        return this.objectIdentifiers;
    }

    /**
     * Specifies the type of object to add a tag. Allowed object types: [ACCOUNT APPLICATION APPLICATION PACKAGE DATABASE FAILOVER GROUP INTEGRATION NETWORK POLICY REPLICATION GROUP ROLE SHARE USER WAREHOUSE DATABASE ROLE SCHEMA ALERT SNOWFLAKE.CORE.BUDGET SNOWFLAKE.ML.CLASSIFICATION EXTERNAL FUNCTION EXTERNAL TABLE FUNCTION GIT REPOSITORY ICEBERG TABLE MATERIALIZED VIEW PIPE MASKING POLICY PASSWORD POLICY ROW ACCESS POLICY SESSION POLICY PRIVACY POLICY PROCEDURE STAGE STREAM TABLE TASK VIEW COLUMN EVENT TABLE].
     * 
     */
    @Import(name="objectType", required=true)
    private Output<String> objectType;

    /**
     * @return Specifies the type of object to add a tag. Allowed object types: [ACCOUNT APPLICATION APPLICATION PACKAGE DATABASE FAILOVER GROUP INTEGRATION NETWORK POLICY REPLICATION GROUP ROLE SHARE USER WAREHOUSE DATABASE ROLE SCHEMA ALERT SNOWFLAKE.CORE.BUDGET SNOWFLAKE.ML.CLASSIFICATION EXTERNAL FUNCTION EXTERNAL TABLE FUNCTION GIT REPOSITORY ICEBERG TABLE MATERIALIZED VIEW PIPE MASKING POLICY PASSWORD POLICY ROW ACCESS POLICY SESSION POLICY PRIVACY POLICY PROCEDURE STAGE STREAM TABLE TASK VIEW COLUMN EVENT TABLE].
     * 
     */
    public Output<String> objectType() {
        return this.objectType;
    }

    /**
     * (Default: `true`) If true, skips validation of the tag association.
     * 
     */
    @Import(name="skipValidation")
    private @Nullable Output<Boolean> skipValidation;

    /**
     * @return (Default: `true`) If true, skips validation of the tag association.
     * 
     */
    public Optional<Output<Boolean>> skipValidation() {
        return Optional.ofNullable(this.skipValidation);
    }

    /**
     * Specifies the identifier for the tag.
     * 
     */
    @Import(name="tagId", required=true)
    private Output<String> tagId;

    /**
     * @return Specifies the identifier for the tag.
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
        this.objectIdentifiers = $.objectIdentifiers;
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
         * @param objectIdentifiers Specifies the object identifiers for the tag association.
         * 
         * @return builder
         * 
         */
        public Builder objectIdentifiers(Output<List<String>> objectIdentifiers) {
            $.objectIdentifiers = objectIdentifiers;
            return this;
        }

        /**
         * @param objectIdentifiers Specifies the object identifiers for the tag association.
         * 
         * @return builder
         * 
         */
        public Builder objectIdentifiers(List<String> objectIdentifiers) {
            return objectIdentifiers(Output.of(objectIdentifiers));
        }

        /**
         * @param objectIdentifiers Specifies the object identifiers for the tag association.
         * 
         * @return builder
         * 
         */
        public Builder objectIdentifiers(String... objectIdentifiers) {
            return objectIdentifiers(List.of(objectIdentifiers));
        }

        /**
         * @param objectType Specifies the type of object to add a tag. Allowed object types: [ACCOUNT APPLICATION APPLICATION PACKAGE DATABASE FAILOVER GROUP INTEGRATION NETWORK POLICY REPLICATION GROUP ROLE SHARE USER WAREHOUSE DATABASE ROLE SCHEMA ALERT SNOWFLAKE.CORE.BUDGET SNOWFLAKE.ML.CLASSIFICATION EXTERNAL FUNCTION EXTERNAL TABLE FUNCTION GIT REPOSITORY ICEBERG TABLE MATERIALIZED VIEW PIPE MASKING POLICY PASSWORD POLICY ROW ACCESS POLICY SESSION POLICY PRIVACY POLICY PROCEDURE STAGE STREAM TABLE TASK VIEW COLUMN EVENT TABLE].
         * 
         * @return builder
         * 
         */
        public Builder objectType(Output<String> objectType) {
            $.objectType = objectType;
            return this;
        }

        /**
         * @param objectType Specifies the type of object to add a tag. Allowed object types: [ACCOUNT APPLICATION APPLICATION PACKAGE DATABASE FAILOVER GROUP INTEGRATION NETWORK POLICY REPLICATION GROUP ROLE SHARE USER WAREHOUSE DATABASE ROLE SCHEMA ALERT SNOWFLAKE.CORE.BUDGET SNOWFLAKE.ML.CLASSIFICATION EXTERNAL FUNCTION EXTERNAL TABLE FUNCTION GIT REPOSITORY ICEBERG TABLE MATERIALIZED VIEW PIPE MASKING POLICY PASSWORD POLICY ROW ACCESS POLICY SESSION POLICY PRIVACY POLICY PROCEDURE STAGE STREAM TABLE TASK VIEW COLUMN EVENT TABLE].
         * 
         * @return builder
         * 
         */
        public Builder objectType(String objectType) {
            return objectType(Output.of(objectType));
        }

        /**
         * @param skipValidation (Default: `true`) If true, skips validation of the tag association.
         * 
         * @return builder
         * 
         */
        public Builder skipValidation(@Nullable Output<Boolean> skipValidation) {
            $.skipValidation = skipValidation;
            return this;
        }

        /**
         * @param skipValidation (Default: `true`) If true, skips validation of the tag association.
         * 
         * @return builder
         * 
         */
        public Builder skipValidation(Boolean skipValidation) {
            return skipValidation(Output.of(skipValidation));
        }

        /**
         * @param tagId Specifies the identifier for the tag.
         * 
         * @return builder
         * 
         */
        public Builder tagId(Output<String> tagId) {
            $.tagId = tagId;
            return this;
        }

        /**
         * @param tagId Specifies the identifier for the tag.
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
            if ($.objectIdentifiers == null) {
                throw new MissingRequiredPropertyException("TagAssociationArgs", "objectIdentifiers");
            }
            if ($.objectType == null) {
                throw new MissingRequiredPropertyException("TagAssociationArgs", "objectType");
            }
            if ($.tagId == null) {
                throw new MissingRequiredPropertyException("TagAssociationArgs", "tagId");
            }
            if ($.tagValue == null) {
                throw new MissingRequiredPropertyException("TagAssociationArgs", "tagValue");
            }
            return $;
        }
    }

}
