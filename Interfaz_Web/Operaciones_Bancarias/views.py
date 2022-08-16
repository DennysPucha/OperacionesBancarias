from django.http import HttpResponse
from django.shortcuts import render, get_object_or_404
from django.template import loader

from Operaciones_Bancarias.models import Cuenta


def index(request):
    template=loader.get_template('Interfaz/index.html')
    context={}
    return HttpResponse(template.render(context, request))


def login(request):
    template=loader.get_template('Interfaz/login.html')
    context={}
    return HttpResponse(template.render(context, request))


def register(request):
    template=loader.get_template('Interfaz/register.html')
    context={}
    return HttpResponse(template.render(context, request))


def support(request):
    template=loader.get_template('Interfaz/support.html')
    context={}
    return HttpResponse(template.render(context, request))


def dashboard_id(request,cuenta_id):
    cuenta=get_object_or_404(Cuenta,pk=cuenta_id)

    context = {
        'cuenta':cuenta,
    }
    return render(request, 'Interfaz/dashboard-id.html', context)


def depositos_id(request, cuenta_id):
    cuenta=get_object_or_404(Cuenta,pk=cuenta_id)

    context = {
        'cuenta':cuenta,
    }
    return render(request, 'Interfaz/depositos-id.html', context)


def retiros_id(request, cuenta_id):
    cuenta=get_object_or_404(Cuenta,pk=cuenta_id)

    context = {
        'cuenta':cuenta,
    }
    return render(request, 'Interfaz/retiros-id.html', context)


def prestamos_id(request, cuenta_id):
    cuenta=get_object_or_404(Cuenta,pk=cuenta_id)

    context = {
        'cuenta':cuenta,
    }
    return render(request, 'Interfaz/prestamos-id.html', context)


def transferencias_id(request, cuenta_id):
    cuenta=get_object_or_404(Cuenta,pk=cuenta_id)

    context = {
        'cuenta':cuenta,
    }
    return render(request, 'Interfaz/transferencias-id.html', context)