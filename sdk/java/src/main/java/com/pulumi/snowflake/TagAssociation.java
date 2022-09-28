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
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.snowflake.Database;
 * import com.pulumi.snowflake.Schema;
 * import com.pulumi.snowflake.SchemaArgs;
 * import com.pulumi.snowflake.Tag;
 * import com.pulumi.snowflake.TagArgs;
 * import com.pulumi.snowflake.TagAssociation;
 * import com.pulumi.snowflake.TagAssociationArgs;
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
 *         var database = new Database(&#34;database&#34;);
 * 
 *         var schema = new Schema(&#34;schema&#34;, SchemaArgs.builder()        
 *             .database(database.name())
 *             .build());
 * 
 *         var tag = new Tag(&#34;tag&#34;, TagArgs.builder()        
 *             .database(database.name())
 *             .schema(schema.name())
 *             .allowedValues(            
 *                 &#34;finance&#34;,
 *                 &#34;engineering&#34;)
 *             .build());
 * 
 *         var association = new TagAssociation(&#34;association&#34;, TagAssociationArgs.builder()        
 *             .objectName(database.name())
 *             .objectType(&#34;DATABASE&#34;)
 *             .tagId(tag.id())
 *             .tagValue(&#34;finance&#34;)
 *             .skipValidation(true)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * format is dbName.schemaName.tagName or dbName.schemaName.tagName
 * 
 * ```sh
 *  $ pulumi import snowflake:index/tagAssociation:TagAssociation example &#39;dbName.schemaName.tagName&#39;
 * ```
 * 
 */
@ResourceType(type="snowflake:index/tagAssociation:TagAssociation")
public class TagAssociation extends com.pulumi.resources.CustomResource {
    /**
     * Specifies the object identifier for the tag association.
     * 
     */
    @Export(name="objectName", type=String.class, parameters={})
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
    @Export(name="objectType", type=String.class, parameters={})
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
    @Export(name="skipValidation", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> skipValidation;

    /**
     * @return If true, skips validation of the tag association. It can take up to an hour for the SNOWFLAKE.TAG*REFERENCES table to update, and also requires ACCOUNT*ADMIN role to read from. https://docs.snowflake.com/en/sql-reference/account-usage/tag_references.html
     * 
     */
    public Output<Optional<Boolean>> skipValidation() {
        return Codegen.optional(this.skipValidation);
    }
    /**
     * Specifies the identifier for the tag. Note: format must follow: &#34;databaseName&#34;.&#34;schemaName&#34;.&#34;tagName&#34; or &#34;databaseName.schemaName.tagName&#34; or &#34;databaseName|schemaName.tagName&#34; (snowflake_tag.tag.id)
     * 
     */
    @Export(name="tagId", type=String.class, parameters={})
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
    @Export(name="tagValue", type=String.class, parameters={})
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
    public TagAssociation(String name) {
        this(name, TagAssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TagAssociation(String name, TagAssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TagAssociation(String name, TagAssociationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/tagAssociation:TagAssociation", name, args == null ? TagAssociationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TagAssociation(String name, Output<String> id, @Nullable TagAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/tagAssociation:TagAssociation", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
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
    public static TagAssociation get(String name, Output<String> id, @Nullable TagAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TagAssociation(name, id, state, options);
    }
}
