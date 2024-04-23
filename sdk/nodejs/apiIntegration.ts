// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as snowflake from "@pulumi/snowflake";
 *
 * const aws = new snowflake.ApiIntegration("aws", {
 *     name: "aws_integration",
 *     apiProvider: "aws_api_gateway",
 *     apiAwsRoleArn: "arn:aws:iam::000000000001:/role/test",
 *     apiAllowedPrefixes: ["https://123456.execute-api.us-west-2.amazonaws.com/prod/"],
 *     enabled: true,
 * });
 * const azure = new snowflake.ApiIntegration("azure", {
 *     name: "azure_integration",
 *     apiProvider: "azure_api_management",
 *     azureTenantId: "00000000-0000-0000-0000-000000000000",
 *     azureAdApplicationId: "11111111-1111-1111-1111-111111111111",
 *     apiAllowedPrefixes: ["https://apim-hello-world.azure-api.net/"],
 *     enabled: true,
 * });
 * const gcp = new snowflake.ApiIntegration("gcp", {
 *     name: "gcp_integration",
 *     apiProvider: "google_api_gateway",
 *     googleAudience: "api-gateway-id-123456.apigateway.gcp-project.cloud.goog",
 *     apiAllowedPrefixes: ["https://gateway-id-123456.uc.gateway.dev/"],
 *     enabled: true,
 * });
 * ```
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import snowflake:index/apiIntegration:ApiIntegration example name
 * ```
 */
export class ApiIntegration extends pulumi.CustomResource {
    /**
     * Get an existing ApiIntegration resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ApiIntegrationState, opts?: pulumi.CustomResourceOptions): ApiIntegration {
        return new ApiIntegration(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'snowflake:index/apiIntegration:ApiIntegration';

    /**
     * Returns true if the given object is an instance of ApiIntegration.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ApiIntegration {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ApiIntegration.__pulumiType;
    }

    /**
     * Explicitly limits external functions that use the integration to reference one or more HTTPS proxy service endpoints and resources within those proxies.
     */
    public readonly apiAllowedPrefixes!: pulumi.Output<string[]>;
    /**
     * The external ID that Snowflake will use when assuming the AWS role.
     */
    public /*out*/ readonly apiAwsExternalId!: pulumi.Output<string>;
    /**
     * The Snowflake user that will attempt to assume the AWS role.
     */
    public /*out*/ readonly apiAwsIamUserArn!: pulumi.Output<string>;
    /**
     * ARN of a cloud platform role.
     */
    public readonly apiAwsRoleArn!: pulumi.Output<string | undefined>;
    /**
     * Lists the endpoints and resources in the HTTPS proxy service that are not allowed to be called from Snowflake.
     */
    public readonly apiBlockedPrefixes!: pulumi.Output<string[] | undefined>;
    /**
     * The service account used for communication with the Google API Gateway.
     */
    public readonly apiGcpServiceAccount!: pulumi.Output<string>;
    /**
     * The API key (also called a “subscription key”).
     */
    public readonly apiKey!: pulumi.Output<string | undefined>;
    /**
     * Specifies the HTTPS proxy service type.
     */
    public readonly apiProvider!: pulumi.Output<string>;
    /**
     * The 'Application (client) id' of the Azure AD app for your remote service.
     */
    public readonly azureAdApplicationId!: pulumi.Output<string | undefined>;
    public /*out*/ readonly azureConsentUrl!: pulumi.Output<string>;
    public /*out*/ readonly azureMultiTenantAppName!: pulumi.Output<string>;
    /**
     * Specifies the ID for your Office 365 tenant that all Azure API Management instances belong to.
     */
    public readonly azureTenantId!: pulumi.Output<string | undefined>;
    public readonly comment!: pulumi.Output<string | undefined>;
    /**
     * Date and time when the API integration was created.
     */
    public /*out*/ readonly createdOn!: pulumi.Output<string>;
    /**
     * Specifies whether this API integration is enabled or disabled. If the API integration is disabled, any external function that relies on it will not work.
     */
    public readonly enabled!: pulumi.Output<boolean | undefined>;
    /**
     * The audience claim when generating the JWT (JSON Web Token) to authenticate to the Google API Gateway.
     */
    public readonly googleAudience!: pulumi.Output<string | undefined>;
    /**
     * Specifies the name of the API integration. This name follows the rules for Object Identifiers. The name should be unique among api integrations in your account.
     */
    public readonly name!: pulumi.Output<string>;

