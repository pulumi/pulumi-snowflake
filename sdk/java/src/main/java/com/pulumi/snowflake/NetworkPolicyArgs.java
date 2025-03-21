// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworkPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkPolicyArgs Empty = new NetworkPolicyArgs();

    /**
     * Specifies one or more IPv4 addresses (CIDR notation) that are allowed access to your Snowflake account.
     * 
     */
    @Import(name="allowedIpLists")
    private @Nullable Output<List<String>> allowedIpLists;

    /**
     * @return Specifies one or more IPv4 addresses (CIDR notation) that are allowed access to your Snowflake account.
     * 
     */
    public Optional<Output<List<String>>> allowedIpLists() {
        return Optional.ofNullable(this.allowedIpLists);
    }

    /**
     * Specifies a list of fully qualified network rules that contain the network identifiers that are allowed access to Snowflake. For more information about this resource, see docs.
     * 
     */
    @Import(name="allowedNetworkRuleLists")
    private @Nullable Output<List<String>> allowedNetworkRuleLists;

    /**
     * @return Specifies a list of fully qualified network rules that contain the network identifiers that are allowed access to Snowflake. For more information about this resource, see docs.
     * 
     */
    public Optional<Output<List<String>>> allowedNetworkRuleLists() {
        return Optional.ofNullable(this.allowedNetworkRuleLists);
    }

    /**
     * Specifies one or more IPv4 addresses (CIDR notation) that are denied access to your Snowflake account. **Do not** add `0.0.0.0/0` to `blocked_ip_list`, in order to block all IP addresses except a select list, you only need to add IP addresses to `allowed_ip_list`.
     * 
     */
    @Import(name="blockedIpLists")
    private @Nullable Output<List<String>> blockedIpLists;

    /**
     * @return Specifies one or more IPv4 addresses (CIDR notation) that are denied access to your Snowflake account. **Do not** add `0.0.0.0/0` to `blocked_ip_list`, in order to block all IP addresses except a select list, you only need to add IP addresses to `allowed_ip_list`.
     * 
     */
    public Optional<Output<List<String>>> blockedIpLists() {
        return Optional.ofNullable(this.blockedIpLists);
    }

    /**
     * Specifies a list of fully qualified network rules that contain the network identifiers that are denied access to Snowflake. For more information about this resource, see docs.
     * 
     */
    @Import(name="blockedNetworkRuleLists")
    private @Nullable Output<List<String>> blockedNetworkRuleLists;

    /**
     * @return Specifies a list of fully qualified network rules that contain the network identifiers that are denied access to Snowflake. For more information about this resource, see docs.
     * 
     */
    public Optional<Output<List<String>>> blockedNetworkRuleLists() {
        return Optional.ofNullable(this.blockedNetworkRuleLists);
    }

    /**
     * Specifies a comment for the network policy.
     * 
     */
    @Import(name="comment")
    private @Nullable Output<String> comment;

    /**
     * @return Specifies a comment for the network policy.
     * 
     */
    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    /**
     * Specifies the identifier for the network policy; must be unique for the account in which the network policy is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the identifier for the network policy; must be unique for the account in which the network policy is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private NetworkPolicyArgs() {}

    private NetworkPolicyArgs(NetworkPolicyArgs $) {
        this.allowedIpLists = $.allowedIpLists;
        this.allowedNetworkRuleLists = $.allowedNetworkRuleLists;
        this.blockedIpLists = $.blockedIpLists;
        this.blockedNetworkRuleLists = $.blockedNetworkRuleLists;
        this.comment = $.comment;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkPolicyArgs $;

        public Builder() {
            $ = new NetworkPolicyArgs();
        }

        public Builder(NetworkPolicyArgs defaults) {
            $ = new NetworkPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowedIpLists Specifies one or more IPv4 addresses (CIDR notation) that are allowed access to your Snowflake account.
         * 
         * @return builder
         * 
         */
        public Builder allowedIpLists(@Nullable Output<List<String>> allowedIpLists) {
            $.allowedIpLists = allowedIpLists;
            return this;
        }

        /**
         * @param allowedIpLists Specifies one or more IPv4 addresses (CIDR notation) that are allowed access to your Snowflake account.
         * 
         * @return builder
         * 
         */
        public Builder allowedIpLists(List<String> allowedIpLists) {
            return allowedIpLists(Output.of(allowedIpLists));
        }

        /**
         * @param allowedIpLists Specifies one or more IPv4 addresses (CIDR notation) that are allowed access to your Snowflake account.
         * 
         * @return builder
         * 
         */
        public Builder allowedIpLists(String... allowedIpLists) {
            return allowedIpLists(List.of(allowedIpLists));
        }

        /**
         * @param allowedNetworkRuleLists Specifies a list of fully qualified network rules that contain the network identifiers that are allowed access to Snowflake. For more information about this resource, see docs.
         * 
         * @return builder
         * 
         */
        public Builder allowedNetworkRuleLists(@Nullable Output<List<String>> allowedNetworkRuleLists) {
            $.allowedNetworkRuleLists = allowedNetworkRuleLists;
            return this;
        }

        /**
         * @param allowedNetworkRuleLists Specifies a list of fully qualified network rules that contain the network identifiers that are allowed access to Snowflake. For more information about this resource, see docs.
         * 
         * @return builder
         * 
         */
        public Builder allowedNetworkRuleLists(List<String> allowedNetworkRuleLists) {
            return allowedNetworkRuleLists(Output.of(allowedNetworkRuleLists));
        }

        /**
         * @param allowedNetworkRuleLists Specifies a list of fully qualified network rules that contain the network identifiers that are allowed access to Snowflake. For more information about this resource, see docs.
         * 
         * @return builder
         * 
         */
        public Builder allowedNetworkRuleLists(String... allowedNetworkRuleLists) {
            return allowedNetworkRuleLists(List.of(allowedNetworkRuleLists));
        }

        /**
         * @param blockedIpLists Specifies one or more IPv4 addresses (CIDR notation) that are denied access to your Snowflake account. **Do not** add `0.0.0.0/0` to `blocked_ip_list`, in order to block all IP addresses except a select list, you only need to add IP addresses to `allowed_ip_list`.
         * 
         * @return builder
         * 
         */
        public Builder blockedIpLists(@Nullable Output<List<String>> blockedIpLists) {
            $.blockedIpLists = blockedIpLists;
            return this;
        }

        /**
         * @param blockedIpLists Specifies one or more IPv4 addresses (CIDR notation) that are denied access to your Snowflake account. **Do not** add `0.0.0.0/0` to `blocked_ip_list`, in order to block all IP addresses except a select list, you only need to add IP addresses to `allowed_ip_list`.
         * 
         * @return builder
         * 
         */
        public Builder blockedIpLists(List<String> blockedIpLists) {
            return blockedIpLists(Output.of(blockedIpLists));
        }

        /**
         * @param blockedIpLists Specifies one or more IPv4 addresses (CIDR notation) that are denied access to your Snowflake account. **Do not** add `0.0.0.0/0` to `blocked_ip_list`, in order to block all IP addresses except a select list, you only need to add IP addresses to `allowed_ip_list`.
         * 
         * @return builder
         * 
         */
        public Builder blockedIpLists(String... blockedIpLists) {
            return blockedIpLists(List.of(blockedIpLists));
        }

        /**
         * @param blockedNetworkRuleLists Specifies a list of fully qualified network rules that contain the network identifiers that are denied access to Snowflake. For more information about this resource, see docs.
         * 
         * @return builder
         * 
         */
        public Builder blockedNetworkRuleLists(@Nullable Output<List<String>> blockedNetworkRuleLists) {
            $.blockedNetworkRuleLists = blockedNetworkRuleLists;
            return this;
        }

        /**
         * @param blockedNetworkRuleLists Specifies a list of fully qualified network rules that contain the network identifiers that are denied access to Snowflake. For more information about this resource, see docs.
         * 
         * @return builder
         * 
         */
        public Builder blockedNetworkRuleLists(List<String> blockedNetworkRuleLists) {
            return blockedNetworkRuleLists(Output.of(blockedNetworkRuleLists));
        }

        /**
         * @param blockedNetworkRuleLists Specifies a list of fully qualified network rules that contain the network identifiers that are denied access to Snowflake. For more information about this resource, see docs.
         * 
         * @return builder
         * 
         */
        public Builder blockedNetworkRuleLists(String... blockedNetworkRuleLists) {
            return blockedNetworkRuleLists(List.of(blockedNetworkRuleLists));
        }

        /**
         * @param comment Specifies a comment for the network policy.
         * 
         * @return builder
         * 
         */
        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        /**
         * @param comment Specifies a comment for the network policy.
         * 
         * @return builder
         * 
         */
        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        /**
         * @param name Specifies the identifier for the network policy; must be unique for the account in which the network policy is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the identifier for the network policy; must be unique for the account in which the network policy is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public NetworkPolicyArgs build() {
            return $;
        }
    }

}
