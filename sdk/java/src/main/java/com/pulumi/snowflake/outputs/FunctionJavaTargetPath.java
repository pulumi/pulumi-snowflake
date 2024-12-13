// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class FunctionJavaTargetPath {
    /**
     * @return Path for import on stage, without the leading `/`.
     * 
     */
    private String pathOnStage;
    private String stageLocation;

    private FunctionJavaTargetPath() {}
    /**
     * @return Path for import on stage, without the leading `/`.
     * 
     */
    public String pathOnStage() {
        return this.pathOnStage;
    }
    public String stageLocation() {
        return this.stageLocation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FunctionJavaTargetPath defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String pathOnStage;
        private String stageLocation;
        public Builder() {}
        public Builder(FunctionJavaTargetPath defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pathOnStage = defaults.pathOnStage;
    	      this.stageLocation = defaults.stageLocation;
        }

        @CustomType.Setter
        public Builder pathOnStage(String pathOnStage) {
            if (pathOnStage == null) {
              throw new MissingRequiredPropertyException("FunctionJavaTargetPath", "pathOnStage");
            }
            this.pathOnStage = pathOnStage;
            return this;
        }
        @CustomType.Setter
        public Builder stageLocation(String stageLocation) {
            if (stageLocation == null) {
              throw new MissingRequiredPropertyException("FunctionJavaTargetPath", "stageLocation");
            }
            this.stageLocation = stageLocation;
            return this;
        }
        public FunctionJavaTargetPath build() {
            final var _resultValue = new FunctionJavaTargetPath();
            _resultValue.pathOnStage = pathOnStage;
            _resultValue.stageLocation = stageLocation;
            return _resultValue;
        }
    }
}