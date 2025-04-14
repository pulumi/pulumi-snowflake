// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApiIntegrationState extends com.pulumi.resources.ResourceArgs {

    public static final ApiIntegrationState Empty = new ApiIntegrationState();

    /**
     * Explicitly limits external functions that use the integration to reference one or more HTTPS proxy service endpoints and resources within those proxies.
     * 
     */
    @Import(name="apiAllowedPrefixes")
    private @Nullable Output<List<String>> apiAllowedPrefixes;

    /**
     * @return Explicitly limits external functions that use the integration to reference one or more HTTPS proxy service endpoints and resources within those proxies.
     * 
     */
    public Optional<Output<List<String>>> apiAllowedPrefixes() {
        return Optional.ofNullable(this.apiAllowedPrefixes);
    }

    /**
     * The external ID that Snowflake will use when assuming the AWS role.
     * 
     */
    @Import(name="apiAwsExternalId")
    private @Nullable Output<String> apiAwsExternalId;

    /**
     * @return The external ID that Snowflake will use when assuming the AWS role.
     * 
     */
    public Optional<Output<String>> apiAwsExternalId() {
        return Optional.ofNullable(this.apiAwsExternalId);
    }

    /**
     * The Snowflake user that will attempt to assume the AWS role.
     * 
     */
    @Import(name="apiAwsIamUserArn")
    private @Nullable Output<String> apiAwsIamUserArn;

    /**
     * @return The Snowflake user that will attempt to assume the AWS role.
     * 
     */
    public Optional<Output<String>> apiAwsIamUserArn() {
        return Optional.ofNullable(this.apiAwsIamUserArn);
    }

    /**
     * (Default: ``) ARN of a cloud platform role.
     * 
     */
    @Import(name="apiAwsRoleArn")
    private @Nullable Output<String> apiAwsRoleArn;

    /**
     * @return (Default: ``) ARN of a cloud platform role.
     * 
     */
    public Optional<Output<String>> apiAwsRoleArn() {
        return Optional.ofNullable(this.apiAwsRoleArn);
    }

    /**
     * Lists the endpoints and resources in the HTTPS proxy service that are not allowed to be called from Snowflake.
     * 
     */
    @Import(name="apiBlockedPrefixes")
    private @Nullable Output<List<String>> apiBlockedPrefixes;

    /**
     * @return Lists the endpoints and resources in the HTTPS proxy service that are not allowed to be called from Snowflake.
     * 
     */
    public Optional<Output<List<String>>> apiBlockedPrefixes() {
        return Optional.ofNullable(this.apiBlockedPrefixes);
    }

    /**
     * The service account used for communication with the Google API Gateway.
     * 
     */
    @Import(name="apiGcpServiceAccount")
    private @Nullable Output<String> apiGcpServiceAccount;

    /**
     * @return The service account used for communication with the Google API Gateway.
     * 
     */
    public Optional<Output<String>> apiGcpServiceAccount() {
        return Optional.ofNullable(this.apiGcpServiceAccount);
    }

    /**
     * The API key (also called a “subscription key”).
     * 
     */
    @Import(name="apiKey")
    private @Nullable Output<String> apiKey;

    /**
     * @return The API key (also called a “subscription key”).
     * 
     */
    public Optional<Output<String>> apiKey() {
        return Optional.ofNullable(this.apiKey);
    }

    /**
     * Specifies the HTTPS proxy service type.
     * 
     */
    @Import(name="apiProvider")
    private @Nullable Output<String> apiProvider;

    /**
     * @return Specifies the HTTPS proxy service type.
     * 
     */
    public Optional<Output<String>> apiProvider() {
        return Optional.ofNullable(this.apiProvider);
    }

    /**
     * (Default: ``) The &#39;Application (client) id&#39; of the Azure AD app for your remote service.
     * 
     */
    @Import(name="azureAdApplicationId")
    private @Nullable Output<String> azureAdApplicationId;

    /**
     * @return (Default: ``) The &#39;Application (client) id&#39; of the Azure AD app for your remote service.
     * 
     */
    public Optional<Output<String>> azureAdApplicationId() {
        return Optional.ofNullable(this.azureAdApplicationId);
    }

    @Import(name="azureConsentUrl")
    private @Nullable Output<String> azureConsentUrl;

    public Optional<Output<String>> azureConsentUrl() {
        return Optional.ofNullable(this.azureConsentUrl);
    }

    @Import(name="azureMultiTenantAppName")
    private @Nullable Output<String> azureMultiTenantAppName;

    public Optional<Output<String>> azureMultiTenantAppName() {
        return Optional.ofNullable(this.azureMultiTenantAppName);
    }

    /**
     * (Default: ``) Specifies the ID for your Office 365 tenant that all Azure API Management instances belong to.
     * 
     */
    @Import(name="azureTenantId")
    private @Nullable Output<String> azureTenantId;

    /**
     * @return (Default: ``) Specifies the ID for your Office 365 tenant that all Azure API Management instances belong to.
     * 
     */
    public Optional<Output<String>> azureTenantId() {
        return Optional.ofNullable(this.azureTenantId);
    }

    @Import(name="comment")
    private @Nullable Output<String> comment;

    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    /**
     * Date and time when the API integration was created.
     * 
     */
    @Import(name="createdOn")
    private @Nullable Output<String> createdOn;

    /**
     * @return Date and time when the API integration was created.
     * 
     */
    public Optional<Output<String>> createdOn() {
        return Optional.ofNullable(this.createdOn);
    }

    /**
     * (Default: `true`) Specifies whether this API integration is enabled or disabled. If the API integration is disabled, any external function that relies on it will not work.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return (Default: `true`) Specifies whether this API integration is enabled or disabled. If the API integration is disabled, any external function that relies on it will not work.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
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
     * (Default: ``) The audience claim when generating the JWT (JSON Web Token) to authenticate to the Google API Gateway.
     * 
     */
    @Import(name="googleAudience")
    private @Nullable Output<String> googleAudience;

    /**
     * @return (Default: ``) The audience claim when generating the JWT (JSON Web Token) to authenticate to the Google API Gateway.
     * 
     */
    public Optional<Output<String>> googleAudience() {
        return Optional.ofNullable(this.googleAudience);
    }

    /**
     * Specifies the name of the API integration. This name follows the rules for Object Identifiers. The name should be unique among api integrations in your account.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the API integration. This name follows the rules for Object Identifiers. The name should be unique among api integrations in your account.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private ApiIntegrationState() {}

    private ApiIntegrationState(ApiIntegrationState $) {
        this.apiAllowedPrefixes = $.apiAllowedPrefixes;
        this.apiAwsExternalId = $.apiAwsExternalId;
        this.apiAwsIamUserArn = $.apiAwsIamUserArn;
        this.apiAwsRoleArn = $.apiAwsRoleArn;
        this.apiBlockedPrefixes = $.apiBlockedPrefixes;
        this.apiGcpServiceAccount = $.apiGcpServiceAccount;
        this.apiKey = $.apiKey;
        this.apiProvider = $.apiProvider;
        this.azureAdApplicationId = $.azureAdApplicationId;
        this.azureConsentUrl = $.azureConsentUrl;
        this.azureMultiTenantAppName = $.azureMultiTenantAppName;
        this.azureTenantId = $.azureTenantId;
        this.comment = $.comment;
        this.createdOn = $.createdOn;
        this.enabled = $.enabled;
        this.fullyQualifiedName = $.fullyQualifiedName;
        this.googleAudience = $.googleAudience;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApiIntegrationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApiIntegrationState $;

        public Builder() {
            $ = new ApiIntegrationState();
        }

        public Builder(ApiIntegrationState defaults) {
            $ = new ApiIntegrationState(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiAllowedPrefixes Explicitly limits external functions that use the integration to reference one or more HTTPS proxy service endpoints and resources within those proxies.
         * 
         * @return builder
         * 
         */
        public Builder apiAllowedPrefixes(@Nullable Output<List<String>> apiAllowedPrefixes) {
            $.apiAllowedPrefixes = apiAllowedPrefixes;
            return this;
        }

        /**
         * @param apiAllowedPrefixes Explicitly limits external functions that use the integration to reference one or more HTTPS proxy service endpoints and resources within those proxies.
         * 
         * @return builder
         * 
         */
        public Builder apiAllowedPrefixes(List<String> apiAllowedPrefixes) {
            return apiAllowedPrefixes(Output.of(apiAllowedPrefixes));
        }

        /**
         * @param apiAllowedPrefixes Explicitly limits external functions that use the integration to reference one or more HTTPS proxy service endpoints and resources within those proxies.
         * 
         * @return builder
         * 
         */
        public Builder apiAllowedPrefixes(String... apiAllowedPrefixes) {
            return apiAllowedPrefixes(List.of(apiAllowedPrefixes));
        }

        /**
         * @param apiAwsExternalId The external ID that Snowflake will use when assuming the AWS role.
         * 
         * @return builder
         * 
         */
        public Builder apiAwsExternalId(@Nullable Output<String> apiAwsExternalId) {
            $.apiAwsExternalId = apiAwsExternalId;
            return this;
        }

        /**
         * @param apiAwsExternalId The external ID that Snowflake will use when assuming the AWS role.
         * 
         * @return builder
         * 
         */
        public Builder apiAwsExternalId(String apiAwsExternalId) {
            return apiAwsExternalId(Output.of(apiAwsExternalId));
        }

        /**
         * @param apiAwsIamUserArn The Snowflake user that will attempt to assume the AWS role.
         * 
         * @return builder
         * 
         */
        public Builder apiAwsIamUserArn(@Nullable Output<String> apiAwsIamUserArn) {
            $.apiAwsIamUserArn = apiAwsIamUserArn;
            return this;
        }

        /**
         * @param apiAwsIamUserArn The Snowflake user that will attempt to assume the AWS role.
         * 
         * @return builder
         * 
         */
        public Builder apiAwsIamUserArn(String apiAwsIamUserArn) {
            return apiAwsIamUserArn(Output.of(apiAwsIamUserArn));
        }

        /**
         * @param apiAwsRoleArn (Default: ``) ARN of a cloud platform role.
         * 
         * @return builder
         * 
         */
        public Builder apiAwsRoleArn(@Nullable Output<String> apiAwsRoleArn) {
            $.apiAwsRoleArn = apiAwsRoleArn;
            return this;
        }

        /**
         * @param apiAwsRoleArn (Default: ``) ARN of a cloud platform role.
         * 
         * @return builder
         * 
         */
        public Builder apiAwsRoleArn(String apiAwsRoleArn) {
            return apiAwsRoleArn(Output.of(apiAwsRoleArn));
        }

        /**
         * @param apiBlockedPrefixes Lists the endpoints and resources in the HTTPS proxy service that are not allowed to be called from Snowflake.
         * 
         * @return builder
         * 
         */
        public Builder apiBlockedPrefixes(@Nullable Output<List<String>> apiBlockedPrefixes) {
            $.apiBlockedPrefixes = apiBlockedPrefixes;
            return this;
        }

        /**
         * @param apiBlockedPrefixes Lists the endpoints and resources in the HTTPS proxy service that are not allowed to be called from Snowflake.
         * 
         * @return builder
         * 
         */
        public Builder apiBlockedPrefixes(List<String> apiBlockedPrefixes) {
            return apiBlockedPrefixes(Output.of(apiBlockedPrefixes));
        }

        /**
         * @param apiBlockedPrefixes Lists the endpoints and resources in the HTTPS proxy service that are not allowed to be called from Snowflake.
         * 
         * @return builder
         * 
         */
        public Builder apiBlockedPrefixes(String... apiBlockedPrefixes) {
            return apiBlockedPrefixes(List.of(apiBlockedPrefixes));
        }

        /**
         * @param apiGcpServiceAccount The service account used for communication with the Google API Gateway.
         * 
         * @return builder
         * 
         */
        public Builder apiGcpServiceAccount(@Nullable Output<String> apiGcpServiceAccount) {
            $.apiGcpServiceAccount = apiGcpServiceAccount;
            return this;
        }

        /**
         * @param apiGcpServiceAccount The service account used for communication with the Google API Gateway.
         * 
         * @return builder
         * 
         */
        public Builder apiGcpServiceAccount(String apiGcpServiceAccount) {
            return apiGcpServiceAccount(Output.of(apiGcpServiceAccount));
        }

        /**
         * @param apiKey The API key (also called a “subscription key”).
         * 
         * @return builder
         * 
         */
        public Builder apiKey(@Nullable Output<String> apiKey) {
            $.apiKey = apiKey;
            return this;
        }

        /**
         * @param apiKey The API key (also called a “subscription key”).
         * 
         * @return builder
         * 
         */
        public Builder apiKey(String apiKey) {
            return apiKey(Output.of(apiKey));
        }

        /**
         * @param apiProvider Specifies the HTTPS proxy service type.
         * 
         * @return builder
         * 
         */
        public Builder apiProvider(@Nullable Output<String> apiProvider) {
            $.apiProvider = apiProvider;
            return this;
        }

        /**
         * @param apiProvider Specifies the HTTPS proxy service type.
         * 
         * @return builder
         * 
         */
        public Builder apiProvider(String apiProvider) {
            return apiProvider(Output.of(apiProvider));
        }

        /**
         * @param azureAdApplicationId (Default: ``) The &#39;Application (client) id&#39; of the Azure AD app for your remote service.
         * 
         * @return builder
         * 
         */
        public Builder azureAdApplicationId(@Nullable Output<String> azureAdApplicationId) {
            $.azureAdApplicationId = azureAdApplicationId;
            return this;
        }

        /**
         * @param azureAdApplicationId (Default: ``) The &#39;Application (client) id&#39; of the Azure AD app for your remote service.
         * 
         * @return builder
         * 
         */
        public Builder azureAdApplicationId(String azureAdApplicationId) {
            return azureAdApplicationId(Output.of(azureAdApplicationId));
        }

        public Builder azureConsentUrl(@Nullable Output<String> azureConsentUrl) {
            $.azureConsentUrl = azureConsentUrl;
            return this;
        }

        public Builder azureConsentUrl(String azureConsentUrl) {
            return azureConsentUrl(Output.of(azureConsentUrl));
        }

        public Builder azureMultiTenantAppName(@Nullable Output<String> azureMultiTenantAppName) {
            $.azureMultiTenantAppName = azureMultiTenantAppName;
            return this;
        }

        public Builder azureMultiTenantAppName(String azureMultiTenantAppName) {
            return azureMultiTenantAppName(Output.of(azureMultiTenantAppName));
        }

        /**
         * @param azureTenantId (Default: ``) Specifies the ID for your Office 365 tenant that all Azure API Management instances belong to.
         * 
         * @return builder
         * 
         */
        public Builder azureTenantId(@Nullable Output<String> azureTenantId) {
            $.azureTenantId = azureTenantId;
            return this;
        }

        /**
         * @param azureTenantId (Default: ``) Specifies the ID for your Office 365 tenant that all Azure API Management instances belong to.
         * 
         * @return builder
         * 
         */
        public Builder azureTenantId(String azureTenantId) {
            return azureTenantId(Output.of(azureTenantId));
        }

        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        /**
         * @param createdOn Date and time when the API integration was created.
         * 
         * @return builder
         * 
         */
        public Builder createdOn(@Nullable Output<String> createdOn) {
            $.createdOn = createdOn;
            return this;
        }

        /**
         * @param createdOn Date and time when the API integration was created.
         * 
         * @return builder
         * 
         */
        public Builder createdOn(String createdOn) {
            return createdOn(Output.of(createdOn));
        }

        /**
         * @param enabled (Default: `true`) Specifies whether this API integration is enabled or disabled. If the API integration is disabled, any external function that relies on it will not work.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled (Default: `true`) Specifies whether this API integration is enabled or disabled. If the API integration is disabled, any external function that relies on it will not work.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
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
         * @param googleAudience (Default: ``) The audience claim when generating the JWT (JSON Web Token) to authenticate to the Google API Gateway.
         * 
         * @return builder
         * 
         */
        public Builder googleAudience(@Nullable Output<String> googleAudience) {
            $.googleAudience = googleAudience;
            return this;
        }

        /**
         * @param googleAudience (Default: ``) The audience claim when generating the JWT (JSON Web Token) to authenticate to the Google API Gateway.
         * 
         * @return builder
         * 
         */
        public Builder googleAudience(String googleAudience) {
            return googleAudience(Output.of(googleAudience));
        }

        /**
         * @param name Specifies the name of the API integration. This name follows the rules for Object Identifiers. The name should be unique among api integrations in your account.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the API integration. This name follows the rules for Object Identifiers. The name should be unique among api integrations in your account.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public ApiIntegrationState build() {
            return $;
        }
    }

}
