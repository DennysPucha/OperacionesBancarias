

from django.urls import path

from Operaciones_Bancarias import views

urlpatterns = [
    path('', views.index, name='index'),
    path('login/', views.login, name='login'),
    path('register/', views.register, name='register'),
    path('support/', views.support, name='support'),
    path('dashboard-id/<int:cuenta_id>', views.dashboard_id, name='dashboard_id'),
    path('depositos-id/<int:cuenta_id>', views.depositos_id, name='depositos_id'),
    path('retiros-id/<int:cuenta_id>', views.retiros_id, name='retiros_id'),
    path('prestamos-id/<int:cuenta_id>', views.prestamos_id, name='prestamos_id'),
    path('transferencias-id/<int:cuenta_id>', views.transferencias_id, name='transferencias_id'),
]

