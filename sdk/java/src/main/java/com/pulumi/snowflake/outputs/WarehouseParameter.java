// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.snowflake.outputs.WarehouseParameterMaxConcurrencyLevel;
import com.pulumi.snowflake.outputs.WarehouseParameterStatementQueuedTimeoutInSecond;
import com.pulumi.snowflake.outputs.WarehouseParameterStatementTimeoutInSecond;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class WarehouseParameter {
    private @Nullable List<WarehouseParameterMaxConcurrencyLevel> maxConcurrencyLevels;
    private @Nullable List<WarehouseParameterStatementQueuedTimeoutInSecond> statementQueuedTimeoutInSeconds;
    private @Nullable List<WarehouseParameterStatementTimeoutInSecond> statementTimeoutInSeconds;

    private WarehouseParameter() {}
    public List<WarehouseParameterMaxConcurrencyLevel> maxConcurrencyLevels() {
        return this.maxConcurrencyLevels == null ? List.of() : this.maxConcurrencyLevels;
    }
    public List<WarehouseParameterStatementQueuedTimeoutInSecond> statementQueuedTimeoutInSeconds() {
        return this.statementQueuedTimeoutInSeconds == null ? List.of() : this.statementQueuedTimeoutInSeconds;
    }
    public List<WarehouseParameterStatementTimeoutInSecond> statementTimeoutInSeconds() {
        return this.statementTimeoutInSeconds == null ? List.of() : this.statementTimeoutInSeconds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WarehouseParameter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<WarehouseParameterMaxConcurrencyLevel> maxConcurrencyLevels;
        private @Nullable List<WarehouseParameterStatementQueuedTimeoutInSecond> statementQueuedTimeoutInSeconds;
        private @Nullable List<WarehouseParameterStatementTimeoutInSecond> statementTimeoutInSeconds;
        public Builder() {}
        public Builder(WarehouseParameter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxConcurrencyLevels = defaults.maxConcurrencyLevels;
    	      this.statementQueuedTimeoutInSeconds = defaults.statementQueuedTimeoutInSeconds;
    	      this.statementTimeoutInSeconds = defaults.statementTimeoutInSeconds;
        }

        @CustomType.Setter
        public Builder maxConcurrencyLevels(@Nullable List<WarehouseParameterMaxConcurrencyLevel> maxConcurrencyLevels) {

            this.maxConcurrencyLevels = maxConcurrencyLevels;
            return this;
        }
        public Builder maxConcurrencyLevels(WarehouseParameterMaxConcurrencyLevel... maxConcurrencyLevels) {
            return maxConcurrencyLevels(List.of(maxConcurrencyLevels));
        }
        @CustomType.Setter
        public Builder statementQueuedTimeoutInSeconds(@Nullable List<WarehouseParameterStatementQueuedTimeoutInSecond> statementQueuedTimeoutInSeconds) {

            this.statementQueuedTimeoutInSeconds = statementQueuedTimeoutInSeconds;
            return this;
        }
        public Builder statementQueuedTimeoutInSeconds(WarehouseParameterStatementQueuedTimeoutInSecond... statementQueuedTimeoutInSeconds) {
            return statementQueuedTimeoutInSeconds(List.of(statementQueuedTimeoutInSeconds));
        }
        @CustomType.Setter
        public Builder statementTimeoutInSeconds(@Nullable List<WarehouseParameterStatementTimeoutInSecond> statementTimeoutInSeconds) {

            this.statementTimeoutInSeconds = statementTimeoutInSeconds;
            return this;
        }
        public Builder statementTimeoutInSeconds(WarehouseParameterStatementTimeoutInSecond... statementTimeoutInSeconds) {
            return statementTimeoutInSeconds(List.of(statementTimeoutInSeconds));
        }
        public WarehouseParameter build() {
            final var _resultValue = new WarehouseParameter();
            _resultValue.maxConcurrencyLevels = maxConcurrencyLevels;
            _resultValue.statementQueuedTimeoutInSeconds = statementQueuedTimeoutInSeconds;
            _resultValue.statementTimeoutInSeconds = statementTimeoutInSeconds;
            return _resultValue;
        }
    }
}
