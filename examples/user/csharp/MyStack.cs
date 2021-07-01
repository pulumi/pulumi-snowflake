using Pulumi;
using Snowflake = Pulumi.Snowflake;

class MyStack : Stack
{
    public MyStack()
    {
        var user = new Snowflake.User("cs-user", new Snowflake.UserArgs{});

        this.UserName = user.Name;
    }

    [Output] public Output<string> UserName { get; set; }
}
