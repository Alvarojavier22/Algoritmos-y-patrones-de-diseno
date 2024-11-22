package org.utec.modulo4.facade;

public class HomeTheatreFacade {
    private Pantalla pantalla;
    private BluRay bluRay;
    private Proyector proyector;
    private SistemaSonido sistemaSonido;

    public HomeTheatreFacade(Pantalla pantalla, BluRay bluRay, Proyector proyector, SistemaSonido sistemaSonido) {
        this.pantalla = pantalla;
        this.bluRay = bluRay;
        this.proyector = proyector;
        this.sistemaSonido = sistemaSonido;
    }
    public void iniciarCine(){
        System.out.println("Iniciando Cine en casa");
        pantalla.bajar();
        sistemaSonido.encender();
        sistemaSonido.configurarVolumen(40);
        proyector.encender();
        bluRay.reproducir();
        System.out.println("Disfruta de tu peli");
    }
    public void terminarCine(){
        System.out.println("Terminando Cine en casa");
        bluRay.detener();
        proyector.apagar();
        sistemaSonido.apagar();
        pantalla.subir();
        System.out.println("Cine en casa finalizado");
    }
}
