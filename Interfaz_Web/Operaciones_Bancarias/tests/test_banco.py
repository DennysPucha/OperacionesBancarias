import pytest

from Operaciones_Bancarias.models import Banco


@pytest.mark.django_db
def test_cliente_creation():
    banco = Banco.objects.create(
        Nombre='Banco_ejemplo',
        Dirección='av.nn',
    )
    assert Banco.id == 1
