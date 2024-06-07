// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.snowflake.inputs.GetGrantsFutureGrantsInArgs;
import com.pulumi.snowflake.inputs.GetGrantsFutureGrantsToArgs;
import com.pulumi.snowflake.inputs.GetGrantsGrantsOfArgs;
import com.pulumi.snowflake.inputs.GetGrantsGrantsOnArgs;
import com.pulumi.snowflake.inputs.GetGrantsGrantsToArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGrantsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetGrantsArgs Empty = new GetGrantsArgs();

    /**
     * Lists all privileges on new (i.e. future) objects.
     * 
     */
    @Import(name="futureGrantsIn")
    private @Nullable Output<GetGrantsFutureGrantsInArgs> futureGrantsIn;

    /**
     * @return Lists all privileges on new (i.e. future) objects.
     * 
     */
    public Optional<Output<GetGrantsFutureGrantsInArgs>> futureGrantsIn() {
        return Optional.ofNullable(this.futureGrantsIn);
    }

    /**
     * Lists all privileges granted to the object on new (i.e. future) objects.
     * 
     */
    @Import(name="futureGrantsTo")
    private @Nullable Output<GetGrantsFutureGrantsToArgs> futureGrantsTo;

    /**
     * @return Lists all privileges granted to the object on new (i.e. future) objects.
     * 
     */
    public Optional<Output<GetGrantsFutureGrantsToArgs>> futureGrantsTo() {
        return Optional.ofNullable(this.futureGrantsTo);
    }

    /**
     * Lists all objects to which the given object has been granted.
     * 
     */
    @Import(name="grantsOf")
    private @Nullable Output<GetGrantsGrantsOfArgs> grantsOf;

    /**
     * @return Lists all objects to which the given object has been granted.
     * 
     */
    public Optional<Output<GetGrantsGrantsOfArgs>> grantsOf() {
        return Optional.ofNullable(this.grantsOf);
    }

    /**
     * Lists all privileges that have been granted on an object or on an account.
     * 
     */
    @Import(name="grantsOn")
    private @Nullable Output<GetGrantsGrantsOnArgs> grantsOn;

    /**
     * @return Lists all privileges that have been granted on an object or on an account.
     * 
     */
    public Optional<Output<GetGrantsGrantsOnArgs>> grantsOn() {
        return Optional.ofNullable(this.grantsOn);
    }

    /**
     * Lists all privileges granted to the object.
     * 
     */
    @Import(name="grantsTo")
    private @Nullable Output<GetGrantsGrantsToArgs> grantsTo;

    /**
     * @return Lists all privileges granted to the object.
     * 
     */
    public Optional<Output<GetGrantsGrantsToArgs>> grantsTo() {
        return Optional.ofNullable(this.grantsTo);
    }

    private GetGrantsArgs() {}

    private GetGrantsArgs(GetGrantsArgs $) {
        this.futureGrantsIn = $.futureGrantsIn;
        this.futureGrantsTo = $.futureGrantsTo;
        this.grantsOf = $.grantsOf;
        this.grantsOn = $.grantsOn;
        this.grantsTo = $.grantsTo;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGrantsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGrantsArgs $;

        public Builder() {
            $ = new GetGrantsArgs();
        }

        public Builder(GetGrantsArgs defaults) {
            $ = new GetGrantsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param futureGrantsIn Lists all privileges on new (i.e. future) objects.
         * 
         * @return builder
         * 
         */
        public Builder futureGrantsIn(@Nullable Output<GetGrantsFutureGrantsInArgs> futureGrantsIn) {
            $.futureGrantsIn = futureGrantsIn;
            return this;
        }

        /**
         * @param futureGrantsIn Lists all privileges on new (i.e. future) objects.
         * 
         * @return builder
         * 
         */
        public Builder futureGrantsIn(GetGrantsFutureGrantsInArgs futureGrantsIn) {
            return futureGrantsIn(Output.of(futureGrantsIn));
        }

        /**
         * @param futureGrantsTo Lists all privileges granted to the object on new (i.e. future) objects.
         * 
         * @return builder
         * 
         */
        public Builder futureGrantsTo(@Nullable Output<GetGrantsFutureGrantsToArgs> futureGrantsTo) {
            $.futureGrantsTo = futureGrantsTo;
            return this;
        }

        /**
         * @param futureGrantsTo Lists all privileges granted to the object on new (i.e. future) objects.
         * 
         * @return builder
         * 
         */
        public Builder futureGrantsTo(GetGrantsFutureGrantsToArgs futureGrantsTo) {
            return futureGrantsTo(Output.of(futureGrantsTo));
        }

        /**
         * @param grantsOf Lists all objects to which the given object has been granted.
         * 
         * @return builder
         * 
         */
        public Builder grantsOf(@Nullable Output<GetGrantsGrantsOfArgs> grantsOf) {
            $.grantsOf = grantsOf;
            return this;
        }

        /**
         * @param grantsOf Lists all objects to which the given object has been granted.
         * 
         * @return builder
         * 
         */
        public Builder grantsOf(GetGrantsGrantsOfArgs grantsOf) {
            return grantsOf(Output.of(grantsOf));
        }

        /**
         * @param grantsOn Lists all privileges that have been granted on an object or on an account.
         * 
         * @return builder
         * 
         */
        public Builder grantsOn(@Nullable Output<GetGrantsGrantsOnArgs> grantsOn) {
            $.grantsOn = grantsOn;
            return this;
        }

        /**
         * @param grantsOn Lists all privileges that have been granted on an object or on an account.
         * 
         * @return builder
         * 
         */
        public Builder grantsOn(GetGrantsGrantsOnArgs grantsOn) {
            return grantsOn(Output.of(grantsOn));
        }

        /**
         * @param grantsTo Lists all privileges granted to the object.
         * 
         * @return builder
         * 
         */
        public Builder grantsTo(@Nullable Output<GetGrantsGrantsToArgs> grantsTo) {
            $.grantsTo = grantsTo;
            return this;
        }

        /**
         * @param grantsTo Lists all privileges granted to the object.
         * 
         * @return builder
         * 
         */
        public Builder grantsTo(GetGrantsGrantsToArgs grantsTo) {
            return grantsTo(Output.of(grantsTo));
        }

        public GetGrantsArgs build() {
            return $;
        }
    }

}
