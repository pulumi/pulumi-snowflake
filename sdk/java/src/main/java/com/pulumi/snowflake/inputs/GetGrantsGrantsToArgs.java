// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.snowflake.inputs.GetGrantsGrantsToShareArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGrantsGrantsToArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetGrantsGrantsToArgs Empty = new GetGrantsGrantsToArgs();

    /**
     * Lists all privileges and roles granted to the role.
     * 
     */
    @Import(name="accountRole")
    private @Nullable Output<String> accountRole;

    /**
     * @return Lists all privileges and roles granted to the role.
     * 
     */
    public Optional<Output<String>> accountRole() {
        return Optional.ofNullable(this.accountRole);
    }

    /**
     * Lists all the privileges and roles granted to the application.
     * 
     */
    @Import(name="application")
    private @Nullable Output<String> application;

    /**
     * @return Lists all the privileges and roles granted to the application.
     * 
     */
    public Optional<Output<String>> application() {
        return Optional.ofNullable(this.application);
    }

    /**
     * Lists all the privileges and roles granted to the application role. Must be a fully qualified name (&#34;&amp;lt;app*name&amp;gt;&#34;.&#34;&amp;lt;app*role_name&amp;gt;&#34;).
     * 
     */
    @Import(name="applicationRole")
    private @Nullable Output<String> applicationRole;

    /**
     * @return Lists all the privileges and roles granted to the application role. Must be a fully qualified name (&#34;&amp;lt;app*name&amp;gt;&#34;.&#34;&amp;lt;app*role_name&amp;gt;&#34;).
     * 
     */
    public Optional<Output<String>> applicationRole() {
        return Optional.ofNullable(this.applicationRole);
    }

    /**
     * Lists all privileges and roles granted to the database role. Must be a fully qualified name (&#34;&amp;lt;db*name&amp;gt;&#34;.&#34;&amp;lt;database*role_name&amp;gt;&#34;).
     * 
     */
    @Import(name="databaseRole")
    private @Nullable Output<String> databaseRole;

    /**
     * @return Lists all privileges and roles granted to the database role. Must be a fully qualified name (&#34;&amp;lt;db*name&amp;gt;&#34;.&#34;&amp;lt;database*role_name&amp;gt;&#34;).
     * 
     */
    public Optional<Output<String>> databaseRole() {
        return Optional.ofNullable(this.databaseRole);
    }

    /**
     * Lists all the privileges granted to the share.
     * 
     */
    @Import(name="share")
    private @Nullable Output<GetGrantsGrantsToShareArgs> share;

    /**
     * @return Lists all the privileges granted to the share.
     * 
     */
    public Optional<Output<GetGrantsGrantsToShareArgs>> share() {
        return Optional.ofNullable(this.share);
    }

    /**
     * Lists all the roles granted to the user. Note that the PUBLIC role, which is automatically available to every user, is not listed.
     * 
     */
    @Import(name="user")
    private @Nullable Output<String> user;

    /**
     * @return Lists all the roles granted to the user. Note that the PUBLIC role, which is automatically available to every user, is not listed.
     * 
     */
    public Optional<Output<String>> user() {
        return Optional.ofNullable(this.user);
    }

    private GetGrantsGrantsToArgs() {}

    private GetGrantsGrantsToArgs(GetGrantsGrantsToArgs $) {
        this.accountRole = $.accountRole;
        this.application = $.application;
        this.applicationRole = $.applicationRole;
        this.databaseRole = $.databaseRole;
        this.share = $.share;
        this.user = $.user;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGrantsGrantsToArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGrantsGrantsToArgs $;

        public Builder() {
            $ = new GetGrantsGrantsToArgs();
        }

        public Builder(GetGrantsGrantsToArgs defaults) {
            $ = new GetGrantsGrantsToArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountRole Lists all privileges and roles granted to the role.
         * 
         * @return builder
         * 
         */
        public Builder accountRole(@Nullable Output<String> accountRole) {
            $.accountRole = accountRole;
            return this;
        }

        /**
         * @param accountRole Lists all privileges and roles granted to the role.
         * 
         * @return builder
         * 
         */
        public Builder accountRole(String accountRole) {
            return accountRole(Output.of(accountRole));
        }

        /**
         * @param application Lists all the privileges and roles granted to the application.
         * 
         * @return builder
         * 
         */
        public Builder application(@Nullable Output<String> application) {
            $.application = application;
            return this;
        }

        /**
         * @param application Lists all the privileges and roles granted to the application.
         * 
         * @return builder
         * 
         */
        public Builder application(String application) {
            return application(Output.of(application));
        }

        /**
         * @param applicationRole Lists all the privileges and roles granted to the application role. Must be a fully qualified name (&#34;&amp;lt;app*name&amp;gt;&#34;.&#34;&amp;lt;app*role_name&amp;gt;&#34;).
         * 
         * @return builder
         * 
         */
        public Builder applicationRole(@Nullable Output<String> applicationRole) {
            $.applicationRole = applicationRole;
            return this;
        }

        /**
         * @param applicationRole Lists all the privileges and roles granted to the application role. Must be a fully qualified name (&#34;&amp;lt;app*name&amp;gt;&#34;.&#34;&amp;lt;app*role_name&amp;gt;&#34;).
         * 
         * @return builder
         * 
         */
        public Builder applicationRole(String applicationRole) {
            return applicationRole(Output.of(applicationRole));
        }

        /**
         * @param databaseRole Lists all privileges and roles granted to the database role. Must be a fully qualified name (&#34;&amp;lt;db*name&amp;gt;&#34;.&#34;&amp;lt;database*role_name&amp;gt;&#34;).
         * 
         * @return builder
         * 
         */
        public Builder databaseRole(@Nullable Output<String> databaseRole) {
            $.databaseRole = databaseRole;
            return this;
        }

        /**
         * @param databaseRole Lists all privileges and roles granted to the database role. Must be a fully qualified name (&#34;&amp;lt;db*name&amp;gt;&#34;.&#34;&amp;lt;database*role_name&amp;gt;&#34;).
         * 
         * @return builder
         * 
         */
        public Builder databaseRole(String databaseRole) {
            return databaseRole(Output.of(databaseRole));
        }

        /**
         * @param share Lists all the privileges granted to the share.
         * 
         * @return builder
         * 
         */
        public Builder share(@Nullable Output<GetGrantsGrantsToShareArgs> share) {
            $.share = share;
            return this;
        }

        /**
         * @param share Lists all the privileges granted to the share.
         * 
         * @return builder
         * 
         */
        public Builder share(GetGrantsGrantsToShareArgs share) {
            return share(Output.of(share));
        }

        /**
         * @param user Lists all the roles granted to the user. Note that the PUBLIC role, which is automatically available to every user, is not listed.
         * 
         * @return builder
         * 
         */
        public Builder user(@Nullable Output<String> user) {
            $.user = user;
            return this;
        }

        /**
         * @param user Lists all the roles granted to the user. Note that the PUBLIC role, which is automatically available to every user, is not listed.
         * 
         * @return builder
         * 
         */
        public Builder user(String user) {
            return user(Output.of(user));
        }

        public GetGrantsGrantsToArgs build() {
            return $;
        }
    }

}
