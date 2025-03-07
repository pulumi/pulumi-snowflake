// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.snowflake.inputs.RowAccessPolicyArgumentArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RowAccessPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final RowAccessPolicyArgs Empty = new RowAccessPolicyArgs();

    /**
     * List of the arguments for the row access policy. A signature specifies a set of attributes that must be considered to determine whether the row is accessible. The attribute values come from the database object (e.g. table or view) to be protected by the row access policy. If any argument name or type is changed, the resource is recreated.
     * 
     */
    @Import(name="arguments", required=true)
    private Output<List<RowAccessPolicyArgumentArgs>> arguments;

    /**
     * @return List of the arguments for the row access policy. A signature specifies a set of attributes that must be considered to determine whether the row is accessible. The attribute values come from the database object (e.g. table or view) to be protected by the row access policy. If any argument name or type is changed, the resource is recreated.
     * 
     */
    public Output<List<RowAccessPolicyArgumentArgs>> arguments() {
        return this.arguments;
    }

    /**
     * Specifies the SQL expression. The expression can be any boolean-valued SQL expression. To mitigate permadiff on this field, the provider replaces blank characters with a space. This can lead to false positives in cases where a change in case or run of whitespace is semantically significant.
     * 
     */
    @Import(name="body", required=true)
    private Output<String> body;

    /**
     * @return Specifies the SQL expression. The expression can be any boolean-valued SQL expression. To mitigate permadiff on this field, the provider replaces blank characters with a space. This can lead to false positives in cases where a change in case or run of whitespace is semantically significant.
     * 
     */
    public Output<String> body() {
        return this.body;
    }

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
     * The database in which to create the row access policy. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`.
     * 
     */
    @Import(name="database", required=true)
    private Output<String> database;

    /**
     * @return The database in which to create the row access policy. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`.
     * 
     */
    public Output<String> database() {
        return this.database;
    }

    /**
     * Specifies the identifier for the row access policy; must be unique for the database and schema in which the row access policy is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the identifier for the row access policy; must be unique for the database and schema in which the row access policy is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The schema in which to create the row access policy. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`.
     * 
     */
    @Import(name="schema", required=true)
    private Output<String> schema;

    /**
     * @return The schema in which to create the row access policy. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`.
     * 
     */
    public Output<String> schema() {
        return this.schema;
    }

    private RowAccessPolicyArgs() {}

    private RowAccessPolicyArgs(RowAccessPolicyArgs $) {
        this.arguments = $.arguments;
        this.body = $.body;
        this.comment = $.comment;
        this.database = $.database;
        this.name = $.name;
        this.schema = $.schema;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RowAccessPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RowAccessPolicyArgs $;

        public Builder() {
            $ = new RowAccessPolicyArgs();
        }

        public Builder(RowAccessPolicyArgs defaults) {
            $ = new RowAccessPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param arguments List of the arguments for the row access policy. A signature specifies a set of attributes that must be considered to determine whether the row is accessible. The attribute values come from the database object (e.g. table or view) to be protected by the row access policy. If any argument name or type is changed, the resource is recreated.
         * 
         * @return builder
         * 
         */
        public Builder arguments(Output<List<RowAccessPolicyArgumentArgs>> arguments) {
            $.arguments = arguments;
            return this;
        }

        /**
         * @param arguments List of the arguments for the row access policy. A signature specifies a set of attributes that must be considered to determine whether the row is accessible. The attribute values come from the database object (e.g. table or view) to be protected by the row access policy. If any argument name or type is changed, the resource is recreated.
         * 
         * @return builder
         * 
         */
        public Builder arguments(List<RowAccessPolicyArgumentArgs> arguments) {
            return arguments(Output.of(arguments));
        }

        /**
         * @param arguments List of the arguments for the row access policy. A signature specifies a set of attributes that must be considered to determine whether the row is accessible. The attribute values come from the database object (e.g. table or view) to be protected by the row access policy. If any argument name or type is changed, the resource is recreated.
         * 
         * @return builder
         * 
         */
        public Builder arguments(RowAccessPolicyArgumentArgs... arguments) {
            return arguments(List.of(arguments));
        }

        /**
         * @param body Specifies the SQL expression. The expression can be any boolean-valued SQL expression. To mitigate permadiff on this field, the provider replaces blank characters with a space. This can lead to false positives in cases where a change in case or run of whitespace is semantically significant.
         * 
         * @return builder
         * 
         */
        public Builder body(Output<String> body) {
            $.body = body;
            return this;
        }

        /**
         * @param body Specifies the SQL expression. The expression can be any boolean-valued SQL expression. To mitigate permadiff on this field, the provider replaces blank characters with a space. This can lead to false positives in cases where a change in case or run of whitespace is semantically significant.
         * 
         * @return builder
         * 
         */
        public Builder body(String body) {
            return body(Output.of(body));
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
         * @param database The database in which to create the row access policy. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder database(Output<String> database) {
            $.database = database;
            return this;
        }

        /**
         * @param database The database in which to create the row access policy. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder database(String database) {
            return database(Output.of(database));
        }

        /**
         * @param name Specifies the identifier for the row access policy; must be unique for the database and schema in which the row access policy is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the identifier for the row access policy; must be unique for the database and schema in which the row access policy is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param schema The schema in which to create the row access policy. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder schema(Output<String> schema) {
            $.schema = schema;
            return this;
        }

        /**
         * @param schema The schema in which to create the row access policy. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder schema(String schema) {
            return schema(Output.of(schema));
        }

        public RowAccessPolicyArgs build() {
            if ($.arguments == null) {
                throw new MissingRequiredPropertyException("RowAccessPolicyArgs", "arguments");
            }
            if ($.body == null) {
                throw new MissingRequiredPropertyException("RowAccessPolicyArgs", "body");
            }
            if ($.database == null) {
                throw new MissingRequiredPropertyException("RowAccessPolicyArgs", "database");
            }
            if ($.schema == null) {
                throw new MissingRequiredPropertyException("RowAccessPolicyArgs", "schema");
            }
            return $;
        }
    }

}
