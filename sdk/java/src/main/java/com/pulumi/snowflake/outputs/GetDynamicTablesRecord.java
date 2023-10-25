// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDynamicTablesRecord {
    private Boolean automaticClustering;
    private Integer bytes;
    private String clusterBy;
    private String comment;
    private String createdOn;
    private String dataTimestamp;
    private String databaseName;
    private Boolean isClone;
    private Boolean isReplica;
    private String lastSuspendedOn;
    private String name;
    private String owner;
    private String refreshMode;
    private String refreshModeReason;
    private Integer rows;
    private String schedulingState;
    private String schemaName;
    private String targetLag;
    private String text;
    private String warehouse;

    private GetDynamicTablesRecord() {}
    public Boolean automaticClustering() {
        return this.automaticClustering;
    }
    public Integer bytes() {
        return this.bytes;
    }
    public String clusterBy() {
        return this.clusterBy;
    }
    public String comment() {
        return this.comment;
    }
    public String createdOn() {
        return this.createdOn;
    }
    public String dataTimestamp() {
        return this.dataTimestamp;
    }
    public String databaseName() {
        return this.databaseName;
    }
    public Boolean isClone() {
        return this.isClone;
    }
    public Boolean isReplica() {
        return this.isReplica;
    }
    public String lastSuspendedOn() {
        return this.lastSuspendedOn;
    }
    public String name() {
        return this.name;
    }
    public String owner() {
        return this.owner;
    }
    public String refreshMode() {
        return this.refreshMode;
    }
    public String refreshModeReason() {
        return this.refreshModeReason;
    }
    public Integer rows() {
        return this.rows;
    }
    public String schedulingState() {
        return this.schedulingState;
    }
    public String schemaName() {
        return this.schemaName;
    }
    public String targetLag() {
        return this.targetLag;
    }
    public String text() {
        return this.text;
    }
    public String warehouse() {
        return this.warehouse;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDynamicTablesRecord defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean automaticClustering;
        private Integer bytes;
        private String clusterBy;
        private String comment;
        private String createdOn;
        private String dataTimestamp;
        private String databaseName;
        private Boolean isClone;
        private Boolean isReplica;
        private String lastSuspendedOn;
        private String name;
        private String owner;
        private String refreshMode;
        private String refreshModeReason;
        private Integer rows;
        private String schedulingState;
        private String schemaName;
        private String targetLag;
        private String text;
        private String warehouse;
        public Builder() {}
        public Builder(GetDynamicTablesRecord defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automaticClustering = defaults.automaticClustering;
    	      this.bytes = defaults.bytes;
    	      this.clusterBy = defaults.clusterBy;
    	      this.comment = defaults.comment;
    	      this.createdOn = defaults.createdOn;
    	      this.dataTimestamp = defaults.dataTimestamp;
    	      this.databaseName = defaults.databaseName;
    	      this.isClone = defaults.isClone;
    	      this.isReplica = defaults.isReplica;
    	      this.lastSuspendedOn = defaults.lastSuspendedOn;
    	      this.name = defaults.name;
    	      this.owner = defaults.owner;
    	      this.refreshMode = defaults.refreshMode;
    	      this.refreshModeReason = defaults.refreshModeReason;
    	      this.rows = defaults.rows;
    	      this.schedulingState = defaults.schedulingState;
    	      this.schemaName = defaults.schemaName;
    	      this.targetLag = defaults.targetLag;
    	      this.text = defaults.text;
    	      this.warehouse = defaults.warehouse;
        }

        @CustomType.Setter
        public Builder automaticClustering(Boolean automaticClustering) {
            this.automaticClustering = Objects.requireNonNull(automaticClustering);
            return this;
        }
        @CustomType.Setter
        public Builder bytes(Integer bytes) {
            this.bytes = Objects.requireNonNull(bytes);
            return this;
        }
        @CustomType.Setter
        public Builder clusterBy(String clusterBy) {
            this.clusterBy = Objects.requireNonNull(clusterBy);
            return this;
        }
        @CustomType.Setter
        public Builder comment(String comment) {
            this.comment = Objects.requireNonNull(comment);
            return this;
        }
        @CustomType.Setter
        public Builder createdOn(String createdOn) {
            this.createdOn = Objects.requireNonNull(createdOn);
            return this;
        }
        @CustomType.Setter
        public Builder dataTimestamp(String dataTimestamp) {
            this.dataTimestamp = Objects.requireNonNull(dataTimestamp);
            return this;
        }
        @CustomType.Setter
        public Builder databaseName(String databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }
        @CustomType.Setter
        public Builder isClone(Boolean isClone) {
            this.isClone = Objects.requireNonNull(isClone);
            return this;
        }
        @CustomType.Setter
        public Builder isReplica(Boolean isReplica) {
            this.isReplica = Objects.requireNonNull(isReplica);
            return this;
        }
        @CustomType.Setter
        public Builder lastSuspendedOn(String lastSuspendedOn) {
            this.lastSuspendedOn = Objects.requireNonNull(lastSuspendedOn);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder owner(String owner) {
            this.owner = Objects.requireNonNull(owner);
            return this;
        }
        @CustomType.Setter
        public Builder refreshMode(String refreshMode) {
            this.refreshMode = Objects.requireNonNull(refreshMode);
            return this;
        }
        @CustomType.Setter
        public Builder refreshModeReason(String refreshModeReason) {
            this.refreshModeReason = Objects.requireNonNull(refreshModeReason);
            return this;
        }
        @CustomType.Setter
        public Builder rows(Integer rows) {
            this.rows = Objects.requireNonNull(rows);
            return this;
        }
        @CustomType.Setter
        public Builder schedulingState(String schedulingState) {
            this.schedulingState = Objects.requireNonNull(schedulingState);
            return this;
        }
        @CustomType.Setter
        public Builder schemaName(String schemaName) {
            this.schemaName = Objects.requireNonNull(schemaName);
            return this;
        }
        @CustomType.Setter
        public Builder targetLag(String targetLag) {
            this.targetLag = Objects.requireNonNull(targetLag);
            return this;
        }
        @CustomType.Setter
        public Builder text(String text) {
            this.text = Objects.requireNonNull(text);
            return this;
        }
        @CustomType.Setter
        public Builder warehouse(String warehouse) {
            this.warehouse = Objects.requireNonNull(warehouse);
            return this;
        }
        public GetDynamicTablesRecord build() {
            final var o = new GetDynamicTablesRecord();
            o.automaticClustering = automaticClustering;
            o.bytes = bytes;
            o.clusterBy = clusterBy;
            o.comment = comment;
            o.createdOn = createdOn;
            o.dataTimestamp = dataTimestamp;
            o.databaseName = databaseName;
            o.isClone = isClone;
            o.isReplica = isReplica;
            o.lastSuspendedOn = lastSuspendedOn;
            o.name = name;
            o.owner = owner;
            o.refreshMode = refreshMode;
            o.refreshModeReason = refreshModeReason;
            o.rows = rows;
            o.schedulingState = schedulingState;
            o.schemaName = schemaName;
            o.targetLag = targetLag;
            o.text = text;
            o.warehouse = warehouse;
            return o;
        }
    }
}
