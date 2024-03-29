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


public final class ObjectParameterObjectIdentifierArgs extends com.pulumi.resources.ResourceArgs {

    public static final ObjectParameterObjectIdentifierArgs Empty = new ObjectParameterObjectIdentifierArgs();

    /**
     * Name of the database that the object was created in.
     * 
     */
    @Import(name="database")
    private @Nullable Output<String> database;

    /**
     * @return Name of the database that the object was created in.
     * 
     */
    public Optional<Output<String>> database() {
        return Optional.ofNullable(this.database);
    }

    /**
     * Name of the object to set the parameter for.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of the object to set the parameter for.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Name of the schema that the object was created in.
     * 
     */
    @Import(name="schema")
    private @Nullable Output<String> schema;

    /**
     * @return Name of the schema that the object was created in.
     * 
     */
    public Optional<Output<String>> schema() {
        return Optional.ofNullable(this.schema);
    }

    private ObjectParameterObjectIdentifierArgs() {}

    private ObjectParameterObjectIdentifierArgs(ObjectParameterObjectIdentifierArgs $) {
        this.database = $.database;
        this.name = $.name;
        this.schema = $.schema;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ObjectParameterObjectIdentifierArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ObjectParameterObjectIdentifierArgs $;

        public Builder() {
            $ = new ObjectParameterObjectIdentifierArgs();
        }

        public Builder(ObjectParameterObjectIdentifierArgs defaults) {
            $ = new ObjectParameterObjectIdentifierArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param database Name of the database that the object was created in.
         * 
         * @return builder
         * 
         */
        public Builder database(@Nullable Output<String> database) {
            $.database = database;
            return this;
        }

        /**
         * @param database Name of the database that the object was created in.
         * 
         * @return builder
         * 
         */
        public Builder database(String database) {
            return database(Output.of(database));
        }

        /**
         * @param name Name of the object to set the parameter for.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the object to set the parameter for.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param schema Name of the schema that the object was created in.
         * 
         * @return builder
         * 
         */
        public Builder schema(@Nullable Output<String> schema) {
            $.schema = schema;
            return this;
        }

        /**
         * @param schema Name of the schema that the object was created in.
         * 
         * @return builder
         * 
         */
        public Builder schema(String schema) {
            return schema(Output.of(schema));
        }

        public ObjectParameterObjectIdentifierArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("ObjectParameterObjectIdentifierArgs", "name");
            }
            return $;
        }
    }

}
