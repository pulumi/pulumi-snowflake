// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.snowflake.TagMaskingPolicyAssociationArgs;
import com.pulumi.snowflake.Utilities;
import com.pulumi.snowflake.inputs.TagMaskingPolicyAssociationState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * format is tag database name | tag schema name | tag name | masking policy database | masking policy schema | masking policy name
 * 
 * ```sh
 *  $ pulumi import snowflake:index/tagMaskingPolicyAssociation:TagMaskingPolicyAssociation example &#39;tag_db|tag_schema|tag_name|mp_db|mp_schema|mp_name&#39;
 * ```
 * 
 */
@ResourceType(type="snowflake:index/tagMaskingPolicyAssociation:TagMaskingPolicyAssociation")
public class TagMaskingPolicyAssociation extends com.pulumi.resources.CustomResource {
    /**
     * The resource id of the masking policy
     * 
     */
    @Export(name="maskingPolicyId", type=String.class, parameters={})
    private Output<String> maskingPolicyId;

    /**
     * @return The resource id of the masking policy
     * 
     */
    public Output<String> maskingPolicyId() {
        return this.maskingPolicyId;
    }
    /**
     * Specifies the identifier for the tag. Note: format must follow: &#34;databaseName&#34;.&#34;schemaName&#34;.&#34;tagName&#34; or &#34;databaseName.schemaName.tagName&#34; or &#34;databaseName|schemaName.tagName&#34; (snowflake_tag.tag.id)
     * 
     */
    @Export(name="tagId", type=String.class, parameters={})
    private Output<String> tagId;

    /**
     * @return Specifies the identifier for the tag. Note: format must follow: &#34;databaseName&#34;.&#34;schemaName&#34;.&#34;tagName&#34; or &#34;databaseName.schemaName.tagName&#34; or &#34;databaseName|schemaName.tagName&#34; (snowflake_tag.tag.id)
     * 
     */
    public Output<String> tagId() {
        return this.tagId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TagMaskingPolicyAssociation(String name) {
        this(name, TagMaskingPolicyAssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TagMaskingPolicyAssociation(String name, TagMaskingPolicyAssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TagMaskingPolicyAssociation(String name, TagMaskingPolicyAssociationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/tagMaskingPolicyAssociation:TagMaskingPolicyAssociation", name, args == null ? TagMaskingPolicyAssociationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TagMaskingPolicyAssociation(String name, Output<String> id, @Nullable TagMaskingPolicyAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/tagMaskingPolicyAssociation:TagMaskingPolicyAssociation", name, state, makeResourceOptions(options, id));
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
    public static TagMaskingPolicyAssociation get(String name, Output<String> id, @Nullable TagMaskingPolicyAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TagMaskingPolicyAssociation(name, id, state, options);
    }
}
