// Copyright 2016-2018, Pulumi Corporation.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package snowflake

import (
	"fmt"
	"path/filepath"
	"unicode"

	snowflake "github.com/Snowflake-Labs/terraform-provider-snowflake/pkg/provider"
	"github.com/pulumi/pulumi-snowflake/provider/pkg/version"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	shimv2 "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim/sdk-v2"
	"github.com/pulumi/pulumi/sdk/v3/go/common/tokens"
)

// all of the token components used below.
const (
	// packages:
	mainPkg = "snowflake"
	// modules:
	mainMod = "index" // the y module
)

// makeMember manufactures a type token for the package and the given module and type.
func makeMember(mod string, mem string) tokens.ModuleMember {
	return tokens.ModuleMember(mainPkg + ":" + mod + ":" + mem)
}

// makeType manufactures a type token for the package and the given module and type.
func makeType(mod string, typ string) tokens.Type {
	return tokens.Type(makeMember(mod, typ))
}

// makeDataSource manufactures a standard resource token given a module and resource name.  It
// automatically uses the main package and names the file by simply lower casing the data source's
// first character.
func makeDataSource(mod string, res string) tokens.ModuleMember {
	fn := string(unicode.ToLower(rune(res[0]))) + res[1:]
	return makeMember(mod+"/"+fn, res)
}

// makeResource manufactures a standard resource token given a module and resource name.  It
// automatically uses the main package and names the file by simply lower casing the resource's
// first character.
func makeResource(mod string, res string) tokens.Type {
	fn := string(unicode.ToLower(rune(res[0]))) + res[1:]
	return makeType(mod+"/"+fn, res)
}

