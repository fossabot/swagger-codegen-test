# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from swagger_server.models.base_model_ import Model
from swagger_server import util


class AdditionalPropertiesClass(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, map_property: Dict[str, str]=None, map_of_map_property: Dict[str, Dict[str, str]]=None):  # noqa: E501
        """AdditionalPropertiesClass - a model defined in Swagger

        :param map_property: The map_property of this AdditionalPropertiesClass.  # noqa: E501
        :type map_property: Dict[str, str]
        :param map_of_map_property: The map_of_map_property of this AdditionalPropertiesClass.  # noqa: E501
        :type map_of_map_property: Dict[str, Dict[str, str]]
        """
        self.swagger_types = {
            'map_property': Dict[str, str],
            'map_of_map_property': Dict[str, Dict[str, str]]
        }

        self.attribute_map = {
            'map_property': 'map_property',
            'map_of_map_property': 'map_of_map_property'
        }

        self._map_property = map_property
        self._map_of_map_property = map_of_map_property

    @classmethod
    def from_dict(cls, dikt) -> 'AdditionalPropertiesClass':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The AdditionalPropertiesClass of this AdditionalPropertiesClass.  # noqa: E501
        :rtype: AdditionalPropertiesClass
        """
        return util.deserialize_model(dikt, cls)

    @property
    def map_property(self) -> Dict[str, str]:
        """Gets the map_property of this AdditionalPropertiesClass.


        :return: The map_property of this AdditionalPropertiesClass.
        :rtype: Dict[str, str]
        """
        return self._map_property

    @map_property.setter
    def map_property(self, map_property: Dict[str, str]):
        """Sets the map_property of this AdditionalPropertiesClass.


        :param map_property: The map_property of this AdditionalPropertiesClass.
        :type map_property: Dict[str, str]
        """

        self._map_property = map_property

    @property
    def map_of_map_property(self) -> Dict[str, Dict[str, str]]:
        """Gets the map_of_map_property of this AdditionalPropertiesClass.


        :return: The map_of_map_property of this AdditionalPropertiesClass.
        :rtype: Dict[str, Dict[str, str]]
        """
        return self._map_of_map_property

    @map_of_map_property.setter
    def map_of_map_property(self, map_of_map_property: Dict[str, Dict[str, str]]):
        """Sets the map_of_map_property of this AdditionalPropertiesClass.


        :param map_of_map_property: The map_of_map_property of this AdditionalPropertiesClass.
        :type map_of_map_property: Dict[str, Dict[str, str]]
        """

        self._map_of_map_property = map_of_map_property
