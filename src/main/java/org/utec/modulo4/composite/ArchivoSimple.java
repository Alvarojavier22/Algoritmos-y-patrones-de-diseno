package org.utec.modulo4.composite;

public class ArchivoSimple implements Archivo {

    private String nombre;

    public ArchivoSimple(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Archivos: " + nombre);
    }
}
