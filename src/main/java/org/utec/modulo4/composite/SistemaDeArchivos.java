package org.utec.modulo4.composite;

public class SistemaDeArchivos {
    public static void main(String[] args) {

        Archivo a = new ArchivoSimple("Archivo Simple.txt");
        Archivo b = new ArchivoSimple("Archivo Simple.png");

        Carpeta c = new Carpeta("Mis documentos");

        c.agregarArchivo(a);
        c.agregarArchivo(b);

        c.mostrarDetalles();
    }
}
