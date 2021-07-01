"""A Python Pulumi program"""

import pulumi
import pulumi_snowflake as snowflake

user = snowflake.User("py-user")

pulumi.export("username", user.name)
