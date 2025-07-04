// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ComputePoolArgs extends com.pulumi.resources.ResourceArgs {

    public static final ComputePoolArgs Empty = new ComputePoolArgs();

    /**
     * (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`default`)) Specifies whether to automatically resume a compute pool when a service or job is submitted to it. Available options are: &#34;true&#34; or &#34;false&#34;. When the value is not set in the configuration the provider will put &#34;default&#34; there which means to use the Snowflake default for this value.
     * 
     */
    @Import(name="autoResume")
    private @Nullable Output<String> autoResume;

    /**
     * @return (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`default`)) Specifies whether to automatically resume a compute pool when a service or job is submitted to it. Available options are: &#34;true&#34; or &#34;false&#34;. When the value is not set in the configuration the provider will put &#34;default&#34; there which means to use the Snowflake default for this value.
     * 
     */
    public Optional<Output<String>> autoResume() {
        return Optional.ofNullable(this.autoResume);
    }

    /**
     * (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`-1`)) Number of seconds of inactivity after which you want Snowflake to automatically suspend the compute pool.
     * 
     */
    @Import(name="autoSuspendSecs")
    private @Nullable Output<Integer> autoSuspendSecs;

    /**
     * @return (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`-1`)) Number of seconds of inactivity after which you want Snowflake to automatically suspend the compute pool.
     * 
     */
    public Optional<Output<Integer>> autoSuspendSecs() {
        return Optional.ofNullable(this.autoSuspendSecs);
    }

    /**
     * Specifies a comment for the compute pool.
     * 
     */
    @Import(name="comment")
    private @Nullable Output<String> comment;

    /**
     * @return Specifies a comment for the compute pool.
     * 
     */
    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    /**
     * Specifies the Snowflake Native App name.
     * 
     */
    @Import(name="forApplication")
    private @Nullable Output<String> forApplication;

    /**
     * @return Specifies the Snowflake Native App name.
     * 
     */
    public Optional<Output<String>> forApplication() {
        return Optional.ofNullable(this.forApplication);
    }

    /**
     * (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`default`)) Specifies whether the compute pool is created initially in the suspended state. This field is used only when creating a compute pool. Changes on this field are ignored after creation.
     * 
     */
    @Import(name="initiallySuspended")
    private @Nullable Output<String> initiallySuspended;

    /**
     * @return (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`default`)) Specifies whether the compute pool is created initially in the suspended state. This field is used only when creating a compute pool. Changes on this field are ignored after creation.
     * 
     */
    public Optional<Output<String>> initiallySuspended() {
        return Optional.ofNullable(this.initiallySuspended);
    }

    /**
     * Identifies the type of machine you want to provision for the nodes in the compute pool. Valid values are (case-insensitive): `CPU_X64_XS` | `CPU_X64_S` | `CPU_X64_M` | `CPU_X64_L` | `HIGHMEM_X64_S` | `HIGHMEM_X64_M` | `HIGHMEM_X64_L` | `HIGHMEM_X64_SL` | `GPU_NV_S` | `GPU_NV_M` | `GPU_NV_L` | `GPU_NV_XS` | `GPU_NV_SM` | `GPU_NV_2M` | `GPU_NV_3M` | `GPU_NV_SL`.
     * 
     */
    @Import(name="instanceFamily", required=true)
    private Output<String> instanceFamily;

    /**
     * @return Identifies the type of machine you want to provision for the nodes in the compute pool. Valid values are (case-insensitive): `CPU_X64_XS` | `CPU_X64_S` | `CPU_X64_M` | `CPU_X64_L` | `HIGHMEM_X64_S` | `HIGHMEM_X64_M` | `HIGHMEM_X64_L` | `HIGHMEM_X64_SL` | `GPU_NV_S` | `GPU_NV_M` | `GPU_NV_L` | `GPU_NV_XS` | `GPU_NV_SM` | `GPU_NV_2M` | `GPU_NV_3M` | `GPU_NV_SL`.
     * 
     */
    public Output<String> instanceFamily() {
        return this.instanceFamily;
    }

    /**
     * Specifies the maximum number of nodes for the compute pool.
     * 
     */
    @Import(name="maxNodes", required=true)
    private Output<Integer> maxNodes;

    /**
     * @return Specifies the maximum number of nodes for the compute pool.
     * 
     */
    public Output<Integer> maxNodes() {
        return this.maxNodes;
    }

    /**
     * Specifies the minimum number of nodes for the compute pool.
     * 
     */
    @Import(name="minNodes", required=true)
    private Output<Integer> minNodes;

    /**
     * @return Specifies the minimum number of nodes for the compute pool.
     * 
     */
    public Output<Integer> minNodes() {
        return this.minNodes;
    }

    /**
     * Specifies the identifier for the compute pool; must be unique for the account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the identifier for the compute pool; must be unique for the account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private ComputePoolArgs() {}

    private ComputePoolArgs(ComputePoolArgs $) {
        this.autoResume = $.autoResume;
        this.autoSuspendSecs = $.autoSuspendSecs;
        this.comment = $.comment;
        this.forApplication = $.forApplication;
        this.initiallySuspended = $.initiallySuspended;
        this.instanceFamily = $.instanceFamily;
        this.maxNodes = $.maxNodes;
        this.minNodes = $.minNodes;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ComputePoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ComputePoolArgs $;

        public Builder() {
            $ = new ComputePoolArgs();
        }

        public Builder(ComputePoolArgs defaults) {
            $ = new ComputePoolArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoResume (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`default`)) Specifies whether to automatically resume a compute pool when a service or job is submitted to it. Available options are: &#34;true&#34; or &#34;false&#34;. When the value is not set in the configuration the provider will put &#34;default&#34; there which means to use the Snowflake default for this value.
         * 
         * @return builder
         * 
         */
        public Builder autoResume(@Nullable Output<String> autoResume) {
            $.autoResume = autoResume;
            return this;
        }

        /**
         * @param autoResume (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`default`)) Specifies whether to automatically resume a compute pool when a service or job is submitted to it. Available options are: &#34;true&#34; or &#34;false&#34;. When the value is not set in the configuration the provider will put &#34;default&#34; there which means to use the Snowflake default for this value.
         * 
         * @return builder
         * 
         */
        public Builder autoResume(String autoResume) {
            return autoResume(Output.of(autoResume));
        }

        /**
         * @param autoSuspendSecs (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`-1`)) Number of seconds of inactivity after which you want Snowflake to automatically suspend the compute pool.
         * 
         * @return builder
         * 
         */
        public Builder autoSuspendSecs(@Nullable Output<Integer> autoSuspendSecs) {
            $.autoSuspendSecs = autoSuspendSecs;
            return this;
        }

        /**
         * @param autoSuspendSecs (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`-1`)) Number of seconds of inactivity after which you want Snowflake to automatically suspend the compute pool.
         * 
         * @return builder
         * 
         */
        public Builder autoSuspendSecs(Integer autoSuspendSecs) {
            return autoSuspendSecs(Output.of(autoSuspendSecs));
        }

        /**
         * @param comment Specifies a comment for the compute pool.
         * 
         * @return builder
         * 
         */
        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        /**
         * @param comment Specifies a comment for the compute pool.
         * 
         * @return builder
         * 
         */
        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        /**
         * @param forApplication Specifies the Snowflake Native App name.
         * 
         * @return builder
         * 
         */
        public Builder forApplication(@Nullable Output<String> forApplication) {
            $.forApplication = forApplication;
            return this;
        }

        /**
         * @param forApplication Specifies the Snowflake Native App name.
         * 
         * @return builder
         * 
         */
        public Builder forApplication(String forApplication) {
            return forApplication(Output.of(forApplication));
        }

        /**
         * @param initiallySuspended (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`default`)) Specifies whether the compute pool is created initially in the suspended state. This field is used only when creating a compute pool. Changes on this field are ignored after creation.
         * 
         * @return builder
         * 
         */
        public Builder initiallySuspended(@Nullable Output<String> initiallySuspended) {
            $.initiallySuspended = initiallySuspended;
            return this;
        }

        /**
         * @param initiallySuspended (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`default`)) Specifies whether the compute pool is created initially in the suspended state. This field is used only when creating a compute pool. Changes on this field are ignored after creation.
         * 
         * @return builder
         * 
         */
        public Builder initiallySuspended(String initiallySuspended) {
            return initiallySuspended(Output.of(initiallySuspended));
        }

        /**
         * @param instanceFamily Identifies the type of machine you want to provision for the nodes in the compute pool. Valid values are (case-insensitive): `CPU_X64_XS` | `CPU_X64_S` | `CPU_X64_M` | `CPU_X64_L` | `HIGHMEM_X64_S` | `HIGHMEM_X64_M` | `HIGHMEM_X64_L` | `HIGHMEM_X64_SL` | `GPU_NV_S` | `GPU_NV_M` | `GPU_NV_L` | `GPU_NV_XS` | `GPU_NV_SM` | `GPU_NV_2M` | `GPU_NV_3M` | `GPU_NV_SL`.
         * 
         * @return builder
         * 
         */
        public Builder instanceFamily(Output<String> instanceFamily) {
            $.instanceFamily = instanceFamily;
            return this;
        }

        /**
         * @param instanceFamily Identifies the type of machine you want to provision for the nodes in the compute pool. Valid values are (case-insensitive): `CPU_X64_XS` | `CPU_X64_S` | `CPU_X64_M` | `CPU_X64_L` | `HIGHMEM_X64_S` | `HIGHMEM_X64_M` | `HIGHMEM_X64_L` | `HIGHMEM_X64_SL` | `GPU_NV_S` | `GPU_NV_M` | `GPU_NV_L` | `GPU_NV_XS` | `GPU_NV_SM` | `GPU_NV_2M` | `GPU_NV_3M` | `GPU_NV_SL`.
         * 
         * @return builder
         * 
         */
        public Builder instanceFamily(String instanceFamily) {
            return instanceFamily(Output.of(instanceFamily));
        }

        /**
         * @param maxNodes Specifies the maximum number of nodes for the compute pool.
         * 
         * @return builder
         * 
         */
        public Builder maxNodes(Output<Integer> maxNodes) {
            $.maxNodes = maxNodes;
            return this;
        }

        /**
         * @param maxNodes Specifies the maximum number of nodes for the compute pool.
         * 
         * @return builder
         * 
         */
        public Builder maxNodes(Integer maxNodes) {
            return maxNodes(Output.of(maxNodes));
        }

        /**
         * @param minNodes Specifies the minimum number of nodes for the compute pool.
         * 
         * @return builder
         * 
         */
        public Builder minNodes(Output<Integer> minNodes) {
            $.minNodes = minNodes;
            return this;
        }

        /**
         * @param minNodes Specifies the minimum number of nodes for the compute pool.
         * 
         * @return builder
         * 
         */
        public Builder minNodes(Integer minNodes) {
            return minNodes(Output.of(minNodes));
        }

        /**
         * @param name Specifies the identifier for the compute pool; must be unique for the account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the identifier for the compute pool; must be unique for the account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public ComputePoolArgs build() {
            if ($.instanceFamily == null) {
                throw new MissingRequiredPropertyException("ComputePoolArgs", "instanceFamily");
            }
            if ($.maxNodes == null) {
                throw new MissingRequiredPropertyException("ComputePoolArgs", "maxNodes");
            }
            if ($.minNodes == null) {
                throw new MissingRequiredPropertyException("ComputePoolArgs", "minNodes");
            }
            return $;
        }
    }

}
