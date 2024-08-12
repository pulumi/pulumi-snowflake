// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.snowflake.ExternalFunctionArgs;
import com.pulumi.snowflake.Utilities;
import com.pulumi.snowflake.inputs.ExternalFunctionState;
import com.pulumi.snowflake.outputs.ExternalFunctionArg;
import com.pulumi.snowflake.outputs.ExternalFunctionHeader;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.snowflake.ExternalFunction;
 * import com.pulumi.snowflake.ExternalFunctionArgs;
 * import com.pulumi.snowflake.inputs.ExternalFunctionArgArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var testExtFunc = new ExternalFunction("testExtFunc", ExternalFunctionArgs.builder()
 *             .name("my_function")
 *             .database("my_test_db")
 *             .schema("my_test_schema")
 *             .args(            
 *                 ExternalFunctionArgArgs.builder()
 *                     .name("arg1")
 *                     .type("varchar")
 *                     .build(),
 *                 ExternalFunctionArgArgs.builder()
 *                     .name("arg2")
 *                     .type("varchar")
 *                     .build())
 *             .returnType("variant")
 *             .returnBehavior("IMMUTABLE")
 *             .apiIntegration("api_integration_name")
 *             .urlOfProxyAndResource("https://123456.execute-api.us-west-2.amazonaws.com/prod/test_func")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * format is &lt;database_name&gt;.&lt;schema_name&gt;.&lt;external_function_name&gt;(&lt;arg types, separated with &#39;,&#39;&gt;)
 * 
 * ```sh
 * $ pulumi import snowflake:index/externalFunction:ExternalFunction example &#39;dbName.schemaName.externalFunctionName(varchar, varchar, varchar)&#39;
 * ```
 * 
 */
@ResourceType(type="snowflake:index/externalFunction:ExternalFunction")
public class ExternalFunction extends com.pulumi.resources.CustomResource {
    /**
     * The name of the API integration object that should be used to authenticate the call to the proxy service.
     * 
     */
    @Export(name="apiIntegration", refs={String.class}, tree="[0]")
    private Output<String> apiIntegration;

    /**
     * @return The name of the API integration object that should be used to authenticate the call to the proxy service.
     * 
     */
    public Output<String> apiIntegration() {
        return this.apiIntegration;
    }
    /**
     * Specifies the arguments/inputs for the external function. These should correspond to the arguments that the remote service expects.
     * 
     */
    @Export(name="args", refs={List.class,ExternalFunctionArg.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ExternalFunctionArg>> args;

    /**
     * @return Specifies the arguments/inputs for the external function. These should correspond to the arguments that the remote service expects.
     * 
     */
    public Output<Optional<List<ExternalFunctionArg>>> args() {
        return Codegen.optional(this.args);
    }
    /**
     * A description of the external function.
     * 
     */
    @Export(name="comment", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> comment;

    /**
     * @return A description of the external function.
     * 
     */
    public Output<Optional<String>> comment() {
        return Codegen.optional(this.comment);
    }
    /**
     * If specified, the JSON payload is compressed when sent from Snowflake to the proxy service, and when sent back from the proxy service to Snowflake.
     * 
     */
    @Export(name="compression", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> compression;

    /**
     * @return If specified, the JSON payload is compressed when sent from Snowflake to the proxy service, and when sent back from the proxy service to Snowflake.
     * 
     */
    public Output<Optional<String>> compression() {
        return Codegen.optional(this.compression);
    }
    /**
     * Binds Snowflake context function results to HTTP headers.
     * 
     */
    @Export(name="contextHeaders", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> contextHeaders;

    /**
     * @return Binds Snowflake context function results to HTTP headers.
     * 
     */
    public Output<Optional<List<String>>> contextHeaders() {
        return Codegen.optional(this.contextHeaders);
    }
    /**
     * Date and time when the external function was created.
     * 
     */
    @Export(name="createdOn", refs={String.class}, tree="[0]")
    private Output<String> createdOn;

    /**
     * @return Date and time when the external function was created.
     * 
     */
    public Output<String> createdOn() {
        return this.createdOn;
    }
    /**
     * The database in which to create the external function.
     * 
     */
    @Export(name="database", refs={String.class}, tree="[0]")
    private Output<String> database;

    /**
     * @return The database in which to create the external function.
     * 
     */
    public Output<String> database() {
        return this.database;
    }
    /**
     * Allows users to specify key-value metadata that is sent with every request as HTTP headers.
     * 
     */
    @Export(name="headers", refs={List.class,ExternalFunctionHeader.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ExternalFunctionHeader>> headers;

    /**
     * @return Allows users to specify key-value metadata that is sent with every request as HTTP headers.
     * 
     */
    public Output<Optional<List<ExternalFunctionHeader>>> headers() {
        return Codegen.optional(this.headers);
    }
    /**
     * This specifies the maximum number of rows in each batch sent to the proxy service.
     * 
     */
    @Export(name="maxBatchRows", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> maxBatchRows;

    /**
     * @return This specifies the maximum number of rows in each batch sent to the proxy service.
     * 
     */
    public Output<Optional<Integer>> maxBatchRows() {
        return Codegen.optional(this.maxBatchRows);
    }
    /**
     * Specifies the identifier for the external function. The identifier can contain the schema name and database name, as well as the function name. The function&#39;s signature (name and argument data types) must be unique within the schema.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Specifies the identifier for the external function. The identifier can contain the schema name and database name, as well as the function name. The function&#39;s signature (name and argument data types) must be unique within the schema.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Specifies the behavior of the external function when called with null inputs.
     * 
     */
    @Export(name="nullInputBehavior", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> nullInputBehavior;

    /**
     * @return Specifies the behavior of the external function when called with null inputs.
     * 
     */
    public Output<Optional<String>> nullInputBehavior() {
        return Codegen.optional(this.nullInputBehavior);
    }
    /**
     * This specifies the name of the request translator function
     * 
     */
    @Export(name="requestTranslator", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> requestTranslator;

    /**
     * @return This specifies the name of the request translator function
     * 
     */
    public Output<Optional<String>> requestTranslator() {
        return Codegen.optional(this.requestTranslator);
    }
    /**
     * This specifies the name of the response translator function.
     * 
     */
    @Export(name="responseTranslator", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> responseTranslator;

    /**
     * @return This specifies the name of the response translator function.
     * 
     */
    public Output<Optional<String>> responseTranslator() {
        return Codegen.optional(this.responseTranslator);
    }
    /**
     * Specifies the behavior of the function when returning results
     * 
     */
    @Export(name="returnBehavior", refs={String.class}, tree="[0]")
    private Output<String> returnBehavior;

    /**
     * @return Specifies the behavior of the function when returning results
     * 
     */
    public Output<String> returnBehavior() {
        return this.returnBehavior;
    }
    /**
     * Indicates whether the function can return NULL values (true) or must return only NON-NULL values (false).
     * 
     */
    @Export(name="returnNullAllowed", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> returnNullAllowed;

    /**
     * @return Indicates whether the function can return NULL values (true) or must return only NON-NULL values (false).
     * 
     */
    public Output<Optional<Boolean>> returnNullAllowed() {
        return Codegen.optional(this.returnNullAllowed);
    }
    /**
     * Specifies the data type returned by the external function.
     * 
     */
    @Export(name="returnType", refs={String.class}, tree="[0]")
    private Output<String> returnType;

    /**
     * @return Specifies the data type returned by the external function.
     * 
     */
    public Output<String> returnType() {
        return this.returnType;
    }
    /**
     * The schema in which to create the external function.
     * 
     */
    @Export(name="schema", refs={String.class}, tree="[0]")
    private Output<String> schema;

    /**
     * @return The schema in which to create the external function.
     * 
     */
    public Output<String> schema() {
        return this.schema;
    }
    /**
     * This is the invocation URL of the proxy service and resource through which Snowflake calls the remote service.
     * 
     */
    @Export(name="urlOfProxyAndResource", refs={String.class}, tree="[0]")
    private Output<String> urlOfProxyAndResource;

    /**
     * @return This is the invocation URL of the proxy service and resource through which Snowflake calls the remote service.
     * 
     */
    public Output<String> urlOfProxyAndResource() {
        return this.urlOfProxyAndResource;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ExternalFunction(java.lang.String name) {
        this(name, ExternalFunctionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ExternalFunction(java.lang.String name, ExternalFunctionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ExternalFunction(java.lang.String name, ExternalFunctionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/externalFunction:ExternalFunction", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ExternalFunction(java.lang.String name, Output<java.lang.String> id, @Nullable ExternalFunctionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/externalFunction:ExternalFunction", name, state, makeResourceOptions(options, id), false);
    }

    private static ExternalFunctionArgs makeArgs(ExternalFunctionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ExternalFunctionArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ExternalFunction get(java.lang.String name, Output<java.lang.String> id, @Nullable ExternalFunctionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ExternalFunction(name, id, state, options);
    }
}
