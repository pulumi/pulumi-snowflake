// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

// Export members:
export * from "./accountGrant";
export * from "./apiIntegration";
export * from "./database";
export * from "./databaseGrant";
export * from "./externalFunction";
export * from "./externalOauthIntegration";
export * from "./externalTable";
export * from "./externalTableGrant";
export * from "./fileFormat";
export * from "./fileFormatGrant";
export * from "./function";
export * from "./functionGrant";
export * from "./getCurrentAccount";
export * from "./getDatabase";
export * from "./getDatabases";
export * from "./getExternalFunctions";
export * from "./getExternalTables";
export * from "./getFileFormats";
export * from "./getFunctions";
export * from "./getMaskingPolicies";
export * from "./getMaterializedViews";
export * from "./getPipes";
export * from "./getProcedures";
export * from "./getResourceMonitors";
export * from "./getRole";
export * from "./getRowAccessPolicies";
export * from "./getSchemas";
export * from "./getSequences";
export * from "./getStages";
export * from "./getStorageIntegrations";
export * from "./getStreams";
export * from "./getSystemGenerateScimAccessToken";
export * from "./getSystemGetAwsSnsIamPolicy";
export * from "./getSystemGetPrivateLinkConfig";
export * from "./getSystemGetSnowflakePlatformInfo";
export * from "./getTables";
export * from "./getTasks";
export * from "./getUsers";
export * from "./getViews";
export * from "./getWarehouses";
export * from "./integrationGrant";
export * from "./managedAccount";
export * from "./maskingPolicy";
export * from "./maskingPolicyGrant";
export * from "./materializedView";
export * from "./materializedViewGrant";
export * from "./networkPolicy";
export * from "./networkPolicyAttachment";
export * from "./notificationIntegration";
export * from "./oauthIntegration";
export * from "./pipe";
export * from "./pipeGrant";
export * from "./procedure";
export * from "./procedureGrant";
export * from "./provider";
export * from "./resourceMonitor";
export * from "./resourceMonitorGrant";
export * from "./role";
export * from "./roleGrants";
export * from "./roleOwnershipGrant";
export * from "./rowAccessPolicy";
export * from "./rowAccessPolicyGrant";
export * from "./samlIntegration";
export * from "./schema";
export * from "./schemaGrant";
export * from "./scimIntegration";
export * from "./sequence";
export * from "./sequenceGrant";
export * from "./share";
export * from "./stage";
export * from "./stageGrant";
export * from "./storageIntegration";
export * from "./stream";
export * from "./streamGrant";
export * from "./table";
export * from "./tableGrant";
export * from "./tag";
export * from "./tagGrant";
export * from "./task";
export * from "./taskGrant";
export * from "./user";
export * from "./userOwnershipGrant";
export * from "./userPublicKeys";
export * from "./view";
export * from "./viewGrant";
export * from "./warehouse";
export * from "./warehouseGrant";

// Export sub-modules:
import * as config from "./config";
import * as types from "./types";

export {
    config,
    types,
};

// Import resources to register:
import { AccountGrant } from "./accountGrant";
import { ApiIntegration } from "./apiIntegration";
import { Database } from "./database";
import { DatabaseGrant } from "./databaseGrant";
import { ExternalFunction } from "./externalFunction";
import { ExternalOauthIntegration } from "./externalOauthIntegration";
import { ExternalTable } from "./externalTable";
import { ExternalTableGrant } from "./externalTableGrant";
import { FileFormat } from "./fileFormat";
import { FileFormatGrant } from "./fileFormatGrant";
import { Function } from "./function";
import { FunctionGrant } from "./functionGrant";
import { IntegrationGrant } from "./integrationGrant";
import { ManagedAccount } from "./managedAccount";
import { MaskingPolicy } from "./maskingPolicy";
import { MaskingPolicyGrant } from "./maskingPolicyGrant";
import { MaterializedView } from "./materializedView";
import { MaterializedViewGrant } from "./materializedViewGrant";
import { NetworkPolicy } from "./networkPolicy";
import { NetworkPolicyAttachment } from "./networkPolicyAttachment";
import { NotificationIntegration } from "./notificationIntegration";
import { OauthIntegration } from "./oauthIntegration";
import { Pipe } from "./pipe";
import { PipeGrant } from "./pipeGrant";
import { Procedure } from "./procedure";
import { ProcedureGrant } from "./procedureGrant";
import { ResourceMonitor } from "./resourceMonitor";
import { ResourceMonitorGrant } from "./resourceMonitorGrant";
import { Role } from "./role";
import { RoleGrants } from "./roleGrants";
import { RoleOwnershipGrant } from "./roleOwnershipGrant";
import { RowAccessPolicy } from "./rowAccessPolicy";
import { RowAccessPolicyGrant } from "./rowAccessPolicyGrant";
import { SamlIntegration } from "./samlIntegration";
import { Schema } from "./schema";
import { SchemaGrant } from "./schemaGrant";
import { ScimIntegration } from "./scimIntegration";
import { Sequence } from "./sequence";
import { SequenceGrant } from "./sequenceGrant";
import { Share } from "./share";
import { Stage } from "./stage";
import { StageGrant } from "./stageGrant";
import { StorageIntegration } from "./storageIntegration";
import { Stream } from "./stream";
import { StreamGrant } from "./streamGrant";
import { Table } from "./table";
import { TableGrant } from "./tableGrant";
import { Tag } from "./tag";
import { TagGrant } from "./tagGrant";
import { Task } from "./task";
import { TaskGrant } from "./taskGrant";
import { User } from "./user";
import { UserOwnershipGrant } from "./userOwnershipGrant";
import { UserPublicKeys } from "./userPublicKeys";
import { View } from "./view";
import { ViewGrant } from "./viewGrant";
import { Warehouse } from "./warehouse";
import { WarehouseGrant } from "./warehouseGrant";

