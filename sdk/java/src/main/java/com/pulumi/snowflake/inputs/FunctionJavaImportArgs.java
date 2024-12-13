// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class FunctionJavaImportArgs extends com.pulumi.resources.ResourceArgs {

    public static final FunctionJavaImportArgs Empty = new FunctionJavaImportArgs();

    /**
     * Path for import on stage, without the leading `/`.
     * 
     */
    @Import(name="pathOnStage", required=true)
    private Output<String> pathOnStage;

    /**
     * @return Path for import on stage, without the leading `/`.
     * 
     */
    public Output<String> pathOnStage() {
        return this.pathOnStage;
    }

    @Import(name="stageLocation", required=true)
    private Output<String> stageLocation;

    public Output<String> stageLocation() {
        return this.stageLocation;
    }

    private FunctionJavaImportArgs() {}

    private FunctionJavaImportArgs(FunctionJavaImportArgs $) {
        this.pathOnStage = $.pathOnStage;
        this.stageLocation = $.stageLocation;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FunctionJavaImportArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FunctionJavaImportArgs $;

        public Builder() {
            $ = new FunctionJavaImportArgs();
        }

        public Builder(FunctionJavaImportArgs defaults) {
            $ = new FunctionJavaImportArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param pathOnStage Path for import on stage, without the leading `/`.
         * 
         * @return builder
         * 
         */
        public Builder pathOnStage(Output<String> pathOnStage) {
            $.pathOnStage = pathOnStage;
            return this;
        }

        /**
         * @param pathOnStage Path for import on stage, without the leading `/`.
         * 
         * @return builder
         * 
         */
        public Builder pathOnStage(String pathOnStage) {
            return pathOnStage(Output.of(pathOnStage));
        }

        public Builder stageLocation(Output<String> stageLocation) {
            $.stageLocation = stageLocation;
            return this;
        }

        public Builder stageLocation(String stageLocation) {
            return stageLocation(Output.of(stageLocation));
        }

        public FunctionJavaImportArgs build() {
            if ($.pathOnStage == null) {
                throw new MissingRequiredPropertyException("FunctionJavaImportArgs", "pathOnStage");
            }
            if ($.stageLocation == null) {
                throw new MissingRequiredPropertyException("FunctionJavaImportArgs", "stageLocation");
            }
            return $;
        }
    }

}
