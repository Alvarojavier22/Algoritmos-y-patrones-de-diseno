package org.utec.modulo3.builder;

public class Director {

    public Vehiculo construirCocheElectrico(Vehiculo.VehiculoBuilder builder) {
        return builder.setTipoVehiculo("Coche")
                .setTipoCombustible("electrico")
                .setColor("Blanco")
                .build();
    }
    public Vehiculo construirMotocombustible(Vehiculo.VehiculoBuilder builder) {
        return builder.setTipoVehiculo("Moto")
                .setTipoCombustible("Electrica")
                .setColor("Roja")
                .build();
    }
    public Vehiculo construirAutoCombustion(Vehiculo.VehiculoBuilder builder) {
        return builder.setTipoVehiculo("Auto")
                .setTipoCombustible("Nafta")
                .setColor("Negro")
                .build();
    }
}
