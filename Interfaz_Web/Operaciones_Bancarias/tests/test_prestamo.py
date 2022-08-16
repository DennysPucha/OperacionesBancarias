import pytest

from Operaciones_Bancarias.models import Prestamo


@pytest.mark.django_db
def test_cliente_creation():
    prestamo = Prestamo.objects.create(
        Divisa='Dolar',
        Tipo_de_Prestamo='Estudiantil',
        Monto='10000',
        Plazo='12',

    )
    assert prestamo.plazo == '12'