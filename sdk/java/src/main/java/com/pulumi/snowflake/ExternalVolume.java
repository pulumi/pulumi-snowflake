// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.snowflake.ExternalVolumeArgs;
import com.pulumi.snowflake.Utilities;
import com.pulumi.snowflake.inputs.ExternalVolumeState;
import com.pulumi.snowflake.outputs.ExternalVolumeDescribeOutput;
import com.pulumi.snowflake.outputs.ExternalVolumeShowOutput;
import com.pulumi.snowflake.outputs.ExternalVolumeStorageLocation;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * !&gt; **Caution: Preview Feature** This feature is considered a preview feature in the provider, regardless of the state of the resource in Snowflake. We do not guarantee its stability. It will be reworked and marked as a stable feature in future releases. Breaking changes are expected, even without bumping the major version. To use this feature, add the relevant feature name to `preview_features_enabled` field in the provider configuration. Please always refer to the Getting Help section in our Github repo to best determine how to get help for your questions.
 * 
 * Resource used to manage external volume objects. For more information, check [external volume documentation](https://docs.snowflake.com/en/sql-reference/commands-data-loading#external-volume).
 * 
 * &gt; **Note** If a field has a default value, it is shown next to the type in the schema.
 * 
 */
@ResourceType(type="snowflake:index/externalVolume:ExternalVolume")
public class ExternalVolume extends com.pulumi.resources.CustomResource {
    /**
     * (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`default`)) Specifies whether write operations are allowed for the external volume; must be set to TRUE for Iceberg tables that use Snowflake as the catalog. Available options are: &#34;true&#34; or &#34;false&#34;. When the value is not set in the configuration the provider will put &#34;default&#34; there which means to use the Snowflake default for this value.
     * 
     */
    @Export(name="allowWrites", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> allowWrites;

    /**
     * @return (Default: fallback to Snowflake default - uses special value that cannot be set in the configuration manually (`default`)) Specifies whether write operations are allowed for the external volume; must be set to TRUE for Iceberg tables that use Snowflake as the catalog. Available options are: &#34;true&#34; or &#34;false&#34;. When the value is not set in the configuration the provider will put &#34;default&#34; there which means to use the Snowflake default for this value.
     * 
     */
    public Output<Optional<String>> allowWrites() {
        return Codegen.optional(this.allowWrites);
    }
    /**
     * Specifies a comment for the external volume.
     * 
     */
    @Export(name="comment", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> comment;

    /**
     * @return Specifies a comment for the external volume.
     * 
     */
    public Output<Optional<String>> comment() {
        return Codegen.optional(this.comment);
    }
    /**
     * Outputs the result of `DESCRIBE EXTERNAL VOLUME` for the given external volume.
     * 
     */
    @Export(name="describeOutputs", refs={List.class,ExternalVolumeDescribeOutput.class}, tree="[0,1]")
    private Output<List<ExternalVolumeDescribeOutput>> describeOutputs;

    /**
     * @return Outputs the result of `DESCRIBE EXTERNAL VOLUME` for the given external volume.
     * 
     */
    public Output<List<ExternalVolumeDescribeOutput>> describeOutputs() {
        return this.describeOutputs;
    }
    /**
     * Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
     * 
     */
    @Export(name="fullyQualifiedName", refs={String.class}, tree="[0]")
    private Output<String> fullyQualifiedName;

    /**
     * @return Fully qualified name of the resource. For more information, see [object name resolution](https://docs.snowflake.com/en/sql-reference/name-resolution).
     * 
     */
    public Output<String> fullyQualifiedName() {
        return this.fullyQualifiedName;
    }
    /**
     * Identifier for the external volume; must be unique for your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Identifier for the external volume; must be unique for your account. Due to technical limitations (read more here), avoid using the following characters: `|`, `.`, `&#34;`.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Outputs the result of `SHOW EXTERNAL VOLUMES` for the given external volume.
     * 
     */
    @Export(name="showOutputs", refs={List.class,ExternalVolumeShowOutput.class}, tree="[0,1]")
    private Output<List<ExternalVolumeShowOutput>> showOutputs;

    /**
     * @return Outputs the result of `SHOW EXTERNAL VOLUMES` for the given external volume.
     * 
     */
    public Output<List<ExternalVolumeShowOutput>> showOutputs() {
        return this.showOutputs;
    }
    /**
     * List of named cloud storage locations in different regions and, optionally, cloud platforms. Minimum 1 required. The order of the list is important as it impacts the active storage location, and updates will be triggered if it changes. Note that not all parameter combinations are valid as they depend on the given storage*provider. Consult [the docs](https://docs.snowflake.com/en/sql-reference/sql/create-external-volume#cloud-provider-parameters-cloudproviderparams) for more details on this.
     * 
     */
    @Export(name="storageLocations", refs={List.class,ExternalVolumeStorageLocation.class}, tree="[0,1]")
    private Output<List<ExternalVolumeStorageLocation>> storageLocations;

    /**
     * @return List of named cloud storage locations in different regions and, optionally, cloud platforms. Minimum 1 required. The order of the list is important as it impacts the active storage location, and updates will be triggered if it changes. Note that not all parameter combinations are valid as they depend on the given storage*provider. Consult [the docs](https://docs.snowflake.com/en/sql-reference/sql/create-external-volume#cloud-provider-parameters-cloudproviderparams) for more details on this.
     * 
     */
    public Output<List<ExternalVolumeStorageLocation>> storageLocations() {
        return this.storageLocations;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ExternalVolume(java.lang.String name) {
        this(name, ExternalVolumeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ExternalVolume(java.lang.String name, ExternalVolumeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ExternalVolume(java.lang.String name, ExternalVolumeArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/externalVolume:ExternalVolume", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ExternalVolume(java.lang.String name, Output<java.lang.String> id, @Nullable ExternalVolumeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/externalVolume:ExternalVolume", name, state, makeResourceOptions(options, id), false);
    }

    private static ExternalVolumeArgs makeArgs(ExternalVolumeArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ExternalVolumeArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
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
    public static ExternalVolume get(java.lang.String name, Output<java.lang.String> id, @Nullable ExternalVolumeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ExternalVolume(name, id, state, options);
    }
}
