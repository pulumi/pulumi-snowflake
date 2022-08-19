// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSchemasSchema {
    private final String comment;
    /**
     * @return The database from which to return the schemas from.
     * 
     */
    private final String database;
    private final String name;

    @CustomType.Constructor
    private GetSchemasSchema(
        @CustomType.Parameter("comment") String comment,
        @CustomType.Parameter("database") String database,
        @CustomType.Parameter("name") String name) {
        this.comment = comment;
        this.database = database;
        this.name = name;
    }

    public String comment() {
        return this.comment;
    }
    /**
     * @return The database from which to return the schemas from.
     * 
     */
    public String database() {
        return this.database;
    }
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSchemasSchema defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String comment;
        private String database;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSchemasSchema defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comment = defaults.comment;
    	      this.database = defaults.database;
    	      this.name = defaults.name;
        }

        public Builder comment(String comment) {
            this.comment = Objects.requireNonNull(comment);
            return this;
        }
        public Builder database(String database) {
            this.database = Objects.requireNonNull(database);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public GetSchemasSchema build() {
            return new GetSchemasSchema(comment, database, name);
        }
    }
}