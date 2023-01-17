# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from swagger_server.models.base_model_ import Model
from swagger_server import util


class EnumFormBody(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """
    def __init__(self, enum_form_string_array: List[str]=None, enum_form_string: str='-efg', enum_query_double: float=None):  # noqa: E501
        """EnumFormBody - a model defined in Swagger

        :param enum_form_string_array: The enum_form_string_array of this EnumFormBody.  # noqa: E501
        :type enum_form_string_array: List[str]
        :param enum_form_string: The enum_form_string of this EnumFormBody.  # noqa: E501
        :type enum_form_string: str
        :param enum_query_double: The enum_query_double of this EnumFormBody.  # noqa: E501
        :type enum_query_double: float
        """
        self.swagger_types = {
            'enum_form_string_array': List[str],
            'enum_form_string': str,
            'enum_query_double': float
        }

        self.attribute_map = {
            'enum_form_string_array': 'enum_form_string_array',
            'enum_form_string': 'enum_form_string',
            'enum_query_double': 'enum_query_double'
        }
        self._enum_form_string_array = enum_form_string_array
        self._enum_form_string = enum_form_string
        self._enum_query_double = enum_query_double

    @classmethod
    def from_dict(cls, dikt) -> 'EnumFormBody':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The enum_form_body of this EnumFormBody.  # noqa: E501
        :rtype: EnumFormBody
        """
        return util.deserialize_model(dikt, cls)

    @property
    def enum_form_string_array(self) -> List[str]:
        """Gets the enum_form_string_array of this EnumFormBody.

        Form parameter enum test (string array)  # noqa: E501

        :return: The enum_form_string_array of this EnumFormBody.
        :rtype: List[str]
        """
        return self._enum_form_string_array

    @enum_form_string_array.setter
    def enum_form_string_array(self, enum_form_string_array: List[str]):
        """Sets the enum_form_string_array of this EnumFormBody.

        Form parameter enum test (string array)  # noqa: E501

        :param enum_form_string_array: The enum_form_string_array of this EnumFormBody.
        :type enum_form_string_array: List[str]
        """
        allowed_values = [">", "$"]  # noqa: E501
        if not set(enum_form_string_array).issubset(set(allowed_values)):
            raise ValueError(
                "Invalid values for `enum_form_string_array` [{0}], must be a subset of [{1}]"  # noqa: E501
                .format(", ".join(map(str, set(enum_form_string_array) - set(allowed_values))),  # noqa: E501
                        ", ".join(map(str, allowed_values)))
            )

        self._enum_form_string_array = enum_form_string_array

    @property
    def enum_form_string(self) -> str:
        """Gets the enum_form_string of this EnumFormBody.

        Form parameter enum test (string)  # noqa: E501

        :return: The enum_form_string of this EnumFormBody.
        :rtype: str
        """
        return self._enum_form_string

    @enum_form_string.setter
    def enum_form_string(self, enum_form_string: str):
        """Sets the enum_form_string of this EnumFormBody.

        Form parameter enum test (string)  # noqa: E501

        :param enum_form_string: The enum_form_string of this EnumFormBody.
        :type enum_form_string: str
        """
        allowed_values = ["_abc", "-efg", "(xyz)"]  # noqa: E501
        if enum_form_string not in allowed_values:
            raise ValueError(
                "Invalid value for `enum_form_string` ({0}), must be one of {1}"
                .format(enum_form_string, allowed_values)
            )

        self._enum_form_string = enum_form_string

    @property
    def enum_query_double(self) -> float:
        """Gets the enum_query_double of this EnumFormBody.

        Query parameter enum test (double)  # noqa: E501

        :return: The enum_query_double of this EnumFormBody.
        :rtype: float
        """
        return self._enum_query_double

    @enum_query_double.setter
    def enum_query_double(self, enum_query_double: float):
        """Sets the enum_query_double of this EnumFormBody.

        Query parameter enum test (double)  # noqa: E501

        :param enum_query_double: The enum_query_double of this EnumFormBody.
        :type enum_query_double: float
        """
        allowed_values = ["1.1", "-1.2"]  # noqa: E501
        if enum_query_double not in allowed_values:
            raise ValueError(
                "Invalid value for `enum_query_double` ({0}), must be one of {1}"
                .format(enum_query_double, allowed_values)
            )

        self._enum_query_double = enum_query_double
