package org.utec.modulo3.factoryMethod;

public abstract class CuentaFactory {

    public abstract CuentaBancaria crearCuenta();

    public void procesarCuenta() {
        CuentaBancaria cuenta = crearCuenta();
        cuenta.mostrarDetalles();
    }
}