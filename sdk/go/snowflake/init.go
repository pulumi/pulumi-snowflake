// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package snowflake

import (
	"fmt"

	"github.com/blang/semver"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type module struct {
	version semver.Version
}

func (m *module) Version() semver.Version {
	return m.version
}

func (m *module) Construct(ctx *pulumi.Context, name, typ, urn string) (r pulumi.Resource, err error) {
	switch typ {
	case "snowflake:index/account:Account":
		r = &Account{}
	case "snowflake:index/accountGrant:AccountGrant":
		r = &AccountGrant{}
	case "snowflake:index/accountParameter:AccountParameter":
		r = &AccountParameter{}
	case "snowflake:index/alert:Alert":
		r = &Alert{}
	case "snowflake:index/apiIntegration:ApiIntegration":
		r = &ApiIntegration{}
	case "snowflake:index/database:Database":
		r = &Database{}
	case "snowflake:index/databaseGrant:DatabaseGrant":
		r = &DatabaseGrant{}
	case "snowflake:index/databaseRole:DatabaseRole":
		r = &DatabaseRole{}
	case "snowflake:index/emailNotificationIntegration:EmailNotificationIntegration":
		r = &EmailNotificationIntegration{}
	case "snowflake:index/externalFunction:ExternalFunction":
		r = &ExternalFunction{}
	case "snowflake:index/externalOauthIntegration:ExternalOauthIntegration":
		r = &ExternalOauthIntegration{}
	case "snowflake:index/externalTable:ExternalTable":
		r = &ExternalTable{}
	case "snowflake:index/externalTableGrant:ExternalTableGrant":
		r = &ExternalTableGrant{}
	case "snowflake:index/failoverGroup:FailoverGroup":
		r = &FailoverGroup{}
	case "snowflake:index/fileFormat:FileFormat":
		r = &FileFormat{}
	case "snowflake:index/fileFormatGrant:FileFormatGrant":
		r = &FileFormatGrant{}
	case "snowflake:index/function:Function":
		r = &Function{}
	case "snowflake:index/functionGrant:FunctionGrant":
		r = &FunctionGrant{}
	case "snowflake:index/integrationGrant:IntegrationGrant":
		r = &IntegrationGrant{}
	case "snowflake:index/managedAccount:ManagedAccount":
		r = &ManagedAccount{}
	case "snowflake:index/maskingPolicy:MaskingPolicy":
		r = &MaskingPolicy{}
	case "snowflake:index/maskingPolicyGrant:MaskingPolicyGrant":
		r = &MaskingPolicyGrant{}
	case "snowflake:index/materializedView:MaterializedView":
		r = &MaterializedView{}
	case "snowflake:index/materializedViewGrant:MaterializedViewGrant":
		r = &MaterializedViewGrant{}
	case "snowflake:index/networkPolicy:NetworkPolicy":
		r = &NetworkPolicy{}
	case "snowflake:index/networkPolicyAttachment:NetworkPolicyAttachment":
		r = &NetworkPolicyAttachment{}
	case "snowflake:index/notificationIntegration:NotificationIntegration":
		r = &NotificationIntegration{}
	case "snowflake:index/oauthIntegration:OauthIntegration":
		r = &OauthIntegration{}
	case "snowflake:index/objectParameter:ObjectParameter":
		r = &ObjectParameter{}
	case "snowflake:index/passwordPolicy:PasswordPolicy":
		r = &PasswordPolicy{}
	case "snowflake:index/pipe:Pipe":
		r = &Pipe{}
	case "snowflake:index/pipeGrant:PipeGrant":
		r = &PipeGrant{}
	case "snowflake:index/procedure:Procedure":
		r = &Procedure{}
	case "snowflake:index/procedureGrant:ProcedureGrant":
		r = &ProcedureGrant{}
	case "snowflake:index/resourceMonitor:ResourceMonitor":
		r = &ResourceMonitor{}
	case "snowflake:index/resourceMonitorGrant:ResourceMonitorGrant":
		r = &ResourceMonitorGrant{}
	case "snowflake:index/role:Role":
		r = &Role{}
	case "snowflake:index/roleGrants:RoleGrants":
		r = &RoleGrants{}
	case "snowflake:index/roleOwnershipGrant:RoleOwnershipGrant":
		r = &RoleOwnershipGrant{}
	case "snowflake:index/rowAccessPolicy:RowAccessPolicy":
		r = &RowAccessPolicy{}
	case "snowflake:index/rowAccessPolicyGrant:RowAccessPolicyGrant":
		r = &RowAccessPolicyGrant{}
	case "snowflake:index/samlIntegration:SamlIntegration":
		r = &SamlIntegration{}
	case "snowflake:index/schema:Schema":
		r = &Schema{}
	case "snowflake:index/schemaGrant:SchemaGrant":
		r = &SchemaGrant{}
	case "snowflake:index/scimIntegration:ScimIntegration":
		r = &ScimIntegration{}
	case "snowflake:index/sequence:Sequence":
		r = &Sequence{}
	case "snowflake:index/sequenceGrant:SequenceGrant":
		r = &SequenceGrant{}
	case "snowflake:index/sessionParameter:SessionParameter":
		r = &SessionParameter{}
	case "snowflake:index/share:Share":
		r = &Share{}
	case "snowflake:index/stage:Stage":
		r = &Stage{}
	case "snowflake:index/stageGrant:StageGrant":
		r = &StageGrant{}
	case "snowflake:index/storageIntegration:StorageIntegration":
		r = &StorageIntegration{}
	case "snowflake:index/stream:Stream":
		r = &Stream{}
	case "snowflake:index/streamGrant:StreamGrant":
		r = &StreamGrant{}
	case "snowflake:index/table:Table":
		r = &Table{}
	case "snowflake:index/tableColumnMaskingPolicyApplication:TableColumnMaskingPolicyApplication":
		r = &TableColumnMaskingPolicyApplication{}
	case "snowflake:index/tableConstraint:TableConstraint":
		r = &TableConstraint{}
	case "snowflake:index/tableGrant:TableGrant":
		r = &TableGrant{}
	case "snowflake:index/tag:Tag":
		r = &Tag{}
	case "snowflake:index/tagAssociation:TagAssociation":
		r = &TagAssociation{}
	case "snowflake:index/tagGrant:TagGrant":
		r = &TagGrant{}
	case "snowflake:index/tagMaskingPolicyAssociation:TagMaskingPolicyAssociation":
		r = &TagMaskingPolicyAssociation{}
	case "snowflake:index/task:Task":
		r = &Task{}
	case "snowflake:index/taskGrant:TaskGrant":
		r = &TaskGrant{}
	case "snowflake:index/user:User":
		r = &User{}
	case "snowflake:index/userGrant:UserGrant":
		r = &UserGrant{}
	case "snowflake:index/userOwnershipGrant:UserOwnershipGrant":
		r = &UserOwnershipGrant{}
	case "snowflake:index/userPublicKeys:UserPublicKeys":
		r = &UserPublicKeys{}
	case "snowflake:index/view:View":
		r = &View{}
	case "snowflake:index/viewGrant:ViewGrant":
		r = &ViewGrant{}
	case "snowflake:index/warehouse:Warehouse":
		r = &Warehouse{}
	case "snowflake:index/warehouseGrant:WarehouseGrant":
		r = &WarehouseGrant{}
	default:
		return nil, fmt.Errorf("unknown resource type: %s", typ)
	}

	err = ctx.RegisterResource(typ, name, nil, r, pulumi.URN_(urn))
	return
}

type pkg struct {
	version semver.Version
}

func (p *pkg) Version() semver.Version {
	return p.version
}

func (p *pkg) ConstructProvider(ctx *pulumi.Context, name, typ, urn string) (pulumi.ProviderResource, error) {
	if typ != "pulumi:providers:snowflake" {
		return nil, fmt.Errorf("unknown provider type: %s", typ)
	}

	r := &Provider{}
	err := ctx.RegisterResource(typ, name, nil, r, pulumi.URN_(urn))
	return r, err
}

func init() {
	version, _ := PkgVersion()
	pulumi.RegisterResourceModule(
		"snowflake",
		"index/account",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"snowflake",
		"index/accountGrant",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"snowflake",
		"index/accountParameter",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"snowflake",
		"index/alert",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"snowflake",
		"index/apiIntegration",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"snowflake",
		"index/database",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"snowflake",
		"index/databaseGrant",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"snowflake",
		"index/databaseRole",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"snowflake",
		"index/emailNotificationIntegration",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"snowflake",
		"index/externalFunction",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"snowflake",
		"index/externalOauthIntegration",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"snowflake",
		"index/externalTable",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"snowflake",
		"index/externalTableGrant",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"snowflake",
		"index/failoverGroup",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"snowflake",
		"index/fileFormat",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"snowflake",
		"index/fileFormatGrant",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"snowflake",
		"index/function",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"snowflake",
		"index/functionGrant",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"snowflake",
		"index/integrationGrant",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"snowflake",
		"index/managedAccount",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"snowflake",
		"index/maskingPolicy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"snowflake",
		"index/maskingPolicyGrant",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"snowflake",
		"index/materializedView",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"snowflake",
		"index/materializedViewGrant",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"snowflake",
		"index/networkPolicy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"snowflake",
		"index/networkPolicyAttachment",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"snowflake",
		"index/notificationIntegration",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"snowflake",
		"index/oauthIntegration",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"snowflake",
		"index/objectParameter",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"snowflake",
		"index/passwordPolicy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"snowflake",
		"index/pipe",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"snowflake",
		"index/pipeGrant",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"snowflake",
		"index/procedure",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"snowflake",
		"index/procedureGrant",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"snowflake",
		"index/resourceMonitor",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"snowflake",
		"index/resourceMonitorGrant",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"snowflake",
		"index/role",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"snowflake",
		"index/roleGrants",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"snowflake",
		"index/roleOwnershipGrant",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"snowflake",
		"index/rowAccessPolicy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"snowflake",
		"index/rowAccessPolicyGrant",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"snowflake",
		"index/samlIntegration",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"snowflake",
		"index/schema",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"snowflake",
		"index/schemaGrant",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"snowflake",
		"index/scimIntegration",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"snowflake",
		"index/sequence",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"snowflake",
		"index/sequenceGrant",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"snowflake",
		"index/sessionParameter",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"snowflake",
		"index/share",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"snowflake",
		"index/stage",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"snowflake",
		"index/stageGrant",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"snowflake",
		"index/storageIntegration",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"snowflake",
		"index/stream",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"snowflake",
		"index/streamGrant",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"snowflake",
		"index/table",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"snowflake",
		"index/tableColumnMaskingPolicyApplication",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"snowflake",
		"index/tableConstraint",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"snowflake",
		"index/tableGrant",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"snowflake",
		"index/tag",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"snowflake",
		"index/tagAssociation",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"snowflake",
		"index/tagGrant",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"snowflake",
		"index/tagMaskingPolicyAssociation",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"snowflake",
		"index/task",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"snowflake",
		"index/taskGrant",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"snowflake",
		"index/user",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"snowflake",
		"index/userGrant",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"snowflake",
		"index/userOwnershipGrant",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"snowflake",
		"index/userPublicKeys",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"snowflake",
		"index/view",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"snowflake",
		"index/viewGrant",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"snowflake",
		"index/warehouse",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"snowflake",
		"index/warehouseGrant",
		&module{version},
	)
	pulumi.RegisterResourcePackage(
		"snowflake",
		&pkg{version},
	)
}
