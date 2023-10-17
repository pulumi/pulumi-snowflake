// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.snowflake.ProcedureArgs;
import com.pulumi.snowflake.Utilities;
import com.pulumi.snowflake.inputs.ProcedureState;
import com.pulumi.snowflake.outputs.ProcedureArgument;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.snowflake.Database;
 * import com.pulumi.snowflake.DatabaseArgs;
 * import com.pulumi.snowflake.Schema;
 * import com.pulumi.snowflake.SchemaArgs;
 * import com.pulumi.snowflake.Procedure;
 * import com.pulumi.snowflake.ProcedureArgs;
 * import com.pulumi.snowflake.inputs.ProcedureArgumentArgs;
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
 *         var db = new Database(&#34;db&#34;, DatabaseArgs.builder()        
 *             .dataRetentionDays(1)
 *             .build());
 * 
 *         var schema = new Schema(&#34;schema&#34;, SchemaArgs.builder()        
 *             .database(db.name())
 *             .dataRetentionDays(1)
 *             .build());
 * 
 *         var proc = new Procedure(&#34;proc&#34;, ProcedureArgs.builder()        
 *             .database(db.name())
 *             .schema(schema.name())
 *             .language(&#34;JAVASCRIPT&#34;)
 *             .arguments(            
 *                 ProcedureArgumentArgs.builder()
 *                     .name(&#34;arg1&#34;)
 *                     .type(&#34;varchar&#34;)
 *                     .build(),
 *                 ProcedureArgumentArgs.builder()
 *                     .name(&#34;arg2&#34;)
 *                     .type(&#34;DATE&#34;)
 *                     .build())
 *             .comment(&#34;Procedure with 2 arguments&#34;)
 *             .returnType(&#34;VARCHAR&#34;)
 *             .executeAs(&#34;CALLER&#34;)
 *             .returnBehavior(&#34;IMMUTABLE&#34;)
 *             .nullInputBehavior(&#34;RETURNS NULL ON NULL INPUT&#34;)
 *             .statement(&#34;&#34;&#34;
 * var X=1
 * return X
 *             &#34;&#34;&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * format is database name | schema name | stored procedure name | &lt;list of arg types, separated with &#39;-&#39;&gt;
 * 
 * ```sh
 *  $ pulumi import snowflake:index/procedure:Procedure example &#39;dbName|schemaName|procedureName|varchar-varchar-varchar&#39;
 * ```
 * 
 */
@ResourceType(type="snowflake:index/procedure:Procedure")
public class Procedure extends com.pulumi.resources.CustomResource {
    /**
     * List of the arguments for the procedure
     * 
     */
    @Export(name="arguments", refs={List.class,ProcedureArgument.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ProcedureArgument>> arguments;

    /**
     * @return List of the arguments for the procedure
     * 
     */
    public Output<Optional<List<ProcedureArgument>>> arguments() {
        return Codegen.optional(this.arguments);
    }
    /**
     * Specifies a comment for the procedure.
     * 
     */
    @Export(name="comment", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> comment;

    /**
     * @return Specifies a comment for the procedure.
     * 
     */
    public Output<Optional<String>> comment() {
        return Codegen.optional(this.comment);
    }
    /**
     * The database in which to create the procedure. Don&#39;t use the | character.
     * 
     */
    @Export(name="database", refs={String.class}, tree="[0]")
    private Output<String> database;

    /**
     * @return The database in which to create the procedure. Don&#39;t use the | character.
     * 
     */
    public Output<String> database() {
        return this.database;
    }
    /**
     * Sets execute context - see caller&#39;s rights and owner&#39;s rights
     * 
     */
    @Export(name="executeAs", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> executeAs;

    /**
     * @return Sets execute context - see caller&#39;s rights and owner&#39;s rights
     * 
     */
    public Output<Optional<String>> executeAs() {
        return Codegen.optional(this.executeAs);
    }
    /**
     * The handler method for Java / Python procedures.
     * 
     */
    @Export(name="handler", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> handler;

    /**
     * @return The handler method for Java / Python procedures.
     * 
     */
    public Output<Optional<String>> handler() {
        return Codegen.optional(this.handler);
    }
    /**
     * Imports for Java / Python procedures. For Java this a list of jar files, for Python this is a list of Python files.
     * 
     */
    @Export(name="imports", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> imports;

    /**
     * @return Imports for Java / Python procedures. For Java this a list of jar files, for Python this is a list of Python files.
     * 
     */
    public Output<Optional<List<String>>> imports() {
        return Codegen.optional(this.imports);
    }
    /**
     * Specifies the language of the stored procedure code.
     * 
     */
    @Export(name="language", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> language;

    /**
     * @return Specifies the language of the stored procedure code.
     * 
     */
    public Output<Optional<String>> language() {
        return Codegen.optional(this.language);
    }
    /**
     * The argument name
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The argument name
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Specifies the behavior of the procedure when called with null inputs.
     * 
     */
    @Export(name="nullInputBehavior", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> nullInputBehavior;

    /**
     * @return Specifies the behavior of the procedure when called with null inputs.
     * 
     */
    public Output<Optional<String>> nullInputBehavior() {
        return Codegen.optional(this.nullInputBehavior);
    }
    /**
     * List of package imports to use for Java / Python procedures. For Java, package imports should be of the form: package*name:version*number, where package*name is snowflake*domain:package. For Python use it should be: (&#39;numpy&#39;,&#39;pandas&#39;,&#39;xgboost==1.5.0&#39;).
     * 
     */
    @Export(name="packages", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> packages;

    /**
     * @return List of package imports to use for Java / Python procedures. For Java, package imports should be of the form: package*name:version*number, where package*name is snowflake*domain:package. For Python use it should be: (&#39;numpy&#39;,&#39;pandas&#39;,&#39;xgboost==1.5.0&#39;).
     * 
     */
    public Output<Optional<List<String>>> packages() {
        return Codegen.optional(this.packages);
    }
    /**
     * Specifies the behavior of the function when returning results
     * 
     */
    @Export(name="returnBehavior", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> returnBehavior;

    /**
     * @return Specifies the behavior of the function when returning results
     * 
     */
    public Output<Optional<String>> returnBehavior() {
        return Codegen.optional(this.returnBehavior);
    }
    /**
     * The return type of the procedure
     * 
     */
    @Export(name="returnType", refs={String.class}, tree="[0]")
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
    @Export(name="runtimeVersion", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> runtimeVersion;

    /**
     * @return Required for Python procedures. Specifies Python runtime version.
     * 
     */
    public Output<Optional<String>> runtimeVersion() {
        return Codegen.optional(this.runtimeVersion);
    }
    /**
     * The schema in which to create the procedure. Don&#39;t use the | character.
     * 
     */
    @Export(name="schema", refs={String.class}, tree="[0]")
    private Output<String> schema;

    /**
     * @return The schema in which to create the procedure. Don&#39;t use the | character.
     * 
     */
    public Output<String> schema() {
        return this.schema;
    }
    /**
     * Specifies the code used to create the procedure.
     * 
     */
    @Export(name="statement", refs={String.class}, tree="[0]")
    private Output<String> statement;

    /**
     * @return Specifies the code used to create the procedure.
     * 
     */
    public Output<String> statement() {
        return this.statement;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Procedure(String name) {
        this(name, ProcedureArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Procedure(String name, ProcedureArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Procedure(String name, ProcedureArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/procedure:Procedure", name, args == null ? ProcedureArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Procedure(String name, Output<String> id, @Nullable ProcedureState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/procedure:Procedure", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
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
    public static Procedure get(String name, Output<String> id, @Nullable ProcedureState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Procedure(name, id, state, options);
    }
}
