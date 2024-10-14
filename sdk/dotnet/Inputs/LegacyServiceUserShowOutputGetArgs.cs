// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake.Inputs
{

    public sealed class LegacyServiceUserShowOutputGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        [Input("createdOn")]
        public Input<string>? CreatedOn { get; set; }

        [Input("daysToExpiry")]
        public Input<string>? DaysToExpiry { get; set; }

        [Input("defaultNamespace")]
        public Input<string>? DefaultNamespace { get; set; }

        [Input("defaultRole")]
        public Input<string>? DefaultRole { get; set; }

        [Input("defaultSecondaryRoles")]
        public Input<string>? DefaultSecondaryRoles { get; set; }

        [Input("defaultWarehouse")]
        public Input<string>? DefaultWarehouse { get; set; }

        [Input("disabled")]
        public Input<bool>? Disabled { get; set; }

        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        [Input("email")]
        private Input<string>? _email;
        public Input<string>? Email
        {
            get => _email;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _email = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("expiresAtTime")]
        public Input<string>? ExpiresAtTime { get; set; }

        [Input("extAuthnDuo")]
        public Input<bool>? ExtAuthnDuo { get; set; }

        [Input("extAuthnUid")]
        public Input<string>? ExtAuthnUid { get; set; }

        [Input("firstName")]
        private Input<string>? _firstName;
        public Input<string>? FirstName
        {
            get => _firstName;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _firstName = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("hasMfa")]
        public Input<bool>? HasMfa { get; set; }

        [Input("hasPassword")]
        public Input<bool>? HasPassword { get; set; }

        [Input("hasRsaPublicKey")]
        public Input<bool>? HasRsaPublicKey { get; set; }

        [Input("lastName")]
        private Input<string>? _lastName;
        public Input<string>? LastName
        {
            get => _lastName;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _lastName = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("lastSuccessLogin")]
        public Input<string>? LastSuccessLogin { get; set; }

        [Input("lockedUntilTime")]
        public Input<string>? LockedUntilTime { get; set; }

        [Input("loginName")]
        private Input<string>? _loginName;
        public Input<string>? LoginName
        {
            get => _loginName;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _loginName = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("minsToBypassMfa")]
        public Input<string>? MinsToBypassMfa { get; set; }

        [Input("minsToUnlock")]
        public Input<string>? MinsToUnlock { get; set; }

        [Input("mustChangePassword")]
        public Input<bool>? MustChangePassword { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("owner")]
        public Input<string>? Owner { get; set; }

        [Input("snowflakeLock")]
        public Input<bool>? SnowflakeLock { get; set; }

        [Input("type")]
        public Input<string>? Type { get; set; }

        public LegacyServiceUserShowOutputGetArgs()
        {
        }
        public static new LegacyServiceUserShowOutputGetArgs Empty => new LegacyServiceUserShowOutputGetArgs();
    }
}
