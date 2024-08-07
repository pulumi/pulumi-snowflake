// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.snowflake.Utilities;
import com.pulumi.snowflake.ViewArgs;
import com.pulumi.snowflake.inputs.ViewState;
import com.pulumi.snowflake.outputs.ViewTag;
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
 * import com.pulumi.snowflake.View;
 * import com.pulumi.snowflake.ViewArgs;
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
 *         var view = new View("view", ViewArgs.builder()
 *             .database("database")
 *             .schema("schema")
 *             .name("view")
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
 * $ pulumi import snowflake:index/view:View example &#39;dbName|schemaName|viewName&#39;
 * ```
 * 
 */
@ResourceType(type="snowflake:index/view:View")
public class View extends com.pulumi.resources.CustomResource {
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
     * Retains the access permissions from the original view when a new view is created using the OR REPLACE clause. OR REPLACE must be set when COPY GRANTS is set.
     * 
     */
    @Export(name="copyGrants", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> copyGrants;

    /**
     * @return Retains the access permissions from the original view when a new view is created using the OR REPLACE clause. OR REPLACE must be set when COPY GRANTS is set.
     * 
     */
    public Output<Optional<Boolean>> copyGrants() {
        return Codegen.optional(this.copyGrants);
    }
    /**
     * The timestamp at which the view was created.
     * 
     */
    @Export(name="createdOn", refs={String.class}, tree="[0]")
    private Output<String> createdOn;

    /**
     * @return The timestamp at which the view was created.
     * 
     */
    public Output<String> createdOn() {
        return this.createdOn;
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
    @Export(name="isSecure", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> isSecure;

    public Output<Optional<Boolean>> isSecure() {
        return Codegen.optional(this.isSecure);
    }
    /**
     * Specifies the identifier for the view; must be unique for the schema in which the view is created. Don&#39;t use the | character.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Specifies the identifier for the view; must be unique for the schema in which the view is created. Don&#39;t use the | character.
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
    @Export(name="tags", refs={List.class,ViewTag.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ViewTag>> tags;

    /**
     * @return Definitions of a tag to associate with the resource.
     * 
     */
    public Output<Optional<List<ViewTag>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public View(String name) {
        this(name, ViewArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public View(String name, ViewArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public View(String name, ViewArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/view:View", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()));
    }

    private View(String name, Output<String> id, @Nullable ViewState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/view:View", name, state, makeResourceOptions(options, id));
    }

    private static ViewArgs makeArgs(ViewArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ViewArgs.Empty : args;
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
    public static View get(String name, Output<String> id, @Nullable ViewState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new View(name, id, state, options);
    }
}
