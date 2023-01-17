# coding: utf-8

"""
    Swagger Petstore

    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501

    OpenAPI spec version: 1.0.0
    Contact: apiteam@swagger.io
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""

from __future__ import absolute_import

import unittest

import swagger_client
from swagger_client.api.parrot_api import ParrotApi  # noqa: E501
from swagger_client.rest import ApiException


class TestParrotApi(unittest.TestCase):
    """ParrotApi unit test stubs"""

    def setUp(self):
        self.api = ParrotApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_add_parrot(self):
        """Test case for add_parrot

        Add a new parrow to the store  # noqa: E501
        """
        pass

    def test_get_parrots(self):
        """Test case for get_parrots

        get Parrots  # noqa: E501
        """
        pass

    def test_update_parrots(self):
        """Test case for update_parrots

        update parrots  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
