package org.utec.modulo3.factoryMethod;

public class CuentaCorrienteFactory extends CuentaFactory {
    @Override
    public CuentaBancaria crearCuenta() {
        return new CuentaCorriente();
    }
}
