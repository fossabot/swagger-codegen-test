# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from swagger_server.models.base_model_ import Model
from swagger_server import util


class Numbers(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    """
    allowed enum values
    """
    _7 = "7"
    _8 = "8"
    _9 = "9"
    _10 = "10"

    def __init__(self):  # noqa: E501
        """Numbers - a model defined in Swagger

        """
        self.swagger_types = {
        }

        self.attribute_map = {
        }

    @classmethod
    def from_dict(cls, dikt) -> 'Numbers':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Numbers of this Numbers.  # noqa: E501
        :rtype: Numbers
        """
        return util.deserialize_model(dikt, cls)
