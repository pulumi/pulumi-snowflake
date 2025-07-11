// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake.Inputs
{

    public sealed class TaskShowOutputArgs : global::Pulumi.ResourceArgs
    {
        [Input("allowOverlappingExecution")]
        public Input<bool>? AllowOverlappingExecution { get; set; }

        [Input("budget")]
        public Input<string>? Budget { get; set; }

        [Input("comment")]
        public Input<string>? Comment { get; set; }

        [Input("condition")]
        public Input<string>? Condition { get; set; }

        [Input("config")]
        public Input<string>? Config { get; set; }

        [Input("createdOn")]
        public Input<string>? CreatedOn { get; set; }

        [Input("databaseName")]
        public Input<string>? DatabaseName { get; set; }

        [Input("definition")]
        public Input<string>? Definition { get; set; }

        [Input("errorIntegration")]
        public Input<string>? ErrorIntegration { get; set; }

        [Input("id")]
        public Input<string>? Id { get; set; }

        [Input("lastCommittedOn")]
        public Input<string>? LastCommittedOn { get; set; }

        [Input("lastSuspendedOn")]
        public Input<string>? LastSuspendedOn { get; set; }

        [Input("lastSuspendedReason")]
        public Input<string>? LastSuspendedReason { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("owner")]
        public Input<string>? Owner { get; set; }

        [Input("ownerRoleType")]
        public Input<string>? OwnerRoleType { get; set; }

        [Input("predecessors")]
        private InputList<string>? _predecessors;
        public InputList<string> Predecessors
        {
            get => _predecessors ?? (_predecessors = new InputList<string>());
            set => _predecessors = value;
        }

        [Input("schedule")]
        public Input<string>? Schedule { get; set; }

        [Input("schemaName")]
        public Input<string>? SchemaName { get; set; }

        [Input("state")]
        public Input<string>? State { get; set; }

        [Input("taskRelations")]
        private InputList<Inputs.TaskShowOutputTaskRelationArgs>? _taskRelations;
        public InputList<Inputs.TaskShowOutputTaskRelationArgs> TaskRelations
        {
            get => _taskRelations ?? (_taskRelations = new InputList<Inputs.TaskShowOutputTaskRelationArgs>());
            set => _taskRelations = value;
        }

        [Input("warehouse")]
        public Input<string>? Warehouse { get; set; }

        public TaskShowOutputArgs()
        {
        }
        public static new TaskShowOutputArgs Empty => new TaskShowOutputArgs();
    }
}
