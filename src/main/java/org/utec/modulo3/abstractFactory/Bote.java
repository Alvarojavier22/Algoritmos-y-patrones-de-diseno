package org.utec.modulo3.abstractFactory;

public class Bote implements Vehiculo{

    private String tipoCombustible;

    public Bote(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    @Override
    public void especificaciones() {
        System.out.println("Bote utiliza el combustible: " + tipoCombustible);
    }
}
