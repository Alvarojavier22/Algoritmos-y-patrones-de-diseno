package org.utec.modulo3.builder;



public class MainBuilder {
    public static void main(String[] args) {

        Director director = new Director();

        Vehiculo cocheElectrico = director.construirCocheElectrico(new Vehiculo.VehiculoBuilder());
        Vehiculo motoCombustion = director.construirMotocombustible(new Vehiculo.VehiculoBuilder());
        Vehiculo cocheCombustion = director.construirAutoCombustion(new Vehiculo.VehiculoBuilder());

        cocheElectrico.mostrarEspecificaciones();
        motoCombustion.mostrarEspecificaciones();
        cocheCombustion.mostrarEspecificaciones();
    }
}
