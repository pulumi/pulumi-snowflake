// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CortexSearchServiceState extends com.pulumi.resources.ResourceArgs {

    public static final CortexSearchServiceState Empty = new CortexSearchServiceState();

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
     * Creation date for the given Cortex search service.
     * 
     */
    @Import(name="createdOn")
    private @Nullable Output<String> createdOn;

    /**
     * @return Creation date for the given Cortex search service.
     * 
     */
    public Optional<Output<String>> createdOn() {
        return Optional.ofNullable(this.createdOn);
    }

    /**
     * The database in which to create the Cortex search service.
     * 
     */
    @Import(name="database")
    private @Nullable Output<String> database;

    /**
     * @return The database in which to create the Cortex search service.
     * 
     */
    public Optional<Output<String>> database() {
        return Optional.ofNullable(this.database);
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
    @Import(name="on")
    private @Nullable Output<String> on;

    /**
     * @return Specifies the column to use as the search column for the Cortex search service; must be a text value.
     * 
     */
    public Optional<Output<String>> on() {
        return Optional.ofNullable(this.on);
    }

    /**
     * Specifies the query to use to populate the Cortex search service.
     * 
     */
    @Import(name="query")
    private @Nullable Output<String> query;

    /**
     * @return Specifies the query to use to populate the Cortex search service.
     * 
     */
    public Optional<Output<String>> query() {
        return Optional.ofNullable(this.query);
    }

    /**
     * The schema in which to create the Cortex search service.
     * 
     */
    @Import(name="schema")
    private @Nullable Output<String> schema;

    /**
     * @return The schema in which to create the Cortex search service.
     * 
     */
    public Optional<Output<String>> schema() {
        return Optional.ofNullable(this.schema);
    }

    /**
     * Specifies the maximum target lag time for the Cortex search service.
     * 
     */
    @Import(name="targetLag")
    private @Nullable Output<String> targetLag;

    /**
     * @return Specifies the maximum target lag time for the Cortex search service.
     * 
     */
    public Optional<Output<String>> targetLag() {
        return Optional.ofNullable(this.targetLag);
    }

    /**
     * The warehouse in which to create the Cortex search service.
     * 
     */
    @Import(name="warehouse")
    private @Nullable Output<String> warehouse;

    /**
     * @return The warehouse in which to create the Cortex search service.
     * 
     */
    public Optional<Output<String>> warehouse() {
        return Optional.ofNullable(this.warehouse);
    }

    private CortexSearchServiceState() {}

    private CortexSearchServiceState(CortexSearchServiceState $) {
        this.attributes = $.attributes;
        this.comment = $.comment;
        this.createdOn = $.createdOn;
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
    public static Builder builder(CortexSearchServiceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CortexSearchServiceState $;

        public Builder() {
            $ = new CortexSearchServiceState();
        }

        public Builder(CortexSearchServiceState defaults) {
            $ = new CortexSearchServiceState(Objects.requireNonNull(defaults));
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
         * @param createdOn Creation date for the given Cortex search service.
         * 
         * @return builder
         * 
         */
        public Builder createdOn(@Nullable Output<String> createdOn) {
            $.createdOn = createdOn;
            return this;
        }

        /**
         * @param createdOn Creation date for the given Cortex search service.
         * 
         * @return builder
         * 
         */
        public Builder createdOn(String createdOn) {
            return createdOn(Output.of(createdOn));
        }

        /**
         * @param database The database in which to create the Cortex search service.
         * 
         * @return builder
         * 
         */
        public Builder database(@Nullable Output<String> database) {
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
        public Builder on(@Nullable Output<String> on) {
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
        public Builder query(@Nullable Output<String> query) {
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
        public Builder schema(@Nullable Output<String> schema) {
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
        public Builder targetLag(@Nullable Output<String> targetLag) {
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
        public Builder warehouse(@Nullable Output<String> warehouse) {
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

        public CortexSearchServiceState build() {
            return $;
        }
    }

}