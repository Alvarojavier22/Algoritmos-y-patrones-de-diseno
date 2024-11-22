package org.utec.modulo3.factoryMethod;

public class CuentaCorriente implements CuentaBancaria{
    @Override
    public void mostrarDetalles() {
        System.out.println("Cuenta Corriente, permite sobregiros, no genera intereses.");
    }
}
