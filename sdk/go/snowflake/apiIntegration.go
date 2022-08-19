// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package snowflake

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-snowflake/sdk/go/snowflake"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := snowflake.NewApiIntegration(ctx, "apiIntegration", &snowflake.ApiIntegrationArgs{
//				ApiAllowedPrefixes: pulumi.StringArray{
//					pulumi.String("https://123456.execute-api.us-west-2.amazonaws.com/prod/"),
//				},
//				ApiAwsRoleArn: pulumi.String("arn:aws:iam::000000000001:/role/test"),
//				ApiProvider:   pulumi.String("aws_api_gateway"),
//				Enabled:       pulumi.Bool(true),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// ```sh
//
//	$ pulumi import snowflake:index/apiIntegration:ApiIntegration example name
//
// ```
type ApiIntegration struct {
	pulumi.CustomResourceState

	// Explicitly limits external functions that use the integration to reference one or more HTTPS proxy service endpoints and resources within those proxies.
	ApiAllowedPrefixes pulumi.StringArrayOutput `pulumi:"apiAllowedPrefixes"`
	// The external ID that Snowflake will use when assuming the AWS role.
	ApiAwsExternalId pulumi.StringOutput `pulumi:"apiAwsExternalId"`
	// The Snowflake user that will attempt to assume the AWS role.
	ApiAwsIamUserArn pulumi.StringOutput `pulumi:"apiAwsIamUserArn"`
	// ARN of a cloud platform role.
	ApiAwsRoleArn pulumi.StringPtrOutput `pulumi:"apiAwsRoleArn"`
	// Lists the endpoints and resources in the HTTPS proxy service that are not allowed to be called from Snowflake.
	ApiBlockedPrefixes pulumi.StringArrayOutput `pulumi:"apiBlockedPrefixes"`
	// Specifies the HTTPS proxy service type.
	ApiProvider pulumi.StringOutput `pulumi:"apiProvider"`
	// The 'Application (client) id' of the Azure AD app for your remote service.
	AzureAdApplicationId    pulumi.StringPtrOutput `pulumi:"azureAdApplicationId"`
	AzureConsentUrl         pulumi.StringOutput    `pulumi:"azureConsentUrl"`
	AzureMultiTenantAppName pulumi.StringOutput    `pulumi:"azureMultiTenantAppName"`
	// Specifies the ID for your Office 365 tenant that all Azure API Management instances belong to.
	AzureTenantId pulumi.StringPtrOutput `pulumi:"azureTenantId"`
	// Date and time when the API integration was created.
	CreatedOn pulumi.StringOutput `pulumi:"createdOn"`
	// Specifies whether this API integration is enabled or disabled. If the API integration is disabled, any external function that relies on it will not work.
	Enabled pulumi.BoolPtrOutput `pulumi:"enabled"`
	// Specifies the name of the API integration. This name follows the rules for Object Identifiers. The name should be unique among api integrations in your account.
	Name pulumi.StringOutput `pulumi:"name"`
}

