// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.snowflake.SessionParameterArgs;
import com.pulumi.snowflake.Utilities;
import com.pulumi.snowflake.inputs.SessionParameterState;
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
 * import com.pulumi.snowflake.SessionParameter;
 * import com.pulumi.snowflake.SessionParameterArgs;
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
 *         var s = new SessionParameter("s", SessionParameterArgs.builder()
 *             .key("AUTOCOMMIT")
 *             .value("false")
 *             .user("TEST_USER")
 *             .build());
 * 
 *         var s2 = new SessionParameter("s2", SessionParameterArgs.builder()
 *             .key("BINARY_OUTPUT_FORMAT")
 *             .value("BASE64")
 *             .onAccount(true)
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
 * $ pulumi import snowflake:index/sessionParameter:SessionParameter s &lt;parameter_name&gt;
 * ```
 * 
 */
@ResourceType(type="snowflake:index/sessionParameter:SessionParameter")
public class SessionParameter extends com.pulumi.resources.CustomResource {
    /**
     * Name of session parameter. Valid values are those in [session parameters](https://docs.snowflake.com/en/sql-reference/parameters.html#session-parameters).
     * 
     */
    @Export(name="key", refs={String.class}, tree="[0]")
    private Output<String> key;

    /**
     * @return Name of session parameter. Valid values are those in [session parameters](https://docs.snowflake.com/en/sql-reference/parameters.html#session-parameters).
     * 
     */
    public Output<String> key() {
        return this.key;
    }
    /**
     * If true, the session parameter will be set on the account level.
     * 
     */
    @Export(name="onAccount", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> onAccount;

    /**
     * @return If true, the session parameter will be set on the account level.
     * 
     */
    public Output<Optional<Boolean>> onAccount() {
        return Codegen.optional(this.onAccount);
    }
    /**
     * The user to set the session parameter for. Required if on_account is false
     * 
     */
    @Export(name="user", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> user;

    /**
     * @return The user to set the session parameter for. Required if on_account is false
     * 
     */
    public Output<Optional<String>> user() {
        return Codegen.optional(this.user);
    }
    /**
     * Value of session parameter, as a string. Constraints are the same as those for the parameters in Snowflake documentation.
     * 
     */
    @Export(name="value", refs={String.class}, tree="[0]")
    private Output<String> value;

    /**
     * @return Value of session parameter, as a string. Constraints are the same as those for the parameters in Snowflake documentation.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SessionParameter(String name) {
        this(name, SessionParameterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SessionParameter(String name, SessionParameterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SessionParameter(String name, SessionParameterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/sessionParameter:SessionParameter", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()));
    }

    private SessionParameter(String name, Output<String> id, @Nullable SessionParameterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/sessionParameter:SessionParameter", name, state, makeResourceOptions(options, id));
    }

    private static SessionParameterArgs makeArgs(SessionParameterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? SessionParameterArgs.Empty : args;
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
    public static SessionParameter get(String name, Output<String> id, @Nullable SessionParameterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SessionParameter(name, id, state, options);
    }
}
