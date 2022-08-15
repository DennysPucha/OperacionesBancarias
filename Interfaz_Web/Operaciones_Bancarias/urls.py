from django.urls import path

from Operaciones_Bancarias import views

urlpatterns = [
    path('', views.index, name='index')
]