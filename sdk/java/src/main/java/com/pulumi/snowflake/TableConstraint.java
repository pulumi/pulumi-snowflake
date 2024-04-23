// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.snowflake.TableConstraintArgs;
import com.pulumi.snowflake.Utilities;
import com.pulumi.snowflake.inputs.TableConstraintState;
import com.pulumi.snowflake.outputs.TableConstraintForeignKeyProperties;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.snowflake.Database;
 * import com.pulumi.snowflake.DatabaseArgs;
 * import com.pulumi.snowflake.Schema;
 * import com.pulumi.snowflake.SchemaArgs;
 * import com.pulumi.snowflake.Table;
 * import com.pulumi.snowflake.TableArgs;
 * import com.pulumi.snowflake.inputs.TableColumnArgs;
 * import com.pulumi.snowflake.TableConstraint;
 * import com.pulumi.snowflake.TableConstraintArgs;
 * import com.pulumi.snowflake.inputs.TableConstraintForeignKeyPropertiesArgs;
 * import com.pulumi.snowflake.inputs.TableConstraintForeignKeyPropertiesReferencesArgs;
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
 *         var d = new Database(&#34;d&#34;, DatabaseArgs.builder()        
 *             .name(&#34;some_db&#34;)
 *             .build());
 * 
 *         var s = new Schema(&#34;s&#34;, SchemaArgs.builder()        
 *             .name(&#34;some_schema&#34;)
 *             .database(d.name())
 *             .build());
 * 
 *         var t = new Table(&#34;t&#34;, TableArgs.builder()        
 *             .database(d.name())
 *             .schema(s.name())
 *             .name(&#34;some_table&#34;)
 *             .columns(            
 *                 TableColumnArgs.builder()
 *                     .name(&#34;col1&#34;)
 *                     .type(&#34;text&#34;)
 *                     .nullable(false)
 *                     .build(),
 *                 TableColumnArgs.builder()
 *                     .name(&#34;col2&#34;)
 *                     .type(&#34;text&#34;)
 *                     .nullable(false)
 *                     .build(),
 *                 TableColumnArgs.builder()
 *                     .name(&#34;col3&#34;)
 *                     .type(&#34;text&#34;)
 *                     .nullable(false)
 *                     .build())
 *             .build());
 * 
 *         var fkT = new Table(&#34;fkT&#34;, TableArgs.builder()        
 *             .database(d.name())
 *             .schema(s.name())
 *             .name(&#34;fk_table&#34;)
 *             .columns(            
 *                 TableColumnArgs.builder()
 *                     .name(&#34;fk_col1&#34;)
 *                     .type(&#34;text&#34;)
 *                     .nullable(false)
 *                     .build(),
 *                 TableColumnArgs.builder()
 *                     .name(&#34;fk_col2&#34;)
 *                     .type(&#34;text&#34;)
 *                     .nullable(false)
 *                     .build())
 *             .build());
 * 
 *         var primaryKey = new TableConstraint(&#34;primaryKey&#34;, TableConstraintArgs.builder()        
 *             .name(&#34;myconstraint&#34;)
 *             .type(&#34;PRIMARY KEY&#34;)
 *             .tableId(t.qualifiedName())
 *             .columns(&#34;col1&#34;)
 *             .comment(&#34;hello world&#34;)
 *             .build());
 * 
 *         var foreignKey = new TableConstraint(&#34;foreignKey&#34;, TableConstraintArgs.builder()        
 *             .name(&#34;myconstraintfk&#34;)
 *             .type(&#34;FOREIGN KEY&#34;)
 *             .tableId(t.qualifiedName())
 *             .columns(&#34;col2&#34;)
 *             .foreignKeyProperties(TableConstraintForeignKeyPropertiesArgs.builder()
 *                 .references(TableConstraintForeignKeyPropertiesReferencesArgs.builder()
 *                     .tableId(fkT.qualifiedName())
 *                     .columns(&#34;fk_col1&#34;)
 *                     .build())
 *                 .build())
 *             .enforced(false)
 *             .deferrable(false)
 *             .initially(&#34;IMMEDIATE&#34;)
 *             .comment(&#34;hello fk&#34;)
 *             .build());
 * 
 *         var unique = new TableConstraint(&#34;unique&#34;, TableConstraintArgs.builder()        
 *             .name(&#34;unique&#34;)
 *             .type(&#34;UNIQUE&#34;)
 *             .tableId(t.qualifiedName())
 *             .columns(&#34;col3&#34;)
 *             .comment(&#34;hello unique&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import snowflake:index/tableConstraint:TableConstraint example &#39;myconstraintfk❄️FOREIGN KEY❄️test|test|table&#39;
 * ```
 * 
 */
@ResourceType(type="snowflake:index/tableConstraint:TableConstraint")
public class TableConstraint extends com.pulumi.resources.CustomResource {
    /**
     * Columns to use in constraint key
     * 
     */
    @Export(name="columns", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> columns;

    /**
     * @return Columns to use in constraint key
     * 
     */
    public Output<List<String>> columns() {
        return this.columns;
    }
    /**
     * Comment for the table constraint
     * 
     * @deprecated
     * Not used. Will be removed.
     * 
     */
    @Deprecated /* Not used. Will be removed. */
    @Export(name="comment", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> comment;

    /**
     * @return Comment for the table constraint
     * 
     */
    public Output<Optional<String>> comment() {
        return Codegen.optional(this.comment);
    }
    /**
     * Whether the constraint is deferrable
     * 
     */
    @Export(name="deferrable", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> deferrable;

    /**
     * @return Whether the constraint is deferrable
     * 
     */
    public Output<Optional<Boolean>> deferrable() {
        return Codegen.optional(this.deferrable);
    }
    /**
     * Specifies whether the constraint is enabled or disabled. These properties are provided for compatibility with Oracle.
     * 
     */
    @Export(name="enable", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enable;

    /**
     * @return Specifies whether the constraint is enabled or disabled. These properties are provided for compatibility with Oracle.
     * 
     */
    public Output<Optional<Boolean>> enable() {
        return Codegen.optional(this.enable);
    }
    /**
     * Whether the constraint is enforced
     * 
     */
    @Export(name="enforced", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enforced;

    /**
     * @return Whether the constraint is enforced
     * 
     */
    public Output<Optional<Boolean>> enforced() {
        return Codegen.optional(this.enforced);
    }
    /**
     * Additional properties when type is set to foreign key. Not applicable for primary/unique keys
     * 
     */
    @Export(name="foreignKeyProperties", refs={TableConstraintForeignKeyProperties.class}, tree="[0]")
    private Output</* @Nullable */ TableConstraintForeignKeyProperties> foreignKeyProperties;

    /**
     * @return Additional properties when type is set to foreign key. Not applicable for primary/unique keys
     * 
     */
    public Output<Optional<TableConstraintForeignKeyProperties>> foreignKeyProperties() {
        return Codegen.optional(this.foreignKeyProperties);
    }
    /**
     * Whether the constraint is initially deferred or immediate
     * 
     */
    @Export(name="initially", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> initially;

    /**
     * @return Whether the constraint is initially deferred or immediate
     * 
     */
    public Output<Optional<String>> initially() {
        return Codegen.optional(this.initially);
    }
    /**
     * Name of constraint
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of constraint
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Specifies whether a constraint in NOVALIDATE mode is taken into account during query rewrite.
     * 
     */
    @Export(name="rely", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> rely;

    /**
     * @return Specifies whether a constraint in NOVALIDATE mode is taken into account during query rewrite.
     * 
     */
    public Output<Optional<Boolean>> rely() {
        return Codegen.optional(this.rely);
    }
    /**
     * Identifier for table to create constraint on. Format must follow: &#34;\&#34;&amp;lt;db*name&amp;gt;\&#34;.\&#34;&amp;lt;schema*name&amp;gt;\&#34;.\&#34;&amp;lt;table*name&amp;gt;\&#34;&#34; or &#34;&amp;lt;db*name&amp;gt;.&amp;lt;schema*name&amp;gt;.&amp;lt;table*name&amp;gt;&#34; (snowflake*table.my*table.id)
     * 
     */
    @Export(name="tableId", refs={String.class}, tree="[0]")
    private Output<String> tableId;

    /**
     * @return Identifier for table to create constraint on. Format must follow: &#34;\&#34;&amp;lt;db*name&amp;gt;\&#34;.\&#34;&amp;lt;schema*name&amp;gt;\&#34;.\&#34;&amp;lt;table*name&amp;gt;\&#34;&#34; or &#34;&amp;lt;db*name&amp;gt;.&amp;lt;schema*name&amp;gt;.&amp;lt;table*name&amp;gt;&#34; (snowflake*table.my*table.id)
     * 
     */
    public Output<String> tableId() {
        return this.tableId;
    }
    /**
     * Type of constraint, one of &#39;UNIQUE&#39;, &#39;PRIMARY KEY&#39;, or &#39;FOREIGN KEY&#39;
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return Type of constraint, one of &#39;UNIQUE&#39;, &#39;PRIMARY KEY&#39;, or &#39;FOREIGN KEY&#39;
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * Specifies whether to validate existing data on the table when a constraint is created. Only used in conjunction with the ENABLE property.
     * 
     */
    @Export(name="validate", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> validate;

    /**
     * @return Specifies whether to validate existing data on the table when a constraint is created. Only used in conjunction with the ENABLE property.
     * 
     */
    public Output<Optional<Boolean>> validate() {
        return Codegen.optional(this.validate);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TableConstraint(String name) {
        this(name, TableConstraintArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TableConstraint(String name, TableConstraintArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TableConstraint(String name, TableConstraintArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/tableConstraint:TableConstraint", name, args == null ? TableConstraintArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TableConstraint(String name, Output<String> id, @Nullable TableConstraintState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/tableConstraint:TableConstraint", name, state, makeResourceOptions(options, id));
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
    public static TableConstraint get(String name, Output<String> id, @Nullable TableConstraintState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TableConstraint(name, id, state, options);
    }
}
