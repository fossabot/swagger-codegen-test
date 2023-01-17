# coding: utf-8

"""
    Swagger Petstore

    This is a sample Petstore server.  You can find out more about Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/).   # noqa: E501

    OpenAPI spec version: 1.0.0
    Contact: apiteam@swagger.io
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""

import pprint
import re  # noqa: F401

import six

class PartMaster(object):
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
        'destination': 'OneOfPartMasterDestination',
        'origin': 'OneOfPartMasterOrigin'
    }

    attribute_map = {
        'destination': 'destination',
        'origin': 'origin'
    }

    def __init__(self, destination=None, origin=None):  # noqa: E501
        """PartMaster - a model defined in Swagger"""  # noqa: E501
        self._destination = None
        self._origin = None
        self.discriminator = None
        if destination is not None:
            self.destination = destination
        if origin is not None:
            self.origin = origin

    @property
    def destination(self):
        """Gets the destination of this PartMaster.  # noqa: E501


        :return: The destination of this PartMaster.  # noqa: E501
        :rtype: OneOfPartMasterDestination
        """
        return self._destination

    @destination.setter
    def destination(self, destination):
        """Sets the destination of this PartMaster.


        :param destination: The destination of this PartMaster.  # noqa: E501
        :type: OneOfPartMasterDestination
        """

        self._destination = destination

    @property
    def origin(self):
        """Gets the origin of this PartMaster.  # noqa: E501


        :return: The origin of this PartMaster.  # noqa: E501
        :rtype: OneOfPartMasterOrigin
        """
        return self._origin

    @origin.setter
    def origin(self, origin):
        """Sets the origin of this PartMaster.


        :param origin: The origin of this PartMaster.  # noqa: E501
        :type: OneOfPartMasterOrigin
        """

        self._origin = origin

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
        if issubclass(PartMaster, dict):
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
        if not isinstance(other, PartMaster):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
