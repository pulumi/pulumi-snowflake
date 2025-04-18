// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.snowflake.TableArgs;
import com.pulumi.snowflake.Utilities;
import com.pulumi.snowflake.inputs.TableState;
import com.pulumi.snowflake.outputs.TableColumn;
import com.pulumi.snowflake.outputs.TablePrimaryKey;
import com.pulumi.snowflake.outputs.TableTag;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * format is database name | schema name | table name
 * 
 * ```sh
 * $ pulumi import snowflake:index/table:Table example &#39;databaseName|schemaName|tableName&#39;
 * ```
 * 
 */
@ResourceType(type="snowflake:index/table:Table")
public class Table extends com.pulumi.resources.CustomResource {
    /**
     * (Default: `false`) Specifies whether to enable change tracking on the table. Default false.
     * 
     */
    @Export(name="changeTracking", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> changeTracking;

    /**
     * @return (Default: `false`) Specifies whether to enable change tracking on the table. Default false.
     * 
     */
    public Output<Optional<Boolean>> changeTracking() {
        return Codegen.optional(this.changeTracking);
    }
    /**
     * A list of one or more table columns/expressions to be used as clustering key(s) for the table
     * 
     */
    @Export(name="clusterBies", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> clusterBies;

    /**
     * @return A list of one or more table columns/expressions to be used as clustering key(s) for the table
     * 
     */
    public Output<Optional<List<String>>> clusterBies() {
        return Codegen.optional(this.clusterBies);
    }
    /**
     * Definitions of a column to create in the table. Minimum one required.
     * 
     */
    @Export(name="columns", refs={List.class,TableColumn.class}, tree="[0,1]")
    private Output<List<TableColumn>> columns;

    /**
     * @return Definitions of a column to create in the table. Minimum one required.
     * 
     */
    public Output<List<TableColumn>> columns() {
        return this.columns;
    }
    /**
     * Specifies a comment for the table.
     * 
     */
    @Export(name="comment", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> comment;

    /**
     * @return Specifies a comment for the table.
     * 
     */
    public Output<Optional<String>> comment() {
        return Codegen.optional(this.comment);
    }
    /**
     * (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`-1`)) Specifies the retention period for the table so that Time Travel actions (SELECT, CLONE, UNDROP) can be performed on historical data in the table. If you wish to inherit the parent schema setting then pass in the schema attribute to this argument or do not fill this parameter at all; the default value for this field is -1, which is a fallback to use Snowflake default - in this case the schema value
     * 
     */
    @Export(name="dataRetentionTimeInDays", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> dataRetentionTimeInDays;

    /**
     * @return (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`-1`)) Specifies the retention period for the table so that Time Travel actions (SELECT, CLONE, UNDROP) can be performed on historical data in the table. If you wish to inherit the parent schema setting then pass in the schema attribute to this argument or do not fill this parameter at all; the default value for this field is -1, which is a fallback to use Snowflake default - in this case the schema value
     * 
     */
    public Output<Optional<Integer>> dataRetentionTimeInDays() {
        return Codegen.optional(this.dataRetentionTimeInDays);
    }
    /**
     * The database in which to create the table.
     * 
     */
    @Export(name="database", refs={String.class}, tree="[0]")
    private Output<String> database;

    /**
     * @return The database in which to create the table.
     * 
     */
    public Output<String> database() {
        return this.database;
    }
    /**
     * Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
     * 
     */
    @Export(name="fullyQualifiedName", refs={String.class}, tree="[0]")
    private Output<String> fullyQualifiedName;

    /**
     * @return Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
     * 
     */
    public Output<String> fullyQualifiedName() {
        return this.fullyQualifiedName;
    }
    /**
     * Specifies the identifier for the table; must be unique for the database and schema in which the table is created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Specifies the identifier for the table; must be unique for the database and schema in which the table is created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Name of the role that owns the table.
     * 
     */
    @Export(name="owner", refs={String.class}, tree="[0]")
    private Output<String> owner;

    /**
     * @return Name of the role that owns the table.
     * 
     */
    public Output<String> owner() {
        return this.owner;
    }
    /**
     * Definitions of primary key constraint to create on table
     * 
     * @deprecated
     * Use snowflake.TableConstraint instead
     * 
     */
    @Deprecated /* Use snowflake.TableConstraint instead */
    @Export(name="primaryKey", refs={TablePrimaryKey.class}, tree="[0]")
    private Output</* @Nullable */ TablePrimaryKey> primaryKey;

    /**
     * @return Definitions of primary key constraint to create on table
     * 
     */
    public Output<Optional<TablePrimaryKey>> primaryKey() {
        return Codegen.optional(this.primaryKey);
    }
    /**
     * The schema in which to create the table.
     * 
     */
    @Export(name="schema", refs={String.class}, tree="[0]")
    private Output<String> schema;

    /**
     * @return The schema in which to create the table.
     * 
     */
    public Output<String> schema() {
        return this.schema;
    }
    /**
     * Definitions of a tag to associate with the resource.
     * 
     * @deprecated
     * Use the &#39;snowflake_tag_association&#39; resource instead.
     * 
     */
    @Deprecated /* Use the 'snowflake_tag_association' resource instead. */
    @Export(name="tags", refs={List.class,TableTag.class}, tree="[0,1]")
    private Output</* @Nullable */ List<TableTag>> tags;

    /**
     * @return Definitions of a tag to associate with the resource.
     * 
     */
    public Output<Optional<List<TableTag>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Table(java.lang.String name) {
        this(name, TableArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Table(java.lang.String name, TableArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Table(java.lang.String name, TableArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/table:Table", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Table(java.lang.String name, Output<java.lang.String> id, @Nullable TableState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/table:Table", name, state, makeResourceOptions(options, id), false);
    }

    private static TableArgs makeArgs(TableArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? TableArgs.Empty : args;
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
    public static Table get(java.lang.String name, Output<java.lang.String> id, @Nullable TableState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Table(name, id, state, options);
    }
}
