// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.snowflake.FileFormatArgs;
import com.pulumi.snowflake.Utilities;
import com.pulumi.snowflake.inputs.FileFormatState;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
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
 * import com.pulumi.snowflake.FileFormat;
 * import com.pulumi.snowflake.FileFormatArgs;
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
 *         var exampleFileFormat = new FileFormat(&#34;exampleFileFormat&#34;, FileFormatArgs.builder()        
 *             .database(&#34;EXAMPLE_DB&#34;)
 *             .formatType(&#34;CSV&#34;)
 *             .schema(&#34;EXAMPLE_SCHEMA&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * # format is database name | schema name | file format name
 * 
 * ```sh
 *  $ pulumi import snowflake:index/fileFormat:FileFormat example &#39;dbName|schemaName|fileFormatName&#39;
 * ```
 * 
 */
@ResourceType(type="snowflake:index/fileFormat:FileFormat")
public class FileFormat extends com.pulumi.resources.CustomResource {
    /**
     * Boolean that specifies to allow duplicate object field names (only the last one will be preserved).
     * 
     */
    @Export(name="allowDuplicate", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> allowDuplicate;

    /**
     * @return Boolean that specifies to allow duplicate object field names (only the last one will be preserved).
     * 
     */
    public Output<Optional<Boolean>> allowDuplicate() {
        return Codegen.optional(this.allowDuplicate);
    }
    /**
     * Boolean that specifies whether to interpret columns with no defined logical data type as UTF-8 text.
     * 
     */
    @Export(name="binaryAsText", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> binaryAsText;

    /**
     * @return Boolean that specifies whether to interpret columns with no defined logical data type as UTF-8 text.
     * 
     */
    public Output<Optional<Boolean>> binaryAsText() {
        return Codegen.optional(this.binaryAsText);
    }
    /**
     * Defines the encoding format for binary input or output.
     * 
     */
    @Export(name="binaryFormat", type=String.class, parameters={})
    private Output</* @Nullable */ String> binaryFormat;

    /**
     * @return Defines the encoding format for binary input or output.
     * 
     */
    public Output<Optional<String>> binaryFormat() {
        return Codegen.optional(this.binaryFormat);
    }
    /**
     * Specifies a comment for the file format.
     * 
     */
    @Export(name="comment", type=String.class, parameters={})
    private Output</* @Nullable */ String> comment;

    /**
     * @return Specifies a comment for the file format.
     * 
     */
    public Output<Optional<String>> comment() {
        return Codegen.optional(this.comment);
    }
    /**
     * Specifies the current compression algorithm for the data file.
     * 
     */
    @Export(name="compression", type=String.class, parameters={})
    private Output</* @Nullable */ String> compression;

    /**
     * @return Specifies the current compression algorithm for the data file.
     * 
     */
    public Output<Optional<String>> compression() {
        return Codegen.optional(this.compression);
    }
    /**
     * The database in which to create the file format.
     * 
     */
    @Export(name="database", type=String.class, parameters={})
    private Output<String> database;

    /**
     * @return The database in which to create the file format.
     * 
     */
    public Output<String> database() {
        return this.database;
    }
    /**
     * Defines the format of date values in the data files (data loading) or table (data unloading).
     * 
     */
    @Export(name="dateFormat", type=String.class, parameters={})
    private Output</* @Nullable */ String> dateFormat;

    /**
     * @return Defines the format of date values in the data files (data loading) or table (data unloading).
     * 
     */
    public Output<Optional<String>> dateFormat() {
        return Codegen.optional(this.dateFormat);
    }
    /**
     * Boolean that specifies whether the XML parser disables automatic conversion of numeric and Boolean values from text to native representation.
     * 
     */
    @Export(name="disableAutoConvert", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> disableAutoConvert;

    /**
     * @return Boolean that specifies whether the XML parser disables automatic conversion of numeric and Boolean values from text to native representation.
     * 
     */
    public Output<Optional<Boolean>> disableAutoConvert() {
        return Codegen.optional(this.disableAutoConvert);
    }
    /**
     * Boolean that specifies whether the XML parser disables recognition of Snowflake semi-structured data tags.
     * 
     */
    @Export(name="disableSnowflakeData", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> disableSnowflakeData;

    /**
     * @return Boolean that specifies whether the XML parser disables recognition of Snowflake semi-structured data tags.
     * 
     */
    public Output<Optional<Boolean>> disableSnowflakeData() {
        return Codegen.optional(this.disableSnowflakeData);
    }
    /**
     * Specifies whether to insert SQL NULL for empty fields in an input file, which are represented by two successive delimiters.
     * 
     */
    @Export(name="emptyFieldAsNull", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> emptyFieldAsNull;

    /**
     * @return Specifies whether to insert SQL NULL for empty fields in an input file, which are represented by two successive delimiters.
     * 
     */
    public Output<Optional<Boolean>> emptyFieldAsNull() {
        return Codegen.optional(this.emptyFieldAsNull);
    }
    /**
     * Boolean that enables parsing of octal numbers.
     * 
     */
    @Export(name="enableOctal", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableOctal;

    /**
     * @return Boolean that enables parsing of octal numbers.
     * 
     */
    public Output<Optional<Boolean>> enableOctal() {
        return Codegen.optional(this.enableOctal);
    }
    /**
     * String (constant) that specifies the character set of the source data when loading data into a table.
     * 
     */
    @Export(name="encoding", type=String.class, parameters={})
    private Output</* @Nullable */ String> encoding;

    /**
     * @return String (constant) that specifies the character set of the source data when loading data into a table.
     * 
     */
    public Output<Optional<String>> encoding() {
        return Codegen.optional(this.encoding);
    }
    /**
     * Boolean that specifies whether to generate a parsing error if the number of delimited columns (i.e. fields) in an input file does not match the number of columns in the corresponding table.
     * 
     */
    @Export(name="errorOnColumnCountMismatch", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> errorOnColumnCountMismatch;

    /**
     * @return Boolean that specifies whether to generate a parsing error if the number of delimited columns (i.e. fields) in an input file does not match the number of columns in the corresponding table.
     * 
     */
    public Output<Optional<Boolean>> errorOnColumnCountMismatch() {
        return Codegen.optional(this.errorOnColumnCountMismatch);
    }
    /**
     * Single character string used as the escape character for field values.
     * 
     */
    @Export(name="escape", type=String.class, parameters={})
    private Output</* @Nullable */ String> escape;

    /**
     * @return Single character string used as the escape character for field values.
     * 
     */
    public Output<Optional<String>> escape() {
        return Codegen.optional(this.escape);
    }
    /**
     * Single character string used as the escape character for unenclosed field values only.
     * 
     */
    @Export(name="escapeUnenclosedField", type=String.class, parameters={})
    private Output</* @Nullable */ String> escapeUnenclosedField;

    /**
     * @return Single character string used as the escape character for unenclosed field values only.
     * 
     */
    public Output<Optional<String>> escapeUnenclosedField() {
        return Codegen.optional(this.escapeUnenclosedField);
    }
    /**
     * Specifies one or more singlebyte or multibyte characters that separate fields in an input file (data loading) or unloaded file (data unloading).
     * 
     */
    @Export(name="fieldDelimiter", type=String.class, parameters={})
    private Output</* @Nullable */ String> fieldDelimiter;

    /**
     * @return Specifies one or more singlebyte or multibyte characters that separate fields in an input file (data loading) or unloaded file (data unloading).
     * 
     */
    public Output<Optional<String>> fieldDelimiter() {
        return Codegen.optional(this.fieldDelimiter);
    }
    /**
     * Character used to enclose strings.
     * 
     */
    @Export(name="fieldOptionallyEnclosedBy", type=String.class, parameters={})
    private Output</* @Nullable */ String> fieldOptionallyEnclosedBy;

    /**
     * @return Character used to enclose strings.
     * 
     */
    public Output<Optional<String>> fieldOptionallyEnclosedBy() {
        return Codegen.optional(this.fieldOptionallyEnclosedBy);
    }
    /**
     * Specifies the extension for files unloaded to a stage.
     * 
     */
    @Export(name="fileExtension", type=String.class, parameters={})
    private Output</* @Nullable */ String> fileExtension;

    /**
     * @return Specifies the extension for files unloaded to a stage.
     * 
     */
    public Output<Optional<String>> fileExtension() {
        return Codegen.optional(this.fileExtension);
    }
    /**
     * Specifies the format of the input files (for data loading) or output files (for data unloading).
     * 
     */
    @Export(name="formatType", type=String.class, parameters={})
    private Output<String> formatType;

    /**
     * @return Specifies the format of the input files (for data loading) or output files (for data unloading).
     * 
     */
    public Output<String> formatType() {
        return this.formatType;
    }
    /**
     * Boolean that specifies whether UTF-8 encoding errors produce error conditions.
     * 
     */
    @Export(name="ignoreUtf8Errors", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> ignoreUtf8Errors;

    /**
     * @return Boolean that specifies whether UTF-8 encoding errors produce error conditions.
     * 
     */
    public Output<Optional<Boolean>> ignoreUtf8Errors() {
        return Codegen.optional(this.ignoreUtf8Errors);
    }
    /**
     * Specifies the identifier for the file format; must be unique for the database and schema in which the file format is created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies the identifier for the file format; must be unique for the database and schema in which the file format is created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * String used to convert to and from SQL NULL.
     * 
     */
    @Export(name="nullIfs", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> nullIfs;

    /**
     * @return String used to convert to and from SQL NULL.
     * 
     */
    public Output<Optional<List<String>>> nullIfs() {
        return Codegen.optional(this.nullIfs);
    }
    /**
     * Boolean that specifies whether the XML parser preserves leading and trailing spaces in element content.
     * 
     */
    @Export(name="preserveSpace", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> preserveSpace;

    /**
     * @return Boolean that specifies whether the XML parser preserves leading and trailing spaces in element content.
     * 
     */
    public Output<Optional<Boolean>> preserveSpace() {
        return Codegen.optional(this.preserveSpace);
    }
    /**
     * Specifies one or more singlebyte or multibyte characters that separate records in an input file (data loading) or unloaded file (data unloading).
     * 
     */
    @Export(name="recordDelimiter", type=String.class, parameters={})
    private Output</* @Nullable */ String> recordDelimiter;

    /**
     * @return Specifies one or more singlebyte or multibyte characters that separate records in an input file (data loading) or unloaded file (data unloading).
     * 
     */
    public Output<Optional<String>> recordDelimiter() {
        return Codegen.optional(this.recordDelimiter);
    }
    /**
     * Boolean that specifies whether to replace invalid UTF-8 characters with the Unicode replacement character (�).
     * 
     */
    @Export(name="replaceInvalidCharacters", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> replaceInvalidCharacters;

    /**
     * @return Boolean that specifies whether to replace invalid UTF-8 characters with the Unicode replacement character (�).
     * 
     */
    public Output<Optional<Boolean>> replaceInvalidCharacters() {
        return Codegen.optional(this.replaceInvalidCharacters);
    }
    /**
     * The schema in which to create the file format.
     * 
     */
    @Export(name="schema", type=String.class, parameters={})
    private Output<String> schema;

    /**
     * @return The schema in which to create the file format.
     * 
     */
    public Output<String> schema() {
        return this.schema;
    }
    /**
     * Boolean that specifies to skip any blank lines encountered in the data files.
     * 
     */
    @Export(name="skipBlankLines", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> skipBlankLines;

    /**
     * @return Boolean that specifies to skip any blank lines encountered in the data files.
     * 
     */
    public Output<Optional<Boolean>> skipBlankLines() {
        return Codegen.optional(this.skipBlankLines);
    }
    /**
     * Boolean that specifies whether to skip the BOM (byte order mark), if present in a data file.
     * 
     */
    @Export(name="skipByteOrderMark", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> skipByteOrderMark;

    /**
     * @return Boolean that specifies whether to skip the BOM (byte order mark), if present in a data file.
     * 
     */
    public Output<Optional<Boolean>> skipByteOrderMark() {
        return Codegen.optional(this.skipByteOrderMark);
    }
    /**
     * Number of lines at the start of the file to skip.
     * 
     */
    @Export(name="skipHeader", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> skipHeader;

    /**
     * @return Number of lines at the start of the file to skip.
     * 
     */
    public Output<Optional<Integer>> skipHeader() {
        return Codegen.optional(this.skipHeader);
    }
    /**
     * Boolean that instructs the JSON parser to remove object fields or array elements containing null values.
     * 
     */
    @Export(name="stripNullValues", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> stripNullValues;

    /**
     * @return Boolean that instructs the JSON parser to remove object fields or array elements containing null values.
     * 
     */
    public Output<Optional<Boolean>> stripNullValues() {
        return Codegen.optional(this.stripNullValues);
    }
    /**
     * Boolean that instructs the JSON parser to remove outer brackets.
     * 
     */
    @Export(name="stripOuterArray", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> stripOuterArray;

    /**
     * @return Boolean that instructs the JSON parser to remove outer brackets.
     * 
     */
    public Output<Optional<Boolean>> stripOuterArray() {
        return Codegen.optional(this.stripOuterArray);
    }
    /**
     * Boolean that specifies whether the XML parser strips out the outer XML element, exposing 2nd level elements as separate documents.
     * 
     */
    @Export(name="stripOuterElement", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> stripOuterElement;

    /**
     * @return Boolean that specifies whether the XML parser strips out the outer XML element, exposing 2nd level elements as separate documents.
     * 
     */
    public Output<Optional<Boolean>> stripOuterElement() {
        return Codegen.optional(this.stripOuterElement);
    }
    /**
     * Defines the format of time values in the data files (data loading) or table (data unloading).
     * 
     */
    @Export(name="timeFormat", type=String.class, parameters={})
    private Output</* @Nullable */ String> timeFormat;

    /**
     * @return Defines the format of time values in the data files (data loading) or table (data unloading).
     * 
     */
    public Output<Optional<String>> timeFormat() {
        return Codegen.optional(this.timeFormat);
    }
    /**
     * Defines the format of timestamp values in the data files (data loading) or table (data unloading).
     * 
     */
    @Export(name="timestampFormat", type=String.class, parameters={})
    private Output</* @Nullable */ String> timestampFormat;

    /**
     * @return Defines the format of timestamp values in the data files (data loading) or table (data unloading).
     * 
     */
    public Output<Optional<String>> timestampFormat() {
        return Codegen.optional(this.timestampFormat);
    }
    /**
     * Boolean that specifies whether to remove white space from fields.
     * 
     */
    @Export(name="trimSpace", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> trimSpace;

    /**
     * @return Boolean that specifies whether to remove white space from fields.
     * 
     */
    public Output<Optional<Boolean>> trimSpace() {
        return Codegen.optional(this.trimSpace);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FileFormat(String name) {
        this(name, FileFormatArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FileFormat(String name, FileFormatArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FileFormat(String name, FileFormatArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/fileFormat:FileFormat", name, args == null ? FileFormatArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private FileFormat(String name, Output<String> id, @Nullable FileFormatState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/fileFormat:FileFormat", name, state, makeResourceOptions(options, id));
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
    public static FileFormat get(String name, Output<String> id, @Nullable FileFormatState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new FileFormat(name, id, state, options);
    }
}
