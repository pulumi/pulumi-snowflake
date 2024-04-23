// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.snowflake.inputs.FunctionArgumentArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FunctionState extends com.pulumi.resources.ResourceArgs {

    public static final FunctionState Empty = new FunctionState();

    /**
     * List of the arguments for the function
     * 
     */
    @Import(name="arguments")
    private @Nullable Output<List<FunctionArgumentArgs>> arguments;

    /**
     * @return List of the arguments for the function
     * 
     */
    public Optional<Output<List<FunctionArgumentArgs>>> arguments() {
        return Optional.ofNullable(this.arguments);
    }

    /**
     * Specifies a comment for the function.
     * 
     */
    @Import(name="comment")
    private @Nullable Output<String> comment;

    /**
     * @return Specifies a comment for the function.
     * 
     */
    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    /**
     * The database in which to create the function. Don&#39;t use the | character.
     * 
     */
    @Import(name="database")
    private @Nullable Output<String> database;

    /**
     * @return The database in which to create the function. Don&#39;t use the | character.
     * 
     */
    public Optional<Output<String>> database() {
        return Optional.ofNullable(this.database);
    }

    /**
     * The handler method for Java / Python function.
     * 
     */
    @Import(name="handler")
    private @Nullable Output<String> handler;

    /**
     * @return The handler method for Java / Python function.
     * 
     */
    public Optional<Output<String>> handler() {
        return Optional.ofNullable(this.handler);
    }

    /**
     * Imports for Java / Python functions. For Java this a list of jar files, for Python this is a list of Python files.
     * 
     */
    @Import(name="imports")
    private @Nullable Output<List<String>> imports;

    /**
     * @return Imports for Java / Python functions. For Java this a list of jar files, for Python this is a list of Python files.
     * 
     */
    public Optional<Output<List<String>>> imports() {
        return Optional.ofNullable(this.imports);
    }

    /**
     * Specifies that the function is secure.
     * 
     */
    @Import(name="isSecure")
    private @Nullable Output<Boolean> isSecure;

    /**
     * @return Specifies that the function is secure.
     * 
     */
    public Optional<Output<Boolean>> isSecure() {
        return Optional.ofNullable(this.isSecure);
    }

    /**
     * Specifies the language of the stored function code.
     * 
     */
    @Import(name="language")
    private @Nullable Output<String> language;

    /**
     * @return Specifies the language of the stored function code.
     * 
     */
    public Optional<Output<String>> language() {
        return Optional.ofNullable(this.language);
    }

    /**
     * Specifies the identifier for the function; does not have to be unique for the schema in which the function is created. Don&#39;t use the | character.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the identifier for the function; does not have to be unique for the schema in which the function is created. Don&#39;t use the | character.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specifies the behavior of the function when called with null inputs.
     * 
     */
    @Import(name="nullInputBehavior")
    private @Nullable Output<String> nullInputBehavior;

    /**
     * @return Specifies the behavior of the function when called with null inputs.
     * 
     */
    public Optional<Output<String>> nullInputBehavior() {
        return Optional.ofNullable(this.nullInputBehavior);
    }

    /**
     * List of package imports to use for Java / Python functions. For Java, package imports should be of the form: package*name:version*number, where package*name is snowflake*domain:package. For Python use it should be: (&#39;numpy&#39;,&#39;pandas&#39;,&#39;xgboost==1.5.0&#39;).
     * 
     */
    @Import(name="packages")
    private @Nullable Output<List<String>> packages;

    /**
     * @return List of package imports to use for Java / Python functions. For Java, package imports should be of the form: package*name:version*number, where package*name is snowflake*domain:package. For Python use it should be: (&#39;numpy&#39;,&#39;pandas&#39;,&#39;xgboost==1.5.0&#39;).
     * 
     */
    public Optional<Output<List<String>>> packages() {
        return Optional.ofNullable(this.packages);
    }

    /**
     * Specifies the behavior of the function when returning results
     * 
     */
    @Import(name="returnBehavior")
    private @Nullable Output<String> returnBehavior;

    /**
     * @return Specifies the behavior of the function when returning results
     * 
     */
    public Optional<Output<String>> returnBehavior() {
        return Optional.ofNullable(this.returnBehavior);
    }

    /**
     * The return type of the function
     * 
     */
    @Import(name="returnType")
    private @Nullable Output<String> returnType;

    /**
     * @return The return type of the function
     * 
     */
    public Optional<Output<String>> returnType() {
        return Optional.ofNullable(this.returnType);
    }

    /**
     * Required for Python functions. Specifies Python runtime version.
     * 
     */
    @Import(name="runtimeVersion")
    private @Nullable Output<String> runtimeVersion;

    /**
     * @return Required for Python functions. Specifies Python runtime version.
     * 
     */
    public Optional<Output<String>> runtimeVersion() {
        return Optional.ofNullable(this.runtimeVersion);
    }

    /**
     * The schema in which to create the function. Don&#39;t use the | character.
     * 
     */
    @Import(name="schema")
    private @Nullable Output<String> schema;

    /**
     * @return The schema in which to create the function. Don&#39;t use the | character.
     * 
     */
    public Optional<Output<String>> schema() {
        return Optional.ofNullable(this.schema);
    }

    /**
     * Specifies the javascript / java / scala / sql / python code used to create the function.
     * 
     */
    @Import(name="statement")
    private @Nullable Output<String> statement;

    /**
     * @return Specifies the javascript / java / scala / sql / python code used to create the function.
     * 
     */
    public Optional<Output<String>> statement() {
        return Optional.ofNullable(this.statement);
    }

    /**
     * The target path for the Java / Python functions. For Java, it is the path of compiled jar files and for the Python it is the path of the Python files.
     * 
     */
    @Import(name="targetPath")
    private @Nullable Output<String> targetPath;

    /**
     * @return The target path for the Java / Python functions. For Java, it is the path of compiled jar files and for the Python it is the path of the Python files.
     * 
     */
    public Optional<Output<String>> targetPath() {
        return Optional.ofNullable(this.targetPath);
    }

    private FunctionState() {}

    private FunctionState(FunctionState $) {
        this.arguments = $.arguments;
        this.comment = $.comment;
        this.database = $.database;
        this.handler = $.handler;
        this.imports = $.imports;
        this.isSecure = $.isSecure;
        this.language = $.language;
        this.name = $.name;
        this.nullInputBehavior = $.nullInputBehavior;
        this.packages = $.packages;
        this.returnBehavior = $.returnBehavior;
        this.returnType = $.returnType;
        this.runtimeVersion = $.runtimeVersion;
        this.schema = $.schema;
        this.statement = $.statement;
        this.targetPath = $.targetPath;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FunctionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FunctionState $;

        public Builder() {
            $ = new FunctionState();
        }

        public Builder(FunctionState defaults) {
            $ = new FunctionState(Objects.requireNonNull(defaults));
        }

        /**
         * @param arguments List of the arguments for the function
         * 
         * @return builder
         * 
         */
        public Builder arguments(@Nullable Output<List<FunctionArgumentArgs>> arguments) {
            $.arguments = arguments;
            return this;
        }

        /**
         * @param arguments List of the arguments for the function
         * 
         * @return builder
         * 
         */
        public Builder arguments(List<FunctionArgumentArgs> arguments) {
            return arguments(Output.of(arguments));
        }

        /**
         * @param arguments List of the arguments for the function
         * 
         * @return builder
         * 
         */
        public Builder arguments(FunctionArgumentArgs... arguments) {
            return arguments(List.of(arguments));
        }

        /**
         * @param comment Specifies a comment for the function.
         * 
         * @return builder
         * 
         */
        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        /**
         * @param comment Specifies a comment for the function.
         * 
         * @return builder
         * 
         */
        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        /**
         * @param database The database in which to create the function. Don&#39;t use the | character.
         * 
         * @return builder
         * 
         */
        public Builder database(@Nullable Output<String> database) {
            $.database = database;
            return this;
        }

        /**
         * @param database The database in which to create the function. Don&#39;t use the | character.
         * 
         * @return builder
         * 
         */
        public Builder database(String database) {
            return database(Output.of(database));
        }

        /**
         * @param handler The handler method for Java / Python function.
         * 
         * @return builder
         * 
         */
        public Builder handler(@Nullable Output<String> handler) {
            $.handler = handler;
            return this;
        }

        /**
         * @param handler The handler method for Java / Python function.
         * 
         * @return builder
         * 
         */
        public Builder handler(String handler) {
            return handler(Output.of(handler));
        }

        /**
         * @param imports Imports for Java / Python functions. For Java this a list of jar files, for Python this is a list of Python files.
         * 
         * @return builder
         * 
         */
        public Builder imports(@Nullable Output<List<String>> imports) {
            $.imports = imports;
            return this;
        }

        /**
         * @param imports Imports for Java / Python functions. For Java this a list of jar files, for Python this is a list of Python files.
         * 
         * @return builder
         * 
         */
        public Builder imports(List<String> imports) {
            return imports(Output.of(imports));
        }

        /**
         * @param imports Imports for Java / Python functions. For Java this a list of jar files, for Python this is a list of Python files.
         * 
         * @return builder
         * 
         */
        public Builder imports(String... imports) {
            return imports(List.of(imports));
        }

        /**
         * @param isSecure Specifies that the function is secure.
         * 
         * @return builder
         * 
         */
        public Builder isSecure(@Nullable Output<Boolean> isSecure) {
            $.isSecure = isSecure;
            return this;
        }

        /**
         * @param isSecure Specifies that the function is secure.
         * 
         * @return builder
         * 
         */
        public Builder isSecure(Boolean isSecure) {
            return isSecure(Output.of(isSecure));
        }

        /**
         * @param language Specifies the language of the stored function code.
         * 
         * @return builder
         * 
         */
        public Builder language(@Nullable Output<String> language) {
            $.language = language;
            return this;
        }

        /**
         * @param language Specifies the language of the stored function code.
         * 
         * @return builder
         * 
         */
        public Builder language(String language) {
            return language(Output.of(language));
        }

        /**
         * @param name Specifies the identifier for the function; does not have to be unique for the schema in which the function is created. Don&#39;t use the | character.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the identifier for the function; does not have to be unique for the schema in which the function is created. Don&#39;t use the | character.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param nullInputBehavior Specifies the behavior of the function when called with null inputs.
         * 
         * @return builder
         * 
         */
        public Builder nullInputBehavior(@Nullable Output<String> nullInputBehavior) {
            $.nullInputBehavior = nullInputBehavior;
            return this;
        }

        /**
         * @param nullInputBehavior Specifies the behavior of the function when called with null inputs.
         * 
         * @return builder
         * 
         */
        public Builder nullInputBehavior(String nullInputBehavior) {
            return nullInputBehavior(Output.of(nullInputBehavior));
        }

        /**
         * @param packages List of package imports to use for Java / Python functions. For Java, package imports should be of the form: package*name:version*number, where package*name is snowflake*domain:package. For Python use it should be: (&#39;numpy&#39;,&#39;pandas&#39;,&#39;xgboost==1.5.0&#39;).
         * 
         * @return builder
         * 
         */
        public Builder packages(@Nullable Output<List<String>> packages) {
            $.packages = packages;
            return this;
        }

        /**
         * @param packages List of package imports to use for Java / Python functions. For Java, package imports should be of the form: package*name:version*number, where package*name is snowflake*domain:package. For Python use it should be: (&#39;numpy&#39;,&#39;pandas&#39;,&#39;xgboost==1.5.0&#39;).
         * 
         * @return builder
         * 
         */
        public Builder packages(List<String> packages) {
            return packages(Output.of(packages));
        }

        /**
         * @param packages List of package imports to use for Java / Python functions. For Java, package imports should be of the form: package*name:version*number, where package*name is snowflake*domain:package. For Python use it should be: (&#39;numpy&#39;,&#39;pandas&#39;,&#39;xgboost==1.5.0&#39;).
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
         */
        public Builder returnBehavior(@Nullable Output<String> returnBehavior) {
            $.returnBehavior = returnBehavior;
            return this;
        }

        /**
         * @param returnBehavior Specifies the behavior of the function when returning results
         * 
         * @return builder
         * 
         */
        public Builder returnBehavior(String returnBehavior) {
            return returnBehavior(Output.of(returnBehavior));
        }

        /**
         * @param returnType The return type of the function
         * 
         * @return builder
         * 
         */
        public Builder returnType(@Nullable Output<String> returnType) {
            $.returnType = returnType;
            return this;
        }

        /**
         * @param returnType The return type of the function
         * 
         * @return builder
         * 
         */
        public Builder returnType(String returnType) {
            return returnType(Output.of(returnType));
        }

        /**
         * @param runtimeVersion Required for Python functions. Specifies Python runtime version.
         * 
         * @return builder
         * 
         */
        public Builder runtimeVersion(@Nullable Output<String> runtimeVersion) {
            $.runtimeVersion = runtimeVersion;
            return this;
        }

        /**
         * @param runtimeVersion Required for Python functions. Specifies Python runtime version.
         * 
         * @return builder
         * 
         */
        public Builder runtimeVersion(String runtimeVersion) {
            return runtimeVersion(Output.of(runtimeVersion));
        }

        /**
         * @param schema The schema in which to create the function. Don&#39;t use the | character.
         * 
         * @return builder
         * 
         */
        public Builder schema(@Nullable Output<String> schema) {
            $.schema = schema;
            return this;
        }

        /**
         * @param schema The schema in which to create the function. Don&#39;t use the | character.
         * 
         * @return builder
         * 
         */
        public Builder schema(String schema) {
            return schema(Output.of(schema));
        }

        /**
         * @param statement Specifies the javascript / java / scala / sql / python code used to create the function.
         * 
         * @return builder
         * 
         */
        public Builder statement(@Nullable Output<String> statement) {
            $.statement = statement;
            return this;
        }

        /**
         * @param statement Specifies the javascript / java / scala / sql / python code used to create the function.
         * 
         * @return builder
         * 
         */
        public Builder statement(String statement) {
            return statement(Output.of(statement));
        }

        /**
         * @param targetPath The target path for the Java / Python functions. For Java, it is the path of compiled jar files and for the Python it is the path of the Python files.
         * 
         * @return builder
         * 
         */
        public Builder targetPath(@Nullable Output<String> targetPath) {
            $.targetPath = targetPath;
            return this;
        }

        /**
         * @param targetPath The target path for the Java / Python functions. For Java, it is the path of compiled jar files and for the Python it is the path of the Python files.
         * 
         * @return builder
         * 
         */
        public Builder targetPath(String targetPath) {
            return targetPath(Output.of(targetPath));
        }

        public FunctionState build() {
            return $;
        }
    }

}
