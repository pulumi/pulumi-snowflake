// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.snowflake.inputs.ViewTagArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ViewArgs extends com.pulumi.resources.ResourceArgs {

    public static final ViewArgs Empty = new ViewArgs();

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
     * Retains the access permissions from the original view when a new view is created using the OR REPLACE clause.
     * 
     */
    @Import(name="copyGrants")
    private @Nullable Output<Boolean> copyGrants;

    /**
     * @return Retains the access permissions from the original view when a new view is created using the OR REPLACE clause.
     * 
     */
    public Optional<Output<Boolean>> copyGrants() {
        return Optional.ofNullable(this.copyGrants);
    }

    /**
     * The database in which to create the view. Don&#39;t use the | character.
     * 
     */
    @Import(name="database", required=true)
    private Output<String> database;

    /**
     * @return The database in which to create the view. Don&#39;t use the | character.
     * 
     */
    public Output<String> database() {
        return this.database;
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
     * Specifies the identifier for the view; must be unique for the schema in which the view is created. Don&#39;t use the | character.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the identifier for the view; must be unique for the schema in which the view is created. Don&#39;t use the | character.
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
    @Import(name="schema", required=true)
    private Output<String> schema;

    /**
     * @return The schema in which to create the view. Don&#39;t use the | character.
     * 
     */
    public Output<String> schema() {
        return this.schema;
    }

    /**
     * Specifies the query used to create the view.
     * 
     */
    @Import(name="statement", required=true)
    private Output<String> statement;

    /**
     * @return Specifies the query used to create the view.
     * 
     */
    public Output<String> statement() {
        return this.statement;
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
    private @Nullable Output<List<ViewTagArgs>> tags;

    /**
     * @return Definitions of a tag to associate with the resource.
     * 
     * @deprecated
     * Use the &#39;snowflake_tag_association&#39; resource instead.
     * 
     */
    @Deprecated /* Use the 'snowflake_tag_association' resource instead. */
    public Optional<Output<List<ViewTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private ViewArgs() {}

    private ViewArgs(ViewArgs $) {
        this.comment = $.comment;
        this.copyGrants = $.copyGrants;
        this.database = $.database;
        this.isSecure = $.isSecure;
        this.name = $.name;
        this.orReplace = $.orReplace;
        this.schema = $.schema;
        this.statement = $.statement;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ViewArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ViewArgs $;

        public Builder() {
            $ = new ViewArgs();
        }

        public Builder(ViewArgs defaults) {
            $ = new ViewArgs(Objects.requireNonNull(defaults));
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
         * @param copyGrants Retains the access permissions from the original view when a new view is created using the OR REPLACE clause.
         * 
         * @return builder
         * 
         */
        public Builder copyGrants(@Nullable Output<Boolean> copyGrants) {
            $.copyGrants = copyGrants;
            return this;
        }

        /**
         * @param copyGrants Retains the access permissions from the original view when a new view is created using the OR REPLACE clause.
         * 
         * @return builder
         * 
         */
        public Builder copyGrants(Boolean copyGrants) {
            return copyGrants(Output.of(copyGrants));
        }

        /**
         * @param database The database in which to create the view. Don&#39;t use the | character.
         * 
         * @return builder
         * 
         */
        public Builder database(Output<String> database) {
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
         * @param name Specifies the identifier for the view; must be unique for the schema in which the view is created. Don&#39;t use the | character.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the identifier for the view; must be unique for the schema in which the view is created. Don&#39;t use the | character.
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
        public Builder schema(Output<String> schema) {
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
        public Builder statement(Output<String> statement) {
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
         * @deprecated
         * Use the &#39;snowflake_tag_association&#39; resource instead.
         * 
         */
        @Deprecated /* Use the 'snowflake_tag_association' resource instead. */
        public Builder tags(@Nullable Output<List<ViewTagArgs>> tags) {
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
        public Builder tags(List<ViewTagArgs> tags) {
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
        public Builder tags(ViewTagArgs... tags) {
            return tags(List.of(tags));
        }

        public ViewArgs build() {
            $.database = Objects.requireNonNull($.database, "expected parameter 'database' to be non-null");
            $.schema = Objects.requireNonNull($.schema, "expected parameter 'schema' to be non-null");
            $.statement = Objects.requireNonNull($.statement, "expected parameter 'statement' to be non-null");
            return $;
        }
    }

}
