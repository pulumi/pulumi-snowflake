// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake
{
    /// <summary>
    /// The account resource allows you to create and manage Snowflake accounts.
    /// 
    ///     **WARNING** This resource cannot be destroyed!!! The only way to delete accounts is to go through [Snowflake Support](https://docs.snowflake.com/en/user-guide/organizations-manage-accounts.html#deleting-an-account)
    ///     
    ///     **NOTE** ORGADMIN priviliges are required for this resource
    /// 
    /// ## Example Usage
    /// 
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Snowflake = Pulumi.Snowflake;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var orgadmin = new Snowflake.Provider("orgadmin", new()
    ///     {
    ///         Role = "ORGADMIN",
    ///     });
    /// 
    ///     var ac1 = new Snowflake.Account("ac1", new()
    ///     {
    ///         AdminName = "John Doe",
    ///         AdminPassword = "Abcd1234!",
    ///         Email = "john.doe@snowflake.com",
    ///         FirstName = "John",
    ///         LastName = "Doe",
    ///         MustChangePassword = true,
    ///         Edition = "STANDARD",
    ///         Comment = "Snowflake Test Account",
    ///         Region = "AWS_US_WEST_2",
    ///     }, new CustomResourceOptions
    ///     {
    ///         Provider = snowflake.Orgadmin,
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import snowflake:index/account:Account account &lt;account_locator&gt;
    /// ```
    /// </summary>
    [SnowflakeResourceType("snowflake:index/account:Account")]
    public partial class Account : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Login name of the initial administrative user of the account. A new user is created in the new account with this name and password and granted the ACCOUNTADMIN role in the account. A login name can be any string consisting of letters, numbers, and underscores. Login names are always case-insensitive.
        /// </summary>
        [Output("adminName")]
        public Output<string> AdminName { get; private set; } = null!;

        /// <summary>
        /// Password for the initial administrative user of the account. Optional if the `ADMIN_RSA_PUBLIC_KEY` parameter is specified. For more information about passwords in Snowflake, see [Snowflake-provided Password Policy](https://docs.snowflake.com/en/sql-reference/sql/create-account.html#:~:text=Snowflake%!D(MISSING)provided%!P(MISSING)assword%!P(MISSING)olicy).
        /// </summary>
        [Output("adminPassword")]
        public Output<string?> AdminPassword { get; private set; } = null!;

        /// <summary>
        /// Assigns a public key to the initial administrative user of the account in order to implement [key pair authentication](https://docs.snowflake.com/en/sql-reference/sql/create-account.html#:~:text=key%!p(MISSING)air%!a(MISSING)uthentication) for the user. Optional if the `ADMIN_PASSWORD` parameter is specified.
        /// </summary>
        [Output("adminRsaPublicKey")]
        public Output<string?> AdminRsaPublicKey { get; private set; } = null!;

        /// <summary>
        /// Specifies a comment for the account.
        /// </summary>
        [Output("comment")]
        public Output<string?> Comment { get; private set; } = null!;

        /// <summary>
        /// [Snowflake Edition](https://docs.snowflake.com/en/user-guide/intro-editions.html) of the account. Valid values are: STANDARD | ENTERPRISE | BUSINESS_CRITICAL
        /// </summary>
        [Output("edition")]
        public Output<string> Edition { get; private set; } = null!;

        /// <summary>
        /// Email address of the initial administrative user of the account. This email address is used to send any notifications about the account.
        /// </summary>
        [Output("email")]
        public Output<string> Email { get; private set; } = null!;

        /// <summary>
        /// First name of the initial administrative user of the account
        /// </summary>
        [Output("firstName")]
        public Output<string?> FirstName { get; private set; } = null!;

        /// <summary>
        /// Specifies the number of days to wait before dropping the account. The default is 3 days.
        /// </summary>
        [Output("gracePeriodInDays")]
        public Output<int?> GracePeriodInDays { get; private set; } = null!;

        /// <summary>
        /// Indicates whether the ORGADMIN role is enabled in an account. If TRUE, the role is enabled.
        /// </summary>
        [Output("isOrgAdmin")]
        public Output<bool> IsOrgAdmin { get; private set; } = null!;

        /// <summary>
        /// Last name of the initial administrative user of the account
        /// </summary>
        [Output("lastName")]
        public Output<string?> LastName { get; private set; } = null!;

        /// <summary>
        /// Specifies whether the new user created to administer the account is forced to change their password upon first login into the account.
        /// </summary>
        [Output("mustChangePassword")]
        public Output<bool?> MustChangePassword { get; private set; } = null!;

        /// <summary>
        /// Specifies the identifier (i.e. name) for the account; must be unique within an organization, regardless of which Snowflake Region the account is in. In addition, the identifier must start with an alphabetic character and cannot contain spaces or special characters except for underscores (_). Note that if the account name includes underscores, features that do not accept account names with underscores (e.g. Okta SSO or SCIM) can reference a version of the account name that substitutes hyphens (-) for the underscores.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// ID of the Snowflake Region where the account is created. If no value is provided, Snowflake creates the account in the same Snowflake Region as the current account (i.e. the account in which the CREATE ACCOUNT statement is executed.)
        /// </summary>
        [Output("region")]
        public Output<string?> Region { get; private set; } = null!;

        /// <summary>
        /// ID of the Snowflake Region where the account is created. If no value is provided, Snowflake creates the account in the same Snowflake Region as the current account (i.e. the account in which the CREATE ACCOUNT statement is executed.)
        /// </summary>
        [Output("regionGroup")]
        public Output<string?> RegionGroup { get; private set; } = null!;


        /// <summary>
        /// Create a Account resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Account(string name, AccountArgs args, CustomResourceOptions? options = null)
            : base("snowflake:index/account:Account", name, args ?? new AccountArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Account(string name, Input<string> id, AccountState? state = null, CustomResourceOptions? options = null)
            : base("snowflake:index/account:Account", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "adminPassword",
                    "adminRsaPublicKey",
                    "email",
                    "firstName",
                    "lastName",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Account resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Account Get(string name, Input<string> id, AccountState? state = null, CustomResourceOptions? options = null)
        {
            return new Account(name, id, state, options);
        }
    }

    public sealed class AccountArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Login name of the initial administrative user of the account. A new user is created in the new account with this name and password and granted the ACCOUNTADMIN role in the account. A login name can be any string consisting of letters, numbers, and underscores. Login names are always case-insensitive.
        /// </summary>
        [Input("adminName", required: true)]
        public Input<string> AdminName { get; set; } = null!;

        [Input("adminPassword")]
        private Input<string>? _adminPassword;

        /// <summary>
        /// Password for the initial administrative user of the account. Optional if the `ADMIN_RSA_PUBLIC_KEY` parameter is specified. For more information about passwords in Snowflake, see [Snowflake-provided Password Policy](https://docs.snowflake.com/en/sql-reference/sql/create-account.html#:~:text=Snowflake%!D(MISSING)provided%!P(MISSING)assword%!P(MISSING)olicy).
        /// </summary>
        public Input<string>? AdminPassword
        {
            get => _adminPassword;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _adminPassword = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("adminRsaPublicKey")]
        private Input<string>? _adminRsaPublicKey;

        /// <summary>
        /// Assigns a public key to the initial administrative user of the account in order to implement [key pair authentication](https://docs.snowflake.com/en/sql-reference/sql/create-account.html#:~:text=key%!p(MISSING)air%!a(MISSING)uthentication) for the user. Optional if the `ADMIN_PASSWORD` parameter is specified.
        /// </summary>
        public Input<string>? AdminRsaPublicKey
        {
            get => _adminRsaPublicKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _adminRsaPublicKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Specifies a comment for the account.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// [Snowflake Edition](https://docs.snowflake.com/en/user-guide/intro-editions.html) of the account. Valid values are: STANDARD | ENTERPRISE | BUSINESS_CRITICAL
        /// </summary>
        [Input("edition", required: true)]
        public Input<string> Edition { get; set; } = null!;

        [Input("email", required: true)]
        private Input<string>? _email;

        /// <summary>
        /// Email address of the initial administrative user of the account. This email address is used to send any notifications about the account.
        /// </summary>
        public Input<string>? Email
        {
            get => _email;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _email = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("firstName")]
        private Input<string>? _firstName;

        /// <summary>
        /// First name of the initial administrative user of the account
        /// </summary>
        public Input<string>? FirstName
        {
            get => _firstName;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _firstName = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Specifies the number of days to wait before dropping the account. The default is 3 days.
        /// </summary>
        [Input("gracePeriodInDays")]
        public Input<int>? GracePeriodInDays { get; set; }

        [Input("lastName")]
        private Input<string>? _lastName;

        /// <summary>
        /// Last name of the initial administrative user of the account
        /// </summary>
        public Input<string>? LastName
        {
            get => _lastName;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _lastName = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Specifies whether the new user created to administer the account is forced to change their password upon first login into the account.
        /// </summary>
        [Input("mustChangePassword")]
        public Input<bool>? MustChangePassword { get; set; }

        /// <summary>
        /// Specifies the identifier (i.e. name) for the account; must be unique within an organization, regardless of which Snowflake Region the account is in. In addition, the identifier must start with an alphabetic character and cannot contain spaces or special characters except for underscores (_). Note that if the account name includes underscores, features that do not accept account names with underscores (e.g. Okta SSO or SCIM) can reference a version of the account name that substitutes hyphens (-) for the underscores.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// ID of the Snowflake Region where the account is created. If no value is provided, Snowflake creates the account in the same Snowflake Region as the current account (i.e. the account in which the CREATE ACCOUNT statement is executed.)
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// ID of the Snowflake Region where the account is created. If no value is provided, Snowflake creates the account in the same Snowflake Region as the current account (i.e. the account in which the CREATE ACCOUNT statement is executed.)
        /// </summary>
        [Input("regionGroup")]
        public Input<string>? RegionGroup { get; set; }

        public AccountArgs()
        {
        }
        public static new AccountArgs Empty => new AccountArgs();
    }

    public sealed class AccountState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Login name of the initial administrative user of the account. A new user is created in the new account with this name and password and granted the ACCOUNTADMIN role in the account. A login name can be any string consisting of letters, numbers, and underscores. Login names are always case-insensitive.
        /// </summary>
        [Input("adminName")]
        public Input<string>? AdminName { get; set; }

        [Input("adminPassword")]
        private Input<string>? _adminPassword;

        /// <summary>
        /// Password for the initial administrative user of the account. Optional if the `ADMIN_RSA_PUBLIC_KEY` parameter is specified. For more information about passwords in Snowflake, see [Snowflake-provided Password Policy](https://docs.snowflake.com/en/sql-reference/sql/create-account.html#:~:text=Snowflake%!D(MISSING)provided%!P(MISSING)assword%!P(MISSING)olicy).
        /// </summary>
        public Input<string>? AdminPassword
        {
            get => _adminPassword;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _adminPassword = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("adminRsaPublicKey")]
        private Input<string>? _adminRsaPublicKey;

        /// <summary>
        /// Assigns a public key to the initial administrative user of the account in order to implement [key pair authentication](https://docs.snowflake.com/en/sql-reference/sql/create-account.html#:~:text=key%!p(MISSING)air%!a(MISSING)uthentication) for the user. Optional if the `ADMIN_PASSWORD` parameter is specified.
        /// </summary>
        public Input<string>? AdminRsaPublicKey
        {
            get => _adminRsaPublicKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _adminRsaPublicKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Specifies a comment for the account.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// [Snowflake Edition](https://docs.snowflake.com/en/user-guide/intro-editions.html) of the account. Valid values are: STANDARD | ENTERPRISE | BUSINESS_CRITICAL
        /// </summary>
        [Input("edition")]
        public Input<string>? Edition { get; set; }

        [Input("email")]
        private Input<string>? _email;

        /// <summary>
        /// Email address of the initial administrative user of the account. This email address is used to send any notifications about the account.
        /// </summary>
        public Input<string>? Email
        {
            get => _email;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _email = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("firstName")]
        private Input<string>? _firstName;

        /// <summary>
        /// First name of the initial administrative user of the account
        /// </summary>
        public Input<string>? FirstName
        {
            get => _firstName;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _firstName = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Specifies the number of days to wait before dropping the account. The default is 3 days.
        /// </summary>
        [Input("gracePeriodInDays")]
        public Input<int>? GracePeriodInDays { get; set; }

        /// <summary>
        /// Indicates whether the ORGADMIN role is enabled in an account. If TRUE, the role is enabled.
        /// </summary>
        [Input("isOrgAdmin")]
        public Input<bool>? IsOrgAdmin { get; set; }

        [Input("lastName")]
        private Input<string>? _lastName;

        /// <summary>
        /// Last name of the initial administrative user of the account
        /// </summary>
        public Input<string>? LastName
        {
            get => _lastName;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _lastName = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Specifies whether the new user created to administer the account is forced to change their password upon first login into the account.
        /// </summary>
        [Input("mustChangePassword")]
        public Input<bool>? MustChangePassword { get; set; }

        /// <summary>
        /// Specifies the identifier (i.e. name) for the account; must be unique within an organization, regardless of which Snowflake Region the account is in. In addition, the identifier must start with an alphabetic character and cannot contain spaces or special characters except for underscores (_). Note that if the account name includes underscores, features that do not accept account names with underscores (e.g. Okta SSO or SCIM) can reference a version of the account name that substitutes hyphens (-) for the underscores.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// ID of the Snowflake Region where the account is created. If no value is provided, Snowflake creates the account in the same Snowflake Region as the current account (i.e. the account in which the CREATE ACCOUNT statement is executed.)
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// ID of the Snowflake Region where the account is created. If no value is provided, Snowflake creates the account in the same Snowflake Region as the current account (i.e. the account in which the CREATE ACCOUNT statement is executed.)
        /// </summary>
        [Input("regionGroup")]
        public Input<string>? RegionGroup { get; set; }

        public AccountState()
        {
        }
        public static new AccountState Empty => new AccountState();
    }
}
