// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.snowflake.inputs.DatabaseReplicationConfigurationArgs;
import com.pulumi.snowflake.inputs.DatabaseTagArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatabaseState extends com.pulumi.resources.ResourceArgs {

    public static final DatabaseState Empty = new DatabaseState();

    @Import(name="comment")
    private @Nullable Output<String> comment;

    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    @Import(name="dataRetentionTimeInDays")
    private @Nullable Output<Integer> dataRetentionTimeInDays;

    public Optional<Output<Integer>> dataRetentionTimeInDays() {
        return Optional.ofNullable(this.dataRetentionTimeInDays);
    }

    /**
     * Specify a database to create a clone from.
     * 
     */
    @Import(name="fromDatabase")
    private @Nullable Output<String> fromDatabase;

    /**
     * @return Specify a database to create a clone from.
     * 
     */
    public Optional<Output<String>> fromDatabase() {
        return Optional.ofNullable(this.fromDatabase);
    }

    /**
     * Specify a fully-qualified path to a database to create a replica from. A fully qualified path follows the format of &#34;\n\n&#34;.&#34;\n\n&#34;.&#34;\n\n&#34;. An example would be: &#34;myorg1&#34;.&#34;account1&#34;.&#34;db1&#34;
     * 
     */
    @Import(name="fromReplica")
    private @Nullable Output<String> fromReplica;

    /**
     * @return Specify a fully-qualified path to a database to create a replica from. A fully qualified path follows the format of &#34;\n\n&#34;.&#34;\n\n&#34;.&#34;\n\n&#34;. An example would be: &#34;myorg1&#34;.&#34;account1&#34;.&#34;db1&#34;
     * 
     */
    public Optional<Output<String>> fromReplica() {
        return Optional.ofNullable(this.fromReplica);
    }

    /**
     * Specify a provider and a share in this map to create a database from a share.
     * 
     */
    @Import(name="fromShare")
    private @Nullable Output<Map<String,String>> fromShare;

    /**
     * @return Specify a provider and a share in this map to create a database from a share.
     * 
     */
    public Optional<Output<Map<String,String>>> fromShare() {
        return Optional.ofNullable(this.fromShare);
    }

    /**
     * Specifies a database as transient. Transient databases do not have a Fail-safe period so they do not incur additional storage costs once they leave Time Travel; however, this means they are also not protected by Fail-safe in the event of a data loss.
     * 
     */
    @Import(name="isTransient")
    private @Nullable Output<Boolean> isTransient;

    /**
     * @return Specifies a database as transient. Transient databases do not have a Fail-safe period so they do not incur additional storage costs once they leave Time Travel; however, this means they are also not protected by Fail-safe in the event of a data loss.
     * 
     */
    public Optional<Output<Boolean>> isTransient() {
        return Optional.ofNullable(this.isTransient);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * When set, specifies the configurations for database replication.
     * 
     */
    @Import(name="replicationConfiguration")
    private @Nullable Output<DatabaseReplicationConfigurationArgs> replicationConfiguration;

    /**
     * @return When set, specifies the configurations for database replication.
     * 
     */
    public Optional<Output<DatabaseReplicationConfigurationArgs>> replicationConfiguration() {
        return Optional.ofNullable(this.replicationConfiguration);
    }

    /**
     * Definitions of a tag to associate with the resource.
     * 
     * @deprecated
     * Use the &#39;snowflake_tag_association&#39; resource instead.
     * 
     */
    @Deprecated /* Use the 'snowflake_tag_association' resource instead. */
    @Import(name="tags")
    private @Nullable Output<List<DatabaseTagArgs>> tags;

    /**
     * @return Definitions of a tag to associate with the resource.
     * 
     * @deprecated
     * Use the &#39;snowflake_tag_association&#39; resource instead.
     * 
     */
    @Deprecated /* Use the 'snowflake_tag_association' resource instead. */
    public Optional<Output<List<DatabaseTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private DatabaseState() {}

    private DatabaseState(DatabaseState $) {
        this.comment = $.comment;
        this.dataRetentionTimeInDays = $.dataRetentionTimeInDays;
        this.fromDatabase = $.fromDatabase;
        this.fromReplica = $.fromReplica;
        this.fromShare = $.fromShare;
        this.isTransient = $.isTransient;
        this.name = $.name;
        this.replicationConfiguration = $.replicationConfiguration;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatabaseState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatabaseState $;

        public Builder() {
            $ = new DatabaseState();
        }

        public Builder(DatabaseState defaults) {
            $ = new DatabaseState(Objects.requireNonNull(defaults));
        }

        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        public Builder dataRetentionTimeInDays(@Nullable Output<Integer> dataRetentionTimeInDays) {
            $.dataRetentionTimeInDays = dataRetentionTimeInDays;
            return this;
        }

        public Builder dataRetentionTimeInDays(Integer dataRetentionTimeInDays) {
            return dataRetentionTimeInDays(Output.of(dataRetentionTimeInDays));
        }

        /**
         * @param fromDatabase Specify a database to create a clone from.
         * 
         * @return builder
         * 
         */
        public Builder fromDatabase(@Nullable Output<String> fromDatabase) {
            $.fromDatabase = fromDatabase;
            return this;
        }

        /**
         * @param fromDatabase Specify a database to create a clone from.
         * 
         * @return builder
         * 
         */
        public Builder fromDatabase(String fromDatabase) {
            return fromDatabase(Output.of(fromDatabase));
        }

        /**
         * @param fromReplica Specify a fully-qualified path to a database to create a replica from. A fully qualified path follows the format of &#34;\n\n&#34;.&#34;\n\n&#34;.&#34;\n\n&#34;. An example would be: &#34;myorg1&#34;.&#34;account1&#34;.&#34;db1&#34;
         * 
         * @return builder
         * 
         */
        public Builder fromReplica(@Nullable Output<String> fromReplica) {
            $.fromReplica = fromReplica;
            return this;
        }

        /**
         * @param fromReplica Specify a fully-qualified path to a database to create a replica from. A fully qualified path follows the format of &#34;\n\n&#34;.&#34;\n\n&#34;.&#34;\n\n&#34;. An example would be: &#34;myorg1&#34;.&#34;account1&#34;.&#34;db1&#34;
         * 
         * @return builder
         * 
         */
        public Builder fromReplica(String fromReplica) {
            return fromReplica(Output.of(fromReplica));
        }

        /**
         * @param fromShare Specify a provider and a share in this map to create a database from a share.
         * 
         * @return builder
         * 
         */
        public Builder fromShare(@Nullable Output<Map<String,String>> fromShare) {
            $.fromShare = fromShare;
            return this;
        }

        /**
         * @param fromShare Specify a provider and a share in this map to create a database from a share.
         * 
         * @return builder
         * 
         */
        public Builder fromShare(Map<String,String> fromShare) {
            return fromShare(Output.of(fromShare));
        }

        /**
         * @param isTransient Specifies a database as transient. Transient databases do not have a Fail-safe period so they do not incur additional storage costs once they leave Time Travel; however, this means they are also not protected by Fail-safe in the event of a data loss.
         * 
         * @return builder
         * 
         */
        public Builder isTransient(@Nullable Output<Boolean> isTransient) {
            $.isTransient = isTransient;
            return this;
        }

        /**
         * @param isTransient Specifies a database as transient. Transient databases do not have a Fail-safe period so they do not incur additional storage costs once they leave Time Travel; however, this means they are also not protected by Fail-safe in the event of a data loss.
         * 
         * @return builder
         * 
         */
        public Builder isTransient(Boolean isTransient) {
            return isTransient(Output.of(isTransient));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param replicationConfiguration When set, specifies the configurations for database replication.
         * 
         * @return builder
         * 
         */
        public Builder replicationConfiguration(@Nullable Output<DatabaseReplicationConfigurationArgs> replicationConfiguration) {
            $.replicationConfiguration = replicationConfiguration;
            return this;
        }

        /**
         * @param replicationConfiguration When set, specifies the configurations for database replication.
         * 
         * @return builder
         * 
         */
        public Builder replicationConfiguration(DatabaseReplicationConfigurationArgs replicationConfiguration) {
            return replicationConfiguration(Output.of(replicationConfiguration));
        }

        /**
         * @param tags Definitions of a tag to associate with the resource.
         * 
         * @return builder
         * 
         * @deprecated
         * Use the &#39;snowflake_tag_association&#39; resource instead.
         * 
         */
        @Deprecated /* Use the 'snowflake_tag_association' resource instead. */
        public Builder tags(@Nullable Output<List<DatabaseTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Definitions of a tag to associate with the resource.
         * 
         * @return builder
         * 
         * @deprecated
         * Use the &#39;snowflake_tag_association&#39; resource instead.
         * 
         */
        @Deprecated /* Use the 'snowflake_tag_association' resource instead. */
        public Builder tags(List<DatabaseTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags Definitions of a tag to associate with the resource.
         * 
         * @return builder
         * 
         * @deprecated
         * Use the &#39;snowflake_tag_association&#39; resource instead.
         * 
         */
        @Deprecated /* Use the 'snowflake_tag_association' resource instead. */
        public Builder tags(DatabaseTagArgs... tags) {
            return tags(List.of(tags));
        }

        public DatabaseState build() {
            return $;
        }
    }

}
