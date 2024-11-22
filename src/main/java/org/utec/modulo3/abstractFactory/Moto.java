package org.utec.modulo3.abstractFactory;

public class Moto implements Vehiculo{

    private String tipoCombustible;

    public Moto(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    @Override
    public void especificaciones() {
        System.out.println("Moto que utiliza combustible: " + tipoCombustible);
    }
}
