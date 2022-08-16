from django.http import HttpResponse
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
    template=loader.get_template('Interfaz/dashboard-id.html')
    context={}
    return HttpResponse(template.render(context, request))


def depositos_id(request, cuenta_id):
    template=loader.get_template('Interfaz/depositos-id.html')
    context={}
    return HttpResponse(template.render(context, request))


def retiros_id(request, cuenta_id):
    template=loader.get_template('Interfaz/retiros-id.html')
    context={}
    return HttpResponse(template.render(context, request))


def prestamos_id(request, cuenta_id):
    template=loader.get_template('Interfaz/prestamos-id.html')
    context={}
    return HttpResponse(template.render(context, request))


def transferencias_id(request, cuenta_id):
    template=loader.get_template('Interfaz/transferencias-id.html')
    context={}
    return HttpResponse(template.render(context, request))