package org.utec.modulo3.abstractFactory;

public class FabricaVehiculosNafta implements FabricaDeVehiculos{
    @Override
    public Coche crearCoche() {
        return new Coche("SUV","Nafta", "Negro");
    }

    @Override
    public Moto crearMoto() {
        return new Moto("Nafta");
    }

    @Override
    public Bote crearBote() {
        return new Bote("Nafta");
    }
}
