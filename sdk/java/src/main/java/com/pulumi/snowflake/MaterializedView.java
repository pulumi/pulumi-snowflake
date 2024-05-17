// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.snowflake.MaterializedViewArgs;
import com.pulumi.snowflake.Utilities;
import com.pulumi.snowflake.inputs.MaterializedViewState;
import com.pulumi.snowflake.outputs.MaterializedViewTag;
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
 * import com.pulumi.snowflake.MaterializedView;
 * import com.pulumi.snowflake.MaterializedViewArgs;
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
 *         var view = new MaterializedView("view", MaterializedViewArgs.builder()
 *             .database("db")
 *             .schema("schema")
 *             .name("view")
 *             .warehouse("warehouse")
 *             .comment("comment")
 *             .statement("""
 * select * from foo;
 *             """)
 *             .orReplace(false)
 *             .isSecure(false)
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
 * format is database name | schema name | view name
 * 
 * ```sh
 * $ pulumi import snowflake:index/materializedView:MaterializedView example &#39;dbName|schemaName|viewName&#39;
 * ```
 * 
 */
@ResourceType(type="snowflake:index/materializedView:MaterializedView")
public class MaterializedView extends com.pulumi.resources.CustomResource {
    /**
     * Specifies a comment for the view.
     * 
     */
    @Export(name="comment", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> comment;

    /**
     * @return Specifies a comment for the view.
     * 
     */
    public Output<Optional<String>> comment() {
        return Codegen.optional(this.comment);
    }
    /**
     * The database in which to create the view. Don&#39;t use the | character.
     * 
     */
    @Export(name="database", refs={String.class}, tree="[0]")
    private Output<String> database;

    /**
     * @return The database in which to create the view. Don&#39;t use the | character.
     * 
     */
    public Output<String> database() {
        return this.database;
    }
    /**
     * Specifies that the view is secure.
     * 
     */
    @Export(name="isSecure", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> isSecure;

    /**
     * @return Specifies that the view is secure.
     * 
     */
    public Output<Optional<Boolean>> isSecure() {
        return Codegen.optional(this.isSecure);
    }
    /**
     * Specifies the identifier for the view; must be unique for the schema in which the view is created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Specifies the identifier for the view; must be unique for the schema in which the view is created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Overwrites the View if it exists.
     * 
     */
    @Export(name="orReplace", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> orReplace;

    /**
     * @return Overwrites the View if it exists.
     * 
     */
    public Output<Optional<Boolean>> orReplace() {
        return Codegen.optional(this.orReplace);
    }
    /**
     * The schema in which to create the view. Don&#39;t use the | character.
     * 
     */
    @Export(name="schema", refs={String.class}, tree="[0]")
    private Output<String> schema;

    /**
     * @return The schema in which to create the view. Don&#39;t use the | character.
     * 
     */
    public Output<String> schema() {
        return this.schema;
    }
    /**
     * Specifies the query used to create the view.
     * 
     */
    @Export(name="statement", refs={String.class}, tree="[0]")
    private Output<String> statement;

    /**
     * @return Specifies the query used to create the view.
     * 
     */
    public Output<String> statement() {
        return this.statement;
    }
    /**
     * Definitions of a tag to associate with the resource.
     * 
     * @deprecated
     * Use the &#39;snowflake_tag_association&#39; resource instead.
     * 
     */
    @Deprecated /* Use the 'snowflake_tag_association' resource instead. */
    @Export(name="tags", refs={List.class,MaterializedViewTag.class}, tree="[0,1]")
    private Output</* @Nullable */ List<MaterializedViewTag>> tags;

    /**
     * @return Definitions of a tag to associate with the resource.
     * 
     */
    public Output<Optional<List<MaterializedViewTag>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The warehouse name.
     * 
     */
    @Export(name="warehouse", refs={String.class}, tree="[0]")
    private Output<String> warehouse;

    /**
     * @return The warehouse name.
     * 
     */
    public Output<String> warehouse() {
        return this.warehouse;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MaterializedView(String name) {
        this(name, MaterializedViewArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MaterializedView(String name, MaterializedViewArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MaterializedView(String name, MaterializedViewArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/materializedView:MaterializedView", name, args == null ? MaterializedViewArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private MaterializedView(String name, Output<String> id, @Nullable MaterializedViewState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/materializedView:MaterializedView", name, state, makeResourceOptions(options, id));
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
    public static MaterializedView get(String name, Output<String> id, @Nullable MaterializedViewState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new MaterializedView(name, id, state, options);
    }
}
