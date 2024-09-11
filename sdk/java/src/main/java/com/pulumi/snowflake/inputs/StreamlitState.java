// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.snowflake.inputs.StreamlitDescribeOutputArgs;
import com.pulumi.snowflake.inputs.StreamlitShowOutputArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StreamlitState extends com.pulumi.resources.ResourceArgs {

    public static final StreamlitState Empty = new StreamlitState();

    /**
     * Specifies a comment for the streamlit.
     * 
     */
    @Import(name="comment")
    private @Nullable Output<String> comment;

    /**
     * @return Specifies a comment for the streamlit.
     * 
     */
    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    /**
     * The database in which to create the streamlit
     * 
     */
    @Import(name="database")
    private @Nullable Output<String> database;

    /**
     * @return The database in which to create the streamlit
     * 
     */
    public Optional<Output<String>> database() {
        return Optional.ofNullable(this.database);
    }

    /**
     * Outputs the result of `DESCRIBE STREAMLIT` for the given streamlit.
     * 
     */
    @Import(name="describeOutputs")
    private @Nullable Output<List<StreamlitDescribeOutputArgs>> describeOutputs;

    /**
     * @return Outputs the result of `DESCRIBE STREAMLIT` for the given streamlit.
     * 
     */
    public Optional<Output<List<StreamlitDescribeOutputArgs>>> describeOutputs() {
        return Optional.ofNullable(this.describeOutputs);
    }

    /**
     * Specifies the full path to the named stage containing the Streamlit Python files, media files, and the environment.yml file.
     * 
     */
    @Import(name="directoryLocation")
    private @Nullable Output<String> directoryLocation;

    /**
     * @return Specifies the full path to the named stage containing the Streamlit Python files, media files, and the environment.yml file.
     * 
     */
    public Optional<Output<String>> directoryLocation() {
        return Optional.ofNullable(this.directoryLocation);
    }

    /**
     * External access integrations connected to the Streamlit.
     * 
     */
    @Import(name="externalAccessIntegrations")
    private @Nullable Output<List<String>> externalAccessIntegrations;

    /**
     * @return External access integrations connected to the Streamlit.
     * 
     */
    public Optional<Output<List<String>>> externalAccessIntegrations() {
        return Optional.ofNullable(this.externalAccessIntegrations);
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
     * Specifies the filename of the Streamlit Python application. This filename is relative to the value of `root_location`
     * 
     */
    @Import(name="mainFile")
    private @Nullable Output<String> mainFile;

    /**
     * @return Specifies the filename of the Streamlit Python application. This filename is relative to the value of `root_location`
     * 
     */
    public Optional<Output<String>> mainFile() {
        return Optional.ofNullable(this.mainFile);
    }

    /**
     * String that specifies the identifier (i.e. name) for the streamlit; must be unique in your account.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return String that specifies the identifier (i.e. name) for the streamlit; must be unique in your account.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specifies the warehouse where SQL queries issued by the Streamlit application are run.
     * 
     */
    @Import(name="queryWarehouse")
    private @Nullable Output<String> queryWarehouse;

    /**
     * @return Specifies the warehouse where SQL queries issued by the Streamlit application are run.
     * 
     */
    public Optional<Output<String>> queryWarehouse() {
        return Optional.ofNullable(this.queryWarehouse);
    }

    /**
     * The schema in which to create the streamlit.
     * 
     */
    @Import(name="schema")
    private @Nullable Output<String> schema;

    /**
     * @return The schema in which to create the streamlit.
     * 
     */
    public Optional<Output<String>> schema() {
        return Optional.ofNullable(this.schema);
    }

    /**
     * Outputs the result of `SHOW STREAMLIT` for the given streamlit.
     * 
     */
    @Import(name="showOutputs")
    private @Nullable Output<List<StreamlitShowOutputArgs>> showOutputs;

    /**
     * @return Outputs the result of `SHOW STREAMLIT` for the given streamlit.
     * 
     */
    public Optional<Output<List<StreamlitShowOutputArgs>>> showOutputs() {
        return Optional.ofNullable(this.showOutputs);
    }

    /**
     * The stage in which streamlit files are located.
     * 
     */
    @Import(name="stage")
    private @Nullable Output<String> stage;

    /**
     * @return The stage in which streamlit files are located.
     * 
     */
    public Optional<Output<String>> stage() {
        return Optional.ofNullable(this.stage);
    }

    /**
     * Specifies a title for the Streamlit app to display in Snowsight.
     * 
     */
    @Import(name="title")
    private @Nullable Output<String> title;

    /**
     * @return Specifies a title for the Streamlit app to display in Snowsight.
     * 
     */
    public Optional<Output<String>> title() {
        return Optional.ofNullable(this.title);
    }

    private StreamlitState() {}

    private StreamlitState(StreamlitState $) {
        this.comment = $.comment;
        this.database = $.database;
        this.describeOutputs = $.describeOutputs;
        this.directoryLocation = $.directoryLocation;
        this.externalAccessIntegrations = $.externalAccessIntegrations;
        this.fullyQualifiedName = $.fullyQualifiedName;
        this.mainFile = $.mainFile;
        this.name = $.name;
        this.queryWarehouse = $.queryWarehouse;
        this.schema = $.schema;
        this.showOutputs = $.showOutputs;
        this.stage = $.stage;
        this.title = $.title;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StreamlitState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StreamlitState $;

        public Builder() {
            $ = new StreamlitState();
        }

        public Builder(StreamlitState defaults) {
            $ = new StreamlitState(Objects.requireNonNull(defaults));
        }

        /**
         * @param comment Specifies a comment for the streamlit.
         * 
         * @return builder
         * 
         */
        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        /**
         * @param comment Specifies a comment for the streamlit.
         * 
         * @return builder
         * 
         */
        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        /**
         * @param database The database in which to create the streamlit
         * 
         * @return builder
         * 
         */
        public Builder database(@Nullable Output<String> database) {
            $.database = database;
            return this;
        }

        /**
         * @param database The database in which to create the streamlit
         * 
         * @return builder
         * 
         */
        public Builder database(String database) {
            return database(Output.of(database));
        }

        /**
         * @param describeOutputs Outputs the result of `DESCRIBE STREAMLIT` for the given streamlit.
         * 
         * @return builder
         * 
         */
        public Builder describeOutputs(@Nullable Output<List<StreamlitDescribeOutputArgs>> describeOutputs) {
            $.describeOutputs = describeOutputs;
            return this;
        }

        /**
         * @param describeOutputs Outputs the result of `DESCRIBE STREAMLIT` for the given streamlit.
         * 
         * @return builder
         * 
         */
        public Builder describeOutputs(List<StreamlitDescribeOutputArgs> describeOutputs) {
            return describeOutputs(Output.of(describeOutputs));
        }

        /**
         * @param describeOutputs Outputs the result of `DESCRIBE STREAMLIT` for the given streamlit.
         * 
         * @return builder
         * 
         */
        public Builder describeOutputs(StreamlitDescribeOutputArgs... describeOutputs) {
            return describeOutputs(List.of(describeOutputs));
        }

        /**
         * @param directoryLocation Specifies the full path to the named stage containing the Streamlit Python files, media files, and the environment.yml file.
         * 
         * @return builder
         * 
         */
        public Builder directoryLocation(@Nullable Output<String> directoryLocation) {
            $.directoryLocation = directoryLocation;
            return this;
        }

        /**
         * @param directoryLocation Specifies the full path to the named stage containing the Streamlit Python files, media files, and the environment.yml file.
         * 
         * @return builder
         * 
         */
        public Builder directoryLocation(String directoryLocation) {
            return directoryLocation(Output.of(directoryLocation));
        }

        /**
         * @param externalAccessIntegrations External access integrations connected to the Streamlit.
         * 
         * @return builder
         * 
         */
        public Builder externalAccessIntegrations(@Nullable Output<List<String>> externalAccessIntegrations) {
            $.externalAccessIntegrations = externalAccessIntegrations;
            return this;
        }

        /**
         * @param externalAccessIntegrations External access integrations connected to the Streamlit.
         * 
         * @return builder
         * 
         */
        public Builder externalAccessIntegrations(List<String> externalAccessIntegrations) {
            return externalAccessIntegrations(Output.of(externalAccessIntegrations));
        }

        /**
         * @param externalAccessIntegrations External access integrations connected to the Streamlit.
         * 
         * @return builder
         * 
         */
        public Builder externalAccessIntegrations(String... externalAccessIntegrations) {
            return externalAccessIntegrations(List.of(externalAccessIntegrations));
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
         * @param mainFile Specifies the filename of the Streamlit Python application. This filename is relative to the value of `root_location`
         * 
         * @return builder
         * 
         */
        public Builder mainFile(@Nullable Output<String> mainFile) {
            $.mainFile = mainFile;
            return this;
        }

        /**
         * @param mainFile Specifies the filename of the Streamlit Python application. This filename is relative to the value of `root_location`
         * 
         * @return builder
         * 
         */
        public Builder mainFile(String mainFile) {
            return mainFile(Output.of(mainFile));
        }

        /**
         * @param name String that specifies the identifier (i.e. name) for the streamlit; must be unique in your account.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name String that specifies the identifier (i.e. name) for the streamlit; must be unique in your account.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param queryWarehouse Specifies the warehouse where SQL queries issued by the Streamlit application are run.
         * 
         * @return builder
         * 
         */
        public Builder queryWarehouse(@Nullable Output<String> queryWarehouse) {
            $.queryWarehouse = queryWarehouse;
            return this;
        }

        /**
         * @param queryWarehouse Specifies the warehouse where SQL queries issued by the Streamlit application are run.
         * 
         * @return builder
         * 
         */
        public Builder queryWarehouse(String queryWarehouse) {
            return queryWarehouse(Output.of(queryWarehouse));
        }

        /**
         * @param schema The schema in which to create the streamlit.
         * 
         * @return builder
         * 
         */
        public Builder schema(@Nullable Output<String> schema) {
            $.schema = schema;
            return this;
        }

        /**
         * @param schema The schema in which to create the streamlit.
         * 
         * @return builder
         * 
         */
        public Builder schema(String schema) {
            return schema(Output.of(schema));
        }

        /**
         * @param showOutputs Outputs the result of `SHOW STREAMLIT` for the given streamlit.
         * 
         * @return builder
         * 
         */
        public Builder showOutputs(@Nullable Output<List<StreamlitShowOutputArgs>> showOutputs) {
            $.showOutputs = showOutputs;
            return this;
        }

        /**
         * @param showOutputs Outputs the result of `SHOW STREAMLIT` for the given streamlit.
         * 
         * @return builder
         * 
         */
        public Builder showOutputs(List<StreamlitShowOutputArgs> showOutputs) {
            return showOutputs(Output.of(showOutputs));
        }

        /**
         * @param showOutputs Outputs the result of `SHOW STREAMLIT` for the given streamlit.
         * 
         * @return builder
         * 
         */
        public Builder showOutputs(StreamlitShowOutputArgs... showOutputs) {
            return showOutputs(List.of(showOutputs));
        }

        /**
         * @param stage The stage in which streamlit files are located.
         * 
         * @return builder
         * 
         */
        public Builder stage(@Nullable Output<String> stage) {
            $.stage = stage;
            return this;
        }

        /**
         * @param stage The stage in which streamlit files are located.
         * 
         * @return builder
         * 
         */
        public Builder stage(String stage) {
            return stage(Output.of(stage));
        }

        /**
         * @param title Specifies a title for the Streamlit app to display in Snowsight.
         * 
         * @return builder
         * 
         */
        public Builder title(@Nullable Output<String> title) {
            $.title = title;
            return this;
        }

        /**
         * @param title Specifies a title for the Streamlit app to display in Snowsight.
         * 
         * @return builder
         * 
         */
        public Builder title(String title) {
            return title(Output.of(title));
        }

        public StreamlitState build() {
            return $;
        }
    }

}
