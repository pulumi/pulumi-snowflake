// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StageTagArgs extends com.pulumi.resources.ResourceArgs {

    public static final StageTagArgs Empty = new StageTagArgs();

    /**
     * Name of the database that the tag was created in.
     * 
     */
    @Import(name="database")
    private @Nullable Output<String> database;

    /**
     * @return Name of the database that the tag was created in.
     * 
     */
    public Optional<Output<String>> database() {
        return Optional.ofNullable(this.database);
    }

    /**
     * Tag name, e.g. department.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Tag name, e.g. department.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Name of the schema that the tag was created in.
     * 
     */
    @Import(name="schema")
    private @Nullable Output<String> schema;

    /**
     * @return Name of the schema that the tag was created in.
     * 
     */
    public Optional<Output<String>> schema() {
        return Optional.ofNullable(this.schema);
    }

    /**
     * Tag value, e.g. marketing_info.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return Tag value, e.g. marketing_info.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private StageTagArgs() {}

    private StageTagArgs(StageTagArgs $) {
        this.database = $.database;
        this.name = $.name;
        this.schema = $.schema;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StageTagArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StageTagArgs $;

        public Builder() {
            $ = new StageTagArgs();
        }

        public Builder(StageTagArgs defaults) {
            $ = new StageTagArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param database Name of the database that the tag was created in.
         * 
         * @return builder
         * 
         */
        public Builder database(@Nullable Output<String> database) {
            $.database = database;
            return this;
        }

        /**
         * @param database Name of the database that the tag was created in.
         * 
         * @return builder
         * 
         */
        public Builder database(String database) {
            return database(Output.of(database));
        }

        /**
         * @param name Tag name, e.g. department.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Tag name, e.g. department.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param schema Name of the schema that the tag was created in.
         * 
         * @return builder
         * 
         */
        public Builder schema(@Nullable Output<String> schema) {
            $.schema = schema;
            return this;
        }

        /**
         * @param schema Name of the schema that the tag was created in.
         * 
         * @return builder
         * 
         */
        public Builder schema(String schema) {
            return schema(Output.of(schema));
        }

        /**
         * @param value Tag value, e.g. marketing_info.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Tag value, e.g. marketing_info.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public StageTagArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("StageTagArgs", "name");
            }
            if ($.value == null) {
                throw new MissingRequiredPropertyException("StageTagArgs", "value");
            }
            return $;
        }
    }

}
