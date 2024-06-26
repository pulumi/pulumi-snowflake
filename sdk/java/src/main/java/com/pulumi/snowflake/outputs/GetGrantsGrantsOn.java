// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetGrantsGrantsOn {
    /**
     * @return Object hierarchy to list privileges on. The only valid value is: ACCOUNT. Setting this attribute lists all the account-level (i.e. global) privileges that have been granted to roles.
     * 
     */
    private @Nullable Boolean account;
    /**
     * @return Name of object to list privileges on.
     * 
     */
    private @Nullable String objectName;
    /**
     * @return Type of object to list privileges on.
     * 
     */
    private @Nullable String objectType;

    private GetGrantsGrantsOn() {}
    /**
     * @return Object hierarchy to list privileges on. The only valid value is: ACCOUNT. Setting this attribute lists all the account-level (i.e. global) privileges that have been granted to roles.
     * 
     */
    public Optional<Boolean> account() {
        return Optional.ofNullable(this.account);
    }
    /**
     * @return Name of object to list privileges on.
     * 
     */
    public Optional<String> objectName() {
        return Optional.ofNullable(this.objectName);
    }
    /**
     * @return Type of object to list privileges on.
     * 
     */
    public Optional<String> objectType() {
        return Optional.ofNullable(this.objectType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGrantsGrantsOn defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean account;
        private @Nullable String objectName;
        private @Nullable String objectType;
        public Builder() {}
        public Builder(GetGrantsGrantsOn defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.account = defaults.account;
    	      this.objectName = defaults.objectName;
    	      this.objectType = defaults.objectType;
        }

        @CustomType.Setter
        public Builder account(@Nullable Boolean account) {

            this.account = account;
            return this;
        }
        @CustomType.Setter
        public Builder objectName(@Nullable String objectName) {

            this.objectName = objectName;
            return this;
        }
        @CustomType.Setter
        public Builder objectType(@Nullable String objectType) {

            this.objectType = objectType;
            return this;
        }
        public GetGrantsGrantsOn build() {
            final var _resultValue = new GetGrantsGrantsOn();
            _resultValue.account = account;
            _resultValue.objectName = objectName;
            _resultValue.objectType = objectType;
            return _resultValue;
        }
    }
}
