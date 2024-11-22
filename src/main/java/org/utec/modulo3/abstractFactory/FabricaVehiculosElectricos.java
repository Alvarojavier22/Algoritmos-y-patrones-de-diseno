package org.utec.modulo3.abstractFactory;

public class FabricaVehiculosElectricos implements FabricaDeVehiculos{
    @Override
    public Coche crearCoche() {
        return new Coche("Electricos");
    }

    @Override
    public Moto crearMoto() {
        return new Moto("Electricos");
    }

    @Override
    public Bote crearBote() {
        return new Bote("Electricos");
    }
}
