// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GrantPrivilegesToRoleOnAccountObjectArgs extends com.pulumi.resources.ResourceArgs {

    public static final GrantPrivilegesToRoleOnAccountObjectArgs Empty = new GrantPrivilegesToRoleOnAccountObjectArgs();

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
     * The object type of the account object on which privileges will be granted. Valid values are: USER | RESOURCE MONITOR | WAREHOUSE | DATABASE | INTEGRATION | FAILOVER GROUP | REPLICATION GROUP | EXTERNAL VOLUME
     * 
     */
    @Import(name="objectType", required=true)
    private Output<String> objectType;

    /**
     * @return The object type of the account object on which privileges will be granted. Valid values are: USER | RESOURCE MONITOR | WAREHOUSE | DATABASE | INTEGRATION | FAILOVER GROUP | REPLICATION GROUP | EXTERNAL VOLUME
     * 
     */
    public Output<String> objectType() {
        return this.objectType;
    }

    private GrantPrivilegesToRoleOnAccountObjectArgs() {}

    private GrantPrivilegesToRoleOnAccountObjectArgs(GrantPrivilegesToRoleOnAccountObjectArgs $) {
        this.objectName = $.objectName;
        this.objectType = $.objectType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GrantPrivilegesToRoleOnAccountObjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GrantPrivilegesToRoleOnAccountObjectArgs $;

        public Builder() {
            $ = new GrantPrivilegesToRoleOnAccountObjectArgs();
        }

        public Builder(GrantPrivilegesToRoleOnAccountObjectArgs defaults) {
            $ = new GrantPrivilegesToRoleOnAccountObjectArgs(Objects.requireNonNull(defaults));
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
         * @param objectType The object type of the account object on which privileges will be granted. Valid values are: USER | RESOURCE MONITOR | WAREHOUSE | DATABASE | INTEGRATION | FAILOVER GROUP | REPLICATION GROUP | EXTERNAL VOLUME
         * 
         * @return builder
         * 
         */
        public Builder objectType(Output<String> objectType) {
            $.objectType = objectType;
            return this;
        }

        /**
         * @param objectType The object type of the account object on which privileges will be granted. Valid values are: USER | RESOURCE MONITOR | WAREHOUSE | DATABASE | INTEGRATION | FAILOVER GROUP | REPLICATION GROUP | EXTERNAL VOLUME
         * 
         * @return builder
         * 
         */
        public Builder objectType(String objectType) {
            return objectType(Output.of(objectType));
        }

        public GrantPrivilegesToRoleOnAccountObjectArgs build() {
            if ($.objectName == null) {
                throw new MissingRequiredPropertyException("GrantPrivilegesToRoleOnAccountObjectArgs", "objectName");
            }
            if ($.objectType == null) {
                throw new MissingRequiredPropertyException("GrantPrivilegesToRoleOnAccountObjectArgs", "objectType");
            }
            return $;
        }
    }

}
