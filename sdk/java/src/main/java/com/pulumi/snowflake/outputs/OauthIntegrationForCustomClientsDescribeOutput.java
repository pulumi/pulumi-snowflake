// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.snowflake.outputs.OauthIntegrationForCustomClientsDescribeOutputBlockedRolesList;
import com.pulumi.snowflake.outputs.OauthIntegrationForCustomClientsDescribeOutputComment;
import com.pulumi.snowflake.outputs.OauthIntegrationForCustomClientsDescribeOutputEnabled;
import com.pulumi.snowflake.outputs.OauthIntegrationForCustomClientsDescribeOutputNetworkPolicy;
import com.pulumi.snowflake.outputs.OauthIntegrationForCustomClientsDescribeOutputOauthAllowNonTlsRedirectUri;
import com.pulumi.snowflake.outputs.OauthIntegrationForCustomClientsDescribeOutputOauthAllowedAuthorizationEndpoint;
import com.pulumi.snowflake.outputs.OauthIntegrationForCustomClientsDescribeOutputOauthAllowedTokenEndpoint;
import com.pulumi.snowflake.outputs.OauthIntegrationForCustomClientsDescribeOutputOauthAuthorizationEndpoint;
import com.pulumi.snowflake.outputs.OauthIntegrationForCustomClientsDescribeOutputOauthClientRsaPublicKey2Fp;
import com.pulumi.snowflake.outputs.OauthIntegrationForCustomClientsDescribeOutputOauthClientRsaPublicKeyFp;
import com.pulumi.snowflake.outputs.OauthIntegrationForCustomClientsDescribeOutputOauthClientType;
import com.pulumi.snowflake.outputs.OauthIntegrationForCustomClientsDescribeOutputOauthEnforcePkce;
import com.pulumi.snowflake.outputs.OauthIntegrationForCustomClientsDescribeOutputOauthIssueRefreshToken;
import com.pulumi.snowflake.outputs.OauthIntegrationForCustomClientsDescribeOutputOauthRefreshTokenValidity;
import com.pulumi.snowflake.outputs.OauthIntegrationForCustomClientsDescribeOutputOauthTokenEndpoint;
import com.pulumi.snowflake.outputs.OauthIntegrationForCustomClientsDescribeOutputOauthUseSecondaryRole;
import com.pulumi.snowflake.outputs.OauthIntegrationForCustomClientsDescribeOutputPreAuthorizedRolesList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class OauthIntegrationForCustomClientsDescribeOutput {
    private @Nullable List<OauthIntegrationForCustomClientsDescribeOutputBlockedRolesList> blockedRolesLists;
    private @Nullable List<OauthIntegrationForCustomClientsDescribeOutputComment> comments;
    private @Nullable List<OauthIntegrationForCustomClientsDescribeOutputEnabled> enableds;
    private @Nullable List<OauthIntegrationForCustomClientsDescribeOutputNetworkPolicy> networkPolicies;
    private @Nullable List<OauthIntegrationForCustomClientsDescribeOutputOauthAllowNonTlsRedirectUri> oauthAllowNonTlsRedirectUris;
    private @Nullable List<OauthIntegrationForCustomClientsDescribeOutputOauthAllowedAuthorizationEndpoint> oauthAllowedAuthorizationEndpoints;
    private @Nullable List<OauthIntegrationForCustomClientsDescribeOutputOauthAllowedTokenEndpoint> oauthAllowedTokenEndpoints;
    private @Nullable List<OauthIntegrationForCustomClientsDescribeOutputOauthAuthorizationEndpoint> oauthAuthorizationEndpoints;
    private @Nullable List<OauthIntegrationForCustomClientsDescribeOutputOauthClientRsaPublicKey2Fp> oauthClientRsaPublicKey2Fps;
    private @Nullable List<OauthIntegrationForCustomClientsDescribeOutputOauthClientRsaPublicKeyFp> oauthClientRsaPublicKeyFps;
    private @Nullable List<OauthIntegrationForCustomClientsDescribeOutputOauthClientType> oauthClientTypes;
    private @Nullable List<OauthIntegrationForCustomClientsDescribeOutputOauthEnforcePkce> oauthEnforcePkces;
    private @Nullable List<OauthIntegrationForCustomClientsDescribeOutputOauthIssueRefreshToken> oauthIssueRefreshTokens;
    private @Nullable List<OauthIntegrationForCustomClientsDescribeOutputOauthRefreshTokenValidity> oauthRefreshTokenValidities;
    private @Nullable List<OauthIntegrationForCustomClientsDescribeOutputOauthTokenEndpoint> oauthTokenEndpoints;
    private @Nullable List<OauthIntegrationForCustomClientsDescribeOutputOauthUseSecondaryRole> oauthUseSecondaryRoles;
    private @Nullable List<OauthIntegrationForCustomClientsDescribeOutputPreAuthorizedRolesList> preAuthorizedRolesLists;

    private OauthIntegrationForCustomClientsDescribeOutput() {}
    public List<OauthIntegrationForCustomClientsDescribeOutputBlockedRolesList> blockedRolesLists() {
        return this.blockedRolesLists == null ? List.of() : this.blockedRolesLists;
    }
    public List<OauthIntegrationForCustomClientsDescribeOutputComment> comments() {
        return this.comments == null ? List.of() : this.comments;
    }
    public List<OauthIntegrationForCustomClientsDescribeOutputEnabled> enableds() {
        return this.enableds == null ? List.of() : this.enableds;
    }
    public List<OauthIntegrationForCustomClientsDescribeOutputNetworkPolicy> networkPolicies() {
        return this.networkPolicies == null ? List.of() : this.networkPolicies;
    }
    public List<OauthIntegrationForCustomClientsDescribeOutputOauthAllowNonTlsRedirectUri> oauthAllowNonTlsRedirectUris() {
        return this.oauthAllowNonTlsRedirectUris == null ? List.of() : this.oauthAllowNonTlsRedirectUris;
    }
    public List<OauthIntegrationForCustomClientsDescribeOutputOauthAllowedAuthorizationEndpoint> oauthAllowedAuthorizationEndpoints() {
        return this.oauthAllowedAuthorizationEndpoints == null ? List.of() : this.oauthAllowedAuthorizationEndpoints;
    }
    public List<OauthIntegrationForCustomClientsDescribeOutputOauthAllowedTokenEndpoint> oauthAllowedTokenEndpoints() {
        return this.oauthAllowedTokenEndpoints == null ? List.of() : this.oauthAllowedTokenEndpoints;
    }
    public List<OauthIntegrationForCustomClientsDescribeOutputOauthAuthorizationEndpoint> oauthAuthorizationEndpoints() {
        return this.oauthAuthorizationEndpoints == null ? List.of() : this.oauthAuthorizationEndpoints;
    }
    public List<OauthIntegrationForCustomClientsDescribeOutputOauthClientRsaPublicKey2Fp> oauthClientRsaPublicKey2Fps() {
        return this.oauthClientRsaPublicKey2Fps == null ? List.of() : this.oauthClientRsaPublicKey2Fps;
    }
    public List<OauthIntegrationForCustomClientsDescribeOutputOauthClientRsaPublicKeyFp> oauthClientRsaPublicKeyFps() {
        return this.oauthClientRsaPublicKeyFps == null ? List.of() : this.oauthClientRsaPublicKeyFps;
    }
    public List<OauthIntegrationForCustomClientsDescribeOutputOauthClientType> oauthClientTypes() {
        return this.oauthClientTypes == null ? List.of() : this.oauthClientTypes;
    }
    public List<OauthIntegrationForCustomClientsDescribeOutputOauthEnforcePkce> oauthEnforcePkces() {
        return this.oauthEnforcePkces == null ? List.of() : this.oauthEnforcePkces;
    }
    public List<OauthIntegrationForCustomClientsDescribeOutputOauthIssueRefreshToken> oauthIssueRefreshTokens() {
        return this.oauthIssueRefreshTokens == null ? List.of() : this.oauthIssueRefreshTokens;
    }
    public List<OauthIntegrationForCustomClientsDescribeOutputOauthRefreshTokenValidity> oauthRefreshTokenValidities() {
        return this.oauthRefreshTokenValidities == null ? List.of() : this.oauthRefreshTokenValidities;
    }
    public List<OauthIntegrationForCustomClientsDescribeOutputOauthTokenEndpoint> oauthTokenEndpoints() {
        return this.oauthTokenEndpoints == null ? List.of() : this.oauthTokenEndpoints;
    }
    public List<OauthIntegrationForCustomClientsDescribeOutputOauthUseSecondaryRole> oauthUseSecondaryRoles() {
        return this.oauthUseSecondaryRoles == null ? List.of() : this.oauthUseSecondaryRoles;
    }
    public List<OauthIntegrationForCustomClientsDescribeOutputPreAuthorizedRolesList> preAuthorizedRolesLists() {
        return this.preAuthorizedRolesLists == null ? List.of() : this.preAuthorizedRolesLists;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OauthIntegrationForCustomClientsDescribeOutput defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<OauthIntegrationForCustomClientsDescribeOutputBlockedRolesList> blockedRolesLists;
        private @Nullable List<OauthIntegrationForCustomClientsDescribeOutputComment> comments;
        private @Nullable List<OauthIntegrationForCustomClientsDescribeOutputEnabled> enableds;
        private @Nullable List<OauthIntegrationForCustomClientsDescribeOutputNetworkPolicy> networkPolicies;
        private @Nullable List<OauthIntegrationForCustomClientsDescribeOutputOauthAllowNonTlsRedirectUri> oauthAllowNonTlsRedirectUris;
        private @Nullable List<OauthIntegrationForCustomClientsDescribeOutputOauthAllowedAuthorizationEndpoint> oauthAllowedAuthorizationEndpoints;
        private @Nullable List<OauthIntegrationForCustomClientsDescribeOutputOauthAllowedTokenEndpoint> oauthAllowedTokenEndpoints;
        private @Nullable List<OauthIntegrationForCustomClientsDescribeOutputOauthAuthorizationEndpoint> oauthAuthorizationEndpoints;
        private @Nullable List<OauthIntegrationForCustomClientsDescribeOutputOauthClientRsaPublicKey2Fp> oauthClientRsaPublicKey2Fps;
        private @Nullable List<OauthIntegrationForCustomClientsDescribeOutputOauthClientRsaPublicKeyFp> oauthClientRsaPublicKeyFps;
        private @Nullable List<OauthIntegrationForCustomClientsDescribeOutputOauthClientType> oauthClientTypes;
        private @Nullable List<OauthIntegrationForCustomClientsDescribeOutputOauthEnforcePkce> oauthEnforcePkces;
        private @Nullable List<OauthIntegrationForCustomClientsDescribeOutputOauthIssueRefreshToken> oauthIssueRefreshTokens;
        private @Nullable List<OauthIntegrationForCustomClientsDescribeOutputOauthRefreshTokenValidity> oauthRefreshTokenValidities;
        private @Nullable List<OauthIntegrationForCustomClientsDescribeOutputOauthTokenEndpoint> oauthTokenEndpoints;
        private @Nullable List<OauthIntegrationForCustomClientsDescribeOutputOauthUseSecondaryRole> oauthUseSecondaryRoles;
        private @Nullable List<OauthIntegrationForCustomClientsDescribeOutputPreAuthorizedRolesList> preAuthorizedRolesLists;
        public Builder() {}
        public Builder(OauthIntegrationForCustomClientsDescribeOutput defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blockedRolesLists = defaults.blockedRolesLists;
    	      this.comments = defaults.comments;
    	      this.enableds = defaults.enableds;
    	      this.networkPolicies = defaults.networkPolicies;
    	      this.oauthAllowNonTlsRedirectUris = defaults.oauthAllowNonTlsRedirectUris;
    	      this.oauthAllowedAuthorizationEndpoints = defaults.oauthAllowedAuthorizationEndpoints;
    	      this.oauthAllowedTokenEndpoints = defaults.oauthAllowedTokenEndpoints;
    	      this.oauthAuthorizationEndpoints = defaults.oauthAuthorizationEndpoints;
    	      this.oauthClientRsaPublicKey2Fps = defaults.oauthClientRsaPublicKey2Fps;
    	      this.oauthClientRsaPublicKeyFps = defaults.oauthClientRsaPublicKeyFps;
    	      this.oauthClientTypes = defaults.oauthClientTypes;
    	      this.oauthEnforcePkces = defaults.oauthEnforcePkces;
    	      this.oauthIssueRefreshTokens = defaults.oauthIssueRefreshTokens;
    	      this.oauthRefreshTokenValidities = defaults.oauthRefreshTokenValidities;
    	      this.oauthTokenEndpoints = defaults.oauthTokenEndpoints;
    	      this.oauthUseSecondaryRoles = defaults.oauthUseSecondaryRoles;
    	      this.preAuthorizedRolesLists = defaults.preAuthorizedRolesLists;
        }

        @CustomType.Setter
        public Builder blockedRolesLists(@Nullable List<OauthIntegrationForCustomClientsDescribeOutputBlockedRolesList> blockedRolesLists) {

            this.blockedRolesLists = blockedRolesLists;
            return this;
        }
        public Builder blockedRolesLists(OauthIntegrationForCustomClientsDescribeOutputBlockedRolesList... blockedRolesLists) {
            return blockedRolesLists(List.of(blockedRolesLists));
        }
        @CustomType.Setter
        public Builder comments(@Nullable List<OauthIntegrationForCustomClientsDescribeOutputComment> comments) {

            this.comments = comments;
            return this;
        }
        public Builder comments(OauthIntegrationForCustomClientsDescribeOutputComment... comments) {
            return comments(List.of(comments));
        }
        @CustomType.Setter
        public Builder enableds(@Nullable List<OauthIntegrationForCustomClientsDescribeOutputEnabled> enableds) {

            this.enableds = enableds;
            return this;
        }
        public Builder enableds(OauthIntegrationForCustomClientsDescribeOutputEnabled... enableds) {
            return enableds(List.of(enableds));
        }
        @CustomType.Setter
        public Builder networkPolicies(@Nullable List<OauthIntegrationForCustomClientsDescribeOutputNetworkPolicy> networkPolicies) {

            this.networkPolicies = networkPolicies;
            return this;
        }
        public Builder networkPolicies(OauthIntegrationForCustomClientsDescribeOutputNetworkPolicy... networkPolicies) {
            return networkPolicies(List.of(networkPolicies));
        }
        @CustomType.Setter
        public Builder oauthAllowNonTlsRedirectUris(@Nullable List<OauthIntegrationForCustomClientsDescribeOutputOauthAllowNonTlsRedirectUri> oauthAllowNonTlsRedirectUris) {

            this.oauthAllowNonTlsRedirectUris = oauthAllowNonTlsRedirectUris;
            return this;
        }
        public Builder oauthAllowNonTlsRedirectUris(OauthIntegrationForCustomClientsDescribeOutputOauthAllowNonTlsRedirectUri... oauthAllowNonTlsRedirectUris) {
            return oauthAllowNonTlsRedirectUris(List.of(oauthAllowNonTlsRedirectUris));
        }
        @CustomType.Setter
        public Builder oauthAllowedAuthorizationEndpoints(@Nullable List<OauthIntegrationForCustomClientsDescribeOutputOauthAllowedAuthorizationEndpoint> oauthAllowedAuthorizationEndpoints) {

            this.oauthAllowedAuthorizationEndpoints = oauthAllowedAuthorizationEndpoints;
            return this;
        }
        public Builder oauthAllowedAuthorizationEndpoints(OauthIntegrationForCustomClientsDescribeOutputOauthAllowedAuthorizationEndpoint... oauthAllowedAuthorizationEndpoints) {
            return oauthAllowedAuthorizationEndpoints(List.of(oauthAllowedAuthorizationEndpoints));
        }
        @CustomType.Setter
        public Builder oauthAllowedTokenEndpoints(@Nullable List<OauthIntegrationForCustomClientsDescribeOutputOauthAllowedTokenEndpoint> oauthAllowedTokenEndpoints) {

            this.oauthAllowedTokenEndpoints = oauthAllowedTokenEndpoints;
            return this;
        }
        public Builder oauthAllowedTokenEndpoints(OauthIntegrationForCustomClientsDescribeOutputOauthAllowedTokenEndpoint... oauthAllowedTokenEndpoints) {
            return oauthAllowedTokenEndpoints(List.of(oauthAllowedTokenEndpoints));
        }
        @CustomType.Setter
        public Builder oauthAuthorizationEndpoints(@Nullable List<OauthIntegrationForCustomClientsDescribeOutputOauthAuthorizationEndpoint> oauthAuthorizationEndpoints) {

            this.oauthAuthorizationEndpoints = oauthAuthorizationEndpoints;
            return this;
        }
        public Builder oauthAuthorizationEndpoints(OauthIntegrationForCustomClientsDescribeOutputOauthAuthorizationEndpoint... oauthAuthorizationEndpoints) {
            return oauthAuthorizationEndpoints(List.of(oauthAuthorizationEndpoints));
        }
        @CustomType.Setter
        public Builder oauthClientRsaPublicKey2Fps(@Nullable List<OauthIntegrationForCustomClientsDescribeOutputOauthClientRsaPublicKey2Fp> oauthClientRsaPublicKey2Fps) {

            this.oauthClientRsaPublicKey2Fps = oauthClientRsaPublicKey2Fps;
            return this;
        }
        public Builder oauthClientRsaPublicKey2Fps(OauthIntegrationForCustomClientsDescribeOutputOauthClientRsaPublicKey2Fp... oauthClientRsaPublicKey2Fps) {
            return oauthClientRsaPublicKey2Fps(List.of(oauthClientRsaPublicKey2Fps));
        }
        @CustomType.Setter
        public Builder oauthClientRsaPublicKeyFps(@Nullable List<OauthIntegrationForCustomClientsDescribeOutputOauthClientRsaPublicKeyFp> oauthClientRsaPublicKeyFps) {

            this.oauthClientRsaPublicKeyFps = oauthClientRsaPublicKeyFps;
            return this;
        }
        public Builder oauthClientRsaPublicKeyFps(OauthIntegrationForCustomClientsDescribeOutputOauthClientRsaPublicKeyFp... oauthClientRsaPublicKeyFps) {
            return oauthClientRsaPublicKeyFps(List.of(oauthClientRsaPublicKeyFps));
        }
        @CustomType.Setter
        public Builder oauthClientTypes(@Nullable List<OauthIntegrationForCustomClientsDescribeOutputOauthClientType> oauthClientTypes) {

            this.oauthClientTypes = oauthClientTypes;
            return this;
        }
        public Builder oauthClientTypes(OauthIntegrationForCustomClientsDescribeOutputOauthClientType... oauthClientTypes) {
            return oauthClientTypes(List.of(oauthClientTypes));
        }
        @CustomType.Setter
        public Builder oauthEnforcePkces(@Nullable List<OauthIntegrationForCustomClientsDescribeOutputOauthEnforcePkce> oauthEnforcePkces) {

            this.oauthEnforcePkces = oauthEnforcePkces;
            return this;
        }
        public Builder oauthEnforcePkces(OauthIntegrationForCustomClientsDescribeOutputOauthEnforcePkce... oauthEnforcePkces) {
            return oauthEnforcePkces(List.of(oauthEnforcePkces));
        }
        @CustomType.Setter
        public Builder oauthIssueRefreshTokens(@Nullable List<OauthIntegrationForCustomClientsDescribeOutputOauthIssueRefreshToken> oauthIssueRefreshTokens) {

            this.oauthIssueRefreshTokens = oauthIssueRefreshTokens;
            return this;
        }
        public Builder oauthIssueRefreshTokens(OauthIntegrationForCustomClientsDescribeOutputOauthIssueRefreshToken... oauthIssueRefreshTokens) {
            return oauthIssueRefreshTokens(List.of(oauthIssueRefreshTokens));
        }
        @CustomType.Setter
        public Builder oauthRefreshTokenValidities(@Nullable List<OauthIntegrationForCustomClientsDescribeOutputOauthRefreshTokenValidity> oauthRefreshTokenValidities) {

            this.oauthRefreshTokenValidities = oauthRefreshTokenValidities;
            return this;
        }
        public Builder oauthRefreshTokenValidities(OauthIntegrationForCustomClientsDescribeOutputOauthRefreshTokenValidity... oauthRefreshTokenValidities) {
            return oauthRefreshTokenValidities(List.of(oauthRefreshTokenValidities));
        }
        @CustomType.Setter
        public Builder oauthTokenEndpoints(@Nullable List<OauthIntegrationForCustomClientsDescribeOutputOauthTokenEndpoint> oauthTokenEndpoints) {

            this.oauthTokenEndpoints = oauthTokenEndpoints;
            return this;
        }
        public Builder oauthTokenEndpoints(OauthIntegrationForCustomClientsDescribeOutputOauthTokenEndpoint... oauthTokenEndpoints) {
            return oauthTokenEndpoints(List.of(oauthTokenEndpoints));
        }
        @CustomType.Setter
        public Builder oauthUseSecondaryRoles(@Nullable List<OauthIntegrationForCustomClientsDescribeOutputOauthUseSecondaryRole> oauthUseSecondaryRoles) {

            this.oauthUseSecondaryRoles = oauthUseSecondaryRoles;
            return this;
        }
        public Builder oauthUseSecondaryRoles(OauthIntegrationForCustomClientsDescribeOutputOauthUseSecondaryRole... oauthUseSecondaryRoles) {
            return oauthUseSecondaryRoles(List.of(oauthUseSecondaryRoles));
        }
        @CustomType.Setter
        public Builder preAuthorizedRolesLists(@Nullable List<OauthIntegrationForCustomClientsDescribeOutputPreAuthorizedRolesList> preAuthorizedRolesLists) {

            this.preAuthorizedRolesLists = preAuthorizedRolesLists;
            return this;
        }
        public Builder preAuthorizedRolesLists(OauthIntegrationForCustomClientsDescribeOutputPreAuthorizedRolesList... preAuthorizedRolesLists) {
            return preAuthorizedRolesLists(List.of(preAuthorizedRolesLists));
        }
        public OauthIntegrationForCustomClientsDescribeOutput build() {
            final var _resultValue = new OauthIntegrationForCustomClientsDescribeOutput();
            _resultValue.blockedRolesLists = blockedRolesLists;
            _resultValue.comments = comments;
            _resultValue.enableds = enableds;
            _resultValue.networkPolicies = networkPolicies;
            _resultValue.oauthAllowNonTlsRedirectUris = oauthAllowNonTlsRedirectUris;
            _resultValue.oauthAllowedAuthorizationEndpoints = oauthAllowedAuthorizationEndpoints;
            _resultValue.oauthAllowedTokenEndpoints = oauthAllowedTokenEndpoints;
            _resultValue.oauthAuthorizationEndpoints = oauthAuthorizationEndpoints;
            _resultValue.oauthClientRsaPublicKey2Fps = oauthClientRsaPublicKey2Fps;
            _resultValue.oauthClientRsaPublicKeyFps = oauthClientRsaPublicKeyFps;
            _resultValue.oauthClientTypes = oauthClientTypes;
            _resultValue.oauthEnforcePkces = oauthEnforcePkces;
            _resultValue.oauthIssueRefreshTokens = oauthIssueRefreshTokens;
            _resultValue.oauthRefreshTokenValidities = oauthRefreshTokenValidities;
            _resultValue.oauthTokenEndpoints = oauthTokenEndpoints;
            _resultValue.oauthUseSecondaryRoles = oauthUseSecondaryRoles;
            _resultValue.preAuthorizedRolesLists = preAuthorizedRolesLists;
            return _resultValue;
        }
    }
}
