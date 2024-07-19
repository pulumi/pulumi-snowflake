// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CortexSearchServiceArgs extends com.pulumi.resources.ResourceArgs {

    public static final CortexSearchServiceArgs Empty = new CortexSearchServiceArgs();

    /**
     * Specifies the list of columns in the base table to enable filtering on when issuing queries to the service.
     * 
     */
    @Import(name="attributes")
    private @Nullable Output<List<String>> attributes;

    /**
     * @return Specifies the list of columns in the base table to enable filtering on when issuing queries to the service.
     * 
     */
    public Optional<Output<List<String>>> attributes() {
        return Optional.ofNullable(this.attributes);
    }

    /**
     * Specifies a comment for the Cortex search service.
     * 
     */
    @Import(name="comment")
    private @Nullable Output<String> comment;

    /**
     * @return Specifies a comment for the Cortex search service.
     * 
     */
    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    /**
     * The database in which to create the Cortex search service.
     * 
     */
    @Import(name="database", required=true)
    private Output<String> database;

    /**
     * @return The database in which to create the Cortex search service.
     * 
     */
    public Output<String> database() {
        return this.database;
    }

    /**
     * Specifies the name of the Cortex search service. The name must be unique for the schema in which the service is created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the Cortex search service. The name must be unique for the schema in which the service is created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specifies the column to use as the search column for the Cortex search service; must be a text value.
     * 
     */
    @Import(name="on", required=true)
    private Output<String> on;

    /**
     * @return Specifies the column to use as the search column for the Cortex search service; must be a text value.
     * 
     */
    public Output<String> on() {
        return this.on;
    }

    /**
     * Specifies the query to use to populate the Cortex search service.
     * 
     */
    @Import(name="query", required=true)
    private Output<String> query;

    /**
     * @return Specifies the query to use to populate the Cortex search service.
     * 
     */
    public Output<String> query() {
        return this.query;
    }

    /**
     * The schema in which to create the Cortex search service.
     * 
     */
    @Import(name="schema", required=true)
    private Output<String> schema;

    /**
     * @return The schema in which to create the Cortex search service.
     * 
     */
    public Output<String> schema() {
        return this.schema;
    }

    /**
     * Specifies the maximum target lag time for the Cortex search service.
     * 
     */
    @Import(name="targetLag", required=true)
    private Output<String> targetLag;

    /**
     * @return Specifies the maximum target lag time for the Cortex search service.
     * 
     */
    public Output<String> targetLag() {
        return this.targetLag;
    }

    /**
     * The warehouse in which to create the Cortex search service.
     * 
     */
    @Import(name="warehouse", required=true)
    private Output<String> warehouse;

    /**
     * @return The warehouse in which to create the Cortex search service.
     * 
     */
    public Output<String> warehouse() {
        return this.warehouse;
    }

    private CortexSearchServiceArgs() {}

    private CortexSearchServiceArgs(CortexSearchServiceArgs $) {
        this.attributes = $.attributes;
        this.comment = $.comment;
        this.database = $.database;
        this.name = $.name;
        this.on = $.on;
        this.query = $.query;
        this.schema = $.schema;
        this.targetLag = $.targetLag;
        this.warehouse = $.warehouse;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CortexSearchServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CortexSearchServiceArgs $;

        public Builder() {
            $ = new CortexSearchServiceArgs();
        }

        public Builder(CortexSearchServiceArgs defaults) {
            $ = new CortexSearchServiceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param attributes Specifies the list of columns in the base table to enable filtering on when issuing queries to the service.
         * 
         * @return builder
         * 
         */
        public Builder attributes(@Nullable Output<List<String>> attributes) {
            $.attributes = attributes;
            return this;
        }

        /**
         * @param attributes Specifies the list of columns in the base table to enable filtering on when issuing queries to the service.
         * 
         * @return builder
         * 
         */
        public Builder attributes(List<String> attributes) {
            return attributes(Output.of(attributes));
        }

        /**
         * @param attributes Specifies the list of columns in the base table to enable filtering on when issuing queries to the service.
         * 
         * @return builder
         * 
         */
        public Builder attributes(String... attributes) {
            return attributes(List.of(attributes));
        }

        /**
         * @param comment Specifies a comment for the Cortex search service.
         * 
         * @return builder
         * 
         */
        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        /**
         * @param comment Specifies a comment for the Cortex search service.
         * 
         * @return builder
         * 
         */
        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        /**
         * @param database The database in which to create the Cortex search service.
         * 
         * @return builder
         * 
         */
        public Builder database(Output<String> database) {
            $.database = database;
            return this;
        }

        /**
         * @param database The database in which to create the Cortex search service.
         * 
         * @return builder
         * 
         */
        public Builder database(String database) {
            return database(Output.of(database));
        }

        /**
         * @param name Specifies the name of the Cortex search service. The name must be unique for the schema in which the service is created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Cortex search service. The name must be unique for the schema in which the service is created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param on Specifies the column to use as the search column for the Cortex search service; must be a text value.
         * 
         * @return builder
         * 
         */
        public Builder on(Output<String> on) {
            $.on = on;
            return this;
        }

        /**
         * @param on Specifies the column to use as the search column for the Cortex search service; must be a text value.
         * 
         * @return builder
         * 
         */
        public Builder on(String on) {
            return on(Output.of(on));
        }

        /**
         * @param query Specifies the query to use to populate the Cortex search service.
         * 
         * @return builder
         * 
         */
        public Builder query(Output<String> query) {
            $.query = query;
            return this;
        }

        /**
         * @param query Specifies the query to use to populate the Cortex search service.
         * 
         * @return builder
         * 
         */
        public Builder query(String query) {
            return query(Output.of(query));
        }

        /**
         * @param schema The schema in which to create the Cortex search service.
         * 
         * @return builder
         * 
         */
        public Builder schema(Output<String> schema) {
            $.schema = schema;
            return this;
        }

        /**
         * @param schema The schema in which to create the Cortex search service.
         * 
         * @return builder
         * 
         */
        public Builder schema(String schema) {
            return schema(Output.of(schema));
        }

        /**
         * @param targetLag Specifies the maximum target lag time for the Cortex search service.
         * 
         * @return builder
         * 
         */
        public Builder targetLag(Output<String> targetLag) {
            $.targetLag = targetLag;
            return this;
        }

        /**
         * @param targetLag Specifies the maximum target lag time for the Cortex search service.
         * 
         * @return builder
         * 
         */
        public Builder targetLag(String targetLag) {
            return targetLag(Output.of(targetLag));
        }

        /**
         * @param warehouse The warehouse in which to create the Cortex search service.
         * 
         * @return builder
         * 
         */
        public Builder warehouse(Output<String> warehouse) {
            $.warehouse = warehouse;
            return this;
        }

        /**
         * @param warehouse The warehouse in which to create the Cortex search service.
         * 
         * @return builder
         * 
         */
        public Builder warehouse(String warehouse) {
            return warehouse(Output.of(warehouse));
        }

        public CortexSearchServiceArgs build() {
            if ($.database == null) {
                throw new MissingRequiredPropertyException("CortexSearchServiceArgs", "database");
            }
            if ($.on == null) {
                throw new MissingRequiredPropertyException("CortexSearchServiceArgs", "on");
            }
            if ($.query == null) {
                throw new MissingRequiredPropertyException("CortexSearchServiceArgs", "query");
            }
            if ($.schema == null) {
                throw new MissingRequiredPropertyException("CortexSearchServiceArgs", "schema");
            }
            if ($.targetLag == null) {
                throw new MissingRequiredPropertyException("CortexSearchServiceArgs", "targetLag");
            }
            if ($.warehouse == null) {
                throw new MissingRequiredPropertyException("CortexSearchServiceArgs", "warehouse");
            }
            return $;
        }
    }

}