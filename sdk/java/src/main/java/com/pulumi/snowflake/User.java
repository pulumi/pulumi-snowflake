// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.snowflake.UserArgs;
import com.pulumi.snowflake.Utilities;
import com.pulumi.snowflake.inputs.UserState;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.snowflake.User;
 * import com.pulumi.snowflake.UserArgs;
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
 *         var user = new User(&#34;user&#34;, UserArgs.builder()        
 *             .name(&#34;Snowflake User&#34;)
 *             .loginName(&#34;snowflake_user&#34;)
 *             .comment(&#34;A user of snowflake.&#34;)
 *             .password(&#34;secret&#34;)
 *             .disabled(false)
 *             .displayName(&#34;Snowflake User&#34;)
 *             .email(&#34;user@snowflake.example&#34;)
 *             .firstName(&#34;Snowflake&#34;)
 *             .lastName(&#34;User&#34;)
 *             .defaultWarehouse(&#34;warehouse&#34;)
 *             .defaultSecondaryRoles(&#34;ALL&#34;)
 *             .defaultRole(&#34;role1&#34;)
 *             .rsaPublicKey(&#34;...&#34;)
 *             .rsaPublicKey2(&#34;...&#34;)
 *             .mustChangePassword(false)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import snowflake:index/user:User example userName
 * ```
 * 
 */
@ResourceType(type="snowflake:index/user:User")
public class User extends com.pulumi.resources.CustomResource {
    @Export(name="comment", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> comment;

    public Output<Optional<String>> comment() {
        return Codegen.optional(this.comment);
    }
    /**
     * Specifies the namespace (database only or database and schema) that is active by default for the user’s session upon login.
     * 
     */
    @Export(name="defaultNamespace", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> defaultNamespace;

    /**
     * @return Specifies the namespace (database only or database and schema) that is active by default for the user’s session upon login.
     * 
     */
    public Output<Optional<String>> defaultNamespace() {
        return Codegen.optional(this.defaultNamespace);
    }
    /**
     * Specifies the role that is active by default for the user’s session upon login.
     * 
     */
    @Export(name="defaultRole", refs={String.class}, tree="[0]")
    private Output<String> defaultRole;

    /**
     * @return Specifies the role that is active by default for the user’s session upon login.
     * 
     */
    public Output<String> defaultRole() {
        return this.defaultRole;
    }
    /**
     * Specifies the set of secondary roles that are active for the user’s session upon login. Currently only [&#34;ALL&#34;] value is supported - more information can be found in [doc](https://docs.snowflake.com/en/sql-reference/sql/create-user#optional-object-properties-objectproperties)
     * 
     */
    @Export(name="defaultSecondaryRoles", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> defaultSecondaryRoles;

    /**
     * @return Specifies the set of secondary roles that are active for the user’s session upon login. Currently only [&#34;ALL&#34;] value is supported - more information can be found in [doc](https://docs.snowflake.com/en/sql-reference/sql/create-user#optional-object-properties-objectproperties)
     * 
     */
    public Output<Optional<List<String>>> defaultSecondaryRoles() {
        return Codegen.optional(this.defaultSecondaryRoles);
    }
    /**
     * Specifies the virtual warehouse that is active by default for the user’s session upon login.
     * 
     */
    @Export(name="defaultWarehouse", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> defaultWarehouse;

    /**
     * @return Specifies the virtual warehouse that is active by default for the user’s session upon login.
     * 
     */
    public Output<Optional<String>> defaultWarehouse() {
        return Codegen.optional(this.defaultWarehouse);
    }
    @Export(name="disabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> disabled;

    public Output<Boolean> disabled() {
        return this.disabled;
    }
    /**
     * Name displayed for the user in the Snowflake web interface.
     * 
     */
    @Export(name="displayName", refs={String.class}, tree="[0]")
    private Output<String> displayName;

    /**
     * @return Name displayed for the user in the Snowflake web interface.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * Email address for the user.
     * 
     */
    @Export(name="email", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> email;

    /**
     * @return Email address for the user.
     * 
     */
    public Output<Optional<String>> email() {
        return Codegen.optional(this.email);
    }
    /**
     * First name of the user.
     * 
     */
    @Export(name="firstName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> firstName;

    /**
     * @return First name of the user.
     * 
     */
    public Output<Optional<String>> firstName() {
        return Codegen.optional(this.firstName);
    }
    /**
     * Will be true if user as an RSA key set.
     * 
     */
    @Export(name="hasRsaPublicKey", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> hasRsaPublicKey;

    /**
     * @return Will be true if user as an RSA key set.
     * 
     */
    public Output<Boolean> hasRsaPublicKey() {
        return this.hasRsaPublicKey;
    }
    /**
     * Last name of the user.
     * 
     */
    @Export(name="lastName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> lastName;

    /**
     * @return Last name of the user.
     * 
     */
    public Output<Optional<String>> lastName() {
        return Codegen.optional(this.lastName);
    }
    /**
     * The name users use to log in. If not supplied, snowflake will use name instead.
     * 
     */
    @Export(name="loginName", refs={String.class}, tree="[0]")
    private Output<String> loginName;

    /**
     * @return The name users use to log in. If not supplied, snowflake will use name instead.
     * 
     */
    public Output<String> loginName() {
        return this.loginName;
    }
    /**
     * Specifies whether the user is forced to change their password on next login (including their first/initial login) into the system.
     * 
     */
    @Export(name="mustChangePassword", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> mustChangePassword;

    /**
     * @return Specifies whether the user is forced to change their password on next login (including their first/initial login) into the system.
     * 
     */
    public Output<Optional<Boolean>> mustChangePassword() {
        return Codegen.optional(this.mustChangePassword);
    }
    /**
     * Name of the user. Note that if you do not supply login*name this will be used as login*name. [doc](https://docs.snowflake.net/manuals/sql-reference/sql/create-user.html#required-parameters)
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the user. Note that if you do not supply login*name this will be used as login*name. [doc](https://docs.snowflake.net/manuals/sql-reference/sql/create-user.html#required-parameters)
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * **WARNING:** this will put the password in the terraform state file. Use carefully.
     * 
     */
    @Export(name="password", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> password;

    /**
     * @return **WARNING:** this will put the password in the terraform state file. Use carefully.
     * 
     */
    public Output<Optional<String>> password() {
        return Codegen.optional(this.password);
    }
    /**
     * Specifies the user’s RSA public key; used for key-pair authentication. Must be on 1 line without header and trailer.
     * 
     */
    @Export(name="rsaPublicKey", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> rsaPublicKey;

    /**
     * @return Specifies the user’s RSA public key; used for key-pair authentication. Must be on 1 line without header and trailer.
     * 
     */
    public Output<Optional<String>> rsaPublicKey() {
        return Codegen.optional(this.rsaPublicKey);
    }
    /**
     * Specifies the user’s second RSA public key; used to rotate the public and private keys for key-pair authentication based on an expiration schedule set by your organization. Must be on 1 line without header and trailer.
     * 
     */
    @Export(name="rsaPublicKey2", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> rsaPublicKey2;

    /**
     * @return Specifies the user’s second RSA public key; used to rotate the public and private keys for key-pair authentication based on an expiration schedule set by your organization. Must be on 1 line without header and trailer.
     * 
     */
    public Output<Optional<String>> rsaPublicKey2() {
        return Codegen.optional(this.rsaPublicKey2);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public User(String name) {
        this(name, UserArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public User(String name, @Nullable UserArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public User(String name, @Nullable UserArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/user:User", name, args == null ? UserArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private User(String name, Output<String> id, @Nullable UserState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/user:User", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "displayName",
                "email",
                "firstName",
                "lastName",
                "name",
                "password"
            ))
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
    public static User get(String name, Output<String> id, @Nullable UserState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new User(name, id, state, options);
    }
}
