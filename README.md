Este proyecto simula una cuenta bancaria con múltiples cajeros utilizando hilos.

Se implementa synchronized en los métodos para evitar problemas de concurrencia.

Con sincronización:
Los hilos acceden al saldo de forma ordenada, evitando errores y resultados incorrectos.

Sin sincronización:
Los hilos pueden modificar el saldo al mismo tiempo, causando inconsistencias como retirar más dinero del disponible.

También se usa una excepción personalizada (SaldoInsuficienteException) para controlar cuando se intenta retirar más dinero del saldo disponible.
Se implementa una excepción personalizada llamada SaldoInsuficienteException.

Esta se lanza cuando un cajero intenta retirar un monto mayor al saldo disponible.

Esto permite controlar errores de forma clara y evitar que el programa falle inesperadamente.
