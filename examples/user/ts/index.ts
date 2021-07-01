import * as pulumi from "@pulumi/pulumi";
import * as snowflake from "@pulumi/snowflake";

const user = new snowflake.User("ts-user")

export const username = user.name;
