package org.utec.modulo3.abstractFactory;

public class Coche implements Vehiculo {

    private String tipoVehiculo;
    private String tipoCombustible;
    private String color;

    public  Coche(String tipoVehiculo, String tipoCombustible, String color) {
        this.tipoVehiculo = tipoVehiculo;
        this.tipoCombustible = tipoCombustible;
        this.color = color;
    }
    public Coche(String tipoCombustible){
        this.tipoCombustible = tipoCombustible;
    }

    @Override
    public void especificaciones() {
        System.out.println("Coche que utiliza el combustible: " + tipoCombustible);

    }
}
