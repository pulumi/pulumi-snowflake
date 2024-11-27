// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.snowflake.inputs.ViewAggregationPolicyArgs;
import com.pulumi.snowflake.inputs.ViewColumnArgs;
import com.pulumi.snowflake.inputs.ViewDataMetricFunctionArgs;
import com.pulumi.snowflake.inputs.ViewDataMetricScheduleArgs;
import com.pulumi.snowflake.inputs.ViewRowAccessPolicyArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ViewArgs extends com.pulumi.resources.ResourceArgs {

    public static final ViewArgs Empty = new ViewArgs();

    /**
     * Specifies the aggregation policy to set on a view.
     * 
     */
    @Import(name="aggregationPolicy")
    private @Nullable Output<ViewAggregationPolicyArgs> aggregationPolicy;

    /**
     * @return Specifies the aggregation policy to set on a view.
     * 
     */
    public Optional<Output<ViewAggregationPolicyArgs>> aggregationPolicy() {
        return Optional.ofNullable(this.aggregationPolicy);
    }

    /**
     * Specifies to enable or disable change tracking on the table. Available options are: &#34;true&#34; or &#34;false&#34;. When the value is not set in the configuration the provider will put &#34;default&#34; there which means to use the Snowflake default for this value.
     * 
     */
    @Import(name="changeTracking")
    private @Nullable Output<String> changeTracking;

    /**
     * @return Specifies to enable or disable change tracking on the table. Available options are: &#34;true&#34; or &#34;false&#34;. When the value is not set in the configuration the provider will put &#34;default&#34; there which means to use the Snowflake default for this value.
     * 
     */
    public Optional<Output<String>> changeTracking() {
        return Optional.ofNullable(this.changeTracking);
    }

    /**
     * If you want to change the name of a column or add a comment to a column in the new view, include a column list that specifies the column names and (if needed) comments about the columns. You do not need to specify the data types of the columns. If this field is not specified, columns are inferred from the `statement` field by Snowflake.
     * 
     */
    @Import(name="columns")
    private @Nullable Output<List<ViewColumnArgs>> columns;

    /**
     * @return If you want to change the name of a column or add a comment to a column in the new view, include a column list that specifies the column names and (if needed) comments about the columns. You do not need to specify the data types of the columns. If this field is not specified, columns are inferred from the `statement` field by Snowflake.
     * 
     */
    public Optional<Output<List<ViewColumnArgs>>> columns() {
        return Optional.ofNullable(this.columns);
    }

    /**
     * Specifies a comment for the view.
     * 
     */
    @Import(name="comment")
    private @Nullable Output<String> comment;

    /**
     * @return Specifies a comment for the view.
     * 
     */
    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    /**
     * Retains the access permissions from the original view when a new view is created using the OR REPLACE clause.
     * 
     */
    @Import(name="copyGrants")
    private @Nullable Output<Boolean> copyGrants;

    /**
     * @return Retains the access permissions from the original view when a new view is created using the OR REPLACE clause.
     * 
     */
    public Optional<Output<Boolean>> copyGrants() {
        return Optional.ofNullable(this.copyGrants);
    }

    /**
     * Data metric functions used for the view.
     * 
     */
    @Import(name="dataMetricFunctions")
    private @Nullable Output<List<ViewDataMetricFunctionArgs>> dataMetricFunctions;

    /**
     * @return Data metric functions used for the view.
     * 
     */
    public Optional<Output<List<ViewDataMetricFunctionArgs>>> dataMetricFunctions() {
        return Optional.ofNullable(this.dataMetricFunctions);
    }

    /**
     * Specifies the schedule to run the data metric functions periodically.
     * 
     */
    @Import(name="dataMetricSchedule")
    private @Nullable Output<ViewDataMetricScheduleArgs> dataMetricSchedule;

    /**
     * @return Specifies the schedule to run the data metric functions periodically.
     * 
     */
    public Optional<Output<ViewDataMetricScheduleArgs>> dataMetricSchedule() {
        return Optional.ofNullable(this.dataMetricSchedule);
    }

    /**
     * The database in which to create the view. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`
     * 
     */
    @Import(name="database", required=true)
    private Output<String> database;

    /**
     * @return The database in which to create the view. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`
     * 
     */
    public Output<String> database() {
        return this.database;
    }

    /**
     * Specifies that the view can refer to itself using recursive syntax without necessarily using a CTE (common table expression). Available options are: &#34;true&#34; or &#34;false&#34;. When the value is not set in the configuration the provider will put &#34;default&#34; there which means to use the Snowflake default for this value.
     * 
     */
    @Import(name="isRecursive")
    private @Nullable Output<String> isRecursive;

    /**
     * @return Specifies that the view can refer to itself using recursive syntax without necessarily using a CTE (common table expression). Available options are: &#34;true&#34; or &#34;false&#34;. When the value is not set in the configuration the provider will put &#34;default&#34; there which means to use the Snowflake default for this value.
     * 
     */
    public Optional<Output<String>> isRecursive() {
        return Optional.ofNullable(this.isRecursive);
    }

    @Import(name="isSecure")
    private @Nullable Output<String> isSecure;

    public Optional<Output<String>> isSecure() {
        return Optional.ofNullable(this.isSecure);
    }

    @Import(name="isTemporary")
    private @Nullable Output<String> isTemporary;

    public Optional<Output<String>> isTemporary() {
        return Optional.ofNullable(this.isTemporary);
    }

    /**
     * Specifies the identifier for the view; must be unique for the schema in which the view is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the identifier for the view; must be unique for the schema in which the view is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specifies the row access policy to set on a view.
     * 
     */
    @Import(name="rowAccessPolicy")
    private @Nullable Output<ViewRowAccessPolicyArgs> rowAccessPolicy;

    /**
     * @return Specifies the row access policy to set on a view.
     * 
     */
    public Optional<Output<ViewRowAccessPolicyArgs>> rowAccessPolicy() {
        return Optional.ofNullable(this.rowAccessPolicy);
    }

    /**
     * The schema in which to create the view. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`
     * 
     */
    @Import(name="schema", required=true)
    private Output<String> schema;

    /**
     * @return The schema in which to create the view. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`
     * 
     */
    public Output<String> schema() {
        return this.schema;
    }

    /**
     * Specifies the query used to create the view.
     * 
     */
    @Import(name="statement", required=true)
    private Output<String> statement;

    /**
     * @return Specifies the query used to create the view.
     * 
     */
    public Output<String> statement() {
        return this.statement;
    }

    private ViewArgs() {}

    private ViewArgs(ViewArgs $) {
        this.aggregationPolicy = $.aggregationPolicy;
        this.changeTracking = $.changeTracking;
        this.columns = $.columns;
        this.comment = $.comment;
        this.copyGrants = $.copyGrants;
        this.dataMetricFunctions = $.dataMetricFunctions;
        this.dataMetricSchedule = $.dataMetricSchedule;
        this.database = $.database;
        this.isRecursive = $.isRecursive;
        this.isSecure = $.isSecure;
        this.isTemporary = $.isTemporary;
        this.name = $.name;
        this.rowAccessPolicy = $.rowAccessPolicy;
        this.schema = $.schema;
        this.statement = $.statement;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ViewArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ViewArgs $;

        public Builder() {
            $ = new ViewArgs();
        }

        public Builder(ViewArgs defaults) {
            $ = new ViewArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param aggregationPolicy Specifies the aggregation policy to set on a view.
         * 
         * @return builder
         * 
         */
        public Builder aggregationPolicy(@Nullable Output<ViewAggregationPolicyArgs> aggregationPolicy) {
            $.aggregationPolicy = aggregationPolicy;
            return this;
        }

        /**
         * @param aggregationPolicy Specifies the aggregation policy to set on a view.
         * 
         * @return builder
         * 
         */
        public Builder aggregationPolicy(ViewAggregationPolicyArgs aggregationPolicy) {
            return aggregationPolicy(Output.of(aggregationPolicy));
        }

        /**
         * @param changeTracking Specifies to enable or disable change tracking on the table. Available options are: &#34;true&#34; or &#34;false&#34;. When the value is not set in the configuration the provider will put &#34;default&#34; there which means to use the Snowflake default for this value.
         * 
         * @return builder
         * 
         */
        public Builder changeTracking(@Nullable Output<String> changeTracking) {
            $.changeTracking = changeTracking;
            return this;
        }

        /**
         * @param changeTracking Specifies to enable or disable change tracking on the table. Available options are: &#34;true&#34; or &#34;false&#34;. When the value is not set in the configuration the provider will put &#34;default&#34; there which means to use the Snowflake default for this value.
         * 
         * @return builder
         * 
         */
        public Builder changeTracking(String changeTracking) {
            return changeTracking(Output.of(changeTracking));
        }

        /**
         * @param columns If you want to change the name of a column or add a comment to a column in the new view, include a column list that specifies the column names and (if needed) comments about the columns. You do not need to specify the data types of the columns. If this field is not specified, columns are inferred from the `statement` field by Snowflake.
         * 
         * @return builder
         * 
         */
        public Builder columns(@Nullable Output<List<ViewColumnArgs>> columns) {
            $.columns = columns;
            return this;
        }

        /**
         * @param columns If you want to change the name of a column or add a comment to a column in the new view, include a column list that specifies the column names and (if needed) comments about the columns. You do not need to specify the data types of the columns. If this field is not specified, columns are inferred from the `statement` field by Snowflake.
         * 
         * @return builder
         * 
         */
        public Builder columns(List<ViewColumnArgs> columns) {
            return columns(Output.of(columns));
        }

        /**
         * @param columns If you want to change the name of a column or add a comment to a column in the new view, include a column list that specifies the column names and (if needed) comments about the columns. You do not need to specify the data types of the columns. If this field is not specified, columns are inferred from the `statement` field by Snowflake.
         * 
         * @return builder
         * 
         */
        public Builder columns(ViewColumnArgs... columns) {
            return columns(List.of(columns));
        }

        /**
         * @param comment Specifies a comment for the view.
         * 
         * @return builder
         * 
         */
        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        /**
         * @param comment Specifies a comment for the view.
         * 
         * @return builder
         * 
         */
        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        /**
         * @param copyGrants Retains the access permissions from the original view when a new view is created using the OR REPLACE clause.
         * 
         * @return builder
         * 
         */
        public Builder copyGrants(@Nullable Output<Boolean> copyGrants) {
            $.copyGrants = copyGrants;
            return this;
        }

        /**
         * @param copyGrants Retains the access permissions from the original view when a new view is created using the OR REPLACE clause.
         * 
         * @return builder
         * 
         */
        public Builder copyGrants(Boolean copyGrants) {
            return copyGrants(Output.of(copyGrants));
        }

        /**
         * @param dataMetricFunctions Data metric functions used for the view.
         * 
         * @return builder
         * 
         */
        public Builder dataMetricFunctions(@Nullable Output<List<ViewDataMetricFunctionArgs>> dataMetricFunctions) {
            $.dataMetricFunctions = dataMetricFunctions;
            return this;
        }

        /**
         * @param dataMetricFunctions Data metric functions used for the view.
         * 
         * @return builder
         * 
         */
        public Builder dataMetricFunctions(List<ViewDataMetricFunctionArgs> dataMetricFunctions) {
            return dataMetricFunctions(Output.of(dataMetricFunctions));
        }

        /**
         * @param dataMetricFunctions Data metric functions used for the view.
         * 
         * @return builder
         * 
         */
        public Builder dataMetricFunctions(ViewDataMetricFunctionArgs... dataMetricFunctions) {
            return dataMetricFunctions(List.of(dataMetricFunctions));
        }

        /**
         * @param dataMetricSchedule Specifies the schedule to run the data metric functions periodically.
         * 
         * @return builder
         * 
         */
        public Builder dataMetricSchedule(@Nullable Output<ViewDataMetricScheduleArgs> dataMetricSchedule) {
            $.dataMetricSchedule = dataMetricSchedule;
            return this;
        }

        /**
         * @param dataMetricSchedule Specifies the schedule to run the data metric functions periodically.
         * 
         * @return builder
         * 
         */
        public Builder dataMetricSchedule(ViewDataMetricScheduleArgs dataMetricSchedule) {
            return dataMetricSchedule(Output.of(dataMetricSchedule));
        }

        /**
         * @param database The database in which to create the view. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`
         * 
         * @return builder
         * 
         */
        public Builder database(Output<String> database) {
            $.database = database;
            return this;
        }

        /**
         * @param database The database in which to create the view. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`
         * 
         * @return builder
         * 
         */
        public Builder database(String database) {
            return database(Output.of(database));
        }

        /**
         * @param isRecursive Specifies that the view can refer to itself using recursive syntax without necessarily using a CTE (common table expression). Available options are: &#34;true&#34; or &#34;false&#34;. When the value is not set in the configuration the provider will put &#34;default&#34; there which means to use the Snowflake default for this value.
         * 
         * @return builder
         * 
         */
        public Builder isRecursive(@Nullable Output<String> isRecursive) {
            $.isRecursive = isRecursive;
            return this;
        }

        /**
         * @param isRecursive Specifies that the view can refer to itself using recursive syntax without necessarily using a CTE (common table expression). Available options are: &#34;true&#34; or &#34;false&#34;. When the value is not set in the configuration the provider will put &#34;default&#34; there which means to use the Snowflake default for this value.
         * 
         * @return builder
         * 
         */
        public Builder isRecursive(String isRecursive) {
            return isRecursive(Output.of(isRecursive));
        }

        public Builder isSecure(@Nullable Output<String> isSecure) {
            $.isSecure = isSecure;
            return this;
        }

        public Builder isSecure(String isSecure) {
            return isSecure(Output.of(isSecure));
        }

        public Builder isTemporary(@Nullable Output<String> isTemporary) {
            $.isTemporary = isTemporary;
            return this;
        }

        public Builder isTemporary(String isTemporary) {
            return isTemporary(Output.of(isTemporary));
        }

        /**
         * @param name Specifies the identifier for the view; must be unique for the schema in which the view is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the identifier for the view; must be unique for the schema in which the view is created. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param rowAccessPolicy Specifies the row access policy to set on a view.
         * 
         * @return builder
         * 
         */
        public Builder rowAccessPolicy(@Nullable Output<ViewRowAccessPolicyArgs> rowAccessPolicy) {
            $.rowAccessPolicy = rowAccessPolicy;
            return this;
        }

        /**
         * @param rowAccessPolicy Specifies the row access policy to set on a view.
         * 
         * @return builder
         * 
         */
        public Builder rowAccessPolicy(ViewRowAccessPolicyArgs rowAccessPolicy) {
            return rowAccessPolicy(Output.of(rowAccessPolicy));
        }

        /**
         * @param schema The schema in which to create the view. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`
         * 
         * @return builder
         * 
         */
        public Builder schema(Output<String> schema) {
            $.schema = schema;
            return this;
        }

        /**
         * @param schema The schema in which to create the view. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`
         * 
         * @return builder
         * 
         */
        public Builder schema(String schema) {
            return schema(Output.of(schema));
        }

        /**
         * @param statement Specifies the query used to create the view.
         * 
         * @return builder
         * 
         */
        public Builder statement(Output<String> statement) {
            $.statement = statement;
            return this;
        }

        /**
         * @param statement Specifies the query used to create the view.
         * 
         * @return builder
         * 
         */
        public Builder statement(String statement) {
            return statement(Output.of(statement));
        }

        public ViewArgs build() {
            if ($.database == null) {
                throw new MissingRequiredPropertyException("ViewArgs", "database");
            }
            if ($.schema == null) {
                throw new MissingRequiredPropertyException("ViewArgs", "schema");
            }
            if ($.statement == null) {
                throw new MissingRequiredPropertyException("ViewArgs", "statement");
            }
            return $;
        }
    }

}