const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "snowflake:index/accountGrant:AccountGrant":
                return new AccountGrant(name, <any>undefined, { urn })
            case "snowflake:index/apiIntegration:ApiIntegration":
                return new ApiIntegration(name, <any>undefined, { urn })
            case "snowflake:index/database:Database":
                return new Database(name, <any>undefined, { urn })
            case "snowflake:index/databaseGrant:DatabaseGrant":
                return new DatabaseGrant(name, <any>undefined, { urn })
            case "snowflake:index/externalFunction:ExternalFunction":
                return new ExternalFunction(name, <any>undefined, { urn })
            case "snowflake:index/externalOauthIntegration:ExternalOauthIntegration":
                return new ExternalOauthIntegration(name, <any>undefined, { urn })
            case "snowflake:index/externalTable:ExternalTable":
                return new ExternalTable(name, <any>undefined, { urn })
            case "snowflake:index/externalTableGrant:ExternalTableGrant":
                return new ExternalTableGrant(name, <any>undefined, { urn })
            case "snowflake:index/fileFormat:FileFormat":
                return new FileFormat(name, <any>undefined, { urn })
            case "snowflake:index/fileFormatGrant:FileFormatGrant":
                return new FileFormatGrant(name, <any>undefined, { urn })
            case "snowflake:index/function:Function":
                return new Function(name, <any>undefined, { urn })
            case "snowflake:index/functionGrant:FunctionGrant":
                return new FunctionGrant(name, <any>undefined, { urn })
            case "snowflake:index/integrationGrant:IntegrationGrant":
                return new IntegrationGrant(name, <any>undefined, { urn })
            case "snowflake:index/managedAccount:ManagedAccount":
                return new ManagedAccount(name, <any>undefined, { urn })
            case "snowflake:index/maskingPolicy:MaskingPolicy":
                return new MaskingPolicy(name, <any>undefined, { urn })
            case "snowflake:index/maskingPolicyGrant:MaskingPolicyGrant":
                return new MaskingPolicyGrant(name, <any>undefined, { urn })
            case "snowflake:index/materializedView:MaterializedView":
                return new MaterializedView(name, <any>undefined, { urn })
            case "snowflake:index/materializedViewGrant:MaterializedViewGrant":
                return new MaterializedViewGrant(name, <any>undefined, { urn })
            case "snowflake:index/networkPolicy:NetworkPolicy":
                return new NetworkPolicy(name, <any>undefined, { urn })
            case "snowflake:index/networkPolicyAttachment:NetworkPolicyAttachment":
                return new NetworkPolicyAttachment(name, <any>undefined, { urn })
            case "snowflake:index/notificationIntegration:NotificationIntegration":
                return new NotificationIntegration(name, <any>undefined, { urn })
            case "snowflake:index/oauthIntegration:OauthIntegration":
                return new OauthIntegration(name, <any>undefined, { urn })
            case "snowflake:index/pipe:Pipe":
                return new Pipe(name, <any>undefined, { urn })
            case "snowflake:index/pipeGrant:PipeGrant":
                return new PipeGrant(name, <any>undefined, { urn })
            case "snowflake:index/procedure:Procedure":
                return new Procedure(name, <any>undefined, { urn })
            case "snowflake:index/procedureGrant:ProcedureGrant":
                return new ProcedureGrant(name, <any>undefined, { urn })
            case "snowflake:index/resourceMonitor:ResourceMonitor":
                return new ResourceMonitor(name, <any>undefined, { urn })
            case "snowflake:index/resourceMonitorGrant:ResourceMonitorGrant":
                return new ResourceMonitorGrant(name, <any>undefined, { urn })
            case "snowflake:index/role:Role":
                return new Role(name, <any>undefined, { urn })
            case "snowflake:index/roleGrants:RoleGrants":
                return new RoleGrants(name, <any>undefined, { urn })
            case "snowflake:index/roleOwnershipGrant:RoleOwnershipGrant":
                return new RoleOwnershipGrant(name, <any>undefined, { urn })
            case "snowflake:index/rowAccessPolicy:RowAccessPolicy":
                return new RowAccessPolicy(name, <any>undefined, { urn })
            case "snowflake:index/rowAccessPolicyGrant:RowAccessPolicyGrant":
                return new RowAccessPolicyGrant(name, <any>undefined, { urn })
            case "snowflake:index/samlIntegration:SamlIntegration":
                return new SamlIntegration(name, <any>undefined, { urn })
            case "snowflake:index/schema:Schema":
                return new Schema(name, <any>undefined, { urn })
            case "snowflake:index/schemaGrant:SchemaGrant":
                return new SchemaGrant(name, <any>undefined, { urn })
            case "snowflake:index/scimIntegration:ScimIntegration":
                return new ScimIntegration(name, <any>undefined, { urn })
            case "snowflake:index/sequence:Sequence":
                return new Sequence(name, <any>undefined, { urn })
            case "snowflake:index/sequenceGrant:SequenceGrant":
                return new SequenceGrant(name, <any>undefined, { urn })
            case "snowflake:index/share:Share":
                return new Share(name, <any>undefined, { urn })
            case "snowflake:index/stage:Stage":
                return new Stage(name, <any>undefined, { urn })
            case "snowflake:index/stageGrant:StageGrant":
                return new StageGrant(name, <any>undefined, { urn })
            case "snowflake:index/storageIntegration:StorageIntegration":
                return new StorageIntegration(name, <any>undefined, { urn })
            case "snowflake:index/stream:Stream":
                return new Stream(name, <any>undefined, { urn })
            case "snowflake:index/streamGrant:StreamGrant":
                return new StreamGrant(name, <any>undefined, { urn })
            case "snowflake:index/table:Table":
                return new Table(name, <any>undefined, { urn })
            case "snowflake:index/tableGrant:TableGrant":
                return new TableGrant(name, <any>undefined, { urn })
            case "snowflake:index/tag:Tag":
                return new Tag(name, <any>undefined, { urn })
            case "snowflake:index/tagGrant:TagGrant":
                return new TagGrant(name, <any>undefined, { urn })
            case "snowflake:index/task:Task":
                return new Task(name, <any>undefined, { urn })
            case "snowflake:index/taskGrant:TaskGrant":
                return new TaskGrant(name, <any>undefined, { urn })
            case "snowflake:index/user:User":
                return new User(name, <any>undefined, { urn })
            case "snowflake:index/userOwnershipGrant:UserOwnershipGrant":
                return new UserOwnershipGrant(name, <any>undefined, { urn })
            case "snowflake:index/userPublicKeys:UserPublicKeys":
                return new UserPublicKeys(name, <any>undefined, { urn })
            case "snowflake:index/view:View":
                return new View(name, <any>undefined, { urn })
            case "snowflake:index/viewGrant:ViewGrant":
                return new ViewGrant(name, <any>undefined, { urn })
            case "snowflake:index/warehouse:Warehouse":
                return new Warehouse(name, <any>undefined, { urn })
            case "snowflake:index/warehouseGrant:WarehouseGrant":
                return new WarehouseGrant(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("snowflake", "index/accountGrant", _module)
pulumi.runtime.registerResourceModule("snowflake", "index/apiIntegration", _module)
pulumi.runtime.registerResourceModule("snowflake", "index/database", _module)
pulumi.runtime.registerResourceModule("snowflake", "index/databaseGrant", _module)
pulumi.runtime.registerResourceModule("snowflake", "index/externalFunction", _module)
pulumi.runtime.registerResourceModule("snowflake", "index/externalOauthIntegration", _module)
pulumi.runtime.registerResourceModule("snowflake", "index/externalTable", _module)
pulumi.runtime.registerResourceModule("snowflake", "index/externalTableGrant", _module)
pulumi.runtime.registerResourceModule("snowflake", "index/fileFormat", _module)
pulumi.runtime.registerResourceModule("snowflake", "index/fileFormatGrant", _module)
pulumi.runtime.registerResourceModule("snowflake", "index/function", _module)
pulumi.runtime.registerResourceModule("snowflake", "index/functionGrant", _module)
pulumi.runtime.registerResourceModule("snowflake", "index/integrationGrant", _module)
pulumi.runtime.registerResourceModule("snowflake", "index/managedAccount", _module)
pulumi.runtime.registerResourceModule("snowflake", "index/maskingPolicy", _module)
pulumi.runtime.registerResourceModule("snowflake", "index/maskingPolicyGrant", _module)
pulumi.runtime.registerResourceModule("snowflake", "index/materializedView", _module)
pulumi.runtime.registerResourceModule("snowflake", "index/materializedViewGrant", _module)
pulumi.runtime.registerResourceModule("snowflake", "index/networkPolicy", _module)
pulumi.runtime.registerResourceModule("snowflake", "index/networkPolicyAttachment", _module)
pulumi.runtime.registerResourceModule("snowflake", "index/notificationIntegration", _module)
pulumi.runtime.registerResourceModule("snowflake", "index/oauthIntegration", _module)
pulumi.runtime.registerResourceModule("snowflake", "index/pipe", _module)
pulumi.runtime.registerResourceModule("snowflake", "index/pipeGrant", _module)
pulumi.runtime.registerResourceModule("snowflake", "index/procedure", _module)
pulumi.runtime.registerResourceModule("snowflake", "index/procedureGrant", _module)
pulumi.runtime.registerResourceModule("snowflake", "index/resourceMonitor", _module)
pulumi.runtime.registerResourceModule("snowflake", "index/resourceMonitorGrant", _module)
pulumi.runtime.registerResourceModule("snowflake", "index/role", _module)
pulumi.runtime.registerResourceModule("snowflake", "index/roleGrants", _module)
pulumi.runtime.registerResourceModule("snowflake", "index/roleOwnershipGrant", _module)
pulumi.runtime.registerResourceModule("snowflake", "index/rowAccessPolicy", _module)
pulumi.runtime.registerResourceModule("snowflake", "index/rowAccessPolicyGrant", _module)
pulumi.runtime.registerResourceModule("snowflake", "index/samlIntegration", _module)
pulumi.runtime.registerResourceModule("snowflake", "index/schema", _module)
pulumi.runtime.registerResourceModule("snowflake", "index/schemaGrant", _module)
pulumi.runtime.registerResourceModule("snowflake", "index/scimIntegration", _module)
pulumi.runtime.registerResourceModule("snowflake", "index/sequence", _module)
pulumi.runtime.registerResourceModule("snowflake", "index/sequenceGrant", _module)
pulumi.runtime.registerResourceModule("snowflake", "index/share", _module)
pulumi.runtime.registerResourceModule("snowflake", "index/stage", _module)
pulumi.runtime.registerResourceModule("snowflake", "index/stageGrant", _module)
pulumi.runtime.registerResourceModule("snowflake", "index/storageIntegration", _module)
pulumi.runtime.registerResourceModule("snowflake", "index/stream", _module)
pulumi.runtime.registerResourceModule("snowflake", "index/streamGrant", _module)
pulumi.runtime.registerResourceModule("snowflake", "index/table", _module)
pulumi.runtime.registerResourceModule("snowflake", "index/tableGrant", _module)
pulumi.runtime.registerResourceModule("snowflake", "index/tag", _module)
pulumi.runtime.registerResourceModule("snowflake", "index/tagGrant", _module)
pulumi.runtime.registerResourceModule("snowflake", "index/task", _module)
pulumi.runtime.registerResourceModule("snowflake", "index/taskGrant", _module)
pulumi.runtime.registerResourceModule("snowflake", "index/user", _module)
pulumi.runtime.registerResourceModule("snowflake", "index/userOwnershipGrant", _module)
pulumi.runtime.registerResourceModule("snowflake", "index/userPublicKeys", _module)
pulumi.runtime.registerResourceModule("snowflake", "index/view", _module)
pulumi.runtime.registerResourceModule("snowflake", "index/viewGrant", _module)
pulumi.runtime.registerResourceModule("snowflake", "index/warehouse", _module)
pulumi.runtime.registerResourceModule("snowflake", "index/warehouseGrant", _module)

import { Provider } from "./provider";

pulumi.runtime.registerResourcePackage("snowflake", {
    version: utilities.getVersion(),
    constructProvider: (name: string, type: string, urn: string): pulumi.ProviderResource => {
        if (type !== "pulumi:providers:snowflake") {
            throw new Error(`unknown provider type ${type}`);
        }
        return new Provider(name, <any>undefined, { urn });
    },
});
