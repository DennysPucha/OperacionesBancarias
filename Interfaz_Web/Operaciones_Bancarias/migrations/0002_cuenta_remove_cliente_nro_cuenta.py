# Generated by Django 4.0.6 on 2022-08-01 02:20

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('Operaciones_Bancarias', '0001_initial'),
    ]

    operations = [
        migrations.CreateModel(
            name='Cuenta',
            fields=[
                ('id', models.BigAutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('Cantidad_de_Dinero', models.FloatField()),
                ('Generación_de_Intereses', models.BooleanField()),
                ('Nro_Cuenta', models.PositiveBigIntegerField()),
            ],
        ),
        migrations.RemoveField(
            model_name='cliente',
            name='Nro_Cuenta',
        ),
    ]
