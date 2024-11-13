// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package snowflake

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-snowflake/sdk/go/snowflake/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// !> **V1 release candidate** This datasource was reworked and is a release candidate for the V1. We do not expect significant changes in it before the V1. We will welcome any feedback and adjust the resource if needed. Any errors reported will be resolved with a higher priority. We encourage checking this resource out before the V1 release. To migrate from older grant resources please follow the migration guide.
//
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
//			// #################################
//			// ## SHOW GRANTS ON ...
//			// #################################
//			// account
//			_, err := snowflake.GetGrants(ctx, &snowflake.GetGrantsArgs{
//				GrantsOn: snowflake.GetGrantsGrantsOn{
//					Account: pulumi.BoolRef(true),
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			// account object (e.g. database)
//			_, err = snowflake.GetGrants(ctx, &snowflake.GetGrantsArgs{
//				GrantsOn: snowflake.GetGrantsGrantsOn{
//					ObjectName: pulumi.StringRef("some_database"),
//					ObjectType: pulumi.StringRef("DATABASE"),
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			// database object (e.g. schema)
//			_, err = snowflake.GetGrants(ctx, &snowflake.GetGrantsArgs{
//				GrantsOn: snowflake.GetGrantsGrantsOn{
//					ObjectName: pulumi.StringRef("\"some_database\".\"some_schema\""),
//					ObjectType: pulumi.StringRef("SCHEMA"),
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			// schema object (e.g. table)
//			_, err = snowflake.GetGrants(ctx, &snowflake.GetGrantsArgs{
//				GrantsOn: snowflake.GetGrantsGrantsOn{
//					ObjectName: pulumi.StringRef("\"some_database\".\"some_schema\".\"some_table\""),
//					ObjectType: pulumi.StringRef("TABLE"),
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			// application
//			_, err = snowflake.GetGrants(ctx, &snowflake.GetGrantsArgs{
//				GrantsTo: snowflake.GetGrantsGrantsTo{
//					Application: pulumi.StringRef("some_application"),
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			// application role
//			_, err = snowflake.GetGrants(ctx, &snowflake.GetGrantsArgs{
//				GrantsTo: snowflake.GetGrantsGrantsTo{
//					ApplicationRole: pulumi.StringRef("\"some_application\".\"some_application_role\""),
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			// account role
//			_, err = snowflake.GetGrants(ctx, &snowflake.GetGrantsArgs{
//				GrantsTo: snowflake.GetGrantsGrantsTo{
//					AccountRole: pulumi.StringRef("some_role"),
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			// database role
//			_, err = snowflake.GetGrants(ctx, &snowflake.GetGrantsArgs{
//				GrantsTo: snowflake.GetGrantsGrantsTo{
//					DatabaseRole: pulumi.StringRef("\"some_database\".\"some_database_role\""),
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			// share
//			_, err = snowflake.GetGrants(ctx, &snowflake.GetGrantsArgs{
//				GrantsTo: snowflake.GetGrantsGrantsTo{
//					Share: snowflake.GetGrantsGrantsToShare{
//						ShareName: "some_share",
//					},
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			// user
//			_, err = snowflake.GetGrants(ctx, &snowflake.GetGrantsArgs{
//				GrantsTo: snowflake.GetGrantsGrantsTo{
//					User: pulumi.StringRef("some_user"),
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			// application role
//			_, err = snowflake.GetGrants(ctx, &snowflake.GetGrantsArgs{
//				GrantsOf: snowflake.GetGrantsGrantsOf{
//					ApplicationRole: pulumi.StringRef("\"some_application\".\"some_application_role\""),
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			// database role
//			_, err = snowflake.GetGrants(ctx, &snowflake.GetGrantsArgs{
//				GrantsOf: snowflake.GetGrantsGrantsOf{
//					DatabaseRole: pulumi.StringRef("\"some_database\".\"some_database_role\""),
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			// account role
//			_, err = snowflake.GetGrants(ctx, &snowflake.GetGrantsArgs{
//				GrantsOf: snowflake.GetGrantsGrantsOf{
//					AccountRole: pulumi.StringRef("some_role"),
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			// share
//			_, err = snowflake.GetGrants(ctx, &snowflake.GetGrantsArgs{
//				GrantsOf: snowflake.GetGrantsGrantsOf{
//					Share: pulumi.StringRef("some_share"),
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			// database
//			_, err = snowflake.GetGrants(ctx, &snowflake.GetGrantsArgs{
//				FutureGrantsIn: snowflake.GetGrantsFutureGrantsIn{
//					Database: pulumi.StringRef("some_database"),
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			// schema
//			_, err = snowflake.GetGrants(ctx, &snowflake.GetGrantsArgs{
//				FutureGrantsIn: snowflake.GetGrantsFutureGrantsIn{
//					Schema: pulumi.StringRef("\"some_database\".\"some_schema\""),
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			// account role
//			_, err = snowflake.GetGrants(ctx, &snowflake.GetGrantsArgs{
//				FutureGrantsTo: snowflake.GetGrantsFutureGrantsTo{
//					AccountRole: pulumi.StringRef("some_role"),
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			// database role
//			_, err = snowflake.GetGrants(ctx, &snowflake.GetGrantsArgs{
//				FutureGrantsTo: snowflake.GetGrantsFutureGrantsTo{
//					DatabaseRole: pulumi.StringRef("\"some_database\".\"some_database_role\""),
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetGrants(ctx *pulumi.Context, args *GetGrantsArgs, opts ...pulumi.InvokeOption) (*GetGrantsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetGrantsResult
	err := ctx.Invoke("snowflake:index/getGrants:getGrants", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getGrants.
type GetGrantsArgs struct {
	// Lists all privileges on new (i.e. future) objects.
	FutureGrantsIn *GetGrantsFutureGrantsIn `pulumi:"futureGrantsIn"`
	// Lists all privileges granted to the object on new (i.e. future) objects.
	FutureGrantsTo *GetGrantsFutureGrantsTo `pulumi:"futureGrantsTo"`
	// Lists all objects to which the given object has been granted.
	GrantsOf *GetGrantsGrantsOf `pulumi:"grantsOf"`
	// Lists all privileges that have been granted on an object or on an account.
	GrantsOn *GetGrantsGrantsOn `pulumi:"grantsOn"`
	// Lists all privileges granted to the object.
	GrantsTo *GetGrantsGrantsTo `pulumi:"grantsTo"`
}

// A collection of values returned by getGrants.
type GetGrantsResult struct {
	// Lists all privileges on new (i.e. future) objects.
	FutureGrantsIn *GetGrantsFutureGrantsIn `pulumi:"futureGrantsIn"`
	// Lists all privileges granted to the object on new (i.e. future) objects.
	FutureGrantsTo *GetGrantsFutureGrantsTo `pulumi:"futureGrantsTo"`
	// The list of grants
	Grants []GetGrantsGrant `pulumi:"grants"`
	// Lists all objects to which the given object has been granted.
	GrantsOf *GetGrantsGrantsOf `pulumi:"grantsOf"`
	// Lists all privileges that have been granted on an object or on an account.
	GrantsOn *GetGrantsGrantsOn `pulumi:"grantsOn"`
	// Lists all privileges granted to the object.
	GrantsTo *GetGrantsGrantsTo `pulumi:"grantsTo"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
}

func GetGrantsOutput(ctx *pulumi.Context, args GetGrantsOutputArgs, opts ...pulumi.InvokeOption) GetGrantsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetGrantsResultOutput, error) {
			args := v.(GetGrantsArgs)
			opts = internal.PkgInvokeDefaultOpts(opts)
			var rv GetGrantsResult
			secret, err := ctx.InvokePackageRaw("snowflake:index/getGrants:getGrants", args, &rv, "", opts...)
			if err != nil {
				return GetGrantsResultOutput{}, err
			}

			output := pulumi.ToOutput(rv).(GetGrantsResultOutput)
			if secret {
				return pulumi.ToSecret(output).(GetGrantsResultOutput), nil
			}
			return output, nil
		}).(GetGrantsResultOutput)
}

// A collection of arguments for invoking getGrants.
type GetGrantsOutputArgs struct {
	// Lists all privileges on new (i.e. future) objects.
	FutureGrantsIn GetGrantsFutureGrantsInPtrInput `pulumi:"futureGrantsIn"`
	// Lists all privileges granted to the object on new (i.e. future) objects.
	FutureGrantsTo GetGrantsFutureGrantsToPtrInput `pulumi:"futureGrantsTo"`
	// Lists all objects to which the given object has been granted.
	GrantsOf GetGrantsGrantsOfPtrInput `pulumi:"grantsOf"`
	// Lists all privileges that have been granted on an object or on an account.
	GrantsOn GetGrantsGrantsOnPtrInput `pulumi:"grantsOn"`
	// Lists all privileges granted to the object.
	GrantsTo GetGrantsGrantsToPtrInput `pulumi:"grantsTo"`
}

func (GetGrantsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetGrantsArgs)(nil)).Elem()
}

// A collection of values returned by getGrants.
type GetGrantsResultOutput struct{ *pulumi.OutputState }

func (GetGrantsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetGrantsResult)(nil)).Elem()
}

func (o GetGrantsResultOutput) ToGetGrantsResultOutput() GetGrantsResultOutput {
	return o
}

func (o GetGrantsResultOutput) ToGetGrantsResultOutputWithContext(ctx context.Context) GetGrantsResultOutput {
	return o
}

// Lists all privileges on new (i.e. future) objects.
func (o GetGrantsResultOutput) FutureGrantsIn() GetGrantsFutureGrantsInPtrOutput {
	return o.ApplyT(func(v GetGrantsResult) *GetGrantsFutureGrantsIn { return v.FutureGrantsIn }).(GetGrantsFutureGrantsInPtrOutput)
}

// Lists all privileges granted to the object on new (i.e. future) objects.
func (o GetGrantsResultOutput) FutureGrantsTo() GetGrantsFutureGrantsToPtrOutput {
	return o.ApplyT(func(v GetGrantsResult) *GetGrantsFutureGrantsTo { return v.FutureGrantsTo }).(GetGrantsFutureGrantsToPtrOutput)
}

// The list of grants
func (o GetGrantsResultOutput) Grants() GetGrantsGrantArrayOutput {
	return o.ApplyT(func(v GetGrantsResult) []GetGrantsGrant { return v.Grants }).(GetGrantsGrantArrayOutput)
}

// Lists all objects to which the given object has been granted.
func (o GetGrantsResultOutput) GrantsOf() GetGrantsGrantsOfPtrOutput {
	return o.ApplyT(func(v GetGrantsResult) *GetGrantsGrantsOf { return v.GrantsOf }).(GetGrantsGrantsOfPtrOutput)
}

// Lists all privileges that have been granted on an object or on an account.
func (o GetGrantsResultOutput) GrantsOn() GetGrantsGrantsOnPtrOutput {
	return o.ApplyT(func(v GetGrantsResult) *GetGrantsGrantsOn { return v.GrantsOn }).(GetGrantsGrantsOnPtrOutput)
}

// Lists all privileges granted to the object.
func (o GetGrantsResultOutput) GrantsTo() GetGrantsGrantsToPtrOutput {
	return o.ApplyT(func(v GetGrantsResult) *GetGrantsGrantsTo { return v.GrantsTo }).(GetGrantsGrantsToPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetGrantsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetGrantsResult) string { return v.Id }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetGrantsResultOutput{})
}
