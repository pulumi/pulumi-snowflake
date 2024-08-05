// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.snowflake.MaskingPolicyArgs;
import com.pulumi.snowflake.Utilities;
import com.pulumi.snowflake.inputs.MaskingPolicyState;
import com.pulumi.snowflake.outputs.MaskingPolicySignature;
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
 * import com.pulumi.snowflake.MaskingPolicy;
 * import com.pulumi.snowflake.MaskingPolicyArgs;
 * import com.pulumi.snowflake.inputs.MaskingPolicySignatureArgs;
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
 *         var test = new MaskingPolicy("test", MaskingPolicyArgs.builder()
 *             .name("EXAMPLE_MASKING_POLICY")
 *             .database("EXAMPLE_DB")
 *             .schema("EXAMPLE_SCHEMA")
 *             .signature(MaskingPolicySignatureArgs.builder()
 *                 .columns(MaskingPolicySignatureColumnArgs.builder()
 *                     .name("val")
 *                     .type("VARCHAR")
 *                     .build())
 *                 .build())
 *             .maskingExpression("""
 * case 
 *   when current_role() in ('ROLE_A') then 
 *     val 
 *   when is_role_in_session( 'ROLE_B' ) then 
 *     'ABC123'
 *   else
 *     '******'
 * end
 *             """)
 *             .returnDataType("VARCHAR")
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
 * format is database name | schema name | policy name
 * 
 * ```sh
 * $ pulumi import snowflake:index/maskingPolicy:MaskingPolicy example &#39;dbName|schemaName|policyName&#39;
 * ```
 * 
 */
@ResourceType(type="snowflake:index/maskingPolicy:MaskingPolicy")
public class MaskingPolicy extends com.pulumi.resources.CustomResource {
    /**
     * Specifies a comment for the masking policy.
     * 
     */
    @Export(name="comment", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> comment;

    /**
     * @return Specifies a comment for the masking policy.
     * 
     */
    public Output<Optional<String>> comment() {
        return Codegen.optional(this.comment);
    }
    /**
     * The database in which to create the masking policy.
     * 
     */
    @Export(name="database", refs={String.class}, tree="[0]")
    private Output<String> database;

    /**
     * @return The database in which to create the masking policy.
     * 
     */
    public Output<String> database() {
        return this.database;
    }
    /**
     * Specifies whether the row access policy or conditional masking policy can reference a column that is already protected by a masking policy.
     * 
     */
    @Export(name="exemptOtherPolicies", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> exemptOtherPolicies;

    /**
     * @return Specifies whether the row access policy or conditional masking policy can reference a column that is already protected by a masking policy.
     * 
     */
    public Output<Optional<Boolean>> exemptOtherPolicies() {
        return Codegen.optional(this.exemptOtherPolicies);
    }
    /**
     * Prevent overwriting a previous masking policy with the same name.
     * 
     */
    @Export(name="ifNotExists", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> ifNotExists;

    /**
     * @return Prevent overwriting a previous masking policy with the same name.
     * 
     */
    public Output<Optional<Boolean>> ifNotExists() {
        return Codegen.optional(this.ifNotExists);
    }
    /**
     * Specifies the SQL expression that transforms the data.
     * 
     */
    @Export(name="maskingExpression", refs={String.class}, tree="[0]")
    private Output<String> maskingExpression;

    /**
     * @return Specifies the SQL expression that transforms the data.
     * 
     */
    public Output<String> maskingExpression() {
        return this.maskingExpression;
    }
    /**
     * Specifies the identifier for the masking policy; must be unique for the database and schema in which the masking policy is created.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Specifies the identifier for the masking policy; must be unique for the database and schema in which the masking policy is created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Whether to override a previous masking policy with the same name.
     * 
     */
    @Export(name="orReplace", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> orReplace;

    /**
     * @return Whether to override a previous masking policy with the same name.
     * 
     */
    public Output<Optional<Boolean>> orReplace() {
        return Codegen.optional(this.orReplace);
    }
    /**
     * Specifies the qualified identifier for the masking policy.
     * 
     */
    @Export(name="qualifiedName", refs={String.class}, tree="[0]")
    private Output<String> qualifiedName;

    /**
     * @return Specifies the qualified identifier for the masking policy.
     * 
     */
    public Output<String> qualifiedName() {
        return this.qualifiedName;
    }
    /**
     * Specifies the data type to return.
     * 
     */
    @Export(name="returnDataType", refs={String.class}, tree="[0]")
    private Output<String> returnDataType;

    /**
     * @return Specifies the data type to return.
     * 
     */
    public Output<String> returnDataType() {
        return this.returnDataType;
    }
    /**
     * The schema in which to create the masking policy.
     * 
     */
    @Export(name="schema", refs={String.class}, tree="[0]")
    private Output<String> schema;

    /**
     * @return The schema in which to create the masking policy.
     * 
     */
    public Output<String> schema() {
        return this.schema;
    }
    /**
     * The signature for the masking policy; specifies the input columns and data types to evaluate at query runtime.
     * 
     */
    @Export(name="signature", refs={MaskingPolicySignature.class}, tree="[0]")
    private Output<MaskingPolicySignature> signature;

    /**
     * @return The signature for the masking policy; specifies the input columns and data types to evaluate at query runtime.
     * 
     */
    public Output<MaskingPolicySignature> signature() {
        return this.signature;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MaskingPolicy(String name) {
        this(name, MaskingPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MaskingPolicy(String name, MaskingPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MaskingPolicy(String name, MaskingPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/maskingPolicy:MaskingPolicy", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()));
    }

    private MaskingPolicy(String name, Output<String> id, @Nullable MaskingPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/maskingPolicy:MaskingPolicy", name, state, makeResourceOptions(options, id));
    }

    private static MaskingPolicyArgs makeArgs(MaskingPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? MaskingPolicyArgs.Empty : args;
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
    public static MaskingPolicy get(String name, Output<String> id, @Nullable MaskingPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new MaskingPolicy(name, id, state, options);
    }
}
