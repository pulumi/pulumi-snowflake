// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetParametersPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetParametersPlainArgs Empty = new GetParametersPlainArgs();

    /**
     * If parameter*type is set to &#34;OBJECT&#34; then object*name is the name of the object to display object parameters for.
     * 
     */
    @Import(name="objectName")
    private @Nullable String objectName;

    /**
     * @return If parameter*type is set to &#34;OBJECT&#34; then object*name is the name of the object to display object parameters for.
     * 
     */
    public Optional<String> objectName() {
        return Optional.ofNullable(this.objectName);
    }

    /**
     * If parameter*type is set to &#34;OBJECT&#34; then object*type is the type of object to display object parameters for. Valid values are any object supported by the IN clause of the [SHOW PARAMETERS](https://docs.snowflake.com/en/sql-reference/sql/show-parameters.html#parameters) statement, including: WAREHOUSE | DATABASE | SCHEMA | TASK | TABLE
     * 
     */
    @Import(name="objectType")
    private @Nullable String objectType;

    /**
     * @return If parameter*type is set to &#34;OBJECT&#34; then object*type is the type of object to display object parameters for. Valid values are any object supported by the IN clause of the [SHOW PARAMETERS](https://docs.snowflake.com/en/sql-reference/sql/show-parameters.html#parameters) statement, including: WAREHOUSE | DATABASE | SCHEMA | TASK | TABLE
     * 
     */
    public Optional<String> objectType() {
        return Optional.ofNullable(this.objectType);
    }

    /**
     * The type of parameter to filter by. Valid values are: &#34;ACCOUNT&#34;, &#34;SESSION&#34;, &#34;OBJECT&#34;.
     * 
     */
    @Import(name="parameterType")
    private @Nullable String parameterType;

    /**
     * @return The type of parameter to filter by. Valid values are: &#34;ACCOUNT&#34;, &#34;SESSION&#34;, &#34;OBJECT&#34;.
     * 
     */
    public Optional<String> parameterType() {
        return Optional.ofNullable(this.parameterType);
    }

    /**
     * Allows limiting the list of parameters by name using LIKE clause. Refer to [Limiting the List of Parameters by Name](https://docs.snowflake.com/en/sql-reference/parameters.html#limiting-the-list-of-parameters-by-name)
     * 
     */
    @Import(name="pattern")
    private @Nullable String pattern;

    /**
     * @return Allows limiting the list of parameters by name using LIKE clause. Refer to [Limiting the List of Parameters by Name](https://docs.snowflake.com/en/sql-reference/parameters.html#limiting-the-list-of-parameters-by-name)
     * 
     */
    public Optional<String> pattern() {
        return Optional.ofNullable(this.pattern);
    }

    private GetParametersPlainArgs() {}

    private GetParametersPlainArgs(GetParametersPlainArgs $) {
        this.objectName = $.objectName;
        this.objectType = $.objectType;
        this.parameterType = $.parameterType;
        this.pattern = $.pattern;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetParametersPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetParametersPlainArgs $;

        public Builder() {
            $ = new GetParametersPlainArgs();
        }

        public Builder(GetParametersPlainArgs defaults) {
            $ = new GetParametersPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param objectName If parameter*type is set to &#34;OBJECT&#34; then object*name is the name of the object to display object parameters for.
         * 
         * @return builder
         * 
         */
        public Builder objectName(@Nullable String objectName) {
            $.objectName = objectName;
            return this;
        }

        /**
         * @param objectType If parameter*type is set to &#34;OBJECT&#34; then object*type is the type of object to display object parameters for. Valid values are any object supported by the IN clause of the [SHOW PARAMETERS](https://docs.snowflake.com/en/sql-reference/sql/show-parameters.html#parameters) statement, including: WAREHOUSE | DATABASE | SCHEMA | TASK | TABLE
         * 
         * @return builder
         * 
         */
        public Builder objectType(@Nullable String objectType) {
            $.objectType = objectType;
            return this;
        }

        /**
         * @param parameterType The type of parameter to filter by. Valid values are: &#34;ACCOUNT&#34;, &#34;SESSION&#34;, &#34;OBJECT&#34;.
         * 
         * @return builder
         * 
         */
        public Builder parameterType(@Nullable String parameterType) {
            $.parameterType = parameterType;
            return this;
        }

        /**
         * @param pattern Allows limiting the list of parameters by name using LIKE clause. Refer to [Limiting the List of Parameters by Name](https://docs.snowflake.com/en/sql-reference/parameters.html#limiting-the-list-of-parameters-by-name)
         * 
         * @return builder
         * 
         */
        public Builder pattern(@Nullable String pattern) {
            $.pattern = pattern;
            return this;
        }

        public GetParametersPlainArgs build() {
            return $;
        }
    }

}