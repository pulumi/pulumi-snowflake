// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.snowflake.SchemaArgs;
import com.pulumi.snowflake.Utilities;
import com.pulumi.snowflake.inputs.SchemaState;
import com.pulumi.snowflake.outputs.SchemaTag;
import java.lang.Boolean;
import java.lang.Integer;
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
 * import com.pulumi.snowflake.Schema;
 * import com.pulumi.snowflake.SchemaArgs;
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
 *         var schema = new Schema("schema", SchemaArgs.builder()
 *             .database("database")
 *             .name("schema")
 *             .comment("A schema.")
 *             .isTransient(false)
 *             .isManaged(false)
 *             .dataRetentionDays(1)
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
 * format is dbName | schemaName
 * 
 * ```sh
 * $ pulumi import snowflake:index/schema:Schema example &#39;dbName|schemaName&#39;
 * ```
 * 
 */
@ResourceType(type="snowflake:index/schema:Schema")
public class Schema extends com.pulumi.resources.CustomResource {
    /**
     * Specifies a comment for the schema.
     * 
     */
    @Export(name="comment", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> comment;

    /**
     * @return Specifies a comment for the schema.
     * 
     */
    public Output<Optional<String>> comment() {
        return Codegen.optional(this.comment);
    }
    /**
     * Specifies the number of days for which Time Travel actions (CLONE and UNDROP) can be performed on the schema, as well as specifying the default Time Travel retention time for all tables created in the schema. Default value for this field is set to -1, which is a fallback to use Snowflake default.
     * 
     */
    @Export(name="dataRetentionDays", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> dataRetentionDays;

    /**
     * @return Specifies the number of days for which Time Travel actions (CLONE and UNDROP) can be performed on the schema, as well as specifying the default Time Travel retention time for all tables created in the schema. Default value for this field is set to -1, which is a fallback to use Snowflake default.
     * 
     */
    public Output<Optional<Integer>> dataRetentionDays() {
        return Codegen.optional(this.dataRetentionDays);
    }
    /**
     * The database in which to create the schema.
     * 
     */
    @Export(name="database", refs={String.class}, tree="[0]")
    private Output<String> database;

    /**
     * @return The database in which to create the schema.
     * 
     */
    public Output<String> database() {
        return this.database;
    }
    /**
     * Specifies a managed schema. Managed access schemas centralize privilege management with the schema owner.
     * 
     */
    @Export(name="isManaged", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> isManaged;

    /**
     * @return Specifies a managed schema. Managed access schemas centralize privilege management with the schema owner.
     * 
     */
    public Output<Optional<Boolean>> isManaged() {
        return Codegen.optional(this.isManaged);
    }
    /**
     * Specifies a schema as transient. Transient schemas do not have a Fail-safe period so they do not incur additional storage costs once they leave Time Travel; however, this means they are also not protected by Fail-safe in the event of a data loss.
     * 
     */
    @Export(name="isTransient", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> isTransient;

    /**
     * @return Specifies a schema as transient. Transient schemas do not have a Fail-safe period so they do not incur additional storage costs once they leave Time Travel; however, this means they are also not protected by Fail-safe in the event of a data loss.
     * 
     */
    public Output<Optional<Boolean>> isTransient() {
        return Codegen.optional(this.isTransient);
    }
    /**
     * Specifies the identifier for the schema; must be unique for the database in which the schema is created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Specifies the identifier for the schema; must be unique for the database in which the schema is created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Definitions of a tag to associate with the resource.
     * 
     * @deprecated
     * Use the &#39;snowflake_tag_association&#39; resource instead.
     * 
     */
    @Deprecated /* Use the 'snowflake_tag_association' resource instead. */
    @Export(name="tags", refs={List.class,SchemaTag.class}, tree="[0,1]")
    private Output</* @Nullable */ List<SchemaTag>> tags;

    /**
     * @return Definitions of a tag to associate with the resource.
     * 
     */
    public Output<Optional<List<SchemaTag>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Schema(String name) {
        this(name, SchemaArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Schema(String name, SchemaArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Schema(String name, SchemaArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/schema:Schema", name, args == null ? SchemaArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Schema(String name, Output<String> id, @Nullable SchemaState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/schema:Schema", name, state, makeResourceOptions(options, id));
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
    public static Schema get(String name, Output<String> id, @Nullable SchemaState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Schema(name, id, state, options);
    }
}