// NewApiIntegration registers a new resource with the given unique name, arguments, and options.
func NewApiIntegration(ctx *pulumi.Context,
	name string, args *ApiIntegrationArgs, opts ...pulumi.ResourceOption) (*ApiIntegration, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ApiAllowedPrefixes == nil {
		return nil, errors.New("invalid value for required argument 'ApiAllowedPrefixes'")
	}
	if args.ApiProvider == nil {
		return nil, errors.New("invalid value for required argument 'ApiProvider'")
	}
	var resource ApiIntegration
	err := ctx.RegisterResource("snowflake:index/apiIntegration:ApiIntegration", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetApiIntegration gets an existing ApiIntegration resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetApiIntegration(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ApiIntegrationState, opts ...pulumi.ResourceOption) (*ApiIntegration, error) {
	var resource ApiIntegration
	err := ctx.ReadResource("snowflake:index/apiIntegration:ApiIntegration", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ApiIntegration resources.
type apiIntegrationState struct {
	// Explicitly limits external functions that use the integration to reference one or more HTTPS proxy service endpoints and resources within those proxies.
	ApiAllowedPrefixes []string `pulumi:"apiAllowedPrefixes"`
	// The external ID that Snowflake will use when assuming the AWS role.
	ApiAwsExternalId *string `pulumi:"apiAwsExternalId"`
	// The Snowflake user that will attempt to assume the AWS role.
	ApiAwsIamUserArn *string `pulumi:"apiAwsIamUserArn"`
	// ARN of a cloud platform role.
	ApiAwsRoleArn *string `pulumi:"apiAwsRoleArn"`
	// Lists the endpoints and resources in the HTTPS proxy service that are not allowed to be called from Snowflake.
	ApiBlockedPrefixes []string `pulumi:"apiBlockedPrefixes"`
	// Specifies the HTTPS proxy service type.
	ApiProvider *string `pulumi:"apiProvider"`
	// The 'Application (client) id' of the Azure AD app for your remote service.
	AzureAdApplicationId    *string `pulumi:"azureAdApplicationId"`
	AzureConsentUrl         *string `pulumi:"azureConsentUrl"`
	AzureMultiTenantAppName *string `pulumi:"azureMultiTenantAppName"`
	// Specifies the ID for your Office 365 tenant that all Azure API Management instances belong to.
	AzureTenantId *string `pulumi:"azureTenantId"`
	// Date and time when the API integration was created.
	CreatedOn *string `pulumi:"createdOn"`
	// Specifies whether this API integration is enabled or disabled. If the API integration is disabled, any external function that relies on it will not work.
	Enabled *bool `pulumi:"enabled"`
	// Specifies the name of the API integration. This name follows the rules for Object Identifiers. The name should be unique among api integrations in your account.
	Name *string `pulumi:"name"`
}

type ApiIntegrationState struct {
	// Explicitly limits external functions that use the integration to reference one or more HTTPS proxy service endpoints and resources within those proxies.
	ApiAllowedPrefixes pulumi.StringArrayInput
	// The external ID that Snowflake will use when assuming the AWS role.
	ApiAwsExternalId pulumi.StringPtrInput
	// The Snowflake user that will attempt to assume the AWS role.
	ApiAwsIamUserArn pulumi.StringPtrInput
	// ARN of a cloud platform role.
	ApiAwsRoleArn pulumi.StringPtrInput
	// Lists the endpoints and resources in the HTTPS proxy service that are not allowed to be called from Snowflake.
	ApiBlockedPrefixes pulumi.StringArrayInput
	// Specifies the HTTPS proxy service type.
	ApiProvider pulumi.StringPtrInput
	// The 'Application (client) id' of the Azure AD app for your remote service.
	AzureAdApplicationId    pulumi.StringPtrInput
	AzureConsentUrl         pulumi.StringPtrInput
	AzureMultiTenantAppName pulumi.StringPtrInput
	// Specifies the ID for your Office 365 tenant that all Azure API Management instances belong to.
	AzureTenantId pulumi.StringPtrInput
	// Date and time when the API integration was created.
	CreatedOn pulumi.StringPtrInput
	// Specifies whether this API integration is enabled or disabled. If the API integration is disabled, any external function that relies on it will not work.
	Enabled pulumi.BoolPtrInput
	// Specifies the name of the API integration. This name follows the rules for Object Identifiers. The name should be unique among api integrations in your account.
	Name pulumi.StringPtrInput
}

func (ApiIntegrationState) ElementType() reflect.Type {
	return reflect.TypeOf((*apiIntegrationState)(nil)).Elem()
}

type apiIntegrationArgs struct {
	// Explicitly limits external functions that use the integration to reference one or more HTTPS proxy service endpoints and resources within those proxies.
	ApiAllowedPrefixes []string `pulumi:"apiAllowedPrefixes"`
	// ARN of a cloud platform role.
	ApiAwsRoleArn *string `pulumi:"apiAwsRoleArn"`
	// Lists the endpoints and resources in the HTTPS proxy service that are not allowed to be called from Snowflake.
	ApiBlockedPrefixes []string `pulumi:"apiBlockedPrefixes"`
	// Specifies the HTTPS proxy service type.
	ApiProvider string `pulumi:"apiProvider"`
	// The 'Application (client) id' of the Azure AD app for your remote service.
	AzureAdApplicationId *string `pulumi:"azureAdApplicationId"`
	// Specifies the ID for your Office 365 tenant that all Azure API Management instances belong to.
	AzureTenantId *string `pulumi:"azureTenantId"`
	// Specifies whether this API integration is enabled or disabled. If the API integration is disabled, any external function that relies on it will not work.
	Enabled *bool `pulumi:"enabled"`
	// Specifies the name of the API integration. This name follows the rules for Object Identifiers. The name should be unique among api integrations in your account.
	Name *string `pulumi:"name"`
}

// The set of arguments for constructing a ApiIntegration resource.
type ApiIntegrationArgs struct {
	// Explicitly limits external functions that use the integration to reference one or more HTTPS proxy service endpoints and resources within those proxies.
	ApiAllowedPrefixes pulumi.StringArrayInput
	// ARN of a cloud platform role.
	ApiAwsRoleArn pulumi.StringPtrInput
	// Lists the endpoints and resources in the HTTPS proxy service that are not allowed to be called from Snowflake.
	ApiBlockedPrefixes pulumi.StringArrayInput
	// Specifies the HTTPS proxy service type.
	ApiProvider pulumi.StringInput
	// The 'Application (client) id' of the Azure AD app for your remote service.
	AzureAdApplicationId pulumi.StringPtrInput
	// Specifies the ID for your Office 365 tenant that all Azure API Management instances belong to.
	AzureTenantId pulumi.StringPtrInput
	// Specifies whether this API integration is enabled or disabled. If the API integration is disabled, any external function that relies on it will not work.
	Enabled pulumi.BoolPtrInput
	// Specifies the name of the API integration. This name follows the rules for Object Identifiers. The name should be unique among api integrations in your account.
	Name pulumi.StringPtrInput
}

func (ApiIntegrationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*apiIntegrationArgs)(nil)).Elem()
}

type ApiIntegrationInput interface {
	pulumi.Input

	ToApiIntegrationOutput() ApiIntegrationOutput
	ToApiIntegrationOutputWithContext(ctx context.Context) ApiIntegrationOutput
}

func (*ApiIntegration) ElementType() reflect.Type {
	return reflect.TypeOf((**ApiIntegration)(nil)).Elem()
}

func (i *ApiIntegration) ToApiIntegrationOutput() ApiIntegrationOutput {
	return i.ToApiIntegrationOutputWithContext(context.Background())
}

func (i *ApiIntegration) ToApiIntegrationOutputWithContext(ctx context.Context) ApiIntegrationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApiIntegrationOutput)
}

