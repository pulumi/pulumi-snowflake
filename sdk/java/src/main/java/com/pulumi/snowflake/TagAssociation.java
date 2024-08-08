// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.snowflake.TagAssociationArgs;
import com.pulumi.snowflake.Utilities;
import com.pulumi.snowflake.inputs.TagAssociationState;
import com.pulumi.snowflake.outputs.TagAssociationObjectIdentifier;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.snowflake.Database;
 * import com.pulumi.snowflake.DatabaseArgs;
 * import com.pulumi.snowflake.Schema;
 * import com.pulumi.snowflake.SchemaArgs;
 * import com.pulumi.snowflake.Tag;
 * import com.pulumi.snowflake.TagArgs;
 * import com.pulumi.snowflake.TagAssociation;
 * import com.pulumi.snowflake.TagAssociationArgs;
 * import com.pulumi.snowflake.inputs.TagAssociationObjectIdentifierArgs;
 * import com.pulumi.snowflake.Table;
 * import com.pulumi.snowflake.TableArgs;
 * import com.pulumi.snowflake.inputs.TableColumnArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var test = new Database("test", DatabaseArgs.builder()
 *             .name("database")
 *             .build());
 * 
 *         var testSchema = new Schema("testSchema", SchemaArgs.builder()
 *             .name("schema")
 *             .database(test.name())
 *             .build());
 * 
 *         var testTag = new Tag("testTag", TagArgs.builder()
 *             .name("cost_center")
 *             .database(test.name())
 *             .schema(testSchema.name())
 *             .allowedValues(            
 *                 "finance",
 *                 "engineering")
 *             .build());
 * 
 *         var dbAssociation = new TagAssociation("dbAssociation", TagAssociationArgs.builder()
 *             .objectIdentifiers(TagAssociationObjectIdentifierArgs.builder()
 *                 .name(test.name())
 *                 .build())
 *             .objectType("DATABASE")
 *             .tagId(testTag.id())
 *             .tagValue("finance")
 *             .build());
 * 
 *         var testTable = new Table("testTable", TableArgs.builder()
 *             .database(test.name())
 *             .schema(testSchema.name())
 *             .name("TABLE_NAME")
 *             .comment("Terraform example table")
 *             .columns(            
 *                 TableColumnArgs.builder()
 *                     .name("column1")
 *                     .type("VARIANT")
 *                     .build(),
 *                 TableColumnArgs.builder()
 *                     .name("column2")
 *                     .type("VARCHAR(16)")
 *                     .build())
 *             .build());
 * 
 *         var tableAssociation = new TagAssociation("tableAssociation", TagAssociationArgs.builder()
 *             .objectIdentifiers(TagAssociationObjectIdentifierArgs.builder()
 *                 .name(testTable.name())
 *                 .database(test.name())
 *                 .schema(testSchema.name())
 *                 .build())
 *             .objectType("TABLE")
 *             .tagId(testTag.id())
 *             .tagValue("engineering")
 *             .build());
 * 
 *         var columnAssociation = new TagAssociation("columnAssociation", TagAssociationArgs.builder()
 *             .objectIdentifiers(TagAssociationObjectIdentifierArgs.builder()
 *                 .name(testTable.name().applyValue(name -> String.format("%s.column_name", name)))
 *                 .database(test.name())
 *                 .schema(testSchema.name())
 *                 .build())
 *             .objectType("COLUMN")
 *             .tagId(testTag.id())
 *             .tagValue("engineering")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * format is dbName.schemaName.tagName or dbName.schemaName.tagName
 * 
 * ```sh
 * $ pulumi import snowflake:index/tagAssociation:TagAssociation example &#39;dbName.schemaName.tagName&#39;
 * ```
 * 
 */
@ResourceType(type="snowflake:index/tagAssociation:TagAssociation")
public class TagAssociation extends com.pulumi.resources.CustomResource {
    /**
     * Specifies the object identifier for the tag association.
     * 
     */
    @Export(name="objectIdentifiers", refs={List.class,TagAssociationObjectIdentifier.class}, tree="[0,1]")
    private Output<List<TagAssociationObjectIdentifier>> objectIdentifiers;

    /**
     * @return Specifies the object identifier for the tag association.
     * 
     */
    public Output<List<TagAssociationObjectIdentifier>> objectIdentifiers() {
        return this.objectIdentifiers;
    }
    /**
     * Specifies the object identifier for the tag association.
     * 
     * @deprecated
     * Use `object_identifier` instead
     * 
     */
    @Deprecated /* Use `object_identifier` instead */
    @Export(name="objectName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> objectName;

    /**
     * @return Specifies the object identifier for the tag association.
     * 
     */
    public Output<Optional<String>> objectName() {
        return Codegen.optional(this.objectName);
    }
    /**
     * Specifies the type of object to add a tag. Allowed object types: [ACCOUNT APPLICATION APPLICATION PACKAGE DATABASE INTEGRATION NETWORK POLICY ROLE SHARE USER WAREHOUSE DATABASE ROLE SCHEMA ALERT EXTERNAL FUNCTION EXTERNAL TABLE GIT REPOSITORY ICEBERG TABLE MATERIALIZED VIEW PIPE MASKING POLICY PASSWORD POLICY ROW ACCESS POLICY SESSION POLICY PROCEDURE STAGE STREAM TABLE TASK VIEW COLUMN EVENT TABLE].
     * 
     */
    @Export(name="objectType", refs={String.class}, tree="[0]")
    private Output<String> objectType;

    /**
     * @return Specifies the type of object to add a tag. Allowed object types: [ACCOUNT APPLICATION APPLICATION PACKAGE DATABASE INTEGRATION NETWORK POLICY ROLE SHARE USER WAREHOUSE DATABASE ROLE SCHEMA ALERT EXTERNAL FUNCTION EXTERNAL TABLE GIT REPOSITORY ICEBERG TABLE MATERIALIZED VIEW PIPE MASKING POLICY PASSWORD POLICY ROW ACCESS POLICY SESSION POLICY PROCEDURE STAGE STREAM TABLE TASK VIEW COLUMN EVENT TABLE].
     * 
     */
    public Output<String> objectType() {
        return this.objectType;
    }
    /**
     * If true, skips validation of the tag association.
     * 
     */
    @Export(name="skipValidation", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> skipValidation;

    /**
     * @return If true, skips validation of the tag association.
     * 
     */
    public Output<Optional<Boolean>> skipValidation() {
        return Codegen.optional(this.skipValidation);
    }
    /**
     * Specifies the identifier for the tag. Note: format must follow: &#34;databaseName&#34;.&#34;schemaName&#34;.&#34;tagName&#34; or &#34;databaseName.schemaName.tagName&#34; or &#34;databaseName|schemaName.tagName&#34; (snowflake_tag.tag.id)
     * 
     */
    @Export(name="tagId", refs={String.class}, tree="[0]")
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
    @Export(name="tagValue", refs={String.class}, tree="[0]")
    private Output<String> tagValue;

    /**
     * @return Specifies the value of the tag, (e.g. &#39;finance&#39; or &#39;engineering&#39;)
     * 
     */
    public Output<String> tagValue() {
        return this.tagValue;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TagAssociation(java.lang.String name) {
        this(name, TagAssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TagAssociation(java.lang.String name, TagAssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TagAssociation(java.lang.String name, TagAssociationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/tagAssociation:TagAssociation", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private TagAssociation(java.lang.String name, Output<java.lang.String> id, @Nullable TagAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/tagAssociation:TagAssociation", name, state, makeResourceOptions(options, id), false);
    }

    private static TagAssociationArgs makeArgs(TagAssociationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? TagAssociationArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static TagAssociation get(java.lang.String name, Output<java.lang.String> id, @Nullable TagAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TagAssociation(name, id, state, options);
    }
}
