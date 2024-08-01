// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OauthIntegrationForPartnerApplicationsDescribeOutputPreAuthorizedRolesListArgs extends com.pulumi.resources.ResourceArgs {

    public static final OauthIntegrationForPartnerApplicationsDescribeOutputPreAuthorizedRolesListArgs Empty = new OauthIntegrationForPartnerApplicationsDescribeOutputPreAuthorizedRolesListArgs();

    @Import(name="default")
    private @Nullable Output<String> default_;

    public Optional<Output<String>> default_() {
        return Optional.ofNullable(this.default_);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="type")
    private @Nullable Output<String> type;

    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    @Import(name="value")
    private @Nullable Output<String> value;

    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private OauthIntegrationForPartnerApplicationsDescribeOutputPreAuthorizedRolesListArgs() {}

    private OauthIntegrationForPartnerApplicationsDescribeOutputPreAuthorizedRolesListArgs(OauthIntegrationForPartnerApplicationsDescribeOutputPreAuthorizedRolesListArgs $) {
        this.default_ = $.default_;
        this.name = $.name;
        this.type = $.type;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OauthIntegrationForPartnerApplicationsDescribeOutputPreAuthorizedRolesListArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OauthIntegrationForPartnerApplicationsDescribeOutputPreAuthorizedRolesListArgs $;

        public Builder() {
            $ = new OauthIntegrationForPartnerApplicationsDescribeOutputPreAuthorizedRolesListArgs();
        }

        public Builder(OauthIntegrationForPartnerApplicationsDescribeOutputPreAuthorizedRolesListArgs defaults) {
            $ = new OauthIntegrationForPartnerApplicationsDescribeOutputPreAuthorizedRolesListArgs(Objects.requireNonNull(defaults));
        }

        public Builder default_(@Nullable Output<String> default_) {
            $.default_ = default_;
            return this;
        }

        public Builder default_(String default_) {
            return default_(Output.of(default_));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        public Builder value(String value) {
            return value(Output.of(value));
        }

        public OauthIntegrationForPartnerApplicationsDescribeOutputPreAuthorizedRolesListArgs build() {
            return $;
        }
    }

}
