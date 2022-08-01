from django.contrib import admin

from Operaciones_Bancarias.models import Banco, Persona, Empleado, Cliente, Registro, Cuenta, Solicitud, Prestamo, \
    Recibo

admin.site.register(Banco)
admin.site.register(Empleado)
admin.site.register(Cliente)
admin.site.register(Registro)
admin.site.register(Cuenta)
admin.site.register(Solicitud)
admin.site.register(Prestamo)
admin.site.register(Recibo)