# Generated by Django 4.0.6 on 2022-08-01 02:40

from django.db import migrations, models
import django.db.models.deletion


class Migration(migrations.Migration):

    dependencies = [
        ('Operaciones_Bancarias', '0003_cuenta_cliente_list_alter_registro_cliente_list'),
    ]

    operations = [
        migrations.CreateModel(
            name='Solicitud',
            fields=[
                ('id', models.BigAutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('Cliente', models.OneToOneField(on_delete=django.db.models.deletion.CASCADE, to='Operaciones_Bancarias.cliente')),
                ('Cuenta', models.OneToOneField(on_delete=django.db.models.deletion.CASCADE, to='Operaciones_Bancarias.cuenta')),
                ('Registro', models.OneToOneField(on_delete=django.db.models.deletion.CASCADE, to='Operaciones_Bancarias.registro')),
            ],
        ),
    ]
