// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.snowflake.inputs.ObjectParameterObjectIdentifierArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class ObjectParameterArgs extends com.pulumi.resources.ResourceArgs {

    public static final ObjectParameterArgs Empty = new ObjectParameterArgs();

    /**
     * Name of object parameter. Valid values are those in [object parameters](https://docs.snowflake.com/en/sql-reference/parameters.html#object-parameters).
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    /**
     * @return Name of object parameter. Valid values are those in [object parameters](https://docs.snowflake.com/en/sql-reference/parameters.html#object-parameters).
     * 
     */
    public Output<String> key() {
        return this.key;
    }

    /**
     * Specifies the object identifier for the object parameter.
     * 
     */
    @Import(name="objectIdentifiers", required=true)
    private Output<List<ObjectParameterObjectIdentifierArgs>> objectIdentifiers;

    /**
     * @return Specifies the object identifier for the object parameter.
     * 
     */
    public Output<List<ObjectParameterObjectIdentifierArgs>> objectIdentifiers() {
        return this.objectIdentifiers;
    }

    /**
     * Type of object to which the parameter applies. Valid values are those in [object types](https://docs.snowflake.com/en/sql-reference/parameters.html#object-types).
     * 
     */
    @Import(name="objectType", required=true)
    private Output<String> objectType;

    /**
     * @return Type of object to which the parameter applies. Valid values are those in [object types](https://docs.snowflake.com/en/sql-reference/parameters.html#object-types).
     * 
     */
    public Output<String> objectType() {
        return this.objectType;
    }

    /**
     * Value of object parameter, as a string. Constraints are the same as those for the parameters in Snowflake documentation.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return Value of object parameter, as a string. Constraints are the same as those for the parameters in Snowflake documentation.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private ObjectParameterArgs() {}

    private ObjectParameterArgs(ObjectParameterArgs $) {
        this.key = $.key;
        this.objectIdentifiers = $.objectIdentifiers;
        this.objectType = $.objectType;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ObjectParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ObjectParameterArgs $;

        public Builder() {
            $ = new ObjectParameterArgs();
        }

        public Builder(ObjectParameterArgs defaults) {
            $ = new ObjectParameterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param key Name of object parameter. Valid values are those in [object parameters](https://docs.snowflake.com/en/sql-reference/parameters.html#object-parameters).
         * 
         * @return builder
         * 
         */
        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key Name of object parameter. Valid values are those in [object parameters](https://docs.snowflake.com/en/sql-reference/parameters.html#object-parameters).
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param objectIdentifiers Specifies the object identifier for the object parameter.
         * 
         * @return builder
         * 
         */
        public Builder objectIdentifiers(Output<List<ObjectParameterObjectIdentifierArgs>> objectIdentifiers) {
            $.objectIdentifiers = objectIdentifiers;
            return this;
        }

        /**
         * @param objectIdentifiers Specifies the object identifier for the object parameter.
         * 
         * @return builder
         * 
         */
        public Builder objectIdentifiers(List<ObjectParameterObjectIdentifierArgs> objectIdentifiers) {
            return objectIdentifiers(Output.of(objectIdentifiers));
        }

        /**
         * @param objectIdentifiers Specifies the object identifier for the object parameter.
         * 
         * @return builder
         * 
         */
        public Builder objectIdentifiers(ObjectParameterObjectIdentifierArgs... objectIdentifiers) {
            return objectIdentifiers(List.of(objectIdentifiers));
        }

        /**
         * @param objectType Type of object to which the parameter applies. Valid values are those in [object types](https://docs.snowflake.com/en/sql-reference/parameters.html#object-types).
         * 
         * @return builder
         * 
         */
        public Builder objectType(Output<String> objectType) {
            $.objectType = objectType;
            return this;
        }

        /**
         * @param objectType Type of object to which the parameter applies. Valid values are those in [object types](https://docs.snowflake.com/en/sql-reference/parameters.html#object-types).
         * 
         * @return builder
         * 
         */
        public Builder objectType(String objectType) {
            return objectType(Output.of(objectType));
        }

        /**
         * @param value Value of object parameter, as a string. Constraints are the same as those for the parameters in Snowflake documentation.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Value of object parameter, as a string. Constraints are the same as those for the parameters in Snowflake documentation.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public ObjectParameterArgs build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.objectIdentifiers = Objects.requireNonNull($.objectIdentifiers, "expected parameter 'objectIdentifiers' to be non-null");
            $.objectType = Objects.requireNonNull($.objectType, "expected parameter 'objectType' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}