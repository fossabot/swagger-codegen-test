# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from swagger_server.models.base_model_ import Model
from swagger_server.models.outer_boolean import OuterBoolean  # noqa: F401,E501
from swagger_server.models.outer_number import OuterNumber  # noqa: F401,E501
from swagger_server.models.outer_string import OuterString  # noqa: F401,E501
from swagger_server import util


class OuterComposite(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, my_number: OuterNumber=None, my_string: OuterString=None, my_boolean: OuterBoolean=None):  # noqa: E501
        """OuterComposite - a model defined in Swagger

        :param my_number: The my_number of this OuterComposite.  # noqa: E501
        :type my_number: OuterNumber
        :param my_string: The my_string of this OuterComposite.  # noqa: E501
        :type my_string: OuterString
        :param my_boolean: The my_boolean of this OuterComposite.  # noqa: E501
        :type my_boolean: OuterBoolean
        """
        self.swagger_types = {
            'my_number': OuterNumber,
            'my_string': OuterString,
            'my_boolean': OuterBoolean
        }

        self.attribute_map = {
            'my_number': 'my_number',
            'my_string': 'my_string',
            'my_boolean': 'my_boolean'
        }

        self._my_number = my_number
        self._my_string = my_string
        self._my_boolean = my_boolean

    @classmethod
    def from_dict(cls, dikt) -> 'OuterComposite':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The OuterComposite of this OuterComposite.  # noqa: E501
        :rtype: OuterComposite
        """
        return util.deserialize_model(dikt, cls)

    @property
    def my_number(self) -> OuterNumber:
        """Gets the my_number of this OuterComposite.


        :return: The my_number of this OuterComposite.
        :rtype: OuterNumber
        """
        return self._my_number

    @my_number.setter
    def my_number(self, my_number: OuterNumber):
        """Sets the my_number of this OuterComposite.


        :param my_number: The my_number of this OuterComposite.
        :type my_number: OuterNumber
        """

        self._my_number = my_number

    @property
    def my_string(self) -> OuterString:
        """Gets the my_string of this OuterComposite.


        :return: The my_string of this OuterComposite.
        :rtype: OuterString
        """
        return self._my_string

    @my_string.setter
    def my_string(self, my_string: OuterString):
        """Sets the my_string of this OuterComposite.


        :param my_string: The my_string of this OuterComposite.
        :type my_string: OuterString
        """

        self._my_string = my_string

    @property
    def my_boolean(self) -> OuterBoolean:
        """Gets the my_boolean of this OuterComposite.


        :return: The my_boolean of this OuterComposite.
        :rtype: OuterBoolean
        """
        return self._my_boolean

    @my_boolean.setter
    def my_boolean(self, my_boolean: OuterBoolean):
        """Sets the my_boolean of this OuterComposite.


        :param my_boolean: The my_boolean of this OuterComposite.
        :type my_boolean: OuterBoolean
        """

        self._my_boolean = my_boolean