// Provider returns additional overlaid schema and metadata associated with the provider..
func Provider() tfbridge.ProviderInfo {
	// Instantiate the Terraform provider
	p := shimv2.NewProvider(snowflake.Provider())

	// Create a Pulumi provider mapping
	prov := tfbridge.ProviderInfo{
		P:           p,
		Name:        "snowflake",
		Description: "A Pulumi package for creating and managing snowflake cloud resources.",
		Keywords:    []string{"pulumi", "snowflake"},
		License:     "Apache-2.0",
		Homepage:    "https://pulumi.io",
		GitHubOrg:   "Snowflake-Labs",
		Repository:  "https://github.com/pulumi/pulumi-snowflake",
		Config:      map[string]*tfbridge.SchemaInfo{},
		Resources: map[string]*tfbridge.ResourceInfo{
			"snowflake_account_grant":                  {Tok: makeResource(mainMod, "AccountGrant")},
			"snowflake_api_integration":                {Tok: makeResource(mainMod, "ApiIntegration")},
			"snowflake_database":                       {Tok: makeResource(mainMod, "Database")},
			"snowflake_database_grant":                 {Tok: makeResource(mainMod, "DatabaseGrant")},
			"snowflake_external_function":              {Tok: makeResource(mainMod, "ExternalFunction")},
			"snowflake_external_table":                 {Tok: makeResource(mainMod, "ExternalTable")},
			"snowflake_external_table_grant":           {Tok: makeResource(mainMod, "ExternalTableGrant")},
			"snowflake_failover_group":                 {Tok: makeResource(mainMod, "FailoverGroup")},
			"snowflake_file_format":                    {Tok: makeResource(mainMod, "FileFormat")},
			"snowflake_file_format_grant":              {Tok: makeResource(mainMod, "FileFormatGrant")},
			"snowflake_function":                       {Tok: makeResource(mainMod, "Function")},
			"snowflake_function_grant":                 {Tok: makeResource(mainMod, "FunctionGrant")},
			"snowflake_integration_grant":              {Tok: makeResource(mainMod, "IntegrationGrant")},
			"snowflake_managed_account":                {Tok: makeResource(mainMod, "ManagedAccount")},
			"snowflake_masking_policy":                 {Tok: makeResource(mainMod, "MaskingPolicy")},
			"snowflake_masking_policy_grant":           {Tok: makeResource(mainMod, "MaskingPolicyGrant")},
			"snowflake_materialized_view":              {Tok: makeResource(mainMod, "MaterializedView")},
			"snowflake_materialized_view_grant":        {Tok: makeResource(mainMod, "MaterializedViewGrant")},
			"snowflake_network_policy":                 {Tok: makeResource(mainMod, "NetworkPolicy")},
			"snowflake_network_policy_attachment":      {Tok: makeResource(mainMod, "NetworkPolicyAttachment")},
			"snowflake_notification_integration":       {Tok: makeResource(mainMod, "NotificationIntegration")},
			"snowflake_pipe":                           {Tok: makeResource(mainMod, "Pipe")},
			"snowflake_pipe_grant":                     {Tok: makeResource(mainMod, "PipeGrant")},
			"snowflake_procedure":                      {Tok: makeResource(mainMod, "Procedure")},
			"snowflake_procedure_grant":                {Tok: makeResource(mainMod, "ProcedureGrant")},
			"snowflake_resource_monitor":               {Tok: makeResource(mainMod, "ResourceMonitor")},
			"snowflake_resource_monitor_grant":         {Tok: makeResource(mainMod, "ResourceMonitorGrant")},
			"snowflake_role":                           {Tok: makeResource(mainMod, "Role")},
			"snowflake_role_grants":                    {Tok: makeResource(mainMod, "RoleGrants")},
			"snowflake_row_access_policy":              {Tok: makeResource(mainMod, "RowAccessPolicy")},
			"snowflake_row_access_policy_grant":        {Tok: makeResource(mainMod, "RowAccessPolicyGrant")},
			"snowflake_schema":                         {Tok: makeResource(mainMod, "Schema")},
			"snowflake_schema_grant":                   {Tok: makeResource(mainMod, "SchemaGrant")},
			"snowflake_scim_integration":               {Tok: makeResource(mainMod, "ScimIntegration")},
			"snowflake_sequence":                       {Tok: makeResource(mainMod, "Sequence")},
			"snowflake_sequence_grant":                 {Tok: makeResource(mainMod, "SequenceGrant")},
			"snowflake_share":                          {Tok: makeResource(mainMod, "Share")},
			"snowflake_stage":                          {Tok: makeResource(mainMod, "Stage")},
			"snowflake_stage_grant":                    {Tok: makeResource(mainMod, "StageGrant")},
			"snowflake_storage_integration":            {Tok: makeResource(mainMod, "StorageIntegration")},
			"snowflake_stream":                         {Tok: makeResource(mainMod, "Stream")},
			"snowflake_stream_grant":                   {Tok: makeResource(mainMod, "StreamGrant")},
			"snowflake_table":                          {Tok: makeResource(mainMod, "Table")},
			"snowflake_table_constraint":               {Tok: makeResource(mainMod, "TableConstraint")},
			"snowflake_table_grant":                    {Tok: makeResource(mainMod, "TableGrant")},
			"snowflake_tag":                            {Tok: makeResource(mainMod, "Tag")},
			"snowflake_task":                           {Tok: makeResource(mainMod, "Task")},
			"snowflake_task_grant":                     {Tok: makeResource(mainMod, "TaskGrant")},
			"snowflake_user":                           {Tok: makeResource(mainMod, "User")},
			"snowflake_user_grant":                     {Tok: makeResource(mainMod, "UserGrant")},
			"snowflake_user_public_keys":               {Tok: makeResource(mainMod, "UserPublicKeys")},
			"snowflake_view":                           {Tok: makeResource(mainMod, "View")},
			"snowflake_view_grant":                     {Tok: makeResource(mainMod, "ViewGrant")},
			"snowflake_warehouse":                      {Tok: makeResource(mainMod, "Warehouse")},
			"snowflake_warehouse_grant":                {Tok: makeResource(mainMod, "WarehouseGrant")},
			"snowflake_oauth_integration":              {Tok: makeResource(mainMod, "OauthIntegration")},
			"snowflake_saml_integration":               {Tok: makeResource(mainMod, "SamlIntegration")},
			"snowflake_external_oauth_integration":     {Tok: makeResource(mainMod, "ExternalOauthIntegration")},
			"snowflake_role_ownership_grant":           {Tok: makeResource(mainMod, "RoleOwnershipGrant")},
			"snowflake_user_ownership_grant":           {Tok: makeResource(mainMod, "UserOwnershipGrant")},
			"snowflake_tag_association":                {Tok: makeResource(mainMod, "TagAssociation")},
			"snowflake_tag_grant":                      {Tok: makeResource(mainMod, "TagGrant")},
			"snowflake_tag_masking_policy_association": {Tok: makeResource(mainMod, "TagMaskingPolicyAssociation")},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{
			"snowflake_current_account":                    {Tok: makeDataSource(mainMod, "getCurrentAccount")},
			"snowflake_system_generate_scim_access_token":  {Tok: makeDataSource(mainMod, "getSystemGenerateScimAccessToken")},
			"snowflake_system_get_aws_sns_iam_policy":      {Tok: makeDataSource(mainMod, "getSystemGetAwsSnsIamPolicy")},
			"snowflake_system_get_privatelink_config":      {Tok: makeDataSource(mainMod, "getSystemGetPrivateLinkConfig")},
			"snowflake_system_get_snowflake_platform_info": {Tok: makeDataSource(mainMod, "getSystemGetSnowflakePlatformInfo")},
			"snowflake_materialized_views":                 {Tok: makeDataSource(mainMod, "getMaterializedViews")},
			"snowflake_schemas":                            {Tok: makeDataSource(mainMod, "getSchemas")},
			"snowflake_tables":                             {Tok: makeDataSource(mainMod, "getTables")},
			"snowflake_views":                              {Tok: makeDataSource(mainMod, "getViews")},
			"snowflake_external_functions":                 {Tok: makeDataSource(mainMod, "getExternalFunctions")},
			"snowflake_external_tables":                    {Tok: makeDataSource(mainMod, "getExternalTables")},
			"snowflake_file_formats":                       {Tok: makeDataSource(mainMod, "getFileFormats")},
			"snowflake_functions":                          {Tok: makeDataSource(mainMod, "getFunctions")},
			"snowflake_masking_policies":                   {Tok: makeDataSource(mainMod, "getMaskingPolicies")},
			"snowflake_pipes":                              {Tok: makeDataSource(mainMod, "getPipes")},
			"snowflake_procedures":                         {Tok: makeDataSource(mainMod, "getProcedures")},
			"snowflake_resource_monitors":                  {Tok: makeDataSource(mainMod, "getResourceMonitors")},
			"snowflake_row_access_policies":                {Tok: makeDataSource(mainMod, "getRowAccessPolicies")},
			"snowflake_sequences":                          {Tok: makeDataSource(mainMod, "getSequences")},
			"snowflake_stages":                             {Tok: makeDataSource(mainMod, "getStages")},
			"snowflake_storage_integrations":               {Tok: makeDataSource(mainMod, "getStorageIntegrations")},
			"snowflake_streams":                            {Tok: makeDataSource(mainMod, "getStreams")},
			"snowflake_tasks":                              {Tok: makeDataSource(mainMod, "getTasks")},
			"snowflake_warehouses":                         {Tok: makeDataSource(mainMod, "getWarehouses")},
			"snowflake_database":                           {Tok: makeDataSource(mainMod, "getDatabase")},
			"snowflake_databases":                          {Tok: makeDataSource(mainMod, "getDatabases")},
			"snowflake_role":                               {Tok: makeDataSource(mainMod, "getRole")},
			"snowflake_roles":                              {Tok: makeDataSource(mainMod, "getRoles")},
			"snowflake_users":                              {Tok: makeDataSource(mainMod, "getUsers")},
			"snowflake_grants":                             {Tok: makeDataSource(mainMod, "getGrants")},
		},
		JavaScript: &tfbridge.JavaScriptInfo{
			Dependencies: map[string]string{
				"@pulumi/pulumi": "^3.0.0",
			},
			DevDependencies: map[string]string{
				"@types/node": "^10.0.0",
				"@types/mime": "^2.0.0",
			},
		},
		Python: &tfbridge.PythonInfo{
			Requires: map[string]string{
				"pulumi": ">=3.0.0,<4.0.0",
			},
		},
		Golang: &tfbridge.GolangInfo{
			ImportBasePath: filepath.Join(
				fmt.Sprintf("github.com/pulumi/pulumi-%[1]s/sdk/", mainPkg),
				tfbridge.GetModuleMajorVersion(version.Version),
				"go",
				mainPkg,
			),
			GenerateResourceContainerTypes: true,
		},
		CSharp: &tfbridge.CSharpInfo{
			PackageReferences: map[string]string{
				"Pulumi": "3.*",
			},
		},
	}

	prov.SetAutonaming(255, "-")

	return prov
}
