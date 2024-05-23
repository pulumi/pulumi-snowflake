// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.snowflake.FailoverGroupArgs;
import com.pulumi.snowflake.Utilities;
import com.pulumi.snowflake.inputs.FailoverGroupState;
import com.pulumi.snowflake.outputs.FailoverGroupFromReplica;
import com.pulumi.snowflake.outputs.FailoverGroupReplicationSchedule;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.snowflake.Database;
 * import com.pulumi.snowflake.DatabaseArgs;
 * import com.pulumi.snowflake.FailoverGroup;
 * import com.pulumi.snowflake.FailoverGroupArgs;
 * import com.pulumi.snowflake.inputs.FailoverGroupReplicationScheduleArgs;
 * import com.pulumi.snowflake.inputs.FailoverGroupReplicationScheduleCronArgs;
 * import com.pulumi.snowflake.inputs.FailoverGroupFromReplicaArgs;
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
 *         var db = new Database("db", DatabaseArgs.builder()
 *             .name("db1")
 *             .build());
 * 
 *         var sourceFailoverGroup = new FailoverGroup("sourceFailoverGroup", FailoverGroupArgs.builder()
 *             .name("FG1")
 *             .objectTypes(            
 *                 "WAREHOUSES",
 *                 "DATABASES",
 *                 "INTEGRATIONS",
 *                 "ROLES")
 *             .allowedAccounts(            
 *                 "<org_name>.<target_account_name1>",
 *                 "<org_name>.<target_account_name2>")
 *             .allowedDatabases(db.name())
 *             .allowedIntegrationTypes("SECURITY INTEGRATIONS")
 *             .replicationSchedule(FailoverGroupReplicationScheduleArgs.builder()
 *                 .cron(FailoverGroupReplicationScheduleCronArgs.builder()
 *                     .expression("0 0 10-20 * TUE,THU")
 *                     .timeZone("UTC")
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var targetFailoverGroup = new FailoverGroup("targetFailoverGroup", FailoverGroupArgs.builder()
 *             .name("FG1")
 *             .fromReplica(FailoverGroupFromReplicaArgs.builder()
 *                 .organizationName("...")
 *                 .sourceAccountName("...")
 *                 .name(fg.name())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import snowflake:index/failoverGroup:FailoverGroup example &#39;fg1&#39;
 * ```
 * 
 */
@ResourceType(type="snowflake:index/failoverGroup:FailoverGroup")
public class FailoverGroup extends com.pulumi.resources.CustomResource {
    /**
     * Specifies the target account or list of target accounts to which replication and failover of specified objects from the source account is enabled. Secondary failover groups in the target accounts in this list can be promoted to serve as the primary failover group in case of failover. Expected in the form \n\n.\n\n
     * 
     */
    @Export(name="allowedAccounts", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> allowedAccounts;

    /**
     * @return Specifies the target account or list of target accounts to which replication and failover of specified objects from the source account is enabled. Secondary failover groups in the target accounts in this list can be promoted to serve as the primary failover group in case of failover. Expected in the form \n\n.\n\n
     * 
     */
    public Output<Optional<List<String>>> allowedAccounts() {
        return Codegen.optional(this.allowedAccounts);
    }
    /**
     * Specifies the database or list of databases for which you are enabling replication and failover from the source account to the target account. The OBJECT_TYPES list must include DATABASES to set this parameter.
     * 
     */
    @Export(name="allowedDatabases", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> allowedDatabases;

    /**
     * @return Specifies the database or list of databases for which you are enabling replication and failover from the source account to the target account. The OBJECT_TYPES list must include DATABASES to set this parameter.
     * 
     */
    public Output<Optional<List<String>>> allowedDatabases() {
        return Codegen.optional(this.allowedDatabases);
    }
    /**
     * Type(s) of integrations for which you are enabling replication and failover from the source account to the target account. This property requires that the OBJECT_TYPES list include INTEGRATIONS to set this parameter. The following integration types are supported: &#34;SECURITY INTEGRATIONS&#34;, &#34;API INTEGRATIONS&#34;, &#34;STORAGE INTEGRATIONS&#34;, &#34;EXTERNAL ACCESS INTEGRATIONS&#34;, &#34;NOTIFICATION INTEGRATIONS&#34;
     * 
     */
    @Export(name="allowedIntegrationTypes", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> allowedIntegrationTypes;

    /**
     * @return Type(s) of integrations for which you are enabling replication and failover from the source account to the target account. This property requires that the OBJECT_TYPES list include INTEGRATIONS to set this parameter. The following integration types are supported: &#34;SECURITY INTEGRATIONS&#34;, &#34;API INTEGRATIONS&#34;, &#34;STORAGE INTEGRATIONS&#34;, &#34;EXTERNAL ACCESS INTEGRATIONS&#34;, &#34;NOTIFICATION INTEGRATIONS&#34;
     * 
     */
    public Output<Optional<List<String>>> allowedIntegrationTypes() {
        return Codegen.optional(this.allowedIntegrationTypes);
    }
    /**
     * Specifies the share or list of shares for which you are enabling replication and failover from the source account to the target account. The OBJECT_TYPES list must include SHARES to set this parameter.
     * 
     */
    @Export(name="allowedShares", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> allowedShares;

    /**
     * @return Specifies the share or list of shares for which you are enabling replication and failover from the source account to the target account. The OBJECT_TYPES list must include SHARES to set this parameter.
     * 
     */
    public Output<Optional<List<String>>> allowedShares() {
        return Codegen.optional(this.allowedShares);
    }
    /**
     * Specifies the name of the replica to use as the source for the failover group.
     * 
     */
    @Export(name="fromReplica", refs={FailoverGroupFromReplica.class}, tree="[0]")
    private Output</* @Nullable */ FailoverGroupFromReplica> fromReplica;

    /**
     * @return Specifies the name of the replica to use as the source for the failover group.
     * 
     */
    public Output<Optional<FailoverGroupFromReplica>> fromReplica() {
        return Codegen.optional(this.fromReplica);
    }
    /**
     * Allows replicating objects to accounts on lower editions.
     * 
     */
    @Export(name="ignoreEditionCheck", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> ignoreEditionCheck;

    /**
     * @return Allows replicating objects to accounts on lower editions.
     * 
     */
    public Output<Optional<Boolean>> ignoreEditionCheck() {
        return Codegen.optional(this.ignoreEditionCheck);
    }
    /**
     * Specifies the identifier for the failover group. The identifier must start with an alphabetic character and cannot contain spaces or special characters unless the identifier string is enclosed in double quotes (e.g. &#34;My object&#34;). Identifiers enclosed in double quotes are also case-sensitive.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Specifies the identifier for the failover group. The identifier must start with an alphabetic character and cannot contain spaces or special characters unless the identifier string is enclosed in double quotes (e.g. &#34;My object&#34;). Identifiers enclosed in double quotes are also case-sensitive.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Type(s) of objects for which you are enabling replication and failover from the source account to the target account. The following object types are supported: &#34;ACCOUNT PARAMETERS&#34;, &#34;DATABASES&#34;, &#34;INTEGRATIONS&#34;, &#34;NETWORK POLICIES&#34;, &#34;RESOURCE MONITORS&#34;, &#34;ROLES&#34;, &#34;SHARES&#34;, &#34;USERS&#34;, &#34;WAREHOUSES&#34;
     * 
     */
    @Export(name="objectTypes", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> objectTypes;

    /**
     * @return Type(s) of objects for which you are enabling replication and failover from the source account to the target account. The following object types are supported: &#34;ACCOUNT PARAMETERS&#34;, &#34;DATABASES&#34;, &#34;INTEGRATIONS&#34;, &#34;NETWORK POLICIES&#34;, &#34;RESOURCE MONITORS&#34;, &#34;ROLES&#34;, &#34;SHARES&#34;, &#34;USERS&#34;, &#34;WAREHOUSES&#34;
     * 
     */
    public Output<Optional<List<String>>> objectTypes() {
        return Codegen.optional(this.objectTypes);
    }
    /**
     * Specifies the schedule for refreshing secondary failover groups.
     * 
     */
    @Export(name="replicationSchedule", refs={FailoverGroupReplicationSchedule.class}, tree="[0]")
    private Output</* @Nullable */ FailoverGroupReplicationSchedule> replicationSchedule;

    /**
     * @return Specifies the schedule for refreshing secondary failover groups.
     * 
     */
    public Output<Optional<FailoverGroupReplicationSchedule>> replicationSchedule() {
        return Codegen.optional(this.replicationSchedule);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FailoverGroup(String name) {
        this(name, FailoverGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FailoverGroup(String name, @Nullable FailoverGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FailoverGroup(String name, @Nullable FailoverGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/failoverGroup:FailoverGroup", name, args == null ? FailoverGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private FailoverGroup(String name, Output<String> id, @Nullable FailoverGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/failoverGroup:FailoverGroup", name, state, makeResourceOptions(options, id));
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
    public static FailoverGroup get(String name, Output<String> id, @Nullable FailoverGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new FailoverGroup(name, id, state, options);
    }
}
