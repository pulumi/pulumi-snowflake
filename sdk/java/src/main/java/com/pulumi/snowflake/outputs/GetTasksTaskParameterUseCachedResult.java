// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetTasksTaskParameterUseCachedResult {
    private String default_;
    private String description;
    private String key;
    private String level;
    private String value;

    private GetTasksTaskParameterUseCachedResult() {}
    public String default_() {
        return this.default_;
    }
    public String description() {
        return this.description;
    }
    public String key() {
        return this.key;
    }
    public String level() {
        return this.level;
    }
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTasksTaskParameterUseCachedResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String default_;
        private String description;
        private String key;
        private String level;
        private String value;
        public Builder() {}
        public Builder(GetTasksTaskParameterUseCachedResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.default_ = defaults.default_;
    	      this.description = defaults.description;
    	      this.key = defaults.key;
    	      this.level = defaults.level;
    	      this.value = defaults.value;
        }

        @CustomType.Setter("default")
        public Builder default_(String default_) {
            if (default_ == null) {
              throw new MissingRequiredPropertyException("GetTasksTaskParameterUseCachedResult", "default_");
            }
            this.default_ = default_;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetTasksTaskParameterUseCachedResult", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder key(String key) {
            if (key == null) {
              throw new MissingRequiredPropertyException("GetTasksTaskParameterUseCachedResult", "key");
            }
            this.key = key;
            return this;
        }
        @CustomType.Setter
        public Builder level(String level) {
            if (level == null) {
              throw new MissingRequiredPropertyException("GetTasksTaskParameterUseCachedResult", "level");
            }
            this.level = level;
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            if (value == null) {
              throw new MissingRequiredPropertyException("GetTasksTaskParameterUseCachedResult", "value");
            }
            this.value = value;
            return this;
        }
        public GetTasksTaskParameterUseCachedResult build() {
            final var _resultValue = new GetTasksTaskParameterUseCachedResult();
            _resultValue.default_ = default_;
            _resultValue.description = description;
            _resultValue.key = key;
            _resultValue.level = level;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
