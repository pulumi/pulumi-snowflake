// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.snowflake.outputs.GetSequencesSequence;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetSequencesResult {
    /**
     * @return The database from which to return the schemas from.
     * 
     */
    private String database;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The schema from which to return the sequences from.
     * 
     */
    private String schema;
    /**
     * @return The sequences in the schema
     * 
     */
    private List<GetSequencesSequence> sequences;

    private GetSequencesResult() {}
    /**
     * @return The database from which to return the schemas from.
     * 
     */
    public String database() {
        return this.database;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The schema from which to return the sequences from.
     * 
     */
    public String schema() {
        return this.schema;
    }
    /**
     * @return The sequences in the schema
     * 
     */
    public List<GetSequencesSequence> sequences() {
        return this.sequences;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSequencesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String database;
        private String id;
        private String schema;
        private List<GetSequencesSequence> sequences;
        public Builder() {}
        public Builder(GetSequencesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.database = defaults.database;
    	      this.id = defaults.id;
    	      this.schema = defaults.schema;
    	      this.sequences = defaults.sequences;
        }

        @CustomType.Setter
        public Builder database(String database) {
            if (database == null) {
              throw new MissingRequiredPropertyException("GetSequencesResult", "database");
            }
            this.database = database;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetSequencesResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder schema(String schema) {
            if (schema == null) {
              throw new MissingRequiredPropertyException("GetSequencesResult", "schema");
            }
            this.schema = schema;
            return this;
        }
        @CustomType.Setter
        public Builder sequences(List<GetSequencesSequence> sequences) {
            if (sequences == null) {
              throw new MissingRequiredPropertyException("GetSequencesResult", "sequences");
            }
            this.sequences = sequences;
            return this;
        }
        public Builder sequences(GetSequencesSequence... sequences) {
            return sequences(List.of(sequences));
        }
        public GetSequencesResult build() {
            final var _resultValue = new GetSequencesResult();
            _resultValue.database = database;
            _resultValue.id = id;
            _resultValue.schema = schema;
            _resultValue.sequences = sequences;
            return _resultValue;
        }
    }
}
