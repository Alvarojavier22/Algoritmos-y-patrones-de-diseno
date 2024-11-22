package org.utec.modulo4.facade;

public class Main {
    public static void main(String[] args) {
        Proyector proyector = new Proyector();
        BluRay bluRay = new BluRay();
        Pantalla pantalla = new Pantalla();
        SistemaSonido sistemaSonido = new SistemaSonido();

        HomeTheatreFacade facade = new HomeTheatreFacade(pantalla, bluRay, proyector, sistemaSonido);

        facade.iniciarCine();
        System.out.println("");
        facade.terminarCine();
    }
}
