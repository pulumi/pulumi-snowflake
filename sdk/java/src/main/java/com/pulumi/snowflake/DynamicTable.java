// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.snowflake.DynamicTableArgs;
import com.pulumi.snowflake.Utilities;
import com.pulumi.snowflake.inputs.DynamicTableState;
import com.pulumi.snowflake.outputs.DynamicTableTargetLag;
import java.lang.Boolean;
import java.lang.Integer;
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
 * import com.pulumi.snowflake.DynamicTable;
 * import com.pulumi.snowflake.DynamicTableArgs;
 * import com.pulumi.snowflake.inputs.DynamicTableTargetLagArgs;
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
 *         var dt = new DynamicTable(&#34;dt&#34;, DynamicTableArgs.builder()        
 *             .comment(&#34;example comment&#34;)
 *             .database(&#34;mydb&#34;)
 *             .query(&#34;SELECT product_id, product_name FROM \&#34;mydb\&#34;.\&#34;myschema\&#34;.\&#34;staging_table\&#34;&#34;)
 *             .schema(&#34;myschema&#34;)
 *             .targetLag(DynamicTableTargetLagArgs.builder()
 *                 .maximumDuration(&#34;20 minutes&#34;)
 *                 .build())
 *             .warehouse(&#34;mywh&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * ```sh
 *  $ pulumi import snowflake:index/dynamicTable:DynamicTable dt &#34;mydb|myschema|product&#34;
 * ```
 * 
 */
@ResourceType(type="snowflake:index/dynamicTable:DynamicTable")
public class DynamicTable extends com.pulumi.resources.CustomResource {
    /**
     * Whether auto-clustering is enabled on the dynamic table. Not currently supported for dynamic tables.
     * 
     */
    @Export(name="automaticClustering", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> automaticClustering;

    /**
     * @return Whether auto-clustering is enabled on the dynamic table. Not currently supported for dynamic tables.
     * 
     */
    public Output<Boolean> automaticClustering() {
        return this.automaticClustering;
    }
    /**
     * Number of bytes that will be scanned if the entire dynamic table is scanned in a query.
     * 
     */
    @Export(name="bytes", refs={Integer.class}, tree="[0]")
    private Output<Integer> bytes;

    /**
     * @return Number of bytes that will be scanned if the entire dynamic table is scanned in a query.
     * 
     */
    public Output<Integer> bytes() {
        return this.bytes;
    }
    /**
     * The clustering key for the dynamic table.
     * 
     */
    @Export(name="clusterBy", refs={String.class}, tree="[0]")
    private Output<String> clusterBy;

    /**
     * @return The clustering key for the dynamic table.
     * 
     */
    public Output<String> clusterBy() {
        return this.clusterBy;
    }
    /**
     * Specifies a comment for the dynamic table.
     * 
     */
    @Export(name="comment", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> comment;

    /**
     * @return Specifies a comment for the dynamic table.
     * 
     */
    public Output<Optional<String>> comment() {
        return Codegen.optional(this.comment);
    }
    /**
     * Timestamp of the data in the base object(s) that is included in the dynamic table.
     * 
     */
    @Export(name="dataTimestamp", refs={String.class}, tree="[0]")
    private Output<String> dataTimestamp;

    /**
     * @return Timestamp of the data in the base object(s) that is included in the dynamic table.
     * 
     */
    public Output<String> dataTimestamp() {
        return this.dataTimestamp;
    }
    /**
     * The database in which to create the dynamic table.
     * 
     */
    @Export(name="database", refs={String.class}, tree="[0]")
    private Output<String> database;

    /**
     * @return The database in which to create the dynamic table.
     * 
     */
    public Output<String> database() {
        return this.database;
    }
    /**
     * TRUE if the dynamic table has been cloned, else FALSE.
     * 
     */
    @Export(name="isClone", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> isClone;

    /**
     * @return TRUE if the dynamic table has been cloned, else FALSE.
     * 
     */
    public Output<Boolean> isClone() {
        return this.isClone;
    }
    /**
     * TRUE if the dynamic table is a replica. else FALSE.
     * 
     */
    @Export(name="isReplica", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> isReplica;

    /**
     * @return TRUE if the dynamic table is a replica. else FALSE.
     * 
     */
    public Output<Boolean> isReplica() {
        return this.isReplica;
    }
    /**
     * Timestamp of last suspension.
     * 
     */
    @Export(name="lastSuspendedOn", refs={String.class}, tree="[0]")
    private Output<String> lastSuspendedOn;

    /**
     * @return Timestamp of last suspension.
     * 
     */
    public Output<String> lastSuspendedOn() {
        return this.lastSuspendedOn;
    }
    /**
     * Specifies the identifier (i.e. name) for the dynamic table; must be unique for the schema in which the dynamic table is created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Specifies the identifier (i.e. name) for the dynamic table; must be unique for the schema in which the dynamic table is created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Specifies whether to replace the dynamic table if it already exists.
     * 
     */
    @Export(name="orReplace", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> orReplace;

    /**
     * @return Specifies whether to replace the dynamic table if it already exists.
     * 
     */
    public Output<Optional<Boolean>> orReplace() {
        return Codegen.optional(this.orReplace);
    }
    /**
     * Role that owns the dynamic table.
     * 
     */
    @Export(name="owner", refs={String.class}, tree="[0]")
    private Output<String> owner;

    /**
     * @return Role that owns the dynamic table.
     * 
     */
    public Output<String> owner() {
        return this.owner;
    }
    /**
     * Specifies the query to use to populate the dynamic table.
     * 
     */
    @Export(name="query", refs={String.class}, tree="[0]")
    private Output<String> query;

    /**
     * @return Specifies the query to use to populate the dynamic table.
     * 
     */
    public Output<String> query() {
        return this.query;
    }
    /**
     * INCREMENTAL if the dynamic table will use incremental refreshes, or FULL if it will recompute the whole table on every refresh.
     * 
     */
    @Export(name="refreshMode", refs={String.class}, tree="[0]")
    private Output<String> refreshMode;

    /**
     * @return INCREMENTAL if the dynamic table will use incremental refreshes, or FULL if it will recompute the whole table on every refresh.
     * 
     */
    public Output<String> refreshMode() {
        return this.refreshMode;
    }
    /**
     * Explanation for why FULL refresh mode was chosen. NULL if refresh mode is not FULL.
     * 
     */
    @Export(name="refreshModeReason", refs={String.class}, tree="[0]")
    private Output<String> refreshModeReason;

    /**
     * @return Explanation for why FULL refresh mode was chosen. NULL if refresh mode is not FULL.
     * 
     */
    public Output<String> refreshModeReason() {
        return this.refreshModeReason;
    }
    /**
     * Number of rows in the table.
     * 
     */
    @Export(name="rows", refs={Integer.class}, tree="[0]")
    private Output<Integer> rows;

    /**
     * @return Number of rows in the table.
     * 
     */
    public Output<Integer> rows() {
        return this.rows;
    }
    /**
     * Displays RUNNING for dynamic tables that are actively scheduling refreshes and SUSPENDED for suspended dynamic tables.
     * 
     */
    @Export(name="schedulingState", refs={String.class}, tree="[0]")
    private Output<String> schedulingState;

    /**
     * @return Displays RUNNING for dynamic tables that are actively scheduling refreshes and SUSPENDED for suspended dynamic tables.
     * 
     */
    public Output<String> schedulingState() {
        return this.schedulingState;
    }
    /**
     * The schema in which to create the dynamic table.
     * 
     */
    @Export(name="schema", refs={String.class}, tree="[0]")
    private Output<String> schema;

    /**
     * @return The schema in which to create the dynamic table.
     * 
     */
    public Output<String> schema() {
        return this.schema;
    }
    /**
     * Specifies the target lag time for the dynamic table.
     * 
     */
    @Export(name="targetLag", refs={DynamicTableTargetLag.class}, tree="[0]")
    private Output<DynamicTableTargetLag> targetLag;

    /**
     * @return Specifies the target lag time for the dynamic table.
     * 
     */
    public Output<DynamicTableTargetLag> targetLag() {
        return this.targetLag;
    }
    /**
     * The warehouse in which to create the dynamic table.
     * 
     */
    @Export(name="warehouse", refs={String.class}, tree="[0]")
    private Output<String> warehouse;

    /**
     * @return The warehouse in which to create the dynamic table.
     * 
     */
    public Output<String> warehouse() {
        return this.warehouse;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DynamicTable(String name) {
        this(name, DynamicTableArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DynamicTable(String name, DynamicTableArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DynamicTable(String name, DynamicTableArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/dynamicTable:DynamicTable", name, args == null ? DynamicTableArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DynamicTable(String name, Output<String> id, @Nullable DynamicTableState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/dynamicTable:DynamicTable", name, state, makeResourceOptions(options, id));
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
    public static DynamicTable get(String name, Output<String> id, @Nullable DynamicTableState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DynamicTable(name, id, state, options);
    }
}