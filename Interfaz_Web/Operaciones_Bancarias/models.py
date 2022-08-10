from django.db import models

class Banco(models.Model):
    Dirección= models.CharField(max_length=100)
    Nombre=models.CharField(max_length=75)


Tipo_de_Sexo_CHOICES = (
    ("Hombre", "Hombre"),
    ("Mujer", "Mujer"),
    ("Prefiero no decirlo", "Prefiero no decirlo"),
    )


class Persona(models.Model):
    Cedula=models.PositiveBigIntegerField()
    Tipo_de_Sexo = models.CharField(max_length=20,choices=Tipo_de_Sexo_CHOICES,default='Hombre')
    Nombre=models.CharField(max_length=100)

Tipo_de_Contrato_CHOICES = (
    ("Contrato por obra o labor", "Contrato por obra o labor"),
    ("Contrato de trabajo a término fijo", "Contrato de trabajo a término fijo"),
    ("Contrato de trabajo a término indefinido", "Contrato de trabajo a término indefinido"),
    ("Contrato de aprendizaje","Contrato de aprendizaje"),
    ("Contrato temporal, ocasional o accidental","Contrato temporal, ocasional o accidental"),
    )

class Empleado(Persona):
    Cargo=models.CharField(max_length=100)
    Tipo_de_Contrato=models.CharField(max_length=50,choices=Tipo_de_Contrato_CHOICES,default='Contrato por obra o labor')


Tipo_de_Cliente_CHOICES = (
    ("Benefactor", "Benefactor"),
    ("Beneficiario", "Beneficiario"),
    )


class Cliente(Persona):
    Correo=models.EmailField(max_length=100)
    Nro_Telefono=models.PositiveBigIntegerField()
    def __str__(Persona):
        return Persona.Nombre
    Tipo_de_Cliente=models.CharField(max_length=20,choices=Tipo_de_Cliente_CHOICES,default='Beneficiario')


class Registro(models.Model):
    Cliente_List=models.ForeignKey(Cliente,on_delete=models.CASCADE,related_name='cliente_list')
    Contraseña=models.CharField(max_length=150)

Tipo_de_Cuenta_CHOICES = (
    ("Corriente Personal", "Corriente Personal"),
    ("Corriente Colectiva", "Corriente Colectiva"),
    ("Corriente Coorporativa", "Corriente Coorporativa"),
    ("Corriente Entidad Pública", "Corriente Entidad Pública"),
    )

class Cuenta(models.Model):
    Cantidad_de_Dinero=models.FloatField(default=0)
    Generación_de_Intereses=models.BooleanField()
    Nro_Cuenta=models.BigIntegerField()
    Orientación_de_Cuenta=models.CharField(max_length=100,choices = Tipo_de_Cuenta_CHOICES,
                                           default = 'corriente personal')
    Cliente_List = models.ForeignKey(Cliente, on_delete=models.CASCADE, related_name='cl_list')


Tipo_de_Divisa_CHOICES = (
    ("Dolar", "Dolar"),
    ("Euro", "Euro"),
    ("Yen Japones", "Yen Japones"),
    ("Libra Esterlina", "Libra Esterlina"),
    ("Franco Suizo","Franco Suizo"),
    )
Tipo_de_Operacion_Bancaria_CHOICES = (
    ("Retiro", "Retiro"),
    ("Deposito", "Deposito"),
    ("Transferencia", "Transferencia"),
    )

class Solicitud(models.Model):
    Cliente=models.OneToOneField(Cliente, on_delete=models.CASCADE)
    Cuenta=models.OneToOneField(Cuenta, on_delete=models.CASCADE)
    Registro=models.OneToOneField(Registro, on_delete=models.CASCADE)
    Divisa=models.CharField(max_length=20,choices=Tipo_de_Divisa_CHOICES,default='Dolar')
    Operacion_Bancaria = models.CharField(max_length=20, choices=Tipo_de_Operacion_Bancaria_CHOICES, default='Transferencia')
    Monto=models.FloatField(max_length=7)


Tipo_de_Prestamo_Bancario_CHOICES = (
    ("Crédito productivo", "Crédito productivo"),
    ("Crédito Comercial Ordinario", "Crédito Comercial Ordinario"),
    ("Crédito Comercial Prioritario", "Crédito Comercial Prioritario"),
    ("Crédito de Consumo Ordinario", "Crédito de Consumo Ordinario"),
    ("Crédito Educativo", "Crédito Educativo"),
    )


class Prestamo(models.Model):
    Monto=models.FloatField()
    Plazo=models.IntegerField(help_text='meses')
    Tipo_de_Prestamo=models.CharField(max_length=40,choices=Tipo_de_Prestamo_Bancario_CHOICES,default='Crédito Educativo')
    ClienteList=models.ForeignKey(Cliente, on_delete=models.CASCADE, related_name='cliente_a_list')
    Divisa = models.CharField(max_length=20, choices=Tipo_de_Divisa_CHOICES, default='Dolar')

class Recibo(models.Model):
    Cliente=models.OneToOneField(Cliente, on_delete=models.CASCADE)
    Solicitud=models.ForeignKey(Solicitud, on_delete=models.CASCADE, related_name='slct_list')





