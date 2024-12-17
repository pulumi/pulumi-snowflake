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
    public sealed class ProcedureScalaSecret
    {
        /// <summary>
        /// Fully qualified name of the allowed [secret](https://docs.snowflake.com/en/sql-reference/sql/create-secret). You will receive an error if you specify a SECRETS value whose secret isn’t also included in an integration specified by the EXTERNAL*ACCESS*INTEGRATIONS parameter.
        /// </summary>
        public readonly string SecretId;
        /// <summary>
        /// The variable that will be used in handler code when retrieving information from the secret.
        /// </summary>
        public readonly string SecretVariableName;

        [OutputConstructor]
        private ProcedureScalaSecret(
            string secretId,

            string secretVariableName)
        {
            SecretId = secretId;
            SecretVariableName = secretVariableName;
        }
    }
}
