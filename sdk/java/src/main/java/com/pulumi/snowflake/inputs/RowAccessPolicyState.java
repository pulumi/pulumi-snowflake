// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RowAccessPolicyState extends com.pulumi.resources.ResourceArgs {

    public static final RowAccessPolicyState Empty = new RowAccessPolicyState();

    /**
     * Specifies a comment for the row access policy.
     * 
     */
    @Import(name="comment")
    private @Nullable Output<String> comment;

    /**
     * @return Specifies a comment for the row access policy.
     * 
     */
    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    /**
     * The database in which to create the row access policy.
     * 
     */
    @Import(name="database")
    private @Nullable Output<String> database;

    /**
     * @return The database in which to create the row access policy.
     * 
     */
    public Optional<Output<String>> database() {
        return Optional.ofNullable(this.database);
    }

    /**
     * Specifies the identifier for the row access policy; must be unique for the database and schema in which the row access policy is created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the identifier for the row access policy; must be unique for the database and schema in which the row access policy is created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specifies the SQL expression. The expression can be any boolean-valued SQL expression.
     * 
     */
    @Import(name="rowAccessExpression")
    private @Nullable Output<String> rowAccessExpression;

    /**
     * @return Specifies the SQL expression. The expression can be any boolean-valued SQL expression.
     * 
     */
    public Optional<Output<String>> rowAccessExpression() {
        return Optional.ofNullable(this.rowAccessExpression);
    }

    /**
     * The schema in which to create the row access policy.
     * 
     */
    @Import(name="schema")
    private @Nullable Output<String> schema;

    /**
     * @return The schema in which to create the row access policy.
     * 
     */
    public Optional<Output<String>> schema() {
        return Optional.ofNullable(this.schema);
    }

    /**
     * Specifies signature (arguments) for the row access policy (uppercase and sorted to avoid recreation of resource). A signature specifies a set of attributes that must be considered to determine whether the row is accessible. The attribute values come from the database object (e.g. table or view) to be protected by the row access policy.
     * 
     */
    @Import(name="signature")
    private @Nullable Output<Map<String,String>> signature;

    /**
     * @return Specifies signature (arguments) for the row access policy (uppercase and sorted to avoid recreation of resource). A signature specifies a set of attributes that must be considered to determine whether the row is accessible. The attribute values come from the database object (e.g. table or view) to be protected by the row access policy.
     * 
     */
    public Optional<Output<Map<String,String>>> signature() {
        return Optional.ofNullable(this.signature);
    }

    private RowAccessPolicyState() {}

    private RowAccessPolicyState(RowAccessPolicyState $) {
        this.comment = $.comment;
        this.database = $.database;
        this.name = $.name;
        this.rowAccessExpression = $.rowAccessExpression;
        this.schema = $.schema;
        this.signature = $.signature;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RowAccessPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RowAccessPolicyState $;

        public Builder() {
            $ = new RowAccessPolicyState();
        }

        public Builder(RowAccessPolicyState defaults) {
            $ = new RowAccessPolicyState(Objects.requireNonNull(defaults));
        }

        /**
         * @param comment Specifies a comment for the row access policy.
         * 
         * @return builder
         * 
         */
        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        /**
         * @param comment Specifies a comment for the row access policy.
         * 
         * @return builder
         * 
         */
        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        /**
         * @param database The database in which to create the row access policy.
         * 
         * @return builder
         * 
         */
        public Builder database(@Nullable Output<String> database) {
            $.database = database;
            return this;
        }

        /**
         * @param database The database in which to create the row access policy.
         * 
         * @return builder
         * 
         */
        public Builder database(String database) {
            return database(Output.of(database));
        }

        /**
         * @param name Specifies the identifier for the row access policy; must be unique for the database and schema in which the row access policy is created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the identifier for the row access policy; must be unique for the database and schema in which the row access policy is created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param rowAccessExpression Specifies the SQL expression. The expression can be any boolean-valued SQL expression.
         * 
         * @return builder
         * 
         */
        public Builder rowAccessExpression(@Nullable Output<String> rowAccessExpression) {
            $.rowAccessExpression = rowAccessExpression;
            return this;
        }

        /**
         * @param rowAccessExpression Specifies the SQL expression. The expression can be any boolean-valued SQL expression.
         * 
         * @return builder
         * 
         */
        public Builder rowAccessExpression(String rowAccessExpression) {
            return rowAccessExpression(Output.of(rowAccessExpression));
        }

        /**
         * @param schema The schema in which to create the row access policy.
         * 
         * @return builder
         * 
         */
        public Builder schema(@Nullable Output<String> schema) {
            $.schema = schema;
            return this;
        }

        /**
         * @param schema The schema in which to create the row access policy.
         * 
         * @return builder
         * 
         */
        public Builder schema(String schema) {
            return schema(Output.of(schema));
        }

        /**
         * @param signature Specifies signature (arguments) for the row access policy (uppercase and sorted to avoid recreation of resource). A signature specifies a set of attributes that must be considered to determine whether the row is accessible. The attribute values come from the database object (e.g. table or view) to be protected by the row access policy.
         * 
         * @return builder
         * 
         */
        public Builder signature(@Nullable Output<Map<String,String>> signature) {
            $.signature = signature;
            return this;
        }

        /**
         * @param signature Specifies signature (arguments) for the row access policy (uppercase and sorted to avoid recreation of resource). A signature specifies a set of attributes that must be considered to determine whether the row is accessible. The attribute values come from the database object (e.g. table or view) to be protected by the row access policy.
         * 
         * @return builder
         * 
         */
        public Builder signature(Map<String,String> signature) {
            return signature(Output.of(signature));
        }

        public RowAccessPolicyState build() {
            return $;
        }
    }

}