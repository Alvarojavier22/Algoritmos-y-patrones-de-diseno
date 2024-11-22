package org.utec.modulo3.abstractFactory;

public interface FabricaDeVehiculos {
    Coche crearCoche();
    Moto crearMoto();
    Bote crearBote();
}
