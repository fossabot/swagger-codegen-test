# coding: utf-8

"""
    Swagger Petstore

    This is a sample Petstore server.  You can find out more about Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/).   # noqa: E501

    OpenAPI spec version: 1.0.0
    Contact: apiteam@swagger.io
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""

from __future__ import absolute_import

import unittest

import swagger_client
from swagger_client.api.store_api import StoreApi  # noqa: E501
from swagger_client.rest import ApiException


class TestStoreApi(unittest.TestCase):
    """StoreApi unit test stubs"""

    def setUp(self):
        self.api = StoreApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_delete_order(self):
        """Test case for delete_order

        Delete purchase order by ID  # noqa: E501
        """
        pass

    def test_get_inventory(self):
        """Test case for get_inventory

        Returns pet inventories by status  # noqa: E501
        """
        pass

    def test_get_order_by_id(self):
        """Test case for get_order_by_id

        Find purchase order by ID  # noqa: E501
        """
        pass

    def test_place_order(self):
        """Test case for place_order

        Place an order for a pet  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
