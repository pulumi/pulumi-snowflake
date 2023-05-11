// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProviderArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProviderArgs Empty = new ProviderArgs();

    /**
     * The name of the Snowflake account. Can also come from the `SNOWFLAKE_ACCOUNT` environment variable. Required unless
     * using profile.
     * 
     */
    @Import(name="account")
    private @Nullable Output<String> account;

    /**
     * @return The name of the Snowflake account. Can also come from the `SNOWFLAKE_ACCOUNT` environment variable. Required unless
     * using profile.
     * 
     */
    public Optional<Output<String>> account() {
        return Optional.ofNullable(this.account);
    }

    /**
     * Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_USE_BROWSER_AUTH` environment variable.
     * 
     */
    @Import(name="browserAuth", json=true)
    private @Nullable Output<Boolean> browserAuth;

    /**
     * @return Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_USE_BROWSER_AUTH` environment variable.
     * 
     */
    public Optional<Output<Boolean>> browserAuth() {
        return Optional.ofNullable(this.browserAuth);
    }

    /**
     * Supports passing in a custom host value to the snowflake go driver for use with privatelink.
     * 
     */
    @Import(name="host")
    private @Nullable Output<String> host;

    /**
     * @return Supports passing in a custom host value to the snowflake go driver for use with privatelink.
     * 
     */
    public Optional<Output<String>> host() {
        return Optional.ofNullable(this.host);
    }

    /**
     * If true, bypass the Online Certificate Status Protocol (OCSP) certificate revocation check. IMPORTANT: Change the
     * default value for testing or emergency situations only.
     * 
     */
    @Import(name="insecureMode", json=true)
    private @Nullable Output<Boolean> insecureMode;

    /**
     * @return If true, bypass the Online Certificate Status Protocol (OCSP) certificate revocation check. IMPORTANT: Change the
     * default value for testing or emergency situations only.
     * 
     */
    public Optional<Output<Boolean>> insecureMode() {
        return Optional.ofNullable(this.insecureMode);
    }

    /**
     * Token for use with OAuth. Generating the token is left to other tools. Cannot be used with `browser_auth`,
     * `private_key_path`, `oauth_refresh_token` or `password`. Can be sourced from `SNOWFLAKE_OAUTH_ACCESS_TOKEN` environment
     * variable.
     * 
     */
    @Import(name="oauthAccessToken")
    private @Nullable Output<String> oauthAccessToken;

    /**
     * @return Token for use with OAuth. Generating the token is left to other tools. Cannot be used with `browser_auth`,
     * `private_key_path`, `oauth_refresh_token` or `password`. Can be sourced from `SNOWFLAKE_OAUTH_ACCESS_TOKEN` environment
     * variable.
     * 
     */
    public Optional<Output<String>> oauthAccessToken() {
        return Optional.ofNullable(this.oauthAccessToken);
    }

    /**
     * Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_OAUTH_CLIENT_ID` environment variable.
     * 
     */
    @Import(name="oauthClientId")
    private @Nullable Output<String> oauthClientId;

    /**
     * @return Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_OAUTH_CLIENT_ID` environment variable.
     * 
     */
    public Optional<Output<String>> oauthClientId() {
        return Optional.ofNullable(this.oauthClientId);
    }

    /**
     * Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_OAUTH_CLIENT_SECRET` environment variable.
     * 
     */
    @Import(name="oauthClientSecret")
    private @Nullable Output<String> oauthClientSecret;

    /**
     * @return Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_OAUTH_CLIENT_SECRET` environment variable.
     * 
     */
    public Optional<Output<String>> oauthClientSecret() {
        return Optional.ofNullable(this.oauthClientSecret);
    }

    /**
     * Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_OAUTH_ENDPOINT` environment variable.
     * 
     */
    @Import(name="oauthEndpoint")
    private @Nullable Output<String> oauthEndpoint;

    /**
     * @return Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_OAUTH_ENDPOINT` environment variable.
     * 
     */
    public Optional<Output<String>> oauthEndpoint() {
        return Optional.ofNullable(this.oauthEndpoint);
    }

    /**
     * Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_OAUTH_REDIRECT_URL` environment variable.
     * 
     */
    @Import(name="oauthRedirectUrl")
    private @Nullable Output<String> oauthRedirectUrl;

    /**
     * @return Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_OAUTH_REDIRECT_URL` environment variable.
     * 
     */
    public Optional<Output<String>> oauthRedirectUrl() {
        return Optional.ofNullable(this.oauthRedirectUrl);
    }

    /**
     * Token for use with OAuth. Setup and generation of the token is left to other tools. Should be used in conjunction with
     * `oauth_client_id`, `oauth_client_secret`, `oauth_endpoint`, `oauth_redirect_url`. Cannot be used with `browser_auth`,
     * `private_key_path`, `oauth_access_token` or `password`. Can be sourced from `SNOWFLAKE_OAUTH_REFRESH_TOKEN` environment
     * variable.
     * 
     */
    @Import(name="oauthRefreshToken")
    private @Nullable Output<String> oauthRefreshToken;

    /**
     * @return Token for use with OAuth. Setup and generation of the token is left to other tools. Should be used in conjunction with
     * `oauth_client_id`, `oauth_client_secret`, `oauth_endpoint`, `oauth_redirect_url`. Cannot be used with `browser_auth`,
     * `private_key_path`, `oauth_access_token` or `password`. Can be sourced from `SNOWFLAKE_OAUTH_REFRESH_TOKEN` environment
     * variable.
     * 
     */
    public Optional<Output<String>> oauthRefreshToken() {
        return Optional.ofNullable(this.oauthRefreshToken);
    }

    /**
     * Password for username+password auth. Cannot be used with `browser_auth` or `private_key_path`. Can be sourced from
     * `SNOWFLAKE_PASSWORD` environment variable.
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return Password for username+password auth. Cannot be used with `browser_auth` or `private_key_path`. Can be sourced from
     * `SNOWFLAKE_PASSWORD` environment variable.
     * 
     */
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * Support custom port values to snowflake go driver for use with privatelink. Can be sourced from `SNOWFLAKE_PORT`
     * environment variable.
     * 
     */
    @Import(name="port", json=true)
    private @Nullable Output<Integer> port;

    /**
     * @return Support custom port values to snowflake go driver for use with privatelink. Can be sourced from `SNOWFLAKE_PORT`
     * environment variable.
     * 
     */
    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * Private Key for username+private-key auth. Cannot be used with `browser_auth` or `password`. Can be sourced from
     * `SNOWFLAKE_PRIVATE_KEY` environment variable.
     * 
     */
    @Import(name="privateKey")
    private @Nullable Output<String> privateKey;

    /**
     * @return Private Key for username+private-key auth. Cannot be used with `browser_auth` or `password`. Can be sourced from
     * `SNOWFLAKE_PRIVATE_KEY` environment variable.
     * 
     */
    public Optional<Output<String>> privateKey() {
        return Optional.ofNullable(this.privateKey);
    }

    /**
     * Supports the encryption ciphers aes-128-cbc, aes-128-gcm, aes-192-cbc, aes-192-gcm, aes-256-cbc, aes-256-gcm, and
     * des-ede3-cbc
     * 
     */
    @Import(name="privateKeyPassphrase")
    private @Nullable Output<String> privateKeyPassphrase;

    /**
     * @return Supports the encryption ciphers aes-128-cbc, aes-128-gcm, aes-192-cbc, aes-192-gcm, aes-256-cbc, aes-256-gcm, and
     * des-ede3-cbc
     * 
     */
    public Optional<Output<String>> privateKeyPassphrase() {
        return Optional.ofNullable(this.privateKeyPassphrase);
    }

    /**
     * Path to a private key for using keypair authentication. Cannot be used with `browser_auth`, `oauth_access_token` or
     * `password`. Can be sourced from `SNOWFLAKE_PRIVATE_KEY_PATH` environment variable.
     * 
     */
    @Import(name="privateKeyPath")
    private @Nullable Output<String> privateKeyPath;

    /**
     * @return Path to a private key for using keypair authentication. Cannot be used with `browser_auth`, `oauth_access_token` or
     * `password`. Can be sourced from `SNOWFLAKE_PRIVATE_KEY_PATH` environment variable.
     * 
     */
    public Optional<Output<String>> privateKeyPath() {
        return Optional.ofNullable(this.privateKeyPath);
    }

    /**
     * Sets the profile to read from ~/.snowflake/config file.
     * 
     */
    @Import(name="profile")
    private @Nullable Output<String> profile;

    /**
     * @return Sets the profile to read from ~/.snowflake/config file.
     * 
     */
    public Optional<Output<String>> profile() {
        return Optional.ofNullable(this.profile);
    }

    /**
     * Support custom protocols to snowflake go driver. Can be sourced from `SNOWFLAKE_PROTOCOL` environment variable.
     * 
     */
    @Import(name="protocol")
    private @Nullable Output<String> protocol;

    /**
     * @return Support custom protocols to snowflake go driver. Can be sourced from `SNOWFLAKE_PROTOCOL` environment variable.
     * 
     */
    public Optional<Output<String>> protocol() {
        return Optional.ofNullable(this.protocol);
    }

    /**
     * [Snowflake region](https://docs.snowflake.com/en/user-guide/intro-regions.html) to use. Required if using the [legacy
     * format for the `account`
     * identifier](https://docs.snowflake.com/en/user-guide/admin-account-identifier.html#format-2-legacy-account-locator-in-a-region)
     * in the form of `&lt;cloud_region_id&gt;.&lt;cloud&gt;`. Can be sourced from the `SNOWFLAKE_REGION` environment variable.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return [Snowflake region](https://docs.snowflake.com/en/user-guide/intro-regions.html) to use. Required if using the [legacy
     * format for the `account`
     * identifier](https://docs.snowflake.com/en/user-guide/admin-account-identifier.html#format-2-legacy-account-locator-in-a-region)
     * in the form of `&lt;cloud_region_id&gt;.&lt;cloud&gt;`. Can be sourced from the `SNOWFLAKE_REGION` environment variable.
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * Snowflake role to use for operations. If left unset, default role for user will be used. Can be sourced from the
     * `SNOWFLAKE_ROLE` environment variable.
     * 
     */
    @Import(name="role")
    private @Nullable Output<String> role;

    /**
     * @return Snowflake role to use for operations. If left unset, default role for user will be used. Can be sourced from the
     * `SNOWFLAKE_ROLE` environment variable.
     * 
     */
    public Optional<Output<String>> role() {
        return Optional.ofNullable(this.role);
    }

    /**
     * Username for username+password authentication. Can come from the `SNOWFLAKE_USER` environment variable. Required unless
     * using profile.
     * 
     */
    @Import(name="username")
    private @Nullable Output<String> username;

    /**
     * @return Username for username+password authentication. Can come from the `SNOWFLAKE_USER` environment variable. Required unless
     * using profile.
     * 
     */
    public Optional<Output<String>> username() {
        return Optional.ofNullable(this.username);
    }

    /**
     * Sets the default warehouse. Optional. Can be sourced from SNOWFLAKE_WAREHOUSE environment variable.
     * 
     */
    @Import(name="warehouse")
    private @Nullable Output<String> warehouse;

    /**
     * @return Sets the default warehouse. Optional. Can be sourced from SNOWFLAKE_WAREHOUSE environment variable.
     * 
     */
    public Optional<Output<String>> warehouse() {
        return Optional.ofNullable(this.warehouse);
    }

    private ProviderArgs() {}

    private ProviderArgs(ProviderArgs $) {
        this.account = $.account;
        this.browserAuth = $.browserAuth;
        this.host = $.host;
        this.insecureMode = $.insecureMode;
        this.oauthAccessToken = $.oauthAccessToken;
        this.oauthClientId = $.oauthClientId;
        this.oauthClientSecret = $.oauthClientSecret;
        this.oauthEndpoint = $.oauthEndpoint;
        this.oauthRedirectUrl = $.oauthRedirectUrl;
        this.oauthRefreshToken = $.oauthRefreshToken;
        this.password = $.password;
        this.port = $.port;
        this.privateKey = $.privateKey;
        this.privateKeyPassphrase = $.privateKeyPassphrase;
        this.privateKeyPath = $.privateKeyPath;
        this.profile = $.profile;
        this.protocol = $.protocol;
        this.region = $.region;
        this.role = $.role;
        this.username = $.username;
        this.warehouse = $.warehouse;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProviderArgs $;

        public Builder() {
            $ = new ProviderArgs();
        }

        public Builder(ProviderArgs defaults) {
            $ = new ProviderArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param account The name of the Snowflake account. Can also come from the `SNOWFLAKE_ACCOUNT` environment variable. Required unless
         * using profile.
         * 
         * @return builder
         * 
         */
        public Builder account(@Nullable Output<String> account) {
            $.account = account;
            return this;
        }

        /**
         * @param account The name of the Snowflake account. Can also come from the `SNOWFLAKE_ACCOUNT` environment variable. Required unless
         * using profile.
         * 
         * @return builder
         * 
         */
        public Builder account(String account) {
            return account(Output.of(account));
        }

        /**
         * @param browserAuth Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_USE_BROWSER_AUTH` environment variable.
         * 
         * @return builder
         * 
         */
        public Builder browserAuth(@Nullable Output<Boolean> browserAuth) {
            $.browserAuth = browserAuth;
            return this;
        }

        /**
         * @param browserAuth Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_USE_BROWSER_AUTH` environment variable.
         * 
         * @return builder
         * 
         */
        public Builder browserAuth(Boolean browserAuth) {
            return browserAuth(Output.of(browserAuth));
        }

        /**
         * @param host Supports passing in a custom host value to the snowflake go driver for use with privatelink.
         * 
         * @return builder
         * 
         */
        public Builder host(@Nullable Output<String> host) {
            $.host = host;
            return this;
        }

        /**
         * @param host Supports passing in a custom host value to the snowflake go driver for use with privatelink.
         * 
         * @return builder
         * 
         */
        public Builder host(String host) {
            return host(Output.of(host));
        }

        /**
         * @param insecureMode If true, bypass the Online Certificate Status Protocol (OCSP) certificate revocation check. IMPORTANT: Change the
         * default value for testing or emergency situations only.
         * 
         * @return builder
         * 
         */
        public Builder insecureMode(@Nullable Output<Boolean> insecureMode) {
            $.insecureMode = insecureMode;
            return this;
        }

        /**
         * @param insecureMode If true, bypass the Online Certificate Status Protocol (OCSP) certificate revocation check. IMPORTANT: Change the
         * default value for testing or emergency situations only.
         * 
         * @return builder
         * 
         */
        public Builder insecureMode(Boolean insecureMode) {
            return insecureMode(Output.of(insecureMode));
        }

        /**
         * @param oauthAccessToken Token for use with OAuth. Generating the token is left to other tools. Cannot be used with `browser_auth`,
         * `private_key_path`, `oauth_refresh_token` or `password`. Can be sourced from `SNOWFLAKE_OAUTH_ACCESS_TOKEN` environment
         * variable.
         * 
         * @return builder
         * 
         */
        public Builder oauthAccessToken(@Nullable Output<String> oauthAccessToken) {
            $.oauthAccessToken = oauthAccessToken;
            return this;
        }

        /**
         * @param oauthAccessToken Token for use with OAuth. Generating the token is left to other tools. Cannot be used with `browser_auth`,
         * `private_key_path`, `oauth_refresh_token` or `password`. Can be sourced from `SNOWFLAKE_OAUTH_ACCESS_TOKEN` environment
         * variable.
         * 
         * @return builder
         * 
         */
        public Builder oauthAccessToken(String oauthAccessToken) {
            return oauthAccessToken(Output.of(oauthAccessToken));
        }

        /**
         * @param oauthClientId Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_OAUTH_CLIENT_ID` environment variable.
         * 
         * @return builder
         * 
         */
        public Builder oauthClientId(@Nullable Output<String> oauthClientId) {
            $.oauthClientId = oauthClientId;
            return this;
        }

        /**
         * @param oauthClientId Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_OAUTH_CLIENT_ID` environment variable.
         * 
         * @return builder
         * 
         */
        public Builder oauthClientId(String oauthClientId) {
            return oauthClientId(Output.of(oauthClientId));
        }

        /**
         * @param oauthClientSecret Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_OAUTH_CLIENT_SECRET` environment variable.
         * 
         * @return builder
         * 
         */
        public Builder oauthClientSecret(@Nullable Output<String> oauthClientSecret) {
            $.oauthClientSecret = oauthClientSecret;
            return this;
        }

        /**
         * @param oauthClientSecret Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_OAUTH_CLIENT_SECRET` environment variable.
         * 
         * @return builder
         * 
         */
        public Builder oauthClientSecret(String oauthClientSecret) {
            return oauthClientSecret(Output.of(oauthClientSecret));
        }

        /**
         * @param oauthEndpoint Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_OAUTH_ENDPOINT` environment variable.
         * 
         * @return builder
         * 
         */
        public Builder oauthEndpoint(@Nullable Output<String> oauthEndpoint) {
            $.oauthEndpoint = oauthEndpoint;
            return this;
        }

        /**
         * @param oauthEndpoint Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_OAUTH_ENDPOINT` environment variable.
         * 
         * @return builder
         * 
         */
        public Builder oauthEndpoint(String oauthEndpoint) {
            return oauthEndpoint(Output.of(oauthEndpoint));
        }

        /**
         * @param oauthRedirectUrl Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_OAUTH_REDIRECT_URL` environment variable.
         * 
         * @return builder
         * 
         */
        public Builder oauthRedirectUrl(@Nullable Output<String> oauthRedirectUrl) {
            $.oauthRedirectUrl = oauthRedirectUrl;
            return this;
        }

        /**
         * @param oauthRedirectUrl Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_OAUTH_REDIRECT_URL` environment variable.
         * 
         * @return builder
         * 
         */
        public Builder oauthRedirectUrl(String oauthRedirectUrl) {
            return oauthRedirectUrl(Output.of(oauthRedirectUrl));
        }

        /**
         * @param oauthRefreshToken Token for use with OAuth. Setup and generation of the token is left to other tools. Should be used in conjunction with
         * `oauth_client_id`, `oauth_client_secret`, `oauth_endpoint`, `oauth_redirect_url`. Cannot be used with `browser_auth`,
         * `private_key_path`, `oauth_access_token` or `password`. Can be sourced from `SNOWFLAKE_OAUTH_REFRESH_TOKEN` environment
         * variable.
         * 
         * @return builder
         * 
         */
        public Builder oauthRefreshToken(@Nullable Output<String> oauthRefreshToken) {
            $.oauthRefreshToken = oauthRefreshToken;
            return this;
        }

        /**
         * @param oauthRefreshToken Token for use with OAuth. Setup and generation of the token is left to other tools. Should be used in conjunction with
         * `oauth_client_id`, `oauth_client_secret`, `oauth_endpoint`, `oauth_redirect_url`. Cannot be used with `browser_auth`,
         * `private_key_path`, `oauth_access_token` or `password`. Can be sourced from `SNOWFLAKE_OAUTH_REFRESH_TOKEN` environment
         * variable.
         * 
         * @return builder
         * 
         */
        public Builder oauthRefreshToken(String oauthRefreshToken) {
            return oauthRefreshToken(Output.of(oauthRefreshToken));
        }

        /**
         * @param password Password for username+password auth. Cannot be used with `browser_auth` or `private_key_path`. Can be sourced from
         * `SNOWFLAKE_PASSWORD` environment variable.
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password Password for username+password auth. Cannot be used with `browser_auth` or `private_key_path`. Can be sourced from
         * `SNOWFLAKE_PASSWORD` environment variable.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param port Support custom port values to snowflake go driver for use with privatelink. Can be sourced from `SNOWFLAKE_PORT`
         * environment variable.
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port Support custom port values to snowflake go driver for use with privatelink. Can be sourced from `SNOWFLAKE_PORT`
         * environment variable.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        /**
         * @param privateKey Private Key for username+private-key auth. Cannot be used with `browser_auth` or `password`. Can be sourced from
         * `SNOWFLAKE_PRIVATE_KEY` environment variable.
         * 
         * @return builder
         * 
         */
        public Builder privateKey(@Nullable Output<String> privateKey) {
            $.privateKey = privateKey;
            return this;
        }

        /**
         * @param privateKey Private Key for username+private-key auth. Cannot be used with `browser_auth` or `password`. Can be sourced from
         * `SNOWFLAKE_PRIVATE_KEY` environment variable.
         * 
         * @return builder
         * 
         */
        public Builder privateKey(String privateKey) {
            return privateKey(Output.of(privateKey));
        }

        /**
         * @param privateKeyPassphrase Supports the encryption ciphers aes-128-cbc, aes-128-gcm, aes-192-cbc, aes-192-gcm, aes-256-cbc, aes-256-gcm, and
         * des-ede3-cbc
         * 
         * @return builder
         * 
         */
        public Builder privateKeyPassphrase(@Nullable Output<String> privateKeyPassphrase) {
            $.privateKeyPassphrase = privateKeyPassphrase;
            return this;
        }

        /**
         * @param privateKeyPassphrase Supports the encryption ciphers aes-128-cbc, aes-128-gcm, aes-192-cbc, aes-192-gcm, aes-256-cbc, aes-256-gcm, and
         * des-ede3-cbc
         * 
         * @return builder
         * 
         */
        public Builder privateKeyPassphrase(String privateKeyPassphrase) {
            return privateKeyPassphrase(Output.of(privateKeyPassphrase));
        }

        /**
         * @param privateKeyPath Path to a private key for using keypair authentication. Cannot be used with `browser_auth`, `oauth_access_token` or
         * `password`. Can be sourced from `SNOWFLAKE_PRIVATE_KEY_PATH` environment variable.
         * 
         * @return builder
         * 
         */
        public Builder privateKeyPath(@Nullable Output<String> privateKeyPath) {
            $.privateKeyPath = privateKeyPath;
            return this;
        }

        /**
         * @param privateKeyPath Path to a private key for using keypair authentication. Cannot be used with `browser_auth`, `oauth_access_token` or
         * `password`. Can be sourced from `SNOWFLAKE_PRIVATE_KEY_PATH` environment variable.
         * 
         * @return builder
         * 
         */
        public Builder privateKeyPath(String privateKeyPath) {
            return privateKeyPath(Output.of(privateKeyPath));
        }

        /**
         * @param profile Sets the profile to read from ~/.snowflake/config file.
         * 
         * @return builder
         * 
         */
        public Builder profile(@Nullable Output<String> profile) {
            $.profile = profile;
            return this;
        }

        /**
         * @param profile Sets the profile to read from ~/.snowflake/config file.
         * 
         * @return builder
         * 
         */
        public Builder profile(String profile) {
            return profile(Output.of(profile));
        }

        /**
         * @param protocol Support custom protocols to snowflake go driver. Can be sourced from `SNOWFLAKE_PROTOCOL` environment variable.
         * 
         * @return builder
         * 
         */
        public Builder protocol(@Nullable Output<String> protocol) {
            $.protocol = protocol;
            return this;
        }

        /**
         * @param protocol Support custom protocols to snowflake go driver. Can be sourced from `SNOWFLAKE_PROTOCOL` environment variable.
         * 
         * @return builder
         * 
         */
        public Builder protocol(String protocol) {
            return protocol(Output.of(protocol));
        }

        /**
         * @param region [Snowflake region](https://docs.snowflake.com/en/user-guide/intro-regions.html) to use. Required if using the [legacy
         * format for the `account`
         * identifier](https://docs.snowflake.com/en/user-guide/admin-account-identifier.html#format-2-legacy-account-locator-in-a-region)
         * in the form of `&lt;cloud_region_id&gt;.&lt;cloud&gt;`. Can be sourced from the `SNOWFLAKE_REGION` environment variable.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region [Snowflake region](https://docs.snowflake.com/en/user-guide/intro-regions.html) to use. Required if using the [legacy
         * format for the `account`
         * identifier](https://docs.snowflake.com/en/user-guide/admin-account-identifier.html#format-2-legacy-account-locator-in-a-region)
         * in the form of `&lt;cloud_region_id&gt;.&lt;cloud&gt;`. Can be sourced from the `SNOWFLAKE_REGION` environment variable.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param role Snowflake role to use for operations. If left unset, default role for user will be used. Can be sourced from the
         * `SNOWFLAKE_ROLE` environment variable.
         * 
         * @return builder
         * 
         */
        public Builder role(@Nullable Output<String> role) {
            $.role = role;
            return this;
        }

        /**
         * @param role Snowflake role to use for operations. If left unset, default role for user will be used. Can be sourced from the
         * `SNOWFLAKE_ROLE` environment variable.
         * 
         * @return builder
         * 
         */
        public Builder role(String role) {
            return role(Output.of(role));
        }

        /**
         * @param username Username for username+password authentication. Can come from the `SNOWFLAKE_USER` environment variable. Required unless
         * using profile.
         * 
         * @return builder
         * 
         */
        public Builder username(@Nullable Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username Username for username+password authentication. Can come from the `SNOWFLAKE_USER` environment variable. Required unless
         * using profile.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        /**
         * @param warehouse Sets the default warehouse. Optional. Can be sourced from SNOWFLAKE_WAREHOUSE environment variable.
         * 
         * @return builder
         * 
         */
        public Builder warehouse(@Nullable Output<String> warehouse) {
            $.warehouse = warehouse;
            return this;
        }

        /**
         * @param warehouse Sets the default warehouse. Optional. Can be sourced from SNOWFLAKE_WAREHOUSE environment variable.
         * 
         * @return builder
         * 
         */
        public Builder warehouse(String warehouse) {
            return warehouse(Output.of(warehouse));
        }

        public ProviderArgs build() {
            $.account = Codegen.stringProp("account").output().arg($.account).env("SNOWFLAKE_ACCOUNT").getNullable();
            $.browserAuth = Codegen.booleanProp("browserAuth").output().arg($.browserAuth).env("SNOWFLAKE_USE_BROWSER_AUTH").getNullable();
            $.host = Codegen.stringProp("host").output().arg($.host).env("SNOWFLAKE_HOST").getNullable();
            $.oauthAccessToken = Codegen.stringProp("oauthAccessToken").secret().arg($.oauthAccessToken).env("SNOWFLAKE_OAUTH_ACCESS_TOKEN").getNullable();
            $.oauthClientId = Codegen.stringProp("oauthClientId").secret().arg($.oauthClientId).env("SNOWFLAKE_OAUTH_CLIENT_ID").getNullable();
            $.oauthClientSecret = Codegen.stringProp("oauthClientSecret").secret().arg($.oauthClientSecret).env("SNOWFLAKE_OAUTH_CLIENT_SECRET").getNullable();
            $.oauthEndpoint = Codegen.stringProp("oauthEndpoint").secret().arg($.oauthEndpoint).env("SNOWFLAKE_OAUTH_ENDPOINT").getNullable();
            $.oauthRedirectUrl = Codegen.stringProp("oauthRedirectUrl").secret().arg($.oauthRedirectUrl).env("SNOWFLAKE_OAUTH_REDIRECT_URL").getNullable();
            $.oauthRefreshToken = Codegen.stringProp("oauthRefreshToken").secret().arg($.oauthRefreshToken).env("SNOWFLAKE_OAUTH_REFRESH_TOKEN").getNullable();
            $.password = Codegen.stringProp("password").secret().arg($.password).env("SNOWFLAKE_PASSWORD").getNullable();
            $.port = Codegen.integerProp("port").output().arg($.port).env("SNOWFLAKE_PORT").getNullable();
            $.privateKeyPassphrase = Codegen.stringProp("privateKeyPassphrase").secret().arg($.privateKeyPassphrase).env("SNOWFLAKE_PRIVATE_KEY_PASSPHRASE").getNullable();
            $.privateKeyPath = Codegen.stringProp("privateKeyPath").secret().arg($.privateKeyPath).env("SNOWFLAKE_PRIVATE_KEY_PATH").getNullable();
            $.protocol = Codegen.stringProp("protocol").output().arg($.protocol).env("SNOWFLAKE_PROTOCOL").getNullable();
            $.region = Codegen.stringProp("region").output().arg($.region).env("SNOWFLAKE_REGION").getNullable();
            $.role = Codegen.stringProp("role").output().arg($.role).env("SNOWFLAKE_ROLE").getNullable();
            $.username = Codegen.stringProp("username").output().arg($.username).env("SNOWFLAKE_USER").getNullable();
            $.warehouse = Codegen.stringProp("warehouse").output().arg($.warehouse).env("SNOWFLAKE_WAREHOUSE").getNullable();
            return $;
        }
    }

}
