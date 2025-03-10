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
public final class ExternalVolumeShowOutput {
    private @Nullable Boolean allowWrites;
    private @Nullable String comment;
    private @Nullable String name;

    private ExternalVolumeShowOutput() {}
    public Optional<Boolean> allowWrites() {
        return Optional.ofNullable(this.allowWrites);
    }
    public Optional<String> comment() {
        return Optional.ofNullable(this.comment);
    }
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExternalVolumeShowOutput defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean allowWrites;
        private @Nullable String comment;
        private @Nullable String name;
        public Builder() {}
        public Builder(ExternalVolumeShowOutput defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowWrites = defaults.allowWrites;
    	      this.comment = defaults.comment;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder allowWrites(@Nullable Boolean allowWrites) {

            this.allowWrites = allowWrites;
            return this;
        }
        @CustomType.Setter
        public Builder comment(@Nullable String comment) {

            this.comment = comment;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        public ExternalVolumeShowOutput build() {
            final var _resultValue = new ExternalVolumeShowOutput();
            _resultValue.allowWrites = allowWrites;
            _resultValue.comment = comment;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
