package org.utec.modulo3.factoryMethod;

public class CuentaInversion implements CuentaBancaria{
    @Override
    public void mostrarDetalles() {
        System.out.println("Cuenta Inversion, genera altos intereses, teniendo restricciones en el retiro.");
    }
}
