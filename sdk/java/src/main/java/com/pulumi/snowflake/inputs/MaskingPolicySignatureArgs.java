// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.snowflake.inputs.MaskingPolicySignatureColumnArgs;
import java.util.List;
import java.util.Objects;


public final class MaskingPolicySignatureArgs extends com.pulumi.resources.ResourceArgs {

    public static final MaskingPolicySignatureArgs Empty = new MaskingPolicySignatureArgs();

    @Import(name="columns", required=true)
    private Output<List<MaskingPolicySignatureColumnArgs>> columns;

    public Output<List<MaskingPolicySignatureColumnArgs>> columns() {
        return this.columns;
    }

    private MaskingPolicySignatureArgs() {}

    private MaskingPolicySignatureArgs(MaskingPolicySignatureArgs $) {
        this.columns = $.columns;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MaskingPolicySignatureArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MaskingPolicySignatureArgs $;

        public Builder() {
            $ = new MaskingPolicySignatureArgs();
        }

        public Builder(MaskingPolicySignatureArgs defaults) {
            $ = new MaskingPolicySignatureArgs(Objects.requireNonNull(defaults));
        }

        public Builder columns(Output<List<MaskingPolicySignatureColumnArgs>> columns) {
            $.columns = columns;
            return this;
        }

        public Builder columns(List<MaskingPolicySignatureColumnArgs> columns) {
            return columns(Output.of(columns));
        }

        public Builder columns(MaskingPolicySignatureColumnArgs... columns) {
            return columns(List.of(columns));
        }

        public MaskingPolicySignatureArgs build() {
            $.columns = Objects.requireNonNull($.columns, "expected parameter 'columns' to be non-null");
            return $;
        }
    }

}