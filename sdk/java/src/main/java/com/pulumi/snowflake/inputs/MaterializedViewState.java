// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.snowflake.inputs.MaterializedViewTagArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MaterializedViewState extends com.pulumi.resources.ResourceArgs {

    public static final MaterializedViewState Empty = new MaterializedViewState();

    /**
     * Specifies a comment for the view.
     * 
     */
    @Import(name="comment")
    private @Nullable Output<String> comment;

    /**
     * @return Specifies a comment for the view.
     * 
     */
    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    /**
     * The database in which to create the view. Don&#39;t use the | character.
     * 
     */
    @Import(name="database")
    private @Nullable Output<String> database;

    /**
     * @return The database in which to create the view. Don&#39;t use the | character.
     * 
     */
    public Optional<Output<String>> database() {
        return Optional.ofNullable(this.database);
    }

    /**
     * Specifies that the view is secure.
     * 
     */
    @Import(name="isSecure")
    private @Nullable Output<Boolean> isSecure;

    /**
     * @return Specifies that the view is secure.
     * 
     */
    public Optional<Output<Boolean>> isSecure() {
        return Optional.ofNullable(this.isSecure);
    }

    /**
     * Specifies the identifier for the view; must be unique for the schema in which the view is created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the identifier for the view; must be unique for the schema in which the view is created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Overwrites the View if it exists.
     * 
     */
    @Import(name="orReplace")
    private @Nullable Output<Boolean> orReplace;

    /**
     * @return Overwrites the View if it exists.
     * 
     */
    public Optional<Output<Boolean>> orReplace() {
        return Optional.ofNullable(this.orReplace);
    }

    /**
     * The schema in which to create the view. Don&#39;t use the | character.
     * 
     */
    @Import(name="schema")
    private @Nullable Output<String> schema;

    /**
     * @return The schema in which to create the view. Don&#39;t use the | character.
     * 
     */
    public Optional<Output<String>> schema() {
        return Optional.ofNullable(this.schema);
    }

    /**
     * Specifies the query used to create the view.
     * 
     */
    @Import(name="statement")
    private @Nullable Output<String> statement;

    /**
     * @return Specifies the query used to create the view.
     * 
     */
    public Optional<Output<String>> statement() {
        return Optional.ofNullable(this.statement);
    }

    /**
     * Definitions of a tag to associate with the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<MaterializedViewTagArgs>> tags;

    /**
     * @return Definitions of a tag to associate with the resource.
     * 
     */
    public Optional<Output<List<MaterializedViewTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The warehouse name.
     * 
     */
    @Import(name="warehouse")
    private @Nullable Output<String> warehouse;

    /**
     * @return The warehouse name.
     * 
     */
    public Optional<Output<String>> warehouse() {
        return Optional.ofNullable(this.warehouse);
    }

    private MaterializedViewState() {}

    private MaterializedViewState(MaterializedViewState $) {
        this.comment = $.comment;
        this.database = $.database;
        this.isSecure = $.isSecure;
        this.name = $.name;
        this.orReplace = $.orReplace;
        this.schema = $.schema;
        this.statement = $.statement;
        this.tags = $.tags;
        this.warehouse = $.warehouse;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MaterializedViewState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MaterializedViewState $;

        public Builder() {
            $ = new MaterializedViewState();
        }

        public Builder(MaterializedViewState defaults) {
            $ = new MaterializedViewState(Objects.requireNonNull(defaults));
        }

        /**
         * @param comment Specifies a comment for the view.
         * 
         * @return builder
         * 
         */
        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        /**
         * @param comment Specifies a comment for the view.
         * 
         * @return builder
         * 
         */
        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        /**
         * @param database The database in which to create the view. Don&#39;t use the | character.
         * 
         * @return builder
         * 
         */
        public Builder database(@Nullable Output<String> database) {
            $.database = database;
            return this;
        }

        /**
         * @param database The database in which to create the view. Don&#39;t use the | character.
         * 
         * @return builder
         * 
         */
        public Builder database(String database) {
            return database(Output.of(database));
        }

        /**
         * @param isSecure Specifies that the view is secure.
         * 
         * @return builder
         * 
         */
        public Builder isSecure(@Nullable Output<Boolean> isSecure) {
            $.isSecure = isSecure;
            return this;
        }

        /**
         * @param isSecure Specifies that the view is secure.
         * 
         * @return builder
         * 
         */
        public Builder isSecure(Boolean isSecure) {
            return isSecure(Output.of(isSecure));
        }

        /**
         * @param name Specifies the identifier for the view; must be unique for the schema in which the view is created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the identifier for the view; must be unique for the schema in which the view is created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param orReplace Overwrites the View if it exists.
         * 
         * @return builder
         * 
         */
        public Builder orReplace(@Nullable Output<Boolean> orReplace) {
            $.orReplace = orReplace;
            return this;
        }

        /**
         * @param orReplace Overwrites the View if it exists.
         * 
         * @return builder
         * 
         */
        public Builder orReplace(Boolean orReplace) {
            return orReplace(Output.of(orReplace));
        }

        /**
         * @param schema The schema in which to create the view. Don&#39;t use the | character.
         * 
         * @return builder
         * 
         */
        public Builder schema(@Nullable Output<String> schema) {
            $.schema = schema;
            return this;
        }

        /**
         * @param schema The schema in which to create the view. Don&#39;t use the | character.
         * 
         * @return builder
         * 
         */
        public Builder schema(String schema) {
            return schema(Output.of(schema));
        }

        /**
         * @param statement Specifies the query used to create the view.
         * 
         * @return builder
         * 
         */
        public Builder statement(@Nullable Output<String> statement) {
            $.statement = statement;
            return this;
        }

        /**
         * @param statement Specifies the query used to create the view.
         * 
         * @return builder
         * 
         */
        public Builder statement(String statement) {
            return statement(Output.of(statement));
        }

        /**
         * @param tags Definitions of a tag to associate with the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<MaterializedViewTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Definitions of a tag to associate with the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<MaterializedViewTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags Definitions of a tag to associate with the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(MaterializedViewTagArgs... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param warehouse The warehouse name.
         * 
         * @return builder
         * 
         */
        public Builder warehouse(@Nullable Output<String> warehouse) {
            $.warehouse = warehouse;
            return this;
        }

        /**
         * @param warehouse The warehouse name.
         * 
         * @return builder
         * 
         */
        public Builder warehouse(String warehouse) {
            return warehouse(Output.of(warehouse));
        }

        public MaterializedViewState build() {
            return $;
        }
    }

}
