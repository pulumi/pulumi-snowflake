// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.snowflake.inputs.SecondaryConnectionShowOutputArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SecondaryConnectionState extends com.pulumi.resources.ResourceArgs {

    public static final SecondaryConnectionState Empty = new SecondaryConnectionState();

    /**
     * Specifies the identifier for a primary connection from which to create a replica (i.e. a secondary connection). For more information about this resource, see docs.
     * 
     */
    @Import(name="asReplicaOf")
    private @Nullable Output<String> asReplicaOf;

    /**
     * @return Specifies the identifier for a primary connection from which to create a replica (i.e. a secondary connection). For more information about this resource, see docs.
     * 
     */
    public Optional<Output<String>> asReplicaOf() {
        return Optional.ofNullable(this.asReplicaOf);
    }

    /**
     * Specifies a comment for the secondary connection.
     * 
     */
    @Import(name="comment")
    private @Nullable Output<String> comment;

    /**
     * @return Specifies a comment for the secondary connection.
     * 
     */
    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    /**
     * Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
     * 
     */
    @Import(name="fullyQualifiedName")
    private @Nullable Output<String> fullyQualifiedName;

    /**
     * @return Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
     * 
     */
    public Optional<Output<String>> fullyQualifiedName() {
        return Optional.ofNullable(this.fullyQualifiedName);
    }

    /**
     * Indicates if the connection primary status has been changed. If change is detected, resource will be recreated.
     * 
     */
    @Import(name="isPrimary")
    private @Nullable Output<Boolean> isPrimary;

    /**
     * @return Indicates if the connection primary status has been changed. If change is detected, resource will be recreated.
     * 
     */
    public Optional<Output<Boolean>> isPrimary() {
        return Optional.ofNullable(this.isPrimary);
    }

    /**
     * String that specifies the identifier (i.e. name) for the connection. Must start with an alphabetic character and may only contain letters, decimal digits (0-9), and underscores (*). For a secondary connection, the name must match the name of its primary connection. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return String that specifies the identifier (i.e. name) for the connection. Must start with an alphabetic character and may only contain letters, decimal digits (0-9), and underscores (*). For a secondary connection, the name must match the name of its primary connection. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Outputs the result of `SHOW CONNECTIONS` for the given connection.
     * 
     */
    @Import(name="showOutputs")
    private @Nullable Output<List<SecondaryConnectionShowOutputArgs>> showOutputs;

    /**
     * @return Outputs the result of `SHOW CONNECTIONS` for the given connection.
     * 
     */
    public Optional<Output<List<SecondaryConnectionShowOutputArgs>>> showOutputs() {
        return Optional.ofNullable(this.showOutputs);
    }

    private SecondaryConnectionState() {}

    private SecondaryConnectionState(SecondaryConnectionState $) {
        this.asReplicaOf = $.asReplicaOf;
        this.comment = $.comment;
        this.fullyQualifiedName = $.fullyQualifiedName;
        this.isPrimary = $.isPrimary;
        this.name = $.name;
        this.showOutputs = $.showOutputs;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecondaryConnectionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecondaryConnectionState $;

        public Builder() {
            $ = new SecondaryConnectionState();
        }

        public Builder(SecondaryConnectionState defaults) {
            $ = new SecondaryConnectionState(Objects.requireNonNull(defaults));
        }

        /**
         * @param asReplicaOf Specifies the identifier for a primary connection from which to create a replica (i.e. a secondary connection). For more information about this resource, see docs.
         * 
         * @return builder
         * 
         */
        public Builder asReplicaOf(@Nullable Output<String> asReplicaOf) {
            $.asReplicaOf = asReplicaOf;
            return this;
        }

        /**
         * @param asReplicaOf Specifies the identifier for a primary connection from which to create a replica (i.e. a secondary connection). For more information about this resource, see docs.
         * 
         * @return builder
         * 
         */
        public Builder asReplicaOf(String asReplicaOf) {
            return asReplicaOf(Output.of(asReplicaOf));
        }

        /**
         * @param comment Specifies a comment for the secondary connection.
         * 
         * @return builder
         * 
         */
        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        /**
         * @param comment Specifies a comment for the secondary connection.
         * 
         * @return builder
         * 
         */
        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        /**
         * @param fullyQualifiedName Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
         * 
         * @return builder
         * 
         */
        public Builder fullyQualifiedName(@Nullable Output<String> fullyQualifiedName) {
            $.fullyQualifiedName = fullyQualifiedName;
            return this;
        }

        /**
         * @param fullyQualifiedName Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
         * 
         * @return builder
         * 
         */
        public Builder fullyQualifiedName(String fullyQualifiedName) {
            return fullyQualifiedName(Output.of(fullyQualifiedName));
        }

        /**
         * @param isPrimary Indicates if the connection primary status has been changed. If change is detected, resource will be recreated.
         * 
         * @return builder
         * 
         */
        public Builder isPrimary(@Nullable Output<Boolean> isPrimary) {
            $.isPrimary = isPrimary;
            return this;
        }

        /**
         * @param isPrimary Indicates if the connection primary status has been changed. If change is detected, resource will be recreated.
         * 
         * @return builder
         * 
         */
        public Builder isPrimary(Boolean isPrimary) {
            return isPrimary(Output.of(isPrimary));
        }

        /**
         * @param name String that specifies the identifier (i.e. name) for the connection. Must start with an alphabetic character and may only contain letters, decimal digits (0-9), and underscores (*). For a secondary connection, the name must match the name of its primary connection. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name String that specifies the identifier (i.e. name) for the connection. Must start with an alphabetic character and may only contain letters, decimal digits (0-9), and underscores (*). For a secondary connection, the name must match the name of its primary connection. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param showOutputs Outputs the result of `SHOW CONNECTIONS` for the given connection.
         * 
         * @return builder
         * 
         */
        public Builder showOutputs(@Nullable Output<List<SecondaryConnectionShowOutputArgs>> showOutputs) {
            $.showOutputs = showOutputs;
            return this;
        }

        /**
         * @param showOutputs Outputs the result of `SHOW CONNECTIONS` for the given connection.
         * 
         * @return builder
         * 
         */
        public Builder showOutputs(List<SecondaryConnectionShowOutputArgs> showOutputs) {
            return showOutputs(Output.of(showOutputs));
        }

        /**
         * @param showOutputs Outputs the result of `SHOW CONNECTIONS` for the given connection.
         * 
         * @return builder
         * 
         */
        public Builder showOutputs(SecondaryConnectionShowOutputArgs... showOutputs) {
            return showOutputs(List.of(showOutputs));
        }

        public SecondaryConnectionState build() {
            return $;
        }
    }

}
