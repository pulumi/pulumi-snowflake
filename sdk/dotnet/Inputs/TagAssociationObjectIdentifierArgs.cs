// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake.Inputs
{

    public sealed class TagAssociationObjectIdentifierArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of the database that the object was created in.
        /// </summary>
        [Input("database")]
        public Input<string>? Database { get; set; }

        /// <summary>
        /// Name of the object to associate the tag with.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// Name of the schema that the object was created in.
        /// </summary>
        [Input("schema")]
        public Input<string>? Schema { get; set; }

        public TagAssociationObjectIdentifierArgs()
        {
        }
        public static new TagAssociationObjectIdentifierArgs Empty => new TagAssociationObjectIdentifierArgs();
    }
}
