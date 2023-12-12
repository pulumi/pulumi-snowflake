// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.snowflake.outputs.GetGrantsFutureGrantsIn;
import com.pulumi.snowflake.outputs.GetGrantsFutureGrantsTo;
import com.pulumi.snowflake.outputs.GetGrantsGrant;
import com.pulumi.snowflake.outputs.GetGrantsGrantsOf;
import com.pulumi.snowflake.outputs.GetGrantsGrantsOn;
import com.pulumi.snowflake.outputs.GetGrantsGrantsTo;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetGrantsResult {
    /**
     * @return Lists all privileges on new (i.e. future) objects
     * 
     */
    private @Nullable GetGrantsFutureGrantsIn futureGrantsIn;
    /**
     * @return Lists all privileges granted to the object on new (i.e. future) objects
     * 
     */
    private @Nullable GetGrantsFutureGrantsTo futureGrantsTo;
    /**
     * @return The list of grants
     * 
     */
    private List<GetGrantsGrant> grants;
    /**
     * @return Lists all objects to which the given object has been granted
     * 
     */
    private @Nullable GetGrantsGrantsOf grantsOf;
    /**
     * @return Lists all privileges that have been granted on an object or account
     * 
     */
    private @Nullable GetGrantsGrantsOn grantsOn;
    /**
     * @return Lists all privileges granted to the object
     * 
     */
    private @Nullable GetGrantsGrantsTo grantsTo;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;

    private GetGrantsResult() {}
    /**
     * @return Lists all privileges on new (i.e. future) objects
     * 
     */
    public Optional<GetGrantsFutureGrantsIn> futureGrantsIn() {
        return Optional.ofNullable(this.futureGrantsIn);
    }
    /**
     * @return Lists all privileges granted to the object on new (i.e. future) objects
     * 
     */
    public Optional<GetGrantsFutureGrantsTo> futureGrantsTo() {
        return Optional.ofNullable(this.futureGrantsTo);
    }
    /**
     * @return The list of grants
     * 
     */
    public List<GetGrantsGrant> grants() {
        return this.grants;
    }
    /**
     * @return Lists all objects to which the given object has been granted
     * 
     */
    public Optional<GetGrantsGrantsOf> grantsOf() {
        return Optional.ofNullable(this.grantsOf);
    }
    /**
     * @return Lists all privileges that have been granted on an object or account
     * 
     */
    public Optional<GetGrantsGrantsOn> grantsOn() {
        return Optional.ofNullable(this.grantsOn);
    }
    /**
     * @return Lists all privileges granted to the object
     * 
     */
    public Optional<GetGrantsGrantsTo> grantsTo() {
        return Optional.ofNullable(this.grantsTo);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGrantsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable GetGrantsFutureGrantsIn futureGrantsIn;
        private @Nullable GetGrantsFutureGrantsTo futureGrantsTo;
        private List<GetGrantsGrant> grants;
        private @Nullable GetGrantsGrantsOf grantsOf;
        private @Nullable GetGrantsGrantsOn grantsOn;
        private @Nullable GetGrantsGrantsTo grantsTo;
        private String id;
        public Builder() {}
        public Builder(GetGrantsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.futureGrantsIn = defaults.futureGrantsIn;
    	      this.futureGrantsTo = defaults.futureGrantsTo;
    	      this.grants = defaults.grants;
    	      this.grantsOf = defaults.grantsOf;
    	      this.grantsOn = defaults.grantsOn;
    	      this.grantsTo = defaults.grantsTo;
    	      this.id = defaults.id;
        }

        @CustomType.Setter
        public Builder futureGrantsIn(@Nullable GetGrantsFutureGrantsIn futureGrantsIn) {
            this.futureGrantsIn = futureGrantsIn;
            return this;
        }
        @CustomType.Setter
        public Builder futureGrantsTo(@Nullable GetGrantsFutureGrantsTo futureGrantsTo) {
            this.futureGrantsTo = futureGrantsTo;
            return this;
        }
        @CustomType.Setter
        public Builder grants(List<GetGrantsGrant> grants) {
            this.grants = Objects.requireNonNull(grants);
            return this;
        }
        public Builder grants(GetGrantsGrant... grants) {
            return grants(List.of(grants));
        }
        @CustomType.Setter
        public Builder grantsOf(@Nullable GetGrantsGrantsOf grantsOf) {
            this.grantsOf = grantsOf;
            return this;
        }
        @CustomType.Setter
        public Builder grantsOn(@Nullable GetGrantsGrantsOn grantsOn) {
            this.grantsOn = grantsOn;
            return this;
        }
        @CustomType.Setter
        public Builder grantsTo(@Nullable GetGrantsGrantsTo grantsTo) {
            this.grantsTo = grantsTo;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public GetGrantsResult build() {
            final var _resultValue = new GetGrantsResult();
            _resultValue.futureGrantsIn = futureGrantsIn;
            _resultValue.futureGrantsTo = futureGrantsTo;
            _resultValue.grants = grants;
            _resultValue.grantsOf = grantsOf;
            _resultValue.grantsOn = grantsOn;
            _resultValue.grantsTo = grantsTo;
            _resultValue.id = id;
            return _resultValue;
        }
    }
}
