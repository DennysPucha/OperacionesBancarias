# Generated by Django 4.0.6 on 2022-08-01 01:57

from django.db import migrations, models
import django.db.models.deletion


class Migration(migrations.Migration):

    initial = True

    dependencies = [
    ]

    operations = [
        migrations.CreateModel(
            name='Banco',
            fields=[
                ('id', models.BigAutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('Dirección', models.CharField(max_length=100)),
                ('Nombre', models.CharField(max_length=75)),
            ],
        ),
        migrations.CreateModel(
            name='Persona',
            fields=[
                ('id', models.BigAutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('Cedula', models.PositiveBigIntegerField()),
                ('Sexo', models.CharField(max_length=10)),
                ('Nombre', models.CharField(max_length=100)),
            ],
        ),
        migrations.CreateModel(
            name='Cliente',
            fields=[
                ('persona_ptr', models.OneToOneField(auto_created=True, on_delete=django.db.models.deletion.CASCADE, parent_link=True, primary_key=True, serialize=False, to='Operaciones_Bancarias.persona')),
                ('Correo', models.EmailField(max_length=100)),
                ('Nro_Cuenta', models.PositiveBigIntegerField()),
                ('Nro_Telefono', models.PositiveBigIntegerField()),
            ],
            bases=('Operaciones_Bancarias.persona',),
        ),
        migrations.CreateModel(
            name='Empleado',
            fields=[
                ('persona_ptr', models.OneToOneField(auto_created=True, on_delete=django.db.models.deletion.CASCADE, parent_link=True, primary_key=True, serialize=False, to='Operaciones_Bancarias.persona')),
                ('Cargo', models.CharField(max_length=100)),
            ],
            bases=('Operaciones_Bancarias.persona',),
        ),
        migrations.CreateModel(
            name='Registro',
            fields=[
                ('id', models.BigAutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('Contraseña', models.CharField(max_length=150)),
                ('Cliente_List', models.ForeignKey(on_delete=django.db.models.deletion.CASCADE, related_name='capitulo_list', to='Operaciones_Bancarias.cliente')),
            ],
        ),
    ]
