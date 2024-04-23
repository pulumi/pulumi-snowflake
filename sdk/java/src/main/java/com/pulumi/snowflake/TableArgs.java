// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.snowflake.inputs.TableColumnArgs;
import com.pulumi.snowflake.inputs.TablePrimaryKeyArgs;
import com.pulumi.snowflake.inputs.TableTagArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TableArgs extends com.pulumi.resources.ResourceArgs {

    public static final TableArgs Empty = new TableArgs();

    /**
     * Specifies whether to enable change tracking on the table. Default false.
     * 
     */
    @Import(name="changeTracking")
    private @Nullable Output<Boolean> changeTracking;

    /**
     * @return Specifies whether to enable change tracking on the table. Default false.
     * 
     */
    public Optional<Output<Boolean>> changeTracking() {
        return Optional.ofNullable(this.changeTracking);
    }

    /**
     * A list of one or more table columns/expressions to be used as clustering key(s) for the table
     * 
     */
    @Import(name="clusterBies")
    private @Nullable Output<List<String>> clusterBies;

    /**
     * @return A list of one or more table columns/expressions to be used as clustering key(s) for the table
     * 
     */
    public Optional<Output<List<String>>> clusterBies() {
        return Optional.ofNullable(this.clusterBies);
    }

    /**
     * Definitions of a column to create in the table. Minimum one required.
     * 
     */
    @Import(name="columns", required=true)
    private Output<List<TableColumnArgs>> columns;

    /**
     * @return Definitions of a column to create in the table. Minimum one required.
     * 
     */
    public Output<List<TableColumnArgs>> columns() {
        return this.columns;
    }

    /**
     * Specifies a comment for the table.
     * 
     */
    @Import(name="comment")
    private @Nullable Output<String> comment;

    /**
     * @return Specifies a comment for the table.
     * 
     */
    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    /**
     * Specifies the retention period for the table so that Time Travel actions (SELECT, CLONE, UNDROP) can be performed on historical data in the table. If you wish to inherit the parent schema setting then pass in the schema attribute to this argument or do not fill this parameter at all; the default value for this field is -1, which is a fallback to use Snowflake default - in this case the schema value
     * 
     */
    @Import(name="dataRetentionTimeInDays")
    private @Nullable Output<Integer> dataRetentionTimeInDays;

    /**
     * @return Specifies the retention period for the table so that Time Travel actions (SELECT, CLONE, UNDROP) can be performed on historical data in the table. If you wish to inherit the parent schema setting then pass in the schema attribute to this argument or do not fill this parameter at all; the default value for this field is -1, which is a fallback to use Snowflake default - in this case the schema value
     * 
     */
    public Optional<Output<Integer>> dataRetentionTimeInDays() {
        return Optional.ofNullable(this.dataRetentionTimeInDays);
    }

    /**
     * The database in which to create the table.
     * 
     */
    @Import(name="database", required=true)
    private Output<String> database;

    /**
     * @return The database in which to create the table.
     * 
     */
    public Output<String> database() {
        return this.database;
    }

    /**
     * Specifies the identifier for the table; must be unique for the database and schema in which the table is created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the identifier for the table; must be unique for the database and schema in which the table is created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Definitions of primary key constraint to create on table
     * 
     * @deprecated
     * Use snowflake.TableConstraint instead
     * 
     */
    @Deprecated /* Use snowflake.TableConstraint instead */
    @Import(name="primaryKey")
    private @Nullable Output<TablePrimaryKeyArgs> primaryKey;

    /**
     * @return Definitions of primary key constraint to create on table
     * 
     * @deprecated
     * Use snowflake.TableConstraint instead
     * 
     */
    @Deprecated /* Use snowflake.TableConstraint instead */
    public Optional<Output<TablePrimaryKeyArgs>> primaryKey() {
        return Optional.ofNullable(this.primaryKey);
    }

    /**
     * The schema in which to create the table.
     * 
     */
    @Import(name="schema", required=true)
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
    @Import(name="tags")
    private @Nullable Output<List<TableTagArgs>> tags;

    /**
     * @return Definitions of a tag to associate with the resource.
     * 
     * @deprecated
     * Use the &#39;snowflake_tag_association&#39; resource instead.
     * 
     */
    @Deprecated /* Use the 'snowflake_tag_association' resource instead. */
    public Optional<Output<List<TableTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private TableArgs() {}

    private TableArgs(TableArgs $) {
        this.changeTracking = $.changeTracking;
        this.clusterBies = $.clusterBies;
        this.columns = $.columns;
        this.comment = $.comment;
        this.dataRetentionTimeInDays = $.dataRetentionTimeInDays;
        this.database = $.database;
        this.name = $.name;
        this.primaryKey = $.primaryKey;
        this.schema = $.schema;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TableArgs $;

        public Builder() {
            $ = new TableArgs();
        }

        public Builder(TableArgs defaults) {
            $ = new TableArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param changeTracking Specifies whether to enable change tracking on the table. Default false.
         * 
         * @return builder
         * 
         */
        public Builder changeTracking(@Nullable Output<Boolean> changeTracking) {
            $.changeTracking = changeTracking;
            return this;
        }

        /**
         * @param changeTracking Specifies whether to enable change tracking on the table. Default false.
         * 
         * @return builder
         * 
         */
        public Builder changeTracking(Boolean changeTracking) {
            return changeTracking(Output.of(changeTracking));
        }

        /**
         * @param clusterBies A list of one or more table columns/expressions to be used as clustering key(s) for the table
         * 
         * @return builder
         * 
         */
        public Builder clusterBies(@Nullable Output<List<String>> clusterBies) {
            $.clusterBies = clusterBies;
            return this;
        }

        /**
         * @param clusterBies A list of one or more table columns/expressions to be used as clustering key(s) for the table
         * 
         * @return builder
         * 
         */
        public Builder clusterBies(List<String> clusterBies) {
            return clusterBies(Output.of(clusterBies));
        }

        /**
         * @param clusterBies A list of one or more table columns/expressions to be used as clustering key(s) for the table
         * 
         * @return builder
         * 
         */
        public Builder clusterBies(String... clusterBies) {
            return clusterBies(List.of(clusterBies));
        }

        /**
         * @param columns Definitions of a column to create in the table. Minimum one required.
         * 
         * @return builder
         * 
         */
        public Builder columns(Output<List<TableColumnArgs>> columns) {
            $.columns = columns;
            return this;
        }

        /**
         * @param columns Definitions of a column to create in the table. Minimum one required.
         * 
         * @return builder
         * 
         */
        public Builder columns(List<TableColumnArgs> columns) {
            return columns(Output.of(columns));
        }

        /**
         * @param columns Definitions of a column to create in the table. Minimum one required.
         * 
         * @return builder
         * 
         */
        public Builder columns(TableColumnArgs... columns) {
            return columns(List.of(columns));
        }

        /**
         * @param comment Specifies a comment for the table.
         * 
         * @return builder
         * 
         */
        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        /**
         * @param comment Specifies a comment for the table.
         * 
         * @return builder
         * 
         */
        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        /**
         * @param dataRetentionTimeInDays Specifies the retention period for the table so that Time Travel actions (SELECT, CLONE, UNDROP) can be performed on historical data in the table. If you wish to inherit the parent schema setting then pass in the schema attribute to this argument or do not fill this parameter at all; the default value for this field is -1, which is a fallback to use Snowflake default - in this case the schema value
         * 
         * @return builder
         * 
         */
        public Builder dataRetentionTimeInDays(@Nullable Output<Integer> dataRetentionTimeInDays) {
            $.dataRetentionTimeInDays = dataRetentionTimeInDays;
            return this;
        }

        /**
         * @param dataRetentionTimeInDays Specifies the retention period for the table so that Time Travel actions (SELECT, CLONE, UNDROP) can be performed on historical data in the table. If you wish to inherit the parent schema setting then pass in the schema attribute to this argument or do not fill this parameter at all; the default value for this field is -1, which is a fallback to use Snowflake default - in this case the schema value
         * 
         * @return builder
         * 
         */
        public Builder dataRetentionTimeInDays(Integer dataRetentionTimeInDays) {
            return dataRetentionTimeInDays(Output.of(dataRetentionTimeInDays));
        }

        /**
         * @param database The database in which to create the table.
         * 
         * @return builder
         * 
         */
        public Builder database(Output<String> database) {
            $.database = database;
            return this;
        }

        /**
         * @param database The database in which to create the table.
         * 
         * @return builder
         * 
         */
        public Builder database(String database) {
            return database(Output.of(database));
        }

        /**
         * @param name Specifies the identifier for the table; must be unique for the database and schema in which the table is created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the identifier for the table; must be unique for the database and schema in which the table is created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param primaryKey Definitions of primary key constraint to create on table
         * 
         * @return builder
         * 
         * @deprecated
         * Use snowflake.TableConstraint instead
         * 
         */
        @Deprecated /* Use snowflake.TableConstraint instead */
        public Builder primaryKey(@Nullable Output<TablePrimaryKeyArgs> primaryKey) {
            $.primaryKey = primaryKey;
            return this;
        }

        /**
         * @param primaryKey Definitions of primary key constraint to create on table
         * 
         * @return builder
         * 
         * @deprecated
         * Use snowflake.TableConstraint instead
         * 
         */
        @Deprecated /* Use snowflake.TableConstraint instead */
        public Builder primaryKey(TablePrimaryKeyArgs primaryKey) {
            return primaryKey(Output.of(primaryKey));
        }

        /**
         * @param schema The schema in which to create the table.
         * 
         * @return builder
         * 
         */
        public Builder schema(Output<String> schema) {
            $.schema = schema;
            return this;
        }

        /**
         * @param schema The schema in which to create the table.
         * 
         * @return builder
         * 
         */
        public Builder schema(String schema) {
            return schema(Output.of(schema));
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
        public Builder tags(@Nullable Output<List<TableTagArgs>> tags) {
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
        public Builder tags(List<TableTagArgs> tags) {
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
        public Builder tags(TableTagArgs... tags) {
            return tags(List.of(tags));
        }

        public TableArgs build() {
            if ($.columns == null) {
                throw new MissingRequiredPropertyException("TableArgs", "columns");
            }
            if ($.database == null) {
                throw new MissingRequiredPropertyException("TableArgs", "database");
            }
            if ($.schema == null) {
                throw new MissingRequiredPropertyException("TableArgs", "schema");
            }
            return $;
        }
    }

}
