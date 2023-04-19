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
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Snowflake = Pulumi.Snowflake;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var user = new Snowflake.User("user", new()
    ///     {
    ///         Comment = "A user of snowflake.",
    ///         DefaultRole = "role1",
    ///         DefaultSecondaryRoles = new[]
    ///         {
    ///             "ALL",
    ///         },
    ///         DefaultWarehouse = "warehouse",
    ///         Disabled = false,
    ///         DisplayName = "Snowflake User",
    ///         Email = "user@snowflake.example",
    ///         FirstName = "Snowflake",
    ///         LastName = "User",
    ///         LoginName = "snowflake_user",
    ///         MustChangePassword = false,
    ///         Password = "secret",
    ///         RsaPublicKey = "...",
    ///         RsaPublicKey2 = "...",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ```sh
    ///  $ pulumi import snowflake:index/user:User example userName
    /// ```
    /// </summary>
    [SnowflakeResourceType("snowflake:index/user:User")]
    public partial class User : global::Pulumi.CustomResource
    {
        [Output("comment")]
        public Output<string?> Comment { get; private set; } = null!;

        /// <summary>
        /// Specifies the namespace (database only or database and schema) that is active by default for the user’s session upon login.
        /// </summary>
        [Output("defaultNamespace")]
        public Output<string?> DefaultNamespace { get; private set; } = null!;

        /// <summary>
        /// Specifies the role that is active by default for the user’s session upon login.
        /// </summary>
        [Output("defaultRole")]
        public Output<string> DefaultRole { get; private set; } = null!;

        /// <summary>
        /// Specifies the set of secondary roles that are active for the user’s session upon login. Currently only ["ALL"] value is supported - more information can be found in [doc](https://docs.snowflake.com/en/sql-reference/sql/create-user#optional-object-properties-objectproperties)
        /// </summary>
        [Output("defaultSecondaryRoles")]
        public Output<ImmutableArray<string>> DefaultSecondaryRoles { get; private set; } = null!;

        /// <summary>
        /// Specifies the virtual warehouse that is active by default for the user’s session upon login.
        /// </summary>
        [Output("defaultWarehouse")]
        public Output<string?> DefaultWarehouse { get; private set; } = null!;

        [Output("disabled")]
        public Output<bool> Disabled { get; private set; } = null!;

        /// <summary>
        /// Name displayed for the user in the Snowflake web interface.
        /// </summary>
        [Output("displayName")]
        public Output<string> DisplayName { get; private set; } = null!;

        /// <summary>
        /// Email address for the user.
        /// </summary>
        [Output("email")]
        public Output<string?> Email { get; private set; } = null!;

        /// <summary>
        /// First name of the user.
        /// </summary>
        [Output("firstName")]
        public Output<string?> FirstName { get; private set; } = null!;

        /// <summary>
        /// Will be true if user as an RSA key set.
        /// </summary>
        [Output("hasRsaPublicKey")]
        public Output<bool> HasRsaPublicKey { get; private set; } = null!;

        /// <summary>
        /// Last name of the user.
        /// </summary>
        [Output("lastName")]
        public Output<string?> LastName { get; private set; } = null!;

        /// <summary>
        /// The name users use to log in. If not supplied, snowflake will use name instead.
        /// </summary>
        [Output("loginName")]
        public Output<string> LoginName { get; private set; } = null!;

        /// <summary>
        /// Specifies whether the user is forced to change their password on next login (including their first/initial login) into the system.
        /// </summary>
        [Output("mustChangePassword")]
        public Output<bool?> MustChangePassword { get; private set; } = null!;

        /// <summary>
        /// Name of the user. Note that if you do not supply login*name this will be used as login*name. [doc](https://docs.snowflake.net/manuals/sql-reference/sql/create-user.html#required-parameters)
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// **WARNING:** this will put the password in the terraform state file. Use carefully.
        /// </summary>
        [Output("password")]
        public Output<string?> Password { get; private set; } = null!;

        /// <summary>
        /// Specifies the user’s RSA public key; used for key-pair authentication. Must be on 1 line without header and trailer.
        /// </summary>
        [Output("rsaPublicKey")]
        public Output<string?> RsaPublicKey { get; private set; } = null!;

        /// <summary>
        /// Specifies the user’s second RSA public key; used to rotate the public and private keys for key-pair authentication based on an expiration schedule set by your organization. Must be on 1 line without header and trailer.
        /// </summary>
        [Output("rsaPublicKey2")]
        public Output<string?> RsaPublicKey2 { get; private set; } = null!;

        /// <summary>
        /// Definitions of a tag to associate with the resource.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<Outputs.UserTag>> Tags { get; private set; } = null!;


        /// <summary>
        /// Create a User resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public User(string name, UserArgs? args = null, CustomResourceOptions? options = null)
            : base("snowflake:index/user:User", name, args ?? new UserArgs(), MakeResourceOptions(options, ""))
        {
        }

        private User(string name, Input<string> id, UserState? state = null, CustomResourceOptions? options = null)
            : base("snowflake:index/user:User", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "displayName",
                    "email",
                    "firstName",
                    "lastName",
                    "loginName",
                    "name",
                    "password",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing User resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static User Get(string name, Input<string> id, UserState? state = null, CustomResourceOptions? options = null)
        {
            return new User(name, id, state, options);
        }
    }

    public sealed class UserArgs : global::Pulumi.ResourceArgs
    {
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// Specifies the namespace (database only or database and schema) that is active by default for the user’s session upon login.
        /// </summary>
        [Input("defaultNamespace")]
        public Input<string>? DefaultNamespace { get; set; }

        /// <summary>
        /// Specifies the role that is active by default for the user’s session upon login.
        /// </summary>
        [Input("defaultRole")]
        public Input<string>? DefaultRole { get; set; }

        [Input("defaultSecondaryRoles")]
        private InputList<string>? _defaultSecondaryRoles;

        /// <summary>
        /// Specifies the set of secondary roles that are active for the user’s session upon login. Currently only ["ALL"] value is supported - more information can be found in [doc](https://docs.snowflake.com/en/sql-reference/sql/create-user#optional-object-properties-objectproperties)
        /// </summary>
        public InputList<string> DefaultSecondaryRoles
        {
            get => _defaultSecondaryRoles ?? (_defaultSecondaryRoles = new InputList<string>());
            set => _defaultSecondaryRoles = value;
        }

        /// <summary>
        /// Specifies the virtual warehouse that is active by default for the user’s session upon login.
        /// </summary>
        [Input("defaultWarehouse")]
        public Input<string>? DefaultWarehouse { get; set; }

        [Input("disabled")]
        public Input<bool>? Disabled { get; set; }

        [Input("displayName")]
        private Input<string>? _displayName;

        /// <summary>
        /// Name displayed for the user in the Snowflake web interface.
        /// </summary>
        public Input<string>? DisplayName
        {
            get => _displayName;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _displayName = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("email")]
        private Input<string>? _email;

        /// <summary>
        /// Email address for the user.
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
        /// First name of the user.
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

        [Input("lastName")]
        private Input<string>? _lastName;

        /// <summary>
        /// Last name of the user.
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

        [Input("loginName")]
        private Input<string>? _loginName;

        /// <summary>
        /// The name users use to log in. If not supplied, snowflake will use name instead.
        /// </summary>
        public Input<string>? LoginName
        {
            get => _loginName;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _loginName = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Specifies whether the user is forced to change their password on next login (including their first/initial login) into the system.
        /// </summary>
        [Input("mustChangePassword")]
        public Input<bool>? MustChangePassword { get; set; }

        [Input("name")]
        private Input<string>? _name;

        /// <summary>
        /// Name of the user. Note that if you do not supply login*name this will be used as login*name. [doc](https://docs.snowflake.net/manuals/sql-reference/sql/create-user.html#required-parameters)
        /// </summary>
        public Input<string>? Name
        {
            get => _name;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _name = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("password")]
        private Input<string>? _password;

        /// <summary>
        /// **WARNING:** this will put the password in the terraform state file. Use carefully.
        /// </summary>
        public Input<string>? Password
        {
            get => _password;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _password = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Specifies the user’s RSA public key; used for key-pair authentication. Must be on 1 line without header and trailer.
        /// </summary>
        [Input("rsaPublicKey")]
        public Input<string>? RsaPublicKey { get; set; }

        /// <summary>
        /// Specifies the user’s second RSA public key; used to rotate the public and private keys for key-pair authentication based on an expiration schedule set by your organization. Must be on 1 line without header and trailer.
        /// </summary>
        [Input("rsaPublicKey2")]
        public Input<string>? RsaPublicKey2 { get; set; }

        [Input("tags")]
        private InputList<Inputs.UserTagArgs>? _tags;

        /// <summary>
        /// Definitions of a tag to associate with the resource.
        /// </summary>
        [Obsolete(@"Use the 'snowflake_tag_association' resource instead.")]
        public InputList<Inputs.UserTagArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.UserTagArgs>());
            set => _tags = value;
        }

        public UserArgs()
        {
        }
        public static new UserArgs Empty => new UserArgs();
    }

    public sealed class UserState : global::Pulumi.ResourceArgs
    {
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// Specifies the namespace (database only or database and schema) that is active by default for the user’s session upon login.
        /// </summary>
        [Input("defaultNamespace")]
        public Input<string>? DefaultNamespace { get; set; }

        /// <summary>
        /// Specifies the role that is active by default for the user’s session upon login.
        /// </summary>
        [Input("defaultRole")]
        public Input<string>? DefaultRole { get; set; }

        [Input("defaultSecondaryRoles")]
        private InputList<string>? _defaultSecondaryRoles;

        /// <summary>
        /// Specifies the set of secondary roles that are active for the user’s session upon login. Currently only ["ALL"] value is supported - more information can be found in [doc](https://docs.snowflake.com/en/sql-reference/sql/create-user#optional-object-properties-objectproperties)
        /// </summary>
        public InputList<string> DefaultSecondaryRoles
        {
            get => _defaultSecondaryRoles ?? (_defaultSecondaryRoles = new InputList<string>());
            set => _defaultSecondaryRoles = value;
        }

        /// <summary>
        /// Specifies the virtual warehouse that is active by default for the user’s session upon login.
        /// </summary>
        [Input("defaultWarehouse")]
        public Input<string>? DefaultWarehouse { get; set; }

        [Input("disabled")]
        public Input<bool>? Disabled { get; set; }

        [Input("displayName")]
        private Input<string>? _displayName;

        /// <summary>
        /// Name displayed for the user in the Snowflake web interface.
        /// </summary>
        public Input<string>? DisplayName
        {
            get => _displayName;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _displayName = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("email")]
        private Input<string>? _email;

        /// <summary>
        /// Email address for the user.
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
        /// First name of the user.
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
        /// Will be true if user as an RSA key set.
        /// </summary>
        [Input("hasRsaPublicKey")]
        public Input<bool>? HasRsaPublicKey { get; set; }

        [Input("lastName")]
        private Input<string>? _lastName;

        /// <summary>
        /// Last name of the user.
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

        [Input("loginName")]
        private Input<string>? _loginName;

        /// <summary>
        /// The name users use to log in. If not supplied, snowflake will use name instead.
        /// </summary>
        public Input<string>? LoginName
        {
            get => _loginName;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _loginName = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Specifies whether the user is forced to change their password on next login (including their first/initial login) into the system.
        /// </summary>
        [Input("mustChangePassword")]
        public Input<bool>? MustChangePassword { get; set; }

        [Input("name")]
        private Input<string>? _name;

        /// <summary>
        /// Name of the user. Note that if you do not supply login*name this will be used as login*name. [doc](https://docs.snowflake.net/manuals/sql-reference/sql/create-user.html#required-parameters)
        /// </summary>
        public Input<string>? Name
        {
            get => _name;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _name = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("password")]
        private Input<string>? _password;

        /// <summary>
        /// **WARNING:** this will put the password in the terraform state file. Use carefully.
        /// </summary>
        public Input<string>? Password
        {
            get => _password;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _password = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Specifies the user’s RSA public key; used for key-pair authentication. Must be on 1 line without header and trailer.
        /// </summary>
        [Input("rsaPublicKey")]
        public Input<string>? RsaPublicKey { get; set; }

        /// <summary>
        /// Specifies the user’s second RSA public key; used to rotate the public and private keys for key-pair authentication based on an expiration schedule set by your organization. Must be on 1 line without header and trailer.
        /// </summary>
        [Input("rsaPublicKey2")]
        public Input<string>? RsaPublicKey2 { get; set; }

        [Input("tags")]
        private InputList<Inputs.UserTagGetArgs>? _tags;

        /// <summary>
        /// Definitions of a tag to associate with the resource.
        /// </summary>
        [Obsolete(@"Use the 'snowflake_tag_association' resource instead.")]
        public InputList<Inputs.UserTagGetArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.UserTagGetArgs>());
            set => _tags = value;
        }

        public UserState()
        {
        }
        public static new UserState Empty => new UserState();
    }
}