// ApiIntegrationArrayInput is an input type that accepts ApiIntegrationArray and ApiIntegrationArrayOutput values.
// You can construct a concrete instance of `ApiIntegrationArrayInput` via:
//
//	ApiIntegrationArray{ ApiIntegrationArgs{...} }
type ApiIntegrationArrayInput interface {
	pulumi.Input

	ToApiIntegrationArrayOutput() ApiIntegrationArrayOutput
	ToApiIntegrationArrayOutputWithContext(context.Context) ApiIntegrationArrayOutput
}

type ApiIntegrationArray []ApiIntegrationInput

func (ApiIntegrationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ApiIntegration)(nil)).Elem()
}

func (i ApiIntegrationArray) ToApiIntegrationArrayOutput() ApiIntegrationArrayOutput {
	return i.ToApiIntegrationArrayOutputWithContext(context.Background())
}

func (i ApiIntegrationArray) ToApiIntegrationArrayOutputWithContext(ctx context.Context) ApiIntegrationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApiIntegrationArrayOutput)
}

// ApiIntegrationMapInput is an input type that accepts ApiIntegrationMap and ApiIntegrationMapOutput values.
// You can construct a concrete instance of `ApiIntegrationMapInput` via:
//
//	ApiIntegrationMap{ "key": ApiIntegrationArgs{...} }
type ApiIntegrationMapInput interface {
	pulumi.Input

	ToApiIntegrationMapOutput() ApiIntegrationMapOutput
	ToApiIntegrationMapOutputWithContext(context.Context) ApiIntegrationMapOutput
}

type ApiIntegrationMap map[string]ApiIntegrationInput

func (ApiIntegrationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ApiIntegration)(nil)).Elem()
}

func (i ApiIntegrationMap) ToApiIntegrationMapOutput() ApiIntegrationMapOutput {
	return i.ToApiIntegrationMapOutputWithContext(context.Background())
}

func (i ApiIntegrationMap) ToApiIntegrationMapOutputWithContext(ctx context.Context) ApiIntegrationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApiIntegrationMapOutput)
}

type ApiIntegrationOutput struct{ *pulumi.OutputState }

func (ApiIntegrationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ApiIntegration)(nil)).Elem()
}

func (o ApiIntegrationOutput) ToApiIntegrationOutput() ApiIntegrationOutput {
	return o
}

func (o ApiIntegrationOutput) ToApiIntegrationOutputWithContext(ctx context.Context) ApiIntegrationOutput {
	return o
}

// Explicitly limits external functions that use the integration to reference one or more HTTPS proxy service endpoints and resources within those proxies.
func (o ApiIntegrationOutput) ApiAllowedPrefixes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ApiIntegration) pulumi.StringArrayOutput { return v.ApiAllowedPrefixes }).(pulumi.StringArrayOutput)
}

// The external ID that Snowflake will use when assuming the AWS role.
func (o ApiIntegrationOutput) ApiAwsExternalId() pulumi.StringOutput {
	return o.ApplyT(func(v *ApiIntegration) pulumi.StringOutput { return v.ApiAwsExternalId }).(pulumi.StringOutput)
}

// The Snowflake user that will attempt to assume the AWS role.
func (o ApiIntegrationOutput) ApiAwsIamUserArn() pulumi.StringOutput {
	return o.ApplyT(func(v *ApiIntegration) pulumi.StringOutput { return v.ApiAwsIamUserArn }).(pulumi.StringOutput)
}

