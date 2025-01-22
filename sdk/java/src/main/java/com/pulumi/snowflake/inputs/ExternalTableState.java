// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.snowflake.inputs.ExternalTableColumnArgs;
import com.pulumi.snowflake.inputs.ExternalTableTagArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ExternalTableState extends com.pulumi.resources.ResourceArgs {

    public static final ExternalTableState Empty = new ExternalTableState();

    /**
     * Specifies whether to automatically refresh the external table metadata once, immediately after the external table is created.
     * 
     */
    @Import(name="autoRefresh")
    private @Nullable Output<Boolean> autoRefresh;

    /**
     * @return Specifies whether to automatically refresh the external table metadata once, immediately after the external table is created.
     * 
     */
    public Optional<Output<Boolean>> autoRefresh() {
        return Optional.ofNullable(this.autoRefresh);
    }

    /**
     * Specifies the aws sns topic for the external table.
     * 
     */
    @Import(name="awsSnsTopic")
    private @Nullable Output<String> awsSnsTopic;

    /**
     * @return Specifies the aws sns topic for the external table.
     * 
     */
    public Optional<Output<String>> awsSnsTopic() {
        return Optional.ofNullable(this.awsSnsTopic);
    }

    /**
     * Definitions of a column to create in the external table. Minimum one required.
     * 
     */
    @Import(name="columns")
    private @Nullable Output<List<ExternalTableColumnArgs>> columns;

    /**
     * @return Definitions of a column to create in the external table. Minimum one required.
     * 
     */
    public Optional<Output<List<ExternalTableColumnArgs>>> columns() {
        return Optional.ofNullable(this.columns);
    }

    /**
     * Specifies a comment for the external table.
     * 
     */
    @Import(name="comment")
    private @Nullable Output<String> comment;

    /**
     * @return Specifies a comment for the external table.
     * 
     */
    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    /**
     * Specifies to retain the access permissions from the original table when an external table is recreated using the CREATE OR REPLACE TABLE variant
     * 
     */
    @Import(name="copyGrants")
    private @Nullable Output<Boolean> copyGrants;

    /**
     * @return Specifies to retain the access permissions from the original table when an external table is recreated using the CREATE OR REPLACE TABLE variant
     * 
     */
    public Optional<Output<Boolean>> copyGrants() {
        return Optional.ofNullable(this.copyGrants);
    }

    /**
     * The database in which to create the external table.
     * 
     */
    @Import(name="database")
    private @Nullable Output<String> database;

    /**
     * @return The database in which to create the external table.
     * 
     */
    public Optional<Output<String>> database() {
        return Optional.ofNullable(this.database);
    }

    /**
     * Specifies the file format for the external table.
     * 
     */
    @Import(name="fileFormat")
    private @Nullable Output<String> fileFormat;

    /**
     * @return Specifies the file format for the external table.
     * 
     */
    public Optional<Output<String>> fileFormat() {
        return Optional.ofNullable(this.fileFormat);
    }

    /**
     * Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
     * 
     */
    @Import(name="fullyQualifiedName")
    private @Nullable Output<String> fullyQualifiedName;

    /**
     * @return Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
     * 
     */
    public Optional<Output<String>> fullyQualifiedName() {
        return Optional.ofNullable(this.fullyQualifiedName);
    }

    /**
     * Specifies a location for the external table, using its FQDN. You can hardcode it (`&#34;{@literal @}MYDB.MYSCHEMA.MYSTAGE&#34;`), or populate dynamically (`&#34;{@literal @}${snowflake_stage.mystage.fully_qualified_name}&#34;`)
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Specifies a location for the external table, using its FQDN. You can hardcode it (`&#34;{@literal @}MYDB.MYSCHEMA.MYSTAGE&#34;`), or populate dynamically (`&#34;{@literal @}${snowflake_stage.mystage.fully_qualified_name}&#34;`)
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Specifies the identifier for the external table; must be unique for the database and schema in which the externalTable is created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the identifier for the external table; must be unique for the database and schema in which the externalTable is created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Name of the role that owns the external table.
     * 
     */
    @Import(name="owner")
    private @Nullable Output<String> owner;

    /**
     * @return Name of the role that owns the external table.
     * 
     */
    public Optional<Output<String>> owner() {
        return Optional.ofNullable(this.owner);
    }

    /**
     * Specifies any partition columns to evaluate for the external table.
     * 
     */
    @Import(name="partitionBies")
    private @Nullable Output<List<String>> partitionBies;

    /**
     * @return Specifies any partition columns to evaluate for the external table.
     * 
     */
    public Optional<Output<List<String>>> partitionBies() {
        return Optional.ofNullable(this.partitionBies);
    }

    /**
     * Specifies the file names and/or paths on the external stage to match.
     * 
     */
    @Import(name="pattern")
    private @Nullable Output<String> pattern;

    /**
     * @return Specifies the file names and/or paths on the external stage to match.
     * 
     */
    public Optional<Output<String>> pattern() {
        return Optional.ofNullable(this.pattern);
    }

    /**
     * Specifies weather to refresh when an external table is created.
     * 
     */
    @Import(name="refreshOnCreate")
    private @Nullable Output<Boolean> refreshOnCreate;

    /**
     * @return Specifies weather to refresh when an external table is created.
     * 
     */
    public Optional<Output<Boolean>> refreshOnCreate() {
        return Optional.ofNullable(this.refreshOnCreate);
    }

    /**
     * The schema in which to create the external table.
     * 
     */
    @Import(name="schema")
    private @Nullable Output<String> schema;

    /**
     * @return The schema in which to create the external table.
     * 
     */
    public Optional<Output<String>> schema() {
        return Optional.ofNullable(this.schema);
    }

    /**
     * Identifies the external table table type. For now, only &#34;delta&#34; for Delta Lake table format is supported.
     * 
     */
    @Import(name="tableFormat")
    private @Nullable Output<String> tableFormat;

    /**
     * @return Identifies the external table table type. For now, only &#34;delta&#34; for Delta Lake table format is supported.
     * 
     */
    public Optional<Output<String>> tableFormat() {
        return Optional.ofNullable(this.tableFormat);
    }

    /**
     * Definitions of a tag to associate with the resource.
     * 
     * @deprecated
     * Use the &#39;snowflake_tag_association&#39; resource instead.
     * 
     */
    @Deprecated /* Use the 'snowflake_tag_association' resource instead. */
    @Import(name="tags")
    private @Nullable Output<List<ExternalTableTagArgs>> tags;

    /**
     * @return Definitions of a tag to associate with the resource.
     * 
     * @deprecated
     * Use the &#39;snowflake_tag_association&#39; resource instead.
     * 
     */
    @Deprecated /* Use the 'snowflake_tag_association' resource instead. */
    public Optional<Output<List<ExternalTableTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private ExternalTableState() {}

    private ExternalTableState(ExternalTableState $) {
        this.autoRefresh = $.autoRefresh;
        this.awsSnsTopic = $.awsSnsTopic;
        this.columns = $.columns;
        this.comment = $.comment;
        this.copyGrants = $.copyGrants;
        this.database = $.database;
        this.fileFormat = $.fileFormat;
        this.fullyQualifiedName = $.fullyQualifiedName;
        this.location = $.location;
        this.name = $.name;
        this.owner = $.owner;
        this.partitionBies = $.partitionBies;
        this.pattern = $.pattern;
        this.refreshOnCreate = $.refreshOnCreate;
        this.schema = $.schema;
        this.tableFormat = $.tableFormat;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExternalTableState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExternalTableState $;

        public Builder() {
            $ = new ExternalTableState();
        }

        public Builder(ExternalTableState defaults) {
            $ = new ExternalTableState(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoRefresh Specifies whether to automatically refresh the external table metadata once, immediately after the external table is created.
         * 
         * @return builder
         * 
         */
        public Builder autoRefresh(@Nullable Output<Boolean> autoRefresh) {
            $.autoRefresh = autoRefresh;
            return this;
        }

        /**
         * @param autoRefresh Specifies whether to automatically refresh the external table metadata once, immediately after the external table is created.
         * 
         * @return builder
         * 
         */
        public Builder autoRefresh(Boolean autoRefresh) {
            return autoRefresh(Output.of(autoRefresh));
        }

        /**
         * @param awsSnsTopic Specifies the aws sns topic for the external table.
         * 
         * @return builder
         * 
         */
        public Builder awsSnsTopic(@Nullable Output<String> awsSnsTopic) {
            $.awsSnsTopic = awsSnsTopic;
            return this;
        }

        /**
         * @param awsSnsTopic Specifies the aws sns topic for the external table.
         * 
         * @return builder
         * 
         */
        public Builder awsSnsTopic(String awsSnsTopic) {
            return awsSnsTopic(Output.of(awsSnsTopic));
        }

        /**
         * @param columns Definitions of a column to create in the external table. Minimum one required.
         * 
         * @return builder
         * 
         */
        public Builder columns(@Nullable Output<List<ExternalTableColumnArgs>> columns) {
            $.columns = columns;
            return this;
        }

        /**
         * @param columns Definitions of a column to create in the external table. Minimum one required.
         * 
         * @return builder
         * 
         */
        public Builder columns(List<ExternalTableColumnArgs> columns) {
            return columns(Output.of(columns));
        }

        /**
         * @param columns Definitions of a column to create in the external table. Minimum one required.
         * 
         * @return builder
         * 
         */
        public Builder columns(ExternalTableColumnArgs... columns) {
            return columns(List.of(columns));
        }

        /**
         * @param comment Specifies a comment for the external table.
         * 
         * @return builder
         * 
         */
        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        /**
         * @param comment Specifies a comment for the external table.
         * 
         * @return builder
         * 
         */
        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        /**
         * @param copyGrants Specifies to retain the access permissions from the original table when an external table is recreated using the CREATE OR REPLACE TABLE variant
         * 
         * @return builder
         * 
         */
        public Builder copyGrants(@Nullable Output<Boolean> copyGrants) {
            $.copyGrants = copyGrants;
            return this;
        }

        /**
         * @param copyGrants Specifies to retain the access permissions from the original table when an external table is recreated using the CREATE OR REPLACE TABLE variant
         * 
         * @return builder
         * 
         */
        public Builder copyGrants(Boolean copyGrants) {
            return copyGrants(Output.of(copyGrants));
        }

        /**
         * @param database The database in which to create the external table.
         * 
         * @return builder
         * 
         */
        public Builder database(@Nullable Output<String> database) {
            $.database = database;
            return this;
        }

        /**
         * @param database The database in which to create the external table.
         * 
         * @return builder
         * 
         */
        public Builder database(String database) {
            return database(Output.of(database));
        }

        /**
         * @param fileFormat Specifies the file format for the external table.
         * 
         * @return builder
         * 
         */
        public Builder fileFormat(@Nullable Output<String> fileFormat) {
            $.fileFormat = fileFormat;
            return this;
        }

        /**
         * @param fileFormat Specifies the file format for the external table.
         * 
         * @return builder
         * 
         */
        public Builder fileFormat(String fileFormat) {
            return fileFormat(Output.of(fileFormat));
        }

        /**
         * @param fullyQualifiedName Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
         * 
         * @return builder
         * 
         */
        public Builder fullyQualifiedName(@Nullable Output<String> fullyQualifiedName) {
            $.fullyQualifiedName = fullyQualifiedName;
            return this;
        }

        /**
         * @param fullyQualifiedName Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
         * 
         * @return builder
         * 
         */
        public Builder fullyQualifiedName(String fullyQualifiedName) {
            return fullyQualifiedName(Output.of(fullyQualifiedName));
        }

        /**
         * @param location Specifies a location for the external table, using its FQDN. You can hardcode it (`&#34;{@literal @}MYDB.MYSCHEMA.MYSTAGE&#34;`), or populate dynamically (`&#34;{@literal @}${snowflake_stage.mystage.fully_qualified_name}&#34;`)
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Specifies a location for the external table, using its FQDN. You can hardcode it (`&#34;{@literal @}MYDB.MYSCHEMA.MYSTAGE&#34;`), or populate dynamically (`&#34;{@literal @}${snowflake_stage.mystage.fully_qualified_name}&#34;`)
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name Specifies the identifier for the external table; must be unique for the database and schema in which the externalTable is created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the identifier for the external table; must be unique for the database and schema in which the externalTable is created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param owner Name of the role that owns the external table.
         * 
         * @return builder
         * 
         */
        public Builder owner(@Nullable Output<String> owner) {
            $.owner = owner;
            return this;
        }

        /**
         * @param owner Name of the role that owns the external table.
         * 
         * @return builder
         * 
         */
        public Builder owner(String owner) {
            return owner(Output.of(owner));
        }

        /**
         * @param partitionBies Specifies any partition columns to evaluate for the external table.
         * 
         * @return builder
         * 
         */
        public Builder partitionBies(@Nullable Output<List<String>> partitionBies) {
            $.partitionBies = partitionBies;
            return this;
        }

        /**
         * @param partitionBies Specifies any partition columns to evaluate for the external table.
         * 
         * @return builder
         * 
         */
        public Builder partitionBies(List<String> partitionBies) {
            return partitionBies(Output.of(partitionBies));
        }

        /**
         * @param partitionBies Specifies any partition columns to evaluate for the external table.
         * 
         * @return builder
         * 
         */
        public Builder partitionBies(String... partitionBies) {
            return partitionBies(List.of(partitionBies));
        }

        /**
         * @param pattern Specifies the file names and/or paths on the external stage to match.
         * 
         * @return builder
         * 
         */
        public Builder pattern(@Nullable Output<String> pattern) {
            $.pattern = pattern;
            return this;
        }

        /**
         * @param pattern Specifies the file names and/or paths on the external stage to match.
         * 
         * @return builder
         * 
         */
        public Builder pattern(String pattern) {
            return pattern(Output.of(pattern));
        }

        /**
         * @param refreshOnCreate Specifies weather to refresh when an external table is created.
         * 
         * @return builder
         * 
         */
        public Builder refreshOnCreate(@Nullable Output<Boolean> refreshOnCreate) {
            $.refreshOnCreate = refreshOnCreate;
            return this;
        }

        /**
         * @param refreshOnCreate Specifies weather to refresh when an external table is created.
         * 
         * @return builder
         * 
         */
        public Builder refreshOnCreate(Boolean refreshOnCreate) {
            return refreshOnCreate(Output.of(refreshOnCreate));
        }

        /**
         * @param schema The schema in which to create the external table.
         * 
         * @return builder
         * 
         */
        public Builder schema(@Nullable Output<String> schema) {
            $.schema = schema;
            return this;
        }

        /**
         * @param schema The schema in which to create the external table.
         * 
         * @return builder
         * 
         */
        public Builder schema(String schema) {
            return schema(Output.of(schema));
        }

        /**
         * @param tableFormat Identifies the external table table type. For now, only &#34;delta&#34; for Delta Lake table format is supported.
         * 
         * @return builder
         * 
         */
        public Builder tableFormat(@Nullable Output<String> tableFormat) {
            $.tableFormat = tableFormat;
            return this;
        }

        /**
         * @param tableFormat Identifies the external table table type. For now, only &#34;delta&#34; for Delta Lake table format is supported.
         * 
         * @return builder
         * 
         */
        public Builder tableFormat(String tableFormat) {
            return tableFormat(Output.of(tableFormat));
        }

        /**
         * @param tags Definitions of a tag to associate with the resource.
         * 
         * @return builder
         * 
         * @deprecated
         * Use the &#39;snowflake_tag_association&#39; resource instead.
         * 
         */
        @Deprecated /* Use the 'snowflake_tag_association' resource instead. */
        public Builder tags(@Nullable Output<List<ExternalTableTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Definitions of a tag to associate with the resource.
         * 
         * @return builder
         * 
         * @deprecated
         * Use the &#39;snowflake_tag_association&#39; resource instead.
         * 
         */
        @Deprecated /* Use the 'snowflake_tag_association' resource instead. */
        public Builder tags(List<ExternalTableTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags Definitions of a tag to associate with the resource.
         * 
         * @return builder
         * 
         * @deprecated
         * Use the &#39;snowflake_tag_association&#39; resource instead.
         * 
         */
        @Deprecated /* Use the 'snowflake_tag_association' resource instead. */
        public Builder tags(ExternalTableTagArgs... tags) {
            return tags(List.of(tags));
        }

        public ExternalTableState build() {
            return $;
        }
    }

}
