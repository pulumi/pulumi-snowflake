// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.snowflake.inputs.ProcedureArgumentArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProcedureArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProcedureArgs Empty = new ProcedureArgs();

    /**
     * List of the arguments for the procedure
     * 
     */
    @Import(name="arguments")
    private @Nullable Output<List<ProcedureArgumentArgs>> arguments;

    /**
     * @return List of the arguments for the procedure
     * 
     */
    public Optional<Output<List<ProcedureArgumentArgs>>> arguments() {
        return Optional.ofNullable(this.arguments);
    }

    /**
     * Specifies a comment for the procedure.
     * 
     */
    @Import(name="comment")
    private @Nullable Output<String> comment;

    /**
     * @return Specifies a comment for the procedure.
     * 
     */
    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    /**
     * The database in which to create the procedure. Don&#39;t use the | character.
     * 
     */
    @Import(name="database", required=true)
    private Output<String> database;

    /**
     * @return The database in which to create the procedure. Don&#39;t use the | character.
     * 
     */
    public Output<String> database() {
        return this.database;
    }

    /**
     * Sets execution context. Allowed values are CALLER and OWNER (consult a proper section in the [docs](https://docs.snowflake.com/en/sql-reference/sql/create-procedure#id1)). For more information see [caller&#39;s rights and owner&#39;s rights](https://docs.snowflake.com/en/developer-guide/stored-procedure/stored-procedures-rights).
     * 
     */
    @Import(name="executeAs")
    private @Nullable Output<String> executeAs;

    /**
     * @return Sets execution context. Allowed values are CALLER and OWNER (consult a proper section in the [docs](https://docs.snowflake.com/en/sql-reference/sql/create-procedure#id1)). For more information see [caller&#39;s rights and owner&#39;s rights](https://docs.snowflake.com/en/developer-guide/stored-procedure/stored-procedures-rights).
     * 
     */
    public Optional<Output<String>> executeAs() {
        return Optional.ofNullable(this.executeAs);
    }

    /**
     * The handler method for Java / Python procedures.
     * 
     */
    @Import(name="handler")
    private @Nullable Output<String> handler;

    /**
     * @return The handler method for Java / Python procedures.
     * 
     */
    public Optional<Output<String>> handler() {
        return Optional.ofNullable(this.handler);
    }

    /**
     * Imports for Java / Python procedures. For Java this a list of jar files, for Python this is a list of Python files.
     * 
     */
    @Import(name="imports")
    private @Nullable Output<List<String>> imports;

    /**
     * @return Imports for Java / Python procedures. For Java this a list of jar files, for Python this is a list of Python files.
     * 
     */
    public Optional<Output<List<String>>> imports() {
        return Optional.ofNullable(this.imports);
    }

    /**
     * Specifies the language of the stored procedure code.
     * 
     */
    @Import(name="language")
    private @Nullable Output<String> language;

    /**
     * @return Specifies the language of the stored procedure code.
     * 
     */
    public Optional<Output<String>> language() {
        return Optional.ofNullable(this.language);
    }

    /**
     * Specifies the identifier for the procedure; does not have to be unique for the schema in which the procedure is created. Don&#39;t use the | character.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the identifier for the procedure; does not have to be unique for the schema in which the procedure is created. Don&#39;t use the | character.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specifies the behavior of the procedure when called with null inputs.
     * 
     */
    @Import(name="nullInputBehavior")
    private @Nullable Output<String> nullInputBehavior;

    /**
     * @return Specifies the behavior of the procedure when called with null inputs.
     * 
     */
    public Optional<Output<String>> nullInputBehavior() {
        return Optional.ofNullable(this.nullInputBehavior);
    }

    /**
     * List of package imports to use for Java / Python procedures. For Java, package imports should be of the form: package*name:version*number, where package*name is snowflake*domain:package. For Python use it should be: (&#39;numpy&#39;,&#39;pandas&#39;,&#39;xgboost==1.5.0&#39;).
     * 
     */
    @Import(name="packages")
    private @Nullable Output<List<String>> packages;

    /**
     * @return List of package imports to use for Java / Python procedures. For Java, package imports should be of the form: package*name:version*number, where package*name is snowflake*domain:package. For Python use it should be: (&#39;numpy&#39;,&#39;pandas&#39;,&#39;xgboost==1.5.0&#39;).
     * 
     */
    public Optional<Output<List<String>>> packages() {
        return Optional.ofNullable(this.packages);
    }

    /**
     * Specifies the behavior of the function when returning results
     * 
     * @deprecated
     * These keywords are deprecated for stored procedures. These keywords are not intended to apply to stored procedures. In a future release, these keywords will be removed from the documentation.
     * 
     */
    @Deprecated /* These keywords are deprecated for stored procedures. These keywords are not intended to apply to stored procedures. In a future release, these keywords will be removed from the documentation. */
    @Import(name="returnBehavior")
    private @Nullable Output<String> returnBehavior;

    /**
     * @return Specifies the behavior of the function when returning results
     * 
     * @deprecated
     * These keywords are deprecated for stored procedures. These keywords are not intended to apply to stored procedures. In a future release, these keywords will be removed from the documentation.
     * 
     */
    @Deprecated /* These keywords are deprecated for stored procedures. These keywords are not intended to apply to stored procedures. In a future release, these keywords will be removed from the documentation. */
    public Optional<Output<String>> returnBehavior() {
        return Optional.ofNullable(this.returnBehavior);
    }

    /**
     * The return type of the procedure
     * 
     */
    @Import(name="returnType", required=true)
    private Output<String> returnType;

    /**
     * @return The return type of the procedure
     * 
     */
    public Output<String> returnType() {
        return this.returnType;
    }

    /**
     * Required for Python procedures. Specifies Python runtime version.
     * 
     */
    @Import(name="runtimeVersion")
    private @Nullable Output<String> runtimeVersion;

    /**
     * @return Required for Python procedures. Specifies Python runtime version.
     * 
     */
    public Optional<Output<String>> runtimeVersion() {
        return Optional.ofNullable(this.runtimeVersion);
    }

    /**
     * The schema in which to create the procedure. Don&#39;t use the | character.
     * 
     */
    @Import(name="schema", required=true)
    private Output<String> schema;

    /**
     * @return The schema in which to create the procedure. Don&#39;t use the | character.
     * 
     */
    public Output<String> schema() {
        return this.schema;
    }

    /**
     * Specifies that the procedure is secure. For more information about secure procedures, see Protecting Sensitive Information with Secure UDFs and Stored Procedures.
     * 
     */
    @Import(name="secure")
    private @Nullable Output<Boolean> secure;

    /**
     * @return Specifies that the procedure is secure. For more information about secure procedures, see Protecting Sensitive Information with Secure UDFs and Stored Procedures.
     * 
     */
    public Optional<Output<Boolean>> secure() {
        return Optional.ofNullable(this.secure);
    }

    /**
     * Specifies the code used to create the procedure.
     * 
     */
    @Import(name="statement", required=true)
    private Output<String> statement;

    /**
     * @return Specifies the code used to create the procedure.
     * 
     */
    public Output<String> statement() {
        return this.statement;
    }

    private ProcedureArgs() {}

    private ProcedureArgs(ProcedureArgs $) {
        this.arguments = $.arguments;
        this.comment = $.comment;
        this.database = $.database;
        this.executeAs = $.executeAs;
        this.handler = $.handler;
        this.imports = $.imports;
        this.language = $.language;
        this.name = $.name;
        this.nullInputBehavior = $.nullInputBehavior;
        this.packages = $.packages;
        this.returnBehavior = $.returnBehavior;
        this.returnType = $.returnType;
        this.runtimeVersion = $.runtimeVersion;
        this.schema = $.schema;
        this.secure = $.secure;
        this.statement = $.statement;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProcedureArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProcedureArgs $;

        public Builder() {
            $ = new ProcedureArgs();
        }

        public Builder(ProcedureArgs defaults) {
            $ = new ProcedureArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param arguments List of the arguments for the procedure
         * 
         * @return builder
         * 
         */
        public Builder arguments(@Nullable Output<List<ProcedureArgumentArgs>> arguments) {
            $.arguments = arguments;
            return this;
        }

        /**
         * @param arguments List of the arguments for the procedure
         * 
         * @return builder
         * 
         */
        public Builder arguments(List<ProcedureArgumentArgs> arguments) {
            return arguments(Output.of(arguments));
        }

        /**
         * @param arguments List of the arguments for the procedure
         * 
         * @return builder
         * 
         */
        public Builder arguments(ProcedureArgumentArgs... arguments) {
            return arguments(List.of(arguments));
        }

        /**
         * @param comment Specifies a comment for the procedure.
         * 
         * @return builder
         * 
         */
        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        /**
         * @param comment Specifies a comment for the procedure.
         * 
         * @return builder
         * 
         */
        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        /**
         * @param database The database in which to create the procedure. Don&#39;t use the | character.
         * 
         * @return builder
         * 
         */
        public Builder database(Output<String> database) {
            $.database = database;
            return this;
        }

        /**
         * @param database The database in which to create the procedure. Don&#39;t use the | character.
         * 
         * @return builder
         * 
         */
        public Builder database(String database) {
            return database(Output.of(database));
        }

        /**
         * @param executeAs Sets execution context. Allowed values are CALLER and OWNER (consult a proper section in the [docs](https://docs.snowflake.com/en/sql-reference/sql/create-procedure#id1)). For more information see [caller&#39;s rights and owner&#39;s rights](https://docs.snowflake.com/en/developer-guide/stored-procedure/stored-procedures-rights).
         * 
         * @return builder
         * 
         */
        public Builder executeAs(@Nullable Output<String> executeAs) {
            $.executeAs = executeAs;
            return this;
        }

        /**
         * @param executeAs Sets execution context. Allowed values are CALLER and OWNER (consult a proper section in the [docs](https://docs.snowflake.com/en/sql-reference/sql/create-procedure#id1)). For more information see [caller&#39;s rights and owner&#39;s rights](https://docs.snowflake.com/en/developer-guide/stored-procedure/stored-procedures-rights).
         * 
         * @return builder
         * 
         */
        public Builder executeAs(String executeAs) {
            return executeAs(Output.of(executeAs));
        }

        /**
         * @param handler The handler method for Java / Python procedures.
         * 
         * @return builder
         * 
         */
        public Builder handler(@Nullable Output<String> handler) {
            $.handler = handler;
            return this;
        }

        /**
         * @param handler The handler method for Java / Python procedures.
         * 
         * @return builder
         * 
         */
        public Builder handler(String handler) {
            return handler(Output.of(handler));
        }

        /**
         * @param imports Imports for Java / Python procedures. For Java this a list of jar files, for Python this is a list of Python files.
         * 
         * @return builder
         * 
         */
        public Builder imports(@Nullable Output<List<String>> imports) {
            $.imports = imports;
            return this;
        }

        /**
         * @param imports Imports for Java / Python procedures. For Java this a list of jar files, for Python this is a list of Python files.
         * 
         * @return builder
         * 
         */
        public Builder imports(List<String> imports) {
            return imports(Output.of(imports));
        }

        /**
         * @param imports Imports for Java / Python procedures. For Java this a list of jar files, for Python this is a list of Python files.
         * 
         * @return builder
         * 
         */
        public Builder imports(String... imports) {
            return imports(List.of(imports));
        }

        /**
         * @param language Specifies the language of the stored procedure code.
         * 
         * @return builder
         * 
         */
        public Builder language(@Nullable Output<String> language) {
            $.language = language;
            return this;
        }

        /**
         * @param language Specifies the language of the stored procedure code.
         * 
         * @return builder
         * 
         */
        public Builder language(String language) {
            return language(Output.of(language));
        }

        /**
         * @param name Specifies the identifier for the procedure; does not have to be unique for the schema in which the procedure is created. Don&#39;t use the | character.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the identifier for the procedure; does not have to be unique for the schema in which the procedure is created. Don&#39;t use the | character.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param nullInputBehavior Specifies the behavior of the procedure when called with null inputs.
         * 
         * @return builder
         * 
         */
        public Builder nullInputBehavior(@Nullable Output<String> nullInputBehavior) {
            $.nullInputBehavior = nullInputBehavior;
            return this;
        }

        /**
         * @param nullInputBehavior Specifies the behavior of the procedure when called with null inputs.
         * 
         * @return builder
         * 
         */
        public Builder nullInputBehavior(String nullInputBehavior) {
            return nullInputBehavior(Output.of(nullInputBehavior));
        }

        /**
         * @param packages List of package imports to use for Java / Python procedures. For Java, package imports should be of the form: package*name:version*number, where package*name is snowflake*domain:package. For Python use it should be: (&#39;numpy&#39;,&#39;pandas&#39;,&#39;xgboost==1.5.0&#39;).
         * 
         * @return builder
         * 
         */
        public Builder packages(@Nullable Output<List<String>> packages) {
            $.packages = packages;
            return this;
        }

        /**
         * @param packages List of package imports to use for Java / Python procedures. For Java, package imports should be of the form: package*name:version*number, where package*name is snowflake*domain:package. For Python use it should be: (&#39;numpy&#39;,&#39;pandas&#39;,&#39;xgboost==1.5.0&#39;).
         * 
         * @return builder
         * 
         */
        public Builder packages(List<String> packages) {
            return packages(Output.of(packages));
        }

        /**
         * @param packages List of package imports to use for Java / Python procedures. For Java, package imports should be of the form: package*name:version*number, where package*name is snowflake*domain:package. For Python use it should be: (&#39;numpy&#39;,&#39;pandas&#39;,&#39;xgboost==1.5.0&#39;).
         * 
         * @return builder
         * 
         */
        public Builder packages(String... packages) {
            return packages(List.of(packages));
        }

        /**
         * @param returnBehavior Specifies the behavior of the function when returning results
         * 
         * @return builder
         * 
         * @deprecated
         * These keywords are deprecated for stored procedures. These keywords are not intended to apply to stored procedures. In a future release, these keywords will be removed from the documentation.
         * 
         */
        @Deprecated /* These keywords are deprecated for stored procedures. These keywords are not intended to apply to stored procedures. In a future release, these keywords will be removed from the documentation. */
        public Builder returnBehavior(@Nullable Output<String> returnBehavior) {
            $.returnBehavior = returnBehavior;
            return this;
        }

        /**
         * @param returnBehavior Specifies the behavior of the function when returning results
         * 
         * @return builder
         * 
         * @deprecated
         * These keywords are deprecated for stored procedures. These keywords are not intended to apply to stored procedures. In a future release, these keywords will be removed from the documentation.
         * 
         */
        @Deprecated /* These keywords are deprecated for stored procedures. These keywords are not intended to apply to stored procedures. In a future release, these keywords will be removed from the documentation. */
        public Builder returnBehavior(String returnBehavior) {
            return returnBehavior(Output.of(returnBehavior));
        }

        /**
         * @param returnType The return type of the procedure
         * 
         * @return builder
         * 
         */
        public Builder returnType(Output<String> returnType) {
            $.returnType = returnType;
            return this;
        }

        /**
         * @param returnType The return type of the procedure
         * 
         * @return builder
         * 
         */
        public Builder returnType(String returnType) {
            return returnType(Output.of(returnType));
        }

        /**
         * @param runtimeVersion Required for Python procedures. Specifies Python runtime version.
         * 
         * @return builder
         * 
         */
        public Builder runtimeVersion(@Nullable Output<String> runtimeVersion) {
            $.runtimeVersion = runtimeVersion;
            return this;
        }

        /**
         * @param runtimeVersion Required for Python procedures. Specifies Python runtime version.
         * 
         * @return builder
         * 
         */
        public Builder runtimeVersion(String runtimeVersion) {
            return runtimeVersion(Output.of(runtimeVersion));
        }

        /**
         * @param schema The schema in which to create the procedure. Don&#39;t use the | character.
         * 
         * @return builder
         * 
         */
        public Builder schema(Output<String> schema) {
            $.schema = schema;
            return this;
        }

        /**
         * @param schema The schema in which to create the procedure. Don&#39;t use the | character.
         * 
         * @return builder
         * 
         */
        public Builder schema(String schema) {
            return schema(Output.of(schema));
        }

        /**
         * @param secure Specifies that the procedure is secure. For more information about secure procedures, see Protecting Sensitive Information with Secure UDFs and Stored Procedures.
         * 
         * @return builder
         * 
         */
        public Builder secure(@Nullable Output<Boolean> secure) {
            $.secure = secure;
            return this;
        }

        /**
         * @param secure Specifies that the procedure is secure. For more information about secure procedures, see Protecting Sensitive Information with Secure UDFs and Stored Procedures.
         * 
         * @return builder
         * 
         */
        public Builder secure(Boolean secure) {
            return secure(Output.of(secure));
        }

        /**
         * @param statement Specifies the code used to create the procedure.
         * 
         * @return builder
         * 
         */
        public Builder statement(Output<String> statement) {
            $.statement = statement;
            return this;
        }

        /**
         * @param statement Specifies the code used to create the procedure.
         * 
         * @return builder
         * 
         */
        public Builder statement(String statement) {
            return statement(Output.of(statement));
        }

        public ProcedureArgs build() {
            if ($.database == null) {
                throw new MissingRequiredPropertyException("ProcedureArgs", "database");
            }
            if ($.returnType == null) {
                throw new MissingRequiredPropertyException("ProcedureArgs", "returnType");
            }
            if ($.schema == null) {
                throw new MissingRequiredPropertyException("ProcedureArgs", "schema");
            }
            if ($.statement == null) {
                throw new MissingRequiredPropertyException("ProcedureArgs", "statement");
            }
            return $;
        }
    }

}
