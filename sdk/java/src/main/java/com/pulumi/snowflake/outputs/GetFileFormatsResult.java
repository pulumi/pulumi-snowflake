// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.snowflake.outputs.GetFileFormatsFileFormat;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetFileFormatsResult {
    /**
     * @return The database from which to return the schemas from.
     * 
     */
    private final String database;
    /**
     * @return The file formats in the schema
     * 
     */
    private final List<GetFileFormatsFileFormat> fileFormats;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return The schema from which to return the file formats from.
     * 
     */
    private final String schema;

    @CustomType.Constructor
    private GetFileFormatsResult(
        @CustomType.Parameter("database") String database,
        @CustomType.Parameter("fileFormats") List<GetFileFormatsFileFormat> fileFormats,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("schema") String schema) {
        this.database = database;
        this.fileFormats = fileFormats;
        this.id = id;
        this.schema = schema;
    }

    /**
     * @return The database from which to return the schemas from.
     * 
     */
    public String database() {
        return this.database;
    }
    /**
     * @return The file formats in the schema
     * 
     */
    public List<GetFileFormatsFileFormat> fileFormats() {
        return this.fileFormats;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The schema from which to return the file formats from.
     * 
     */
    public String schema() {
        return this.schema;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFileFormatsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String database;
        private List<GetFileFormatsFileFormat> fileFormats;
        private String id;
        private String schema;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFileFormatsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.database = defaults.database;
    	      this.fileFormats = defaults.fileFormats;
    	      this.id = defaults.id;
    	      this.schema = defaults.schema;
        }

        public Builder database(String database) {
            this.database = Objects.requireNonNull(database);
            return this;
        }
        public Builder fileFormats(List<GetFileFormatsFileFormat> fileFormats) {
            this.fileFormats = Objects.requireNonNull(fileFormats);
            return this;
        }
        public Builder fileFormats(GetFileFormatsFileFormat... fileFormats) {
            return fileFormats(List.of(fileFormats));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder schema(String schema) {
            this.schema = Objects.requireNonNull(schema);
            return this;
        }        public GetFileFormatsResult build() {
            return new GetFileFormatsResult(database, fileFormats, id, schema);
        }
    }
}
