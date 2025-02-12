// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PrimaryConnectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final PrimaryConnectionArgs Empty = new PrimaryConnectionArgs();

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

    private PrimaryConnectionArgs() {}

    private PrimaryConnectionArgs(PrimaryConnectionArgs $) {
        this.comment = $.comment;
        this.enableFailoverToAccounts = $.enableFailoverToAccounts;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrimaryConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrimaryConnectionArgs $;

        public Builder() {
            $ = new PrimaryConnectionArgs();
        }

        public Builder(PrimaryConnectionArgs defaults) {
            $ = new PrimaryConnectionArgs(Objects.requireNonNull(defaults));
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

        public PrimaryConnectionArgs build() {
            return $;
        }
    }

}
