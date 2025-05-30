// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.snowflake.inputs.OauthIntegrationForCustomClientsDescribeOutputBlockedRolesListArgs;
import com.pulumi.snowflake.inputs.OauthIntegrationForCustomClientsDescribeOutputCommentArgs;
import com.pulumi.snowflake.inputs.OauthIntegrationForCustomClientsDescribeOutputEnabledArgs;
import com.pulumi.snowflake.inputs.OauthIntegrationForCustomClientsDescribeOutputNetworkPolicyArgs;
import com.pulumi.snowflake.inputs.OauthIntegrationForCustomClientsDescribeOutputOauthAllowNonTlsRedirectUriArgs;
import com.pulumi.snowflake.inputs.OauthIntegrationForCustomClientsDescribeOutputOauthAllowedAuthorizationEndpointArgs;
import com.pulumi.snowflake.inputs.OauthIntegrationForCustomClientsDescribeOutputOauthAllowedTokenEndpointArgs;
import com.pulumi.snowflake.inputs.OauthIntegrationForCustomClientsDescribeOutputOauthAuthorizationEndpointArgs;
import com.pulumi.snowflake.inputs.OauthIntegrationForCustomClientsDescribeOutputOauthClientRsaPublicKey2FpArgs;
import com.pulumi.snowflake.inputs.OauthIntegrationForCustomClientsDescribeOutputOauthClientRsaPublicKeyFpArgs;
import com.pulumi.snowflake.inputs.OauthIntegrationForCustomClientsDescribeOutputOauthClientTypeArgs;
import com.pulumi.snowflake.inputs.OauthIntegrationForCustomClientsDescribeOutputOauthEnforcePkceArgs;
import com.pulumi.snowflake.inputs.OauthIntegrationForCustomClientsDescribeOutputOauthIssueRefreshTokenArgs;
import com.pulumi.snowflake.inputs.OauthIntegrationForCustomClientsDescribeOutputOauthRefreshTokenValidityArgs;
import com.pulumi.snowflake.inputs.OauthIntegrationForCustomClientsDescribeOutputOauthTokenEndpointArgs;
import com.pulumi.snowflake.inputs.OauthIntegrationForCustomClientsDescribeOutputOauthUseSecondaryRoleArgs;
import com.pulumi.snowflake.inputs.OauthIntegrationForCustomClientsDescribeOutputPreAuthorizedRolesListArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OauthIntegrationForCustomClientsDescribeOutputArgs extends com.pulumi.resources.ResourceArgs {

    public static final OauthIntegrationForCustomClientsDescribeOutputArgs Empty = new OauthIntegrationForCustomClientsDescribeOutputArgs();

    @Import(name="blockedRolesLists")
    private @Nullable Output<List<OauthIntegrationForCustomClientsDescribeOutputBlockedRolesListArgs>> blockedRolesLists;

    public Optional<Output<List<OauthIntegrationForCustomClientsDescribeOutputBlockedRolesListArgs>>> blockedRolesLists() {
        return Optional.ofNullable(this.blockedRolesLists);
    }

    @Import(name="comments")
    private @Nullable Output<List<OauthIntegrationForCustomClientsDescribeOutputCommentArgs>> comments;

    public Optional<Output<List<OauthIntegrationForCustomClientsDescribeOutputCommentArgs>>> comments() {
        return Optional.ofNullable(this.comments);
    }

    @Import(name="enableds")
    private @Nullable Output<List<OauthIntegrationForCustomClientsDescribeOutputEnabledArgs>> enableds;

    public Optional<Output<List<OauthIntegrationForCustomClientsDescribeOutputEnabledArgs>>> enableds() {
        return Optional.ofNullable(this.enableds);
    }

    @Import(name="networkPolicies")
    private @Nullable Output<List<OauthIntegrationForCustomClientsDescribeOutputNetworkPolicyArgs>> networkPolicies;

    public Optional<Output<List<OauthIntegrationForCustomClientsDescribeOutputNetworkPolicyArgs>>> networkPolicies() {
        return Optional.ofNullable(this.networkPolicies);
    }

    @Import(name="oauthAllowNonTlsRedirectUris")
    private @Nullable Output<List<OauthIntegrationForCustomClientsDescribeOutputOauthAllowNonTlsRedirectUriArgs>> oauthAllowNonTlsRedirectUris;

    public Optional<Output<List<OauthIntegrationForCustomClientsDescribeOutputOauthAllowNonTlsRedirectUriArgs>>> oauthAllowNonTlsRedirectUris() {
        return Optional.ofNullable(this.oauthAllowNonTlsRedirectUris);
    }

    @Import(name="oauthAllowedAuthorizationEndpoints")
    private @Nullable Output<List<OauthIntegrationForCustomClientsDescribeOutputOauthAllowedAuthorizationEndpointArgs>> oauthAllowedAuthorizationEndpoints;

    public Optional<Output<List<OauthIntegrationForCustomClientsDescribeOutputOauthAllowedAuthorizationEndpointArgs>>> oauthAllowedAuthorizationEndpoints() {
        return Optional.ofNullable(this.oauthAllowedAuthorizationEndpoints);
    }

    @Import(name="oauthAllowedTokenEndpoints")
    private @Nullable Output<List<OauthIntegrationForCustomClientsDescribeOutputOauthAllowedTokenEndpointArgs>> oauthAllowedTokenEndpoints;

    public Optional<Output<List<OauthIntegrationForCustomClientsDescribeOutputOauthAllowedTokenEndpointArgs>>> oauthAllowedTokenEndpoints() {
        return Optional.ofNullable(this.oauthAllowedTokenEndpoints);
    }

    @Import(name="oauthAuthorizationEndpoints")
    private @Nullable Output<List<OauthIntegrationForCustomClientsDescribeOutputOauthAuthorizationEndpointArgs>> oauthAuthorizationEndpoints;

    public Optional<Output<List<OauthIntegrationForCustomClientsDescribeOutputOauthAuthorizationEndpointArgs>>> oauthAuthorizationEndpoints() {
        return Optional.ofNullable(this.oauthAuthorizationEndpoints);
    }

    @Import(name="oauthClientRsaPublicKey2Fps")
    private @Nullable Output<List<OauthIntegrationForCustomClientsDescribeOutputOauthClientRsaPublicKey2FpArgs>> oauthClientRsaPublicKey2Fps;

    public Optional<Output<List<OauthIntegrationForCustomClientsDescribeOutputOauthClientRsaPublicKey2FpArgs>>> oauthClientRsaPublicKey2Fps() {
        return Optional.ofNullable(this.oauthClientRsaPublicKey2Fps);
    }

    @Import(name="oauthClientRsaPublicKeyFps")
    private @Nullable Output<List<OauthIntegrationForCustomClientsDescribeOutputOauthClientRsaPublicKeyFpArgs>> oauthClientRsaPublicKeyFps;

    public Optional<Output<List<OauthIntegrationForCustomClientsDescribeOutputOauthClientRsaPublicKeyFpArgs>>> oauthClientRsaPublicKeyFps() {
        return Optional.ofNullable(this.oauthClientRsaPublicKeyFps);
    }

    @Import(name="oauthClientTypes")
    private @Nullable Output<List<OauthIntegrationForCustomClientsDescribeOutputOauthClientTypeArgs>> oauthClientTypes;

    public Optional<Output<List<OauthIntegrationForCustomClientsDescribeOutputOauthClientTypeArgs>>> oauthClientTypes() {
        return Optional.ofNullable(this.oauthClientTypes);
    }

    @Import(name="oauthEnforcePkces")
    private @Nullable Output<List<OauthIntegrationForCustomClientsDescribeOutputOauthEnforcePkceArgs>> oauthEnforcePkces;

    public Optional<Output<List<OauthIntegrationForCustomClientsDescribeOutputOauthEnforcePkceArgs>>> oauthEnforcePkces() {
        return Optional.ofNullable(this.oauthEnforcePkces);
    }

    @Import(name="oauthIssueRefreshTokens")
    private @Nullable Output<List<OauthIntegrationForCustomClientsDescribeOutputOauthIssueRefreshTokenArgs>> oauthIssueRefreshTokens;

    public Optional<Output<List<OauthIntegrationForCustomClientsDescribeOutputOauthIssueRefreshTokenArgs>>> oauthIssueRefreshTokens() {
        return Optional.ofNullable(this.oauthIssueRefreshTokens);
    }

    @Import(name="oauthRefreshTokenValidities")
    private @Nullable Output<List<OauthIntegrationForCustomClientsDescribeOutputOauthRefreshTokenValidityArgs>> oauthRefreshTokenValidities;

    public Optional<Output<List<OauthIntegrationForCustomClientsDescribeOutputOauthRefreshTokenValidityArgs>>> oauthRefreshTokenValidities() {
        return Optional.ofNullable(this.oauthRefreshTokenValidities);
    }

    @Import(name="oauthTokenEndpoints")
    private @Nullable Output<List<OauthIntegrationForCustomClientsDescribeOutputOauthTokenEndpointArgs>> oauthTokenEndpoints;

    public Optional<Output<List<OauthIntegrationForCustomClientsDescribeOutputOauthTokenEndpointArgs>>> oauthTokenEndpoints() {
        return Optional.ofNullable(this.oauthTokenEndpoints);
    }

    @Import(name="oauthUseSecondaryRoles")
    private @Nullable Output<List<OauthIntegrationForCustomClientsDescribeOutputOauthUseSecondaryRoleArgs>> oauthUseSecondaryRoles;

    public Optional<Output<List<OauthIntegrationForCustomClientsDescribeOutputOauthUseSecondaryRoleArgs>>> oauthUseSecondaryRoles() {
        return Optional.ofNullable(this.oauthUseSecondaryRoles);
    }

    @Import(name="preAuthorizedRolesLists")
    private @Nullable Output<List<OauthIntegrationForCustomClientsDescribeOutputPreAuthorizedRolesListArgs>> preAuthorizedRolesLists;

    public Optional<Output<List<OauthIntegrationForCustomClientsDescribeOutputPreAuthorizedRolesListArgs>>> preAuthorizedRolesLists() {
        return Optional.ofNullable(this.preAuthorizedRolesLists);
    }

    private OauthIntegrationForCustomClientsDescribeOutputArgs() {}

    private OauthIntegrationForCustomClientsDescribeOutputArgs(OauthIntegrationForCustomClientsDescribeOutputArgs $) {
        this.blockedRolesLists = $.blockedRolesLists;
        this.comments = $.comments;
        this.enableds = $.enableds;
        this.networkPolicies = $.networkPolicies;
        this.oauthAllowNonTlsRedirectUris = $.oauthAllowNonTlsRedirectUris;
        this.oauthAllowedAuthorizationEndpoints = $.oauthAllowedAuthorizationEndpoints;
        this.oauthAllowedTokenEndpoints = $.oauthAllowedTokenEndpoints;
        this.oauthAuthorizationEndpoints = $.oauthAuthorizationEndpoints;
        this.oauthClientRsaPublicKey2Fps = $.oauthClientRsaPublicKey2Fps;
        this.oauthClientRsaPublicKeyFps = $.oauthClientRsaPublicKeyFps;
        this.oauthClientTypes = $.oauthClientTypes;
        this.oauthEnforcePkces = $.oauthEnforcePkces;
        this.oauthIssueRefreshTokens = $.oauthIssueRefreshTokens;
        this.oauthRefreshTokenValidities = $.oauthRefreshTokenValidities;
        this.oauthTokenEndpoints = $.oauthTokenEndpoints;
        this.oauthUseSecondaryRoles = $.oauthUseSecondaryRoles;
        this.preAuthorizedRolesLists = $.preAuthorizedRolesLists;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OauthIntegrationForCustomClientsDescribeOutputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OauthIntegrationForCustomClientsDescribeOutputArgs $;

        public Builder() {
            $ = new OauthIntegrationForCustomClientsDescribeOutputArgs();
        }

        public Builder(OauthIntegrationForCustomClientsDescribeOutputArgs defaults) {
            $ = new OauthIntegrationForCustomClientsDescribeOutputArgs(Objects.requireNonNull(defaults));
        }

        public Builder blockedRolesLists(@Nullable Output<List<OauthIntegrationForCustomClientsDescribeOutputBlockedRolesListArgs>> blockedRolesLists) {
            $.blockedRolesLists = blockedRolesLists;
            return this;
        }

        public Builder blockedRolesLists(List<OauthIntegrationForCustomClientsDescribeOutputBlockedRolesListArgs> blockedRolesLists) {
            return blockedRolesLists(Output.of(blockedRolesLists));
        }

        public Builder blockedRolesLists(OauthIntegrationForCustomClientsDescribeOutputBlockedRolesListArgs... blockedRolesLists) {
            return blockedRolesLists(List.of(blockedRolesLists));
        }

        public Builder comments(@Nullable Output<List<OauthIntegrationForCustomClientsDescribeOutputCommentArgs>> comments) {
            $.comments = comments;
            return this;
        }

        public Builder comments(List<OauthIntegrationForCustomClientsDescribeOutputCommentArgs> comments) {
            return comments(Output.of(comments));
        }

        public Builder comments(OauthIntegrationForCustomClientsDescribeOutputCommentArgs... comments) {
            return comments(List.of(comments));
        }

        public Builder enableds(@Nullable Output<List<OauthIntegrationForCustomClientsDescribeOutputEnabledArgs>> enableds) {
            $.enableds = enableds;
            return this;
        }

        public Builder enableds(List<OauthIntegrationForCustomClientsDescribeOutputEnabledArgs> enableds) {
            return enableds(Output.of(enableds));
        }

        public Builder enableds(OauthIntegrationForCustomClientsDescribeOutputEnabledArgs... enableds) {
            return enableds(List.of(enableds));
        }

        public Builder networkPolicies(@Nullable Output<List<OauthIntegrationForCustomClientsDescribeOutputNetworkPolicyArgs>> networkPolicies) {
            $.networkPolicies = networkPolicies;
            return this;
        }

        public Builder networkPolicies(List<OauthIntegrationForCustomClientsDescribeOutputNetworkPolicyArgs> networkPolicies) {
            return networkPolicies(Output.of(networkPolicies));
        }

        public Builder networkPolicies(OauthIntegrationForCustomClientsDescribeOutputNetworkPolicyArgs... networkPolicies) {
            return networkPolicies(List.of(networkPolicies));
        }

        public Builder oauthAllowNonTlsRedirectUris(@Nullable Output<List<OauthIntegrationForCustomClientsDescribeOutputOauthAllowNonTlsRedirectUriArgs>> oauthAllowNonTlsRedirectUris) {
            $.oauthAllowNonTlsRedirectUris = oauthAllowNonTlsRedirectUris;
            return this;
        }

        public Builder oauthAllowNonTlsRedirectUris(List<OauthIntegrationForCustomClientsDescribeOutputOauthAllowNonTlsRedirectUriArgs> oauthAllowNonTlsRedirectUris) {
            return oauthAllowNonTlsRedirectUris(Output.of(oauthAllowNonTlsRedirectUris));
        }

        public Builder oauthAllowNonTlsRedirectUris(OauthIntegrationForCustomClientsDescribeOutputOauthAllowNonTlsRedirectUriArgs... oauthAllowNonTlsRedirectUris) {
            return oauthAllowNonTlsRedirectUris(List.of(oauthAllowNonTlsRedirectUris));
        }

        public Builder oauthAllowedAuthorizationEndpoints(@Nullable Output<List<OauthIntegrationForCustomClientsDescribeOutputOauthAllowedAuthorizationEndpointArgs>> oauthAllowedAuthorizationEndpoints) {
            $.oauthAllowedAuthorizationEndpoints = oauthAllowedAuthorizationEndpoints;
            return this;
        }

        public Builder oauthAllowedAuthorizationEndpoints(List<OauthIntegrationForCustomClientsDescribeOutputOauthAllowedAuthorizationEndpointArgs> oauthAllowedAuthorizationEndpoints) {
            return oauthAllowedAuthorizationEndpoints(Output.of(oauthAllowedAuthorizationEndpoints));
        }

        public Builder oauthAllowedAuthorizationEndpoints(OauthIntegrationForCustomClientsDescribeOutputOauthAllowedAuthorizationEndpointArgs... oauthAllowedAuthorizationEndpoints) {
            return oauthAllowedAuthorizationEndpoints(List.of(oauthAllowedAuthorizationEndpoints));
        }

        public Builder oauthAllowedTokenEndpoints(@Nullable Output<List<OauthIntegrationForCustomClientsDescribeOutputOauthAllowedTokenEndpointArgs>> oauthAllowedTokenEndpoints) {
            $.oauthAllowedTokenEndpoints = oauthAllowedTokenEndpoints;
            return this;
        }

        public Builder oauthAllowedTokenEndpoints(List<OauthIntegrationForCustomClientsDescribeOutputOauthAllowedTokenEndpointArgs> oauthAllowedTokenEndpoints) {
            return oauthAllowedTokenEndpoints(Output.of(oauthAllowedTokenEndpoints));
        }

        public Builder oauthAllowedTokenEndpoints(OauthIntegrationForCustomClientsDescribeOutputOauthAllowedTokenEndpointArgs... oauthAllowedTokenEndpoints) {
            return oauthAllowedTokenEndpoints(List.of(oauthAllowedTokenEndpoints));
        }

        public Builder oauthAuthorizationEndpoints(@Nullable Output<List<OauthIntegrationForCustomClientsDescribeOutputOauthAuthorizationEndpointArgs>> oauthAuthorizationEndpoints) {
            $.oauthAuthorizationEndpoints = oauthAuthorizationEndpoints;
            return this;
        }

        public Builder oauthAuthorizationEndpoints(List<OauthIntegrationForCustomClientsDescribeOutputOauthAuthorizationEndpointArgs> oauthAuthorizationEndpoints) {
            return oauthAuthorizationEndpoints(Output.of(oauthAuthorizationEndpoints));
        }

        public Builder oauthAuthorizationEndpoints(OauthIntegrationForCustomClientsDescribeOutputOauthAuthorizationEndpointArgs... oauthAuthorizationEndpoints) {
            return oauthAuthorizationEndpoints(List.of(oauthAuthorizationEndpoints));
        }

        public Builder oauthClientRsaPublicKey2Fps(@Nullable Output<List<OauthIntegrationForCustomClientsDescribeOutputOauthClientRsaPublicKey2FpArgs>> oauthClientRsaPublicKey2Fps) {
            $.oauthClientRsaPublicKey2Fps = oauthClientRsaPublicKey2Fps;
            return this;
        }

        public Builder oauthClientRsaPublicKey2Fps(List<OauthIntegrationForCustomClientsDescribeOutputOauthClientRsaPublicKey2FpArgs> oauthClientRsaPublicKey2Fps) {
            return oauthClientRsaPublicKey2Fps(Output.of(oauthClientRsaPublicKey2Fps));
        }

        public Builder oauthClientRsaPublicKey2Fps(OauthIntegrationForCustomClientsDescribeOutputOauthClientRsaPublicKey2FpArgs... oauthClientRsaPublicKey2Fps) {
            return oauthClientRsaPublicKey2Fps(List.of(oauthClientRsaPublicKey2Fps));
        }

        public Builder oauthClientRsaPublicKeyFps(@Nullable Output<List<OauthIntegrationForCustomClientsDescribeOutputOauthClientRsaPublicKeyFpArgs>> oauthClientRsaPublicKeyFps) {
            $.oauthClientRsaPublicKeyFps = oauthClientRsaPublicKeyFps;
            return this;
        }

        public Builder oauthClientRsaPublicKeyFps(List<OauthIntegrationForCustomClientsDescribeOutputOauthClientRsaPublicKeyFpArgs> oauthClientRsaPublicKeyFps) {
            return oauthClientRsaPublicKeyFps(Output.of(oauthClientRsaPublicKeyFps));
        }

        public Builder oauthClientRsaPublicKeyFps(OauthIntegrationForCustomClientsDescribeOutputOauthClientRsaPublicKeyFpArgs... oauthClientRsaPublicKeyFps) {
            return oauthClientRsaPublicKeyFps(List.of(oauthClientRsaPublicKeyFps));
        }

        public Builder oauthClientTypes(@Nullable Output<List<OauthIntegrationForCustomClientsDescribeOutputOauthClientTypeArgs>> oauthClientTypes) {
            $.oauthClientTypes = oauthClientTypes;
            return this;
        }

        public Builder oauthClientTypes(List<OauthIntegrationForCustomClientsDescribeOutputOauthClientTypeArgs> oauthClientTypes) {
            return oauthClientTypes(Output.of(oauthClientTypes));
        }

        public Builder oauthClientTypes(OauthIntegrationForCustomClientsDescribeOutputOauthClientTypeArgs... oauthClientTypes) {
            return oauthClientTypes(List.of(oauthClientTypes));
        }

        public Builder oauthEnforcePkces(@Nullable Output<List<OauthIntegrationForCustomClientsDescribeOutputOauthEnforcePkceArgs>> oauthEnforcePkces) {
            $.oauthEnforcePkces = oauthEnforcePkces;
            return this;
        }

        public Builder oauthEnforcePkces(List<OauthIntegrationForCustomClientsDescribeOutputOauthEnforcePkceArgs> oauthEnforcePkces) {
            return oauthEnforcePkces(Output.of(oauthEnforcePkces));
        }

        public Builder oauthEnforcePkces(OauthIntegrationForCustomClientsDescribeOutputOauthEnforcePkceArgs... oauthEnforcePkces) {
            return oauthEnforcePkces(List.of(oauthEnforcePkces));
        }

        public Builder oauthIssueRefreshTokens(@Nullable Output<List<OauthIntegrationForCustomClientsDescribeOutputOauthIssueRefreshTokenArgs>> oauthIssueRefreshTokens) {
            $.oauthIssueRefreshTokens = oauthIssueRefreshTokens;
            return this;
        }

        public Builder oauthIssueRefreshTokens(List<OauthIntegrationForCustomClientsDescribeOutputOauthIssueRefreshTokenArgs> oauthIssueRefreshTokens) {
            return oauthIssueRefreshTokens(Output.of(oauthIssueRefreshTokens));
        }

        public Builder oauthIssueRefreshTokens(OauthIntegrationForCustomClientsDescribeOutputOauthIssueRefreshTokenArgs... oauthIssueRefreshTokens) {
            return oauthIssueRefreshTokens(List.of(oauthIssueRefreshTokens));
        }

        public Builder oauthRefreshTokenValidities(@Nullable Output<List<OauthIntegrationForCustomClientsDescribeOutputOauthRefreshTokenValidityArgs>> oauthRefreshTokenValidities) {
            $.oauthRefreshTokenValidities = oauthRefreshTokenValidities;
            return this;
        }

        public Builder oauthRefreshTokenValidities(List<OauthIntegrationForCustomClientsDescribeOutputOauthRefreshTokenValidityArgs> oauthRefreshTokenValidities) {
            return oauthRefreshTokenValidities(Output.of(oauthRefreshTokenValidities));
        }

        public Builder oauthRefreshTokenValidities(OauthIntegrationForCustomClientsDescribeOutputOauthRefreshTokenValidityArgs... oauthRefreshTokenValidities) {
            return oauthRefreshTokenValidities(List.of(oauthRefreshTokenValidities));
        }

        public Builder oauthTokenEndpoints(@Nullable Output<List<OauthIntegrationForCustomClientsDescribeOutputOauthTokenEndpointArgs>> oauthTokenEndpoints) {
            $.oauthTokenEndpoints = oauthTokenEndpoints;
            return this;
        }

        public Builder oauthTokenEndpoints(List<OauthIntegrationForCustomClientsDescribeOutputOauthTokenEndpointArgs> oauthTokenEndpoints) {
            return oauthTokenEndpoints(Output.of(oauthTokenEndpoints));
        }

        public Builder oauthTokenEndpoints(OauthIntegrationForCustomClientsDescribeOutputOauthTokenEndpointArgs... oauthTokenEndpoints) {
            return oauthTokenEndpoints(List.of(oauthTokenEndpoints));
        }

        public Builder oauthUseSecondaryRoles(@Nullable Output<List<OauthIntegrationForCustomClientsDescribeOutputOauthUseSecondaryRoleArgs>> oauthUseSecondaryRoles) {
            $.oauthUseSecondaryRoles = oauthUseSecondaryRoles;
            return this;
        }

        public Builder oauthUseSecondaryRoles(List<OauthIntegrationForCustomClientsDescribeOutputOauthUseSecondaryRoleArgs> oauthUseSecondaryRoles) {
            return oauthUseSecondaryRoles(Output.of(oauthUseSecondaryRoles));
        }

        public Builder oauthUseSecondaryRoles(OauthIntegrationForCustomClientsDescribeOutputOauthUseSecondaryRoleArgs... oauthUseSecondaryRoles) {
            return oauthUseSecondaryRoles(List.of(oauthUseSecondaryRoles));
        }

        public Builder preAuthorizedRolesLists(@Nullable Output<List<OauthIntegrationForCustomClientsDescribeOutputPreAuthorizedRolesListArgs>> preAuthorizedRolesLists) {
            $.preAuthorizedRolesLists = preAuthorizedRolesLists;
            return this;
        }

        public Builder preAuthorizedRolesLists(List<OauthIntegrationForCustomClientsDescribeOutputPreAuthorizedRolesListArgs> preAuthorizedRolesLists) {
            return preAuthorizedRolesLists(Output.of(preAuthorizedRolesLists));
        }

        public Builder preAuthorizedRolesLists(OauthIntegrationForCustomClientsDescribeOutputPreAuthorizedRolesListArgs... preAuthorizedRolesLists) {
            return preAuthorizedRolesLists(List.of(preAuthorizedRolesLists));
        }

        public OauthIntegrationForCustomClientsDescribeOutputArgs build() {
            return $;
        }
    }

}
