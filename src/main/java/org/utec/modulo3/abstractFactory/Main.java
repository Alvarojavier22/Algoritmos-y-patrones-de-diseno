package org.utec.modulo3.abstractFactory;

public class Main {
    public static void main(String[] args) {

        FabricaDeVehiculos fabricaNafta = new FabricaVehiculosNafta();
        FabricaDeVehiculos fabricaElectricos = new FabricaVehiculosElectricos();

        Vehiculo cocheNafta = fabricaNafta.crearCoche();
        Vehiculo motoNafta = fabricaNafta.crearMoto();

        Vehiculo boteNafta = fabricaNafta.crearBote();

        Vehiculo cocheElectrico = fabricaElectricos.crearCoche();
        Vehiculo motoElectrico = fabricaElectricos.crearMoto();

        Vehiculo boteElectrico = fabricaElectricos.crearBote();

        cocheNafta.especificaciones();
        cocheElectrico.especificaciones();
        motoNafta.especificaciones();
        boteNafta.especificaciones();
        boteElectrico.especificaciones();
        motoElectrico.especificaciones();
    }
}
