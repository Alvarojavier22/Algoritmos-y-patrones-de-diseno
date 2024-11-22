package org.utec.modulo4.observer;

import java.util.Observer;

public class Cliente implements Observador {

    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actualizar(String mensaje) {
        System.out.println(nombre + ": recibió la notificación " + mensaje);
    }
}
