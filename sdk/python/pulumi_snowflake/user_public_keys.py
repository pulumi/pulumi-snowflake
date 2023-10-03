# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['UserPublicKeysArgs', 'UserPublicKeys']

@pulumi.input_type
class UserPublicKeysArgs:
    def __init__(__self__, *,
                 name: Optional[pulumi.Input[str]] = None,
                 rsa_public_key: Optional[pulumi.Input[str]] = None,
                 rsa_public_key2: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a UserPublicKeys resource.
        :param pulumi.Input[str] name: Name of the user.
        :param pulumi.Input[str] rsa_public_key: Specifies the user’s RSA public key; used for key-pair authentication. Must be on 1 line without header and trailer.
        :param pulumi.Input[str] rsa_public_key2: Specifies the user’s second RSA public key; used to rotate the public and Public keys for key-pair authentication based on an expiration schedule set by your organization. Must be on 1 line without header and trailer.
        """
        UserPublicKeysArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            name=name,
            rsa_public_key=rsa_public_key,
            rsa_public_key2=rsa_public_key2,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             name: Optional[pulumi.Input[str]] = None,
             rsa_public_key: Optional[pulumi.Input[str]] = None,
             rsa_public_key2: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        if name is not None:
            _setter("name", name)
        if rsa_public_key is not None:
            _setter("rsa_public_key", rsa_public_key)
        if rsa_public_key2 is not None:
            _setter("rsa_public_key2", rsa_public_key2)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the user.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="rsaPublicKey")
    def rsa_public_key(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the user’s RSA public key; used for key-pair authentication. Must be on 1 line without header and trailer.
        """
        return pulumi.get(self, "rsa_public_key")

    @rsa_public_key.setter
    def rsa_public_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "rsa_public_key", value)

    @property
    @pulumi.getter(name="rsaPublicKey2")
    def rsa_public_key2(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the user’s second RSA public key; used to rotate the public and Public keys for key-pair authentication based on an expiration schedule set by your organization. Must be on 1 line without header and trailer.
        """
        return pulumi.get(self, "rsa_public_key2")

    @rsa_public_key2.setter
    def rsa_public_key2(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "rsa_public_key2", value)


@pulumi.input_type
class _UserPublicKeysState:
    def __init__(__self__, *,
                 name: Optional[pulumi.Input[str]] = None,
                 rsa_public_key: Optional[pulumi.Input[str]] = None,
                 rsa_public_key2: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering UserPublicKeys resources.
        :param pulumi.Input[str] name: Name of the user.
        :param pulumi.Input[str] rsa_public_key: Specifies the user’s RSA public key; used for key-pair authentication. Must be on 1 line without header and trailer.
        :param pulumi.Input[str] rsa_public_key2: Specifies the user’s second RSA public key; used to rotate the public and Public keys for key-pair authentication based on an expiration schedule set by your organization. Must be on 1 line without header and trailer.
        """
        _UserPublicKeysState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            name=name,
            rsa_public_key=rsa_public_key,
            rsa_public_key2=rsa_public_key2,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             name: Optional[pulumi.Input[str]] = None,
             rsa_public_key: Optional[pulumi.Input[str]] = None,
             rsa_public_key2: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None):
        if name is not None:
            _setter("name", name)
        if rsa_public_key is not None:
            _setter("rsa_public_key", rsa_public_key)
        if rsa_public_key2 is not None:
            _setter("rsa_public_key2", rsa_public_key2)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the user.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="rsaPublicKey")
    def rsa_public_key(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the user’s RSA public key; used for key-pair authentication. Must be on 1 line without header and trailer.
        """
        return pulumi.get(self, "rsa_public_key")

    @rsa_public_key.setter
    def rsa_public_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "rsa_public_key", value)

    @property
    @pulumi.getter(name="rsaPublicKey2")
    def rsa_public_key2(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the user’s second RSA public key; used to rotate the public and Public keys for key-pair authentication based on an expiration schedule set by your organization. Must be on 1 line without header and trailer.
        """
        return pulumi.get(self, "rsa_public_key2")

    @rsa_public_key2.setter
    def rsa_public_key2(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "rsa_public_key2", value)


class UserPublicKeys(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 rsa_public_key: Optional[pulumi.Input[str]] = None,
                 rsa_public_key2: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Create a UserPublicKeys resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] name: Name of the user.
        :param pulumi.Input[str] rsa_public_key: Specifies the user’s RSA public key; used for key-pair authentication. Must be on 1 line without header and trailer.
        :param pulumi.Input[str] rsa_public_key2: Specifies the user’s second RSA public key; used to rotate the public and Public keys for key-pair authentication based on an expiration schedule set by your organization. Must be on 1 line without header and trailer.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[UserPublicKeysArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create a UserPublicKeys resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param UserPublicKeysArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(UserPublicKeysArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            UserPublicKeysArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 rsa_public_key: Optional[pulumi.Input[str]] = None,
                 rsa_public_key2: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = UserPublicKeysArgs.__new__(UserPublicKeysArgs)

            __props__.__dict__["name"] = name
            __props__.__dict__["rsa_public_key"] = rsa_public_key
            __props__.__dict__["rsa_public_key2"] = rsa_public_key2
        super(UserPublicKeys, __self__).__init__(
            'snowflake:index/userPublicKeys:UserPublicKeys',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            name: Optional[pulumi.Input[str]] = None,
            rsa_public_key: Optional[pulumi.Input[str]] = None,
            rsa_public_key2: Optional[pulumi.Input[str]] = None) -> 'UserPublicKeys':
        """
        Get an existing UserPublicKeys resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] name: Name of the user.
        :param pulumi.Input[str] rsa_public_key: Specifies the user’s RSA public key; used for key-pair authentication. Must be on 1 line without header and trailer.
        :param pulumi.Input[str] rsa_public_key2: Specifies the user’s second RSA public key; used to rotate the public and Public keys for key-pair authentication based on an expiration schedule set by your organization. Must be on 1 line without header and trailer.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _UserPublicKeysState.__new__(_UserPublicKeysState)

        __props__.__dict__["name"] = name
        __props__.__dict__["rsa_public_key"] = rsa_public_key
        __props__.__dict__["rsa_public_key2"] = rsa_public_key2
        return UserPublicKeys(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the user.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="rsaPublicKey")
    def rsa_public_key(self) -> pulumi.Output[Optional[str]]:
        """
        Specifies the user’s RSA public key; used for key-pair authentication. Must be on 1 line without header and trailer.
        """
        return pulumi.get(self, "rsa_public_key")

    @property
    @pulumi.getter(name="rsaPublicKey2")
    def rsa_public_key2(self) -> pulumi.Output[Optional[str]]:
        """
        Specifies the user’s second RSA public key; used to rotate the public and Public keys for key-pair authentication based on an expiration schedule set by your organization. Must be on 1 line without header and trailer.
        """
        return pulumi.get(self, "rsa_public_key2")

