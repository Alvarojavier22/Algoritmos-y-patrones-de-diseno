package org.utec.modulo1;

import java.util.LinkedList;
import java.util.Queue;

public class EjemploQueue {

    public static void main(String[] args) {
        Queue<String> cola = new LinkedList<>();

        cola.add("Persona 1");
        cola.add("Persona 2");
        cola.add("Persona 3");
        cola.add("Persona 4");
        cola.add("Persona 5");

        System.out.println("Elemento atendido: " + cola.poll());

        System.out.println("Siguiente en la cola: " + cola.peek());

        cola.offer("Persona 6");

        System.out.println("Elementos en la cola: ");
        for (String persona : cola) {
            System.out.println(persona);
        }
        System.out.println("El tamaño de la cola es : " + cola.size());

        System.out.println("La cola está vacia? : " + cola.isEmpty());
    }
}
