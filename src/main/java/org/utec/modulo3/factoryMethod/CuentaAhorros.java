package org.utec.modulo3.factoryMethod;

public class CuentaAhorros implements CuentaBancaria{
    @Override
    public void mostrarDetalles() {
        System.out.println("Cuenta de Ahorros, genera un interes pequeño pero no se permiten sobregiros.");

    }
}
