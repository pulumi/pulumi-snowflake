// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.snowflake.StreamlitArgs;
import com.pulumi.snowflake.Utilities;
import com.pulumi.snowflake.inputs.StreamlitState;
import com.pulumi.snowflake.outputs.StreamlitDescribeOutput;
import com.pulumi.snowflake.outputs.StreamlitShowOutput;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * !&gt; **V1 release candidate** This resource was reworked and is a release candidate for the V1. We do not expect significant changes in it before the V1. We will welcome any feedback and adjust the resource if needed. Any errors reported will be resolved with a higher priority. We encourage checking this resource out before the V1 release. Please follow the migration guide to use it.
 * 
 * Resource used to manage streamlits objects. For more information, check [streamlit documentation](https://docs.snowflake.com/en/sql-reference/commands-streamlit).
 * 
 * ## Import
 * 
 * format is database name | schema name | streamlit name
 * 
 * ```sh
 * $ pulumi import snowflake:index/streamlit:Streamlit example &#39;dbName|schemaName|streamlitName&#39;
 * ```
 * 
 */
@ResourceType(type="snowflake:index/streamlit:Streamlit")
public class Streamlit extends com.pulumi.resources.CustomResource {
    /**
     * Specifies a comment for the streamlit.
     * 
     */
    @Export(name="comment", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> comment;

    /**
     * @return Specifies a comment for the streamlit.
     * 
     */
    public Output<Optional<String>> comment() {
        return Codegen.optional(this.comment);
    }
    /**
     * The database in which to create the streamlit
     * 
     */
    @Export(name="database", refs={String.class}, tree="[0]")
    private Output<String> database;

    /**
     * @return The database in which to create the streamlit
     * 
     */
    public Output<String> database() {
        return this.database;
    }
    /**
     * Outputs the result of `DESCRIBE STREAMLIT` for the given streamlit.
     * 
     */
    @Export(name="describeOutputs", refs={List.class,StreamlitDescribeOutput.class}, tree="[0,1]")
    private Output<List<StreamlitDescribeOutput>> describeOutputs;

    /**
     * @return Outputs the result of `DESCRIBE STREAMLIT` for the given streamlit.
     * 
     */
    public Output<List<StreamlitDescribeOutput>> describeOutputs() {
        return this.describeOutputs;
    }
    /**
     * Specifies the full path to the named stage containing the Streamlit Python files, media files, and the environment.yml file.
     * 
     */
    @Export(name="directoryLocation", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> directoryLocation;

    /**
     * @return Specifies the full path to the named stage containing the Streamlit Python files, media files, and the environment.yml file.
     * 
     */
    public Output<Optional<String>> directoryLocation() {
        return Codegen.optional(this.directoryLocation);
    }
    /**
     * External access integrations connected to the Streamlit.
     * 
     */
    @Export(name="externalAccessIntegrations", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> externalAccessIntegrations;

    /**
     * @return External access integrations connected to the Streamlit.
     * 
     */
    public Output<Optional<List<String>>> externalAccessIntegrations() {
        return Codegen.optional(this.externalAccessIntegrations);
    }
    /**
     * Specifies the filename of the Streamlit Python application. This filename is relative to the value of `root_location`
     * 
     */
    @Export(name="mainFile", refs={String.class}, tree="[0]")
    private Output<String> mainFile;

    /**
     * @return Specifies the filename of the Streamlit Python application. This filename is relative to the value of `root_location`
     * 
     */
    public Output<String> mainFile() {
        return this.mainFile;
    }
    /**
     * String that specifies the identifier (i.e. name) for the streamlit; must be unique in your account.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return String that specifies the identifier (i.e. name) for the streamlit; must be unique in your account.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Specifies the warehouse where SQL queries issued by the Streamlit application are run.
     * 
     */
    @Export(name="queryWarehouse", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> queryWarehouse;

    /**
     * @return Specifies the warehouse where SQL queries issued by the Streamlit application are run.
     * 
     */
    public Output<Optional<String>> queryWarehouse() {
        return Codegen.optional(this.queryWarehouse);
    }
    /**
     * The schema in which to create the streamlit.
     * 
     */
    @Export(name="schema", refs={String.class}, tree="[0]")
    private Output<String> schema;

    /**
     * @return The schema in which to create the streamlit.
     * 
     */
    public Output<String> schema() {
        return this.schema;
    }
    /**
     * Outputs the result of `SHOW STREAMLIT` for the given streamli.
     * 
     */
    @Export(name="showOutputs", refs={List.class,StreamlitShowOutput.class}, tree="[0,1]")
    private Output<List<StreamlitShowOutput>> showOutputs;

    /**
     * @return Outputs the result of `SHOW STREAMLIT` for the given streamli.
     * 
     */
    public Output<List<StreamlitShowOutput>> showOutputs() {
        return this.showOutputs;
    }
    /**
     * The stage in which streamlit files are located.
     * 
     */
    @Export(name="stage", refs={String.class}, tree="[0]")
    private Output<String> stage;

    /**
     * @return The stage in which streamlit files are located.
     * 
     */
    public Output<String> stage() {
        return this.stage;
    }
    /**
     * Specifies a title for the Streamlit app to display in Snowsight.
     * 
     */
    @Export(name="title", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> title;

    /**
     * @return Specifies a title for the Streamlit app to display in Snowsight.
     * 
     */
    public Output<Optional<String>> title() {
        return Codegen.optional(this.title);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Streamlit(String name) {
        this(name, StreamlitArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Streamlit(String name, StreamlitArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Streamlit(String name, StreamlitArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/streamlit:Streamlit", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()));
    }

    private Streamlit(String name, Output<String> id, @Nullable StreamlitState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/streamlit:Streamlit", name, state, makeResourceOptions(options, id));
    }

    private static StreamlitArgs makeArgs(StreamlitArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? StreamlitArgs.Empty : args;
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
    public static Streamlit get(String name, Output<String> id, @Nullable StreamlitState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Streamlit(name, id, state, options);
    }
}
