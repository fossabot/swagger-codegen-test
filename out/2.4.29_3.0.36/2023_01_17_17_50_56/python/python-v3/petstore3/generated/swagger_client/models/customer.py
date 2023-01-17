# coding: utf-8

"""
    Swagger Petstore - OpenAPI 3.0

    This is a sample Pet Store Server based on the OpenAPI 3.0 specification.  You can find out more about Swagger at [http://swagger.io](http://swagger.io). In the third iteration of the pet store, we've switched to the design first approach! You can now help us improve the API whether it's by making changes to the definition itself or to the code. That way, with time, we can improve the API in general, and expose some of the new features in OAS3.  Some useful links: - [The Pet Store repository](https://github.com/swagger-api/swagger-petstore) - [The source API definition for the Pet Store](https://github.com/swagger-api/swagger-petstore/blob/master/src/main/resources/openapi.yaml)  # noqa: E501

    OpenAPI spec version: 1.0.5
    Contact: apiteam@swagger.io
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""

import pprint
import re  # noqa: F401

import six

class Customer(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """
    """
    Attributes:
      swagger_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    swagger_types = {
        'id': 'int',
        'username': 'str',
        'address': 'list[Address]'
    }

    attribute_map = {
        'id': 'id',
        'username': 'username',
        'address': 'address'
    }

    def __init__(self, id=None, username=None, address=None):  # noqa: E501
        """Customer - a model defined in Swagger"""  # noqa: E501
        self._id = None
        self._username = None
        self._address = None
        self.discriminator = None
        if id is not None:
            self.id = id
        if username is not None:
            self.username = username
        if address is not None:
            self.address = address

    @property
    def id(self):
        """Gets the id of this Customer.  # noqa: E501


        :return: The id of this Customer.  # noqa: E501
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this Customer.


        :param id: The id of this Customer.  # noqa: E501
        :type: int
        """

        self._id = id

    @property
    def username(self):
        """Gets the username of this Customer.  # noqa: E501


        :return: The username of this Customer.  # noqa: E501
        :rtype: str
        """
        return self._username

    @username.setter
    def username(self, username):
        """Sets the username of this Customer.


        :param username: The username of this Customer.  # noqa: E501
        :type: str
        """

        self._username = username

    @property
    def address(self):
        """Gets the address of this Customer.  # noqa: E501


        :return: The address of this Customer.  # noqa: E501
        :rtype: list[Address]
        """
        return self._address

    @address.setter
    def address(self, address):
        """Sets the address of this Customer.


        :param address: The address of this Customer.  # noqa: E501
        :type: list[Address]
        """

        self._address = address

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value
        if issubclass(Customer, dict):
            for key, value in self.items():
                result[key] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, Customer):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
