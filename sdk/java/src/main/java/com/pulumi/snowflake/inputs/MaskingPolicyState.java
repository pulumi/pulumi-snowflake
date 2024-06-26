// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.snowflake.inputs.MaskingPolicySignatureArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MaskingPolicyState extends com.pulumi.resources.ResourceArgs {

    public static final MaskingPolicyState Empty = new MaskingPolicyState();

    /**
     * Specifies a comment for the masking policy.
     * 
     */
    @Import(name="comment")
    private @Nullable Output<String> comment;

    /**
     * @return Specifies a comment for the masking policy.
     * 
     */
    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    /**
     * The database in which to create the masking policy.
     * 
     */
    @Import(name="database")
    private @Nullable Output<String> database;

    /**
     * @return The database in which to create the masking policy.
     * 
     */
    public Optional<Output<String>> database() {
        return Optional.ofNullable(this.database);
    }

    /**
     * Specifies whether the row access policy or conditional masking policy can reference a column that is already protected by a masking policy.
     * 
     */
    @Import(name="exemptOtherPolicies")
    private @Nullable Output<Boolean> exemptOtherPolicies;

    /**
     * @return Specifies whether the row access policy or conditional masking policy can reference a column that is already protected by a masking policy.
     * 
     */
    public Optional<Output<Boolean>> exemptOtherPolicies() {
        return Optional.ofNullable(this.exemptOtherPolicies);
    }

    /**
     * Prevent overwriting a previous masking policy with the same name.
     * 
     */
    @Import(name="ifNotExists")
    private @Nullable Output<Boolean> ifNotExists;

    /**
     * @return Prevent overwriting a previous masking policy with the same name.
     * 
     */
    public Optional<Output<Boolean>> ifNotExists() {
        return Optional.ofNullable(this.ifNotExists);
    }

    /**
     * Specifies the SQL expression that transforms the data.
     * 
     */
    @Import(name="maskingExpression")
    private @Nullable Output<String> maskingExpression;

    /**
     * @return Specifies the SQL expression that transforms the data.
     * 
     */
    public Optional<Output<String>> maskingExpression() {
        return Optional.ofNullable(this.maskingExpression);
    }

    /**
     * Specifies the identifier for the masking policy; must be unique for the database and schema in which the masking policy is created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the identifier for the masking policy; must be unique for the database and schema in which the masking policy is created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Whether to override a previous masking policy with the same name.
     * 
     */
    @Import(name="orReplace")
    private @Nullable Output<Boolean> orReplace;

    /**
     * @return Whether to override a previous masking policy with the same name.
     * 
     */
    public Optional<Output<Boolean>> orReplace() {
        return Optional.ofNullable(this.orReplace);
    }

    /**
     * Specifies the qualified identifier for the masking policy.
     * 
     */
    @Import(name="qualifiedName")
    private @Nullable Output<String> qualifiedName;

    /**
     * @return Specifies the qualified identifier for the masking policy.
     * 
     */
    public Optional<Output<String>> qualifiedName() {
        return Optional.ofNullable(this.qualifiedName);
    }

    /**
     * Specifies the data type to return.
     * 
     */
    @Import(name="returnDataType")
    private @Nullable Output<String> returnDataType;

    /**
     * @return Specifies the data type to return.
     * 
     */
    public Optional<Output<String>> returnDataType() {
        return Optional.ofNullable(this.returnDataType);
    }

    /**
     * The schema in which to create the masking policy.
     * 
     */
    @Import(name="schema")
    private @Nullable Output<String> schema;

    /**
     * @return The schema in which to create the masking policy.
     * 
     */
    public Optional<Output<String>> schema() {
        return Optional.ofNullable(this.schema);
    }

    /**
     * The signature for the masking policy; specifies the input columns and data types to evaluate at query runtime.
     * 
     */
    @Import(name="signature")
    private @Nullable Output<MaskingPolicySignatureArgs> signature;

    /**
     * @return The signature for the masking policy; specifies the input columns and data types to evaluate at query runtime.
     * 
     */
    public Optional<Output<MaskingPolicySignatureArgs>> signature() {
        return Optional.ofNullable(this.signature);
    }

    private MaskingPolicyState() {}

    private MaskingPolicyState(MaskingPolicyState $) {
        this.comment = $.comment;
        this.database = $.database;
        this.exemptOtherPolicies = $.exemptOtherPolicies;
        this.ifNotExists = $.ifNotExists;
        this.maskingExpression = $.maskingExpression;
        this.name = $.name;
        this.orReplace = $.orReplace;
        this.qualifiedName = $.qualifiedName;
        this.returnDataType = $.returnDataType;
        this.schema = $.schema;
        this.signature = $.signature;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MaskingPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MaskingPolicyState $;

        public Builder() {
            $ = new MaskingPolicyState();
        }

        public Builder(MaskingPolicyState defaults) {
            $ = new MaskingPolicyState(Objects.requireNonNull(defaults));
        }

        /**
         * @param comment Specifies a comment for the masking policy.
         * 
         * @return builder
         * 
         */
        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        /**
         * @param comment Specifies a comment for the masking policy.
         * 
         * @return builder
         * 
         */
        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        /**
         * @param database The database in which to create the masking policy.
         * 
         * @return builder
         * 
         */
        public Builder database(@Nullable Output<String> database) {
            $.database = database;
            return this;
        }

        /**
         * @param database The database in which to create the masking policy.
         * 
         * @return builder
         * 
         */
        public Builder database(String database) {
            return database(Output.of(database));
        }

        /**
         * @param exemptOtherPolicies Specifies whether the row access policy or conditional masking policy can reference a column that is already protected by a masking policy.
         * 
         * @return builder
         * 
         */
        public Builder exemptOtherPolicies(@Nullable Output<Boolean> exemptOtherPolicies) {
            $.exemptOtherPolicies = exemptOtherPolicies;
            return this;
        }

        /**
         * @param exemptOtherPolicies Specifies whether the row access policy or conditional masking policy can reference a column that is already protected by a masking policy.
         * 
         * @return builder
         * 
         */
        public Builder exemptOtherPolicies(Boolean exemptOtherPolicies) {
            return exemptOtherPolicies(Output.of(exemptOtherPolicies));
        }

        /**
         * @param ifNotExists Prevent overwriting a previous masking policy with the same name.
         * 
         * @return builder
         * 
         */
        public Builder ifNotExists(@Nullable Output<Boolean> ifNotExists) {
            $.ifNotExists = ifNotExists;
            return this;
        }

        /**
         * @param ifNotExists Prevent overwriting a previous masking policy with the same name.
         * 
         * @return builder
         * 
         */
        public Builder ifNotExists(Boolean ifNotExists) {
            return ifNotExists(Output.of(ifNotExists));
        }

        /**
         * @param maskingExpression Specifies the SQL expression that transforms the data.
         * 
         * @return builder
         * 
         */
        public Builder maskingExpression(@Nullable Output<String> maskingExpression) {
            $.maskingExpression = maskingExpression;
            return this;
        }

        /**
         * @param maskingExpression Specifies the SQL expression that transforms the data.
         * 
         * @return builder
         * 
         */
        public Builder maskingExpression(String maskingExpression) {
            return maskingExpression(Output.of(maskingExpression));
        }

        /**
         * @param name Specifies the identifier for the masking policy; must be unique for the database and schema in which the masking policy is created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the identifier for the masking policy; must be unique for the database and schema in which the masking policy is created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param orReplace Whether to override a previous masking policy with the same name.
         * 
         * @return builder
         * 
         */
        public Builder orReplace(@Nullable Output<Boolean> orReplace) {
            $.orReplace = orReplace;
            return this;
        }

        /**
         * @param orReplace Whether to override a previous masking policy with the same name.
         * 
         * @return builder
         * 
         */
        public Builder orReplace(Boolean orReplace) {
            return orReplace(Output.of(orReplace));
        }

        /**
         * @param qualifiedName Specifies the qualified identifier for the masking policy.
         * 
         * @return builder
         * 
         */
        public Builder qualifiedName(@Nullable Output<String> qualifiedName) {
            $.qualifiedName = qualifiedName;
            return this;
        }

        /**
         * @param qualifiedName Specifies the qualified identifier for the masking policy.
         * 
         * @return builder
         * 
         */
        public Builder qualifiedName(String qualifiedName) {
            return qualifiedName(Output.of(qualifiedName));
        }

        /**
         * @param returnDataType Specifies the data type to return.
         * 
         * @return builder
         * 
         */
        public Builder returnDataType(@Nullable Output<String> returnDataType) {
            $.returnDataType = returnDataType;
            return this;
        }

        /**
         * @param returnDataType Specifies the data type to return.
         * 
         * @return builder
         * 
         */
        public Builder returnDataType(String returnDataType) {
            return returnDataType(Output.of(returnDataType));
        }

        /**
         * @param schema The schema in which to create the masking policy.
         * 
         * @return builder
         * 
         */
        public Builder schema(@Nullable Output<String> schema) {
            $.schema = schema;
            return this;
        }

        /**
         * @param schema The schema in which to create the masking policy.
         * 
         * @return builder
         * 
         */
        public Builder schema(String schema) {
            return schema(Output.of(schema));
        }

        /**
         * @param signature The signature for the masking policy; specifies the input columns and data types to evaluate at query runtime.
         * 
         * @return builder
         * 
         */
        public Builder signature(@Nullable Output<MaskingPolicySignatureArgs> signature) {
            $.signature = signature;
            return this;
        }

        /**
         * @param signature The signature for the masking policy; specifies the input columns and data types to evaluate at query runtime.
         * 
         * @return builder
         * 
         */
        public Builder signature(MaskingPolicySignatureArgs signature) {
            return signature(Output.of(signature));
        }

        public MaskingPolicyState build() {
            return $;
        }
    }

}
