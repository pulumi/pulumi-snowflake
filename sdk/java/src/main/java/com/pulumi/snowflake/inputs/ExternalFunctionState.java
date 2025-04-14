// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.snowflake.inputs.ExternalFunctionArgArgs;
import com.pulumi.snowflake.inputs.ExternalFunctionHeaderArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ExternalFunctionState extends com.pulumi.resources.ResourceArgs {

    public static final ExternalFunctionState Empty = new ExternalFunctionState();

    /**
     * The name of the API integration object that should be used to authenticate the call to the proxy service.
     * 
     */
    @Import(name="apiIntegration")
    private @Nullable Output<String> apiIntegration;

    /**
     * @return The name of the API integration object that should be used to authenticate the call to the proxy service.
     * 
     */
    public Optional<Output<String>> apiIntegration() {
        return Optional.ofNullable(this.apiIntegration);
    }

    /**
     * Specifies the arguments/inputs for the external function. These should correspond to the arguments that the remote service expects.
     * 
     */
    @Import(name="args")
    private @Nullable Output<List<ExternalFunctionArgArgs>> args;

    /**
     * @return Specifies the arguments/inputs for the external function. These should correspond to the arguments that the remote service expects.
     * 
     */
    public Optional<Output<List<ExternalFunctionArgArgs>>> args() {
        return Optional.ofNullable(this.args);
    }

    /**
     * (Default: `user-defined function`) A description of the external function.
     * 
     */
    @Import(name="comment")
    private @Nullable Output<String> comment;

    /**
     * @return (Default: `user-defined function`) A description of the external function.
     * 
     */
    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    /**
     * (Default: `AUTO`) If specified, the JSON payload is compressed when sent from Snowflake to the proxy service, and when sent back from the proxy service to Snowflake.
     * 
     */
    @Import(name="compression")
    private @Nullable Output<String> compression;

    /**
     * @return (Default: `AUTO`) If specified, the JSON payload is compressed when sent from Snowflake to the proxy service, and when sent back from the proxy service to Snowflake.
     * 
     */
    public Optional<Output<String>> compression() {
        return Optional.ofNullable(this.compression);
    }

    /**
     * Binds Snowflake context function results to HTTP headers.
     * 
     */
    @Import(name="contextHeaders")
    private @Nullable Output<List<String>> contextHeaders;

    /**
     * @return Binds Snowflake context function results to HTTP headers.
     * 
     */
    public Optional<Output<List<String>>> contextHeaders() {
        return Optional.ofNullable(this.contextHeaders);
    }

    /**
     * Date and time when the external function was created.
     * 
     */
    @Import(name="createdOn")
    private @Nullable Output<String> createdOn;

    /**
     * @return Date and time when the external function was created.
     * 
     */
    public Optional<Output<String>> createdOn() {
        return Optional.ofNullable(this.createdOn);
    }

    /**
     * The database in which to create the external function.
     * 
     */
    @Import(name="database")
    private @Nullable Output<String> database;

    /**
     * @return The database in which to create the external function.
     * 
     */
    public Optional<Output<String>> database() {
        return Optional.ofNullable(this.database);
    }

    /**
     * Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
     * 
     */
    @Import(name="fullyQualifiedName")
    private @Nullable Output<String> fullyQualifiedName;

    /**
     * @return Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
     * 
     */
    public Optional<Output<String>> fullyQualifiedName() {
        return Optional.ofNullable(this.fullyQualifiedName);
    }

    /**
     * Allows users to specify key-value metadata that is sent with every request as HTTP headers.
     * 
     */
    @Import(name="headers")
    private @Nullable Output<List<ExternalFunctionHeaderArgs>> headers;

    /**
     * @return Allows users to specify key-value metadata that is sent with every request as HTTP headers.
     * 
     */
    public Optional<Output<List<ExternalFunctionHeaderArgs>>> headers() {
        return Optional.ofNullable(this.headers);
    }

    /**
     * This specifies the maximum number of rows in each batch sent to the proxy service.
     * 
     */
    @Import(name="maxBatchRows")
    private @Nullable Output<Integer> maxBatchRows;

    /**
     * @return This specifies the maximum number of rows in each batch sent to the proxy service.
     * 
     */
    public Optional<Output<Integer>> maxBatchRows() {
        return Optional.ofNullable(this.maxBatchRows);
    }

    /**
     * Specifies the identifier for the external function. The identifier can contain the schema name and database name, as well as the function name. The function&#39;s signature (name and argument data types) must be unique within the schema.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the identifier for the external function. The identifier can contain the schema name and database name, as well as the function name. The function&#39;s signature (name and argument data types) must be unique within the schema.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * (Default: `CALLED ON NULL INPUT`) Specifies the behavior of the external function when called with null inputs.
     * 
     */
    @Import(name="nullInputBehavior")
    private @Nullable Output<String> nullInputBehavior;

    /**
     * @return (Default: `CALLED ON NULL INPUT`) Specifies the behavior of the external function when called with null inputs.
     * 
     */
    public Optional<Output<String>> nullInputBehavior() {
        return Optional.ofNullable(this.nullInputBehavior);
    }

    /**
     * This specifies the name of the request translator function
     * 
     */
    @Import(name="requestTranslator")
    private @Nullable Output<String> requestTranslator;

    /**
     * @return This specifies the name of the request translator function
     * 
     */
    public Optional<Output<String>> requestTranslator() {
        return Optional.ofNullable(this.requestTranslator);
    }

    /**
     * This specifies the name of the response translator function.
     * 
     */
    @Import(name="responseTranslator")
    private @Nullable Output<String> responseTranslator;

    /**
     * @return This specifies the name of the response translator function.
     * 
     */
    public Optional<Output<String>> responseTranslator() {
        return Optional.ofNullable(this.responseTranslator);
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
     * (Default: `true`) Indicates whether the function can return NULL values (true) or must return only NON-NULL values (false).
     * 
     */
    @Import(name="returnNullAllowed")
    private @Nullable Output<Boolean> returnNullAllowed;

    /**
     * @return (Default: `true`) Indicates whether the function can return NULL values (true) or must return only NON-NULL values (false).
     * 
     */
    public Optional<Output<Boolean>> returnNullAllowed() {
        return Optional.ofNullable(this.returnNullAllowed);
    }

    /**
     * Specifies the data type returned by the external function.
     * 
     */
    @Import(name="returnType")
    private @Nullable Output<String> returnType;

    /**
     * @return Specifies the data type returned by the external function.
     * 
     */
    public Optional<Output<String>> returnType() {
        return Optional.ofNullable(this.returnType);
    }

    /**
     * The schema in which to create the external function.
     * 
     */
    @Import(name="schema")
    private @Nullable Output<String> schema;

    /**
     * @return The schema in which to create the external function.
     * 
     */
    public Optional<Output<String>> schema() {
        return Optional.ofNullable(this.schema);
    }

    /**
     * This is the invocation URL of the proxy service and resource through which Snowflake calls the remote service.
     * 
     */
    @Import(name="urlOfProxyAndResource")
    private @Nullable Output<String> urlOfProxyAndResource;

    /**
     * @return This is the invocation URL of the proxy service and resource through which Snowflake calls the remote service.
     * 
     */
    public Optional<Output<String>> urlOfProxyAndResource() {
        return Optional.ofNullable(this.urlOfProxyAndResource);
    }

    private ExternalFunctionState() {}

    private ExternalFunctionState(ExternalFunctionState $) {
        this.apiIntegration = $.apiIntegration;
        this.args = $.args;
        this.comment = $.comment;
        this.compression = $.compression;
        this.contextHeaders = $.contextHeaders;
        this.createdOn = $.createdOn;
        this.database = $.database;
        this.fullyQualifiedName = $.fullyQualifiedName;
        this.headers = $.headers;
        this.maxBatchRows = $.maxBatchRows;
        this.name = $.name;
        this.nullInputBehavior = $.nullInputBehavior;
        this.requestTranslator = $.requestTranslator;
        this.responseTranslator = $.responseTranslator;
        this.returnBehavior = $.returnBehavior;
        this.returnNullAllowed = $.returnNullAllowed;
        this.returnType = $.returnType;
        this.schema = $.schema;
        this.urlOfProxyAndResource = $.urlOfProxyAndResource;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExternalFunctionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExternalFunctionState $;

        public Builder() {
            $ = new ExternalFunctionState();
        }

        public Builder(ExternalFunctionState defaults) {
            $ = new ExternalFunctionState(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiIntegration The name of the API integration object that should be used to authenticate the call to the proxy service.
         * 
         * @return builder
         * 
         */
        public Builder apiIntegration(@Nullable Output<String> apiIntegration) {
            $.apiIntegration = apiIntegration;
            return this;
        }

        /**
         * @param apiIntegration The name of the API integration object that should be used to authenticate the call to the proxy service.
         * 
         * @return builder
         * 
         */
        public Builder apiIntegration(String apiIntegration) {
            return apiIntegration(Output.of(apiIntegration));
        }

        /**
         * @param args Specifies the arguments/inputs for the external function. These should correspond to the arguments that the remote service expects.
         * 
         * @return builder
         * 
         */
        public Builder args(@Nullable Output<List<ExternalFunctionArgArgs>> args) {
            $.args = args;
            return this;
        }

        /**
         * @param args Specifies the arguments/inputs for the external function. These should correspond to the arguments that the remote service expects.
         * 
         * @return builder
         * 
         */
        public Builder args(List<ExternalFunctionArgArgs> args) {
            return args(Output.of(args));
        }

        /**
         * @param args Specifies the arguments/inputs for the external function. These should correspond to the arguments that the remote service expects.
         * 
         * @return builder
         * 
         */
        public Builder args(ExternalFunctionArgArgs... args) {
            return args(List.of(args));
        }

        /**
         * @param comment (Default: `user-defined function`) A description of the external function.
         * 
         * @return builder
         * 
         */
        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        /**
         * @param comment (Default: `user-defined function`) A description of the external function.
         * 
         * @return builder
         * 
         */
        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        /**
         * @param compression (Default: `AUTO`) If specified, the JSON payload is compressed when sent from Snowflake to the proxy service, and when sent back from the proxy service to Snowflake.
         * 
         * @return builder
         * 
         */
        public Builder compression(@Nullable Output<String> compression) {
            $.compression = compression;
            return this;
        }

        /**
         * @param compression (Default: `AUTO`) If specified, the JSON payload is compressed when sent from Snowflake to the proxy service, and when sent back from the proxy service to Snowflake.
         * 
         * @return builder
         * 
         */
        public Builder compression(String compression) {
            return compression(Output.of(compression));
        }

        /**
         * @param contextHeaders Binds Snowflake context function results to HTTP headers.
         * 
         * @return builder
         * 
         */
        public Builder contextHeaders(@Nullable Output<List<String>> contextHeaders) {
            $.contextHeaders = contextHeaders;
            return this;
        }

        /**
         * @param contextHeaders Binds Snowflake context function results to HTTP headers.
         * 
         * @return builder
         * 
         */
        public Builder contextHeaders(List<String> contextHeaders) {
            return contextHeaders(Output.of(contextHeaders));
        }

        /**
         * @param contextHeaders Binds Snowflake context function results to HTTP headers.
         * 
         * @return builder
         * 
         */
        public Builder contextHeaders(String... contextHeaders) {
            return contextHeaders(List.of(contextHeaders));
        }

        /**
         * @param createdOn Date and time when the external function was created.
         * 
         * @return builder
         * 
         */
        public Builder createdOn(@Nullable Output<String> createdOn) {
            $.createdOn = createdOn;
            return this;
        }

        /**
         * @param createdOn Date and time when the external function was created.
         * 
         * @return builder
         * 
         */
        public Builder createdOn(String createdOn) {
            return createdOn(Output.of(createdOn));
        }

        /**
         * @param database The database in which to create the external function.
         * 
         * @return builder
         * 
         */
        public Builder database(@Nullable Output<String> database) {
            $.database = database;
            return this;
        }

        /**
         * @param database The database in which to create the external function.
         * 
         * @return builder
         * 
         */
        public Builder database(String database) {
            return database(Output.of(database));
        }

        /**
         * @param fullyQualifiedName Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
         * 
         * @return builder
         * 
         */
        public Builder fullyQualifiedName(@Nullable Output<String> fullyQualifiedName) {
            $.fullyQualifiedName = fullyQualifiedName;
            return this;
        }

        /**
         * @param fullyQualifiedName Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
         * 
         * @return builder
         * 
         */
        public Builder fullyQualifiedName(String fullyQualifiedName) {
            return fullyQualifiedName(Output.of(fullyQualifiedName));
        }

        /**
         * @param headers Allows users to specify key-value metadata that is sent with every request as HTTP headers.
         * 
         * @return builder
         * 
         */
        public Builder headers(@Nullable Output<List<ExternalFunctionHeaderArgs>> headers) {
            $.headers = headers;
            return this;
        }

        /**
         * @param headers Allows users to specify key-value metadata that is sent with every request as HTTP headers.
         * 
         * @return builder
         * 
         */
        public Builder headers(List<ExternalFunctionHeaderArgs> headers) {
            return headers(Output.of(headers));
        }

        /**
         * @param headers Allows users to specify key-value metadata that is sent with every request as HTTP headers.
         * 
         * @return builder
         * 
         */
        public Builder headers(ExternalFunctionHeaderArgs... headers) {
            return headers(List.of(headers));
        }

        /**
         * @param maxBatchRows This specifies the maximum number of rows in each batch sent to the proxy service.
         * 
         * @return builder
         * 
         */
        public Builder maxBatchRows(@Nullable Output<Integer> maxBatchRows) {
            $.maxBatchRows = maxBatchRows;
            return this;
        }

        /**
         * @param maxBatchRows This specifies the maximum number of rows in each batch sent to the proxy service.
         * 
         * @return builder
         * 
         */
        public Builder maxBatchRows(Integer maxBatchRows) {
            return maxBatchRows(Output.of(maxBatchRows));
        }

        /**
         * @param name Specifies the identifier for the external function. The identifier can contain the schema name and database name, as well as the function name. The function&#39;s signature (name and argument data types) must be unique within the schema.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the identifier for the external function. The identifier can contain the schema name and database name, as well as the function name. The function&#39;s signature (name and argument data types) must be unique within the schema.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param nullInputBehavior (Default: `CALLED ON NULL INPUT`) Specifies the behavior of the external function when called with null inputs.
         * 
         * @return builder
         * 
         */
        public Builder nullInputBehavior(@Nullable Output<String> nullInputBehavior) {
            $.nullInputBehavior = nullInputBehavior;
            return this;
        }

        /**
         * @param nullInputBehavior (Default: `CALLED ON NULL INPUT`) Specifies the behavior of the external function when called with null inputs.
         * 
         * @return builder
         * 
         */
        public Builder nullInputBehavior(String nullInputBehavior) {
            return nullInputBehavior(Output.of(nullInputBehavior));
        }

        /**
         * @param requestTranslator This specifies the name of the request translator function
         * 
         * @return builder
         * 
         */
        public Builder requestTranslator(@Nullable Output<String> requestTranslator) {
            $.requestTranslator = requestTranslator;
            return this;
        }

        /**
         * @param requestTranslator This specifies the name of the request translator function
         * 
         * @return builder
         * 
         */
        public Builder requestTranslator(String requestTranslator) {
            return requestTranslator(Output.of(requestTranslator));
        }

        /**
         * @param responseTranslator This specifies the name of the response translator function.
         * 
         * @return builder
         * 
         */
        public Builder responseTranslator(@Nullable Output<String> responseTranslator) {
            $.responseTranslator = responseTranslator;
            return this;
        }

        /**
         * @param responseTranslator This specifies the name of the response translator function.
         * 
         * @return builder
         * 
         */
        public Builder responseTranslator(String responseTranslator) {
            return responseTranslator(Output.of(responseTranslator));
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
         * @param returnNullAllowed (Default: `true`) Indicates whether the function can return NULL values (true) or must return only NON-NULL values (false).
         * 
         * @return builder
         * 
         */
        public Builder returnNullAllowed(@Nullable Output<Boolean> returnNullAllowed) {
            $.returnNullAllowed = returnNullAllowed;
            return this;
        }

        /**
         * @param returnNullAllowed (Default: `true`) Indicates whether the function can return NULL values (true) or must return only NON-NULL values (false).
         * 
         * @return builder
         * 
         */
        public Builder returnNullAllowed(Boolean returnNullAllowed) {
            return returnNullAllowed(Output.of(returnNullAllowed));
        }

        /**
         * @param returnType Specifies the data type returned by the external function.
         * 
         * @return builder
         * 
         */
        public Builder returnType(@Nullable Output<String> returnType) {
            $.returnType = returnType;
            return this;
        }

        /**
         * @param returnType Specifies the data type returned by the external function.
         * 
         * @return builder
         * 
         */
        public Builder returnType(String returnType) {
            return returnType(Output.of(returnType));
        }

        /**
         * @param schema The schema in which to create the external function.
         * 
         * @return builder
         * 
         */
        public Builder schema(@Nullable Output<String> schema) {
            $.schema = schema;
            return this;
        }

        /**
         * @param schema The schema in which to create the external function.
         * 
         * @return builder
         * 
         */
        public Builder schema(String schema) {
            return schema(Output.of(schema));
        }

        /**
         * @param urlOfProxyAndResource This is the invocation URL of the proxy service and resource through which Snowflake calls the remote service.
         * 
         * @return builder
         * 
         */
        public Builder urlOfProxyAndResource(@Nullable Output<String> urlOfProxyAndResource) {
            $.urlOfProxyAndResource = urlOfProxyAndResource;
            return this;
        }

        /**
         * @param urlOfProxyAndResource This is the invocation URL of the proxy service and resource through which Snowflake calls the remote service.
         * 
         * @return builder
         * 
         */
        public Builder urlOfProxyAndResource(String urlOfProxyAndResource) {
            return urlOfProxyAndResource(Output.of(urlOfProxyAndResource));
        }

        public ExternalFunctionState build() {
            return $;
        }
    }

}
