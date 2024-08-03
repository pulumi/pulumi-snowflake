// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.snowflake.NetworkRuleArgs;
import com.pulumi.snowflake.Utilities;
import com.pulumi.snowflake.inputs.NetworkRuleState;
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
 * import com.pulumi.snowflake.NetworkRule;
 * import com.pulumi.snowflake.NetworkRuleArgs;
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
 *         var rule = new NetworkRule("rule", NetworkRuleArgs.builder()
 *             .name("rule")
 *             .database("EXAMPLE_DB")
 *             .schema("EXAMPLE_SCHEMA")
 *             .comment("A rule.")
 *             .type("IPV4")
 *             .mode("INGRESS")
 *             .valueLists(            
 *                 "192.168.0.100/24",
 *                 "29.254.123.20")
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
 * ```sh
 * $ pulumi import snowflake:index/networkRule:NetworkRule example &#39;databaseName|schemaName|networkRuleName&#39;
 * ```
 * 
 */
@ResourceType(type="snowflake:index/networkRule:NetworkRule")
public class NetworkRule extends com.pulumi.resources.CustomResource {
    /**
     * Specifies a comment for the network rule.
     * 
     */
    @Export(name="comment", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> comment;

    /**
     * @return Specifies a comment for the network rule.
     * 
     */
    public Output<Optional<String>> comment() {
        return Codegen.optional(this.comment);
    }
    /**
     * The database in which to create the network rule.
     * 
     */
    @Export(name="database", refs={String.class}, tree="[0]")
    private Output<String> database;

    /**
     * @return The database in which to create the network rule.
     * 
     */
    public Output<String> database() {
        return this.database;
    }
    /**
     * Specifies what is restricted by the network rule. Valid values are INGRESS, INTERNAL_STAGE and EGRESS; see https://docs.snowflake.com/en/sql-reference/sql/create-network-rule#required-parameters for details.
     * 
     */
    @Export(name="mode", refs={String.class}, tree="[0]")
    private Output<String> mode;

    /**
     * @return Specifies what is restricted by the network rule. Valid values are INGRESS, INTERNAL_STAGE and EGRESS; see https://docs.snowflake.com/en/sql-reference/sql/create-network-rule#required-parameters for details.
     * 
     */
    public Output<String> mode() {
        return this.mode;
    }
    /**
     * Specifies the identifier for the network rule; must be unique for the database and schema in which the network rule is created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Specifies the identifier for the network rule; must be unique for the database and schema in which the network rule is created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Qualified name of the network rule.
     * 
     */
    @Export(name="qualifiedName", refs={String.class}, tree="[0]")
    private Output<String> qualifiedName;

    /**
     * @return Qualified name of the network rule.
     * 
     */
    public Output<String> qualifiedName() {
        return this.qualifiedName;
    }
    /**
     * The schema in which to create the network rule.
     * 
     */
    @Export(name="schema", refs={String.class}, tree="[0]")
    private Output<String> schema;

    /**
     * @return The schema in which to create the network rule.
     * 
     */
    public Output<String> schema() {
        return this.schema;
    }
    /**
     * Specifies the type of network identifiers being allowed or blocked. A network rule can have only one type. Allowed values are IPV4, AWSVPCEID, AZURELINKID and HOST_PORT; allowed values are determined by the mode of the network rule; see https://docs.snowflake.com/en/sql-reference/sql/create-network-rule#required-parameters for details.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return Specifies the type of network identifiers being allowed or blocked. A network rule can have only one type. Allowed values are IPV4, AWSVPCEID, AZURELINKID and HOST_PORT; allowed values are determined by the mode of the network rule; see https://docs.snowflake.com/en/sql-reference/sql/create-network-rule#required-parameters for details.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * Specifies the network identifiers that will be allowed or blocked. Valid values in the list are determined by the type of network rule, see https://docs.snowflake.com/en/sql-reference/sql/create-network-rule#required-parameters for details.
     * 
     */
    @Export(name="valueLists", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> valueLists;

    /**
     * @return Specifies the network identifiers that will be allowed or blocked. Valid values in the list are determined by the type of network rule, see https://docs.snowflake.com/en/sql-reference/sql/create-network-rule#required-parameters for details.
     * 
     */
    public Output<List<String>> valueLists() {
        return this.valueLists;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NetworkRule(String name) {
        this(name, NetworkRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NetworkRule(String name, NetworkRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NetworkRule(String name, NetworkRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/networkRule:NetworkRule", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()));
    }

    private NetworkRule(String name, Output<String> id, @Nullable NetworkRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/networkRule:NetworkRule", name, state, makeResourceOptions(options, id));
    }

    private static NetworkRuleArgs makeArgs(NetworkRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? NetworkRuleArgs.Empty : args;
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
    public static NetworkRule get(String name, Output<String> id, @Nullable NetworkRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new NetworkRule(name, id, state, options);
    }
}
