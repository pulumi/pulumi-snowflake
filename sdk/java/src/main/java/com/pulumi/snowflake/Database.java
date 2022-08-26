// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.snowflake.DatabaseArgs;
import com.pulumi.snowflake.Utilities;
import com.pulumi.snowflake.inputs.DatabaseState;
import com.pulumi.snowflake.outputs.DatabaseReplicationConfiguration;
import com.pulumi.snowflake.outputs.DatabaseTag;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.snowflake.Database;
 * import com.pulumi.snowflake.DatabaseArgs;
 * import com.pulumi.snowflake.inputs.DatabaseReplicationConfigurationArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var simple = new Database(&#34;simple&#34;, DatabaseArgs.builder()        
 *             .comment(&#34;test comment&#34;)
 *             .dataRetentionTimeInDays(3)
 *             .build());
 * 
 *         var withReplication = new Database(&#34;withReplication&#34;, DatabaseArgs.builder()        
 *             .comment(&#34;test comment 2&#34;)
 *             .replicationConfiguration(DatabaseReplicationConfigurationArgs.builder()
 *                 .accounts(                
 *                     &#34;test_account1&#34;,
 *                     &#34;test_account_2&#34;)
 *                 .ignoreEditionCheck(true)
 *                 .build())
 *             .build());
 * 
 *         var fromReplica = new Database(&#34;fromReplica&#34;, DatabaseArgs.builder()        
 *             .comment(&#34;test comment&#34;)
 *             .dataRetentionTimeInDays(3)
 *             .fromReplica(&#34;org1\&#34;.\&#34;account1\&#34;.\&#34;primary_db_name&#34;)
 *             .build());
 * 
 *         var fromShare = new Database(&#34;fromShare&#34;, DatabaseArgs.builder()        
 *             .comment(&#34;test comment&#34;)
 *             .fromShare(Map.ofEntries(
 *                 Map.entry(&#34;provider&#34;, &#34;org1\&#34;.\&#34;account1&#34;),
 *                 Map.entry(&#34;share&#34;, &#34;share1&#34;)
 *             ))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * ```sh
 *  $ pulumi import snowflake:index/database:Database example name
 * ```
 * 
 */
@ResourceType(type="snowflake:index/database:Database")
public class Database extends com.pulumi.resources.CustomResource {
    @Export(name="comment", type=String.class, parameters={})
    private Output</* @Nullable */ String> comment;

    public Output<Optional<String>> comment() {
        return Codegen.optional(this.comment);
    }
    @Export(name="dataRetentionTimeInDays", type=Integer.class, parameters={})
    private Output<Integer> dataRetentionTimeInDays;

    public Output<Integer> dataRetentionTimeInDays() {
        return this.dataRetentionTimeInDays;
    }
    /**
     * Specify a database to create a clone from.
     * 
     */
    @Export(name="fromDatabase", type=String.class, parameters={})
    private Output</* @Nullable */ String> fromDatabase;

    /**
     * @return Specify a database to create a clone from.
     * 
     */
    public Output<Optional<String>> fromDatabase() {
        return Codegen.optional(this.fromDatabase);
    }
    /**
     * Specify a fully-qualified path to a database to create a replica from. A fully qualified path follows the format of &#34;\n\n&#34;.&#34;\n\n&#34;.&#34;\n\n&#34;. An example would be: &#34;myorg1&#34;.&#34;account1&#34;.&#34;db1&#34;
     * 
     */
    @Export(name="fromReplica", type=String.class, parameters={})
    private Output</* @Nullable */ String> fromReplica;

    /**
     * @return Specify a fully-qualified path to a database to create a replica from. A fully qualified path follows the format of &#34;\n\n&#34;.&#34;\n\n&#34;.&#34;\n\n&#34;. An example would be: &#34;myorg1&#34;.&#34;account1&#34;.&#34;db1&#34;
     * 
     */
    public Output<Optional<String>> fromReplica() {
        return Codegen.optional(this.fromReplica);
    }
    /**
     * Specify a provider and a share in this map to create a database from a share.
     * 
     */
    @Export(name="fromShare", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> fromShare;

    /**
     * @return Specify a provider and a share in this map to create a database from a share.
     * 
     */
    public Output<Optional<Map<String,String>>> fromShare() {
        return Codegen.optional(this.fromShare);
    }
    /**
     * Specifies a database as transient. Transient databases do not have a Fail-safe period so they do not incur additional storage costs once they leave Time Travel; however, this means they are also not protected by Fail-safe in the event of a data loss.
     * 
     */
    @Export(name="isTransient", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> isTransient;

    /**
     * @return Specifies a database as transient. Transient databases do not have a Fail-safe period so they do not incur additional storage costs once they leave Time Travel; however, this means they are also not protected by Fail-safe in the event of a data loss.
     * 
     */
    public Output<Optional<Boolean>> isTransient() {
        return Codegen.optional(this.isTransient);
    }
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }
    /**
     * When set, specifies the configurations for database replication.
     * 
     */
    @Export(name="replicationConfiguration", type=DatabaseReplicationConfiguration.class, parameters={})
    private Output</* @Nullable */ DatabaseReplicationConfiguration> replicationConfiguration;

    /**
     * @return When set, specifies the configurations for database replication.
     * 
     */
    public Output<Optional<DatabaseReplicationConfiguration>> replicationConfiguration() {
        return Codegen.optional(this.replicationConfiguration);
    }
    /**
     * Definitions of a tag to associate with the resource.
     * 
     * @deprecated
     * Use the &#39;snowflake_tag_association&#39; resource instead.
     * 
     */
    @Deprecated /* Use the 'snowflake_tag_association' resource instead. */
    @Export(name="tags", type=List.class, parameters={DatabaseTag.class})
    private Output</* @Nullable */ List<DatabaseTag>> tags;

    /**
     * @return Definitions of a tag to associate with the resource.
     * 
     */
    public Output<Optional<List<DatabaseTag>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Database(String name) {
        this(name, DatabaseArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Database(String name, @Nullable DatabaseArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Database(String name, @Nullable DatabaseArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/database:Database", name, args == null ? DatabaseArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Database(String name, Output<String> id, @Nullable DatabaseState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/database:Database", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Database get(String name, Output<String> id, @Nullable DatabaseState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Database(name, id, state, options);
    }
}
