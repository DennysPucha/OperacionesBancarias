import pytest

from Operaciones_Bancarias.models import Cliente


@pytest.mark.django_db
def test_cliente_creation():
    cliente = Cliente.objects.create(
        Tipo_de_Cliente='Beneficiario',
        Correo='pruebaunitaria@gmail.com',
        Nro_Telefono='000515151',
    )
    assert cliente.id == 1
