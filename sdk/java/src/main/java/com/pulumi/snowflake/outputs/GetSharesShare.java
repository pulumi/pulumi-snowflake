// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSharesShare {
    private String comment;
    private String kind;
    private String name;
    private String owner;
    private String to;

    private GetSharesShare() {}
    public String comment() {
        return this.comment;
    }
    public String kind() {
        return this.kind;
    }
    public String name() {
        return this.name;
    }
    public String owner() {
        return this.owner;
    }
    public String to() {
        return this.to;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSharesShare defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String comment;
        private String kind;
        private String name;
        private String owner;
        private String to;
        public Builder() {}
        public Builder(GetSharesShare defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comment = defaults.comment;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.owner = defaults.owner;
    	      this.to = defaults.to;
        }

        @CustomType.Setter
        public Builder comment(String comment) {
            this.comment = Objects.requireNonNull(comment);
            return this;
        }
        @CustomType.Setter
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder owner(String owner) {
            this.owner = Objects.requireNonNull(owner);
            return this;
        }
        @CustomType.Setter
        public Builder to(String to) {
            this.to = Objects.requireNonNull(to);
            return this;
        }
        public GetSharesShare build() {
            final var o = new GetSharesShare();
            o.comment = comment;
            o.kind = kind;
            o.name = name;
            o.owner = owner;
            o.to = to;
            return o;
        }
    }
}