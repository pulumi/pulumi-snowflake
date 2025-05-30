// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TableColumnIdentity {
    /**
     * @return (Default: `1`) The number to start incrementing at.
     * 
     */
    private @Nullable Integer startNum;
    /**
     * @return (Default: `1`) Step size to increment by.
     * 
     */
    private @Nullable Integer stepNum;

    private TableColumnIdentity() {}
    /**
     * @return (Default: `1`) The number to start incrementing at.
     * 
     */
    public Optional<Integer> startNum() {
        return Optional.ofNullable(this.startNum);
    }
    /**
     * @return (Default: `1`) Step size to increment by.
     * 
     */
    public Optional<Integer> stepNum() {
        return Optional.ofNullable(this.stepNum);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableColumnIdentity defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer startNum;
        private @Nullable Integer stepNum;
        public Builder() {}
        public Builder(TableColumnIdentity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.startNum = defaults.startNum;
    	      this.stepNum = defaults.stepNum;
        }

        @CustomType.Setter
        public Builder startNum(@Nullable Integer startNum) {

            this.startNum = startNum;
            return this;
        }
        @CustomType.Setter
        public Builder stepNum(@Nullable Integer stepNum) {

            this.stepNum = stepNum;
            return this;
        }
        public TableColumnIdentity build() {
            final var _resultValue = new TableColumnIdentity();
            _resultValue.startNum = startNum;
            _resultValue.stepNum = stepNum;
            return _resultValue;
        }
    }
}
