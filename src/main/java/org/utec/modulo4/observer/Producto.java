package org.utec.modulo4.observer;

import java.util.ArrayList;
import java.util.List;

public class Producto {

    private List<Observador> observadores = new ArrayList<>();
    private String nombre;
    private boolean enOferta;

    public Producto(String nombre) {
        this.nombre = nombre;
    }
    public void agregarObservador(Observador observador) {
        observadores.add(observador);
    }
    public void eliminarObservador(Observador observador) {
        observadores.remove(observador);
    }
    public void setEnOferta(boolean enOferta) {
        this.enOferta = enOferta;
        notificarObservadores();
    }
    public void notificarObservadores() {
        String mensaje = enOferta ? nombre + " está en oferta. " : nombre + " ya no está en oferta.";
        for (Observador observador : observadores) {
            observador.actualizar(mensaje);
        }
    }
}
