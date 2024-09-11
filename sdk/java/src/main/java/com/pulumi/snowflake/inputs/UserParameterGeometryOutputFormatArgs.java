// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UserParameterGeometryOutputFormatArgs extends com.pulumi.resources.ResourceArgs {

    public static final UserParameterGeometryOutputFormatArgs Empty = new UserParameterGeometryOutputFormatArgs();

    @Import(name="default")
    private @Nullable Output<String> default_;

    public Optional<Output<String>> default_() {
        return Optional.ofNullable(this.default_);
    }

    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="key")
    private @Nullable Output<String> key;

    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    @Import(name="level")
    private @Nullable Output<String> level;

    public Optional<Output<String>> level() {
        return Optional.ofNullable(this.level);
    }

    @Import(name="value")
    private @Nullable Output<String> value;

    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private UserParameterGeometryOutputFormatArgs() {}

    private UserParameterGeometryOutputFormatArgs(UserParameterGeometryOutputFormatArgs $) {
        this.default_ = $.default_;
        this.description = $.description;
        this.key = $.key;
        this.level = $.level;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserParameterGeometryOutputFormatArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserParameterGeometryOutputFormatArgs $;

        public Builder() {
            $ = new UserParameterGeometryOutputFormatArgs();
        }

        public Builder(UserParameterGeometryOutputFormatArgs defaults) {
            $ = new UserParameterGeometryOutputFormatArgs(Objects.requireNonNull(defaults));
        }

        public Builder default_(@Nullable Output<String> default_) {
            $.default_ = default_;
            return this;
        }

        public Builder default_(String default_) {
            return default_(Output.of(default_));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        public Builder key(String key) {
            return key(Output.of(key));
        }

        public Builder level(@Nullable Output<String> level) {
            $.level = level;
            return this;
        }

        public Builder level(String level) {
            return level(Output.of(level));
        }

        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        public Builder value(String value) {
            return value(Output.of(value));
        }

        public UserParameterGeometryOutputFormatArgs build() {
            return $;
        }
    }

}
