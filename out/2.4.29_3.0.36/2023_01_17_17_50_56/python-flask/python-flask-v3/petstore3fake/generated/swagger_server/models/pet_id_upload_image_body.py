# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from swagger_server.models.base_model_ import Model
from swagger_server import util


class PetIdUploadImageBody(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """
    def __init__(self, additional_metadata: str=None, file: str=None):  # noqa: E501
        """PetIdUploadImageBody - a model defined in Swagger

        :param additional_metadata: The additional_metadata of this PetIdUploadImageBody.  # noqa: E501
        :type additional_metadata: str
        :param file: The file of this PetIdUploadImageBody.  # noqa: E501
        :type file: str
        """
        self.swagger_types = {
            'additional_metadata': str,
            'file': str
        }

        self.attribute_map = {
            'additional_metadata': 'additionalMetadata',
            'file': 'file'
        }
        self._additional_metadata = additional_metadata
        self._file = file

    @classmethod
    def from_dict(cls, dikt) -> 'PetIdUploadImageBody':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The petId_uploadImage_body of this PetIdUploadImageBody.  # noqa: E501
        :rtype: PetIdUploadImageBody
        """
        return util.deserialize_model(dikt, cls)

    @property
    def additional_metadata(self) -> str:
        """Gets the additional_metadata of this PetIdUploadImageBody.

        Additional data to pass to server  # noqa: E501

        :return: The additional_metadata of this PetIdUploadImageBody.
        :rtype: str
        """
        return self._additional_metadata

    @additional_metadata.setter
    def additional_metadata(self, additional_metadata: str):
        """Sets the additional_metadata of this PetIdUploadImageBody.

        Additional data to pass to server  # noqa: E501

        :param additional_metadata: The additional_metadata of this PetIdUploadImageBody.
        :type additional_metadata: str
        """

        self._additional_metadata = additional_metadata

    @property
    def file(self) -> str:
        """Gets the file of this PetIdUploadImageBody.

        file to upload  # noqa: E501

        :return: The file of this PetIdUploadImageBody.
        :rtype: str
        """
        return self._file

    @file.setter
    def file(self, file: str):
        """Sets the file of this PetIdUploadImageBody.

        file to upload  # noqa: E501

        :param file: The file of this PetIdUploadImageBody.
        :type file: str
        """

        self._file = file
