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
 * ## Import
 * 
 * format is database name | schema name | external table name
 * 
 * ```sh
 * $ pulumi import snowflake:index/externalTable:ExternalTable example &#39;dbName|schemaName|externalTableName&#39;
 * ```
 * 
 */
@ResourceType(type="snowflake:index/externalTable:ExternalTable")
public class ExternalTable extends com.pulumi.resources.CustomResource {
    /**
     * (Default: `true`) Specifies whether to automatically refresh the external table metadata once, immediately after the external table is created.
     * 
     */
    @Export(name="autoRefresh", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> autoRefresh;

    /**
     * @return (Default: `true`) Specifies whether to automatically refresh the external table metadata once, immediately after the external table is created.
     * 
     */
    public Output<Optional<Boolean>> autoRefresh() {
        return Codegen.optional(this.autoRefresh);
    }
    /**
     * Specifies the aws sns topic for the external table.
     * 
     */
    @Export(name="awsSnsTopic", refs={String.class}, tree="[0]")
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
    @Export(name="columns", refs={List.class,ExternalTableColumn.class}, tree="[0,1]")
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
    @Export(name="comment", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> comment;

    /**
     * @return Specifies a comment for the external table.
     * 
     */
    public Output<Optional<String>> comment() {
        return Codegen.optional(this.comment);
    }
    /**
     * (Default: `false`) Specifies to retain the access permissions from the original table when an external table is recreated using the CREATE OR REPLACE TABLE variant
     * 
     */
    @Export(name="copyGrants", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> copyGrants;

    /**
     * @return (Default: `false`) Specifies to retain the access permissions from the original table when an external table is recreated using the CREATE OR REPLACE TABLE variant
     * 
     */
    public Output<Optional<Boolean>> copyGrants() {
        return Codegen.optional(this.copyGrants);
    }
    /**
     * The database in which to create the external table.
     * 
     */
    @Export(name="database", refs={String.class}, tree="[0]")
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
    @Export(name="fileFormat", refs={String.class}, tree="[0]")
    private Output<String> fileFormat;

    /**
     * @return Specifies the file format for the external table.
     * 
     */
    public Output<String> fileFormat() {
        return this.fileFormat;
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
     * Specifies a location for the external table, using its FQDN. You can hardcode it (`&#34;{@literal @}MYDB.MYSCHEMA.MYSTAGE&#34;`), or populate dynamically (`&#34;{@literal @}${snowflake_stage.mystage.fully_qualified_name}&#34;`)
     * 
     */
    @Export(name="location", refs={String.class}, tree="[0]")
    private Output<String> location;

    /**
     * @return Specifies a location for the external table, using its FQDN. You can hardcode it (`&#34;{@literal @}MYDB.MYSCHEMA.MYSTAGE&#34;`), or populate dynamically (`&#34;{@literal @}${snowflake_stage.mystage.fully_qualified_name}&#34;`)
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Specifies the identifier for the external table; must be unique for the database and schema in which the externalTable is created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
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
    @Export(name="owner", refs={String.class}, tree="[0]")
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
    @Export(name="partitionBies", refs={List.class,String.class}, tree="[0,1]")
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
    @Export(name="pattern", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> pattern;

    /**
     * @return Specifies the file names and/or paths on the external stage to match.
     * 
     */
    public Output<Optional<String>> pattern() {
        return Codegen.optional(this.pattern);
    }
    /**
     * (Default: `true`) Specifies weather to refresh when an external table is created.
     * 
     */
    @Export(name="refreshOnCreate", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> refreshOnCreate;

    /**
     * @return (Default: `true`) Specifies weather to refresh when an external table is created.
     * 
     */
    public Output<Optional<Boolean>> refreshOnCreate() {
        return Codegen.optional(this.refreshOnCreate);
    }
    /**
     * The schema in which to create the external table.
     * 
     */
    @Export(name="schema", refs={String.class}, tree="[0]")
    private Output<String> schema;

    /**
     * @return The schema in which to create the external table.
     * 
     */
    public Output<String> schema() {
        return this.schema;
    }
    /**
     * Identifies the external table table type. For now, only &#34;delta&#34; for Delta Lake table format is supported.
     * 
     */
    @Export(name="tableFormat", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> tableFormat;

    /**
     * @return Identifies the external table table type. For now, only &#34;delta&#34; for Delta Lake table format is supported.
     * 
     */
    public Output<Optional<String>> tableFormat() {
        return Codegen.optional(this.tableFormat);
    }
    /**
     * Definitions of a tag to associate with the resource.
     * 
     * @deprecated
     * Use the &#39;snowflake_tag_association&#39; resource instead.
     * 
     */
    @Deprecated /* Use the 'snowflake_tag_association' resource instead. */
    @Export(name="tags", refs={List.class,ExternalTableTag.class}, tree="[0,1]")
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
    public ExternalTable(java.lang.String name) {
        this(name, ExternalTableArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ExternalTable(java.lang.String name, ExternalTableArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ExternalTable(java.lang.String name, ExternalTableArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/externalTable:ExternalTable", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ExternalTable(java.lang.String name, Output<java.lang.String> id, @Nullable ExternalTableState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/externalTable:ExternalTable", name, state, makeResourceOptions(options, id), false);
    }

    private static ExternalTableArgs makeArgs(ExternalTableArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ExternalTableArgs.Empty : args;
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
    public static ExternalTable get(java.lang.String name, Output<java.lang.String> id, @Nullable ExternalTableState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ExternalTable(name, id, state, options);
    }
}
