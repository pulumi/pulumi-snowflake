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
public final class StreamlitDescribeOutput {
    private @Nullable String defaultPackages;
    private @Nullable List<String> externalAccessIntegrations;
    private @Nullable String externalAccessSecrets;
    private @Nullable List<String> importUrls;
    private @Nullable String mainFile;
    private @Nullable String name;
    private @Nullable String queryWarehouse;
    private @Nullable String rootLocation;
    private @Nullable String title;
    private @Nullable String urlId;
    private @Nullable List<String> userPackages;

    private StreamlitDescribeOutput() {}
    public Optional<String> defaultPackages() {
        return Optional.ofNullable(this.defaultPackages);
    }
    public List<String> externalAccessIntegrations() {
        return this.externalAccessIntegrations == null ? List.of() : this.externalAccessIntegrations;
    }
    public Optional<String> externalAccessSecrets() {
        return Optional.ofNullable(this.externalAccessSecrets);
    }
    public List<String> importUrls() {
        return this.importUrls == null ? List.of() : this.importUrls;
    }
    public Optional<String> mainFile() {
        return Optional.ofNullable(this.mainFile);
    }
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    public Optional<String> queryWarehouse() {
        return Optional.ofNullable(this.queryWarehouse);
    }
    public Optional<String> rootLocation() {
        return Optional.ofNullable(this.rootLocation);
    }
    public Optional<String> title() {
        return Optional.ofNullable(this.title);
    }
    public Optional<String> urlId() {
        return Optional.ofNullable(this.urlId);
    }
    public List<String> userPackages() {
        return this.userPackages == null ? List.of() : this.userPackages;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreamlitDescribeOutput defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String defaultPackages;
        private @Nullable List<String> externalAccessIntegrations;
        private @Nullable String externalAccessSecrets;
        private @Nullable List<String> importUrls;
        private @Nullable String mainFile;
        private @Nullable String name;
        private @Nullable String queryWarehouse;
        private @Nullable String rootLocation;
        private @Nullable String title;
        private @Nullable String urlId;
        private @Nullable List<String> userPackages;
        public Builder() {}
        public Builder(StreamlitDescribeOutput defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultPackages = defaults.defaultPackages;
    	      this.externalAccessIntegrations = defaults.externalAccessIntegrations;
    	      this.externalAccessSecrets = defaults.externalAccessSecrets;
    	      this.importUrls = defaults.importUrls;
    	      this.mainFile = defaults.mainFile;
    	      this.name = defaults.name;
    	      this.queryWarehouse = defaults.queryWarehouse;
    	      this.rootLocation = defaults.rootLocation;
    	      this.title = defaults.title;
    	      this.urlId = defaults.urlId;
    	      this.userPackages = defaults.userPackages;
        }

        @CustomType.Setter
        public Builder defaultPackages(@Nullable String defaultPackages) {

            this.defaultPackages = defaultPackages;
            return this;
        }
        @CustomType.Setter
        public Builder externalAccessIntegrations(@Nullable List<String> externalAccessIntegrations) {

            this.externalAccessIntegrations = externalAccessIntegrations;
            return this;
        }
        public Builder externalAccessIntegrations(String... externalAccessIntegrations) {
            return externalAccessIntegrations(List.of(externalAccessIntegrations));
        }
        @CustomType.Setter
        public Builder externalAccessSecrets(@Nullable String externalAccessSecrets) {

            this.externalAccessSecrets = externalAccessSecrets;
            return this;
        }
        @CustomType.Setter
        public Builder importUrls(@Nullable List<String> importUrls) {

            this.importUrls = importUrls;
            return this;
        }
        public Builder importUrls(String... importUrls) {
            return importUrls(List.of(importUrls));
        }
        @CustomType.Setter
        public Builder mainFile(@Nullable String mainFile) {

            this.mainFile = mainFile;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder queryWarehouse(@Nullable String queryWarehouse) {

            this.queryWarehouse = queryWarehouse;
            return this;
        }
        @CustomType.Setter
        public Builder rootLocation(@Nullable String rootLocation) {

            this.rootLocation = rootLocation;
            return this;
        }
        @CustomType.Setter
        public Builder title(@Nullable String title) {

            this.title = title;
            return this;
        }
        @CustomType.Setter
        public Builder urlId(@Nullable String urlId) {

            this.urlId = urlId;
            return this;
        }
        @CustomType.Setter
        public Builder userPackages(@Nullable List<String> userPackages) {

            this.userPackages = userPackages;
            return this;
        }
        public Builder userPackages(String... userPackages) {
            return userPackages(List.of(userPackages));
        }
        public StreamlitDescribeOutput build() {
            final var _resultValue = new StreamlitDescribeOutput();
            _resultValue.defaultPackages = defaultPackages;
            _resultValue.externalAccessIntegrations = externalAccessIntegrations;
            _resultValue.externalAccessSecrets = externalAccessSecrets;
            _resultValue.importUrls = importUrls;
            _resultValue.mainFile = mainFile;
            _resultValue.name = name;
            _resultValue.queryWarehouse = queryWarehouse;
            _resultValue.rootLocation = rootLocation;
            _resultValue.title = title;
            _resultValue.urlId = urlId;
            _resultValue.userPackages = userPackages;
            return _resultValue;
        }
    }
}
