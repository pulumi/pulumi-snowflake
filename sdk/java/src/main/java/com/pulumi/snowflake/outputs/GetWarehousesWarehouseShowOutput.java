// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetWarehousesWarehouseShowOutput {
    private Boolean autoResume;
    private Integer autoSuspend;
    private Double available;
    private String comment;
    private String createdOn;
    private Boolean enableQueryAcceleration;
    private Boolean isCurrent;
    private Boolean isDefault;
    private Integer maxClusterCount;
    private Integer minClusterCount;
    private String name;
    private Double other;
    private String owner;
    private String ownerRoleType;
    private Double provisioning;
    private Integer queryAccelerationMaxScaleFactor;
    private Integer queued;
    private Double quiescing;
    private String resourceMonitor;
    private String resumedOn;
    private Integer running;
    private String scalingPolicy;
    private String size;
    private Integer startedClusters;
    private String state;
    private String type;
    private String updatedOn;

    private GetWarehousesWarehouseShowOutput() {}
    public Boolean autoResume() {
        return this.autoResume;
    }
    public Integer autoSuspend() {
        return this.autoSuspend;
    }
    public Double available() {
        return this.available;
    }
    public String comment() {
        return this.comment;
    }
    public String createdOn() {
        return this.createdOn;
    }
    public Boolean enableQueryAcceleration() {
        return this.enableQueryAcceleration;
    }
    public Boolean isCurrent() {
        return this.isCurrent;
    }
    public Boolean isDefault() {
        return this.isDefault;
    }
    public Integer maxClusterCount() {
        return this.maxClusterCount;
    }
    public Integer minClusterCount() {
        return this.minClusterCount;
    }
    public String name() {
        return this.name;
    }
    public Double other() {
        return this.other;
    }
    public String owner() {
        return this.owner;
    }
    public String ownerRoleType() {
        return this.ownerRoleType;
    }
    public Double provisioning() {
        return this.provisioning;
    }
    public Integer queryAccelerationMaxScaleFactor() {
        return this.queryAccelerationMaxScaleFactor;
    }
    public Integer queued() {
        return this.queued;
    }
    public Double quiescing() {
        return this.quiescing;
    }
    public String resourceMonitor() {
        return this.resourceMonitor;
    }
    public String resumedOn() {
        return this.resumedOn;
    }
    public Integer running() {
        return this.running;
    }
    public String scalingPolicy() {
        return this.scalingPolicy;
    }
    public String size() {
        return this.size;
    }
    public Integer startedClusters() {
        return this.startedClusters;
    }
    public String state() {
        return this.state;
    }
    public String type() {
        return this.type;
    }
    public String updatedOn() {
        return this.updatedOn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWarehousesWarehouseShowOutput defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean autoResume;
        private Integer autoSuspend;
        private Double available;
        private String comment;
        private String createdOn;
        private Boolean enableQueryAcceleration;
        private Boolean isCurrent;
        private Boolean isDefault;
        private Integer maxClusterCount;
        private Integer minClusterCount;
        private String name;
        private Double other;
        private String owner;
        private String ownerRoleType;
        private Double provisioning;
        private Integer queryAccelerationMaxScaleFactor;
        private Integer queued;
        private Double quiescing;
        private String resourceMonitor;
        private String resumedOn;
        private Integer running;
        private String scalingPolicy;
        private String size;
        private Integer startedClusters;
        private String state;
        private String type;
        private String updatedOn;
        public Builder() {}
        public Builder(GetWarehousesWarehouseShowOutput defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoResume = defaults.autoResume;
    	      this.autoSuspend = defaults.autoSuspend;
    	      this.available = defaults.available;
    	      this.comment = defaults.comment;
    	      this.createdOn = defaults.createdOn;
    	      this.enableQueryAcceleration = defaults.enableQueryAcceleration;
    	      this.isCurrent = defaults.isCurrent;
    	      this.isDefault = defaults.isDefault;
    	      this.maxClusterCount = defaults.maxClusterCount;
    	      this.minClusterCount = defaults.minClusterCount;
    	      this.name = defaults.name;
    	      this.other = defaults.other;
    	      this.owner = defaults.owner;
    	      this.ownerRoleType = defaults.ownerRoleType;
    	      this.provisioning = defaults.provisioning;
    	      this.queryAccelerationMaxScaleFactor = defaults.queryAccelerationMaxScaleFactor;
    	      this.queued = defaults.queued;
    	      this.quiescing = defaults.quiescing;
    	      this.resourceMonitor = defaults.resourceMonitor;
    	      this.resumedOn = defaults.resumedOn;
    	      this.running = defaults.running;
    	      this.scalingPolicy = defaults.scalingPolicy;
    	      this.size = defaults.size;
    	      this.startedClusters = defaults.startedClusters;
    	      this.state = defaults.state;
    	      this.type = defaults.type;
    	      this.updatedOn = defaults.updatedOn;
        }

        @CustomType.Setter
        public Builder autoResume(Boolean autoResume) {
            if (autoResume == null) {
              throw new MissingRequiredPropertyException("GetWarehousesWarehouseShowOutput", "autoResume");
            }
            this.autoResume = autoResume;
            return this;
        }
        @CustomType.Setter
        public Builder autoSuspend(Integer autoSuspend) {
            if (autoSuspend == null) {
              throw new MissingRequiredPropertyException("GetWarehousesWarehouseShowOutput", "autoSuspend");
            }
            this.autoSuspend = autoSuspend;
            return this;
        }
        @CustomType.Setter
        public Builder available(Double available) {
            if (available == null) {
              throw new MissingRequiredPropertyException("GetWarehousesWarehouseShowOutput", "available");
            }
            this.available = available;
            return this;
        }
        @CustomType.Setter
        public Builder comment(String comment) {
            if (comment == null) {
              throw new MissingRequiredPropertyException("GetWarehousesWarehouseShowOutput", "comment");
            }
            this.comment = comment;
            return this;
        }
        @CustomType.Setter
        public Builder createdOn(String createdOn) {
            if (createdOn == null) {
              throw new MissingRequiredPropertyException("GetWarehousesWarehouseShowOutput", "createdOn");
            }
            this.createdOn = createdOn;
            return this;
        }
        @CustomType.Setter
        public Builder enableQueryAcceleration(Boolean enableQueryAcceleration) {
            if (enableQueryAcceleration == null) {
              throw new MissingRequiredPropertyException("GetWarehousesWarehouseShowOutput", "enableQueryAcceleration");
            }
            this.enableQueryAcceleration = enableQueryAcceleration;
            return this;
        }
        @CustomType.Setter
        public Builder isCurrent(Boolean isCurrent) {
            if (isCurrent == null) {
              throw new MissingRequiredPropertyException("GetWarehousesWarehouseShowOutput", "isCurrent");
            }
            this.isCurrent = isCurrent;
            return this;
        }
        @CustomType.Setter
        public Builder isDefault(Boolean isDefault) {
            if (isDefault == null) {
              throw new MissingRequiredPropertyException("GetWarehousesWarehouseShowOutput", "isDefault");
            }
            this.isDefault = isDefault;
            return this;
        }
        @CustomType.Setter
        public Builder maxClusterCount(Integer maxClusterCount) {
            if (maxClusterCount == null) {
              throw new MissingRequiredPropertyException("GetWarehousesWarehouseShowOutput", "maxClusterCount");
            }
            this.maxClusterCount = maxClusterCount;
            return this;
        }
        @CustomType.Setter
        public Builder minClusterCount(Integer minClusterCount) {
            if (minClusterCount == null) {
              throw new MissingRequiredPropertyException("GetWarehousesWarehouseShowOutput", "minClusterCount");
            }
            this.minClusterCount = minClusterCount;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetWarehousesWarehouseShowOutput", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder other(Double other) {
            if (other == null) {
              throw new MissingRequiredPropertyException("GetWarehousesWarehouseShowOutput", "other");
            }
            this.other = other;
            return this;
        }
        @CustomType.Setter
        public Builder owner(String owner) {
            if (owner == null) {
              throw new MissingRequiredPropertyException("GetWarehousesWarehouseShowOutput", "owner");
            }
            this.owner = owner;
            return this;
        }
        @CustomType.Setter
        public Builder ownerRoleType(String ownerRoleType) {
            if (ownerRoleType == null) {
              throw new MissingRequiredPropertyException("GetWarehousesWarehouseShowOutput", "ownerRoleType");
            }
            this.ownerRoleType = ownerRoleType;
            return this;
        }
        @CustomType.Setter
        public Builder provisioning(Double provisioning) {
            if (provisioning == null) {
              throw new MissingRequiredPropertyException("GetWarehousesWarehouseShowOutput", "provisioning");
            }
            this.provisioning = provisioning;
            return this;
        }
        @CustomType.Setter
        public Builder queryAccelerationMaxScaleFactor(Integer queryAccelerationMaxScaleFactor) {
            if (queryAccelerationMaxScaleFactor == null) {
              throw new MissingRequiredPropertyException("GetWarehousesWarehouseShowOutput", "queryAccelerationMaxScaleFactor");
            }
            this.queryAccelerationMaxScaleFactor = queryAccelerationMaxScaleFactor;
            return this;
        }
        @CustomType.Setter
        public Builder queued(Integer queued) {
            if (queued == null) {
              throw new MissingRequiredPropertyException("GetWarehousesWarehouseShowOutput", "queued");
            }
            this.queued = queued;
            return this;
        }
        @CustomType.Setter
        public Builder quiescing(Double quiescing) {
            if (quiescing == null) {
              throw new MissingRequiredPropertyException("GetWarehousesWarehouseShowOutput", "quiescing");
            }
            this.quiescing = quiescing;
            return this;
        }
        @CustomType.Setter
        public Builder resourceMonitor(String resourceMonitor) {
            if (resourceMonitor == null) {
              throw new MissingRequiredPropertyException("GetWarehousesWarehouseShowOutput", "resourceMonitor");
            }
            this.resourceMonitor = resourceMonitor;
            return this;
        }
        @CustomType.Setter
        public Builder resumedOn(String resumedOn) {
            if (resumedOn == null) {
              throw new MissingRequiredPropertyException("GetWarehousesWarehouseShowOutput", "resumedOn");
            }
            this.resumedOn = resumedOn;
            return this;
        }
        @CustomType.Setter
        public Builder running(Integer running) {
            if (running == null) {
              throw new MissingRequiredPropertyException("GetWarehousesWarehouseShowOutput", "running");
            }
            this.running = running;
            return this;
        }
        @CustomType.Setter
        public Builder scalingPolicy(String scalingPolicy) {
            if (scalingPolicy == null) {
              throw new MissingRequiredPropertyException("GetWarehousesWarehouseShowOutput", "scalingPolicy");
            }
            this.scalingPolicy = scalingPolicy;
            return this;
        }
        @CustomType.Setter
        public Builder size(String size) {
            if (size == null) {
              throw new MissingRequiredPropertyException("GetWarehousesWarehouseShowOutput", "size");
            }
            this.size = size;
            return this;
        }
        @CustomType.Setter
        public Builder startedClusters(Integer startedClusters) {
            if (startedClusters == null) {
              throw new MissingRequiredPropertyException("GetWarehousesWarehouseShowOutput", "startedClusters");
            }
            this.startedClusters = startedClusters;
            return this;
        }
        @CustomType.Setter
        public Builder state(String state) {
            if (state == null) {
              throw new MissingRequiredPropertyException("GetWarehousesWarehouseShowOutput", "state");
            }
            this.state = state;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetWarehousesWarehouseShowOutput", "type");
            }
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder updatedOn(String updatedOn) {
            if (updatedOn == null) {
              throw new MissingRequiredPropertyException("GetWarehousesWarehouseShowOutput", "updatedOn");
            }
            this.updatedOn = updatedOn;
            return this;
        }
        public GetWarehousesWarehouseShowOutput build() {
            final var _resultValue = new GetWarehousesWarehouseShowOutput();
            _resultValue.autoResume = autoResume;
            _resultValue.autoSuspend = autoSuspend;
            _resultValue.available = available;
            _resultValue.comment = comment;
            _resultValue.createdOn = createdOn;
            _resultValue.enableQueryAcceleration = enableQueryAcceleration;
            _resultValue.isCurrent = isCurrent;
            _resultValue.isDefault = isDefault;
            _resultValue.maxClusterCount = maxClusterCount;
            _resultValue.minClusterCount = minClusterCount;
            _resultValue.name = name;
            _resultValue.other = other;
            _resultValue.owner = owner;
            _resultValue.ownerRoleType = ownerRoleType;
            _resultValue.provisioning = provisioning;
            _resultValue.queryAccelerationMaxScaleFactor = queryAccelerationMaxScaleFactor;
            _resultValue.queued = queued;
            _resultValue.quiescing = quiescing;
            _resultValue.resourceMonitor = resourceMonitor;
            _resultValue.resumedOn = resumedOn;
            _resultValue.running = running;
            _resultValue.scalingPolicy = scalingPolicy;
            _resultValue.size = size;
            _resultValue.startedClusters = startedClusters;
            _resultValue.state = state;
            _resultValue.type = type;
            _resultValue.updatedOn = updatedOn;
            return _resultValue;
        }
    }
}
