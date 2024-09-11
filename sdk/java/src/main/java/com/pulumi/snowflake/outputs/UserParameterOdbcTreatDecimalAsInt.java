// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class UserParameterOdbcTreatDecimalAsInt {
    private @Nullable String default_;
    private @Nullable String description;
    private @Nullable String key;
    private @Nullable String level;
    private @Nullable String value;

    private UserParameterOdbcTreatDecimalAsInt() {}
    public Optional<String> default_() {
        return Optional.ofNullable(this.default_);
    }
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    public Optional<String> key() {
        return Optional.ofNullable(this.key);
    }
    public Optional<String> level() {
        return Optional.ofNullable(this.level);
    }
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserParameterOdbcTreatDecimalAsInt defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String default_;
        private @Nullable String description;
        private @Nullable String key;
        private @Nullable String level;
        private @Nullable String value;
        public Builder() {}
        public Builder(UserParameterOdbcTreatDecimalAsInt defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.default_ = defaults.default_;
    	      this.description = defaults.description;
    	      this.key = defaults.key;
    	      this.level = defaults.level;
    	      this.value = defaults.value;
        }

        @CustomType.Setter("default")
        public Builder default_(@Nullable String default_) {

            this.default_ = default_;
            return this;
        }
        @CustomType.Setter
        public Builder description(@Nullable String description) {

            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder key(@Nullable String key) {

            this.key = key;
            return this;
        }
        @CustomType.Setter
        public Builder level(@Nullable String level) {

            this.level = level;
            return this;
        }
        @CustomType.Setter
        public Builder value(@Nullable String value) {

            this.value = value;
            return this;
        }
        public UserParameterOdbcTreatDecimalAsInt build() {
            final var _resultValue = new UserParameterOdbcTreatDecimalAsInt();
            _resultValue.default_ = default_;
            _resultValue.description = description;
            _resultValue.key = key;
            _resultValue.level = level;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
