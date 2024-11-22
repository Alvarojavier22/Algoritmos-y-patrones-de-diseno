package org.utec.modulo4.observer;

public class Main {
    public static void main(String[] args) {

        Producto p = new Producto("Celular Blackberry");
        Producto p2 = new Producto("Tablet Galaxy");

        Cliente c1 = new Cliente("Alvaro");
        Cliente c2 = new Cliente("Javier");

        p.agregarObservador(c1);
        p2.agregarObservador(c2);

        p.setEnOferta(true);
        System.out.println();
        p.setEnOferta(false);

        p2.setEnOferta(true);
    }
}
