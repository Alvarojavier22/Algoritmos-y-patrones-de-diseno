package org.utec.modulo3.factoryMethod;

public class CuentaInversionFactory extends CuentaFactory {
    @Override
    public CuentaBancaria crearCuenta() {
        return new CuentaInversion();
    }
}
