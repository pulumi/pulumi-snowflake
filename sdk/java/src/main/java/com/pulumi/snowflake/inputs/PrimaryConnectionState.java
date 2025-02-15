// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.snowflake.inputs.PrimaryConnectionShowOutputArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PrimaryConnectionState extends com.pulumi.resources.ResourceArgs {

    public static final PrimaryConnectionState Empty = new PrimaryConnectionState();

    /**
     * Specifies a comment for the connection.
     * 
     */
    @Import(name="comment")
    private @Nullable Output<String> comment;

    /**
     * @return Specifies a comment for the connection.
     * 
     */
    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    /**
     * Enables failover for given connection to provided accounts. Specifies a list of accounts in your organization where a secondary connection for this primary connection can be promoted to serve as the primary connection. Include your organization name for each account in the list. For more information about this resource, see docs.
     * 
     */
    @Import(name="enableFailoverToAccounts")
    private @Nullable Output<List<String>> enableFailoverToAccounts;

    /**
     * @return Enables failover for given connection to provided accounts. Specifies a list of accounts in your organization where a secondary connection for this primary connection can be promoted to serve as the primary connection. Include your organization name for each account in the list. For more information about this resource, see docs.
     * 
     */
    public Optional<Output<List<String>>> enableFailoverToAccounts() {
        return Optional.ofNullable(this.enableFailoverToAccounts);
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

    @Import(name="isPrimary")
    private @Nullable Output<Boolean> isPrimary;

    public Optional<Output<Boolean>> isPrimary() {
        return Optional.ofNullable(this.isPrimary);
    }

    /**
     * String that specifies the identifier (i.e. name) for the connection. Must start with an alphabetic character and may only contain letters, decimal digits (0-9), and underscores (*). For a primary connection, the name must be unique across connection names and account names in the organization.  Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return String that specifies the identifier (i.e. name) for the connection. Must start with an alphabetic character and may only contain letters, decimal digits (0-9), and underscores (*). For a primary connection, the name must be unique across connection names and account names in the organization.  Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`.
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
    private @Nullable Output<List<PrimaryConnectionShowOutputArgs>> showOutputs;

    /**
     * @return Outputs the result of `SHOW CONNECTIONS` for the given connection.
     * 
     */
    public Optional<Output<List<PrimaryConnectionShowOutputArgs>>> showOutputs() {
        return Optional.ofNullable(this.showOutputs);
    }

    private PrimaryConnectionState() {}

    private PrimaryConnectionState(PrimaryConnectionState $) {
        this.comment = $.comment;
        this.enableFailoverToAccounts = $.enableFailoverToAccounts;
        this.fullyQualifiedName = $.fullyQualifiedName;
        this.isPrimary = $.isPrimary;
        this.name = $.name;
        this.showOutputs = $.showOutputs;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrimaryConnectionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrimaryConnectionState $;

        public Builder() {
            $ = new PrimaryConnectionState();
        }

        public Builder(PrimaryConnectionState defaults) {
            $ = new PrimaryConnectionState(Objects.requireNonNull(defaults));
        }

        /**
         * @param comment Specifies a comment for the connection.
         * 
         * @return builder
         * 
         */
        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        /**
         * @param comment Specifies a comment for the connection.
         * 
         * @return builder
         * 
         */
        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        /**
         * @param enableFailoverToAccounts Enables failover for given connection to provided accounts. Specifies a list of accounts in your organization where a secondary connection for this primary connection can be promoted to serve as the primary connection. Include your organization name for each account in the list. For more information about this resource, see docs.
         * 
         * @return builder
         * 
         */
        public Builder enableFailoverToAccounts(@Nullable Output<List<String>> enableFailoverToAccounts) {
            $.enableFailoverToAccounts = enableFailoverToAccounts;
            return this;
        }

        /**
         * @param enableFailoverToAccounts Enables failover for given connection to provided accounts. Specifies a list of accounts in your organization where a secondary connection for this primary connection can be promoted to serve as the primary connection. Include your organization name for each account in the list. For more information about this resource, see docs.
         * 
         * @return builder
         * 
         */
        public Builder enableFailoverToAccounts(List<String> enableFailoverToAccounts) {
            return enableFailoverToAccounts(Output.of(enableFailoverToAccounts));
        }

        /**
         * @param enableFailoverToAccounts Enables failover for given connection to provided accounts. Specifies a list of accounts in your organization where a secondary connection for this primary connection can be promoted to serve as the primary connection. Include your organization name for each account in the list. For more information about this resource, see docs.
         * 
         * @return builder
         * 
         */
        public Builder enableFailoverToAccounts(String... enableFailoverToAccounts) {
            return enableFailoverToAccounts(List.of(enableFailoverToAccounts));
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

        public Builder isPrimary(@Nullable Output<Boolean> isPrimary) {
            $.isPrimary = isPrimary;
            return this;
        }

        public Builder isPrimary(Boolean isPrimary) {
            return isPrimary(Output.of(isPrimary));
        }

        /**
         * @param name String that specifies the identifier (i.e. name) for the connection. Must start with an alphabetic character and may only contain letters, decimal digits (0-9), and underscores (*). For a primary connection, the name must be unique across connection names and account names in the organization.  Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name String that specifies the identifier (i.e. name) for the connection. Must start with an alphabetic character and may only contain letters, decimal digits (0-9), and underscores (*). For a primary connection, the name must be unique across connection names and account names in the organization.  Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`.
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
        public Builder showOutputs(@Nullable Output<List<PrimaryConnectionShowOutputArgs>> showOutputs) {
            $.showOutputs = showOutputs;
            return this;
        }

        /**
         * @param showOutputs Outputs the result of `SHOW CONNECTIONS` for the given connection.
         * 
         * @return builder
         * 
         */
        public Builder showOutputs(List<PrimaryConnectionShowOutputArgs> showOutputs) {
            return showOutputs(Output.of(showOutputs));
        }

        /**
         * @param showOutputs Outputs the result of `SHOW CONNECTIONS` for the given connection.
         * 
         * @return builder
         * 
         */
        public Builder showOutputs(PrimaryConnectionShowOutputArgs... showOutputs) {
            return showOutputs(List.of(showOutputs));
        }

        public PrimaryConnectionState build() {
            return $;
        }
    }

}
