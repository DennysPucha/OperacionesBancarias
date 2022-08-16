import pytest

from Operaciones_Bancarias.models import Empleado


@pytest.mark.django_db
def test_empleado_creation():
    empleado = Empleado.objects.create(
        Cedula='1111111',
        Nombre='Prueba_Unitaria',
        Tipo_de_Sexo='Hombre',
        Tipo_de_Contrato='Contrato por obra o labor',
        Cargo='Prencista',

    )
    assert empleado.Nombre == 'Prueba_Unitaria'