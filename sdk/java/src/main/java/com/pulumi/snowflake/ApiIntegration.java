// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.snowflake.ApiIntegrationArgs;
import com.pulumi.snowflake.Utilities;
import com.pulumi.snowflake.inputs.ApiIntegrationState;
import java.lang.Boolean;
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
 * import com.pulumi.snowflake.ApiIntegration;
 * import com.pulumi.snowflake.ApiIntegrationArgs;
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
 *         var aws = new ApiIntegration("aws", ApiIntegrationArgs.builder()
 *             .name("aws_integration")
 *             .apiProvider("aws_api_gateway")
 *             .apiAwsRoleArn("arn:aws:iam::000000000001:/role/test")
 *             .apiAllowedPrefixes("https://123456.execute-api.us-west-2.amazonaws.com/prod/")
 *             .enabled(true)
 *             .build());
 * 
 *         var azure = new ApiIntegration("azure", ApiIntegrationArgs.builder()
 *             .name("azure_integration")
 *             .apiProvider("azure_api_management")
 *             .azureTenantId("00000000-0000-0000-0000-000000000000")
 *             .azureAdApplicationId("11111111-1111-1111-1111-111111111111")
 *             .apiAllowedPrefixes("https://apim-hello-world.azure-api.net/")
 *             .enabled(true)
 *             .build());
 * 
 *         var gcp = new ApiIntegration("gcp", ApiIntegrationArgs.builder()
 *             .name("gcp_integration")
 *             .apiProvider("google_api_gateway")
 *             .googleAudience("api-gateway-id-123456.apigateway.gcp-project.cloud.goog")
 *             .apiAllowedPrefixes("https://gateway-id-123456.uc.gateway.dev/")
 *             .enabled(true)
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
 * $ pulumi import snowflake:index/apiIntegration:ApiIntegration example name
 * ```
 * 
 */
@ResourceType(type="snowflake:index/apiIntegration:ApiIntegration")
public class ApiIntegration extends com.pulumi.resources.CustomResource {
    /**
     * Explicitly limits external functions that use the integration to reference one or more HTTPS proxy service endpoints and resources within those proxies.
     * 
     */
    @Export(name="apiAllowedPrefixes", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> apiAllowedPrefixes;

    /**
     * @return Explicitly limits external functions that use the integration to reference one or more HTTPS proxy service endpoints and resources within those proxies.
     * 
     */
    public Output<List<String>> apiAllowedPrefixes() {
        return this.apiAllowedPrefixes;
    }
    /**
     * The external ID that Snowflake will use when assuming the AWS role.
     * 
     */
    @Export(name="apiAwsExternalId", refs={String.class}, tree="[0]")
    private Output<String> apiAwsExternalId;

    /**
     * @return The external ID that Snowflake will use when assuming the AWS role.
     * 
     */
    public Output<String> apiAwsExternalId() {
        return this.apiAwsExternalId;
    }
    /**
     * The Snowflake user that will attempt to assume the AWS role.
     * 
     */
    @Export(name="apiAwsIamUserArn", refs={String.class}, tree="[0]")
    private Output<String> apiAwsIamUserArn;

    /**
     * @return The Snowflake user that will attempt to assume the AWS role.
     * 
     */
    public Output<String> apiAwsIamUserArn() {
        return this.apiAwsIamUserArn;
    }
    /**
     * ARN of a cloud platform role.
     * 
     */
    @Export(name="apiAwsRoleArn", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> apiAwsRoleArn;

    /**
     * @return ARN of a cloud platform role.
     * 
     */
    public Output<Optional<String>> apiAwsRoleArn() {
        return Codegen.optional(this.apiAwsRoleArn);
    }
    /**
     * Lists the endpoints and resources in the HTTPS proxy service that are not allowed to be called from Snowflake.
     * 
     */
    @Export(name="apiBlockedPrefixes", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> apiBlockedPrefixes;

    /**
     * @return Lists the endpoints and resources in the HTTPS proxy service that are not allowed to be called from Snowflake.
     * 
     */
    public Output<Optional<List<String>>> apiBlockedPrefixes() {
        return Codegen.optional(this.apiBlockedPrefixes);
    }
    /**
     * The service account used for communication with the Google API Gateway.
     * 
     */
    @Export(name="apiGcpServiceAccount", refs={String.class}, tree="[0]")
    private Output<String> apiGcpServiceAccount;

    /**
     * @return The service account used for communication with the Google API Gateway.
     * 
     */
    public Output<String> apiGcpServiceAccount() {
        return this.apiGcpServiceAccount;
    }
    /**
     * The API key (also called a “subscription key”).
     * 
     */
    @Export(name="apiKey", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> apiKey;

    /**
     * @return The API key (also called a “subscription key”).
     * 
     */
    public Output<Optional<String>> apiKey() {
        return Codegen.optional(this.apiKey);
    }
    /**
     * Specifies the HTTPS proxy service type.
     * 
     */
    @Export(name="apiProvider", refs={String.class}, tree="[0]")
    private Output<String> apiProvider;

    /**
     * @return Specifies the HTTPS proxy service type.
     * 
     */
    public Output<String> apiProvider() {
        return this.apiProvider;
    }
    /**
     * The &#39;Application (client) id&#39; of the Azure AD app for your remote service.
     * 
     */
    @Export(name="azureAdApplicationId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> azureAdApplicationId;

    /**
     * @return The &#39;Application (client) id&#39; of the Azure AD app for your remote service.
     * 
     */
    public Output<Optional<String>> azureAdApplicationId() {
        return Codegen.optional(this.azureAdApplicationId);
    }
    @Export(name="azureConsentUrl", refs={String.class}, tree="[0]")
    private Output<String> azureConsentUrl;

    public Output<String> azureConsentUrl() {
        return this.azureConsentUrl;
    }
    @Export(name="azureMultiTenantAppName", refs={String.class}, tree="[0]")
    private Output<String> azureMultiTenantAppName;

    public Output<String> azureMultiTenantAppName() {
        return this.azureMultiTenantAppName;
    }
    /**
     * Specifies the ID for your Office 365 tenant that all Azure API Management instances belong to.
     * 
     */
    @Export(name="azureTenantId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> azureTenantId;

    /**
     * @return Specifies the ID for your Office 365 tenant that all Azure API Management instances belong to.
     * 
     */
    public Output<Optional<String>> azureTenantId() {
        return Codegen.optional(this.azureTenantId);
    }
    @Export(name="comment", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> comment;

    public Output<Optional<String>> comment() {
        return Codegen.optional(this.comment);
    }
    /**
     * Date and time when the API integration was created.
     * 
     */
    @Export(name="createdOn", refs={String.class}, tree="[0]")
    private Output<String> createdOn;

    /**
     * @return Date and time when the API integration was created.
     * 
     */
    public Output<String> createdOn() {
        return this.createdOn;
    }
    /**
     * Specifies whether this API integration is enabled or disabled. If the API integration is disabled, any external function that relies on it will not work.
     * 
     */
    @Export(name="enabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return Specifies whether this API integration is enabled or disabled. If the API integration is disabled, any external function that relies on it will not work.
     * 
     */
    public Output<Optional<Boolean>> enabled() {
        return Codegen.optional(this.enabled);
    }
    /**
     * The audience claim when generating the JWT (JSON Web Token) to authenticate to the Google API Gateway.
     * 
     */
    @Export(name="googleAudience", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> googleAudience;

    /**
     * @return The audience claim when generating the JWT (JSON Web Token) to authenticate to the Google API Gateway.
     * 
     */
    public Output<Optional<String>> googleAudience() {
        return Codegen.optional(this.googleAudience);
    }
    /**
     * Specifies the name of the API integration. This name follows the rules for Object Identifiers. The name should be unique among api integrations in your account.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Specifies the name of the API integration. This name follows the rules for Object Identifiers. The name should be unique among api integrations in your account.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ApiIntegration(String name) {
        this(name, ApiIntegrationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ApiIntegration(String name, ApiIntegrationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ApiIntegration(String name, ApiIntegrationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/apiIntegration:ApiIntegration", name, args == null ? ApiIntegrationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ApiIntegration(String name, Output<String> id, @Nullable ApiIntegrationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/apiIntegration:ApiIntegration", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "apiKey"
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
    public static ApiIntegration get(String name, Output<String> id, @Nullable ApiIntegrationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ApiIntegration(name, id, state, options);
    }
}
