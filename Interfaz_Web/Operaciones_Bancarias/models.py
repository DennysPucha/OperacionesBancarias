from django.db import models

class Banco(models.Model):
    Dirección= models.CharField(max_length=100)
    Nombre=models.CharField(max_length=75)

class Persona(models.Model):
    Cédula=models.DecimalField(decimal_places=1,max_digits=11)
    Nombre=models.CharField(max_length=100)
    # class Sexo():
    #     Hombre=models.CharField(max_length=50)
    #     Mujer=models.CharField(max_length=50)
    #     No_Binario=models.CharField(max_length=50)