    /**
     * Create a ApiIntegration resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ApiIntegrationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ApiIntegrationArgs | ApiIntegrationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ApiIntegrationState | undefined;
            resourceInputs["apiAllowedPrefixes"] = state ? state.apiAllowedPrefixes : undefined;
            resourceInputs["apiAwsExternalId"] = state ? state.apiAwsExternalId : undefined;
            resourceInputs["apiAwsIamUserArn"] = state ? state.apiAwsIamUserArn : undefined;
            resourceInputs["apiAwsRoleArn"] = state ? state.apiAwsRoleArn : undefined;
            resourceInputs["apiBlockedPrefixes"] = state ? state.apiBlockedPrefixes : undefined;
            resourceInputs["apiGcpServiceAccount"] = state ? state.apiGcpServiceAccount : undefined;
            resourceInputs["apiKey"] = state ? state.apiKey : undefined;
            resourceInputs["apiProvider"] = state ? state.apiProvider : undefined;
            resourceInputs["azureAdApplicationId"] = state ? state.azureAdApplicationId : undefined;
            resourceInputs["azureConsentUrl"] = state ? state.azureConsentUrl : undefined;
            resourceInputs["azureMultiTenantAppName"] = state ? state.azureMultiTenantAppName : undefined;
            resourceInputs["azureTenantId"] = state ? state.azureTenantId : undefined;
            resourceInputs["comment"] = state ? state.comment : undefined;
            resourceInputs["createdOn"] = state ? state.createdOn : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["googleAudience"] = state ? state.googleAudience : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
        } else {
            const args = argsOrState as ApiIntegrationArgs | undefined;
            if ((!args || args.apiAllowedPrefixes === undefined) && !opts.urn) {
                throw new Error("Missing required property 'apiAllowedPrefixes'");
            }
            if ((!args || args.apiProvider === undefined) && !opts.urn) {
                throw new Error("Missing required property 'apiProvider'");
            }
            resourceInputs["apiAllowedPrefixes"] = args ? args.apiAllowedPrefixes : undefined;
            resourceInputs["apiAwsRoleArn"] = args ? args.apiAwsRoleArn : undefined;
            resourceInputs["apiBlockedPrefixes"] = args ? args.apiBlockedPrefixes : undefined;
            resourceInputs["apiGcpServiceAccount"] = args ? args.apiGcpServiceAccount : undefined;
            resourceInputs["apiKey"] = args?.apiKey ? pulumi.secret(args.apiKey) : undefined;
            resourceInputs["apiProvider"] = args ? args.apiProvider : undefined;
            resourceInputs["azureAdApplicationId"] = args ? args.azureAdApplicationId : undefined;
            resourceInputs["azureTenantId"] = args ? args.azureTenantId : undefined;
            resourceInputs["comment"] = args ? args.comment : undefined;
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["googleAudience"] = args ? args.googleAudience : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["apiAwsExternalId"] = undefined /*out*/;
            resourceInputs["apiAwsIamUserArn"] = undefined /*out*/;
            resourceInputs["azureConsentUrl"] = undefined /*out*/;
            resourceInputs["azureMultiTenantAppName"] = undefined /*out*/;
            resourceInputs["createdOn"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["apiKey"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(ApiIntegration.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ApiIntegration resources.
 */
export interface ApiIntegrationState {
    /**
     * Explicitly limits external functions that use the integration to reference one or more HTTPS proxy service endpoints and resources within those proxies.
     */
    apiAllowedPrefixes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The external ID that Snowflake will use when assuming the AWS role.
     */
    apiAwsExternalId?: pulumi.Input<string>;
    /**
     * The Snowflake user that will attempt to assume the AWS role.
     */
    apiAwsIamUserArn?: pulumi.Input<string>;
    /**
     * ARN of a cloud platform role.
     */
    apiAwsRoleArn?: pulumi.Input<string>;
    /**
     * Lists the endpoints and resources in the HTTPS proxy service that are not allowed to be called from Snowflake.
     */
    apiBlockedPrefixes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The service account used for communication with the Google API Gateway.
     */
    apiGcpServiceAccount?: pulumi.Input<string>;
    /**
     * The API key (also called a “subscription key”).
     */
    apiKey?: pulumi.Input<string>;
    /**
     * Specifies the HTTPS proxy service type.
     */
    apiProvider?: pulumi.Input<string>;
    /**
     * The 'Application (client) id' of the Azure AD app for your remote service.
     */
    azureAdApplicationId?: pulumi.Input<string>;
    azureConsentUrl?: pulumi.Input<string>;
    azureMultiTenantAppName?: pulumi.Input<string>;
    /**
     * Specifies the ID for your Office 365 tenant that all Azure API Management instances belong to.
     */
    azureTenantId?: pulumi.Input<string>;
    comment?: pulumi.Input<string>;
    /**
     * Date and time when the API integration was created.
     */
    createdOn?: pulumi.Input<string>;
    /**
     * Specifies whether this API integration is enabled or disabled. If the API integration is disabled, any external function that relies on it will not work.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * The audience claim when generating the JWT (JSON Web Token) to authenticate to the Google API Gateway.
     */
    googleAudience?: pulumi.Input<string>;
    /**
     * Specifies the name of the API integration. This name follows the rules for Object Identifiers. The name should be unique among api integrations in your account.
     */
    name?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ApiIntegration resource.
 */
export interface ApiIntegrationArgs {
    /**
     * Explicitly limits external functions that use the integration to reference one or more HTTPS proxy service endpoints and resources within those proxies.
     */
    apiAllowedPrefixes: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * ARN of a cloud platform role.
     */
    apiAwsRoleArn?: pulumi.Input<string>;
    /**
     * Lists the endpoints and resources in the HTTPS proxy service that are not allowed to be called from Snowflake.
     */
    apiBlockedPrefixes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The service account used for communication with the Google API Gateway.
     */
    apiGcpServiceAccount?: pulumi.Input<string>;
    /**
     * The API key (also called a “subscription key”).
     */
    apiKey?: pulumi.Input<string>;
    /**
     * Specifies the HTTPS proxy service type.
     */
    apiProvider: pulumi.Input<string>;
    /**
     * The 'Application (client) id' of the Azure AD app for your remote service.
     */
    azureAdApplicationId?: pulumi.Input<string>;
    /**
     * Specifies the ID for your Office 365 tenant that all Azure API Management instances belong to.
     */
    azureTenantId?: pulumi.Input<string>;
    comment?: pulumi.Input<string>;
    /**
     * Specifies whether this API integration is enabled or disabled. If the API integration is disabled, any external function that relies on it will not work.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * The audience claim when generating the JWT (JSON Web Token) to authenticate to the Google API Gateway.
     */
    googleAudience?: pulumi.Input<string>;
    /**
     * Specifies the name of the API integration. This name follows the rules for Object Identifiers. The name should be unique among api integrations in your account.
     */
    name?: pulumi.Input<string>;
}
