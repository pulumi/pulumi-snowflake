// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.snowflake.AlertArgs;
import com.pulumi.snowflake.Utilities;
import com.pulumi.snowflake.inputs.AlertState;
import com.pulumi.snowflake.outputs.AlertAlertSchedule;
import java.lang.Boolean;
import java.lang.String;
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
 * import com.pulumi.snowflake.Alert;
 * import com.pulumi.snowflake.AlertArgs;
 * import com.pulumi.snowflake.inputs.AlertAlertScheduleArgs;
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
 *         var alert = new Alert("alert", AlertArgs.builder()
 *             .database("database")
 *             .schema("schema")
 *             .name("alert")
 *             .warehouse("warehouse")
 *             .alertSchedule(AlertAlertScheduleArgs.builder()
 *                 .interval(10)
 *                 .build())
 *             .condition("select 1 as c")
 *             .action("select 1 as c")
 *             .enabled(true)
 *             .comment("my alert")
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
 * format is database name | schema name | alert name
 * 
 * ```sh
 * $ pulumi import snowflake:index/alert:Alert example &#39;dbName|schemaName|alertName&#39;
 * ```
 * 
 */
@ResourceType(type="snowflake:index/alert:Alert")
public class Alert extends com.pulumi.resources.CustomResource {
    /**
     * The SQL statement that should be executed if the condition returns one or more rows.
     * 
     */
    @Export(name="action", refs={String.class}, tree="[0]")
    private Output<String> action;

    /**
     * @return The SQL statement that should be executed if the condition returns one or more rows.
     * 
     */
    public Output<String> action() {
        return this.action;
    }
    /**
     * The schedule for periodically running an alert.
     * 
     */
    @Export(name="alertSchedule", refs={AlertAlertSchedule.class}, tree="[0]")
    private Output</* @Nullable */ AlertAlertSchedule> alertSchedule;

    /**
     * @return The schedule for periodically running an alert.
     * 
     */
    public Output<Optional<AlertAlertSchedule>> alertSchedule() {
        return Codegen.optional(this.alertSchedule);
    }
    /**
     * Specifies a comment for the alert.
     * 
     */
    @Export(name="comment", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> comment;

    /**
     * @return Specifies a comment for the alert.
     * 
     */
    public Output<Optional<String>> comment() {
        return Codegen.optional(this.comment);
    }
    /**
     * The SQL statement that represents the condition for the alert. (SELECT, SHOW, CALL)
     * 
     */
    @Export(name="condition", refs={String.class}, tree="[0]")
    private Output<String> condition;

    /**
     * @return The SQL statement that represents the condition for the alert. (SELECT, SHOW, CALL)
     * 
     */
    public Output<String> condition() {
        return this.condition;
    }
    /**
     * The database in which to create the alert.
     * 
     */
    @Export(name="database", refs={String.class}, tree="[0]")
    private Output<String> database;

    /**
     * @return The database in which to create the alert.
     * 
     */
    public Output<String> database() {
        return this.database;
    }
    /**
     * Specifies if an alert should be &#39;started&#39; (enabled) after creation or should remain &#39;suspended&#39; (default).
     * 
     */
    @Export(name="enabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return Specifies if an alert should be &#39;started&#39; (enabled) after creation or should remain &#39;suspended&#39; (default).
     * 
     */
    public Output<Optional<Boolean>> enabled() {
        return Codegen.optional(this.enabled);
    }
    /**
     * Specifies the identifier for the alert; must be unique for the database and schema in which the alert is created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Specifies the identifier for the alert; must be unique for the database and schema in which the alert is created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The schema in which to create the alert.
     * 
     */
    @Export(name="schema", refs={String.class}, tree="[0]")
    private Output<String> schema;

    /**
     * @return The schema in which to create the alert.
     * 
     */
    public Output<String> schema() {
        return this.schema;
    }
    /**
     * The warehouse the alert will use.
     * 
     */
    @Export(name="warehouse", refs={String.class}, tree="[0]")
    private Output<String> warehouse;

    /**
     * @return The warehouse the alert will use.
     * 
     */
    public Output<String> warehouse() {
        return this.warehouse;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Alert(String name) {
        this(name, AlertArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Alert(String name, AlertArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Alert(String name, AlertArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/alert:Alert", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()));
    }

    private Alert(String name, Output<String> id, @Nullable AlertState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/alert:Alert", name, state, makeResourceOptions(options, id));
    }

    private static AlertArgs makeArgs(AlertArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? AlertArgs.Empty : args;
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
    public static Alert get(String name, Output<String> id, @Nullable AlertState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Alert(name, id, state, options);
    }
}
