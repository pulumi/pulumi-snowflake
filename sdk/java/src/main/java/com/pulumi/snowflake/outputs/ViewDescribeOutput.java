// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ViewDescribeOutput {
    private @Nullable String check;
    private @Nullable String comment;
    private @Nullable String default_;
    private @Nullable String expression;
    private @Nullable Boolean isNullable;
    private @Nullable Boolean isPrimary;
    private @Nullable Boolean isUnique;
    private @Nullable String kind;
    private @Nullable String name;
    private @Nullable String policyName;
    private @Nullable String privacyDomain;
    private @Nullable String type;

    private ViewDescribeOutput() {}
    public Optional<String> check() {
        return Optional.ofNullable(this.check);
    }
    public Optional<String> comment() {
        return Optional.ofNullable(this.comment);
    }
    public Optional<String> default_() {
        return Optional.ofNullable(this.default_);
    }
    public Optional<String> expression() {
        return Optional.ofNullable(this.expression);
    }
    public Optional<Boolean> isNullable() {
        return Optional.ofNullable(this.isNullable);
    }
    public Optional<Boolean> isPrimary() {
        return Optional.ofNullable(this.isPrimary);
    }
    public Optional<Boolean> isUnique() {
        return Optional.ofNullable(this.isUnique);
    }
    public Optional<String> kind() {
        return Optional.ofNullable(this.kind);
    }
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    public Optional<String> policyName() {
        return Optional.ofNullable(this.policyName);
    }
    public Optional<String> privacyDomain() {
        return Optional.ofNullable(this.privacyDomain);
    }
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ViewDescribeOutput defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String check;
        private @Nullable String comment;
        private @Nullable String default_;
        private @Nullable String expression;
        private @Nullable Boolean isNullable;
        private @Nullable Boolean isPrimary;
        private @Nullable Boolean isUnique;
        private @Nullable String kind;
        private @Nullable String name;
        private @Nullable String policyName;
        private @Nullable String privacyDomain;
        private @Nullable String type;
        public Builder() {}
        public Builder(ViewDescribeOutput defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.check = defaults.check;
    	      this.comment = defaults.comment;
    	      this.default_ = defaults.default_;
    	      this.expression = defaults.expression;
    	      this.isNullable = defaults.isNullable;
    	      this.isPrimary = defaults.isPrimary;
    	      this.isUnique = defaults.isUnique;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.policyName = defaults.policyName;
    	      this.privacyDomain = defaults.privacyDomain;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder check(@Nullable String check) {

            this.check = check;
            return this;
        }
        @CustomType.Setter
        public Builder comment(@Nullable String comment) {

            this.comment = comment;
            return this;
        }
        @CustomType.Setter("default")
        public Builder default_(@Nullable String default_) {

            this.default_ = default_;
            return this;
        }
        @CustomType.Setter
        public Builder expression(@Nullable String expression) {

            this.expression = expression;
            return this;
        }
        @CustomType.Setter
        public Builder isNullable(@Nullable Boolean isNullable) {

            this.isNullable = isNullable;
            return this;
        }
        @CustomType.Setter
        public Builder isPrimary(@Nullable Boolean isPrimary) {

            this.isPrimary = isPrimary;
            return this;
        }
        @CustomType.Setter
        public Builder isUnique(@Nullable Boolean isUnique) {

            this.isUnique = isUnique;
            return this;
        }
        @CustomType.Setter
        public Builder kind(@Nullable String kind) {

            this.kind = kind;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder policyName(@Nullable String policyName) {

            this.policyName = policyName;
            return this;
        }
        @CustomType.Setter
        public Builder privacyDomain(@Nullable String privacyDomain) {

            this.privacyDomain = privacyDomain;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {

            this.type = type;
            return this;
        }
        public ViewDescribeOutput build() {
            final var _resultValue = new ViewDescribeOutput();
            _resultValue.check = check;
            _resultValue.comment = comment;
            _resultValue.default_ = default_;
            _resultValue.expression = expression;
            _resultValue.isNullable = isNullable;
            _resultValue.isPrimary = isPrimary;
            _resultValue.isUnique = isUnique;
            _resultValue.kind = kind;
            _resultValue.name = name;
            _resultValue.policyName = policyName;
            _resultValue.privacyDomain = privacyDomain;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
