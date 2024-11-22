package org.utec.modulo3.builder;

public class Vehiculo {

    private String tipoVehiculo;
    private String color;
    private String tipoCombustible;

    private Vehiculo(VehiculoBuilder builder){
        this.tipoVehiculo = builder.tipoVehiculo;
        this.tipoCombustible = builder.tipoCombustible;
        this.color = builder.color;
    }
    public void mostrarEspecificaciones(){
        System.out.println(tipoVehiculo + " de combustible: " + tipoCombustible + " y color: " + color);
    }
    public static class VehiculoBuilder{
        private String tipoVehiculo;
        private String color;
        private String tipoCombustible;

        public VehiculoBuilder setTipoVehiculo(String tipoVehiculo){
            this.tipoVehiculo = tipoVehiculo;
            return this;
        }
        public VehiculoBuilder setTipoCombustible(String tipoCombustible){
            this.tipoCombustible = tipoCombustible;
            return this;
        }
        public VehiculoBuilder setColor(String color){
            this.color = color;
            return this;
        }
        public Vehiculo build(){
            return new Vehiculo(this);
        }
    }
}
