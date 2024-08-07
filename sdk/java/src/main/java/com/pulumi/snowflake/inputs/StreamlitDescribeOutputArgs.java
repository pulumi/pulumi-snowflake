// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StreamlitDescribeOutputArgs extends com.pulumi.resources.ResourceArgs {

    public static final StreamlitDescribeOutputArgs Empty = new StreamlitDescribeOutputArgs();

    @Import(name="defaultPackages")
    private @Nullable Output<String> defaultPackages;

    public Optional<Output<String>> defaultPackages() {
        return Optional.ofNullable(this.defaultPackages);
    }

    @Import(name="externalAccessIntegrations")
    private @Nullable Output<List<String>> externalAccessIntegrations;

    public Optional<Output<List<String>>> externalAccessIntegrations() {
        return Optional.ofNullable(this.externalAccessIntegrations);
    }

    @Import(name="externalAccessSecrets")
    private @Nullable Output<String> externalAccessSecrets;

    public Optional<Output<String>> externalAccessSecrets() {
        return Optional.ofNullable(this.externalAccessSecrets);
    }

    @Import(name="importUrls")
    private @Nullable Output<List<String>> importUrls;

    public Optional<Output<List<String>>> importUrls() {
        return Optional.ofNullable(this.importUrls);
    }

    @Import(name="mainFile")
    private @Nullable Output<String> mainFile;

    public Optional<Output<String>> mainFile() {
        return Optional.ofNullable(this.mainFile);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="queryWarehouse")
    private @Nullable Output<String> queryWarehouse;

    public Optional<Output<String>> queryWarehouse() {
        return Optional.ofNullable(this.queryWarehouse);
    }

    @Import(name="rootLocation")
    private @Nullable Output<String> rootLocation;

    public Optional<Output<String>> rootLocation() {
        return Optional.ofNullable(this.rootLocation);
    }

    @Import(name="title")
    private @Nullable Output<String> title;

    public Optional<Output<String>> title() {
        return Optional.ofNullable(this.title);
    }

    @Import(name="urlId")
    private @Nullable Output<String> urlId;

    public Optional<Output<String>> urlId() {
        return Optional.ofNullable(this.urlId);
    }

    @Import(name="userPackages")
    private @Nullable Output<List<String>> userPackages;

    public Optional<Output<List<String>>> userPackages() {
        return Optional.ofNullable(this.userPackages);
    }

    private StreamlitDescribeOutputArgs() {}

    private StreamlitDescribeOutputArgs(StreamlitDescribeOutputArgs $) {
        this.defaultPackages = $.defaultPackages;
        this.externalAccessIntegrations = $.externalAccessIntegrations;
        this.externalAccessSecrets = $.externalAccessSecrets;
        this.importUrls = $.importUrls;
        this.mainFile = $.mainFile;
        this.name = $.name;
        this.queryWarehouse = $.queryWarehouse;
        this.rootLocation = $.rootLocation;
        this.title = $.title;
        this.urlId = $.urlId;
        this.userPackages = $.userPackages;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StreamlitDescribeOutputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StreamlitDescribeOutputArgs $;

        public Builder() {
            $ = new StreamlitDescribeOutputArgs();
        }

        public Builder(StreamlitDescribeOutputArgs defaults) {
            $ = new StreamlitDescribeOutputArgs(Objects.requireNonNull(defaults));
        }

        public Builder defaultPackages(@Nullable Output<String> defaultPackages) {
            $.defaultPackages = defaultPackages;
            return this;
        }

        public Builder defaultPackages(String defaultPackages) {
            return defaultPackages(Output.of(defaultPackages));
        }

        public Builder externalAccessIntegrations(@Nullable Output<List<String>> externalAccessIntegrations) {
            $.externalAccessIntegrations = externalAccessIntegrations;
            return this;
        }

        public Builder externalAccessIntegrations(List<String> externalAccessIntegrations) {
            return externalAccessIntegrations(Output.of(externalAccessIntegrations));
        }

        public Builder externalAccessIntegrations(String... externalAccessIntegrations) {
            return externalAccessIntegrations(List.of(externalAccessIntegrations));
        }

        public Builder externalAccessSecrets(@Nullable Output<String> externalAccessSecrets) {
            $.externalAccessSecrets = externalAccessSecrets;
            return this;
        }

        public Builder externalAccessSecrets(String externalAccessSecrets) {
            return externalAccessSecrets(Output.of(externalAccessSecrets));
        }

        public Builder importUrls(@Nullable Output<List<String>> importUrls) {
            $.importUrls = importUrls;
            return this;
        }

        public Builder importUrls(List<String> importUrls) {
            return importUrls(Output.of(importUrls));
        }

        public Builder importUrls(String... importUrls) {
            return importUrls(List.of(importUrls));
        }

        public Builder mainFile(@Nullable Output<String> mainFile) {
            $.mainFile = mainFile;
            return this;
        }

        public Builder mainFile(String mainFile) {
            return mainFile(Output.of(mainFile));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder queryWarehouse(@Nullable Output<String> queryWarehouse) {
            $.queryWarehouse = queryWarehouse;
            return this;
        }

        public Builder queryWarehouse(String queryWarehouse) {
            return queryWarehouse(Output.of(queryWarehouse));
        }

        public Builder rootLocation(@Nullable Output<String> rootLocation) {
            $.rootLocation = rootLocation;
            return this;
        }

        public Builder rootLocation(String rootLocation) {
            return rootLocation(Output.of(rootLocation));
        }

        public Builder title(@Nullable Output<String> title) {
            $.title = title;
            return this;
        }

        public Builder title(String title) {
            return title(Output.of(title));
        }

        public Builder urlId(@Nullable Output<String> urlId) {
            $.urlId = urlId;
            return this;
        }

        public Builder urlId(String urlId) {
            return urlId(Output.of(urlId));
        }

        public Builder userPackages(@Nullable Output<List<String>> userPackages) {
            $.userPackages = userPackages;
            return this;
        }

        public Builder userPackages(List<String> userPackages) {
            return userPackages(Output.of(userPackages));
        }

        public Builder userPackages(String... userPackages) {
            return userPackages(List.of(userPackages));
        }

        public StreamlitDescribeOutputArgs build() {
            return $;
        }
    }

}
