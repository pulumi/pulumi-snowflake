// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.snowflake.ExternalTableArgs;
import com.pulumi.snowflake.Utilities;
import com.pulumi.snowflake.inputs.ExternalTableState;
import com.pulumi.snowflake.outputs.ExternalTableColumn;
import com.pulumi.snowflake.outputs.ExternalTableTag;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
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
 * import com.pulumi.snowflake.ExternalTable;
 * import com.pulumi.snowflake.ExternalTableArgs;
 * import com.pulumi.snowflake.inputs.ExternalTableColumnArgs;
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
 *         var externalTable = new ExternalTable(&#34;externalTable&#34;, ExternalTableArgs.builder()        
 *             .columns(            
 *                 ExternalTableColumnArgs.builder()
 *                     .name(&#34;id&#34;)
 *                     .type(&#34;int&#34;)
 *                     .build(),
 *                 ExternalTableColumnArgs.builder()
 *                     .name(&#34;data&#34;)
 *                     .type(&#34;text&#34;)
 *                     .build())
 *             .comment(&#34;External table&#34;)
 *             .database(&#34;db&#34;)
 *             .schema(&#34;schema&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * # format is database name | schema name | external table name
 * 
 * ```sh
 *  $ pulumi import snowflake:index/externalTable:ExternalTable example &#39;dbName|schemaName|externalTableName&#39;
 * ```
 * 
 */
@ResourceType(type="snowflake:index/externalTable:ExternalTable")
public class ExternalTable extends com.pulumi.resources.CustomResource {
    /**
     * Specifies whether to automatically refresh the external table metadata once, immediately after the external table is created.
     * 
     */
    @Export(name="autoRefresh", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> autoRefresh;

    /**
     * @return Specifies whether to automatically refresh the external table metadata once, immediately after the external table is created.
     * 
     */
    public Output<Optional<Boolean>> autoRefresh() {
        return Codegen.optional(this.autoRefresh);
    }
    /**
     * Specifies the aws sns topic for the external table.
     * 
     */
    @Export(name="awsSnsTopic", type=String.class, parameters={})
    private Output</* @Nullable */ String> awsSnsTopic;

    /**
     * @return Specifies the aws sns topic for the external table.
     * 
     */
    public Output<Optional<String>> awsSnsTopic() {
        return Codegen.optional(this.awsSnsTopic);
    }
    /**
     * Definitions of a column to create in the external table. Minimum one required.
     * 
     */
    @Export(name="columns", type=List.class, parameters={ExternalTableColumn.class})
    private Output<List<ExternalTableColumn>> columns;

    /**
     * @return Definitions of a column to create in the external table. Minimum one required.
     * 
     */
    public Output<List<ExternalTableColumn>> columns() {
        return this.columns;
    }
    /**
     * Specifies a comment for the external table.
     * 
     */
    @Export(name="comment", type=String.class, parameters={})
    private Output</* @Nullable */ String> comment;

    /**
     * @return Specifies a comment for the external table.
     * 
     */
    public Output<Optional<String>> comment() {
        return Codegen.optional(this.comment);
    }
    /**
     * Specifies to retain the access permissions from the original table when an external table is recreated using the CREATE OR REPLACE TABLE variant
     * 
     */
    @Export(name="copyGrants", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> copyGrants;

    /**
     * @return Specifies to retain the access permissions from the original table when an external table is recreated using the CREATE OR REPLACE TABLE variant
     * 
     */
    public Output<Optional<Boolean>> copyGrants() {
        return Codegen.optional(this.copyGrants);
    }
    /**
     * The database in which to create the external table.
     * 
     */
    @Export(name="database", type=String.class, parameters={})
    private Output<String> database;

    /**
     * @return The database in which to create the external table.
     * 
     */
    public Output<String> database() {
        return this.database;
    }
    /**
     * Specifies the file format for the external table.
     * 
     */
    @Export(name="fileFormat", type=String.class, parameters={})
    private Output<String> fileFormat;

    /**
     * @return Specifies the file format for the external table.
     * 
     */
    public Output<String> fileFormat() {
        return this.fileFormat;
    }
    /**
     * Specifies a location for the external table.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Specifies a location for the external table.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Specifies the identifier for the external table; must be unique for the database and schema in which the externalTable is created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies the identifier for the external table; must be unique for the database and schema in which the externalTable is created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Name of the role that owns the external table.
     * 
     */
    @Export(name="owner", type=String.class, parameters={})
    private Output<String> owner;

    /**
     * @return Name of the role that owns the external table.
     * 
     */
    public Output<String> owner() {
        return this.owner;
    }
    /**
     * Specifies any partition columns to evaluate for the external table.
     * 
     */
    @Export(name="partitionBies", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> partitionBies;

    /**
     * @return Specifies any partition columns to evaluate for the external table.
     * 
     */
    public Output<Optional<List<String>>> partitionBies() {
        return Codegen.optional(this.partitionBies);
    }
    /**
     * Specifies the file names and/or paths on the external stage to match.
     * 
     */
    @Export(name="pattern", type=String.class, parameters={})
    private Output</* @Nullable */ String> pattern;

    /**
     * @return Specifies the file names and/or paths on the external stage to match.
     * 
     */
    public Output<Optional<String>> pattern() {
        return Codegen.optional(this.pattern);
    }
    /**
     * Specifies weather to refresh when an external table is created.
     * 
     */
    @Export(name="refreshOnCreate", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> refreshOnCreate;

    /**
     * @return Specifies weather to refresh when an external table is created.
     * 
     */
    public Output<Optional<Boolean>> refreshOnCreate() {
        return Codegen.optional(this.refreshOnCreate);
    }
    /**
     * The schema in which to create the external table.
     * 
     */
    @Export(name="schema", type=String.class, parameters={})
    private Output<String> schema;

    /**
     * @return The schema in which to create the external table.
     * 
     */
    public Output<String> schema() {
        return this.schema;
    }
    /**
     * Definitions of a tag to associate with the resource.
     * 
     */
    @Export(name="tags", type=List.class, parameters={ExternalTableTag.class})
    private Output</* @Nullable */ List<ExternalTableTag>> tags;

    /**
     * @return Definitions of a tag to associate with the resource.
     * 
     */
    public Output<Optional<List<ExternalTableTag>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ExternalTable(String name) {
        this(name, ExternalTableArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ExternalTable(String name, ExternalTableArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ExternalTable(String name, ExternalTableArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/externalTable:ExternalTable", name, args == null ? ExternalTableArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ExternalTable(String name, Output<String> id, @Nullable ExternalTableState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/externalTable:ExternalTable", name, state, makeResourceOptions(options, id));
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
    public static ExternalTable get(String name, Output<String> id, @Nullable ExternalTableState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ExternalTable(name, id, state, options);
    }
}
