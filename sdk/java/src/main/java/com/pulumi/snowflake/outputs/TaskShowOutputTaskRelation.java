// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TaskShowOutputTaskRelation {
    private @Nullable String finalizedRootTask;
    private @Nullable String finalizer;
    private @Nullable List<String> predecessors;

    private TaskShowOutputTaskRelation() {}
    public Optional<String> finalizedRootTask() {
        return Optional.ofNullable(this.finalizedRootTask);
    }
    public Optional<String> finalizer() {
        return Optional.ofNullable(this.finalizer);
    }
    public List<String> predecessors() {
        return this.predecessors == null ? List.of() : this.predecessors;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskShowOutputTaskRelation defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String finalizedRootTask;
        private @Nullable String finalizer;
        private @Nullable List<String> predecessors;
        public Builder() {}
        public Builder(TaskShowOutputTaskRelation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.finalizedRootTask = defaults.finalizedRootTask;
    	      this.finalizer = defaults.finalizer;
    	      this.predecessors = defaults.predecessors;
        }

        @CustomType.Setter
        public Builder finalizedRootTask(@Nullable String finalizedRootTask) {

            this.finalizedRootTask = finalizedRootTask;
            return this;
        }
        @CustomType.Setter
        public Builder finalizer(@Nullable String finalizer) {

            this.finalizer = finalizer;
            return this;
        }
        @CustomType.Setter
        public Builder predecessors(@Nullable List<String> predecessors) {

            this.predecessors = predecessors;
            return this;
        }
        public Builder predecessors(String... predecessors) {
            return predecessors(List.of(predecessors));
        }
        public TaskShowOutputTaskRelation build() {
            final var _resultValue = new TaskShowOutputTaskRelation();
            _resultValue.finalizedRootTask = finalizedRootTask;
            _resultValue.finalizer = finalizer;
            _resultValue.predecessors = predecessors;
            return _resultValue;
        }
    }
}