// ARN of a cloud platform role.
func (o ApiIntegrationOutput) ApiAwsRoleArn() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ApiIntegration) pulumi.StringPtrOutput { return v.ApiAwsRoleArn }).(pulumi.StringPtrOutput)
}

// Lists the endpoints and resources in the HTTPS proxy service that are not allowed to be called from Snowflake.
func (o ApiIntegrationOutput) ApiBlockedPrefixes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ApiIntegration) pulumi.StringArrayOutput { return v.ApiBlockedPrefixes }).(pulumi.StringArrayOutput)
}

// Specifies the HTTPS proxy service type.
func (o ApiIntegrationOutput) ApiProvider() pulumi.StringOutput {
	return o.ApplyT(func(v *ApiIntegration) pulumi.StringOutput { return v.ApiProvider }).(pulumi.StringOutput)
}

// The 'Application (client) id' of the Azure AD app for your remote service.
func (o ApiIntegrationOutput) AzureAdApplicationId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ApiIntegration) pulumi.StringPtrOutput { return v.AzureAdApplicationId }).(pulumi.StringPtrOutput)
}

func (o ApiIntegrationOutput) AzureConsentUrl() pulumi.StringOutput {
	return o.ApplyT(func(v *ApiIntegration) pulumi.StringOutput { return v.AzureConsentUrl }).(pulumi.StringOutput)
}

func (o ApiIntegrationOutput) AzureMultiTenantAppName() pulumi.StringOutput {
	return o.ApplyT(func(v *ApiIntegration) pulumi.StringOutput { return v.AzureMultiTenantAppName }).(pulumi.StringOutput)
}

// Specifies the ID for your Office 365 tenant that all Azure API Management instances belong to.
func (o ApiIntegrationOutput) AzureTenantId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ApiIntegration) pulumi.StringPtrOutput { return v.AzureTenantId }).(pulumi.StringPtrOutput)
}

// Date and time when the API integration was created.
func (o ApiIntegrationOutput) CreatedOn() pulumi.StringOutput {
	return o.ApplyT(func(v *ApiIntegration) pulumi.StringOutput { return v.CreatedOn }).(pulumi.StringOutput)
}

// Specifies whether this API integration is enabled or disabled. If the API integration is disabled, any external function that relies on it will not work.
func (o ApiIntegrationOutput) Enabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ApiIntegration) pulumi.BoolPtrOutput { return v.Enabled }).(pulumi.BoolPtrOutput)
}

// Specifies the name of the API integration. This name follows the rules for Object Identifiers. The name should be unique among api integrations in your account.
func (o ApiIntegrationOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ApiIntegration) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

type ApiIntegrationArrayOutput struct{ *pulumi.OutputState }

func (ApiIntegrationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ApiIntegration)(nil)).Elem()
}

func (o ApiIntegrationArrayOutput) ToApiIntegrationArrayOutput() ApiIntegrationArrayOutput {
	return o
}

func (o ApiIntegrationArrayOutput) ToApiIntegrationArrayOutputWithContext(ctx context.Context) ApiIntegrationArrayOutput {
	return o
}

func (o ApiIntegrationArrayOutput) Index(i pulumi.IntInput) ApiIntegrationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ApiIntegration {
		return vs[0].([]*ApiIntegration)[vs[1].(int)]
	}).(ApiIntegrationOutput)
}

type ApiIntegrationMapOutput struct{ *pulumi.OutputState }

func (ApiIntegrationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ApiIntegration)(nil)).Elem()
}

func (o ApiIntegrationMapOutput) ToApiIntegrationMapOutput() ApiIntegrationMapOutput {
	return o
}

func (o ApiIntegrationMapOutput) ToApiIntegrationMapOutputWithContext(ctx context.Context) ApiIntegrationMapOutput {
	return o
}

func (o ApiIntegrationMapOutput) MapIndex(k pulumi.StringInput) ApiIntegrationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ApiIntegration {
		return vs[0].(map[string]*ApiIntegration)[vs[1].(string)]
	}).(ApiIntegrationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ApiIntegrationInput)(nil)).Elem(), &ApiIntegration{})
	pulumi.RegisterInputType(reflect.TypeOf((*ApiIntegrationArrayInput)(nil)).Elem(), ApiIntegrationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ApiIntegrationMapInput)(nil)).Elem(), ApiIntegrationMap{})
	pulumi.RegisterOutputType(ApiIntegrationOutput{})
	pulumi.RegisterOutputType(ApiIntegrationArrayOutput{})
	pulumi.RegisterOutputType(ApiIntegrationMapOutput{})
}
