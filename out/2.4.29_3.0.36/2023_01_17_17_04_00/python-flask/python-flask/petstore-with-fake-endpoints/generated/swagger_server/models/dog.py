# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from swagger_server.models.base_model_ import Model
from swagger_server.models.animal import Animal
from swagger_server import util


class Dog(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, class_name: str=None, color: str='red', breed: str=None):  # noqa: E501
        """Dog - a model defined in Swagger

        :param class_name: The class_name of this Dog.  # noqa: E501
        :type class_name: str
        :param color: The color of this Dog.  # noqa: E501
        :type color: str
        :param breed: The breed of this Dog.  # noqa: E501
        :type breed: str
        """
        self.swagger_types = {
            'class_name': str,
            'color': str,
            'breed': str
        }

        self.attribute_map = {
            'class_name': 'className',
            'color': 'color',
            'breed': 'breed'
        }

        self._class_name = class_name
        self._color = color
        self._breed = breed

    @classmethod
    def from_dict(cls, dikt) -> 'Dog':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Dog of this Dog.  # noqa: E501
        :rtype: Dog
        """
        return util.deserialize_model(dikt, cls)

    @property
    def class_name(self) -> str:
        """Gets the class_name of this Dog.


        :return: The class_name of this Dog.
        :rtype: str
        """
        return self._class_name

    @class_name.setter
    def class_name(self, class_name: str):
        """Sets the class_name of this Dog.


        :param class_name: The class_name of this Dog.
        :type class_name: str
        """
        if class_name is None:
            raise ValueError("Invalid value for `class_name`, must not be `None`")  # noqa: E501

        self._class_name = class_name

    @property
    def color(self) -> str:
        """Gets the color of this Dog.


        :return: The color of this Dog.
        :rtype: str
        """
        return self._color

    @color.setter
    def color(self, color: str):
        """Sets the color of this Dog.


        :param color: The color of this Dog.
        :type color: str
        """

        self._color = color

    @property
    def breed(self) -> str:
        """Gets the breed of this Dog.


        :return: The breed of this Dog.
        :rtype: str
        """
        return self._breed

    @breed.setter
    def breed(self, breed: str):
        """Sets the breed of this Dog.


        :param breed: The breed of this Dog.
        :type breed: str
        """

        self._breed = breed
