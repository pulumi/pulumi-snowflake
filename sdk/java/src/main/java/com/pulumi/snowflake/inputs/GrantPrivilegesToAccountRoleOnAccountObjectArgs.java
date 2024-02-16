// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GrantPrivilegesToAccountRoleOnAccountObjectArgs extends com.pulumi.resources.ResourceArgs {

    public static final GrantPrivilegesToAccountRoleOnAccountObjectArgs Empty = new GrantPrivilegesToAccountRoleOnAccountObjectArgs();

    /**
     * The fully qualified name of the object on which privileges will be granted.
     * 
     */
    @Import(name="objectName", required=true)
    private Output<String> objectName;

    /**
     * @return The fully qualified name of the object on which privileges will be granted.
     * 
     */
    public Output<String> objectName() {
        return this.objectName;
    }

    /**
     * The object type of the account object on which privileges will be granted. Valid values are: USER | RESOURCE MONITOR | WAREHOUSE | COMPUTE POOL | DATABASE | INTEGRATION | FAILOVER GROUP | REPLICATION GROUP | EXTERNAL VOLUME
     * 
     */
    @Import(name="objectType", required=true)
    private Output<String> objectType;

    /**
     * @return The object type of the account object on which privileges will be granted. Valid values are: USER | RESOURCE MONITOR | WAREHOUSE | COMPUTE POOL | DATABASE | INTEGRATION | FAILOVER GROUP | REPLICATION GROUP | EXTERNAL VOLUME
     * 
     */
    public Output<String> objectType() {
        return this.objectType;
    }

    private GrantPrivilegesToAccountRoleOnAccountObjectArgs() {}

    private GrantPrivilegesToAccountRoleOnAccountObjectArgs(GrantPrivilegesToAccountRoleOnAccountObjectArgs $) {
        this.objectName = $.objectName;
        this.objectType = $.objectType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GrantPrivilegesToAccountRoleOnAccountObjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GrantPrivilegesToAccountRoleOnAccountObjectArgs $;

        public Builder() {
            $ = new GrantPrivilegesToAccountRoleOnAccountObjectArgs();
        }

        public Builder(GrantPrivilegesToAccountRoleOnAccountObjectArgs defaults) {
            $ = new GrantPrivilegesToAccountRoleOnAccountObjectArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param objectName The fully qualified name of the object on which privileges will be granted.
         * 
         * @return builder
         * 
         */
        public Builder objectName(Output<String> objectName) {
            $.objectName = objectName;
            return this;
        }

        /**
         * @param objectName The fully qualified name of the object on which privileges will be granted.
         * 
         * @return builder
         * 
         */
        public Builder objectName(String objectName) {
            return objectName(Output.of(objectName));
        }

        /**
         * @param objectType The object type of the account object on which privileges will be granted. Valid values are: USER | RESOURCE MONITOR | WAREHOUSE | COMPUTE POOL | DATABASE | INTEGRATION | FAILOVER GROUP | REPLICATION GROUP | EXTERNAL VOLUME
         * 
         * @return builder
         * 
         */
        public Builder objectType(Output<String> objectType) {
            $.objectType = objectType;
            return this;
        }

        /**
         * @param objectType The object type of the account object on which privileges will be granted. Valid values are: USER | RESOURCE MONITOR | WAREHOUSE | COMPUTE POOL | DATABASE | INTEGRATION | FAILOVER GROUP | REPLICATION GROUP | EXTERNAL VOLUME
         * 
         * @return builder
         * 
         */
        public Builder objectType(String objectType) {
            return objectType(Output.of(objectType));
        }

        public GrantPrivilegesToAccountRoleOnAccountObjectArgs build() {
            if ($.objectName == null) {
                throw new MissingRequiredPropertyException("GrantPrivilegesToAccountRoleOnAccountObjectArgs", "objectName");
            }
            if ($.objectType == null) {
                throw new MissingRequiredPropertyException("GrantPrivilegesToAccountRoleOnAccountObjectArgs", "objectType");
            }
            return $;
        }
    }

}