// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PipeArgs extends com.pulumi.resources.ResourceArgs {

    public static final PipeArgs Empty = new PipeArgs();

    /**
     * (Default: `false`) Specifies a auto_ingest param for the pipe.
     * 
     */
    @Import(name="autoIngest")
    private @Nullable Output<Boolean> autoIngest;

    /**
     * @return (Default: `false`) Specifies a auto_ingest param for the pipe.
     * 
     */
    public Optional<Output<Boolean>> autoIngest() {
        return Optional.ofNullable(this.autoIngest);
    }

    /**
     * Specifies the Amazon Resource Name (ARN) for the SNS topic for your S3 bucket.
     * 
     */
    @Import(name="awsSnsTopicArn")
    private @Nullable Output<String> awsSnsTopicArn;

    /**
     * @return Specifies the Amazon Resource Name (ARN) for the SNS topic for your S3 bucket.
     * 
     */
    public Optional<Output<String>> awsSnsTopicArn() {
        return Optional.ofNullable(this.awsSnsTopicArn);
    }

    /**
     * Specifies a comment for the pipe.
     * 
     */
    @Import(name="comment")
    private @Nullable Output<String> comment;

    /**
     * @return Specifies a comment for the pipe.
     * 
     */
    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    /**
     * Specifies the copy statement for the pipe.
     * 
     */
    @Import(name="copyStatement", required=true)
    private Output<String> copyStatement;

    /**
     * @return Specifies the copy statement for the pipe.
     * 
     */
    public Output<String> copyStatement() {
        return this.copyStatement;
    }

    /**
     * The database in which to create the pipe.
     * 
     */
    @Import(name="database", required=true)
    private Output<String> database;

    /**
     * @return The database in which to create the pipe.
     * 
     */
    public Output<String> database() {
        return this.database;
    }

    /**
     * Specifies the name of the notification integration used for error notifications.
     * 
     */
    @Import(name="errorIntegration")
    private @Nullable Output<String> errorIntegration;

    /**
     * @return Specifies the name of the notification integration used for error notifications.
     * 
     */
    public Optional<Output<String>> errorIntegration() {
        return Optional.ofNullable(this.errorIntegration);
    }

    /**
     * Specifies an integration for the pipe.
     * 
     */
    @Import(name="integration")
    private @Nullable Output<String> integration;

    /**
     * @return Specifies an integration for the pipe.
     * 
     */
    public Optional<Output<String>> integration() {
        return Optional.ofNullable(this.integration);
    }

    /**
     * Specifies the identifier for the pipe; must be unique for the database and schema in which the pipe is created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the identifier for the pipe; must be unique for the database and schema in which the pipe is created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The schema in which to create the pipe.
     * 
     */
    @Import(name="schema", required=true)
    private Output<String> schema;

    /**
     * @return The schema in which to create the pipe.
     * 
     */
    public Output<String> schema() {
        return this.schema;
    }

    private PipeArgs() {}

    private PipeArgs(PipeArgs $) {
        this.autoIngest = $.autoIngest;
        this.awsSnsTopicArn = $.awsSnsTopicArn;
        this.comment = $.comment;
        this.copyStatement = $.copyStatement;
        this.database = $.database;
        this.errorIntegration = $.errorIntegration;
        this.integration = $.integration;
        this.name = $.name;
        this.schema = $.schema;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PipeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PipeArgs $;

        public Builder() {
            $ = new PipeArgs();
        }

        public Builder(PipeArgs defaults) {
            $ = new PipeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoIngest (Default: `false`) Specifies a auto_ingest param for the pipe.
         * 
         * @return builder
         * 
         */
        public Builder autoIngest(@Nullable Output<Boolean> autoIngest) {
            $.autoIngest = autoIngest;
            return this;
        }

        /**
         * @param autoIngest (Default: `false`) Specifies a auto_ingest param for the pipe.
         * 
         * @return builder
         * 
         */
        public Builder autoIngest(Boolean autoIngest) {
            return autoIngest(Output.of(autoIngest));
        }

        /**
         * @param awsSnsTopicArn Specifies the Amazon Resource Name (ARN) for the SNS topic for your S3 bucket.
         * 
         * @return builder
         * 
         */
        public Builder awsSnsTopicArn(@Nullable Output<String> awsSnsTopicArn) {
            $.awsSnsTopicArn = awsSnsTopicArn;
            return this;
        }

        /**
         * @param awsSnsTopicArn Specifies the Amazon Resource Name (ARN) for the SNS topic for your S3 bucket.
         * 
         * @return builder
         * 
         */
        public Builder awsSnsTopicArn(String awsSnsTopicArn) {
            return awsSnsTopicArn(Output.of(awsSnsTopicArn));
        }

        /**
         * @param comment Specifies a comment for the pipe.
         * 
         * @return builder
         * 
         */
        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        /**
         * @param comment Specifies a comment for the pipe.
         * 
         * @return builder
         * 
         */
        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        /**
         * @param copyStatement Specifies the copy statement for the pipe.
         * 
         * @return builder
         * 
         */
        public Builder copyStatement(Output<String> copyStatement) {
            $.copyStatement = copyStatement;
            return this;
        }

        /**
         * @param copyStatement Specifies the copy statement for the pipe.
         * 
         * @return builder
         * 
         */
        public Builder copyStatement(String copyStatement) {
            return copyStatement(Output.of(copyStatement));
        }

        /**
         * @param database The database in which to create the pipe.
         * 
         * @return builder
         * 
         */
        public Builder database(Output<String> database) {
            $.database = database;
            return this;
        }

        /**
         * @param database The database in which to create the pipe.
         * 
         * @return builder
         * 
         */
        public Builder database(String database) {
            return database(Output.of(database));
        }

        /**
         * @param errorIntegration Specifies the name of the notification integration used for error notifications.
         * 
         * @return builder
         * 
         */
        public Builder errorIntegration(@Nullable Output<String> errorIntegration) {
            $.errorIntegration = errorIntegration;
            return this;
        }

        /**
         * @param errorIntegration Specifies the name of the notification integration used for error notifications.
         * 
         * @return builder
         * 
         */
        public Builder errorIntegration(String errorIntegration) {
            return errorIntegration(Output.of(errorIntegration));
        }

        /**
         * @param integration Specifies an integration for the pipe.
         * 
         * @return builder
         * 
         */
        public Builder integration(@Nullable Output<String> integration) {
            $.integration = integration;
            return this;
        }

        /**
         * @param integration Specifies an integration for the pipe.
         * 
         * @return builder
         * 
         */
        public Builder integration(String integration) {
            return integration(Output.of(integration));
        }

        /**
         * @param name Specifies the identifier for the pipe; must be unique for the database and schema in which the pipe is created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the identifier for the pipe; must be unique for the database and schema in which the pipe is created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param schema The schema in which to create the pipe.
         * 
         * @return builder
         * 
         */
        public Builder schema(Output<String> schema) {
            $.schema = schema;
            return this;
        }

        /**
         * @param schema The schema in which to create the pipe.
         * 
         * @return builder
         * 
         */
        public Builder schema(String schema) {
            return schema(Output.of(schema));
        }

        public PipeArgs build() {
            if ($.copyStatement == null) {
                throw new MissingRequiredPropertyException("PipeArgs", "copyStatement");
            }
            if ($.database == null) {
                throw new MissingRequiredPropertyException("PipeArgs", "database");
            }
            if ($.schema == null) {
                throw new MissingRequiredPropertyException("PipeArgs", "schema");
            }
            return $;
        }
    }

}
