# coding: utf-8

"""
    Swagger Petstore

    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501

    OpenAPI spec version: 1.0.0
    Contact: apiteam@swagger.io
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six

from swagger_client.configuration import Configuration


class MixedPropertiesAndAdditionalPropertiesClass(object):
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
        'uuid': 'str',
        'date_time': 'datetime',
        'map': 'dict(str, Animal)'
    }

    attribute_map = {
        'uuid': 'uuid',
        'date_time': 'dateTime',
        'map': 'map'
    }

    def __init__(self, uuid=None, date_time=None, map=None, _configuration=None):  # noqa: E501
        """MixedPropertiesAndAdditionalPropertiesClass - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._uuid = None
        self._date_time = None
        self._map = None
        self.discriminator = None

        if uuid is not None:
            self.uuid = uuid
        if date_time is not None:
            self.date_time = date_time
        if map is not None:
            self.map = map

    @property
    def uuid(self):
        """Gets the uuid of this MixedPropertiesAndAdditionalPropertiesClass.  # noqa: E501


        :return: The uuid of this MixedPropertiesAndAdditionalPropertiesClass.  # noqa: E501
        :rtype: str
        """
        return self._uuid

    @uuid.setter
    def uuid(self, uuid):
        """Sets the uuid of this MixedPropertiesAndAdditionalPropertiesClass.


        :param uuid: The uuid of this MixedPropertiesAndAdditionalPropertiesClass.  # noqa: E501
        :type: str
        """

        self._uuid = uuid

    @property
    def date_time(self):
        """Gets the date_time of this MixedPropertiesAndAdditionalPropertiesClass.  # noqa: E501


        :return: The date_time of this MixedPropertiesAndAdditionalPropertiesClass.  # noqa: E501
        :rtype: datetime
        """
        return self._date_time

    @date_time.setter
    def date_time(self, date_time):
        """Sets the date_time of this MixedPropertiesAndAdditionalPropertiesClass.


        :param date_time: The date_time of this MixedPropertiesAndAdditionalPropertiesClass.  # noqa: E501
        :type: datetime
        """

        self._date_time = date_time

    @property
    def map(self):
        """Gets the map of this MixedPropertiesAndAdditionalPropertiesClass.  # noqa: E501


        :return: The map of this MixedPropertiesAndAdditionalPropertiesClass.  # noqa: E501
        :rtype: dict(str, Animal)
        """
        return self._map

    @map.setter
    def map(self, map):
        """Sets the map of this MixedPropertiesAndAdditionalPropertiesClass.


        :param map: The map of this MixedPropertiesAndAdditionalPropertiesClass.  # noqa: E501
        :type: dict(str, Animal)
        """

        self._map = map

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
        if issubclass(MixedPropertiesAndAdditionalPropertiesClass, dict):
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
        if not isinstance(other, MixedPropertiesAndAdditionalPropertiesClass):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, MixedPropertiesAndAdditionalPropertiesClass):
            return True

        return self.to_dict() != other.to_dict()
