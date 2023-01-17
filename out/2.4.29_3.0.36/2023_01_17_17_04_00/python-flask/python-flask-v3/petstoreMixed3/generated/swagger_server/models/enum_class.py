# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from swagger_server.models.base_model_ import Model
from swagger_server import util


class EnumClass(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    """
    allowed enum values
    """
    _ABC = "_abc"
    _EFG = "-efg"
    _XYZ_ = "(xyz)"
    def __init__(self):  # noqa: E501
        """EnumClass - a model defined in Swagger

        """
        self.swagger_types = {
        }

        self.attribute_map = {
        }

    @classmethod
    def from_dict(cls, dikt) -> 'EnumClass':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The EnumClass of this EnumClass.  # noqa: E501
        :rtype: EnumClass
        """
        return util.deserialize_model(dikt, cls)
