package org.utec.modulo3.factoryMethod;

public class Main {
    public static void main(String[] args) {

        CuentaFactory cuentaCorrienteFactory = new CuentaCorrienteFactory();
        cuentaCorrienteFactory.procesarCuenta();

        CuentaFactory cuentaAhorroFactory = new CuentaAhorroFactory();
        cuentaAhorroFactory.procesarCuenta();

        CuentaFactory cuentaInversionFactory = new CuentaInversionFactory();
        cuentaInversionFactory.procesarCuenta();
    }
}
