// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.snowflake.inputs.DynamicTableTargetLagArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DynamicTableArgs extends com.pulumi.resources.ResourceArgs {

    public static final DynamicTableArgs Empty = new DynamicTableArgs();

    /**
     * Specifies a comment for the dynamic table.
     * 
     */
    @Import(name="comment")
    private @Nullable Output<String> comment;

    /**
     * @return Specifies a comment for the dynamic table.
     * 
     */
    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    /**
     * The database in which to create the dynamic table.
     * 
     */
    @Import(name="database", required=true)
    private Output<String> database;

    /**
     * @return The database in which to create the dynamic table.
     * 
     */
    public Output<String> database() {
        return this.database;
    }

    /**
     * (Default: `ON_CREATE`) Initialize trigger for the dynamic table. Can only be set on creation. Available options are ON*CREATE and ON*SCHEDULE.
     * 
     */
    @Import(name="initialize")
    private @Nullable Output<String> initialize;

    /**
     * @return (Default: `ON_CREATE`) Initialize trigger for the dynamic table. Can only be set on creation. Available options are ON*CREATE and ON*SCHEDULE.
     * 
     */
    public Optional<Output<String>> initialize() {
        return Optional.ofNullable(this.initialize);
    }

    /**
     * Specifies the identifier (i.e. name) for the dynamic table; must be unique for the schema in which the dynamic table is created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the identifier (i.e. name) for the dynamic table; must be unique for the schema in which the dynamic table is created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * (Default: `false`) Specifies whether to replace the dynamic table if it already exists.
     * 
     */
    @Import(name="orReplace")
    private @Nullable Output<Boolean> orReplace;

    /**
     * @return (Default: `false`) Specifies whether to replace the dynamic table if it already exists.
     * 
     */
    public Optional<Output<Boolean>> orReplace() {
        return Optional.ofNullable(this.orReplace);
    }

    /**
     * Specifies the query to use to populate the dynamic table.
     * 
     */
    @Import(name="query", required=true)
    private Output<String> query;

    /**
     * @return Specifies the query to use to populate the dynamic table.
     * 
     */
    public Output<String> query() {
        return this.query;
    }

    /**
     * (Default: `AUTO`) INCREMENTAL to use incremental refreshes, FULL to recompute the whole table on every refresh, or AUTO to let Snowflake decide.
     * 
     */
    @Import(name="refreshMode")
    private @Nullable Output<String> refreshMode;

    /**
     * @return (Default: `AUTO`) INCREMENTAL to use incremental refreshes, FULL to recompute the whole table on every refresh, or AUTO to let Snowflake decide.
     * 
     */
    public Optional<Output<String>> refreshMode() {
        return Optional.ofNullable(this.refreshMode);
    }

    /**
     * The schema in which to create the dynamic table.
     * 
     */
    @Import(name="schema", required=true)
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
    @Import(name="targetLag", required=true)
    private Output<DynamicTableTargetLagArgs> targetLag;

    /**
     * @return Specifies the target lag time for the dynamic table.
     * 
     */
    public Output<DynamicTableTargetLagArgs> targetLag() {
        return this.targetLag;
    }

    /**
     * The warehouse in which to create the dynamic table.
     * 
     */
    @Import(name="warehouse", required=true)
    private Output<String> warehouse;

    /**
     * @return The warehouse in which to create the dynamic table.
     * 
     */
    public Output<String> warehouse() {
        return this.warehouse;
    }

    private DynamicTableArgs() {}

    private DynamicTableArgs(DynamicTableArgs $) {
        this.comment = $.comment;
        this.database = $.database;
        this.initialize = $.initialize;
        this.name = $.name;
        this.orReplace = $.orReplace;
        this.query = $.query;
        this.refreshMode = $.refreshMode;
        this.schema = $.schema;
        this.targetLag = $.targetLag;
        this.warehouse = $.warehouse;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DynamicTableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DynamicTableArgs $;

        public Builder() {
            $ = new DynamicTableArgs();
        }

        public Builder(DynamicTableArgs defaults) {
            $ = new DynamicTableArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param comment Specifies a comment for the dynamic table.
         * 
         * @return builder
         * 
         */
        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        /**
         * @param comment Specifies a comment for the dynamic table.
         * 
         * @return builder
         * 
         */
        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        /**
         * @param database The database in which to create the dynamic table.
         * 
         * @return builder
         * 
         */
        public Builder database(Output<String> database) {
            $.database = database;
            return this;
        }

        /**
         * @param database The database in which to create the dynamic table.
         * 
         * @return builder
         * 
         */
        public Builder database(String database) {
            return database(Output.of(database));
        }

        /**
         * @param initialize (Default: `ON_CREATE`) Initialize trigger for the dynamic table. Can only be set on creation. Available options are ON*CREATE and ON*SCHEDULE.
         * 
         * @return builder
         * 
         */
        public Builder initialize(@Nullable Output<String> initialize) {
            $.initialize = initialize;
            return this;
        }

        /**
         * @param initialize (Default: `ON_CREATE`) Initialize trigger for the dynamic table. Can only be set on creation. Available options are ON*CREATE and ON*SCHEDULE.
         * 
         * @return builder
         * 
         */
        public Builder initialize(String initialize) {
            return initialize(Output.of(initialize));
        }

        /**
         * @param name Specifies the identifier (i.e. name) for the dynamic table; must be unique for the schema in which the dynamic table is created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the identifier (i.e. name) for the dynamic table; must be unique for the schema in which the dynamic table is created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param orReplace (Default: `false`) Specifies whether to replace the dynamic table if it already exists.
         * 
         * @return builder
         * 
         */
        public Builder orReplace(@Nullable Output<Boolean> orReplace) {
            $.orReplace = orReplace;
            return this;
        }

        /**
         * @param orReplace (Default: `false`) Specifies whether to replace the dynamic table if it already exists.
         * 
         * @return builder
         * 
         */
        public Builder orReplace(Boolean orReplace) {
            return orReplace(Output.of(orReplace));
        }

        /**
         * @param query Specifies the query to use to populate the dynamic table.
         * 
         * @return builder
         * 
         */
        public Builder query(Output<String> query) {
            $.query = query;
            return this;
        }

        /**
         * @param query Specifies the query to use to populate the dynamic table.
         * 
         * @return builder
         * 
         */
        public Builder query(String query) {
            return query(Output.of(query));
        }

        /**
         * @param refreshMode (Default: `AUTO`) INCREMENTAL to use incremental refreshes, FULL to recompute the whole table on every refresh, or AUTO to let Snowflake decide.
         * 
         * @return builder
         * 
         */
        public Builder refreshMode(@Nullable Output<String> refreshMode) {
            $.refreshMode = refreshMode;
            return this;
        }

        /**
         * @param refreshMode (Default: `AUTO`) INCREMENTAL to use incremental refreshes, FULL to recompute the whole table on every refresh, or AUTO to let Snowflake decide.
         * 
         * @return builder
         * 
         */
        public Builder refreshMode(String refreshMode) {
            return refreshMode(Output.of(refreshMode));
        }

        /**
         * @param schema The schema in which to create the dynamic table.
         * 
         * @return builder
         * 
         */
        public Builder schema(Output<String> schema) {
            $.schema = schema;
            return this;
        }

        /**
         * @param schema The schema in which to create the dynamic table.
         * 
         * @return builder
         * 
         */
        public Builder schema(String schema) {
            return schema(Output.of(schema));
        }

        /**
         * @param targetLag Specifies the target lag time for the dynamic table.
         * 
         * @return builder
         * 
         */
        public Builder targetLag(Output<DynamicTableTargetLagArgs> targetLag) {
            $.targetLag = targetLag;
            return this;
        }

        /**
         * @param targetLag Specifies the target lag time for the dynamic table.
         * 
         * @return builder
         * 
         */
        public Builder targetLag(DynamicTableTargetLagArgs targetLag) {
            return targetLag(Output.of(targetLag));
        }

        /**
         * @param warehouse The warehouse in which to create the dynamic table.
         * 
         * @return builder
         * 
         */
        public Builder warehouse(Output<String> warehouse) {
            $.warehouse = warehouse;
            return this;
        }

        /**
         * @param warehouse The warehouse in which to create the dynamic table.
         * 
         * @return builder
         * 
         */
        public Builder warehouse(String warehouse) {
            return warehouse(Output.of(warehouse));
        }

        public DynamicTableArgs build() {
            if ($.database == null) {
                throw new MissingRequiredPropertyException("DynamicTableArgs", "database");
            }
            if ($.query == null) {
                throw new MissingRequiredPropertyException("DynamicTableArgs", "query");
            }
            if ($.schema == null) {
                throw new MissingRequiredPropertyException("DynamicTableArgs", "schema");
            }
            if ($.targetLag == null) {
                throw new MissingRequiredPropertyException("DynamicTableArgs", "targetLag");
            }
            if ($.warehouse == null) {
                throw new MissingRequiredPropertyException("DynamicTableArgs", "warehouse");
            }
            return $;
        }
    }

}
