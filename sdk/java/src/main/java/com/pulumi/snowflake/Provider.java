// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.snowflake.ProviderArgs;
import com.pulumi.snowflake.Utilities;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The provider type for the snowflake package. By default, resources use package-wide configuration
 * settings, however an explicit `Provider` instance may be created and passed during resource
 * construction to achieve fine-grained programmatic control over provider settings. See the
 * [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
 * 
 */
@ResourceType(type="pulumi:providers:snowflake")
public class Provider extends com.pulumi.resources.ProviderResource {
    /**
     * Specifies your Snowflake account name assigned by Snowflake. For information about account identifiers, see the
     * [Snowflake documentation](https://docs.snowflake.com/en/user-guide/admin-account-identifier#account-name). Required
     * unless using `profile`. Can also be sourced from the `SNOWFLAKE_ACCOUNT_NAME` environment variable.
     * 
     */
    @Export(name="accountName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> accountName;

    /**
     * @return Specifies your Snowflake account name assigned by Snowflake. For information about account identifiers, see the
     * [Snowflake documentation](https://docs.snowflake.com/en/user-guide/admin-account-identifier#account-name). Required
     * unless using `profile`. Can also be sourced from the `SNOWFLAKE_ACCOUNT_NAME` environment variable.
     * 
     */
    public Output<Optional<String>> accountName() {
        return Codegen.optional(this.accountName);
    }
    /**
     * Specifies the [authentication type](https://pkg.go.dev/github.com/snowflakedb/gosnowflake#AuthType) to use when
     * connecting to Snowflake. Valid options are: `SNOWFLAKE` | `OAUTH` | `EXTERNALBROWSER` | `OKTA` | `SNOWFLAKE_JWT` |
     * `TOKENACCESSOR` | `USERNAMEPASSWORDMFA` | `PROGRAMMATIC_ACCESS_TOKEN`. Can also be sourced from the
     * `SNOWFLAKE_AUTHENTICATOR` environment variable.
     * 
     */
    @Export(name="authenticator", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> authenticator;

    /**
     * @return Specifies the [authentication type](https://pkg.go.dev/github.com/snowflakedb/gosnowflake#AuthType) to use when
     * connecting to Snowflake. Valid options are: `SNOWFLAKE` | `OAUTH` | `EXTERNALBROWSER` | `OKTA` | `SNOWFLAKE_JWT` |
     * `TOKENACCESSOR` | `USERNAMEPASSWORDMFA` | `PROGRAMMATIC_ACCESS_TOKEN`. Can also be sourced from the
     * `SNOWFLAKE_AUTHENTICATOR` environment variable.
     * 
     */
    public Output<Optional<String>> authenticator() {
        return Codegen.optional(this.authenticator);
    }
    /**
     * IP address for network checks. Can also be sourced from the `SNOWFLAKE_CLIENT_IP` environment variable.
     * 
     */
    @Export(name="clientIp", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> clientIp;

    /**
     * @return IP address for network checks. Can also be sourced from the `SNOWFLAKE_CLIENT_IP` environment variable.
     * 
     */
    public Output<Optional<String>> clientIp() {
        return Codegen.optional(this.clientIp);
    }
    /**
     * When true the MFA token is cached in the credential manager. True by default in Windows/OSX. False for Linux. Can also
     * be sourced from the `SNOWFLAKE_CLIENT_REQUEST_MFA_TOKEN` environment variable.
     * 
     */
    @Export(name="clientRequestMfaToken", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> clientRequestMfaToken;

    /**
     * @return When true the MFA token is cached in the credential manager. True by default in Windows/OSX. False for Linux. Can also
     * be sourced from the `SNOWFLAKE_CLIENT_REQUEST_MFA_TOKEN` environment variable.
     * 
     */
    public Output<Optional<String>> clientRequestMfaToken() {
        return Codegen.optional(this.clientRequestMfaToken);
    }
    /**
     * When true the ID token is cached in the credential manager. True by default in Windows/OSX. False for Linux. Can also be
     * sourced from the `SNOWFLAKE_CLIENT_STORE_TEMPORARY_CREDENTIAL` environment variable.
     * 
     */
    @Export(name="clientStoreTemporaryCredential", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> clientStoreTemporaryCredential;

    /**
     * @return When true the ID token is cached in the credential manager. True by default in Windows/OSX. False for Linux. Can also be
     * sourced from the `SNOWFLAKE_CLIENT_STORE_TEMPORARY_CREDENTIAL` environment variable.
     * 
     */
    public Output<Optional<String>> clientStoreTemporaryCredential() {
        return Codegen.optional(this.clientStoreTemporaryCredential);
    }
    /**
     * Indicates whether console login should be disabled in the driver. Can also be sourced from the
     * `SNOWFLAKE_DISABLE_CONSOLE_LOGIN` environment variable.
     * 
     */
    @Export(name="disableConsoleLogin", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> disableConsoleLogin;

    /**
     * @return Indicates whether console login should be disabled in the driver. Can also be sourced from the
     * `SNOWFLAKE_DISABLE_CONSOLE_LOGIN` environment variable.
     * 
     */
    public Output<Optional<String>> disableConsoleLogin() {
        return Codegen.optional(this.disableConsoleLogin);
    }
    /**
     * Specifies the logging level to be used by the driver. Valid options are: `trace` | `debug` | `info` | `print` |
     * `warning` | `error` | `fatal` | `panic`. Can also be sourced from the `SNOWFLAKE_DRIVER_TRACING` environment variable.
     * 
     */
    @Export(name="driverTracing", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> driverTracing;

    /**
     * @return Specifies the logging level to be used by the driver. Valid options are: `trace` | `debug` | `info` | `print` |
     * `warning` | `error` | `fatal` | `panic`. Can also be sourced from the `SNOWFLAKE_DRIVER_TRACING` environment variable.
     * 
     */
    public Output<Optional<String>> driverTracing() {
        return Codegen.optional(this.driverTracing);
    }
    /**
     * Specifies a custom host value used by the driver for privatelink connections. Can also be sourced from the
     * `SNOWFLAKE_HOST` environment variable.
     * 
     */
    @Export(name="host", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> host;

    /**
     * @return Specifies a custom host value used by the driver for privatelink connections. Can also be sourced from the
     * `SNOWFLAKE_HOST` environment variable.
     * 
     */
    public Output<Optional<String>> host() {
        return Codegen.optional(this.host);
    }
    /**
     * Should retried request contain retry reason. Can also be sourced from the `SNOWFLAKE_INCLUDE_RETRY_REASON` environment
     * variable.
     * 
     */
    @Export(name="includeRetryReason", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> includeRetryReason;

    /**
     * @return Should retried request contain retry reason. Can also be sourced from the `SNOWFLAKE_INCLUDE_RETRY_REASON` environment
     * variable.
     * 
     */
    public Output<Optional<String>> includeRetryReason() {
        return Codegen.optional(this.includeRetryReason);
    }
    /**
     * True represents OCSP fail open mode. False represents OCSP fail closed mode. Fail open true by default. Can also be
     * sourced from the `SNOWFLAKE_OCSP_FAIL_OPEN` environment variable.
     * 
     */
    @Export(name="ocspFailOpen", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> ocspFailOpen;

    /**
     * @return True represents OCSP fail open mode. False represents OCSP fail closed mode. Fail open true by default. Can also be
     * sourced from the `SNOWFLAKE_OCSP_FAIL_OPEN` environment variable.
     * 
     */
    public Output<Optional<String>> ocspFailOpen() {
        return Codegen.optional(this.ocspFailOpen);
    }
    /**
     * The URL of the Okta server. e.g. https://example.okta.com. Okta URL host needs to to have a suffix `okta.com`. Read more
     * in Snowflake [docs](https://docs.snowflake.com/en/user-guide/oauth-okta). Can also be sourced from the
     * `SNOWFLAKE_OKTA_URL` environment variable.
     * 
     */
    @Export(name="oktaUrl", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> oktaUrl;

    /**
     * @return The URL of the Okta server. e.g. https://example.okta.com. Okta URL host needs to to have a suffix `okta.com`. Read more
     * in Snowflake [docs](https://docs.snowflake.com/en/user-guide/oauth-okta). Can also be sourced from the
     * `SNOWFLAKE_OKTA_URL` environment variable.
     * 
     */
    public Output<Optional<String>> oktaUrl() {
        return Codegen.optional(this.oktaUrl);
    }
    /**
     * Specifies your Snowflake organization name assigned by Snowflake. For information about account identifiers, see the
     * [Snowflake documentation](https://docs.snowflake.com/en/user-guide/admin-account-identifier#organization-name). Required
     * unless using `profile`. Can also be sourced from the `SNOWFLAKE_ORGANIZATION_NAME` environment variable.
     * 
     */
    @Export(name="organizationName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> organizationName;

    /**
     * @return Specifies your Snowflake organization name assigned by Snowflake. For information about account identifiers, see the
     * [Snowflake documentation](https://docs.snowflake.com/en/user-guide/admin-account-identifier#organization-name). Required
     * unless using `profile`. Can also be sourced from the `SNOWFLAKE_ORGANIZATION_NAME` environment variable.
     * 
     */
    public Output<Optional<String>> organizationName() {
        return Codegen.optional(this.organizationName);
    }
    /**
     * Specifies the passcode provided by Duo when using multi-factor authentication (MFA) for login. Can also be sourced from
     * the `SNOWFLAKE_PASSCODE` environment variable.
     * 
     */
    @Export(name="passcode", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> passcode;

    /**
     * @return Specifies the passcode provided by Duo when using multi-factor authentication (MFA) for login. Can also be sourced from
     * the `SNOWFLAKE_PASSCODE` environment variable.
     * 
     */
    public Output<Optional<String>> passcode() {
        return Codegen.optional(this.passcode);
    }
    /**
     * Password for user + password or
     * [token](https://docs.snowflake.com/en/user-guide/programmatic-access-tokens#generating-a-programmatic-access-token) for
     * [PAT auth](https://docs.snowflake.com/en/user-guide/programmatic-access-tokens). Cannot be used with `private_key` and
     * `private_key_passphrase`. Can also be sourced from the `SNOWFLAKE_PASSWORD` environment variable.
     * 
     */
    @Export(name="password", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> password;

    /**
     * @return Password for user + password or
     * [token](https://docs.snowflake.com/en/user-guide/programmatic-access-tokens#generating-a-programmatic-access-token) for
     * [PAT auth](https://docs.snowflake.com/en/user-guide/programmatic-access-tokens). Cannot be used with `private_key` and
     * `private_key_passphrase`. Can also be sourced from the `SNOWFLAKE_PASSWORD` environment variable.
     * 
     */
    public Output<Optional<String>> password() {
        return Codegen.optional(this.password);
    }
    /**
     * Private Key for username+private-key auth. Cannot be used with `password`. Can also be sourced from the
     * `SNOWFLAKE_PRIVATE_KEY` environment variable.
     * 
     */
    @Export(name="privateKey", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> privateKey;

    /**
     * @return Private Key for username+private-key auth. Cannot be used with `password`. Can also be sourced from the
     * `SNOWFLAKE_PRIVATE_KEY` environment variable.
     * 
     */
    public Output<Optional<String>> privateKey() {
        return Codegen.optional(this.privateKey);
    }
    /**
     * Supports the encryption ciphers aes-128-cbc, aes-128-gcm, aes-192-cbc, aes-192-gcm, aes-256-cbc, aes-256-gcm, and
     * des-ede3-cbc. Can also be sourced from the `SNOWFLAKE_PRIVATE_KEY_PASSPHRASE` environment variable.
     * 
     */
    @Export(name="privateKeyPassphrase", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> privateKeyPassphrase;

    /**
     * @return Supports the encryption ciphers aes-128-cbc, aes-128-gcm, aes-192-cbc, aes-192-gcm, aes-256-cbc, aes-256-gcm, and
     * des-ede3-cbc. Can also be sourced from the `SNOWFLAKE_PRIVATE_KEY_PASSPHRASE` environment variable.
     * 
     */
    public Output<Optional<String>> privateKeyPassphrase() {
        return Codegen.optional(this.privateKeyPassphrase);
    }
    /**
     * Sets the profile to read from ~/.snowflake/config file. Can also be sourced from the `SNOWFLAKE_PROFILE` environment
     * variable.
     * 
     */
    @Export(name="profile", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> profile;

    /**
     * @return Sets the profile to read from ~/.snowflake/config file. Can also be sourced from the `SNOWFLAKE_PROFILE` environment
     * variable.
     * 
     */
    public Output<Optional<String>> profile() {
        return Codegen.optional(this.profile);
    }
    /**
     * A protocol used in the connection. Valid options are: `http` | `https`. Can also be sourced from the
     * `SNOWFLAKE_PROTOCOL` environment variable.
     * 
     */
    @Export(name="protocol", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> protocol;

    /**
     * @return A protocol used in the connection. Valid options are: `http` | `https`. Can also be sourced from the
     * `SNOWFLAKE_PROTOCOL` environment variable.
     * 
     */
    public Output<Optional<String>> protocol() {
        return Codegen.optional(this.protocol);
    }
    /**
     * Specifies the role to use by default for accessing Snowflake objects in the client session. Can also be sourced from the
     * `SNOWFLAKE_ROLE` environment variable.
     * 
     */
    @Export(name="role", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> role;

    /**
     * @return Specifies the role to use by default for accessing Snowflake objects in the client session. Can also be sourced from the
     * `SNOWFLAKE_ROLE` environment variable.
     * 
     */
    public Output<Optional<String>> role() {
        return Codegen.optional(this.role);
    }
    /**
     * Sets temporary directory used by the driver for operations like encrypting, compressing etc. Can also be sourced from
     * the `SNOWFLAKE_TMP_DIRECTORY_PATH` environment variable.
     * 
     */
    @Export(name="tmpDirectoryPath", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> tmpDirectoryPath;

    /**
     * @return Sets temporary directory used by the driver for operations like encrypting, compressing etc. Can also be sourced from
     * the `SNOWFLAKE_TMP_DIRECTORY_PATH` environment variable.
     * 
     */
    public Output<Optional<String>> tmpDirectoryPath() {
        return Codegen.optional(this.tmpDirectoryPath);
    }
    /**
     * Token to use for OAuth and other forms of token based auth. Can also be sourced from the `SNOWFLAKE_TOKEN` environment
     * variable.
     * 
     */
    @Export(name="token", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> token;

    /**
     * @return Token to use for OAuth and other forms of token based auth. Can also be sourced from the `SNOWFLAKE_TOKEN` environment
     * variable.
     * 
     */
    public Output<Optional<String>> token() {
        return Codegen.optional(this.token);
    }
    /**
     * Username. Required unless using `profile`. Can also be sourced from the `SNOWFLAKE_USER` environment variable.
     * 
     */
    @Export(name="user", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> user;

    /**
     * @return Username. Required unless using `profile`. Can also be sourced from the `SNOWFLAKE_USER` environment variable.
     * 
     */
    public Output<Optional<String>> user() {
        return Codegen.optional(this.user);
    }
    /**
     * True by default. If false, disables the validation checks for Database, Schema, Warehouse and Role at the time a
     * connection is established. Can also be sourced from the `SNOWFLAKE_VALIDATE_DEFAULT_PARAMETERS` environment variable.
     * 
     */
    @Export(name="validateDefaultParameters", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> validateDefaultParameters;

    /**
     * @return True by default. If false, disables the validation checks for Database, Schema, Warehouse and Role at the time a
     * connection is established. Can also be sourced from the `SNOWFLAKE_VALIDATE_DEFAULT_PARAMETERS` environment variable.
     * 
     */
    public Output<Optional<String>> validateDefaultParameters() {
        return Codegen.optional(this.validateDefaultParameters);
    }
    /**
     * Specifies the virtual warehouse to use by default for queries, loading, etc. in the client session. Can also be sourced
     * from the `SNOWFLAKE_WAREHOUSE` environment variable.
     * 
     */
    @Export(name="warehouse", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> warehouse;

    /**
     * @return Specifies the virtual warehouse to use by default for queries, loading, etc. in the client session. Can also be sourced
     * from the `SNOWFLAKE_WAREHOUSE` environment variable.
     * 
     */
    public Output<Optional<String>> warehouse() {
        return Codegen.optional(this.warehouse);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Provider(java.lang.String name) {
        this(name, ProviderArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Provider(java.lang.String name, @Nullable ProviderArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Provider(java.lang.String name, @Nullable ProviderArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private static ProviderArgs makeArgs(@Nullable ProviderArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ProviderArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "passcode",
                "password",
                "privateKey",
                "privateKeyPassphrase",
                "token"
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

}
