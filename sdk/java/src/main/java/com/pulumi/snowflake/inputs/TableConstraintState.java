// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.snowflake.inputs.TableConstraintForeignKeyPropertiesArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TableConstraintState extends com.pulumi.resources.ResourceArgs {

    public static final TableConstraintState Empty = new TableConstraintState();

    /**
     * Columns to use in foreign key reference
     * 
     */
    @Import(name="columns")
    private @Nullable Output<List<String>> columns;

    /**
     * @return Columns to use in foreign key reference
     * 
     */
    public Optional<Output<List<String>>> columns() {
        return Optional.ofNullable(this.columns);
    }

    /**
     * Comment for the table constraint
     * 
     */
    @Import(name="comment")
    private @Nullable Output<String> comment;

    /**
     * @return Comment for the table constraint
     * 
     */
    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    /**
     * Whether the constraint is deferrable
     * 
     */
    @Import(name="deferrable")
    private @Nullable Output<Boolean> deferrable;

    /**
     * @return Whether the constraint is deferrable
     * 
     */
    public Optional<Output<Boolean>> deferrable() {
        return Optional.ofNullable(this.deferrable);
    }

    /**
     * Specifies whether the constraint is enabled or disabled. These properties are provided for compatibility with Oracle.
     * 
     */
    @Import(name="enable")
    private @Nullable Output<Boolean> enable;

    /**
     * @return Specifies whether the constraint is enabled or disabled. These properties are provided for compatibility with Oracle.
     * 
     */
    public Optional<Output<Boolean>> enable() {
        return Optional.ofNullable(this.enable);
    }

    /**
     * Whether the constraint is enforced
     * 
     */
    @Import(name="enforced")
    private @Nullable Output<Boolean> enforced;

    /**
     * @return Whether the constraint is enforced
     * 
     */
    public Optional<Output<Boolean>> enforced() {
        return Optional.ofNullable(this.enforced);
    }

    /**
     * Additional properties when type is set to foreign key. Not applicable for primary/unique keys
     * 
     */
    @Import(name="foreignKeyProperties")
    private @Nullable Output<TableConstraintForeignKeyPropertiesArgs> foreignKeyProperties;

    /**
     * @return Additional properties when type is set to foreign key. Not applicable for primary/unique keys
     * 
     */
    public Optional<Output<TableConstraintForeignKeyPropertiesArgs>> foreignKeyProperties() {
        return Optional.ofNullable(this.foreignKeyProperties);
    }

    /**
     * Whether the constraint is initially deferred or immediate
     * 
     */
    @Import(name="initially")
    private @Nullable Output<String> initially;

    /**
     * @return Whether the constraint is initially deferred or immediate
     * 
     */
    public Optional<Output<String>> initially() {
        return Optional.ofNullable(this.initially);
    }

    /**
     * Name of constraint
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of constraint
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specifies whether a constraint in NOVALIDATE mode is taken into account during query rewrite.
     * 
     */
    @Import(name="rely")
    private @Nullable Output<Boolean> rely;

    /**
     * @return Specifies whether a constraint in NOVALIDATE mode is taken into account during query rewrite.
     * 
     */
    public Optional<Output<Boolean>> rely() {
        return Optional.ofNullable(this.rely);
    }

    /**
     * Name of constraint
     * 
     */
    @Import(name="tableId")
    private @Nullable Output<String> tableId;

    /**
     * @return Name of constraint
     * 
     */
    public Optional<Output<String>> tableId() {
        return Optional.ofNullable(this.tableId);
    }

    /**
     * Type of constraint, one of &#39;UNIQUE&#39;, &#39;PRIMARY KEY&#39;, &#39;FOREIGN KEY&#39;, or &#39;NOT NULL&#39;
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Type of constraint, one of &#39;UNIQUE&#39;, &#39;PRIMARY KEY&#39;, &#39;FOREIGN KEY&#39;, or &#39;NOT NULL&#39;
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * Specifies whether to validate existing data on the table when a constraint is created. Only used in conjunction with the ENABLE property.
     * 
     */
    @Import(name="validate")
    private @Nullable Output<Boolean> validate;

    /**
     * @return Specifies whether to validate existing data on the table when a constraint is created. Only used in conjunction with the ENABLE property.
     * 
     */
    public Optional<Output<Boolean>> validate() {
        return Optional.ofNullable(this.validate);
    }

    private TableConstraintState() {}

    private TableConstraintState(TableConstraintState $) {
        this.columns = $.columns;
        this.comment = $.comment;
        this.deferrable = $.deferrable;
        this.enable = $.enable;
        this.enforced = $.enforced;
        this.foreignKeyProperties = $.foreignKeyProperties;
        this.initially = $.initially;
        this.name = $.name;
        this.rely = $.rely;
        this.tableId = $.tableId;
        this.type = $.type;
        this.validate = $.validate;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TableConstraintState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TableConstraintState $;

        public Builder() {
            $ = new TableConstraintState();
        }

        public Builder(TableConstraintState defaults) {
            $ = new TableConstraintState(Objects.requireNonNull(defaults));
        }

        /**
         * @param columns Columns to use in foreign key reference
         * 
         * @return builder
         * 
         */
        public Builder columns(@Nullable Output<List<String>> columns) {
            $.columns = columns;
            return this;
        }

        /**
         * @param columns Columns to use in foreign key reference
         * 
         * @return builder
         * 
         */
        public Builder columns(List<String> columns) {
            return columns(Output.of(columns));
        }

        /**
         * @param columns Columns to use in foreign key reference
         * 
         * @return builder
         * 
         */
        public Builder columns(String... columns) {
            return columns(List.of(columns));
        }

        /**
         * @param comment Comment for the table constraint
         * 
         * @return builder
         * 
         */
        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        /**
         * @param comment Comment for the table constraint
         * 
         * @return builder
         * 
         */
        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        /**
         * @param deferrable Whether the constraint is deferrable
         * 
         * @return builder
         * 
         */
        public Builder deferrable(@Nullable Output<Boolean> deferrable) {
            $.deferrable = deferrable;
            return this;
        }

        /**
         * @param deferrable Whether the constraint is deferrable
         * 
         * @return builder
         * 
         */
        public Builder deferrable(Boolean deferrable) {
            return deferrable(Output.of(deferrable));
        }

        /**
         * @param enable Specifies whether the constraint is enabled or disabled. These properties are provided for compatibility with Oracle.
         * 
         * @return builder
         * 
         */
        public Builder enable(@Nullable Output<Boolean> enable) {
            $.enable = enable;
            return this;
        }

        /**
         * @param enable Specifies whether the constraint is enabled or disabled. These properties are provided for compatibility with Oracle.
         * 
         * @return builder
         * 
         */
        public Builder enable(Boolean enable) {
            return enable(Output.of(enable));
        }

        /**
         * @param enforced Whether the constraint is enforced
         * 
         * @return builder
         * 
         */
        public Builder enforced(@Nullable Output<Boolean> enforced) {
            $.enforced = enforced;
            return this;
        }

        /**
         * @param enforced Whether the constraint is enforced
         * 
         * @return builder
         * 
         */
        public Builder enforced(Boolean enforced) {
            return enforced(Output.of(enforced));
        }

        /**
         * @param foreignKeyProperties Additional properties when type is set to foreign key. Not applicable for primary/unique keys
         * 
         * @return builder
         * 
         */
        public Builder foreignKeyProperties(@Nullable Output<TableConstraintForeignKeyPropertiesArgs> foreignKeyProperties) {
            $.foreignKeyProperties = foreignKeyProperties;
            return this;
        }

        /**
         * @param foreignKeyProperties Additional properties when type is set to foreign key. Not applicable for primary/unique keys
         * 
         * @return builder
         * 
         */
        public Builder foreignKeyProperties(TableConstraintForeignKeyPropertiesArgs foreignKeyProperties) {
            return foreignKeyProperties(Output.of(foreignKeyProperties));
        }

        /**
         * @param initially Whether the constraint is initially deferred or immediate
         * 
         * @return builder
         * 
         */
        public Builder initially(@Nullable Output<String> initially) {
            $.initially = initially;
            return this;
        }

        /**
         * @param initially Whether the constraint is initially deferred or immediate
         * 
         * @return builder
         * 
         */
        public Builder initially(String initially) {
            return initially(Output.of(initially));
        }

        /**
         * @param name Name of constraint
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of constraint
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param rely Specifies whether a constraint in NOVALIDATE mode is taken into account during query rewrite.
         * 
         * @return builder
         * 
         */
        public Builder rely(@Nullable Output<Boolean> rely) {
            $.rely = rely;
            return this;
        }

        /**
         * @param rely Specifies whether a constraint in NOVALIDATE mode is taken into account during query rewrite.
         * 
         * @return builder
         * 
         */
        public Builder rely(Boolean rely) {
            return rely(Output.of(rely));
        }

        /**
         * @param tableId Name of constraint
         * 
         * @return builder
         * 
         */
        public Builder tableId(@Nullable Output<String> tableId) {
            $.tableId = tableId;
            return this;
        }

        /**
         * @param tableId Name of constraint
         * 
         * @return builder
         * 
         */
        public Builder tableId(String tableId) {
            return tableId(Output.of(tableId));
        }

        /**
         * @param type Type of constraint, one of &#39;UNIQUE&#39;, &#39;PRIMARY KEY&#39;, &#39;FOREIGN KEY&#39;, or &#39;NOT NULL&#39;
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of constraint, one of &#39;UNIQUE&#39;, &#39;PRIMARY KEY&#39;, &#39;FOREIGN KEY&#39;, or &#39;NOT NULL&#39;
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param validate Specifies whether to validate existing data on the table when a constraint is created. Only used in conjunction with the ENABLE property.
         * 
         * @return builder
         * 
         */
        public Builder validate(@Nullable Output<Boolean> validate) {
            $.validate = validate;
            return this;
        }

        /**
         * @param validate Specifies whether to validate existing data on the table when a constraint is created. Only used in conjunction with the ENABLE property.
         * 
         * @return builder
         * 
         */
        public Builder validate(Boolean validate) {
            return validate(Output.of(validate));
        }

        public TableConstraintState build() {
            return $;
        }
    }

}
