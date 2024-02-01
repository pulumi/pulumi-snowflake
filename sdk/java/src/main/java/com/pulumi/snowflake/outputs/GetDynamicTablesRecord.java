// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDynamicTablesRecord {
    /**
     * @return Whether auto-clustering is enabled on the dynamic table. Not currently supported for dynamic tables.
     * 
     */
    private Boolean automaticClustering;
    /**
     * @return Number of bytes that will be scanned if the entire dynamic table is scanned in a query.
     * 
     */
    private Integer bytes;
    /**
     * @return The clustering key for the dynamic table.
     * 
     */
    private String clusterBy;
    /**
     * @return Comment for the dynamic table.
     * 
     */
    private String comment;
    /**
     * @return Date and time when the dynamic table was created.
     * 
     */
    private String createdOn;
    /**
     * @return Timestamp of the data in the base object(s) that is included in the dynamic table.
     * 
     */
    private String dataTimestamp;
    /**
     * @return Database in which the dynamic table is stored.
     * 
     */
    private String databaseName;
    /**
     * @return TRUE if the dynamic table has been cloned, else FALSE.
     * 
     */
    private Boolean isClone;
    /**
     * @return TRUE if the dynamic table is a replica. else FALSE.
     * 
     */
    private Boolean isReplica;
    /**
     * @return Timestamp of last suspension.
     * 
     */
    private String lastSuspendedOn;
    /**
     * @return Name of the dynamic table.
     * 
     */
    private String name;
    /**
     * @return Role that owns the dynamic table.
     * 
     */
    private String owner;
    /**
     * @return INCREMENTAL if the dynamic table will use incremental refreshes, or FULL if it will recompute the whole table on every refresh.
     * 
     */
    private String refreshMode;
    /**
     * @return Explanation for why FULL refresh mode was chosen. NULL if refresh mode is not FULL.
     * 
     */
    private String refreshModeReason;
    /**
     * @return Number of rows in the table.
     * 
     */
    private Integer rows;
    /**
     * @return Displays RUNNING for dynamic tables that are actively scheduling refreshes and SUSPENDED for suspended dynamic tables.
     * 
     */
    private String schedulingState;
    /**
     * @return Schema in which the dynamic table is stored.
     * 
     */
    private String schemaName;
    /**
     * @return The maximum duration that the dynamic table’s content should lag behind real time.
     * 
     */
    private String targetLag;
    /**
     * @return The text of the command that created this dynamic table (e.g. CREATE DYNAMIC TABLE ...).
     * 
     */
    private String text;
    /**
     * @return Warehouse that provides the required resources to perform the incremental refreshes.
     * 
     */
    private String warehouse;

    private GetDynamicTablesRecord() {}
    /**
     * @return Whether auto-clustering is enabled on the dynamic table. Not currently supported for dynamic tables.
     * 
     */
    public Boolean automaticClustering() {
        return this.automaticClustering;
    }
    /**
     * @return Number of bytes that will be scanned if the entire dynamic table is scanned in a query.
     * 
     */
    public Integer bytes() {
        return this.bytes;
    }
    /**
     * @return The clustering key for the dynamic table.
     * 
     */
    public String clusterBy() {
        return this.clusterBy;
    }
    /**
     * @return Comment for the dynamic table.
     * 
     */
    public String comment() {
        return this.comment;
    }
    /**
     * @return Date and time when the dynamic table was created.
     * 
     */
    public String createdOn() {
        return this.createdOn;
    }
    /**
     * @return Timestamp of the data in the base object(s) that is included in the dynamic table.
     * 
     */
    public String dataTimestamp() {
        return this.dataTimestamp;
    }
    /**
     * @return Database in which the dynamic table is stored.
     * 
     */
    public String databaseName() {
        return this.databaseName;
    }
    /**
     * @return TRUE if the dynamic table has been cloned, else FALSE.
     * 
     */
    public Boolean isClone() {
        return this.isClone;
    }
    /**
     * @return TRUE if the dynamic table is a replica. else FALSE.
     * 
     */
    public Boolean isReplica() {
        return this.isReplica;
    }
    /**
     * @return Timestamp of last suspension.
     * 
     */
    public String lastSuspendedOn() {
        return this.lastSuspendedOn;
    }
    /**
     * @return Name of the dynamic table.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Role that owns the dynamic table.
     * 
     */
    public String owner() {
        return this.owner;
    }
    /**
     * @return INCREMENTAL if the dynamic table will use incremental refreshes, or FULL if it will recompute the whole table on every refresh.
     * 
     */
    public String refreshMode() {
        return this.refreshMode;
    }
    /**
     * @return Explanation for why FULL refresh mode was chosen. NULL if refresh mode is not FULL.
     * 
     */
    public String refreshModeReason() {
        return this.refreshModeReason;
    }
    /**
     * @return Number of rows in the table.
     * 
     */
    public Integer rows() {
        return this.rows;
    }
    /**
     * @return Displays RUNNING for dynamic tables that are actively scheduling refreshes and SUSPENDED for suspended dynamic tables.
     * 
     */
    public String schedulingState() {
        return this.schedulingState;
    }
    /**
     * @return Schema in which the dynamic table is stored.
     * 
     */
    public String schemaName() {
        return this.schemaName;
    }
    /**
     * @return The maximum duration that the dynamic table’s content should lag behind real time.
     * 
     */
    public String targetLag() {
        return this.targetLag;
    }
    /**
     * @return The text of the command that created this dynamic table (e.g. CREATE DYNAMIC TABLE ...).
     * 
     */
    public String text() {
        return this.text;
    }
    /**
     * @return Warehouse that provides the required resources to perform the incremental refreshes.
     * 
     */
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
            if (automaticClustering == null) {
              throw new MissingRequiredPropertyException("GetDynamicTablesRecord", "automaticClustering");
            }
            this.automaticClustering = automaticClustering;
            return this;
        }
        @CustomType.Setter
        public Builder bytes(Integer bytes) {
            if (bytes == null) {
              throw new MissingRequiredPropertyException("GetDynamicTablesRecord", "bytes");
            }
            this.bytes = bytes;
            return this;
        }
        @CustomType.Setter
        public Builder clusterBy(String clusterBy) {
            if (clusterBy == null) {
              throw new MissingRequiredPropertyException("GetDynamicTablesRecord", "clusterBy");
            }
            this.clusterBy = clusterBy;
            return this;
        }
        @CustomType.Setter
        public Builder comment(String comment) {
            if (comment == null) {
              throw new MissingRequiredPropertyException("GetDynamicTablesRecord", "comment");
            }
            this.comment = comment;
            return this;
        }
        @CustomType.Setter
        public Builder createdOn(String createdOn) {
            if (createdOn == null) {
              throw new MissingRequiredPropertyException("GetDynamicTablesRecord", "createdOn");
            }
            this.createdOn = createdOn;
            return this;
        }
        @CustomType.Setter
        public Builder dataTimestamp(String dataTimestamp) {
            if (dataTimestamp == null) {
              throw new MissingRequiredPropertyException("GetDynamicTablesRecord", "dataTimestamp");
            }
            this.dataTimestamp = dataTimestamp;
            return this;
        }
        @CustomType.Setter
        public Builder databaseName(String databaseName) {
            if (databaseName == null) {
              throw new MissingRequiredPropertyException("GetDynamicTablesRecord", "databaseName");
            }
            this.databaseName = databaseName;
            return this;
        }
        @CustomType.Setter
        public Builder isClone(Boolean isClone) {
            if (isClone == null) {
              throw new MissingRequiredPropertyException("GetDynamicTablesRecord", "isClone");
            }
            this.isClone = isClone;
            return this;
        }
        @CustomType.Setter
        public Builder isReplica(Boolean isReplica) {
            if (isReplica == null) {
              throw new MissingRequiredPropertyException("GetDynamicTablesRecord", "isReplica");
            }
            this.isReplica = isReplica;
            return this;
        }
        @CustomType.Setter
        public Builder lastSuspendedOn(String lastSuspendedOn) {
            if (lastSuspendedOn == null) {
              throw new MissingRequiredPropertyException("GetDynamicTablesRecord", "lastSuspendedOn");
            }
            this.lastSuspendedOn = lastSuspendedOn;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetDynamicTablesRecord", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder owner(String owner) {
            if (owner == null) {
              throw new MissingRequiredPropertyException("GetDynamicTablesRecord", "owner");
            }
            this.owner = owner;
            return this;
        }
        @CustomType.Setter
        public Builder refreshMode(String refreshMode) {
            if (refreshMode == null) {
              throw new MissingRequiredPropertyException("GetDynamicTablesRecord", "refreshMode");
            }
            this.refreshMode = refreshMode;
            return this;
        }
        @CustomType.Setter
        public Builder refreshModeReason(String refreshModeReason) {
            if (refreshModeReason == null) {
              throw new MissingRequiredPropertyException("GetDynamicTablesRecord", "refreshModeReason");
            }
            this.refreshModeReason = refreshModeReason;
            return this;
        }
        @CustomType.Setter
        public Builder rows(Integer rows) {
            if (rows == null) {
              throw new MissingRequiredPropertyException("GetDynamicTablesRecord", "rows");
            }
            this.rows = rows;
            return this;
        }
        @CustomType.Setter
        public Builder schedulingState(String schedulingState) {
            if (schedulingState == null) {
              throw new MissingRequiredPropertyException("GetDynamicTablesRecord", "schedulingState");
            }
            this.schedulingState = schedulingState;
            return this;
        }
        @CustomType.Setter
        public Builder schemaName(String schemaName) {
            if (schemaName == null) {
              throw new MissingRequiredPropertyException("GetDynamicTablesRecord", "schemaName");
            }
            this.schemaName = schemaName;
            return this;
        }
        @CustomType.Setter
        public Builder targetLag(String targetLag) {
            if (targetLag == null) {
              throw new MissingRequiredPropertyException("GetDynamicTablesRecord", "targetLag");
            }
            this.targetLag = targetLag;
            return this;
        }
        @CustomType.Setter
        public Builder text(String text) {
            if (text == null) {
              throw new MissingRequiredPropertyException("GetDynamicTablesRecord", "text");
            }
            this.text = text;
            return this;
        }
        @CustomType.Setter
        public Builder warehouse(String warehouse) {
            if (warehouse == null) {
              throw new MissingRequiredPropertyException("GetDynamicTablesRecord", "warehouse");
            }
            this.warehouse = warehouse;
            return this;
        }
        public GetDynamicTablesRecord build() {
            final var _resultValue = new GetDynamicTablesRecord();
            _resultValue.automaticClustering = automaticClustering;
            _resultValue.bytes = bytes;
            _resultValue.clusterBy = clusterBy;
            _resultValue.comment = comment;
            _resultValue.createdOn = createdOn;
            _resultValue.dataTimestamp = dataTimestamp;
            _resultValue.databaseName = databaseName;
            _resultValue.isClone = isClone;
            _resultValue.isReplica = isReplica;
            _resultValue.lastSuspendedOn = lastSuspendedOn;
            _resultValue.name = name;
            _resultValue.owner = owner;
            _resultValue.refreshMode = refreshMode;
            _resultValue.refreshModeReason = refreshModeReason;
            _resultValue.rows = rows;
            _resultValue.schedulingState = schedulingState;
            _resultValue.schemaName = schemaName;
            _resultValue.targetLag = targetLag;
            _resultValue.text = text;
            _resultValue.warehouse = warehouse;
            return _resultValue;
        }
    }
}
