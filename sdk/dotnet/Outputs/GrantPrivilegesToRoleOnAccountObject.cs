// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake.Outputs
{

    [OutputType]
    public sealed class GrantPrivilegesToRoleOnAccountObject
    {
        /// <summary>
        /// The fully qualified name of the object on which privileges will be granted.
        /// </summary>
        public readonly string ObjectName;
        /// <summary>
        /// The object type of the account object on which privileges will be granted. Valid values are: USER | RESOURCE MONITOR | WAREHOUSE | DATABASE | INTEGRATION | FAILOVER GROUP | REPLICATION GROUP | EXTERNAL VOLUME
        /// </summary>
        public readonly string ObjectType;

        [OutputConstructor]
        private GrantPrivilegesToRoleOnAccountObject(
            string objectName,

            string objectType)
        {
            ObjectName = objectName;
            ObjectType = objectType;
        }
    }
}
