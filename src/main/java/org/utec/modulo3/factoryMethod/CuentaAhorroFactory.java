package org.utec.modulo3.factoryMethod;

public class CuentaAhorroFactory extends CuentaFactory {

    @Override
    public CuentaBancaria crearCuenta() {
        return new CuentaAhorros();
    }
}
