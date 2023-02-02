import connexion
import six

from swagger_server.models.client import Client  # noqa: E501
from swagger_server.models.enum_form_body import EnumFormBody  # noqa: E501
from swagger_server.models.fake_body import FakeBody  # noqa: E501
from swagger_server.models.fake_body1 import FakeBody1  # noqa: E501
from swagger_server.models.fake_json_form_data_body import FakeJsonFormDataBody  # noqa: E501
from swagger_server.models.outer_boolean import OuterBoolean  # noqa: E501
from swagger_server.models.outer_composite import OuterComposite  # noqa: E501
from swagger_server.models.outer_number import OuterNumber  # noqa: E501
from swagger_server.models.outer_string import OuterString  # noqa: E501
from swagger_server import util


def fake_outer_boolean_serialize(body=None):  # noqa: E501
    """fake_outer_boolean_serialize

    Test serialization of outer boolean types # noqa: E501

    :param body: Input boolean as post body
    :type body: dict | bytes

    :rtype: OuterBoolean
    """
    if connexion.request.is_json:
        body = bool.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def fake_outer_composite_serialize(body=None):  # noqa: E501
    """fake_outer_composite_serialize

    Test serialization of object with outer number type # noqa: E501

    :param body: Input composite as post body
    :type body: dict | bytes

    :rtype: OuterComposite
    """
    if connexion.request.is_json:
        body = OuterComposite.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def fake_outer_number_serialize(body=None):  # noqa: E501
    """fake_outer_number_serialize

    Test serialization of outer number types # noqa: E501

    :param body: Input number as post body
    :type body: dict | bytes

    :rtype: OuterNumber
    """
    if connexion.request.is_json:
        body = float.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def fake_outer_string_serialize(body=None):  # noqa: E501
    """fake_outer_string_serialize

    Test serialization of outer string types # noqa: E501

    :param body: Input string as post body
    :type body: dict | bytes

    :rtype: OuterString
    """
    if connexion.request.is_json:
        body = str.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def test_client_model(body):  # noqa: E501
    """To test \&quot;client\&quot; model

    To test \&quot;client\&quot; model # noqa: E501

    :param body: client model
    :type body: dict | bytes

    :rtype: Client
    """
    if connexion.request.is_json:
        body = Client.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def test_endpoint_parameters(body):  # noqa: E501
    """Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 

    Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트  # noqa: E501

    :param body: 
    :type body: dict | bytes

    :rtype: None
    """
    if connexion.request.is_json:
        body = FakeBody.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def test_enum_parameters(enum_header_string_array=None, enum_header_string=None, enum_query_string_array=None, enum_query_string=None, enum_query_integer=None):  # noqa: E501
    """To test enum parameters

    To test enum parameters # noqa: E501

    :param enum_header_string_array: Header parameter enum test (string array)
    :type enum_header_string_array: List[str]
    :param enum_header_string: Header parameter enum test (string)
    :type enum_header_string: str
    :param enum_query_string_array: Query parameter enum test (string array)
    :type enum_query_string_array: List[str]
    :param enum_query_string: Query parameter enum test (string)
    :type enum_query_string: str
    :param enum_query_integer: Query parameter enum test (double)
    :type enum_query_integer: int

    :rtype: None
    """
    return 'do some magic!'


def test_enum_request_body(body=None):  # noqa: E501
    """To test enum parameters

    To test enum parameters # noqa: E501

    :param body: 
    :type body: dict | bytes

    :rtype: None
    """
    if connexion.request.is_json:
        body = EnumFormBody.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def test_inline_additional_properties(body):  # noqa: E501
    """test inline additionalProperties

     # noqa: E501

    :param body: request body
    :type body: dict | bytes

    :rtype: None
    """
    if connexion.request.is_json:
        body = Dict[str, str].from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def test_json_form_data(body):  # noqa: E501
    """test json serialization of form data

     # noqa: E501

    :param body: 
    :type body: dict | bytes

    :rtype: None
    """
    if connexion.request.is_json:
        body = FakeJsonFormDataBody.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
