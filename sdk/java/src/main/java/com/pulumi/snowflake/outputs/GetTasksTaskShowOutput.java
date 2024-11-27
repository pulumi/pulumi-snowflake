// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.snowflake.outputs.GetTasksTaskShowOutputTaskRelation;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetTasksTaskShowOutput {
    private Boolean allowOverlappingExecution;
    private String budget;
    private String comment;
    private String condition;
    private String config;
    private String createdOn;
    private String databaseName;
    private String definition;
    private String errorIntegration;
    private String id;
    private String lastCommittedOn;
    private String lastSuspendedOn;
    private String lastSuspendedReason;
    private String name;
    private String owner;
    private String ownerRoleType;
    private List<String> predecessors;
    private String schedule;
    private String schemaName;
    private String state;
    private List<GetTasksTaskShowOutputTaskRelation> taskRelations;
    private String warehouse;

    private GetTasksTaskShowOutput() {}
    public Boolean allowOverlappingExecution() {
        return this.allowOverlappingExecution;
    }
    public String budget() {
        return this.budget;
    }
    public String comment() {
        return this.comment;
    }
    public String condition() {
        return this.condition;
    }
    public String config() {
        return this.config;
    }
    public String createdOn() {
        return this.createdOn;
    }
    public String databaseName() {
        return this.databaseName;
    }
    public String definition() {
        return this.definition;
    }
    public String errorIntegration() {
        return this.errorIntegration;
    }
    public String id() {
        return this.id;
    }
    public String lastCommittedOn() {
        return this.lastCommittedOn;
    }
    public String lastSuspendedOn() {
        return this.lastSuspendedOn;
    }
    public String lastSuspendedReason() {
        return this.lastSuspendedReason;
    }
    public String name() {
        return this.name;
    }
    public String owner() {
        return this.owner;
    }
    public String ownerRoleType() {
        return this.ownerRoleType;
    }
    public List<String> predecessors() {
        return this.predecessors;
    }
    public String schedule() {
        return this.schedule;
    }
    public String schemaName() {
        return this.schemaName;
    }
    public String state() {
        return this.state;
    }
    public List<GetTasksTaskShowOutputTaskRelation> taskRelations() {
        return this.taskRelations;
    }
    public String warehouse() {
        return this.warehouse;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTasksTaskShowOutput defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean allowOverlappingExecution;
        private String budget;
        private String comment;
        private String condition;
        private String config;
        private String createdOn;
        private String databaseName;
        private String definition;
        private String errorIntegration;
        private String id;
        private String lastCommittedOn;
        private String lastSuspendedOn;
        private String lastSuspendedReason;
        private String name;
        private String owner;
        private String ownerRoleType;
        private List<String> predecessors;
        private String schedule;
        private String schemaName;
        private String state;
        private List<GetTasksTaskShowOutputTaskRelation> taskRelations;
        private String warehouse;
        public Builder() {}
        public Builder(GetTasksTaskShowOutput defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowOverlappingExecution = defaults.allowOverlappingExecution;
    	      this.budget = defaults.budget;
    	      this.comment = defaults.comment;
    	      this.condition = defaults.condition;
    	      this.config = defaults.config;
    	      this.createdOn = defaults.createdOn;
    	      this.databaseName = defaults.databaseName;
    	      this.definition = defaults.definition;
    	      this.errorIntegration = defaults.errorIntegration;
    	      this.id = defaults.id;
    	      this.lastCommittedOn = defaults.lastCommittedOn;
    	      this.lastSuspendedOn = defaults.lastSuspendedOn;
    	      this.lastSuspendedReason = defaults.lastSuspendedReason;
    	      this.name = defaults.name;
    	      this.owner = defaults.owner;
    	      this.ownerRoleType = defaults.ownerRoleType;
    	      this.predecessors = defaults.predecessors;
    	      this.schedule = defaults.schedule;
    	      this.schemaName = defaults.schemaName;
    	      this.state = defaults.state;
    	      this.taskRelations = defaults.taskRelations;
    	      this.warehouse = defaults.warehouse;
        }

        @CustomType.Setter
        public Builder allowOverlappingExecution(Boolean allowOverlappingExecution) {
            if (allowOverlappingExecution == null) {
              throw new MissingRequiredPropertyException("GetTasksTaskShowOutput", "allowOverlappingExecution");
            }
            this.allowOverlappingExecution = allowOverlappingExecution;
            return this;
        }
        @CustomType.Setter
        public Builder budget(String budget) {
            if (budget == null) {
              throw new MissingRequiredPropertyException("GetTasksTaskShowOutput", "budget");
            }
            this.budget = budget;
            return this;
        }
        @CustomType.Setter
        public Builder comment(String comment) {
            if (comment == null) {
              throw new MissingRequiredPropertyException("GetTasksTaskShowOutput", "comment");
            }
            this.comment = comment;
            return this;
        }
        @CustomType.Setter
        public Builder condition(String condition) {
            if (condition == null) {
              throw new MissingRequiredPropertyException("GetTasksTaskShowOutput", "condition");
            }
            this.condition = condition;
            return this;
        }
        @CustomType.Setter
        public Builder config(String config) {
            if (config == null) {
              throw new MissingRequiredPropertyException("GetTasksTaskShowOutput", "config");
            }
            this.config = config;
            return this;
        }
        @CustomType.Setter
        public Builder createdOn(String createdOn) {
            if (createdOn == null) {
              throw new MissingRequiredPropertyException("GetTasksTaskShowOutput", "createdOn");
            }
            this.createdOn = createdOn;
            return this;
        }
        @CustomType.Setter
        public Builder databaseName(String databaseName) {
            if (databaseName == null) {
              throw new MissingRequiredPropertyException("GetTasksTaskShowOutput", "databaseName");
            }
            this.databaseName = databaseName;
            return this;
        }
        @CustomType.Setter
        public Builder definition(String definition) {
            if (definition == null) {
              throw new MissingRequiredPropertyException("GetTasksTaskShowOutput", "definition");
            }
            this.definition = definition;
            return this;
        }
        @CustomType.Setter
        public Builder errorIntegration(String errorIntegration) {
            if (errorIntegration == null) {
              throw new MissingRequiredPropertyException("GetTasksTaskShowOutput", "errorIntegration");
            }
            this.errorIntegration = errorIntegration;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetTasksTaskShowOutput", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder lastCommittedOn(String lastCommittedOn) {
            if (lastCommittedOn == null) {
              throw new MissingRequiredPropertyException("GetTasksTaskShowOutput", "lastCommittedOn");
            }
            this.lastCommittedOn = lastCommittedOn;
            return this;
        }
        @CustomType.Setter
        public Builder lastSuspendedOn(String lastSuspendedOn) {
            if (lastSuspendedOn == null) {
              throw new MissingRequiredPropertyException("GetTasksTaskShowOutput", "lastSuspendedOn");
            }
            this.lastSuspendedOn = lastSuspendedOn;
            return this;
        }
        @CustomType.Setter
        public Builder lastSuspendedReason(String lastSuspendedReason) {
            if (lastSuspendedReason == null) {
              throw new MissingRequiredPropertyException("GetTasksTaskShowOutput", "lastSuspendedReason");
            }
            this.lastSuspendedReason = lastSuspendedReason;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetTasksTaskShowOutput", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder owner(String owner) {
            if (owner == null) {
              throw new MissingRequiredPropertyException("GetTasksTaskShowOutput", "owner");
            }
            this.owner = owner;
            return this;
        }
        @CustomType.Setter
        public Builder ownerRoleType(String ownerRoleType) {
            if (ownerRoleType == null) {
              throw new MissingRequiredPropertyException("GetTasksTaskShowOutput", "ownerRoleType");
            }
            this.ownerRoleType = ownerRoleType;
            return this;
        }
        @CustomType.Setter
        public Builder predecessors(List<String> predecessors) {
            if (predecessors == null) {
              throw new MissingRequiredPropertyException("GetTasksTaskShowOutput", "predecessors");
            }
            this.predecessors = predecessors;
            return this;
        }
        public Builder predecessors(String... predecessors) {
            return predecessors(List.of(predecessors));
        }
        @CustomType.Setter
        public Builder schedule(String schedule) {
            if (schedule == null) {
              throw new MissingRequiredPropertyException("GetTasksTaskShowOutput", "schedule");
            }
            this.schedule = schedule;
            return this;
        }
        @CustomType.Setter
        public Builder schemaName(String schemaName) {
            if (schemaName == null) {
              throw new MissingRequiredPropertyException("GetTasksTaskShowOutput", "schemaName");
            }
            this.schemaName = schemaName;
            return this;
        }
        @CustomType.Setter
        public Builder state(String state) {
            if (state == null) {
              throw new MissingRequiredPropertyException("GetTasksTaskShowOutput", "state");
            }
            this.state = state;
            return this;
        }
        @CustomType.Setter
        public Builder taskRelations(List<GetTasksTaskShowOutputTaskRelation> taskRelations) {
            if (taskRelations == null) {
              throw new MissingRequiredPropertyException("GetTasksTaskShowOutput", "taskRelations");
            }
            this.taskRelations = taskRelations;
            return this;
        }
        public Builder taskRelations(GetTasksTaskShowOutputTaskRelation... taskRelations) {
            return taskRelations(List.of(taskRelations));
        }
        @CustomType.Setter
        public Builder warehouse(String warehouse) {
            if (warehouse == null) {
              throw new MissingRequiredPropertyException("GetTasksTaskShowOutput", "warehouse");
            }
            this.warehouse = warehouse;
            return this;
        }
        public GetTasksTaskShowOutput build() {
            final var _resultValue = new GetTasksTaskShowOutput();
            _resultValue.allowOverlappingExecution = allowOverlappingExecution;
            _resultValue.budget = budget;
            _resultValue.comment = comment;
            _resultValue.condition = condition;
            _resultValue.config = config;
            _resultValue.createdOn = createdOn;
            _resultValue.databaseName = databaseName;
            _resultValue.definition = definition;
            _resultValue.errorIntegration = errorIntegration;
            _resultValue.id = id;
            _resultValue.lastCommittedOn = lastCommittedOn;
            _resultValue.lastSuspendedOn = lastSuspendedOn;
            _resultValue.lastSuspendedReason = lastSuspendedReason;
            _resultValue.name = name;
            _resultValue.owner = owner;
            _resultValue.ownerRoleType = ownerRoleType;
            _resultValue.predecessors = predecessors;
            _resultValue.schedule = schedule;
            _resultValue.schemaName = schemaName;
            _resultValue.state = state;
            _resultValue.taskRelations = taskRelations;
            _resultValue.warehouse = warehouse;
            return _resultValue;
        }
    }
}
