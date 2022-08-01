
from django.db import models

class Banco(models.Model):
    Dirección= models.CharField(max_length=100)
    Nombre=models.CharField(max_length=75)

class Persona(models.Model):
    Cedula=models.PositiveBigIntegerField()
    Sexo = models.CharField(max_length=10)#TODO tipo de Sexo
    Nombre=models.CharField(max_length=100)

class Empleado(Persona):
    Cargo=models.CharField(max_length=100)  #TODO tipo de Contrato


class Cliente(Persona):
    Correo=models.EmailField(max_length=100)
    Nro_Telefono=models.PositiveBigIntegerField()
    def __str__(Persona):
        return Persona.Nombre
    #Tipo_de_Cliente=models. TODO tipo de Cliente


class Registro(models.Model):
    Cliente_List=models.ForeignKey(Cliente,on_delete=models.CASCADE,related_name='cliente_list')
    Contraseña=models.CharField(max_length=150)


class Cuenta(models.Model):
    Cantidad_de_Dinero=models.FloatField()
    Generación_de_Intereses=models.BooleanField()
    Nro_Cuenta=models.PositiveBigIntegerField() # TODO metodo de Asignacion automatica
    #Orientacion_de_Cuenta=models.model #TODO tipo de cuenta
    Cliente_List = models.ForeignKey(Cliente, on_delete=models.CASCADE, related_name='cl_list')


class Solicitud(models.Model):
    Cliente=models.OneToOneField(Cliente, on_delete=models.CASCADE)
    Cuenta=models.OneToOneField(Cuenta, on_delete=models.CASCADE)
    Registro=models.OneToOneField(Registro, on_delete=models.CASCADE)

class Prestamo(models.Model):
    Monto=models.FloatField()
    Plazo=models.IntegerField(help_text='meses')
    Tipo_de_Prestamo=models.CharField(max_length=100)
    Solicitud=models.ForeignKey(Solicitud, on_delete=models.CASCADE, related_name='solicitud_list')

class Recibo(models.Model):
    Cliente=models.OneToOneField(Cliente, on_delete=models.CASCADE)
    Solicitud=models.ForeignKey(Solicitud, on_delete=models.CASCADE, related_name='slct_list')

#class Divisa:
#TODO GENERAR TIPO DE DIVISA

#Operacion Bancaria
#TODO TIPO DE OPERACION BANCARIA




